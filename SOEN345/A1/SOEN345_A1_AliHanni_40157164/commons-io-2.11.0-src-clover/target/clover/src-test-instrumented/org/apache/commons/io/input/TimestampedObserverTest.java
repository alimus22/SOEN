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

package org.apache.commons.io.input;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Instant;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link TimestampedObserver}.
 */
public class TimestampedObserverTest {static class __CLR4_4_1i45i45kylve36a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,23500,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void test() throws IOException, InterruptedException {__CLR4_4_1i45i45kylve36a.R.globalSliceStart(getClass().getName(),23477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3i45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i45i45kylve36a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i45i45kylve36a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TimestampedObserverTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3i45() throws IOException, InterruptedException{try{__CLR4_4_1i45i45kylve36a.R.inc(23477);
        __CLR4_4_1i45i45kylve36a.R.inc(23478);final Instant before = Instant.now();
        __CLR4_4_1i45i45kylve36a.R.inc(23479);Thread.sleep(20); // Some OS' clock granularity may be high.
        __CLR4_4_1i45i45kylve36a.R.inc(23480);final TimestampedObserver timestampedObserver = new TimestampedObserver();
        // toString() should not blow up before close().
        __CLR4_4_1i45i45kylve36a.R.inc(23481);assertNotNull(timestampedObserver.toString());
        __CLR4_4_1i45i45kylve36a.R.inc(23482);assertTrue(timestampedObserver.getOpenInstant().isAfter(before));
        __CLR4_4_1i45i45kylve36a.R.inc(23483);assertTrue(timestampedObserver.getOpenToNowDuration().toNanos() > 0);
        __CLR4_4_1i45i45kylve36a.R.inc(23484);assertNull(timestampedObserver.getCloseInstant());
        __CLR4_4_1i45i45kylve36a.R.inc(23485);final byte[] buffer = MessageDigestCalculatingInputStreamTest
            .generateRandomByteStream(IOUtils.DEFAULT_BUFFER_SIZE);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1i45i45kylve36a.R.inc(23486);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1i45i45kylve36a.R.inc(23487);}};final ObservableInputStream ois = new ObservableInputStream(new ByteArrayInputStream(buffer),
            timestampedObserver)) {
            __CLR4_4_1i45i45kylve36a.R.inc(23488);assertTrue(timestampedObserver.getOpenInstant().isAfter(before));
            __CLR4_4_1i45i45kylve36a.R.inc(23489);assertTrue(timestampedObserver.getOpenToNowDuration().toNanos() > 0);
        }
        __CLR4_4_1i45i45kylve36a.R.inc(23490);assertTrue(timestampedObserver.getOpenInstant().isAfter(before));
        __CLR4_4_1i45i45kylve36a.R.inc(23491);assertTrue(timestampedObserver.getOpenToNowDuration().toNanos() > 0);
        __CLR4_4_1i45i45kylve36a.R.inc(23492);assertTrue(timestampedObserver.getCloseInstant().isAfter(timestampedObserver.getOpenInstant()));
        __CLR4_4_1i45i45kylve36a.R.inc(23493);assertTrue(timestampedObserver.getOpenToCloseDuration().toNanos() > 0);
        __CLR4_4_1i45i45kylve36a.R.inc(23494);assertNotNull(timestampedObserver.toString());
    }finally{__CLR4_4_1i45i45kylve36a.R.flushNeeded();}}

    @Test
    public void testExample() throws IOException {__CLR4_4_1i45i45kylve36a.R.globalSliceStart(getClass().getName(),23495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qu13y9i4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i45i45kylve36a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i45i45kylve36a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TimestampedObserverTest.testExample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qu13y9i4n() throws IOException{try{__CLR4_4_1i45i45kylve36a.R.inc(23495);
        __CLR4_4_1i45i45kylve36a.R.inc(23496);final TimestampedObserver timestampedObserver = new TimestampedObserver();
        __CLR4_4_1i45i45kylve36a.R.inc(23497);final byte[] buffer = MessageDigestCalculatingInputStreamTest
            .generateRandomByteStream(IOUtils.DEFAULT_BUFFER_SIZE);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1i45i45kylve36a.R.inc(23498);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1i45i45kylve36a.R.inc(23499);}};final ObservableInputStream ois = new ObservableInputStream(new ByteArrayInputStream(buffer),
            timestampedObserver)) {
            //
        }
        // System.out.printf("IO duration: %s%n", timestampedObserver);
        // System.out.printf("IO duration: %s%n", timestampedObserver.getOpenToCloseDuration());
    }finally{__CLR4_4_1i45i45kylve36a.R.flushNeeded();}}

}
