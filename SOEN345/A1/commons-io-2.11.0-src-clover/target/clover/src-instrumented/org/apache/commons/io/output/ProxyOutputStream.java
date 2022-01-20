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

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

/**
 * A Proxy stream which acts as expected, that is it passes the method
 * calls on to the proxied stream and doesn't change which methods are
 * being called. It is an alternative base class to FilterOutputStream
 * to increase reusability.
 * <p>
 * See the protected methods for ways in which a subclass can easily decorate
 * a stream with custom pre-, post- or error processing functionality.
 * </p>
 *
 */
public class ProxyOutputStream extends FilterOutputStream {public static class __CLR4_4_1770770kylve0fn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9355,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructs a new ProxyOutputStream.
     *
     * @param proxy  the OutputStream to delegate to
     */
    public ProxyOutputStream(final OutputStream proxy) {
        super(proxy);__CLR4_4_1770770kylve0fn.R.inc(9325);try{__CLR4_4_1770770kylve0fn.R.inc(9324);
        // the proxy is stored in a protected superclass variable named 'out'
    }finally{__CLR4_4_1770770kylve0fn.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code write(int)} method.
     * @param idx the byte to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final int idx) throws IOException {try{__CLR4_4_1770770kylve0fn.R.inc(9326);
        __CLR4_4_1770770kylve0fn.R.inc(9327);try {
            __CLR4_4_1770770kylve0fn.R.inc(9328);beforeWrite(1);
            __CLR4_4_1770770kylve0fn.R.inc(9329);out.write(idx);
            __CLR4_4_1770770kylve0fn.R.inc(9330);afterWrite(1);
        } catch (final IOException e) {
            __CLR4_4_1770770kylve0fn.R.inc(9331);handleIOException(e);
        }
    }finally{__CLR4_4_1770770kylve0fn.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code write(byte[])} method.
     * @param bts the bytes to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final byte[] bts) throws IOException {try{__CLR4_4_1770770kylve0fn.R.inc(9332);
        __CLR4_4_1770770kylve0fn.R.inc(9333);try {
            __CLR4_4_1770770kylve0fn.R.inc(9334);final int len = IOUtils.length(bts);
            __CLR4_4_1770770kylve0fn.R.inc(9335);beforeWrite(len);
            __CLR4_4_1770770kylve0fn.R.inc(9336);out.write(bts);
            __CLR4_4_1770770kylve0fn.R.inc(9337);afterWrite(len);
        } catch (final IOException e) {
            __CLR4_4_1770770kylve0fn.R.inc(9338);handleIOException(e);
        }
    }finally{__CLR4_4_1770770kylve0fn.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code write(byte[])} method.
     * @param bts the bytes to write
     * @param st The start offset
     * @param end The number of bytes to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final byte[] bts, final int st, final int end) throws IOException {try{__CLR4_4_1770770kylve0fn.R.inc(9339);
        __CLR4_4_1770770kylve0fn.R.inc(9340);try {
            __CLR4_4_1770770kylve0fn.R.inc(9341);beforeWrite(end);
            __CLR4_4_1770770kylve0fn.R.inc(9342);out.write(bts, st, end);
            __CLR4_4_1770770kylve0fn.R.inc(9343);afterWrite(end);
        } catch (final IOException e) {
            __CLR4_4_1770770kylve0fn.R.inc(9344);handleIOException(e);
        }
    }finally{__CLR4_4_1770770kylve0fn.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code flush()} method.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void flush() throws IOException {try{__CLR4_4_1770770kylve0fn.R.inc(9345);
        __CLR4_4_1770770kylve0fn.R.inc(9346);try {
            __CLR4_4_1770770kylve0fn.R.inc(9347);out.flush();
        } catch (final IOException e) {
            __CLR4_4_1770770kylve0fn.R.inc(9348);handleIOException(e);
        }
    }finally{__CLR4_4_1770770kylve0fn.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code close()} method.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_1770770kylve0fn.R.inc(9349);
        __CLR4_4_1770770kylve0fn.R.inc(9350);IOUtils.close(out, this::handleIOException);
    }finally{__CLR4_4_1770770kylve0fn.R.flushNeeded();}}

    /**
     * Invoked by the write methods before the call is proxied. The number
     * of bytes to be written (1 for the {@link #write(int)} method, buffer
     * length for {@link #write(byte[])}, etc.) is given as an argument.
     * <p>
     * Subclasses can override this method to add common pre-processing
     * functionality without having to override all the write methods.
     * The default implementation does nothing.
     *
     * @since 2.0
     * @param n number of bytes to be written
     * @throws IOException if the pre-processing fails
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void beforeWrite(final int n) throws IOException {try{__CLR4_4_1770770kylve0fn.R.inc(9351);
        // noop
    }finally{__CLR4_4_1770770kylve0fn.R.flushNeeded();}}

    /**
     * Invoked by the write methods after the proxied call has returned
     * successfully. The number of bytes written (1 for the
     * {@link #write(int)} method, buffer length for {@link #write(byte[])},
     * etc.) is given as an argument.
     * <p>
     * Subclasses can override this method to add common post-processing
     * functionality without having to override all the write methods.
     * The default implementation does nothing.
     *
     * @since 2.0
     * @param n number of bytes written
     * @throws IOException if the post-processing fails
     */
    @SuppressWarnings("unused") // Possibly thrown from subclasses.
    protected void afterWrite(final int n) throws IOException {try{__CLR4_4_1770770kylve0fn.R.inc(9352);
        // noop
    }finally{__CLR4_4_1770770kylve0fn.R.flushNeeded();}}

    /**
     * Handle any IOExceptions thrown.
     * <p>
     * This method provides a point to implement custom exception
     * handling. The default behavior is to re-throw the exception.
     * @param e The IOException thrown
     * @throws IOException if an I/O error occurs.
     * @since 2.0
     */
    protected void handleIOException(final IOException e) throws IOException {try{__CLR4_4_1770770kylve0fn.R.inc(9353);
        __CLR4_4_1770770kylve0fn.R.inc(9354);throw e;
    }finally{__CLR4_4_1770770kylve0fn.R.flushNeeded();}}

}
