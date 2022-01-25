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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.PathVisitorFileFilter;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests both {@link AccumulatorPathVisitor} and {@link PathVisitorFileFilter}.
 */
public class AccumulatorPathVisitorTest {static class __CLR4_4_1dendenkylve24n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17406,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    static Stream<Arguments> testParameters() {try{__CLR4_4_1dendenkylve24n.R.inc(17375);
        // @formatter:off
        __CLR4_4_1dendenkylve24n.R.inc(17376);return Stream.of(
            Arguments.of((Supplier<AccumulatorPathVisitor>) AccumulatorPathVisitor::withLongCounters),
            Arguments.of((Supplier<AccumulatorPathVisitor>) AccumulatorPathVisitor::withBigIntegerCounters));
        // @formatter:on
    }finally{__CLR4_4_1dendenkylve24n.R.flushNeeded();}}

    @TempDir
    File tempDirFile;

    /**
     * Tests an empty folder.
     */
    @ParameterizedTest
    @MethodSource("testParameters")
    public void testEmptyFolder(final Supplier<AccumulatorPathVisitor> supplier) throws IOException {__CLR4_4_1dendenkylve24n.R.globalSliceStart(getClass().getName(),17377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19c75qddep(supplier);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dendenkylve24n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dendenkylve24n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.AccumulatorPathVisitorTest.testEmptyFolder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19c75qddep(final Supplier<AccumulatorPathVisitor> supplier) throws IOException{try{__CLR4_4_1dendenkylve24n.R.inc(17377);
        __CLR4_4_1dendenkylve24n.R.inc(17378);final Path tempDir = tempDirFile.toPath();
        __CLR4_4_1dendenkylve24n.R.inc(17379);final AccumulatorPathVisitor accPathVisitor = supplier.get();
        __CLR4_4_1dendenkylve24n.R.inc(17380);final PathVisitorFileFilter countingFileFilter = new PathVisitorFileFilter(accPathVisitor);
        __CLR4_4_1dendenkylve24n.R.inc(17381);Files.walkFileTree(tempDir,
            new AndFileFilter(countingFileFilter, DirectoryFileFilter.INSTANCE, EmptyFileFilter.EMPTY));
        __CLR4_4_1dendenkylve24n.R.inc(17382);assertCounts(1, 0, 0, accPathVisitor.getPathCounters());
        __CLR4_4_1dendenkylve24n.R.inc(17383);assertEquals(1, accPathVisitor.getDirList().size());
        __CLR4_4_1dendenkylve24n.R.inc(17384);assertTrue(accPathVisitor.getFileList().isEmpty());
    }finally{__CLR4_4_1dendenkylve24n.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 0.
     */
    @ParameterizedTest
    @MethodSource("testParameters")
    public void testFolders1FileSize0(final Supplier<AccumulatorPathVisitor> supplier) throws IOException {__CLR4_4_1dendenkylve24n.R.globalSliceStart(getClass().getName(),17385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekjkmpdex(supplier);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dendenkylve24n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dendenkylve24n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.AccumulatorPathVisitorTest.testFolders1FileSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekjkmpdex(final Supplier<AccumulatorPathVisitor> supplier) throws IOException{try{__CLR4_4_1dendenkylve24n.R.inc(17385);
        __CLR4_4_1dendenkylve24n.R.inc(17386);final AccumulatorPathVisitor accPathVisitor = supplier.get();
        __CLR4_4_1dendenkylve24n.R.inc(17387);final PathVisitorFileFilter countingFileFilter = new PathVisitorFileFilter(accPathVisitor);
        __CLR4_4_1dendenkylve24n.R.inc(17388);Files.walkFileTree(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-0"),
            countingFileFilter);
        __CLR4_4_1dendenkylve24n.R.inc(17389);assertCounts(1, 1, 0, accPathVisitor.getPathCounters());
        __CLR4_4_1dendenkylve24n.R.inc(17390);assertEquals(1, accPathVisitor.getDirList().size());
        __CLR4_4_1dendenkylve24n.R.inc(17391);assertEquals(1, accPathVisitor.getFileList().size());
    }finally{__CLR4_4_1dendenkylve24n.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @ParameterizedTest
    @MethodSource("testParameters")
    public void testFolders1FileSize1(final Supplier<AccumulatorPathVisitor> supplier) throws IOException {__CLR4_4_1dendenkylve24n.R.globalSliceStart(getClass().getName(),17392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cio93mdf4(supplier);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dendenkylve24n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dendenkylve24n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.AccumulatorPathVisitorTest.testFolders1FileSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cio93mdf4(final Supplier<AccumulatorPathVisitor> supplier) throws IOException{try{__CLR4_4_1dendenkylve24n.R.inc(17392);
        __CLR4_4_1dendenkylve24n.R.inc(17393);final AccumulatorPathVisitor accPathVisitor = supplier.get();
        __CLR4_4_1dendenkylve24n.R.inc(17394);final PathVisitorFileFilter countingFileFilter = new PathVisitorFileFilter(accPathVisitor);
        __CLR4_4_1dendenkylve24n.R.inc(17395);Files.walkFileTree(Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1"),
            countingFileFilter);
        __CLR4_4_1dendenkylve24n.R.inc(17396);assertCounts(1, 1, 1, accPathVisitor.getPathCounters());
        __CLR4_4_1dendenkylve24n.R.inc(17397);assertEquals(1, accPathVisitor.getDirList().size());
        __CLR4_4_1dendenkylve24n.R.inc(17398);assertEquals(1, accPathVisitor.getFileList().size());
    }finally{__CLR4_4_1dendenkylve24n.R.flushNeeded();}}

    /**
     * Tests a directory with two subdirectories, each containing one file of size 1.
     */
    @ParameterizedTest
    @MethodSource("testParameters")
    public void testFolders2FileSize2(final Supplier<AccumulatorPathVisitor> supplier) throws IOException {__CLR4_4_1dendenkylve24n.R.globalSliceStart(getClass().getName(),17399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189v9vydfb(supplier);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dendenkylve24n.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dendenkylve24n.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.AccumulatorPathVisitorTest.testFolders2FileSize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189v9vydfb(final Supplier<AccumulatorPathVisitor> supplier) throws IOException{try{__CLR4_4_1dendenkylve24n.R.inc(17399);
        __CLR4_4_1dendenkylve24n.R.inc(17400);final AccumulatorPathVisitor accPathVisitor = supplier.get();
        __CLR4_4_1dendenkylve24n.R.inc(17401);final PathVisitorFileFilter countingFileFilter = new PathVisitorFileFilter(accPathVisitor);
        __CLR4_4_1dendenkylve24n.R.inc(17402);Files.walkFileTree(Paths.get("src/test/resources/org/apache/commons/io/dirs-2-file-size-2"),
            countingFileFilter);
        __CLR4_4_1dendenkylve24n.R.inc(17403);assertCounts(3, 2, 2, accPathVisitor.getPathCounters());
        __CLR4_4_1dendenkylve24n.R.inc(17404);assertEquals(3, accPathVisitor.getDirList().size());
        __CLR4_4_1dendenkylve24n.R.inc(17405);assertEquals(2, accPathVisitor.getFileList().size());
    }finally{__CLR4_4_1dendenkylve24n.R.flushNeeded();}}

}
