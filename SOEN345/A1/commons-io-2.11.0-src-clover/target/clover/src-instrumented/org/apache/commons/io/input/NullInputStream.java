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

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * A functional, light weight {@link InputStream} that emulates
 * a stream of a specified size.
 * <p>
 * This implementation provides a light weight
 * object for testing with an {@link InputStream}
 * where the contents don't matter.
 * </p>
 * <p>
 * One use case would be for testing the handling of
 * large {@link InputStream} as it can emulate that
 * scenario without the overhead of actually processing
 * large numbers of bytes - significantly speeding up
 * test execution times.
 * </p>
 * <p>
 * This implementation returns zero from the method that
 * reads a byte and leaves the array unchanged in the read
 * methods that are passed a byte array.
 * If alternative data is required the {@code processByte()} and
 * {@code processBytes()} methods can be implemented to generate
 * data, for example:
 * </p>
 *
 * <pre>
 *  public class TestInputStream extends NullInputStream {
 *      public TestInputStream(int size) {
 *          super(size);
 *      }
 *      protected int processByte() {
 *          return ... // return required value here
 *      }
 *      protected void processBytes(byte[] bytes, int offset, int length) {
 *          for (int i = offset; i &lt; length; i++) {
 *              bytes[i] = ... // set array value here
 *          }
 *      }
 *  }
 * </pre>
 *
 * @since 1.3
 *
 */
public class NullInputStream extends InputStream {public static class __CLR4_4_14pl4plkylvdzu6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,6214,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final long size;
    private long position;
    private long mark = -1;
    private long readlimit;
    private boolean eof;
    private final boolean throwEofException;
    private final boolean markSupported;

