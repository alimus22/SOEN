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

/**
 * Keeps track of files awaiting deletion, and deletes them when an associated
 * marker object is reclaimed by the garbage collector.
 * <p>
 * This utility creates a background thread to handle file deletion.
 * Each file to be deleted is registered with a handler object.
 * When the handler object is garbage collected, the file is deleted.
 * <p>
 * In an environment with multiple class loaders (a servlet container, for
 * example), you should consider stopping the background thread if it is no
 * longer needed. This is done by invoking the method
 * {@link #exitWhenFinished}, typically in
 * {@code javax.servlet.ServletContextListener.contextDestroyed(javax.servlet.ServletContextEvent)} or similar.
 *
 * @deprecated Use {@link FileCleaningTracker}
 */
@Deprecated
public class FileCleaner {public static class __CLR4_4_19k9kkylvdyf8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,358,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The instance to use for the deprecated, static methods.
     */
    static final FileCleaningTracker theInstance = new FileCleaningTracker();

    /**
     * Track the specified file, using the provided marker, deleting the file
     * when the marker instance is garbage collected.
     * The {@link FileDeleteStrategy#NORMAL normal} deletion strategy will be used.
     *
     * @param file  the file to be tracked, not null
     * @param marker  the marker object used to track the file, not null
     * @throws NullPointerException if the file is null
     * @deprecated Use {@link FileCleaningTracker#track(File, Object)}.
     */
    @Deprecated
    public static void track(final File file, final Object marker) {try{__CLR4_4_19k9kkylvdyf8.R.inc(344);
        __CLR4_4_19k9kkylvdyf8.R.inc(345);theInstance.track(file, marker);
    }finally{__CLR4_4_19k9kkylvdyf8.R.flushNeeded();}}

    /**
     * Track the specified file, using the provided marker, deleting the file
     * when the marker instance is garbage collected.
     * The specified deletion strategy is used.
     *
     * @param file  the file to be tracked, not null
     * @param marker  the marker object used to track the file, not null
     * @param deleteStrategy  the strategy to delete the file, null means normal
     * @throws NullPointerException if the file is null
     * @deprecated Use {@link FileCleaningTracker#track(File, Object, FileDeleteStrategy)}.
     */
    @Deprecated
    public static void track(final File file, final Object marker, final FileDeleteStrategy deleteStrategy) {try{__CLR4_4_19k9kkylvdyf8.R.inc(346);
        __CLR4_4_19k9kkylvdyf8.R.inc(347);theInstance.track(file, marker, deleteStrategy);
    }finally{__CLR4_4_19k9kkylvdyf8.R.flushNeeded();}}

    /**
     * Track the specified file, using the provided marker, deleting the file
     * when the marker instance is garbage collected.
     * The {@link FileDeleteStrategy#NORMAL normal} deletion strategy will be used.
     *
     * @param path  the full path to the file to be tracked, not null
     * @param marker  the marker object used to track the file, not null
     * @throws NullPointerException if the path is null
     * @deprecated Use {@link FileCleaningTracker#track(String, Object)}.
     */
    @Deprecated
    public static void track(final String path, final Object marker) {try{__CLR4_4_19k9kkylvdyf8.R.inc(348);
        __CLR4_4_19k9kkylvdyf8.R.inc(349);theInstance.track(path, marker);
    }finally{__CLR4_4_19k9kkylvdyf8.R.flushNeeded();}}

    /**
     * Track the specified file, using the provided marker, deleting the file
     * when the marker instance is garbage collected.
     * The specified deletion strategy is used.
     *
     * @param path  the full path to the file to be tracked, not null
     * @param marker  the marker object used to track the file, not null
     * @param deleteStrategy  the strategy to delete the file, null means normal
     * @throws NullPointerException if the path is null
     * @deprecated Use {@link FileCleaningTracker#track(String, Object, FileDeleteStrategy)}.
     */
    @Deprecated
    public static void track(final String path, final Object marker, final FileDeleteStrategy deleteStrategy) {try{__CLR4_4_19k9kkylvdyf8.R.inc(350);
        __CLR4_4_19k9kkylvdyf8.R.inc(351);theInstance.track(path, marker, deleteStrategy);
    }finally{__CLR4_4_19k9kkylvdyf8.R.flushNeeded();}}

    /**
     * Retrieve the number of files currently being tracked, and therefore
     * awaiting deletion.
     *
     * @return the number of files being tracked
     * @deprecated Use {@link FileCleaningTracker#getTrackCount()}.
     */
    @Deprecated
    public static int getTrackCount() {try{__CLR4_4_19k9kkylvdyf8.R.inc(352);
        __CLR4_4_19k9kkylvdyf8.R.inc(353);return theInstance.getTrackCount();
    }finally{__CLR4_4_19k9kkylvdyf8.R.flushNeeded();}}

    /**
     * Call this method to cause the file cleaner thread to terminate when
     * there are no more objects being tracked for deletion.
     * <p>
     * In a simple environment, you don't need this method as the file cleaner
     * thread will simply exit when the JVM exits. In a more complex environment,
     * with multiple class loaders (such as an application server), you should be
     * aware that the file cleaner thread will continue running even if the class
     * loader it was started from terminates. This can constitute a memory leak.
     * <p>
     * For example, suppose that you have developed a web application, which
     * contains the commons-io jar file in your WEB-INF/lib directory. In other
     * words, the FileCleaner class is loaded through the class loader of your
     * web application. If the web application is terminated, but the servlet
     * container is still running, then the file cleaner thread will still exist,
     * posing a memory leak.
     * <p>
     * This method allows the thread to be terminated. Simply call this method
     * in the resource cleanup code, such as
     * {@code javax.servlet.ServletContextListener.contextDestroyed(javax.servlet.ServletContextEvent)}.
     * One called, no new objects can be tracked by the file cleaner.
     * @deprecated Use {@link FileCleaningTracker#exitWhenFinished()}.
     */
    @Deprecated
    public static synchronized void exitWhenFinished() {try{__CLR4_4_19k9kkylvdyf8.R.inc(354);
        __CLR4_4_19k9kkylvdyf8.R.inc(355);theInstance.exitWhenFinished();
    }finally{__CLR4_4_19k9kkylvdyf8.R.flushNeeded();}}

    /**
     * Returns the singleton instance, which is used by the deprecated, static methods.
     * This is mainly useful for code, which wants to support the new
     * {@link FileCleaningTracker} class while maintain compatibility with the
     * deprecated {@link FileCleaner}.
     *
     * @return the singleton instance
     */
    public static FileCleaningTracker getInstance() {try{__CLR4_4_19k9kkylvdyf8.R.inc(356);
        __CLR4_4_19k9kkylvdyf8.R.inc(357);return theInstance;
    }finally{__CLR4_4_19k9kkylvdyf8.R.flushNeeded();}}
}