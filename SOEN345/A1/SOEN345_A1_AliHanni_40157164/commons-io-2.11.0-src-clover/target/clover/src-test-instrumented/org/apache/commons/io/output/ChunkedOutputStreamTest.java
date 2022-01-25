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
package org.apache.commons.io.output;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

/**
 * Test the chunked output stream
 */
public class ChunkedOutputStreamTest {static class __CLR4_4_1jtijtikylve3i1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,25707,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void write_four_chunks() throws Exception {__CLR4_4_1jtijtikylve3i1.R.globalSliceStart(getClass().getName(),25686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rwicmjti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtijtikylve3i1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtijtikylve3i1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ChunkedOutputStreamTest.write_four_chunks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rwicmjti() throws Exception{try{__CLR4_4_1jtijtikylve3i1.R.inc(25686);
        __CLR4_4_1jtijtikylve3i1.R.inc(25687);final AtomicInteger numWrites = new AtomicInteger();
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jtijtikylve3i1.R.inc(25688);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1jtijtikylve3i1.R.inc(25689);}};final ByteArrayOutputStream baos = newByteArrayOutputStream(numWrites);
            __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1jtijtikylve3i1.R.inc(25690);}};final ChunkedOutputStream chunked = new ChunkedOutputStream(baos, 10)) {
            __CLR4_4_1jtijtikylve3i1.R.inc(25691);chunked.write("0123456789012345678901234567891".getBytes());
            __CLR4_4_1jtijtikylve3i1.R.inc(25692);assertEquals(4, numWrites.get());
        }
    }finally{__CLR4_4_1jtijtikylve3i1.R.flushNeeded();}}

    @Test
    public void negative_chunksize_not_permitted() {__CLR4_4_1jtijtikylve3i1.R.globalSliceStart(getClass().getName(),25693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_145i8u0jtp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtijtikylve3i1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtijtikylve3i1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ChunkedOutputStreamTest.negative_chunksize_not_permitted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_145i8u0jtp(){try{__CLR4_4_1jtijtikylve3i1.R.inc(25693);
        __CLR4_4_1jtijtikylve3i1.R.inc(25694);assertThrows(IllegalArgumentException.class, () -> new ChunkedOutputStream(new ByteArrayOutputStream(), 0));
    }finally{__CLR4_4_1jtijtikylve3i1.R.flushNeeded();}}

    @Test
    public void defaultConstructor() throws IOException {__CLR4_4_1jtijtikylve3i1.R.globalSliceStart(getClass().getName(),25695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xg4540jtr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtijtikylve3i1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtijtikylve3i1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ChunkedOutputStreamTest.defaultConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xg4540jtr() throws IOException{try{__CLR4_4_1jtijtikylve3i1.R.inc(25695);
        __CLR4_4_1jtijtikylve3i1.R.inc(25696);final AtomicInteger numWrites = new AtomicInteger();
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jtijtikylve3i1.R.inc(25697);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1jtijtikylve3i1.R.inc(25698);}};final ByteArrayOutputStream baos = newByteArrayOutputStream(numWrites);
            __CLR4_4_1$AC1 __CLR$ACI3=new __CLR4_4_1$AC1(){{__CLR4_4_1jtijtikylve3i1.R.inc(25699);}};final ChunkedOutputStream chunked = new ChunkedOutputStream(baos)) {
            __CLR4_4_1jtijtikylve3i1.R.inc(25700);chunked.write(new byte[1024 * 4 + 1]);
            __CLR4_4_1jtijtikylve3i1.R.inc(25701);assertEquals(2, numWrites.get());
        }
    }finally{__CLR4_4_1jtijtikylve3i1.R.flushNeeded();}}

    private ByteArrayOutputStream newByteArrayOutputStream(final AtomicInteger numWrites) {try{__CLR4_4_1jtijtikylve3i1.R.inc(25702);
        __CLR4_4_1jtijtikylve3i1.R.inc(25703);return new ByteArrayOutputStream() {
            @Override
            public void write(final byte[] b, final int off, final int len) {try{__CLR4_4_1jtijtikylve3i1.R.inc(25704);
                __CLR4_4_1jtijtikylve3i1.R.inc(25705);numWrites.incrementAndGet();
                __CLR4_4_1jtijtikylve3i1.R.inc(25706);super.write(b, off, len);
            }finally{__CLR4_4_1jtijtikylve3i1.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1jtijtikylve3i1.R.flushNeeded();}}

}