    /**
     * Create an {@link InputStream} that emulates a size 0 stream
     * which supports marking and does not throw EOFException.
     *
     * @since 2.7
     */
    public NullInputStream() {
       this(0, true, false);__CLR4_4_14pl4plkylvdzu6.R.inc(6106);try{__CLR4_4_14pl4plkylvdzu6.R.inc(6105);
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Create an {@link InputStream} that emulates a specified size
     * which supports marking and does not throw EOFException.
     *
     * @param size The size of the input stream to emulate.
     */
    public NullInputStream(final long size) {
       this(size, true, false);__CLR4_4_14pl4plkylvdzu6.R.inc(6108);try{__CLR4_4_14pl4plkylvdzu6.R.inc(6107);
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Create an {@link InputStream} that emulates a specified
     * size with option settings.
     *
     * @param size The size of the input stream to emulate.
     * @param markSupported Whether this instance will support
     * the {@code mark()} functionality.
     * @param throwEofException Whether this implementation
     * will throw an {@link EOFException} or return -1 when the
     * end of file is reached.
     */
    public NullInputStream(final long size, final boolean markSupported, final boolean throwEofException) {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6109);
       __CLR4_4_14pl4plkylvdzu6.R.inc(6110);this.size = size;
       __CLR4_4_14pl4plkylvdzu6.R.inc(6111);this.markSupported = markSupported;
       __CLR4_4_14pl4plkylvdzu6.R.inc(6112);this.throwEofException = throwEofException;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Return the current position.
     *
     * @return the current position.
     */
    public long getPosition() {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6113);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6114);return position;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Return the size this {@link InputStream} emulates.
     *
     * @return The size of the input stream to emulate.
     */
    public long getSize() {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6115);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6116);return size;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Return the number of bytes that can be read.
     *
     * @return The number of bytes that can be read.
     */
    @Override
    public int available() {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6117);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6118);final long avail = size - position;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6119);if ((((avail <= 0)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6120)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6121)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6122);return 0;
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6123);if ((((avail > Integer.MAX_VALUE)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6124)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6125)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6126);return Integer.MAX_VALUE;
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6127);return (int) avail;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Close this input stream - resets the internal state to
     * the initial values.
     *
     * @throws IOException If an error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6128);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6129);eof = false;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6130);position = 0;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6131);mark = -1;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Mark the current position.
     *
     * @param readlimit The number of bytes before this marked position
     * is invalid.
     * @throws UnsupportedOperationException if mark is not supported.
     */
    @Override
    public synchronized void mark(final int readlimit) {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6132);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6133);if ((((!markSupported)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6134)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6135)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6136);throw UnsupportedOperationExceptions.mark();
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6137);mark = position;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6138);this.readlimit = readlimit;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Indicates whether <i>mark</i> is supported.
     *
     * @return Whether <i>mark</i> is supported or not.
     */
    @Override
    public boolean markSupported() {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6139);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6140);return markSupported;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Read a byte.
     *
     * @return Either The byte value returned by {@code processByte()}
     * or {@code -1} if the end of file has been reached and
     * {@code throwEofException} is set to {@code false}.
     * @throws EOFException if the end of file is reached and
     * {@code throwEofException} is set to {@code true}.
     * @throws IOException if trying to read past the end of file.
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6141);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6142);if ((((eof)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6143)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6144)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6145);throw new IOException("Read after end of file");
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6146);if ((((position == size)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6147)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6148)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6149);return doEndOfFile();
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6150);position++;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6151);return processByte();
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Read some bytes into the specified array.
     *
     * @param bytes The byte array to read into
     * @return The number of bytes read or {@code -1}
     * if the end of file has been reached and
     * {@code throwEofException} is set to {@code false}.
     * @throws EOFException if the end of file is reached and
     * {@code throwEofException} is set to {@code true}.
     * @throws IOException if trying to read past the end of file.
     */
    @Override
    public int read(final byte[] bytes) throws IOException {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6152);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6153);return read(bytes, 0, bytes.length);
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Read the specified number bytes into an array.
     *
     * @param bytes The byte array to read into.
     * @param offset The offset to start reading bytes into.
     * @param length The number of bytes to read.
     * @return The number of bytes read or {@code -1}
     * if the end of file has been reached and
     * {@code throwEofException} is set to {@code false}.
     * @throws EOFException if the end of file is reached and
     * {@code throwEofException} is set to {@code true}.
     * @throws IOException if trying to read past the end of file.
     */
    @Override
    public int read(final byte[] bytes, final int offset, final int length) throws IOException {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6154);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6155);if ((((eof)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6156)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6157)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6158);throw new IOException("Read after end of file");
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6159);if ((((position == size)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6160)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6161)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6162);return doEndOfFile();
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6163);position += length;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6164);int returnLength = length;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6165);if ((((position > size)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6166)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6167)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6168);returnLength = length - (int)(position - size);
            __CLR4_4_14pl4plkylvdzu6.R.inc(6169);position = size;
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6170);processBytes(bytes, offset, returnLength);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6171);return returnLength;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Reset the stream to the point when mark was last called.
     *
     * @throws UnsupportedOperationException if mark is not supported.
     * @throws IOException If no position has been marked
     * or the read limit has been exceed since the last position was
     * marked.
     */
    @Override
    public synchronized void reset() throws IOException {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6172);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6173);if ((((!markSupported)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6174)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6175)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6176);throw UnsupportedOperationExceptions.reset();
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6177);if ((((mark < 0)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6178)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6179)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6180);throw new IOException("No position has been marked");
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6181);if ((((position > mark + readlimit)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6182)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6183)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6184);throw new IOException("Marked position [" + mark +
                    "] is no longer valid - passed the read limit [" +
                    readlimit + "]");
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6185);position = mark;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6186);eof = false;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Skip a specified number of bytes.
     *
     * @param numberOfBytes The number of bytes to skip.
     * @return The number of bytes skipped or {@code -1}
     * if the end of file has been reached and
     * {@code throwEofException} is set to {@code false}.
     * @throws EOFException if the end of file is reached and
     * {@code throwEofException} is set to {@code true}.
     * @throws IOException if trying to read past the end of file.
     */
    @Override
    public long skip(final long numberOfBytes) throws IOException {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6187);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6188);if ((((eof)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6189)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6190)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6191);throw new IOException("Skip after end of file");
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6192);if ((((position == size)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6193)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6194)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6195);return doEndOfFile();
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6196);position += numberOfBytes;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6197);long returnLength = numberOfBytes;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6198);if ((((position > size)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6199)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6200)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6201);returnLength = numberOfBytes - (position - size);
            __CLR4_4_14pl4plkylvdzu6.R.inc(6202);position = size;
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6203);return returnLength;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Return a byte value for the  {@code read()} method.
     * <p>
     * This implementation returns zero.
     *
     * @return This implementation always returns zero.
     */
    protected int processByte() {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6204);
        // do nothing - overridable by subclass
        __CLR4_4_14pl4plkylvdzu6.R.inc(6205);return 0;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Process the bytes for the {@code read(byte[], offset, length)}
     * method.
     * <p>
     * This implementation leaves the byte array unchanged.
     *
     * @param bytes The byte array
     * @param offset The offset to start at.
     * @param length The number of bytes.
     */
    protected void processBytes(final byte[] bytes, final int offset, final int length) {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6206);
        // do nothing - overridable by subclass
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

    /**
     * Handle End of File.
     *
     * @return {@code -1} if {@code throwEofException} is
     * set to {@code false}
     * @throws EOFException if {@code throwEofException} is set
     * to {@code true}.
     */
    private int doEndOfFile() throws EOFException {try{__CLR4_4_14pl4plkylvdzu6.R.inc(6207);
        __CLR4_4_14pl4plkylvdzu6.R.inc(6208);eof = true;
        __CLR4_4_14pl4plkylvdzu6.R.inc(6209);if ((((throwEofException)&&(__CLR4_4_14pl4plkylvdzu6.R.iget(6210)!=0|true))||(__CLR4_4_14pl4plkylvdzu6.R.iget(6211)==0&false))) {{
            __CLR4_4_14pl4plkylvdzu6.R.inc(6212);throw new EOFException();
        }
        }__CLR4_4_14pl4plkylvdzu6.R.inc(6213);return EOF;
    }finally{__CLR4_4_14pl4plkylvdzu6.R.flushNeeded();}}

}
