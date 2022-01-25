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

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.StringBuilderWriter;
import org.junit.jupiter.api.Test;

public class CharacterFilterReaderTest {static class __CLR4_4_1gjcgjckylve2s1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21488,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String STRING_FIXTURE = "ababcabcd";

    @Test
    public void testInputSize0FilterSize1() throws IOException {__CLR4_4_1gjcgjckylve2s1.R.globalSliceStart(getClass().getName(),21432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v72360gjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjcgjckylve2s1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjcgjckylve2s1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderTest.testInputSize0FilterSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v72360gjc() throws IOException{try{__CLR4_4_1gjcgjckylve2s1.R.inc(21432);
        __CLR4_4_1gjcgjckylve2s1.R.inc(21433);final StringReader input = new StringReader("");
        __CLR4_4_1gjcgjckylve2s1.R.inc(21434);final HashSet<Integer> codePoints = new HashSet<>();
        __CLR4_4_1gjcgjckylve2s1.R.inc(21435);codePoints.add(Integer.valueOf('a'));
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gjcgjckylve2s1.R.inc(21436);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21437);}};CharacterFilterReader reader = new CharacterFilterReader(input, 'A')) {
            __CLR4_4_1gjcgjckylve2s1.R.inc(21438);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gjcgjckylve2s1.R.flushNeeded();}}

    @Test
    public void testInputSize1FilterSize1() throws IOException {__CLR4_4_1gjcgjckylve2s1.R.globalSliceStart(getClass().getName(),21439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rp83rbgjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjcgjckylve2s1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjcgjckylve2s1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderTest.testInputSize1FilterSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rp83rbgjj() throws IOException{try{__CLR4_4_1gjcgjckylve2s1.R.inc(21439);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gjcgjckylve2s1.R.inc(21440);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21441);}};StringReader input = new StringReader("a");
            __CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21442);}};CharacterFilterReader reader = new CharacterFilterReader(input, 'a')) {
            __CLR4_4_1gjcgjckylve2s1.R.inc(21443);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gjcgjckylve2s1.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterSize1FilterAll() throws IOException {__CLR4_4_1gjcgjckylve2s1.R.globalSliceStart(getClass().getName(),21444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hwn6b5gjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjcgjckylve2s1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjcgjckylve2s1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderTest.testInputSize2FilterSize1FilterAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hwn6b5gjo() throws IOException{try{__CLR4_4_1gjcgjckylve2s1.R.inc(21444);
        __CLR4_4_1gjcgjckylve2s1.R.inc(21445);final StringReader input = new StringReader("aa");
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gjcgjckylve2s1.R.inc(21446);try (__CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21447);}};CharacterFilterReader reader = new CharacterFilterReader(input, 'a')) {
            __CLR4_4_1gjcgjckylve2s1.R.inc(21448);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gjcgjckylve2s1.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterSize1FilterFirst() throws IOException {__CLR4_4_1gjcgjckylve2s1.R.globalSliceStart(getClass().getName(),21449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12p93dsgjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjcgjckylve2s1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjcgjckylve2s1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderTest.testInputSize2FilterSize1FilterFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12p93dsgjt() throws IOException{try{__CLR4_4_1gjcgjckylve2s1.R.inc(21449);
        __CLR4_4_1gjcgjckylve2s1.R.inc(21450);final StringReader input = new StringReader("ab");
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gjcgjckylve2s1.R.inc(21451);try (__CLR4_4_1$AC3 __CLR$ACI4=new __CLR4_4_1$AC3(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21452);}};CharacterFilterReader reader = new CharacterFilterReader(input, 'a')) {
            __CLR4_4_1gjcgjckylve2s1.R.inc(21453);assertEquals('b', reader.read());
            __CLR4_4_1gjcgjckylve2s1.R.inc(21454);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gjcgjckylve2s1.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterSize1FilterLast() throws IOException {__CLR4_4_1gjcgjckylve2s1.R.globalSliceStart(getClass().getName(),21455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtkndggjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjcgjckylve2s1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjcgjckylve2s1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderTest.testInputSize2FilterSize1FilterLast",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtkndggjz() throws IOException{try{__CLR4_4_1gjcgjckylve2s1.R.inc(21455);
        __CLR4_4_1gjcgjckylve2s1.R.inc(21456);final StringReader input = new StringReader("ab");
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gjcgjckylve2s1.R.inc(21457);try (__CLR4_4_1$AC4 __CLR$ACI5=new __CLR4_4_1$AC4(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21458);}};CharacterFilterReader reader = new CharacterFilterReader(input, 'b')) {
            __CLR4_4_1gjcgjckylve2s1.R.inc(21459);assertEquals('a', reader.read());
            __CLR4_4_1gjcgjckylve2s1.R.inc(21460);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1gjcgjckylve2s1.R.flushNeeded();}}

    @Test
    public void testReadFilteringEOF() {__CLR4_4_1gjcgjckylve2s1.R.globalSliceStart(getClass().getName(),21461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6ov4xgk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjcgjckylve2s1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjcgjckylve2s1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderTest.testReadFilteringEOF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6ov4xgk5(){try{__CLR4_4_1gjcgjckylve2s1.R.inc(21461);
        __CLR4_4_1gjcgjckylve2s1.R.inc(21462);final StringReader input = new StringReader(STRING_FIXTURE);
        __CLR4_4_1gjcgjckylve2s1.R.inc(21463);assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
            class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gjcgjckylve2s1.R.inc(21464);try (__CLR4_4_1$AC5 __CLR$ACI6=new __CLR4_4_1$AC5(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21465);}};StringBuilderWriter output = new StringBuilderWriter();
                __CLR4_4_1$AC5 __CLR$ACI7=new __CLR4_4_1$AC5(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21466);}};CharacterFilterReader reader = new CharacterFilterReader(input, EOF)) {
                __CLR4_4_1gjcgjckylve2s1.R.inc(21467);int c;
                __CLR4_4_1gjcgjckylve2s1.R.inc(21468);while ((c = reader.read()) != EOF) {{
                    __CLR4_4_1gjcgjckylve2s1.R.inc(21471);output.write(c);
                }
                }__CLR4_4_1gjcgjckylve2s1.R.inc(21472);assertEquals(STRING_FIXTURE, output.toString());
            }
        });
    }finally{__CLR4_4_1gjcgjckylve2s1.R.flushNeeded();}}

    @Test
    public void testReadIntoBuffer() throws IOException {__CLR4_4_1gjcgjckylve2s1.R.globalSliceStart(getClass().getName(),21473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzs50vgkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjcgjckylve2s1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjcgjckylve2s1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderTest.testReadIntoBuffer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzs50vgkh() throws IOException{try{__CLR4_4_1gjcgjckylve2s1.R.inc(21473);
        __CLR4_4_1gjcgjckylve2s1.R.inc(21474);final StringReader input = new StringReader(STRING_FIXTURE);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gjcgjckylve2s1.R.inc(21475);try (__CLR4_4_1$AC6 __CLR$ACI8=new __CLR4_4_1$AC6(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21476);}};CharacterFilterReader reader = new CharacterFilterReader(input, 'b')) {
            __CLR4_4_1gjcgjckylve2s1.R.inc(21477);final char[] buff = new char[9];
            __CLR4_4_1gjcgjckylve2s1.R.inc(21478);final int charCount = reader.read(buff);
            __CLR4_4_1gjcgjckylve2s1.R.inc(21479);assertEquals(6, charCount);
            __CLR4_4_1gjcgjckylve2s1.R.inc(21480);assertEquals("aacacd", new String(buff, 0, charCount));
        }
    }finally{__CLR4_4_1gjcgjckylve2s1.R.flushNeeded();}}

    @Test
    public void testReadUsingReader() throws IOException {__CLR4_4_1gjcgjckylve2s1.R.globalSliceStart(getClass().getName(),21481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0fa1mgkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjcgjckylve2s1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjcgjckylve2s1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderTest.testReadUsingReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0fa1mgkp() throws IOException{try{__CLR4_4_1gjcgjckylve2s1.R.inc(21481);
        __CLR4_4_1gjcgjckylve2s1.R.inc(21482);final StringReader input = new StringReader(STRING_FIXTURE);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gjcgjckylve2s1.R.inc(21483);try (__CLR4_4_1$AC7 __CLR$ACI9=new __CLR4_4_1$AC7(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21484);}};StringBuilderWriter output = new StringBuilderWriter();
            __CLR4_4_1$AC7 __CLR$ACI10=new __CLR4_4_1$AC7(){{__CLR4_4_1gjcgjckylve2s1.R.inc(21485);}};CharacterFilterReader reader = new CharacterFilterReader(input, 'b')) {
            __CLR4_4_1gjcgjckylve2s1.R.inc(21486);IOUtils.copy(reader, output);
            __CLR4_4_1gjcgjckylve2s1.R.inc(21487);assertEquals("aacacd", output.toString());
        }
    }finally{__CLR4_4_1gjcgjckylve2s1.R.flushNeeded();}}

}
