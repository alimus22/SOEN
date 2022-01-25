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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * This class ensure the correctness of {@link FileUtils#directoryContains(File,File)}.
 *
 * @see FileUtils#directoryContains(File, File)
 * @since 2.2
 */
public class FileUtilsDirectoryContainsTestCase {static class __CLR4_4_192e92ekylve12t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private File directory1;
    private File directory2;
    private File directory3;
    private File file1;
    private File file1ByRelativeDirectory2;
    private File file2;
    private File file2ByRelativeDirectory1;
    private File file3;

    @TempDir
    public File top;

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @BeforeEach
    public void setUp() throws Exception {try{__CLR4_4_192e92ekylve12t.R.inc(11750);
        __CLR4_4_192e92ekylve12t.R.inc(11751);directory1 = new File(top, "directory1");
        __CLR4_4_192e92ekylve12t.R.inc(11752);directory2 = new File(top, "directory2");
        __CLR4_4_192e92ekylve12t.R.inc(11753);directory3 = new File(directory2, "directory3");

        __CLR4_4_192e92ekylve12t.R.inc(11754);directory1.mkdir();
        __CLR4_4_192e92ekylve12t.R.inc(11755);directory2.mkdir();
        __CLR4_4_192e92ekylve12t.R.inc(11756);directory3.mkdir();

        __CLR4_4_192e92ekylve12t.R.inc(11757);file1 = new File(directory1, "file1");
        __CLR4_4_192e92ekylve12t.R.inc(11758);file2 = new File(directory2, "file2");
        __CLR4_4_192e92ekylve12t.R.inc(11759);file3 = new File(top, "file3");

        // Tests case with relative path
        __CLR4_4_192e92ekylve12t.R.inc(11760);file1ByRelativeDirectory2 = new File(top, "directory2/../directory1/file1");
        __CLR4_4_192e92ekylve12t.R.inc(11761);file2ByRelativeDirectory1 = new File(top, "directory1/../directory2/file2");

        __CLR4_4_192e92ekylve12t.R.inc(11762);FileUtils.touch(file1);
        __CLR4_4_192e92ekylve12t.R.inc(11763);FileUtils.touch(file2);
        __CLR4_4_192e92ekylve12t.R.inc(11764);FileUtils.touch(file3);
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testCanonicalPath() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th91ri92t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testCanonicalPath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th91ri92t() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11765);
        __CLR4_4_192e92ekylve12t.R.inc(11766);assertTrue(FileUtils.directoryContains(directory1, file1ByRelativeDirectory2));
        __CLR4_4_192e92ekylve12t.R.inc(11767);assertTrue(FileUtils.directoryContains(directory2, file2ByRelativeDirectory1));

        __CLR4_4_192e92ekylve12t.R.inc(11768);assertFalse(FileUtils.directoryContains(directory1, file2ByRelativeDirectory1));
        __CLR4_4_192e92ekylve12t.R.inc(11769);assertFalse(FileUtils.directoryContains(directory2, file1ByRelativeDirectory2));
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testDirectoryContainsDirectory() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wm1fq92y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testDirectoryContainsDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wm1fq92y() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11770);
        __CLR4_4_192e92ekylve12t.R.inc(11771);assertTrue(FileUtils.directoryContains(top, directory1));
        __CLR4_4_192e92ekylve12t.R.inc(11772);assertTrue(FileUtils.directoryContains(top, directory2));
        __CLR4_4_192e92ekylve12t.R.inc(11773);assertTrue(FileUtils.directoryContains(top, directory3));
        __CLR4_4_192e92ekylve12t.R.inc(11774);assertTrue(FileUtils.directoryContains(directory2, directory3));
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testDirectoryContainsFile() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6meg3933();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testDirectoryContainsFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6meg3933() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11775);
        __CLR4_4_192e92ekylve12t.R.inc(11776);assertTrue(FileUtils.directoryContains(directory1, file1));
        __CLR4_4_192e92ekylve12t.R.inc(11777);assertTrue(FileUtils.directoryContains(directory2, file2));
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testDirectoryDoesNotContainFile() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tu9y48936();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testDirectoryDoesNotContainFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tu9y48936() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11778);
        __CLR4_4_192e92ekylve12t.R.inc(11779);assertFalse(FileUtils.directoryContains(directory1, file2));
        __CLR4_4_192e92ekylve12t.R.inc(11780);assertFalse(FileUtils.directoryContains(directory2, file1));

        __CLR4_4_192e92ekylve12t.R.inc(11781);assertFalse(FileUtils.directoryContains(directory1, file3));
        __CLR4_4_192e92ekylve12t.R.inc(11782);assertFalse(FileUtils.directoryContains(directory2, file3));
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testDirectoryDoesNotContainsDirectory() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btqoru93b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testDirectoryDoesNotContainsDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btqoru93b() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11783);
        __CLR4_4_192e92ekylve12t.R.inc(11784);assertFalse(FileUtils.directoryContains(directory1, top));
        __CLR4_4_192e92ekylve12t.R.inc(11785);assertFalse(FileUtils.directoryContains(directory2, top));
        __CLR4_4_192e92ekylve12t.R.inc(11786);assertFalse(FileUtils.directoryContains(directory3, top));
        __CLR4_4_192e92ekylve12t.R.inc(11787);assertFalse(FileUtils.directoryContains(directory3, directory2));
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testDirectoryDoesNotExist() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vy5y993g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testDirectoryDoesNotExist",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vy5y993g() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11788);
        __CLR4_4_192e92ekylve12t.R.inc(11789);final File dir = new File("DOESNOTEXIST");
        __CLR4_4_192e92ekylve12t.R.inc(11790);assertFalse(dir.exists());
        __CLR4_4_192e92ekylve12t.R.inc(11791);try {
            __CLR4_4_192e92ekylve12t.R.inc(11792);assertFalse(FileUtils.directoryContains(dir, file1));
            __CLR4_4_192e92ekylve12t.R.inc(11793);fail("Expected " + IllegalArgumentException.class.getName());
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testSameFile() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cr43f93m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testSameFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cr43f93m() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11794);
        __CLR4_4_192e92ekylve12t.R.inc(11795);try {
            __CLR4_4_192e92ekylve12t.R.inc(11796);assertTrue(FileUtils.directoryContains(file1, file1));
            __CLR4_4_192e92ekylve12t.R.inc(11797);fail("Expected " + IllegalArgumentException.class.getName());
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testIO466() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilqrnh93q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testIO466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilqrnh93q() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11798);
            __CLR4_4_192e92ekylve12t.R.inc(11799);final File fooFile = new File(directory1.getParent(), "directory1.txt");
            __CLR4_4_192e92ekylve12t.R.inc(11800);assertFalse(FileUtils.directoryContains(directory1, fooFile));
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testFileDoesNotExist() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4xr5e93t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testFileDoesNotExist",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4xr5e93t() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11801);
        __CLR4_4_192e92ekylve12t.R.inc(11802);assertFalse(FileUtils.directoryContains(top, null));
        __CLR4_4_192e92ekylve12t.R.inc(11803);final File file = new File("DOESNOTEXIST");
        __CLR4_4_192e92ekylve12t.R.inc(11804);assertFalse(file.exists());
        __CLR4_4_192e92ekylve12t.R.inc(11805);assertFalse(FileUtils.directoryContains(top, file));
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    /**
     * Test to demonstrate a file which does not exist returns false
     * @throws IOException If an I/O error occurs
     */
    @Test
    public void testFileDoesNotExistBug() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hpp7493y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testFileDoesNotExistBug",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hpp7493y() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11806);
        __CLR4_4_192e92ekylve12t.R.inc(11807);final File file = new File(top, "DOESNOTEXIST");
        __CLR4_4_192e92ekylve12t.R.inc(11808);assertTrue(top.exists(), "Check directory exists");
        __CLR4_4_192e92ekylve12t.R.inc(11809);assertFalse(file.exists(), "Check file does not exist");
        __CLR4_4_192e92ekylve12t.R.inc(11810);assertFalse(FileUtils.directoryContains(top, file), "Directory does not contain unrealized file");
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}

    @Test
    public void testUnrealizedContainment() throws IOException {__CLR4_4_192e92ekylve12t.R.globalSliceStart(getClass().getName(),11811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ixsh9c943();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_192e92ekylve12t.R.rethrow($CLV_t2$);}finally{__CLR4_4_192e92ekylve12t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsDirectoryContainsTestCase.testUnrealizedContainment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ixsh9c943() throws IOException{try{__CLR4_4_192e92ekylve12t.R.inc(11811);
        __CLR4_4_192e92ekylve12t.R.inc(11812);final File dir = new File("DOESNOTEXIST");
        __CLR4_4_192e92ekylve12t.R.inc(11813);final File file = new File(dir, "DOESNOTEXIST2");
        __CLR4_4_192e92ekylve12t.R.inc(11814);assertFalse(dir.exists());
        __CLR4_4_192e92ekylve12t.R.inc(11815);assertFalse(file.exists());
        __CLR4_4_192e92ekylve12t.R.inc(11816);try {
            __CLR4_4_192e92ekylve12t.R.inc(11817);assertTrue(FileUtils.directoryContains(dir, file));
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_192e92ekylve12t.R.flushNeeded();}}
}
