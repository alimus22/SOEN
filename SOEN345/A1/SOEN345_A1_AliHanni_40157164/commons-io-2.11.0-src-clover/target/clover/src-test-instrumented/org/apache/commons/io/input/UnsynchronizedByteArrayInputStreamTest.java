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

import static org.apache.commons.io.input.UnsynchronizedByteArrayInputStream.END_OF_STREAM;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

/**
 * Basic unit tests for the alternative ByteArrayInputStream implementation.
 */
public class UnsynchronizedByteArrayInputStreamTest {static class __CLR4_4_1i5ii5ikylve37g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,23753,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructor1() throws IOException {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kibo7ki5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testConstructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kibo7ki5i() throws IOException{try{__CLR4_4_1i5ii5ikylve37g.R.inc(23526);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23527);final byte[] empty = IOUtils.EMPTY_BYTE_ARRAY;
        __CLR4_4_1i5ii5ikylve37g.R.inc(23528);final byte[] one = new byte[1];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23529);final byte[] some = new byte[25];

        __CLR4_4_1i5ii5ikylve37g.R.inc(23530);UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(empty);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23531);assertEquals(empty.length, is.available());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23532);is.close();
        __CLR4_4_1i5ii5ikylve37g.R.inc(23533);is = new UnsynchronizedByteArrayInputStream(one);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23534);assertEquals(one.length, is.available());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23535);is.close();
        __CLR4_4_1i5ii5ikylve37g.R.inc(23536);is = new UnsynchronizedByteArrayInputStream(some);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23537);assertEquals(some.length, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23538);is.close();
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    @SuppressWarnings("resource") // not necessary to close these resources
    public void testConstructor2() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrbn01i5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testConstructor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrbn01i5v(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23539);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23540);final byte[] empty = IOUtils.EMPTY_BYTE_ARRAY;
        __CLR4_4_1i5ii5ikylve37g.R.inc(23541);final byte[] one = new byte[1];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23542);final byte[] some = new byte[25];

        __CLR4_4_1i5ii5ikylve37g.R.inc(23543);UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(empty, 0);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23544);assertEquals(empty.length, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23545);is = new UnsynchronizedByteArrayInputStream(empty, 1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23546);assertEquals(0, is.available());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23547);is = new UnsynchronizedByteArrayInputStream(one, 0);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23548);assertEquals(one.length, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23549);is = new UnsynchronizedByteArrayInputStream(one, 1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23550);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23551);is = new UnsynchronizedByteArrayInputStream(one, 2);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23552);assertEquals(0, is.available());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23553);is = new UnsynchronizedByteArrayInputStream(some, 0);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23554);assertEquals(some.length, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23555);is = new UnsynchronizedByteArrayInputStream(some, 1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23556);assertEquals(some.length - 1, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23557);is = new UnsynchronizedByteArrayInputStream(some, 10);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23558);assertEquals(some.length - 10, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23559);is = new UnsynchronizedByteArrayInputStream(some, some.length);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23560);assertEquals(0, is.available());
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    @SuppressWarnings("resource") // not necessary to close these resources
    public void testConstructor3() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0blsii6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testConstructor3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0blsii6h(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23561);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23562);final byte[] empty = IOUtils.EMPTY_BYTE_ARRAY;
        __CLR4_4_1i5ii5ikylve37g.R.inc(23563);final byte[] one = new byte[1];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23564);final byte[] some = new byte[25];

        __CLR4_4_1i5ii5ikylve37g.R.inc(23565);UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(empty, 0);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23566);assertEquals(empty.length, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23567);is = new UnsynchronizedByteArrayInputStream(empty, 1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23568);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23569);is = new UnsynchronizedByteArrayInputStream(empty, 0,1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23570);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23571);is = new UnsynchronizedByteArrayInputStream(empty, 1,1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23572);assertEquals(0, is.available());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23573);is = new UnsynchronizedByteArrayInputStream(one, 0);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23574);assertEquals(one.length, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23575);is = new UnsynchronizedByteArrayInputStream(one, 1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23576);assertEquals(one.length - 1, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23577);is = new UnsynchronizedByteArrayInputStream(one, 2);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23578);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23579);is = new UnsynchronizedByteArrayInputStream(one, 0, 1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23580);assertEquals(1, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23581);is = new UnsynchronizedByteArrayInputStream(one, 1, 1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23582);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23583);is = new UnsynchronizedByteArrayInputStream(one, 0, 2);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23584);assertEquals(1, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23585);is = new UnsynchronizedByteArrayInputStream(one, 2, 1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23586);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23587);is = new UnsynchronizedByteArrayInputStream(one, 2, 2);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23588);assertEquals(0, is.available());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23589);is = new UnsynchronizedByteArrayInputStream(some, 0);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23590);assertEquals(some.length, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23591);is = new UnsynchronizedByteArrayInputStream(some, 1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23592);assertEquals(some.length - 1, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23593);is = new UnsynchronizedByteArrayInputStream(some, 10);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23594);assertEquals(some.length - 10, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23595);is = new UnsynchronizedByteArrayInputStream(some, some.length);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23596);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23597);is = new UnsynchronizedByteArrayInputStream(some, some.length, some.length);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23598);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23599);is = new UnsynchronizedByteArrayInputStream(some, some.length - 1, some.length);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23600);assertEquals(1, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23601);is = new UnsynchronizedByteArrayInputStream(some, 0, 7);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23602);assertEquals(7, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23603);is = new UnsynchronizedByteArrayInputStream(some, 7, 7);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23604);assertEquals(7, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23605);is = new UnsynchronizedByteArrayInputStream(some, 0, some.length * 2);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23606);assertEquals(some.length, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23607);is = new UnsynchronizedByteArrayInputStream(some, some.length - 1, 7);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23608);assertEquals(1, is.available());
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testInvalidConstructor2OffsetUnder() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kj3ab3i7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testInvalidConstructor2OffsetUnder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kj3ab3i7t(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23609);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23610);assertThrows(IllegalArgumentException.class, () -> {
            __CLR4_4_1i5ii5ikylve37g.R.inc(23611);new UnsynchronizedByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY, -1);
        });
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testInvalidConstructor3LengthUnder() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrv0iji7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testInvalidConstructor3LengthUnder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrv0iji7w(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23612);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23613);assertThrows(IllegalArgumentException.class, () -> {
            __CLR4_4_1i5ii5ikylve37g.R.inc(23614);new UnsynchronizedByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY, 0, -1);
        });
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testInvalidConstructor3OffsetUnder() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h19awei7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testInvalidConstructor3OffsetUnder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h19awei7z(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23615);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23616);assertThrows(IllegalArgumentException.class, () -> {
            __CLR4_4_1i5ii5ikylve37g.R.inc(23617);new UnsynchronizedByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY, -1, 1);
        });
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    @SuppressWarnings("resource") // not necessary to close these resources
    public void testInvalidReadArrayExplicitLenUnder() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tvko5gi82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testInvalidReadArrayExplicitLenUnder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tvko5gi82(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23618);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23619);final byte[] buf = IOUtils.EMPTY_BYTE_ARRAY;
        __CLR4_4_1i5ii5ikylve37g.R.inc(23620);final UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23621);assertThrows(IndexOutOfBoundsException.class, () -> {
            __CLR4_4_1i5ii5ikylve37g.R.inc(23622);is.read(buf, 0, -1);
        });
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testInvalidReadArrayExplicitOffsetUnder() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1td4g4mi87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testInvalidReadArrayExplicitOffsetUnder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1td4g4mi87(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23623);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23624);final byte[] buf = IOUtils.EMPTY_BYTE_ARRAY;
        __CLR4_4_1i5ii5ikylve37g.R.inc(23625);@SuppressWarnings("resource") // not necessary to close these resources
        final UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23626);assertThrows(IndexOutOfBoundsException.class, () -> {
            __CLR4_4_1i5ii5ikylve37g.R.inc(23627);is.read(buf, -1, 1);
        });
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testInvalidReadArrayExplicitRangeOver() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6q70mi8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testInvalidReadArrayExplicitRangeOver",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6q70mi8c(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23628);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23629);final byte[] buf = IOUtils.EMPTY_BYTE_ARRAY;
        __CLR4_4_1i5ii5ikylve37g.R.inc(23630);@SuppressWarnings("resource") // not necessary to close these resources
        final UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23631);assertThrows(IndexOutOfBoundsException.class, () -> {
            __CLR4_4_1i5ii5ikylve37g.R.inc(23632);is.read(buf, 0, 1);
        });
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testInvalidReadArrayNull() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1465iaci8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testInvalidReadArrayNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1465iaci8h(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23633);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23634);final byte[] buf = null;
        __CLR4_4_1i5ii5ikylve37g.R.inc(23635);@SuppressWarnings("resource") // not necessary to close these resources
        final UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23636);assertThrows(NullPointerException.class, () -> {
            __CLR4_4_1i5ii5ikylve37g.R.inc(23637);is.read(buf);
        });
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testInvalidSkipNUnder() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1upmok5i8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testInvalidSkipNUnder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1upmok5i8m(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23638);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23639);@SuppressWarnings("resource") // not necessary to close these resources
        final UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23640);assertThrows(IllegalArgumentException.class, () -> {
            __CLR4_4_1i5ii5ikylve37g.R.inc(23641);is.skip(-1);
        });
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testMarkReset() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116spexi8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testMarkReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116spexi8q(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23642);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23643);@SuppressWarnings("resource") // not necessary to close these resources
        final UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23644);assertTrue(is.markSupported());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23645);assertEquals(0xa, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23646);assertTrue(is.markSupported());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23647);is.mark(10);

        __CLR4_4_1i5ii5ikylve37g.R.inc(23648);assertEquals(0xb, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23649);assertEquals(0xc, is.read());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23650);is.reset();

        __CLR4_4_1i5ii5ikylve37g.R.inc(23651);assertEquals(0xb, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23652);assertEquals(0xc, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23653);assertEquals(END_OF_STREAM, is.read());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23654);is.reset();

        __CLR4_4_1i5ii5ikylve37g.R.inc(23655);assertEquals(0xb, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23656);assertEquals(0xc, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23657);assertEquals(END_OF_STREAM, is.read());
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testReadArray() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ercfzci96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testReadArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ercfzci96(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23658);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23659);byte[] buf = new byte[10];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23660);@SuppressWarnings("resource") // not necessary to close these resources
        UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23661);int read = is.read(buf);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23662);assertEquals(END_OF_STREAM, read);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23663);assertArrayEquals(new byte[10], buf);

        __CLR4_4_1i5ii5ikylve37g.R.inc(23664);buf = IOUtils.EMPTY_BYTE_ARRAY;
        __CLR4_4_1i5ii5ikylve37g.R.inc(23665);is = new UnsynchronizedByteArrayInputStream(new byte[]{(byte) 0xa, (byte) 0xb, (byte) 0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23666);read = is.read(buf);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23667);assertEquals(0, read);

        __CLR4_4_1i5ii5ikylve37g.R.inc(23668);buf = new byte[10];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23669);is = new UnsynchronizedByteArrayInputStream(new byte[]{(byte) 0xa, (byte) 0xb, (byte) 0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23670);read = is.read(buf);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23671);assertEquals(3, read);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23672);assertEquals(0xa, buf[0]);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23673);assertEquals(0xb, buf[1]);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23674);assertEquals(0xc, buf[2]);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23675);assertEquals(0, buf[3]);

        __CLR4_4_1i5ii5ikylve37g.R.inc(23676);buf = new byte[2];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23677);is = new UnsynchronizedByteArrayInputStream(new byte[]{(byte) 0xa, (byte) 0xb, (byte) 0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23678);read = is.read(buf);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23679);assertEquals(2, read);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23680);assertEquals(0xa, buf[0]);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23681);assertEquals(0xb, buf[1]);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23682);read = is.read(buf);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23683);assertEquals(1, read);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23684);assertEquals(0xc, buf[0]);
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testReadArrayExplicit() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cbihhwi9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testReadArrayExplicit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cbihhwi9x(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23685);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23686);byte[] buf = new byte[10];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23687);@SuppressWarnings("resource") // not necessary to close these resources
        UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23688);int read = is.read(buf, 0, 10);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23689);assertEquals(END_OF_STREAM, read);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23690);assertArrayEquals(new byte[10], buf);

        __CLR4_4_1i5ii5ikylve37g.R.inc(23691);buf = new byte[10];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23692);is = new UnsynchronizedByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23693);read = is.read(buf, 4, 2);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23694);assertEquals(END_OF_STREAM, read);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23695);assertArrayEquals(new byte[10], buf);

        __CLR4_4_1i5ii5ikylve37g.R.inc(23696);buf = new byte[10];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23697);is = new UnsynchronizedByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23698);read = is.read(buf, 4, 6);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23699);assertEquals(END_OF_STREAM, read);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23700);assertArrayEquals(new byte[10], buf);

        __CLR4_4_1i5ii5ikylve37g.R.inc(23701);buf = IOUtils.EMPTY_BYTE_ARRAY;
        __CLR4_4_1i5ii5ikylve37g.R.inc(23702);is = new UnsynchronizedByteArrayInputStream(new byte[]{(byte) 0xa, (byte) 0xb, (byte) 0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23703);read = is.read(buf, 0,0);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23704);assertEquals(0, read);

        __CLR4_4_1i5ii5ikylve37g.R.inc(23705);buf = new byte[10];
        __CLR4_4_1i5ii5ikylve37g.R.inc(23706);is = new UnsynchronizedByteArrayInputStream(new byte[]{(byte) 0xa, (byte) 0xb, (byte) 0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23707);read = is.read(buf, 0, 2);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23708);assertEquals(2, read);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23709);assertEquals(0xa, buf[0]);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23710);assertEquals(0xb, buf[1]);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23711);assertEquals(0, buf[2]);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23712);read = is.read(buf, 0, 10);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23713);assertEquals(1, read);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23714);assertEquals(0xc, buf[0]);
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testReadSingle() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fxl4oniar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testReadSingle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fxl4oniar(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23715);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23716);@SuppressWarnings("resource") // not necessary to close these resources
        UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23717);assertEquals(END_OF_STREAM, is.read());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23718);is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23719);assertEquals(0xa, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23720);assertEquals(0xb, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23721);assertEquals(0xc, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23722);assertEquals(END_OF_STREAM, is.read());
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}

    @Test
    public void testSkip() {__CLR4_4_1i5ii5ikylve37g.R.globalSliceStart(getClass().getName(),23723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamwiaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i5ii5ikylve37g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i5ii5ikylve37g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.UnsynchronizedByteArrayInputStreamTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamwiaz(){try{__CLR4_4_1i5ii5ikylve37g.R.inc(23723);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23724);@SuppressWarnings("resource") // not necessary to close these resources
        UnsynchronizedByteArrayInputStream is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23725);assertEquals(3, is.available());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23726);is.skip(1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23727);assertEquals(2, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23728);assertEquals(0xb, is.read());

        __CLR4_4_1i5ii5ikylve37g.R.inc(23729);is.skip(1);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23730);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23731);assertEquals(END_OF_STREAM, is.read());


        __CLR4_4_1i5ii5ikylve37g.R.inc(23732);is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23733);assertEquals(3, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23734);is.skip(0);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23735);assertEquals(3, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23736);assertEquals(0xa, is.read());


        __CLR4_4_1i5ii5ikylve37g.R.inc(23737);is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23738);assertEquals(3, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23739);is.skip(2);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23740);assertEquals(1, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23741);assertEquals(0xc, is.read());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23742);assertEquals(END_OF_STREAM, is.read());


        __CLR4_4_1i5ii5ikylve37g.R.inc(23743);is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23744);assertEquals(3, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23745);is.skip(3);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23746);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23747);assertEquals(END_OF_STREAM, is.read());


        __CLR4_4_1i5ii5ikylve37g.R.inc(23748);is = new UnsynchronizedByteArrayInputStream(new byte[] {(byte)0xa, (byte)0xb, (byte)0xc});
        __CLR4_4_1i5ii5ikylve37g.R.inc(23749);assertEquals(3, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23750);is.skip(999);
        __CLR4_4_1i5ii5ikylve37g.R.inc(23751);assertEquals(0, is.available());
        __CLR4_4_1i5ii5ikylve37g.R.inc(23752);assertEquals(END_OF_STREAM, is.read());
    }finally{__CLR4_4_1i5ii5ikylve37g.R.flushNeeded();}}
}
