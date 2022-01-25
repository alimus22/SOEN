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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.output.AppendableWriter;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.io.output.ThresholdingOutputStream;
import org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream;

/**
 * General IO stream manipulation utilities.
 * <p>
 * This class provides static utility methods for input/output operations.
 * <ul>
 * <li><b>[Deprecated]</b> closeQuietly - these methods close a stream ignoring nulls and exceptions
 * <li>toXxx/read - these methods read data from a stream
 * <li>write - these methods write data to a stream
 * <li>copy - these methods copy all the data from one stream to another
 * <li>contentEquals - these methods compare the content of two streams
 * </ul>
 * <p>
 * The byte-to-char methods and char-to-byte methods involve a conversion step.
 * Two methods are provided in each case, one that uses the platform default
 * encoding and the other which allows you to specify an encoding. You are
 * encouraged to always specify an encoding because relying on the platform
 * default can lead to unexpected results, for example when moving from
 * development to production.
 * <p>
 * All the methods in this class that read a stream are buffered internally.
 * This means that there is no cause to use a {@code BufferedInputStream}
 * or {@code BufferedReader}. The default buffer size of 4K has been shown
 * to be efficient in tests.
 * <p>
 * The various copy methods all delegate the actual copying to one of the following methods:
 * <ul>
 * <li>{@link #copyLarge(InputStream, OutputStream, byte[])}</li>
 * <li>{@link #copyLarge(InputStream, OutputStream, long, long, byte[])}</li>
 * <li>{@link #copyLarge(Reader, Writer, char[])}</li>
 * <li>{@link #copyLarge(Reader, Writer, long, long, char[])}</li>
 * </ul>
 * For example, {@link #copy(InputStream, OutputStream)} calls {@link #copyLarge(InputStream, OutputStream)}
 * which calls {@link #copy(InputStream, OutputStream, int)} which creates the buffer and calls
 * {@link #copyLarge(InputStream, OutputStream, byte[])}.
 * <p>
 * Applications can re-use buffers by using the underlying methods directly.
 * This may improve performance for applications that need to do a lot of copying.
 * <p>
 * Wherever possible, the methods in this class do <em>not</em> flush or close
 * the stream. This is to avoid making non-portable assumptions about the
 * streams' origin and further use. Thus the caller is still responsible for
 * closing streams after use.
 * <p>
 * Origin of code: Excalibur.
 */
public class IOUtils {public static class __CLR4_4_11xy1xykylvdz04{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3354,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // NOTE: This class is focused on InputStream, OutputStream, Reader and
    // Writer. Each method should take at least one of these as a parameter,
    // or return one of them.

    /**
     * CR char.
     *
     * @since 2.9.0
     */
    public static final int CR = '\r';

    /**
     * The default buffer size ({@value}) to use in copy methods.
     */
    public static final int DEFAULT_BUFFER_SIZE = 8192;

    /**
     * The system directory separator character.
     */
    public static final char DIR_SEPARATOR = File.separatorChar;

    /**
     * The Unix directory separator character.
     */
    public static final char DIR_SEPARATOR_UNIX = '/';

    /**
     * The Windows directory separator character.
     */
    public static final char DIR_SEPARATOR_WINDOWS = '\\';

    /**
     * A singleton empty byte array.
     *
     *  @since 2.9.0
     */
    public static final byte[] EMPTY_BYTE_ARRAY = {};

    /**
     * Represents the end-of-file (or stream).
     * @since 2.5 (made public)
     */
    public static final int EOF = -1;

    /**
     * LF char.
     *
     * @since 2.9.0
     */
    public static final int LF = '\n';

    /**
     * The system line separator string.
     *
     * @deprecated Use {@link System#lineSeparator()}.
     */
    @Deprecated
    public static final String LINE_SEPARATOR = System.lineSeparator();

    /**
     * The Unix line separator string.
     *
     * @see StandardLineSeparator#LF
     */
    public static final String LINE_SEPARATOR_UNIX = StandardLineSeparator.LF.getString();

    /**
     * The Windows line separator string.
     *
     * @see StandardLineSeparator#CRLF
     */
    public static final String LINE_SEPARATOR_WINDOWS = StandardLineSeparator.CRLF.getString();

    /**
     * Internal byte array buffer.
     */
    private static final ThreadLocal<byte[]> SKIP_BYTE_BUFFER = ThreadLocal.withInitial(IOUtils::byteArray);

    /**
     * Internal byte array buffer.
     */
    private static final ThreadLocal<char[]> SKIP_CHAR_BUFFER = ThreadLocal.withInitial(IOUtils::charArray);

