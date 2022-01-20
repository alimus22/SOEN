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
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Test cases for FileUtils.cleanDirectory() method that involve symlinks.
 * &amp; FileUtils.isSymlink(File file)
 */
public class FileUtilsCleanSymlinksTestCase {static class __CLR4_4_18re8rekylve10t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11494,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File top;

    @Test
    public void testCleanDirWithSymlinkFile() throws Exception {__CLR4_4_18re8rekylve10t.R.globalSliceStart(getClass().getName(),11354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x89c5k8re();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18re8rekylve10t.R.rethrow($CLV_t2$);}finally{__CLR4_4_18re8rekylve10t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanSymlinksTestCase.testCleanDirWithSymlinkFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x89c5k8re() throws Exception{try{__CLR4_4_18re8rekylve10t.R.inc(11354);
        __CLR4_4_18re8rekylve10t.R.inc(11355);if ((((System.getProperty("os.name").startsWith("Win"))&&(__CLR4_4_18re8rekylve10t.R.iget(11356)!=0|true))||(__CLR4_4_18re8rekylve10t.R.iget(11357)==0&false))) {{
            // Can't use "ln" for symlinks on the command line in Windows.
            __CLR4_4_18re8rekylve10t.R.inc(11358);return;
        }

        }__CLR4_4_18re8rekylve10t.R.inc(11359);final File realOuter = new File(top, "realouter");
        __CLR4_4_18re8rekylve10t.R.inc(11360);assertTrue(realOuter.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11361);final File realInner = new File(realOuter, "realinner");
        __CLR4_4_18re8rekylve10t.R.inc(11362);assertTrue(realInner.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11363);final File realFile = new File(realInner, "file1");
        __CLR4_4_18re8rekylve10t.R.inc(11364);FileUtils.touch(realFile);
        __CLR4_4_18re8rekylve10t.R.inc(11365);assertEquals(1, realInner.list().length);

        __CLR4_4_18re8rekylve10t.R.inc(11366);final File randomFile = new File(top, "randomfile");
        __CLR4_4_18re8rekylve10t.R.inc(11367);FileUtils.touch(randomFile);

        __CLR4_4_18re8rekylve10t.R.inc(11368);final File symlinkFile = new File(realInner, "fakeinner");
        __CLR4_4_18re8rekylve10t.R.inc(11369);assertTrue(setupSymlink(randomFile, symlinkFile));

        __CLR4_4_18re8rekylve10t.R.inc(11370);assertEquals(2, realInner.list().length);

        // assert contents of the real directory were removed including the symlink
        __CLR4_4_18re8rekylve10t.R.inc(11371);FileUtils.cleanDirectory(realOuter);
        __CLR4_4_18re8rekylve10t.R.inc(11372);assertEquals(0, realOuter.list().length);

        // ensure that the contents of the symlink were NOT removed.
        __CLR4_4_18re8rekylve10t.R.inc(11373);assertTrue(randomFile.exists());
        __CLR4_4_18re8rekylve10t.R.inc(11374);assertFalse(symlinkFile.exists());
    }finally{__CLR4_4_18re8rekylve10t.R.flushNeeded();}}


    @Test
    public void testCleanDirWithASymlinkDir() throws Exception {__CLR4_4_18re8rekylve10t.R.globalSliceStart(getClass().getName(),11375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1dpo88rz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18re8rekylve10t.R.rethrow($CLV_t2$);}finally{__CLR4_4_18re8rekylve10t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanSymlinksTestCase.testCleanDirWithASymlinkDir",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1dpo88rz() throws Exception{try{__CLR4_4_18re8rekylve10t.R.inc(11375);
        __CLR4_4_18re8rekylve10t.R.inc(11376);if ((((System.getProperty("os.name").startsWith("Win"))&&(__CLR4_4_18re8rekylve10t.R.iget(11377)!=0|true))||(__CLR4_4_18re8rekylve10t.R.iget(11378)==0&false))) {{
            // Can't use "ln" for symlinks on the command line in Windows.
            __CLR4_4_18re8rekylve10t.R.inc(11379);return;
        }

        }__CLR4_4_18re8rekylve10t.R.inc(11380);final File realOuter = new File(top, "realouter");
        __CLR4_4_18re8rekylve10t.R.inc(11381);assertTrue(realOuter.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11382);final File realInner = new File(realOuter, "realinner");
        __CLR4_4_18re8rekylve10t.R.inc(11383);assertTrue(realInner.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11384);FileUtils.touch(new File(realInner, "file1"));
        __CLR4_4_18re8rekylve10t.R.inc(11385);assertEquals(1, realInner.list().length);

        __CLR4_4_18re8rekylve10t.R.inc(11386);final File randomDirectory = new File(top, "randomDir");
        __CLR4_4_18re8rekylve10t.R.inc(11387);assertTrue(randomDirectory.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11388);FileUtils.touch(new File(randomDirectory, "randomfile"));
        __CLR4_4_18re8rekylve10t.R.inc(11389);assertEquals(1, randomDirectory.list().length);

        __CLR4_4_18re8rekylve10t.R.inc(11390);final File symlinkDirectory = new File(realOuter, "fakeinner");
        __CLR4_4_18re8rekylve10t.R.inc(11391);assertTrue(setupSymlink(randomDirectory, symlinkDirectory));

        __CLR4_4_18re8rekylve10t.R.inc(11392);assertEquals(1, symlinkDirectory.list().length);

        // assert contents of the real directory were removed including the symlink
        __CLR4_4_18re8rekylve10t.R.inc(11393);FileUtils.cleanDirectory(realOuter);
        __CLR4_4_18re8rekylve10t.R.inc(11394);assertEquals(0, realOuter.list().length);

        // ensure that the contents of the symlink were NOT removed.
        __CLR4_4_18re8rekylve10t.R.inc(11395);assertEquals(1, randomDirectory.list().length, "Contents of sym link should not have been removed");
    }finally{__CLR4_4_18re8rekylve10t.R.flushNeeded();}}

    @Test
    public void testCleanDirWithParentSymlinks() throws Exception {__CLR4_4_18re8rekylve10t.R.globalSliceStart(getClass().getName(),11396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvjw678sk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18re8rekylve10t.R.rethrow($CLV_t2$);}finally{__CLR4_4_18re8rekylve10t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanSymlinksTestCase.testCleanDirWithParentSymlinks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvjw678sk() throws Exception{try{__CLR4_4_18re8rekylve10t.R.inc(11396);
        __CLR4_4_18re8rekylve10t.R.inc(11397);if ((((System.getProperty("os.name").startsWith("Win"))&&(__CLR4_4_18re8rekylve10t.R.iget(11398)!=0|true))||(__CLR4_4_18re8rekylve10t.R.iget(11399)==0&false))) {{
            // Can't use "ln" for symlinks on the command line in Windows.
            __CLR4_4_18re8rekylve10t.R.inc(11400);return;
        }

        }__CLR4_4_18re8rekylve10t.R.inc(11401);final File realParent = new File(top, "realparent");
        __CLR4_4_18re8rekylve10t.R.inc(11402);assertTrue(realParent.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11403);final File realInner = new File(realParent, "realinner");
        __CLR4_4_18re8rekylve10t.R.inc(11404);assertTrue(realInner.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11405);FileUtils.touch(new File(realInner, "file1"));
        __CLR4_4_18re8rekylve10t.R.inc(11406);assertEquals(1, realInner.list().length);

        __CLR4_4_18re8rekylve10t.R.inc(11407);final File randomDirectory = new File(top, "randomDir");
        __CLR4_4_18re8rekylve10t.R.inc(11408);assertTrue(randomDirectory.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11409);FileUtils.touch(new File(randomDirectory, "randomfile"));
        __CLR4_4_18re8rekylve10t.R.inc(11410);assertEquals(1, randomDirectory.list().length);

        __CLR4_4_18re8rekylve10t.R.inc(11411);final File symlinkDirectory = new File(realParent, "fakeinner");
        __CLR4_4_18re8rekylve10t.R.inc(11412);assertTrue(setupSymlink(randomDirectory, symlinkDirectory));

        __CLR4_4_18re8rekylve10t.R.inc(11413);assertEquals(1, symlinkDirectory.list().length);

        __CLR4_4_18re8rekylve10t.R.inc(11414);final File symlinkParentDirectory = new File(top, "fakeouter");
        __CLR4_4_18re8rekylve10t.R.inc(11415);assertTrue(setupSymlink(realParent, symlinkParentDirectory));

        // assert contents of the real directory were removed including the symlink
        __CLR4_4_18re8rekylve10t.R.inc(11416);FileUtils.cleanDirectory(symlinkParentDirectory);// should clean the contents of this but not recurse into other links
        __CLR4_4_18re8rekylve10t.R.inc(11417);assertEquals(0, symlinkParentDirectory.list().length);
        __CLR4_4_18re8rekylve10t.R.inc(11418);assertEquals(0, realParent.list().length);

        // ensure that the contents of the symlink were NOT removed.
        __CLR4_4_18re8rekylve10t.R.inc(11419);assertEquals(1, randomDirectory.list().length, "Contents of sym link should not have been removed");
    }finally{__CLR4_4_18re8rekylve10t.R.flushNeeded();}}

    @Test
    public void testStillClearsIfGivenDirectoryIsASymlink() throws Exception {__CLR4_4_18re8rekylve10t.R.globalSliceStart(getClass().getName(),11420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18x94128t8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18re8rekylve10t.R.rethrow($CLV_t2$);}finally{__CLR4_4_18re8rekylve10t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanSymlinksTestCase.testStillClearsIfGivenDirectoryIsASymlink",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18x94128t8() throws Exception{try{__CLR4_4_18re8rekylve10t.R.inc(11420);
        __CLR4_4_18re8rekylve10t.R.inc(11421);if ((((System.getProperty("os.name").startsWith("Win"))&&(__CLR4_4_18re8rekylve10t.R.iget(11422)!=0|true))||(__CLR4_4_18re8rekylve10t.R.iget(11423)==0&false))) {{
            // Can't use "ln" for symlinks on the command line in Windows.
            __CLR4_4_18re8rekylve10t.R.inc(11424);return;
        }

        }__CLR4_4_18re8rekylve10t.R.inc(11425);final File randomDirectory = new File(top, "randomDir");
        __CLR4_4_18re8rekylve10t.R.inc(11426);assertTrue(randomDirectory.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11427);FileUtils.touch(new File(randomDirectory, "randomfile"));
        __CLR4_4_18re8rekylve10t.R.inc(11428);assertEquals(1, randomDirectory.list().length);

        __CLR4_4_18re8rekylve10t.R.inc(11429);final File symlinkDirectory = new File(top, "fakeDir");
        __CLR4_4_18re8rekylve10t.R.inc(11430);assertTrue(setupSymlink(randomDirectory, symlinkDirectory));

        __CLR4_4_18re8rekylve10t.R.inc(11431);FileUtils.cleanDirectory(symlinkDirectory);
        __CLR4_4_18re8rekylve10t.R.inc(11432);assertEquals(0, symlinkDirectory.list().length);
        __CLR4_4_18re8rekylve10t.R.inc(11433);assertEquals(0, randomDirectory.list().length);
    }finally{__CLR4_4_18re8rekylve10t.R.flushNeeded();}}


    @Test
    public void testIdentifiesSymlinkDir() throws Exception {__CLR4_4_18re8rekylve10t.R.globalSliceStart(getClass().getName(),11434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ef0a98tm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18re8rekylve10t.R.rethrow($CLV_t2$);}finally{__CLR4_4_18re8rekylve10t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanSymlinksTestCase.testIdentifiesSymlinkDir",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ef0a98tm() throws Exception{try{__CLR4_4_18re8rekylve10t.R.inc(11434);
        __CLR4_4_18re8rekylve10t.R.inc(11435);if ((((System.getProperty("os.name").startsWith("Win"))&&(__CLR4_4_18re8rekylve10t.R.iget(11436)!=0|true))||(__CLR4_4_18re8rekylve10t.R.iget(11437)==0&false))) {{
            // Can't use "ln" for symlinks on the command line in Windows.
            __CLR4_4_18re8rekylve10t.R.inc(11438);return;
        }

        }__CLR4_4_18re8rekylve10t.R.inc(11439);final File randomDirectory = new File(top, "randomDir");
        __CLR4_4_18re8rekylve10t.R.inc(11440);assertTrue(randomDirectory.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11441);final File symlinkDirectory = new File(top, "fakeDir");
        __CLR4_4_18re8rekylve10t.R.inc(11442);assertTrue(setupSymlink(randomDirectory, symlinkDirectory));

        __CLR4_4_18re8rekylve10t.R.inc(11443);assertTrue(FileUtils.isSymlink(symlinkDirectory));
        __CLR4_4_18re8rekylve10t.R.inc(11444);assertFalse(FileUtils.isSymlink(randomDirectory));
    }finally{__CLR4_4_18re8rekylve10t.R.flushNeeded();}}

    @Test
    public void testIdentifiesSymlinkFile() throws Exception {__CLR4_4_18re8rekylve10t.R.globalSliceStart(getClass().getName(),11445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wn5d6w8tx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18re8rekylve10t.R.rethrow($CLV_t2$);}finally{__CLR4_4_18re8rekylve10t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanSymlinksTestCase.testIdentifiesSymlinkFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wn5d6w8tx() throws Exception{try{__CLR4_4_18re8rekylve10t.R.inc(11445);
        __CLR4_4_18re8rekylve10t.R.inc(11446);if ((((System.getProperty("os.name").startsWith("Win"))&&(__CLR4_4_18re8rekylve10t.R.iget(11447)!=0|true))||(__CLR4_4_18re8rekylve10t.R.iget(11448)==0&false))) {{
            // Can't use "ln" for symlinks on the command line in Windows.
            __CLR4_4_18re8rekylve10t.R.inc(11449);return;
        }

        }__CLR4_4_18re8rekylve10t.R.inc(11450);final File randomFile = new File(top, "randomfile");
        __CLR4_4_18re8rekylve10t.R.inc(11451);FileUtils.touch(randomFile);

        __CLR4_4_18re8rekylve10t.R.inc(11452);final File symlinkFile = new File(top, "fakeinner");
        __CLR4_4_18re8rekylve10t.R.inc(11453);assertTrue(setupSymlink(randomFile, symlinkFile));

        __CLR4_4_18re8rekylve10t.R.inc(11454);assertTrue(FileUtils.isSymlink(symlinkFile));
        __CLR4_4_18re8rekylve10t.R.inc(11455);assertFalse(FileUtils.isSymlink(randomFile));
    }finally{__CLR4_4_18re8rekylve10t.R.flushNeeded();}}

    @Test
    public void testIdentifiesBrokenSymlinkFile() throws Exception {__CLR4_4_18re8rekylve10t.R.globalSliceStart(getClass().getName(),11456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fy2s8d8u8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18re8rekylve10t.R.rethrow($CLV_t2$);}finally{__CLR4_4_18re8rekylve10t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanSymlinksTestCase.testIdentifiesBrokenSymlinkFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fy2s8d8u8() throws Exception{try{__CLR4_4_18re8rekylve10t.R.inc(11456);
        __CLR4_4_18re8rekylve10t.R.inc(11457);if ((((System.getProperty("os.name").startsWith("Win"))&&(__CLR4_4_18re8rekylve10t.R.iget(11458)!=0|true))||(__CLR4_4_18re8rekylve10t.R.iget(11459)==0&false))) {{
            // Can't use "ln" for symlinks on the command line in Windows.
            __CLR4_4_18re8rekylve10t.R.inc(11460);return;
        }

        }__CLR4_4_18re8rekylve10t.R.inc(11461);final File noexistFile = new File(top, "noexist");
        __CLR4_4_18re8rekylve10t.R.inc(11462);final File symlinkFile = new File(top, "fakeinner");
        __CLR4_4_18re8rekylve10t.R.inc(11463);final File badSymlinkInPathFile = new File(symlinkFile, "fakeinner");
        __CLR4_4_18re8rekylve10t.R.inc(11464);final File noexistParentFile = new File("noexist", "file");

        __CLR4_4_18re8rekylve10t.R.inc(11465);assertTrue(setupSymlink(noexistFile, symlinkFile));

        __CLR4_4_18re8rekylve10t.R.inc(11466);assertTrue(FileUtils.isSymlink(symlinkFile));
        __CLR4_4_18re8rekylve10t.R.inc(11467);assertFalse(FileUtils.isSymlink(noexistFile));
        __CLR4_4_18re8rekylve10t.R.inc(11468);assertFalse(FileUtils.isSymlink(noexistParentFile));
        __CLR4_4_18re8rekylve10t.R.inc(11469);assertFalse(FileUtils.isSymlink(badSymlinkInPathFile));
    }finally{__CLR4_4_18re8rekylve10t.R.flushNeeded();}}

    @Test
    public void testCorrectlyIdentifySymlinkWithParentSymLink() throws Exception {__CLR4_4_18re8rekylve10t.R.globalSliceStart(getClass().getName(),11470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxcaqw8um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18re8rekylve10t.R.rethrow($CLV_t2$);}finally{__CLR4_4_18re8rekylve10t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanSymlinksTestCase.testCorrectlyIdentifySymlinkWithParentSymLink",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxcaqw8um() throws Exception{try{__CLR4_4_18re8rekylve10t.R.inc(11470);
        __CLR4_4_18re8rekylve10t.R.inc(11471);if ((((System.getProperty("os.name").startsWith("Win"))&&(__CLR4_4_18re8rekylve10t.R.iget(11472)!=0|true))||(__CLR4_4_18re8rekylve10t.R.iget(11473)==0&false))) {{
            // Can't use "ln" for symlinks on the command line in Windows.
            __CLR4_4_18re8rekylve10t.R.inc(11474);return;
        }

        }__CLR4_4_18re8rekylve10t.R.inc(11475);final File realParent = new File(top, "realparent");
        __CLR4_4_18re8rekylve10t.R.inc(11476);assertTrue(realParent.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11477);final File symlinkParentDirectory = new File(top, "fakeparent");
        __CLR4_4_18re8rekylve10t.R.inc(11478);assertTrue(setupSymlink(realParent, symlinkParentDirectory));

        __CLR4_4_18re8rekylve10t.R.inc(11479);final File realChild = new File(symlinkParentDirectory, "realChild");
        __CLR4_4_18re8rekylve10t.R.inc(11480);assertTrue(realChild.mkdirs());

        __CLR4_4_18re8rekylve10t.R.inc(11481);final File symlinkChild = new File(symlinkParentDirectory, "fakeChild");
        __CLR4_4_18re8rekylve10t.R.inc(11482);assertTrue(setupSymlink(realChild, symlinkChild));

        __CLR4_4_18re8rekylve10t.R.inc(11483);assertTrue(FileUtils.isSymlink(symlinkChild));
        __CLR4_4_18re8rekylve10t.R.inc(11484);assertFalse(FileUtils.isSymlink(realChild));
    }finally{__CLR4_4_18re8rekylve10t.R.flushNeeded();}}

    private boolean setupSymlink(final File res, final File link) throws Exception {try{__CLR4_4_18re8rekylve10t.R.inc(11485);
        // create symlink
        __CLR4_4_18re8rekylve10t.R.inc(11486);final List<String> args = new ArrayList<>();
        __CLR4_4_18re8rekylve10t.R.inc(11487);args.add("ln");
        __CLR4_4_18re8rekylve10t.R.inc(11488);args.add("-s");

        __CLR4_4_18re8rekylve10t.R.inc(11489);args.add(res.getAbsolutePath());
        __CLR4_4_18re8rekylve10t.R.inc(11490);args.add(link.getAbsolutePath());

        __CLR4_4_18re8rekylve10t.R.inc(11491);final Process proc;

        __CLR4_4_18re8rekylve10t.R.inc(11492);proc = Runtime.getRuntime().exec(args.toArray(new String[args.size()]));
        __CLR4_4_18re8rekylve10t.R.inc(11493);return proc.waitFor() == 0;
    }finally{__CLR4_4_18re8rekylve10t.R.flushNeeded();}}

}
