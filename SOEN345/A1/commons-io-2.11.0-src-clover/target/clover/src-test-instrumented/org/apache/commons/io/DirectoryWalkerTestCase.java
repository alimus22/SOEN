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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.NameFileFilter;
import org.junit.jupiter.api.Test;

/**
 * This is used to test DirectoryWalker for correctness.
 *
 * @see DirectoryWalker
 *
 */
public class DirectoryWalkerTestCase {static class __CLR4_4_17s37s3kylve0tz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,10314,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Directories
    private static final File current      = new File(".");
    private static final File javaDir      = new File("src/main/java");
    private static final File orgDir       = new File(javaDir, "org");
    private static final File apacheDir    = new File(orgDir, "apache");
    private static final File commonsDir   = new File(apacheDir, "commons");
    private static final File ioDir        = new File(commonsDir, "io");
    private static final File outputDir    = new File(ioDir, "output");
    private static final File[] dirs       = {orgDir, apacheDir, commonsDir, ioDir, outputDir};

    // Files
    private static final File filenameUtils = new File(ioDir, "FilenameUtils.java");
    private static final File ioUtils       = new File(ioDir, "IOUtils.java");
    private static final File proxyWriter   = new File(outputDir, "ProxyWriter.java");
    private static final File nullStream    = new File(outputDir, "NullOutputStream.java");
    private static final File[] ioFiles     = {filenameUtils, ioUtils};
    private static final File[] outputFiles = {proxyWriter, nullStream};

    // Filters
    private static final IOFileFilter dirsFilter        = createNameFilter(dirs);
    private static final IOFileFilter iofilesFilter     = createNameFilter(ioFiles);
    private static final IOFileFilter outputFilesFilter = createNameFilter(outputFiles);
    private static final IOFileFilter ioDirAndFilesFilter = dirsFilter.or(iofilesFilter);
    private static final IOFileFilter dirsAndFilesFilter = ioDirAndFilesFilter.or(outputFilesFilter);

    // Filter to exclude SVN files
    private static final IOFileFilter NOT_SVN = FileFilterUtils.makeSVNAware(null);


