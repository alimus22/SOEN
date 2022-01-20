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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.Charsets;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CharSequenceInputStreamTest {static class __CLR4_4_1g5kg5kkylve2py{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21149,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LARGE_TEST_STRING;

    private static final String TEST_STRING = "\u00e0 peine arriv\u00e9s nous entr\u00e2mes dans sa chambre";

    static {try{__CLR4_4_1g5kg5kkylve2py.R.inc(20936);
        __CLR4_4_1g5kg5kkylve2py.R.inc(20937);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_1g5kg5kkylve2py.R.inc(20938);for (int i = 0; (((i < 100)&&(__CLR4_4_1g5kg5kkylve2py.R.iget(20939)!=0|true))||(__CLR4_4_1g5kg5kkylve2py.R.iget(20940)==0&false)); i++) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(20941);buffer.append(TEST_STRING);
        }
        }__CLR4_4_1g5kg5kkylve2py.R.inc(20942);LARGE_TEST_STRING = buffer.toString();
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private final Random random = new Random();

    private Set<String> getRequiredCharsetNames() {try{__CLR4_4_1g5kg5kkylve2py.R.inc(20943);
        __CLR4_4_1g5kg5kkylve2py.R.inc(20944);return Charsets.requiredCharsets().keySet();
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private void testBufferedRead(final String testString, final String charsetName) throws IOException {try{__CLR4_4_1g5kg5kkylve2py.R.inc(20945);
        __CLR4_4_1g5kg5kkylve2py.R.inc(20946);final byte[] expected = testString.getBytes(charsetName);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(20947);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1g5kg5kkylve2py.R.inc(20948);}};InputStream in = new CharSequenceInputStream(testString, charsetName, 512)) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(20949);final byte[] buffer = new byte[128];
            __CLR4_4_1g5kg5kkylve2py.R.inc(20950);int offset = 0;            __CLR4_4_1g5kg5kkylve2py.R.inc(20951);while (true) {{
                __CLR4_4_1g5kg5kkylve2py.R.inc(20952);int bufferOffset = random.nextInt(64);
                __CLR4_4_1g5kg5kkylve2py.R.inc(20953);final int bufferLength = random.nextInt(64);
                __CLR4_4_1g5kg5kkylve2py.R.inc(20954);int read = in.read(buffer, bufferOffset, bufferLength);
                __CLR4_4_1g5kg5kkylve2py.R.inc(20955);if ((((read == -1)&&(__CLR4_4_1g5kg5kkylve2py.R.iget(20956)!=0|true))||(__CLR4_4_1g5kg5kkylve2py.R.iget(20957)==0&false))) {{
                    __CLR4_4_1g5kg5kkylve2py.R.inc(20958);assertEquals(expected.length, offset, "EOF: offset should equal length for charset " + charsetName);
                    __CLR4_4_1g5kg5kkylve2py.R.inc(20959);break;
                }
                }__CLR4_4_1g5kg5kkylve2py.R.inc(20960);assertTrue(read <= bufferLength, "Read " + read + " <= " + bufferLength);
                __CLR4_4_1g5kg5kkylve2py.R.inc(20961);while ((((read > 0)&&(__CLR4_4_1g5kg5kkylve2py.R.iget(20962)!=0|true))||(__CLR4_4_1g5kg5kkylve2py.R.iget(20963)==0&false))) {{
                    __CLR4_4_1g5kg5kkylve2py.R.inc(20964);assertTrue(offset < expected.length,
                            "offset for " + charsetName + " " + offset + " < " + expected.length);
                    __CLR4_4_1g5kg5kkylve2py.R.inc(20965);assertEquals(expected[offset], buffer[bufferOffset], "bytes should agree for " + charsetName);
                    __CLR4_4_1g5kg5kkylve2py.R.inc(20966);offset++;
                    __CLR4_4_1g5kg5kkylve2py.R.inc(20967);bufferOffset++;
                    __CLR4_4_1g5kg5kkylve2py.R.inc(20968);read--;
                }
            }}
        }}
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

//    Unfortunately checking canEncode does not seem to work for all charsets:
//    testBufferedRead_AvailableCharset(org.apache.commons.io.input.CharSequenceInputStreamTest)  Time elapsed: 0.682 sec  <<< ERROR!
//    java.lang.UnsupportedOperationException: null
//        at java.nio.CharBuffer.array(CharBuffer.java:940)
//        at sun.nio.cs.ext.COMPOUND_TEXT_Encoder.encodeLoop(COMPOUND_TEXT_Encoder.java:75)
//        at java.nio.charset.CharsetEncoder.encode(CharsetEncoder.java:544)
//        at org.apache.commons.io.input.CharSequenceInputStream.fillBuffer(CharSequenceInputStream.java:111)
    @Test
    public void testBufferedRead_AvailableCharset() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),20969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15s75c2g6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testBufferedRead_AvailableCharset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15s75c2g6h() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(20969);
        __CLR4_4_1g5kg5kkylve2py.R.inc(20970);for (final String csName : Charset.availableCharsets().keySet()) {{
            // prevent java.lang.UnsupportedOperationException at sun.nio.cs.ext.ISO2022_CN.newEncoder.
            __CLR4_4_1g5kg5kkylve2py.R.inc(20971);if ((((isAvailabilityTestableForCharset(csName))&&(__CLR4_4_1g5kg5kkylve2py.R.iget(20972)!=0|true))||(__CLR4_4_1g5kg5kkylve2py.R.iget(20973)==0&false))) {{
                __CLR4_4_1g5kg5kkylve2py.R.inc(20974);testBufferedRead(TEST_STRING, csName);
            }
        }}
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testBufferedRead_RequiredCharset() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),20975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qsmyisg6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testBufferedRead_RequiredCharset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qsmyisg6n() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(20975);
        __CLR4_4_1g5kg5kkylve2py.R.inc(20976);for (final String csName : getRequiredCharsetNames()) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(20977);testBufferedRead(TEST_STRING, csName);
        }
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testBufferedRead_UTF8() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),20978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18kyb00g6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testBufferedRead_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18kyb00g6q() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(20978);
        __CLR4_4_1g5kg5kkylve2py.R.inc(20979);testBufferedRead(TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private void testCharsetMismatchInfiniteLoop(final String csName) throws IOException {try{__CLR4_4_1g5kg5kkylve2py.R.inc(20980);
        // Input is UTF-8 bytes: 0xE0 0xB2 0xA0
        __CLR4_4_1g5kg5kkylve2py.R.inc(20981);final char[] inputChars = { (char) 0xE0, (char) 0xB2, (char) 0xA0 };
        __CLR4_4_1g5kg5kkylve2py.R.inc(20982);final Charset charset = Charset.forName(csName); // infinite loop for US-ASCII, UTF-8 OK
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(20983);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1g5kg5kkylve2py.R.inc(20984);}};InputStream stream = new CharSequenceInputStream(new String(inputChars), charset, 512)) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(20985);while ((((stream.read() != -1)&&(__CLR4_4_1g5kg5kkylve2py.R.iget(20986)!=0|true))||(__CLR4_4_1g5kg5kkylve2py.R.iget(20987)==0&false))) {{
            }
        }}
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testCharsetMismatchInfiniteLoop_RequiredCharsets() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),20988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjc9mcg70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testCharsetMismatchInfiniteLoop_RequiredCharsets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjc9mcg70() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(20988);
        __CLR4_4_1g5kg5kkylve2py.R.inc(20989);for (final String csName : getRequiredCharsetNames()) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(20990);testCharsetMismatchInfiniteLoop(csName);
        }
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    // Test is broken if readFirst > 0
    // This is because the initial read fills the buffer from the CharSequence
    // so data1 gets the first buffer full; data2 will get the next buffer full
    private void testIO_356(final int bufferSize, final int dataSize, final int readFirst, final String csName) throws Exception {try{__CLR4_4_1g5kg5kkylve2py.R.inc(20991);
        __CLR4_4_1g5kg5kkylve2py.R.inc(20992);final CharSequenceInputStream is = new CharSequenceInputStream(ALPHABET, csName, bufferSize);

        __CLR4_4_1g5kg5kkylve2py.R.inc(20993);for (int i = 0; (((i < readFirst)&&(__CLR4_4_1g5kg5kkylve2py.R.iget(20994)!=0|true))||(__CLR4_4_1g5kg5kkylve2py.R.iget(20995)==0&false)); i++) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(20996);final int ch = is.read();
            __CLR4_4_1g5kg5kkylve2py.R.inc(20997);assertNotEquals(-1, ch);
        }

        }__CLR4_4_1g5kg5kkylve2py.R.inc(20998);is.mark(dataSize);

        __CLR4_4_1g5kg5kkylve2py.R.inc(20999);final byte[] data1 = new byte[dataSize];
        __CLR4_4_1g5kg5kkylve2py.R.inc(21000);final int readCount1 = is.read(data1);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21001);assertEquals(dataSize, readCount1);

        __CLR4_4_1g5kg5kkylve2py.R.inc(21002);is.reset(); // should allow data to be re-read

        __CLR4_4_1g5kg5kkylve2py.R.inc(21003);final byte[] data2 = new byte[dataSize];
        __CLR4_4_1g5kg5kkylve2py.R.inc(21004);final int readCount2 = is.read(data2);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21005);assertEquals(dataSize, readCount2);

        __CLR4_4_1g5kg5kkylve2py.R.inc(21006);is.close();

        // data buffers should be identical
        __CLR4_4_1g5kg5kkylve2py.R.inc(21007);assertArrayEquals(data1, data2, "bufferSize=" + bufferSize + " dataSize=" + dataSize);
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testIO_356_B10_D10_S0_UTF16() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wqcrkzg7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testIO_356_B10_D10_S0_UTF16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wqcrkzg7k() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21008);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21009);testIO_356(10, 10, 0, "UTF-16");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testIO_356_B10_D10_S0_UTF8() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kak7ig7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testIO_356_B10_D10_S0_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kak7ig7m() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21010);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21011);testIO_356(10, 10, 0, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testIO_356_B10_D10_S1_UTF8() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd9i7ng7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testIO_356_B10_D10_S1_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd9i7ng7o() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21012);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21013);testIO_356(10, 10, 1, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testIO_356_B10_D10_S2_UTF8() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqahccg7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testIO_356_B10_D10_S2_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqahccg7q() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21014);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21015);testIO_356(10, 10, 2, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testIO_356_B10_D13_S0_UTF8() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzxbwvg7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testIO_356_B10_D13_S0_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzxbwvg7s() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21016);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21017);testIO_356(10, 13, 0, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testIO_356_B10_D13_S1_UTF8() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3mnn4g7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testIO_356_B10_D13_S1_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3mnn4g7u() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21018);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21019);testIO_356(10, 13, 1, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testIO_356_B10_D20_S0_UTF8() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fj2ivhg7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testIO_356_B10_D20_S0_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fj2ivhg7w() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21020);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21021);testIO_356(10, 20, 0, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private void testIO_356_Loop(final String csName, final int maxBytesPerChar) throws Exception {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21022);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21023);for (int bufferSize = maxBytesPerChar; (((bufferSize <= 10)&&(__CLR4_4_1g5kg5kkylve2py.R.iget(21024)!=0|true))||(__CLR4_4_1g5kg5kkylve2py.R.iget(21025)==0&false)); bufferSize++) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(21026);for (int dataSize = 1; (((dataSize <= 20)&&(__CLR4_4_1g5kg5kkylve2py.R.iget(21027)!=0|true))||(__CLR4_4_1g5kg5kkylve2py.R.iget(21028)==0&false)); dataSize++) {{
                __CLR4_4_1g5kg5kkylve2py.R.inc(21029);testIO_356(bufferSize, dataSize, 0, csName);
            }
        }}
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testIO_356_Loop_UTF16() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npazjqg86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testIO_356_Loop_UTF16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npazjqg86() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21030);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21031);testIO_356_Loop("UTF-16", 4);
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testIO_356_Loop_UTF8() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b0q8ldg88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testIO_356_Loop_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b0q8ldg88() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21032);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21033);testIO_356_Loop("UTF-8", 4);
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testLargeBufferedRead_RequiredCharsets() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173yxkig8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testLargeBufferedRead_RequiredCharsets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173yxkig8a() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21034);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21035);for (final String csName : getRequiredCharsetNames()) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(21036);testBufferedRead(LARGE_TEST_STRING, csName);
        }
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testLargeBufferedRead_UTF8() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vqmwxzg8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testLargeBufferedRead_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vqmwxzg8d() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21037);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21038);testBufferedRead(LARGE_TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testLargeSingleByteRead_RequiredCharsets() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1suy48tg8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testLargeSingleByteRead_RequiredCharsets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1suy48tg8f() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21039);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21040);for (final String csName : getRequiredCharsetNames()) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(21041);testSingleByteRead(LARGE_TEST_STRING, csName);
        }
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testLargeSingleByteRead_UTF8() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1ki8og8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testLargeSingleByteRead_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1ki8og8i() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21042);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21043);testSingleByteRead(LARGE_TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    // This test is broken for charsets that don't create a single byte for each char
    private void testMarkReset(final String csName) throws Exception {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21044);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(21045);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1g5kg5kkylve2py.R.inc(21046);}};InputStream r = new CharSequenceInputStream("test", csName)) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(21047);assertEquals(2, r.skip(2));
            __CLR4_4_1g5kg5kkylve2py.R.inc(21048);r.mark(0);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21049);assertEquals('s', r.read(), csName);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21050);assertEquals('t', r.read(), csName);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21051);assertEquals(-1, r.read(), csName);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21052);r.reset();
            __CLR4_4_1g5kg5kkylve2py.R.inc(21053);assertEquals('s', r.read(), csName);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21054);assertEquals('t', r.read(), csName);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21055);assertEquals(-1, r.read(), csName);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21056);r.reset();
            __CLR4_4_1g5kg5kkylve2py.R.inc(21057);r.reset();
        }
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    @Disabled // Test broken for charsets that create multiple bytes for a single char
    public void testMarkReset_RequiredCharsets() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pa3k4g8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testMarkReset_RequiredCharsets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pa3k4g8y() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21058);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21059);for (final String csName : getRequiredCharsetNames()) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(21060);testMarkReset(csName);
        }
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testMarkReset_USASCII() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wocw6jg91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testMarkReset_USASCII",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wocw6jg91() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21061);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21062);testMarkReset("US-ASCII");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testMarkReset_UTF8() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1eo4ng93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testMarkReset_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1eo4ng93() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21063);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21064);testMarkReset("UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testMarkSupported() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q660feg95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testMarkSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q660feg95() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21065);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(21066);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1g5kg5kkylve2py.R.inc(21067);}};InputStream r = new CharSequenceInputStream("test", "UTF-8")) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(21068);assertTrue(r.markSupported());
        }
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private void testReadZero(final String csName) throws Exception {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21069);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(21070);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1g5kg5kkylve2py.R.inc(21071);}};InputStream r = new CharSequenceInputStream("test", csName)) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(21072);final byte[] bytes = new byte[30];
            __CLR4_4_1g5kg5kkylve2py.R.inc(21073);assertEquals(0, r.read(bytes, 0, 0));
        }
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testReadZero_EmptyString() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bl1z1mg9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testReadZero_EmptyString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bl1z1mg9e() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21074);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(21075);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1g5kg5kkylve2py.R.inc(21076);}};InputStream r = new CharSequenceInputStream("", "UTF-8")) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(21077);final byte[] bytes = new byte[30];
            __CLR4_4_1g5kg5kkylve2py.R.inc(21078);assertEquals(0, r.read(bytes, 0, 0));
        }
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testReadZero_RequiredCharsets() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8yfssg9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testReadZero_RequiredCharsets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8yfssg9j() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21079);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21080);for (final String csName : getRequiredCharsetNames()) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(21081);testReadZero(csName);
        }
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private void testSingleByteRead(final String testString, final String charsetName) throws IOException {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21082);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21083);final byte[] bytes = testString.getBytes(charsetName);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(21084);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1g5kg5kkylve2py.R.inc(21085);}};InputStream in = new CharSequenceInputStream(testString, charsetName, 512)) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(21086);for (final byte b : bytes) {{
                __CLR4_4_1g5kg5kkylve2py.R.inc(21087);final int read = in.read();
                __CLR4_4_1g5kg5kkylve2py.R.inc(21088);assertTrue(read >= 0, "read " + read + " >=0 ");
                __CLR4_4_1g5kg5kkylve2py.R.inc(21089);assertTrue(read <= 255, "read " + read + " <= 255");
                __CLR4_4_1g5kg5kkylve2py.R.inc(21090);assertEquals(b, (byte) read, "Should agree with input");
            }
            }__CLR4_4_1g5kg5kkylve2py.R.inc(21091);assertEquals(-1, in.read());
        }
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testSingleByteRead_RequiredCharsets() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkdhkkg9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testSingleByteRead_RequiredCharsets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkdhkkg9w() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21092);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21093);for (final String csName : getRequiredCharsetNames()) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(21094);testSingleByteRead(TEST_STRING, csName);
        }
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testSingleByteRead_UTF16() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pntbscg9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testSingleByteRead_UTF16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pntbscg9z() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21095);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21096);testSingleByteRead(TEST_STRING, "UTF-16");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testSingleByteRead_UTF8() throws IOException {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhin33ga1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testSingleByteRead_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhin33ga1() throws IOException{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21097);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21098);testSingleByteRead(TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    // This is broken for charsets that don't map each char to a byte
    private void testSkip(final String csName) throws Exception {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21099);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(21100);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1g5kg5kkylve2py.R.inc(21101);}};InputStream r = new CharSequenceInputStream("test", csName)) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(21102);assertEquals(1, r.skip(1));
            __CLR4_4_1g5kg5kkylve2py.R.inc(21103);assertEquals(2, r.skip(2));
            __CLR4_4_1g5kg5kkylve2py.R.inc(21104);assertEquals('t', r.read(), csName);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21105);r.skip(100);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21106);assertEquals(-1, r.read(), csName);
        }
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    @Disabled // test is broken for charsets that generate multiple bytes per char.
    public void testSkip_RequiredCharsets() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0ut23gab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testSkip_RequiredCharsets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0ut23gab() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21107);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21108);for (final String csName : getRequiredCharsetNames()) {{
            __CLR4_4_1g5kg5kkylve2py.R.inc(21109);testSkip(csName);
        }
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testSkip_USASCII() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlaej8gae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testSkip_USASCII",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlaej8gae() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21110);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21111);testSkip("US-ASCII");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testSkip_UTF8() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ubw3qgag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testSkip_UTF8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ubw3qgag() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21112);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21113);testSkip("UTF-8");
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private int checkAvail(final InputStream is, final int min) throws Exception {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21114);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21115);final int available = is.available();
        __CLR4_4_1g5kg5kkylve2py.R.inc(21116);assertTrue(available >= min, "avail should be >= " + min + ", but was " + available);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21117);return available;
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private void testAvailableSkip(final String csName) throws Exception {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21118);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21119);final String input = "test";
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(21120);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1g5kg5kkylve2py.R.inc(21121);}};InputStream r = new CharSequenceInputStream(input, csName)) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(21122);int available = checkAvail(r, input.length());
            __CLR4_4_1g5kg5kkylve2py.R.inc(21123);assertEquals(available - 1, r.skip(available - 1)); // skip all but one
            __CLR4_4_1g5kg5kkylve2py.R.inc(21124);available = checkAvail(r, 1);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21125);assertEquals(1, r.skip(1));
            __CLR4_4_1g5kg5kkylve2py.R.inc(21126);available = checkAvail(r, 0);
        }
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private void testAvailableRead(final String csName) throws Exception {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21127);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21128);final String input = "test";
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1g5kg5kkylve2py.R.inc(21129);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1g5kg5kkylve2py.R.inc(21130);}};InputStream r = new CharSequenceInputStream(input, csName)) {
            __CLR4_4_1g5kg5kkylve2py.R.inc(21131);int available = checkAvail(r, input.length());
            __CLR4_4_1g5kg5kkylve2py.R.inc(21132);assertEquals(available - 1, r.skip(available - 1)); // skip all but one
            __CLR4_4_1g5kg5kkylve2py.R.inc(21133);available = checkAvail(r, 1);
            __CLR4_4_1g5kg5kkylve2py.R.inc(21134);final byte[] buff = new byte[available];
            __CLR4_4_1g5kg5kkylve2py.R.inc(21135);assertEquals(available, r.read(buff, 0, available));
        }
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    @Test
    public void testAvailable() throws Exception {__CLR4_4_1g5kg5kkylve2py.R.globalSliceStart(getClass().getName(),21136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1jlmqgb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g5kg5kkylve2py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g5kg5kkylve2py.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharSequenceInputStreamTest.testAvailable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1jlmqgb4() throws Exception{try{__CLR4_4_1g5kg5kkylve2py.R.inc(21136);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21137);for (final String csName : Charset.availableCharsets().keySet()) {{
            // prevent java.lang.UnsupportedOperationException at sun.nio.cs.ext.ISO2022_CN.newEncoder.
            // also try and avoid the following Effor on Continuum
//            java.lang.UnsupportedOperationException: null
//            at java.nio.CharBuffer.array(CharBuffer.java:940)
//            at sun.nio.cs.ext.COMPOUND_TEXT_Encoder.encodeLoop(COMPOUND_TEXT_Encoder.java:75)
//            at java.nio.charset.CharsetEncoder.encode(CharsetEncoder.java:544)
//            at org.apache.commons.io.input.CharSequenceInputStream.fillBuffer(CharSequenceInputStream.java:120)
//            at org.apache.commons.io.input.CharSequenceInputStream.read(CharSequenceInputStream.java:151)
//            at org.apache.commons.io.input.CharSequenceInputStreamTest.testAvailableRead(CharSequenceInputStreamTest.java:412)
//            at org.apache.commons.io.input.CharSequenceInputStreamTest.testAvailable(CharSequenceInputStreamTest.java:424)

            __CLR4_4_1g5kg5kkylve2py.R.inc(21138);try {
                __CLR4_4_1g5kg5kkylve2py.R.inc(21139);if ((((isAvailabilityTestableForCharset(csName))&&(__CLR4_4_1g5kg5kkylve2py.R.iget(21140)!=0|true))||(__CLR4_4_1g5kg5kkylve2py.R.iget(21141)==0&false))) {{
                    __CLR4_4_1g5kg5kkylve2py.R.inc(21142);testAvailableSkip(csName);
                    __CLR4_4_1g5kg5kkylve2py.R.inc(21143);testAvailableRead(csName);
                }
            }} catch (final UnsupportedOperationException e){
                __CLR4_4_1g5kg5kkylve2py.R.inc(21144);fail("Operation not supported for " + csName);
            }
        }
    }}finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private boolean isAvailabilityTestableForCharset(final String csName) {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21145);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21146);return Charset.forName(csName).canEncode()
                && !"COMPOUND_TEXT".equalsIgnoreCase(csName) && !"x-COMPOUND_TEXT".equalsIgnoreCase(csName)
                && !isOddBallLegacyCharsetThatDoesNotSupportFrenchCharacters(csName);
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}

    private boolean isOddBallLegacyCharsetThatDoesNotSupportFrenchCharacters(final String csName) {try{__CLR4_4_1g5kg5kkylve2py.R.inc(21147);
        __CLR4_4_1g5kg5kkylve2py.R.inc(21148);return "x-IBM1388".equalsIgnoreCase(csName) ||
                "ISO-2022-CN".equalsIgnoreCase(csName) ||
                "ISO-2022-JP".equalsIgnoreCase(csName) ||
                "Shift_JIS".equalsIgnoreCase(csName);
    }finally{__CLR4_4_1g5kg5kkylve2py.R.flushNeeded();}}
}
