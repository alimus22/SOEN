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
package org.apache.commons.io.filefilter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.test.TestUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Used to test FileFilterUtils.
 */
public class FileFilterTestCase {static class __CLR4_4_1e6le6lkylve2hi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,19614,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The subversion directory name.
     */
    static final String SVN_DIR_NAME = ".svn";

    private static final boolean WINDOWS = File.separatorChar == '\\';

    @TempDir
    public File temporaryFolder;

    void assertFiltering(final IOFileFilter filter, final File file, final boolean expected) {try{__CLR4_4_1e6le6lkylve2hi.R.inc(18381);
        // Note. This only tests the (File, String) version if the parent of
        // the File passed in is not null
        __CLR4_4_1e6le6lkylve2hi.R.inc(18382);assertEquals(expected, filter.accept(file),
            "Filter(File) " + filter.getClass().getName() + " not " + expected + " for " + file);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18383);if ((((file != null && file.getParentFile() != null)&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18384)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18385)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18386);assertEquals(expected, filter.accept(file.getParentFile(), file.getName()),
                "Filter(File, String) " + filter.getClass().getName() + " not " + expected + " for " + file);
        } }else {__CLR4_4_1e6le6lkylve2hi.R.inc(18387);if ((((file == null)&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18388)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18389)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18390);assertEquals(expected, filter.accept(file),
                "Filter(File, String) " + filter.getClass().getName() + " not " + expected + " for null");
        }
        }}__CLR4_4_1e6le6lkylve2hi.R.inc(18391);assertNotNull(filter.toString());
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    void assertFiltering(final IOFileFilter filter, final Path path, final boolean expected) {try{__CLR4_4_1e6le6lkylve2hi.R.inc(18392);
        // Note. This only tests the (Path, Path) version if the parent of
        // the File passed in is not null
        __CLR4_4_1e6le6lkylve2hi.R.inc(18393);final FileVisitResult expectedFileVisitResult = AbstractFileFilter.toFileVisitResult(expected, path);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18394);assertEquals(expectedFileVisitResult, filter.accept(path, null),
            "Filter(Path) " + filter.getClass().getName() + " not " + expectedFileVisitResult + " for " + path);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18395);if ((((path != null && path.getParent() != null)&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18396)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18397)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18398);assertEquals(expectedFileVisitResult, filter.accept(path, null),
                "Filter(Path, Path) " + filter.getClass().getName() + " not " + expectedFileVisitResult + " for "
                    + path);
        } }else {__CLR4_4_1e6le6lkylve2hi.R.inc(18399);if ((((path == null)&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18400)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18401)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18402);assertEquals(expectedFileVisitResult, filter.accept(path, null),
                "Filter(Path, Path) " + filter.getClass().getName() + " not " + expectedFileVisitResult + " for null");
        }
        }}__CLR4_4_1e6le6lkylve2hi.R.inc(18403);assertNotNull(filter.toString());
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    private void assertFooBarFileFiltering(IOFileFilter filter) {try{__CLR4_4_1e6le6lkylve2hi.R.inc(18404);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18405);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18406);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18407);assertFiltering(filter, new File("bar"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18408);assertFiltering(filter, new File("fred"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18409);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18410);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18411);assertFiltering(filter, new File("bar").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18412);assertFiltering(filter, new File("fred").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18413);filter = new NameFileFilter(new String[] {"foo", "bar"}, IOCase.SENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18414);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18415);assertFiltering(filter, new File("bar"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18416);assertFiltering(filter, new File("FOO"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18417);assertFiltering(filter, new File("BAR"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18418);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18419);assertFiltering(filter, new File("bar").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18420);assertFiltering(filter, new File("FOO").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18421);assertFiltering(filter, new File("BAR").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18422);filter = new NameFileFilter(new String[] {"foo", "bar"}, IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18423);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18424);assertFiltering(filter, new File("bar"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18425);assertFiltering(filter, new File("FOO"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18426);assertFiltering(filter, new File("BAR"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18427);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18428);assertFiltering(filter, new File("bar").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18429);assertFiltering(filter, new File("FOO").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18430);assertFiltering(filter, new File("BAR").toPath(), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18431);filter = new NameFileFilter(new String[] {"foo", "bar"}, IOCase.SYSTEM);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18432);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18433);assertFiltering(filter, new File("bar"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18434);assertFiltering(filter, new File("FOO"), WINDOWS);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18435);assertFiltering(filter, new File("BAR"), WINDOWS);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18436);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18437);assertFiltering(filter, new File("bar").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18438);assertFiltering(filter, new File("FOO").toPath(), WINDOWS);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18439);assertFiltering(filter, new File("BAR").toPath(), WINDOWS);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18440);filter = new NameFileFilter(new String[] {"foo", "bar"}, null);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18441);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18442);assertFiltering(filter, new File("bar"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18443);assertFiltering(filter, new File("FOO"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18444);assertFiltering(filter, new File("BAR"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18445);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18446);assertFiltering(filter, new File("bar").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18447);assertFiltering(filter, new File("FOO").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18448);assertFiltering(filter, new File("BAR").toPath(), false);

        // repeat for a List
        __CLR4_4_1e6le6lkylve2hi.R.inc(18449);final java.util.ArrayList<String> list = new java.util.ArrayList<>();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18450);list.add("foo");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18451);list.add("bar");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18452);filter = new NameFileFilter(list);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18453);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18454);assertFiltering(filter, new File("bar"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18455);assertFiltering(filter, new File("fred"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18456);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18457);assertFiltering(filter, new File("bar").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18458);assertFiltering(filter, new File("fred").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18459);filter = new NameFileFilter("foo");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18460);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18461);assertFiltering(filter, new File("FOO"), false); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(18462);assertFiltering(filter, new File("barfoo"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18463);assertFiltering(filter, new File("foobar"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18464);assertFiltering(filter, new File("fred"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18465);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18466);assertFiltering(filter, new File("FOO").toPath(), false); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(18467);assertFiltering(filter, new File("barfoo").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18468);assertFiltering(filter, new File("foobar").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18469);assertFiltering(filter, new File("fred").toPath(), false);

        // FileFilterUtils.nameFileFilter(String, IOCase) tests
        __CLR4_4_1e6le6lkylve2hi.R.inc(18470);filter = FileFilterUtils.nameFileFilter("foo", IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18471);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18472);assertFiltering(filter, new File("FOO"), true); // case-insensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(18473);assertFiltering(filter, new File("barfoo"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18474);assertFiltering(filter, new File("foobar"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18475);assertFiltering(filter, new File("fred"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18476);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18477);assertFiltering(filter, new File("FOO").toPath(), true); // case-insensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(18478);assertFiltering(filter, new File("barfoo").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18479);assertFiltering(filter, new File("foobar").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18480);assertFiltering(filter, new File("fred").toPath(), false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    private boolean equalsLastModified(final File left, final File right) throws IOException {try{__CLR4_4_1e6le6lkylve2hi.R.inc(18481);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18482);return Files.getLastModifiedTime(left.toPath()).equals(Files.getLastModifiedTime(right.toPath()));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testAgeFilter() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1datvg4e9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testAgeFilter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1datvg4e9f() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18483);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18484);final File oldFile = new File(temporaryFolder, "old.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18485);final Path oldPath = oldFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18486);final File reference = new File(temporaryFolder, "reference.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18487);final File newFile = new File(temporaryFolder, "new.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18488);final Path newPath = newFile.toPath();

        __CLR4_4_1e6le6lkylve2hi.R.inc(18489);if ((((!oldFile.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18490)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18491)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18492);fail("Cannot create file " + oldFile + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18493);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18494);}};final BufferedOutputStream output1 = new BufferedOutputStream(Files.newOutputStream(oldFile.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18495);TestUtils.generateTestData(output1, 0);
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18496);do {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18497);try {
                __CLR4_4_1e6le6lkylve2hi.R.inc(18498);TestUtils.sleep(1000);
            } catch (final InterruptedException ie) {
                // ignore
            }
            __CLR4_4_1e6le6lkylve2hi.R.inc(18499);if ((((!reference.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18500)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18501)==0&false))) {{
                __CLR4_4_1e6le6lkylve2hi.R.inc(18502);fail("Cannot create file " + reference + " as the parent directory does not exist");
            }
            }class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18503);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18504);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(reference.toPath()))) {
                __CLR4_4_1e6le6lkylve2hi.R.inc(18505);TestUtils.generateTestData(output, 0);
            }
        } }while ((((equalsLastModified(oldFile, reference))&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18506)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18507)==0&false)));

        __CLR4_4_1e6le6lkylve2hi.R.inc(18508);final Date date = new Date();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18509);final long now = date.getTime();

        __CLR4_4_1e6le6lkylve2hi.R.inc(18510);do {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18511);try {
                __CLR4_4_1e6le6lkylve2hi.R.inc(18512);TestUtils.sleep(1000);
            } catch (final InterruptedException ie) {
                // ignore
            }
            __CLR4_4_1e6le6lkylve2hi.R.inc(18513);if ((((!newFile.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18514)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18515)==0&false))) {{
                __CLR4_4_1e6le6lkylve2hi.R.inc(18516);fail("Cannot create file " + newFile + " as the parent directory does not exist");
            }
            }class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18517);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18518);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(newFile.toPath()))) {
                __CLR4_4_1e6le6lkylve2hi.R.inc(18519);TestUtils.generateTestData(output, 0);
            }
        } }while ((((equalsLastModified(reference, newFile))&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18520)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18521)==0&false)));

        __CLR4_4_1e6le6lkylve2hi.R.inc(18522);final IOFileFilter filter1 = FileFilterUtils.ageFileFilter(now);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18523);final IOFileFilter filter2 = FileFilterUtils.ageFileFilter(now, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18524);final IOFileFilter filter3 = FileFilterUtils.ageFileFilter(now, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18525);final IOFileFilter filter4 = FileFilterUtils.ageFileFilter(date);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18526);final IOFileFilter filter5 = FileFilterUtils.ageFileFilter(date, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18527);final IOFileFilter filter6 = FileFilterUtils.ageFileFilter(date, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18528);final IOFileFilter filter7 = FileFilterUtils.ageFileFilter(reference);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18529);final IOFileFilter filter8 = FileFilterUtils.ageFileFilter(reference, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18530);final IOFileFilter filter9 = FileFilterUtils.ageFileFilter(reference, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18531);assertFiltering(filter1, oldFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18532);assertFiltering(filter2, oldFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18533);assertFiltering(filter3, oldFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18534);assertFiltering(filter4, oldFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18535);assertFiltering(filter5, oldFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18536);assertFiltering(filter6, oldFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18537);assertFiltering(filter7, oldFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18538);assertFiltering(filter8, oldFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18539);assertFiltering(filter9, oldFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18540);assertFiltering(filter1, newFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18541);assertFiltering(filter2, newFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18542);assertFiltering(filter3, newFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18543);assertFiltering(filter4, newFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18544);assertFiltering(filter5, newFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18545);assertFiltering(filter6, newFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18546);assertFiltering(filter7, newFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18547);assertFiltering(filter8, newFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18548);assertFiltering(filter9, newFile, true);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(18549);assertFiltering(filter1, oldPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18550);assertFiltering(filter2, oldPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18551);assertFiltering(filter3, oldPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18552);assertFiltering(filter4, oldPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18553);assertFiltering(filter5, oldPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18554);assertFiltering(filter6, oldPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18555);assertFiltering(filter7, oldPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18556);assertFiltering(filter8, oldPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18557);assertFiltering(filter9, oldPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18558);assertFiltering(filter1, newPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18559);assertFiltering(filter2, newPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18560);assertFiltering(filter3, newPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18561);assertFiltering(filter4, newPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18562);assertFiltering(filter5, newPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18563);assertFiltering(filter6, newPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18564);assertFiltering(filter7, newPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18565);assertFiltering(filter8, newPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18566);assertFiltering(filter9, newPath, true);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testAnd() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q520dwebr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testAnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q520dwebr(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18567);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18568);final IOFileFilter trueFilter = TrueFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18569);final IOFileFilter falseFilter = FalseFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18570);assertFiltering(trueFilter.and(trueFilter), new File("foo.test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18571);assertFiltering(trueFilter.and(falseFilter), new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18572);assertFiltering(falseFilter.and(trueFilter), new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18573);assertFiltering(falseFilter.and(trueFilter), new File("foo.test"), false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testAnd2() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dryidweby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testAnd2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dryidweby(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18574);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18575);final IOFileFilter trueFilter = TrueFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18576);final IOFileFilter falseFilter = FalseFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18577);assertFiltering(new AndFileFilter(trueFilter, trueFilter), new File("foo.test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18578);assertFiltering(new AndFileFilter(trueFilter, falseFilter), new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18579);assertFiltering(new AndFileFilter(falseFilter, trueFilter), new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18580);assertFiltering(new AndFileFilter(falseFilter, falseFilter), new File("foo.test"), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18581);final List<IOFileFilter> filters = new ArrayList<>();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18582);assertFiltering(new AndFileFilter(filters), new File("test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18583);assertFiltering(new AndFileFilter(), new File("test"), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18584);assertThrows(NullPointerException.class, () -> new AndFileFilter(falseFilter, (IOFileFilter) null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18585);assertThrows(NullPointerException.class, () -> new AndFileFilter(null, falseFilter));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18586);assertThrows(NullPointerException.class, () -> new AndFileFilter((List<IOFileFilter>) null));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testAndArray() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iluf5necb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testAndArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iluf5necb(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18587);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18588);final IOFileFilter trueFilter = TrueFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18589);final IOFileFilter falseFilter = FalseFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18590);assertFiltering(new AndFileFilter(trueFilter, trueFilter, trueFilter), new File("foo.test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18591);assertFiltering(new AndFileFilter(trueFilter, falseFilter, falseFilter), new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18592);assertFiltering(new AndFileFilter(falseFilter, trueFilter, trueFilter), new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18593);assertFiltering(new AndFileFilter(falseFilter, falseFilter, falseFilter), new File("foo.test"), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18594);final List<IOFileFilter> filters = new ArrayList<>();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18595);assertFiltering(new AndFileFilter(filters), new File("test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18596);assertFiltering(new AndFileFilter(), new File("test"), false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testCanExecute() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1muceecl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testCanExecute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1muceecl() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18597);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18598);assumeTrue(SystemUtils.IS_OS_WINDOWS);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18599);final File executableFile = File.createTempFile(getClass().getSimpleName(), ".temp");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18600);final Path executablePath = executableFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18601);try {
            class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18602);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18603);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(executableFile.toPath()))) {
                __CLR4_4_1e6le6lkylve2hi.R.inc(18604);TestUtils.generateTestData(output, 32);
            }
            __CLR4_4_1e6le6lkylve2hi.R.inc(18605);assertTrue(executableFile.setExecutable(true));
            __CLR4_4_1e6le6lkylve2hi.R.inc(18606);assertFiltering(CanExecuteFileFilter.CAN_EXECUTE, executableFile, true);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18607);assertFiltering(CanExecuteFileFilter.CAN_EXECUTE, executablePath, true);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18608);executableFile.setExecutable(false);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18609);assertFiltering(CanExecuteFileFilter.CANNOT_EXECUTE, executableFile, false);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18610);assertFiltering(CanExecuteFileFilter.CANNOT_EXECUTE, executablePath, false);
        } finally {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18611);executableFile.delete();
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testCanRead() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cd23l1ed0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testCanRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cd23l1ed0() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18612);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18613);final File readOnlyFile = new File(temporaryFolder, "read-only-file1.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18614);final Path readOnlyPath = readOnlyFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18615);if ((((!readOnlyFile.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18616)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18617)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18618);fail("Cannot create file " + readOnlyFile + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18619);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18620);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(readOnlyFile.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18621);TestUtils.generateTestData(output, 32);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(18622);assertTrue(readOnlyFile.setReadOnly());
        __CLR4_4_1e6le6lkylve2hi.R.inc(18623);assertFiltering(CanReadFileFilter.CAN_READ, readOnlyFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18624);assertFiltering(CanReadFileFilter.CAN_READ, readOnlyPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18625);assertFiltering(CanReadFileFilter.CANNOT_READ, readOnlyFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18626);assertFiltering(CanReadFileFilter.CANNOT_READ, readOnlyPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18627);assertFiltering(CanReadFileFilter.READ_ONLY, readOnlyFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18628);assertFiltering(CanReadFileFilter.READ_ONLY, readOnlyPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18629);readOnlyFile.delete();
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testCanWrite() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xftv48edi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testCanWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xftv48edi() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18630);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18631);final File readOnlyFile = new File(temporaryFolder, "read-only-file2.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18632);final Path readOnlyPath = readOnlyFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18633);if ((((!readOnlyFile.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18634)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18635)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18636);fail("Cannot create file " + readOnlyFile + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18637);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18638);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(readOnlyFile.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18639);TestUtils.generateTestData(output, 32);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(18640);assertTrue(readOnlyFile.setReadOnly());
        __CLR4_4_1e6le6lkylve2hi.R.inc(18641);assertFiltering(CanWriteFileFilter.CAN_WRITE, temporaryFolder, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18642);assertFiltering(CanWriteFileFilter.CANNOT_WRITE, temporaryFolder, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18643);assertFiltering(CanWriteFileFilter.CAN_WRITE, readOnlyFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18644);assertFiltering(CanWriteFileFilter.CAN_WRITE, readOnlyPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18645);assertFiltering(CanWriteFileFilter.CANNOT_WRITE, readOnlyFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18646);assertFiltering(CanWriteFileFilter.CANNOT_WRITE, readOnlyPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18647);readOnlyFile.delete();
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testDelegateFileFilter() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11oftdaee0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testDelegateFileFilter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11oftdaee0(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18648);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18649);final OrFileFilter orFilter = new OrFileFilter();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18650);final File testFile = new File("test.txt");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18651);IOFileFilter filter = new DelegateFileFilter((FileFilter) orFilter);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18652);assertFiltering(filter, testFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18653);assertNotNull(filter.toString()); // TODO better test

        __CLR4_4_1e6le6lkylve2hi.R.inc(18654);filter = new DelegateFileFilter((FilenameFilter) orFilter);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18655);assertFiltering(filter, testFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18656);assertNotNull(filter.toString()); // TODO better test

        __CLR4_4_1e6le6lkylve2hi.R.inc(18657);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18658);new DelegateFileFilter((FileFilter) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18659);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18660);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18661);new DelegateFileFilter((FilenameFilter) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18662);fail();
        } catch (final IllegalArgumentException ignore) {
        }

    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testDelegation() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqw0gxeef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testDelegation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqw0gxeef(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18663); // TODO improve these tests
        __CLR4_4_1e6le6lkylve2hi.R.inc(18664);assertNotNull(FileFilterUtils.asFileFilter((FileFilter) FalseFileFilter.INSTANCE));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18665);assertNotNull(FileFilterUtils.asFileFilter((FilenameFilter) FalseFileFilter.INSTANCE).toString());
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedWildcard() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19y14myeei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testDeprecatedWildcard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19y14myeei(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18666);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18667);IOFileFilter filter = new WildcardFilter("*.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18668);final List<String> patternList = Arrays.asList("*.txt", "*.xml", "*.gif");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18669);final IOFileFilter listFilter = new WildcardFilter(patternList);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18670);final File txtFile = new File("test.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18671);final Path txtPath = txtFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18672);final File bmpFile = new File("test.bmp");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18673);final Path bmpPath = bmpFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18674);final File dirFile = new File("src/java");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18675);final Path dirPath = dirFile.toPath();

        __CLR4_4_1e6le6lkylve2hi.R.inc(18676);assertFiltering(filter, new File("log.txt"), true);
