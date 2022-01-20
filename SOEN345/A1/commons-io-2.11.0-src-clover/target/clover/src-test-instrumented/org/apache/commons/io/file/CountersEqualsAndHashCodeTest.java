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

package org.apache.commons.io.file;

import org.apache.commons.io.file.Counters.Counter;
import org.apache.commons.io.file.Counters.PathCounters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountersEqualsAndHashCodeTest {static class __CLR4_4_1dh9dh9kylve25n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBigIntegerCounterEquals() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hvshg2dh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testBigIntegerCounterEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hvshg2dh9(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17469);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17470);testEquals(Counters.bigIntegerCounter(), Counters.bigIntegerCounter());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    @Test
    public void testBigIntegerHashCode() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14utsi6dhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testBigIntegerHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14utsi6dhb(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17471);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17472);testHashCodes(Counters.bigIntegerCounter(), Counters.bigIntegerCounter());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    private void testEquals(final Counter counter1, final Counter counter2) {try{__CLR4_4_1dh9dh9kylve25n.R.inc(17473);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17474);Assertions.assertEquals(counter1, counter2);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17475);counter1.increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17476);Assertions.assertNotEquals(counter1, counter2);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17477);counter2.increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17478);Assertions.assertEquals(counter1, counter2);
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    private void testEqualsByteCounters(final PathCounters counter1, final PathCounters counter2) {try{__CLR4_4_1dh9dh9kylve25n.R.inc(17479);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17480);Assertions.assertEquals(counter1, counter2);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17481);counter1.getByteCounter().increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17482);Assertions.assertNotEquals(counter1, counter2);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17483);counter2.getByteCounter().increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17484);Assertions.assertEquals(counter1, counter2);
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    private void testEqualsDirectoryCounters(final PathCounters counter1, final PathCounters counter2) {try{__CLR4_4_1dh9dh9kylve25n.R.inc(17485);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17486);Assertions.assertEquals(counter1, counter2);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17487);counter1.getDirectoryCounter().increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17488);Assertions.assertNotEquals(counter1, counter2);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17489);counter2.getDirectoryCounter().increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17490);Assertions.assertEquals(counter1, counter2);
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    private void testEqualsFileCounters(final PathCounters counter1, final PathCounters counter2) {try{__CLR4_4_1dh9dh9kylve25n.R.inc(17491);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17492);Assertions.assertEquals(counter1, counter2);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17493);counter1.getFileCounter().increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17494);Assertions.assertNotEquals(counter1, counter2);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17495);counter2.getFileCounter().increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17496);Assertions.assertEquals(counter1, counter2);
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    private void testHashCodeFileCounters(final PathCounters counter1, final PathCounters counter2) {try{__CLR4_4_1dh9dh9kylve25n.R.inc(17497);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17498);Assertions.assertEquals(counter1.hashCode(), counter2.hashCode());
        __CLR4_4_1dh9dh9kylve25n.R.inc(17499);counter1.getFileCounter().increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17500);Assertions.assertNotEquals(counter1.hashCode(), counter2.hashCode());
        __CLR4_4_1dh9dh9kylve25n.R.inc(17501);counter2.getFileCounter().increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17502);Assertions.assertEquals(counter1.hashCode(), counter2.hashCode());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    private void testHashCodes(final Counter counter1, final Counter counter2) {try{__CLR4_4_1dh9dh9kylve25n.R.inc(17503);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17504);Assertions.assertEquals(counter1.hashCode(), counter2.hashCode());
        __CLR4_4_1dh9dh9kylve25n.R.inc(17505);counter1.increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17506);Assertions.assertNotEquals(counter1.hashCode(), counter2.hashCode());
        __CLR4_4_1dh9dh9kylve25n.R.inc(17507);counter2.increment();
        __CLR4_4_1dh9dh9kylve25n.R.inc(17508);Assertions.assertEquals(counter1.hashCode(), counter2.hashCode());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    @Test
    public void testLongCounterEquals() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eruq6kdid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testLongCounterEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eruq6kdid(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17509);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17510);testEquals(Counters.longCounter(), Counters.longCounter());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    @Test
    public void testLongCounterMixEquals() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fiu8kdif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testLongCounterMixEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fiu8kdif(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17511);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17512);testEquals(Counters.longCounter(), Counters.bigIntegerCounter());
        __CLR4_4_1dh9dh9kylve25n.R.inc(17513);testEquals(Counters.bigIntegerCounter(), Counters.longCounter());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    @Test
    public void testLongCounterHashCodes() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jce6q7dii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testLongCounterHashCodes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jce6q7dii(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17514);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17515);testHashCodes(Counters.longCounter(), Counters.longCounter());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    @Test
    public void testLongPathCountersEqualsByteCounters() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17d10j3dik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testLongPathCountersEqualsByteCounters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17d10j3dik(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17516);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17517);testEqualsByteCounters(Counters.longPathCounters(), Counters.longPathCounters());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    @Test
    public void testLongPathCountersEqualsDirectoryCounters() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115ac1qdim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testLongPathCountersEqualsDirectoryCounters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115ac1qdim(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17518);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17519);testEqualsDirectoryCounters(Counters.longPathCounters(), Counters.longPathCounters());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    @Test
    public void testLongPathCountersEqualsFileCounters() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfmt5pdio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testLongPathCountersEqualsFileCounters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfmt5pdio(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17520);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17521);testEqualsFileCounters(Counters.longPathCounters(), Counters.longPathCounters());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    @Test
    public void testLongPathCountersHashCodeFileCounters() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fln7ldiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testLongPathCountersHashCodeFileCounters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fln7ldiq(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17522);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17523);testHashCodeFileCounters(Counters.longPathCounters(), Counters.longPathCounters());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}

    @Test
    public void testMix() {__CLR4_4_1dh9dh9kylve25n.R.globalSliceStart(getClass().getName(),17524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16pmmb5dis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dh9dh9kylve25n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dh9dh9kylve25n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CountersEqualsAndHashCodeTest.testMix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16pmmb5dis(){try{__CLR4_4_1dh9dh9kylve25n.R.inc(17524);
        __CLR4_4_1dh9dh9kylve25n.R.inc(17525);testHashCodeFileCounters(Counters.longPathCounters(), Counters.bigIntegerPathCounters());
    }finally{__CLR4_4_1dh9dh9kylve25n.R.flushNeeded();}}
}
