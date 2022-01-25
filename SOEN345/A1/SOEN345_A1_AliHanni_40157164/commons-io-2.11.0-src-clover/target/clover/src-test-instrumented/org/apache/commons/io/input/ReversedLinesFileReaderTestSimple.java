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

import static org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.assertEqualsAndNoLineBreaks;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.TestResources;
import org.junit.jupiter.api.Test;

public class ReversedLinesFileReaderTestSimple {static class __CLR4_4_1hk2hk2kylve328{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22790,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize() throws URISyntaxException, IOException {__CLR4_4_1hk2hk2kylve328.R.globalSliceStart(getClass().getName(),22754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v55l4hk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk2hk2kylve328.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk2hk2kylve328.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestSimple.testFileSizeIsExactMultipleOfBlockSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v55l4hk2() throws URISyntaxException, IOException{try{__CLR4_4_1hk2hk2kylve328.R.inc(22754);
        __CLR4_4_1hk2hk2kylve328.R.inc(22755);final int blockSize = 10;
        __CLR4_4_1hk2hk2kylve328.R.inc(22756);final File testFile20Bytes = TestResources.getFile("/test-file-20byteslength.bin");
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hk2hk2kylve328.R.inc(22757);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1hk2hk2kylve328.R.inc(22758);}};ReversedLinesFileReader reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes, blockSize,
            "ISO-8859-1")) {
            __CLR4_4_1hk2hk2kylve328.R.inc(22759);assertEqualsAndNoLineBreaks("987654321", reversedLinesFileReader.readLine());
            __CLR4_4_1hk2hk2kylve328.R.inc(22760);assertEqualsAndNoLineBreaks("123456789", reversedLinesFileReader.readLine());
        }
    }finally{__CLR4_4_1hk2hk2kylve328.R.flushNeeded();}}

    @Test
    public void testLineCount() throws URISyntaxException, IOException {__CLR4_4_1hk2hk2kylve328.R.globalSliceStart(getClass().getName(),22761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yd2x4ghk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk2hk2kylve328.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk2hk2kylve328.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestSimple.testLineCount",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yd2x4ghk9() throws URISyntaxException, IOException{try{__CLR4_4_1hk2hk2kylve328.R.inc(22761);
        __CLR4_4_1hk2hk2kylve328.R.inc(22762);final int blockSize = 10;
        __CLR4_4_1hk2hk2kylve328.R.inc(22763);final File testFile20Bytes = TestResources.getFile("/test-file-20byteslength.bin");
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hk2hk2kylve328.R.inc(22764);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1hk2hk2kylve328.R.inc(22765);}};ReversedLinesFileReader reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes, blockSize,
            "ISO-8859-1")) {
            __CLR4_4_1hk2hk2kylve328.R.inc(22766);assertThrows(IllegalArgumentException.class, () -> reversedLinesFileReader.readLines(-1));
            __CLR4_4_1hk2hk2kylve328.R.inc(22767);assertTrue(reversedLinesFileReader.readLines(0).isEmpty());
            __CLR4_4_1hk2hk2kylve328.R.inc(22768);final List<String> lines = reversedLinesFileReader.readLines(2);
            __CLR4_4_1hk2hk2kylve328.R.inc(22769);assertEqualsAndNoLineBreaks("987654321", lines.get(0));
            __CLR4_4_1hk2hk2kylve328.R.inc(22770);assertEqualsAndNoLineBreaks("123456789", lines.get(1));
            __CLR4_4_1hk2hk2kylve328.R.inc(22771);assertTrue(reversedLinesFileReader.readLines(0).isEmpty());
            __CLR4_4_1hk2hk2kylve328.R.inc(22772);assertTrue(reversedLinesFileReader.readLines(10000).isEmpty());
        }
    }finally{__CLR4_4_1hk2hk2kylve328.R.flushNeeded();}}

    @Test
    public void testToString() throws URISyntaxException, IOException {__CLR4_4_1hk2hk2kylve328.R.globalSliceStart(getClass().getName(),22773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidhkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk2hk2kylve328.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk2hk2kylve328.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestSimple.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidhkl() throws URISyntaxException, IOException{try{__CLR4_4_1hk2hk2kylve328.R.inc(22773);
        __CLR4_4_1hk2hk2kylve328.R.inc(22774);final int blockSize = 10;
        __CLR4_4_1hk2hk2kylve328.R.inc(22775);final File testFile20Bytes = TestResources.getFile("/test-file-20byteslength.bin");
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hk2hk2kylve328.R.inc(22776);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1hk2hk2kylve328.R.inc(22777);}};ReversedLinesFileReader reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes, blockSize,
            "ISO-8859-1")) {
            __CLR4_4_1hk2hk2kylve328.R.inc(22778);assertThrows(IllegalArgumentException.class, () -> reversedLinesFileReader.toString(-1));
            __CLR4_4_1hk2hk2kylve328.R.inc(22779);assertTrue(reversedLinesFileReader.readLines(0).isEmpty());
            __CLR4_4_1hk2hk2kylve328.R.inc(22780);final String lines = reversedLinesFileReader.toString(2);
            __CLR4_4_1hk2hk2kylve328.R.inc(22781);assertEquals("123456789" + System.lineSeparator() + "987654321" + System.lineSeparator(), lines);
            __CLR4_4_1hk2hk2kylve328.R.inc(22782);assertTrue(reversedLinesFileReader.toString(0).isEmpty());
            __CLR4_4_1hk2hk2kylve328.R.inc(22783);assertTrue(reversedLinesFileReader.toString(10000).isEmpty());
        }
    }finally{__CLR4_4_1hk2hk2kylve328.R.flushNeeded();}}

    @Test
    public void testUnsupportedEncodingUTF16() throws URISyntaxException {__CLR4_4_1hk2hk2kylve328.R.globalSliceStart(getClass().getName(),22784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osw4u5hkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk2hk2kylve328.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk2hk2kylve328.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestSimple.testUnsupportedEncodingUTF16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osw4u5hkw() throws URISyntaxException{try{__CLR4_4_1hk2hk2kylve328.R.inc(22784);
        __CLR4_4_1hk2hk2kylve328.R.inc(22785);final File testFileEmpty = TestResources.getFile("/test-file-empty.bin");
        __CLR4_4_1hk2hk2kylve328.R.inc(22786);assertThrows(UnsupportedEncodingException.class,
            () -> new ReversedLinesFileReader(testFileEmpty, IOUtils.DEFAULT_BUFFER_SIZE, "UTF-16").close());
    }finally{__CLR4_4_1hk2hk2kylve328.R.flushNeeded();}}

    @Test
    public void testUnsupportedEncodingBig5() throws URISyntaxException {__CLR4_4_1hk2hk2kylve328.R.globalSliceStart(getClass().getName(),22787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qh9clqhkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk2hk2kylve328.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk2hk2kylve328.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestSimple.testUnsupportedEncodingBig5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qh9clqhkz() throws URISyntaxException{try{__CLR4_4_1hk2hk2kylve328.R.inc(22787);
        __CLR4_4_1hk2hk2kylve328.R.inc(22788);final File testFileEncodingBig5 = TestResources.getFile("/test-file-empty.bin");
        __CLR4_4_1hk2hk2kylve328.R.inc(22789);assertThrows(UnsupportedEncodingException.class,
            () -> new ReversedLinesFileReader(testFileEncodingBig5, IOUtils.DEFAULT_BUFFER_SIZE, "Big5").close());
    }finally{__CLR4_4_1hk2hk2kylve328.R.flushNeeded();}}

}
