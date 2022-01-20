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
package org.apache.commons.io;

import static org.apache.commons.io.IOUtils.EOF;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Utility code for dealing with different endian systems.
 * <p>
 * Different computer architectures adopt different conventions for
 * byte ordering. In so-called "Little Endian" architectures (eg Intel),
 * the low-order byte is stored in memory at the lowest address, and
 * subsequent bytes at higher addresses. For "Big Endian" architectures
 * (eg Motorola), the situation is reversed.
 * This class helps you solve this incompatibility.
 * <p>
 * Origin of code: Excalibur
 *
 * @see org.apache.commons.io.input.SwappedDataInputStream
 */
public class EndianUtils {public static class __CLR4_4_16j6jkylvdyel{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,344,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Instances should NOT be constructed in standard programming.
     */
    public EndianUtils() {try{__CLR4_4_16j6jkylvdyel.R.inc(235);
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    // ========================================== Swapping routines

    /**
     * Converts a "short" value between endian systems.
     * @param value value to convert
     * @return the converted value
     */
    public static short swapShort(final short value) {try{__CLR4_4_16j6jkylvdyel.R.inc(236);
        __CLR4_4_16j6jkylvdyel.R.inc(237);return (short) ( ( ( ( value >> 0 ) & 0xff ) << 8 ) +
            ( ( ( value >> 8 ) & 0xff ) << 0 ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Converts a "int" value between endian systems.
     * @param value value to convert
     * @return the converted value
     */
    public static int swapInteger(final int value) {try{__CLR4_4_16j6jkylvdyel.R.inc(238);
        __CLR4_4_16j6jkylvdyel.R.inc(239);return
            ( ( ( value >> 0 ) & 0xff ) << 24 ) +
            ( ( ( value >> 8 ) & 0xff ) << 16 ) +
            ( ( ( value >> 16 ) & 0xff ) << 8 ) +
            ( ( ( value >> 24 ) & 0xff ) << 0 );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Converts a "long" value between endian systems.
     * @param value value to convert
     * @return the converted value
     */
    public static long swapLong(final long value) {try{__CLR4_4_16j6jkylvdyel.R.inc(240);
        __CLR4_4_16j6jkylvdyel.R.inc(241);return
            ( ( ( value >> 0 ) & 0xff ) << 56 ) +
            ( ( ( value >> 8 ) & 0xff ) << 48 ) +
            ( ( ( value >> 16 ) & 0xff ) << 40 ) +
            ( ( ( value >> 24 ) & 0xff ) << 32 ) +
            ( ( ( value >> 32 ) & 0xff ) << 24 ) +
            ( ( ( value >> 40 ) & 0xff ) << 16 ) +
            ( ( ( value >> 48 ) & 0xff ) << 8 ) +
            ( ( ( value >> 56 ) & 0xff ) << 0 );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Converts a "float" value between endian systems.
     * @param value value to convert
     * @return the converted value
     */
    public static float swapFloat(final float value) {try{__CLR4_4_16j6jkylvdyel.R.inc(242);
        __CLR4_4_16j6jkylvdyel.R.inc(243);return Float.intBitsToFloat( swapInteger( Float.floatToIntBits( value ) ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Converts a "double" value between endian systems.
     * @param value value to convert
     * @return the converted value
     */
    public static double swapDouble(final double value) {try{__CLR4_4_16j6jkylvdyel.R.inc(244);
        __CLR4_4_16j6jkylvdyel.R.inc(245);return Double.longBitsToDouble( swapLong( Double.doubleToLongBits( value ) ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    // ========================================== Swapping read/write routines

    /**
     * Writes a "short" value to a byte array at a given offset. The value is
     * converted to the opposed endian system while writing.
     * @param data target byte array
     * @param offset starting offset in the byte array
     * @param value value to write
     */
    public static void writeSwappedShort(final byte[] data, final int offset, final short value) {try{__CLR4_4_16j6jkylvdyel.R.inc(246);
        __CLR4_4_16j6jkylvdyel.R.inc(247);data[ offset + 0 ] = (byte)( ( value >> 0 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(248);data[ offset + 1 ] = (byte)( ( value >> 8 ) & 0xff );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "short" value from a byte array at a given offset. The value is
     * converted to the opposed endian system while reading.
     * @param data source byte array
     * @param offset starting offset in the byte array
     * @return the value read
     */
    public static short readSwappedShort(final byte[] data, final int offset) {try{__CLR4_4_16j6jkylvdyel.R.inc(249);
        __CLR4_4_16j6jkylvdyel.R.inc(250);return (short)( ( ( data[ offset + 0 ] & 0xff ) << 0 ) +
            ( ( data[ offset + 1 ] & 0xff ) << 8 ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads an unsigned short (16-bit) value from a byte array at a given
     * offset. The value is converted to the opposed endian system while
     * reading.
     * @param data source byte array
     * @param offset starting offset in the byte array
     * @return the value read
     */
    public static int readSwappedUnsignedShort(final byte[] data, final int offset) {try{__CLR4_4_16j6jkylvdyel.R.inc(251);
        __CLR4_4_16j6jkylvdyel.R.inc(252);return ( ( ( data[ offset + 0 ] & 0xff ) << 0 ) +
            ( ( data[ offset + 1 ] & 0xff ) << 8 ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Writes a "int" value to a byte array at a given offset. The value is
     * converted to the opposed endian system while writing.
     * @param data target byte array
     * @param offset starting offset in the byte array
     * @param value value to write
     */
    public static void writeSwappedInteger(final byte[] data, final int offset, final int value) {try{__CLR4_4_16j6jkylvdyel.R.inc(253);
        __CLR4_4_16j6jkylvdyel.R.inc(254);data[ offset + 0 ] = (byte)( ( value >> 0 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(255);data[ offset + 1 ] = (byte)( ( value >> 8 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(256);data[ offset + 2 ] = (byte)( ( value >> 16 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(257);data[ offset + 3 ] = (byte)( ( value >> 24 ) & 0xff );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "int" value from a byte array at a given offset. The value is
     * converted to the opposed endian system while reading.
     * @param data source byte array
     * @param offset starting offset in the byte array
     * @return the value read
     */
    public static int readSwappedInteger(final byte[] data, final int offset) {try{__CLR4_4_16j6jkylvdyel.R.inc(258);
        __CLR4_4_16j6jkylvdyel.R.inc(259);return ( ( ( data[ offset + 0 ] & 0xff ) << 0 ) +
            ( ( data[ offset + 1 ] & 0xff ) << 8 ) +
            ( ( data[ offset + 2 ] & 0xff ) << 16 ) +
            ( ( data[ offset + 3 ] & 0xff ) << 24 ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads an unsigned integer (32-bit) value from a byte array at a given
     * offset. The value is converted to the opposed endian system while
     * reading.
     * @param data source byte array
     * @param offset starting offset in the byte array
     * @return the value read
     */
    public static long readSwappedUnsignedInteger(final byte[] data, final int offset) {try{__CLR4_4_16j6jkylvdyel.R.inc(260);
        __CLR4_4_16j6jkylvdyel.R.inc(261);final long low = ( ( ( data[ offset + 0 ] & 0xff ) << 0 ) +
                     ( ( data[ offset + 1 ] & 0xff ) << 8 ) +
                     ( ( data[ offset + 2 ] & 0xff ) << 16 ) );

        __CLR4_4_16j6jkylvdyel.R.inc(262);final long high = data[ offset + 3 ] & 0xff;

        __CLR4_4_16j6jkylvdyel.R.inc(263);return (high << 24) + (0xffffffffL & low);
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Writes a "long" value to a byte array at a given offset. The value is
     * converted to the opposed endian system while writing.
     * @param data target byte array
     * @param offset starting offset in the byte array
     * @param value value to write
     */
    public static void writeSwappedLong(final byte[] data, final int offset, final long value) {try{__CLR4_4_16j6jkylvdyel.R.inc(264);
        __CLR4_4_16j6jkylvdyel.R.inc(265);data[ offset + 0 ] = (byte)( ( value >> 0 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(266);data[ offset + 1 ] = (byte)( ( value >> 8 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(267);data[ offset + 2 ] = (byte)( ( value >> 16 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(268);data[ offset + 3 ] = (byte)( ( value >> 24 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(269);data[ offset + 4 ] = (byte)( ( value >> 32 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(270);data[ offset + 5 ] = (byte)( ( value >> 40 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(271);data[ offset + 6 ] = (byte)( ( value >> 48 ) & 0xff );
        __CLR4_4_16j6jkylvdyel.R.inc(272);data[ offset + 7 ] = (byte)( ( value >> 56 ) & 0xff );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "long" value from a byte array at a given offset. The value is
     * converted to the opposed endian system while reading.
     * @param data source byte array
     * @param offset starting offset in the byte array
     * @return the value read
     */
    public static long readSwappedLong(final byte[] data, final int offset) {try{__CLR4_4_16j6jkylvdyel.R.inc(273);
        __CLR4_4_16j6jkylvdyel.R.inc(274);final long low = readSwappedInteger(data, offset);
        __CLR4_4_16j6jkylvdyel.R.inc(275);final long high = readSwappedInteger(data, offset + 4);
        __CLR4_4_16j6jkylvdyel.R.inc(276);return (high << 32) + (0xffffffffL & low);
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Writes a "float" value to a byte array at a given offset. The value is
     * converted to the opposed endian system while writing.
     * @param data target byte array
     * @param offset starting offset in the byte array
     * @param value value to write
     */
    public static void writeSwappedFloat(final byte[] data, final int offset, final float value) {try{__CLR4_4_16j6jkylvdyel.R.inc(277);
        __CLR4_4_16j6jkylvdyel.R.inc(278);writeSwappedInteger( data, offset, Float.floatToIntBits( value ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "float" value from a byte array at a given offset. The value is
     * converted to the opposed endian system while reading.
     * @param data source byte array
     * @param offset starting offset in the byte array
     * @return the value read
     */
    public static float readSwappedFloat(final byte[] data, final int offset) {try{__CLR4_4_16j6jkylvdyel.R.inc(279);
        __CLR4_4_16j6jkylvdyel.R.inc(280);return Float.intBitsToFloat( readSwappedInteger( data, offset ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Writes a "double" value to a byte array at a given offset. The value is
     * converted to the opposed endian system while writing.
     * @param data target byte array
     * @param offset starting offset in the byte array
     * @param value value to write
     */
    public static void writeSwappedDouble(final byte[] data, final int offset, final double value) {try{__CLR4_4_16j6jkylvdyel.R.inc(281);
        __CLR4_4_16j6jkylvdyel.R.inc(282);writeSwappedLong( data, offset, Double.doubleToLongBits( value ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "double" value from a byte array at a given offset. The value is
     * converted to the opposed endian system while reading.
     * @param data source byte array
     * @param offset starting offset in the byte array
     * @return the value read
     */
    public static double readSwappedDouble(final byte[] data, final int offset) {try{__CLR4_4_16j6jkylvdyel.R.inc(283);
        __CLR4_4_16j6jkylvdyel.R.inc(284);return Double.longBitsToDouble( readSwappedLong( data, offset ) );
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Writes a "short" value to an OutputStream. The value is
     * converted to the opposed endian system while writing.
     * @param output target OutputStream
     * @param value value to write
     * @throws IOException in case of an I/O problem
     */
    public static void writeSwappedShort(final OutputStream output, final short value) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(285);
        __CLR4_4_16j6jkylvdyel.R.inc(286);output.write((byte) ((value >> 0) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(287);output.write((byte) ((value >> 8) & 0xff));
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "short" value from an InputStream. The value is
     * converted to the opposed endian system while reading.
     * @param input source InputStream
     * @return the value just read
     * @throws IOException in case of an I/O problem
     */
    public static short readSwappedShort(final InputStream input) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(288);
        __CLR4_4_16j6jkylvdyel.R.inc(289);return (short) (((read(input) & 0xff) << 0) + ((read(input) & 0xff) << 8));
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a unsigned short (16-bit) from an InputStream. The value is
     * converted to the opposed endian system while reading.
     * @param input source InputStream
     * @return the value just read
     * @throws IOException in case of an I/O problem
     */
    public static int readSwappedUnsignedShort(final InputStream input) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(290);
        __CLR4_4_16j6jkylvdyel.R.inc(291);final int value1 = read(input);
        __CLR4_4_16j6jkylvdyel.R.inc(292);final int value2 = read(input);

        __CLR4_4_16j6jkylvdyel.R.inc(293);return (((value1 & 0xff) << 0) + ((value2 & 0xff) << 8));
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Writes a "int" value to an OutputStream. The value is converted to the opposed endian system while writing.
     *
     * @param output target OutputStream
     * @param value value to write
     * @throws IOException in case of an I/O problem
     */
    public static void writeSwappedInteger(final OutputStream output, final int value) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(294);
        __CLR4_4_16j6jkylvdyel.R.inc(295);output.write((byte) ((value >> 0) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(296);output.write((byte) ((value >> 8) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(297);output.write((byte) ((value >> 16) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(298);output.write((byte) ((value >> 24) & 0xff));
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "int" value from an InputStream. The value is
     * converted to the opposed endian system while reading.
     * @param input source InputStream
     * @return the value just read
     * @throws IOException in case of an I/O problem
     */
    public static int readSwappedInteger(final InputStream input) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(299);
        __CLR4_4_16j6jkylvdyel.R.inc(300);final int value1 = read(input);
        __CLR4_4_16j6jkylvdyel.R.inc(301);final int value2 = read(input);
        __CLR4_4_16j6jkylvdyel.R.inc(302);final int value3 = read(input);
        __CLR4_4_16j6jkylvdyel.R.inc(303);final int value4 = read(input);

        __CLR4_4_16j6jkylvdyel.R.inc(304);return ((value1 & 0xff) << 0) + ((value2 & 0xff) << 8) + ((value3 & 0xff) << 16) + ((value4 & 0xff) << 24);
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a unsigned integer (32-bit) from an InputStream. The value is
     * converted to the opposed endian system while reading.
     * @param input source InputStream
     * @return the value just read
     * @throws IOException in case of an I/O problem
     */
    public static long readSwappedUnsignedInteger(final InputStream input) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(305);
        __CLR4_4_16j6jkylvdyel.R.inc(306);final int value1 = read(input);
        __CLR4_4_16j6jkylvdyel.R.inc(307);final int value2 = read(input);
        __CLR4_4_16j6jkylvdyel.R.inc(308);final int value3 = read(input);
        __CLR4_4_16j6jkylvdyel.R.inc(309);final int value4 = read(input);

        __CLR4_4_16j6jkylvdyel.R.inc(310);final long low = (((value1 & 0xff) << 0) + ((value2 & 0xff) << 8) + ((value3 & 0xff) << 16));

        __CLR4_4_16j6jkylvdyel.R.inc(311);final long high = value4 & 0xff;

        __CLR4_4_16j6jkylvdyel.R.inc(312);return (high << 24) + (0xffffffffL & low);
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Writes a "long" value to an OutputStream. The value is
     * converted to the opposed endian system while writing.
     * @param output target OutputStream
     * @param value value to write
     * @throws IOException in case of an I/O problem
     */
    public static void writeSwappedLong(final OutputStream output, final long value) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(313);
        __CLR4_4_16j6jkylvdyel.R.inc(314);output.write((byte) ((value >> 0) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(315);output.write((byte) ((value >> 8) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(316);output.write((byte) ((value >> 16) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(317);output.write((byte) ((value >> 24) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(318);output.write((byte) ((value >> 32) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(319);output.write((byte) ((value >> 40) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(320);output.write((byte) ((value >> 48) & 0xff));
        __CLR4_4_16j6jkylvdyel.R.inc(321);output.write((byte) ((value >> 56) & 0xff));
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "long" value from an InputStream. The value is
     * converted to the opposed endian system while reading.
     * @param input source InputStream
     * @return the value just read
     * @throws IOException in case of an I/O problem
     */
    public static long readSwappedLong(final InputStream input) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(322);
        __CLR4_4_16j6jkylvdyel.R.inc(323);final byte[] bytes = new byte[8];
        __CLR4_4_16j6jkylvdyel.R.inc(324);for (int i = 0; (((i < 8)&&(__CLR4_4_16j6jkylvdyel.R.iget(325)!=0|true))||(__CLR4_4_16j6jkylvdyel.R.iget(326)==0&false)); i++) {{
            __CLR4_4_16j6jkylvdyel.R.inc(327);bytes[i] = (byte) read(input);
        }
        }__CLR4_4_16j6jkylvdyel.R.inc(328);return readSwappedLong(bytes, 0);
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Writes a "float" value to an OutputStream. The value is
     * converted to the opposed endian system while writing.
     * @param output target OutputStream
     * @param value value to write
     * @throws IOException in case of an I/O problem
     */
    public static void writeSwappedFloat(final OutputStream output, final float value) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(329);
        __CLR4_4_16j6jkylvdyel.R.inc(330);writeSwappedInteger(output, Float.floatToIntBits(value));
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "float" value from an InputStream. The value is
     * converted to the opposed endian system while reading.
     * @param input source InputStream
     * @return the value just read
     * @throws IOException in case of an I/O problem
     */
    public static float readSwappedFloat(final InputStream input) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(331);
        __CLR4_4_16j6jkylvdyel.R.inc(332);return Float.intBitsToFloat(readSwappedInteger(input));
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Writes a "double" value to an OutputStream. The value is
     * converted to the opposed endian system while writing.
     * @param output target OutputStream
     * @param value value to write
     * @throws IOException in case of an I/O problem
     */
    public static void writeSwappedDouble(final OutputStream output, final double value) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(333);
        __CLR4_4_16j6jkylvdyel.R.inc(334);writeSwappedLong(output, Double.doubleToLongBits(value));
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads a "double" value from an InputStream. The value is
     * converted to the opposed endian system while reading.
     * @param input source InputStream
     * @return the value just read
     * @throws IOException in case of an I/O problem
     */
    public static double readSwappedDouble(final InputStream input) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(335);
        __CLR4_4_16j6jkylvdyel.R.inc(336);return Double.longBitsToDouble(readSwappedLong(input));
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}

    /**
     * Reads the next byte from the input stream.
     * @param input  the stream
     * @return the byte
     * @throws IOException if the end of file is reached
     */
    private static int read(final InputStream input) throws IOException {try{__CLR4_4_16j6jkylvdyel.R.inc(337);
        __CLR4_4_16j6jkylvdyel.R.inc(338);final int value = input.read();

        __CLR4_4_16j6jkylvdyel.R.inc(339);if ((((EOF == value)&&(__CLR4_4_16j6jkylvdyel.R.iget(340)!=0|true))||(__CLR4_4_16j6jkylvdyel.R.iget(341)==0&false))) {{
            __CLR4_4_16j6jkylvdyel.R.inc(342);throw new EOFException("Unexpected EOF reached");
        }

        }__CLR4_4_16j6jkylvdyel.R.inc(343);return value;
    }finally{__CLR4_4_16j6jkylvdyel.R.flushNeeded();}}
}
