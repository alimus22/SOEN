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
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.UUID;

import org.apache.commons.io.TaggedIOException;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link TaggedReader}.
 */
public class TaggedReaderTest {static class __CLR4_4_1hqthqtkylve33q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,23050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEmptyReader() throws IOException {__CLR4_4_1hqthqtkylve33q.R.globalSliceStart(getClass().getName(),22997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1quy7zvhqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqthqtkylve33q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqthqtkylve33q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TaggedReaderTest.testEmptyReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1quy7zvhqt() throws IOException{try{__CLR4_4_1hqthqtkylve33q.R.inc(22997);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hqthqtkylve33q.R.inc(22998);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1hqthqtkylve33q.R.inc(22999);}};final Reader reader = new TaggedReader(ClosedReader.CLOSED_READER)) {
            __CLR4_4_1hqthqtkylve33q.R.inc(23000);assertFalse(reader.ready());
            __CLR4_4_1hqthqtkylve33q.R.inc(23001);assertEquals(-1, reader.read());
            __CLR4_4_1hqthqtkylve33q.R.inc(23002);assertEquals(-1, reader.read(new char[1]));
            __CLR4_4_1hqthqtkylve33q.R.inc(23003);assertEquals(-1, reader.read(new char[1], 0, 1));
        }
    }finally{__CLR4_4_1hqthqtkylve33q.R.flushNeeded();}}

    @Test
    public void testNormalReader() throws IOException {__CLR4_4_1hqthqtkylve33q.R.globalSliceStart(getClass().getName(),23004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zben0dhr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqthqtkylve33q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqthqtkylve33q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TaggedReaderTest.testNormalReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zben0dhr0() throws IOException{try{__CLR4_4_1hqthqtkylve33q.R.inc(23004);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hqthqtkylve33q.R.inc(23005);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1hqthqtkylve33q.R.inc(23006);}};final Reader reader = new TaggedReader(new StringReader("abc"))) {
            __CLR4_4_1hqthqtkylve33q.R.inc(23007);assertTrue(reader.ready());
            __CLR4_4_1hqthqtkylve33q.R.inc(23008);assertEquals('a', reader.read());
            __CLR4_4_1hqthqtkylve33q.R.inc(23009);final char[] buffer = new char[1];
            __CLR4_4_1hqthqtkylve33q.R.inc(23010);assertEquals(1, reader.read(buffer));
            __CLR4_4_1hqthqtkylve33q.R.inc(23011);assertEquals('b', buffer[0]);
            __CLR4_4_1hqthqtkylve33q.R.inc(23012);assertEquals(1, reader.read(buffer, 0, 1));
            __CLR4_4_1hqthqtkylve33q.R.inc(23013);assertEquals('c', buffer[0]);
            __CLR4_4_1hqthqtkylve33q.R.inc(23014);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1hqthqtkylve33q.R.flushNeeded();}}

    @Test
    public void testBrokenReader() {__CLR4_4_1hqthqtkylve33q.R.globalSliceStart(getClass().getName(),23015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgg1wxhrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqthqtkylve33q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqthqtkylve33q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TaggedReaderTest.testBrokenReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgg1wxhrb(){try{__CLR4_4_1hqthqtkylve33q.R.inc(23015);
        __CLR4_4_1hqthqtkylve33q.R.inc(23016);final IOException exception = new IOException("test exception");
        __CLR4_4_1hqthqtkylve33q.R.inc(23017);final TaggedReader reader = new TaggedReader(new BrokenReader(exception));

        // Test the ready() method
        __CLR4_4_1hqthqtkylve33q.R.inc(23018);try {
            __CLR4_4_1hqthqtkylve33q.R.inc(23019);reader.ready();
            __CLR4_4_1hqthqtkylve33q.R.inc(23020);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1hqthqtkylve33q.R.inc(23021);assertTrue(reader.isCauseOf(e));
            __CLR4_4_1hqthqtkylve33q.R.inc(23022);try {
                __CLR4_4_1hqthqtkylve33q.R.inc(23023);reader.throwIfCauseOf(e);
                __CLR4_4_1hqthqtkylve33q.R.inc(23024);fail("Expected exception not thrown.");
            } catch (final IOException e2) {
                __CLR4_4_1hqthqtkylve33q.R.inc(23025);assertEquals(exception, e2);
            }
        }

        // Test the read() method
        __CLR4_4_1hqthqtkylve33q.R.inc(23026);try {
            __CLR4_4_1hqthqtkylve33q.R.inc(23027);reader.read();
            __CLR4_4_1hqthqtkylve33q.R.inc(23028);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1hqthqtkylve33q.R.inc(23029);assertTrue(reader.isCauseOf(e));
            __CLR4_4_1hqthqtkylve33q.R.inc(23030);try {
                __CLR4_4_1hqthqtkylve33q.R.inc(23031);reader.throwIfCauseOf(e);
                __CLR4_4_1hqthqtkylve33q.R.inc(23032);fail("Expected exception not thrown.");
            } catch (final IOException e2) {
                __CLR4_4_1hqthqtkylve33q.R.inc(23033);assertEquals(exception, e2);
            }
        }

        // Test the close() method
        __CLR4_4_1hqthqtkylve33q.R.inc(23034);try {
            __CLR4_4_1hqthqtkylve33q.R.inc(23035);reader.close();
            __CLR4_4_1hqthqtkylve33q.R.inc(23036);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1hqthqtkylve33q.R.inc(23037);assertTrue(reader.isCauseOf(e));
            __CLR4_4_1hqthqtkylve33q.R.inc(23038);try {
                __CLR4_4_1hqthqtkylve33q.R.inc(23039);reader.throwIfCauseOf(e);
                __CLR4_4_1hqthqtkylve33q.R.inc(23040);fail("Expected exception not thrown.");
            } catch (final IOException e2) {
                __CLR4_4_1hqthqtkylve33q.R.inc(23041);assertEquals(exception, e2);
            }
        }
    }finally{__CLR4_4_1hqthqtkylve33q.R.flushNeeded();}}

    @Test
    public void testOtherException() throws Exception {__CLR4_4_1hqthqtkylve33q.R.globalSliceStart(getClass().getName(),23042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15a48zshs2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqthqtkylve33q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqthqtkylve33q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TaggedReaderTest.testOtherException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15a48zshs2() throws Exception{try{__CLR4_4_1hqthqtkylve33q.R.inc(23042);
        __CLR4_4_1hqthqtkylve33q.R.inc(23043);final IOException exception = new IOException("test exception");
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hqthqtkylve33q.R.inc(23044);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1hqthqtkylve33q.R.inc(23045);}};final TaggedReader reader = new TaggedReader(ClosedReader.CLOSED_READER)) {

            __CLR4_4_1hqthqtkylve33q.R.inc(23046);assertFalse(reader.isCauseOf(exception));
            __CLR4_4_1hqthqtkylve33q.R.inc(23047);assertFalse(reader.isCauseOf(new TaggedIOException(exception, UUID.randomUUID())));

            __CLR4_4_1hqthqtkylve33q.R.inc(23048);reader.throwIfCauseOf(exception);

            __CLR4_4_1hqthqtkylve33q.R.inc(23049);reader.throwIfCauseOf(new TaggedIOException(exception, UUID.randomUUID()));
        }
    }finally{__CLR4_4_1hqthqtkylve33q.R.flushNeeded();}}

}