    /**
     * Test Filtering
     */
    @Test
    public void testFilter() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqdvap7s3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqdvap7s3(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10083);
        __CLR4_4_17s37s3kylve0tz.R.inc(10084);final List<File> results = new TestFileFinder(dirsAndFilesFilter, -1).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10085);assertEquals(1 + dirs.length + ioFiles.length + outputFiles.length, results.size(), "Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10086);assertTrue(results.contains(javaDir), "Start Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10087);checkContainsFiles("Dir", dirs, results);
        __CLR4_4_17s37s3kylve0tz.R.inc(10088);checkContainsFiles("IO File", ioFiles, results);
        __CLR4_4_17s37s3kylve0tz.R.inc(10089);checkContainsFiles("Output File", outputFiles, results);
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test Filtering and limit to depth 0
     */
    @Test
    public void testFilterAndLimitA() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgvnra7sa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilterAndLimitA",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgvnra7sa(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10090);
        __CLR4_4_17s37s3kylve0tz.R.inc(10091);final List<File> results = new TestFileFinder(NOT_SVN, 0).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10092);assertEquals(1, results.size(), "[A] Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10093);assertTrue(results.contains(javaDir), "[A] Start Dir");
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test Filtering and limit to depth 1
     */
    @Test
    public void testFilterAndLimitB() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e7voyt7se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilterAndLimitB",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e7voyt7se(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10094);
        __CLR4_4_17s37s3kylve0tz.R.inc(10095);final List<File> results = new TestFileFinder(NOT_SVN, 1).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10096);assertEquals(2, results.size(), "[B] Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10097);assertTrue(results.contains(javaDir), "[B] Start Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10098);assertTrue(results.contains(orgDir), "[B] Org Dir");
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test Filtering and limit to depth 3
     */
    @Test
    public void testFilterAndLimitC() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayvq6c7sj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilterAndLimitC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayvq6c7sj(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10099);
        __CLR4_4_17s37s3kylve0tz.R.inc(10100);final List<File> results = new TestFileFinder(NOT_SVN, 3).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10101);assertEquals(4, results.size(), "[C] Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10102);assertTrue(results.contains(javaDir), "[C] Start Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10103);assertTrue(results.contains(orgDir), "[C] Org Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10104);assertTrue(results.contains(apacheDir), "[C] Apache Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10105);assertTrue(results.contains(commonsDir), "[C] Commons Dir");
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test Filtering and limit to depth 5
     */
    @Test
    public void testFilterAndLimitD() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pvrdv7sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilterAndLimitD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pvrdv7sq(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10106);
        __CLR4_4_17s37s3kylve0tz.R.inc(10107);final List<File> results = new TestFileFinder(dirsAndFilesFilter, 5).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10108);assertEquals(1 + dirs.length + ioFiles.length, results.size(), "[D] Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10109);assertTrue(results.contains(javaDir), "[D] Start Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10110);checkContainsFiles("[D] Dir", dirs, results);
        __CLR4_4_17s37s3kylve0tz.R.inc(10111);checkContainsFiles("[D] File", ioFiles, results);
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test separate dir and file filters
     */
    @Test
    public void testFilterDirAndFile1() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1boewt47sw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilterDirAndFile1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1boewt47sw(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10112);
        __CLR4_4_17s37s3kylve0tz.R.inc(10113);final List<File> results = new TestFileFinder(dirsFilter, iofilesFilter, -1).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10114);assertEquals(1 + dirs.length + ioFiles.length, results.size(), "[DirAndFile1] Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10115);assertTrue(results.contains(javaDir), "[DirAndFile1] Start Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10116);checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        __CLR4_4_17s37s3kylve0tz.R.inc(10117);checkContainsFiles("[DirAndFile1] File", ioFiles, results);
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test separate dir and file filters
     */
    @Test
    public void testFilterDirAndFile2() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fey0n7t2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilterDirAndFile2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fey0n7t2(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10118);
        __CLR4_4_17s37s3kylve0tz.R.inc(10119);final List<File> results = new TestFileFinder(null, null, -1).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10120);assertTrue(results.size() > 1 + dirs.length + ioFiles.length, "[DirAndFile2] Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10121);assertTrue(results.contains(javaDir), "[DirAndFile2] Start Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10122);checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        __CLR4_4_17s37s3kylve0tz.R.inc(10123);checkContainsFiles("[DirAndFile2] File", ioFiles, results);
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test separate dir and file filters
     */
    @Test
    public void testFilterDirAndFile3() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156ez867t8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilterDirAndFile3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156ez867t8(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10124);
        __CLR4_4_17s37s3kylve0tz.R.inc(10125);final List<File> results = new TestFileFinder(dirsFilter, null, -1).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10126);final List<File> resultDirs = directoriesOnly(results);
        __CLR4_4_17s37s3kylve0tz.R.inc(10127);assertEquals(1 + dirs.length, resultDirs.size(), "[DirAndFile3] Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10128);assertTrue(results.contains(javaDir), "[DirAndFile3] Start Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10129);checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test separate dir and file filters
     */
    @Test
    public void testFilterDirAndFile4() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xf0fp7te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilterDirAndFile4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xf0fp7te(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10130);
        __CLR4_4_17s37s3kylve0tz.R.inc(10131);final List<File> results = new TestFileFinder(null, iofilesFilter, -1).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10132);final List<File> resultFiles = filesOnly(results);
        __CLR4_4_17s37s3kylve0tz.R.inc(10133);assertEquals(ioFiles.length, resultFiles.size(), "[DirAndFile4] Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10134);assertTrue(results.contains(javaDir), "[DirAndFile4] Start Dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10135);checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test Limiting to current directory
     */
    @Test
    public void testLimitToCurrent() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15g2mzg7tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testLimitToCurrent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15g2mzg7tk(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10136);
        __CLR4_4_17s37s3kylve0tz.R.inc(10137);final List<File> results = new TestFileFinder(null, 0).find(current);
        __CLR4_4_17s37s3kylve0tz.R.inc(10138);assertEquals(1, results.size(), "Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10139);assertTrue(results.contains(new File(".")), "Current Dir");
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * test an invalid start directory
     */
    @Test
    public void testMissingStartDirectory() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mei6ue7to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testMissingStartDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mei6ue7to(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10140);

        // TODO is this what we want with invalid directory?
        __CLR4_4_17s37s3kylve0tz.R.inc(10141);final File invalidDir = new File("invalid-dir");
        __CLR4_4_17s37s3kylve0tz.R.inc(10142);final List<File> results = new TestFileFinder(null, -1).find(invalidDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10143);assertEquals(1, results.size(), "Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10144);assertTrue(results.contains(invalidDir), "Current Dir");

        __CLR4_4_17s37s3kylve0tz.R.inc(10145);try {
            __CLR4_4_17s37s3kylve0tz.R.inc(10146);new TestFileFinder(null, -1).find(null);
            __CLR4_4_17s37s3kylve0tz.R.inc(10147);fail("Null start directory didn't throw Exception");
        } catch (final NullPointerException ignore) {
            // expected result
        }
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * test an invalid start directory
     */
    @Test
    public void testHandleStartDirectoryFalse() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1woaf7f7tw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testHandleStartDirectoryFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1woaf7f7tw(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10148);

        __CLR4_4_17s37s3kylve0tz.R.inc(10149);final List<File> results = new TestFalseFileFinder(null, -1).find(current);
        __CLR4_4_17s37s3kylve0tz.R.inc(10150);assertEquals(0, results.size(), "Result Size");

    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    // ------------ Convenience Test Methods ------------------------------------

    /**
     * Check the files in the array are in the results list.
     */
    private void checkContainsFiles(final String prefix, final File[] files, final Collection<File> results) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10151);
        __CLR4_4_17s37s3kylve0tz.R.inc(10152);for (int i = 0; (((i < files.length)&&(__CLR4_4_17s37s3kylve0tz.R.iget(10153)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10154)==0&false)); i++) {{
            __CLR4_4_17s37s3kylve0tz.R.inc(10155);assertTrue(results.contains(files[i]), prefix + "["+i+"] " + files[i]);
        }
    }}finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    private void checkContainsString(final String prefix, final File[] files, final Collection<String> results) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10156);
        __CLR4_4_17s37s3kylve0tz.R.inc(10157);for (int i = 0; (((i < files.length)&&(__CLR4_4_17s37s3kylve0tz.R.iget(10158)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10159)==0&false)); i++) {{
            __CLR4_4_17s37s3kylve0tz.R.inc(10160);assertTrue(results.contains(files[i].toString()), prefix + "["+i+"] " + files[i]);
        }
    }}finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Extract the directories.
     */
    private List<File> directoriesOnly(final Collection<File> results) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10161);
        __CLR4_4_17s37s3kylve0tz.R.inc(10162);final List<File> list = new ArrayList<>(results.size());
        __CLR4_4_17s37s3kylve0tz.R.inc(10163);for (final File file : results) {{
            __CLR4_4_17s37s3kylve0tz.R.inc(10164);if ((((file.isDirectory())&&(__CLR4_4_17s37s3kylve0tz.R.iget(10165)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10166)==0&false))) {{
                __CLR4_4_17s37s3kylve0tz.R.inc(10167);list.add(file);
            }
        }}
        }__CLR4_4_17s37s3kylve0tz.R.inc(10168);return list;
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Extract the files.
     */
    private List<File> filesOnly(final Collection<File> results) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10169);
        __CLR4_4_17s37s3kylve0tz.R.inc(10170);final List<File> list = new ArrayList<>(results.size());
        __CLR4_4_17s37s3kylve0tz.R.inc(10171);for (final File file : results) {{
            __CLR4_4_17s37s3kylve0tz.R.inc(10172);if ((((file.isFile())&&(__CLR4_4_17s37s3kylve0tz.R.iget(10173)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10174)==0&false))) {{
                __CLR4_4_17s37s3kylve0tz.R.inc(10175);list.add(file);
            }
        }}
        }__CLR4_4_17s37s3kylve0tz.R.inc(10176);return list;
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Create a name filter containing the names of the files
     * in the array.
     */
    private static IOFileFilter createNameFilter(final File[] files) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10177);
        __CLR4_4_17s37s3kylve0tz.R.inc(10178);final String[] names = new String[files.length];
        __CLR4_4_17s37s3kylve0tz.R.inc(10179);for (int i = 0; (((i < files.length)&&(__CLR4_4_17s37s3kylve0tz.R.iget(10180)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10181)==0&false)); i++) {{
            __CLR4_4_17s37s3kylve0tz.R.inc(10182);names[i] = files[i].getName();
        }
        }__CLR4_4_17s37s3kylve0tz.R.inc(10183);return new NameFileFilter(names);
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test Cancel
     */
    @Test
    public void testCancel() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pw5rbh7uw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testCancel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pw5rbh7uw(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10184);
        __CLR4_4_17s37s3kylve0tz.R.inc(10185);String cancelName = null;

        // Cancel on a file
        __CLR4_4_17s37s3kylve0tz.R.inc(10186);try {
            __CLR4_4_17s37s3kylve0tz.R.inc(10187);cancelName = "DirectoryWalker.java";
            __CLR4_4_17s37s3kylve0tz.R.inc(10188);new TestCancelWalker(cancelName, false).find(javaDir);
            __CLR4_4_17s37s3kylve0tz.R.inc(10189);fail("CancelException not thrown for '" + cancelName + "'");
        } catch (final DirectoryWalker.CancelException cancel) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10190);assertEquals(cancelName, cancel.getFile().getName(), "File:  " + cancelName);
            __CLR4_4_17s37s3kylve0tz.R.inc(10191);assertEquals(5, cancel.getDepth(), "Depth: " + cancelName);
        } catch(final IOException ex) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10192);fail("IOException: " + cancelName + " " + ex);
        }

        // Cancel on a directory
        __CLR4_4_17s37s3kylve0tz.R.inc(10193);try {
            __CLR4_4_17s37s3kylve0tz.R.inc(10194);cancelName = "commons";
            __CLR4_4_17s37s3kylve0tz.R.inc(10195);new TestCancelWalker(cancelName, false).find(javaDir);
            __CLR4_4_17s37s3kylve0tz.R.inc(10196);fail("CancelException not thrown for '" + cancelName + "'");
        } catch (final DirectoryWalker.CancelException cancel) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10197);assertEquals(cancelName, cancel.getFile().getName(), "File:  " + cancelName);
            __CLR4_4_17s37s3kylve0tz.R.inc(10198);assertEquals(3, cancel.getDepth(), "Depth: " + cancelName);
        } catch(final IOException ex) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10199);fail("IOException: " + cancelName + " " + ex);
        }

        // Suppress CancelException (use same file name as preceding test)
        __CLR4_4_17s37s3kylve0tz.R.inc(10200);try {
            __CLR4_4_17s37s3kylve0tz.R.inc(10201);final List<File> results = new TestCancelWalker(cancelName, true).find(javaDir);
            __CLR4_4_17s37s3kylve0tz.R.inc(10202);final File lastFile = results.get(results.size() - 1);
            __CLR4_4_17s37s3kylve0tz.R.inc(10203);assertEquals(cancelName, lastFile.getName(), "Suppress:  " + cancelName);
        } catch(final IOException ex) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10204);fail("Suppress threw " + ex);
        }

    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test Cancel
     */
    @Test
    public void testMultiThreadCancel() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142o0pa7vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testMultiThreadCancel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142o0pa7vh(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10205);
        __CLR4_4_17s37s3kylve0tz.R.inc(10206);String cancelName = "DirectoryWalker.java";
        __CLR4_4_17s37s3kylve0tz.R.inc(10207);TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName, false);
        // Cancel on a file
        __CLR4_4_17s37s3kylve0tz.R.inc(10208);try {
            __CLR4_4_17s37s3kylve0tz.R.inc(10209);walker.find(javaDir);
            __CLR4_4_17s37s3kylve0tz.R.inc(10210);fail("CancelException not thrown for '" + cancelName + "'");
        } catch (final DirectoryWalker.CancelException cancel) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10211);final File last = walker.results.get(walker.results.size() - 1);
            __CLR4_4_17s37s3kylve0tz.R.inc(10212);assertEquals(cancelName, last.getName());
            __CLR4_4_17s37s3kylve0tz.R.inc(10213);assertEquals(5, cancel.getDepth(), "Depth: " + cancelName);
        } catch(final IOException ex) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10214);fail("IOException: " + cancelName + " " + ex);
        }

        // Cancel on a directory
        __CLR4_4_17s37s3kylve0tz.R.inc(10215);try {
            __CLR4_4_17s37s3kylve0tz.R.inc(10216);cancelName = "commons";
            __CLR4_4_17s37s3kylve0tz.R.inc(10217);walker = new TestMultiThreadCancelWalker(cancelName, false);
            __CLR4_4_17s37s3kylve0tz.R.inc(10218);walker.find(javaDir);
            __CLR4_4_17s37s3kylve0tz.R.inc(10219);fail("CancelException not thrown for '" + cancelName + "'");
        } catch (final DirectoryWalker.CancelException cancel) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10220);assertEquals(cancelName, cancel.getFile().getName(), "File:  " + cancelName);
            __CLR4_4_17s37s3kylve0tz.R.inc(10221);assertEquals(3, cancel.getDepth(), "Depth: " + cancelName);
        } catch(final IOException ex) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10222);fail("IOException: " + cancelName + " " + ex);
        }

        // Suppress CancelException (use same file name as preceding test)
        __CLR4_4_17s37s3kylve0tz.R.inc(10223);try {
            __CLR4_4_17s37s3kylve0tz.R.inc(10224);walker = new TestMultiThreadCancelWalker(cancelName, true);
            __CLR4_4_17s37s3kylve0tz.R.inc(10225);final List<File> results = walker.find(javaDir);
            __CLR4_4_17s37s3kylve0tz.R.inc(10226);final File lastFile = results.get(results.size() - 1);
            __CLR4_4_17s37s3kylve0tz.R.inc(10227);assertEquals(cancelName, lastFile.getName(), "Suppress:  " + cancelName);
        } catch(final IOException ex) {
            __CLR4_4_17s37s3kylve0tz.R.inc(10228);fail("Suppress threw " + ex);
        }

    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    /**
     * Test Filtering
     */
    @Test
    public void testFilterString() {__CLR4_4_17s37s3kylve0tz.R.globalSliceStart(getClass().getName(),10229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16am7cu7w5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17s37s3kylve0tz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17s37s3kylve0tz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCase.testFilterString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16am7cu7w5(){try{__CLR4_4_17s37s3kylve0tz.R.inc(10229);
        __CLR4_4_17s37s3kylve0tz.R.inc(10230);final List<String> results = new TestFileFinderString(dirsAndFilesFilter, -1).find(javaDir);
        __CLR4_4_17s37s3kylve0tz.R.inc(10231);assertEquals(results.size(), outputFiles.length + ioFiles.length, "Result Size");
        __CLR4_4_17s37s3kylve0tz.R.inc(10232);checkContainsString("IO File", ioFiles, results);
        __CLR4_4_17s37s3kylve0tz.R.inc(10233);checkContainsString("Output File", outputFiles, results);
    }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

    // ------------ Test DirectoryWalker implementation --------------------------

    /**
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
    private static class TestFileFinder extends DirectoryWalker<File> {

        protected TestFileFinder(final FileFilter filter, final int depthLimit) {
            super(filter, depthLimit);__CLR4_4_17s37s3kylve0tz.R.inc(10235);try{__CLR4_4_17s37s3kylve0tz.R.inc(10234);
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        protected TestFileFinder(final IOFileFilter dirFilter, final IOFileFilter fileFilter, final int depthLimit) {
            super(dirFilter, fileFilter, depthLimit);__CLR4_4_17s37s3kylve0tz.R.inc(10237);try{__CLR4_4_17s37s3kylve0tz.R.inc(10236);
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** find files. */
        protected List<File> find(final File startDirectory) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10238);
           __CLR4_4_17s37s3kylve0tz.R.inc(10239);final List<File> results = new ArrayList<>();
           __CLR4_4_17s37s3kylve0tz.R.inc(10240);try {
               __CLR4_4_17s37s3kylve0tz.R.inc(10241);walk(startDirectory, results);
           } catch(final IOException ex) {
               __CLR4_4_17s37s3kylve0tz.R.inc(10242);fail(ex.toString());
           }
           __CLR4_4_17s37s3kylve0tz.R.inc(10243);return results;
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles a directory end by adding the File to the result set. */
        @Override
        protected void handleDirectoryEnd(final File directory, final int depth, final Collection<File> results) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10244);
            __CLR4_4_17s37s3kylve0tz.R.inc(10245);results.add(directory);
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles a file by adding the File to the result set. */
        @Override
        protected void handleFile(final File file, final int depth, final Collection<File> results) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10246);
            __CLR4_4_17s37s3kylve0tz.R.inc(10247);results.add(file);
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}
    }

    // ------------ Test DirectoryWalker implementation --------------------------

    /**
     * Test DirectoryWalker implementation that always returns false
     * from handleDirectoryStart()
     */
    private static class TestFalseFileFinder extends TestFileFinder {

        protected TestFalseFileFinder(final FileFilter filter, final int depthLimit) {
            super(filter, depthLimit);__CLR4_4_17s37s3kylve0tz.R.inc(10249);try{__CLR4_4_17s37s3kylve0tz.R.inc(10248);
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Always returns false. */
        @Override
        protected boolean handleDirectory(final File directory, final int depth, final Collection<File> results) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10250);
            __CLR4_4_17s37s3kylve0tz.R.inc(10251);return false;
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}
    }

    // ------------ Test DirectoryWalker implementation --------------------------

    /**
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
    static class TestCancelWalker extends DirectoryWalker<File> {
        private final String cancelFileName;
        private final boolean suppressCancel;

        TestCancelWalker(final String cancelFileName,final boolean suppressCancel) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10252);
            __CLR4_4_17s37s3kylve0tz.R.inc(10253);this.cancelFileName = cancelFileName;
            __CLR4_4_17s37s3kylve0tz.R.inc(10254);this.suppressCancel = suppressCancel;
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** find files. */
        protected List<File> find(final File startDirectory) throws IOException {try{__CLR4_4_17s37s3kylve0tz.R.inc(10255);
           __CLR4_4_17s37s3kylve0tz.R.inc(10256);final List<File> results = new ArrayList<>();
           __CLR4_4_17s37s3kylve0tz.R.inc(10257);walk(startDirectory, results);
           __CLR4_4_17s37s3kylve0tz.R.inc(10258);return results;
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles a directory end by adding the File to the result set. */
        @Override
        protected void handleDirectoryEnd(final File directory, final int depth, final Collection<File> results) throws IOException {try{__CLR4_4_17s37s3kylve0tz.R.inc(10259);
            __CLR4_4_17s37s3kylve0tz.R.inc(10260);results.add(directory);
            __CLR4_4_17s37s3kylve0tz.R.inc(10261);if ((((cancelFileName.equals(directory.getName()))&&(__CLR4_4_17s37s3kylve0tz.R.iget(10262)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10263)==0&false))) {{
                __CLR4_4_17s37s3kylve0tz.R.inc(10264);throw new CancelException(directory, depth);
            }
        }}finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles a file by adding the File to the result set. */
        @Override
        protected void handleFile(final File file, final int depth, final Collection<File> results) throws IOException {try{__CLR4_4_17s37s3kylve0tz.R.inc(10265);
            __CLR4_4_17s37s3kylve0tz.R.inc(10266);results.add(file);
            __CLR4_4_17s37s3kylve0tz.R.inc(10267);if ((((cancelFileName.equals(file.getName()))&&(__CLR4_4_17s37s3kylve0tz.R.iget(10268)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10269)==0&false))) {{
                __CLR4_4_17s37s3kylve0tz.R.inc(10270);throw new CancelException(file, depth);
            }
        }}finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles Cancel. */
        @Override
        protected void handleCancelled(final File startDirectory, final Collection<File> results,
                       final CancelException cancel) throws IOException {try{__CLR4_4_17s37s3kylve0tz.R.inc(10271);
            __CLR4_4_17s37s3kylve0tz.R.inc(10272);if ((((!suppressCancel)&&(__CLR4_4_17s37s3kylve0tz.R.iget(10273)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10274)==0&false))) {{
                __CLR4_4_17s37s3kylve0tz.R.inc(10275);super.handleCancelled(startDirectory, results, cancel);
            }
        }}finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}
    }

    /**
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
    static class TestMultiThreadCancelWalker extends DirectoryWalker<File> {
        private final String cancelFileName;
        private final boolean suppressCancel;
        private boolean cancelled;
        public List<File> results;

        TestMultiThreadCancelWalker(final String cancelFileName, final boolean suppressCancel) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10276);
            __CLR4_4_17s37s3kylve0tz.R.inc(10277);this.cancelFileName = cancelFileName;
            __CLR4_4_17s37s3kylve0tz.R.inc(10278);this.suppressCancel = suppressCancel;
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** find files. */
        protected List<File> find(final File startDirectory) throws IOException {try{__CLR4_4_17s37s3kylve0tz.R.inc(10279);
           __CLR4_4_17s37s3kylve0tz.R.inc(10280);results = new ArrayList<>();
           __CLR4_4_17s37s3kylve0tz.R.inc(10281);walk(startDirectory, results);
           __CLR4_4_17s37s3kylve0tz.R.inc(10282);return results;
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles a directory end by adding the File to the result set. */
        @Override
        protected void handleDirectoryEnd(final File directory, final int depth, final Collection<File> results) throws IOException {try{__CLR4_4_17s37s3kylve0tz.R.inc(10283);
            __CLR4_4_17s37s3kylve0tz.R.inc(10284);results.add(directory);
            __CLR4_4_17s37s3kylve0tz.R.inc(10285);assertFalse(cancelled);
            __CLR4_4_17s37s3kylve0tz.R.inc(10286);if ((((cancelFileName.equals(directory.getName()))&&(__CLR4_4_17s37s3kylve0tz.R.iget(10287)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10288)==0&false))) {{
                __CLR4_4_17s37s3kylve0tz.R.inc(10289);cancelled = true;
            }
        }}finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles a file by adding the File to the result set. */
        @Override
        protected void handleFile(final File file, final int depth, final Collection<File> results) throws IOException {try{__CLR4_4_17s37s3kylve0tz.R.inc(10290);
            __CLR4_4_17s37s3kylve0tz.R.inc(10291);results.add(file);
            __CLR4_4_17s37s3kylve0tz.R.inc(10292);assertFalse(cancelled);
            __CLR4_4_17s37s3kylve0tz.R.inc(10293);if ((((cancelFileName.equals(file.getName()))&&(__CLR4_4_17s37s3kylve0tz.R.iget(10294)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10295)==0&false))) {{
                __CLR4_4_17s37s3kylve0tz.R.inc(10296);cancelled = true;
            }
        }}finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles Cancelled. */
        @Override
        protected boolean handleIsCancelled(final File file, final int depth, final Collection<File> results) throws IOException {try{__CLR4_4_17s37s3kylve0tz.R.inc(10297);
            __CLR4_4_17s37s3kylve0tz.R.inc(10298);return cancelled;
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles Cancel. */
        @Override
        protected void handleCancelled(final File startDirectory, final Collection<File> results,
                       final CancelException cancel) throws IOException {try{__CLR4_4_17s37s3kylve0tz.R.inc(10299);
            __CLR4_4_17s37s3kylve0tz.R.inc(10300);if ((((!suppressCancel)&&(__CLR4_4_17s37s3kylve0tz.R.iget(10301)!=0|true))||(__CLR4_4_17s37s3kylve0tz.R.iget(10302)==0&false))) {{
                __CLR4_4_17s37s3kylve0tz.R.inc(10303);super.handleCancelled(startDirectory, results, cancel);
            }
        }}finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}
    }

    /**
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
    private static class TestFileFinderString extends DirectoryWalker<String> {

        protected TestFileFinderString(final FileFilter filter, final int depthLimit) {
            super(filter, depthLimit);__CLR4_4_17s37s3kylve0tz.R.inc(10305);try{__CLR4_4_17s37s3kylve0tz.R.inc(10304);
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** find files. */
        protected List<String> find(final File startDirectory) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10306);
           __CLR4_4_17s37s3kylve0tz.R.inc(10307);final List<String> results = new ArrayList<>();
           __CLR4_4_17s37s3kylve0tz.R.inc(10308);try {
               __CLR4_4_17s37s3kylve0tz.R.inc(10309);walk(startDirectory, results);
           } catch(final IOException ex) {
               __CLR4_4_17s37s3kylve0tz.R.inc(10310);fail(ex.toString());
           }
           __CLR4_4_17s37s3kylve0tz.R.inc(10311);return results;
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}

        /** Handles a file by adding the File to the result set. */
        @Override
        protected void handleFile(final File file, final int depth, final Collection<String> results) {try{__CLR4_4_17s37s3kylve0tz.R.inc(10312);
            __CLR4_4_17s37s3kylve0tz.R.inc(10313);results.add(file.toString());
        }finally{__CLR4_4_17s37s3kylve0tz.R.flushNeeded();}}
    }

}
