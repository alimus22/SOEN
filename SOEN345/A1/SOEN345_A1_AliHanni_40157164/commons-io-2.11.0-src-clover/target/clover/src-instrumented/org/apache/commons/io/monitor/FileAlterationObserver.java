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
package org.apache.commons.io.monitor;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;

/**
 * FileAlterationObserver represents the state of files below a root directory,
 * checking the file system and notifying listeners of create, change or
 * delete events.
 * <p>
 * To use this implementation:
 * <ul>
 *   <li>Create {@link FileAlterationListener} implementation(s) that process
 *      the file/directory create, change and delete events</li>
 *   <li>Register the listener(s) with a {@link FileAlterationObserver} for
 *       the appropriate directory.</li>
 *   <li>Either register the observer(s) with a {@link FileAlterationMonitor} or
 *       run manually.</li>
 * </ul>
 *
 * <h2>Basic Usage</h2>
 * Create a {@link FileAlterationObserver} for the directory and register the listeners:
 * <pre>
 *      File directory = new File(new File("."), "src");
 *      FileAlterationObserver observer = new FileAlterationObserver(directory);
 *      observer.addListener(...);
 *      observer.addListener(...);
 * </pre>
 * To manually observe a directory, initialize the observer and invoked the
 * {@link #checkAndNotify()} method as required:
 * <pre>
 *      // initialize
 *      observer.init();
 *      ...
 *      // invoke as required
 *      observer.checkAndNotify();
 *      ...
 *      observer.checkAndNotify();
 *      ...
 *      // finished
 *      observer.finish();
 * </pre>
 * Alternatively, register the observer(s) with a {@link FileAlterationMonitor},
 * which creates a new thread, invoking the observer at the specified interval:
 * <pre>
 *      long interval = ...
 *      FileAlterationMonitor monitor = new FileAlterationMonitor(interval);
 *      monitor.addObserver(observer);
 *      monitor.start();
 *      ...
 *      monitor.stop();
 * </pre>
 *
 * <h2>File Filters</h2>
 * This implementation can monitor portions of the file system
 * by using {@link FileFilter}s to observe only the files and/or directories
 * that are of interest. This makes it more efficient and reduces the
 * noise from <i>unwanted</i> file system events.
 * <p>
 * <a href="https://commons.apache.org/io/">Commons IO</a> has a good range of
 * useful, ready made
 * <a href="../filefilter/package-summary.html">File Filter</a>
 * implementations for this purpose.
 * <p>
 * For example, to only observe 1) visible directories and 2) files with a ".java" suffix
 * in a root directory called "src" you could set up a {@link FileAlterationObserver} in the following
 * way:
 * <pre>
 *      // Create a FileFilter
 *      IOFileFilter directories = FileFilterUtils.and(
 *                                      FileFilterUtils.directoryFileFilter(),
 *                                      HiddenFileFilter.VISIBLE);
 *      IOFileFilter files       = FileFilterUtils.and(
 *                                      FileFilterUtils.fileFileFilter(),
 *                                      FileFilterUtils.suffixFileFilter(".java"));
 *      IOFileFilter filter = FileFilterUtils.or(directories, files);
 *
 *      // Create the File system observer and register File Listeners
 *      FileAlterationObserver observer = new FileAlterationObserver(new File("src"), filter);
 *      observer.addListener(...);
 *      observer.addListener(...);
 * </pre>
 *
 * <h2>FileEntry</h2>
 * {@link FileEntry} represents the state of a file or directory, capturing
 * {@link File} attributes at a point in time. Custom implementations of
 * {@link FileEntry} can be used to capture additional properties that the
 * basic implementation does not support. The {@link FileEntry#refresh(File)}
 * method is used to determine if a file or directory has changed since the last
 * check and stores the current state of the {@link File}'s properties.
 *
 * @see FileAlterationListener
 * @see FileAlterationMonitor
 *
 * @since 2.0
 */
public class FileAlterationObserver implements Serializable {public static class __CLR4_4_16dw6dwkylve08b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1185122225658782848L;
    private final List<FileAlterationListener> listeners = new CopyOnWriteArrayList<>();
    private final FileEntry rootEntry;
    private final FileFilter fileFilter;
    private final Comparator<File> comparator;

