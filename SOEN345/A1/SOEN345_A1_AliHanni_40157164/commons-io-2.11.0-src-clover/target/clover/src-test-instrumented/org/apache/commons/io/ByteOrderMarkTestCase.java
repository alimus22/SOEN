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


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.nio.charset.Charset;

import org.junit.jupiter.api.Test;


/**
 * Test for {@link ByteOrderMark}.
 *
 */
public class ByteOrderMarkTestCase  {static class __CLR4_4_17ky7kykylve0rt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,9884,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final ByteOrderMark TEST_BOM_1 = new ByteOrderMark("test1", 1);
    private static final ByteOrderMark TEST_BOM_2 = new ByteOrderMark("test2", 1, 2);
    private static final ByteOrderMark TEST_BOM_3 = new ByteOrderMark("test3", 1, 2, 3);

    /** Test {@link ByteOrderMark#getCharsetName()} */
    @Test
    public void charsetName() {__CLR4_4_17ky7kykylve0rt.R.globalSliceStart(getClass().getName(),9826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oti67ky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ky7kykylve0rt.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ky7kykylve0rt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ByteOrderMarkTestCase.charsetName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oti67ky(){try{__CLR4_4_17ky7kykylve0rt.R.inc(9826);
        __CLR4_4_17ky7kykylve0rt.R.inc(9827);assertEquals("test1", TEST_BOM_1.getCharsetName(), "test1 name");
        __CLR4_4_17ky7kykylve0rt.R.inc(9828);assertEquals("test2", TEST_BOM_2.getCharsetName(), "test2 name");
        __CLR4_4_17ky7kykylve0rt.R.inc(9829);assertEquals("test3", TEST_BOM_3.getCharsetName(), "test3 name");
    }finally{__CLR4_4_17ky7kykylve0rt.R.flushNeeded();}}

    /** Tests that {@link ByteOrderMark#getCharsetName()} can be loaded as a {@link java.nio.charset.Charset} as advertised. */
    @Test
    public void constantCharsetNames() {__CLR4_4_17ky7kykylve0rt.R.globalSliceStart(getClass().getName(),9830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnrhpj7l2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ky7kykylve0rt.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ky7kykylve0rt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ByteOrderMarkTestCase.constantCharsetNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnrhpj7l2(){try{__CLR4_4_17ky7kykylve0rt.R.inc(9830);
        __CLR4_4_17ky7kykylve0rt.R.inc(9831);assertNotNull(Charset.forName(ByteOrderMark.UTF_8.getCharsetName()));
        __CLR4_4_17ky7kykylve0rt.R.inc(9832);assertNotNull(Charset.forName(ByteOrderMark.UTF_16BE.getCharsetName()));
        __CLR4_4_17ky7kykylve0rt.R.inc(9833);assertNotNull(Charset.forName(ByteOrderMark.UTF_16LE.getCharsetName()));
        __CLR4_4_17ky7kykylve0rt.R.inc(9834);assertNotNull(Charset.forName(ByteOrderMark.UTF_32BE.getCharsetName()));
        __CLR4_4_17ky7kykylve0rt.R.inc(9835);assertNotNull(Charset.forName(ByteOrderMark.UTF_32LE.getCharsetName()));
    }finally{__CLR4_4_17ky7kykylve0rt.R.flushNeeded();}}

    /** Test {@link ByteOrderMark#length()} */
    @Test
    public void testLength() {__CLR4_4_17ky7kykylve0rt.R.globalSliceStart(getClass().getName(),9836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15p23dt7l8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ky7kykylve0rt.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ky7kykylve0rt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ByteOrderMarkTestCase.testLength",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15p23dt7l8(){try{__CLR4_4_17ky7kykylve0rt.R.inc(9836);
        __CLR4_4_17ky7kykylve0rt.R.inc(9837);assertEquals(1, TEST_BOM_1.length(), "test1 length");
        __CLR4_4_17ky7kykylve0rt.R.inc(9838);assertEquals(2, TEST_BOM_2.length(), "test2 length");
        __CLR4_4_17ky7kykylve0rt.R.inc(9839);assertEquals(3, TEST_BOM_3.length(), "test3 length");
    }finally{__CLR4_4_17ky7kykylve0rt.R.flushNeeded();}}

    /** Test {@link ByteOrderMark#get(int)} */
    @Test
    public void get() {__CLR4_4_17ky7kykylve0rt.R.globalSliceStart(getClass().getName(),9840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9onqb7lc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ky7kykylve0rt.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ky7kykylve0rt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ByteOrderMarkTestCase.get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9onqb7lc(){try{__CLR4_4_17ky7kykylve0rt.R.inc(9840);
        __CLR4_4_17ky7kykylve0rt.R.inc(9841);assertEquals(1, TEST_BOM_1.get(0), "test1 get(0)");
        __CLR4_4_17ky7kykylve0rt.R.inc(9842);assertEquals(1, TEST_BOM_2.get(0), "test2 get(0)");
        __CLR4_4_17ky7kykylve0rt.R.inc(9843);assertEquals(2, TEST_BOM_2.get(1), "test2 get(1)");
        __CLR4_4_17ky7kykylve0rt.R.inc(9844);assertEquals(1, TEST_BOM_3.get(0), "test3 get(0)");
        __CLR4_4_17ky7kykylve0rt.R.inc(9845);assertEquals(2, TEST_BOM_3.get(1), "test3 get(1)");
        __CLR4_4_17ky7kykylve0rt.R.inc(9846);assertEquals(3, TEST_BOM_3.get(2), "test3 get(2)");
    }finally{__CLR4_4_17ky7kykylve0rt.R.flushNeeded();}}

    /** Test {@link ByteOrderMark#getBytes()} */
    @Test
    public void getBytes() {__CLR4_4_17ky7kykylve0rt.R.globalSliceStart(getClass().getName(),9847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16hgnrw7lj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ky7kykylve0rt.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ky7kykylve0rt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ByteOrderMarkTestCase.getBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16hgnrw7lj(){try{__CLR4_4_17ky7kykylve0rt.R.inc(9847);
        __CLR4_4_17ky7kykylve0rt.R.inc(9848);assertArrayEquals(TEST_BOM_1.getBytes(), new byte[]{(byte) 1}, "test1 bytes");
        __CLR4_4_17ky7kykylve0rt.R.inc(9849);TEST_BOM_1.getBytes()[0] = 2;
        __CLR4_4_17ky7kykylve0rt.R.inc(9850);assertArrayEquals(TEST_BOM_1.getBytes(), new byte[]{(byte) 1}, "test1 bytes");
        __CLR4_4_17ky7kykylve0rt.R.inc(9851);assertArrayEquals(TEST_BOM_2.getBytes(), new byte[]{(byte) 1, (byte) 2}, "test1 bytes");
        __CLR4_4_17ky7kykylve0rt.R.inc(9852);assertArrayEquals(TEST_BOM_3.getBytes(), new byte[]{(byte) 1, (byte) 2, (byte) 3}, "test1 bytes");
    }finally{__CLR4_4_17ky7kykylve0rt.R.flushNeeded();}}

    /** Test {@link ByteOrderMark#equals(Object)} */
    @SuppressWarnings("EqualsWithItself")
    @Test
    public void testEquals() {__CLR4_4_17ky7kykylve0rt.R.globalSliceStart(getClass().getName(),9853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6087lp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ky7kykylve0rt.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ky7kykylve0rt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ByteOrderMarkTestCase.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6087lp(){try{__CLR4_4_17ky7kykylve0rt.R.inc(9853);
        __CLR4_4_17ky7kykylve0rt.R.inc(9854);assertEquals(TEST_BOM_1, TEST_BOM_1, "test1 equals");
        __CLR4_4_17ky7kykylve0rt.R.inc(9855);assertEquals(TEST_BOM_2, TEST_BOM_2, "test2 equals");
        __CLR4_4_17ky7kykylve0rt.R.inc(9856);assertEquals(TEST_BOM_3, TEST_BOM_3, "test3 equals");

        __CLR4_4_17ky7kykylve0rt.R.inc(9857);assertNotEquals(TEST_BOM_1, new Object(), "Object not equal");
        __CLR4_4_17ky7kykylve0rt.R.inc(9858);assertNotEquals(TEST_BOM_1, new ByteOrderMark("1a", 2), "test1-1 not equal");
        __CLR4_4_17ky7kykylve0rt.R.inc(9859);assertNotEquals(TEST_BOM_1, new ByteOrderMark("1b", 1, 2), "test1-2 not test2");
        __CLR4_4_17ky7kykylve0rt.R.inc(9860);assertNotEquals(TEST_BOM_2, new ByteOrderMark("2", 1, 1), "test2 not equal");
        __CLR4_4_17ky7kykylve0rt.R.inc(9861);assertNotEquals(TEST_BOM_3, new ByteOrderMark("3", 1, 2, 4), "test3 not equal");
    }finally{__CLR4_4_17ky7kykylve0rt.R.flushNeeded();}}

    /** Test {@link ByteOrderMark#hashCode()} */
    @Test
    public void testHashCode() {__CLR4_4_17ky7kykylve0rt.R.globalSliceStart(getClass().getName(),9862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv87ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ky7kykylve0rt.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ky7kykylve0rt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ByteOrderMarkTestCase.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv87ly(){try{__CLR4_4_17ky7kykylve0rt.R.inc(9862);
        __CLR4_4_17ky7kykylve0rt.R.inc(9863);final int bomClassHash = ByteOrderMark.class.hashCode();
        __CLR4_4_17ky7kykylve0rt.R.inc(9864);assertEquals(bomClassHash + 1, TEST_BOM_1.hashCode(), "hash test1 ");
        __CLR4_4_17ky7kykylve0rt.R.inc(9865);assertEquals(bomClassHash + 3, TEST_BOM_2.hashCode(), "hash test2 ");
        __CLR4_4_17ky7kykylve0rt.R.inc(9866);assertEquals(bomClassHash + 6, TEST_BOM_3.hashCode(), "hash test3 ");
    }finally{__CLR4_4_17ky7kykylve0rt.R.flushNeeded();}}

    /** Test Errors */
    @Test
    public void errors() {__CLR4_4_17ky7kykylve0rt.R.globalSliceStart(getClass().getName(),9867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uszcmm7m3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ky7kykylve0rt.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ky7kykylve0rt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ByteOrderMarkTestCase.errors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uszcmm7m3(){try{__CLR4_4_17ky7kykylve0rt.R.inc(9867);
        __CLR4_4_17ky7kykylve0rt.R.inc(9868);try {
            __CLR4_4_17ky7kykylve0rt.R.inc(9869);new ByteOrderMark(null, 1,2,3);
            __CLR4_4_17ky7kykylve0rt.R.inc(9870);fail("null charset name, expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
        __CLR4_4_17ky7kykylve0rt.R.inc(9871);try {
            __CLR4_4_17ky7kykylve0rt.R.inc(9872);new ByteOrderMark("", 1,2,3);
            __CLR4_4_17ky7kykylve0rt.R.inc(9873);fail("no charset name, expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
        __CLR4_4_17ky7kykylve0rt.R.inc(9874);try {
            __CLR4_4_17ky7kykylve0rt.R.inc(9875);new ByteOrderMark("a", (int[])null);
            __CLR4_4_17ky7kykylve0rt.R.inc(9876);fail("null bytes, expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
        __CLR4_4_17ky7kykylve0rt.R.inc(9877);try {
            __CLR4_4_17ky7kykylve0rt.R.inc(9878);new ByteOrderMark("b");
            __CLR4_4_17ky7kykylve0rt.R.inc(9879);fail("empty bytes, expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_17ky7kykylve0rt.R.flushNeeded();}}

    /** Test {@link ByteOrderMark#toString()} */
    @Test
    public void testToString() {__CLR4_4_17ky7kykylve0rt.R.globalSliceStart(getClass().getName(),9880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid7mg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ky7kykylve0rt.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ky7kykylve0rt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.ByteOrderMarkTestCase.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid7mg(){try{__CLR4_4_17ky7kykylve0rt.R.inc(9880);
        __CLR4_4_17ky7kykylve0rt.R.inc(9881);assertEquals("ByteOrderMark[test1: 0x1]",          TEST_BOM_1.toString(), "test1 ");
        __CLR4_4_17ky7kykylve0rt.R.inc(9882);assertEquals("ByteOrderMark[test2: 0x1,0x2]",      TEST_BOM_2.toString(), "test2 ");
        __CLR4_4_17ky7kykylve0rt.R.inc(9883);assertEquals("ByteOrderMark[test3: 0x1,0x2,0x3]",  TEST_BOM_3.toString(), "test3 ");
    }finally{__CLR4_4_17ky7kykylve0rt.R.flushNeeded();}}
}
