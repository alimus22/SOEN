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
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;

import org.apache.commons.io.file.Counters.PathCounters;

/**
 * Copies a source directory to a target directory.
 *
 * @since 2.7
 */
public class CopyDirectoryVisitor extends CountingPathVisitor {public static class __CLR4_4_12vo2vokylvdz5u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3788,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final CopyOption[] copyOptions;
    private final Path sourceDirectory;
    private final Path targetDirectory;

    /**
     * Constructs a new visitor that deletes files except for the files and directories explicitly given.
     *
     * @param pathCounter How to count visits.
     * @param sourceDirectory The source directory
     * @param targetDirectory The target directory
     * @param copyOptions Specifies how the copying should be done.
     */
    public CopyDirectoryVisitor(final PathCounters pathCounter, final Path sourceDirectory, final Path targetDirectory,
        final CopyOption... copyOptions) {
        super(pathCounter);__CLR4_4_12vo2vokylvdz5u.R.inc(3733);try{__CLR4_4_12vo2vokylvdz5u.R.inc(3732);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3734);this.sourceDirectory = sourceDirectory;
        __CLR4_4_12vo2vokylvdz5u.R.inc(3735);this.targetDirectory = targetDirectory;
        __CLR4_4_12vo2vokylvdz5u.R.inc(3736);this.copyOptions = (((copyOptions == null )&&(__CLR4_4_12vo2vokylvdz5u.R.iget(3737)!=0|true))||(__CLR4_4_12vo2vokylvdz5u.R.iget(3738)==0&false))? PathUtils.EMPTY_COPY_OPTIONS : copyOptions.clone();
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    /**
     * Constructs a new visitor that deletes files except for the files and directories explicitly given.
     *
     * @param pathCounter How to count visits.
     * @param fileFilter How to filter file paths.
     * @param dirFilter How to filter directory paths.
     * @param sourceDirectory The source directory
     * @param targetDirectory The target directory
     * @param copyOptions Specifies how the copying should be done.
     * @since 2.9.0
     */
    public CopyDirectoryVisitor(final PathCounters pathCounter, final PathFilter fileFilter, final PathFilter dirFilter,
        final Path sourceDirectory, final Path targetDirectory, final CopyOption... copyOptions) {
        super(pathCounter, fileFilter, dirFilter);__CLR4_4_12vo2vokylvdz5u.R.inc(3740);try{__CLR4_4_12vo2vokylvdz5u.R.inc(3739);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3741);this.sourceDirectory = sourceDirectory;
        __CLR4_4_12vo2vokylvdz5u.R.inc(3742);this.targetDirectory = targetDirectory;
        __CLR4_4_12vo2vokylvdz5u.R.inc(3743);this.copyOptions = (((copyOptions == null )&&(__CLR4_4_12vo2vokylvdz5u.R.iget(3744)!=0|true))||(__CLR4_4_12vo2vokylvdz5u.R.iget(3745)==0&false))? PathUtils.EMPTY_COPY_OPTIONS : copyOptions.clone();
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    /**
     * Copies the sourceFile to the targetFile.
     *
     * @param sourceFile the source file.
     * @param targetFile the target file.
     * @throws IOException if an I/O error occurs.
     * @since 2.8.0
     */
    protected void copy(final Path sourceFile, final Path targetFile) throws IOException {try{__CLR4_4_12vo2vokylvdz5u.R.inc(3746);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3747);Files.copy(sourceFile, targetFile, copyOptions);
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_12vo2vokylvdz5u.R.inc(3748);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3749);if ((((this == obj)&&(__CLR4_4_12vo2vokylvdz5u.R.iget(3750)!=0|true))||(__CLR4_4_12vo2vokylvdz5u.R.iget(3751)==0&false))) {{
            __CLR4_4_12vo2vokylvdz5u.R.inc(3752);return true;
        }
        }__CLR4_4_12vo2vokylvdz5u.R.inc(3753);if ((((!super.equals(obj))&&(__CLR4_4_12vo2vokylvdz5u.R.iget(3754)!=0|true))||(__CLR4_4_12vo2vokylvdz5u.R.iget(3755)==0&false))) {{
            __CLR4_4_12vo2vokylvdz5u.R.inc(3756);return false;
        }
        }__CLR4_4_12vo2vokylvdz5u.R.inc(3757);if ((((getClass() != obj.getClass())&&(__CLR4_4_12vo2vokylvdz5u.R.iget(3758)!=0|true))||(__CLR4_4_12vo2vokylvdz5u.R.iget(3759)==0&false))) {{
            __CLR4_4_12vo2vokylvdz5u.R.inc(3760);return false;
        }
        }__CLR4_4_12vo2vokylvdz5u.R.inc(3761);final CopyDirectoryVisitor other = (CopyDirectoryVisitor) obj;
        __CLR4_4_12vo2vokylvdz5u.R.inc(3762);return Arrays.equals(copyOptions, other.copyOptions) && Objects.equals(sourceDirectory, other.sourceDirectory)
            && Objects.equals(targetDirectory, other.targetDirectory);
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    /**
     * Gets the copy options.
     *
     * @return the copy options.
     * @since 2.8.0
     */
    public CopyOption[] getCopyOptions() {try{__CLR4_4_12vo2vokylvdz5u.R.inc(3763);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3764);return copyOptions.clone();
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    /**
     * Gets the source directory.
     *
     * @return the source directory.
     * @since 2.8.0
     */
    public Path getSourceDirectory() {try{__CLR4_4_12vo2vokylvdz5u.R.inc(3765);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3766);return sourceDirectory;
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    /**
     * Gets the target directory.
     *
     * @return the target directory.
     * @since 2.8.0
     */
    public Path getTargetDirectory() {try{__CLR4_4_12vo2vokylvdz5u.R.inc(3767);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3768);return targetDirectory;
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_12vo2vokylvdz5u.R.inc(3769);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3770);final int prime = 31;
        __CLR4_4_12vo2vokylvdz5u.R.inc(3771);int result = super.hashCode();
        __CLR4_4_12vo2vokylvdz5u.R.inc(3772);result = prime * result + Arrays.hashCode(copyOptions);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3773);result = prime * result + Objects.hash(sourceDirectory, targetDirectory);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3774);return result;
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    @Override
    public FileVisitResult preVisitDirectory(final Path directory, final BasicFileAttributes attributes)
        throws IOException {try{__CLR4_4_12vo2vokylvdz5u.R.inc(3775);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3776);final Path newTargetDir = resolveRelativeAsString(directory);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3777);if ((((Files.notExists(newTargetDir))&&(__CLR4_4_12vo2vokylvdz5u.R.iget(3778)!=0|true))||(__CLR4_4_12vo2vokylvdz5u.R.iget(3779)==0&false))) {{
            __CLR4_4_12vo2vokylvdz5u.R.inc(3780);Files.createDirectory(newTargetDir);
        }
        }__CLR4_4_12vo2vokylvdz5u.R.inc(3781);return super.preVisitDirectory(directory, attributes);
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    /**
     * Relativizes against {@code sourceDirectory}, then resolves against {@code targetDirectory}.
     *
     * We have to call {@link Path#toString()} relative value because we cannot use paths belonging to different
     * FileSystems in the Path methods, usually this leads to {@link ProviderMismatchException}.
     *
     * @param directory the directory to relativize.
     * @return a new path, relativized against sourceDirectory, then resolved against targetDirectory.
     */
    private Path resolveRelativeAsString(final Path directory) {try{__CLR4_4_12vo2vokylvdz5u.R.inc(3782);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3783);return targetDirectory.resolve(sourceDirectory.relativize(directory).toString());
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

    @Override
    public FileVisitResult visitFile(final Path sourceFile, final BasicFileAttributes attributes) throws IOException {try{__CLR4_4_12vo2vokylvdz5u.R.inc(3784);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3785);final Path targetFile = resolveRelativeAsString(sourceFile);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3786);copy(sourceFile, targetFile);
        __CLR4_4_12vo2vokylvdz5u.R.inc(3787);return super.visitFile(targetFile, attributes);
    }finally{__CLR4_4_12vo2vokylvdz5u.R.flushNeeded();}}

}
