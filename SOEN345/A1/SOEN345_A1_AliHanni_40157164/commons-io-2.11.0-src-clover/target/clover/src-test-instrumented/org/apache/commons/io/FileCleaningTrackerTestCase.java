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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.ReferenceQueue;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.test.TestUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * This is used to test {@link FileCleaningTracker} for correctness.
 *
 * @see FileCleaningTracker
 */
public class FileCleaningTrackerTestCase {static class __CLR4_4_189d89dkylve0x9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,10900,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    protected FileCleaningTracker newInstance() {try{__CLR4_4_189d89dkylve0x9.R.inc(10705);
        __CLR4_4_189d89dkylve0x9.R.inc(10706);return new FileCleaningTracker();
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    private File testFile;
    private FileCleaningTracker theInstance;

    /**
     */
    @BeforeEach
    public void setUp() {try{__CLR4_4_189d89dkylve0x9.R.inc(10707);
        __CLR4_4_189d89dkylve0x9.R.inc(10708);testFile = new File(temporaryFolder, "file-test.txt");
        __CLR4_4_189d89dkylve0x9.R.inc(10709);theInstance = newInstance();
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @AfterEach
    public void tearDown() {try{__CLR4_4_189d89dkylve0x9.R.inc(10710);

        // reset file cleaner class, so as not to break other tests

        /**
         * The following block of code can possibly be removed when the deprecated {@link FileCleaner} is gone. The
         * question is, whether we want to support reuse of {@link FileCleaningTracker} instances, which we should, IMO,
         * not.
         */
        {
            __CLR4_4_189d89dkylve0x9.R.inc(10711);if ((((theInstance != null)&&(__CLR4_4_189d89dkylve0x9.R.iget(10712)!=0|true))||(__CLR4_4_189d89dkylve0x9.R.iget(10713)==0&false))) {{
                __CLR4_4_189d89dkylve0x9.R.inc(10714);theInstance.q = new ReferenceQueue<>();
                __CLR4_4_189d89dkylve0x9.R.inc(10715);theInstance.trackers.clear();
                __CLR4_4_189d89dkylve0x9.R.inc(10716);theInstance.deleteFailures.clear();
                __CLR4_4_189d89dkylve0x9.R.inc(10717);theInstance.exitWhenFinished = false;
                __CLR4_4_189d89dkylve0x9.R.inc(10718);theInstance.reaper = null;
            }
        }}

        __CLR4_4_189d89dkylve0x9.R.inc(10719);theInstance = null;
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @Test
    public void testFileCleanerFile() throws Exception {__CLR4_4_189d89dkylve0x9.R.globalSliceStart(getClass().getName(),10720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pocyd189s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189d89dkylve0x9.R.rethrow($CLV_t2$);}finally{__CLR4_4_189d89dkylve0x9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileCleaningTrackerTestCase.testFileCleanerFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pocyd189s() throws Exception{try{__CLR4_4_189d89dkylve0x9.R.inc(10720);
        __CLR4_4_189d89dkylve0x9.R.inc(10721);final String path = testFile.getPath();

        __CLR4_4_189d89dkylve0x9.R.inc(10722);assertFalse(testFile.exists());
        __CLR4_4_189d89dkylve0x9.R.inc(10723);RandomAccessFile r = new RandomAccessFile(testFile, "rw");
        __CLR4_4_189d89dkylve0x9.R.inc(10724);assertTrue(testFile.exists());

        __CLR4_4_189d89dkylve0x9.R.inc(10725);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10726);theInstance.track(path, r);
        __CLR4_4_189d89dkylve0x9.R.inc(10727);assertEquals(1, theInstance.getTrackCount());

        __CLR4_4_189d89dkylve0x9.R.inc(10728);r.close();
        __CLR4_4_189d89dkylve0x9.R.inc(10729);testFile = null;
        __CLR4_4_189d89dkylve0x9.R.inc(10730);r = null;

        __CLR4_4_189d89dkylve0x9.R.inc(10731);waitUntilTrackCount();
        __CLR4_4_189d89dkylve0x9.R.inc(10732);pauseForDeleteToComplete(new File(path));

        __CLR4_4_189d89dkylve0x9.R.inc(10733);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10734);assertFalse(new File(path).exists(), showFailures());
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @Test
    public void testFileCleanerDirectory() throws Exception {__CLR4_4_189d89dkylve0x9.R.globalSliceStart(getClass().getName(),10735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5z1os8a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189d89dkylve0x9.R.rethrow($CLV_t2$);}finally{__CLR4_4_189d89dkylve0x9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileCleaningTrackerTestCase.testFileCleanerDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5z1os8a7() throws Exception{try{__CLR4_4_189d89dkylve0x9.R.inc(10735);
        __CLR4_4_189d89dkylve0x9.R.inc(10736);TestUtils.createFile(testFile, 100);
        __CLR4_4_189d89dkylve0x9.R.inc(10737);assertTrue(testFile.exists());
        __CLR4_4_189d89dkylve0x9.R.inc(10738);assertTrue(temporaryFolder.exists());

        __CLR4_4_189d89dkylve0x9.R.inc(10739);Object obj = new Object();
        __CLR4_4_189d89dkylve0x9.R.inc(10740);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10741);theInstance.track(temporaryFolder, obj);
        __CLR4_4_189d89dkylve0x9.R.inc(10742);assertEquals(1, theInstance.getTrackCount());

        __CLR4_4_189d89dkylve0x9.R.inc(10743);obj = null;

        __CLR4_4_189d89dkylve0x9.R.inc(10744);waitUntilTrackCount();

        __CLR4_4_189d89dkylve0x9.R.inc(10745);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10746);assertTrue(testFile.exists());  // not deleted, as dir not empty
        __CLR4_4_189d89dkylve0x9.R.inc(10747);assertTrue(testFile.getParentFile().exists());  // not deleted, as dir not empty
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @Test
    public void testFileCleanerDirectory_NullStrategy() throws Exception {__CLR4_4_189d89dkylve0x9.R.globalSliceStart(getClass().getName(),10748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7nryz8ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189d89dkylve0x9.R.rethrow($CLV_t2$);}finally{__CLR4_4_189d89dkylve0x9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileCleaningTrackerTestCase.testFileCleanerDirectory_NullStrategy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7nryz8ak() throws Exception{try{__CLR4_4_189d89dkylve0x9.R.inc(10748);
        __CLR4_4_189d89dkylve0x9.R.inc(10749);TestUtils.createFile(testFile, 100);
        __CLR4_4_189d89dkylve0x9.R.inc(10750);assertTrue(testFile.exists());
        __CLR4_4_189d89dkylve0x9.R.inc(10751);assertTrue(temporaryFolder.exists());

        __CLR4_4_189d89dkylve0x9.R.inc(10752);Object obj = new Object();
        __CLR4_4_189d89dkylve0x9.R.inc(10753);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10754);theInstance.track(temporaryFolder, obj, null);
        __CLR4_4_189d89dkylve0x9.R.inc(10755);assertEquals(1, theInstance.getTrackCount());

        __CLR4_4_189d89dkylve0x9.R.inc(10756);obj = null;

        __CLR4_4_189d89dkylve0x9.R.inc(10757);waitUntilTrackCount();

        __CLR4_4_189d89dkylve0x9.R.inc(10758);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10759);assertTrue(testFile.exists());  // not deleted, as dir not empty
        __CLR4_4_189d89dkylve0x9.R.inc(10760);assertTrue(testFile.getParentFile().exists());  // not deleted, as dir not empty
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @Test
    public void testFileCleanerDirectory_ForceStrategy() throws Exception {__CLR4_4_189d89dkylve0x9.R.globalSliceStart(getClass().getName(),10761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vt5vv8ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189d89dkylve0x9.R.rethrow($CLV_t2$);}finally{__CLR4_4_189d89dkylve0x9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileCleaningTrackerTestCase.testFileCleanerDirectory_ForceStrategy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vt5vv8ax() throws Exception{try{__CLR4_4_189d89dkylve0x9.R.inc(10761);
        __CLR4_4_189d89dkylve0x9.R.inc(10762);if ((((!testFile.getParentFile().exists())&&(__CLR4_4_189d89dkylve0x9.R.iget(10763)!=0|true))||(__CLR4_4_189d89dkylve0x9.R.iget(10764)==0&false))) {{
            __CLR4_4_189d89dkylve0x9.R.inc(10765);throw new IOException("Cannot create file " + testFile
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_189d89dkylve0x9.R.inc(10766);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_189d89dkylve0x9.R.inc(10767);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile.toPath()))) {
            __CLR4_4_189d89dkylve0x9.R.inc(10768);TestUtils.generateTestData(output, 100);
        }
        __CLR4_4_189d89dkylve0x9.R.inc(10769);assertTrue(testFile.exists());
        __CLR4_4_189d89dkylve0x9.R.inc(10770);assertTrue(temporaryFolder.exists());

        __CLR4_4_189d89dkylve0x9.R.inc(10771);Object obj = new Object();
        __CLR4_4_189d89dkylve0x9.R.inc(10772);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10773);theInstance.track(temporaryFolder, obj, FileDeleteStrategy.FORCE);
        __CLR4_4_189d89dkylve0x9.R.inc(10774);assertEquals(1, theInstance.getTrackCount());

        __CLR4_4_189d89dkylve0x9.R.inc(10775);obj = null;

        __CLR4_4_189d89dkylve0x9.R.inc(10776);waitUntilTrackCount();
        __CLR4_4_189d89dkylve0x9.R.inc(10777);pauseForDeleteToComplete(testFile.getParentFile());

        __CLR4_4_189d89dkylve0x9.R.inc(10778);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10779);assertFalse(new File(testFile.getPath()).exists(), showFailures());
        __CLR4_4_189d89dkylve0x9.R.inc(10780);assertFalse(testFile.getParentFile().exists(), showFailures());
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @Test
    public void testFileCleanerNull() {__CLR4_4_189d89dkylve0x9.R.globalSliceStart(getClass().getName(),10781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9vohi8bh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189d89dkylve0x9.R.rethrow($CLV_t2$);}finally{__CLR4_4_189d89dkylve0x9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileCleaningTrackerTestCase.testFileCleanerNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9vohi8bh(){try{__CLR4_4_189d89dkylve0x9.R.inc(10781);
        __CLR4_4_189d89dkylve0x9.R.inc(10782);try {
            __CLR4_4_189d89dkylve0x9.R.inc(10783);theInstance.track((File) null, new Object());
            __CLR4_4_189d89dkylve0x9.R.inc(10784);fail();
        } catch (final NullPointerException ex) {
            // expected
        }
        __CLR4_4_189d89dkylve0x9.R.inc(10785);try {
            __CLR4_4_189d89dkylve0x9.R.inc(10786);theInstance.track((File) null, new Object(), FileDeleteStrategy.NORMAL);
            __CLR4_4_189d89dkylve0x9.R.inc(10787);fail();
        } catch (final NullPointerException ex) {
            // expected
        }
        __CLR4_4_189d89dkylve0x9.R.inc(10788);try {
            __CLR4_4_189d89dkylve0x9.R.inc(10789);theInstance.track((String) null, new Object());
            __CLR4_4_189d89dkylve0x9.R.inc(10790);fail();
        } catch (final NullPointerException ex) {
            // expected
        }
        __CLR4_4_189d89dkylve0x9.R.inc(10791);try {
            __CLR4_4_189d89dkylve0x9.R.inc(10792);theInstance.track((String) null, new Object(), FileDeleteStrategy.NORMAL);
            __CLR4_4_189d89dkylve0x9.R.inc(10793);fail();
        } catch (final NullPointerException ex) {
            // expected
        }
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @Test
    public void testFileCleanerExitWhenFinishedFirst() throws Exception {__CLR4_4_189d89dkylve0x9.R.globalSliceStart(getClass().getName(),10794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pj0qj8bu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189d89dkylve0x9.R.rethrow($CLV_t2$);}finally{__CLR4_4_189d89dkylve0x9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileCleaningTrackerTestCase.testFileCleanerExitWhenFinishedFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pj0qj8bu() throws Exception{try{__CLR4_4_189d89dkylve0x9.R.inc(10794);
        __CLR4_4_189d89dkylve0x9.R.inc(10795);assertFalse(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10796);theInstance.exitWhenFinished();
        __CLR4_4_189d89dkylve0x9.R.inc(10797);assertTrue(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10798);assertNull(theInstance.reaper);

        __CLR4_4_189d89dkylve0x9.R.inc(10799);waitUntilTrackCount();

        __CLR4_4_189d89dkylve0x9.R.inc(10800);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10801);assertTrue(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10802);assertNull(theInstance.reaper);
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @Test
    public void testFileCleanerExitWhenFinished_NoTrackAfter() {__CLR4_4_189d89dkylve0x9.R.globalSliceStart(getClass().getName(),10803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofkona8c3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189d89dkylve0x9.R.rethrow($CLV_t2$);}finally{__CLR4_4_189d89dkylve0x9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileCleaningTrackerTestCase.testFileCleanerExitWhenFinished_NoTrackAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofkona8c3(){try{__CLR4_4_189d89dkylve0x9.R.inc(10803);
        __CLR4_4_189d89dkylve0x9.R.inc(10804);assertFalse(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10805);theInstance.exitWhenFinished();
        __CLR4_4_189d89dkylve0x9.R.inc(10806);assertTrue(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10807);assertNull(theInstance.reaper);

        __CLR4_4_189d89dkylve0x9.R.inc(10808);final String path = testFile.getPath();
        __CLR4_4_189d89dkylve0x9.R.inc(10809);final Object marker = new Object();
        __CLR4_4_189d89dkylve0x9.R.inc(10810);try {
            __CLR4_4_189d89dkylve0x9.R.inc(10811);theInstance.track(path, marker);
            __CLR4_4_189d89dkylve0x9.R.inc(10812);fail();
        } catch (final IllegalStateException ex) {
            // expected
        }
        __CLR4_4_189d89dkylve0x9.R.inc(10813);assertTrue(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10814);assertNull(theInstance.reaper);
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @Test
    public void testFileCleanerExitWhenFinished1() throws Exception {__CLR4_4_189d89dkylve0x9.R.globalSliceStart(getClass().getName(),10815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19bz7q8cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189d89dkylve0x9.R.rethrow($CLV_t2$);}finally{__CLR4_4_189d89dkylve0x9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileCleaningTrackerTestCase.testFileCleanerExitWhenFinished1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19bz7q8cf() throws Exception{try{__CLR4_4_189d89dkylve0x9.R.inc(10815);
        __CLR4_4_189d89dkylve0x9.R.inc(10816);final String path = testFile.getPath();

        __CLR4_4_189d89dkylve0x9.R.inc(10817);assertFalse(testFile.exists(), "1-testFile exists: " + testFile);
        __CLR4_4_189d89dkylve0x9.R.inc(10818);RandomAccessFile r = new RandomAccessFile(testFile, "rw");
        __CLR4_4_189d89dkylve0x9.R.inc(10819);assertTrue(testFile.exists(), "2-testFile exists");

        __CLR4_4_189d89dkylve0x9.R.inc(10820);assertEquals(0, theInstance.getTrackCount(), "3-Track Count");
        __CLR4_4_189d89dkylve0x9.R.inc(10821);theInstance.track(path, r);
        __CLR4_4_189d89dkylve0x9.R.inc(10822);assertEquals(1, theInstance.getTrackCount(), "4-Track Count");
        __CLR4_4_189d89dkylve0x9.R.inc(10823);assertFalse(theInstance.exitWhenFinished, "5-exitWhenFinished");
        __CLR4_4_189d89dkylve0x9.R.inc(10824);assertTrue(theInstance.reaper.isAlive(), "6-reaper.isAlive");

        __CLR4_4_189d89dkylve0x9.R.inc(10825);assertFalse(theInstance.exitWhenFinished, "7-exitWhenFinished");
        __CLR4_4_189d89dkylve0x9.R.inc(10826);theInstance.exitWhenFinished();
        __CLR4_4_189d89dkylve0x9.R.inc(10827);assertTrue(theInstance.exitWhenFinished, "8-exitWhenFinished");
        __CLR4_4_189d89dkylve0x9.R.inc(10828);assertTrue(theInstance.reaper.isAlive(), "9-reaper.isAlive");

        __CLR4_4_189d89dkylve0x9.R.inc(10829);r.close();
        __CLR4_4_189d89dkylve0x9.R.inc(10830);testFile = null;
        __CLR4_4_189d89dkylve0x9.R.inc(10831);r = null;

        __CLR4_4_189d89dkylve0x9.R.inc(10832);waitUntilTrackCount();
        __CLR4_4_189d89dkylve0x9.R.inc(10833);pauseForDeleteToComplete(new File(path));

        __CLR4_4_189d89dkylve0x9.R.inc(10834);assertEquals(0, theInstance.getTrackCount(), "10-Track Count");
        __CLR4_4_189d89dkylve0x9.R.inc(10835);assertFalse(new File(path).exists(), "11-testFile exists " + showFailures());
        __CLR4_4_189d89dkylve0x9.R.inc(10836);assertTrue(theInstance.exitWhenFinished, "12-exitWhenFinished");
        __CLR4_4_189d89dkylve0x9.R.inc(10837);assertFalse(theInstance.reaper.isAlive(), "13-reaper.isAlive");
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    @Test
    public void testFileCleanerExitWhenFinished2() throws Exception {__CLR4_4_189d89dkylve0x9.R.globalSliceStart(getClass().getName(),10838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13iby078d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189d89dkylve0x9.R.rethrow($CLV_t2$);}finally{__CLR4_4_189d89dkylve0x9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileCleaningTrackerTestCase.testFileCleanerExitWhenFinished2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13iby078d2() throws Exception{try{__CLR4_4_189d89dkylve0x9.R.inc(10838);
        __CLR4_4_189d89dkylve0x9.R.inc(10839);final String path = testFile.getPath();

        __CLR4_4_189d89dkylve0x9.R.inc(10840);assertFalse(testFile.exists());
        __CLR4_4_189d89dkylve0x9.R.inc(10841);RandomAccessFile r = new RandomAccessFile(testFile, "rw");
        __CLR4_4_189d89dkylve0x9.R.inc(10842);assertTrue(testFile.exists());

        __CLR4_4_189d89dkylve0x9.R.inc(10843);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10844);theInstance.track(path, r);
        __CLR4_4_189d89dkylve0x9.R.inc(10845);assertEquals(1, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10846);assertFalse(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10847);assertTrue(theInstance.reaper.isAlive());

        __CLR4_4_189d89dkylve0x9.R.inc(10848);r.close();
        __CLR4_4_189d89dkylve0x9.R.inc(10849);testFile = null;
        __CLR4_4_189d89dkylve0x9.R.inc(10850);r = null;

        __CLR4_4_189d89dkylve0x9.R.inc(10851);waitUntilTrackCount();
        __CLR4_4_189d89dkylve0x9.R.inc(10852);pauseForDeleteToComplete(new File(path));

        __CLR4_4_189d89dkylve0x9.R.inc(10853);assertEquals(0, theInstance.getTrackCount());
        __CLR4_4_189d89dkylve0x9.R.inc(10854);assertFalse(new File(path).exists(), showFailures());
        __CLR4_4_189d89dkylve0x9.R.inc(10855);assertFalse(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10856);assertTrue(theInstance.reaper.isAlive());

        __CLR4_4_189d89dkylve0x9.R.inc(10857);assertFalse(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10858);theInstance.exitWhenFinished();
        __CLR4_4_189d89dkylve0x9.R.inc(10859);for (int i = 0; (((i < 20 && theInstance.reaper.isAlive())&&(__CLR4_4_189d89dkylve0x9.R.iget(10860)!=0|true))||(__CLR4_4_189d89dkylve0x9.R.iget(10861)==0&false)); i++) {{
            __CLR4_4_189d89dkylve0x9.R.inc(10862);TestUtils.sleep(500L);  // allow reaper thread to die
        }
        }__CLR4_4_189d89dkylve0x9.R.inc(10863);assertTrue(theInstance.exitWhenFinished);
        __CLR4_4_189d89dkylve0x9.R.inc(10864);assertFalse(theInstance.reaper.isAlive());
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    private void pauseForDeleteToComplete(File file) {try{__CLR4_4_189d89dkylve0x9.R.inc(10865);
        __CLR4_4_189d89dkylve0x9.R.inc(10866);int count = 0;
        __CLR4_4_189d89dkylve0x9.R.inc(10867);while((((file.exists() && count++ < 40)&&(__CLR4_4_189d89dkylve0x9.R.iget(10868)!=0|true))||(__CLR4_4_189d89dkylve0x9.R.iget(10869)==0&false))) {{
            __CLR4_4_189d89dkylve0x9.R.inc(10870);try {
                __CLR4_4_189d89dkylve0x9.R.inc(10871);TestUtils.sleep(500L);
            } catch (final InterruptedException ignore) {
            }
            __CLR4_4_189d89dkylve0x9.R.inc(10872);file = new File(file.getPath());
        }
    }}finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}
    private String showFailures() {try{__CLR4_4_189d89dkylve0x9.R.inc(10873);
        __CLR4_4_189d89dkylve0x9.R.inc(10874);if ((((theInstance.deleteFailures.size() == 1)&&(__CLR4_4_189d89dkylve0x9.R.iget(10875)!=0|true))||(__CLR4_4_189d89dkylve0x9.R.iget(10876)==0&false))) {{
            __CLR4_4_189d89dkylve0x9.R.inc(10877);return "[Delete Failed: " + theInstance.deleteFailures.get(0) + "]";
        }
        }__CLR4_4_189d89dkylve0x9.R.inc(10878);return "[Delete Failures: " + theInstance.deleteFailures.size() + "]";
    }finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}

    private void waitUntilTrackCount() throws Exception {try{__CLR4_4_189d89dkylve0x9.R.inc(10879);
        __CLR4_4_189d89dkylve0x9.R.inc(10880);System.gc();
        __CLR4_4_189d89dkylve0x9.R.inc(10881);TestUtils.sleep(500);
        __CLR4_4_189d89dkylve0x9.R.inc(10882);int count = 0;
        __CLR4_4_189d89dkylve0x9.R.inc(10883);while((((theInstance.getTrackCount() != 0 && count++ < 5)&&(__CLR4_4_189d89dkylve0x9.R.iget(10884)!=0|true))||(__CLR4_4_189d89dkylve0x9.R.iget(10885)==0&false))) {{
            __CLR4_4_189d89dkylve0x9.R.inc(10886);List<String> list = new ArrayList<>();
            __CLR4_4_189d89dkylve0x9.R.inc(10887);try {
                __CLR4_4_189d89dkylve0x9.R.inc(10888);long i = 0;
                __CLR4_4_189d89dkylve0x9.R.inc(10889);while ((((theInstance.getTrackCount() != 0)&&(__CLR4_4_189d89dkylve0x9.R.iget(10890)!=0|true))||(__CLR4_4_189d89dkylve0x9.R.iget(10891)==0&false))) {{
                    __CLR4_4_189d89dkylve0x9.R.inc(10892);list.add("A Big String A Big String A Big String A Big String A Big String A Big String A Big String A Big String A Big String A Big String " + (i++));
                }
            }} catch (final Throwable ignored) {
            }
            __CLR4_4_189d89dkylve0x9.R.inc(10893);list = null;
            __CLR4_4_189d89dkylve0x9.R.inc(10894);System.gc();
            __CLR4_4_189d89dkylve0x9.R.inc(10895);TestUtils.sleep(1000);
        }
        }__CLR4_4_189d89dkylve0x9.R.inc(10896);if ((((theInstance.getTrackCount() != 0)&&(__CLR4_4_189d89dkylve0x9.R.iget(10897)!=0|true))||(__CLR4_4_189d89dkylve0x9.R.iget(10898)==0&false))) {{
            __CLR4_4_189d89dkylve0x9.R.inc(10899);throw new IllegalStateException("Your JVM is not releasing References, try running the testcase with less memory (-Xmx)");
        }

    }}finally{__CLR4_4_189d89dkylve0x9.R.flushNeeded();}}
}
