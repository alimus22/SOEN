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
package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

import org.apache.commons.io.IOUtils;

/**
 * A Proxy stream collection which acts as expected, that is it passes the method calls on to the proxied streams and
 * doesn't change which methods are being called. It is an alternative base class to {@link FilterWriter} and
 * {@link FilterCollectionWriter} to increase reusability, because FilterWriter changes the methods being called, such
 * as {@code write(char[])} to {@code write(char[], int, int)} and {@code write(String)} to
 * {@code write(String, int, int)}. This is in contrast to {@link ProxyWriter} which is backed by a single
 * {@link Writer}.
 *
 * @since 2.7
 */
public class ProxyCollectionWriter extends FilterCollectionWriter {public static class __CLR4_4_1752752kylve0f4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9324,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Creates a new proxy collection writer.
     *
     * @param writers Writers object to provide the underlying targets.
     */
    public ProxyCollectionWriter(final Collection<Writer> writers) {
        super(writers);__CLR4_4_1752752kylve0f4.R.inc(9255);try{__CLR4_4_1752752kylve0f4.R.inc(9254);
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Creates a new proxy collection writer.
     *
     * @param writers Writers to provide the underlying targets.
     */
    public ProxyCollectionWriter(final Writer... writers) {
        super(writers);__CLR4_4_1752752kylve0f4.R.inc(9257);try{__CLR4_4_1752752kylve0f4.R.inc(9256);
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invoked by the write methods after the proxied call has returned successfully. The number of chars written (1 for
     * the {@link #write(int)} method, buffer length for {@link #write(char[])}, etc.) is given as an argument.
     * <p>
     * Subclasses can override this method to add common post-processing functionality without having to override all
     * the write methods. The default implementation does nothing.
     * </p>
     *
     * @param n number of chars written
     * @throws IOException if the post-processing fails
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void afterWrite(final int n) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9258);
        // noop
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegates' {@code append(char)} methods.
     *
     * @param c The character to write
     * @return this writer
     * @throws IOException if an I/O error occurs.
     * @since 2.0
     */
    @Override
    public Writer append(final char c) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9259);
        __CLR4_4_1752752kylve0f4.R.inc(9260);try {
            __CLR4_4_1752752kylve0f4.R.inc(9261);beforeWrite(1);
            __CLR4_4_1752752kylve0f4.R.inc(9262);super.append(c);
            __CLR4_4_1752752kylve0f4.R.inc(9263);afterWrite(1);
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9264);handleIOException(e);
        }
        __CLR4_4_1752752kylve0f4.R.inc(9265);return this;
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegates' {@code append(CharSequence)} methods.
     *
     * @param csq The character sequence to write
     * @return this writer
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public Writer append(final CharSequence csq) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9266);
        __CLR4_4_1752752kylve0f4.R.inc(9267);try {
            __CLR4_4_1752752kylve0f4.R.inc(9268);final int len = IOUtils.length(csq);
            __CLR4_4_1752752kylve0f4.R.inc(9269);beforeWrite(len);
            __CLR4_4_1752752kylve0f4.R.inc(9270);super.append(csq);
            __CLR4_4_1752752kylve0f4.R.inc(9271);afterWrite(len);
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9272);handleIOException(e);
        }
        __CLR4_4_1752752kylve0f4.R.inc(9273);return this;
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegates' {@code append(CharSequence, int, int)} methods.
     *
     * @param csq   The character sequence to write
     * @param start The index of the first character to write
     * @param end   The index of the first character to write (exclusive)
     * @return this writer
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public Writer append(final CharSequence csq, final int start, final int end) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9274);
        __CLR4_4_1752752kylve0f4.R.inc(9275);try {
            __CLR4_4_1752752kylve0f4.R.inc(9276);beforeWrite(end - start);
            __CLR4_4_1752752kylve0f4.R.inc(9277);super.append(csq, start, end);
            __CLR4_4_1752752kylve0f4.R.inc(9278);afterWrite(end - start);
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9279);handleIOException(e);
        }
        __CLR4_4_1752752kylve0f4.R.inc(9280);return this;
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invoked by the write methods before the call is proxied. The number of chars to be written (1 for the
     * {@link #write(int)} method, buffer length for {@link #write(char[])}, etc.) is given as an argument.
     * <p>
     * Subclasses can override this method to add common pre-processing functionality without having to override all the
     * write methods. The default implementation does nothing.
     * </p>
     *
     * @param n number of chars to be written
     * @throws IOException if the pre-processing fails
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void beforeWrite(final int n) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9281);
        // noop
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code close()} method.
     *
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9282);
        __CLR4_4_1752752kylve0f4.R.inc(9283);try {
            __CLR4_4_1752752kylve0f4.R.inc(9284);super.close();
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9285);handleIOException(e);
        }
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code flush()} method.
     *
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void flush() throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9286);
        __CLR4_4_1752752kylve0f4.R.inc(9287);try {
            __CLR4_4_1752752kylve0f4.R.inc(9288);super.flush();
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9289);handleIOException(e);
        }
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Handle any IOExceptions thrown.
     * <p>
     * This method provides a point to implement custom exception handling. The default behavior is to re-throw the
     * exception.
     * </p>
     *
     * @param e The IOException thrown
     * @throws IOException if an I/O error occurs.
     */
    protected void handleIOException(final IOException e) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9290);
        __CLR4_4_1752752kylve0f4.R.inc(9291);throw e;
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code write(char[])} method.
     *
     * @param cbuf the characters to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final char[] cbuf) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9292);
        __CLR4_4_1752752kylve0f4.R.inc(9293);try {
            __CLR4_4_1752752kylve0f4.R.inc(9294);final int len = IOUtils.length(cbuf);
            __CLR4_4_1752752kylve0f4.R.inc(9295);beforeWrite(len);
            __CLR4_4_1752752kylve0f4.R.inc(9296);super.write(cbuf);
            __CLR4_4_1752752kylve0f4.R.inc(9297);afterWrite(len);
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9298);handleIOException(e);
        }
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code write(char[], int, int)} method.
     *
     * @param cbuf the characters to write
     * @param off  The start offset
     * @param len  The number of characters to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9299);
        __CLR4_4_1752752kylve0f4.R.inc(9300);try {
            __CLR4_4_1752752kylve0f4.R.inc(9301);beforeWrite(len);
            __CLR4_4_1752752kylve0f4.R.inc(9302);super.write(cbuf, off, len);
            __CLR4_4_1752752kylve0f4.R.inc(9303);afterWrite(len);
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9304);handleIOException(e);
        }
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code write(int)} method.
     *
     * @param c the character to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final int c) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9305);
        __CLR4_4_1752752kylve0f4.R.inc(9306);try {
            __CLR4_4_1752752kylve0f4.R.inc(9307);beforeWrite(1);
            __CLR4_4_1752752kylve0f4.R.inc(9308);super.write(c);
            __CLR4_4_1752752kylve0f4.R.inc(9309);afterWrite(1);
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9310);handleIOException(e);
        }
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code write(String)} method.
     *
     * @param str the string to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final String str) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9311);
        __CLR4_4_1752752kylve0f4.R.inc(9312);try {
            __CLR4_4_1752752kylve0f4.R.inc(9313);final int len = IOUtils.length(str);
            __CLR4_4_1752752kylve0f4.R.inc(9314);beforeWrite(len);
            __CLR4_4_1752752kylve0f4.R.inc(9315);super.write(str);
            __CLR4_4_1752752kylve0f4.R.inc(9316);afterWrite(len);
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9317);handleIOException(e);
        }
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code write(String)} method.
     *
     * @param str the string to write
     * @param off The start offset
     * @param len The number of characters to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final String str, final int off, final int len) throws IOException {try{__CLR4_4_1752752kylve0f4.R.inc(9318);
        __CLR4_4_1752752kylve0f4.R.inc(9319);try {
            __CLR4_4_1752752kylve0f4.R.inc(9320);beforeWrite(len);
            __CLR4_4_1752752kylve0f4.R.inc(9321);super.write(str, off, len);
            __CLR4_4_1752752kylve0f4.R.inc(9322);afterWrite(len);
        } catch (final IOException e) {
            __CLR4_4_1752752kylve0f4.R.inc(9323);handleIOException(e);
        }
    }finally{__CLR4_4_1752752kylve0f4.R.flushNeeded();}}

}
