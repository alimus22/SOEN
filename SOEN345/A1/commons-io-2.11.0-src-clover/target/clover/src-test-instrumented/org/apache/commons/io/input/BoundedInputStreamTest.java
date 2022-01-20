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

import java.io.ByteArrayInputStream;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link BoundedInputStream}.
 *
 */
public class BoundedInputStreamTest {static class __CLR4_4_1fyhfyhkylve2nx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,20723,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testReadSingle() throws Exception {__CLR4_4_1fyhfyhkylve2nx.R.globalSliceStart(getClass().getName(),20681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fxl4onfyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fyhfyhkylve2nx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fyhfyhkylve2nx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedInputStreamTest.testReadSingle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fxl4onfyh() throws Exception{try{__CLR4_4_1fyhfyhkylve2nx.R.inc(20681);
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20682);BoundedInputStream bounded;
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20683);final byte[] helloWorld = "Hello World".getBytes();
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20684);final byte[] hello      = "Hello".getBytes();

        // limit = length
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20685);bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld), helloWorld.length);
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20686);for (int i = 0; (((i < helloWorld.length)&&(__CLR4_4_1fyhfyhkylve2nx.R.iget(20687)!=0|true))||(__CLR4_4_1fyhfyhkylve2nx.R.iget(20688)==0&false)); i++) {{
            __CLR4_4_1fyhfyhkylve2nx.R.inc(20689);assertEquals(helloWorld[i], bounded.read(), "limit = length byte[" + i + "]");
        }
        }__CLR4_4_1fyhfyhkylve2nx.R.inc(20690);assertEquals(-1, bounded.read(), "limit = length end");

        // limit > length
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20691);bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld), helloWorld.length + 1);
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20692);for (int i = 0; (((i < helloWorld.length)&&(__CLR4_4_1fyhfyhkylve2nx.R.iget(20693)!=0|true))||(__CLR4_4_1fyhfyhkylve2nx.R.iget(20694)==0&false)); i++) {{
            __CLR4_4_1fyhfyhkylve2nx.R.inc(20695);assertEquals(helloWorld[i], bounded.read(), "limit > length byte[" + i + "]");
        }
        }__CLR4_4_1fyhfyhkylve2nx.R.inc(20696);assertEquals(-1, bounded.read(), "limit > length end");

        // limit < length
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20697);bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld), hello.length);
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20698);for (int i = 0; (((i < hello.length)&&(__CLR4_4_1fyhfyhkylve2nx.R.iget(20699)!=0|true))||(__CLR4_4_1fyhfyhkylve2nx.R.iget(20700)==0&false)); i++) {{
            __CLR4_4_1fyhfyhkylve2nx.R.inc(20701);assertEquals(hello[i], bounded.read(), "limit < length byte[" + i + "]");
        }
        }__CLR4_4_1fyhfyhkylve2nx.R.inc(20702);assertEquals(-1, bounded.read(), "limit < length end");
    }finally{__CLR4_4_1fyhfyhkylve2nx.R.flushNeeded();}}

    @Test
    public void testReadArray() throws Exception {__CLR4_4_1fyhfyhkylve2nx.R.globalSliceStart(getClass().getName(),20703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ercfzcfz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fyhfyhkylve2nx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fyhfyhkylve2nx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedInputStreamTest.testReadArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ercfzcfz3() throws Exception{try{__CLR4_4_1fyhfyhkylve2nx.R.inc(20703);

        __CLR4_4_1fyhfyhkylve2nx.R.inc(20704);BoundedInputStream bounded;
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20705);final byte[] helloWorld = "Hello World".getBytes();
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20706);final byte[] hello      = "Hello".getBytes();

        __CLR4_4_1fyhfyhkylve2nx.R.inc(20707);bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld));
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20708);compare("limit = -1", helloWorld, IOUtils.toByteArray(bounded));

        __CLR4_4_1fyhfyhkylve2nx.R.inc(20709);bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld), 0);
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20710);compare("limit = 0", IOUtils.EMPTY_BYTE_ARRAY, IOUtils.toByteArray(bounded));

        __CLR4_4_1fyhfyhkylve2nx.R.inc(20711);bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld), helloWorld.length);
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20712);compare("limit = length", helloWorld, IOUtils.toByteArray(bounded));

        __CLR4_4_1fyhfyhkylve2nx.R.inc(20713);bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld), helloWorld.length + 1);
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20714);compare("limit > length", helloWorld, IOUtils.toByteArray(bounded));

        __CLR4_4_1fyhfyhkylve2nx.R.inc(20715);bounded = new BoundedInputStream(new ByteArrayInputStream(helloWorld), helloWorld.length - 6);
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20716);compare("limit < length", hello, IOUtils.toByteArray(bounded));
    }finally{__CLR4_4_1fyhfyhkylve2nx.R.flushNeeded();}}

    private void compare(final String msg, final byte[] expected, final byte[] actual) {try{__CLR4_4_1fyhfyhkylve2nx.R.inc(20717);
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20718);assertEquals(expected.length, actual.length, msg + " length");
        __CLR4_4_1fyhfyhkylve2nx.R.inc(20719);for (int i = 0; (((i < expected.length)&&(__CLR4_4_1fyhfyhkylve2nx.R.iget(20720)!=0|true))||(__CLR4_4_1fyhfyhkylve2nx.R.iget(20721)==0&false)); i++) {{
            __CLR4_4_1fyhfyhkylve2nx.R.inc(20722);assertEquals(expected[i], actual[i], msg + " byte[" + i + "]");
        }
    }}finally{__CLR4_4_1fyhfyhkylve2nx.R.flushNeeded();}}
}
