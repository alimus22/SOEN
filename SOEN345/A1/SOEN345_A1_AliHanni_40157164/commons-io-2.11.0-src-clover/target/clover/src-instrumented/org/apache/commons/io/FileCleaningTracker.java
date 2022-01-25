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
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

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
 */
public class FileCleaningTracker {public static class __CLR4_4_19y9ykylvdyfy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,417,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Note: fields are package protected to allow use by test cases

    /**
     * Queue of {@code Tracker} instances being watched.
     */
    ReferenceQueue<Object> q = new ReferenceQueue<>();
    /**
     * Collection of {@code Tracker} instances in existence.
     */
    final Collection<Tracker> trackers = Collections.synchronizedSet(new HashSet<>()); // synchronized
    /**
     * Collection of File paths that failed to delete.
     */
    final List<String> deleteFailures = Collections.synchronizedList(new ArrayList<>());
    /**
     * Whether to terminate the thread when the tracking is complete.
     */
    volatile boolean exitWhenFinished;
    /**
     * The thread that will clean up registered files.
     */
    Thread reaper;

    /**
     * Track the specified file, using the provided marker, deleting the file
     * when the marker instance is garbage collected.
     * The {@link FileDeleteStrategy#NORMAL normal} deletion strategy will be used.
     *
     * @param file  the file to be tracked, not null
     * @param marker  the marker object used to track the file, not null
     * @throws NullPointerException if the file is null
     */
    public void track(final File file, final Object marker) {try{__CLR4_4_19y9ykylvdyfy.R.inc(358);
        __CLR4_4_19y9ykylvdyfy.R.inc(359);track(file, marker, null);
    }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

    /**
     * Track the specified file, using the provided marker, deleting the file
     * when the marker instance is garbage collected.
     * The specified deletion strategy is used.
     *
     * @param file  the file to be tracked, not null
     * @param marker  the marker object used to track the file, not null
     * @param deleteStrategy  the strategy to delete the file, null means normal
     * @throws NullPointerException if the file is null
     */
    public void track(final File file, final Object marker, final FileDeleteStrategy deleteStrategy) {try{__CLR4_4_19y9ykylvdyfy.R.inc(360);
        __CLR4_4_19y9ykylvdyfy.R.inc(361);Objects.requireNonNull(file, "file");
        __CLR4_4_19y9ykylvdyfy.R.inc(362);addTracker(file.getPath(), marker, deleteStrategy);
    }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

    /**
     * Track the specified file, using the provided marker, deleting the file
     * when the marker instance is garbage collected.
     * The {@link FileDeleteStrategy#NORMAL normal} deletion strategy will be used.
     *
     * @param path  the full path to the file to be tracked, not null
     * @param marker  the marker object used to track the file, not null
     * @throws NullPointerException if the path is null
     */
    public void track(final String path, final Object marker) {try{__CLR4_4_19y9ykylvdyfy.R.inc(363);
        __CLR4_4_19y9ykylvdyfy.R.inc(364);track(path, marker, null);
    }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

    /**
     * Track the specified file, using the provided marker, deleting the file
     * when the marker instance is garbage collected.
     * The specified deletion strategy is used.
     *
     * @param path  the full path to the file to be tracked, not null
     * @param marker  the marker object used to track the file, not null
     * @param deleteStrategy  the strategy to delete the file, null means normal
     * @throws NullPointerException if the path is null
     */
    public void track(final String path, final Object marker, final FileDeleteStrategy deleteStrategy) {try{__CLR4_4_19y9ykylvdyfy.R.inc(365);
        __CLR4_4_19y9ykylvdyfy.R.inc(366);Objects.requireNonNull(path, "path");
        __CLR4_4_19y9ykylvdyfy.R.inc(367);addTracker(path, marker, deleteStrategy);
    }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

    /**
     * Adds a tracker to the list of trackers.
     *
     * @param path  the full path to the file to be tracked, not null
     * @param marker  the marker object used to track the file, not null
     * @param deleteStrategy  the strategy to delete the file, null means normal
     */
    private synchronized void addTracker(final String path, final Object marker, final FileDeleteStrategy
            deleteStrategy) {try{__CLR4_4_19y9ykylvdyfy.R.inc(368);
        // synchronized block protects reaper
        __CLR4_4_19y9ykylvdyfy.R.inc(369);if ((((exitWhenFinished)&&(__CLR4_4_19y9ykylvdyfy.R.iget(370)!=0|true))||(__CLR4_4_19y9ykylvdyfy.R.iget(371)==0&false))) {{
            __CLR4_4_19y9ykylvdyfy.R.inc(372);throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
        }
        }__CLR4_4_19y9ykylvdyfy.R.inc(373);if ((((reaper == null)&&(__CLR4_4_19y9ykylvdyfy.R.iget(374)!=0|true))||(__CLR4_4_19y9ykylvdyfy.R.iget(375)==0&false))) {{
            __CLR4_4_19y9ykylvdyfy.R.inc(376);reaper = new Reaper();
            __CLR4_4_19y9ykylvdyfy.R.inc(377);reaper.start();
        }
        }__CLR4_4_19y9ykylvdyfy.R.inc(378);trackers.add(new Tracker(path, deleteStrategy, marker, q));
    }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

    /**
     * Retrieve the number of files currently being tracked, and therefore
     * awaiting deletion.
     *
     * @return the number of files being tracked
     */
    public int getTrackCount() {try{__CLR4_4_19y9ykylvdyfy.R.inc(379);
        __CLR4_4_19y9ykylvdyfy.R.inc(380);return trackers.size();
    }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

    /**
     * Return the file paths that failed to delete.
     *
     * @return the file paths that failed to delete
     * @since 2.0
     */
    public List<String> getDeleteFailures() {try{__CLR4_4_19y9ykylvdyfy.R.inc(381);
        __CLR4_4_19y9ykylvdyfy.R.inc(382);return deleteFailures;
    }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

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
     * Once called, no new objects can be tracked by the file cleaner.
     */
    public synchronized void exitWhenFinished() {try{__CLR4_4_19y9ykylvdyfy.R.inc(383);
        // synchronized block protects reaper
        __CLR4_4_19y9ykylvdyfy.R.inc(384);exitWhenFinished = true;
        __CLR4_4_19y9ykylvdyfy.R.inc(385);if ((((reaper != null)&&(__CLR4_4_19y9ykylvdyfy.R.iget(386)!=0|true))||(__CLR4_4_19y9ykylvdyfy.R.iget(387)==0&false))) {{
            __CLR4_4_19y9ykylvdyfy.R.inc(388);synchronized (reaper) {
                __CLR4_4_19y9ykylvdyfy.R.inc(389);reaper.interrupt();
            }
        }
    }}finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

    /**
     * The reaper thread.
     */
    private final class Reaper extends Thread {
        /** Construct a new Reaper */
        Reaper() {
            super("File Reaper");__CLR4_4_19y9ykylvdyfy.R.inc(391);try{__CLR4_4_19y9ykylvdyfy.R.inc(390);
            __CLR4_4_19y9ykylvdyfy.R.inc(392);setPriority(Thread.MAX_PRIORITY);
            __CLR4_4_19y9ykylvdyfy.R.inc(393);setDaemon(true);
        }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

        /**
         * Run the reaper thread that will delete files as their associated
         * marker objects are reclaimed by the garbage collector.
         */
        @Override
        public void run() {try{__CLR4_4_19y9ykylvdyfy.R.inc(394);
            // thread exits when exitWhenFinished is true and there are no more tracked objects
            __CLR4_4_19y9ykylvdyfy.R.inc(395);while ((((!exitWhenFinished || !trackers.isEmpty())&&(__CLR4_4_19y9ykylvdyfy.R.iget(396)!=0|true))||(__CLR4_4_19y9ykylvdyfy.R.iget(397)==0&false))) {{
                __CLR4_4_19y9ykylvdyfy.R.inc(398);try {
                    // Wait for a tracker to remove.
                    __CLR4_4_19y9ykylvdyfy.R.inc(399);final Tracker tracker = (Tracker) q.remove(); // cannot return null
                    __CLR4_4_19y9ykylvdyfy.R.inc(400);trackers.remove(tracker);
                    __CLR4_4_19y9ykylvdyfy.R.inc(401);if ((((!tracker.delete())&&(__CLR4_4_19y9ykylvdyfy.R.iget(402)!=0|true))||(__CLR4_4_19y9ykylvdyfy.R.iget(403)==0&false))) {{
                        __CLR4_4_19y9ykylvdyfy.R.inc(404);deleteFailures.add(tracker.getPath());
                    }
                    }__CLR4_4_19y9ykylvdyfy.R.inc(405);tracker.clear();
                } catch (final InterruptedException e) {
                    __CLR4_4_19y9ykylvdyfy.R.inc(406);continue;
                }
            }
        }}finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}
    }

    /**
     * Inner class which acts as the reference for a file pending deletion.
     */
    private static final class Tracker extends PhantomReference<Object> {

        /**
         * The full path to the file being tracked.
         */
        private final String path;
        /**
         * The strategy for deleting files.
         */
        private final FileDeleteStrategy deleteStrategy;

        /**
         * Constructs an instance of this class from the supplied parameters.
         *
         * @param path  the full path to the file to be tracked, not null
         * @param deleteStrategy  the strategy to delete the file, null means normal
         * @param marker  the marker object used to track the file, not null
         * @param queue  the queue on to which the tracker will be pushed, not null
         */
        Tracker(final String path, final FileDeleteStrategy deleteStrategy, final Object marker,
                final ReferenceQueue<? super Object> queue) {
            super(marker, queue);__CLR4_4_19y9ykylvdyfy.R.inc(408);try{__CLR4_4_19y9ykylvdyfy.R.inc(407);
            __CLR4_4_19y9ykylvdyfy.R.inc(409);this.path = path;
            __CLR4_4_19y9ykylvdyfy.R.inc(410);this.deleteStrategy = (((deleteStrategy == null )&&(__CLR4_4_19y9ykylvdyfy.R.iget(411)!=0|true))||(__CLR4_4_19y9ykylvdyfy.R.iget(412)==0&false))? FileDeleteStrategy.NORMAL : deleteStrategy;
        }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

        /**
         * Return the path.
         *
         * @return the path
         */
        public String getPath() {try{__CLR4_4_19y9ykylvdyfy.R.inc(413);
            __CLR4_4_19y9ykylvdyfy.R.inc(414);return path;
        }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}

        /**
         * Deletes the file associated with this tracker instance.
         *
         * @return {@code true} if the file was deleted successfully;
         *         {@code false} otherwise.
         */
        public boolean delete() {try{__CLR4_4_19y9ykylvdyfy.R.inc(415);
            __CLR4_4_19y9ykylvdyfy.R.inc(416);return deleteStrategy.deleteQuietly(new File(path));
        }finally{__CLR4_4_19y9ykylvdyfy.R.flushNeeded();}}
    }

}
