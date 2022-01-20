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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class ReaderInputStreamTest {static class __CLR4_4_1hdvhdvkylve30q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22606,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String TEST_STRING = "\u00e0 peine arriv\u00e9s nous entr\u00e2mes dans sa chambre";
    private static final String LARGE_TEST_STRING;

    static {try{__CLR4_4_1hdvhdvkylve30q.R.inc(22531);
        __CLR4_4_1hdvhdvkylve30q.R.inc(22532);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_1hdvhdvkylve30q.R.inc(22533);for (int i=0; (((i<100)&&(__CLR4_4_1hdvhdvkylve30q.R.iget(22534)!=0|true))||(__CLR4_4_1hdvhdvkylve30q.R.iget(22535)==0&false)); i++) {{
            __CLR4_4_1hdvhdvkylve30q.R.inc(22536);buffer.append(TEST_STRING);
        }
        }__CLR4_4_1hdvhdvkylve30q.R.inc(22537);LARGE_TEST_STRING = buffer.toString();
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    private final Random random = new Random();

    private void testWithSingleByteRead(final String testString, final String charsetName) throws IOException {try{__CLR4_4_1hdvhdvkylve30q.R.inc(22538);
        __CLR4_4_1hdvhdvkylve30q.R.inc(22539);final byte[] bytes = testString.getBytes(charsetName);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hdvhdvkylve30q.R.inc(22540);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1hdvhdvkylve30q.R.inc(22541);}};final ReaderInputStream in = new ReaderInputStream(new StringReader(testString), charsetName)) {
            __CLR4_4_1hdvhdvkylve30q.R.inc(22542);for (final byte b : bytes) {{
                __CLR4_4_1hdvhdvkylve30q.R.inc(22543);final int read = in.read();
                __CLR4_4_1hdvhdvkylve30q.R.inc(22544);assertTrue(read >= 0);
                __CLR4_4_1hdvhdvkylve30q.R.inc(22545);assertTrue(read <= 255);
                __CLR4_4_1hdvhdvkylve30q.R.inc(22546);assertEquals(b, (byte) read);
            }
            }__CLR4_4_1hdvhdvkylve30q.R.inc(22547);assertEquals(-1, in.read());
        }
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    private void testWithBufferedRead(final String testString, final String charsetName) throws IOException {try{__CLR4_4_1hdvhdvkylve30q.R.inc(22548);
        __CLR4_4_1hdvhdvkylve30q.R.inc(22549);final byte[] expected = testString.getBytes(charsetName);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hdvhdvkylve30q.R.inc(22550);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1hdvhdvkylve30q.R.inc(22551);}};final ReaderInputStream in = new ReaderInputStream(new StringReader(testString), charsetName)) {
            __CLR4_4_1hdvhdvkylve30q.R.inc(22552);final byte[] buffer = new byte[128];
            __CLR4_4_1hdvhdvkylve30q.R.inc(22553);int offset = 0;
            __CLR4_4_1hdvhdvkylve30q.R.inc(22554);while (true) {{
                __CLR4_4_1hdvhdvkylve30q.R.inc(22555);int bufferOffset = random.nextInt(64);
                __CLR4_4_1hdvhdvkylve30q.R.inc(22556);final int bufferLength = random.nextInt(64);
                __CLR4_4_1hdvhdvkylve30q.R.inc(22557);int read = in.read(buffer, bufferOffset, bufferLength);
                __CLR4_4_1hdvhdvkylve30q.R.inc(22558);if ((((read == -1)&&(__CLR4_4_1hdvhdvkylve30q.R.iget(22559)!=0|true))||(__CLR4_4_1hdvhdvkylve30q.R.iget(22560)==0&false))) {{
                    __CLR4_4_1hdvhdvkylve30q.R.inc(22561);assertEquals(offset, expected.length);
                    __CLR4_4_1hdvhdvkylve30q.R.inc(22562);break;
                }
                }__CLR4_4_1hdvhdvkylve30q.R.inc(22563);assertTrue(read <= bufferLength);
                __CLR4_4_1hdvhdvkylve30q.R.inc(22564);while ((((read > 0)&&(__CLR4_4_1hdvhdvkylve30q.R.iget(22565)!=0|true))||(__CLR4_4_1hdvhdvkylve30q.R.iget(22566)==0&false))) {{
                    __CLR4_4_1hdvhdvkylve30q.R.inc(22567);assertTrue(offset < expected.length);
                    __CLR4_4_1hdvhdvkylve30q.R.inc(22568);assertEquals(expected[offset], buffer[bufferOffset]);
                    __CLR4_4_1hdvhdvkylve30q.R.inc(22569);offset++;
                    __CLR4_4_1hdvhdvkylve30q.R.inc(22570);bufferOffset++;
                    __CLR4_4_1hdvhdvkylve30q.R.inc(22571);read--;
                }
            }}
        }}
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    @Test
    public void testUTF8WithSingleByteRead() throws IOException {__CLR4_4_1hdvhdvkylve30q.R.globalSliceStart(getClass().getName(),22572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16nqa2yhf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdvhdvkylve30q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdvhdvkylve30q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReaderInputStreamTest.testUTF8WithSingleByteRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16nqa2yhf0() throws IOException{try{__CLR4_4_1hdvhdvkylve30q.R.inc(22572);
        __CLR4_4_1hdvhdvkylve30q.R.inc(22573);testWithSingleByteRead(TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    @Test
    public void testLargeUTF8WithSingleByteRead() throws IOException {__CLR4_4_1hdvhdvkylve30q.R.globalSliceStart(getClass().getName(),22574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sg8osthf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdvhdvkylve30q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdvhdvkylve30q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReaderInputStreamTest.testLargeUTF8WithSingleByteRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sg8osthf2() throws IOException{try{__CLR4_4_1hdvhdvkylve30q.R.inc(22574);
        __CLR4_4_1hdvhdvkylve30q.R.inc(22575);testWithSingleByteRead(LARGE_TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    @Test
    public void testUTF8WithBufferedRead() throws IOException {__CLR4_4_1hdvhdvkylve30q.R.globalSliceStart(getClass().getName(),22576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gktv7fhf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdvhdvkylve30q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdvhdvkylve30q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReaderInputStreamTest.testUTF8WithBufferedRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gktv7fhf4() throws IOException{try{__CLR4_4_1hdvhdvkylve30q.R.inc(22576);
        __CLR4_4_1hdvhdvkylve30q.R.inc(22577);testWithBufferedRead(TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    @Test
    public void testLargeUTF8WithBufferedRead() throws IOException {__CLR4_4_1hdvhdvkylve30q.R.globalSliceStart(getClass().getName(),22578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ridh98hf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdvhdvkylve30q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdvhdvkylve30q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReaderInputStreamTest.testLargeUTF8WithBufferedRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ridh98hf6() throws IOException{try{__CLR4_4_1hdvhdvkylve30q.R.inc(22578);
        __CLR4_4_1hdvhdvkylve30q.R.inc(22579);testWithBufferedRead(LARGE_TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    @Test
    public void testUTF16WithSingleByteRead() throws IOException {__CLR4_4_1hdvhdvkylve30q.R.globalSliceStart(getClass().getName(),22580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llo8r1hf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdvhdvkylve30q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdvhdvkylve30q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReaderInputStreamTest.testUTF16WithSingleByteRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llo8r1hf8() throws IOException{try{__CLR4_4_1hdvhdvkylve30q.R.inc(22580);
        __CLR4_4_1hdvhdvkylve30q.R.inc(22581);testWithSingleByteRead(TEST_STRING, "UTF-16");
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testReadZero() throws Exception {__CLR4_4_1hdvhdvkylve30q.R.globalSliceStart(getClass().getName(),22582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tg8hufhfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdvhdvkylve30q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdvhdvkylve30q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReaderInputStreamTest.testReadZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tg8hufhfa() throws Exception{try{__CLR4_4_1hdvhdvkylve30q.R.inc(22582);
        __CLR4_4_1hdvhdvkylve30q.R.inc(22583);final String inStr = "test";
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hdvhdvkylve30q.R.inc(22584);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1hdvhdvkylve30q.R.inc(22585);}};final ReaderInputStream inputStream = new ReaderInputStream(new StringReader(inStr))) {
            __CLR4_4_1hdvhdvkylve30q.R.inc(22586);final byte[] bytes = new byte[30];
            __CLR4_4_1hdvhdvkylve30q.R.inc(22587);assertEquals(0, inputStream.read(bytes, 0, 0));
            __CLR4_4_1hdvhdvkylve30q.R.inc(22588);assertEquals(inStr.length(), inputStream.read(bytes, 0, inStr.length() + 1));
            // Should always return 0 for length == 0
            __CLR4_4_1hdvhdvkylve30q.R.inc(22589);assertEquals(0, inputStream.read(bytes, 0, 0));
        }
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testReadZeroEmptyString() throws Exception {__CLR4_4_1hdvhdvkylve30q.R.globalSliceStart(getClass().getName(),22590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxilt7hfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdvhdvkylve30q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdvhdvkylve30q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReaderInputStreamTest.testReadZeroEmptyString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxilt7hfi() throws Exception{try{__CLR4_4_1hdvhdvkylve30q.R.inc(22590);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hdvhdvkylve30q.R.inc(22591);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1hdvhdvkylve30q.R.inc(22592);}};final ReaderInputStream inputStream = new ReaderInputStream(new StringReader(""))) {
            __CLR4_4_1hdvhdvkylve30q.R.inc(22593);final byte[] bytes = new byte[30];
            // Should always return 0 for length == 0
            __CLR4_4_1hdvhdvkylve30q.R.inc(22594);assertEquals(0, inputStream.read(bytes, 0, 0));
            __CLR4_4_1hdvhdvkylve30q.R.inc(22595);assertEquals(-1, inputStream.read(bytes, 0, 1));
            __CLR4_4_1hdvhdvkylve30q.R.inc(22596);assertEquals(0, inputStream.read(bytes, 0, 0));
            __CLR4_4_1hdvhdvkylve30q.R.inc(22597);assertEquals(-1, inputStream.read(bytes, 0, 1));
        }
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}

    /*
     * Tests https://issues.apache.org/jira/browse/IO-277
     */
    @Test
    public void testCharsetMismatchInfiniteLoop() throws IOException {__CLR4_4_1hdvhdvkylve30q.R.globalSliceStart(getClass().getName(),22598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11cr43rhfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdvhdvkylve30q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdvhdvkylve30q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReaderInputStreamTest.testCharsetMismatchInfiniteLoop",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11cr43rhfq() throws IOException{try{__CLR4_4_1hdvhdvkylve30q.R.inc(22598);
        // Input is UTF-8 bytes: 0xE0 0xB2 0xA0
        __CLR4_4_1hdvhdvkylve30q.R.inc(22599);final char[] inputChars = { (char) 0xE0, (char) 0xB2, (char) 0xA0 };
        // Charset charset = Charset.forName("UTF-8"); // works
        __CLR4_4_1hdvhdvkylve30q.R.inc(22600);final Charset charset = StandardCharsets.US_ASCII; // infinite loop
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hdvhdvkylve30q.R.inc(22601);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1hdvhdvkylve30q.R.inc(22602);}};ReaderInputStream stream = new ReaderInputStream(new CharArrayReader(inputChars), charset)) {
            __CLR4_4_1hdvhdvkylve30q.R.inc(22603);while ((((stream.read() != -1)&&(__CLR4_4_1hdvhdvkylve30q.R.iget(22604)!=0|true))||(__CLR4_4_1hdvhdvkylve30q.R.iget(22605)==0&false))) {{
            }
        }}
    }finally{__CLR4_4_1hdvhdvkylve30q.R.flushNeeded();}}
}
