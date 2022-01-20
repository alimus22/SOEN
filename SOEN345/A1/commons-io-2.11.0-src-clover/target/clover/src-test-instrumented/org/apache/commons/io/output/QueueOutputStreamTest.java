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

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.QueueInputStream;
import org.apache.commons.io.input.QueueInputStreamTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

/**
 * Test {@link QueueOutputStream} and {@link QueueInputStream}
 *
 * @see QueueInputStreamTest
 */
public class QueueOutputStreamTest {static class __CLR4_4_1kldkldkylve3n2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final ExecutorService executorService = Executors.newFixedThreadPool(5);

    @AfterAll
    public static void afterAll() {try{__CLR4_4_1kldkldkylve3n2.R.inc(26689);
        __CLR4_4_1kldkldkylve3n2.R.inc(26690);executorService.shutdown();
    }finally{__CLR4_4_1kldkldkylve3n2.R.flushNeeded();}}

    private static <T> T callInThrowAwayThread(final Callable<T> callable) throws Exception {try{__CLR4_4_1kldkldkylve3n2.R.inc(26691);
        __CLR4_4_1kldkldkylve3n2.R.inc(26692);final Exchanger<T> exchanger = new Exchanger<>();
        __CLR4_4_1kldkldkylve3n2.R.inc(26693);executorService.submit(() -> {
            __CLR4_4_1kldkldkylve3n2.R.inc(26694);final T value = callable.call();
            __CLR4_4_1kldkldkylve3n2.R.inc(26695);exchanger.exchange(value);
            __CLR4_4_1kldkldkylve3n2.R.inc(26696);return null;
        });
        __CLR4_4_1kldkldkylve3n2.R.inc(26697);return exchanger.exchange(null);
    }finally{__CLR4_4_1kldkldkylve3n2.R.flushNeeded();}}

