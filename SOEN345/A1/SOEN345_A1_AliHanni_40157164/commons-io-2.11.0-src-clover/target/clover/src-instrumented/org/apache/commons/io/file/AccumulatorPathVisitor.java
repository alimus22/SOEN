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

package org.apache.commons.io.file;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import org.apache.commons.io.file.Counters.PathCounters;

/**
 * Accumulates normalized paths during visitation.
 * <p>
 * Use with care on large file trees as each visited Path element is remembered.
 * </p>
 * <h2>Example</h2>
 *
 * <pre>
 * Path dir = Paths.get("");
 * // We are interested in files older than one day
 * long cutoff = System.currentTimeMillis() - (24 * 60 * 60 * 1000);
 * AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(new AgeFileFilter(cutoff));
 * //
 * // Walk one dir
 * Files.walkFileTree(dir, Collections.emptySet(), 1, visitor);
 * System.out.println(visitor.getPathCounters());
 * System.out.println(visitor.getFileList());
 * //
 * visitor.getPathCounters().reset();
 * //
 * // Walk dir tree
 * Files.walkFileTree(dir, visitor);
 * System.out.println(visitor.getPathCounters());
 * System.out.println(visitor.getDirList());
 * System.out.println(visitor.getFileList());
 * </pre>
 *
 * @since 2.7
 */
