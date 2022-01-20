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
 * A decorating input stream that counts the number of bytes that have passed
 * through the stream so far.
 * <p>
 * A typical use case would be during debugging, to ensure that data is being
 * read as expected.
 * </p>
 */
public class CountingInputStream extends ProxyInputStream {public static class __CLR4_4_14np4npkylvdzta{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,6068,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The count of bytes that have passed. */
    private long count;

    /**
     * Constructs a new CountingInputStream.
     *
     * @param in  the InputStream to delegate to
     */
    public CountingInputStream(final InputStream in) {
        super(in);__CLR4_4_14np4npkylvdzta.R.inc(6038);try{__CLR4_4_14np4npkylvdzta.R.inc(6037);
    }finally{__CLR4_4_14np4npkylvdzta.R.flushNeeded();}}


    /**
     * Skips the stream over the specified number of bytes, adding the skipped
     * amount to the count.
     *
     * @param length  the number of bytes to skip
     * @return the actual number of bytes skipped
     * @throws IOException if an I/O error occurs.
     * @see java.io.InputStream#skip(long)
     */
    @Override
    public synchronized long skip(final long length) throws IOException {try{__CLR4_4_14np4npkylvdzta.R.inc(6039);
        __CLR4_4_14np4npkylvdzta.R.inc(6040);final long skip = super.skip(length);
        __CLR4_4_14np4npkylvdzta.R.inc(6041);this.count += skip;
        __CLR4_4_14np4npkylvdzta.R.inc(6042);return skip;
    }finally{__CLR4_4_14np4npkylvdzta.R.flushNeeded();}}

    /**
     * Adds the number of read bytes to the count.
     *
     * @param n number of bytes read, or -1 if no more bytes are available
     * @since 2.0
     */
    @Override
    protected synchronized void afterRead(final int n) {try{__CLR4_4_14np4npkylvdzta.R.inc(6043);
        __CLR4_4_14np4npkylvdzta.R.inc(6044);if ((((n != EOF)&&(__CLR4_4_14np4npkylvdzta.R.iget(6045)!=0|true))||(__CLR4_4_14np4npkylvdzta.R.iget(6046)==0&false))) {{
            __CLR4_4_14np4npkylvdzta.R.inc(6047);this.count += n;
        }
    }}finally{__CLR4_4_14np4npkylvdzta.R.flushNeeded();}}

    /**
     * The number of bytes that have passed through this stream.
     * <p>
     * NOTE: From v1.3 this method throws an ArithmeticException if the
     * count is greater than can be expressed by an {@code int}.
     * See {@link #getByteCount()} for a method using a {@code long}.
     *
     * @return the number of bytes accumulated
     * @throws ArithmeticException if the byte count is too large
     */
    public int getCount() {try{__CLR4_4_14np4npkylvdzta.R.inc(6048);
        __CLR4_4_14np4npkylvdzta.R.inc(6049);final long result = getByteCount();
        __CLR4_4_14np4npkylvdzta.R.inc(6050);if ((((result > Integer.MAX_VALUE)&&(__CLR4_4_14np4npkylvdzta.R.iget(6051)!=0|true))||(__CLR4_4_14np4npkylvdzta.R.iget(6052)==0&false))) {{
            __CLR4_4_14np4npkylvdzta.R.inc(6053);throw new ArithmeticException("The byte count " + result + " is too large to be converted to an int");
        }
        }__CLR4_4_14np4npkylvdzta.R.inc(6054);return (int) result;
    }finally{__CLR4_4_14np4npkylvdzta.R.flushNeeded();}}

    /**
     * Set the byte count back to 0.
     * <p>
     * NOTE: From v1.3 this method throws an ArithmeticException if the
     * count is greater than can be expressed by an {@code int}.
     * See {@link #resetByteCount()} for a method using a {@code long}.
     *
     * @return the count previous to resetting
     * @throws ArithmeticException if the byte count is too large
     */
    public int resetCount() {try{__CLR4_4_14np4npkylvdzta.R.inc(6055);
        __CLR4_4_14np4npkylvdzta.R.inc(6056);final long result = resetByteCount();
        __CLR4_4_14np4npkylvdzta.R.inc(6057);if ((((result > Integer.MAX_VALUE)&&(__CLR4_4_14np4npkylvdzta.R.iget(6058)!=0|true))||(__CLR4_4_14np4npkylvdzta.R.iget(6059)==0&false))) {{
            __CLR4_4_14np4npkylvdzta.R.inc(6060);throw new ArithmeticException("The byte count " + result + " is too large to be converted to an int");
        }
        }__CLR4_4_14np4npkylvdzta.R.inc(6061);return (int) result;
    }finally{__CLR4_4_14np4npkylvdzta.R.flushNeeded();}}

    /**
     * The number of bytes that have passed through this stream.
     * <p>
     * NOTE: This method is an alternative for {@code getCount()}
     * and was added because that method returns an integer which will
     * result in incorrect count for files over 2GB.
     *
     * @return the number of bytes accumulated
     * @since 1.3
     */
    public synchronized long getByteCount() {try{__CLR4_4_14np4npkylvdzta.R.inc(6062);
        __CLR4_4_14np4npkylvdzta.R.inc(6063);return this.count;
    }finally{__CLR4_4_14np4npkylvdzta.R.flushNeeded();}}

    /**
     * Set the byte count back to 0.
     * <p>
     * NOTE: This method is an alternative for {@code resetCount()}
     * and was added because that method returns an integer which will
     * result in incorrect count for files over 2GB.
     *
     * @return the count previous to resetting
     * @since 1.3
     */
    public synchronized long resetByteCount() {try{__CLR4_4_14np4npkylvdzta.R.inc(6064);
        __CLR4_4_14np4npkylvdzta.R.inc(6065);final long tmp = this.count;
        __CLR4_4_14np4npkylvdzta.R.inc(6066);this.count = 0;
        __CLR4_4_14np4npkylvdzta.R.inc(6067);return tmp;
    }finally{__CLR4_4_14np4npkylvdzta.R.flushNeeded();}}

}
