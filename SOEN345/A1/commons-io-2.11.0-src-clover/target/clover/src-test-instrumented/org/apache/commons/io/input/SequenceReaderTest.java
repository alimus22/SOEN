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

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link SequenceReader}.
 */
public class SequenceReaderTest {static class __CLR4_4_1hl2hl2kylve32o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22898,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final char NUL = 0;

    private void checkArray(final char[] expected, final char[] actual) {try{__CLR4_4_1hl2hl2kylve32o.R.inc(22790);
        __CLR4_4_1hl2hl2kylve32o.R.inc(22791);for (int i = 0; (((i < expected.length)&&(__CLR4_4_1hl2hl2kylve32o.R.iget(22792)!=0|true))||(__CLR4_4_1hl2hl2kylve32o.R.iget(22793)==0&false)); i++) {{
            __CLR4_4_1hl2hl2kylve32o.R.inc(22794);assertEquals(expected[i], actual[i], "Compare[" + i + "]");
        }
    }}finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    private void checkRead(final Reader reader, final String expected) throws IOException {try{__CLR4_4_1hl2hl2kylve32o.R.inc(22795);
        __CLR4_4_1hl2hl2kylve32o.R.inc(22796);for (int i = 0; (((i < expected.length())&&(__CLR4_4_1hl2hl2kylve32o.R.iget(22797)!=0|true))||(__CLR4_4_1hl2hl2kylve32o.R.iget(22798)==0&false)); i++) {{
            __CLR4_4_1hl2hl2kylve32o.R.inc(22799);assertEquals(expected.charAt(i), (char) reader.read(), "Read[" + i + "] of '" + expected + "'");
        }
    }}finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    private void checkReadEof(final Reader reader) throws IOException {try{__CLR4_4_1hl2hl2kylve32o.R.inc(22800);
        __CLR4_4_1hl2hl2kylve32o.R.inc(22801);for (int i = 0; (((i < 10)&&(__CLR4_4_1hl2hl2kylve32o.R.iget(22802)!=0|true))||(__CLR4_4_1hl2hl2kylve32o.R.iget(22803)==0&false)); i++) {{
            __CLR4_4_1hl2hl2kylve32o.R.inc(22804);assertEquals(-1, reader.read());
        }
    }}finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testClose() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169vzsjhlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169vzsjhlh() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22805);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22806);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22807);}};final Reader reader = new SequenceReader(new CharSequenceReader("FooBar"))) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22808);checkRead(reader, "Foo");
            __CLR4_4_1hl2hl2kylve32o.R.inc(22809);reader.close();
            __CLR4_4_1hl2hl2kylve32o.R.inc(22810);checkReadEof(reader);
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testReadClosedReader() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fd1732hln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testReadClosedReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fd1732hln() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22811);
        __CLR4_4_1hl2hl2kylve32o.R.inc(22812);@SuppressWarnings("resource")
        final Reader reader = new SequenceReader(new CharSequenceReader("FooBar"));
        __CLR4_4_1hl2hl2kylve32o.R.inc(22813);reader.close();
        __CLR4_4_1hl2hl2kylve32o.R.inc(22814);checkReadEof(reader);
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testMarkSupported() throws Exception {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q660fehlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testMarkSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q660fehlr() throws Exception{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22815);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22816);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22817);}};final Reader reader = new SequenceReader()) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22818);assertFalse(reader.markSupported());
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testRead() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9ovaphlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9ovaphlv() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22819);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22820);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22821);}};final Reader reader = new SequenceReader(new StringReader("Foo"), new StringReader("Bar"))) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22822);assertEquals('F', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22823);assertEquals('o', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22824);assertEquals('o', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22825);assertEquals('B', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22826);assertEquals('a', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22827);assertEquals('r', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22828);checkReadEof(reader);
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testReadCharArray() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pei1umhm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testReadCharArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pei1umhm5() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22829);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22830);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22831);}};final Reader reader = new SequenceReader(new StringReader("Foo"), new StringReader("Bar"))) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22832);char[] chars = new char[2];
            __CLR4_4_1hl2hl2kylve32o.R.inc(22833);assertEquals(2, reader.read(chars));
            __CLR4_4_1hl2hl2kylve32o.R.inc(22834);checkArray(new char[] { 'F', 'o' }, chars);
            __CLR4_4_1hl2hl2kylve32o.R.inc(22835);chars = new char[3];
            __CLR4_4_1hl2hl2kylve32o.R.inc(22836);assertEquals(3, reader.read(chars));
            __CLR4_4_1hl2hl2kylve32o.R.inc(22837);checkArray(new char[] { 'o', 'B', 'a' }, chars);
            __CLR4_4_1hl2hl2kylve32o.R.inc(22838);chars = new char[3];
            __CLR4_4_1hl2hl2kylve32o.R.inc(22839);assertEquals(1, reader.read(chars));
            __CLR4_4_1hl2hl2kylve32o.R.inc(22840);checkArray(new char[] { 'r', NUL, NUL }, chars);
            __CLR4_4_1hl2hl2kylve32o.R.inc(22841);assertEquals(-1, reader.read(chars));
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testReadCharArrayPortion() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iws4y5hmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testReadCharArrayPortion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iws4y5hmi() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22842);
        __CLR4_4_1hl2hl2kylve32o.R.inc(22843);final char[] chars = new char[10];
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22844);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22845);}};final Reader reader = new SequenceReader(new StringReader("Foo"), new StringReader("Bar"))) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22846);assertEquals(3, reader.read(chars, 3, 3));
            __CLR4_4_1hl2hl2kylve32o.R.inc(22847);checkArray(new char[] { NUL, NUL, NUL, 'F', 'o', 'o' }, chars);
            __CLR4_4_1hl2hl2kylve32o.R.inc(22848);assertEquals(3, reader.read(chars, 0, 3));
            __CLR4_4_1hl2hl2kylve32o.R.inc(22849);checkArray(new char[] { 'B', 'a', 'r', 'F', 'o', 'o', NUL }, chars);
            __CLR4_4_1hl2hl2kylve32o.R.inc(22850);assertEquals(-1, reader.read(chars));
            __CLR4_4_1hl2hl2kylve32o.R.inc(22851);assertThrows(IndexOutOfBoundsException.class, () -> reader.read(chars, 10, 10));
            __CLR4_4_1hl2hl2kylve32o.R.inc(22852);assertThrows(NullPointerException.class, () -> reader.read(null, 0, 10));
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testReadCollection() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118qykthmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testReadCollection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118qykthmt() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22853);
        __CLR4_4_1hl2hl2kylve32o.R.inc(22854);final Collection<Reader> readers = new ArrayList<>();
        __CLR4_4_1hl2hl2kylve32o.R.inc(22855);readers.add(new StringReader("F"));
        __CLR4_4_1hl2hl2kylve32o.R.inc(22856);readers.add(new StringReader("B"));
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22857);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22858);}};final Reader reader = new SequenceReader(readers)) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22859);assertEquals('F', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22860);assertEquals('B', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22861);checkReadEof(reader);
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testReadIterable() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzd82nhn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testReadIterable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzd82nhn2() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22862);
        __CLR4_4_1hl2hl2kylve32o.R.inc(22863);final Collection<Reader> readers = new ArrayList<>();
        __CLR4_4_1hl2hl2kylve32o.R.inc(22864);readers.add(new StringReader("F"));
        __CLR4_4_1hl2hl2kylve32o.R.inc(22865);readers.add(new StringReader("B"));
        __CLR4_4_1hl2hl2kylve32o.R.inc(22866);final Iterable<Reader> iterable = readers;
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22867);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22868);}};final Reader reader = new SequenceReader(iterable)) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22869);assertEquals('F', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22870);assertEquals('B', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22871);checkReadEof(reader);
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testReadLength0Readers() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1if2zjfhnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testReadLength0Readers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1if2zjfhnc() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22872);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22873);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22874);}};final Reader reader = new SequenceReader(new StringReader(StringUtils.EMPTY),
            new StringReader(StringUtils.EMPTY), new StringReader(StringUtils.EMPTY))) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22875);checkReadEof(reader);
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testReadLength1Readers() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8axzohng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testReadLength1Readers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8axzohng() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22876);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22877);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22878);}};final Reader reader = new SequenceReader(
        // @formatter:off
            new StringReader("0"),
            new StringReader("1"),
            new StringReader("2"),
            new StringReader("3"))) {
            // @formatter:on
            __CLR4_4_1hl2hl2kylve32o.R.inc(22879);assertEquals('0', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22880);assertEquals('1', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22881);assertEquals('2', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22882);assertEquals('3', reader.read());
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testReadList() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111wk1fhnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testReadList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111wk1fhnn() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22883);
        __CLR4_4_1hl2hl2kylve32o.R.inc(22884);final List<Reader> readers = new ArrayList<>();
        __CLR4_4_1hl2hl2kylve32o.R.inc(22885);readers.add(new StringReader("F"));
        __CLR4_4_1hl2hl2kylve32o.R.inc(22886);readers.add(new StringReader("B"));
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22887);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22888);}};final Reader reader = new SequenceReader(readers)) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22889);assertEquals('F', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22890);assertEquals('B', reader.read());
            __CLR4_4_1hl2hl2kylve32o.R.inc(22891);checkReadEof(reader);
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}

    @Test
    public void testSkip() throws IOException {__CLR4_4_1hl2hl2kylve32o.R.globalSliceStart(getClass().getName(),22892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamwhnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hl2hl2kylve32o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hl2hl2kylve32o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SequenceReaderTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamwhnw() throws IOException{try{__CLR4_4_1hl2hl2kylve32o.R.inc(22892);
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hl2hl2kylve32o.R.inc(22893);try (__CLR4_4_1$AC10 __CLR$ACI10=new __CLR4_4_1$AC10(){{__CLR4_4_1hl2hl2kylve32o.R.inc(22894);}};final Reader reader = new SequenceReader(new StringReader("Foo"), new StringReader("Bar"))) {
            __CLR4_4_1hl2hl2kylve32o.R.inc(22895);assertEquals(3, reader.skip(3));
            __CLR4_4_1hl2hl2kylve32o.R.inc(22896);checkRead(reader, "Bar");
            __CLR4_4_1hl2hl2kylve32o.R.inc(22897);assertEquals(0, reader.skip(3));
        }
    }finally{__CLR4_4_1hl2hl2kylve32o.R.flushNeeded();}}
}