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

/**
 * Proxy stream that closes and discards the underlying stream as soon as the
 * end of input has been reached or when the stream is explicitly closed.
 * Not even a reference to the underlying stream is kept after it has been
 * closed, so any allocated in-memory buffers can be freed even if the
 * client application still keeps a reference to the proxy stream.
 * <p>
 * This class is typically used to release any resources related to an open
 * stream as soon as possible even if the client application (by not explicitly
 * closing the stream when no longer needed) or the underlying stream (by not
 * releasing resources once the last byte has been read) do not do that.
 * </p>
 *
 * @since 1.4
 */
public class AutoCloseInputStream extends ProxyInputStream {public static class __CLR4_4_1458458kylvdzoq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Creates an automatically closing proxy for the given input stream.
     *
     * @param in underlying input stream
     */
    public AutoCloseInputStream(final InputStream in) {
        super(in);__CLR4_4_1458458kylvdzoq.R.inc(5373);try{__CLR4_4_1458458kylvdzoq.R.inc(5372);
    }finally{__CLR4_4_1458458kylvdzoq.R.flushNeeded();}}

    /**
     * Closes the underlying input stream and replaces the reference to it
     * with a {@link ClosedInputStream} instance.
     * <p>
     * This method is automatically called by the read methods when the end
     * of input has been reached.
     * <p>
     * Note that it is safe to call this method any number of times. The original
     * underlying input stream is closed and discarded only once when this
     * method is first called.
     *
     * @throws IOException if the underlying input stream can not be closed
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_1458458kylvdzoq.R.inc(5374);
        __CLR4_4_1458458kylvdzoq.R.inc(5375);in.close();
        __CLR4_4_1458458kylvdzoq.R.inc(5376);in = ClosedInputStream.CLOSED_INPUT_STREAM;
    }finally{__CLR4_4_1458458kylvdzoq.R.flushNeeded();}}

    /**
     * Automatically closes the stream if the end of stream was reached.
     *
     * @param n number of bytes read, or -1 if no more bytes are available
     * @throws IOException if the stream could not be closed
     * @since 2.0
     */
    @Override
    protected void afterRead(final int n) throws IOException {try{__CLR4_4_1458458kylvdzoq.R.inc(5377);
        __CLR4_4_1458458kylvdzoq.R.inc(5378);if ((((n == EOF)&&(__CLR4_4_1458458kylvdzoq.R.iget(5379)!=0|true))||(__CLR4_4_1458458kylvdzoq.R.iget(5380)==0&false))) {{
            __CLR4_4_1458458kylvdzoq.R.inc(5381);close();
        }
    }}finally{__CLR4_4_1458458kylvdzoq.R.flushNeeded();}}

    /**
     * Ensures that the stream is closed before it gets garbage-collected.
     * As mentioned in {@link #close()}, this is a no-op if the stream has
     * already been closed.
     * @throws Throwable if an error occurs
     */
    @Override
    protected void finalize() throws Throwable {try{__CLR4_4_1458458kylvdzoq.R.inc(5382);
        __CLR4_4_1458458kylvdzoq.R.inc(5383);close();
        __CLR4_4_1458458kylvdzoq.R.inc(5384);super.finalize();
    }finally{__CLR4_4_1458458kylvdzoq.R.flushNeeded();}}

}
