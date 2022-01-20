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

import org.apache.commons.io.file.Counters.PathCounters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests {@link DeletingPathVisitor}.
 */
public class CleaningPathVisitorTest extends TestArguments {static class __CLR4_4_1dfidfikylve24z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17438,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    private Path tempDir;

    @AfterEach
    public void afterEach() throws IOException {try{__CLR4_4_1dfidfikylve24z.R.inc(17406);
        // temp dir should still exist since we are cleaning and not deleting.
        __CLR4_4_1dfidfikylve24z.R.inc(17407);assertTrue(Files.exists(tempDir));
        // backstop
        __CLR4_4_1dfidfikylve24z.R.inc(17408);if ((((Files.exists(tempDir) && PathUtils.isEmptyDirectory(tempDir))&&(__CLR4_4_1dfidfikylve24z.R.iget(17409)!=0|true))||(__CLR4_4_1dfidfikylve24z.R.iget(17410)==0&false))) {{
            __CLR4_4_1dfidfikylve24z.R.inc(17411);Files.deleteIfExists(tempDir);
        }
    }}finally{__CLR4_4_1dfidfikylve24z.R.flushNeeded();}}

    private void applyCleanEmptyDirectory(final CleaningPathVisitor visitor) throws IOException {try{__CLR4_4_1dfidfikylve24z.R.inc(17412);
        __CLR4_4_1dfidfikylve24z.R.inc(17413);Files.walkFileTree(tempDir, visitor);
        __CLR4_4_1dfidfikylve24z.R.inc(17414);assertCounts(1, 0, 0, visitor);
    }finally{__CLR4_4_1dfidfikylve24z.R.flushNeeded();}}

