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
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.NullInputStream;
import org.junit.jupiter.api.Test;

/**
 *
 */
public class CountingOutputStreamTest {static class __CLR4_4_1jw0jw0kylve3iv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,25829,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCounting() throws IOException {__CLR4_4_1jw0jw0kylve3iv.R.globalSliceStart(getClass().getName(),25776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17bhlu4jw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jw0jw0kylve3iv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jw0jw0kylve3iv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.CountingOutputStreamTest.testCounting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17bhlu4jw0() throws IOException{try{__CLR4_4_1jw0jw0kylve3iv.R.inc(25776);
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25777);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1jw0jw0kylve3iv.R.inc(25778);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1jw0jw0kylve3iv.R.inc(25779);}};final CountingOutputStream cos = new CountingOutputStream(baos)) {

            __CLR4_4_1jw0jw0kylve3iv.R.inc(25780);for (int i = 0; (((i < 20)&&(__CLR4_4_1jw0jw0kylve3iv.R.iget(25781)!=0|true))||(__CLR4_4_1jw0jw0kylve3iv.R.iget(25782)==0&false)); i++) {{
                __CLR4_4_1jw0jw0kylve3iv.R.inc(25783);cos.write(i);
            }
            }__CLR4_4_1jw0jw0kylve3iv.R.inc(25784);assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 0, 20);
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25785);assertEquals(cos.getCount(), 20, "CountingOutputStream.getCount()");

            __CLR4_4_1jw0jw0kylve3iv.R.inc(25786);final byte[] array = new byte[10];
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25787);for (int i = 20; (((i < 30)&&(__CLR4_4_1jw0jw0kylve3iv.R.iget(25788)!=0|true))||(__CLR4_4_1jw0jw0kylve3iv.R.iget(25789)==0&false)); i++) {{
                __CLR4_4_1jw0jw0kylve3iv.R.inc(25790);array[i - 20] = (byte) i;
            }
            }__CLR4_4_1jw0jw0kylve3iv.R.inc(25791);cos.write(array);
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25792);assertByteArrayEquals("CountingOutputStream.write(byte[])", baos.toByteArray(), 0, 30);
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25793);assertEquals(cos.getCount(), 30, "CountingOutputStream.getCount()");

            __CLR4_4_1jw0jw0kylve3iv.R.inc(25794);for (int i = 25; (((i < 35)&&(__CLR4_4_1jw0jw0kylve3iv.R.iget(25795)!=0|true))||(__CLR4_4_1jw0jw0kylve3iv.R.iget(25796)==0&false)); i++) {{
                __CLR4_4_1jw0jw0kylve3iv.R.inc(25797);array[i - 25] = (byte) i;
            }
            }__CLR4_4_1jw0jw0kylve3iv.R.inc(25798);cos.write(array, 5, 5);
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25799);assertByteArrayEquals("CountingOutputStream.write(byte[], int, int)", baos.toByteArray(), 0, 35);
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25800);assertEquals(cos.getCount(), 35, "CountingOutputStream.getCount()");

            __CLR4_4_1jw0jw0kylve3iv.R.inc(25801);final int count = cos.resetCount();
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25802);assertEquals(count, 35, "CountingOutputStream.resetCount()");

            __CLR4_4_1jw0jw0kylve3iv.R.inc(25803);for (int i = 0; (((i < 10)&&(__CLR4_4_1jw0jw0kylve3iv.R.iget(25804)!=0|true))||(__CLR4_4_1jw0jw0kylve3iv.R.iget(25805)==0&false)); i++) {{
                __CLR4_4_1jw0jw0kylve3iv.R.inc(25806);cos.write(i);
            }
            }__CLR4_4_1jw0jw0kylve3iv.R.inc(25807);assertByteArrayEquals("CountingOutputStream.write(int)", baos.toByteArray(), 35, 45);
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25808);assertEquals(cos.getCount(), 10, "CountingOutputStream.getCount()");
        }
    }finally{__CLR4_4_1jw0jw0kylve3iv.R.flushNeeded();}}

    /*
     * Test for files > 2GB in size - see issue IO-84
     */
    @Test
    public void testLargeFiles_IO84() throws Exception {__CLR4_4_1jw0jw0kylve3iv.R.globalSliceStart(getClass().getName(),25809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekpc06jwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jw0jw0kylve3iv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jw0jw0kylve3iv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.CountingOutputStreamTest.testLargeFiles_IO84",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekpc06jwx() throws Exception{try{__CLR4_4_1jw0jw0kylve3iv.R.inc(25809);
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25810);final long size = (long) Integer.MAX_VALUE + (long) 1;

        __CLR4_4_1jw0jw0kylve3iv.R.inc(25811);final NullInputStream mock = new NullInputStream(size);
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25812);final CountingOutputStream cos = new CountingOutputStream(NullOutputStream.NULL_OUTPUT_STREAM);

        // Test integer methods
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25813);IOUtils.copyLarge(mock, cos);
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25814);try {
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25815);cos.getCount();
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25816);fail("Expected getCount() to throw an ArithmeticException");
        } catch (final ArithmeticException ae) {
            // expected result
        }
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25817);try {
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25818);cos.resetCount();
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25819);fail("Expected resetCount() to throw an ArithmeticException");
        } catch (final ArithmeticException ae) {
            // expected result
        }

        __CLR4_4_1jw0jw0kylve3iv.R.inc(25820);mock.close();

        // Test long methods
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25821);IOUtils.copyLarge(mock, cos);
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25822);assertEquals(size, cos.getByteCount(), "getByteCount()");
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25823);assertEquals(size, cos.resetByteCount(), "resetByteCount()");
    }finally{__CLR4_4_1jw0jw0kylve3iv.R.flushNeeded();}}

    private void assertByteArrayEquals(final String msg, final byte[] array, final int start, final int end) {try{__CLR4_4_1jw0jw0kylve3iv.R.inc(25824);
        __CLR4_4_1jw0jw0kylve3iv.R.inc(25825);for (int i = start; (((i < end)&&(__CLR4_4_1jw0jw0kylve3iv.R.iget(25826)!=0|true))||(__CLR4_4_1jw0jw0kylve3iv.R.iget(25827)==0&false)); i++) {{
            __CLR4_4_1jw0jw0kylve3iv.R.inc(25828);assertEquals(array[i], i-start, msg+": array[" + i + "] mismatch");
        }
    }}finally{__CLR4_4_1jw0jw0kylve3iv.R.flushNeeded();}}

}
