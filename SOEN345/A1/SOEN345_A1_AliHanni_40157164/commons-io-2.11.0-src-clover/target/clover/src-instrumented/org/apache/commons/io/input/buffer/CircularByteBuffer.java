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
package org.apache.commons.io.input.buffer;

import java.util.Objects;

import org.apache.commons.io.IOUtils;

/**
 * A buffer, which doesn't need reallocation of byte arrays, because it
 * reuses a single byte array. This works particularly well, if reading
 * from the buffer takes place at the same time than writing to. Such is the
 * case, for example, when using the buffer within a filtering input stream,
 * like the {@link CircularBufferInputStream}.
 */
public class CircularByteBuffer {public static class __CLR4_4_167t67tkylve05o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8179,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final byte[] buffer;
    private int startOffset;
    private int endOffset;
    private int currentNumberOfBytes;

    /**
     * Creates a new instance with the given buffer size.
     *
     * @param size the size of buffer to create
     */
    public CircularByteBuffer(final int size) {try{__CLR4_4_167t67tkylve05o.R.inc(8057);
        __CLR4_4_167t67tkylve05o.R.inc(8058);buffer = IOUtils.byteArray(size);
        __CLR4_4_167t67tkylve05o.R.inc(8059);startOffset = 0;
        __CLR4_4_167t67tkylve05o.R.inc(8060);endOffset = 0;
        __CLR4_4_167t67tkylve05o.R.inc(8061);currentNumberOfBytes = 0;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Creates a new instance with a reasonable default buffer size ({@link IOUtils#DEFAULT_BUFFER_SIZE}).
     */
    public CircularByteBuffer() {
        this(IOUtils.DEFAULT_BUFFER_SIZE);__CLR4_4_167t67tkylve05o.R.inc(8063);try{__CLR4_4_167t67tkylve05o.R.inc(8062);
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Returns the next byte from the buffer, removing it at the same time, so
     * that following invocations won't return it again.
     *
     * @return The byte, which is being returned.
     * @throws IllegalStateException The buffer is empty. Use {@link #hasBytes()},
     *                               or {@link #getCurrentNumberOfBytes()}, to prevent this exception.
     */
    public byte read() {try{__CLR4_4_167t67tkylve05o.R.inc(8064);
        __CLR4_4_167t67tkylve05o.R.inc(8065);if ((((currentNumberOfBytes <= 0)&&(__CLR4_4_167t67tkylve05o.R.iget(8066)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8067)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8068);throw new IllegalStateException("No bytes available.");
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8069);final byte b = buffer[startOffset];
        __CLR4_4_167t67tkylve05o.R.inc(8070);--currentNumberOfBytes;
        __CLR4_4_167t67tkylve05o.R.inc(8071);if ((((++startOffset == buffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8072)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8073)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8074);startOffset = 0;
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8075);return b;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Returns the given number of bytes from the buffer by storing them in
     * the given byte array at the given offset.
     *
     * @param targetBuffer The byte array, where to add bytes.
     * @param targetOffset The offset, where to store bytes in the byte array.
     * @param length The number of bytes to return.
     * @throws NullPointerException     The byte array {@code pBuffer} is null.
     * @throws IllegalArgumentException Either of {@code pOffset}, or {@code length} is negative,
     *                                  or the length of the byte array {@code targetBuffer} is too small.
     * @throws IllegalStateException    The buffer doesn't hold the given number
     *                                  of bytes. Use {@link #getCurrentNumberOfBytes()} to prevent this
     *                                  exception.
     */
    public void read(final byte[] targetBuffer, final int targetOffset, final int length) {try{__CLR4_4_167t67tkylve05o.R.inc(8076);
        __CLR4_4_167t67tkylve05o.R.inc(8077);Objects.requireNonNull(targetBuffer, "targetBuffer");
        __CLR4_4_167t67tkylve05o.R.inc(8078);if ((((targetOffset < 0 || targetOffset >= targetBuffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8079)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8080)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8081);throw new IllegalArgumentException("Invalid offset: " + targetOffset);
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8082);if ((((length < 0 || length > buffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8083)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8084)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8085);throw new IllegalArgumentException("Invalid length: " + length);
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8086);if ((((targetOffset + length > targetBuffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8087)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8088)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8089);throw new IllegalArgumentException("The supplied byte array contains only "
                    + targetBuffer.length + " bytes, but offset, and length would require "
                    + (targetOffset + length - 1));
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8090);if ((((currentNumberOfBytes < length)&&(__CLR4_4_167t67tkylve05o.R.iget(8091)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8092)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8093);throw new IllegalStateException("Currently, there are only " + currentNumberOfBytes
                    + "in the buffer, not " + length);
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8094);int offset = targetOffset;
        __CLR4_4_167t67tkylve05o.R.inc(8095);for (int i = 0; (((i < length)&&(__CLR4_4_167t67tkylve05o.R.iget(8096)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8097)==0&false)); i++) {{
            __CLR4_4_167t67tkylve05o.R.inc(8098);targetBuffer[offset++] = buffer[startOffset];
            __CLR4_4_167t67tkylve05o.R.inc(8099);--currentNumberOfBytes;
            __CLR4_4_167t67tkylve05o.R.inc(8100);if ((((++startOffset == buffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8101)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8102)==0&false))) {{
                __CLR4_4_167t67tkylve05o.R.inc(8103);startOffset = 0;
            }
        }}
    }}finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Adds a new byte to the buffer, which will eventually be returned by following
     * invocations of {@link #read()}.
     *
     * @param value The byte, which is being added to the buffer.
     * @throws IllegalStateException The buffer is full. Use {@link #hasSpace()},
     *                               or {@link #getSpace()}, to prevent this exception.
     */
    public void add(final byte value) {try{__CLR4_4_167t67tkylve05o.R.inc(8104);
        __CLR4_4_167t67tkylve05o.R.inc(8105);if ((((currentNumberOfBytes >= buffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8106)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8107)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8108);throw new IllegalStateException("No space available");
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8109);buffer[endOffset] = value;
        __CLR4_4_167t67tkylve05o.R.inc(8110);++currentNumberOfBytes;
        __CLR4_4_167t67tkylve05o.R.inc(8111);if ((((++endOffset == buffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8112)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8113)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8114);endOffset = 0;
        }
    }}finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Returns, whether the next bytes in the buffer are exactly those, given by
     * {@code sourceBuffer}, {@code offset}, and {@code length}. No bytes are being
     * removed from the buffer. If the result is true, then the following invocations
     * of {@link #read()} are guaranteed to return exactly those bytes.
     *
     * @param sourceBuffer the buffer to compare against
     * @param offset start offset
     * @param length length to compare
     * @return True, if the next invocations of {@link #read()} will return the
     * bytes at offsets {@code pOffset}+0, {@code pOffset}+1, ...,
     * {@code pOffset}+{@code length}-1 of byte array {@code pBuffer}.
     * @throws IllegalArgumentException Either of {@code pOffset}, or {@code length} is negative.
     * @throws NullPointerException     The byte array {@code pBuffer} is null.
     */
    public boolean peek(final byte[] sourceBuffer, final int offset, final int length) {try{__CLR4_4_167t67tkylve05o.R.inc(8115);
        __CLR4_4_167t67tkylve05o.R.inc(8116);Objects.requireNonNull(sourceBuffer, "Buffer");
        __CLR4_4_167t67tkylve05o.R.inc(8117);if ((((offset < 0 || offset >= sourceBuffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8118)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8119)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8120);throw new IllegalArgumentException("Invalid offset: " + offset);
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8121);if ((((length < 0 || length > buffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8122)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8123)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8124);throw new IllegalArgumentException("Invalid length: " + length);
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8125);if ((((length < currentNumberOfBytes)&&(__CLR4_4_167t67tkylve05o.R.iget(8126)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8127)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8128);return false;
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8129);int localOffset = startOffset;
        __CLR4_4_167t67tkylve05o.R.inc(8130);for (int i = 0; (((i < length)&&(__CLR4_4_167t67tkylve05o.R.iget(8131)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8132)==0&false)); i++) {{
            __CLR4_4_167t67tkylve05o.R.inc(8133);if ((((buffer[localOffset] != sourceBuffer[i + offset])&&(__CLR4_4_167t67tkylve05o.R.iget(8134)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8135)==0&false))) {{
                __CLR4_4_167t67tkylve05o.R.inc(8136);return false;
            }
            }__CLR4_4_167t67tkylve05o.R.inc(8137);if ((((++localOffset == buffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8138)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8139)==0&false))) {{
                __CLR4_4_167t67tkylve05o.R.inc(8140);localOffset = 0;
            }
        }}
        }__CLR4_4_167t67tkylve05o.R.inc(8141);return true;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Adds the given bytes to the buffer. This is the same as invoking {@link #add(byte)}
     * for the bytes at offsets {@code offset+0}, {@code offset+1}, ...,
     * {@code offset+length-1} of byte array {@code targetBuffer}.
     *
     * @param targetBuffer the buffer to copy
     * @param offset start offset
     * @param length length to copy
     * @throws IllegalStateException    The buffer doesn't have sufficient space. Use
     *                                  {@link #getSpace()} to prevent this exception.
     * @throws IllegalArgumentException Either of {@code offset}, or {@code length} is negative.
     * @throws NullPointerException     The byte array {@code pBuffer} is null.
     */
    public void add(final byte[] targetBuffer, final int offset, final int length) {try{__CLR4_4_167t67tkylve05o.R.inc(8142);
        __CLR4_4_167t67tkylve05o.R.inc(8143);Objects.requireNonNull(targetBuffer, "Buffer");
        __CLR4_4_167t67tkylve05o.R.inc(8144);if ((((offset < 0 || offset >= targetBuffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8145)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8146)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8147);throw new IllegalArgumentException("Invalid offset: " + offset);
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8148);if ((((length < 0)&&(__CLR4_4_167t67tkylve05o.R.iget(8149)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8150)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8151);throw new IllegalArgumentException("Invalid length: " + length);
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8152);if ((((currentNumberOfBytes + length > buffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8153)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8154)==0&false))) {{
            __CLR4_4_167t67tkylve05o.R.inc(8155);throw new IllegalStateException("No space available");
        }
        }__CLR4_4_167t67tkylve05o.R.inc(8156);for (int i = 0; (((i < length)&&(__CLR4_4_167t67tkylve05o.R.iget(8157)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8158)==0&false)); i++) {{
            __CLR4_4_167t67tkylve05o.R.inc(8159);buffer[endOffset] = targetBuffer[offset + i];
            __CLR4_4_167t67tkylve05o.R.inc(8160);if ((((++endOffset == buffer.length)&&(__CLR4_4_167t67tkylve05o.R.iget(8161)!=0|true))||(__CLR4_4_167t67tkylve05o.R.iget(8162)==0&false))) {{
                __CLR4_4_167t67tkylve05o.R.inc(8163);endOffset = 0;
            }
        }}
        }__CLR4_4_167t67tkylve05o.R.inc(8164);currentNumberOfBytes += length;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Returns, whether there is currently room for a single byte in the buffer.
     * Same as {@link #hasSpace(int) hasSpace(1)}.
     *
     * @return true if there is space for a byte
     * @see #hasSpace(int)
     * @see #getSpace()
     */
    public boolean hasSpace() {try{__CLR4_4_167t67tkylve05o.R.inc(8165);
        __CLR4_4_167t67tkylve05o.R.inc(8166);return currentNumberOfBytes < buffer.length;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Returns, whether there is currently room for the given number of bytes in the buffer.
     *
     * @param count the byte count
     * @return true if there is space for the given number of bytes
     * @see #hasSpace()
     * @see #getSpace()
     */
    public boolean hasSpace(final int count) {try{__CLR4_4_167t67tkylve05o.R.inc(8167);
        __CLR4_4_167t67tkylve05o.R.inc(8168);return currentNumberOfBytes + count <= buffer.length;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Returns, whether the buffer is currently holding, at least, a single byte.
     *
     * @return true if the buffer is not empty
     */
    public boolean hasBytes() {try{__CLR4_4_167t67tkylve05o.R.inc(8169);
        __CLR4_4_167t67tkylve05o.R.inc(8170);return currentNumberOfBytes > 0;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Returns the number of bytes, that can currently be added to the buffer.
     *
     * @return the number of bytes that can be added
     */
    public int getSpace() {try{__CLR4_4_167t67tkylve05o.R.inc(8171);
        __CLR4_4_167t67tkylve05o.R.inc(8172);return buffer.length - currentNumberOfBytes;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Returns the number of bytes, that are currently present in the buffer.
     *
     * @return the number of bytes
     */
    public int getCurrentNumberOfBytes() {try{__CLR4_4_167t67tkylve05o.R.inc(8173);
        __CLR4_4_167t67tkylve05o.R.inc(8174);return currentNumberOfBytes;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}

    /**
     * Removes all bytes from the buffer.
     */
    public void clear() {try{__CLR4_4_167t67tkylve05o.R.inc(8175);
        __CLR4_4_167t67tkylve05o.R.inc(8176);startOffset = 0;
        __CLR4_4_167t67tkylve05o.R.inc(8177);endOffset = 0;
        __CLR4_4_167t67tkylve05o.R.inc(8178);currentNumberOfBytes = 0;
    }finally{__CLR4_4_167t67tkylve05o.R.flushNeeded();}}
}
