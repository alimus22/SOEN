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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.ObservableInputStream.Observer;
import org.apache.commons.io.output.NullOutputStream;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link ObservableInputStream}.
 */
public class ObservableInputStreamTest {static class __CLR4_4_1h4ih4ikylve2xp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22359,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class DataViewObserver extends MethodCountObserver {
        private byte[] buffer;
        private int lastValue = -1;
        private int length = -1;
        private int offset = -1;

        @Override
        public void data(final byte[] buffer, final int offset, final int length) throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22194);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22195);this.buffer = buffer;
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22196);this.offset = offset;
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22197);this.length = length;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        @Override
        public void data(final int value) throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22198);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22199);super.data(value);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22200);lastValue = value;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}
    }

    private static class LengthObserver extends Observer {
        private long total;

        @Override
        public void data(final byte[] buffer, final int offset, final int length) throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22201);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22202);this.total += length;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        @Override
        public void data(final int value) throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22203);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22204);total++;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        public long getTotal() {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22205);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22206);return total;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}
    }

    private static class MethodCountObserver extends Observer {
        private long closedCount;
        private long dataBufferCount;
        private long dataCount;
        private long errorCount;
        private long finishedCount;

        @Override
        public void closed() throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22207);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22208);closedCount++;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        @Override
        public void data(final byte[] buffer, final int offset, final int length) throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22209);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22210);dataBufferCount++;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        @Override
        public void data(final int value) throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22211);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22212);dataCount++;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        @Override
        public void error(final IOException exception) throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22213);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22214);errorCount++;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        @Override
        public void finished() throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22215);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22216);finishedCount++;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        public long getClosedCount() {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22217);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22218);return closedCount;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        public long getDataBufferCount() {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22219);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22220);return dataBufferCount;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        public long getDataCount() {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22221);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22222);return dataCount;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        public long getErrorCount() {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22223);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22224);return errorCount;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

        public long getFinishedCount() {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22225);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22226);return finishedCount;
        }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    }

    @Test
    public void testBrokenInputStreamRead() throws IOException {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hongsgh5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testBrokenInputStreamRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hongsgh5f() throws IOException{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22227);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22228);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22229);}};final ObservableInputStream ois = new ObservableInputStream(new BrokenInputStream())) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22230);assertThrows(IOException.class, () -> ois.read());
        }
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    @Test
    public void testBrokenInputStreamReadBuffer() throws IOException {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxw2n4h5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testBrokenInputStreamReadBuffer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxw2n4h5j() throws IOException{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22231);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22232);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22233);}};final ObservableInputStream ois = new ObservableInputStream(new BrokenInputStream())) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22234);assertThrows(IOException.class, () -> ois.read(new byte[1]));
        }
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    @Test
    public void testBrokenInputStreamReadSubBuffer() throws IOException {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqlx8yh5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testBrokenInputStreamReadSubBuffer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqlx8yh5n() throws IOException{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22235);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22236);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22237);}};final ObservableInputStream ois = new ObservableInputStream(new BrokenInputStream())) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22238);assertThrows(IOException.class, () -> ois.read(new byte[2], 0, 1));
        }
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    /**
     * Tests that {@link Observer#data(int)} is called.
     */
    @Test
    public void testDataByteCalled_add() throws Exception {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwcga2h5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testDataByteCalled_add",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwcga2h5r() throws Exception{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22239);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22240);final byte[] buffer = MessageDigestCalculatingInputStreamTest
            .generateRandomByteStream(IOUtils.DEFAULT_BUFFER_SIZE);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22241);final DataViewObserver lko = new DataViewObserver();
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22242);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22243);}};final ObservableInputStream ois = new ObservableInputStream(new ByteArrayInputStream(buffer))) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22244);assertEquals(-1, lko.lastValue);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22245);ois.read();
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22246);assertEquals(-1, lko.lastValue);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22247);assertEquals(0, lko.getFinishedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22248);assertEquals(0, lko.getClosedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22249);ois.add(lko);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22250);for (int i = 1; (((i < buffer.length)&&(__CLR4_4_1h4ih4ikylve2xp.R.iget(22251)!=0|true))||(__CLR4_4_1h4ih4ikylve2xp.R.iget(22252)==0&false)); i++) {{
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22253);final int result = ois.read();
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22254);assertEquals((byte) result, buffer[i]);
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22255);assertEquals(result, lko.lastValue);
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22256);assertEquals(0, lko.getFinishedCount());
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22257);assertEquals(0, lko.getClosedCount());
            }
            }__CLR4_4_1h4ih4ikylve2xp.R.inc(22258);final int result = ois.read();
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22259);assertEquals(-1, result);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22260);assertEquals(1, lko.getFinishedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22261);assertEquals(0, lko.getClosedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22262);ois.close();
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22263);assertEquals(1, lko.getFinishedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22264);assertEquals(1, lko.getClosedCount());
        }
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    /**
     * Tests that {@link Observer#data(int)} is called.
     */
    @Test
    public void testDataByteCalled_ctor() throws Exception {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aet309h6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testDataByteCalled_ctor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aet309h6h() throws Exception{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22265);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22266);final byte[] buffer = MessageDigestCalculatingInputStreamTest
            .generateRandomByteStream(IOUtils.DEFAULT_BUFFER_SIZE);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22267);final DataViewObserver lko = new DataViewObserver();
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22268);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22269);}};final ObservableInputStream ois = new ObservableInputStream(new ByteArrayInputStream(buffer), lko)) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22270);assertEquals(-1, lko.lastValue);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22271);ois.read();
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22272);assertNotEquals(-1, lko.lastValue);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22273);assertEquals(0, lko.getFinishedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22274);assertEquals(0, lko.getClosedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22275);for (int i = 1; (((i < buffer.length)&&(__CLR4_4_1h4ih4ikylve2xp.R.iget(22276)!=0|true))||(__CLR4_4_1h4ih4ikylve2xp.R.iget(22277)==0&false)); i++) {{
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22278);final int result = ois.read();
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22279);assertEquals((byte) result, buffer[i]);
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22280);assertEquals(result, lko.lastValue);
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22281);assertEquals(0, lko.getFinishedCount());
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22282);assertEquals(0, lko.getClosedCount());
            }
            }__CLR4_4_1h4ih4ikylve2xp.R.inc(22283);final int result = ois.read();
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22284);assertEquals(-1, result);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22285);assertEquals(1, lko.getFinishedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22286);assertEquals(0, lko.getClosedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22287);ois.close();
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22288);assertEquals(1, lko.getFinishedCount());
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22289);assertEquals(1, lko.getClosedCount());
        }
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    /**
     * Tests that {@link Observer#data(byte[],int,int)} is called.
     */
    @Test
    public void testDataBytesCalled() throws Exception {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4m63xh76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testDataBytesCalled",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4m63xh76() throws Exception{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22290);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22291);final byte[] buffer = MessageDigestCalculatingInputStreamTest
            .generateRandomByteStream(IOUtils.DEFAULT_BUFFER_SIZE);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22292);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22293);}};final ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
            __CLR4_4_1$AC5 __CLR$ACI6=new __CLR4_4_1$AC5(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22294);}};final ObservableInputStream ois = new ObservableInputStream(bais)) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22295);final DataViewObserver observer = new DataViewObserver();
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22296);final byte[] readBuffer = new byte[23];
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22297);assertNull(observer.buffer);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22298);ois.read(readBuffer);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22299);assertNull(observer.buffer);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22300);ois.add(observer);
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22301);for (;;) {{
                __CLR4_4_1h4ih4ikylve2xp.R.inc(22302);if ((((bais.available() >= 2048)&&(__CLR4_4_1h4ih4ikylve2xp.R.iget(22303)!=0|true))||(__CLR4_4_1h4ih4ikylve2xp.R.iget(22304)==0&false))) {{
                    __CLR4_4_1h4ih4ikylve2xp.R.inc(22305);final int result = ois.read(readBuffer);
                    __CLR4_4_1h4ih4ikylve2xp.R.inc(22306);if ((((result == -1)&&(__CLR4_4_1h4ih4ikylve2xp.R.iget(22307)!=0|true))||(__CLR4_4_1h4ih4ikylve2xp.R.iget(22308)==0&false))) {{
                        __CLR4_4_1h4ih4ikylve2xp.R.inc(22309);ois.close();
                        __CLR4_4_1h4ih4ikylve2xp.R.inc(22310);break;
                    }
                    }__CLR4_4_1h4ih4ikylve2xp.R.inc(22311);assertEquals(readBuffer, observer.buffer);
                    __CLR4_4_1h4ih4ikylve2xp.R.inc(22312);assertEquals(0, observer.offset);
                    __CLR4_4_1h4ih4ikylve2xp.R.inc(22313);assertEquals(readBuffer.length, observer.length);
                } }else {{
                    __CLR4_4_1h4ih4ikylve2xp.R.inc(22314);final int res = Math.min(11, bais.available());
                    __CLR4_4_1h4ih4ikylve2xp.R.inc(22315);final int result = ois.read(readBuffer, 1, 11);
                    __CLR4_4_1h4ih4ikylve2xp.R.inc(22316);if ((((result == -1)&&(__CLR4_4_1h4ih4ikylve2xp.R.iget(22317)!=0|true))||(__CLR4_4_1h4ih4ikylve2xp.R.iget(22318)==0&false))) {{
                        __CLR4_4_1h4ih4ikylve2xp.R.inc(22319);ois.close();
                        __CLR4_4_1h4ih4ikylve2xp.R.inc(22320);break;
                    }
                    }__CLR4_4_1h4ih4ikylve2xp.R.inc(22321);assertEquals(readBuffer, observer.buffer);
                    __CLR4_4_1h4ih4ikylve2xp.R.inc(22322);assertEquals(1, observer.offset);
                    __CLR4_4_1h4ih4ikylve2xp.R.inc(22323);assertEquals(res, observer.length);
                }
            }}
        }}
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    @Test
    public void testGetObservers0() throws IOException {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aofo2qh84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testGetObservers0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aofo2qh84() throws IOException{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22324);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22325);try (__CLR4_4_1$AC6 __CLR$ACI7=new __CLR4_4_1$AC6(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22326);}};final ObservableInputStream ois = new ObservableInputStream(new NullInputStream())) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22327);assertTrue(ois.getObservers().isEmpty());
        }
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    @Test
    public void testGetObservers1() throws IOException {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ffpa9h88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testGetObservers1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ffpa9h88() throws IOException{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22328);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22329);final DataViewObserver observer0 = new DataViewObserver();
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22330);try (__CLR4_4_1$AC7 __CLR$ACI8=new __CLR4_4_1$AC7(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22331);}};final ObservableInputStream ois = new ObservableInputStream(new NullInputStream(), observer0)) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22332);assertEquals(observer0, ois.getObservers().get(0));
        }
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    @Test
    public void testGetObserversOrder() throws IOException {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19n2z8kh8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testGetObserversOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19n2z8kh8d() throws IOException{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22333);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22334);final DataViewObserver observer0 = new DataViewObserver();
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22335);final DataViewObserver observer1 = new DataViewObserver();
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22336);try (__CLR4_4_1$AC8 __CLR$ACI9=new __CLR4_4_1$AC8(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22337);}};final ObservableInputStream ois = new ObservableInputStream(new NullInputStream(), observer0, observer1)) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22338);assertEquals(observer0, ois.getObservers().get(0));
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22339);assertEquals(observer1, ois.getObservers().get(1));
        }
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    private void testNotificationCallbacks(final int bufferSize) throws IOException {try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22340);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22341);final byte[] buffer = IOUtils.byteArray();
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22342);final LengthObserver lengthObserver = new LengthObserver();
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22343);final MethodCountObserver methodCountObserver = new MethodCountObserver();
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1h4ih4ikylve2xp.R.inc(22344);try (__CLR4_4_1$AC9 __CLR$ACI10=new __CLR4_4_1$AC9(){{__CLR4_4_1h4ih4ikylve2xp.R.inc(22345);}};final ObservableInputStream ois = new ObservableInputStream(new ByteArrayInputStream(buffer),
            lengthObserver, methodCountObserver)) {
            __CLR4_4_1h4ih4ikylve2xp.R.inc(22346);assertEquals(IOUtils.DEFAULT_BUFFER_SIZE,
                IOUtils.copy(ois, NullOutputStream.NULL_OUTPUT_STREAM, bufferSize));
        }
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22347);assertEquals(IOUtils.DEFAULT_BUFFER_SIZE, lengthObserver.getTotal());
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22348);assertEquals(1, methodCountObserver.getClosedCount());
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22349);assertEquals(1, methodCountObserver.getFinishedCount());
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22350);assertEquals(0, methodCountObserver.getErrorCount());
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22351);assertEquals(0, methodCountObserver.getDataCount());
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22352);assertEquals(buffer.length / bufferSize, methodCountObserver.getDataBufferCount());
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    @Test
    public void testNotificationCallbacksBufferSize1() throws Exception {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yukkpyh8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testNotificationCallbacksBufferSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yukkpyh8x() throws Exception{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22353);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22354);testNotificationCallbacks(1);
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    @Test
    public void testNotificationCallbacksBufferSize2() throws Exception {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxjigph8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testNotificationCallbacksBufferSize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxjigph8z() throws Exception{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22355);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22356);testNotificationCallbacks(2);
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}

    @Test
    public void testNotificationCallbacksBufferSizeDefault() throws Exception {__CLR4_4_1h4ih4ikylve2xp.R.globalSliceStart(getClass().getName(),22357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jpnwieh91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h4ih4ikylve2xp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h4ih4ikylve2xp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ObservableInputStreamTest.testNotificationCallbacksBufferSizeDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jpnwieh91() throws Exception{try{__CLR4_4_1h4ih4ikylve2xp.R.inc(22357);
        __CLR4_4_1h4ih4ikylve2xp.R.inc(22358);testNotificationCallbacks(IOUtils.DEFAULT_BUFFER_SIZE);
    }finally{__CLR4_4_1h4ih4ikylve2xp.R.flushNeeded();}}
}
