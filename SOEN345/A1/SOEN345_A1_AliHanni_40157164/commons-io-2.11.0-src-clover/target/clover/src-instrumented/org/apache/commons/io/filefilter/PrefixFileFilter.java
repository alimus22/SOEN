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

import org.apache.commons.io.IOCase;

/**
 * Filters file names for a certain prefix.
 * <p>
 * For example, to print all files and directories in the
 * current directory whose name starts with {@code Test}:
 * </p>
 * <h2>Using Classic IO</h2>
 * <pre>
 * File dir = new File(".");
 * String[] files = dir.list(new PrefixFileFilter("Test"));
 * for (String file : files) {
 *     System.out.println(file);
 * }
 * </pre>
 *
 * <h2>Using NIO</h2>
 * <pre>
 * final Path dir = Paths.get("");
 * final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(new PrefixFileFilter("Test"));
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
 * @see FileFilterUtils#prefixFileFilter(String)
 * @see FileFilterUtils#prefixFileFilter(String, IOCase)
 */
public class PrefixFileFilter extends AbstractFileFilter implements Serializable {public static class __CLR4_4_13ue3uekylvdzjs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 8533897440809599867L;

    /** The file name prefixes to search for */
    private final String[] prefixes;

    /** Whether the comparison is case sensitive. */
    private final IOCase caseSensitivity;

