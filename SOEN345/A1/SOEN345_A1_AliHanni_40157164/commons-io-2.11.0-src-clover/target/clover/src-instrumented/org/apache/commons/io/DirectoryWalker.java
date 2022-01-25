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

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.Objects;

import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

/**
 * Abstract class that walks through a directory hierarchy and provides subclasses with convenient hooks to add specific
 * behavior.
 * <p>
 * This class operates with a {@link FileFilter} and maximum depth to limit the files and directories visited. Commons
 * IO supplies many common filter implementations in the <a href="filefilter/package-summary.html"> filefilter</a>
 * package.
 * </p>
 * <p>
 * The following sections describe:
 * </p>
 * <ul>
 * <li><a href="#example">1. Example Implementation</a> - example {@code FileCleaner} implementation.</li>
 * <li><a href="#filter">2. Filter Example</a> - using {@link FileFilter}(s) with {@code DirectoryWalker}.</li>
 * <li><a href="#cancel">3. Cancellation</a> - how to implement cancellation behavior.</li>
 * </ul>
 *
 * <h2 id="example">1. Example Implementation</h2>
 *
 * There are many possible extensions, for example, to delete all files and '.svn' directories, and return a list of
 * deleted files:
 *
 * <pre>
 * public class FileCleaner extends DirectoryWalker {
 *
 *     public FileCleaner() {
 *         super();
 *     }
 *
 *     public List clean(File startDirectory) {
 *         List results = new ArrayList();
 *         walk(startDirectory, results);
 *         return results;
 *     }
 *
 *     protected boolean handleDirectory(File directory, int depth, Collection results) {
 *         // delete svn directories and then skip
 *         if (".svn".equals(directory.getName())) {
 *             directory.delete();
 *             return false;
 *         } else {
 *             return true;
 *         }
 *
 *     }
 *
 *     protected void handleFile(File file, int depth, Collection results) {
 *         // delete file and add to list of deleted
 *         file.delete();
 *         results.add(file);
 *     }
 * }
 * </pre>
 *
 * <h2 id="filter">2. Filter Example</h2>
 *
 * <p>
 * Choosing which directories and files to process can be a key aspect of using this class. This information can be
 * setup in three ways, via three different constructors.
 * </p>
 * <p>
 * The first option is to visit all directories and files. This is achieved via the no-args constructor.
 * </p>
 * <p>
 * The second constructor option is to supply a single {@link FileFilter} that describes the files and directories to
 * visit. Care must be taken with this option as the same filter is used for both directories and files.
 * </p>
 * <p>
 * For example, if you wanted all directories which are not hidden and files which end in ".txt":
 * </p>
 *
 * <pre>
 * public class FooDirectoryWalker extends DirectoryWalker {
 *     public FooDirectoryWalker(FileFilter filter) {
 *         super(filter, -1);
 *     }
 * }
 *
 * // Build up the filters and create the walker
 * // Create a filter for Non-hidden directories
 * IOFileFilter fooDirFilter = FileFilterUtils.andFileFilter(FileFilterUtils.directoryFileFilter,
 *     HiddenFileFilter.VISIBLE);
 *
 * // Create a filter for Files ending in ".txt"
 * IOFileFilter fooFileFilter = FileFilterUtils.andFileFilter(FileFilterUtils.fileFileFilter,
 *     FileFilterUtils.suffixFileFilter(".txt"));
 *
 * // Combine the directory and file filters using an OR condition
 * java.io.FileFilter fooFilter = FileFilterUtils.orFileFilter(fooDirFilter, fooFileFilter);
 *
 * // Use the filter to construct a DirectoryWalker implementation
 * FooDirectoryWalker walker = new FooDirectoryWalker(fooFilter);
 * </pre>
 * <p>
 * The third constructor option is to specify separate filters, one for directories and one for files. These are
 * combined internally to form the correct {@code FileFilter}, something which is very easy to get wrong when
 * attempted manually, particularly when trying to express constructs like 'any file in directories named docs'.
 * </p>
 * <p>
 * For example, if you wanted all directories which are not hidden and files which end in ".txt":
 * </p>
 *
 * <pre>
 *  public class FooDirectoryWalker extends DirectoryWalker {
 *    public FooDirectoryWalker(IOFileFilter dirFilter, IOFileFilter fileFilter) {
 *      super(dirFilter, fileFilter, -1);
 *    }
 *  }
 *
 *  // Use the filters to construct the walker
 *  FooDirectoryWalker walker = new FooDirectoryWalker(
 *    HiddenFileFilter.VISIBLE,
 *    FileFilterUtils.suffixFileFilter(".txt"),
 *  );
 * </pre>
 * <p>
 * This is much simpler than the previous example, and is why it is the preferred option for filtering.
 * </p>
 *
 * <h2 id="cancel">3. Cancellation</h2>
 *
 * <p>
 * The DirectoryWalker contains some of the logic required for cancel processing. Subclasses must complete the
 * implementation.
 * </p>
 * <p>
 * What {@code DirectoryWalker} does provide for cancellation is:
 * </p>
 * <ul>
 * <li>{@link CancelException} which can be thrown in any of the <i>lifecycle</i> methods to stop processing.</li>
 * <li>The {@code walk()} method traps thrown {@link CancelException} and calls the {@code handleCancelled()}
 * method, providing a place for custom cancel processing.</li>
 * </ul>
 * <p>
 * Implementations need to provide:
 * </p>
 * <ul>
 * <li>The decision logic on whether to cancel processing or not.</li>
 * <li>Constructing and throwing a {@link CancelException}.</li>
 * <li>Custom cancel processing in the {@code handleCancelled()} method.
 * </ul>
 * <p>
 * Two possible scenarios are envisaged for cancellation:
 * </p>
 * <ul>
 * <li><a href="#external">3.1 External / Multi-threaded</a> - cancellation being decided/initiated by an external
 * process.</li>
 * <li><a href="#internal">3.2 Internal</a> - cancellation being decided/initiated from within a DirectoryWalker
 * implementation.</li>
 * </ul>
 * <p>
 * The following sections provide example implementations for these two different scenarios.
 * </p>
 *
 * <h3 id="external">3.1 External / Multi-threaded</h3>
 *
 * <p>
 * This example provides a public {@code cancel()} method that can be called by another thread to stop the
 * processing. A typical example use-case would be a cancel button on a GUI. Calling this method sets a
 * <a href="http://java.sun.com/docs/books/jls/second_edition/html/classes.doc.html#36930"> volatile</a> flag to ensure
 * it will work properly in a multi-threaded environment. The flag is returned by the {@code handleIsCancelled()}
 * method, which will cause the walk to stop immediately. The {@code handleCancelled()} method will be the next,
 * and last, callback method received once cancellation has occurred.
 * </p>
 *
 * <pre>
 * public class FooDirectoryWalker extends DirectoryWalker {
 *
 *     private volatile boolean cancelled = false;
 *
 *     public void cancel() {
 *         cancelled = true;
 *     }
 *
 *     protected boolean handleIsCancelled(File file, int depth, Collection results) {
 *         return cancelled;
 *     }
 *
 *     protected void handleCancelled(File startDirectory, Collection results, CancelException cancel) {
 *         // implement processing required when a cancellation occurs
 *     }
 * }
 * </pre>
 *
 * <h3 id="internal">3.2 Internal</h3>
 *
 * <p>
 * This shows an example of how internal cancellation processing could be implemented. <b>Note</b> the decision logic
 * and throwing a {@link CancelException} could be implemented in any of the <i>lifecycle</i> methods.
 * </p>
 *
 * <pre>
 * public class BarDirectoryWalker extends DirectoryWalker {
 *
 *     protected boolean handleDirectory(File directory, int depth, Collection results) throws IOException {
 *         // cancel if hidden directory
 *         if (directory.isHidden()) {
 *             throw new CancelException(file, depth);
 *         }
 *         return true;
 *     }
 *
 *     protected void handleFile(File file, int depth, Collection results) throws IOException {
 *         // cancel if read-only file
 *         if (!file.canWrite()) {
 *             throw new CancelException(file, depth);
 *         }
 *         results.add(file);
 *     }
 *
 *     protected void handleCancelled(File startDirectory, Collection results, CancelException cancel) {
 *         // implement processing required when a cancellation occurs
 *     }
 * }
 * </pre>
 *
 * @param <T> The result type, like {@link File}.
 * @since 1.3
 * @deprecated Apache Commons IO no longer uses this class. Instead, use
 *             {@link PathUtils#walk(java.nio.file.Path, org.apache.commons.io.file.PathFilter, int, boolean, java.nio.file.FileVisitOption...)}
 *             or {@link Files#walkFileTree(java.nio.file.Path, java.util.Set, int, java.nio.file.FileVisitor)}, and
 *             friends.
 */
