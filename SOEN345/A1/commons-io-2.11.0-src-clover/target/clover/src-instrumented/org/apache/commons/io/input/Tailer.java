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
package org.apache.commons.io.input;

import static org.apache.commons.io.IOUtils.CR;
import static org.apache.commons.io.IOUtils.EOF;
import static org.apache.commons.io.IOUtils.LF;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * Simple implementation of the unix "tail -f" functionality.
 *
 * <h2>1. Create a TailerListener implementation</h2>
 * <p>
 * First you need to create a {@link TailerListener} implementation
 * ({@link TailerListenerAdapter} is provided for convenience so that you don't have to
 * implement every method).
 * </p>
 *
 * <p>For example:</p>
 * <pre>
 *  public class MyTailerListener extends TailerListenerAdapter {
 *      public void handle(String line) {
 *          System.out.println(line);
 *      }
 *  }</pre>
 *
 * <h2>2. Using a Tailer</h2>
 *
 * <p>
 * You can create and use a Tailer in one of three ways:
 * </p>
 * <ul>
 *   <li>Using one of the static helper methods:
 *     <ul>
 *       <li>{@link Tailer#create(File, TailerListener)}</li>
 *       <li>{@link Tailer#create(File, TailerListener, long)}</li>
 *       <li>{@link Tailer#create(File, TailerListener, long, boolean)}</li>
 *     </ul>
 *   </li>
 *   <li>Using an {@link java.util.concurrent.Executor}</li>
 *   <li>Using an {@link Thread}</li>
 * </ul>
 *
 * <p>
 * An example of each of these is shown below.
 * </p>
 *
 * <h3>2.1 Using the static helper method</h3>
 *
 * <pre>
 *      TailerListener listener = new MyTailerListener();
 *      Tailer tailer = Tailer.create(file, listener, delay);</pre>
 *
 * <h3>2.2 Using an Executor</h3>
 *
 * <pre>
 *      TailerListener listener = new MyTailerListener();
 *      Tailer tailer = new Tailer(file, listener, delay);
 *
 *      // stupid executor impl. for demo purposes
 *      Executor executor = new Executor() {
 *          public void execute(Runnable command) {
 *              command.run();
 *           }
 *      };
 *
 *      executor.execute(tailer);
 * </pre>
 *
 *
 * <h3>2.3 Using a Thread</h3>
 * <pre>
 *      TailerListener listener = new MyTailerListener();
 *      Tailer tailer = new Tailer(file, listener, delay);
 *      Thread thread = new Thread(tailer);
 *      thread.setDaemon(true); // optional
 *      thread.start();</pre>
 *
 * <h2>3. Stopping a Tailer</h2>
 * <p>Remember to stop the tailer when you have done with it:</p>
 * <pre>
 *      tailer.stop();
 * </pre>
 *
 * <h2>4. Interrupting a Tailer</h2>
 * <p>You can interrupt the thread a tailer is running on by calling {@link Thread#interrupt()}.
 * </p>
 * <pre>
 *      thread.interrupt();
 * </pre>
 * <p>
 * If you interrupt a tailer, the tailer listener is called with the {@link InterruptedException}.
 * </p>
 * <p>
 * The file is read using the default charset; this can be overridden if necessary.
 * </p>
 * @see TailerListener
 * @see TailerListenerAdapter
 * @since 2.0
 * @since 2.5 Updated behavior and documentation for {@link Thread#interrupt()}
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Tailer implements Runnable {public static class __CLR4_4_15kh5khkylve00q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,7379,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int DEFAULT_DELAY_MILLIS = 1000;

    private static final String RAF_MODE = "r";

    // The default charset used for reading files
    private static final Charset DEFAULT_CHARSET = Charset.defaultCharset();

    /**
     * Buffer on top of RandomAccessFile.
     */
    private final byte[] inbuf;

    /**
     * The file which will be tailed.
     */
    private final File file;

    /**
     * The character set that will be used to read the file.
     */
    private final Charset charset;

    /**
     * The amount of time to wait for the file to be updated.
     */
    private final long delayMillis;

    /**
     * Whether to tail from the end or start of file
     */
    private final boolean end;

    /**
     * The listener to notify of events when tailing.
     */
    private final TailerListener listener;

    /**
     * Whether to close and reopen the file whilst waiting for more input.
     */
    private final boolean reOpen;

    /**
     * The tailer will run as long as this value is true.
     */
    private volatile boolean run = true;

    /**
     * Creates a Tailer for the given file, starting from the beginning, with the default delay of 1.0s.
     * @param file The file to follow.
     * @param listener the TailerListener to use.
     */
    public Tailer(final File file, final TailerListener listener) {
        this(file, listener, DEFAULT_DELAY_MILLIS);__CLR4_4_15kh5khkylve00q.R.inc(7218);try{__CLR4_4_15kh5khkylve00q.R.inc(7217);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates a Tailer for the given file, starting from the beginning.
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     */
    public Tailer(final File file, final TailerListener listener, final long delayMillis) {
        this(file, listener, delayMillis, false);__CLR4_4_15kh5khkylve00q.R.inc(7220);try{__CLR4_4_15kh5khkylve00q.R.inc(7219);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates a Tailer for the given file, with a delay other than the default 1.0s.
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     */
    public Tailer(final File file, final TailerListener listener, final long delayMillis, final boolean end) {
        this(file, listener, delayMillis, end, IOUtils.DEFAULT_BUFFER_SIZE);__CLR4_4_15kh5khkylve00q.R.inc(7222);try{__CLR4_4_15kh5khkylve00q.R.inc(7221);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates a Tailer for the given file, with a delay other than the default 1.0s.
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     * @param reOpen if true, close and reopen the file between reading chunks
     */
    public Tailer(final File file, final TailerListener listener, final long delayMillis, final boolean end,
                  final boolean reOpen) {
        this(file, listener, delayMillis, end, reOpen, IOUtils.DEFAULT_BUFFER_SIZE);__CLR4_4_15kh5khkylve00q.R.inc(7224);try{__CLR4_4_15kh5khkylve00q.R.inc(7223);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates a Tailer for the given file, with a specified buffer size.
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     * @param bufSize Buffer size
     */
    public Tailer(final File file, final TailerListener listener, final long delayMillis, final boolean end,
                  final int bufSize) {
        this(file, listener, delayMillis, end, false, bufSize);__CLR4_4_15kh5khkylve00q.R.inc(7226);try{__CLR4_4_15kh5khkylve00q.R.inc(7225);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates a Tailer for the given file, with a specified buffer size.
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     * @param reOpen if true, close and reopen the file between reading chunks
     * @param bufSize Buffer size
     */
    public Tailer(final File file, final TailerListener listener, final long delayMillis, final boolean end,
                  final boolean reOpen, final int bufSize) {
        this(file, DEFAULT_CHARSET, listener, delayMillis, end, reOpen, bufSize);__CLR4_4_15kh5khkylve00q.R.inc(7228);try{__CLR4_4_15kh5khkylve00q.R.inc(7227);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates a Tailer for the given file, with a specified buffer size.
     * @param file the file to follow.
     * @param charset the Charset to be used for reading the file
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     * @param reOpen if true, close and reopen the file between reading chunks
     * @param bufSize Buffer size
     */
    public Tailer(final File file, final Charset charset, final TailerListener listener, final long delayMillis,
                  final boolean end, final boolean reOpen
            , final int bufSize) {try{__CLR4_4_15kh5khkylve00q.R.inc(7229);
        __CLR4_4_15kh5khkylve00q.R.inc(7230);this.file = file;
        __CLR4_4_15kh5khkylve00q.R.inc(7231);this.delayMillis = delayMillis;
        __CLR4_4_15kh5khkylve00q.R.inc(7232);this.end = end;

        __CLR4_4_15kh5khkylve00q.R.inc(7233);this.inbuf = IOUtils.byteArray(bufSize);

        // Save and prepare the listener
        __CLR4_4_15kh5khkylve00q.R.inc(7234);this.listener = listener;
        __CLR4_4_15kh5khkylve00q.R.inc(7235);listener.init(this);
        __CLR4_4_15kh5khkylve00q.R.inc(7236);this.reOpen = reOpen;
        __CLR4_4_15kh5khkylve00q.R.inc(7237);this.charset = charset;
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates and starts a Tailer for the given file.
     *
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     * @param bufSize buffer size.
     * @return The new tailer
     */
    public static Tailer create(final File file, final TailerListener listener, final long delayMillis,
                                final boolean end, final int bufSize) {try{__CLR4_4_15kh5khkylve00q.R.inc(7238);
        __CLR4_4_15kh5khkylve00q.R.inc(7239);return create(file, listener, delayMillis, end, false, bufSize);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates and starts a Tailer for the given file.
     *
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     * @param reOpen whether to close/reopen the file between chunks
     * @param bufSize buffer size.
     * @return The new tailer
     */
    public static Tailer create(final File file, final TailerListener listener, final long delayMillis,
                                final boolean end, final boolean reOpen,
            final int bufSize) {try{__CLR4_4_15kh5khkylve00q.R.inc(7240);
        __CLR4_4_15kh5khkylve00q.R.inc(7241);return create(file, DEFAULT_CHARSET, listener, delayMillis, end, reOpen, bufSize);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates and starts a Tailer for the given file.
     *
     * @param file the file to follow.
     * @param charset the character set to use for reading the file
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     * @param reOpen whether to close/reopen the file between chunks
     * @param bufSize buffer size.
     * @return The new tailer
     */
    public static Tailer create(final File file, final Charset charset, final TailerListener listener,
                                final long delayMillis, final boolean end, final boolean reOpen
            ,final int bufSize) {try{__CLR4_4_15kh5khkylve00q.R.inc(7242);
        __CLR4_4_15kh5khkylve00q.R.inc(7243);final Tailer tailer = new Tailer(file, charset, listener, delayMillis, end, reOpen, bufSize);
        __CLR4_4_15kh5khkylve00q.R.inc(7244);final Thread thread = new Thread(tailer);
        __CLR4_4_15kh5khkylve00q.R.inc(7245);thread.setDaemon(true);
        __CLR4_4_15kh5khkylve00q.R.inc(7246);thread.start();
        __CLR4_4_15kh5khkylve00q.R.inc(7247);return tailer;
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates and starts a Tailer for the given file with default buffer size.
     *
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     * @return The new tailer
     */
    public static Tailer create(final File file, final TailerListener listener, final long delayMillis,
                                final boolean end) {try{__CLR4_4_15kh5khkylve00q.R.inc(7248);
        __CLR4_4_15kh5khkylve00q.R.inc(7249);return create(file, listener, delayMillis, end, IOUtils.DEFAULT_BUFFER_SIZE);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates and starts a Tailer for the given file with default buffer size.
     *
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @param end Set to true to tail from the end of the file, false to tail from the beginning of the file.
     * @param reOpen whether to close/reopen the file between chunks
     * @return The new tailer
     */
    public static Tailer create(final File file, final TailerListener listener, final long delayMillis,
                                final boolean end, final boolean reOpen) {try{__CLR4_4_15kh5khkylve00q.R.inc(7250);
        __CLR4_4_15kh5khkylve00q.R.inc(7251);return create(file, listener, delayMillis, end, reOpen, IOUtils.DEFAULT_BUFFER_SIZE);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates and starts a Tailer for the given file, starting at the beginning of the file
     *
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @param delayMillis the delay between checks of the file for new content in milliseconds.
     * @return The new tailer
     */
    public static Tailer create(final File file, final TailerListener listener, final long delayMillis) {try{__CLR4_4_15kh5khkylve00q.R.inc(7252);
        __CLR4_4_15kh5khkylve00q.R.inc(7253);return create(file, listener, delayMillis, false);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Creates and starts a Tailer for the given file, starting at the beginning of the file
     * with the default delay of 1.0s
     *
     * @param file the file to follow.
     * @param listener the TailerListener to use.
     * @return The new tailer
     */
    public static Tailer create(final File file, final TailerListener listener) {try{__CLR4_4_15kh5khkylve00q.R.inc(7254);
        __CLR4_4_15kh5khkylve00q.R.inc(7255);return create(file, listener, DEFAULT_DELAY_MILLIS, false);
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Return the file.
     *
     * @return the file
     */
    public File getFile() {try{__CLR4_4_15kh5khkylve00q.R.inc(7256);
        __CLR4_4_15kh5khkylve00q.R.inc(7257);return file;
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Gets whether to keep on running.
     *
     * @return whether to keep on running.
     * @since 2.5
     */
    protected boolean getRun() {try{__CLR4_4_15kh5khkylve00q.R.inc(7258);
        __CLR4_4_15kh5khkylve00q.R.inc(7259);return run;
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Return the delay in milliseconds.
     *
     * @return the delay in milliseconds.
     */
    public long getDelay() {try{__CLR4_4_15kh5khkylve00q.R.inc(7260);
        __CLR4_4_15kh5khkylve00q.R.inc(7261);return delayMillis;
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Follows changes in the file, calling the TailerListener's handle method for each new line.
     */
    @Override
    public void run() {try{__CLR4_4_15kh5khkylve00q.R.inc(7262);
        __CLR4_4_15kh5khkylve00q.R.inc(7263);RandomAccessFile reader = null;
        __CLR4_4_15kh5khkylve00q.R.inc(7264);try {
            __CLR4_4_15kh5khkylve00q.R.inc(7265);long last = 0; // The last time the file was checked for changes
            __CLR4_4_15kh5khkylve00q.R.inc(7266);long position = 0; // position within the file
            // Open the file
            __CLR4_4_15kh5khkylve00q.R.inc(7267);while ((((getRun() && reader == null)&&(__CLR4_4_15kh5khkylve00q.R.iget(7268)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7269)==0&false))) {{
                __CLR4_4_15kh5khkylve00q.R.inc(7270);try {
                    __CLR4_4_15kh5khkylve00q.R.inc(7271);reader = new RandomAccessFile(file, RAF_MODE);
                } catch (final FileNotFoundException e) {
                    __CLR4_4_15kh5khkylve00q.R.inc(7272);listener.fileNotFound();
                }
                __CLR4_4_15kh5khkylve00q.R.inc(7273);if ((((reader == null)&&(__CLR4_4_15kh5khkylve00q.R.iget(7274)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7275)==0&false))) {{
                    __CLR4_4_15kh5khkylve00q.R.inc(7276);Thread.sleep(delayMillis);
                } }else {{
                    // The current position in the file
                    __CLR4_4_15kh5khkylve00q.R.inc(7277);position = (((end )&&(__CLR4_4_15kh5khkylve00q.R.iget(7278)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7279)==0&false))? file.length() : 0;
                    __CLR4_4_15kh5khkylve00q.R.inc(7280);last = FileUtils.lastModified(file);
                    __CLR4_4_15kh5khkylve00q.R.inc(7281);reader.seek(position);
                }
            }}
            }__CLR4_4_15kh5khkylve00q.R.inc(7282);while ((((getRun())&&(__CLR4_4_15kh5khkylve00q.R.iget(7283)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7284)==0&false))) {{
                __CLR4_4_15kh5khkylve00q.R.inc(7285);final boolean newer = FileUtils.isFileNewer(file, last); // IO-279, must be done first
                // Check the file length to see if it was rotated
                __CLR4_4_15kh5khkylve00q.R.inc(7286);final long length = file.length();
                __CLR4_4_15kh5khkylve00q.R.inc(7287);if ((((length < position)&&(__CLR4_4_15kh5khkylve00q.R.iget(7288)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7289)==0&false))) {{
                    // File was rotated
                    __CLR4_4_15kh5khkylve00q.R.inc(7290);listener.fileRotated();
                    // Reopen the reader after rotation ensuring that the old file is closed iff we re-open it
                    // successfully
                    class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_15kh5khkylve00q.R.inc(7291);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_15kh5khkylve00q.R.inc(7292);}};RandomAccessFile save = reader) {
                        __CLR4_4_15kh5khkylve00q.R.inc(7293);reader = new RandomAccessFile(file, RAF_MODE);
                        // At this point, we're sure that the old file is rotated
                        // Finish scanning the old file and then we'll start with the new one
                        __CLR4_4_15kh5khkylve00q.R.inc(7294);try {
                            __CLR4_4_15kh5khkylve00q.R.inc(7295);readLines(save);
                        } catch (final IOException ioe) {
                            __CLR4_4_15kh5khkylve00q.R.inc(7296);listener.handle(ioe);
                        }
                        __CLR4_4_15kh5khkylve00q.R.inc(7297);position = 0;
                    } catch (final FileNotFoundException e) {
                        // in this case we continue to use the previous reader and position values
                        __CLR4_4_15kh5khkylve00q.R.inc(7298);listener.fileNotFound();
                        __CLR4_4_15kh5khkylve00q.R.inc(7299);Thread.sleep(delayMillis);
                    }
                    __CLR4_4_15kh5khkylve00q.R.inc(7300);continue;
                }
                // File was not rotated
                // See if the file needs to be read again
                }__CLR4_4_15kh5khkylve00q.R.inc(7301);if ((((length > position)&&(__CLR4_4_15kh5khkylve00q.R.iget(7302)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7303)==0&false))) {{
                    // The file has more content than it did last time
                    __CLR4_4_15kh5khkylve00q.R.inc(7304);position = readLines(reader);
                    __CLR4_4_15kh5khkylve00q.R.inc(7305);last = FileUtils.lastModified(file);
                } }else {__CLR4_4_15kh5khkylve00q.R.inc(7306);if ((((newer)&&(__CLR4_4_15kh5khkylve00q.R.iget(7307)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7308)==0&false))) {{
                    /*
                     * This can happen if the file is truncated or overwritten with the exact same length of
                     * information. In cases like this, the file position needs to be reset
                     */
                    __CLR4_4_15kh5khkylve00q.R.inc(7309);position = 0;
                    __CLR4_4_15kh5khkylve00q.R.inc(7310);reader.seek(position); // cannot be null here

                    // Now we can read new lines
                    __CLR4_4_15kh5khkylve00q.R.inc(7311);position = readLines(reader);
                    __CLR4_4_15kh5khkylve00q.R.inc(7312);last = FileUtils.lastModified(file);
                }
                }}__CLR4_4_15kh5khkylve00q.R.inc(7313);if ((((reOpen && reader != null)&&(__CLR4_4_15kh5khkylve00q.R.iget(7314)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7315)==0&false))) {{
                    __CLR4_4_15kh5khkylve00q.R.inc(7316);reader.close();
                }
                }__CLR4_4_15kh5khkylve00q.R.inc(7317);Thread.sleep(delayMillis);
                __CLR4_4_15kh5khkylve00q.R.inc(7318);if ((((getRun() && reOpen)&&(__CLR4_4_15kh5khkylve00q.R.iget(7319)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7320)==0&false))) {{
                    __CLR4_4_15kh5khkylve00q.R.inc(7321);reader = new RandomAccessFile(file, RAF_MODE);
                    __CLR4_4_15kh5khkylve00q.R.inc(7322);reader.seek(position);
                }
            }}
        }} catch (final InterruptedException e) {
            __CLR4_4_15kh5khkylve00q.R.inc(7323);Thread.currentThread().interrupt();
            __CLR4_4_15kh5khkylve00q.R.inc(7324);listener.handle(e);
        } catch (final Exception e) {
            __CLR4_4_15kh5khkylve00q.R.inc(7325);listener.handle(e);
        } finally {
            __CLR4_4_15kh5khkylve00q.R.inc(7326);try {
                __CLR4_4_15kh5khkylve00q.R.inc(7327);if ((((reader != null)&&(__CLR4_4_15kh5khkylve00q.R.iget(7328)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7329)==0&false))) {{
                    __CLR4_4_15kh5khkylve00q.R.inc(7330);reader.close();
                }
            }} catch (final IOException e) {
                __CLR4_4_15kh5khkylve00q.R.inc(7331);listener.handle(e);
            }
            __CLR4_4_15kh5khkylve00q.R.inc(7332);stop();
        }
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Allows the tailer to complete its current loop and return.
     */
    public void stop() {try{__CLR4_4_15kh5khkylve00q.R.inc(7333);
        __CLR4_4_15kh5khkylve00q.R.inc(7334);this.run = false;
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}

    /**
     * Read new lines.
     *
     * @param reader The file to read
     * @return The new position after the lines have been read
     * @throws java.io.IOException if an I/O error occurs.
     */
    private long readLines(final RandomAccessFile reader) throws IOException {try{__CLR4_4_15kh5khkylve00q.R.inc(7335);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_15kh5khkylve00q.R.inc(7336);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_15kh5khkylve00q.R.inc(7337);}};ByteArrayOutputStream lineBuf = new ByteArrayOutputStream(64)) {
            __CLR4_4_15kh5khkylve00q.R.inc(7338);long pos = reader.getFilePointer();
            __CLR4_4_15kh5khkylve00q.R.inc(7339);long rePos = pos; // position to re-read
            __CLR4_4_15kh5khkylve00q.R.inc(7340);int num;
            __CLR4_4_15kh5khkylve00q.R.inc(7341);boolean seenCR = false;
            __CLR4_4_15kh5khkylve00q.R.inc(7342);while (getRun() && ((num = reader.read(inbuf)) != EOF)) {{
                __CLR4_4_15kh5khkylve00q.R.inc(7345);for (int i = 0; (((i < num)&&(__CLR4_4_15kh5khkylve00q.R.iget(7346)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7347)==0&false)); i++) {{
                    __CLR4_4_15kh5khkylve00q.R.inc(7348);final byte ch = inbuf[i];
                    boolean __CLB4_4_1_bool0=false;__CLR4_4_15kh5khkylve00q.R.inc(7349);switch (ch) {
                    case LF:if (!__CLB4_4_1_bool0) {__CLR4_4_15kh5khkylve00q.R.inc(7350);__CLB4_4_1_bool0=true;}
                        __CLR4_4_15kh5khkylve00q.R.inc(7351);seenCR = false; // swallow CR before LF
                        __CLR4_4_15kh5khkylve00q.R.inc(7352);listener.handle(new String(lineBuf.toByteArray(), charset));
                        __CLR4_4_15kh5khkylve00q.R.inc(7353);lineBuf.reset();
                        __CLR4_4_15kh5khkylve00q.R.inc(7354);rePos = pos + i + 1;
                        __CLR4_4_15kh5khkylve00q.R.inc(7355);break;
                    case CR:if (!__CLB4_4_1_bool0) {__CLR4_4_15kh5khkylve00q.R.inc(7356);__CLB4_4_1_bool0=true;}
                        __CLR4_4_15kh5khkylve00q.R.inc(7357);if ((((seenCR)&&(__CLR4_4_15kh5khkylve00q.R.iget(7358)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7359)==0&false))) {{
                            __CLR4_4_15kh5khkylve00q.R.inc(7360);lineBuf.write(CR);
                        }
                        }__CLR4_4_15kh5khkylve00q.R.inc(7361);seenCR = true;
                        __CLR4_4_15kh5khkylve00q.R.inc(7362);break;
                    default:if (!__CLB4_4_1_bool0) {__CLR4_4_15kh5khkylve00q.R.inc(7363);__CLB4_4_1_bool0=true;}
                        __CLR4_4_15kh5khkylve00q.R.inc(7364);if ((((seenCR)&&(__CLR4_4_15kh5khkylve00q.R.iget(7365)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7366)==0&false))) {{
                            __CLR4_4_15kh5khkylve00q.R.inc(7367);seenCR = false; // swallow final CR
                            __CLR4_4_15kh5khkylve00q.R.inc(7368);listener.handle(new String(lineBuf.toByteArray(), charset));
                            __CLR4_4_15kh5khkylve00q.R.inc(7369);lineBuf.reset();
                            __CLR4_4_15kh5khkylve00q.R.inc(7370);rePos = pos + i + 1;
                        }
                        }__CLR4_4_15kh5khkylve00q.R.inc(7371);lineBuf.write(ch);
                    }
                }
                }__CLR4_4_15kh5khkylve00q.R.inc(7372);pos = reader.getFilePointer();
            }

            }__CLR4_4_15kh5khkylve00q.R.inc(7373);reader.seek(rePos); // Ensure we can re-read if necessary

            __CLR4_4_15kh5khkylve00q.R.inc(7374);if ((((listener instanceof TailerListenerAdapter)&&(__CLR4_4_15kh5khkylve00q.R.iget(7375)!=0|true))||(__CLR4_4_15kh5khkylve00q.R.iget(7376)==0&false))) {{
                __CLR4_4_15kh5khkylve00q.R.inc(7377);((TailerListenerAdapter) listener).endOfFileReached();
            }

            }__CLR4_4_15kh5khkylve00q.R.inc(7378);return rePos;
        }
    }finally{__CLR4_4_15kh5khkylve00q.R.flushNeeded();}}
}
