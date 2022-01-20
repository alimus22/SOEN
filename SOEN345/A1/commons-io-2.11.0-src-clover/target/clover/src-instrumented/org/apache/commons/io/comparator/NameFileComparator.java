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
package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

import org.apache.commons.io.IOCase;

/**
 * Compare the <b>names</b> of two files for order (see {@link File#getName()}).
 * <p>
 * This comparator can be used to sort lists or arrays of files
 * by their name either in a case-sensitive, case-insensitive or
 * system dependent case sensitive way. A number of singleton instances
 * are provided for the various case sensitivity options (using {@link IOCase})
 * and the reverse of those options.
 * <p>
 * Example of a <i>case-sensitive</i> file name sort using the
 * {@link #NAME_COMPARATOR} singleton instance:
 * <pre>
 *       List&lt;File&gt; list = ...
 *       ((AbstractFileComparator) NameFileComparator.NAME_COMPARATOR).sort(list);
 * </pre>
 * <p>
 * Example of a <i>reverse case-insensitive</i> file name sort using the
 * {@link #NAME_INSENSITIVE_REVERSE} singleton instance:
 * <pre>
 *       File[] array = ...
 *       ((AbstractFileComparator) NameFileComparator.NAME_INSENSITIVE_REVERSE).sort(array);
 * </pre>
 * <p>
 *
 * @since 1.4
 */
public class NameFileComparator extends AbstractFileComparator implements Serializable {public static class __CLR4_4_12r22r2kylvdz3x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3576,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 8397947749814525798L;

    /** Case-sensitive name comparator instance (see {@link IOCase#SENSITIVE}) */
    public static final Comparator<File> NAME_COMPARATOR = new NameFileComparator();

    /** Reverse case-sensitive name comparator instance (see {@link IOCase#SENSITIVE}) */
    public static final Comparator<File> NAME_REVERSE = new ReverseFileComparator(NAME_COMPARATOR);

    /** Case-insensitive name comparator instance (see {@link IOCase#INSENSITIVE}) */
    public static final Comparator<File> NAME_INSENSITIVE_COMPARATOR = new NameFileComparator(IOCase.INSENSITIVE);

    /** Reverse case-insensitive name comparator instance (see {@link IOCase#INSENSITIVE}) */
    public static final Comparator<File> NAME_INSENSITIVE_REVERSE = new ReverseFileComparator(NAME_INSENSITIVE_COMPARATOR);

    /** System sensitive name comparator instance (see {@link IOCase#SYSTEM}) */
    public static final Comparator<File> NAME_SYSTEM_COMPARATOR = new NameFileComparator(IOCase.SYSTEM);

    /** Reverse system sensitive name comparator instance (see {@link IOCase#SYSTEM}) */
    public static final Comparator<File> NAME_SYSTEM_REVERSE = new ReverseFileComparator(NAME_SYSTEM_COMPARATOR);

    /** Whether the comparison is case sensitive. */
    private final IOCase caseSensitivity;

    /**
     * Construct a case sensitive file name comparator instance.
     */
    public NameFileComparator() {try{__CLR4_4_12r22r2kylvdz3x.R.inc(3566);
        __CLR4_4_12r22r2kylvdz3x.R.inc(3567);this.caseSensitivity = IOCase.SENSITIVE;
    }finally{__CLR4_4_12r22r2kylvdz3x.R.flushNeeded();}}

    /**
     * Construct a file name comparator instance with the specified case-sensitivity.
     *
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     */
    public NameFileComparator(final IOCase caseSensitivity) {try{__CLR4_4_12r22r2kylvdz3x.R.inc(3568);
        __CLR4_4_12r22r2kylvdz3x.R.inc(3569);this.caseSensitivity = (((caseSensitivity == null )&&(__CLR4_4_12r22r2kylvdz3x.R.iget(3570)!=0|true))||(__CLR4_4_12r22r2kylvdz3x.R.iget(3571)==0&false))? IOCase.SENSITIVE : caseSensitivity;
    }finally{__CLR4_4_12r22r2kylvdz3x.R.flushNeeded();}}

    /**
     * Compare the names of two files with the specified case sensitivity.
     *
     * @param file1 The first file to compare
     * @param file2 The second file to compare
     * @return a negative value if the first file's name
     * is less than the second, zero if the names are the
     * same and a positive value if the first files name
     * is greater than the second file.
     */
    @Override
    public int compare(final File file1, final File file2) {try{__CLR4_4_12r22r2kylvdz3x.R.inc(3572);
        __CLR4_4_12r22r2kylvdz3x.R.inc(3573);return caseSensitivity.checkCompareTo(file1.getName(), file2.getName());
    }finally{__CLR4_4_12r22r2kylvdz3x.R.flushNeeded();}}

    /**
     * String representation of this file comparator.
     *
     * @return String representation of this file comparator
     */
    @Override
    public String toString() {try{__CLR4_4_12r22r2kylvdz3x.R.inc(3574);
        __CLR4_4_12r22r2kylvdz3x.R.inc(3575);return super.toString() + "[caseSensitivity=" + caseSensitivity + "]";
    }finally{__CLR4_4_12r22r2kylvdz3x.R.flushNeeded();}}
}
