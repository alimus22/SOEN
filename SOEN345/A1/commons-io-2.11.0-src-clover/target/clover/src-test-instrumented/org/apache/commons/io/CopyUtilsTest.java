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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.test.TestUtils;
import org.apache.commons.io.test.ThrowOnCloseInputStream;
import org.apache.commons.io.test.ThrowOnFlushAndCloseOutputStream;
import org.junit.jupiter.api.Test;

@SuppressWarnings("deprecation") // these are test cases for the deprecated CopyUtils

/**
 * JUnit tests for CopyUtils.
 *
 * @see CopyUtils
 */
public class CopyUtilsTest {static class __CLR4_4_17nh7nhkylve0sl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,10003,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
     * NOTE this is not particularly beautiful code. A better way to check for
     * flush and close status would be to implement "trojan horse" wrapper
     * implementations of the various stream classes, which set a flag when
     * relevant methods are called. (JT)
     */

    private static final int FILE_SIZE = 1024 * 4 + 1;

    private final byte[] inData = TestUtils.generateTestData(FILE_SIZE);

    // ----------------------------------------------------------------
    // Tests
    // ----------------------------------------------------------------

    @Test
    public void testCtor() {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moazlf7nh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.testCtor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moazlf7nh(){try{__CLR4_4_17nh7nhkylve0sl.R.inc(9917);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9918);new CopyUtils();
        // Nothing to assert, the constructor is public and does not blow up.
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @Test
    public void copy_byteArrayToOutputStream() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1hnl67nj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.copy_byteArrayToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1hnl67nj() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9919);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9920);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9921);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9922);CopyUtils.copy(inData, out);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9923);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9924);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @Test
    public void copy_byteArrayToWriter() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njd6k7np();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.copy_byteArrayToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njd6k7np() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9925);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9926);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9927);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9928);final Writer writer = new java.io.OutputStreamWriter(out, StandardCharsets.US_ASCII);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9929);CopyUtils.copy(inData, writer);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9930);writer.flush();

        __CLR4_4_17nh7nhkylve0sl.R.inc(9931);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9932);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @Test
    public void testCopy_byteArrayToWriterWithEncoding() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18r05yf7nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.testCopy_byteArrayToWriterWithEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18r05yf7nx() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9933);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9934);final String inDataStr = "data";
        __CLR4_4_17nh7nhkylve0sl.R.inc(9935);final String charsetName = "UTF-8";
        __CLR4_4_17nh7nhkylve0sl.R.inc(9936);final StringWriter writer = new StringWriter();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9937);CopyUtils.copy(inDataStr.getBytes(charsetName), writer, charsetName);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9938);assertEquals(inDataStr, writer.toString());
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_inputStreamToOutputStream() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnls0b7o3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.testCopy_inputStreamToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnls0b7o3() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9939);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9940);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9941);in = new ThrowOnCloseInputStream(in);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9942);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9943);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9944);final int count = CopyUtils.copy(in, out);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9945);assertEquals(0, in.available(), "Not all bytes were read");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9946);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9947);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9948);assertEquals(inData.length, count);
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void copy_inputStreamToWriter() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nvjf7od();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.copy_inputStreamToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nvjf7od() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9949);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9950);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9951);in = new ThrowOnCloseInputStream(in);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9952);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9953);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9954);final Writer writer = new java.io.OutputStreamWriter(out, StandardCharsets.US_ASCII);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9955);CopyUtils.copy(in, writer);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9956);writer.flush();

        __CLR4_4_17nh7nhkylve0sl.R.inc(9957);assertEquals(0, in.available(), "Not all bytes were read");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9958);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9959);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @Test
    public void copy_inputStreamToWriterWithEncoding() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1snkgcu7oo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.copy_inputStreamToWriterWithEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1snkgcu7oo() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9960);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9961);final String inDataStr = "data";
        __CLR4_4_17nh7nhkylve0sl.R.inc(9962);final String charsetName = "UTF-8";
        __CLR4_4_17nh7nhkylve0sl.R.inc(9963);final StringWriter writer = new StringWriter();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9964);CopyUtils.copy(new ByteArrayInputStream(inDataStr.getBytes(charsetName)), writer, charsetName);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9965);assertEquals(inDataStr, writer.toString());
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void testCopy_readerToOutputStream() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btjy1q7ou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.testCopy_readerToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btjy1q7ou() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9966);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9967);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9968);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9969);final Reader reader = new java.io.InputStreamReader(in, StandardCharsets.US_ASCII);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9970);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9971);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9972);CopyUtils.copy(reader, out);
        //Note: this method *does* flush. It is equivalent to:
        //  OutputStreamWriter _out = new OutputStreamWriter(fout);
        //  IOUtils.copy( fin, _out, 4096 ); // copy( Reader, Writer, int );
        //  _out.flush();
        //  out = fout;

        // Note: rely on the method to flush
        __CLR4_4_17nh7nhkylve0sl.R.inc(9973);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9974);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @SuppressWarnings("resource") // 'in' is deliberately not closed
    @Test
    public void copy_readerToWriter() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z4psy7p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.copy_readerToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z4psy7p3() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9975);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9976);InputStream in = new ByteArrayInputStream(inData);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9977);in = new ThrowOnCloseInputStream(in);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9978);final Reader reader = new java.io.InputStreamReader(in, StandardCharsets.US_ASCII);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9979);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9980);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9981);final Writer writer = new java.io.OutputStreamWriter(out, StandardCharsets.US_ASCII);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9982);final int count = CopyUtils.copy(reader, writer);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9983);writer.flush();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9984);assertEquals(inData.length, count, "The number of characters returned by copy is wrong");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9985);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9986);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @Test
    public void copy_stringToOutputStream() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5ymhq7pf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.copy_stringToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5ymhq7pf() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9987);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9988);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9989);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9990);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9991);CopyUtils.copy(str, out);
        //Note: this method *does* flush. It is equivalent to:
        //  OutputStreamWriter _out = new OutputStreamWriter(fout);
        //  IOUtils.copy( str, _out, 4096 ); // copy( Reader, Writer, int );
        //  _out.flush();
        //  out = fout;
        // note: we don't flush here; this IOUtils method does it for us

        __CLR4_4_17nh7nhkylve0sl.R.inc(9992);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_17nh7nhkylve0sl.R.inc(9993);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

    @Test
    public void copy_stringToWriter() throws Exception {__CLR4_4_17nh7nhkylve0sl.R.globalSliceStart(getClass().getName(),9994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dinbgw7pm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17nh7nhkylve0sl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17nh7nhkylve0sl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CopyUtilsTest.copy_stringToWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dinbgw7pm() throws Exception{try{__CLR4_4_17nh7nhkylve0sl.R.inc(9994);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9995);final String str = new String(inData, StandardCharsets.US_ASCII);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9996);final ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_4_17nh7nhkylve0sl.R.inc(9997);final OutputStream out = new ThrowOnFlushAndCloseOutputStream(baout, false, true);
        __CLR4_4_17nh7nhkylve0sl.R.inc(9998);final Writer writer = new java.io.OutputStreamWriter(out, StandardCharsets.US_ASCII);

        __CLR4_4_17nh7nhkylve0sl.R.inc(9999);CopyUtils.copy(str, writer);
        __CLR4_4_17nh7nhkylve0sl.R.inc(10000);writer.flush();

        __CLR4_4_17nh7nhkylve0sl.R.inc(10001);assertEquals(inData.length, baout.size(), "Sizes differ");
        __CLR4_4_17nh7nhkylve0sl.R.inc(10002);assertArrayEquals(inData, baout.toByteArray(), "Content differs");
    }finally{__CLR4_4_17nh7nhkylve0sl.R.flushNeeded();}}

} // CopyUtilsTest
