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

import java.io.Reader;
import java.io.Serializable;
import java.util.Objects;

/**
 * {@link Reader} implementation that can read from String, StringBuffer,
 * StringBuilder or CharBuffer.
 * <p>
 * <strong>Note:</strong> Supports {@link #mark(int)} and {@link #reset()}.
 * </p>
 *
 * @since 1.4
 */
public class CharSequenceReader extends Reader implements Serializable {public static class __CLR4_4_14it4itkylvdzrm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5963,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 3724187752191401220L;
    private final CharSequence charSequence;
    private int idx;
    private int mark;

    /**
     * The start index in the character sequence, inclusive.
     * <p>
     * When de-serializing a CharSequenceReader that was serialized before
     * this fields was added, this field will be initialized to 0, which
     * gives the same behavior as before: start reading from the start.
     * </p>
     *
     * @see #start()
     * @since 2.7
     */
    private final int start;

    /**
     * The end index in the character sequence, exclusive.
     * <p>
     * When de-serializing a CharSequenceReader that was serialized before
     * this fields was added, this field will be initialized to {@code null},
     * which gives the same behavior as before: stop reading at the
     * CharSequence's length.
     * If this field was an int instead, it would be initialized to 0 when the
     * CharSequenceReader is de-serialized, causing it to not return any
     * characters at all.
     * </p>
     *
     * @see #end()
     * @since 2.7
     */
    private final Integer end;

