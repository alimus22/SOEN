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

import static org.apache.commons.io.IOUtils.EOF;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.io.IOException;
import java.io.StringReader;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.output.StringBuilderWriter;
import org.junit.jupiter.api.Test;

public class CharacterSetFilterReaderTest {static class __CLR4_4_1gkwgkwkylve2sg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21575,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String STRING_FIXTURE = "ab";

    @Test
    public void testInputSize0FilterSize0() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ry24djgkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize0FilterSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ry24djgkw() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21488);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21489);final StringReader input = new StringReader("");
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21490);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21491);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, new HashSet<Integer>(0))) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21492);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testInputSize0FilterSize1() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v72360gl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize0FilterSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v72360gl1() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21493);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21494);final StringReader input = new StringReader("");
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21495);final HashSet<Integer> codePoints = new HashSet<>();
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21496);codePoints.add(Integer.valueOf('a'));
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21497);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21498);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, codePoints)) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21499);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testInputSize0NullFilter() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtqffhgl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize0NullFilter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtqffhgl8() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21500);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21501);final StringReader input = new StringReader("");
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21502);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21503);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, (Set<Integer>) null)) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21504);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testInputSize1FilterSize1() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rp83rbgld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize1FilterSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rp83rbgld() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21505);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21506);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21507);}};StringReader input = new StringReader("a")) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21508);final HashSet<Integer> codePoints = new HashSet<>();
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21509);codePoints.add(Integer.valueOf('a'));
            class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21510);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21511);}};final CharacterSetFilterReader reader = new CharacterSetFilterReader(input, codePoints)) {
                __CLR4_4_1gkwgkwkylve2sg.R.inc(21512);assertEquals(-1, reader.read());
            }
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterSize1FilterAll() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hwn6b5gll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize2FilterSize1FilterAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hwn6b5gll() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21513);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21514);final StringReader input = new StringReader("aa");
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21515);final HashSet<Integer> codePoints = new HashSet<>();
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21516);codePoints.add(Integer.valueOf('a'));
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21517);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21518);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, codePoints)) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21519);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterSize1FilterFirst() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12p93dsgls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize2FilterSize1FilterFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12p93dsgls() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21520);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21521);final StringReader input = new StringReader(STRING_FIXTURE);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21522);final HashSet<Integer> codePoints = new HashSet<>();
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21523);codePoints.add(Integer.valueOf('a'));
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21524);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21525);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, codePoints)) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21526);assertEquals('b', reader.read());
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21527);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterSize1FilterLast() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtkndggm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize2FilterSize1FilterLast",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtkndggm0() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21528);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21529);final StringReader input = new StringReader(STRING_FIXTURE);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21530);final HashSet<Integer> codePoints = new HashSet<>();
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21531);codePoints.add(Integer.valueOf('b'));
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21532);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21533);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, codePoints)) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21534);assertEquals('a', reader.read());
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21535);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterSize2FilterFirst() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16732shgm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize2FilterSize2FilterFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16732shgm8() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21536);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21537);final StringReader input = new StringReader(STRING_FIXTURE);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21538);final HashSet<Integer> codePoints = new HashSet<>();
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21539);codePoints.add(Integer.valueOf('a'));
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21540);codePoints.add(Integer.valueOf('y'));
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21541);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21542);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, codePoints)) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21543);assertEquals('b', reader.read());
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21544);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterSize2FilterLast() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wg4vt7gmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize2FilterSize2FilterLast",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wg4vt7gmh() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21545);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21546);final StringReader input = new StringReader(STRING_FIXTURE);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21547);final HashSet<Integer> codePoints = new HashSet<>();
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21548);codePoints.add(Integer.valueOf('x'));
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21549);codePoints.add(Integer.valueOf('b'));
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21550);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21551);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, codePoints)) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21552);assertEquals('a', reader.read());
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21553);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterSize2FilterNone() throws IOException {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5gxufgmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testInputSize2FilterSize2FilterNone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5gxufgmq() throws IOException{try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21554);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21555);final StringReader input = new StringReader(STRING_FIXTURE);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21556);final HashSet<Integer> codePoints = new HashSet<>();
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21557);codePoints.add(Integer.valueOf('x'));
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21558);codePoints.add(Integer.valueOf('y'));
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21559);try (__CLR4_4_1$AC10 __CLR$ACI10=new __CLR4_4_1$AC10(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21560);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, codePoints)) {
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21561);assertEquals('a', reader.read());
            __CLR4_4_1gkwgkwkylve2sg.R.inc(21562);assertEquals('b', reader.read());
        }
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}

    @Test
    public void testReadFilteringEOF() {__CLR4_4_1gkwgkwkylve2sg.R.globalSliceStart(getClass().getName(),21563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6ov4xgmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gkwgkwkylve2sg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gkwgkwkylve2sg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterSetFilterReaderTest.testReadFilteringEOF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6ov4xgmz(){try{__CLR4_4_1gkwgkwkylve2sg.R.inc(21563);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21564);final StringReader input = new StringReader(STRING_FIXTURE);
        __CLR4_4_1gkwgkwkylve2sg.R.inc(21565);assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
            class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gkwgkwkylve2sg.R.inc(21566);try (__CLR4_4_1$AC11 __CLR$ACI11=new __CLR4_4_1$AC11(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21567);}};StringBuilderWriter output = new StringBuilderWriter();
                __CLR4_4_1$AC11 __CLR$ACI12=new __CLR4_4_1$AC11(){{__CLR4_4_1gkwgkwkylve2sg.R.inc(21568);}};CharacterSetFilterReader reader = new CharacterSetFilterReader(input, EOF)) {
                __CLR4_4_1gkwgkwkylve2sg.R.inc(21569);int c;
                __CLR4_4_1gkwgkwkylve2sg.R.inc(21570);while ((c = reader.read()) != EOF) {{
                    __CLR4_4_1gkwgkwkylve2sg.R.inc(21573);output.write(c);
                }
                }__CLR4_4_1gkwgkwkylve2sg.R.inc(21574);assertEquals(STRING_FIXTURE, output.toString());
            }
        });
    }finally{__CLR4_4_1gkwgkwkylve2sg.R.flushNeeded();}}
}
