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
package org.apache.commons.io.monitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.CanReadFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.junit.jupiter.api.Test;

/**
 * {@link FileAlterationObserver} Test Case.
 */
public class FileAlterationObserverTestCase extends AbstractMonitorTestCase {static class __CLR4_4_1jf4jf4kylve3gb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,25407,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Construct a new test case.
     *
     */
    public FileAlterationObserverTestCase() {try{__CLR4_4_1jf4jf4kylve3gb.R.inc(25168);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25169);listener = new CollectionFileListener(true);
    }finally{__CLR4_4_1jf4jf4kylve3gb.R.flushNeeded();}}

    /**
     * Test add/remove listeners.
     */
    @Test
    public void testAddRemoveListeners() {__CLR4_4_1jf4jf4kylve3gb.R.globalSliceStart(getClass().getName(),25170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xh9o3jf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jf4jf4kylve3gb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jf4jf4kylve3gb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationObserverTestCase.testAddRemoveListeners",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xh9o3jf6(){try{__CLR4_4_1jf4jf4kylve3gb.R.inc(25170);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25171);final FileAlterationObserver observer = new FileAlterationObserver("/foo");
        // Null Listener
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25172);observer.addListener(null);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25173);assertFalse(observer.getListeners().iterator().hasNext(), "Listeners[1]");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25174);observer.removeListener(null);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25175);assertFalse(observer.getListeners().iterator().hasNext(), "Listeners[2]");

        // Add Listener
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25176);final FileAlterationListenerAdaptor listener = new FileAlterationListenerAdaptor();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25177);observer.addListener(listener);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25178);final Iterator<FileAlterationListener> it = observer.getListeners().iterator();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25179);assertTrue(it.hasNext(), "Listeners[3]");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25180);assertEquals(listener, it.next(), "Added");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25181);assertFalse(it.hasNext(), "Listeners[4]");

        // Remove Listener
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25182);observer.removeListener(listener);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25183);assertFalse(observer.getListeners().iterator().hasNext(), "Listeners[5]");
    }finally{__CLR4_4_1jf4jf4kylve3gb.R.flushNeeded();}}

    /**
     * Test toString().
     */
    @Test
    public void testToString() {__CLR4_4_1jf4jf4kylve3gb.R.globalSliceStart(getClass().getName(),25184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidjfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jf4jf4kylve3gb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jf4jf4kylve3gb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationObserverTestCase.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidjfk(){try{__CLR4_4_1jf4jf4kylve3gb.R.inc(25184);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25185);final File file = new File("/foo");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25186);FileAlterationObserver observer = new FileAlterationObserver(file);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25187);assertEquals("FileAlterationObserver[file='" + file.getPath() +  "', listeners=0]",
                observer.toString());

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25188);observer = new FileAlterationObserver(file, CanReadFileFilter.CAN_READ);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25189);assertEquals("FileAlterationObserver[file='" + file.getPath() +  "', CanReadFileFilter, listeners=0]",
                observer.toString());

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25190);assertEquals(file, observer.getDirectory());
  }finally{__CLR4_4_1jf4jf4kylve3gb.R.flushNeeded();}}

    /**
     * Test checkAndNotify() method
     * @throws Exception
     */
    @Test
    public void testDirectory() throws Exception {__CLR4_4_1jf4jf4kylve3gb.R.globalSliceStart(getClass().getName(),25191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kt5srmjfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jf4jf4kylve3gb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jf4jf4kylve3gb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationObserverTestCase.testDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kt5srmjfr() throws Exception{try{__CLR4_4_1jf4jf4kylve3gb.R.inc(25191);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25192);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25193);checkCollectionsEmpty("A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25194);final File testDirA = new File(testDir, "test-dir-A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25195);final File testDirB = new File(testDir, "test-dir-B");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25196);final File testDirC = new File(testDir, "test-dir-C");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25197);testDirA.mkdir();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25198);testDirB.mkdir();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25199);testDirC.mkdir();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25200);final File testDirAFile1 = touch(new File(testDirA, "A-file1.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25201);final File testDirAFile2 = touch(new File(testDirA, "A-file2.txt")); // filter should ignore this
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25202);final File testDirAFile3 = touch(new File(testDirA, "A-file3.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25203);File testDirAFile4 = touch(new File(testDirA, "A-file4.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25204);final File testDirBFile1 = touch(new File(testDirB, "B-file1.java"));

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25205);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25206);checkCollectionSizes("B", 3, 0, 0, 4, 0, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25207);assertTrue(listener.getCreatedDirectories().contains(testDirA), "B testDirA");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25208);assertTrue(listener.getCreatedDirectories().contains(testDirB), "B testDirB");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25209);assertTrue(listener.getCreatedDirectories().contains(testDirC), "B testDirC");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25210);assertTrue(listener.getCreatedFiles().contains(testDirAFile1), "B testDirAFile1");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25211);assertFalse(listener.getCreatedFiles().contains(testDirAFile2), "B testDirAFile2");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25212);assertTrue(listener.getCreatedFiles().contains(testDirAFile3), "B testDirAFile3");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25213);assertTrue(listener.getCreatedFiles().contains(testDirAFile4), "B testDirAFile4");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25214);assertTrue(listener.getCreatedFiles().contains(testDirBFile1), "B testDirBFile1");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25215);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25216);checkCollectionsEmpty("C");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25217);testDirAFile4 = touch(testDirAFile4);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25218);FileUtils.deleteDirectory(testDirB);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25219);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25220);checkCollectionSizes("D", 0, 0, 1, 0, 1, 1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25221);assertTrue(listener.getDeletedDirectories().contains(testDirB), "D testDirB");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25222);assertTrue(listener.getChangedFiles().contains(testDirAFile4), "D testDirAFile4");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25223);assertTrue(listener.getDeletedFiles().contains(testDirBFile1), "D testDirBFile1");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25224);FileUtils.deleteDirectory(testDir);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25225);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25226);checkCollectionSizes("E", 0, 0, 2, 0, 0, 3);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25227);assertTrue(listener.getDeletedDirectories().contains(testDirA), "E testDirA");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25228);assertTrue(listener.getDeletedFiles().contains(testDirAFile1), "E testDirAFile1");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25229);assertFalse(listener.getDeletedFiles().contains(testDirAFile2), "E testDirAFile2");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25230);assertTrue(listener.getDeletedFiles().contains(testDirAFile3), "E testDirAFile3");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25231);assertTrue(listener.getDeletedFiles().contains(testDirAFile4), "E testDirAFile4");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25232);testDir.mkdir();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25233);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25234);checkCollectionsEmpty("F");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25235);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25236);checkCollectionsEmpty("G");
    }finally{__CLR4_4_1jf4jf4kylve3gb.R.flushNeeded();}}

    /**
     * Test checkAndNotify() creating
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testFileCreate() throws IOException {__CLR4_4_1jf4jf4kylve3gb.R.globalSliceStart(getClass().getName(),25237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12fwvkhjh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jf4jf4kylve3gb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jf4jf4kylve3gb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationObserverTestCase.testFileCreate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12fwvkhjh1() throws IOException{try{__CLR4_4_1jf4jf4kylve3gb.R.inc(25237);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25238);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25239);checkCollectionsEmpty("A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25240);File testDirA = new File(testDir, "test-dir-A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25241);testDirA.mkdir();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25242);testDir  = touch(testDir);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25243);testDirA = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25244);File testDirAFile1 =       new File(testDirA, "A-file1.java");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25245);final File testDirAFile2 = touch(new File(testDirA, "A-file2.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25246);File testDirAFile3 =       new File(testDirA, "A-file3.java");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25247);final File testDirAFile4 = touch(new File(testDirA, "A-file4.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25248);File testDirAFile5 =       new File(testDirA, "A-file5.java");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25249);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25250);checkCollectionSizes("B", 1, 0, 0, 2, 0, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25251);assertFalse(listener.getCreatedFiles().contains(testDirAFile1), "B testDirAFile1");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25252);assertTrue(listener.getCreatedFiles().contains(testDirAFile2), "B testDirAFile2");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25253);assertFalse(listener.getCreatedFiles().contains(testDirAFile3), "B testDirAFile3");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25254);assertTrue(listener.getCreatedFiles().contains(testDirAFile4), "B testDirAFile4");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25255);assertFalse(listener.getCreatedFiles().contains(testDirAFile5), "B testDirAFile5");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25256);assertFalse(testDirAFile1.exists(), "B testDirAFile1 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25257);assertTrue(testDirAFile2.exists(), "B testDirAFile2 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25258);assertFalse(testDirAFile3.exists(), "B testDirAFile3 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25259);assertTrue(testDirAFile4.exists(), "B testDirAFile4 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25260);assertFalse(testDirAFile5.exists(), "B testDirAFile5 exists");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25261);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25262);checkCollectionsEmpty("C");

        // Create file with name < first entry
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25263);testDirAFile1 = touch(testDirAFile1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25264);testDirA      = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25265);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25266);checkCollectionSizes("D", 0, 1, 0, 1, 0, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25267);assertTrue(testDirAFile1.exists(), "D testDirAFile1 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25268);assertTrue(listener.getCreatedFiles().contains(testDirAFile1), "D testDirAFile1");

        // Create file with name between 2 entries
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25269);testDirAFile3 = touch(testDirAFile3);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25270);testDirA      = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25271);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25272);checkCollectionSizes("E", 0, 1, 0, 1, 0, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25273);assertTrue(testDirAFile3.exists(), "E testDirAFile3 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25274);assertTrue(listener.getCreatedFiles().contains(testDirAFile3), "E testDirAFile3");

        // Create file with name > last entry
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25275);testDirAFile5 = touch(testDirAFile5);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25276);testDirA      = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25277);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25278);checkCollectionSizes("F", 0, 1, 0, 1, 0, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25279);assertTrue(testDirAFile5.exists(), "F testDirAFile5 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25280);assertTrue(listener.getCreatedFiles().contains(testDirAFile5), "F testDirAFile5");
    }finally{__CLR4_4_1jf4jf4kylve3gb.R.flushNeeded();}}

    /**
     * Test checkAndNotify() creating
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testFileUpdate() throws IOException {__CLR4_4_1jf4jf4kylve3gb.R.globalSliceStart(getClass().getName(),25281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1taznjyji9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jf4jf4kylve3gb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jf4jf4kylve3gb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationObserverTestCase.testFileUpdate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1taznjyji9() throws IOException{try{__CLR4_4_1jf4jf4kylve3gb.R.inc(25281);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25282);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25283);checkCollectionsEmpty("A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25284);File testDirA = new File(testDir, "test-dir-A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25285);testDirA.mkdir();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25286);testDir  = touch(testDir);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25287);testDirA = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25288);File testDirAFile1 = touch(new File(testDirA, "A-file1.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25289);final File testDirAFile2 = touch(new File(testDirA, "A-file2.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25290);File testDirAFile3 = touch(new File(testDirA, "A-file3.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25291);final File testDirAFile4 = touch(new File(testDirA, "A-file4.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25292);File testDirAFile5 = touch(new File(testDirA, "A-file5.java"));

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25293);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25294);checkCollectionSizes("B", 1, 0, 0, 5, 0, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25295);assertTrue(listener.getCreatedFiles().contains(testDirAFile1), "B testDirAFile1");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25296);assertTrue(listener.getCreatedFiles().contains(testDirAFile2), "B testDirAFile2");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25297);assertTrue(listener.getCreatedFiles().contains(testDirAFile3), "B testDirAFile3");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25298);assertTrue(listener.getCreatedFiles().contains(testDirAFile4), "B testDirAFile4");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25299);assertTrue(listener.getCreatedFiles().contains(testDirAFile5), "B testDirAFile5");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25300);assertTrue(testDirAFile1.exists(), "B testDirAFile1 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25301);assertTrue(testDirAFile2.exists(), "B testDirAFile2 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25302);assertTrue(testDirAFile3.exists(), "B testDirAFile3 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25303);assertTrue(testDirAFile4.exists(), "B testDirAFile4 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25304);assertTrue(testDirAFile5.exists(), "B testDirAFile5 exists");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25305);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25306);checkCollectionsEmpty("C");

        // Update first entry
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25307);testDirAFile1 = touch(testDirAFile1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25308);testDirA      = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25309);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25310);checkCollectionSizes("D", 0, 1, 0, 0, 1, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25311);assertTrue(listener.getChangedFiles().contains(testDirAFile1), "D testDirAFile1");

        // Update file with name between 2 entries
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25312);testDirAFile3 = touch(testDirAFile3);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25313);testDirA      = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25314);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25315);checkCollectionSizes("E", 0, 1, 0, 0, 1, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25316);assertTrue(listener.getChangedFiles().contains(testDirAFile3), "E testDirAFile3");

        // Update last entry
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25317);testDirAFile5 = touch(testDirAFile5);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25318);testDirA      = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25319);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25320);checkCollectionSizes("F", 0, 1, 0, 0, 1, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25321);assertTrue(listener.getChangedFiles().contains(testDirAFile5), "F testDirAFile5");
    }finally{__CLR4_4_1jf4jf4kylve3gb.R.flushNeeded();}}

    /**
     * Test checkAndNotify() deleting
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testFileDelete() throws IOException {__CLR4_4_1jf4jf4kylve3gb.R.globalSliceStart(getClass().getName(),25322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yq3rs0jje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jf4jf4kylve3gb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jf4jf4kylve3gb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationObserverTestCase.testFileDelete",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yq3rs0jje() throws IOException{try{__CLR4_4_1jf4jf4kylve3gb.R.inc(25322);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25323);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25324);checkCollectionsEmpty("A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25325);File testDirA = new File(testDir, "test-dir-A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25326);testDirA.mkdir();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25327);testDir  = touch(testDir);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25328);testDirA = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25329);final File testDirAFile1 = touch(new File(testDirA, "A-file1.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25330);final File testDirAFile2 = touch(new File(testDirA, "A-file2.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25331);final File testDirAFile3 = touch(new File(testDirA, "A-file3.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25332);final File testDirAFile4 = touch(new File(testDirA, "A-file4.java"));
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25333);final File testDirAFile5 = touch(new File(testDirA, "A-file5.java"));

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25334);assertTrue(testDirAFile1.exists(), "B testDirAFile1 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25335);assertTrue(testDirAFile2.exists(), "B testDirAFile2 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25336);assertTrue(testDirAFile3.exists(), "B testDirAFile3 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25337);assertTrue(testDirAFile4.exists(), "B testDirAFile4 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25338);assertTrue(testDirAFile5.exists(), "B testDirAFile5 exists");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25339);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25340);checkCollectionSizes("B", 1, 0, 0, 5, 0, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25341);assertTrue(listener.getCreatedFiles().contains(testDirAFile1), "B testDirAFile1");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25342);assertTrue(listener.getCreatedFiles().contains(testDirAFile2), "B testDirAFile2");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25343);assertTrue(listener.getCreatedFiles().contains(testDirAFile3), "B testDirAFile3");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25344);assertTrue(listener.getCreatedFiles().contains(testDirAFile4), "B testDirAFile4");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25345);assertTrue(listener.getCreatedFiles().contains(testDirAFile5), "B testDirAFile5");

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25346);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25347);checkCollectionsEmpty("C");

        // Delete first entry
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25348);FileUtils.deleteQuietly(testDirAFile1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25349);testDirA = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25350);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25351);checkCollectionSizes("D", 0, 1, 0, 0, 0, 1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25352);assertFalse(testDirAFile1.exists(), "D testDirAFile1 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25353);assertTrue(listener.getDeletedFiles().contains(testDirAFile1), "D testDirAFile1");

        // Delete file with name between 2 entries
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25354);FileUtils.deleteQuietly(testDirAFile3);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25355);testDirA = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25356);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25357);checkCollectionSizes("E", 0, 1, 0, 0, 0, 1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25358);assertFalse(testDirAFile3.exists(), "E testDirAFile3 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25359);assertTrue(listener.getDeletedFiles().contains(testDirAFile3), "E testDirAFile3");

        // Delete last entry
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25360);FileUtils.deleteQuietly(testDirAFile5);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25361);testDirA = touch(testDirA);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25362);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25363);checkCollectionSizes("F", 0, 1, 0, 0, 0, 1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25364);assertFalse(testDirAFile5.exists(), "F testDirAFile5 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25365);assertTrue(listener.getDeletedFiles().contains(testDirAFile5), "F testDirAFile5");
    }finally{__CLR4_4_1jf4jf4kylve3gb.R.flushNeeded();}}

    /**
     * Test checkAndNotify() method
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testObserveSingleFile() throws IOException {__CLR4_4_1jf4jf4kylve3gb.R.globalSliceStart(getClass().getName(),25366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qr4yt1jkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jf4jf4kylve3gb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jf4jf4kylve3gb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationObserverTestCase.testObserveSingleFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qr4yt1jkm() throws IOException{try{__CLR4_4_1jf4jf4kylve3gb.R.inc(25366);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25367);final File testDirA = new File(testDir, "test-dir-A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25368);File testDirAFile1 = new File(testDirA, "A-file1.java");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25369);testDirA.mkdir();

        __CLR4_4_1jf4jf4kylve3gb.R.inc(25370);final FileFilter nameFilter = FileFilterUtils.nameFileFilter(testDirAFile1.getName());
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25371);createObserver(testDirA, nameFilter);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25372);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25373);checkCollectionsEmpty("A");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25374);assertFalse(testDirAFile1.exists(), "A testDirAFile1 exists");

        // Create
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25375);testDirAFile1 = touch(testDirAFile1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25376);File testDirAFile2 = touch(new File(testDirA, "A-file2.txt"));  /* filter should ignore */
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25377);File testDirAFile3 = touch(new File(testDirA, "A-file3.java")); /* filter should ignore */
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25378);assertTrue(testDirAFile1.exists(), "B testDirAFile1 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25379);assertTrue(testDirAFile2.exists(), "B testDirAFile2 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25380);assertTrue(testDirAFile3.exists(), "B testDirAFile3 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25381);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25382);checkCollectionSizes("C", 0, 0, 0, 1, 0, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25383);assertTrue(listener.getCreatedFiles().contains(testDirAFile1), "C created");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25384);assertFalse(listener.getCreatedFiles().contains(testDirAFile2), "C created");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25385);assertFalse(listener.getCreatedFiles().contains(testDirAFile3), "C created");

        // Modify
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25386);testDirAFile1 = touch(testDirAFile1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25387);testDirAFile2 = touch(testDirAFile2);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25388);testDirAFile3 = touch(testDirAFile3);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25389);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25390);checkCollectionSizes("D", 0, 0, 0, 0, 1, 0);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25391);assertTrue(listener.getChangedFiles().contains(testDirAFile1), "D changed");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25392);assertFalse(listener.getChangedFiles().contains(testDirAFile2), "D changed");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25393);assertFalse(listener.getChangedFiles().contains(testDirAFile3), "D changed");

        // Delete
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25394);FileUtils.deleteQuietly(testDirAFile1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25395);FileUtils.deleteQuietly(testDirAFile2);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25396);FileUtils.deleteQuietly(testDirAFile3);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25397);assertFalse(testDirAFile1.exists(), "E testDirAFile1 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25398);assertFalse(testDirAFile2.exists(), "E testDirAFile2 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25399);assertFalse(testDirAFile3.exists(), "E testDirAFile3 exists");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25400);checkAndNotify();
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25401);checkCollectionSizes("E", 0, 0, 0, 0, 0, 1);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25402);assertTrue(listener.getDeletedFiles().contains(testDirAFile1), "E deleted");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25403);assertFalse(listener.getDeletedFiles().contains(testDirAFile2), "E deleted");
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25404);assertFalse(listener.getDeletedFiles().contains(testDirAFile3), "E deleted");
    }finally{__CLR4_4_1jf4jf4kylve3gb.R.flushNeeded();}}

    /**
     * Call {@link FileAlterationObserver#checkAndNotify()}.
     */
    protected void checkAndNotify() {try{__CLR4_4_1jf4jf4kylve3gb.R.inc(25405);
        __CLR4_4_1jf4jf4kylve3gb.R.inc(25406);observer.checkAndNotify();
    }finally{__CLR4_4_1jf4jf4kylve3gb.R.flushNeeded();}}
}
