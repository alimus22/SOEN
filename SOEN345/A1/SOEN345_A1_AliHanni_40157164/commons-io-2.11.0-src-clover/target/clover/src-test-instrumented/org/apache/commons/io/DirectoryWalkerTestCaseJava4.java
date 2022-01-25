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
import org.apache.commons.io.filefilter.OrFileFilter;
import org.junit.jupiter.api.Test;

/**
 * This is used to test DirectoryWalker for correctness when using Java4 (i.e. no generics).
 *
 * @see DirectoryWalker
 */
@SuppressWarnings({"unchecked", "rawtypes"}) // Java4
public class DirectoryWalkerTestCaseJava4 {static class __CLR4_4_17yi7yikylve0v4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,10517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Directories
    private static final File current = new File(".");
    private static final File javaDir = new File("src/main/java");
    private static final File orgDir = new File(javaDir, "org");
    private static final File apacheDir = new File(orgDir, "apache");
    private static final File commonsDir = new File(apacheDir, "commons");
    private static final File ioDir = new File(commonsDir, "io");
    private static final File outputDir = new File(ioDir, "output");
    private static final File[] dirs = {orgDir, apacheDir, commonsDir, ioDir, outputDir};

    // Files
    private static final File filenameUtils = new File(ioDir, "FilenameUtils.java");
    private static final File ioUtils = new File(ioDir, "IOUtils.java");
    private static final File proxyWriter = new File(outputDir, "ProxyWriter.java");
    private static final File nullStream = new File(outputDir, "NullOutputStream.java");
    private static final File[] ioFiles = {filenameUtils, ioUtils};
    private static final File[] outputFiles = {proxyWriter, nullStream};

    // Filters
    private static final IOFileFilter dirsFilter = createNameFilter(dirs);
    private static final IOFileFilter iofilesFilter = createNameFilter(ioFiles);
    private static final IOFileFilter outputFilesFilter = createNameFilter(outputFiles);
    private static final IOFileFilter ioDirAndFilesFilter = new OrFileFilter(dirsFilter, iofilesFilter);
    private static final IOFileFilter dirsAndFilesFilter = new OrFileFilter(ioDirAndFilesFilter, outputFilesFilter);

    // Filter to exclude SVN files
    private static final IOFileFilter NOT_SVN = FileFilterUtils.makeSVNAware(null);


