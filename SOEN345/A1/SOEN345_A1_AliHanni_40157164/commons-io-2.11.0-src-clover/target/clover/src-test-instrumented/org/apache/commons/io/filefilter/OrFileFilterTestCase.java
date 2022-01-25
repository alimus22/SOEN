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

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

/**
 * Tests {@link IOFileFilter}.
 */
public class OrFileFilterTestCase extends ConditionalFileFilterAbstractTestCase {static class __CLR4_4_1f7if7ikylve2j7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,19862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static final String DEFAULT_WORKING_PATH = "./OrFileFilterTestCase/";
  private static final String WORKING_PATH_NAME_PROPERTY_KEY = OrFileFilterTestCase.class.getName() + ".workingDirectory";

  private List<List<IOFileFilter>> testFilters;
  private List<boolean[]> testTrueResults;
  private List<boolean[]> testFalseResults;
  private List<Boolean> testFileResults;
  private List<Boolean> testFilenameResults;

  @Override
  protected IOFileFilter buildFilterUsingAdd(final List<IOFileFilter> filters) {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19710);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19711);final OrFileFilter filter = new OrFileFilter();
    __CLR4_4_1f7if7ikylve2j7.R.inc(19712);for (final IOFileFilter filter1 : filters) {{
      __CLR4_4_1f7if7ikylve2j7.R.inc(19713);filter.addFileFilter(filter1);
    }
    }__CLR4_4_1f7if7ikylve2j7.R.inc(19714);return filter;
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @Override
  protected IOFileFilter buildFilterUsingConstructor(final List<IOFileFilter> filters) {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19715);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19716);return new OrFileFilter(filters);
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @Override
  protected ConditionalFileFilter getConditionalFileFilter() {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19717);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19718);return new OrFileFilter();
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @Override
  protected String getDefaultWorkingPath() {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19719);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19720);return DEFAULT_WORKING_PATH;
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @Override
  protected List<boolean[]> getFalseResults() {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19721);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19722);return this.testFalseResults;
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @Override
  protected List<Boolean> getFileResults() {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19723);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19724);return this.testFileResults;
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @Override
  protected List<Boolean> getFilenameResults() {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19725);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19726);return this.testFilenameResults;
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @Override
  protected List<List<IOFileFilter>>  getTestFilters() {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19727);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19728);return this.testFilters;
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @Override
  protected List<boolean[]> getTrueResults() {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19729);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19730);return this.testTrueResults;
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @Override
  protected String getWorkingPathNamePropertyKey() {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19731);
    __CLR4_4_1f7if7ikylve2j7.R.inc(19732);return WORKING_PATH_NAME_PROPERTY_KEY;
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}

  @BeforeEach
  public void setUpTestFilters() {try{__CLR4_4_1f7if7ikylve2j7.R.inc(19733);
    // filters
    //tests
    __CLR4_4_1f7if7ikylve2j7.R.inc(19734);this.testFilters = new ArrayList<>();
    __CLR4_4_1f7if7ikylve2j7.R.inc(19735);this.testTrueResults = new ArrayList<>();
    __CLR4_4_1f7if7ikylve2j7.R.inc(19736);this.testFalseResults = new ArrayList<>();
    __CLR4_4_1f7if7ikylve2j7.R.inc(19737);this.testFileResults = new ArrayList<>();
    __CLR4_4_1f7if7ikylve2j7.R.inc(19738);this.testFilenameResults = new ArrayList<>();

    // test 0 - add empty elements
    {
      __CLR4_4_1f7if7ikylve2j7.R.inc(19739);testFilters.add(0, null);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19740);testTrueResults.add(0, null);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19741);testFalseResults.add(0, null);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19742);testFileResults.add(0, null);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19743);testFilenameResults.add(0, null);
    }

    // test 1 - Test conditional or with all filters returning true
    {
      // test 1 filters
      __CLR4_4_1f7if7ikylve2j7.R.inc(19744);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1f7if7ikylve2j7.R.inc(19745);filters.add(trueFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19746);filters.add(trueFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19747);filters.add(trueFilters[3]);
      // test 1 true results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19748);final boolean[] trueResults = {true, false, false};
      // test 1 false results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19749);final boolean[] falseResults = {false, false, false};

      __CLR4_4_1f7if7ikylve2j7.R.inc(19750);testFilters.add(1, filters);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19751);testTrueResults.add(1, trueResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19752);testFalseResults.add(1, falseResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19753);testFileResults.add(1, Boolean.TRUE);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19754);testFilenameResults.add(1, Boolean.TRUE);
    }

    // test 2 - Test conditional or with first filter returning false
    {
      // test 2 filters
      __CLR4_4_1f7if7ikylve2j7.R.inc(19755);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1f7if7ikylve2j7.R.inc(19756);filters.add(falseFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19757);filters.add(trueFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19758);filters.add(trueFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19759);filters.add(trueFilters[3]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19760);filters.add(falseFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19761);filters.add(falseFilters[3]);
      // test 2 true results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19762);final boolean[] trueResults = {true, false, false};
      // test 2 false results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19763);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1f7if7ikylve2j7.R.inc(19764);testFilters.add(2, filters);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19765);testTrueResults.add(2, trueResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19766);testFalseResults.add(2, falseResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19767);testFileResults.add(2, Boolean.TRUE);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19768);testFilenameResults.add(2, Boolean.TRUE);
    }

    // test 3 - Test conditional or with second filter returning false
    {
      // test 3 filters
      __CLR4_4_1f7if7ikylve2j7.R.inc(19769);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1f7if7ikylve2j7.R.inc(19770);filters.add(trueFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19771);filters.add(falseFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19772);filters.add(trueFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19773);filters.add(trueFilters[3]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19774);filters.add(falseFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19775);filters.add(falseFilters[3]);
      // test 3 true results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19776);final boolean[] trueResults = {true, false, false};
      // test 3 false results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19777);final boolean[] falseResults = {false, false, false};

      __CLR4_4_1f7if7ikylve2j7.R.inc(19778);testFilters.add(3, filters);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19779);testTrueResults.add(3, trueResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19780);testFalseResults.add(3, falseResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19781);testFileResults.add(3, Boolean.TRUE);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19782);testFilenameResults.add(3, Boolean.TRUE);
    }

    // test 4 - Test conditional or with third filter returning false
    {
      // test 4 filters
      __CLR4_4_1f7if7ikylve2j7.R.inc(19783);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1f7if7ikylve2j7.R.inc(19784);filters.add(trueFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19785);filters.add(trueFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19786);filters.add(falseFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19787);filters.add(trueFilters[3]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19788);filters.add(falseFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19789);filters.add(falseFilters[3]);
      // test 4 true results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19790);final boolean[] trueResults = {true, false, false};
      // test 4 false results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19791);final boolean[] falseResults = {false, false, false};

      __CLR4_4_1f7if7ikylve2j7.R.inc(19792);testFilters.add(4, filters);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19793);testTrueResults.add(4, trueResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19794);testFalseResults.add(4, falseResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19795);testFileResults.add(4, Boolean.TRUE);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19796);testFilenameResults.add(4, Boolean.TRUE);
    }

    // test 5 - Test conditional or with first and third filters returning false
    {
      // test 5 filters
      __CLR4_4_1f7if7ikylve2j7.R.inc(19797);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1f7if7ikylve2j7.R.inc(19798);filters.add(falseFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19799);filters.add(trueFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19800);filters.add(falseFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19801);filters.add(falseFilters[3]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19802);filters.add(trueFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19803);filters.add(trueFilters[3]);
      // test 5 true results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19804);final boolean[] trueResults = {true, false, false};
      // test 5 false results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19805);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1f7if7ikylve2j7.R.inc(19806);testFilters.add(5, filters);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19807);testTrueResults.add(5, trueResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19808);testFalseResults.add(5, falseResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19809);testFileResults.add(5, Boolean.TRUE);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19810);testFilenameResults.add(5, Boolean.TRUE);
    }

    // test 6 - Test conditional or with second and third filters returning false
    {
      __CLR4_4_1f7if7ikylve2j7.R.inc(19811);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1f7if7ikylve2j7.R.inc(19812);filters.add(trueFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19813);filters.add(falseFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19814);filters.add(falseFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19815);filters.add(trueFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19816);filters.add(trueFilters[3]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19817);filters.add(falseFilters[3]);
      // test 6 true results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19818);final boolean[] trueResults = {true, false, false};
      // test 6 false results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19819);final boolean[] falseResults = {false, false, false};

      __CLR4_4_1f7if7ikylve2j7.R.inc(19820);testFilters.add(6, filters);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19821);testTrueResults.add(6, trueResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19822);testFalseResults.add(6, falseResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19823);testFileResults.add(6, Boolean.TRUE);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19824);testFilenameResults.add(6, Boolean.TRUE);
    }

    // test 7 - Test conditional or with first and second filters returning false
    {
      __CLR4_4_1f7if7ikylve2j7.R.inc(19825);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1f7if7ikylve2j7.R.inc(19826);filters.add(falseFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19827);filters.add(falseFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19828);filters.add(trueFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19829);filters.add(falseFilters[3]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19830);filters.add(trueFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19831);filters.add(trueFilters[3]);
      // test 7 true results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19832);final boolean[] trueResults = {true, false, false};
      // test 7 false results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19833);final boolean[] falseResults = {true, true, false};

      __CLR4_4_1f7if7ikylve2j7.R.inc(19834);testFilters.add(7, filters);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19835);testTrueResults.add(7, trueResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19836);testFalseResults.add(7, falseResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19837);testFileResults.add(7, Boolean.TRUE);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19838);testFilenameResults.add(7, Boolean.TRUE);
    }

    // test 8 - Test conditional or with fourth filter returning false
    {
      __CLR4_4_1f7if7ikylve2j7.R.inc(19839);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1f7if7ikylve2j7.R.inc(19840);filters.add(trueFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19841);filters.add(trueFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19842);filters.add(trueFilters[3]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19843);filters.add(falseFilters[1]);
      // test 8 true results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19844);final boolean[] trueResults = {true, false, false};
      // test 8 false results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19845);final boolean[] falseResults = {false, false, false};

      __CLR4_4_1f7if7ikylve2j7.R.inc(19846);testFilters.add(8, filters);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19847);testTrueResults.add(8, trueResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19848);testFalseResults.add(8, falseResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19849);testFileResults.add(8, Boolean.TRUE);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19850);testFilenameResults.add(8, Boolean.TRUE);
    }

    // test 9 - Test conditional or with all filters returning false
    {
      __CLR4_4_1f7if7ikylve2j7.R.inc(19851);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1f7if7ikylve2j7.R.inc(19852);filters.add(falseFilters[1]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19853);filters.add(falseFilters[2]);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19854);filters.add(falseFilters[3]);
      // test 9 true results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19855);final boolean[] trueResults = {false, false, false};
      // test 9 false results
      __CLR4_4_1f7if7ikylve2j7.R.inc(19856);final boolean[] falseResults = {true, true, true};

      __CLR4_4_1f7if7ikylve2j7.R.inc(19857);testFilters.add(9, filters);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19858);testTrueResults.add(9, trueResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19859);testFalseResults.add(9, falseResults);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19860);testFileResults.add(9, Boolean.FALSE);
      __CLR4_4_1f7if7ikylve2j7.R.inc(19861);testFilenameResults.add(9, Boolean.FALSE);
    }
  }finally{__CLR4_4_1f7if7ikylve2j7.R.flushNeeded();}}
}
