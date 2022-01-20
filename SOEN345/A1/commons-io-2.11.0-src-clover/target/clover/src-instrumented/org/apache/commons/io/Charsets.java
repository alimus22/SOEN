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

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Charsets required of every implementation of the Java platform.
 *
 * From the Java documentation <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">
 * Standard charsets</a>:
 * <p>
 * <cite>Every implementation of the Java platform is required to support the following character encodings. Consult
 * the release documentation for your implementation to see if any other encodings are supported. Consult the release
 * documentation for your implementation to see if any other encodings are supported. </cite>
 * </p>
 *
 * <ul>
 * <li>{@code US-ASCII}<br>
 * Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set.</li>
 * <li>{@code ISO-8859-1}<br>
 * ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.</li>
 * <li>{@code UTF-8}<br>
 * Eight-bit Unicode Transformation Format.</li>
 * <li>{@code UTF-16BE}<br>
 * Sixteen-bit Unicode Transformation Format, big-endian byte order.</li>
 * <li>{@code UTF-16LE}<br>
 * Sixteen-bit Unicode Transformation Format, little-endian byte order.</li>
 * <li>{@code UTF-16}<br>
 * Sixteen-bit Unicode Transformation Format, byte order specified by a mandatory initial byte-order mark (either order
 * accepted on input, big-endian used on output.)</li>
 * </ul>
 *
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
 * @since 2.3
 */
public class Charsets {public static class __CLR4_4_12424kylvdy8n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,95,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //
    // This class should only contain Charset instances for required encodings. This guarantees that it will load
    // correctly and without delay on all Java platforms.
    //

    private static final SortedMap<String, Charset> STANDARD_CHARSET_MAP;

    static {try{__CLR4_4_12424kylvdy8n.R.inc(76);
        __CLR4_4_12424kylvdy8n.R.inc(77);final SortedMap<String, Charset> standardCharsetMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        __CLR4_4_12424kylvdy8n.R.inc(78);standardCharsetMap.put(StandardCharsets.ISO_8859_1.name(), StandardCharsets.ISO_8859_1);
        __CLR4_4_12424kylvdy8n.R.inc(79);standardCharsetMap.put(StandardCharsets.US_ASCII.name(), StandardCharsets.US_ASCII);
        __CLR4_4_12424kylvdy8n.R.inc(80);standardCharsetMap.put(StandardCharsets.UTF_16.name(), StandardCharsets.UTF_16);
        __CLR4_4_12424kylvdy8n.R.inc(81);standardCharsetMap.put(StandardCharsets.UTF_16BE.name(), StandardCharsets.UTF_16BE);
        __CLR4_4_12424kylvdy8n.R.inc(82);standardCharsetMap.put(StandardCharsets.UTF_16LE.name(), StandardCharsets.UTF_16LE);
        __CLR4_4_12424kylvdy8n.R.inc(83);standardCharsetMap.put(StandardCharsets.UTF_8.name(), StandardCharsets.UTF_8);
        __CLR4_4_12424kylvdy8n.R.inc(84);STANDARD_CHARSET_MAP = Collections.unmodifiableSortedMap(standardCharsetMap);
    }finally{__CLR4_4_12424kylvdy8n.R.flushNeeded();}}

    /**
     * Constructs a sorted map from canonical charset names to charset objects required of every implementation of the
     * Java platform.
     * <p>
     * From the Java documentation <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">
     * Standard charsets</a>:
     * </p>
     *
     * @return An immutable, case-insensitive map from canonical charset names to charset objects.
     * @see Charset#availableCharsets()
     * @since 2.5
     */
    public static SortedMap<String, Charset> requiredCharsets() {try{__CLR4_4_12424kylvdy8n.R.inc(85);
        __CLR4_4_12424kylvdy8n.R.inc(86);return STANDARD_CHARSET_MAP;
    }finally{__CLR4_4_12424kylvdy8n.R.flushNeeded();}}

    /**
     * Returns the given Charset or the default Charset if the given Charset is null.
     *
     * @param charset
     *            A charset or null.
     * @return the given Charset or the default Charset if the given Charset is null
     */
    public static Charset toCharset(final Charset charset) {try{__CLR4_4_12424kylvdy8n.R.inc(87);
        __CLR4_4_12424kylvdy8n.R.inc(88);return (((charset == null )&&(__CLR4_4_12424kylvdy8n.R.iget(89)!=0|true))||(__CLR4_4_12424kylvdy8n.R.iget(90)==0&false))? Charset.defaultCharset() : charset;
    }finally{__CLR4_4_12424kylvdy8n.R.flushNeeded();}}

    /**
     * Returns a Charset for the named charset. If the name is null, return the default Charset.
     *
     * @param charsetName The name of the requested charset, may be null.
     * @return a Charset for the named charset.
     * @throws UnsupportedCharsetException If the named charset is unavailable (unchecked exception).
     */
    public static Charset toCharset(final String charsetName) throws UnsupportedCharsetException {try{__CLR4_4_12424kylvdy8n.R.inc(91);
        __CLR4_4_12424kylvdy8n.R.inc(92);return (((charsetName == null )&&(__CLR4_4_12424kylvdy8n.R.iget(93)!=0|true))||(__CLR4_4_12424kylvdy8n.R.iget(94)==0&false))? Charset.defaultCharset() : Charset.forName(charsetName);
    }finally{__CLR4_4_12424kylvdy8n.R.flushNeeded();}}

    /**
     * CharEncodingISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
    public static final Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;

    /**
     * <p>
     * Seven-bit ASCII, also known as ISO646-US, also known as the Basic Latin block of the Unicode character set.
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
    public static final Charset US_ASCII = StandardCharsets.US_ASCII;

    /**
     * <p>
     * Sixteen-bit Unicode Transformation Format, The byte order specified by a mandatory initial byte-order mark
     * (either order accepted on input, big-endian used on output)
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
    public static final Charset UTF_16 = StandardCharsets.UTF_16;

    /**
     * <p>
     * Sixteen-bit Unicode Transformation Format, big-endian byte order.
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
    public static final Charset UTF_16BE = StandardCharsets.UTF_16BE;

    /**
     * <p>
     * Sixteen-bit Unicode Transformation Format, little-endian byte order.
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
    public static final Charset UTF_16LE = StandardCharsets.UTF_16LE;

    /**
     * <p>
     * Eight-bit Unicode Transformation Format.
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @deprecated Use Java 7's {@link java.nio.charset.StandardCharsets}
     */
    @Deprecated
    public static final Charset UTF_8 = StandardCharsets.UTF_8;
}
