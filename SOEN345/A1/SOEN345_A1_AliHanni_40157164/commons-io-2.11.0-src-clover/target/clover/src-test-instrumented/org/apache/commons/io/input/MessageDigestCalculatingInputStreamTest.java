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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class MessageDigestCalculatingInputStreamTest {static class __CLR4_4_1gxggxgkylve2wd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21957,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static byte[] generateRandomByteStream(final int pSize) {try{__CLR4_4_1gxggxgkylve2wd.R.inc(21940);
        __CLR4_4_1gxggxgkylve2wd.R.inc(21941);final byte[] buffer = new byte[pSize];
        __CLR4_4_1gxggxgkylve2wd.R.inc(21942);final Random rnd = new Random();
        __CLR4_4_1gxggxgkylve2wd.R.inc(21943);rnd.nextBytes(buffer);
        __CLR4_4_1gxggxgkylve2wd.R.inc(21944);return buffer;
    }finally{__CLR4_4_1gxggxgkylve2wd.R.flushNeeded();}}

    @Test
    public void test() throws Exception {__CLR4_4_1gxggxgkylve2wd.R.globalSliceStart(getClass().getName(),21945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3gxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gxggxgkylve2wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gxggxgkylve2wd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.MessageDigestCalculatingInputStreamTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3gxl() throws Exception{try{__CLR4_4_1gxggxgkylve2wd.R.inc(21945);
        __CLR4_4_1gxggxgkylve2wd.R.inc(21946);for (int i = 256;  (((i < 8192)&&(__CLR4_4_1gxggxgkylve2wd.R.iget(21947)!=0|true))||(__CLR4_4_1gxggxgkylve2wd.R.iget(21948)==0&false));  i = i*2) {{
            __CLR4_4_1gxggxgkylve2wd.R.inc(21949);final byte[] buffer = generateRandomByteStream(i);
            __CLR4_4_1gxggxgkylve2wd.R.inc(21950);final MessageDigest md5Sum = MessageDigest.getInstance("MD5");
            __CLR4_4_1gxggxgkylve2wd.R.inc(21951);final byte[] expect = md5Sum.digest(buffer);
            class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1gxggxgkylve2wd.R.inc(21952);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1gxggxgkylve2wd.R.inc(21953);}};final MessageDigestCalculatingInputStream md5InputStream =
                    new MessageDigestCalculatingInputStream(new ByteArrayInputStream(buffer))) {
                __CLR4_4_1gxggxgkylve2wd.R.inc(21954);md5InputStream.consume();
                __CLR4_4_1gxggxgkylve2wd.R.inc(21955);final byte[] got = md5InputStream.getMessageDigest().digest();
                __CLR4_4_1gxggxgkylve2wd.R.inc(21956);assertArrayEquals(expect, got);
            }
        }
    }}finally{__CLR4_4_1gxggxgkylve2wd.R.flushNeeded();}}

}