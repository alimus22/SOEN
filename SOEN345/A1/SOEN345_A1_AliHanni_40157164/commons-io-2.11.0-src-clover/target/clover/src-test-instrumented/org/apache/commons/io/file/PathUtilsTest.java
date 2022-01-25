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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URI;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.io.filefilter.NameFileFilter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Tests {@link PathUtils}.
 */
public class PathUtilsTest extends TestArguments {static class __CLR4_4_1du2du2kylve2aq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,18034,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String TEST_JAR_NAME = "test.jar";

    private static final String TEST_JAR_PATH = "src/test/resources/org/apache/commons/io/test.jar";

    private static final String PATH_FIXTURE = "NOTICE.txt";

    /**
     * A temporary directory managed by JUnit.
     */
    @TempDir
    public Path tempDir;

    private FileSystem openArchive(final Path p, final boolean createNew) throws IOException {try{__CLR4_4_1du2du2kylve2aq.R.inc(17930);
        __CLR4_4_1du2du2kylve2aq.R.inc(17931);final FileSystem archive;
        __CLR4_4_1du2du2kylve2aq.R.inc(17932);if ((((createNew)&&(__CLR4_4_1du2du2kylve2aq.R.iget(17933)!=0|true))||(__CLR4_4_1du2du2kylve2aq.R.iget(17934)==0&false))) {{
            __CLR4_4_1du2du2kylve2aq.R.inc(17935);final Map<String, String> env = new HashMap<>();
            __CLR4_4_1du2du2kylve2aq.R.inc(17936);env.put("create", "true");
            __CLR4_4_1du2du2kylve2aq.R.inc(17937);final URI fileUri = p.toAbsolutePath().toUri();
            __CLR4_4_1du2du2kylve2aq.R.inc(17938);final URI uri = URI.create("jar:" + fileUri.toASCIIString());
            __CLR4_4_1du2du2kylve2aq.R.inc(17939);archive = FileSystems.newFileSystem(uri, env, null);
        } }else {{
            __CLR4_4_1du2du2kylve2aq.R.inc(17940);archive = FileSystems.newFileSystem(p, (ClassLoader) null);
        }
        }__CLR4_4_1du2du2kylve2aq.R.inc(17941);return archive;
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testCopyDirectoryForDifferentFilesystemsWithAbsolutePath() throws IOException {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),17942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tvf7fdue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testCopyDirectoryForDifferentFilesystemsWithAbsolutePath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tvf7fdue() throws IOException{try{__CLR4_4_1du2du2kylve2aq.R.inc(17942);
        __CLR4_4_1du2du2kylve2aq.R.inc(17943);final Path tempDir = Files.createTempDirectory(getClass().getCanonicalName()).toAbsolutePath();
        __CLR4_4_1du2du2kylve2aq.R.inc(17944);try {
            __CLR4_4_1du2du2kylve2aq.R.inc(17945);final Path archivePath = Paths.get(TEST_JAR_PATH);
            class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1du2du2kylve2aq.R.inc(17946);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1du2du2kylve2aq.R.inc(17947);}};final FileSystem archive = openArchive(archivePath, false)) {
                // relative jar -> absolute dir
                __CLR4_4_1du2du2kylve2aq.R.inc(17948);Path sourceDir = archive.getPath("dir1");
                __CLR4_4_1du2du2kylve2aq.R.inc(17949);PathUtils.copyDirectory(sourceDir, tempDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17950);assertTrue(Files.exists(tempDir.resolve("f1")));

                // absolute jar -> absolute dir
                __CLR4_4_1du2du2kylve2aq.R.inc(17951);sourceDir = archive.getPath("/next");
                __CLR4_4_1du2du2kylve2aq.R.inc(17952);PathUtils.copyDirectory(sourceDir, tempDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17953);assertTrue(Files.exists(tempDir.resolve("dir")));
            }
        } finally {
            __CLR4_4_1du2du2kylve2aq.R.inc(17954);PathUtils.deleteDirectory(tempDir);
        }
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testCopyDirectoryForDifferentFilesystemsWithAbsolutePathReverse() throws IOException {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),17955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1acdwdndur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testCopyDirectoryForDifferentFilesystemsWithAbsolutePathReverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1acdwdndur() throws IOException{try{__CLR4_4_1du2du2kylve2aq.R.inc(17955);
        __CLR4_4_1du2du2kylve2aq.R.inc(17956);final Path tempDir = Files.createTempDirectory(getClass().getCanonicalName());
        __CLR4_4_1du2du2kylve2aq.R.inc(17957);try {
            class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1du2du2kylve2aq.R.inc(17958);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1du2du2kylve2aq.R.inc(17959);}};final FileSystem archive = openArchive(tempDir.resolve(TEST_JAR_NAME), true)) {
                // absolute dir -> relative jar
                __CLR4_4_1du2du2kylve2aq.R.inc(17960);Path targetDir = archive.getPath("target");
                __CLR4_4_1du2du2kylve2aq.R.inc(17961);Files.createDirectory(targetDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17962);final Path sourceDir = Paths.get("src/test/resources/org/apache/commons/io/dirs-2-file-size-2")
                        .toAbsolutePath();
                __CLR4_4_1du2du2kylve2aq.R.inc(17963);PathUtils.copyDirectory(sourceDir, targetDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17964);assertTrue(Files.exists(targetDir.resolve("dirs-a-file-size-1")));

                // absolute dir -> absolute jar
                __CLR4_4_1du2du2kylve2aq.R.inc(17965);targetDir = archive.getPath("/");
                __CLR4_4_1du2du2kylve2aq.R.inc(17966);PathUtils.copyDirectory(sourceDir, targetDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17967);assertTrue(Files.exists(targetDir.resolve("dirs-a-file-size-1")));
            }
        } finally {
            __CLR4_4_1du2du2kylve2aq.R.inc(17968);PathUtils.deleteDirectory(tempDir);
        }
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testCopyDirectoryForDifferentFilesystemsWithRelativePath() throws IOException {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),17969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5cmpcdv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testCopyDirectoryForDifferentFilesystemsWithRelativePath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5cmpcdv5() throws IOException{try{__CLR4_4_1du2du2kylve2aq.R.inc(17969);
        __CLR4_4_1du2du2kylve2aq.R.inc(17970);final Path tempDir = Files.createTempDirectory(getClass().getCanonicalName());
        __CLR4_4_1du2du2kylve2aq.R.inc(17971);try {
            __CLR4_4_1du2du2kylve2aq.R.inc(17972);final Path archivePath = Paths.get(TEST_JAR_PATH);
            class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1du2du2kylve2aq.R.inc(17973);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1du2du2kylve2aq.R.inc(17974);}};final FileSystem archive = openArchive(archivePath, false);
                    __CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_1du2du2kylve2aq.R.inc(17975);}};final FileSystem targetArchive = openArchive(tempDir.resolve(TEST_JAR_NAME), true)) {
                __CLR4_4_1du2du2kylve2aq.R.inc(17976);final Path targetDir = targetArchive.getPath("targetDir");
                __CLR4_4_1du2du2kylve2aq.R.inc(17977);Files.createDirectory(targetDir);
                // relative jar -> relative dir
                __CLR4_4_1du2du2kylve2aq.R.inc(17978);Path sourceDir = archive.getPath("next");
                __CLR4_4_1du2du2kylve2aq.R.inc(17979);PathUtils.copyDirectory(sourceDir, targetDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17980);assertTrue(Files.exists(targetDir.resolve("dir")));

                // absolute jar -> relative dir
                __CLR4_4_1du2du2kylve2aq.R.inc(17981);sourceDir = archive.getPath("/dir1");
                __CLR4_4_1du2du2kylve2aq.R.inc(17982);PathUtils.copyDirectory(sourceDir, targetDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17983);assertTrue(Files.exists(targetDir.resolve("f1")));
            }
        } finally {
            __CLR4_4_1du2du2kylve2aq.R.inc(17984);PathUtils.deleteDirectory(tempDir);
        }
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testCopyDirectoryForDifferentFilesystemsWithRelativePathReverse() throws IOException {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),17985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kz3swdvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testCopyDirectoryForDifferentFilesystemsWithRelativePathReverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kz3swdvl() throws IOException{try{__CLR4_4_1du2du2kylve2aq.R.inc(17985);
        __CLR4_4_1du2du2kylve2aq.R.inc(17986);final Path tempDir = Files.createTempDirectory(getClass().getCanonicalName());
        __CLR4_4_1du2du2kylve2aq.R.inc(17987);try {
            class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1du2du2kylve2aq.R.inc(17988);try (__CLR4_4_1$AC3 __CLR$ACI4=new __CLR4_4_1$AC3(){{__CLR4_4_1du2du2kylve2aq.R.inc(17989);}};final FileSystem archive = openArchive(tempDir.resolve(TEST_JAR_NAME), true)) {
                // relative dir -> relative jar
                __CLR4_4_1du2du2kylve2aq.R.inc(17990);Path targetDir = archive.getPath("target");
                __CLR4_4_1du2du2kylve2aq.R.inc(17991);Files.createDirectory(targetDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17992);final Path sourceDir = Paths.get("src/test/resources/org/apache/commons/io/dirs-2-file-size-2");
                __CLR4_4_1du2du2kylve2aq.R.inc(17993);PathUtils.copyDirectory(sourceDir, targetDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17994);assertTrue(Files.exists(targetDir.resolve("dirs-a-file-size-1")));

                // relative dir -> absolute jar
                __CLR4_4_1du2du2kylve2aq.R.inc(17995);targetDir = archive.getPath("/");
                __CLR4_4_1du2du2kylve2aq.R.inc(17996);PathUtils.copyDirectory(sourceDir, targetDir);
                __CLR4_4_1du2du2kylve2aq.R.inc(17997);assertTrue(Files.exists(targetDir.resolve("dirs-a-file-size-1")));
            }
        } finally {
            __CLR4_4_1du2du2kylve2aq.R.inc(17998);PathUtils.deleteDirectory(tempDir);
        }
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testCopyFile() throws IOException {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),17999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15u58h6dvz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testCopyFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15u58h6dvz() throws IOException{try{__CLR4_4_1du2du2kylve2aq.R.inc(17999);
        __CLR4_4_1du2du2kylve2aq.R.inc(18000);final Path tempDir = Files.createTempDirectory(getClass().getCanonicalName());
        __CLR4_4_1du2du2kylve2aq.R.inc(18001);try {
            __CLR4_4_1du2du2kylve2aq.R.inc(18002);final Path sourceFile = Paths
                .get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1/file-size-1.bin");
            __CLR4_4_1du2du2kylve2aq.R.inc(18003);final Path targetFile = PathUtils.copyFileToDirectory(sourceFile, tempDir);
            __CLR4_4_1du2du2kylve2aq.R.inc(18004);assertTrue(Files.exists(targetFile));
            __CLR4_4_1du2du2kylve2aq.R.inc(18005);assertEquals(Files.size(sourceFile), Files.size(targetFile));
        } finally {
            __CLR4_4_1du2du2kylve2aq.R.inc(18006);PathUtils.deleteDirectory(tempDir);
        }
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testCreateDirectoriesAlreadyExists() throws IOException {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),18007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jry0zmdw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testCreateDirectoriesAlreadyExists",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jry0zmdw7() throws IOException{try{__CLR4_4_1du2du2kylve2aq.R.inc(18007);
        __CLR4_4_1du2du2kylve2aq.R.inc(18008);assertEquals(tempDir.getParent(), PathUtils.createParentDirectories(tempDir));
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testCreateDirectoriesNew() throws IOException {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),18009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnd6dmdw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testCreateDirectoriesNew",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnd6dmdw9() throws IOException{try{__CLR4_4_1du2du2kylve2aq.R.inc(18009);
        __CLR4_4_1du2du2kylve2aq.R.inc(18010);assertEquals(tempDir, PathUtils.createParentDirectories(tempDir.resolve("child")));
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testIsDirectory() throws IOException {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),18011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3t66wdwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testIsDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3t66wdwb() throws IOException{try{__CLR4_4_1du2du2kylve2aq.R.inc(18011);
        __CLR4_4_1du2du2kylve2aq.R.inc(18012);assertFalse(PathUtils.isDirectory(null));

        __CLR4_4_1du2du2kylve2aq.R.inc(18013);assertTrue(PathUtils.isDirectory(tempDir));
        __CLR4_4_1du2du2kylve2aq.R.inc(18014);final Path testFile1 = Files.createTempFile(tempDir, "prefix", null);
        __CLR4_4_1du2du2kylve2aq.R.inc(18015);assertFalse(PathUtils.isDirectory(testFile1));

        __CLR4_4_1du2du2kylve2aq.R.inc(18016);final Path tempDir = Files.createTempDirectory(getClass().getCanonicalName());
        __CLR4_4_1du2du2kylve2aq.R.inc(18017);Files.delete(tempDir);
        __CLR4_4_1du2du2kylve2aq.R.inc(18018);assertFalse(PathUtils.isDirectory(tempDir));
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testIsRegularFile() throws IOException {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),18019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ktac59dwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testIsRegularFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ktac59dwj() throws IOException{try{__CLR4_4_1du2du2kylve2aq.R.inc(18019);
        __CLR4_4_1du2du2kylve2aq.R.inc(18020);assertFalse(PathUtils.isRegularFile(null));

        __CLR4_4_1du2du2kylve2aq.R.inc(18021);assertFalse(PathUtils.isRegularFile(tempDir));
        __CLR4_4_1du2du2kylve2aq.R.inc(18022);final Path testFile1 = Files.createTempFile(tempDir, "prefix", null);
        __CLR4_4_1du2du2kylve2aq.R.inc(18023);assertTrue(PathUtils.isRegularFile(testFile1));

        __CLR4_4_1du2du2kylve2aq.R.inc(18024);Files.delete(testFile1);
        __CLR4_4_1du2du2kylve2aq.R.inc(18025);assertFalse(PathUtils.isRegularFile(testFile1));
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

    @Test
    public void testNewDirectoryStream() throws Exception {__CLR4_4_1du2du2kylve2aq.R.globalSliceStart(getClass().getName(),18026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmqgx2dwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1du2du2kylve2aq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1du2du2kylve2aq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsTest.testNewDirectoryStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmqgx2dwq() throws Exception{try{__CLR4_4_1du2du2kylve2aq.R.inc(18026);
        __CLR4_4_1du2du2kylve2aq.R.inc(18027);final PathFilter pathFilter = new NameFileFilter(PATH_FIXTURE);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1du2du2kylve2aq.R.inc(18028);try (__CLR4_4_1$AC4 __CLR$ACI5=new __CLR4_4_1$AC4(){{__CLR4_4_1du2du2kylve2aq.R.inc(18029);}};final DirectoryStream<Path> stream = PathUtils.newDirectoryStream(PathUtils.current(), pathFilter)) {
            __CLR4_4_1du2du2kylve2aq.R.inc(18030);final Iterator<Path> iterator = stream.iterator();
            __CLR4_4_1du2du2kylve2aq.R.inc(18031);final Path path = iterator.next();
            __CLR4_4_1du2du2kylve2aq.R.inc(18032);assertEquals(PATH_FIXTURE, path.getFileName().toString());
            __CLR4_4_1du2du2kylve2aq.R.inc(18033);assertFalse(iterator.hasNext());
        }
    }finally{__CLR4_4_1du2du2kylve2aq.R.flushNeeded();}}

}
