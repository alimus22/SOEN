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
import java.io.ByteArrayOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Tests the CountingInputStream.
 *
 */
public class ClassLoaderObjectInputStreamTest {static class __CLR4_4_1gokgokkylve2td{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21715,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /* Note: This test case tests the simplest functionality of
     * ObjectInputStream.  IF we really wanted to test ClassLoaderObjectInputStream
     * we would probably need to create a transient Class Loader. -TO
     */


    @org.junit.jupiter.api.Test
    public void testExpected() throws Exception {__CLR4_4_1gokgokkylve2td.R.globalSliceStart(getClass().getName(),21620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3svwvgok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gokgokkylve2td.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gokgokkylve2td.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ClassLoaderObjectInputStreamTest.testExpected",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3svwvgok() throws Exception{try{__CLR4_4_1gokgokkylve2td.R.inc(21620);

        __CLR4_4_1gokgokkylve2td.R.inc(21621);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1gokgokkylve2td.R.inc(21622);final ObjectOutputStream oos = new ObjectOutputStream(baos);

        __CLR4_4_1gokgokkylve2td.R.inc(21623);final Object input = Boolean.FALSE;
        __CLR4_4_1gokgokkylve2td.R.inc(21624);oos.writeObject(input);

        __CLR4_4_1gokgokkylve2td.R.inc(21625);final InputStream bais = new ByteArrayInputStream(baos.toByteArray());
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gokgokkylve2td.R.inc(21626);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1gokgokkylve2td.R.inc(21627);}};final ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader(),
                bais)) {
            __CLR4_4_1gokgokkylve2td.R.inc(21628);final Object result = clois.readObject();

            __CLR4_4_1gokgokkylve2td.R.inc(21629);assertEquals(input, result);
        }
    }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}

    @org.junit.jupiter.api.Test
    public void testLong() throws Exception {__CLR4_4_1gokgokkylve2td.R.globalSliceStart(getClass().getName(),21630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xsq9mzgou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gokgokkylve2td.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gokgokkylve2td.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ClassLoaderObjectInputStreamTest.testLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xsq9mzgou() throws Exception{try{__CLR4_4_1gokgokkylve2td.R.inc(21630);

        __CLR4_4_1gokgokkylve2td.R.inc(21631);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1gokgokkylve2td.R.inc(21632);final ObjectOutputStream oos = new ObjectOutputStream(baos);

        __CLR4_4_1gokgokkylve2td.R.inc(21633);final Object input = (long) 123;
        __CLR4_4_1gokgokkylve2td.R.inc(21634);oos.writeObject(input);

        __CLR4_4_1gokgokkylve2td.R.inc(21635);final InputStream bais = new ByteArrayInputStream(baos.toByteArray());
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gokgokkylve2td.R.inc(21636);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1gokgokkylve2td.R.inc(21637);}};final ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader(),
                bais)) {
            __CLR4_4_1gokgokkylve2td.R.inc(21638);final Object result = clois.readObject();

            __CLR4_4_1gokgokkylve2td.R.inc(21639);assertEquals(input, result);
        }
    }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}

    @org.junit.jupiter.api.Test
    public void testPrimitiveLong() throws Exception {__CLR4_4_1gokgokkylve2td.R.globalSliceStart(getClass().getName(),21640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4ymvcgp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gokgokkylve2td.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gokgokkylve2td.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ClassLoaderObjectInputStreamTest.testPrimitiveLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4ymvcgp4() throws Exception{try{__CLR4_4_1gokgokkylve2td.R.inc(21640);

        __CLR4_4_1gokgokkylve2td.R.inc(21641);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1gokgokkylve2td.R.inc(21642);final ObjectOutputStream oos = new ObjectOutputStream(baos);

        __CLR4_4_1gokgokkylve2td.R.inc(21643);final long input = 12345L;
        __CLR4_4_1gokgokkylve2td.R.inc(21644);oos.writeLong(input);
        __CLR4_4_1gokgokkylve2td.R.inc(21645);oos.close();

        __CLR4_4_1gokgokkylve2td.R.inc(21646);final InputStream bais = new ByteArrayInputStream(baos.toByteArray());
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gokgokkylve2td.R.inc(21647);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1gokgokkylve2td.R.inc(21648);}};final ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader(),
                bais)) {
            __CLR4_4_1gokgokkylve2td.R.inc(21649);final long result = clois.readLong();

            __CLR4_4_1gokgokkylve2td.R.inc(21650);assertEquals(input, result);
        }
    }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}

    private enum E {A, B, C}

    private static class Test implements Serializable {
        private static final long serialVersionUID = 1L;
        private final int i;

        private final Object o;

        private final E e;

        Test(final int i, final Object o) {try{__CLR4_4_1gokgokkylve2td.R.inc(21651);
            __CLR4_4_1gokgokkylve2td.R.inc(21652);this.i = i;
            __CLR4_4_1gokgokkylve2td.R.inc(21653);this.e = E.A;
            __CLR4_4_1gokgokkylve2td.R.inc(21654);this.o = o;
        }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}

        @Override
        public boolean equals(final Object other) {try{__CLR4_4_1gokgokkylve2td.R.inc(21655);
            __CLR4_4_1gokgokkylve2td.R.inc(21656);if ((((other instanceof Test)&&(__CLR4_4_1gokgokkylve2td.R.iget(21657)!=0|true))||(__CLR4_4_1gokgokkylve2td.R.iget(21658)==0&false))) {{
                __CLR4_4_1gokgokkylve2td.R.inc(21659);final Test tother = (Test) other;
                __CLR4_4_1gokgokkylve2td.R.inc(21660);return (this.i == tother.i)
                        & (this.e == tother.e)
                        & equalObject(tother.o);
            }
            }__CLR4_4_1gokgokkylve2td.R.inc(21661);return false;
        }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}

        private boolean equalObject(final Object other) {try{__CLR4_4_1gokgokkylve2td.R.inc(21662);
            __CLR4_4_1gokgokkylve2td.R.inc(21663);if ((((this.o == null)&&(__CLR4_4_1gokgokkylve2td.R.iget(21664)!=0|true))||(__CLR4_4_1gokgokkylve2td.R.iget(21665)==0&false))) {{
                __CLR4_4_1gokgokkylve2td.R.inc(21666);return other == null;
            }
            }__CLR4_4_1gokgokkylve2td.R.inc(21667);return o.equals(other);
        }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1gokgokkylve2td.R.inc(21668);
            __CLR4_4_1gokgokkylve2td.R.inc(21669);return super.hashCode();
        }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}
    }

    @org.junit.jupiter.api.Test
    public void testObject1() throws Exception {__CLR4_4_1gokgokkylve2td.R.globalSliceStart(getClass().getName(),21670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sq6p0ngpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gokgokkylve2td.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gokgokkylve2td.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ClassLoaderObjectInputStreamTest.testObject1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sq6p0ngpy() throws Exception{try{__CLR4_4_1gokgokkylve2td.R.inc(21670);

        __CLR4_4_1gokgokkylve2td.R.inc(21671);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1gokgokkylve2td.R.inc(21672);final ObjectOutputStream oos = new ObjectOutputStream(baos);

        __CLR4_4_1gokgokkylve2td.R.inc(21673);final Object input = new Test(123, null);
        __CLR4_4_1gokgokkylve2td.R.inc(21674);oos.writeObject(input);
        __CLR4_4_1gokgokkylve2td.R.inc(21675);oos.close();

        __CLR4_4_1gokgokkylve2td.R.inc(21676);final InputStream bais = new ByteArrayInputStream(baos.toByteArray());
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gokgokkylve2td.R.inc(21677);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1gokgokkylve2td.R.inc(21678);}};final ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader(),
                bais)) {
            __CLR4_4_1gokgokkylve2td.R.inc(21679);final Object result = clois.readObject();

            __CLR4_4_1gokgokkylve2td.R.inc(21680);assertEquals(input, result);
        }
    }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}

    @org.junit.jupiter.api.Test
    public void testObject2() throws Exception {__CLR4_4_1gokgokkylve2td.R.globalSliceStart(getClass().getName(),21681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vz6nt4gq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gokgokkylve2td.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gokgokkylve2td.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ClassLoaderObjectInputStreamTest.testObject2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vz6nt4gq9() throws Exception{try{__CLR4_4_1gokgokkylve2td.R.inc(21681);

        __CLR4_4_1gokgokkylve2td.R.inc(21682);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1gokgokkylve2td.R.inc(21683);final ObjectOutputStream oos = new ObjectOutputStream(baos);

        __CLR4_4_1gokgokkylve2td.R.inc(21684);final Object input = new Test(123, 0);
        __CLR4_4_1gokgokkylve2td.R.inc(21685);oos.writeObject(input);
        __CLR4_4_1gokgokkylve2td.R.inc(21686);oos.close();

        __CLR4_4_1gokgokkylve2td.R.inc(21687);final InputStream bais = new ByteArrayInputStream(baos.toByteArray());
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gokgokkylve2td.R.inc(21688);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1gokgokkylve2td.R.inc(21689);}};final ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader(),
                bais)) {
            __CLR4_4_1gokgokkylve2td.R.inc(21690);final Object result = clois.readObject();

            __CLR4_4_1gokgokkylve2td.R.inc(21691);assertEquals(input, result);
        }
    }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}

    @org.junit.jupiter.api.Test
    public void testResolveProxyClass() throws Exception {__CLR4_4_1gokgokkylve2td.R.globalSliceStart(getClass().getName(),21692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17jejnvgqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gokgokkylve2td.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gokgokkylve2td.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ClassLoaderObjectInputStreamTest.testResolveProxyClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17jejnvgqk() throws Exception{try{__CLR4_4_1gokgokkylve2td.R.inc(21692);

        __CLR4_4_1gokgokkylve2td.R.inc(21693);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1gokgokkylve2td.R.inc(21694);final ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1gokgokkylve2td.R.inc(21695);oos.writeObject(Boolean.FALSE);
        __CLR4_4_1gokgokkylve2td.R.inc(21696);final InputStream bais = new ByteArrayInputStream(baos.toByteArray());

        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gokgokkylve2td.R.inc(21697);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1gokgokkylve2td.R.inc(21698);}};final ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader(),
                bais)) {
            __CLR4_4_1gokgokkylve2td.R.inc(21699);final String[] interfaces = { Comparable.class.getName() };
            __CLR4_4_1gokgokkylve2td.R.inc(21700);final Class<?> result = clois.resolveProxyClass(interfaces);
            __CLR4_4_1gokgokkylve2td.R.inc(21701);assertTrue(Comparable.class.isAssignableFrom(result), "Assignable");
        }
    }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}

    @org.junit.jupiter.api.Test
    public void testResolveProxyClassWithMultipleInterfaces() throws Exception {__CLR4_4_1gokgokkylve2td.R.globalSliceStart(getClass().getName(),21702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uoz95ngqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gokgokkylve2td.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gokgokkylve2td.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ClassLoaderObjectInputStreamTest.testResolveProxyClassWithMultipleInterfaces",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uoz95ngqu() throws Exception{try{__CLR4_4_1gokgokkylve2td.R.inc(21702);

        __CLR4_4_1gokgokkylve2td.R.inc(21703);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1gokgokkylve2td.R.inc(21704);final ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1gokgokkylve2td.R.inc(21705);oos.writeObject(Boolean.FALSE);
        __CLR4_4_1gokgokkylve2td.R.inc(21706);final InputStream bais = new ByteArrayInputStream(baos.toByteArray());

        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gokgokkylve2td.R.inc(21707);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1gokgokkylve2td.R.inc(21708);}};final ClassLoaderObjectInputStream clois = new ClassLoaderObjectInputStream(getClass().getClassLoader(),
                bais)) {
            __CLR4_4_1gokgokkylve2td.R.inc(21709);final String[] interfaces = { Comparable.class.getName(), Serializable.class.getName(),
                    Runnable.class.getName() };
            __CLR4_4_1gokgokkylve2td.R.inc(21710);final Class<?> result = clois.resolveProxyClass(interfaces);
            __CLR4_4_1gokgokkylve2td.R.inc(21711);assertTrue(Comparable.class.isAssignableFrom(result), "Assignable");
            __CLR4_4_1gokgokkylve2td.R.inc(21712);assertTrue(Runnable.class.isAssignableFrom(result), "Assignable");
            __CLR4_4_1gokgokkylve2td.R.inc(21713);assertTrue(Serializable.class.isAssignableFrom(result), "Assignable");
            __CLR4_4_1gokgokkylve2td.R.inc(21714);assertFalse(Flushable.class.isAssignableFrom(result), "Not Assignable");
        }
    }finally{__CLR4_4_1gokgokkylve2td.R.flushNeeded();}}
}
