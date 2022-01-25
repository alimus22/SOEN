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

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;

/**
 * Compare the file name <b>extensions</b> for order
 * (see {@link FilenameUtils#getExtension(String)}).
 * <p>
 * This comparator can be used to sort lists or arrays of files
 * by their file extension either in a case-sensitive, case-insensitive or
 * system dependent case sensitive way. A number of singleton instances
 * are provided for the various case sensitivity options (using {@link IOCase})
 * and the reverse of those options.
 * <p>
 * Example of a <i>case-sensitive</i> file extension sort using the
 * {@link #EXTENSION_COMPARATOR} singleton instance:
 * <pre>
 *       List&lt;File&gt; list = ...
 *       ((AbstractFileComparator) ExtensionFileComparator.EXTENSION_COMPARATOR).sort(list);
 * </pre>
 * <p>
 * Example of a <i>reverse case-insensitive</i> file extension sort using the
 * {@link #EXTENSION_INSENSITIVE_REVERSE} singleton instance:
 * <pre>
 *       File[] array = ...
 *       ((AbstractFileComparator) ExtensionFileComparator.EXTENSION_INSENSITIVE_REVERSE).sort(array);
 * </pre>
 * <p>
 *
 * @since 1.4
 */
public class ExtensionFileComparator extends AbstractFileComparator implements Serializable {public static class __CLR4_4_12qf2qfkylvdz3g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3555,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1928235200184222815L;

    /** Case-sensitive extension comparator instance (see {@link IOCase#SENSITIVE}) */
    public static final Comparator<File> EXTENSION_COMPARATOR = new ExtensionFileComparator();

    /** Reverse case-sensitive extension comparator instance (see {@link IOCase#SENSITIVE}) */
    public static final Comparator<File> EXTENSION_REVERSE = new ReverseFileComparator(EXTENSION_COMPARATOR);

    /** Case-insensitive extension comparator instance (see {@link IOCase#INSENSITIVE}) */
    public static final Comparator<File> EXTENSION_INSENSITIVE_COMPARATOR
                                                = new ExtensionFileComparator(IOCase.INSENSITIVE);

    /** Reverse case-insensitive extension comparator instance (see {@link IOCase#INSENSITIVE}) */
    public static final Comparator<File> EXTENSION_INSENSITIVE_REVERSE
                                                = new ReverseFileComparator(EXTENSION_INSENSITIVE_COMPARATOR);

    /** System sensitive extension comparator instance (see {@link IOCase#SYSTEM}) */
    public static final Comparator<File> EXTENSION_SYSTEM_COMPARATOR = new ExtensionFileComparator(IOCase.SYSTEM);

    /** Reverse system sensitive path comparator instance (see {@link IOCase#SYSTEM}) */
    public static final Comparator<File> EXTENSION_SYSTEM_REVERSE = new ReverseFileComparator(EXTENSION_SYSTEM_COMPARATOR);

    /** Whether the comparison is case sensitive. */
    private final IOCase caseSensitivity;

    /**
     * Construct a case sensitive file extension comparator instance.
     */
    public ExtensionFileComparator() {try{__CLR4_4_12qf2qfkylvdz3g.R.inc(3543);
        __CLR4_4_12qf2qfkylvdz3g.R.inc(3544);this.caseSensitivity = IOCase.SENSITIVE;
    }finally{__CLR4_4_12qf2qfkylvdz3g.R.flushNeeded();}}

    /**
     * Construct a file extension comparator instance with the specified case-sensitivity.
     *
     * @param caseSensitivity how to handle case sensitivity, null means case-sensitive
     */
    public ExtensionFileComparator(final IOCase caseSensitivity) {try{__CLR4_4_12qf2qfkylvdz3g.R.inc(3545);
        __CLR4_4_12qf2qfkylvdz3g.R.inc(3546);this.caseSensitivity = (((caseSensitivity == null )&&(__CLR4_4_12qf2qfkylvdz3g.R.iget(3547)!=0|true))||(__CLR4_4_12qf2qfkylvdz3g.R.iget(3548)==0&false))? IOCase.SENSITIVE : caseSensitivity;
    }finally{__CLR4_4_12qf2qfkylvdz3g.R.flushNeeded();}}

    /**
     * Compare the extensions of two files the specified case sensitivity.
     *
     * @param file1 The first file to compare
     * @param file2 The second file to compare
     * @return a negative value if the first file's extension
     * is less than the second, zero if the extensions are the
     * same and a positive value if the first files extension
     * is greater than the second file.
     *
     */
    @Override
    public int compare(final File file1, final File file2) {try{__CLR4_4_12qf2qfkylvdz3g.R.inc(3549);
        __CLR4_4_12qf2qfkylvdz3g.R.inc(3550);final String suffix1 = FilenameUtils.getExtension(file1.getName());
        __CLR4_4_12qf2qfkylvdz3g.R.inc(3551);final String suffix2 = FilenameUtils.getExtension(file2.getName());
        __CLR4_4_12qf2qfkylvdz3g.R.inc(3552);return caseSensitivity.checkCompareTo(suffix1, suffix2);
    }finally{__CLR4_4_12qf2qfkylvdz3g.R.flushNeeded();}}

    /**
     * String representation of this file comparator.
     *
     * @return String representation of this file comparator
     */
    @Override
    public String toString() {try{__CLR4_4_12qf2qfkylvdz3g.R.inc(3553);
        __CLR4_4_12qf2qfkylvdz3g.R.inc(3554);return super.toString() + "[caseSensitivity=" + caseSensitivity + "]";
    }finally{__CLR4_4_12qf2qfkylvdz3g.R.flushNeeded();}}
}
