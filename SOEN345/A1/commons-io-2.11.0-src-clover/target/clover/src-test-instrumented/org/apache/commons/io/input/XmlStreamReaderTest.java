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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.DefaultLocale;

public class XmlStreamReaderTest {static class __CLR4_4_1iciicikylve38n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,24057,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String XML5 = "xml-prolog-encoding-spaced-single-quotes";
    private static final String XML4 = "xml-prolog-encoding-single-quotes";
    private static final String XML3 = "xml-prolog-encoding-double-quotes";
    private static final String XML2 = "xml-prolog";
    private static final String XML1 = "xml";

    protected void testRawNoBomValid(final String encoding) throws Exception {try{__CLR4_4_1iciicikylve38n.R.inc(23778);
        __CLR4_4_1iciicikylve38n.R.inc(23779);InputStream is = getXmlInputStream("no-bom", XML1, encoding, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23780);XmlStreamReader xmlReader = new XmlStreamReader(is, false);
        __CLR4_4_1iciicikylve38n.R.inc(23781);assertEquals(xmlReader.getEncoding(), "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23782);xmlReader.close();

        __CLR4_4_1iciicikylve38n.R.inc(23783);is = getXmlInputStream("no-bom", XML2, encoding, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23784);xmlReader = new XmlStreamReader(is);
        __CLR4_4_1iciicikylve38n.R.inc(23785);assertEquals(xmlReader.getEncoding(), "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23786);xmlReader.close();

        __CLR4_4_1iciicikylve38n.R.inc(23787);is = getXmlInputStream("no-bom", XML3, encoding, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23788);xmlReader = new XmlStreamReader(is);
        __CLR4_4_1iciicikylve38n.R.inc(23789);assertEquals(xmlReader.getEncoding(), encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23790);xmlReader.close();

        __CLR4_4_1iciicikylve38n.R.inc(23791);is = getXmlInputStream("no-bom", XML4, encoding, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23792);xmlReader = new XmlStreamReader(is);
        __CLR4_4_1iciicikylve38n.R.inc(23793);assertEquals(xmlReader.getEncoding(), encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23794);xmlReader.close();

        __CLR4_4_1iciicikylve38n.R.inc(23795);is = getXmlInputStream("no-bom", XML5, encoding, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23796);xmlReader = new XmlStreamReader(is);
        __CLR4_4_1iciicikylve38n.R.inc(23797);assertEquals(xmlReader.getEncoding(), encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23798);xmlReader.close();
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    protected void testRawNoBomInvalid(final String encoding) throws Exception {try{__CLR4_4_1iciicikylve38n.R.inc(23799);
        __CLR4_4_1iciicikylve38n.R.inc(23800);final InputStream is = getXmlInputStream("no-bom", XML3, encoding, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23801);try {
            __CLR4_4_1iciicikylve38n.R.inc(23802);new XmlStreamReader(is, false).close();
            __CLR4_4_1iciicikylve38n.R.inc(23803);fail("It should have failed");
        } catch (final IOException ex) {
            __CLR4_4_1iciicikylve38n.R.inc(23804);assertTrue(ex.getMessage().contains("Invalid encoding,"));
        }
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    protected void testNullFileInput() {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkeyn8id9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testNullFileInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkeyn8id9(){try{__CLR4_4_1iciicikylve38n.R.inc(23805);
        __CLR4_4_1iciicikylve38n.R.inc(23806);assertThrows(NullPointerException.class, () -> new XmlStreamReader((File) null));
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    protected void testNullPathInput() {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v08yszidb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testNullPathInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v08yszidb(){try{__CLR4_4_1iciicikylve38n.R.inc(23807);
        __CLR4_4_1iciicikylve38n.R.inc(23808);assertThrows(NullPointerException.class, () -> new XmlStreamReader((Path) null));
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    protected void testNullInputStreamInput() {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ncmf4idd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testNullInputStreamInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ncmf4idd(){try{__CLR4_4_1iciicikylve38n.R.inc(23809);
        __CLR4_4_1iciicikylve38n.R.inc(23810);assertThrows(NullPointerException.class, () -> new XmlStreamReader((InputStream) null));
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    protected void testNullURLInput() {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xss2ijidf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testNullURLInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xss2ijidf(){try{__CLR4_4_1iciicikylve38n.R.inc(23811);
        __CLR4_4_1iciicikylve38n.R.inc(23812);assertThrows(NullPointerException.class, () -> new XmlStreamReader((URL) null));
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    protected void testNullURLConnectionInput() {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5mfybidh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testNullURLConnectionInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5mfybidh(){try{__CLR4_4_1iciicikylve38n.R.inc(23813);
        __CLR4_4_1iciicikylve38n.R.inc(23814);assertThrows(NullPointerException.class, () -> new XmlStreamReader((URLConnection) null, "US-ASCII"));
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawNoBomUsAscii() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z69x81idj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawNoBomUsAscii",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z69x81idj() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23815);
        __CLR4_4_1iciicikylve38n.R.inc(23816);testRawNoBomValid("US-ASCII");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawNoBomUtf8() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tn96inidl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawNoBomUtf8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tn96inidl() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23817);
        __CLR4_4_1iciicikylve38n.R.inc(23818);testRawNoBomValid("UTF-8");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawNoBomUtf16BE() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qx8oh9idn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawNoBomUtf16BE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qx8oh9idn() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23819);
        __CLR4_4_1iciicikylve38n.R.inc(23820);testRawNoBomValid("UTF-16BE");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawNoBomUtf16LE() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1qjz1idp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawNoBomUtf16LE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1qjz1idp() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23821);
        __CLR4_4_1iciicikylve38n.R.inc(23822);testRawNoBomValid("UTF-16LE");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawNoBomUtf32BE() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pv3bmhidr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawNoBomUtf32BE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pv3bmhidr() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23823);
        __CLR4_4_1iciicikylve38n.R.inc(23824);testRawNoBomValid("UTF-32BE");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawNoBomUtf32LE() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csyi3nidt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawNoBomUtf32LE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csyi3nidt() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23825);
        __CLR4_4_1iciicikylve38n.R.inc(23826);testRawNoBomValid("UTF-32LE");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawNoBomIso8859_1() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bn5bp5idv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawNoBomIso8859_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bn5bp5idv() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23827);
        __CLR4_4_1iciicikylve38n.R.inc(23828);testRawNoBomValid("ISO-8859-1");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawNoBomCp1047() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jvrvttidx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawNoBomCp1047",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jvrvttidx() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23829);
        __CLR4_4_1iciicikylve38n.R.inc(23830);testRawNoBomValid("CP1047");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    protected void testRawBomValid(final String encoding) throws Exception {try{__CLR4_4_1iciicikylve38n.R.inc(23831);
        __CLR4_4_1iciicikylve38n.R.inc(23832);final InputStream is = getXmlInputStream(encoding + "-bom", XML3, encoding, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23833);final XmlStreamReader xmlReader = new XmlStreamReader(is, false);
        __CLR4_4_1iciicikylve38n.R.inc(23834);if ((((!encoding.equals("UTF-16") && !encoding.equals("UTF-32"))&&(__CLR4_4_1iciicikylve38n.R.iget(23835)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(23836)==0&false))) {{
            __CLR4_4_1iciicikylve38n.R.inc(23837);assertEquals(xmlReader.getEncoding(), encoding);
        } }else {{
            __CLR4_4_1iciicikylve38n.R.inc(23838);assertEquals(xmlReader.getEncoding().substring(0, encoding.length()), encoding);
        }
        }__CLR4_4_1iciicikylve38n.R.inc(23839);xmlReader.close();
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    protected void testRawBomInvalid(final String bomEnc, final String streamEnc,
        final String prologEnc) throws Exception {try{__CLR4_4_1iciicikylve38n.R.inc(23840);
        __CLR4_4_1iciicikylve38n.R.inc(23841);final InputStream is = getXmlInputStream(bomEnc, XML3, streamEnc, prologEnc);
        __CLR4_4_1iciicikylve38n.R.inc(23842);XmlStreamReader xmlReader = null;
        __CLR4_4_1iciicikylve38n.R.inc(23843);try {
            __CLR4_4_1iciicikylve38n.R.inc(23844);xmlReader = new XmlStreamReader(is, false);
            __CLR4_4_1iciicikylve38n.R.inc(23845);final String foundEnc = xmlReader.getEncoding();
            __CLR4_4_1iciicikylve38n.R.inc(23846);fail("Expected IOException for BOM " + bomEnc + ", streamEnc " + streamEnc + " and prologEnc " + prologEnc
                + ": found " + foundEnc);
        } catch (final IOException ex) {
            __CLR4_4_1iciicikylve38n.R.inc(23847);assertTrue(ex.getMessage().contains("Invalid encoding,"));
        }
        __CLR4_4_1iciicikylve38n.R.inc(23848);if ((((xmlReader != null)&&(__CLR4_4_1iciicikylve38n.R.iget(23849)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(23850)==0&false))) {{
            __CLR4_4_1iciicikylve38n.R.inc(23851);xmlReader.close();
        }
    }}finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawBomUtf8() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3q0wyiek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawBomUtf8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3q0wyiek() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23852);
        __CLR4_4_1iciicikylve38n.R.inc(23853);testRawBomValid("UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23854);testRawBomInvalid("UTF-8-bom", "US-ASCII", "US-ASCII");
        __CLR4_4_1iciicikylve38n.R.inc(23855);testRawBomInvalid("UTF-8-bom", "ISO-8859-1", "ISO-8859-1");
        __CLR4_4_1iciicikylve38n.R.inc(23856);testRawBomInvalid("UTF-8-bom", "UTF-8", "UTF-16");
        __CLR4_4_1iciicikylve38n.R.inc(23857);testRawBomInvalid("UTF-8-bom", "UTF-8", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23858);testRawBomInvalid("UTF-8-bom", "UTF-8", "UTF-16LE");
        __CLR4_4_1iciicikylve38n.R.inc(23859);testRawBomInvalid("UTF-16BE-bom", "UTF-16BE", "UTF-16LE");
        __CLR4_4_1iciicikylve38n.R.inc(23860);testRawBomInvalid("UTF-16LE-bom", "UTF-16LE", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23861);testRawBomInvalid("UTF-16LE-bom", "UTF-16LE", "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23862);testRawBomInvalid("UTF-32BE-bom", "UTF-32BE", "UTF-32LE");
        __CLR4_4_1iciicikylve38n.R.inc(23863);testRawBomInvalid("UTF-32LE-bom", "UTF-32LE", "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23864);testRawBomInvalid("UTF-32LE-bom", "UTF-32LE", "UTF-8");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawBomUtf16() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14r26ixiex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawBomUtf16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14r26ixiex() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23865);
        __CLR4_4_1iciicikylve38n.R.inc(23866);testRawBomValid("UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23867);testRawBomValid("UTF-16LE");
        __CLR4_4_1iciicikylve38n.R.inc(23868);testRawBomValid("UTF-16");

        __CLR4_4_1iciicikylve38n.R.inc(23869);testRawBomInvalid("UTF-16BE-bom", "UTF-16BE", "UTF-16LE");
        __CLR4_4_1iciicikylve38n.R.inc(23870);testRawBomInvalid("UTF-16LE-bom", "UTF-16LE", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23871);testRawBomInvalid("UTF-16LE-bom", "UTF-16LE", "UTF-8");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawBomUtf32() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jubxj1if4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawBomUtf32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jubxj1if4() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23872);
        __CLR4_4_1iciicikylve38n.R.inc(23873);testRawBomValid("UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23874);testRawBomValid("UTF-32LE");
        __CLR4_4_1iciicikylve38n.R.inc(23875);testRawBomValid("UTF-32");

        __CLR4_4_1iciicikylve38n.R.inc(23876);testRawBomInvalid("UTF-32BE-bom", "UTF-32BE", "UTF-32LE");
        __CLR4_4_1iciicikylve38n.R.inc(23877);testRawBomInvalid("UTF-32LE-bom", "UTF-32LE", "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23878);testRawBomInvalid("UTF-32LE-bom", "UTF-32LE", "UTF-8");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}


    @Test
    public void testHttp() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11m6pmpifb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testHttp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11m6pmpifb() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23879);
        // niallp 2010-10-06 - remove following 2 tests - I reinstated
        // checks for non-UTF-16 encodings (18 tests) and these failed
        // _testHttpValid("application/xml", "no-bom", "US-ASCII", null);
        // _testHttpValid("application/xml", "UTF-8-bom", "US-ASCII", null);
        __CLR4_4_1iciicikylve38n.R.inc(23880);testHttpValid("application/xml", "UTF-8-bom", "UTF-8", null);
        __CLR4_4_1iciicikylve38n.R.inc(23881);testHttpValid("application/xml", "UTF-8-bom", "UTF-8", "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23882);testHttpValid("application/xml;charset=UTF-8", "UTF-8-bom", "UTF-8", null);
        __CLR4_4_1iciicikylve38n.R.inc(23883);testHttpValid("application/xml;charset=\"UTF-8\"", "UTF-8-bom", "UTF-8", null);
        __CLR4_4_1iciicikylve38n.R.inc(23884);testHttpValid("application/xml;charset='UTF-8'", "UTF-8-bom", "UTF-8", null);
        __CLR4_4_1iciicikylve38n.R.inc(23885);testHttpValid("application/xml;charset=UTF-8", "UTF-8-bom", "UTF-8", "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23886);testHttpValid("application/xml;charset=UTF-16", "UTF-16BE-bom", "UTF-16BE", null);
        __CLR4_4_1iciicikylve38n.R.inc(23887);testHttpValid("application/xml;charset=UTF-16", "UTF-16BE-bom", "UTF-16BE", "UTF-16");
        __CLR4_4_1iciicikylve38n.R.inc(23888);testHttpValid("application/xml;charset=UTF-16", "UTF-16BE-bom", "UTF-16BE", "UTF-16BE");

        __CLR4_4_1iciicikylve38n.R.inc(23889);testHttpInvalid("application/xml;charset=UTF-16BE", "UTF-16BE-bom", "UTF-16BE", null);
        __CLR4_4_1iciicikylve38n.R.inc(23890);testHttpInvalid("application/xml;charset=UTF-16BE", "UTF-16BE-bom", "UTF-16BE", "UTF-16");
        __CLR4_4_1iciicikylve38n.R.inc(23891);testHttpInvalid("application/xml;charset=UTF-16BE", "UTF-16BE-bom", "UTF-16BE", "UTF-16BE");

        __CLR4_4_1iciicikylve38n.R.inc(23892);testHttpInvalid("application/xml;charset=UTF-32BE", "UTF-32BE-bom", "UTF-32BE", null);
        __CLR4_4_1iciicikylve38n.R.inc(23893);testHttpInvalid("application/xml;charset=UTF-32BE", "UTF-32BE-bom", "UTF-32BE", "UTF-32");
        __CLR4_4_1iciicikylve38n.R.inc(23894);testHttpInvalid("application/xml;charset=UTF-32BE", "UTF-32BE-bom", "UTF-32BE", "UTF-32BE");

        __CLR4_4_1iciicikylve38n.R.inc(23895);testHttpInvalid("application/xml", "UTF-8-bom", "US-ASCII", "US-ASCII");
        __CLR4_4_1iciicikylve38n.R.inc(23896);testHttpInvalid("application/xml;charset=UTF-16", "UTF-16LE", "UTF-8", "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23897);testHttpInvalid("application/xml;charset=UTF-16", "no-bom", "UTF-16BE", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23898);testHttpInvalid("application/xml;charset=UTF-32", "UTF-32LE", "UTF-8", "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23899);testHttpInvalid("application/xml;charset=UTF-32", "no-bom", "UTF-32BE", "UTF-32BE");

        __CLR4_4_1iciicikylve38n.R.inc(23900);testHttpValid("text/xml", "no-bom", "US-ASCII", null);
        __CLR4_4_1iciicikylve38n.R.inc(23901);testHttpValid("text/xml;charset=UTF-8", "UTF-8-bom", "UTF-8", "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23902);testHttpValid("text/xml;charset=UTF-8", "UTF-8-bom", "UTF-8", null);
        __CLR4_4_1iciicikylve38n.R.inc(23903);testHttpValid("text/xml;charset=UTF-16", "UTF-16BE-bom", "UTF-16BE", null);
        __CLR4_4_1iciicikylve38n.R.inc(23904);testHttpValid("text/xml;charset=UTF-16", "UTF-16BE-bom", "UTF-16BE", "UTF-16");
        __CLR4_4_1iciicikylve38n.R.inc(23905);testHttpValid("text/xml;charset=UTF-16", "UTF-16BE-bom", "UTF-16BE", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23906);testHttpValid("text/xml;charset=UTF-32", "UTF-32BE-bom", "UTF-32BE", null);
        __CLR4_4_1iciicikylve38n.R.inc(23907);testHttpValid("text/xml;charset=UTF-32", "UTF-32BE-bom", "UTF-32BE", "UTF-32");
        __CLR4_4_1iciicikylve38n.R.inc(23908);testHttpValid("text/xml;charset=UTF-32", "UTF-32BE-bom", "UTF-32BE", "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23909);testHttpValid("text/xml", "UTF-8-bom", "US-ASCII", null);

        __CLR4_4_1iciicikylve38n.R.inc(23910);testAlternateDefaultEncoding("application/xml", "UTF-8-bom", "UTF-8", null, null);
        __CLR4_4_1iciicikylve38n.R.inc(23911);testAlternateDefaultEncoding("application/xml", "no-bom", "US-ASCII", null, "US-ASCII");
        __CLR4_4_1iciicikylve38n.R.inc(23912);testAlternateDefaultEncoding("application/xml", "UTF-8-bom", "UTF-8", null, "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23913);testAlternateDefaultEncoding("text/xml", "no-bom", "US-ASCII", null, null);
        __CLR4_4_1iciicikylve38n.R.inc(23914);testAlternateDefaultEncoding("text/xml", "no-bom", "US-ASCII", null, "US-ASCII");
        __CLR4_4_1iciicikylve38n.R.inc(23915);testAlternateDefaultEncoding("text/xml", "no-bom", "US-ASCII", null, "UTF-8");

        __CLR4_4_1iciicikylve38n.R.inc(23916);testHttpInvalid("text/xml;charset=UTF-16BE", "UTF-16BE-bom", "UTF-16BE", null);
        __CLR4_4_1iciicikylve38n.R.inc(23917);testHttpInvalid("text/xml;charset=UTF-16BE", "UTF-16BE-bom", "UTF-16BE", "UTF-16");
        __CLR4_4_1iciicikylve38n.R.inc(23918);testHttpInvalid("text/xml;charset=UTF-16BE", "UTF-16BE-bom", "UTF-16BE", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23919);testHttpInvalid("text/xml;charset=UTF-16", "no-bom", "UTF-16BE", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23920);testHttpInvalid("text/xml;charset=UTF-16", "no-bom", "UTF-16BE", null);

        __CLR4_4_1iciicikylve38n.R.inc(23921);testHttpInvalid("text/xml;charset=UTF-32BE", "UTF-32BE-bom", "UTF-32BE", null);
        __CLR4_4_1iciicikylve38n.R.inc(23922);testHttpInvalid("text/xml;charset=UTF-32BE", "UTF-32BE-bom", "UTF-32BE", "UTF-32");
        __CLR4_4_1iciicikylve38n.R.inc(23923);testHttpInvalid("text/xml;charset=UTF-32BE", "UTF-32BE-bom", "UTF-32BE", "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23924);testHttpInvalid("text/xml;charset=UTF-32", "no-bom", "UTF-32BE", "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23925);testHttpInvalid("text/xml;charset=UTF-32", "no-bom", "UTF-32BE", null);

        __CLR4_4_1iciicikylve38n.R.inc(23926);testHttpLenient("text/xml", "no-bom", "US-ASCII", null, "US-ASCII");
        __CLR4_4_1iciicikylve38n.R.inc(23927);testHttpLenient("text/xml;charset=UTF-8", "UTF-8-bom", "UTF-8", "UTF-8", "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23928);testHttpLenient("text/xml;charset=UTF-8", "UTF-8-bom", "UTF-8", null, "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23929);testHttpLenient("text/xml;charset=UTF-16", "UTF-16BE-bom", "UTF-16BE", null, "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23930);testHttpLenient("text/xml;charset=UTF-16", "UTF-16BE-bom", "UTF-16BE", "UTF-16", "UTF-16");
        __CLR4_4_1iciicikylve38n.R.inc(23931);testHttpLenient("text/xml;charset=UTF-16", "UTF-16BE-bom", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23932);testHttpLenient("text/xml;charset=UTF-32", "UTF-32BE-bom", "UTF-32BE", null, "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23933);testHttpLenient("text/xml;charset=UTF-32", "UTF-32BE-bom", "UTF-32BE", "UTF-32", "UTF-32");
        __CLR4_4_1iciicikylve38n.R.inc(23934);testHttpLenient("text/xml;charset=UTF-32", "UTF-32BE-bom", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23935);testHttpLenient("text/xml", "UTF-8-bom", "US-ASCII", null, "US-ASCII");

        __CLR4_4_1iciicikylve38n.R.inc(23936);testHttpLenient("text/xml;charset=UTF-16BE", "UTF-16BE-bom", "UTF-16BE", null, "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23937);testHttpLenient("text/xml;charset=UTF-16BE", "UTF-16BE-bom", "UTF-16BE", "UTF-16", "UTF-16");
        __CLR4_4_1iciicikylve38n.R.inc(23938);testHttpLenient("text/xml;charset=UTF-16BE", "UTF-16BE-bom", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23939);testHttpLenient("text/xml;charset=UTF-16", "no-bom", "UTF-16BE", "UTF-16BE", "UTF-16BE");
        __CLR4_4_1iciicikylve38n.R.inc(23940);testHttpLenient("text/xml;charset=UTF-16", "no-bom", "UTF-16BE", null, "UTF-16");

        __CLR4_4_1iciicikylve38n.R.inc(23941);testHttpLenient("text/xml;charset=UTF-32BE", "UTF-32BE-bom", "UTF-32BE", null, "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23942);testHttpLenient("text/xml;charset=UTF-32BE", "UTF-32BE-bom", "UTF-32BE", "UTF-32", "UTF-32");
        __CLR4_4_1iciicikylve38n.R.inc(23943);testHttpLenient("text/xml;charset=UTF-32BE", "UTF-32BE-bom", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23944);testHttpLenient("text/xml;charset=UTF-32", "no-bom", "UTF-32BE", "UTF-32BE", "UTF-32BE");
        __CLR4_4_1iciicikylve38n.R.inc(23945);testHttpLenient("text/xml;charset=UTF-32", "no-bom", "UTF-32BE", null, "UTF-32");

        __CLR4_4_1iciicikylve38n.R.inc(23946);testHttpLenient("text/html", "no-bom", "US-ASCII", "US-ASCII", "US-ASCII");
        __CLR4_4_1iciicikylve38n.R.inc(23947);testHttpLenient("text/html", "no-bom", "US-ASCII", null, "US-ASCII");
        __CLR4_4_1iciicikylve38n.R.inc(23948);testHttpLenient("text/html;charset=UTF-8", "no-bom", "US-ASCII", "UTF-8", "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23949);testHttpLenient("text/html;charset=UTF-16BE", "no-bom", "US-ASCII", "UTF-8", "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(23950);testHttpLenient("text/html;charset=UTF-32BE", "no-bom", "US-ASCII", "UTF-8", "UTF-8");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    // Turkish language has specific rules to convert dotted and dottless i character.
    @Test
    @DefaultLocale(language = "tr")
    public void testLowerCaseEncodingWithTurkishLocale_IO_557() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1za8psyihb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testLowerCaseEncodingWithTurkishLocale_IO_557",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1za8psyihb() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23951);
        __CLR4_4_1iciicikylve38n.R.inc(23952);final String[] encodings = { "iso8859-1", "us-ascii", "utf-8" };
        __CLR4_4_1iciicikylve38n.R.inc(23953);for (final String encoding : encodings) {{
            __CLR4_4_1iciicikylve38n.R.inc(23954);final String xml = getXML("no-bom", XML3, encoding, encoding);
            class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1iciicikylve38n.R.inc(23955);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1iciicikylve38n.R.inc(23956);}};final ByteArrayInputStream is = new ByteArrayInputStream(xml.getBytes(encoding));
                    __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1iciicikylve38n.R.inc(23957);}};final XmlStreamReader xmlReader = new XmlStreamReader(is)) {
                __CLR4_4_1iciicikylve38n.R.inc(23958);assertTrue(encoding.equalsIgnoreCase(xmlReader.getEncoding()), "Check encoding : " + encoding);
                __CLR4_4_1iciicikylve38n.R.inc(23959);assertEquals(xml, IOUtils.toString(xmlReader), "Check content");
            }
        }
    }}finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testRawContent() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dthhl6ihk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testRawContent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dthhl6ihk() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23960);
        __CLR4_4_1iciicikylve38n.R.inc(23961);final String encoding = "UTF-8";
        __CLR4_4_1iciicikylve38n.R.inc(23962);final String xml = getXML("no-bom", XML3, encoding, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23963);final ByteArrayInputStream is = new ByteArrayInputStream(xml.getBytes(encoding));
        __CLR4_4_1iciicikylve38n.R.inc(23964);final XmlStreamReader xmlReader = new XmlStreamReader(is);
        __CLR4_4_1iciicikylve38n.R.inc(23965);assertEquals(xmlReader.getEncoding(), encoding, "Check encoding");
        __CLR4_4_1iciicikylve38n.R.inc(23966);assertEquals(xml, IOUtils.toString(xmlReader), "Check content");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    @Test
    public void testHttpContent() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),23967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146td8mihr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testHttpContent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146td8mihr() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(23967);
        __CLR4_4_1iciicikylve38n.R.inc(23968);final String encoding = "UTF-8";
        __CLR4_4_1iciicikylve38n.R.inc(23969);final String xml = getXML("no-bom", XML3, encoding, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23970);final ByteArrayInputStream is = new ByteArrayInputStream(xml.getBytes(encoding));
        __CLR4_4_1iciicikylve38n.R.inc(23971);final XmlStreamReader xmlReader = new XmlStreamReader(is, encoding);
        __CLR4_4_1iciicikylve38n.R.inc(23972);assertEquals(xmlReader.getEncoding(), encoding, "Check encoding");
        __CLR4_4_1iciicikylve38n.R.inc(23973);assertEquals(xml, IOUtils.toString(xmlReader), "Check content");
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    public void testAlternateDefaultEncoding(final String cT, final String bomEnc,
                                              final String streamEnc, final String prologEnc, final String alternateEnc)
            throws Exception {try{__CLR4_4_1iciicikylve38n.R.inc(23974);
        __CLR4_4_1iciicikylve38n.R.inc(23975);final InputStream is = getXmlInputStream(bomEnc, (((prologEnc == null )&&(__CLR4_4_1iciicikylve38n.R.iget(23976)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(23977)==0&false))? XML1
                : XML3, streamEnc, prologEnc);
        __CLR4_4_1iciicikylve38n.R.inc(23978);final XmlStreamReader xmlReader = new XmlStreamReader(is, cT, false, alternateEnc);
        __CLR4_4_1iciicikylve38n.R.inc(23979);if ((((!streamEnc.equals("UTF-16"))&&(__CLR4_4_1iciicikylve38n.R.iget(23980)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(23981)==0&false))) {{
            // we can not assert things here because UTF-8, US-ASCII and
            // ISO-8859-1 look alike for the chars used for detection
            // (niallp 2010-10-06 - I re-instated the check below - the tests(6) passed)
            __CLR4_4_1iciicikylve38n.R.inc(23982);final String enc = (((alternateEnc != null )&&(__CLR4_4_1iciicikylve38n.R.iget(23983)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(23984)==0&false))? alternateEnc : streamEnc;
            __CLR4_4_1iciicikylve38n.R.inc(23985);assertEquals(xmlReader.getEncoding(), enc);
        } }else {{
            //String enc = (alternateEnc != null) ? alternateEnc : streamEnc;
            __CLR4_4_1iciicikylve38n.R.inc(23986);assertEquals(xmlReader.getEncoding().substring(0,
                    streamEnc.length()), streamEnc);
        }
        }__CLR4_4_1iciicikylve38n.R.inc(23987);xmlReader.close();
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    public void testHttpValid(final String cT, final String bomEnc, final String streamEnc,
                               final String prologEnc) throws Exception {try{__CLR4_4_1iciicikylve38n.R.inc(23988);
        __CLR4_4_1iciicikylve38n.R.inc(23989);final InputStream is = getXmlInputStream(bomEnc,
                (((prologEnc == null )&&(__CLR4_4_1iciicikylve38n.R.iget(23990)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(23991)==0&false))? XML1 : XML3, streamEnc, prologEnc);
        __CLR4_4_1iciicikylve38n.R.inc(23992);final XmlStreamReader xmlReader = new XmlStreamReader(is, cT, false);
        __CLR4_4_1iciicikylve38n.R.inc(23993);if ((((!streamEnc.equals("UTF-16"))&&(__CLR4_4_1iciicikylve38n.R.iget(23994)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(23995)==0&false))) {{
            // we can not assert things here because UTF-8, US-ASCII and
            // ISO-8859-1 look alike for the chars used for detection
            // (niallp 2010-10-06 - I re-instated the check below and removed the 2 tests that failed)
            __CLR4_4_1iciicikylve38n.R.inc(23996);assertEquals(xmlReader.getEncoding(), streamEnc);
        } }else {{
            __CLR4_4_1iciicikylve38n.R.inc(23997);assertEquals(xmlReader.getEncoding().substring(0,
                    streamEnc.length()), streamEnc);
        }
        }__CLR4_4_1iciicikylve38n.R.inc(23998);xmlReader.close();
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    protected void testHttpInvalid(final String cT, final String bomEnc, final String streamEnc,
                                    final String prologEnc) throws Exception {try{__CLR4_4_1iciicikylve38n.R.inc(23999);
        __CLR4_4_1iciicikylve38n.R.inc(24000);final InputStream is = getXmlInputStream(bomEnc,
                (((prologEnc == null )&&(__CLR4_4_1iciicikylve38n.R.iget(24001)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(24002)==0&false))? XML2 : XML3, streamEnc, prologEnc);
        __CLR4_4_1iciicikylve38n.R.inc(24003);try {
            __CLR4_4_1iciicikylve38n.R.inc(24004);(new XmlStreamReader(is, cT, false)).close();
            __CLR4_4_1iciicikylve38n.R.inc(24005);fail("It should have failed for HTTP Content-type " + cT + ", BOM "
                    + bomEnc + ", streamEnc " + streamEnc + " and prologEnc "
                    + prologEnc);
        } catch (final IOException ex) {
            __CLR4_4_1iciicikylve38n.R.inc(24006);assertTrue(ex.getMessage().contains("Invalid encoding,"));
        }
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    protected void testHttpLenient(final String cT, final String bomEnc, final String streamEnc,
                                    final String prologEnc, final String shouldbe) throws Exception {try{__CLR4_4_1iciicikylve38n.R.inc(24007);
        __CLR4_4_1iciicikylve38n.R.inc(24008);final InputStream is = getXmlInputStream(bomEnc,
                (((prologEnc == null )&&(__CLR4_4_1iciicikylve38n.R.iget(24009)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(24010)==0&false))? XML2 : XML3, streamEnc, prologEnc);
        __CLR4_4_1iciicikylve38n.R.inc(24011);final XmlStreamReader xmlReader = new XmlStreamReader(is, cT, true);
        __CLR4_4_1iciicikylve38n.R.inc(24012);assertEquals(xmlReader.getEncoding(), shouldbe);
        __CLR4_4_1iciicikylve38n.R.inc(24013);xmlReader.close();
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    private static final String ENCODING_ATTRIBUTE_XML = "<?xml version=\"1.0\" ?> \n"
            + "<atom:feed xmlns:atom=\"http://www.w3.org/2005/Atom\">\n"
            + "\n"
            + "  <atom:entry>\n"
            + "    <atom:title encoding='base64'><![CDATA\n"
            + "aW5nTGluZSIgLz4";

    @Test
    public void testEncodingAttributeXML() throws Exception {__CLR4_4_1iciicikylve38n.R.globalSliceStart(getClass().getName(),24014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgqi87ij2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iciicikylve38n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iciicikylve38n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderTest.testEncodingAttributeXML",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgqi87ij2() throws Exception{try{__CLR4_4_1iciicikylve38n.R.inc(24014);
        __CLR4_4_1iciicikylve38n.R.inc(24015);final InputStream is = new ByteArrayInputStream(ENCODING_ATTRIBUTE_XML
                .getBytes(StandardCharsets.UTF_8));
        __CLR4_4_1iciicikylve38n.R.inc(24016);final XmlStreamReader xmlReader = new XmlStreamReader(is, "", true);
        __CLR4_4_1iciicikylve38n.R.inc(24017);assertEquals(xmlReader.getEncoding(), "UTF-8");
        __CLR4_4_1iciicikylve38n.R.inc(24018);xmlReader.close();
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    // XML Stream generator

    private static final int[] NO_BOM_BYTES = {};
    private static final int[] UTF_16BE_BOM_BYTES = {0xFE, 0xFF};
    private static final int[] UTF_16LE_BOM_BYTES = {0xFF, 0XFE};
    private static final int[] UTF_32BE_BOM_BYTES = {0x00, 0x00, 0xFE, 0xFF};
    private static final int[] UTF_32LE_BOM_BYTES = {0xFF, 0XFE, 0x00, 0x00};
    private static final int[] UTF_8_BOM_BYTES = {0xEF, 0xBB, 0xBF};

    private static final Map<String, int[]> BOMs = new HashMap<>();

    static {try{__CLR4_4_1iciicikylve38n.R.inc(24019);
        __CLR4_4_1iciicikylve38n.R.inc(24020);BOMs.put("no-bom", NO_BOM_BYTES);
        __CLR4_4_1iciicikylve38n.R.inc(24021);BOMs.put("UTF-16BE-bom", UTF_16BE_BOM_BYTES);
        __CLR4_4_1iciicikylve38n.R.inc(24022);BOMs.put("UTF-16LE-bom", UTF_16LE_BOM_BYTES);
        __CLR4_4_1iciicikylve38n.R.inc(24023);BOMs.put("UTF-32BE-bom", UTF_32BE_BOM_BYTES);
        __CLR4_4_1iciicikylve38n.R.inc(24024);BOMs.put("UTF-32LE-bom", UTF_32LE_BOM_BYTES);
        __CLR4_4_1iciicikylve38n.R.inc(24025);BOMs.put("UTF-16-bom", NO_BOM_BYTES); // it's added by the writer
        __CLR4_4_1iciicikylve38n.R.inc(24026);BOMs.put("UTF-8-bom", UTF_8_BOM_BYTES);
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    private static final MessageFormat XML = new MessageFormat(
            "<root>{2}</root>");
    private static final MessageFormat XML_WITH_PROLOG = new MessageFormat(
            "<?xml version=\"1.0\"?>\n<root>{2}</root>");
    private static final MessageFormat XML_WITH_PROLOG_AND_ENCODING_DOUBLE_QUOTES = new MessageFormat(
            "<?xml version=\"1.0\" encoding=\"{1}\"?>\n<root>{2}</root>");
    private static final MessageFormat XML_WITH_PROLOG_AND_ENCODING_SINGLE_QUOTES = new MessageFormat(
            "<?xml version=\"1.0\" encoding=''{1}''?>\n<root>{2}</root>");
    private static final MessageFormat XML_WITH_PROLOG_AND_ENCODING_SPACED_SINGLE_QUOTES = new MessageFormat(
            "<?xml version=\"1.0\" encoding =  \t \n \r''{1}''?>\n<root>{2}</root>");

    private static final MessageFormat INFO = new MessageFormat(
            "\nBOM : {0}\nDoc : {1}\nStream Enc : {2}\nProlog Enc : {3}\n");

    private static final Map<String, MessageFormat> XMLs = new HashMap<>();

    static {try{__CLR4_4_1iciicikylve38n.R.inc(24027);
        __CLR4_4_1iciicikylve38n.R.inc(24028);XMLs.put(XML1, XML);
        __CLR4_4_1iciicikylve38n.R.inc(24029);XMLs.put(XML2, XML_WITH_PROLOG);
        __CLR4_4_1iciicikylve38n.R.inc(24030);XMLs.put(XML3, XML_WITH_PROLOG_AND_ENCODING_DOUBLE_QUOTES);
        __CLR4_4_1iciicikylve38n.R.inc(24031);XMLs.put(XML4, XML_WITH_PROLOG_AND_ENCODING_SINGLE_QUOTES);
        __CLR4_4_1iciicikylve38n.R.inc(24032);XMLs.put(XML5, XML_WITH_PROLOG_AND_ENCODING_SPACED_SINGLE_QUOTES);
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    /**
     * @param bomType   no-bom, UTF-16BE-bom, UTF-16LE-bom, UTF-8-bom
     * @param xmlType   xml, xml-prolog, xml-prolog-charset
     * @param streamEnc encoding of the stream
     * @param prologEnc encoding of the prolog
     * @return XML stream
     * @throws IOException If an I/O error occurs
     */
    protected InputStream getXmlInputStream(final String bomType, final String xmlType,
        final String streamEnc, final String prologEnc) throws IOException {try{__CLR4_4_1iciicikylve38n.R.inc(24033);
        __CLR4_4_1iciicikylve38n.R.inc(24034);final ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        __CLR4_4_1iciicikylve38n.R.inc(24035);int[] bom = BOMs.get(bomType);
        __CLR4_4_1iciicikylve38n.R.inc(24036);if ((((bom == null)&&(__CLR4_4_1iciicikylve38n.R.iget(24037)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(24038)==0&false))) {{
            __CLR4_4_1iciicikylve38n.R.inc(24039);bom = new int[0];
        }
        }__CLR4_4_1iciicikylve38n.R.inc(24040);for (final int element : bom) {{
            __CLR4_4_1iciicikylve38n.R.inc(24041);baos.write(element);
        }
        }class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1iciicikylve38n.R.inc(24042);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1iciicikylve38n.R.inc(24043);}};final Writer writer = new OutputStreamWriter(baos, streamEnc)) {
            __CLR4_4_1iciicikylve38n.R.inc(24044);final String xmlDoc = getXML(bomType, xmlType, streamEnc, prologEnc);
            __CLR4_4_1iciicikylve38n.R.inc(24045);writer.write(xmlDoc);

            // PADDING TO TEST THINGS WORK BEYOND PUSHBACK_SIZE
            __CLR4_4_1iciicikylve38n.R.inc(24046);writer.write("<da>\n");
            __CLR4_4_1iciicikylve38n.R.inc(24047);for (int i = 0; (((i < 10000)&&(__CLR4_4_1iciicikylve38n.R.iget(24048)!=0|true))||(__CLR4_4_1iciicikylve38n.R.iget(24049)==0&false)); i++) {{
                __CLR4_4_1iciicikylve38n.R.inc(24050);writer.write("<do/>\n");
            }
            }__CLR4_4_1iciicikylve38n.R.inc(24051);writer.write("</da>\n");

        }
        __CLR4_4_1iciicikylve38n.R.inc(24052);return new ByteArrayInputStream(baos.toByteArray());
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}

    /**
     * Create the XML.
     */
    private String getXML(final String bomType, final String xmlType,
                          final String streamEnc, final String prologEnc) {try{__CLR4_4_1iciicikylve38n.R.inc(24053);
        __CLR4_4_1iciicikylve38n.R.inc(24054);final MessageFormat xml = XMLs.get(xmlType);
        __CLR4_4_1iciicikylve38n.R.inc(24055);final String info = INFO.format(new Object[]{bomType, xmlType, prologEnc});
        __CLR4_4_1iciicikylve38n.R.inc(24056);return xml.format(new Object[]{streamEnc, prologEnc, info});
    }finally{__CLR4_4_1iciicikylve38n.R.flushNeeded();}}
}
