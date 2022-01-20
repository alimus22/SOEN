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

import java.io.File;

public abstract class IOFileFilterAbstractTestCase {static class __CLR4_4_1f4uf4ukylve2ig{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,19678,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void assertFileFiltering(final int testNumber, final IOFileFilter filter, final File file, final boolean expected) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19614);
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19615);assertEquals(expected, filter.accept(file),
                "test " + testNumber + " Filter(File) " + filter.getClass().getName() + " not " + expected + " for " + file);
    }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

    public static void assertFilenameFiltering(final int testNumber, final IOFileFilter filter, final File file, final boolean expected) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19616);
        // Assumes file has parent and is not passed as null
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19617);assertEquals(expected, filter.accept(file.getParentFile(), file.getName()),
                "test " + testNumber + " Filter(File, String) " + filter.getClass().getName() + " not " + expected + " for " + file);
    }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

    public static void assertFiltering(final int testNumber, final IOFileFilter filter, final File file, final boolean expected) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19618);
        // Note. This only tests the (File, String) version if the parent of
        //       the File passed in is not null
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19619);assertEquals(expected, filter.accept(file),
            "test " + testNumber + " Filter(File) " + filter.getClass().getName() + " not " + expected + " for " + file);
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19620);assertEquals(expected, filter.accept(file.toPath(), null),
            "test " + testNumber + " Filter(File) " + filter.getClass().getName() + " not " + expected + " for " + file);

        __CLR4_4_1f4uf4ukylve2ig.R.inc(19621);if ((((file != null && file.getParentFile() != null)&&(__CLR4_4_1f4uf4ukylve2ig.R.iget(19622)!=0|true))||(__CLR4_4_1f4uf4ukylve2ig.R.iget(19623)==0&false))) {{
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19624);assertEquals(expected, filter.accept(file.getParentFile(), file.getName()),
                    "test " + testNumber + " Filter(File, String) " + filter.getClass().getName() + " not " + expected + " for " + file);
        } }else {__CLR4_4_1f4uf4ukylve2ig.R.inc(19625);if ((((file == null)&&(__CLR4_4_1f4uf4ukylve2ig.R.iget(19626)!=0|true))||(__CLR4_4_1f4uf4ukylve2ig.R.iget(19627)==0&false))) {{
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19628);assertEquals(expected, filter.accept(file),
                    "test " + testNumber + " Filter(File, String) " + filter.getClass().getName() + " not " + expected + " for null");
        }
    }}}finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

    public static void assertTrueFiltersInvoked(final int testNumber, final TesterTrueFileFilter[] filters, final boolean[] invoked) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19629);
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19630);for (int i = 1; (((i < filters.length)&&(__CLR4_4_1f4uf4ukylve2ig.R.iget(19631)!=0|true))||(__CLR4_4_1f4uf4ukylve2ig.R.iget(19632)==0&false)); i++) {{
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19633);assertEquals(invoked[i - 1], filters[i].isInvoked(), "test " + testNumber + " filter " + i + " invoked");
        }
    }}finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

    public static void assertFalseFiltersInvoked(final int testNumber, final TesterFalseFileFilter[] filters, final boolean[] invoked) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19634);
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19635);for (int i = 1; (((i < filters.length)&&(__CLR4_4_1f4uf4ukylve2ig.R.iget(19636)!=0|true))||(__CLR4_4_1f4uf4ukylve2ig.R.iget(19637)==0&false)); i++) {{
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19638);assertEquals(invoked[i - 1], filters[i].isInvoked(), "test " + testNumber + " filter " + i + " invoked");
        }
    }}finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

    public static File determineWorkingDirectoryPath(final String key, final String defaultPath) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19639);
        // Look for a system property to specify the working directory
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19640);final String workingPathName = System.getProperty(key, defaultPath);
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19641);return new File(workingPathName);
    }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

    public static void resetFalseFilters(final TesterFalseFileFilter[] filters) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19642);
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19643);for (final TesterFalseFileFilter filter : filters) {{
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19644);if ((((filter != null)&&(__CLR4_4_1f4uf4ukylve2ig.R.iget(19645)!=0|true))||(__CLR4_4_1f4uf4ukylve2ig.R.iget(19646)==0&false))) {{
                __CLR4_4_1f4uf4ukylve2ig.R.inc(19647);filter.reset();
            }
        }}
    }}finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

    public static void resetTrueFilters(final TesterTrueFileFilter[] filters) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19648);
        __CLR4_4_1f4uf4ukylve2ig.R.inc(19649);for (final TesterTrueFileFilter filter : filters) {{
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19650);if ((((filter != null)&&(__CLR4_4_1f4uf4ukylve2ig.R.iget(19651)!=0|true))||(__CLR4_4_1f4uf4ukylve2ig.R.iget(19652)==0&false))) {{
                __CLR4_4_1f4uf4ukylve2ig.R.inc(19653);filter.reset();
            }
        }}
    }}finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

    class TesterTrueFileFilter extends TrueFileFilter {

        private static final long serialVersionUID = 1828930358172422914L;
        private boolean invoked;

        @Override
        public boolean accept(final File file) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19654);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19655);setInvoked(true);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19656);return super.accept(file);
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

        @Override
        public boolean accept(final File file, final String str) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19657);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19658);setInvoked(true);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19659);return super.accept(file, str);
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

        public boolean isInvoked() {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19660);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19661);return this.invoked;
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

        public void setInvoked(final boolean invoked) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19662);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19663);this.invoked = invoked;
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

        public void reset() {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19664);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19665);setInvoked(false);
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}
    }

    class TesterFalseFileFilter extends FalseFileFilter {

        private static final long serialVersionUID = -3603047664010401872L;
        private boolean invoked;

        @Override
        public boolean accept(final File file) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19666);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19667);setInvoked(true);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19668);return super.accept(file);
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

        @Override
        public boolean accept(final File file, final String str) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19669);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19670);setInvoked(true);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19671);return super.accept(file, str);
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

        public boolean isInvoked() {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19672);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19673);return this.invoked;
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

        public void setInvoked(final boolean invoked) {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19674);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19675);this.invoked = invoked;
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}

        public void reset() {try{__CLR4_4_1f4uf4ukylve2ig.R.inc(19676);
            __CLR4_4_1f4uf4ukylve2ig.R.inc(19677);setInvoked(false);
        }finally{__CLR4_4_1f4uf4ukylve2ig.R.flushNeeded();}}
    }
}
