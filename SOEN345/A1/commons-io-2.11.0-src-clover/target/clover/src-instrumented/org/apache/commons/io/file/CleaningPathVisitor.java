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
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;

import org.apache.commons.io.file.Counters.PathCounters;

/**
 * Deletes files but not directories as a visit proceeds.
 *
 * @since 2.7
 */
public class CleaningPathVisitor extends CountingPathVisitor {public static class __CLR4_4_12u72u7kylvdz5i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Creates a new instance configured with a BigInteger {@link PathCounters}.
     *
     * @return a new instance configured with a BigInteger {@link PathCounters}.
     */
    public static CountingPathVisitor withBigIntegerCounters() {try{__CLR4_4_12u72u7kylvdz5i.R.inc(3679);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3680);return new CleaningPathVisitor(Counters.bigIntegerPathCounters());
    }finally{__CLR4_4_12u72u7kylvdz5i.R.flushNeeded();}}

    /**
     * Creates a new instance configured with a long {@link PathCounters}.
     *
     * @return a new instance configured with a long {@link PathCounters}.
     */
    public static CountingPathVisitor withLongCounters() {try{__CLR4_4_12u72u7kylvdz5i.R.inc(3681);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3682);return new CleaningPathVisitor(Counters.longPathCounters());
    }finally{__CLR4_4_12u72u7kylvdz5i.R.flushNeeded();}}

    private final String[] skip;
    private final boolean overrideReadOnly;

    /**
     * Constructs a new visitor that deletes files except for the files and directories explicitly given.
     *
     * @param pathCounter How to count visits.
     * @param deleteOption How deletion is handled.
     * @param skip The files to skip deleting.
     * @since 2.8.0
     */
    public CleaningPathVisitor(final PathCounters pathCounter, final DeleteOption[] deleteOption,
        final String... skip) {
        super(pathCounter);__CLR4_4_12u72u7kylvdz5i.R.inc(3684);try{__CLR4_4_12u72u7kylvdz5i.R.inc(3683);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3685);final String[] temp = (((skip != null )&&(__CLR4_4_12u72u7kylvdz5i.R.iget(3686)!=0|true))||(__CLR4_4_12u72u7kylvdz5i.R.iget(3687)==0&false))? skip.clone() : EMPTY_STRING_ARRAY;
        __CLR4_4_12u72u7kylvdz5i.R.inc(3688);Arrays.sort(temp);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3689);this.skip = temp;
        __CLR4_4_12u72u7kylvdz5i.R.inc(3690);this.overrideReadOnly = StandardDeleteOption.overrideReadOnly(deleteOption);
    }finally{__CLR4_4_12u72u7kylvdz5i.R.flushNeeded();}}

    /**
     * Constructs a new visitor that deletes files except for the files and directories explicitly given.
     *
     * @param pathCounter How to count visits.
     * @param skip The files to skip deleting.
     */
    public CleaningPathVisitor(final PathCounters pathCounter, final String... skip) {
        this(pathCounter, PathUtils.EMPTY_DELETE_OPTION_ARRAY, skip);__CLR4_4_12u72u7kylvdz5i.R.inc(3692);try{__CLR4_4_12u72u7kylvdz5i.R.inc(3691);
    }finally{__CLR4_4_12u72u7kylvdz5i.R.flushNeeded();}}

    /**
     * Returns true to process the given path, false if not.
     *
     * @param path the path to test.
     * @return true to process the given path, false if not.
     */
    private boolean accept(final Path path) {try{__CLR4_4_12u72u7kylvdz5i.R.inc(3693);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3694);return Arrays.binarySearch(skip, Objects.toString(path.getFileName(), null)) < 0;
    }finally{__CLR4_4_12u72u7kylvdz5i.R.flushNeeded();}}

    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_12u72u7kylvdz5i.R.inc(3695);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3696);if ((((this == obj)&&(__CLR4_4_12u72u7kylvdz5i.R.iget(3697)!=0|true))||(__CLR4_4_12u72u7kylvdz5i.R.iget(3698)==0&false))) {{
            __CLR4_4_12u72u7kylvdz5i.R.inc(3699);return true;
        }
        }__CLR4_4_12u72u7kylvdz5i.R.inc(3700);if ((((!super.equals(obj))&&(__CLR4_4_12u72u7kylvdz5i.R.iget(3701)!=0|true))||(__CLR4_4_12u72u7kylvdz5i.R.iget(3702)==0&false))) {{
            __CLR4_4_12u72u7kylvdz5i.R.inc(3703);return false;
        }
        }__CLR4_4_12u72u7kylvdz5i.R.inc(3704);if ((((getClass() != obj.getClass())&&(__CLR4_4_12u72u7kylvdz5i.R.iget(3705)!=0|true))||(__CLR4_4_12u72u7kylvdz5i.R.iget(3706)==0&false))) {{
            __CLR4_4_12u72u7kylvdz5i.R.inc(3707);return false;
        }
        }__CLR4_4_12u72u7kylvdz5i.R.inc(3708);final CleaningPathVisitor other = (CleaningPathVisitor) obj;
        __CLR4_4_12u72u7kylvdz5i.R.inc(3709);return overrideReadOnly == other.overrideReadOnly && Arrays.equals(skip, other.skip);
    }finally{__CLR4_4_12u72u7kylvdz5i.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_12u72u7kylvdz5i.R.inc(3710);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3711);final int prime = 31;
        __CLR4_4_12u72u7kylvdz5i.R.inc(3712);int result = super.hashCode();
        __CLR4_4_12u72u7kylvdz5i.R.inc(3713);result = prime * result + Arrays.hashCode(skip);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3714);result = prime * result + Objects.hash(overrideReadOnly);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3715);return result;
    }finally{__CLR4_4_12u72u7kylvdz5i.R.flushNeeded();}}

    @Override
    public FileVisitResult preVisitDirectory(final Path dir, final BasicFileAttributes attributes) throws IOException {try{__CLR4_4_12u72u7kylvdz5i.R.inc(3716);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3717);super.preVisitDirectory(dir, attributes);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3718);return (((accept(dir) )&&(__CLR4_4_12u72u7kylvdz5i.R.iget(3719)!=0|true))||(__CLR4_4_12u72u7kylvdz5i.R.iget(3720)==0&false))? FileVisitResult.CONTINUE : FileVisitResult.SKIP_SUBTREE;
    }finally{__CLR4_4_12u72u7kylvdz5i.R.flushNeeded();}}

    @Override
    public FileVisitResult visitFile(final Path file, final BasicFileAttributes attributes) throws IOException {try{__CLR4_4_12u72u7kylvdz5i.R.inc(3721);
        // Files.deleteIfExists() never follows links, so use LinkOption.NOFOLLOW_LINKS in other calls to Files.
        __CLR4_4_12u72u7kylvdz5i.R.inc(3722);if ((((accept(file) && Files.exists(file, LinkOption.NOFOLLOW_LINKS))&&(__CLR4_4_12u72u7kylvdz5i.R.iget(3723)!=0|true))||(__CLR4_4_12u72u7kylvdz5i.R.iget(3724)==0&false))) {{
            __CLR4_4_12u72u7kylvdz5i.R.inc(3725);if ((((overrideReadOnly)&&(__CLR4_4_12u72u7kylvdz5i.R.iget(3726)!=0|true))||(__CLR4_4_12u72u7kylvdz5i.R.iget(3727)==0&false))) {{
                __CLR4_4_12u72u7kylvdz5i.R.inc(3728);PathUtils.setReadOnly(file, false, LinkOption.NOFOLLOW_LINKS);
            }
            }__CLR4_4_12u72u7kylvdz5i.R.inc(3729);Files.deleteIfExists(file);
        }
        }__CLR4_4_12u72u7kylvdz5i.R.inc(3730);updateFileCounters(file, attributes);
        __CLR4_4_12u72u7kylvdz5i.R.inc(3731);return FileVisitResult.CONTINUE;
    }finally{__CLR4_4_12u72u7kylvdz5i.R.flushNeeded();}}
}