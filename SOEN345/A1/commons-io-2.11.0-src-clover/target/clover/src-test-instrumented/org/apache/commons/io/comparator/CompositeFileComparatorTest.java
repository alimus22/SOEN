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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.io.test.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link CompositeFileComparator}.
 */
public class CompositeFileComparatorTest extends ComparatorAbstractTestCase {static class __CLR4_4_1d8vd8vkylve22v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17220,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @BeforeEach
    public void setUp() throws Exception {try{__CLR4_4_1d8vd8vkylve22v.R.inc(17167);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17168);comparator = new CompositeFileComparator(
                (AbstractFileComparator) SizeFileComparator.SIZE_COMPARATOR, (AbstractFileComparator) ExtensionFileComparator.EXTENSION_COMPARATOR);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17169);reverse = new ReverseFileComparator(comparator);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17170);lessFile   = new File(dir, "xyz.txt");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17171);equalFile1 = new File(dir, "foo.txt");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17172);equalFile2 = new File(dir, "bar.txt");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17173);moreFile   = new File(dir, "foo.xyz");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17174);if ((((!lessFile.getParentFile().exists())&&(__CLR4_4_1d8vd8vkylve22v.R.iget(17175)!=0|true))||(__CLR4_4_1d8vd8vkylve22v.R.iget(17176)==0&false))) {{
            __CLR4_4_1d8vd8vkylve22v.R.inc(17177);throw new IOException("Cannot create file " + lessFile
                    + " as the parent directory does not exist");
        }

        }class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d8vd8vkylve22v.R.inc(17178);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1d8vd8vkylve22v.R.inc(17179);}};final BufferedOutputStream output3 =
                new BufferedOutputStream(Files.newOutputStream(lessFile.toPath()))) {
            __CLR4_4_1d8vd8vkylve22v.R.inc(17180);TestUtils.generateTestData(output3, 32);
        }
        __CLR4_4_1d8vd8vkylve22v.R.inc(17181);if ((((!equalFile1.getParentFile().exists())&&(__CLR4_4_1d8vd8vkylve22v.R.iget(17182)!=0|true))||(__CLR4_4_1d8vd8vkylve22v.R.iget(17183)==0&false))) {{
            __CLR4_4_1d8vd8vkylve22v.R.inc(17184);throw new IOException("Cannot create file " + equalFile1
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d8vd8vkylve22v.R.inc(17185);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1d8vd8vkylve22v.R.inc(17186);}};final BufferedOutputStream output2 =
                new BufferedOutputStream(Files.newOutputStream(equalFile1.toPath()))) {
            __CLR4_4_1d8vd8vkylve22v.R.inc(17187);TestUtils.generateTestData(output2, 48);
        }
        __CLR4_4_1d8vd8vkylve22v.R.inc(17188);if ((((!equalFile2.getParentFile().exists())&&(__CLR4_4_1d8vd8vkylve22v.R.iget(17189)!=0|true))||(__CLR4_4_1d8vd8vkylve22v.R.iget(17190)==0&false))) {{
            __CLR4_4_1d8vd8vkylve22v.R.inc(17191);throw new IOException("Cannot create file " + equalFile2
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d8vd8vkylve22v.R.inc(17192);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1d8vd8vkylve22v.R.inc(17193);}};final BufferedOutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(equalFile2.toPath()))) {
            __CLR4_4_1d8vd8vkylve22v.R.inc(17194);TestUtils.generateTestData(output1, 48);
        }
        __CLR4_4_1d8vd8vkylve22v.R.inc(17195);if ((((!moreFile.getParentFile().exists())&&(__CLR4_4_1d8vd8vkylve22v.R.iget(17196)!=0|true))||(__CLR4_4_1d8vd8vkylve22v.R.iget(17197)==0&false))) {{
            __CLR4_4_1d8vd8vkylve22v.R.inc(17198);throw new IOException("Cannot create file " + moreFile
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d8vd8vkylve22v.R.inc(17199);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1d8vd8vkylve22v.R.inc(17200);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(moreFile.toPath()))) {
            __CLR4_4_1d8vd8vkylve22v.R.inc(17201);TestUtils.generateTestData(output, 48);
        }
    }finally{__CLR4_4_1d8vd8vkylve22v.R.flushNeeded();}}

    /**
     * Test Constructor with null Iterable
     */
    @Test
    public void constructorIterable_order() {__CLR4_4_1d8vd8vkylve22v.R.globalSliceStart(getClass().getName(),17202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mchryad9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d8vd8vkylve22v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d8vd8vkylve22v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.CompositeFileComparatorTest.constructorIterable_order",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mchryad9u(){try{__CLR4_4_1d8vd8vkylve22v.R.inc(17202);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17203);final List<Comparator<File>> list = new ArrayList<>();
        __CLR4_4_1d8vd8vkylve22v.R.inc(17204);list.add(SizeFileComparator.SIZE_COMPARATOR);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17205);list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17206);final Comparator<File> c = new CompositeFileComparator(list);

        __CLR4_4_1d8vd8vkylve22v.R.inc(17207);assertEquals(0, c.compare(equalFile1, equalFile2), "equal");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17208);assertTrue(c.compare(lessFile, moreFile) < 0, "less");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17209);assertTrue(c.compare(moreFile, lessFile) > 0, "more");
    }finally{__CLR4_4_1d8vd8vkylve22v.R.flushNeeded();}}

    /**
     * Test Constructor with null Iterable
     */
    @Test
    public void constructorIterable_Null() {__CLR4_4_1d8vd8vkylve22v.R.globalSliceStart(getClass().getName(),17210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkb9flda2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d8vd8vkylve22v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d8vd8vkylve22v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.CompositeFileComparatorTest.constructorIterable_Null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkb9flda2(){try{__CLR4_4_1d8vd8vkylve22v.R.inc(17210);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17211);final Comparator<File> c = new CompositeFileComparator((Iterable<Comparator<File>>)null);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17212);assertEquals(0, c.compare(lessFile, moreFile), "less,more");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17213);assertEquals(0, c.compare(moreFile, lessFile), "more,less");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17214);assertEquals("CompositeFileComparator{}", c.toString(), "toString");
    }finally{__CLR4_4_1d8vd8vkylve22v.R.flushNeeded();}}

    /**
     * Test Constructor with null array
     */
    @Test
    public void constructorArray_Null() {__CLR4_4_1d8vd8vkylve22v.R.globalSliceStart(getClass().getName(),17215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bga9ceda7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d8vd8vkylve22v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d8vd8vkylve22v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.comparator.CompositeFileComparatorTest.constructorArray_Null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bga9ceda7(){try{__CLR4_4_1d8vd8vkylve22v.R.inc(17215);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17216);final Comparator<File> c = new CompositeFileComparator((Comparator<File>[])null);
        __CLR4_4_1d8vd8vkylve22v.R.inc(17217);assertEquals(0, c.compare(lessFile, moreFile), "less,more");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17218);assertEquals(0, c.compare(moreFile, lessFile), "more,less");
        __CLR4_4_1d8vd8vkylve22v.R.inc(17219);assertEquals("CompositeFileComparator{}", c.toString(), "toString");
    }finally{__CLR4_4_1d8vd8vkylve22v.R.flushNeeded();}}
}
