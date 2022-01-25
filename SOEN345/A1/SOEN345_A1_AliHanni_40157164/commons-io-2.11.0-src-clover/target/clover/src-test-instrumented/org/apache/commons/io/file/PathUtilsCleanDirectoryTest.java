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

package org.apache.commons.io.file;

import static org.apache.commons.io.file.CounterAssertions.assertCounts;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link DeletingPathVisitor}.
 */
public class PathUtilsCleanDirectoryTest {static class __CLR4_4_1dlidlikylve27j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17641,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Path tempDir;

    @AfterEach
    public void afterEach() throws IOException {try{__CLR4_4_1dlidlikylve27j.R.inc(17622);
        // temp dir should still exist since we are cleaning and not deleting.
        __CLR4_4_1dlidlikylve27j.R.inc(17623);assertTrue(Files.exists(tempDir));
        // backstop
        __CLR4_4_1dlidlikylve27j.R.inc(17624);if ((((Files.exists(tempDir) && PathUtils.isEmptyDirectory(tempDir))&&(__CLR4_4_1dlidlikylve27j.R.iget(17625)!=0|true))||(__CLR4_4_1dlidlikylve27j.R.iget(17626)==0&false))) {{
            __CLR4_4_1dlidlikylve27j.R.inc(17627);Files.deleteIfExists(tempDir);
        }
    }}finally{__CLR4_4_1dlidlikylve27j.R.flushNeeded();}}

    @BeforeEach
    public void beforeEach() throws IOException {try{__CLR4_4_1dlidlikylve27j.R.inc(17628);
        __CLR4_4_1dlidlikylve27j.R.inc(17629);tempDir = Files.createTempDirectory(getClass().getCanonicalName());
    }finally{__CLR4_4_1dlidlikylve27j.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 0.
     */
    @Test
    public void testCleanDirectory1FileSize0() throws IOException {__CLR4_4_1dlidlikylve27j.R.globalSliceStart(getClass().getName(),17630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aymndtdlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dlidlikylve27j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dlidlikylve27j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsCleanDirectoryTest.testCleanDirectory1FileSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aymndtdlq() throws IOException{try{__CLR4_4_1dlidlikylve27j.R.inc(17630);
        __CLR4_4_1dlidlikylve27j.R.inc(17631);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-0"), tempDir);
        __CLR4_4_1dlidlikylve27j.R.inc(17632);assertCounts(1, 1, 0, PathUtils.cleanDirectory(tempDir));
    }finally{__CLR4_4_1dlidlikylve27j.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @Test
    public void testCleanDirectory1FileSize1() throws IOException {__CLR4_4_1dlidlikylve27j.R.globalSliceStart(getClass().getName(),17633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pmolcdlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dlidlikylve27j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dlidlikylve27j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsCleanDirectoryTest.testCleanDirectory1FileSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pmolcdlt() throws IOException{try{__CLR4_4_1dlidlikylve27j.R.inc(17633);
        __CLR4_4_1dlidlikylve27j.R.inc(17634);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1"), tempDir);
        __CLR4_4_1dlidlikylve27j.R.inc(17635);assertCounts(1, 1, 1, PathUtils.cleanDirectory(tempDir));
    }finally{__CLR4_4_1dlidlikylve27j.R.flushNeeded();}}

    /**
     * Tests a directory with two subdirectories, each containing one file of size 1.
     */
    @Test
    public void testCleanDirectory2FileSize2() throws IOException {__CLR4_4_1dlidlikylve27j.R.globalSliceStart(getClass().getName(),17636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19i58v4dlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dlidlikylve27j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dlidlikylve27j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsCleanDirectoryTest.testCleanDirectory2FileSize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19i58v4dlw() throws IOException{try{__CLR4_4_1dlidlikylve27j.R.inc(17636);
        __CLR4_4_1dlidlikylve27j.R.inc(17637);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-2-file-size-2"), tempDir);
        __CLR4_4_1dlidlikylve27j.R.inc(17638);assertCounts(3, 2, 2, PathUtils.cleanDirectory(tempDir));
    }finally{__CLR4_4_1dlidlikylve27j.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    @Test
    public void testCleanEmptyDirectory() throws IOException {__CLR4_4_1dlidlikylve27j.R.globalSliceStart(getClass().getName(),17639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fq139adlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dlidlikylve27j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dlidlikylve27j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsCleanDirectoryTest.testCleanEmptyDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fq139adlz() throws IOException{try{__CLR4_4_1dlidlikylve27j.R.inc(17639);
        __CLR4_4_1dlidlikylve27j.R.inc(17640);assertCounts(1, 0, 0, PathUtils.cleanDirectory(tempDir));
    }finally{__CLR4_4_1dlidlikylve27j.R.flushNeeded();}}
}