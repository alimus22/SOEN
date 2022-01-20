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

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;

import org.apache.commons.io.IOCase;

/**
 * Filters files based on the suffix (what the file name ends with).
 * This is used in retrieving all the files of a particular type.
 * <p>
 * For example, to retrieve and print all {@code *.java} files
 * in the current directory:
 * </p>
 * <h2>Using Classic IO</h2>
 * <pre>
 * File dir = new File(".");
 * String[] files = dir.list(new SuffixFileFilter(".java"));
 * for (String file : files) {
 *     System.out.println(file);
 * }
 * </pre>
 *
 * <h2>Using NIO</h2>
 * <pre>
 * final Path dir = Paths.get("");
 * final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(new SuffixFileFilter(".java"));
 * //
 * // Walk one dir
 * Files.<b>walkFileTree</b>(dir, Collections.emptySet(), 1, visitor);
 * System.out.println(visitor.getPathCounters());
 * System.out.println(visitor.getFileList());
 * //
 * visitor.getPathCounters().reset();
 * //
 * // Walk dir tree
 * Files.<b>walkFileTree</b>(dir, visitor);
 * System.out.println(visitor.getPathCounters());
 * System.out.println(visitor.getDirList());
 * System.out.println(visitor.getFileList());
 * </pre>
 *
 * @since 1.0
 * @see FileFilterUtils#suffixFileFilter(String)
 * @see FileFilterUtils#suffixFileFilter(String, IOCase)
 */
public class SuffixFileFilter extends AbstractFileFilter implements Serializable {public static class __CLR4_4_13xu3xukylvdzlu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5170,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -3389157631240246157L;

    /** The file name suffixes to search for */
    private final String[] suffixes;

    /** Whether the comparison is case sensitive. */
    private final IOCase caseSensitivity;

