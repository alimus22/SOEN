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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.DefaultLocale;

/**
 */
public class XmlStreamWriterTest {static class __CLR4_4_1l4sl4skylve3qd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,27455,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** french */
    private static final String TEXT_LATIN1 = "eacute: \u00e9";
    /** greek */
    private static final String TEXT_LATIN7 = "alpha: \u03b1";
    /** euro support */
    private static final String TEXT_LATIN15 = "euro: \u20ac";
    /** japanese */
    private static final String TEXT_EUC_JP = "hiragana A: \u3042";
    /** Unicode: support everything */
    private static final String TEXT_UNICODE = TEXT_LATIN1 + ", " + TEXT_LATIN7
            + ", " + TEXT_LATIN15 + ", " + TEXT_EUC_JP;

    private static String createXmlContent(final String text, final String encoding) {try{__CLR4_4_1l4sl4skylve3qd.R.inc(27388);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27389);String xmlDecl = "<?xml version=\"1.0\"?>";
        __CLR4_4_1l4sl4skylve3qd.R.inc(27390);if ((((encoding != null)&&(__CLR4_4_1l4sl4skylve3qd.R.iget(27391)!=0|true))||(__CLR4_4_1l4sl4skylve3qd.R.iget(27392)==0&false))) {{
            __CLR4_4_1l4sl4skylve3qd.R.inc(27393);xmlDecl = "<?xml version=\"1.0\" encoding=\"" + encoding + "\"?>";
        }
        }__CLR4_4_1l4sl4skylve3qd.R.inc(27394);return xmlDecl + "\n<text>" + text + "</text>";
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    private static void checkXmlContent(final String xml, final String encoding, final String defaultEncoding)
            throws IOException {try{__CLR4_4_1l4sl4skylve3qd.R.inc(27395);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27396);final ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_4_1l4sl4skylve3qd.R.inc(27397);final XmlStreamWriter writer = new XmlStreamWriter(out, defaultEncoding);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27398);writer.write(xml);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27399);writer.close();
        __CLR4_4_1l4sl4skylve3qd.R.inc(27400);final byte[] xmlContent = out.toByteArray();
        __CLR4_4_1l4sl4skylve3qd.R.inc(27401);assertTrue(encoding.equalsIgnoreCase(writer.getEncoding()));
        __CLR4_4_1l4sl4skylve3qd.R.inc(27402);assertArrayEquals(xml.getBytes(encoding), xmlContent);

    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    private static void checkXmlWriter(final String text, final String encoding)
            throws IOException {try{__CLR4_4_1l4sl4skylve3qd.R.inc(27403);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27404);checkXmlWriter(text, encoding, null);
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    private static void checkXmlWriter(final String text, final String encoding, final String defaultEncoding)
            throws IOException {try{__CLR4_4_1l4sl4skylve3qd.R.inc(27405);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27406);final String xml = createXmlContent(text, encoding);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27407);String effectiveEncoding = encoding;
        __CLR4_4_1l4sl4skylve3qd.R.inc(27408);if ((((effectiveEncoding == null)&&(__CLR4_4_1l4sl4skylve3qd.R.iget(27409)!=0|true))||(__CLR4_4_1l4sl4skylve3qd.R.iget(27410)==0&false))) {{
            __CLR4_4_1l4sl4skylve3qd.R.inc(27411);effectiveEncoding = (((defaultEncoding == null )&&(__CLR4_4_1l4sl4skylve3qd.R.iget(27412)!=0|true))||(__CLR4_4_1l4sl4skylve3qd.R.iget(27413)==0&false))? "UTF-8" : defaultEncoding;
        }
        }__CLR4_4_1l4sl4skylve3qd.R.inc(27414);checkXmlContent(xml, effectiveEncoding, defaultEncoding);
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testNoXmlHeader() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfdxx4l5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testNoXmlHeader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfdxx4l5j() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27415);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27416);final String xml = "<text>text with no XML header</text>";
        __CLR4_4_1l4sl4skylve3qd.R.inc(27417);checkXmlContent(xml, "UTF-8", null);
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testEmpty() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6g5z2l5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6g5z2l5m() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27418);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27419);final ByteArrayOutputStream out = new ByteArrayOutputStream();
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l4sl4skylve3qd.R.inc(27420);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1l4sl4skylve3qd.R.inc(27421);}};final XmlStreamWriter writer = new XmlStreamWriter(out)) {
            __CLR4_4_1l4sl4skylve3qd.R.inc(27422);writer.flush();
            __CLR4_4_1l4sl4skylve3qd.R.inc(27423);writer.write("");
            __CLR4_4_1l4sl4skylve3qd.R.inc(27424);writer.flush();
            __CLR4_4_1l4sl4skylve3qd.R.inc(27425);writer.write(".");
            __CLR4_4_1l4sl4skylve3qd.R.inc(27426);writer.flush();
        }
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testDefaultEncoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z0npdjl5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testDefaultEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z0npdjl5v() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27427);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27428);checkXmlWriter(TEXT_UNICODE, null, null);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27429);checkXmlWriter(TEXT_UNICODE, null, "UTF-8");
        __CLR4_4_1l4sl4skylve3qd.R.inc(27430);checkXmlWriter(TEXT_UNICODE, null, "UTF-16");
        __CLR4_4_1l4sl4skylve3qd.R.inc(27431);checkXmlWriter(TEXT_UNICODE, null, "UTF-16BE");
        __CLR4_4_1l4sl4skylve3qd.R.inc(27432);checkXmlWriter(TEXT_UNICODE, null, "ISO-8859-1");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    // Turkish language has specific rules to convert dotted and dottless i character.
    @Test
    @DefaultLocale(language = "tr")
    public void testLowerCaseEncodingWithTurkishLocale_IO_557() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1za8psyl61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testLowerCaseEncodingWithTurkishLocale_IO_557",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1za8psyl61() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27433);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27434);checkXmlWriter(TEXT_UNICODE, "utf-8");
        __CLR4_4_1l4sl4skylve3qd.R.inc(27435);checkXmlWriter(TEXT_LATIN1, "iso-8859-1");
        __CLR4_4_1l4sl4skylve3qd.R.inc(27436);checkXmlWriter(TEXT_LATIN7, "iso-8859-7");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testUTF8Encoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fneu59l65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testUTF8Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fneu59l65() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27437);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27438);checkXmlWriter(TEXT_UNICODE, "UTF-8");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testUTF16Encoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xd15mcl67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testUTF16Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xd15mcl67() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27439);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27440);checkXmlWriter(TEXT_UNICODE, "UTF-16");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testUTF16BEEncoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjqxuxl69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testUTF16BEEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjqxuxl69() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27441);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27442);checkXmlWriter(TEXT_UNICODE, "UTF-16BE");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testUTF16LEEncoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1my7f5fl6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testUTF16LEEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1my7f5fl6b() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27443);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27444);checkXmlWriter(TEXT_UNICODE, "UTF-16LE");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testLatin1Encoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j601g9l6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testLatin1Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j601g9l6d() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27445);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27446);checkXmlWriter(TEXT_LATIN1, "ISO-8859-1");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testLatin7Encoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nyfqshl6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testLatin7Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nyfqshl6f() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27447);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27448);checkXmlWriter(TEXT_LATIN7, "ISO-8859-7");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testLatin15Encoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ajravkl6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testLatin15Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ajravkl6h() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27449);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27450);checkXmlWriter(TEXT_LATIN15, "ISO-8859-15");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testEUC_JPEncoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxfqe6l6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testEUC_JPEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxfqe6l6j() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27451);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27452);checkXmlWriter(TEXT_EUC_JP, "EUC-JP");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}

    @Test
    public void testEBCDICEncoding() throws IOException {__CLR4_4_1l4sl4skylve3qd.R.globalSliceStart(getClass().getName(),27453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3jczol6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l4sl4skylve3qd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l4sl4skylve3qd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.XmlStreamWriterTest.testEBCDICEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3jczol6l() throws IOException{try{__CLR4_4_1l4sl4skylve3qd.R.inc(27453);
        __CLR4_4_1l4sl4skylve3qd.R.inc(27454);checkXmlWriter("simple text in EBCDIC", "CP1047");
    }finally{__CLR4_4_1l4sl4skylve3qd.R.flushNeeded();}}
}
