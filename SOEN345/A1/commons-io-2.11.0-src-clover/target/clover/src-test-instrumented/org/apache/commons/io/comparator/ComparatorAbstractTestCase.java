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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Base Test case for Comparator implementations.
 */
public abstract class ComparatorAbstractTestCase {static class __CLR4_4_1d7yd7ykylve22j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File dir;

    /** comparator instance */
    protected AbstractFileComparator comparator;

    /** reverse comparator instance */
    protected Comparator<File> reverse;

    /** File which compares equal to  "equalFile2" */
    protected File equalFile1;

    /** File which compares equal to  "equalFile1" */
    protected File equalFile2;

    /** File which is less than the "moreFile" */
    protected File lessFile;

    /** File which is more than the "lessFile" */
    protected File moreFile;

    /**
     * Test the comparator.
     */
    @Test
    public void testComparator() {__CLR4_4_1d7yd7ykylve22j.R.globalSliceStart(getClass().getName(),17134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12yj641d7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7yd7ykylve22j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7yd7ykylve22j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.ComparatorAbstractTestCase.testComparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12yj641d7y(){try{__CLR4_4_1d7yd7ykylve22j.R.inc(17134);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17135);assertEquals(0, comparator.compare(equalFile1, equalFile2), "equal");
        __CLR4_4_1d7yd7ykylve22j.R.inc(17136);assertTrue(comparator.compare(lessFile, moreFile) < 0, "less");
        __CLR4_4_1d7yd7ykylve22j.R.inc(17137);assertTrue(comparator.compare(moreFile, lessFile) > 0, "more");
    }finally{__CLR4_4_1d7yd7ykylve22j.R.flushNeeded();}}

    /**
     * Test the comparator reversed.
     */
    @Test
    public void testReverseComparator() {__CLR4_4_1d7yd7ykylve22j.R.globalSliceStart(getClass().getName(),17138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rieoodd82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7yd7ykylve22j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7yd7ykylve22j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.ComparatorAbstractTestCase.testReverseComparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rieoodd82(){try{__CLR4_4_1d7yd7ykylve22j.R.inc(17138);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17139);assertEquals(0, reverse.compare(equalFile1, equalFile2), "equal");
        __CLR4_4_1d7yd7ykylve22j.R.inc(17140);assertTrue(reverse.compare(moreFile, lessFile) < 0, "less");
        __CLR4_4_1d7yd7ykylve22j.R.inc(17141);assertTrue(reverse.compare(lessFile, moreFile) > 0, "more");
    }finally{__CLR4_4_1d7yd7ykylve22j.R.flushNeeded();}}

    /**
     * Test comparator array sort is null safe.
     */
    @Test
    public void testSortArrayNull() {__CLR4_4_1d7yd7ykylve22j.R.globalSliceStart(getClass().getName(),17142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1deqh7td86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7yd7ykylve22j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7yd7ykylve22j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.ComparatorAbstractTestCase.testSortArrayNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1deqh7td86(){try{__CLR4_4_1d7yd7ykylve22j.R.inc(17142);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17143);assertNull(comparator.sort((File[])null));
    }finally{__CLR4_4_1d7yd7ykylve22j.R.flushNeeded();}}

    /**
     * Test the comparator array sort.
     */
    @Test
    public void testSortArray() {__CLR4_4_1d7yd7ykylve22j.R.globalSliceStart(getClass().getName(),17144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jr76dsd88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7yd7ykylve22j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7yd7ykylve22j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.ComparatorAbstractTestCase.testSortArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jr76dsd88(){try{__CLR4_4_1d7yd7ykylve22j.R.inc(17144);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17145);final File[] files = new File[3];
        __CLR4_4_1d7yd7ykylve22j.R.inc(17146);files[0] = equalFile1;
        __CLR4_4_1d7yd7ykylve22j.R.inc(17147);files[1] = moreFile;
        __CLR4_4_1d7yd7ykylve22j.R.inc(17148);files[2] = lessFile;
        __CLR4_4_1d7yd7ykylve22j.R.inc(17149);comparator.sort(files);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17150);assertSame(lessFile, files[0], "equal");
        __CLR4_4_1d7yd7ykylve22j.R.inc(17151);assertSame(equalFile1, files[1], "less");
        __CLR4_4_1d7yd7ykylve22j.R.inc(17152);assertSame(moreFile, files[2], "more");
    }finally{__CLR4_4_1d7yd7ykylve22j.R.flushNeeded();}}

    /**
     * Test the comparator array sort.
     */
    @Test
    public void testSortList() {__CLR4_4_1d7yd7ykylve22j.R.globalSliceStart(getClass().getName(),17153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fz8ga3d8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7yd7ykylve22j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7yd7ykylve22j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.ComparatorAbstractTestCase.testSortList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fz8ga3d8h(){try{__CLR4_4_1d7yd7ykylve22j.R.inc(17153);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17154);final List<File> files = new ArrayList<>();
        __CLR4_4_1d7yd7ykylve22j.R.inc(17155);files.add(equalFile1);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17156);files.add(moreFile);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17157);files.add(lessFile);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17158);comparator.sort(files);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17159);assertSame(lessFile, files.get(0), "equal");
        __CLR4_4_1d7yd7ykylve22j.R.inc(17160);assertSame(equalFile1, files.get(1), "less");
        __CLR4_4_1d7yd7ykylve22j.R.inc(17161);assertSame(moreFile, files.get(2), "more");
    }finally{__CLR4_4_1d7yd7ykylve22j.R.flushNeeded();}}

    /**
     * Test comparator list sort is null safe.
     */
    @Test
    public void testSortListNull() {__CLR4_4_1d7yd7ykylve22j.R.globalSliceStart(getClass().getName(),17162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2i3bwd8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7yd7ykylve22j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7yd7ykylve22j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.ComparatorAbstractTestCase.testSortListNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2i3bwd8q(){try{__CLR4_4_1d7yd7ykylve22j.R.inc(17162);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17163);assertNull(comparator.sort((List<File>)null));
    }finally{__CLR4_4_1d7yd7ykylve22j.R.flushNeeded();}}

    /**
     * Test comparator toString.
     */
    @Test
    public void testToString() {__CLR4_4_1d7yd7ykylve22j.R.globalSliceStart(getClass().getName(),17164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidd8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7yd7ykylve22j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7yd7ykylve22j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.ComparatorAbstractTestCase.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidd8s(){try{__CLR4_4_1d7yd7ykylve22j.R.inc(17164);
        __CLR4_4_1d7yd7ykylve22j.R.inc(17165);assertNotNull(comparator.toString(), "comparator");
        __CLR4_4_1d7yd7ykylve22j.R.inc(17166);assertTrue(reverse.toString().startsWith("ReverseFileComparator["), "reverse");
    }finally{__CLR4_4_1d7yd7ykylve22j.R.flushNeeded();}}
}
