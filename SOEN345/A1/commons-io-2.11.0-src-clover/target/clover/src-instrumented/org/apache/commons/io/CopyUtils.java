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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

/**
 * This class provides static utility methods for buffered
 * copying between sources ({@code InputStream}, {@code Reader},
 * {@code String} and {@code byte[]}) and destinations
 * ({@code OutputStream}, {@code Writer}, {@code String} and
 * {@code byte[]}).
 * <p>
 * Unless otherwise noted, these {@code copy} methods do <em>not</em>
 * flush or close the streams. Often doing so would require making non-portable
 * assumptions about the streams' origin and further use. This means that both
 * streams' {@code close()} methods must be called after copying. if one
 * omits this step, then the stream resources (sockets, file descriptors) are
 * released when the associated Stream is garbage-collected. It is not a good
 * idea to rely on this mechanism. For a good overview of the distinction
 * between "memory management" and "resource management", see
 * <a href="http://www.unixreview.com/articles/1998/9804/9804ja/ja.htm">this
 * UnixReview article</a>.
 * <p>
 * For byte-to-char methods, a {@code copy} variant allows the encoding
 * to be selected (otherwise the platform default is used). We would like to
 * encourage you to always specify the encoding because relying on the platform
 * default can lead to unexpected results.
 * <p>
 * We don't provide special variants for the {@code copy} methods that
 * let you specify the buffer size because in modern VMs the impact on speed
 * seems to be minimal. We're using a default buffer size of 4 KB.
 * <p>
 * The {@code copy} methods use an internal buffer when copying. It is
 * therefore advisable <em>not</em> to deliberately wrap the stream arguments
 * to the {@code copy} methods in {@code Buffered*} streams. For
 * example, don't do the following:
 * <pre>
 *  copy( new BufferedInputStream( in ), new BufferedOutputStream( out ) );
 *  </pre>
 * The rationale is as follows:
 * <p>
 * Imagine that an InputStream's read() is a very expensive operation, which
 * would usually suggest wrapping in a BufferedInputStream. The
 * BufferedInputStream works by issuing infrequent
 * {@link java.io.InputStream#read(byte[] b, int off, int len)} requests on the
 * underlying InputStream, to fill an internal buffer, from which further
 * {@code read} requests can inexpensively get their data (until the buffer
 * runs out).
 * <p>
 * However, the {@code copy} methods do the same thing, keeping an
 * internal buffer, populated by
 * {@link InputStream#read(byte[] b, int off, int len)} requests. Having two
 * buffers (or three if the destination stream is also buffered) is pointless,
 * and the unnecessary buffer management hurts performance slightly (about 3%,
 * according to some simple experiments).
 * <p>
 * Behold, intrepid explorers; a map of this class:
 * <pre>
 *       Method      Input               Output          Dependency
 *       ------      -----               ------          -------
 * 1     copy        InputStream         OutputStream    (primitive)
 * 2     copy        Reader              Writer          (primitive)
 *
 * 3     copy        InputStream         Writer          2
 *
 * 4     copy        Reader              OutputStream    2
 *
 * 5     copy        String              OutputStream    2
 * 6     copy        String              Writer          (trivial)
 *
 * 7     copy        byte[]              Writer          3
 * 8     copy        byte[]              OutputStream    (trivial)
 * </pre>
 * <p>
 * Note that only the first two methods shuffle bytes; the rest use these
 * two, or (if possible) copy using native Java copy methods. As there are
 * method variants to specify the encoding, each row may
 * correspond to up to 2 methods.
 * <p>
 * Origin of code: Excalibur.
 *
 * @deprecated Use IOUtils. Will be removed in 3.0.
 *  Methods renamed to IOUtils.write() or IOUtils.copy().
 *  Null handling behavior changed in IOUtils (null data does not
 *  throw NullPointerException).
 */
