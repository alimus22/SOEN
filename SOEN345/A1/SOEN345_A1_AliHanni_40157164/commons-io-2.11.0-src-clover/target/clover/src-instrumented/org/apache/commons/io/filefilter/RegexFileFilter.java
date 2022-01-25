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
import java.util.function.Function;
import java.util.regex.Pattern;

import org.apache.commons.io.IOCase;

/**
 * Filters files using supplied regular expression(s).
 * <p>
 * See java.util.regex.Pattern for regex matching rules.
 * </p>
 * <h2>Using Classic IO</h2>
 * <p>
 * e.g.
 *
 * <pre>
 * File dir = new File(".");
 * FileFilter fileFilter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
 * File[] files = dir.listFiles(fileFilter);
 * for (String file : files) {
 *     System.out.println(file);
 * }
 * </pre>
 *
 * <h2>Using NIO</h2>
 *
 * <pre>
 * final Path dir = Paths.get("");
 * final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$"));
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
 * @since 1.4
 */
public class RegexFileFilter extends AbstractFileFilter implements Serializable {public static class __CLR4_4_13wb3wbkylvdzko{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5082,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 4269646126155225062L;

    /**
     * Compiles the given pattern source.
     *
     * @param pattern the source pattern.
     * @param flags the compilation flags.
     * @return a new Pattern.
     */
    private static Pattern compile(final String pattern, final int flags) {try{__CLR4_4_13wb3wbkylvdzko.R.inc(5051);
        __CLR4_4_13wb3wbkylvdzko.R.inc(5052);if ((((pattern == null)&&(__CLR4_4_13wb3wbkylvdzko.R.iget(5053)!=0|true))||(__CLR4_4_13wb3wbkylvdzko.R.iget(5054)==0&false))) {{
            __CLR4_4_13wb3wbkylvdzko.R.inc(5055);throw new IllegalArgumentException("Pattern is missing");
        }
        }__CLR4_4_13wb3wbkylvdzko.R.inc(5056);return Pattern.compile(pattern, flags);
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

    /**
     * Converts IOCase to Pattern compilation flags.
     *
     * @param caseSensitivity case-sensitivity.
     * @return Pattern compilation flags.
     */
    private static int toFlags(final IOCase caseSensitivity) {try{__CLR4_4_13wb3wbkylvdzko.R.inc(5057);
        __CLR4_4_13wb3wbkylvdzko.R.inc(5058);return (((IOCase.isCaseSensitive(caseSensitivity) )&&(__CLR4_4_13wb3wbkylvdzko.R.iget(5059)!=0|true))||(__CLR4_4_13wb3wbkylvdzko.R.iget(5060)==0&false))? Pattern.CASE_INSENSITIVE : 0;
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

    /** The regular expression pattern that will be used to match file names. */
    private final Pattern pattern;
    
    /** How convert a path to a string. */
    private final Function<Path, String> pathToString;

    /**
     * Constructs a new regular expression filter for a compiled regular expression
     *
     * @param pattern regular expression to match.
     * @throws IllegalArgumentException if the pattern is null.
     */
    public RegexFileFilter(final Pattern pattern) {
        this(pattern, p -> p.getFileName().toString());__CLR4_4_13wb3wbkylvdzko.R.inc(5062);try{__CLR4_4_13wb3wbkylvdzko.R.inc(5061);
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

    /**
     * Constructs a new regular expression filter for a compiled regular expression
     *
     * @param pattern regular expression to match.
     * @param pathToString How convert a path to a string.
     * @throws IllegalArgumentException if the pattern is null.
     * @since 2.10.0
     */
    public RegexFileFilter(final Pattern pattern, final Function<Path, String> pathToString) {try{__CLR4_4_13wb3wbkylvdzko.R.inc(5063);
        __CLR4_4_13wb3wbkylvdzko.R.inc(5064);if ((((pattern == null)&&(__CLR4_4_13wb3wbkylvdzko.R.iget(5065)!=0|true))||(__CLR4_4_13wb3wbkylvdzko.R.iget(5066)==0&false))) {{
            __CLR4_4_13wb3wbkylvdzko.R.inc(5067);throw new IllegalArgumentException("Pattern is missing");
        }
        }__CLR4_4_13wb3wbkylvdzko.R.inc(5068);this.pattern = pattern;
        __CLR4_4_13wb3wbkylvdzko.R.inc(5069);this.pathToString = pathToString;
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

    /**
     * Constructs a new regular expression filter.
     *
     * @param pattern regular string expression to match
     * @throws IllegalArgumentException if the pattern is null
     */
    public RegexFileFilter(final String pattern) {
        this(pattern, 0);__CLR4_4_13wb3wbkylvdzko.R.inc(5071);try{__CLR4_4_13wb3wbkylvdzko.R.inc(5070);
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

    /**
     * Constructs a new regular expression filter with the specified flags.
     *
     * @param pattern regular string expression to match
     * @param flags pattern flags - e.g. {@link Pattern#CASE_INSENSITIVE}
     * @throws IllegalArgumentException if the pattern is null
     */
    public RegexFileFilter(final String pattern, final int flags) {
        this(compile(pattern, flags));__CLR4_4_13wb3wbkylvdzko.R.inc(5073);try{__CLR4_4_13wb3wbkylvdzko.R.inc(5072);
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

    /**
     * Constructs a new regular expression filter with the specified flags case sensitivity.
     *
     * @param pattern regular string expression to match
     * @param caseSensitivity how to handle case sensitivity, null means case-sensitive
     * @throws IllegalArgumentException if the pattern is null
     */
    public RegexFileFilter(final String pattern, final IOCase caseSensitivity) {
        this(compile(pattern, toFlags(caseSensitivity)));__CLR4_4_13wb3wbkylvdzko.R.inc(5075);try{__CLR4_4_13wb3wbkylvdzko.R.inc(5074);
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

    /**
     * Checks to see if the file name matches one of the regular expressions.
     *
     * @param dir the file directory (ignored)
     * @param name the file name
     * @return true if the file name matches one of the regular expressions
     */
    @Override
    public boolean accept(final File dir, final String name) {try{__CLR4_4_13wb3wbkylvdzko.R.inc(5076);
        __CLR4_4_13wb3wbkylvdzko.R.inc(5077);return pattern.matcher(name).matches();
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

    /**
     * Checks to see if the file name matches one of the regular expressions.
     *
     * @param path the path
     * @param attributes the path attributes
     * @return true if the file name matches one of the regular expressions
     */
    @Override
    public FileVisitResult accept(final Path path, final BasicFileAttributes attributes) {try{__CLR4_4_13wb3wbkylvdzko.R.inc(5078);
        __CLR4_4_13wb3wbkylvdzko.R.inc(5079);return toFileVisitResult(pattern.matcher(pathToString.apply(path)).matches(), path);
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

    /**
     * Returns a debug string.
     *
     * @since 2.10.0
     */
    @Override
    public String toString() {try{__CLR4_4_13wb3wbkylvdzko.R.inc(5080);
        __CLR4_4_13wb3wbkylvdzko.R.inc(5081);return "RegexFileFilter [pattern=" + pattern + "]";
    }finally{__CLR4_4_13wb3wbkylvdzko.R.flushNeeded();}}

}
