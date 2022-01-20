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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class RandomAccessFileInputStreamTest {static class __CLR4_4_1hb3hb3kylve2z3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22528,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String DATA_FILE = "src/test/resources/org/apache/commons/io/test-file-iso8859-1.bin";
    private static final int DATA_FILE_LEN = 1430;

    private RandomAccessFile createRandomAccessFile() throws FileNotFoundException {try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22431);
        __CLR4_4_1hb3hb3kylve2z3.R.inc(22432);return new RandomAccessFile(DATA_FILE, "r");
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testAvailable() throws IOException {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1jlmqhb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testAvailable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1jlmqhb5() throws IOException{try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22433);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22434);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22435);}};final RandomAccessFileInputStream inputStream = new RandomAccessFileInputStream(createRandomAccessFile(),
            true)) {
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22436);assertEquals(DATA_FILE_LEN, inputStream.available());
        }
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testAvailableLong() throws IOException {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119tnq2hb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testAvailableLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119tnq2hb9() throws IOException{try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22437);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22438);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22439);}};final RandomAccessFileInputStream inputStream = new RandomAccessFileInputStream(createRandomAccessFile(),
            true)) {
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22440);assertEquals(DATA_FILE_LEN, inputStream.availableLong());
        }
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testCtorCloseOnCloseFalse() throws IOException {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19xqoe5hbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testCtorCloseOnCloseFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19xqoe5hbd() throws IOException{try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22441);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22442);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22443);}};RandomAccessFile file = createRandomAccessFile()) {
            class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22444);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22445);}};final RandomAccessFileInputStream inputStream = new RandomAccessFileInputStream(file, false)) {
                __CLR4_4_1hb3hb3kylve2z3.R.inc(22446);assertFalse(inputStream.isCloseOnClose());
            }
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22447);file.read();
        }
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testCtorCloseOnCloseTrue() throws IOException {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15hicckhbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testCtorCloseOnCloseTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15hicckhbk() throws IOException{try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22448);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22449);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22450);}};RandomAccessFile file = createRandomAccessFile()) {
            class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22451);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22452);}};final RandomAccessFileInputStream inputStream = new RandomAccessFileInputStream(file, true)) {
                __CLR4_4_1hb3hb3kylve2z3.R.inc(22453);assertTrue(inputStream.isCloseOnClose());
            }
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22454);assertThrows(IOException.class, () -> file.read());
        }
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testCtorNullFile() {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3rt80hbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testCtorNullFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3rt80hbr(){try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22455);
        __CLR4_4_1hb3hb3kylve2z3.R.inc(22456);assertThrows(NullPointerException.class, () -> new RandomAccessFileInputStream(null));
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testGetters() throws IOException {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7hbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7hbt() throws IOException{try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22457);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22458);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22459);}};RandomAccessFile file = createRandomAccessFile()) {
            class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22460);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22461);}};final RandomAccessFileInputStream inputStream = new RandomAccessFileInputStream(file, true)) {
                __CLR4_4_1hb3hb3kylve2z3.R.inc(22462);assertEquals(file, inputStream.getRandomAccessFile());
                __CLR4_4_1hb3hb3kylve2z3.R.inc(22463);assertTrue(inputStream.isCloseOnClose());
            }
        }
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testRead() throws IOException {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9ovaphc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9ovaphc0() throws IOException{try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22464);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22465);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22466);}};final RandomAccessFileInputStream inputStream = new RandomAccessFileInputStream(createRandomAccessFile(),
            true)) {
            // A Test Line.
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22467);assertEquals('A', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22468);assertEquals(' ', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22469);assertEquals('T', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22470);assertEquals('e', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22471);assertEquals('s', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22472);assertEquals('t', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22473);assertEquals(' ', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22474);assertEquals('L', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22475);assertEquals('i', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22476);assertEquals('n', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22477);assertEquals('e', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22478);assertEquals('.', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22479);assertEquals(DATA_FILE_LEN - 12, inputStream.available());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22480);assertEquals(DATA_FILE_LEN - 12, inputStream.availableLong());
        }
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testSkip() throws IOException {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamwhch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamwhch() throws IOException{try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22481);

        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22482);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22483);}};final RandomAccessFile file = createRandomAccessFile();
            __CLR4_4_1$AC9 __CLR$ACI10=new __CLR4_4_1$AC9(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22484);}};final RandomAccessFileInputStream inputStream = new RandomAccessFileInputStream(file, false)) {
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22485);assertEquals(0, inputStream.skip(-1));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22486);assertEquals(0, inputStream.skip(Integer.MIN_VALUE));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22487);assertEquals(0, inputStream.skip(0));
            // A Test Line.
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22488);assertEquals('A', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22489);assertEquals(1, inputStream.skip(1));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22490);assertEquals('T', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22491);assertEquals(1, inputStream.skip(1));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22492);assertEquals('s', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22493);assertEquals(1, inputStream.skip(1));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22494);assertEquals(' ', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22495);assertEquals(1, inputStream.skip(1));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22496);assertEquals('i', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22497);assertEquals(1, inputStream.skip(1));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22498);assertEquals('e', inputStream.read());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22499);assertEquals(1, inputStream.skip(1));
            //
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22500);assertEquals(DATA_FILE_LEN - 12, inputStream.available());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22501);assertEquals(DATA_FILE_LEN - 12, inputStream.availableLong());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22502);assertEquals(10, inputStream.skip(10));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22503);assertEquals(DATA_FILE_LEN - 22, inputStream.availableLong());
            //
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22504);final long avail = inputStream.availableLong();
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22505);assertEquals(avail, inputStream.skip(inputStream.availableLong()));
            // At EOF
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22506);assertEquals(DATA_FILE_LEN, file.length());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22507);assertEquals(DATA_FILE_LEN, file.getFilePointer());
            //
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22508);assertEquals(0, inputStream.skip(1));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22509);assertEquals(0, inputStream.skip(1000000000000L));
        }
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testReadByteArray() throws IOException {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18v46q8hda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testReadByteArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18v46q8hda() throws IOException{try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22510);
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22511);try (__CLR4_4_1$AC10 __CLR$ACI11=new __CLR4_4_1$AC10(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22512);}};final RandomAccessFileInputStream inputStream = new RandomAccessFileInputStream(createRandomAccessFile(),
            true)) {
            // A Test Line.
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22513);final int dataLen = 12;
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22514);final byte[] buffer = new byte[dataLen];
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22515);assertEquals(dataLen, inputStream.read(buffer));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22516);assertArrayEquals("A Test Line.".getBytes(StandardCharsets.ISO_8859_1), buffer);
            //
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22517);assertEquals(DATA_FILE_LEN - dataLen, inputStream.available());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22518);assertEquals(DATA_FILE_LEN - dataLen, inputStream.availableLong());
        }
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}

    @Test
    public void testReadByteArrayBounds() throws IOException {__CLR4_4_1hb3hb3kylve2z3.R.globalSliceStart(getClass().getName(),22519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9adujhdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hb3hb3kylve2z3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hb3hb3kylve2z3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.RandomAccessFileInputStreamTest.testReadByteArrayBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9adujhdj() throws IOException{try{__CLR4_4_1hb3hb3kylve2z3.R.inc(22519);
        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hb3hb3kylve2z3.R.inc(22520);try (__CLR4_4_1$AC11 __CLR$ACI12=new __CLR4_4_1$AC11(){{__CLR4_4_1hb3hb3kylve2z3.R.inc(22521);}};final RandomAccessFileInputStream inputStream = new RandomAccessFileInputStream(createRandomAccessFile(),
            true)) {
            // A Test Line.
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22522);final int dataLen = 12;
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22523);final byte[] buffer = new byte[dataLen];
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22524);assertEquals(dataLen, inputStream.read(buffer, 0, dataLen));
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22525);assertArrayEquals("A Test Line.".getBytes(StandardCharsets.ISO_8859_1), buffer);
            //
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22526);assertEquals(DATA_FILE_LEN - dataLen, inputStream.available());
            __CLR4_4_1hb3hb3kylve2z3.R.inc(22527);assertEquals(DATA_FILE_LEN - dataLen, inputStream.availableLong());
        }
    }finally{__CLR4_4_1hb3hb3kylve2z3.R.flushNeeded();}}
}
