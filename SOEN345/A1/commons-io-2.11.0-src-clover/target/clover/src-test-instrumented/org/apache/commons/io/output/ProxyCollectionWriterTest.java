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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.io.IOExceptionList;
import org.apache.commons.io.IOIndexedException;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link ProxyCollectionWriter}.
 */
public class ProxyCollectionWriterTest {static class __CLR4_4_1k8uk8ukylve3lq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26529,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testArrayIOExceptionOnAppendChar1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdb19jk8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnAppendChar1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdb19jk8u() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26238);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26239);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26240);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26241);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26242);final char data = 'A';
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26243);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26244);tw.append(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26245);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26246);verify(goodW).append(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26247);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26248);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendChar2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmb020k95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnAppendChar2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmb020k95() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26249);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26250);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26251);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26252);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26253);final char data = 'A';
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26254);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26255);tw.append(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26256);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26257);verify(goodW).append(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26258);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26259);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendCharSequence1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjwjgak9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnAppendCharSequence1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjwjgak9g() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26260);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26261);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26262);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26263);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26264);final CharSequence data = "A";
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26265);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26266);tw.append(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26267);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26268);verify(goodW).append(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26269);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26270);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendCharSequence2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nawkntk9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnAppendCharSequence2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nawkntk9r() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26271);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26272);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26273);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26274);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26275);final CharSequence data = "A";
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26276);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26277);tw.append(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26278);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26279);verify(goodW).append(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26280);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26281);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendCharSequenceIntInt1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6wtbaka2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnAppendCharSequenceIntInt1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6wtbaka2() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26282);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26283);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26284);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26285);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26286);final CharSequence data = "A";
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26287);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26288);tw.append(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26289);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26290);verify(goodW).append(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26291);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26292);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendCharSequenceIntInt2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufws3rkad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnAppendCharSequenceIntInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufws3rkad() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26293);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26294);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26295);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26296);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26297);final CharSequence data = "A";
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26298);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26299);tw.append(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26300);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26301);verify(goodW).append(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26302);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26303);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnClose1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15srj4xkao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnClose1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15srj4xkao() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26304);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26305);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26306);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26307);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26308);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26309);tw.close();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26310);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26311);verify(goodW).close();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26312);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26313);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnClose2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191rhxekay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnClose2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191rhxekay() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26314);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26315);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26316);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26317);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26318);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26319);tw.close();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26320);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26321);verify(goodW).close();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26322);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26323);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnFlush1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrc57vkb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnFlush1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrc57vkb8() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26324);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26325);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26326);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26327);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26328);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26329);tw.flush();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26330);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26331);verify(goodW).flush();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26332);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26333);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnFlush2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iic6fekbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnFlush2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iic6fekbi() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26334);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26335);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26336);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26337);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26338);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26339);tw.flush();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26340);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26341);verify(goodW).flush();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26342);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26343);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteCharArray1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mcdalkbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteCharArray1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mcdalkbs() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26344);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26345);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26346);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26347);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26348);final char[] data = { 'a' };
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26349);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26350);tw.write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26351);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26352);verify(goodW).write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26353);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26354);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteCharArray2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dcei4kc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteCharArray2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dcei4kc3() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26355);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26356);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26357);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26358);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26359);final char[] data = { 'a' };
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26360);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26361);tw.write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26362);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26363);verify(goodW).write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26364);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26365);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteCharArrayIntInt1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tjowjkce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteCharArrayIntInt1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tjowjkce() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26366);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26367);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26368);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26369);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26370);final char[] data = { 'a' };
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26371);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26372);tw.write(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26373);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26374);verify(goodW).write(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26375);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26376);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteCharArrayIntInt2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2jnp0kcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteCharArrayIntInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2jnp0kcp() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26377);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26378);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26379);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26380);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26381);final char[] data = { 'a' };
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26382);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26383);tw.write(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26384);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26385);verify(goodW).write(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26386);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26387);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteInt1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbf46fkd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteInt1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbf46fkd0() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26388);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26389);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26390);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26391);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26392);final int data = 32;
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26393);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26394);tw.write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26395);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26396);verify(goodW).write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26397);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26398);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteInt2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgoz08kdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgoz08kdb() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26399);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26400);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26401);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26402);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26403);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26404);tw.write(32);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26405);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26406);verify(goodW).write(32);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26407);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26408);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());

        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteString1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nj864pkdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nj864pkdl() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26409);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26410);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26411);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26412);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26413);final String data = "A";
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26414);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26415);tw.write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26416);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26417);verify(goodW).write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26418);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26419);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteString2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qs84x6kdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qs84x6kdw() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26420);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26421);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26422);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26423);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26424);final String data = "A";
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26425);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26426);tw.write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26427);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26428);verify(goodW).write(data);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26429);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26430);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());

        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteStringIntInt1() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1guaouvke7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteStringIntInt1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1guaouvke7() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26431);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26432);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26433);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26434);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26435);final String data = "A";
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26436);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26437);tw.write(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26438);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26439);verify(goodW).write(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26440);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26441);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteStringIntInt2() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlaq2ekei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testArrayIOExceptionOnWriteStringIntInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlaq2ekei() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26442);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26443);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26444);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26445);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26446);final String data = "A";
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26447);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26448);tw.write(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26449);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26450);verify(goodW).write(data, 0, 0);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26451);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26452);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());

        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testCollectionCloseBranchIOException() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dk6quket();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testCollectionCloseBranchIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dk6quket() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26453);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26454);final Writer badW = new BrokenWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26455);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26456);@SuppressWarnings("resource") // not necessary to close this
        final ProxyCollectionWriter tw = new ProxyCollectionWriter(Arrays.asList(goodW, badW, null));
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26457);try {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26458);tw.close();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26459);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26460);verify(goodW).close();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26461);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26462);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());

        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testConstructorsNull() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14la0yvkf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testConstructorsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14la0yvkf3() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26463);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k8uk8ukylve3lq.R.inc(26464);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1k8uk8ukylve3lq.R.inc(26465);}};final ProxyCollectionWriter teeWriter = new ProxyCollectionWriter((Writer[]) null)) {
            // Call any method, should not throw
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26466);teeWriter.append('a');
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26467);teeWriter.flush();
        }
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k8uk8ukylve3lq.R.inc(26468);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1k8uk8ukylve3lq.R.inc(26469);}};final ProxyCollectionWriter teeWriter = new ProxyCollectionWriter((Collection<Writer>) null)) {
            // Call any method, should not throw
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26470);teeWriter.append('a');
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26471);teeWriter.flush();
        }
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26472);assertTrue(true, "Dummy to show test completed OK");
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

    @Test
    public void testTee() throws IOException {__CLR4_4_1k8uk8ukylve3lq.R.globalSliceStart(getClass().getName(),26473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8kyztkfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8uk8ukylve3lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8uk8ukylve3lq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ProxyCollectionWriterTest.testTee",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8kyztkfd() throws IOException{try{__CLR4_4_1k8uk8ukylve3lq.R.inc(26473);
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26474);final StringBuilderWriter sbw1 = new StringBuilderWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26475);final StringBuilderWriter sbw2 = new StringBuilderWriter();
        __CLR4_4_1k8uk8ukylve3lq.R.inc(26476);final StringBuilderWriter expected = new StringBuilderWriter();

        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k8uk8ukylve3lq.R.inc(26477);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1k8uk8ukylve3lq.R.inc(26478);}};final ProxyCollectionWriter tw = new ProxyCollectionWriter(sbw1, sbw2, null)) {
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26479);for (int i = 0; (((i < 20)&&(__CLR4_4_1k8uk8ukylve3lq.R.iget(26480)!=0|true))||(__CLR4_4_1k8uk8ukylve3lq.R.iget(26481)==0&false)); i++) {{
                __CLR4_4_1k8uk8ukylve3lq.R.inc(26482);tw.write(i);
                __CLR4_4_1k8uk8ukylve3lq.R.inc(26483);expected.write(i);
            }
            }__CLR4_4_1k8uk8ukylve3lq.R.inc(26484);assertEquals(expected.toString(), sbw1.toString(), "ProxyCollectionWriter.write(int)");
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26485);assertEquals(expected.toString(), sbw2.toString(), "ProxyCollectionWriter.write(int)");

            __CLR4_4_1k8uk8ukylve3lq.R.inc(26486);final char[] array = new char[10];
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26487);for (int i = 20; (((i < 30)&&(__CLR4_4_1k8uk8ukylve3lq.R.iget(26488)!=0|true))||(__CLR4_4_1k8uk8ukylve3lq.R.iget(26489)==0&false)); i++) {{
                __CLR4_4_1k8uk8ukylve3lq.R.inc(26490);array[i - 20] = (char) i;
            }
            }__CLR4_4_1k8uk8ukylve3lq.R.inc(26491);tw.write(array);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26492);expected.write(array);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26493);assertEquals(expected.toString(), sbw1.toString(), "ProxyCollectionWriter.write(char[])");
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26494);assertEquals(expected.toString(), sbw2.toString(), "ProxyCollectionWriter.write(char[])");

            __CLR4_4_1k8uk8ukylve3lq.R.inc(26495);for (int i = 25; (((i < 35)&&(__CLR4_4_1k8uk8ukylve3lq.R.iget(26496)!=0|true))||(__CLR4_4_1k8uk8ukylve3lq.R.iget(26497)==0&false)); i++) {{
                __CLR4_4_1k8uk8ukylve3lq.R.inc(26498);array[i - 25] = (char) i;
            }
            }__CLR4_4_1k8uk8ukylve3lq.R.inc(26499);tw.write(array, 5, 5);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26500);expected.write(array, 5, 5);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26501);assertEquals(expected.toString(), sbw1.toString(), "TeeOutputStream.write(byte[], int, int)");
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26502);assertEquals(expected.toString(), sbw2.toString(), "TeeOutputStream.write(byte[], int, int)");

            __CLR4_4_1k8uk8ukylve3lq.R.inc(26503);for (int i = 0; (((i < 20)&&(__CLR4_4_1k8uk8ukylve3lq.R.iget(26504)!=0|true))||(__CLR4_4_1k8uk8ukylve3lq.R.iget(26505)==0&false)); i++) {{
                __CLR4_4_1k8uk8ukylve3lq.R.inc(26506);tw.append((char) i);
                __CLR4_4_1k8uk8ukylve3lq.R.inc(26507);expected.append((char) i);
            }
            }__CLR4_4_1k8uk8ukylve3lq.R.inc(26508);assertEquals(expected.toString(), sbw1.toString(), "ProxyCollectionWriter.append(char)");
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26509);assertEquals(expected.toString(), sbw2.toString(), "ProxyCollectionWriter.append(char)");

            __CLR4_4_1k8uk8ukylve3lq.R.inc(26510);for (int i = 20; (((i < 30)&&(__CLR4_4_1k8uk8ukylve3lq.R.iget(26511)!=0|true))||(__CLR4_4_1k8uk8ukylve3lq.R.iget(26512)==0&false)); i++) {{
                __CLR4_4_1k8uk8ukylve3lq.R.inc(26513);array[i - 20] = (char) i;
            }
            }__CLR4_4_1k8uk8ukylve3lq.R.inc(26514);tw.append(new String(array));
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26515);expected.append(new String(array));
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26516);assertEquals(expected.toString(), sbw1.toString(), "ProxyCollectionWriter.append(CharSequence)");
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26517);assertEquals(expected.toString(), sbw2.toString(), "ProxyCollectionWriter.write(CharSequence)");

            __CLR4_4_1k8uk8ukylve3lq.R.inc(26518);for (int i = 25; (((i < 35)&&(__CLR4_4_1k8uk8ukylve3lq.R.iget(26519)!=0|true))||(__CLR4_4_1k8uk8ukylve3lq.R.iget(26520)==0&false)); i++) {{
                __CLR4_4_1k8uk8ukylve3lq.R.inc(26521);array[i - 25] = (char) i;
            }
            }__CLR4_4_1k8uk8ukylve3lq.R.inc(26522);tw.append(new String(array), 5, 5);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26523);expected.append(new String(array), 5, 5);
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26524);assertEquals(expected.toString(), sbw1.toString(), "ProxyCollectionWriter.append(CharSequence, int, int)");
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26525);assertEquals(expected.toString(), sbw2.toString(), "ProxyCollectionWriter.append(CharSequence, int, int)");

            __CLR4_4_1k8uk8ukylve3lq.R.inc(26526);expected.flush();
            __CLR4_4_1k8uk8ukylve3lq.R.inc(26527);expected.close();

            __CLR4_4_1k8uk8ukylve3lq.R.inc(26528);tw.flush();
        }
    }finally{__CLR4_4_1k8uk8ukylve3lq.R.flushNeeded();}}

}
