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
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/**
 * {@link OutputStream} implementation that transforms a byte stream to a
 * character stream using a specified charset encoding and writes the resulting
 * stream to a {@link Writer}. The stream is transformed using a
 * {@link CharsetDecoder} object, guaranteeing that all charset
 * encodings supported by the JRE are handled correctly.
 * <p>
 * The output of the {@link CharsetDecoder} is buffered using a fixed size buffer.
 * This implies that the data is written to the underlying {@link Writer} in chunks
 * that are no larger than the size of this buffer. By default, the buffer is
 * flushed only when it overflows or when {@link #flush()} or {@link #close()}
 * is called. In general there is therefore no need to wrap the underlying {@link Writer}
 * in a {@link java.io.BufferedWriter}. {@link WriterOutputStream} can also
 * be instructed to flush the buffer after each write operation. In this case, all
 * available data is written immediately to the underlying {@link Writer}, implying that
 * the current position of the {@link Writer} is correlated to the current position
 * of the {@link WriterOutputStream}.
 * <p>
 * {@link WriterOutputStream} implements the inverse transformation of {@link java.io.OutputStreamWriter};
 * in the following example, writing to {@code out2} would have the same result as writing to
 * {@code out} directly (provided that the byte sequence is legal with respect to the
 * charset encoding):
 * <pre>
 * OutputStream out = ...
 * Charset cs = ...
 * OutputStreamWriter writer = new OutputStreamWriter(out, cs);
 * WriterOutputStream out2 = new WriterOutputStream(writer, cs);</pre>
 * {@link WriterOutputStream} implements the same transformation as {@link java.io.InputStreamReader},
 * except that the control flow is reversed: both classes transform a byte stream
 * into a character stream, but {@link java.io.InputStreamReader} pulls data from the underlying stream,
 * while {@link WriterOutputStream} pushes it to the underlying stream.
 * <p>
 * Note that while there are use cases where there is no alternative to using
 * this class, very often the need to use this class is an indication of a flaw
 * in the design of the code. This class is typically used in situations where an existing
 * API only accepts an {@link OutputStream} object, but where the stream is known to represent
 * character data that must be decoded for further use.
 * </p>
 * <p>
 * Instances of {@link WriterOutputStream} are not thread safe.
 * </p>
 *
 * @see org.apache.commons.io.input.ReaderInputStream
 * @since 2.0
 */
public class WriterOutputStream extends OutputStream {public static class __CLR4_4_17ei7eikylve0hp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9682,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int BUFFER_SIZE = 1024;

    private final Writer writer;
    private final CharsetDecoder decoder;
    private final boolean writeImmediately;

    /**
     * ByteBuffer used as input for the decoder. This buffer can be small
     * as it is used only to transfer the received data to the
     * decoder.
     */
    private final ByteBuffer decoderIn = ByteBuffer.allocate(128);

    /**
     * CharBuffer used as output for the decoder. It should be
     * somewhat larger as we write from this buffer to the
     * underlying Writer.
     */
    private final CharBuffer decoderOut;