    /**
     * Constructs a new instance with the specified character sequence.
     *
     * @param charSequence The character sequence, may be {@code null}
     */
    public CharSequenceReader(final CharSequence charSequence) {
        this(charSequence, 0);__CLR4_4_14it4itkylvdzrm.R.inc(5862);try{__CLR4_4_14it4itkylvdzrm.R.inc(5861);
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Constructs a new instance with a portion of the specified character sequence.
     * <p>
     * The start index is not strictly enforced to be within the bounds of the
     * character sequence. This allows the character sequence to grow or shrink
     * in size without risking any {@link IndexOutOfBoundsException} to be thrown.
     * Instead, if the character sequence grows smaller than the start index, this
     * instance will act as if all characters have been read.
     * </p>
     *
     * @param charSequence The character sequence, may be {@code null}
     * @param start The start index in the character sequence, inclusive
     * @throws IllegalArgumentException if the start index is negative
     * @since 2.7
     */
    public CharSequenceReader(final CharSequence charSequence, final int start) {
        this(charSequence, start, Integer.MAX_VALUE);__CLR4_4_14it4itkylvdzrm.R.inc(5864);try{__CLR4_4_14it4itkylvdzrm.R.inc(5863);
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Constructs a new instance with a portion of the specified character sequence.
     * <p>
     * The start and end indexes are not strictly enforced to be within the bounds
     * of the character sequence. This allows the character sequence to grow or shrink
     * in size without risking any {@link IndexOutOfBoundsException} to be thrown.
     * Instead, if the character sequence grows smaller than the start index, this
     * instance will act as if all characters have been read; if the character sequence
     * grows smaller than the end, this instance will use the actual character sequence
     * length.
     * </p>
     *
     * @param charSequence The character sequence, may be {@code null}
     * @param start The start index in the character sequence, inclusive
     * @param end The end index in the character sequence, exclusive
     * @throws IllegalArgumentException if the start index is negative, or if the end index is smaller than the start index
     * @since 2.7
     */
    public CharSequenceReader(final CharSequence charSequence, final int start, final int end) {try{__CLR4_4_14it4itkylvdzrm.R.inc(5865);
        __CLR4_4_14it4itkylvdzrm.R.inc(5866);if ((((start < 0)&&(__CLR4_4_14it4itkylvdzrm.R.iget(5867)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5868)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5869);throw new IllegalArgumentException(
                    "Start index is less than zero: " + start);
        }
        }__CLR4_4_14it4itkylvdzrm.R.inc(5870);if ((((end < start)&&(__CLR4_4_14it4itkylvdzrm.R.iget(5871)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5872)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5873);throw new IllegalArgumentException(
                    "End index is less than start " + start + ": " + end);
        }
        // Don't check the start and end indexes against the CharSequence,
        // to let it grow and shrink without breaking existing behavior.

        }__CLR4_4_14it4itkylvdzrm.R.inc(5874);this.charSequence = (((charSequence != null )&&(__CLR4_4_14it4itkylvdzrm.R.iget(5875)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5876)==0&false))? charSequence : "";
        __CLR4_4_14it4itkylvdzrm.R.inc(5877);this.start = start;
        __CLR4_4_14it4itkylvdzrm.R.inc(5878);this.end = end;

        __CLR4_4_14it4itkylvdzrm.R.inc(5879);this.idx = start;
        __CLR4_4_14it4itkylvdzrm.R.inc(5880);this.mark = start;
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Returns the index in the character sequence to start reading from, taking into account its length.
     *
     * @return The start index in the character sequence (inclusive).
     */
    private int start() {try{__CLR4_4_14it4itkylvdzrm.R.inc(5881);
        __CLR4_4_14it4itkylvdzrm.R.inc(5882);return Math.min(charSequence.length(), start);
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Returns the index in the character sequence to end reading at, taking into account its length.
     *
     * @return The end index in the character sequence (exclusive).
     */
    private int end() {try{__CLR4_4_14it4itkylvdzrm.R.inc(5883);
        /*
         * end == null for de-serialized instances that were serialized before start and end were added.
         * Use Integer.MAX_VALUE to get the same behavior as before - use the entire CharSequence.
         */
        __CLR4_4_14it4itkylvdzrm.R.inc(5884);return Math.min(charSequence.length(), (((end == null )&&(__CLR4_4_14it4itkylvdzrm.R.iget(5885)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5886)==0&false))? Integer.MAX_VALUE : end);
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Close resets the file back to the start and removes any marked position.
     */
    @Override
    public void close() {try{__CLR4_4_14it4itkylvdzrm.R.inc(5887);
        __CLR4_4_14it4itkylvdzrm.R.inc(5888);idx = start;
        __CLR4_4_14it4itkylvdzrm.R.inc(5889);mark = start;
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Tells whether this stream is ready to be read.
     *
     * @return {@code true} if more characters from the character sequence are available, or {@code false} otherwise.
     */
    @Override
    public boolean ready() {try{__CLR4_4_14it4itkylvdzrm.R.inc(5890);
        __CLR4_4_14it4itkylvdzrm.R.inc(5891);return idx < end();
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Mark the current position.
     *
     * @param readAheadLimit ignored
     */
    @Override
    public void mark(final int readAheadLimit) {try{__CLR4_4_14it4itkylvdzrm.R.inc(5892);
        __CLR4_4_14it4itkylvdzrm.R.inc(5893);mark = idx;
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Mark is supported (returns true).
     *
     * @return {@code true}
     */
    @Override
    public boolean markSupported() {try{__CLR4_4_14it4itkylvdzrm.R.inc(5894);
        __CLR4_4_14it4itkylvdzrm.R.inc(5895);return true;
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Read a single character.
     *
     * @return the next character from the character sequence
     * or -1 if the end has been reached.
     */
    @Override
    public int read() {try{__CLR4_4_14it4itkylvdzrm.R.inc(5896);
        __CLR4_4_14it4itkylvdzrm.R.inc(5897);if ((((idx >= end())&&(__CLR4_4_14it4itkylvdzrm.R.iget(5898)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5899)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5900);return EOF;
        }
        }__CLR4_4_14it4itkylvdzrm.R.inc(5901);return charSequence.charAt(idx++);
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Read the specified number of characters into the array.
     *
     * @param array The array to store the characters in
     * @param offset The starting position in the array to store
     * @param length The maximum number of characters to read
     * @return The number of characters read or -1 if there are
     * no more
     */
    @Override
    public int read(final char[] array, final int offset, final int length) {try{__CLR4_4_14it4itkylvdzrm.R.inc(5902);
        __CLR4_4_14it4itkylvdzrm.R.inc(5903);if ((((idx >= end())&&(__CLR4_4_14it4itkylvdzrm.R.iget(5904)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5905)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5906);return EOF;
        }
        }__CLR4_4_14it4itkylvdzrm.R.inc(5907);Objects.requireNonNull(array, "array");
        __CLR4_4_14it4itkylvdzrm.R.inc(5908);if ((((length < 0 || offset < 0 || offset + length > array.length)&&(__CLR4_4_14it4itkylvdzrm.R.iget(5909)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5910)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5911);throw new IndexOutOfBoundsException("Array Size=" + array.length +
                    ", offset=" + offset + ", length=" + length);
        }

        }__CLR4_4_14it4itkylvdzrm.R.inc(5912);if ((((charSequence instanceof String)&&(__CLR4_4_14it4itkylvdzrm.R.iget(5913)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5914)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5915);final int count = Math.min(length, end() - idx);
            __CLR4_4_14it4itkylvdzrm.R.inc(5916);((String) charSequence).getChars(idx, idx + count, array, offset);
            __CLR4_4_14it4itkylvdzrm.R.inc(5917);idx += count;
            __CLR4_4_14it4itkylvdzrm.R.inc(5918);return count;
        }
        }__CLR4_4_14it4itkylvdzrm.R.inc(5919);if ((((charSequence instanceof StringBuilder)&&(__CLR4_4_14it4itkylvdzrm.R.iget(5920)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5921)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5922);final int count = Math.min(length, end() - idx);
            __CLR4_4_14it4itkylvdzrm.R.inc(5923);((StringBuilder) charSequence).getChars(idx, idx + count, array, offset);
            __CLR4_4_14it4itkylvdzrm.R.inc(5924);idx += count;
            __CLR4_4_14it4itkylvdzrm.R.inc(5925);return count;
        }
        }__CLR4_4_14it4itkylvdzrm.R.inc(5926);if ((((charSequence instanceof StringBuffer)&&(__CLR4_4_14it4itkylvdzrm.R.iget(5927)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5928)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5929);final int count = Math.min(length, end() - idx);
            __CLR4_4_14it4itkylvdzrm.R.inc(5930);((StringBuffer) charSequence).getChars(idx, idx + count, array, offset);
            __CLR4_4_14it4itkylvdzrm.R.inc(5931);idx += count;
            __CLR4_4_14it4itkylvdzrm.R.inc(5932);return count;
        }

        }__CLR4_4_14it4itkylvdzrm.R.inc(5933);int count = 0;
        __CLR4_4_14it4itkylvdzrm.R.inc(5934);for (int i = 0; (((i < length)&&(__CLR4_4_14it4itkylvdzrm.R.iget(5935)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5936)==0&false)); i++) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5937);final int c = read();
            __CLR4_4_14it4itkylvdzrm.R.inc(5938);if ((((c == EOF)&&(__CLR4_4_14it4itkylvdzrm.R.iget(5939)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5940)==0&false))) {{
                __CLR4_4_14it4itkylvdzrm.R.inc(5941);return count;
            }
            }__CLR4_4_14it4itkylvdzrm.R.inc(5942);array[offset + i] = (char)c;
            __CLR4_4_14it4itkylvdzrm.R.inc(5943);count++;
        }
        }__CLR4_4_14it4itkylvdzrm.R.inc(5944);return count;
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Reset the reader to the last marked position (or the beginning if
     * mark has not been called).
     */
    @Override
    public void reset() {try{__CLR4_4_14it4itkylvdzrm.R.inc(5945);
        __CLR4_4_14it4itkylvdzrm.R.inc(5946);idx = mark;
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Skip the specified number of characters.
     *
     * @param n The number of characters to skip
     * @return The actual number of characters skipped
     */
    @Override
    public long skip(final long n) {try{__CLR4_4_14it4itkylvdzrm.R.inc(5947);
        __CLR4_4_14it4itkylvdzrm.R.inc(5948);if ((((n < 0)&&(__CLR4_4_14it4itkylvdzrm.R.iget(5949)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5950)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5951);throw new IllegalArgumentException(
                    "Number of characters to skip is less than zero: " + n);
        }
        }__CLR4_4_14it4itkylvdzrm.R.inc(5952);if ((((idx >= end())&&(__CLR4_4_14it4itkylvdzrm.R.iget(5953)!=0|true))||(__CLR4_4_14it4itkylvdzrm.R.iget(5954)==0&false))) {{
            __CLR4_4_14it4itkylvdzrm.R.inc(5955);return 0;
        }
        }__CLR4_4_14it4itkylvdzrm.R.inc(5956);final int dest = (int)Math.min(end(), idx + n);
        __CLR4_4_14it4itkylvdzrm.R.inc(5957);final int count = dest - idx;
        __CLR4_4_14it4itkylvdzrm.R.inc(5958);idx = dest;
        __CLR4_4_14it4itkylvdzrm.R.inc(5959);return count;
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}

    /**
     * Return a String representation of the underlying
     * character sequence.
     *
     * @return The contents of the character sequence
     */
    @Override
    public String toString() {try{__CLR4_4_14it4itkylvdzrm.R.inc(5960);
        __CLR4_4_14it4itkylvdzrm.R.inc(5961);final CharSequence subSequence = charSequence.subSequence(start(), end());
        __CLR4_4_14it4itkylvdzrm.R.inc(5962);return subSequence.toString();
    }finally{__CLR4_4_14it4itkylvdzrm.R.flushNeeded();}}
}
