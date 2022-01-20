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

import static org.apache.commons.io.IOUtils.EOF;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import org.apache.commons.io.IOUtils;

/**
 * Implements a buffered input stream, which is internally based on a {@link CircularByteBuffer}. Unlike the
 * {@link java.io.BufferedInputStream}, this one doesn't need to reallocate byte arrays internally.
 */
public class CircularBufferInputStream extends InputStream {public static class __CLR4_4_165v65vkylve057{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8057,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** What we are streaming, used to fill the internal buffer. */
    protected final InputStream in;

    /** Internal buffer. */
    protected final CircularByteBuffer buffer;

    /** Internal buffer size. */
    protected final int bufferSize;

    /** Whether we've see the input stream EOF. */
    private boolean eof;

    /**
     * Creates a new instance, which filters the given input stream, and uses the given buffer size.
     *
     * @param inputStream The input stream, which is being buffered.
     * @param bufferSize The size of the {@link CircularByteBuffer}, which is used internally.
     */
    public CircularBufferInputStream(final InputStream inputStream, final int bufferSize) {try{__CLR4_4_165v65vkylve057.R.inc(7987);
        __CLR4_4_165v65vkylve057.R.inc(7988);if ((((bufferSize <= 0)&&(__CLR4_4_165v65vkylve057.R.iget(7989)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(7990)==0&false))) {{
            __CLR4_4_165v65vkylve057.R.inc(7991);throw new IllegalArgumentException("Invalid bufferSize: " + bufferSize);
        }
        }__CLR4_4_165v65vkylve057.R.inc(7992);this.in = Objects.requireNonNull(inputStream, "inputStream");
        __CLR4_4_165v65vkylve057.R.inc(7993);this.buffer = new CircularByteBuffer(bufferSize);
        __CLR4_4_165v65vkylve057.R.inc(7994);this.bufferSize = bufferSize;
        __CLR4_4_165v65vkylve057.R.inc(7995);this.eof = false;
    }finally{__CLR4_4_165v65vkylve057.R.flushNeeded();}}

    /**
     * Creates a new instance, which filters the given input stream, and uses a reasonable default buffer size
     * ({@link IOUtils#DEFAULT_BUFFER_SIZE}).
     *
     * @param inputStream The input stream, which is being buffered.
     */
    public CircularBufferInputStream(final InputStream inputStream) {
        this(inputStream, IOUtils.DEFAULT_BUFFER_SIZE);__CLR4_4_165v65vkylve057.R.inc(7997);try{__CLR4_4_165v65vkylve057.R.inc(7996);
    }finally{__CLR4_4_165v65vkylve057.R.flushNeeded();}}

    /**
     * Fills the buffer with the contents of the input stream.
     *
     * @throws IOException in case of an error while reading from the input stream.
     */
    protected void fillBuffer() throws IOException {try{__CLR4_4_165v65vkylve057.R.inc(7998);
        __CLR4_4_165v65vkylve057.R.inc(7999);if ((((eof)&&(__CLR4_4_165v65vkylve057.R.iget(8000)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8001)==0&false))) {{
            __CLR4_4_165v65vkylve057.R.inc(8002);return;
        }
        }__CLR4_4_165v65vkylve057.R.inc(8003);int space = buffer.getSpace();
        __CLR4_4_165v65vkylve057.R.inc(8004);final byte[] buf = IOUtils.byteArray(space);
        __CLR4_4_165v65vkylve057.R.inc(8005);while ((((space > 0)&&(__CLR4_4_165v65vkylve057.R.iget(8006)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8007)==0&false))) {{
            __CLR4_4_165v65vkylve057.R.inc(8008);final int res = in.read(buf, 0, space);
            __CLR4_4_165v65vkylve057.R.inc(8009);if ((((res == EOF)&&(__CLR4_4_165v65vkylve057.R.iget(8010)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8011)==0&false))) {{
                __CLR4_4_165v65vkylve057.R.inc(8012);eof = true;
                __CLR4_4_165v65vkylve057.R.inc(8013);return;
            }
            }__CLR4_4_165v65vkylve057.R.inc(8014);if ((((res > 0)&&(__CLR4_4_165v65vkylve057.R.iget(8015)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8016)==0&false))) {{
                __CLR4_4_165v65vkylve057.R.inc(8017);buffer.add(buf, 0, res);
                __CLR4_4_165v65vkylve057.R.inc(8018);space -= res;
            }
        }}
    }}finally{__CLR4_4_165v65vkylve057.R.flushNeeded();}}

    /**
     * Fills the buffer from the input stream until the given number of bytes have been added to the buffer.
     *
     * @param count number of byte to fill into the buffer
     * @return true if the buffer has bytes
     * @throws IOException in case of an error while reading from the input stream.
     */
    protected boolean haveBytes(final int count) throws IOException {try{__CLR4_4_165v65vkylve057.R.inc(8019);
        __CLR4_4_165v65vkylve057.R.inc(8020);if ((((buffer.getCurrentNumberOfBytes() < count)&&(__CLR4_4_165v65vkylve057.R.iget(8021)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8022)==0&false))) {{
            __CLR4_4_165v65vkylve057.R.inc(8023);fillBuffer();
        }
        }__CLR4_4_165v65vkylve057.R.inc(8024);return buffer.hasBytes();
    }finally{__CLR4_4_165v65vkylve057.R.flushNeeded();}}

    @Override
    public int read() throws IOException {try{__CLR4_4_165v65vkylve057.R.inc(8025);
        __CLR4_4_165v65vkylve057.R.inc(8026);if ((((!haveBytes(1))&&(__CLR4_4_165v65vkylve057.R.iget(8027)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8028)==0&false))) {{
            __CLR4_4_165v65vkylve057.R.inc(8029);return EOF;
        }
        }__CLR4_4_165v65vkylve057.R.inc(8030);return buffer.read() & 0xFF; // return unsigned byte
    }finally{__CLR4_4_165v65vkylve057.R.flushNeeded();}}

    @Override
    public int read(final byte[] buffer) throws IOException {try{__CLR4_4_165v65vkylve057.R.inc(8031);
        __CLR4_4_165v65vkylve057.R.inc(8032);return read(buffer, 0, buffer.length);
    }finally{__CLR4_4_165v65vkylve057.R.flushNeeded();}}

    @Override
    public int read(final byte[] targetBuffer, final int offset, final int length) throws IOException {try{__CLR4_4_165v65vkylve057.R.inc(8033);
        __CLR4_4_165v65vkylve057.R.inc(8034);Objects.requireNonNull(targetBuffer, "targetBuffer");
        __CLR4_4_165v65vkylve057.R.inc(8035);if ((((offset < 0)&&(__CLR4_4_165v65vkylve057.R.iget(8036)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8037)==0&false))) {{
            __CLR4_4_165v65vkylve057.R.inc(8038);throw new IllegalArgumentException("Offset must not be negative");
        }
        }__CLR4_4_165v65vkylve057.R.inc(8039);if ((((length < 0)&&(__CLR4_4_165v65vkylve057.R.iget(8040)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8041)==0&false))) {{
            __CLR4_4_165v65vkylve057.R.inc(8042);throw new IllegalArgumentException("Length must not be negative");
        }
        }__CLR4_4_165v65vkylve057.R.inc(8043);if ((((!haveBytes(length))&&(__CLR4_4_165v65vkylve057.R.iget(8044)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8045)==0&false))) {{
            __CLR4_4_165v65vkylve057.R.inc(8046);return EOF;
        }
        }__CLR4_4_165v65vkylve057.R.inc(8047);final int result = Math.min(length, buffer.getCurrentNumberOfBytes());
        __CLR4_4_165v65vkylve057.R.inc(8048);for (int i = 0; (((i < result)&&(__CLR4_4_165v65vkylve057.R.iget(8049)!=0|true))||(__CLR4_4_165v65vkylve057.R.iget(8050)==0&false)); i++) {{
            __CLR4_4_165v65vkylve057.R.inc(8051);targetBuffer[offset + i] = buffer.read();
        }
        }__CLR4_4_165v65vkylve057.R.inc(8052);return result;
    }finally{__CLR4_4_165v65vkylve057.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_4_165v65vkylve057.R.inc(8053);
        __CLR4_4_165v65vkylve057.R.inc(8054);in.close();
        __CLR4_4_165v65vkylve057.R.inc(8055);eof = true;
        __CLR4_4_165v65vkylve057.R.inc(8056);buffer.clear();
    }finally{__CLR4_4_165v65vkylve057.R.flushNeeded();}}
}
