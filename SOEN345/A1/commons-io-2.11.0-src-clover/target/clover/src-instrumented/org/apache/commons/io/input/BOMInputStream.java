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
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.IOUtils;

/**
 * This class is used to wrap a stream that includes an encoded {@link ByteOrderMark} as its first bytes.
 * <p>
 * This class detects these bytes and, if required, can automatically skip them and return the subsequent byte as the
 * first byte in the stream.
 * </p>
 * <p>
 * The {@link ByteOrderMark} implementation has the following pre-defined BOMs:
 * </p>
 * <ul>
 * <li>UTF-8 - {@link ByteOrderMark#UTF_8}</li>
 * <li>UTF-16BE - {@link ByteOrderMark#UTF_16LE}</li>
 * <li>UTF-16LE - {@link ByteOrderMark#UTF_16BE}</li>
 * <li>UTF-32BE - {@link ByteOrderMark#UTF_32LE}</li>
 * <li>UTF-32LE - {@link ByteOrderMark#UTF_32BE}</li>
 * </ul>
 *
 * <h2>Example 1 - Detect and exclude a UTF-8 BOM</h2>
 *
 * <pre>
 * BOMInputStream bomIn = new BOMInputStream(in);
 * if (bomIn.hasBOM()) {
 *     // has a UTF-8 BOM
 * }
 * </pre>
 *
 * <h2>Example 2 - Detect a UTF-8 BOM (but don't exclude it)</h2>
 *
 * <pre>
 * boolean include = true;
 * BOMInputStream bomIn = new BOMInputStream(in, include);
 * if (bomIn.hasBOM()) {
 *     // has a UTF-8 BOM
 * }
 * </pre>
 *
 * <h2>Example 3 - Detect Multiple BOMs</h2>
 *
 * <pre>
 * BOMInputStream bomIn = new BOMInputStream(in,
 *   ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_16BE,
 *   ByteOrderMark.UTF_32LE, ByteOrderMark.UTF_32BE
 *   );
 * if (bomIn.hasBOM() == false) {
 *     // No BOM found
 * } else if (bomIn.hasBOM(ByteOrderMark.UTF_16LE)) {
 *     // has a UTF-16LE BOM
 * } else if (bomIn.hasBOM(ByteOrderMark.UTF_16BE)) {
 *     // has a UTF-16BE BOM
 * } else if (bomIn.hasBOM(ByteOrderMark.UTF_32LE)) {
 *     // has a UTF-32LE BOM
 * } else if (bomIn.hasBOM(ByteOrderMark.UTF_32BE)) {
 *     // has a UTF-32BE BOM
 * }
 * </pre>
 *
 * @see org.apache.commons.io.ByteOrderMark
 * @see <a href="http://en.wikipedia.org/wiki/Byte_order_mark">Wikipedia - Byte Order Mark</a>
 * @since 2.0
 */
public class BOMInputStream extends ProxyInputStream {public static class __CLR4_4_145l45lkylvdzpc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final boolean include;
    /**
     * BOMs are sorted from longest to shortest.
     */
    private final List<ByteOrderMark> boms;
    private ByteOrderMark byteOrderMark;
    private int[] firstBytes;
    private int fbLength;
    private int fbIndex;
    private int markFbIndex;
    private boolean markedAtStart;