@Deprecated
public abstract class DirectoryWalker<T> {public static class __CLR4_4_14646kylvdyb4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,235,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The file filter to use to filter files and directories.
     */
    private final FileFilter filter;
    /**
     * The limit on the directory depth to walk.
     */
    private final int depthLimit;

    /**
     * Construct an instance with no filtering and unlimited <i>depth</i>.
     */
    protected DirectoryWalker() {
        this(null, -1);__CLR4_4_14646kylvdyb4.R.inc(151);try{__CLR4_4_14646kylvdyb4.R.inc(150);
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Constructs an instance with a filter and limit the <i>depth</i> navigated to.
     * <p>
     * The filter controls which files and directories will be navigated to as
     * part of the walk. The {@link FileFilterUtils} class is useful for combining
     * various filters together. A {@code null} filter means that no
     * filtering should occur and all files and directories will be visited.
     * </p>
     *
     * @param filter  the filter to apply, null means visit all files
     * @param depthLimit  controls how <i>deep</i> the hierarchy is
     *  navigated to (less than 0 means unlimited)
     */
    protected DirectoryWalker(final FileFilter filter, final int depthLimit) {try{__CLR4_4_14646kylvdyb4.R.inc(152);
        __CLR4_4_14646kylvdyb4.R.inc(153);this.filter = filter;
        __CLR4_4_14646kylvdyb4.R.inc(154);this.depthLimit = depthLimit;
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Constructs an instance with a directory and a file filter and an optional
     * limit on the <i>depth</i> navigated to.
     * <p>
     * The filters control which files and directories will be navigated to as part
     * of the walk. This constructor uses {@link FileFilterUtils#makeDirectoryOnly(IOFileFilter)}
     * and {@link FileFilterUtils#makeFileOnly(IOFileFilter)} internally to combine the filters.
     * A {@code null} filter means that no filtering should occur.
     * </p>
     *
     * @param directoryFilter  the filter to apply to directories, null means visit all directories
     * @param fileFilter  the filter to apply to files, null means visit all files
     * @param depthLimit  controls how <i>deep</i> the hierarchy is
     *  navigated to (less than 0 means unlimited)
     */
    protected DirectoryWalker(IOFileFilter directoryFilter, IOFileFilter fileFilter, final int depthLimit) {try{__CLR4_4_14646kylvdyb4.R.inc(155);
        __CLR4_4_14646kylvdyb4.R.inc(156);if ((((directoryFilter == null && fileFilter == null)&&(__CLR4_4_14646kylvdyb4.R.iget(157)!=0|true))||(__CLR4_4_14646kylvdyb4.R.iget(158)==0&false))) {{
            __CLR4_4_14646kylvdyb4.R.inc(159);this.filter = null;
        } }else {{
            __CLR4_4_14646kylvdyb4.R.inc(160);directoryFilter = (((directoryFilter != null )&&(__CLR4_4_14646kylvdyb4.R.iget(161)!=0|true))||(__CLR4_4_14646kylvdyb4.R.iget(162)==0&false))? directoryFilter : TrueFileFilter.TRUE;
            __CLR4_4_14646kylvdyb4.R.inc(163);fileFilter = (((fileFilter != null )&&(__CLR4_4_14646kylvdyb4.R.iget(164)!=0|true))||(__CLR4_4_14646kylvdyb4.R.iget(165)==0&false))? fileFilter : TrueFileFilter.TRUE;
            __CLR4_4_14646kylvdyb4.R.inc(166);directoryFilter = FileFilterUtils.makeDirectoryOnly(directoryFilter);
            __CLR4_4_14646kylvdyb4.R.inc(167);fileFilter = FileFilterUtils.makeFileOnly(fileFilter);
            __CLR4_4_14646kylvdyb4.R.inc(168);this.filter = directoryFilter.or(fileFilter);
        }
        }__CLR4_4_14646kylvdyb4.R.inc(169);this.depthLimit = depthLimit;
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Internal method that walks the directory hierarchy in a depth-first manner.
     * <p>
     * Users of this class do not need to call this method. This method will
     * be called automatically by another (public) method on the specific subclass.
     * </p>
     * <p>
     * Writers of subclasses should call this method to start the directory walk.
     * Once called, this method will emit events as it walks the hierarchy.
     * The event methods have the prefix {@code handle}.
     * </p>
     *
     * @param startDirectory  the directory to start from, not null
     * @param results  the collection of result objects, may be updated
     * @throws NullPointerException if the start directory is null
     * @throws IOException if an I/O Error occurs
     */
    protected final void walk(final File startDirectory, final Collection<T> results) throws IOException {try{__CLR4_4_14646kylvdyb4.R.inc(170);
        __CLR4_4_14646kylvdyb4.R.inc(171);Objects.requireNonNull(startDirectory, "startDirectory");
        __CLR4_4_14646kylvdyb4.R.inc(172);try {
            __CLR4_4_14646kylvdyb4.R.inc(173);handleStart(startDirectory, results);
            __CLR4_4_14646kylvdyb4.R.inc(174);walk(startDirectory, 0, results);
            __CLR4_4_14646kylvdyb4.R.inc(175);handleEnd(results);
        } catch(final CancelException cancel) {
            __CLR4_4_14646kylvdyb4.R.inc(176);handleCancelled(startDirectory, results, cancel);
        }
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Main recursive method to examine the directory hierarchy.
     *
     * @param directory  the directory to examine, not null
     * @param depth  the directory level (starting directory = 0)
     * @param results  the collection of result objects, may be updated
     * @throws IOException if an I/O Error occurs
     */
    private void walk(final File directory, final int depth, final Collection<T> results) throws IOException {try{__CLR4_4_14646kylvdyb4.R.inc(177);
        __CLR4_4_14646kylvdyb4.R.inc(178);checkIfCancelled(directory, depth, results);
        __CLR4_4_14646kylvdyb4.R.inc(179);if ((((handleDirectory(directory, depth, results))&&(__CLR4_4_14646kylvdyb4.R.iget(180)!=0|true))||(__CLR4_4_14646kylvdyb4.R.iget(181)==0&false))) {{
            __CLR4_4_14646kylvdyb4.R.inc(182);handleDirectoryStart(directory, depth, results);
            __CLR4_4_14646kylvdyb4.R.inc(183);final int childDepth = depth + 1;
            __CLR4_4_14646kylvdyb4.R.inc(184);if ((((depthLimit < 0 || childDepth <= depthLimit)&&(__CLR4_4_14646kylvdyb4.R.iget(185)!=0|true))||(__CLR4_4_14646kylvdyb4.R.iget(186)==0&false))) {{
                __CLR4_4_14646kylvdyb4.R.inc(187);checkIfCancelled(directory, depth, results);
                __CLR4_4_14646kylvdyb4.R.inc(188);File[] childFiles = (((filter == null )&&(__CLR4_4_14646kylvdyb4.R.iget(189)!=0|true))||(__CLR4_4_14646kylvdyb4.R.iget(190)==0&false))? directory.listFiles() : directory.listFiles(filter);
                __CLR4_4_14646kylvdyb4.R.inc(191);childFiles = filterDirectoryContents(directory, depth, childFiles);
                __CLR4_4_14646kylvdyb4.R.inc(192);if ((((childFiles == null)&&(__CLR4_4_14646kylvdyb4.R.iget(193)!=0|true))||(__CLR4_4_14646kylvdyb4.R.iget(194)==0&false))) {{
                    __CLR4_4_14646kylvdyb4.R.inc(195);handleRestricted(directory, childDepth, results);
                } }else {{
                    __CLR4_4_14646kylvdyb4.R.inc(196);for (final File childFile : childFiles) {{
                        __CLR4_4_14646kylvdyb4.R.inc(197);if ((((childFile.isDirectory())&&(__CLR4_4_14646kylvdyb4.R.iget(198)!=0|true))||(__CLR4_4_14646kylvdyb4.R.iget(199)==0&false))) {{
                            __CLR4_4_14646kylvdyb4.R.inc(200);walk(childFile, childDepth, results);
                        } }else {{
                            __CLR4_4_14646kylvdyb4.R.inc(201);checkIfCancelled(childFile, childDepth, results);
                            __CLR4_4_14646kylvdyb4.R.inc(202);handleFile(childFile, childDepth, results);
                            __CLR4_4_14646kylvdyb4.R.inc(203);checkIfCancelled(childFile, childDepth, results);
                        }
                    }}
                }}
            }}
            }__CLR4_4_14646kylvdyb4.R.inc(204);handleDirectoryEnd(directory, depth, results);
        }
        }__CLR4_4_14646kylvdyb4.R.inc(205);checkIfCancelled(directory, depth, results);
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Checks whether the walk has been cancelled by calling {@link #handleIsCancelled},
     * throwing a {@code CancelException} if it has.
     * <p>
     * Writers of subclasses should not normally call this method as it is called
     * automatically by the walk of the tree. However, sometimes a single method,
     * typically {@link #handleFile}, may take a long time to run. In that case,
     * you may wish to check for cancellation by calling this method.
     * </p>
     *
     * @param file  the current file being processed
     * @param depth  the current file level (starting directory = 0)
     * @param results  the collection of result objects, may be updated
     * @throws IOException if an I/O Error occurs
     */
    protected final void checkIfCancelled(final File file, final int depth, final Collection<T> results) throws
            IOException {try{__CLR4_4_14646kylvdyb4.R.inc(206);
        __CLR4_4_14646kylvdyb4.R.inc(207);if ((((handleIsCancelled(file, depth, results))&&(__CLR4_4_14646kylvdyb4.R.iget(208)!=0|true))||(__CLR4_4_14646kylvdyb4.R.iget(209)==0&false))) {{
            __CLR4_4_14646kylvdyb4.R.inc(210);throw new CancelException(file, depth);
        }
    }}finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked to determine if the entire walk
     * operation should be immediately cancelled.
     * <p>
     * This method should be implemented by those subclasses that want to
     * provide a public {@code cancel()} method available from another
     * thread. The design pattern for the subclass should be as follows:
     * </p>
     * <pre>
     *  public class FooDirectoryWalker extends DirectoryWalker {
     *    private volatile boolean cancelled = false;
     *
     *    public void cancel() {
     *        cancelled = true;
     *    }
     *    private void handleIsCancelled(File file, int depth, Collection results) {
     *        return cancelled;
     *    }
     *    protected void handleCancelled(File startDirectory,
     *              Collection results, CancelException cancel) {
     *        // implement processing required when a cancellation occurs
     *    }
     *  }
     * </pre>
     * <p>
     * If this method returns true, then the directory walk is immediately
     * cancelled. The next callback method will be {@link #handleCancelled}.
     * </p>
     * <p>
     * This implementation returns false.
     * </p>
     *
     * @param file  the file or directory being processed
     * @param depth  the current directory level (starting directory = 0)
     * @param results  the collection of result objects, may be updated
     * @return true if the walk has been cancelled
     * @throws IOException if an I/O Error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected boolean handleIsCancelled(
            final File file, final int depth, final Collection<T> results) throws IOException {try{__CLR4_4_14646kylvdyb4.R.inc(211);
        // do nothing - overridable by subclass
        __CLR4_4_14646kylvdyb4.R.inc(212);return false;  // not cancelled
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked when the operation is cancelled.
     * The file being processed when the cancellation occurred can be
     * obtained from the exception.
     * <p>
     * This implementation just re-throws the {@link CancelException}.
     * </p>
     *
     * @param startDirectory  the directory that the walk started from
     * @param results  the collection of result objects, may be updated
     * @param cancel  the exception throw to cancel further processing
     * containing details at the point of cancellation.
     * @throws IOException if an I/O Error occurs
     */
    protected void handleCancelled(final File startDirectory, final Collection<T> results,
                       final CancelException cancel) throws IOException {try{__CLR4_4_14646kylvdyb4.R.inc(213);
        // re-throw exception - overridable by subclass
        __CLR4_4_14646kylvdyb4.R.inc(214);throw cancel;
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked at the start of processing.
     * <p>
     * This implementation does nothing.
     * </p>
     *
     * @param startDirectory  the directory to start from
     * @param results  the collection of result objects, may be updated
     * @throws IOException if an I/O Error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void handleStart(final File startDirectory, final Collection<T> results) throws IOException {try{__CLR4_4_14646kylvdyb4.R.inc(215);
        // do nothing - overridable by subclass
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked to determine if a directory should be processed.
     * <p>
     * This method returns a boolean to indicate if the directory should be examined or not.
     * If you return false, the entire directory and any subdirectories will be skipped.
     * Note that this functionality is in addition to the filtering by file filter.
     * </p>
     * <p>
     * This implementation does nothing and returns true.
     * </p>
     *
     * @param directory  the current directory being processed
     * @param depth  the current directory level (starting directory = 0)
     * @param results  the collection of result objects, may be updated
     * @return true to process this directory, false to skip this directory
     * @throws IOException if an I/O Error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected boolean handleDirectory(final File directory, final int depth, final Collection<T> results) throws
            IOException {try{__CLR4_4_14646kylvdyb4.R.inc(216);
        // do nothing - overridable by subclass
        __CLR4_4_14646kylvdyb4.R.inc(217);return true;  // process directory
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked at the start of processing each directory.
     * <p>
     * This implementation does nothing.
     * </p>
     *
     * @param directory  the current directory being processed
     * @param depth  the current directory level (starting directory = 0)
     * @param results  the collection of result objects, may be updated
     * @throws IOException if an I/O Error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void handleDirectoryStart(final File directory, final int depth, final Collection<T> results) throws
            IOException {try{__CLR4_4_14646kylvdyb4.R.inc(218);
        // do nothing - overridable by subclass
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked with the contents of each directory.
     * <p>
     * This implementation returns the files unchanged
     * </p>
     *
     * @param directory  the current directory being processed
     * @param depth  the current directory level (starting directory = 0)
     * @param files the files (possibly filtered) in the directory, may be {@code null}
     * @return the filtered list of files
     * @throws IOException if an I/O Error occurs
     * @since 2.0
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected File[] filterDirectoryContents(final File directory, final int depth, final File... files) throws
            IOException {try{__CLR4_4_14646kylvdyb4.R.inc(219);
        __CLR4_4_14646kylvdyb4.R.inc(220);return files;
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked for each (non-directory) file.
     * <p>
     * This implementation does nothing.
     * </p>
     *
     * @param file  the current file being processed
     * @param depth  the current directory level (starting directory = 0)
     * @param results  the collection of result objects, may be updated
     * @throws IOException if an I/O Error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void handleFile(final File file, final int depth, final Collection<T> results) throws IOException {try{__CLR4_4_14646kylvdyb4.R.inc(221);
        // do nothing - overridable by subclass
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked for each restricted directory.
     * <p>
     * This implementation does nothing.
     * </p>
     *
     * @param directory  the restricted directory
     * @param depth  the current directory level (starting directory = 0)
     * @param results  the collection of result objects, may be updated
     * @throws IOException if an I/O Error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void handleRestricted(final File directory, final int depth, final Collection<T> results) throws
            IOException {try{__CLR4_4_14646kylvdyb4.R.inc(222);
        // do nothing - overridable by subclass
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked at the end of processing each directory.
     * <p>
     * This implementation does nothing.
     * </p>
     *
     * @param directory  the directory being processed
     * @param depth  the current directory level (starting directory = 0)
     * @param results  the collection of result objects, may be updated
     * @throws IOException if an I/O Error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void handleDirectoryEnd(final File directory, final int depth, final Collection<T> results) throws
            IOException {try{__CLR4_4_14646kylvdyb4.R.inc(223);
        // do nothing - overridable by subclass
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * Overridable callback method invoked at the end of processing.
     * <p>
     * This implementation does nothing.
     * </p>
     *
     * @param results  the collection of result objects, may be updated
     * @throws IOException if an I/O Error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void handleEnd(final Collection<T> results) throws IOException {try{__CLR4_4_14646kylvdyb4.R.inc(224);
        // do nothing - overridable by subclass
    }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

    /**
     * CancelException is thrown in DirectoryWalker to cancel the current
     * processing.
     */
    public static class CancelException extends IOException {

        /** Serialization id. */
        private static final long serialVersionUID = 1347339620135041008L;

        /** The file being processed when the exception was thrown. */
        private final File file;
        /** The file depth when the exception was thrown. */
        private final int depth;

        /**
         * Constructs a {@code CancelException} with
         * the file and depth when cancellation occurred.
         *
         * @param file  the file when the operation was cancelled, may be null
         * @param depth  the depth when the operation was cancelled, may be null
         */
        public CancelException(final File file, final int depth) {
            this("Operation Cancelled", file, depth);__CLR4_4_14646kylvdyb4.R.inc(226);try{__CLR4_4_14646kylvdyb4.R.inc(225);
        }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

        /**
         * Constructs a {@code CancelException} with
         * an appropriate message and the file and depth when
         * cancellation occurred.
         *
         * @param message  the detail message
         * @param file  the file when the operation was cancelled
         * @param depth  the depth when the operation was cancelled
         */
        public CancelException(final String message, final File file, final int depth) {
            super(message);__CLR4_4_14646kylvdyb4.R.inc(228);try{__CLR4_4_14646kylvdyb4.R.inc(227);
            __CLR4_4_14646kylvdyb4.R.inc(229);this.file = file;
            __CLR4_4_14646kylvdyb4.R.inc(230);this.depth = depth;
        }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

        /**
         * Returns the file when the operation was cancelled.
         *
         * @return the file when the operation was cancelled
         */
        public File getFile() {try{__CLR4_4_14646kylvdyb4.R.inc(231);
            __CLR4_4_14646kylvdyb4.R.inc(232);return file;
        }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}

        /**
         * Returns the depth when the operation was cancelled.
         *
         * @return the depth when the operation was cancelled
         */
        public int getDepth() {try{__CLR4_4_14646kylvdyb4.R.inc(233);
            __CLR4_4_14646kylvdyb4.R.inc(234);return depth;
        }finally{__CLR4_4_14646kylvdyb4.R.flushNeeded();}}
    }
}
