/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.io.serialization;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class WildcardClassNameMatcherTest {static class __CLR4_4_1l9yl9ykylve3sf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,27587,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void noPattern() {__CLR4_4_1l9yl9ykylve3sf.R.globalSliceStart(getClass().getName(),27574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfm3uel9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9yl9ykylve3sf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9yl9ykylve3sf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.WildcardClassNameMatcherTest.noPattern",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfm3uel9y(){try{__CLR4_4_1l9yl9ykylve3sf.R.inc(27574);
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27575);final ClassNameMatcher ca = new WildcardClassNameMatcher("org.foo");
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27576);assertTrue(ca.matches("org.foo"));
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27577);assertFalse(ca.matches("org.foo.and.more"));
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27578);assertFalse(ca.matches("org_foo"));
    }finally{__CLR4_4_1l9yl9ykylve3sf.R.flushNeeded();}}

    @Test
    public void star() {__CLR4_4_1l9yl9ykylve3sf.R.globalSliceStart(getClass().getName(),27579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pgyogpla3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9yl9ykylve3sf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9yl9ykylve3sf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.WildcardClassNameMatcherTest.star",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pgyogpla3(){try{__CLR4_4_1l9yl9ykylve3sf.R.inc(27579);
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27580);final ClassNameMatcher ca = new WildcardClassNameMatcher("org*");
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27581);assertTrue(ca.matches("org.foo.should.match"));
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27582);assertFalse(ca.matches("bar.should.not.match"));
    }finally{__CLR4_4_1l9yl9ykylve3sf.R.flushNeeded();}}

    @Test
    public void starAndQuestionMark() {__CLR4_4_1l9yl9ykylve3sf.R.globalSliceStart(getClass().getName(),27583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r272g1la7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l9yl9ykylve3sf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l9yl9ykylve3sf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.WildcardClassNameMatcherTest.starAndQuestionMark",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r272g1la7(){try{__CLR4_4_1l9yl9ykylve3sf.R.inc(27583);
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27584);final ClassNameMatcher ca = new WildcardClassNameMatcher("org?apache?something*");
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27585);assertTrue(ca.matches("org.apache_something.more"));
        __CLR4_4_1l9yl9ykylve3sf.R.inc(27586);assertFalse(ca.matches("org..apache_something.more"));
    }finally{__CLR4_4_1l9yl9ykylve3sf.R.flushNeeded();}}

}