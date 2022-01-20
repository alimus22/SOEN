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
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.apache.commons.io.IOCase;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link RegexFileFilter}.
 */
public class RegexFileFilterTestCase {static class __CLR4_4_1fbqfbqkylve2jm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,19937,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void assertFiltering(final IOFileFilter filter, final File file, final boolean expected) {try{__CLR4_4_1fbqfbqkylve2jm.R.inc(19862);
        // Note. This only tests the (File, String) version if the parent of
        //       the File passed in is not null
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19863);assertEquals(expected, filter.accept(file),
                "Filter(File) " + filter.getClass().getName() + " not " + expected + " for " + file);

        __CLR4_4_1fbqfbqkylve2jm.R.inc(19864);if ((((file != null && file.getParentFile() != null)&&(__CLR4_4_1fbqfbqkylve2jm.R.iget(19865)!=0|true))||(__CLR4_4_1fbqfbqkylve2jm.R.iget(19866)==0&false))) {{
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19867);assertEquals(expected, filter.accept(file.getParentFile(), file.getName()),
                    "Filter(File, String) " + filter.getClass().getName() + " not " + expected + " for " + file);
        } }else {__CLR4_4_1fbqfbqkylve2jm.R.inc(19868);if ((((file == null)&&(__CLR4_4_1fbqfbqkylve2jm.R.iget(19869)!=0|true))||(__CLR4_4_1fbqfbqkylve2jm.R.iget(19870)==0&false))) {{
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19871);assertEquals(expected, filter.accept(file),
                    "Filter(File, String) " + filter.getClass().getName() + " not " + expected + " for null");
        }
    }}}finally{__CLR4_4_1fbqfbqkylve2jm.R.flushNeeded();}}

    public void assertFiltering(final IOFileFilter filter, final Path path, final boolean expected) {try{__CLR4_4_1fbqfbqkylve2jm.R.inc(19872);
        // Note. This only tests the (Path, Path) version if the parent of
        // the Path passed in is not null
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19873);final FileVisitResult expectedFileVisitResult = AbstractFileFilter.toFileVisitResult(expected, path);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19874);assertEquals(expectedFileVisitResult, filter.accept(path, null),
            "Filter(Path) " + filter.getClass().getName() + " not " + expectedFileVisitResult + " for " + path);

        __CLR4_4_1fbqfbqkylve2jm.R.inc(19875);if ((((path != null && path.getParent() != null)&&(__CLR4_4_1fbqfbqkylve2jm.R.iget(19876)!=0|true))||(__CLR4_4_1fbqfbqkylve2jm.R.iget(19877)==0&false))) {{
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19878);assertEquals(expectedFileVisitResult, filter.accept(path, null),
                "Filter(Path, Path) " + filter.getClass().getName() + " not " + expectedFileVisitResult + " for "
                    + path);
        } }else {__CLR4_4_1fbqfbqkylve2jm.R.inc(19879);if ((((path == null)&&(__CLR4_4_1fbqfbqkylve2jm.R.iget(19880)!=0|true))||(__CLR4_4_1fbqfbqkylve2jm.R.iget(19881)==0&false))) {{
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19882);assertEquals(expectedFileVisitResult, filter.accept(path, null),
                "Filter(Path, Path) " + filter.getClass().getName() + " not " + expectedFileVisitResult + " for null");
        }
    }}}finally{__CLR4_4_1fbqfbqkylve2jm.R.flushNeeded();}}

    @Test
    public void testRegex() {__CLR4_4_1fbqfbqkylve2jm.R.globalSliceStart(getClass().getName(),19883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2i2ykfcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fbqfbqkylve2jm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fbqfbqkylve2jm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.RegexFileFilterTestCase.testRegex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2i2ykfcb(){try{__CLR4_4_1fbqfbqkylve2jm.R.inc(19883);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19884);IOFileFilter filter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19885);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19886);assertFiltering(filter, new File("test-10.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19887);assertFiltering(filter, new File("test-.java"), false);
        //
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19888);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19889);assertFiltering(filter, new File("test-10.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19890);assertFiltering(filter, new File("test-.java").toPath(), false);

        __CLR4_4_1fbqfbqkylve2jm.R.inc(19891);filter = new RegexFileFilter("^[Tt]est.java$");
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19892);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19893);assertFiltering(filter, new File("test.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19894);assertFiltering(filter, new File("tEST.java"), false);
        //
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19895);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19896);assertFiltering(filter, new File("test.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19897);assertFiltering(filter, new File("tEST.java").toPath(), false);

        __CLR4_4_1fbqfbqkylve2jm.R.inc(19898);filter = new RegexFileFilter(Pattern.compile("^test.java$", Pattern.CASE_INSENSITIVE));
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19899);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19900);assertFiltering(filter, new File("test.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19901);assertFiltering(filter, new File("tEST.java"), true);
        //
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19902);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19903);assertFiltering(filter, new File("test.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19904);assertFiltering(filter, new File("tEST.java").toPath(), true);

        __CLR4_4_1fbqfbqkylve2jm.R.inc(19905);filter = new RegexFileFilter("^test.java$", Pattern.CASE_INSENSITIVE);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19906);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19907);assertFiltering(filter, new File("test.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19908);assertFiltering(filter, new File("tEST.java"), true);
        //
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19909);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19910);assertFiltering(filter, new File("test.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19911);assertFiltering(filter, new File("tEST.java").toPath(), true);

        __CLR4_4_1fbqfbqkylve2jm.R.inc(19912);filter = new RegexFileFilter("^test.java$", IOCase.INSENSITIVE);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19913);assertFiltering(filter, new File("Test.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19914);assertFiltering(filter, new File("test.java"), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19915);assertFiltering(filter, new File("tEST.java"), true);
        //
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19916);assertFiltering(filter, new File("Test.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19917);assertFiltering(filter, new File("test.java").toPath(), true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19918);assertFiltering(filter, new File("tEST.java").toPath(), true);
    }finally{__CLR4_4_1fbqfbqkylve2jm.R.flushNeeded();}}

    @Test
    public void testRegexEdgeCases() {__CLR4_4_1fbqfbqkylve2jm.R.globalSliceStart(getClass().getName(),19919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16olq3cfdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fbqfbqkylve2jm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fbqfbqkylve2jm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.RegexFileFilterTestCase.testRegexEdgeCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16olq3cfdb(){try{__CLR4_4_1fbqfbqkylve2jm.R.inc(19919);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19920);try {
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19921);new RegexFileFilter((String) null);
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19922);fail();
        } catch (final IllegalArgumentException ignore) {
            // expected
        }

        __CLR4_4_1fbqfbqkylve2jm.R.inc(19923);try {
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19924);new RegexFileFilter(null, Pattern.CASE_INSENSITIVE);
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19925);fail();
        } catch (final IllegalArgumentException ignore) {
            // expected
        }

        __CLR4_4_1fbqfbqkylve2jm.R.inc(19926);try {
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19927);new RegexFileFilter(null, IOCase.INSENSITIVE);
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19928);fail();
        } catch (final IllegalArgumentException ignore) {
            // expected
        }

        __CLR4_4_1fbqfbqkylve2jm.R.inc(19929);try {
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19930);new RegexFileFilter((java.util.regex.Pattern) null);
            __CLR4_4_1fbqfbqkylve2jm.R.inc(19931);fail();
        } catch (final IllegalArgumentException ignore) {
            // expected
        }
    }finally{__CLR4_4_1fbqfbqkylve2jm.R.flushNeeded();}}

    /**
     * Tests https://issues.apache.org/jira/browse/IO-733.
     */
    @Test
    public void testRegexFileNameOnly() {__CLR4_4_1fbqfbqkylve2jm.R.globalSliceStart(getClass().getName(),19932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sum09dfdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fbqfbqkylve2jm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fbqfbqkylve2jm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.RegexFileFilterTestCase.testRegexFileNameOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),19932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sum09dfdo(){try{__CLR4_4_1fbqfbqkylve2jm.R.inc(19932);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19933);final Path path = Paths.get("folder", "Foo.java");
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19934);final String patternStr = "Foo.*";
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19935);assertFiltering(new RegexFileFilter(patternStr), path, true);
        __CLR4_4_1fbqfbqkylve2jm.R.inc(19936);assertFiltering(new RegexFileFilter(Pattern.compile(patternStr), Path::toString), path, false);
    }finally{__CLR4_4_1fbqfbqkylve2jm.R.flushNeeded();}}

}
