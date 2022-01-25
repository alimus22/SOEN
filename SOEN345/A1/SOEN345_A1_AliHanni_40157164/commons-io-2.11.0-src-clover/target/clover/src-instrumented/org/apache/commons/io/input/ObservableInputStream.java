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

import static org.apache.commons.io.IOUtils.EOF;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;

/**
 * The {@link ObservableInputStream} allows, that an InputStream may be consumed by other receivers, apart from the
 * thread, which is reading it. The other consumers are implemented as instances of {@link Observer}.
 * <p>
 * A typical application may be the generation of a {@link java.security.MessageDigest} on the fly.
 * </p>
 * <p>
 * <em>Note</em>: The {@link ObservableInputStream} is <em>not</em> thread safe, as instances of InputStream usually
 * aren't. If you must access the stream from multiple threads, then synchronization, locking, or a similar means must
 * be used.
 * </p>
 *
 * @see MessageDigestCalculatingInputStream
 */
public class ObservableInputStream extends ProxyInputStream {public static class __CLR4_4_14vc4vckylvdzuy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,6410,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Abstracts observer callback for {@code ObservableInputStream}s.
     */
    public static abstract class Observer {

        /**
         * Called to indicate that the {@link ObservableInputStream} has been closed.
         *
         * @throws IOException if an I/O error occurs.
         */
        @SuppressWarnings("unused") // Possibly thrown from subclasses.
        public void closed() throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6312);
            // noop
        }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

        /**
         * Called to indicate that {@link InputStream#read(byte[])}, or {@link InputStream#read(byte[], int, int)} have
         * been called, and are about to invoke data.
         *
         * @param buffer The byte array, which has been passed to the read call, and where data has been stored.
         * @param offset The offset within the byte array, where data has been stored.
         * @param length The number of bytes, which have been stored in the byte array.
         * @throws IOException if an I/O error occurs.
         */
        @SuppressWarnings("unused") // Possibly thrown from subclasses.
        public void data(final byte[] buffer, final int offset, final int length) throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6313);
            // noop
        }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

        /**
         * Called to indicate, that {@link InputStream#read()} has been invoked on the {@link ObservableInputStream},
         * and will return a value.
         *
         * @param value The value, which is being returned. This will never be -1 (EOF), because, in that case,
         *        {@link #finished()} will be invoked instead.
         * @throws IOException if an I/O error occurs.
         */
        @SuppressWarnings("unused") // Possibly thrown from subclasses.
        public void data(final int value) throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6314);
            // noop
        }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

        /**
         * Called to indicate that an error occurred on the underlying stream.
         *
         * @param exception the exception to throw
         * @throws IOException if an I/O error occurs.
         */
        public void error(final IOException exception) throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6315);
            __CLR4_4_14vc4vckylvdzuy.R.inc(6316);throw exception;
        }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

        /**
         * Called to indicate that EOF has been seen on the underlying stream. This method may be called multiple times,
         * if the reader keeps invoking either of the read methods, and they will consequently keep returning EOF.
         *
         * @throws IOException if an I/O error occurs.
         */
        @SuppressWarnings("unused") // Possibly thrown from subclasses.
        public void finished() throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6317);
            // noop
        }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}
    }

    private final List<Observer> observers;

    /**
     * Creates a new ObservableInputStream for the given InputStream.
     *
     * @param inputStream the input stream to observe.
     */
    public ObservableInputStream(final InputStream inputStream) {
        this(inputStream, new ArrayList<>());__CLR4_4_14vc4vckylvdzuy.R.inc(6319);try{__CLR4_4_14vc4vckylvdzuy.R.inc(6318);
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Creates a new ObservableInputStream for the given InputStream.
     *
     * @param inputStream the input stream to observe.
     * @param observers List of observer callbacks.
     */
    private ObservableInputStream(final InputStream inputStream, final List<Observer> observers) {
        super(inputStream);__CLR4_4_14vc4vckylvdzuy.R.inc(6321);try{__CLR4_4_14vc4vckylvdzuy.R.inc(6320);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6322);this.observers = observers;
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Creates a new ObservableInputStream for the given InputStream.
     *
     * @param inputStream the input stream to observe.
     * @param observers List of observer callbacks.
     * @since 2.9.0
     */
    public ObservableInputStream(final InputStream inputStream, final Observer... observers) {
        this(inputStream, Arrays.asList(observers));__CLR4_4_14vc4vckylvdzuy.R.inc(6324);try{__CLR4_4_14vc4vckylvdzuy.R.inc(6323);
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Adds an Observer.
     *
     * @param observer the observer to add.
     */
    public void add(final Observer observer) {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6325);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6326);observers.add(observer);
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6327);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6328);IOException ioe = null;
        __CLR4_4_14vc4vckylvdzuy.R.inc(6329);try {
            __CLR4_4_14vc4vckylvdzuy.R.inc(6330);super.close();
        } catch (final IOException e) {
            __CLR4_4_14vc4vckylvdzuy.R.inc(6331);ioe = e;
        }
        __CLR4_4_14vc4vckylvdzuy.R.inc(6332);if ((((ioe == null)&&(__CLR4_4_14vc4vckylvdzuy.R.iget(6333)!=0|true))||(__CLR4_4_14vc4vckylvdzuy.R.iget(6334)==0&false))) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6335);noteClosed();
        } }else {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6336);noteError(ioe);
        }
    }}finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Reads all data from the underlying {@link InputStream}, while notifying the observers.
     *
     * @throws IOException The underlying {@link InputStream}, or either of the observers has thrown an exception.
     */
    public void consume() throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6337);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6338);final byte[] buffer = IOUtils.byteArray();
        __CLR4_4_14vc4vckylvdzuy.R.inc(6339);while ((((read(buffer) != EOF)&&(__CLR4_4_14vc4vckylvdzuy.R.iget(6340)!=0|true))||(__CLR4_4_14vc4vckylvdzuy.R.iget(6341)==0&false))) {{
            // empty
        }
    }}finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Gets all currently registered observers.
     *
     * @return a list of the currently registered observers.
     * @since 2.9.0
     */
    public List<Observer> getObservers() {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6342);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6343);return observers;
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Notifies the observers by invoking {@link Observer#finished()}.
     *
     * @throws IOException Some observer has thrown an exception, which is being passed down.
     */
    protected void noteClosed() throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6344);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6345);for (final Observer observer : getObservers()) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6346);observer.closed();
        }
    }}finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Notifies the observers by invoking {@link Observer#data(int)} with the given arguments.
     *
     * @param value Passed to the observers.
     * @throws IOException Some observer has thrown an exception, which is being passed down.
     */
    protected void noteDataByte(final int value) throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6347);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6348);for (final Observer observer : getObservers()) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6349);observer.data(value);
        }
    }}finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Notifies the observers by invoking {@link Observer#data(byte[],int,int)} with the given arguments.
     *
     * @param buffer Passed to the observers.
     * @param offset Passed to the observers.
     * @param length Passed to the observers.
     * @throws IOException Some observer has thrown an exception, which is being passed down.
     */
    protected void noteDataBytes(final byte[] buffer, final int offset, final int length) throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6350);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6351);for (final Observer observer : getObservers()) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6352);observer.data(buffer, offset, length);
        }
    }}finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Notifies the observers by invoking {@link Observer#error(IOException)} with the given argument.
     *
     * @param exception Passed to the observers.
     * @throws IOException Some observer has thrown an exception, which is being passed down. This may be the same
     *         exception, which has been passed as an argument.
     */
    protected void noteError(final IOException exception) throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6353);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6354);for (final Observer observer : getObservers()) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6355);observer.error(exception);
        }
    }}finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Notifies the observers by invoking {@link Observer#finished()}.
     *
     * @throws IOException Some observer has thrown an exception, which is being passed down.
     */
    protected void noteFinished() throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6356);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6357);for (final Observer observer : getObservers()) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6358);observer.finished();
        }
    }}finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    private void notify(final byte[] buffer, final int offset, final int result, final IOException ioe) throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6359);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6360);if ((((ioe != null)&&(__CLR4_4_14vc4vckylvdzuy.R.iget(6361)!=0|true))||(__CLR4_4_14vc4vckylvdzuy.R.iget(6362)==0&false))) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6363);noteError(ioe);
            __CLR4_4_14vc4vckylvdzuy.R.inc(6364);throw ioe;
        }
        }__CLR4_4_14vc4vckylvdzuy.R.inc(6365);if ((((result == EOF)&&(__CLR4_4_14vc4vckylvdzuy.R.iget(6366)!=0|true))||(__CLR4_4_14vc4vckylvdzuy.R.iget(6367)==0&false))) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6368);noteFinished();
        } }else {__CLR4_4_14vc4vckylvdzuy.R.inc(6369);if ((((result > 0)&&(__CLR4_4_14vc4vckylvdzuy.R.iget(6370)!=0|true))||(__CLR4_4_14vc4vckylvdzuy.R.iget(6371)==0&false))) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6372);noteDataBytes(buffer, offset, result);
        }
    }}}finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    @Override
    public int read() throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6373);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6374);int result = 0;
        __CLR4_4_14vc4vckylvdzuy.R.inc(6375);IOException ioe = null;
        __CLR4_4_14vc4vckylvdzuy.R.inc(6376);try {
            __CLR4_4_14vc4vckylvdzuy.R.inc(6377);result = super.read();
        } catch (final IOException ex) {
            __CLR4_4_14vc4vckylvdzuy.R.inc(6378);ioe = ex;
        }
        __CLR4_4_14vc4vckylvdzuy.R.inc(6379);if ((((ioe != null)&&(__CLR4_4_14vc4vckylvdzuy.R.iget(6380)!=0|true))||(__CLR4_4_14vc4vckylvdzuy.R.iget(6381)==0&false))) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6382);noteError(ioe);
            __CLR4_4_14vc4vckylvdzuy.R.inc(6383);throw ioe;
        }
        }__CLR4_4_14vc4vckylvdzuy.R.inc(6384);if ((((result == EOF)&&(__CLR4_4_14vc4vckylvdzuy.R.iget(6385)!=0|true))||(__CLR4_4_14vc4vckylvdzuy.R.iget(6386)==0&false))) {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6387);noteFinished();
        } }else {{
            __CLR4_4_14vc4vckylvdzuy.R.inc(6388);noteDataByte(result);
        }
        }__CLR4_4_14vc4vckylvdzuy.R.inc(6389);return result;
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    @Override
    public int read(final byte[] buffer) throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6390);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6391);int result = 0;
        __CLR4_4_14vc4vckylvdzuy.R.inc(6392);IOException ioe = null;
        __CLR4_4_14vc4vckylvdzuy.R.inc(6393);try {
            __CLR4_4_14vc4vckylvdzuy.R.inc(6394);result = super.read(buffer);
        } catch (final IOException ex) {
            __CLR4_4_14vc4vckylvdzuy.R.inc(6395);ioe = ex;
        }
        __CLR4_4_14vc4vckylvdzuy.R.inc(6396);notify(buffer, 0, result, ioe);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6397);return result;
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    @Override
    public int read(final byte[] buffer, final int offset, final int length) throws IOException {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6398);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6399);int result = 0;
        __CLR4_4_14vc4vckylvdzuy.R.inc(6400);IOException ioe = null;
        __CLR4_4_14vc4vckylvdzuy.R.inc(6401);try {
            __CLR4_4_14vc4vckylvdzuy.R.inc(6402);result = super.read(buffer, offset, length);
        } catch (final IOException ex) {
            __CLR4_4_14vc4vckylvdzuy.R.inc(6403);ioe = ex;
        }
        __CLR4_4_14vc4vckylvdzuy.R.inc(6404);notify(buffer, offset, result, ioe);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6405);return result;
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Removes an Observer.
     *
     * @param observer the observer to remove
     */
    public void remove(final Observer observer) {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6406);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6407);observers.remove(observer);
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

    /**
     * Removes all Observers.
     */
    public void removeAllObservers() {try{__CLR4_4_14vc4vckylvdzuy.R.inc(6408);
        __CLR4_4_14vc4vckylvdzuy.R.inc(6409);observers.clear();
    }finally{__CLR4_4_14vc4vckylvdzuy.R.flushNeeded();}}

}
