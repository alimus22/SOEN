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

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * Implements a buffered input stream, which allows to peek into the buffers first bytes. This comes in handy when
 * manually implementing scanners, lexers, parsers, and the like.
 */
public class PeekableInputStream extends CircularBufferInputStream {public static class __CLR4_4_16b76b7kylve062{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8197,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Creates a new instance, which filters the given input stream, and uses the given buffer size.
     *
     * @param inputStream The input stream, which is being buffered.
     * @param bufferSize The size of the {@link CircularByteBuffer}, which is used internally.
     */
    public PeekableInputStream(final InputStream inputStream, final int bufferSize) {
        super(inputStream, bufferSize);__CLR4_4_16b76b7kylve062.R.inc(8180);try{__CLR4_4_16b76b7kylve062.R.inc(8179);
    }finally{__CLR4_4_16b76b7kylve062.R.flushNeeded();}}

    /**
     * Creates a new instance, which filters the given input stream, and uses a reasonable default buffer size (8192).
     *
     * @param inputStream The input stream, which is being buffered.
     */
    public PeekableInputStream(final InputStream inputStream) {
        super(inputStream);__CLR4_4_16b76b7kylve062.R.inc(8182);try{__CLR4_4_16b76b7kylve062.R.inc(8181);
    }finally{__CLR4_4_16b76b7kylve062.R.flushNeeded();}}

    /**
     * Returns whether the next bytes in the buffer are as given by {@code sourceBuffer}. This is equivalent to
     * {@link #peek(byte[], int, int)} with {@code offset} == 0, and {@code length} == {@code sourceBuffer.length}
     *
     * @param sourceBuffer the buffer to compare against
     * @return true if the next bytes are as given
     * @throws IOException Refilling the buffer failed.
     */
    public boolean peek(final byte[] sourceBuffer) throws IOException {try{__CLR4_4_16b76b7kylve062.R.inc(8183);
        __CLR4_4_16b76b7kylve062.R.inc(8184);Objects.requireNonNull(sourceBuffer, "sourceBuffer");
        __CLR4_4_16b76b7kylve062.R.inc(8185);return peek(sourceBuffer, 0, sourceBuffer.length);
    }finally{__CLR4_4_16b76b7kylve062.R.flushNeeded();}}

    /**
     * Returns whether the next bytes in the buffer are as given by {@code sourceBuffer}, {code offset}, and
     * {@code length}.
     *
     * @param sourceBuffer the buffer to compare against
     * @param offset the start offset
     * @param length the length to compare
     * @return true if the next bytes in the buffer are as given
     * @throws IOException if there is a problem calling fillBuffer()
     */
    public boolean peek(final byte[] sourceBuffer, final int offset, final int length) throws IOException {try{__CLR4_4_16b76b7kylve062.R.inc(8186);
        __CLR4_4_16b76b7kylve062.R.inc(8187);Objects.requireNonNull(sourceBuffer, "sourceBuffer");
        __CLR4_4_16b76b7kylve062.R.inc(8188);if ((((sourceBuffer.length > bufferSize)&&(__CLR4_4_16b76b7kylve062.R.iget(8189)!=0|true))||(__CLR4_4_16b76b7kylve062.R.iget(8190)==0&false))) {{
            __CLR4_4_16b76b7kylve062.R.inc(8191);throw new IllegalArgumentException("Peek request size of " + sourceBuffer.length
                + " bytes exceeds buffer size of " + bufferSize + " bytes");
        }
        }__CLR4_4_16b76b7kylve062.R.inc(8192);if ((((buffer.getCurrentNumberOfBytes() < sourceBuffer.length)&&(__CLR4_4_16b76b7kylve062.R.iget(8193)!=0|true))||(__CLR4_4_16b76b7kylve062.R.iget(8194)==0&false))) {{
            __CLR4_4_16b76b7kylve062.R.inc(8195);fillBuffer();
        }
        }__CLR4_4_16b76b7kylve062.R.inc(8196);return buffer.peek(sourceBuffer, offset, length);
    }finally{__CLR4_4_16b76b7kylve062.R.flushNeeded();}}
}