    /**
     * Constructs an observer for the specified directory.
     *
     * @param directoryName the name of the directory to observe
     */
    public FileAlterationObserver(final String directoryName) {
        this(new File(directoryName));__CLR4_4_16dw6dwkylve08b.R.inc(8277);try{__CLR4_4_16dw6dwkylve08b.R.inc(8276);
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Constructs an observer for the specified directory and file filter.
     *
     * @param directoryName the name of the directory to observe
     * @param fileFilter The file filter or null if none
     */
    public FileAlterationObserver(final String directoryName, final FileFilter fileFilter) {
        this(new File(directoryName), fileFilter);__CLR4_4_16dw6dwkylve08b.R.inc(8279);try{__CLR4_4_16dw6dwkylve08b.R.inc(8278);
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Construct an observer for the specified directory, file filter and
     * file comparator.
     *
     * @param directoryName the name of the directory to observe
     * @param fileFilter The file filter or null if none
     * @param caseSensitivity  what case sensitivity to use comparing file names, null means system sensitive
     */
    public FileAlterationObserver(final String directoryName, final FileFilter fileFilter,
                                  final IOCase caseSensitivity) {
        this(new File(directoryName), fileFilter, caseSensitivity);__CLR4_4_16dw6dwkylve08b.R.inc(8281);try{__CLR4_4_16dw6dwkylve08b.R.inc(8280);
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Constructs an observer for the specified directory.
     *
     * @param directory the directory to observe
     */
    public FileAlterationObserver(final File directory) {
        this(directory, null);__CLR4_4_16dw6dwkylve08b.R.inc(8283);try{__CLR4_4_16dw6dwkylve08b.R.inc(8282);
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Constructs an observer for the specified directory and file filter.
     *
     * @param directory the directory to observe
     * @param fileFilter The file filter or null if none
     */
    public FileAlterationObserver(final File directory, final FileFilter fileFilter) {
        this(directory, fileFilter, null);__CLR4_4_16dw6dwkylve08b.R.inc(8285);try{__CLR4_4_16dw6dwkylve08b.R.inc(8284);
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Constructs an observer for the specified directory, file filter and
     * file comparator.
     *
     * @param directory the directory to observe
     * @param fileFilter The file filter or null if none
     * @param caseSensitivity  what case sensitivity to use comparing file names, null means system sensitive
     */
    public FileAlterationObserver(final File directory, final FileFilter fileFilter, final IOCase caseSensitivity) {
        this(new FileEntry(directory), fileFilter, caseSensitivity);__CLR4_4_16dw6dwkylve08b.R.inc(8287);try{__CLR4_4_16dw6dwkylve08b.R.inc(8286);
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Constructs an observer for the specified directory, file filter and
     * file comparator.
     *
     * @param rootEntry the root directory to observe
     * @param fileFilter The file filter or null if none
     * @param caseSensitivity  what case sensitivity to use comparing file names, null means system sensitive
     */
    protected FileAlterationObserver(final FileEntry rootEntry, final FileFilter fileFilter,
                                     final IOCase caseSensitivity) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8288);
        __CLR4_4_16dw6dwkylve08b.R.inc(8289);if ((((rootEntry == null)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8290)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8291)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8292);throw new IllegalArgumentException("Root entry is missing");
        }
        }__CLR4_4_16dw6dwkylve08b.R.inc(8293);if ((((rootEntry.getFile() == null)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8294)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8295)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8296);throw new IllegalArgumentException("Root directory is missing");
        }
        }__CLR4_4_16dw6dwkylve08b.R.inc(8297);this.rootEntry = rootEntry;
        __CLR4_4_16dw6dwkylve08b.R.inc(8298);this.fileFilter = fileFilter;
        __CLR4_4_16dw6dwkylve08b.R.inc(8299);if ((((caseSensitivity == null || caseSensitivity.equals(IOCase.SYSTEM))&&(__CLR4_4_16dw6dwkylve08b.R.iget(8300)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8301)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8302);this.comparator = NameFileComparator.NAME_SYSTEM_COMPARATOR;
        } }else {__CLR4_4_16dw6dwkylve08b.R.inc(8303);if ((((caseSensitivity.equals(IOCase.INSENSITIVE))&&(__CLR4_4_16dw6dwkylve08b.R.iget(8304)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8305)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8306);this.comparator = NameFileComparator.NAME_INSENSITIVE_COMPARATOR;
        } }else {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8307);this.comparator = NameFileComparator.NAME_COMPARATOR;
        }
    }}}finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Returns the directory being observed.
     *
     * @return the directory being observed
     */
    public File getDirectory() {try{__CLR4_4_16dw6dwkylve08b.R.inc(8308);
        __CLR4_4_16dw6dwkylve08b.R.inc(8309);return rootEntry.getFile();
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Returns the fileFilter.
     *
     * @return the fileFilter
     * @since 2.1
     */
    public FileFilter getFileFilter() {try{__CLR4_4_16dw6dwkylve08b.R.inc(8310);
        __CLR4_4_16dw6dwkylve08b.R.inc(8311);return fileFilter;
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Adds a file system listener.
     *
     * @param listener The file system listener
     */
    public void addListener(final FileAlterationListener listener) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8312);
        __CLR4_4_16dw6dwkylve08b.R.inc(8313);if ((((listener != null)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8314)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8315)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8316);listeners.add(listener);
        }
    }}finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Removes a file system listener.
     *
     * @param listener The file system listener
     */
    public void removeListener(final FileAlterationListener listener) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8317);
        __CLR4_4_16dw6dwkylve08b.R.inc(8318);if ((((listener != null)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8319)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8320)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8321);while ((((listeners.remove(listener))&&(__CLR4_4_16dw6dwkylve08b.R.iget(8322)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8323)==0&false))) {{
                // empty
            }
        }}
    }}finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Returns the set of registered file system listeners.
     *
     * @return The file system listeners
     */
    public Iterable<FileAlterationListener> getListeners() {try{__CLR4_4_16dw6dwkylve08b.R.inc(8324);
        __CLR4_4_16dw6dwkylve08b.R.inc(8325);return listeners;
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Initializes the observer.
     *
     * @throws Exception if an error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    public void initialize() throws Exception {try{__CLR4_4_16dw6dwkylve08b.R.inc(8326);
        __CLR4_4_16dw6dwkylve08b.R.inc(8327);rootEntry.refresh(rootEntry.getFile());
        __CLR4_4_16dw6dwkylve08b.R.inc(8328);final FileEntry[] children = doListFiles(rootEntry.getFile(), rootEntry);
        __CLR4_4_16dw6dwkylve08b.R.inc(8329);rootEntry.setChildren(children);
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Final processing.
     *
     * @throws Exception if an error occurs
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    public void destroy() throws Exception {try{__CLR4_4_16dw6dwkylve08b.R.inc(8330);
        // noop
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Checks whether the file and its children have been created, modified or deleted.
     */
    public void checkAndNotify() {try{__CLR4_4_16dw6dwkylve08b.R.inc(8331);

        /* fire onStart() */
        __CLR4_4_16dw6dwkylve08b.R.inc(8332);for (final FileAlterationListener listener : listeners) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8333);listener.onStart(this);
        }

        /* fire directory/file events */
        }__CLR4_4_16dw6dwkylve08b.R.inc(8334);final File rootFile = rootEntry.getFile();
        __CLR4_4_16dw6dwkylve08b.R.inc(8335);if ((((rootFile.exists())&&(__CLR4_4_16dw6dwkylve08b.R.iget(8336)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8337)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8338);checkAndNotify(rootEntry, rootEntry.getChildren(), listFiles(rootFile));
        } }else {__CLR4_4_16dw6dwkylve08b.R.inc(8339);if ((((rootEntry.isExists())&&(__CLR4_4_16dw6dwkylve08b.R.iget(8340)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8341)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8342);checkAndNotify(rootEntry, rootEntry.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
        } }else {{
            // Didn't exist and still doesn't
        }

        /* fire onStop() */
        }}__CLR4_4_16dw6dwkylve08b.R.inc(8343);for (final FileAlterationListener listener : listeners) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8344);listener.onStop(this);
        }
    }}finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Compares two file lists for files which have been created, modified or deleted.
     *
     * @param parent The parent entry
     * @param previous The original list of files
     * @param files  The current list of files
     */
    private void checkAndNotify(final FileEntry parent, final FileEntry[] previous, final File[] files) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8345);
        __CLR4_4_16dw6dwkylve08b.R.inc(8346);int c = 0;
        __CLR4_4_16dw6dwkylve08b.R.inc(8347);final FileEntry[] current = (((files.length > 0 )&&(__CLR4_4_16dw6dwkylve08b.R.iget(8348)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8349)==0&false))? new FileEntry[files.length] : FileEntry.EMPTY_FILE_ENTRY_ARRAY;
        __CLR4_4_16dw6dwkylve08b.R.inc(8350);for (final FileEntry entry : previous) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8351);while ((((c < files.length && comparator.compare(entry.getFile(), files[c]) > 0)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8352)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8353)==0&false))) {{
                __CLR4_4_16dw6dwkylve08b.R.inc(8354);current[c] = createFileEntry(parent, files[c]);
                __CLR4_4_16dw6dwkylve08b.R.inc(8355);doCreate(current[c]);
                __CLR4_4_16dw6dwkylve08b.R.inc(8356);c++;
            }
            }__CLR4_4_16dw6dwkylve08b.R.inc(8357);if ((((c < files.length && comparator.compare(entry.getFile(), files[c]) == 0)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8358)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8359)==0&false))) {{
                __CLR4_4_16dw6dwkylve08b.R.inc(8360);doMatch(entry, files[c]);
                __CLR4_4_16dw6dwkylve08b.R.inc(8361);checkAndNotify(entry, entry.getChildren(), listFiles(files[c]));
                __CLR4_4_16dw6dwkylve08b.R.inc(8362);current[c] = entry;
                __CLR4_4_16dw6dwkylve08b.R.inc(8363);c++;
            } }else {{
                __CLR4_4_16dw6dwkylve08b.R.inc(8364);checkAndNotify(entry, entry.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
                __CLR4_4_16dw6dwkylve08b.R.inc(8365);doDelete(entry);
            }
        }}
        }__CLR4_4_16dw6dwkylve08b.R.inc(8366);for (; (((c < files.length)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8367)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8368)==0&false)); c++) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8369);current[c] = createFileEntry(parent, files[c]);
            __CLR4_4_16dw6dwkylve08b.R.inc(8370);doCreate(current[c]);
        }
        }__CLR4_4_16dw6dwkylve08b.R.inc(8371);parent.setChildren(current);
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Creates a new file entry for the specified file.
     *
     * @param parent The parent file entry
     * @param file The file to create an entry for
     * @return A new file entry
     */
    private FileEntry createFileEntry(final FileEntry parent, final File file) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8372);
        __CLR4_4_16dw6dwkylve08b.R.inc(8373);final FileEntry entry = parent.newChildInstance(file);
        __CLR4_4_16dw6dwkylve08b.R.inc(8374);entry.refresh(file);
        __CLR4_4_16dw6dwkylve08b.R.inc(8375);final FileEntry[] children = doListFiles(file, entry);
        __CLR4_4_16dw6dwkylve08b.R.inc(8376);entry.setChildren(children);
        __CLR4_4_16dw6dwkylve08b.R.inc(8377);return entry;
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Lists the files
     * @param file The file to list files for
     * @param entry the parent entry
     * @return The child files
     */
    private FileEntry[] doListFiles(final File file, final FileEntry entry) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8378);
        __CLR4_4_16dw6dwkylve08b.R.inc(8379);final File[] files = listFiles(file);
        __CLR4_4_16dw6dwkylve08b.R.inc(8380);final FileEntry[] children = (((files.length > 0 )&&(__CLR4_4_16dw6dwkylve08b.R.iget(8381)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8382)==0&false))? new FileEntry[files.length] : FileEntry.EMPTY_FILE_ENTRY_ARRAY;
        __CLR4_4_16dw6dwkylve08b.R.inc(8383);for (int i = 0; (((i < files.length)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8384)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8385)==0&false)); i++) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8386);children[i] = createFileEntry(entry, files[i]);
        }
        }__CLR4_4_16dw6dwkylve08b.R.inc(8387);return children;
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Fires directory/file created events to the registered listeners.
     *
     * @param entry The file entry
     */
    private void doCreate(final FileEntry entry) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8388);
        __CLR4_4_16dw6dwkylve08b.R.inc(8389);for (final FileAlterationListener listener : listeners) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8390);if ((((entry.isDirectory())&&(__CLR4_4_16dw6dwkylve08b.R.iget(8391)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8392)==0&false))) {{
                __CLR4_4_16dw6dwkylve08b.R.inc(8393);listener.onDirectoryCreate(entry.getFile());
            } }else {{
                __CLR4_4_16dw6dwkylve08b.R.inc(8394);listener.onFileCreate(entry.getFile());
            }
        }}
        }__CLR4_4_16dw6dwkylve08b.R.inc(8395);final FileEntry[] children = entry.getChildren();
        __CLR4_4_16dw6dwkylve08b.R.inc(8396);for (final FileEntry aChildren : children) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8397);doCreate(aChildren);
        }
    }}finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Fires directory/file change events to the registered listeners.
     *
     * @param entry The previous file system entry
     * @param file The current file
     */
    private void doMatch(final FileEntry entry, final File file) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8398);
        __CLR4_4_16dw6dwkylve08b.R.inc(8399);if ((((entry.refresh(file))&&(__CLR4_4_16dw6dwkylve08b.R.iget(8400)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8401)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8402);for (final FileAlterationListener listener : listeners) {{
                __CLR4_4_16dw6dwkylve08b.R.inc(8403);if ((((entry.isDirectory())&&(__CLR4_4_16dw6dwkylve08b.R.iget(8404)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8405)==0&false))) {{
                    __CLR4_4_16dw6dwkylve08b.R.inc(8406);listener.onDirectoryChange(file);
                } }else {{
                    __CLR4_4_16dw6dwkylve08b.R.inc(8407);listener.onFileChange(file);
                }
            }}
        }}
    }}finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Fires directory/file delete events to the registered listeners.
     *
     * @param entry The file entry
     */
    private void doDelete(final FileEntry entry) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8408);
        __CLR4_4_16dw6dwkylve08b.R.inc(8409);for (final FileAlterationListener listener : listeners) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8410);if ((((entry.isDirectory())&&(__CLR4_4_16dw6dwkylve08b.R.iget(8411)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8412)==0&false))) {{
                __CLR4_4_16dw6dwkylve08b.R.inc(8413);listener.onDirectoryDelete(entry.getFile());
            } }else {{
                __CLR4_4_16dw6dwkylve08b.R.inc(8414);listener.onFileDelete(entry.getFile());
            }
        }}
    }}finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Lists the contents of a directory
     *
     * @param file The file to list the contents of
     * @return the directory contents or a zero length array if
     * the empty or the file is not a directory
     */
    private File[] listFiles(final File file) {try{__CLR4_4_16dw6dwkylve08b.R.inc(8415);
        __CLR4_4_16dw6dwkylve08b.R.inc(8416);File[] children = null;
        __CLR4_4_16dw6dwkylve08b.R.inc(8417);if ((((file.isDirectory())&&(__CLR4_4_16dw6dwkylve08b.R.iget(8418)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8419)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8420);children = (((fileFilter == null )&&(__CLR4_4_16dw6dwkylve08b.R.iget(8421)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8422)==0&false))? file.listFiles() : file.listFiles(fileFilter);
        }
        }__CLR4_4_16dw6dwkylve08b.R.inc(8423);if ((((children == null)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8424)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8425)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8426);children = FileUtils.EMPTY_FILE_ARRAY;
        }
        }__CLR4_4_16dw6dwkylve08b.R.inc(8427);if ((((comparator != null && children.length > 1)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8428)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8429)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8430);Arrays.sort(children, comparator);
        }
        }__CLR4_4_16dw6dwkylve08b.R.inc(8431);return children;
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

    /**
     * Returns a String representation of this observer.
     *
     * @return a String representation of this observer
     */
    @Override
    public String toString() {try{__CLR4_4_16dw6dwkylve08b.R.inc(8432);
        __CLR4_4_16dw6dwkylve08b.R.inc(8433);final StringBuilder builder = new StringBuilder();
        __CLR4_4_16dw6dwkylve08b.R.inc(8434);builder.append(getClass().getSimpleName());
        __CLR4_4_16dw6dwkylve08b.R.inc(8435);builder.append("[file='");
        __CLR4_4_16dw6dwkylve08b.R.inc(8436);builder.append(getDirectory().getPath());
        __CLR4_4_16dw6dwkylve08b.R.inc(8437);builder.append('\'');
        __CLR4_4_16dw6dwkylve08b.R.inc(8438);if ((((fileFilter != null)&&(__CLR4_4_16dw6dwkylve08b.R.iget(8439)!=0|true))||(__CLR4_4_16dw6dwkylve08b.R.iget(8440)==0&false))) {{
            __CLR4_4_16dw6dwkylve08b.R.inc(8441);builder.append(", ");
            __CLR4_4_16dw6dwkylve08b.R.inc(8442);builder.append(fileFilter.toString());
        }
        }__CLR4_4_16dw6dwkylve08b.R.inc(8443);builder.append(", listeners=");
        __CLR4_4_16dw6dwkylve08b.R.inc(8444);builder.append(listeners.size());
        __CLR4_4_16dw6dwkylve08b.R.inc(8445);builder.append("]");
        __CLR4_4_16dw6dwkylve08b.R.inc(8446);return builder.toString();
    }finally{__CLR4_4_16dw6dwkylve08b.R.flushNeeded();}}

}
