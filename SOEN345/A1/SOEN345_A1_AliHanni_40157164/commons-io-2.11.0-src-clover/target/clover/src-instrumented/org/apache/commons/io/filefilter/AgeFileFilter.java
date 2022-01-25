/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.file.PathUtils;

/**
 * Filters files based on a cutoff time, can filter either newer files or files equal to or older.
 * <p>
 * For example, to print all files and directories in the current directory older than one day:
 * </p>
 * <h2>Using Classic IO</h2>
 * <pre>
 * Path dir = Paths.get("");
 * // We are interested in files older than one day
 * long cutoff = System.currentTimeMillis() - (24 * 60 * 60 * 1000);
 * String[] files = dir.list(new AgeFileFilter(cutoff));
 * for (String file : files) {
 *     System.out.println(file);
 * }
 * </pre>
 *
 * <h2>Using NIO</h2>
 * <pre>
 * Path dir = Paths.get("");
 * // We are interested in files older than one day
 * long cutoff = System.currentTimeMillis() - (24 * 60 * 60 * 1000);
 * AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(new AgeFileFilter(cutoff));
 * //
 * // Walk one dir
 * Files.<b>walkFileTree</b>(dir, Collections.emptySet(), 1, visitor);
 * System.out.println(visitor.getPathCounters());
 * System.out.println(visitor.getFileList());
 * //
 * visitor.getPathCounters().reset();
 * //
 * // Walk dir tree
 * Files.<b>walkFileTree</b>(dir, visitor);
 * System.out.println(visitor.getPathCounters());
 * System.out.println(visitor.getDirList());
 * System.out.println(visitor.getFileList());
 * </pre>
 *
 * @see FileFilterUtils#ageFileFilter(Date)
 * @see FileFilterUtils#ageFileFilter(File)
 * @see FileFilterUtils#ageFileFilter(long)
 * @see FileFilterUtils#ageFileFilter(Date, boolean)
 * @see FileFilterUtils#ageFileFilter(File, boolean)
 * @see FileFilterUtils#ageFileFilter(long, boolean)
 * @since 1.2
 */
public class AgeFileFilter extends AbstractFileFilter implements Serializable {public static class __CLR4_4_13dq3dqkylvdzbi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -2132740084016138541L;

    /** Whether the files accepted will be older or newer. */
    private final boolean acceptOlder;

    /** The cutoff time threshold measured in milliseconds since the epoch (00:00:00 GMT, January 1, 1970). */
    private final long cutoffMillis;

    /**
     * Constructs a new age file filter for files older than (at or before) a certain cutoff date.
     *
     * @param cutoffDate the threshold age of the files
     */
    public AgeFileFilter(final Date cutoffDate) {
        this(cutoffDate, true);__CLR4_4_13dq3dqkylvdzbi.R.inc(4383);try{__CLR4_4_13dq3dqkylvdzbi.R.inc(4382);
    }finally{__CLR4_4_13dq3dqkylvdzbi.R.flushNeeded();}}

    /**
     * Constructs a new age file filter for files on any one side of a certain cutoff date.
     *
     * @param cutoffDate the threshold age of the files
     * @param acceptOlder if true, older files (at or before the cutoff) are accepted, else newer ones (after the
     *        cutoff).
     */
    public AgeFileFilter(final Date cutoffDate, final boolean acceptOlder) {
        this(cutoffDate.getTime(), acceptOlder);__CLR4_4_13dq3dqkylvdzbi.R.inc(4385);try{__CLR4_4_13dq3dqkylvdzbi.R.inc(4384);
    }finally{__CLR4_4_13dq3dqkylvdzbi.R.flushNeeded();}}

    /**
     * Constructs a new age file filter for files older than (at or before) a certain File (whose last modification time
     * will be used as reference).
     *
     * @param cutoffReference the file whose last modification time is used as the threshold age of the files
     */
    public AgeFileFilter(final File cutoffReference) {
        this(cutoffReference, true);__CLR4_4_13dq3dqkylvdzbi.R.inc(4387);try{__CLR4_4_13dq3dqkylvdzbi.R.inc(4386);
    }finally{__CLR4_4_13dq3dqkylvdzbi.R.flushNeeded();}}

