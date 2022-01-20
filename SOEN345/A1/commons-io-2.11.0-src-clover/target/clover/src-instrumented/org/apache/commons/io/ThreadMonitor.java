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

import java.time.Duration;

/**
 * Monitors a thread, interrupting it if it reaches the specified timeout.
 * <p>
 * This works by sleeping until the specified timeout amount and then
 * interrupting the thread being monitored. If the thread being monitored
 * completes its work before being interrupted, it should {@code interrupt()}
 * the <i>monitor</i> thread.
 * </p>
 *
 * <pre>
 *       long timeoutInMillis = 1000;
 *       try {
 *           Thread monitor = ThreadMonitor.start(timeoutInMillis);
 *           // do some work here
 *           ThreadMonitor.stop(monitor);
 *       } catch (InterruptedException e) {
 *           // timed amount was reached
 *       }
 * </pre>
 *
 */
class ThreadMonitor implements Runnable {public static class __CLR4_4_12nt2ntkylvdz29{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3482,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Thread thread;
    private final Duration timeout;

    /**
     * Start monitoring the current thread.
     *
     * @param timeout The timeout amount in milliseconds
     * or no timeout if the value is zero or less
     * @return The monitor thread or {@code null}
     * if the timeout amount is not greater than zero
     */
    static Thread start(final Duration timeout) {try{__CLR4_4_12nt2ntkylvdz29.R.inc(3449);
        __CLR4_4_12nt2ntkylvdz29.R.inc(3450);return start(Thread.currentThread(), timeout);
    }finally{__CLR4_4_12nt2ntkylvdz29.R.flushNeeded();}}

    /**
     * Start monitoring the specified thread.
     *
     * @param thread The thread The thread to monitor
     * @param timeout The timeout amount in milliseconds
     * or no timeout if the value is zero or less
     * @return The monitor thread or {@code null}
     * if the timeout amount is not greater than zero
     */
    static Thread start(final Thread thread, final Duration timeout) {try{__CLR4_4_12nt2ntkylvdz29.R.inc(3451);
        __CLR4_4_12nt2ntkylvdz29.R.inc(3452);if ((((timeout.isZero() || timeout.isNegative())&&(__CLR4_4_12nt2ntkylvdz29.R.iget(3453)!=0|true))||(__CLR4_4_12nt2ntkylvdz29.R.iget(3454)==0&false))) {{
            __CLR4_4_12nt2ntkylvdz29.R.inc(3455);return null;
        }
        }__CLR4_4_12nt2ntkylvdz29.R.inc(3456);final ThreadMonitor timout = new ThreadMonitor(thread, timeout);
        __CLR4_4_12nt2ntkylvdz29.R.inc(3457);final Thread monitor = new Thread(timout, ThreadMonitor.class.getSimpleName());
        __CLR4_4_12nt2ntkylvdz29.R.inc(3458);monitor.setDaemon(true);
        __CLR4_4_12nt2ntkylvdz29.R.inc(3459);monitor.start();
        __CLR4_4_12nt2ntkylvdz29.R.inc(3460);return monitor;
    }finally{__CLR4_4_12nt2ntkylvdz29.R.flushNeeded();}}

    /**
     * Stop monitoring the specified thread.
     *
     * @param thread The monitor thread, may be {@code null}
     */
    static void stop(final Thread thread) {try{__CLR4_4_12nt2ntkylvdz29.R.inc(3461);
        __CLR4_4_12nt2ntkylvdz29.R.inc(3462);if ((((thread != null)&&(__CLR4_4_12nt2ntkylvdz29.R.iget(3463)!=0|true))||(__CLR4_4_12nt2ntkylvdz29.R.iget(3464)==0&false))) {{
            __CLR4_4_12nt2ntkylvdz29.R.inc(3465);thread.interrupt();
        }
    }}finally{__CLR4_4_12nt2ntkylvdz29.R.flushNeeded();}}

    /**
     * Constructs a new monitor.
     *
     * @param thread The thread to monitor
     * @param timeout The timeout amount in milliseconds
     */
    private ThreadMonitor(final Thread thread, final Duration timeout) {try{__CLR4_4_12nt2ntkylvdz29.R.inc(3466);
        __CLR4_4_12nt2ntkylvdz29.R.inc(3467);this.thread = thread;
        __CLR4_4_12nt2ntkylvdz29.R.inc(3468);this.timeout = timeout;
    }finally{__CLR4_4_12nt2ntkylvdz29.R.flushNeeded();}}

    /**
     * Sleep until the specified timeout amount and then
     * interrupt the thread being monitored.
     *
     * @see Runnable#run()
     */
    @Override
    public void run() {try{__CLR4_4_12nt2ntkylvdz29.R.inc(3469);
        __CLR4_4_12nt2ntkylvdz29.R.inc(3470);try {
            __CLR4_4_12nt2ntkylvdz29.R.inc(3471);sleep(timeout);
            __CLR4_4_12nt2ntkylvdz29.R.inc(3472);thread.interrupt();
        } catch (final InterruptedException e) {
            // timeout not reached
        }
    }finally{__CLR4_4_12nt2ntkylvdz29.R.flushNeeded();}}

    /**
     * Sleeps for a guaranteed minimum duration unless interrupted.
     *
     * This method exists because Thread.sleep(100) can sleep for 0, 70, 100 or 200ms or anything else
     * it deems appropriate. Read the docs on Thread.sleep for further interesting details.
     *
     * @param duration the sleep duration.
     * @throws InterruptedException if interrupted
     */
    private static void sleep(final Duration duration) throws InterruptedException {try{__CLR4_4_12nt2ntkylvdz29.R.inc(3473);
        // Ignore nanos for now.
        __CLR4_4_12nt2ntkylvdz29.R.inc(3474);final long millis = duration.toMillis();
        __CLR4_4_12nt2ntkylvdz29.R.inc(3475);final long finishAtMillis = System.currentTimeMillis() + millis;
        __CLR4_4_12nt2ntkylvdz29.R.inc(3476);long remainingMillis = millis;
        __CLR4_4_12nt2ntkylvdz29.R.inc(3477);do {{
            __CLR4_4_12nt2ntkylvdz29.R.inc(3478);Thread.sleep(remainingMillis);
            __CLR4_4_12nt2ntkylvdz29.R.inc(3479);remainingMillis = finishAtMillis - System.currentTimeMillis();
        } }while ((((remainingMillis > 0)&&(__CLR4_4_12nt2ntkylvdz29.R.iget(3480)!=0|true))||(__CLR4_4_12nt2ntkylvdz29.R.iget(3481)==0&false)));
    }finally{__CLR4_4_12nt2ntkylvdz29.R.flushNeeded();}}


}