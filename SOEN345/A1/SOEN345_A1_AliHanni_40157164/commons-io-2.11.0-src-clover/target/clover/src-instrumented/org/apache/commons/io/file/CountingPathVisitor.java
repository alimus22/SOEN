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
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

import org.apache.commons.io.file.Counters.PathCounters;
import org.apache.commons.io.filefilter.TrueFileFilter;

/**
 * Counts files, directories, and sizes, as a visit proceeds.
 *
 * @since 2.7
 */
public class CountingPathVisitor extends SimplePathVisitor {public static class __CLR4_4_130b30bkylvdz6u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3945,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final String[] EMPTY_STRING_ARRAY = {};

    /**
     * Creates a new instance configured with a BigInteger {@link PathCounters}.
     *
     * @return a new instance configured with a BigInteger {@link PathCounters}.
     */
    public static CountingPathVisitor withBigIntegerCounters() {try{__CLR4_4_130b30bkylvdz6u.R.inc(3899);
        __CLR4_4_130b30bkylvdz6u.R.inc(3900);return new CountingPathVisitor(Counters.bigIntegerPathCounters());
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    /**
     * Creates a new instance configured with a long {@link PathCounters}.
     *
     * @return a new instance configured with a long {@link PathCounters}.
     */
    public static CountingPathVisitor withLongCounters() {try{__CLR4_4_130b30bkylvdz6u.R.inc(3901);
        __CLR4_4_130b30bkylvdz6u.R.inc(3902);return new CountingPathVisitor(Counters.longPathCounters());
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    private final PathCounters pathCounters;
    private final PathFilter fileFilter;
    private final PathFilter dirFilter;

    /**
     * Constructs a new instance.
     *
     * @param pathCounter How to count path visits.
     */
    public CountingPathVisitor(final PathCounters pathCounter) {
        this(pathCounter, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);__CLR4_4_130b30bkylvdz6u.R.inc(3904);try{__CLR4_4_130b30bkylvdz6u.R.inc(3903);
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    /**
     * Constructs a new instance.
     *
     * @param pathCounter How to count path visits.
     * @param fileFilter Filters which files to count.
     * @param dirFilter Filters which directories to count.
     * @since 2.9.0
     */
    public CountingPathVisitor(final PathCounters pathCounter, final PathFilter fileFilter, final PathFilter dirFilter) {try{__CLR4_4_130b30bkylvdz6u.R.inc(3905);
        __CLR4_4_130b30bkylvdz6u.R.inc(3906);this.pathCounters = Objects.requireNonNull(pathCounter, "pathCounter");
        __CLR4_4_130b30bkylvdz6u.R.inc(3907);this.fileFilter = Objects.requireNonNull(fileFilter, "fileFilter");
        __CLR4_4_130b30bkylvdz6u.R.inc(3908);this.dirFilter = Objects.requireNonNull(dirFilter, "dirFilter");
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_130b30bkylvdz6u.R.inc(3909);
        __CLR4_4_130b30bkylvdz6u.R.inc(3910);if ((((this == obj)&&(__CLR4_4_130b30bkylvdz6u.R.iget(3911)!=0|true))||(__CLR4_4_130b30bkylvdz6u.R.iget(3912)==0&false))) {{
            __CLR4_4_130b30bkylvdz6u.R.inc(3913);return true;
        }
        }__CLR4_4_130b30bkylvdz6u.R.inc(3914);if ((((!(obj instanceof CountingPathVisitor))&&(__CLR4_4_130b30bkylvdz6u.R.iget(3915)!=0|true))||(__CLR4_4_130b30bkylvdz6u.R.iget(3916)==0&false))) {{
            __CLR4_4_130b30bkylvdz6u.R.inc(3917);return false;
        }
        }__CLR4_4_130b30bkylvdz6u.R.inc(3918);final CountingPathVisitor other = (CountingPathVisitor) obj;
        __CLR4_4_130b30bkylvdz6u.R.inc(3919);return Objects.equals(pathCounters, other.pathCounters);
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    /**
     * Gets the visitation counts.
     *
     * @return the visitation counts.
     */
    public PathCounters getPathCounters() {try{__CLR4_4_130b30bkylvdz6u.R.inc(3920);
        __CLR4_4_130b30bkylvdz6u.R.inc(3921);return pathCounters;
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_130b30bkylvdz6u.R.inc(3922);
        __CLR4_4_130b30bkylvdz6u.R.inc(3923);return Objects.hash(pathCounters);
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    @Override
    public FileVisitResult postVisitDirectory(final Path dir, final IOException exc) throws IOException {try{__CLR4_4_130b30bkylvdz6u.R.inc(3924);
        __CLR4_4_130b30bkylvdz6u.R.inc(3925);updateDirCounter(dir, exc);
        __CLR4_4_130b30bkylvdz6u.R.inc(3926);return FileVisitResult.CONTINUE;
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    @Override
    public FileVisitResult preVisitDirectory(final Path dir, final BasicFileAttributes attributes) throws IOException {try{__CLR4_4_130b30bkylvdz6u.R.inc(3927);
        __CLR4_4_130b30bkylvdz6u.R.inc(3928);final FileVisitResult accept = dirFilter.accept(dir, attributes);
        __CLR4_4_130b30bkylvdz6u.R.inc(3929);return (((accept != FileVisitResult.CONTINUE )&&(__CLR4_4_130b30bkylvdz6u.R.iget(3930)!=0|true))||(__CLR4_4_130b30bkylvdz6u.R.iget(3931)==0&false))? FileVisitResult.SKIP_SUBTREE : FileVisitResult.CONTINUE;
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_130b30bkylvdz6u.R.inc(3932);
        __CLR4_4_130b30bkylvdz6u.R.inc(3933);return pathCounters.toString();
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    /**
     * Updates the counter for visiting the given directory.
     *
     * @param dir the visited directory.
     * @param exc Encountered exception.
     * @since 2.9.0
     */
    protected void updateDirCounter(final Path dir, final IOException exc) {try{__CLR4_4_130b30bkylvdz6u.R.inc(3934);
        __CLR4_4_130b30bkylvdz6u.R.inc(3935);pathCounters.getDirectoryCounter().increment();
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    /**
     * Updates the counters for visiting the given file.
     *
     * @param file the visited file.
     * @param attributes the visited file attributes.
     */
    protected void updateFileCounters(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_130b30bkylvdz6u.R.inc(3936);
        __CLR4_4_130b30bkylvdz6u.R.inc(3937);pathCounters.getFileCounter().increment();
        __CLR4_4_130b30bkylvdz6u.R.inc(3938);pathCounters.getByteCounter().add(attributes.size());
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

    @Override
    public FileVisitResult visitFile(final Path file, final BasicFileAttributes attributes) throws IOException {try{__CLR4_4_130b30bkylvdz6u.R.inc(3939);
        __CLR4_4_130b30bkylvdz6u.R.inc(3940);if ((((Files.exists(file) && fileFilter.accept(file, attributes) == FileVisitResult.CONTINUE)&&(__CLR4_4_130b30bkylvdz6u.R.iget(3941)!=0|true))||(__CLR4_4_130b30bkylvdz6u.R.iget(3942)==0&false))) {{
            __CLR4_4_130b30bkylvdz6u.R.inc(3943);updateFileCounters(file, attributes);
        }
        }__CLR4_4_130b30bkylvdz6u.R.inc(3944);return FileVisitResult.CONTINUE;
    }finally{__CLR4_4_130b30bkylvdz6u.R.flushNeeded();}}

}
