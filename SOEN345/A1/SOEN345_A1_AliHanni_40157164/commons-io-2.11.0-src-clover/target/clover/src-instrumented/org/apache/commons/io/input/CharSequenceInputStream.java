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
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;

/**
 * {@link InputStream} implementation that can read from String, StringBuffer,
 * StringBuilder or CharBuffer.
 * <p>
 * <strong>Note:</strong> Supports {@link #mark(int)} and {@link #reset()}.
 * </p>
 *
 * @since 2.2
 */
public class CharSequenceInputStream extends InputStream {public static class __CLR4_4_14fl4flkylvdzr8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int BUFFER_SIZE = 2048;

    private static final int NO_MARK = -1;

    private final CharsetEncoder encoder;
    private final CharBuffer cbuf;
    private final ByteBuffer bbuf;

    private int mark_cbuf; // position in cbuf
    private int mark_bbuf; // position in bbuf

    /**
     * Constructor.
     *
     * @param cs the input character sequence
     * @param charset the character set name to use
     * @param bufferSize the buffer size to use.
     * @throws IllegalArgumentException if the buffer is not large enough to hold a complete character
     */
    public CharSequenceInputStream(final CharSequence cs, final Charset charset, final int bufferSize) {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5745);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5746);this.encoder = charset.newEncoder()
            .onMalformedInput(CodingErrorAction.REPLACE)
            .onUnmappableCharacter(CodingErrorAction.REPLACE);
        // Ensure that buffer is long enough to hold a complete character
        __CLR4_4_14fl4flkylvdzr8.R.inc(5747);final float maxBytesPerChar = encoder.maxBytesPerChar();
        __CLR4_4_14fl4flkylvdzr8.R.inc(5748);if ((((bufferSize < maxBytesPerChar)&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5749)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5750)==0&false))) {{
            __CLR4_4_14fl4flkylvdzr8.R.inc(5751);throw new IllegalArgumentException("Buffer size " + bufferSize + " is less than maxBytesPerChar " +
                    maxBytesPerChar);
        }
        }__CLR4_4_14fl4flkylvdzr8.R.inc(5752);this.bbuf = ByteBuffer.allocate(bufferSize);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5753);this.bbuf.flip();
        __CLR4_4_14fl4flkylvdzr8.R.inc(5754);this.cbuf = CharBuffer.wrap(cs);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5755);this.mark_cbuf = NO_MARK;
        __CLR4_4_14fl4flkylvdzr8.R.inc(5756);this.mark_bbuf = NO_MARK;
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    /**
     * Constructor, calls {@link #CharSequenceInputStream(CharSequence, Charset, int)}.
     *
     * @param cs the input character sequence
     * @param charset the character set name to use
     * @param bufferSize the buffer size to use.
     * @throws IllegalArgumentException if the buffer is not large enough to hold a complete character
     */
    public CharSequenceInputStream(final CharSequence cs, final String charset, final int bufferSize) {
        this(cs, Charset.forName(charset), bufferSize);__CLR4_4_14fl4flkylvdzr8.R.inc(5758);try{__CLR4_4_14fl4flkylvdzr8.R.inc(5757);
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    /**
     * Constructor, calls {@link #CharSequenceInputStream(CharSequence, Charset, int)}
     * with a buffer size of 2048.
     *
     * @param cs the input character sequence
     * @param charset the character set name to use
     * @throws IllegalArgumentException if the buffer is not large enough to hold a complete character
     */
    public CharSequenceInputStream(final CharSequence cs, final Charset charset) {
        this(cs, charset, BUFFER_SIZE);__CLR4_4_14fl4flkylvdzr8.R.inc(5760);try{__CLR4_4_14fl4flkylvdzr8.R.inc(5759);
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    /**
     * Constructor, calls {@link #CharSequenceInputStream(CharSequence, String, int)}
     * with a buffer size of 2048.
     *
     * @param cs the input character sequence
     * @param charset the character set name to use
     * @throws IllegalArgumentException if the buffer is not large enough to hold a complete character
     */
    public CharSequenceInputStream(final CharSequence cs, final String charset) {
        this(cs, charset, BUFFER_SIZE);__CLR4_4_14fl4flkylvdzr8.R.inc(5762);try{__CLR4_4_14fl4flkylvdzr8.R.inc(5761);
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    /**
     * Fills the byte output buffer from the input char buffer.
     *
     * @throws CharacterCodingException
     *             an error encoding data
     */
    private void fillBuffer() throws CharacterCodingException {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5763);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5764);this.bbuf.compact();
        __CLR4_4_14fl4flkylvdzr8.R.inc(5765);final CoderResult result = this.encoder.encode(this.cbuf, this.bbuf, true);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5766);if ((((result.isError())&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5767)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5768)==0&false))) {{
            __CLR4_4_14fl4flkylvdzr8.R.inc(5769);result.throwException();
        }
        }__CLR4_4_14fl4flkylvdzr8.R.inc(5770);this.bbuf.flip();
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    @Override
    public int read(final byte[] array, int off, int len) throws IOException {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5771);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5772);Objects.requireNonNull(array, "array");
        __CLR4_4_14fl4flkylvdzr8.R.inc(5773);if ((((len < 0 || (off + len) > array.length)&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5774)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5775)==0&false))) {{
            __CLR4_4_14fl4flkylvdzr8.R.inc(5776);throw new IndexOutOfBoundsException("Array Size=" + array.length +
                    ", offset=" + off + ", length=" + len);
        }
        }__CLR4_4_14fl4flkylvdzr8.R.inc(5777);if ((((len == 0)&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5778)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5779)==0&false))) {{
            __CLR4_4_14fl4flkylvdzr8.R.inc(5780);return 0; // must return 0 for zero length read
        }
        }__CLR4_4_14fl4flkylvdzr8.R.inc(5781);if ((((!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining())&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5782)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5783)==0&false))) {{
            __CLR4_4_14fl4flkylvdzr8.R.inc(5784);return EOF;
        }
        }__CLR4_4_14fl4flkylvdzr8.R.inc(5785);int bytesRead = 0;
        __CLR4_4_14fl4flkylvdzr8.R.inc(5786);while ((((len > 0)&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5787)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5788)==0&false))) {{
            __CLR4_4_14fl4flkylvdzr8.R.inc(5789);if ((((this.bbuf.hasRemaining())&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5790)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5791)==0&false))) {{
                __CLR4_4_14fl4flkylvdzr8.R.inc(5792);final int chunk = Math.min(this.bbuf.remaining(), len);
                __CLR4_4_14fl4flkylvdzr8.R.inc(5793);this.bbuf.get(array, off, chunk);
                __CLR4_4_14fl4flkylvdzr8.R.inc(5794);off += chunk;
                __CLR4_4_14fl4flkylvdzr8.R.inc(5795);len -= chunk;
                __CLR4_4_14fl4flkylvdzr8.R.inc(5796);bytesRead += chunk;
            } }else {{
                __CLR4_4_14fl4flkylvdzr8.R.inc(5797);fillBuffer();
                __CLR4_4_14fl4flkylvdzr8.R.inc(5798);if ((((!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining())&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5799)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5800)==0&false))) {{
                    __CLR4_4_14fl4flkylvdzr8.R.inc(5801);break;
                }
            }}
        }}
        }__CLR4_4_14fl4flkylvdzr8.R.inc(5802);return (((bytesRead == 0 && !this.cbuf.hasRemaining() )&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5803)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5804)==0&false))? EOF : bytesRead;
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    @Override
    public int read() throws IOException {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5805);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5806);for (;;) {{
            __CLR4_4_14fl4flkylvdzr8.R.inc(5807);if ((((this.bbuf.hasRemaining())&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5808)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5809)==0&false))) {{
                __CLR4_4_14fl4flkylvdzr8.R.inc(5810);return this.bbuf.get() & 0xFF;
            }
            }__CLR4_4_14fl4flkylvdzr8.R.inc(5811);fillBuffer();
            __CLR4_4_14fl4flkylvdzr8.R.inc(5812);if ((((!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining())&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5813)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5814)==0&false))) {{
                __CLR4_4_14fl4flkylvdzr8.R.inc(5815);return EOF;
            }
        }}
    }}finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    @Override
    public int read(final byte[] b) throws IOException {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5816);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5817);return read(b, 0, b.length);
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    @Override
    public long skip(long n) throws IOException {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5818);
        /*
         * This could be made more efficient by using position to skip within the current buffer.
         */
        __CLR4_4_14fl4flkylvdzr8.R.inc(5819);long skipped = 0;
        __CLR4_4_14fl4flkylvdzr8.R.inc(5820);while ((((n > 0 && available() > 0)&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5821)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5822)==0&false))) {{
            __CLR4_4_14fl4flkylvdzr8.R.inc(5823);this.read();
            __CLR4_4_14fl4flkylvdzr8.R.inc(5824);n--;
            __CLR4_4_14fl4flkylvdzr8.R.inc(5825);skipped++;
        }
        }__CLR4_4_14fl4flkylvdzr8.R.inc(5826);return skipped;
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    /**
     * Return an estimate of the number of bytes remaining in the byte stream.
     * @return the count of bytes that can be read without blocking (or returning EOF).
     *
     * @throws IOException if an error occurs (probably not possible)
     */
    @Override
    public int available() throws IOException {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5827);
        // The cached entries are in bbuf; since encoding always creates at least one byte
        // per character, we can add the two to get a better estimate (e.g. if bbuf is empty)
        // Note that the previous implementation (2.4) could return zero even though there were
        // encoded bytes still available.
        __CLR4_4_14fl4flkylvdzr8.R.inc(5828);return this.bbuf.remaining() + this.cbuf.remaining();
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5829);
        // noop
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @param readlimit max read limit (ignored)
     */
    @Override
    public synchronized void mark(final int readlimit) {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5830);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5831);this.mark_cbuf = this.cbuf.position();
        __CLR4_4_14fl4flkylvdzr8.R.inc(5832);this.mark_bbuf = this.bbuf.position();
        __CLR4_4_14fl4flkylvdzr8.R.inc(5833);this.cbuf.mark();
        __CLR4_4_14fl4flkylvdzr8.R.inc(5834);this.bbuf.mark();
        // It would be nice to be able to use mark & reset on the cbuf and bbuf;
        // however the bbuf is re-used so that won't work
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    @Override
    public synchronized void reset() throws IOException {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5835);
        /*
         * This is not the most efficient implementation, as it re-encodes from the beginning.
         *
         * Since the bbuf is re-used, in general it's necessary to re-encode the data.
         *
         * It should be possible to apply some optimisations however:
         * + use mark/reset on the cbuf and bbuf. This would only work if the buffer had not been (re)filled since
         * the mark. The code would have to catch InvalidMarkException - does not seem possible to check if mark is
         * valid otherwise. + Try saving the state of the cbuf before each fillBuffer; it might be possible to
         * restart from there.
         */
        __CLR4_4_14fl4flkylvdzr8.R.inc(5836);if ((((this.mark_cbuf != NO_MARK)&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5837)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5838)==0&false))) {{
            // if cbuf is at 0, we have not started reading anything, so skip re-encoding
            __CLR4_4_14fl4flkylvdzr8.R.inc(5839);if ((((this.cbuf.position() != 0)&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5840)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5841)==0&false))) {{
                __CLR4_4_14fl4flkylvdzr8.R.inc(5842);this.encoder.reset();
                __CLR4_4_14fl4flkylvdzr8.R.inc(5843);this.cbuf.rewind();
                __CLR4_4_14fl4flkylvdzr8.R.inc(5844);this.bbuf.rewind();
                __CLR4_4_14fl4flkylvdzr8.R.inc(5845);this.bbuf.limit(0); // rewind does not clear the buffer
                __CLR4_4_14fl4flkylvdzr8.R.inc(5846);while((((this.cbuf.position() < this.mark_cbuf)&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5847)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5848)==0&false))) {{
                    __CLR4_4_14fl4flkylvdzr8.R.inc(5849);this.bbuf.rewind(); // empty the buffer (we only refill when empty during normal processing)
                    __CLR4_4_14fl4flkylvdzr8.R.inc(5850);this.bbuf.limit(0);
                    __CLR4_4_14fl4flkylvdzr8.R.inc(5851);fillBuffer();
                }
            }}
            }__CLR4_4_14fl4flkylvdzr8.R.inc(5852);if ((((this.cbuf.position() != this.mark_cbuf)&&(__CLR4_4_14fl4flkylvdzr8.R.iget(5853)!=0|true))||(__CLR4_4_14fl4flkylvdzr8.R.iget(5854)==0&false))) {{
                __CLR4_4_14fl4flkylvdzr8.R.inc(5855);throw new IllegalStateException("Unexpected CharBuffer position: actual=" + cbuf.position() + " " +
                        "expected=" + this.mark_cbuf);
            }
            }__CLR4_4_14fl4flkylvdzr8.R.inc(5856);this.bbuf.position(this.mark_bbuf);
            __CLR4_4_14fl4flkylvdzr8.R.inc(5857);this.mark_cbuf = NO_MARK;
            __CLR4_4_14fl4flkylvdzr8.R.inc(5858);this.mark_bbuf = NO_MARK;
        }
    }}finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

    @Override
    public boolean markSupported() {try{__CLR4_4_14fl4flkylvdzr8.R.inc(5859);
        __CLR4_4_14fl4flkylvdzr8.R.inc(5860);return true;
    }finally{__CLR4_4_14fl4flkylvdzr8.R.flushNeeded();}}

}