    /**
     * Constructs a new BOM InputStream that excludes a {@link ByteOrderMark#UTF_8} BOM.
     *
     * @param delegate
     *            the InputStream to delegate to
     */
    public BOMInputStream(final InputStream delegate) {
        this(delegate, false, ByteOrderMark.UTF_8);__CLR4_4_145l45lkylvdzpc.R.inc(5386);try{__CLR4_4_145l45lkylvdzpc.R.inc(5385);
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Constructs a new BOM InputStream that detects a a {@link ByteOrderMark#UTF_8} and optionally includes it.
     *
     * @param delegate
     *            the InputStream to delegate to
     * @param include
     *            true to include the UTF-8 BOM or false to exclude it
     */
    public BOMInputStream(final InputStream delegate, final boolean include) {
        this(delegate, include, ByteOrderMark.UTF_8);__CLR4_4_145l45lkylvdzpc.R.inc(5388);try{__CLR4_4_145l45lkylvdzpc.R.inc(5387);
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Constructs a new BOM InputStream that excludes the specified BOMs.
     *
     * @param delegate
     *            the InputStream to delegate to
     * @param boms
     *            The BOMs to detect and exclude
     */
    public BOMInputStream(final InputStream delegate, final ByteOrderMark... boms) {
        this(delegate, false, boms);__CLR4_4_145l45lkylvdzpc.R.inc(5390);try{__CLR4_4_145l45lkylvdzpc.R.inc(5389);
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Compares ByteOrderMark objects in descending length order.
     */
    private static final Comparator<ByteOrderMark> ByteOrderMarkLengthComparator = (bom1, bom2) -> {
        __CLR4_4_145l45lkylvdzpc.R.inc(5391);final int len1 = bom1.length();
        __CLR4_4_145l45lkylvdzpc.R.inc(5392);final int len2 = bom2.length();
        __CLR4_4_145l45lkylvdzpc.R.inc(5393);return Integer.compare(len2, len1);
    };

    /**
     * Constructs a new BOM InputStream that detects the specified BOMs and optionally includes them.
     *
     * @param delegate
     *            the InputStream to delegate to
     * @param include
     *            true to include the specified BOMs or false to exclude them
     * @param boms
     *            The BOMs to detect and optionally exclude
     */
    public BOMInputStream(final InputStream delegate, final boolean include, final ByteOrderMark... boms) {
        super(delegate);__CLR4_4_145l45lkylvdzpc.R.inc(5395);try{__CLR4_4_145l45lkylvdzpc.R.inc(5394);
        __CLR4_4_145l45lkylvdzpc.R.inc(5396);if ((((IOUtils.length(boms) == 0)&&(__CLR4_4_145l45lkylvdzpc.R.iget(5397)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5398)==0&false))) {{
            __CLR4_4_145l45lkylvdzpc.R.inc(5399);throw new IllegalArgumentException("No BOMs specified");
        }
        }__CLR4_4_145l45lkylvdzpc.R.inc(5400);this.include = include;
        __CLR4_4_145l45lkylvdzpc.R.inc(5401);final List<ByteOrderMark> list = Arrays.asList(boms);
        // Sort the BOMs to match the longest BOM first because some BOMs have the same starting two bytes.
        __CLR4_4_145l45lkylvdzpc.R.inc(5402);list.sort(ByteOrderMarkLengthComparator);
        __CLR4_4_145l45lkylvdzpc.R.inc(5403);this.boms = list;

    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Indicates whether the stream contains one of the specified BOMs.
     *
     * @return true if the stream has one of the specified BOMs, otherwise false if it does not
     * @throws IOException
     *             if an error reading the first bytes of the stream occurs
     */
    public boolean hasBOM() throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5404);
        __CLR4_4_145l45lkylvdzpc.R.inc(5405);return getBOM() != null;
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Indicates whether the stream contains the specified BOM.
     *
     * @param bom
     *            The BOM to check for
     * @return true if the stream has the specified BOM, otherwise false if it does not
     * @throws IllegalArgumentException
     *             if the BOM is not one the stream is configured to detect
     * @throws IOException
     *             if an error reading the first bytes of the stream occurs
     */
    public boolean hasBOM(final ByteOrderMark bom) throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5406);
        __CLR4_4_145l45lkylvdzpc.R.inc(5407);if ((((!boms.contains(bom))&&(__CLR4_4_145l45lkylvdzpc.R.iget(5408)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5409)==0&false))) {{
            __CLR4_4_145l45lkylvdzpc.R.inc(5410);throw new IllegalArgumentException("Stream not configure to detect " + bom);
        }
        }__CLR4_4_145l45lkylvdzpc.R.inc(5411);getBOM();
        __CLR4_4_145l45lkylvdzpc.R.inc(5412);return byteOrderMark != null && byteOrderMark.equals(bom);
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Return the BOM (Byte Order Mark).
     *
     * @return The BOM or null if none
     * @throws IOException
     *             if an error reading the first bytes of the stream occurs
     */
    public ByteOrderMark getBOM() throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5413);
        __CLR4_4_145l45lkylvdzpc.R.inc(5414);if ((((firstBytes == null)&&(__CLR4_4_145l45lkylvdzpc.R.iget(5415)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5416)==0&false))) {{
            __CLR4_4_145l45lkylvdzpc.R.inc(5417);fbLength = 0;
            // BOMs are sorted from longest to shortest
            __CLR4_4_145l45lkylvdzpc.R.inc(5418);final int maxBomSize = boms.get(0).length();
            __CLR4_4_145l45lkylvdzpc.R.inc(5419);firstBytes = new int[maxBomSize];
            // Read first maxBomSize bytes
            __CLR4_4_145l45lkylvdzpc.R.inc(5420);for (int i = 0; (((i < firstBytes.length)&&(__CLR4_4_145l45lkylvdzpc.R.iget(5421)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5422)==0&false)); i++) {{
                __CLR4_4_145l45lkylvdzpc.R.inc(5423);firstBytes[i] = in.read();
                __CLR4_4_145l45lkylvdzpc.R.inc(5424);fbLength++;
                __CLR4_4_145l45lkylvdzpc.R.inc(5425);if ((((firstBytes[i] < 0)&&(__CLR4_4_145l45lkylvdzpc.R.iget(5426)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5427)==0&false))) {{
                    __CLR4_4_145l45lkylvdzpc.R.inc(5428);break;
                }
            }}
            // match BOM in firstBytes
            }__CLR4_4_145l45lkylvdzpc.R.inc(5429);byteOrderMark = find();
            __CLR4_4_145l45lkylvdzpc.R.inc(5430);if (((((byteOrderMark != null) && !include)&&(__CLR4_4_145l45lkylvdzpc.R.iget(5431)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5432)==0&false))) {{
                __CLR4_4_145l45lkylvdzpc.R.inc(5433);if ((((byteOrderMark.length() < firstBytes.length)&&(__CLR4_4_145l45lkylvdzpc.R.iget(5434)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5435)==0&false))) {{
                    __CLR4_4_145l45lkylvdzpc.R.inc(5436);fbIndex = byteOrderMark.length();
                } }else {{
                    __CLR4_4_145l45lkylvdzpc.R.inc(5437);fbLength = 0;
                }
            }}
        }}
        }__CLR4_4_145l45lkylvdzpc.R.inc(5438);return byteOrderMark;
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Return the BOM charset Name - {@link ByteOrderMark#getCharsetName()}.
     *
     * @return The BOM charset Name or null if no BOM found
     * @throws IOException
     *             if an error reading the first bytes of the stream occurs
     *
     */
    public String getBOMCharsetName() throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5439);
        __CLR4_4_145l45lkylvdzpc.R.inc(5440);getBOM();
        __CLR4_4_145l45lkylvdzpc.R.inc(5441);return (((byteOrderMark == null )&&(__CLR4_4_145l45lkylvdzpc.R.iget(5442)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5443)==0&false))? null : byteOrderMark.getCharsetName();
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * This method reads and either preserves or skips the first bytes in the stream. It behaves like the single-byte
     * {@code read()} method, either returning a valid byte or -1 to indicate that the initial bytes have been
     * processed already.
     *
     * @return the byte read (excluding BOM) or -1 if the end of stream
     * @throws IOException
     *             if an I/O error occurs
     */
    private int readFirstBytes() throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5444);
        __CLR4_4_145l45lkylvdzpc.R.inc(5445);getBOM();
        __CLR4_4_145l45lkylvdzpc.R.inc(5446);return (((fbIndex < fbLength )&&(__CLR4_4_145l45lkylvdzpc.R.iget(5447)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5448)==0&false))? firstBytes[fbIndex++] : EOF;
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Find a BOM with the specified bytes.
     *
     * @return The matched BOM or null if none matched
     */
    private ByteOrderMark find() {try{__CLR4_4_145l45lkylvdzpc.R.inc(5449);
        __CLR4_4_145l45lkylvdzpc.R.inc(5450);for (final ByteOrderMark bom : boms) {{
            __CLR4_4_145l45lkylvdzpc.R.inc(5451);if ((((matches(bom))&&(__CLR4_4_145l45lkylvdzpc.R.iget(5452)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5453)==0&false))) {{
                __CLR4_4_145l45lkylvdzpc.R.inc(5454);return bom;
            }
        }}
        }__CLR4_4_145l45lkylvdzpc.R.inc(5455);return null;
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Check if the bytes match a BOM.
     *
     * @param bom
     *            The BOM
     * @return true if the bytes match the bom, otherwise false
     */
    private boolean matches(final ByteOrderMark bom) {try{__CLR4_4_145l45lkylvdzpc.R.inc(5456);
        // if (bom.length() != fbLength) {
        // return false;
        // }
        // firstBytes may be bigger than the BOM bytes
        __CLR4_4_145l45lkylvdzpc.R.inc(5457);for (int i = 0; (((i < bom.length())&&(__CLR4_4_145l45lkylvdzpc.R.iget(5458)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5459)==0&false)); i++) {{
            __CLR4_4_145l45lkylvdzpc.R.inc(5460);if ((((bom.get(i) != firstBytes[i])&&(__CLR4_4_145l45lkylvdzpc.R.iget(5461)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5462)==0&false))) {{
                __CLR4_4_145l45lkylvdzpc.R.inc(5463);return false;
            }
        }}
        }__CLR4_4_145l45lkylvdzpc.R.inc(5464);return true;
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    // ----------------------------------------------------------------------------
    // Implementation of InputStream
    // ----------------------------------------------------------------------------

    /**
     * Invokes the delegate's {@code read()} method, detecting and optionally skipping BOM.
     *
     * @return the byte read (excluding BOM) or -1 if the end of stream
     * @throws IOException
     *             if an I/O error occurs
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5465);
        __CLR4_4_145l45lkylvdzpc.R.inc(5466);final int b = readFirstBytes();
        __CLR4_4_145l45lkylvdzpc.R.inc(5467);return (((b >= 0 )&&(__CLR4_4_145l45lkylvdzpc.R.iget(5468)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5469)==0&false))? b : in.read();
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read(byte[], int, int)} method, detecting and optionally skipping BOM.
     *
     * @param buf
     *            the buffer to read the bytes into
     * @param off
     *            The start offset
     * @param len
     *            The number of bytes to read (excluding BOM)
     * @return the number of bytes read or -1 if the end of stream
     * @throws IOException
     *             if an I/O error occurs
     */
    @Override
    public int read(final byte[] buf, int off, int len) throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5470);
        __CLR4_4_145l45lkylvdzpc.R.inc(5471);int firstCount = 0;
        __CLR4_4_145l45lkylvdzpc.R.inc(5472);int b = 0;
        __CLR4_4_145l45lkylvdzpc.R.inc(5473);while ((((len > 0 && b >= 0)&&(__CLR4_4_145l45lkylvdzpc.R.iget(5474)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5475)==0&false))) {{
            __CLR4_4_145l45lkylvdzpc.R.inc(5476);b = readFirstBytes();
            __CLR4_4_145l45lkylvdzpc.R.inc(5477);if ((((b >= 0)&&(__CLR4_4_145l45lkylvdzpc.R.iget(5478)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5479)==0&false))) {{
                __CLR4_4_145l45lkylvdzpc.R.inc(5480);buf[off++] = (byte) (b & 0xFF);
                __CLR4_4_145l45lkylvdzpc.R.inc(5481);len--;
                __CLR4_4_145l45lkylvdzpc.R.inc(5482);firstCount++;
            }
        }}
        }__CLR4_4_145l45lkylvdzpc.R.inc(5483);final int secondCount = in.read(buf, off, len);
        __CLR4_4_145l45lkylvdzpc.R.inc(5484);return (((secondCount < 0 )&&(__CLR4_4_145l45lkylvdzpc.R.iget(5485)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5486)==0&false))? (((firstCount > 0 )&&(__CLR4_4_145l45lkylvdzpc.R.iget(5487)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5488)==0&false))? firstCount : EOF : firstCount + secondCount;
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code read(byte[])} method, detecting and optionally skipping BOM.
     *
     * @param buf
     *            the buffer to read the bytes into
     * @return the number of bytes read (excluding BOM) or -1 if the end of stream
     * @throws IOException
     *             if an I/O error occurs
     */
    @Override
    public int read(final byte[] buf) throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5489);
        __CLR4_4_145l45lkylvdzpc.R.inc(5490);return read(buf, 0, buf.length);
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code mark(int)} method.
     *
     * @param readlimit
     *            read ahead limit
     */
    @Override
    public synchronized void mark(final int readlimit) {try{__CLR4_4_145l45lkylvdzpc.R.inc(5491);
        __CLR4_4_145l45lkylvdzpc.R.inc(5492);markFbIndex = fbIndex;
        __CLR4_4_145l45lkylvdzpc.R.inc(5493);markedAtStart = firstBytes == null;
        __CLR4_4_145l45lkylvdzpc.R.inc(5494);in.mark(readlimit);
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code reset()} method.
     *
     * @throws IOException
     *             if an I/O error occurs
     */
    @Override
    public synchronized void reset() throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5495);
        __CLR4_4_145l45lkylvdzpc.R.inc(5496);fbIndex = markFbIndex;
        __CLR4_4_145l45lkylvdzpc.R.inc(5497);if ((((markedAtStart)&&(__CLR4_4_145l45lkylvdzpc.R.iget(5498)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5499)==0&false))) {{
            __CLR4_4_145l45lkylvdzpc.R.inc(5500);firstBytes = null;
        }

        }__CLR4_4_145l45lkylvdzpc.R.inc(5501);in.reset();
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}

    /**
     * Invokes the delegate's {@code skip(long)} method, detecting and optionally skipping BOM.
     *
     * @param n
     *            the number of bytes to skip
     * @return the number of bytes to skipped or -1 if the end of stream
     * @throws IOException
     *             if an I/O error occurs
     */
    @Override
    public long skip(final long n) throws IOException {try{__CLR4_4_145l45lkylvdzpc.R.inc(5502);
        __CLR4_4_145l45lkylvdzpc.R.inc(5503);int skipped = 0;
        __CLR4_4_145l45lkylvdzpc.R.inc(5504);while (((((n > skipped) && (readFirstBytes() >= 0))&&(__CLR4_4_145l45lkylvdzpc.R.iget(5505)!=0|true))||(__CLR4_4_145l45lkylvdzpc.R.iget(5506)==0&false))) {{
            __CLR4_4_145l45lkylvdzpc.R.inc(5507);skipped++;
        }
        }__CLR4_4_145l45lkylvdzpc.R.inc(5508);return in.skip(n - skipped) + skipped;
    }finally{__CLR4_4_145l45lkylvdzpc.R.flushNeeded();}}
}
