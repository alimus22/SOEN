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
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.file.Counters.PathCounters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests {@link CountingPathVisitor}.
 */
public class CopyDirectoryVisitorTest extends TestArguments {static class __CLR4_4_1dgedgekylve258{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17456,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    private Path targetDir;

    @AfterEach
    public void afterEach() throws IOException {try{__CLR4_4_1dgedgekylve258.R.inc(17438);
        __CLR4_4_1dgedgekylve258.R.inc(17439);PathUtils.deleteDirectory(targetDir);
    }finally{__CLR4_4_1dgedgekylve258.R.flushNeeded();}}

    @BeforeEach
    public void beforeEach() throws IOException {try{__CLR4_4_1dgedgekylve258.R.inc(17440);
        __CLR4_4_1dgedgekylve258.R.inc(17441);targetDir = Files.createTempDirectory(getClass().getCanonicalName() + "-target");
    }finally{__CLR4_4_1dgedgekylve258.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    @ParameterizedTest
    @MethodSource("pathCounters")
    public void testCopyDirectoryEmptyFolder(final PathCounters pathCounters) throws IOException {__CLR4_4_1dgedgekylve258.R.globalSliceStart(getClass().getName(),17442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aatlogdgi(pathCounters);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dgedgekylve258.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dgedgekylve258.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CopyDirectoryVisitorTest.testCopyDirectoryEmptyFolder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aatlogdgi(final PathCounters pathCounters) throws IOException{try{__CLR4_4_1dgedgekylve258.R.inc(17442);
        __CLR4_4_1dgedgekylve258.R.inc(17443);final Path sourceDir = Files.createTempDirectory(getClass().getSimpleName());
        __CLR4_4_1dgedgekylve258.R.inc(17444);try {
            __CLR4_4_1dgedgekylve258.R.inc(17445);assertCounts(1, 0, 0,
                    PathUtils.visitFileTree(new CopyDirectoryVisitor(pathCounters, sourceDir, targetDir, StandardCopyOption.REPLACE_EXISTING), sourceDir));
        } finally {
            __CLR4_4_1dgedgekylve258.R.inc(17446);Files.deleteIfExists(sourceDir);
        }
    }finally{__CLR4_4_1dgedgekylve258.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 0.
     */
    @ParameterizedTest
    @MethodSource("pathCounters")
    public void testCopyDirectoryFolders1FileSize0(final PathCounters pathCounters) throws IOException {__CLR4_4_1dgedgekylve258.R.globalSliceStart(getClass().getName(),17447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkcmmsdgn(pathCounters);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dgedgekylve258.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dgedgekylve258.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CopyDirectoryVisitorTest.testCopyDirectoryFolders1FileSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkcmmsdgn(final PathCounters pathCounters) throws IOException{try{__CLR4_4_1dgedgekylve258.R.inc(17447);
        __CLR4_4_1dgedgekylve258.R.inc(17448);final Path sourceDir = Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-0");
        __CLR4_4_1dgedgekylve258.R.inc(17449);assertCounts(1, 1, 0, PathUtils.visitFileTree(
                new CopyDirectoryVisitor(pathCounters, sourceDir, targetDir, StandardCopyOption.REPLACE_EXISTING),
                sourceDir));
    }finally{__CLR4_4_1dgedgekylve258.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @ParameterizedTest
    @MethodSource("pathCounters")
    public void testCopyDirectoryFolders1FileSize1(final PathCounters pathCounters) throws IOException {__CLR4_4_1dgedgekylve258.R.globalSliceStart(getClass().getName(),17450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m51znxdgq(pathCounters);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dgedgekylve258.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dgedgekylve258.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CopyDirectoryVisitorTest.testCopyDirectoryFolders1FileSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m51znxdgq(final PathCounters pathCounters) throws IOException{try{__CLR4_4_1dgedgekylve258.R.inc(17450);
        __CLR4_4_1dgedgekylve258.R.inc(17451);final Path sourceDir = Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1");
        __CLR4_4_1dgedgekylve258.R.inc(17452);assertCounts(1, 1, 1, PathUtils.visitFileTree(
                new CopyDirectoryVisitor(pathCounters, sourceDir, targetDir, StandardCopyOption.REPLACE_EXISTING),
                sourceDir));
    }finally{__CLR4_4_1dgedgekylve258.R.flushNeeded();}}

    /**
     * Tests a directory with two subdirectories, each containing one file of size 1.
     */
    @ParameterizedTest
    @MethodSource("pathCounters")
    public void testCopyDirectoryFolders2FileSize2(final PathCounters pathCounters) throws IOException {__CLR4_4_1dgedgekylve258.R.globalSliceStart(getClass().getName(),17453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kziaz7dgt(pathCounters);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dgedgekylve258.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dgedgekylve258.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CopyDirectoryVisitorTest.testCopyDirectoryFolders2FileSize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kziaz7dgt(final PathCounters pathCounters) throws IOException{try{__CLR4_4_1dgedgekylve258.R.inc(17453);
        __CLR4_4_1dgedgekylve258.R.inc(17454);final Path sourceDir = Paths.get("src/test/resources/org/apache/commons/io/dirs-2-file-size-2");
        __CLR4_4_1dgedgekylve258.R.inc(17455);assertCounts(3, 2, 2, PathUtils.visitFileTree(
                new CopyDirectoryVisitor(pathCounters, sourceDir, targetDir, StandardCopyOption.REPLACE_EXISTING),
                sourceDir));
    }finally{__CLR4_4_1dgedgekylve258.R.flushNeeded();}}

}
