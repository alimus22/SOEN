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
 * Filters file names for a certain name.
 * <p>
 * For example, to print all files and directories in the
 * current directory whose name is {@code Test}:
 * </p>
 * <h2>Using Classic IO</h2>
 * <pre>
 * File dir = new File(".");
 * String[] files = dir.list(new NameFileFilter("Test"));
 * for (String file : files) {
 *     System.out.println(file);
 * }
 * </pre>
 *
 * <h2>Using NIO</h2>
 * <pre>
 * final Path dir = Paths.get("");
 * final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(new NameFileFilter("Test"));
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
 * @see FileFilterUtils#nameFileFilter(String)
 * @see FileFilterUtils#nameFileFilter(String, IOCase)
 */
public class NameFileFilter extends AbstractFileFilter implements Serializable {public static class __CLR4_4_13pj3pjkylvdzhs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4869,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 176844364689077340L;

    /** The file names to search for */
    private final String[] names;

    /** Whether the comparison is case sensitive. */
    private final IOCase caseSensitivity;

    /**
     * Constructs a new case-sensitive name file filter for a list of names.
     *
     * @param names  the names to allow, must not be null
     * @throws IllegalArgumentException if the name list is null
     * @throws ClassCastException if the list does not contain Strings
     */
    public NameFileFilter(final List<String> names) {
        this(names, null);__CLR4_4_13pj3pjkylvdzhs.R.inc(4808);try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4807);
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    /**
     * Constructs a new name file filter for a list of names specifying case-sensitivity.
     *
     * @param names  the names to allow, must not be null
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the name list is null
     * @throws ClassCastException if the list does not contain Strings
     */
    public NameFileFilter(final List<String> names, final IOCase caseSensitivity) {try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4809);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4810);if ((((names == null)&&(__CLR4_4_13pj3pjkylvdzhs.R.iget(4811)!=0|true))||(__CLR4_4_13pj3pjkylvdzhs.R.iget(4812)==0&false))) {{
            __CLR4_4_13pj3pjkylvdzhs.R.inc(4813);throw new IllegalArgumentException("The list of names must not be null");
        }
        }__CLR4_4_13pj3pjkylvdzhs.R.inc(4814);this.names = names.toArray(EMPTY_STRING_ARRAY);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4815);this.caseSensitivity = toIOCase(caseSensitivity);
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    /**
     * Constructs a new case-sensitive name file filter for a single name.
     *
     * @param name  the name to allow, must not be null
     * @throws IllegalArgumentException if the name is null
     */
    public NameFileFilter(final String name) {
        this(name, IOCase.SENSITIVE);__CLR4_4_13pj3pjkylvdzhs.R.inc(4817);try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4816);
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    /**
     * Constructs a new case-sensitive name file filter for an array of names.
     * <p>
     * The array is not cloned, so could be changed after constructing the
     * instance. This would be inadvisable however.
     * </p>
     *
     * @param names  the names to allow, must not be null
     * @throws IllegalArgumentException if the names array is null
     */
    public NameFileFilter(final String... names) {
        this(names, IOCase.SENSITIVE);__CLR4_4_13pj3pjkylvdzhs.R.inc(4819);try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4818);
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    /**
     * Construct a new name file filter specifying case-sensitivity.
     *
     * @param name  the name to allow, must not be null
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the name is null
     */
    public NameFileFilter(final String name, final IOCase caseSensitivity) {try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4820);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4821);if ((((name == null)&&(__CLR4_4_13pj3pjkylvdzhs.R.iget(4822)!=0|true))||(__CLR4_4_13pj3pjkylvdzhs.R.iget(4823)==0&false))) {{
            __CLR4_4_13pj3pjkylvdzhs.R.inc(4824);throw new IllegalArgumentException("The wildcard must not be null");
        }
        }__CLR4_4_13pj3pjkylvdzhs.R.inc(4825);this.names = new String[] {name};
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4826);this.caseSensitivity = toIOCase(caseSensitivity);
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    /**
     * Constructs a new name file filter for an array of names specifying case-sensitivity.
     *
     * @param names  the names to allow, must not be null
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the names array is null
     */
    public NameFileFilter(final String[] names, final IOCase caseSensitivity) {try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4827);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4828);if ((((names == null)&&(__CLR4_4_13pj3pjkylvdzhs.R.iget(4829)!=0|true))||(__CLR4_4_13pj3pjkylvdzhs.R.iget(4830)==0&false))) {{
            __CLR4_4_13pj3pjkylvdzhs.R.inc(4831);throw new IllegalArgumentException("The array of names must not be null");
        }
        }__CLR4_4_13pj3pjkylvdzhs.R.inc(4832);this.names = new String[names.length];
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4833);System.arraycopy(names, 0, this.names, 0, names.length);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4834);this.caseSensitivity = toIOCase(caseSensitivity);
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    /**
     * Checks to see if the file name matches.
     *
     * @param file  the File to check
     * @return true if the file name matches
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4835);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4836);return acceptBaseName(file.getName());
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    /**
     * Checks to see if the file name matches.
     *
     * @param dir  the File directory (ignored)
     * @param name  the file name
     * @return true if the file name matches
     */
    @Override
    public boolean accept(final File dir, final String name) {try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4837);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4838);return acceptBaseName(name);
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    /**
     * Checks to see if the file name matches.
     * @param file  the File to check
     *
     * @return true if the file name matches
     * @since 2.9.0
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4839);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4840);return toFileVisitResult(acceptBaseName(Objects.toString(file.getFileName(), null)), file);
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    private boolean acceptBaseName(final String baseName) {try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4841);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4842);for (final String testName : names) {{
            __CLR4_4_13pj3pjkylvdzhs.R.inc(4843);if ((((caseSensitivity.checkEquals(baseName, testName))&&(__CLR4_4_13pj3pjkylvdzhs.R.iget(4844)!=0|true))||(__CLR4_4_13pj3pjkylvdzhs.R.iget(4845)==0&false))) {{
                __CLR4_4_13pj3pjkylvdzhs.R.inc(4846);return true;
            }
        }}
        }__CLR4_4_13pj3pjkylvdzhs.R.inc(4847);return false;
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    private IOCase toIOCase(final IOCase caseSensitivity) {try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4848);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4849);return (((caseSensitivity == null )&&(__CLR4_4_13pj3pjkylvdzhs.R.iget(4850)!=0|true))||(__CLR4_4_13pj3pjkylvdzhs.R.iget(4851)==0&false))? IOCase.SENSITIVE : caseSensitivity;
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

    /**
     * Provide a String representation of this file filter.
     *
     * @return a String representation
     */
    @Override
    public String toString() {try{__CLR4_4_13pj3pjkylvdzhs.R.inc(4852);
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4853);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4854);buffer.append(super.toString());
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4855);buffer.append("(");
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4856);if ((((names != null)&&(__CLR4_4_13pj3pjkylvdzhs.R.iget(4857)!=0|true))||(__CLR4_4_13pj3pjkylvdzhs.R.iget(4858)==0&false))) {{
            __CLR4_4_13pj3pjkylvdzhs.R.inc(4859);for (int i = 0; (((i < names.length)&&(__CLR4_4_13pj3pjkylvdzhs.R.iget(4860)!=0|true))||(__CLR4_4_13pj3pjkylvdzhs.R.iget(4861)==0&false)); i++) {{
                __CLR4_4_13pj3pjkylvdzhs.R.inc(4862);if ((((i > 0)&&(__CLR4_4_13pj3pjkylvdzhs.R.iget(4863)!=0|true))||(__CLR4_4_13pj3pjkylvdzhs.R.iget(4864)==0&false))) {{
                    __CLR4_4_13pj3pjkylvdzhs.R.inc(4865);buffer.append(",");
                }
                }__CLR4_4_13pj3pjkylvdzhs.R.inc(4866);buffer.append(names[i]);
            }
        }}
        }__CLR4_4_13pj3pjkylvdzhs.R.inc(4867);buffer.append(")");
        __CLR4_4_13pj3pjkylvdzhs.R.inc(4868);return buffer.toString();
    }finally{__CLR4_4_13pj3pjkylvdzhs.R.flushNeeded();}}

}
