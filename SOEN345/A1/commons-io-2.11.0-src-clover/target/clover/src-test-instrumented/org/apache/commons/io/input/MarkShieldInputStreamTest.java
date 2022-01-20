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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

public class MarkShieldInputStreamTest {static class __CLR4_4_1gwagwakylve2w7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21940,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void markIsNoOpWhenUnderlyingDoesNotSupport() throws IOException {__CLR4_4_1gwagwakylve2w7.R.globalSliceStart(getClass().getName(),21898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ibutwgwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gwagwakylve2w7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gwagwakylve2w7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.MarkShieldInputStreamTest.markIsNoOpWhenUnderlyingDoesNotSupport",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ibutwgwa() throws IOException{try{__CLR4_4_1gwagwakylve2w7.R.inc(21898);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gwagwakylve2w7.R.inc(21899);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1gwagwakylve2w7.R.inc(21900);}};final MarkTestableInputStream in = new MarkTestableInputStream(new NullInputStream(64, false, false));
             __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1gwagwakylve2w7.R.inc(21901);}};final MarkShieldInputStream msis = new MarkShieldInputStream(in)) {

            __CLR4_4_1gwagwakylve2w7.R.inc(21902);msis.mark(1024);

            __CLR4_4_1gwagwakylve2w7.R.inc(21903);assertEquals(0, in.markcount);
            __CLR4_4_1gwagwakylve2w7.R.inc(21904);assertEquals(0, in.readlimit);
        }
    }finally{__CLR4_4_1gwagwakylve2w7.R.flushNeeded();}}

    @Test
    public void markIsNoOpWhenUnderlyingSupports() throws IOException {__CLR4_4_1gwagwakylve2w7.R.globalSliceStart(getClass().getName(),21905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnw8hngwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gwagwakylve2w7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gwagwakylve2w7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.MarkShieldInputStreamTest.markIsNoOpWhenUnderlyingSupports",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnw8hngwh() throws IOException{try{__CLR4_4_1gwagwakylve2w7.R.inc(21905);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gwagwakylve2w7.R.inc(21906);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1gwagwakylve2w7.R.inc(21907);}};final MarkTestableInputStream in = new MarkTestableInputStream(new NullInputStream(64, true, false));
             __CLR4_4_1$AC1 __CLR$ACI3=new __CLR4_4_1$AC1(){{__CLR4_4_1gwagwakylve2w7.R.inc(21908);}};final MarkShieldInputStream msis = new MarkShieldInputStream(in)) {

            __CLR4_4_1gwagwakylve2w7.R.inc(21909);msis.mark(1024);

            __CLR4_4_1gwagwakylve2w7.R.inc(21910);assertEquals(0, in.markcount);
            __CLR4_4_1gwagwakylve2w7.R.inc(21911);assertEquals(0, in.readlimit);
        }
    }finally{__CLR4_4_1gwagwakylve2w7.R.flushNeeded();}}

    @Test
    public void markSupportedIsFalseWhenUnderlyingFalse() throws IOException {__CLR4_4_1gwagwakylve2w7.R.globalSliceStart(getClass().getName(),21912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lba1xgwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gwagwakylve2w7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gwagwakylve2w7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.MarkShieldInputStreamTest.markSupportedIsFalseWhenUnderlyingFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lba1xgwo() throws IOException{try{__CLR4_4_1gwagwakylve2w7.R.inc(21912);
        // test wrapping an underlying stream which does NOT support marking
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gwagwakylve2w7.R.inc(21913);try (__CLR4_4_1$AC2 __CLR$ACI4=new __CLR4_4_1$AC2(){{__CLR4_4_1gwagwakylve2w7.R.inc(21914);}};final InputStream is = new NullInputStream(64, false, false)) {
            __CLR4_4_1gwagwakylve2w7.R.inc(21915);assertFalse(is.markSupported());

            class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gwagwakylve2w7.R.inc(21916);try (__CLR4_4_1$AC3 __CLR$ACI5=new __CLR4_4_1$AC3(){{__CLR4_4_1gwagwakylve2w7.R.inc(21917);}};final MarkShieldInputStream msis = new MarkShieldInputStream(is)) {
                __CLR4_4_1gwagwakylve2w7.R.inc(21918);assertFalse(msis.markSupported());
            }
        }
    }finally{__CLR4_4_1gwagwakylve2w7.R.flushNeeded();}}

    @Test
    public void markSupportedIsFalseWhenUnderlyingTrue() throws IOException {__CLR4_4_1gwagwakylve2w7.R.globalSliceStart(getClass().getName(),21919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt1lr0gwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gwagwakylve2w7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gwagwakylve2w7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.MarkShieldInputStreamTest.markSupportedIsFalseWhenUnderlyingTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt1lr0gwv() throws IOException{try{__CLR4_4_1gwagwakylve2w7.R.inc(21919);
        // test wrapping an underlying stream which supports marking
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gwagwakylve2w7.R.inc(21920);try (__CLR4_4_1$AC4 __CLR$ACI6=new __CLR4_4_1$AC4(){{__CLR4_4_1gwagwakylve2w7.R.inc(21921);}};final InputStream is = new NullInputStream(64, true, false)) {
            __CLR4_4_1gwagwakylve2w7.R.inc(21922);assertTrue(is.markSupported());

            class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gwagwakylve2w7.R.inc(21923);try (__CLR4_4_1$AC5 __CLR$ACI7=new __CLR4_4_1$AC5(){{__CLR4_4_1gwagwakylve2w7.R.inc(21924);}};final MarkShieldInputStream msis = new MarkShieldInputStream(is)) {
                __CLR4_4_1gwagwakylve2w7.R.inc(21925);assertFalse(msis.markSupported());
            }
        }
    }finally{__CLR4_4_1gwagwakylve2w7.R.flushNeeded();}}

    @Test
    public void resetThrowsExceptionWhenUnderylingDoesNotSupport() throws IOException {__CLR4_4_1gwagwakylve2w7.R.globalSliceStart(getClass().getName(),21926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlwvz4gx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gwagwakylve2w7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gwagwakylve2w7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.MarkShieldInputStreamTest.resetThrowsExceptionWhenUnderylingDoesNotSupport",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlwvz4gx2() throws IOException{try{__CLR4_4_1gwagwakylve2w7.R.inc(21926);
        // test wrapping an underlying stream which does NOT support marking
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gwagwakylve2w7.R.inc(21927);try (__CLR4_4_1$AC6 __CLR$ACI8=new __CLR4_4_1$AC6(){{__CLR4_4_1gwagwakylve2w7.R.inc(21928);}};final MarkShieldInputStream msis = new MarkShieldInputStream(
                new NullInputStream(64, false, false))) {
            __CLR4_4_1gwagwakylve2w7.R.inc(21929);assertThrows(UnsupportedOperationException.class, () -> msis.reset());
        }
    }finally{__CLR4_4_1gwagwakylve2w7.R.flushNeeded();}}

    @Test
    public void resetThrowsExceptionWhenUnderylingSupports() throws IOException {__CLR4_4_1gwagwakylve2w7.R.globalSliceStart(getClass().getName(),21930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ep2j5gx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gwagwakylve2w7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gwagwakylve2w7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.MarkShieldInputStreamTest.resetThrowsExceptionWhenUnderylingSupports",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ep2j5gx6() throws IOException{try{__CLR4_4_1gwagwakylve2w7.R.inc(21930);
        // test wrapping an underlying stream which supports marking
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gwagwakylve2w7.R.inc(21931);try (__CLR4_4_1$AC7 __CLR$ACI9=new __CLR4_4_1$AC7(){{__CLR4_4_1gwagwakylve2w7.R.inc(21932);}};final MarkShieldInputStream msis = new MarkShieldInputStream(
                new NullInputStream(64, true, false))) {
            __CLR4_4_1gwagwakylve2w7.R.inc(21933);assertThrows(UnsupportedOperationException.class, () -> msis.reset());
        }
    }finally{__CLR4_4_1gwagwakylve2w7.R.flushNeeded();}}

    private static class MarkTestableInputStream extends ProxyInputStream {
        int markcount;
        int readlimit;

        public MarkTestableInputStream(final InputStream in) {
            super(in);__CLR4_4_1gwagwakylve2w7.R.inc(21935);try{__CLR4_4_1gwagwakylve2w7.R.inc(21934);
        }finally{__CLR4_4_1gwagwakylve2w7.R.flushNeeded();}}

        @SuppressWarnings("sync-override")
        @Override
        public void mark(final int readlimit) {try{__CLR4_4_1gwagwakylve2w7.R.inc(21936);
            // record that `mark` was called
            __CLR4_4_1gwagwakylve2w7.R.inc(21937);this.markcount++;
            __CLR4_4_1gwagwakylve2w7.R.inc(21938);this.readlimit = readlimit;

            // invoke on super
            __CLR4_4_1gwagwakylve2w7.R.inc(21939);super.mark(readlimit);
        }finally{__CLR4_4_1gwagwakylve2w7.R.flushNeeded();}}
    }
}
