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

import static org.apache.commons.io.test.TestUtils.sleepQuietly;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.HiddenFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.io.TempDir;

/**
 * {@link FileAlterationObserver} Test Case.
 */
public abstract class AbstractMonitorTestCase {static class __CLR4_4_1j9xj9xkylve3ej{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,25024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** File observer */
    protected FileAlterationObserver observer;

    /** Listener which collects file changes */
    protected CollectionFileListener listener;

    /** Directory for test files */
    @TempDir
    protected File testDir;

    /** Time in milliseconds to pause in tests */
    protected final long pauseTime = 100L;

    @BeforeEach
    public void setUp() {try{__CLR4_4_1j9xj9xkylve3ej.R.inc(24981);
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24982);final IOFileFilter files = FileFilterUtils.fileFileFilter();
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24983);final IOFileFilter javaSuffix = FileFilterUtils.suffixFileFilter(".java");
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24984);final IOFileFilter fileFilter = FileFilterUtils.and(files, javaSuffix);

        __CLR4_4_1j9xj9xkylve3ej.R.inc(24985);final IOFileFilter directories = FileFilterUtils.directoryFileFilter();
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24986);final IOFileFilter visible = HiddenFileFilter.VISIBLE;
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24987);final IOFileFilter dirFilter = FileFilterUtils.and(directories, visible);

        __CLR4_4_1j9xj9xkylve3ej.R.inc(24988);final IOFileFilter filter = FileFilterUtils.or(dirFilter, fileFilter);

        __CLR4_4_1j9xj9xkylve3ej.R.inc(24989);createObserver(testDir, filter);
    }finally{__CLR4_4_1j9xj9xkylve3ej.R.flushNeeded();}}

    /**
     * Create a {@link FileAlterationObserver}.
     *
     * @param file The directory to observe
     * @param fileFilter The file filter to apply
     */
    protected void createObserver(final File file, final FileFilter fileFilter) {try{__CLR4_4_1j9xj9xkylve3ej.R.inc(24990);
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24991);observer = new FileAlterationObserver(file, fileFilter);
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24992);observer.addListener(listener);
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24993);observer.addListener(new FileAlterationListenerAdaptor());
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24994);try {
            __CLR4_4_1j9xj9xkylve3ej.R.inc(24995);observer.initialize();
        } catch (final Exception e) {
            __CLR4_4_1j9xj9xkylve3ej.R.inc(24996);fail("Observer init() threw " + e);
        }
    }finally{__CLR4_4_1j9xj9xkylve3ej.R.flushNeeded();}}

    /**
     * Check all the Collections are empty
     *
     * @param label the label to use for this check
     */
    protected void checkCollectionsEmpty(final String label) {try{__CLR4_4_1j9xj9xkylve3ej.R.inc(24997);
        __CLR4_4_1j9xj9xkylve3ej.R.inc(24998);checkCollectionSizes("EMPTY-" + label, 0, 0, 0, 0, 0, 0);
    }finally{__CLR4_4_1j9xj9xkylve3ej.R.flushNeeded();}}

    /**
     * Check all the Collections have the expected sizes.
     *
     * @param label the label to use for this check
     * @param dirCreate expected number of dirs created
     * @param dirChange expected number of dirs changed
     * @param dirDelete expected number of dirs deleted
     * @param fileCreate expected number of files created
     * @param fileChange expected number of files changed
     * @param fileDelete expected number of files deleted
     */
    protected void checkCollectionSizes(String label,
                                        final int dirCreate,
                                        final int dirChange,
                                        final int dirDelete,
                                        final int fileCreate,
                                        final int fileChange,
                                        final int fileDelete) {try{__CLR4_4_1j9xj9xkylve3ej.R.inc(24999);
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25000);label = label + "[" + listener.getCreatedDirectories().size() +
                        " " + listener.getChangedDirectories().size() +
                        " " + listener.getDeletedDirectories().size() +
                        " " + listener.getCreatedFiles().size() +
                        " " + listener.getChangedFiles().size() +
                        " " + listener.getDeletedFiles().size() + "]";
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25001);assertEquals(dirCreate, listener.getCreatedDirectories().size(), label + ": No. of directories created");
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25002);assertEquals(dirChange, listener.getChangedDirectories().size(), label + ": No. of directories changed");
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25003);assertEquals(dirDelete, listener.getDeletedDirectories().size(), label + ": No. of directories deleted");
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25004);assertEquals(fileCreate, listener.getCreatedFiles().size(), label + ": No. of files created");
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25005);assertEquals(fileChange, listener.getChangedFiles().size(), label + ": No. of files changed");
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25006);assertEquals(fileDelete, listener.getDeletedFiles().size(), label + ": No. of files deleted");
    }finally{__CLR4_4_1j9xj9xkylve3ej.R.flushNeeded();}}

    /**
     * Either creates a file if it doesn't exist or updates the last modified date/time
     * if it does.
     *
     * @param file The file to touch
     * @return The file
     * @throws IOException if an I/O error occurs.
     */
    protected File touch(File file) throws IOException {try{__CLR4_4_1j9xj9xkylve3ej.R.inc(25007);
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25008);final long lastModified = (((file.exists() )&&(__CLR4_4_1j9xj9xkylve3ej.R.iget(25009)!=0|true))||(__CLR4_4_1j9xj9xkylve3ej.R.iget(25010)==0&false))? FileUtils.lastModified(file) : 0;
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25011);try {
            __CLR4_4_1j9xj9xkylve3ej.R.inc(25012);FileUtils.touch(file);
            __CLR4_4_1j9xj9xkylve3ej.R.inc(25013);assertTrue(file.exists());
            __CLR4_4_1j9xj9xkylve3ej.R.inc(25014);file = new File(file.getParent(), file.getName());
            __CLR4_4_1j9xj9xkylve3ej.R.inc(25015);while ((((lastModified == FileUtils.lastModified(file))&&(__CLR4_4_1j9xj9xkylve3ej.R.iget(25016)!=0|true))||(__CLR4_4_1j9xj9xkylve3ej.R.iget(25017)==0&false))) {{
                __CLR4_4_1j9xj9xkylve3ej.R.inc(25018);sleepQuietly(pauseTime);
                __CLR4_4_1j9xj9xkylve3ej.R.inc(25019);FileUtils.touch(file);
                __CLR4_4_1j9xj9xkylve3ej.R.inc(25020);file = new File(file.getParent(), file.getName());
            }
        }} catch (final Exception e) {
            __CLR4_4_1j9xj9xkylve3ej.R.inc(25021);fail("Touching " + file + ": " + e);
        }
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25022);sleepQuietly(pauseTime);
        __CLR4_4_1j9xj9xkylve3ej.R.inc(25023);return file;
    }finally{__CLR4_4_1j9xj9xkylve3ej.R.flushNeeded();}}

}
