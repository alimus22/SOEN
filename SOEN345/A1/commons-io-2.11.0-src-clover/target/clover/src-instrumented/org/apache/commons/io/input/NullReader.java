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
import java.io.Reader;

/**
 * A functional, light weight {@link Reader} that emulates
 * a reader of a specified size.
 * <p>
 * This implementation provides a light weight
 * object for testing with an {@link Reader}
 * where the contents don't matter.
 * </p>
 * <p>
 * One use case would be for testing the handling of
 * large {@link Reader} as it can emulate that
 * scenario without the overhead of actually processing
 * large numbers of characters - significantly speeding up
 * test execution times.
 * </p>
 * <p>
 * This implementation returns a space from the method that
 * reads a character and leaves the array unchanged in the read
 * methods that are passed a character array.
 * If alternative data is required the {@code processChar()} and
 * {@code processChars()} methods can be implemented to generate
 * data, for example:
 * </p>
 *
 * <pre>
 *  public class TestReader extends NullReader {
 *      public TestReader(int size) {
 *          super(size);
 *      }
 *      protected char processChar() {
 *          return ... // return required value here
 *      }
 *      protected void processChars(char[] chars, int offset, int length) {
 *          for (int i = offset; i &lt; length; i++) {
 *              chars[i] = ... // set array value here
 *          }
 *      }
 *  }
 * </pre>
 *
 * @since 1.3
 */
public class NullReader extends Reader {public static class __CLR4_4_14sm4smkylvdzul{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,6312,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final long size;
    private long position;
    private long mark = -1;
    private long readlimit;
    private boolean eof;
    private final boolean throwEofException;
    private final boolean markSupported;

