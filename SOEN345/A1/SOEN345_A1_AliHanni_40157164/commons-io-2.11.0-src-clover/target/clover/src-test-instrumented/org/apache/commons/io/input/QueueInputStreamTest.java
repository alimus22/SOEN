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

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Stream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.QueueOutputStream;
import org.apache.commons.io.output.QueueOutputStreamTest;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Test {@link QueueInputStream}.
 *
 * @see {@link QueueOutputStreamTest}
 */
public class QueueInputStreamTest {static class __CLR4_4_1h9oh9okylve2ye{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22431,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    public static Stream<Arguments> inputData() {try{__CLR4_4_1h9oh9okylve2ye.R.inc(22380);
        __CLR4_4_1h9oh9okylve2ye.R.inc(22381);return Stream.of(Arguments.of(""),
                Arguments.of("1"),
                Arguments.of("12"),
                Arguments.of("1234"),
                Arguments.of("12345678"),
                Arguments.of(StringUtils.repeat("A", 4095)),
                Arguments.of(StringUtils.repeat("A", 4096)),
                Arguments.of(StringUtils.repeat("A", 4097)),
                Arguments.of(StringUtils.repeat("A", 8191)),
                Arguments.of(StringUtils.repeat("A", 8192)),
                Arguments.of(StringUtils.repeat("A", 8193)),
                Arguments.of(StringUtils.repeat("A", 8192 * 4)));
    }finally{__CLR4_4_1h9oh9okylve2ye.R.flushNeeded();}}

