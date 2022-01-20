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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * {@link FileAlterationListener} implementation that adds created, changed and deleted
 * files/directories to a set of {@link Collection}s.
 */
public class CollectionFileListener implements FileAlterationListener, Serializable {public static class __CLR4_4_1jb4jb4kylve3eq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,25063,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 939724715678693963L;
    private final boolean clearOnStart;
    private final Collection<File> createdFiles = new ArrayList<>();
    private final Collection<File> changedFiles = new ArrayList<>();
    private final Collection<File> deletedFiles = new ArrayList<>();
    private final Collection<File> createdDirectories = new ArrayList<>();
    private final Collection<File> changedDirectories = new ArrayList<>();
    private final Collection<File> deletedDirectories = new ArrayList<>();

    /**
     * Create a new observer.
     *
     * @param clearOnStart true if clear() should be called by onStart().
     */
    public CollectionFileListener(final boolean clearOnStart) {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25024);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25025);this.clearOnStart = clearOnStart;
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * File system observer started checking event.
     *
     * @param observer The file system observer
     */
    @Override
    public void onStart(final FileAlterationObserver observer) {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25026);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25027);if ((((clearOnStart)&&(__CLR4_4_1jb4jb4kylve3eq.R.iget(25028)!=0|true))||(__CLR4_4_1jb4jb4kylve3eq.R.iget(25029)==0&false))) {{
            __CLR4_4_1jb4jb4kylve3eq.R.inc(25030);clear();
        }
    }}finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Clear file collections.
     */
    public void clear() {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25031);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25032);createdFiles.clear();
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25033);changedFiles.clear();
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25034);deletedFiles.clear();
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25035);createdDirectories.clear();
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25036);changedDirectories.clear();
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25037);deletedDirectories.clear();
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Return the set of changed directories.
     *
     * @return Directories which have changed
     */
    public Collection<File> getChangedDirectories() {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25038);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25039);return changedDirectories;
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Return the set of changed files.
     *
     * @return Files which have changed
     */
    public Collection<File> getChangedFiles() {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25040);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25041);return changedFiles;
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Return the set of created directories.
     *
     * @return Directories which have been created
     */
    public Collection<File> getCreatedDirectories() {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25042);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25043);return createdDirectories;
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Return the set of created files.
     *
     * @return Files which have been created
     */
    public Collection<File> getCreatedFiles() {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25044);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25045);return createdFiles;
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Return the set of deleted directories.
     *
     * @return Directories which been deleted
     */
    public Collection<File> getDeletedDirectories() {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25046);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25047);return deletedDirectories;
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Return the set of deleted files.
     *
     * @return Files which been deleted
     */
    public Collection<File> getDeletedFiles() {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25048);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25049);return deletedFiles;
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Directory created Event.
     *
     * @param directory The directory created
     */
    @Override
    public void onDirectoryCreate(final File directory) {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25050);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25051);createdDirectories.add(directory);
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Directory changed Event.
     *
     * @param directory The directory changed
     */
    @Override
    public void onDirectoryChange(final File directory) {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25052);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25053);changedDirectories.add(directory);
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * Directory deleted Event.
     *
     * @param directory The directory deleted
     */
    @Override
    public void onDirectoryDelete(final File directory) {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25054);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25055);deletedDirectories.add(directory);
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * File created Event.
     *
     * @param file The file created
     */
    @Override
    public void onFileCreate(final File file) {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25056);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25057);createdFiles.add(file);
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * File changed Event.
     *
     * @param file The file changed
     */
    @Override
    public void onFileChange(final File file) {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25058);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25059);changedFiles.add(file);
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * File deleted Event.
     *
     * @param file The file deleted
     */
    @Override
    public void onFileDelete(final File file) {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25060);
        __CLR4_4_1jb4jb4kylve3eq.R.inc(25061);deletedFiles.add(file);
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

    /**
     * File system observer finished checking event.
     *
     * @param observer The file system observer
     */
    @Override
    public void onStop(final FileAlterationObserver observer) {try{__CLR4_4_1jb4jb4kylve3eq.R.inc(25062);
        // noop
    }finally{__CLR4_4_1jb4jb4kylve3eq.R.flushNeeded();}}

}
