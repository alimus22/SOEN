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
package org.apache.commons.io.filefilter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

import org.apache.commons.io.file.AccumulatorPathVisitor;
import org.apache.commons.io.file.CounterAssertions;
import org.apache.commons.io.file.Counters;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link AgeFileFilter}.
 */
public class AgeFileFilterTest {static class __CLR4_4_1dy9dy9kylve2bp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,18110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Javadoc example.
     *
     * System.out calls are commented out here but not in the Javadoc.
     */
    @Test
    public void testJavadocExampleUsingIo() {__CLR4_4_1dy9dy9kylve2bp.R.globalSliceStart(getClass().getName(),18081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15x6zezdy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dy9dy9kylve2bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dy9dy9kylve2bp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.AgeFileFilterTest.testJavadocExampleUsingIo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15x6zezdy9(){try{__CLR4_4_1dy9dy9kylve2bp.R.inc(18081);
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18082);final File dir = new File(".");
        // We are interested in files older than one day
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18083);final long cutoffMillis = System.currentTimeMillis();
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18084);final String[] files = dir.list(new AgeFileFilter(cutoffMillis));
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18085);for (final String file : files) {{
            // System.out.println(files[i]);
        }
        // End of Javadoc example
        }__CLR4_4_1dy9dy9kylve2bp.R.inc(18086);assertTrue(files.length > 0);
    }finally{__CLR4_4_1dy9dy9kylve2bp.R.flushNeeded();}}

    /**
     * Javadoc example.
     *
     * System.out calls are commented out here but not in the Javadoc.
     */
    @Test
    public void testJavadocExampleUsingNio() throws IOException {__CLR4_4_1dy9dy9kylve2bp.R.globalSliceStart(getClass().getName(),18087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjnn99dyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dy9dy9kylve2bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dy9dy9kylve2bp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.AgeFileFilterTest.testJavadocExampleUsingNio",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjnn99dyf() throws IOException{try{__CLR4_4_1dy9dy9kylve2bp.R.inc(18087);
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18088);final Path dir = Paths.get("");
        // We are interested in files older than one day
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18089);final long cutoffMillis = System.currentTimeMillis();
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18090);final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(new AgeFileFilter(cutoffMillis),
            TrueFileFilter.INSTANCE);
        //
        // Walk one dir
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18091);Files.walkFileTree(dir, Collections.emptySet(), 1, visitor);
        // System.out.println(visitor.getPathCounters());
        // System.out.println(visitor.getFileList());
        //
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18092);visitor.getPathCounters().reset();
        //
        // Walk dir tree
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18093);Files.walkFileTree(dir, visitor);
        // System.out.println(visitor.getPathCounters());
        // System.out.println(visitor.getDirList());
        // System.out.println(visitor.getFileList());
        //
        // End of Javadoc example
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18094);assertTrue(visitor.getPathCounters().getFileCounter().get() > 0);
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18095);assertTrue(visitor.getPathCounters().getDirectoryCounter().get() > 0);
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18096);assertTrue(visitor.getPathCounters().getByteCounter().get() > 0);
        // We counted and accumulated
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18097);assertFalse(visitor.getDirList().isEmpty());
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18098);assertFalse(visitor.getFileList().isEmpty());
        //
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18099);assertNotEquals(Counters.noopPathCounters(), visitor.getPathCounters());
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18100);visitor.getPathCounters().reset();
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18101);CounterAssertions.assertZeroCounters(visitor.getPathCounters());
    }finally{__CLR4_4_1dy9dy9kylve2bp.R.flushNeeded();}}

    @Test
    public void testNoCounting() throws IOException {__CLR4_4_1dy9dy9kylve2bp.R.globalSliceStart(getClass().getName(),18102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4143xdyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dy9dy9kylve2bp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dy9dy9kylve2bp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.AgeFileFilterTest.testNoCounting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4143xdyu() throws IOException{try{__CLR4_4_1dy9dy9kylve2bp.R.inc(18102);
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18103);final Path dir = Paths.get("");
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18104);final long cutoffMillis = System.currentTimeMillis();
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18105);final AccumulatorPathVisitor visitor = new AccumulatorPathVisitor(Counters.noopPathCounters(),
            new AgeFileFilter(cutoffMillis), TrueFileFilter.INSTANCE);
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18106);Files.walkFileTree(dir, Collections.emptySet(), 1, visitor);
        //
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18107);CounterAssertions.assertZeroCounters(visitor.getPathCounters());
        // We did not count, but we still accumulated
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18108);assertFalse(visitor.getDirList().isEmpty());
        __CLR4_4_1dy9dy9kylve2bp.R.inc(18109);assertFalse(visitor.getFileList().isEmpty());
    }finally{__CLR4_4_1dy9dy9kylve2bp.R.flushNeeded();}}
}
