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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Filters files based on size, can filter either smaller files or
 * files equal to or larger than a given threshold.
 * <p>
 * For example, to print all files and directories in the
 * current directory whose size is greater than 1 MB:
 * </p>
 * <h2>Using Classic IO</h2>
 * <pre>
 * File dir = new File(".");
 * String[] files = dir.list(new SizeFileFilter(1024 * 1024));
 * for (String file : files) {
 *     System.out.println(file);
 * }
 * </pre>
 *
 * <h2>Using NIO</h2>
 * <pre>
 * final Path dir = Paths.get("");
 * final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(new SizeFileFilter(1024 * 1024));
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
 * @since 1.2
 * @see FileFilterUtils#sizeFileFilter(long)
 * @see FileFilterUtils#sizeFileFilter(long, boolean)
 * @see FileFilterUtils#sizeRangeFileFilter(long, long)
 */
public class SizeFileFilter extends AbstractFileFilter implements Serializable {public static class __CLR4_4_13x63x6kylvdzle{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5106,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 7388077430788600069L;

    /** Whether the files accepted will be larger or smaller. */
    private final boolean acceptLarger;

    /** The size threshold. */
    private final long size;

    /**
     * Constructs a new size file filter for files equal to or
     * larger than a certain size.
     *
     * @param size  the threshold size of the files
     * @throws IllegalArgumentException if the size is negative
     */
    public SizeFileFilter(final long size) {
        this(size, true);__CLR4_4_13x63x6kylvdzle.R.inc(5083);try{__CLR4_4_13x63x6kylvdzle.R.inc(5082);
    }finally{__CLR4_4_13x63x6kylvdzle.R.flushNeeded();}}

    /**
     * Constructs a new size file filter for files based on a certain size
     * threshold.
     *
     * @param size  the threshold size of the files
     * @param acceptLarger  if true, files equal to or larger are accepted,
     * otherwise smaller ones (but not equal to)
     * @throws IllegalArgumentException if the size is negative
     */
    public SizeFileFilter(final long size, final boolean acceptLarger) {try{__CLR4_4_13x63x6kylvdzle.R.inc(5084);
        __CLR4_4_13x63x6kylvdzle.R.inc(5085);if ((((size < 0)&&(__CLR4_4_13x63x6kylvdzle.R.iget(5086)!=0|true))||(__CLR4_4_13x63x6kylvdzle.R.iget(5087)==0&false))) {{
            __CLR4_4_13x63x6kylvdzle.R.inc(5088);throw new IllegalArgumentException("The size must be non-negative");
        }
        }__CLR4_4_13x63x6kylvdzle.R.inc(5089);this.size = size;
        __CLR4_4_13x63x6kylvdzle.R.inc(5090);this.acceptLarger = acceptLarger;
    }finally{__CLR4_4_13x63x6kylvdzle.R.flushNeeded();}}

    /**
     * Checks to see if the size of the file is favorable.
     * <p>
     * If size equals threshold and smaller files are required,
     * file <b>IS NOT</b> selected.
     * If size equals threshold and larger files are required,
     * file <b>IS</b> selected.
     * </p>
     *
     * @param file  the File to check
     * @return true if the file name matches
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13x63x6kylvdzle.R.inc(5091);
        __CLR4_4_13x63x6kylvdzle.R.inc(5092);return accept(file.length());
    }finally{__CLR4_4_13x63x6kylvdzle.R.flushNeeded();}}

    private boolean accept(final long length) {try{__CLR4_4_13x63x6kylvdzle.R.inc(5093);
        __CLR4_4_13x63x6kylvdzle.R.inc(5094);return acceptLarger != length < size;
    }finally{__CLR4_4_13x63x6kylvdzle.R.flushNeeded();}}

    /**
     * Checks to see if the size of the file is favorable.
     * <p>
     * If size equals threshold and smaller files are required,
     * file <b>IS NOT</b> selected.
     * If size equals threshold and larger files are required,
     * file <b>IS</b> selected.
     * </p>
     * @param file  the File to check
     *
     * @return true if the file name matches
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_13x63x6kylvdzle.R.inc(5095);
        __CLR4_4_13x63x6kylvdzle.R.inc(5096);try {
            __CLR4_4_13x63x6kylvdzle.R.inc(5097);return toFileVisitResult(accept(Files.size(file)), file);
        } catch (final IOException e) {
            __CLR4_4_13x63x6kylvdzle.R.inc(5098);return handle(e);
        }
    }finally{__CLR4_4_13x63x6kylvdzle.R.flushNeeded();}}

    /**
     * Provide a String representation of this file filter.
     *
     * @return a String representation
     */
    @Override
    public String toString() {try{__CLR4_4_13x63x6kylvdzle.R.inc(5099);
        __CLR4_4_13x63x6kylvdzle.R.inc(5100);final String condition = (((acceptLarger )&&(__CLR4_4_13x63x6kylvdzle.R.iget(5101)!=0|true))||(__CLR4_4_13x63x6kylvdzle.R.iget(5102)==0&false))? ">=" : "<";
        __CLR4_4_13x63x6kylvdzle.R.inc(5103);return super.toString() + "(" + condition + size + ")";
    }finally{__CLR4_4_13x63x6kylvdzle.R.flushNeeded();}}

    @Override
    public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs) throws IOException {try{__CLR4_4_13x63x6kylvdzle.R.inc(5104);
        __CLR4_4_13x63x6kylvdzle.R.inc(5105);return toFileVisitResult(accept(Files.size(file)), file);
    }finally{__CLR4_4_13x63x6kylvdzle.R.flushNeeded();}}

}
