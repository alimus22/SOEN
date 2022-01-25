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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.input.NullInputStream;
import org.apache.commons.io.input.NullReader;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.io.test.TestUtils;
import org.apache.commons.io.test.ThrowOnCloseInputStream;
import org.apache.commons.io.test.ThrowOnFlushAndCloseOutputStream;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for IOUtils copy methods.
 *
 * @see IOUtils
 */
public class IOUtilsCopyTestCase {static class __CLR4_4_1btsbtskylve1r9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,15552,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
     * NOTE this is not particularly beautiful code. A better way to check for
     * flush and close status would be to implement "trojan horse" wrapper
     * implementations of the various stream classes, which set a flag when
     * relevant methods are called. (JT)
     */

    private static final int FILE_SIZE = 1024 * 4 + 1;


    private final byte[] inData = TestUtils.generateTestData(FILE_SIZE);

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_inputStreamToOutputStream() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnls0bbts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnls0bbts() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15328);
        __CLR4_4_1btsbtskylve1r9.R.inc(15329);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15330);in = new ThrowOnCloseInputStream(in);

        __CLR4_4_1btsbtskylve1r9.R.inc(15331);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15332);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1btsbtskylve1r9.R.inc(15333);final int count = IOUtils.copy(in, out);

        __CLR4_4_1btsbtskylve1r9.R.inc(15334);assertEquals(0, in.available(), "Not all bytes were read");
        __CLR4_4_1btsbtskylve1r9.R.inc(15335);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1btsbtskylve1r9.R.inc(15336);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
        __CLR4_4_1btsbtskylve1r9.R.inc(15337);assertEquals(inData.length,count);
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    /**
     * Test Copying file > 2GB  - see issue# IO-84
     */
    @Test
    public void testCopy_inputStreamToOutputStream_IO84() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cq93gabu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToOutputStream_IO84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cq93gabu2() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15338);
        __CLR4_4_1btsbtskylve1r9.R.inc(15339);final long size = (long)Integer.MAX_VALUE + (long)1;
        __CLR4_4_1btsbtskylve1r9.R.inc(15340);final InputStream  in  = new NullInputStream(size);
        __CLR4_4_1btsbtskylve1r9.R.inc(15341);final OutputStream out = NullOutputStream.NULL_OUTPUT_STREAM;

        // Test copy() method
        __CLR4_4_1btsbtskylve1r9.R.inc(15342);assertEquals(-1, IOUtils.copy(in, out));

        // reset the input
        __CLR4_4_1btsbtskylve1r9.R.inc(15343);in.close();

        // Test copyLarge() method
        __CLR4_4_1btsbtskylve1r9.R.inc(15344);assertEquals(size, IOUtils.copyLarge(in, out), "copyLarge()");
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_inputStreamToOutputStream_nullIn() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fiuf8kbu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToOutputStream_nullIn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fiuf8kbu9(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15345);
        __CLR4_4_1btsbtskylve1r9.R.inc(15346);final OutputStream out = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15347);assertThrows(NullPointerException.class, () -> IOUtils.copy((InputStream) null, out));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_inputStreamToOutputStream_nullOut() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ac0m4dbuc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToOutputStream_nullOut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ac0m4dbuc(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15348);
        __CLR4_4_1btsbtskylve1r9.R.inc(15349);final InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15350);assertThrows(NullPointerException.class, () -> IOUtils.copy(in, (OutputStream) null));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_inputStreamToOutputStreamWithBufferSize() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1clnjwcbuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToOutputStreamWithBufferSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1clnjwcbuf() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15351);
        __CLR4_4_1btsbtskylve1r9.R.inc(15352);testCopy_inputStreamToOutputStreamWithBufferSize(1);
        __CLR4_4_1btsbtskylve1r9.R.inc(15353);testCopy_inputStreamToOutputStreamWithBufferSize(2);
        __CLR4_4_1btsbtskylve1r9.R.inc(15354);testCopy_inputStreamToOutputStreamWithBufferSize(4);
        __CLR4_4_1btsbtskylve1r9.R.inc(15355);testCopy_inputStreamToOutputStreamWithBufferSize(8);
        __CLR4_4_1btsbtskylve1r9.R.inc(15356);testCopy_inputStreamToOutputStreamWithBufferSize(16);
        __CLR4_4_1btsbtskylve1r9.R.inc(15357);testCopy_inputStreamToOutputStreamWithBufferSize(32);
        __CLR4_4_1btsbtskylve1r9.R.inc(15358);testCopy_inputStreamToOutputStreamWithBufferSize(64);
        __CLR4_4_1btsbtskylve1r9.R.inc(15359);testCopy_inputStreamToOutputStreamWithBufferSize(128);
        __CLR4_4_1btsbtskylve1r9.R.inc(15360);testCopy_inputStreamToOutputStreamWithBufferSize(256);
        __CLR4_4_1btsbtskylve1r9.R.inc(15361);testCopy_inputStreamToOutputStreamWithBufferSize(512);
        __CLR4_4_1btsbtskylve1r9.R.inc(15362);testCopy_inputStreamToOutputStreamWithBufferSize(1024);
        __CLR4_4_1btsbtskylve1r9.R.inc(15363);testCopy_inputStreamToOutputStreamWithBufferSize(2048);
        __CLR4_4_1btsbtskylve1r9.R.inc(15364);testCopy_inputStreamToOutputStreamWithBufferSize(4096);
        __CLR4_4_1btsbtskylve1r9.R.inc(15365);testCopy_inputStreamToOutputStreamWithBufferSize(8192);
        __CLR4_4_1btsbtskylve1r9.R.inc(15366);testCopy_inputStreamToOutputStreamWithBufferSize(16384);
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    private void testCopy_inputStreamToOutputStreamWithBufferSize(final int bufferSize) throws Exception {try{__CLR4_4_1btsbtskylve1r9.R.inc(15367);
        __CLR4_4_1btsbtskylve1r9.R.inc(15368);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15369);in = new ThrowOnCloseInputStream(in);

        __CLR4_4_1btsbtskylve1r9.R.inc(15370);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15371);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1btsbtskylve1r9.R.inc(15372);final long count = IOUtils.copy(in, out, bufferSize);

        __CLR4_4_1btsbtskylve1r9.R.inc(15373);assertEquals(0, in.available(), "Not all bytes were read");
        __CLR4_4_1btsbtskylve1r9.R.inc(15374);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1btsbtskylve1r9.R.inc(15375);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
        __CLR4_4_1btsbtskylve1r9.R.inc(15376);assertEquals(inData.length,count);
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings({ "resource", "deprecation" }) // 'in' is deliberately not closed
    @Test
    public void testCopy_inputStreamToWriter() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gbgufbv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gbgufbv5() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15377);
        __CLR4_4_1btsbtskylve1r9.R.inc(15378);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15379);in = new ThrowOnCloseInputStream(in);

        __CLR4_4_1btsbtskylve1r9.R.inc(15380);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15381);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15382);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15383);IOUtils.copy(in, writer); // deliberately testing deprecated method
        __CLR4_4_1btsbtskylve1r9.R.inc(15384);out.off();
        __CLR4_4_1btsbtskylve1r9.R.inc(15385);writer.flush();

        __CLR4_4_1btsbtskylve1r9.R.inc(15386);assertEquals(0, in.available(), "Not all bytes were read");
        __CLR4_4_1btsbtskylve1r9.R.inc(15387);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1btsbtskylve1r9.R.inc(15388);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_inputStreamToWriter_Encoding() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwb6e1bvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToWriter_Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwb6e1bvh() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15389);
        __CLR4_4_1btsbtskylve1r9.R.inc(15390);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15391);in = new ThrowOnCloseInputStream(in);

        __CLR4_4_1btsbtskylve1r9.R.inc(15392);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15393);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15394);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15395);IOUtils.copy(in, writer, "UTF8");
        __CLR4_4_1btsbtskylve1r9.R.inc(15396);out.off();
        __CLR4_4_1btsbtskylve1r9.R.inc(15397);writer.flush();

        __CLR4_4_1btsbtskylve1r9.R.inc(15398);assertEquals(0, in.available(), "Not all bytes were read");
        __CLR4_4_1btsbtskylve1r9.R.inc(15399);byte[] bytes = baout.toByteArray();
        __CLR4_4_1btsbtskylve1r9.R.inc(15400);bytes = new String(bytes, StandardCharsets.UTF_8).getBytes(StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15401);assertArrayEquals(inData, bytes, "Content differs");
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_inputStreamToWriter_Encoding_nullEncoding() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e740b6bvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToWriter_Encoding_nullEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e740b6bvu() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15402);
        __CLR4_4_1btsbtskylve1r9.R.inc(15403);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15404);in = new ThrowOnCloseInputStream(in);

        __CLR4_4_1btsbtskylve1r9.R.inc(15405);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15406);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15407);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15408);IOUtils.copy(in, writer, (String) null);
        __CLR4_4_1btsbtskylve1r9.R.inc(15409);out.off();
        __CLR4_4_1btsbtskylve1r9.R.inc(15410);writer.flush();

        __CLR4_4_1btsbtskylve1r9.R.inc(15411);assertEquals(0, in.available(), "Not all bytes were read");
        __CLR4_4_1btsbtskylve1r9.R.inc(15412);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1btsbtskylve1r9.R.inc(15413);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_inputStreamToWriter_Encoding_nullIn() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r5kpvkbw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToWriter_Encoding_nullIn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r5kpvkbw6(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15414);
        __CLR4_4_1btsbtskylve1r9.R.inc(15415);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15416);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15417);final Writer writer = new OutputStreamWriter(out, StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15418);assertThrows(NullPointerException.class, () -> IOUtils.copy(null, writer, "UTF8"));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_inputStreamToWriter_Encoding_nullOut() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fr3i1tbwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToWriter_Encoding_nullOut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fr3i1tbwb(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15419);
        __CLR4_4_1btsbtskylve1r9.R.inc(15420);final InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15421);assertThrows(NullPointerException.class, () -> IOUtils.copy(in, null, "UTF8"));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("deprecation") // deliberately testing deprecated method
    @Test
    public void testCopy_inputStreamToWriter_nullIn() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jt7jjibwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToWriter_nullIn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jt7jjibwe(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15422);
        __CLR4_4_1btsbtskylve1r9.R.inc(15423);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15424);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15425);final Writer writer = new OutputStreamWriter(out, StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15426);assertThrows(NullPointerException.class, () -> IOUtils.copy((InputStream) null, writer));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("deprecation") // deliberately testing deprecated method
    @Test
    public void testCopy_inputStreamToWriter_nullOut() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkziepbwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_inputStreamToWriter_nullOut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkziepbwj(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15427);
        __CLR4_4_1btsbtskylve1r9.R.inc(15428);final InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15429);assertThrows(NullPointerException.class, () -> IOUtils.copy(in, (Writer) null)); // deliberately testing deprecated method
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToAppendable() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cycfkhbwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToAppendable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cycfkhbwm() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15430);
        __CLR4_4_1btsbtskylve1r9.R.inc(15431);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15432);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_1btsbtskylve1r9.R.inc(15433);final Reader reader = new InputStreamReader(in, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15434);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15435);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15436);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15437);final long count = IOUtils.copy(reader, (Appendable) writer);
        __CLR4_4_1btsbtskylve1r9.R.inc(15438);out.off();
        __CLR4_4_1btsbtskylve1r9.R.inc(15439);writer.flush();
        __CLR4_4_1btsbtskylve1r9.R.inc(15440);assertEquals(inData.length, count, "The number of characters returned by copy is wrong");
        __CLR4_4_1btsbtskylve1r9.R.inc(15441);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1btsbtskylve1r9.R.inc(15442);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_readerToAppendable_IO84() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mkojmmbwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToAppendable_IO84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mkojmmbwz() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15443);
        __CLR4_4_1btsbtskylve1r9.R.inc(15444);final long size = (long) Integer.MAX_VALUE + (long) 1;
        __CLR4_4_1btsbtskylve1r9.R.inc(15445);final Reader reader = new NullReader(size);
        __CLR4_4_1btsbtskylve1r9.R.inc(15446);final NullWriter writer = new NullWriter();

        // Test copy() method
        __CLR4_4_1btsbtskylve1r9.R.inc(15447);assertEquals(size, IOUtils.copy(reader, (Appendable) writer));

        // reset the input
        __CLR4_4_1btsbtskylve1r9.R.inc(15448);reader.close();

        // Test copyLarge() method
        __CLR4_4_1btsbtskylve1r9.R.inc(15449);assertEquals(size, IOUtils.copyLarge(reader, writer), "copy()");

    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_readerToAppendable_nullIn() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tp9xl4bx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToAppendable_nullIn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tp9xl4bx6(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15450);
        __CLR4_4_1btsbtskylve1r9.R.inc(15451);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15452);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15453);final Appendable writer = new OutputStreamWriter(out, StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15454);assertThrows(NullPointerException.class, () -> IOUtils.copy((Reader) null, writer));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToAppendable_nullOut() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nop32xbxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToAppendable_nullOut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nop32xbxb(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15455);
        __CLR4_4_1btsbtskylve1r9.R.inc(15456);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15457);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_1btsbtskylve1r9.R.inc(15458);final Reader reader = new InputStreamReader(in, StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15459);assertThrows(NullPointerException.class, () -> IOUtils.copy(reader, (Appendable) null));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings({ "resource", "deprecation" }) // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToOutputStream() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btjy1qbxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btjy1qbxg() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15460);
        __CLR4_4_1btsbtskylve1r9.R.inc(15461);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15462);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_1btsbtskylve1r9.R.inc(15463);final Reader reader = new InputStreamReader(in, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15464);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15465);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1btsbtskylve1r9.R.inc(15466);IOUtils.copy(reader, out); // deliberately testing deprecated method
        //Note: this method *does* flush. It is equivalent to:
        //  OutputStreamWriter _out = new OutputStreamWriter(fout);
        //  IOUtils.copy( fin, _out, 4096 ); // copy( Reader, Writer, int );
        //  _out.flush();
        //  out = fout;

        // Note: rely on the method to flush
        __CLR4_4_1btsbtskylve1r9.R.inc(15467);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1btsbtskylve1r9.R.inc(15468);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToOutputStream_Encoding() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0vllqbxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToOutputStream_Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0vllqbxp() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15469);
        __CLR4_4_1btsbtskylve1r9.R.inc(15470);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15471);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_1btsbtskylve1r9.R.inc(15472);final Reader reader = new InputStreamReader(in, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15473);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15474);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1btsbtskylve1r9.R.inc(15475);IOUtils.copy(reader, out, "UTF16");
        // note: this method *does* flush.
        // note: we don't flush here; this IOUtils method does it for us

        __CLR4_4_1btsbtskylve1r9.R.inc(15476);byte[] bytes = baout.toByteArray();
        __CLR4_4_1btsbtskylve1r9.R.inc(15477);bytes = new String(bytes, StandardCharsets.UTF_16).getBytes(StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15478);assertArrayEquals(inData, bytes, "Content differs");
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToOutputStream_Encoding_nullEncoding() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lf4qjbxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToOutputStream_Encoding_nullEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lf4qjbxz() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15479);
        __CLR4_4_1btsbtskylve1r9.R.inc(15480);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15481);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_1btsbtskylve1r9.R.inc(15482);final Reader reader = new InputStreamReader(in, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15483);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15484);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_1btsbtskylve1r9.R.inc(15485);IOUtils.copy(reader, out, (String) null);
        // note: this method *does* flush.
        // note: we don't flush here; this IOUtils method does it for us

        __CLR4_4_1btsbtskylve1r9.R.inc(15486);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1btsbtskylve1r9.R.inc(15487);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_readerToOutputStream_Encoding_nullIn() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18c3193by8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToOutputStream_Encoding_nullIn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18c3193by8(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15488);
        __CLR4_4_1btsbtskylve1r9.R.inc(15489);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15490);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15491);assertThrows(NullPointerException.class, () -> IOUtils.copy(null, out, "UTF16"));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToOutputStream_Encoding_nullOut() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrqi2byc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToOutputStream_Encoding_nullOut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrqi2byc(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15492);
        __CLR4_4_1btsbtskylve1r9.R.inc(15493);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15494);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_1btsbtskylve1r9.R.inc(15495);final Reader reader = new InputStreamReader(in, StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15496);assertThrows(NullPointerException.class, () -> IOUtils.copy(reader, null, "UTF16"));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testCopy_readerToOutputStream_nullIn() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115fbmtbyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToOutputStream_nullIn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115fbmtbyh(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15497); // deliberately testing deprecated method
        __CLR4_4_1btsbtskylve1r9.R.inc(15498);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15499);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15500);assertThrows(NullPointerException.class, () -> IOUtils.copy((Reader) null, out));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings({ "resource", "deprecation" }) // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToOutputStream_nullOut() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19cl522byl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToOutputStream_nullOut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19cl522byl(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15501);
        __CLR4_4_1btsbtskylve1r9.R.inc(15502);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15503);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_1btsbtskylve1r9.R.inc(15504);final Reader reader = new InputStreamReader(in, StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15505);assertThrows(NullPointerException.class, () -> IOUtils.copy(reader, (OutputStream) null)); // deliberately testing deprecated method
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToWriter() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhczqobyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhczqobyq() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15506);
        __CLR4_4_1btsbtskylve1r9.R.inc(15507);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15508);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_1btsbtskylve1r9.R.inc(15509);final Reader reader = new InputStreamReader(in, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15510);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15511);final ThrowOnFlushAndCloseOutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15512);final Writer writer = new OutputStreamWriter(baout, StandardCharsets.US_ASCII);

        __CLR4_4_1btsbtskylve1r9.R.inc(15513);final int count = IOUtils.copy(reader, writer);
        __CLR4_4_1btsbtskylve1r9.R.inc(15514);out.off();
        __CLR4_4_1btsbtskylve1r9.R.inc(15515);writer.flush();
        __CLR4_4_1btsbtskylve1r9.R.inc(15516);assertEquals(inData.length, count, "The number of characters returned by copy is wrong");
        __CLR4_4_1btsbtskylve1r9.R.inc(15517);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_1btsbtskylve1r9.R.inc(15518);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    /*
     * Test Copying file > 2GB  - see issue# IO-84
     */
    @Test
    public void testCopy_readerToWriter_IO84() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdks4hbz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToWriter_IO84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdks4hbz3() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15519);
        __CLR4_4_1btsbtskylve1r9.R.inc(15520);final long size = (long)Integer.MAX_VALUE + (long)1;
        __CLR4_4_1btsbtskylve1r9.R.inc(15521);final Reader reader = new NullReader(size);
        __CLR4_4_1btsbtskylve1r9.R.inc(15522);final Writer writer = new NullWriter();

        // Test copy() method
        __CLR4_4_1btsbtskylve1r9.R.inc(15523);assertEquals(-1, IOUtils.copy(reader, writer));

        // reset the input
        __CLR4_4_1btsbtskylve1r9.R.inc(15524);reader.close();

        // Test copyLarge() method
        __CLR4_4_1btsbtskylve1r9.R.inc(15525);assertEquals(size, IOUtils.copyLarge(reader, writer), "copyLarge()");

    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_readerToWriter_nullIn() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gx0llbza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToWriter_nullIn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gx0llbza(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15526);
        __CLR4_4_1btsbtskylve1r9.R.inc(15527);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15528);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, true, true);
        __CLR4_4_1btsbtskylve1r9.R.inc(15529);final Writer writer = new OutputStreamWriter(out, StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15530);assertThrows(NullPointerException.class, () -> IOUtils.copy((Reader) null, writer));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToWriter_nullOut() {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7arrcbzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_readerToWriter_nullOut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7arrcbzf(){try{__CLR4_4_1btsbtskylve1r9.R.inc(15531);
        __CLR4_4_1btsbtskylve1r9.R.inc(15532);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_1btsbtskylve1r9.R.inc(15533);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_1btsbtskylve1r9.R.inc(15534);final Reader reader = new InputStreamReader(in, StandardCharsets.US_ASCII);
        __CLR4_4_1btsbtskylve1r9.R.inc(15535);assertThrows(NullPointerException.class, () -> IOUtils.copy(reader, (Writer) null));
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_URLToFile() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9ptqjbzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_URLToFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9ptqjbzk() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15536);
        __CLR4_4_1btsbtskylve1r9.R.inc(15537);final String name = "/org/apache/commons/io/abitmorethan16k.txt";
        __CLR4_4_1btsbtskylve1r9.R.inc(15538);final URL in = getClass().getResource(name);
        __CLR4_4_1btsbtskylve1r9.R.inc(15539);assertNotNull(in, name);

        __CLR4_4_1btsbtskylve1r9.R.inc(15540);final Path path = Files.createTempFile("testCopy_URLToFile", ".txt");
        __CLR4_4_1btsbtskylve1r9.R.inc(15541);try {
            __CLR4_4_1btsbtskylve1r9.R.inc(15542);IOUtils.copy(in, path.toFile());

            __CLR4_4_1btsbtskylve1r9.R.inc(15543);assertArrayEquals(Files.readAllBytes(Paths.get("src/test/resources" + name)), Files.readAllBytes(path));
        } finally {
            __CLR4_4_1btsbtskylve1r9.R.inc(15544);Files.delete(path);
        }
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

    @Test
    public void testCopy_URLToOutputStream() throws Exception {__CLR4_4_1btsbtskylve1r9.R.globalSliceStart(getClass().getName(),15545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mq55hibzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btsbtskylve1r9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btsbtskylve1r9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsCopyTestCase.testCopy_URLToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mq55hibzt() throws Exception{try{__CLR4_4_1btsbtskylve1r9.R.inc(15545);
        __CLR4_4_1btsbtskylve1r9.R.inc(15546);final String name = "/org/apache/commons/io/abitmorethan16k.txt";
        __CLR4_4_1btsbtskylve1r9.R.inc(15547);final URL in = getClass().getResource(name);
        __CLR4_4_1btsbtskylve1r9.R.inc(15548);assertNotNull(in, name);

        __CLR4_4_1btsbtskylve1r9.R.inc(15549);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_1btsbtskylve1r9.R.inc(15550);IOUtils.copy(in, baout);

        __CLR4_4_1btsbtskylve1r9.R.inc(15551);assertArrayEquals(Files.readAllBytes(Paths.get("src/test/resources" + name)), baout.toByteArray());
    }finally{__CLR4_4_1btsbtskylve1r9.R.flushNeeded();}}

}
