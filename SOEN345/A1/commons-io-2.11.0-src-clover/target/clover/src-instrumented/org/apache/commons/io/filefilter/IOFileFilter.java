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
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import org.apache.commons.io.file.PathFilter;

/**
 * An interface which brings the FileFilter, FilenameFilter, and PathFilter interfaces together.
 *
 * @since 1.0
 */
public interface IOFileFilter extends FileFilter, FilenameFilter, PathFilter {public static class __CLR4_4_13n93n9kylvdzfk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4733,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * An empty String array.
     */
    String[] EMPTY_STRING_ARRAY = {};

    /**
     * Checks to see if the File should be accepted by this filter.
     * <p>
     * Defined in {@link java.io.FileFilter}.
     * </p>
     *
     * @param file the File to check.
     * @return true if this file matches the test.
     */
    @Override
    boolean accept(File file);

    /**
     * Checks to see if the File should be accepted by this filter.
     * <p>
     * Defined in {@link java.io.FilenameFilter}.
     * </p>
     *
     * @param dir the directory File to check.
     * @param name the file name within the directory to check.
     * @return true if this file matches the test.
     */
    @Override
    boolean accept(File dir, String name);

    /**
     * Checks to see if the Path should be accepted by this filter.
     *
     * @param path the Path to check.
     * @return true if this path matches the test.
     * @since 2.9.0
     */
    @Override
    default FileVisitResult accept(final Path path, final BasicFileAttributes attributes) {try{__CLR4_4_13n93n9kylvdzfk.R.inc(4725);
        __CLR4_4_13n93n9kylvdzfk.R.inc(4726);return AbstractFileFilter.toFileVisitResult(accept(path.toFile()), path);
    }finally{__CLR4_4_13n93n9kylvdzfk.R.flushNeeded();}}

    /**
     * Creates a new "and" filter with this filter.
     *
     * @param fileFilter the filter to "and".
     * @return a new filter.
     * @since 2.9.0
     */
    default IOFileFilter and(final IOFileFilter fileFilter) {try{__CLR4_4_13n93n9kylvdzfk.R.inc(4727);
        __CLR4_4_13n93n9kylvdzfk.R.inc(4728);return new AndFileFilter(this, fileFilter);
    }finally{__CLR4_4_13n93n9kylvdzfk.R.flushNeeded();}}

    /**
     * Creates a new "not" filter with this filter.
     *
     * @return a new filter.
     * @since 2.9.0
     */
    default IOFileFilter negate() {try{__CLR4_4_13n93n9kylvdzfk.R.inc(4729);
        __CLR4_4_13n93n9kylvdzfk.R.inc(4730);return new NotFileFilter(this);
    }finally{__CLR4_4_13n93n9kylvdzfk.R.flushNeeded();}}

    /**
     * Creates a new "or" filter with this filter.
     *
     * @param fileFilter the filter to "or".
     * @return a new filter.
     * @since 2.9.0
     */
    default IOFileFilter or(final IOFileFilter fileFilter) {try{__CLR4_4_13n93n9kylvdzfk.R.inc(4731);
        __CLR4_4_13n93n9kylvdzfk.R.inc(4732);return new OrFileFilter(this, fileFilter);
    }finally{__CLR4_4_13n93n9kylvdzfk.R.flushNeeded();}}

}
