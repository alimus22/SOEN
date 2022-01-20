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

import static org.apache.commons.io.test.TestUtils.checkFile;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Tests that the encoding is actually set and used.
 *
 */
public class FileWriterWithEncodingTest {static class __CLR4_4_1k29k29kylve3k2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26101,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    private String defaultEncoding;
    private File file1;
    private File file2;
    private String textContent;
    private final char[] anotherTestContent = {'f', 'z', 'x'};

    @BeforeEach
    public void setUp() throws Exception {try{__CLR4_4_1k29k29kylve3k2.R.inc(26001);
        __CLR4_4_1k29k29kylve3k2.R.inc(26002);final File encodingFinder = new File(temporaryFolder, "finder.txt");
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k29k29kylve3k2.R.inc(26003);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1k29k29kylve3k2.R.inc(26004);}};OutputStreamWriter out = new OutputStreamWriter(Files.newOutputStream(encodingFinder.toPath()))) {
            __CLR4_4_1k29k29kylve3k2.R.inc(26005);defaultEncoding = out.getEncoding();
        }
        __CLR4_4_1k29k29kylve3k2.R.inc(26006);file1 = new File(temporaryFolder, "testfile1.txt");
        __CLR4_4_1k29k29kylve3k2.R.inc(26007);file2 = new File(temporaryFolder, "testfile2.txt");
        __CLR4_4_1k29k29kylve3k2.R.inc(26008);final char[] arr = new char[1024];
        __CLR4_4_1k29k29kylve3k2.R.inc(26009);final char[] chars = "ABCDEFGHIJKLMNOPQabcdefgihklmnopq".toCharArray();
        __CLR4_4_1k29k29kylve3k2.R.inc(26010);for (int i = 0; (((i < arr.length)&&(__CLR4_4_1k29k29kylve3k2.R.iget(26011)!=0|true))||(__CLR4_4_1k29k29kylve3k2.R.iget(26012)==0&false)); i++) {{
            __CLR4_4_1k29k29kylve3k2.R.inc(26013);arr[i] = chars[i % chars.length];
        }
        }__CLR4_4_1k29k29kylve3k2.R.inc(26014);textContent = new String(arr);
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void sameEncoding_string_constructor() throws Exception {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wlqku1k2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.sameEncoding_string_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wlqku1k2n() throws Exception{try{__CLR4_4_1k29k29kylve3k2.R.inc(26015);
        __CLR4_4_1k29k29kylve3k2.R.inc(26016);successfulRun(new FileWriterWithEncoding(file2, defaultEncoding));
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void sameEncoding_string_string_constructor() throws Exception {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112lme3k2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.sameEncoding_string_string_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112lme3k2p() throws Exception{try{__CLR4_4_1k29k29kylve3k2.R.inc(26017);
        __CLR4_4_1k29k29kylve3k2.R.inc(26018);successfulRun(new FileWriterWithEncoding(file2.getPath(), defaultEncoding));
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void sameEncoding_Charset_constructor() throws Exception {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tfizck2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.sameEncoding_Charset_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tfizck2r() throws Exception{try{__CLR4_4_1k29k29kylve3k2.R.inc(26019);
        __CLR4_4_1k29k29kylve3k2.R.inc(26020);successfulRun(new FileWriterWithEncoding(file2, Charset.defaultCharset()));
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void sameEncoding_string_Charset_constructor() throws Exception {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4vkxyk2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.sameEncoding_string_Charset_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4vkxyk2t() throws Exception{try{__CLR4_4_1k29k29kylve3k2.R.inc(26021);
        __CLR4_4_1k29k29kylve3k2.R.inc(26022);successfulRun(new FileWriterWithEncoding(file2.getPath(), Charset.defaultCharset()));
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void sameEncoding_CharsetEncoder_constructor() throws Exception {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gvinrsk2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.sameEncoding_CharsetEncoder_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gvinrsk2v() throws Exception{try{__CLR4_4_1k29k29kylve3k2.R.inc(26023);
        __CLR4_4_1k29k29kylve3k2.R.inc(26024);final CharsetEncoder enc = Charset.defaultCharset().newEncoder();
        __CLR4_4_1k29k29kylve3k2.R.inc(26025);successfulRun(new FileWriterWithEncoding(file2, enc));
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void sameEncoding_string_CharsetEncoder_constructor() throws Exception {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyvtyyk2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.sameEncoding_string_CharsetEncoder_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyvtyyk2y() throws Exception{try{__CLR4_4_1k29k29kylve3k2.R.inc(26026);
        __CLR4_4_1k29k29kylve3k2.R.inc(26027);final CharsetEncoder enc = Charset.defaultCharset().newEncoder();
        __CLR4_4_1k29k29kylve3k2.R.inc(26028);successfulRun(new FileWriterWithEncoding(file2.getPath(), enc));
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    private void successfulRun(final FileWriterWithEncoding fw21) throws Exception {try{__CLR4_4_1k29k29kylve3k2.R.inc(26029);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k29k29kylve3k2.R.inc(26030);try (
            __CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1k29k29kylve3k2.R.inc(26031);}};FileWriter fw1 = new FileWriter(file1);  // default encoding
            __CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1k29k29kylve3k2.R.inc(26032);}};FileWriterWithEncoding fw2 = fw21
        ){
            __CLR4_4_1k29k29kylve3k2.R.inc(26033);writeTestPayload(fw1, fw2);
            __CLR4_4_1k29k29kylve3k2.R.inc(26034);checkFile(file1, file2);
        }
        __CLR4_4_1k29k29kylve3k2.R.inc(26035);assertTrue(file1.exists());
        __CLR4_4_1k29k29kylve3k2.R.inc(26036);assertTrue(file2.exists());
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void testDifferentEncoding() throws Exception {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llbk1tk39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.testDifferentEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llbk1tk39() throws Exception{try{__CLR4_4_1k29k29kylve3k2.R.inc(26037);
        __CLR4_4_1k29k29kylve3k2.R.inc(26038);if ((((Charset.isSupported("UTF-16BE"))&&(__CLR4_4_1k29k29kylve3k2.R.iget(26039)!=0|true))||(__CLR4_4_1k29k29kylve3k2.R.iget(26040)==0&false))) {{
            class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k29k29kylve3k2.R.inc(26041);try (
                __CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_1k29k29kylve3k2.R.inc(26042);}};FileWriter fw1 = new FileWriter(file1);  // default encoding
                __CLR4_4_1$AC2 __CLR$ACI4=new __CLR4_4_1$AC2(){{__CLR4_4_1k29k29kylve3k2.R.inc(26043);}};FileWriterWithEncoding fw2 = new FileWriterWithEncoding(file2, defaultEncoding)
            ){
                __CLR4_4_1k29k29kylve3k2.R.inc(26044);writeTestPayload(fw1, fw2);
                __CLR4_4_1k29k29kylve3k2.R.inc(26045);try {
                    __CLR4_4_1k29k29kylve3k2.R.inc(26046);checkFile(file1, file2);
                    __CLR4_4_1k29k29kylve3k2.R.inc(26047);fail();
                } catch (final AssertionError ex) {
                    // success
                }

            }
            __CLR4_4_1k29k29kylve3k2.R.inc(26048);assertTrue(file1.exists());
            __CLR4_4_1k29k29kylve3k2.R.inc(26049);assertTrue(file2.exists());
        }
        }__CLR4_4_1k29k29kylve3k2.R.inc(26050);if ((((Charset.isSupported("UTF-16LE"))&&(__CLR4_4_1k29k29kylve3k2.R.iget(26051)!=0|true))||(__CLR4_4_1k29k29kylve3k2.R.iget(26052)==0&false))) {{
            class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k29k29kylve3k2.R.inc(26053);try (
                __CLR4_4_1$AC3 __CLR$ACI5=new __CLR4_4_1$AC3(){{__CLR4_4_1k29k29kylve3k2.R.inc(26054);}};FileWriter fw1 = new FileWriter(file1);  // default encoding
                __CLR4_4_1$AC3 __CLR$ACI6=new __CLR4_4_1$AC3(){{__CLR4_4_1k29k29kylve3k2.R.inc(26055);}};FileWriterWithEncoding fw2 = new FileWriterWithEncoding(file2, defaultEncoding)
            ){
                __CLR4_4_1k29k29kylve3k2.R.inc(26056);writeTestPayload(fw1, fw2);
                __CLR4_4_1k29k29kylve3k2.R.inc(26057);try {
                    __CLR4_4_1k29k29kylve3k2.R.inc(26058);checkFile(file1, file2);
                    __CLR4_4_1k29k29kylve3k2.R.inc(26059);fail();
                } catch (final AssertionError ex) {
                    // success
                }

            }
            __CLR4_4_1k29k29kylve3k2.R.inc(26060);assertTrue(file1.exists());
            __CLR4_4_1k29k29kylve3k2.R.inc(26061);assertTrue(file2.exists());
        }
    }}finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    private void writeTestPayload(final FileWriter fw1, final FileWriterWithEncoding fw2) throws IOException {try{__CLR4_4_1k29k29kylve3k2.R.inc(26062);
        __CLR4_4_1k29k29kylve3k2.R.inc(26063);assertTrue(file1.exists());
        __CLR4_4_1k29k29kylve3k2.R.inc(26064);assertTrue(file2.exists());

        __CLR4_4_1k29k29kylve3k2.R.inc(26065);fw1.write(textContent);
        __CLR4_4_1k29k29kylve3k2.R.inc(26066);fw2.write(textContent);
        __CLR4_4_1k29k29kylve3k2.R.inc(26067);fw1.write(65);
        __CLR4_4_1k29k29kylve3k2.R.inc(26068);fw2.write(65);
        __CLR4_4_1k29k29kylve3k2.R.inc(26069);fw1.write(anotherTestContent);
        __CLR4_4_1k29k29kylve3k2.R.inc(26070);fw2.write(anotherTestContent);
        __CLR4_4_1k29k29kylve3k2.R.inc(26071);fw1.write(anotherTestContent, 1, 2);
        __CLR4_4_1k29k29kylve3k2.R.inc(26072);fw2.write(anotherTestContent, 1, 2);
        __CLR4_4_1k29k29kylve3k2.R.inc(26073);fw1.write("CAFE", 1, 2);
        __CLR4_4_1k29k29kylve3k2.R.inc(26074);fw2.write("CAFE", 1, 2);

        __CLR4_4_1k29k29kylve3k2.R.inc(26075);fw1.flush();
        __CLR4_4_1k29k29kylve3k2.R.inc(26076);fw2.flush();
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void constructor_File_encoding_badEncoding() {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tyxs4vk4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.constructor_File_encoding_badEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tyxs4vk4d(){try{__CLR4_4_1k29k29kylve3k2.R.inc(26077);
        __CLR4_4_1k29k29kylve3k2.R.inc(26078);assertThrows(IOException.class, () -> {
            class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k29k29kylve3k2.R.inc(26079);try (
                __CLR4_4_1$AC4 __CLR$ACI7=new __CLR4_4_1$AC4(){{__CLR4_4_1k29k29kylve3k2.R.inc(26080);}};Writer writer = new FileWriterWithEncoding(file1, "BAD-ENCODE")
            ){ }
         });
        __CLR4_4_1k29k29kylve3k2.R.inc(26081);assertFalse(file1.exists());
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void constructor_File_directory() {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1479vsak4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.constructor_File_directory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1479vsak4i(){try{__CLR4_4_1k29k29kylve3k2.R.inc(26082);
        __CLR4_4_1k29k29kylve3k2.R.inc(26083);assertThrows(IOException.class, () -> {
            class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k29k29kylve3k2.R.inc(26084);try (
                __CLR4_4_1$AC5 __CLR$ACI8=new __CLR4_4_1$AC5(){{__CLR4_4_1k29k29kylve3k2.R.inc(26085);}};Writer writer = new FileWriterWithEncoding(temporaryFolder, defaultEncoding)
            ){ }
         });
        __CLR4_4_1k29k29kylve3k2.R.inc(26086);assertFalse(file1.exists());
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void constructor_File_nullFile() {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12exh88k4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.constructor_File_nullFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12exh88k4n(){try{__CLR4_4_1k29k29kylve3k2.R.inc(26087);
        __CLR4_4_1k29k29kylve3k2.R.inc(26088);assertThrows(NullPointerException.class, () -> {
            class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k29k29kylve3k2.R.inc(26089);try (
                __CLR4_4_1$AC6 __CLR$ACI9=new __CLR4_4_1$AC6(){{__CLR4_4_1k29k29kylve3k2.R.inc(26090);}};Writer writer = new FileWriterWithEncoding((File) null, defaultEncoding)
            ){ }
         });
        __CLR4_4_1k29k29kylve3k2.R.inc(26091);assertFalse(file1.exists());
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void constructor_fileName_nullFile() {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vb75xfk4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.constructor_fileName_nullFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vb75xfk4s(){try{__CLR4_4_1k29k29kylve3k2.R.inc(26092);
        __CLR4_4_1k29k29kylve3k2.R.inc(26093);assertThrows(NullPointerException.class, () -> {
            class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k29k29kylve3k2.R.inc(26094);try (
                __CLR4_4_1$AC7 __CLR$ACI10=new __CLR4_4_1$AC7(){{__CLR4_4_1k29k29kylve3k2.R.inc(26095);}};Writer writer = new FileWriterWithEncoding((String) null, defaultEncoding)
            ){ }
         });
        __CLR4_4_1k29k29kylve3k2.R.inc(26096);assertFalse(file1.exists());
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}

    @Test
    public void sameEncoding_null_Charset_constructor() throws Exception {__CLR4_4_1k29k29kylve3k2.R.globalSliceStart(getClass().getName(),26097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fl0sg4k4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k29k29kylve3k2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k29k29kylve3k2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.FileWriterWithEncodingTest.sameEncoding_null_Charset_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fl0sg4k4x() throws Exception{try{__CLR4_4_1k29k29kylve3k2.R.inc(26097);
        __CLR4_4_1k29k29kylve3k2.R.inc(26098);try {
            __CLR4_4_1k29k29kylve3k2.R.inc(26099);successfulRun(new FileWriterWithEncoding(file2, (Charset) null));
            __CLR4_4_1k29k29kylve3k2.R.inc(26100);fail();
        } catch (final NullPointerException ignore) {

        }
    }finally{__CLR4_4_1k29k29kylve3k2.R.flushNeeded();}}
}