    /**
     * Constructs a new Prefix file filter for a list of prefixes.
     *
     * @param prefixes  the prefixes to allow, must not be null
     * @throws IllegalArgumentException if the prefix list is null
     * @throws ClassCastException if the list does not contain Strings
     */
    public PrefixFileFilter(final List<String> prefixes) {
        this(prefixes, IOCase.SENSITIVE);__CLR4_4_13ue3uekylvdzjs.R.inc(4983);try{__CLR4_4_13ue3uekylvdzjs.R.inc(4982);
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    /**
     * Constructs a new Prefix file filter for a list of prefixes
     * specifying case-sensitivity.
     *
     * @param prefixes  the prefixes to allow, must not be null
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the prefix list is null
     * @throws ClassCastException if the list does not contain Strings
     * @since 1.4
     */
    public PrefixFileFilter(final List<String> prefixes, final IOCase caseSensitivity) {try{__CLR4_4_13ue3uekylvdzjs.R.inc(4984);
        __CLR4_4_13ue3uekylvdzjs.R.inc(4985);if ((((prefixes == null)&&(__CLR4_4_13ue3uekylvdzjs.R.iget(4986)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(4987)==0&false))) {{
            __CLR4_4_13ue3uekylvdzjs.R.inc(4988);throw new IllegalArgumentException("The list of prefixes must not be null");
        }
        }__CLR4_4_13ue3uekylvdzjs.R.inc(4989);this.prefixes = prefixes.toArray(EMPTY_STRING_ARRAY);
        __CLR4_4_13ue3uekylvdzjs.R.inc(4990);this.caseSensitivity = (((caseSensitivity == null )&&(__CLR4_4_13ue3uekylvdzjs.R.iget(4991)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(4992)==0&false))? IOCase.SENSITIVE : caseSensitivity;
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    /**
     * Constructs a new Prefix file filter for a single prefix.
     *
     * @param prefix  the prefix to allow, must not be null
     * @throws IllegalArgumentException if the prefix is null
     */
    public PrefixFileFilter(final String prefix) {
        this(prefix, IOCase.SENSITIVE);__CLR4_4_13ue3uekylvdzjs.R.inc(4994);try{__CLR4_4_13ue3uekylvdzjs.R.inc(4993);
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    /**
     * Constructs a new Prefix file filter for any of an array of prefixes.
     * <p>
     * The array is not cloned, so could be changed after constructing the
     * instance. This would be inadvisable however.
     *
     * @param prefixes  the prefixes to allow, must not be null
     * @throws IllegalArgumentException if the prefix array is null
     */
    public PrefixFileFilter(final String... prefixes) {
        this(prefixes, IOCase.SENSITIVE);__CLR4_4_13ue3uekylvdzjs.R.inc(4996);try{__CLR4_4_13ue3uekylvdzjs.R.inc(4995);
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    /**
     * Constructs a new Prefix file filter for a single prefix
     * specifying case-sensitivity.
     *
     * @param prefix  the prefix to allow, must not be null
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the prefix is null
     * @since 1.4
     */
    public PrefixFileFilter(final String prefix, final IOCase caseSensitivity) {try{__CLR4_4_13ue3uekylvdzjs.R.inc(4997);
        __CLR4_4_13ue3uekylvdzjs.R.inc(4998);if ((((prefix == null)&&(__CLR4_4_13ue3uekylvdzjs.R.iget(4999)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5000)==0&false))) {{
            __CLR4_4_13ue3uekylvdzjs.R.inc(5001);throw new IllegalArgumentException("The prefix must not be null");
        }
        }__CLR4_4_13ue3uekylvdzjs.R.inc(5002);this.prefixes = new String[] {prefix};
        __CLR4_4_13ue3uekylvdzjs.R.inc(5003);this.caseSensitivity = (((caseSensitivity == null )&&(__CLR4_4_13ue3uekylvdzjs.R.iget(5004)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5005)==0&false))? IOCase.SENSITIVE : caseSensitivity;
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    /**
     * Constructs a new Prefix file filter for any of an array of prefixes
     * specifying case-sensitivity.
     *
     * @param prefixes  the prefixes to allow, must not be null
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the prefix is null
     * @since 1.4
     */
    public PrefixFileFilter(final String[] prefixes, final IOCase caseSensitivity) {try{__CLR4_4_13ue3uekylvdzjs.R.inc(5006);
        __CLR4_4_13ue3uekylvdzjs.R.inc(5007);if ((((prefixes == null)&&(__CLR4_4_13ue3uekylvdzjs.R.iget(5008)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5009)==0&false))) {{
            __CLR4_4_13ue3uekylvdzjs.R.inc(5010);throw new IllegalArgumentException("The array of prefixes must not be null");
        }
        }__CLR4_4_13ue3uekylvdzjs.R.inc(5011);this.prefixes = new String[prefixes.length];
        __CLR4_4_13ue3uekylvdzjs.R.inc(5012);System.arraycopy(prefixes, 0, this.prefixes, 0, prefixes.length);
        __CLR4_4_13ue3uekylvdzjs.R.inc(5013);this.caseSensitivity = (((caseSensitivity == null )&&(__CLR4_4_13ue3uekylvdzjs.R.iget(5014)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5015)==0&false))? IOCase.SENSITIVE : caseSensitivity;
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    /**
     * Checks to see if the file name starts with the prefix.
     *
     * @param file  the File to check
     * @return true if the file name starts with one of our prefixes
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13ue3uekylvdzjs.R.inc(5016);
        __CLR4_4_13ue3uekylvdzjs.R.inc(5017);return accept((((file == null )&&(__CLR4_4_13ue3uekylvdzjs.R.iget(5018)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5019)==0&false))? null : file.getName());
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    /**
     * Checks to see if the file name starts with the prefix.
     *
     * @param file  the File directory
     * @param name  the file name
     * @return true if the file name starts with one of our prefixes
     */
    @Override
    public boolean accept(final File file, final String name) {try{__CLR4_4_13ue3uekylvdzjs.R.inc(5020);
        __CLR4_4_13ue3uekylvdzjs.R.inc(5021);return accept(name);
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    /**
     * Checks to see if the file name starts with the prefix.
     * @param file  the File to check
     *
     * @return true if the file name starts with one of our prefixes
     * @since 2.9.0
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_13ue3uekylvdzjs.R.inc(5022);
        __CLR4_4_13ue3uekylvdzjs.R.inc(5023);final Path fileName = file.getFileName();
        __CLR4_4_13ue3uekylvdzjs.R.inc(5024);return toFileVisitResult(accept((((fileName == null )&&(__CLR4_4_13ue3uekylvdzjs.R.iget(5025)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5026)==0&false))? null : fileName.toFile()), file);
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    private boolean accept(final String name) {try{__CLR4_4_13ue3uekylvdzjs.R.inc(5027);
        __CLR4_4_13ue3uekylvdzjs.R.inc(5028);for (final String prefix : prefixes) {{
            __CLR4_4_13ue3uekylvdzjs.R.inc(5029);if ((((caseSensitivity.checkStartsWith(name, prefix))&&(__CLR4_4_13ue3uekylvdzjs.R.iget(5030)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5031)==0&false))) {{
                __CLR4_4_13ue3uekylvdzjs.R.inc(5032);return true;
            }
        }}
        }__CLR4_4_13ue3uekylvdzjs.R.inc(5033);return false;
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

    /**
     * Provide a String representation of this file filter.
     *
     * @return a String representation
     */
    @Override
    public String toString() {try{__CLR4_4_13ue3uekylvdzjs.R.inc(5034);
        __CLR4_4_13ue3uekylvdzjs.R.inc(5035);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_13ue3uekylvdzjs.R.inc(5036);buffer.append(super.toString());
        __CLR4_4_13ue3uekylvdzjs.R.inc(5037);buffer.append("(");
        __CLR4_4_13ue3uekylvdzjs.R.inc(5038);if ((((prefixes != null)&&(__CLR4_4_13ue3uekylvdzjs.R.iget(5039)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5040)==0&false))) {{
            __CLR4_4_13ue3uekylvdzjs.R.inc(5041);for (int i = 0; (((i < prefixes.length)&&(__CLR4_4_13ue3uekylvdzjs.R.iget(5042)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5043)==0&false)); i++) {{
                __CLR4_4_13ue3uekylvdzjs.R.inc(5044);if ((((i > 0)&&(__CLR4_4_13ue3uekylvdzjs.R.iget(5045)!=0|true))||(__CLR4_4_13ue3uekylvdzjs.R.iget(5046)==0&false))) {{
                    __CLR4_4_13ue3uekylvdzjs.R.inc(5047);buffer.append(",");
                }
                }__CLR4_4_13ue3uekylvdzjs.R.inc(5048);buffer.append(prefixes[i]);
            }
        }}
        }__CLR4_4_13ue3uekylvdzjs.R.inc(5049);buffer.append(")");
        __CLR4_4_13ue3uekylvdzjs.R.inc(5050);return buffer.toString();
    }finally{__CLR4_4_13ue3uekylvdzjs.R.flushNeeded();}}

}
