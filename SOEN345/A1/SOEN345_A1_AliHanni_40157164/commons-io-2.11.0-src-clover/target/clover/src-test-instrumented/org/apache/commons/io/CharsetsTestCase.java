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

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.SortedMap;

import org.junit.jupiter.api.Test;

/**
 * Tests {@link Charsets}.
 *
 */
@SuppressWarnings("deprecation") // testing deprecated code
public class CharsetsTestCase {static class __CLR4_4_17ms7mskylve0sb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,9917,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testRequiredCharsets() {__CLR4_4_17ms7mskylve0sb.R.globalSliceStart(getClass().getName(),9892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z1hnl7ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ms7mskylve0sb.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ms7mskylve0sb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CharsetsTestCase.testRequiredCharsets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z1hnl7ms(){try{__CLR4_4_17ms7mskylve0sb.R.inc(9892);
        __CLR4_4_17ms7mskylve0sb.R.inc(9893);final SortedMap<String, Charset> requiredCharsets = Charsets.requiredCharsets();
        // test for what we expect to be there as of Java 6
        // Make sure the object at the given key is the right one
        __CLR4_4_17ms7mskylve0sb.R.inc(9894);assertEquals(requiredCharsets.get("US-ASCII").name(), "US-ASCII");
        __CLR4_4_17ms7mskylve0sb.R.inc(9895);assertEquals(requiredCharsets.get("ISO-8859-1").name(), "ISO-8859-1");
        __CLR4_4_17ms7mskylve0sb.R.inc(9896);assertEquals(requiredCharsets.get("UTF-8").name(), "UTF-8");
        __CLR4_4_17ms7mskylve0sb.R.inc(9897);assertEquals(requiredCharsets.get("UTF-16").name(), "UTF-16");
        __CLR4_4_17ms7mskylve0sb.R.inc(9898);assertEquals(requiredCharsets.get("UTF-16BE").name(), "UTF-16BE");
        __CLR4_4_17ms7mskylve0sb.R.inc(9899);assertEquals(requiredCharsets.get("UTF-16LE").name(), "UTF-16LE");
    }finally{__CLR4_4_17ms7mskylve0sb.R.flushNeeded();}}

    @Test
    public void testIso8859_1() {__CLR4_4_17ms7mskylve0sb.R.globalSliceStart(getClass().getName(),9900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdctv47n0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ms7mskylve0sb.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ms7mskylve0sb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CharsetsTestCase.testIso8859_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdctv47n0(){try{__CLR4_4_17ms7mskylve0sb.R.inc(9900);
        __CLR4_4_17ms7mskylve0sb.R.inc(9901);assertEquals("ISO-8859-1", Charsets.ISO_8859_1.name());
    }finally{__CLR4_4_17ms7mskylve0sb.R.flushNeeded();}}

    @Test
    public void testToCharset() {__CLR4_4_17ms7mskylve0sb.R.globalSliceStart(getClass().getName(),9902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mih7ba7n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ms7mskylve0sb.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ms7mskylve0sb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CharsetsTestCase.testToCharset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mih7ba7n2(){try{__CLR4_4_17ms7mskylve0sb.R.inc(9902);
        __CLR4_4_17ms7mskylve0sb.R.inc(9903);assertEquals(Charset.defaultCharset(), Charsets.toCharset((String) null));
        __CLR4_4_17ms7mskylve0sb.R.inc(9904);assertEquals(Charset.defaultCharset(), Charsets.toCharset((Charset) null));
        __CLR4_4_17ms7mskylve0sb.R.inc(9905);assertEquals(Charset.defaultCharset(), Charsets.toCharset(Charset.defaultCharset()));
        __CLR4_4_17ms7mskylve0sb.R.inc(9906);assertEquals(StandardCharsets.UTF_8, Charsets.toCharset(StandardCharsets.UTF_8));
    }finally{__CLR4_4_17ms7mskylve0sb.R.flushNeeded();}}

    @Test
    public void testUsAscii() {__CLR4_4_17ms7mskylve0sb.R.globalSliceStart(getClass().getName(),9907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h3xk7c7n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ms7mskylve0sb.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ms7mskylve0sb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CharsetsTestCase.testUsAscii",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h3xk7c7n7(){try{__CLR4_4_17ms7mskylve0sb.R.inc(9907);
        __CLR4_4_17ms7mskylve0sb.R.inc(9908);assertEquals("US-ASCII", Charsets.US_ASCII.name());
    }finally{__CLR4_4_17ms7mskylve0sb.R.flushNeeded();}}

    @Test
    public void testUtf16() {__CLR4_4_17ms7mskylve0sb.R.globalSliceStart(getClass().getName(),9909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xmjkx7n9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ms7mskylve0sb.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ms7mskylve0sb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CharsetsTestCase.testUtf16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xmjkx7n9(){try{__CLR4_4_17ms7mskylve0sb.R.inc(9909);
        __CLR4_4_17ms7mskylve0sb.R.inc(9910);assertEquals("UTF-16", Charsets.UTF_16.name());
    }finally{__CLR4_4_17ms7mskylve0sb.R.flushNeeded();}}

    @Test
    public void testUtf16Be() {__CLR4_4_17ms7mskylve0sb.R.globalSliceStart(getClass().getName(),9911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7cv6k7nb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ms7mskylve0sb.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ms7mskylve0sb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CharsetsTestCase.testUtf16Be",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7cv6k7nb(){try{__CLR4_4_17ms7mskylve0sb.R.inc(9911);
        __CLR4_4_17ms7mskylve0sb.R.inc(9912);assertEquals("UTF-16BE", Charsets.UTF_16BE.name());
    }finally{__CLR4_4_17ms7mskylve0sb.R.flushNeeded();}}

    @Test
    public void testUtf16Le() {__CLR4_4_17ms7mskylve0sb.R.globalSliceStart(getClass().getName(),9913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g581nq7nd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ms7mskylve0sb.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ms7mskylve0sb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CharsetsTestCase.testUtf16Le",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g581nq7nd(){try{__CLR4_4_17ms7mskylve0sb.R.inc(9913);
        __CLR4_4_17ms7mskylve0sb.R.inc(9914);assertEquals("UTF-16LE", Charsets.UTF_16LE.name());
    }finally{__CLR4_4_17ms7mskylve0sb.R.flushNeeded();}}

    @Test
    public void testUtf8() {__CLR4_4_17ms7mskylve0sb.R.globalSliceStart(getClass().getName(),9915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yw0r9m7nf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17ms7mskylve0sb.R.rethrow($CLV_t2$);}finally{__CLR4_4_17ms7mskylve0sb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.CharsetsTestCase.testUtf8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yw0r9m7nf(){try{__CLR4_4_17ms7mskylve0sb.R.inc(9915);
        __CLR4_4_17ms7mskylve0sb.R.inc(9916);assertEquals("UTF-8", Charsets.UTF_8.name());
    }finally{__CLR4_4_17ms7mskylve0sb.R.flushNeeded();}}

}
