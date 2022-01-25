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

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.ClosedInputStream;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.apache.commons.io.IOUtils.EOF;

/**
 * This is the base class for implementing an output stream in which the data
 * is written into a byte array. The buffer automatically grows as data
 * is written to it.
 * <p>
 * The data can be retrieved using {@code toByteArray()} and
 * {@code toString()}.
 * Closing an {@code AbstractByteArrayOutputStream} has no effect. The methods in
 * this class can be called after the stream has been closed without
 * generating an {@code IOException}.
 * </p>
 * <p>
 * This is the base for an alternative implementation of the
 * {@link java.io.ByteArrayOutputStream} class. The original implementation
 * only allocates 32 bytes at the beginning. As this class is designed for
 * heavy duty it starts at {@value #DEFAULT_SIZE} bytes. In contrast to the original it doesn't
 * reallocate the whole memory block but allocates additional buffers. This
 * way no buffers need to be garbage collected and the contents don't have
 * to be copied to the new buffer. This class is designed to behave exactly
 * like the original. The only exception is the deprecated
 * {@link java.io.ByteArrayOutputStream#toString(int)} method that has been
 * ignored.
 * </p>
 *
 * @since 2.7
 */
public abstract class AbstractByteArrayOutputStream extends OutputStream {public static class __CLR4_4_16ke6kekylve09o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final int DEFAULT_SIZE = 1024;

    /** The list of buffers, which grows and never reduces. */
    private final List<byte[]> buffers = new ArrayList<>();
    /** The index of the current buffer. */
    private int currentBufferIndex;
    /** The total count of bytes in all the filled buffers. */
    private int filledBufferSum;
    /** The current buffer. */
    private byte[] currentBuffer;
    /** The total count of bytes written. */
    protected int count;
    /** Flag to indicate if the buffers can be reused after reset */
    private boolean reuseBuffers = true;