    /**
     * Constructs a new {@link WriterOutputStream} with a default output buffer size of {@value #BUFFER_SIZE}
     * characters. The output buffer will only be flushed when it overflows or when {@link #flush()} or {@link #close()}
     * is called.
     *
     * @param writer the target {@link Writer}
     * @param decoder the charset decoder
     * @since 2.1
     */
    public WriterOutputStream(final Writer writer, final CharsetDecoder decoder) {
        this(writer, decoder, BUFFER_SIZE, false);__CLR4_4_17ei7eikylve0hp.R.inc(9595);try{__CLR4_4_17ei7eikylve0hp.R.inc(9594);
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Constructs a new {@link WriterOutputStream}.
     *
     * @param writer the target {@link Writer}
     * @param decoder the charset decoder
     * @param bufferSize the size of the output buffer in number of characters
     * @param writeImmediately If {@code true} the output buffer will be flushed after each
     *                         write operation, i.e. all available data will be written to the
     *                         underlying {@link Writer} immediately. If {@code false}, the
     *                         output buffer will only be flushed when it overflows or when
     *                         {@link #flush()} or {@link #close()} is called.
     * @since 2.1
     */
    public WriterOutputStream(final Writer writer, final CharsetDecoder decoder, final int bufferSize,
                              final boolean writeImmediately) {try{__CLR4_4_17ei7eikylve0hp.R.inc(9596);
        __CLR4_4_17ei7eikylve0hp.R.inc(9597);checkIbmJdkWithBrokenUTF16( decoder.charset());
        __CLR4_4_17ei7eikylve0hp.R.inc(9598);this.writer = writer;
        __CLR4_4_17ei7eikylve0hp.R.inc(9599);this.decoder = decoder;
        __CLR4_4_17ei7eikylve0hp.R.inc(9600);this.writeImmediately = writeImmediately;
        __CLR4_4_17ei7eikylve0hp.R.inc(9601);decoderOut = CharBuffer.allocate(bufferSize);
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Constructs a new {@link WriterOutputStream}.
     *
     * @param writer the target {@link Writer}
     * @param charset the charset encoding
     * @param bufferSize the size of the output buffer in number of characters
     * @param writeImmediately If {@code true} the output buffer will be flushed after each
     *                         write operation, i.e. all available data will be written to the
     *                         underlying {@link Writer} immediately. If {@code false}, the
     *                         output buffer will only be flushed when it overflows or when
     *                         {@link #flush()} or {@link #close()} is called.
     */
    public WriterOutputStream(final Writer writer, final Charset charset, final int bufferSize,
                              final boolean writeImmediately) {
        this(writer,
             charset.newDecoder()
                    .onMalformedInput(CodingErrorAction.REPLACE)
                    .onUnmappableCharacter(CodingErrorAction.REPLACE)
                    .replaceWith("?"),
             bufferSize,
             writeImmediately);__CLR4_4_17ei7eikylve0hp.R.inc(9603);try{__CLR4_4_17ei7eikylve0hp.R.inc(9602);
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Constructs a new {@link WriterOutputStream} with a default output buffer size of {@value #BUFFER_SIZE}
     * characters. The output buffer will only be flushed when it overflows or when {@link #flush()} or {@link #close()}
     * is called.
     *
     * @param writer the target {@link Writer}
     * @param charset the charset encoding
     */
    public WriterOutputStream(final Writer writer, final Charset charset) {
        this(writer, charset, BUFFER_SIZE, false);__CLR4_4_17ei7eikylve0hp.R.inc(9605);try{__CLR4_4_17ei7eikylve0hp.R.inc(9604);
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Constructs a new {@link WriterOutputStream}.
     *
     * @param writer the target {@link Writer}
     * @param charsetName the name of the charset encoding
     * @param bufferSize the size of the output buffer in number of characters
     * @param writeImmediately If {@code true} the output buffer will be flushed after each
     *                         write operation, i.e. all available data will be written to the
     *                         underlying {@link Writer} immediately. If {@code false}, the
     *                         output buffer will only be flushed when it overflows or when
     *                         {@link #flush()} or {@link #close()} is called.
     */
    public WriterOutputStream(final Writer writer, final String charsetName, final int bufferSize,
                              final boolean writeImmediately) {
        this(writer, Charset.forName(charsetName), bufferSize, writeImmediately);__CLR4_4_17ei7eikylve0hp.R.inc(9607);try{__CLR4_4_17ei7eikylve0hp.R.inc(9606);
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Constructs a new {@link WriterOutputStream} with a default output buffer size of {@value #BUFFER_SIZE}
     * characters. The output buffer will only be flushed when it overflows or when {@link #flush()} or {@link #close()}
     * is called.
     *
     * @param writer the target {@link Writer}
     * @param charsetName the name of the charset encoding
     */
    public WriterOutputStream(final Writer writer, final String charsetName) {
        this(writer, charsetName, BUFFER_SIZE, false);__CLR4_4_17ei7eikylve0hp.R.inc(9609);try{__CLR4_4_17ei7eikylve0hp.R.inc(9608);
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Constructs a new {@link WriterOutputStream} that uses the default character encoding and with a default output
     * buffer size of {@value #BUFFER_SIZE} characters. The output buffer will only be flushed when it overflows or when
     * {@link #flush()} or {@link #close()} is called.
     *
     * @param writer the target {@link Writer}
     * @deprecated 2.5 use {@link #WriterOutputStream(Writer, Charset)} instead
     */
    @Deprecated
    public WriterOutputStream(final Writer writer) {
        this(writer, Charset.defaultCharset(), BUFFER_SIZE, false);__CLR4_4_17ei7eikylve0hp.R.inc(9611);try{__CLR4_4_17ei7eikylve0hp.R.inc(9610);
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Write bytes from the specified byte array to the stream.
     *
     * @param b the byte array containing the bytes to write
     * @param off the start offset in the byte array
     * @param len the number of bytes to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final byte[] b, int off, int len) throws IOException {try{__CLR4_4_17ei7eikylve0hp.R.inc(9612);
        __CLR4_4_17ei7eikylve0hp.R.inc(9613);while ((((len > 0)&&(__CLR4_4_17ei7eikylve0hp.R.iget(9614)!=0|true))||(__CLR4_4_17ei7eikylve0hp.R.iget(9615)==0&false))) {{
            __CLR4_4_17ei7eikylve0hp.R.inc(9616);final int c = Math.min(len, decoderIn.remaining());
            __CLR4_4_17ei7eikylve0hp.R.inc(9617);decoderIn.put(b, off, c);
            __CLR4_4_17ei7eikylve0hp.R.inc(9618);processInput(false);
            __CLR4_4_17ei7eikylve0hp.R.inc(9619);len -= c;
            __CLR4_4_17ei7eikylve0hp.R.inc(9620);off += c;
        }
        }__CLR4_4_17ei7eikylve0hp.R.inc(9621);if ((((writeImmediately)&&(__CLR4_4_17ei7eikylve0hp.R.iget(9622)!=0|true))||(__CLR4_4_17ei7eikylve0hp.R.iget(9623)==0&false))) {{
            __CLR4_4_17ei7eikylve0hp.R.inc(9624);flushOutput();
        }
    }}finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Write bytes from the specified byte array to the stream.
     *
     * @param b the byte array containing the bytes to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final byte[] b) throws IOException {try{__CLR4_4_17ei7eikylve0hp.R.inc(9625);
        __CLR4_4_17ei7eikylve0hp.R.inc(9626);write(b, 0, b.length);
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Write a single byte to the stream.
     *
     * @param b the byte to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final int b) throws IOException {try{__CLR4_4_17ei7eikylve0hp.R.inc(9627);
        __CLR4_4_17ei7eikylve0hp.R.inc(9628);write(new byte[] {(byte) b}, 0, 1);
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Flush the stream. Any remaining content accumulated in the output buffer
     * will be written to the underlying {@link Writer}. After that
     * {@link Writer#flush()} will be called.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void flush() throws IOException {try{__CLR4_4_17ei7eikylve0hp.R.inc(9629);
        __CLR4_4_17ei7eikylve0hp.R.inc(9630);flushOutput();
        __CLR4_4_17ei7eikylve0hp.R.inc(9631);writer.flush();
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Close the stream. Any remaining content accumulated in the output buffer
     * will be written to the underlying {@link Writer}. After that
     * {@link Writer#close()} will be called.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_17ei7eikylve0hp.R.inc(9632);
        __CLR4_4_17ei7eikylve0hp.R.inc(9633);processInput(true);
        __CLR4_4_17ei7eikylve0hp.R.inc(9634);flushOutput();
        __CLR4_4_17ei7eikylve0hp.R.inc(9635);writer.close();
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Decode the contents of the input ByteBuffer into a CharBuffer.
     *
     * @param endOfInput indicates end of input
     * @throws IOException if an I/O error occurs.
     */
    private void processInput(final boolean endOfInput) throws IOException {try{__CLR4_4_17ei7eikylve0hp.R.inc(9636);
        // Prepare decoderIn for reading
        __CLR4_4_17ei7eikylve0hp.R.inc(9637);decoderIn.flip();
        __CLR4_4_17ei7eikylve0hp.R.inc(9638);CoderResult coderResult;
        __CLR4_4_17ei7eikylve0hp.R.inc(9639);while (true) {{
            __CLR4_4_17ei7eikylve0hp.R.inc(9640);coderResult = decoder.decode(decoderIn, decoderOut, endOfInput);
            __CLR4_4_17ei7eikylve0hp.R.inc(9641);if ((((coderResult.isOverflow())&&(__CLR4_4_17ei7eikylve0hp.R.iget(9642)!=0|true))||(__CLR4_4_17ei7eikylve0hp.R.iget(9643)==0&false))) {{
                __CLR4_4_17ei7eikylve0hp.R.inc(9644);flushOutput();
            } }else {__CLR4_4_17ei7eikylve0hp.R.inc(9645);if ((((coderResult.isUnderflow())&&(__CLR4_4_17ei7eikylve0hp.R.iget(9646)!=0|true))||(__CLR4_4_17ei7eikylve0hp.R.iget(9647)==0&false))) {{
                __CLR4_4_17ei7eikylve0hp.R.inc(9648);break;
            } }else {{
                // The decoder is configured to replace malformed input and unmappable characters,
                // so we should not get here.
                __CLR4_4_17ei7eikylve0hp.R.inc(9649);throw new IOException("Unexpected coder result");
            }
        }}}
        // Discard the bytes that have been read
        }__CLR4_4_17ei7eikylve0hp.R.inc(9650);decoderIn.compact();
    }finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Flush the output.
     *
     * @throws IOException if an I/O error occurs.
     */
    private void flushOutput() throws IOException {try{__CLR4_4_17ei7eikylve0hp.R.inc(9651);
        __CLR4_4_17ei7eikylve0hp.R.inc(9652);if ((((decoderOut.position() > 0)&&(__CLR4_4_17ei7eikylve0hp.R.iget(9653)!=0|true))||(__CLR4_4_17ei7eikylve0hp.R.iget(9654)==0&false))) {{
            __CLR4_4_17ei7eikylve0hp.R.inc(9655);writer.write(decoderOut.array(), 0, decoderOut.position());
            __CLR4_4_17ei7eikylve0hp.R.inc(9656);decoderOut.rewind();
        }
    }}finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}

    /**
     * Check if the JDK in use properly supports the given charset.
     *
     * @param charset the charset to check the support for
     */
    private static void checkIbmJdkWithBrokenUTF16(final Charset charset){try{__CLR4_4_17ei7eikylve0hp.R.inc(9657);
        __CLR4_4_17ei7eikylve0hp.R.inc(9658);if ((((!"UTF-16".equals(charset.name()))&&(__CLR4_4_17ei7eikylve0hp.R.iget(9659)!=0|true))||(__CLR4_4_17ei7eikylve0hp.R.iget(9660)==0&false))) {{
            __CLR4_4_17ei7eikylve0hp.R.inc(9661);return;
        }
        }__CLR4_4_17ei7eikylve0hp.R.inc(9662);final String TEST_STRING_2 = "v\u00e9s";
        __CLR4_4_17ei7eikylve0hp.R.inc(9663);final byte[] bytes = TEST_STRING_2.getBytes(charset);

        __CLR4_4_17ei7eikylve0hp.R.inc(9664);final CharsetDecoder charsetDecoder2 = charset.newDecoder();
        __CLR4_4_17ei7eikylve0hp.R.inc(9665);final ByteBuffer bb2 = ByteBuffer.allocate(16);
        __CLR4_4_17ei7eikylve0hp.R.inc(9666);final CharBuffer cb2 = CharBuffer.allocate(TEST_STRING_2.length());
        __CLR4_4_17ei7eikylve0hp.R.inc(9667);final int len = bytes.length;
        __CLR4_4_17ei7eikylve0hp.R.inc(9668);for (int i = 0; (((i < len)&&(__CLR4_4_17ei7eikylve0hp.R.iget(9669)!=0|true))||(__CLR4_4_17ei7eikylve0hp.R.iget(9670)==0&false)); i++) {{
            __CLR4_4_17ei7eikylve0hp.R.inc(9671);bb2.put(bytes[i]);
            __CLR4_4_17ei7eikylve0hp.R.inc(9672);bb2.flip();
            __CLR4_4_17ei7eikylve0hp.R.inc(9673);try {
                __CLR4_4_17ei7eikylve0hp.R.inc(9674);charsetDecoder2.decode(bb2, cb2, i == (len - 1));
            } catch ( final IllegalArgumentException e){
                __CLR4_4_17ei7eikylve0hp.R.inc(9675);throw new UnsupportedOperationException("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. " +
                        "Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
            }
            __CLR4_4_17ei7eikylve0hp.R.inc(9676);bb2.compact();
        }
        }__CLR4_4_17ei7eikylve0hp.R.inc(9677);cb2.rewind();
        __CLR4_4_17ei7eikylve0hp.R.inc(9678);if ((((!TEST_STRING_2.equals(cb2.toString()))&&(__CLR4_4_17ei7eikylve0hp.R.iget(9679)!=0|true))||(__CLR4_4_17ei7eikylve0hp.R.iget(9680)==0&false))){{
            __CLR4_4_17ei7eikylve0hp.R.inc(9681);throw new UnsupportedOperationException("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. " +
                    "Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
        }

    }}finally{__CLR4_4_17ei7eikylve0hp.R.flushNeeded();}}
}