    /**
     * Creates a {@link Reader} that emulates a size 0 reader
     * which supports marking and does not throw EOFException.
     *
     * @since 2.7
     */
    public NullReader() {
       this(0, true, false);__CLR4_4_14sm4smkylvdzul.R.inc(6215);try{__CLR4_4_14sm4smkylvdzul.R.inc(6214);
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Creates a {@link Reader} that emulates a specified size
     * which supports marking and does not throw EOFException.
     *
     * @param size The size of the reader to emulate.
     */
    public NullReader(final long size) {
       this(size, true, false);__CLR4_4_14sm4smkylvdzul.R.inc(6217);try{__CLR4_4_14sm4smkylvdzul.R.inc(6216);
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Creates a {@link Reader} that emulates a specified
     * size with option settings.
     *
     * @param size The size of the reader to emulate.
     * @param markSupported Whether this instance will support
     * the {@code mark()} functionality.
     * @param throwEofException Whether this implementation
     * will throw an {@link EOFException} or return -1 when the
     * end of file is reached.
     */
    public NullReader(final long size, final boolean markSupported, final boolean throwEofException) {try{__CLR4_4_14sm4smkylvdzul.R.inc(6218);
       __CLR4_4_14sm4smkylvdzul.R.inc(6219);this.size = size;
       __CLR4_4_14sm4smkylvdzul.R.inc(6220);this.markSupported = markSupported;
       __CLR4_4_14sm4smkylvdzul.R.inc(6221);this.throwEofException = throwEofException;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Returns the current position.
     *
     * @return the current position.
     */
    public long getPosition() {try{__CLR4_4_14sm4smkylvdzul.R.inc(6222);
        __CLR4_4_14sm4smkylvdzul.R.inc(6223);return position;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Returns the size this {@link Reader} emulates.
     *
     * @return The size of the reader to emulate.
     */
    public long getSize() {try{__CLR4_4_14sm4smkylvdzul.R.inc(6224);
        __CLR4_4_14sm4smkylvdzul.R.inc(6225);return size;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Closes this Reader - resets the internal state to
     * the initial values.
     *
     * @throws IOException If an error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_14sm4smkylvdzul.R.inc(6226);
        __CLR4_4_14sm4smkylvdzul.R.inc(6227);eof = false;
        __CLR4_4_14sm4smkylvdzul.R.inc(6228);position = 0;
        __CLR4_4_14sm4smkylvdzul.R.inc(6229);mark = -1;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Marks the current position.
     *
     * @param readlimit The number of characters before this marked position
     * is invalid.
     * @throws UnsupportedOperationException if mark is not supported.
     */
    @Override
    public synchronized void mark(final int readlimit) {try{__CLR4_4_14sm4smkylvdzul.R.inc(6230);
        __CLR4_4_14sm4smkylvdzul.R.inc(6231);if ((((!markSupported)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6232)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6233)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6234);throw UnsupportedOperationExceptions.mark();
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6235);mark = position;
        __CLR4_4_14sm4smkylvdzul.R.inc(6236);this.readlimit = readlimit;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Indicates whether <i>mark</i> is supported.
     *
     * @return Whether <i>mark</i> is supported or not.
     */
    @Override
    public boolean markSupported() {try{__CLR4_4_14sm4smkylvdzul.R.inc(6237);
        __CLR4_4_14sm4smkylvdzul.R.inc(6238);return markSupported;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Reads a character.
     *
     * @return Either The character value returned by {@code processChar()}
     * or {@code -1} if the end of file has been reached and
     * {@code throwEofException} is set to {@code false}.
     * @throws EOFException if the end of file is reached and
     * {@code throwEofException} is set to {@code true}.
     * @throws IOException if trying to read past the end of file.
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_14sm4smkylvdzul.R.inc(6239);
        __CLR4_4_14sm4smkylvdzul.R.inc(6240);if ((((eof)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6241)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6242)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6243);throw new IOException("Read after end of file");
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6244);if ((((position == size)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6245)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6246)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6247);return doEndOfFile();
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6248);position++;
        __CLR4_4_14sm4smkylvdzul.R.inc(6249);return processChar();
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Reads some characters into the specified array.
     *
     * @param chars The character array to read into
     * @return The number of characters read or {@code -1}
     * if the end of file has been reached and
     * {@code throwEofException} is set to {@code false}.
     * @throws EOFException if the end of file is reached and
     * {@code throwEofException} is set to {@code true}.
     * @throws IOException if trying to read past the end of file.
     */
    @Override
    public int read(final char[] chars) throws IOException {try{__CLR4_4_14sm4smkylvdzul.R.inc(6250);
        __CLR4_4_14sm4smkylvdzul.R.inc(6251);return read(chars, 0, chars.length);
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Reads the specified number characters into an array.
     *
     * @param chars The character array to read into.
     * @param offset The offset to start reading characters into.
     * @param length The number of characters to read.
     * @return The number of characters read or {@code -1}
     * if the end of file has been reached and
     * {@code throwEofException} is set to {@code false}.
     * @throws EOFException if the end of file is reached and
     * {@code throwEofException} is set to {@code true}.
     * @throws IOException if trying to read past the end of file.
     */
    @Override
    public int read(final char[] chars, final int offset, final int length) throws IOException {try{__CLR4_4_14sm4smkylvdzul.R.inc(6252);
        __CLR4_4_14sm4smkylvdzul.R.inc(6253);if ((((eof)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6254)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6255)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6256);throw new IOException("Read after end of file");
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6257);if ((((position == size)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6258)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6259)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6260);return doEndOfFile();
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6261);position += length;
        __CLR4_4_14sm4smkylvdzul.R.inc(6262);int returnLength = length;
        __CLR4_4_14sm4smkylvdzul.R.inc(6263);if ((((position > size)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6264)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6265)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6266);returnLength = length - (int)(position - size);
            __CLR4_4_14sm4smkylvdzul.R.inc(6267);position = size;
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6268);processChars(chars, offset, returnLength);
        __CLR4_4_14sm4smkylvdzul.R.inc(6269);return returnLength;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Resets the stream to the point when mark was last called.
     *
     * @throws UnsupportedOperationException if mark is not supported.
     * @throws IOException If no position has been marked
     * or the read limit has been exceed since the last position was
     * marked.
     */
    @Override
    public synchronized void reset() throws IOException {try{__CLR4_4_14sm4smkylvdzul.R.inc(6270);
        __CLR4_4_14sm4smkylvdzul.R.inc(6271);if ((((!markSupported)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6272)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6273)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6274);throw UnsupportedOperationExceptions.reset();
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6275);if ((((mark < 0)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6276)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6277)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6278);throw new IOException("No position has been marked");
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6279);if ((((position > mark + readlimit)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6280)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6281)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6282);throw new IOException("Marked position [" + mark +
                    "] is no longer valid - passed the read limit [" +
                    readlimit + "]");
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6283);position = mark;
        __CLR4_4_14sm4smkylvdzul.R.inc(6284);eof = false;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Skips a specified number of characters.
     *
     * @param numberOfChars The number of characters to skip.
     * @return The number of characters skipped or {@code -1}
     * if the end of file has been reached and
     * {@code throwEofException} is set to {@code false}.
     * @throws EOFException if the end of file is reached and
     * {@code throwEofException} is set to {@code true}.
     * @throws IOException if trying to read past the end of file.
     */
    @Override
    public long skip(final long numberOfChars) throws IOException {try{__CLR4_4_14sm4smkylvdzul.R.inc(6285);
        __CLR4_4_14sm4smkylvdzul.R.inc(6286);if ((((eof)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6287)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6288)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6289);throw new IOException("Skip after end of file");
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6290);if ((((position == size)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6291)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6292)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6293);return doEndOfFile();
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6294);position += numberOfChars;
        __CLR4_4_14sm4smkylvdzul.R.inc(6295);long returnLength = numberOfChars;
        __CLR4_4_14sm4smkylvdzul.R.inc(6296);if ((((position > size)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6297)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6298)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6299);returnLength = numberOfChars - (position - size);
            __CLR4_4_14sm4smkylvdzul.R.inc(6300);position = size;
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6301);return returnLength;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Returns a character value for the  {@code read()} method.
     * <p>
     * This implementation returns zero.
     * </p>
     *
     * @return This implementation always returns zero.
     */
    protected int processChar() {try{__CLR4_4_14sm4smkylvdzul.R.inc(6302);
        // do nothing - overridable by subclass
        __CLR4_4_14sm4smkylvdzul.R.inc(6303);return 0;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Process the characters for the {@code read(char[], offset, length)}
     * method.
     * <p>
     * This implementation leaves the character array unchanged.
     * </p>
     *
     * @param chars The character array
     * @param offset The offset to start at.
     * @param length The number of characters.
     */
    protected void processChars(final char[] chars, final int offset, final int length) {try{__CLR4_4_14sm4smkylvdzul.R.inc(6304);
        // do nothing - overridable by subclass
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

    /**
     * Handles End of File.
     *
     * @return {@code -1} if {@code throwEofException} is
     * set to {@code false}
     * @throws EOFException if {@code throwEofException} is set
     * to {@code true}.
     */
    private int doEndOfFile() throws EOFException {try{__CLR4_4_14sm4smkylvdzul.R.inc(6305);
        __CLR4_4_14sm4smkylvdzul.R.inc(6306);eof = true;
        __CLR4_4_14sm4smkylvdzul.R.inc(6307);if ((((throwEofException)&&(__CLR4_4_14sm4smkylvdzul.R.iget(6308)!=0|true))||(__CLR4_4_14sm4smkylvdzul.R.iget(6309)==0&false))) {{
            __CLR4_4_14sm4smkylvdzul.R.inc(6310);throw new EOFException();
        }
        }__CLR4_4_14sm4smkylvdzul.R.inc(6311);return EOF;
    }finally{__CLR4_4_14sm4smkylvdzul.R.flushNeeded();}}

}
