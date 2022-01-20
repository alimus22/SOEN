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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.file.PathUtilsIsEmptyTest;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.NameFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.commons.io.test.TestUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * This is used to test FileUtils for correctness.
 *
 * @see FileUtils
 */
@SuppressWarnings({"deprecation", "ResultOfMethodCallIgnored"}) // unit tests include tests of many deprecated methods
public class FileUtilsTestCase {static class __CLR4_4_198o98okylve1fh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,13838,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * DirectoryWalker implementation that recursively lists all files and directories.
     */
    static class ListDirectoryWalker extends DirectoryWalker<File> {

        ListDirectoryWalker() {try{__CLR4_4_198o98okylve1fh.R.inc(11976);
        }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

        @Override
        protected void handleDirectoryStart(final File directory, final int depth, final Collection<File> results) throws IOException {try{__CLR4_4_198o98okylve1fh.R.inc(11977);
            // Add all directories except the starting directory
            __CLR4_4_198o98okylve1fh.R.inc(11978);if ((((depth > 0)&&(__CLR4_4_198o98okylve1fh.R.iget(11979)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(11980)==0&false))) {{
                __CLR4_4_198o98okylve1fh.R.inc(11981);results.add(directory);
            }
        }}finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

        @Override
        protected void handleFile(final File file, final int depth, final Collection<File> results) throws IOException {try{__CLR4_4_198o98okylve1fh.R.inc(11982);
            __CLR4_4_198o98okylve1fh.R.inc(11983);results.add(file);
        }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

        List<File> list(final File startDirectory) throws IOException {try{__CLR4_4_198o98okylve1fh.R.inc(11984);
            __CLR4_4_198o98okylve1fh.R.inc(11985);final ArrayList<File> files = new ArrayList<>();
            __CLR4_4_198o98okylve1fh.R.inc(11986);walk(startDirectory, files);
            __CLR4_4_198o98okylve1fh.R.inc(11987);return files;
        }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}
    }

    // Test helper class to pretend a file is shorter than it is
    private static class ShorterFile extends File {
        private static final long serialVersionUID = 1L;

        public ShorterFile(final String pathname) {
            super(pathname);__CLR4_4_198o98okylve1fh.R.inc(11989);try{__CLR4_4_198o98okylve1fh.R.inc(11988);
        }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

        @Override
        public long length() {try{__CLR4_4_198o98okylve1fh.R.inc(11990);
            __CLR4_4_198o98okylve1fh.R.inc(11991);return super.length() - 1;
        }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}
    }

    /** Test data. */
    private static final long DATE3 = 1000000002000L;

    /** Test data. */
    private static final long DATE2 = 1000000001000L;

    /** Test data. */
    private static final long DATE1 = 1000000000000L;

    /**
     * Size of test directory.
     */
    private static final int TEST_DIRECTORY_SIZE = 0;

    /**
     * Size of test directory.
     */
    private static final BigInteger TEST_DIRECTORY_SIZE_BI = BigInteger.ZERO;

    /**
     * Size (greater of zero) of test file.
     */
    private static final BigInteger TEST_DIRECTORY_SIZE_GT_ZERO_BI = BigInteger.valueOf(100);

    /**
     * List files recursively
     */
    private static final ListDirectoryWalker LIST_WALKER = new ListDirectoryWalker();
    @TempDir
    public File temporaryFolder;

    /**
     * Delay in milliseconds to make sure test for "last modified date" are accurate
     */
    //private static final int LAST_MODIFIED_DELAY = 600;

    private File testFile1;
    private File testFile2;

    private long testFile1Size;

    private long testFile2Size;

    private void backDateFile10Minutes(final File testFile) throws IOException {try{__CLR4_4_198o98okylve1fh.R.inc(11992);
        __CLR4_4_198o98okylve1fh.R.inc(11993);final long mins10 = 1000 * 60 * 10;
        __CLR4_4_198o98okylve1fh.R.inc(11994);final long lastModified1 = getLastModifiedMillis(testFile);
        __CLR4_4_198o98okylve1fh.R.inc(11995);assertTrue(setLastModifiedMillis(testFile, lastModified1 - mins10));
        // ensure it was changed
        __CLR4_4_198o98okylve1fh.R.inc(11996);assertNotEquals(getLastModifiedMillis(testFile), lastModified1, "Should have changed source date");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    private void consumeRemaining(final Iterator<File> iterator) {try{__CLR4_4_198o98okylve1fh.R.inc(11997);
        __CLR4_4_198o98okylve1fh.R.inc(11998);if ((((iterator != null)&&(__CLR4_4_198o98okylve1fh.R.iget(11999)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12000)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12001);iterator.forEachRemaining(e -> {});
        }
    }}finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    private void createCircularSymLink(final File file) throws IOException {try{__CLR4_4_198o98okylve1fh.R.inc(12002);
        __CLR4_4_198o98okylve1fh.R.inc(12003);if ((((!FilenameUtils.isSystemWindows())&&(__CLR4_4_198o98okylve1fh.R.iget(12004)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12005)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12006);Runtime.getRuntime()
                    .exec("ln -s " + file + "/.. " + file + "/cycle");
        } }else {{
            __CLR4_4_198o98okylve1fh.R.inc(12007);try {
                __CLR4_4_198o98okylve1fh.R.inc(12008);Runtime.getRuntime()
                        .exec("mklink /D " + file + "/cycle" + file + "/.. ");
            } catch (final IOException ioe) { // So that tests run in FAT filesystems
                //don't fail
            }
        }
    }}finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    private void createFilesForTestCopyDirectory(final File grandParentDir, final File parentDir, final File childDir) throws Exception {try{__CLR4_4_198o98okylve1fh.R.inc(12009);
        __CLR4_4_198o98okylve1fh.R.inc(12010);final File childDir2 = new File(parentDir, "child2");
        __CLR4_4_198o98okylve1fh.R.inc(12011);final File grandChildDir = new File(childDir, "grandChild");
        __CLR4_4_198o98okylve1fh.R.inc(12012);final File grandChild2Dir = new File(childDir2, "grandChild2");
        __CLR4_4_198o98okylve1fh.R.inc(12013);final File file1 = new File(grandParentDir, "file1.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12014);final File file2 = new File(parentDir, "file2.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12015);final File file3 = new File(childDir, "file3.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12016);final File file4 = new File(childDir2, "file4.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12017);final File file5 = new File(grandChildDir, "file5.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12018);final File file6 = new File(grandChild2Dir, "file6.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12019);FileUtils.deleteDirectory(grandParentDir);
        __CLR4_4_198o98okylve1fh.R.inc(12020);grandChildDir.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12021);grandChild2Dir.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12022);FileUtils.writeStringToFile(file1, "File 1 in grandparent", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(12023);FileUtils.writeStringToFile(file2, "File 2 in parent", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(12024);FileUtils.writeStringToFile(file3, "File 3 in child", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(12025);FileUtils.writeStringToFile(file4, "File 4 in child2", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(12026);FileUtils.writeStringToFile(file5, "File 5 in grandChild", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(12027);FileUtils.writeStringToFile(file6, "File 6 in grandChild2", "UTF8");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    private long getLastModifiedMillis(final File file) throws IOException {try{__CLR4_4_198o98okylve1fh.R.inc(12028);
        __CLR4_4_198o98okylve1fh.R.inc(12029);return FileUtils.lastModified(file);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    private String getName() {try{__CLR4_4_198o98okylve1fh.R.inc(12030);
        __CLR4_4_198o98okylve1fh.R.inc(12031);return this.getClass().getSimpleName();
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    private void iterateFilesAndDirs(final File dir, final IOFileFilter fileFilter,
        final IOFileFilter dirFilter, final Collection<File> expectedFilesAndDirs) {try{__CLR4_4_198o98okylve1fh.R.inc(12032);
        __CLR4_4_198o98okylve1fh.R.inc(12033);final Iterator<File> iterator;
        __CLR4_4_198o98okylve1fh.R.inc(12034);int filesCount = 0;
        __CLR4_4_198o98okylve1fh.R.inc(12035);iterator = FileUtils.iterateFilesAndDirs(dir, fileFilter, dirFilter);
        __CLR4_4_198o98okylve1fh.R.inc(12036);try {
            __CLR4_4_198o98okylve1fh.R.inc(12037);final List<File> actualFiles = new ArrayList<>();
            __CLR4_4_198o98okylve1fh.R.inc(12038);while ((((iterator.hasNext())&&(__CLR4_4_198o98okylve1fh.R.iget(12039)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12040)==0&false))) {{
                __CLR4_4_198o98okylve1fh.R.inc(12041);filesCount++;
                __CLR4_4_198o98okylve1fh.R.inc(12042);final File file = iterator.next();
                __CLR4_4_198o98okylve1fh.R.inc(12043);actualFiles.add(file);
                __CLR4_4_198o98okylve1fh.R.inc(12044);assertTrue(expectedFilesAndDirs.contains(file),
                    () -> "Unexpected directory/file " + file + ", expected one of " + expectedFilesAndDirs);
            }
            }__CLR4_4_198o98okylve1fh.R.inc(12045);assertEquals(expectedFilesAndDirs.size(), filesCount, () -> actualFiles.toString());
        } finally {
            // MUST consume until the end in order to close the underlying stream.
            __CLR4_4_198o98okylve1fh.R.inc(12046);consumeRemaining(iterator);
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    void openOutputStream_noParent(final boolean createFile) throws Exception {try{__CLR4_4_198o98okylve1fh.R.inc(12047);
        __CLR4_4_198o98okylve1fh.R.inc(12048);final File file = new File("test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12049);assertNull(file.getParentFile());
        __CLR4_4_198o98okylve1fh.R.inc(12050);try {
            __CLR4_4_198o98okylve1fh.R.inc(12051);if ((((createFile)&&(__CLR4_4_198o98okylve1fh.R.iget(12052)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12053)==0&false))) {{
                __CLR4_4_198o98okylve1fh.R.inc(12054);TestUtils.createLineBasedFile(file, new String[]{"Hello"});
            }
            }class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12055);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_198o98okylve1fh.R.inc(12056);}};FileOutputStream out = FileUtils.openOutputStream(file)) {
                __CLR4_4_198o98okylve1fh.R.inc(12057);out.write(0);
            }
            __CLR4_4_198o98okylve1fh.R.inc(12058);assertTrue(file.exists());
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12059);if ((((!file.delete())&&(__CLR4_4_198o98okylve1fh.R.iget(12060)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12061)==0&false))) {{
                __CLR4_4_198o98okylve1fh.R.inc(12062);file.deleteOnExit();
            }
        }}
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    private boolean setLastModifiedMillis(final File testFile, final long millis) {try{__CLR4_4_198o98okylve1fh.R.inc(12063);
        __CLR4_4_198o98okylve1fh.R.inc(12064);return testFile.setLastModified(millis);
//        try {
//            Files.setLastModifiedTime(testFile.toPath(), FileTime.fromMillis(millis));
//        } catch (IOException e) {
//            return false;
//        }
//        return true;
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @BeforeEach
    public void setUp() throws Exception {try{__CLR4_4_198o98okylve1fh.R.inc(12065);
        __CLR4_4_198o98okylve1fh.R.inc(12066);testFile1 = new File(temporaryFolder, "file1-test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12067);testFile2 = new File(temporaryFolder, "file1a-test.txt");

        __CLR4_4_198o98okylve1fh.R.inc(12068);testFile1Size = testFile1.length();
        __CLR4_4_198o98okylve1fh.R.inc(12069);testFile2Size = testFile2.length();
        __CLR4_4_198o98okylve1fh.R.inc(12070);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12071)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12072)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12073);throw new IOException("Cannot create file " + testFile1
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12074);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_198o98okylve1fh.R.inc(12075);}};final BufferedOutputStream output3 =
                new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()))) {
            __CLR4_4_198o98okylve1fh.R.inc(12076);TestUtils.generateTestData(output3, testFile1Size);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12077);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12078)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12079)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12080);throw new IOException("Cannot create file " + testFile2
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12081);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_198o98okylve1fh.R.inc(12082);}};final BufferedOutputStream output2 =
                new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()))) {
            __CLR4_4_198o98okylve1fh.R.inc(12083);TestUtils.generateTestData(output2, testFile2Size);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12084);FileUtils.deleteDirectory(temporaryFolder);
        __CLR4_4_198o98okylve1fh.R.inc(12085);temporaryFolder.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12086);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12087)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12088)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12089);throw new IOException("Cannot create file " + testFile1
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12090);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_198o98okylve1fh.R.inc(12091);}};final BufferedOutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()))) {
            __CLR4_4_198o98okylve1fh.R.inc(12092);TestUtils.generateTestData(output1, testFile1Size);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12093);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12094)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12095)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12096);throw new IOException("Cannot create file " + testFile2
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12097);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_198o98okylve1fh.R.inc(12098);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()))) {
            __CLR4_4_198o98okylve1fh.R.inc(12099);TestUtils.generateTestData(output, testFile2Size);
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void test_openInputStream_exists() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zz0sv9c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.test_openInputStream_exists",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zz0sv9c4() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12100);
        __CLR4_4_198o98okylve1fh.R.inc(12101);final File file = new File(temporaryFolder, "test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12102);TestUtils.createLineBasedFile(file, new String[]{"Hello"});
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12103);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_198o98okylve1fh.R.inc(12104);}};FileInputStream in = FileUtils.openInputStream(file)) {
            __CLR4_4_198o98okylve1fh.R.inc(12105);assertEquals('H', in.read());
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void test_openInputStream_existsButIsDirectory() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118awup9ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.test_openInputStream_existsButIsDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118awup9ca(){try{__CLR4_4_198o98okylve1fh.R.inc(12106);
        __CLR4_4_198o98okylve1fh.R.inc(12107);final File directory = new File(temporaryFolder, "subdir");
        __CLR4_4_198o98okylve1fh.R.inc(12108);directory.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12109);assertThrows(IOException.class, () -> FileUtils.openInputStream(directory));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void test_openInputStream_notExists() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mtkjey9ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.test_openInputStream_notExists",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mtkjey9ce(){try{__CLR4_4_198o98okylve1fh.R.inc(12110);
        __CLR4_4_198o98okylve1fh.R.inc(12111);final File directory = new File(temporaryFolder, "test.txt");
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12112);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_198o98okylve1fh.R.inc(12113);}};FileInputStream in = FileUtils.openInputStream(directory)) {
            __CLR4_4_198o98okylve1fh.R.inc(12114);fail();
        } catch (final IOException ioe) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void test_openOutputStream_exists() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndfe2e9cj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.test_openOutputStream_exists",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndfe2e9cj() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12115);
        __CLR4_4_198o98okylve1fh.R.inc(12116);final File file = new File(temporaryFolder, "test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12117);TestUtils.createLineBasedFile(file, new String[]{"Hello"});
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12118);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_198o98okylve1fh.R.inc(12119);}};FileOutputStream out = FileUtils.openOutputStream(file)) {
            __CLR4_4_198o98okylve1fh.R.inc(12120);out.write(0);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12121);assertTrue(file.exists());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void test_openOutputStream_existsButIsDirectory() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dd7g389cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.test_openOutputStream_existsButIsDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dd7g389cq(){try{__CLR4_4_198o98okylve1fh.R.inc(12122);
        __CLR4_4_198o98okylve1fh.R.inc(12123);final File directory = new File(temporaryFolder, "subdir");
        __CLR4_4_198o98okylve1fh.R.inc(12124);directory.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12125);assertThrows(IllegalArgumentException.class, () -> FileUtils.openOutputStream(directory));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void test_openOutputStream_noParentCreateFile() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pj8gep9cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.test_openOutputStream_noParentCreateFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pj8gep9cu() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12126);
        __CLR4_4_198o98okylve1fh.R.inc(12127);openOutputStream_noParent(true);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void test_openOutputStream_noParentNoFile() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4br629cw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.test_openOutputStream_noParentNoFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4br629cw() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12128);
        __CLR4_4_198o98okylve1fh.R.inc(12129);openOutputStream_noParent(false);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void test_openOutputStream_notExists() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bggppr9cy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.test_openOutputStream_notExists",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bggppr9cy() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12130);
        __CLR4_4_198o98okylve1fh.R.inc(12131);final File file = new File(temporaryFolder, "a/test.txt");
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12132);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_198o98okylve1fh.R.inc(12133);}};FileOutputStream out = FileUtils.openOutputStream(file)) {
            __CLR4_4_198o98okylve1fh.R.inc(12134);out.write(0);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12135);assertTrue(file.exists());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void test_openOutputStream_notExistsCannotCreate() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9lpde9d4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.test_openOutputStream_notExistsCannotCreate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9lpde9d4(){try{__CLR4_4_198o98okylve1fh.R.inc(12136);
        // according to Wikipedia, most filing systems have a 256 limit on filename
        __CLR4_4_198o98okylve1fh.R.inc(12137);final String longStr =
                "abcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyz" +
                        "abcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyz" +
                        "abcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyz" +
                        "abcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyz" +
                        "abcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyz" +
                        "abcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyzabcdevwxyz";  // 300 chars
        __CLR4_4_198o98okylve1fh.R.inc(12138);final File file = new File(temporaryFolder, "a/" + longStr + "/test.txt");
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12139);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_198o98okylve1fh.R.inc(12140);}};FileOutputStream out = FileUtils.openOutputStream(file)) {
            __CLR4_4_198o98okylve1fh.R.inc(12141);fail();
        } catch (final IOException ioe) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // byteCountToDisplaySize
    @Test
    public void testByteCountToDisplaySizeBigInteger() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1leemjc9da();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testByteCountToDisplaySizeBigInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1leemjc9da(){try{__CLR4_4_198o98okylve1fh.R.inc(12142);
        __CLR4_4_198o98okylve1fh.R.inc(12143);final BigInteger b1023 = BigInteger.valueOf(1023);
        __CLR4_4_198o98okylve1fh.R.inc(12144);final BigInteger b1025 = BigInteger.valueOf(1025);
        __CLR4_4_198o98okylve1fh.R.inc(12145);final BigInteger KB1 = BigInteger.valueOf(1024);
        __CLR4_4_198o98okylve1fh.R.inc(12146);final BigInteger MB1 = KB1.multiply(KB1);
        __CLR4_4_198o98okylve1fh.R.inc(12147);final BigInteger GB1 = MB1.multiply(KB1);
        __CLR4_4_198o98okylve1fh.R.inc(12148);final BigInteger GB2 = GB1.add(GB1);
        __CLR4_4_198o98okylve1fh.R.inc(12149);final BigInteger TB1 = GB1.multiply(KB1);
        __CLR4_4_198o98okylve1fh.R.inc(12150);final BigInteger PB1 = TB1.multiply(KB1);
        __CLR4_4_198o98okylve1fh.R.inc(12151);final BigInteger EB1 = PB1.multiply(KB1);
        __CLR4_4_198o98okylve1fh.R.inc(12152);assertEquals("0 bytes", FileUtils.byteCountToDisplaySize(BigInteger.ZERO));
        __CLR4_4_198o98okylve1fh.R.inc(12153);assertEquals("1 bytes", FileUtils.byteCountToDisplaySize(BigInteger.ONE));
        __CLR4_4_198o98okylve1fh.R.inc(12154);assertEquals("1023 bytes", FileUtils.byteCountToDisplaySize(b1023));
        __CLR4_4_198o98okylve1fh.R.inc(12155);assertEquals("1 KB", FileUtils.byteCountToDisplaySize(KB1));
        __CLR4_4_198o98okylve1fh.R.inc(12156);assertEquals("1 KB", FileUtils.byteCountToDisplaySize(b1025));
        __CLR4_4_198o98okylve1fh.R.inc(12157);assertEquals("1023 KB", FileUtils.byteCountToDisplaySize(MB1.subtract(BigInteger.ONE)));
        __CLR4_4_198o98okylve1fh.R.inc(12158);assertEquals("1 MB", FileUtils.byteCountToDisplaySize(MB1));
        __CLR4_4_198o98okylve1fh.R.inc(12159);assertEquals("1 MB", FileUtils.byteCountToDisplaySize(MB1.add(BigInteger.ONE)));
        __CLR4_4_198o98okylve1fh.R.inc(12160);assertEquals("1023 MB", FileUtils.byteCountToDisplaySize(GB1.subtract(BigInteger.ONE)));
        __CLR4_4_198o98okylve1fh.R.inc(12161);assertEquals("1 GB", FileUtils.byteCountToDisplaySize(GB1));
        __CLR4_4_198o98okylve1fh.R.inc(12162);assertEquals("1 GB", FileUtils.byteCountToDisplaySize(GB1.add(BigInteger.ONE)));
        __CLR4_4_198o98okylve1fh.R.inc(12163);assertEquals("2 GB", FileUtils.byteCountToDisplaySize(GB2));
        __CLR4_4_198o98okylve1fh.R.inc(12164);assertEquals("1 GB", FileUtils.byteCountToDisplaySize(GB2.subtract(BigInteger.ONE)));
        __CLR4_4_198o98okylve1fh.R.inc(12165);assertEquals("1 TB", FileUtils.byteCountToDisplaySize(TB1));
        __CLR4_4_198o98okylve1fh.R.inc(12166);assertEquals("1 PB", FileUtils.byteCountToDisplaySize(PB1));
        __CLR4_4_198o98okylve1fh.R.inc(12167);assertEquals("1 EB", FileUtils.byteCountToDisplaySize(EB1));
        __CLR4_4_198o98okylve1fh.R.inc(12168);assertEquals("7 EB", FileUtils.byteCountToDisplaySize(Long.MAX_VALUE));
        // Other MAX_VALUEs
        __CLR4_4_198o98okylve1fh.R.inc(12169);assertEquals("63 KB", FileUtils.byteCountToDisplaySize(BigInteger.valueOf(Character.MAX_VALUE)));
        __CLR4_4_198o98okylve1fh.R.inc(12170);assertEquals("31 KB", FileUtils.byteCountToDisplaySize(BigInteger.valueOf(Short.MAX_VALUE)));
        __CLR4_4_198o98okylve1fh.R.inc(12171);assertEquals("1 GB", FileUtils.byteCountToDisplaySize(BigInteger.valueOf(Integer.MAX_VALUE)));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @SuppressWarnings("NumericOverflow")
    @Test
    public void testByteCountToDisplaySizeLong() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1anm4c69e4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testByteCountToDisplaySizeLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1anm4c69e4(){try{__CLR4_4_198o98okylve1fh.R.inc(12172);
        __CLR4_4_198o98okylve1fh.R.inc(12173);assertEquals("0 bytes", FileUtils.byteCountToDisplaySize(0));
        __CLR4_4_198o98okylve1fh.R.inc(12174);assertEquals("1 bytes", FileUtils.byteCountToDisplaySize(1));
        __CLR4_4_198o98okylve1fh.R.inc(12175);assertEquals("1023 bytes", FileUtils.byteCountToDisplaySize(1023));
        __CLR4_4_198o98okylve1fh.R.inc(12176);assertEquals("1 KB", FileUtils.byteCountToDisplaySize(1024));
        __CLR4_4_198o98okylve1fh.R.inc(12177);assertEquals("1 KB", FileUtils.byteCountToDisplaySize(1025));
        __CLR4_4_198o98okylve1fh.R.inc(12178);assertEquals("1023 KB", FileUtils.byteCountToDisplaySize(1024 * 1023));
        __CLR4_4_198o98okylve1fh.R.inc(12179);assertEquals("1 MB", FileUtils.byteCountToDisplaySize(1024 * 1024));
        __CLR4_4_198o98okylve1fh.R.inc(12180);assertEquals("1 MB", FileUtils.byteCountToDisplaySize(1024 * 1025));
        __CLR4_4_198o98okylve1fh.R.inc(12181);assertEquals("1023 MB", FileUtils.byteCountToDisplaySize(1024 * 1024 * 1023));
        __CLR4_4_198o98okylve1fh.R.inc(12182);assertEquals("1 GB", FileUtils.byteCountToDisplaySize(1024 * 1024 * 1024));
        __CLR4_4_198o98okylve1fh.R.inc(12183);assertEquals("1 GB", FileUtils.byteCountToDisplaySize(1024 * 1024 * 1025));
        __CLR4_4_198o98okylve1fh.R.inc(12184);assertEquals("2 GB", FileUtils.byteCountToDisplaySize(1024L * 1024 * 1024 * 2));
        __CLR4_4_198o98okylve1fh.R.inc(12185);assertEquals("1 GB", FileUtils.byteCountToDisplaySize(1024 * 1024 * 1024 * 2 - 1));
        __CLR4_4_198o98okylve1fh.R.inc(12186);assertEquals("1 TB", FileUtils.byteCountToDisplaySize(1024L * 1024 * 1024 * 1024));
        __CLR4_4_198o98okylve1fh.R.inc(12187);assertEquals("1 PB", FileUtils.byteCountToDisplaySize(1024L * 1024 * 1024 * 1024 * 1024));
        __CLR4_4_198o98okylve1fh.R.inc(12188);assertEquals("1 EB", FileUtils.byteCountToDisplaySize(1024L * 1024 * 1024 * 1024 * 1024 * 1024));
        __CLR4_4_198o98okylve1fh.R.inc(12189);assertEquals("7 EB", FileUtils.byteCountToDisplaySize(Long.MAX_VALUE));
        // Other MAX_VALUEs
        __CLR4_4_198o98okylve1fh.R.inc(12190);assertEquals("63 KB", FileUtils.byteCountToDisplaySize(Character.MAX_VALUE));
        __CLR4_4_198o98okylve1fh.R.inc(12191);assertEquals("31 KB", FileUtils.byteCountToDisplaySize(Short.MAX_VALUE));
        __CLR4_4_198o98okylve1fh.R.inc(12192);assertEquals("1 GB", FileUtils.byteCountToDisplaySize(Integer.MAX_VALUE));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testChecksum() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18imhyc9ep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testChecksum",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18imhyc9ep() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12193);
        // create a test file
        __CLR4_4_198o98okylve1fh.R.inc(12194);final String text = "Imagination is more important than knowledge - Einstein";
        __CLR4_4_198o98okylve1fh.R.inc(12195);final File file = new File(temporaryFolder, "checksum-test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12196);FileUtils.writeStringToFile(file, text, "US-ASCII");

        // compute the expected checksum
        __CLR4_4_198o98okylve1fh.R.inc(12197);final Checksum expectedChecksum = new CRC32();
        __CLR4_4_198o98okylve1fh.R.inc(12198);expectedChecksum.update(text.getBytes(StandardCharsets.US_ASCII), 0, text.length());
        __CLR4_4_198o98okylve1fh.R.inc(12199);final long expectedValue = expectedChecksum.getValue();

        // compute the checksum of the file
        __CLR4_4_198o98okylve1fh.R.inc(12200);final Checksum testChecksum = new CRC32();
        __CLR4_4_198o98okylve1fh.R.inc(12201);final Checksum resultChecksum = FileUtils.checksum(file, testChecksum);
        __CLR4_4_198o98okylve1fh.R.inc(12202);final long resultValue = resultChecksum.getValue();

        __CLR4_4_198o98okylve1fh.R.inc(12203);assertSame(testChecksum, resultChecksum);
        __CLR4_4_198o98okylve1fh.R.inc(12204);assertEquals(expectedValue, resultValue);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testChecksumCRC32() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y62ked9f1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testChecksumCRC32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y62ked9f1() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12205);
        // create a test file
        __CLR4_4_198o98okylve1fh.R.inc(12206);final String text = "Imagination is more important than knowledge - Einstein";
        __CLR4_4_198o98okylve1fh.R.inc(12207);final File file = new File(temporaryFolder, "checksum-test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12208);FileUtils.writeStringToFile(file, text, "US-ASCII");

        // compute the expected checksum
        __CLR4_4_198o98okylve1fh.R.inc(12209);final Checksum expectedChecksum = new CRC32();
        __CLR4_4_198o98okylve1fh.R.inc(12210);expectedChecksum.update(text.getBytes(StandardCharsets.US_ASCII), 0, text.length());
        __CLR4_4_198o98okylve1fh.R.inc(12211);final long expectedValue = expectedChecksum.getValue();

        // compute the checksum of the file
        __CLR4_4_198o98okylve1fh.R.inc(12212);final long resultValue = FileUtils.checksumCRC32(file);

        __CLR4_4_198o98okylve1fh.R.inc(12213);assertEquals(expectedValue, resultValue);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testChecksumDouble() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csm1t99fa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testChecksumDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csm1t99fa() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12214);
        // create a test file
        __CLR4_4_198o98okylve1fh.R.inc(12215);final String text1 = "Imagination is more important than knowledge - Einstein";
        __CLR4_4_198o98okylve1fh.R.inc(12216);final File file1 = new File(temporaryFolder, "checksum-test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12217);FileUtils.writeStringToFile(file1, text1, "US-ASCII");

        // create a second test file
        __CLR4_4_198o98okylve1fh.R.inc(12218);final String text2 = "To be or not to be - Shakespeare";
        __CLR4_4_198o98okylve1fh.R.inc(12219);final File file2 = new File(temporaryFolder, "checksum-test2.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12220);FileUtils.writeStringToFile(file2, text2, "US-ASCII");

        // compute the expected checksum
        __CLR4_4_198o98okylve1fh.R.inc(12221);final Checksum expectedChecksum = new CRC32();
        __CLR4_4_198o98okylve1fh.R.inc(12222);expectedChecksum.update(text1.getBytes(StandardCharsets.US_ASCII), 0, text1.length());
        __CLR4_4_198o98okylve1fh.R.inc(12223);expectedChecksum.update(text2.getBytes(StandardCharsets.US_ASCII), 0, text2.length());
        __CLR4_4_198o98okylve1fh.R.inc(12224);final long expectedValue = expectedChecksum.getValue();

        // compute the checksum of the file
        __CLR4_4_198o98okylve1fh.R.inc(12225);final Checksum testChecksum = new CRC32();
        __CLR4_4_198o98okylve1fh.R.inc(12226);FileUtils.checksum(file1, testChecksum);
        __CLR4_4_198o98okylve1fh.R.inc(12227);FileUtils.checksum(file2, testChecksum);
        __CLR4_4_198o98okylve1fh.R.inc(12228);final long resultValue = testChecksum.getValue();

        __CLR4_4_198o98okylve1fh.R.inc(12229);assertEquals(expectedValue, resultValue);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testChecksumOnDirectory() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12i0w5c9fq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testChecksumOnDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12i0w5c9fq() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12230);
        __CLR4_4_198o98okylve1fh.R.inc(12231);try {
            __CLR4_4_198o98okylve1fh.R.inc(12232);FileUtils.checksum(new File("."), new CRC32());
            __CLR4_4_198o98okylve1fh.R.inc(12233);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testChecksumOnNullChecksum() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kromgr9fu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testChecksumOnNullChecksum",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kromgr9fu() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12234);
        // create a test file
        __CLR4_4_198o98okylve1fh.R.inc(12235);final String text = "Imagination is more important than knowledge - Einstein";
        __CLR4_4_198o98okylve1fh.R.inc(12236);final File file = new File(temporaryFolder, "checksum-test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12237);FileUtils.writeStringToFile(file, text, "US-ASCII");
        __CLR4_4_198o98okylve1fh.R.inc(12238);try {
            __CLR4_4_198o98okylve1fh.R.inc(12239);FileUtils.checksum(file, null);
            __CLR4_4_198o98okylve1fh.R.inc(12240);fail();
        } catch (final NullPointerException ex) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testChecksumOnNullFile() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyy1um9g1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testChecksumOnNullFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyy1um9g1() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12241);
        __CLR4_4_198o98okylve1fh.R.inc(12242);try {
            __CLR4_4_198o98okylve1fh.R.inc(12243);FileUtils.checksum(null, new CRC32());
            __CLR4_4_198o98okylve1fh.R.inc(12244);fail();
        } catch (final NullPointerException ex) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // Compare sizes of a directory tree using long and BigInteger methods
    @Test
    public void testCompareSizeOf() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kvpfy9g5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCompareSizeOf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kvpfy9g5(){try{__CLR4_4_198o98okylve1fh.R.inc(12245);
        __CLR4_4_198o98okylve1fh.R.inc(12246);final File start = new File("src/test/java");
        __CLR4_4_198o98okylve1fh.R.inc(12247);final long sizeLong1 = FileUtils.sizeOf(start);
        __CLR4_4_198o98okylve1fh.R.inc(12248);final BigInteger sizeBig = FileUtils.sizeOfAsBigInteger(start);
        __CLR4_4_198o98okylve1fh.R.inc(12249);final long sizeLong2 = FileUtils.sizeOf(start);
        __CLR4_4_198o98okylve1fh.R.inc(12250);assertEquals(sizeLong1, sizeLong2, "Size should not change");
        __CLR4_4_198o98okylve1fh.R.inc(12251);assertEquals(sizeLong1, sizeBig.longValue(), "longSize should equal BigSize");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testContentEquals() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1brhu3x9gc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testContentEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1brhu3x9gc() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12252);
        // Non-existent files
        __CLR4_4_198o98okylve1fh.R.inc(12253);final File file = new File(temporaryFolder, getName());
        __CLR4_4_198o98okylve1fh.R.inc(12254);final File file2 = new File(temporaryFolder, getName() + "2");
        __CLR4_4_198o98okylve1fh.R.inc(12255);assertTrue(FileUtils.contentEquals(null, null));
        __CLR4_4_198o98okylve1fh.R.inc(12256);assertFalse(FileUtils.contentEquals(null, file));
        __CLR4_4_198o98okylve1fh.R.inc(12257);assertFalse(FileUtils.contentEquals(file, null));
        // both don't  exist
        __CLR4_4_198o98okylve1fh.R.inc(12258);assertTrue(FileUtils.contentEquals(file, file));
        __CLR4_4_198o98okylve1fh.R.inc(12259);assertTrue(FileUtils.contentEquals(file, file2));
        __CLR4_4_198o98okylve1fh.R.inc(12260);assertTrue(FileUtils.contentEquals(file2, file2));
        __CLR4_4_198o98okylve1fh.R.inc(12261);assertTrue(FileUtils.contentEquals(file2, file));

        // Directories
        __CLR4_4_198o98okylve1fh.R.inc(12262);assertThrows(IllegalArgumentException.class, () -> FileUtils.contentEquals(temporaryFolder, temporaryFolder));

        // Different files
        __CLR4_4_198o98okylve1fh.R.inc(12263);final File objFile1 =
                new File(temporaryFolder, getName() + ".object");
        __CLR4_4_198o98okylve1fh.R.inc(12264);objFile1.deleteOnExit();
        __CLR4_4_198o98okylve1fh.R.inc(12265);FileUtils.copyURLToFile(
                getClass().getResource("/java/lang/Object.class"),
                objFile1);

        __CLR4_4_198o98okylve1fh.R.inc(12266);final File objFile1b =
                new File(temporaryFolder, getName() + ".object2");
        __CLR4_4_198o98okylve1fh.R.inc(12267);objFile1.deleteOnExit();
        __CLR4_4_198o98okylve1fh.R.inc(12268);FileUtils.copyURLToFile(
                getClass().getResource("/java/lang/Object.class"),
                objFile1b);

        __CLR4_4_198o98okylve1fh.R.inc(12269);final File objFile2 =
                new File(temporaryFolder, getName() + ".collection");
        __CLR4_4_198o98okylve1fh.R.inc(12270);objFile2.deleteOnExit();
        __CLR4_4_198o98okylve1fh.R.inc(12271);FileUtils.copyURLToFile(
                getClass().getResource("/java/util/Collection.class"),
                objFile2);

        __CLR4_4_198o98okylve1fh.R.inc(12272);assertFalse(FileUtils.contentEquals(objFile1, objFile2));
        __CLR4_4_198o98okylve1fh.R.inc(12273);assertFalse(FileUtils.contentEquals(objFile1b, objFile2));
        __CLR4_4_198o98okylve1fh.R.inc(12274);assertTrue(FileUtils.contentEquals(objFile1, objFile1b));

        __CLR4_4_198o98okylve1fh.R.inc(12275);assertTrue(FileUtils.contentEquals(objFile1, objFile1));
        __CLR4_4_198o98okylve1fh.R.inc(12276);assertTrue(FileUtils.contentEquals(objFile1b, objFile1b));
        __CLR4_4_198o98okylve1fh.R.inc(12277);assertTrue(FileUtils.contentEquals(objFile2, objFile2));

        // Equal files
        __CLR4_4_198o98okylve1fh.R.inc(12278);file.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(12279);file2.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(12280);assertTrue(FileUtils.contentEquals(file, file));
        __CLR4_4_198o98okylve1fh.R.inc(12281);assertTrue(FileUtils.contentEquals(file, file2));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // toFiles

    @Test
    public void testContentEqualsIgnoreEOL() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0on1r9h6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testContentEqualsIgnoreEOL",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0on1r9h6() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12282);
        // Non-existent files
        __CLR4_4_198o98okylve1fh.R.inc(12283);final File file1 = new File(temporaryFolder, getName());
        __CLR4_4_198o98okylve1fh.R.inc(12284);final File file2 = new File(temporaryFolder, getName() + "2");
        __CLR4_4_198o98okylve1fh.R.inc(12285);assertTrue(FileUtils.contentEqualsIgnoreEOL(null, null, null));
        __CLR4_4_198o98okylve1fh.R.inc(12286);assertFalse(FileUtils.contentEqualsIgnoreEOL(null, file1, null));
        __CLR4_4_198o98okylve1fh.R.inc(12287);assertFalse(FileUtils.contentEqualsIgnoreEOL(file1, null, null));
        // both don't  exist
        __CLR4_4_198o98okylve1fh.R.inc(12288);assertTrue(FileUtils.contentEqualsIgnoreEOL(file1, file1, null));
        __CLR4_4_198o98okylve1fh.R.inc(12289);assertTrue(FileUtils.contentEqualsIgnoreEOL(file1, file2, null));
        __CLR4_4_198o98okylve1fh.R.inc(12290);assertTrue(FileUtils.contentEqualsIgnoreEOL(file2, file2, null));
        __CLR4_4_198o98okylve1fh.R.inc(12291);assertTrue(FileUtils.contentEqualsIgnoreEOL(file2, file1, null));

        // Directories
        __CLR4_4_198o98okylve1fh.R.inc(12292);assertThrows(IllegalArgumentException.class,
            () -> FileUtils.contentEqualsIgnoreEOL(temporaryFolder, temporaryFolder, null));

        // Different files
        __CLR4_4_198o98okylve1fh.R.inc(12293);final File tfile1 = new File(temporaryFolder, getName() + ".txt1");
        __CLR4_4_198o98okylve1fh.R.inc(12294);tfile1.deleteOnExit();
        __CLR4_4_198o98okylve1fh.R.inc(12295);FileUtils.write(tfile1, "123\r");

        __CLR4_4_198o98okylve1fh.R.inc(12296);final File tfile2 = new File(temporaryFolder, getName() + ".txt2");
        __CLR4_4_198o98okylve1fh.R.inc(12297);tfile1.deleteOnExit();
        __CLR4_4_198o98okylve1fh.R.inc(12298);FileUtils.write(tfile2, "123\n");

        __CLR4_4_198o98okylve1fh.R.inc(12299);final File tfile3 = new File(temporaryFolder, getName() + ".collection");
        __CLR4_4_198o98okylve1fh.R.inc(12300);tfile3.deleteOnExit();
        __CLR4_4_198o98okylve1fh.R.inc(12301);FileUtils.write(tfile3, "123\r\n2");

        __CLR4_4_198o98okylve1fh.R.inc(12302);assertTrue(FileUtils.contentEqualsIgnoreEOL(tfile1, tfile1, null));
        __CLR4_4_198o98okylve1fh.R.inc(12303);assertTrue(FileUtils.contentEqualsIgnoreEOL(tfile2, tfile2, null));
        __CLR4_4_198o98okylve1fh.R.inc(12304);assertTrue(FileUtils.contentEqualsIgnoreEOL(tfile3, tfile3, null));

        __CLR4_4_198o98okylve1fh.R.inc(12305);assertTrue(FileUtils.contentEqualsIgnoreEOL(tfile1, tfile2, null));
        __CLR4_4_198o98okylve1fh.R.inc(12306);assertFalse(FileUtils.contentEqualsIgnoreEOL(tfile1, tfile3, null));
        __CLR4_4_198o98okylve1fh.R.inc(12307);assertFalse(FileUtils.contentEqualsIgnoreEOL(tfile2, tfile3, null));

        __CLR4_4_198o98okylve1fh.R.inc(12308);final URL urlCR = getClass().getResource("FileUtilsTestDataCR.dat");
        __CLR4_4_198o98okylve1fh.R.inc(12309);assertNotNull(urlCR);
        __CLR4_4_198o98okylve1fh.R.inc(12310);final File cr = new File(urlCR.toURI());
        __CLR4_4_198o98okylve1fh.R.inc(12311);assertTrue(cr.exists());

        __CLR4_4_198o98okylve1fh.R.inc(12312);final URL urlCRLF = getClass().getResource("FileUtilsTestDataCRLF.dat");
        __CLR4_4_198o98okylve1fh.R.inc(12313);assertNotNull(urlCRLF);
        __CLR4_4_198o98okylve1fh.R.inc(12314);final File crlf = new File(urlCRLF.toURI());
        __CLR4_4_198o98okylve1fh.R.inc(12315);assertTrue(crlf.exists());

        __CLR4_4_198o98okylve1fh.R.inc(12316);final URL urlLF = getClass().getResource("FileUtilsTestDataLF.dat");
        __CLR4_4_198o98okylve1fh.R.inc(12317);assertNotNull(urlLF);
        __CLR4_4_198o98okylve1fh.R.inc(12318);final File lf = new File(urlLF.toURI());
        __CLR4_4_198o98okylve1fh.R.inc(12319);assertTrue(lf.exists());

        __CLR4_4_198o98okylve1fh.R.inc(12320);assertTrue(FileUtils.contentEqualsIgnoreEOL(cr, cr, null));
        __CLR4_4_198o98okylve1fh.R.inc(12321);assertTrue(FileUtils.contentEqualsIgnoreEOL(crlf, crlf, null));
        __CLR4_4_198o98okylve1fh.R.inc(12322);assertTrue(FileUtils.contentEqualsIgnoreEOL(lf, lf, null));

        __CLR4_4_198o98okylve1fh.R.inc(12323);assertTrue(FileUtils.contentEqualsIgnoreEOL(cr, crlf, null));
        __CLR4_4_198o98okylve1fh.R.inc(12324);assertTrue(FileUtils.contentEqualsIgnoreEOL(cr, lf, null));
        __CLR4_4_198o98okylve1fh.R.inc(12325);assertTrue(FileUtils.contentEqualsIgnoreEOL(crlf, lf, null));

        // Check the files behave OK when EOL is not ignored
        __CLR4_4_198o98okylve1fh.R.inc(12326);assertTrue(FileUtils.contentEquals(cr, cr));
        __CLR4_4_198o98okylve1fh.R.inc(12327);assertTrue(FileUtils.contentEquals(crlf, crlf));
        __CLR4_4_198o98okylve1fh.R.inc(12328);assertTrue(FileUtils.contentEquals(lf, lf));

        __CLR4_4_198o98okylve1fh.R.inc(12329);assertFalse(FileUtils.contentEquals(cr, crlf));
        __CLR4_4_198o98okylve1fh.R.inc(12330);assertFalse(FileUtils.contentEquals(cr, lf));
        __CLR4_4_198o98okylve1fh.R.inc(12331);assertFalse(FileUtils.contentEquals(crlf, lf));

        // Equal files
        __CLR4_4_198o98okylve1fh.R.inc(12332);file1.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(12333);file2.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(12334);assertTrue(FileUtils.contentEqualsIgnoreEOL(file1, file1, null));
        __CLR4_4_198o98okylve1fh.R.inc(12335);assertTrue(FileUtils.contentEqualsIgnoreEOL(file1, file2, null));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyDirectoryExceptions() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpudzj9io();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyDirectoryExceptions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpudzj9io(){try{__CLR4_4_198o98okylve1fh.R.inc(12336);
        //
        // NullPointerException
        __CLR4_4_198o98okylve1fh.R.inc(12337);assertThrows(NullPointerException.class, () -> FileUtils.copyDirectory(null, null));
        __CLR4_4_198o98okylve1fh.R.inc(12338);assertThrows(NullPointerException.class, () -> FileUtils.copyDirectory(null, testFile1));
        __CLR4_4_198o98okylve1fh.R.inc(12339);assertThrows(NullPointerException.class, () -> FileUtils.copyDirectory(testFile1, null));
        __CLR4_4_198o98okylve1fh.R.inc(12340);assertThrows(NullPointerException.class, () -> FileUtils.copyDirectory(null, new File("a")));
        //
        // IllegalArgumentException
        __CLR4_4_198o98okylve1fh.R.inc(12341);assertThrows(IllegalArgumentException.class, () -> FileUtils.copyDirectory(testFile1, new File("a")));
        __CLR4_4_198o98okylve1fh.R.inc(12342);assertThrows(IllegalArgumentException.class, () -> FileUtils.copyDirectory(testFile1, new File("a")));
        __CLR4_4_198o98okylve1fh.R.inc(12343);assertThrows(IllegalArgumentException.class, () -> FileUtils.copyDirectory(temporaryFolder, temporaryFolder));
        //
        // IOException
        __CLR4_4_198o98okylve1fh.R.inc(12344);assertThrows(IOException.class, () -> FileUtils.copyDirectory(new File("doesnt-exist"), new File("a")));
        __CLR4_4_198o98okylve1fh.R.inc(12345);assertThrows(IllegalArgumentException.class, () -> FileUtils.copyDirectory(temporaryFolder, testFile1));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyDirectoryFiltered() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyyxno9iy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyDirectoryFiltered",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyyxno9iy() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12346);
        __CLR4_4_198o98okylve1fh.R.inc(12347);final File grandParentDir = new File(temporaryFolder, "grandparent");
        __CLR4_4_198o98okylve1fh.R.inc(12348);final File parentDir = new File(grandParentDir, "parent");
        __CLR4_4_198o98okylve1fh.R.inc(12349);final File childDir = new File(parentDir, "child");
        __CLR4_4_198o98okylve1fh.R.inc(12350);createFilesForTestCopyDirectory(grandParentDir, parentDir, childDir);

        __CLR4_4_198o98okylve1fh.R.inc(12351);final NameFileFilter filter = new NameFileFilter("parent", "child", "file3.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12352);final File destDir = new File(temporaryFolder, "copydest");

        __CLR4_4_198o98okylve1fh.R.inc(12353);FileUtils.copyDirectory(grandParentDir, destDir, filter);
        __CLR4_4_198o98okylve1fh.R.inc(12354);final List<File> files = LIST_WALKER.list(destDir);
        __CLR4_4_198o98okylve1fh.R.inc(12355);assertEquals(3, files.size());
        __CLR4_4_198o98okylve1fh.R.inc(12356);assertEquals("parent", files.get(0).getName());
        __CLR4_4_198o98okylve1fh.R.inc(12357);assertEquals("child", files.get(1).getName());
        __CLR4_4_198o98okylve1fh.R.inc(12358);assertEquals("file3.txt", files.get(2).getName());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyDirectoryPreserveDates() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3rgti9jb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyDirectoryPreserveDates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3rgti9jb() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12359);
        __CLR4_4_198o98okylve1fh.R.inc(12360);final File source = new File(temporaryFolder, "source");
        __CLR4_4_198o98okylve1fh.R.inc(12361);final File sourceDirectory = new File(source, "directory");
        __CLR4_4_198o98okylve1fh.R.inc(12362);final File sourceFile = new File(sourceDirectory, "hello.txt");

        // Prepare source data
        __CLR4_4_198o98okylve1fh.R.inc(12363);source.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12364);sourceDirectory.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(12365);FileUtils.writeStringToFile(sourceFile, "HELLO WORLD", "UTF8");
        // Set dates in reverse order to avoid overwriting previous values
        // Also, use full seconds (arguments are in ms) close to today
        // but still highly unlikely to occur in the real world
        __CLR4_4_198o98okylve1fh.R.inc(12366);assertTrue(setLastModifiedMillis(sourceFile, DATE3));
        __CLR4_4_198o98okylve1fh.R.inc(12367);assertTrue(setLastModifiedMillis(sourceDirectory, DATE2));
        __CLR4_4_198o98okylve1fh.R.inc(12368);assertTrue(setLastModifiedMillis(source, DATE1));

        __CLR4_4_198o98okylve1fh.R.inc(12369);final File target = new File(temporaryFolder, "target");
        __CLR4_4_198o98okylve1fh.R.inc(12370);final File targetDirectory = new File(target, "directory");
        __CLR4_4_198o98okylve1fh.R.inc(12371);final File targetFile = new File(targetDirectory, "hello.txt");

        // Test with preserveFileDate disabled
        // On Windows, the last modified time is copied by default.
        __CLR4_4_198o98okylve1fh.R.inc(12372);FileUtils.copyDirectory(source, target, false);
        __CLR4_4_198o98okylve1fh.R.inc(12373);assertNotEquals(DATE1, getLastModifiedMillis(target));
        __CLR4_4_198o98okylve1fh.R.inc(12374);assertNotEquals(DATE2, getLastModifiedMillis(targetDirectory));
        __CLR4_4_198o98okylve1fh.R.inc(12375);if ((((!SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_198o98okylve1fh.R.iget(12376)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12377)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12378);assertNotEquals(DATE3, getLastModifiedMillis(targetFile));
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12379);FileUtils.deleteDirectory(target);

        // Test with preserveFileDate enabled
        __CLR4_4_198o98okylve1fh.R.inc(12380);FileUtils.copyDirectory(source, target, true);
        __CLR4_4_198o98okylve1fh.R.inc(12381);assertEquals(DATE1, getLastModifiedMillis(target));
        __CLR4_4_198o98okylve1fh.R.inc(12382);assertEquals(DATE2, getLastModifiedMillis(targetDirectory));
        __CLR4_4_198o98okylve1fh.R.inc(12383);assertEquals(DATE3, getLastModifiedMillis(targetFile));
        __CLR4_4_198o98okylve1fh.R.inc(12384);FileUtils.deleteDirectory(target);

        // also if the target directory already exists (IO-190)
        __CLR4_4_198o98okylve1fh.R.inc(12385);target.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12386);FileUtils.copyDirectory(source, target, true);
        __CLR4_4_198o98okylve1fh.R.inc(12387);assertEquals(DATE1, getLastModifiedMillis(target));
        __CLR4_4_198o98okylve1fh.R.inc(12388);assertEquals(DATE2, getLastModifiedMillis(targetDirectory));
        __CLR4_4_198o98okylve1fh.R.inc(12389);assertEquals(DATE3, getLastModifiedMillis(targetFile));
        __CLR4_4_198o98okylve1fh.R.inc(12390);FileUtils.deleteDirectory(target);

        // also if the target subdirectory already exists (IO-190)
        __CLR4_4_198o98okylve1fh.R.inc(12391);targetDirectory.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12392);FileUtils.copyDirectory(source, target, true);
        __CLR4_4_198o98okylve1fh.R.inc(12393);assertEquals(DATE1, getLastModifiedMillis(target));
        __CLR4_4_198o98okylve1fh.R.inc(12394);assertEquals(DATE2, getLastModifiedMillis(targetDirectory));
        __CLR4_4_198o98okylve1fh.R.inc(12395);assertEquals(DATE3, getLastModifiedMillis(targetFile));
        __CLR4_4_198o98okylve1fh.R.inc(12396);FileUtils.deleteDirectory(target);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    /* Test for IO-141 */
    @Test
    public void testCopyDirectoryToChild() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15abkim9kd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyDirectoryToChild",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15abkim9kd() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12397);
        __CLR4_4_198o98okylve1fh.R.inc(12398);final File grandParentDir = new File(temporaryFolder, "grandparent");
        __CLR4_4_198o98okylve1fh.R.inc(12399);final File parentDir = new File(grandParentDir, "parent");
        __CLR4_4_198o98okylve1fh.R.inc(12400);final File childDir = new File(parentDir, "child");
        __CLR4_4_198o98okylve1fh.R.inc(12401);createFilesForTestCopyDirectory(grandParentDir, parentDir, childDir);

        __CLR4_4_198o98okylve1fh.R.inc(12402);final long expectedCount = LIST_WALKER.list(grandParentDir).size() +
                LIST_WALKER.list(parentDir).size();
        __CLR4_4_198o98okylve1fh.R.inc(12403);final long expectedSize = FileUtils.sizeOfDirectory(grandParentDir) +
                FileUtils.sizeOfDirectory(parentDir);
        __CLR4_4_198o98okylve1fh.R.inc(12404);FileUtils.copyDirectory(parentDir, childDir);
        __CLR4_4_198o98okylve1fh.R.inc(12405);assertEquals(expectedCount, LIST_WALKER.list(grandParentDir).size());
        __CLR4_4_198o98okylve1fh.R.inc(12406);assertEquals(expectedSize, FileUtils.sizeOfDirectory(grandParentDir));
        __CLR4_4_198o98okylve1fh.R.inc(12407);assertTrue(expectedCount > 0, "Count > 0");
        __CLR4_4_198o98okylve1fh.R.inc(12408);assertTrue(expectedSize > 0, "Size > 0");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // toURLs

    @Test
    public void testCopyDirectoryToDirectory_NonExistingDest() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oz33wu9kp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyDirectoryToDirectory_NonExistingDest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oz33wu9kp() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12409);
        __CLR4_4_198o98okylve1fh.R.inc(12410);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12411)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12412)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12413);throw new IOException("Cannot create file " + testFile1
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12414);final OutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12415);try {
            __CLR4_4_198o98okylve1fh.R.inc(12416);TestUtils.generateTestData(output1, 1234);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12417);IOUtils.closeQuietly(output1);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12418);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12419)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12420)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12421);throw new IOException("Cannot create file " + testFile2
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12422);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12423);try {
            __CLR4_4_198o98okylve1fh.R.inc(12424);TestUtils.generateTestData(output, 4321);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12425);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12426);final File srcDir = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(12427);final File subDir = new File(srcDir, "sub");
        __CLR4_4_198o98okylve1fh.R.inc(12428);subDir.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(12429);final File subFile = new File(subDir, "A.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12430);FileUtils.writeStringToFile(subFile, "HELLO WORLD", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(12431);final File destDir = new File(System.getProperty("java.io.tmpdir"), "tmp-FileUtilsTestCase");
        __CLR4_4_198o98okylve1fh.R.inc(12432);FileUtils.deleteDirectory(destDir);
        __CLR4_4_198o98okylve1fh.R.inc(12433);final File actualDestDir = new File(destDir, srcDir.getName());

        __CLR4_4_198o98okylve1fh.R.inc(12434);FileUtils.copyDirectoryToDirectory(srcDir, destDir);

        __CLR4_4_198o98okylve1fh.R.inc(12435);assertTrue(destDir.exists(), "Check exists");
        __CLR4_4_198o98okylve1fh.R.inc(12436);assertTrue(actualDestDir.exists(), "Check exists");
        __CLR4_4_198o98okylve1fh.R.inc(12437);final long srcSize = FileUtils.sizeOfDirectory(srcDir);
        __CLR4_4_198o98okylve1fh.R.inc(12438);assertTrue(srcSize > 0, "Size > 0");
        __CLR4_4_198o98okylve1fh.R.inc(12439);assertEquals(srcSize, FileUtils.sizeOfDirectory(actualDestDir), "Check size");
        __CLR4_4_198o98okylve1fh.R.inc(12440);assertTrue(new File(actualDestDir, "sub/A.txt").exists());
        __CLR4_4_198o98okylve1fh.R.inc(12441);FileUtils.deleteDirectory(destDir);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

//   @Test public void testToURLs2() throws Exception {
//        File[] files = new File[] {
//            new File(temporaryFolder, "file1.txt"),
//            null,
//        };
//        URL[] urls = FileUtils.toURLs(files);
//
//        assertEquals(files.length, urls.length);
//        assertTrue(urls[0].toExternalForm().startsWith("file:"));
//        assertTrue(urls[0].toExternalForm().indexOf("file1.txt") > 0);
//        assertEquals(null, urls[1]);
//    }
//
//   @Test public void testToURLs3() throws Exception {
//        File[] files = null;
//        URL[] urls = FileUtils.toURLs(files);
//
//        assertEquals(0, urls.length);
//    }

    @Test
    public void testCopyDirectoryToExistingDest() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrfl799lm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyDirectoryToExistingDest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrfl799lm() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12442);
        __CLR4_4_198o98okylve1fh.R.inc(12443);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12444)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12445)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12446);throw new IOException("Cannot create file " + testFile1
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12447);final OutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12448);try {
            __CLR4_4_198o98okylve1fh.R.inc(12449);TestUtils.generateTestData(output1, 1234);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12450);IOUtils.closeQuietly(output1);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12451);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12452)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12453)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12454);throw new IOException("Cannot create file " + testFile2
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12455);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12456);try {
            __CLR4_4_198o98okylve1fh.R.inc(12457);TestUtils.generateTestData(output, 4321);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12458);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12459);final File srcDir = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(12460);final File subDir = new File(srcDir, "sub");
        __CLR4_4_198o98okylve1fh.R.inc(12461);subDir.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(12462);final File subFile = new File(subDir, "A.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12463);FileUtils.writeStringToFile(subFile, "HELLO WORLD", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(12464);final File destDir = new File(System.getProperty("java.io.tmpdir"), "tmp-FileUtilsTestCase");
        __CLR4_4_198o98okylve1fh.R.inc(12465);FileUtils.deleteDirectory(destDir);
        __CLR4_4_198o98okylve1fh.R.inc(12466);destDir.mkdirs();

        __CLR4_4_198o98okylve1fh.R.inc(12467);FileUtils.copyDirectory(srcDir, destDir);

        __CLR4_4_198o98okylve1fh.R.inc(12468);final long srcSize = FileUtils.sizeOfDirectory(srcDir);
        __CLR4_4_198o98okylve1fh.R.inc(12469);assertTrue(srcSize > 0, "Size > 0");
        __CLR4_4_198o98okylve1fh.R.inc(12470);assertEquals(srcSize, FileUtils.sizeOfDirectory(destDir));
        __CLR4_4_198o98okylve1fh.R.inc(12471);assertTrue(new File(destDir, "sub/A.txt").exists());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // contentEquals

    /* Test for IO-141 */
    @Test
    public void testCopyDirectoryToGrandChild() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195cw2w9mg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyDirectoryToGrandChild",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195cw2w9mg() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12472);
        __CLR4_4_198o98okylve1fh.R.inc(12473);final File grandParentDir = new File(temporaryFolder, "grandparent");
        __CLR4_4_198o98okylve1fh.R.inc(12474);final File parentDir = new File(grandParentDir, "parent");
        __CLR4_4_198o98okylve1fh.R.inc(12475);final File childDir = new File(parentDir, "child");
        __CLR4_4_198o98okylve1fh.R.inc(12476);createFilesForTestCopyDirectory(grandParentDir, parentDir, childDir);

        __CLR4_4_198o98okylve1fh.R.inc(12477);final long expectedCount = LIST_WALKER.list(grandParentDir).size() * 2;
        __CLR4_4_198o98okylve1fh.R.inc(12478);final long expectedSize = FileUtils.sizeOfDirectory(grandParentDir) * 2;
        __CLR4_4_198o98okylve1fh.R.inc(12479);FileUtils.copyDirectory(grandParentDir, childDir);
        __CLR4_4_198o98okylve1fh.R.inc(12480);assertEquals(expectedCount, LIST_WALKER.list(grandParentDir).size());
        __CLR4_4_198o98okylve1fh.R.inc(12481);assertEquals(expectedSize, FileUtils.sizeOfDirectory(grandParentDir));
        __CLR4_4_198o98okylve1fh.R.inc(12482);assertTrue(expectedSize > 0, "Size > 0");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    /* Test for IO-217 FileUtils.copyDirectoryToDirectory makes infinite loops */
    @Test
    public void testCopyDirectoryToItself() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqa85b9mr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyDirectoryToItself",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqa85b9mr() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12483);
        __CLR4_4_198o98okylve1fh.R.inc(12484);final File dir = new File(temporaryFolder, "itself");
        __CLR4_4_198o98okylve1fh.R.inc(12485);dir.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12486);FileUtils.copyDirectoryToDirectory(dir, dir);
        __CLR4_4_198o98okylve1fh.R.inc(12487);assertEquals(1, LIST_WALKER.list(dir).size());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // copyURLToFile

    @Test
    public void testCopyDirectoryToNonExistingDest() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh7u9s9mw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyDirectoryToNonExistingDest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh7u9s9mw() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12488);
        __CLR4_4_198o98okylve1fh.R.inc(12489);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12490)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12491)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12492);throw new IOException("Cannot create file " + testFile1
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12493);final OutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12494);try {
            __CLR4_4_198o98okylve1fh.R.inc(12495);TestUtils.generateTestData(output1, 1234);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12496);IOUtils.closeQuietly(output1);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12497);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12498)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12499)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12500);throw new IOException("Cannot create file " + testFile2
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12501);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12502);try {
            __CLR4_4_198o98okylve1fh.R.inc(12503);TestUtils.generateTestData(output, 4321);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12504);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12505);final File srcDir = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(12506);final File subDir = new File(srcDir, "sub");
        __CLR4_4_198o98okylve1fh.R.inc(12507);subDir.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(12508);final File subFile = new File(subDir, "A.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12509);FileUtils.writeStringToFile(subFile, "HELLO WORLD", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(12510);final File destDir = new File(System.getProperty("java.io.tmpdir"), "tmp-FileUtilsTestCase");
        __CLR4_4_198o98okylve1fh.R.inc(12511);FileUtils.deleteDirectory(destDir);

        __CLR4_4_198o98okylve1fh.R.inc(12512);FileUtils.copyDirectory(srcDir, destDir);

        __CLR4_4_198o98okylve1fh.R.inc(12513);assertTrue(destDir.exists(), "Check exists");
        __CLR4_4_198o98okylve1fh.R.inc(12514);final long sizeOfSrcDirectory = FileUtils.sizeOfDirectory(srcDir);
        __CLR4_4_198o98okylve1fh.R.inc(12515);assertTrue(sizeOfSrcDirectory > 0, "Size > 0");
        __CLR4_4_198o98okylve1fh.R.inc(12516);assertEquals(sizeOfSrcDirectory, FileUtils.sizeOfDirectory(destDir), "Check size");
        __CLR4_4_198o98okylve1fh.R.inc(12517);assertTrue(new File(destDir, "sub/A.txt").exists());
        __CLR4_4_198o98okylve1fh.R.inc(12518);FileUtils.deleteDirectory(destDir);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyFile1() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17emeol9nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyFile1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17emeol9nr() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12519);
        __CLR4_4_198o98okylve1fh.R.inc(12520);final File destination = new File(temporaryFolder, "copy1.txt");

        __CLR4_4_198o98okylve1fh.R.inc(12521);backDateFile10Minutes(testFile1); // set test file back 10 minutes

        __CLR4_4_198o98okylve1fh.R.inc(12522);FileUtils.copyFile(testFile1, destination);
        __CLR4_4_198o98okylve1fh.R.inc(12523);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(12524);assertEquals(testFile1Size, destination.length(), "Check Full copy");
        __CLR4_4_198o98okylve1fh.R.inc(12525);assertEquals(getLastModifiedMillis(testFile1), getLastModifiedMillis(destination), "Check last modified date preserved");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // forceMkdir

    @Test
    public void testCopyFile1ToDir() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrkjx19ny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyFile1ToDir",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrkjx19ny() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12526);
        __CLR4_4_198o98okylve1fh.R.inc(12527);final File directory = new File(temporaryFolder, "subdir");
        __CLR4_4_198o98okylve1fh.R.inc(12528);if ((((!directory.exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12529)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12530)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12531);directory.mkdirs();
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12532);final File destination = new File(directory, testFile1.getName());

        __CLR4_4_198o98okylve1fh.R.inc(12533);backDateFile10Minutes(testFile1);

        __CLR4_4_198o98okylve1fh.R.inc(12534);FileUtils.copyFileToDirectory(testFile1, directory);
        __CLR4_4_198o98okylve1fh.R.inc(12535);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(12536);assertEquals(testFile1Size, destination.length(), "Check Full copy");
        __CLR4_4_198o98okylve1fh.R.inc(12537);assertEquals(FileUtils.lastModified(testFile1), FileUtils.lastModified(destination), "Check last modified date preserved");

        __CLR4_4_198o98okylve1fh.R.inc(12538);assertThrows(IllegalArgumentException.class, () -> FileUtils.copyFileToDirectory(destination, directory),
            "Should not be able to copy a file into the same directory as itself");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyFile2() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1anmdh29ob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyFile2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1anmdh29ob() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12539);
        __CLR4_4_198o98okylve1fh.R.inc(12540);final File destination = new File(temporaryFolder, "copy2.txt");

        __CLR4_4_198o98okylve1fh.R.inc(12541);backDateFile10Minutes(testFile1); // set test file back 10 minutes

        __CLR4_4_198o98okylve1fh.R.inc(12542);FileUtils.copyFile(testFile1, destination);
        __CLR4_4_198o98okylve1fh.R.inc(12543);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(12544);assertEquals(testFile2Size, destination.length(), "Check Full copy");
        __CLR4_4_198o98okylve1fh.R.inc(12545);assertEquals(getLastModifiedMillis(testFile1) , getLastModifiedMillis(destination), "Check last modified date preserved");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // sizeOfDirectory

    @Test
    public void testCopyFile2ToDir() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbzfmy9oi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyFile2ToDir",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbzfmy9oi() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12546);
        __CLR4_4_198o98okylve1fh.R.inc(12547);final File directory = new File(temporaryFolder, "subdir");
        __CLR4_4_198o98okylve1fh.R.inc(12548);if ((((!directory.exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12549)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12550)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12551);directory.mkdirs();
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12552);final File destination = new File(directory, testFile1.getName());

        __CLR4_4_198o98okylve1fh.R.inc(12553);backDateFile10Minutes(testFile1);

        __CLR4_4_198o98okylve1fh.R.inc(12554);FileUtils.copyFileToDirectory(testFile1, directory);
        __CLR4_4_198o98okylve1fh.R.inc(12555);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(12556);assertEquals(testFile2Size, destination.length(), "Check Full copy");
        __CLR4_4_198o98okylve1fh.R.inc(12557);assertEquals(FileUtils.lastModified(testFile1), FileUtils.lastModified(destination), "Check last modified date preserved");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyFile2WithoutFileDatePreservation() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6lsqi9ou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyFile2WithoutFileDatePreservation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6lsqi9ou() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12558);
        __CLR4_4_198o98okylve1fh.R.inc(12559);final File destFile = new File(temporaryFolder, "copy2.txt");

        __CLR4_4_198o98okylve1fh.R.inc(12560);backDateFile10Minutes(testFile1); // set test file back 10 minutes

        // destination file time should not be less than this (allowing for granularity)
        __CLR4_4_198o98okylve1fh.R.inc(12561);final long nowMillis = System.currentTimeMillis() - 1000L;
        // On Windows, the last modified time is copied by default.
        __CLR4_4_198o98okylve1fh.R.inc(12562);FileUtils.copyFile(testFile1, destFile, false);
        __CLR4_4_198o98okylve1fh.R.inc(12563);assertTrue(destFile.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(12564);assertEquals(testFile1Size, destFile.length(), "Check Full copy");
        __CLR4_4_198o98okylve1fh.R.inc(12565);final long destLastModMillis = getLastModifiedMillis(destFile);
        __CLR4_4_198o98okylve1fh.R.inc(12566);final long unexpectedMillis = getLastModifiedMillis(testFile1);
        __CLR4_4_198o98okylve1fh.R.inc(12567);if ((((!SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_198o98okylve1fh.R.iget(12568)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12569)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12570);final long deltaMillis = destLastModMillis - unexpectedMillis;
            __CLR4_4_198o98okylve1fh.R.inc(12571);assertNotEquals(unexpectedMillis, destLastModMillis,
                "Check last modified date not same as input, delta " + deltaMillis);
            __CLR4_4_198o98okylve1fh.R.inc(12572);assertTrue(destLastModMillis > nowMillis,
                destLastModMillis + " > " + nowMillis + " (delta " + deltaMillis + ")");
        }
    }}finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    @Disabled
    public void testCopyFileLarge() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujs2699p9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyFileLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujs2699p9() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12573);

        __CLR4_4_198o98okylve1fh.R.inc(12574);final File largeFile = new File(temporaryFolder, "large.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12575);final File destination = new File(temporaryFolder, "copylarge.txt");

        __CLR4_4_198o98okylve1fh.R.inc(12576);System.out.println("START:   " + new java.util.Date());
        __CLR4_4_198o98okylve1fh.R.inc(12577);if ((((!largeFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12578)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12579)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12580);throw new IOException("Cannot create file " + largeFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12581);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(largeFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12582);try {
            __CLR4_4_198o98okylve1fh.R.inc(12583);TestUtils.generateTestData(output, FileUtils.ONE_GB);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12584);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12585);System.out.println("CREATED: " + new java.util.Date());
        __CLR4_4_198o98okylve1fh.R.inc(12586);FileUtils.copyFile(largeFile, destination);
        __CLR4_4_198o98okylve1fh.R.inc(12587);System.out.println("COPIED:  " + new java.util.Date());

        __CLR4_4_198o98okylve1fh.R.inc(12588);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(12589);assertEquals(largeFile.length(), destination.length(), "Check Full copy");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyFileToOutputStream() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xgdja9pq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyFileToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xgdja9pq() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12590);
        __CLR4_4_198o98okylve1fh.R.inc(12591);final ByteArrayOutputStream destination = new ByteArrayOutputStream();
        __CLR4_4_198o98okylve1fh.R.inc(12592);FileUtils.copyFile(testFile1, destination);
        __CLR4_4_198o98okylve1fh.R.inc(12593);assertEquals(testFile1Size, destination.size(), "Check Full copy size");
        __CLR4_4_198o98okylve1fh.R.inc(12594);final byte[] expected = FileUtils.readFileToByteArray(testFile1);
        __CLR4_4_198o98okylve1fh.R.inc(12595);assertArrayEquals(expected, destination.toByteArray(), "Check Full copy");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyToDirectoryWithDirectory() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12o7t8d9pw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyToDirectoryWithDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12o7t8d9pw() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(12596);
        __CLR4_4_198o98okylve1fh.R.inc(12597);final File destDirectory = new File(temporaryFolder, "destination");
        __CLR4_4_198o98okylve1fh.R.inc(12598);if ((((!destDirectory.exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12599)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12600)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12601);destDirectory.mkdirs();
        }

        // Create a test directory
        }__CLR4_4_198o98okylve1fh.R.inc(12602);final File inputDirectory = new File(temporaryFolder, "input");
        __CLR4_4_198o98okylve1fh.R.inc(12603);if ((((!inputDirectory.exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12604)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12605)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12606);inputDirectory.mkdirs();
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12607);final File outputDirDestination = new File(destDirectory, inputDirectory.getName());
        __CLR4_4_198o98okylve1fh.R.inc(12608);FileUtils.copyToDirectory(testFile1, inputDirectory);
        __CLR4_4_198o98okylve1fh.R.inc(12609);final File destFile1 = new File(outputDirDestination, testFile1.getName());
        __CLR4_4_198o98okylve1fh.R.inc(12610);FileUtils.copyToDirectory(testFile2, inputDirectory);
        __CLR4_4_198o98okylve1fh.R.inc(12611);final File destFile2 = new File(outputDirDestination, testFile2.getName());

        __CLR4_4_198o98okylve1fh.R.inc(12612);FileUtils.copyToDirectory(inputDirectory, destDirectory);

        // Check the directory was created
        __CLR4_4_198o98okylve1fh.R.inc(12613);assertTrue(outputDirDestination.exists(), "Check Exists");
        __CLR4_4_198o98okylve1fh.R.inc(12614);assertTrue(outputDirDestination.isDirectory(), "Check Directory");

        // Check each file
        __CLR4_4_198o98okylve1fh.R.inc(12615);assertTrue(destFile1.exists(), "Check Exists");
        __CLR4_4_198o98okylve1fh.R.inc(12616);assertEquals(testFile1Size, destFile1.length(), "Check Full Copy");
        __CLR4_4_198o98okylve1fh.R.inc(12617);assertTrue(destFile2.exists(), "Check Exists");
        __CLR4_4_198o98okylve1fh.R.inc(12618);assertEquals(testFile2Size, destFile2.length(), "Check Full Copy");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyToDirectoryWithFile() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fq4mgk9qj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyToDirectoryWithFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fq4mgk9qj() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(12619);
        __CLR4_4_198o98okylve1fh.R.inc(12620);final File directory = new File(temporaryFolder, "subdir");
        __CLR4_4_198o98okylve1fh.R.inc(12621);if ((((!directory.exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12622)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12623)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12624);directory.mkdirs();
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12625);final File destination = new File(directory, testFile1.getName());

        __CLR4_4_198o98okylve1fh.R.inc(12626);FileUtils.copyToDirectory(testFile1, directory);
        __CLR4_4_198o98okylve1fh.R.inc(12627);assertTrue(destination.exists(), "Check Exists");
        __CLR4_4_198o98okylve1fh.R.inc(12628);assertEquals(testFile1Size, destination.length(), "Check Full Copy");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyToDirectoryWithFileSourceDoesNotExist() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gamrw9qt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyToDirectoryWithFileSourceDoesNotExist",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gamrw9qt(){try{__CLR4_4_198o98okylve1fh.R.inc(12629);
        __CLR4_4_198o98okylve1fh.R.inc(12630);assertThrows(IOException.class,
                () -> FileUtils.copyToDirectory(new File(temporaryFolder, "doesNotExists"), temporaryFolder));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // copyFile

    @Test
    public void testCopyToDirectoryWithFileSourceIsNull() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111i36o9qv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyToDirectoryWithFileSourceIsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111i36o9qv(){try{__CLR4_4_198o98okylve1fh.R.inc(12631);
        __CLR4_4_198o98okylve1fh.R.inc(12632);assertThrows(NullPointerException.class, () -> FileUtils.copyToDirectory((File) null, temporaryFolder));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyToDirectoryWithIterable() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fru1ka9qx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyToDirectoryWithIterable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fru1ka9qx() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(12633);
        __CLR4_4_198o98okylve1fh.R.inc(12634);final File directory = new File(temporaryFolder, "subdir");
        __CLR4_4_198o98okylve1fh.R.inc(12635);if ((((!directory.exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12636)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12637)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12638);directory.mkdirs();
        }

        }__CLR4_4_198o98okylve1fh.R.inc(12639);final List<File> input = new ArrayList<>();
        __CLR4_4_198o98okylve1fh.R.inc(12640);input.add(testFile1);
        __CLR4_4_198o98okylve1fh.R.inc(12641);input.add(testFile2);

        __CLR4_4_198o98okylve1fh.R.inc(12642);final File destFile1 = new File(directory, testFile1.getName());
        __CLR4_4_198o98okylve1fh.R.inc(12643);final File destFile2 = new File(directory, testFile2.getName());

        __CLR4_4_198o98okylve1fh.R.inc(12644);FileUtils.copyToDirectory(input, directory);
        // Check each file
        __CLR4_4_198o98okylve1fh.R.inc(12645);assertTrue(destFile1.exists(), "Check Exists");
        __CLR4_4_198o98okylve1fh.R.inc(12646);assertEquals(testFile1Size, destFile1.length(), "Check Full Copy");
        __CLR4_4_198o98okylve1fh.R.inc(12647);assertTrue(destFile2.exists(), "Check Exists");
        __CLR4_4_198o98okylve1fh.R.inc(12648);assertEquals(testFile2Size, destFile2.length(), "Check Full Copy");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyToDirectoryWithIterableSourceDoesNotExist() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f3ta69rd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyToDirectoryWithIterableSourceDoesNotExist",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f3ta69rd(){try{__CLR4_4_198o98okylve1fh.R.inc(12649);
        __CLR4_4_198o98okylve1fh.R.inc(12650);assertThrows(IOException.class,
                () -> FileUtils.copyToDirectory(Collections.singleton(new File(temporaryFolder, "doesNotExists")),
                        temporaryFolder));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyToDirectoryWithIterableSourceIsNull() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ploymu9rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyToDirectoryWithIterableSourceIsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ploymu9rf(){try{__CLR4_4_198o98okylve1fh.R.inc(12651);
        __CLR4_4_198o98okylve1fh.R.inc(12652);assertThrows(NullPointerException.class, () -> FileUtils.copyToDirectory((List<File>) null, temporaryFolder));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyToSelf() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_117epe39rh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyToSelf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_117epe39rh() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12653);
        __CLR4_4_198o98okylve1fh.R.inc(12654);final File destination = new File(temporaryFolder, "copy3.txt");
        //Prepare a test file
        __CLR4_4_198o98okylve1fh.R.inc(12655);FileUtils.copyFile(testFile1, destination);
        __CLR4_4_198o98okylve1fh.R.inc(12656);assertThrows(IllegalArgumentException.class, () -> FileUtils.copyFile(destination, destination));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyURLToFile() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174m67a9rl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyURLToFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174m67a9rl() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12657);
        // Creates file
        __CLR4_4_198o98okylve1fh.R.inc(12658);final File file = new File(temporaryFolder, getName());
        __CLR4_4_198o98okylve1fh.R.inc(12659);file.deleteOnExit();

        // Loads resource
        __CLR4_4_198o98okylve1fh.R.inc(12660);final String resourceName = "/java/lang/Object.class";
        __CLR4_4_198o98okylve1fh.R.inc(12661);FileUtils.copyURLToFile(getClass().getResource(resourceName), file);

        // Tests that resuorce was copied correctly
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12662);try (__CLR4_4_1$AC10 __CLR$ACI10=new __CLR4_4_1$AC10(){{__CLR4_4_198o98okylve1fh.R.inc(12663);}};InputStream fis = Files.newInputStream(file.toPath())) {
            __CLR4_4_198o98okylve1fh.R.inc(12664);assertTrue(IOUtils.contentEquals(getClass().getResourceAsStream(resourceName), fis),
                    "Content is not equal.");
        }
        //TODO Maybe test copy to itself like for copyFile()
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testCopyURLToFileWithTimeout() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161mmpv9rt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testCopyURLToFileWithTimeout",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161mmpv9rt() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12665);
        // Creates file
        __CLR4_4_198o98okylve1fh.R.inc(12666);final File file = new File(temporaryFolder, "testCopyURLToFileWithTimeout");
        __CLR4_4_198o98okylve1fh.R.inc(12667);file.deleteOnExit();

        // Loads resource
        __CLR4_4_198o98okylve1fh.R.inc(12668);final String resourceName = "/java/lang/Object.class";
        __CLR4_4_198o98okylve1fh.R.inc(12669);FileUtils.copyURLToFile(getClass().getResource(resourceName), file, 500, 500);

        // Tests that resuorce was copied correctly
        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12670);try (__CLR4_4_1$AC11 __CLR$ACI11=new __CLR4_4_1$AC11(){{__CLR4_4_198o98okylve1fh.R.inc(12671);}};InputStream fis = Files.newInputStream(file.toPath())) {
            __CLR4_4_198o98okylve1fh.R.inc(12672);assertTrue(IOUtils.contentEquals(getClass().getResourceAsStream(resourceName), fis),
                    "Content is not equal.");
        }
        //TODO Maybe test copy to itself like for copyFile()
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDecodeUrl() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wojckq9s1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDecodeUrl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wojckq9s1(){try{__CLR4_4_198o98okylve1fh.R.inc(12673);
        __CLR4_4_198o98okylve1fh.R.inc(12674);assertEquals("", FileUtils.decodeUrl(""));
        __CLR4_4_198o98okylve1fh.R.inc(12675);assertEquals("foo", FileUtils.decodeUrl("foo"));
        __CLR4_4_198o98okylve1fh.R.inc(12676);assertEquals("+", FileUtils.decodeUrl("+"));
        __CLR4_4_198o98okylve1fh.R.inc(12677);assertEquals("% ", FileUtils.decodeUrl("%25%20"));
        __CLR4_4_198o98okylve1fh.R.inc(12678);assertEquals("%20", FileUtils.decodeUrl("%2520"));
        __CLR4_4_198o98okylve1fh.R.inc(12679);assertEquals("jar:file:/C:/dir/sub dir/1.0/foo-1.0.jar!/org/Bar.class", FileUtils
                .decodeUrl("jar:file:/C:/dir/sub%20dir/1.0/foo-1.0.jar!/org/Bar.class"));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDecodeUrlEncodingUtf8() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i43ism9s8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDecodeUrlEncodingUtf8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i43ism9s8(){try{__CLR4_4_198o98okylve1fh.R.inc(12680);
        __CLR4_4_198o98okylve1fh.R.inc(12681);assertEquals("\u00e4\u00f6\u00fc\u00df", FileUtils.decodeUrl("%C3%A4%C3%B6%C3%BC%C3%9F"));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDecodeUrlLenient() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3kbdb9sa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDecodeUrlLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3kbdb9sa(){try{__CLR4_4_198o98okylve1fh.R.inc(12682);
        __CLR4_4_198o98okylve1fh.R.inc(12683);assertEquals(" ", FileUtils.decodeUrl(" "));
        __CLR4_4_198o98okylve1fh.R.inc(12684);assertEquals("\u00e4\u00f6\u00fc\u00df", FileUtils.decodeUrl("\u00e4\u00f6\u00fc\u00df"));
        __CLR4_4_198o98okylve1fh.R.inc(12685);assertEquals("%", FileUtils.decodeUrl("%"));
        __CLR4_4_198o98okylve1fh.R.inc(12686);assertEquals("% ", FileUtils.decodeUrl("%%20"));
        __CLR4_4_198o98okylve1fh.R.inc(12687);assertEquals("%2", FileUtils.decodeUrl("%2"));
        __CLR4_4_198o98okylve1fh.R.inc(12688);assertEquals("%2G", FileUtils.decodeUrl("%2G"));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDecodeUrlNullSafe() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5aoyy9sh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDecodeUrlNullSafe",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5aoyy9sh(){try{__CLR4_4_198o98okylve1fh.R.inc(12689);
        __CLR4_4_198o98okylve1fh.R.inc(12690);assertNull(FileUtils.decodeUrl(null));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDelete() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yilj0c9sj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDelete",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yilj0c9sj() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12691);
        __CLR4_4_198o98okylve1fh.R.inc(12692);assertEquals(testFile1, FileUtils.delete(testFile1));
        __CLR4_4_198o98okylve1fh.R.inc(12693);assertThrows(IOException.class, () -> FileUtils.delete(new File("does not exist.nope")));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDeleteDirectoryWithNonDirectory() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1siq4zh9sm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDeleteDirectoryWithNonDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1siq4zh9sm() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12694);
        __CLR4_4_198o98okylve1fh.R.inc(12695);try {
            __CLR4_4_198o98okylve1fh.R.inc(12696);FileUtils.deleteDirectory(testFile1);
            __CLR4_4_198o98okylve1fh.R.inc(12697);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDeleteQuietlyDir() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9rvu89sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDeleteQuietlyDir",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9rvu89sq() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(12698);
        __CLR4_4_198o98okylve1fh.R.inc(12699);final File testDirectory = new File(temporaryFolder, "testDeleteQuietlyDir");
        __CLR4_4_198o98okylve1fh.R.inc(12700);final File testFile = new File(testDirectory, "testDeleteQuietlyFile");
        __CLR4_4_198o98okylve1fh.R.inc(12701);testDirectory.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(12702);if ((((!testFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12703)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12704)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12705);throw new IOException("Cannot create file " + testFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12706);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12707);try {
            __CLR4_4_198o98okylve1fh.R.inc(12708);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12709);IOUtils.closeQuietly(output);
        }

        __CLR4_4_198o98okylve1fh.R.inc(12710);assertTrue(testDirectory.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12711);assertTrue(testFile.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12712);FileUtils.deleteQuietly(testDirectory);
        __CLR4_4_198o98okylve1fh.R.inc(12713);assertFalse(testDirectory.exists(), "Check No Exist");
        __CLR4_4_198o98okylve1fh.R.inc(12714);assertFalse(testFile.exists(), "Check No Exist");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDeleteQuietlyFile() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173qdc79t7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDeleteQuietlyFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173qdc79t7() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(12715);
        __CLR4_4_198o98okylve1fh.R.inc(12716);final File testFile = new File(temporaryFolder, "testDeleteQuietlyFile");
        __CLR4_4_198o98okylve1fh.R.inc(12717);if ((((!testFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12718)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12719)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12720);throw new IOException("Cannot create file " + testFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12721);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12722);try {
            __CLR4_4_198o98okylve1fh.R.inc(12723);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12724);IOUtils.closeQuietly(output);
        }

        __CLR4_4_198o98okylve1fh.R.inc(12725);assertTrue(testFile.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12726);FileUtils.deleteQuietly(testFile);
        __CLR4_4_198o98okylve1fh.R.inc(12727);assertFalse(testFile.exists(), "Check No Exist");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDeleteQuietlyForNull() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yeemer9tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDeleteQuietlyForNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yeemer9tk(){try{__CLR4_4_198o98okylve1fh.R.inc(12728);
        __CLR4_4_198o98okylve1fh.R.inc(12729);try {
            __CLR4_4_198o98okylve1fh.R.inc(12730);FileUtils.deleteQuietly(null);
        } catch (final Exception ex) {
            __CLR4_4_198o98okylve1fh.R.inc(12731);fail(ex.getMessage());
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testDeleteQuietlyNonExistent() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1djoh3w9to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testDeleteQuietlyNonExistent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1djoh3w9to(){try{__CLR4_4_198o98okylve1fh.R.inc(12732);
        __CLR4_4_198o98okylve1fh.R.inc(12733);final File testFile = new File("testDeleteQuietlyNonExistent");
        __CLR4_4_198o98okylve1fh.R.inc(12734);assertFalse(testFile.exists());

        __CLR4_4_198o98okylve1fh.R.inc(12735);try {
            __CLR4_4_198o98okylve1fh.R.inc(12736);FileUtils.deleteQuietly(testFile);
        } catch (final Exception ex) {
            __CLR4_4_198o98okylve1fh.R.inc(12737);fail(ex.getMessage());
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    /*
     *  Test the FileUtils implementation.
     */
    @Test
    public void testFileUtils() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esuzue9tu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testFileUtils",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esuzue9tu() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12738);
        // Loads file from classpath
        __CLR4_4_198o98okylve1fh.R.inc(12739);final File file1 = new File(temporaryFolder, "test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12740);final String filename = file1.getAbsolutePath();

        //Create test file on-the-fly (used to be in CVS)
        class __CLR4_4_1$AC12 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(12741);try (__CLR4_4_1$AC12 __CLR$ACI12=new __CLR4_4_1$AC12(){{__CLR4_4_198o98okylve1fh.R.inc(12742);}};OutputStream out = Files.newOutputStream(file1.toPath())) {
            __CLR4_4_198o98okylve1fh.R.inc(12743);out.write("This is a test".getBytes(StandardCharsets.UTF_8));
        }

        __CLR4_4_198o98okylve1fh.R.inc(12744);final File file2 = new File(temporaryFolder, "test2.txt");

        __CLR4_4_198o98okylve1fh.R.inc(12745);FileUtils.writeStringToFile(file2, filename, "UTF-8");
        __CLR4_4_198o98okylve1fh.R.inc(12746);assertTrue(file2.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12747);assertTrue(file2.length() > 0);

        __CLR4_4_198o98okylve1fh.R.inc(12748);final String file2contents = FileUtils.readFileToString(file2, "UTF-8");
        __CLR4_4_198o98okylve1fh.R.inc(12749);assertEquals(filename, file2contents, "Second file's contents correct");

        __CLR4_4_198o98okylve1fh.R.inc(12750);assertTrue(file2.delete());

        __CLR4_4_198o98okylve1fh.R.inc(12751);final String contents = FileUtils.readFileToString(new File(filename), "UTF-8");
        __CLR4_4_198o98okylve1fh.R.inc(12752);assertEquals("This is a test", contents, "FileUtils.fileRead()");

    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // copyToDirectory

    @Test
    public void testForceDeleteAFile1() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18i3bup9u9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testForceDeleteAFile1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18i3bup9u9() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12753);
        __CLR4_4_198o98okylve1fh.R.inc(12754);final File destination = new File(temporaryFolder, "copy1.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12755);destination.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(12756);assertTrue(destination.exists(), "Copy1.txt doesn't exist to delete");
        __CLR4_4_198o98okylve1fh.R.inc(12757);FileUtils.forceDelete(destination);
        __CLR4_4_198o98okylve1fh.R.inc(12758);assertFalse(destination.exists(), "Check No Exist");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testForceDeleteAFile2() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1593d289uf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testForceDeleteAFile2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1593d289uf() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12759);
        __CLR4_4_198o98okylve1fh.R.inc(12760);final File destination = new File(temporaryFolder, "copy2.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12761);destination.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(12762);assertTrue(destination.exists(), "Copy2.txt doesn't exist to delete");
        __CLR4_4_198o98okylve1fh.R.inc(12763);FileUtils.forceDelete(destination);
        __CLR4_4_198o98okylve1fh.R.inc(12764);assertFalse(destination.exists(), "Check No Exist");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testForceDeleteAFile3() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1203e9r9ul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testForceDeleteAFile3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1203e9r9ul() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12765);
        __CLR4_4_198o98okylve1fh.R.inc(12766);final File destination = new File(temporaryFolder, "no_such_file");
        __CLR4_4_198o98okylve1fh.R.inc(12767);assertFalse(destination.exists(), "Check No Exist");
        __CLR4_4_198o98okylve1fh.R.inc(12768);try {
            __CLR4_4_198o98okylve1fh.R.inc(12769);FileUtils.forceDelete(destination);
            __CLR4_4_198o98okylve1fh.R.inc(12770);fail("Should generate FileNotFoundException");
        } catch (final FileNotFoundException ignored) {
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testForceDeleteDir() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jt4ds9ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testForceDeleteDir",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jt4ds9ur() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12771);
        __CLR4_4_198o98okylve1fh.R.inc(12772);final File testDirectory = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(12773);assertTrue(testDirectory.exists(), "TestDirectory must exist");
        __CLR4_4_198o98okylve1fh.R.inc(12774);FileUtils.forceDelete(testDirectory);
        __CLR4_4_198o98okylve1fh.R.inc(12775);assertFalse(testDirectory.exists(), "TestDirectory must not exist");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testForceDeleteReadOnlyFile() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azdmjb9uw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testForceDeleteReadOnlyFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azdmjb9uw() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12776);
        __CLR4_4_198o98okylve1fh.R.inc(12777);File destination = File.createTempFile("test-", ".txt");
        __CLR4_4_198o98okylve1fh.R.inc(12778);assertTrue(destination.setReadOnly());
        __CLR4_4_198o98okylve1fh.R.inc(12779);assertTrue(destination.canRead());
        __CLR4_4_198o98okylve1fh.R.inc(12780);assertFalse(destination.canWrite());
        // sanity check that File.delete() in deletes read-only files.
        __CLR4_4_198o98okylve1fh.R.inc(12781);assertTrue(destination.delete());
        __CLR4_4_198o98okylve1fh.R.inc(12782);destination = File.createTempFile("test-", ".txt");
        // real test
        __CLR4_4_198o98okylve1fh.R.inc(12783);assertTrue(destination.setReadOnly());
        __CLR4_4_198o98okylve1fh.R.inc(12784);assertTrue(destination.canRead());
        __CLR4_4_198o98okylve1fh.R.inc(12785);assertFalse(destination.canWrite());
        __CLR4_4_198o98okylve1fh.R.inc(12786);assertTrue(destination.exists(), "File doesn't exist to delete");
        __CLR4_4_198o98okylve1fh.R.inc(12787);FileUtils.forceDelete(destination);
        __CLR4_4_198o98okylve1fh.R.inc(12788);assertFalse(destination.exists(), "Check deletion");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testForceMkdir() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mv2app9v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testForceMkdir",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mv2app9v9() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12789);
        // Tests with existing directory
        __CLR4_4_198o98okylve1fh.R.inc(12790);FileUtils.forceMkdir(temporaryFolder);

        // Creates test file
        __CLR4_4_198o98okylve1fh.R.inc(12791);final File testFile = new File(temporaryFolder, getName());
        __CLR4_4_198o98okylve1fh.R.inc(12792);testFile.deleteOnExit();
        __CLR4_4_198o98okylve1fh.R.inc(12793);testFile.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(12794);assertTrue(testFile.exists(), "Test file does not exist.");

        // Tests with existing file
        __CLR4_4_198o98okylve1fh.R.inc(12795);assertThrows(IOException.class, () -> FileUtils.forceMkdir(testFile));

        __CLR4_4_198o98okylve1fh.R.inc(12796);testFile.delete();

        // Tests with non-existent directory
        __CLR4_4_198o98okylve1fh.R.inc(12797);FileUtils.forceMkdir(testFile);
        __CLR4_4_198o98okylve1fh.R.inc(12798);assertTrue(testFile.exists(), "Directory was not created.");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testForceMkdirParent() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_179ekop9vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testForceMkdirParent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_179ekop9vj() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12799);
        // Tests with existing directory
        __CLR4_4_198o98okylve1fh.R.inc(12800);assertTrue(temporaryFolder.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12801);final File testParentDir = new File(temporaryFolder, "testForceMkdirParent");
        __CLR4_4_198o98okylve1fh.R.inc(12802);testParentDir.delete();
        __CLR4_4_198o98okylve1fh.R.inc(12803);assertFalse(testParentDir.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12804);final File testFile = new File(testParentDir, "test.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12805);assertFalse(testParentDir.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12806);assertFalse(testFile.exists());
        // Create
        __CLR4_4_198o98okylve1fh.R.inc(12807);FileUtils.forceMkdirParent(testFile);
        __CLR4_4_198o98okylve1fh.R.inc(12808);assertTrue(testParentDir.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12809);assertFalse(testFile.exists());
        // Again
        __CLR4_4_198o98okylve1fh.R.inc(12810);FileUtils.forceMkdirParent(testFile);
        __CLR4_4_198o98okylve1fh.R.inc(12811);assertTrue(testParentDir.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12812);assertFalse(testFile.exists());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testGetFile() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m507k79vx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testGetFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m507k79vx(){try{__CLR4_4_198o98okylve1fh.R.inc(12813);
        __CLR4_4_198o98okylve1fh.R.inc(12814);final File expected_A = new File("src");
        __CLR4_4_198o98okylve1fh.R.inc(12815);final File expected_B = new File(expected_A, "main");
        __CLR4_4_198o98okylve1fh.R.inc(12816);final File expected_C = new File(expected_B, "java");
        __CLR4_4_198o98okylve1fh.R.inc(12817);assertEquals(expected_A, FileUtils.getFile("src"), "A");
        __CLR4_4_198o98okylve1fh.R.inc(12818);assertEquals(expected_B, FileUtils.getFile("src", "main"), "B");
        __CLR4_4_198o98okylve1fh.R.inc(12819);assertEquals(expected_C, FileUtils.getFile("src", "main", "java"), "C");
        __CLR4_4_198o98okylve1fh.R.inc(12820);try {
            __CLR4_4_198o98okylve1fh.R.inc(12821);FileUtils.getFile((String[]) null);
            __CLR4_4_198o98okylve1fh.R.inc(12822);fail("Expected NullPointerException");
        } catch (final NullPointerException e) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // forceDelete

    @Test
    public void testGetFile_Parent() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdiqcw9w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testGetFile_Parent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdiqcw9w7(){try{__CLR4_4_198o98okylve1fh.R.inc(12823);
        __CLR4_4_198o98okylve1fh.R.inc(12824);final File parent = new File("parent");
        __CLR4_4_198o98okylve1fh.R.inc(12825);final File expected_A = new File(parent, "src");
        __CLR4_4_198o98okylve1fh.R.inc(12826);final File expected_B = new File(expected_A, "main");
        __CLR4_4_198o98okylve1fh.R.inc(12827);final File expected_C = new File(expected_B, "java");
        __CLR4_4_198o98okylve1fh.R.inc(12828);assertEquals(expected_A, FileUtils.getFile(parent, "src"), "A");
        __CLR4_4_198o98okylve1fh.R.inc(12829);assertEquals(expected_B, FileUtils.getFile(parent, "src", "main"), "B");
        __CLR4_4_198o98okylve1fh.R.inc(12830);assertEquals(expected_C, FileUtils.getFile(parent, "src", "main", "java"), "C");
        __CLR4_4_198o98okylve1fh.R.inc(12831);try {
            __CLR4_4_198o98okylve1fh.R.inc(12832);FileUtils.getFile(parent, (String[]) null);
            __CLR4_4_198o98okylve1fh.R.inc(12833);fail("Expected NullPointerException");
        } catch (final NullPointerException e) {
            // expected
        }
        __CLR4_4_198o98okylve1fh.R.inc(12834);try {
            __CLR4_4_198o98okylve1fh.R.inc(12835);FileUtils.getFile((File) null, "src");
            __CLR4_4_198o98okylve1fh.R.inc(12836);fail("Expected NullPointerException");
        } catch (final NullPointerException e) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testGetTempDirectory() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j3yoh09wl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testGetTempDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j3yoh09wl(){try{__CLR4_4_198o98okylve1fh.R.inc(12837);
        __CLR4_4_198o98okylve1fh.R.inc(12838);final File tempDirectory = new File(System.getProperty("java.io.tmpdir"));
        __CLR4_4_198o98okylve1fh.R.inc(12839);assertEquals(tempDirectory, FileUtils.getTempDirectory());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testGetTempDirectoryPath() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kd0la99wo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testGetTempDirectoryPath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kd0la99wo(){try{__CLR4_4_198o98okylve1fh.R.inc(12840);
        __CLR4_4_198o98okylve1fh.R.inc(12841);assertEquals(System.getProperty("java.io.tmpdir"),
                FileUtils.getTempDirectoryPath());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // copyFileToDirectory

    @Test
    public void testGetUserDirectory() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aj7z399wq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testGetUserDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aj7z399wq(){try{__CLR4_4_198o98okylve1fh.R.inc(12842);
        __CLR4_4_198o98okylve1fh.R.inc(12843);final File userDirectory = new File(System.getProperty("user.home"));
        __CLR4_4_198o98okylve1fh.R.inc(12844);assertEquals(userDirectory, FileUtils.getUserDirectory());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testGetUserDirectoryPath() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1okjxfu9wt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testGetUserDirectoryPath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1okjxfu9wt(){try{__CLR4_4_198o98okylve1fh.R.inc(12845);
        __CLR4_4_198o98okylve1fh.R.inc(12846);assertEquals(System.getProperty("user.home"),
                FileUtils.getUserDirectoryPath());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // forceDelete

    // This test relies on FileUtils.copyFile using File.length to check the output size
    @Test
    public void testIncorrectOutputSize() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l4p449wv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testIncorrectOutputSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l4p449wv(){try{__CLR4_4_198o98okylve1fh.R.inc(12847);
        __CLR4_4_198o98okylve1fh.R.inc(12848);final File inFile = new File("pom.xml");
        __CLR4_4_198o98okylve1fh.R.inc(12849);final File outFile = new ShorterFile("target/pom.tmp"); // it will report a shorter file
        __CLR4_4_198o98okylve1fh.R.inc(12850);try {
            __CLR4_4_198o98okylve1fh.R.inc(12851);FileUtils.copyFile(inFile, outFile);
            __CLR4_4_198o98okylve1fh.R.inc(12852);fail("Expected IOException");
        } catch (final Exception e) {
            __CLR4_4_198o98okylve1fh.R.inc(12853);final String msg = e.toString();
            __CLR4_4_198o98okylve1fh.R.inc(12854);assertTrue(msg.contains("Failed to copy full contents"), msg);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12855);outFile.delete(); // tidy up
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testIO276() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fdtim89x4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testIO276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fdtim89x4() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12856);
        __CLR4_4_198o98okylve1fh.R.inc(12857);final File dir = new File("target", "IO276");
        __CLR4_4_198o98okylve1fh.R.inc(12858);assertTrue(dir.mkdirs(), dir + " should not be present");
        __CLR4_4_198o98okylve1fh.R.inc(12859);final File file = new File(dir, "IO276.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12860);assertTrue(file.createNewFile(), file + " should not be present");
        __CLR4_4_198o98okylve1fh.R.inc(12861);FileUtils.forceDeleteOnExit(dir);
        // If this does not work, test will fail next time (assuming target is not cleaned)
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testIO300() {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116p4v29xa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testIO300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116p4v29xa(){try{__CLR4_4_198o98okylve1fh.R.inc(12862);
        __CLR4_4_198o98okylve1fh.R.inc(12863);final File testDirectory = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(12864);final File src = new File(testDirectory, "dir1");
        __CLR4_4_198o98okylve1fh.R.inc(12865);final File dest = new File(src, "dir2");
        __CLR4_4_198o98okylve1fh.R.inc(12866);assertTrue(dest.mkdirs());
        __CLR4_4_198o98okylve1fh.R.inc(12867);assertTrue(src.exists());
        __CLR4_4_198o98okylve1fh.R.inc(12868);try {
            __CLR4_4_198o98okylve1fh.R.inc(12869);FileUtils.moveDirectoryToDirectory(src, dest, false);
            __CLR4_4_198o98okylve1fh.R.inc(12870);fail("expected IOException");
        } catch (final IOException ioe) {
            // expected
        }
        __CLR4_4_198o98okylve1fh.R.inc(12871);assertTrue(src.exists());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testIsEmptyDirectory() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0d9sz9xk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testIsEmptyDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0d9sz9xk() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(12872);
        __CLR4_4_198o98okylve1fh.R.inc(12873);final Path tempDir = Files.createTempDirectory(getClass().getCanonicalName());
        __CLR4_4_198o98okylve1fh.R.inc(12874);final File tempDirAsFile = tempDir.toFile();
        __CLR4_4_198o98okylve1fh.R.inc(12875);try {
            __CLR4_4_198o98okylve1fh.R.inc(12876);Assertions.assertTrue(FileUtils.isEmptyDirectory(tempDirAsFile));
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12877);Files.delete(tempDir);
        }
        __CLR4_4_198o98okylve1fh.R.inc(12878);Assertions.assertFalse(FileUtils.isEmptyDirectory(PathUtilsIsEmptyTest.DIR_SIZE_1.toFile()));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    // isFileNewer / isFileOlder
    @Test
    public void testIsFileNewerOlder() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmvz2e9xr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testIsFileNewerOlder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmvz2e9xr() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(12879);
        __CLR4_4_198o98okylve1fh.R.inc(12880);final File reference = new File(temporaryFolder, "FileUtils-reference.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12881);final File oldFile = new File(temporaryFolder, "FileUtils-old.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12882);final File newFile = new File(temporaryFolder, "FileUtils-new.txt");
        __CLR4_4_198o98okylve1fh.R.inc(12883);final File invalidFile = new File(temporaryFolder, "FileUtils-invalid-file.txt");

        // Create Files
        __CLR4_4_198o98okylve1fh.R.inc(12884);if ((((!oldFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12885)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12886)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(12887);throw new IOException("Cannot create file " + oldFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(12888);final OutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(oldFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(12889);try {
            __CLR4_4_198o98okylve1fh.R.inc(12890);TestUtils.generateTestData(output1, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(12891);IOUtils.closeQuietly(output1);
        }

        __CLR4_4_198o98okylve1fh.R.inc(12892);do {{
            __CLR4_4_198o98okylve1fh.R.inc(12893);try {
                __CLR4_4_198o98okylve1fh.R.inc(12894);TestUtils.sleep(1000);
            } catch (final InterruptedException ie) {
                // ignore
            }
            __CLR4_4_198o98okylve1fh.R.inc(12895);if ((((!reference.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12896)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12897)==0&false))) {{
                __CLR4_4_198o98okylve1fh.R.inc(12898);throw new IOException("Cannot create file " + reference
                        + " as the parent directory does not exist");
            }
            }__CLR4_4_198o98okylve1fh.R.inc(12899);final OutputStream output =
                    new BufferedOutputStream(Files.newOutputStream(reference.toPath()));
            __CLR4_4_198o98okylve1fh.R.inc(12900);try {
                __CLR4_4_198o98okylve1fh.R.inc(12901);TestUtils.generateTestData(output, 0);
            } finally {
                __CLR4_4_198o98okylve1fh.R.inc(12902);IOUtils.closeQuietly(output);
            }
        } }while ((((getLastModifiedMillis(oldFile) == getLastModifiedMillis(reference))&&(__CLR4_4_198o98okylve1fh.R.iget(12903)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12904)==0&false)));

        __CLR4_4_198o98okylve1fh.R.inc(12905);final Date date = new Date();
        __CLR4_4_198o98okylve1fh.R.inc(12906);final long now = date.getTime();
        __CLR4_4_198o98okylve1fh.R.inc(12907);final Instant instant = date.toInstant();
        __CLR4_4_198o98okylve1fh.R.inc(12908);final ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        __CLR4_4_198o98okylve1fh.R.inc(12909);final LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        __CLR4_4_198o98okylve1fh.R.inc(12910);final LocalDate localDate = zonedDateTime.toLocalDate();
        __CLR4_4_198o98okylve1fh.R.inc(12911);final LocalDate localDatePlusDay = localDate.plusDays(1);
        __CLR4_4_198o98okylve1fh.R.inc(12912);final LocalTime localTime = LocalTime.ofSecondOfDay(0);

        __CLR4_4_198o98okylve1fh.R.inc(12913);do {{
            __CLR4_4_198o98okylve1fh.R.inc(12914);try {
                __CLR4_4_198o98okylve1fh.R.inc(12915);TestUtils.sleep(1000);
            } catch (final InterruptedException ie) {
                // ignore
            }
            __CLR4_4_198o98okylve1fh.R.inc(12916);if ((((!newFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(12917)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12918)==0&false))) {{
                __CLR4_4_198o98okylve1fh.R.inc(12919);throw new IOException("Cannot create file " + newFile
                        + " as the parent directory does not exist");
            }
            }__CLR4_4_198o98okylve1fh.R.inc(12920);final OutputStream output =
                    new BufferedOutputStream(Files.newOutputStream(newFile.toPath()));
            __CLR4_4_198o98okylve1fh.R.inc(12921);try {
                __CLR4_4_198o98okylve1fh.R.inc(12922);TestUtils.generateTestData(output, 0);
            } finally {
                __CLR4_4_198o98okylve1fh.R.inc(12923);IOUtils.closeQuietly(output);
            }
        } }while ((((getLastModifiedMillis(reference) == getLastModifiedMillis(newFile))&&(__CLR4_4_198o98okylve1fh.R.iget(12924)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(12925)==0&false)));

        // Test isFileNewer()
        __CLR4_4_198o98okylve1fh.R.inc(12926);assertFalse(FileUtils.isFileNewer(oldFile, reference), "Old File - Newer - File");
        __CLR4_4_198o98okylve1fh.R.inc(12927);assertFalse(FileUtils.isFileNewer(oldFile, date), "Old File - Newer - Date");
        __CLR4_4_198o98okylve1fh.R.inc(12928);assertFalse(FileUtils.isFileNewer(oldFile, now), "Old File - Newer - Mili");
        __CLR4_4_198o98okylve1fh.R.inc(12929);assertFalse(FileUtils.isFileNewer(oldFile, instant), "Old File - Newer - Instant");
        __CLR4_4_198o98okylve1fh.R.inc(12930);assertFalse(FileUtils.isFileNewer(oldFile, zonedDateTime), "Old File - Newer - ZonedDateTime");
        __CLR4_4_198o98okylve1fh.R.inc(12931);assertFalse(FileUtils.isFileNewer(oldFile, localDateTime), "Old File - Newer - LocalDateTime");
        __CLR4_4_198o98okylve1fh.R.inc(12932);assertFalse(FileUtils.isFileNewer(oldFile, localDateTime, ZoneId.systemDefault()), "Old File - Newer - LocalDateTime,ZoneId");
        __CLR4_4_198o98okylve1fh.R.inc(12933);assertFalse(FileUtils.isFileNewer(oldFile, localDate), "Old File - Newer - LocalDate");
        __CLR4_4_198o98okylve1fh.R.inc(12934);assertTrue(FileUtils.isFileNewer(oldFile, localDate, localTime), "Old File - Newer - LocalDate,ZoneId");
        __CLR4_4_198o98okylve1fh.R.inc(12935);assertFalse(FileUtils.isFileNewer(oldFile, localDatePlusDay), "Old File - Newer - LocalDate plus one day");
        __CLR4_4_198o98okylve1fh.R.inc(12936);assertFalse(FileUtils.isFileNewer(oldFile, localDatePlusDay, localTime), "Old File - Newer - LocalDate plus one day,ZoneId");

        __CLR4_4_198o98okylve1fh.R.inc(12937);assertTrue(FileUtils.isFileNewer(newFile, reference), "New File - Newer - File");
        __CLR4_4_198o98okylve1fh.R.inc(12938);assertTrue(FileUtils.isFileNewer(newFile, date), "New File - Newer - Date");
        __CLR4_4_198o98okylve1fh.R.inc(12939);assertTrue(FileUtils.isFileNewer(newFile, now), "New File - Newer - Mili");
        __CLR4_4_198o98okylve1fh.R.inc(12940);assertTrue(FileUtils.isFileNewer(newFile, instant), "New File - Newer - Instant");
        __CLR4_4_198o98okylve1fh.R.inc(12941);assertTrue(FileUtils.isFileNewer(newFile, zonedDateTime), "New File - Newer - ZonedDateTime");
        __CLR4_4_198o98okylve1fh.R.inc(12942);assertTrue(FileUtils.isFileNewer(newFile, localDateTime), "New File - Newer - LocalDateTime");
        __CLR4_4_198o98okylve1fh.R.inc(12943);assertTrue(FileUtils.isFileNewer(newFile, localDateTime, ZoneId.systemDefault()), "New File - Newer - LocalDateTime,ZoneId");
        __CLR4_4_198o98okylve1fh.R.inc(12944);assertFalse(FileUtils.isFileNewer(newFile, localDate), "New File - Newer - LocalDate");
        __CLR4_4_198o98okylve1fh.R.inc(12945);assertTrue(FileUtils.isFileNewer(newFile, localDate, localTime), "New File - Newer - LocalDate,ZoneId");
        __CLR4_4_198o98okylve1fh.R.inc(12946);assertFalse(FileUtils.isFileNewer(newFile, localDatePlusDay), "New File - Newer - LocalDate plus one day");
        __CLR4_4_198o98okylve1fh.R.inc(12947);assertFalse(FileUtils.isFileNewer(newFile, localDatePlusDay, localTime), "New File - Newer - LocalDate plus one day,ZoneId");
        __CLR4_4_198o98okylve1fh.R.inc(12948);assertFalse(FileUtils.isFileNewer(invalidFile, reference), "Invalid - Newer - File");
        __CLR4_4_198o98okylve1fh.R.inc(12949);final String invalidFileName = invalidFile.getName();
        __CLR4_4_198o98okylve1fh.R.inc(12950);try {
            __CLR4_4_198o98okylve1fh.R.inc(12951);FileUtils.isFileNewer(newFile, invalidFile);
            __CLR4_4_198o98okylve1fh.R.inc(12952);fail("Should have cause IllegalArgumentException");
        } catch (final IllegalArgumentException iae) {
            __CLR4_4_198o98okylve1fh.R.inc(12953);final String message = iae.getMessage();
            __CLR4_4_198o98okylve1fh.R.inc(12954);assertTrue(message.contains(invalidFileName), "Message should contain: " + invalidFileName + " but was: " + message);
        }

        // Test isFileOlder()
        __CLR4_4_198o98okylve1fh.R.inc(12955);assertTrue(FileUtils.isFileOlder(oldFile, reference), "Old File - Older - File");
        __CLR4_4_198o98okylve1fh.R.inc(12956);assertTrue(FileUtils.isFileOlder(oldFile, date), "Old File - Older - Date");
        __CLR4_4_198o98okylve1fh.R.inc(12957);assertTrue(FileUtils.isFileOlder(oldFile, now), "Old File - Older - Mili");
        __CLR4_4_198o98okylve1fh.R.inc(12958);assertTrue(FileUtils.isFileOlder(oldFile, instant), "Old File - Older - Instant");
        __CLR4_4_198o98okylve1fh.R.inc(12959);assertTrue(FileUtils.isFileOlder(oldFile, zonedDateTime), "Old File - Older - ZonedDateTime");
        __CLR4_4_198o98okylve1fh.R.inc(12960);assertTrue(FileUtils.isFileOlder(oldFile, localDateTime), "Old File - Older - LocalDateTime");
        __CLR4_4_198o98okylve1fh.R.inc(12961);assertTrue(FileUtils.isFileOlder(oldFile, localDateTime, ZoneId.systemDefault()), "Old File - Older - LocalDateTime,LocalTime");
        __CLR4_4_198o98okylve1fh.R.inc(12962);assertTrue(FileUtils.isFileOlder(oldFile, localDate), "Old File - Older - LocalDate");
        __CLR4_4_198o98okylve1fh.R.inc(12963);assertFalse(FileUtils.isFileOlder(oldFile, localDate, localTime), "Old File - Older - LocalDate,ZoneId");
        __CLR4_4_198o98okylve1fh.R.inc(12964);assertTrue(FileUtils.isFileOlder(oldFile, localDatePlusDay), "Old File - Older - LocalDate plus one day");
        __CLR4_4_198o98okylve1fh.R.inc(12965);assertTrue(FileUtils.isFileOlder(oldFile, localDatePlusDay, localTime), "Old File - Older - LocalDate plus one day,LocalTime");

        __CLR4_4_198o98okylve1fh.R.inc(12966);assertFalse(FileUtils.isFileOlder(newFile, reference), "New File - Older - File");
        __CLR4_4_198o98okylve1fh.R.inc(12967);assertFalse(FileUtils.isFileOlder(newFile, date), "New File - Older - Date");
        __CLR4_4_198o98okylve1fh.R.inc(12968);assertFalse(FileUtils.isFileOlder(newFile, now), "New File - Older - Mili");
        __CLR4_4_198o98okylve1fh.R.inc(12969);assertFalse(FileUtils.isFileOlder(newFile, instant), "New File - Older - Instant");
        __CLR4_4_198o98okylve1fh.R.inc(12970);assertFalse(FileUtils.isFileOlder(newFile, zonedDateTime), "New File - Older - ZonedDateTime");
        __CLR4_4_198o98okylve1fh.R.inc(12971);assertFalse(FileUtils.isFileOlder(newFile, localDateTime), "New File - Older - LocalDateTime");
        __CLR4_4_198o98okylve1fh.R.inc(12972);assertFalse(FileUtils.isFileOlder(newFile, localDateTime, ZoneId.systemDefault()), "New File - Older - LocalDateTime,ZoneId");
        __CLR4_4_198o98okylve1fh.R.inc(12973);assertTrue(FileUtils.isFileOlder(newFile, localDate), "New File - Older - LocalDate");
        __CLR4_4_198o98okylve1fh.R.inc(12974);assertFalse(FileUtils.isFileOlder(newFile, localDate, localTime), "New File - Older - LocalDate,LocalTime");
        __CLR4_4_198o98okylve1fh.R.inc(12975);assertTrue(FileUtils.isFileOlder(newFile, localDatePlusDay), "New File - Older - LocalDate plus one day");
        __CLR4_4_198o98okylve1fh.R.inc(12976);assertTrue(FileUtils.isFileOlder(newFile, localDatePlusDay, localTime), "New File - Older - LocalDate plus one day,LocalTime");

        __CLR4_4_198o98okylve1fh.R.inc(12977);assertFalse(FileUtils.isFileOlder(invalidFile, reference), "Invalid - Older - File");
        __CLR4_4_198o98okylve1fh.R.inc(12978);assertThrows(IllegalArgumentException.class, () -> FileUtils.isFileOlder(newFile, invalidFile));
        __CLR4_4_198o98okylve1fh.R.inc(12979);try {
            __CLR4_4_198o98okylve1fh.R.inc(12980);FileUtils.isFileOlder(newFile, invalidFile);
            __CLR4_4_198o98okylve1fh.R.inc(12981);fail("Should have cause IllegalArgumentException");
        } catch (final IllegalArgumentException iae) {
            __CLR4_4_198o98okylve1fh.R.inc(12982);final String message = iae.getMessage();
            __CLR4_4_198o98okylve1fh.R.inc(12983);assertTrue(message.contains(invalidFileName), "Message should contain: " + invalidFileName + " but was: " + message);
        }


        // ----- Test isFileNewer() exceptions -----
        // Null File
        __CLR4_4_198o98okylve1fh.R.inc(12984);assertThrows(NullPointerException.class, () -> FileUtils.isFileNewer(null, now));

        // Null reference File
        __CLR4_4_198o98okylve1fh.R.inc(12985);assertThrows(NullPointerException.class, () -> FileUtils.isFileNewer(oldFile, (File) null));

        // Invalid reference File
        __CLR4_4_198o98okylve1fh.R.inc(12986);assertThrows(IllegalArgumentException.class, () -> FileUtils.isFileNewer(oldFile, invalidFile));

        // Null reference Date
        __CLR4_4_198o98okylve1fh.R.inc(12987);assertThrows(NullPointerException.class, () -> FileUtils.isFileNewer(oldFile, (Date) null));

        // ----- Test isFileOlder() exceptions -----
        // Null File
        __CLR4_4_198o98okylve1fh.R.inc(12988);assertThrows(NullPointerException.class, () -> FileUtils.isFileOlder(null, now));

        // Null reference File
        __CLR4_4_198o98okylve1fh.R.inc(12989);assertThrows(NullPointerException.class, () -> FileUtils.isFileOlder(oldFile, (File) null));

        // Null reference Date
        __CLR4_4_198o98okylve1fh.R.inc(12990);assertThrows(NullPointerException.class, () -> FileUtils.isFileOlder(oldFile, (Date) null));

        // Invalid reference File
        __CLR4_4_198o98okylve1fh.R.inc(12991);assertThrows(IllegalArgumentException.class, () -> FileUtils.isFileOlder(oldFile, invalidFile));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testIsDirectory() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),12992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3t66wa0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testIsDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3t66wa0w() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(12992);
        __CLR4_4_198o98okylve1fh.R.inc(12993);assertFalse(FileUtils.isDirectory(null));

        __CLR4_4_198o98okylve1fh.R.inc(12994);assertTrue(FileUtils.isDirectory(temporaryFolder));
        __CLR4_4_198o98okylve1fh.R.inc(12995);assertFalse(FileUtils.isDirectory(testFile1));

        __CLR4_4_198o98okylve1fh.R.inc(12996);final Path tempDir = Files.createTempDirectory(getClass().getCanonicalName());
        __CLR4_4_198o98okylve1fh.R.inc(12997);final File tempDirAsFile = tempDir.toFile();
        __CLR4_4_198o98okylve1fh.R.inc(12998);Files.delete(tempDir);
        __CLR4_4_198o98okylve1fh.R.inc(12999);assertFalse(FileUtils.isDirectory(tempDirAsFile));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testIsRegularFile() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ktac59a14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testIsRegularFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ktac59a14() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(13000);
        __CLR4_4_198o98okylve1fh.R.inc(13001);assertFalse(FileUtils.isRegularFile(null));

        __CLR4_4_198o98okylve1fh.R.inc(13002);assertFalse(FileUtils.isRegularFile(temporaryFolder));
        __CLR4_4_198o98okylve1fh.R.inc(13003);assertTrue(FileUtils.isRegularFile(testFile1));

        __CLR4_4_198o98okylve1fh.R.inc(13004);Files.delete(testFile1.toPath());
        __CLR4_4_198o98okylve1fh.R.inc(13005);assertFalse(FileUtils.isRegularFile(testFile1));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testIterateFiles() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d775jea1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testIterateFiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d775jea1a() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13006);
        __CLR4_4_198o98okylve1fh.R.inc(13007);final File srcDir = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(13008);final File subDir = new File(srcDir, "list_test");
        __CLR4_4_198o98okylve1fh.R.inc(13009);final File subSubDir = new File(subDir, "subSubDir");
        __CLR4_4_198o98okylve1fh.R.inc(13010);final File notSubSubDir = new File(subDir, "notSubSubDir");
        __CLR4_4_198o98okylve1fh.R.inc(13011);assertTrue(subDir.mkdir());
        __CLR4_4_198o98okylve1fh.R.inc(13012);assertTrue(subSubDir.mkdir());
        __CLR4_4_198o98okylve1fh.R.inc(13013);assertTrue(notSubSubDir.mkdir());
        __CLR4_4_198o98okylve1fh.R.inc(13014);Iterator<File> iterator = null;
        __CLR4_4_198o98okylve1fh.R.inc(13015);try {
            // Need list to be appendable
            __CLR4_4_198o98okylve1fh.R.inc(13016);final List<String> expectedFileNames = new ArrayList<>(
                Arrays.asList("a.txt", "b.txt", "c.txt", "d.txt", "e.txt", "f.txt"));
            __CLR4_4_198o98okylve1fh.R.inc(13017);final int[] fileSizes = {123, 234, 345, 456, 678, 789};
            __CLR4_4_198o98okylve1fh.R.inc(13018);assertEquals(expectedFileNames.size(), fileSizes.length);
            __CLR4_4_198o98okylve1fh.R.inc(13019);Collections.sort(expectedFileNames);
            __CLR4_4_198o98okylve1fh.R.inc(13020);Arrays.sort(fileSizes);
            __CLR4_4_198o98okylve1fh.R.inc(13021);for (int i = 0; (((i < fileSizes.length)&&(__CLR4_4_198o98okylve1fh.R.iget(13022)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13023)==0&false)); ++i) {{
                __CLR4_4_198o98okylve1fh.R.inc(13024);TestUtils.generateTestData(new File(subDir, expectedFileNames.get(i)), fileSizes[i]);
            }
            //
            }__CLR4_4_198o98okylve1fh.R.inc(13025);final String subSubFileName = "z.txt";
            __CLR4_4_198o98okylve1fh.R.inc(13026);TestUtils.generateTestData(new File(subSubDir, subSubFileName), 1);
            __CLR4_4_198o98okylve1fh.R.inc(13027);expectedFileNames.add(subSubFileName);
            //
            __CLR4_4_198o98okylve1fh.R.inc(13028);final String notSubSubFileName = "not.txt";
            __CLR4_4_198o98okylve1fh.R.inc(13029);TestUtils.generateTestData(new File(notSubSubDir, notSubSubFileName), 1);

            __CLR4_4_198o98okylve1fh.R.inc(13030);final WildcardFileFilter allFilesFileFilter = new WildcardFileFilter("*.*");
            __CLR4_4_198o98okylve1fh.R.inc(13031);final NameFileFilter dirFilter = new NameFileFilter("subSubDir");
            __CLR4_4_198o98okylve1fh.R.inc(13032);iterator = FileUtils.iterateFiles(subDir, allFilesFileFilter, dirFilter);

            __CLR4_4_198o98okylve1fh.R.inc(13033);final Map<String, String> matchedFileNames = new HashMap<>();
            __CLR4_4_198o98okylve1fh.R.inc(13034);final List<String> actualFileNames = new ArrayList<>();

            __CLR4_4_198o98okylve1fh.R.inc(13035);while ((((iterator.hasNext())&&(__CLR4_4_198o98okylve1fh.R.iget(13036)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13037)==0&false))) {{
                __CLR4_4_198o98okylve1fh.R.inc(13038);boolean found = false;
                __CLR4_4_198o98okylve1fh.R.inc(13039);final String fileName = iterator.next().getName();
                __CLR4_4_198o98okylve1fh.R.inc(13040);actualFileNames.add(fileName);

                __CLR4_4_198o98okylve1fh.R.inc(13041);for (int j = 0; (((!found && j < expectedFileNames.size())&&(__CLR4_4_198o98okylve1fh.R.iget(13042)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13043)==0&false)); ++j) {{
                    __CLR4_4_198o98okylve1fh.R.inc(13044);final String expectedFileName = expectedFileNames.get(j);
                    __CLR4_4_198o98okylve1fh.R.inc(13045);if ((((expectedFileName.equals(fileName))&&(__CLR4_4_198o98okylve1fh.R.iget(13046)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13047)==0&false))) {{
                        __CLR4_4_198o98okylve1fh.R.inc(13048);matchedFileNames.put(expectedFileName, expectedFileName);
                        __CLR4_4_198o98okylve1fh.R.inc(13049);found = true;
                    }
                }}
            }}
            }__CLR4_4_198o98okylve1fh.R.inc(13050);assertEquals(expectedFileNames.size(), matchedFileNames.size());
            __CLR4_4_198o98okylve1fh.R.inc(13051);Collections.sort(actualFileNames);
            __CLR4_4_198o98okylve1fh.R.inc(13052);assertEquals(expectedFileNames, actualFileNames);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13053);consumeRemaining(iterator);
            __CLR4_4_198o98okylve1fh.R.inc(13054);notSubSubDir.delete();
            __CLR4_4_198o98okylve1fh.R.inc(13055);subSubDir.delete();
            __CLR4_4_198o98okylve1fh.R.inc(13056);subDir.delete();
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testIterateFilesAndDirs() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18nykl1a2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testIterateFilesAndDirs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18nykl1a2p() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(13057);
        __CLR4_4_198o98okylve1fh.R.inc(13058);final File srcDir = temporaryFolder;
        // temporaryFolder/srcDir
        // - subdir1
        // -- subdir2
        // --- a.txt
        // --- subdir3
        // --- subdir4
        __CLR4_4_198o98okylve1fh.R.inc(13059);final File subDir1 = new File(srcDir, "subdir1");
        __CLR4_4_198o98okylve1fh.R.inc(13060);final File subDir2 = new File(subDir1, "subdir2");
        __CLR4_4_198o98okylve1fh.R.inc(13061);final File subDir3 = new File(subDir2, "subdir3");
        __CLR4_4_198o98okylve1fh.R.inc(13062);final File subDir4 = new File(subDir2, "subdir4");
        __CLR4_4_198o98okylve1fh.R.inc(13063);assertTrue(subDir1.mkdir());
        __CLR4_4_198o98okylve1fh.R.inc(13064);assertTrue(subDir2.mkdir());
        __CLR4_4_198o98okylve1fh.R.inc(13065);assertTrue(subDir3.mkdir());
        __CLR4_4_198o98okylve1fh.R.inc(13066);assertTrue(subDir4.mkdir());
        __CLR4_4_198o98okylve1fh.R.inc(13067);final File someFile = new File(subDir2, "a.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13068);final WildcardFileFilter fileFilterAllFiles = new WildcardFileFilter("*.*");
        __CLR4_4_198o98okylve1fh.R.inc(13069);final WildcardFileFilter fileFilterAllDirs = new WildcardFileFilter("*");
        __CLR4_4_198o98okylve1fh.R.inc(13070);final WildcardFileFilter fileFilterExtTxt = new WildcardFileFilter("*.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13071);try {
            class __CLR4_4_1$AC13 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_198o98okylve1fh.R.inc(13072);try (__CLR4_4_1$AC13 __CLR$ACI13=new __CLR4_4_1$AC13(){{__CLR4_4_198o98okylve1fh.R.inc(13073);}};final OutputStream output = new BufferedOutputStream(Files.newOutputStream(someFile.toPath()))) {
                __CLR4_4_198o98okylve1fh.R.inc(13074);TestUtils.generateTestData(output, 100);
            }
            //
            // "*.*" and "*"
            __CLR4_4_198o98okylve1fh.R.inc(13075);Collection<File> expectedFilesAndDirs = Arrays.asList(subDir1, subDir2, someFile, subDir3, subDir4);
            __CLR4_4_198o98okylve1fh.R.inc(13076);iterateFilesAndDirs(subDir1, fileFilterAllFiles, fileFilterAllDirs, expectedFilesAndDirs);
            //
            // "*.txt" and "*"
            __CLR4_4_198o98okylve1fh.R.inc(13077);final int filesCount;
            __CLR4_4_198o98okylve1fh.R.inc(13078);expectedFilesAndDirs = Arrays.asList(subDir1, subDir2, someFile, subDir3, subDir4);
            __CLR4_4_198o98okylve1fh.R.inc(13079);iterateFilesAndDirs(subDir1, fileFilterExtTxt, fileFilterAllDirs, expectedFilesAndDirs);
            //
            // "*.*" and "subdir2"
            __CLR4_4_198o98okylve1fh.R.inc(13080);expectedFilesAndDirs = Arrays.asList(subDir1, subDir2, someFile);
            __CLR4_4_198o98okylve1fh.R.inc(13081);iterateFilesAndDirs(subDir1, fileFilterAllFiles, new NameFileFilter("subdir2"), expectedFilesAndDirs);
            //
            // "*.txt" and "subdir2"
            __CLR4_4_198o98okylve1fh.R.inc(13082);expectedFilesAndDirs = Arrays.asList(subDir1, subDir2, someFile);
            __CLR4_4_198o98okylve1fh.R.inc(13083);iterateFilesAndDirs(subDir1, fileFilterExtTxt, new NameFileFilter("subdir2"), expectedFilesAndDirs);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13084);someFile.delete();
            __CLR4_4_198o98okylve1fh.R.inc(13085);subDir4.delete();
            __CLR4_4_198o98okylve1fh.R.inc(13086);subDir3.delete();
            __CLR4_4_198o98okylve1fh.R.inc(13087);subDir2.delete();
            __CLR4_4_198o98okylve1fh.R.inc(13088);subDir1.delete();
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testListFiles() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fb8tima3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testListFiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fb8tima3l() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13089);
        __CLR4_4_198o98okylve1fh.R.inc(13090);final File srcDir = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(13091);final File subDir = new File(srcDir, "list_test");
        __CLR4_4_198o98okylve1fh.R.inc(13092);final File subDir2 = new File(subDir, "subdir");
        __CLR4_4_198o98okylve1fh.R.inc(13093);subDir.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(13094);subDir2.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(13095);try {

            __CLR4_4_198o98okylve1fh.R.inc(13096);final String[] expectedFileNames = {"a.txt", "b.txt", "c.txt", "d.txt", "e.txt", "f.txt"};
            __CLR4_4_198o98okylve1fh.R.inc(13097);final int[] fileSizes = {123, 234, 345, 456, 678, 789};

            __CLR4_4_198o98okylve1fh.R.inc(13098);for (int i = 0; (((i < expectedFileNames.length)&&(__CLR4_4_198o98okylve1fh.R.iget(13099)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13100)==0&false)); ++i) {{
                __CLR4_4_198o98okylve1fh.R.inc(13101);final File theFile = new File(subDir, expectedFileNames[i]);
                __CLR4_4_198o98okylve1fh.R.inc(13102);if ((((!theFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13103)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13104)==0&false))) {{
                    __CLR4_4_198o98okylve1fh.R.inc(13105);throw new IOException("Cannot create file " + theFile + " as the parent directory does not exist");
                }
                }__CLR4_4_198o98okylve1fh.R.inc(13106);final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(theFile.toPath()));
                __CLR4_4_198o98okylve1fh.R.inc(13107);try {
                    __CLR4_4_198o98okylve1fh.R.inc(13108);TestUtils.generateTestData(output, fileSizes[i]);
                } finally {
                    __CLR4_4_198o98okylve1fh.R.inc(13109);IOUtils.closeQuietly(output);
                }
            }

            }__CLR4_4_198o98okylve1fh.R.inc(13110);final Collection<File> actualFiles = FileUtils.listFiles(subDir, new WildcardFileFilter("*.*"),
                new WildcardFileFilter("*"));

            __CLR4_4_198o98okylve1fh.R.inc(13111);final int count = actualFiles.size();
            __CLR4_4_198o98okylve1fh.R.inc(13112);final Object[] fileObjs = actualFiles.toArray();

            __CLR4_4_198o98okylve1fh.R.inc(13113);assertEquals(expectedFileNames.length, actualFiles.size(), () -> actualFiles.toString());

            __CLR4_4_198o98okylve1fh.R.inc(13114);final Map<String, String> foundFileNames = new HashMap<>();

            __CLR4_4_198o98okylve1fh.R.inc(13115);for (int i = 0; (((i < count)&&(__CLR4_4_198o98okylve1fh.R.iget(13116)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13117)==0&false)); ++i) {{
                __CLR4_4_198o98okylve1fh.R.inc(13118);boolean found = false;
                __CLR4_4_198o98okylve1fh.R.inc(13119);for (int j = 0; (((!found && j < expectedFileNames.length)&&(__CLR4_4_198o98okylve1fh.R.iget(13120)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13121)==0&false)); ++j) {{
                    __CLR4_4_198o98okylve1fh.R.inc(13122);if ((((expectedFileNames[j].equals(((File) fileObjs[i]).getName()))&&(__CLR4_4_198o98okylve1fh.R.iget(13123)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13124)==0&false))) {{
                        __CLR4_4_198o98okylve1fh.R.inc(13125);foundFileNames.put(expectedFileNames[j], expectedFileNames[j]);
                        __CLR4_4_198o98okylve1fh.R.inc(13126);found = true;
                    }
                }}
            }}

            }__CLR4_4_198o98okylve1fh.R.inc(13127);assertEquals(foundFileNames.size(), expectedFileNames.length, () -> foundFileNames.toString());
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13128);subDir.delete();
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testListFilesWithDirs() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggaglia4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testListFilesWithDirs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggaglia4p() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(13129);
        __CLR4_4_198o98okylve1fh.R.inc(13130);final File srcDir = temporaryFolder;

        __CLR4_4_198o98okylve1fh.R.inc(13131);final File subDir1 = new File(srcDir, "subdir");
        __CLR4_4_198o98okylve1fh.R.inc(13132);final File subDir2 = new File(subDir1, "subdir2");
        __CLR4_4_198o98okylve1fh.R.inc(13133);subDir1.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(13134);subDir2.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(13135);try {
            __CLR4_4_198o98okylve1fh.R.inc(13136);final File someFile = new File(subDir2, "a.txt");
            __CLR4_4_198o98okylve1fh.R.inc(13137);if ((((!someFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13138)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13139)==0&false))) {{
                __CLR4_4_198o98okylve1fh.R.inc(13140);throw new IOException("Cannot create file " + someFile + " as the parent directory does not exist");
            }
            }__CLR4_4_198o98okylve1fh.R.inc(13141);final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(someFile.toPath()));
            __CLR4_4_198o98okylve1fh.R.inc(13142);try {
                __CLR4_4_198o98okylve1fh.R.inc(13143);TestUtils.generateTestData(output, 100);
            } finally {
                __CLR4_4_198o98okylve1fh.R.inc(13144);IOUtils.closeQuietly(output);
            }

            __CLR4_4_198o98okylve1fh.R.inc(13145);final File subDir3 = new File(subDir2, "subdir3");
            __CLR4_4_198o98okylve1fh.R.inc(13146);subDir3.mkdir();

            __CLR4_4_198o98okylve1fh.R.inc(13147);final Collection<File> files = FileUtils.listFilesAndDirs(subDir1, new WildcardFileFilter("*.*"),
                new WildcardFileFilter("*"));

            __CLR4_4_198o98okylve1fh.R.inc(13148);assertEquals(4, files.size());
            __CLR4_4_198o98okylve1fh.R.inc(13149);assertTrue(files.contains(subDir1), "Should contain the directory.");
            __CLR4_4_198o98okylve1fh.R.inc(13150);assertTrue(files.contains(subDir2), "Should contain the directory.");
            __CLR4_4_198o98okylve1fh.R.inc(13151);assertTrue(files.contains(someFile), "Should contain the file.");
            __CLR4_4_198o98okylve1fh.R.inc(13152);assertTrue(files.contains(subDir3), "Should contain the directory.");
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13153);subDir1.delete();
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveDirectory_CopyDelete() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x40w4a5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveDirectory_CopyDelete",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x40w4a5e() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13154);

        __CLR4_4_198o98okylve1fh.R.inc(13155);final File dir = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(13156);final File src = new File(dir, "testMoveDirectory2Source") {
            private static final long serialVersionUID = 1L;

            // Force renameTo to fail
            @Override
            public boolean renameTo(final File dest) {try{__CLR4_4_198o98okylve1fh.R.inc(13157);
                __CLR4_4_198o98okylve1fh.R.inc(13158);return false;
            }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}
        };
        __CLR4_4_198o98okylve1fh.R.inc(13159);final File testDir = new File(src, "foo");
        __CLR4_4_198o98okylve1fh.R.inc(13160);final File testFile = new File(testDir, "bar");
        __CLR4_4_198o98okylve1fh.R.inc(13161);testDir.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(13162);if ((((!testFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13163)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13164)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13165);throw new IOException("Cannot create file " + testFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13166);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13167);try {
            __CLR4_4_198o98okylve1fh.R.inc(13168);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13169);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13170);final File destination = new File(dir, "testMoveDirectory1Dest");
        __CLR4_4_198o98okylve1fh.R.inc(13171);FileUtils.deleteDirectory(destination);

        // Move the directory
        __CLR4_4_198o98okylve1fh.R.inc(13172);FileUtils.moveDirectory(src, destination);

        // Check results
        __CLR4_4_198o98okylve1fh.R.inc(13173);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(13174);assertFalse(src.exists(), "Original deleted");
        __CLR4_4_198o98okylve1fh.R.inc(13175);final File movedDir = new File(destination, testDir.getName());
        __CLR4_4_198o98okylve1fh.R.inc(13176);final File movedFile = new File(movedDir, testFile.getName());
        __CLR4_4_198o98okylve1fh.R.inc(13177);assertTrue(movedDir.exists(), "Check dir moved");
        __CLR4_4_198o98okylve1fh.R.inc(13178);assertTrue(movedFile.exists(), "Check file moved");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveDirectory_Errors() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0kadja63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveDirectory_Errors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0kadja63() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13179);
        __CLR4_4_198o98okylve1fh.R.inc(13180);assertThrows(NullPointerException.class, () -> FileUtils.moveDirectory(null, new File("foo")));
        __CLR4_4_198o98okylve1fh.R.inc(13181);assertThrows(NullPointerException.class, () -> FileUtils.moveDirectory(new File("foo"), null));
        __CLR4_4_198o98okylve1fh.R.inc(13182);try {
            __CLR4_4_198o98okylve1fh.R.inc(13183);FileUtils.moveDirectory(new File("nonexistant"), new File("foo"));
            __CLR4_4_198o98okylve1fh.R.inc(13184);fail("Expected FileNotFoundException for source");
        } catch (final FileNotFoundException e) {
            // expected
        }
        __CLR4_4_198o98okylve1fh.R.inc(13185);final File testFile = new File(temporaryFolder, "testMoveDirectoryFile");
        __CLR4_4_198o98okylve1fh.R.inc(13186);if ((((!testFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13187)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13188)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13189);throw new IOException("Cannot create file " + testFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13190);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13191);try {
            __CLR4_4_198o98okylve1fh.R.inc(13192);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13193);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13194);assertThrows(IllegalArgumentException.class, () -> FileUtils.moveDirectory(testFile, new File("foo")));
        __CLR4_4_198o98okylve1fh.R.inc(13195);final File testSrcFile = new File(temporaryFolder, "testMoveDirectorySource");
        __CLR4_4_198o98okylve1fh.R.inc(13196);final File testDestFile = new File(temporaryFolder, "testMoveDirectoryDest");
        __CLR4_4_198o98okylve1fh.R.inc(13197);testSrcFile.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(13198);testDestFile.mkdir();
        __CLR4_4_198o98okylve1fh.R.inc(13199);try {
            __CLR4_4_198o98okylve1fh.R.inc(13200);FileUtils.moveDirectory(testSrcFile, testDestFile);
            __CLR4_4_198o98okylve1fh.R.inc(13201);fail("Expected FileExistsException when dest already exists");
        } catch (final FileExistsException e) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveDirectory_Rename() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5thqea6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveDirectory_Rename",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5thqea6q() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13202);
        __CLR4_4_198o98okylve1fh.R.inc(13203);final File dir = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(13204);final File src = new File(dir, "testMoveDirectory1Source");
        __CLR4_4_198o98okylve1fh.R.inc(13205);final File testDir = new File(src, "foo");
        __CLR4_4_198o98okylve1fh.R.inc(13206);final File testFile = new File(testDir, "bar");
        __CLR4_4_198o98okylve1fh.R.inc(13207);testDir.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(13208);if ((((!testFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13209)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13210)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13211);throw new IOException("Cannot create file " + testFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13212);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13213);try {
            __CLR4_4_198o98okylve1fh.R.inc(13214);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13215);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13216);final File destination = new File(dir, "testMoveDirectory1Dest");
        __CLR4_4_198o98okylve1fh.R.inc(13217);FileUtils.deleteDirectory(destination);

        // Move the directory
        __CLR4_4_198o98okylve1fh.R.inc(13218);FileUtils.moveDirectory(src, destination);

        // Check results
        __CLR4_4_198o98okylve1fh.R.inc(13219);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(13220);assertFalse(src.exists(), "Original deleted");
        __CLR4_4_198o98okylve1fh.R.inc(13221);final File movedDir = new File(destination, testDir.getName());
        __CLR4_4_198o98okylve1fh.R.inc(13222);final File movedFile = new File(movedDir, testFile.getName());
        __CLR4_4_198o98okylve1fh.R.inc(13223);assertTrue(movedDir.exists(), "Check dir moved");
        __CLR4_4_198o98okylve1fh.R.inc(13224);assertTrue(movedFile.exists(), "Check file moved");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveDirectoryToDirectory() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xo5ckva7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveDirectoryToDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xo5ckva7d() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13225);
        __CLR4_4_198o98okylve1fh.R.inc(13226);final File dir = temporaryFolder;
        __CLR4_4_198o98okylve1fh.R.inc(13227);final File src = new File(dir, "testMoveDirectory1Source");
        __CLR4_4_198o98okylve1fh.R.inc(13228);final File testChildDir = new File(src, "foo");
        __CLR4_4_198o98okylve1fh.R.inc(13229);final File testFile = new File(testChildDir, "bar");
        __CLR4_4_198o98okylve1fh.R.inc(13230);testChildDir.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(13231);if ((((!testFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13232)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13233)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13234);throw new IOException("Cannot create file " + testFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13235);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13236);try {
            __CLR4_4_198o98okylve1fh.R.inc(13237);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13238);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13239);final File destDir = new File(dir, "testMoveDirectory1Dest");
        __CLR4_4_198o98okylve1fh.R.inc(13240);FileUtils.deleteDirectory(destDir);
        __CLR4_4_198o98okylve1fh.R.inc(13241);assertFalse(destDir.exists(), "Check Exist before");

        // Move the directory
        __CLR4_4_198o98okylve1fh.R.inc(13242);FileUtils.moveDirectoryToDirectory(src, destDir, true);

        // Check results
        __CLR4_4_198o98okylve1fh.R.inc(13243);assertTrue(destDir.exists(), "Check Exist after");
        __CLR4_4_198o98okylve1fh.R.inc(13244);assertFalse(src.exists(), "Original deleted");
        __CLR4_4_198o98okylve1fh.R.inc(13245);final File movedDir = new File(destDir, src.getName());
        __CLR4_4_198o98okylve1fh.R.inc(13246);final File movedChildDir = new File(movedDir, testChildDir.getName());
        __CLR4_4_198o98okylve1fh.R.inc(13247);final File movedFile = new File(movedChildDir, testFile.getName());
        __CLR4_4_198o98okylve1fh.R.inc(13248);assertTrue(movedDir.exists(), "Check dir moved");
        __CLR4_4_198o98okylve1fh.R.inc(13249);assertTrue(movedChildDir.exists(), "Check child dir moved");
        __CLR4_4_198o98okylve1fh.R.inc(13250);assertTrue(movedFile.exists(), "Check file moved");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveDirectoryToDirectory_Errors() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4s2yfa83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveDirectoryToDirectory_Errors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4s2yfa83() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13251);
        __CLR4_4_198o98okylve1fh.R.inc(13252);assertThrows(NullPointerException.class, () -> FileUtils.moveDirectoryToDirectory(null, new File("foo"), true));
        __CLR4_4_198o98okylve1fh.R.inc(13253);assertThrows(NullPointerException.class, () -> FileUtils.moveDirectoryToDirectory(new File("foo"), null, true));
        __CLR4_4_198o98okylve1fh.R.inc(13254);final File testFile1 = new File(temporaryFolder, "testMoveFileFile1");
        __CLR4_4_198o98okylve1fh.R.inc(13255);final File testFile2 = new File(temporaryFolder, "testMoveFileFile2");
        __CLR4_4_198o98okylve1fh.R.inc(13256);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13257)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13258)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13259);throw new IOException("Cannot create file " + testFile1 + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13260);final BufferedOutputStream output1 = new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13261);try {
            __CLR4_4_198o98okylve1fh.R.inc(13262);TestUtils.generateTestData(output1, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13263);IOUtils.closeQuietly(output1);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13264);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13265)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13266)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13267);throw new IOException("Cannot create file " + testFile2 + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13268);final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13269);try {
            __CLR4_4_198o98okylve1fh.R.inc(13270);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13271);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13272);try {
            __CLR4_4_198o98okylve1fh.R.inc(13273);FileUtils.moveDirectoryToDirectory(testFile1, testFile2, true);
            __CLR4_4_198o98okylve1fh.R.inc(13274);fail("Expected IOException when dest not a directory");
        } catch (final IOException e) {
            // expected
        }

        __CLR4_4_198o98okylve1fh.R.inc(13275);final File nonexistant = new File(temporaryFolder, "testMoveFileNonExistant");
        __CLR4_4_198o98okylve1fh.R.inc(13276);try {
            __CLR4_4_198o98okylve1fh.R.inc(13277);FileUtils.moveDirectoryToDirectory(testFile1, nonexistant, false);
            __CLR4_4_198o98okylve1fh.R.inc(13278);fail("Expected IOException when dest does not exist and create=false");
        } catch (final IOException e) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveFile_CopyDelete() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w04rk7a8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveFile_CopyDelete",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w04rk7a8v() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13279);
        __CLR4_4_198o98okylve1fh.R.inc(13280);final File destination = new File(temporaryFolder, "move2.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13281);final File src = new File(testFile1.getAbsolutePath()) {
            private static final long serialVersionUID = 1L;

            // Force renameTo to fail, as if destination is on another
            // filesystem
            @Override
            public boolean renameTo(final File f) {try{__CLR4_4_198o98okylve1fh.R.inc(13282);
                __CLR4_4_198o98okylve1fh.R.inc(13283);return false;
            }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}
        };
        __CLR4_4_198o98okylve1fh.R.inc(13284);FileUtils.moveFile(src, destination);
        __CLR4_4_198o98okylve1fh.R.inc(13285);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(13286);assertFalse(src.exists(), "Original deleted");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveFile_CopyDelete_Failed() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oo8bula93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveFile_CopyDelete_Failed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oo8bula93() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13287);
        __CLR4_4_198o98okylve1fh.R.inc(13288);final File destination = new File(temporaryFolder, "move3.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13289);final File src = new File(testFile1.getAbsolutePath()) {
            private static final long serialVersionUID = 1L;

            // Force delete failure
            @Override
            public boolean delete() {try{__CLR4_4_198o98okylve1fh.R.inc(13290);
                __CLR4_4_198o98okylve1fh.R.inc(13291);return false;
            }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

            // Force renameTo to fail, as if destination is on another
            // filesystem
            @Override
            public boolean renameTo(final File f) {try{__CLR4_4_198o98okylve1fh.R.inc(13292);
                __CLR4_4_198o98okylve1fh.R.inc(13293);return false;
            }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

        };
        __CLR4_4_198o98okylve1fh.R.inc(13294);assertThrows(IOException.class, () -> FileUtils.moveFile(src, destination));
        // expected
        __CLR4_4_198o98okylve1fh.R.inc(13295);assertFalse(destination.exists(), "Check Rollback");
        __CLR4_4_198o98okylve1fh.R.inc(13296);assertTrue(src.exists(), "Original exists");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveFile_CopyDelete_WithFileDatePreservation() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hen9oya9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveFile_CopyDelete_WithFileDatePreservation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hen9oya9d() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13297);
        __CLR4_4_198o98okylve1fh.R.inc(13298);final File destination = new File(temporaryFolder, "move2.txt");

        __CLR4_4_198o98okylve1fh.R.inc(13299);backDateFile10Minutes(testFile1); // set test file back 10 minutes

        __CLR4_4_198o98okylve1fh.R.inc(13300);final File src = new File(testFile1.getAbsolutePath()) {
            private static final long serialVersionUID = 1L;

            // Force renameTo to fail, as if destination is on another
            // filesystem
            @Override
            public boolean renameTo(final File f) {try{__CLR4_4_198o98okylve1fh.R.inc(13301);
                __CLR4_4_198o98okylve1fh.R.inc(13302);return false;
            }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}
        };
        __CLR4_4_198o98okylve1fh.R.inc(13303);final long expected = getLastModifiedMillis(testFile1);

        __CLR4_4_198o98okylve1fh.R.inc(13304);FileUtils.moveFile(src, destination, StandardCopyOption.COPY_ATTRIBUTES);
        __CLR4_4_198o98okylve1fh.R.inc(13305);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(13306);assertFalse(src.exists(), "Original deleted");

        __CLR4_4_198o98okylve1fh.R.inc(13307);final long destLastMod = getLastModifiedMillis(destination);
        __CLR4_4_198o98okylve1fh.R.inc(13308);final long delta = destLastMod - expected;
        __CLR4_4_198o98okylve1fh.R.inc(13309);assertEquals(expected, destLastMod, "Check last modified date same as input, delta " + delta);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveFile_CopyDelete_WithoutFileDatePreservation() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uw791ma9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveFile_CopyDelete_WithoutFileDatePreservation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uw791ma9q() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13310);
        __CLR4_4_198o98okylve1fh.R.inc(13311);final File destination = new File(temporaryFolder, "move2.txt");

        __CLR4_4_198o98okylve1fh.R.inc(13312);backDateFile10Minutes(testFile1); // set test file back 10 minutes

        // destination file time should not be less than this (allowing for granularity)
        __CLR4_4_198o98okylve1fh.R.inc(13313);final long nowMillis = System.currentTimeMillis() - 1000L;

        __CLR4_4_198o98okylve1fh.R.inc(13314);final File src = new File(testFile1.getAbsolutePath()) {
            private static final long serialVersionUID = 1L;

            // Force renameTo to fail, as if destination is on another
            // filesystem
            @Override
            public boolean renameTo(final File f) {try{__CLR4_4_198o98okylve1fh.R.inc(13315);
                __CLR4_4_198o98okylve1fh.R.inc(13316);return false;
            }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}
        };
        __CLR4_4_198o98okylve1fh.R.inc(13317);final long unexpectedMillis = getLastModifiedMillis(testFile1);

        __CLR4_4_198o98okylve1fh.R.inc(13318);FileUtils.moveFile(src, destination, PathUtils.EMPTY_COPY_OPTIONS);
        __CLR4_4_198o98okylve1fh.R.inc(13319);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(13320);assertFalse(src.exists(), "Original deleted");

        // On Windows, the last modified time is copied by default.
        __CLR4_4_198o98okylve1fh.R.inc(13321);if ((((!SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_198o98okylve1fh.R.iget(13322)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13323)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13324);final long destLastModMillis = getLastModifiedMillis(destination);
            __CLR4_4_198o98okylve1fh.R.inc(13325);final long deltaMillis = destLastModMillis - unexpectedMillis;
            __CLR4_4_198o98okylve1fh.R.inc(13326);assertNotEquals(unexpectedMillis, destLastModMillis,
                "Check last modified date not same as input, delta " + deltaMillis);
            __CLR4_4_198o98okylve1fh.R.inc(13327);assertTrue(destLastModMillis > nowMillis,
                destLastModMillis + " > " + nowMillis + " (delta " + deltaMillis + ")");
        }
    }}finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveFile_Errors() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1bleaaa8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveFile_Errors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1bleaaa8() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13328);
        __CLR4_4_198o98okylve1fh.R.inc(13329);assertThrows(NullPointerException.class, () -> FileUtils.moveFile(null, new File("foo")));
        __CLR4_4_198o98okylve1fh.R.inc(13330);assertThrows(NullPointerException.class, () -> FileUtils.moveFile(new File("foo"), null));
        __CLR4_4_198o98okylve1fh.R.inc(13331);try {
            __CLR4_4_198o98okylve1fh.R.inc(13332);FileUtils.moveFile(new File("nonexistant"), new File("foo"));
            __CLR4_4_198o98okylve1fh.R.inc(13333);fail("Expected FileNotFoundException for source");
        } catch (final FileNotFoundException e) {
            // expected
        }
        __CLR4_4_198o98okylve1fh.R.inc(13334);assertThrows(IllegalArgumentException.class, () -> FileUtils.moveFile(temporaryFolder, new File("foo")));
        __CLR4_4_198o98okylve1fh.R.inc(13335);final File testSourceFile = new File(temporaryFolder, "testMoveFileSource");
        __CLR4_4_198o98okylve1fh.R.inc(13336);final File testDestFile = new File(temporaryFolder, "testMoveFileSource");
        __CLR4_4_198o98okylve1fh.R.inc(13337);if ((((!testSourceFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13338)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13339)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13340);throw new IOException("Cannot create file " + testSourceFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13341);final BufferedOutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(testSourceFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13342);try {
            __CLR4_4_198o98okylve1fh.R.inc(13343);TestUtils.generateTestData(output1, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13344);IOUtils.closeQuietly(output1);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13345);if ((((!testDestFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13346)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13347)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13348);throw new IOException("Cannot create file " + testDestFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13349);final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testDestFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13350);try {
            __CLR4_4_198o98okylve1fh.R.inc(13351);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13352);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13353);try {
            __CLR4_4_198o98okylve1fh.R.inc(13354);FileUtils.moveFile(testSourceFile, testDestFile);
            __CLR4_4_198o98okylve1fh.R.inc(13355);fail("Expected FileExistsException when dest already exists");
        } catch (final FileExistsException e) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveFile_Rename() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v526pnab0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveFile_Rename",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v526pnab0() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13356);
        __CLR4_4_198o98okylve1fh.R.inc(13357);final File destination = new File(temporaryFolder, "move1.txt");

        __CLR4_4_198o98okylve1fh.R.inc(13358);FileUtils.moveFile(testFile1, destination);
        __CLR4_4_198o98okylve1fh.R.inc(13359);assertTrue(destination.exists(), "Check Exist");
        __CLR4_4_198o98okylve1fh.R.inc(13360);assertFalse(testFile1.exists(), "Original deleted");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveFileToDirectory() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fpwxyab5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveFileToDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fpwxyab5() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13361);
        __CLR4_4_198o98okylve1fh.R.inc(13362);final File destDir = new File(temporaryFolder, "moveFileDestDir");
        __CLR4_4_198o98okylve1fh.R.inc(13363);final File movedFile = new File(destDir, testFile1.getName());
        __CLR4_4_198o98okylve1fh.R.inc(13364);assertFalse(destDir.exists(), "Check Exist before");
        __CLR4_4_198o98okylve1fh.R.inc(13365);assertFalse(movedFile.exists(), "Check Exist before");

        __CLR4_4_198o98okylve1fh.R.inc(13366);FileUtils.moveFileToDirectory(testFile1, destDir, true);
        __CLR4_4_198o98okylve1fh.R.inc(13367);assertTrue(movedFile.exists(), "Check Exist after");
        __CLR4_4_198o98okylve1fh.R.inc(13368);assertFalse(testFile1.exists(), "Original deleted");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveFileToDirectory_Errors() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfeu76abd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveFileToDirectory_Errors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfeu76abd() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13369);
        __CLR4_4_198o98okylve1fh.R.inc(13370);assertThrows(NullPointerException.class, () -> FileUtils.moveFileToDirectory(null, new File("foo"), true));
        __CLR4_4_198o98okylve1fh.R.inc(13371);assertThrows(NullPointerException.class, () -> FileUtils.moveFileToDirectory(new File("foo"), null, true));
        __CLR4_4_198o98okylve1fh.R.inc(13372);final File testFile1 = new File(temporaryFolder, "testMoveFileFile1");
        __CLR4_4_198o98okylve1fh.R.inc(13373);final File testFile2 = new File(temporaryFolder, "testMoveFileFile2");
        __CLR4_4_198o98okylve1fh.R.inc(13374);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13375)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13376)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13377);throw new IOException("Cannot create file " + testFile1
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13378);final BufferedOutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13379);try {
            __CLR4_4_198o98okylve1fh.R.inc(13380);TestUtils.generateTestData(output1, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13381);IOUtils.closeQuietly(output1);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13382);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13383)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13384)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13385);throw new IOException("Cannot create file " + testFile2
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13386);final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13387);try {
            __CLR4_4_198o98okylve1fh.R.inc(13388);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13389);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13390);assertThrows(IllegalArgumentException.class, () -> FileUtils.moveFileToDirectory(testFile1, testFile2, true));

        __CLR4_4_198o98okylve1fh.R.inc(13391);final File nonexistant = new File(temporaryFolder, "testMoveFileNonExistant");
        __CLR4_4_198o98okylve1fh.R.inc(13392);try {
            __CLR4_4_198o98okylve1fh.R.inc(13393);FileUtils.moveFileToDirectory(testFile1, nonexistant, false);
            __CLR4_4_198o98okylve1fh.R.inc(13394);fail("Expected IOException when dest does not exist and create=false");
        } catch (final IOException e) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveToDirectory() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18oozxmac3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveToDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18oozxmac3() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13395);
        __CLR4_4_198o98okylve1fh.R.inc(13396);final File destDir = new File(temporaryFolder, "testMoveToDirectoryDestDir");
        __CLR4_4_198o98okylve1fh.R.inc(13397);final File testDir = new File(temporaryFolder, "testMoveToDirectoryTestDir");
        __CLR4_4_198o98okylve1fh.R.inc(13398);final File testFile = new File(temporaryFolder, "testMoveToDirectoryTestFile");
        __CLR4_4_198o98okylve1fh.R.inc(13399);testDir.mkdirs();
        __CLR4_4_198o98okylve1fh.R.inc(13400);if ((((!testFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13401)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13402)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13403);throw new IOException("Cannot create file " + testFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13404);final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13405);try {
            __CLR4_4_198o98okylve1fh.R.inc(13406);TestUtils.generateTestData(output, 0);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13407);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13408);final File movedFile = new File(destDir, testFile.getName());
        __CLR4_4_198o98okylve1fh.R.inc(13409);final File movedDir = new File(destDir, testFile.getName());

        __CLR4_4_198o98okylve1fh.R.inc(13410);assertFalse(movedFile.exists(), "Check File Doesnt exist");
        __CLR4_4_198o98okylve1fh.R.inc(13411);assertFalse(movedDir.exists(), "Check Dir Doesnt exist");

        // Test moving a file
        __CLR4_4_198o98okylve1fh.R.inc(13412);FileUtils.moveToDirectory(testFile, destDir, true);
        __CLR4_4_198o98okylve1fh.R.inc(13413);assertTrue(movedFile.exists(), "Check File exists");
        __CLR4_4_198o98okylve1fh.R.inc(13414);assertFalse(testFile.exists(), "Check Original File doesn't exist");

        // Test moving a directory
        __CLR4_4_198o98okylve1fh.R.inc(13415);FileUtils.moveToDirectory(testDir, destDir, true);
        __CLR4_4_198o98okylve1fh.R.inc(13416);assertTrue(movedDir.exists(), "Check Dir exists");
        __CLR4_4_198o98okylve1fh.R.inc(13417);assertFalse(testDir.exists(), "Check Original Dir doesn't exist");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testMoveToDirectory_Errors() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1putv5qacq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testMoveToDirectory_Errors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1putv5qacq() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13418);
        __CLR4_4_198o98okylve1fh.R.inc(13419);try {
            __CLR4_4_198o98okylve1fh.R.inc(13420);FileUtils.moveDirectoryToDirectory(null, new File("foo"), true);
            __CLR4_4_198o98okylve1fh.R.inc(13421);fail("Expected NullPointerException when source is null");
        } catch (final NullPointerException e) {
            // expected
        }
        __CLR4_4_198o98okylve1fh.R.inc(13422);try {
            __CLR4_4_198o98okylve1fh.R.inc(13423);FileUtils.moveDirectoryToDirectory(new File("foo"), null, true);
            __CLR4_4_198o98okylve1fh.R.inc(13424);fail("Expected NullPointerException when destination is null");
        } catch (final NullPointerException e) {
            // expected
        }
        __CLR4_4_198o98okylve1fh.R.inc(13425);final File nonexistant = new File(temporaryFolder, "nonexistant");
        __CLR4_4_198o98okylve1fh.R.inc(13426);final File destDir = new File(temporaryFolder, "MoveToDirectoryDestDir");
        __CLR4_4_198o98okylve1fh.R.inc(13427);try {
            __CLR4_4_198o98okylve1fh.R.inc(13428);FileUtils.moveToDirectory(nonexistant, destDir, true);
            __CLR4_4_198o98okylve1fh.R.inc(13429);fail("Expected IOException when source does not exist");
        } catch (final IOException e) {
            // expected
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testReadFileToByteArray() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9v1c7ad2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testReadFileToByteArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9v1c7ad2() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13430);
        __CLR4_4_198o98okylve1fh.R.inc(13431);final File file = new File(temporaryFolder, "read.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13432);final OutputStream out = Files.newOutputStream(file.toPath());
        __CLR4_4_198o98okylve1fh.R.inc(13433);out.write(11);
        __CLR4_4_198o98okylve1fh.R.inc(13434);out.write(21);
        __CLR4_4_198o98okylve1fh.R.inc(13435);out.write(31);
        __CLR4_4_198o98okylve1fh.R.inc(13436);out.close();

        __CLR4_4_198o98okylve1fh.R.inc(13437);final byte[] data = FileUtils.readFileToByteArray(file);
        __CLR4_4_198o98okylve1fh.R.inc(13438);assertEquals(3, data.length);
        __CLR4_4_198o98okylve1fh.R.inc(13439);assertEquals(11, data[0]);
        __CLR4_4_198o98okylve1fh.R.inc(13440);assertEquals(21, data[1]);
        __CLR4_4_198o98okylve1fh.R.inc(13441);assertEquals(31, data[2]);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testReadFileToStringWithDefaultEncoding() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h8j1ffade();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testReadFileToStringWithDefaultEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h8j1ffade() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13442);
        __CLR4_4_198o98okylve1fh.R.inc(13443);final File file = new File(temporaryFolder, "read.obj");
        __CLR4_4_198o98okylve1fh.R.inc(13444);final OutputStream out = Files.newOutputStream(file.toPath());
        __CLR4_4_198o98okylve1fh.R.inc(13445);final byte[] text = "Hello /u1234".getBytes();
        __CLR4_4_198o98okylve1fh.R.inc(13446);out.write(text);
        __CLR4_4_198o98okylve1fh.R.inc(13447);out.close();

        __CLR4_4_198o98okylve1fh.R.inc(13448);final String data = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13449);assertEquals("Hello /u1234", data);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testReadFileToStringWithEncoding() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlfjlcadm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testReadFileToStringWithEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlfjlcadm() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13450);
        __CLR4_4_198o98okylve1fh.R.inc(13451);final File file = new File(temporaryFolder, "read.obj");
        __CLR4_4_198o98okylve1fh.R.inc(13452);final OutputStream out = Files.newOutputStream(file.toPath());
        __CLR4_4_198o98okylve1fh.R.inc(13453);final byte[] text = "Hello /u1234".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_198o98okylve1fh.R.inc(13454);out.write(text);
        __CLR4_4_198o98okylve1fh.R.inc(13455);out.close();

        __CLR4_4_198o98okylve1fh.R.inc(13456);final String data = FileUtils.readFileToString(file, "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(13457);assertEquals("Hello /u1234", data);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testReadLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx536adu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testReadLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx536adu() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13458);
        __CLR4_4_198o98okylve1fh.R.inc(13459);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13460);try {
            __CLR4_4_198o98okylve1fh.R.inc(13461);final String[] data = {"hello", "/u1234", "", "this is", "some text"};
            __CLR4_4_198o98okylve1fh.R.inc(13462);TestUtils.createLineBasedFile(file, data);

            __CLR4_4_198o98okylve1fh.R.inc(13463);final List<String> lines = FileUtils.readLines(file, "UTF-8");
            __CLR4_4_198o98okylve1fh.R.inc(13464);assertEquals(Arrays.asList(data), lines);
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13465);TestUtils.deleteFile(file);
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testSizeOf() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h63lypae2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testSizeOf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h63lypae2() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13466);
        __CLR4_4_198o98okylve1fh.R.inc(13467);final File file = new File(temporaryFolder, getName());

        // Null argument
        __CLR4_4_198o98okylve1fh.R.inc(13468);try {
            __CLR4_4_198o98okylve1fh.R.inc(13469);FileUtils.sizeOf(null);
            __CLR4_4_198o98okylve1fh.R.inc(13470);fail("Exception expected.");
        } catch (final NullPointerException ignore) {
        }

        // Non-existent file
        __CLR4_4_198o98okylve1fh.R.inc(13471);try {
            __CLR4_4_198o98okylve1fh.R.inc(13472);FileUtils.sizeOf(file);
            __CLR4_4_198o98okylve1fh.R.inc(13473);fail("Exception expected.");
        } catch (final IllegalArgumentException ignore) {
        }

        // Creates file
        __CLR4_4_198o98okylve1fh.R.inc(13474);file.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(13475);file.deleteOnExit();

        // New file
        __CLR4_4_198o98okylve1fh.R.inc(13476);assertEquals(0, FileUtils.sizeOf(file));
        __CLR4_4_198o98okylve1fh.R.inc(13477);file.delete();

        // Existing file
        __CLR4_4_198o98okylve1fh.R.inc(13478);assertEquals(testFile1Size, FileUtils.sizeOf(testFile1), "Unexpected files size");

        // Existing directory
        __CLR4_4_198o98okylve1fh.R.inc(13479);assertEquals(TEST_DIRECTORY_SIZE, FileUtils.sizeOf(temporaryFolder), "Unexpected directory size");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testSizeOfAsBigInteger() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b907whaeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testSizeOfAsBigInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b907whaeg() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13480);
        __CLR4_4_198o98okylve1fh.R.inc(13481);final File file = new File(temporaryFolder, getName());

        // Null argument
        __CLR4_4_198o98okylve1fh.R.inc(13482);try {
            __CLR4_4_198o98okylve1fh.R.inc(13483);FileUtils.sizeOfAsBigInteger(null);
            __CLR4_4_198o98okylve1fh.R.inc(13484);fail("Exception expected.");
        } catch (final NullPointerException ignore) {
        }

        // Non-existent file
        __CLR4_4_198o98okylve1fh.R.inc(13485);try {
            __CLR4_4_198o98okylve1fh.R.inc(13486);FileUtils.sizeOfAsBigInteger(file);
            __CLR4_4_198o98okylve1fh.R.inc(13487);fail("Exception expected.");
        } catch (final IllegalArgumentException ignore) {
        }

        // Creates file
        __CLR4_4_198o98okylve1fh.R.inc(13488);file.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(13489);file.deleteOnExit();

        // New file
        __CLR4_4_198o98okylve1fh.R.inc(13490);assertEquals(BigInteger.ZERO, FileUtils.sizeOfAsBigInteger(file));
        __CLR4_4_198o98okylve1fh.R.inc(13491);file.delete();

        // Existing file
        __CLR4_4_198o98okylve1fh.R.inc(13492);assertEquals(BigInteger.valueOf(testFile1Size), FileUtils.sizeOfAsBigInteger(testFile1),
                "Unexpected files size");

        // Existing directory
        __CLR4_4_198o98okylve1fh.R.inc(13493);assertEquals(TEST_DIRECTORY_SIZE_BI, FileUtils.sizeOfAsBigInteger(temporaryFolder),
                "Unexpected directory size");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}


    @Test
    public void testSizeOfDirectory() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1prs0ayaeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testSizeOfDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1prs0ayaeu() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13494);
        __CLR4_4_198o98okylve1fh.R.inc(13495);final File file = new File(temporaryFolder, getName());

        // Non-existent file
        __CLR4_4_198o98okylve1fh.R.inc(13496);try {
            __CLR4_4_198o98okylve1fh.R.inc(13497);FileUtils.sizeOfDirectory(file);
            __CLR4_4_198o98okylve1fh.R.inc(13498);fail("Exception expected.");
        } catch (final IllegalArgumentException ignore) {
        }

        // Creates file
        __CLR4_4_198o98okylve1fh.R.inc(13499);file.createNewFile();

        // Existing file
        __CLR4_4_198o98okylve1fh.R.inc(13500);try {
            __CLR4_4_198o98okylve1fh.R.inc(13501);FileUtils.sizeOfDirectory(file);
            __CLR4_4_198o98okylve1fh.R.inc(13502);fail("Exception expected.");
        } catch (final IllegalArgumentException ignore) {
        }

        // Existing directory
        __CLR4_4_198o98okylve1fh.R.inc(13503);file.delete();
        __CLR4_4_198o98okylve1fh.R.inc(13504);file.mkdir();

        // Create a cyclic symlink
        __CLR4_4_198o98okylve1fh.R.inc(13505);this.createCircularSymLink(file);

        __CLR4_4_198o98okylve1fh.R.inc(13506);assertEquals(TEST_DIRECTORY_SIZE, FileUtils.sizeOfDirectory(file), "Unexpected directory size");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testSizeOfDirectoryAsBigInteger() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141tasmaf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testSizeOfDirectoryAsBigInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141tasmaf7() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13507);
        __CLR4_4_198o98okylve1fh.R.inc(13508);final File file = new File(temporaryFolder, getName());

        // Non-existent file
        __CLR4_4_198o98okylve1fh.R.inc(13509);try {
            __CLR4_4_198o98okylve1fh.R.inc(13510);FileUtils.sizeOfDirectoryAsBigInteger(file);
            __CLR4_4_198o98okylve1fh.R.inc(13511);fail("Exception expected.");
        } catch (final IllegalArgumentException ignore) {
        }

        // Creates file
        __CLR4_4_198o98okylve1fh.R.inc(13512);file.createNewFile();
        __CLR4_4_198o98okylve1fh.R.inc(13513);file.deleteOnExit();

        // Existing file
        __CLR4_4_198o98okylve1fh.R.inc(13514);try {
            __CLR4_4_198o98okylve1fh.R.inc(13515);FileUtils.sizeOfDirectoryAsBigInteger(file);
            __CLR4_4_198o98okylve1fh.R.inc(13516);fail("Exception expected.");
        } catch (final IllegalArgumentException ignore) {
        }

        // Existing directory
        __CLR4_4_198o98okylve1fh.R.inc(13517);file.delete();
        __CLR4_4_198o98okylve1fh.R.inc(13518);file.mkdir();

        __CLR4_4_198o98okylve1fh.R.inc(13519);this.createCircularSymLink(file);

        __CLR4_4_198o98okylve1fh.R.inc(13520);assertEquals(TEST_DIRECTORY_SIZE_BI, FileUtils.sizeOfDirectoryAsBigInteger(file), "Unexpected directory size");

        // Existing directory which size is greater than zero
        __CLR4_4_198o98okylve1fh.R.inc(13521);file.delete();
        __CLR4_4_198o98okylve1fh.R.inc(13522);file.mkdir();

        __CLR4_4_198o98okylve1fh.R.inc(13523);final File nonEmptyFile = new File(file, "nonEmptyFile" + System.nanoTime());
        __CLR4_4_198o98okylve1fh.R.inc(13524);if ((((!nonEmptyFile.getParentFile().exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13525)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13526)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13527);throw new IOException("Cannot create file " + nonEmptyFile
                    + " as the parent directory does not exist");
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13528);final OutputStream output =
                new BufferedOutputStream(Files.newOutputStream(nonEmptyFile.toPath()));
        __CLR4_4_198o98okylve1fh.R.inc(13529);try {
            __CLR4_4_198o98okylve1fh.R.inc(13530);TestUtils.generateTestData(output, TEST_DIRECTORY_SIZE_GT_ZERO_BI.longValue());
        } finally {
            __CLR4_4_198o98okylve1fh.R.inc(13531);IOUtils.closeQuietly(output);
        }
        __CLR4_4_198o98okylve1fh.R.inc(13532);nonEmptyFile.deleteOnExit();

        __CLR4_4_198o98okylve1fh.R.inc(13533);assertEquals(TEST_DIRECTORY_SIZE_GT_ZERO_BI, FileUtils.sizeOfDirectoryAsBigInteger(file),
                "Unexpected directory size");

        __CLR4_4_198o98okylve1fh.R.inc(13534);nonEmptyFile.delete();
        __CLR4_4_198o98okylve1fh.R.inc(13535);file.delete();
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFile1() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bdjjlag0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFile1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bdjjlag0() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13536);
        __CLR4_4_198o98okylve1fh.R.inc(13537);final URL url = new URL("file", null, "a/b/c/file.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13538);final File file = FileUtils.toFile(url);
        __CLR4_4_198o98okylve1fh.R.inc(13539);assertTrue(file.toString().contains("file.txt"));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFile2() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122dkr4ag4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFile2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122dkr4ag4() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13540);
        __CLR4_4_198o98okylve1fh.R.inc(13541);final URL url = new URL("file", null, "a/b/c/file%20n%61me%2520.tx%74");
        __CLR4_4_198o98okylve1fh.R.inc(13542);final File file = FileUtils.toFile(url);
        __CLR4_4_198o98okylve1fh.R.inc(13543);assertTrue(file.toString().contains("file name%20.txt"));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFile3() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116me1dag8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFile3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116me1dag8() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13544);
        __CLR4_4_198o98okylve1fh.R.inc(13545);assertNull(FileUtils.toFile(null));
        __CLR4_4_198o98okylve1fh.R.inc(13546);assertNull(FileUtils.toFile(new URL("http://jakarta.apache.org")));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFile4() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fmctuagb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFile4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fmctuagb() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13547);
        __CLR4_4_198o98okylve1fh.R.inc(13548);final URL url = new URL("file", null, "a/b/c/file%%20%me.txt%");
        __CLR4_4_198o98okylve1fh.R.inc(13549);final File file = FileUtils.toFile(url);
        __CLR4_4_198o98okylve1fh.R.inc(13550);assertTrue(file.toString().contains("file% %me.txt%"));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    /* IO-252 */
    @Test
    public void testToFile5() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ombmbagf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFile5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ombmbagf() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13551);
        __CLR4_4_198o98okylve1fh.R.inc(13552);final URL url = new URL("file", null, "both%20are%20100%20%25%20true");
        __CLR4_4_198o98okylve1fh.R.inc(13553);final File file = FileUtils.toFile(url);
        __CLR4_4_198o98okylve1fh.R.inc(13554);assertEquals("both are 100 % true", file.toString());
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFiles1() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1anhbleagj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFiles1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1anhbleagj() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13555);
        __CLR4_4_198o98okylve1fh.R.inc(13556);final URL[] urls = {
                new URL("file", null, "file1.txt"),
                new URL("file", null, "file2.txt"),
        };
        __CLR4_4_198o98okylve1fh.R.inc(13557);final File[] files = FileUtils.toFiles(urls);

        __CLR4_4_198o98okylve1fh.R.inc(13558);assertEquals(urls.length, files.length);
        __CLR4_4_198o98okylve1fh.R.inc(13559);assertTrue(files[0].toString().contains("file1.txt"), "File: " + files[0]);
        __CLR4_4_198o98okylve1fh.R.inc(13560);assertTrue(files[1].toString().contains("file2.txt"), "File: " + files[1]);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFiles2() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ehcsxagp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFiles2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ehcsxagp() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13561);
        __CLR4_4_198o98okylve1fh.R.inc(13562);final URL[] urls = {
                new URL("file", null, "file1.txt"),
                null,
        };
        __CLR4_4_198o98okylve1fh.R.inc(13563);final File[] files = FileUtils.toFiles(urls);

        __CLR4_4_198o98okylve1fh.R.inc(13564);assertEquals(urls.length, files.length);
        __CLR4_4_198o98okylve1fh.R.inc(13565);assertTrue(files[0].toString().contains("file1.txt"), "File: " + files[0]);
        __CLR4_4_198o98okylve1fh.R.inc(13566);assertNull(files[1], "File: " + files[1]);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFiles3() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_145he0gagv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFiles3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_145he0gagv() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13567);
        __CLR4_4_198o98okylve1fh.R.inc(13568);final URL[] urls = null;
        __CLR4_4_198o98okylve1fh.R.inc(13569);final File[] files = FileUtils.toFiles(urls);

        __CLR4_4_198o98okylve1fh.R.inc(13570);assertEquals(0, files.length);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFiles3a() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147ogkhagz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFiles3a",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147ogkhagz() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13571);
        __CLR4_4_198o98okylve1fh.R.inc(13572);final URL[] urls = {}; // empty array
        __CLR4_4_198o98okylve1fh.R.inc(13573);final File[] files = FileUtils.toFiles(urls);

        __CLR4_4_198o98okylve1fh.R.inc(13574);assertEquals(0, files.length);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFiles4() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whf7zah3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFiles4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whf7zah3() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13575);
        __CLR4_4_198o98okylve1fh.R.inc(13576);final URL[] urls = {
                new URL("file", null, "file1.txt"),
                new URL("http", "jakarta.apache.org", "file1.txt"),
        };
        __CLR4_4_198o98okylve1fh.R.inc(13577);try {
            __CLR4_4_198o98okylve1fh.R.inc(13578);FileUtils.toFiles(urls);
            __CLR4_4_198o98okylve1fh.R.inc(13579);fail();
        } catch (final IllegalArgumentException ignore) {
        }
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToFileUtf8() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19127z5ah8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToFileUtf8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19127z5ah8() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13580);
        __CLR4_4_198o98okylve1fh.R.inc(13581);final URL url = new URL("file", null, "/home/%C3%A4%C3%B6%C3%BC%C3%9F");
        __CLR4_4_198o98okylve1fh.R.inc(13582);final File file = FileUtils.toFile(url);
        __CLR4_4_198o98okylve1fh.R.inc(13583);assertTrue(file.toString().contains("\u00e4\u00f6\u00fc\u00df"));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testTouch() throws IOException {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0te9gahc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testTouch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0te9gahc() throws IOException{try{__CLR4_4_198o98okylve1fh.R.inc(13584);
        __CLR4_4_198o98okylve1fh.R.inc(13585);final File file = new File(temporaryFolder, "touch.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13586);if ((((file.exists())&&(__CLR4_4_198o98okylve1fh.R.iget(13587)!=0|true))||(__CLR4_4_198o98okylve1fh.R.iget(13588)==0&false))) {{
            __CLR4_4_198o98okylve1fh.R.inc(13589);file.delete();
        }
        }__CLR4_4_198o98okylve1fh.R.inc(13590);assertFalse(file.exists(), "Bad test: test file still exists");
        __CLR4_4_198o98okylve1fh.R.inc(13591);FileUtils.touch(file);
        __CLR4_4_198o98okylve1fh.R.inc(13592);assertTrue(file.exists(), "FileUtils.touch() created file");
        __CLR4_4_198o98okylve1fh.R.inc(13593);final OutputStream out = Files.newOutputStream(file.toPath());
        __CLR4_4_198o98okylve1fh.R.inc(13594);assertEquals(0, file.length(), "Created empty file.");
        __CLR4_4_198o98okylve1fh.R.inc(13595);out.write(0);
        __CLR4_4_198o98okylve1fh.R.inc(13596);out.close();
        __CLR4_4_198o98okylve1fh.R.inc(13597);assertEquals(1, file.length(), "Wrote one byte to file");
        __CLR4_4_198o98okylve1fh.R.inc(13598);final long y2k = new GregorianCalendar(2000, 0, 1).getTime().getTime();
        __CLR4_4_198o98okylve1fh.R.inc(13599);final boolean res = setLastModifiedMillis(file, y2k);  // 0L fails on Win98
        __CLR4_4_198o98okylve1fh.R.inc(13600);assertTrue(res, "Bad test: set lastModified failed");
        __CLR4_4_198o98okylve1fh.R.inc(13601);assertEquals(y2k, getLastModifiedMillis(file), "Bad test: set lastModified set incorrect value");
        __CLR4_4_198o98okylve1fh.R.inc(13602);final long nowMillis = System.currentTimeMillis();
        __CLR4_4_198o98okylve1fh.R.inc(13603);FileUtils.touch(file);
        __CLR4_4_198o98okylve1fh.R.inc(13604);assertEquals(1, file.length(), "FileUtils.touch() didn't empty the file.");
        __CLR4_4_198o98okylve1fh.R.inc(13605);assertNotEquals(y2k, getLastModifiedMillis(file), "FileUtils.touch() changed lastModified");
        __CLR4_4_198o98okylve1fh.R.inc(13606);final int delta = 3000;
        __CLR4_4_198o98okylve1fh.R.inc(13607);assertTrue(getLastModifiedMillis(file) >= nowMillis - delta, "FileUtils.touch() changed lastModified to more than now-3s");
        __CLR4_4_198o98okylve1fh.R.inc(13608);assertTrue(getLastModifiedMillis(file) <= nowMillis + delta, "FileUtils.touch() changed lastModified to less than now+3s");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToURLs1() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14cnuzdai1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToURLs1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14cnuzdai1() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13609);
        __CLR4_4_198o98okylve1fh.R.inc(13610);final File[] files = {
                new File(temporaryFolder, "file1.txt"),
                new File(temporaryFolder, "file2.txt"),
                new File(temporaryFolder, "test file.txt"),
        };
        __CLR4_4_198o98okylve1fh.R.inc(13611);final URL[] urls = FileUtils.toURLs(files);

        __CLR4_4_198o98okylve1fh.R.inc(13612);assertEquals(files.length, urls.length);
        __CLR4_4_198o98okylve1fh.R.inc(13613);assertTrue(urls[0].toExternalForm().startsWith("file:"));
        __CLR4_4_198o98okylve1fh.R.inc(13614);assertTrue(urls[0].toExternalForm().contains("file1.txt"));
        __CLR4_4_198o98okylve1fh.R.inc(13615);assertTrue(urls[1].toExternalForm().startsWith("file:"));
        __CLR4_4_198o98okylve1fh.R.inc(13616);assertTrue(urls[1].toExternalForm().contains("file2.txt"));

        // Test escaped char
        __CLR4_4_198o98okylve1fh.R.inc(13617);assertTrue(urls[2].toExternalForm().startsWith("file:"));
        __CLR4_4_198o98okylve1fh.R.inc(13618);assertTrue(urls[2].toExternalForm().contains("test%20file.txt"));
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testToURLs3a() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lznbiyaib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testToURLs3a",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lznbiyaib() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13619);
        __CLR4_4_198o98okylve1fh.R.inc(13620);final File[] files = {}; // empty array
        __CLR4_4_198o98okylve1fh.R.inc(13621);final URL[] urls = FileUtils.toURLs(files);

        __CLR4_4_198o98okylve1fh.R.inc(13622);assertEquals(0, urls.length);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWrite_WithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9ti7maif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWrite_WithAppendOptionFalse_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9ti7maif() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13623);
        __CLR4_4_198o98okylve1fh.R.inc(13624);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13625);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13626);FileUtils.write(file, "this is brand new data", false);

        __CLR4_4_198o98okylve1fh.R.inc(13627);final String expected = "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13628);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13629);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWrite_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8mvpuaim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWrite_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8mvpuaim() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13630);
        __CLR4_4_198o98okylve1fh.R.inc(13631);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13632);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13633);FileUtils.write(file, "this is brand new data", true);

        __CLR4_4_198o98okylve1fh.R.inc(13634);final String expected = "This line was there before you..."
                + "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13635);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13636);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteByteArrayToFile() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c22ouait();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteByteArrayToFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c22ouait() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13637);
        __CLR4_4_198o98okylve1fh.R.inc(13638);final File file = new File(temporaryFolder, "write.obj");
        __CLR4_4_198o98okylve1fh.R.inc(13639);final byte[] data = {11, 21, 31};
        __CLR4_4_198o98okylve1fh.R.inc(13640);FileUtils.writeByteArrayToFile(file, data);
        __CLR4_4_198o98okylve1fh.R.inc(13641);TestUtils.assertEqualContent(data, file);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteByteArrayToFile_WithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qxufk0aiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteByteArrayToFile_WithAppendOptionFalse_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qxufk0aiy() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13642);
        __CLR4_4_198o98okylve1fh.R.inc(13643);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13644);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13645);FileUtils.writeByteArrayToFile(file, "this is brand new data".getBytes(), false);

        __CLR4_4_198o98okylve1fh.R.inc(13646);final String expected = "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13647);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13648);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteByteArrayToFile_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ng5bc0aj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteByteArrayToFile_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ng5bc0aj5() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13649);
        __CLR4_4_198o98okylve1fh.R.inc(13650);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13651);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13652);FileUtils.writeByteArrayToFile(file, "this is brand new data".getBytes(), true);

        __CLR4_4_198o98okylve1fh.R.inc(13653);final String expected = "This line was there before you..."
                + "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13654);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13655);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteByteArrayToFile_WithOffsetAndLength() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17822yhajc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteByteArrayToFile_WithOffsetAndLength",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17822yhajc() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13656);
        __CLR4_4_198o98okylve1fh.R.inc(13657);final File file = new File(temporaryFolder, "write.obj");
        __CLR4_4_198o98okylve1fh.R.inc(13658);final byte[] data = {11, 21, 32, 41, 51};
        __CLR4_4_198o98okylve1fh.R.inc(13659);final byte[] writtenData = new byte[3];
        __CLR4_4_198o98okylve1fh.R.inc(13660);System.arraycopy(data, 1, writtenData, 0, 3);
        __CLR4_4_198o98okylve1fh.R.inc(13661);FileUtils.writeByteArrayToFile(file, data, 1, 3);
        __CLR4_4_198o98okylve1fh.R.inc(13662);TestUtils.assertEqualContent(writtenData, file);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteByteArrayToFile_WithOffsetAndLength_WithAppendOptionTrue_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hlp57cajj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteByteArrayToFile_WithOffsetAndLength_WithAppendOptionTrue_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hlp57cajj() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13663);
        __CLR4_4_198o98okylve1fh.R.inc(13664);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13665);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13666);final byte[] data = "SKIP_THIS_this is brand new data_AND_SKIP_THIS".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_198o98okylve1fh.R.inc(13667);FileUtils.writeByteArrayToFile(file, data, 10, 22, false);

        __CLR4_4_198o98okylve1fh.R.inc(13668);final String expected = "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13669);final String actual = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        __CLR4_4_198o98okylve1fh.R.inc(13670);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteByteArrayToFile_WithOffsetAndLength_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1782m2tajr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteByteArrayToFile_WithOffsetAndLength_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1782m2tajr() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13671);
        __CLR4_4_198o98okylve1fh.R.inc(13672);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13673);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13674);final byte[] data = "SKIP_THIS_this is brand new data_AND_SKIP_THIS".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_198o98okylve1fh.R.inc(13675);FileUtils.writeByteArrayToFile(file, data, 10, 22, true);

        __CLR4_4_198o98okylve1fh.R.inc(13676);final String expected = "This line was there before you..." + "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13677);final String actual = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        __CLR4_4_198o98okylve1fh.R.inc(13678);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteCharSequence1() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avn6jwajz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteCharSequence1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avn6jwajz() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13679);
        __CLR4_4_198o98okylve1fh.R.inc(13680);final File file = new File(temporaryFolder, "write.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13681);FileUtils.write(file, "Hello /u1234", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(13682);final byte[] text = "Hello /u1234".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_198o98okylve1fh.R.inc(13683);TestUtils.assertEqualContent(text, file);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteCharSequence2() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mn7rfak4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteCharSequence2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mn7rfak4() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13684);
        __CLR4_4_198o98okylve1fh.R.inc(13685);final File file = new File(temporaryFolder, "write.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13686);FileUtils.write(file, "Hello /u1234", (String) null);
        __CLR4_4_198o98okylve1fh.R.inc(13687);final byte[] text = "Hello /u1234".getBytes();
        __CLR4_4_198o98okylve1fh.R.inc(13688);TestUtils.assertEqualContent(text, file);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLines_3arg_nullSeparator() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8zeqeak9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_3arg_nullSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8zeqeak9() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13689);
        __CLR4_4_198o98okylve1fh.R.inc(13690);final Object[] data = {
                "hello", new StringBuffer("world"), "", "this is", null, "some text"};
        __CLR4_4_198o98okylve1fh.R.inc(13691);final List<Object> list = Arrays.asList(data);

        __CLR4_4_198o98okylve1fh.R.inc(13692);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13693);FileUtils.writeLines(file, "US-ASCII", list);

        __CLR4_4_198o98okylve1fh.R.inc(13694);final String expected = "hello" + System.lineSeparator() + "world" + System.lineSeparator() +
                System.lineSeparator() + "this is" + System.lineSeparator() +
                System.lineSeparator() + "some text" + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13695);final String actual = FileUtils.readFileToString(file, "US-ASCII");
        __CLR4_4_198o98okylve1fh.R.inc(13696);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLines_3argsWithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmjh7lakh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_3argsWithAppendOptionFalse_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmjh7lakh() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13697);
        __CLR4_4_198o98okylve1fh.R.inc(13698);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13699);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13700);final List<String> linesToAppend = Arrays.asList("my first line", "The second Line");
        __CLR4_4_198o98okylve1fh.R.inc(13701);FileUtils.writeLines(file, linesToAppend, false);

        __CLR4_4_198o98okylve1fh.R.inc(13702);final String expected = "my first line"
                + System.lineSeparator() + "The second Line"
                + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13703);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13704);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLines_3argsWithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ty0535akp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_3argsWithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ty0535akp() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13705);
        __CLR4_4_198o98okylve1fh.R.inc(13706);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13707);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13708);final List<String> linesToAppend = Arrays.asList("my first line", "The second Line");
        __CLR4_4_198o98okylve1fh.R.inc(13709);FileUtils.writeLines(file, linesToAppend, true);

        __CLR4_4_198o98okylve1fh.R.inc(13710);final String expected = "This line was there before you..."
                + "my first line"
                + System.lineSeparator() + "The second Line"
                + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13711);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13712);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLines_4arg() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lih8d2akx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_4arg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lih8d2akx() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13713);
        __CLR4_4_198o98okylve1fh.R.inc(13714);final Object[] data = {
                "hello", new StringBuffer("world"), "", "this is", null, "some text"};
        __CLR4_4_198o98okylve1fh.R.inc(13715);final List<Object> list = Arrays.asList(data);

        __CLR4_4_198o98okylve1fh.R.inc(13716);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13717);FileUtils.writeLines(file, "US-ASCII", list, "*");

        __CLR4_4_198o98okylve1fh.R.inc(13718);final String expected = "hello*world**this is**some text*";
        __CLR4_4_198o98okylve1fh.R.inc(13719);final String actual = FileUtils.readFileToString(file, "US-ASCII");
        __CLR4_4_198o98okylve1fh.R.inc(13720);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLines_4arg_nullSeparator() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jcgolxal5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_4arg_nullSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jcgolxal5() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13721);
        __CLR4_4_198o98okylve1fh.R.inc(13722);final Object[] data = {
                "hello", new StringBuffer("world"), "", "this is", null, "some text"};
        __CLR4_4_198o98okylve1fh.R.inc(13723);final List<Object> list = Arrays.asList(data);

        __CLR4_4_198o98okylve1fh.R.inc(13724);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13725);FileUtils.writeLines(file, "US-ASCII", list, null);

        __CLR4_4_198o98okylve1fh.R.inc(13726);final String expected = "hello" + System.lineSeparator() + "world" + System.lineSeparator() +
                System.lineSeparator() + "this is" + System.lineSeparator() +
                System.lineSeparator() + "some text" + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13727);final String actual = FileUtils.readFileToString(file, "US-ASCII");
        __CLR4_4_198o98okylve1fh.R.inc(13728);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLines_4arg_Writer_nullData() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3e0z0ald();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_4arg_Writer_nullData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3e0z0ald() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13729);
        __CLR4_4_198o98okylve1fh.R.inc(13730);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13731);FileUtils.writeLines(file, "US-ASCII", null, "*");

        __CLR4_4_198o98okylve1fh.R.inc(13732);assertEquals(0, file.length(), "Sizes differ");
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLines_4argsWithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151xskgalh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_4argsWithAppendOptionFalse_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151xskgalh() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13733);
        __CLR4_4_198o98okylve1fh.R.inc(13734);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13735);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13736);final List<String> linesToAppend = Arrays.asList("my first line", "The second Line");
        __CLR4_4_198o98okylve1fh.R.inc(13737);FileUtils.writeLines(file, linesToAppend, null, false);

        __CLR4_4_198o98okylve1fh.R.inc(13738);final String expected = "my first line"
                + System.lineSeparator() + "The second Line"
                + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13739);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13740);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}


    @Test
    public void testWriteLines_4argsWithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v12ps0alp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_4argsWithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v12ps0alp() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13741);
        __CLR4_4_198o98okylve1fh.R.inc(13742);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13743);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13744);final List<String> linesToAppend = Arrays.asList("my first line", "The second Line");
        __CLR4_4_198o98okylve1fh.R.inc(13745);FileUtils.writeLines(file, linesToAppend, null, true);

        __CLR4_4_198o98okylve1fh.R.inc(13746);final String expected = "This line was there before you..."
                + "my first line"
                + System.lineSeparator() + "The second Line"
                + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13747);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13748);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLines_5argsWithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ginw2palx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_5argsWithAppendOptionFalse_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ginw2palx() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13749);
        __CLR4_4_198o98okylve1fh.R.inc(13750);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13751);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13752);final List<String> linesToAppend = Arrays.asList("my first line", "The second Line");
        __CLR4_4_198o98okylve1fh.R.inc(13753);FileUtils.writeLines(file, null, linesToAppend, null, false);

        __CLR4_4_198o98okylve1fh.R.inc(13754);final String expected = "my first line"
                + System.lineSeparator() + "The second Line"
                + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13755);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13756);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLines_5argsWithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kz1io1am5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLines_5argsWithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kz1io1am5() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13757);
        __CLR4_4_198o98okylve1fh.R.inc(13758);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13759);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13760);final List<String> linesToAppend = Arrays.asList("my first line", "The second Line");
        __CLR4_4_198o98okylve1fh.R.inc(13761);FileUtils.writeLines(file, null, linesToAppend, null, true);

        __CLR4_4_198o98okylve1fh.R.inc(13762);final String expected = "This line was there before you..."
                + "my first line"
                + System.lineSeparator() + "The second Line"
                + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13763);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13764);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLinesEncoding_WithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gr93iiamd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLinesEncoding_WithAppendOptionFalse_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gr93iiamd() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13765);
        __CLR4_4_198o98okylve1fh.R.inc(13766);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13767);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13768);final List<String> linesToAppend = Arrays.asList("my first line", "The second Line");
        __CLR4_4_198o98okylve1fh.R.inc(13769);FileUtils.writeLines(file, null, linesToAppend, false);

        __CLR4_4_198o98okylve1fh.R.inc(13770);final String expected = "my first line"
                + System.lineSeparator() + "The second Line"
                + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13771);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13772);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteLinesEncoding_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17646s6aml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteLinesEncoding_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17646s6aml() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13773);
        __CLR4_4_198o98okylve1fh.R.inc(13774);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13775);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13776);final List<String> linesToAppend = Arrays.asList("my first line", "The second Line");
        __CLR4_4_198o98okylve1fh.R.inc(13777);FileUtils.writeLines(file, null, linesToAppend, true);

        __CLR4_4_198o98okylve1fh.R.inc(13778);final String expected = "This line was there before you..."
                + "my first line"
                + System.lineSeparator() + "The second Line"
                + System.lineSeparator();
        __CLR4_4_198o98okylve1fh.R.inc(13779);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13780);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteStringToFile_WithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11pd2p2amt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteStringToFile_WithAppendOptionFalse_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11pd2p2amt() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13781);
        __CLR4_4_198o98okylve1fh.R.inc(13782);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13783);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13784);FileUtils.writeStringToFile(file, "this is brand new data", false);

        __CLR4_4_198o98okylve1fh.R.inc(13785);final String expected = "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13786);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13787);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteStringToFile_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1905rcqan0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteStringToFile_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1905rcqan0() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13788);
        __CLR4_4_198o98okylve1fh.R.inc(13789);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13790);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13791);FileUtils.writeStringToFile(file, "this is brand new data", true);

        __CLR4_4_198o98okylve1fh.R.inc(13792);final String expected = "This line was there before you..."
                + "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13793);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13794);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteStringToFile1() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyxa4dan7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteStringToFile1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyxa4dan7() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13795);
        __CLR4_4_198o98okylve1fh.R.inc(13796);final File file = new File(temporaryFolder, "write.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13797);FileUtils.writeStringToFile(file, "Hello /u1234", "UTF8");
        __CLR4_4_198o98okylve1fh.R.inc(13798);final byte[] text = "Hello /u1234".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_198o98okylve1fh.R.inc(13799);TestUtils.assertEqualContent(text, file);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteStringToFile2() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fpxbbwanc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteStringToFile2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fpxbbwanc() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13800);
        __CLR4_4_198o98okylve1fh.R.inc(13801);final File file = new File(temporaryFolder, "write.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13802);FileUtils.writeStringToFile(file, "Hello /u1234", (String) null);
        __CLR4_4_198o98okylve1fh.R.inc(13803);final byte[] text = "Hello /u1234".getBytes();
        __CLR4_4_198o98okylve1fh.R.inc(13804);TestUtils.assertEqualContent(text, file);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteStringToFile3() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgxcjfanh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteStringToFile3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgxcjfanh() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13805);
        __CLR4_4_198o98okylve1fh.R.inc(13806);final File file = new File(temporaryFolder, "write.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13807);FileUtils.writeStringToFile(file, "Hello /u1234", (Charset) null);
        __CLR4_4_198o98okylve1fh.R.inc(13808);final byte[] text = "Hello /u1234".getBytes();
        __CLR4_4_198o98okylve1fh.R.inc(13809);TestUtils.assertEqualContent(text, file);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteStringToFileWithEncoding_WithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1imabanm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteStringToFileWithEncoding_WithAppendOptionFalse_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1imabanm() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13810);
        __CLR4_4_198o98okylve1fh.R.inc(13811);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13812);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13813);FileUtils.writeStringToFile(file, "this is brand new data", (String) null, false);

        __CLR4_4_198o98okylve1fh.R.inc(13814);final String expected = "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13815);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13816);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteStringToFileWithEncoding_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jeawjant();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteStringToFileWithEncoding_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jeawjant() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13817);
        __CLR4_4_198o98okylve1fh.R.inc(13818);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13819);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13820);FileUtils.writeStringToFile(file, "this is brand new data", (String) null, true);

        __CLR4_4_198o98okylve1fh.R.inc(13821);final String expected = "This line was there before you..."
                + "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13822);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13823);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteWithEncoding_WithAppendOptionFalse_ShouldDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1go706jao0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteWithEncoding_WithAppendOptionFalse_ShouldDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1go706jao0() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13824);
        __CLR4_4_198o98okylve1fh.R.inc(13825);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13826);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13827);FileUtils.write(file, "this is brand new data", (String) null, false);

        __CLR4_4_198o98okylve1fh.R.inc(13828);final String expected = "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13829);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13830);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

    @Test
    public void testWriteWithEncoding_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines() throws Exception {__CLR4_4_198o98okylve1fh.R.globalSliceStart(getClass().getName(),13831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrv3edao7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_198o98okylve1fh.R.rethrow($CLV_t2$);}finally{__CLR4_4_198o98okylve1fh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsTestCase.testWriteWithEncoding_WithAppendOptionTrue_ShouldNotDeletePreviousFileLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrv3edao7() throws Exception{try{__CLR4_4_198o98okylve1fh.R.inc(13831);
        __CLR4_4_198o98okylve1fh.R.inc(13832);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_198o98okylve1fh.R.inc(13833);FileUtils.writeStringToFile(file, "This line was there before you...");

        __CLR4_4_198o98okylve1fh.R.inc(13834);FileUtils.write(file, "this is brand new data", (String) null, true);

        __CLR4_4_198o98okylve1fh.R.inc(13835);final String expected = "This line was there before you..."
                + "this is brand new data";
        __CLR4_4_198o98okylve1fh.R.inc(13836);final String actual = FileUtils.readFileToString(file);
        __CLR4_4_198o98okylve1fh.R.inc(13837);assertEquals(expected, actual);
    }finally{__CLR4_4_198o98okylve1fh.R.flushNeeded();}}

}
