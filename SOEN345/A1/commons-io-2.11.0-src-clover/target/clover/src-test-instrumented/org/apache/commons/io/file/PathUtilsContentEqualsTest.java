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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class PathUtilsContentEqualsTest {static class __CLR4_4_1dm1dm1kylve28d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17747,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    private String getName() {try{__CLR4_4_1dm1dm1kylve28d.R.inc(17641);
        __CLR4_4_1dm1dm1kylve28d.R.inc(17642);return this.getClass().getSimpleName();
    }finally{__CLR4_4_1dm1dm1kylve28d.R.flushNeeded();}}

    @Test
    public void testFileContentEquals() throws Exception {__CLR4_4_1dm1dm1kylve28d.R.globalSliceStart(getClass().getName(),17643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1619u5rdm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dm1dm1kylve28d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dm1dm1kylve28d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsContentEqualsTest.testFileContentEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1619u5rdm3() throws Exception{try{__CLR4_4_1dm1dm1kylve28d.R.inc(17643);
        // Non-existent files
        __CLR4_4_1dm1dm1kylve28d.R.inc(17644);final Path path1 = new File(temporaryFolder, getName()).toPath();
        __CLR4_4_1dm1dm1kylve28d.R.inc(17645);final Path path2 = new File(temporaryFolder, getName() + "2").toPath();
        __CLR4_4_1dm1dm1kylve28d.R.inc(17646);assertTrue(PathUtils.fileContentEquals(null, null));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17647);assertFalse(PathUtils.fileContentEquals(null, path1));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17648);assertFalse(PathUtils.fileContentEquals(path1, null));
        // both don't exist
        __CLR4_4_1dm1dm1kylve28d.R.inc(17649);assertTrue(PathUtils.fileContentEquals(path1, path1));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17650);assertTrue(PathUtils.fileContentEquals(path1, path2));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17651);assertTrue(PathUtils.fileContentEquals(path2, path2));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17652);assertTrue(PathUtils.fileContentEquals(path2, path1));

        // Directories
        __CLR4_4_1dm1dm1kylve28d.R.inc(17653);try {
            __CLR4_4_1dm1dm1kylve28d.R.inc(17654);PathUtils.fileContentEquals(temporaryFolder.toPath(), temporaryFolder.toPath());
            __CLR4_4_1dm1dm1kylve28d.R.inc(17655);fail("Comparing directories should fail with an IOException");
        } catch (final IOException ioe) {
            // expected
        }

        // Different files
        __CLR4_4_1dm1dm1kylve28d.R.inc(17656);final Path objFile1 = Paths.get(temporaryFolder.getAbsolutePath(), getName() + ".object");
        __CLR4_4_1dm1dm1kylve28d.R.inc(17657);objFile1.toFile().deleteOnExit();
        __CLR4_4_1dm1dm1kylve28d.R.inc(17658);PathUtils.copyFile(getClass().getResource("/java/lang/Object.class"), objFile1);

        __CLR4_4_1dm1dm1kylve28d.R.inc(17659);final Path objFile1b = Paths.get(temporaryFolder.getAbsolutePath(), getName() + ".object2");
        __CLR4_4_1dm1dm1kylve28d.R.inc(17660);objFile1b.toFile().deleteOnExit();
        __CLR4_4_1dm1dm1kylve28d.R.inc(17661);PathUtils.copyFile(getClass().getResource("/java/lang/Object.class"), objFile1b);

        __CLR4_4_1dm1dm1kylve28d.R.inc(17662);final Path objFile2 = Paths.get(temporaryFolder.getAbsolutePath(), getName() + ".collection");
        __CLR4_4_1dm1dm1kylve28d.R.inc(17663);objFile2.toFile().deleteOnExit();
        __CLR4_4_1dm1dm1kylve28d.R.inc(17664);PathUtils.copyFile(getClass().getResource("/java/util/Collection.class"), objFile2);

        __CLR4_4_1dm1dm1kylve28d.R.inc(17665);assertFalse(PathUtils.fileContentEquals(objFile1, objFile2));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17666);assertFalse(PathUtils.fileContentEquals(objFile1b, objFile2));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17667);assertTrue(PathUtils.fileContentEquals(objFile1, objFile1b));

        __CLR4_4_1dm1dm1kylve28d.R.inc(17668);assertTrue(PathUtils.fileContentEquals(objFile1, objFile1));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17669);assertTrue(PathUtils.fileContentEquals(objFile1b, objFile1b));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17670);assertTrue(PathUtils.fileContentEquals(objFile2, objFile2));

        // Equal files
        __CLR4_4_1dm1dm1kylve28d.R.inc(17671);Files.createFile(path1);
        __CLR4_4_1dm1dm1kylve28d.R.inc(17672);Files.createFile(path2);
        __CLR4_4_1dm1dm1kylve28d.R.inc(17673);assertTrue(PathUtils.fileContentEquals(path1, path1));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17674);assertTrue(PathUtils.fileContentEquals(path1, path2));
    }finally{__CLR4_4_1dm1dm1kylve28d.R.flushNeeded();}}

    @Test
    public void testDirectoryContentEquals() throws Exception {__CLR4_4_1dm1dm1kylve28d.R.globalSliceStart(getClass().getName(),17675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ch95hgdmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dm1dm1kylve28d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dm1dm1kylve28d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsContentEqualsTest.testDirectoryContentEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ch95hgdmz() throws Exception{try{__CLR4_4_1dm1dm1kylve28d.R.inc(17675);
        // Non-existent files
        __CLR4_4_1dm1dm1kylve28d.R.inc(17676);final Path path1 = new File(temporaryFolder, getName()).toPath();
        __CLR4_4_1dm1dm1kylve28d.R.inc(17677);final Path path2 = new File(temporaryFolder, getName() + "2").toPath();
        __CLR4_4_1dm1dm1kylve28d.R.inc(17678);assertTrue(PathUtils.directoryContentEquals(null, null));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17679);assertFalse(PathUtils.directoryContentEquals(null, path1));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17680);assertFalse(PathUtils.directoryContentEquals(path1, null));
        // both don't exist
        __CLR4_4_1dm1dm1kylve28d.R.inc(17681);assertTrue(PathUtils.directoryContentEquals(path1, path1));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17682);assertTrue(PathUtils.directoryContentEquals(path1, path2));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17683);assertTrue(PathUtils.directoryContentEquals(path2, path2));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17684);assertTrue(PathUtils.directoryContentEquals(path2, path1));
        // Tree equals true tests
        {
            // Trees of files only that contain the same files.
            __CLR4_4_1dm1dm1kylve28d.R.inc(17685);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-files-only/directory-files-only1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17686);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-files-only/directory-files-only2");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17687);assertTrue(PathUtils.directoryContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17688);assertTrue(PathUtils.directoryContentEquals(dir2, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17689);assertTrue(PathUtils.directoryContentEquals(dir1, dir1));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17690);assertTrue(PathUtils.directoryContentEquals(dir2, dir2));
        }
        {
            // Trees of directories containing other directories.
            __CLR4_4_1dm1dm1kylve28d.R.inc(17691);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-then-files/dir1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17692);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-then-files/dir2");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17693);assertTrue(PathUtils.directoryContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17694);assertTrue(PathUtils.directoryContentEquals(dir2, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17695);assertTrue(PathUtils.directoryContentEquals(dir1, dir1));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17696);assertTrue(PathUtils.directoryContentEquals(dir2, dir2));
        }
        {
            // Trees of directories containing other directories and files.
            __CLR4_4_1dm1dm1kylve28d.R.inc(17697);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files/dirs-and-files1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17698);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files/dirs-and-files1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17699);assertTrue(PathUtils.directoryContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17700);assertTrue(PathUtils.directoryContentEquals(dir2, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17701);assertTrue(PathUtils.directoryContentEquals(dir1, dir1));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17702);assertTrue(PathUtils.directoryContentEquals(dir2, dir2));
        }
        // Tree equals false tests
        {
            __CLR4_4_1dm1dm1kylve28d.R.inc(17703);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files/dirs-and-files1/directory-files-only1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17704);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files/dirs-and-files1/");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17705);assertFalse(PathUtils.directoryContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17706);assertFalse(PathUtils.directoryContentEquals(dir2, dir1));
        }
        {
            __CLR4_4_1dm1dm1kylve28d.R.inc(17707);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17708);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-then-files");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17709);assertFalse(PathUtils.directoryContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17710);assertFalse(PathUtils.directoryContentEquals(dir2, dir1));
        }
    }finally{__CLR4_4_1dm1dm1kylve28d.R.flushNeeded();}}

    @Test
    public void testDirectoryAndFileContentEquals() throws Exception {__CLR4_4_1dm1dm1kylve28d.R.globalSliceStart(getClass().getName(),17711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8iapldnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dm1dm1kylve28d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dm1dm1kylve28d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.file.PathUtilsContentEqualsTest.testDirectoryAndFileContentEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8iapldnz() throws Exception{try{__CLR4_4_1dm1dm1kylve28d.R.inc(17711);
        // Non-existent files
        __CLR4_4_1dm1dm1kylve28d.R.inc(17712);final Path path1 = new File(temporaryFolder, getName()).toPath();
        __CLR4_4_1dm1dm1kylve28d.R.inc(17713);final Path path2 = new File(temporaryFolder, getName() + "2").toPath();
        __CLR4_4_1dm1dm1kylve28d.R.inc(17714);assertTrue(PathUtils.directoryAndFileContentEquals(null, null));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17715);assertFalse(PathUtils.directoryAndFileContentEquals(null, path1));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17716);assertFalse(PathUtils.directoryAndFileContentEquals(path1, null));
        // both don't exist
        __CLR4_4_1dm1dm1kylve28d.R.inc(17717);assertTrue(PathUtils.directoryAndFileContentEquals(path1, path1));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17718);assertTrue(PathUtils.directoryAndFileContentEquals(path1, path2));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17719);assertTrue(PathUtils.directoryAndFileContentEquals(path2, path2));
        __CLR4_4_1dm1dm1kylve28d.R.inc(17720);assertTrue(PathUtils.directoryAndFileContentEquals(path2, path1));
        // Tree equals true tests
        {
            // Trees of files only that contain the same files.
            __CLR4_4_1dm1dm1kylve28d.R.inc(17721);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-files-only/directory-files-only1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17722);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-files-only/directory-files-only2");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17723);assertTrue(PathUtils.directoryAndFileContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17724);assertTrue(PathUtils.directoryAndFileContentEquals(dir2, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17725);assertTrue(PathUtils.directoryAndFileContentEquals(dir1, dir1));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17726);assertTrue(PathUtils.directoryAndFileContentEquals(dir2, dir2));
        }
        {
            // Trees of directories containing other directories.
            __CLR4_4_1dm1dm1kylve28d.R.inc(17727);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-then-files/dir1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17728);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-then-files/dir2");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17729);assertTrue(PathUtils.directoryAndFileContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17730);assertTrue(PathUtils.directoryAndFileContentEquals(dir2, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17731);assertTrue(PathUtils.directoryAndFileContentEquals(dir1, dir1));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17732);assertTrue(PathUtils.directoryAndFileContentEquals(dir2, dir2));
        }
        {
            // Trees of directories containing other directories and files.
            __CLR4_4_1dm1dm1kylve28d.R.inc(17733);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files/dirs-and-files1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17734);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files/dirs-and-files1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17735);assertTrue(PathUtils.directoryAndFileContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17736);assertTrue(PathUtils.directoryAndFileContentEquals(dir2, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17737);assertTrue(PathUtils.directoryAndFileContentEquals(dir1, dir1));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17738);assertTrue(PathUtils.directoryAndFileContentEquals(dir2, dir2));
        }
        // Tree equals false tests
        {
            __CLR4_4_1dm1dm1kylve28d.R.inc(17739);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files/dirs-and-files1/directory-files-only1");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17740);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files/dirs-and-files1/");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17741);assertFalse(PathUtils.directoryAndFileContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17742);assertFalse(PathUtils.directoryAndFileContentEquals(dir2, dir1));
        }
        {
            __CLR4_4_1dm1dm1kylve28d.R.inc(17743);final Path dir1 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-and-files");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17744);final Path dir2 = Paths.get("src/test/resources/dir-equals-tests/dir-equals-dirs-then-files");
            __CLR4_4_1dm1dm1kylve28d.R.inc(17745);assertFalse(PathUtils.directoryAndFileContentEquals(dir1, dir2));
            __CLR4_4_1dm1dm1kylve28d.R.inc(17746);assertFalse(PathUtils.directoryAndFileContentEquals(dir2, dir1));
        }
    }finally{__CLR4_4_1dm1dm1kylve28d.R.flushNeeded();}}

}
