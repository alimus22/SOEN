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
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests {@link AndFileFilter}.
 */
public class AndFileFilterTestCase extends ConditionalFileFilterAbstractTestCase {static class __CLR4_4_1dz2dz2kylve2c9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,18269,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static final String DEFAULT_WORKING_PATH = "./AndFileFilterTestCase/";
  private static final String WORKING_PATH_NAME_PROPERTY_KEY = AndFileFilterTestCase.class.getName() + ".workingDirectory";

  private List<List<IOFileFilter>> testFilters;
  private List<boolean[]> testTrueResults;
  private List<boolean[]> testFalseResults;
  private List<Boolean> testFileResults;
  private List<Boolean> testFilenameResults;

  @Override
  protected IOFileFilter buildFilterUsingAdd(final List<IOFileFilter> filters) {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18110);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18111);final AndFileFilter filter = new AndFileFilter();
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18112);for (final IOFileFilter filter1 : filters) {{
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18113);filter.addFileFilter(filter1);
    }
    }__CLR4_4_1dz2dz2kylve2c9.R.inc(18114);return filter;
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Override
  protected IOFileFilter buildFilterUsingConstructor(final List<IOFileFilter> filters) {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18115);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18116);return new AndFileFilter(filters);
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Override
  protected ConditionalFileFilter getConditionalFileFilter() {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18117);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18118);return new AndFileFilter();
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Override
  protected String getDefaultWorkingPath() {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18119);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18120);return DEFAULT_WORKING_PATH;
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Override
  protected List<boolean[]> getFalseResults() {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18121);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18122);return this.testFalseResults;
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Override
  protected List<Boolean> getFileResults() {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18123);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18124);return this.testFileResults;
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Override
  protected List<Boolean> getFilenameResults() {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18125);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18126);return this.testFilenameResults;
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Override
  protected List<List<IOFileFilter>> getTestFilters() {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18127);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18128);return this.testFilters;
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Override
  protected List<boolean[]> getTrueResults() {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18129);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18130);return this.testTrueResults;
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Override
  protected String getWorkingPathNamePropertyKey() {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18131);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18132);return WORKING_PATH_NAME_PROPERTY_KEY;
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @BeforeEach
  public void setUpTestFilters() {try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18133);
    // filters
    //tests
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18134);this.testFilters = new ArrayList<>();
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18135);this.testTrueResults = new ArrayList<>();
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18136);this.testFalseResults = new ArrayList<>();
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18137);this.testFileResults = new ArrayList<>();
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18138);this.testFilenameResults = new ArrayList<>();

    // test 0 - add empty elements
    {
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18139);testFilters.add(0, null);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18140);testTrueResults.add(0, null);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18141);testFalseResults.add(0, null);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18142);testFileResults.add(0, null);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18143);testFilenameResults.add(0, null);
    }

    // test 1 - Test conditional and with all filters returning true
    {
      // test 1 filters
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18144);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18145);filters.add(trueFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18146);filters.add(trueFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18147);filters.add(trueFilters[3]);
      // test 1 true results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18148);final boolean[] trueResults = {true, true, true};
      // test 1 false results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18149);final boolean[] falseResults = {false, false, false};

      __CLR4_4_1dz2dz2kylve2c9.R.inc(18150);testFilters.add(1, filters);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18151);testTrueResults.add(1, trueResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18152);testFalseResults.add(1, falseResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18153);testFileResults.add(1, Boolean.TRUE);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18154);testFilenameResults.add(1, Boolean.TRUE);
    }

    // test 2 - Test conditional and with first filter returning false
    {
      // test 2 filters
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18155);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18156);filters.add(falseFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18157);filters.add(trueFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18158);filters.add(trueFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18159);filters.add(trueFilters[3]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18160);filters.add(falseFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18161);filters.add(falseFilters[3]);
      // test 2 true results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18162);final boolean[] trueResults = {false, false, false};
      // test 2 false results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18163);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1dz2dz2kylve2c9.R.inc(18164);testFilters.add(2, filters);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18165);testTrueResults.add(2, trueResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18166);testFalseResults.add(2, falseResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18167);testFileResults.add(2, Boolean.FALSE);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18168);testFilenameResults.add(2, Boolean.FALSE);
    }

    // test 3 - Test conditional and with second filter returning false
    {
      // test 3 filters
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18169);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18170);filters.add(trueFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18171);filters.add(falseFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18172);filters.add(trueFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18173);filters.add(trueFilters[3]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18174);filters.add(falseFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18175);filters.add(falseFilters[3]);
      // test 3 true results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18176);final boolean[] trueResults = {true, false, false};
      // test 3 false results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18177);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1dz2dz2kylve2c9.R.inc(18178);testFilters.add(3, filters);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18179);testTrueResults.add(3, trueResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18180);testFalseResults.add(3, falseResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18181);testFileResults.add(3, Boolean.FALSE);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18182);testFilenameResults.add(3, Boolean.FALSE);
    }

    // test 4 - Test conditional and with third filter returning false
    {
      // test 4 filters
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18183);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18184);filters.add(trueFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18185);filters.add(trueFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18186);filters.add(falseFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18187);filters.add(trueFilters[3]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18188);filters.add(falseFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18189);filters.add(falseFilters[3]);
      // test 4 true results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18190);final boolean[] trueResults = {true, true, false};
      // test 4 false results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18191);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1dz2dz2kylve2c9.R.inc(18192);testFilters.add(4, filters);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18193);testTrueResults.add(4, trueResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18194);testFalseResults.add(4, falseResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18195);testFileResults.add(4, Boolean.FALSE);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18196);testFilenameResults.add(4, Boolean.FALSE);
    }

    // test 5 - Test conditional and with first and third filters returning false
    {
      // test 5 filters
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18197);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18198);filters.add(falseFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18199);filters.add(trueFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18200);filters.add(falseFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18201);filters.add(falseFilters[3]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18202);filters.add(trueFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18203);filters.add(trueFilters[3]);
      // test 5 true results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18204);final boolean[] trueResults = {false, false, false};
      // test 5 false results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18205);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1dz2dz2kylve2c9.R.inc(18206);testFilters.add(5, filters);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18207);testTrueResults.add(5, trueResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18208);testFalseResults.add(5, falseResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18209);testFileResults.add(5, Boolean.FALSE);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18210);testFilenameResults.add(5, Boolean.FALSE);
    }

    // test 6 - Test conditional and with second and third filters returning false
    {
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18211);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18212);filters.add(trueFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18213);filters.add(falseFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18214);filters.add(falseFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18215);filters.add(trueFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18216);filters.add(trueFilters[3]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18217);filters.add(falseFilters[3]);
      // test 6 true results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18218);final boolean[] trueResults = {true, false, false};
      // test 6 false results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18219);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1dz2dz2kylve2c9.R.inc(18220);testFilters.add(6, filters);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18221);testTrueResults.add(6, trueResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18222);testFalseResults.add(6, falseResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18223);testFileResults.add(6, Boolean.FALSE);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18224);testFilenameResults.add(6, Boolean.FALSE);
    }

    // test 7 - Test conditional and with first and second filters returning false
    {
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18225);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18226);filters.add(falseFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18227);filters.add(falseFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18228);filters.add(trueFilters[3]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18229);filters.add(falseFilters[3]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18230);filters.add(trueFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18231);filters.add(trueFilters[3]);
      // test 7 true results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18232);final boolean[] trueResults = {false, false, false};
      // test 7 false results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18233);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1dz2dz2kylve2c9.R.inc(18234);testFilters.add(7, filters);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18235);testTrueResults.add(7, trueResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18236);testFalseResults.add(7, falseResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18237);testFileResults.add(7, Boolean.FALSE);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18238);testFilenameResults.add(7, Boolean.FALSE);
    }

    // test 8 - Test conditional and with fourth filters returning false
    {
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18239);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18240);filters.add(trueFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18241);filters.add(trueFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18242);filters.add(trueFilters[3]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18243);filters.add(falseFilters[1]);
      // test 8 true results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18244);final boolean[] trueResults = {true, true, true};
      // test 8 false results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18245);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1dz2dz2kylve2c9.R.inc(18246);testFilters.add(8, filters);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18247);testTrueResults.add(8, trueResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18248);testFalseResults.add(8, falseResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18249);testFileResults.add(8, Boolean.FALSE);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18250);testFilenameResults.add(8, Boolean.FALSE);
    }

    // test 9 - Test conditional and with all filters returning false
    {
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18251);final List<IOFileFilter> filters = new ArrayList<>();
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18252);filters.add(falseFilters[1]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18253);filters.add(falseFilters[2]);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18254);filters.add(falseFilters[3]);
      // test 9 true results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18255);final boolean[] trueResults = {false, false, false};
      // test 9 false results
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18256);final boolean[] falseResults = {true, false, false};

      __CLR4_4_1dz2dz2kylve2c9.R.inc(18257);testFilters.add(9, filters);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18258);testTrueResults.add(9, trueResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18259);testFalseResults.add(9, falseResults);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18260);testFileResults.add(9, Boolean.FALSE);
      __CLR4_4_1dz2dz2kylve2c9.R.inc(18261);testFilenameResults.add(9, Boolean.FALSE);
    }
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}

  @Test
  public void setTestFiltersClearsOld() {__CLR4_4_1dz2dz2kylve2c9.R.globalSliceStart(getClass().getName(),18262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cooc8xe3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dz2dz2kylve2c9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dz2dz2kylve2c9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.filefilter.AndFileFilterTestCase.setTestFiltersClearsOld",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),18262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cooc8xe3a(){try{__CLR4_4_1dz2dz2kylve2c9.R.inc(18262);
    // test that new filters correctly clear old filters
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18263);final List<IOFileFilter> simpleEmptyFileFilter = Collections.singletonList(EmptyFileFilter.EMPTY);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18264);final AndFileFilter andFileFilter = new AndFileFilter(simpleEmptyFileFilter);
    // make sure the filters at this point are the same
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18265);assertEquals(simpleEmptyFileFilter, andFileFilter.getFileFilters());

    __CLR4_4_1dz2dz2kylve2c9.R.inc(18266);final List<IOFileFilter> simpleNonEmptyFilter = Collections.singletonList(EmptyFileFilter.NOT_EMPTY);
    // when calling the setter the filters should reference the new filters
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18267);andFileFilter.setFileFilters(simpleNonEmptyFilter);
    __CLR4_4_1dz2dz2kylve2c9.R.inc(18268);assertEquals(simpleNonEmptyFilter, andFileFilter.getFileFilters());
  }finally{__CLR4_4_1dz2dz2kylve2c9.R.flushNeeded();}}
}
