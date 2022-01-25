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
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;

import org.apache.commons.io.file.Counters.PathCounters;

/**
 * Deletes files and directories as a visit proceeds.
 *
 * @since 2.7
 */
public class DeletingPathVisitor extends CountingPathVisitor {public static class __CLR4_4_131l31lkylvdz82{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Creates a new instance configured with a BigInteger {@link PathCounters}.
     *
     * @return a new instance configured with a BigInteger {@link PathCounters}.
     */
    public static DeletingPathVisitor withBigIntegerCounters() {try{__CLR4_4_131l31lkylvdz82.R.inc(3945);
        __CLR4_4_131l31lkylvdz82.R.inc(3946);return new DeletingPathVisitor(Counters.bigIntegerPathCounters());
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    /**
     * Creates a new instance configured with a long {@link PathCounters}.
     *
     * @return a new instance configured with a long {@link PathCounters}.
     */
    public static DeletingPathVisitor withLongCounters() {try{__CLR4_4_131l31lkylvdz82.R.inc(3947);
        __CLR4_4_131l31lkylvdz82.R.inc(3948);return new DeletingPathVisitor(Counters.longPathCounters());
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    private final String[] skip;
    private final boolean overrideReadOnly;
    private final LinkOption[] linkOptions;

    /**
     * Constructs a new visitor that deletes files except for the files and directories explicitly given.
     *
     * @param pathCounter How to count visits.
     * @param deleteOption How deletion is handled.
     * @param skip The files to skip deleting.
     * @since 2.8.0
     */
    public DeletingPathVisitor(final PathCounters pathCounter, final DeleteOption[] deleteOption,
        final String... skip) {
        this(pathCounter, PathUtils.NOFOLLOW_LINK_OPTION_ARRAY, deleteOption, skip);__CLR4_4_131l31lkylvdz82.R.inc(3950);try{__CLR4_4_131l31lkylvdz82.R.inc(3949);
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    /**
     * Constructs a new visitor that deletes files except for the files and directories explicitly given.
     *
     * @param pathCounter How to count visits.
     * @param linkOptions How symbolic links are handled.
     * @param deleteOption How deletion is handled.
     * @param skip The files to skip deleting.
     * @since 2.9.0
     */
    public DeletingPathVisitor(final PathCounters pathCounter, final LinkOption[] linkOptions,
        final DeleteOption[] deleteOption, final String... skip) {
        super(pathCounter);__CLR4_4_131l31lkylvdz82.R.inc(3952);try{__CLR4_4_131l31lkylvdz82.R.inc(3951);
        __CLR4_4_131l31lkylvdz82.R.inc(3953);final String[] temp = (((skip != null )&&(__CLR4_4_131l31lkylvdz82.R.iget(3954)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(3955)==0&false))? skip.clone() : EMPTY_STRING_ARRAY;
        __CLR4_4_131l31lkylvdz82.R.inc(3956);Arrays.sort(temp);
        __CLR4_4_131l31lkylvdz82.R.inc(3957);this.skip = temp;
        __CLR4_4_131l31lkylvdz82.R.inc(3958);this.overrideReadOnly = StandardDeleteOption.overrideReadOnly(deleteOption);
        // TODO Files.deleteIfExists() never follows links, so use LinkOption.NOFOLLOW_LINKS in other calls to Files.
        __CLR4_4_131l31lkylvdz82.R.inc(3959);this.linkOptions = (((linkOptions == null )&&(__CLR4_4_131l31lkylvdz82.R.iget(3960)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(3961)==0&false))? PathUtils.NOFOLLOW_LINK_OPTION_ARRAY : linkOptions.clone();
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    /**
     * Constructs a new visitor that deletes files except for the files and directories explicitly given.
     *
     * @param pathCounter How to count visits.
     *
     * @param skip The files to skip deleting.
     */
    public DeletingPathVisitor(final PathCounters pathCounter, final String... skip) {
        this(pathCounter, PathUtils.EMPTY_DELETE_OPTION_ARRAY, skip);__CLR4_4_131l31lkylvdz82.R.inc(3963);try{__CLR4_4_131l31lkylvdz82.R.inc(3962);
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    /**
     * Returns true to process the given path, false if not.
     *
     * @param path the path to test.
     * @return true to process the given path, false if not.
     */
    private boolean accept(final Path path) {try{__CLR4_4_131l31lkylvdz82.R.inc(3964);
        __CLR4_4_131l31lkylvdz82.R.inc(3965);return Arrays.binarySearch(skip, Objects.toString(path.getFileName(), null)) < 0;
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_131l31lkylvdz82.R.inc(3966);
        __CLR4_4_131l31lkylvdz82.R.inc(3967);if ((((this == obj)&&(__CLR4_4_131l31lkylvdz82.R.iget(3968)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(3969)==0&false))) {{
            __CLR4_4_131l31lkylvdz82.R.inc(3970);return true;
        }
        }__CLR4_4_131l31lkylvdz82.R.inc(3971);if ((((!super.equals(obj))&&(__CLR4_4_131l31lkylvdz82.R.iget(3972)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(3973)==0&false))) {{
            __CLR4_4_131l31lkylvdz82.R.inc(3974);return false;
        }
        }__CLR4_4_131l31lkylvdz82.R.inc(3975);if ((((getClass() != obj.getClass())&&(__CLR4_4_131l31lkylvdz82.R.iget(3976)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(3977)==0&false))) {{
            __CLR4_4_131l31lkylvdz82.R.inc(3978);return false;
        }
        }__CLR4_4_131l31lkylvdz82.R.inc(3979);final DeletingPathVisitor other = (DeletingPathVisitor) obj;
        __CLR4_4_131l31lkylvdz82.R.inc(3980);return overrideReadOnly == other.overrideReadOnly && Arrays.equals(skip, other.skip);
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_131l31lkylvdz82.R.inc(3981);
        __CLR4_4_131l31lkylvdz82.R.inc(3982);final int prime = 31;
        __CLR4_4_131l31lkylvdz82.R.inc(3983);int result = super.hashCode();
        __CLR4_4_131l31lkylvdz82.R.inc(3984);result = prime * result + Arrays.hashCode(skip);
        __CLR4_4_131l31lkylvdz82.R.inc(3985);result = prime * result + Objects.hash(overrideReadOnly);
        __CLR4_4_131l31lkylvdz82.R.inc(3986);return result;
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    @Override
    public FileVisitResult postVisitDirectory(final Path dir, final IOException exc) throws IOException {try{__CLR4_4_131l31lkylvdz82.R.inc(3987);
        __CLR4_4_131l31lkylvdz82.R.inc(3988);if ((((PathUtils.isEmptyDirectory(dir))&&(__CLR4_4_131l31lkylvdz82.R.iget(3989)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(3990)==0&false))) {{
            __CLR4_4_131l31lkylvdz82.R.inc(3991);Files.deleteIfExists(dir);
        }
        }__CLR4_4_131l31lkylvdz82.R.inc(3992);return super.postVisitDirectory(dir, exc);
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    @Override
    public FileVisitResult preVisitDirectory(final Path dir, final BasicFileAttributes attrs) throws IOException {try{__CLR4_4_131l31lkylvdz82.R.inc(3993);
        __CLR4_4_131l31lkylvdz82.R.inc(3994);super.preVisitDirectory(dir, attrs);
        __CLR4_4_131l31lkylvdz82.R.inc(3995);return (((accept(dir) )&&(__CLR4_4_131l31lkylvdz82.R.iget(3996)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(3997)==0&false))? FileVisitResult.CONTINUE : FileVisitResult.SKIP_SUBTREE;
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}

    @Override
    public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs) throws IOException {try{__CLR4_4_131l31lkylvdz82.R.inc(3998);
        __CLR4_4_131l31lkylvdz82.R.inc(3999);if ((((accept(file))&&(__CLR4_4_131l31lkylvdz82.R.iget(4000)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(4001)==0&false))) {{
            // delete files and valid links, respecting linkOptions
            __CLR4_4_131l31lkylvdz82.R.inc(4002);if ((((Files.exists(file, linkOptions))&&(__CLR4_4_131l31lkylvdz82.R.iget(4003)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(4004)==0&false))) {{
                __CLR4_4_131l31lkylvdz82.R.inc(4005);if ((((overrideReadOnly)&&(__CLR4_4_131l31lkylvdz82.R.iget(4006)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(4007)==0&false))) {{
                    __CLR4_4_131l31lkylvdz82.R.inc(4008);PathUtils.setReadOnly(file, false, linkOptions);
                }
                }__CLR4_4_131l31lkylvdz82.R.inc(4009);Files.deleteIfExists(file);
            }
            // invalid links will survive previous delete, different approach needed:
            }__CLR4_4_131l31lkylvdz82.R.inc(4010);if ((((Files.isSymbolicLink(file))&&(__CLR4_4_131l31lkylvdz82.R.iget(4011)!=0|true))||(__CLR4_4_131l31lkylvdz82.R.iget(4012)==0&false))) {{
                __CLR4_4_131l31lkylvdz82.R.inc(4013);try {
                    // deleteIfExists does not work for this case
                    __CLR4_4_131l31lkylvdz82.R.inc(4014);Files.delete(file);
                } catch (final NoSuchFileException e) {
                    // ignore
                }
            }
        }}
        }__CLR4_4_131l31lkylvdz82.R.inc(4015);updateFileCounters(file, attrs);
        __CLR4_4_131l31lkylvdz82.R.inc(4016);return FileVisitResult.CONTINUE;
    }finally{__CLR4_4_131l31lkylvdz82.R.flushNeeded();}}
}