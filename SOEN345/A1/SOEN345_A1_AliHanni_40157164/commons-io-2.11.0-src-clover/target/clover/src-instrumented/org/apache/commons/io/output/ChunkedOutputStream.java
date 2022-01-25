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

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * OutputStream which breaks larger output blocks into chunks.
 * Native code may need to copy the input array; if the write buffer
 * is very large this can cause OOME.
 *
 * @since 2.5
 */
public class ChunkedOutputStream extends FilterOutputStream {public static class __CLR4_4_16qk6qkkylve0b9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8751,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The default chunk size to use, i.e. {@value} bytes.
     */
    private static final int DEFAULT_CHUNK_SIZE = 1024 * 4;

    /**
     * The maximum chunk size to us when writing data arrays
     */
    private final int chunkSize;

    /**
     * Creates a new stream that uses the specified chunk size.
     *
     * @param stream the stream to wrap
     * @param chunkSize the chunk size to use; must be a positive number.
     * @throws IllegalArgumentException if the chunk size is &lt;= 0
     */
    public ChunkedOutputStream(final OutputStream stream, final int chunkSize) {
       super(stream);__CLR4_4_16qk6qkkylve0b9.R.inc(8733);try{__CLR4_4_16qk6qkkylve0b9.R.inc(8732);
       __CLR4_4_16qk6qkkylve0b9.R.inc(8734);if ((((chunkSize <= 0)&&(__CLR4_4_16qk6qkkylve0b9.R.iget(8735)!=0|true))||(__CLR4_4_16qk6qkkylve0b9.R.iget(8736)==0&false))) {{
           __CLR4_4_16qk6qkkylve0b9.R.inc(8737);throw new IllegalArgumentException();
       }
       }__CLR4_4_16qk6qkkylve0b9.R.inc(8738);this.chunkSize = chunkSize;
    }finally{__CLR4_4_16qk6qkkylve0b9.R.flushNeeded();}}

    /**
     * Creates a new stream that uses a chunk size of {@link #DEFAULT_CHUNK_SIZE}.
     *
     * @param stream the stream to wrap
     */
    public ChunkedOutputStream(final OutputStream stream) {
        this(stream, DEFAULT_CHUNK_SIZE);__CLR4_4_16qk6qkkylve0b9.R.inc(8740);try{__CLR4_4_16qk6qkkylve0b9.R.inc(8739);
    }finally{__CLR4_4_16qk6qkkylve0b9.R.flushNeeded();}}

    /**
     * Writes the data buffer in chunks to the underlying stream
     *
     * @param data the data to write
     * @param srcOffset the offset
     * @param length the length of data to write
     *
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final byte[] data, final int srcOffset, final int length) throws IOException {try{__CLR4_4_16qk6qkkylve0b9.R.inc(8741);
        __CLR4_4_16qk6qkkylve0b9.R.inc(8742);int bytes = length;
        __CLR4_4_16qk6qkkylve0b9.R.inc(8743);int dstOffset = srcOffset;
        __CLR4_4_16qk6qkkylve0b9.R.inc(8744);while((((bytes > 0)&&(__CLR4_4_16qk6qkkylve0b9.R.iget(8745)!=0|true))||(__CLR4_4_16qk6qkkylve0b9.R.iget(8746)==0&false))) {{
            __CLR4_4_16qk6qkkylve0b9.R.inc(8747);final int chunk = Math.min(bytes, chunkSize);
            __CLR4_4_16qk6qkkylve0b9.R.inc(8748);out.write(data, dstOffset, chunk);
            __CLR4_4_16qk6qkkylve0b9.R.inc(8749);bytes -= chunk;
            __CLR4_4_16qk6qkkylve0b9.R.inc(8750);dstOffset += chunk;
        }
    }}finally{__CLR4_4_16qk6qkkylve0b9.R.flushNeeded();}}

}
