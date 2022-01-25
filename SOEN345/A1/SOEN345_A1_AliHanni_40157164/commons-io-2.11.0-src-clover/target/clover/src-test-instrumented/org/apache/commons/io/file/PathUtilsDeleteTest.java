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

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.file.Counters.PathCounters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link DeletingPathVisitor}.
 */
public class PathUtilsDeleteTest {static class __CLR4_4_1drvdrvkylve29o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17913,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Path tempDir;

    @AfterEach
    public void afterEach() throws IOException {try{__CLR4_4_1drvdrvkylve29o.R.inc(17851);
        // backstop
        __CLR4_4_1drvdrvkylve29o.R.inc(17852);if ((((Files.exists(tempDir) && PathUtils.isEmptyDirectory(tempDir))&&(__CLR4_4_1drvdrvkylve29o.R.iget(17853)!=0|true))||(__CLR4_4_1drvdrvkylve29o.R.iget(17854)==0&false))) {{
            __CLR4_4_1drvdrvkylve29o.R.inc(17855);Files.deleteIfExists(tempDir);
        }
    }}finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    @BeforeEach
    public void beforeEach() throws IOException {try{__CLR4_4_1drvdrvkylve29o.R.inc(17856);
        __CLR4_4_1drvdrvkylve29o.R.inc(17857);tempDir = Files.createTempDirectory(getClass().getCanonicalName());
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    @Test
    public void testDeleteDirectory1FileSize0() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ki0wm1ds2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ki0wm1ds2() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17858);
        __CLR4_4_1drvdrvkylve29o.R.inc(17859);final String fileName = "file-size-0.bin";
        __CLR4_4_1drvdrvkylve29o.R.inc(17860);FileUtils.copyFileToDirectory(
            Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-0/" + fileName).toFile(),
            tempDir.toFile());
        __CLR4_4_1drvdrvkylve29o.R.inc(17861);assertCounts(0, 1, 0, PathUtils.delete(tempDir.resolve(fileName)));
        // This will throw if not empty.
        __CLR4_4_1drvdrvkylve29o.R.inc(17862);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    private void testDeleteDirectory1FileSize0(final DeleteOption... options) throws IOException {try{__CLR4_4_1drvdrvkylve29o.R.inc(17863);
        __CLR4_4_1drvdrvkylve29o.R.inc(17864);final String fileName = "file-size-0.bin";
        __CLR4_4_1drvdrvkylve29o.R.inc(17865);FileUtils.copyFileToDirectory(
            Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-0/" + fileName).toFile(),
            tempDir.toFile());
        __CLR4_4_1drvdrvkylve29o.R.inc(17866);assertCounts(0, 1, 0, PathUtils.delete(tempDir.resolve(fileName), options));
        // This will throw if not empty.
        __CLR4_4_1drvdrvkylve29o.R.inc(17867);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 0.
     */
    @Test
    public void testDeleteDirectory1FileSize0ForceOff() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130bpabdsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize0ForceOff",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130bpabdsc() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17868);
        __CLR4_4_1drvdrvkylve29o.R.inc(17869);testDeleteDirectory1FileSize0();
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 0.
     */
    @Test
    public void testDeleteDirectory1FileSize0ForceOn() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ju5ttdse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize0ForceOn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ju5ttdse() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17870);
        __CLR4_4_1drvdrvkylve29o.R.inc(17871);testDeleteDirectory1FileSize0();
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    @Test
    public void testDeleteDirectory1FileSize0NoOption() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qhn8xddsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize0NoOption",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qhn8xddsg() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17872);
        __CLR4_4_1drvdrvkylve29o.R.inc(17873);testDeleteDirectory1FileSize0(PathUtils.EMPTY_DELETE_OPTION_ARRAY);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    @Test
    public void testDeleteDirectory1FileSize0OverrideReadonly() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14801wndsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize0OverrideReadonly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14801wndsi() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17874);
        __CLR4_4_1drvdrvkylve29o.R.inc(17875);testDeleteDirectory1FileSize0(StandardDeleteOption.OVERRIDE_READ_ONLY);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    @Test
    public void testDeleteDirectory1FileSize1() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nr0veidsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nr0veidsk() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17876);
        __CLR4_4_1drvdrvkylve29o.R.inc(17877);final String fileName = "file-size-1.bin";
        __CLR4_4_1drvdrvkylve29o.R.inc(17878);FileUtils.copyFileToDirectory(
            Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1/" + fileName).toFile(),
            tempDir.toFile());
        __CLR4_4_1drvdrvkylve29o.R.inc(17879);assertCounts(0, 1, 1, PathUtils.delete(tempDir.resolve(fileName)));
        // This will throw if not empty.
        __CLR4_4_1drvdrvkylve29o.R.inc(17880);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    private void testDeleteDirectory1FileSize1(final DeleteOption... options) throws IOException {try{__CLR4_4_1drvdrvkylve29o.R.inc(17881);
        // TODO Setup the test to use LinkOption.
        __CLR4_4_1drvdrvkylve29o.R.inc(17882);final String fileName = "file-size-1.bin";
        __CLR4_4_1drvdrvkylve29o.R.inc(17883);FileUtils.copyFileToDirectory(
            Paths.get("src/test/resources/org/apache/commons/io/dirs-1-file-size-1/" + fileName).toFile(),
            tempDir.toFile());
        __CLR4_4_1drvdrvkylve29o.R.inc(17884);assertCounts(0, 1, 1, PathUtils.delete(tempDir.resolve(fileName), options));
        // This will throw if not empty.
        __CLR4_4_1drvdrvkylve29o.R.inc(17885);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @Test
    public void testDeleteDirectory1FileSize1ForceOff() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhb0nydsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize1ForceOff",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhb0nydsu() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17886);
        __CLR4_4_1drvdrvkylve29o.R.inc(17887);testDeleteDirectory1FileSize1();
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    /**
     * Tests a directory with one file of size 1.
     */
    @Test
    public void testDeleteDirectory1FileSize1ForceOn() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxka9udsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize1ForceOn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxka9udsw() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17888);
        __CLR4_4_1drvdrvkylve29o.R.inc(17889);testDeleteDirectory1FileSize1();
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    @Test
    public void testDeleteDirectory1FileSize1NoOption() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a00iz4dsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize1NoOption",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a00iz4dsy() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17890);
        __CLR4_4_1drvdrvkylve29o.R.inc(17891);testDeleteDirectory1FileSize1(PathUtils.EMPTY_DELETE_OPTION_ARRAY);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    @Test
    public void testDeleteDirectory1FileSize1OverrideReadOnly() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19i5bvcdt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteDirectory1FileSize1OverrideReadOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19i5bvcdt0() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17892);
        __CLR4_4_1drvdrvkylve29o.R.inc(17893);testDeleteDirectory1FileSize1(StandardDeleteOption.OVERRIDE_READ_ONLY);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    @Test
    public void testDeleteEmptyDirectory() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3bjwcdt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteEmptyDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3bjwcdt2() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17894);
        __CLR4_4_1drvdrvkylve29o.R.inc(17895);testDeleteEmptyDirectory(PathUtils.delete(tempDir));
        // This will throw if not empty.
        __CLR4_4_1drvdrvkylve29o.R.inc(17896);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    private void testDeleteEmptyDirectory(final DeleteOption... options) throws IOException {try{__CLR4_4_1drvdrvkylve29o.R.inc(17897);
        __CLR4_4_1drvdrvkylve29o.R.inc(17898);testDeleteEmptyDirectory(PathUtils.delete(tempDir, options));
        // This will throw if not empty.
        __CLR4_4_1drvdrvkylve29o.R.inc(17899);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    private void testDeleteEmptyDirectory(final PathCounters pathCounts) {try{__CLR4_4_1drvdrvkylve29o.R.inc(17900);
        __CLR4_4_1drvdrvkylve29o.R.inc(17901);assertCounts(1, 0, 0, pathCounts);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    @Test
    public void testDeleteEmptyDirectoryForceOff() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hhm54dta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteEmptyDirectoryForceOff",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hhm54dta() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17902);
        __CLR4_4_1drvdrvkylve29o.R.inc(17903);testDeleteEmptyDirectory();
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    /**
     * Tests an empty folder.
     */
    @Test
    public void testDeleteEmptyDirectoryForceOn() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbblmcdtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteEmptyDirectoryForceOn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbblmcdtc() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17904);
        __CLR4_4_1drvdrvkylve29o.R.inc(17905);testDeleteEmptyDirectory();
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    @Test
    public void testDeleteEmptyDirectoryNoOption() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryt5s6dte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteEmptyDirectoryNoOption",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryt5s6dte() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17906);
        __CLR4_4_1drvdrvkylve29o.R.inc(17907);testDeleteEmptyDirectory(PathUtils.EMPTY_DELETE_OPTION_ARRAY);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    @Test
    public void testDeleteEmptyDirectoryOverrideReadOnly() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xqrsidtg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteEmptyDirectoryOverrideReadOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xqrsidtg() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17908);
        __CLR4_4_1drvdrvkylve29o.R.inc(17909);testDeleteEmptyDirectory(StandardDeleteOption.OVERRIDE_READ_ONLY);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}

    /**
     * Tests a file that does not exist.
     */
    @Test
    public void testDeleteFileDoesNotExist() throws IOException {__CLR4_4_1drvdrvkylve29o.R.globalSliceStart(getClass().getName(),17910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqyusjdti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1drvdrvkylve29o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1drvdrvkylve29o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsDeleteTest.testDeleteFileDoesNotExist",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqyusjdti() throws IOException{try{__CLR4_4_1drvdrvkylve29o.R.inc(17910);
        __CLR4_4_1drvdrvkylve29o.R.inc(17911);assertCounts(0, 0, 0, PathUtils.deleteFile(tempDir.resolve("file-does-not-exist.bin")));
        // This will throw if not empty.
        __CLR4_4_1drvdrvkylve29o.R.inc(17912);Files.deleteIfExists(tempDir);
    }finally{__CLR4_4_1drvdrvkylve29o.R.flushNeeded();}}
}
