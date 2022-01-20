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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class ConditionalFileFilterAbstractTestCase extends IOFileFilterAbstractTestCase {static class __CLR4_4_1e3he3hkylve2cs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,18362,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String TEST_FILE_NAME_PREFIX = "TestFile";
    private static final String TEST_FILE_TYPE = ".tst";

    protected TesterTrueFileFilter[] trueFilters;
    protected TesterFalseFileFilter[] falseFilters;

    private File file;
    private File workingPath;

    @BeforeEach
    public void setUp() {try{__CLR4_4_1e3he3hkylve2cs.R.inc(18269);
        __CLR4_4_1e3he3hkylve2cs.R.inc(18270);this.workingPath = determineWorkingDirectoryPath(this.getWorkingPathNamePropertyKey(), this.getDefaultWorkingPath());
        __CLR4_4_1e3he3hkylve2cs.R.inc(18271);this.file = new File(this.workingPath, TEST_FILE_NAME_PREFIX + 1 + TEST_FILE_TYPE);
        __CLR4_4_1e3he3hkylve2cs.R.inc(18272);this.trueFilters = new TesterTrueFileFilter[4];
        __CLR4_4_1e3he3hkylve2cs.R.inc(18273);this.falseFilters = new TesterFalseFileFilter[4];
        __CLR4_4_1e3he3hkylve2cs.R.inc(18274);this.trueFilters[1] = new TesterTrueFileFilter();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18275);this.trueFilters[2] = new TesterTrueFileFilter();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18276);this.trueFilters[3] = new TesterTrueFileFilter();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18277);this.falseFilters[1] = new TesterFalseFileFilter();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18278);this.falseFilters[2] = new TesterFalseFileFilter();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18279);this.falseFilters[3] = new TesterFalseFileFilter();
    }finally{__CLR4_4_1e3he3hkylve2cs.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_1e3he3hkylve2cs.R.globalSliceStart(getClass().getName(),18280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82ee3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e3he3hkylve2cs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e3he3hkylve2cs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.ConditionalFileFilterAbstractTestCase.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82ee3s(){try{__CLR4_4_1e3he3hkylve2cs.R.inc(18280);
        __CLR4_4_1e3he3hkylve2cs.R.inc(18281);final List<TesterTrueFileFilter> filters = new ArrayList<>();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18282);final ConditionalFileFilter fileFilter = this.getConditionalFileFilter();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18283);filters.add(new TesterTrueFileFilter());
        __CLR4_4_1e3he3hkylve2cs.R.inc(18284);filters.add(new TesterTrueFileFilter());
        __CLR4_4_1e3he3hkylve2cs.R.inc(18285);filters.add(new TesterTrueFileFilter());
        __CLR4_4_1e3he3hkylve2cs.R.inc(18286);filters.add(new TesterTrueFileFilter());
        __CLR4_4_1e3he3hkylve2cs.R.inc(18287);for (int i = 0; (((i < filters.size())&&(__CLR4_4_1e3he3hkylve2cs.R.iget(18288)!=0|true))||(__CLR4_4_1e3he3hkylve2cs.R.iget(18289)==0&false)); i++) {{
            __CLR4_4_1e3he3hkylve2cs.R.inc(18290);assertEquals(i, fileFilter.getFileFilters().size(), "file filters count: ");
            __CLR4_4_1e3he3hkylve2cs.R.inc(18291);fileFilter.addFileFilter(filters.get(i));
            __CLR4_4_1e3he3hkylve2cs.R.inc(18292);assertEquals(i + 1, fileFilter.getFileFilters().size(), "file filters count: ");
        }
        }__CLR4_4_1e3he3hkylve2cs.R.inc(18293);for (final IOFileFilter filter : fileFilter.getFileFilters()) {{
            __CLR4_4_1e3he3hkylve2cs.R.inc(18294);assertTrue(filters.contains(filter), "found file filter");
        }
        }__CLR4_4_1e3he3hkylve2cs.R.inc(18295);assertEquals(filters.size(), fileFilter.getFileFilters().size(), "file filters count");
    }finally{__CLR4_4_1e3he3hkylve2cs.R.flushNeeded();}}

    @Test
    public void testRemove() {__CLR4_4_1e3he3hkylve2cs.R.globalSliceStart(getClass().getName(),18296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ej1cn1e48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e3he3hkylve2cs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e3he3hkylve2cs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.ConditionalFileFilterAbstractTestCase.testRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ej1cn1e48(){try{__CLR4_4_1e3he3hkylve2cs.R.inc(18296);
        __CLR4_4_1e3he3hkylve2cs.R.inc(18297);final List<TesterTrueFileFilter> filters = new ArrayList<>();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18298);final ConditionalFileFilter fileFilter = this.getConditionalFileFilter();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18299);filters.add(new TesterTrueFileFilter());
        __CLR4_4_1e3he3hkylve2cs.R.inc(18300);filters.add(new TesterTrueFileFilter());
        __CLR4_4_1e3he3hkylve2cs.R.inc(18301);filters.add(new TesterTrueFileFilter());
        __CLR4_4_1e3he3hkylve2cs.R.inc(18302);filters.add(new TesterTrueFileFilter());
        __CLR4_4_1e3he3hkylve2cs.R.inc(18303);for (final TesterTrueFileFilter filter : filters) {{
            __CLR4_4_1e3he3hkylve2cs.R.inc(18304);fileFilter.removeFileFilter(filter);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18305);assertFalse(fileFilter.getFileFilters().contains(filter), "file filter removed");
        }
        }__CLR4_4_1e3he3hkylve2cs.R.inc(18306);assertEquals(0, fileFilter.getFileFilters().size(), "file filters count");
    }finally{__CLR4_4_1e3he3hkylve2cs.R.flushNeeded();}}

    @Test
    public void testNoFilters() {__CLR4_4_1e3he3hkylve2cs.R.globalSliceStart(getClass().getName(),18307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfrf0ve4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e3he3hkylve2cs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e3he3hkylve2cs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.ConditionalFileFilterAbstractTestCase.testNoFilters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfrf0ve4j(){try{__CLR4_4_1e3he3hkylve2cs.R.inc(18307);
        __CLR4_4_1e3he3hkylve2cs.R.inc(18308);final ConditionalFileFilter fileFilter = this.getConditionalFileFilter();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18309);final File file = new File(this.workingPath, TEST_FILE_NAME_PREFIX + 1 + TEST_FILE_TYPE);
        __CLR4_4_1e3he3hkylve2cs.R.inc(18310);assertFileFiltering(1, (IOFileFilter) fileFilter, file, false);
        __CLR4_4_1e3he3hkylve2cs.R.inc(18311);assertFilenameFiltering(1, (IOFileFilter) fileFilter, file, false);
    }finally{__CLR4_4_1e3he3hkylve2cs.R.flushNeeded();}}

    @Test
    public void testFilterBuiltUsingConstructor() {__CLR4_4_1e3he3hkylve2cs.R.globalSliceStart(getClass().getName(),18312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kyxs0fe4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e3he3hkylve2cs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e3he3hkylve2cs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.ConditionalFileFilterAbstractTestCase.testFilterBuiltUsingConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kyxs0fe4o(){try{__CLR4_4_1e3he3hkylve2cs.R.inc(18312);
        __CLR4_4_1e3he3hkylve2cs.R.inc(18313);final List<List<IOFileFilter>> testFilters = this.getTestFilters();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18314);final List<boolean[]> testTrueResults = this.getTrueResults();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18315);final List<boolean[]> testFalseResults = this.getFalseResults();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18316);final List<Boolean> testFileResults = this.getFileResults();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18317);final List<Boolean> testFilenameResults = this.getFilenameResults();

        __CLR4_4_1e3he3hkylve2cs.R.inc(18318);for (int i = 1; (((i < testFilters.size())&&(__CLR4_4_1e3he3hkylve2cs.R.iget(18319)!=0|true))||(__CLR4_4_1e3he3hkylve2cs.R.iget(18320)==0&false)); i++) {{
            __CLR4_4_1e3he3hkylve2cs.R.inc(18321);final List<IOFileFilter> filters = testFilters.get(i);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18322);final boolean[] trueResults = testTrueResults.get(i);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18323);final boolean[] falseResults = testFalseResults.get(i);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18324);final boolean fileResults = testFileResults.get(i);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18325);final boolean filenameResults = testFilenameResults.get(i);

            // Test conditional AND filter created by passing filters to the constructor
            __CLR4_4_1e3he3hkylve2cs.R.inc(18326);final IOFileFilter filter = this.buildFilterUsingConstructor(filters);

            // Test as a file filter
            __CLR4_4_1e3he3hkylve2cs.R.inc(18327);resetTrueFilters(this.trueFilters);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18328);resetFalseFilters(this.falseFilters);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18329);assertFileFiltering(i, filter, this.file, fileResults);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18330);assertTrueFiltersInvoked(i, trueFilters, trueResults);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18331);assertFalseFiltersInvoked(i, falseFilters, falseResults);

            // Test as a filename filter
            __CLR4_4_1e3he3hkylve2cs.R.inc(18332);resetTrueFilters(this.trueFilters);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18333);resetFalseFilters(this.falseFilters);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18334);assertFilenameFiltering(i, filter, this.file, filenameResults);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18335);assertTrueFiltersInvoked(i, trueFilters, trueResults);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18336);assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
    }}finally{__CLR4_4_1e3he3hkylve2cs.R.flushNeeded();}}

    @Test
    public void testFilterBuiltUsingAdd() {__CLR4_4_1e3he3hkylve2cs.R.globalSliceStart(getClass().getName(),18337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16s71vse5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e3he3hkylve2cs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e3he3hkylve2cs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.ConditionalFileFilterAbstractTestCase.testFilterBuiltUsingAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16s71vse5d(){try{__CLR4_4_1e3he3hkylve2cs.R.inc(18337);
        __CLR4_4_1e3he3hkylve2cs.R.inc(18338);final List<List<IOFileFilter>> testFilters = this.getTestFilters();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18339);final List<boolean[]> testTrueResults = this.getTrueResults();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18340);final List<boolean[]> testFalseResults = this.getFalseResults();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18341);final List<Boolean> testFileResults = this.getFileResults();
        __CLR4_4_1e3he3hkylve2cs.R.inc(18342);final List<Boolean> testFilenameResults = this.getFilenameResults();

        __CLR4_4_1e3he3hkylve2cs.R.inc(18343);for (int i = 1; (((i < testFilters.size())&&(__CLR4_4_1e3he3hkylve2cs.R.iget(18344)!=0|true))||(__CLR4_4_1e3he3hkylve2cs.R.iget(18345)==0&false)); i++) {{
            __CLR4_4_1e3he3hkylve2cs.R.inc(18346);final List<IOFileFilter> filters = testFilters.get(i);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18347);final boolean[] trueResults = testTrueResults.get(i);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18348);final boolean[] falseResults = testFalseResults.get(i);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18349);final boolean fileResults = testFileResults.get(i);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18350);final boolean filenameResults = testFilenameResults.get(i);

            // Test conditional AND filter created by passing filters to the constructor
            __CLR4_4_1e3he3hkylve2cs.R.inc(18351);final IOFileFilter filter = this.buildFilterUsingAdd(filters);

            // Test as a file filter
            __CLR4_4_1e3he3hkylve2cs.R.inc(18352);resetTrueFilters(this.trueFilters);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18353);resetFalseFilters(this.falseFilters);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18354);assertFileFiltering(i, filter, this.file, fileResults);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18355);assertTrueFiltersInvoked(i, trueFilters, trueResults);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18356);assertFalseFiltersInvoked(i, falseFilters, falseResults);

            // Test as a filename filter
            __CLR4_4_1e3he3hkylve2cs.R.inc(18357);resetTrueFilters(this.trueFilters);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18358);resetFalseFilters(this.falseFilters);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18359);assertFilenameFiltering(i, filter, this.file, filenameResults);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18360);assertTrueFiltersInvoked(i, trueFilters, trueResults);
            __CLR4_4_1e3he3hkylve2cs.R.inc(18361);assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
    }}finally{__CLR4_4_1e3he3hkylve2cs.R.flushNeeded();}}

    protected abstract ConditionalFileFilter getConditionalFileFilter();

    protected abstract IOFileFilter buildFilterUsingAdd(List<IOFileFilter> filters);

    protected abstract IOFileFilter buildFilterUsingConstructor(List<IOFileFilter> filters);

    protected abstract List<List<IOFileFilter>> getTestFilters();

    protected abstract List<boolean[]> getTrueResults();

    protected abstract List<boolean[]> getFalseResults();

    protected abstract List<Boolean> getFileResults();

    protected abstract List<Boolean> getFilenameResults();

    protected abstract String getWorkingPathNamePropertyKey();

    protected abstract String getDefaultWorkingPath();
}
