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
package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.file.PathUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * This class ensure the correctness of {@link FileUtils#copyDirectoryToDirectory(File, File)}. TODO: currently does not
 * cover happy cases
 *
 * @see FileUtils#copyDirectoryToDirectory(File, File)
 */
public class FileUtilsCopyDirectoryToDirectoryTestCase {static class __CLR4_4_18va8vakylve119{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11538,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static void assertExceptionTypeAndMessage(final File srcDir, final File destDir,
        final Class<? extends Exception> expectedExceptionType, final String expectedMessage) {try{__CLR4_4_18va8vakylve119.R.inc(11494);
        __CLR4_4_18va8vakylve119.R.inc(11495);try {
            __CLR4_4_18va8vakylve119.R.inc(11496);FileUtils.copyDirectoryToDirectory(srcDir, destDir);
        } catch (final Exception e) {
            __CLR4_4_18va8vakylve119.R.inc(11497);final String msg = e.getMessage();
            __CLR4_4_18va8vakylve119.R.inc(11498);assertEquals(expectedExceptionType, e.getClass());
            __CLR4_4_18va8vakylve119.R.inc(11499);assertEquals(expectedMessage, msg);
            __CLR4_4_18va8vakylve119.R.inc(11500);return;
        }
        __CLR4_4_18va8vakylve119.R.inc(11501);fail();
    }finally{__CLR4_4_18va8vakylve119.R.flushNeeded();}}

    /** Temporary folder managed by JUnit. */
    @TempDir
    public File temporaryFolder;

    private void assertAclEntryList(final Path sourcePath, final Path destPath) throws IOException {try{__CLR4_4_18va8vakylve119.R.inc(11502);
        __CLR4_4_18va8vakylve119.R.inc(11503);assertEquals(PathUtils.getAclEntryList(sourcePath), PathUtils.getAclEntryList(destPath));
    }finally{__CLR4_4_18va8vakylve119.R.flushNeeded();}}

    @Test
    public void copyDirectoryToDirectoryThrowsIllegalArgumentExceptionWithCorrectMessageWhenDstDirIsNotDirectory()
        throws IOException {__CLR4_4_18va8vakylve119.R.globalSliceStart(getClass().getName(),11504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mi1al8vk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18va8vakylve119.R.rethrow($CLV_t2$);}finally{__CLR4_4_18va8vakylve119.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCopyDirectoryToDirectoryTestCase.copyDirectoryToDirectoryThrowsIllegalArgumentExceptionWithCorrectMessageWhenDstDirIsNotDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mi1al8vk() throws IOException{try{__CLR4_4_18va8vakylve119.R.inc(11504);
        __CLR4_4_18va8vakylve119.R.inc(11505);final File srcDir = new File(temporaryFolder, "sourceDirectory");
        __CLR4_4_18va8vakylve119.R.inc(11506);srcDir.mkdir();
        __CLR4_4_18va8vakylve119.R.inc(11507);final File destDir = new File(temporaryFolder, "notadirectory");
        __CLR4_4_18va8vakylve119.R.inc(11508);destDir.createNewFile();
        __CLR4_4_18va8vakylve119.R.inc(11509);final String expectedMessage = String.format("Parameter 'destinationDir' is not a directory: '%s'",
            destDir);
        __CLR4_4_18va8vakylve119.R.inc(11510);assertExceptionTypeAndMessage(srcDir, destDir, IllegalArgumentException.class, expectedMessage);
    }finally{__CLR4_4_18va8vakylve119.R.flushNeeded();}}

    @Test
    public void copyDirectoryToDirectoryThrowsIllegalExceptionWithCorrectMessageWhenSrcDirIsNotDirectory()
        throws IOException {__CLR4_4_18va8vakylve119.R.globalSliceStart(getClass().getName(),11511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1shq9698vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18va8vakylve119.R.rethrow($CLV_t2$);}finally{__CLR4_4_18va8vakylve119.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCopyDirectoryToDirectoryTestCase.copyDirectoryToDirectoryThrowsIllegalExceptionWithCorrectMessageWhenSrcDirIsNotDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1shq9698vr() throws IOException{try{__CLR4_4_18va8vakylve119.R.inc(11511);
        __CLR4_4_18va8vakylve119.R.inc(11512);final File srcDir = File.createTempFile("notadireotry", null, temporaryFolder);
        __CLR4_4_18va8vakylve119.R.inc(11513);final File destDir = new File(temporaryFolder, "destinationDirectory");
        __CLR4_4_18va8vakylve119.R.inc(11514);destDir.mkdirs();
        __CLR4_4_18va8vakylve119.R.inc(11515);final String expectedMessage = String.format("Parameter 'sourceDir' is not a directory: '%s'",
            srcDir);
        __CLR4_4_18va8vakylve119.R.inc(11516);assertExceptionTypeAndMessage(srcDir, destDir, IllegalArgumentException.class, expectedMessage);
    }finally{__CLR4_4_18va8vakylve119.R.flushNeeded();}}

    @Test
    public void copyDirectoryToDirectoryThrowsNullPointerExceptionWithCorrectMessageWhenDstDirIsNull() {__CLR4_4_18va8vakylve119.R.globalSliceStart(getClass().getName(),11517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujkx9f8vx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18va8vakylve119.R.rethrow($CLV_t2$);}finally{__CLR4_4_18va8vakylve119.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCopyDirectoryToDirectoryTestCase.copyDirectoryToDirectoryThrowsNullPointerExceptionWithCorrectMessageWhenDstDirIsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujkx9f8vx(){try{__CLR4_4_18va8vakylve119.R.inc(11517);
        __CLR4_4_18va8vakylve119.R.inc(11518);final File srcDir = new File(temporaryFolder, "sourceDirectory");
        __CLR4_4_18va8vakylve119.R.inc(11519);srcDir.mkdir();
        __CLR4_4_18va8vakylve119.R.inc(11520);final File destDir = null;
        __CLR4_4_18va8vakylve119.R.inc(11521);assertExceptionTypeAndMessage(srcDir, destDir, NullPointerException.class, "destinationDir");
    }finally{__CLR4_4_18va8vakylve119.R.flushNeeded();}}

    @Test
    public void copyDirectoryToDirectoryThrowsNullPointerExceptionWithCorrectMessageWhenSrcDirIsNull() {__CLR4_4_18va8vakylve119.R.globalSliceStart(getClass().getName(),11522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzvpdq8w2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18va8vakylve119.R.rethrow($CLV_t2$);}finally{__CLR4_4_18va8vakylve119.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCopyDirectoryToDirectoryTestCase.copyDirectoryToDirectoryThrowsNullPointerExceptionWithCorrectMessageWhenSrcDirIsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzvpdq8w2(){try{__CLR4_4_18va8vakylve119.R.inc(11522);
        __CLR4_4_18va8vakylve119.R.inc(11523);final File srcDir = null;
        __CLR4_4_18va8vakylve119.R.inc(11524);final File destinationDirectory = new File(temporaryFolder, "destinationDirectory");
        __CLR4_4_18va8vakylve119.R.inc(11525);destinationDirectory.mkdir();
        __CLR4_4_18va8vakylve119.R.inc(11526);assertExceptionTypeAndMessage(srcDir, destinationDirectory, NullPointerException.class, "sourceDir");
    }finally{__CLR4_4_18va8vakylve119.R.flushNeeded();}}

    @Test
    public void copyFileAndCheckAcl() throws IOException {__CLR4_4_18va8vakylve119.R.globalSliceStart(getClass().getName(),11527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14acoy78w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18va8vakylve119.R.rethrow($CLV_t2$);}finally{__CLR4_4_18va8vakylve119.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCopyDirectoryToDirectoryTestCase.copyFileAndCheckAcl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14acoy78w7() throws IOException{try{__CLR4_4_18va8vakylve119.R.inc(11527);
        __CLR4_4_18va8vakylve119.R.inc(11528);final Path sourcePath = Files.createTempFile("TempOutput", ".bin");
        __CLR4_4_18va8vakylve119.R.inc(11529);final Path destPath = Paths.get(temporaryFolder.getAbsolutePath(), "SomeFile.bin");
        // Test copy attributes without replace FIRST.
        __CLR4_4_18va8vakylve119.R.inc(11530);FileUtils.copyFile(sourcePath.toFile(), destPath.toFile(), true, StandardCopyOption.COPY_ATTRIBUTES);
        __CLR4_4_18va8vakylve119.R.inc(11531);assertAclEntryList(sourcePath, destPath);
        //
        __CLR4_4_18va8vakylve119.R.inc(11532);FileUtils.copyFile(sourcePath.toFile(), destPath.toFile());
        __CLR4_4_18va8vakylve119.R.inc(11533);assertAclEntryList(sourcePath, destPath);
        //
        __CLR4_4_18va8vakylve119.R.inc(11534);FileUtils.copyFile(sourcePath.toFile(), destPath.toFile(), true, StandardCopyOption.REPLACE_EXISTING);
        __CLR4_4_18va8vakylve119.R.inc(11535);assertAclEntryList(sourcePath, destPath);
        //
        __CLR4_4_18va8vakylve119.R.inc(11536);FileUtils.copyFile(sourcePath.toFile(), destPath.toFile(), true, StandardCopyOption.REPLACE_EXISTING,
            StandardCopyOption.COPY_ATTRIBUTES);
        __CLR4_4_18va8vakylve119.R.inc(11537);assertAclEntryList(sourcePath, destPath);
    }finally{__CLR4_4_18va8vakylve119.R.flushNeeded();}}
}
