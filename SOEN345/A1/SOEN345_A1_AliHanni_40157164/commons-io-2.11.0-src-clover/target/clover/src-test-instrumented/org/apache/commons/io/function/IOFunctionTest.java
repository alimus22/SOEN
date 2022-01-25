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

package org.apache.commons.io.function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

public class IOFunctionTest {static class __CLR4_4_1fe1fe1kylve2kh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,20026,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class Holder<T> {
        T value;
    }

    @Test
    public void testAndThenConsumer() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),19945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6lam9fe1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testAndThenConsumer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6lam9fe1() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(19945);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19946);final Holder<Integer> holder = new Holder<>();
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19947);final IOFunction<InputStream, Integer> readByte = InputStream::read;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19948);final Consumer<Integer> sinkInteger = i -> {
            __CLR4_4_1fe1fe1kylve2kh.R.inc(19949);holder.value = i * i;
        };
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19950);final IOConsumer<InputStream> productFunction = readByte.andThen(sinkInteger);

        __CLR4_4_1fe1fe1kylve2kh.R.inc(19951);final InputStream is = new ByteArrayInputStream(new byte[] {2, 3});
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19952);productFunction.accept(is);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19953);assertEquals(4, holder.value);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19954);productFunction.accept(is);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19955);assertEquals(9, holder.value);
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testAndThenFunction() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),19956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmvdr3fec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testAndThenFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmvdr3fec() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(19956);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19957);final IOFunction<InputStream, Integer> readByte = InputStream::read;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19958);final Function<Integer, Integer> squareInteger = i -> i * i;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19959);final IOFunction<InputStream, Integer> productFunction = readByte.andThen(squareInteger);

        __CLR4_4_1fe1fe1kylve2kh.R.inc(19960);final InputStream is = new ByteArrayInputStream(new byte[] {2, 3});
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19961);assertEquals(4, productFunction.apply(is));
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19962);assertEquals(9, productFunction.apply(is));
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testAndThenIOConsumer() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),19963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pstetfej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testAndThenIOConsumer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pstetfej() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(19963);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19964);final Holder<Integer> holder = new Holder<>();
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19965);final IOFunction<InputStream, Integer> readByte = InputStream::read;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19966);final IOConsumer<Integer> sinkInteger = i -> {
            __CLR4_4_1fe1fe1kylve2kh.R.inc(19967);holder.value = i * i;
        };
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19968);final IOConsumer<InputStream> productFunction = readByte.andThen(sinkInteger);

        __CLR4_4_1fe1fe1kylve2kh.R.inc(19969);final InputStream is = new ByteArrayInputStream(new byte[] {2, 3});
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19970);productFunction.accept(is);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19971);assertEquals(4, holder.value);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19972);productFunction.accept(is);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19973);assertEquals(9, holder.value);
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testAndThenIOFunction() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),19974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149iq9zfeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testAndThenIOFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149iq9zfeu() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(19974);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19975);final IOFunction<InputStream, Integer> readByte = InputStream::read;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19976);final IOFunction<Integer, Integer> squareInteger = i -> i * i;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19977);final IOFunction<InputStream, Integer> productFunction = readByte.andThen(squareInteger);

        __CLR4_4_1fe1fe1kylve2kh.R.inc(19978);final InputStream is = new ByteArrayInputStream(new byte[] {2, 3});
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19979);assertEquals(4, productFunction.apply(is));
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19980);assertEquals(9, productFunction.apply(is));
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testApply() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),19981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16osqwtff1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testApply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16osqwtff1() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(19981);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19982);final IOFunction<InputStream, Integer> readByte = InputStream::read;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19983);final InputStream is = new ByteArrayInputStream(new byte[] { (byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19984);assertEquals(0xa, readByte.apply(is));
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19985);assertEquals(0xb, readByte.apply(is));
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19986);assertEquals(0xc, readByte.apply(is));
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19987);assertEquals(-1, readByte.apply(is));
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testApplyRaisesException() {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),19988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gb777ff8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testApplyRaisesException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gb777ff8(){try{__CLR4_4_1fe1fe1kylve2kh.R.inc(19988);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19989);final IOFunction<InputStream, Integer> raiseException = is -> {
            __CLR4_4_1fe1fe1kylve2kh.R.inc(19990);throw new IOException("Boom!");
        };
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19991);final InputStream is = new ByteArrayInputStream(new byte[] { (byte)0xa, (byte)0xb, (byte)0xc});

        __CLR4_4_1fe1fe1kylve2kh.R.inc(19992);assertThrows(IOException.class, () -> {
            __CLR4_4_1fe1fe1kylve2kh.R.inc(19993);raiseException.apply(is);
        });
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testComposeFunction() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),19994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7a61tffe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testComposeFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7a61tffe() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(19994);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19995);final Function<InputStream, Integer> alwaysSeven = is -> 7;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19996);final IOFunction<Integer, Integer> squareInteger = i -> i * i;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19997);final IOFunction<InputStream, Integer> productFunction = squareInteger.compose(alwaysSeven);

        __CLR4_4_1fe1fe1kylve2kh.R.inc(19998);final InputStream is = new ByteArrayInputStream(new byte[] {2, 3});
        __CLR4_4_1fe1fe1kylve2kh.R.inc(19999);assertEquals(49, productFunction.apply(is));
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20000);assertEquals(49, productFunction.apply(is));
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testComposeIOFunction() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),20001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhr96tffl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testComposeIOFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhr96tffl() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(20001);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20002);final IOFunction<InputStream, Integer> readByte = InputStream::read;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20003);final IOFunction<Integer, Integer> squareInteger = i -> i * i;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20004);final IOFunction<InputStream, Integer> productFunction = squareInteger.compose(readByte);

        __CLR4_4_1fe1fe1kylve2kh.R.inc(20005);final InputStream is = new ByteArrayInputStream(new byte[] {2, 3});
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20006);assertEquals(4, productFunction.apply(is));
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20007);assertEquals(9, productFunction.apply(is));
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testComposeIOSupplier() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),20008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yf41mvffs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testComposeIOSupplier",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yf41mvffs() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(20008);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20009);final InputStream is = new ByteArrayInputStream(new byte[] {2, 3});

        __CLR4_4_1fe1fe1kylve2kh.R.inc(20010);final IOSupplier<Integer> readByte = () -> is.read();
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20011);final IOFunction<Integer, Integer> squareInteger = i -> i * i;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20012);final IOSupplier<Integer> productFunction = squareInteger.compose(readByte);

        __CLR4_4_1fe1fe1kylve2kh.R.inc(20013);assertEquals(4, productFunction.get());
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20014);assertEquals(9, productFunction.get());
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testComposeSupplier() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),20015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h31ewdffz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testComposeSupplier",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h31ewdffz() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(20015);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20016);final Supplier<Integer> alwaysNine = () -> 9;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20017);final IOFunction<Integer, Integer> squareInteger = i -> i * i;
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20018);final IOSupplier<Integer> productFunction = squareInteger.compose(alwaysNine);

        __CLR4_4_1fe1fe1kylve2kh.R.inc(20019);assertEquals(81, productFunction.get());
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20020);assertEquals(81, productFunction.get());
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}

    @Test
    public void testIdentity() throws IOException {__CLR4_4_1fe1fe1kylve2kh.R.globalSliceStart(getClass().getName(),20021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ab1a2xfg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fe1fe1kylve2kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fe1fe1kylve2kh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.function.IOFunctionTest.testIdentity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ab1a2xfg5() throws IOException{try{__CLR4_4_1fe1fe1kylve2kh.R.inc(20021);
        __CLR4_4_1fe1fe1kylve2kh.R.inc(20022);final IOFunction<InputStream, InputStream> identityFunction = IOFunction.identity();
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fe1fe1kylve2kh.R.inc(20023);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1fe1fe1kylve2kh.R.inc(20024);}};final InputStream is = new ByteArrayInputStream(new byte[] { (byte) 0xa, (byte) 0xb, (byte) 0xc })) {
            __CLR4_4_1fe1fe1kylve2kh.R.inc(20025);assertEquals(is, identityFunction.apply(is));
        }
    }finally{__CLR4_4_1fe1fe1kylve2kh.R.flushNeeded();}}
}
