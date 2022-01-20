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
package org.apache.commons.io.comparator;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link DirectoryFileComparator}.
 */
public class DirectoryFileComparatorTest extends ComparatorAbstractTestCase {static class __CLR4_4_1dajdajkylve238{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17237,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @BeforeEach
    public void setUp() {try{__CLR4_4_1dajdajkylve238.R.inc(17227);
        __CLR4_4_1dajdajkylve238.R.inc(17228);comparator = (AbstractFileComparator) DirectoryFileComparator.DIRECTORY_COMPARATOR;
        __CLR4_4_1dajdajkylve238.R.inc(17229);reverse = DirectoryFileComparator.DIRECTORY_REVERSE;
        __CLR4_4_1dajdajkylve238.R.inc(17230);final File currentDir = new File(".");
        __CLR4_4_1dajdajkylve238.R.inc(17231);equalFile1 = new File(currentDir, "src");
        __CLR4_4_1dajdajkylve238.R.inc(17232);equalFile2 = new File(currentDir, "src/site/xdoc");
        __CLR4_4_1dajdajkylve238.R.inc(17233);lessFile   = new File(currentDir, "src");
        __CLR4_4_1dajdajkylve238.R.inc(17234);moreFile   = new File(currentDir, "pom.xml");
    }finally{__CLR4_4_1dajdajkylve238.R.flushNeeded();}}

    /**
     * Test the comparator array sort.
     */
    @Override
    @Test
    public void testSortArray() {__CLR4_4_1dajdajkylve238.R.globalSliceStart(getClass().getName(),17235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jr76dsdar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dajdajkylve238.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dajdajkylve238.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.DirectoryFileComparatorTest.testSortArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jr76dsdar(){try{__CLR4_4_1dajdajkylve238.R.inc(17235);
        // skip sort test
    }finally{__CLR4_4_1dajdajkylve238.R.flushNeeded();}}

    /**
     * Test the comparator array sort.
     */
    @Override
    public void testSortList() {__CLR4_4_1dajdajkylve238.R.globalSliceStart(getClass().getName(),17236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fz8ga3das();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dajdajkylve238.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dajdajkylve238.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.DirectoryFileComparatorTest.testSortList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fz8ga3das(){try{__CLR4_4_1dajdajkylve238.R.inc(17236);
        // skip sort test
    }finally{__CLR4_4_1dajdajkylve238.R.flushNeeded();}}
}