    /**
     * Test Filtering
     */
    @Test
    public void testFilter() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqdvap7yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testFilter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqdvap7yi(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10314);
        __CLR4_4_17yi7yikylve0v4.R.inc(10315);final List<File> results = new TestFileFinder(dirsAndFilesFilter, -1).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10316);assertEquals(1 + dirs.length + ioFiles.length + outputFiles.length, results.size(), "Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10317);assertTrue(results.contains(javaDir), "Start Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10318);checkContainsFiles("Dir", dirs, results);
        __CLR4_4_17yi7yikylve0v4.R.inc(10319);checkContainsFiles("IO File", ioFiles, results);
        __CLR4_4_17yi7yikylve0v4.R.inc(10320);checkContainsFiles("Output File", outputFiles, results);
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test Filtering and limit to depth 0
     */
    @Test
    public void testFilterAndLimitA() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgvnra7yp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testFilterAndLimitA",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgvnra7yp(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10321);
        __CLR4_4_17yi7yikylve0v4.R.inc(10322);final List<File> results = new TestFileFinder(NOT_SVN, 0).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10323);assertEquals(1, results.size(), "[A] Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10324);assertTrue(results.contains(javaDir), "[A] Start Dir");
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test Filtering and limit to depth 1
     */
    @Test
    public void testFilterAndLimitB() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e7voyt7yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testFilterAndLimitB",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e7voyt7yt(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10325);
        __CLR4_4_17yi7yikylve0v4.R.inc(10326);final List<File> results = new TestFileFinder(NOT_SVN, 1).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10327);assertEquals(2, results.size(), "[B] Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10328);assertTrue(results.contains(javaDir), "[B] Start Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10329);assertTrue(results.contains(orgDir), "[B] Org Dir");
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test Filtering and limit to depth 3
     */
    @Test
    public void testFilterAndLimitC() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayvq6c7yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testFilterAndLimitC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayvq6c7yy(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10330);
        __CLR4_4_17yi7yikylve0v4.R.inc(10331);final List<File> results = new TestFileFinder(NOT_SVN, 3).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10332);assertEquals(4, results.size(), "[C] Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10333);assertTrue(results.contains(javaDir), "[C] Start Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10334);assertTrue(results.contains(orgDir), "[C] Org Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10335);assertTrue(results.contains(apacheDir), "[C] Apache Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10336);assertTrue(results.contains(commonsDir), "[C] Commons Dir");
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test Filtering and limit to depth 5
     */
    @Test
    public void testFilterAndLimitD() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pvrdv7z5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testFilterAndLimitD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pvrdv7z5(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10337);
        __CLR4_4_17yi7yikylve0v4.R.inc(10338);final List<File> results = new TestFileFinder(dirsAndFilesFilter, 5).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10339);assertEquals(1 + dirs.length + ioFiles.length, results.size(), "[D] Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10340);assertTrue(results.contains(javaDir), "[D] Start Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10341);checkContainsFiles("[D] Dir", dirs, results);
        __CLR4_4_17yi7yikylve0v4.R.inc(10342);checkContainsFiles("[D] File", ioFiles, results);
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test separate dir and file filters
     */
    @Test
    public void testFilterDirAndFile1() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1boewt47zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testFilterDirAndFile1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1boewt47zb(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10343);
        __CLR4_4_17yi7yikylve0v4.R.inc(10344);final List<File> results = new TestFileFinder(dirsFilter, iofilesFilter, -1).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10345);assertEquals(1 + dirs.length + ioFiles.length, results.size(), "[DirAndFile1] Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10346);assertTrue(results.contains(javaDir), "[DirAndFile1] Start Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10347);checkContainsFiles("[DirAndFile1] Dir", dirs, results);
        __CLR4_4_17yi7yikylve0v4.R.inc(10348);checkContainsFiles("[DirAndFile1] File", ioFiles, results);
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test separate dir and file filters
     */
    @Test
    public void testFilterDirAndFile2() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fey0n7zh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testFilterDirAndFile2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fey0n7zh(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10349);
        __CLR4_4_17yi7yikylve0v4.R.inc(10350);final List<File> results = new TestFileFinder(null, null, -1).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10351);assertTrue(results.size() > 1 + dirs.length + ioFiles.length, "[DirAndFile2] Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10352);assertTrue(results.contains(javaDir), "[DirAndFile2] Start Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10353);checkContainsFiles("[DirAndFile2] Dir", dirs, results);
        __CLR4_4_17yi7yikylve0v4.R.inc(10354);checkContainsFiles("[DirAndFile2] File", ioFiles, results);
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test separate dir and file filters
     */
    @Test
    public void testFilterDirAndFile3() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156ez867zn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testFilterDirAndFile3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156ez867zn(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10355);
        __CLR4_4_17yi7yikylve0v4.R.inc(10356);final List<File> results = new TestFileFinder(dirsFilter, null, -1).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10357);final List resultDirs = directoriesOnly(results);
        __CLR4_4_17yi7yikylve0v4.R.inc(10358);assertEquals(1 + dirs.length, resultDirs.size(), "[DirAndFile3] Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10359);assertTrue(results.contains(javaDir), "[DirAndFile3] Start Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10360);checkContainsFiles("[DirAndFile3] Dir", dirs, resultDirs);
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test separate dir and file filters
     */
    @Test
    public void testFilterDirAndFile4() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xf0fp7zt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testFilterDirAndFile4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xf0fp7zt(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10361);
        __CLR4_4_17yi7yikylve0v4.R.inc(10362);final List<File> results = new TestFileFinder(null, iofilesFilter, -1).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10363);final List resultFiles = filesOnly(results);
        __CLR4_4_17yi7yikylve0v4.R.inc(10364);assertEquals(ioFiles.length, resultFiles.size(), "[DirAndFile4] Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10365);assertTrue(results.contains(javaDir), "[DirAndFile4] Start Dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10366);checkContainsFiles("[DirAndFile4] File", ioFiles, resultFiles);
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test Limiting to current directory
     */
    @Test
    public void testLimitToCurrent() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15g2mzg7zz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testLimitToCurrent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15g2mzg7zz(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10367);
        __CLR4_4_17yi7yikylve0v4.R.inc(10368);final List<File> results = new TestFileFinder(null, 0).find(current);
        __CLR4_4_17yi7yikylve0v4.R.inc(10369);assertEquals(1, results.size(), "Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10370);assertTrue(results.contains(new File(".")), "Current Dir");
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * test an invalid start directory
     */
    @Test
    public void testMissingStartDirectory() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mei6ue803();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testMissingStartDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mei6ue803(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10371);

        // TODO is this what we want with invalid directory?
        __CLR4_4_17yi7yikylve0v4.R.inc(10372);final File invalidDir = new File("invalid-dir");
        __CLR4_4_17yi7yikylve0v4.R.inc(10373);final List<File> results = new TestFileFinder(null, -1).find(invalidDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10374);assertEquals(1, results.size(), "Result Size");
        __CLR4_4_17yi7yikylve0v4.R.inc(10375);assertTrue(results.contains(invalidDir), "Current Dir");

        __CLR4_4_17yi7yikylve0v4.R.inc(10376);try {
            __CLR4_4_17yi7yikylve0v4.R.inc(10377);new TestFileFinder(null, -1).find(null);
            __CLR4_4_17yi7yikylve0v4.R.inc(10378);fail("Null start directory didn't throw Exception");
        } catch (final NullPointerException ignore) {
            // expected result
        }
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * test an invalid start directory
     */
    @Test
    public void testHandleStartDirectoryFalse() {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1woaf7f80b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testHandleStartDirectoryFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1woaf7f80b(){try{__CLR4_4_17yi7yikylve0v4.R.inc(10379);

        __CLR4_4_17yi7yikylve0v4.R.inc(10380);final List<File> results = new TestFalseFileFinder(null, -1).find(current);
        __CLR4_4_17yi7yikylve0v4.R.inc(10381);assertEquals(0, results.size(), "Result Size");

    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    // ------------ Convenience Test Methods ------------------------------------

    /**
     * Check the files in the array are in the results list.
     */
    private void checkContainsFiles(final String prefix, final File[] files, final Collection results) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10382);
        __CLR4_4_17yi7yikylve0v4.R.inc(10383);for (int i = 0; (((i < files.length)&&(__CLR4_4_17yi7yikylve0v4.R.iget(10384)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10385)==0&false)); i++) {{
            __CLR4_4_17yi7yikylve0v4.R.inc(10386);assertTrue(results.contains(files[i]), prefix + "[" + i + "] " + files[i]);
        }
    }}finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Extract the directories.
     */
    private List directoriesOnly(final Collection<File> results) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10387);
        __CLR4_4_17yi7yikylve0v4.R.inc(10388);final List list = new ArrayList(results.size());
        __CLR4_4_17yi7yikylve0v4.R.inc(10389);for (final File file : results) {{
            __CLR4_4_17yi7yikylve0v4.R.inc(10390);if ((((file.isDirectory())&&(__CLR4_4_17yi7yikylve0v4.R.iget(10391)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10392)==0&false))) {{
                __CLR4_4_17yi7yikylve0v4.R.inc(10393);list.add(file);
            }
        }}
        }__CLR4_4_17yi7yikylve0v4.R.inc(10394);return list;
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Extract the files.
     */
    private List filesOnly(final Collection<File> results) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10395);
        __CLR4_4_17yi7yikylve0v4.R.inc(10396);final List list = new ArrayList(results.size());
        __CLR4_4_17yi7yikylve0v4.R.inc(10397);for (final File file : results) {{
            __CLR4_4_17yi7yikylve0v4.R.inc(10398);if ((((file.isFile())&&(__CLR4_4_17yi7yikylve0v4.R.iget(10399)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10400)==0&false))) {{
                __CLR4_4_17yi7yikylve0v4.R.inc(10401);list.add(file);
            }
        }}
        }__CLR4_4_17yi7yikylve0v4.R.inc(10402);return list;
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Create a name filter containing the names of the files
     * in the array.
     */
    private static IOFileFilter createNameFilter(final File[] files) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10403);
        __CLR4_4_17yi7yikylve0v4.R.inc(10404);final String[] names = new String[files.length];
        __CLR4_4_17yi7yikylve0v4.R.inc(10405);for (int i = 0; (((i < files.length)&&(__CLR4_4_17yi7yikylve0v4.R.iget(10406)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10407)==0&false)); i++) {{
            __CLR4_4_17yi7yikylve0v4.R.inc(10408);names[i] = files[i].getName();
        }
        }__CLR4_4_17yi7yikylve0v4.R.inc(10409);return new NameFileFilter(names);
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test Cancel
     * @throws IOException
     */
    @Test
    public void testCancel() throws IOException {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pw5rbh816();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testCancel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pw5rbh816() throws IOException{try{__CLR4_4_17yi7yikylve0v4.R.inc(10410);
        __CLR4_4_17yi7yikylve0v4.R.inc(10411);String cancelName = null;

        // Cancel on a file
        __CLR4_4_17yi7yikylve0v4.R.inc(10412);try {
            __CLR4_4_17yi7yikylve0v4.R.inc(10413);cancelName = "DirectoryWalker.java";
            __CLR4_4_17yi7yikylve0v4.R.inc(10414);new TestCancelWalker(cancelName, false).find(javaDir);
            __CLR4_4_17yi7yikylve0v4.R.inc(10415);fail("CancelException not thrown for '" + cancelName + "'");
        } catch (final DirectoryWalker.CancelException cancel) {
            __CLR4_4_17yi7yikylve0v4.R.inc(10416);assertEquals(cancelName, cancel.getFile().getName(), "File:  " + cancelName);
            __CLR4_4_17yi7yikylve0v4.R.inc(10417);assertEquals(5, cancel.getDepth(), "Depth: " + cancelName);
        }

        // Cancel on a directory
        __CLR4_4_17yi7yikylve0v4.R.inc(10418);try {
            __CLR4_4_17yi7yikylve0v4.R.inc(10419);cancelName = "commons";
            __CLR4_4_17yi7yikylve0v4.R.inc(10420);new TestCancelWalker(cancelName, false).find(javaDir);
            __CLR4_4_17yi7yikylve0v4.R.inc(10421);fail("CancelException not thrown for '" + cancelName + "'");
        } catch (final DirectoryWalker.CancelException cancel) {
            __CLR4_4_17yi7yikylve0v4.R.inc(10422);assertEquals(cancelName, cancel.getFile().getName(), "File:  " + cancelName);
            __CLR4_4_17yi7yikylve0v4.R.inc(10423);assertEquals(3, cancel.getDepth(), "Depth: " + cancelName);
        }

        // Suppress CancelException (use same file name as preceding test)
        __CLR4_4_17yi7yikylve0v4.R.inc(10424);final List results = new TestCancelWalker(cancelName, true).find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10425);final File lastFile = (File) results.get(results.size() - 1);
        __CLR4_4_17yi7yikylve0v4.R.inc(10426);assertEquals(cancelName, lastFile.getName(), "Suppress:  " + cancelName);
    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    /**
     * Test Cancel
     * @throws IOException
     */
    @Test
    public void testMultiThreadCancel() throws IOException {__CLR4_4_17yi7yikylve0v4.R.globalSliceStart(getClass().getName(),10427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142o0pa81n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17yi7yikylve0v4.R.rethrow($CLV_t2$);}finally{__CLR4_4_17yi7yikylve0v4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DirectoryWalkerTestCaseJava4.testMultiThreadCancel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142o0pa81n() throws IOException{try{__CLR4_4_17yi7yikylve0v4.R.inc(10427);
        __CLR4_4_17yi7yikylve0v4.R.inc(10428);String cancelName = "DirectoryWalker.java";
        __CLR4_4_17yi7yikylve0v4.R.inc(10429);TestMultiThreadCancelWalker walker = new TestMultiThreadCancelWalker(cancelName, false);
        // Cancel on a file
        __CLR4_4_17yi7yikylve0v4.R.inc(10430);try {
            __CLR4_4_17yi7yikylve0v4.R.inc(10431);walker.find(javaDir);
            __CLR4_4_17yi7yikylve0v4.R.inc(10432);fail("CancelException not thrown for '" + cancelName + "'");
        } catch (final DirectoryWalker.CancelException cancel) {
            __CLR4_4_17yi7yikylve0v4.R.inc(10433);final File last = (File) walker.results.get(walker.results.size() - 1);
            __CLR4_4_17yi7yikylve0v4.R.inc(10434);assertEquals(cancelName, last.getName());
            __CLR4_4_17yi7yikylve0v4.R.inc(10435);assertEquals(5, cancel.getDepth(), "Depth: " + cancelName);
        }

        // Cancel on a directory
        __CLR4_4_17yi7yikylve0v4.R.inc(10436);try {
            __CLR4_4_17yi7yikylve0v4.R.inc(10437);cancelName = "commons";
            __CLR4_4_17yi7yikylve0v4.R.inc(10438);walker = new TestMultiThreadCancelWalker(cancelName, false);
            __CLR4_4_17yi7yikylve0v4.R.inc(10439);walker.find(javaDir);
            __CLR4_4_17yi7yikylve0v4.R.inc(10440);fail("CancelException not thrown for '" + cancelName + "'");
        } catch (final DirectoryWalker.CancelException cancel) {
            __CLR4_4_17yi7yikylve0v4.R.inc(10441);assertEquals(cancelName, cancel.getFile().getName(), "File:  " + cancelName);
            __CLR4_4_17yi7yikylve0v4.R.inc(10442);assertEquals(3, cancel.getDepth(), "Depth: " + cancelName);
        }

        // Suppress CancelException (use same file name as preceding test)
        __CLR4_4_17yi7yikylve0v4.R.inc(10443);walker = new TestMultiThreadCancelWalker(cancelName, true);
        __CLR4_4_17yi7yikylve0v4.R.inc(10444);final List results = walker.find(javaDir);
        __CLR4_4_17yi7yikylve0v4.R.inc(10445);final File lastFile = (File) results.get(results.size() - 1);
        __CLR4_4_17yi7yikylve0v4.R.inc(10446);assertEquals(cancelName, lastFile.getName(), "Suppress:  " + cancelName);

    }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

    // ------------ Test DirectoryWalker implementation --------------------------

    /**
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
    private static class TestFileFinder extends DirectoryWalker {

        protected TestFileFinder(final FileFilter filter, final int depthLimit) {
            super(filter, depthLimit);__CLR4_4_17yi7yikylve0v4.R.inc(10448);try{__CLR4_4_17yi7yikylve0v4.R.inc(10447);
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        protected TestFileFinder(final IOFileFilter dirFilter, final IOFileFilter fileFilter, final int depthLimit) {
            super(dirFilter, fileFilter, depthLimit);__CLR4_4_17yi7yikylve0v4.R.inc(10450);try{__CLR4_4_17yi7yikylve0v4.R.inc(10449);
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * find files.
         */
        protected List<File> find(final File startDirectory) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10451);
            __CLR4_4_17yi7yikylve0v4.R.inc(10452);final List<File> results = new ArrayList<>();
            __CLR4_4_17yi7yikylve0v4.R.inc(10453);try {
                __CLR4_4_17yi7yikylve0v4.R.inc(10454);walk(startDirectory, results);
            } catch (final IOException ex) {
                __CLR4_4_17yi7yikylve0v4.R.inc(10455);fail(ex.toString());
            }
            __CLR4_4_17yi7yikylve0v4.R.inc(10456);return results;
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Handles a directory end by adding the File to the result set.
         */
        @Override
        protected void handleDirectoryEnd(final File directory, final int depth, final Collection results) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10457);
            __CLR4_4_17yi7yikylve0v4.R.inc(10458);results.add(directory);
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Handles a file by adding the File to the result set.
         */
        @Override
        protected void handleFile(final File file, final int depth, final Collection results) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10459);
            __CLR4_4_17yi7yikylve0v4.R.inc(10460);results.add(file);
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}
    }

    // ------------ Test DirectoryWalker implementation --------------------------

    /**
     * Test DirectoryWalker implementation that always returns false
     * from handleDirectoryStart()
     */
    private static class TestFalseFileFinder extends TestFileFinder {

        protected TestFalseFileFinder(final FileFilter filter, final int depthLimit) {
            super(filter, depthLimit);__CLR4_4_17yi7yikylve0v4.R.inc(10462);try{__CLR4_4_17yi7yikylve0v4.R.inc(10461);
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Always returns false.
         */
        @Override
        protected boolean handleDirectory(final File directory, final int depth, final Collection results) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10463);
            __CLR4_4_17yi7yikylve0v4.R.inc(10464);return false;
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}
    }

    // ------------ Test DirectoryWalker implementation --------------------------

    /**
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
    static class TestCancelWalker extends DirectoryWalker {
        private final String cancelFileName;
        private final boolean suppressCancel;

        TestCancelWalker(final String cancelFileName, final boolean suppressCancel) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10465);
            __CLR4_4_17yi7yikylve0v4.R.inc(10466);this.cancelFileName = cancelFileName;
            __CLR4_4_17yi7yikylve0v4.R.inc(10467);this.suppressCancel = suppressCancel;
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * find files.
         */
        protected List find(final File startDirectory) throws IOException {try{__CLR4_4_17yi7yikylve0v4.R.inc(10468);
            __CLR4_4_17yi7yikylve0v4.R.inc(10469);final List results = new ArrayList();
            __CLR4_4_17yi7yikylve0v4.R.inc(10470);walk(startDirectory, results);
            __CLR4_4_17yi7yikylve0v4.R.inc(10471);return results;
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Handles a directory end by adding the File to the result set.
         */
        @Override
        protected void handleDirectoryEnd(final File directory, final int depth, final Collection results) throws IOException {try{__CLR4_4_17yi7yikylve0v4.R.inc(10472);
            __CLR4_4_17yi7yikylve0v4.R.inc(10473);results.add(directory);
            __CLR4_4_17yi7yikylve0v4.R.inc(10474);if ((((cancelFileName.equals(directory.getName()))&&(__CLR4_4_17yi7yikylve0v4.R.iget(10475)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10476)==0&false))) {{
                __CLR4_4_17yi7yikylve0v4.R.inc(10477);throw new CancelException(directory, depth);
            }
        }}finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Handles a file by adding the File to the result set.
         */
        @Override
        protected void handleFile(final File file, final int depth, final Collection results) throws IOException {try{__CLR4_4_17yi7yikylve0v4.R.inc(10478);
            __CLR4_4_17yi7yikylve0v4.R.inc(10479);results.add(file);
            __CLR4_4_17yi7yikylve0v4.R.inc(10480);if ((((cancelFileName.equals(file.getName()))&&(__CLR4_4_17yi7yikylve0v4.R.iget(10481)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10482)==0&false))) {{
                __CLR4_4_17yi7yikylve0v4.R.inc(10483);throw new CancelException(file, depth);
            }
        }}finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Handles Cancel.
         */
        @Override
        protected void handleCancelled(final File startDirectory, final Collection results,
                                       final CancelException cancel) throws IOException {try{__CLR4_4_17yi7yikylve0v4.R.inc(10484);
            __CLR4_4_17yi7yikylve0v4.R.inc(10485);if ((((!suppressCancel)&&(__CLR4_4_17yi7yikylve0v4.R.iget(10486)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10487)==0&false))) {{
                __CLR4_4_17yi7yikylve0v4.R.inc(10488);super.handleCancelled(startDirectory, results, cancel);
            }
        }}finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}
    }

    /**
     * Test DirectoryWalker implementation that finds files in a directory hierarchy
     * applying a file filter.
     */
    static class TestMultiThreadCancelWalker extends DirectoryWalker {
        private final String cancelFileName;
        private final boolean suppressCancel;
        private boolean cancelled;
        public List results;

        TestMultiThreadCancelWalker(final String cancelFileName, final boolean suppressCancel) {try{__CLR4_4_17yi7yikylve0v4.R.inc(10489);
            __CLR4_4_17yi7yikylve0v4.R.inc(10490);this.cancelFileName = cancelFileName;
            __CLR4_4_17yi7yikylve0v4.R.inc(10491);this.suppressCancel = suppressCancel;
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * find files.
         */
        protected List find(final File startDirectory) throws IOException {try{__CLR4_4_17yi7yikylve0v4.R.inc(10492);
            __CLR4_4_17yi7yikylve0v4.R.inc(10493);results = new ArrayList();
            __CLR4_4_17yi7yikylve0v4.R.inc(10494);walk(startDirectory, results);
            __CLR4_4_17yi7yikylve0v4.R.inc(10495);return results;
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Handles a directory end by adding the File to the result set.
         */
        @Override
        protected void handleDirectoryEnd(final File directory, final int depth, final Collection results) throws IOException {try{__CLR4_4_17yi7yikylve0v4.R.inc(10496);
            __CLR4_4_17yi7yikylve0v4.R.inc(10497);results.add(directory);
            __CLR4_4_17yi7yikylve0v4.R.inc(10498);assertFalse(cancelled);
            __CLR4_4_17yi7yikylve0v4.R.inc(10499);if ((((cancelFileName.equals(directory.getName()))&&(__CLR4_4_17yi7yikylve0v4.R.iget(10500)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10501)==0&false))) {{
                __CLR4_4_17yi7yikylve0v4.R.inc(10502);cancelled = true;
            }
        }}finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Handles a file by adding the File to the result set.
         */
        @Override
        protected void handleFile(final File file, final int depth, final Collection results) throws IOException {try{__CLR4_4_17yi7yikylve0v4.R.inc(10503);
            __CLR4_4_17yi7yikylve0v4.R.inc(10504);results.add(file);
            __CLR4_4_17yi7yikylve0v4.R.inc(10505);assertFalse(cancelled);
            __CLR4_4_17yi7yikylve0v4.R.inc(10506);if ((((cancelFileName.equals(file.getName()))&&(__CLR4_4_17yi7yikylve0v4.R.iget(10507)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10508)==0&false))) {{
                __CLR4_4_17yi7yikylve0v4.R.inc(10509);cancelled = true;
            }
        }}finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Handles Cancelled.
         */
        @Override
        protected boolean handleIsCancelled(final File file, final int depth, final Collection results) throws IOException {try{__CLR4_4_17yi7yikylve0v4.R.inc(10510);
            __CLR4_4_17yi7yikylve0v4.R.inc(10511);return cancelled;
        }finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}

        /**
         * Handles Cancel.
         */
        @Override
        protected void handleCancelled(final File startDirectory, final Collection results,
                                       final CancelException cancel) throws IOException {try{__CLR4_4_17yi7yikylve0v4.R.inc(10512);
            __CLR4_4_17yi7yikylve0v4.R.inc(10513);if ((((!suppressCancel)&&(__CLR4_4_17yi7yikylve0v4.R.iget(10514)!=0|true))||(__CLR4_4_17yi7yikylve0v4.R.iget(10515)==0&false))) {{
                __CLR4_4_17yi7yikylve0v4.R.inc(10516);super.handleCancelled(startDirectory, results, cancel);
            }
        }}finally{__CLR4_4_17yi7yikylve0v4.R.flushNeeded();}}
    }

}
