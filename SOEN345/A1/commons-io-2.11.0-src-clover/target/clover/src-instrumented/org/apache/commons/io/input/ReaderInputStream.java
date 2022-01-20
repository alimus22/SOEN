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
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;

/**
 * {@link InputStream} implementation that reads a character stream from a {@link Reader}
 * and transforms it to a byte stream using a specified charset encoding. The stream
 * is transformed using a {@link CharsetEncoder} object, guaranteeing that all charset
 * encodings supported by the JRE are handled correctly. In particular for charsets such as
 * UTF-16, the implementation ensures that one and only one byte order marker
 * is produced.
 * <p>
 * Since in general it is not possible to predict the number of characters to be read from the
 * {@link Reader} to satisfy a read request on the {@link ReaderInputStream}, all reads from
 * the {@link Reader} are buffered. There is therefore no well defined correlation
 * between the current position of the {@link Reader} and that of the {@link ReaderInputStream}.
 * This also implies that in general there is no need to wrap the underlying {@link Reader}
 * in a {@link java.io.BufferedReader}.
 * <p>
 * {@link ReaderInputStream} implements the inverse transformation of {@link java.io.InputStreamReader};
 * in the following example, reading from {@code in2} would return the same byte
 * sequence as reading from {@code in} (provided that the initial byte sequence is legal
 * with respect to the charset encoding):
 * <pre>
 * InputStream inputStream = ...
 * Charset cs = ...
 * InputStreamReader reader = new InputStreamReader(inputStream, cs);
 * ReaderInputStream in2 = new ReaderInputStream(reader, cs);</pre>
 *
 * {@link ReaderInputStream} implements the same transformation as {@link java.io.OutputStreamWriter},
 * except that the control flow is reversed: both classes transform a character stream
 * into a byte stream, but {@link java.io.OutputStreamWriter} pushes data to the underlying stream,
 * while {@link ReaderInputStream} pulls it from the underlying stream.
 * <p>
 * Note that while there are use cases where there is no alternative to using
 * this class, very often the need to use this class is an indication of a flaw
 * in the design of the code. This class is typically used in situations where an existing
 * API only accepts an {@link InputStream}, but where the most natural way to produce the data
 * is as a character stream, i.e. by providing a {@link Reader} instance. An example of a situation
 * where this problem may appear is when implementing the {@code javax.activation.DataSource}
 * interface from the Java Activation Framework.
 * <p>
 * Given the fact that the {@link Reader} class doesn't provide any way to predict whether the next
 * read operation will block or not, it is not possible to provide a meaningful
 * implementation of the {@link InputStream#available()} method. A call to this method
 * will always return 0. Also, this class doesn't support {@link InputStream#mark(int)}.
 * </p>
 * <p>
 * Instances of {@link ReaderInputStream} are not thread safe.
 * </p>
 *
 * @see org.apache.commons.io.output.WriterOutputStream
 *
 * @since 2.0
 */
public class ReaderInputStream extends InputStream {public static class __CLR4_4_159x59xkylvdzxx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,6917,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int DEFAULT_BUFFER_SIZE = 1024;

    private final Reader reader;
    private final CharsetEncoder encoder;

    /**
     * CharBuffer used as input for the decoder. It should be reasonably
     * large as we read data from the underlying Reader into this buffer.
     */
    private final CharBuffer encoderIn;

    /**
     * ByteBuffer used as output for the decoder. This buffer can be small
     * as it is only used to transfer data from the decoder to the
     * buffer provided by the caller.
     */
    private final ByteBuffer encoderOut;

    private CoderResult lastCoderResult;
    private boolean endOfInput;

