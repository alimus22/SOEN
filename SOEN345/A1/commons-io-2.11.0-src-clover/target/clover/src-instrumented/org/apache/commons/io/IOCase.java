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

import java.util.Objects;

/**
 * Enumeration of IO case sensitivity.
 * <p>
 * Different filing systems have different rules for case-sensitivity.
 * Windows is case-insensitive, Unix is case-sensitive.
 * </p>
 * <p>
 * This class captures that difference, providing an enumeration to
 * control how file name comparisons should be performed. It also provides
 * methods that use the enumeration to perform comparisons.
 * </p>
 * <p>
 * Wherever possible, you should use the {@code check} methods in this
 * class to compare file names.
 * </p>
 *
 * @since 1.3
 */
public enum IOCase {

    /**
     * The constant for case sensitive regardless of operating system.
     */
    SENSITIVE("Sensitive", true),

    /**
     * The constant for case insensitive regardless of operating system.
     */
    INSENSITIVE("Insensitive", false),

    /**
     * The constant for case sensitivity determined by the current operating system.
     * Windows is case-insensitive when comparing file names, Unix is case-sensitive.
     * <p>
     * <strong>Note:</strong> This only caters for Windows and Unix. Other operating
     * systems (e.g. OSX and OpenVMS) are treated as case sensitive if they use the
     * Unix file separator and case-insensitive if they use the Windows file separator
     * (see {@link java.io.File#separatorChar}).
     * </p>
     * <p>
     * If you serialize this constant on Windows, and deserialize on Unix, or vice
     * versa, then the value of the case-sensitivity flag will change.
     * </p>
     */
    SYSTEM("System", !FilenameUtils.isSystemWindows());

