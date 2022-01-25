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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.IOExceptionList;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.file.Counters.PathCounters;
import org.apache.commons.io.filefilter.IOFileFilter;

/**
 * NIO Path utilities.
 *
 * @since 2.7
 */
public final class PathUtils {public static class __CLR4_4_133r33rkylvdza3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4323,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Private worker/holder that computes and tracks relative path names and their equality. We reuse the sorted
     * relative lists when comparing directories.
     */
    private static class RelativeSortedPaths {

        final boolean equals;
        // final List<Path> relativeDirList1; // might need later?
        // final List<Path> relativeDirList2; // might need later?
        final List<Path> relativeFileList1;
        final List<Path> relativeFileList2;

        /**
         * Constructs and initializes a new instance by accumulating directory and file info.
         *
         * @param dir1 First directory to compare.
         * @param dir2 Seconds directory to compare.
         * @param maxDepth See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
         * @param linkOptions Options indicating how symbolic links are handled.
         * @param fileVisitOptions See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
         * @throws IOException if an I/O error is thrown by a visitor method.
         */
        private RelativeSortedPaths(final Path dir1, final Path dir2, final int maxDepth,
            final LinkOption[] linkOptions, final FileVisitOption[] fileVisitOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4023);
            __CLR4_4_133r33rkylvdza3.R.inc(4024);final List<Path> tmpRelativeDirList1;
            __CLR4_4_133r33rkylvdza3.R.inc(4025);final List<Path> tmpRelativeDirList2;
            __CLR4_4_133r33rkylvdza3.R.inc(4026);List<Path> tmpRelativeFileList1 = null;
            __CLR4_4_133r33rkylvdza3.R.inc(4027);List<Path> tmpRelativeFileList2 = null;
            __CLR4_4_133r33rkylvdza3.R.inc(4028);if ((((dir1 == null && dir2 == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4029)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4030)==0&false))) {{
                __CLR4_4_133r33rkylvdza3.R.inc(4031);equals = true;
            } }else {__CLR4_4_133r33rkylvdza3.R.inc(4032);if ((((dir1 == null ^ dir2 == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4033)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4034)==0&false))) {{
                __CLR4_4_133r33rkylvdza3.R.inc(4035);equals = false;
            } }else {{
                __CLR4_4_133r33rkylvdza3.R.inc(4036);final boolean parentDirNotExists1 = Files.notExists(dir1, linkOptions);
                __CLR4_4_133r33rkylvdza3.R.inc(4037);final boolean parentDirNotExists2 = Files.notExists(dir2, linkOptions);
                __CLR4_4_133r33rkylvdza3.R.inc(4038);if ((((parentDirNotExists1 || parentDirNotExists2)&&(__CLR4_4_133r33rkylvdza3.R.iget(4039)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4040)==0&false))) {{
                    __CLR4_4_133r33rkylvdza3.R.inc(4041);equals = parentDirNotExists1 && parentDirNotExists2;
                } }else {{
                    __CLR4_4_133r33rkylvdza3.R.inc(4042);final AccumulatorPathVisitor visitor1 = accumulate(dir1, maxDepth, fileVisitOptions);
                    __CLR4_4_133r33rkylvdza3.R.inc(4043);final AccumulatorPathVisitor visitor2 = accumulate(dir2, maxDepth, fileVisitOptions);
                    __CLR4_4_133r33rkylvdza3.R.inc(4044);if ((((visitor1.getDirList().size() != visitor2.getDirList().size()
                        || visitor1.getFileList().size() != visitor2.getFileList().size())&&(__CLR4_4_133r33rkylvdza3.R.iget(4045)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4046)==0&false))) {{
                        __CLR4_4_133r33rkylvdza3.R.inc(4047);equals = false;
                    } }else {{
                        __CLR4_4_133r33rkylvdza3.R.inc(4048);tmpRelativeDirList1 = visitor1.relativizeDirectories(dir1, true, null);
                        __CLR4_4_133r33rkylvdza3.R.inc(4049);tmpRelativeDirList2 = visitor2.relativizeDirectories(dir2, true, null);
                        __CLR4_4_133r33rkylvdza3.R.inc(4050);if ((((!tmpRelativeDirList1.equals(tmpRelativeDirList2))&&(__CLR4_4_133r33rkylvdza3.R.iget(4051)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4052)==0&false))) {{
                            __CLR4_4_133r33rkylvdza3.R.inc(4053);equals = false;
                        } }else {{
                            __CLR4_4_133r33rkylvdza3.R.inc(4054);tmpRelativeFileList1 = visitor1.relativizeFiles(dir1, true, null);
                            __CLR4_4_133r33rkylvdza3.R.inc(4055);tmpRelativeFileList2 = visitor2.relativizeFiles(dir2, true, null);
                            __CLR4_4_133r33rkylvdza3.R.inc(4056);equals = tmpRelativeFileList1.equals(tmpRelativeFileList2);
                        }
                    }}
                }}
            }}
            // relativeDirList1 = tmpRelativeDirList1;
            // relativeDirList2 = tmpRelativeDirList2;
            }}__CLR4_4_133r33rkylvdza3.R.inc(4057);relativeFileList1 = tmpRelativeFileList1;
            __CLR4_4_133r33rkylvdza3.R.inc(4058);relativeFileList2 = tmpRelativeFileList2;
        }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}
    }

    /**
     * Empty {@link CopyOption} array.
     *
     * @since 2.8.0
     */
    public static final CopyOption[] EMPTY_COPY_OPTIONS = {};

    /**
     * Empty {@link LinkOption} array.
     *
     * @since 2.8.0
     */
    public static final DeleteOption[] EMPTY_DELETE_OPTION_ARRAY = {};

    /**
     * Empty {@link FileVisitOption} array.
     */
    public static final FileVisitOption[] EMPTY_FILE_VISIT_OPTION_ARRAY = {};

    /**
     * Empty {@link LinkOption} array.
     */
    public static final LinkOption[] EMPTY_LINK_OPTION_ARRAY = {};

    /**
     * {@link LinkOption} array for {@link LinkOption#NOFOLLOW_LINKS}.
     *
     * @since 2.9.0
     */
    public static final LinkOption[] NOFOLLOW_LINK_OPTION_ARRAY = {LinkOption.NOFOLLOW_LINKS};

    /**
     * Empty {@link OpenOption} array.
     */
    public static final OpenOption[] EMPTY_OPEN_OPTION_ARRAY = {};

    /**
     * Empty {@link Path} array.
     *
     * @since 2.9.0
     */
    public static final Path[] EMPTY_PATH_ARRAY = {};

    /**
     * Accumulates file tree information in a {@link AccumulatorPathVisitor}.
     *
     * @param directory The directory to accumulate information.
     * @param maxDepth See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
     * @param fileVisitOptions See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
     * @throws IOException if an I/O error is thrown by a visitor method.
     * @return file tree information.
     */
    private static AccumulatorPathVisitor accumulate(final Path directory, final int maxDepth,
        final FileVisitOption[] fileVisitOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4059);
        __CLR4_4_133r33rkylvdza3.R.inc(4060);return visitFileTree(AccumulatorPathVisitor.withLongCounters(), directory,
            toFileVisitOptionSet(fileVisitOptions), maxDepth);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Cleans a directory including sub-directories without deleting directories.
     *
     * @param directory directory to clean.
     * @return The visitation path counters.
     * @throws IOException if an I/O error is thrown by a visitor method.
     */
    public static PathCounters cleanDirectory(final Path directory) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4061);
        __CLR4_4_133r33rkylvdza3.R.inc(4062);return cleanDirectory(directory, EMPTY_DELETE_OPTION_ARRAY);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Cleans a directory including sub-directories without deleting directories.
     *
     * @param directory directory to clean.
     * @param deleteOptions How to handle deletion.
     * @return The visitation path counters.
     * @throws IOException if an I/O error is thrown by a visitor method.
     * @since 2.8.0
     */
    public static PathCounters cleanDirectory(final Path directory, final DeleteOption... deleteOptions)
        throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4063);
        __CLR4_4_133r33rkylvdza3.R.inc(4064);return visitFileTree(new CleaningPathVisitor(Counters.longPathCounters(), deleteOptions), directory)
            .getPathCounters();
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Copies a directory to another directory.
     *
     * @param sourceDirectory The source directory.
     * @param targetDirectory The target directory.
     * @param copyOptions Specifies how the copying should be done.
     * @return The visitation path counters.
     * @throws IOException if an I/O error is thrown by a visitor method.
     */
    public static PathCounters copyDirectory(final Path sourceDirectory, final Path targetDirectory,
        final CopyOption... copyOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4065);
        __CLR4_4_133r33rkylvdza3.R.inc(4066);final Path absoluteSource = sourceDirectory.toAbsolutePath();
        __CLR4_4_133r33rkylvdza3.R.inc(4067);return visitFileTree(
            new CopyDirectoryVisitor(Counters.longPathCounters(), absoluteSource, targetDirectory, copyOptions),
            absoluteSource).getPathCounters();
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Copies a URL to a directory.
     *
     * @param sourceFile The source URL.
     * @param targetFile The target file.
     * @param copyOptions Specifies how the copying should be done.
     * @return The target file
     * @throws IOException if an I/O error occurs.
     * @see Files#copy(InputStream, Path, CopyOption...)
     */
    public static Path copyFile(final URL sourceFile, final Path targetFile, final CopyOption... copyOptions)
        throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4068);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_133r33rkylvdza3.R.inc(4069);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_133r33rkylvdza3.R.inc(4070);}};final InputStream inputStream = sourceFile.openStream()) {
            __CLR4_4_133r33rkylvdza3.R.inc(4071);Files.copy(inputStream, targetFile, copyOptions);
            __CLR4_4_133r33rkylvdza3.R.inc(4072);return targetFile;
        }
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Copies a file to a directory.
     *
     * @param sourceFile The source file.
     * @param targetDirectory The target directory.
     * @param copyOptions Specifies how the copying should be done.
     * @return The target file
     * @throws IOException if an I/O error occurs.
     * @see Files#copy(Path, Path, CopyOption...)
     */
    public static Path copyFileToDirectory(final Path sourceFile, final Path targetDirectory,
        final CopyOption... copyOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4073);
        __CLR4_4_133r33rkylvdza3.R.inc(4074);return Files.copy(sourceFile, targetDirectory.resolve(sourceFile.getFileName()), copyOptions);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Copies a URL to a directory.
     *
     * @param sourceFile The source URL.
     * @param targetDirectory The target directory.
     * @param copyOptions Specifies how the copying should be done.
     * @return The target file
     * @throws IOException if an I/O error occurs.
     * @see Files#copy(InputStream, Path, CopyOption...)
     */
    public static Path copyFileToDirectory(final URL sourceFile, final Path targetDirectory,
        final CopyOption... copyOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4075);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_133r33rkylvdza3.R.inc(4076);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_133r33rkylvdza3.R.inc(4077);}};final InputStream inputStream = sourceFile.openStream()) {
            __CLR4_4_133r33rkylvdza3.R.inc(4078);Files.copy(inputStream, targetDirectory.resolve(sourceFile.getFile()), copyOptions);
            __CLR4_4_133r33rkylvdza3.R.inc(4079);return targetDirectory;
        }
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Counts aspects of a directory including sub-directories.
     *
     * @param directory directory to delete.
     * @return The visitor used to count the given directory.
     * @throws IOException if an I/O error is thrown by a visitor method.
     */
    public static PathCounters countDirectory(final Path directory) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4080);
        __CLR4_4_133r33rkylvdza3.R.inc(4081);return visitFileTree(new CountingPathVisitor(Counters.longPathCounters()), directory).getPathCounters();
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Creates the parent directories for the given {@code path}.
     *
     * @param path The path to a file (or directory).
     * @param attrs An optional list of file attributes to set atomically when creating the directories.
     * @return The Path for the {@code path}'s parent directory or null if the given path has no parent.
     * @throws IOException if an I/O error occurs.
     * @since 2.9.0
     */
    public static Path createParentDirectories(final Path path, final FileAttribute<?>... attrs) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4082);
        __CLR4_4_133r33rkylvdza3.R.inc(4083);final Path parent = path.getParent();
        __CLR4_4_133r33rkylvdza3.R.inc(4084);if ((((parent == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4085)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4086)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4087);return null;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4088);return Files.createDirectories(parent, attrs);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Gets the current directory.
     *
     * @return the current directory.
     *
     * @since 2.9.0
     */
    public static Path current() {try{__CLR4_4_133r33rkylvdza3.R.inc(4089);
        __CLR4_4_133r33rkylvdza3.R.inc(4090);return Paths.get("");
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Deletes a file or directory. If the path is a directory, delete it and all sub-directories.
     * <p>
     * The difference between File.delete() and this method are:
     * </p>
     * <ul>
     * <li>A directory to delete does not have to be empty.</li>
     * <li>You get exceptions when a file or directory cannot be deleted; {@link java.io.File#delete()} returns a
     * boolean.
     * </ul>
     *
     * @param path file or directory to delete, must not be {@code null}
     * @return The visitor used to delete the given directory.
     * @throws NullPointerException if the directory is {@code null}
     * @throws IOException if an I/O error is thrown by a visitor method or if an I/O error occurs.
     */
    public static PathCounters delete(final Path path) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4091);
        __CLR4_4_133r33rkylvdza3.R.inc(4092);return delete(path, EMPTY_DELETE_OPTION_ARRAY);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Deletes a file or directory. If the path is a directory, delete it and all sub-directories.
     * <p>
     * The difference between File.delete() and this method are:
     * </p>
     * <ul>
     * <li>A directory to delete does not have to be empty.</li>
     * <li>You get exceptions when a file or directory cannot be deleted; {@link java.io.File#delete()} returns a
     * boolean.
     * </ul>
     *
     * @param path file or directory to delete, must not be {@code null}
     * @param deleteOptions How to handle deletion.
     * @return The visitor used to delete the given directory.
     * @throws NullPointerException if the directory is {@code null}
     * @throws IOException if an I/O error is thrown by a visitor method or if an I/O error occurs.
     * @since 2.8.0
     */
    public static PathCounters delete(final Path path, final DeleteOption... deleteOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4093);
        // File deletion through Files deletes links, not targets, so use LinkOption.NOFOLLOW_LINKS.
        __CLR4_4_133r33rkylvdza3.R.inc(4094);return (((Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS) )&&(__CLR4_4_133r33rkylvdza3.R.iget(4095)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4096)==0&false))? deleteDirectory(path, deleteOptions)
            : deleteFile(path, deleteOptions);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Deletes a file or directory. If the path is a directory, delete it and all sub-directories.
     * <p>
     * The difference between File.delete() and this method are:
     * </p>
     * <ul>
     * <li>A directory to delete does not have to be empty.</li>
     * <li>You get exceptions when a file or directory cannot be deleted; {@link java.io.File#delete()} returns a
     * boolean.
     * </ul>
     *
     * @param path file or directory to delete, must not be {@code null}
     * @param linkOptions How to handle symbolic links.
     * @param deleteOptions How to handle deletion.
     * @return The visitor used to delete the given directory.
     * @throws NullPointerException if the directory is {@code null}
     * @throws IOException if an I/O error is thrown by a visitor method or if an I/O error occurs.
     * @since 2.9.0
     */
    public static PathCounters delete(final Path path, final LinkOption[] linkOptions,
        final DeleteOption... deleteOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4097);
        // File deletion through Files deletes links, not targets, so use LinkOption.NOFOLLOW_LINKS.
        __CLR4_4_133r33rkylvdza3.R.inc(4098);return (((Files.isDirectory(path, linkOptions) )&&(__CLR4_4_133r33rkylvdza3.R.iget(4099)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4100)==0&false))? deleteDirectory(path, linkOptions, deleteOptions)
            : deleteFile(path, linkOptions, deleteOptions);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Deletes a directory including sub-directories.
     *
     * @param directory directory to delete.
     * @return The visitor used to delete the given directory.
     * @throws IOException if an I/O error is thrown by a visitor method.
     */
    public static PathCounters deleteDirectory(final Path directory) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4101);
        __CLR4_4_133r33rkylvdza3.R.inc(4102);return deleteDirectory(directory, EMPTY_DELETE_OPTION_ARRAY);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Deletes a directory including sub-directories.
     *
     * @param directory directory to delete.
     * @param deleteOptions How to handle deletion.
     * @return The visitor used to delete the given directory.
     * @throws IOException if an I/O error is thrown by a visitor method.
     * @since 2.8.0
     */
    public static PathCounters deleteDirectory(final Path directory, final DeleteOption... deleteOptions)
        throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4103);
        __CLR4_4_133r33rkylvdza3.R.inc(4104);return visitFileTree(
            new DeletingPathVisitor(Counters.longPathCounters(), PathUtils.NOFOLLOW_LINK_OPTION_ARRAY, deleteOptions),
            directory).getPathCounters();
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Deletes a directory including sub-directories.
     *
     * @param directory directory to delete.
     * @param linkOptions How to handle symbolic links.
     * @param deleteOptions How to handle deletion.
     * @return The visitor used to delete the given directory.
     * @throws IOException if an I/O error is thrown by a visitor method.
     * @since 2.9.0
     */
    public static PathCounters deleteDirectory(final Path directory, final LinkOption[] linkOptions,
        final DeleteOption... deleteOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4105);
        __CLR4_4_133r33rkylvdza3.R.inc(4106);return visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), linkOptions, deleteOptions),
            directory).getPathCounters();
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Deletes the given file.
     *
     * @param file The file to delete.
     * @return A visitor with path counts set to 1 file, 0 directories, and the size of the deleted file.
     * @throws IOException if an I/O error occurs.
     * @throws NoSuchFileException if the file is a directory.
     */
    public static PathCounters deleteFile(final Path file) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4107);
        __CLR4_4_133r33rkylvdza3.R.inc(4108);return deleteFile(file, EMPTY_DELETE_OPTION_ARRAY);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Deletes the given file.
     *
     * @param file The file to delete.
     * @param deleteOptions How to handle deletion.
     * @return A visitor with path counts set to 1 file, 0 directories, and the size of the deleted file.
     * @throws IOException if an I/O error occurs.
     * @throws NoSuchFileException if the file is a directory.
     * @since 2.8.0
     */
    public static PathCounters deleteFile(final Path file, final DeleteOption... deleteOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4109);
        // Files.deleteIfExists() never follows links, so use LinkOption.NOFOLLOW_LINKS in other calls to Files.
        __CLR4_4_133r33rkylvdza3.R.inc(4110);return deleteFile(file, NOFOLLOW_LINK_OPTION_ARRAY, deleteOptions);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Deletes the given file.
     *
     * @param file The file to delete.
     * @param linkOptions How to handle symbolic links.
     * @param deleteOptions How to handle deletion.
     * @return A visitor with path counts set to 1 file, 0 directories, and the size of the deleted file.
     * @throws IOException if an I/O error occurs.
     * @throws NoSuchFileException if the file is a directory.
     * @since 2.9.0
     */
    public static PathCounters deleteFile(final Path file, final LinkOption[] linkOptions,
        final DeleteOption... deleteOptions) throws NoSuchFileException, IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4111);
        __CLR4_4_133r33rkylvdza3.R.inc(4112);if ((((Files.isDirectory(file, linkOptions))&&(__CLR4_4_133r33rkylvdza3.R.iget(4113)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4114)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4115);throw new NoSuchFileException(file.toString());
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4116);final PathCounters pathCounts = Counters.longPathCounters();
        __CLR4_4_133r33rkylvdza3.R.inc(4117);final boolean exists = Files.exists(file, linkOptions);
        __CLR4_4_133r33rkylvdza3.R.inc(4118);final long size = (((exists && !Files.isSymbolicLink(file) )&&(__CLR4_4_133r33rkylvdza3.R.iget(4119)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4120)==0&false))? Files.size(file) : 0;
        __CLR4_4_133r33rkylvdza3.R.inc(4121);if ((((overrideReadOnly(deleteOptions) && exists)&&(__CLR4_4_133r33rkylvdza3.R.iget(4122)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4123)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4124);setReadOnly(file, false, linkOptions);
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4125);if ((((Files.deleteIfExists(file))&&(__CLR4_4_133r33rkylvdza3.R.iget(4126)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4127)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4128);pathCounts.getFileCounter().increment();
            __CLR4_4_133r33rkylvdza3.R.inc(4129);pathCounts.getByteCounter().add(size);
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4130);return pathCounts;
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Compares the file sets of two Paths to determine if they are equal or not while considering file contents. The
     * comparison includes all files in all sub-directories.
     *
     * @param path1 The first directory.
     * @param path2 The second directory.
     * @return Whether the two directories contain the same files while considering file contents.
     * @throws IOException if an I/O error is thrown by a visitor method
     */
    public static boolean directoryAndFileContentEquals(final Path path1, final Path path2) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4131);
        __CLR4_4_133r33rkylvdza3.R.inc(4132);return directoryAndFileContentEquals(path1, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY,
            EMPTY_FILE_VISIT_OPTION_ARRAY);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Compares the file sets of two Paths to determine if they are equal or not while considering file contents. The
     * comparison includes all files in all sub-directories.
     *
     * @param path1 The first directory.
     * @param path2 The second directory.
     * @param linkOptions options to follow links.
     * @param openOptions options to open files.
     * @param fileVisitOption options to configure traversal.
     * @return Whether the two directories contain the same files while considering file contents.
     * @throws IOException if an I/O error is thrown by a visitor method
     */
    public static boolean directoryAndFileContentEquals(final Path path1, final Path path2,
        final LinkOption[] linkOptions, final OpenOption[] openOptions, final FileVisitOption[] fileVisitOption)
        throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4133);
        // First walk both file trees and gather normalized paths.
        __CLR4_4_133r33rkylvdza3.R.inc(4134);if ((((path1 == null && path2 == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4135)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4136)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4137);return true;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4138);if ((((path1 == null || path2 == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4139)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4140)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4141);return false;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4142);if ((((Files.notExists(path1) && Files.notExists(path2))&&(__CLR4_4_133r33rkylvdza3.R.iget(4143)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4144)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4145);return true;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4146);final RelativeSortedPaths relativeSortedPaths = new RelativeSortedPaths(path1, path2, Integer.MAX_VALUE,
            linkOptions, fileVisitOption);
        // If the normalized path names and counts are not the same, no need to compare contents.
        __CLR4_4_133r33rkylvdza3.R.inc(4147);if ((((!relativeSortedPaths.equals)&&(__CLR4_4_133r33rkylvdza3.R.iget(4148)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4149)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4150);return false;
        }
        // Both visitors contain the same normalized paths, we can compare file contents.
        }__CLR4_4_133r33rkylvdza3.R.inc(4151);final List<Path> fileList1 = relativeSortedPaths.relativeFileList1;
        __CLR4_4_133r33rkylvdza3.R.inc(4152);final List<Path> fileList2 = relativeSortedPaths.relativeFileList2;
        __CLR4_4_133r33rkylvdza3.R.inc(4153);for (final Path path : fileList1) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4154);final int binarySearch = Collections.binarySearch(fileList2, path);
            __CLR4_4_133r33rkylvdza3.R.inc(4155);if ((((binarySearch <= -1)&&(__CLR4_4_133r33rkylvdza3.R.iget(4156)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4157)==0&false))) {{
                __CLR4_4_133r33rkylvdza3.R.inc(4158);throw new IllegalStateException("Unexpected mismatch.");
            }
            }__CLR4_4_133r33rkylvdza3.R.inc(4159);if ((((!fileContentEquals(path1.resolve(path), path2.resolve(path), linkOptions, openOptions))&&(__CLR4_4_133r33rkylvdza3.R.iget(4160)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4161)==0&false))) {{
                __CLR4_4_133r33rkylvdza3.R.inc(4162);return false;
            }
        }}
        }__CLR4_4_133r33rkylvdza3.R.inc(4163);return true;
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Compares the file sets of two Paths to determine if they are equal or not without considering file contents. The
     * comparison includes all files in all sub-directories.
     *
     * @param path1 The first directory.
     * @param path2 The second directory.
     * @return Whether the two directories contain the same files without considering file contents.
     * @throws IOException if an I/O error is thrown by a visitor method
     */
    public static boolean directoryContentEquals(final Path path1, final Path path2) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4164);
        __CLR4_4_133r33rkylvdza3.R.inc(4165);return directoryContentEquals(path1, path2, Integer.MAX_VALUE, EMPTY_LINK_OPTION_ARRAY,
            EMPTY_FILE_VISIT_OPTION_ARRAY);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Compares the file sets of two Paths to determine if they are equal or not without considering file contents. The
     * comparison includes all files in all sub-directories.
     *
     * @param path1 The first directory.
     * @param path2 The second directory.
     * @param maxDepth See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
     * @param linkOptions options to follow links.
     * @param fileVisitOptions options to configure the traversal
     * @return Whether the two directories contain the same files without considering file contents.
     * @throws IOException if an I/O error is thrown by a visitor method
     */
    public static boolean directoryContentEquals(final Path path1, final Path path2, final int maxDepth,
        final LinkOption[] linkOptions, final FileVisitOption[] fileVisitOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4166);
        __CLR4_4_133r33rkylvdza3.R.inc(4167);return new RelativeSortedPaths(path1, path2, maxDepth, linkOptions, fileVisitOptions).equals;
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Compares the file contents of two Paths to determine if they are equal or not.
     * <p>
     * File content is accessed through {@link Files#newInputStream(Path,OpenOption...)}.
     * </p>
     *
     * @param path1 the first stream.
     * @param path2 the second stream.
     * @return true if the content of the streams are equal or they both don't exist, false otherwise.
     * @throws NullPointerException if either input is null.
     * @throws IOException if an I/O error occurs.
     * @see org.apache.commons.io.FileUtils#contentEquals(java.io.File, java.io.File)
     */
    public static boolean fileContentEquals(final Path path1, final Path path2) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4168);
        __CLR4_4_133r33rkylvdza3.R.inc(4169);return fileContentEquals(path1, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Compares the file contents of two Paths to determine if they are equal or not.
     * <p>
     * File content is accessed through {@link Files#newInputStream(Path,OpenOption...)}.
     * </p>
     *
     * @param path1 the first stream.
     * @param path2 the second stream.
     * @param linkOptions options specifying how files are followed.
     * @param openOptions options specifying how files are opened.
     * @return true if the content of the streams are equal or they both don't exist, false otherwise.
     * @throws NullPointerException if either input is null.
     * @throws IOException if an I/O error occurs.
     * @see org.apache.commons.io.FileUtils#contentEquals(java.io.File, java.io.File)
     */
    public static boolean fileContentEquals(final Path path1, final Path path2, final LinkOption[] linkOptions,
        final OpenOption[] openOptions) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4170);
        __CLR4_4_133r33rkylvdza3.R.inc(4171);if ((((path1 == null && path2 == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4172)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4173)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4174);return true;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4175);if ((((path1 == null || path2 == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4176)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4177)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4178);return false;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4179);final Path nPath1 = path1.normalize();
        __CLR4_4_133r33rkylvdza3.R.inc(4180);final Path nPath2 = path2.normalize();
        __CLR4_4_133r33rkylvdza3.R.inc(4181);final boolean path1Exists = Files.exists(nPath1, linkOptions);
        __CLR4_4_133r33rkylvdza3.R.inc(4182);if ((((path1Exists != Files.exists(nPath2, linkOptions))&&(__CLR4_4_133r33rkylvdza3.R.iget(4183)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4184)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4185);return false;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4186);if ((((!path1Exists)&&(__CLR4_4_133r33rkylvdza3.R.iget(4187)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4188)==0&false))) {{
            // Two not existing files are equal?
            // Same as FileUtils
            __CLR4_4_133r33rkylvdza3.R.inc(4189);return true;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4190);if ((((Files.isDirectory(nPath1, linkOptions))&&(__CLR4_4_133r33rkylvdza3.R.iget(4191)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4192)==0&false))) {{
            // don't compare directory contents.
            __CLR4_4_133r33rkylvdza3.R.inc(4193);throw new IOException("Can't compare directories, only files: " + nPath1);
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4194);if ((((Files.isDirectory(nPath2, linkOptions))&&(__CLR4_4_133r33rkylvdza3.R.iget(4195)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4196)==0&false))) {{
            // don't compare directory contents.
            __CLR4_4_133r33rkylvdza3.R.inc(4197);throw new IOException("Can't compare directories, only files: " + nPath2);
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4198);if ((((Files.size(nPath1) != Files.size(nPath2))&&(__CLR4_4_133r33rkylvdza3.R.iget(4199)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4200)==0&false))) {{
            // lengths differ, cannot be equal
            __CLR4_4_133r33rkylvdza3.R.inc(4201);return false;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4202);if ((((path1.equals(path2))&&(__CLR4_4_133r33rkylvdza3.R.iget(4203)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4204)==0&false))) {{
            // same file
            __CLR4_4_133r33rkylvdza3.R.inc(4205);return true;
        }
        }class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_133r33rkylvdza3.R.inc(4206);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_133r33rkylvdza3.R.inc(4207);}};final InputStream inputStream1 = Files.newInputStream(nPath1, openOptions);
            __CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_133r33rkylvdza3.R.inc(4208);}};final InputStream inputStream2 = Files.newInputStream(nPath2, openOptions)) {
            __CLR4_4_133r33rkylvdza3.R.inc(4209);return IOUtils.contentEquals(inputStream1, inputStream2);
        }
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * <p>
     * Applies an {@link IOFileFilter} to the provided {@link File} objects. The resulting array is a subset of the
     * original file list that matches the provided filter.
     * </p>
     *
     * <p>
     * The {@link Set} returned by this method is not guaranteed to be thread safe.
     * </p>
     *
     * <pre>
     * Set&lt;File&gt; allFiles = ...
     * Set&lt;File&gt; javaFiles = FileFilterUtils.filterSet(allFiles,
     *     FileFilterUtils.suffixFileFilter(".java"));
     * </pre>
     *
     * @param filter the filter to apply to the set of files.
     * @param paths the array of files to apply the filter to.
     *
     * @return a subset of {@code files} that is accepted by the file filter.
     * @throws IllegalArgumentException if the filter is {@code null} or {@code files} contains a {@code null}
     *         value.
     *
     * @since 2.9.0
     */
    public static Path[] filter(final PathFilter filter, final Path... paths) {try{__CLR4_4_133r33rkylvdza3.R.inc(4210);
        __CLR4_4_133r33rkylvdza3.R.inc(4211);Objects.requireNonNull(filter, "filter");
        __CLR4_4_133r33rkylvdza3.R.inc(4212);if ((((paths == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4213)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4214)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4215);return EMPTY_PATH_ARRAY;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4216);return filterPaths(filter, Stream.of(paths), Collectors.toList()).toArray(EMPTY_PATH_ARRAY);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    private static <R, A> R filterPaths(final PathFilter filter, final Stream<Path> stream,
        final Collector<? super Path, A, R> collector) {try{__CLR4_4_133r33rkylvdza3.R.inc(4217);
        __CLR4_4_133r33rkylvdza3.R.inc(4218);Objects.requireNonNull(filter, "filter");
        __CLR4_4_133r33rkylvdza3.R.inc(4219);Objects.requireNonNull(collector, "collector");
        __CLR4_4_133r33rkylvdza3.R.inc(4220);if ((((stream == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4221)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4222)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4223);return Stream.<Path>empty().collect(collector);
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4224);return stream.filter(p -> {
            __CLR4_4_133r33rkylvdza3.R.inc(4225);try {
                __CLR4_4_133r33rkylvdza3.R.inc(4226);return p != null && filter.accept(p, readBasicFileAttributes(p)) == FileVisitResult.CONTINUE;
            } catch (final IOException e) {
                __CLR4_4_133r33rkylvdza3.R.inc(4227);return false;
            }
        }).collect(collector);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Reads the access control list from a file attribute view.
     *
     * @param sourcePath the path to the file.
     * @return a file attribute view of the specified type, or null if the attribute view type is not available.
     * @throws IOException if an I/O error occurs.
     * @since 2.8.0
     */
    public static List<AclEntry> getAclEntryList(final Path sourcePath) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4228);
        __CLR4_4_133r33rkylvdza3.R.inc(4229);final AclFileAttributeView fileAttributeView = Files.getFileAttributeView(sourcePath,
            AclFileAttributeView.class);
        __CLR4_4_133r33rkylvdza3.R.inc(4230);return (((fileAttributeView == null )&&(__CLR4_4_133r33rkylvdza3.R.iget(4231)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4232)==0&false))? null : fileAttributeView.getAcl();
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Tests whether the specified {@code Path} is a directory or not. Implemented as a
     * null-safe delegate to {@code Files.isDirectory(Path path, LinkOption... options)}.
     *
     * @param   path the path to the file.
     * @param   options options indicating how symbolic links are handled
     * @return  {@code true} if the file is a directory; {@code false} if
     *          the path is null, the file does not exist, is not a directory, or it cannot
     *          be determined if the file is a directory or not.
     * @throws SecurityException     In the case of the default provider, and a security manager is installed, the
     *                               {@link SecurityManager#checkRead(String) checkRead} method is invoked to check read
     *                               access to the directory.
     * @since 2.9.0
     */
    public static boolean isDirectory(final Path path, final LinkOption... options) {try{__CLR4_4_133r33rkylvdza3.R.inc(4233);
        __CLR4_4_133r33rkylvdza3.R.inc(4234);return path != null && Files.isDirectory(path, options);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Tests whether the given file or directory is empty.
     *
     * @param path the file or directory to query.
     * @return whether the file or directory is empty.
     * @throws IOException if an I/O error occurs.
     */
    public static boolean isEmpty(final Path path) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4235);
        __CLR4_4_133r33rkylvdza3.R.inc(4236);return (((Files.isDirectory(path) )&&(__CLR4_4_133r33rkylvdza3.R.iget(4237)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4238)==0&false))? isEmptyDirectory(path) : isEmptyFile(path);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Tests whether the directory is empty.
     *
     * @param directory the directory to query.
     * @return whether the directory is empty.
     * @throws NotDirectoryException if the file could not otherwise be opened because it is not a directory
     *                               <i>(optional specific exception)</i>.
     * @throws IOException           if an I/O error occurs.
     * @throws SecurityException     In the case of the default provider, and a security manager is installed, the
     *                               {@link SecurityManager#checkRead(String) checkRead} method is invoked to check read
     *                               access to the directory.
     */
    public static boolean isEmptyDirectory(final Path directory) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4239);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_133r33rkylvdza3.R.inc(4240);try (__CLR4_4_1$AC3 __CLR$ACI4=new __CLR4_4_1$AC3(){{__CLR4_4_133r33rkylvdza3.R.inc(4241);}};DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory)) {
            __CLR4_4_133r33rkylvdza3.R.inc(4242);return !directoryStream.iterator().hasNext();
        }
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Tests whether the given file is empty.
     *
     * @param file the file to query.
     * @return whether the file is empty.
     * @throws IOException       if an I/O error occurs.
     * @throws SecurityException In the case of the default provider, and a security manager is installed, its
     *                           {@link SecurityManager#checkRead(String) checkRead} method denies read access to the
     *                           file.
     */
    public static boolean isEmptyFile(final Path file) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4243);
        __CLR4_4_133r33rkylvdza3.R.inc(4244);return Files.size(file) <= 0;
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Tests if the specified {@code Path} is newer than the specified time reference.
     *
     * @param file the {@code Path} of which the modification date must be compared
     * @param timeMillis the time reference measured in milliseconds since the epoch (00:00:00 GMT, January 1, 1970)
     * @param options options indicating how symbolic links are handled * @return true if the {@code Path} exists and
     *        has been modified after the given time reference.
     * @return true if the {@code Path} exists and has been modified after the given time reference.
     * @throws IOException if an I/O error occurs.
     * @throws NullPointerException if the file is {@code null}
     * @since 2.9.0
     */
    public static boolean isNewer(final Path file, final long timeMillis, final LinkOption... options)
        throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4245);
        __CLR4_4_133r33rkylvdza3.R.inc(4246);Objects.requireNonNull(file, "file");
        __CLR4_4_133r33rkylvdza3.R.inc(4247);if ((((Files.notExists(file))&&(__CLR4_4_133r33rkylvdza3.R.iget(4248)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4249)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4250);return false;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4251);return Files.getLastModifiedTime(file, options).toMillis() > timeMillis;
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Tests whether the specified {@code Path} is a regular file or not. Implemented as a
     * null-safe delegate to {@code Files.isRegularFile(Path path, LinkOption... options)}.
     *
     * @param   path the path to the file.
     * @param   options options indicating how symbolic links are handled
     * @return  {@code true} if the file is a regular file; {@code false} if
     *          the path is null, the file does not exist, is not a directory, or it cannot
     *          be determined if the file is a regular file or not.
     * @throws SecurityException     In the case of the default provider, and a security manager is installed, the
     *                               {@link SecurityManager#checkRead(String) checkRead} method is invoked to check read
     *                               access to the directory.
     * @since 2.9.0
     */
    public static boolean isRegularFile(final Path path, final LinkOption... options) {try{__CLR4_4_133r33rkylvdza3.R.inc(4252);
        __CLR4_4_133r33rkylvdza3.R.inc(4253);return path != null && Files.isRegularFile(path, options);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Creates a new DirectoryStream for Paths rooted at the given directory.
     *
     * @param dir the path to the directory to stream.
     * @param pathFilter the directory stream filter.
     * @return a new instance.
     * @throws IOException if an I/O error occurs.
     */
    public static DirectoryStream<Path> newDirectoryStream(final Path dir, final PathFilter pathFilter)
        throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4254);
        __CLR4_4_133r33rkylvdza3.R.inc(4255);return Files.newDirectoryStream(dir, new DirectoryStreamFilter(pathFilter));
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Returns true if the given options contain {@link StandardDeleteOption#OVERRIDE_READ_ONLY}.
     *
     * @param deleteOptions the array to test
     * @return true if the given options contain {@link StandardDeleteOption#OVERRIDE_READ_ONLY}.
     */
    private static boolean overrideReadOnly(final DeleteOption... deleteOptions) {try{__CLR4_4_133r33rkylvdza3.R.inc(4256);
        __CLR4_4_133r33rkylvdza3.R.inc(4257);if ((((deleteOptions == null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4258)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4259)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4260);return false;
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4261);return Stream.of(deleteOptions).anyMatch(e -> e == StandardDeleteOption.OVERRIDE_READ_ONLY);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Shorthand for {@code Files.readAttributes(path, BasicFileAttributes.class)}
     *
     * @param path the path to read.
     * @return the path attributes.
     * @throws IOException if an I/O error occurs.
     * @since 2.9.0
     */
    public static BasicFileAttributes readBasicFileAttributes(final Path path) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4262);
        __CLR4_4_133r33rkylvdza3.R.inc(4263);return Files.readAttributes(path, BasicFileAttributes.class);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Shorthand for {@code Files.readAttributes(path, BasicFileAttributes.class)} while wrapping {@link IOException}
     * as {@link UncheckedIOException}.
     *
     * @param path the path to read.
     * @return the path attributes.
     * @throws UncheckedIOException if an I/O error occurs
     * @since 2.9.0
     */
    public static BasicFileAttributes readBasicFileAttributesUnchecked(final Path path) {try{__CLR4_4_133r33rkylvdza3.R.inc(4264);
        __CLR4_4_133r33rkylvdza3.R.inc(4265);try {
            __CLR4_4_133r33rkylvdza3.R.inc(4266);return readBasicFileAttributes(path);
        } catch (final IOException e) {
            __CLR4_4_133r33rkylvdza3.R.inc(4267);throw new UncheckedIOException(e);
        }
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Relativizes all files in the given {@code collection} against a {@code parent}.
     *
     * @param collection The collection of paths to relativize.
     * @param parent relativizes against this parent path.
     * @param sort Whether to sort the result.
     * @param comparator How to sort.
     * @return A collection of relativized paths, optionally sorted.
     */
    static List<Path> relativize(final Collection<Path> collection, final Path parent, final boolean sort,
        final Comparator<? super Path> comparator) {try{__CLR4_4_133r33rkylvdza3.R.inc(4268);
        __CLR4_4_133r33rkylvdza3.R.inc(4269);Stream<Path> stream = collection.stream().map(parent::relativize);
        __CLR4_4_133r33rkylvdza3.R.inc(4270);if ((((sort)&&(__CLR4_4_133r33rkylvdza3.R.iget(4271)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4272)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4273);stream = (((comparator == null )&&(__CLR4_4_133r33rkylvdza3.R.iget(4274)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4275)==0&false))? stream.sorted() : stream.sorted(comparator);
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4276);return stream.collect(Collectors.toList());
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Sets the given Path to the {@code readOnly} value.
     * <p>
     * This behavior is OS dependent.
     * </p>
     *
     * @param path The path to set.
     * @param readOnly true for read-only, false for not read-only.
     * @param linkOptions options indicating how symbolic links are handled.
     * @return The given path.
     * @throws IOException if an I/O error occurs.
     * @since 2.8.0
     */
    public static Path setReadOnly(final Path path, final boolean readOnly, final LinkOption... linkOptions)
        throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4277);
        __CLR4_4_133r33rkylvdza3.R.inc(4278);final List<Exception> causeList = new ArrayList<>(2);
        __CLR4_4_133r33rkylvdza3.R.inc(4279);final DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class,
            linkOptions);
        __CLR4_4_133r33rkylvdza3.R.inc(4280);if ((((fileAttributeView != null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4281)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4282)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4283);try {
                __CLR4_4_133r33rkylvdza3.R.inc(4284);fileAttributeView.setReadOnly(readOnly);
                __CLR4_4_133r33rkylvdza3.R.inc(4285);return path;
            } catch (final IOException e) {
                // ignore for now, retry with PosixFileAttributeView
                __CLR4_4_133r33rkylvdza3.R.inc(4286);causeList.add(e);
            }
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4287);final PosixFileAttributeView posixFileAttributeView = Files.getFileAttributeView(path,
            PosixFileAttributeView.class, linkOptions);
        __CLR4_4_133r33rkylvdza3.R.inc(4288);if ((((posixFileAttributeView != null)&&(__CLR4_4_133r33rkylvdza3.R.iget(4289)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4290)==0&false))) {{
            // Works on Windows but not on Ubuntu:
            // Files.setAttribute(path, "unix:readonly", readOnly, options);
            // java.lang.IllegalArgumentException: 'unix:readonly' not recognized
            __CLR4_4_133r33rkylvdza3.R.inc(4291);final PosixFileAttributes readAttributes = posixFileAttributeView.readAttributes();
            __CLR4_4_133r33rkylvdza3.R.inc(4292);final Set<PosixFilePermission> permissions = readAttributes.permissions();
            __CLR4_4_133r33rkylvdza3.R.inc(4293);permissions.remove(PosixFilePermission.OWNER_WRITE);
            __CLR4_4_133r33rkylvdza3.R.inc(4294);permissions.remove(PosixFilePermission.GROUP_WRITE);
            __CLR4_4_133r33rkylvdza3.R.inc(4295);permissions.remove(PosixFilePermission.OTHERS_WRITE);
            __CLR4_4_133r33rkylvdza3.R.inc(4296);try {
                __CLR4_4_133r33rkylvdza3.R.inc(4297);return Files.setPosixFilePermissions(path, permissions);
            } catch (final IOException e) {
                __CLR4_4_133r33rkylvdza3.R.inc(4298);causeList.add(e);
            }
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4299);if ((((!causeList.isEmpty())&&(__CLR4_4_133r33rkylvdza3.R.iget(4300)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4301)==0&false))) {{
            __CLR4_4_133r33rkylvdza3.R.inc(4302);throw new IOExceptionList(path.toString(), causeList);
        }
        }__CLR4_4_133r33rkylvdza3.R.inc(4303);throw new IOException(
            String.format("No DosFileAttributeView or PosixFileAttributeView for '%s' (linkOptions=%s)", path,
                Arrays.toString(linkOptions)));
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Converts an array of {@link FileVisitOption} to a {@link Set}.
     *
     * @param fileVisitOptions input array.
     * @return a new Set.
     */
    static Set<FileVisitOption> toFileVisitOptionSet(final FileVisitOption... fileVisitOptions) {try{__CLR4_4_133r33rkylvdza3.R.inc(4304);
        __CLR4_4_133r33rkylvdza3.R.inc(4305);return (((fileVisitOptions == null )&&(__CLR4_4_133r33rkylvdza3.R.iget(4306)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4307)==0&false))? EnumSet.noneOf(FileVisitOption.class)
            : Stream.of(fileVisitOptions).collect(Collectors.toSet());
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Performs {@link Files#walkFileTree(Path,FileVisitor)} and returns the given visitor.
     *
     * Note that {@link Files#walkFileTree(Path,FileVisitor)} returns the given path.
     *
     * @param visitor See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @param directory See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @param <T> See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @return the given visitor.
     *
     * @throws IOException if an I/O error is thrown by a visitor method
     */
    public static <T extends FileVisitor<? super Path>> T visitFileTree(final T visitor, final Path directory)
        throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4308);
        __CLR4_4_133r33rkylvdza3.R.inc(4309);Files.walkFileTree(directory, visitor);
        __CLR4_4_133r33rkylvdza3.R.inc(4310);return visitor;
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Performs {@link Files#walkFileTree(Path,FileVisitor)} and returns the given visitor.
     *
     * Note that {@link Files#walkFileTree(Path,FileVisitor)} returns the given path.
     *
     * @param start See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
     * @param options See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
     * @param maxDepth See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
     * @param visitor See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
     * @param <T> See {@link Files#walkFileTree(Path,Set,int,FileVisitor)}.
     * @return the given visitor.
     *
     * @throws IOException if an I/O error is thrown by a visitor method
     */
    public static <T extends FileVisitor<? super Path>> T visitFileTree(final T visitor, final Path start,
        final Set<FileVisitOption> options, final int maxDepth) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4311);
        __CLR4_4_133r33rkylvdza3.R.inc(4312);Files.walkFileTree(start, options, maxDepth, visitor);
        __CLR4_4_133r33rkylvdza3.R.inc(4313);return visitor;
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Performs {@link Files#walkFileTree(Path,FileVisitor)} and returns the given visitor.
     *
     * Note that {@link Files#walkFileTree(Path,FileVisitor)} returns the given path.
     *
     * @param visitor See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @param first See {@link Paths#get(String,String[])}.
     * @param more See {@link Paths#get(String,String[])}.
     * @param <T> See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @return the given visitor.
     *
     * @throws IOException if an I/O error is thrown by a visitor method
     */
    public static <T extends FileVisitor<? super Path>> T visitFileTree(final T visitor, final String first,
        final String... more) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4314);
        __CLR4_4_133r33rkylvdza3.R.inc(4315);return visitFileTree(visitor, Paths.get(first, more));
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Performs {@link Files#walkFileTree(Path,FileVisitor)} and returns the given visitor.
     *
     * Note that {@link Files#walkFileTree(Path,FileVisitor)} returns the given path.
     *
     * @param visitor See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @param uri See {@link Paths#get(URI)}.
     * @param <T> See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @return the given visitor.
     *
     * @throws IOException if an I/O error is thrown by a visitor method
     */
    public static <T extends FileVisitor<? super Path>> T visitFileTree(final T visitor, final URI uri)
        throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4316);
        __CLR4_4_133r33rkylvdza3.R.inc(4317);return visitFileTree(visitor, Paths.get(uri));
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Returns a stream of filtered paths.
     *
     * @param start the start path
     * @param pathFilter the path filter
     * @param maxDepth the maximum depth of directories to walk.
     * @param readAttributes whether to call the filters with file attributes (false passes null).
     * @param options the options to configure the walk.
     * @return a filtered stream of paths.
     * @throws IOException if an I/O error is thrown when accessing the starting file.
     * @since 2.9.0
     */
    public static Stream<Path> walk(final Path start, final PathFilter pathFilter, final int maxDepth,
        final boolean readAttributes, final FileVisitOption... options) throws IOException {try{__CLR4_4_133r33rkylvdza3.R.inc(4318);
        __CLR4_4_133r33rkylvdza3.R.inc(4319);return Files.walk(start, maxDepth, options).filter(path -> pathFilter.accept(path,
            (((readAttributes )&&(__CLR4_4_133r33rkylvdza3.R.iget(4320)!=0|true))||(__CLR4_4_133r33rkylvdza3.R.iget(4321)==0&false))? readBasicFileAttributesUnchecked(path) : null) == FileVisitResult.CONTINUE);
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

    /**
     * Does allow to instantiate.
     */
    private PathUtils() {try{__CLR4_4_133r33rkylvdza3.R.inc(4322);
        // do not instantiate.
    }finally{__CLR4_4_133r33rkylvdza3.R.flushNeeded();}}

}
