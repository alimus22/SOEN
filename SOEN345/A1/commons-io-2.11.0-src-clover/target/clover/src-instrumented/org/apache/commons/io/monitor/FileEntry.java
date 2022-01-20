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
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;

/**
 * The state of a file or directory, capturing the following {@link File} attributes at a point in time.
 * <ul>
 *   <li>File Name (see {@link File#getName()})</li>
 *   <li>Exists - whether the file exists or not (see {@link File#exists()})</li>
 *   <li>Directory - whether the file is a directory or not (see {@link File#isDirectory()})</li>
 *   <li>Last Modified Date/Time (see {@link FileUtils#lastModifiedUnchecked(File)})</li>
 *   <li>Length (see {@link File#length()}) - directories treated as zero</li>
 *   <li>Children - contents of a directory (see {@link File#listFiles(java.io.FileFilter)})</li>
 * </ul>
 *
 * <h2>Custom Implementations</h2>
 * <p>
 * If the state of additional {@link File} attributes is required then create a custom
 * {@link FileEntry} with properties for those attributes. Override the
 * {@link #newChildInstance(File)} to return a new instance of the appropriate type.
 * You may also want to override the {@link #refresh(File)} method.
 * </p>
 * @see FileAlterationObserver
 * @since 2.0
 */
public class FileEntry implements Serializable {public static class __CLR4_4_16in6inkylve08v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8510,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -2505664948818681153L;

    static final FileEntry[] EMPTY_FILE_ENTRY_ARRAY = {};

    private final FileEntry parent;
    private FileEntry[] children;
    private final File file;
    private String name;
    private boolean exists;
    private boolean directory;
    private long lastModified;
    private long length;

