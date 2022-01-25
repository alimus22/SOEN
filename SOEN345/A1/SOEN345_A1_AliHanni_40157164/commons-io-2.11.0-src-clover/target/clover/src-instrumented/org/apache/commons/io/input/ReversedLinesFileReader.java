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

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.StandardLineSeparator;

/**
 * Reads lines in a file reversely (similar to a BufferedReader, but starting at
 * the last line). Useful for e.g. searching in log files.
 *
 * @since 2.2
 */
public class ReversedLinesFileReader implements Closeable {public static class __CLR4_4_15c55c5kylvdzyr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,7108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private class FilePart {
        private final long no;

        private final byte[] data;

        private byte[] leftOver;

        private int currentLastBytePos;

        /**
         * ctor
         *
         * @param no                     the part number
         * @param length                 its length
         * @param leftOverOfLastFilePart remainder
         * @throws IOException if there is a problem reading the file
         */
        private FilePart(final long no, final int length, final byte[] leftOverOfLastFilePart) throws IOException {try{__CLR4_4_15c55c5kylvdzyr.R.inc(6917);
            __CLR4_4_15c55c5kylvdzyr.R.inc(6918);this.no = no;
            __CLR4_4_15c55c5kylvdzyr.R.inc(6919);final int dataLength = length + ((((leftOverOfLastFilePart != null )&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6920)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6921)==0&false))? leftOverOfLastFilePart.length : 0);
            __CLR4_4_15c55c5kylvdzyr.R.inc(6922);this.data = new byte[dataLength];
            __CLR4_4_15c55c5kylvdzyr.R.inc(6923);final long off = (no - 1) * blockSize;

