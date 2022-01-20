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
 * Tests {@link InfiniteCircularInputStream}.
 */
public class InfiniteCircularInputStreamTest {static class __CLR4_4_1gv6gv6kylve2vz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21898,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void assertStreamOutput(final byte[] toCycle, final byte[] expected) throws IOException {try{__CLR4_4_1gv6gv6kylve2vz.R.inc(21858);
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21859);final byte[] actual = new byte[expected.length];

        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gv6gv6kylve2vz.R.inc(21860);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1gv6gv6kylve2vz.R.inc(21861);}};InputStream infStream = new InfiniteCircularInputStream(toCycle)) {
            __CLR4_4_1gv6gv6kylve2vz.R.inc(21862);final int actualReadBytes = infStream.read(actual);

            __CLR4_4_1gv6gv6kylve2vz.R.inc(21863);assertArrayEquals(expected, actual);
            __CLR4_4_1gv6gv6kylve2vz.R.inc(21864);assertEquals(expected.length, actualReadBytes);
        }
    }finally{__CLR4_4_1gv6gv6kylve2vz.R.flushNeeded();}}

    private InputStream createInputStream(final byte[] repeatContent) {try{__CLR4_4_1gv6gv6kylve2vz.R.inc(21865);
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21866);return new InfiniteCircularInputStream(repeatContent);
    }finally{__CLR4_4_1gv6gv6kylve2vz.R.flushNeeded();}}

    @Test
    public void testContainsEofInputSize0() {__CLR4_4_1gv6gv6kylve2vz.R.globalSliceStart(getClass().getName(),21867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7ld1lgvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv6gv6kylve2vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv6gv6kylve2vz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.InfiniteCircularInputStreamTest.testContainsEofInputSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7ld1lgvf(){try{__CLR4_4_1gv6gv6kylve2vz.R.inc(21867);
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21868);assertThrows(IllegalArgumentException.class, () -> createInputStream(new byte[] { -1 }));
    }finally{__CLR4_4_1gv6gv6kylve2vz.R.flushNeeded();}}

    @Test
    public void testCount0InputSize0() {__CLR4_4_1gv6gv6kylve2vz.R.globalSliceStart(getClass().getName(),21869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1msd0u9gvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv6gv6kylve2vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv6gv6kylve2vz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.InfiniteCircularInputStreamTest.testCount0InputSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1msd0u9gvh(){try{__CLR4_4_1gv6gv6kylve2vz.R.inc(21869);
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21870);assertThrows(IllegalArgumentException.class, () -> createInputStream(new byte[] {}));
    }finally{__CLR4_4_1gv6gv6kylve2vz.R.flushNeeded();}}

    @Test
    public void testCount0InputSize1() throws IOException {__CLR4_4_1gv6gv6kylve2vz.R.globalSliceStart(getClass().getName(),21871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jjd21sgvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv6gv6kylve2vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv6gv6kylve2vz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.InfiniteCircularInputStreamTest.testCount0InputSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jjd21sgvj() throws IOException{try{__CLR4_4_1gv6gv6kylve2vz.R.inc(21871);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gv6gv6kylve2vz.R.inc(21872);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1gv6gv6kylve2vz.R.inc(21873);}};InputStream in = createInputStream(new byte[] { 1 })) {
            // empty
        }
    }finally{__CLR4_4_1gv6gv6kylve2vz.R.flushNeeded();}}

    @Test
    public void testCount1InputSize1() throws IOException {__CLR4_4_1gv6gv6kylve2vz.R.globalSliceStart(getClass().getName(),21874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cryj9bgvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv6gv6kylve2vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv6gv6kylve2vz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.InfiniteCircularInputStreamTest.testCount1InputSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cryj9bgvm() throws IOException{try{__CLR4_4_1gv6gv6kylve2vz.R.inc(21874);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gv6gv6kylve2vz.R.inc(21875);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1gv6gv6kylve2vz.R.inc(21876);}};InputStream in = createInputStream(new byte[] { 1 })) {
            __CLR4_4_1gv6gv6kylve2vz.R.inc(21877);assertEquals(1, in.read());
            __CLR4_4_1gv6gv6kylve2vz.R.inc(21878);assertEquals(1, in.read());
        }
    }finally{__CLR4_4_1gv6gv6kylve2vz.R.flushNeeded();}}

    @Test
    public void testCycleBytes() throws IOException {__CLR4_4_1gv6gv6kylve2vz.R.globalSliceStart(getClass().getName(),21879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sljk5agvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv6gv6kylve2vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv6gv6kylve2vz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.InfiniteCircularInputStreamTest.testCycleBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sljk5agvr() throws IOException{try{__CLR4_4_1gv6gv6kylve2vz.R.inc(21879);
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21880);final byte[] input = { 1, 2 };
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21881);final byte[] expected = { 1, 2, 1, 2, 1 };

        __CLR4_4_1gv6gv6kylve2vz.R.inc(21882);assertStreamOutput(input, expected);
    }finally{__CLR4_4_1gv6gv6kylve2vz.R.flushNeeded();}}

    @Test
    public void testNullInputSize0() {__CLR4_4_1gv6gv6kylve2vz.R.globalSliceStart(getClass().getName(),21883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdagxxgvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv6gv6kylve2vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv6gv6kylve2vz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.InfiniteCircularInputStreamTest.testNullInputSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdagxxgvv(){try{__CLR4_4_1gv6gv6kylve2vz.R.inc(21883);
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21884);assertThrows(NullPointerException.class, () -> createInputStream(null));
    }finally{__CLR4_4_1gv6gv6kylve2vz.R.flushNeeded();}}

    @Test
    public void testWholeRangeOfBytes() throws IOException {__CLR4_4_1gv6gv6kylve2vz.R.globalSliceStart(getClass().getName(),21885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125pi0zgvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv6gv6kylve2vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv6gv6kylve2vz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.InfiniteCircularInputStreamTest.testWholeRangeOfBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125pi0zgvx() throws IOException{try{__CLR4_4_1gv6gv6kylve2vz.R.inc(21885);
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21886);final int size = Byte.MAX_VALUE - Byte.MIN_VALUE + 1;
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21887);final byte[] contentToCycle = new byte[size];
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21888);byte value = Byte.MIN_VALUE;
        __CLR4_4_1gv6gv6kylve2vz.R.inc(21889);for (int i = 0; (((i < contentToCycle.length)&&(__CLR4_4_1gv6gv6kylve2vz.R.iget(21890)!=0|true))||(__CLR4_4_1gv6gv6kylve2vz.R.iget(21891)==0&false)); i++) {{
            __CLR4_4_1gv6gv6kylve2vz.R.inc(21892);contentToCycle[i] = (((value == IOUtils.EOF )&&(__CLR4_4_1gv6gv6kylve2vz.R.iget(21893)!=0|true))||(__CLR4_4_1gv6gv6kylve2vz.R.iget(21894)==0&false))? 0 : value;
            __CLR4_4_1gv6gv6kylve2vz.R.inc(21895);value++;
        }

        }__CLR4_4_1gv6gv6kylve2vz.R.inc(21896);final byte[] expectedOutput = Arrays.copyOf(contentToCycle, size);

        __CLR4_4_1gv6gv6kylve2vz.R.inc(21897);assertStreamOutput(contentToCycle, expectedOutput);
    }finally{__CLR4_4_1gv6gv6kylve2vz.R.flushNeeded();}}

}
