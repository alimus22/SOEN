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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.file.Counters.PathCounters;
import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link DeletingPathVisitor}.
 */
public class PathUtilsDeleteFileTest {static class __CLR4_4_1dq8dq8kylve298{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17851,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Path tempDir;

    @AfterEach
    public void afterEach() throws IOException {try{__CLR4_4_1dq8dq8kylve298.R.inc(17792);
        // backstop
        __CLR4_4_1dq8dq8kylve298.R.inc(17793);if ((((Files.exists(tempDir) && PathUtils.isEmptyDirectory(tempDir))&&(__CLR4_4_1dq8dq8kylve298.R.iget(17794)!=0|true))||(__CLR4_4_1dq8dq8kylve298.R.iget(17795)==0&false))) {{
            __CLR4_4_1dq8dq8kylve298.R.inc(17796);Files.deleteIfExists(tempDir);
        }
    }}finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}

    @BeforeEach
    public void beforeEach() throws IOException {try{__CLR4_4_1dq8dq8kylve298.R.inc(17797);
        __CLR4_4_1dq8dq8kylve298.R.inc(17798);tempDir = Files.createTempDirectory(getClass().getCanonicalName());
    }finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 0.
     */
    @Test
    public void testDeleteFileDirectory1FileSize0() throws IOException {__CLR4_4_1dq8dq8kylve298.R.globalSliceStart(getClass().getName(),17799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7vzstdqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dq8dq8kylve298.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dq8dq8kylve298.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteFileTest.testDeleteFileDirectory1FileSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7vzstdqf() throws IOException{try{__CLR4_4_1dq8dq8kylve298.R.inc(17799);
        __CLR4_4_1dq8dq8kylve298.R.inc(17800);final String fileName = "file-size-0.bin";
        __CLR4_4_1dq8dq8kylve298.R.inc(17801);PathUtils.copyFileToDirectory(
                Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-0/" + fileName), tempDir);
        __CLR4_4_1dq8dq8kylve298.R.inc(17802);assertCounts(0, 1, 0, PathUtils.deleteFile(tempDir.resolve(fileName)));
        // This will throw if not empty.
        __CLR4_4_1dq8dq8kylve298.R.inc(17803);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @Test
    public void testDeleteFileDirectory1FileSize1() throws IOException {__CLR4_4_1dq8dq8kylve298.R.globalSliceStart(getClass().getName(),17804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgvyladqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dq8dq8kylve298.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dq8dq8kylve298.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteFileTest.testDeleteFileDirectory1FileSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgvyladqk() throws IOException{try{__CLR4_4_1dq8dq8kylve298.R.inc(17804);
        __CLR4_4_1dq8dq8kylve298.R.inc(17805);final String fileName = "file-size-1.bin";
        __CLR4_4_1dq8dq8kylve298.R.inc(17806);PathUtils.copyFileToDirectory(
                Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1/" + fileName), tempDir);
        __CLR4_4_1dq8dq8kylve298.R.inc(17807);assertCounts(0, 1, 1, PathUtils.deleteFile(tempDir.resolve(fileName)));
        // This will throw if not empty.
        __CLR4_4_1dq8dq8kylve298.R.inc(17808);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}

    /**
     * Tests a file that does not exist.
     */
    @Test
    public void testDeleteFileDoesNotExist() throws IOException {__CLR4_4_1dq8dq8kylve298.R.globalSliceStart(getClass().getName(),17809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqyusjdqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dq8dq8kylve298.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dq8dq8kylve298.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteFileTest.testDeleteFileDoesNotExist",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqyusjdqp() throws IOException{try{__CLR4_4_1dq8dq8kylve298.R.inc(17809);
        __CLR4_4_1dq8dq8kylve298.R.inc(17810);testDeleteFileEmpty(PathUtils.deleteFile(tempDir.resolve("file-does-not-exist.bin")));
        // This will throw if not empty.
        __CLR4_4_1dq8dq8kylve298.R.inc(17811);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}

    private void testDeleteFileEmpty(final PathCounters pathCounts) {try{__CLR4_4_1dq8dq8kylve298.R.inc(17812);
        __CLR4_4_1dq8dq8kylve298.R.inc(17813);assertCounts(0, 0, 0, pathCounts);
    }finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    @Test
    public void testDeleteFileEmptyDirectory() throws IOException {__CLR4_4_1dq8dq8kylve298.R.globalSliceStart(getClass().getName(),17814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl09pcdqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dq8dq8kylve298.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dq8dq8kylve298.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteFileTest.testDeleteFileEmptyDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl09pcdqu() throws IOException{try{__CLR4_4_1dq8dq8kylve298.R.inc(17814);
        __CLR4_4_1dq8dq8kylve298.R.inc(17815);Assertions.assertThrows(NoSuchFileException.class, () -> testDeleteFileEmpty(PathUtils.deleteFile(tempDir)));
        // This will throw if not empty.
        __CLR4_4_1dq8dq8kylve298.R.inc(17816);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @Test
    public void testDeleteReadOnlyFileDirectory1FileSize1() throws IOException {__CLR4_4_1dq8dq8kylve298.R.globalSliceStart(getClass().getName(),17817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tghqakdqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dq8dq8kylve298.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dq8dq8kylve298.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteFileTest.testDeleteReadOnlyFileDirectory1FileSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tghqakdqx() throws IOException{try{__CLR4_4_1dq8dq8kylve298.R.inc(17817);
        __CLR4_4_1dq8dq8kylve298.R.inc(17818);final String fileName = "file-size-1.bin";
        __CLR4_4_1dq8dq8kylve298.R.inc(17819);PathUtils.copyFileToDirectory(
            Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1/" + fileName), tempDir);
        __CLR4_4_1dq8dq8kylve298.R.inc(17820);final Path resolved = tempDir.resolve(fileName);
        __CLR4_4_1dq8dq8kylve298.R.inc(17821);PathUtils.setReadOnly(resolved, true);
        __CLR4_4_1dq8dq8kylve298.R.inc(17822);if ((((SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_1dq8dq8kylve298.R.iget(17823)!=0|true))||(__CLR4_4_1dq8dq8kylve298.R.iget(17824)==0&false))) {{
            // Fails on Windows's Ubuntu subsystem.
            __CLR4_4_1dq8dq8kylve298.R.inc(17825);assertFalse(Files.isWritable(resolved));
            __CLR4_4_1dq8dq8kylve298.R.inc(17826);assertThrows(IOException.class, () -> PathUtils.deleteFile(resolved));
        }
        }__CLR4_4_1dq8dq8kylve298.R.inc(17827);assertCounts(0, 1, 1, PathUtils.deleteFile(resolved, StandardDeleteOption.OVERRIDE_READ_ONLY));
        // This will throw if not empty.
        __CLR4_4_1dq8dq8kylve298.R.inc(17828);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @Test
    public void testSetReadOnlyFileDirectory1FileSize1() throws IOException {__CLR4_4_1dq8dq8kylve298.R.globalSliceStart(getClass().getName(),17829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnlq9jdr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dq8dq8kylve298.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dq8dq8kylve298.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteFileTest.testSetReadOnlyFileDirectory1FileSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnlq9jdr9() throws IOException{try{__CLR4_4_1dq8dq8kylve298.R.inc(17829);
        __CLR4_4_1dq8dq8kylve298.R.inc(17830);final String fileName = "file-size-1.bin";
        __CLR4_4_1dq8dq8kylve298.R.inc(17831);PathUtils.copyFileToDirectory(
            Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1/" + fileName), tempDir);
        __CLR4_4_1dq8dq8kylve298.R.inc(17832);final Path resolved = tempDir.resolve(fileName);
        __CLR4_4_1dq8dq8kylve298.R.inc(17833);PathUtils.setReadOnly(resolved, true);
        __CLR4_4_1dq8dq8kylve298.R.inc(17834);if ((((SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_1dq8dq8kylve298.R.iget(17835)!=0|true))||(__CLR4_4_1dq8dq8kylve298.R.iget(17836)==0&false))) {{
            // Fails on Windows's Ubuntu subsystem.
            __CLR4_4_1dq8dq8kylve298.R.inc(17837);assertFalse(Files.isWritable(resolved));
            __CLR4_4_1dq8dq8kylve298.R.inc(17838);assertThrows(IOException.class, () -> PathUtils.deleteFile(resolved));
        }
        }__CLR4_4_1dq8dq8kylve298.R.inc(17839);PathUtils.setReadOnly(resolved, false);
        __CLR4_4_1dq8dq8kylve298.R.inc(17840);PathUtils.deleteFile(resolved);
        // This will throw if not empty.
        __CLR4_4_1dq8dq8kylve298.R.inc(17841);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}

    @Test
    public void testDeleteBrokenLink() throws IOException {__CLR4_4_1dq8dq8kylve298.R.globalSliceStart(getClass().getName(),17842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z2ycctdrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dq8dq8kylve298.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dq8dq8kylve298.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteFileTest.testDeleteBrokenLink",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z2ycctdrm() throws IOException{try{__CLR4_4_1dq8dq8kylve298.R.inc(17842);
        __CLR4_4_1dq8dq8kylve298.R.inc(17843);assumeFalse(SystemUtils.IS_OS_WINDOWS);

        __CLR4_4_1dq8dq8kylve298.R.inc(17844);final Path missingFile = tempDir.resolve("missing.txt");
        __CLR4_4_1dq8dq8kylve298.R.inc(17845);final Path brokenLink = tempDir.resolve("broken.txt");
        __CLR4_4_1dq8dq8kylve298.R.inc(17846);Files.createSymbolicLink(brokenLink, missingFile);

        __CLR4_4_1dq8dq8kylve298.R.inc(17847);assertTrue(Files.exists(brokenLink, LinkOption.NOFOLLOW_LINKS));
        __CLR4_4_1dq8dq8kylve298.R.inc(17848);assertFalse(Files.exists(missingFile, LinkOption.NOFOLLOW_LINKS));

        __CLR4_4_1dq8dq8kylve298.R.inc(17849);PathUtils.deleteFile(brokenLink);

        __CLR4_4_1dq8dq8kylve298.R.inc(17850);assertFalse(Files.exists(brokenLink, LinkOption.NOFOLLOW_LINKS), "Symbolic link not removed");
    }finally{__CLR4_4_1dq8dq8kylve298.R.flushNeeded();}}
}
