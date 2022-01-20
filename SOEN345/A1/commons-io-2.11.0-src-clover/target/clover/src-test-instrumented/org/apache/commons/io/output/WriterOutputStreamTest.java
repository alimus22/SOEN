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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class WriterOutputStreamTest {static class __CLR4_4_1l2sl2skylve3q5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,27388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String TEST_STRING = "\u00e0 peine arriv\u00e9s nous entr\u00e2mes dans sa chambre";
    private static final String LARGE_TEST_STRING;

    static {try{__CLR4_4_1l2sl2skylve3q5.R.inc(27316);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27317);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_1l2sl2skylve3q5.R.inc(27318);for (int i=0; (((i<100)&&(__CLR4_4_1l2sl2skylve3q5.R.iget(27319)!=0|true))||(__CLR4_4_1l2sl2skylve3q5.R.iget(27320)==0&false)); i++) {{
            __CLR4_4_1l2sl2skylve3q5.R.inc(27321);buffer.append(TEST_STRING);
        }
        }__CLR4_4_1l2sl2skylve3q5.R.inc(27322);LARGE_TEST_STRING = buffer.toString();
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    private final Random random = new Random();

    private void testWithSingleByteWrite(final String testString, final String charsetName) throws IOException {try{__CLR4_4_1l2sl2skylve3q5.R.inc(27323);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27324);final byte[] bytes = testString.getBytes(charsetName);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27325);final StringWriter writer = new StringWriter();
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l2sl2skylve3q5.R.inc(27326);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1l2sl2skylve3q5.R.inc(27327);}};final WriterOutputStream out = new WriterOutputStream(writer, charsetName)) {
            __CLR4_4_1l2sl2skylve3q5.R.inc(27328);for (final byte b : bytes) {{
                __CLR4_4_1l2sl2skylve3q5.R.inc(27329);out.write(b);
            }
        }}
        __CLR4_4_1l2sl2skylve3q5.R.inc(27330);assertEquals(testString, writer.toString());
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    private void testWithBufferedWrite(final String testString, final String charsetName) throws IOException {try{__CLR4_4_1l2sl2skylve3q5.R.inc(27331);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27332);final byte[] expected = testString.getBytes(charsetName);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27333);final StringWriter writer = new StringWriter();
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l2sl2skylve3q5.R.inc(27334);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1l2sl2skylve3q5.R.inc(27335);}};final WriterOutputStream out = new WriterOutputStream(writer, charsetName)) {
            __CLR4_4_1l2sl2skylve3q5.R.inc(27336);int offset = 0;
            __CLR4_4_1l2sl2skylve3q5.R.inc(27337);while ((((offset < expected.length)&&(__CLR4_4_1l2sl2skylve3q5.R.iget(27338)!=0|true))||(__CLR4_4_1l2sl2skylve3q5.R.iget(27339)==0&false))) {{
                __CLR4_4_1l2sl2skylve3q5.R.inc(27340);final int length = Math.min(random.nextInt(128), expected.length - offset);
                __CLR4_4_1l2sl2skylve3q5.R.inc(27341);out.write(expected, offset, length);
                __CLR4_4_1l2sl2skylve3q5.R.inc(27342);offset += length;
            }
        }}
        __CLR4_4_1l2sl2skylve3q5.R.inc(27343);assertEquals(testString, writer.toString());
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testUTF8WithSingleByteWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ubw8jl3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testUTF8WithSingleByteWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ubw8jl3k() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27344);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27345);testWithSingleByteWrite(TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testLargeUTF8WithSingleByteWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k43bh2l3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testLargeUTF8WithSingleByteWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k43bh2l3m() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27346);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27347);testWithSingleByteWrite(LARGE_TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testUTF8WithBufferedWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7yv6ql3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testUTF8WithBufferedWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7yv6ql3o() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27348);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27349);testWithBufferedWrite(TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testLargeUTF8WithBufferedWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191s6e1l3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testLargeUTF8WithBufferedWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191s6e1l3q() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27350);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27351);testWithBufferedWrite(LARGE_TEST_STRING, "UTF-8");
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testUTF16WithSingleByteWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvtnval3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testUTF16WithSingleByteWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvtnval3s() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27352);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27353);try {
            __CLR4_4_1l2sl2skylve3q5.R.inc(27354);testWithSingleByteWrite(TEST_STRING, "UTF-16");
        } catch (final UnsupportedOperationException e){
            __CLR4_4_1l2sl2skylve3q5.R.inc(27355);if ((((!System.getProperty("java.vendor").contains("IBM"))&&(__CLR4_4_1l2sl2skylve3q5.R.iget(27356)!=0|true))||(__CLR4_4_1l2sl2skylve3q5.R.iget(27357)==0&false))){{
                __CLR4_4_1l2sl2skylve3q5.R.inc(27358);fail("This test should only throw UOE on IBM JDKs with broken UTF-16");
            }
        }}
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testUTF16WithBufferedWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dn4zjbl3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testUTF16WithBufferedWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dn4zjbl3z() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27359);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27360);try {
            __CLR4_4_1l2sl2skylve3q5.R.inc(27361);testWithBufferedWrite(TEST_STRING, "UTF-16");
        } catch (final UnsupportedOperationException e) {
            __CLR4_4_1l2sl2skylve3q5.R.inc(27362);if ((((!System.getProperty("java.vendor").contains("IBM"))&&(__CLR4_4_1l2sl2skylve3q5.R.iget(27363)!=0|true))||(__CLR4_4_1l2sl2skylve3q5.R.iget(27364)==0&false))) {{
                __CLR4_4_1l2sl2skylve3q5.R.inc(27365);fail("This test should only throw UOE on IBM JDKs with broken UTF-16");
            }
        }}
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testUTF16BEWithSingleByteWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rowca5l46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testUTF16BEWithSingleByteWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rowca5l46() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27366);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27367);testWithSingleByteWrite(TEST_STRING, "UTF-16BE");
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testUTF16BEWithBufferedWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1uuqkl48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testUTF16BEWithBufferedWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1uuqkl48() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27368);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27369);testWithBufferedWrite(TEST_STRING, "UTF-16BE");
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testUTF16LEWithSingleByteWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tk9s2rl4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testUTF16LEWithSingleByteWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tk9s2rl4a() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27370);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27371);testWithSingleByteWrite(TEST_STRING, "UTF-16LE");
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testUTF16LEWithBufferedWrite() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b2s10ul4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testUTF16LEWithBufferedWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b2s10ul4c() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27372);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27373);testWithBufferedWrite(TEST_STRING, "UTF-16LE");
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}


    @Test
    public void testFlush() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqzdztl4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testFlush",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqzdztl4e() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27374);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27375);final StringWriter writer = new StringWriter();
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l2sl2skylve3q5.R.inc(27376);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1l2sl2skylve3q5.R.inc(27377);}};final WriterOutputStream out = new WriterOutputStream(writer, "us-ascii", 1024, false)) {
            __CLR4_4_1l2sl2skylve3q5.R.inc(27378);out.write("abc".getBytes(StandardCharsets.US_ASCII));
            __CLR4_4_1l2sl2skylve3q5.R.inc(27379);assertEquals(0, writer.getBuffer().length());
            __CLR4_4_1l2sl2skylve3q5.R.inc(27380);out.flush();
            __CLR4_4_1l2sl2skylve3q5.R.inc(27381);assertEquals("abc", writer.toString());
        }
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}

    @Test
    public void testWriteImmediately() throws IOException {__CLR4_4_1l2sl2skylve3q5.R.globalSliceStart(getClass().getName(),27382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ktue0ol4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l2sl2skylve3q5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l2sl2skylve3q5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.WriterOutputStreamTest.testWriteImmediately",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ktue0ol4m() throws IOException{try{__CLR4_4_1l2sl2skylve3q5.R.inc(27382);
        __CLR4_4_1l2sl2skylve3q5.R.inc(27383);final StringWriter writer = new StringWriter();
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l2sl2skylve3q5.R.inc(27384);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1l2sl2skylve3q5.R.inc(27385);}};final WriterOutputStream out = new WriterOutputStream(writer, "us-ascii", 1024, true)) {
            __CLR4_4_1l2sl2skylve3q5.R.inc(27386);out.write("abc".getBytes(StandardCharsets.US_ASCII));
            __CLR4_4_1l2sl2skylve3q5.R.inc(27387);assertEquals("abc", writer.toString());
        }
    }finally{__CLR4_4_1l2sl2skylve3q5.R.flushNeeded();}}
}
