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
package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

import org.apache.commons.io.test.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * This is used to test FileUtils for correctness.
 */
public class FileUtilsFileNewerTestCase {static class __CLR4_4_194a94akylve137{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11865,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    // Test data
    private static final int FILE1_SIZE = 1;
    private static final int FILE2_SIZE = 1024 * 4 + 1;

    private File testFile1;
    private File testFile2;

    @BeforeEach
    public void setUp() throws Exception {try{__CLR4_4_194a94akylve137.R.inc(11818);
        __CLR4_4_194a94akylve137.R.inc(11819);testFile1 = new File(temporaryFolder, "file1-test.txt");
        __CLR4_4_194a94akylve137.R.inc(11820);testFile2 = new File(temporaryFolder, "file2-test.txt");
        __CLR4_4_194a94akylve137.R.inc(11821);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_194a94akylve137.R.iget(11822)!=0|true))||(__CLR4_4_194a94akylve137.R.iget(11823)==0&false))) {{
            __CLR4_4_194a94akylve137.R.inc(11824);throw new IOException("Cannot create file " + testFile1
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_194a94akylve137.R.inc(11825);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_194a94akylve137.R.inc(11826);}};final BufferedOutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()))) {
            __CLR4_4_194a94akylve137.R.inc(11827);TestUtils.generateTestData(output1, FILE1_SIZE);
        }
        __CLR4_4_194a94akylve137.R.inc(11828);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_194a94akylve137.R.iget(11829)!=0|true))||(__CLR4_4_194a94akylve137.R.iget(11830)==0&false))) {{
            __CLR4_4_194a94akylve137.R.inc(11831);throw new IOException("Cannot create file " + testFile2
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_194a94akylve137.R.inc(11832);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_194a94akylve137.R.inc(11833);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()))) {
            __CLR4_4_194a94akylve137.R.inc(11834);TestUtils.generateTestData(output, FILE2_SIZE);
        }
    }finally{__CLR4_4_194a94akylve137.R.flushNeeded();}}

    /**
     * Tests the {@code isFileNewer(File, *)} methods which a "normal" file.
     * @throws IOException
     *
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
    @Test
    public void testIsFileNewer() throws IOException {__CLR4_4_194a94akylve137.R.globalSliceStart(getClass().getName(),11835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mtu42s94r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_194a94akylve137.R.rethrow($CLV_t2$);}finally{__CLR4_4_194a94akylve137.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsFileNewerTestCase.testIsFileNewer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mtu42s94r() throws IOException{try{__CLR4_4_194a94akylve137.R.inc(11835);
        __CLR4_4_194a94akylve137.R.inc(11836);if ((((!testFile1.exists())&&(__CLR4_4_194a94akylve137.R.iget(11837)!=0|true))||(__CLR4_4_194a94akylve137.R.iget(11838)==0&false))) {{
            __CLR4_4_194a94akylve137.R.inc(11839);throw new IllegalStateException("The testFile1 should exist");
        }

        }__CLR4_4_194a94akylve137.R.inc(11840);final long fileLastModified = FileUtils.lastModified(testFile1);
        __CLR4_4_194a94akylve137.R.inc(11841);final long TWO_SECOND = 2000;

        __CLR4_4_194a94akylve137.R.inc(11842);testIsFileNewer("two second earlier is not newer" , testFile1, fileLastModified + TWO_SECOND, false);
        __CLR4_4_194a94akylve137.R.inc(11843);testIsFileNewer("same time is not newer" , testFile1, fileLastModified, false);
        __CLR4_4_194a94akylve137.R.inc(11844);testIsFileNewer("two second later is newer" , testFile1, fileLastModified - TWO_SECOND, true);
    }finally{__CLR4_4_194a94akylve137.R.flushNeeded();}}

    /**
     * Tests the {@code isFileNewer(File, *)} methods which a not existing file.
     * @throws IOException if an I/O error occurs.
     *
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
    @Test
    public void testIsFileNewerImaginaryFile() throws IOException {__CLR4_4_194a94akylve137.R.globalSliceStart(getClass().getName(),11845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0nc8p951();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_194a94akylve137.R.rethrow($CLV_t2$);}finally{__CLR4_4_194a94akylve137.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsFileNewerTestCase.testIsFileNewerImaginaryFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0nc8p951() throws IOException{try{__CLR4_4_194a94akylve137.R.inc(11845);
        __CLR4_4_194a94akylve137.R.inc(11846);final File imaginaryFile = new File(temporaryFolder, "imaginaryFile");
        __CLR4_4_194a94akylve137.R.inc(11847);if ((((imaginaryFile.exists())&&(__CLR4_4_194a94akylve137.R.iget(11848)!=0|true))||(__CLR4_4_194a94akylve137.R.iget(11849)==0&false))) {{
            __CLR4_4_194a94akylve137.R.inc(11850);throw new IllegalStateException("The imaginary File exists");
        }

        }__CLR4_4_194a94akylve137.R.inc(11851);testIsFileNewer("imaginary file can be newer" , imaginaryFile, FileUtils.lastModified(testFile2), false);
    }finally{__CLR4_4_194a94akylve137.R.flushNeeded();}}

    /**
     * Tests the {@code isFileNewer(File, *)} methods which the specified conditions.
     *
     * Creates :
     * <ul>
     * <li>a {@code Date} which represents the time reference</li>
     * <li>a temporary file with the same last modification date as the time reference</li>
     * </ul>
     * Then compares (with the needed {@code isFileNewer} method) the last modification date of
     * the specified file with the specified time reference, the created {@code Date} and the temporary
     * file.
     * <br>
     * The test is successful if the three comparisons return the specified wanted result.
     *
     * @param description describes the tested situation
     * @param file the file of which the last modification date is compared
     * @param time the time reference measured in milliseconds since the epoch
     * @param wantedResult the expected result
     * @throws IOException if an I/O error occurs.
     *
     * @see FileUtils#isFileNewer(File, long)
     * @see FileUtils#isFileNewer(File, Date)
     * @see FileUtils#isFileNewer(File, File)
     */
    protected void testIsFileNewer(final String description, final File file, final long time, final boolean wantedResult) throws IOException  {try{__CLR4_4_194a94akylve137.R.inc(11852);
        __CLR4_4_194a94akylve137.R.inc(11853);assertEquals(wantedResult, FileUtils.isFileNewer(file, time), description + " - time");
        __CLR4_4_194a94akylve137.R.inc(11854);assertEquals(wantedResult, FileUtils.isFileNewer(file, new Date(time)), description + " - date");

        __CLR4_4_194a94akylve137.R.inc(11855);final File temporaryFile = testFile2;

        __CLR4_4_194a94akylve137.R.inc(11856);temporaryFile.setLastModified(time);
        __CLR4_4_194a94akylve137.R.inc(11857);assertEquals(time, FileUtils.lastModified(temporaryFile), "The temporary file hasn't the right last modification date");
        __CLR4_4_194a94akylve137.R.inc(11858);assertEquals(wantedResult, FileUtils.isFileNewer(file, temporaryFile), description + " - file");
    }finally{__CLR4_4_194a94akylve137.R.flushNeeded();}}

    /**
     * Tests the {@code isFileNewer(File, long)} method without specifying a {@code File}.
     * <br>
     * The test is successful if the method throws an {@code IllegalArgumentException}.
     */
    @Test
    public void testIsFileNewerNoFile() {__CLR4_4_194a94akylve137.R.globalSliceStart(getClass().getName(),11859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fnpk6x95f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_194a94akylve137.R.rethrow($CLV_t2$);}finally{__CLR4_4_194a94akylve137.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsFileNewerTestCase.testIsFileNewerNoFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fnpk6x95f(){try{__CLR4_4_194a94akylve137.R.inc(11859);
        __CLR4_4_194a94akylve137.R.inc(11860);assertThrows(NullPointerException.class, () -> FileUtils.isFileNewer(null,0),
                "file");
    }finally{__CLR4_4_194a94akylve137.R.flushNeeded();}}

    /**
     * Tests the {@code isFileNewer(File, Date)} method without specifying a {@code Date}.
     * <br>
     * The test is successful if the method throws an {@code IllegalArgumentException}.
     */
    @Test
    public void testIsFileNewerNoDate() {__CLR4_4_194a94akylve137.R.globalSliceStart(getClass().getName(),11861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ncf6vp95h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_194a94akylve137.R.rethrow($CLV_t2$);}finally{__CLR4_4_194a94akylve137.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsFileNewerTestCase.testIsFileNewerNoDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ncf6vp95h(){try{__CLR4_4_194a94akylve137.R.inc(11861);
        __CLR4_4_194a94akylve137.R.inc(11862);assertThrows(NullPointerException.class, () -> FileUtils.isFileNewer(testFile1, (Date) null),
                "date");
    }finally{__CLR4_4_194a94akylve137.R.flushNeeded();}}

    /**
     * Tests the {@code isFileNewer(File, File)} method without specifying a reference {@code File}.
     * <br>
     * The test is successful if the method throws an {@code IllegalArgumentException}.
     */
    @Test
    public void testIsFileNewerNoFileReference() {__CLR4_4_194a94akylve137.R.globalSliceStart(getClass().getName(),11863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svt3j495j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_194a94akylve137.R.rethrow($CLV_t2$);}finally{__CLR4_4_194a94akylve137.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsFileNewerTestCase.testIsFileNewerNoFileReference",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svt3j495j(){try{__CLR4_4_194a94akylve137.R.inc(11863);
        __CLR4_4_194a94akylve137.R.inc(11864);assertThrows(NullPointerException.class, () -> FileUtils.isFileNewer(testFile1, (File) null),
                "reference");
    }finally{__CLR4_4_194a94akylve137.R.flushNeeded();}}
}