    /**
     * Returns the given InputStream if it is already a {@link BufferedInputStream}, otherwise creates a
     * BufferedInputStream from the given InputStream.
     *
     * @param inputStream the InputStream to wrap or return (not null)
     * @return the given InputStream or a new {@link BufferedInputStream} for the given InputStream
     * @throws NullPointerException if the input parameter is null
     * @since 2.5
     */
    @SuppressWarnings("resource") // parameter null check
    public static BufferedInputStream buffer(final InputStream inputStream) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2518);
        // reject null early on rather than waiting for IO operation to fail
        // not checked by BufferedInputStream
        __CLR4_4_11xy1xykylvdz04.R.inc(2519);Objects.requireNonNull(inputStream, "inputStream");
        __CLR4_4_11xy1xykylvdz04.R.inc(2520);return (((inputStream instanceof BufferedInputStream )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2521)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2522)==0&false))?
                (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given InputStream if it is already a {@link BufferedInputStream}, otherwise creates a
     * BufferedInputStream from the given InputStream.
     *
     * @param inputStream the InputStream to wrap or return (not null)
     * @param size the buffer size, if a new BufferedInputStream is created.
     * @return the given InputStream or a new {@link BufferedInputStream} for the given InputStream
     * @throws NullPointerException if the input parameter is null
     * @since 2.5
     */
    @SuppressWarnings("resource") // parameter null check
    public static BufferedInputStream buffer(final InputStream inputStream, final int size) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2523);
        // reject null early on rather than waiting for IO operation to fail
        // not checked by BufferedInputStream
        __CLR4_4_11xy1xykylvdz04.R.inc(2524);Objects.requireNonNull(inputStream, "inputStream");
        __CLR4_4_11xy1xykylvdz04.R.inc(2525);return (((inputStream instanceof BufferedInputStream )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2526)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2527)==0&false))?
                (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, size);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given OutputStream if it is already a {@link BufferedOutputStream}, otherwise creates a
     * BufferedOutputStream from the given OutputStream.
     *
     * @param outputStream the OutputStream to wrap or return (not null)
     * @return the given OutputStream or a new {@link BufferedOutputStream} for the given OutputStream
     * @throws NullPointerException if the input parameter is null
     * @since 2.5
     */
    @SuppressWarnings("resource") // parameter null check
    public static BufferedOutputStream buffer(final OutputStream outputStream) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2528);
        // reject null early on rather than waiting for IO operation to fail
        // not checked by BufferedInputStream
        __CLR4_4_11xy1xykylvdz04.R.inc(2529);Objects.requireNonNull(outputStream, "outputStream");
        __CLR4_4_11xy1xykylvdz04.R.inc(2530);return (((outputStream instanceof BufferedOutputStream )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2531)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2532)==0&false))?
                (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given OutputStream if it is already a {@link BufferedOutputStream}, otherwise creates a
     * BufferedOutputStream from the given OutputStream.
     *
     * @param outputStream the OutputStream to wrap or return (not null)
     * @param size the buffer size, if a new BufferedOutputStream is created.
     * @return the given OutputStream or a new {@link BufferedOutputStream} for the given OutputStream
     * @throws NullPointerException if the input parameter is null
     * @since 2.5
     */
    @SuppressWarnings("resource") // parameter null check
    public static BufferedOutputStream buffer(final OutputStream outputStream, final int size) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2533);
        // reject null early on rather than waiting for IO operation to fail
        // not checked by BufferedInputStream
        __CLR4_4_11xy1xykylvdz04.R.inc(2534);Objects.requireNonNull(outputStream, "outputStream");
        __CLR4_4_11xy1xykylvdz04.R.inc(2535);return (((outputStream instanceof BufferedOutputStream )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2536)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2537)==0&false))?
                (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, size);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given reader if it is already a {@link BufferedReader}, otherwise creates a BufferedReader from
     * the given reader.
     *
     * @param reader the reader to wrap or return (not null)
     * @return the given reader or a new {@link BufferedReader} for the given reader
     * @throws NullPointerException if the input parameter is null
     * @since 2.5
     */
    public static BufferedReader buffer(final Reader reader) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2538);
        __CLR4_4_11xy1xykylvdz04.R.inc(2539);return (((reader instanceof BufferedReader )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2540)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2541)==0&false))? (BufferedReader) reader : new BufferedReader(reader);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given reader if it is already a {@link BufferedReader}, otherwise creates a BufferedReader from the
     * given reader.
     *
     * @param reader the reader to wrap or return (not null)
     * @param size the buffer size, if a new BufferedReader is created.
     * @return the given reader or a new {@link BufferedReader} for the given reader
     * @throws NullPointerException if the input parameter is null
     * @since 2.5
     */
    public static BufferedReader buffer(final Reader reader, final int size) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2542);
        __CLR4_4_11xy1xykylvdz04.R.inc(2543);return (((reader instanceof BufferedReader )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2544)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2545)==0&false))? (BufferedReader) reader : new BufferedReader(reader, size);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given Writer if it is already a {@link BufferedWriter}, otherwise creates a BufferedWriter from the
     * given Writer.
     *
     * @param writer the Writer to wrap or return (not null)
     * @return the given Writer or a new {@link BufferedWriter} for the given Writer
     * @throws NullPointerException if the input parameter is null
     * @since 2.5
     */
    public static BufferedWriter buffer(final Writer writer) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2546);
        __CLR4_4_11xy1xykylvdz04.R.inc(2547);return (((writer instanceof BufferedWriter )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2548)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2549)==0&false))? (BufferedWriter) writer : new BufferedWriter(writer);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given Writer if it is already a {@link BufferedWriter}, otherwise creates a BufferedWriter from the
     * given Writer.
     *
     * @param writer the Writer to wrap or return (not null)
     * @param size the buffer size, if a new BufferedWriter is created.
     * @return the given Writer or a new {@link BufferedWriter} for the given Writer
     * @throws NullPointerException if the input parameter is null
     * @since 2.5
     */
    public static BufferedWriter buffer(final Writer writer, final int size) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2550);
        __CLR4_4_11xy1xykylvdz04.R.inc(2551);return (((writer instanceof BufferedWriter )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2552)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2553)==0&false))? (BufferedWriter) writer : new BufferedWriter(writer, size);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns a new byte array of size {@link #DEFAULT_BUFFER_SIZE}.
     *
     * @return a new byte array of size {@link #DEFAULT_BUFFER_SIZE}.
     * @since 2.9.0
     */
    public static byte[] byteArray() {try{__CLR4_4_11xy1xykylvdz04.R.inc(2554);
        __CLR4_4_11xy1xykylvdz04.R.inc(2555);return byteArray(DEFAULT_BUFFER_SIZE);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns a new byte array of the given size.
     *
     * TODO Consider guarding or warning against large allocations...
     *
     * @param size array size.
     * @return a new byte array of the given size.
     * @since 2.9.0
     */
    public static byte[] byteArray(final int size) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2556);
        __CLR4_4_11xy1xykylvdz04.R.inc(2557);return new byte[size];
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns a new char array of size {@link #DEFAULT_BUFFER_SIZE}.
     *
     * @return a new char array of size {@link #DEFAULT_BUFFER_SIZE}.
     * @since 2.9.0
     */
    private static char[] charArray() {try{__CLR4_4_11xy1xykylvdz04.R.inc(2558);
        __CLR4_4_11xy1xykylvdz04.R.inc(2559);return charArray(DEFAULT_BUFFER_SIZE);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns a new char array of the given size.
     *
     * TODO Consider guarding or warning against large allocations...
     *
     * @param size array size.
     * @return a new char array of the given size.
     * @since 2.9.0
     */
    private static char[] charArray(final int size) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2560);
        __CLR4_4_11xy1xykylvdz04.R.inc(2561);return new char[size];
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes the given {@link Closeable} as a null-safe operation.
     *
     * @param closeable The resource to close, may be null.
     * @throws IOException if an I/O error occurs.
     * @since 2.7
     */
    public static void close(final Closeable closeable) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2562);
        __CLR4_4_11xy1xykylvdz04.R.inc(2563);if ((((closeable != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2564)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2565)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2566);closeable.close();
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes the given {@link Closeable} as a null-safe operation.
     *
     * @param closeables The resource(s) to close, may be null.
     * @throws IOException if an I/O error occurs.
     * @since 2.8.0
     */
    public static void close(final Closeable... closeables) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2567);
        __CLR4_4_11xy1xykylvdz04.R.inc(2568);if ((((closeables != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2569)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2570)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2571);for (final Closeable closeable : closeables) {{
                __CLR4_4_11xy1xykylvdz04.R.inc(2572);close(closeable);
            }
        }}
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes the given {@link Closeable} as a null-safe operation.
     *
     * @param closeable The resource to close, may be null.
     * @param consumer Consume the IOException thrown by {@link Closeable#close()}.
     * @throws IOException if an I/O error occurs.
     * @since 2.7
     */
    public static void close(final Closeable closeable, final IOConsumer<IOException> consumer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2573);
        __CLR4_4_11xy1xykylvdz04.R.inc(2574);if ((((closeable != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2575)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2576)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2577);try {
                __CLR4_4_11xy1xykylvdz04.R.inc(2578);closeable.close();
            } catch (final IOException e) {
                __CLR4_4_11xy1xykylvdz04.R.inc(2579);if ((((consumer != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2580)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2581)==0&false))) {{
                    __CLR4_4_11xy1xykylvdz04.R.inc(2582);consumer.accept(e);
                }
            }}
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes a URLConnection.
     *
     * @param conn the connection to close.
     * @since 2.4
     */
    public static void close(final URLConnection conn) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2583);
        __CLR4_4_11xy1xykylvdz04.R.inc(2584);if ((((conn instanceof HttpURLConnection)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2585)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2586)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2587);((HttpURLConnection) conn).disconnect();
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes a {@code Closeable} unconditionally.
     *
     * <p>
     * Equivalent to {@link Closeable#close()}, except any exceptions will be ignored. This is typically used in
     * finally blocks.
     * <p>
     * Example code:
     * </p>
     * <pre>
     * Closeable closeable = null;
     * try {
     *     closeable = new FileReader(&quot;foo.txt&quot;);
     *     // process closeable
     *     closeable.close();
     * } catch (Exception e) {
     *     // error handling
     * } finally {
     *     IOUtils.closeQuietly(closeable);
     * }
     * </pre>
     * <p>
     * Closing all streams:
     * </p>
     * <pre>
     * try {
     *     return IOUtils.copy(inputStream, outputStream);
     * } finally {
     *     IOUtils.closeQuietly(inputStream);
     *     IOUtils.closeQuietly(outputStream);
     * }
     * </pre>
     * <p>
     * Also consider using a try-with-resources statement where appropriate.
     * </p>
     *
     * @param closeable the objects to close, may be null or already closed
     * @since 2.0
     *
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    public static void closeQuietly(final Closeable closeable) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2588);
        __CLR4_4_11xy1xykylvdz04.R.inc(2589);closeQuietly(closeable, (Consumer<IOException>) null);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes a {@code Closeable} unconditionally.
     * <p>
     * Equivalent to {@link Closeable#close()}, except any exceptions will be ignored.
     * <p>
     * This is typically used in finally blocks to ensure that the closeable is closed
     * even if an Exception was thrown before the normal close statement was reached.
     * <br>
     * <b>It should not be used to replace the close statement(s)
     * which should be present for the non-exceptional case.</b>
     * <br>
     * It is only intended to simplify tidying up where normal processing has already failed
     * and reporting close failure as well is not necessary or useful.
     * <p>
     * Example code:
     * </p>
     * <pre>
     * Closeable closeable = null;
     * try {
     *     closeable = new FileReader(&quot;foo.txt&quot;);
     *     // processing using the closeable; may throw an Exception
     *     closeable.close(); // Normal close - exceptions not ignored
     * } catch (Exception e) {
     *     // error handling
     * } finally {
     *     <b>IOUtils.closeQuietly(closeable); // In case normal close was skipped due to Exception</b>
     * }
     * </pre>
     * <p>
     * Closing all streams:
     * <br>
     * <pre>
     * try {
     *     return IOUtils.copy(inputStream, outputStream);
     * } finally {
     *     IOUtils.closeQuietly(inputStream, outputStream);
     * }
     * </pre>
     * <p>
     * Also consider using a try-with-resources statement where appropriate.
     * </p>
     * @param closeables the objects to close, may be null or already closed
     * @see #closeQuietly(Closeable)
     * @since 2.5
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    public static void closeQuietly(final Closeable... closeables) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2590);
        __CLR4_4_11xy1xykylvdz04.R.inc(2591);if ((((closeables == null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2592)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2593)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2594);return;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2595);for (final Closeable closeable : closeables) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2596);closeQuietly(closeable);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes the given {@link Closeable} as a null-safe operation while consuming IOException by the given {@code consumer}.
     *
     * @param closeable The resource to close, may be null.
     * @param consumer Consumes the IOException thrown by {@link Closeable#close()}.
     * @since 2.7
     */
    public static void closeQuietly(final Closeable closeable, final Consumer<IOException> consumer) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2597);
        __CLR4_4_11xy1xykylvdz04.R.inc(2598);if ((((closeable != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2599)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2600)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2601);try {
                __CLR4_4_11xy1xykylvdz04.R.inc(2602);closeable.close();
            } catch (final IOException e) {
                __CLR4_4_11xy1xykylvdz04.R.inc(2603);if ((((consumer != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2604)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2605)==0&false))) {{
                    __CLR4_4_11xy1xykylvdz04.R.inc(2606);consumer.accept(e);
                }
            }}
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes an {@code InputStream} unconditionally.
     * <p>
     * Equivalent to {@link InputStream#close()}, except any exceptions will be ignored.
     * This is typically used in finally blocks.
     * <p>
     * Example code:
     * <pre>
     *   byte[] data = new byte[1024];
     *   InputStream in = null;
     *   try {
     *       in = new FileInputStream("foo.txt");
     *       in.read(data);
     *       in.close(); //close errors are handled
     *   } catch (Exception e) {
     *       // error handling
     *   } finally {
     *       IOUtils.closeQuietly(in);
     *   }
     * </pre>
     * <p>
     * Also consider using a try-with-resources statement where appropriate.
     * </p>
     *
     * @param input the InputStream to close, may be null or already closed
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    public static void closeQuietly(final InputStream input) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2607);
        __CLR4_4_11xy1xykylvdz04.R.inc(2608);closeQuietly((Closeable) input);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes an {@code OutputStream} unconditionally.
     * <p>
     * Equivalent to {@link OutputStream#close()}, except any exceptions will be ignored.
     * This is typically used in finally blocks.
     * <p>
     * Example code:
     * <pre>
     * byte[] data = "Hello, World".getBytes();
     *
     * OutputStream out = null;
     * try {
     *     out = new FileOutputStream("foo.txt");
     *     out.write(data);
     *     out.close(); //close errors are handled
     * } catch (IOException e) {
     *     // error handling
     * } finally {
     *     IOUtils.closeQuietly(out);
     * }
     * </pre>
     * <p>
     * Also consider using a try-with-resources statement where appropriate.
     * </p>
     *
     * @param output the OutputStream to close, may be null or already closed
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    public static void closeQuietly(final OutputStream output) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2609);
        __CLR4_4_11xy1xykylvdz04.R.inc(2610);closeQuietly((Closeable) output);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes an {@code Reader} unconditionally.
     * <p>
     * Equivalent to {@link Reader#close()}, except any exceptions will be ignored.
     * This is typically used in finally blocks.
     * <p>
     * Example code:
     * <pre>
     *   char[] data = new char[1024];
     *   Reader in = null;
     *   try {
     *       in = new FileReader("foo.txt");
     *       in.read(data);
     *       in.close(); //close errors are handled
     *   } catch (Exception e) {
     *       // error handling
     *   } finally {
     *       IOUtils.closeQuietly(in);
     *   }
     * </pre>
     * <p>
     * Also consider using a try-with-resources statement where appropriate.
     * </p>
     *
     * @param reader the Reader to close, may be null or already closed
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    public static void closeQuietly(final Reader reader) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2611);
        __CLR4_4_11xy1xykylvdz04.R.inc(2612);closeQuietly((Closeable) reader);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes a {@code Selector} unconditionally.
     * <p>
     * Equivalent to {@link Selector#close()}, except any exceptions will be ignored.
     * This is typically used in finally blocks.
     * <p>
     * Example code:
     * <pre>
     *   Selector selector = null;
     *   try {
     *       selector = Selector.open();
     *       // process socket
     *
     *   } catch (Exception e) {
     *       // error handling
     *   } finally {
     *       IOUtils.closeQuietly(selector);
     *   }
     * </pre>
     * <p>
     * Also consider using a try-with-resources statement where appropriate.
     * </p>
     *
     * @param selector the Selector to close, may be null or already closed
     * @since 2.2
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    public static void closeQuietly(final Selector selector) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2613);
        __CLR4_4_11xy1xykylvdz04.R.inc(2614);closeQuietly((Closeable) selector);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes a {@code ServerSocket} unconditionally.
     * <p>
     * Equivalent to {@link ServerSocket#close()}, except any exceptions will be ignored.
     * This is typically used in finally blocks.
     * <p>
     * Example code:
     * <pre>
     *   ServerSocket socket = null;
     *   try {
     *       socket = new ServerSocket();
     *       // process socket
     *       socket.close();
     *   } catch (Exception e) {
     *       // error handling
     *   } finally {
     *       IOUtils.closeQuietly(socket);
     *   }
     * </pre>
     * <p>
     * Also consider using a try-with-resources statement where appropriate.
     * </p>
     *
     * @param serverSocket the ServerSocket to close, may be null or already closed
     * @since 2.2
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    public static void closeQuietly(final ServerSocket serverSocket) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2615);
        __CLR4_4_11xy1xykylvdz04.R.inc(2616);closeQuietly((Closeable) serverSocket);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes a {@code Socket} unconditionally.
     * <p>
     * Equivalent to {@link Socket#close()}, except any exceptions will be ignored.
     * This is typically used in finally blocks.
     * <p>
     * Example code:
     * <pre>
     *   Socket socket = null;
     *   try {
     *       socket = new Socket("http://www.foo.com/", 80);
     *       // process socket
     *       socket.close();
     *   } catch (Exception e) {
     *       // error handling
     *   } finally {
     *       IOUtils.closeQuietly(socket);
     *   }
     * </pre>
     * <p>
     * Also consider using a try-with-resources statement where appropriate.
     * </p>
     *
     * @param socket the Socket to close, may be null or already closed
     * @since 2.0
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    public static void closeQuietly(final Socket socket) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2617);
        __CLR4_4_11xy1xykylvdz04.R.inc(2618);closeQuietly((Closeable) socket);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Closes an {@code Writer} unconditionally.
     * <p>
     * Equivalent to {@link Writer#close()}, except any exceptions will be ignored.
     * This is typically used in finally blocks.
     * <p>
     * Example code:
     * <pre>
     *   Writer out = null;
     *   try {
     *       out = new StringWriter();
     *       out.write("Hello World");
     *       out.close(); //close errors are handled
     *   } catch (Exception e) {
     *       // error handling
     *   } finally {
     *       IOUtils.closeQuietly(out);
     *   }
     * </pre>
     * <p>
     * Also consider using a try-with-resources statement where appropriate.
     * </p>
     *
     * @param writer the Writer to close, may be null or already closed
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    public static void closeQuietly(final Writer writer) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2619);
        __CLR4_4_11xy1xykylvdz04.R.inc(2620);closeQuietly((Closeable) writer);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Consumes bytes from a {@code InputStream} and ignores them.
     * <p>
     * The buffer size is given by {@link #DEFAULT_BUFFER_SIZE}.
     * </p>
     *
     * @param input the {@code InputStream} to read.
     * @return the number of bytes copied. or {@code 0} if {@code input is null}.
     * @throws NullPointerException if the InputStream is {@code null}.
     * @throws NullPointerException if the OutputStream is {@code null}.
     * @throws IOException if an I/O error occurs.
     * @since 2.8.0
     */
    public static long consume(final InputStream input)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2621);
        __CLR4_4_11xy1xykylvdz04.R.inc(2622);return copyLarge(input, NullOutputStream.NULL_OUTPUT_STREAM, getByteArray());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Compares the contents of two Streams to determine if they are equal or
     * not.
     * <p>
     * This method buffers the input internally using
     * {@code BufferedInputStream} if they are not already buffered.
     * </p>
     *
     * @param input1 the first stream
     * @param input2 the second stream
     * @return true if the content of the streams are equal or they both don't
     * exist, false otherwise
     * @throws NullPointerException if either input is null
     * @throws IOException          if an I/O error occurs
     */
    public static boolean contentEquals(final InputStream input1, final InputStream input2) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2623);
        // Before making any changes, please test with
        // org.apache.commons.io.jmh.IOUtilsContentEqualsInputStreamsBenchmark
        __CLR4_4_11xy1xykylvdz04.R.inc(2624);if ((((input1 == input2)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2625)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2626)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2627);return true;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2628);if ((((input1 == null || input2 == null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2629)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2630)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2631);return false;
        }

        // reuse one
        }__CLR4_4_11xy1xykylvdz04.R.inc(2632);final byte[] array1 = getByteArray();
        // allocate another
        __CLR4_4_11xy1xykylvdz04.R.inc(2633);final byte[] array2 = byteArray();
        __CLR4_4_11xy1xykylvdz04.R.inc(2634);int pos1;
        __CLR4_4_11xy1xykylvdz04.R.inc(2635);int pos2;
        __CLR4_4_11xy1xykylvdz04.R.inc(2636);int count1;
        __CLR4_4_11xy1xykylvdz04.R.inc(2637);int count2;
        __CLR4_4_11xy1xykylvdz04.R.inc(2638);while (true) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2639);pos1 = 0;
            __CLR4_4_11xy1xykylvdz04.R.inc(2640);pos2 = 0;
            __CLR4_4_11xy1xykylvdz04.R.inc(2641);for (int index = 0; (((index < DEFAULT_BUFFER_SIZE)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2642)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2643)==0&false)); index++) {{
                __CLR4_4_11xy1xykylvdz04.R.inc(2644);if ((((pos1 == index)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2645)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2646)==0&false))) {{
                    __CLR4_4_11xy1xykylvdz04.R.inc(2647);do {{
                        __CLR4_4_11xy1xykylvdz04.R.inc(2648);count1 = input1.read(array1, pos1, DEFAULT_BUFFER_SIZE - pos1);
                    } }while ((((count1 == 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2649)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2650)==0&false)));
                    __CLR4_4_11xy1xykylvdz04.R.inc(2651);if ((((count1 == EOF)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2652)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2653)==0&false))) {{
                        __CLR4_4_11xy1xykylvdz04.R.inc(2654);return pos2 == index && input2.read() == EOF;
                    }
                    }__CLR4_4_11xy1xykylvdz04.R.inc(2655);pos1 += count1;
                }
                }__CLR4_4_11xy1xykylvdz04.R.inc(2656);if ((((pos2 == index)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2657)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2658)==0&false))) {{
                    __CLR4_4_11xy1xykylvdz04.R.inc(2659);do {{
                        __CLR4_4_11xy1xykylvdz04.R.inc(2660);count2 = input2.read(array2, pos2, DEFAULT_BUFFER_SIZE - pos2);
                    } }while ((((count2 == 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2661)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2662)==0&false)));
                    __CLR4_4_11xy1xykylvdz04.R.inc(2663);if ((((count2 == EOF)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2664)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2665)==0&false))) {{
                        __CLR4_4_11xy1xykylvdz04.R.inc(2666);return pos1 == index && input1.read() == EOF;
                    }
                    }__CLR4_4_11xy1xykylvdz04.R.inc(2667);pos2 += count2;
                }
                }__CLR4_4_11xy1xykylvdz04.R.inc(2668);if ((((array1[index] != array2[index])&&(__CLR4_4_11xy1xykylvdz04.R.iget(2669)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2670)==0&false))) {{
                    __CLR4_4_11xy1xykylvdz04.R.inc(2671);return false;
                }
            }}
        }}
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Compares the contents of two Readers to determine if they are equal or not.
     * <p>
     * This method buffers the input internally using {@code BufferedReader} if they are not already buffered.
     * </p>
     *
     * @param input1 the first reader
     * @param input2 the second reader
     * @return true if the content of the readers are equal or they both don't exist, false otherwise
     * @throws NullPointerException if either input is null
     * @throws IOException if an I/O error occurs
     * @since 1.1
     */
    public static boolean contentEquals(final Reader input1, final Reader input2) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2672);
        __CLR4_4_11xy1xykylvdz04.R.inc(2673);if ((((input1 == input2)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2674)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2675)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2676);return true;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2677);if ((((input1 == null || input2 == null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2678)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2679)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2680);return false;
        }

        // reuse one
        }__CLR4_4_11xy1xykylvdz04.R.inc(2681);final char[] array1 = getCharArray();
        // but allocate another
        __CLR4_4_11xy1xykylvdz04.R.inc(2682);final char[] array2 = charArray();
        __CLR4_4_11xy1xykylvdz04.R.inc(2683);int pos1;
        __CLR4_4_11xy1xykylvdz04.R.inc(2684);int pos2;
        __CLR4_4_11xy1xykylvdz04.R.inc(2685);int count1;
        __CLR4_4_11xy1xykylvdz04.R.inc(2686);int count2;
        __CLR4_4_11xy1xykylvdz04.R.inc(2687);while (true) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2688);pos1 = 0;
            __CLR4_4_11xy1xykylvdz04.R.inc(2689);pos2 = 0;
            __CLR4_4_11xy1xykylvdz04.R.inc(2690);for (int index = 0; (((index < DEFAULT_BUFFER_SIZE)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2691)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2692)==0&false)); index++) {{
                __CLR4_4_11xy1xykylvdz04.R.inc(2693);if ((((pos1 == index)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2694)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2695)==0&false))) {{
                    __CLR4_4_11xy1xykylvdz04.R.inc(2696);do {{
                        __CLR4_4_11xy1xykylvdz04.R.inc(2697);count1 = input1.read(array1, pos1, DEFAULT_BUFFER_SIZE - pos1);
                    } }while ((((count1 == 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2698)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2699)==0&false)));
                    __CLR4_4_11xy1xykylvdz04.R.inc(2700);if ((((count1 == EOF)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2701)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2702)==0&false))) {{
                        __CLR4_4_11xy1xykylvdz04.R.inc(2703);return pos2 == index && input2.read() == EOF;
                    }
                    }__CLR4_4_11xy1xykylvdz04.R.inc(2704);pos1 += count1;
                }
                }__CLR4_4_11xy1xykylvdz04.R.inc(2705);if ((((pos2 == index)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2706)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2707)==0&false))) {{
                    __CLR4_4_11xy1xykylvdz04.R.inc(2708);do {{
                        __CLR4_4_11xy1xykylvdz04.R.inc(2709);count2 = input2.read(array2, pos2, DEFAULT_BUFFER_SIZE - pos2);
                    } }while ((((count2 == 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2710)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2711)==0&false)));
                    __CLR4_4_11xy1xykylvdz04.R.inc(2712);if ((((count2 == EOF)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2713)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2714)==0&false))) {{
                        __CLR4_4_11xy1xykylvdz04.R.inc(2715);return pos1 == index && input1.read() == EOF;
                    }
                    }__CLR4_4_11xy1xykylvdz04.R.inc(2716);pos2 += count2;
                }
                }__CLR4_4_11xy1xykylvdz04.R.inc(2717);if ((((array1[index] != array2[index])&&(__CLR4_4_11xy1xykylvdz04.R.iget(2718)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2719)==0&false))) {{
                    __CLR4_4_11xy1xykylvdz04.R.inc(2720);return false;
                }
            }}
        }}
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Compares the contents of two Readers to determine if they are equal or
     * not, ignoring EOL characters.
     * <p>
     * This method buffers the input internally using
     * {@code BufferedReader} if they are not already buffered.
     *
     * @param reader1 the first reader
     * @param reader2 the second reader
     * @return true if the content of the readers are equal (ignoring EOL differences),  false otherwise
     * @throws NullPointerException if either input is null
     * @throws IOException          if an I/O error occurs
     * @since 2.2
     */
    @SuppressWarnings("resource")
    public static boolean contentEqualsIgnoreEOL(final Reader reader1, final Reader reader2)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2721);
        __CLR4_4_11xy1xykylvdz04.R.inc(2722);if ((((reader1 == reader2)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2723)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2724)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2725);return true;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2726);if ((((reader1 == null ^ reader2 == null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2727)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2728)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2729);return false;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2730);final BufferedReader br1 = toBufferedReader(reader1);
        __CLR4_4_11xy1xykylvdz04.R.inc(2731);final BufferedReader br2 = toBufferedReader(reader2);

        __CLR4_4_11xy1xykylvdz04.R.inc(2732);String line1 = br1.readLine();
        __CLR4_4_11xy1xykylvdz04.R.inc(2733);String line2 = br2.readLine();
        __CLR4_4_11xy1xykylvdz04.R.inc(2734);while ((((line1 != null && line1.equals(line2))&&(__CLR4_4_11xy1xykylvdz04.R.iget(2735)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2736)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2737);line1 = br1.readLine();
            __CLR4_4_11xy1xykylvdz04.R.inc(2738);line2 = br2.readLine();
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2739);return Objects.equals(line1, line2);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies bytes from an {@code InputStream} to an {@code OutputStream}.
     * <p>
     * This method buffers the input internally, so there is no need to use a {@code BufferedInputStream}.
     * </p>
     * <p>
     * Large streams (over 2GB) will return a bytes copied value of {@code -1} after the copy has completed since
     * the correct number of bytes cannot be returned as an int. For large streams use the
     * {@code copyLarge(InputStream, OutputStream)} method.
     * </p>
     *
     * @param inputStream the {@code InputStream} to read.
     * @param outputStream the {@code OutputStream} to write.
     * @return the number of bytes copied, or -1 if greater than {@link Integer#MAX_VALUE}.
     * @throws NullPointerException if the InputStream is {@code null}.
     * @throws NullPointerException if the OutputStream is {@code null}.
     * @throws IOException if an I/O error occurs.
     * @since 1.1
     */
    public static int copy(final InputStream inputStream, final OutputStream outputStream) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2740);
        __CLR4_4_11xy1xykylvdz04.R.inc(2741);final long count = copyLarge(inputStream, outputStream);
        __CLR4_4_11xy1xykylvdz04.R.inc(2742);if ((((count > Integer.MAX_VALUE)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2743)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2744)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2745);return EOF;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2746);return (int) count;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies bytes from an {@code InputStream} to an {@code OutputStream} using an internal buffer of the
     * given size.
     * <p>
     * This method buffers the input internally, so there is no need to use a {@code BufferedInputStream}.
     * </p>
     *
     * @param inputStream the {@code InputStream} to read.
     * @param outputStream the {@code OutputStream} to write to
     * @param bufferSize the bufferSize used to copy from the input to the output
     * @return the number of bytes copied.
     * @throws NullPointerException if the InputStream is {@code null}.
     * @throws NullPointerException if the OutputStream is {@code null}.
     * @throws IOException if an I/O error occurs.
     * @since 2.5
     */
    public static long copy(final InputStream inputStream, final OutputStream outputStream, final int bufferSize)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2747);
        __CLR4_4_11xy1xykylvdz04.R.inc(2748);return copyLarge(inputStream, outputStream, IOUtils.byteArray(bufferSize));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies bytes from an {@code InputStream} to chars on a
     * {@code Writer} using the default character encoding of the platform.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     * <p>
     * This method uses {@link InputStreamReader}.
     *
     * @param input the {@code InputStream} to read from
     * @param writer the {@code Writer} to write to
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated 2.5 use {@link #copy(InputStream, Writer, Charset)} instead
     */
    @Deprecated
    public static void copy(final InputStream input, final Writer writer)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2749);
        __CLR4_4_11xy1xykylvdz04.R.inc(2750);copy(input, writer, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies bytes from an {@code InputStream} to chars on a
     * {@code Writer} using the specified character encoding.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     * <p>
     * This method uses {@link InputStreamReader}.
     *
     * @param input the {@code InputStream} to read from
     * @param writer the {@code Writer} to write to
     * @param inputCharset the charset to use for the input stream, null means platform default
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static void copy(final InputStream input, final Writer writer, final Charset inputCharset)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2751);
        __CLR4_4_11xy1xykylvdz04.R.inc(2752);final InputStreamReader reader = new InputStreamReader(input, Charsets.toCharset(inputCharset));
        __CLR4_4_11xy1xykylvdz04.R.inc(2753);copy(reader, writer);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies bytes from an {@code InputStream} to chars on a
     * {@code Writer} using the specified character encoding.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method uses {@link InputStreamReader}.
     *
     * @param input the {@code InputStream} to read from
     * @param writer the {@code Writer} to write to
     * @param inputCharsetName the name of the requested charset for the InputStream, null means platform default
     * @throws NullPointerException                         if the input or output is null
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 1.1
     */
    public static void copy(final InputStream input, final Writer writer, final String inputCharsetName)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2754);
        __CLR4_4_11xy1xykylvdz04.R.inc(2755);copy(input, writer, Charsets.toCharset(inputCharsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies chars from a {@code Reader} to a {@code Appendable}.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     * <p>
     * Large streams (over 2GB) will return a chars copied value of
     * {@code -1} after the copy has completed since the correct
     * number of chars cannot be returned as an int. For large streams
     * use the {@code copyLarge(Reader, Writer)} method.
     *
     * @param reader the {@code Reader} to read from
     * @param output the {@code Appendable} to write to
     * @return the number of characters copied, or -1 if &gt; Integer.MAX_VALUE
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.7
     */
    public static long copy(final Reader reader, final Appendable output) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2756);
        __CLR4_4_11xy1xykylvdz04.R.inc(2757);return copy(reader, output, CharBuffer.allocate(DEFAULT_BUFFER_SIZE));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies chars from a {@code Reader} to an {@code Appendable}.
     * <p>
     * This method uses the provided buffer, so there is no need to use a
     * {@code BufferedReader}.
     * </p>
     *
     * @param reader the {@code Reader} to read from
     * @param output the {@code Appendable} to write to
     * @param buffer the buffer to be used for the copy
     * @return the number of characters copied
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.7
     */
    public static long copy(final Reader reader, final Appendable output, final CharBuffer buffer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2758);
        __CLR4_4_11xy1xykylvdz04.R.inc(2759);long count = 0;
        __CLR4_4_11xy1xykylvdz04.R.inc(2760);int n;
        __CLR4_4_11xy1xykylvdz04.R.inc(2761);while (EOF != (n = reader.read(buffer))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2764);buffer.flip();
            __CLR4_4_11xy1xykylvdz04.R.inc(2765);output.append(buffer, 0, n);
            __CLR4_4_11xy1xykylvdz04.R.inc(2766);count += n;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2767);return count;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies chars from a {@code Reader} to bytes on an
     * {@code OutputStream} using the default character encoding of the
     * platform, and calling flush.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     * <p>
     * Due to the implementation of OutputStreamWriter, this method performs a
     * flush.
     * <p>
     * This method uses {@link OutputStreamWriter}.
     *
     * @param reader the {@code Reader} to read from
     * @param output the {@code OutputStream} to write to
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated 2.5 use {@link #copy(Reader, OutputStream, Charset)} instead
     */
    @Deprecated
    public static void copy(final Reader reader, final OutputStream output)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2768);
        __CLR4_4_11xy1xykylvdz04.R.inc(2769);copy(reader, output, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies chars from a {@code Reader} to bytes on an
     * {@code OutputStream} using the specified character encoding, and
     * calling flush.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     * </p>
     * <p>
     * Due to the implementation of OutputStreamWriter, this method performs a
     * flush.
     * </p>
     * <p>
     * This method uses {@link OutputStreamWriter}.
     * </p>
     *
     * @param reader the {@code Reader} to read from
     * @param output the {@code OutputStream} to write to
     * @param outputCharset the charset to use for the OutputStream, null means platform default
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static void copy(final Reader reader, final OutputStream output, final Charset outputCharset)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2770);
        __CLR4_4_11xy1xykylvdz04.R.inc(2771);final OutputStreamWriter writer = new OutputStreamWriter(output, Charsets.toCharset(outputCharset));
        __CLR4_4_11xy1xykylvdz04.R.inc(2772);copy(reader, writer);
        // XXX Unless anyone is planning on rewriting OutputStreamWriter,
        // we have to flush here.
        __CLR4_4_11xy1xykylvdz04.R.inc(2773);writer.flush();
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies chars from a {@code Reader} to bytes on an
     * {@code OutputStream} using the specified character encoding, and
     * calling flush.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * Due to the implementation of OutputStreamWriter, this method performs a
     * flush.
     * <p>
     * This method uses {@link OutputStreamWriter}.
     *
     * @param reader the {@code Reader} to read from
     * @param output the {@code OutputStream} to write to
     * @param outputCharsetName the name of the requested charset for the OutputStream, null means platform default
     * @throws NullPointerException                         if the input or output is null
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 1.1
     */
    public static void copy(final Reader reader, final OutputStream output, final String outputCharsetName)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2774);
        __CLR4_4_11xy1xykylvdz04.R.inc(2775);copy(reader, output, Charsets.toCharset(outputCharsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies chars from a {@code Reader} to a {@code Writer}.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     * <p>
     * Large streams (over 2GB) will return a chars copied value of
     * {@code -1} after the copy has completed since the correct
     * number of chars cannot be returned as an int. For large streams
     * use the {@code copyLarge(Reader, Writer)} method.
     *
     * @param reader the {@code Reader} to read.
     * @param writer the {@code Writer} to write.
     * @return the number of characters copied, or -1 if &gt; Integer.MAX_VALUE
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     */
    public static int copy(final Reader reader, final Writer writer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2776);
        __CLR4_4_11xy1xykylvdz04.R.inc(2777);final long count = copyLarge(reader, writer);
        __CLR4_4_11xy1xykylvdz04.R.inc(2778);if ((((count > Integer.MAX_VALUE)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2779)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2780)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2781);return EOF;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2782);return (int) count;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies bytes from a {@code URL} to an {@code OutputStream}.
     * <p>
     * This method buffers the input internally, so there is no need to use a {@code BufferedInputStream}.
     * </p>
     * <p>
     * The buffer size is given by {@link #DEFAULT_BUFFER_SIZE}.
     * </p>
     *
     * @param url the {@code URL} to read.
     * @param file the {@code OutputStream} to write.
     * @return the number of bytes copied.
     * @throws NullPointerException if the URL is {@code null}.
     * @throws NullPointerException if the OutputStream is {@code null}.
     * @throws IOException if an I/O error occurs.
     * @since 2.9.0
     */
    public static long copy(final URL url, final File file) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2783);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_11xy1xykylvdz04.R.inc(2784);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_11xy1xykylvdz04.R.inc(2785);}};OutputStream outputStream = Files.newOutputStream(Objects.requireNonNull(file, "file").toPath())) {
            __CLR4_4_11xy1xykylvdz04.R.inc(2786);return copy(url, outputStream);
        }
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies bytes from a {@code URL} to an {@code OutputStream}.
     * <p>
     * This method buffers the input internally, so there is no need to use a {@code BufferedInputStream}.
     * </p>
     * <p>
     * The buffer size is given by {@link #DEFAULT_BUFFER_SIZE}.
     * </p>
     *
     * @param url the {@code URL} to read.
     * @param outputStream the {@code OutputStream} to write.
     * @return the number of bytes copied.
     * @throws NullPointerException if the URL is {@code null}.
     * @throws NullPointerException if the OutputStream is {@code null}.
     * @throws IOException if an I/O error occurs.
     * @since 2.9.0
     */
    public static long copy(final URL url, final OutputStream outputStream) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2787);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_11xy1xykylvdz04.R.inc(2788);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_11xy1xykylvdz04.R.inc(2789);}};InputStream inputStream = Objects.requireNonNull(url, "url").openStream()) {
            __CLR4_4_11xy1xykylvdz04.R.inc(2790);return copyLarge(inputStream, outputStream);
        }
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies bytes from a large (over 2GB) {@code InputStream} to an
     * {@code OutputStream}.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     * </p>
     * <p>
     * The buffer size is given by {@link #DEFAULT_BUFFER_SIZE}.
     * </p>
     *
     * @param inputStream the {@code InputStream} to read.
     * @param outputStream the {@code OutputStream} to write.
     * @return the number of bytes copied.
     * @throws NullPointerException if the InputStream is {@code null}.
     * @throws NullPointerException if the OutputStream is {@code null}.
     * @throws IOException if an I/O error occurs.
     * @since 1.3
     */
    public static long copyLarge(final InputStream inputStream, final OutputStream outputStream)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2791);
        __CLR4_4_11xy1xykylvdz04.R.inc(2792);return copy(inputStream, outputStream, DEFAULT_BUFFER_SIZE);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies bytes from a large (over 2GB) {@code InputStream} to an
     * {@code OutputStream}.
     * <p>
     * This method uses the provided buffer, so there is no need to use a
     * {@code BufferedInputStream}.
     * </p>
     *
     * @param inputStream the {@code InputStream} to read.
     * @param outputStream the {@code OutputStream} to write.
     * @param buffer the buffer to use for the copy
     * @return the number of bytes copied.
     * @throws NullPointerException if the InputStream is {@code null}.
     * @throws NullPointerException if the OutputStream is {@code null}.
     * @throws IOException if an I/O error occurs.
     * @since 2.2
     */
    @SuppressWarnings("resource") // streams are closed by the caller.
    public static long copyLarge(final InputStream inputStream, final OutputStream outputStream, final byte[] buffer)
        throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2793);
        __CLR4_4_11xy1xykylvdz04.R.inc(2794);Objects.requireNonNull(inputStream, "inputStream");
        __CLR4_4_11xy1xykylvdz04.R.inc(2795);Objects.requireNonNull(outputStream, "outputStream");
        __CLR4_4_11xy1xykylvdz04.R.inc(2796);long count = 0;
        __CLR4_4_11xy1xykylvdz04.R.inc(2797);int n;
        __CLR4_4_11xy1xykylvdz04.R.inc(2798);while (EOF != (n = inputStream.read(buffer))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2801);outputStream.write(buffer, 0, n);
            __CLR4_4_11xy1xykylvdz04.R.inc(2802);count += n;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2803);return count;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies some or all bytes from a large (over 2GB) {@code InputStream} to an
     * {@code OutputStream}, optionally skipping input bytes.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     * </p>
     * <p>
     * Note that the implementation uses {@link #skip(InputStream, long)}.
     * This means that the method may be considerably less efficient than using the actual skip implementation,
     * this is done to guarantee that the correct number of characters are skipped.
     * </p>
     * The buffer size is given by {@link #DEFAULT_BUFFER_SIZE}.
     *
     * @param input the {@code InputStream} to read from
     * @param output the {@code OutputStream} to write to
     * @param inputOffset : number of bytes to skip from input before copying
     * -ve values are ignored
     * @param length : number of bytes to copy. -ve means all
     * @return the number of bytes copied
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.2
     */
    public static long copyLarge(final InputStream input, final OutputStream output, final long inputOffset,
                                 final long length) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2804);
        __CLR4_4_11xy1xykylvdz04.R.inc(2805);return copyLarge(input, output, inputOffset, length, getByteArray());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies some or all bytes from a large (over 2GB) {@code InputStream} to an
     * {@code OutputStream}, optionally skipping input bytes.
     * <p>
     * This method uses the provided buffer, so there is no need to use a
     * {@code BufferedInputStream}.
     * </p>
     * <p>
     * Note that the implementation uses {@link #skip(InputStream, long)}.
     * This means that the method may be considerably less efficient than using the actual skip implementation,
     * this is done to guarantee that the correct number of characters are skipped.
     * </p>
     *
     * @param input the {@code InputStream} to read from
     * @param output the {@code OutputStream} to write to
     * @param inputOffset : number of bytes to skip from input before copying
     * -ve values are ignored
     * @param length : number of bytes to copy. -ve means all
     * @param buffer the buffer to use for the copy
     * @return the number of bytes copied
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.2
     */
    public static long copyLarge(final InputStream input, final OutputStream output,
                                 final long inputOffset, final long length, final byte[] buffer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2806);
        __CLR4_4_11xy1xykylvdz04.R.inc(2807);if ((((inputOffset > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2808)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2809)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2810);skipFully(input, inputOffset);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2811);if ((((length == 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2812)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2813)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2814);return 0;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2815);final int bufferLength = buffer.length;
        __CLR4_4_11xy1xykylvdz04.R.inc(2816);int bytesToRead = bufferLength;
        __CLR4_4_11xy1xykylvdz04.R.inc(2817);if ((((length > 0 && length < bufferLength)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2818)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2819)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2820);bytesToRead = (int) length;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2821);int read;
        __CLR4_4_11xy1xykylvdz04.R.inc(2822);long totalRead = 0;
        __CLR4_4_11xy1xykylvdz04.R.inc(2823);while (bytesToRead > 0 && EOF != (read = input.read(buffer, 0, bytesToRead))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2826);output.write(buffer, 0, read);
            __CLR4_4_11xy1xykylvdz04.R.inc(2827);totalRead += read;
            __CLR4_4_11xy1xykylvdz04.R.inc(2828);if ((((length > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2829)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2830)==0&false))) {{ // only adjust length if not reading to the end
                // Note the cast must work because buffer.length is an integer
                __CLR4_4_11xy1xykylvdz04.R.inc(2831);bytesToRead = (int) Math.min(length - totalRead, bufferLength);
            }
        }}
        }__CLR4_4_11xy1xykylvdz04.R.inc(2832);return totalRead;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies chars from a large (over 2GB) {@code Reader} to a {@code Writer}.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     * <p>
     * The buffer size is given by {@link #DEFAULT_BUFFER_SIZE}.
     *
     * @param reader the {@code Reader} to source.
     * @param writer the {@code Writer} to target.
     * @return the number of characters copied
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.3
     */
    public static long copyLarge(final Reader reader, final Writer writer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2833);
        __CLR4_4_11xy1xykylvdz04.R.inc(2834);return copyLarge(reader, writer, getCharArray());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies chars from a large (over 2GB) {@code Reader} to a {@code Writer}.
     * <p>
     * This method uses the provided buffer, so there is no need to use a
     * {@code BufferedReader}.
     * <p>
     *
     * @param reader the {@code Reader} to source.
     * @param writer the {@code Writer} to target.
     * @param buffer the buffer to be used for the copy
     * @return the number of characters copied
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.2
     */
    public static long copyLarge(final Reader reader, final Writer writer, final char[] buffer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2835);
        __CLR4_4_11xy1xykylvdz04.R.inc(2836);long count = 0;
        __CLR4_4_11xy1xykylvdz04.R.inc(2837);int n;
        __CLR4_4_11xy1xykylvdz04.R.inc(2838);while (EOF != (n = reader.read(buffer))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2841);writer.write(buffer, 0, n);
            __CLR4_4_11xy1xykylvdz04.R.inc(2842);count += n;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2843);return count;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies some or all chars from a large (over 2GB) {@code InputStream} to an
     * {@code OutputStream}, optionally skipping input chars.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     * <p>
     * The buffer size is given by {@link #DEFAULT_BUFFER_SIZE}.
     *
     * @param reader the {@code Reader} to read from
     * @param writer the {@code Writer} to write to
     * @param inputOffset : number of chars to skip from input before copying
     * -ve values are ignored
     * @param length : number of chars to copy. -ve means all
     * @return the number of chars copied
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.2
     */
    public static long copyLarge(final Reader reader, final Writer writer, final long inputOffset, final long length)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2844);
        __CLR4_4_11xy1xykylvdz04.R.inc(2845);return copyLarge(reader, writer, inputOffset, length, getCharArray());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Copies some or all chars from a large (over 2GB) {@code InputStream} to an
     * {@code OutputStream}, optionally skipping input chars.
     * <p>
     * This method uses the provided buffer, so there is no need to use a
     * {@code BufferedReader}.
     * <p>
     *
     * @param reader the {@code Reader} to read from
     * @param writer the {@code Writer} to write to
     * @param inputOffset : number of chars to skip from input before copying
     * -ve values are ignored
     * @param length : number of chars to copy. -ve means all
     * @param buffer the buffer to be used for the copy
     * @return the number of chars copied
     * @throws NullPointerException if the input or output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.2
     */
    public static long copyLarge(final Reader reader, final Writer writer, final long inputOffset, final long length,
                                 final char[] buffer)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2846);
        __CLR4_4_11xy1xykylvdz04.R.inc(2847);if ((((inputOffset > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2848)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2849)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2850);skipFully(reader, inputOffset);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2851);if ((((length == 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2852)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2853)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2854);return 0;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2855);int bytesToRead = buffer.length;
        __CLR4_4_11xy1xykylvdz04.R.inc(2856);if ((((length > 0 && length < buffer.length)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2857)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2858)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2859);bytesToRead = (int) length;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2860);int read;
        __CLR4_4_11xy1xykylvdz04.R.inc(2861);long totalRead = 0;
        __CLR4_4_11xy1xykylvdz04.R.inc(2862);while (bytesToRead > 0 && EOF != (read = reader.read(buffer, 0, bytesToRead))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2865);writer.write(buffer, 0, read);
            __CLR4_4_11xy1xykylvdz04.R.inc(2866);totalRead += read;
            __CLR4_4_11xy1xykylvdz04.R.inc(2867);if ((((length > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2868)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2869)==0&false))) {{ // only adjust length if not reading to the end
                // Note the cast must work because buffer.length is an integer
                __CLR4_4_11xy1xykylvdz04.R.inc(2870);bytesToRead = (int) Math.min(length - totalRead, buffer.length);
            }
        }}
        }__CLR4_4_11xy1xykylvdz04.R.inc(2871);return totalRead;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the thread local byte array.
     *
     * @return the thread local byte array.
     */
    static byte[] getByteArray() {try{__CLR4_4_11xy1xykylvdz04.R.inc(2872);
        __CLR4_4_11xy1xykylvdz04.R.inc(2873);return SKIP_BYTE_BUFFER.get();
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the thread local char array.
     *
     * @return the thread local char array.
     */
    static char[] getCharArray() {try{__CLR4_4_11xy1xykylvdz04.R.inc(2874);
        __CLR4_4_11xy1xykylvdz04.R.inc(2875);return SKIP_CHAR_BUFFER.get();
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the length of the given array in a null-safe manner.
     *
     * @param array an array or null
     * @return the array length -- or 0 if the given array is null.
     * @since 2.7
     */
    public static int length(final byte[] array) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2876);
        __CLR4_4_11xy1xykylvdz04.R.inc(2877);return (((array == null )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2878)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2879)==0&false))? 0 : array.length;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the length of the given array in a null-safe manner.
     *
     * @param array an array or null
     * @return the array length -- or 0 if the given array is null.
     * @since 2.7
     */
    public static int length(final char[] array) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2880);
        __CLR4_4_11xy1xykylvdz04.R.inc(2881);return (((array == null )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2882)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2883)==0&false))? 0 : array.length;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the length of the given CharSequence in a null-safe manner.
     *
     * @param csq a CharSequence or null
     * @return the CharSequence length -- or 0 if the given CharSequence is null.
     * @since 2.7
     */
    public static int length(final CharSequence csq) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2884);
        __CLR4_4_11xy1xykylvdz04.R.inc(2885);return (((csq == null )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2886)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2887)==0&false))? 0 : csq.length();
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the length of the given array in a null-safe manner.
     *
     * @param array an array or null
     * @return the array length -- or 0 if the given array is null.
     * @since 2.7
     */
    public static int length(final Object[] array) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2888);
        __CLR4_4_11xy1xykylvdz04.R.inc(2889);return (((array == null )&&(__CLR4_4_11xy1xykylvdz04.R.iget(2890)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2891)==0&false))? 0 : array.length;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns an Iterator for the lines in an {@code InputStream}, using
     * the character encoding specified (or default encoding if null).
     * <p>
     * {@code LineIterator} holds a reference to the open
     * {@code InputStream} specified here. When you have finished with
     * the iterator you should close the stream to free internal resources.
     * This can be done by closing the stream directly, or by calling
     * {@link LineIterator#close()} or {@link LineIterator#closeQuietly(LineIterator)}.
     * <p>
     * The recommended usage pattern is:
     * <pre>
     * try {
     *   LineIterator it = IOUtils.lineIterator(stream, charset);
     *   while (it.hasNext()) {
     *     String line = it.nextLine();
     *     /// do something with line
     *   }
     * } finally {
     *   IOUtils.closeQuietly(stream);
     * }
     * </pre>
     *
     * @param input the {@code InputStream} to read from, not null
     * @param charset the charset to use, null means platform default
     * @return an Iterator of the lines in the reader, never null
     * @throws IllegalArgumentException if the input is null
     * @since 2.3
     */
    public static LineIterator lineIterator(final InputStream input, final Charset charset) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2892);
        __CLR4_4_11xy1xykylvdz04.R.inc(2893);return new LineIterator(new InputStreamReader(input, Charsets.toCharset(charset)));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns an Iterator for the lines in an {@code InputStream}, using
     * the character encoding specified (or default encoding if null).
     * <p>
     * {@code LineIterator} holds a reference to the open
     * {@code InputStream} specified here. When you have finished with
     * the iterator you should close the stream to free internal resources.
     * This can be done by closing the stream directly, or by calling
     * {@link LineIterator#close()} or {@link LineIterator#closeQuietly(LineIterator)}.
     * <p>
     * The recommended usage pattern is:
     * <pre>
     * try {
     *   LineIterator it = IOUtils.lineIterator(stream, "UTF-8");
     *   while (it.hasNext()) {
     *     String line = it.nextLine();
     *     /// do something with line
     *   }
     * } finally {
     *   IOUtils.closeQuietly(stream);
     * }
     * </pre>
     *
     * @param input the {@code InputStream} to read from, not null
     * @param charsetName the encoding to use, null means platform default
     * @return an Iterator of the lines in the reader, never null
     * @throws IllegalArgumentException                     if the input is null
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 1.2
     */
    public static LineIterator lineIterator(final InputStream input, final String charsetName) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2894);
        __CLR4_4_11xy1xykylvdz04.R.inc(2895);return lineIterator(input, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns an Iterator for the lines in a {@code Reader}.
     * <p>
     * {@code LineIterator} holds a reference to the open
     * {@code Reader} specified here. When you have finished with the
     * iterator you should close the reader to free internal resources.
     * This can be done by closing the reader directly, or by calling
     * {@link LineIterator#close()} or {@link LineIterator#closeQuietly(LineIterator)}.
     * <p>
     * The recommended usage pattern is:
     * <pre>
     * try {
     *   LineIterator it = IOUtils.lineIterator(reader);
     *   while (it.hasNext()) {
     *     String line = it.nextLine();
     *     /// do something with line
     *   }
     * } finally {
     *   IOUtils.closeQuietly(reader);
     * }
     * </pre>
     *
     * @param reader the {@code Reader} to read from, not null
     * @return an Iterator of the lines in the reader, never null
     * @throws IllegalArgumentException if the reader is null
     * @since 1.2
     */
    public static LineIterator lineIterator(final Reader reader) {try{__CLR4_4_11xy1xykylvdz04.R.inc(2896);
        __CLR4_4_11xy1xykylvdz04.R.inc(2897);return new LineIterator(reader);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads bytes from an input stream.
     * This implementation guarantees that it will read as many bytes
     * as possible before giving up; this may not always be the case for
     * subclasses of {@link InputStream}.
     *
     * @param input where to read input from
     * @param buffer destination
     * @return actual length read; may be less than requested if EOF was reached
     * @throws IOException if a read error occurs
     * @since 2.2
     */
    public static int read(final InputStream input, final byte[] buffer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2898);
        __CLR4_4_11xy1xykylvdz04.R.inc(2899);return read(input, buffer, 0, buffer.length);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads bytes from an input stream.
     * This implementation guarantees that it will read as many bytes
     * as possible before giving up; this may not always be the case for
     * subclasses of {@link InputStream}.
     *
     * @param input where to read input from
     * @param buffer destination
     * @param offset initial offset into buffer
     * @param length length to read, must be &gt;= 0
     * @return actual length read; may be less than requested if EOF was reached
     * @throws IOException if a read error occurs
     * @since 2.2
     */
    public static int read(final InputStream input, final byte[] buffer, final int offset, final int length)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2900);
        __CLR4_4_11xy1xykylvdz04.R.inc(2901);if ((((length < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2902)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2903)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2904);throw new IllegalArgumentException("Length must not be negative: " + length);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2905);int remaining = length;
        __CLR4_4_11xy1xykylvdz04.R.inc(2906);while ((((remaining > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2907)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2908)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2909);final int location = length - remaining;
            __CLR4_4_11xy1xykylvdz04.R.inc(2910);final int count = input.read(buffer, offset + location, remaining);
            __CLR4_4_11xy1xykylvdz04.R.inc(2911);if ((((EOF == count)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2912)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2913)==0&false))) {{ // EOF
                __CLR4_4_11xy1xykylvdz04.R.inc(2914);break;
            }
            }__CLR4_4_11xy1xykylvdz04.R.inc(2915);remaining -= count;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2916);return length - remaining;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads bytes from a ReadableByteChannel.
     * <p>
     * This implementation guarantees that it will read as many bytes
     * as possible before giving up; this may not always be the case for
     * subclasses of {@link ReadableByteChannel}.
     *
     * @param input the byte channel to read
     * @param buffer byte buffer destination
     * @return the actual length read; may be less than requested if EOF was reached
     * @throws IOException if a read error occurs
     * @since 2.5
     */
    public static int read(final ReadableByteChannel input, final ByteBuffer buffer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2917);
        __CLR4_4_11xy1xykylvdz04.R.inc(2918);final int length = buffer.remaining();
        __CLR4_4_11xy1xykylvdz04.R.inc(2919);while ((((buffer.remaining() > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2920)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2921)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2922);final int count = input.read(buffer);
            __CLR4_4_11xy1xykylvdz04.R.inc(2923);if ((((EOF == count)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2924)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2925)==0&false))) {{ // EOF
                __CLR4_4_11xy1xykylvdz04.R.inc(2926);break;
            }
        }}
        }__CLR4_4_11xy1xykylvdz04.R.inc(2927);return length - buffer.remaining();
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads characters from an input character stream.
     * This implementation guarantees that it will read as many characters
     * as possible before giving up; this may not always be the case for
     * subclasses of {@link Reader}.
     *
     * @param reader where to read input from
     * @param buffer destination
     * @return actual length read; may be less than requested if EOF was reached
     * @throws IOException if a read error occurs
     * @since 2.2
     */
    public static int read(final Reader reader, final char[] buffer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2928);
        __CLR4_4_11xy1xykylvdz04.R.inc(2929);return read(reader, buffer, 0, buffer.length);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads characters from an input character stream.
     * This implementation guarantees that it will read as many characters
     * as possible before giving up; this may not always be the case for
     * subclasses of {@link Reader}.
     *
     * @param reader where to read input from
     * @param buffer destination
     * @param offset initial offset into buffer
     * @param length length to read, must be &gt;= 0
     * @return actual length read; may be less than requested if EOF was reached
     * @throws IOException if a read error occurs
     * @since 2.2
     */
    public static int read(final Reader reader, final char[] buffer, final int offset, final int length)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2930);
        __CLR4_4_11xy1xykylvdz04.R.inc(2931);if ((((length < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2932)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2933)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2934);throw new IllegalArgumentException("Length must not be negative: " + length);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2935);int remaining = length;
        __CLR4_4_11xy1xykylvdz04.R.inc(2936);while ((((remaining > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2937)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2938)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2939);final int location = length - remaining;
            __CLR4_4_11xy1xykylvdz04.R.inc(2940);final int count = reader.read(buffer, offset + location, remaining);
            __CLR4_4_11xy1xykylvdz04.R.inc(2941);if ((((EOF == count)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2942)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2943)==0&false))) {{ // EOF
                __CLR4_4_11xy1xykylvdz04.R.inc(2944);break;
            }
            }__CLR4_4_11xy1xykylvdz04.R.inc(2945);remaining -= count;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2946);return length - remaining;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads the requested number of bytes or fail if there are not enough left.
     * <p>
     * This allows for the possibility that {@link InputStream#read(byte[], int, int)} may
     * not read as many bytes as requested (most likely because of reaching EOF).
     *
     * @param input where to read input from
     * @param buffer destination
     *
     * @throws IOException              if there is a problem reading the file
     * @throws IllegalArgumentException if length is negative
     * @throws EOFException             if the number of bytes read was incorrect
     * @since 2.2
     */
    public static void readFully(final InputStream input, final byte[] buffer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2947);
        __CLR4_4_11xy1xykylvdz04.R.inc(2948);readFully(input, buffer, 0, buffer.length);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads the requested number of bytes or fail if there are not enough left.
     * <p>
     * This allows for the possibility that {@link InputStream#read(byte[], int, int)} may
     * not read as many bytes as requested (most likely because of reaching EOF).
     *
     * @param input where to read input from
     * @param buffer destination
     * @param offset initial offset into buffer
     * @param length length to read, must be &gt;= 0
     *
     * @throws IOException              if there is a problem reading the file
     * @throws IllegalArgumentException if length is negative
     * @throws EOFException             if the number of bytes read was incorrect
     * @since 2.2
     */
    public static void readFully(final InputStream input, final byte[] buffer, final int offset, final int length)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2949);
        __CLR4_4_11xy1xykylvdz04.R.inc(2950);final int actual = read(input, buffer, offset, length);
        __CLR4_4_11xy1xykylvdz04.R.inc(2951);if ((((actual != length)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2952)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2953)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2954);throw new EOFException("Length to read: " + length + " actual: " + actual);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads the requested number of bytes or fail if there are not enough left.
     * <p>
     * This allows for the possibility that {@link InputStream#read(byte[], int, int)} may
     * not read as many bytes as requested (most likely because of reaching EOF).
     *
     * @param input where to read input from
     * @param length length to read, must be &gt;= 0
     * @return the bytes read from input
     * @throws IOException              if there is a problem reading the file
     * @throws IllegalArgumentException if length is negative
     * @throws EOFException             if the number of bytes read was incorrect
     * @since 2.5
     */
    public static byte[] readFully(final InputStream input, final int length) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2955);
        __CLR4_4_11xy1xykylvdz04.R.inc(2956);final byte[] buffer = IOUtils.byteArray(length);
        __CLR4_4_11xy1xykylvdz04.R.inc(2957);readFully(input, buffer, 0, buffer.length);
        __CLR4_4_11xy1xykylvdz04.R.inc(2958);return buffer;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads the requested number of bytes or fail if there are not enough left.
     * <p>
     * This allows for the possibility that {@link ReadableByteChannel#read(ByteBuffer)} may
     * not read as many bytes as requested (most likely because of reaching EOF).
     *
     * @param input the byte channel to read
     * @param buffer byte buffer destination
     * @throws IOException  if there is a problem reading the file
     * @throws EOFException if the number of bytes read was incorrect
     * @since 2.5
     */
    public static void readFully(final ReadableByteChannel input, final ByteBuffer buffer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2959);
        __CLR4_4_11xy1xykylvdz04.R.inc(2960);final int expected = buffer.remaining();
        __CLR4_4_11xy1xykylvdz04.R.inc(2961);final int actual = read(input, buffer);
        __CLR4_4_11xy1xykylvdz04.R.inc(2962);if ((((actual != expected)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2963)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2964)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2965);throw new EOFException("Length to read: " + expected + " actual: " + actual);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads the requested number of characters or fail if there are not enough left.
     * <p>
     * This allows for the possibility that {@link Reader#read(char[], int, int)} may
     * not read as many characters as requested (most likely because of reaching EOF).
     *
     * @param reader where to read input from
     * @param buffer destination
     * @throws IOException              if there is a problem reading the file
     * @throws IllegalArgumentException if length is negative
     * @throws EOFException             if the number of characters read was incorrect
     * @since 2.2
     */
    public static void readFully(final Reader reader, final char[] buffer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2966);
        __CLR4_4_11xy1xykylvdz04.R.inc(2967);readFully(reader, buffer, 0, buffer.length);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Reads the requested number of characters or fail if there are not enough left.
     * <p>
     * This allows for the possibility that {@link Reader#read(char[], int, int)} may
     * not read as many characters as requested (most likely because of reaching EOF).
     *
     * @param reader where to read input from
     * @param buffer destination
     * @param offset initial offset into buffer
     * @param length length to read, must be &gt;= 0
     * @throws IOException              if there is a problem reading the file
     * @throws IllegalArgumentException if length is negative
     * @throws EOFException             if the number of characters read was incorrect
     * @since 2.2
     */
    public static void readFully(final Reader reader, final char[] buffer, final int offset, final int length)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2968);
        __CLR4_4_11xy1xykylvdz04.R.inc(2969);final int actual = read(reader, buffer, offset, length);
        __CLR4_4_11xy1xykylvdz04.R.inc(2970);if ((((actual != length)&&(__CLR4_4_11xy1xykylvdz04.R.iget(2971)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(2972)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2973);throw new EOFException("Length to read: " + length + " actual: " + actual);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a list of Strings,
     * one entry per line, using the default character encoding of the platform.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param input the {@code InputStream} to read from, not null
     * @return the list of Strings, never null
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated 2.5 use {@link #readLines(InputStream, Charset)} instead
     */
    @Deprecated
    public static List<String> readLines(final InputStream input) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2974);
        __CLR4_4_11xy1xykylvdz04.R.inc(2975);return readLines(input, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a list of Strings,
     * one entry per line, using the specified character encoding.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param input the {@code InputStream} to read from, not null
     * @param charset the charset to use, null means platform default
     * @return the list of Strings, never null
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static List<String> readLines(final InputStream input, final Charset charset) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2976);
        __CLR4_4_11xy1xykylvdz04.R.inc(2977);final InputStreamReader reader = new InputStreamReader(input, Charsets.toCharset(charset));
        __CLR4_4_11xy1xykylvdz04.R.inc(2978);return readLines(reader);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a list of Strings,
     * one entry per line, using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param input the {@code InputStream} to read from, not null
     * @param charsetName the name of the requested charset, null means platform default
     * @return the list of Strings, never null
     * @throws NullPointerException                         if the input is null
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 1.1
     */
    public static List<String> readLines(final InputStream input, final String charsetName) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2979);
        __CLR4_4_11xy1xykylvdz04.R.inc(2980);return readLines(input, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code Reader} as a list of Strings,
     * one entry per line.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     *
     * @param reader the {@code Reader} to read from, not null
     * @return the list of Strings, never null
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     */
    @SuppressWarnings("resource") // reader wraps input and is the responsibility of the caller.
    public static List<String> readLines(final Reader reader) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2981);
        __CLR4_4_11xy1xykylvdz04.R.inc(2982);final BufferedReader bufReader = toBufferedReader(reader);
        __CLR4_4_11xy1xykylvdz04.R.inc(2983);final List<String> list = new ArrayList<>();
        __CLR4_4_11xy1xykylvdz04.R.inc(2984);String line;
        __CLR4_4_11xy1xykylvdz04.R.inc(2985);while ((line = bufReader.readLine()) != null) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(2988);list.add(line);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(2989);return list;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a classpath resource as a byte array.
     *
     * <p>
     * It is expected the given {@code name} to be absolute. The
     * behavior is not well-defined otherwise.
     * </p>
     *
     * @param name name of the desired resource
     * @return the requested byte array
     * @throws IOException if an I/O error occurs.
     *
     * @since 2.6
     */
    public static byte[] resourceToByteArray(final String name) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2990);
        __CLR4_4_11xy1xykylvdz04.R.inc(2991);return resourceToByteArray(name, null);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a classpath resource as a byte array.
     *
     * <p>
     * It is expected the given {@code name} to be absolute. The
     * behavior is not well-defined otherwise.
     * </p>
     *
     * @param name name of the desired resource
     * @param classLoader the class loader that the resolution of the resource is delegated to
     * @return the requested byte array
     * @throws IOException if an I/O error occurs.
     *
     * @since 2.6
     */
    public static byte[] resourceToByteArray(final String name, final ClassLoader classLoader) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2992);
        __CLR4_4_11xy1xykylvdz04.R.inc(2993);return toByteArray(resourceToURL(name, classLoader));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a classpath resource as a String using the
     * specified character encoding.
     *
     * <p>
     * It is expected the given {@code name} to be absolute. The
     * behavior is not well-defined otherwise.
     * </p>
     *
     * @param name     name of the desired resource
     * @param charset the charset to use, null means platform default
     * @return the requested String
     * @throws IOException if an I/O error occurs.
     *
     * @since 2.6
     */
    public static String resourceToString(final String name, final Charset charset) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2994);
        __CLR4_4_11xy1xykylvdz04.R.inc(2995);return resourceToString(name, charset, null);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a classpath resource as a String using the
     * specified character encoding.
     *
     * <p>
     * It is expected the given {@code name} to be absolute. The
     * behavior is not well-defined otherwise.
     * </p>
     *
     * @param name     name of the desired resource
     * @param charset the charset to use, null means platform default
     * @param classLoader the class loader that the resolution of the resource is delegated to
     * @return the requested String
     * @throws IOException if an I/O error occurs.
     *
     * @since 2.6
     */
    public static String resourceToString(final String name, final Charset charset, final ClassLoader classLoader) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2996);
        __CLR4_4_11xy1xykylvdz04.R.inc(2997);return toString(resourceToURL(name, classLoader), charset);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets a URL pointing to the given classpath resource.
     *
     * <p>
     * It is expected the given {@code name} to be absolute. The
     * behavior is not well-defined otherwise.
     * </p>
     *
     * @param name name of the desired resource
     * @return the requested URL
     * @throws IOException if an I/O error occurs.
     *
     * @since 2.6
     */
    public static URL resourceToURL(final String name) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(2998);
        __CLR4_4_11xy1xykylvdz04.R.inc(2999);return resourceToURL(name, null);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets a URL pointing to the given classpath resource.
     *
     * <p>
     * It is expected the given {@code name} to be absolute. The
     * behavior is not well-defined otherwise.
     * </p>
     *
     * @param name        name of the desired resource
     * @param classLoader the class loader that the resolution of the resource is delegated to
     * @return the requested URL
     * @throws IOException if an I/O error occurs.
     *
     * @since 2.6
     */
    public static URL resourceToURL(final String name, final ClassLoader classLoader) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3000);
        // What about the thread context class loader?
        // What about the system class loader?
        __CLR4_4_11xy1xykylvdz04.R.inc(3001);final URL resource = (((classLoader == null )&&(__CLR4_4_11xy1xykylvdz04.R.iget(3002)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3003)==0&false))? IOUtils.class.getResource(name) : classLoader.getResource(name);

        __CLR4_4_11xy1xykylvdz04.R.inc(3004);if ((((resource == null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3005)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3006)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3007);throw new IOException("Resource not found: " + name);
        }

        }__CLR4_4_11xy1xykylvdz04.R.inc(3008);return resource;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Skips bytes from an input byte stream.
     * This implementation guarantees that it will read as many bytes
     * as possible before giving up; this may not always be the case for
     * skip() implementations in subclasses of {@link InputStream}.
     * <p>
     * Note that the implementation uses {@link InputStream#read(byte[], int, int)} rather
     * than delegating to {@link InputStream#skip(long)}.
     * This means that the method may be considerably less efficient than using the actual skip implementation,
     * this is done to guarantee that the correct number of bytes are skipped.
     * </p>
     *
     * @param input byte stream to skip
     * @param toSkip number of bytes to skip.
     * @return number of bytes actually skipped.
     * @throws IOException              if there is a problem reading the file
     * @throws IllegalArgumentException if toSkip is negative
     * @see InputStream#skip(long)
     * @see <a href="https://issues.apache.org/jira/browse/IO-203">IO-203 - Add skipFully() method for InputStreams</a>
     * @since 2.0
     */
    public static long skip(final InputStream input, final long toSkip) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3009);
        __CLR4_4_11xy1xykylvdz04.R.inc(3010);if ((((toSkip < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3011)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3012)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3013);throw new IllegalArgumentException("Skip count must be non-negative, actual: " + toSkip);
        }
        /*
         * N.B. no need to synchronize access to SKIP_BYTE_BUFFER: - we don't care if the buffer is created multiple
         * times (the data is ignored) - we always use the same size buffer, so if it it is recreated it will still be
         * OK (if the buffer size were variable, we would need to synch. to ensure some other thread did not create a
         * smaller one)
         */
        }__CLR4_4_11xy1xykylvdz04.R.inc(3014);long remain = toSkip;
        __CLR4_4_11xy1xykylvdz04.R.inc(3015);while ((((remain > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3016)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3017)==0&false))) {{
            // See https://issues.apache.org/jira/browse/IO-203 for why we use read() rather than delegating to skip()
            __CLR4_4_11xy1xykylvdz04.R.inc(3018);final byte[] byteArray = getByteArray();
            __CLR4_4_11xy1xykylvdz04.R.inc(3019);final long n = input.read(byteArray, 0, (int) Math.min(remain, byteArray.length));
            __CLR4_4_11xy1xykylvdz04.R.inc(3020);if ((((n < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3021)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3022)==0&false))) {{ // EOF
                __CLR4_4_11xy1xykylvdz04.R.inc(3023);break;
            }
            }__CLR4_4_11xy1xykylvdz04.R.inc(3024);remain -= n;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3025);return toSkip - remain;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Skips bytes from a ReadableByteChannel.
     * This implementation guarantees that it will read as many bytes
     * as possible before giving up.
     *
     * @param input ReadableByteChannel to skip
     * @param toSkip number of bytes to skip.
     * @return number of bytes actually skipped.
     * @throws IOException              if there is a problem reading the ReadableByteChannel
     * @throws IllegalArgumentException if toSkip is negative
     * @since 2.5
     */
    public static long skip(final ReadableByteChannel input, final long toSkip) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3026);
        __CLR4_4_11xy1xykylvdz04.R.inc(3027);if ((((toSkip < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3028)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3029)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3030);throw new IllegalArgumentException("Skip count must be non-negative, actual: " + toSkip);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3031);final ByteBuffer skipByteBuffer = ByteBuffer.allocate((int) Math.min(toSkip, DEFAULT_BUFFER_SIZE));
        __CLR4_4_11xy1xykylvdz04.R.inc(3032);long remain = toSkip;
        __CLR4_4_11xy1xykylvdz04.R.inc(3033);while ((((remain > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3034)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3035)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3036);skipByteBuffer.position(0);
            __CLR4_4_11xy1xykylvdz04.R.inc(3037);skipByteBuffer.limit((int) Math.min(remain, DEFAULT_BUFFER_SIZE));
            __CLR4_4_11xy1xykylvdz04.R.inc(3038);final int n = input.read(skipByteBuffer);
            __CLR4_4_11xy1xykylvdz04.R.inc(3039);if ((((n == EOF)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3040)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3041)==0&false))) {{
                __CLR4_4_11xy1xykylvdz04.R.inc(3042);break;
            }
            }__CLR4_4_11xy1xykylvdz04.R.inc(3043);remain -= n;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3044);return toSkip - remain;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Skips characters from an input character stream.
     * This implementation guarantees that it will read as many characters
     * as possible before giving up; this may not always be the case for
     * skip() implementations in subclasses of {@link Reader}.
     * <p>
     * Note that the implementation uses {@link Reader#read(char[], int, int)} rather
     * than delegating to {@link Reader#skip(long)}.
     * This means that the method may be considerably less efficient than using the actual skip implementation,
     * this is done to guarantee that the correct number of characters are skipped.
     * </p>
     *
     * @param reader character stream to skip
     * @param toSkip number of characters to skip.
     * @return number of characters actually skipped.
     * @throws IOException              if there is a problem reading the file
     * @throws IllegalArgumentException if toSkip is negative
     * @see Reader#skip(long)
     * @see <a href="https://issues.apache.org/jira/browse/IO-203">IO-203 - Add skipFully() method for InputStreams</a>
     * @since 2.0
     */
    public static long skip(final Reader reader, final long toSkip) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3045);
        __CLR4_4_11xy1xykylvdz04.R.inc(3046);if ((((toSkip < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3047)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3048)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3049);throw new IllegalArgumentException("Skip count must be non-negative, actual: " + toSkip);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3050);long remain = toSkip;
        __CLR4_4_11xy1xykylvdz04.R.inc(3051);while ((((remain > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3052)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3053)==0&false))) {{
            // See https://issues.apache.org/jira/browse/IO-203 for why we use read() rather than delegating to skip()
            __CLR4_4_11xy1xykylvdz04.R.inc(3054);final char[] charArray = getCharArray();
            __CLR4_4_11xy1xykylvdz04.R.inc(3055);final long n = reader.read(charArray, 0, (int) Math.min(remain, charArray.length));
            __CLR4_4_11xy1xykylvdz04.R.inc(3056);if ((((n < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3057)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3058)==0&false))) {{ // EOF
                __CLR4_4_11xy1xykylvdz04.R.inc(3059);break;
            }
            }__CLR4_4_11xy1xykylvdz04.R.inc(3060);remain -= n;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3061);return toSkip - remain;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Skips the requested number of bytes or fail if there are not enough left.
     * <p>
     * This allows for the possibility that {@link InputStream#skip(long)} may
     * not skip as many bytes as requested (most likely because of reaching EOF).
     * <p>
     * Note that the implementation uses {@link #skip(InputStream, long)}.
     * This means that the method may be considerably less efficient than using the actual skip implementation,
     * this is done to guarantee that the correct number of characters are skipped.
     * </p>
     *
     * @param input stream to skip
     * @param toSkip the number of bytes to skip
     * @throws IOException              if there is a problem reading the file
     * @throws IllegalArgumentException if toSkip is negative
     * @throws EOFException             if the number of bytes skipped was incorrect
     * @see InputStream#skip(long)
     * @since 2.0
     */
    public static void skipFully(final InputStream input, final long toSkip) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3062);
        __CLR4_4_11xy1xykylvdz04.R.inc(3063);if ((((toSkip < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3064)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3065)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3066);throw new IllegalArgumentException("Bytes to skip must not be negative: " + toSkip);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3067);final long skipped = skip(input, toSkip);
        __CLR4_4_11xy1xykylvdz04.R.inc(3068);if ((((skipped != toSkip)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3069)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3070)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3071);throw new EOFException("Bytes to skip: " + toSkip + " actual: " + skipped);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Skips the requested number of bytes or fail if there are not enough left.
     *
     * @param input ReadableByteChannel to skip
     * @param toSkip the number of bytes to skip
     * @throws IOException              if there is a problem reading the ReadableByteChannel
     * @throws IllegalArgumentException if toSkip is negative
     * @throws EOFException             if the number of bytes skipped was incorrect
     * @since 2.5
     */
    public static void skipFully(final ReadableByteChannel input, final long toSkip) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3072);
        __CLR4_4_11xy1xykylvdz04.R.inc(3073);if ((((toSkip < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3074)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3075)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3076);throw new IllegalArgumentException("Bytes to skip must not be negative: " + toSkip);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3077);final long skipped = skip(input, toSkip);
        __CLR4_4_11xy1xykylvdz04.R.inc(3078);if ((((skipped != toSkip)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3079)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3080)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3081);throw new EOFException("Bytes to skip: " + toSkip + " actual: " + skipped);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Skips the requested number of characters or fail if there are not enough left.
     * <p>
     * This allows for the possibility that {@link Reader#skip(long)} may
     * not skip as many characters as requested (most likely because of reaching EOF).
     * <p>
     * Note that the implementation uses {@link #skip(Reader, long)}.
     * This means that the method may be considerably less efficient than using the actual skip implementation,
     * this is done to guarantee that the correct number of characters are skipped.
     * </p>
     *
     * @param reader stream to skip
     * @param toSkip the number of characters to skip
     * @throws IOException              if there is a problem reading the file
     * @throws IllegalArgumentException if toSkip is negative
     * @throws EOFException             if the number of characters skipped was incorrect
     * @see Reader#skip(long)
     * @since 2.0
     */
    public static void skipFully(final Reader reader, final long toSkip) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3082);
        __CLR4_4_11xy1xykylvdz04.R.inc(3083);final long skipped = skip(reader, toSkip);
        __CLR4_4_11xy1xykylvdz04.R.inc(3084);if ((((skipped != toSkip)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3085)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3086)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3087);throw new EOFException("Chars to skip: " + toSkip + " actual: " + skipped);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Fetches entire contents of an {@code InputStream} and represent
     * same data as result InputStream.
     * <p>
     * This method is useful where,
     * <ul>
     * <li>Source InputStream is slow.</li>
     * <li>It has network resources associated, so we cannot keep it open for
     * long time.</li>
     * <li>It has network timeout associated.</li>
     * </ul>
     * It can be used in favor of {@link #toByteArray(InputStream)}, since it
     * avoids unnecessary allocation and copy of byte[].<br>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param input Stream to be fully buffered.
     * @return A fully buffered stream.
     * @throws IOException if an I/O error occurs.
     * @since 2.0
     */
    public static InputStream toBufferedInputStream(final InputStream input) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3088);
        __CLR4_4_11xy1xykylvdz04.R.inc(3089);return ByteArrayOutputStream.toBufferedInputStream(input);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Fetches entire contents of an {@code InputStream} and represent
     * same data as result InputStream.
     * <p>
     * This method is useful where,
     * <ul>
     * <li>Source InputStream is slow.</li>
     * <li>It has network resources associated, so we cannot keep it open for
     * long time.</li>
     * <li>It has network timeout associated.</li>
     * </ul>
     * It can be used in favor of {@link #toByteArray(InputStream)}, since it
     * avoids unnecessary allocation and copy of byte[].<br>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param input Stream to be fully buffered.
     * @param size the initial buffer size
     * @return A fully buffered stream.
     * @throws IOException if an I/O error occurs.
     * @since 2.5
     */
    public static InputStream toBufferedInputStream(final InputStream input, final int size) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3090);
        __CLR4_4_11xy1xykylvdz04.R.inc(3091);return ByteArrayOutputStream.toBufferedInputStream(input, size);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given reader if it is a {@link BufferedReader}, otherwise creates a BufferedReader from the given
     * reader.
     *
     * @param reader the reader to wrap or return (not null)
     * @return the given reader or a new {@link BufferedReader} for the given reader
     * @throws NullPointerException if the input parameter is null
     * @see #buffer(Reader)
     * @since 2.2
     */
    public static BufferedReader toBufferedReader(final Reader reader) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3092);
        __CLR4_4_11xy1xykylvdz04.R.inc(3093);return (((reader instanceof BufferedReader )&&(__CLR4_4_11xy1xykylvdz04.R.iget(3094)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3095)==0&false))? (BufferedReader) reader : new BufferedReader(reader);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given reader if it is a {@link BufferedReader}, otherwise creates a BufferedReader from the given
     * reader.
     *
     * @param reader the reader to wrap or return (not null)
     * @param size the buffer size, if a new BufferedReader is created.
     * @return the given reader or a new {@link BufferedReader} for the given reader
     * @throws NullPointerException if the input parameter is null
     * @see #buffer(Reader)
     * @since 2.5
     */
    public static BufferedReader toBufferedReader(final Reader reader, final int size) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3096);
        __CLR4_4_11xy1xykylvdz04.R.inc(3097);return (((reader instanceof BufferedReader )&&(__CLR4_4_11xy1xykylvdz04.R.iget(3098)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3099)==0&false))? (BufferedReader) reader : new BufferedReader(reader, size);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a {@code byte[]}.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     * </p>
     *
     * @param inputStream the {@code InputStream} to read.
     * @return the requested byte array.
     * @throws NullPointerException if the InputStream is {@code null}.
     * @throws IOException if an I/O error occurs or reading more than {@link Integer#MAX_VALUE} occurs.
     */
    public static byte[] toByteArray(final InputStream inputStream) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3100);
        // We use a ThresholdingOutputStream to avoid reading AND writing more than Integer.MAX_VALUE.
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_11xy1xykylvdz04.R.inc(3101);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_11xy1xykylvdz04.R.inc(3102);}};final UnsynchronizedByteArrayOutputStream ubaOutput = new UnsynchronizedByteArrayOutputStream();
            __CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_11xy1xykylvdz04.R.inc(3103);}};final ThresholdingOutputStream thresholdOuput = new ThresholdingOutputStream(Integer.MAX_VALUE, os -> {
                __CLR4_4_11xy1xykylvdz04.R.inc(3104);throw new IllegalArgumentException(
                    String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
            }, os -> ubaOutput)) {
            __CLR4_4_11xy1xykylvdz04.R.inc(3105);copy(inputStream, thresholdOuput);
            __CLR4_4_11xy1xykylvdz04.R.inc(3106);return ubaOutput.toByteArray();
        }
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a {@code byte[]}. Use this method instead of
     * {@code toByteArray(InputStream)} when {@code InputStream} size is known
     *
     * @param input the {@code InputStream} to read.
     * @param size the size of {@code InputStream}.
     * @return the requested byte array.
     * @throws IOException if an I/O error occurs or {@code InputStream} size differ from parameter size.
     * @throws IllegalArgumentException if size is less than zero.
     * @since 2.1
     */
    public static byte[] toByteArray(final InputStream input, final int size) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3107);

        __CLR4_4_11xy1xykylvdz04.R.inc(3108);if ((((size < 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3109)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3110)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3111);throw new IllegalArgumentException("Size must be equal or greater than zero: " + size);
        }

        }__CLR4_4_11xy1xykylvdz04.R.inc(3112);if ((((size == 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3113)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3114)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3115);return EMPTY_BYTE_ARRAY;
        }

        }__CLR4_4_11xy1xykylvdz04.R.inc(3116);final byte[] data = IOUtils.byteArray(size);
        __CLR4_4_11xy1xykylvdz04.R.inc(3117);int offset = 0;
        __CLR4_4_11xy1xykylvdz04.R.inc(3118);int read;

        __CLR4_4_11xy1xykylvdz04.R.inc(3119);while (offset < size && (read = input.read(data, offset, size - offset)) != EOF) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3122);offset += read;
        }

        }__CLR4_4_11xy1xykylvdz04.R.inc(3123);if ((((offset != size)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3124)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3125)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3126);throw new IOException("Unexpected read size, current: " + offset + ", expected: " + size);
        }

        }__CLR4_4_11xy1xykylvdz04.R.inc(3127);return data;
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets contents of an {@code InputStream} as a {@code byte[]}.
     * Use this method instead of {@code toByteArray(InputStream)}
     * when {@code InputStream} size is known.
     * <b>NOTE:</b> the method checks that the length can safely be cast to an int without truncation
     * before using {@link IOUtils#toByteArray(java.io.InputStream, int)} to read into the byte array.
     * (Arrays can have no more than Integer.MAX_VALUE entries anyway)
     *
     * @param input the {@code InputStream} to read from
     * @param size the size of {@code InputStream}
     * @return the requested byte array
     * @throws IOException              if an I/O error occurs or {@code InputStream} size differ from parameter
     * size
     * @throws IllegalArgumentException if size is less than zero or size is greater than Integer.MAX_VALUE
     * @see IOUtils#toByteArray(java.io.InputStream, int)
     * @since 2.1
     */
    public static byte[] toByteArray(final InputStream input, final long size) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3128);

        __CLR4_4_11xy1xykylvdz04.R.inc(3129);if ((((size > Integer.MAX_VALUE)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3130)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3131)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3132);throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + size);
        }

        }__CLR4_4_11xy1xykylvdz04.R.inc(3133);return toByteArray(input, (int) size);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code Reader} as a {@code byte[]}
     * using the default character encoding of the platform.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     *
     * @param reader the {@code Reader} to read from
     * @return the requested byte array
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @deprecated 2.5 use {@link #toByteArray(Reader, Charset)} instead
     */
    @Deprecated
    public static byte[] toByteArray(final Reader reader) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3134);
        __CLR4_4_11xy1xykylvdz04.R.inc(3135);return toByteArray(reader, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code Reader} as a {@code byte[]}
     * using the specified character encoding.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     *
     * @param reader the {@code Reader} to read from
     * @param charset the charset to use, null means platform default
     * @return the requested byte array
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static byte[] toByteArray(final Reader reader, final Charset charset) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3136);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_11xy1xykylvdz04.R.inc(3137);try (__CLR4_4_1$AC3 __CLR$ACI4=new __CLR4_4_1$AC3(){{__CLR4_4_11xy1xykylvdz04.R.inc(3138);}};final ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            __CLR4_4_11xy1xykylvdz04.R.inc(3139);copy(reader, output, charset);
            __CLR4_4_11xy1xykylvdz04.R.inc(3140);return output.toByteArray();
        }
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code Reader} as a {@code byte[]}
     * using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     *
     * @param reader the {@code Reader} to read from
     * @param charsetName the name of the requested charset, null means platform default
     * @return the requested byte array
     * @throws NullPointerException                         if the input is null
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 1.1
     */
    public static byte[] toByteArray(final Reader reader, final String charsetName) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3141);
        __CLR4_4_11xy1xykylvdz04.R.inc(3142);return toByteArray(reader, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code String} as a {@code byte[]}
     * using the default character encoding of the platform.
     * <p>
     * This is the same as {@link String#getBytes()}.
     *
     * @param input the {@code String} to convert
     * @return the requested byte array
     * @throws NullPointerException if the input is null
     * @deprecated 2.5 Use {@link String#getBytes()} instead
     */
    @Deprecated
    public static byte[] toByteArray(final String input) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3143);
        // make explicit the use of the default charset
        __CLR4_4_11xy1xykylvdz04.R.inc(3144);return input.getBytes(Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code URI} as a {@code byte[]}.
     *
     * @param uri the {@code URI} to read
     * @return the requested byte array
     * @throws NullPointerException if the uri is null
     * @throws IOException          if an I/O exception occurs
     * @since 2.4
     */
    public static byte[] toByteArray(final URI uri) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3145);
        __CLR4_4_11xy1xykylvdz04.R.inc(3146);return IOUtils.toByteArray(uri.toURL());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code URL} as a {@code byte[]}.
     *
     * @param url the {@code URL} to read
     * @return the requested byte array
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O exception occurs
     * @since 2.4
     */
    public static byte[] toByteArray(final URL url) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3147);
        __CLR4_4_11xy1xykylvdz04.R.inc(3148);final URLConnection conn = url.openConnection();
        __CLR4_4_11xy1xykylvdz04.R.inc(3149);try {
            __CLR4_4_11xy1xykylvdz04.R.inc(3150);return IOUtils.toByteArray(conn);
        } finally {
            __CLR4_4_11xy1xykylvdz04.R.inc(3151);close(conn);
        }
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code URLConnection} as a {@code byte[]}.
     *
     * @param urlConn the {@code URLConnection} to read.
     * @return the requested byte array.
     * @throws NullPointerException if the urlConn is null.
     * @throws IOException if an I/O exception occurs.
     * @since 2.4
     */
    public static byte[] toByteArray(final URLConnection urlConn) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3152);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_11xy1xykylvdz04.R.inc(3153);try (__CLR4_4_1$AC4 __CLR$ACI5=new __CLR4_4_1$AC4(){{__CLR4_4_11xy1xykylvdz04.R.inc(3154);}};InputStream inputStream = urlConn.getInputStream()) {
            __CLR4_4_11xy1xykylvdz04.R.inc(3155);return IOUtils.toByteArray(inputStream);
        }
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a character array
     * using the default character encoding of the platform.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param inputStream the {@code InputStream} to read from
     * @return the requested character array
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated 2.5 use {@link #toCharArray(InputStream, Charset)} instead
     */
    @Deprecated
    public static char[] toCharArray(final InputStream inputStream) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3156);
        __CLR4_4_11xy1xykylvdz04.R.inc(3157);return toCharArray(inputStream, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a character array
     * using the specified character encoding.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param inputStream the {@code InputStream} to read from
     * @param charset the charset to use, null means platform default
     * @return the requested character array
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static char[] toCharArray(final InputStream inputStream, final Charset charset)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3158);
        __CLR4_4_11xy1xykylvdz04.R.inc(3159);final CharArrayWriter writer = new CharArrayWriter();
        __CLR4_4_11xy1xykylvdz04.R.inc(3160);copy(inputStream, writer, charset);
        __CLR4_4_11xy1xykylvdz04.R.inc(3161);return writer.toCharArray();
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a character array
     * using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param inputStream the {@code InputStream} to read from
     * @param charsetName the name of the requested charset, null means platform default
     * @return the requested character array
     * @throws NullPointerException                         if the input is null
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 1.1
     */
    public static char[] toCharArray(final InputStream inputStream, final String charsetName) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3162);
        __CLR4_4_11xy1xykylvdz04.R.inc(3163);return toCharArray(inputStream, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code Reader} as a character array.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     *
     * @param reader the {@code Reader} to read from
     * @return the requested character array
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     */
    public static char[] toCharArray(final Reader reader) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3164);
        __CLR4_4_11xy1xykylvdz04.R.inc(3165);final CharArrayWriter sw = new CharArrayWriter();
        __CLR4_4_11xy1xykylvdz04.R.inc(3166);copy(reader, sw);
        __CLR4_4_11xy1xykylvdz04.R.inc(3167);return sw.toCharArray();
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Converts the specified CharSequence to an input stream, encoded as bytes
     * using the default character encoding of the platform.
     *
     * @param input the CharSequence to convert
     * @return an input stream
     * @since 2.0
     * @deprecated 2.5 use {@link #toInputStream(CharSequence, Charset)} instead
     */
    @Deprecated
    public static InputStream toInputStream(final CharSequence input) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3168);
        __CLR4_4_11xy1xykylvdz04.R.inc(3169);return toInputStream(input, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Converts the specified CharSequence to an input stream, encoded as bytes
     * using the specified character encoding.
     *
     * @param input the CharSequence to convert
     * @param charset the charset to use, null means platform default
     * @return an input stream
     * @since 2.3
     */
    public static InputStream toInputStream(final CharSequence input, final Charset charset) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3170);
        __CLR4_4_11xy1xykylvdz04.R.inc(3171);return toInputStream(input.toString(), charset);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Converts the specified CharSequence to an input stream, encoded as bytes
     * using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     *
     * @param input the CharSequence to convert
     * @param charsetName the name of the requested charset, null means platform default
     * @return an input stream
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 2.0
     */
    public static InputStream toInputStream(final CharSequence input, final String charsetName) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3172);
        __CLR4_4_11xy1xykylvdz04.R.inc(3173);return toInputStream(input, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Converts the specified string to an input stream, encoded as bytes
     * using the default character encoding of the platform.
     *
     * @param input the string to convert
     * @return an input stream
     * @since 1.1
     * @deprecated 2.5 use {@link #toInputStream(String, Charset)} instead
     */
    @Deprecated
    public static InputStream toInputStream(final String input) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3174);
        __CLR4_4_11xy1xykylvdz04.R.inc(3175);return toInputStream(input, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Converts the specified string to an input stream, encoded as bytes
     * using the specified character encoding.
     *
     * @param input the string to convert
     * @param charset the charset to use, null means platform default
     * @return an input stream
     * @since 2.3
     */
    public static InputStream toInputStream(final String input, final Charset charset) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3176);
        __CLR4_4_11xy1xykylvdz04.R.inc(3177);return new ByteArrayInputStream(input.getBytes(Charsets.toCharset(charset)));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Converts the specified string to an input stream, encoded as bytes
     * using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     *
     * @param input the string to convert
     * @param charsetName the name of the requested charset, null means platform default
     * @return an input stream
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 1.1
     */
    public static InputStream toInputStream(final String input, final String charsetName) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3178);
        __CLR4_4_11xy1xykylvdz04.R.inc(3179);final byte[] bytes = input.getBytes(Charsets.toCharset(charsetName));
        __CLR4_4_11xy1xykylvdz04.R.inc(3180);return new ByteArrayInputStream(bytes);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code byte[]} as a String
     * using the default character encoding of the platform.
     *
     * @param input the byte array to read from
     * @return the requested String
     * @throws NullPointerException if the input is null
     * @deprecated 2.5 Use {@link String#String(byte[])} instead
     */
    @Deprecated
    public static String toString(final byte[] input) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3181);
        // make explicit the use of the default charset
        __CLR4_4_11xy1xykylvdz04.R.inc(3182);return new String(input, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code byte[]} as a String
     * using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     *
     * @param input the byte array to read from
     * @param charsetName the name of the requested charset, null means platform default
     * @return the requested String
     * @throws NullPointerException if the input is null
     */
    public static String toString(final byte[] input, final String charsetName) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3183);
        __CLR4_4_11xy1xykylvdz04.R.inc(3184);return new String(input, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a String
     * using the default character encoding of the platform.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param input the {@code InputStream} to read from
     * @return the requested String
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @deprecated 2.5 use {@link #toString(InputStream, Charset)} instead
     */
    @Deprecated
    public static String toString(final InputStream input) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3185);
        __CLR4_4_11xy1xykylvdz04.R.inc(3186);return toString(input, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a String
     * using the specified character encoding.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     * </p>
     *
     * @param input the {@code InputStream} to read from
     * @param charset the charset to use, null means platform default
     * @return the requested String
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static String toString(final InputStream input, final Charset charset) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3187);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_11xy1xykylvdz04.R.inc(3188);try (__CLR4_4_1$AC5 __CLR$ACI6=new __CLR4_4_1$AC5(){{__CLR4_4_11xy1xykylvdz04.R.inc(3189);}};final StringBuilderWriter sw = new StringBuilderWriter()) {
            __CLR4_4_11xy1xykylvdz04.R.inc(3190);copy(input, sw, charset);
            __CLR4_4_11xy1xykylvdz04.R.inc(3191);return sw.toString();
        }
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of an {@code InputStream} as a String
     * using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     *
     * @param input the {@code InputStream} to read from
     * @param charsetName the name of the requested charset, null means platform default
     * @return the requested String
     * @throws NullPointerException                         if the input is null
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     */
    public static String toString(final InputStream input, final String charsetName)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3192);
        __CLR4_4_11xy1xykylvdz04.R.inc(3193);return toString(input, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents of a {@code Reader} as a String.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedReader}.
     *
     * @param reader the {@code Reader} to read from
     * @return the requested String
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     */
    public static String toString(final Reader reader) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3194);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_11xy1xykylvdz04.R.inc(3195);try (__CLR4_4_1$AC6 __CLR$ACI7=new __CLR4_4_1$AC6(){{__CLR4_4_11xy1xykylvdz04.R.inc(3196);}};final StringBuilderWriter sw = new StringBuilderWriter()) {
            __CLR4_4_11xy1xykylvdz04.R.inc(3197);copy(reader, sw);
            __CLR4_4_11xy1xykylvdz04.R.inc(3198);return sw.toString();
        }
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents at the given URI.
     *
     * @param uri The URI source.
     * @return The contents of the URL as a String.
     * @throws IOException if an I/O exception occurs.
     * @since 2.1
     * @deprecated 2.5 use {@link #toString(URI, Charset)} instead
     */
    @Deprecated
    public static String toString(final URI uri) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3199);
        __CLR4_4_11xy1xykylvdz04.R.inc(3200);return toString(uri, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents at the given URI.
     *
     * @param uri The URI source.
     * @param encoding The encoding name for the URL contents.
     * @return The contents of the URL as a String.
     * @throws IOException if an I/O exception occurs.
     * @since 2.3.
     */
    public static String toString(final URI uri, final Charset encoding) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3201);
        __CLR4_4_11xy1xykylvdz04.R.inc(3202);return toString(uri.toURL(), Charsets.toCharset(encoding));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents at the given URI.
     *
     * @param uri The URI source.
     * @param charsetName The encoding name for the URL contents.
     * @return The contents of the URL as a String.
     * @throws IOException                                  if an I/O exception occurs.
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 2.1
     */
    public static String toString(final URI uri, final String charsetName) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3203);
        __CLR4_4_11xy1xykylvdz04.R.inc(3204);return toString(uri, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents at the given URL.
     *
     * @param url The URL source.
     * @return The contents of the URL as a String.
     * @throws IOException if an I/O exception occurs.
     * @since 2.1
     * @deprecated 2.5 use {@link #toString(URL, Charset)} instead
     */
    @Deprecated
    public static String toString(final URL url) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3205);
        __CLR4_4_11xy1xykylvdz04.R.inc(3206);return toString(url, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents at the given URL.
     *
     * @param url The URL source.
     * @param encoding The encoding name for the URL contents.
     * @return The contents of the URL as a String.
     * @throws IOException if an I/O exception occurs.
     * @since 2.3
     */
    public static String toString(final URL url, final Charset encoding) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3207);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_11xy1xykylvdz04.R.inc(3208);try (__CLR4_4_1$AC7 __CLR$ACI8=new __CLR4_4_1$AC7(){{__CLR4_4_11xy1xykylvdz04.R.inc(3209);}};InputStream inputStream = url.openStream()) {
            __CLR4_4_11xy1xykylvdz04.R.inc(3210);return toString(inputStream, encoding);
        }
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Gets the contents at the given URL.
     *
     * @param url The URL source.
     * @param charsetName The encoding name for the URL contents.
     * @return The contents of the URL as a String.
     * @throws IOException                                  if an I/O exception occurs.
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 2.1
     */
    public static String toString(final URL url, final String charsetName) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3211);
        __CLR4_4_11xy1xykylvdz04.R.inc(3212);return toString(url, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes bytes from a {@code byte[]} to an {@code OutputStream}.
     *
     * @param data the byte array to write, do not modify during output,
     * null ignored
     * @param output the {@code OutputStream} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     */
    public static void write(final byte[] data, final OutputStream output)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3213);
        __CLR4_4_11xy1xykylvdz04.R.inc(3214);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3215)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3216)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3217);output.write(data);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes bytes from a {@code byte[]} to chars on a {@code Writer}
     * using the default character encoding of the platform.
     * <p>
     * This method uses {@link String#String(byte[])}.
     *
     * @param data the byte array to write, do not modify during output,
     * null ignored
     * @param writer the {@code Writer} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated 2.5 use {@link #write(byte[], Writer, Charset)} instead
     */
    @Deprecated
    public static void write(final byte[] data, final Writer writer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3218);
        __CLR4_4_11xy1xykylvdz04.R.inc(3219);write(data, writer, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes bytes from a {@code byte[]} to chars on a {@code Writer}
     * using the specified character encoding.
     * <p>
     * This method uses {@link String#String(byte[], String)}.
     *
     * @param data the byte array to write, do not modify during output,
     * null ignored
     * @param writer the {@code Writer} to write to
     * @param charset the charset to use, null means platform default
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static void write(final byte[] data, final Writer writer, final Charset charset) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3220);
        __CLR4_4_11xy1xykylvdz04.R.inc(3221);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3222)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3223)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3224);writer.write(new String(data, Charsets.toCharset(charset)));
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes bytes from a {@code byte[]} to chars on a {@code Writer}
     * using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method uses {@link String#String(byte[], String)}.
     *
     * @param data the byte array to write, do not modify during output,
     * null ignored
     * @param writer the {@code Writer} to write to
     * @param charsetName the name of the requested charset, null means platform default
     * @throws NullPointerException                         if output is null
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 1.1
     */
    public static void write(final byte[] data, final Writer writer, final String charsetName) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3225);
        __CLR4_4_11xy1xykylvdz04.R.inc(3226);write(data, writer, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code char[]} to bytes on an
     * {@code OutputStream}.
     * <p>
     * This method uses {@link String#String(char[])} and
     * {@link String#getBytes()}.
     *
     * @param data the char array to write, do not modify during output,
     * null ignored
     * @param output the {@code OutputStream} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated 2.5 use {@link #write(char[], OutputStream, Charset)} instead
     */
    @Deprecated
    public static void write(final char[] data, final OutputStream output)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3227);
        __CLR4_4_11xy1xykylvdz04.R.inc(3228);write(data, output, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code char[]} to bytes on an
     * {@code OutputStream} using the specified character encoding.
     * <p>
     * This method uses {@link String#String(char[])} and
     * {@link String#getBytes(String)}.
     *
     * @param data the char array to write, do not modify during output,
     * null ignored
     * @param output the {@code OutputStream} to write to
     * @param charset the charset to use, null means platform default
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static void write(final char[] data, final OutputStream output, final Charset charset) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3229);
        __CLR4_4_11xy1xykylvdz04.R.inc(3230);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3231)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3232)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3233);output.write(new String(data).getBytes(Charsets.toCharset(charset)));
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code char[]} to bytes on an
     * {@code OutputStream} using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method uses {@link String#String(char[])} and
     * {@link String#getBytes(String)}.
     *
     * @param data the char array to write, do not modify during output,
     * null ignored
     * @param output the {@code OutputStream} to write to
     * @param charsetName the name of the requested charset, null means platform default
     * @throws NullPointerException                         if output is null
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the encoding is not supported.
     * @since 1.1
     */
    public static void write(final char[] data, final OutputStream output, final String charsetName)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3234);
        __CLR4_4_11xy1xykylvdz04.R.inc(3235);write(data, output, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code char[]} to a {@code Writer}
     *
     * @param data the char array to write, do not modify during output,
     * null ignored
     * @param writer the {@code Writer} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     */
    public static void write(final char[] data, final Writer writer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3236);
        __CLR4_4_11xy1xykylvdz04.R.inc(3237);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3238)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3239)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3240);writer.write(data);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code CharSequence} to bytes on an
     * {@code OutputStream} using the default character encoding of the
     * platform.
     * <p>
     * This method uses {@link String#getBytes()}.
     *
     * @param data the {@code CharSequence} to write, null ignored
     * @param output the {@code OutputStream} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.0
     * @deprecated 2.5 use {@link #write(CharSequence, OutputStream, Charset)} instead
     */
    @Deprecated
    public static void write(final CharSequence data, final OutputStream output)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3241);
        __CLR4_4_11xy1xykylvdz04.R.inc(3242);write(data, output, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code CharSequence} to bytes on an
     * {@code OutputStream} using the specified character encoding.
     * <p>
     * This method uses {@link String#getBytes(String)}.
     *
     * @param data the {@code CharSequence} to write, null ignored
     * @param output the {@code OutputStream} to write to
     * @param charset the charset to use, null means platform default
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static void write(final CharSequence data, final OutputStream output, final Charset charset)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3243);
        __CLR4_4_11xy1xykylvdz04.R.inc(3244);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3245)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3246)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3247);write(data.toString(), output, charset);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code CharSequence} to bytes on an
     * {@code OutputStream} using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method uses {@link String#getBytes(String)}.
     *
     * @param data the {@code CharSequence} to write, null ignored
     * @param output the {@code OutputStream} to write to
     * @param charsetName the name of the requested charset, null means platform default
     * @throws NullPointerException        if output is null
     * @throws IOException                 if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the encoding is not supported.
     * @since 2.0
     */
    public static void write(final CharSequence data, final OutputStream output, final String charsetName)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3248);
        __CLR4_4_11xy1xykylvdz04.R.inc(3249);write(data, output, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code CharSequence} to a {@code Writer}.
     *
     * @param data the {@code CharSequence} to write, null ignored
     * @param writer the {@code Writer} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.0
     */
    public static void write(final CharSequence data, final Writer writer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3250);
        __CLR4_4_11xy1xykylvdz04.R.inc(3251);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3252)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3253)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3254);write(data.toString(), writer);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}


    /**
     * Writes chars from a {@code String} to bytes on an
     * {@code OutputStream} using the default character encoding of the
     * platform.
     * <p>
     * This method uses {@link String#getBytes()}.
     *
     * @param data the {@code String} to write, null ignored
     * @param output the {@code OutputStream} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated 2.5 use {@link #write(String, OutputStream, Charset)} instead
     */
    @Deprecated
    public static void write(final String data, final OutputStream output)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3255);
        __CLR4_4_11xy1xykylvdz04.R.inc(3256);write(data, output, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code String} to bytes on an
     * {@code OutputStream} using the specified character encoding.
     * <p>
     * This method uses {@link String#getBytes(String)}.
     *
     * @param data the {@code String} to write, null ignored
     * @param output the {@code OutputStream} to write to
     * @param charset the charset to use, null means platform default
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static void write(final String data, final OutputStream output, final Charset charset) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3257);
        __CLR4_4_11xy1xykylvdz04.R.inc(3258);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3259)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3260)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3261);output.write(data.getBytes(Charsets.toCharset(charset)));
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code String} to bytes on an
     * {@code OutputStream} using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method uses {@link String#getBytes(String)}.
     *
     * @param data the {@code String} to write, null ignored
     * @param output the {@code OutputStream} to write to
     * @param charsetName the name of the requested charset, null means platform default
     * @throws NullPointerException        if output is null
     * @throws IOException                 if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the encoding is not supported.
     * @since 1.1
     */
    public static void write(final String data, final OutputStream output, final String charsetName)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3262);
        __CLR4_4_11xy1xykylvdz04.R.inc(3263);write(data, output, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code String} to a {@code Writer}.
     *
     * @param data the {@code String} to write, null ignored
     * @param writer the {@code Writer} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     */
    public static void write(final String data, final Writer writer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3264);
        __CLR4_4_11xy1xykylvdz04.R.inc(3265);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3266)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3267)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3268);writer.write(data);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code StringBuffer} to bytes on an
     * {@code OutputStream} using the default character encoding of the
     * platform.
     * <p>
     * This method uses {@link String#getBytes()}.
     *
     * @param data the {@code StringBuffer} to write, null ignored
     * @param output the {@code OutputStream} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated replaced by write(CharSequence, OutputStream)
     */
    @Deprecated
    public static void write(final StringBuffer data, final OutputStream output) //NOSONAR
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3269);
        __CLR4_4_11xy1xykylvdz04.R.inc(3270);write(data, output, (String) null);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code StringBuffer} to bytes on an
     * {@code OutputStream} using the specified character encoding.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     * <p>
     * This method uses {@link String#getBytes(String)}.
     *
     * @param data the {@code StringBuffer} to write, null ignored
     * @param output the {@code OutputStream} to write to
     * @param charsetName the name of the requested charset, null means platform default
     * @throws NullPointerException        if output is null
     * @throws IOException                 if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the encoding is not supported.
     * @since 1.1
     * @deprecated replaced by write(CharSequence, OutputStream, String)
     */
    @Deprecated
    public static void write(final StringBuffer data, final OutputStream output, final String charsetName) //NOSONAR
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3271);
        __CLR4_4_11xy1xykylvdz04.R.inc(3272);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3273)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3274)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3275);output.write(data.toString().getBytes(Charsets.toCharset(charsetName)));
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code StringBuffer} to a {@code Writer}.
     *
     * @param data the {@code StringBuffer} to write, null ignored
     * @param writer the {@code Writer} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated replaced by write(CharSequence, Writer)
     */
    @Deprecated
    public static void write(final StringBuffer data, final Writer writer) //NOSONAR
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3276);
        __CLR4_4_11xy1xykylvdz04.R.inc(3277);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3278)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3279)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3280);writer.write(data.toString());
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes bytes from a {@code byte[]} to an {@code OutputStream} using chunked writes.
     * This is intended for writing very large byte arrays which might otherwise cause excessive
     * memory usage if the native code has to allocate a copy.
     *
     * @param data the byte array to write, do not modify during output,
     * null ignored
     * @param output the {@code OutputStream} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.5
     */
    public static void writeChunked(final byte[] data, final OutputStream output)
            throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3281);
        __CLR4_4_11xy1xykylvdz04.R.inc(3282);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3283)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3284)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3285);int bytes = data.length;
            __CLR4_4_11xy1xykylvdz04.R.inc(3286);int offset = 0;
            __CLR4_4_11xy1xykylvdz04.R.inc(3287);while ((((bytes > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3288)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3289)==0&false))) {{
                __CLR4_4_11xy1xykylvdz04.R.inc(3290);final int chunk = Math.min(bytes, DEFAULT_BUFFER_SIZE);
                __CLR4_4_11xy1xykylvdz04.R.inc(3291);output.write(data, offset, chunk);
                __CLR4_4_11xy1xykylvdz04.R.inc(3292);bytes -= chunk;
                __CLR4_4_11xy1xykylvdz04.R.inc(3293);offset += chunk;
            }
        }}
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes chars from a {@code char[]} to a {@code Writer} using chunked writes.
     * This is intended for writing very large byte arrays which might otherwise cause excessive
     * memory usage if the native code has to allocate a copy.
     *
     * @param data the char array to write, do not modify during output,
     * null ignored
     * @param writer the {@code Writer} to write to
     * @throws NullPointerException if output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.5
     */
    public static void writeChunked(final char[] data, final Writer writer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3294);
        __CLR4_4_11xy1xykylvdz04.R.inc(3295);if ((((data != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3296)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3297)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3298);int bytes = data.length;
            __CLR4_4_11xy1xykylvdz04.R.inc(3299);int offset = 0;
            __CLR4_4_11xy1xykylvdz04.R.inc(3300);while ((((bytes > 0)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3301)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3302)==0&false))) {{
                __CLR4_4_11xy1xykylvdz04.R.inc(3303);final int chunk = Math.min(bytes, DEFAULT_BUFFER_SIZE);
                __CLR4_4_11xy1xykylvdz04.R.inc(3304);writer.write(data, offset, chunk);
                __CLR4_4_11xy1xykylvdz04.R.inc(3305);bytes -= chunk;
                __CLR4_4_11xy1xykylvdz04.R.inc(3306);offset += chunk;
            }
        }}
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * an {@code OutputStream} line by line, using the default character
     * encoding of the platform and the specified line ending.
     *
     * @param lines the lines to write, null entries produce blank lines
     * @param lineEnding the line separator to use, null is system default
     * @param output the {@code OutputStream} to write to, not null, not closed
     * @throws NullPointerException if the output is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     * @deprecated 2.5 use {@link #writeLines(Collection, String, OutputStream, Charset)} instead
     */
    @Deprecated
    public static void writeLines(final Collection<?> lines, final String lineEnding,
                                  final OutputStream output) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3307);
        __CLR4_4_11xy1xykylvdz04.R.inc(3308);writeLines(lines, lineEnding, output, Charset.defaultCharset());
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * an {@code OutputStream} line by line, using the specified character
     * encoding and the specified line ending.
     *
     * @param lines the lines to write, null entries produce blank lines
     * @param lineEnding the line separator to use, null is system default
     * @param output the {@code OutputStream} to write to, not null, not closed
     * @param charset the charset to use, null means platform default
     * @throws NullPointerException if the output is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    public static void writeLines(final Collection<?> lines, String lineEnding, final OutputStream output,
                                  final Charset charset) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3309);
        __CLR4_4_11xy1xykylvdz04.R.inc(3310);if ((((lines == null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3311)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3312)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3313);return;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3314);if ((((lineEnding == null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3315)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3316)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3317);lineEnding = System.lineSeparator();
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3318);final Charset cs = Charsets.toCharset(charset);
        __CLR4_4_11xy1xykylvdz04.R.inc(3319);for (final Object line : lines) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3320);if ((((line != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3321)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3322)==0&false))) {{
                __CLR4_4_11xy1xykylvdz04.R.inc(3323);output.write(line.toString().getBytes(cs));
            }
            }__CLR4_4_11xy1xykylvdz04.R.inc(3324);output.write(lineEnding.getBytes(cs));
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * an {@code OutputStream} line by line, using the specified character
     * encoding and the specified line ending.
     * <p>
     * Character encoding names can be found at
     * <a href="http://www.iana.org/assignments/character-sets">IANA</a>.
     *
     * @param lines the lines to write, null entries produce blank lines
     * @param lineEnding the line separator to use, null is system default
     * @param output the {@code OutputStream} to write to, not null, not closed
     * @param charsetName the name of the requested charset, null means platform default
     * @throws NullPointerException                         if the output is null
     * @throws IOException                                  if an I/O error occurs
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     *                                                      .UnsupportedEncodingException} in version 2.2 if the
     *                                                      encoding is not supported.
     * @since 1.1
     */
    public static void writeLines(final Collection<?> lines, final String lineEnding,
                                  final OutputStream output, final String charsetName) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3325);
        __CLR4_4_11xy1xykylvdz04.R.inc(3326);writeLines(lines, lineEnding, output, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * a {@code Writer} line by line, using the specified line ending.
     *
     * @param lines the lines to write, null entries produce blank lines
     * @param lineEnding the line separator to use, null is system default
     * @param writer the {@code Writer} to write to, not null, not closed
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 1.1
     */
    public static void writeLines(final Collection<?> lines, String lineEnding,
                                  final Writer writer) throws IOException {try{__CLR4_4_11xy1xykylvdz04.R.inc(3327);
        __CLR4_4_11xy1xykylvdz04.R.inc(3328);if ((((lines == null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3329)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3330)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3331);return;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3332);if ((((lineEnding == null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3333)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3334)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3335);lineEnding = System.lineSeparator();
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3336);for (final Object line : lines) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3337);if ((((line != null)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3338)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3339)==0&false))) {{
                __CLR4_4_11xy1xykylvdz04.R.inc(3340);writer.write(line.toString());
            }
            }__CLR4_4_11xy1xykylvdz04.R.inc(3341);writer.write(lineEnding);
        }
    }}finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Returns the given Appendable if it is already a {@link Writer}, otherwise creates a Writer wrapper around the
     * given Appendable.
     *
     * @param appendable the Appendable to wrap or return (not null)
     * @return  the given Appendable or a Writer wrapper around the given Appendable
     * @throws NullPointerException if the input parameter is null
     * @since 2.7
     */
    public static Writer writer(final Appendable appendable) {try{__CLR4_4_11xy1xykylvdz04.R.inc(3342);
        __CLR4_4_11xy1xykylvdz04.R.inc(3343);Objects.requireNonNull(appendable, "appendable");
        __CLR4_4_11xy1xykylvdz04.R.inc(3344);if ((((appendable instanceof Writer)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3345)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3346)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3347);return (Writer) appendable;
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3348);if ((((appendable instanceof StringBuilder)&&(__CLR4_4_11xy1xykylvdz04.R.iget(3349)!=0|true))||(__CLR4_4_11xy1xykylvdz04.R.iget(3350)==0&false))) {{
            __CLR4_4_11xy1xykylvdz04.R.inc(3351);return new StringBuilderWriter((StringBuilder) appendable);
        }
        }__CLR4_4_11xy1xykylvdz04.R.inc(3352);return new AppendableWriter<>(appendable);
    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

    /**
     * Instances should NOT be constructed in standard programming.
     */
    public IOUtils() {try{__CLR4_4_11xy1xykylvdz04.R.inc(3353); //NOSONAR

    }finally{__CLR4_4_11xy1xykylvdz04.R.flushNeeded();}}

}
