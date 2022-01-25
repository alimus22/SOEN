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
package org.apache.commons.io.output;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * Writer of files that allows the encoding to be set.
 * <p>
 * This class provides a simple alternative to {@code FileWriter}
 * that allows an encoding to be set. Unfortunately, it cannot subclass
 * {@code FileWriter}.
 * </p>
 * <p>
 * By default, the file will be overwritten, but this may be changed to append.
 * </p>
 * <p>
 * The encoding must be specified using either the name of the {@link Charset},
 * the {@link Charset}, or a {@link CharsetEncoder}. If the default encoding
 * is required then use the {@link java.io.FileWriter} directly, rather than
 * this implementation.
 * </p>
 *
 * @since 1.4
 */
public class FileWriterWithEncoding extends Writer {public static class __CLR4_4_16vl6vlkylve0d8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8977,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Cannot extend ProxyWriter, as requires writer to be
    // known when super() is called

    /** The writer to decorate. */
    private final Writer out;

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param fileName  the name of the file to write to, not null
     * @param charsetName  the name of the requested charset, not null
     * @throws NullPointerException if the file name or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final String fileName, final String charsetName) throws IOException {
        this(new File(fileName), charsetName, false);__CLR4_4_16vl6vlkylve0d8.R.inc(8914);try{__CLR4_4_16vl6vlkylve0d8.R.inc(8913);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param fileName  the name of the file to write to, not null
     * @param charsetName  the name of the requested charset, not null
     * @param append  true if content should be appended, false to overwrite
     * @throws NullPointerException if the file name or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final String fileName, final String charsetName, final boolean append)
            throws IOException {
        this(new File(fileName), charsetName, append);__CLR4_4_16vl6vlkylve0d8.R.inc(8916);try{__CLR4_4_16vl6vlkylve0d8.R.inc(8915);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param fileName  the name of the file to write to, not null
     * @param charset  the charset to use, not null
     * @throws NullPointerException if the file name or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final String fileName, final Charset charset) throws IOException {
        this(new File(fileName), charset, false);__CLR4_4_16vl6vlkylve0d8.R.inc(8918);try{__CLR4_4_16vl6vlkylve0d8.R.inc(8917);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param fileName  the name of the file to write to, not null
     * @param charset  the encoding to use, not null
     * @param append  true if content should be appended, false to overwrite
     * @throws NullPointerException if the file name or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final String fileName, final Charset charset, final boolean append)
            throws IOException {
        this(new File(fileName), charset, append);__CLR4_4_16vl6vlkylve0d8.R.inc(8920);try{__CLR4_4_16vl6vlkylve0d8.R.inc(8919);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param fileName  the name of the file to write to, not null
     * @param encoding  the encoding to use, not null
     * @throws NullPointerException if the file name or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final String fileName, final CharsetEncoder encoding) throws IOException {
        this(new File(fileName), encoding, false);__CLR4_4_16vl6vlkylve0d8.R.inc(8922);try{__CLR4_4_16vl6vlkylve0d8.R.inc(8921);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param fileName  the name of the file to write to, not null
     * @param charsetEncoder  the encoding to use, not null
     * @param append  true if content should be appended, false to overwrite
     * @throws NullPointerException if the file name or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final String fileName, final CharsetEncoder charsetEncoder, final boolean append)
            throws IOException {
        this(new File(fileName), charsetEncoder, append);__CLR4_4_16vl6vlkylve0d8.R.inc(8924);try{__CLR4_4_16vl6vlkylve0d8.R.inc(8923);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param charsetName  the name of the requested charset, not null
     * @throws NullPointerException if the file or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final File file, final String charsetName) throws IOException {
        this(file, charsetName, false);__CLR4_4_16vl6vlkylve0d8.R.inc(8926);try{__CLR4_4_16vl6vlkylve0d8.R.inc(8925);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param charsetName  the name of the requested charset, not null
     * @param append  true if content should be appended, false to overwrite
     * @throws NullPointerException if the file or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final File file, final String charsetName, final boolean append) throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8927);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8928);this.out = initWriter(file, charsetName, append);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param charset  the encoding to use, not null
     * @throws NullPointerException if the file or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final File file, final Charset charset) throws IOException {
        this(file, charset, false);__CLR4_4_16vl6vlkylve0d8.R.inc(8930);try{__CLR4_4_16vl6vlkylve0d8.R.inc(8929);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param encoding  the name of the requested charset, not null
     * @param append  true if content should be appended, false to overwrite
     * @throws NullPointerException if the file or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final File file, final Charset encoding, final boolean append) throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8931);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8932);this.out = initWriter(file, encoding, append);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param charsetEncoder  the encoding to use, not null
     * @throws NullPointerException if the file or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final File file, final CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);__CLR4_4_16vl6vlkylve0d8.R.inc(8934);try{__CLR4_4_16vl6vlkylve0d8.R.inc(8933);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Constructs a FileWriterWithEncoding with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param charsetEncoder  the encoding to use, not null
     * @param append  true if content should be appended, false to overwrite
     * @throws NullPointerException if the file or encoding is null
     * @throws IOException in case of an I/O error
     */
    public FileWriterWithEncoding(final File file, final CharsetEncoder charsetEncoder, final boolean append)
            throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8935);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8936);this.out = initWriter(file, charsetEncoder, append);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Initialize the wrapped file writer.
     * Ensure that a cleanup occurs if the writer creation fails.
     *
     * @param file  the file to be accessed
     * @param encoding  the encoding to use - may be Charset, CharsetEncoder or String
     * @param append  true to append
     * @return the initialized writer
     * @throws NullPointerException if the file or encoding is null
     * @throws IOException if an error occurs
     */
     private static Writer initWriter(final File file, final Object encoding, final boolean append) throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8937);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8938);Objects.requireNonNull(file, "file");
        __CLR4_4_16vl6vlkylve0d8.R.inc(8939);Objects.requireNonNull(encoding, "encoding");
        __CLR4_4_16vl6vlkylve0d8.R.inc(8940);OutputStream stream = null;
        __CLR4_4_16vl6vlkylve0d8.R.inc(8941);final boolean fileExistedAlready = file.exists();
        __CLR4_4_16vl6vlkylve0d8.R.inc(8942);try {
            __CLR4_4_16vl6vlkylve0d8.R.inc(8943);stream = Files.newOutputStream(file.toPath(),  (((append )&&(__CLR4_4_16vl6vlkylve0d8.R.iget(8944)!=0|true))||(__CLR4_4_16vl6vlkylve0d8.R.iget(8945)==0&false))? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
            __CLR4_4_16vl6vlkylve0d8.R.inc(8946);if ((((encoding instanceof Charset)&&(__CLR4_4_16vl6vlkylve0d8.R.iget(8947)!=0|true))||(__CLR4_4_16vl6vlkylve0d8.R.iget(8948)==0&false))) {{
                __CLR4_4_16vl6vlkylve0d8.R.inc(8949);return new OutputStreamWriter(stream, (Charset)encoding);
            }
            }__CLR4_4_16vl6vlkylve0d8.R.inc(8950);if ((((encoding instanceof CharsetEncoder)&&(__CLR4_4_16vl6vlkylve0d8.R.iget(8951)!=0|true))||(__CLR4_4_16vl6vlkylve0d8.R.iget(8952)==0&false))) {{
                __CLR4_4_16vl6vlkylve0d8.R.inc(8953);return new OutputStreamWriter(stream, (CharsetEncoder)encoding);
            }
            }__CLR4_4_16vl6vlkylve0d8.R.inc(8954);return new OutputStreamWriter(stream, (String)encoding);
        } catch (final IOException | RuntimeException ex) {
            __CLR4_4_16vl6vlkylve0d8.R.inc(8955);try {
                __CLR4_4_16vl6vlkylve0d8.R.inc(8956);IOUtils.close(stream);
            } catch (final IOException e) {
                __CLR4_4_16vl6vlkylve0d8.R.inc(8957);ex.addSuppressed(e);
            }
            __CLR4_4_16vl6vlkylve0d8.R.inc(8958);if ((((!fileExistedAlready)&&(__CLR4_4_16vl6vlkylve0d8.R.iget(8959)!=0|true))||(__CLR4_4_16vl6vlkylve0d8.R.iget(8960)==0&false))) {{
                __CLR4_4_16vl6vlkylve0d8.R.inc(8961);FileUtils.deleteQuietly(file);
            }
            }__CLR4_4_16vl6vlkylve0d8.R.inc(8962);throw ex;
        }
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Write a character.
     * @param idx the character to write
     * @throws IOException if an I/O error occurs.
     */
     @Override
    public void write(final int idx) throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8963);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8964);out.write(idx);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Write the characters from an array.
     * @param chr the characters to write
     * @throws IOException if an I/O error occurs.
     */
     @Override
    public void write(final char[] chr) throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8965);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8966);out.write(chr);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Write the specified characters from an array.
     * @param chr the characters to write
     * @param st The start offset
     * @param end The number of characters to write
     * @throws IOException if an I/O error occurs.
     */
     @Override
    public void write(final char[] chr, final int st, final int end) throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8967);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8968);out.write(chr, st, end);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Write the characters from a string.
     * @param str the string to write
     * @throws IOException if an I/O error occurs.
     */
     @Override
    public void write(final String str) throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8969);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8970);out.write(str);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Write the specified characters from a string.
     * @param str the string to write
     * @param st The start offset
     * @param end The number of characters to write
     * @throws IOException if an I/O error occurs.
     */
     @Override
    public void write(final String str, final int st, final int end) throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8971);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8972);out.write(str, st, end);
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Flush the stream.
     * @throws IOException if an I/O error occurs.
     */
     @Override
    public void flush() throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8973);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8974);out.flush();
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}

    /**
     * Close the stream.
     * @throws IOException if an I/O error occurs.
     */
     @Override
    public void close() throws IOException {try{__CLR4_4_16vl6vlkylve0d8.R.inc(8975);
        __CLR4_4_16vl6vlkylve0d8.R.inc(8976);out.close();
    }finally{__CLR4_4_16vl6vlkylve0d8.R.flushNeeded();}}
}