    /**
     * Tests for cases sensitivity in a null-safe manner.
     * 
     * @param caseSensitivity an IOCase.
     * @return true if the input is non-null and {@link #isCaseSensitive()}.
     * @since 2.10.0
     */
    public static boolean isCaseSensitive(final IOCase caseSensitivity) {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2425);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2426);return caseSensitivity != null && !caseSensitivity.isCaseSensitive();
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /** Serialization version. */
    private static final long serialVersionUID = -6343169151696340687L;

    /** The enumeration name. */
    private final String name;

    /** The sensitivity flag. */
    private final transient boolean sensitive;

    /**
     * Factory method to create an IOCase from a name.
     *
     * @param name  the name to find
     * @return the IOCase object
     * @throws IllegalArgumentException if the name is invalid
     */
    public static IOCase forName(final String name) {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2427);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2428);for (final IOCase ioCase : IOCase.values()) {{
            __CLR4_4_11vd1vdkylvdyvb.R.inc(2429);if ((((ioCase.getName().equals(name))&&(__CLR4_4_11vd1vdkylvdyvb.R.iget(2430)!=0|true))||(__CLR4_4_11vd1vdkylvdyvb.R.iget(2431)==0&false))) {{
                __CLR4_4_11vd1vdkylvdyvb.R.inc(2432);return ioCase;
            }
        }}
        }__CLR4_4_11vd1vdkylvdyvb.R.inc(2433);throw new IllegalArgumentException("Invalid IOCase name: " + name);
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Constructs a new instance.
     *
     * @param name  the name
     * @param sensitive  the sensitivity
     */
    IOCase(final String name, final boolean sensitive) {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2434);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2435);this.name = name;
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2436);this.sensitive = sensitive;
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Replaces the enumeration from the stream with a real one.
     * This ensures that the correct flag is set for SYSTEM.
     *
     * @return the resolved object
     */
    private Object readResolve() {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2437);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2438);return forName(name);
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Gets the name of the constant.
     *
     * @return the name of the constant
     */
    public String getName() {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2439);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2440);return name;
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Does the object represent case sensitive comparison.
     *
     * @return true if case sensitive
     */
    public boolean isCaseSensitive() {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2441);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2442);return sensitive;
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Compares two strings using the case-sensitivity rule.
     * <p>
     * This method mimics {@link String#compareTo} but takes case-sensitivity
     * into account.
     * </p>
     *
     * @param str1  the first string to compare, not null
     * @param str2  the second string to compare, not null
     * @return true if equal using the case rules
     * @throws NullPointerException if either string is null
     */
    public int checkCompareTo(final String str1, final String str2) {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2443);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2444);Objects.requireNonNull(str1, "str1");
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2445);Objects.requireNonNull(str2, "str2");
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2446);return (((sensitive )&&(__CLR4_4_11vd1vdkylvdyvb.R.iget(2447)!=0|true))||(__CLR4_4_11vd1vdkylvdyvb.R.iget(2448)==0&false))? str1.compareTo(str2) : str1.compareToIgnoreCase(str2);
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Compares two strings using the case-sensitivity rule.
     * <p>
     * This method mimics {@link String#equals} but takes case-sensitivity
     * into account.
     * </p>
     *
     * @param str1  the first string to compare, not null
     * @param str2  the second string to compare, not null
     * @return true if equal using the case rules
     * @throws NullPointerException if either string is null
     */
    public boolean checkEquals(final String str1, final String str2) {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2449);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2450);Objects.requireNonNull(str1, "str1");
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2451);Objects.requireNonNull(str2, "str2");
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2452);return (((sensitive )&&(__CLR4_4_11vd1vdkylvdyvb.R.iget(2453)!=0|true))||(__CLR4_4_11vd1vdkylvdyvb.R.iget(2454)==0&false))? str1.equals(str2) : str1.equalsIgnoreCase(str2);
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Checks if one string starts with another using the case-sensitivity rule.
     * <p>
     * This method mimics {@link String#startsWith(String)} but takes case-sensitivity
     * into account.
     * </p>
     *
     * @param str  the string to check
     * @param start  the start to compare against
     * @return true if equal using the case rules, false if either input is null
     */
    public boolean checkStartsWith(final String str, final String start) {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2455);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2456);return str != null && start != null && str.regionMatches(!sensitive, 0, start, 0, start.length());
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Checks if one string ends with another using the case-sensitivity rule.
     * <p>
     * This method mimics {@link String#endsWith} but takes case-sensitivity
     * into account.
     * </p>
     *
     * @param str  the string to check
     * @param end  the end to compare against
     * @return true if equal using the case rules, false if either input is null
     */
    public boolean checkEndsWith(final String str, final String end) {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2457);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2458);if ((((str == null || end == null)&&(__CLR4_4_11vd1vdkylvdyvb.R.iget(2459)!=0|true))||(__CLR4_4_11vd1vdkylvdyvb.R.iget(2460)==0&false))) {{
            __CLR4_4_11vd1vdkylvdyvb.R.inc(2461);return false;
        }
        }__CLR4_4_11vd1vdkylvdyvb.R.inc(2462);final int endLen = end.length();
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2463);return str.regionMatches(!sensitive, str.length() - endLen, end, 0, endLen);
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Checks if one string contains another starting at a specific index using the
     * case-sensitivity rule.
     * <p>
     * This method mimics parts of {@link String#indexOf(String, int)}
     * but takes case-sensitivity into account.
     * </p>
     *
     * @param str  the string to check, not null
     * @param strStartIndex  the index to start at in str
     * @param search  the start to search for, not null
     * @return the first index of the search String,
     *  -1 if no match or {@code null} string input
     * @throws NullPointerException if either string is null
     * @since 2.0
     */
    public int checkIndexOf(final String str, final int strStartIndex, final String search) {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2464);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2465);final int endIndex = str.length() - search.length();
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2466);if ((((endIndex >= strStartIndex)&&(__CLR4_4_11vd1vdkylvdyvb.R.iget(2467)!=0|true))||(__CLR4_4_11vd1vdkylvdyvb.R.iget(2468)==0&false))) {{
            __CLR4_4_11vd1vdkylvdyvb.R.inc(2469);for (int i = strStartIndex; (((i <= endIndex)&&(__CLR4_4_11vd1vdkylvdyvb.R.iget(2470)!=0|true))||(__CLR4_4_11vd1vdkylvdyvb.R.iget(2471)==0&false)); i++) {{
                __CLR4_4_11vd1vdkylvdyvb.R.inc(2472);if ((((checkRegionMatches(str, i, search))&&(__CLR4_4_11vd1vdkylvdyvb.R.iget(2473)!=0|true))||(__CLR4_4_11vd1vdkylvdyvb.R.iget(2474)==0&false))) {{
                    __CLR4_4_11vd1vdkylvdyvb.R.inc(2475);return i;
                }
            }}
        }}
        }__CLR4_4_11vd1vdkylvdyvb.R.inc(2476);return -1;
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Checks if one string contains another at a specific index using the case-sensitivity rule.
     * <p>
     * This method mimics parts of {@link String#regionMatches(boolean, int, String, int, int)}
     * but takes case-sensitivity into account.
     * </p>
     *
     * @param str  the string to check, not null
     * @param strStartIndex  the index to start at in str
     * @param search  the start to search for, not null
     * @return true if equal using the case rules
     * @throws NullPointerException if either string is null
     */
    public boolean checkRegionMatches(final String str, final int strStartIndex, final String search) {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2477);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2478);return str.regionMatches(!sensitive, strStartIndex, search, 0, search.length());
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

    /**
     * Gets a string describing the sensitivity.
     *
     * @return a string describing the sensitivity
     */
    @Override
    public String toString() {try{__CLR4_4_11vd1vdkylvdyvb.R.inc(2479);
        __CLR4_4_11vd1vdkylvdyvb.R.inc(2480);return name;
    }finally{__CLR4_4_11vd1vdkylvdyvb.R.flushNeeded();}}

;public static class __CLR4_4_11vd1vdkylvdyvb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,2481,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
