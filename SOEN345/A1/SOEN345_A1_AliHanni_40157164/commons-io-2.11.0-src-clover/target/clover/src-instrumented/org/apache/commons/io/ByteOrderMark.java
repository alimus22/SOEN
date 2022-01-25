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

import java.io.Serializable;
import java.util.Locale;

/**
 * Byte Order Mark (BOM) representation - see {@link org.apache.commons.io.input.BOMInputStream}.
 *
 * @see org.apache.commons.io.input.BOMInputStream
 * @see <a href="http://en.wikipedia.org/wiki/Byte_order_mark">Wikipedia: Byte Order Mark</a>
 * @see <a href="http://www.w3.org/TR/2006/REC-xml-20060816/#sec-guessing">W3C: Autodetection of Character Encodings
 *      (Non-Normative)</a>
 * @since 2.0
 */
public class ByteOrderMark implements Serializable {public static class __CLR4_4_100kylvdy6v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,65,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1L;

    /** UTF-8 BOM. */
    public static final ByteOrderMark UTF_8    = new ByteOrderMark("UTF-8", 0xEF, 0xBB, 0xBF);

    /** UTF-16BE BOM (Big-Endian). */
    public static final ByteOrderMark UTF_16BE = new ByteOrderMark("UTF-16BE", 0xFE, 0xFF);

    /** UTF-16LE BOM (Little-Endian). */
    public static final ByteOrderMark UTF_16LE = new ByteOrderMark("UTF-16LE", 0xFF, 0xFE);

    /**
     * UTF-32BE BOM (Big-Endian).
     *
     * @since 2.2
     */
    public static final ByteOrderMark UTF_32BE = new ByteOrderMark("UTF-32BE", 0x00, 0x00, 0xFE, 0xFF);

    /**
     * UTF-32LE BOM (Little-Endian).
     *
     * @since 2.2
     */
    public static final ByteOrderMark UTF_32LE = new ByteOrderMark("UTF-32LE", 0xFF, 0xFE, 0x00, 0x00);

    /**
     * Unicode BOM character; external form depends on the encoding.
     *
     * @see <a href="http://unicode.org/faq/utf_bom.html#BOM">Byte Order Mark (BOM) FAQ</a>
     * @since 2.5
     */
    public static final char UTF_BOM = '\ufeff';

    private final String charsetName;
    private final int[] bytes;

    /**
     * Constructs a new BOM.
     *
     * @param charsetName The name of the charset the BOM represents
     * @param bytes The BOM's bytes
     * @throws IllegalArgumentException if the charsetName is null or
     * zero length
     * @throws IllegalArgumentException if the bytes are null or zero
     * length
     */
    public ByteOrderMark(final String charsetName, final int... bytes) {try{__CLR4_4_100kylvdy6v.R.inc(0);
        __CLR4_4_100kylvdy6v.R.inc(1);if ((((charsetName == null || charsetName.isEmpty())&&(__CLR4_4_100kylvdy6v.R.iget(2)!=0|true))||(__CLR4_4_100kylvdy6v.R.iget(3)==0&false))) {{
            __CLR4_4_100kylvdy6v.R.inc(4);throw new IllegalArgumentException("No charsetName specified");
        }
        }__CLR4_4_100kylvdy6v.R.inc(5);if ((((bytes == null || bytes.length == 0)&&(__CLR4_4_100kylvdy6v.R.iget(6)!=0|true))||(__CLR4_4_100kylvdy6v.R.iget(7)==0&false))) {{
            __CLR4_4_100kylvdy6v.R.inc(8);throw new IllegalArgumentException("No bytes specified");
        }
        }__CLR4_4_100kylvdy6v.R.inc(9);this.charsetName = charsetName;
        __CLR4_4_100kylvdy6v.R.inc(10);this.bytes = new int[bytes.length];
        __CLR4_4_100kylvdy6v.R.inc(11);System.arraycopy(bytes, 0, this.bytes, 0, bytes.length);
    }finally{__CLR4_4_100kylvdy6v.R.flushNeeded();}}

    /**
     * Gets the name of the {@link java.nio.charset.Charset} the BOM represents.
     *
     * @return the character set name
     */
    public String getCharsetName() {try{__CLR4_4_100kylvdy6v.R.inc(12);
        __CLR4_4_100kylvdy6v.R.inc(13);return charsetName;
    }finally{__CLR4_4_100kylvdy6v.R.flushNeeded();}}

    /**
     * Gets the length of the BOM's bytes.
     *
     * @return the length of the BOM's bytes
     */
    public int length() {try{__CLR4_4_100kylvdy6v.R.inc(14);
        __CLR4_4_100kylvdy6v.R.inc(15);return bytes.length;
    }finally{__CLR4_4_100kylvdy6v.R.flushNeeded();}}

    /**
     * Gets the byte at the specified position.
     *
     * @param pos The position
     * @return The specified byte
     */
    public int get(final int pos) {try{__CLR4_4_100kylvdy6v.R.inc(16);
        __CLR4_4_100kylvdy6v.R.inc(17);return bytes[pos];
    }finally{__CLR4_4_100kylvdy6v.R.flushNeeded();}}

