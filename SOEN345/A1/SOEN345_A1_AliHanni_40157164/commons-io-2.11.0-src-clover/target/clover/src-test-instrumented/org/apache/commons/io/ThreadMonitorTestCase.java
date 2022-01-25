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

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.Duration;

import org.apache.commons.io.test.TestUtils;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link ThreadMonitor}.
 */
public class ThreadMonitorTestCase {static class __CLR4_4_1d79d79kylve22a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17134,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test timeout.
     */
    @Test
    public void testTimeout() {__CLR4_4_1d79d79kylve22a.R.globalSliceStart(getClass().getName(),17109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11aepcmd79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d79d79kylve22a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d79d79kylve22a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ThreadMonitorTestCase.testTimeout",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11aepcmd79(){try{__CLR4_4_1d79d79kylve22a.R.inc(17109);
        __CLR4_4_1d79d79kylve22a.R.inc(17110);try {
            __CLR4_4_1d79d79kylve22a.R.inc(17111);final Thread monitor = ThreadMonitor.start(Duration.ofMillis(100));
            __CLR4_4_1d79d79kylve22a.R.inc(17112);TestUtils.sleep(200);
            __CLR4_4_1d79d79kylve22a.R.inc(17113);ThreadMonitor.stop(monitor);
            __CLR4_4_1d79d79kylve22a.R.inc(17114);fail("Expected InterruptedException");
        } catch (final InterruptedException e) {
            // expected result - timeout
        }
    }finally{__CLR4_4_1d79d79kylve22a.R.flushNeeded();}}

    /**
     * Test task completed before timeout.
     */
    @Test
    public void testCompletedWithoutTimeout() {__CLR4_4_1d79d79kylve22a.R.globalSliceStart(getClass().getName(),17115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gedhl3d7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d79d79kylve22a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d79d79kylve22a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ThreadMonitorTestCase.testCompletedWithoutTimeout",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gedhl3d7f(){try{__CLR4_4_1d79d79kylve22a.R.inc(17115);
        __CLR4_4_1d79d79kylve22a.R.inc(17116);try {
            __CLR4_4_1d79d79kylve22a.R.inc(17117);final Thread monitor = ThreadMonitor.start(Duration.ofMillis(200));
            __CLR4_4_1d79d79kylve22a.R.inc(17118);TestUtils.sleep(100);
            __CLR4_4_1d79d79kylve22a.R.inc(17119);ThreadMonitor.stop(monitor);
        } catch (final InterruptedException e) {
            __CLR4_4_1d79d79kylve22a.R.inc(17120);fail("Timed Out");
        }
    }finally{__CLR4_4_1d79d79kylve22a.R.flushNeeded();}}

    /**
     * Test No timeout.
     */
    @Test
    public void testNoTimeout() {__CLR4_4_1d79d79kylve22a.R.globalSliceStart(getClass().getName(),17121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14s9g23d7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d79d79kylve22a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d79d79kylve22a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ThreadMonitorTestCase.testNoTimeout",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14s9g23d7l(){try{__CLR4_4_1d79d79kylve22a.R.inc(17121);

        // timeout = -1
        __CLR4_4_1d79d79kylve22a.R.inc(17122);try {
            __CLR4_4_1d79d79kylve22a.R.inc(17123);final Thread monitor = ThreadMonitor.start(Duration.ofMillis(-1));
            __CLR4_4_1d79d79kylve22a.R.inc(17124);assertNull(monitor,"Timeout -1, Monitor should be null");
            __CLR4_4_1d79d79kylve22a.R.inc(17125);TestUtils.sleep(100);
            __CLR4_4_1d79d79kylve22a.R.inc(17126);ThreadMonitor.stop(monitor);
        } catch (final Exception e) {
            __CLR4_4_1d79d79kylve22a.R.inc(17127);fail("Timeout -1, threw " + e);
        }

        // timeout = 0
        __CLR4_4_1d79d79kylve22a.R.inc(17128);try {
            __CLR4_4_1d79d79kylve22a.R.inc(17129);final Thread monitor = ThreadMonitor.start(Duration.ZERO);
            __CLR4_4_1d79d79kylve22a.R.inc(17130);assertNull(monitor, "Timeout 0, Monitor should be null");
            __CLR4_4_1d79d79kylve22a.R.inc(17131);TestUtils.sleep(100);
            __CLR4_4_1d79d79kylve22a.R.inc(17132);ThreadMonitor.stop(monitor);
        } catch (final Exception e) {
            __CLR4_4_1d79d79kylve22a.R.inc(17133);fail("Timeout 0, threw " + e);
        }
    }finally{__CLR4_4_1d79d79kylve22a.R.flushNeeded();}}
}

