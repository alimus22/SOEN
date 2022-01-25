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

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

/**
 * A runnable that spawns a monitoring thread triggering any
 * registered {@link FileAlterationObserver} at a specified interval.
 *
 * @see FileAlterationObserver
 * @since 2.0
 */
public final class FileAlterationMonitor implements Runnable {public static class __CLR4_4_16bx6bxkylve06h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8276,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final FileAlterationObserver[] EMPTY_ARRAY = {};

    private final long interval;
    private final List<FileAlterationObserver> observers = new CopyOnWriteArrayList<>();
    private Thread thread;
    private ThreadFactory threadFactory;
    private volatile boolean running;

    /**
     * Constructs a monitor with a default interval of 10 seconds.
     */
    public FileAlterationMonitor() {
        this(10000);__CLR4_4_16bx6bxkylve06h.R.inc(8206);try{__CLR4_4_16bx6bxkylve06h.R.inc(8205);
    }finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Constructs a monitor with the specified interval.
     *
     * @param interval The amount of time in milliseconds to wait between
     * checks of the file system.
     */
    public FileAlterationMonitor(final long interval) {try{__CLR4_4_16bx6bxkylve06h.R.inc(8207);
        __CLR4_4_16bx6bxkylve06h.R.inc(8208);this.interval = interval;
    }finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Constructs a monitor with the specified interval and collection of observers.
     *
     * @param interval The amount of time in milliseconds to wait between
     * checks of the file system.
     * @param observers The collection of observers to add to the monitor.
     * @since 2.9.0
     */
    public FileAlterationMonitor(final long interval, final Collection<FileAlterationObserver> observers) {
        // @formatter:off
        this(interval,
            Optional
                .ofNullable(observers)
                .orElse(Collections.emptyList())
                .toArray(EMPTY_ARRAY)
        );__CLR4_4_16bx6bxkylve06h.R.inc(8210);try{__CLR4_4_16bx6bxkylve06h.R.inc(8209);
        // @formatter:on
    }finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Constructs a monitor with the specified interval and set of observers.
     *
     * @param interval The amount of time in milliseconds to wait between
     * checks of the file system.
     * @param observers The set of observers to add to the monitor.
     */
    public FileAlterationMonitor(final long interval, final FileAlterationObserver... observers) {
        this(interval);__CLR4_4_16bx6bxkylve06h.R.inc(8212);try{__CLR4_4_16bx6bxkylve06h.R.inc(8211);
        __CLR4_4_16bx6bxkylve06h.R.inc(8213);if ((((observers != null)&&(__CLR4_4_16bx6bxkylve06h.R.iget(8214)!=0|true))||(__CLR4_4_16bx6bxkylve06h.R.iget(8215)==0&false))) {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8216);for (final FileAlterationObserver observer : observers) {{
                __CLR4_4_16bx6bxkylve06h.R.inc(8217);addObserver(observer);
            }
        }}
    }}finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Returns the interval.
     *
     * @return the interval
     */
    public long getInterval() {try{__CLR4_4_16bx6bxkylve06h.R.inc(8218);
        __CLR4_4_16bx6bxkylve06h.R.inc(8219);return interval;
    }finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Sets the thread factory.
     *
     * @param threadFactory the thread factory
     */
    public synchronized void setThreadFactory(final ThreadFactory threadFactory) {try{__CLR4_4_16bx6bxkylve06h.R.inc(8220);
        __CLR4_4_16bx6bxkylve06h.R.inc(8221);this.threadFactory = threadFactory;
    }finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Adds a file system observer to this monitor.
     *
     * @param observer The file system observer to add
     */
    public void addObserver(final FileAlterationObserver observer) {try{__CLR4_4_16bx6bxkylve06h.R.inc(8222);
        __CLR4_4_16bx6bxkylve06h.R.inc(8223);if ((((observer != null)&&(__CLR4_4_16bx6bxkylve06h.R.iget(8224)!=0|true))||(__CLR4_4_16bx6bxkylve06h.R.iget(8225)==0&false))) {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8226);observers.add(observer);
        }
    }}finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Removes a file system observer from this monitor.
     *
     * @param observer The file system observer to remove
     */
    public void removeObserver(final FileAlterationObserver observer) {try{__CLR4_4_16bx6bxkylve06h.R.inc(8227);
        __CLR4_4_16bx6bxkylve06h.R.inc(8228);if ((((observer != null)&&(__CLR4_4_16bx6bxkylve06h.R.iget(8229)!=0|true))||(__CLR4_4_16bx6bxkylve06h.R.iget(8230)==0&false))) {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8231);while ((((observers.remove(observer))&&(__CLR4_4_16bx6bxkylve06h.R.iget(8232)!=0|true))||(__CLR4_4_16bx6bxkylve06h.R.iget(8233)==0&false))) {{
                // empty
            }
        }}
    }}finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Returns the set of {@link FileAlterationObserver} registered with
     * this monitor.
     *
     * @return The set of {@link FileAlterationObserver}
     */
    public Iterable<FileAlterationObserver> getObservers() {try{__CLR4_4_16bx6bxkylve06h.R.inc(8234);
        __CLR4_4_16bx6bxkylve06h.R.inc(8235);return observers;
    }finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Starts monitoring.
     *
     * @throws Exception if an error occurs initializing the observer
     */
    public synchronized void start() throws Exception {try{__CLR4_4_16bx6bxkylve06h.R.inc(8236);
        __CLR4_4_16bx6bxkylve06h.R.inc(8237);if ((((running)&&(__CLR4_4_16bx6bxkylve06h.R.iget(8238)!=0|true))||(__CLR4_4_16bx6bxkylve06h.R.iget(8239)==0&false))) {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8240);throw new IllegalStateException("Monitor is already running");
        }
        }__CLR4_4_16bx6bxkylve06h.R.inc(8241);for (final FileAlterationObserver observer : observers) {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8242);observer.initialize();
        }
        }__CLR4_4_16bx6bxkylve06h.R.inc(8243);running = true;
        __CLR4_4_16bx6bxkylve06h.R.inc(8244);if ((((threadFactory != null)&&(__CLR4_4_16bx6bxkylve06h.R.iget(8245)!=0|true))||(__CLR4_4_16bx6bxkylve06h.R.iget(8246)==0&false))) {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8247);thread = threadFactory.newThread(this);
        } }else {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8248);thread = new Thread(this);
        }
        }__CLR4_4_16bx6bxkylve06h.R.inc(8249);thread.start();
    }finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Stops monitoring.
     *
     * @throws Exception if an error occurs initializing the observer
     */
    public synchronized void stop() throws Exception {try{__CLR4_4_16bx6bxkylve06h.R.inc(8250);
        __CLR4_4_16bx6bxkylve06h.R.inc(8251);stop(interval);
    }finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Stops monitoring.
     *
     * @param stopInterval the amount of time in milliseconds to wait for the thread to finish.
     * A value of zero will wait until the thread is finished (see {@link Thread#join(long)}).
     * @throws Exception if an error occurs initializing the observer
     * @since 2.1
     */
    public synchronized void stop(final long stopInterval) throws Exception {try{__CLR4_4_16bx6bxkylve06h.R.inc(8252);
        __CLR4_4_16bx6bxkylve06h.R.inc(8253);if ((((!running)&&(__CLR4_4_16bx6bxkylve06h.R.iget(8254)!=0|true))||(__CLR4_4_16bx6bxkylve06h.R.iget(8255)==0&false))) {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8256);throw new IllegalStateException("Monitor is not running");
        }
        }__CLR4_4_16bx6bxkylve06h.R.inc(8257);running = false;
        __CLR4_4_16bx6bxkylve06h.R.inc(8258);try {
            __CLR4_4_16bx6bxkylve06h.R.inc(8259);thread.interrupt();
            __CLR4_4_16bx6bxkylve06h.R.inc(8260);thread.join(stopInterval);
        } catch (final InterruptedException e) {
            __CLR4_4_16bx6bxkylve06h.R.inc(8261);Thread.currentThread().interrupt();
        }
        __CLR4_4_16bx6bxkylve06h.R.inc(8262);for (final FileAlterationObserver observer : observers) {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8263);observer.destroy();
        }
    }}finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}

    /**
     * Runs this monitor.
     */
    @Override
    public void run() {try{__CLR4_4_16bx6bxkylve06h.R.inc(8264);
        __CLR4_4_16bx6bxkylve06h.R.inc(8265);while ((((running)&&(__CLR4_4_16bx6bxkylve06h.R.iget(8266)!=0|true))||(__CLR4_4_16bx6bxkylve06h.R.iget(8267)==0&false))) {{
            __CLR4_4_16bx6bxkylve06h.R.inc(8268);for (final FileAlterationObserver observer : observers) {{
                __CLR4_4_16bx6bxkylve06h.R.inc(8269);observer.checkAndNotify();
            }
            }__CLR4_4_16bx6bxkylve06h.R.inc(8270);if ((((!running)&&(__CLR4_4_16bx6bxkylve06h.R.iget(8271)!=0|true))||(__CLR4_4_16bx6bxkylve06h.R.iget(8272)==0&false))) {{
                __CLR4_4_16bx6bxkylve06h.R.inc(8273);break;
            }
            }__CLR4_4_16bx6bxkylve06h.R.inc(8274);try {
                __CLR4_4_16bx6bxkylve06h.R.inc(8275);Thread.sleep(interval);
            } catch (final InterruptedException ignored) {
                // ignore
            }
        }
    }}finally{__CLR4_4_16bx6bxkylve06h.R.flushNeeded();}}
}
