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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

/**
 * Tests the CountingInputStream.
 *
 */
public class CountingInputStreamTest {static class __CLR4_4_1gs2gs2kylve2vq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21858,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCounting() throws Exception {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17bhlu4gs2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testCounting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17bhlu4gs2() throws Exception{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21746);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21747);final String text = "A piece of text";
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21748);final byte[] bytes = text.getBytes();
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21749);final ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gs2gs2kylve2vq.R.inc(21750);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1gs2gs2kylve2vq.R.inc(21751);}};final CountingInputStream cis = new CountingInputStream(bais)) {

            // have to declare this larger as we're going to read
            // off the end of the stream and input stream seems
            // to do bounds checking
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21752);final byte[] result = new byte[21];

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21753);final byte[] ba = new byte[5];
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21754);int found = cis.read(ba);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21755);System.arraycopy(ba, 0, result, 0, 5);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21756);assertEquals(found, cis.getCount());

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21757);final int value = cis.read();
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21758);found++;
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21759);result[5] = (byte) value;
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21760);assertEquals(found, cis.getCount());

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21761);found += cis.read(result, 6, 5);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21762);assertEquals(found, cis.getCount());

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21763);found += cis.read(result, 11, 10); // off the end
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21764);assertEquals(found, cis.getCount());

            // trim to get rid of the 6 empty values
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21765);final String textResult = new String(result).trim();
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21766);assertEquals(textResult, text);
        }
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}


    /*
     * Test for files > 2GB in size - see issue IO-84
     */
    @Test
    public void testLargeFiles_IO84() throws Exception {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekpc06gsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testLargeFiles_IO84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekpc06gsn() throws Exception{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21767);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21768);final long size = (long) Integer.MAX_VALUE + (long) 1;
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21769);final NullInputStream mock = new NullInputStream(size);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21770);final CountingInputStream cis = new CountingInputStream(mock);

        // Test integer methods
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21771);IOUtils.consume(cis);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21772);try {
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21773);cis.getCount();
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21774);fail("Expected getCount() to throw an ArithmeticException");
        } catch (final ArithmeticException ae) {
            // expected result
        }
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21775);try {
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21776);cis.resetCount();
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21777);fail("Expected resetCount() to throw an ArithmeticException");
        } catch (final ArithmeticException ae) {
            // expected result
        }

        __CLR4_4_1gs2gs2kylve2vq.R.inc(21778);mock.close();

        // Test long methods
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21779);IOUtils.consume(cis);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21780);assertEquals(size, cis.getByteCount(), "getByteCount()");
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21781);assertEquals(size, cis.resetByteCount(), "resetByteCount()");
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}

    @Test
    public void testResetting() throws Exception {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ry2ci6gt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testResetting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ry2ci6gt2() throws Exception{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21782);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21783);final String text = "A piece of text";
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21784);final byte[] bytes = text.getBytes();
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21785);final ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gs2gs2kylve2vq.R.inc(21786);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1gs2gs2kylve2vq.R.inc(21787);}};final CountingInputStream cis = new CountingInputStream(bais)) {

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21788);final byte[] result = new byte[bytes.length];

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21789);int found = cis.read(result, 0, 5);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21790);assertEquals(found, cis.getCount());

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21791);final int count = cis.resetCount();
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21792);found = cis.read(result, 6, 5);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21793);assertEquals(found, count);
        }
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}

    @Test
    public void testZeroLength1() throws Exception {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2rng8gte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testZeroLength1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2rng8gte() throws Exception{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21794);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21795);final ByteArrayInputStream bais = new ByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gs2gs2kylve2vq.R.inc(21796);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1gs2gs2kylve2vq.R.inc(21797);}};final CountingInputStream cis = new CountingInputStream(bais)) {

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21798);final int found = cis.read();
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21799);assertEquals(-1, found);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21800);assertEquals(0, cis.getCount());
        }
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}

    @Test
    public void testZeroLength2() throws Exception {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbrm8pgtl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testZeroLength2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbrm8pgtl() throws Exception{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21801);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21802);final ByteArrayInputStream bais = new ByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gs2gs2kylve2vq.R.inc(21803);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1gs2gs2kylve2vq.R.inc(21804);}};final CountingInputStream cis = new CountingInputStream(bais)) {

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21805);final byte[] result = new byte[10];

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21806);final int found = cis.read(result);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21807);assertEquals(-1, found);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21808);assertEquals(0, cis.getCount());
        }
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}

    @Test
    public void testZeroLength3() throws Exception {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukrl16gtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testZeroLength3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukrl16gtt() throws Exception{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21809);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21810);final ByteArrayInputStream bais = new ByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gs2gs2kylve2vq.R.inc(21811);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1gs2gs2kylve2vq.R.inc(21812);}};final CountingInputStream cis = new CountingInputStream(bais)) {

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21813);final byte[] result = new byte[10];

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21814);final int found = cis.read(result, 0, 5);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21815);assertEquals(-1, found);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21816);assertEquals(0, cis.getCount());
        }
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}

    @Test
    public void testEOF1() throws Exception {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3dzcigu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testEOF1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3dzcigu1() throws Exception{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21817);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21818);final ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gs2gs2kylve2vq.R.inc(21819);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1gs2gs2kylve2vq.R.inc(21820);}};final CountingInputStream cis = new CountingInputStream(bais)) {

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21821);int found = cis.read();
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21822);assertEquals(0, found);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21823);assertEquals(1, cis.getCount());
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21824);found = cis.read();
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21825);assertEquals(0, found);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21826);assertEquals(2, cis.getCount());
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21827);found = cis.read();
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21828);assertEquals(-1, found);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21829);assertEquals(2, cis.getCount());
        }
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}

    @Test
    public void testEOF2() throws Exception {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aue0k1gue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testEOF2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aue0k1gue() throws Exception{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21830);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21831);final ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gs2gs2kylve2vq.R.inc(21832);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1gs2gs2kylve2vq.R.inc(21833);}};final CountingInputStream cis = new CountingInputStream(bais)) {

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21834);final byte[] result = new byte[10];

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21835);final int found = cis.read(result);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21836);assertEquals(2, found);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21837);assertEquals(2, cis.getCount());
        }
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}

    @Test
    public void testEOF3() throws Exception {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17le1rkgum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testEOF3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17le1rkgum() throws Exception{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21838);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21839);final ByteArrayInputStream bais = new ByteArrayInputStream(new byte[2]);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gs2gs2kylve2vq.R.inc(21840);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1gs2gs2kylve2vq.R.inc(21841);}};final CountingInputStream cis = new CountingInputStream(bais)) {

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21842);final byte[] result = new byte[10];

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21843);final int found = cis.read(result, 0, 5);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21844);assertEquals(2, found);
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21845);assertEquals(2, cis.getCount());
        }
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}

    @Test
    public void testSkipping() throws IOException {__CLR4_4_1gs2gs2kylve2vq.R.globalSliceStart(getClass().getName(),21846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0wet2guu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gs2gs2kylve2vq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gs2gs2kylve2vq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CountingInputStreamTest.testSkipping",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0wet2guu() throws IOException{try{__CLR4_4_1gs2gs2kylve2vq.R.inc(21846);
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21847);final String text = "Hello World!";
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21848);final byte[] bytes = text.getBytes();
        __CLR4_4_1gs2gs2kylve2vq.R.inc(21849);final ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gs2gs2kylve2vq.R.inc(21850);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1gs2gs2kylve2vq.R.inc(21851);}};final CountingInputStream cis = new CountingInputStream(bais)) {

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21852);assertEquals(6, cis.skip(6));
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21853);assertEquals(6, cis.getCount());
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21854);final byte[] result = new byte[6];
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21855);cis.read(result);

            __CLR4_4_1gs2gs2kylve2vq.R.inc(21856);assertEquals("World!", new String(result));
            __CLR4_4_1gs2gs2kylve2vq.R.inc(21857);assertEquals(12, cis.getCount());
        }
    }finally{__CLR4_4_1gs2gs2kylve2vq.R.flushNeeded();}}

}