public class AccumulatorPathVisitor extends CountingPathVisitor {public static class __CLR4_4_12st2stkylvdz52{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3679,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Creates a new instance configured with a BigInteger {@link PathCounters}.
     *
     * @return a new instance configured with a BigInteger {@link PathCounters}.
     */
    public static AccumulatorPathVisitor withBigIntegerCounters() {try{__CLR4_4_12st2stkylvdz52.R.inc(3629);
        __CLR4_4_12st2stkylvdz52.R.inc(3630);return new AccumulatorPathVisitor(Counters.bigIntegerPathCounters());
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    /**
     * Creates a new instance configured with a BigInteger {@link PathCounters}.
     *
     * @param fileFilter Filters files to accumulate and count.
     * @param dirFilter Filters directories to accumulate and count.
     * @return a new instance configured with a long {@link PathCounters}.
     * @since 2.9.0
     */
    public static AccumulatorPathVisitor withBigIntegerCounters(final PathFilter fileFilter,
        final PathFilter dirFilter) {try{__CLR4_4_12st2stkylvdz52.R.inc(3631);
        __CLR4_4_12st2stkylvdz52.R.inc(3632);return new AccumulatorPathVisitor(Counters.bigIntegerPathCounters(), fileFilter, dirFilter);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    /**
     * Creates a new instance configured with a long {@link PathCounters}.
     *
     * @return a new instance configured with a long {@link PathCounters}.
     */
    public static AccumulatorPathVisitor withLongCounters() {try{__CLR4_4_12st2stkylvdz52.R.inc(3633);
        __CLR4_4_12st2stkylvdz52.R.inc(3634);return new AccumulatorPathVisitor(Counters.longPathCounters());
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    /**
     * Creates a new instance configured with a long {@link PathCounters}.
     *
     * @param fileFilter Filters files to accumulate and count.
     * @param dirFilter Filters directories to accumulate and count.
     * @return a new instance configured with a long {@link PathCounters}.
     * @since 2.9.0
     */
    public static AccumulatorPathVisitor withLongCounters(final PathFilter fileFilter, final PathFilter dirFilter) {try{__CLR4_4_12st2stkylvdz52.R.inc(3635);
        __CLR4_4_12st2stkylvdz52.R.inc(3636);return new AccumulatorPathVisitor(Counters.longPathCounters(), fileFilter, dirFilter);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    private final List<Path> dirList = new ArrayList<>();

    private final List<Path> fileList = new ArrayList<>();

    /**
     * Constructs a new instance.
     *
     * @since 2.9.0
     */
    public AccumulatorPathVisitor() {
        super(Counters.noopPathCounters());__CLR4_4_12st2stkylvdz52.R.inc(3638);try{__CLR4_4_12st2stkylvdz52.R.inc(3637);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    /**
     * Constructs a new instance that counts file system elements.
     *
     * @param pathCounter How to count path visits.
     */
    public AccumulatorPathVisitor(final PathCounters pathCounter) {
        super(pathCounter);__CLR4_4_12st2stkylvdz52.R.inc(3640);try{__CLR4_4_12st2stkylvdz52.R.inc(3639);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    /**
     * Constructs a new instance.
     *
     * @param pathCounter How to count path visits.
     * @param fileFilter Filters which files to count.
     * @param dirFilter Filters which directories to count.
     * @since 2.9.0
     */
    public AccumulatorPathVisitor(final PathCounters pathCounter, final PathFilter fileFilter,
        final PathFilter dirFilter) {
        super(pathCounter, fileFilter, dirFilter);__CLR4_4_12st2stkylvdz52.R.inc(3642);try{__CLR4_4_12st2stkylvdz52.R.inc(3641);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    private void add(final List<Path> list, final Path dir) {try{__CLR4_4_12st2stkylvdz52.R.inc(3643);
        __CLR4_4_12st2stkylvdz52.R.inc(3644);list.add(dir.normalize());
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_12st2stkylvdz52.R.inc(3645);
        __CLR4_4_12st2stkylvdz52.R.inc(3646);if ((((this == obj)&&(__CLR4_4_12st2stkylvdz52.R.iget(3647)!=0|true))||(__CLR4_4_12st2stkylvdz52.R.iget(3648)==0&false))) {{
            __CLR4_4_12st2stkylvdz52.R.inc(3649);return true;
        }
        }__CLR4_4_12st2stkylvdz52.R.inc(3650);if ((((!super.equals(obj))&&(__CLR4_4_12st2stkylvdz52.R.iget(3651)!=0|true))||(__CLR4_4_12st2stkylvdz52.R.iget(3652)==0&false))) {{
            __CLR4_4_12st2stkylvdz52.R.inc(3653);return false;
        }
        }__CLR4_4_12st2stkylvdz52.R.inc(3654);if ((((!(obj instanceof AccumulatorPathVisitor))&&(__CLR4_4_12st2stkylvdz52.R.iget(3655)!=0|true))||(__CLR4_4_12st2stkylvdz52.R.iget(3656)==0&false))) {{
            __CLR4_4_12st2stkylvdz52.R.inc(3657);return false;
        }
        }__CLR4_4_12st2stkylvdz52.R.inc(3658);final AccumulatorPathVisitor other = (AccumulatorPathVisitor) obj;
        __CLR4_4_12st2stkylvdz52.R.inc(3659);return Objects.equals(dirList, other.dirList) && Objects.equals(fileList, other.fileList);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    /**
     * Gets the list of visited directories.
     *
     * @return the list of visited directories.
     */
    public List<Path> getDirList() {try{__CLR4_4_12st2stkylvdz52.R.inc(3660);
        __CLR4_4_12st2stkylvdz52.R.inc(3661);return dirList;
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    /**
     * Gets the list of visited files.
     *
     * @return the list of visited files.
     */
    public List<Path> getFileList() {try{__CLR4_4_12st2stkylvdz52.R.inc(3662);
        __CLR4_4_12st2stkylvdz52.R.inc(3663);return fileList;
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_12st2stkylvdz52.R.inc(3664);
        __CLR4_4_12st2stkylvdz52.R.inc(3665);final int prime = 31;
        __CLR4_4_12st2stkylvdz52.R.inc(3666);int result = super.hashCode();
        __CLR4_4_12st2stkylvdz52.R.inc(3667);result = prime * result + Objects.hash(dirList, fileList);
        __CLR4_4_12st2stkylvdz52.R.inc(3668);return result;
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    /**
     * Relativizes each directory path with {@link Path#relativize(Path)} against the given {@code parent}, optionally
     * sorting the result.
     *
     * @param parent A parent path
     * @param sort Whether to sort
     * @param comparator How to sort, null uses default sorting.
     * @return A new list
     */
    public List<Path> relativizeDirectories(final Path parent, final boolean sort,
        final Comparator<? super Path> comparator) {try{__CLR4_4_12st2stkylvdz52.R.inc(3669);
        __CLR4_4_12st2stkylvdz52.R.inc(3670);return PathUtils.relativize(getDirList(), parent, sort, comparator);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    /**
     * Relativizes each file path with {@link Path#relativize(Path)} against the given {@code parent}, optionally
     * sorting the result.
     *
     * @param parent A parent path
     * @param sort Whether to sort
     * @param comparator How to sort, null uses default sorting.
     * @return A new list
     */
    public List<Path> relativizeFiles(final Path parent, final boolean sort,
        final Comparator<? super Path> comparator) {try{__CLR4_4_12st2stkylvdz52.R.inc(3671);
        __CLR4_4_12st2stkylvdz52.R.inc(3672);return PathUtils.relativize(getFileList(), parent, sort, comparator);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    @Override
    protected void updateDirCounter(final Path dir, final IOException exc) {try{__CLR4_4_12st2stkylvdz52.R.inc(3673);
        __CLR4_4_12st2stkylvdz52.R.inc(3674);super.updateDirCounter(dir, exc);
        __CLR4_4_12st2stkylvdz52.R.inc(3675);add(dirList, dir);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

    @Override
    protected void updateFileCounters(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_12st2stkylvdz52.R.inc(3676);
        __CLR4_4_12st2stkylvdz52.R.inc(3677);super.updateFileCounters(file, attributes);
        __CLR4_4_12st2stkylvdz52.R.inc(3678);add(fileList, file);
    }finally{__CLR4_4_12st2stkylvdz52.R.flushNeeded();}}

}
