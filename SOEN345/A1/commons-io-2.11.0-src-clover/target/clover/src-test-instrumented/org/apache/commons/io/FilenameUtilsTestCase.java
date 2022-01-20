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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.io.test.TestUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * This is used to test FilenameUtils for correctness.
 *
 * @see FilenameUtils
 */
public class FilenameUtilsTestCase {static class __CLR4_4_1aouaoukylve1li{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,14734,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    private static final String SEP = "" + File.separatorChar;
    private static final boolean WINDOWS = File.separatorChar == '\\';

    private File testFile1;
    private File testFile2;

    private int testFile1Size;
    private int testFile2Size;

    @BeforeEach
    public void setUp() throws Exception {try{__CLR4_4_1aouaoukylve1li.R.inc(13854);
        __CLR4_4_1aouaoukylve1li.R.inc(13855);testFile1 = File.createTempFile("test", "1", temporaryFolder);
        __CLR4_4_1aouaoukylve1li.R.inc(13856);testFile2 = File.createTempFile("test", "2", temporaryFolder);

        __CLR4_4_1aouaoukylve1li.R.inc(13857);testFile1Size = (int) testFile1.length();
        __CLR4_4_1aouaoukylve1li.R.inc(13858);testFile2Size = (int) testFile2.length();
        __CLR4_4_1aouaoukylve1li.R.inc(13859);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_1aouaoukylve1li.R.iget(13860)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(13861)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(13862);throw new IOException("Cannot create file " + testFile1
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1aouaoukylve1li.R.inc(13863);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1aouaoukylve1li.R.inc(13864);}};final BufferedOutputStream output3 =
                new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()))) {
            __CLR4_4_1aouaoukylve1li.R.inc(13865);TestUtils.generateTestData(output3, testFile1Size);
        }
        __CLR4_4_1aouaoukylve1li.R.inc(13866);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_1aouaoukylve1li.R.iget(13867)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(13868)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(13869);throw new IOException("Cannot create file " + testFile2
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1aouaoukylve1li.R.inc(13870);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1aouaoukylve1li.R.inc(13871);}};final BufferedOutputStream output2 =
                new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()))) {
            __CLR4_4_1aouaoukylve1li.R.inc(13872);TestUtils.generateTestData(output2, testFile2Size);
        }
        __CLR4_4_1aouaoukylve1li.R.inc(13873);if ((((!testFile1.getParentFile().exists())&&(__CLR4_4_1aouaoukylve1li.R.iget(13874)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(13875)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(13876);throw new IOException("Cannot create file " + testFile1
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1aouaoukylve1li.R.inc(13877);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1aouaoukylve1li.R.inc(13878);}};final BufferedOutputStream output1 =
                new BufferedOutputStream(Files.newOutputStream(testFile1.toPath()))) {
            __CLR4_4_1aouaoukylve1li.R.inc(13879);TestUtils.generateTestData(output1, testFile1Size);
        }
        __CLR4_4_1aouaoukylve1li.R.inc(13880);if ((((!testFile2.getParentFile().exists())&&(__CLR4_4_1aouaoukylve1li.R.iget(13881)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(13882)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(13883);throw new IOException("Cannot create file " + testFile2
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1aouaoukylve1li.R.inc(13884);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1aouaoukylve1li.R.inc(13885);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(testFile2.toPath()))) {
            __CLR4_4_1aouaoukylve1li.R.inc(13886);TestUtils.generateTestData(output, testFile2Size);
        }
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testNormalize() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),13887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0t4seapr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testNormalize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0t4seapr(){try{__CLR4_4_1aouaoukylve1li.R.inc(13887);
        __CLR4_4_1aouaoukylve1li.R.inc(13888);assertNull(FilenameUtils.normalize(null));
        __CLR4_4_1aouaoukylve1li.R.inc(13889);assertNull(FilenameUtils.normalize(":"));
        __CLR4_4_1aouaoukylve1li.R.inc(13890);assertNull(FilenameUtils.normalize("1:\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(13891);assertNull(FilenameUtils.normalize("1:"));
        __CLR4_4_1aouaoukylve1li.R.inc(13892);assertNull(FilenameUtils.normalize("1:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13893);assertNull(FilenameUtils.normalize("\\\\\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(13894);assertNull(FilenameUtils.normalize("\\\\a"));

        __CLR4_4_1aouaoukylve1li.R.inc(13895);assertEquals("a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(13896);assertEquals("" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("\\a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(13897);assertEquals("C:" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("C:\\a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(13898);assertEquals("" + SEP + "" + SEP + "server" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("\\\\server\\a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(13899);assertEquals("~" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("~\\a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(13900);assertEquals("~user" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("~user\\a\\b/c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(13901);assertEquals("a" + SEP + "c", FilenameUtils.normalize("a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13902);assertEquals("c", FilenameUtils.normalize("a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13903);assertEquals("c" + SEP, FilenameUtils.normalize("a/b/../../c/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13904);assertNull(FilenameUtils.normalize("a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13905);assertEquals("a" + SEP, FilenameUtils.normalize("a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13906);assertEquals("a" + SEP, FilenameUtils.normalize("a/b/../"));
        __CLR4_4_1aouaoukylve1li.R.inc(13907);assertEquals("", FilenameUtils.normalize("a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13908);assertEquals("", FilenameUtils.normalize("a/b/../../"));
        __CLR4_4_1aouaoukylve1li.R.inc(13909);assertNull(FilenameUtils.normalize("a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13910);assertEquals("a" + SEP + "d", FilenameUtils.normalize("a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13911);assertEquals("a" + SEP + "d" + SEP, FilenameUtils.normalize("a/b/../c/../d/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13912);assertEquals("a" + SEP + "b" + SEP + "d", FilenameUtils.normalize("a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13913);assertEquals("a" + SEP + "b" + SEP, FilenameUtils.normalize("a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(13914);assertEquals("a" + SEP + "b" + SEP, FilenameUtils.normalize("a/b/./././"));
        __CLR4_4_1aouaoukylve1li.R.inc(13915);assertEquals("a" + SEP, FilenameUtils.normalize("./a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13916);assertEquals("a", FilenameUtils.normalize("./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13917);assertEquals("", FilenameUtils.normalize("./"));
        __CLR4_4_1aouaoukylve1li.R.inc(13918);assertEquals("", FilenameUtils.normalize("."));
        __CLR4_4_1aouaoukylve1li.R.inc(13919);assertNull(FilenameUtils.normalize("../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13920);assertNull(FilenameUtils.normalize(".."));
        __CLR4_4_1aouaoukylve1li.R.inc(13921);assertEquals("", FilenameUtils.normalize(""));

        __CLR4_4_1aouaoukylve1li.R.inc(13922);assertEquals(SEP + "a", FilenameUtils.normalize("/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13923);assertEquals(SEP + "a" + SEP, FilenameUtils.normalize("/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13924);assertEquals(SEP + "a" + SEP + "c", FilenameUtils.normalize("/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13925);assertEquals(SEP + "c", FilenameUtils.normalize("/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13926);assertNull(FilenameUtils.normalize("/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13927);assertEquals(SEP + "a" + SEP, FilenameUtils.normalize("/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13928);assertEquals(SEP + "", FilenameUtils.normalize("/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13929);assertNull(FilenameUtils.normalize("/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13930);assertEquals(SEP + "a" + SEP + "d", FilenameUtils.normalize("/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13931);assertEquals(SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalize("/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13932);assertEquals(SEP + "a" + SEP + "b" + SEP, FilenameUtils.normalize("/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(13933);assertEquals(SEP + "a", FilenameUtils.normalize("/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13934);assertEquals(SEP + "", FilenameUtils.normalize("/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(13935);assertEquals(SEP + "", FilenameUtils.normalize("/."));
        __CLR4_4_1aouaoukylve1li.R.inc(13936);assertNull(FilenameUtils.normalize("/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13937);assertNull(FilenameUtils.normalize("/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13938);assertEquals(SEP + "", FilenameUtils.normalize("/"));

        __CLR4_4_1aouaoukylve1li.R.inc(13939);assertEquals("~" + SEP + "a", FilenameUtils.normalize("~/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13940);assertEquals("~" + SEP + "a" + SEP, FilenameUtils.normalize("~/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13941);assertEquals("~" + SEP + "a" + SEP + "c", FilenameUtils.normalize("~/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13942);assertEquals("~" + SEP + "c", FilenameUtils.normalize("~/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13943);assertNull(FilenameUtils.normalize("~/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13944);assertEquals("~" + SEP + "a" + SEP, FilenameUtils.normalize("~/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13945);assertEquals("~" + SEP + "", FilenameUtils.normalize("~/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13946);assertNull(FilenameUtils.normalize("~/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13947);assertEquals("~" + SEP + "a" + SEP + "d", FilenameUtils.normalize("~/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13948);assertEquals("~" + SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalize("~/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13949);assertEquals("~" + SEP + "a" + SEP + "b" + SEP, FilenameUtils.normalize("~/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(13950);assertEquals("~" + SEP + "a", FilenameUtils.normalize("~/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13951);assertEquals("~" + SEP, FilenameUtils.normalize("~/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(13952);assertEquals("~" + SEP, FilenameUtils.normalize("~/."));
        __CLR4_4_1aouaoukylve1li.R.inc(13953);assertNull(FilenameUtils.normalize("~/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13954);assertNull(FilenameUtils.normalize("~/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13955);assertEquals("~" + SEP, FilenameUtils.normalize("~/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13956);assertEquals("~" + SEP, FilenameUtils.normalize("~"));

        __CLR4_4_1aouaoukylve1li.R.inc(13957);assertEquals("~user" + SEP + "a", FilenameUtils.normalize("~user/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13958);assertEquals("~user" + SEP + "a" + SEP, FilenameUtils.normalize("~user/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13959);assertEquals("~user" + SEP + "a" + SEP + "c", FilenameUtils.normalize("~user/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13960);assertEquals("~user" + SEP + "c", FilenameUtils.normalize("~user/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13961);assertNull(FilenameUtils.normalize("~user/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13962);assertEquals("~user" + SEP + "a" + SEP, FilenameUtils.normalize("~user/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13963);assertEquals("~user" + SEP + "", FilenameUtils.normalize("~user/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13964);assertNull(FilenameUtils.normalize("~user/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13965);assertEquals("~user" + SEP + "a" + SEP + "d", FilenameUtils.normalize("~user/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13966);assertEquals("~user" + SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalize("~user/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13967);assertEquals("~user" + SEP + "a" + SEP + "b" + SEP, FilenameUtils.normalize("~user/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(13968);assertEquals("~user" + SEP + "a", FilenameUtils.normalize("~user/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13969);assertEquals("~user" + SEP + "", FilenameUtils.normalize("~user/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(13970);assertEquals("~user" + SEP + "", FilenameUtils.normalize("~user/."));
        __CLR4_4_1aouaoukylve1li.R.inc(13971);assertNull(FilenameUtils.normalize("~user/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13972);assertNull(FilenameUtils.normalize("~user/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13973);assertEquals("~user" + SEP, FilenameUtils.normalize("~user/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13974);assertEquals("~user" + SEP, FilenameUtils.normalize("~user"));

        __CLR4_4_1aouaoukylve1li.R.inc(13975);assertEquals("C:" + SEP + "a", FilenameUtils.normalize("C:/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13976);assertEquals("C:" + SEP + "a" + SEP, FilenameUtils.normalize("C:/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13977);assertEquals("C:" + SEP + "a" + SEP + "c", FilenameUtils.normalize("C:/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13978);assertEquals("C:" + SEP + "c", FilenameUtils.normalize("C:/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13979);assertNull(FilenameUtils.normalize("C:/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13980);assertEquals("C:" + SEP + "a" + SEP, FilenameUtils.normalize("C:/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13981);assertEquals("C:" + SEP + "", FilenameUtils.normalize("C:/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13982);assertNull(FilenameUtils.normalize("C:/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13983);assertEquals("C:" + SEP + "a" + SEP + "d", FilenameUtils.normalize("C:/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13984);assertEquals("C:" + SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalize("C:/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(13985);assertEquals("C:" + SEP + "a" + SEP + "b" + SEP, FilenameUtils.normalize("C:/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(13986);assertEquals("C:" + SEP + "a", FilenameUtils.normalize("C:/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13987);assertEquals("C:" + SEP + "", FilenameUtils.normalize("C:/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(13988);assertEquals("C:" + SEP + "", FilenameUtils.normalize("C:/."));
        __CLR4_4_1aouaoukylve1li.R.inc(13989);assertNull(FilenameUtils.normalize("C:/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13990);assertNull(FilenameUtils.normalize("C:/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13991);assertEquals("C:" + SEP + "", FilenameUtils.normalize("C:/"));

        __CLR4_4_1aouaoukylve1li.R.inc(13992);assertEquals("C:" + "a", FilenameUtils.normalize("C:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(13993);assertEquals("C:" + "a" + SEP, FilenameUtils.normalize("C:a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(13994);assertEquals("C:" + "a" + SEP + "c", FilenameUtils.normalize("C:a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13995);assertEquals("C:" + "c", FilenameUtils.normalize("C:a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13996);assertNull(FilenameUtils.normalize("C:a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(13997);assertEquals("C:" + "a" + SEP, FilenameUtils.normalize("C:a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13998);assertEquals("C:" + "", FilenameUtils.normalize("C:a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(13999);assertNull(FilenameUtils.normalize("C:a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14000);assertEquals("C:" + "a" + SEP + "d", FilenameUtils.normalize("C:a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14001);assertEquals("C:" + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalize("C:a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14002);assertEquals("C:" + "a" + SEP + "b" + SEP, FilenameUtils.normalize("C:a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(14003);assertEquals("C:" + "a", FilenameUtils.normalize("C:./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14004);assertEquals("C:" + "", FilenameUtils.normalize("C:./"));
        __CLR4_4_1aouaoukylve1li.R.inc(14005);assertEquals("C:" + "", FilenameUtils.normalize("C:."));
        __CLR4_4_1aouaoukylve1li.R.inc(14006);assertNull(FilenameUtils.normalize("C:../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14007);assertNull(FilenameUtils.normalize("C:.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14008);assertEquals("C:" + "", FilenameUtils.normalize("C:"));

        __CLR4_4_1aouaoukylve1li.R.inc(14009);assertEquals(SEP + SEP + "server" + SEP + "a", FilenameUtils.normalize("//server/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14010);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP, FilenameUtils.normalize("//server/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14011);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP + "c", FilenameUtils.normalize("//server/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14012);assertEquals(SEP + SEP + "server" + SEP + "c", FilenameUtils.normalize("//server/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14013);assertNull(FilenameUtils.normalize("//server/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14014);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP, FilenameUtils.normalize("//server/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14015);assertEquals(SEP + SEP + "server" + SEP + "", FilenameUtils.normalize("//server/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14016);assertNull(FilenameUtils.normalize("//server/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14017);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP + "d", FilenameUtils.normalize("//server/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14018);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalize("//server/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14019);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP + "b" + SEP, FilenameUtils.normalize("//server/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(14020);assertEquals(SEP + SEP + "server" + SEP + "a", FilenameUtils.normalize("//server/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14021);assertEquals(SEP + SEP + "server" + SEP + "", FilenameUtils.normalize("//server/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(14022);assertEquals(SEP + SEP + "server" + SEP + "", FilenameUtils.normalize("//server/."));
        __CLR4_4_1aouaoukylve1li.R.inc(14023);assertNull(FilenameUtils.normalize("//server/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14024);assertNull(FilenameUtils.normalize("//server/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14025);assertEquals(SEP + SEP + "server" + SEP + "", FilenameUtils.normalize("//server/"));

        __CLR4_4_1aouaoukylve1li.R.inc(14026);assertEquals(SEP + SEP + "127.0.0.1" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("\\\\127.0.0.1\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14027);assertEquals(SEP + SEP + "::1" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("\\\\::1\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14028);assertEquals(SEP + SEP + "1::" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("\\\\1::\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14029);assertEquals(SEP + SEP + "server.example.org" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("\\\\server.example.org\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14030);assertEquals(SEP + SEP + "server.sub.example.org" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("\\\\server.sub.example.org\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14031);assertEquals(SEP + SEP + "server." + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("\\\\server.\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14032);assertEquals(SEP + SEP + "1::127.0.0.1" + SEP + "a" + SEP + "b" + SEP + "c.txt",
            FilenameUtils.normalize("\\\\1::127.0.0.1\\a\\b\\c.txt"));

        // not valid IPv4 addresses but technically a valid "reg-name"s according to RFC1034
        __CLR4_4_1aouaoukylve1li.R.inc(14033);assertEquals(SEP + SEP + "127.0.0.256" + SEP + "a" + SEP + "b" + SEP + "c.txt",
            FilenameUtils.normalize("\\\\127.0.0.256\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14034);assertEquals(SEP + SEP + "127.0.0.01" + SEP + "a" + SEP + "b" + SEP + "c.txt",
            FilenameUtils.normalize("\\\\127.0.0.01\\a\\b\\c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14035);assertNull(FilenameUtils.normalize("\\\\-server\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14036);assertNull(FilenameUtils.normalize("\\\\.\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14037);assertNull(FilenameUtils.normalize("\\\\..\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14038);assertNull(FilenameUtils.normalize("\\\\127.0..1\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14039);assertNull(FilenameUtils.normalize("\\\\::1::2\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14040);assertNull(FilenameUtils.normalize("\\\\:1\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14041);assertNull(FilenameUtils.normalize("\\\\1:\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14042);assertNull(FilenameUtils.normalize("\\\\1:2:3:4:5:6:7:8:9\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14043);assertNull(FilenameUtils.normalize("\\\\g:2:3:4:5:6:7:8\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14044);assertNull(FilenameUtils.normalize("\\\\1ffff:2:3:4:5:6:7:8\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14045);assertNull(FilenameUtils.normalize("\\\\1:2\\a\\b\\c.txt"));
        // IO-556
        __CLR4_4_1aouaoukylve1li.R.inc(14046);assertNull(FilenameUtils.normalize("//../foo"));
        __CLR4_4_1aouaoukylve1li.R.inc(14047);assertNull(FilenameUtils.normalize("\\\\..\\foo"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    /**
     */
    @Test
    public void testNormalize_with_nullbytes() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qz4veau8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testNormalize_with_nullbytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qz4veau8(){try{__CLR4_4_1aouaoukylve1li.R.inc(14048);
        __CLR4_4_1aouaoukylve1li.R.inc(14049);try {
            __CLR4_4_1aouaoukylve1li.R.inc(14050);assertEquals("a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("a\\b/c\u0000.txt"));
        } catch (final IllegalArgumentException ignore) {
        }

        __CLR4_4_1aouaoukylve1li.R.inc(14051);try {
            __CLR4_4_1aouaoukylve1li.R.inc(14052);assertEquals("a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalize("\u0000a\\b/c.txt"));
        } catch (final IllegalArgumentException ignore) {
        }
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testNormalizeUnixWin() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gbl8gaud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testNormalizeUnixWin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gbl8gaud(){try{__CLR4_4_1aouaoukylve1li.R.inc(14053);

        // Normalize (Unix Separator)
        __CLR4_4_1aouaoukylve1li.R.inc(14054);assertEquals("/a/c/", FilenameUtils.normalize("/a/b/../c/", true));
        __CLR4_4_1aouaoukylve1li.R.inc(14055);assertEquals("/a/c/", FilenameUtils.normalize("\\a\\b\\..\\c\\", true));

        // Normalize (Windows Separator)
        __CLR4_4_1aouaoukylve1li.R.inc(14056);assertEquals("\\a\\c\\", FilenameUtils.normalize("/a/b/../c/", false));
        __CLR4_4_1aouaoukylve1li.R.inc(14057);assertEquals("\\a\\c\\", FilenameUtils.normalize("\\a\\b\\..\\c\\", false));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testNormalizeNoEndSeparator() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19755t9aui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testNormalizeNoEndSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19755t9aui(){try{__CLR4_4_1aouaoukylve1li.R.inc(14058);
        __CLR4_4_1aouaoukylve1li.R.inc(14059);assertNull(FilenameUtils.normalizeNoEndSeparator(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14060);assertNull(FilenameUtils.normalizeNoEndSeparator(":"));
        __CLR4_4_1aouaoukylve1li.R.inc(14061);assertNull(FilenameUtils.normalizeNoEndSeparator("1:\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14062);assertNull(FilenameUtils.normalizeNoEndSeparator("1:"));
        __CLR4_4_1aouaoukylve1li.R.inc(14063);assertNull(FilenameUtils.normalizeNoEndSeparator("1:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14064);assertNull(FilenameUtils.normalizeNoEndSeparator("\\\\\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14065);assertNull(FilenameUtils.normalizeNoEndSeparator("\\\\a"));

        __CLR4_4_1aouaoukylve1li.R.inc(14066);assertEquals("a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalizeNoEndSeparator("a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14067);assertEquals("" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalizeNoEndSeparator("\\a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14068);assertEquals("C:" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalizeNoEndSeparator("C:\\a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14069);assertEquals("" + SEP + "" + SEP + "server" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalizeNoEndSeparator("\\\\server\\a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14070);assertEquals("~" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalizeNoEndSeparator("~\\a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14071);assertEquals("~user" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalizeNoEndSeparator("~user\\a\\b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14072);assertEquals("C:" + SEP + "a" + SEP + "b" + SEP + "c.txt", FilenameUtils.normalizeNoEndSeparator("C:\\\\a\\\\b\\\\c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14073);assertEquals("a" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14074);assertEquals("c", FilenameUtils.normalizeNoEndSeparator("a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14075);assertEquals("c", FilenameUtils.normalizeNoEndSeparator("a/b/../../c/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14076);assertNull(FilenameUtils.normalizeNoEndSeparator("a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14077);assertEquals("a", FilenameUtils.normalizeNoEndSeparator("a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14078);assertEquals("a", FilenameUtils.normalizeNoEndSeparator("a/b/../"));
        __CLR4_4_1aouaoukylve1li.R.inc(14079);assertEquals("", FilenameUtils.normalizeNoEndSeparator("a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14080);assertEquals("", FilenameUtils.normalizeNoEndSeparator("a/b/../../"));
        __CLR4_4_1aouaoukylve1li.R.inc(14081);assertNull(FilenameUtils.normalizeNoEndSeparator("a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14082);assertEquals("a" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14083);assertEquals("a" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("a/b/../c/../d/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14084);assertEquals("a" + SEP + "b" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14085);assertEquals("a" + SEP + "b", FilenameUtils.normalizeNoEndSeparator("a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(14086);assertEquals("a" + SEP + "b", FilenameUtils.normalizeNoEndSeparator("a/b/./././"));
        __CLR4_4_1aouaoukylve1li.R.inc(14087);assertEquals("a", FilenameUtils.normalizeNoEndSeparator("./a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14088);assertEquals("a", FilenameUtils.normalizeNoEndSeparator("./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14089);assertEquals("", FilenameUtils.normalizeNoEndSeparator("./"));
        __CLR4_4_1aouaoukylve1li.R.inc(14090);assertEquals("", FilenameUtils.normalizeNoEndSeparator("."));
        __CLR4_4_1aouaoukylve1li.R.inc(14091);assertNull(FilenameUtils.normalizeNoEndSeparator("../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14092);assertNull(FilenameUtils.normalizeNoEndSeparator(".."));
        __CLR4_4_1aouaoukylve1li.R.inc(14093);assertEquals("", FilenameUtils.normalizeNoEndSeparator(""));

        __CLR4_4_1aouaoukylve1li.R.inc(14094);assertEquals(SEP + "a", FilenameUtils.normalizeNoEndSeparator("/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14095);assertEquals(SEP + "a", FilenameUtils.normalizeNoEndSeparator("/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14096);assertEquals(SEP + "a" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14097);assertEquals(SEP + "c", FilenameUtils.normalizeNoEndSeparator("/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14098);assertNull(FilenameUtils.normalizeNoEndSeparator("/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14099);assertEquals(SEP + "a", FilenameUtils.normalizeNoEndSeparator("/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14100);assertEquals(SEP + "", FilenameUtils.normalizeNoEndSeparator("/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14101);assertNull(FilenameUtils.normalizeNoEndSeparator("/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14102);assertEquals(SEP + "a" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14103);assertEquals(SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14104);assertEquals(SEP + "a" + SEP + "b", FilenameUtils.normalizeNoEndSeparator("/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(14105);assertEquals(SEP + "a", FilenameUtils.normalizeNoEndSeparator("/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14106);assertEquals(SEP + "", FilenameUtils.normalizeNoEndSeparator("/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(14107);assertEquals(SEP + "", FilenameUtils.normalizeNoEndSeparator("/."));
        __CLR4_4_1aouaoukylve1li.R.inc(14108);assertNull(FilenameUtils.normalizeNoEndSeparator("/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14109);assertNull(FilenameUtils.normalizeNoEndSeparator("/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14110);assertEquals(SEP + "", FilenameUtils.normalizeNoEndSeparator("/"));

        __CLR4_4_1aouaoukylve1li.R.inc(14111);assertEquals("~" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("~/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14112);assertEquals("~" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("~/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14113);assertEquals("~" + SEP + "a" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("~/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14114);assertEquals("~" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("~/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14115);assertNull(FilenameUtils.normalizeNoEndSeparator("~/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14116);assertEquals("~" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("~/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14117);assertEquals("~" + SEP + "", FilenameUtils.normalizeNoEndSeparator("~/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14118);assertNull(FilenameUtils.normalizeNoEndSeparator("~/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14119);assertEquals("~" + SEP + "a" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("~/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14120);assertEquals("~" + SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("~/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14121);assertEquals("~" + SEP + "a" + SEP + "b", FilenameUtils.normalizeNoEndSeparator("~/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(14122);assertEquals("~" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("~/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14123);assertEquals("~" + SEP, FilenameUtils.normalizeNoEndSeparator("~/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(14124);assertEquals("~" + SEP, FilenameUtils.normalizeNoEndSeparator("~/."));
        __CLR4_4_1aouaoukylve1li.R.inc(14125);assertNull(FilenameUtils.normalizeNoEndSeparator("~/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14126);assertNull(FilenameUtils.normalizeNoEndSeparator("~/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14127);assertEquals("~" + SEP, FilenameUtils.normalizeNoEndSeparator("~/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14128);assertEquals("~" + SEP, FilenameUtils.normalizeNoEndSeparator("~"));

        __CLR4_4_1aouaoukylve1li.R.inc(14129);assertEquals("~user" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("~user/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14130);assertEquals("~user" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("~user/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14131);assertEquals("~user" + SEP + "a" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("~user/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14132);assertEquals("~user" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("~user/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14133);assertNull(FilenameUtils.normalizeNoEndSeparator("~user/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14134);assertEquals("~user" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("~user/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14135);assertEquals("~user" + SEP + "", FilenameUtils.normalizeNoEndSeparator("~user/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14136);assertNull(FilenameUtils.normalizeNoEndSeparator("~user/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14137);assertEquals("~user" + SEP + "a" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("~user/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14138);assertEquals("~user" + SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("~user/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14139);assertEquals("~user" + SEP + "a" + SEP + "b", FilenameUtils.normalizeNoEndSeparator("~user/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(14140);assertEquals("~user" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("~user/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14141);assertEquals("~user" + SEP + "", FilenameUtils.normalizeNoEndSeparator("~user/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(14142);assertEquals("~user" + SEP + "", FilenameUtils.normalizeNoEndSeparator("~user/."));
        __CLR4_4_1aouaoukylve1li.R.inc(14143);assertNull(FilenameUtils.normalizeNoEndSeparator("~user/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14144);assertNull(FilenameUtils.normalizeNoEndSeparator("~user/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14145);assertEquals("~user" + SEP, FilenameUtils.normalizeNoEndSeparator("~user/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14146);assertEquals("~user" + SEP, FilenameUtils.normalizeNoEndSeparator("~user"));

        __CLR4_4_1aouaoukylve1li.R.inc(14147);assertEquals("C:" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("C:/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14148);assertEquals("C:" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("C:/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14149);assertEquals("C:" + SEP + "a" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("C:/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14150);assertEquals("C:" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("C:/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14151);assertNull(FilenameUtils.normalizeNoEndSeparator("C:/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14152);assertEquals("C:" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("C:/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14153);assertEquals("C:" + SEP + "", FilenameUtils.normalizeNoEndSeparator("C:/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14154);assertNull(FilenameUtils.normalizeNoEndSeparator("C:/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14155);assertEquals("C:" + SEP + "a" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("C:/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14156);assertEquals("C:" + SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("C:/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14157);assertEquals("C:" + SEP + "a" + SEP + "b", FilenameUtils.normalizeNoEndSeparator("C:/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(14158);assertEquals("C:" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("C:/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14159);assertEquals("C:" + SEP + "", FilenameUtils.normalizeNoEndSeparator("C:/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(14160);assertEquals("C:" + SEP + "", FilenameUtils.normalizeNoEndSeparator("C:/."));
        __CLR4_4_1aouaoukylve1li.R.inc(14161);assertNull(FilenameUtils.normalizeNoEndSeparator("C:/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14162);assertNull(FilenameUtils.normalizeNoEndSeparator("C:/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14163);assertEquals("C:" + SEP + "", FilenameUtils.normalizeNoEndSeparator("C:/"));

        __CLR4_4_1aouaoukylve1li.R.inc(14164);assertEquals("C:" + "a", FilenameUtils.normalizeNoEndSeparator("C:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14165);assertEquals("C:" + "a", FilenameUtils.normalizeNoEndSeparator("C:a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14166);assertEquals("C:" + "a" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("C:a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14167);assertEquals("C:" + "c", FilenameUtils.normalizeNoEndSeparator("C:a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14168);assertNull(FilenameUtils.normalizeNoEndSeparator("C:a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14169);assertEquals("C:" + "a", FilenameUtils.normalizeNoEndSeparator("C:a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14170);assertEquals("C:" + "", FilenameUtils.normalizeNoEndSeparator("C:a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14171);assertNull(FilenameUtils.normalizeNoEndSeparator("C:a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14172);assertEquals("C:" + "a" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("C:a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14173);assertEquals("C:" + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("C:a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14174);assertEquals("C:" + "a" + SEP + "b", FilenameUtils.normalizeNoEndSeparator("C:a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(14175);assertEquals("C:" + "a", FilenameUtils.normalizeNoEndSeparator("C:./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14176);assertEquals("C:" + "", FilenameUtils.normalizeNoEndSeparator("C:./"));
        __CLR4_4_1aouaoukylve1li.R.inc(14177);assertEquals("C:" + "", FilenameUtils.normalizeNoEndSeparator("C:."));
        __CLR4_4_1aouaoukylve1li.R.inc(14178);assertNull(FilenameUtils.normalizeNoEndSeparator("C:../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14179);assertNull(FilenameUtils.normalizeNoEndSeparator("C:.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14180);assertEquals("C:" + "", FilenameUtils.normalizeNoEndSeparator("C:"));

        __CLR4_4_1aouaoukylve1li.R.inc(14181);assertEquals(SEP + SEP + "server" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("//server/a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14182);assertEquals(SEP + SEP + "server" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("//server/a/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14183);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("//server/a/b/../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14184);assertEquals(SEP + SEP + "server" + SEP + "c", FilenameUtils.normalizeNoEndSeparator("//server/a/b/../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14185);assertNull(FilenameUtils.normalizeNoEndSeparator("//server/a/b/../../../c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14186);assertEquals(SEP + SEP + "server" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("//server/a/b/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14187);assertEquals(SEP + SEP + "server" + SEP + "", FilenameUtils.normalizeNoEndSeparator("//server/a/b/../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14188);assertNull(FilenameUtils.normalizeNoEndSeparator("//server/a/b/../../.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14189);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("//server/a/b/../c/../d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14190);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP + "b" + SEP + "d", FilenameUtils.normalizeNoEndSeparator("//server/a/b//d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14191);assertEquals(SEP + SEP + "server" + SEP + "a" + SEP + "b", FilenameUtils.normalizeNoEndSeparator("//server/a/b/././."));
        __CLR4_4_1aouaoukylve1li.R.inc(14192);assertEquals(SEP + SEP + "server" + SEP + "a", FilenameUtils.normalizeNoEndSeparator("//server/./a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14193);assertEquals(SEP + SEP + "server" + SEP + "", FilenameUtils.normalizeNoEndSeparator("//server/./"));
        __CLR4_4_1aouaoukylve1li.R.inc(14194);assertEquals(SEP + SEP + "server" + SEP + "", FilenameUtils.normalizeNoEndSeparator("//server/."));
        __CLR4_4_1aouaoukylve1li.R.inc(14195);assertNull(FilenameUtils.normalizeNoEndSeparator("//server/../a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14196);assertNull(FilenameUtils.normalizeNoEndSeparator("//server/.."));
        __CLR4_4_1aouaoukylve1li.R.inc(14197);assertEquals(SEP + SEP + "server" + SEP + "", FilenameUtils.normalizeNoEndSeparator("//server/"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testNormalizeNoEndSeparatorUnixWin() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18geqb9aye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testNormalizeNoEndSeparatorUnixWin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18geqb9aye(){try{__CLR4_4_1aouaoukylve1li.R.inc(14198);

        // Normalize (Unix Separator)
        __CLR4_4_1aouaoukylve1li.R.inc(14199);assertEquals("/a/c", FilenameUtils.normalizeNoEndSeparator("/a/b/../c/", true));
        __CLR4_4_1aouaoukylve1li.R.inc(14200);assertEquals("/a/c", FilenameUtils.normalizeNoEndSeparator("\\a\\b\\..\\c\\", true));

        // Normalize (Windows Separator)
        __CLR4_4_1aouaoukylve1li.R.inc(14201);assertEquals("\\a\\c", FilenameUtils.normalizeNoEndSeparator("/a/b/../c/", false));
        __CLR4_4_1aouaoukylve1li.R.inc(14202);assertEquals("\\a\\c", FilenameUtils.normalizeNoEndSeparator("\\a\\b\\..\\c\\", false));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testConcat() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11pndpvayj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testConcat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11pndpvayj(){try{__CLR4_4_1aouaoukylve1li.R.inc(14203);
        __CLR4_4_1aouaoukylve1li.R.inc(14204);assertNull(FilenameUtils.concat("", null));
        __CLR4_4_1aouaoukylve1li.R.inc(14205);assertNull(FilenameUtils.concat(null, null));
        __CLR4_4_1aouaoukylve1li.R.inc(14206);assertNull(FilenameUtils.concat(null, ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14207);assertNull(FilenameUtils.concat(null, "a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14208);assertEquals(SEP + "a", FilenameUtils.concat(null, "/a"));

        __CLR4_4_1aouaoukylve1li.R.inc(14209);assertNull(FilenameUtils.concat("", ":")); // invalid prefix
        __CLR4_4_1aouaoukylve1li.R.inc(14210);assertNull(FilenameUtils.concat(":", "")); // invalid prefix

        __CLR4_4_1aouaoukylve1li.R.inc(14211);assertEquals("f" + SEP, FilenameUtils.concat("", "f/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14212);assertEquals("f", FilenameUtils.concat("", "f"));
        __CLR4_4_1aouaoukylve1li.R.inc(14213);assertEquals("a" + SEP + "f" + SEP, FilenameUtils.concat("a/", "f/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14214);assertEquals("a" + SEP + "f", FilenameUtils.concat("a", "f"));
        __CLR4_4_1aouaoukylve1li.R.inc(14215);assertEquals("a" + SEP + "b" + SEP + "f" + SEP, FilenameUtils.concat("a/b/", "f/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14216);assertEquals("a" + SEP + "b" + SEP + "f", FilenameUtils.concat("a/b", "f"));

        __CLR4_4_1aouaoukylve1li.R.inc(14217);assertEquals("a" + SEP + "f" + SEP, FilenameUtils.concat("a/b/", "../f/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14218);assertEquals("a" + SEP + "f", FilenameUtils.concat("a/b", "../f"));
        __CLR4_4_1aouaoukylve1li.R.inc(14219);assertEquals("a" + SEP + "c" + SEP + "g" + SEP, FilenameUtils.concat("a/b/../c/", "f/../g/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14220);assertEquals("a" + SEP + "c" + SEP + "g", FilenameUtils.concat("a/b/../c", "f/../g"));

        __CLR4_4_1aouaoukylve1li.R.inc(14221);assertEquals("a" + SEP + "c.txt" + SEP + "f", FilenameUtils.concat("a/c.txt", "f"));

        __CLR4_4_1aouaoukylve1li.R.inc(14222);assertEquals(SEP + "f" + SEP, FilenameUtils.concat("", "/f/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14223);assertEquals(SEP + "f", FilenameUtils.concat("", "/f"));
        __CLR4_4_1aouaoukylve1li.R.inc(14224);assertEquals(SEP + "f" + SEP, FilenameUtils.concat("a/", "/f/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14225);assertEquals(SEP + "f", FilenameUtils.concat("a", "/f"));

        __CLR4_4_1aouaoukylve1li.R.inc(14226);assertEquals(SEP + "c" + SEP + "d", FilenameUtils.concat("a/b/", "/c/d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14227);assertEquals("C:c" + SEP + "d", FilenameUtils.concat("a/b/", "C:c/d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14228);assertEquals("C:" + SEP + "c" + SEP + "d", FilenameUtils.concat("a/b/", "C:/c/d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14229);assertEquals("~" + SEP + "c" + SEP + "d", FilenameUtils.concat("a/b/", "~/c/d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14230);assertEquals("~user" + SEP + "c" + SEP + "d", FilenameUtils.concat("a/b/", "~user/c/d"));
        __CLR4_4_1aouaoukylve1li.R.inc(14231);assertEquals("~" + SEP, FilenameUtils.concat("a/b/", "~"));
        __CLR4_4_1aouaoukylve1li.R.inc(14232);assertEquals("~user" + SEP, FilenameUtils.concat("a/b/", "~user"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testSeparatorsToUnix() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgp5vaazd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testSeparatorsToUnix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgp5vaazd(){try{__CLR4_4_1aouaoukylve1li.R.inc(14233);
        __CLR4_4_1aouaoukylve1li.R.inc(14234);assertNull(FilenameUtils.separatorsToUnix(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14235);assertEquals("/a/b/c", FilenameUtils.separatorsToUnix("/a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14236);assertEquals("/a/b/c.txt", FilenameUtils.separatorsToUnix("/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14237);assertEquals("/a/b/c", FilenameUtils.separatorsToUnix("/a/b\\c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14238);assertEquals("/a/b/c", FilenameUtils.separatorsToUnix("\\a\\b\\c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14239);assertEquals("D:/a/b/c", FilenameUtils.separatorsToUnix("D:\\a\\b\\c"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testSeparatorsToWindows() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bnij01azk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testSeparatorsToWindows",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bnij01azk(){try{__CLR4_4_1aouaoukylve1li.R.inc(14240);
        __CLR4_4_1aouaoukylve1li.R.inc(14241);assertNull(FilenameUtils.separatorsToWindows(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14242);assertEquals("\\a\\b\\c", FilenameUtils.separatorsToWindows("\\a\\b\\c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14243);assertEquals("\\a\\b\\c.txt", FilenameUtils.separatorsToWindows("\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14244);assertEquals("\\a\\b\\c", FilenameUtils.separatorsToWindows("\\a\\b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14245);assertEquals("\\a\\b\\c", FilenameUtils.separatorsToWindows("/a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14246);assertEquals("D:\\a\\b\\c", FilenameUtils.separatorsToWindows("D:/a/b/c"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testSeparatorsToSystem() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5m2njazr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testSeparatorsToSystem",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5m2njazr(){try{__CLR4_4_1aouaoukylve1li.R.inc(14247);
        __CLR4_4_1aouaoukylve1li.R.inc(14248);if ((((WINDOWS)&&(__CLR4_4_1aouaoukylve1li.R.iget(14249)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14250)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(14251);assertNull(FilenameUtils.separatorsToSystem(null));
            __CLR4_4_1aouaoukylve1li.R.inc(14252);assertEquals("\\a\\b\\c", FilenameUtils.separatorsToSystem("\\a\\b\\c"));
            __CLR4_4_1aouaoukylve1li.R.inc(14253);assertEquals("\\a\\b\\c.txt", FilenameUtils.separatorsToSystem("\\a\\b\\c.txt"));
            __CLR4_4_1aouaoukylve1li.R.inc(14254);assertEquals("\\a\\b\\c", FilenameUtils.separatorsToSystem("\\a\\b/c"));
            __CLR4_4_1aouaoukylve1li.R.inc(14255);assertEquals("\\a\\b\\c", FilenameUtils.separatorsToSystem("/a/b/c"));
            __CLR4_4_1aouaoukylve1li.R.inc(14256);assertEquals("D:\\a\\b\\c", FilenameUtils.separatorsToSystem("D:/a/b/c"));
        } }else {{
            __CLR4_4_1aouaoukylve1li.R.inc(14257);assertNull(FilenameUtils.separatorsToSystem(null));
            __CLR4_4_1aouaoukylve1li.R.inc(14258);assertEquals("/a/b/c", FilenameUtils.separatorsToSystem("/a/b/c"));
            __CLR4_4_1aouaoukylve1li.R.inc(14259);assertEquals("/a/b/c.txt", FilenameUtils.separatorsToSystem("/a/b/c.txt"));
            __CLR4_4_1aouaoukylve1li.R.inc(14260);assertEquals("/a/b/c", FilenameUtils.separatorsToSystem("/a/b\\c"));
            __CLR4_4_1aouaoukylve1li.R.inc(14261);assertEquals("/a/b/c", FilenameUtils.separatorsToSystem("\\a\\b\\c"));
            __CLR4_4_1aouaoukylve1li.R.inc(14262);assertEquals("D:/a/b/c", FilenameUtils.separatorsToSystem("D:\\a\\b\\c"));
        }
    }}finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetPrefixLength() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bj6hr7b07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetPrefixLength",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bj6hr7b07(){try{__CLR4_4_1aouaoukylve1li.R.inc(14263);
        __CLR4_4_1aouaoukylve1li.R.inc(14264);assertEquals(-1, FilenameUtils.getPrefixLength(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14265);assertEquals(-1, FilenameUtils.getPrefixLength(":"));
        __CLR4_4_1aouaoukylve1li.R.inc(14266);assertEquals(-1, FilenameUtils.getPrefixLength("1:\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14267);assertEquals(-1, FilenameUtils.getPrefixLength("1:"));
        __CLR4_4_1aouaoukylve1li.R.inc(14268);assertEquals(-1, FilenameUtils.getPrefixLength("1:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14269);assertEquals(-1, FilenameUtils.getPrefixLength("\\\\\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14270);assertEquals(-1, FilenameUtils.getPrefixLength("\\\\a"));

        __CLR4_4_1aouaoukylve1li.R.inc(14271);assertEquals(0, FilenameUtils.getPrefixLength(""));
        __CLR4_4_1aouaoukylve1li.R.inc(14272);assertEquals(1, FilenameUtils.getPrefixLength("\\"));

        __CLR4_4_1aouaoukylve1li.R.inc(14273);if ((((SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_1aouaoukylve1li.R.iget(14274)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14275)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(14276);assertEquals(2, FilenameUtils.getPrefixLength("C:"));
        }
        }__CLR4_4_1aouaoukylve1li.R.inc(14277);if ((((SystemUtils.IS_OS_LINUX)&&(__CLR4_4_1aouaoukylve1li.R.iget(14278)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14279)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(14280);assertEquals(0, FilenameUtils.getPrefixLength("C:"));
        }

        }__CLR4_4_1aouaoukylve1li.R.inc(14281);assertEquals(3, FilenameUtils.getPrefixLength("C:\\"));
        __CLR4_4_1aouaoukylve1li.R.inc(14282);assertEquals(9, FilenameUtils.getPrefixLength("//server/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14283);assertEquals(2, FilenameUtils.getPrefixLength("~"));
        __CLR4_4_1aouaoukylve1li.R.inc(14284);assertEquals(2, FilenameUtils.getPrefixLength("~/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14285);assertEquals(6, FilenameUtils.getPrefixLength("~user"));
        __CLR4_4_1aouaoukylve1li.R.inc(14286);assertEquals(6, FilenameUtils.getPrefixLength("~user/"));

        __CLR4_4_1aouaoukylve1li.R.inc(14287);assertEquals(0, FilenameUtils.getPrefixLength("a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14288);assertEquals(1, FilenameUtils.getPrefixLength("\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14289);assertEquals(2, FilenameUtils.getPrefixLength("C:a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14290);assertEquals(3, FilenameUtils.getPrefixLength("C:\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14291);assertEquals(9, FilenameUtils.getPrefixLength("\\\\server\\a\\b\\c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14292);assertEquals(0, FilenameUtils.getPrefixLength("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14293);assertEquals(1, FilenameUtils.getPrefixLength("/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14294);assertEquals(3, FilenameUtils.getPrefixLength("C:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14295);assertEquals(9, FilenameUtils.getPrefixLength("//server/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14296);assertEquals(2, FilenameUtils.getPrefixLength("~/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14297);assertEquals(6, FilenameUtils.getPrefixLength("~user/a/b/c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14298);assertEquals(0, FilenameUtils.getPrefixLength("a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14299);assertEquals(1, FilenameUtils.getPrefixLength("\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14300);assertEquals(2, FilenameUtils.getPrefixLength("~\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14301);assertEquals(6, FilenameUtils.getPrefixLength("~user\\a\\b\\c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14302);assertEquals(9, FilenameUtils.getPrefixLength("//server/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14303);assertEquals(-1, FilenameUtils.getPrefixLength("\\\\\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14304);assertEquals(-1, FilenameUtils.getPrefixLength("///a/b/c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14305);assertEquals(1, FilenameUtils.getPrefixLength("/:foo"));
        __CLR4_4_1aouaoukylve1li.R.inc(14306);assertEquals(1, FilenameUtils.getPrefixLength("/:/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14307);assertEquals(1, FilenameUtils.getPrefixLength("/:::::::.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14308);assertEquals(12, FilenameUtils.getPrefixLength("\\\\127.0.0.1\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14309);assertEquals(6, FilenameUtils.getPrefixLength("\\\\::1\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14310);assertEquals(21, FilenameUtils.getPrefixLength("\\\\server.example.org\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14311);assertEquals(10, FilenameUtils.getPrefixLength("\\\\server.\\a\\b\\c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14312);assertEquals(-1, FilenameUtils.getPrefixLength("\\\\-server\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14313);assertEquals(-1, FilenameUtils.getPrefixLength("\\\\.\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14314);assertEquals(-1, FilenameUtils.getPrefixLength("\\\\..\\a\\b\\c.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testIndexOfLastSeparator() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12w1dsvb1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testIndexOfLastSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12w1dsvb1n(){try{__CLR4_4_1aouaoukylve1li.R.inc(14315);
        __CLR4_4_1aouaoukylve1li.R.inc(14316);assertEquals(-1, FilenameUtils.indexOfLastSeparator(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14317);assertEquals(-1, FilenameUtils.indexOfLastSeparator("noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14318);assertEquals(3, FilenameUtils.indexOfLastSeparator("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14319);assertEquals(3, FilenameUtils.indexOfLastSeparator("a\\b\\c"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testIndexOfExtension() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmho1bb1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testIndexOfExtension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmho1bb1s(){try{__CLR4_4_1aouaoukylve1li.R.inc(14320);
        __CLR4_4_1aouaoukylve1li.R.inc(14321);assertEquals(-1, FilenameUtils.indexOfExtension(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14322);assertEquals(-1, FilenameUtils.indexOfExtension("file"));
        __CLR4_4_1aouaoukylve1li.R.inc(14323);assertEquals(4, FilenameUtils.indexOfExtension("file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14324);assertEquals(13, FilenameUtils.indexOfExtension("a.txt/b.txt/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14325);assertEquals(-1, FilenameUtils.indexOfExtension("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14326);assertEquals(-1, FilenameUtils.indexOfExtension("a\\b\\c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14327);assertEquals(-1, FilenameUtils.indexOfExtension("a/b.notextension/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14328);assertEquals(-1, FilenameUtils.indexOfExtension("a\\b.notextension\\c"));

        __CLR4_4_1aouaoukylve1li.R.inc(14329);if ((((FilenameUtils.isSystemWindows())&&(__CLR4_4_1aouaoukylve1li.R.iget(14330)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14331)==0&false))) {{
            // Special case handling for NTFS ADS names
        	__CLR4_4_1aouaoukylve1li.R.inc(14332);try {
        		__CLR4_4_1aouaoukylve1li.R.inc(14333);FilenameUtils.indexOfExtension("foo.exe:bar.txt");
        		__CLR4_4_1aouaoukylve1li.R.inc(14334);throw new AssertionError("Expected Exception");
        	} catch (final IllegalArgumentException e) {
        		__CLR4_4_1aouaoukylve1li.R.inc(14335);assertEquals("NTFS ADS separator (':') in file name is forbidden.", e.getMessage());
        	}
        } }else {{
        	// Upwards compatibility on other systems
        	__CLR4_4_1aouaoukylve1li.R.inc(14336);assertEquals(11, FilenameUtils.indexOfExtension("foo.exe:bar.txt"));
        }

    }}finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetPrefix() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146f3q5b29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146f3q5b29(){try{__CLR4_4_1aouaoukylve1li.R.inc(14337);
        __CLR4_4_1aouaoukylve1li.R.inc(14338);assertNull(FilenameUtils.getPrefix(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14339);assertNull(FilenameUtils.getPrefix(":"));
        __CLR4_4_1aouaoukylve1li.R.inc(14340);assertNull(FilenameUtils.getPrefix("1:\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14341);assertNull(FilenameUtils.getPrefix("1:"));
        __CLR4_4_1aouaoukylve1li.R.inc(14342);assertNull(FilenameUtils.getPrefix("1:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14343);assertNull(FilenameUtils.getPrefix("\\\\\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14344);assertNull(FilenameUtils.getPrefix("\\\\a"));

        __CLR4_4_1aouaoukylve1li.R.inc(14345);assertEquals("", FilenameUtils.getPrefix(""));
        __CLR4_4_1aouaoukylve1li.R.inc(14346);assertEquals("\\", FilenameUtils.getPrefix("\\"));

        __CLR4_4_1aouaoukylve1li.R.inc(14347);if ((((SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_1aouaoukylve1li.R.iget(14348)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14349)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(14350);assertEquals("C:", FilenameUtils.getPrefix("C:"));
        }
        }__CLR4_4_1aouaoukylve1li.R.inc(14351);if ((((SystemUtils.IS_OS_LINUX)&&(__CLR4_4_1aouaoukylve1li.R.iget(14352)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14353)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(14354);assertEquals("", FilenameUtils.getPrefix("C:"));
        }

        }__CLR4_4_1aouaoukylve1li.R.inc(14355);assertEquals("C:\\", FilenameUtils.getPrefix("C:\\"));
        __CLR4_4_1aouaoukylve1li.R.inc(14356);assertEquals("//server/", FilenameUtils.getPrefix("//server/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14357);assertEquals("~/", FilenameUtils.getPrefix("~"));
        __CLR4_4_1aouaoukylve1li.R.inc(14358);assertEquals("~/", FilenameUtils.getPrefix("~/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14359);assertEquals("~user/", FilenameUtils.getPrefix("~user"));
        __CLR4_4_1aouaoukylve1li.R.inc(14360);assertEquals("~user/", FilenameUtils.getPrefix("~user/"));

        __CLR4_4_1aouaoukylve1li.R.inc(14361);assertEquals("", FilenameUtils.getPrefix("a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14362);assertEquals("\\", FilenameUtils.getPrefix("\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14363);assertEquals("C:\\", FilenameUtils.getPrefix("C:\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14364);assertEquals("\\\\server\\", FilenameUtils.getPrefix("\\\\server\\a\\b\\c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14365);assertEquals("", FilenameUtils.getPrefix("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14366);assertEquals("/", FilenameUtils.getPrefix("/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14367);assertEquals("C:/", FilenameUtils.getPrefix("C:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14368);assertEquals("//server/", FilenameUtils.getPrefix("//server/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14369);assertEquals("~/", FilenameUtils.getPrefix("~/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14370);assertEquals("~user/", FilenameUtils.getPrefix("~user/a/b/c.txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14371);assertEquals("", FilenameUtils.getPrefix("a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14372);assertEquals("\\", FilenameUtils.getPrefix("\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14373);assertEquals("~\\", FilenameUtils.getPrefix("~\\a\\b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14374);assertEquals("~user\\", FilenameUtils.getPrefix("~user\\a\\b\\c.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetPrefix_with_nullbyte() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19nnwyib3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetPrefix_with_nullbyte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19nnwyib3b(){try{__CLR4_4_1aouaoukylve1li.R.inc(14375);
        __CLR4_4_1aouaoukylve1li.R.inc(14376);try {
            __CLR4_4_1aouaoukylve1li.R.inc(14377);assertEquals("~user\\", FilenameUtils.getPrefix("~u\u0000ser\\a\\b\\c.txt"));
        } catch (final IllegalArgumentException ignore) {

        }
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetPath() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jx0ylsb3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetPath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jx0ylsb3e(){try{__CLR4_4_1aouaoukylve1li.R.inc(14378);
        __CLR4_4_1aouaoukylve1li.R.inc(14379);assertNull(FilenameUtils.getPath(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14380);assertEquals("", FilenameUtils.getPath("noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14381);assertEquals("", FilenameUtils.getPath("/noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14382);assertEquals("", FilenameUtils.getPath("\\noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14383);assertEquals("a/b/", FilenameUtils.getPath("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14384);assertEquals("a/b/", FilenameUtils.getPath("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14385);assertEquals("a/b/c/", FilenameUtils.getPath("a/b/c/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14386);assertEquals("a\\b\\", FilenameUtils.getPath("a\\b\\c"));

        __CLR4_4_1aouaoukylve1li.R.inc(14387);assertNull(FilenameUtils.getPath(":"));
        __CLR4_4_1aouaoukylve1li.R.inc(14388);assertNull(FilenameUtils.getPath("1:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14389);assertNull(FilenameUtils.getPath("1:"));
        __CLR4_4_1aouaoukylve1li.R.inc(14390);assertNull(FilenameUtils.getPath("1:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14391);assertNull(FilenameUtils.getPath("///a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14392);assertNull(FilenameUtils.getPath("//a"));

        __CLR4_4_1aouaoukylve1li.R.inc(14393);assertEquals("", FilenameUtils.getPath(""));
        __CLR4_4_1aouaoukylve1li.R.inc(14394);assertEquals("", FilenameUtils.getPath("C:"));
        __CLR4_4_1aouaoukylve1li.R.inc(14395);assertEquals("", FilenameUtils.getPath("C:/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14396);assertEquals("", FilenameUtils.getPath("//server/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14397);assertEquals("", FilenameUtils.getPath("~"));
        __CLR4_4_1aouaoukylve1li.R.inc(14398);assertEquals("", FilenameUtils.getPath("~/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14399);assertEquals("", FilenameUtils.getPath("~user"));
        __CLR4_4_1aouaoukylve1li.R.inc(14400);assertEquals("", FilenameUtils.getPath("~user/"));

        __CLR4_4_1aouaoukylve1li.R.inc(14401);assertEquals("a/b/", FilenameUtils.getPath("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14402);assertEquals("a/b/", FilenameUtils.getPath("/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14403);assertEquals("", FilenameUtils.getPath("C:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14404);assertEquals("a/b/", FilenameUtils.getPath("C:a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14405);assertEquals("a/b/", FilenameUtils.getPath("C:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14406);assertEquals("a/b/", FilenameUtils.getPath("//server/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14407);assertEquals("a/b/", FilenameUtils.getPath("~/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14408);assertEquals("a/b/", FilenameUtils.getPath("~user/a/b/c.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetPath_with_nullbyte() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jff909b49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetPath_with_nullbyte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jff909b49(){try{__CLR4_4_1aouaoukylve1li.R.inc(14409);
        __CLR4_4_1aouaoukylve1li.R.inc(14410);assertThrows(IllegalArgumentException.class, () -> FilenameUtils.getPath("~user/a/\u0000b/c.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}


    @Test
    public void testGetPathNoEndSeparator() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9fssbb4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetPathNoEndSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9fssbb4b(){try{__CLR4_4_1aouaoukylve1li.R.inc(14411);
        __CLR4_4_1aouaoukylve1li.R.inc(14412);assertNull(FilenameUtils.getPath(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14413);assertEquals("", FilenameUtils.getPath("noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14414);assertEquals("", FilenameUtils.getPathNoEndSeparator("/noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14415);assertEquals("", FilenameUtils.getPathNoEndSeparator("\\noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14416);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14417);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14418);assertEquals("a/b/c", FilenameUtils.getPathNoEndSeparator("a/b/c/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14419);assertEquals("a\\b", FilenameUtils.getPathNoEndSeparator("a\\b\\c"));

        __CLR4_4_1aouaoukylve1li.R.inc(14420);assertNull(FilenameUtils.getPathNoEndSeparator(":"));
        __CLR4_4_1aouaoukylve1li.R.inc(14421);assertNull(FilenameUtils.getPathNoEndSeparator("1:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14422);assertNull(FilenameUtils.getPathNoEndSeparator("1:"));
        __CLR4_4_1aouaoukylve1li.R.inc(14423);assertNull(FilenameUtils.getPathNoEndSeparator("1:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14424);assertNull(FilenameUtils.getPathNoEndSeparator("///a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14425);assertNull(FilenameUtils.getPathNoEndSeparator("//a"));

        __CLR4_4_1aouaoukylve1li.R.inc(14426);assertEquals("", FilenameUtils.getPathNoEndSeparator(""));
        __CLR4_4_1aouaoukylve1li.R.inc(14427);assertEquals("", FilenameUtils.getPathNoEndSeparator("C:"));
        __CLR4_4_1aouaoukylve1li.R.inc(14428);assertEquals("", FilenameUtils.getPathNoEndSeparator("C:/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14429);assertEquals("", FilenameUtils.getPathNoEndSeparator("//server/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14430);assertEquals("", FilenameUtils.getPathNoEndSeparator("~"));
        __CLR4_4_1aouaoukylve1li.R.inc(14431);assertEquals("", FilenameUtils.getPathNoEndSeparator("~/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14432);assertEquals("", FilenameUtils.getPathNoEndSeparator("~user"));
        __CLR4_4_1aouaoukylve1li.R.inc(14433);assertEquals("", FilenameUtils.getPathNoEndSeparator("~user/"));

        __CLR4_4_1aouaoukylve1li.R.inc(14434);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14435);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14436);assertEquals("", FilenameUtils.getPathNoEndSeparator("C:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14437);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("C:a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14438);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("C:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14439);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("//server/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14440);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("~/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14441);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("~user/a/b/c.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetPathNoEndSeparator_with_null_byte() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jqonztb56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetPathNoEndSeparator_with_null_byte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jqonztb56(){try{__CLR4_4_1aouaoukylve1li.R.inc(14442);
        __CLR4_4_1aouaoukylve1li.R.inc(14443);try {
            __CLR4_4_1aouaoukylve1li.R.inc(14444);assertEquals("a/b", FilenameUtils.getPathNoEndSeparator("~user/a\u0000/b/c.txt"));
        } catch (final IllegalArgumentException ignore) {

        }
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetFullPath() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q64jxdb59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetFullPath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q64jxdb59(){try{__CLR4_4_1aouaoukylve1li.R.inc(14445);
        __CLR4_4_1aouaoukylve1li.R.inc(14446);assertNull(FilenameUtils.getFullPath(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14447);assertEquals("", FilenameUtils.getFullPath("noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14448);assertEquals("a/b/", FilenameUtils.getFullPath("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14449);assertEquals("a/b/", FilenameUtils.getFullPath("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14450);assertEquals("a/b/c/", FilenameUtils.getFullPath("a/b/c/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14451);assertEquals("a\\b\\", FilenameUtils.getFullPath("a\\b\\c"));

        __CLR4_4_1aouaoukylve1li.R.inc(14452);assertNull(FilenameUtils.getFullPath(":"));
        __CLR4_4_1aouaoukylve1li.R.inc(14453);assertNull(FilenameUtils.getFullPath("1:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14454);assertNull(FilenameUtils.getFullPath("1:"));
        __CLR4_4_1aouaoukylve1li.R.inc(14455);assertNull(FilenameUtils.getFullPath("1:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14456);assertNull(FilenameUtils.getFullPath("///a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14457);assertNull(FilenameUtils.getFullPath("//a"));

        __CLR4_4_1aouaoukylve1li.R.inc(14458);assertEquals("", FilenameUtils.getFullPath(""));

        __CLR4_4_1aouaoukylve1li.R.inc(14459);if ((((SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_1aouaoukylve1li.R.iget(14460)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14461)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(14462);assertEquals("C:", FilenameUtils.getFullPath("C:"));
        }
        }__CLR4_4_1aouaoukylve1li.R.inc(14463);if ((((SystemUtils.IS_OS_LINUX)&&(__CLR4_4_1aouaoukylve1li.R.iget(14464)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14465)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(14466);assertEquals("", FilenameUtils.getFullPath("C:"));
        }

        }__CLR4_4_1aouaoukylve1li.R.inc(14467);assertEquals("C:/", FilenameUtils.getFullPath("C:/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14468);assertEquals("//server/", FilenameUtils.getFullPath("//server/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14469);assertEquals("~/", FilenameUtils.getFullPath("~"));
        __CLR4_4_1aouaoukylve1li.R.inc(14470);assertEquals("~/", FilenameUtils.getFullPath("~/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14471);assertEquals("~user/", FilenameUtils.getFullPath("~user"));
        __CLR4_4_1aouaoukylve1li.R.inc(14472);assertEquals("~user/", FilenameUtils.getFullPath("~user/"));

        __CLR4_4_1aouaoukylve1li.R.inc(14473);assertEquals("a/b/", FilenameUtils.getFullPath("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14474);assertEquals("/a/b/", FilenameUtils.getFullPath("/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14475);assertEquals("C:", FilenameUtils.getFullPath("C:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14476);assertEquals("C:a/b/", FilenameUtils.getFullPath("C:a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14477);assertEquals("C:/a/b/", FilenameUtils.getFullPath("C:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14478);assertEquals("//server/a/b/", FilenameUtils.getFullPath("//server/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14479);assertEquals("~/a/b/", FilenameUtils.getFullPath("~/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14480);assertEquals("~user/a/b/", FilenameUtils.getFullPath("~user/a/b/c.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetFullPathNoEndSeparator() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggz1yb69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetFullPathNoEndSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggz1yb69(){try{__CLR4_4_1aouaoukylve1li.R.inc(14481);
        __CLR4_4_1aouaoukylve1li.R.inc(14482);assertNull(FilenameUtils.getFullPathNoEndSeparator(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14483);assertEquals("", FilenameUtils.getFullPathNoEndSeparator("noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14484);assertEquals("a/b", FilenameUtils.getFullPathNoEndSeparator("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14485);assertEquals("a/b", FilenameUtils.getFullPathNoEndSeparator("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14486);assertEquals("a/b/c", FilenameUtils.getFullPathNoEndSeparator("a/b/c/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14487);assertEquals("a\\b", FilenameUtils.getFullPathNoEndSeparator("a\\b\\c"));

        __CLR4_4_1aouaoukylve1li.R.inc(14488);assertNull(FilenameUtils.getFullPathNoEndSeparator(":"));
        __CLR4_4_1aouaoukylve1li.R.inc(14489);assertNull(FilenameUtils.getFullPathNoEndSeparator("1:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14490);assertNull(FilenameUtils.getFullPathNoEndSeparator("1:"));
        __CLR4_4_1aouaoukylve1li.R.inc(14491);assertNull(FilenameUtils.getFullPathNoEndSeparator("1:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14492);assertNull(FilenameUtils.getFullPathNoEndSeparator("///a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14493);assertNull(FilenameUtils.getFullPathNoEndSeparator("//a"));

        __CLR4_4_1aouaoukylve1li.R.inc(14494);assertEquals("", FilenameUtils.getFullPathNoEndSeparator(""));

        __CLR4_4_1aouaoukylve1li.R.inc(14495);if ((((SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_1aouaoukylve1li.R.iget(14496)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14497)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(14498);assertEquals("C:", FilenameUtils.getFullPathNoEndSeparator("C:"));
        }
        }__CLR4_4_1aouaoukylve1li.R.inc(14499);if ((((SystemUtils.IS_OS_LINUX)&&(__CLR4_4_1aouaoukylve1li.R.iget(14500)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14501)==0&false))) {{
            __CLR4_4_1aouaoukylve1li.R.inc(14502);assertEquals("", FilenameUtils.getFullPathNoEndSeparator("C:"));
        }

        }__CLR4_4_1aouaoukylve1li.R.inc(14503);assertEquals("C:/", FilenameUtils.getFullPathNoEndSeparator("C:/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14504);assertEquals("//server/", FilenameUtils.getFullPathNoEndSeparator("//server/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14505);assertEquals("~", FilenameUtils.getFullPathNoEndSeparator("~"));
        __CLR4_4_1aouaoukylve1li.R.inc(14506);assertEquals("~/", FilenameUtils.getFullPathNoEndSeparator("~/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14507);assertEquals("~user", FilenameUtils.getFullPathNoEndSeparator("~user"));
        __CLR4_4_1aouaoukylve1li.R.inc(14508);assertEquals("~user/", FilenameUtils.getFullPathNoEndSeparator("~user/"));

        __CLR4_4_1aouaoukylve1li.R.inc(14509);assertEquals("a/b", FilenameUtils.getFullPathNoEndSeparator("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14510);assertEquals("/a/b", FilenameUtils.getFullPathNoEndSeparator("/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14511);assertEquals("C:", FilenameUtils.getFullPathNoEndSeparator("C:a"));
        __CLR4_4_1aouaoukylve1li.R.inc(14512);assertEquals("C:a/b", FilenameUtils.getFullPathNoEndSeparator("C:a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14513);assertEquals("C:/a/b", FilenameUtils.getFullPathNoEndSeparator("C:/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14514);assertEquals("//server/a/b", FilenameUtils.getFullPathNoEndSeparator("//server/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14515);assertEquals("~/a/b", FilenameUtils.getFullPathNoEndSeparator("~/a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14516);assertEquals("~user/a/b", FilenameUtils.getFullPathNoEndSeparator("~user/a/b/c.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    /**
     * Test for https://issues.apache.org/jira/browse/IO-248
     */
    @Test
    public void testGetFullPathNoEndSeparator_IO_248() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gqt5sb79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetFullPathNoEndSeparator_IO_248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gqt5sb79(){try{__CLR4_4_1aouaoukylve1li.R.inc(14517);

        // Test single separator
        __CLR4_4_1aouaoukylve1li.R.inc(14518);assertEquals("/", FilenameUtils.getFullPathNoEndSeparator("/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14519);assertEquals("\\", FilenameUtils.getFullPathNoEndSeparator("\\"));

        // Test one level directory
        __CLR4_4_1aouaoukylve1li.R.inc(14520);assertEquals("/", FilenameUtils.getFullPathNoEndSeparator("/abc"));
        __CLR4_4_1aouaoukylve1li.R.inc(14521);assertEquals("\\", FilenameUtils.getFullPathNoEndSeparator("\\abc"));

        // Test one level directory
        __CLR4_4_1aouaoukylve1li.R.inc(14522);assertEquals("/abc", FilenameUtils.getFullPathNoEndSeparator("/abc/xyz"));
        __CLR4_4_1aouaoukylve1li.R.inc(14523);assertEquals("\\abc", FilenameUtils.getFullPathNoEndSeparator("\\abc\\xyz"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetName() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yb2b9mb7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yb2b9mb7g(){try{__CLR4_4_1aouaoukylve1li.R.inc(14524);
        __CLR4_4_1aouaoukylve1li.R.inc(14525);assertNull(FilenameUtils.getName(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14526);assertEquals("noseperator.inthispath", FilenameUtils.getName("noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14527);assertEquals("c.txt", FilenameUtils.getName("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14528);assertEquals("c", FilenameUtils.getName("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14529);assertEquals("", FilenameUtils.getName("a/b/c/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14530);assertEquals("c", FilenameUtils.getName("a\\b\\c"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testInjectionFailure() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bk952sb7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testInjectionFailure",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bk952sb7n(){try{__CLR4_4_1aouaoukylve1li.R.inc(14531);
        __CLR4_4_1aouaoukylve1li.R.inc(14532);try {
            __CLR4_4_1aouaoukylve1li.R.inc(14533);assertEquals("c", FilenameUtils.getName("a\\b\\\u0000c"));
        } catch (final IllegalArgumentException ignore) {

        }
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetBaseName() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1278vk7b7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetBaseName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1278vk7b7q(){try{__CLR4_4_1aouaoukylve1li.R.inc(14534);
        __CLR4_4_1aouaoukylve1li.R.inc(14535);assertNull(FilenameUtils.getBaseName(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14536);assertEquals("noseperator", FilenameUtils.getBaseName("noseperator.inthispath"));
        __CLR4_4_1aouaoukylve1li.R.inc(14537);assertEquals("c", FilenameUtils.getBaseName("a/b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14538);assertEquals("c", FilenameUtils.getBaseName("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14539);assertEquals("", FilenameUtils.getBaseName("a/b/c/"));
        __CLR4_4_1aouaoukylve1li.R.inc(14540);assertEquals("c", FilenameUtils.getBaseName("a\\b\\c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14541);assertEquals("file.txt", FilenameUtils.getBaseName("file.txt.bak"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetBaseName_with_nullByte() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5fhsgb7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetBaseName_with_nullByte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5fhsgb7y(){try{__CLR4_4_1aouaoukylve1li.R.inc(14542);
        __CLR4_4_1aouaoukylve1li.R.inc(14543);try {
            __CLR4_4_1aouaoukylve1li.R.inc(14544);assertEquals("file.txt", FilenameUtils.getBaseName("fil\u0000e.txt.bak"));
        } catch (final IllegalArgumentException ignore) {

        }
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testGetExtension() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ckmaleb81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testGetExtension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ckmaleb81(){try{__CLR4_4_1aouaoukylve1li.R.inc(14545);
        __CLR4_4_1aouaoukylve1li.R.inc(14546);assertNull(FilenameUtils.getExtension(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14547);assertEquals("ext", FilenameUtils.getExtension("file.ext"));
        __CLR4_4_1aouaoukylve1li.R.inc(14548);assertEquals("", FilenameUtils.getExtension("README"));
        __CLR4_4_1aouaoukylve1li.R.inc(14549);assertEquals("com", FilenameUtils.getExtension("domain.dot.com"));
        __CLR4_4_1aouaoukylve1li.R.inc(14550);assertEquals("jpeg", FilenameUtils.getExtension("image.jpeg"));
        __CLR4_4_1aouaoukylve1li.R.inc(14551);assertEquals("", FilenameUtils.getExtension("a.b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14552);assertEquals("txt", FilenameUtils.getExtension("a.b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14553);assertEquals("", FilenameUtils.getExtension("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14554);assertEquals("", FilenameUtils.getExtension("a.b\\c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14555);assertEquals("txt", FilenameUtils.getExtension("a.b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14556);assertEquals("", FilenameUtils.getExtension("a\\b\\c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14557);assertEquals("", FilenameUtils.getExtension("C:\\temp\\foo.bar\\README"));
        __CLR4_4_1aouaoukylve1li.R.inc(14558);assertEquals("ext", FilenameUtils.getExtension("../filename.ext"));

        __CLR4_4_1aouaoukylve1li.R.inc(14559);if ((((FilenameUtils.isSystemWindows())&&(__CLR4_4_1aouaoukylve1li.R.iget(14560)!=0|true))||(__CLR4_4_1aouaoukylve1li.R.iget(14561)==0&false))) {{
            // Special case handling for NTFS ADS names
        	__CLR4_4_1aouaoukylve1li.R.inc(14562);try {
        		__CLR4_4_1aouaoukylve1li.R.inc(14563);FilenameUtils.getExtension("foo.exe:bar.txt");
        		__CLR4_4_1aouaoukylve1li.R.inc(14564);throw new AssertionError("Expected Exception");
        	} catch (final IllegalArgumentException e) {
        		__CLR4_4_1aouaoukylve1li.R.inc(14565);assertEquals("NTFS ADS separator (':') in file name is forbidden.", e.getMessage());
        	}
        } }else {{
        	// Upwards compatibility:
        	__CLR4_4_1aouaoukylve1li.R.inc(14566);assertEquals("txt", FilenameUtils.getExtension("foo.exe:bar.txt"));
        }
    }}finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testRemoveExtension() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hj75iob8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testRemoveExtension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hj75iob8n(){try{__CLR4_4_1aouaoukylve1li.R.inc(14567);
        __CLR4_4_1aouaoukylve1li.R.inc(14568);assertNull(FilenameUtils.removeExtension(null));
        __CLR4_4_1aouaoukylve1li.R.inc(14569);assertEquals("file", FilenameUtils.removeExtension("file.ext"));
        __CLR4_4_1aouaoukylve1li.R.inc(14570);assertEquals("README", FilenameUtils.removeExtension("README"));
        __CLR4_4_1aouaoukylve1li.R.inc(14571);assertEquals("domain.dot", FilenameUtils.removeExtension("domain.dot.com"));
        __CLR4_4_1aouaoukylve1li.R.inc(14572);assertEquals("image", FilenameUtils.removeExtension("image.jpeg"));
        __CLR4_4_1aouaoukylve1li.R.inc(14573);assertEquals("a.b/c", FilenameUtils.removeExtension("a.b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14574);assertEquals("a.b/c", FilenameUtils.removeExtension("a.b/c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14575);assertEquals("a/b/c", FilenameUtils.removeExtension("a/b/c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14576);assertEquals("a.b\\c", FilenameUtils.removeExtension("a.b\\c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14577);assertEquals("a.b\\c", FilenameUtils.removeExtension("a.b\\c.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14578);assertEquals("a\\b\\c", FilenameUtils.removeExtension("a\\b\\c"));
        __CLR4_4_1aouaoukylve1li.R.inc(14579);assertEquals("C:\\temp\\foo.bar\\README", FilenameUtils.removeExtension("C:\\temp\\foo.bar\\README"));
        __CLR4_4_1aouaoukylve1li.R.inc(14580);assertEquals("../filename", FilenameUtils.removeExtension("../filename.ext"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e608b91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e608b91(){try{__CLR4_4_1aouaoukylve1li.R.inc(14581);
        __CLR4_4_1aouaoukylve1li.R.inc(14582);assertTrue(FilenameUtils.equals(null, null));
        __CLR4_4_1aouaoukylve1li.R.inc(14583);assertFalse(FilenameUtils.equals(null, ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14584);assertFalse(FilenameUtils.equals("", null));
        __CLR4_4_1aouaoukylve1li.R.inc(14585);assertTrue(FilenameUtils.equals("", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14586);assertTrue(FilenameUtils.equals("file.txt", "file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14587);assertFalse(FilenameUtils.equals("file.txt", "FILE.TXT"));
        __CLR4_4_1aouaoukylve1li.R.inc(14588);assertFalse(FilenameUtils.equals("a\\b\\file.txt", "a/b/file.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testEqualsOnSystem() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1acs8eyb99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testEqualsOnSystem",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1acs8eyb99(){try{__CLR4_4_1aouaoukylve1li.R.inc(14589);
        __CLR4_4_1aouaoukylve1li.R.inc(14590);assertTrue(FilenameUtils.equalsOnSystem(null, null));
        __CLR4_4_1aouaoukylve1li.R.inc(14591);assertFalse(FilenameUtils.equalsOnSystem(null, ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14592);assertFalse(FilenameUtils.equalsOnSystem("", null));
        __CLR4_4_1aouaoukylve1li.R.inc(14593);assertTrue(FilenameUtils.equalsOnSystem("", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14594);assertTrue(FilenameUtils.equalsOnSystem("file.txt", "file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14595);assertEquals(WINDOWS, FilenameUtils.equalsOnSystem("file.txt", "FILE.TXT"));
        __CLR4_4_1aouaoukylve1li.R.inc(14596);assertFalse(FilenameUtils.equalsOnSystem("a\\b\\file.txt", "a/b/file.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testEqualsNormalized() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qceepb9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testEqualsNormalized",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qceepb9h(){try{__CLR4_4_1aouaoukylve1li.R.inc(14597);
        __CLR4_4_1aouaoukylve1li.R.inc(14598);assertTrue(FilenameUtils.equalsNormalized(null, null));
        __CLR4_4_1aouaoukylve1li.R.inc(14599);assertFalse(FilenameUtils.equalsNormalized(null, ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14600);assertFalse(FilenameUtils.equalsNormalized("", null));
        __CLR4_4_1aouaoukylve1li.R.inc(14601);assertTrue(FilenameUtils.equalsNormalized("", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14602);assertTrue(FilenameUtils.equalsNormalized("file.txt", "file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14603);assertFalse(FilenameUtils.equalsNormalized("file.txt", "FILE.TXT"));
        __CLR4_4_1aouaoukylve1li.R.inc(14604);assertTrue(FilenameUtils.equalsNormalized("a\\b\\file.txt", "a/b/file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14605);assertFalse(FilenameUtils.equalsNormalized("a/b/", "a/b"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testEqualsNormalizedOnSystem() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebezq5b9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testEqualsNormalizedOnSystem",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebezq5b9q(){try{__CLR4_4_1aouaoukylve1li.R.inc(14606);
        __CLR4_4_1aouaoukylve1li.R.inc(14607);assertTrue(FilenameUtils.equalsNormalizedOnSystem(null, null));
        __CLR4_4_1aouaoukylve1li.R.inc(14608);assertFalse(FilenameUtils.equalsNormalizedOnSystem(null, ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14609);assertFalse(FilenameUtils.equalsNormalizedOnSystem("", null));
        __CLR4_4_1aouaoukylve1li.R.inc(14610);assertTrue(FilenameUtils.equalsNormalizedOnSystem("", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14611);assertTrue(FilenameUtils.equalsNormalizedOnSystem("file.txt", "file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14612);assertEquals(WINDOWS, FilenameUtils.equalsNormalizedOnSystem("file.txt", "FILE.TXT"));
        __CLR4_4_1aouaoukylve1li.R.inc(14613);assertTrue(FilenameUtils.equalsNormalizedOnSystem("a\\b\\file.txt", "a/b/file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14614);assertFalse(FilenameUtils.equalsNormalizedOnSystem("a/b/", "a/b"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    /**
     * Test for https://issues.apache.org/jira/browse/IO-128
     */
    @Test
    public void testEqualsNormalizedError_IO_128() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0jdmkb9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testEqualsNormalizedError_IO_128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0jdmkb9z(){try{__CLR4_4_1aouaoukylve1li.R.inc(14615);
        __CLR4_4_1aouaoukylve1li.R.inc(14616);assertFalse(FilenameUtils.equalsNormalizedOnSystem("//file.txt", "file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14617);assertFalse(FilenameUtils.equalsNormalizedOnSystem("file.txt", "//file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14618);assertFalse(FilenameUtils.equalsNormalizedOnSystem("//file.txt", "//file.txt"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testEquals_fullControl() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6bi2hba3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testEquals_fullControl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6bi2hba3(){try{__CLR4_4_1aouaoukylve1li.R.inc(14619);
        __CLR4_4_1aouaoukylve1li.R.inc(14620);assertFalse(FilenameUtils.equals("file.txt", "FILE.TXT", true, IOCase.SENSITIVE));
        __CLR4_4_1aouaoukylve1li.R.inc(14621);assertTrue(FilenameUtils.equals("file.txt", "FILE.TXT", true, IOCase.INSENSITIVE));
        __CLR4_4_1aouaoukylve1li.R.inc(14622);assertEquals(WINDOWS, FilenameUtils.equals("file.txt", "FILE.TXT", true, IOCase.SYSTEM));
        __CLR4_4_1aouaoukylve1li.R.inc(14623);assertFalse(FilenameUtils.equals("file.txt", "FILE.TXT", true, null));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testIsExtension() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d38wraba8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testIsExtension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d38wraba8(){try{__CLR4_4_1aouaoukylve1li.R.inc(14624);
        __CLR4_4_1aouaoukylve1li.R.inc(14625);assertFalse(FilenameUtils.isExtension(null, (String) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14626);assertFalse(FilenameUtils.isExtension("file.txt", (String) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14627);assertTrue(FilenameUtils.isExtension("file", (String) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14628);assertFalse(FilenameUtils.isExtension("file.txt", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14629);assertTrue(FilenameUtils.isExtension("file", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14630);assertTrue(FilenameUtils.isExtension("file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14631);assertFalse(FilenameUtils.isExtension("file.txt", "rtf"));

        __CLR4_4_1aouaoukylve1li.R.inc(14632);assertFalse(FilenameUtils.isExtension("a/b/file.txt", (String) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14633);assertFalse(FilenameUtils.isExtension("a/b/file.txt", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14634);assertTrue(FilenameUtils.isExtension("a/b/file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14635);assertFalse(FilenameUtils.isExtension("a/b/file.txt", "rtf"));

        __CLR4_4_1aouaoukylve1li.R.inc(14636);assertFalse(FilenameUtils.isExtension("a.b/file.txt", (String) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14637);assertFalse(FilenameUtils.isExtension("a.b/file.txt", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14638);assertTrue(FilenameUtils.isExtension("a.b/file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14639);assertFalse(FilenameUtils.isExtension("a.b/file.txt", "rtf"));

        __CLR4_4_1aouaoukylve1li.R.inc(14640);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt", (String) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14641);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14642);assertTrue(FilenameUtils.isExtension("a\\b\\file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14643);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt", "rtf"));

        __CLR4_4_1aouaoukylve1li.R.inc(14644);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", (String) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14645);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14646);assertTrue(FilenameUtils.isExtension("a.b\\file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14647);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", "rtf"));

        __CLR4_4_1aouaoukylve1li.R.inc(14648);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", "TXT"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testIsExtension_injection() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npkypubax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testIsExtension_injection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npkypubax(){try{__CLR4_4_1aouaoukylve1li.R.inc(14649);
        __CLR4_4_1aouaoukylve1li.R.inc(14650);try {
            __CLR4_4_1aouaoukylve1li.R.inc(14651);FilenameUtils.isExtension("a.b\\fi\u0000le.txt", "TXT");
            __CLR4_4_1aouaoukylve1li.R.inc(14652);fail("Should throw IAE");
        } catch (final IllegalArgumentException ignore) {
        }
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testIsExtensionArray() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhhy8zbb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testIsExtensionArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhhy8zbb1(){try{__CLR4_4_1aouaoukylve1li.R.inc(14653);
        __CLR4_4_1aouaoukylve1li.R.inc(14654);assertFalse(FilenameUtils.isExtension(null, (String[]) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14655);assertFalse(FilenameUtils.isExtension("file.txt", (String[]) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14656);assertTrue(FilenameUtils.isExtension("file", (String[]) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14657);assertFalse(FilenameUtils.isExtension("file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14658);assertTrue(FilenameUtils.isExtension("file.txt", new String[]{"txt"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14659);assertFalse(FilenameUtils.isExtension("file.txt", new String[]{"rtf"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14660);assertTrue(FilenameUtils.isExtension("file", "rtf", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14661);assertTrue(FilenameUtils.isExtension("file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14662);assertFalse(FilenameUtils.isExtension("a/b/file.txt", (String[]) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14663);assertFalse(FilenameUtils.isExtension("a/b/file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14664);assertTrue(FilenameUtils.isExtension("a/b/file.txt", new String[]{"txt"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14665);assertFalse(FilenameUtils.isExtension("a/b/file.txt", new String[]{"rtf"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14666);assertTrue(FilenameUtils.isExtension("a/b/file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14667);assertFalse(FilenameUtils.isExtension("a.b/file.txt", (String[]) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14668);assertFalse(FilenameUtils.isExtension("a.b/file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14669);assertTrue(FilenameUtils.isExtension("a.b/file.txt", new String[]{"txt"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14670);assertFalse(FilenameUtils.isExtension("a.b/file.txt", new String[]{"rtf"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14671);assertTrue(FilenameUtils.isExtension("a.b/file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14672);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt", (String[]) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14673);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14674);assertTrue(FilenameUtils.isExtension("a\\b\\file.txt", new String[]{"txt"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14675);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt", new String[]{"rtf"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14676);assertTrue(FilenameUtils.isExtension("a\\b\\file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14677);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", (String[]) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14678);assertFalse(FilenameUtils.isExtension("a.b\\file.txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14679);assertTrue(FilenameUtils.isExtension("a.b\\file.txt", new String[]{"txt"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14680);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", new String[]{"rtf"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14681);assertTrue(FilenameUtils.isExtension("a.b\\file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14682);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", new String[]{"TXT"}));
        __CLR4_4_1aouaoukylve1li.R.inc(14683);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", "TXT", "RTF"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testIsExtensionVarArgs() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s893igbbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testIsExtensionVarArgs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s893igbbw(){try{__CLR4_4_1aouaoukylve1li.R.inc(14684);
        __CLR4_4_1aouaoukylve1li.R.inc(14685);assertTrue(FilenameUtils.isExtension("file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14686);assertFalse(FilenameUtils.isExtension("file.txt", "rtf"));
        __CLR4_4_1aouaoukylve1li.R.inc(14687);assertTrue(FilenameUtils.isExtension("file", "rtf", ""));
        __CLR4_4_1aouaoukylve1li.R.inc(14688);assertTrue(FilenameUtils.isExtension("file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14689);assertTrue(FilenameUtils.isExtension("a/b/file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14690);assertFalse(FilenameUtils.isExtension("a/b/file.txt", "rtf"));
        __CLR4_4_1aouaoukylve1li.R.inc(14691);assertTrue(FilenameUtils.isExtension("a/b/file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14692);assertTrue(FilenameUtils.isExtension("a.b/file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14693);assertFalse(FilenameUtils.isExtension("a.b/file.txt", "rtf"));
        __CLR4_4_1aouaoukylve1li.R.inc(14694);assertTrue(FilenameUtils.isExtension("a.b/file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14695);assertTrue(FilenameUtils.isExtension("a\\b\\file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14696);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt", "rtf"));
        __CLR4_4_1aouaoukylve1li.R.inc(14697);assertTrue(FilenameUtils.isExtension("a\\b\\file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14698);assertTrue(FilenameUtils.isExtension("a.b\\file.txt", "txt"));
        __CLR4_4_1aouaoukylve1li.R.inc(14699);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", "rtf"));
        __CLR4_4_1aouaoukylve1li.R.inc(14700);assertTrue(FilenameUtils.isExtension("a.b\\file.txt", "rtf", "txt"));

        __CLR4_4_1aouaoukylve1li.R.inc(14701);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", "TXT"));
        __CLR4_4_1aouaoukylve1li.R.inc(14702);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", "TXT", "RTF"));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}

    @Test
    public void testIsExtensionCollection() {__CLR4_4_1aouaoukylve1li.R.globalSliceStart(getClass().getName(),14703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cbrzcbcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1aouaoukylve1li.R.rethrow($CLV_t2$);}finally{__CLR4_4_1aouaoukylve1li.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsTestCase.testIsExtensionCollection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cbrzcbcf(){try{__CLR4_4_1aouaoukylve1li.R.inc(14703);
        __CLR4_4_1aouaoukylve1li.R.inc(14704);assertFalse(FilenameUtils.isExtension(null, (Collection<String>) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14705);assertFalse(FilenameUtils.isExtension("file.txt", (Collection<String>) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14706);assertTrue(FilenameUtils.isExtension("file", (Collection<String>) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14707);assertFalse(FilenameUtils.isExtension("file.txt", new ArrayList<String>()));
        __CLR4_4_1aouaoukylve1li.R.inc(14708);assertTrue(FilenameUtils.isExtension("file.txt", new ArrayList<>(Arrays.asList("txt"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14709);assertFalse(FilenameUtils.isExtension("file.txt", new ArrayList<>(Arrays.asList("rtf"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14710);assertTrue(FilenameUtils.isExtension("file", new ArrayList<>(Arrays.asList("rtf", ""))));
        __CLR4_4_1aouaoukylve1li.R.inc(14711);assertTrue(FilenameUtils.isExtension("file.txt", new ArrayList<>(Arrays.asList("rtf", "txt"))));

        __CLR4_4_1aouaoukylve1li.R.inc(14712);assertFalse(FilenameUtils.isExtension("a/b/file.txt", (Collection<String>) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14713);assertFalse(FilenameUtils.isExtension("a/b/file.txt", new ArrayList<String>()));
        __CLR4_4_1aouaoukylve1li.R.inc(14714);assertTrue(FilenameUtils.isExtension("a/b/file.txt", new ArrayList<>(Arrays.asList("txt"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14715);assertFalse(FilenameUtils.isExtension("a/b/file.txt", new ArrayList<>(Arrays.asList("rtf"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14716);assertTrue(FilenameUtils.isExtension("a/b/file.txt", new ArrayList<>(Arrays.asList("rtf", "txt"))));

        __CLR4_4_1aouaoukylve1li.R.inc(14717);assertFalse(FilenameUtils.isExtension("a.b/file.txt", (Collection<String>) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14718);assertFalse(FilenameUtils.isExtension("a.b/file.txt", new ArrayList<String>()));
        __CLR4_4_1aouaoukylve1li.R.inc(14719);assertTrue(FilenameUtils.isExtension("a.b/file.txt", new ArrayList<>(Arrays.asList("txt"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14720);assertFalse(FilenameUtils.isExtension("a.b/file.txt", new ArrayList<>(Arrays.asList("rtf"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14721);assertTrue(FilenameUtils.isExtension("a.b/file.txt", new ArrayList<>(Arrays.asList("rtf", "txt"))));

        __CLR4_4_1aouaoukylve1li.R.inc(14722);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt", (Collection<String>) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14723);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt", new ArrayList<String>()));
        __CLR4_4_1aouaoukylve1li.R.inc(14724);assertTrue(FilenameUtils.isExtension("a\\b\\file.txt", new ArrayList<>(Arrays.asList("txt"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14725);assertFalse(FilenameUtils.isExtension("a\\b\\file.txt", new ArrayList<>(Arrays.asList("rtf"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14726);assertTrue(FilenameUtils.isExtension("a\\b\\file.txt", new ArrayList<>(Arrays.asList("rtf", "txt"))));

        __CLR4_4_1aouaoukylve1li.R.inc(14727);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", (Collection<String>) null));
        __CLR4_4_1aouaoukylve1li.R.inc(14728);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", new ArrayList<String>()));
        __CLR4_4_1aouaoukylve1li.R.inc(14729);assertTrue(FilenameUtils.isExtension("a.b\\file.txt", new ArrayList<>(Arrays.asList("txt"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14730);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", new ArrayList<>(Arrays.asList("rtf"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14731);assertTrue(FilenameUtils.isExtension("a.b\\file.txt", new ArrayList<>(Arrays.asList("rtf", "txt"))));

        __CLR4_4_1aouaoukylve1li.R.inc(14732);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", new ArrayList<>(Arrays.asList("TXT"))));
        __CLR4_4_1aouaoukylve1li.R.inc(14733);assertFalse(FilenameUtils.isExtension("a.b\\file.txt", new ArrayList<>(Arrays.asList("TXT", "RTF"))));
    }finally{__CLR4_4_1aouaoukylve1li.R.flushNeeded();}}
}
