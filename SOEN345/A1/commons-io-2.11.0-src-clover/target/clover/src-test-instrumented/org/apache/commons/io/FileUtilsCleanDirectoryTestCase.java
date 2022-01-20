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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.io.TempDir;

/**
 * Test cases for FileUtils.cleanDirectory() method.
 *
 * TODO Redo this test using
 * {@link Files#createSymbolicLink(java.nio.file.Path, java.nio.file.Path, java.nio.file.attribute.FileAttribute...)}.
 */
public class FileUtilsCleanDirectoryTestCase {static class __CLR4_4_18q28q2kylve103{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11354,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File top;

    // -----------------------------------------------------------------------
    @Test
    public void testCleanEmpty() throws Exception {__CLR4_4_18q28q2kylve103.R.globalSliceStart(getClass().getName(),11306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxlqv18q2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q28q2kylve103.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q28q2kylve103.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanDirectoryTestCase.testCleanEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxlqv18q2() throws Exception{try{__CLR4_4_18q28q2kylve103.R.inc(11306);
        __CLR4_4_18q28q2kylve103.R.inc(11307);assertEquals(0, top.list().length);

        __CLR4_4_18q28q2kylve103.R.inc(11308);FileUtils.cleanDirectory(top);

        __CLR4_4_18q28q2kylve103.R.inc(11309);assertEquals(0, top.list().length);
    }finally{__CLR4_4_18q28q2kylve103.R.flushNeeded();}}

    @Test
    public void testDeletesRegular() throws Exception {__CLR4_4_18q28q2kylve103.R.globalSliceStart(getClass().getName(),11310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tu8a318q6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q28q2kylve103.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q28q2kylve103.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanDirectoryTestCase.testDeletesRegular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tu8a318q6() throws Exception{try{__CLR4_4_18q28q2kylve103.R.inc(11310);
        __CLR4_4_18q28q2kylve103.R.inc(11311);FileUtils.touch(new File(top, "regular"));
        __CLR4_4_18q28q2kylve103.R.inc(11312);FileUtils.touch(new File(top, ".hidden"));

        __CLR4_4_18q28q2kylve103.R.inc(11313);assertEquals(2, top.list().length);

        __CLR4_4_18q28q2kylve103.R.inc(11314);FileUtils.cleanDirectory(top);

        __CLR4_4_18q28q2kylve103.R.inc(11315);assertEquals(0, top.list().length);
    }finally{__CLR4_4_18q28q2kylve103.R.flushNeeded();}}

    @Test
    public void testDeletesNested() throws Exception {__CLR4_4_18q28q2kylve103.R.globalSliceStart(getClass().getName(),11316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4u4qc8qc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q28q2kylve103.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q28q2kylve103.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanDirectoryTestCase.testDeletesNested",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4u4qc8qc() throws Exception{try{__CLR4_4_18q28q2kylve103.R.inc(11316);
        __CLR4_4_18q28q2kylve103.R.inc(11317);final File nested = new File(top, "nested");

        __CLR4_4_18q28q2kylve103.R.inc(11318);assertTrue(nested.mkdirs());

        __CLR4_4_18q28q2kylve103.R.inc(11319);FileUtils.touch(new File(nested, "file"));

        __CLR4_4_18q28q2kylve103.R.inc(11320);assertEquals(1, top.list().length);

        __CLR4_4_18q28q2kylve103.R.inc(11321);FileUtils.cleanDirectory(top);

        __CLR4_4_18q28q2kylve103.R.inc(11322);assertEquals(0, top.list().length);
    }finally{__CLR4_4_18q28q2kylve103.R.flushNeeded();}}

    @DisabledOnOs(OS.WINDOWS)
    @Test
    public void testThrowsOnNullList() throws Exception {__CLR4_4_18q28q2kylve103.R.globalSliceStart(getClass().getName(),11323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yyik528qj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q28q2kylve103.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q28q2kylve103.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanDirectoryTestCase.testThrowsOnNullList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yyik528qj() throws Exception{try{__CLR4_4_18q28q2kylve103.R.inc(11323);
        // test wont work if we can't restrict permissions on the
        // directory, so skip it.
        __CLR4_4_18q28q2kylve103.R.inc(11324);assumeTrue(chmod(top, 0, false));

        __CLR4_4_18q28q2kylve103.R.inc(11325);try {
            // cleanDirectory calls forceDelete
            __CLR4_4_18q28q2kylve103.R.inc(11326);FileUtils.cleanDirectory(top);
            __CLR4_4_18q28q2kylve103.R.inc(11327);fail("expected IOException");
        } catch (final IOException e) {
            __CLR4_4_18q28q2kylve103.R.inc(11328);assertEquals("Unknown I/O error listing contents of directory: " + top.getAbsolutePath(), e.getMessage());
        } finally {
            __CLR4_4_18q28q2kylve103.R.inc(11329);chmod(top, 755, false);
        }
    }finally{__CLR4_4_18q28q2kylve103.R.flushNeeded();}}

    @DisabledOnOs(OS.WINDOWS)
    @Test
    public void testThrowsOnCannotDeleteFile() throws Exception {__CLR4_4_18q28q2kylve103.R.globalSliceStart(getClass().getName(),11330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p2fxyp8qq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q28q2kylve103.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q28q2kylve103.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCleanDirectoryTestCase.testThrowsOnCannotDeleteFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p2fxyp8qq() throws Exception{try{__CLR4_4_18q28q2kylve103.R.inc(11330);
        __CLR4_4_18q28q2kylve103.R.inc(11331);final File file = new File(top, "restricted");
        __CLR4_4_18q28q2kylve103.R.inc(11332);FileUtils.touch(file);

        __CLR4_4_18q28q2kylve103.R.inc(11333);assumeTrue(chmod(top, 500, false));

        __CLR4_4_18q28q2kylve103.R.inc(11334);try {
            // cleanDirectory calls forceDelete
            __CLR4_4_18q28q2kylve103.R.inc(11335);FileUtils.cleanDirectory(top);
            __CLR4_4_18q28q2kylve103.R.inc(11336);fail("expected IOException");
        } catch (final IOException e) {
            __CLR4_4_18q28q2kylve103.R.inc(11337);final IOExceptionList list = (IOExceptionList) e;
            __CLR4_4_18q28q2kylve103.R.inc(11338);assertEquals("Cannot delete file: " + file.getAbsolutePath(), list.getCause(0).getMessage());
        } finally {
            __CLR4_4_18q28q2kylve103.R.inc(11339);chmod(top, 755, false);
        }
    }finally{__CLR4_4_18q28q2kylve103.R.flushNeeded();}}

    /** Only runs on Linux. */
    private boolean chmod(final File file, final int mode, final boolean recurse) throws InterruptedException {try{__CLR4_4_18q28q2kylve103.R.inc(11340);
        __CLR4_4_18q28q2kylve103.R.inc(11341);final List<String> args = new ArrayList<>();
        __CLR4_4_18q28q2kylve103.R.inc(11342);args.add("chmod");

        __CLR4_4_18q28q2kylve103.R.inc(11343);if ((((recurse)&&(__CLR4_4_18q28q2kylve103.R.iget(11344)!=0|true))||(__CLR4_4_18q28q2kylve103.R.iget(11345)==0&false))) {{
            __CLR4_4_18q28q2kylve103.R.inc(11346);args.add("-R");
        }

        }__CLR4_4_18q28q2kylve103.R.inc(11347);args.add(Integer.toString(mode));
        __CLR4_4_18q28q2kylve103.R.inc(11348);args.add(file.getAbsolutePath());

        __CLR4_4_18q28q2kylve103.R.inc(11349);final Process proc;

        __CLR4_4_18q28q2kylve103.R.inc(11350);try {
            __CLR4_4_18q28q2kylve103.R.inc(11351);proc = Runtime.getRuntime().exec(args.toArray(new String[args.size()]));
        } catch (final IOException e) {
            __CLR4_4_18q28q2kylve103.R.inc(11352);return false;
        }
        __CLR4_4_18q28q2kylve103.R.inc(11353);return proc.waitFor() == 0;
    }finally{__CLR4_4_18q28q2kylve103.R.flushNeeded();}}

}
