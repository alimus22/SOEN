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
 * JUnit Test Case for {@link TeeWriter}.
 */
@SuppressWarnings("resource") // not necessary to close these resources
public class TeeWriterTest {static class __CLR4_4_1ktcktckylve3pf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,27267,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testArrayIOExceptionOnAppendChar1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),26976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdb19jktc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnAppendChar1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdb19jktc() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(26976);
        __CLR4_4_1ktcktckylve3pf.R.inc(26977);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(26978);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(26979);final ProxyCollectionWriter tw = new ProxyCollectionWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(26980);final char data = 'A';
        __CLR4_4_1ktcktckylve3pf.R.inc(26981);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(26982);tw.append(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(26983);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(26984);verify(goodW).append(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(26985);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(26986);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendChar2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),26987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmb020ktn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnAppendChar2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmb020ktn() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(26987);
        __CLR4_4_1ktcktckylve3pf.R.inc(26988);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(26989);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(26990);final ProxyCollectionWriter tw = new ProxyCollectionWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(26991);final char data = 'A';
        __CLR4_4_1ktcktckylve3pf.R.inc(26992);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(26993);tw.append(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(26994);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(26995);verify(goodW).append(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(26996);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(26997);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendCharSequence1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),26998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjwjgakty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnAppendCharSequence1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjwjgakty() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(26998);
        __CLR4_4_1ktcktckylve3pf.R.inc(26999);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27000);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27001);final TeeWriter tw = new TeeWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27002);final String data = "A";
        __CLR4_4_1ktcktckylve3pf.R.inc(27003);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27004);tw.append(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27005);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27006);verify(goodW).append(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27007);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27008);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendCharSequence2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nawkntku9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnAppendCharSequence2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nawkntku9() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27009);
        __CLR4_4_1ktcktckylve3pf.R.inc(27010);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27011);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27012);final TeeWriter tw = new TeeWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27013);final String data = "A";
        __CLR4_4_1ktcktckylve3pf.R.inc(27014);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27015);tw.append(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27016);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27017);verify(goodW).append(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27018);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27019);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendCharSequenceIntInt1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6wtbakuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnAppendCharSequenceIntInt1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6wtbakuk() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27020);
        __CLR4_4_1ktcktckylve3pf.R.inc(27021);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27022);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27023);final TeeWriter tw = new TeeWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27024);final String data = "A";
        __CLR4_4_1ktcktckylve3pf.R.inc(27025);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27026);tw.append(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27027);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27028);verify(goodW).append(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27029);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27030);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnAppendCharSequenceIntInt2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufws3rkuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnAppendCharSequenceIntInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufws3rkuv() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27031);
        __CLR4_4_1ktcktckylve3pf.R.inc(27032);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27033);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27034);final TeeWriter tw = new TeeWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27035);final String data = "A";
        __CLR4_4_1ktcktckylve3pf.R.inc(27036);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27037);tw.append(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27038);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27039);verify(goodW).append(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27040);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27041);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnClose1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15srj4xkv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnClose1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15srj4xkv6() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27042);
        __CLR4_4_1ktcktckylve3pf.R.inc(27043);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27044);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27045);final TeeWriter tw = new TeeWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27046);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27047);tw.close();
            __CLR4_4_1ktcktckylve3pf.R.inc(27048);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27049);verify(goodW).close();
            __CLR4_4_1ktcktckylve3pf.R.inc(27050);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27051);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnClose2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191rhxekvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnClose2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191rhxekvg() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27052);
        __CLR4_4_1ktcktckylve3pf.R.inc(27053);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27054);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27055);final TeeWriter tw = new TeeWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27056);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27057);tw.close();
            __CLR4_4_1ktcktckylve3pf.R.inc(27058);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27059);verify(goodW).close();
            __CLR4_4_1ktcktckylve3pf.R.inc(27060);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27061);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnFlush1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrc57vkvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnFlush1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrc57vkvq() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27062);
        __CLR4_4_1ktcktckylve3pf.R.inc(27063);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27064);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27065);final TeeWriter tw = new TeeWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27066);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27067);tw.flush();
            __CLR4_4_1ktcktckylve3pf.R.inc(27068);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27069);verify(goodW).flush();
            __CLR4_4_1ktcktckylve3pf.R.inc(27070);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27071);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnFlush2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iic6fekw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnFlush2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iic6fekw0() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27072);
        __CLR4_4_1ktcktckylve3pf.R.inc(27073);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27074);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27075);final TeeWriter tw = new TeeWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27076);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27077);tw.flush();
            __CLR4_4_1ktcktckylve3pf.R.inc(27078);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27079);verify(goodW).flush();
            __CLR4_4_1ktcktckylve3pf.R.inc(27080);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27081);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteCharArray1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mcdalkwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteCharArray1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mcdalkwa() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27082);
        __CLR4_4_1ktcktckylve3pf.R.inc(27083);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27084);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27085);final TeeWriter tw = new TeeWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27086);final char[] data = { 'a' };
        __CLR4_4_1ktcktckylve3pf.R.inc(27087);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27088);tw.write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27089);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27090);verify(goodW).write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27091);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27092);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteCharArray2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dcei4kwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteCharArray2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dcei4kwl() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27093);
        __CLR4_4_1ktcktckylve3pf.R.inc(27094);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27095);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27096);final TeeWriter tw = new TeeWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27097);final char[] data = { 'a' };
        __CLR4_4_1ktcktckylve3pf.R.inc(27098);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27099);tw.write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27100);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27101);verify(goodW).write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27102);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27103);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteCharArrayIntInt1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tjowjkww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteCharArrayIntInt1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tjowjkww() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27104);
        __CLR4_4_1ktcktckylve3pf.R.inc(27105);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27106);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27107);final TeeWriter tw = new TeeWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27108);final char[] data = { 'a' };
        __CLR4_4_1ktcktckylve3pf.R.inc(27109);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27110);tw.write(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27111);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27112);verify(goodW).write(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27113);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27114);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteCharArrayIntInt2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2jnp0kx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteCharArrayIntInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2jnp0kx7() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27115);
        __CLR4_4_1ktcktckylve3pf.R.inc(27116);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27117);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27118);final TeeWriter tw = new TeeWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27119);final char[] data = { 'a' };
        __CLR4_4_1ktcktckylve3pf.R.inc(27120);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27121);tw.write(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27122);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27123);verify(goodW).write(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27124);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27125);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteInt1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbf46fkxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteInt1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbf46fkxi() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27126);
        __CLR4_4_1ktcktckylve3pf.R.inc(27127);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27128);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27129);final TeeWriter tw = new TeeWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27130);final int data = 32;
        __CLR4_4_1ktcktckylve3pf.R.inc(27131);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27132);tw.write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27133);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27134);verify(goodW).write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27135);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27136);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteInt2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgoz08kxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgoz08kxt() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27137);
        __CLR4_4_1ktcktckylve3pf.R.inc(27138);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27139);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27140);final TeeWriter tw = new TeeWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27141);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27142);tw.write(32);
            __CLR4_4_1ktcktckylve3pf.R.inc(27143);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27144);verify(goodW).write(32);
            __CLR4_4_1ktcktckylve3pf.R.inc(27145);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27146);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());

        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteString1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nj864pky3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nj864pky3() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27147);
        __CLR4_4_1ktcktckylve3pf.R.inc(27148);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27149);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27150);final TeeWriter tw = new TeeWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27151);final String data = "A";
        __CLR4_4_1ktcktckylve3pf.R.inc(27152);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27153);tw.write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27154);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27155);verify(goodW).write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27156);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27157);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteString2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qs84x6kye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qs84x6kye() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27158);
        __CLR4_4_1ktcktckylve3pf.R.inc(27159);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27160);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27161);final TeeWriter tw = new TeeWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27162);final String data = "A";
        __CLR4_4_1ktcktckylve3pf.R.inc(27163);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27164);tw.write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27165);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27166);verify(goodW).write(data);
            __CLR4_4_1ktcktckylve3pf.R.inc(27167);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27168);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());

        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteStringIntInt1() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1guaouvkyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteStringIntInt1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1guaouvkyp() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27169);
        __CLR4_4_1ktcktckylve3pf.R.inc(27170);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27171);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27172);final TeeWriter tw = new TeeWriter(badW, goodW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27173);final String data = "A";
        __CLR4_4_1ktcktckylve3pf.R.inc(27174);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27175);tw.write(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27176);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27177);verify(goodW).write(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27178);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27179);assertEquals(0, e.getCause(0, IOIndexedException.class).getIndex());
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testArrayIOExceptionOnWriteStringIntInt2() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlaq2ekz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testArrayIOExceptionOnWriteStringIntInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlaq2ekz0() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27180);
        __CLR4_4_1ktcktckylve3pf.R.inc(27181);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27182);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27183);final TeeWriter tw = new TeeWriter(goodW, badW, null);
        __CLR4_4_1ktcktckylve3pf.R.inc(27184);final String data = "A";
        __CLR4_4_1ktcktckylve3pf.R.inc(27185);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27186);tw.write(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27187);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27188);verify(goodW).write(data, 0, 0);
            __CLR4_4_1ktcktckylve3pf.R.inc(27189);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27190);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());

        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testCollectionCloseBranchIOException() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dk6qukzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testCollectionCloseBranchIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dk6qukzb() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27191);
        __CLR4_4_1ktcktckylve3pf.R.inc(27192);final Writer badW = new BrokenWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27193);final StringWriter goodW = mock(StringWriter.class);
        __CLR4_4_1ktcktckylve3pf.R.inc(27194);final TeeWriter tw = new TeeWriter(Arrays.asList(goodW, badW, null));
        __CLR4_4_1ktcktckylve3pf.R.inc(27195);try {
            __CLR4_4_1ktcktckylve3pf.R.inc(27196);tw.close();
            __CLR4_4_1ktcktckylve3pf.R.inc(27197);fail("Expected " + IOException.class.getName());
        } catch (final IOExceptionList e) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27198);verify(goodW).close();
            __CLR4_4_1ktcktckylve3pf.R.inc(27199);assertEquals(1, e.getCauseList().size());
            __CLR4_4_1ktcktckylve3pf.R.inc(27200);assertEquals(1, e.getCause(0, IOIndexedException.class).getIndex());

        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testConstructorsNull() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14la0yvkzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testConstructorsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14la0yvkzl() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27201);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ktcktckylve3pf.R.inc(27202);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1ktcktckylve3pf.R.inc(27203);}};final TeeWriter teeWriter = new TeeWriter((Writer[]) null)) {
            // Call any method, should not throw
            __CLR4_4_1ktcktckylve3pf.R.inc(27204);teeWriter.append('a');
            __CLR4_4_1ktcktckylve3pf.R.inc(27205);teeWriter.flush();
        }
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ktcktckylve3pf.R.inc(27206);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1ktcktckylve3pf.R.inc(27207);}};final TeeWriter teeWriter = new TeeWriter((Collection<Writer>) null)) {
            // Call any method, should not throw
            __CLR4_4_1ktcktckylve3pf.R.inc(27208);teeWriter.append('a');
            __CLR4_4_1ktcktckylve3pf.R.inc(27209);teeWriter.flush();
        }
        __CLR4_4_1ktcktckylve3pf.R.inc(27210);assertTrue(true, "Dummy to show test completed OK");
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

    @Test
    public void testTee() throws IOException {__CLR4_4_1ktcktckylve3pf.R.globalSliceStart(getClass().getName(),27211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8kyztkzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ktcktckylve3pf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ktcktckylve3pf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeWriterTest.testTee",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8kyztkzv() throws IOException{try{__CLR4_4_1ktcktckylve3pf.R.inc(27211);
        __CLR4_4_1ktcktckylve3pf.R.inc(27212);final StringBuilderWriter sbw1 = new StringBuilderWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27213);final StringBuilderWriter sbw2 = new StringBuilderWriter();
        __CLR4_4_1ktcktckylve3pf.R.inc(27214);final StringBuilderWriter expected = new StringBuilderWriter();

        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ktcktckylve3pf.R.inc(27215);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1ktcktckylve3pf.R.inc(27216);}};final TeeWriter tw = new TeeWriter(sbw1, sbw2, null)) {
            __CLR4_4_1ktcktckylve3pf.R.inc(27217);for (int i = 0; (((i < 20)&&(__CLR4_4_1ktcktckylve3pf.R.iget(27218)!=0|true))||(__CLR4_4_1ktcktckylve3pf.R.iget(27219)==0&false)); i++) {{
                __CLR4_4_1ktcktckylve3pf.R.inc(27220);tw.write(i);
                __CLR4_4_1ktcktckylve3pf.R.inc(27221);expected.write(i);
            }
            }__CLR4_4_1ktcktckylve3pf.R.inc(27222);assertEquals(expected.toString(), sbw1.toString(), "TeeWriter.write(int)");
            __CLR4_4_1ktcktckylve3pf.R.inc(27223);assertEquals(expected.toString(), sbw2.toString(), "TeeWriter.write(int)");

            __CLR4_4_1ktcktckylve3pf.R.inc(27224);final char[] array = new char[10];
            __CLR4_4_1ktcktckylve3pf.R.inc(27225);for (int i = 20; (((i < 30)&&(__CLR4_4_1ktcktckylve3pf.R.iget(27226)!=0|true))||(__CLR4_4_1ktcktckylve3pf.R.iget(27227)==0&false)); i++) {{
                __CLR4_4_1ktcktckylve3pf.R.inc(27228);array[i - 20] = (char) i;
            }
            }__CLR4_4_1ktcktckylve3pf.R.inc(27229);tw.write(array);
            __CLR4_4_1ktcktckylve3pf.R.inc(27230);expected.write(array);
            __CLR4_4_1ktcktckylve3pf.R.inc(27231);assertEquals(expected.toString(), sbw1.toString(), "TeeWriter.write(char[])");
            __CLR4_4_1ktcktckylve3pf.R.inc(27232);assertEquals(expected.toString(), sbw2.toString(), "TeeWriter.write(char[])");

            __CLR4_4_1ktcktckylve3pf.R.inc(27233);for (int i = 25; (((i < 35)&&(__CLR4_4_1ktcktckylve3pf.R.iget(27234)!=0|true))||(__CLR4_4_1ktcktckylve3pf.R.iget(27235)==0&false)); i++) {{
                __CLR4_4_1ktcktckylve3pf.R.inc(27236);array[i - 25] = (char) i;
            }
            }__CLR4_4_1ktcktckylve3pf.R.inc(27237);tw.write(array, 5, 5);
            __CLR4_4_1ktcktckylve3pf.R.inc(27238);expected.write(array, 5, 5);
            __CLR4_4_1ktcktckylve3pf.R.inc(27239);assertEquals(expected.toString(), sbw1.toString(), "TeeOutputStream.write(byte[], int, int)");
            __CLR4_4_1ktcktckylve3pf.R.inc(27240);assertEquals(expected.toString(), sbw2.toString(), "TeeOutputStream.write(byte[], int, int)");

            __CLR4_4_1ktcktckylve3pf.R.inc(27241);for (int i = 0; (((i < 20)&&(__CLR4_4_1ktcktckylve3pf.R.iget(27242)!=0|true))||(__CLR4_4_1ktcktckylve3pf.R.iget(27243)==0&false)); i++) {{
                __CLR4_4_1ktcktckylve3pf.R.inc(27244);tw.append((char) i);
                __CLR4_4_1ktcktckylve3pf.R.inc(27245);expected.append((char) i);
            }
            }__CLR4_4_1ktcktckylve3pf.R.inc(27246);assertEquals(expected.toString(), sbw1.toString(), "TeeWriter.append(char)");
            __CLR4_4_1ktcktckylve3pf.R.inc(27247);assertEquals(expected.toString(), sbw2.toString(), "TeeWriter.append(char)");

            __CLR4_4_1ktcktckylve3pf.R.inc(27248);for (int i = 20; (((i < 30)&&(__CLR4_4_1ktcktckylve3pf.R.iget(27249)!=0|true))||(__CLR4_4_1ktcktckylve3pf.R.iget(27250)==0&false)); i++) {{
                __CLR4_4_1ktcktckylve3pf.R.inc(27251);array[i - 20] = (char) i;
            }
            }__CLR4_4_1ktcktckylve3pf.R.inc(27252);tw.append(new String(array));
            __CLR4_4_1ktcktckylve3pf.R.inc(27253);expected.append(new String(array));
            __CLR4_4_1ktcktckylve3pf.R.inc(27254);assertEquals(expected.toString(), sbw1.toString(), "TeeWriter.append(CharSequence)");
            __CLR4_4_1ktcktckylve3pf.R.inc(27255);assertEquals(expected.toString(), sbw2.toString(), "TeeWriter.append(CharSequence)");

            __CLR4_4_1ktcktckylve3pf.R.inc(27256);for (int i = 25; (((i < 35)&&(__CLR4_4_1ktcktckylve3pf.R.iget(27257)!=0|true))||(__CLR4_4_1ktcktckylve3pf.R.iget(27258)==0&false)); i++) {{
                __CLR4_4_1ktcktckylve3pf.R.inc(27259);array[i - 25] = (char) i;
            }
            }__CLR4_4_1ktcktckylve3pf.R.inc(27260);tw.append(new String(array), 5, 5);
            __CLR4_4_1ktcktckylve3pf.R.inc(27261);expected.append(new String(array), 5, 5);
            __CLR4_4_1ktcktckylve3pf.R.inc(27262);assertEquals(expected.toString(), sbw1.toString(), "TeeWriter.append(CharSequence, int, int)");
            __CLR4_4_1ktcktckylve3pf.R.inc(27263);assertEquals(expected.toString(), sbw2.toString(), "TeeWriter.append(CharSequence, int, int)");

            __CLR4_4_1ktcktckylve3pf.R.inc(27264);expected.flush();
            __CLR4_4_1ktcktckylve3pf.R.inc(27265);expected.close();

            __CLR4_4_1ktcktckylve3pf.R.inc(27266);tw.flush();
        }
    }finally{__CLR4_4_1ktcktckylve3pf.R.flushNeeded();}}

}