    /**
     * Makes a new buffer available either by allocating
     * a new one or re-cycling an existing one.
     *
     * @param newcount  the size of the buffer if one is created
     */
    protected void needNewBuffer(final int newcount) {try{__CLR4_4_16ke6kekylve09o.R.inc(8510);
        __CLR4_4_16ke6kekylve09o.R.inc(8511);if ((((currentBufferIndex < buffers.size() - 1)&&(__CLR4_4_16ke6kekylve09o.R.iget(8512)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8513)==0&false))) {{
            //Recycling old buffer
            __CLR4_4_16ke6kekylve09o.R.inc(8514);filledBufferSum += currentBuffer.length;

            __CLR4_4_16ke6kekylve09o.R.inc(8515);currentBufferIndex++;
            __CLR4_4_16ke6kekylve09o.R.inc(8516);currentBuffer = buffers.get(currentBufferIndex);
        } }else {{
            //Creating new buffer
            __CLR4_4_16ke6kekylve09o.R.inc(8517);final int newBufferSize;
            __CLR4_4_16ke6kekylve09o.R.inc(8518);if ((((currentBuffer == null)&&(__CLR4_4_16ke6kekylve09o.R.iget(8519)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8520)==0&false))) {{
                __CLR4_4_16ke6kekylve09o.R.inc(8521);newBufferSize = newcount;
                __CLR4_4_16ke6kekylve09o.R.inc(8522);filledBufferSum = 0;
            } }else {{
                __CLR4_4_16ke6kekylve09o.R.inc(8523);newBufferSize = Math.max(
                    currentBuffer.length << 1,
                    newcount - filledBufferSum);
                __CLR4_4_16ke6kekylve09o.R.inc(8524);filledBufferSum += currentBuffer.length;
            }

            }__CLR4_4_16ke6kekylve09o.R.inc(8525);currentBufferIndex++;
            __CLR4_4_16ke6kekylve09o.R.inc(8526);currentBuffer = IOUtils.byteArray(newBufferSize);
            __CLR4_4_16ke6kekylve09o.R.inc(8527);buffers.add(currentBuffer);
        }
    }}finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * Writes the bytes to the byte array.
     * @param b the bytes to write
     * @param off The start offset
     * @param len The number of bytes to write
     */
    @Override
    public abstract void write(final byte[] b, final int off, final int len);

    /**
     * Writes the bytes to the byte array.
     * @param b the bytes to write
     * @param off The start offset
     * @param len The number of bytes to write
     */
    protected void writeImpl(final byte[] b, final int off, final int len) {try{__CLR4_4_16ke6kekylve09o.R.inc(8528);
        __CLR4_4_16ke6kekylve09o.R.inc(8529);final int newcount = count + len;
        __CLR4_4_16ke6kekylve09o.R.inc(8530);int remaining = len;
        __CLR4_4_16ke6kekylve09o.R.inc(8531);int inBufferPos = count - filledBufferSum;
        __CLR4_4_16ke6kekylve09o.R.inc(8532);while ((((remaining > 0)&&(__CLR4_4_16ke6kekylve09o.R.iget(8533)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8534)==0&false))) {{
            __CLR4_4_16ke6kekylve09o.R.inc(8535);final int part = Math.min(remaining, currentBuffer.length - inBufferPos);
            __CLR4_4_16ke6kekylve09o.R.inc(8536);System.arraycopy(b, off + len - remaining, currentBuffer, inBufferPos, part);
            __CLR4_4_16ke6kekylve09o.R.inc(8537);remaining -= part;
            __CLR4_4_16ke6kekylve09o.R.inc(8538);if ((((remaining > 0)&&(__CLR4_4_16ke6kekylve09o.R.iget(8539)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8540)==0&false))) {{
                __CLR4_4_16ke6kekylve09o.R.inc(8541);needNewBuffer(newcount);
                __CLR4_4_16ke6kekylve09o.R.inc(8542);inBufferPos = 0;
            }
        }}
        }__CLR4_4_16ke6kekylve09o.R.inc(8543);count = newcount;
    }finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * Write a byte to byte array.
     * @param b the byte to write
     */
    @Override
    public abstract void write(final int b);

    /**
     * Write a byte to byte array.
     * @param b the byte to write
     */
    protected void writeImpl(final int b) {try{__CLR4_4_16ke6kekylve09o.R.inc(8544);
        __CLR4_4_16ke6kekylve09o.R.inc(8545);int inBufferPos = count - filledBufferSum;
        __CLR4_4_16ke6kekylve09o.R.inc(8546);if ((((inBufferPos == currentBuffer.length)&&(__CLR4_4_16ke6kekylve09o.R.iget(8547)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8548)==0&false))) {{
            __CLR4_4_16ke6kekylve09o.R.inc(8549);needNewBuffer(count + 1);
            __CLR4_4_16ke6kekylve09o.R.inc(8550);inBufferPos = 0;
        }
        }__CLR4_4_16ke6kekylve09o.R.inc(8551);currentBuffer[inBufferPos] = (byte) b;
        __CLR4_4_16ke6kekylve09o.R.inc(8552);count++;
    }finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}


    /**
     * Writes the entire contents of the specified input stream to this
     * byte stream. Bytes from the input stream are read directly into the
     * internal buffers of this streams.
     *
     * @param in the input stream to read from
     * @return total number of bytes read from the input stream
     *         (and written to this stream)
     * @throws IOException if an I/O error occurs while reading the input stream
     * @since 1.4
     */
    public abstract int write(final InputStream in) throws IOException;

    /**
     * Writes the entire contents of the specified input stream to this
     * byte stream. Bytes from the input stream are read directly into the
     * internal buffers of this streams.
     *
     * @param in the input stream to read from
     * @return total number of bytes read from the input stream
     *         (and written to this stream)
     * @throws IOException if an I/O error occurs while reading the input stream
     * @since 2.7
     */
    protected int writeImpl(final InputStream in) throws IOException {try{__CLR4_4_16ke6kekylve09o.R.inc(8553);
        __CLR4_4_16ke6kekylve09o.R.inc(8554);int readCount = 0;
        __CLR4_4_16ke6kekylve09o.R.inc(8555);int inBufferPos = count - filledBufferSum;
        __CLR4_4_16ke6kekylve09o.R.inc(8556);int n = in.read(currentBuffer, inBufferPos, currentBuffer.length - inBufferPos);
        __CLR4_4_16ke6kekylve09o.R.inc(8557);while ((((n != EOF)&&(__CLR4_4_16ke6kekylve09o.R.iget(8558)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8559)==0&false))) {{
            __CLR4_4_16ke6kekylve09o.R.inc(8560);readCount += n;
            __CLR4_4_16ke6kekylve09o.R.inc(8561);inBufferPos += n;
            __CLR4_4_16ke6kekylve09o.R.inc(8562);count += n;
            __CLR4_4_16ke6kekylve09o.R.inc(8563);if ((((inBufferPos == currentBuffer.length)&&(__CLR4_4_16ke6kekylve09o.R.iget(8564)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8565)==0&false))) {{
                __CLR4_4_16ke6kekylve09o.R.inc(8566);needNewBuffer(currentBuffer.length);
                __CLR4_4_16ke6kekylve09o.R.inc(8567);inBufferPos = 0;
            }
            }__CLR4_4_16ke6kekylve09o.R.inc(8568);n = in.read(currentBuffer, inBufferPos, currentBuffer.length - inBufferPos);
        }
        }__CLR4_4_16ke6kekylve09o.R.inc(8569);return readCount;
    }finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * Returns the current size of the byte array.
     *
     * @return the current size of the byte array
     */
    public abstract int size();

    /**
     * Closing a {@code ByteArrayOutputStream} has no effect. The methods in
     * this class can be called after the stream has been closed without
     * generating an {@code IOException}.
     *
     * @throws IOException never (this method should not declare this exception
     * but it has to now due to backwards compatibility)
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_16ke6kekylve09o.R.inc(8570);
        //nop
    }finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * @see java.io.ByteArrayOutputStream#reset()
     */
    public abstract void reset();

    /**
     * @see java.io.ByteArrayOutputStream#reset()
     */
    protected void resetImpl() {try{__CLR4_4_16ke6kekylve09o.R.inc(8571);
        __CLR4_4_16ke6kekylve09o.R.inc(8572);count = 0;
        __CLR4_4_16ke6kekylve09o.R.inc(8573);filledBufferSum = 0;
        __CLR4_4_16ke6kekylve09o.R.inc(8574);currentBufferIndex = 0;
        __CLR4_4_16ke6kekylve09o.R.inc(8575);if ((((reuseBuffers)&&(__CLR4_4_16ke6kekylve09o.R.iget(8576)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8577)==0&false))) {{
            __CLR4_4_16ke6kekylve09o.R.inc(8578);currentBuffer = buffers.get(currentBufferIndex);
        } }else {{
            //Throw away old buffers
            __CLR4_4_16ke6kekylve09o.R.inc(8579);currentBuffer = null;
            __CLR4_4_16ke6kekylve09o.R.inc(8580);final int size = buffers.get(0).length;
            __CLR4_4_16ke6kekylve09o.R.inc(8581);buffers.clear();
            __CLR4_4_16ke6kekylve09o.R.inc(8582);needNewBuffer(size);
            __CLR4_4_16ke6kekylve09o.R.inc(8583);reuseBuffers = true;
        }
    }}finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * Writes the entire contents of this byte stream to the
     * specified output stream.
     *
     * @param out  the output stream to write to
     * @throws IOException if an I/O error occurs, such as if the stream is closed
     * @see java.io.ByteArrayOutputStream#writeTo(OutputStream)
     */
    public abstract void writeTo(final OutputStream out) throws IOException;

    /**
     * Writes the entire contents of this byte stream to the
     * specified output stream.
     *
     * @param out  the output stream to write to
     * @throws IOException if an I/O error occurs, such as if the stream is closed
     * @see java.io.ByteArrayOutputStream#writeTo(OutputStream)
     */
    protected void writeToImpl(final OutputStream out) throws IOException {try{__CLR4_4_16ke6kekylve09o.R.inc(8584);
        __CLR4_4_16ke6kekylve09o.R.inc(8585);int remaining = count;
        __CLR4_4_16ke6kekylve09o.R.inc(8586);for (final byte[] buf : buffers) {{
            __CLR4_4_16ke6kekylve09o.R.inc(8587);final int c = Math.min(buf.length, remaining);
            __CLR4_4_16ke6kekylve09o.R.inc(8588);out.write(buf, 0, c);
            __CLR4_4_16ke6kekylve09o.R.inc(8589);remaining -= c;
            __CLR4_4_16ke6kekylve09o.R.inc(8590);if ((((remaining == 0)&&(__CLR4_4_16ke6kekylve09o.R.iget(8591)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8592)==0&false))) {{
                __CLR4_4_16ke6kekylve09o.R.inc(8593);break;
            }
        }}
    }}finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * Gets the current contents of this byte stream as a Input Stream. The
     * returned stream is backed by buffers of {@code this} stream,
     * avoiding memory allocation and copy, thus saving space and time.<br>
     *
     * @return the current contents of this output stream.
     * @see java.io.ByteArrayOutputStream#toByteArray()
     * @see #reset()
     * @since 2.5
     */
    public abstract InputStream toInputStream();

    /**
     * Gets the current contents of this byte stream as a Input Stream. The
     * returned stream is backed by buffers of {@code this} stream,
     * avoiding memory allocation and copy, thus saving space and time.<br>
     *
     * @param <T> the type of the InputStream which makes up
     *            the {@link SequenceInputStream}.
     * @param isConstructor A constructor for an InputStream which makes
     *                     up the {@link SequenceInputStream}.
     *
     * @return the current contents of this output stream.
     * @see java.io.ByteArrayOutputStream#toByteArray()
     * @see #reset()
     * @since 2.7
     */
    @SuppressWarnings("resource") // The result InputStream MUST be managed by the call site.
    protected <T extends InputStream> InputStream toInputStream(
            final InputStreamConstructor<T> isConstructor) {try{__CLR4_4_16ke6kekylve09o.R.inc(8594);
        __CLR4_4_16ke6kekylve09o.R.inc(8595);int remaining = count;
        __CLR4_4_16ke6kekylve09o.R.inc(8596);if ((((remaining == 0)&&(__CLR4_4_16ke6kekylve09o.R.iget(8597)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8598)==0&false))) {{
            __CLR4_4_16ke6kekylve09o.R.inc(8599);return ClosedInputStream.CLOSED_INPUT_STREAM;
        }
        }__CLR4_4_16ke6kekylve09o.R.inc(8600);final List<T> list = new ArrayList<>(buffers.size());
        __CLR4_4_16ke6kekylve09o.R.inc(8601);for (final byte[] buf : buffers) {{
            __CLR4_4_16ke6kekylve09o.R.inc(8602);final int c = Math.min(buf.length, remaining);
            __CLR4_4_16ke6kekylve09o.R.inc(8603);list.add(isConstructor.construct(buf, 0, c));
            __CLR4_4_16ke6kekylve09o.R.inc(8604);remaining -= c;
            __CLR4_4_16ke6kekylve09o.R.inc(8605);if ((((remaining == 0)&&(__CLR4_4_16ke6kekylve09o.R.iget(8606)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8607)==0&false))) {{
                __CLR4_4_16ke6kekylve09o.R.inc(8608);break;
            }
        }}
        }__CLR4_4_16ke6kekylve09o.R.inc(8609);reuseBuffers = false;
        __CLR4_4_16ke6kekylve09o.R.inc(8610);return new SequenceInputStream(Collections.enumeration(list));
    }finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * Constructor for an InputStream subclass.
     *
     * @param <T> the type of the InputStream.
     */
    @FunctionalInterface
    protected interface InputStreamConstructor<T extends InputStream> {

        /**
         * Construct an InputStream subclass.
         *
         * @param buf the buffer
         * @param offset the offset into the buffer
         * @param length the length of the buffer
         *
         * @return the InputStream subclass.
         */
        T construct(final byte[] buf, final int offset, final int length);
    }

    /**
     * Gets the current contents of this byte stream as a byte array.
     * The result is independent of this stream.
     *
     * @return the current contents of this output stream, as a byte array
     * @see java.io.ByteArrayOutputStream#toByteArray()
     */
    public abstract byte[] toByteArray();

    /**
     * Gets the current contents of this byte stream as a byte array.
     * The result is independent of this stream.
     *
     * @return the current contents of this output stream, as a byte array
     * @see java.io.ByteArrayOutputStream#toByteArray()
     */
    protected byte[] toByteArrayImpl() {try{__CLR4_4_16ke6kekylve09o.R.inc(8611);
        __CLR4_4_16ke6kekylve09o.R.inc(8612);int remaining = count;
        __CLR4_4_16ke6kekylve09o.R.inc(8613);if ((((remaining == 0)&&(__CLR4_4_16ke6kekylve09o.R.iget(8614)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8615)==0&false))) {{
            __CLR4_4_16ke6kekylve09o.R.inc(8616);return IOUtils.EMPTY_BYTE_ARRAY;
        }
        }__CLR4_4_16ke6kekylve09o.R.inc(8617);final byte[] newbuf = IOUtils.byteArray(remaining);
        __CLR4_4_16ke6kekylve09o.R.inc(8618);int pos = 0;
        __CLR4_4_16ke6kekylve09o.R.inc(8619);for (final byte[] buf : buffers) {{
            __CLR4_4_16ke6kekylve09o.R.inc(8620);final int c = Math.min(buf.length, remaining);
            __CLR4_4_16ke6kekylve09o.R.inc(8621);System.arraycopy(buf, 0, newbuf, pos, c);
            __CLR4_4_16ke6kekylve09o.R.inc(8622);pos += c;
            __CLR4_4_16ke6kekylve09o.R.inc(8623);remaining -= c;
            __CLR4_4_16ke6kekylve09o.R.inc(8624);if ((((remaining == 0)&&(__CLR4_4_16ke6kekylve09o.R.iget(8625)!=0|true))||(__CLR4_4_16ke6kekylve09o.R.iget(8626)==0&false))) {{
                __CLR4_4_16ke6kekylve09o.R.inc(8627);break;
            }
        }}
        }__CLR4_4_16ke6kekylve09o.R.inc(8628);return newbuf;
    }finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * Gets the current contents of this byte stream as a string
     * using the platform default charset.
     * @return the contents of the byte array as a String
     * @see java.io.ByteArrayOutputStream#toString()
     * @deprecated 2.5 use {@link #toString(String)} instead
     */
    @Override
    @Deprecated
    public String toString() {try{__CLR4_4_16ke6kekylve09o.R.inc(8629);
        // make explicit the use of the default charset
        __CLR4_4_16ke6kekylve09o.R.inc(8630);return new String(toByteArray(), Charset.defaultCharset());
    }finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * Gets the current contents of this byte stream as a string
     * using the specified encoding.
     *
     * @param enc  the name of the character encoding
     * @return the string converted from the byte array
     * @throws UnsupportedEncodingException if the encoding is not supported
     * @see java.io.ByteArrayOutputStream#toString(String)
     */
    public String toString(final String enc) throws UnsupportedEncodingException {try{__CLR4_4_16ke6kekylve09o.R.inc(8631);
        __CLR4_4_16ke6kekylve09o.R.inc(8632);return new String(toByteArray(), enc);
    }finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

    /**
     * Gets the current contents of this byte stream as a string
     * using the specified encoding.
     *
     * @param charset  the character encoding
     * @return the string converted from the byte array
     * @see java.io.ByteArrayOutputStream#toString(String)
     * @since 2.5
     */
    public String toString(final Charset charset) {try{__CLR4_4_16ke6kekylve09o.R.inc(8633);
        __CLR4_4_16ke6kekylve09o.R.inc(8634);return new String(toByteArray(), charset);
    }finally{__CLR4_4_16ke6kekylve09o.R.flushNeeded();}}

}
