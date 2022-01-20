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

import static org.apache.commons.io.StandardLineSeparator.CR;
import static org.apache.commons.io.StandardLineSeparator.LF;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.stream.IntStream;

import org.apache.commons.io.TestResources;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReversedLinesFileReaderTestParamBlockSize {static class __CLR4_4_1hfyhfykylve31c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22711,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    private static final String UTF_8 = "UTF-8";
    private static final String ISO_8859_1 = "ISO-8859-1";

    // small and uneven block sizes are not used in reality but are good to show that the algorithm is solid
    public static IntStream blockSizes() {try{__CLR4_4_1hfyhfykylve31c.R.inc(22606);
        __CLR4_4_1hfyhfykylve31c.R.inc(22607);return IntStream.of(1, 3, 8, 256, 4096);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    private ReversedLinesFileReader reversedLinesFileReader;

    // Strings are escaped in constants to avoid java source encoding issues (source file enc is UTF-8):

    // "A Test Line. Special chars: \u00c3\u0083\u00e2\u0080\u009e\u00c3\u0083\u00c2\u00a4\u00c3\u0083\u00c5\u0093\u00c3\u0083\u00c2\u00bc\u00c3\u0083\u00e2\u0080\u0093\u00c3\u0083\u00c2\u00b6\u00c3\u0083\u00c5\u00b8 \u00c3\u0083\u00c6\u0092\u00c3\u0083\u00c2\u00a1\u00c3\u0083\u00c2\u00a9\u00c3\u0083\u00c2\u00ad\u00c3\u0083\u00c2\u00af\u00c3\u0083\u00c2\u00a7\u00c3\u0083\u00c2\u00b1\u00c3\u0083\u00e2\u0080\u009a \u00c3\u0082\u00c2\u00a9\u00c3\u0082\u00c2\u00b5\u00c3\u0082\u00c2\u00a5\u00c3\u0082\u00c2\u00a3\u00c3\u0082\u00c2\u00b1\u00c3\u0082\u00c2\u00b2\u00c3\u0082\u00c2\u00ae"
    private static final String TEST_LINE = "A Test Line. Special chars: \u00c4\u00e4\u00dc\u00fc\u00d6\u00f6\u00df \u00c3\u00e1\u00e9\u00ed\u00ef\u00e7\u00f1\u00c2 \u00a9\u00b5\u00a5\u00a3\u00b1\u00b2\u00ae";
    // Hiragana letters: \u00c3\u00a3\u00ef\u00bf\u00bd\u00ef\u00bf\u00bd\u00c3\u00a3\u00ef\u00bf\u00bd\u00e2\u0080\u009a\u00c3\u00a3\u00ef\u00bf\u00bd\u00c6\u0092\u00c3\u00a3\u00ef\u00bf\u00bd\u00e2\u0080\u009e\u00c3\u00a3\u00ef\u00bf\u00bd\u00e2\u0080\u00a6
    private static final String TEST_LINE_SHIFT_JIS1 = "Hiragana letters: \u3041\u3042\u3043\u3044\u3045";
    // Kanji letters: \u00c3\u00a6\u00cb\u009c\u00c5\u00bd\u00c3\u00a8\u00c2\u00bc\u00c2\u00b8\u00c3\u00a5\u00c2\u00ad\u00ef\u00bf\u00bd\u00c3\u00a4\u00c2\u00ba\u00c2\u00ac
    private static final String TEST_LINE_SHIFT_JIS2 = "Kanji letters: \u660e\u8f38\u5b50\u4eac";
    // windows-31j characters
    private static final String TEST_LINE_WINDOWS_31J_1 = "\u3041\u3042\u3043\u3044\u3045";
    private static final String TEST_LINE_WINDOWS_31J_2 = "\u660e\u8f38\u5b50\u4eac";
    // gbk characters (Simplified Chinese)
    private static final String TEST_LINE_GBK_1 = "\u660e\u8f38\u5b50\u4eac";
    private static final String TEST_LINE_GBK_2 = "\u7b80\u4f53\u4e2d\u6587";
    // x-windows-949 characters (Korean)
    private static final String TEST_LINE_X_WINDOWS_949_1 = "\ud55c\uad6d\uc5b4";
    private static final String TEST_LINE_X_WINDOWS_949_2 = "\ub300\ud55c\ubbfc\uad6d";
    // x-windows-950 characters (Traditional Chinese)
    private static final String TEST_LINE_X_WINDOWS_950_1 = "\u660e\u8f38\u5b50\u4eac";
    private static final String TEST_LINE_X_WINDOWS_950_2 = "\u7e41\u9ad4\u4e2d\u6587";


    @AfterEach
    public void closeReader() {try{__CLR4_4_1hfyhfykylve31c.R.inc(22608);
        __CLR4_4_1hfyhfykylve31c.R.inc(22609);try {
            __CLR4_4_1hfyhfykylve31c.R.inc(22610);if ((((reversedLinesFileReader != null)&&(__CLR4_4_1hfyhfykylve31c.R.iget(22611)!=0|true))||(__CLR4_4_1hfyhfykylve31c.R.iget(22612)==0&false))) {{
                __CLR4_4_1hfyhfykylve31c.R.inc(22613);reversedLinesFileReader.close();
            }
        }} catch (final Exception e) {
            // ignore
        }
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testIsoFileDefaults(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15q2zg9hg6(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testIsoFileDefaults",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15q2zg9hg6(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22614);
        __CLR4_4_1hfyhfykylve31c.R.inc(22615);final File testFileIso = TestResources.getFile("/test-file-iso8859-1.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22616);reversedLinesFileReader = new ReversedLinesFileReader(testFileIso, testParamBlockSize, ISO_8859_1);
        __CLR4_4_1hfyhfykylve31c.R.inc(22617);assertFileWithShrinkingTestLines(reversedLinesFileReader);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testUTF8FileWindowsBreaks(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xnbi8ghga(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testUTF8FileWindowsBreaks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xnbi8ghga(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22618);
        __CLR4_4_1hfyhfykylve31c.R.inc(22619);final File testFileIso = TestResources.getFile("/test-file-utf8-win-linebr.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22620);reversedLinesFileReader = new ReversedLinesFileReader(testFileIso, testParamBlockSize, UTF_8);
        __CLR4_4_1hfyhfykylve31c.R.inc(22621);assertFileWithShrinkingTestLines(reversedLinesFileReader);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testUTF8FileCRBreaks(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110h4g6hge(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testUTF8FileCRBreaks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110h4g6hge(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22622);
        __CLR4_4_1hfyhfykylve31c.R.inc(22623);final File testFileIso = TestResources.getFile("/test-file-utf8-cr-only.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22624);reversedLinesFileReader = new ReversedLinesFileReader(testFileIso, testParamBlockSize, UTF_8);
        __CLR4_4_1hfyhfykylve31c.R.inc(22625);assertFileWithShrinkingTestLines(reversedLinesFileReader);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testUTF8File(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqyt5jhgi(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testUTF8File",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqyt5jhgi(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22626);
        __CLR4_4_1hfyhfykylve31c.R.inc(22627);final File testFileIso = TestResources.getFile("/test-file-utf8.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22628);reversedLinesFileReader = new ReversedLinesFileReader(testFileIso, testParamBlockSize, UTF_8);
        __CLR4_4_1hfyhfykylve31c.R.inc(22629);assertFileWithShrinkingTestLines(reversedLinesFileReader);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testEmptyFile(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eucoj5hgm(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testEmptyFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eucoj5hgm(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22630);
        __CLR4_4_1hfyhfykylve31c.R.inc(22631);final File testFileEmpty = TestResources.getFile("/test-file-empty.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22632);reversedLinesFileReader = new ReversedLinesFileReader(testFileEmpty, testParamBlockSize, UTF_8);
        __CLR4_4_1hfyhfykylve31c.R.inc(22633);assertNull(reversedLinesFileReader.readLine());
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testUTF16BEFile(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2p1nzhgq(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testUTF16BEFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2p1nzhgq(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22634);
        __CLR4_4_1hfyhfykylve31c.R.inc(22635);final File testFileUTF16BE = TestResources.getFile("/test-file-utf16be.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22636);reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16BE, testParamBlockSize, "UTF-16BE");
        __CLR4_4_1hfyhfykylve31c.R.inc(22637);assertFileWithShrinkingTestLines(reversedLinesFileReader);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testUTF16LEFile(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4bwqvhgu(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testUTF16LEFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4bwqvhgu(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22638);
        __CLR4_4_1hfyhfykylve31c.R.inc(22639);final File testFileUTF16LE = TestResources.getFile("/test-file-utf16le.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22640);reversedLinesFileReader = new ReversedLinesFileReader(testFileUTF16LE, testParamBlockSize, "UTF-16LE");
        __CLR4_4_1hfyhfykylve31c.R.inc(22641);assertFileWithShrinkingTestLines(reversedLinesFileReader);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testShiftJISFile(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17hgdsohgy(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testShiftJISFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17hgdsohgy(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22642);
        __CLR4_4_1hfyhfykylve31c.R.inc(22643);final File testFileShiftJIS = TestResources.getFile("/test-file-shiftjis.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22644);reversedLinesFileReader = new ReversedLinesFileReader(testFileShiftJIS, testParamBlockSize, "Shift_JIS");
        __CLR4_4_1hfyhfykylve31c.R.inc(22645);assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS2, reversedLinesFileReader.readLine());
        __CLR4_4_1hfyhfykylve31c.R.inc(22646);assertEqualsAndNoLineBreaks(TEST_LINE_SHIFT_JIS1, reversedLinesFileReader.readLine());
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testWindows31jFile(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f9573hh3(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testWindows31jFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f9573hh3(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22647);
        __CLR4_4_1hfyhfykylve31c.R.inc(22648);final File testFileWindows31J = TestResources.getFile("/test-file-windows-31j.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22649);reversedLinesFileReader = new ReversedLinesFileReader(testFileWindows31J, testParamBlockSize, "windows-31j");
        __CLR4_4_1hfyhfykylve31c.R.inc(22650);assertEqualsAndNoLineBreaks(TEST_LINE_WINDOWS_31J_2, reversedLinesFileReader.readLine());
        __CLR4_4_1hfyhfykylve31c.R.inc(22651);assertEqualsAndNoLineBreaks(TEST_LINE_WINDOWS_31J_1, reversedLinesFileReader.readLine());
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testGBK(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ke6bfahh8(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testGBK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ke6bfahh8(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22652);
        __CLR4_4_1hfyhfykylve31c.R.inc(22653);final File testFileGBK = TestResources.getFile("/test-file-gbk.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22654);reversedLinesFileReader = new ReversedLinesFileReader(testFileGBK, testParamBlockSize, "GBK");
        __CLR4_4_1hfyhfykylve31c.R.inc(22655);assertEqualsAndNoLineBreaks(TEST_LINE_GBK_2, reversedLinesFileReader.readLine());
        __CLR4_4_1hfyhfykylve31c.R.inc(22656);assertEqualsAndNoLineBreaks(TEST_LINE_GBK_1, reversedLinesFileReader.readLine());
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testxWindows949File(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loo3pxhhd(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testxWindows949File",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loo3pxhhd(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22657);
        __CLR4_4_1hfyhfykylve31c.R.inc(22658);final File testFilexWindows949 = TestResources.getFile("/test-file-x-windows-949.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22659);reversedLinesFileReader = new ReversedLinesFileReader(testFilexWindows949, testParamBlockSize, "x-windows-949");
        __CLR4_4_1hfyhfykylve31c.R.inc(22660);assertEqualsAndNoLineBreaks(TEST_LINE_X_WINDOWS_949_2, reversedLinesFileReader.readLine());
        __CLR4_4_1hfyhfykylve31c.R.inc(22661);assertEqualsAndNoLineBreaks(TEST_LINE_X_WINDOWS_949_1, reversedLinesFileReader.readLine());
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testxWindows950File(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1guuforhhi(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testxWindows950File",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1guuforhhi(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22662);
        __CLR4_4_1hfyhfykylve31c.R.inc(22663);final File testFilexWindows950 = TestResources.getFile("/test-file-x-windows-950.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22664);reversedLinesFileReader = new ReversedLinesFileReader(testFilexWindows950, testParamBlockSize, "x-windows-950");
        __CLR4_4_1hfyhfykylve31c.R.inc(22665);assertEqualsAndNoLineBreaks(TEST_LINE_X_WINDOWS_950_2, reversedLinesFileReader.readLine());
        __CLR4_4_1hfyhfykylve31c.R.inc(22666);assertEqualsAndNoLineBreaks(TEST_LINE_X_WINDOWS_950_1, reversedLinesFileReader.readLine());
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @Test
    public void testFileSizeIsExactMultipleOfBlockSize() throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v55l4hhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testFileSizeIsExactMultipleOfBlockSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v55l4hhn() throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22667);
        __CLR4_4_1hfyhfykylve31c.R.inc(22668);final int blockSize = 10;
        __CLR4_4_1hfyhfykylve31c.R.inc(22669);final File testFile20Bytes = TestResources.getFile("/test-file-20byteslength.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22670);reversedLinesFileReader = new ReversedLinesFileReader(testFile20Bytes, blockSize, ISO_8859_1);
        __CLR4_4_1hfyhfykylve31c.R.inc(22671);assertEqualsAndNoLineBreaks("987654321", reversedLinesFileReader.readLine());
        __CLR4_4_1hfyhfykylve31c.R.inc(22672);assertEqualsAndNoLineBreaks("123456789", reversedLinesFileReader.readLine());
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testUTF8FileWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11erkmhht(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testUTF8FileWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11erkmhht(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22673);
        __CLR4_4_1hfyhfykylve31c.R.inc(22674);final File testFileUtf8 = TestResources.getFile("/test-file-utf8-win-linebr.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22675);reversedLinesFileReader = new ReversedLinesFileReader(testFileUtf8, testParamBlockSize, UTF_8);
        __CLR4_4_1hfyhfykylve31c.R.inc(22676);assertFileWithShrinkingTestLines(reversedLinesFileReader);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines(final int testParamBlockSize) throws URISyntaxException, IOException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfg9tlhhx(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testIsoFileManyWindowsBreaksSmallBlockSize2VerifyBlockSpanningNewLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfg9tlhhx(final int testParamBlockSize) throws URISyntaxException, IOException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22677);
        __CLR4_4_1hfyhfykylve31c.R.inc(22678);final File testFileIso = TestResources.getFile("/test-file-iso8859-1-shortlines-win-linebr.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22679);reversedLinesFileReader = new ReversedLinesFileReader(testFileIso, testParamBlockSize, ISO_8859_1);

        __CLR4_4_1hfyhfykylve31c.R.inc(22680);for (int i = 3; (((i > 0)&&(__CLR4_4_1hfyhfykylve31c.R.iget(22681)!=0|true))||(__CLR4_4_1hfyhfykylve31c.R.iget(22682)==0&false)); i--) {{
            __CLR4_4_1hfyhfykylve31c.R.inc(22683);for (int j = 1; (((j <= 3)&&(__CLR4_4_1hfyhfykylve31c.R.iget(22684)!=0|true))||(__CLR4_4_1hfyhfykylve31c.R.iget(22685)==0&false)); j++) {{
                __CLR4_4_1hfyhfykylve31c.R.inc(22686);assertEqualsAndNoLineBreaks("", reversedLinesFileReader.readLine());
            }
            }__CLR4_4_1hfyhfykylve31c.R.inc(22687);assertEqualsAndNoLineBreaks("" + i, reversedLinesFileReader.readLine());
        }
    }}finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testUnsupportedEncodingUTF16(final int testParamBlockSize) throws URISyntaxException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxfxamhi8(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testUnsupportedEncodingUTF16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxfxamhi8(final int testParamBlockSize) throws URISyntaxException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22688);
        __CLR4_4_1hfyhfykylve31c.R.inc(22689);final File testFileEmpty = TestResources.getFile("/test-file-empty.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22690);assertThrows(UnsupportedEncodingException.class,
                () -> new ReversedLinesFileReader(testFileEmpty, testParamBlockSize, "UTF-16").close());
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    @ParameterizedTest(name = "BlockSize={0}")
    @MethodSource("blockSizes")
    public void testUnsupportedEncodingBig5(final int testParamBlockSize) throws URISyntaxException {__CLR4_4_1hfyhfykylve31c.R.globalSliceStart(getClass().getName(),22691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjfcv7hib(testParamBlockSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hfyhfykylve31c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hfyhfykylve31c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamBlockSize.testUnsupportedEncodingBig5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjfcv7hib(final int testParamBlockSize) throws URISyntaxException{try{__CLR4_4_1hfyhfykylve31c.R.inc(22691);
        __CLR4_4_1hfyhfykylve31c.R.inc(22692);final File testFileEncodingBig5 = TestResources.getFile("/test-file-empty.bin");
        __CLR4_4_1hfyhfykylve31c.R.inc(22693);assertThrows(UnsupportedEncodingException.class,
                () -> new ReversedLinesFileReader(testFileEncodingBig5, testParamBlockSize, "Big5").close());
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    private void assertFileWithShrinkingTestLines(final ReversedLinesFileReader reversedLinesFileReader) throws IOException {try{__CLR4_4_1hfyhfykylve31c.R.inc(22694);
        __CLR4_4_1hfyhfykylve31c.R.inc(22695);String line = null;
        __CLR4_4_1hfyhfykylve31c.R.inc(22696);int lineCount = 0;
        __CLR4_4_1hfyhfykylve31c.R.inc(22697);while ((line = reversedLinesFileReader.readLine()) != null) {{
            __CLR4_4_1hfyhfykylve31c.R.inc(22700);lineCount++;
            __CLR4_4_1hfyhfykylve31c.R.inc(22701);assertEqualsAndNoLineBreaks("Line " + lineCount + " is not matching", TEST_LINE.substring(0, lineCount), line);
        }
    }}finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    static void assertEqualsAndNoLineBreaks(final String msg, final String expected, final String actual) {try{__CLR4_4_1hfyhfykylve31c.R.inc(22702);
        __CLR4_4_1hfyhfykylve31c.R.inc(22703);if ((((actual != null)&&(__CLR4_4_1hfyhfykylve31c.R.iget(22704)!=0|true))||(__CLR4_4_1hfyhfykylve31c.R.iget(22705)==0&false))) {{
            __CLR4_4_1hfyhfykylve31c.R.inc(22706);assertFalse(actual.contains(LF.getString()), "Line contains \\n: line=" + actual);
            __CLR4_4_1hfyhfykylve31c.R.inc(22707);assertFalse(actual.contains(CR.getString()), "Line contains \\r: line=" + actual);
        }
        }__CLR4_4_1hfyhfykylve31c.R.inc(22708);assertEquals(expected, actual, msg);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}

    static void assertEqualsAndNoLineBreaks(final String expected, final String actual) {try{__CLR4_4_1hfyhfykylve31c.R.inc(22709);
        __CLR4_4_1hfyhfykylve31c.R.inc(22710);assertEqualsAndNoLineBreaks(null, expected, actual);
    }finally{__CLR4_4_1hfyhfykylve31c.R.flushNeeded();}}
}
