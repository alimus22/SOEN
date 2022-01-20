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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Unit tests for the {@code DeferredFileOutputStream} class.
 *
 */
public class DeferredFileOutputStreamTest {static class __CLR4_4_1jxhjxhkylve3ji{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26001,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    public static IntStream data() {try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25829);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25830);return IntStream.of(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096);
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * The test data as a string (which is the simplest form).
     */
    private final String testString = "0123456789";

    /**
     * The test data as a byte array, derived from the string.
     */
    private final byte[] testBytes = testString.getBytes();

    /**
     * Tests the case where the amount of data exceeds the threshold, and is therefore written to disk. The actual data
     * written to disk is verified, as is the file itself.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testAboveThreshold(final int initialBufferSize) {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yob14jxj(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testAboveThreshold",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yob14jxj(final int initialBufferSize){try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25831);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25832);final File testFile = new File("testAboveThreshold.dat");

        // Ensure that the test starts from a clean base.
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25833);testFile.delete();

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25834);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length - 5, initialBufferSize,
            testFile);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25835);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25836);dfos.write(testBytes, 0, testBytes.length);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25837);dfos.close();
        } catch (final IOException e) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25838);fail("Unexpected IOException");
        }
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25839);assertFalse(dfos.isInMemory());
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25840);assertNull(dfos.getData());

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25841);verifyResultFile(testFile);

        // Ensure that the test starts from a clean base.
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25842);testFile.delete();
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Tests the case where the amount of data exceeds the threshold, and is therefore written to disk. The actual data
     * written to disk is verified, as is the file itself.
     * Testing the getInputStream() method.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testAboveThresholdGetInputStream(final int initialBufferSize, final @TempDir Path tempDir) throws IOException {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l6zvlzjxv(initialBufferSize,tempDir);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testAboveThresholdGetInputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l6zvlzjxv(final int initialBufferSize, final @TempDir Path tempDir) throws IOException{try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25843);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25844);final File testFile = tempDir.resolve("testAboveThreshold.dat").toFile();

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25845);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length - 5, initialBufferSize,
            testFile);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25846);dfos.write(testBytes, 0, testBytes.length);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25847);dfos.close();
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25848);assertFalse(dfos.isInMemory());

        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jxhjxhkylve3ji.R.inc(25849);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1jxhjxhkylve3ji.R.inc(25850);}};InputStream is = dfos.toInputStream()) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25851);assertArrayEquals(testBytes, IOUtils.toByteArray(is));
        }

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25852);verifyResultFile(testFile);
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Tests the case where the amount of data is exactly the same as the threshold. The behavior should be the same as
     * that for the amount of data being below (i.e. not exceeding) the threshold.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testAtThreshold(final int initialBufferSize) {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehedr6jy5(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testAtThreshold",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehedr6jy5(final int initialBufferSize){try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25853);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25854);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length, initialBufferSize, null);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25855);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25856);dfos.write(testBytes, 0, testBytes.length);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25857);dfos.close();
        } catch (final IOException e) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25858);fail("Unexpected IOException");
        }
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25859);assertTrue(dfos.isInMemory());

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25860);final byte[] resultBytes = dfos.getData();
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25861);assertEquals(testBytes.length, resultBytes.length);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25862);assertArrayEquals(resultBytes, testBytes);
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Tests the case where the amount of data falls below the threshold, and is therefore confined to memory.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testBelowThreshold(final int initialBufferSize) {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19b0gqsjyf(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testBelowThreshold",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19b0gqsjyf(final int initialBufferSize){try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25863);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25864);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length + 42, initialBufferSize,
            null);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25865);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25866);dfos.write(testBytes, 0, testBytes.length);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25867);dfos.close();
        } catch (final IOException e) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25868);fail("Unexpected IOException");
        }
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25869);assertTrue(dfos.isInMemory());

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25870);final byte[] resultBytes = dfos.getData();
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25871);assertEquals(testBytes.length, resultBytes.length);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25872);assertArrayEquals(resultBytes, testBytes);
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Tests the case where the amount of data falls below the threshold, and is therefore confined to memory.
     * Testing the getInputStream() method.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testBelowThresholdGetInputStream(final int initialBufferSize) throws IOException {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yq5igjyp(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testBelowThresholdGetInputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yq5igjyp(final int initialBufferSize) throws IOException{try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25873);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25874);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length + 42, initialBufferSize,
            null);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25875);dfos.write(testBytes, 0, testBytes.length);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25876);dfos.close();
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25877);assertTrue(dfos.isInMemory());

        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jxhjxhkylve3ji.R.inc(25878);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1jxhjxhkylve3ji.R.inc(25879);}};InputStream is = dfos.toInputStream()) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25880);assertArrayEquals(testBytes, IOUtils.toByteArray(is));
        }
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Test specifying a temporary file and the threshold is reached.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testTempFileAboveThreshold(final int initialBufferSize) {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dvse3sjyx(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testTempFileAboveThreshold",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dvse3sjyx(final int initialBufferSize){try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25881);

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25882);final String prefix = "commons-io-test";
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25883);final String suffix = ".out";
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25884);final File tempDir = new File(".");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25885);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length - 5, initialBufferSize,
            prefix, suffix, tempDir);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25886);assertNull(dfos.getFile(), "Check file is null-A");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25887);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25888);dfos.write(testBytes, 0, testBytes.length);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25889);dfos.close();
        } catch (final IOException e) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25890);fail("Unexpected IOException");
        }
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25891);assertFalse(dfos.isInMemory());
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25892);assertNull(dfos.getData());
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25893);assertNotNull(dfos.getFile(), "Check file not null");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25894);assertTrue(dfos.getFile().exists(), "Check file exists");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25895);assertTrue(dfos.getFile().getName().startsWith(prefix), "Check prefix");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25896);assertTrue(dfos.getFile().getName().endsWith(suffix), "Check suffix");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25897);assertEquals(tempDir.getPath(), dfos.getFile().getParent(), "Check dir");

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25898);verifyResultFile(dfos.getFile());

        // Delete the temporary file.
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25899);dfos.getFile().delete();
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Test specifying a temporary file and the threshold is reached.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testTempFileAboveThresholdPrefixOnly(final int initialBufferSize) {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7s00qjzg(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testTempFileAboveThresholdPrefixOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7s00qjzg(final int initialBufferSize){try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25900);

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25901);final String prefix = "commons-io-test";
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25902);final String suffix = null;
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25903);final File tempDir = null;
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25904);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length - 5, initialBufferSize,
            prefix, suffix, tempDir);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25905);assertNull(dfos.getFile(), "Check file is null-A");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25906);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25907);dfos.write(testBytes, 0, testBytes.length);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25908);dfos.close();
        } catch (final IOException e) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25909);fail("Unexpected IOException");
        }
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25910);assertFalse(dfos.isInMemory());
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25911);assertNull(dfos.getData());
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25912);assertNotNull(dfos.getFile(), "Check file not null");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25913);assertTrue(dfos.getFile().exists(), "Check file exists");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25914);assertTrue(dfos.getFile().getName().startsWith(prefix), "Check prefix");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25915);assertTrue(dfos.getFile().getName().endsWith(".tmp"), "Check suffix"); // ".tmp" is default

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25916);verifyResultFile(dfos.getFile());

        // Delete the temporary file.
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25917);dfos.getFile().delete();
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Test specifying a temporary file and the threshold not reached.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testTempFileBelowThreshold(final int initialBufferSize) {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g84jtgjzy(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testTempFileBelowThreshold",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g84jtgjzy(final int initialBufferSize){try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25918);

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25919);final String prefix = "commons-io-test";
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25920);final String suffix = ".out";
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25921);final File tempDir = new File(".");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25922);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length + 42, initialBufferSize,
            prefix, suffix, tempDir);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25923);assertNull(dfos.getFile(), "Check file is null-A");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25924);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25925);dfos.write(testBytes, 0, testBytes.length);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25926);dfos.close();
        } catch (final IOException e) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25927);fail("Unexpected IOException");
        }
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25928);assertTrue(dfos.isInMemory());
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25929);assertNull(dfos.getFile(), "Check file is null-B");
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Test specifying a temporary file and the threshold is reached.
     *
     * @throws Exception
     */
    @Test
    public void testTempFileError() throws Exception {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p2n5alk0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testTempFileError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p2n5alk0a() throws Exception{try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25930);

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25931);final String prefix = null;
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25932);final String suffix = ".out";
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25933);final File tempDir = new File(".");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25934);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25935);new DeferredFileOutputStream(testBytes.length - 5, prefix, suffix, tempDir).close();
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25936);fail("Expected IllegalArgumentException ");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Tests the case where there are multiple writes beyond the threshold, to ensure that the
     * {@code thresholdReached()} method is only called once, as the threshold is crossed for the first time.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testThresholdReached(final int initialBufferSize) {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkygpbk0h(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testThresholdReached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkygpbk0h(final int initialBufferSize){try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25937);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25938);final File testFile = new File("testThresholdReached.dat");

        // Ensure that the test starts from a clean base.
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25939);testFile.delete();

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25940);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length / 2, initialBufferSize,
            testFile);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25941);final int chunkSize = testBytes.length / 3;

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25942);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25943);dfos.write(testBytes, 0, chunkSize);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25944);dfos.write(testBytes, chunkSize, chunkSize);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25945);dfos.write(testBytes, chunkSize * 2, testBytes.length - chunkSize * 2);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25946);dfos.close();
        } catch (final IOException e) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25947);fail("Unexpected IOException");
        }
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25948);assertFalse(dfos.isInMemory());
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25949);assertNull(dfos.getData());

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25950);verifyResultFile(testFile);

        // Ensure that the test starts from a clean base.
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25951);testFile.delete();
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Test whether writeTo() properly writes large content.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testWriteToLarge(final int initialBufferSize) {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8c2qdk0w(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testWriteToLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8c2qdk0w(final int initialBufferSize){try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25952);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25953);final File testFile = new File("testWriteToFile.dat");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25954);final ByteArrayOutputStream baos = new ByteArrayOutputStream(initialBufferSize);
        // Ensure that the test starts from a clean base.
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25955);testFile.delete();

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25956);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length / 2, testFile);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25957);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25958);dfos.write(testBytes);

            __CLR4_4_1jxhjxhkylve3ji.R.inc(25959);assertTrue(testFile.exists());
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25960);assertFalse(dfos.isInMemory());

            __CLR4_4_1jxhjxhkylve3ji.R.inc(25961);try {
                __CLR4_4_1jxhjxhkylve3ji.R.inc(25962);dfos.writeTo(baos);
                __CLR4_4_1jxhjxhkylve3ji.R.inc(25963);fail("Should not have been able to write before closing");
            } catch (final IOException ioe) {
                // ok, as expected
            }

            __CLR4_4_1jxhjxhkylve3ji.R.inc(25964);dfos.close();
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25965);dfos.writeTo(baos);
        } catch (final IOException ioe) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25966);fail("Unexpected IOException");
        }
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25967);final byte[] copiedBytes = baos.toByteArray();
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25968);assertArrayEquals(testBytes, copiedBytes);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25969);verifyResultFile(testFile);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25970);testFile.delete();
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Test whether writeTo() properly writes small content.
     */
    @ParameterizedTest(name = "initialBufferSize = {0}")
    @MethodSource("data")
    public void testWriteToSmall(final int initialBufferSize) {__CLR4_4_1jxhjxhkylve3ji.R.globalSliceStart(getClass().getName(),25971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oprwmvk1f(initialBufferSize);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jxhjxhkylve3ji.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jxhjxhkylve3ji.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.DeferredFileOutputStreamTest.testWriteToSmall",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oprwmvk1f(final int initialBufferSize){try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25971);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25972);final File testFile = new File("testWriteToMem.dat");
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25973);final ByteArrayOutputStream baos = new ByteArrayOutputStream(initialBufferSize);
        // Ensure that the test starts from a clean base.
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25974);testFile.delete();

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25975);final DeferredFileOutputStream dfos = new DeferredFileOutputStream(testBytes.length * 2, initialBufferSize,
            testFile);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25976);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25977);dfos.write(testBytes);

            __CLR4_4_1jxhjxhkylve3ji.R.inc(25978);assertFalse(testFile.exists());
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25979);assertTrue(dfos.isInMemory());

            __CLR4_4_1jxhjxhkylve3ji.R.inc(25980);try {
                __CLR4_4_1jxhjxhkylve3ji.R.inc(25981);dfos.writeTo(baos);
                __CLR4_4_1jxhjxhkylve3ji.R.inc(25982);fail("Should not have been able to write before closing");
            } catch (final IOException ioe) {
                // ok, as expected
            }

            __CLR4_4_1jxhjxhkylve3ji.R.inc(25983);dfos.close();
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25984);dfos.writeTo(baos);
        } catch (final IOException ioe) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25985);fail("Unexpected IOException");
        }
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25986);final byte[] copiedBytes = baos.toByteArray();
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25987);assertArrayEquals(testBytes, copiedBytes);

        __CLR4_4_1jxhjxhkylve3ji.R.inc(25988);testFile.delete();
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}

    /**
     * Verifies that the specified file contains the same data as the original test data.
     *
     * @param testFile The file containing the test output.
     */
    private void verifyResultFile(final File testFile) {try{__CLR4_4_1jxhjxhkylve3ji.R.inc(25989);
        __CLR4_4_1jxhjxhkylve3ji.R.inc(25990);try {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25991);final InputStream fis = Files.newInputStream(testFile.toPath());
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25992);assertEquals(testBytes.length, fis.available());

            __CLR4_4_1jxhjxhkylve3ji.R.inc(25993);final byte[] resultBytes = new byte[testBytes.length];
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25994);assertEquals(testBytes.length, fis.read(resultBytes));

            __CLR4_4_1jxhjxhkylve3ji.R.inc(25995);assertArrayEquals(resultBytes, testBytes);
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25996);assertEquals(-1, fis.read(resultBytes));

            __CLR4_4_1jxhjxhkylve3ji.R.inc(25997);try {
                __CLR4_4_1jxhjxhkylve3ji.R.inc(25998);fis.close();
            } catch (final IOException e) {
                // Ignore an exception on close
            }
        } catch (final FileNotFoundException e) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(25999);fail("Unexpected FileNotFoundException");
        } catch (final IOException e) {
            __CLR4_4_1jxhjxhkylve3ji.R.inc(26000);fail("Unexpected IOException");
        }
    }finally{__CLR4_4_1jxhjxhkylve3ji.R.flushNeeded();}}
}