//        assertFiltering(filter, new File("log.txt.bak"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18677);assertFiltering(filter, new File("log.txt").toPath(), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18678);filter = new WildcardFilter("log?.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18679);assertFiltering(filter, new File("log1.txt"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18680);assertFiltering(filter, new File("log12.txt"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(18681);assertFiltering(filter, new File("log1.txt").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18682);assertFiltering(filter, new File("log12.txt").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18683);filter = new WildcardFilter("open??.????04");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18684);assertFiltering(filter, new File("openAB.102504"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18685);assertFiltering(filter, new File("openA.102504"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18686);assertFiltering(filter, new File("openXY.123103"), false);
//        assertFiltering(filter, new File("openAB.102504.old"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(18687);assertFiltering(filter, new File("openAB.102504").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18688);assertFiltering(filter, new File("openA.102504").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18689);assertFiltering(filter, new File("openXY.123103").toPath(), false);
//        assertFiltering(filter, new File("openAB.102504.old").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18690);filter = new WildcardFilter("*.java", "*.class");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18691);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18692);assertFiltering(filter, new File("Test.class"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18693);assertFiltering(filter, new File("Test.jsp"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(18694);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18695);assertFiltering(filter, new File("Test.class").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18696);assertFiltering(filter, new File("Test.jsp").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18697);assertFiltering(listFilter, new File("Test.txt"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18698);assertFiltering(listFilter, new File("Test.xml"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18699);assertFiltering(listFilter, new File("Test.gif"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18700);assertFiltering(listFilter, new File("Test.bmp"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(18701);assertFiltering(listFilter, new File("Test.txt").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18702);assertFiltering(listFilter, new File("Test.xml").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18703);assertFiltering(listFilter, new File("Test.gif").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18704);assertFiltering(listFilter, new File("Test.bmp").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18705);assertTrue(listFilter.accept(txtFile));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18706);assertFalse(listFilter.accept(bmpFile));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18707);assertFalse(listFilter.accept(dirFile));
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(18708);assertEquals(FileVisitResult.CONTINUE, listFilter.accept(txtPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18709);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(bmpPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18710);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(dirPath, null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(18711);assertTrue(listFilter.accept(txtFile.getParentFile(), txtFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18712);assertFalse(listFilter.accept(bmpFile.getParentFile(), bmpFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18713);assertFalse(listFilter.accept(dirFile.getParentFile(), dirFile.getName()));
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(18714);assertEquals(FileVisitResult.CONTINUE, listFilter.accept(txtPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18715);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(bmpPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18716);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(dirPath, null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(18717);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18718);new WildcardFilter((String) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18719);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18720);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18721);new WildcardFilter((String[]) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18722);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18723);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18724);new WildcardFilter((List<String>) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18725);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testDirectory() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kt5srmeg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testDirectory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kt5srmeg6(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18726);
        // XXX: This test presumes the current working dir is the base dir of the source checkout.
        __CLR4_4_1e6le6lkylve2hi.R.inc(18727);final IOFileFilter filter = new DirectoryFileFilter();

        __CLR4_4_1e6le6lkylve2hi.R.inc(18728);assertFiltering(filter, new File("src/"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18729);assertFiltering(filter, new File("src/").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18730);assertFiltering(filter, new File("src/main/java/"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18731);assertFiltering(filter, new File("src/main/java/").toPath(), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18732);assertFiltering(filter, new File("pom.xml"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18733);assertFiltering(filter, new File("pom.xml").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18734);assertFiltering(filter, new File("imaginary"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18735);assertFiltering(filter, new File("imaginary").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18736);assertFiltering(filter, new File("imaginary/"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18737);assertFiltering(filter, new File("imaginary/").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18738);assertFiltering(filter, new File("LICENSE.txt"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18739);assertFiltering(filter, new File("LICENSE.txt").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18740);assertSame(DirectoryFileFilter.DIRECTORY, DirectoryFileFilter.INSTANCE);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testEmpty() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6g5z2egl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6g5z2egl() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18741);

        // Empty Dir
        __CLR4_4_1e6le6lkylve2hi.R.inc(18742);final File emptyDirFile = new File(temporaryFolder, "empty-dir");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18743);final Path emptyDirPath = emptyDirFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18744);emptyDirFile.mkdirs();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18745);assertFiltering(EmptyFileFilter.EMPTY, emptyDirFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18746);assertFiltering(EmptyFileFilter.EMPTY, emptyDirPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18747);assertFiltering(EmptyFileFilter.NOT_EMPTY, emptyDirFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18748);assertFiltering(EmptyFileFilter.NOT_EMPTY, emptyDirPath, false);

        // Empty File
        __CLR4_4_1e6le6lkylve2hi.R.inc(18749);final File emptyFile = new File(emptyDirFile, "empty-file.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18750);final Path emptyPath = emptyFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18751);if ((((!emptyFile.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18752)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18753)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18754);fail("Cannot create file " + emptyFile + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18755);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18756);}};final BufferedOutputStream output1 = new BufferedOutputStream(Files.newOutputStream(emptyFile.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18757);TestUtils.generateTestData(output1, 0);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(18758);assertFiltering(EmptyFileFilter.EMPTY, emptyFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18759);assertFiltering(EmptyFileFilter.EMPTY, emptyPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18760);assertFiltering(EmptyFileFilter.NOT_EMPTY, emptyFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18761);assertFiltering(EmptyFileFilter.NOT_EMPTY, emptyPath, false);

        // Not Empty Dir
        __CLR4_4_1e6le6lkylve2hi.R.inc(18762);assertFiltering(EmptyFileFilter.EMPTY, emptyDirFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18763);assertFiltering(EmptyFileFilter.EMPTY, emptyDirPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18764);assertFiltering(EmptyFileFilter.NOT_EMPTY, emptyDirFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18765);assertFiltering(EmptyFileFilter.NOT_EMPTY, emptyDirPath, true);

        // Not Empty File
        __CLR4_4_1e6le6lkylve2hi.R.inc(18766);final File notEmptyFile = new File(emptyDirFile, "not-empty-file.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18767);final Path notEmptyPath = notEmptyFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18768);if ((((!notEmptyFile.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18769)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18770)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18771);fail("Cannot create file " + notEmptyFile + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18772);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18773);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(notEmptyFile.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18774);TestUtils.generateTestData(output, 32);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(18775);assertFiltering(EmptyFileFilter.EMPTY, notEmptyFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18776);assertFiltering(EmptyFileFilter.EMPTY, notEmptyPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18777);assertFiltering(EmptyFileFilter.NOT_EMPTY, notEmptyFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18778);assertFiltering(EmptyFileFilter.NOT_EMPTY, notEmptyPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18779);FileUtils.forceDelete(emptyDirFile);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testEnsureTestCoverage() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fdqnleho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testEnsureTestCoverage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fdqnleho(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18780);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18781);assertNotNull(new FileFilterUtils()); // dummy for test coverage
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testFalse() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5vdwoehq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5vdwoehq(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18782);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18783);final IOFileFilter filter = FileFilterUtils.falseFileFilter();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18784);assertFiltering(filter, new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18785);assertFiltering(filter, new File("foo.test").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18786);assertFiltering(filter, new File("foo"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18787);assertFiltering(filter, new File("foo").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18788);assertFiltering(filter, (File) null, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18789);assertFiltering(filter, (Path) null, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18790);assertSame(FalseFileFilter.FALSE, FalseFileFilter.INSTANCE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18791);assertSame(TrueFileFilter.TRUE, FalseFileFilter.INSTANCE.negate());
        __CLR4_4_1e6le6lkylve2hi.R.inc(18792);assertSame(TrueFileFilter.INSTANCE, FalseFileFilter.INSTANCE.negate());
        __CLR4_4_1e6le6lkylve2hi.R.inc(18793);assertNotNull(FalseFileFilter.INSTANCE.toString());
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testFileEqualsFilter() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndhwc4ei2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFileEqualsFilter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndhwc4ei2(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18794);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18795);assertFooBarFileFiltering(
            new FileEqualsFileFilter(new File("foo")).or(new FileEqualsFileFilter(new File("bar"))));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testFileFilterUtils_and() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnc1vaei4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFileFilterUtils_and",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnc1vaei4(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18796);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18797);final IOFileFilter trueFilter = TrueFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18798);final IOFileFilter falseFilter = FalseFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18799);assertFiltering(FileFilterUtils.and(trueFilter, trueFilter, trueFilter), new File("foo.test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18800);assertFiltering(FileFilterUtils.and(trueFilter, falseFilter, trueFilter), new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18801);assertFiltering(FileFilterUtils.and(falseFilter, trueFilter), new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18802);assertFiltering(FileFilterUtils.and(falseFilter, falseFilter), new File("foo.test"), false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testFileFilterUtils_or() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9peymeib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFileFilterUtils_or",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9peymeib(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18803);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18804);final IOFileFilter trueFilter = TrueFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18805);final IOFileFilter falseFilter = FalseFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(18806);final File testFile = new File("foo.test");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18807);assertFiltering(FileFilterUtils.or(trueFilter, trueFilter), testFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18808);assertFiltering(FileFilterUtils.or(trueFilter, trueFilter, falseFilter), testFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18809);assertFiltering(FileFilterUtils.or(falseFilter, trueFilter), testFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18810);assertFiltering(FileFilterUtils.or(falseFilter, falseFilter, falseFilter), testFile, false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testFiles() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qv2voeij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qv2voeij(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18811);
        // XXX: This test presumes the current working dir is the base dir of the source checkout.
        __CLR4_4_1e6le6lkylve2hi.R.inc(18812);final IOFileFilter filter = FileFileFilter.INSTANCE;

        __CLR4_4_1e6le6lkylve2hi.R.inc(18813);assertFiltering(filter, new File("src/"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18814);assertFiltering(filter, new File("src/").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18815);assertFiltering(filter, new File("src/java/"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18816);assertFiltering(filter, new File("src/java/").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18817);assertFiltering(filter, new File("pom.xml"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18818);assertFiltering(filter, new File("pom.xml").toPath(), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18819);assertFiltering(filter, new File("imaginary"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18820);assertFiltering(filter, new File("imaginary").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18821);assertFiltering(filter, new File("imaginary/"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18822);assertFiltering(filter, new File("imaginary/").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18823);assertFiltering(filter, new File("LICENSE.txt"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18824);assertFiltering(filter, new File("LICENSE.txt").toPath(), true);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filter(IOFileFilter, java.lang.Iterable)} that tests that the method
     * properly filters files from the list.
     */
    @Test
    public void testFilterArray_fromList() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iehiapeix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterArray_fromList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iehiapeix() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18825);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18826);final File fileA = TestUtils.newFile(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18827);final File fileB = TestUtils.newFile(temporaryFolder, "B");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18828);final List<File> fileList = Arrays.asList(fileA, fileB);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18829);final IOFileFilter filter = FileFilterUtils.nameFileFilter("A");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18830);final File[] filtered = FileFilterUtils.filter(filter, fileList);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18831);assertEquals(1, filtered.length);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18832);assertEquals(fileA, filtered[0]);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filter(IOFileFilter, File...)} that tests that the method properly filters
     * files from the list.
     */
    @Test
    public void testFilterArray_IOFileFilter() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14v8381ej5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterArray_IOFileFilter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14v8381ej5() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18833);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18834);final File fileA = TestUtils.newFile(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18835);final File fileB = TestUtils.newFile(temporaryFolder, "B");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18836);final IOFileFilter filter = FileFilterUtils.nameFileFilter("A");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18837);final File[] filtered = FileFilterUtils.filter(filter, fileA, fileB);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18838);assertEquals(1, filtered.length);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18839);assertEquals(fileA, filtered[0]);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filter(IOFileFilter, File...)} that tests that the method properly filters
     * files from the list.
     */
    @Test
    public void testFilterArray_PathVisitorFileFilter_FileExistsNo() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0zroyejc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterArray_PathVisitorFileFilter_FileExistsNo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0zroyejc() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18840);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18841);final File fileA = TestUtils.newFile(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18842);final File fileB = TestUtils.newFile(temporaryFolder, "B");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18843);final IOFileFilter filter = new PathVisitorFileFilter(new NameFileFilter("A"));

        __CLR4_4_1e6le6lkylve2hi.R.inc(18844);final File[] filtered = FileFilterUtils.filter(filter, fileA, fileB);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18845);assertEquals(1, filtered.length);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18846);assertEquals(fileA, filtered[0]);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filter(IOFileFilter, File...)} that tests that the method properly filters
     * files from the list.
     */
    @Test
    public void testFilterArray_PathVisitorFileFilter_FileExistsYes() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_167ci2kejj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterArray_PathVisitorFileFilter_FileExistsYes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_167ci2kejj() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18847);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18848);final File fileA = TestUtils.newFile(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18849);final File fileB = TestUtils.newFile(temporaryFolder, "B");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18850);FileUtils.write(fileA, "test", StandardCharsets.US_ASCII);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18851);final IOFileFilter filter = new PathVisitorFileFilter(new NameFileFilter("A"));

        __CLR4_4_1e6le6lkylve2hi.R.inc(18852);final File[] filtered = FileFilterUtils.filter(filter, fileA, fileB);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18853);assertEquals(1, filtered.length);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18854);assertEquals(fileA, filtered[0]);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filter(IOFileFilter, File...)} that tests {@code null} parameters.
     */
    @Test
    public void testFilterFilesArrayNullParameters() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ko9b0cejr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterFilesArrayNullParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ko9b0cejr() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18855);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18856);final File fileA = TestUtils.newFile(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18857);final File fileB = TestUtils.newFile(temporaryFolder, "B");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18858);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18859);FileFilterUtils.filter(null, fileA, fileB);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18860);fail();
        } catch (final IllegalArgumentException iae) {
            // Test passes, exception thrown for null filter
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18861);final IOFileFilter filter = FileFilterUtils.trueFileFilter();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18862);FileFilterUtils.filter(filter, fileA, null);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18863);final File[] filtered = FileFilterUtils.filter(filter, (File[]) null);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18864);assertEquals(0, filtered.length);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filterList(IOFileFilter, java.lang.Iterable)} that tests that the method
     * properly filters files from the list.
     */
    @Test
    public void testFilterList() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eevzjjek1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eevzjjek1() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18865);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18866);final File fileA = TestUtils.newFile(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18867);final File fileB = TestUtils.newFile(temporaryFolder, "B");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18868);final List<File> fileList = Arrays.asList(fileA, fileB);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18869);final IOFileFilter filter = FileFilterUtils.nameFileFilter("A");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18870);final List<File> filteredList = FileFilterUtils.filterList(filter, fileList);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18871);assertTrue(filteredList.contains(fileA));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18872);assertFalse(filteredList.contains(fileB));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filterList(IOFileFilter, File...)} that tests that the method properly
     * filters files from the list.
     */
    @Test
    public void testFilterList_fromArray() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12n1bsxek9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterList_fromArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12n1bsxek9() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18873);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18874);final File fileA = TestUtils.newFile(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18875);final File fileB = TestUtils.newFile(temporaryFolder, "B");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18876);final IOFileFilter filter = FileFilterUtils.nameFileFilter("A");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18877);final List<File> filteredList = FileFilterUtils.filterList(filter, fileA, fileB);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18878);assertTrue(filteredList.contains(fileA));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18879);assertFalse(filteredList.contains(fileB));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filterList(IOFileFilter, java.lang.Iterable)} that tests {@code null}
     * parameters and {@code null} elements in the provided list.
     */
    @Test
    public void testFilterListNullParameters() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wd3udcekg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterListNullParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wd3udcekg(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18880);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18881);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18882);FileFilterUtils.filterList(null, Collections.<File>emptyList());
            __CLR4_4_1e6le6lkylve2hi.R.inc(18883);fail();
        } catch (final IllegalArgumentException iae) {
            // Test passes, exception thrown for null filter
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18884);final IOFileFilter filter = FileFilterUtils.trueFileFilter();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18885);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18886);FileFilterUtils.filterList(filter, Collections.singletonList((File) null));
        } catch (final IllegalArgumentException iae) {
            // Test passes, exception thrown for list containing null
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18887);final List<File> filteredList = FileFilterUtils.filterList(filter, (List<File>) null);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18888);assertEquals(0, filteredList.size());
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filter(IOFileFilter, Path...)}.
     */
    @Test
    public void testFilterPathsArrayNullParameters() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rjlx59ekp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterPathsArrayNullParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rjlx59ekp() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18889);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18890);final Path fileA = TestUtils.newFile(temporaryFolder, "A").toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18891);final Path fileB = TestUtils.newFile(temporaryFolder, "B").toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18892);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18893);PathUtils.filter(null, fileA, fileB);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18894);fail();
        } catch (final NullPointerException iae) {
            // Test passes, exception thrown for null filter
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18895);final IOFileFilter filter = FileFilterUtils.trueFileFilter();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18896);PathUtils.filter(filter, fileA, null);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18897);final File[] filtered = FileFilterUtils.filter(filter, (File[]) null);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18898);assertEquals(0, filtered.length);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filterSet(IOFileFilter, java.lang.Iterable)} that tests that the method
     * properly filters files from the set.
     */
    @Test
    public void testFilterSet() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13nrvrzekz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13nrvrzekz() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18899);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18900);final File fileA = TestUtils.newFile(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18901);final File fileB = TestUtils.newFile(temporaryFolder, "B");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18902);final Set<File> fileList = new HashSet<>(Arrays.asList(fileA, fileB));

        __CLR4_4_1e6le6lkylve2hi.R.inc(18903);final IOFileFilter filter = FileFilterUtils.nameFileFilter("A");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18904);final Set<File> filteredSet = FileFilterUtils.filterSet(filter, fileList);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18905);assertTrue(filteredSet.contains(fileA));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18906);assertFalse(filteredSet.contains(fileB));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filterSet(IOFileFilter, File...)} that tests that the method properly
     * filters files from the set.
     */
    @Test
    public void testFilterSet_fromArray() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfsg7lel7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterSet_fromArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfsg7lel7() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18907);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18908);final File fileA = TestUtils.newFile(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18909);final File fileB = TestUtils.newFile(temporaryFolder, "B");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18910);final IOFileFilter filter = FileFilterUtils.nameFileFilter("A");

        __CLR4_4_1e6le6lkylve2hi.R.inc(18911);final Set<File> filteredSet = FileFilterUtils.filterSet(filter, fileA, fileB);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18912);assertTrue(filteredSet.contains(fileA));
        __CLR4_4_1e6le6lkylve2hi.R.inc(18913);assertFalse(filteredSet.contains(fileB));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    /*
     * Test method for {@link FileFilterUtils#filterSet(IOFileFilter, java.lang.Iterable)} that tests {@code null}
     * parameters and {@code null} elements in the provided set.
     */
    @Test
    public void testFilterSetNullParameters() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qo9s34ele();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testFilterSetNullParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qo9s34ele(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18914);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18915);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18916);FileFilterUtils.filterSet(null, Collections.<File>emptySet());
            __CLR4_4_1e6le6lkylve2hi.R.inc(18917);fail();
        } catch (final IllegalArgumentException iae) {
            // Test passes, exception thrown for null filter
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18918);final IOFileFilter filter = FileFilterUtils.trueFileFilter();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18919);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18920);FileFilterUtils.filterSet(filter, new HashSet<>(Collections.singletonList((File) null)));
        } catch (final IllegalArgumentException iae) {
            // Test passes, exception thrown for set containing null
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18921);final Set<File> filteredSet = FileFilterUtils.filterSet(filter, (Set<File>) null);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18922);assertEquals(0, filteredSet.size());
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testHidden() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8jtereln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testHidden",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8jtereln(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(18923);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18924);final File hiddenDirFile = new File(SVN_DIR_NAME);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18925);final Path hiddenDirPath = hiddenDirFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18926);if ((((hiddenDirFile.exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18927)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18928)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18929);assertFiltering(HiddenFileFilter.HIDDEN, hiddenDirFile, hiddenDirFile.isHidden());
            __CLR4_4_1e6le6lkylve2hi.R.inc(18930);assertFiltering(HiddenFileFilter.HIDDEN, hiddenDirPath, hiddenDirFile.isHidden());
            __CLR4_4_1e6le6lkylve2hi.R.inc(18931);assertFiltering(HiddenFileFilter.VISIBLE, hiddenDirFile, !hiddenDirFile.isHidden());
            __CLR4_4_1e6le6lkylve2hi.R.inc(18932);assertFiltering(HiddenFileFilter.VISIBLE, hiddenDirPath, !hiddenDirFile.isHidden());
        }
        }__CLR4_4_1e6le6lkylve2hi.R.inc(18933);final Path path = temporaryFolder.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18934);assertFiltering(HiddenFileFilter.HIDDEN, temporaryFolder, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18935);assertFiltering(HiddenFileFilter.HIDDEN, path, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18936);assertFiltering(HiddenFileFilter.VISIBLE, temporaryFolder, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18937);assertFiltering(HiddenFileFilter.VISIBLE, path, true);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testMagicNumberFileFilterBytes() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eopn6iem2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testMagicNumberFileFilterBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eopn6iem2() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18938);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18939);final byte[] classFileMagicNumber = {(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE};
        __CLR4_4_1e6le6lkylve2hi.R.inc(18940);final String xmlFileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\">\n" + "<element>text</element>";

        __CLR4_4_1e6le6lkylve2hi.R.inc(18941);final File classAFile = new File(temporaryFolder, "A.class");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18942);final Path classAPath = classAFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18943);final File xmlBFile = new File(temporaryFolder, "B.xml");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18944);final Path xmlBPath = xmlBFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18945);final File emptyFile = new File(temporaryFolder, "C.xml");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18946);final Path emptyPath = emptyFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18947);final File dirFile = new File(temporaryFolder, "D");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18948);final Path dirPath = dirFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(18949);dirFile.mkdirs();

        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18950);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18951);}};final OutputStream classFileAStream = FileUtils.openOutputStream(classAFile)) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18952);IOUtils.write(classFileMagicNumber, classFileAStream);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18953);TestUtils.generateTestData(classFileAStream, 32);
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18954);FileUtils.write(xmlBFile, xmlFileContent, StandardCharsets.UTF_8);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18955);FileUtils.touch(emptyFile);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18956);IOFileFilter filter = new MagicNumberFileFilter(classFileMagicNumber);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18957);assertFiltering(filter, classAFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18958);assertFiltering(filter, classAPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18959);assertFiltering(filter, xmlBFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18960);assertFiltering(filter, xmlBPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18961);assertFiltering(filter, emptyFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18962);assertFiltering(filter, emptyPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18963);assertFiltering(filter, dirFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18964);assertFiltering(filter, dirPath, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18965);filter = FileFilterUtils.magicNumberFileFilter(classFileMagicNumber);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18966);assertFiltering(filter, classAFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18967);assertFiltering(filter, classAPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18968);assertFiltering(filter, xmlBFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18969);assertFiltering(filter, xmlBPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18970);assertFiltering(filter, emptyFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18971);assertFiltering(filter, emptyPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18972);assertFiltering(filter, dirFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18973);assertFiltering(filter, dirPath, false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testMagicNumberFileFilterBytesOffset() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),18974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1366qp9en2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testMagicNumberFileFilterBytesOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1366qp9en2() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(18974);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18975);final byte[] tarMagicNumber = {0x75, 0x73, 0x74, 0x61, 0x72};
        __CLR4_4_1e6le6lkylve2hi.R.inc(18976);final long tarMagicNumberOffset = 257;

        __CLR4_4_1e6le6lkylve2hi.R.inc(18977);final File tarFileA = new File(temporaryFolder, "A.tar");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18978);final File randomFileB = new File(temporaryFolder, "B.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18979);final File dir = new File(temporaryFolder, "D");
        __CLR4_4_1e6le6lkylve2hi.R.inc(18980);dir.mkdirs();

        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18981);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18982);}};final OutputStream tarFileAStream = FileUtils.openOutputStream(tarFileA)) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18983);TestUtils.generateTestData(tarFileAStream, tarMagicNumberOffset);
            __CLR4_4_1e6le6lkylve2hi.R.inc(18984);IOUtils.write(tarMagicNumber, tarFileAStream);
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18985);if ((((!randomFileB.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(18986)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(18987)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(18988);fail("Cannot create file " + randomFileB + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(18989);try (__CLR4_4_1$AC10 __CLR$ACI10=new __CLR4_4_1$AC10(){{__CLR4_4_1e6le6lkylve2hi.R.inc(18990);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(randomFileB.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(18991);TestUtils.generateTestData(output, 2 * tarMagicNumberOffset);
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(18992);IOFileFilter filter = new MagicNumberFileFilter(tarMagicNumber, tarMagicNumberOffset);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18993);assertFiltering(filter, tarFileA, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18994);assertFiltering(filter, randomFileB, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18995);assertFiltering(filter, dir, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18996);filter = FileFilterUtils.magicNumberFileFilter(tarMagicNumber, tarMagicNumberOffset);

        __CLR4_4_1e6le6lkylve2hi.R.inc(18997);assertFiltering(filter, tarFileA, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18998);assertFiltering(filter, randomFileB, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(18999);assertFiltering(filter, dir, false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    // -----------------------------------------------------------------------

    @Test
    public void testMagicNumberFileFilterString() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x75q8gens();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testMagicNumberFileFilterString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x75q8gens() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(19000);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19001);final byte[] classFileMagicNumber = {(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE};
        __CLR4_4_1e6le6lkylve2hi.R.inc(19002);final String xmlFileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\">\n" + "<element>text</element>";
        __CLR4_4_1e6le6lkylve2hi.R.inc(19003);final String xmlMagicNumber = "<?xml version=\"1.0\"";

        __CLR4_4_1e6le6lkylve2hi.R.inc(19004);final File classFileA = new File(temporaryFolder, "A.class");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19005);final File xmlFileB = new File(temporaryFolder, "B.xml");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19006);final File dir = new File(temporaryFolder, "D");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19007);dir.mkdirs();

        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19008);try (__CLR4_4_1$AC11 __CLR$ACI11=new __CLR4_4_1$AC11(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19009);}};final OutputStream classFileAStream = FileUtils.openOutputStream(classFileA)) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19010);IOUtils.write(classFileMagicNumber, classFileAStream);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19011);TestUtils.generateTestData(classFileAStream, 32);
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19012);FileUtils.write(xmlFileB, xmlFileContent, StandardCharsets.UTF_8);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19013);IOFileFilter filter = new MagicNumberFileFilter(xmlMagicNumber);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19014);assertFiltering(filter, classFileA, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19015);assertFiltering(filter, xmlFileB, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19016);assertFiltering(filter, dir, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19017);filter = FileFilterUtils.magicNumberFileFilter(xmlMagicNumber);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19018);assertFiltering(filter, classFileA, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19019);assertFiltering(filter, xmlFileB, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19020);assertFiltering(filter, dir, false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testMagicNumberFileFilterStringOffset() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adq5xfeod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testMagicNumberFileFilterStringOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adq5xfeod() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(19021);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19022);final String tarMagicNumber = "ustar";
        __CLR4_4_1e6le6lkylve2hi.R.inc(19023);final long tarMagicNumberOffset = 257;

        __CLR4_4_1e6le6lkylve2hi.R.inc(19024);final File tarFileA = new File(temporaryFolder, "A.tar");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19025);final File randomFileB = new File(temporaryFolder, "B.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19026);final File dir = new File(temporaryFolder, "D");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19027);dir.mkdirs();

        class __CLR4_4_1$AC12 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19028);try (__CLR4_4_1$AC12 __CLR$ACI12=new __CLR4_4_1$AC12(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19029);}};final OutputStream tarFileAStream = FileUtils.openOutputStream(tarFileA)) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19030);TestUtils.generateTestData(tarFileAStream, tarMagicNumberOffset);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19031);IOUtils.write(tarMagicNumber, tarFileAStream, StandardCharsets.UTF_8);
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19032);if ((((!randomFileB.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19033)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19034)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19035);fail("Cannot create file " + randomFileB + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC13 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19036);try (__CLR4_4_1$AC13 __CLR$ACI13=new __CLR4_4_1$AC13(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19037);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(randomFileB.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19038);TestUtils.generateTestData(output, 2 * tarMagicNumberOffset);
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19039);IOFileFilter filter = new MagicNumberFileFilter(tarMagicNumber, tarMagicNumberOffset);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19040);assertFiltering(filter, tarFileA, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19041);assertFiltering(filter, randomFileB, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19042);assertFiltering(filter, dir, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19043);filter = FileFilterUtils.magicNumberFileFilter(tarMagicNumber, tarMagicNumberOffset);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19044);assertFiltering(filter, tarFileA, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19045);assertFiltering(filter, randomFileB, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19046);assertFiltering(filter, dir, false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testMagicNumberFileFilterValidation() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18vgdk8ep3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testMagicNumberFileFilterValidation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18vgdk8ep3(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19047);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19048);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19049);new MagicNumberFileFilter((String) null, 0);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19050);fail();
        } catch (final IllegalArgumentException iae) {
            // expected
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19051);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19052);new MagicNumberFileFilter("0", -1);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19053);fail();
        } catch (final IllegalArgumentException iae) {
            // expected
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19054);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19055);new MagicNumberFileFilter("", 0);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19056);fail();
        } catch (final IllegalArgumentException iae) {
            // expected
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19057);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19058);new MagicNumberFileFilter((byte[]) null, 0);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19059);fail();
        } catch (final IllegalArgumentException iae) {
            // expected
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19060);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19061);new MagicNumberFileFilter(new byte[] {0}, -1);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19062);fail();
        } catch (final IllegalArgumentException iae) {
            // expected
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19063);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19064);new MagicNumberFileFilter(new byte[] {}, 0);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19065);fail();
        } catch (final IllegalArgumentException iae) {
            // expected
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testMakeCVSAware() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1na4kbfepm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testMakeCVSAware",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1na4kbfepm() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(19066);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19067);final IOFileFilter filter1 = FileFilterUtils.makeCVSAware(null);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19068);final IOFileFilter filter2 = FileFilterUtils.makeCVSAware(FileFilterUtils.nameFileFilter("test-file1.txt"));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19069);File file = new File(temporaryFolder, "CVS");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19070);file.mkdirs();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19071);assertFiltering(filter1, file, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19072);assertFiltering(filter2, file, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19073);FileUtils.deleteDirectory(file);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19074);file = new File(temporaryFolder, "test-file1.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19075);if ((((!file.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19076)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19077)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19078);fail("Cannot create file " + file + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC14 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19079);try (__CLR4_4_1$AC14 __CLR$ACI14=new __CLR4_4_1$AC14(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19080);}};final BufferedOutputStream output2 = new BufferedOutputStream(Files.newOutputStream(file.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19081);TestUtils.generateTestData(output2, 0);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19082);assertFiltering(filter1, file, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19083);assertFiltering(filter2, file, true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19084);file = new File(temporaryFolder, "test-file2.log");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19085);if ((((!file.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19086)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19087)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19088);fail("Cannot create file " + file + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC15 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19089);try (__CLR4_4_1$AC15 __CLR$ACI15=new __CLR4_4_1$AC15(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19090);}};final BufferedOutputStream output1 = new BufferedOutputStream(Files.newOutputStream(file.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19091);TestUtils.generateTestData(output1, 0);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19092);assertFiltering(filter1, file, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19093);assertFiltering(filter2, file, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19094);file = new File(temporaryFolder, "CVS");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19095);if ((((!file.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19096)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19097)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19098);fail("Cannot create file " + file + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC16 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19099);try (__CLR4_4_1$AC16 __CLR$ACI16=new __CLR4_4_1$AC16(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19100);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(file.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19101);TestUtils.generateTestData(output, 0);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19102);assertFiltering(filter1, file, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19103);assertFiltering(filter2, file, false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testMakeDirectoryOnly() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npidwgeqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testMakeDirectoryOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npidwgeqo() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(19104);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19105);assertSame(DirectoryFileFilter.DIRECTORY, FileFilterUtils.makeDirectoryOnly(null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19106);final IOFileFilter filter = FileFilterUtils.makeDirectoryOnly(FileFilterUtils.nameFileFilter("B"));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19107);final File fileA = new File(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19108);final File fileB = new File(temporaryFolder, "B");

        __CLR4_4_1e6le6lkylve2hi.R.inc(19109);fileA.mkdirs();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19110);fileB.mkdirs();

        __CLR4_4_1e6le6lkylve2hi.R.inc(19111);assertFiltering(filter, fileA, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19112);assertFiltering(filter, fileB, true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19113);FileUtils.deleteDirectory(fileA);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19114);FileUtils.deleteDirectory(fileB);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19115);if ((((!fileA.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19116)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19117)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19118);fail("Cannot create file " + fileA + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC17 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19119);try (__CLR4_4_1$AC17 __CLR$ACI17=new __CLR4_4_1$AC17(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19120);}};final BufferedOutputStream output1 = new BufferedOutputStream(Files.newOutputStream(fileA.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19121);TestUtils.generateTestData(output1, 32);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19122);if ((((!fileB.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19123)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19124)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19125);fail("Cannot create file " + fileB + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC18 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19126);try (__CLR4_4_1$AC18 __CLR$ACI18=new __CLR4_4_1$AC18(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19127);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(fileB.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19128);TestUtils.generateTestData(output, 32);
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19129);assertFiltering(filter, fileA, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19130);assertFiltering(filter, fileB, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19131);fileA.delete();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19132);fileB.delete();
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testMakeFileOnly() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7vn3lerh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testMakeFileOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7vn3lerh() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(19133);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19134);assertSame(FileFileFilter.INSTANCE, FileFilterUtils.makeFileOnly(null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19135);final IOFileFilter filter = FileFilterUtils.makeFileOnly(FileFilterUtils.nameFileFilter("B"));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19136);final File fileA = new File(temporaryFolder, "A");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19137);final File fileB = new File(temporaryFolder, "B");

        __CLR4_4_1e6le6lkylve2hi.R.inc(19138);fileA.mkdirs();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19139);fileB.mkdirs();

        __CLR4_4_1e6le6lkylve2hi.R.inc(19140);assertFiltering(filter, fileA, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19141);assertFiltering(filter, fileB, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19142);FileUtils.deleteDirectory(fileA);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19143);FileUtils.deleteDirectory(fileB);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19144);if ((((!fileA.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19145)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19146)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19147);fail("Cannot create file " + fileA + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC19 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19148);try (__CLR4_4_1$AC19 __CLR$ACI19=new __CLR4_4_1$AC19(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19149);}};final BufferedOutputStream output1 = new BufferedOutputStream(Files.newOutputStream(fileA.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19150);TestUtils.generateTestData(output1, 32);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19151);if ((((!fileB.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19152)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19153)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19154);fail("Cannot create file " + fileB + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC20 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19155);try (__CLR4_4_1$AC20 __CLR$ACI20=new __CLR4_4_1$AC20(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19156);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(fileB.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19157);TestUtils.generateTestData(output, 32);
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19158);assertFiltering(filter, fileA, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19159);assertFiltering(filter, fileB, true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19160);fileA.delete();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19161);fileB.delete();
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testMakeSVNAware() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rei0kaesa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testMakeSVNAware",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rei0kaesa() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(19162);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19163);final IOFileFilter filter1 = FileFilterUtils.makeSVNAware(null);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19164);final IOFileFilter filter2 = FileFilterUtils.makeSVNAware(FileFilterUtils.nameFileFilter("test-file1.txt"));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19165);File file = new File(temporaryFolder, SVN_DIR_NAME);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19166);file.mkdirs();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19167);assertFiltering(filter1, file, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19168);assertFiltering(filter2, file, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19169);FileUtils.deleteDirectory(file);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19170);file = new File(temporaryFolder, "test-file1.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19171);if ((((!file.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19172)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19173)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19174);fail("Cannot create file " + file + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC21 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19175);try (__CLR4_4_1$AC21 __CLR$ACI21=new __CLR4_4_1$AC21(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19176);}};final BufferedOutputStream output2 = new BufferedOutputStream(Files.newOutputStream(file.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19177);TestUtils.generateTestData(output2, 0);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19178);assertFiltering(filter1, file, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19179);assertFiltering(filter2, file, true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19180);file = new File(temporaryFolder, "test-file2.log");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19181);if ((((!file.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19182)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19183)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19184);fail("Cannot create file " + file + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC22 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19185);try (__CLR4_4_1$AC22 __CLR$ACI22=new __CLR4_4_1$AC22(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19186);}};final BufferedOutputStream output1 = new BufferedOutputStream(Files.newOutputStream(file.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19187);TestUtils.generateTestData(output1, 0);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19188);assertFiltering(filter1, file, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19189);assertFiltering(filter2, file, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19190);file = new File(temporaryFolder, SVN_DIR_NAME);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19191);if ((((!file.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19192)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19193)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19194);fail("Cannot create file " + file + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC23 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19195);try (__CLR4_4_1$AC23 __CLR$ACI23=new __CLR4_4_1$AC23(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19196);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(file.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19197);TestUtils.generateTestData(output, 0);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19198);assertFiltering(filter1, file, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19199);assertFiltering(filter2, file, false);
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testNameFilter() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1ok78etc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testNameFilter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1ok78etc(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19200);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19201);assertFooBarFileFiltering(new NameFileFilter("foo", "bar"));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testNameFilterNullArgument() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xpnscgete();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testNameFilterNullArgument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xpnscgete(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19202);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19203);final String test = null;
        __CLR4_4_1e6le6lkylve2hi.R.inc(19204);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19205);new NameFileFilter(test);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19206);fail("constructing a NameFileFilter with a null String argument should fail.");
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19207);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19208);FileFilterUtils.nameFileFilter(test, IOCase.INSENSITIVE);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19209);fail("constructing a NameFileFilter with a null String argument should fail.");
        } catch (final IllegalArgumentException ignore) {
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testNameFilterNullArrayArgument() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1waw869etm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testNameFilterNullArrayArgument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1waw869etm(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19210);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19211);assertThrows(IllegalArgumentException.class, () -> new NameFileFilter((String[]) null));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testNameFilterNullListArgument() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4agqmeto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testNameFilterNullListArgument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4agqmeto(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19212);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19213);final List<String> test = null;
        __CLR4_4_1e6le6lkylve2hi.R.inc(19214);assertThrows(IllegalArgumentException.class, () -> new NameFileFilter(test));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testNegate() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffqfwletr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testNegate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffqfwletr(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19215);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19216);final IOFileFilter filter = FileFilterUtils.notFileFilter(FileFilterUtils.trueFileFilter());
        __CLR4_4_1e6le6lkylve2hi.R.inc(19217);assertFiltering(filter, new File("foo.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19218);assertFiltering(filter, new File("foo"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19219);assertFiltering(filter.negate(), new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19220);assertFiltering(filter, (File) null, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19221);assertThrows(IllegalArgumentException.class, () -> new NotFileFilter(null));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testNullFilters() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1612tu1ety();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testNullFilters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1612tu1ety(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19222);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19223);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19224);FileFilterUtils.toList((IOFileFilter) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19225);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException ignore) {
            // expected
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19226);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19227);FileFilterUtils.toList(new IOFileFilter[] {null});
            __CLR4_4_1e6le6lkylve2hi.R.inc(19228);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException ignore) {
            // expected
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testOr() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fy9weu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testOr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fy9weu5(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19229);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19230);final IOFileFilter trueFilter = TrueFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(19231);final IOFileFilter falseFilter = FalseFileFilter.INSTANCE;
        __CLR4_4_1e6le6lkylve2hi.R.inc(19232);final File testFile = new File("foo.test");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19233);final Path testPath = testFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19234);assertFiltering(new OrFileFilter(trueFilter, trueFilter), testFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19235);assertFiltering(new OrFileFilter(trueFilter, falseFilter), testFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19236);assertFiltering(new OrFileFilter(falseFilter, trueFilter), testFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19237);assertFiltering(new OrFileFilter(falseFilter, falseFilter), testFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19238);assertFiltering(new OrFileFilter(), testFile, false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19239);assertFiltering(new OrFileFilter(trueFilter, trueFilter), testPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19240);assertFiltering(new OrFileFilter(trueFilter, falseFilter), testPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19241);assertFiltering(new OrFileFilter(falseFilter, trueFilter), testPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19242);assertFiltering(new OrFileFilter(falseFilter, falseFilter), testPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19243);assertFiltering(new OrFileFilter(), testPath, false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19244);assertFiltering(falseFilter.or(trueFilter), testPath, true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19245);final List<IOFileFilter> filters = new ArrayList<>();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19246);filters.add(trueFilter);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19247);filters.add(falseFilter);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19248);final OrFileFilter orFilter = new OrFileFilter(filters);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19249);assertFiltering(orFilter, testFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19250);assertFiltering(orFilter, testPath, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19251);assertEquals(orFilter.getFileFilters(), filters);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19252);orFilter.removeFileFilter(trueFilter);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19253);assertFiltering(orFilter, testFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19254);assertFiltering(orFilter, testPath, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19255);orFilter.setFileFilters(filters);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19256);assertFiltering(orFilter, testFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19257);assertFiltering(orFilter, testPath, true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19258);assertTrue(orFilter.accept(testFile.getParentFile(), testFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19259);assertEquals(FileVisitResult.CONTINUE, orFilter.accept(testPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19260);orFilter.removeFileFilter(trueFilter);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19261);assertFalse(orFilter.accept(testFile.getParentFile(), testFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19262);assertEquals(FileVisitResult.TERMINATE, orFilter.accept(testPath, null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19263);assertThrows(NullPointerException.class, () -> new OrFileFilter(falseFilter, (IOFileFilter) null));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testPathEqualsFilter() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymld79ev4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testPathEqualsFilter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymld79ev4(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19264);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19265);assertFooBarFileFiltering(
            new PathEqualsFileFilter(Paths.get("foo")).or(new PathEqualsFileFilter(Paths.get("bar"))));
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testPrefix() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1ncl1ev6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1ncl1ev6(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19266);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19267);IOFileFilter filter = new PrefixFileFilter("foo", "bar");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19268);final File testFile = new File("test");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19269);final Path testPath = testFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19270);final File fredFile = new File("fred");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19271);final Path fredPath = fredFile.toPath();

        __CLR4_4_1e6le6lkylve2hi.R.inc(19272);assertFiltering(filter, new File("foo.test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19273);assertFiltering(filter, new File("FOO.test"), false); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19274);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19275);assertFiltering(filter, new File("bar"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19276);assertFiltering(filter, new File("food/"), true);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19277);assertFiltering(filter, new File("foo.test").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19278);assertFiltering(filter, new File("FOO.test").toPath(), false); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19279);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19280);assertFiltering(filter, new File("bar").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19281);assertFiltering(filter, new File("food/").toPath(), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19282);filter = FileFilterUtils.prefixFileFilter("bar");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19283);assertFiltering(filter, new File("barred\\"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19284);assertFiltering(filter, new File("test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19285);assertFiltering(filter, new File("fo_o.test"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19286);assertFiltering(filter, new File("abar.exe"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19287);assertFiltering(filter, new File("barred\\").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19288);assertFiltering(filter, new File("test").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19289);assertFiltering(filter, new File("fo_o.test").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19290);assertFiltering(filter, new File("abar.exe").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19291);filter = new PrefixFileFilter("tes");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19292);assertFiltering(filter, new File("test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19293);assertFiltering(filter, new File("fred"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19294);assertFiltering(filter, new File("test").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19295);assertFiltering(filter, new File("fred").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19296);assertTrue(filter.accept(testFile.getParentFile(), testFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19297);assertFalse(filter.accept(fredFile.getParentFile(), fredFile.getName()));
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19298);assertEquals(FileVisitResult.CONTINUE, filter.accept(testPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19299);assertEquals(FileVisitResult.TERMINATE, filter.accept(fredPath, null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19300);final List<String> prefixes = Arrays.asList("foo", "fre");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19301);final IOFileFilter listFilter = new PrefixFileFilter(prefixes);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19302);assertFalse(listFilter.accept(testFile.getParentFile(), testFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19303);assertTrue(listFilter.accept(fredFile.getParentFile(), fredFile.getName()));
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19304);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(testPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19305);assertEquals(FileVisitResult.CONTINUE, listFilter.accept(fredPath, null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19306);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19307);new PrefixFileFilter((String) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19308);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19309);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19310);new PrefixFileFilter((String[]) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19311);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19312);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19313);new PrefixFileFilter((List<String>) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19314);fail();
        } catch (final IllegalArgumentException ignore) {
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testPrefixCaseInsensitive() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdgxksewj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testPrefixCaseInsensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdgxksewj(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19315);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19316);IOFileFilter filter = new PrefixFileFilter(new String[] {"foo", "bar"}, IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19317);assertFiltering(filter, new File("foo.test1"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19318);assertFiltering(filter, new File("bar.test1"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19319);assertFiltering(filter, new File("FOO.test1"), true); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19320);assertFiltering(filter, new File("BAR.test1"), true); // case-sensitive

        __CLR4_4_1e6le6lkylve2hi.R.inc(19321);filter = new PrefixFileFilter("bar", IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19322);assertFiltering(filter, new File("foo.test2"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19323);assertFiltering(filter, new File("bar.test2"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19324);assertFiltering(filter, new File("FOO.test2"), false); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19325);assertFiltering(filter, new File("BAR.test2"), true); // case-sensitive

        __CLR4_4_1e6le6lkylve2hi.R.inc(19326);final List<String> prefixes = Arrays.asList("foo", "bar");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19327);filter = new PrefixFileFilter(prefixes, IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19328);assertFiltering(filter, new File("foo.test3"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19329);assertFiltering(filter, new File("bar.test3"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19330);assertFiltering(filter, new File("FOO.test3"), true); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19331);assertFiltering(filter, new File("BAR.test3"), true); // case-sensitive

        __CLR4_4_1e6le6lkylve2hi.R.inc(19332);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19333);new PrefixFileFilter((String) null, IOCase.INSENSITIVE);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19334);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19335);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19336);new PrefixFileFilter((String[]) null, IOCase.INSENSITIVE);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19337);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19338);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19339);new PrefixFileFilter((List<String>) null, IOCase.INSENSITIVE);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19340);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        // FileFilterUtils.prefixFileFilter(String, IOCase) tests
        __CLR4_4_1e6le6lkylve2hi.R.inc(19341);filter = FileFilterUtils.prefixFileFilter("bar", IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19342);assertFiltering(filter, new File("foo.test2"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19343);assertFiltering(filter, new File("bar.test2"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19344);assertFiltering(filter, new File("FOO.test2"), false); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19345);assertFiltering(filter, new File("BAR.test2"), true); // case-sensitive

        __CLR4_4_1e6le6lkylve2hi.R.inc(19346);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19347);FileFilterUtils.prefixFileFilter(null, IOCase.INSENSITIVE);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19348);fail();
        } catch (final IllegalArgumentException ignore) {
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testSizeFilterOnFiles() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qu11isexh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testSizeFilterOnFiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qu11isexh() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(19349);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19350);final File smallFile = new File(temporaryFolder, "small.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19351);if ((((!smallFile.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19352)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19353)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19354);fail("Cannot create file " + smallFile + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC24 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19355);try (__CLR4_4_1$AC24 __CLR$ACI24=new __CLR4_4_1$AC24(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19356);}};final BufferedOutputStream output1 = new BufferedOutputStream(Files.newOutputStream(smallFile.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19357);TestUtils.generateTestData(output1, 32);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19358);final File largeFile = new File(temporaryFolder, "large.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19359);if ((((!largeFile.getParentFile().exists())&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19360)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19361)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19362);fail("Cannot create file " + largeFile + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC25 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19363);try (__CLR4_4_1$AC25 __CLR$ACI25=new __CLR4_4_1$AC25(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19364);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(largeFile.toPath()))) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19365);TestUtils.generateTestData(output, 128);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19366);final IOFileFilter filter1 = FileFilterUtils.sizeFileFilter(64);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19367);final IOFileFilter filter2 = FileFilterUtils.sizeFileFilter(64, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19368);final IOFileFilter filter3 = FileFilterUtils.sizeFileFilter(64, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19369);assertFiltering(filter1, smallFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19370);assertFiltering(filter2, smallFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19371);assertFiltering(filter3, smallFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19372);assertFiltering(filter1, largeFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19373);assertFiltering(filter2, largeFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19374);assertFiltering(filter3, largeFile, false);

        // size range tests
        __CLR4_4_1e6le6lkylve2hi.R.inc(19375);final IOFileFilter filter4 = FileFilterUtils.sizeRangeFileFilter(33, 127);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19376);final IOFileFilter filter5 = FileFilterUtils.sizeRangeFileFilter(32, 127);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19377);final IOFileFilter filter6 = FileFilterUtils.sizeRangeFileFilter(33, 128);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19378);final IOFileFilter filter7 = FileFilterUtils.sizeRangeFileFilter(31, 129);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19379);final IOFileFilter filter8 = FileFilterUtils.sizeRangeFileFilter(128, 128);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19380);assertFiltering(filter4, smallFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19381);assertFiltering(filter4, largeFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19382);assertFiltering(filter5, smallFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19383);assertFiltering(filter5, largeFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19384);assertFiltering(filter6, smallFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19385);assertFiltering(filter6, largeFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19386);assertFiltering(filter7, smallFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19387);assertFiltering(filter7, largeFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19388);assertFiltering(filter8, largeFile, true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19389);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19390);FileFilterUtils.sizeFileFilter(-1);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19391);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testSizeFilterOnPaths() throws Exception {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n1pxneyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testSizeFilterOnPaths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n1pxneyo() throws Exception{try{__CLR4_4_1e6le6lkylve2hi.R.inc(19392);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19393);final Path smallFile = Paths.get(temporaryFolder.toString(), "small.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19394);if ((((Files.notExists(smallFile.getParent()))&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19395)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19396)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19397);fail("Cannot create file " + smallFile + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC26 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19398);try (__CLR4_4_1$AC26 __CLR$ACI26=new __CLR4_4_1$AC26(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19399);}};OutputStream output = Files.newOutputStream(smallFile)) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19400);TestUtils.generateTestData(output, 32);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19401);final Path largeFile = Paths.get(temporaryFolder.toString(), "large.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19402);if ((((Files.notExists(largeFile.getParent()))&&(__CLR4_4_1e6le6lkylve2hi.R.iget(19403)!=0|true))||(__CLR4_4_1e6le6lkylve2hi.R.iget(19404)==0&false))) {{
            __CLR4_4_1e6le6lkylve2hi.R.inc(19405);fail("Cannot create file " + largeFile + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC27 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1e6le6lkylve2hi.R.inc(19406);try (__CLR4_4_1$AC27 __CLR$ACI27=new __CLR4_4_1$AC27(){{__CLR4_4_1e6le6lkylve2hi.R.inc(19407);}};OutputStream output = Files.newOutputStream(largeFile)) {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19408);TestUtils.generateTestData(output, 128);
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19409);final IOFileFilter filter1 = FileFilterUtils.sizeFileFilter(64);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19410);final IOFileFilter filter2 = FileFilterUtils.sizeFileFilter(64, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19411);final IOFileFilter filter3 = FileFilterUtils.sizeFileFilter(64, false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19412);assertFiltering(filter1, smallFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19413);assertFiltering(filter2, smallFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19414);assertFiltering(filter3, smallFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19415);assertFiltering(filter1, largeFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19416);assertFiltering(filter2, largeFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19417);assertFiltering(filter3, largeFile, false);

        // size range tests
        __CLR4_4_1e6le6lkylve2hi.R.inc(19418);final IOFileFilter filter4 = FileFilterUtils.sizeRangeFileFilter(33, 127);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19419);final IOFileFilter filter5 = FileFilterUtils.sizeRangeFileFilter(32, 127);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19420);final IOFileFilter filter6 = FileFilterUtils.sizeRangeFileFilter(33, 128);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19421);final IOFileFilter filter7 = FileFilterUtils.sizeRangeFileFilter(31, 129);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19422);final IOFileFilter filter8 = FileFilterUtils.sizeRangeFileFilter(128, 128);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19423);assertFiltering(filter4, smallFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19424);assertFiltering(filter4, largeFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19425);assertFiltering(filter5, smallFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19426);assertFiltering(filter5, largeFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19427);assertFiltering(filter6, smallFile, false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19428);assertFiltering(filter6, largeFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19429);assertFiltering(filter7, smallFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19430);assertFiltering(filter7, largeFile, true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19431);assertFiltering(filter8, largeFile, true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19432);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19433);FileFilterUtils.sizeFileFilter(-1);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19434);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testSuffix() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vj82eezv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testSuffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vj82eezv(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19435);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19436);IOFileFilter filter = new SuffixFileFilter("tes", "est");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19437);final File testFile = new File("test");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19438);final Path testPath = testFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19439);final File fredFile = new File("fred");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19440);final Path fredPath = fredFile.toPath();
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19441);assertFiltering(filter, new File("fred.tes"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19442);assertFiltering(filter, new File("fred.est"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19443);assertFiltering(filter, new File("fred.EST"), false); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19444);assertFiltering(filter, new File("fred.exe"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19445);assertFiltering(filter, new File("fred.tes").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19446);assertFiltering(filter, new File("fred.est").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19447);assertFiltering(filter, new File("fred.EST").toPath(), false); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19448);assertFiltering(filter, new File("fred.exe").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19449);filter = FileFilterUtils.or(FileFilterUtils.suffixFileFilter("tes"), FileFilterUtils.suffixFileFilter("est"));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19450);assertFiltering(filter, new File("fred"), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19451);assertFiltering(filter, new File(".tes"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19452);assertFiltering(filter, new File("fred.test"), true);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19453);assertFiltering(filter, new File("fred").toPath(), false);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19454);assertFiltering(filter, new File(".tes").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19455);assertFiltering(filter, new File("fred.test").toPath(), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19456);filter = new SuffixFileFilter("est");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19457);assertFiltering(filter, new File("test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19458);assertFiltering(filter, new File("fred"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19459);assertFiltering(filter, new File("test").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19460);assertFiltering(filter, new File("fred").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19461);assertTrue(filter.accept(testFile.getParentFile(), testFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19462);assertFalse(filter.accept(fredFile.getParentFile(), fredFile.getName()));
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19463);assertEquals(FileVisitResult.CONTINUE, filter.accept(testPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19464);assertEquals(FileVisitResult.TERMINATE, filter.accept(fredPath, null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19465);final List<String> prefixes = Arrays.asList("ood", "red");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19466);final IOFileFilter listFilter = new SuffixFileFilter(prefixes);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19467);assertFalse(listFilter.accept(testFile.getParentFile(), testFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19468);assertTrue(listFilter.accept(fredFile.getParentFile(), fredFile.getName()));
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19469);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(testPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19470);assertEquals(FileVisitResult.CONTINUE, listFilter.accept(fredPath, null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19471);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19472);new SuffixFileFilter((String) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19473);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19474);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19475);new SuffixFileFilter((String[]) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19476);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19477);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19478);new SuffixFileFilter((List<String>) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19479);fail();
        } catch (final IllegalArgumentException ignore) {
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testSuffixCaseInsensitive() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rx4nk5f14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testSuffixCaseInsensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rx4nk5f14(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19480);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19481);IOFileFilter filter = new SuffixFileFilter(new String[] {"tes", "est"}, IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19482);assertFiltering(filter, new File("foo.tes"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19483);assertFiltering(filter, new File("foo.est"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19484);assertFiltering(filter, new File("foo.EST"), true); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19485);assertFiltering(filter, new File("foo.TES"), true); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19486);assertFiltering(filter, new File("foo.exe"), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19487);filter = new SuffixFileFilter("est", IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19488);assertFiltering(filter, new File("test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19489);assertFiltering(filter, new File("TEST"), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19490);final List<String> suffixes = Arrays.asList("tes", "est");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19491);filter = new SuffixFileFilter(suffixes, IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19492);assertFiltering(filter, new File("bar.tes"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19493);assertFiltering(filter, new File("bar.est"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19494);assertFiltering(filter, new File("bar.EST"), true); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19495);assertFiltering(filter, new File("bar.TES"), true); // case-sensitive
        __CLR4_4_1e6le6lkylve2hi.R.inc(19496);assertFiltering(filter, new File("bar.exe"), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19497);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19498);new SuffixFileFilter((String) null, IOCase.INSENSITIVE);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19499);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19500);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19501);new SuffixFileFilter((String[]) null, IOCase.INSENSITIVE);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19502);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1e6le6lkylve2hi.R.inc(19503);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19504);new SuffixFileFilter((List<String>) null, IOCase.INSENSITIVE);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19505);fail();
        } catch (final IllegalArgumentException ignore) {
        }

        // FileFilterUtils.suffixFileFilter(String, IOCase) tests
        __CLR4_4_1e6le6lkylve2hi.R.inc(19506);filter = FileFilterUtils.suffixFileFilter("est", IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19507);assertFiltering(filter, new File("test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19508);assertFiltering(filter, new File("TEST"), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19509);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19510);FileFilterUtils.suffixFileFilter(null, IOCase.INSENSITIVE);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19511);fail();
        } catch (final IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testTrue() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cy4y9lf20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cy4y9lf20(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19512);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19513);final IOFileFilter filter = FileFilterUtils.trueFileFilter();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19514);assertFiltering(filter, new File("foo.test"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19515);assertFiltering(filter, new File("foo"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19516);assertFiltering(filter, (File) null, true);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19517);assertFiltering(filter, new File("foo.test").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19518);assertFiltering(filter, new File("foo").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19519);assertFiltering(filter, (Path) null, true);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19520);assertSame(TrueFileFilter.TRUE, TrueFileFilter.INSTANCE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19521);assertSame(FalseFileFilter.FALSE, TrueFileFilter.INSTANCE.negate());
        __CLR4_4_1e6le6lkylve2hi.R.inc(19522);assertSame(FalseFileFilter.INSTANCE, TrueFileFilter.INSTANCE.negate());
        __CLR4_4_1e6le6lkylve2hi.R.inc(19523);assertNotNull(TrueFileFilter.INSTANCE.toString());
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}

    @Test
    public void testWildcard() {__CLR4_4_1e6le6lkylve2hi.R.globalSliceStart(getClass().getName(),19524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mcnmp9f2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e6le6lkylve2hi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e6le6lkylve2hi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.FileFilterTestCase.testWildcard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mcnmp9f2c(){try{__CLR4_4_1e6le6lkylve2hi.R.inc(19524);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19525);IOFileFilter filter = new WildcardFileFilter("*.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19526);assertFiltering(filter, new File("log.txt"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19527);assertFiltering(filter, new File("log.TXT"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19528);assertFiltering(filter, new File("log.txt").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19529);assertFiltering(filter, new File("log.TXT").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19530);filter = new WildcardFileFilter("*.txt", IOCase.SENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19531);assertFiltering(filter, new File("log.txt"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19532);assertFiltering(filter, new File("log.TXT"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19533);assertFiltering(filter, new File("log.txt").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19534);assertFiltering(filter, new File("log.TXT").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19535);filter = new WildcardFileFilter("*.txt", IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19536);assertFiltering(filter, new File("log.txt"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19537);assertFiltering(filter, new File("log.TXT"), true);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19538);assertFiltering(filter, new File("log.txt").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19539);assertFiltering(filter, new File("log.TXT").toPath(), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19540);filter = new WildcardFileFilter("*.txt", IOCase.SYSTEM);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19541);assertFiltering(filter, new File("log.txt"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19542);assertFiltering(filter, new File("log.TXT"), WINDOWS);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19543);assertFiltering(filter, new File("log.txt").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19544);assertFiltering(filter, new File("log.TXT").toPath(), WINDOWS);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19545);filter = new WildcardFileFilter("*.txt", null);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19546);assertFiltering(filter, new File("log.txt"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19547);assertFiltering(filter, new File("log.TXT"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19548);assertFiltering(filter, new File("log.txt").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19549);assertFiltering(filter, new File("log.TXT").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19550);filter = new WildcardFileFilter("*.java", "*.class");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19551);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19552);assertFiltering(filter, new File("Test.class"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19553);assertFiltering(filter, new File("Test.jsp"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19554);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19555);assertFiltering(filter, new File("Test.class").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19556);assertFiltering(filter, new File("Test.jsp").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19557);filter = new WildcardFileFilter(new String[] {"*.java", "*.class"}, IOCase.SENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19558);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19559);assertFiltering(filter, new File("Test.JAVA"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19560);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19561);assertFiltering(filter, new File("Test.JAVA").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19562);filter = new WildcardFileFilter(new String[] {"*.java", "*.class"}, IOCase.INSENSITIVE);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19563);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19564);assertFiltering(filter, new File("Test.JAVA"), true);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19565);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19566);assertFiltering(filter, new File("Test.JAVA").toPath(), true);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19567);filter = new WildcardFileFilter(new String[] {"*.java", "*.class"}, IOCase.SYSTEM);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19568);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19569);assertFiltering(filter, new File("Test.JAVA"), WINDOWS);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19570);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19571);assertFiltering(filter, new File("Test.JAVA").toPath(), WINDOWS);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19572);filter = new WildcardFileFilter(new String[] {"*.java", "*.class"}, null);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19573);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19574);assertFiltering(filter, new File("Test.JAVA"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19575);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19576);assertFiltering(filter, new File("Test.JAVA").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19577);final List<String> patternList = Arrays.asList("*.txt", "*.xml", "*.gif");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19578);final IOFileFilter listFilter = new WildcardFileFilter(patternList);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19579);assertFiltering(listFilter, new File("Test.txt"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19580);assertFiltering(listFilter, new File("Test.xml"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19581);assertFiltering(listFilter, new File("Test.gif"), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19582);assertFiltering(listFilter, new File("Test.bmp"), false);
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19583);assertFiltering(listFilter, new File("Test.txt").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19584);assertFiltering(listFilter, new File("Test.xml").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19585);assertFiltering(listFilter, new File("Test.gif").toPath(), true);
        __CLR4_4_1e6le6lkylve2hi.R.inc(19586);assertFiltering(listFilter, new File("Test.bmp").toPath(), false);

        __CLR4_4_1e6le6lkylve2hi.R.inc(19587);final File txtFile = new File("test.txt");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19588);final Path txtPath = txtFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19589);final File bmpFile = new File("test.bmp");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19590);final Path bmpPath = bmpFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19591);final File dirFile = new File("src/java");
        __CLR4_4_1e6le6lkylve2hi.R.inc(19592);final Path dirPath = dirFile.toPath();
        __CLR4_4_1e6le6lkylve2hi.R.inc(19593);assertTrue(listFilter.accept(txtFile));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19594);assertFalse(listFilter.accept(bmpFile));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19595);assertFalse(listFilter.accept(dirFile));
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19596);assertEquals(FileVisitResult.CONTINUE, listFilter.accept(txtFile.toPath(), null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19597);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(bmpFile.toPath(), null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19598);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(dirFile.toPath(), null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19599);assertTrue(listFilter.accept(txtFile.getParentFile(), txtFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19600);assertFalse(listFilter.accept(bmpFile.getParentFile(), bmpFile.getName()));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19601);assertFalse(listFilter.accept(dirFile.getParentFile(), dirFile.getName()));
        //
        __CLR4_4_1e6le6lkylve2hi.R.inc(19602);assertEquals(FileVisitResult.CONTINUE, listFilter.accept(txtPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19603);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(bmpPath, null));
        __CLR4_4_1e6le6lkylve2hi.R.inc(19604);assertEquals(FileVisitResult.TERMINATE, listFilter.accept(dirPath, null));

        __CLR4_4_1e6le6lkylve2hi.R.inc(19605);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19606);new WildcardFileFilter((String) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19607);fail();
        } catch (final IllegalArgumentException ignore) {
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19608);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19609);new WildcardFileFilter((String[]) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19610);fail();
        } catch (final IllegalArgumentException ignore) {
        }
        __CLR4_4_1e6le6lkylve2hi.R.inc(19611);try {
            __CLR4_4_1e6le6lkylve2hi.R.inc(19612);new WildcardFileFilter((List<String>) null);
            __CLR4_4_1e6le6lkylve2hi.R.inc(19613);fail();
        } catch (final IllegalArgumentException ignore) {
        }
    }finally{__CLR4_4_1e6le6lkylve2hi.R.flushNeeded();}}
}