    /**
     * Constructs a new Suffix file filter for a list of suffixes.
     *
     * @param suffixes  the suffixes to allow, must not be null
     * @throws IllegalArgumentException if the suffix list is null
     * @throws ClassCastException if the list does not contain Strings
     */
    public SuffixFileFilter(final List<String> suffixes) {
        this(suffixes, IOCase.SENSITIVE);__CLR4_4_13xu3xukylvdzlu.R.inc(5107);try{__CLR4_4_13xu3xukylvdzlu.R.inc(5106);
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    /**
     * Constructs a new Suffix file filter for a list of suffixes
     * specifying case-sensitivity.
     *
     * @param suffixes  the suffixes to allow, must not be null
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the suffix list is null
     * @throws ClassCastException if the list does not contain Strings
     * @since 1.4
     */
    public SuffixFileFilter(final List<String> suffixes, final IOCase caseSensitivity) {try{__CLR4_4_13xu3xukylvdzlu.R.inc(5108);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5109);if ((((suffixes == null)&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5110)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5111)==0&false))) {{
            __CLR4_4_13xu3xukylvdzlu.R.inc(5112);throw new IllegalArgumentException("The list of suffixes must not be null");
        }
        }__CLR4_4_13xu3xukylvdzlu.R.inc(5113);this.suffixes = suffixes.toArray(EMPTY_STRING_ARRAY);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5114);this.caseSensitivity = (((caseSensitivity == null )&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5115)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5116)==0&false))? IOCase.SENSITIVE : caseSensitivity;
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    /**
     * Constructs a new Suffix file filter for a single extension.
     *
     * @param suffix  the suffix to allow, must not be null
     * @throws IllegalArgumentException if the suffix is null
     */
    public SuffixFileFilter(final String suffix) {
        this(suffix, IOCase.SENSITIVE);__CLR4_4_13xu3xukylvdzlu.R.inc(5118);try{__CLR4_4_13xu3xukylvdzlu.R.inc(5117);
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    /**
     * Constructs a new Suffix file filter for an array of suffixes.
     * <p>
     * The array is not cloned, so could be changed after constructing the
     * instance. This would be inadvisable however.
     *
     * @param suffixes  the suffixes to allow, must not be null
     * @throws IllegalArgumentException if the suffix array is null
     */
    public SuffixFileFilter(final String... suffixes) {
        this(suffixes, IOCase.SENSITIVE);__CLR4_4_13xu3xukylvdzlu.R.inc(5120);try{__CLR4_4_13xu3xukylvdzlu.R.inc(5119);
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    /**
     * Constructs a new Suffix file filter for a single extension
     * specifying case-sensitivity.
     *
     * @param suffix  the suffix to allow, must not be null
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the suffix is null
     * @since 1.4
     */
    public SuffixFileFilter(final String suffix, final IOCase caseSensitivity) {try{__CLR4_4_13xu3xukylvdzlu.R.inc(5121);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5122);if ((((suffix == null)&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5123)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5124)==0&false))) {{
            __CLR4_4_13xu3xukylvdzlu.R.inc(5125);throw new IllegalArgumentException("The suffix must not be null");
        }
        }__CLR4_4_13xu3xukylvdzlu.R.inc(5126);this.suffixes = new String[] {suffix};
        __CLR4_4_13xu3xukylvdzlu.R.inc(5127);this.caseSensitivity = (((caseSensitivity == null )&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5128)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5129)==0&false))? IOCase.SENSITIVE : caseSensitivity;
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    /**
     * Constructs a new Suffix file filter for an array of suffixes
     * specifying case-sensitivity.
     *
     * @param suffixes  the suffixes to allow, must not be null
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the suffix array is null
     * @since 1.4
     */
    public SuffixFileFilter(final String[] suffixes, final IOCase caseSensitivity) {try{__CLR4_4_13xu3xukylvdzlu.R.inc(5130);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5131);if ((((suffixes == null)&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5132)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5133)==0&false))) {{
            __CLR4_4_13xu3xukylvdzlu.R.inc(5134);throw new IllegalArgumentException("The array of suffixes must not be null");
        }
        }__CLR4_4_13xu3xukylvdzlu.R.inc(5135);this.suffixes = new String[suffixes.length];
        __CLR4_4_13xu3xukylvdzlu.R.inc(5136);System.arraycopy(suffixes, 0, this.suffixes, 0, suffixes.length);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5137);this.caseSensitivity = (((caseSensitivity == null )&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5138)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5139)==0&false))? IOCase.SENSITIVE : caseSensitivity;
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    /**
     * Checks to see if the file name ends with the suffix.
     *
     * @param file  the File to check
     * @return true if the file name ends with one of our suffixes
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13xu3xukylvdzlu.R.inc(5140);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5141);return accept(file.getName());
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    /**
     * Checks to see if the file name ends with the suffix.
     *
     * @param file  the File directory
     * @param name  the file name
     * @return true if the file name ends with one of our suffixes
     */
    @Override
    public boolean accept(final File file, final String name) {try{__CLR4_4_13xu3xukylvdzlu.R.inc(5142);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5143);return accept(name);
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    /**
     * Checks to see if the file name ends with the suffix.
     * @param file  the File to check
     *
     * @return true if the file name ends with one of our suffixes
     * @since 2.9.0
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_13xu3xukylvdzlu.R.inc(5144);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5145);return toFileVisitResult(accept(Objects.toString(file.getFileName(), null)), file);
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    private boolean accept(final String name) {try{__CLR4_4_13xu3xukylvdzlu.R.inc(5146);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5147);for (final String suffix : this.suffixes) {{
            __CLR4_4_13xu3xukylvdzlu.R.inc(5148);if ((((caseSensitivity.checkEndsWith(name, suffix))&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5149)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5150)==0&false))) {{
                __CLR4_4_13xu3xukylvdzlu.R.inc(5151);return true;
            }
        }}
        }__CLR4_4_13xu3xukylvdzlu.R.inc(5152);return false;
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

    /**
     * Provide a String representation of this file filter.
     *
     * @return a String representation
     */
    @Override
    public String toString() {try{__CLR4_4_13xu3xukylvdzlu.R.inc(5153);
        __CLR4_4_13xu3xukylvdzlu.R.inc(5154);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_13xu3xukylvdzlu.R.inc(5155);buffer.append(super.toString());
        __CLR4_4_13xu3xukylvdzlu.R.inc(5156);buffer.append("(");
        __CLR4_4_13xu3xukylvdzlu.R.inc(5157);if ((((suffixes != null)&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5158)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5159)==0&false))) {{
            __CLR4_4_13xu3xukylvdzlu.R.inc(5160);for (int i = 0; (((i < suffixes.length)&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5161)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5162)==0&false)); i++) {{
                __CLR4_4_13xu3xukylvdzlu.R.inc(5163);if ((((i > 0)&&(__CLR4_4_13xu3xukylvdzlu.R.iget(5164)!=0|true))||(__CLR4_4_13xu3xukylvdzlu.R.iget(5165)==0&false))) {{
                    __CLR4_4_13xu3xukylvdzlu.R.inc(5166);buffer.append(",");
                }
                }__CLR4_4_13xu3xukylvdzlu.R.inc(5167);buffer.append(suffixes[i]);
            }
        }}
        }__CLR4_4_13xu3xukylvdzlu.R.inc(5168);buffer.append(")");
        __CLR4_4_13xu3xukylvdzlu.R.inc(5169);return buffer.toString();
    }finally{__CLR4_4_13xu3xukylvdzlu.R.flushNeeded();}}

}