    /**
     * Construct a new {@link ReaderInputStream}.
     *
     * @param reader the target {@link Reader}
     * @param encoder the charset encoder
     * @since 2.1
     */
    public ReaderInputStream(final Reader reader, final CharsetEncoder encoder) {
        this(reader, encoder, DEFAULT_BUFFER_SIZE);__CLR4_4_159x59xkylvdzxx.R.inc(6838);try{__CLR4_4_159x59xkylvdzxx.R.inc(6837);
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Construct a new {@link ReaderInputStream}.
     *
     * @param reader the target {@link Reader}
     * @param encoder the charset encoder
     * @param bufferSize the size of the input buffer in number of characters
     * @since 2.1
     */
    public ReaderInputStream(final Reader reader, final CharsetEncoder encoder, final int bufferSize) {try{__CLR4_4_159x59xkylvdzxx.R.inc(6839);
        __CLR4_4_159x59xkylvdzxx.R.inc(6840);this.reader = reader;
        __CLR4_4_159x59xkylvdzxx.R.inc(6841);this.encoder = encoder;
        __CLR4_4_159x59xkylvdzxx.R.inc(6842);this.encoderIn = CharBuffer.allocate(bufferSize);
        __CLR4_4_159x59xkylvdzxx.R.inc(6843);this.encoderIn.flip();
        __CLR4_4_159x59xkylvdzxx.R.inc(6844);this.encoderOut = ByteBuffer.allocate(128);
        __CLR4_4_159x59xkylvdzxx.R.inc(6845);this.encoderOut.flip();
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Construct a new {@link ReaderInputStream}.
     *
     * @param reader the target {@link Reader}
     * @param charset the charset encoding
     * @param bufferSize the size of the input buffer in number of characters
     */
    public ReaderInputStream(final Reader reader, final Charset charset, final int bufferSize) {
        this(reader,
             charset.newEncoder()
                    .onMalformedInput(CodingErrorAction.REPLACE)
                    .onUnmappableCharacter(CodingErrorAction.REPLACE),
             bufferSize);__CLR4_4_159x59xkylvdzxx.R.inc(6847);try{__CLR4_4_159x59xkylvdzxx.R.inc(6846);
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Construct a new {@link ReaderInputStream} with a default input buffer size of
     * {@value #DEFAULT_BUFFER_SIZE} characters.
     *
     * @param reader the target {@link Reader}
     * @param charset the charset encoding
     */
    public ReaderInputStream(final Reader reader, final Charset charset) {
        this(reader, charset, DEFAULT_BUFFER_SIZE);__CLR4_4_159x59xkylvdzxx.R.inc(6849);try{__CLR4_4_159x59xkylvdzxx.R.inc(6848);
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Construct a new {@link ReaderInputStream}.
     *
     * @param reader the target {@link Reader}
     * @param charsetName the name of the charset encoding
     * @param bufferSize the size of the input buffer in number of characters
     */
    public ReaderInputStream(final Reader reader, final String charsetName, final int bufferSize) {
        this(reader, Charset.forName(charsetName), bufferSize);__CLR4_4_159x59xkylvdzxx.R.inc(6851);try{__CLR4_4_159x59xkylvdzxx.R.inc(6850);
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Construct a new {@link ReaderInputStream} with a default input buffer size of
     * {@value #DEFAULT_BUFFER_SIZE} characters.
     *
     * @param reader the target {@link Reader}
     * @param charsetName the name of the charset encoding
     */
    public ReaderInputStream(final Reader reader, final String charsetName) {
        this(reader, charsetName, DEFAULT_BUFFER_SIZE);__CLR4_4_159x59xkylvdzxx.R.inc(6853);try{__CLR4_4_159x59xkylvdzxx.R.inc(6852);
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Construct a new {@link ReaderInputStream} that uses the default character encoding
     * with a default input buffer size of {@value #DEFAULT_BUFFER_SIZE} characters.
     *
     * @param reader the target {@link Reader}
     * @deprecated 2.5 use {@link #ReaderInputStream(Reader, Charset)} instead
     */
    @Deprecated
    public ReaderInputStream(final Reader reader) {
        this(reader, Charset.defaultCharset());__CLR4_4_159x59xkylvdzxx.R.inc(6855);try{__CLR4_4_159x59xkylvdzxx.R.inc(6854);
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Fills the internal char buffer from the reader.
     *
     * @throws IOException
     *             If an I/O error occurs
     */
    private void fillBuffer() throws IOException {try{__CLR4_4_159x59xkylvdzxx.R.inc(6856);
        __CLR4_4_159x59xkylvdzxx.R.inc(6857);if ((((!endOfInput && (lastCoderResult == null || lastCoderResult.isUnderflow()))&&(__CLR4_4_159x59xkylvdzxx.R.iget(6858)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6859)==0&false))) {{
            __CLR4_4_159x59xkylvdzxx.R.inc(6860);encoderIn.compact();
            __CLR4_4_159x59xkylvdzxx.R.inc(6861);final int position = encoderIn.position();
            // We don't use Reader#read(CharBuffer) here because it is more efficient
            // to write directly to the underlying char array (the default implementation
            // copies data to a temporary char array).
            __CLR4_4_159x59xkylvdzxx.R.inc(6862);final int c = reader.read(encoderIn.array(), position, encoderIn.remaining());
            __CLR4_4_159x59xkylvdzxx.R.inc(6863);if ((((c == EOF)&&(__CLR4_4_159x59xkylvdzxx.R.iget(6864)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6865)==0&false))) {{
                __CLR4_4_159x59xkylvdzxx.R.inc(6866);endOfInput = true;
            } }else {{
                __CLR4_4_159x59xkylvdzxx.R.inc(6867);encoderIn.position(position+c);
            }
            }__CLR4_4_159x59xkylvdzxx.R.inc(6868);encoderIn.flip();
        }
        }__CLR4_4_159x59xkylvdzxx.R.inc(6869);encoderOut.compact();
        __CLR4_4_159x59xkylvdzxx.R.inc(6870);lastCoderResult = encoder.encode(encoderIn, encoderOut, endOfInput);
        __CLR4_4_159x59xkylvdzxx.R.inc(6871);encoderOut.flip();
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Read the specified number of bytes into an array.
     *
     * @param array the byte array to read into
     * @param off the offset to start reading bytes into
     * @param len the number of bytes to read
     * @return the number of bytes read or {@code -1}
     *         if the end of the stream has been reached
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read(final byte[] array, int off, int len) throws IOException {try{__CLR4_4_159x59xkylvdzxx.R.inc(6872);
        __CLR4_4_159x59xkylvdzxx.R.inc(6873);Objects.requireNonNull(array, "array");
        __CLR4_4_159x59xkylvdzxx.R.inc(6874);if ((((len < 0 || off < 0 || (off + len) > array.length)&&(__CLR4_4_159x59xkylvdzxx.R.iget(6875)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6876)==0&false))) {{
            __CLR4_4_159x59xkylvdzxx.R.inc(6877);throw new IndexOutOfBoundsException("Array Size=" + array.length +
                    ", offset=" + off + ", length=" + len);
        }
        }__CLR4_4_159x59xkylvdzxx.R.inc(6878);int read = 0;
        __CLR4_4_159x59xkylvdzxx.R.inc(6879);if ((((len == 0)&&(__CLR4_4_159x59xkylvdzxx.R.iget(6880)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6881)==0&false))) {{
            __CLR4_4_159x59xkylvdzxx.R.inc(6882);return 0; // Always return 0 if len == 0
        }
        }__CLR4_4_159x59xkylvdzxx.R.inc(6883);while ((((len > 0)&&(__CLR4_4_159x59xkylvdzxx.R.iget(6884)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6885)==0&false))) {{
            __CLR4_4_159x59xkylvdzxx.R.inc(6886);if ((((encoderOut.hasRemaining())&&(__CLR4_4_159x59xkylvdzxx.R.iget(6887)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6888)==0&false))) {{
                __CLR4_4_159x59xkylvdzxx.R.inc(6889);final int c = Math.min(encoderOut.remaining(), len);
                __CLR4_4_159x59xkylvdzxx.R.inc(6890);encoderOut.get(array, off, c);
                __CLR4_4_159x59xkylvdzxx.R.inc(6891);off += c;
                __CLR4_4_159x59xkylvdzxx.R.inc(6892);len -= c;
                __CLR4_4_159x59xkylvdzxx.R.inc(6893);read += c;
            } }else {{
                __CLR4_4_159x59xkylvdzxx.R.inc(6894);fillBuffer();
                __CLR4_4_159x59xkylvdzxx.R.inc(6895);if ((((endOfInput && !encoderOut.hasRemaining())&&(__CLR4_4_159x59xkylvdzxx.R.iget(6896)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6897)==0&false))) {{
                    __CLR4_4_159x59xkylvdzxx.R.inc(6898);break;
                }
            }}
        }}
        }__CLR4_4_159x59xkylvdzxx.R.inc(6899);return (((read == 0 && endOfInput )&&(__CLR4_4_159x59xkylvdzxx.R.iget(6900)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6901)==0&false))? EOF : read;
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Read the specified number of bytes into an array.
     *
     * @param b the byte array to read into
     * @return the number of bytes read or {@code -1}
     *         if the end of the stream has been reached
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read(final byte[] b) throws IOException {try{__CLR4_4_159x59xkylvdzxx.R.inc(6902);
        __CLR4_4_159x59xkylvdzxx.R.inc(6903);return read(b, 0, b.length);
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Read a single byte.
     *
     * @return either the byte read or {@code -1} if the end of the stream
     *         has been reached
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_159x59xkylvdzxx.R.inc(6904);
        __CLR4_4_159x59xkylvdzxx.R.inc(6905);for (;;) {{
            __CLR4_4_159x59xkylvdzxx.R.inc(6906);if ((((encoderOut.hasRemaining())&&(__CLR4_4_159x59xkylvdzxx.R.iget(6907)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6908)==0&false))) {{
                __CLR4_4_159x59xkylvdzxx.R.inc(6909);return encoderOut.get() & 0xFF;
            }
            }__CLR4_4_159x59xkylvdzxx.R.inc(6910);fillBuffer();
            __CLR4_4_159x59xkylvdzxx.R.inc(6911);if ((((endOfInput && !encoderOut.hasRemaining())&&(__CLR4_4_159x59xkylvdzxx.R.iget(6912)!=0|true))||(__CLR4_4_159x59xkylvdzxx.R.iget(6913)==0&false))) {{
                __CLR4_4_159x59xkylvdzxx.R.inc(6914);return EOF;
            }
        }}
    }}finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}

    /**
     * Close the stream. This method will cause the underlying {@link Reader}
     * to be closed.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_159x59xkylvdzxx.R.inc(6915);
        __CLR4_4_159x59xkylvdzxx.R.inc(6916);reader.close();
    }finally{__CLR4_4_159x59xkylvdzxx.R.flushNeeded();}}
}
