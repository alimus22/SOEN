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

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * Dumps data in hexadecimal format.
 * <p>
 * Provides a single function to take an array of bytes and display it
 * in hexadecimal form.
 * <p>
 * Origin of code: POI.
 *
 */
public class HexDump {public static class __CLR4_4_11tu1tukylvdyux{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,2425,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Instances should NOT be constructed in standard programming.
     */
    public HexDump() {try{__CLR4_4_11tu1tukylvdyux.R.inc(2370);
    }finally{__CLR4_4_11tu1tukylvdyux.R.flushNeeded();}}

    /**
     * Dump an array of bytes to an OutputStream. The output is formatted
     * for human inspection, with a hexadecimal offset followed by the
     * hexadecimal values of the next 16 bytes of data and the printable ASCII
     * characters (if any) that those bytes represent printed per each line
     * of output.
     * <p>
     * The offset argument specifies the start offset of the data array
     * within a larger entity like a file or an incoming stream. For example,
     * if the data array contains the third kibibyte of a file, then the
     * offset argument should be set to 2048. The offset value printed
     * at the beginning of each line indicates where in that larger entity
     * the first byte on that line is located.
     * <p>
     * All bytes between the given index (inclusive) and the end of the
     * data array are dumped.
     *
     * @param data  the byte array to be dumped
     * @param offset  offset of the byte array within a larger entity
     * @param stream  the OutputStream to which the data is to be
     *               written
     * @param index initial index into the byte array
     *
     * @throws IOException is thrown if anything goes wrong writing
     *         the data to stream
     * @throws ArrayIndexOutOfBoundsException if the index is
     *         outside the data array's bounds
     * @throws IllegalArgumentException if the output stream is null
     */

    public static void dump(final byte[] data, final long offset,
                            final OutputStream stream, final int index)
            throws IOException, ArrayIndexOutOfBoundsException,
            IllegalArgumentException {try{__CLR4_4_11tu1tukylvdyux.R.inc(2371);

        __CLR4_4_11tu1tukylvdyux.R.inc(2372);if ((((index < 0 || index >= data.length)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2373)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2374)==0&false))) {{
            __CLR4_4_11tu1tukylvdyux.R.inc(2375);throw new ArrayIndexOutOfBoundsException(
                    "illegal index: " + index + " into array of length "
                    + data.length);
        }
        }__CLR4_4_11tu1tukylvdyux.R.inc(2376);if ((((stream == null)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2377)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2378)==0&false))) {{
            __CLR4_4_11tu1tukylvdyux.R.inc(2379);throw new IllegalArgumentException("cannot write to nullstream");
        }
        }__CLR4_4_11tu1tukylvdyux.R.inc(2380);long display_offset = offset + index;
        __CLR4_4_11tu1tukylvdyux.R.inc(2381);final StringBuilder buffer = new StringBuilder(74);

        __CLR4_4_11tu1tukylvdyux.R.inc(2382);for (int j = index; (((j < data.length)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2383)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2384)==0&false)); j += 16) {{
            __CLR4_4_11tu1tukylvdyux.R.inc(2385);int chars_read = data.length - j;

            __CLR4_4_11tu1tukylvdyux.R.inc(2386);if ((((chars_read > 16)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2387)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2388)==0&false))) {{
                __CLR4_4_11tu1tukylvdyux.R.inc(2389);chars_read = 16;
            }
            }__CLR4_4_11tu1tukylvdyux.R.inc(2390);dump(buffer, display_offset).append(' ');
            __CLR4_4_11tu1tukylvdyux.R.inc(2391);for (int k = 0; (((k < 16)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2392)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2393)==0&false)); k++) {{
                __CLR4_4_11tu1tukylvdyux.R.inc(2394);if ((((k < chars_read)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2395)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2396)==0&false))) {{
                    __CLR4_4_11tu1tukylvdyux.R.inc(2397);dump(buffer, data[k + j]);
                } }else {{
                    __CLR4_4_11tu1tukylvdyux.R.inc(2398);buffer.append("  ");
                }
                }__CLR4_4_11tu1tukylvdyux.R.inc(2399);buffer.append(' ');
            }
            }__CLR4_4_11tu1tukylvdyux.R.inc(2400);for (int k = 0; (((k < chars_read)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2401)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2402)==0&false)); k++) {{
                __CLR4_4_11tu1tukylvdyux.R.inc(2403);if ((((data[k + j] >= ' ' && data[k + j] < 127)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2404)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2405)==0&false))) {{
                    __CLR4_4_11tu1tukylvdyux.R.inc(2406);buffer.append((char) data[k + j]);
                } }else {{
                    __CLR4_4_11tu1tukylvdyux.R.inc(2407);buffer.append('.');
                }
            }}
            }__CLR4_4_11tu1tukylvdyux.R.inc(2408);buffer.append(EOL);
            // make explicit the dependency on the default encoding
            __CLR4_4_11tu1tukylvdyux.R.inc(2409);stream.write(buffer.toString().getBytes(Charset.defaultCharset()));
            __CLR4_4_11tu1tukylvdyux.R.inc(2410);stream.flush();
            __CLR4_4_11tu1tukylvdyux.R.inc(2411);buffer.setLength(0);
            __CLR4_4_11tu1tukylvdyux.R.inc(2412);display_offset += chars_read;
        }
    }}finally{__CLR4_4_11tu1tukylvdyux.R.flushNeeded();}}

    /**
     * The line-separator (initializes to "line.separator" system property.
     */
    public static final String EOL =
            System.getProperty("line.separator");
    private static final char[] _hexcodes =
            {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'
            };
    private static final int[] _shifts =
            {
                28, 24, 20, 16, 12, 8, 4, 0
            };

    /**
     * Dump a long value into a StringBuilder.
     *
     * @param _lbuffer the StringBuilder to dump the value in
     * @param value  the long value to be dumped
     * @return StringBuilder containing the dumped value.
     */
    private static StringBuilder dump(final StringBuilder _lbuffer, final long value) {try{__CLR4_4_11tu1tukylvdyux.R.inc(2413);
        __CLR4_4_11tu1tukylvdyux.R.inc(2414);for (int j = 0; (((j < 8)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2415)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2416)==0&false)); j++) {{
            __CLR4_4_11tu1tukylvdyux.R.inc(2417);_lbuffer
                    .append(_hexcodes[(int) (value >> _shifts[j]) & 15]);
        }
        }__CLR4_4_11tu1tukylvdyux.R.inc(2418);return _lbuffer;
    }finally{__CLR4_4_11tu1tukylvdyux.R.flushNeeded();}}

    /**
     * Dump a byte value into a StringBuilder.
     *
     * @param _cbuffer the StringBuilder to dump the value in
     * @param value  the byte value to be dumped
     * @return StringBuilder containing the dumped value.
     */
    private static StringBuilder dump(final StringBuilder _cbuffer, final byte value) {try{__CLR4_4_11tu1tukylvdyux.R.inc(2419);
        __CLR4_4_11tu1tukylvdyux.R.inc(2420);for (int j = 0; (((j < 2)&&(__CLR4_4_11tu1tukylvdyux.R.iget(2421)!=0|true))||(__CLR4_4_11tu1tukylvdyux.R.iget(2422)==0&false)); j++) {{
            __CLR4_4_11tu1tukylvdyux.R.inc(2423);_cbuffer.append(_hexcodes[value >> _shifts[j + 6] & 15]);
        }
        }__CLR4_4_11tu1tukylvdyux.R.inc(2424);return _cbuffer;
    }finally{__CLR4_4_11tu1tukylvdyux.R.flushNeeded();}}

}
