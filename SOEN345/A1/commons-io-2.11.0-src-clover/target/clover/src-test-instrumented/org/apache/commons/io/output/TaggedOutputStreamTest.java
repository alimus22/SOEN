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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

import org.apache.commons.io.TaggedIOException;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link TaggedOutputStream}.
 */
public class TaggedOutputStreamTest  {static class __CLR4_4_1kovkovkylve3np{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testNormalStream() {__CLR4_4_1kovkovkylve3np.R.globalSliceStart(getClass().getName(),26815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aec940kov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kovkovkylve3np.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kovkovkylve3np.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TaggedOutputStreamTest.testNormalStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aec940kov(){try{__CLR4_4_1kovkovkylve3np.R.inc(26815);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kovkovkylve3np.R.inc(26816);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1kovkovkylve3np.R.inc(26817);}};final ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
            class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kovkovkylve3np.R.inc(26818);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1kovkovkylve3np.R.inc(26819);}};final OutputStream stream = new TaggedOutputStream(buffer)) {
                __CLR4_4_1kovkovkylve3np.R.inc(26820);stream.write('a');
                __CLR4_4_1kovkovkylve3np.R.inc(26821);stream.write(new byte[] { 'b' });
                __CLR4_4_1kovkovkylve3np.R.inc(26822);stream.write(new byte[] { 'c' }, 0, 1);
                __CLR4_4_1kovkovkylve3np.R.inc(26823);stream.flush();
            }
            __CLR4_4_1kovkovkylve3np.R.inc(26824);assertEquals(3, buffer.size());
            __CLR4_4_1kovkovkylve3np.R.inc(26825);assertEquals('a', buffer.toByteArray()[0]);
            __CLR4_4_1kovkovkylve3np.R.inc(26826);assertEquals('b', buffer.toByteArray()[1]);
            __CLR4_4_1kovkovkylve3np.R.inc(26827);assertEquals('c', buffer.toByteArray()[2]);
        } catch (final IOException e) {
            __CLR4_4_1kovkovkylve3np.R.inc(26828);fail("Unexpected exception thrown");
        }
    }finally{__CLR4_4_1kovkovkylve3np.R.flushNeeded();}}

    @Test
    public void testBrokenStream() {__CLR4_4_1kovkovkylve3np.R.globalSliceStart(getClass().getName(),26829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ux3xukp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kovkovkylve3np.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kovkovkylve3np.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TaggedOutputStreamTest.testBrokenStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ux3xukp9(){try{__CLR4_4_1kovkovkylve3np.R.inc(26829);
        __CLR4_4_1kovkovkylve3np.R.inc(26830);final IOException exception = new IOException("test exception");
        __CLR4_4_1kovkovkylve3np.R.inc(26831);final TaggedOutputStream stream =
            new TaggedOutputStream(new BrokenOutputStream(exception));

        // Test the write() method
        __CLR4_4_1kovkovkylve3np.R.inc(26832);try {
            __CLR4_4_1kovkovkylve3np.R.inc(26833);stream.write('x');
            __CLR4_4_1kovkovkylve3np.R.inc(26834);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1kovkovkylve3np.R.inc(26835);assertTrue(stream.isCauseOf(e));
            __CLR4_4_1kovkovkylve3np.R.inc(26836);try {
                __CLR4_4_1kovkovkylve3np.R.inc(26837);stream.throwIfCauseOf(e);
                __CLR4_4_1kovkovkylve3np.R.inc(26838);fail("Expected exception not thrown.");
            } catch (final IOException e2) {
                __CLR4_4_1kovkovkylve3np.R.inc(26839);assertEquals(exception, e2);
            }
        }

        // Test the flush() method
        __CLR4_4_1kovkovkylve3np.R.inc(26840);try {
            __CLR4_4_1kovkovkylve3np.R.inc(26841);stream.flush();
            __CLR4_4_1kovkovkylve3np.R.inc(26842);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1kovkovkylve3np.R.inc(26843);assertTrue(stream.isCauseOf(e));
            __CLR4_4_1kovkovkylve3np.R.inc(26844);try {
                __CLR4_4_1kovkovkylve3np.R.inc(26845);stream.throwIfCauseOf(e);
                __CLR4_4_1kovkovkylve3np.R.inc(26846);fail("Expected exception not thrown.");
            } catch (final IOException e2) {
                __CLR4_4_1kovkovkylve3np.R.inc(26847);assertEquals(exception, e2);
            }
        }

        // Test the close() method
        __CLR4_4_1kovkovkylve3np.R.inc(26848);try {
            __CLR4_4_1kovkovkylve3np.R.inc(26849);stream.close();
            __CLR4_4_1kovkovkylve3np.R.inc(26850);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1kovkovkylve3np.R.inc(26851);assertTrue(stream.isCauseOf(e));
            __CLR4_4_1kovkovkylve3np.R.inc(26852);try {
                __CLR4_4_1kovkovkylve3np.R.inc(26853);stream.throwIfCauseOf(e);
                __CLR4_4_1kovkovkylve3np.R.inc(26854);fail("Expected exception not thrown.");
            } catch (final IOException e2) {
                __CLR4_4_1kovkovkylve3np.R.inc(26855);assertEquals(exception, e2);
            }
        }
    }finally{__CLR4_4_1kovkovkylve3np.R.flushNeeded();}}

    @Test
    public void testOtherException() throws Exception {__CLR4_4_1kovkovkylve3np.R.globalSliceStart(getClass().getName(),26856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15a48zskq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kovkovkylve3np.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kovkovkylve3np.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TaggedOutputStreamTest.testOtherException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15a48zskq0() throws Exception{try{__CLR4_4_1kovkovkylve3np.R.inc(26856);
        __CLR4_4_1kovkovkylve3np.R.inc(26857);final IOException exception = new IOException("test exception");
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kovkovkylve3np.R.inc(26858);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1kovkovkylve3np.R.inc(26859);}};final TaggedOutputStream stream = new TaggedOutputStream(ClosedOutputStream.CLOSED_OUTPUT_STREAM)) {

            __CLR4_4_1kovkovkylve3np.R.inc(26860);assertFalse(stream.isCauseOf(exception));
            __CLR4_4_1kovkovkylve3np.R.inc(26861);assertFalse(stream.isCauseOf(new TaggedIOException(exception, UUID.randomUUID())));

            __CLR4_4_1kovkovkylve3np.R.inc(26862);try {
                __CLR4_4_1kovkovkylve3np.R.inc(26863);stream.throwIfCauseOf(exception);
            } catch (final IOException e) {
                __CLR4_4_1kovkovkylve3np.R.inc(26864);fail("Unexpected exception thrown");
            }

            __CLR4_4_1kovkovkylve3np.R.inc(26865);try {
                __CLR4_4_1kovkovkylve3np.R.inc(26866);stream.throwIfCauseOf(new TaggedIOException(exception, UUID.randomUUID()));
            } catch (final IOException e) {
                __CLR4_4_1kovkovkylve3np.R.inc(26867);fail("Unexpected exception thrown");
            }
        }
    }finally{__CLR4_4_1kovkovkylve3np.R.flushNeeded();}}

}
