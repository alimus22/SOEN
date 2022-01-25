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
 * This is a stream that will only supply bytes up to a certain length - if its
 * position goes above that, it will stop.
 * <p>
 * This is useful to wrap ServletInputStreams. The ServletInputStream will block
 * if you try to read content from it that isn't there, because it doesn't know
 * whether the content hasn't arrived yet or whether the content has finished.
 * So, one of these, initialized with the Content-length sent in the
 * ServletInputStream's header, will stop it blocking, providing it's been sent
 * with a correct content length.
 * </p>
 *
 * @since 2.0
 */
public class BoundedInputStream extends InputStream {public static class __CLR4_4_1491491kylvdzpu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** the wrapped input stream */
    private final InputStream in;

    /** the max length to provide */
    private final long max;

    /** the number of bytes already returned */
    private long pos;

    /** the marked position */
    private long mark = EOF;

    /** flag if close should be propagated */
    private boolean propagateClose = true;

    /**
     * Creates a new {@code BoundedInputStream} that wraps the given input
     * stream and limits it to a certain size.
     *
     * @param in The wrapped input stream
     * @param size The maximum number of bytes to return
     */
    public BoundedInputStream(final InputStream in, final long size) {try{__CLR4_4_1491491kylvdzpu.R.inc(5509);
        // Some badly designed methods - eg the servlet API - overload length
        // such that "-1" means stream finished
        __CLR4_4_1491491kylvdzpu.R.inc(5510);this.max = size;
        __CLR4_4_1491491kylvdzpu.R.inc(5511);this.in = in;
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Creates a new {@code BoundedInputStream} that wraps the given input
     * stream and is unlimited.
     *
     * @param in The wrapped input stream
     */
    public BoundedInputStream(final InputStream in) {
        this(in, EOF);__CLR4_4_1491491kylvdzpu.R.inc(5513);try{__CLR4_4_1491491kylvdzpu.R.inc(5512);
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read()} method if
     * the current position is less than the limit.
     * @return the byte read or -1 if the end of stream or
     * the limit has been reached.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_1491491kylvdzpu.R.inc(5514);
        __CLR4_4_1491491kylvdzpu.R.inc(5515);if ((((max >= 0 && pos >= max)&&(__CLR4_4_1491491kylvdzpu.R.iget(5516)!=0|true))||(__CLR4_4_1491491kylvdzpu.R.iget(5517)==0&false))) {{
            __CLR4_4_1491491kylvdzpu.R.inc(5518);return EOF;
        }
        }__CLR4_4_1491491kylvdzpu.R.inc(5519);final int result = in.read();
        __CLR4_4_1491491kylvdzpu.R.inc(5520);pos++;
        __CLR4_4_1491491kylvdzpu.R.inc(5521);return result;
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read(byte[])} method.
     * @param b the buffer to read the bytes into
     * @return the number of bytes read or -1 if the end of stream or
     * the limit has been reached.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read(final byte[] b) throws IOException {try{__CLR4_4_1491491kylvdzpu.R.inc(5522);
        __CLR4_4_1491491kylvdzpu.R.inc(5523);return this.read(b, 0, b.length);
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read(byte[], int, int)} method.
     * @param b the buffer to read the bytes into
     * @param off The start offset
     * @param len The number of bytes to read
     * @return the number of bytes read or -1 if the end of stream or
     * the limit has been reached.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {try{__CLR4_4_1491491kylvdzpu.R.inc(5524);
        __CLR4_4_1491491kylvdzpu.R.inc(5525);if ((((max>=0 && pos>=max)&&(__CLR4_4_1491491kylvdzpu.R.iget(5526)!=0|true))||(__CLR4_4_1491491kylvdzpu.R.iget(5527)==0&false))) {{
            __CLR4_4_1491491kylvdzpu.R.inc(5528);return EOF;
        }
        }__CLR4_4_1491491kylvdzpu.R.inc(5529);final long maxRead = (((max>=0 )&&(__CLR4_4_1491491kylvdzpu.R.iget(5530)!=0|true))||(__CLR4_4_1491491kylvdzpu.R.iget(5531)==0&false))? Math.min(len, max-pos) : len;
        __CLR4_4_1491491kylvdzpu.R.inc(5532);final int bytesRead = in.read(b, off, (int)maxRead);

        __CLR4_4_1491491kylvdzpu.R.inc(5533);if ((((bytesRead==EOF)&&(__CLR4_4_1491491kylvdzpu.R.iget(5534)!=0|true))||(__CLR4_4_1491491kylvdzpu.R.iget(5535)==0&false))) {{
            __CLR4_4_1491491kylvdzpu.R.inc(5536);return EOF;
        }

        }__CLR4_4_1491491kylvdzpu.R.inc(5537);pos+=bytesRead;
        __CLR4_4_1491491kylvdzpu.R.inc(5538);return bytesRead;
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code skip(long)} method.
     * @param n the number of bytes to skip
     * @return the actual number of bytes skipped
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public long skip(final long n) throws IOException {try{__CLR4_4_1491491kylvdzpu.R.inc(5539);
        __CLR4_4_1491491kylvdzpu.R.inc(5540);final long toSkip = (((max>=0 )&&(__CLR4_4_1491491kylvdzpu.R.iget(5541)!=0|true))||(__CLR4_4_1491491kylvdzpu.R.iget(5542)==0&false))? Math.min(n, max-pos) : n;
        __CLR4_4_1491491kylvdzpu.R.inc(5543);final long skippedBytes = in.skip(toSkip);
        __CLR4_4_1491491kylvdzpu.R.inc(5544);pos+=skippedBytes;
        __CLR4_4_1491491kylvdzpu.R.inc(5545);return skippedBytes;
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int available() throws IOException {try{__CLR4_4_1491491kylvdzpu.R.inc(5546);
        __CLR4_4_1491491kylvdzpu.R.inc(5547);if ((((max>=0 && pos>=max)&&(__CLR4_4_1491491kylvdzpu.R.iget(5548)!=0|true))||(__CLR4_4_1491491kylvdzpu.R.iget(5549)==0&false))) {{
            __CLR4_4_1491491kylvdzpu.R.inc(5550);return 0;
        }
        }__CLR4_4_1491491kylvdzpu.R.inc(5551);return in.available();
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code toString()} method.
     * @return the delegate's {@code toString()}
     */
    @Override
    public String toString() {try{__CLR4_4_1491491kylvdzpu.R.inc(5552);
        __CLR4_4_1491491kylvdzpu.R.inc(5553);return in.toString();
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code close()} method
     * if {@link #isPropagateClose()} is {@code true}.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_1491491kylvdzpu.R.inc(5554);
        __CLR4_4_1491491kylvdzpu.R.inc(5555);if ((((propagateClose)&&(__CLR4_4_1491491kylvdzpu.R.iget(5556)!=0|true))||(__CLR4_4_1491491kylvdzpu.R.iget(5557)==0&false))) {{
            __CLR4_4_1491491kylvdzpu.R.inc(5558);in.close();
        }
    }}finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code reset()} method.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public synchronized void reset() throws IOException {try{__CLR4_4_1491491kylvdzpu.R.inc(5559);
        __CLR4_4_1491491kylvdzpu.R.inc(5560);in.reset();
        __CLR4_4_1491491kylvdzpu.R.inc(5561);pos = mark;
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code mark(int)} method.
     * @param readlimit read ahead limit
     */
    @Override
    public synchronized void mark(final int readlimit) {try{__CLR4_4_1491491kylvdzpu.R.inc(5562);
        __CLR4_4_1491491kylvdzpu.R.inc(5563);in.mark(readlimit);
        __CLR4_4_1491491kylvdzpu.R.inc(5564);mark = pos;
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code markSupported()} method.
     * @return true if mark is supported, otherwise false
     */
    @Override
    public boolean markSupported() {try{__CLR4_4_1491491kylvdzpu.R.inc(5565);
        __CLR4_4_1491491kylvdzpu.R.inc(5566);return in.markSupported();
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Indicates whether the {@link #close()} method
     * should propagate to the underling {@link InputStream}.
     *
     * @return {@code true} if calling {@link #close()}
     * propagates to the {@code close()} method of the
     * underlying stream or {@code false} if it does not.
     */
    public boolean isPropagateClose() {try{__CLR4_4_1491491kylvdzpu.R.inc(5567);
        __CLR4_4_1491491kylvdzpu.R.inc(5568);return propagateClose;
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}

    /**
     * Set whether the {@link #close()} method
     * should propagate to the underling {@link InputStream}.
     *
     * @param propagateClose {@code true} if calling
     * {@link #close()} propagates to the {@code close()}
     * method of the underlying stream or
     * {@code false} if it does not.
     */
    public void setPropagateClose(final boolean propagateClose) {try{__CLR4_4_1491491kylvdzpu.R.inc(5569);
        __CLR4_4_1491491kylvdzpu.R.inc(5570);this.propagateClose = propagateClose;
    }finally{__CLR4_4_1491491kylvdzpu.R.flushNeeded();}}
}
