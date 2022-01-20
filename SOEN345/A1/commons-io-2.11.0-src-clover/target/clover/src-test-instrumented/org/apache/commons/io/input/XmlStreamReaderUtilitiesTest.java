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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 * Test the Encoding Utilities part of {@link XmlStreamReader}.
 */
public class XmlStreamReaderUtilitiesTest {static class __CLR4_4_1ik9ik9kylve3ac{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,24252,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String RAWMGS1 = "encoding mismatch";
    private static final String RAWMGS2 = "unknown BOM";
    private static final String HTTPMGS1 = "BOM must be NULL";
    private static final String HTTPMGS2 = "encoding mismatch";
    private static final String HTTPMGS3 = "Invalid MIME";

    private static final String APPXML         = "application/xml";
    private static final String APPXML_UTF8    = "application/xml;charset=UTF-8";
    private static final String APPXML_UTF16   = "application/xml;charset=UTF-16";
    private static final String APPXML_UTF32   = "application/xml;charset=UTF-32";
    private static final String APPXML_UTF16BE = "application/xml;charset=UTF-16BE";
    private static final String APPXML_UTF16LE = "application/xml;charset=UTF-16LE";
    private static final String APPXML_UTF32BE = "application/xml;charset=UTF-32BE";
    private static final String APPXML_UTF32LE = "application/xml;charset=UTF-32LE";
    private static final String TXTXML = "text/xml";

