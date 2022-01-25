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

import java.io.File;
import java.nio.file.Files;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Test cases for FileUtils.deleteDirectory() method.
 *
 */
public abstract class FileUtilsDeleteDirectoryBaseTestCase {static class __CLR4_4_18x78x7kylve11w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11685,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @TempDir
    public File top;

    protected abstract boolean setupSymlink(final File res, final File link) throws Exception;

    @Test
    public void testDeleteDirWithASymlinkDir() throws Exception {__CLR4_4_18x78x7kylve11w.R.globalSliceStart(getClass().getName(),11563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agxybi8x7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18x78x7kylve11w.R.rethrow($CLV_t2$);}finally{__CLR4_4_18x78x7kylve11w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDeleteDirectoryBaseTestCase.testDeleteDirWithASymlinkDir",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agxybi8x7() throws Exception{try{__CLR4_4_18x78x7kylve11w.R.inc(11563);

        __CLR4_4_18x78x7kylve11w.R.inc(11564);final File realOuter = new File(top, "realouter");
        __CLR4_4_18x78x7kylve11w.R.inc(11565);assertTrue(realOuter.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11566);final File realInner = new File(realOuter, "realinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11567);assertTrue(realInner.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11568);FileUtils.touch(new File(realInner, "file1"));
        __CLR4_4_18x78x7kylve11w.R.inc(11569);assertEquals(1, realInner.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11570);final File randomDirectory = new File(top, "randomDir");
        __CLR4_4_18x78x7kylve11w.R.inc(11571);assertTrue(randomDirectory.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11572);FileUtils.touch(new File(randomDirectory, "randomfile"));
        __CLR4_4_18x78x7kylve11w.R.inc(11573);assertEquals(1, randomDirectory.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11574);final File symlinkDirectory = new File(realOuter, "fakeinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11575);assertTrue(setupSymlink(randomDirectory, symlinkDirectory));

        __CLR4_4_18x78x7kylve11w.R.inc(11576);assertEquals(1, symlinkDirectory.list().length);

        // assert contents of the real directory were removed including the symlink
        __CLR4_4_18x78x7kylve11w.R.inc(11577);FileUtils.deleteDirectory(realOuter);
        __CLR4_4_18x78x7kylve11w.R.inc(11578);assertEquals(1, top.list().length);

        // ensure that the contents of the symlink were NOT removed.
        __CLR4_4_18x78x7kylve11w.R.inc(11579);assertEquals(1, randomDirectory.list().length, "Contents of sym link should not have been removed");
    }finally{__CLR4_4_18x78x7kylve11w.R.flushNeeded();}}

    @Test
    public void testDeleteDirWithASymlinkDir2() throws Exception {__CLR4_4_18x78x7kylve11w.R.globalSliceStart(getClass().getName(),11580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c84in68xo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18x78x7kylve11w.R.rethrow($CLV_t2$);}finally{__CLR4_4_18x78x7kylve11w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDeleteDirectoryBaseTestCase.testDeleteDirWithASymlinkDir2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c84in68xo() throws Exception{try{__CLR4_4_18x78x7kylve11w.R.inc(11580);

        __CLR4_4_18x78x7kylve11w.R.inc(11581);final File realOuter = new File(top, "realouter");
        __CLR4_4_18x78x7kylve11w.R.inc(11582);assertTrue(realOuter.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11583);final File realInner = new File(realOuter, "realinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11584);assertTrue(realInner.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11585);FileUtils.touch(new File(realInner, "file1"));
        __CLR4_4_18x78x7kylve11w.R.inc(11586);assertEquals(1, realInner.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11587);final File randomDirectory = new File(top, "randomDir");
        __CLR4_4_18x78x7kylve11w.R.inc(11588);assertTrue(randomDirectory.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11589);FileUtils.touch(new File(randomDirectory, "randomfile"));
        __CLR4_4_18x78x7kylve11w.R.inc(11590);assertEquals(1, randomDirectory.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11591);final File symlinkDirectory = new File(realOuter, "fakeinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11592);Files.createSymbolicLink(symlinkDirectory.toPath(), randomDirectory.toPath());

        __CLR4_4_18x78x7kylve11w.R.inc(11593);assertEquals(1, symlinkDirectory.list().length);

        // assert contents of the real directory were removed including the symlink
        __CLR4_4_18x78x7kylve11w.R.inc(11594);FileUtils.deleteDirectory(realOuter);
        __CLR4_4_18x78x7kylve11w.R.inc(11595);assertEquals(1, top.list().length);

        // ensure that the contents of the symlink were NOT removed.
        __CLR4_4_18x78x7kylve11w.R.inc(11596);assertEquals(1, randomDirectory.list().length, "Contents of sym link should not have been removed");
    }finally{__CLR4_4_18x78x7kylve11w.R.flushNeeded();}}

    @Test
    public void testDeleteDirWithSymlinkFile() throws Exception {__CLR4_4_18x78x7kylve11w.R.globalSliceStart(getClass().getName(),11597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tntksu8y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18x78x7kylve11w.R.rethrow($CLV_t2$);}finally{__CLR4_4_18x78x7kylve11w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDeleteDirectoryBaseTestCase.testDeleteDirWithSymlinkFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tntksu8y5() throws Exception{try{__CLR4_4_18x78x7kylve11w.R.inc(11597);
        __CLR4_4_18x78x7kylve11w.R.inc(11598);final File realOuter = new File(top, "realouter");
        __CLR4_4_18x78x7kylve11w.R.inc(11599);assertTrue(realOuter.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11600);final File realInner = new File(realOuter, "realinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11601);assertTrue(realInner.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11602);final File realFile = new File(realInner, "file1");
        __CLR4_4_18x78x7kylve11w.R.inc(11603);FileUtils.touch(realFile);

        __CLR4_4_18x78x7kylve11w.R.inc(11604);assertEquals(1, realInner.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11605);final File randomFile = new File(top, "randomfile");
        __CLR4_4_18x78x7kylve11w.R.inc(11606);FileUtils.touch(randomFile);

        __CLR4_4_18x78x7kylve11w.R.inc(11607);final File symlinkFile = new File(realInner, "fakeinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11608);assertTrue(setupSymlink(randomFile, symlinkFile));

        __CLR4_4_18x78x7kylve11w.R.inc(11609);assertEquals(2, realInner.list().length);
        __CLR4_4_18x78x7kylve11w.R.inc(11610);assertEquals(2, top.list().length);

        // assert the real directory were removed including the symlink
        __CLR4_4_18x78x7kylve11w.R.inc(11611);FileUtils.deleteDirectory(realOuter);
        __CLR4_4_18x78x7kylve11w.R.inc(11612);assertEquals(1, top.list().length);

        // ensure that the contents of the symlink were NOT removed.
        __CLR4_4_18x78x7kylve11w.R.inc(11613);assertTrue(randomFile.exists());
        __CLR4_4_18x78x7kylve11w.R.inc(11614);assertFalse(symlinkFile.exists());
    }finally{__CLR4_4_18x78x7kylve11w.R.flushNeeded();}}

    @Test
    public void testDeleteInvalidLinks() throws Exception {__CLR4_4_18x78x7kylve11w.R.globalSliceStart(getClass().getName(),11615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jnsmca8yn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18x78x7kylve11w.R.rethrow($CLV_t2$);}finally{__CLR4_4_18x78x7kylve11w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDeleteDirectoryBaseTestCase.testDeleteInvalidLinks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jnsmca8yn() throws Exception{try{__CLR4_4_18x78x7kylve11w.R.inc(11615);
        __CLR4_4_18x78x7kylve11w.R.inc(11616);final File aFile = new File(top, "realParentDirA");
        __CLR4_4_18x78x7kylve11w.R.inc(11617);assertTrue(aFile.mkdir());
        __CLR4_4_18x78x7kylve11w.R.inc(11618);final File bFile = new File(aFile, "realChildDirB");
        __CLR4_4_18x78x7kylve11w.R.inc(11619);assertTrue(bFile.mkdir());

        __CLR4_4_18x78x7kylve11w.R.inc(11620);final File cFile = new File(top, "realParentDirC");
        __CLR4_4_18x78x7kylve11w.R.inc(11621);assertTrue(cFile.mkdir());
        __CLR4_4_18x78x7kylve11w.R.inc(11622);final File dFile = new File(cFile, "realChildDirD");
        __CLR4_4_18x78x7kylve11w.R.inc(11623);assertTrue(dFile.mkdir());

        __CLR4_4_18x78x7kylve11w.R.inc(11624);final File linkToC = new File(bFile, "linkToC");
        __CLR4_4_18x78x7kylve11w.R.inc(11625);Files.createSymbolicLink(linkToC.toPath(), cFile.toPath());

        __CLR4_4_18x78x7kylve11w.R.inc(11626);final File linkToB = new File(dFile, "linkToB");
        __CLR4_4_18x78x7kylve11w.R.inc(11627);Files.createSymbolicLink(linkToB.toPath(), bFile.toPath());

        __CLR4_4_18x78x7kylve11w.R.inc(11628);FileUtils.deleteDirectory(aFile);
        __CLR4_4_18x78x7kylve11w.R.inc(11629);FileUtils.deleteDirectory(cFile);
        __CLR4_4_18x78x7kylve11w.R.inc(11630);assertEquals(0, top.list().length);
    }finally{__CLR4_4_18x78x7kylve11w.R.flushNeeded();}}

    @Test
    public void testDeleteParentSymlink() throws Exception {__CLR4_4_18x78x7kylve11w.R.globalSliceStart(getClass().getName(),11631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7jlgh8z3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18x78x7kylve11w.R.rethrow($CLV_t2$);}finally{__CLR4_4_18x78x7kylve11w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDeleteDirectoryBaseTestCase.testDeleteParentSymlink",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7jlgh8z3() throws Exception{try{__CLR4_4_18x78x7kylve11w.R.inc(11631);
        __CLR4_4_18x78x7kylve11w.R.inc(11632);final File realParent = new File(top, "realparent");
        __CLR4_4_18x78x7kylve11w.R.inc(11633);assertTrue(realParent.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11634);final File realInner = new File(realParent, "realinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11635);assertTrue(realInner.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11636);FileUtils.touch(new File(realInner, "file1"));
        __CLR4_4_18x78x7kylve11w.R.inc(11637);assertEquals(1, realInner.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11638);final File randomDirectory = new File(top, "randomDir");
        __CLR4_4_18x78x7kylve11w.R.inc(11639);assertTrue(randomDirectory.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11640);FileUtils.touch(new File(randomDirectory, "randomfile"));
        __CLR4_4_18x78x7kylve11w.R.inc(11641);assertEquals(1, randomDirectory.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11642);final File symlinkDirectory = new File(realParent, "fakeinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11643);assertTrue(setupSymlink(randomDirectory, symlinkDirectory));

        __CLR4_4_18x78x7kylve11w.R.inc(11644);assertEquals(1, symlinkDirectory.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11645);final File symlinkParentDirectory = new File(top, "fakeouter");
        __CLR4_4_18x78x7kylve11w.R.inc(11646);assertTrue(setupSymlink(realParent, symlinkParentDirectory));

        // assert only the symlink is deleted, but not followed
        __CLR4_4_18x78x7kylve11w.R.inc(11647);FileUtils.deleteDirectory(symlinkParentDirectory);
        __CLR4_4_18x78x7kylve11w.R.inc(11648);assertEquals(2, top.list().length);

        // ensure that the contents of the symlink were NOT removed.
        __CLR4_4_18x78x7kylve11w.R.inc(11649);assertEquals(1, randomDirectory.list().length, "Contents of sym link should not have been removed");
    }finally{__CLR4_4_18x78x7kylve11w.R.flushNeeded();}}

    @Test
    public void testDeleteParentSymlink2() throws Exception {__CLR4_4_18x78x7kylve11w.R.globalSliceStart(getClass().getName(),11650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7h5sx8zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18x78x7kylve11w.R.rethrow($CLV_t2$);}finally{__CLR4_4_18x78x7kylve11w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDeleteDirectoryBaseTestCase.testDeleteParentSymlink2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7h5sx8zm() throws Exception{try{__CLR4_4_18x78x7kylve11w.R.inc(11650);
        __CLR4_4_18x78x7kylve11w.R.inc(11651);final File realParent = new File(top, "realparent");
        __CLR4_4_18x78x7kylve11w.R.inc(11652);assertTrue(realParent.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11653);final File realInner = new File(realParent, "realinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11654);assertTrue(realInner.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11655);FileUtils.touch(new File(realInner, "file1"));
        __CLR4_4_18x78x7kylve11w.R.inc(11656);assertEquals(1, realInner.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11657);final File randomDirectory = new File(top, "randomDir");
        __CLR4_4_18x78x7kylve11w.R.inc(11658);assertTrue(randomDirectory.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11659);FileUtils.touch(new File(randomDirectory, "randomfile"));
        __CLR4_4_18x78x7kylve11w.R.inc(11660);assertEquals(1, randomDirectory.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11661);final File symlinkDirectory = new File(realParent, "fakeinner");
        __CLR4_4_18x78x7kylve11w.R.inc(11662);Files.createSymbolicLink(symlinkDirectory.toPath(), randomDirectory.toPath());

        __CLR4_4_18x78x7kylve11w.R.inc(11663);assertEquals(1, symlinkDirectory.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11664);final File symlinkParentDirectory = new File(top, "fakeouter");
        __CLR4_4_18x78x7kylve11w.R.inc(11665);Files.createSymbolicLink(symlinkParentDirectory.toPath(), realParent.toPath());

        // assert only the symlink is deleted, but not followed
        __CLR4_4_18x78x7kylve11w.R.inc(11666);FileUtils.deleteDirectory(symlinkParentDirectory);
        __CLR4_4_18x78x7kylve11w.R.inc(11667);assertEquals(2, top.list().length);

        // ensure that the contents of the symlink were NOT removed.
        __CLR4_4_18x78x7kylve11w.R.inc(11668);assertEquals(1, randomDirectory.list().length, "Contents of sym link should not have been removed");
    }finally{__CLR4_4_18x78x7kylve11w.R.flushNeeded();}}

    @Test
    public void testDeletesNested() throws Exception {__CLR4_4_18x78x7kylve11w.R.globalSliceStart(getClass().getName(),11669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4u4qc905();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18x78x7kylve11w.R.rethrow($CLV_t2$);}finally{__CLR4_4_18x78x7kylve11w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDeleteDirectoryBaseTestCase.testDeletesNested",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4u4qc905() throws Exception{try{__CLR4_4_18x78x7kylve11w.R.inc(11669);
        __CLR4_4_18x78x7kylve11w.R.inc(11670);final File nested = new File(top, "nested");
        __CLR4_4_18x78x7kylve11w.R.inc(11671);assertTrue(nested.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11672);assertEquals(1, top.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11673);FileUtils.touch(new File(nested, "regular"));
        __CLR4_4_18x78x7kylve11w.R.inc(11674);FileUtils.touch(new File(nested, ".hidden"));

        __CLR4_4_18x78x7kylve11w.R.inc(11675);assertEquals(2, nested.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11676);FileUtils.deleteDirectory(nested);

        __CLR4_4_18x78x7kylve11w.R.inc(11677);assertEquals(0, top.list().length);
    }finally{__CLR4_4_18x78x7kylve11w.R.flushNeeded();}}

    @Test
    public void testDeletesRegular() throws Exception {__CLR4_4_18x78x7kylve11w.R.globalSliceStart(getClass().getName(),11678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tu8a3190e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18x78x7kylve11w.R.rethrow($CLV_t2$);}finally{__CLR4_4_18x78x7kylve11w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDeleteDirectoryBaseTestCase.testDeletesRegular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tu8a3190e() throws Exception{try{__CLR4_4_18x78x7kylve11w.R.inc(11678);
        __CLR4_4_18x78x7kylve11w.R.inc(11679);final File nested = new File(top, "nested");
        __CLR4_4_18x78x7kylve11w.R.inc(11680);assertTrue(nested.mkdirs());

        __CLR4_4_18x78x7kylve11w.R.inc(11681);assertEquals(1, top.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11682);assertEquals(0, nested.list().length);

        __CLR4_4_18x78x7kylve11w.R.inc(11683);FileUtils.deleteDirectory(nested);

        __CLR4_4_18x78x7kylve11w.R.inc(11684);assertEquals(0, top.list().length);
    }finally{__CLR4_4_18x78x7kylve11w.R.flushNeeded();}}

}