    @Test
    public void testNullArgument() {__CLR4_4_1kldkldkylve3n2.R.globalSliceStart(getClass().getName(),26698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6zpszklm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kldkldkylve3n2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kldkldkylve3n2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.QueueOutputStreamTest.testNullArgument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6zpszklm(){try{__CLR4_4_1kldkldkylve3n2.R.inc(26698);
        __CLR4_4_1kldkldkylve3n2.R.inc(26699);assertThrows(NullPointerException.class, () -> new QueueOutputStream(null), "queue is required");
    }finally{__CLR4_4_1kldkldkylve3n2.R.flushNeeded();}}

    @Test
    public void writeInterrupted() throws Exception {__CLR4_4_1kldkldkylve3n2.R.globalSliceStart(getClass().getName(),26700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1arxaruklo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kldkldkylve3n2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kldkldkylve3n2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.QueueOutputStreamTest.writeInterrupted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1arxaruklo() throws Exception{try{__CLR4_4_1kldkldkylve3n2.R.inc(26700);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kldkldkylve3n2.R.inc(26701);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1kldkldkylve3n2.R.inc(26702);}};final QueueOutputStream outputStream = new QueueOutputStream(new LinkedBlockingQueue<>(1));
                __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1kldkldkylve3n2.R.inc(26703);}};final QueueInputStream inputStream = outputStream.newQueueInputStream()) {

            __CLR4_4_1kldkldkylve3n2.R.inc(26704);final int timeout = 1;
            __CLR4_4_1kldkldkylve3n2.R.inc(26705);final Exchanger<Thread> writerThreadExchanger = new Exchanger<>();
            __CLR4_4_1kldkldkylve3n2.R.inc(26706);final Exchanger<Exception> exceptionExchanger = new Exchanger<>();
            __CLR4_4_1kldkldkylve3n2.R.inc(26707);executorService.submit(() -> {
                __CLR4_4_1kldkldkylve3n2.R.inc(26708);final Thread writerThread = writerThreadExchanger.exchange(null, timeout, SECONDS);
                __CLR4_4_1kldkldkylve3n2.R.inc(26709);writerThread.interrupt();
                __CLR4_4_1kldkldkylve3n2.R.inc(26710);return null;
            });

            __CLR4_4_1kldkldkylve3n2.R.inc(26711);executorService.submit(() -> {
                __CLR4_4_1kldkldkylve3n2.R.inc(26712);try {
                    __CLR4_4_1kldkldkylve3n2.R.inc(26713);writerThreadExchanger.exchange(Thread.currentThread(), timeout, SECONDS);
                    __CLR4_4_1kldkldkylve3n2.R.inc(26714);outputStream.write("ABC".getBytes(StandardCharsets.UTF_8));
                } catch (final Exception e) {
                    __CLR4_4_1kldkldkylve3n2.R.inc(26715);Thread.interrupted(); //clear interrupt
                    __CLR4_4_1kldkldkylve3n2.R.inc(26716);exceptionExchanger.exchange(e, timeout, SECONDS);
                }
                __CLR4_4_1kldkldkylve3n2.R.inc(26717);return null;
            });

            __CLR4_4_1kldkldkylve3n2.R.inc(26718);final Exception exception = exceptionExchanger.exchange(null, timeout, SECONDS);
            __CLR4_4_1kldkldkylve3n2.R.inc(26719);assertNotNull(exception);
            __CLR4_4_1kldkldkylve3n2.R.inc(26720);assertEquals(exception.getClass(), InterruptedIOException.class);
        }
    }finally{__CLR4_4_1kldkldkylve3n2.R.flushNeeded();}}

    @Test
    public void writeString() throws Exception {__CLR4_4_1kldkldkylve3n2.R.globalSliceStart(getClass().getName(),26721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ov1ucpkm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kldkldkylve3n2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kldkldkylve3n2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.QueueOutputStreamTest.writeString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ov1ucpkm9() throws Exception{try{__CLR4_4_1kldkldkylve3n2.R.inc(26721);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kldkldkylve3n2.R.inc(26722);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1kldkldkylve3n2.R.inc(26723);}};final QueueOutputStream outputStream = new QueueOutputStream();
                __CLR4_4_1$AC1 __CLR$ACI3=new __CLR4_4_1$AC1(){{__CLR4_4_1kldkldkylve3n2.R.inc(26724);}};final QueueInputStream inputStream = outputStream.newQueueInputStream()) {
            __CLR4_4_1kldkldkylve3n2.R.inc(26725);outputStream.write("ABC".getBytes(UTF_8));
            __CLR4_4_1kldkldkylve3n2.R.inc(26726);final String value = IOUtils.toString(inputStream, UTF_8);
            __CLR4_4_1kldkldkylve3n2.R.inc(26727);assertEquals("ABC", value);
        }
    }finally{__CLR4_4_1kldkldkylve3n2.R.flushNeeded();}}

    @Test
    public void writeStringMultiThread() throws Exception {__CLR4_4_1kldkldkylve3n2.R.globalSliceStart(getClass().getName(),26728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xskejekmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kldkldkylve3n2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kldkldkylve3n2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.QueueOutputStreamTest.writeStringMultiThread",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xskejekmg() throws Exception{try{__CLR4_4_1kldkldkylve3n2.R.inc(26728);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kldkldkylve3n2.R.inc(26729);try (__CLR4_4_1$AC2 __CLR$ACI4=new __CLR4_4_1$AC2(){{__CLR4_4_1kldkldkylve3n2.R.inc(26730);}};final QueueOutputStream outputStream = callInThrowAwayThread(QueueOutputStream::new);
                __CLR4_4_1$AC2 __CLR$ACI5=new __CLR4_4_1$AC2(){{__CLR4_4_1kldkldkylve3n2.R.inc(26731);}};final QueueInputStream inputStream = callInThrowAwayThread(outputStream::newQueueInputStream)) {
            __CLR4_4_1kldkldkylve3n2.R.inc(26732);callInThrowAwayThread(() -> {
                __CLR4_4_1kldkldkylve3n2.R.inc(26733);outputStream.write("ABC".getBytes(UTF_8));
                __CLR4_4_1kldkldkylve3n2.R.inc(26734);return null;
            });

            __CLR4_4_1kldkldkylve3n2.R.inc(26735);final String value = callInThrowAwayThread(() -> IOUtils.toString(inputStream, UTF_8));
            __CLR4_4_1kldkldkylve3n2.R.inc(26736);assertEquals("ABC", value);
        }
    }finally{__CLR4_4_1kldkldkylve3n2.R.flushNeeded();}}
}