    @Test
    public void testContentTypeEncoding() {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1klwql7ik9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testContentTypeEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1klwql7ik9(){try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24057);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24058);checkContentTypeEncoding(null, null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24059);checkContentTypeEncoding(null, "");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24060);checkContentTypeEncoding(null, "application/xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24061);checkContentTypeEncoding(null, "application/xml;");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24062);checkContentTypeEncoding(null, "multipart/mixed;boundary=frontier");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24063);checkContentTypeEncoding(null, "multipart/mixed;boundary='frontier'");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24064);checkContentTypeEncoding(null, "multipart/mixed;boundary=\"frontier\"");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24065);checkContentTypeEncoding("UTF-16", "application/xml;charset=utf-16");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24066);checkContentTypeEncoding("UTF-16", "application/xml;charset=UTF-16");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24067);checkContentTypeEncoding("UTF-16", "application/xml;charset='UTF-16'");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24068);checkContentTypeEncoding("UTF-16", "application/xml;charset=\"UTF-16\"");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24069);checkContentTypeEncoding("UTF-32", "application/xml;charset=utf-32");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24070);checkContentTypeEncoding("UTF-32", "application/xml;charset=UTF-32");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24071);checkContentTypeEncoding("UTF-32", "application/xml;charset='UTF-32'");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24072);checkContentTypeEncoding("UTF-32", "application/xml;charset=\"UTF-32\"");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    private void checkContentTypeEncoding(final String expected, final String httpContentType) {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24073);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24074);assertEquals(expected, XmlStreamReader.getContentTypeEncoding(httpContentType), "ContentTypeEncoding=[" + httpContentType + "]");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testContentTypeMime() {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1609zvgikr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testContentTypeMime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1609zvgikr(){try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24075);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24076);checkContentTypeMime(null, null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24077);checkContentTypeMime("", "");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24078);checkContentTypeMime("application/xml", "application/xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24079);checkContentTypeMime("application/xml", "application/xml;");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24080);checkContentTypeMime("application/xml", "application/xml;charset=utf-16");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24081);checkContentTypeMime("application/xml", "application/xml;charset=utf-32");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    private void checkContentTypeMime(final String expected, final String httpContentType) {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24082);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24083);assertEquals(expected, XmlStreamReader.getContentTypeMime(httpContentType), "ContentTypeMime=[" + httpContentType + "]");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testAppXml() {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15v5p3lil0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testAppXml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15v5p3lil0(){try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24084);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24085);checkAppXml(false, null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24086);checkAppXml(false, "");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24087);checkAppXml(true,  "application/xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24088);checkAppXml(true,  "application/xml-dtd");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24089);checkAppXml(true,  "application/xml-external-parsed-entity");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24090);checkAppXml(true,  "application/soap+xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24091);checkAppXml(true,  "application/atom+xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24092);checkAppXml(false, "application/atomxml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24093);checkAppXml(false, "text/xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24094);checkAppXml(false, "text/atom+xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24095);checkAppXml(true,  "application/xml-dtd");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24096);checkAppXml(true,  "application/xml-external-parsed-entity");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @SuppressWarnings("boxing")
    private void checkAppXml(final boolean expected, final String mime) {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24097);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24098);assertEquals(expected, XmlStreamReader.isAppXml(mime), "Mime=[" + mime + "]");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testTextXml() {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwhurlilf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testTextXml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwhurlilf(){try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24099);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24100);checkTextXml(false, null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24101);checkTextXml(false, "");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24102);checkTextXml(true,  "text/xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24103);checkTextXml(true,  "text/xml-external-parsed-entity");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24104);checkTextXml(true,  "text/soap+xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24105);checkTextXml(true,  "text/atom+xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24106);checkTextXml(false, "text/atomxml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24107);checkTextXml(false, "application/xml");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24108);checkTextXml(false, "application/atom+xml");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @SuppressWarnings("boxing")
    private void checkTextXml(final boolean expected, final String mime) {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24109);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24110);assertEquals(expected, XmlStreamReader.isTextXml(mime), "Mime=[" + mime + "]");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testCalculateRawEncodingNoBOM() throws IOException {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmahmnilr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testCalculateRawEncodingNoBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmahmnilr() throws IOException{try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24111);
        // No BOM        Expected    BOM         Guess       XML         Default
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24112);checkRawError(RAWMGS2,       "UTF-32",   null,       null,       null);
        //
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24113);checkRawEncoding("UTF-8",    null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24114);checkRawEncoding("UTF-8",    null,       "UTF-16BE", null,       null); /* why default & not Guess? */
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24115);checkRawEncoding("UTF-8",    null,       null,       "UTF-16BE", null); /* why default & not XMLEnc? */
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24116);checkRawEncoding("UTF-8",    null,       "UTF-8",    "UTF-8",    "UTF-16BE");
        //
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24117);checkRawEncoding("UTF-16BE", null,       "UTF-16BE", "UTF-16BE", null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24118);checkRawEncoding("UTF-16BE", null,       null,       null,       "UTF-16BE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24119);checkRawEncoding("UTF-16BE", null,       "UTF-8",    null,       "UTF-16BE"); /* why default & not Guess? */
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24120);checkRawEncoding("UTF-16BE", null,       null,       "UTF-8",    "UTF-16BE"); /* why default & not Guess? */
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24121);checkRawEncoding("UTF-16BE", null,       "UTF-16BE", "UTF-16",   null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24122);checkRawEncoding("UTF-16LE", null,       "UTF-16LE", "UTF-16",   null);
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testCalculateRawEncodingStandard() throws IOException {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mlsu39im3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testCalculateRawEncodingStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mlsu39im3() throws IOException{try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24123);
        // Standard BOM Checks           BOM         Other       Default
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24124);testCalculateRawEncodingStandard("UTF-8",    "UTF-16BE", "UTF-16LE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24125);testCalculateRawEncodingStandard("UTF-16BE", "UTF-8",    "UTF-16LE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24126);testCalculateRawEncodingStandard("UTF-16LE", "UTF-8",    "UTF-16BE");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testCalculateRawEncodingStandardUtf32() throws IOException {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128hrg7im7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testCalculateRawEncodingStandardUtf32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128hrg7im7() throws IOException{try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24127);
        // Standard BOM Checks           BOM         Other       Default
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24128);testCalculateRawEncodingStandard("UTF-8",    "UTF-32BE", "UTF-32LE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24129);testCalculateRawEncodingStandard("UTF-32BE", "UTF-8",    "UTF-32LE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24130);testCalculateRawEncodingStandard("UTF-32LE", "UTF-8",    "UTF-32BE");
}finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    private void testCalculateRawEncodingStandard(final String bomEnc, final String otherEnc, final String defaultEnc) throws IOException {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24131);
        //               Expected   BOM        Guess     XMLEnc    Default
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24132);checkRawEncoding(bomEnc,    bomEnc,    null,     null,     defaultEnc);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24133);checkRawEncoding(bomEnc,    bomEnc,    bomEnc,   null,     defaultEnc);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24134);checkRawError(RAWMGS1,      bomEnc,    otherEnc, null,     defaultEnc);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24135);checkRawEncoding(bomEnc,    bomEnc,    null,     bomEnc,   defaultEnc);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24136);checkRawError(RAWMGS1,      bomEnc,    null,     otherEnc, defaultEnc);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24137);checkRawEncoding(bomEnc,    bomEnc,    bomEnc,   bomEnc,   defaultEnc);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24138);checkRawError(RAWMGS1,      bomEnc,    bomEnc,   otherEnc, defaultEnc);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24139);checkRawError(RAWMGS1,      bomEnc,    otherEnc, bomEnc,   defaultEnc);

    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testCalculateRawEncodingAdditionalUTF16() throws IOException {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ddnq3imk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testCalculateRawEncodingAdditionalUTF16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ddnq3imk() throws IOException{try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24140);
        //                           BOM         Guess       XML         Default
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24141);checkRawError(RAWMGS1,       "UTF-16BE", "UTF-16",   null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24142);checkRawEncoding("UTF-16BE", "UTF-16BE", null,       "UTF-16",   null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24143);checkRawEncoding("UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16",   null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24144);checkRawError(RAWMGS1,       "UTF-16BE", null,       "UTF-16LE", null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24145);checkRawError(RAWMGS1,       "UTF-16BE", "UTF-16BE", "UTF-16LE", null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24146);checkRawError(RAWMGS1,       "UTF-16LE", "UTF-16",   null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24147);checkRawEncoding("UTF-16LE", "UTF-16LE", null,       "UTF-16",   null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24148);checkRawEncoding("UTF-16LE", "UTF-16LE", "UTF-16LE", "UTF-16",   null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24149);checkRawError(RAWMGS1,       "UTF-16LE", null,       "UTF-16BE", null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24150);checkRawError(RAWMGS1,       "UTF-16LE", "UTF-16LE", "UTF-16BE", null);
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testCalculateRawEncodingAdditionalUTF32() throws IOException {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryrrs1imv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testCalculateRawEncodingAdditionalUTF32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryrrs1imv() throws IOException{try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24151);
        //                           BOM         Guess       XML         Default
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24152);checkRawError(RAWMGS1,       "UTF-32BE", "UTF-32",   null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24153);checkRawEncoding("UTF-32BE", "UTF-32BE", null,       "UTF-32",   null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24154);checkRawEncoding("UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32",   null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24155);checkRawError(RAWMGS1,       "UTF-32BE", null,       "UTF-32LE", null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24156);checkRawError(RAWMGS1,       "UTF-32BE", "UTF-32BE", "UTF-32LE", null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24157);checkRawError(RAWMGS1,       "UTF-32LE", "UTF-32",   null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24158);checkRawEncoding("UTF-32LE", "UTF-32LE", null,       "UTF-32",   null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24159);checkRawEncoding("UTF-32LE", "UTF-32LE", "UTF-32LE", "UTF-32",   null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24160);checkRawError(RAWMGS1,       "UTF-32LE", null,       "UTF-32BE", null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24161);checkRawError(RAWMGS1,       "UTF-32LE", "UTF-32LE", "UTF-32BE", null);
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    private void checkRawEncoding(final String expected,
            final String bomEnc, final String xmlGuessEnc, final String xmlEnc, final String defaultEncoding) throws IOException {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24162);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24163);final StringBuilder builder = new StringBuilder();
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24164);builder.append("RawEncoding: ").append(bomEnc).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24165);builder.append("bomEnc=[").append(bomEnc).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24166);builder.append("xmlGuessEnc=[").append(xmlGuessEnc).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24167);builder.append("xmlEnc=[").append(xmlEnc).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24168);builder.append("defaultEncoding=[").append(defaultEncoding).append("],");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24169);final String encoding = calculateRawEncoding(bomEnc,xmlGuessEnc,xmlEnc, defaultEncoding);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24170);assertEquals(expected, encoding, builder.toString());
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    protected String calculateRawEncoding(final String bomEnc, final String xmlGuessEnc, final String xmlEnc,
            final String defaultEncoding) throws IOException {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24171);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24172);final MockXmlStreamReader mock = new MockXmlStreamReader(defaultEncoding);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24173);final String enc = mock.calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24174);mock.close();
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24175);return enc;
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    private void checkRawError(final String msgSuffix,
            final String bomEnc, final String xmlGuessEnc, final String xmlEnc, final String defaultEncoding) {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24176);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24177);try {
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24178);checkRawEncoding("XmlStreamReaderException", bomEnc, xmlGuessEnc, xmlEnc, defaultEncoding);
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24179);fail("Expected XmlStreamReaderException");
        } catch (final XmlStreamReaderException e) {
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24180);assertTrue(e.getMessage().startsWith("Invalid encoding"), "Msg Start: " + e.getMessage());
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24181);assertTrue(e.getMessage().endsWith(msgSuffix), "Msg End: "   + e.getMessage());
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24182);assertEquals(bomEnc, e.getBomEncoding(), "bomEnc");
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24183);assertEquals(xmlGuessEnc, e.getXmlGuessEncoding(), "xmlGuessEnc");
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24184);assertEquals(xmlEnc, e.getXmlEncoding(), "xmlEnc");
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24185);assertNull(e.getContentTypeEncoding(), "ContentTypeEncoding");
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24186);assertNull(e.getContentTypeMime(), "ContentTypeMime");
        } catch (final Exception e) {
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24187);fail("Expected XmlStreamReaderException, but threw " + e);
        }
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testCalculateHttpEncoding() throws IOException {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkfw6inw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testCalculateHttpEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkfw6inw() throws IOException{try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24188);
        // No BOM        Expected     Lenient cType           BOM         Guess       XML         Default
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24189);checkHttpError(HTTPMGS3,      true,   null,           null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24190);checkHttpError(HTTPMGS3,      false,  null,           null,       null,       "UTF-8",    null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24191);checkHttpEncoding("UTF-8",    true,   null,           null,       null,       "UTF-8",    null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24192);checkHttpEncoding("UTF-16LE", true,   null,           null,       null,       "UTF-16LE", null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24193);checkHttpError(HTTPMGS3,      false,  "text/css",     null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24194);checkHttpEncoding("US-ASCII", false,  TXTXML,         null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24195);checkHttpEncoding("UTF-16BE", false,  TXTXML,         null,       null,       null,       "UTF-16BE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24196);checkHttpEncoding("UTF-8",    false,  APPXML,         null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24197);checkHttpEncoding("UTF-16BE", false,  APPXML,         null,       null,       null,       "UTF-16BE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24198);checkHttpEncoding("UTF-8",    false,  APPXML,         "UTF-8",    null,       null,       "UTF-16BE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24199);checkHttpEncoding("UTF-16LE", false,  APPXML_UTF16LE, null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24200);checkHttpEncoding("UTF-16BE", false,  APPXML_UTF16BE, null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24201);checkHttpError(HTTPMGS1,      false,  APPXML_UTF16LE, "UTF-16LE", null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24202);checkHttpError(HTTPMGS1,      false,  APPXML_UTF16BE, "UTF-16BE", null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24203);checkHttpError(HTTPMGS2,      false,  APPXML_UTF16,   null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24204);checkHttpError(HTTPMGS2,      false,  APPXML_UTF16,   "UTF-8",    null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24205);checkHttpEncoding("UTF-16LE", false,  APPXML_UTF16,   "UTF-16LE", null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24206);checkHttpEncoding("UTF-16BE", false,  APPXML_UTF16,   "UTF-16BE", null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24207);checkHttpEncoding("UTF-8",    false,  APPXML_UTF8,    null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24208);checkHttpEncoding("UTF-8",    false,  APPXML_UTF8,    "UTF-16BE", "UTF-16BE", "UTF-16BE", "UTF-16BE");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    @Test
    public void testCalculateHttpEncodingUtf32() throws IOException {__CLR4_4_1ik9ik9kylve3ac.R.globalSliceStart(getClass().getName(),24209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3wwriioh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ik9ik9kylve3ac.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ik9ik9kylve3ac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.XmlStreamReaderUtilitiesTest.testCalculateHttpEncodingUtf32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3wwriioh() throws IOException{try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24209);
        // No BOM        Expected     Lenient cType           BOM         Guess       XML         Default
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24210);checkHttpEncoding("UTF-32LE", true,   null,           null,       null,       "UTF-32LE", null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24211);checkHttpEncoding("UTF-32BE", false,  TXTXML,         null,       null,       null,       "UTF-32BE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24212);checkHttpEncoding("UTF-32BE", false,  APPXML,         null,       null,       null,       "UTF-32BE");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24213);checkHttpEncoding("UTF-32LE", false,  APPXML_UTF32LE, null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24214);checkHttpEncoding("UTF-32BE", false,  APPXML_UTF32BE, null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24215);checkHttpError(HTTPMGS1,      false,  APPXML_UTF32LE, "UTF-32LE", null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24216);checkHttpError(HTTPMGS1,      false,  APPXML_UTF32BE, "UTF-32BE", null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24217);checkHttpError(HTTPMGS2,      false,  APPXML_UTF32,   null,       null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24218);checkHttpError(HTTPMGS2,      false,  APPXML_UTF32,   "UTF-8",    null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24219);checkHttpEncoding("UTF-32LE", false,  APPXML_UTF32,   "UTF-32LE", null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24220);checkHttpEncoding("UTF-32BE", false,  APPXML_UTF32,   "UTF-32BE", null,       null,       null);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24221);checkHttpEncoding("UTF-8",    false,  APPXML_UTF8,    "UTF-32BE", "UTF-32BE", "UTF-32BE", "UTF-32BE");
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    private void checkHttpEncoding(final String expected, final boolean lenient, final String httpContentType,
            final String bomEnc, final String xmlGuessEnc, final String xmlEnc, final String defaultEncoding) throws IOException {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24222);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24223);final StringBuilder builder = new StringBuilder();
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24224);builder.append("HttpEncoding=[").append(bomEnc).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24225);builder.append("lenient=[").append(lenient).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24226);builder.append("httpContentType=[").append(httpContentType).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24227);builder.append("bomEnc=[").append(bomEnc).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24228);builder.append("xmlGuessEnc=[").append(xmlGuessEnc).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24229);builder.append("xmlEnc=[").append(xmlEnc).append("], ");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24230);builder.append("defaultEncoding=[").append(defaultEncoding).append("],");
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24231);final String encoding = calculateHttpEncoding(httpContentType, bomEnc, xmlGuessEnc, xmlEnc, lenient, defaultEncoding);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24232);assertEquals(expected, encoding, builder.toString());
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    protected String calculateHttpEncoding(final String httpContentType, final String bomEnc, final String xmlGuessEnc,
            final String xmlEnc, final boolean lenient, final String defaultEncoding) throws IOException {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24233);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24234);final MockXmlStreamReader mock = new MockXmlStreamReader(defaultEncoding);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24235);final String enc = mock.calculateHttpEncoding(httpContentType, bomEnc, xmlGuessEnc, xmlEnc, lenient);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24236);mock.close();
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24237);return enc;
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    private void checkHttpError(final String msgSuffix, final boolean lenient, final String httpContentType,
            final String bomEnc, final String xmlGuessEnc, final String xmlEnc, final String defaultEncoding) {try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24238);
        __CLR4_4_1ik9ik9kylve3ac.R.inc(24239);try {
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24240);checkHttpEncoding("XmlStreamReaderException", lenient, httpContentType, bomEnc, xmlGuessEnc, xmlEnc, defaultEncoding);
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24241);fail("Expected XmlStreamReaderException");
        } catch (final XmlStreamReaderException e) {
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24242);assertTrue(e.getMessage().startsWith("Invalid encoding"), "Msg Start: " + e.getMessage());
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24243);assertTrue(e.getMessage().endsWith(msgSuffix), "Msg End: " + e.getMessage());
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24244);assertEquals(bomEnc, e.getBomEncoding(), "bomEnc");
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24245);assertEquals(xmlGuessEnc, e.getXmlGuessEncoding(), "xmlGuessEnc");
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24246);assertEquals(xmlEnc, e.getXmlEncoding(), "xmlEnc");
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24247);assertEquals(XmlStreamReader.getContentTypeEncoding(httpContentType), e.getContentTypeEncoding(),
                    "ContentTypeEncoding");
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24248);assertEquals(XmlStreamReader.getContentTypeMime(httpContentType), e.getContentTypeMime(), "ContentTypeMime");
        } catch (final Exception e) {
            __CLR4_4_1ik9ik9kylve3ac.R.inc(24249);fail("Expected XmlStreamReaderException, but threw " + e);
        }
    }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}

    /** Mock {@link XmlStreamReader} implementation */
    private static class MockXmlStreamReader extends XmlStreamReader {
        MockXmlStreamReader(final String defaultEncoding) throws IOException {
            super(new ByteArrayInputStream("".getBytes()), null, true, defaultEncoding);__CLR4_4_1ik9ik9kylve3ac.R.inc(24251);try{__CLR4_4_1ik9ik9kylve3ac.R.inc(24250);
        }finally{__CLR4_4_1ik9ik9kylve3ac.R.flushNeeded();}}
    }
}
