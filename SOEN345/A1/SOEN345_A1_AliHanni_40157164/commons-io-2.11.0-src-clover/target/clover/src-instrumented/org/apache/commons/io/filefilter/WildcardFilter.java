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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;

import org.apache.commons.io.FilenameUtils;

/**
 * Filters files using the supplied wildcards.
 * <p>
 * This filter selects files, but not directories, based on one or more wildcards
 * and using case-sensitive comparison.
 * </p>
 * <p>
 * The wildcard matcher uses the characters '?' and '*' to represent a
 * single or multiple wildcard characters.
 * This is the same as often found on Dos/Unix command lines.
 * The extension check is case-sensitive.
 * See {@link FilenameUtils#wildcardMatch(String, String)} for more information.
 * </p>
 * <p>
 * For example:
 * </p>
 * <h2>Using Classic IO</h2>
 * <pre>
 * File dir = new File(".");
 * FileFilter fileFilter = new WildcardFilter("*test*.java~*~");
 * File[] files = dir.listFiles(fileFilter);
 * for (String file : files) {
 *     System.out.println(file);
 * }
 * </pre>
 *
 * <h2>Using NIO</h2>
 * <pre>
 * final Path dir = Paths.get("");
 * final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(new WildcardFilter("*test*.java~*~"));
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
 * @since 1.1
 * @deprecated Use WildcardFileFilter. Deprecated as this class performs directory
 * filtering which it shouldn't do, but that can't be removed due to compatibility.
 */
@Deprecated
public class WildcardFilter extends AbstractFileFilter implements Serializable {public static class __CLR4_4_141v41vkylvdzn7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -5037645902506953517L;
    /** The wildcards that will be used to match file names. */
    private final String[] wildcards;

    /**
     * Construct a new case-sensitive wildcard filter for a list of wildcards.
     *
     * @param wildcards  the list of wildcards to match
     * @throws IllegalArgumentException if the pattern list is null
     * @throws ClassCastException if the list does not contain Strings
     */
    public WildcardFilter(final List<String> wildcards) {try{__CLR4_4_141v41vkylvdzn7.R.inc(5251);
        __CLR4_4_141v41vkylvdzn7.R.inc(5252);if ((((wildcards == null)&&(__CLR4_4_141v41vkylvdzn7.R.iget(5253)!=0|true))||(__CLR4_4_141v41vkylvdzn7.R.iget(5254)==0&false))) {{
            __CLR4_4_141v41vkylvdzn7.R.inc(5255);throw new IllegalArgumentException("The wildcard list must not be null");
        }
        }__CLR4_4_141v41vkylvdzn7.R.inc(5256);this.wildcards = wildcards.toArray(EMPTY_STRING_ARRAY);
    }finally{__CLR4_4_141v41vkylvdzn7.R.flushNeeded();}}

    /**
     * Construct a new case-sensitive wildcard filter for a single wildcard.
     *
     * @param wildcard  the wildcard to match
     * @throws IllegalArgumentException if the pattern is null
     */
    public WildcardFilter(final String wildcard) {try{__CLR4_4_141v41vkylvdzn7.R.inc(5257);
        __CLR4_4_141v41vkylvdzn7.R.inc(5258);if ((((wildcard == null)&&(__CLR4_4_141v41vkylvdzn7.R.iget(5259)!=0|true))||(__CLR4_4_141v41vkylvdzn7.R.iget(5260)==0&false))) {{
            __CLR4_4_141v41vkylvdzn7.R.inc(5261);throw new IllegalArgumentException("The wildcard must not be null");
        }
        }__CLR4_4_141v41vkylvdzn7.R.inc(5262);this.wildcards = new String[] { wildcard };
    }finally{__CLR4_4_141v41vkylvdzn7.R.flushNeeded();}}

    /**
     * Construct a new case-sensitive wildcard filter for an array of wildcards.
     *
     * @param wildcards  the array of wildcards to match
     * @throws IllegalArgumentException if the pattern array is null
     */
    public WildcardFilter(final String... wildcards) {try{__CLR4_4_141v41vkylvdzn7.R.inc(5263);
        __CLR4_4_141v41vkylvdzn7.R.inc(5264);if ((((wildcards == null)&&(__CLR4_4_141v41vkylvdzn7.R.iget(5265)!=0|true))||(__CLR4_4_141v41vkylvdzn7.R.iget(5266)==0&false))) {{
            __CLR4_4_141v41vkylvdzn7.R.inc(5267);throw new IllegalArgumentException("The wildcard array must not be null");
        }
        }__CLR4_4_141v41vkylvdzn7.R.inc(5268);this.wildcards = new String[wildcards.length];
        __CLR4_4_141v41vkylvdzn7.R.inc(5269);System.arraycopy(wildcards, 0, this.wildcards, 0, wildcards.length);
    }finally{__CLR4_4_141v41vkylvdzn7.R.flushNeeded();}}

