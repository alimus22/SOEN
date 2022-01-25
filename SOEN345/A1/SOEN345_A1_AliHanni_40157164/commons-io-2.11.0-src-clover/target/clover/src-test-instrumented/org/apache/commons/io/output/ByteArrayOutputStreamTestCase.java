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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.input.ClosedInputStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Basic unit tests for the alternative ByteArrayOutputStream implementations.
 */
public class ByteArrayOutputStreamTestCase {static class __CLR4_4_1jo6jo6kylve3hs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,25686,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    private static final byte[] DATA;

    static {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25494);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25495);DATA = new byte[64];
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25496);for (byte i = 0; (((i < 64)&&(__CLR4_4_1jo6jo6kylve3hs.R.iget(25497)!=0|true))||(__CLR4_4_1jo6jo6kylve3hs.R.iget(25498)==0&false)); i++) {{
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25499);DATA[i] = i;
        }
    }}finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    private int writeData(final AbstractByteArrayOutputStream baout,
                final java.io.ByteArrayOutputStream ref,
                final int count) {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25500);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25501);if ((((count > DATA.length)&&(__CLR4_4_1jo6jo6kylve3hs.R.iget(25502)!=0|true))||(__CLR4_4_1jo6jo6kylve3hs.R.iget(25503)==0&false))) {{
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25504);throw new IllegalArgumentException("Requesting too many bytes");
        }
        }__CLR4_4_1jo6jo6kylve3hs.R.inc(25505);if ((((count == 0)&&(__CLR4_4_1jo6jo6kylve3hs.R.iget(25506)!=0|true))||(__CLR4_4_1jo6jo6kylve3hs.R.iget(25507)==0&false))) {{
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25508);baout.write(100);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25509);ref.write(100);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25510);return 1;
        }
        }__CLR4_4_1jo6jo6kylve3hs.R.inc(25511);baout.write(DATA, 0, count);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25512);ref.write(DATA, 0, count);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25513);return count;
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    private int writeData(final AbstractByteArrayOutputStream baout,
                final java.io.ByteArrayOutputStream ref,
                final int[] instructions) {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25514);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25515);int written = 0;
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25516);for (final int instruction : instructions) {{
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25517);written += writeData(baout, ref, instruction);
        }
        }__CLR4_4_1jo6jo6kylve3hs.R.inc(25518);return written;
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    private static boolean byteCmp(final byte[] src, final byte[] cmp) {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25519);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25520);for (int i = 0; (((i < cmp.length)&&(__CLR4_4_1jo6jo6kylve3hs.R.iget(25521)!=0|true))||(__CLR4_4_1jo6jo6kylve3hs.R.iget(25522)==0&false)); i++) {{
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25523);if ((((src[i] != cmp[i])&&(__CLR4_4_1jo6jo6kylve3hs.R.iget(25524)!=0|true))||(__CLR4_4_1jo6jo6kylve3hs.R.iget(25525)==0&false))) {{
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25526);return false;
            }
        }}
        }__CLR4_4_1jo6jo6kylve3hs.R.inc(25527);return true;
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    private void checkByteArrays(final byte[] expected, final byte[] actual) {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25528);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25529);if ((((expected.length != actual.length)&&(__CLR4_4_1jo6jo6kylve3hs.R.iget(25530)!=0|true))||(__CLR4_4_1jo6jo6kylve3hs.R.iget(25531)==0&false))) {{
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25532);fail("Resulting byte arrays are not equally long");
        }
        }__CLR4_4_1jo6jo6kylve3hs.R.inc(25533);if ((((!byteCmp(expected, actual))&&(__CLR4_4_1jo6jo6kylve3hs.R.iget(25534)!=0|true))||(__CLR4_4_1jo6jo6kylve3hs.R.iget(25535)==0&false))) {{
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25536);fail("Resulting byte arrays are not equal");
        }
    }}finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    private void checkStreams(
            final AbstractByteArrayOutputStream actual,
            final java.io.ByteArrayOutputStream expected) {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25537);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25538);assertEquals(expected.size(), actual.size(), "Sizes are not equal");
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25539);final byte[] buf = actual.toByteArray();
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25540);final byte[] refbuf = expected.toByteArray();
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25541);checkByteArrays(buf, refbuf);
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testWriteZero(final String baosName, final BAOSFactory<?> baosFactory) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9rtirjpi(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testWriteZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9rtirjpi(final String baosName, final BAOSFactory<?> baosFactory) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25542);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25543);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25544);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance()) {
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25545);baout.write(IOUtils.EMPTY_BYTE_ARRAY, 0, 0);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25546);assertTrue(true, "Dummy");
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testInvalidWriteOffsetUnder(final String baosName, final BAOSFactory<?> baosFactory) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e9nxfjpn(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testInvalidWriteOffsetUnder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e9nxfjpn(final String baosName, final BAOSFactory<?> baosFactory) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25547);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25548);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25549);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance()) {
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25550);assertThrows(IndexOutOfBoundsException.class, () -> baout.write(null, -1, 0));
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testInvalidWriteOffsetOver(final String baosName, final BAOSFactory<?> baosFactory) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1um2w6fjpr(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testInvalidWriteOffsetOver",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1um2w6fjpr(final String baosName, final BAOSFactory<?> baosFactory) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25551);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25552);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25553);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance()) {
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25554);assertThrows(IndexOutOfBoundsException.class, () -> baout.write(IOUtils.EMPTY_BYTE_ARRAY, 1, 0));
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testInvalidWriteLenUnder(final String baosName, final BAOSFactory<?> baosFactory) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exzga3jpv(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testInvalidWriteLenUnder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exzga3jpv(final String baosName, final BAOSFactory<?> baosFactory) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25555);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25556);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25557);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance()) {
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25558);assertThrows(IndexOutOfBoundsException.class, () -> baout.write(new byte[1], 0, -1));
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testInvalidWriteOffsetAndLenUnder(final String baosName, final BAOSFactory<?> baosFactory)
        throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s62ikbjpz(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testInvalidWriteOffsetAndLenUnder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s62ikbjpz(final String baosName, final BAOSFactory<?> baosFactory) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25559);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25560);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25561);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance()) {
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25562);assertThrows(IndexOutOfBoundsException.class, () -> baout.write(new byte[1], 1, -2));
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testInvalidWriteOffsetAndLenOver(final String baosName, final BAOSFactory<?> baosFactory) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iqts8njq3(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testInvalidWriteOffsetAndLenOver",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iqts8njq3(final String baosName, final BAOSFactory<?> baosFactory) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25563);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25564);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25565);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance()) {
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25566);assertThrows(IndexOutOfBoundsException.class, () -> baout.write(new byte[1], 0, 2));
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testInvalidParameterizedConstruction(final String baosName, final BAOSFactory<?> baosFactory) {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqgszhjq7(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testInvalidParameterizedConstruction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqgszhjq7(final String baosName, final BAOSFactory<?> baosFactory){try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25567);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25568);assertThrows(IllegalArgumentException.class, () ->
                baosFactory.newInstance(-1)
        );
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testToInputStreamEmpty(final String baosName, final BAOSFactory<?> baosFactory) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1focje0jq9(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testToInputStreamEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1focje0jq9(final String baosName, final BAOSFactory<?> baosFactory) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25569);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25570);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25571);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance();
            // Get data before more writes
            __CLR4_4_1$AC6 __CLR$ACI7=new __CLR4_4_1$AC6(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25572);}};final InputStream in = baout.toInputStream()) {
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25573);assertEquals(0, in.available());
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25574);assertTrue(in instanceof ClosedInputStream);
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("toBufferedInputStreamFunctionFactories")
    public void testToBufferedInputStreamEmpty(final String baosName, final IOFunction<InputStream, InputStream> toBufferedInputStreamFunction) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nizbvdjqf(baosName,toBufferedInputStreamFunction);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testToBufferedInputStreamEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nizbvdjqf(final String baosName, final IOFunction<InputStream, InputStream> toBufferedInputStreamFunction) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25575);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25576);try (__CLR4_4_1$AC7 __CLR$ACI8=new __CLR4_4_1$AC7(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25577);}};final ByteArrayInputStream bain = new ByteArrayInputStream(IOUtils.EMPTY_BYTE_ARRAY)) {
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25578);assertEquals(0, bain.available());

            class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25579);try (__CLR4_4_1$AC8 __CLR$ACI9=new __CLR4_4_1$AC8(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25580);}};final InputStream buffered = toBufferedInputStreamFunction.apply(bain)) {
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25581);assertEquals(0, buffered.available());

            }
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("toBufferedInputStreamFunctionFactories")
    public void testToBufferedInputStream(final String baosName, final IOFunction<InputStream, InputStream> toBufferedInputStreamFunction) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oc04xijqm(baosName,toBufferedInputStreamFunction);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testToBufferedInputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oc04xijqm(final String baosName, final IOFunction<InputStream, InputStream> toBufferedInputStreamFunction) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25582);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25583);final byte data[] = {(byte)0xCA, (byte)0xFE, (byte)0xBA, (byte)0xBE};

        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25584);try (__CLR4_4_1$AC9 __CLR$ACI10=new __CLR4_4_1$AC9(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25585);}};final ByteArrayInputStream bain = new ByteArrayInputStream(data)) {
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25586);assertEquals(data.length, bain.available());

            class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25587);try (__CLR4_4_1$AC10 __CLR$ACI11=new __CLR4_4_1$AC10(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25588);}};final InputStream buffered = toBufferedInputStreamFunction.apply(bain)) {
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25589);assertEquals(data.length, buffered.available());

                __CLR4_4_1jo6jo6kylve3hs.R.inc(25590);assertArrayEquals(data, IOUtils.toByteArray(buffered));

            }
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testToInputStream(final String baosName, final BAOSFactory<?> baosFactory) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p74uzvjqv(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testToInputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p74uzvjqv(final String baosName, final BAOSFactory<?> baosFactory) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25591);
        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25592);try (__CLR4_4_1$AC11 __CLR$ACI12=new __CLR4_4_1$AC11(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25593);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance();
            __CLR4_4_1$AC11 __CLR$ACI13=new __CLR4_4_1$AC11(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25594);}};final java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream()) {

            // Write 8224 bytes
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25595);writeData(baout, ref, 32);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25596);for (int i = 0; (((i < 128)&&(__CLR4_4_1jo6jo6kylve3hs.R.iget(25597)!=0|true))||(__CLR4_4_1jo6jo6kylve3hs.R.iget(25598)==0&false)); i++) {{
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25599);writeData(baout, ref, 64);
            }

            // Get data before more writes
            }class __CLR4_4_1$AC12 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25600);try (__CLR4_4_1$AC12 __CLR$ACI14=new __CLR4_4_1$AC12(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25601);}};final InputStream in = baout.toInputStream()) {
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25602);byte refData[] = ref.toByteArray();

                // Write some more data
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25603);writeData(baout, ref, new int[] {2, 4, 8, 16});

                // Check original data
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25604);byte baoutData[] = IOUtils.toByteArray(in);
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25605);assertEquals(8224, baoutData.length);
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25606);checkByteArrays(refData, baoutData);

                // Check all data written
                class __CLR4_4_1$AC13 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25607);try (__CLR4_4_1$AC13 __CLR$ACI15=new __CLR4_4_1$AC13(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25608);}};final InputStream in2 = baout.toInputStream()) {
                    __CLR4_4_1jo6jo6kylve3hs.R.inc(25609);baoutData = IOUtils.toByteArray(in2);
                }
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25610);refData = ref.toByteArray();
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25611);assertEquals(8254, baoutData.length);
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25612);checkByteArrays(refData, baoutData);
            }
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testToInputStreamWithReset(final String baosName, final BAOSFactory<?> baosFactory) throws IOException {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198mxz8jrh(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testToInputStreamWithReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198mxz8jrh(final String baosName, final BAOSFactory<?> baosFactory) throws IOException{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25613);
        // Make sure reset() do not destroy InputStream returned from toInputStream()
        class __CLR4_4_1$AC14 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25614);try (__CLR4_4_1$AC14 __CLR$ACI16=new __CLR4_4_1$AC14(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25615);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance();
            __CLR4_4_1$AC14 __CLR$ACI17=new __CLR4_4_1$AC14(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25616);}};final java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream()) {

            // Write 8224 bytes
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25617);writeData(baout, ref, 32);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25618);for (int i = 0; (((i < 128)&&(__CLR4_4_1jo6jo6kylve3hs.R.iget(25619)!=0|true))||(__CLR4_4_1jo6jo6kylve3hs.R.iget(25620)==0&false)); i++) {{
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25621);writeData(baout, ref, 64);
            }

            // Get data before reset
            }class __CLR4_4_1$AC15 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25622);try (__CLR4_4_1$AC15 __CLR$ACI18=new __CLR4_4_1$AC15(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25623);}};final InputStream in = baout.toInputStream()) {
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25624);byte refData[] = ref.toByteArray();

                // Reset and write some new data
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25625);baout.reset();
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25626);ref.reset();
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25627);writeData(baout, ref, new int[] {2, 4, 8, 16});

                // Check original data
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25628);byte baoutData[] = IOUtils.toByteArray(in);
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25629);assertEquals(8224, baoutData.length);
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25630);checkByteArrays(refData, baoutData);

                // Check new data written after reset
                class __CLR4_4_1$AC16 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25631);try (__CLR4_4_1$AC16 __CLR$ACI19=new __CLR4_4_1$AC16(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25632);}};final InputStream in2 = baout.toInputStream()) {
                    __CLR4_4_1jo6jo6kylve3hs.R.inc(25633);baoutData = IOUtils.toByteArray(in2);
                }
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25634);refData = ref.toByteArray();
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25635);assertEquals(30, baoutData.length);
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25636);checkByteArrays(refData, baoutData);
            }
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("baosFactories")
    public void testStream(final String baosName, final BAOSFactory<?> baosFactory) throws Exception {__CLR4_4_1jo6jo6kylve3hs.R.globalSliceStart(getClass().getName(),25637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1upl7uejs5(baosName,baosFactory);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jo6jo6kylve3hs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jo6jo6kylve3hs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.ByteArrayOutputStreamTestCase.testStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1upl7uejs5(final String baosName, final BAOSFactory<?> baosFactory) throws Exception{try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25637);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25638);int written;

        // The ByteArrayOutputStream is initialized with 32 bytes to match
        // the original more closely for this test.
        class __CLR4_4_1$AC17 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25639);try (__CLR4_4_1$AC17 __CLR$ACI20=new __CLR4_4_1$AC17(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25640);}};final AbstractByteArrayOutputStream baout = baosFactory.newInstance(32);
            __CLR4_4_1$AC17 __CLR$ACI21=new __CLR4_4_1$AC17(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25641);}};final java.io.ByteArrayOutputStream ref = new java.io.ByteArrayOutputStream()) {

            // First three writes
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25642);written = writeData(baout, ref, new int[] {4, 10, 22});
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25643);assertEquals(36, written);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25644);checkStreams(baout, ref);

            // Another two writes to see if there are any bad effects after toByteArray()
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25645);written = writeData(baout, ref, new int[] {20, 12});
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25646);assertEquals(32, written);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25647);checkStreams(baout, ref);

            // Now reset the streams
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25648);baout.reset();
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25649);ref.reset();

            // Test again to see if reset() had any bad effects
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25650);written = writeData(baout, ref, new int[] {5, 47, 33, 60, 1, 0, 8});
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25651);assertEquals(155, written);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25652);checkStreams(baout, ref);

            // Test the readFrom(InputStream) method
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25653);baout.reset();
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25654);written = baout.write(new ByteArrayInputStream(ref.toByteArray()));
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25655);assertEquals(155, written);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25656);checkStreams(baout, ref);

            // Write the commons Byte[]OutputStream to a java.io.Byte[]OutputStream
            // and vice-versa to test the writeTo() method.
            class __CLR4_4_1$AC18 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25657);try (__CLR4_4_1$AC18 __CLR$ACI22=new __CLR4_4_1$AC18(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25658);}};final AbstractByteArrayOutputStream baout1 = baosFactory.newInstance(32)) {
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25659);ref.writeTo(baout1);
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25660);final java.io.ByteArrayOutputStream ref1 = new java.io.ByteArrayOutputStream();
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25661);baout.writeTo(ref1);
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25662);checkStreams(baout1, ref1);

                // Testing toString(String)
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25663);final String baoutString = baout.toString("ASCII");
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25664);final String refString = ref.toString("ASCII");
                __CLR4_4_1jo6jo6kylve3hs.R.inc(25665);assertEquals(refString, baoutString, "ASCII decoded String must be equal");

                // Make sure that empty ByteArrayOutputStreams really don't create garbage
                // on toByteArray()
                class __CLR4_4_1$AC19 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jo6jo6kylve3hs.R.inc(25666);try (__CLR4_4_1$AC19 __CLR$ACI23=new __CLR4_4_1$AC19(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25667);}};final AbstractByteArrayOutputStream baos1 = baosFactory.newInstance();
                    __CLR4_4_1$AC19 __CLR$ACI24=new __CLR4_4_1$AC19(){{__CLR4_4_1jo6jo6kylve3hs.R.inc(25668);}};final AbstractByteArrayOutputStream baos2 = baosFactory.newInstance()) {
                    __CLR4_4_1jo6jo6kylve3hs.R.inc(25669);assertSame(baos1.toByteArray(), baos2.toByteArray());
                }
            }
        }
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    private static Stream<Arguments> baosFactories() {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25670);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25671);return Stream.of(
                Arguments.of(ByteArrayOutputStream.class.getSimpleName(), new ByteArrayOutputStreamFactory()),
                Arguments.of(UnsynchronizedByteArrayOutputStream.class.getSimpleName(), new UnsynchronizedByteArrayOutputStreamFactory())
        );
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

    private static class ByteArrayOutputStreamFactory implements BAOSFactory<ByteArrayOutputStream> {
        @Override
        public ByteArrayOutputStream newInstance() {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25672);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25673);return new ByteArrayOutputStream();
        }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

        @Override
        public ByteArrayOutputStream newInstance(final int size) {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25674);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25675);return new ByteArrayOutputStream(size);
        }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}
    }

    private static class UnsynchronizedByteArrayOutputStreamFactory implements BAOSFactory<UnsynchronizedByteArrayOutputStream> {
        @Override
        public UnsynchronizedByteArrayOutputStream newInstance() {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25676);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25677);return new UnsynchronizedByteArrayOutputStream();
        }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}

        @Override
        public UnsynchronizedByteArrayOutputStream newInstance(final int size) {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25678);
            __CLR4_4_1jo6jo6kylve3hs.R.inc(25679);return new UnsynchronizedByteArrayOutputStream(size);
        }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}
    }

    private interface BAOSFactory<T extends AbstractByteArrayOutputStream> {
        T newInstance();
        T newInstance(final int size);
    }

    private static Stream<Arguments> toBufferedInputStreamFunctionFactories() {try{__CLR4_4_1jo6jo6kylve3hs.R.inc(25680);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25681);final IOFunction<InputStream, InputStream> syncBaosToBufferedInputStream = ByteArrayOutputStream::toBufferedInputStream;
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25682);final IOFunction<InputStream, InputStream> syncBaosToBufferedInputStreamWithSize = is -> ByteArrayOutputStream.toBufferedInputStream(is, 1024);
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25683);final IOFunction<InputStream, InputStream> unSyncBaosToBufferedInputStream = UnsynchronizedByteArrayOutputStream::toBufferedInputStream;
        __CLR4_4_1jo6jo6kylve3hs.R.inc(25684);final IOFunction<InputStream, InputStream> unSyncBaosToBufferedInputStreamWithSize = is -> UnsynchronizedByteArrayOutputStream.toBufferedInputStream(is, 1024);

        __CLR4_4_1jo6jo6kylve3hs.R.inc(25685);return Stream.of(
            Arguments.of("ByteArrayOutputStream.toBufferedInputStream(InputStream)", syncBaosToBufferedInputStream),
            Arguments.of("ByteArrayOutputStream.toBufferedInputStream(InputStream, int)", syncBaosToBufferedInputStreamWithSize),
            Arguments.of("UnsynchronizedByteArrayOutputStream.toBufferedInputStream(InputStream)", unSyncBaosToBufferedInputStream),
            Arguments.of("UnsynchronizedByteArrayOutputStream.toBufferedInputStream(InputStream, int)", unSyncBaosToBufferedInputStreamWithSize)
        );
    }finally{__CLR4_4_1jo6jo6kylve3hs.R.flushNeeded();}}
}
