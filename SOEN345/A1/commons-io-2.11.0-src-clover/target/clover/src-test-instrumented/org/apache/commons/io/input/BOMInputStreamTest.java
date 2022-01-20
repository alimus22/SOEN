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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.ByteOrderMark;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Test case for {@link BOMInputStream}.
 *
 */
@SuppressWarnings("ResultOfMethodCallIgnored")
public class BOMInputStreamTest {static class __CLR4_4_1fkffkfkylve2n7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,20681,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    //----------------------------------------------------------------------------
    //  Support code
    //----------------------------------------------------------------------------

    /**
     *  A mock InputStream that expects {@code close()} to be called.
     */
    private static class ExpectCloseInputStream extends InputStream {
        private boolean _closeCalled;

        public void assertCloseCalled() {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20175);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20176);assertTrue(_closeCalled);
        }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

        @Override
        public void close() throws IOException {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20177);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20178);_closeCalled = true;
        }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

        @Override
        public int read() throws IOException {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20179);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20180);return -1;
        }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}
    }

    private void assertData(final byte[] expected, final byte[] actual, final int len) {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20181);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20182);assertEquals(expected.length, len, "length");
        __CLR4_4_1fkffkfkylve2n7.R.inc(20183);for (int ii = 0; (((ii < expected.length)&&(__CLR4_4_1fkffkfkylve2n7.R.iget(20184)!=0|true))||(__CLR4_4_1fkffkfkylve2n7.R.iget(20185)==0&false)); ii++) {{
            __CLR4_4_1fkffkfkylve2n7.R.inc(20186);assertEquals(expected[ii], actual[ii], "byte " + ii);
        }
    }}finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    /**
     *  Creates the underlying data stream, with or without BOM.
     */
    private InputStream createUtf16BeDataStream(final byte[] baseData, final boolean addBOM) {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20187);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20188);byte[] data = baseData;
        __CLR4_4_1fkffkfkylve2n7.R.inc(20189);if ((((addBOM)&&(__CLR4_4_1fkffkfkylve2n7.R.iget(20190)!=0|true))||(__CLR4_4_1fkffkfkylve2n7.R.iget(20191)==0&false))) {{
            __CLR4_4_1fkffkfkylve2n7.R.inc(20192);data = new byte[baseData.length + 2];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20193);data[0] = (byte) 0xFE;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20194);data[1] = (byte) 0xFF;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20195);System.arraycopy(baseData, 0, data, 2, baseData.length);
        }
        }__CLR4_4_1fkffkfkylve2n7.R.inc(20196);return new ByteArrayInputStream(data);
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    /**
     *  Creates the underlying data stream, with or without BOM.
     */
    private InputStream createUtf16LeDataStream(final byte[] baseData, final boolean addBOM) {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20197);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20198);byte[] data = baseData;
        __CLR4_4_1fkffkfkylve2n7.R.inc(20199);if ((((addBOM)&&(__CLR4_4_1fkffkfkylve2n7.R.iget(20200)!=0|true))||(__CLR4_4_1fkffkfkylve2n7.R.iget(20201)==0&false))) {{
            __CLR4_4_1fkffkfkylve2n7.R.inc(20202);data = new byte[baseData.length + 2];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20203);data[0] = (byte) 0xFF;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20204);data[1] = (byte) 0xFE;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20205);System.arraycopy(baseData, 0, data, 2, baseData.length);
        }
        }__CLR4_4_1fkffkfkylve2n7.R.inc(20206);return new ByteArrayInputStream(data);
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    /**
     *  Creates the underlying data stream, with or without BOM.
     */
    private InputStream createUtf32BeDataStream(final byte[] baseData, final boolean addBOM) {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20207);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20208);byte[] data = baseData;
        __CLR4_4_1fkffkfkylve2n7.R.inc(20209);if ((((addBOM)&&(__CLR4_4_1fkffkfkylve2n7.R.iget(20210)!=0|true))||(__CLR4_4_1fkffkfkylve2n7.R.iget(20211)==0&false))) {{
            __CLR4_4_1fkffkfkylve2n7.R.inc(20212);data = new byte[baseData.length + 4];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20213);data[0] = 0;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20214);data[1] = 0;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20215);data[2] = (byte) 0xFE;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20216);data[3] = (byte) 0xFF;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20217);System.arraycopy(baseData, 0, data, 4, baseData.length);
        }
        }__CLR4_4_1fkffkfkylve2n7.R.inc(20218);return new ByteArrayInputStream(data);
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    /**
     *  Creates the underlying data stream, with or without BOM.
     */
    private InputStream createUtf32LeDataStream(final byte[] baseData, final boolean addBOM) {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20219);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20220);byte[] data = baseData;
        __CLR4_4_1fkffkfkylve2n7.R.inc(20221);if ((((addBOM)&&(__CLR4_4_1fkffkfkylve2n7.R.iget(20222)!=0|true))||(__CLR4_4_1fkffkfkylve2n7.R.iget(20223)==0&false))) {{
            __CLR4_4_1fkffkfkylve2n7.R.inc(20224);data = new byte[baseData.length + 4];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20225);data[0] = (byte) 0xFF;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20226);data[1] = (byte) 0xFE;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20227);data[2] = 0;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20228);data[3] = 0;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20229);System.arraycopy(baseData, 0, data, 4, baseData.length);
        }
        }__CLR4_4_1fkffkfkylve2n7.R.inc(20230);return new ByteArrayInputStream(data);
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    /**
     *  Creates the underlying data stream, with or without BOM.
     */
    private InputStream createUtf8DataStream(final byte[] baseData, final boolean addBOM) {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20231);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20232);byte[] data = baseData;
        __CLR4_4_1fkffkfkylve2n7.R.inc(20233);if ((((addBOM)&&(__CLR4_4_1fkffkfkylve2n7.R.iget(20234)!=0|true))||(__CLR4_4_1fkffkfkylve2n7.R.iget(20235)==0&false))) {{
            __CLR4_4_1fkffkfkylve2n7.R.inc(20236);data = new byte[baseData.length + 3];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20237);data[0] = (byte) 0xEF;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20238);data[1] = (byte) 0xBB;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20239);data[2] = (byte) 0xBF;
            __CLR4_4_1fkffkfkylve2n7.R.inc(20240);System.arraycopy(baseData, 0, data, 3, baseData.length);
        }
        }__CLR4_4_1fkffkfkylve2n7.R.inc(20241);return new ByteArrayInputStream(data);
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    //----------------------------------------------------------------------------
    //  Test cases
    //----------------------------------------------------------------------------

    private void parseXml(final InputStream in) throws SAXException, IOException, ParserConfigurationException {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20242);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20243);final Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(in));
        __CLR4_4_1fkffkfkylve2n7.R.inc(20244);assertNotNull(doc);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20245);assertEquals("X", doc.getFirstChild().getNodeName());
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    private void parseXml(final Reader in) throws SAXException, IOException, ParserConfigurationException {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20246);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20247);final Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(in));
        __CLR4_4_1fkffkfkylve2n7.R.inc(20248);assertNotNull(doc);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20249);assertEquals("X", doc.getFirstChild().getNodeName());
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    private void readBOMInputStreamTwice(final String resource) throws Exception {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20250);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20251);final InputStream inputStream = this.getClass().getResourceAsStream(resource);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20252);assertNotNull(inputStream);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20253);final BOMInputStream bomInputStream = new BOMInputStream(inputStream);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20254);bomInputStream.mark(1000000);

        __CLR4_4_1fkffkfkylve2n7.R.inc(20255);this.readFile(bomInputStream);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20256);bomInputStream.reset();
        __CLR4_4_1fkffkfkylve2n7.R.inc(20257);this.readFile(bomInputStream);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20258);inputStream.close();
        __CLR4_4_1fkffkfkylve2n7.R.inc(20259);bomInputStream.close();
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    private void readFile(final BOMInputStream bomInputStream) throws Exception {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20260);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20261);int bytes;
        __CLR4_4_1fkffkfkylve2n7.R.inc(20262);final byte[] bytesFromStream = new byte[100];
        __CLR4_4_1fkffkfkylve2n7.R.inc(20263);do {{
            __CLR4_4_1fkffkfkylve2n7.R.inc(20264);bytes = bomInputStream.read(bytesFromStream);
        } }while ((((bytes > 0)&&(__CLR4_4_1fkffkfkylve2n7.R.iget(20265)!=0|true))||(__CLR4_4_1fkffkfkylve2n7.R.iget(20266)==0&false)));
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testAvailableWithBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oxzu2fmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testAvailableWithBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oxzu2fmz() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20267);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20268);final byte[] data = { 'A', 'B', 'C', 'D' };
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20269);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20270);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20271);assertEquals(7, in.available());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testAvailableWithoutBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxzf9mfn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testAvailableWithoutBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxzf9mfn4() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20272);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20273);final byte[] data = { 'A', 'B', 'C', 'D' };
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20274);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20275);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20276);assertEquals(4, in.available());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    // this is here for coverage
    public void testClose() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169vzsjfn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169vzsjfn9() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20277);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20278);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20279);}};final ExpectCloseInputStream del = new ExpectCloseInputStream()) {
            class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20280);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20281);}};final InputStream in = new BOMInputStream(del)) {
                // nothing
            }
            __CLR4_4_1fkffkfkylve2n7.R.inc(20282);del.assertCloseCalled();
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testEmptyBufferWithBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ey9dyfnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testEmptyBufferWithBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ey9dyfnf() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20283);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20284);final byte[] data = {};
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20285);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20286);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20287);final byte[] buf = new byte[1024];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20288);assertEquals(-1, in.read(buf));
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testEmptyBufferWithoutBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhrxgafnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testEmptyBufferWithoutBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhrxgafnl() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20289);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20290);final byte[] data = {};
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20291);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20292);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20293);final byte[] buf = new byte[1024];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20294);assertEquals(-1, in.read(buf));
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testGetBOMFirstThenRead() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pntg6mfnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testGetBOMFirstThenRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pntg6mfnr() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20295);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20296);final byte[] data = { 'A', 'B', 'C' };
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20297);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20298);}};final BOMInputStream in = new BOMInputStream(createUtf8DataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20299);assertEquals(ByteOrderMark.UTF_8, in.getBOM(), "getBOM");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20300);assertTrue(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20301);assertTrue(in.hasBOM(ByteOrderMark.UTF_8), "hasBOM(UTF-8)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20302);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20303);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20304);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20305);assertEquals(-1, in.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testGetBOMFirstThenReadInclude() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5pzawfo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testGetBOMFirstThenReadInclude",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5pzawfo2() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20306);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20307);final byte[] data = { 'A', 'B', 'C' };
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20308);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20309);}};final BOMInputStream in = new BOMInputStream(createUtf8DataStream(data, true), true)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20310);assertTrue(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20311);assertTrue(in.hasBOM(ByteOrderMark.UTF_8), "hasBOM(UTF-8)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20312);assertEquals(ByteOrderMark.UTF_8, in.getBOM(), "getBOM");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20313);assertEquals(0xEF, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20314);assertEquals(0xBB, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20315);assertEquals(0xBF, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20316);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20317);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20318);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20319);assertEquals(-1, in.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testLargeBufferWithBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f46vtkfog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testLargeBufferWithBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f46vtkfog() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20320);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20321);final byte[] data = { 'A', 'B', 'C' };
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20322);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20323);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20324);final byte[] buf = new byte[1024];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20325);assertData(data, buf, in.read(buf));
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testLargeBufferWithoutBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0d748fom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testLargeBufferWithoutBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0d748fom() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20326);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20327);final byte[] data = { 'A', 'B', 'C' };
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20328);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20329);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20330);final byte[] buf = new byte[1024];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20331);assertData(data, buf, in.read(buf));
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testLeadingNonBOMBufferedRead() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124ce3nfos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testLeadingNonBOMBufferedRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124ce3nfos() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20332);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20333);final byte[] data = { (byte) 0xEF, (byte) 0xAB, (byte) 0xCD };
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20334);try (__CLR4_4_1$AC10 __CLR$ACI10=new __CLR4_4_1$AC10(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20335);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20336);final byte[] buf = new byte[1024];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20337);assertData(data, buf, in.read(buf));
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testLeadingNonBOMSingleRead() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vab1n8foy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testLeadingNonBOMSingleRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vab1n8foy() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20338);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20339);final byte[] data = { (byte) 0xEF, (byte) 0xAB, (byte) 0xCD };
        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20340);try (__CLR4_4_1$AC11 __CLR$ACI11=new __CLR4_4_1$AC11(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20341);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20342);assertEquals(0xEF, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20343);assertEquals(0xAB, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20344);assertEquals(0xCD, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20345);assertEquals(-1, in.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testMarkResetAfterReadWithBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1amn4wvfp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testMarkResetAfterReadWithBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1amn4wvfp6() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20346);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20347);final byte[] data = { 'A', 'B', 'C', 'D' };
        class __CLR4_4_1$AC12 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20348);try (__CLR4_4_1$AC12 __CLR$ACI12=new __CLR4_4_1$AC12(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20349);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20350);assertTrue(in.markSupported());

            __CLR4_4_1fkffkfkylve2n7.R.inc(20351);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20352);in.mark(10);

            __CLR4_4_1fkffkfkylve2n7.R.inc(20353);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20354);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20355);in.reset();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20356);assertEquals('B', in.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testMarkResetAfterReadWithoutBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9s735fph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testMarkResetAfterReadWithoutBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9s735fph() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20357);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20358);final byte[] data = { 'A', 'B', 'C', 'D' };
        class __CLR4_4_1$AC13 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20359);try (__CLR4_4_1$AC13 __CLR$ACI13=new __CLR4_4_1$AC13(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20360);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20361);assertTrue(in.markSupported());

            __CLR4_4_1fkffkfkylve2n7.R.inc(20362);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20363);in.mark(10);

            __CLR4_4_1fkffkfkylve2n7.R.inc(20364);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20365);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20366);in.reset();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20367);assertEquals('B', in.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testMarkResetBeforeReadWithBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15g8jrwfps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testMarkResetBeforeReadWithBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15g8jrwfps() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20368);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20369);final byte[] data = { 'A', 'B', 'C', 'D' };
        class __CLR4_4_1$AC14 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20370);try (__CLR4_4_1$AC14 __CLR$ACI14=new __CLR4_4_1$AC14(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20371);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20372);assertTrue(in.markSupported());

            __CLR4_4_1fkffkfkylve2n7.R.inc(20373);in.mark(10);

            __CLR4_4_1fkffkfkylve2n7.R.inc(20374);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20375);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20376);in.reset();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20377);assertEquals('A', in.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testMarkResetBeforeReadWithoutBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3z264fq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testMarkResetBeforeReadWithoutBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3z264fq2() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20378);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20379);final byte[] data = { 'A', 'B', 'C', 'D' };
        class __CLR4_4_1$AC15 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20380);try (__CLR4_4_1$AC15 __CLR$ACI15=new __CLR4_4_1$AC15(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20381);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20382);assertTrue(in.markSupported());

            __CLR4_4_1fkffkfkylve2n7.R.inc(20383);in.mark(10);

            __CLR4_4_1fkffkfkylve2n7.R.inc(20384);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20385);in.read();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20386);in.reset();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20387);assertEquals('A', in.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testNoBoms() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jnls8jfqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testNoBoms",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jnls8jfqc() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20388);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20389);final byte[] data = { 'A', 'B', 'C' };
        __CLR4_4_1fkffkfkylve2n7.R.inc(20390);try {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20391);(new BOMInputStream(createUtf8DataStream(data, true), false, (ByteOrderMark[])null)).close();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20392);fail("Null BOMs, expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
        __CLR4_4_1fkffkfkylve2n7.R.inc(20393);try {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20394);(new BOMInputStream(createUtf8DataStream(data, true), false, new ByteOrderMark[0])).close();
            __CLR4_4_1fkffkfkylve2n7.R.inc(20395);fail("Null BOMs, expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}





    @Test
    public void testReadEmpty() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wo1o4fqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wo1o4fqk() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20396);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20397);final byte[] data = {};
        class __CLR4_4_1$AC16 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20398);try (__CLR4_4_1$AC16 __CLR$ACI16=new __CLR4_4_1$AC16(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20399);}};final BOMInputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20400);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20401);assertFalse(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20402);assertFalse(in.hasBOM(ByteOrderMark.UTF_8), "hasBOM(UTF-8)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20403);assertNull(in.getBOM(), "getBOM");
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadSmall() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168fw1yfqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadSmall",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168fw1yfqs() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20404);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20405);final byte[] data = { 'A', 'B' };
        class __CLR4_4_1$AC17 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20406);try (__CLR4_4_1$AC17 __CLR$ACI17=new __CLR4_4_1$AC17(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20407);}};final BOMInputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20408);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20409);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20410);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20411);assertFalse(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20412);assertFalse(in.hasBOM(ByteOrderMark.UTF_8), "hasBOM(UTF-8)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20413);assertNull(in.getBOM(), "getBOM");
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadTwiceWithBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2mb0hfr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadTwiceWithBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2mb0hfr2() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20414);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20415);this.readBOMInputStreamTwice("/org/apache/commons/io/testfileBOM.xml");
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadTwiceWithoutBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197c16nfr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadTwiceWithoutBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197c16nfr4() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20416);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20417);this.readBOMInputStreamTwice("/org/apache/commons/io/testfileNoBOM.xml");
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadWithBOMInclude() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qixp9fr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadWithBOMInclude",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qixp9fr6() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20418);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20419);final byte[] data = { 'A', 'B', 'C' };
        class __CLR4_4_1$AC18 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20420);try (__CLR4_4_1$AC18 __CLR$ACI18=new __CLR4_4_1$AC18(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20421);}};final BOMInputStream in = new BOMInputStream(createUtf8DataStream(data, true), true)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20422);assertEquals(0xEF, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20423);assertEquals(0xBB, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20424);assertEquals(0xBF, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20425);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20426);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20427);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20428);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20429);assertTrue(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20430);assertTrue(in.hasBOM(ByteOrderMark.UTF_8), "hasBOM(UTF-8)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20431);assertEquals(ByteOrderMark.UTF_8, in.getBOM(), "getBOM");
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadWithBOMUtf16Be() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1puq29wfrk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadWithBOMUtf16Be",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1puq29wfrk() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20432);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20433);final byte[] data = "ABC".getBytes(StandardCharsets.UTF_16BE);
        class __CLR4_4_1$AC19 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20434);try (__CLR4_4_1$AC19 __CLR$ACI19=new __CLR4_4_1$AC19(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20435);}};final BOMInputStream in = new BOMInputStream(createUtf16BeDataStream(data, true),
                ByteOrderMark.UTF_16BE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20436);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20437);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20438);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20439);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20440);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20441);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20442);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20443);assertTrue(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20444);assertTrue(in.hasBOM(ByteOrderMark.UTF_16BE), "hasBOM(UTF-16BE)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20445);assertEquals(ByteOrderMark.UTF_16BE, in.getBOM(), "getBOM");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20446);try {
                __CLR4_4_1fkffkfkylve2n7.R.inc(20447);in.hasBOM(ByteOrderMark.UTF_16LE);
                __CLR4_4_1fkffkfkylve2n7.R.inc(20448);fail("Expected IllegalArgumentException");
            } catch (final IllegalArgumentException e) {
                // expected - not configured for UTF-16LE
            }
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadWithBOMUtf16Le() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4966efs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadWithBOMUtf16Le",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4966efs1() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20449);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20450);final byte[] data = "ABC".getBytes(StandardCharsets.UTF_16LE);
        class __CLR4_4_1$AC20 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20451);try (__CLR4_4_1$AC20 __CLR$ACI20=new __CLR4_4_1$AC20(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20452);}};final BOMInputStream in = new BOMInputStream(createUtf16LeDataStream(data, true),
                ByteOrderMark.UTF_16LE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20453);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20454);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20455);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20456);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20457);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20458);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20459);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20460);assertTrue(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20461);assertTrue(in.hasBOM(ByteOrderMark.UTF_16LE), "hasBOM(UTF-16LE)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20462);assertEquals(ByteOrderMark.UTF_16LE, in.getBOM(), "getBOM");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20463);try {
                __CLR4_4_1fkffkfkylve2n7.R.inc(20464);in.hasBOM(ByteOrderMark.UTF_16BE);
                __CLR4_4_1fkffkfkylve2n7.R.inc(20465);fail("Expected IllegalArgumentException");
            } catch (final IllegalArgumentException e) {
                // expected - not configured for UTF-16BE
            }
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadWithBOMUtf32Be() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qxlxtufsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadWithBOMUtf32Be",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qxlxtufsi() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20466);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20467);assumeTrue(Charset.isSupported("UTF_32BE"));
        __CLR4_4_1fkffkfkylve2n7.R.inc(20468);final byte[] data = "ABC".getBytes("UTF_32BE");
        class __CLR4_4_1$AC21 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20469);try (__CLR4_4_1$AC21 __CLR$ACI21=new __CLR4_4_1$AC21(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20470);}};final BOMInputStream in = new BOMInputStream(createUtf32BeDataStream(data, true),
                ByteOrderMark.UTF_32BE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20471);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20472);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20473);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20474);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20475);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20476);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20477);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20478);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20479);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20480);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20481);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20482);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20483);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20484);assertTrue(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20485);assertTrue(in.hasBOM(ByteOrderMark.UTF_32BE), "hasBOM(UTF-32BE)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20486);assertEquals(ByteOrderMark.UTF_32BE, in.getBOM(), "getBOM");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20487);try {
                __CLR4_4_1fkffkfkylve2n7.R.inc(20488);in.hasBOM(ByteOrderMark.UTF_32LE);
                __CLR4_4_1fkffkfkylve2n7.R.inc(20489);fail("Expected IllegalArgumentException");
            } catch (final IllegalArgumentException e) {
                // expected - not configured for UTF-32LE
            }
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadWithBOMUtf32Le() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dvh4b0ft6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadWithBOMUtf32Le",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dvh4b0ft6() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20490);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20491);assumeTrue(Charset.isSupported("UTF_32LE"));
        __CLR4_4_1fkffkfkylve2n7.R.inc(20492);final byte[] data = "ABC".getBytes("UTF_32LE");
        class __CLR4_4_1$AC22 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20493);try (__CLR4_4_1$AC22 __CLR$ACI22=new __CLR4_4_1$AC22(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20494);}};final BOMInputStream in = new BOMInputStream(createUtf32LeDataStream(data, true),
                ByteOrderMark.UTF_32LE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20495);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20496);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20497);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20498);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20499);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20500);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20501);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20502);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20503);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20504);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20505);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20506);assertEquals(0, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20507);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20508);assertTrue(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20509);assertTrue(in.hasBOM(ByteOrderMark.UTF_32LE), "hasBOM(UTF-32LE)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20510);assertEquals(ByteOrderMark.UTF_32LE, in.getBOM(), "getBOM");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20511);try {
                __CLR4_4_1fkffkfkylve2n7.R.inc(20512);in.hasBOM(ByteOrderMark.UTF_32BE);
                __CLR4_4_1fkffkfkylve2n7.R.inc(20513);fail("Expected IllegalArgumentException");
            } catch (final IllegalArgumentException e) {
                // expected - not configured for UTF-32BE
            }
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadWithBOMUtf8() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1noyrx2ftu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadWithBOMUtf8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1noyrx2ftu() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20514);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20515);final byte[] data = "ABC".getBytes(StandardCharsets.UTF_8);
        class __CLR4_4_1$AC23 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20516);try (__CLR4_4_1$AC23 __CLR$ACI23=new __CLR4_4_1$AC23(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20517);}};final BOMInputStream in = new BOMInputStream(createUtf8DataStream(data, true), ByteOrderMark.UTF_8)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20518);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20519);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20520);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20521);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20522);assertTrue(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20523);assertTrue(in.hasBOM(ByteOrderMark.UTF_8), "hasBOM(UTF-8)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20524);assertEquals(ByteOrderMark.UTF_8, in.getBOM(), "getBOM");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20525);try {
                __CLR4_4_1fkffkfkylve2n7.R.inc(20526);in.hasBOM(ByteOrderMark.UTF_16BE);
                __CLR4_4_1fkffkfkylve2n7.R.inc(20527);fail("Expected IllegalArgumentException");
            } catch (final IllegalArgumentException e) {
                // expected - not configured for UTF-16BE
            }
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadWithMultipleBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec60ztfu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadWithMultipleBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec60ztfu8() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20528);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20529);final byte[] data = { 'A', 'B', 'C' };
        class __CLR4_4_1$AC24 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20530);try (__CLR4_4_1$AC24 __CLR$ACI24=new __CLR4_4_1$AC24(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20531);}};final BOMInputStream in = new BOMInputStream(createUtf8DataStream(data, true), ByteOrderMark.UTF_16BE,
                ByteOrderMark.UTF_8)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20532);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20533);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20534);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20535);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20536);assertTrue(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20537);assertTrue(in.hasBOM(ByteOrderMark.UTF_8), "hasBOM(UTF-8)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20538);assertFalse(in.hasBOM(ByteOrderMark.UTF_16BE), "hasBOM(UTF-16BE)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20539);assertEquals(ByteOrderMark.UTF_8, in.getBOM(), "getBOM");
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadWithoutBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhtx1jfuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadWithoutBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhtx1jfuk() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20540);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20541);final byte[] data = { 'A', 'B', 'C' };
        class __CLR4_4_1$AC25 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20542);try (__CLR4_4_1$AC25 __CLR$ACI25=new __CLR4_4_1$AC25(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20543);}};final BOMInputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20544);assertEquals('A', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20545);assertEquals('B', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20546);assertEquals('C', in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20547);assertEquals(-1, in.read());
            __CLR4_4_1fkffkfkylve2n7.R.inc(20548);assertFalse(in.hasBOM(), "hasBOM()");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20549);assertFalse(in.hasBOM(ByteOrderMark.UTF_8), "hasBOM(UTF-8)");
            __CLR4_4_1fkffkfkylve2n7.R.inc(20550);assertNull(in.getBOM(), "getBOM");
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadXmlWithBOMUcs2() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ve2b29fuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadXmlWithBOMUcs2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ve2b29fuv() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20551);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20552);assumeFalse(System.getProperty("java.vendor").contains("IBM"), "This test does not pass on some IBM VMs xml parsers");

        // UCS-2 is BE.
        __CLR4_4_1fkffkfkylve2n7.R.inc(20553);assumeTrue(Charset.isSupported("ISO-10646-UCS-2"));
        __CLR4_4_1fkffkfkylve2n7.R.inc(20554);final byte[] data = "<?xml version=\"1.0\" encoding=\"ISO-10646-UCS-2\"?><X/>".getBytes("ISO-10646-UCS-2");
        class __CLR4_4_1$AC26 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20555);try (__CLR4_4_1$AC26 __CLR$ACI26=new __CLR4_4_1$AC26(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20556);}};BOMInputStream in = new BOMInputStream(createUtf16BeDataStream(data, true), ByteOrderMark.UTF_16BE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20557);parseXml(in);
        }
        __CLR4_4_1fkffkfkylve2n7.R.inc(20558);parseXml(createUtf16BeDataStream(data, true));
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadXmlWithBOMUcs4() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ow2dhbfv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadXmlWithBOMUcs4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ow2dhbfv3() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20559);
        // UCS-4 is BE or LE?
        // Hm: ISO-10646-UCS-4 is not supported on Oracle 1.6.0_31
        __CLR4_4_1fkffkfkylve2n7.R.inc(20560);assumeTrue(Charset.isSupported("ISO-10646-UCS-4"));
        __CLR4_4_1fkffkfkylve2n7.R.inc(20561);final byte[] data = "<?xml version=\"1.0\" encoding=\"ISO-10646-UCS-4\"?><X/>".getBytes("ISO-10646-UCS-4");
        // XML parser does not know what to do with UTF-32
        class __CLR4_4_1$AC27 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20562);try (__CLR4_4_1$AC27 __CLR$ACI27=new __CLR4_4_1$AC27(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20563);}};BOMInputStream in = new BOMInputStream(createUtf32BeDataStream(data, true), ByteOrderMark.UTF_32BE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20564);parseXml(in);
            // XML parser does not know what to do with UTF-32
            __CLR4_4_1fkffkfkylve2n7.R.inc(20565);assumeTrue(jvmAndSaxBothSupportCharset("UTF_32LE"), "JVM and SAX need to support UTF_32LE for this");
        }
        __CLR4_4_1fkffkfkylve2n7.R.inc(20566);parseXml(createUtf32BeDataStream(data, true));
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadXmlWithBOMUtf16Be() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1114h1nfvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadXmlWithBOMUtf16Be",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1114h1nfvb() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20567);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20568);final byte[] data = "<?xml version=\"1.0\" encoding=\"UTF-16BE\"?><X/>".getBytes(StandardCharsets.UTF_16BE);
        class __CLR4_4_1$AC28 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20569);try (__CLR4_4_1$AC28 __CLR$ACI28=new __CLR4_4_1$AC28(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20570);}};BOMInputStream in = new BOMInputStream(createUtf16BeDataStream(data, true), ByteOrderMark.UTF_16BE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20571);parseXml(in);
        }
        __CLR4_4_1fkffkfkylve2n7.R.inc(20572);parseXml(createUtf16BeDataStream(data, true));
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadXmlWithBOMUtf16Le() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e39akhfvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadXmlWithBOMUtf16Le",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e39akhfvh() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20573);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20574);final byte[] data = "<?xml version=\"1.0\" encoding=\"UTF-16LE\"?><X/>".getBytes(StandardCharsets.UTF_16LE);
        class __CLR4_4_1$AC29 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20575);try (__CLR4_4_1$AC29 __CLR$ACI29=new __CLR4_4_1$AC29(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20576);}};BOMInputStream in = new BOMInputStream(createUtf16LeDataStream(data, true), ByteOrderMark.UTF_16LE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20577);parseXml(in);
        }
        __CLR4_4_1fkffkfkylve2n7.R.inc(20578);parseXml(createUtf16LeDataStream(data, true));
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadXmlWithBOMUtf32Be() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9wix1fvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadXmlWithBOMUtf32Be",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9wix1fvn() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20579);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20580);assumeTrue(jvmAndSaxBothSupportCharset("UTF_32BE"), "JVM and SAX need to support UTF_32BE for this");
        __CLR4_4_1fkffkfkylve2n7.R.inc(20581);final byte[] data = "<?xml version=\"1.0\" encoding=\"UTF-32BE\"?><X/>".getBytes("UTF_32BE");
        class __CLR4_4_1$AC30 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20582);try (__CLR4_4_1$AC30 __CLR$ACI30=new __CLR4_4_1$AC30(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20583);}};BOMInputStream in = new BOMInputStream(createUtf32BeDataStream(data, true), ByteOrderMark.UTF_32BE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20584);parseXml(in);
        }
        // XML parser does not know what to do with UTF-32, so we warp the input stream with a XmlStreamReader
        class __CLR4_4_1$AC31 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20585);try (__CLR4_4_1$AC31 __CLR$ACI31=new __CLR4_4_1$AC31(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20586);}};XmlStreamReader in = new XmlStreamReader(createUtf32BeDataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20587);parseXml(in);
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadXmlWithBOMUtf32Le() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wc1cfvfvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadXmlWithBOMUtf32Le",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wc1cfvfvw() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20588);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20589);assumeTrue(jvmAndSaxBothSupportCharset("UTF_32LE"), "JVM and SAX need to support UTF_32LE for this");
        __CLR4_4_1fkffkfkylve2n7.R.inc(20590);final byte[] data = "<?xml version=\"1.0\" encoding=\"UTF-32LE\"?><X/>".getBytes("UTF_32LE");
        class __CLR4_4_1$AC32 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20591);try (__CLR4_4_1$AC32 __CLR$ACI32=new __CLR4_4_1$AC32(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20592);}};BOMInputStream in = new BOMInputStream(createUtf32LeDataStream(data, true), ByteOrderMark.UTF_32LE)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20593);parseXml(in);
        }
        // XML parser does not know what to do with UTF-32, so we warp the input stream with a XmlStreamReader
        class __CLR4_4_1$AC33 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20594);try (__CLR4_4_1$AC33 __CLR$ACI33=new __CLR4_4_1$AC33(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20595);}};XmlStreamReader in = new XmlStreamReader(createUtf32LeDataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20596);parseXml(in);
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadXmlWithBOMUtf8() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18c1o71fw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadXmlWithBOMUtf8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18c1o71fw5() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20597);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20598);final byte[] data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><X/>".getBytes(StandardCharsets.UTF_8);
        class __CLR4_4_1$AC34 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20599);try (__CLR4_4_1$AC34 __CLR$ACI34=new __CLR4_4_1$AC34(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20600);}};BOMInputStream in = new BOMInputStream(createUtf8DataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20601);parseXml(in);
        }
        __CLR4_4_1fkffkfkylve2n7.R.inc(20602);parseXml(createUtf8DataStream(data, true));
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadXmlWithoutBOMUtf32Be() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cltak7fwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadXmlWithoutBOMUtf32Be",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cltak7fwb() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20603);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20604);assumeTrue(jvmAndSaxBothSupportCharset("UTF_32BE"), "JVM and SAX need to support UTF_32BE for this");
        __CLR4_4_1fkffkfkylve2n7.R.inc(20605);final byte[] data = "<?xml version=\"1.0\" encoding=\"UTF_32BE\"?><X/>".getBytes("UTF_32BE");
        class __CLR4_4_1$AC35 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20606);try (__CLR4_4_1$AC35 __CLR$ACI35=new __CLR4_4_1$AC35(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20607);}};BOMInputStream in = new BOMInputStream(createUtf32BeDataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20608);parseXml(in);
        }
        __CLR4_4_1fkffkfkylve2n7.R.inc(20609);parseXml(createUtf32BeDataStream(data, false));
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testReadXmlWithoutBOMUtf32Le() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbiynfwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testReadXmlWithoutBOMUtf32Le",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbiynfwi() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20610);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20611);assumeTrue(jvmAndSaxBothSupportCharset("UTF_32LE"), "JVM and SAX need to support UTF_32LE for this");
        __CLR4_4_1fkffkfkylve2n7.R.inc(20612);final byte[] data = "<?xml version=\"1.0\" encoding=\"UTF-32LE\"?><X/>".getBytes("UTF_32LE");
        class __CLR4_4_1$AC36 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20613);try (__CLR4_4_1$AC36 __CLR$ACI36=new __CLR4_4_1$AC36(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20614);}};BOMInputStream in = new BOMInputStream(createUtf32LeDataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20615);parseXml(in);
        }
        __CLR4_4_1fkffkfkylve2n7.R.inc(20616);parseXml(createUtf32BeDataStream(data, false));
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testSkipWithBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzbzrkfwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testSkipWithBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzbzrkfwp() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20617);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20618);final byte[] data = { 'A', 'B', 'C', 'D' };
        class __CLR4_4_1$AC37 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20619);try (__CLR4_4_1$AC37 __CLR$ACI37=new __CLR4_4_1$AC37(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20620);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20621);in.skip(2L);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20622);assertEquals('C', in.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testSkipWithoutBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ht3t9sfwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testSkipWithoutBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ht3t9sfwv() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20623);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20624);final byte[] data = { 'A', 'B', 'C', 'D' };
        class __CLR4_4_1$AC38 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20625);try (__CLR4_4_1$AC38 __CLR$ACI38=new __CLR4_4_1$AC38(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20626);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20627);in.skip(2L);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20628);assertEquals('C', in.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}


    @Test
    public void skipReturnValueWithBom() throws IOException {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjmjtrfx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.skipReturnValueWithBom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjmjtrfx1() throws IOException{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20629);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20630);final byte[] baseData = { (byte) 0x31, (byte) 0x32, (byte) 0x33 };
        class __CLR4_4_1$AC39 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20631);try (__CLR4_4_1$AC39 __CLR$ACI39=new __CLR4_4_1$AC39(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20632);}};final BOMInputStream is1 = new BOMInputStream(createUtf8DataStream(baseData, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20633);assertEquals(2, is1.skip(2));
            __CLR4_4_1fkffkfkylve2n7.R.inc(20634);assertEquals((byte) 0x33, is1.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void skipReturnValueWithoutBom() throws IOException {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y25y1tfx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.skipReturnValueWithoutBom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y25y1tfx7() throws IOException{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20635);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20636);final byte[] baseData = { (byte) 0x31, (byte) 0x32, (byte) 0x33 };
        class __CLR4_4_1$AC40 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20637);try (__CLR4_4_1$AC40 __CLR$ACI40=new __CLR4_4_1$AC40(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20638);}};final BOMInputStream is2 = new BOMInputStream(createUtf8DataStream(baseData, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20639);assertEquals(2, is2.skip(2)); // IO-428
            __CLR4_4_1fkffkfkylve2n7.R.inc(20640);assertEquals((byte) 0x33, is2.read());
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testSmallBufferWithBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfv07gfxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testSmallBufferWithBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfv07gfxd() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20641);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20642);final byte[] data = { 'A', 'B', 'C' };
        class __CLR4_4_1$AC41 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20643);try (__CLR4_4_1$AC41 __CLR$ACI41=new __CLR4_4_1$AC41(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20644);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, true))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20645);final byte[] buf = new byte[1024];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20646);assertData(new byte[] { 'A', 'B' }, buf, in.read(buf, 0, 2));
            __CLR4_4_1fkffkfkylve2n7.R.inc(20647);assertData(new byte[] { 'C' }, buf, in.read(buf, 0, 2));
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    public void testSmallBufferWithoutBOM() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ijmy6sfxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testSmallBufferWithoutBOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ijmy6sfxk() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20648);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20649);final byte[] data = { 'A', 'B', 'C' };
        class __CLR4_4_1$AC42 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20650);try (__CLR4_4_1$AC42 __CLR$ACI42=new __CLR4_4_1$AC42(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20651);}};final InputStream in = new BOMInputStream(createUtf8DataStream(data, false))) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20652);final byte[] buf = new byte[1024];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20653);assertData(new byte[] { 'A', 'B' }, buf, in.read(buf, 0, 2));
            __CLR4_4_1fkffkfkylve2n7.R.inc(20654);assertData(new byte[] { 'C' }, buf, in.read(buf, 0, 2));
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    @Test
    // make sure that our support code works as expected
    public void testSupportCode() throws Exception {__CLR4_4_1fkffkfkylve2n7.R.globalSliceStart(getClass().getName(),20655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iias27fxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fkffkfkylve2n7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fkffkfkylve2n7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BOMInputStreamTest.testSupportCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iias27fxr() throws Exception{try{__CLR4_4_1fkffkfkylve2n7.R.inc(20655);
        class __CLR4_4_1$AC43 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fkffkfkylve2n7.R.inc(20656);try (__CLR4_4_1$AC43 __CLR$ACI43=new __CLR4_4_1$AC43(){{__CLR4_4_1fkffkfkylve2n7.R.inc(20657);}};final InputStream in = createUtf8DataStream(new byte[] { 'A', 'B' }, true)) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20658);final byte[] buf = new byte[1024];
            __CLR4_4_1fkffkfkylve2n7.R.inc(20659);final int len = in.read(buf);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20660);assertEquals(5, len);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20661);assertEquals(0xEF, buf[0] & 0xFF);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20662);assertEquals(0xBB, buf[1] & 0xFF);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20663);assertEquals(0xBF, buf[2] & 0xFF);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20664);assertEquals('A', buf[3] & 0xFF);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20665);assertEquals('B', buf[4] & 0xFF);

            __CLR4_4_1fkffkfkylve2n7.R.inc(20666);assertData(new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF, 'A', 'B' }, buf, len);
        }
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    private boolean jvmAndSaxBothSupportCharset(final String charSetName) throws ParserConfigurationException, SAXException, IOException {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20667);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20668);return Charset.isSupported(charSetName) &&  doesSaxSupportCharacterSet(charSetName);
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}

    private boolean doesSaxSupportCharacterSet(final String charSetName) throws ParserConfigurationException, SAXException, IOException {try{__CLR4_4_1fkffkfkylve2n7.R.inc(20669);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20670);final byte[] data = ("<?xml version=\"1.0\" encoding=\"" + charSetName + "\"?><Z/>").getBytes(charSetName);
        __CLR4_4_1fkffkfkylve2n7.R.inc(20671);final DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        __CLR4_4_1fkffkfkylve2n7.R.inc(20672);try {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20673);final InputSource is = new InputSource(new ByteArrayInputStream(data));
            __CLR4_4_1fkffkfkylve2n7.R.inc(20674);is.setEncoding(charSetName);
            __CLR4_4_1fkffkfkylve2n7.R.inc(20675);documentBuilder.parse(is);
        } catch (final SAXParseException e) {
            __CLR4_4_1fkffkfkylve2n7.R.inc(20676);if ((((e.getMessage().contains(charSetName))&&(__CLR4_4_1fkffkfkylve2n7.R.iget(20677)!=0|true))||(__CLR4_4_1fkffkfkylve2n7.R.iget(20678)==0&false))) {{
                __CLR4_4_1fkffkfkylve2n7.R.inc(20679);return false;
            }
        }}
        __CLR4_4_1fkffkfkylve2n7.R.inc(20680);return true;
    }finally{__CLR4_4_1fkffkfkylve2n7.R.flushNeeded();}}
}
