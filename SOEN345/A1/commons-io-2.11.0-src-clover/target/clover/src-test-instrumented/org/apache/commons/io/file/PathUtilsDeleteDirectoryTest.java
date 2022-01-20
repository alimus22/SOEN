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
public class PathUtilsDeleteDirectoryTest {static class __CLR4_4_1dpedpekylve28v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17792,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Path tempDir;

    @AfterEach
    public void afterEach() throws IOException {try{__CLR4_4_1dpedpekylve28v.R.inc(17762);
        // backstop
        __CLR4_4_1dpedpekylve28v.R.inc(17763);if ((((Files.exists(tempDir) && PathUtils.isEmptyDirectory(tempDir))&&(__CLR4_4_1dpedpekylve28v.R.iget(17764)!=0|true))||(__CLR4_4_1dpedpekylve28v.R.iget(17765)==0&false))) {{
            __CLR4_4_1dpedpekylve28v.R.inc(17766);Files.deleteIfExists(tempDir);
        }
    }}finally{__CLR4_4_1dpedpekylve28v.R.flushNeeded();}}

    @BeforeEach
    public void beforeEach() throws IOException {try{__CLR4_4_1dpedpekylve28v.R.inc(17767);
        __CLR4_4_1dpedpekylve28v.R.inc(17768);tempDir = Files.createTempDirectory(getClass().getCanonicalName());
    }finally{__CLR4_4_1dpedpekylve28v.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 0.
     */
    @Test
    public void testDeleteDirectory1FileSize0() throws IOException {__CLR4_4_1dpedpekylve28v.R.globalSliceStart(getClass().getName(),17769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ki0wm1dpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dpedpekylve28v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dpedpekylve28v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteDirectoryTest.testDeleteDirectory1FileSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ki0wm1dpl() throws IOException{try{__CLR4_4_1dpedpekylve28v.R.inc(17769);
        __CLR4_4_1dpedpekylve28v.R.inc(17770);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-0"), tempDir);
        __CLR4_4_1dpedpekylve28v.R.inc(17771);assertCounts(1, 1, 0, PathUtils.deleteDirectory(tempDir));
        // This will throw if not empty.
        __CLR4_4_1dpedpekylve28v.R.inc(17772);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dpedpekylve28v.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 0.
     */
    private void testDeleteDirectory1FileSize0(final DeleteOption... options) throws IOException {try{__CLR4_4_1dpedpekylve28v.R.inc(17773);
        // TODO Setup the test to use FileVisitOption.
        __CLR4_4_1dpedpekylve28v.R.inc(17774);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-0"), tempDir);
        __CLR4_4_1dpedpekylve28v.R.inc(17775);assertCounts(1, 1, 0, PathUtils.deleteDirectory(tempDir, options));
        // This will throw if not empty.
        __CLR4_4_1dpedpekylve28v.R.inc(17776);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dpedpekylve28v.R.flushNeeded();}}

    @Test
    public void testDeleteDirectory1FileSize0NoOptions() throws IOException {__CLR4_4_1dpedpekylve28v.R.globalSliceStart(getClass().getName(),17777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1139t3mdpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dpedpekylve28v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dpedpekylve28v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteDirectoryTest.testDeleteDirectory1FileSize0NoOptions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1139t3mdpt() throws IOException{try{__CLR4_4_1dpedpekylve28v.R.inc(17777);
        __CLR4_4_1dpedpekylve28v.R.inc(17778);testDeleteDirectory1FileSize0(PathUtils.EMPTY_DELETE_OPTION_ARRAY);
    }finally{__CLR4_4_1dpedpekylve28v.R.flushNeeded();}}

    @Test
    public void testDeleteDirectory1FileSize0OverrideReadOnly() throws IOException {__CLR4_4_1dpedpekylve28v.R.globalSliceStart(getClass().getName(),17779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zogu1dpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dpedpekylve28v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dpedpekylve28v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteDirectoryTest.testDeleteDirectory1FileSize0OverrideReadOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zogu1dpv() throws IOException{try{__CLR4_4_1dpedpekylve28v.R.inc(17779);
        __CLR4_4_1dpedpekylve28v.R.inc(17780);testDeleteDirectory1FileSize0(StandardDeleteOption.OVERRIDE_READ_ONLY);
    }finally{__CLR4_4_1dpedpekylve28v.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @Test
    public void testDeleteDirectory1FileSize1() throws IOException {__CLR4_4_1dpedpekylve28v.R.globalSliceStart(getClass().getName(),17781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nr0veidpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dpedpekylve28v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dpedpekylve28v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteDirectoryTest.testDeleteDirectory1FileSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nr0veidpx() throws IOException{try{__CLR4_4_1dpedpekylve28v.R.inc(17781);
        __CLR4_4_1dpedpekylve28v.R.inc(17782);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1"), tempDir);
        __CLR4_4_1dpedpekylve28v.R.inc(17783);assertCounts(1, 1, 1, PathUtils.deleteDirectory(tempDir));
        // This will throw if not empty.
        __CLR4_4_1dpedpekylve28v.R.inc(17784);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dpedpekylve28v.R.flushNeeded();}}

    /**
     * Tests a directory with two subdirectories, each containing one file of size 1.
     */
    @Test
    public void testDeleteDirectory2FileSize2() throws IOException {__CLR4_4_1dpedpekylve28v.R.globalSliceStart(getClass().getName(),17785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u2b946dq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dpedpekylve28v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dpedpekylve28v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteDirectoryTest.testDeleteDirectory2FileSize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u2b946dq1() throws IOException{try{__CLR4_4_1dpedpekylve28v.R.inc(17785);
        __CLR4_4_1dpedpekylve28v.R.inc(17786);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-2-file-size-2"), tempDir);
        __CLR4_4_1dpedpekylve28v.R.inc(17787);assertCounts(3, 2, 2, PathUtils.deleteDirectory(tempDir));
        // This will throw if not empty.
        __CLR4_4_1dpedpekylve28v.R.inc(17788);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dpedpekylve28v.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    @Test
    public void testDeleteEmptyDirectory() throws IOException {__CLR4_4_1dpedpekylve28v.R.globalSliceStart(getClass().getName(),17789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3bjwcdq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dpedpekylve28v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dpedpekylve28v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteDirectoryTest.testDeleteEmptyDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3bjwcdq5() throws IOException{try{__CLR4_4_1dpedpekylve28v.R.inc(17789);
        __CLR4_4_1dpedpekylve28v.R.inc(17790);assertCounts(1, 0, 0, PathUtils.deleteDirectory(tempDir));
        // This will throw if not empty.
        __CLR4_4_1dpedpekylve28v.R.inc(17791);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dpedpekylve28v.R.flushNeeded();}}
}
