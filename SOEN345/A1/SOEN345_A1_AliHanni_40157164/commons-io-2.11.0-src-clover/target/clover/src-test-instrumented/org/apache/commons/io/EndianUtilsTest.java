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
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 *
 */
public class EndianUtilsTest  {static class __CLR4_4_1845845kylve0w9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,10703,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCtor() {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moazlf845();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testCtor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moazlf845(){try{__CLR4_4_1845845kylve0w9.R.inc(10517);
        __CLR4_4_1845845kylve0w9.R.inc(10518);new EndianUtils();
        // Constructor does not blow up.
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testEOFException() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttirkc847();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testEOFException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttirkc847() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10519);
        __CLR4_4_1845845kylve0w9.R.inc(10520);final ByteArrayInputStream input = new ByteArrayInputStream(new byte[] {});
        __CLR4_4_1845845kylve0w9.R.inc(10521);try {
            __CLR4_4_1845845kylve0w9.R.inc(10522);EndianUtils.readSwappedDouble(input);
            __CLR4_4_1845845kylve0w9.R.inc(10523);fail("Expected EOFException");
        } catch (final EOFException e) {
            // expected
        }
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testSwapShort() {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vy3rs284c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testSwapShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vy3rs284c(){try{__CLR4_4_1845845kylve0w9.R.inc(10524);
        __CLR4_4_1845845kylve0w9.R.inc(10525);assertEquals( (short) 0, EndianUtils.swapShort( (short) 0 ) );
        __CLR4_4_1845845kylve0w9.R.inc(10526);assertEquals( (short) 0x0201, EndianUtils.swapShort( (short) 0x0102 ) );
        __CLR4_4_1845845kylve0w9.R.inc(10527);assertEquals( (short) 0xffff, EndianUtils.swapShort( (short) 0xffff ) );
        __CLR4_4_1845845kylve0w9.R.inc(10528);assertEquals( (short) 0x0102, EndianUtils.swapShort( (short) 0x0201 ) );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testSwapInteger() {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182uy5c84h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testSwapInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182uy5c84h(){try{__CLR4_4_1845845kylve0w9.R.inc(10529);
        __CLR4_4_1845845kylve0w9.R.inc(10530);assertEquals( 0, EndianUtils.swapInteger( 0 ) );
        __CLR4_4_1845845kylve0w9.R.inc(10531);assertEquals( 0x04030201, EndianUtils.swapInteger( 0x01020304 ) );
        __CLR4_4_1845845kylve0w9.R.inc(10532);assertEquals( 0x01000000, EndianUtils.swapInteger( 0x00000001 ) );
        __CLR4_4_1845845kylve0w9.R.inc(10533);assertEquals( 0x00000001, EndianUtils.swapInteger( 0x01000000 ) );
        __CLR4_4_1845845kylve0w9.R.inc(10534);assertEquals( 0x11111111, EndianUtils.swapInteger( 0x11111111 ) );
        __CLR4_4_1845845kylve0w9.R.inc(10535);assertEquals( 0xabcdef10, EndianUtils.swapInteger( 0x10efcdab ) );
        __CLR4_4_1845845kylve0w9.R.inc(10536);assertEquals( 0xab, EndianUtils.swapInteger( 0xab000000 ) );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testSwapLong() {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p86y6g84p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testSwapLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p86y6g84p(){try{__CLR4_4_1845845kylve0w9.R.inc(10537);
        __CLR4_4_1845845kylve0w9.R.inc(10538);assertEquals( 0, EndianUtils.swapLong( 0 ) );
        __CLR4_4_1845845kylve0w9.R.inc(10539);assertEquals( 0x0807060504030201L, EndianUtils.swapLong( 0x0102030405060708L ) );
        __CLR4_4_1845845kylve0w9.R.inc(10540);assertEquals( 0xffffffffffffffffL, EndianUtils.swapLong( 0xffffffffffffffffL ) );
        __CLR4_4_1845845kylve0w9.R.inc(10541);assertEquals( 0xab, EndianUtils.swapLong( 0xab00000000000000L ) );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testSwapFloat() {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cu3jpa84u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testSwapFloat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cu3jpa84u(){try{__CLR4_4_1845845kylve0w9.R.inc(10542);
        __CLR4_4_1845845kylve0w9.R.inc(10543);assertEquals( 0.0f, EndianUtils.swapFloat( 0.0f ), 0.0 );
        __CLR4_4_1845845kylve0w9.R.inc(10544);final float f1 = Float.intBitsToFloat( 0x01020304 );
        __CLR4_4_1845845kylve0w9.R.inc(10545);final float f2 = Float.intBitsToFloat( 0x04030201 );
        __CLR4_4_1845845kylve0w9.R.inc(10546);assertEquals( f2, EndianUtils.swapFloat( f1 ), 0.0 );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testSwapDouble() {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qku6mb84z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testSwapDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qku6mb84z(){try{__CLR4_4_1845845kylve0w9.R.inc(10547);
        __CLR4_4_1845845kylve0w9.R.inc(10548);assertEquals( 0.0, EndianUtils.swapDouble( 0.0 ), 0.0 );
        __CLR4_4_1845845kylve0w9.R.inc(10549);final double d1 = Double.longBitsToDouble( 0x0102030405060708L );
        __CLR4_4_1845845kylve0w9.R.inc(10550);final double d2 = Double.longBitsToDouble( 0x0807060504030201L );
        __CLR4_4_1845845kylve0w9.R.inc(10551);assertEquals( d2, EndianUtils.swapDouble( d1 ), 0.0 );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    /**
     * Tests all swapXxxx methods for symmetry when going from one endian
     * to another and back again.
     */
    @Test
    public void testSymmetry() {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15up88l854();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testSymmetry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15up88l854(){try{__CLR4_4_1845845kylve0w9.R.inc(10552);
        __CLR4_4_1845845kylve0w9.R.inc(10553);assertEquals( (short) 0x0102, EndianUtils.swapShort( EndianUtils.swapShort( (short) 0x0102 ) ) );
        __CLR4_4_1845845kylve0w9.R.inc(10554);assertEquals( 0x01020304, EndianUtils.swapInteger( EndianUtils.swapInteger( 0x01020304 ) ) );
        __CLR4_4_1845845kylve0w9.R.inc(10555);assertEquals( 0x0102030405060708L, EndianUtils.swapLong( EndianUtils.swapLong( 0x0102030405060708L ) ) );
        __CLR4_4_1845845kylve0w9.R.inc(10556);final float f1 = Float.intBitsToFloat( 0x01020304 );
        __CLR4_4_1845845kylve0w9.R.inc(10557);assertEquals( f1, EndianUtils.swapFloat( EndianUtils.swapFloat( f1 ) ), 0.0 );
        __CLR4_4_1845845kylve0w9.R.inc(10558);final double d1 = Double.longBitsToDouble( 0x0102030405060708L );
        __CLR4_4_1845845kylve0w9.R.inc(10559);assertEquals( d1, EndianUtils.swapDouble( EndianUtils.swapDouble( d1 ) ), 0.0 );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testReadSwappedShort() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15m15w185c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testReadSwappedShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15m15w185c() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10560);
        __CLR4_4_1845845kylve0w9.R.inc(10561);final byte[] bytes = { 0x02, 0x01 };
        __CLR4_4_1845845kylve0w9.R.inc(10562);assertEquals( 0x0102, EndianUtils.readSwappedShort( bytes, 0 ) );

        __CLR4_4_1845845kylve0w9.R.inc(10563);final ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        __CLR4_4_1845845kylve0w9.R.inc(10564);assertEquals( 0x0102, EndianUtils.readSwappedShort( input ) );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testWriteSwappedShort() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ph5o1g85h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testWriteSwappedShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ph5o1g85h() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10565);
        __CLR4_4_1845845kylve0w9.R.inc(10566);byte[] bytes = new byte[2];
        __CLR4_4_1845845kylve0w9.R.inc(10567);EndianUtils.writeSwappedShort( bytes, 0, (short) 0x0102 );
        __CLR4_4_1845845kylve0w9.R.inc(10568);assertEquals( 0x02, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10569);assertEquals( 0x01, bytes[1] );

        __CLR4_4_1845845kylve0w9.R.inc(10570);final ByteArrayOutputStream baos = new ByteArrayOutputStream(2);
        __CLR4_4_1845845kylve0w9.R.inc(10571);EndianUtils.writeSwappedShort( baos, (short) 0x0102 );
        __CLR4_4_1845845kylve0w9.R.inc(10572);bytes = baos.toByteArray();
        __CLR4_4_1845845kylve0w9.R.inc(10573);assertEquals( 0x02, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10574);assertEquals( 0x01, bytes[1] );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testReadSwappedUnsignedShort() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svchp685r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testReadSwappedUnsignedShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svchp685r() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10575);
        __CLR4_4_1845845kylve0w9.R.inc(10576);final byte[] bytes = { 0x02, 0x01 };
        __CLR4_4_1845845kylve0w9.R.inc(10577);assertEquals( 0x00000102, EndianUtils.readSwappedUnsignedShort( bytes, 0 ) );

        __CLR4_4_1845845kylve0w9.R.inc(10578);final ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        __CLR4_4_1845845kylve0w9.R.inc(10579);assertEquals( 0x00000102, EndianUtils.readSwappedUnsignedShort( input ) );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testReadSwappedInteger() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tcdqwh85w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testReadSwappedInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tcdqwh85w() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10580);
        __CLR4_4_1845845kylve0w9.R.inc(10581);final byte[] bytes = { 0x04, 0x03, 0x02, 0x01 };
        __CLR4_4_1845845kylve0w9.R.inc(10582);assertEquals( 0x01020304, EndianUtils.readSwappedInteger( bytes, 0 ) );

        __CLR4_4_1845845kylve0w9.R.inc(10583);final ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        __CLR4_4_1845845kylve0w9.R.inc(10584);assertEquals( 0x01020304, EndianUtils.readSwappedInteger( input ) );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testWriteSwappedInteger() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11hblti861();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testWriteSwappedInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11hblti861() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10585);
        __CLR4_4_1845845kylve0w9.R.inc(10586);byte[] bytes = new byte[4];
        __CLR4_4_1845845kylve0w9.R.inc(10587);EndianUtils.writeSwappedInteger( bytes, 0, 0x01020304 );
        __CLR4_4_1845845kylve0w9.R.inc(10588);assertEquals( 0x04, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10589);assertEquals( 0x03, bytes[1] );
        __CLR4_4_1845845kylve0w9.R.inc(10590);assertEquals( 0x02, bytes[2] );
        __CLR4_4_1845845kylve0w9.R.inc(10591);assertEquals( 0x01, bytes[3] );

        __CLR4_4_1845845kylve0w9.R.inc(10592);final ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        __CLR4_4_1845845kylve0w9.R.inc(10593);EndianUtils.writeSwappedInteger( baos, 0x01020304 );
        __CLR4_4_1845845kylve0w9.R.inc(10594);bytes = baos.toByteArray();
        __CLR4_4_1845845kylve0w9.R.inc(10595);assertEquals( 0x04, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10596);assertEquals( 0x03, bytes[1] );
        __CLR4_4_1845845kylve0w9.R.inc(10597);assertEquals( 0x02, bytes[2] );
        __CLR4_4_1845845kylve0w9.R.inc(10598);assertEquals( 0x01, bytes[3] );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testReadSwappedUnsignedInteger() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_145p6sk86f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testReadSwappedUnsignedInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_145p6sk86f() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10599);
        __CLR4_4_1845845kylve0w9.R.inc(10600);final byte[] bytes = { 0x04, 0x03, 0x02, 0x01 };
        __CLR4_4_1845845kylve0w9.R.inc(10601);assertEquals( 0x0000000001020304L, EndianUtils.readSwappedUnsignedInteger( bytes, 0 ) );

        __CLR4_4_1845845kylve0w9.R.inc(10602);final ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        __CLR4_4_1845845kylve0w9.R.inc(10603);assertEquals( 0x0000000001020304L, EndianUtils.readSwappedUnsignedInteger( input ) );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testReadSwappedLong() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swx9m186k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testReadSwappedLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swx9m186k() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10604);
        __CLR4_4_1845845kylve0w9.R.inc(10605);final byte[] bytes = { 0x08, 0x07, 0x06, 0x05, 0x04, 0x03, 0x02, 0x01 };
        __CLR4_4_1845845kylve0w9.R.inc(10606);assertEquals( 0x0102030405060708L, EndianUtils.readSwappedLong( bytes, 0 ) );

        __CLR4_4_1845845kylve0w9.R.inc(10607);final ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        __CLR4_4_1845845kylve0w9.R.inc(10608);assertEquals( 0x0102030405060708L, EndianUtils.readSwappedLong( input ) );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testWriteSwappedLong() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18qz8mq86p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testWriteSwappedLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18qz8mq86p() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10609);
        __CLR4_4_1845845kylve0w9.R.inc(10610);byte[] bytes = new byte[8];
        __CLR4_4_1845845kylve0w9.R.inc(10611);EndianUtils.writeSwappedLong( bytes, 0, 0x0102030405060708L );
        __CLR4_4_1845845kylve0w9.R.inc(10612);assertEquals( 0x08, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10613);assertEquals( 0x07, bytes[1] );
        __CLR4_4_1845845kylve0w9.R.inc(10614);assertEquals( 0x06, bytes[2] );
        __CLR4_4_1845845kylve0w9.R.inc(10615);assertEquals( 0x05, bytes[3] );
        __CLR4_4_1845845kylve0w9.R.inc(10616);assertEquals( 0x04, bytes[4] );
        __CLR4_4_1845845kylve0w9.R.inc(10617);assertEquals( 0x03, bytes[5] );
        __CLR4_4_1845845kylve0w9.R.inc(10618);assertEquals( 0x02, bytes[6] );
        __CLR4_4_1845845kylve0w9.R.inc(10619);assertEquals( 0x01, bytes[7] );

        __CLR4_4_1845845kylve0w9.R.inc(10620);final ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        __CLR4_4_1845845kylve0w9.R.inc(10621);EndianUtils.writeSwappedLong( baos, 0x0102030405060708L );
        __CLR4_4_1845845kylve0w9.R.inc(10622);bytes = baos.toByteArray();
        __CLR4_4_1845845kylve0w9.R.inc(10623);assertEquals( 0x08, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10624);assertEquals( 0x07, bytes[1] );
        __CLR4_4_1845845kylve0w9.R.inc(10625);assertEquals( 0x06, bytes[2] );
        __CLR4_4_1845845kylve0w9.R.inc(10626);assertEquals( 0x05, bytes[3] );
        __CLR4_4_1845845kylve0w9.R.inc(10627);assertEquals( 0x04, bytes[4] );
        __CLR4_4_1845845kylve0w9.R.inc(10628);assertEquals( 0x03, bytes[5] );
        __CLR4_4_1845845kylve0w9.R.inc(10629);assertEquals( 0x02, bytes[6] );
        __CLR4_4_1845845kylve0w9.R.inc(10630);assertEquals( 0x01, bytes[7] );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testReadSwappedFloat() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vuxwdt87b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testReadSwappedFloat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vuxwdt87b() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10631);
        __CLR4_4_1845845kylve0w9.R.inc(10632);final byte[] bytes = { 0x04, 0x03, 0x02, 0x01 };
        __CLR4_4_1845845kylve0w9.R.inc(10633);final float f1 = Float.intBitsToFloat( 0x01020304 );
        __CLR4_4_1845845kylve0w9.R.inc(10634);final float f2 = EndianUtils.readSwappedFloat( bytes, 0 );
        __CLR4_4_1845845kylve0w9.R.inc(10635);assertEquals( f1, f2, 0.0 );

        __CLR4_4_1845845kylve0w9.R.inc(10636);final ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        __CLR4_4_1845845kylve0w9.R.inc(10637);assertEquals( f1, EndianUtils.readSwappedFloat( input ), 0.0 );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testWriteSwappedFloat() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rr2gc87i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testWriteSwappedFloat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rr2gc87i() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10638);
        __CLR4_4_1845845kylve0w9.R.inc(10639);byte[] bytes = new byte[4];
        __CLR4_4_1845845kylve0w9.R.inc(10640);final float f1 = Float.intBitsToFloat( 0x01020304 );
        __CLR4_4_1845845kylve0w9.R.inc(10641);EndianUtils.writeSwappedFloat( bytes, 0, f1 );
        __CLR4_4_1845845kylve0w9.R.inc(10642);assertEquals( 0x04, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10643);assertEquals( 0x03, bytes[1] );
        __CLR4_4_1845845kylve0w9.R.inc(10644);assertEquals( 0x02, bytes[2] );
        __CLR4_4_1845845kylve0w9.R.inc(10645);assertEquals( 0x01, bytes[3] );

        __CLR4_4_1845845kylve0w9.R.inc(10646);final ByteArrayOutputStream baos = new ByteArrayOutputStream(4);
        __CLR4_4_1845845kylve0w9.R.inc(10647);EndianUtils.writeSwappedFloat( baos, f1 );
        __CLR4_4_1845845kylve0w9.R.inc(10648);bytes = baos.toByteArray();
        __CLR4_4_1845845kylve0w9.R.inc(10649);assertEquals( 0x04, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10650);assertEquals( 0x03, bytes[1] );
        __CLR4_4_1845845kylve0w9.R.inc(10651);assertEquals( 0x02, bytes[2] );
        __CLR4_4_1845845kylve0w9.R.inc(10652);assertEquals( 0x01, bytes[3] );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testReadSwappedDouble() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18h628c87x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testReadSwappedDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18h628c87x() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10653);
        __CLR4_4_1845845kylve0w9.R.inc(10654);final byte[] bytes = { 0x08, 0x07, 0x06, 0x05, 0x04, 0x03, 0x02, 0x01 };
        __CLR4_4_1845845kylve0w9.R.inc(10655);final double d1 = Double.longBitsToDouble( 0x0102030405060708L );
        __CLR4_4_1845845kylve0w9.R.inc(10656);final double d2 = EndianUtils.readSwappedDouble( bytes, 0 );
        __CLR4_4_1845845kylve0w9.R.inc(10657);assertEquals( d1, d2, 0.0 );

        __CLR4_4_1845845kylve0w9.R.inc(10658);final ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        __CLR4_4_1845845kylve0w9.R.inc(10659);assertEquals( d1, EndianUtils.readSwappedDouble( input ), 0.0 );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    @Test
    public void testWriteSwappedDouble() throws IOException {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m7ixll884();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testWriteSwappedDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m7ixll884() throws IOException{try{__CLR4_4_1845845kylve0w9.R.inc(10660);
        __CLR4_4_1845845kylve0w9.R.inc(10661);byte[] bytes = new byte[8];
        __CLR4_4_1845845kylve0w9.R.inc(10662);final double d1 = Double.longBitsToDouble( 0x0102030405060708L );
        __CLR4_4_1845845kylve0w9.R.inc(10663);EndianUtils.writeSwappedDouble( bytes, 0, d1 );
        __CLR4_4_1845845kylve0w9.R.inc(10664);assertEquals( 0x08, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10665);assertEquals( 0x07, bytes[1] );
        __CLR4_4_1845845kylve0w9.R.inc(10666);assertEquals( 0x06, bytes[2] );
        __CLR4_4_1845845kylve0w9.R.inc(10667);assertEquals( 0x05, bytes[3] );
        __CLR4_4_1845845kylve0w9.R.inc(10668);assertEquals( 0x04, bytes[4] );
        __CLR4_4_1845845kylve0w9.R.inc(10669);assertEquals( 0x03, bytes[5] );
        __CLR4_4_1845845kylve0w9.R.inc(10670);assertEquals( 0x02, bytes[6] );
        __CLR4_4_1845845kylve0w9.R.inc(10671);assertEquals( 0x01, bytes[7] );

        __CLR4_4_1845845kylve0w9.R.inc(10672);final ByteArrayOutputStream baos = new ByteArrayOutputStream(8);
        __CLR4_4_1845845kylve0w9.R.inc(10673);EndianUtils.writeSwappedDouble( baos, d1 );
        __CLR4_4_1845845kylve0w9.R.inc(10674);bytes = baos.toByteArray();
        __CLR4_4_1845845kylve0w9.R.inc(10675);assertEquals( 0x08, bytes[0] );
        __CLR4_4_1845845kylve0w9.R.inc(10676);assertEquals( 0x07, bytes[1] );
        __CLR4_4_1845845kylve0w9.R.inc(10677);assertEquals( 0x06, bytes[2] );
        __CLR4_4_1845845kylve0w9.R.inc(10678);assertEquals( 0x05, bytes[3] );
        __CLR4_4_1845845kylve0w9.R.inc(10679);assertEquals( 0x04, bytes[4] );
        __CLR4_4_1845845kylve0w9.R.inc(10680);assertEquals( 0x03, bytes[5] );
        __CLR4_4_1845845kylve0w9.R.inc(10681);assertEquals( 0x02, bytes[6] );
        __CLR4_4_1845845kylve0w9.R.inc(10682);assertEquals( 0x01, bytes[7] );
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    // tests #IO-101
    @Test
    public void testSymmetryOfLong() {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0mbs888r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testSymmetryOfLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0mbs888r(){try{__CLR4_4_1845845kylve0w9.R.inc(10683);

        __CLR4_4_1845845kylve0w9.R.inc(10684);final double[] tests = {34.345, -345.5645, 545.12, 10.043, 7.123456789123};
        __CLR4_4_1845845kylve0w9.R.inc(10685);for (final double test : tests) {{

            // testing the real problem
            __CLR4_4_1845845kylve0w9.R.inc(10686);byte[] buffer = new byte[8];
            __CLR4_4_1845845kylve0w9.R.inc(10687);final long ln1 = Double.doubleToLongBits( test );
            __CLR4_4_1845845kylve0w9.R.inc(10688);EndianUtils.writeSwappedLong(buffer, 0, ln1);
            __CLR4_4_1845845kylve0w9.R.inc(10689);final long ln2 = EndianUtils.readSwappedLong(buffer, 0);
            __CLR4_4_1845845kylve0w9.R.inc(10690);assertEquals( ln1, ln2 );

            // testing the bug report
            __CLR4_4_1845845kylve0w9.R.inc(10691);buffer = new byte[8];
            __CLR4_4_1845845kylve0w9.R.inc(10692);EndianUtils.writeSwappedDouble(buffer, 0, test);
            __CLR4_4_1845845kylve0w9.R.inc(10693);final double val = EndianUtils.readSwappedDouble(buffer, 0);
            __CLR4_4_1845845kylve0w9.R.inc(10694);assertEquals( test, val, 0 );
        }
    }}finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

    // tests #IO-117
    @Test
    public void testUnsignedOverrun() throws Exception {__CLR4_4_1845845kylve0w9.R.globalSliceStart(getClass().getName(),10695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avyuhj893();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1845845kylve0w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1845845kylve0w9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.EndianUtilsTest.testUnsignedOverrun",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avyuhj893() throws Exception{try{__CLR4_4_1845845kylve0w9.R.inc(10695);
        __CLR4_4_1845845kylve0w9.R.inc(10696);final byte[] target = { 0, 0, 0, (byte)0x80 };
        __CLR4_4_1845845kylve0w9.R.inc(10697);final long expected = 0x80000000L;

        __CLR4_4_1845845kylve0w9.R.inc(10698);long actual = EndianUtils.readSwappedUnsignedInteger(target, 0);
        __CLR4_4_1845845kylve0w9.R.inc(10699);assertEquals(expected, actual, "readSwappedUnsignedInteger(byte[], int) was incorrect");

        __CLR4_4_1845845kylve0w9.R.inc(10700);final ByteArrayInputStream in = new ByteArrayInputStream(target);
        __CLR4_4_1845845kylve0w9.R.inc(10701);actual = EndianUtils.readSwappedUnsignedInteger(in);
        __CLR4_4_1845845kylve0w9.R.inc(10702);assertEquals(expected, actual, "readSwappedUnsignedInteger(InputStream) was incorrect");
    }finally{__CLR4_4_1845845kylve0w9.R.flushNeeded();}}

}
