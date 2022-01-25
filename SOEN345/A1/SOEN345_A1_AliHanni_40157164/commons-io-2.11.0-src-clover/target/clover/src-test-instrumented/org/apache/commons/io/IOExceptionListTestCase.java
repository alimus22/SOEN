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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.EOFException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Tests {@link IOExceptionList}.
 */
public class IOExceptionListTestCase {static class __CLR4_4_1bs1bs1kylve1pq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,15305,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCause() {__CLR4_4_1bs1bs1kylve1pq.R.globalSliceStart(getClass().getName(),15265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ff6aqbs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bs1bs1kylve1pq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bs1bs1kylve1pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOExceptionListTestCase.testCause",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ff6aqbs1(){try{__CLR4_4_1bs1bs1kylve1pq.R.inc(15265);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15266);final EOFException cause = new EOFException();
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15267);final List<EOFException> list = Collections.singletonList(cause);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15268);final IOExceptionList sqlExceptionList = new IOExceptionList(list);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15269);assertEquals(cause, sqlExceptionList.getCause());
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15270);assertEquals(cause, sqlExceptionList.getCause(0));
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15271);assertEquals(list, sqlExceptionList.getCauseList());
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15272);assertEquals(list, sqlExceptionList.getCauseList(EOFException.class));
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15273);assertEquals(cause, sqlExceptionList.getCause(0, EOFException.class));
        // No CCE:
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15274);final List<EOFException> causeList = sqlExceptionList.getCauseList();
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15275);assertEquals(list, causeList);
    }finally{__CLR4_4_1bs1bs1kylve1pq.R.flushNeeded();}}

    @Test
    public void testEmptyList() {__CLR4_4_1bs1bs1kylve1pq.R.globalSliceStart(getClass().getName(),15276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6zswbsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bs1bs1kylve1pq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bs1bs1kylve1pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOExceptionListTestCase.testEmptyList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6zswbsc(){try{__CLR4_4_1bs1bs1kylve1pq.R.inc(15276);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15277);new IOExceptionList(Collections.emptyList());
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15278);new IOExceptionList("foo", Collections.emptyList());
    }finally{__CLR4_4_1bs1bs1kylve1pq.R.flushNeeded();}}

    @Test
    public void testMessageCause() {__CLR4_4_1bs1bs1kylve1pq.R.globalSliceStart(getClass().getName(),15279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n13k6dbsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bs1bs1kylve1pq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bs1bs1kylve1pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOExceptionListTestCase.testMessageCause",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n13k6dbsf(){try{__CLR4_4_1bs1bs1kylve1pq.R.inc(15279);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15280);final EOFException cause = new EOFException();
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15281);final List<EOFException> list = Collections.singletonList(cause);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15282);final IOExceptionList sqlExceptionList = new IOExceptionList("Hello", list);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15283);assertEquals("Hello", sqlExceptionList.getMessage());
        //
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15284);assertEquals(cause, sqlExceptionList.getCause());
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15285);assertEquals(cause, sqlExceptionList.getCause(0));
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15286);assertEquals(list, sqlExceptionList.getCauseList());
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15287);assertEquals(list, sqlExceptionList.getCauseList(EOFException.class));
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15288);assertEquals(cause, sqlExceptionList.getCause(0, EOFException.class));
        // No CCE:
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15289);final List<EOFException> causeList = sqlExceptionList.getCauseList();
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15290);assertEquals(list, causeList);
    }finally{__CLR4_4_1bs1bs1kylve1pq.R.flushNeeded();}}

    @Test
    public void testNullCause() {__CLR4_4_1bs1bs1kylve1pq.R.globalSliceStart(getClass().getName(),15291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kwcuhbsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bs1bs1kylve1pq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bs1bs1kylve1pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOExceptionListTestCase.testNullCause",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kwcuhbsr(){try{__CLR4_4_1bs1bs1kylve1pq.R.inc(15291);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15292);final IOExceptionList sqlExceptionList = new IOExceptionList(null);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15293);assertNull(sqlExceptionList.getCause());
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15294);assertTrue(sqlExceptionList.getCauseList().isEmpty());
    }finally{__CLR4_4_1bs1bs1kylve1pq.R.flushNeeded();}}

    @Test
    public void testPrintStackTrace() {__CLR4_4_1bs1bs1kylve1pq.R.globalSliceStart(getClass().getName(),15295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1657rzzbsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bs1bs1kylve1pq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bs1bs1kylve1pq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOExceptionListTestCase.testPrintStackTrace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1657rzzbsv(){try{__CLR4_4_1bs1bs1kylve1pq.R.inc(15295);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15296);final EOFException cause = new EOFException();
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15297);final List<EOFException> list = Collections.singletonList(cause);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15298);final IOExceptionList sqlExceptionList = new IOExceptionList(list);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15299);final StringWriter sw = new StringWriter();
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15300);final PrintWriter pw = new PrintWriter(sw);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15301);sqlExceptionList.printStackTrace(pw);
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15302);final String st = sw.toString();
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15303);assertTrue(st.startsWith("org.apache.commons.io.IOExceptionList: 1 exceptions: [java.io.EOFException]"));
        __CLR4_4_1bs1bs1kylve1pq.R.inc(15304);assertTrue(st.contains("Caused by: java.io.EOFException"));
    }finally{__CLR4_4_1bs1bs1kylve1pq.R.flushNeeded();}}
}
