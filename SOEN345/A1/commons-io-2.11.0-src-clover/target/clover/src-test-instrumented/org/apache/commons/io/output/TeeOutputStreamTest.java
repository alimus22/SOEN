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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.test.ThrowOnCloseOutputStream;
import org.junit.jupiter.api.Test;

/**On
 * JUnit Test Case for {@link TeeOutputStream}.
 */
public class TeeOutputStreamTest {static class __CLR4_4_1krtkrtkylve3oc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26976,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Tests that the branch {@code OutputStream} is closed when closing the main {@code OutputStream} throws an
     * exception on {@link TeeOutputStream#close()}.
     */
    @Test
    public void testIOExceptionOnCloseBranch() throws IOException {__CLR4_4_1krtkrtkylve3oc.R.globalSliceStart(getClass().getName(),26921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9d84rkrt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1krtkrtkylve3oc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1krtkrtkylve3oc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeOutputStreamTest.testIOExceptionOnCloseBranch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9d84rkrt() throws IOException{try{__CLR4_4_1krtkrtkylve3oc.R.inc(26921);
        __CLR4_4_1krtkrtkylve3oc.R.inc(26922);final OutputStream badOs = new ThrowOnCloseOutputStream();
        __CLR4_4_1krtkrtkylve3oc.R.inc(26923);final ByteArrayOutputStream goodOs = mock(ByteArrayOutputStream.class);
        __CLR4_4_1krtkrtkylve3oc.R.inc(26924);final TeeOutputStream tos = new TeeOutputStream(goodOs, badOs);
        __CLR4_4_1krtkrtkylve3oc.R.inc(26925);try {
            __CLR4_4_1krtkrtkylve3oc.R.inc(26926);tos.close();
            __CLR4_4_1krtkrtkylve3oc.R.inc(26927);fail("Expected " + IOException.class.getName());
        } catch (final IOException e) {
            __CLR4_4_1krtkrtkylve3oc.R.inc(26928);verify(goodOs).close();
        }
    }finally{__CLR4_4_1krtkrtkylve3oc.R.flushNeeded();}}

    /**
     * Tests that the main {@code OutputStream} is closed when closing the branch {@code OutputStream} throws an
     * exception on {@link TeeOutputStream#close()}.
     */
    @Test
    public void testIOExceptionOnClose() throws IOException {__CLR4_4_1krtkrtkylve3oc.R.globalSliceStart(getClass().getName(),26929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14culplks1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1krtkrtkylve3oc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1krtkrtkylve3oc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeOutputStreamTest.testIOExceptionOnClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14culplks1() throws IOException{try{__CLR4_4_1krtkrtkylve3oc.R.inc(26929);
        __CLR4_4_1krtkrtkylve3oc.R.inc(26930);final OutputStream badOs = new ThrowOnCloseOutputStream();
        __CLR4_4_1krtkrtkylve3oc.R.inc(26931);final ByteArrayOutputStream goodOs = mock(ByteArrayOutputStream.class);
        __CLR4_4_1krtkrtkylve3oc.R.inc(26932);final TeeOutputStream tos = new TeeOutputStream(badOs, goodOs);
        __CLR4_4_1krtkrtkylve3oc.R.inc(26933);try {
            __CLR4_4_1krtkrtkylve3oc.R.inc(26934);tos.close();
            __CLR4_4_1krtkrtkylve3oc.R.inc(26935);fail("Expected " + IOException.class.getName());
        } catch (final IOException e) {
            __CLR4_4_1krtkrtkylve3oc.R.inc(26936);verify(goodOs).close();
        }
    }finally{__CLR4_4_1krtkrtkylve3oc.R.flushNeeded();}}

    @Test
    public void testTee() throws IOException {__CLR4_4_1krtkrtkylve3oc.R.globalSliceStart(getClass().getName(),26937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8kyztks9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1krtkrtkylve3oc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1krtkrtkylve3oc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TeeOutputStreamTest.testTee",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8kyztks9() throws IOException{try{__CLR4_4_1krtkrtkylve3oc.R.inc(26937);
        __CLR4_4_1krtkrtkylve3oc.R.inc(26938);final ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        __CLR4_4_1krtkrtkylve3oc.R.inc(26939);final ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        __CLR4_4_1krtkrtkylve3oc.R.inc(26940);final ByteArrayOutputStream expected = new ByteArrayOutputStream();

        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1krtkrtkylve3oc.R.inc(26941);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1krtkrtkylve3oc.R.inc(26942);}};final TeeOutputStream tos = new TeeOutputStream(baos1, baos2)) {
            __CLR4_4_1krtkrtkylve3oc.R.inc(26943);for (int i = 0; (((i < 20)&&(__CLR4_4_1krtkrtkylve3oc.R.iget(26944)!=0|true))||(__CLR4_4_1krtkrtkylve3oc.R.iget(26945)==0&false)); i++) {{
                __CLR4_4_1krtkrtkylve3oc.R.inc(26946);tos.write(i);
                __CLR4_4_1krtkrtkylve3oc.R.inc(26947);expected.write(i);
            }
            }__CLR4_4_1krtkrtkylve3oc.R.inc(26948);assertByteArrayEquals("TeeOutputStream.write(int)", expected.toByteArray(), baos1.toByteArray());
            __CLR4_4_1krtkrtkylve3oc.R.inc(26949);assertByteArrayEquals("TeeOutputStream.write(int)", expected.toByteArray(), baos2.toByteArray());

            __CLR4_4_1krtkrtkylve3oc.R.inc(26950);final byte[] array = new byte[10];
            __CLR4_4_1krtkrtkylve3oc.R.inc(26951);for (int i = 20; (((i < 30)&&(__CLR4_4_1krtkrtkylve3oc.R.iget(26952)!=0|true))||(__CLR4_4_1krtkrtkylve3oc.R.iget(26953)==0&false)); i++) {{
                __CLR4_4_1krtkrtkylve3oc.R.inc(26954);array[i - 20] = (byte) i;
            }
            }__CLR4_4_1krtkrtkylve3oc.R.inc(26955);tos.write(array);
            __CLR4_4_1krtkrtkylve3oc.R.inc(26956);expected.write(array);
            __CLR4_4_1krtkrtkylve3oc.R.inc(26957);assertByteArrayEquals("TeeOutputStream.write(byte[])", expected.toByteArray(), baos1.toByteArray());
            __CLR4_4_1krtkrtkylve3oc.R.inc(26958);assertByteArrayEquals("TeeOutputStream.write(byte[])", expected.toByteArray(), baos2.toByteArray());

            __CLR4_4_1krtkrtkylve3oc.R.inc(26959);for (int i = 25; (((i < 35)&&(__CLR4_4_1krtkrtkylve3oc.R.iget(26960)!=0|true))||(__CLR4_4_1krtkrtkylve3oc.R.iget(26961)==0&false)); i++) {{
                __CLR4_4_1krtkrtkylve3oc.R.inc(26962);array[i - 25] = (byte) i;
            }
            }__CLR4_4_1krtkrtkylve3oc.R.inc(26963);tos.write(array, 5, 5);
            __CLR4_4_1krtkrtkylve3oc.R.inc(26964);expected.write(array, 5, 5);
            __CLR4_4_1krtkrtkylve3oc.R.inc(26965);assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", expected.toByteArray(),
                    baos1.toByteArray());
            __CLR4_4_1krtkrtkylve3oc.R.inc(26966);assertByteArrayEquals("TeeOutputStream.write(byte[], int, int)", expected.toByteArray(),
                    baos2.toByteArray());

            __CLR4_4_1krtkrtkylve3oc.R.inc(26967);expected.flush();
            __CLR4_4_1krtkrtkylve3oc.R.inc(26968);expected.close();

            __CLR4_4_1krtkrtkylve3oc.R.inc(26969);tos.flush();
        }
    }finally{__CLR4_4_1krtkrtkylve3oc.R.flushNeeded();}}

    private void assertByteArrayEquals(final String msg, final byte[] array1, final byte[] array2) {try{__CLR4_4_1krtkrtkylve3oc.R.inc(26970);
        __CLR4_4_1krtkrtkylve3oc.R.inc(26971);assertEquals(array1.length, array2.length, msg + ": array size mismatch");
        __CLR4_4_1krtkrtkylve3oc.R.inc(26972);for (int i = 0; (((i < array1.length)&&(__CLR4_4_1krtkrtkylve3oc.R.iget(26973)!=0|true))||(__CLR4_4_1krtkrtkylve3oc.R.iget(26974)==0&false)); i++) {{
            __CLR4_4_1krtkrtkylve3oc.R.inc(26975);assertEquals(array1[i], array2[i], msg + ": array[ " + i + "] mismatch");
        }
    }}finally{__CLR4_4_1krtkrtkylve3oc.R.flushNeeded();}}

}