            // read data
            __CLR4_4_15c55c5kylvdzyr.R.inc(6924);if ((((no > 0 /* file not empty */)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6925)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6926)==0&false))) {{
                __CLR4_4_15c55c5kylvdzyr.R.inc(6927);channel.position(off);
                __CLR4_4_15c55c5kylvdzyr.R.inc(6928);final int countRead = channel.read(ByteBuffer.wrap(data, 0, length));
                __CLR4_4_15c55c5kylvdzyr.R.inc(6929);if ((((countRead != length)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6930)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6931)==0&false))) {{
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6932);throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }}
            // copy left over part into data arr
            }__CLR4_4_15c55c5kylvdzyr.R.inc(6933);if ((((leftOverOfLastFilePart != null)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6934)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6935)==0&false))) {{
                __CLR4_4_15c55c5kylvdzyr.R.inc(6936);System.arraycopy(leftOverOfLastFilePart, 0, data, length, leftOverOfLastFilePart.length);
            }
            }__CLR4_4_15c55c5kylvdzyr.R.inc(6937);this.currentLastBytePos = data.length - 1;
            __CLR4_4_15c55c5kylvdzyr.R.inc(6938);this.leftOver = null;
        }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

        /**
         * Creates the buffer containing any left over bytes.
         */
        private void createLeftOver() {try{__CLR4_4_15c55c5kylvdzyr.R.inc(6939);
            __CLR4_4_15c55c5kylvdzyr.R.inc(6940);final int lineLengthBytes = currentLastBytePos + 1;
            __CLR4_4_15c55c5kylvdzyr.R.inc(6941);if ((((lineLengthBytes > 0)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6942)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6943)==0&false))) {{
                // create left over for next block
                __CLR4_4_15c55c5kylvdzyr.R.inc(6944);leftOver = IOUtils.byteArray(lineLengthBytes);
                __CLR4_4_15c55c5kylvdzyr.R.inc(6945);System.arraycopy(data, 0, leftOver, 0, lineLengthBytes);
            } }else {{
                __CLR4_4_15c55c5kylvdzyr.R.inc(6946);leftOver = null;
            }
            }__CLR4_4_15c55c5kylvdzyr.R.inc(6947);currentLastBytePos = -1;
        }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

        /**
         * Finds the new-line sequence and return its length.
         *
         * @param data buffer to scan
         * @param i    start offset in buffer
         * @return length of newline sequence or 0 if none found
         */
        private int getNewLineMatchByteCount(final byte[] data, final int i) {try{__CLR4_4_15c55c5kylvdzyr.R.inc(6948);
            __CLR4_4_15c55c5kylvdzyr.R.inc(6949);for (final byte[] newLineSequence : newLineSequences) {{
                __CLR4_4_15c55c5kylvdzyr.R.inc(6950);boolean match = true;
                __CLR4_4_15c55c5kylvdzyr.R.inc(6951);for (int j = newLineSequence.length - 1; (((j >= 0)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6952)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6953)==0&false)); j--) {{
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6954);final int k = i + j - (newLineSequence.length - 1);
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6955);match &= k >= 0 && data[k] == newLineSequence[j];
                }
                }__CLR4_4_15c55c5kylvdzyr.R.inc(6956);if ((((match)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6957)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6958)==0&false))) {{
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6959);return newLineSequence.length;
                }
            }}
            }__CLR4_4_15c55c5kylvdzyr.R.inc(6960);return 0;
        }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

        /**
         * Reads a line.
         *
         * @return the line or null
         */
        private String readLine() {try{__CLR4_4_15c55c5kylvdzyr.R.inc(6961);

            __CLR4_4_15c55c5kylvdzyr.R.inc(6962);String line = null;
            __CLR4_4_15c55c5kylvdzyr.R.inc(6963);int newLineMatchByteCount;

            __CLR4_4_15c55c5kylvdzyr.R.inc(6964);final boolean isLastFilePart = no == 1;

            __CLR4_4_15c55c5kylvdzyr.R.inc(6965);int i = currentLastBytePos;
            __CLR4_4_15c55c5kylvdzyr.R.inc(6966);while ((((i > -1)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6967)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6968)==0&false))) {{

                __CLR4_4_15c55c5kylvdzyr.R.inc(6969);if ((((!isLastFilePart && i < avoidNewlineSplitBufferSize)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6970)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6971)==0&false))) {{
                    // avoidNewlineSplitBuffer: for all except the last file part we
                    // take a few bytes to the next file part to avoid splitting of newlines
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6972);createLeftOver();
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6973);break; // skip last few bytes and leave it to the next file part
                }

                // --- check for newline ---
                }__CLR4_4_15c55c5kylvdzyr.R.inc(6974);if ((newLineMatchByteCount = getNewLineMatchByteCount(data, i)) > 0 /* found newline */) {{
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6977);final int lineStart = i + 1;
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6978);final int lineLengthBytes = currentLastBytePos - lineStart + 1;

                    __CLR4_4_15c55c5kylvdzyr.R.inc(6979);if ((((lineLengthBytes < 0)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6980)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6981)==0&false))) {{
                        __CLR4_4_15c55c5kylvdzyr.R.inc(6982);throw new IllegalStateException("Unexpected negative line length=" + lineLengthBytes);
                    }
                    }__CLR4_4_15c55c5kylvdzyr.R.inc(6983);final byte[] lineData = IOUtils.byteArray(lineLengthBytes);
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6984);System.arraycopy(data, lineStart, lineData, 0, lineLengthBytes);

                    __CLR4_4_15c55c5kylvdzyr.R.inc(6985);line = new String(lineData, charset);

                    __CLR4_4_15c55c5kylvdzyr.R.inc(6986);currentLastBytePos = i - newLineMatchByteCount;
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6987);break; // found line
                }

                // --- move cursor ---
                }__CLR4_4_15c55c5kylvdzyr.R.inc(6988);i -= byteDecrement;

                // --- end of file part handling ---
                __CLR4_4_15c55c5kylvdzyr.R.inc(6989);if ((((i < 0)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6990)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6991)==0&false))) {{
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6992);createLeftOver();
                    __CLR4_4_15c55c5kylvdzyr.R.inc(6993);break; // end of file part
                }
            }}

            // --- last file part handling ---
            }__CLR4_4_15c55c5kylvdzyr.R.inc(6994);if ((((isLastFilePart && leftOver != null)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(6995)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(6996)==0&false))) {{
                // there will be no line break anymore, this is the first line of the file
                __CLR4_4_15c55c5kylvdzyr.R.inc(6997);line = new String(leftOver, charset);
                __CLR4_4_15c55c5kylvdzyr.R.inc(6998);leftOver = null;
            }

            }__CLR4_4_15c55c5kylvdzyr.R.inc(6999);return line;
        }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

        /**
         * Handles block rollover
         *
         * @return the new FilePart or null
         * @throws IOException if there was a problem reading the file
         */
        private FilePart rollOver() throws IOException {try{__CLR4_4_15c55c5kylvdzyr.R.inc(7000);

            __CLR4_4_15c55c5kylvdzyr.R.inc(7001);if ((((currentLastBytePos > -1)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7002)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7003)==0&false))) {{
                __CLR4_4_15c55c5kylvdzyr.R.inc(7004);throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... "
                        + "last readLine() should have returned something! currentLastCharPos=" + currentLastBytePos);
            }

            }__CLR4_4_15c55c5kylvdzyr.R.inc(7005);if ((((no > 1)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7006)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7007)==0&false))) {{
                __CLR4_4_15c55c5kylvdzyr.R.inc(7008);return new FilePart(no - 1, blockSize, leftOver);
            }
            // NO 1 was the last FilePart, we're finished
            }__CLR4_4_15c55c5kylvdzyr.R.inc(7009);if ((((leftOver != null)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7010)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7011)==0&false))) {{
                __CLR4_4_15c55c5kylvdzyr.R.inc(7012);throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart="
                        + new String(leftOver, charset));
            }
            }__CLR4_4_15c55c5kylvdzyr.R.inc(7013);return null;
        }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}
    }

    private static final String EMPTY_STRING = "";
    private static final int DEFAULT_BLOCK_SIZE = IOUtils.DEFAULT_BUFFER_SIZE;

    private final int blockSize;
    private final Charset charset;
    private final SeekableByteChannel channel;
    private final long totalByteLength;
    private final long totalBlockCount;
    private final byte[][] newLineSequences;
    private final int avoidNewlineSplitBufferSize;
    private final int byteDecrement;
    private FilePart currentFilePart;
    private boolean trailingNewlineOfFileSkipped;

    /**
     * Creates a ReversedLinesFileReader with default block size of 4KB and the
     * platform's default encoding.
     *
     * @param file the file to be read
     * @throws IOException if an I/O error occurs.
     * @deprecated 2.5 use {@link #ReversedLinesFileReader(File, Charset)} instead
     */
    @Deprecated
    public ReversedLinesFileReader(final File file) throws IOException {
        this(file, DEFAULT_BLOCK_SIZE, Charset.defaultCharset());__CLR4_4_15c55c5kylvdzyr.R.inc(7015);try{__CLR4_4_15c55c5kylvdzyr.R.inc(7014);
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Creates a ReversedLinesFileReader with default block size of 4KB and the
     * specified encoding.
     *
     * @param file    the file to be read
     * @param charset the charset to use, null uses the default Charset.
     * @throws IOException if an I/O error occurs.
     * @since 2.5
     */
    public ReversedLinesFileReader(final File file, final Charset charset) throws IOException {
        this(file.toPath(), charset);__CLR4_4_15c55c5kylvdzyr.R.inc(7017);try{__CLR4_4_15c55c5kylvdzyr.R.inc(7016);
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Creates a ReversedLinesFileReader with the given block size and encoding.
     *
     * @param file      the file to be read
     * @param blockSize size of the internal buffer (for ideal performance this
     *                  should match with the block size of the underlying file
     *                  system).
     * @param charset  the encoding of the file, null uses the default Charset.
     * @throws IOException if an I/O error occurs.
     * @since 2.3
     */
    public ReversedLinesFileReader(final File file, final int blockSize, final Charset charset) throws IOException {
        this(file.toPath(), blockSize, charset);__CLR4_4_15c55c5kylvdzyr.R.inc(7019);try{__CLR4_4_15c55c5kylvdzyr.R.inc(7018);
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Creates a ReversedLinesFileReader with the given block size and encoding.
     *
     * @param file      the file to be read
     * @param blockSize size of the internal buffer (for ideal performance this
     *                  should match with the block size of the underlying file
     *                  system).
     * @param charsetName  the encoding of the file, null uses the default Charset.
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of
     *                                                      {@link UnsupportedEncodingException}
     *                                                      in version 2.2 if the
     *                                                      encoding is not
     *                                                      supported.
     */
    public ReversedLinesFileReader(final File file, final int blockSize, final String charsetName) throws IOException {
        this(file.toPath(), blockSize, charsetName);__CLR4_4_15c55c5kylvdzyr.R.inc(7021);try{__CLR4_4_15c55c5kylvdzyr.R.inc(7020);
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Creates a ReversedLinesFileReader with default block size of 4KB and the
     * specified encoding.
     *
     * @param file    the file to be read
     * @param charset the charset to use, null uses the default Charset.
     * @throws IOException if an I/O error occurs.
     * @since 2.7
     */
    public ReversedLinesFileReader(final Path file, final Charset charset) throws IOException {
        this(file, DEFAULT_BLOCK_SIZE, charset);__CLR4_4_15c55c5kylvdzyr.R.inc(7023);try{__CLR4_4_15c55c5kylvdzyr.R.inc(7022);
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Creates a ReversedLinesFileReader with the given block size and encoding.
     *
     * @param file      the file to be read
     * @param blockSize size of the internal buffer (for ideal performance this
     *                  should match with the block size of the underlying file
     *                  system).
     * @param charset  the encoding of the file, null uses the default Charset.
     * @throws IOException if an I/O error occurs.
     * @since 2.7
     */
    public ReversedLinesFileReader(final Path file, final int blockSize, final Charset charset) throws IOException {try{__CLR4_4_15c55c5kylvdzyr.R.inc(7024);
        __CLR4_4_15c55c5kylvdzyr.R.inc(7025);this.blockSize = blockSize;
        __CLR4_4_15c55c5kylvdzyr.R.inc(7026);this.charset = Charsets.toCharset(charset);

        // --- check & prepare encoding ---
        __CLR4_4_15c55c5kylvdzyr.R.inc(7027);final CharsetEncoder charsetEncoder = this.charset.newEncoder();
        __CLR4_4_15c55c5kylvdzyr.R.inc(7028);final float maxBytesPerChar = charsetEncoder.maxBytesPerChar();
        __CLR4_4_15c55c5kylvdzyr.R.inc(7029);if ((((maxBytesPerChar == 1f)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7030)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7031)==0&false))) {{
            // all one byte encodings are no problem
            __CLR4_4_15c55c5kylvdzyr.R.inc(7032);byteDecrement = 1;
        } }else {__CLR4_4_15c55c5kylvdzyr.R.inc(7033);if ((((this.charset == StandardCharsets.UTF_8)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7034)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7035)==0&false))) {{
            // UTF-8 works fine out of the box, for multibyte sequences a second UTF-8 byte
            // can never be a newline byte
            // http://en.wikipedia.org/wiki/UTF-8
            __CLR4_4_15c55c5kylvdzyr.R.inc(7036);byteDecrement = 1;
        } }else {__CLR4_4_15c55c5kylvdzyr.R.inc(7037);if ((((this.charset == Charset.forName("Shift_JIS") || // Same as for UTF-8
        // http://www.herongyang.com/Unicode/JIS-Shift-JIS-Encoding.html
                this.charset == Charset.forName("windows-31j") || // Windows code page 932 (Japanese)
                this.charset == Charset.forName("x-windows-949") || // Windows code page 949 (Korean)
                this.charset == Charset.forName("gbk") || // Windows code page 936 (Simplified Chinese)
                this.charset == Charset.forName("x-windows-950"))&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7038)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7039)==0&false))) {{ // Windows code page 950 (Traditional Chinese)
            __CLR4_4_15c55c5kylvdzyr.R.inc(7040);byteDecrement = 1;
        } }else {__CLR4_4_15c55c5kylvdzyr.R.inc(7041);if ((((this.charset == StandardCharsets.UTF_16BE || this.charset == StandardCharsets.UTF_16LE)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7042)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7043)==0&false))) {{
            // UTF-16 new line sequences are not allowed as second tuple of four byte
            // sequences,
            // however byte order has to be specified
            __CLR4_4_15c55c5kylvdzyr.R.inc(7044);byteDecrement = 2;
        } }else {__CLR4_4_15c55c5kylvdzyr.R.inc(7045);if ((((this.charset == StandardCharsets.UTF_16)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7046)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7047)==0&false))) {{
            __CLR4_4_15c55c5kylvdzyr.R.inc(7048);throw new UnsupportedEncodingException(
                    "For UTF-16, you need to specify the byte order (use UTF-16BE or " + "UTF-16LE)");
        } }else {{
            __CLR4_4_15c55c5kylvdzyr.R.inc(7049);throw new UnsupportedEncodingException(
                    "Encoding " + charset + " is not supported yet (feel free to " + "submit a patch)");
        }

        // NOTE: The new line sequences are matched in the order given, so it is
        // important that \r\n is BEFORE \n
        }}}}}__CLR4_4_15c55c5kylvdzyr.R.inc(7050);this.newLineSequences = new byte[][] {
            StandardLineSeparator.CRLF.getBytes(this.charset),
            StandardLineSeparator.LF.getBytes(this.charset),
            StandardLineSeparator.CR.getBytes(this.charset)
        };

        __CLR4_4_15c55c5kylvdzyr.R.inc(7051);this.avoidNewlineSplitBufferSize = newLineSequences[0].length;

        // Open file
        __CLR4_4_15c55c5kylvdzyr.R.inc(7052);this.channel = Files.newByteChannel(file, StandardOpenOption.READ);
        __CLR4_4_15c55c5kylvdzyr.R.inc(7053);this.totalByteLength = channel.size();
        __CLR4_4_15c55c5kylvdzyr.R.inc(7054);int lastBlockLength = (int) (this.totalByteLength % blockSize);
        __CLR4_4_15c55c5kylvdzyr.R.inc(7055);if ((((lastBlockLength > 0)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7056)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7057)==0&false))) {{
            __CLR4_4_15c55c5kylvdzyr.R.inc(7058);this.totalBlockCount = this.totalByteLength / blockSize + 1;
        } }else {{
            __CLR4_4_15c55c5kylvdzyr.R.inc(7059);this.totalBlockCount = this.totalByteLength / blockSize;
            __CLR4_4_15c55c5kylvdzyr.R.inc(7060);if ((((this.totalByteLength > 0)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7061)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7062)==0&false))) {{
                __CLR4_4_15c55c5kylvdzyr.R.inc(7063);lastBlockLength = blockSize;
            }
        }}
        }__CLR4_4_15c55c5kylvdzyr.R.inc(7064);this.currentFilePart = new FilePart(totalBlockCount, lastBlockLength, null);

    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Creates a ReversedLinesFileReader with the given block size and encoding.
     *
     * @param file        the file to be read
     * @param blockSize   size of the internal buffer (for ideal performance this
     *                    should match with the block size of the underlying file
     *                    system).
     * @param charsetName the encoding of the file, null uses the default Charset.
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of
     *                                                      {@link UnsupportedEncodingException}
     *                                                      in version 2.2 if the
     *                                                      encoding is not
     *                                                      supported.
     * @since 2.7
     */
    public ReversedLinesFileReader(final Path file, final int blockSize, final String charsetName) throws IOException {
        this(file, blockSize, Charsets.toCharset(charsetName));__CLR4_4_15c55c5kylvdzyr.R.inc(7066);try{__CLR4_4_15c55c5kylvdzyr.R.inc(7065);
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Closes underlying resources.
     *
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_15c55c5kylvdzyr.R.inc(7067);
        __CLR4_4_15c55c5kylvdzyr.R.inc(7068);channel.close();
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Returns the lines of the file from bottom to top.
     *
     * @return the next line or null if the start of the file is reached
     * @throws IOException if an I/O error occurs.
     */
    public String readLine() throws IOException {try{__CLR4_4_15c55c5kylvdzyr.R.inc(7069);

        __CLR4_4_15c55c5kylvdzyr.R.inc(7070);String line = currentFilePart.readLine();
        __CLR4_4_15c55c5kylvdzyr.R.inc(7071);while ((((line == null)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7072)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7073)==0&false))) {{
            __CLR4_4_15c55c5kylvdzyr.R.inc(7074);currentFilePart = currentFilePart.rollOver();
            __CLR4_4_15c55c5kylvdzyr.R.inc(7075);if ((((currentFilePart == null)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7076)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7077)==0&false))) {{
                // no more fileparts: we're done, leave line set to null
                __CLR4_4_15c55c5kylvdzyr.R.inc(7078);break;
            }
            }__CLR4_4_15c55c5kylvdzyr.R.inc(7079);line = currentFilePart.readLine();
        }

        // aligned behavior with BufferedReader that doesn't return a last, empty line
        }__CLR4_4_15c55c5kylvdzyr.R.inc(7080);if ((((EMPTY_STRING.equals(line) && !trailingNewlineOfFileSkipped)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7081)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7082)==0&false))) {{
            __CLR4_4_15c55c5kylvdzyr.R.inc(7083);trailingNewlineOfFileSkipped = true;
            __CLR4_4_15c55c5kylvdzyr.R.inc(7084);line = readLine();
        }

        }__CLR4_4_15c55c5kylvdzyr.R.inc(7085);return line;
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Returns {@code lineCount} lines of the file from bottom to top.
     * <p>
     * If there are less than {@code lineCount} lines in the file, then that's what
     * you get.
     * </p>
     * <p>
     * Note: You can easily flip the result with {@link Collections#reverse(List)}.
     * </p>
     *
     * @param lineCount How many lines to read.
     * @return A new list
     * @throws IOException if an I/O error occurs.
     * @since 2.8.0
     */
    public List<String> readLines(final int lineCount) throws IOException {try{__CLR4_4_15c55c5kylvdzyr.R.inc(7086);
        __CLR4_4_15c55c5kylvdzyr.R.inc(7087);if ((((lineCount < 0)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7088)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7089)==0&false))) {{
            __CLR4_4_15c55c5kylvdzyr.R.inc(7090);throw new IllegalArgumentException("lineCount < 0");
        }
        }__CLR4_4_15c55c5kylvdzyr.R.inc(7091);final ArrayList<String> arrayList = new ArrayList<>(lineCount);
        __CLR4_4_15c55c5kylvdzyr.R.inc(7092);for (int i = 0; (((i < lineCount)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7093)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7094)==0&false)); i++) {{
            __CLR4_4_15c55c5kylvdzyr.R.inc(7095);final String line = readLine();
            __CLR4_4_15c55c5kylvdzyr.R.inc(7096);if ((((line == null)&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7097)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7098)==0&false))) {{
                __CLR4_4_15c55c5kylvdzyr.R.inc(7099);return arrayList;
            }
            }__CLR4_4_15c55c5kylvdzyr.R.inc(7100);arrayList.add(line);
        }
        }__CLR4_4_15c55c5kylvdzyr.R.inc(7101);return arrayList;
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

    /**
     * Returns the last {@code lineCount} lines of the file.
     * <p>
     * If there are less than {@code lineCount} lines in the file, then that's what
     * you get.
     * </p>
     *
     * @param lineCount How many lines to read.
     * @return A String.
     * @throws IOException if an I/O error occurs.
     * @since 2.8.0
     */
    public String toString(final int lineCount) throws IOException {try{__CLR4_4_15c55c5kylvdzyr.R.inc(7102);
        __CLR4_4_15c55c5kylvdzyr.R.inc(7103);final List<String> lines = readLines(lineCount);
        __CLR4_4_15c55c5kylvdzyr.R.inc(7104);Collections.reverse(lines);
        __CLR4_4_15c55c5kylvdzyr.R.inc(7105);return (((lines.isEmpty() )&&(__CLR4_4_15c55c5kylvdzyr.R.iget(7106)!=0|true))||(__CLR4_4_15c55c5kylvdzyr.R.iget(7107)==0&false))? EMPTY_STRING : String.join(System.lineSeparator(), lines) + System.lineSeparator();
    }finally{__CLR4_4_15c55c5kylvdzyr.R.flushNeeded();}}

}
