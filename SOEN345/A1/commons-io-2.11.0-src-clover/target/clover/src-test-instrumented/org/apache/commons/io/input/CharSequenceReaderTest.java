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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Arrays;

import org.apache.commons.io.TestResources;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link CharSequenceReader}.
 *
 */
public class CharSequenceReaderTest {static class __CLR4_4_1gbhgbhkylve2r2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21368,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final char NONE = (new char[1])[0];

    @Test
    public void testClose() throws IOException {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169vzsjgbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169vzsjgbh() throws IOException{try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21149);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21150);final Reader reader = new CharSequenceReader("FooBar");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21151);checkRead(reader, "Foo");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21152);reader.close();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21153);checkRead(reader, "Foo");

        __CLR4_4_1gbhgbhkylve2r2.R.inc(21154);final Reader subReader = new CharSequenceReader("xFooBarx", 1, 7);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21155);checkRead(subReader, "Foo");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21156);subReader.close();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21157);checkRead(subReader, "Foo");
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    public void testReady() throws IOException {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ierae0gbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testReady",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ierae0gbq() throws IOException{try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21158);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21159);final Reader reader = new CharSequenceReader("FooBar");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21160);assertTrue(reader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21161);reader.skip(3);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21162);assertTrue(reader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21163);checkRead(reader, "Bar");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21164);assertFalse(reader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21165);reader.reset();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21166);assertTrue(reader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21167);reader.skip(2);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21168);assertTrue(reader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21169);reader.skip(10);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21170);assertFalse(reader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21171);reader.close();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21172);assertTrue(reader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21173);reader.skip(20);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21174);assertFalse(reader.ready());

        __CLR4_4_1gbhgbhkylve2r2.R.inc(21175);final Reader subReader = new CharSequenceReader("xFooBarx", 1, 7);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21176);assertTrue(subReader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21177);subReader.skip(3);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21178);assertTrue(subReader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21179);checkRead(subReader, "Bar");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21180);assertFalse(subReader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21181);subReader.reset();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21182);assertTrue(subReader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21183);subReader.skip(2);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21184);assertTrue(subReader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21185);subReader.skip(10);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21186);assertFalse(subReader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21187);subReader.close();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21188);assertTrue(subReader.ready());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21189);subReader.skip(20);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21190);assertFalse(subReader.ready());
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    public void testMarkSupported() throws Exception {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q660fegcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testMarkSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q660fegcn() throws Exception{try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21191);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21192);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21193);}};final Reader reader = new CharSequenceReader("FooBar")) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21194);assertTrue(reader.markSupported());
        }
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    public void testMark() throws IOException {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198wkyigcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testMark",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198wkyigcr() throws IOException{try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21195);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21196);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21197);}};final Reader reader = new CharSequenceReader("FooBar")) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21198);checkRead(reader, "Foo");
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21199);reader.mark(0);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21200);checkRead(reader, "Bar");
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21201);reader.reset();
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21202);checkRead(reader, "Bar");
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21203);reader.close();
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21204);checkRead(reader, "Foo");
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21205);reader.reset();
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21206);checkRead(reader, "Foo");
        }
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21207);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21208);}};final Reader subReader = new CharSequenceReader("xFooBarx", 1, 7)) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21209);checkRead(subReader, "Foo");
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21210);subReader.mark(0);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21211);checkRead(subReader, "Bar");
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21212);subReader.reset();
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21213);checkRead(subReader, "Bar");
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21214);subReader.close();
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21215);checkRead(subReader, "Foo");
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21216);subReader.reset();
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21217);checkRead(subReader, "Foo");
        }
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    public void testSkip() throws IOException {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamwgde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamwgde() throws IOException{try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21218);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21219);final Reader reader = new CharSequenceReader("FooBar");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21220);assertEquals(3, reader.skip(3));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21221);checkRead(reader, "Bar");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21222);assertEquals(0, reader.skip(3));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21223);reader.reset();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21224);assertEquals(2, reader.skip(2));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21225);assertEquals(4, reader.skip(10));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21226);assertEquals(0, reader.skip(1));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21227);reader.close();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21228);assertEquals(6, reader.skip(20));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21229);assertEquals(-1, reader.read());

        __CLR4_4_1gbhgbhkylve2r2.R.inc(21230);final Reader subReader = new CharSequenceReader("xFooBarx", 1, 7);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21231);assertEquals(3, subReader.skip(3));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21232);checkRead(subReader, "Bar");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21233);assertEquals(0, subReader.skip(3));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21234);subReader.reset();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21235);assertEquals(2, subReader.skip(2));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21236);assertEquals(4, subReader.skip(10));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21237);assertEquals(0, subReader.skip(1));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21238);subReader.close();
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21239);assertEquals(6, subReader.skip(20));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21240);assertEquals(-1, subReader.read());
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    public void testRead() throws IOException {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9ovapge1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9ovapge1() throws IOException{try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21241);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21242);final String value = "Foo";
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21243);testRead(value);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21244);testRead(new StringBuilder(value));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21245);testRead(new StringBuffer(value));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21246);testRead(CharBuffer.wrap(value));
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    private void testRead(final CharSequence charSequence) throws IOException {try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21247);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21248);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21249);}};final Reader reader = new CharSequenceReader(charSequence)) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21250);assertEquals('F', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21251);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21252);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21253);assertEquals(-1, reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21254);assertEquals(-1, reader.read());
        }
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21255);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21256);}};final Reader reader = new CharSequenceReader(charSequence, 1, 5)) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21257);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21258);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21259);assertEquals(-1, reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21260);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    public void testReadCharArray() throws IOException {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pei1umgel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testReadCharArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pei1umgel() throws IOException{try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21261);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21262);final String value = "FooBar";
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21263);testReadCharArray(value);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21264);testReadCharArray(new StringBuilder(value));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21265);testReadCharArray(new StringBuffer(value));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21266);testReadCharArray(CharBuffer.wrap(value));
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    private void testReadCharArray(final CharSequence charSequence) throws IOException {try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21267);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21268);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21269);}};final Reader reader = new CharSequenceReader(charSequence)) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21270);char[] chars = new char[2];
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21271);assertEquals(2, reader.read(chars));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21272);checkArray(new char[] { 'F', 'o' }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21273);chars = new char[3];
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21274);assertEquals(3, reader.read(chars));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21275);checkArray(new char[] { 'o', 'B', 'a' }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21276);chars = new char[3];
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21277);assertEquals(1, reader.read(chars));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21278);checkArray(new char[] { 'r', NONE, NONE }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21279);assertEquals(-1, reader.read(chars));
        }
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21280);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21281);}};final Reader reader = new CharSequenceReader(charSequence, 1, 5)) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21282);char[] chars = new char[2];
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21283);assertEquals(2, reader.read(chars));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21284);checkArray(new char[] { 'o', 'o' }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21285);chars = new char[3];
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21286);assertEquals(2, reader.read(chars));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21287);checkArray(new char[] { 'B', 'a', NONE }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21288);chars = new char[3];
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21289);assertEquals(-1, reader.read(chars));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21290);checkArray(new char[] { NONE, NONE, NONE }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21291);assertEquals(-1, reader.read(chars));
        }
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    public void testReadCharArrayPortion() throws IOException {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iws4y5gfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testReadCharArrayPortion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iws4y5gfg() throws IOException{try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21292);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21293);final String value = "FooBar";
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21294);testReadCharArrayPortion(value);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21295);testReadCharArrayPortion(new StringBuilder(value));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21296);testReadCharArrayPortion(new StringBuffer(value));
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21297);testReadCharArrayPortion(CharBuffer.wrap(value));
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    private void testReadCharArrayPortion(final CharSequence charSequence) throws IOException {try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21298);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21299);final char[] chars = new char[10];
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21300);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21301);}};final Reader reader = new CharSequenceReader(charSequence)) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21302);assertEquals(3, reader.read(chars, 3, 3));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21303);checkArray(new char[] { NONE, NONE, NONE, 'F', 'o', 'o' }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21304);assertEquals(3, reader.read(chars, 0, 3));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21305);checkArray(new char[] { 'B', 'a', 'r', 'F', 'o', 'o', NONE }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21306);assertEquals(-1, reader.read(chars));
        }
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21307);Arrays.fill(chars, NONE);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21308);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21309);}};final Reader reader = new CharSequenceReader(charSequence, 1, 5)) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21310);assertEquals(2, reader.read(chars, 3, 2));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21311);checkArray(new char[] { NONE, NONE, NONE, 'o', 'o', NONE }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21312);assertEquals(2, reader.read(chars, 0, 3));
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21313);checkArray(new char[] { 'B', 'a', NONE, 'o', 'o', NONE }, chars);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21314);assertEquals(-1, reader.read(chars));
        }
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    private void checkRead(final Reader reader, final String expected) throws IOException {try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21315);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21316);for (int i = 0; (((i < expected.length())&&(__CLR4_4_1gbhgbhkylve2r2.R.iget(21317)!=0|true))||(__CLR4_4_1gbhgbhkylve2r2.R.iget(21318)==0&false)); i++) {{
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21319);assertEquals(expected.charAt(i), (char)reader.read(), "Read[" + i + "] of '" + expected + "'");
        }
    }}finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    private void checkArray(final char[] expected, final char[] actual) {try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21320);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21321);for (int i = 0; (((i < expected.length)&&(__CLR4_4_1gbhgbhkylve2r2.R.iget(21322)!=0|true))||(__CLR4_4_1gbhgbhkylve2r2.R.iget(21323)==0&false)); i++) {{
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21324);assertEquals(expected[i], actual[i], "Compare[" +i + "]");
        }
    }}finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    public void testConstructor() {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hggd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hggd(){try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21325);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21326);assertThrows(IllegalArgumentException.class, () -> new CharSequenceReader("FooBar", -1, 6),
                "Expected exception not thrown for negative start.");
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21327);assertThrows(IllegalArgumentException.class, () -> new CharSequenceReader("FooBar", 1, 0),
                "Expected exception not thrown for end before start.");
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    @SuppressWarnings("resource") // don't really need to close CharSequenceReader here
    public void testToString() {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidggg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidggg(){try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21328);
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21329);assertEquals("FooBar", new CharSequenceReader("FooBar").toString());
        __CLR4_4_1gbhgbhkylve2r2.R.inc(21330);assertEquals("FooBar", new CharSequenceReader("xFooBarx", 1, 7).toString());
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}

    @Test
    public void testSerialization() throws IOException, ClassNotFoundException {__CLR4_4_1gbhgbhkylve2r2.R.globalSliceStart(getClass().getName(),21331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9ggj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gbhgbhkylve2r2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gbhgbhkylve2r2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceReaderTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9ggj() throws IOException, ClassNotFoundException{try{__CLR4_4_1gbhgbhkylve2r2.R.inc(21331);
        /*
         * File CharSequenceReader.bin contains a CharSequenceReader that was serialized before
         * the start and end fields were added. Its CharSequence is "FooBar".
         * This part of the test will test that adding the fields does not break any existing
         * serialized CharSequenceReaders.
         */
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21332);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21333);}};ObjectInputStream ois = new ObjectInputStream(TestResources.getInputStream("CharSequenceReader.bin"))) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21334);final CharSequenceReader reader = (CharSequenceReader) ois.readObject();
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21335);assertEquals('F', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21336);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21337);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21338);assertEquals('B', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21339);assertEquals('a', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21340);assertEquals('r', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21341);assertEquals(-1, reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21342);assertEquals(-1, reader.read());
        }

        __CLR4_4_1gbhgbhkylve2r2.R.inc(21343);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21344);try (__CLR4_4_1$AC10 __CLR$ACI10=new __CLR4_4_1$AC10(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21345);}};ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21346);final CharSequenceReader reader = new CharSequenceReader("xFooBarx", 1, 7);
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21347);oos.writeObject(reader);
        }
        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gbhgbhkylve2r2.R.inc(21348);try (__CLR4_4_1$AC11 __CLR$ACI11=new __CLR4_4_1$AC11(){{__CLR4_4_1gbhgbhkylve2r2.R.inc(21349);}};ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21350);final CharSequenceReader reader = (CharSequenceReader) ois.readObject();
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21351);assertEquals('F', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21352);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21353);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21354);assertEquals('B', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21355);assertEquals('a', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21356);assertEquals('r', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21357);assertEquals(-1, reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21358);assertEquals(-1, reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21359);reader.reset();
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21360);assertEquals('F', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21361);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21362);assertEquals('o', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21363);assertEquals('B', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21364);assertEquals('a', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21365);assertEquals('r', reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21366);assertEquals(-1, reader.read());
            __CLR4_4_1gbhgbhkylve2r2.R.inc(21367);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gbhgbhkylve2r2.R.flushNeeded();}}
}