@Deprecated
public class CopyUtils {public static class __CLR4_4_12n2nkylvdy9j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,150,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Instances should NOT be constructed in standard programming.
     */
    public CopyUtils() {try{__CLR4_4_12n2nkylvdy9j.R.inc(95); }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    /**
     * Copies bytes from a {@code byte[]} to an {@code OutputStream}.
     * @param input the byte array to read from
     * @param output the {@code OutputStream} to write to
     * @throws IOException In case of an I/O problem
     */
    public static void copy(final byte[] input, final OutputStream output) throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(96);
        __CLR4_4_12n2nkylvdy9j.R.inc(97);output.write(input);
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    /**
     * Copies and convert bytes from a {@code byte[]} to chars on a
     * {@code Writer}.
     * The platform's default encoding is used for the byte-to-char conversion.
     * @param input the byte array to read from
     * @param output the {@code Writer} to write to
     * @throws IOException In case of an I/O problem
     * @deprecated 2.5 use {@link #copy(byte[], Writer, String)} instead
     */
    @Deprecated
    public static void copy(final byte[] input, final Writer output) throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(98);
        __CLR4_4_12n2nkylvdy9j.R.inc(99);final ByteArrayInputStream inputStream = new ByteArrayInputStream(input);
        __CLR4_4_12n2nkylvdy9j.R.inc(100);copy(inputStream, output);
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    /**
     * Copies and convert bytes from a {@code byte[]} to chars on a
     * {@code Writer}, using the specified encoding.
     * @param input the byte array to read from
     * @param output the {@code Writer} to write to
     * @param encoding The name of a supported character encoding. See the
     * <a href="http://www.iana.org/assignments/character-sets">IANA
     * Charset Registry</a> for a list of valid encoding types.
     * @throws IOException In case of an I/O problem
     */
    public static void copy(final byte[] input, final Writer output, final String encoding) throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(101);
        __CLR4_4_12n2nkylvdy9j.R.inc(102);final ByteArrayInputStream inputStream = new ByteArrayInputStream(input);
        __CLR4_4_12n2nkylvdy9j.R.inc(103);copy(inputStream, output, encoding);
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    /**
     * Copies bytes from an {@code InputStream} to an
     * {@code OutputStream}.
     * @param input the {@code InputStream} to read from
     * @param output the {@code OutputStream} to write to
     * @return the number of bytes copied
     * @throws IOException In case of an I/O problem
     */
    public static int copy(final InputStream input, final OutputStream output) throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(104);
        __CLR4_4_12n2nkylvdy9j.R.inc(105);final byte[] buffer = IOUtils.byteArray();
        __CLR4_4_12n2nkylvdy9j.R.inc(106);int count = 0;
        __CLR4_4_12n2nkylvdy9j.R.inc(107);int n;
        __CLR4_4_12n2nkylvdy9j.R.inc(108);while (EOF != (n = input.read(buffer))) {{
            __CLR4_4_12n2nkylvdy9j.R.inc(111);output.write(buffer, 0, n);
            __CLR4_4_12n2nkylvdy9j.R.inc(112);count += n;
        }
        }__CLR4_4_12n2nkylvdy9j.R.inc(113);return count;
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    // ----------------------------------------------------------------
    // Reader -> Writer
    // ----------------------------------------------------------------

    /**
     * Copies chars from a {@code Reader} to a {@code Writer}.
     * @param input the {@code Reader} to read from
     * @param output the {@code Writer} to write to
     * @return the number of characters copied
     * @throws IOException In case of an I/O problem
     */
    public static int copy(
            final Reader input,
            final Writer output)
                throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(114);
        __CLR4_4_12n2nkylvdy9j.R.inc(115);final char[] buffer = IOUtils.getCharArray();
        __CLR4_4_12n2nkylvdy9j.R.inc(116);int count = 0;
        __CLR4_4_12n2nkylvdy9j.R.inc(117);int n;
        __CLR4_4_12n2nkylvdy9j.R.inc(118);while (EOF != (n = input.read(buffer))) {{
            __CLR4_4_12n2nkylvdy9j.R.inc(121);output.write(buffer, 0, n);
            __CLR4_4_12n2nkylvdy9j.R.inc(122);count += n;
        }
        }__CLR4_4_12n2nkylvdy9j.R.inc(123);return count;
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    // ----------------------------------------------------------------
    // InputStream -> Writer
    // ----------------------------------------------------------------

    /**
     * Copies and convert bytes from an {@code InputStream} to chars on a
     * {@code Writer}.
     * The platform's default encoding is used for the byte-to-char conversion.
     * @param input the {@code InputStream} to read from
     * @param output the {@code Writer} to write to
     * @throws IOException In case of an I/O problem
     * @deprecated 2.5 use {@link #copy(InputStream, Writer, String)} instead
     */
    @Deprecated
    public static void copy(
            final InputStream input,
            final Writer output)
                throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(124);
        // make explicit the dependency on the default encoding
        __CLR4_4_12n2nkylvdy9j.R.inc(125);final InputStreamReader in = new InputStreamReader(input, Charset.defaultCharset());
        __CLR4_4_12n2nkylvdy9j.R.inc(126);copy(in, output);
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    /**
     * Copies and convert bytes from an {@code InputStream} to chars on a
     * {@code Writer}, using the specified encoding.
     * @param input the {@code InputStream} to read from
     * @param output the {@code Writer} to write to
     * @param encoding The name of a supported character encoding. See the
     * <a href="http://www.iana.org/assignments/character-sets">IANA
     * Charset Registry</a> for a list of valid encoding types.
     * @throws IOException In case of an I/O problem
     */
    public static void copy(
            final InputStream input,
            final Writer output,
            final String encoding)
                throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(127);
        __CLR4_4_12n2nkylvdy9j.R.inc(128);final InputStreamReader in = new InputStreamReader(input, encoding);
        __CLR4_4_12n2nkylvdy9j.R.inc(129);copy(in, output);
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}


    // ----------------------------------------------------------------
    // Reader -> OutputStream
    // ----------------------------------------------------------------