    /**
     * Gets a copy of the BOM's bytes.
     *
     * @return a copy of the BOM's bytes
     */
    public byte[] getBytes() {try{__CLR4_4_100kylvdy6v.R.inc(18);
        __CLR4_4_100kylvdy6v.R.inc(19);final byte[] copy = IOUtils.byteArray(bytes.length);
        __CLR4_4_100kylvdy6v.R.inc(20);for (int i = 0; (((i < bytes.length)&&(__CLR4_4_100kylvdy6v.R.iget(21)!=0|true))||(__CLR4_4_100kylvdy6v.R.iget(22)==0&false)); i++) {{
            __CLR4_4_100kylvdy6v.R.inc(23);copy[i] = (byte)bytes[i];
        }
        }__CLR4_4_100kylvdy6v.R.inc(24);return copy;
    }finally{__CLR4_4_100kylvdy6v.R.flushNeeded();}}

    /**
     * Indicates if this BOM's bytes equals another.
     *
     * @param obj The object to compare to
     * @return true if the bom's bytes are equal, otherwise
     * false
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_100kylvdy6v.R.inc(25);
        __CLR4_4_100kylvdy6v.R.inc(26);if ((((!(obj instanceof ByteOrderMark))&&(__CLR4_4_100kylvdy6v.R.iget(27)!=0|true))||(__CLR4_4_100kylvdy6v.R.iget(28)==0&false))) {{
            __CLR4_4_100kylvdy6v.R.inc(29);return false;
        }
        }__CLR4_4_100kylvdy6v.R.inc(30);final ByteOrderMark bom = (ByteOrderMark)obj;
        __CLR4_4_100kylvdy6v.R.inc(31);if ((((bytes.length != bom.length())&&(__CLR4_4_100kylvdy6v.R.iget(32)!=0|true))||(__CLR4_4_100kylvdy6v.R.iget(33)==0&false))) {{
            __CLR4_4_100kylvdy6v.R.inc(34);return false;
        }
        }__CLR4_4_100kylvdy6v.R.inc(35);for (int i = 0; (((i < bytes.length)&&(__CLR4_4_100kylvdy6v.R.iget(36)!=0|true))||(__CLR4_4_100kylvdy6v.R.iget(37)==0&false)); i++) {{
            __CLR4_4_100kylvdy6v.R.inc(38);if ((((bytes[i] != bom.get(i))&&(__CLR4_4_100kylvdy6v.R.iget(39)!=0|true))||(__CLR4_4_100kylvdy6v.R.iget(40)==0&false))) {{
                __CLR4_4_100kylvdy6v.R.inc(41);return false;
            }
        }}
        }__CLR4_4_100kylvdy6v.R.inc(42);return true;
    }finally{__CLR4_4_100kylvdy6v.R.flushNeeded();}}

    /**
     * Computes the hashcode for this BOM.
     *
     * @return the hashcode for this BOM.
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {try{__CLR4_4_100kylvdy6v.R.inc(43);
        __CLR4_4_100kylvdy6v.R.inc(44);int hashCode = getClass().hashCode();
        __CLR4_4_100kylvdy6v.R.inc(45);for (final int b : bytes) {{
            __CLR4_4_100kylvdy6v.R.inc(46);hashCode += b;
        }
        }__CLR4_4_100kylvdy6v.R.inc(47);return hashCode;
    }finally{__CLR4_4_100kylvdy6v.R.flushNeeded();}}

    /**
     * Converts this instance to a String representation of the BOM.
     *
     * @return the length of the BOM's bytes
     */
    @Override
    public String toString() {try{__CLR4_4_100kylvdy6v.R.inc(48);
        __CLR4_4_100kylvdy6v.R.inc(49);final StringBuilder builder = new StringBuilder();
        __CLR4_4_100kylvdy6v.R.inc(50);builder.append(getClass().getSimpleName());
        __CLR4_4_100kylvdy6v.R.inc(51);builder.append('[');
        __CLR4_4_100kylvdy6v.R.inc(52);builder.append(charsetName);
        __CLR4_4_100kylvdy6v.R.inc(53);builder.append(": ");
        __CLR4_4_100kylvdy6v.R.inc(54);for (int i = 0; (((i < bytes.length)&&(__CLR4_4_100kylvdy6v.R.iget(55)!=0|true))||(__CLR4_4_100kylvdy6v.R.iget(56)==0&false)); i++) {{
            __CLR4_4_100kylvdy6v.R.inc(57);if ((((i > 0)&&(__CLR4_4_100kylvdy6v.R.iget(58)!=0|true))||(__CLR4_4_100kylvdy6v.R.iget(59)==0&false))) {{
                __CLR4_4_100kylvdy6v.R.inc(60);builder.append(",");
            }
            }__CLR4_4_100kylvdy6v.R.inc(61);builder.append("0x");
            __CLR4_4_100kylvdy6v.R.inc(62);builder.append(Integer.toHexString(0xFF & bytes[i]).toUpperCase(Locale.ROOT));
        }
        }__CLR4_4_100kylvdy6v.R.inc(63);builder.append(']');
        __CLR4_4_100kylvdy6v.R.inc(64);return builder.toString();
    }finally{__CLR4_4_100kylvdy6v.R.flushNeeded();}}

}