    /**
     * Construct a new monitor for a specified {@link File}.
     *
     * @param file The file being monitored
     */
    public FileEntry(final File file) {
        this(null, file);__CLR4_4_16in6inkylve08v.R.inc(8448);try{__CLR4_4_16in6inkylve08v.R.inc(8447);
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Construct a new monitor for a specified {@link File}.
     *
     * @param parent The parent
     * @param file The file being monitored
     */
    public FileEntry(final FileEntry parent, final File file) {try{__CLR4_4_16in6inkylve08v.R.inc(8449);
        __CLR4_4_16in6inkylve08v.R.inc(8450);if ((((file == null)&&(__CLR4_4_16in6inkylve08v.R.iget(8451)!=0|true))||(__CLR4_4_16in6inkylve08v.R.iget(8452)==0&false))) {{
            __CLR4_4_16in6inkylve08v.R.inc(8453);throw new IllegalArgumentException("File is missing");
        }
        }__CLR4_4_16in6inkylve08v.R.inc(8454);this.file = file;
        __CLR4_4_16in6inkylve08v.R.inc(8455);this.parent = parent;
        __CLR4_4_16in6inkylve08v.R.inc(8456);this.name = file.getName();
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Refresh the attributes from the {@link File}, indicating
     * whether the file has changed.
     * <p>
     * This implementation refreshes the {@code name}, {@code exists},
     * {@code directory}, {@code lastModified} and {@code length}
     * properties.
     * <p>
     * The {@code exists}, {@code directory}, {@code lastModified}
     * and {@code length} properties are compared for changes
     *
     * @param file the file instance to compare to
     * @return {@code true} if the file has changed, otherwise {@code false}
     */
    public boolean refresh(final File file) {try{__CLR4_4_16in6inkylve08v.R.inc(8457);
        // cache original values
        __CLR4_4_16in6inkylve08v.R.inc(8458);final boolean origExists = exists;
        __CLR4_4_16in6inkylve08v.R.inc(8459);final long origLastModified = lastModified;
        __CLR4_4_16in6inkylve08v.R.inc(8460);final boolean origDirectory = directory;
        __CLR4_4_16in6inkylve08v.R.inc(8461);final long origLength = length;

        // refresh the values
        __CLR4_4_16in6inkylve08v.R.inc(8462);name = file.getName();
        __CLR4_4_16in6inkylve08v.R.inc(8463);exists = Files.exists(file.toPath());
        __CLR4_4_16in6inkylve08v.R.inc(8464);directory = exists && file.isDirectory();
        __CLR4_4_16in6inkylve08v.R.inc(8465);try {
            __CLR4_4_16in6inkylve08v.R.inc(8466);lastModified = (((exists )&&(__CLR4_4_16in6inkylve08v.R.iget(8467)!=0|true))||(__CLR4_4_16in6inkylve08v.R.iget(8468)==0&false))? FileUtils.lastModified(file) : 0;
        } catch (final IOException e) {
            __CLR4_4_16in6inkylve08v.R.inc(8469);lastModified = 0;
        }
        __CLR4_4_16in6inkylve08v.R.inc(8470);length = (((exists && !directory )&&(__CLR4_4_16in6inkylve08v.R.iget(8471)!=0|true))||(__CLR4_4_16in6inkylve08v.R.iget(8472)==0&false))? file.length() : 0;

        // Return if there are changes
        __CLR4_4_16in6inkylve08v.R.inc(8473);return exists != origExists || lastModified != origLastModified || directory != origDirectory
            || length != origLength;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Create a new child instance.
     * <p>
     * Custom implementations should override this method to return
     * a new instance of the appropriate type.
     *
     * @param file The child file
     * @return a new child instance
     */
    public FileEntry newChildInstance(final File file) {try{__CLR4_4_16in6inkylve08v.R.inc(8474);
        __CLR4_4_16in6inkylve08v.R.inc(8475);return new FileEntry(this, file);
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Return the parent entry.
     *
     * @return the parent entry
     */
    public FileEntry getParent() {try{__CLR4_4_16in6inkylve08v.R.inc(8476);
        __CLR4_4_16in6inkylve08v.R.inc(8477);return parent;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Return the level
     *
     * @return the level
     */
    public int getLevel() {try{__CLR4_4_16in6inkylve08v.R.inc(8478);
        __CLR4_4_16in6inkylve08v.R.inc(8479);return (((parent == null )&&(__CLR4_4_16in6inkylve08v.R.iget(8480)!=0|true))||(__CLR4_4_16in6inkylve08v.R.iget(8481)==0&false))? 0 : parent.getLevel() + 1;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Return the directory's files.
     *
     * @return This directory's files or an empty
     * array if the file is not a directory or the
     * directory is empty
     */
    public FileEntry[] getChildren() {try{__CLR4_4_16in6inkylve08v.R.inc(8482);
        __CLR4_4_16in6inkylve08v.R.inc(8483);return (((children != null )&&(__CLR4_4_16in6inkylve08v.R.iget(8484)!=0|true))||(__CLR4_4_16in6inkylve08v.R.iget(8485)==0&false))? children : EMPTY_FILE_ENTRY_ARRAY;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Set the directory's files.
     *
     * @param children This directory's files, may be null
     */
    public void setChildren(final FileEntry... children) {try{__CLR4_4_16in6inkylve08v.R.inc(8486);
        __CLR4_4_16in6inkylve08v.R.inc(8487);this.children = children;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Return the file being monitored.
     *
     * @return the file being monitored
     */
    public File getFile() {try{__CLR4_4_16in6inkylve08v.R.inc(8488);
        __CLR4_4_16in6inkylve08v.R.inc(8489);return file;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Return the file name.
     *
     * @return the file name
     */
    public String getName() {try{__CLR4_4_16in6inkylve08v.R.inc(8490);
        __CLR4_4_16in6inkylve08v.R.inc(8491);return name;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Set the file name.
     *
     * @param name the file name
     */
    public void setName(final String name) {try{__CLR4_4_16in6inkylve08v.R.inc(8492);
        __CLR4_4_16in6inkylve08v.R.inc(8493);this.name = name;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Return the last modified time from the last time it
     * was checked.
     *
     * @return the last modified time
     */
    public long getLastModified() {try{__CLR4_4_16in6inkylve08v.R.inc(8494);
        __CLR4_4_16in6inkylve08v.R.inc(8495);return lastModified;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Return the last modified time from the last time it
     * was checked.
     *
     * @param lastModified The last modified time
     */
    public void setLastModified(final long lastModified) {try{__CLR4_4_16in6inkylve08v.R.inc(8496);
        __CLR4_4_16in6inkylve08v.R.inc(8497);this.lastModified = lastModified;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Return the length.
     *
     * @return the length
     */
    public long getLength() {try{__CLR4_4_16in6inkylve08v.R.inc(8498);
        __CLR4_4_16in6inkylve08v.R.inc(8499);return length;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Set the length.
     *
     * @param length the length
     */
    public void setLength(final long length) {try{__CLR4_4_16in6inkylve08v.R.inc(8500);
        __CLR4_4_16in6inkylve08v.R.inc(8501);this.length = length;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Indicate whether the file existed the last time it
     * was checked.
     *
     * @return whether the file existed
     */
    public boolean isExists() {try{__CLR4_4_16in6inkylve08v.R.inc(8502);
        __CLR4_4_16in6inkylve08v.R.inc(8503);return exists;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Set whether the file existed the last time it
     * was checked.
     *
     * @param exists whether the file exists or not
     */
    public void setExists(final boolean exists) {try{__CLR4_4_16in6inkylve08v.R.inc(8504);
        __CLR4_4_16in6inkylve08v.R.inc(8505);this.exists = exists;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Indicate whether the file is a directory or not.
     *
     * @return whether the file is a directory or not
     */
    public boolean isDirectory() {try{__CLR4_4_16in6inkylve08v.R.inc(8506);
        __CLR4_4_16in6inkylve08v.R.inc(8507);return directory;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}

    /**
     * Set whether the file is a directory or not.
     *
     * @param directory whether the file is a directory or not
     */
    public void setDirectory(final boolean directory) {try{__CLR4_4_16in6inkylve08v.R.inc(8508);
        __CLR4_4_16in6inkylve08v.R.inc(8509);this.directory = directory;
    }finally{__CLR4_4_16in6inkylve08v.R.flushNeeded();}}
}