    /**
     * Checks to see if the file name matches one of the wildcards.
     *
     * @param file the file to check
     * @return true if the file name matches one of the wildcards
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_141v41vkylvdzn7.R.inc(5270);
        __CLR4_4_141v41vkylvdzn7.R.inc(5271);if ((((file.isDirectory())&&(__CLR4_4_141v41vkylvdzn7.R.iget(5272)!=0|true))||(__CLR4_4_141v41vkylvdzn7.R.iget(5273)==0&false))) {{
            __CLR4_4_141v41vkylvdzn7.R.inc(5274);return false;
        }

        }__CLR4_4_141v41vkylvdzn7.R.inc(5275);for (final String wildcard : wildcards) {{
            __CLR4_4_141v41vkylvdzn7.R.inc(5276);if ((((FilenameUtils.wildcardMatch(file.getName(), wildcard))&&(__CLR4_4_141v41vkylvdzn7.R.iget(5277)!=0|true))||(__CLR4_4_141v41vkylvdzn7.R.iget(5278)==0&false))) {{
                __CLR4_4_141v41vkylvdzn7.R.inc(5279);return true;
            }
        }}

        }__CLR4_4_141v41vkylvdzn7.R.inc(5280);return false;
    }finally{__CLR4_4_141v41vkylvdzn7.R.flushNeeded();}}

    /**
     * Checks to see if the file name matches one of the wildcards.
     * @param file the file to check
     *
     * @return true if the file name matches one of the wildcards
     * @since 2.9.0
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_141v41vkylvdzn7.R.inc(5281);
        __CLR4_4_141v41vkylvdzn7.R.inc(5282);if ((((Files.isDirectory(file))&&(__CLR4_4_141v41vkylvdzn7.R.iget(5283)!=0|true))||(__CLR4_4_141v41vkylvdzn7.R.iget(5284)==0&false))) {{
            __CLR4_4_141v41vkylvdzn7.R.inc(5285);return FileVisitResult.TERMINATE;
        }

        }__CLR4_4_141v41vkylvdzn7.R.inc(5286);for (final String wildcard : wildcards) {{
            __CLR4_4_141v41vkylvdzn7.R.inc(5287);if ((((FilenameUtils.wildcardMatch(Objects.toString(file.getFileName(), null), wildcard))&&(__CLR4_4_141v41vkylvdzn7.R.iget(5288)!=0|true))||(__CLR4_4_141v41vkylvdzn7.R.iget(5289)==0&false))) {{
                __CLR4_4_141v41vkylvdzn7.R.inc(5290);return FileVisitResult.CONTINUE;
            }
        }}

        }__CLR4_4_141v41vkylvdzn7.R.inc(5291);return FileVisitResult.TERMINATE;
    }finally{__CLR4_4_141v41vkylvdzn7.R.flushNeeded();}}

    /**
     * Checks to see if the file name matches one of the wildcards.
     *
     * @param dir  the file directory
     * @param name  the file name
     * @return true if the file name matches one of the wildcards
     */
    @Override
    public boolean accept(final File dir, final String name) {try{__CLR4_4_141v41vkylvdzn7.R.inc(5292);
        __CLR4_4_141v41vkylvdzn7.R.inc(5293);if ((((dir != null && new File(dir, name).isDirectory())&&(__CLR4_4_141v41vkylvdzn7.R.iget(5294)!=0|true))||(__CLR4_4_141v41vkylvdzn7.R.iget(5295)==0&false))) {{
            __CLR4_4_141v41vkylvdzn7.R.inc(5296);return false;
        }

        }__CLR4_4_141v41vkylvdzn7.R.inc(5297);for (final String wildcard : wildcards) {{
            __CLR4_4_141v41vkylvdzn7.R.inc(5298);if ((((FilenameUtils.wildcardMatch(name, wildcard))&&(__CLR4_4_141v41vkylvdzn7.R.iget(5299)!=0|true))||(__CLR4_4_141v41vkylvdzn7.R.iget(5300)==0&false))) {{
                __CLR4_4_141v41vkylvdzn7.R.inc(5301);return true;
            }
        }}

        }__CLR4_4_141v41vkylvdzn7.R.inc(5302);return false;
    }finally{__CLR4_4_141v41vkylvdzn7.R.flushNeeded();}}

}
