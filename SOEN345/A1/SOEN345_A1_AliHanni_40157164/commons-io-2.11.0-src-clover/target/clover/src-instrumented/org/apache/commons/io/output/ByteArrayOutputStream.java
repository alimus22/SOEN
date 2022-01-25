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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Implements a ThreadSafe version of {@link AbstractByteArrayOutputStream} using instance synchronization.
 */
//@ThreadSafe
public class ByteArrayOutputStream extends AbstractByteArrayOutputStream {public static class __CLR4_4_16pf6pfkylve0b2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Creates a new byte array output stream. The buffer capacity is
     * initially {@value AbstractByteArrayOutputStream#DEFAULT_SIZE} bytes, though its size increases if necessary.
     */
    public ByteArrayOutputStream() {
        this(DEFAULT_SIZE);__CLR4_4_16pf6pfkylve0b2.R.inc(8692);try{__CLR4_4_16pf6pfkylve0b2.R.inc(8691);
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    /**
     * Creates a new byte array output stream, with a buffer capacity of
     * the specified size, in bytes.
     *
     * @param size  the initial size
     * @throws IllegalArgumentException if size is negative
     */
    public ByteArrayOutputStream(final int size) {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8693);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8694);if ((((size < 0)&&(__CLR4_4_16pf6pfkylve0b2.R.iget(8695)!=0|true))||(__CLR4_4_16pf6pfkylve0b2.R.iget(8696)==0&false))) {{
            __CLR4_4_16pf6pfkylve0b2.R.inc(8697);throw new IllegalArgumentException(
                "Negative initial size: " + size);
        }
        }__CLR4_4_16pf6pfkylve0b2.R.inc(8698);synchronized (this) {
            __CLR4_4_16pf6pfkylve0b2.R.inc(8699);needNewBuffer(size);
        }
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    @Override
    public void write(final byte[] b, final int off, final int len) {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8700);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8701);if (((((off < 0)
                || (off > b.length)
                || (len < 0)
                || ((off + len) > b.length)
                || ((off + len) < 0))&&(__CLR4_4_16pf6pfkylve0b2.R.iget(8702)!=0|true))||(__CLR4_4_16pf6pfkylve0b2.R.iget(8703)==0&false))) {{
            __CLR4_4_16pf6pfkylve0b2.R.inc(8704);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_16pf6pfkylve0b2.R.inc(8705);if ((((len == 0)&&(__CLR4_4_16pf6pfkylve0b2.R.iget(8706)!=0|true))||(__CLR4_4_16pf6pfkylve0b2.R.iget(8707)==0&false))) {{
            __CLR4_4_16pf6pfkylve0b2.R.inc(8708);return;
        }
        }__CLR4_4_16pf6pfkylve0b2.R.inc(8709);synchronized (this) {
            __CLR4_4_16pf6pfkylve0b2.R.inc(8710);writeImpl(b, off, len);
        }
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    @Override
    public synchronized void write(final int b) {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8711);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8712);writeImpl(b);
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    @Override
    public synchronized int write(final InputStream in) throws IOException {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8713);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8714);return writeImpl(in);
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    @Override
    public synchronized int size() {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8715);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8716);return count;
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    /**
     * @see java.io.ByteArrayOutputStream#reset()
     */
    @Override
    public synchronized void reset() {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8717);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8718);resetImpl();
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    @Override
    public synchronized void writeTo(final OutputStream out) throws IOException {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8719);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8720);writeToImpl(out);
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    /**
     * Fetches entire contents of an {@code InputStream} and represent
     * same data as result InputStream.
     * <p>
     * This method is useful where,
     * </p>
     * <ul>
     * <li>Source InputStream is slow.</li>
     * <li>It has network resources associated, so we cannot keep it open for
     * long time.</li>
     * <li>It has network timeout associated.</li>
     * </ul>
     * It can be used in favor of {@link #toByteArray()}, since it
     * avoids unnecessary allocation and copy of byte[].<br>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param input Stream to be fully buffered.
     * @return A fully buffered stream.
     * @throws IOException if an I/O error occurs.
     * @since 2.0
     */
    public static InputStream toBufferedInputStream(final InputStream input)
            throws IOException {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8721);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8722);return toBufferedInputStream(input, DEFAULT_SIZE);
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    /**
     * Fetches entire contents of an {@code InputStream} and represent
     * same data as result InputStream.
     * <p>
     * This method is useful where,
     * </p>
     * <ul>
     * <li>Source InputStream is slow.</li>
     * <li>It has network resources associated, so we cannot keep it open for
     * long time.</li>
     * <li>It has network timeout associated.</li>
     * </ul>
     * It can be used in favor of {@link #toByteArray()}, since it
     * avoids unnecessary allocation and copy of byte[].<br>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param input Stream to be fully buffered.
     * @param size the initial buffer size
     * @return A fully buffered stream.
     * @throws IOException if an I/O error occurs.
     * @since 2.5
     */
    public static InputStream toBufferedInputStream(final InputStream input, final int size)
        throws IOException {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8723);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_16pf6pfkylve0b2.R.inc(8724);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_16pf6pfkylve0b2.R.inc(8725);}};final ByteArrayOutputStream output = new ByteArrayOutputStream(size)) {
            __CLR4_4_16pf6pfkylve0b2.R.inc(8726);output.write(input);
            __CLR4_4_16pf6pfkylve0b2.R.inc(8727);return output.toInputStream();
        }
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    @Override
    public synchronized InputStream toInputStream() {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8728);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8729);return toInputStream(java.io.ByteArrayInputStream::new);
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}

    @Override
    public synchronized byte[] toByteArray() {try{__CLR4_4_16pf6pfkylve0b2.R.inc(8730);
        __CLR4_4_16pf6pfkylve0b2.R.inc(8731);return toByteArrayImpl();
    }finally{__CLR4_4_16pf6pfkylve0b2.R.flushNeeded();}}
}