    @BeforeEach
    public void beforeEach() throws IOException {try{__CLR4_4_1dfidfikylve24z.R.inc(17415);
        __CLR4_4_1dfidfikylve24z.R.inc(17416);tempDir = Files.createTempDirectory(getClass().getCanonicalName());
    }finally{__CLR4_4_1dfidfikylve24z.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    @ParameterizedTest
    @MethodSource("cleaningPathVisitors")
    public void testCleanEmptyDirectory(final CleaningPathVisitor visitor) throws IOException {__CLR4_4_1dfidfikylve24z.R.globalSliceStart(getClass().getName(),17417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jceyggdft(visitor);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dfidfikylve24z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dfidfikylve24z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CleaningPathVisitorTest.testCleanEmptyDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jceyggdft(final CleaningPathVisitor visitor) throws IOException{try{__CLR4_4_1dfidfikylve24z.R.inc(17417);
        __CLR4_4_1dfidfikylve24z.R.inc(17418);applyCleanEmptyDirectory(visitor);
    }finally{__CLR4_4_1dfidfikylve24z.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    @ParameterizedTest
    @MethodSource("pathCounters")
    public void testCleanEmptyDirectoryNullCtorArg(final PathCounters pathCounters) throws IOException {__CLR4_4_1dfidfikylve24z.R.globalSliceStart(getClass().getName(),17419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffl8kvdfv(pathCounters);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dfidfikylve24z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dfidfikylve24z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CleaningPathVisitorTest.testCleanEmptyDirectoryNullCtorArg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffl8kvdfv(final PathCounters pathCounters) throws IOException{try{__CLR4_4_1dfidfikylve24z.R.inc(17419);
        __CLR4_4_1dfidfikylve24z.R.inc(17420);applyCleanEmptyDirectory(new CleaningPathVisitor(pathCounters, (String[]) null));
    }finally{__CLR4_4_1dfidfikylve24z.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 0.
     */
    @ParameterizedTest
    @MethodSource("cleaningPathVisitors")
    public void testCleanFolders1FileSize0(final CleaningPathVisitor visitor) throws IOException {__CLR4_4_1dfidfikylve24z.R.globalSliceStart(getClass().getName(),17421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd52fddfx(visitor);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dfidfikylve24z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dfidfikylve24z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CleaningPathVisitorTest.testCleanFolders1FileSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd52fddfx(final CleaningPathVisitor visitor) throws IOException{try{__CLR4_4_1dfidfikylve24z.R.inc(17421);
        __CLR4_4_1dfidfikylve24z.R.inc(17422);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-0"), tempDir);
        __CLR4_4_1dfidfikylve24z.R.inc(17423);assertCounts(1, 1, 0, PathUtils.visitFileTree(visitor, tempDir));
    }finally{__CLR4_4_1dfidfikylve24z.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @ParameterizedTest
    @MethodSource("cleaningPathVisitors")
    public void testCleanFolders1FileSize1(final CleaningPathVisitor visitor) throws IOException {__CLR4_4_1dfidfikylve24z.R.globalSliceStart(getClass().getName(),17424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7beuudg0(visitor);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dfidfikylve24z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dfidfikylve24z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CleaningPathVisitorTest.testCleanFolders1FileSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7beuudg0(final CleaningPathVisitor visitor) throws IOException{try{__CLR4_4_1dfidfikylve24z.R.inc(17424);
        __CLR4_4_1dfidfikylve24z.R.inc(17425);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1"), tempDir);
        __CLR4_4_1dfidfikylve24z.R.inc(17426);assertCounts(1, 1, 1, PathUtils.visitFileTree(visitor, tempDir));
    }finally{__CLR4_4_1dfidfikylve24z.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1 but skip that file.
     */
    @ParameterizedTest
    @MethodSource("pathCounters")
    public void testCleanFolders1FileSize1Skip(final PathCounters pathCounters) throws IOException {__CLR4_4_1dfidfikylve24z.R.globalSliceStart(getClass().getName(),17427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17hyt8ldg3(pathCounters);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dfidfikylve24z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dfidfikylve24z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CleaningPathVisitorTest.testCleanFolders1FileSize1Skip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17hyt8ldg3(final PathCounters pathCounters) throws IOException{try{__CLR4_4_1dfidfikylve24z.R.inc(17427);
        __CLR4_4_1dfidfikylve24z.R.inc(17428);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1"), tempDir);
        __CLR4_4_1dfidfikylve24z.R.inc(17429);final String skipFileName = "file-size-1.bin";
        __CLR4_4_1dfidfikylve24z.R.inc(17430);final CountingPathVisitor visitor = new CleaningPathVisitor(pathCounters, skipFileName);
        __CLR4_4_1dfidfikylve24z.R.inc(17431);assertCounts(1, 1, 1, PathUtils.visitFileTree(visitor, tempDir));
        __CLR4_4_1dfidfikylve24z.R.inc(17432);final Path skippedFile = tempDir.resolve(skipFileName);
        __CLR4_4_1dfidfikylve24z.R.inc(17433);Assertions.assertTrue(Files.exists(skippedFile));
        __CLR4_4_1dfidfikylve24z.R.inc(17434);Files.delete(skippedFile);
    }finally{__CLR4_4_1dfidfikylve24z.R.flushNeeded();}}

    /**
     * Tests a directory with two subdirectories, each containing one file of size 1.
     */
    @ParameterizedTest
    @MethodSource("cleaningPathVisitors")
    public void testCleanFolders2FileSize2(final CleaningPathVisitor visitor) throws IOException {__CLR4_4_1dfidfikylve24z.R.globalSliceStart(getClass().getName(),17435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9gtgqdgb(visitor);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dfidfikylve24z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dfidfikylve24z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.CleaningPathVisitorTest.testCleanFolders2FileSize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9gtgqdgb(final CleaningPathVisitor visitor) throws IOException{try{__CLR4_4_1dfidfikylve24z.R.inc(17435);
        __CLR4_4_1dfidfikylve24z.R.inc(17436);PathUtils.copyDirectory(Paths.get("src/test/resources/org/apache/commons/io/dirs-2-file-size-2"), tempDir);
        __CLR4_4_1dfidfikylve24z.R.inc(17437);assertCounts(3, 2, 2, PathUtils.visitFileTree(visitor, tempDir));
    }finally{__CLR4_4_1dfidfikylve24z.R.flushNeeded();}}
}
