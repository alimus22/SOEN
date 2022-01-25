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
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.apache.commons.io.test.TestUtils;
import org.junit.jupiter.api.Test;

/**
 * {@link FileAlterationMonitor} Test Case.
 */
public class FileAlterationMonitorTestCase extends AbstractMonitorTestCase {static class __CLR4_4_1jc7jc7kylve3f5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,25168,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Construct a new test case.
     *
     */
    public FileAlterationMonitorTestCase() {try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25063);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25064);listener = new CollectionFileListener(false);
    }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}

    /**
     * Test default constructor.
     */
    @Test
    public void testDefaultConstructor() {__CLR4_4_1jc7jc7kylve3f5.R.globalSliceStart(getClass().getName(),25065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiz4syjc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc7jc7kylve3f5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc7jc7kylve3f5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationMonitorTestCase.testDefaultConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiz4syjc9(){try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25065);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25066);final FileAlterationMonitor monitor = new FileAlterationMonitor();
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25067);assertEquals(10000, monitor.getInterval(), "Interval");
    }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}

    @Test
    public void testCollectionConstructorShouldDoNothingWithNullCollection() {__CLR4_4_1jc7jc7kylve3f5.R.globalSliceStart(getClass().getName(),25068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1roatpzjcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc7jc7kylve3f5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc7jc7kylve3f5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationMonitorTestCase.testCollectionConstructorShouldDoNothingWithNullCollection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1roatpzjcc(){try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25068);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25069);final Collection<FileAlterationObserver> observers = null;
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25070);final FileAlterationMonitor monitor = new FileAlterationMonitor(0, observers);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25071);assertFalse(monitor.getObservers().iterator().hasNext());
    }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}

    @Test
    public void testCollectionConstructorShouldDoNothingWithNullObservers() {__CLR4_4_1jc7jc7kylve3f5.R.globalSliceStart(getClass().getName(),25072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lj6bcijcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc7jc7kylve3f5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc7jc7kylve3f5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationMonitorTestCase.testCollectionConstructorShouldDoNothingWithNullObservers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lj6bcijcg(){try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25072);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25073);final Collection<FileAlterationObserver> observers = new ArrayList<>(5);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25074);final FileAlterationMonitor monitor = new FileAlterationMonitor(0, observers);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25075);assertFalse(monitor.getObservers().iterator().hasNext());
    }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}

    @Test
    public void testCollectionConstructor() {__CLR4_4_1jc7jc7kylve3f5.R.globalSliceStart(getClass().getName(),25076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16y27f5jck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc7jc7kylve3f5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc7jc7kylve3f5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationMonitorTestCase.testCollectionConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16y27f5jck(){try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25076);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25077);observer = new FileAlterationObserver("foo");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25078);final Collection<FileAlterationObserver> observers = Arrays.asList(observer);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25079);final FileAlterationMonitor monitor = new FileAlterationMonitor(0, observers);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25080);final Iterator<FileAlterationObserver> iterator = monitor.getObservers().iterator();
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25081);assertEquals(observer, iterator.next());
    }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}

    /**
     * Test add/remove observers.
     */
    @Test
    public void testAddRemoveObservers() {__CLR4_4_1jc7jc7kylve3f5.R.globalSliceStart(getClass().getName(),25082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l94as1jcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc7jc7kylve3f5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc7jc7kylve3f5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationMonitorTestCase.testAddRemoveObservers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l94as1jcq(){try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25082);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25083);FileAlterationObserver[] observers = null;

        // Null Observers
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25084);FileAlterationMonitor monitor = new FileAlterationMonitor(123, observers);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25085);assertEquals(123, monitor.getInterval(), "Interval");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25086);assertFalse(monitor.getObservers().iterator().hasNext(), "Observers[1]");

        // Null Observer
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25087);observers = new FileAlterationObserver[1]; // observer is null
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25088);monitor = new FileAlterationMonitor(456, observers);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25089);assertFalse(monitor.getObservers().iterator().hasNext(), "Observers[2]");

        // Null Observer
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25090);monitor.addObserver(null);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25091);assertFalse(monitor.getObservers().iterator().hasNext(), "Observers[3]");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25092);monitor.removeObserver(null);

        // Add Observer
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25093);final FileAlterationObserver observer = new FileAlterationObserver("foo");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25094);monitor.addObserver(observer);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25095);final Iterator<FileAlterationObserver> it = monitor.getObservers().iterator();
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25096);assertTrue(it.hasNext(), "Observers[4]");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25097);assertEquals(observer, it.next(), "Added");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25098);assertFalse(it.hasNext(), "Observers[5]");

        // Remove Observer
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25099);monitor.removeObserver(observer);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25100);assertFalse(monitor.getObservers().iterator().hasNext(), "Observers[6]");
    }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}

    /**
     * Test checkAndNotify() method
     * @throws Exception
     */
    @Test
    public void testMonitor() throws Exception {__CLR4_4_1jc7jc7kylve3f5.R.globalSliceStart(getClass().getName(),25101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyrexdjd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc7jc7kylve3f5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc7jc7kylve3f5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationMonitorTestCase.testMonitor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyrexdjd9() throws Exception{try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25101);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25102);final long interval = 100;
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25103);listener.clear();
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25104);final FileAlterationMonitor monitor = new FileAlterationMonitor(interval, observer);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25105);assertEquals(interval, monitor.getInterval(), "Interval");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25106);monitor.start();

        __CLR4_4_1jc7jc7kylve3f5.R.inc(25107);try {
            __CLR4_4_1jc7jc7kylve3f5.R.inc(25108);monitor.start(); // try and start again
            __CLR4_4_1jc7jc7kylve3f5.R.inc(25109);fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
            // expected result, monitor already running
        }

        // Create a File
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25110);checkCollectionsEmpty("A");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25111);File file1 = touch(new File(testDir, "file1.java"));
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25112);checkFile("Create", file1, listener.getCreatedFiles());
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25113);listener.clear();

        // Update a file
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25114);checkCollectionsEmpty("B");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25115);file1 = touch(file1);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25116);checkFile("Update", file1, listener.getChangedFiles());
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25117);listener.clear();

        // Delete a file
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25118);checkCollectionsEmpty("C");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25119);file1.delete();
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25120);checkFile("Delete", file1, listener.getDeletedFiles());
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25121);listener.clear();

        // Stop monitoring
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25122);monitor.stop();

        __CLR4_4_1jc7jc7kylve3f5.R.inc(25123);try {
            __CLR4_4_1jc7jc7kylve3f5.R.inc(25124);monitor.stop(); // try and stop again
            __CLR4_4_1jc7jc7kylve3f5.R.inc(25125);fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
            // expected result, monitor already stopped
        }
    }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}

    /**
     * Test using a thread factory.
     * @throws Exception
     */
    @Test
    public void testThreadFactory() throws Exception {__CLR4_4_1jc7jc7kylve3f5.R.globalSliceStart(getClass().getName(),25126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tnjjnvjdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc7jc7kylve3f5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc7jc7kylve3f5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationMonitorTestCase.testThreadFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tnjjnvjdy() throws Exception{try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25126);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25127);final long interval = 100;
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25128);listener.clear();
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25129);final FileAlterationMonitor monitor = new FileAlterationMonitor(interval, observer);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25130);monitor.setThreadFactory(Executors.defaultThreadFactory());
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25131);assertEquals(interval, monitor.getInterval(), "Interval");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25132);monitor.start();

        // Create a File
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25133);checkCollectionsEmpty("A");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25134);final File file2 = touch(new File(testDir, "file2.java"));
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25135);checkFile("Create", file2, listener.getCreatedFiles());
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25136);listener.clear();

        // Delete a file
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25137);checkCollectionsEmpty("B");
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25138);file2.delete();
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25139);checkFile("Delete", file2, listener.getDeletedFiles());
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25140);listener.clear();

        // Stop monitoring
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25141);monitor.stop();
    }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}

    /**
     * Check all the File Collections have the expected sizes.
     */
    private void checkFile(final String label, final File file, final Collection<File> files) {try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25142);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25143);for (int i = 0; (((i < 20)&&(__CLR4_4_1jc7jc7kylve3f5.R.iget(25144)!=0|true))||(__CLR4_4_1jc7jc7kylve3f5.R.iget(25145)==0&false)); i++) {{
            __CLR4_4_1jc7jc7kylve3f5.R.inc(25146);if ((((files.contains(file))&&(__CLR4_4_1jc7jc7kylve3f5.R.iget(25147)!=0|true))||(__CLR4_4_1jc7jc7kylve3f5.R.iget(25148)==0&false))) {{
                __CLR4_4_1jc7jc7kylve3f5.R.inc(25149);return; // found, test passes
            }
            }__CLR4_4_1jc7jc7kylve3f5.R.inc(25150);TestUtils.sleepQuietly(pauseTime);
        }
        }__CLR4_4_1jc7jc7kylve3f5.R.inc(25151);fail(label + " " + file + " not found");
    }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}

    /**
     * Test case for IO-535
     *
     * Verify that {@link FileAlterationMonitor#stop()} stops the created thread
     */
    @Test
    public void testStopWhileWaitingForNextInterval() throws Exception {__CLR4_4_1jc7jc7kylve3f5.R.globalSliceStart(getClass().getName(),25152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykv0rcjeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jc7jc7kylve3f5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jc7jc7kylve3f5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.monitor.FileAlterationMonitorTestCase.testStopWhileWaitingForNextInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ykv0rcjeo() throws Exception{try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25152);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25153);final Collection<Thread> createdThreads = new ArrayList<>(1);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25154);final ThreadFactory threadFactory = new ThreadFactory() {
            private final ThreadFactory delegate = Executors.defaultThreadFactory();

            @Override
            public Thread newThread(final Runnable r) {try{__CLR4_4_1jc7jc7kylve3f5.R.inc(25155);
                __CLR4_4_1jc7jc7kylve3f5.R.inc(25156);final Thread thread = delegate.newThread(r);
                __CLR4_4_1jc7jc7kylve3f5.R.inc(25157);thread.setDaemon(true); //do not leak threads if the test fails
                __CLR4_4_1jc7jc7kylve3f5.R.inc(25158);createdThreads.add(thread);
                __CLR4_4_1jc7jc7kylve3f5.R.inc(25159);return thread;
            }finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}
        };

        __CLR4_4_1jc7jc7kylve3f5.R.inc(25160);final FileAlterationMonitor monitor = new FileAlterationMonitor(1_000);
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25161);monitor.setThreadFactory(threadFactory);

        __CLR4_4_1jc7jc7kylve3f5.R.inc(25162);monitor.start();
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25163);assertFalse(createdThreads.isEmpty());

        __CLR4_4_1jc7jc7kylve3f5.R.inc(25164);Thread.sleep(10); // wait until the watcher thread enters Thread.sleep()
        __CLR4_4_1jc7jc7kylve3f5.R.inc(25165);monitor.stop(100);

        __CLR4_4_1jc7jc7kylve3f5.R.inc(25166);for (final Thread thread : createdThreads) {{
            __CLR4_4_1jc7jc7kylve3f5.R.inc(25167);assertFalse(thread.isAlive(), "The FileAlterationMonitor did not stop the threads it created.");
        }
    }}finally{__CLR4_4_1jc7jc7kylve3f5.R.flushNeeded();}}
}
