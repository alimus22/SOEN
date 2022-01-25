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

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

import org.apache.commons.io.IOUtils;

/**
 * A Proxy stream which acts as expected, that is it passes the method
 * calls on to the proxied stream and doesn't change which methods are
 * being called.
 * <p>
 * It is an alternative base class to FilterReader
 * to increase reusability, because FilterReader changes the
 * methods being called, such as read(char[]) to read(char[], int, int).
 * </p>
 */
public abstract class ProxyReader extends FilterReader {public static class __CLR4_4_14zi4zikylvdzvt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,6526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructs a new ProxyReader.
     *
     * @param proxy  the Reader to delegate to
     */
    public ProxyReader(final Reader proxy) {
        super(proxy);__CLR4_4_14zi4zikylvdzvt.R.inc(6463);try{__CLR4_4_14zi4zikylvdzvt.R.inc(6462);
        // the proxy is stored in a protected superclass variable named 'in'
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read()} method.
     * @return the character read or -1 if the end of stream
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6464);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6465);try {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6466);beforeRead(1);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6467);final int c = in.read();
            __CLR4_4_14zi4zikylvdzvt.R.inc(6468);afterRead((((c != EOF )&&(__CLR4_4_14zi4zikylvdzvt.R.iget(6469)!=0|true))||(__CLR4_4_14zi4zikylvdzvt.R.iget(6470)==0&false))? 1 : EOF);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6471);return c;
        } catch (final IOException e) {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6472);handleIOException(e);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6473);return EOF;
        }
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read(char[])} method.
     * @param chr the buffer to read the characters into
     * @return the number of characters read or -1 if the end of stream
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read(final char[] chr) throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6474);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6475);try {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6476);beforeRead(IOUtils.length(chr));
            __CLR4_4_14zi4zikylvdzvt.R.inc(6477);final int n = in.read(chr);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6478);afterRead(n);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6479);return n;
        } catch (final IOException e) {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6480);handleIOException(e);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6481);return EOF;
        }
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read(char[], int, int)} method.
     * @param chr the buffer to read the characters into
     * @param st The start offset
     * @param len The number of bytes to read
     * @return the number of characters read or -1 if the end of stream
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read(final char[] chr, final int st, final int len) throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6482);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6483);try {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6484);beforeRead(len);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6485);final int n = in.read(chr, st, len);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6486);afterRead(n);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6487);return n;
        } catch (final IOException e) {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6488);handleIOException(e);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6489);return EOF;
        }
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read(CharBuffer)} method.
     * @param target the char buffer to read the characters into
     * @return the number of characters read or -1 if the end of stream
     * @throws IOException if an I/O error occurs.
     * @since 2.0
     */
    @Override
    public int read(final CharBuffer target) throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6490);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6491);try {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6492);beforeRead(IOUtils.length(target));
            __CLR4_4_14zi4zikylvdzvt.R.inc(6493);final int n = in.read(target);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6494);afterRead(n);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6495);return n;
        } catch (final IOException e) {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6496);handleIOException(e);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6497);return EOF;
        }
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code skip(long)} method.
     * @param ln the number of bytes to skip
     * @return the number of bytes to skipped or EOF if the end of stream
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public long skip(final long ln) throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6498);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6499);try {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6500);return in.skip(ln);
        } catch (final IOException e) {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6501);handleIOException(e);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6502);return 0;
        }
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code ready()} method.
     * @return true if the stream is ready to be read
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public boolean ready() throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6503);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6504);try {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6505);return in.ready();
        } catch (final IOException e) {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6506);handleIOException(e);
            __CLR4_4_14zi4zikylvdzvt.R.inc(6507);return false;
        }
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code close()} method.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6508);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6509);try {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6510);in.close();
        } catch (final IOException e) {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6511);handleIOException(e);
        }
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code mark(int)} method.
     * @param idx read ahead limit
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public synchronized void mark(final int idx) throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6512);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6513);try {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6514);in.mark(idx);
        } catch (final IOException e) {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6515);handleIOException(e);
        }
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code reset()} method.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public synchronized void reset() throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6516);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6517);try {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6518);in.reset();
        } catch (final IOException e) {
            __CLR4_4_14zi4zikylvdzvt.R.inc(6519);handleIOException(e);
        }
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code markSupported()} method.
     * @return true if mark is supported, otherwise false
     */
    @Override
    public boolean markSupported() {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6520);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6521);return in.markSupported();
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invoked by the read methods before the call is proxied. The number
     * of chars that the caller wanted to read (1 for the {@link #read()}
     * method, buffer length for {@link #read(char[])}, etc.) is given as
     * an argument.
     * <p>
     * Subclasses can override this method to add common pre-processing
     * functionality without having to override all the read methods.
     * The default implementation does nothing.
     * <p>
     * Note this method is <em>not</em> called from {@link #skip(long)} or
     * {@link #reset()}. You need to explicitly override those methods if
     * you want to add pre-processing steps also to them.
     *
     * @since 2.0
     * @param n number of chars that the caller asked to be read
     * @throws IOException if the pre-processing fails
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void beforeRead(final int n) throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6522);
        // noop
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Invoked by the read methods after the proxied call has returned
     * successfully. The number of chars returned to the caller (or -1 if
     * the end of stream was reached) is given as an argument.
     * <p>
     * Subclasses can override this method to add common post-processing
     * functionality without having to override all the read methods.
     * The default implementation does nothing.
     * <p>
     * Note this method is <em>not</em> called from {@link #skip(long)} or
     * {@link #reset()}. You need to explicitly override those methods if
     * you want to add post-processing steps also to them.
     *
     * @since 2.0
     * @param n number of chars read, or -1 if the end of stream was reached
     * @throws IOException if the post-processing fails
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void afterRead(final int n) throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6523);
        // noop
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

    /**
     * Handle any IOExceptions thrown.
     * <p>
     * This method provides a point to implement custom exception
     * handling. The default behavior is to re-throw the exception.
     * @param e The IOException thrown
     * @throws IOException if an I/O error occurs.
     * @since 2.0
     */
    protected void handleIOException(final IOException e) throws IOException {try{__CLR4_4_14zi4zikylvdzvt.R.inc(6524);
        __CLR4_4_14zi4zikylvdzvt.R.inc(6525);throw e;
    }finally{__CLR4_4_14zi4zikylvdzvt.R.flushNeeded();}}

}
