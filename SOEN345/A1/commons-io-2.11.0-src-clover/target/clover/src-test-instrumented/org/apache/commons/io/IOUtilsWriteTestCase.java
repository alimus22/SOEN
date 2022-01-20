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
package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.test.TestUtils;
import org.apache.commons.io.test.ThrowOnFlushAndCloseOutputStream;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for IOUtils write methods.
 *
 * @see IOUtils
 */
@SuppressWarnings("deprecation") // includes tests for deprecated methods
public class IOUtilsWriteTestCase {static class __CLR4_4_1cp0cp0kylve200{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,16867,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int FILE_SIZE = 1024 * 4 + 1;

    private final byte[] inData = TestUtils.generateTestData(FILE_SIZE);

    @Test
    public void testWrite_byteArrayToOutputStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141vrmqcp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141vrmqcp0() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16452);
        __CLR4_4_1cp0cp0kylve200.R.inc(16453);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16454);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16455);IOUtils.write(inData, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16456);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16457);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16458);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16459);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_byteArrayToOutputStream_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9es1wcp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToOutputStream_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9es1wcp8() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16460);
        __CLR4_4_1cp0cp0kylve200.R.inc(16461);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16462);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16463);IOUtils.write((byte[]) null, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16464);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16465);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16466);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_byteArrayToOutputStream_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xktzqmcpf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToOutputStream_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xktzqmcpf() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16467);
        __CLR4_4_1cp0cp0kylve200.R.inc(16468);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16469);IOUtils.write(inData, (OutputStream) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16470);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_byteArrayToWriter() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1398ioccpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1398ioccpj() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16471);
        __CLR4_4_1cp0cp0kylve200.R.inc(16472);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16473);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16474);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16475);IOUtils.write(inData, writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16476);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16477);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16478);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16479);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_byteArrayToWriter_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1alzg9icps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToWriter_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1alzg9icps() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16480);
        __CLR4_4_1cp0cp0kylve200.R.inc(16481);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16482);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16483);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16484);IOUtils.write((byte[]) null, writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16485);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16486);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16487);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_byteArrayToWriter_nullWriter() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16nbu5cq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToWriter_nullWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16nbu5cq0() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16488);
        __CLR4_4_1cp0cp0kylve200.R.inc(16489);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16490);IOUtils.write(inData, (Writer) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16491);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_byteArrayToWriter_Encoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbav64cq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToWriter_Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbav64cq4() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16492);
        __CLR4_4_1cp0cp0kylve200.R.inc(16493);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16494);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16495);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16496);IOUtils.write(inData, writer, "UTF8");
        __CLR4_4_1cp0cp0kylve200.R.inc(16497);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16498);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16499);byte[] bytes = baout.toByteArray();
        __CLR4_4_1cp0cp0kylve200.R.inc(16500);bytes = new String(bytes, StandardCharsets.UTF_8).getBytes(StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16501);assertArrayEquals(inData, bytes, "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_byteArrayToWriter_Encoding_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5lb0ycqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToWriter_Encoding_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5lb0ycqe() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16502);
        __CLR4_4_1cp0cp0kylve200.R.inc(16503);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16504);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16505);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16506);IOUtils.write(null, writer, "UTF8");
        __CLR4_4_1cp0cp0kylve200.R.inc(16507);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16508);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16509);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_byteArrayToWriter_Encoding_nullWriter() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xrgewrcqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToWriter_Encoding_nullWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xrgewrcqm() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16510);
        __CLR4_4_1cp0cp0kylve200.R.inc(16511);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16512);IOUtils.write(inData, null, "UTF8");
            __CLR4_4_1cp0cp0kylve200.R.inc(16513);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_byteArrayToWriter_Encoding_nullEncoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzx691cqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_byteArrayToWriter_Encoding_nullEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzx691cqq() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16514);
        __CLR4_4_1cp0cp0kylve200.R.inc(16515);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16516);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16517);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16518);IOUtils.write(inData, writer, (String) null);
        __CLR4_4_1cp0cp0kylve200.R.inc(16519);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16520);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16521);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16522);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToOutputStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2hflgcqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2hflgcqz() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16523);
        __CLR4_4_1cp0cp0kylve200.R.inc(16524);final CharSequence csq = new StringBuilder(new String(inData, StandardCharsets.US_ASCII));

        __CLR4_4_1cp0cp0kylve200.R.inc(16525);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16526);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16527);IOUtils.write(csq, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16528);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16529);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16530);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16531);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToOutputStream_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1htvjhqcr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToOutputStream_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1htvjhqcr8() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16532);
        __CLR4_4_1cp0cp0kylve200.R.inc(16533);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16534);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16535);IOUtils.write((CharSequence) null, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16536);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16537);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16538);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToOutputStream_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196ejqgcrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToOutputStream_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196ejqgcrf() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16539);
        __CLR4_4_1cp0cp0kylve200.R.inc(16540);final CharSequence csq = new StringBuilder(new String(inData, StandardCharsets.US_ASCII));
        __CLR4_4_1cp0cp0kylve200.R.inc(16541);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16542);IOUtils.write(csq, (OutputStream) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16543);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToOutputStream_Encoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143erxwcrk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToOutputStream_Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143erxwcrk() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16544);
        __CLR4_4_1cp0cp0kylve200.R.inc(16545);final CharSequence csq = new StringBuilder(new String(inData, StandardCharsets.US_ASCII));

        __CLR4_4_1cp0cp0kylve200.R.inc(16546);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16547);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16548);IOUtils.write(csq, out, "UTF16");
        __CLR4_4_1cp0cp0kylve200.R.inc(16549);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16550);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16551);byte[] bytes = baout.toByteArray();
        __CLR4_4_1cp0cp0kylve200.R.inc(16552);bytes = new String(bytes, StandardCharsets.UTF_16).getBytes(StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16553);assertArrayEquals(inData, bytes, "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToOutputStream_Encoding_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19yh1g6cru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToOutputStream_Encoding_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19yh1g6cru() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16554);
        __CLR4_4_1cp0cp0kylve200.R.inc(16555);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16556);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16557);IOUtils.write((CharSequence) null, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16558);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16559);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16560);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToOutputStream_Encoding_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pujo3kcs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToOutputStream_Encoding_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pujo3kcs1() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16561);
        __CLR4_4_1cp0cp0kylve200.R.inc(16562);final CharSequence csq = new StringBuilder(new String(inData, StandardCharsets.US_ASCII));
        __CLR4_4_1cp0cp0kylve200.R.inc(16563);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16564);IOUtils.write(csq, (OutputStream) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16565);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToOutputStream_nullEncoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd22e3cs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToOutputStream_nullEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd22e3cs6() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16566);
        __CLR4_4_1cp0cp0kylve200.R.inc(16567);final CharSequence csq = new StringBuilder(new String(inData, StandardCharsets.US_ASCII));

        __CLR4_4_1cp0cp0kylve200.R.inc(16568);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16569);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16570);IOUtils.write(csq, out, (String) null);
        __CLR4_4_1cp0cp0kylve200.R.inc(16571);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16572);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16573);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16574);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToWriter() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xb0dlucsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xb0dlucsf() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16575);
        __CLR4_4_1cp0cp0kylve200.R.inc(16576);final CharSequence csq = new StringBuilder(new String(inData, StandardCharsets.US_ASCII));

        __CLR4_4_1cp0cp0kylve200.R.inc(16577);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16578);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16579);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16580);IOUtils.write(csq, writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16581);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16582);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16583);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16584);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToWriter_Encoding_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140t16kcsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToWriter_Encoding_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140t16kcsp() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16585);
        __CLR4_4_1cp0cp0kylve200.R.inc(16586);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16587);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16588);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16589);IOUtils.write((CharSequence) null, writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16590);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16591);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16592);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charSequenceToWriter_Encoding_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwxsvicsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charSequenceToWriter_Encoding_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwxsvicsx() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16593);
        __CLR4_4_1cp0cp0kylve200.R.inc(16594);final CharSequence csq = new StringBuilder(new String(inData, StandardCharsets.US_ASCII));
        __CLR4_4_1cp0cp0kylve200.R.inc(16595);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16596);IOUtils.write(csq, (Writer) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16597);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToOutputStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ez47l2ct2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ez47l2ct2() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16598);
        __CLR4_4_1cp0cp0kylve200.R.inc(16599);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16600);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16601);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16602);IOUtils.write(str, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16603);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16604);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16605);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16606);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToOutputStream_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hawj08ctb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToOutputStream_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hawj08ctb() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16607);
        __CLR4_4_1cp0cp0kylve200.R.inc(16608);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16609);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16610);IOUtils.write((String) null, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16611);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16612);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16613);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToOutputStream_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w376hacti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToOutputStream_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w376hacti() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16614);
        __CLR4_4_1cp0cp0kylve200.R.inc(16615);final String str = new String(inData, StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16616);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16617);IOUtils.write(str, (OutputStream) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16618);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToOutputStream_Encoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vsx7jactn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToOutputStream_Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vsx7jactn() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16619);
        __CLR4_4_1cp0cp0kylve200.R.inc(16620);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16621);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16622);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16623);IOUtils.write(str, out, "UTF16");
        __CLR4_4_1cp0cp0kylve200.R.inc(16624);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16625);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16626);byte[] bytes = baout.toByteArray();
        __CLR4_4_1cp0cp0kylve200.R.inc(16627);bytes = new String(bytes, StandardCharsets.UTF_16).getBytes(StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16628);assertArrayEquals(inData, bytes, "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToOutputStream_Encoding_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ha7fjwctx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToOutputStream_Encoding_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ha7fjwctx() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16629);
        __CLR4_4_1cp0cp0kylve200.R.inc(16630);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16631);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16632);IOUtils.write((String) null, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16633);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16634);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16635);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToOutputStream_Encoding_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xzwpwmcu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToOutputStream_Encoding_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xzwpwmcu4() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16636);
        __CLR4_4_1cp0cp0kylve200.R.inc(16637);final String str = new String(inData, StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16638);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16639);IOUtils.write(str, (OutputStream) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16640);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToOutputStream_nullEncoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t8g8chcu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToOutputStream_nullEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t8g8chcu9() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16641);
        __CLR4_4_1cp0cp0kylve200.R.inc(16642);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16643);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16644);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16645);IOUtils.write(str, out, (String) null);
        __CLR4_4_1cp0cp0kylve200.R.inc(16646);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16647);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16648);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16649);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToWriter() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1anzruwcui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1anzruwcui() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16650);
        __CLR4_4_1cp0cp0kylve200.R.inc(16651);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16652);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16653);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16654);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16655);IOUtils.write(str, writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16656);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16657);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16658);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16659);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToWriter_Encoding_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yc2jacus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToWriter_Encoding_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yc2jacus() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16660);
        __CLR4_4_1cp0cp0kylve200.R.inc(16661);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16662);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16663);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16664);IOUtils.write((String) null, writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16665);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16666);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16667);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_stringToWriter_Encoding_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aummaccv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_stringToWriter_Encoding_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aummaccv0() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16668);
        __CLR4_4_1cp0cp0kylve200.R.inc(16669);final String str = new String(inData, StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16670);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16671);IOUtils.write(str, (Writer) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16672);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToOutputStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ja8x8cv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ja8x8cv5() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16673);
        __CLR4_4_1cp0cp0kylve200.R.inc(16674);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16675);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16676);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16677);IOUtils.write(str.toCharArray(), out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16678);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16679);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16680);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16681);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToOutputStream_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7mpdicve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToOutputStream_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7mpdicve() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16682);
        __CLR4_4_1cp0cp0kylve200.R.inc(16683);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16684);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16685);IOUtils.write((char[]) null, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16686);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16687);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16688);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToOutputStream_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19nqcbkcvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToOutputStream_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19nqcbkcvl() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16689);
        __CLR4_4_1cp0cp0kylve200.R.inc(16690);final String str = new String(inData, StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16691);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16692);IOUtils.write(str.toCharArray(), (OutputStream) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16693);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToOutputStream_Encoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19pnm24cvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToOutputStream_Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19pnm24cvq() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16694);
        __CLR4_4_1cp0cp0kylve200.R.inc(16695);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16696);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16697);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16698);IOUtils.write(str.toCharArray(), out, "UTF16");
        __CLR4_4_1cp0cp0kylve200.R.inc(16699);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16700);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16701);byte[] bytes = baout.toByteArray();
        __CLR4_4_1cp0cp0kylve200.R.inc(16702);bytes = new String(bytes, StandardCharsets.UTF_16).getBytes(StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16703);assertArrayEquals(inData, bytes, "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToOutputStream_Encoding_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jcd5hqcw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToOutputStream_Encoding_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jcd5hqcw0() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16704);
        __CLR4_4_1cp0cp0kylve200.R.inc(16705);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16706);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16707);IOUtils.write((char[]) null, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16708);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16709);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16710);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToOutputStream_Encoding_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1orgmrccw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToOutputStream_Encoding_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1orgmrccw7() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16711);
        __CLR4_4_1cp0cp0kylve200.R.inc(16712);final String str = new String(inData, StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16713);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16714);IOUtils.write(str.toCharArray(), (OutputStream) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16715);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToOutputStream_nullEncoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13aw7vxcwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToOutputStream_nullEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13aw7vxcwc() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16716);
        __CLR4_4_1cp0cp0kylve200.R.inc(16717);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16718);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16719);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16720);IOUtils.write(str.toCharArray(), out, (String) null);
        __CLR4_4_1cp0cp0kylve200.R.inc(16721);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16722);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16723);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16724);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToWriter() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2u2cacwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2u2cacwl() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16725);
        __CLR4_4_1cp0cp0kylve200.R.inc(16726);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16727);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16728);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16729);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16730);IOUtils.write(str.toCharArray(), writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16731);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16732);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16733);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1cp0cp0kylve200.R.inc(16734);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToWriter_Encoding_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ixynd0cwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToWriter_Encoding_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ixynd0cwv() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16735);
        __CLR4_4_1cp0cp0kylve200.R.inc(16736);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16737);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16738);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16739);IOUtils.write((char[]) null, writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16740);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16741);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16742);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWrite_charArrayToWriter_Encoding_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p2rtuucx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWrite_charArrayToWriter_Encoding_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p2rtuucx3() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16743);
        __CLR4_4_1cp0cp0kylve200.R.inc(16744);final String str = new String(inData, StandardCharsets.US_ASCII);
        __CLR4_4_1cp0cp0kylve200.R.inc(16745);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16746);IOUtils.write(str.toCharArray(), (Writer) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16747);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_OutputStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwjbitcx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_OutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwjbitcx8() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16748);
        __CLR4_4_1cp0cp0kylve200.R.inc(16749);final Object[] data = {
                "hello", new StringBuffer("world"), "", "this is", null, "some text"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16750);final List<Object> list = Arrays.asList(data);

        __CLR4_4_1cp0cp0kylve200.R.inc(16751);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16752);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16753);IOUtils.writeLines(list, "*", out);

        __CLR4_4_1cp0cp0kylve200.R.inc(16754);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16755);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16756);final String expected = "hello*world**this is**some text*";
        __CLR4_4_1cp0cp0kylve200.R.inc(16757);final String actual = baout.toString();
        __CLR4_4_1cp0cp0kylve200.R.inc(16758);assertEquals(expected, actual);
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_OutputStream_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8zf6fcxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_OutputStream_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8zf6fcxj() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16759);
        __CLR4_4_1cp0cp0kylve200.R.inc(16760);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16761);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16762);IOUtils.writeLines(null, "*", out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16763);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16764);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16765);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_OutputStream_nullSeparator() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jcqb0cxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_OutputStream_nullSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jcqb0cxq() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16766);
        __CLR4_4_1cp0cp0kylve200.R.inc(16767);final Object[] data = {"hello", "world"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16768);final List<Object> list = Arrays.asList(data);

        __CLR4_4_1cp0cp0kylve200.R.inc(16769);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16770);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16771);IOUtils.writeLines(list, null, out);
        __CLR4_4_1cp0cp0kylve200.R.inc(16772);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16773);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16774);final String expected = "hello" + System.lineSeparator() + "world" + System.lineSeparator();
        __CLR4_4_1cp0cp0kylve200.R.inc(16775);final String actual = baout.toString();
        __CLR4_4_1cp0cp0kylve200.R.inc(16776);assertEquals(expected, actual);
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_OutputStream_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ozrltcy1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_OutputStream_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ozrltcy1() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16777);
        __CLR4_4_1cp0cp0kylve200.R.inc(16778);final Object[] data = {"hello", "world"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16779);final List<Object> list = Arrays.asList(data);
        __CLR4_4_1cp0cp0kylve200.R.inc(16780);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16781);IOUtils.writeLines(list, "*", (OutputStream) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16782);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_OutputStream_Encoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oaw97cy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_OutputStream_Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oaw97cy7() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16783);
        __CLR4_4_1cp0cp0kylve200.R.inc(16784);final Object[] data = {
                "hello\u8364", new StringBuffer("world"), "", "this is", null, "some text"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16785);final List<Object> list = Arrays.asList(data);

        __CLR4_4_1cp0cp0kylve200.R.inc(16786);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16787);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16788);IOUtils.writeLines(list, "*", out, "UTF-8");

        __CLR4_4_1cp0cp0kylve200.R.inc(16789);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16790);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16791);final String expected = "hello\u8364*world**this is**some text*";
        __CLR4_4_1cp0cp0kylve200.R.inc(16792);final String actual = baout.toString("UTF-8");
        __CLR4_4_1cp0cp0kylve200.R.inc(16793);assertEquals(expected, actual);
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_OutputStream_Encoding_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fer7cyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_OutputStream_Encoding_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fer7cyi() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16794);
        __CLR4_4_1cp0cp0kylve200.R.inc(16795);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16796);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16797);IOUtils.writeLines(null, "*", out, "US-ASCII");
        __CLR4_4_1cp0cp0kylve200.R.inc(16798);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16799);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16800);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_OutputStream_Encoding_nullSeparator() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133zll6cyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_OutputStream_Encoding_nullSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133zll6cyp() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16801);
        __CLR4_4_1cp0cp0kylve200.R.inc(16802);final Object[] data = {"hello", "world"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16803);final List<Object> list = Arrays.asList(data);

        __CLR4_4_1cp0cp0kylve200.R.inc(16804);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16805);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16806);IOUtils.writeLines(list, null, out, "US-ASCII");
        __CLR4_4_1cp0cp0kylve200.R.inc(16807);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16808);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16809);final String expected = "hello" + System.lineSeparator() + "world" + System.lineSeparator();
        __CLR4_4_1cp0cp0kylve200.R.inc(16810);final String actual = baout.toString();
        __CLR4_4_1cp0cp0kylve200.R.inc(16811);assertEquals(expected, actual);
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_OutputStream_Encoding_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycii9jcz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_OutputStream_Encoding_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycii9jcz0() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16812);
        __CLR4_4_1cp0cp0kylve200.R.inc(16813);final Object[] data = {"hello", "world"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16814);final List<Object> list = Arrays.asList(data);
        __CLR4_4_1cp0cp0kylve200.R.inc(16815);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16816);IOUtils.writeLines(list, "*", null, "US-ASCII");
            __CLR4_4_1cp0cp0kylve200.R.inc(16817);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_OutputStream_Encoding_nullEncoding() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uh41dwcz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_OutputStream_Encoding_nullEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uh41dwcz6() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16818);
        __CLR4_4_1cp0cp0kylve200.R.inc(16819);final Object[] data = {
                "hello", new StringBuffer("world"), "", "this is", null, "some text"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16820);final List<Object> list = Arrays.asList(data);

        __CLR4_4_1cp0cp0kylve200.R.inc(16821);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16822);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1cp0cp0kylve200.R.inc(16823);IOUtils.writeLines(list, "*", out, (String) null);

        __CLR4_4_1cp0cp0kylve200.R.inc(16824);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16825);out.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16826);final String expected = "hello*world**this is**some text*";
        __CLR4_4_1cp0cp0kylve200.R.inc(16827);final String actual = baout.toString();
        __CLR4_4_1cp0cp0kylve200.R.inc(16828);assertEquals(expected, actual);
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_Writer() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mayvqfczh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_Writer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mayvqfczh() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16829);
        __CLR4_4_1cp0cp0kylve200.R.inc(16830);final Object[] data = {
                "hello", new StringBuffer("world"), "", "this is", null, "some text"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16831);final List<Object> list = Arrays.asList(data);

        __CLR4_4_1cp0cp0kylve200.R.inc(16832);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16833);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16834);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16835);IOUtils.writeLines(list, "*", writer);

        __CLR4_4_1cp0cp0kylve200.R.inc(16836);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16837);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16838);final String expected = "hello*world**this is**some text*";
        __CLR4_4_1cp0cp0kylve200.R.inc(16839);final String actual = baout.toString();
        __CLR4_4_1cp0cp0kylve200.R.inc(16840);assertEquals(expected, actual);
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_Writer_nullData() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rg3vc9czt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_Writer_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rg3vc9czt() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16841);
        __CLR4_4_1cp0cp0kylve200.R.inc(16842);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16843);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16844);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16845);IOUtils.writeLines(null, "*", writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16846);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16847);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16848);assertEquals(0, baout.size(), "Sizes differ");
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_Writer_nullSeparator() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199gbrud01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_Writer_nullSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199gbrud01() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16849);
        __CLR4_4_1cp0cp0kylve200.R.inc(16850);final Object[] data = {"hello", "world"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16851);final List<Object> list = Arrays.asList(data);

        __CLR4_4_1cp0cp0kylve200.R.inc(16852);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1cp0cp0kylve200.R.inc(16853);@SuppressWarnings("resource") // deliberately not closed
        final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1cp0cp0kylve200.R.inc(16854);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1cp0cp0kylve200.R.inc(16855);IOUtils.writeLines(list, null, writer);
        __CLR4_4_1cp0cp0kylve200.R.inc(16856);out.off();
        __CLR4_4_1cp0cp0kylve200.R.inc(16857);writer.flush();

        __CLR4_4_1cp0cp0kylve200.R.inc(16858);final String expected = "hello" + System.lineSeparator() + "world" + System.lineSeparator();
        __CLR4_4_1cp0cp0kylve200.R.inc(16859);final String actual = baout.toString();
        __CLR4_4_1cp0cp0kylve200.R.inc(16860);assertEquals(expected, actual);
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

    @Test
    public void testWriteLines_Writer_nullStream() throws Exception {__CLR4_4_1cp0cp0kylve200.R.globalSliceStart(getClass().getName(),16861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpelpd0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cp0cp0kylve200.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cp0cp0kylve200.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsWriteTestCase.testWriteLines_Writer_nullStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpelpd0d() throws Exception{try{__CLR4_4_1cp0cp0kylve200.R.inc(16861);
        __CLR4_4_1cp0cp0kylve200.R.inc(16862);final Object[] data = {"hello", "world"};
        __CLR4_4_1cp0cp0kylve200.R.inc(16863);final List<Object> list = Arrays.asList(data);
        __CLR4_4_1cp0cp0kylve200.R.inc(16864);try {
            __CLR4_4_1cp0cp0kylve200.R.inc(16865);IOUtils.writeLines(list, "*", (Writer) null);
            __CLR4_4_1cp0cp0kylve200.R.inc(16866);fail();
        } catch (final NullPointerException ignore) {
        }
    }finally{__CLR4_4_1cp0cp0kylve200.R.flushNeeded();}}

}
