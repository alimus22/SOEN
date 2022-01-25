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
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.Writer;

import org.junit.jupiter.api.Test;

/**
 * Test case for {@link StringBuilderWriter}.
 *
 */
public class StringBuilderWriterTest {static class __CLR4_4_1kmpkmpkylve3nb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26815,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final char[] FOOBAR_CHARS = {'F', 'o', 'o', 'B', 'a', 'r'};


    @Test
    public void testAppendConstructCapacity() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u3n1okmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testAppendConstructCapacity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u3n1okmp() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26737);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26738);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26739);}};final Writer writer = new StringBuilderWriter(100)) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26740);writer.append("Foo");
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26741);assertEquals("Foo", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testAppendConstructStringBuilder() {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j29xfekmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testAppendConstructStringBuilder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j29xfekmu(){try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26742);
        __CLR4_4_1kmpkmpkylve3nb.R.inc(26743);final StringBuilder builder = new StringBuilder("Foo");
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26744);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26745);}};final StringBuilderWriter writer = new StringBuilderWriter(builder)) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26746);writer.append("Bar");
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26747);assertEquals("FooBar", writer.toString());
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26748);assertSame(builder, writer.getBuilder());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testAppendConstructNull() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tyc4nkn1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testAppendConstructNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tyc4nkn1() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26749);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26750);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26751);}};final Writer writer = new StringBuilderWriter(null)) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26752);writer.append("Foo");
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26753);assertEquals("Foo", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testAppendChar() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3wf93kn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testAppendChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3wf93kn6() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26754);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26755);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26756);}};final Writer writer = new StringBuilderWriter()) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26757);writer.append('F').append('o').append('o');
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26758);assertEquals("Foo", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testAppendCharSequence() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1woblaiknb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testAppendCharSequence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1woblaiknb() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26759);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26760);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26761);}};final Writer writer = new StringBuilderWriter()) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26762);writer.append("Foo").append("Bar");
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26763);assertEquals("FooBar", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testAppendCharSequencePortion() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3bhxnkng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testAppendCharSequencePortion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3bhxnkng() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26764);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26765);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26766);}};final Writer writer = new StringBuilderWriter()) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26767);writer.append("FooBar", 3, 6).append(new StringBuffer("FooBar"), 0, 3);
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26768);assertEquals("BarFoo", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testClose() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169vzsjknl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169vzsjknl() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26769);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26770);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26771);}};final Writer writer = new StringBuilderWriter()) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26772);try {
                __CLR4_4_1kmpkmpkylve3nb.R.inc(26773);writer.append("Foo");
                __CLR4_4_1kmpkmpkylve3nb.R.inc(26774);writer.close();
                __CLR4_4_1kmpkmpkylve3nb.R.inc(26775);writer.append("Bar");
            } catch (final Throwable t) {
                __CLR4_4_1kmpkmpkylve3nb.R.inc(26776);fail("Threw: " + t);
            }
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26777);assertEquals("FooBar", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testWriteChar() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e45e16knu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testWriteChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e45e16knu() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26778);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26779);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26780);}};final Writer writer = new StringBuilderWriter()) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26781);writer.write('F');
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26782);assertEquals("F", writer.toString());
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26783);writer.write('o');
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26784);assertEquals("Fo", writer.toString());
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26785);writer.write('o');
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26786);assertEquals("Foo", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testWriteCharArray() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ljc8zko3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testWriteCharArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ljc8zko3() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26787);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26788);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26789);}};final Writer writer = new StringBuilderWriter()) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26790);writer.write(new char[] { 'F', 'o', 'o' });
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26791);assertEquals("Foo", writer.toString());
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26792);writer.write(new char[] { 'B', 'a', 'r' });
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26793);assertEquals("FooBar", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testWriteCharArrayPortion() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdh4lkkoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testWriteCharArrayPortion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdh4lkkoa() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26794);
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26795);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26796);}};final Writer writer = new StringBuilderWriter()) {
        __CLR4_4_1kmpkmpkylve3nb.R.inc(26797);writer.write(FOOBAR_CHARS, 3, 3);
        __CLR4_4_1kmpkmpkylve3nb.R.inc(26798);assertEquals("Bar", writer.toString());
        __CLR4_4_1kmpkmpkylve3nb.R.inc(26799);writer.write(FOOBAR_CHARS, 0, 3);
        __CLR4_4_1kmpkmpkylve3nb.R.inc(26800);assertEquals("BarFoo", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testWriteString() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19nf51koh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testWriteString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19nf51koh() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26801);
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26802);try (__CLR4_4_1$AC10 __CLR$ACI10=new __CLR4_4_1$AC10(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26803);}};final Writer writer = new StringBuilderWriter()) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26804);writer.write("Foo");
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26805);assertEquals("Foo", writer.toString());
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26806);writer.write("Bar");
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26807);assertEquals("FooBar", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

    @Test
    public void testWriteStringPortion() throws IOException {__CLR4_4_1kmpkmpkylve3nb.R.globalSliceStart(getClass().getName(),26808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzcocwkoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kmpkmpkylve3nb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kmpkmpkylve3nb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.StringBuilderWriterTest.testWriteStringPortion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzcocwkoo() throws IOException{try{__CLR4_4_1kmpkmpkylve3nb.R.inc(26808);
        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kmpkmpkylve3nb.R.inc(26809);try (__CLR4_4_1$AC11 __CLR$ACI11=new __CLR4_4_1$AC11(){{__CLR4_4_1kmpkmpkylve3nb.R.inc(26810);}};final Writer writer = new StringBuilderWriter()) {
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26811);writer.write("FooBar", 3, 3);
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26812);assertEquals("Bar", writer.toString());
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26813);writer.write("FooBar", 0, 3);
            __CLR4_4_1kmpkmpkylve3nb.R.inc(26814);assertEquals("BarFoo", writer.toString());
        }
    }finally{__CLR4_4_1kmpkmpkylve3nb.R.flushNeeded();}}

}
