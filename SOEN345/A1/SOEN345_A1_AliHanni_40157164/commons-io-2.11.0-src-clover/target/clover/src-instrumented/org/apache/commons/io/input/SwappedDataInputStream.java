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

import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.EndianUtils;

/**
 * DataInput for systems relying on little endian data formats. When read, values will be changed from little endian to
 * big endian formats for internal usage.
 * <p>
 * <b>Origin of code: </b>Avalon Excalibur (IO)
 * </p>
 *
 */
public class SwappedDataInputStream extends ProxyInputStream implements DataInput {public static class __CLR4_4_15iv5ivkylvdzzk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,7201,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructs a SwappedDataInputStream.
     *
     * @param input InputStream to read from
     */
    public SwappedDataInputStream(final InputStream input) {
        super(input);__CLR4_4_15iv5ivkylvdzzk.R.inc(7160);try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7159);
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Return <code>{@link #readByte()} != 0</code>
     *
     * @return false if the byte read is zero, otherwise true
     * @throws IOException if an I/O error occurs.
     * @throws EOFException if an end of file is reached unexpectedly
     */
    @Override
    public boolean readBoolean() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7161);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7162);return 0 != readByte();
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read()} method.
     *
     * @return the byte read or -1 if the end of stream
     * @throws IOException if an I/O error occurs.
     * @throws EOFException if an end of file is reached unexpectedly
     */
    @Override
    public byte readByte() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7163);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7164);return (byte) in.read();
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Reads a character delegating to {@link #readShort()}.
     *
     * @return the byte read or -1 if the end of stream
     * @throws IOException if an I/O error occurs.
     * @throws EOFException if an end of file is reached unexpectedly
     */
    @Override
    public char readChar() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7165);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7166);return (char) readShort();
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Delegates to {@link EndianUtils#readSwappedDouble(InputStream)}.
     *
     * @return the read long
     * @throws IOException if an I/O error occurs.
     * @throws EOFException if an end of file is reached unexpectedly
     */
    @Override
    public double readDouble() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7167);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7168);return EndianUtils.readSwappedDouble(in);
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Delegates to {@link EndianUtils#readSwappedFloat(InputStream)}.
     *
     * @return the read long
     * @throws IOException if an I/O error occurs.
     * @throws EOFException if an end of file is reached unexpectedly
     */
    @Override
    public float readFloat() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7169);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7170);return EndianUtils.readSwappedFloat(in);
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read(byte[] data, int, int)} method.
     *
     * @param data the buffer to read the bytes into
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void readFully(final byte[] data) throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7171);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7172);readFully(data, 0, data.length);
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read(byte[] data, int, int)} method.
     *
     * @param data the buffer to read the bytes into
     * @param offset The start offset
     * @param length The number of bytes to read
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void readFully(final byte[] data, final int offset, final int length) throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7173);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7174);int remaining = length;

        __CLR4_4_15iv5ivkylvdzzk.R.inc(7175);while ((((remaining > 0)&&(__CLR4_4_15iv5ivkylvdzzk.R.iget(7176)!=0|true))||(__CLR4_4_15iv5ivkylvdzzk.R.iget(7177)==0&false))) {{
            __CLR4_4_15iv5ivkylvdzzk.R.inc(7178);final int location = offset + length - remaining;
            __CLR4_4_15iv5ivkylvdzzk.R.inc(7179);final int count = read(data, location, remaining);

            __CLR4_4_15iv5ivkylvdzzk.R.inc(7180);if ((((EOF == count)&&(__CLR4_4_15iv5ivkylvdzzk.R.iget(7181)!=0|true))||(__CLR4_4_15iv5ivkylvdzzk.R.iget(7182)==0&false))) {{
                __CLR4_4_15iv5ivkylvdzzk.R.inc(7183);throw new EOFException();
            }

            }__CLR4_4_15iv5ivkylvdzzk.R.inc(7184);remaining -= count;
        }
    }}finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Delegates to {@link EndianUtils#readSwappedInteger(InputStream)}.
     *
     * @return the read long
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int readInt() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7185);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7186);return EndianUtils.readSwappedInteger(in);
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Not currently supported - throws {@link UnsupportedOperationException}.
     *
     * @return the line read
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public String readLine() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7187);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7188);throw UnsupportedOperationExceptions.method("readLine");
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Delegates to {@link EndianUtils#readSwappedLong(InputStream)}.
     *
     * @return the read long
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public long readLong() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7189);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7190);return EndianUtils.readSwappedLong(in);
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Delegates to {@link EndianUtils#readSwappedShort(InputStream)}.
     *
     * @return the read long
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public short readShort() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7191);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7192);return EndianUtils.readSwappedShort(in);
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read()} method.
     *
     * @return the byte read or -1 if the end of stream
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int readUnsignedByte() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7193);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7194);return in.read();
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Delegates to {@link EndianUtils#readSwappedUnsignedShort(InputStream)}.
     *
     * @return the read long
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int readUnsignedShort() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7195);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7196);return EndianUtils.readSwappedUnsignedShort(in);
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Not currently supported - throws {@link UnsupportedOperationException}.
     *
     * @return UTF String read
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public String readUTF() throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7197);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7198);throw UnsupportedOperationExceptions.method("readUTF");
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code skip(int)} method.
     *
     * @param count the number of bytes to skip
     * @return the number of bytes to skipped or -1 if the end of stream
     * @throws EOFException if an end of file is reached unexpectedly
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int skipBytes(final int count) throws IOException, EOFException {try{__CLR4_4_15iv5ivkylvdzzk.R.inc(7199);
        __CLR4_4_15iv5ivkylvdzzk.R.inc(7200);return (int) in.skip(count);
    }finally{__CLR4_4_15iv5ivkylvdzzk.R.flushNeeded();}}

}
