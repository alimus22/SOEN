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
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.Test;

/**
 * This is used to test IOCase for correctness.
 *
 */
public class IOCaseTestCase {static class __CLR4_4_1bm1bm1kylve1p3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,15265,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final boolean WINDOWS = File.separatorChar == '\\';

    @Test
    public void test_forName() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15j1vmabm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_forName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15j1vmabm1(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15049);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15050);assertEquals(IOCase.SENSITIVE, IOCase.forName("Sensitive"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15051);assertEquals(IOCase.INSENSITIVE, IOCase.forName("Insensitive"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15052);assertEquals(IOCase.SYSTEM, IOCase.forName("System"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15053);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15054);IOCase.forName("Blah");
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15055);fail();
        } catch (final IllegalArgumentException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15056);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15057);IOCase.forName(null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15058);fail();
        } catch (final IllegalArgumentException ignore) {}
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_serialization() throws Exception {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kejoq2bmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_serialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kejoq2bmb() throws Exception{try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15059);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15060);assertSame(IOCase.SENSITIVE, serialize(IOCase.SENSITIVE));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15061);assertSame(IOCase.INSENSITIVE, serialize(IOCase.INSENSITIVE));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15062);assertSame(IOCase.SYSTEM, serialize(IOCase.SYSTEM));
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_getName() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k5bmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k5bmf(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15063);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15064);assertEquals("Sensitive", IOCase.SENSITIVE.getName());
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15065);assertEquals("Insensitive", IOCase.INSENSITIVE.getName());
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15066);assertEquals("System", IOCase.SYSTEM.getName());
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_toString() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c0bmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c0bmj(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15067);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15068);assertEquals("Sensitive", IOCase.SENSITIVE.toString());
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15069);assertEquals("Insensitive", IOCase.INSENSITIVE.toString());
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15070);assertEquals("System", IOCase.SYSTEM.toString());
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_isCaseSensitive() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g45rsmbmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_isCaseSensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g45rsmbmn(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15071);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15072);assertTrue(IOCase.SENSITIVE.isCaseSensitive());
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15073);assertFalse(IOCase.INSENSITIVE.isCaseSensitive());
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15074);assertEquals(!WINDOWS, IOCase.SYSTEM.isCaseSensitive());
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}
    @Test
    public void test_checkCompare_functionality() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya0y71bmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkCompare_functionality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya0y71bmr(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15075);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15076);assertTrue(IOCase.SENSITIVE.checkCompareTo("ABC", "") > 0);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15077);assertTrue(IOCase.SENSITIVE.checkCompareTo("", "ABC") < 0);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15078);assertTrue(IOCase.SENSITIVE.checkCompareTo("ABC", "DEF") < 0);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15079);assertTrue(IOCase.SENSITIVE.checkCompareTo("DEF", "ABC") > 0);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15080);assertEquals(0, IOCase.SENSITIVE.checkCompareTo("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15081);assertEquals(0, IOCase.SENSITIVE.checkCompareTo("", ""));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15082);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15083);IOCase.SENSITIVE.checkCompareTo("ABC", null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15084);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15085);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15086);IOCase.SENSITIVE.checkCompareTo(null, "ABC");
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15087);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15088);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15089);IOCase.SENSITIVE.checkCompareTo(null, null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15090);fail();
        } catch (final NullPointerException ignore) {}
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkCompare_case() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i750t0bn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkCompare_case",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i750t0bn7(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15091);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15092);assertEquals(0, IOCase.SENSITIVE.checkCompareTo("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15093);assertTrue(IOCase.SENSITIVE.checkCompareTo("ABC", "abc") < 0);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15094);assertTrue(IOCase.SENSITIVE.checkCompareTo("abc", "ABC") > 0);

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15095);assertEquals(0, IOCase.INSENSITIVE.checkCompareTo("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15096);assertEquals(0, IOCase.INSENSITIVE.checkCompareTo("ABC", "abc"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15097);assertEquals(0, IOCase.INSENSITIVE.checkCompareTo("abc", "ABC"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15098);assertEquals(0, IOCase.SYSTEM.checkCompareTo("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15099);assertEquals(WINDOWS, IOCase.SYSTEM.checkCompareTo("ABC", "abc") == 0);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15100);assertEquals(WINDOWS, IOCase.SYSTEM.checkCompareTo("abc", "ABC") == 0);
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}


    @Test
    public void test_checkEquals_functionality() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14n82odbnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkEquals_functionality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14n82odbnh(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15101);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15102);assertFalse(IOCase.SENSITIVE.checkEquals("ABC", ""));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15103);assertFalse(IOCase.SENSITIVE.checkEquals("ABC", "A"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15104);assertFalse(IOCase.SENSITIVE.checkEquals("ABC", "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15105);assertTrue(IOCase.SENSITIVE.checkEquals("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15106);assertFalse(IOCase.SENSITIVE.checkEquals("ABC", "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15107);assertFalse(IOCase.SENSITIVE.checkEquals("ABC", "C"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15108);assertFalse(IOCase.SENSITIVE.checkEquals("ABC", "ABCD"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15109);assertFalse(IOCase.SENSITIVE.checkEquals("", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15110);assertTrue(IOCase.SENSITIVE.checkEquals("", ""));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15111);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15112);IOCase.SENSITIVE.checkEquals("ABC", null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15113);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15114);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15115);IOCase.SENSITIVE.checkEquals(null, "ABC");
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15116);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15117);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15118);IOCase.SENSITIVE.checkEquals(null, null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15119);fail();
        } catch (final NullPointerException ignore) {}
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkEquals_case() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6wz7gbo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkEquals_case",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6wz7gbo0(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15120);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15121);assertTrue(IOCase.SENSITIVE.checkEquals("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15122);assertFalse(IOCase.SENSITIVE.checkEquals("ABC", "Abc"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15123);assertTrue(IOCase.INSENSITIVE.checkEquals("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15124);assertTrue(IOCase.INSENSITIVE.checkEquals("ABC", "Abc"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15125);assertTrue(IOCase.SYSTEM.checkEquals("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15126);assertEquals(WINDOWS, IOCase.SYSTEM.checkEquals("ABC", "Abc"));
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkStartsWith_functionality() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rf9mh1bo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkStartsWith_functionality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rf9mh1bo7(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15127);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15128);assertTrue(IOCase.SENSITIVE.checkStartsWith("ABC", ""));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15129);assertTrue(IOCase.SENSITIVE.checkStartsWith("ABC", "A"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15130);assertTrue(IOCase.SENSITIVE.checkStartsWith("ABC", "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15131);assertTrue(IOCase.SENSITIVE.checkStartsWith("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15132);assertFalse(IOCase.SENSITIVE.checkStartsWith("ABC", "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15133);assertFalse(IOCase.SENSITIVE.checkStartsWith("ABC", "C"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15134);assertFalse(IOCase.SENSITIVE.checkStartsWith("ABC", "ABCD"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15135);assertFalse(IOCase.SENSITIVE.checkStartsWith("", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15136);assertTrue(IOCase.SENSITIVE.checkStartsWith("", ""));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15137);assertFalse(IOCase.SENSITIVE.checkStartsWith("ABC", null));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15138);assertFalse(IOCase.SENSITIVE.checkStartsWith(null, "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15139);assertFalse(IOCase.SENSITIVE.checkStartsWith(null, null));
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkStartsWith_case() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwzhdwbok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkStartsWith_case",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwzhdwbok(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15140);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15141);assertTrue(IOCase.SENSITIVE.checkStartsWith("ABC", "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15142);assertFalse(IOCase.SENSITIVE.checkStartsWith("ABC", "Ab"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15143);assertTrue(IOCase.INSENSITIVE.checkStartsWith("ABC", "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15144);assertTrue(IOCase.INSENSITIVE.checkStartsWith("ABC", "Ab"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15145);assertTrue(IOCase.SYSTEM.checkStartsWith("ABC", "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15146);assertEquals(WINDOWS, IOCase.SYSTEM.checkStartsWith("ABC", "Ab"));
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkEndsWith_functionality() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sddy30bor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkEndsWith_functionality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sddy30bor(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15147);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15148);assertTrue(IOCase.SENSITIVE.checkEndsWith("ABC", ""));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15149);assertFalse(IOCase.SENSITIVE.checkEndsWith("ABC", "A"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15150);assertFalse(IOCase.SENSITIVE.checkEndsWith("ABC", "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15151);assertTrue(IOCase.SENSITIVE.checkEndsWith("ABC", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15152);assertTrue(IOCase.SENSITIVE.checkEndsWith("ABC", "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15153);assertTrue(IOCase.SENSITIVE.checkEndsWith("ABC", "C"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15154);assertFalse(IOCase.SENSITIVE.checkEndsWith("ABC", "ABCD"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15155);assertFalse(IOCase.SENSITIVE.checkEndsWith("", "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15156);assertTrue(IOCase.SENSITIVE.checkEndsWith("", ""));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15157);assertFalse(IOCase.SENSITIVE.checkEndsWith("ABC", null));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15158);assertFalse(IOCase.SENSITIVE.checkEndsWith(null, "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15159);assertFalse(IOCase.SENSITIVE.checkEndsWith(null, null));
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkEndsWith_case() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155culfbp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkEndsWith_case",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155culfbp4(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15160);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15161);assertTrue(IOCase.SENSITIVE.checkEndsWith("ABC", "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15162);assertFalse(IOCase.SENSITIVE.checkEndsWith("ABC", "Bc"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15163);assertTrue(IOCase.INSENSITIVE.checkEndsWith("ABC", "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15164);assertTrue(IOCase.INSENSITIVE.checkEndsWith("ABC", "Bc"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15165);assertTrue(IOCase.SYSTEM.checkEndsWith("ABC", "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15166);assertEquals(WINDOWS, IOCase.SYSTEM.checkEndsWith("ABC", "Bc"));
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkIndexOf_functionality() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1q8zlbpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkIndexOf_functionality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1q8zlbpb(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15167);

        // start
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15168);assertEquals(0,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "A"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15169);assertEquals(-1,  IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "A"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15170);assertEquals(0,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15171);assertEquals(-1,  IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15172);assertEquals(0,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15173);assertEquals(-1,  IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 1, "ABC"));

        // middle
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15174);assertEquals(3,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "D"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15175);assertEquals(3,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "D"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15176);assertEquals(-1,  IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "D"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15177);assertEquals(3,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DE"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15178);assertEquals(3,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DE"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15179);assertEquals(-1,  IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DE"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15180);assertEquals(3,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DEF"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15181);assertEquals(3,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 3, "DEF"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15182);assertEquals(-1,  IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 4, "DEF"));

        // end
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15183);assertEquals(9,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "J"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15184);assertEquals(9,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "J"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15185);assertEquals(9,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "J"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15186);assertEquals(8,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "IJ"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15187);assertEquals(8,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "IJ"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15188);assertEquals(-1,  IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 9, "IJ"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15189);assertEquals(7,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 6, "HIJ"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15190);assertEquals(7,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 7, "HIJ"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15191);assertEquals(-1,  IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 8, "HIJ"));

        // not found
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15192);assertEquals(-1,   IOCase.SENSITIVE.checkIndexOf("ABCDEFGHIJ", 0, "DED"));

        // too long
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15193);assertEquals(-1,   IOCase.SENSITIVE.checkIndexOf("DEF", 0, "ABCDEFGHIJ"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15194);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15195);IOCase.SENSITIVE.checkIndexOf("ABC", 0, null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15196);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15197);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15198);IOCase.SENSITIVE.checkIndexOf(null, 0, "ABC");
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15199);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15200);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15201);IOCase.SENSITIVE.checkIndexOf(null, 0, null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15202);fail();
        } catch (final NullPointerException ignore) {}
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkIndexOf_case() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jamt6wbqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkIndexOf_case",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jamt6wbqb(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15203);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15204);assertEquals(1,  IOCase.SENSITIVE.checkIndexOf("ABC", 0, "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15205);assertEquals(-1, IOCase.SENSITIVE.checkIndexOf("ABC", 0, "Bc"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15206);assertEquals(1, IOCase.INSENSITIVE.checkIndexOf("ABC", 0, "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15207);assertEquals(1, IOCase.INSENSITIVE.checkIndexOf("ABC", 0, "Bc"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15208);assertEquals(1, IOCase.SYSTEM.checkIndexOf("ABC", 0, "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15209);assertEquals((((WINDOWS )&&(__CLR4_4_1bm1bm1kylve1p3.R.iget(15210)!=0|true))||(__CLR4_4_1bm1bm1kylve1p3.R.iget(15211)==0&false))? 1 : -1, IOCase.SYSTEM.checkIndexOf("ABC", 0, "Bc"));
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkRegionMatches_functionality() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16prullbqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkRegionMatches_functionality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16prullbqk(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15212);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15213);assertTrue(IOCase.SENSITIVE.checkRegionMatches("ABC", 0, ""));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15214);assertTrue(IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "A"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15215);assertTrue(IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15216);assertTrue(IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15217);assertFalse(IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15218);assertFalse(IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "C"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15219);assertFalse(IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "ABCD"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15220);assertFalse(IOCase.SENSITIVE.checkRegionMatches("", 0, "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15221);assertTrue(IOCase.SENSITIVE.checkRegionMatches("", 0, ""));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15222);assertTrue(IOCase.SENSITIVE.checkRegionMatches("ABC", 1, ""));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15223);assertFalse(IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "A"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15224);assertFalse(IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15225);assertFalse(IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15226);assertTrue(IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "BC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15227);assertFalse(IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "C"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15228);assertFalse(IOCase.SENSITIVE.checkRegionMatches("ABC", 1, "ABCD"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15229);assertFalse(IOCase.SENSITIVE.checkRegionMatches("", 1, "ABC"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15230);assertFalse(IOCase.SENSITIVE.checkRegionMatches("", 1, ""));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15231);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15232);IOCase.SENSITIVE.checkRegionMatches("ABC", 0, null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15233);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15234);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15235);IOCase.SENSITIVE.checkRegionMatches(null, 0, "ABC");
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15236);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15237);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15238);IOCase.SENSITIVE.checkRegionMatches(null, 0, null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15239);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15240);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15241);IOCase.SENSITIVE.checkRegionMatches("ABC", 1, null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15242);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15243);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15244);IOCase.SENSITIVE.checkRegionMatches(null, 1, "ABC");
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15245);fail();
        } catch (final NullPointerException ignore) {}
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15246);try {
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15247);IOCase.SENSITIVE.checkRegionMatches(null, 1, null);
            __CLR4_4_1bm1bm1kylve1p3.R.inc(15248);fail();
        } catch (final NullPointerException ignore) {}
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    @Test
    public void test_checkRegionMatches_case() {__CLR4_4_1bm1bm1kylve1p3.R.globalSliceStart(getClass().getName(),15249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120p0s2brl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bm1bm1kylve1p3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bm1bm1kylve1p3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOCaseTestCase.test_checkRegionMatches_case",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120p0s2brl(){try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15249);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15250);assertTrue(IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15251);assertFalse(IOCase.SENSITIVE.checkRegionMatches("ABC", 0, "Ab"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15252);assertTrue(IOCase.INSENSITIVE.checkRegionMatches("ABC", 0, "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15253);assertTrue(IOCase.INSENSITIVE.checkRegionMatches("ABC", 0, "Ab"));

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15254);assertTrue(IOCase.SYSTEM.checkRegionMatches("ABC", 0, "AB"));
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15255);assertEquals(WINDOWS, IOCase.SYSTEM.checkRegionMatches("ABC", 0, "Ab"));
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

    private IOCase serialize(final IOCase value) throws Exception {try{__CLR4_4_1bm1bm1kylve1p3.R.inc(15256);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15257);final ByteArrayOutputStream buf = new ByteArrayOutputStream();
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15258);final ObjectOutputStream out = new ObjectOutputStream(buf);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15259);out.writeObject(value);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15260);out.flush();
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15261);out.close();

        __CLR4_4_1bm1bm1kylve1p3.R.inc(15262);final ByteArrayInputStream bufin = new ByteArrayInputStream(buf.toByteArray());
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15263);final ObjectInputStream in = new ObjectInputStream(bufin);
        __CLR4_4_1bm1bm1kylve1p3.R.inc(15264);return (IOCase) in.readObject();
    }finally{__CLR4_4_1bm1bm1kylve1p3.R.flushNeeded();}}

}