    /**
     * Constructs a new age file filter for files on any one side of a certain File (whose last modification time will
     * be used as reference).
     *
     * @param cutoffReference the file whose last modification time is used as the threshold age of the files
     * @param acceptOlder if true, older files (at or before the cutoff) are accepted, else newer ones (after the
     *        cutoff).
     */
    public AgeFileFilter(final File cutoffReference, final boolean acceptOlder) {
        this(FileUtils.lastModifiedUnchecked(cutoffReference), acceptOlder);__CLR4_4_13dq3dqkylvdzbi.R.inc(4389);try{__CLR4_4_13dq3dqkylvdzbi.R.inc(4388);
    }finally{__CLR4_4_13dq3dqkylvdzbi.R.flushNeeded();}}

    /**
     * Constructs a new age file filter for files equal to or older than a certain cutoff
     *
     * @param cutoffMillis The cutoff time threshold measured in milliseconds since the epoch (00:00:00 GMT, January 1,
     *        1970).
     */
    public AgeFileFilter(final long cutoffMillis) {
        this(cutoffMillis, true);__CLR4_4_13dq3dqkylvdzbi.R.inc(4391);try{__CLR4_4_13dq3dqkylvdzbi.R.inc(4390);
    }finally{__CLR4_4_13dq3dqkylvdzbi.R.flushNeeded();}}

    /**
     * Constructs a new age file filter for files on any one side of a certain cutoff.
     *
     * @param cutoffMillis The cutoff time threshold measured in milliseconds since the epoch (00:00:00 GMT, January 1,
     *        1970).
     * @param acceptOlder if true, older files (at or before the cutoff) are accepted, else newer ones (after the
     *        cutoff).
     */
    public AgeFileFilter(final long cutoffMillis, final boolean acceptOlder) {try{__CLR4_4_13dq3dqkylvdzbi.R.inc(4392);
        __CLR4_4_13dq3dqkylvdzbi.R.inc(4393);this.acceptOlder = acceptOlder;
        __CLR4_4_13dq3dqkylvdzbi.R.inc(4394);this.cutoffMillis = cutoffMillis;
    }finally{__CLR4_4_13dq3dqkylvdzbi.R.flushNeeded();}}

    /**
     * Checks to see if the last modification of the file matches cutoff favorably.
     * <p>
     * If last modification time equals cutoff and newer files are required, file <b>IS NOT</b> selected. If last
     * modification time equals cutoff and older files are required, file <b>IS</b> selected.
     * </p>
     *
     * @param file the File to check
     * @return true if the file name matches
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13dq3dqkylvdzbi.R.inc(4395);
        __CLR4_4_13dq3dqkylvdzbi.R.inc(4396);final boolean newer = FileUtils.isFileNewer(file, cutoffMillis);
        __CLR4_4_13dq3dqkylvdzbi.R.inc(4397);return acceptOlder != newer;
    }finally{__CLR4_4_13dq3dqkylvdzbi.R.flushNeeded();}}

    /**
     * Checks to see if the last modification of the file matches cutoff favorably.
     * <p>
     * If last modification time equals cutoff and newer files are required, file <b>IS NOT</b> selected. If last
     * modification time equals cutoff and older files are required, file <b>IS</b> selected.
     * </p>
     * @param file the File to check
     *
     * @return true if the file name matches
     * @since 2.9.0
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_13dq3dqkylvdzbi.R.inc(4398);
        __CLR4_4_13dq3dqkylvdzbi.R.inc(4399);final boolean newer;
        __CLR4_4_13dq3dqkylvdzbi.R.inc(4400);try {
            __CLR4_4_13dq3dqkylvdzbi.R.inc(4401);newer = PathUtils.isNewer(file, cutoffMillis);
        } catch (final IOException e) {
            __CLR4_4_13dq3dqkylvdzbi.R.inc(4402);return handle(e);
        }
        __CLR4_4_13dq3dqkylvdzbi.R.inc(4403);return toFileVisitResult(acceptOlder != newer, file);
    }finally{__CLR4_4_13dq3dqkylvdzbi.R.flushNeeded();}}

    /**
     * Provide a String representation of this file filter.
     *
     * @return a String representation
     */
    @Override
    public String toString() {try{__CLR4_4_13dq3dqkylvdzbi.R.inc(4404);
        __CLR4_4_13dq3dqkylvdzbi.R.inc(4405);final String condition = (((acceptOlder )&&(__CLR4_4_13dq3dqkylvdzbi.R.iget(4406)!=0|true))||(__CLR4_4_13dq3dqkylvdzbi.R.iget(4407)==0&false))? "<=" : ">";
        __CLR4_4_13dq3dqkylvdzbi.R.inc(4408);return super.toString() + "(" + condition + cutoffMillis + ")";
    }finally{__CLR4_4_13dq3dqkylvdzbi.R.flushNeeded();}}
}