    /**
     * Serialize chars from a {@code Reader} to bytes on an
     * {@code OutputStream}, and flush the {@code OutputStream}.
     * Uses the default platform encoding.
     * @param input the {@code Reader} to read from
     * @param output the {@code OutputStream} to write to
     * @throws IOException In case of an I/O problem
     * @deprecated 2.5 use {@link #copy(Reader, OutputStream, String)} instead
     */
    @Deprecated
    public static void copy(
            final Reader input,
            final OutputStream output)
                throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(130);
        // make explicit the dependency on the default encoding
        __CLR4_4_12n2nkylvdy9j.R.inc(131);final OutputStreamWriter out = new OutputStreamWriter(output, Charset.defaultCharset());
        __CLR4_4_12n2nkylvdy9j.R.inc(132);copy(input, out);
        // XXX Unless anyone is planning on rewriting OutputStreamWriter, we
        // have to flush here.
        __CLR4_4_12n2nkylvdy9j.R.inc(133);out.flush();
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    /**
     * Serialize chars from a {@code Reader} to bytes on an
     * {@code OutputStream}, and flush the {@code OutputStream}.
     * @param input the {@code Reader} to read from
     * @param output the {@code OutputStream} to write to
     * @param encoding The name of a supported character encoding. See the
     * <a href="http://www.iana.org/assignments/character-sets">IANA
     * Charset Registry</a> for a list of valid encoding types.
     * @throws IOException In case of an I/O problem
     * @since 2.5
     */
    public static void copy(
            final Reader input,
            final OutputStream output,
            final String encoding)
                throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(134);
        __CLR4_4_12n2nkylvdy9j.R.inc(135);final OutputStreamWriter out = new OutputStreamWriter(output, encoding);
        __CLR4_4_12n2nkylvdy9j.R.inc(136);copy(input, out);
        // XXX Unless anyone is planning on rewriting OutputStreamWriter, we
        // have to flush here.
        __CLR4_4_12n2nkylvdy9j.R.inc(137);out.flush();
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    // ----------------------------------------------------------------
    // String -> OutputStream
    // ----------------------------------------------------------------

    /**
     * Serialize chars from a {@code String} to bytes on an
     * {@code OutputStream}, and
     * flush the {@code OutputStream}.
     * Uses the platform default encoding.
     * @param input the {@code String} to read from
     * @param output the {@code OutputStream} to write to
     * @throws IOException In case of an I/O problem
     * @deprecated 2.5 use {@link #copy(String, OutputStream, String)} instead
     */
    @Deprecated
    public static void copy(
            final String input,
            final OutputStream output)
                throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(138);
        __CLR4_4_12n2nkylvdy9j.R.inc(139);final StringReader in = new StringReader(input);
        // make explicit the dependency on the default encoding
        __CLR4_4_12n2nkylvdy9j.R.inc(140);final OutputStreamWriter out = new OutputStreamWriter(output, Charset.defaultCharset());
        __CLR4_4_12n2nkylvdy9j.R.inc(141);copy(in, out);
        // XXX Unless anyone is planning on rewriting OutputStreamWriter, we
        // have to flush here.
        __CLR4_4_12n2nkylvdy9j.R.inc(142);out.flush();
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    /**
     * Serialize chars from a {@code String} to bytes on an
     * {@code OutputStream}, and
     * flush the {@code OutputStream}.
     * @param input the {@code String} to read from
     * @param output the {@code OutputStream} to write to
     * @param encoding The name of a supported character encoding. See the
     * <a href="http://www.iana.org/assignments/character-sets">IANA
     * Charset Registry</a> for a list of valid encoding types.
     * @throws IOException In case of an I/O problem
     * @since 2.5
     */
    public static void copy(
            final String input,
            final OutputStream output,
            final String encoding)
                throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(143);
        __CLR4_4_12n2nkylvdy9j.R.inc(144);final StringReader in = new StringReader(input);
        __CLR4_4_12n2nkylvdy9j.R.inc(145);final OutputStreamWriter out = new OutputStreamWriter(output, encoding);
        __CLR4_4_12n2nkylvdy9j.R.inc(146);copy(in, out);
        // XXX Unless anyone is planning on rewriting OutputStreamWriter, we
        // have to flush here.
        __CLR4_4_12n2nkylvdy9j.R.inc(147);out.flush();
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

    // ----------------------------------------------------------------
    // String -> Writer
    // ----------------------------------------------------------------

    /**
     * Copies chars from a {@code String} to a {@code Writer}.
     * @param input the {@code String} to read from
     * @param output the {@code Writer} to write to
     * @throws IOException In case of an I/O problem
     */
    public static void copy(final String input, final Writer output)
                throws IOException {try{__CLR4_4_12n2nkylvdy9j.R.inc(148);
        __CLR4_4_12n2nkylvdy9j.R.inc(149);output.write(input);
    }finally{__CLR4_4_12n2nkylvdy9j.R.flushNeeded();}}

}
