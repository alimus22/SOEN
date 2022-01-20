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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link CircularInputStream}.
 */
public class CircularInputStreamTest {static class __CLR4_4_1gnbgnbkylve2st{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21620,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void assertStreamOutput(final byte[] toCycle, final byte[] expected) throws IOException {try{__CLR4_4_1gnbgnbkylve2st.R.inc(21575);
        __CLR4_4_1gnbgnbkylve2st.R.inc(21576);final byte[] actual = new byte[expected.length];

        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gnbgnbkylve2st.R.inc(21577);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1gnbgnbkylve2st.R.inc(21578);}};InputStream infStream = createInputStream(toCycle, -1)) {
            __CLR4_4_1gnbgnbkylve2st.R.inc(21579);final int actualReadBytes = infStream.read(actual);

            __CLR4_4_1gnbgnbkylve2st.R.inc(21580);assertArrayEquals(expected, actual);
            __CLR4_4_1gnbgnbkylve2st.R.inc(21581);assertEquals(expected.length, actualReadBytes);
        }
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

    private InputStream createInputStream(final byte[] repeatContent, final long targetByteCount) {try{__CLR4_4_1gnbgnbkylve2st.R.inc(21582);
        __CLR4_4_1gnbgnbkylve2st.R.inc(21583);return new CircularInputStream(repeatContent, targetByteCount);
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

    @Test
    public void testContainsEofInputSize0() {__CLR4_4_1gnbgnbkylve2st.R.globalSliceStart(getClass().getName(),21584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7ld1lgnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gnbgnbkylve2st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gnbgnbkylve2st.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CircularInputStreamTest.testContainsEofInputSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7ld1lgnk(){try{__CLR4_4_1gnbgnbkylve2st.R.inc(21584);
        __CLR4_4_1gnbgnbkylve2st.R.inc(21585);assertThrows(IllegalArgumentException.class, () -> createInputStream(new byte[] { -1 }, 0));
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

    @Test
    public void testCount0() throws IOException {__CLR4_4_1gnbgnbkylve2st.R.globalSliceStart(getClass().getName(),21586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qfa3qgnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gnbgnbkylve2st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gnbgnbkylve2st.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CircularInputStreamTest.testCount0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qfa3qgnm() throws IOException{try{__CLR4_4_1gnbgnbkylve2st.R.inc(21586);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gnbgnbkylve2st.R.inc(21587);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1gnbgnbkylve2st.R.inc(21588);}};InputStream in = createInputStream(new byte[] { 1, 2 }, 0)) {
            __CLR4_4_1gnbgnbkylve2st.R.inc(21589);assertEquals(IOUtils.EOF, in.read());
        }
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

    @Test
    public void testCount0InputSize0() {__CLR4_4_1gnbgnbkylve2st.R.globalSliceStart(getClass().getName(),21590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1msd0u9gnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gnbgnbkylve2st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gnbgnbkylve2st.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CircularInputStreamTest.testCount0InputSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1msd0u9gnq(){try{__CLR4_4_1gnbgnbkylve2st.R.inc(21590);
        __CLR4_4_1gnbgnbkylve2st.R.inc(21591);assertThrows(IllegalArgumentException.class, () -> createInputStream(new byte[] {}, 0));
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

    @Test
    public void testCount0InputSize1() throws IOException {__CLR4_4_1gnbgnbkylve2st.R.globalSliceStart(getClass().getName(),21592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jjd21sgns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gnbgnbkylve2st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gnbgnbkylve2st.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CircularInputStreamTest.testCount0InputSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jjd21sgns() throws IOException{try{__CLR4_4_1gnbgnbkylve2st.R.inc(21592);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gnbgnbkylve2st.R.inc(21593);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1gnbgnbkylve2st.R.inc(21594);}};InputStream in = createInputStream(new byte[] { 1 }, 0)) {
            __CLR4_4_1gnbgnbkylve2st.R.inc(21595);assertEquals(IOUtils.EOF, in.read());
        }
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

    @Test
    public void testCount1InputSize1() throws IOException {__CLR4_4_1gnbgnbkylve2st.R.globalSliceStart(getClass().getName(),21596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cryj9bgnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gnbgnbkylve2st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gnbgnbkylve2st.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CircularInputStreamTest.testCount1InputSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cryj9bgnw() throws IOException{try{__CLR4_4_1gnbgnbkylve2st.R.inc(21596);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gnbgnbkylve2st.R.inc(21597);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1gnbgnbkylve2st.R.inc(21598);}};InputStream in = createInputStream(new byte[] { 1 }, 1)) {
            __CLR4_4_1gnbgnbkylve2st.R.inc(21599);assertEquals(1, in.read());
            __CLR4_4_1gnbgnbkylve2st.R.inc(21600);assertEquals(IOUtils.EOF, in.read());
        }
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

    @Test
    public void testCycleBytes() throws IOException {__CLR4_4_1gnbgnbkylve2st.R.globalSliceStart(getClass().getName(),21601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sljk5ago1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gnbgnbkylve2st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gnbgnbkylve2st.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CircularInputStreamTest.testCycleBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sljk5ago1() throws IOException{try{__CLR4_4_1gnbgnbkylve2st.R.inc(21601);
        __CLR4_4_1gnbgnbkylve2st.R.inc(21602);final byte[] input = { 1, 2 };
        __CLR4_4_1gnbgnbkylve2st.R.inc(21603);final byte[] expected = { 1, 2, 1, 2, 1 };

        __CLR4_4_1gnbgnbkylve2st.R.inc(21604);assertStreamOutput(input, expected);
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

    @Test
    public void testNullInputSize0() {__CLR4_4_1gnbgnbkylve2st.R.globalSliceStart(getClass().getName(),21605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdagxxgo5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gnbgnbkylve2st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gnbgnbkylve2st.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CircularInputStreamTest.testNullInputSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdagxxgo5(){try{__CLR4_4_1gnbgnbkylve2st.R.inc(21605);
        __CLR4_4_1gnbgnbkylve2st.R.inc(21606);assertThrows(NullPointerException.class, () -> createInputStream(null, 0));
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

    @Test
    public void testWholeRangeOfBytes() throws IOException {__CLR4_4_1gnbgnbkylve2st.R.globalSliceStart(getClass().getName(),21607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125pi0zgo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gnbgnbkylve2st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gnbgnbkylve2st.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CircularInputStreamTest.testWholeRangeOfBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125pi0zgo7() throws IOException{try{__CLR4_4_1gnbgnbkylve2st.R.inc(21607);
        __CLR4_4_1gnbgnbkylve2st.R.inc(21608);final int size = Byte.MAX_VALUE - Byte.MIN_VALUE + 1;
        __CLR4_4_1gnbgnbkylve2st.R.inc(21609);final byte[] contentToCycle = new byte[size];
        __CLR4_4_1gnbgnbkylve2st.R.inc(21610);byte value = Byte.MIN_VALUE;
        __CLR4_4_1gnbgnbkylve2st.R.inc(21611);for (int i = 0; (((i < contentToCycle.length)&&(__CLR4_4_1gnbgnbkylve2st.R.iget(21612)!=0|true))||(__CLR4_4_1gnbgnbkylve2st.R.iget(21613)==0&false)); i++) {{
            __CLR4_4_1gnbgnbkylve2st.R.inc(21614);contentToCycle[i] = (((value == IOUtils.EOF )&&(__CLR4_4_1gnbgnbkylve2st.R.iget(21615)!=0|true))||(__CLR4_4_1gnbgnbkylve2st.R.iget(21616)==0&false))? 0 : value;
            __CLR4_4_1gnbgnbkylve2st.R.inc(21617);value++;
        }

        }__CLR4_4_1gnbgnbkylve2st.R.inc(21618);final byte[] expectedOutput = Arrays.copyOf(contentToCycle, size);

        __CLR4_4_1gnbgnbkylve2st.R.inc(21619);assertStreamOutput(contentToCycle, expectedOutput);
    }finally{__CLR4_4_1gnbgnbkylve2st.R.flushNeeded();}}

}