    @ParameterizedTest(name = "inputData={0}")
    @MethodSource("inputData")
    public void unbufferedReadWrite(final String inputData) throws IOException {__CLR4_4_1h9oh9okylve2ye.R.globalSliceStart(getClass().getName(),22382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epv0jrh9q(inputData);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9oh9okylve2ye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9oh9okylve2ye.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.QueueInputStreamTest.unbufferedReadWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epv0jrh9q(final String inputData) throws IOException{try{__CLR4_4_1h9oh9okylve2ye.R.inc(22382);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h9oh9okylve2ye.R.inc(22383);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1h9oh9okylve2ye.R.inc(22384);}};final QueueInputStream inputStream = new QueueInputStream();
                __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1h9oh9okylve2ye.R.inc(22385);}};final QueueOutputStream outputStream = inputStream.newQueueOutputStream()) {
            __CLR4_4_1h9oh9okylve2ye.R.inc(22386);writeUnbuffered(outputStream, inputData);
            __CLR4_4_1h9oh9okylve2ye.R.inc(22387);final String actualData = readUnbuffered(inputStream);
            __CLR4_4_1h9oh9okylve2ye.R.inc(22388);assertEquals(inputData, actualData);
        }
    }finally{__CLR4_4_1h9oh9okylve2ye.R.flushNeeded();}}

    @ParameterizedTest(name = "inputData={0}")
    @MethodSource("inputData")
    public void bufferedReads(final String inputData) throws IOException {__CLR4_4_1h9oh9okylve2ye.R.globalSliceStart(getClass().getName(),22389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qu4a4h9x(inputData);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9oh9okylve2ye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9oh9okylve2ye.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.QueueInputStreamTest.bufferedReads",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qu4a4h9x(final String inputData) throws IOException{try{__CLR4_4_1h9oh9okylve2ye.R.inc(22389);
        __CLR4_4_1h9oh9okylve2ye.R.inc(22390);final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h9oh9okylve2ye.R.inc(22391);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1h9oh9okylve2ye.R.inc(22392);}};final BufferedInputStream inputStream = new BufferedInputStream(new QueueInputStream(queue));
                __CLR4_4_1$AC1 __CLR$ACI3=new __CLR4_4_1$AC1(){{__CLR4_4_1h9oh9okylve2ye.R.inc(22393);}};final QueueOutputStream outputStream = new QueueOutputStream(queue)) {
            __CLR4_4_1h9oh9okylve2ye.R.inc(22394);outputStream.write(inputData.getBytes(UTF_8));
            __CLR4_4_1h9oh9okylve2ye.R.inc(22395);final String actualData = IOUtils.toString(inputStream, UTF_8);
            __CLR4_4_1h9oh9okylve2ye.R.inc(22396);assertEquals(inputData, actualData);
        }
    }finally{__CLR4_4_1h9oh9okylve2ye.R.flushNeeded();}}

    @ParameterizedTest(name = "inputData={0}")
    @MethodSource("inputData")
    public void bufferedWrites(final String inputData) throws IOException {__CLR4_4_1h9oh9okylve2ye.R.globalSliceStart(getClass().getName(),22397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h2bc15ha5(inputData);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9oh9okylve2ye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9oh9okylve2ye.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.QueueInputStreamTest.bufferedWrites",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h2bc15ha5(final String inputData) throws IOException{try{__CLR4_4_1h9oh9okylve2ye.R.inc(22397);
        __CLR4_4_1h9oh9okylve2ye.R.inc(22398);final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h9oh9okylve2ye.R.inc(22399);try (__CLR4_4_1$AC2 __CLR$ACI4=new __CLR4_4_1$AC2(){{__CLR4_4_1h9oh9okylve2ye.R.inc(22400);}};final QueueInputStream inputStream = new QueueInputStream(queue);
                __CLR4_4_1$AC2 __CLR$ACI5=new __CLR4_4_1$AC2(){{__CLR4_4_1h9oh9okylve2ye.R.inc(22401);}};final BufferedOutputStream outputStream = new BufferedOutputStream(new QueueOutputStream(queue), defaultBufferSize())) {
            __CLR4_4_1h9oh9okylve2ye.R.inc(22402);outputStream.write(inputData.getBytes(UTF_8));
            __CLR4_4_1h9oh9okylve2ye.R.inc(22403);outputStream.flush();
            __CLR4_4_1h9oh9okylve2ye.R.inc(22404);final String actualData = readUnbuffered(inputStream);
            __CLR4_4_1h9oh9okylve2ye.R.inc(22405);assertEquals(inputData, actualData);
        }
    }finally{__CLR4_4_1h9oh9okylve2ye.R.flushNeeded();}}

    @ParameterizedTest(name = "inputData={0}")
    @MethodSource("inputData")
    public void bufferedReadWrite(final String inputData) throws IOException {__CLR4_4_1h9oh9okylve2ye.R.globalSliceStart(getClass().getName(),22406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fc01lshae(inputData);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9oh9okylve2ye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9oh9okylve2ye.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.QueueInputStreamTest.bufferedReadWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fc01lshae(final String inputData) throws IOException{try{__CLR4_4_1h9oh9okylve2ye.R.inc(22406);
        __CLR4_4_1h9oh9okylve2ye.R.inc(22407);final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h9oh9okylve2ye.R.inc(22408);try (__CLR4_4_1$AC3 __CLR$ACI6=new __CLR4_4_1$AC3(){{__CLR4_4_1h9oh9okylve2ye.R.inc(22409);}};final BufferedInputStream inputStream = new BufferedInputStream(new QueueInputStream(queue));
                __CLR4_4_1$AC3 __CLR$ACI7=new __CLR4_4_1$AC3(){{__CLR4_4_1h9oh9okylve2ye.R.inc(22410);}};final BufferedOutputStream outputStream = new BufferedOutputStream(new QueueOutputStream(queue), defaultBufferSize())) {
            __CLR4_4_1h9oh9okylve2ye.R.inc(22411);outputStream.write(inputData.getBytes(UTF_8));
            __CLR4_4_1h9oh9okylve2ye.R.inc(22412);outputStream.flush();
            __CLR4_4_1h9oh9okylve2ye.R.inc(22413);final String dataCopy = IOUtils.toString(inputStream, UTF_8);
            __CLR4_4_1h9oh9okylve2ye.R.inc(22414);assertEquals(inputData, dataCopy);
        }
    }finally{__CLR4_4_1h9oh9okylve2ye.R.flushNeeded();}}

    @Test
    public void testNullArgument() {__CLR4_4_1h9oh9okylve2ye.R.globalSliceStart(getClass().getName(),22415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6zpszhan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h9oh9okylve2ye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h9oh9okylve2ye.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.QueueInputStreamTest.testNullArgument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6zpszhan(){try{__CLR4_4_1h9oh9okylve2ye.R.inc(22415);
        __CLR4_4_1h9oh9okylve2ye.R.inc(22416);assertThrows(NullPointerException.class, () -> new QueueInputStream(null), "queue is required");
    }finally{__CLR4_4_1h9oh9okylve2ye.R.flushNeeded();}}

    private int defaultBufferSize() {try{__CLR4_4_1h9oh9okylve2ye.R.inc(22417);
        __CLR4_4_1h9oh9okylve2ye.R.inc(22418);return 8192;
    }finally{__CLR4_4_1h9oh9okylve2ye.R.flushNeeded();}}

    private void writeUnbuffered(final QueueOutputStream outputStream, final String inputData) throws InterruptedIOException {try{__CLR4_4_1h9oh9okylve2ye.R.inc(22419);
        __CLR4_4_1h9oh9okylve2ye.R.inc(22420);final byte[] bytes = inputData.getBytes(UTF_8);
        __CLR4_4_1h9oh9okylve2ye.R.inc(22421);for (final byte oneByte : bytes) {{
            __CLR4_4_1h9oh9okylve2ye.R.inc(22422);outputStream.write(oneByte);
        }
    }}finally{__CLR4_4_1h9oh9okylve2ye.R.flushNeeded();}}

    private String readUnbuffered(final InputStream inputStream) throws IOException {try{__CLR4_4_1h9oh9okylve2ye.R.inc(22423);
        __CLR4_4_1h9oh9okylve2ye.R.inc(22424);final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        __CLR4_4_1h9oh9okylve2ye.R.inc(22425);int n = -1;
        __CLR4_4_1h9oh9okylve2ye.R.inc(22426);while ((n = inputStream.read()) != -1) {{
            __CLR4_4_1h9oh9okylve2ye.R.inc(22429);byteArrayOutputStream.write(n);
        }
        }__CLR4_4_1h9oh9okylve2ye.R.inc(22430);return byteArrayOutputStream.toString("UTF-8");
    }finally{__CLR4_4_1h9oh9okylve2ye.R.flushNeeded();}}
}
