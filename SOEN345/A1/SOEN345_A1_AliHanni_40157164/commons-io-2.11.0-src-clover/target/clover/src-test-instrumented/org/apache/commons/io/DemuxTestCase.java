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
package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;

import org.apache.commons.io.input.DemuxInputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.DemuxOutputStream;
import org.apache.commons.io.test.TestUtils;
import org.junit.jupiter.api.Test;

/**
 * Basic unit tests for the multiplexing streams.
 */
public class DemuxTestCase {static class __CLR4_4_17pv7pvkylve0t0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,10083,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String T1 = "Thread1";
    private static final String T2 = "Thread2";
    private static final String T3 = "Thread3";
    private static final String T4 = "Thread4";

    private static final String DATA1 = "Data for thread1";
    private static final String DATA2 = "Data for thread2";
    private static final String DATA3 = "Data for thread3";
    private static final String DATA4 = "Data for thread4";

    private static final Random c_random = new Random();
    private final HashMap<String, ByteArrayOutputStream> outputMap = new HashMap<>();
    private final HashMap<String, Thread> threadMap = new HashMap<>();

    private String getOutput(final String threadName) {try{__CLR4_4_17pv7pvkylve0t0.R.inc(10003);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10004);final ByteArrayOutputStream output =
                outputMap.get(threadName);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10005);assertNotNull(output, "getOutput()");

