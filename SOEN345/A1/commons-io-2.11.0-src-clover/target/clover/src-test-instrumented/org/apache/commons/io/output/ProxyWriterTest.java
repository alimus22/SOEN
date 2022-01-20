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
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import org.junit.jupiter.api.Test;

/**
 * Test {@link ProxyWriter}.
 *
 */
public class ProxyWriterTest {static class __CLR4_4_1khdkhdkylve3mm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26689,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void appendCharSequence() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1karomgkhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.appendCharSequence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1karomgkhd() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26545);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26546);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26547);}};final StringBuilderWriter writer = new StringBuilderWriter();
                __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26548);}};final ProxyWriter proxy = new ProxyWriter(writer)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26549);proxy.append("ABC");
            __CLR4_4_1khdkhdkylve3mm.R.inc(26550);assertEquals("ABC", writer.toString());
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void appendCharSequence_with_offset() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vq4u1nkhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.appendCharSequence_with_offset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vq4u1nkhj() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26551);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26552);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26553);}};final StringBuilderWriter writer = new StringBuilderWriter();
                __CLR4_4_1$AC1 __CLR$ACI3=new __CLR4_4_1$AC1(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26554);}};final ProxyWriter proxy = new ProxyWriter(writer)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26555);proxy.append("ABC", 1, 3);
            __CLR4_4_1khdkhdkylve3mm.R.inc(26556);proxy.flush();
            __CLR4_4_1khdkhdkylve3mm.R.inc(26557);assertEquals("BC", writer.toString());
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void appendChar() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rm6eonkhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.appendChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rm6eonkhq() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26558);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26559);try (__CLR4_4_1$AC2 __CLR$ACI4=new __CLR4_4_1$AC2(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26560);}};final StringBuilderWriter writer = new StringBuilderWriter();
                __CLR4_4_1$AC2 __CLR$ACI5=new __CLR4_4_1$AC2(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26561);}};final ProxyWriter proxy = new ProxyWriter(writer)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26562);proxy.append('c');
            __CLR4_4_1khdkhdkylve3mm.R.inc(26563);assertEquals("c", writer.toString());
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void writeString() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ov1ucpkhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.writeString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ov1ucpkhw() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26564);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26565);try (__CLR4_4_1$AC3 __CLR$ACI6=new __CLR4_4_1$AC3(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26566);}};final StringBuilderWriter writer = new StringBuilderWriter();
                __CLR4_4_1$AC3 __CLR$ACI7=new __CLR4_4_1$AC3(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26567);}};final ProxyWriter proxy = new ProxyWriter(writer)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26568);proxy.write("ABC");
            __CLR4_4_1khdkhdkylve3mm.R.inc(26569);assertEquals("ABC", writer.toString());
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void writeStringPartial() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xk9v3ski2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.writeStringPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xk9v3ski2() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26570);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26571);try (__CLR4_4_1$AC4 __CLR$ACI8=new __CLR4_4_1$AC4(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26572);}};final StringBuilderWriter writer = new StringBuilderWriter();
                __CLR4_4_1$AC4 __CLR$ACI9=new __CLR4_4_1$AC4(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26573);}};final ProxyWriter proxy = new ProxyWriter(writer)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26574);proxy.write("ABC", 1, 2);
            __CLR4_4_1khdkhdkylve3mm.R.inc(26575);assertEquals("BC", writer.toString());
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void writeCharArray() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12or54lki8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.writeCharArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12or54lki8() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26576);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26577);try (__CLR4_4_1$AC5 __CLR$ACI10=new __CLR4_4_1$AC5(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26578);}};final StringBuilderWriter writer = new StringBuilderWriter();
                __CLR4_4_1$AC5 __CLR$ACI11=new __CLR4_4_1$AC5(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26579);}};final ProxyWriter proxy = new ProxyWriter(writer)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26580);proxy.write(new char[] { 'A', 'B', 'C' });
            __CLR4_4_1khdkhdkylve3mm.R.inc(26581);assertEquals("ABC", writer.toString());
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void writeInt() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lubpzkie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.writeInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lubpzkie() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26582);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26583);try (__CLR4_4_1$AC6 __CLR$ACI12=new __CLR4_4_1$AC6(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26584);}};final StringBuilderWriter writer = new StringBuilderWriter();
                __CLR4_4_1$AC6 __CLR$ACI13=new __CLR4_4_1$AC6(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26585);}};final ProxyWriter proxy = new ProxyWriter(writer)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26586);proxy.write(65);
            __CLR4_4_1khdkhdkylve3mm.R.inc(26587);assertEquals("A", writer.toString());
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void writeCharArrayPartial() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oxjny4kik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.writeCharArrayPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oxjny4kik() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26588);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26589);try (__CLR4_4_1$AC7 __CLR$ACI14=new __CLR4_4_1$AC7(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26590);}};final StringBuilderWriter writer = new StringBuilderWriter();
                __CLR4_4_1$AC7 __CLR$ACI15=new __CLR4_4_1$AC7(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26591);}};final ProxyWriter proxy = new ProxyWriter(writer)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26592);proxy.write(new char[] { 'A', 'B', 'C' }, 1, 2);
            __CLR4_4_1khdkhdkylve3mm.R.inc(26593);assertEquals("BC", writer.toString());
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void nullString() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n3e7ghkiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.nullString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n3e7ghkiq() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26594);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26595);try (__CLR4_4_1$AC8 __CLR$ACI16=new __CLR4_4_1$AC8(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26596);}};final ProxyWriter proxy = new ProxyWriter(NullWriter.NULL_WRITER)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26597);proxy.write((String) null);
            __CLR4_4_1khdkhdkylve3mm.R.inc(26598);proxy.write((String) null, 0, 0);
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void nullCharArray() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1wk0tkiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.nullCharArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1wk0tkiv() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26599);
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26600);try (__CLR4_4_1$AC9 __CLR$ACI17=new __CLR4_4_1$AC9(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26601);}};final ProxyWriter proxy = new ProxyWriter(NullWriter.NULL_WRITER)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26602);proxy.write((char[]) null);
            __CLR4_4_1khdkhdkylve3mm.R.inc(26603);proxy.write((char[]) null, 0, 0);
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void nullCharSequence() throws Exception {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_176gkrfkj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.nullCharSequence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_176gkrfkj0() throws Exception{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26604);
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26605);try (__CLR4_4_1$AC10 __CLR$ACI18=new __CLR4_4_1$AC10(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26606);}};final ProxyWriter proxy = new ProxyWriter(NullWriter.NULL_WRITER)) {
            __CLR4_4_1khdkhdkylve3mm.R.inc(26607);proxy.append(null);
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_append_char() throws IOException {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cr7tpkj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_append_char",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cr7tpkj4() throws IOException{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26608);
        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26609);try (__CLR4_4_1$AC11 __CLR$ACI19=new __CLR4_4_1$AC11(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26610);}};final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                __CLR4_4_1$AC11 __CLR$ACI20=new __CLR4_4_1$AC11(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26611);}};final OutputStreamWriter osw = new OutputStreamWriter(baos) {
                    @Override
                    public void write(final int c) throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26612);
                        __CLR4_4_1khdkhdkylve3mm.R.inc(26613);throw new UnsupportedEncodingException("Bah");
                    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
                }) {
            class __CLR4_4_1$AC12 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26614);try (__CLR4_4_1$AC12 __CLR$ACI21=new __CLR4_4_1$AC12(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26615);}};ProxyWriter proxy = new ProxyWriter(osw)) {
                __CLR4_4_1khdkhdkylve3mm.R.inc(26616);assertThrows(UnsupportedEncodingException.class, () -> proxy.append('c'));
            }
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_append_charSequence() throws IOException {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gsgwpokjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_append_charSequence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gsgwpokjd() throws IOException{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26617);
        class __CLR4_4_1$AC13 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26618);try (__CLR4_4_1$AC13 __CLR$ACI22=new __CLR4_4_1$AC13(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26619);}};final OutputStreamWriter osw = new OutputStreamWriter(new ByteArrayOutputStream()) {
            @Override
            public Writer append(final CharSequence csq) throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26620);
                __CLR4_4_1khdkhdkylve3mm.R.inc(26621);throw new UnsupportedEncodingException("Bah");
            }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
        }) {
            class __CLR4_4_1$AC14 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26622);try (__CLR4_4_1$AC14 __CLR$ACI23=new __CLR4_4_1$AC14(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26623);}};ProxyWriter proxy = new ProxyWriter(osw)) {
                __CLR4_4_1khdkhdkylve3mm.R.inc(26624);assertThrows(UnsupportedEncodingException.class, () -> proxy.append("ABCE"));
            }
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_append_charSequence_offset() throws IOException {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnz7r0kjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_append_charSequence_offset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnz7r0kjl() throws IOException{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26625);
        class __CLR4_4_1$AC15 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26626);try (__CLR4_4_1$AC15 __CLR$ACI24=new __CLR4_4_1$AC15(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26627);}};final OutputStreamWriter osw = new OutputStreamWriter(new ByteArrayOutputStream()) {
            @Override
            public Writer append(final CharSequence csq, final int start, final int end) throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26628);
                __CLR4_4_1khdkhdkylve3mm.R.inc(26629);throw new UnsupportedEncodingException("Bah");
            }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
        }) {
            class __CLR4_4_1$AC16 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26630);try (__CLR4_4_1$AC16 __CLR$ACI25=new __CLR4_4_1$AC16(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26631);}};ProxyWriter proxy = new ProxyWriter(osw)) {
                __CLR4_4_1khdkhdkylve3mm.R.inc(26632);assertThrows(UnsupportedEncodingException.class, () -> proxy.append("ABCE", 1, 2));
            }
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_write_int() throws IOException {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bsc4uvkjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_write_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bsc4uvkjt() throws IOException{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26633);
        class __CLR4_4_1$AC17 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26634);try (__CLR4_4_1$AC17 __CLR$ACI26=new __CLR4_4_1$AC17(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26635);}};final OutputStreamWriter osw = new OutputStreamWriter(new ByteArrayOutputStream()) {
            @Override
            public void write(final int c) throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26636);
                __CLR4_4_1khdkhdkylve3mm.R.inc(26637);throw new UnsupportedEncodingException("Bah");
            }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
        }) {
            class __CLR4_4_1$AC18 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26638);try (__CLR4_4_1$AC18 __CLR$ACI27=new __CLR4_4_1$AC18(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26639);}};ProxyWriter proxy = new ProxyWriter(osw)) {
                __CLR4_4_1khdkhdkylve3mm.R.inc(26640);assertThrows(UnsupportedEncodingException.class, () -> proxy.write('a'));
            }
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_write_char_array() throws IOException {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lcwkqkk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_write_char_array",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lcwkqkk1() throws IOException{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26641);
        class __CLR4_4_1$AC19 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26642);try (__CLR4_4_1$AC19 __CLR$ACI28=new __CLR4_4_1$AC19(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26643);}};final OutputStreamWriter osw = new OutputStreamWriter(new ByteArrayOutputStream()) {
            @Override
            public void write(final char[] cbuf) throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26644);
                __CLR4_4_1khdkhdkylve3mm.R.inc(26645);throw new UnsupportedEncodingException("Bah");
            }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
        }) {
            class __CLR4_4_1$AC20 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26646);try (__CLR4_4_1$AC20 __CLR$ACI29=new __CLR4_4_1$AC20(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26647);}};ProxyWriter proxy = new ProxyWriter(osw)) {
                __CLR4_4_1khdkhdkylve3mm.R.inc(26648);assertThrows(UnsupportedEncodingException.class, () -> proxy.write("ABCE".toCharArray()));
            }
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_write_offset_char_array() throws IOException {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0ggbokk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_write_offset_char_array",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0ggbokk9() throws IOException{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26649);
        class __CLR4_4_1$AC21 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26650);try (__CLR4_4_1$AC21 __CLR$ACI30=new __CLR4_4_1$AC21(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26651);}};final OutputStreamWriter osw = new OutputStreamWriter(new ByteArrayOutputStream()) {
            @Override
            public void write(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26652);
                __CLR4_4_1khdkhdkylve3mm.R.inc(26653);throw new UnsupportedEncodingException("Bah");
            }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
        }) {
            class __CLR4_4_1$AC22 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26654);try (__CLR4_4_1$AC22 __CLR$ACI31=new __CLR4_4_1$AC22(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26655);}};ProxyWriter proxy = new ProxyWriter(osw)) {
                __CLR4_4_1khdkhdkylve3mm.R.inc(26656);assertThrows(UnsupportedEncodingException.class, () -> proxy.write("ABCE".toCharArray(), 2, 3));
            }
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_write_string() throws IOException {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gfadntkkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_write_string",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gfadntkkh() throws IOException{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26657);
        class __CLR4_4_1$AC23 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26658);try (__CLR4_4_1$AC23 __CLR$ACI32=new __CLR4_4_1$AC23(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26659);}};final OutputStreamWriter osw = new OutputStreamWriter(new ByteArrayOutputStream()) {
            @Override
            public void write(final String str) throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26660);
                __CLR4_4_1khdkhdkylve3mm.R.inc(26661);throw new UnsupportedEncodingException("Bah");
            }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
        }) {
            class __CLR4_4_1$AC24 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26662);try (__CLR4_4_1$AC24 __CLR$ACI33=new __CLR4_4_1$AC24(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26663);}};ProxyWriter proxy = new ProxyWriter(osw)) {
                __CLR4_4_1khdkhdkylve3mm.R.inc(26664);assertThrows(UnsupportedEncodingException.class, () -> proxy.write("ABCE"));
            }
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_write_string_offset() throws IOException {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av6dljkkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_write_string_offset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av6dljkkp() throws IOException{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26665);
        class __CLR4_4_1$AC25 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26666);try (__CLR4_4_1$AC25 __CLR$ACI34=new __CLR4_4_1$AC25(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26667);}};final OutputStreamWriter osw = new OutputStreamWriter(new ByteArrayOutputStream()) {
            @Override
            public void write(final String str, final int off, final int len) throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26668);
                __CLR4_4_1khdkhdkylve3mm.R.inc(26669);throw new UnsupportedEncodingException("Bah");
            }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
        }) {
            class __CLR4_4_1$AC26 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26670);try (__CLR4_4_1$AC26 __CLR$ACI35=new __CLR4_4_1$AC26(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26671);}};ProxyWriter proxy = new ProxyWriter(osw)) {
                __CLR4_4_1khdkhdkylve3mm.R.inc(26672);assertThrows(UnsupportedEncodingException.class, () -> proxy.write("ABCE", 1, 3));
            }
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_flush() throws IOException {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wixq0ckkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_flush",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wixq0ckkx() throws IOException{try{__CLR4_4_1khdkhdkylve3mm.R.inc(26673);
        class __CLR4_4_1$AC27 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26674);try (__CLR4_4_1$AC27 __CLR$ACI36=new __CLR4_4_1$AC27(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26675);}};final OutputStreamWriter osw = new OutputStreamWriter(new ByteArrayOutputStream()) {
            @Override
            public void flush() throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26676);
                __CLR4_4_1khdkhdkylve3mm.R.inc(26677);throw new UnsupportedEncodingException("Bah");
            }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
        }) {
            class __CLR4_4_1$AC28 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26678);try (__CLR4_4_1$AC28 __CLR$ACI37=new __CLR4_4_1$AC28(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26679);}};ProxyWriter proxy = new ProxyWriter(osw)) {
                __CLR4_4_1khdkhdkylve3mm.R.inc(26680);assertThrows(UnsupportedEncodingException.class, proxy::flush);
            }
        }
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}

    @Test
    public void exceptions_in_close() {__CLR4_4_1khdkhdkylve3mm.R.globalSliceStart(getClass().getName(),26681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ai2c80kl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khdkhdkylve3mm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khdkhdkylve3mm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyWriterTest.exceptions_in_close",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ai2c80kl5(){try{__CLR4_4_1khdkhdkylve3mm.R.inc(26681);
        __CLR4_4_1khdkhdkylve3mm.R.inc(26682);assertThrows(UnsupportedEncodingException.class, () -> {
            class __CLR4_4_1$AC29 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26683);try (__CLR4_4_1$AC29 __CLR$ACI38=new __CLR4_4_1$AC29(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26684);}};final OutputStreamWriter osw = new OutputStreamWriter(new ByteArrayOutputStream()) {
                @Override
                public void close() throws IOException {try{__CLR4_4_1khdkhdkylve3mm.R.inc(26685);
                    __CLR4_4_1khdkhdkylve3mm.R.inc(26686);throw new UnsupportedEncodingException("Bah");
                }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
            }) {
                class __CLR4_4_1$AC30 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1khdkhdkylve3mm.R.inc(26687);try (__CLR4_4_1$AC30 __CLR$ACI39=new __CLR4_4_1$AC30(){{__CLR4_4_1khdkhdkylve3mm.R.inc(26688);}};final ProxyWriter proxy = new ProxyWriter(osw)) {
                    // noop
                }
            }
        });
    }finally{__CLR4_4_1khdkhdkylve3mm.R.flushNeeded();}}
}
