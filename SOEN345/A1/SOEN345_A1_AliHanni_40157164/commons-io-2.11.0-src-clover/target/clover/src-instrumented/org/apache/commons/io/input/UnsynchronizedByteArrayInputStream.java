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

import java.io.InputStream;
import java.util.Objects;

import static java.lang.Math.min;

/**
 * This is an alternative to {@link java.io.ByteArrayInputStream}
 * which removes the synchronization overhead for non-concurrent
 * access; as such this class is not thread-safe.
 *
 * @since 2.7
 */
//@NotThreadSafe
public class UnsynchronizedByteArrayInputStream extends InputStream {public static class __CLR4_4_15t95t9kylve02v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,7616,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The end of stream marker.
     */
    public static final int END_OF_STREAM = -1;

    /**
     * The underlying data buffer.
     */
    private final byte[] data;

    /**
     * End Of Data.
     *
     * Similar to data.length,
     * i.e. the last readable offset + 1.
     */
    private final int eod;

    /**
     * Current offset in the data buffer.
     */
    private int offset;

    /**
     * The current mark (if any).
     */
    private int markedOffset;

    /**
     * Creates a new byte array input stream.
     *
     * @param data the buffer
     */
    public UnsynchronizedByteArrayInputStream(final byte[] data) {try{__CLR4_4_15t95t9kylve02v.R.inc(7533);
        __CLR4_4_15t95t9kylve02v.R.inc(7534);this.data = Objects.requireNonNull(data, "data");
        __CLR4_4_15t95t9kylve02v.R.inc(7535);this.offset = 0;
        __CLR4_4_15t95t9kylve02v.R.inc(7536);this.eod = data.length;
        __CLR4_4_15t95t9kylve02v.R.inc(7537);this.markedOffset = this.offset;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}

    /**
     * Creates a new byte array input stream.
     *
     * @param data the buffer
     * @param offset the offset into the buffer
     *
     * @throws IllegalArgumentException if the offset is less than zero
     */
    public UnsynchronizedByteArrayInputStream(final byte[] data, final int offset) {try{__CLR4_4_15t95t9kylve02v.R.inc(7538);
        __CLR4_4_15t95t9kylve02v.R.inc(7539);Objects.requireNonNull(data, "data");
        __CLR4_4_15t95t9kylve02v.R.inc(7540);if ((((offset < 0)&&(__CLR4_4_15t95t9kylve02v.R.iget(7541)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7542)==0&false))) {{
            __CLR4_4_15t95t9kylve02v.R.inc(7543);throw new IllegalArgumentException("offset cannot be negative");
        }
        }__CLR4_4_15t95t9kylve02v.R.inc(7544);this.data = data;
        __CLR4_4_15t95t9kylve02v.R.inc(7545);this.offset = min(offset, (((data.length > 0 )&&(__CLR4_4_15t95t9kylve02v.R.iget(7546)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7547)==0&false))? data.length : offset);
        __CLR4_4_15t95t9kylve02v.R.inc(7548);this.eod = data.length;
        __CLR4_4_15t95t9kylve02v.R.inc(7549);this.markedOffset = this.offset;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}


    /**
     * Creates a new byte array input stream.
     *
     * @param data the buffer
     * @param offset the offset into the buffer
     * @param length the length of the buffer
     *
     * @throws IllegalArgumentException if the offset or length less than zero
     */
    public UnsynchronizedByteArrayInputStream(final byte[] data, final int offset, final int length) {try{__CLR4_4_15t95t9kylve02v.R.inc(7550);
        __CLR4_4_15t95t9kylve02v.R.inc(7551);if ((((offset < 0)&&(__CLR4_4_15t95t9kylve02v.R.iget(7552)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7553)==0&false))) {{
            __CLR4_4_15t95t9kylve02v.R.inc(7554);throw new IllegalArgumentException("offset cannot be negative");
        }
        }__CLR4_4_15t95t9kylve02v.R.inc(7555);if ((((length < 0)&&(__CLR4_4_15t95t9kylve02v.R.iget(7556)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7557)==0&false))) {{
            __CLR4_4_15t95t9kylve02v.R.inc(7558);throw new IllegalArgumentException("length cannot be negative");
        }
        }__CLR4_4_15t95t9kylve02v.R.inc(7559);this.data = Objects.requireNonNull(data, "data");
        __CLR4_4_15t95t9kylve02v.R.inc(7560);this.offset = min(offset, (((data.length > 0 )&&(__CLR4_4_15t95t9kylve02v.R.iget(7561)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7562)==0&false))? data.length : offset);
        __CLR4_4_15t95t9kylve02v.R.inc(7563);this.eod = min(this.offset + length, data.length);
        __CLR4_4_15t95t9kylve02v.R.inc(7564);this.markedOffset = this.offset;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}

    @Override
    public int available() {try{__CLR4_4_15t95t9kylve02v.R.inc(7565);
        __CLR4_4_15t95t9kylve02v.R.inc(7566);return (((offset < eod )&&(__CLR4_4_15t95t9kylve02v.R.iget(7567)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7568)==0&false))? eod - offset : 0;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}

    @Override
    public int read() {try{__CLR4_4_15t95t9kylve02v.R.inc(7569);
        __CLR4_4_15t95t9kylve02v.R.inc(7570);return (((offset < eod )&&(__CLR4_4_15t95t9kylve02v.R.iget(7571)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7572)==0&false))? data[offset++] & 0xff : END_OF_STREAM;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}

    @Override
    public int read(final byte[] dest) {try{__CLR4_4_15t95t9kylve02v.R.inc(7573);
        __CLR4_4_15t95t9kylve02v.R.inc(7574);Objects.requireNonNull(dest, "dest");
        __CLR4_4_15t95t9kylve02v.R.inc(7575);return read(dest, 0, dest.length);
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}

    @Override
    public int read(final byte[] dest, final int off, final int len) {try{__CLR4_4_15t95t9kylve02v.R.inc(7576);
        __CLR4_4_15t95t9kylve02v.R.inc(7577);Objects.requireNonNull(dest, "dest");
        __CLR4_4_15t95t9kylve02v.R.inc(7578);if ((((off < 0 || len < 0 || off + len > dest.length)&&(__CLR4_4_15t95t9kylve02v.R.iget(7579)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7580)==0&false))) {{
            __CLR4_4_15t95t9kylve02v.R.inc(7581);throw new IndexOutOfBoundsException();
        }

        }__CLR4_4_15t95t9kylve02v.R.inc(7582);if ((((offset >= eod)&&(__CLR4_4_15t95t9kylve02v.R.iget(7583)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7584)==0&false))) {{
            __CLR4_4_15t95t9kylve02v.R.inc(7585);return END_OF_STREAM;
        }

        }__CLR4_4_15t95t9kylve02v.R.inc(7586);int actualLen = eod - offset;
        __CLR4_4_15t95t9kylve02v.R.inc(7587);if ((((len < actualLen)&&(__CLR4_4_15t95t9kylve02v.R.iget(7588)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7589)==0&false))) {{
            __CLR4_4_15t95t9kylve02v.R.inc(7590);actualLen = len;
        }
        }__CLR4_4_15t95t9kylve02v.R.inc(7591);if ((((actualLen <= 0)&&(__CLR4_4_15t95t9kylve02v.R.iget(7592)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7593)==0&false))) {{
            __CLR4_4_15t95t9kylve02v.R.inc(7594);return 0;
        }
        }__CLR4_4_15t95t9kylve02v.R.inc(7595);System.arraycopy(data, offset, dest, off, actualLen);
        __CLR4_4_15t95t9kylve02v.R.inc(7596);offset += actualLen;
        __CLR4_4_15t95t9kylve02v.R.inc(7597);return actualLen;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}

    @Override
    public long skip(final long n) {try{__CLR4_4_15t95t9kylve02v.R.inc(7598);
        __CLR4_4_15t95t9kylve02v.R.inc(7599);if ((((n < 0)&&(__CLR4_4_15t95t9kylve02v.R.iget(7600)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7601)==0&false))) {{
            __CLR4_4_15t95t9kylve02v.R.inc(7602);throw new IllegalArgumentException("Skipping backward is not supported");
        }

        }__CLR4_4_15t95t9kylve02v.R.inc(7603);long actualSkip = eod - offset;
        __CLR4_4_15t95t9kylve02v.R.inc(7604);if ((((n < actualSkip)&&(__CLR4_4_15t95t9kylve02v.R.iget(7605)!=0|true))||(__CLR4_4_15t95t9kylve02v.R.iget(7606)==0&false))) {{
            __CLR4_4_15t95t9kylve02v.R.inc(7607);actualSkip = n;
        }

        }__CLR4_4_15t95t9kylve02v.R.inc(7608);offset += actualSkip;
        __CLR4_4_15t95t9kylve02v.R.inc(7609);return actualSkip;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}

    @Override
    public boolean markSupported() {try{__CLR4_4_15t95t9kylve02v.R.inc(7610);
        __CLR4_4_15t95t9kylve02v.R.inc(7611);return true;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}

    @SuppressWarnings("sync-override")
    @Override
    public void mark(final int readlimit) {try{__CLR4_4_15t95t9kylve02v.R.inc(7612);
        __CLR4_4_15t95t9kylve02v.R.inc(7613);this.markedOffset = this.offset;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}

    @SuppressWarnings("sync-override")
    @Override
    public void reset() {try{__CLR4_4_15t95t9kylve02v.R.inc(7614);
        __CLR4_4_15t95t9kylve02v.R.inc(7615);this.offset = this.markedOffset;
    }finally{__CLR4_4_15t95t9kylve02v.R.flushNeeded();}}
}
