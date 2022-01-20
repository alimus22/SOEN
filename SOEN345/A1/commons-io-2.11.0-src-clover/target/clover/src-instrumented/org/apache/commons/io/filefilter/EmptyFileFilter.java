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
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

import org.apache.commons.io.IOUtils;

/**
 * This filter accepts files or directories that are empty.
 * <p>
 * If the {@code File} is a directory it checks that it contains no files.
 * </p>
 * <p>
 * Example, showing how to print out a list of the current directory's empty files/directories:
 * </p>
 * <h2>Using Classic IO</h2>
 * <pre>
 * File dir = new File(".");
 * String[] files = dir.list(EmptyFileFilter.EMPTY);
 * for (String file : files) {
 *     System.out.println(file);
 * }
 * </pre>
 *
 * <p>
 * Example, showing how to print out a list of the current directory's non-empty files/directories:
 * </p>
 *
 * <pre>
 * File dir = new File(".");
 * String[] files = dir.list(EmptyFileFilter.NOT_EMPTY);
 * for (String file : files) {
 *     System.out.println(file);
 * }
 * </pre>
 *
 * <h2>Using NIO</h2>
 * <pre>
 * final Path dir = Paths.get("");
 * final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(EmptyFileFilter.EMPTY);
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
 * @since 1.3
 */
public class EmptyFileFilter extends AbstractFileFilter implements Serializable {public static class __CLR4_4_13i03i0kylvdzd5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4554,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Singleton instance of <i>empty</i> filter */
    public static final IOFileFilter EMPTY = new EmptyFileFilter();

    /** Singleton instance of <i>not-empty</i> filter */
    public static final IOFileFilter NOT_EMPTY = EMPTY.negate();

    private static final long serialVersionUID = 3631422087512832211L;

    /**
     * Restrictive constructor.
     */
    protected EmptyFileFilter() {try{__CLR4_4_13i03i0kylvdzd5.R.inc(4536);
    }finally{__CLR4_4_13i03i0kylvdzd5.R.flushNeeded();}}

    /**
     * Checks to see if the file is empty.
     *
     * @param file the file or directory to check
     * @return {@code true} if the file or directory is <i>empty</i>, otherwise {@code false}.
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13i03i0kylvdzd5.R.inc(4537);
        __CLR4_4_13i03i0kylvdzd5.R.inc(4538);if ((((file.isDirectory())&&(__CLR4_4_13i03i0kylvdzd5.R.iget(4539)!=0|true))||(__CLR4_4_13i03i0kylvdzd5.R.iget(4540)==0&false))) {{
            __CLR4_4_13i03i0kylvdzd5.R.inc(4541);final File[] files = file.listFiles();
            __CLR4_4_13i03i0kylvdzd5.R.inc(4542);return IOUtils.length(files) == 0;
        }
        }__CLR4_4_13i03i0kylvdzd5.R.inc(4543);return file.length() == 0;
    }finally{__CLR4_4_13i03i0kylvdzd5.R.flushNeeded();}}

    /**
     * Checks to see if the file is empty.
     * @param file the file or directory to check
     *
     * @return {@code true} if the file or directory is <i>empty</i>, otherwise {@code false}.
     * @since 2.9.0
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_13i03i0kylvdzd5.R.inc(4544);
        __CLR4_4_13i03i0kylvdzd5.R.inc(4545);try {
            __CLR4_4_13i03i0kylvdzd5.R.inc(4546);if ((((Files.isDirectory(file))&&(__CLR4_4_13i03i0kylvdzd5.R.iget(4547)!=0|true))||(__CLR4_4_13i03i0kylvdzd5.R.iget(4548)==0&false))) {{
                class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_13i03i0kylvdzd5.R.inc(4549);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_13i03i0kylvdzd5.R.inc(4550);}};Stream<Path> stream = Files.list(file)) {
                    __CLR4_4_13i03i0kylvdzd5.R.inc(4551);return toFileVisitResult(!stream.findFirst().isPresent(), file);
                }
            }
            }__CLR4_4_13i03i0kylvdzd5.R.inc(4552);return toFileVisitResult(Files.size(file) == 0, file);
        } catch (final IOException e) {
            __CLR4_4_13i03i0kylvdzd5.R.inc(4553);return handle(e);
        }
    }finally{__CLR4_4_13i03i0kylvdzd5.R.flushNeeded();}}

}
