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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

/**
 * FileWriter that will create and honor lock files to allow simple
 * cross thread file lock handling.
 * <p>
 * This class provides a simple alternative to {@code FileWriter}
 * that will use a lock file to prevent duplicate writes.
 * </p>
 * <p>
 * <b>Note:</b> The lock file is deleted when {@link #close()} is called
 * - or if the main file cannot be opened initially.
 * In the (unlikely) event that the lock file cannot be deleted,
 * an exception is thrown.
 * </p>
 * <p>
 * By default, the file will be overwritten, but this may be changed to append.
 * The lock directory may be specified, but defaults to the system property
 * {@code java.io.tmpdir}.
 * The encoding may also be specified, and defaults to the platform default.
 * </p>
 */
public class LockableFileWriter extends Writer {public static class __CLR4_4_1723723kylve0e8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9227,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Cannot extend ProxyWriter, as requires writer to be
    // known when super() is called

    /** The extension for the lock file. */
    private static final String LCK = ".lck";

    /** The writer to decorate. */
    private final Writer out;

    /** The lock file. */
    private final File lockFile;

    /**
     * Constructs a LockableFileWriter.
     * If the file exists, it is overwritten.
     *
     * @param fileName  the file to write to, not null
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     */
    public LockableFileWriter(final String fileName) throws IOException {
        this(fileName, false, null);__CLR4_4_1723723kylve0e8.R.inc(9148);try{__CLR4_4_1723723kylve0e8.R.inc(9147);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Constructs a LockableFileWriter.
     *
     * @param fileName  file to write to, not null
     * @param append  true if content should be appended, false to overwrite
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     */
    public LockableFileWriter(final String fileName, final boolean append) throws IOException {
        this(fileName, append, null);__CLR4_4_1723723kylve0e8.R.inc(9150);try{__CLR4_4_1723723kylve0e8.R.inc(9149);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Constructs a LockableFileWriter.
     *
     * @param fileName  the file to write to, not null
     * @param append  true if content should be appended, false to overwrite
     * @param lockDir  the directory in which the lock file should be held
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     */
    public LockableFileWriter(final String fileName, final boolean append, final String lockDir) throws IOException {
        this(new File(fileName), append, lockDir);__CLR4_4_1723723kylve0e8.R.inc(9152);try{__CLR4_4_1723723kylve0e8.R.inc(9151);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Constructs a LockableFileWriter.
     * If the file exists, it is overwritten.
     *
     * @param file  the file to write to, not null
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     */
    public LockableFileWriter(final File file) throws IOException {
        this(file, false, null);__CLR4_4_1723723kylve0e8.R.inc(9154);try{__CLR4_4_1723723kylve0e8.R.inc(9153);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Constructs a LockableFileWriter.
     *
     * @param file  the file to write to, not null
     * @param append  true if content should be appended, false to overwrite
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     */
    public LockableFileWriter(final File file, final boolean append) throws IOException {
        this(file, append, null);__CLR4_4_1723723kylve0e8.R.inc(9156);try{__CLR4_4_1723723kylve0e8.R.inc(9155);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Constructs a LockableFileWriter.
     *
     * @param file  the file to write to, not null
     * @param append  true if content should be appended, false to overwrite
     * @param lockDir  the directory in which the lock file should be held
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     * @deprecated 2.5 use {@link #LockableFileWriter(File, Charset, boolean, String)} instead
     */
    @Deprecated
    public LockableFileWriter(final File file, final boolean append, final String lockDir) throws IOException {
        this(file, Charset.defaultCharset(), append, lockDir);__CLR4_4_1723723kylve0e8.R.inc(9158);try{__CLR4_4_1723723kylve0e8.R.inc(9157);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Constructs a LockableFileWriter with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param charset  the charset to use, null means platform default
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     * @since 2.3
     */
    public LockableFileWriter(final File file, final Charset charset) throws IOException {
        this(file, charset, false, null);__CLR4_4_1723723kylve0e8.R.inc(9160);try{__CLR4_4_1723723kylve0e8.R.inc(9159);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Constructs a LockableFileWriter with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param charsetName  the name of the requested charset, null means platform default
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     * @throws java.nio.charset.UnsupportedCharsetException
     *             thrown instead of {@link java.io.UnsupportedEncodingException} in version 2.2 if the encoding is not
     *             supported.
     */
    public LockableFileWriter(final File file, final String charsetName) throws IOException {
        this(file, charsetName, false, null);__CLR4_4_1723723kylve0e8.R.inc(9162);try{__CLR4_4_1723723kylve0e8.R.inc(9161);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Constructs a LockableFileWriter with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param charset  the name of the requested charset, null means platform default
     * @param append  true if content should be appended, false to overwrite
     * @param lockDir  the directory in which the lock file should be held
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     * @since 2.3
     */
    public LockableFileWriter(File file, final Charset charset, final boolean append,
            String lockDir) throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9163);
        // init file to create/append
        __CLR4_4_1723723kylve0e8.R.inc(9164);file = file.getAbsoluteFile();
        __CLR4_4_1723723kylve0e8.R.inc(9165);if ((((file.getParentFile() != null)&&(__CLR4_4_1723723kylve0e8.R.iget(9166)!=0|true))||(__CLR4_4_1723723kylve0e8.R.iget(9167)==0&false))) {{
            __CLR4_4_1723723kylve0e8.R.inc(9168);FileUtils.forceMkdir(file.getParentFile());
        }
        }__CLR4_4_1723723kylve0e8.R.inc(9169);if ((((file.isDirectory())&&(__CLR4_4_1723723kylve0e8.R.iget(9170)!=0|true))||(__CLR4_4_1723723kylve0e8.R.iget(9171)==0&false))) {{
            __CLR4_4_1723723kylve0e8.R.inc(9172);throw new IOException("File specified is a directory");
        }

        // init lock file
        }__CLR4_4_1723723kylve0e8.R.inc(9173);if ((((lockDir == null)&&(__CLR4_4_1723723kylve0e8.R.iget(9174)!=0|true))||(__CLR4_4_1723723kylve0e8.R.iget(9175)==0&false))) {{
            __CLR4_4_1723723kylve0e8.R.inc(9176);lockDir = System.getProperty("java.io.tmpdir");
        }
        }__CLR4_4_1723723kylve0e8.R.inc(9177);final File lockDirFile = new File(lockDir);
        __CLR4_4_1723723kylve0e8.R.inc(9178);FileUtils.forceMkdir(lockDirFile);
        __CLR4_4_1723723kylve0e8.R.inc(9179);testLockDir(lockDirFile);
        __CLR4_4_1723723kylve0e8.R.inc(9180);lockFile = new File(lockDirFile, file.getName() + LCK);

        // check if locked
        __CLR4_4_1723723kylve0e8.R.inc(9181);createLock();

        // init wrapped writer
        __CLR4_4_1723723kylve0e8.R.inc(9182);out = initWriter(file, charset, append);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Constructs a LockableFileWriter with a file encoding.
     *
     * @param file  the file to write to, not null
     * @param charsetName  the encoding to use, null means platform default
     * @param append  true if content should be appended, false to overwrite
     * @param lockDir  the directory in which the lock file should be held
     * @throws NullPointerException if the file is null
     * @throws IOException in case of an I/O error
     * @throws java.nio.charset.UnsupportedCharsetException
     *             thrown instead of {@link java.io.UnsupportedEncodingException} in version 2.2 if the encoding is not
     *             supported.
     */
    public LockableFileWriter(final File file, final String charsetName, final boolean append,
            final String lockDir) throws IOException {
        this(file, Charsets.toCharset(charsetName), append, lockDir);__CLR4_4_1723723kylve0e8.R.inc(9184);try{__CLR4_4_1723723kylve0e8.R.inc(9183);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Tests that we can write to the lock directory.
     *
     * @param lockDir  the File representing the lock directory
     * @throws IOException if we cannot write to the lock directory
     * @throws IOException if we cannot find the lock file
     */
    private void testLockDir(final File lockDir) throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9185);
        __CLR4_4_1723723kylve0e8.R.inc(9186);if ((((!lockDir.exists())&&(__CLR4_4_1723723kylve0e8.R.iget(9187)!=0|true))||(__CLR4_4_1723723kylve0e8.R.iget(9188)==0&false))) {{
            __CLR4_4_1723723kylve0e8.R.inc(9189);throw new IOException(
                    "Could not find lockDir: " + lockDir.getAbsolutePath());
        }
        }__CLR4_4_1723723kylve0e8.R.inc(9190);if ((((!lockDir.canWrite())&&(__CLR4_4_1723723kylve0e8.R.iget(9191)!=0|true))||(__CLR4_4_1723723kylve0e8.R.iget(9192)==0&false))) {{
            __CLR4_4_1723723kylve0e8.R.inc(9193);throw new IOException(
                    "Could not write to lockDir: " + lockDir.getAbsolutePath());
        }
    }}finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Creates the lock file.
     *
     * @throws IOException if we cannot create the file
     */
    private void createLock() throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9194);
        __CLR4_4_1723723kylve0e8.R.inc(9195);synchronized (LockableFileWriter.class) {
            __CLR4_4_1723723kylve0e8.R.inc(9196);if ((((!lockFile.createNewFile())&&(__CLR4_4_1723723kylve0e8.R.iget(9197)!=0|true))||(__CLR4_4_1723723kylve0e8.R.iget(9198)==0&false))) {{
                __CLR4_4_1723723kylve0e8.R.inc(9199);throw new IOException("Can't write file, lock " +
                        lockFile.getAbsolutePath() + " exists");
            }
            }__CLR4_4_1723723kylve0e8.R.inc(9200);lockFile.deleteOnExit();
        }
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Initializes the wrapped file writer.
     * Ensure that a cleanup occurs if the writer creation fails.
     *
     * @param file  the file to be accessed
     * @param charset  the charset to use
     * @param append  true to append
     * @return The initialized writer
     * @throws IOException if an error occurs
     */
    private Writer initWriter(final File file, final Charset charset, final boolean append) throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9201);
        __CLR4_4_1723723kylve0e8.R.inc(9202);final boolean fileExistedAlready = file.exists();
        __CLR4_4_1723723kylve0e8.R.inc(9203);try {
            __CLR4_4_1723723kylve0e8.R.inc(9204);return new OutputStreamWriter(new FileOutputStream(file.getAbsolutePath(), append),
                                          Charsets.toCharset(charset));

        } catch (final IOException | RuntimeException ex) {
            __CLR4_4_1723723kylve0e8.R.inc(9205);FileUtils.deleteQuietly(lockFile);
            __CLR4_4_1723723kylve0e8.R.inc(9206);if ((((!fileExistedAlready)&&(__CLR4_4_1723723kylve0e8.R.iget(9207)!=0|true))||(__CLR4_4_1723723kylve0e8.R.iget(9208)==0&false))) {{
                __CLR4_4_1723723kylve0e8.R.inc(9209);FileUtils.deleteQuietly(file);
            }
            }__CLR4_4_1723723kylve0e8.R.inc(9210);throw ex;
        }
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Closes the file writer and deletes the lock file.
     *
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9211);
        __CLR4_4_1723723kylve0e8.R.inc(9212);try {
            __CLR4_4_1723723kylve0e8.R.inc(9213);out.close();
        } finally {
            __CLR4_4_1723723kylve0e8.R.inc(9214);FileUtils.delete(lockFile);
        }
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Writes a character.
     * @param c the character to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final int c) throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9215);
        __CLR4_4_1723723kylve0e8.R.inc(9216);out.write(c);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Writes the characters from an array.
     * @param cbuf the characters to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final char[] cbuf) throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9217);
        __CLR4_4_1723723kylve0e8.R.inc(9218);out.write(cbuf);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Writes the specified characters from an array.
     * @param cbuf the characters to write
     * @param off The start offset
     * @param len The number of characters to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9219);
        __CLR4_4_1723723kylve0e8.R.inc(9220);out.write(cbuf, off, len);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Writes the characters from a string.
     * @param str the string to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final String str) throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9221);
        __CLR4_4_1723723kylve0e8.R.inc(9222);out.write(str);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Writes the specified characters from a string.
     * @param str the string to write
     * @param off The start offset
     * @param len The number of characters to write
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void write(final String str, final int off, final int len) throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9223);
        __CLR4_4_1723723kylve0e8.R.inc(9224);out.write(str, off, len);
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

    /**
     * Flushes the stream.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public void flush() throws IOException {try{__CLR4_4_1723723kylve0e8.R.inc(9225);
        __CLR4_4_1723723kylve0e8.R.inc(9226);out.flush();
    }finally{__CLR4_4_1723723kylve0e8.R.flushNeeded();}}

}
