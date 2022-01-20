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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link AutoCloseInputStream}.
 */
public class AutoCloseInputStreamTest {static class __CLR4_4_1fimfimkylve2l6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,20175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private byte[] data;

    private InputStream stream;

    private boolean closed;

    @BeforeEach
    public void setUp() {try{__CLR4_4_1fimfimkylve2l6.R.inc(20110);
        __CLR4_4_1fimfimkylve2l6.R.inc(20111);data = new byte[] {'x', 'y', 'z'};
        __CLR4_4_1fimfimkylve2l6.R.inc(20112);stream = new AutoCloseInputStream(new ByteArrayInputStream(data) {
            @Override
            public void close() {try{__CLR4_4_1fimfimkylve2l6.R.inc(20113);
                __CLR4_4_1fimfimkylve2l6.R.inc(20114);closed = true;
            }finally{__CLR4_4_1fimfimkylve2l6.R.flushNeeded();}}
        });
        __CLR4_4_1fimfimkylve2l6.R.inc(20115);closed = false;
    }finally{__CLR4_4_1fimfimkylve2l6.R.flushNeeded();}}

    @Test
    public void testClose() throws IOException {__CLR4_4_1fimfimkylve2l6.R.globalSliceStart(getClass().getName(),20116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169vzsjfis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fimfimkylve2l6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fimfimkylve2l6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AutoCloseInputStreamTest.testClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169vzsjfis() throws IOException{try{__CLR4_4_1fimfimkylve2l6.R.inc(20116);
        __CLR4_4_1fimfimkylve2l6.R.inc(20117);stream.close();
        __CLR4_4_1fimfimkylve2l6.R.inc(20118);assertTrue(closed, "closed");
        __CLR4_4_1fimfimkylve2l6.R.inc(20119);assertEquals(-1, stream.read(), "read()");
    }finally{__CLR4_4_1fimfimkylve2l6.R.flushNeeded();}}

    @Test
    public void testRead() throws IOException {__CLR4_4_1fimfimkylve2l6.R.globalSliceStart(getClass().getName(),20120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9ovapfiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fimfimkylve2l6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fimfimkylve2l6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AutoCloseInputStreamTest.testRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9ovapfiw() throws IOException{try{__CLR4_4_1fimfimkylve2l6.R.inc(20120);
        __CLR4_4_1fimfimkylve2l6.R.inc(20121);for (final byte element : data) {{
            __CLR4_4_1fimfimkylve2l6.R.inc(20122);assertEquals(element, stream.read(), "read()");
            __CLR4_4_1fimfimkylve2l6.R.inc(20123);assertFalse(closed, "closed");
        }
        }__CLR4_4_1fimfimkylve2l6.R.inc(20124);assertEquals(-1, stream.read(), "read()");
        __CLR4_4_1fimfimkylve2l6.R.inc(20125);assertTrue(closed, "closed");
    }finally{__CLR4_4_1fimfimkylve2l6.R.flushNeeded();}}

    @Test
    public void testReadBuffer() throws IOException {__CLR4_4_1fimfimkylve2l6.R.globalSliceStart(getClass().getName(),20126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hi6pzlfj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fimfimkylve2l6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fimfimkylve2l6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AutoCloseInputStreamTest.testReadBuffer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hi6pzlfj2() throws IOException{try{__CLR4_4_1fimfimkylve2l6.R.inc(20126);
        __CLR4_4_1fimfimkylve2l6.R.inc(20127);final byte[] b = new byte[data.length * 2];
        __CLR4_4_1fimfimkylve2l6.R.inc(20128);int total = 0;
        __CLR4_4_1fimfimkylve2l6.R.inc(20129);for (int n = 0; (((n != -1)&&(__CLR4_4_1fimfimkylve2l6.R.iget(20130)!=0|true))||(__CLR4_4_1fimfimkylve2l6.R.iget(20131)==0&false)); n = stream.read(b)) {{
            __CLR4_4_1fimfimkylve2l6.R.inc(20132);assertFalse(closed, "closed");
            __CLR4_4_1fimfimkylve2l6.R.inc(20133);for (int i = 0; (((i < n)&&(__CLR4_4_1fimfimkylve2l6.R.iget(20134)!=0|true))||(__CLR4_4_1fimfimkylve2l6.R.iget(20135)==0&false)); i++) {{
                __CLR4_4_1fimfimkylve2l6.R.inc(20136);assertEquals(data[total + i], b[i], "read(b)");
            }
            }__CLR4_4_1fimfimkylve2l6.R.inc(20137);total += n;
        }
        }__CLR4_4_1fimfimkylve2l6.R.inc(20138);assertEquals(data.length, total, "read(b)");
        __CLR4_4_1fimfimkylve2l6.R.inc(20139);assertTrue(closed, "closed");
        __CLR4_4_1fimfimkylve2l6.R.inc(20140);assertEquals(-1, stream.read(b), "read(b)");
    }finally{__CLR4_4_1fimfimkylve2l6.R.flushNeeded();}}

    @Test
    public void testReadBufferOffsetLength() throws IOException {__CLR4_4_1fimfimkylve2l6.R.globalSliceStart(getClass().getName(),20141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196de14fjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fimfimkylve2l6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fimfimkylve2l6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AutoCloseInputStreamTest.testReadBufferOffsetLength",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196de14fjh() throws IOException{try{__CLR4_4_1fimfimkylve2l6.R.inc(20141);
        __CLR4_4_1fimfimkylve2l6.R.inc(20142);final byte[] b = new byte[data.length * 2];
        __CLR4_4_1fimfimkylve2l6.R.inc(20143);int total = 0;
        __CLR4_4_1fimfimkylve2l6.R.inc(20144);for (int n = 0; (((n != -1)&&(__CLR4_4_1fimfimkylve2l6.R.iget(20145)!=0|true))||(__CLR4_4_1fimfimkylve2l6.R.iget(20146)==0&false)); n = stream.read(b, total, b.length - total)) {{
            __CLR4_4_1fimfimkylve2l6.R.inc(20147);assertFalse(closed, "closed");
            __CLR4_4_1fimfimkylve2l6.R.inc(20148);total += n;
        }
        }__CLR4_4_1fimfimkylve2l6.R.inc(20149);assertEquals(data.length, total, "read(b, off, len)");
        __CLR4_4_1fimfimkylve2l6.R.inc(20150);for (int i = 0; (((i < data.length)&&(__CLR4_4_1fimfimkylve2l6.R.iget(20151)!=0|true))||(__CLR4_4_1fimfimkylve2l6.R.iget(20152)==0&false)); i++) {{
            __CLR4_4_1fimfimkylve2l6.R.inc(20153);assertEquals(data[i], b[i], "read(b, off, len)");
        }
        }__CLR4_4_1fimfimkylve2l6.R.inc(20154);assertTrue(closed, "closed");
        __CLR4_4_1fimfimkylve2l6.R.inc(20155);assertEquals(-1, stream.read(b, 0, b.length), "read(b, off, len)");
    }finally{__CLR4_4_1fimfimkylve2l6.R.flushNeeded();}}

    @Test
    public void testResetBeforeEnd() throws IOException {__CLR4_4_1fimfimkylve2l6.R.globalSliceStart(getClass().getName(),20156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1offizqfjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fimfimkylve2l6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fimfimkylve2l6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AutoCloseInputStreamTest.testResetBeforeEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1offizqfjw() throws IOException{try{__CLR4_4_1fimfimkylve2l6.R.inc(20156);
        __CLR4_4_1fimfimkylve2l6.R.inc(20157);final String inputStr = "1234";
        __CLR4_4_1fimfimkylve2l6.R.inc(20158);final AutoCloseInputStream inputStream = new AutoCloseInputStream(new ByteArrayInputStream(inputStr.getBytes()));
        __CLR4_4_1fimfimkylve2l6.R.inc(20159);inputStream.mark(1);
        __CLR4_4_1fimfimkylve2l6.R.inc(20160);assertEquals('1', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20161);inputStream.reset();
        __CLR4_4_1fimfimkylve2l6.R.inc(20162);assertEquals('1', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20163);assertEquals('2', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20164);inputStream.reset();
        __CLR4_4_1fimfimkylve2l6.R.inc(20165);assertEquals('1', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20166);assertEquals('2', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20167);assertEquals('3', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20168);inputStream.reset();
        __CLR4_4_1fimfimkylve2l6.R.inc(20169);assertEquals('1', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20170);assertEquals('2', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20171);assertEquals('3', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20172);assertEquals('4', inputStream.read());
        __CLR4_4_1fimfimkylve2l6.R.inc(20173);inputStream.reset();
        __CLR4_4_1fimfimkylve2l6.R.inc(20174);assertEquals('1', inputStream.read());
    }finally{__CLR4_4_1fimfimkylve2l6.R.flushNeeded();}}

}
