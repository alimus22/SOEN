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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;

/**
 * Useful utilities for working with file filters. It provides access to all
 * file filter implementations in this package so you don't have to import
 * every class you use.
 *
 * @since 1.0
 */
public class FileFilterUtils {public static class __CLR4_4_13j93j9kylvdzez{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /* Constructed on demand and then cached */
    private static final IOFileFilter cvsFilter = notFileFilter(
            and(directoryFileFilter(), nameFileFilter("CVS")));


    /* Constructed on demand and then cached */
    private static final IOFileFilter svnFilter = notFileFilter(
            and(directoryFileFilter(), nameFileFilter(".svn")));

    /**
     * Returns a filter that returns true if the file was last modified before
     * or at the specified cutoff date.
     *
     * @param cutoffDate  the time threshold
     * @return an appropriately configured age file filter
     * @see AgeFileFilter
     * @since 1.2
     */
    public static IOFileFilter ageFileFilter(final Date cutoffDate) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4581);
        __CLR4_4_13j93j9kylvdzez.R.inc(4582);return new AgeFileFilter(cutoffDate);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that filters files based on a cutoff date.
     *
     * @param cutoffDate  the time threshold
     * @param acceptOlder  if true, older files get accepted, if false, newer
     * @return an appropriately configured age file filter
     * @see AgeFileFilter
     * @since 1.2
     */
    public static IOFileFilter ageFileFilter(final Date cutoffDate, final boolean acceptOlder) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4583);
        __CLR4_4_13j93j9kylvdzez.R.inc(4584);return new AgeFileFilter(cutoffDate, acceptOlder);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that returns true if the file was last modified before
     * or at the same time as the specified reference file.
     *
     * @param cutoffReference  the file whose last modification
     *        time is used as the threshold age of the files
     * @return an appropriately configured age file filter
     * @see AgeFileFilter
     * @since 1.2
     */
    public static IOFileFilter ageFileFilter(final File cutoffReference) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4585);
        __CLR4_4_13j93j9kylvdzez.R.inc(4586);return new AgeFileFilter(cutoffReference);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that filters files based on a cutoff reference file.
     *
     * @param cutoffReference  the file whose last modification
     *        time is used as the threshold age of the files
     * @param acceptOlder  if true, older files get accepted, if false, newer
     * @return an appropriately configured age file filter
     * @see AgeFileFilter
     * @since 1.2
     */
    public static IOFileFilter ageFileFilter(final File cutoffReference, final boolean acceptOlder) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4587);
        __CLR4_4_13j93j9kylvdzez.R.inc(4588);return new AgeFileFilter(cutoffReference, acceptOlder);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that returns true if the file was last modified before
     * or at the specified cutoff time.
     *
     * @param cutoff  the time threshold
     * @return an appropriately configured age file filter
     * @see AgeFileFilter
     * @since 1.2
     */
    public static IOFileFilter ageFileFilter(final long cutoff) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4589);
        __CLR4_4_13j93j9kylvdzez.R.inc(4590);return new AgeFileFilter(cutoff);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that filters files based on a cutoff time.
     *
     * @param cutoff  the time threshold
     * @param acceptOlder  if true, older files get accepted, if false, newer
     * @return an appropriately configured age file filter
     * @see AgeFileFilter
     * @since 1.2
     */
    public static IOFileFilter ageFileFilter(final long cutoff, final boolean acceptOlder) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4591);
        __CLR4_4_13j93j9kylvdzez.R.inc(4592);return new AgeFileFilter(cutoff, acceptOlder);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that ANDs the specified filters.
     *
     * @param filters the IOFileFilters that will be ANDed together.
     * @return a filter that ANDs the specified filters
     *
     * @throws IllegalArgumentException if the filters are null or contain a
     *         null value.
     * @see AndFileFilter
     * @since 2.0
     */
    public static IOFileFilter and(final IOFileFilter... filters) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4593);
        __CLR4_4_13j93j9kylvdzez.R.inc(4594);return new AndFileFilter(toList(filters));
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that ANDs the two specified filters.
     *
     * @param filter1  the first filter
     * @param filter2  the second filter
     * @return a filter that ANDs the two specified filters
     * @see #and(IOFileFilter...)
     * @see AndFileFilter
     * @deprecated use {@link #and(IOFileFilter...)}
     */
    @Deprecated
    public static IOFileFilter andFileFilter(final IOFileFilter filter1, final IOFileFilter filter2) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4595);
        __CLR4_4_13j93j9kylvdzez.R.inc(4596);return new AndFileFilter(filter1, filter2);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns an {@code IOFileFilter} that wraps the
     * {@code FileFilter} instance.
     *
     * @param filter  the filter to be wrapped
     * @return a new filter that implements IOFileFilter
     * @see DelegateFileFilter
     */
    public static IOFileFilter asFileFilter(final FileFilter filter) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4597);
        __CLR4_4_13j93j9kylvdzez.R.inc(4598);return new DelegateFileFilter(filter);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns an {@code IOFileFilter} that wraps the
     * {@code FilenameFilter} instance.
     *
     * @param filter  the filter to be wrapped
     * @return a new filter that implements IOFileFilter
     * @see DelegateFileFilter
     */
    public static IOFileFilter asFileFilter(final FilenameFilter filter) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4599);
        __CLR4_4_13j93j9kylvdzez.R.inc(4600);return new DelegateFileFilter(filter);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that checks if the file is a directory.
     *
     * @return file filter that accepts only directories and not files
     * @see DirectoryFileFilter#DIRECTORY
     */
    public static IOFileFilter directoryFileFilter() {try{__CLR4_4_13j93j9kylvdzez.R.inc(4601);
        __CLR4_4_13j93j9kylvdzez.R.inc(4602);return DirectoryFileFilter.DIRECTORY;
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that always returns false.
     *
     * @return a false filter
     * @see FalseFileFilter#FALSE
     */
    public static IOFileFilter falseFileFilter() {try{__CLR4_4_13j93j9kylvdzez.R.inc(4603);
        __CLR4_4_13j93j9kylvdzez.R.inc(4604);return FalseFileFilter.FALSE;
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that checks if the file is a file (and not a directory).
     *
     * @return file filter that accepts only files and not directories
     * @see FileFileFilter#INSTANCE
     */
    public static IOFileFilter fileFileFilter() {try{__CLR4_4_13j93j9kylvdzez.R.inc(4605);
        __CLR4_4_13j93j9kylvdzez.R.inc(4606);return FileFileFilter.INSTANCE;
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * <p>
     * Applies an {@link IOFileFilter} to the provided {@link File}
     * objects. The resulting array is a subset of the original file list that
     * matches the provided filter.
     * </p>
     *
     * <pre>
     * Set&lt;File&gt; allFiles = ...
     * Set&lt;File&gt; javaFiles = FileFilterUtils.filterSet(allFiles,
     *     FileFilterUtils.suffixFileFilter(".java"));
     * </pre>
     * @param filter the filter to apply to the set of files.
     * @param files the array of files to apply the filter to.
     *
     * @return a subset of {@code files} that is accepted by the
     *         file filter.
     * @throws IllegalArgumentException if the filter is {@code null}
     *         or {@code files} contains a {@code null} value.
     *
     * @since 2.0
     */
    public static File[] filter(final IOFileFilter filter, final File... files) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4607);
        __CLR4_4_13j93j9kylvdzez.R.inc(4608);if ((((filter == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4609)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4610)==0&false))) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4611);throw new IllegalArgumentException("file filter is null");
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4612);if ((((files == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4613)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4614)==0&false))) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4615);return FileUtils.EMPTY_FILE_ARRAY;
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4616);return filterFiles(filter, Stream.of(files), Collectors.toList()).toArray(FileUtils.EMPTY_FILE_ARRAY);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * <p>
     * Applies an {@link IOFileFilter} to the provided {@link File} stream and collects the accepted files.
     * </p>
     *
     * @param filter the filter to apply to the stream of files.
     * @param stream the stream of files on which to apply the filter.
     * @param collector how to collect the end result.
     *
     * @param <R> the return type.
     * @param <A> the mutable accumulation type of the reduction operation (often hidden as an implementation detail)
     * @return a subset of files from the stream that is accepted by the filter.
     * @throws IllegalArgumentException if the filter is {@code null}.
     */
    private static <R, A> R filterFiles(final IOFileFilter filter, final Stream<File> stream,
        final Collector<? super File, A, R> collector) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4617);
        //Objects.requireNonNull(filter, "filter");
        __CLR4_4_13j93j9kylvdzez.R.inc(4618);Objects.requireNonNull(collector, "collector");
        __CLR4_4_13j93j9kylvdzez.R.inc(4619);if ((((filter == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4620)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4621)==0&false))) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4622);throw new IllegalArgumentException("file filter is null");
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4623);if ((((stream == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4624)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4625)==0&false))) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4626);return Stream.<File>empty().collect(collector);
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4627);return stream.filter(filter::accept).collect(collector);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * <p>
     * Applies an {@link IOFileFilter} to the provided {@link File}
     * objects. The resulting array is a subset of the original file list that
     * matches the provided filter.
     * </p>
     *
     * <p>
     * The {@link Set} returned by this method is not guaranteed to be thread safe.
     * </p>
     *
     * <pre>
     * Set&lt;File&gt; allFiles = ...
     * Set&lt;File&gt; javaFiles = FileFilterUtils.filterSet(allFiles,
     *     FileFilterUtils.suffixFileFilter(".java"));
     * </pre>
     * @param filter the filter to apply to the set of files.
     * @param files the array of files to apply the filter to.
     *
     * @return a subset of {@code files} that is accepted by the
     *         file filter.
     * @throws IllegalArgumentException if the filter is {@code null}
     *         or {@code files} contains a {@code null} value.
     *
     * @since 2.0
     */
    public static File[] filter(final IOFileFilter filter, final Iterable<File> files) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4628);
        __CLR4_4_13j93j9kylvdzez.R.inc(4629);return filterList(filter, files).toArray(FileUtils.EMPTY_FILE_ARRAY);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * <p>
     * Applies an {@link IOFileFilter} to the provided {@link File}
     * objects. The resulting list is a subset of the original files that
     * matches the provided filter.
     * </p>
     *
     * <p>
     * The {@link List} returned by this method is not guaranteed to be thread safe.
     * </p>
     *
     * <pre>
     * List&lt;File&gt; filesAndDirectories = ...
     * List&lt;File&gt; directories = FileFilterUtils.filterList(filesAndDirectories,
     *     FileFilterUtils.directoryFileFilter());
     * </pre>
     * @param filter the filter to apply to each files in the list.
     * @param files the collection of files to apply the filter to.
     *
     * @return a subset of {@code files} that is accepted by the
     *         file filter.
     * @throws IllegalArgumentException if the filter is {@code null}
     *         or {@code files} contains a {@code null} value.
     * @since 2.0
     */
    public static List<File> filterList(final IOFileFilter filter, final File... files) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4630);
        __CLR4_4_13j93j9kylvdzez.R.inc(4631);return Arrays.asList(filter(filter, files));
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * <p>
     * Applies an {@link IOFileFilter} to the provided {@link File}
     * objects. The resulting list is a subset of the original files that
     * matches the provided filter.
     * </p>
     *
     * <p>
     * The {@link List} returned by this method is not guaranteed to be thread safe.
     * </p>
     *
     * <pre>
     * List&lt;File&gt; filesAndDirectories = ...
     * List&lt;File&gt; directories = FileFilterUtils.filterList(filesAndDirectories,
     *     FileFilterUtils.directoryFileFilter());
     * </pre>
     * @param filter the filter to apply to each files in the list.
     * @param files the collection of files to apply the filter to.
     *
     * @return a subset of {@code files} that is accepted by the
     *         file filter.
     * @throws IllegalArgumentException if the filter is {@code null}
     * @since 2.0
     */
    public static List<File> filterList(final IOFileFilter filter, final Iterable<File> files) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4632);
        __CLR4_4_13j93j9kylvdzez.R.inc(4633);if ((((files == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4634)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4635)==0&false))) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4636);return Collections.emptyList();
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4637);return filterFiles(filter, StreamSupport.stream(files.spliterator(), false), Collectors.toList());
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * <p>
     * Applies an {@link IOFileFilter} to the provided {@link File}
     * objects. The resulting set is a subset of the original file list that
     * matches the provided filter.
     * </p>
     *
     * <p>
     * The {@link Set} returned by this method is not guaranteed to be thread safe.
     * </p>
     *
     * <pre>
     * Set&lt;File&gt; allFiles = ...
     * Set&lt;File&gt; javaFiles = FileFilterUtils.filterSet(allFiles,
     *     FileFilterUtils.suffixFileFilter(".java"));
     * </pre>
     * @param filter the filter to apply to the set of files.
     * @param files the collection of files to apply the filter to.
     *
     * @return a subset of {@code files} that is accepted by the
     *         file filter.
     * @throws IllegalArgumentException if the filter is {@code null}
     *         or {@code files} contains a {@code null} value.
     *
     * @since 2.0
     */
    public static Set<File> filterSet(final IOFileFilter filter, final File... files) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4638);
        __CLR4_4_13j93j9kylvdzez.R.inc(4639);return new HashSet<>(Arrays.asList(filter(filter, files)));
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * <p>
     * Applies an {@link IOFileFilter} to the provided {@link File}
     * objects. The resulting set is a subset of the original file list that
     * matches the provided filter.
     * </p>
     *
     * <p>
     * The {@link Set} returned by this method is not guaranteed to be thread safe.
     * </p>
     *
     * <pre>
     * Set&lt;File&gt; allFiles = ...
     * Set&lt;File&gt; javaFiles = FileFilterUtils.filterSet(allFiles,
     *     FileFilterUtils.suffixFileFilter(".java"));
     * </pre>
     * @param filter the filter to apply to the set of files.
     * @param files the collection of files to apply the filter to.
     *
     * @return a subset of {@code files} that is accepted by the
     *         file filter.
     * @throws IllegalArgumentException if the filter is {@code null}
     *
     * @since 2.0
     */
    public static Set<File> filterSet(final IOFileFilter filter, final Iterable<File> files) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4640);
        __CLR4_4_13j93j9kylvdzez.R.inc(4641);if ((((files == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4642)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4643)==0&false))) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4644);return Collections.emptySet();
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4645);return filterFiles(filter, StreamSupport.stream(files.spliterator(), false), Collectors.toSet());
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that accepts files that begin with the provided magic
     * number.
     *
     * @param magicNumber the magic number (byte sequence) to match at the
     *        beginning of each file.
     *
     * @return an IOFileFilter that accepts files beginning with the provided
     *         magic number.
     *
     * @throws IllegalArgumentException if {@code magicNumber} is
     *         {@code null} or is of length zero.
     * @see MagicNumberFileFilter
     * @since 2.0
     */
    public static IOFileFilter magicNumberFileFilter(final byte[] magicNumber) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4646);
        __CLR4_4_13j93j9kylvdzez.R.inc(4647);return new MagicNumberFileFilter(magicNumber);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that accepts files that contains the provided magic
     * number at a specified offset within the file.
     *
     * @param magicNumber the magic number (byte sequence) to match at the
     *        provided offset in each file.
     * @param offset the offset within the files to look for the magic number.
     *
     * @return an IOFileFilter that accepts files containing the magic number
     *         at the specified offset.
     *
     * @throws IllegalArgumentException if {@code magicNumber} is
     *         {@code null}, or contains no bytes, or {@code offset}
     *         is a negative number.
     * @see MagicNumberFileFilter
     * @since 2.0
     */
    public static IOFileFilter magicNumberFileFilter(final byte[] magicNumber, final long offset) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4648);
        __CLR4_4_13j93j9kylvdzez.R.inc(4649);return new MagicNumberFileFilter(magicNumber, offset);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that accepts files that begin with the provided magic
     * number.
     *
     * @param magicNumber the magic number (byte sequence) to match at the
     *        beginning of each file.
     *
     * @return an IOFileFilter that accepts files beginning with the provided
     *         magic number.
     *
     * @throws IllegalArgumentException if {@code magicNumber} is
     *         {@code null} or the empty String.
     * @see MagicNumberFileFilter
     * @since 2.0
     */
    public static IOFileFilter magicNumberFileFilter(final String magicNumber) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4650);
        __CLR4_4_13j93j9kylvdzez.R.inc(4651);return new MagicNumberFileFilter(magicNumber);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that accepts files that contains the provided magic
     * number at a specified offset within the file.
     *
     * @param magicNumber the magic number (byte sequence) to match at the
     *        provided offset in each file.
     * @param offset the offset within the files to look for the magic number.
     *
     * @return an IOFileFilter that accepts files containing the magic number
     *         at the specified offset.
     *
     * @throws IllegalArgumentException if {@code magicNumber} is
     *         {@code null} or the empty String, or if offset is a
     *         negative number.
     * @see MagicNumberFileFilter
     * @since 2.0
     */
    public static IOFileFilter magicNumberFileFilter(final String magicNumber, final long offset) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4652);
        __CLR4_4_13j93j9kylvdzez.R.inc(4653);return new MagicNumberFileFilter(magicNumber, offset);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Decorates a filter to make it ignore CVS directories.
     * Passing in {@code null} will return a filter that accepts everything
     * except CVS directories.
     *
     * @param filter  the filter to decorate, null means an unrestricted filter
     * @return the decorated filter, never null
     * @since 1.1 (method existed but had bug in 1.0)
     */
    public static IOFileFilter makeCVSAware(final IOFileFilter filter) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4654);
        __CLR4_4_13j93j9kylvdzez.R.inc(4655);return (((filter == null )&&(__CLR4_4_13j93j9kylvdzez.R.iget(4656)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4657)==0&false))? cvsFilter : and(filter, cvsFilter);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Decorates a filter so that it only applies to directories and not to files.
     *
     * @param filter  the filter to decorate, null means an unrestricted filter
     * @return the decorated filter, never null
     * @see DirectoryFileFilter#DIRECTORY
     * @since 1.3
     */
    public static IOFileFilter makeDirectoryOnly(final IOFileFilter filter) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4658);
        __CLR4_4_13j93j9kylvdzez.R.inc(4659);if ((((filter == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4660)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4661)==0&false))) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4662);return DirectoryFileFilter.DIRECTORY;
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4663);return DirectoryFileFilter.DIRECTORY.and(filter);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Decorates a filter so that it only applies to files and not to directories.
     *
     * @param filter  the filter to decorate, null means an unrestricted filter
     * @return the decorated filter, never null
     * @see FileFileFilter#INSTANCE
     * @since 1.3
     */
    public static IOFileFilter makeFileOnly(final IOFileFilter filter) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4664);
        __CLR4_4_13j93j9kylvdzez.R.inc(4665);if ((((filter == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4666)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4667)==0&false))) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4668);return FileFileFilter.INSTANCE;
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4669);return FileFileFilter.INSTANCE.and(filter);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Decorates a filter to make it ignore SVN directories.
     * Passing in {@code null} will return a filter that accepts everything
     * except SVN directories.
     *
     * @param filter  the filter to decorate, null means an unrestricted filter
     * @return the decorated filter, never null
     * @since 1.1
     */
    public static IOFileFilter makeSVNAware(final IOFileFilter filter) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4670);
        __CLR4_4_13j93j9kylvdzez.R.inc(4671);return (((filter == null )&&(__CLR4_4_13j93j9kylvdzez.R.iget(4672)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4673)==0&false))? svnFilter : and(filter, svnFilter);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that returns true if the file name matches the specified text.
     *
     * @param name  the file name
     * @return a name checking filter
     * @see NameFileFilter
     */
    public static IOFileFilter nameFileFilter(final String name) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4674);
        __CLR4_4_13j93j9kylvdzez.R.inc(4675);return new NameFileFilter(name);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that returns true if the file name matches the specified text.
     *
     * @param name  the file name
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @return a name checking filter
     * @see NameFileFilter
     * @since 2.0
     */
    public static IOFileFilter nameFileFilter(final String name, final IOCase caseSensitivity) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4676);
        __CLR4_4_13j93j9kylvdzez.R.inc(4677);return new NameFileFilter(name, caseSensitivity);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that NOTs the specified filter.
     *
     * @param filter  the filter to invert
     * @return a filter that NOTs the specified filter
     * @see NotFileFilter
     */
    public static IOFileFilter notFileFilter(final IOFileFilter filter) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4678);
        __CLR4_4_13j93j9kylvdzez.R.inc(4679);return filter.negate();
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that ORs the specified filters.
     *
     * @param filters the IOFileFilters that will be ORed together.
     * @return a filter that ORs the specified filters
     *
     * @throws IllegalArgumentException if the filters are null or contain a
     *         null value.
     * @see OrFileFilter
     * @since 2.0
     */
    public static IOFileFilter or(final IOFileFilter... filters) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4680);
        __CLR4_4_13j93j9kylvdzez.R.inc(4681);return new OrFileFilter(toList(filters));
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that ORs the two specified filters.
     *
     * @param filter1  the first filter
     * @param filter2  the second filter
     * @return a filter that ORs the two specified filters
     * @see #or(IOFileFilter...)
     * @see OrFileFilter
     * @deprecated use {@link #or(IOFileFilter...)}
     */
    @Deprecated
    public static IOFileFilter orFileFilter(final IOFileFilter filter1, final IOFileFilter filter2) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4682);
        __CLR4_4_13j93j9kylvdzez.R.inc(4683);return new OrFileFilter(filter1, filter2);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that returns true if the file name starts with the specified text.
     *
     * @param prefix  the file name prefix
     * @return a prefix checking filter
     * @see PrefixFileFilter
     */
    public static IOFileFilter prefixFileFilter(final String prefix) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4684);
        __CLR4_4_13j93j9kylvdzez.R.inc(4685);return new PrefixFileFilter(prefix);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that returns true if the file name starts with the specified text.
     *
     * @param prefix  the file name prefix
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @return a prefix checking filter
     * @see PrefixFileFilter
     * @since 2.0
     */
    public static IOFileFilter prefixFileFilter(final String prefix, final IOCase caseSensitivity) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4686);
        __CLR4_4_13j93j9kylvdzez.R.inc(4687);return new PrefixFileFilter(prefix, caseSensitivity);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that returns true if the file is bigger than a certain size.
     *
     * @param threshold  the file size threshold
     * @return an appropriately configured SizeFileFilter
     * @see SizeFileFilter
     * @since 1.2
     */
    public static IOFileFilter sizeFileFilter(final long threshold) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4688);
        __CLR4_4_13j93j9kylvdzez.R.inc(4689);return new SizeFileFilter(threshold);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that filters based on file size.
     *
     * @param threshold  the file size threshold
     * @param acceptLarger  if true, larger files get accepted, if false, smaller
     * @return an appropriately configured SizeFileFilter
     * @see SizeFileFilter
     * @since 1.2
     */
    public static IOFileFilter sizeFileFilter(final long threshold, final boolean acceptLarger) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4690);
        __CLR4_4_13j93j9kylvdzez.R.inc(4691);return new SizeFileFilter(threshold, acceptLarger);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that accepts files whose size is &gt;= minimum size
     * and &lt;= maximum size.
     *
     * @param minSizeInclusive the minimum file size (inclusive)
     * @param maxSizeInclusive the maximum file size (inclusive)
     * @return an appropriately configured IOFileFilter
     * @see SizeFileFilter
     * @since 1.3
     */
    public static IOFileFilter sizeRangeFileFilter(final long minSizeInclusive, final long maxSizeInclusive ) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4692);
        __CLR4_4_13j93j9kylvdzez.R.inc(4693);final IOFileFilter minimumFilter = new SizeFileFilter(minSizeInclusive, true);
        __CLR4_4_13j93j9kylvdzez.R.inc(4694);final IOFileFilter maximumFilter = new SizeFileFilter(maxSizeInclusive + 1L, false);
        __CLR4_4_13j93j9kylvdzez.R.inc(4695);return minimumFilter.and(maximumFilter);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that returns true if the file name ends with the specified text.
     *
     * @param suffix  the file name suffix
     * @return a suffix checking filter
     * @see SuffixFileFilter
     */
    public static IOFileFilter suffixFileFilter(final String suffix) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4696);
        __CLR4_4_13j93j9kylvdzez.R.inc(4697);return new SuffixFileFilter(suffix);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that returns true if the file name ends with the specified text.
     *
     * @param suffix  the file name suffix
     * @param caseSensitivity  how to handle case sensitivity, null means case-sensitive
     * @return a suffix checking filter
     * @see SuffixFileFilter
     * @since 2.0
     */
    public static IOFileFilter suffixFileFilter(final String suffix, final IOCase caseSensitivity) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4698);
        __CLR4_4_13j93j9kylvdzez.R.inc(4699);return new SuffixFileFilter(suffix, caseSensitivity);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Create a List of file filters.
     *
     * @param filters The file filters
     * @return The list of file filters
     * @throws IllegalArgumentException if the filters are null or contain a
     *         null value.
     * @since 2.0
     */
    public static List<IOFileFilter> toList(final IOFileFilter... filters) {try{__CLR4_4_13j93j9kylvdzez.R.inc(4700);
        __CLR4_4_13j93j9kylvdzez.R.inc(4701);if ((((filters == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4702)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4703)==0&false))) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4704);throw new IllegalArgumentException("The filters must not be null");
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4705);final List<IOFileFilter> list = new ArrayList<>(filters.length);
        __CLR4_4_13j93j9kylvdzez.R.inc(4706);for (int i = 0; (((i < filters.length)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4707)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4708)==0&false)); i++) {{
            __CLR4_4_13j93j9kylvdzez.R.inc(4709);if ((((filters[i] == null)&&(__CLR4_4_13j93j9kylvdzez.R.iget(4710)!=0|true))||(__CLR4_4_13j93j9kylvdzez.R.iget(4711)==0&false))) {{
                __CLR4_4_13j93j9kylvdzez.R.inc(4712);throw new IllegalArgumentException("The filter[" + i + "] is null");
            }
            }__CLR4_4_13j93j9kylvdzez.R.inc(4713);list.add(filters[i]);
        }
        }__CLR4_4_13j93j9kylvdzez.R.inc(4714);return list;
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * Returns a filter that always returns true.
     *
     * @return a true filter
     * @see TrueFileFilter#TRUE
     */
    public static IOFileFilter trueFileFilter() {try{__CLR4_4_13j93j9kylvdzez.R.inc(4715);
        __CLR4_4_13j93j9kylvdzez.R.inc(4716);return TrueFileFilter.TRUE;
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

    /**
     * FileFilterUtils is not normally instantiated.
     */
    public FileFilterUtils() {try{__CLR4_4_13j93j9kylvdzez.R.inc(4717);
    }finally{__CLR4_4_13j93j9kylvdzez.R.flushNeeded();}}

}