        __CLR4_4_17pv7pvkylve0t0.R.inc(10006);return output.toString(StandardCharsets.UTF_8);
    }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

    private String getInput(final String threadName) {try{__CLR4_4_17pv7pvkylve0t0.R.inc(10007);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10008);final ReaderThread thread = (ReaderThread) threadMap.get(threadName);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10009);assertNotNull(thread, "getInput()");

        __CLR4_4_17pv7pvkylve0t0.R.inc(10010);return thread.getData();
    }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

    private void doStart() {try{__CLR4_4_17pv7pvkylve0t0.R.inc(10011);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10012);for (final String name : threadMap.keySet()) {{
            __CLR4_4_17pv7pvkylve0t0.R.inc(10013);final Thread thread = threadMap.get(name);
            __CLR4_4_17pv7pvkylve0t0.R.inc(10014);thread.start();
        }
    }}finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

    private void doJoin()
            throws Exception {try{__CLR4_4_17pv7pvkylve0t0.R.inc(10015);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10016);for (final String name : threadMap.keySet()) {{
            __CLR4_4_17pv7pvkylve0t0.R.inc(10017);final Thread thread = threadMap.get(name);
            __CLR4_4_17pv7pvkylve0t0.R.inc(10018);thread.join();
        }
    }}finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

    private void startWriter(final String name,
                             final String data,
                             final DemuxOutputStream demux) {try{__CLR4_4_17pv7pvkylve0t0.R.inc(10019);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10020);final ByteArrayOutputStream output = new ByteArrayOutputStream();
        __CLR4_4_17pv7pvkylve0t0.R.inc(10021);outputMap.put(name, output);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10022);final WriterThread thread =
                new WriterThread(name, data, output, demux);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10023);threadMap.put(name, thread);
    }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

    private void startReader(final String name,
                             final String data,
                             final DemuxInputStream demux) {try{__CLR4_4_17pv7pvkylve0t0.R.inc(10024);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10025);final ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
        __CLR4_4_17pv7pvkylve0t0.R.inc(10026);final ReaderThread thread = new ReaderThread(name, input, demux);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10027);threadMap.put(name, thread);
    }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

    @Test
    public void testOutputStream()
            throws Exception {__CLR4_4_17pv7pvkylve0t0.R.globalSliceStart(getClass().getName(),10028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swze627qk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17pv7pvkylve0t0.R.rethrow($CLV_t2$);}finally{__CLR4_4_17pv7pvkylve0t0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DemuxTestCase.testOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swze627qk() throws Exception{try{__CLR4_4_17pv7pvkylve0t0.R.inc(10028);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10029);final DemuxOutputStream output = new DemuxOutputStream();
        __CLR4_4_17pv7pvkylve0t0.R.inc(10030);startWriter(T1, DATA1, output);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10031);startWriter(T2, DATA2, output);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10032);startWriter(T3, DATA3, output);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10033);startWriter(T4, DATA4, output);

        __CLR4_4_17pv7pvkylve0t0.R.inc(10034);doStart();
        __CLR4_4_17pv7pvkylve0t0.R.inc(10035);doJoin();

        __CLR4_4_17pv7pvkylve0t0.R.inc(10036);assertEquals(DATA1, getOutput(T1), "Data1");
        __CLR4_4_17pv7pvkylve0t0.R.inc(10037);assertEquals(DATA2, getOutput(T2), "Data2");
        __CLR4_4_17pv7pvkylve0t0.R.inc(10038);assertEquals(DATA3, getOutput(T3), "Data3");
        __CLR4_4_17pv7pvkylve0t0.R.inc(10039);assertEquals(DATA4, getOutput(T4), "Data4");
    }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

    @Test
    public void testInputStream()
            throws Exception {__CLR4_4_17pv7pvkylve0t0.R.globalSliceStart(getClass().getName(),10040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qbzy97qw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17pv7pvkylve0t0.R.rethrow($CLV_t2$);}finally{__CLR4_4_17pv7pvkylve0t0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.DemuxTestCase.testInputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qbzy97qw() throws Exception{try{__CLR4_4_17pv7pvkylve0t0.R.inc(10040);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10041);final DemuxInputStream input = new DemuxInputStream();
        __CLR4_4_17pv7pvkylve0t0.R.inc(10042);startReader(T1, DATA1, input);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10043);startReader(T2, DATA2, input);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10044);startReader(T3, DATA3, input);
        __CLR4_4_17pv7pvkylve0t0.R.inc(10045);startReader(T4, DATA4, input);

        __CLR4_4_17pv7pvkylve0t0.R.inc(10046);doStart();
        __CLR4_4_17pv7pvkylve0t0.R.inc(10047);doJoin();

        __CLR4_4_17pv7pvkylve0t0.R.inc(10048);assertEquals(DATA1, getInput(T1), "Data1");
        __CLR4_4_17pv7pvkylve0t0.R.inc(10049);assertEquals(DATA2, getInput(T2), "Data2");
        __CLR4_4_17pv7pvkylve0t0.R.inc(10050);assertEquals(DATA3, getInput(T3), "Data3");
        __CLR4_4_17pv7pvkylve0t0.R.inc(10051);assertEquals(DATA4, getInput(T4), "Data4");
    }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

    private static class ReaderThread
            extends Thread {
        private final StringBuffer stringBuffer = new StringBuffer();
        private final InputStream inputStream;
        private final DemuxInputStream demuxInputStream;

        ReaderThread(final String name,
                     final InputStream input,
                     final DemuxInputStream demux) {
            super(name);__CLR4_4_17pv7pvkylve0t0.R.inc(10053);try{__CLR4_4_17pv7pvkylve0t0.R.inc(10052);
            __CLR4_4_17pv7pvkylve0t0.R.inc(10054);inputStream = input;
            __CLR4_4_17pv7pvkylve0t0.R.inc(10055);demuxInputStream = demux;
        }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

        public String getData() {try{__CLR4_4_17pv7pvkylve0t0.R.inc(10056);
            __CLR4_4_17pv7pvkylve0t0.R.inc(10057);return stringBuffer.toString();
        }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

        @Override
        public void run() {try{__CLR4_4_17pv7pvkylve0t0.R.inc(10058);
            __CLR4_4_17pv7pvkylve0t0.R.inc(10059);demuxInputStream.bindStream(inputStream);

            __CLR4_4_17pv7pvkylve0t0.R.inc(10060);try {
                __CLR4_4_17pv7pvkylve0t0.R.inc(10061);int ch = demuxInputStream.read();
                __CLR4_4_17pv7pvkylve0t0.R.inc(10062);while ((((-1 != ch)&&(__CLR4_4_17pv7pvkylve0t0.R.iget(10063)!=0|true))||(__CLR4_4_17pv7pvkylve0t0.R.iget(10064)==0&false))) {{
                    //System.out.println( "Reading: " + (char)ch );
                    __CLR4_4_17pv7pvkylve0t0.R.inc(10065);stringBuffer.append((char) ch);

                    __CLR4_4_17pv7pvkylve0t0.R.inc(10066);final int sleepTime = Math.abs(c_random.nextInt() % 10);
                    __CLR4_4_17pv7pvkylve0t0.R.inc(10067);TestUtils.sleep(sleepTime);
                    __CLR4_4_17pv7pvkylve0t0.R.inc(10068);ch = demuxInputStream.read();
                }
            }} catch (final Exception e) {
                __CLR4_4_17pv7pvkylve0t0.R.inc(10069);e.printStackTrace();
            }
        }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}
    }

    private static class WriterThread
            extends Thread {
        private final byte[] byteArray;
        private final OutputStream outputStream;
        private final DemuxOutputStream demuxOutputStream;

        WriterThread(final String name,
                     final String data,
                     final OutputStream output,
                     final DemuxOutputStream demux) {
            super(name);__CLR4_4_17pv7pvkylve0t0.R.inc(10071);try{__CLR4_4_17pv7pvkylve0t0.R.inc(10070);
            __CLR4_4_17pv7pvkylve0t0.R.inc(10072);outputStream = output;
            __CLR4_4_17pv7pvkylve0t0.R.inc(10073);demuxOutputStream = demux;
            __CLR4_4_17pv7pvkylve0t0.R.inc(10074);byteArray = data.getBytes();
        }finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}

        @Override
        public void run() {try{__CLR4_4_17pv7pvkylve0t0.R.inc(10075);
            __CLR4_4_17pv7pvkylve0t0.R.inc(10076);demuxOutputStream.bindStream(outputStream);
            __CLR4_4_17pv7pvkylve0t0.R.inc(10077);for (final byte element : byteArray) {{
                __CLR4_4_17pv7pvkylve0t0.R.inc(10078);try {
                    //System.out.println( "Writing: " + (char)byteArray[ i ] );
                    __CLR4_4_17pv7pvkylve0t0.R.inc(10079);demuxOutputStream.write(element);
                    __CLR4_4_17pv7pvkylve0t0.R.inc(10080);final int sleepTime = Math.abs(c_random.nextInt() % 10);
                    __CLR4_4_17pv7pvkylve0t0.R.inc(10081);TestUtils.sleep(sleepTime);
                } catch (final Exception e) {
                    __CLR4_4_17pv7pvkylve0t0.R.inc(10082);e.printStackTrace();
                }
            }
        }}finally{__CLR4_4_17pv7pvkylve0t0.R.flushNeeded();}}
    }
}

