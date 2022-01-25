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
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * An output stream which will retain data in memory until a specified threshold is reached, and only then commit it to
 * disk. If the stream is closed before the threshold is reached, the data will not be written to disk at all.
 * <p>
 * This class originated in FileUpload processing. In this use case, you do not know in advance the size of the file
 * being uploaded. If the file is small you want to store it in memory (for speed), but if the file is large you want to
 * store it to file (to avoid memory issues).
 * </p>
 */
public class DeferredFileOutputStream extends ThresholdingOutputStream {public static class __CLR4_4_16sv6svkylve0ci{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8895,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The output stream to which data will be written prior to the threshold being reached.
     */
    private ByteArrayOutputStream memoryOutputStream;

    /**
     * The output stream to which data will be written at any given time. This will always be one of
     * {@code memoryOutputStream} or {@code diskOutputStream}.
     */
    private OutputStream currentOutputStream;

    /**
     * The file to which output will be directed if the threshold is exceeded.
     */
    private File outputFile;

    /**
     * The temporary file prefix.
     */
    private final String prefix;

    /**
     * The temporary file suffix.
     */
    private final String suffix;

    /**
     * The directory to use for temporary files.
     */
    private final File directory;

    /**
     * True when close() has been called successfully.
     */
    private boolean closed;

    /**
     * Constructs an instance of this class which will trigger an event at the specified threshold, and save data to a
     * file beyond that point. The initial buffer size will default to
     * {@value AbstractByteArrayOutputStream#DEFAULT_SIZE} bytes which is ByteArrayOutputStream's default buffer size.
     *
     * @param threshold The number of bytes at which to trigger an event.
     * @param outputFile The file to which data is saved beyond the threshold.
     */
    public DeferredFileOutputStream(final int threshold, final File outputFile) {
        this(threshold, outputFile, null, null, null, AbstractByteArrayOutputStream.DEFAULT_SIZE);__CLR4_4_16sv6svkylve0ci.R.inc(8816);try{__CLR4_4_16sv6svkylve0ci.R.inc(8815);
    }finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Constructs an instance of this class which will trigger an event at the specified threshold, and save data either
     * to a file beyond that point.
     *
     * @param threshold The number of bytes at which to trigger an event.
     * @param outputFile The file to which data is saved beyond the threshold.
     * @param prefix Prefix to use for the temporary file.
     * @param suffix Suffix to use for the temporary file.
     * @param directory Temporary file directory.
     * @param initialBufferSize The initial size of the in memory buffer.
     */
    private DeferredFileOutputStream(final int threshold, final File outputFile, final String prefix,
        final String suffix, final File directory, final int initialBufferSize) {
        super(threshold);__CLR4_4_16sv6svkylve0ci.R.inc(8818);try{__CLR4_4_16sv6svkylve0ci.R.inc(8817);
        __CLR4_4_16sv6svkylve0ci.R.inc(8819);this.outputFile = outputFile;
        __CLR4_4_16sv6svkylve0ci.R.inc(8820);this.prefix = prefix;
        __CLR4_4_16sv6svkylve0ci.R.inc(8821);this.suffix = suffix;
        __CLR4_4_16sv6svkylve0ci.R.inc(8822);this.directory = directory;

        __CLR4_4_16sv6svkylve0ci.R.inc(8823);memoryOutputStream = new ByteArrayOutputStream(initialBufferSize);
        __CLR4_4_16sv6svkylve0ci.R.inc(8824);currentOutputStream = memoryOutputStream;
    }finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Constructs an instance of this class which will trigger an event at the specified threshold, and save data to a
     * file beyond that point.
     *
     * @param threshold The number of bytes at which to trigger an event.
     * @param initialBufferSize The initial size of the in memory buffer.
     * @param outputFile The file to which data is saved beyond the threshold.
     *
     * @since 2.5
     */
    public DeferredFileOutputStream(final int threshold, final int initialBufferSize, final File outputFile) {
        this(threshold, outputFile, null, null, null, initialBufferSize);__CLR4_4_16sv6svkylve0ci.R.inc(8826);try{__CLR4_4_16sv6svkylve0ci.R.inc(8825);
        __CLR4_4_16sv6svkylve0ci.R.inc(8827);if ((((initialBufferSize < 0)&&(__CLR4_4_16sv6svkylve0ci.R.iget(8828)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8829)==0&false))) {{
            __CLR4_4_16sv6svkylve0ci.R.inc(8830);throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }}finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Constructs an instance of this class which will trigger an event at the specified threshold, and save data to a
     * temporary file beyond that point.
     *
     * @param threshold The number of bytes at which to trigger an event.
     * @param initialBufferSize The initial size of the in memory buffer.
     * @param prefix Prefix to use for the temporary file.
     * @param suffix Suffix to use for the temporary file.
     * @param directory Temporary file directory.
     *
     * @since 2.5
     */
    public DeferredFileOutputStream(final int threshold, final int initialBufferSize, final String prefix,
        final String suffix, final File directory) {
        this(threshold, null, prefix, suffix, directory, initialBufferSize);__CLR4_4_16sv6svkylve0ci.R.inc(8832);try{__CLR4_4_16sv6svkylve0ci.R.inc(8831);
        __CLR4_4_16sv6svkylve0ci.R.inc(8833);if ((((prefix == null)&&(__CLR4_4_16sv6svkylve0ci.R.iget(8834)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8835)==0&false))) {{
            __CLR4_4_16sv6svkylve0ci.R.inc(8836);throw new IllegalArgumentException("Temporary file prefix is missing");
        }
        }__CLR4_4_16sv6svkylve0ci.R.inc(8837);if ((((initialBufferSize < 0)&&(__CLR4_4_16sv6svkylve0ci.R.iget(8838)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8839)==0&false))) {{
            __CLR4_4_16sv6svkylve0ci.R.inc(8840);throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }}finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Constructs an instance of this class which will trigger an event at the specified threshold, and save data to a
     * temporary file beyond that point. The initial buffer size will default to 32 bytes which is
     * ByteArrayOutputStream's default buffer size.
     *
     * @param threshold The number of bytes at which to trigger an event.
     * @param prefix Prefix to use for the temporary file.
     * @param suffix Suffix to use for the temporary file.
     * @param directory Temporary file directory.
     *
     * @since 1.4
     */
    public DeferredFileOutputStream(final int threshold, final String prefix, final String suffix,
        final File directory) {
        this(threshold, null, prefix, suffix, directory, AbstractByteArrayOutputStream.DEFAULT_SIZE);__CLR4_4_16sv6svkylve0ci.R.inc(8842);try{__CLR4_4_16sv6svkylve0ci.R.inc(8841);
        __CLR4_4_16sv6svkylve0ci.R.inc(8843);if ((((prefix == null)&&(__CLR4_4_16sv6svkylve0ci.R.iget(8844)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8845)==0&false))) {{
            __CLR4_4_16sv6svkylve0ci.R.inc(8846);throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }}finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Closes underlying output stream, and mark this as closed
     *
     * @throws IOException if an error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_16sv6svkylve0ci.R.inc(8847);
        __CLR4_4_16sv6svkylve0ci.R.inc(8848);super.close();
        __CLR4_4_16sv6svkylve0ci.R.inc(8849);closed = true;
    }finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Returns the data for this output stream as an array of bytes, assuming that the data has been retained in memory.
     * If the data was written to disk, this method returns {@code null}.
     *
     * @return The data for this output stream, or {@code null} if no such data is available.
     */
    public byte[] getData() {try{__CLR4_4_16sv6svkylve0ci.R.inc(8850);
        __CLR4_4_16sv6svkylve0ci.R.inc(8851);return (((memoryOutputStream != null )&&(__CLR4_4_16sv6svkylve0ci.R.iget(8852)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8853)==0&false))? memoryOutputStream.toByteArray() : null;
    }finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Returns either the output file specified in the constructor or the temporary file created or null.
     * <p>
     * If the constructor specifying the file is used then it returns that same output file, even when threshold has not
     * been reached.
     * <p>
     * If constructor specifying a temporary file prefix/suffix is used then the temporary file created once the
     * threshold is reached is returned If the threshold was not reached then {@code null} is returned.
     *
     * @return The file for this output stream, or {@code null} if no such file exists.
     */
    public File getFile() {try{__CLR4_4_16sv6svkylve0ci.R.inc(8854);
        __CLR4_4_16sv6svkylve0ci.R.inc(8855);return outputFile;
    }finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Returns the current output stream. This may be memory based or disk based, depending on the current state with
     * respect to the threshold.
     *
     * @return The underlying output stream.
     *
     * @throws IOException if an error occurs.
     */
    @Override
    protected OutputStream getStream() throws IOException {try{__CLR4_4_16sv6svkylve0ci.R.inc(8856);
        __CLR4_4_16sv6svkylve0ci.R.inc(8857);return currentOutputStream;
    }finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Determines whether or not the data for this output stream has been retained in memory.
     *
     * @return {@code true} if the data is available in memory; {@code false} otherwise.
     */
    public boolean isInMemory() {try{__CLR4_4_16sv6svkylve0ci.R.inc(8858);
        __CLR4_4_16sv6svkylve0ci.R.inc(8859);return !isThresholdExceeded();
    }finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Switches the underlying output stream from a memory based stream to one that is backed by disk. This is the point
     * at which we realize that too much data is being written to keep in memory, so we elect to switch to disk-based
     * storage.
     *
     * @throws IOException if an error occurs.
     */
    @Override
    protected void thresholdReached() throws IOException {try{__CLR4_4_16sv6svkylve0ci.R.inc(8860);
        __CLR4_4_16sv6svkylve0ci.R.inc(8861);if ((((prefix != null)&&(__CLR4_4_16sv6svkylve0ci.R.iget(8862)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8863)==0&false))) {{
            __CLR4_4_16sv6svkylve0ci.R.inc(8864);outputFile = File.createTempFile(prefix, suffix, directory);
        }
        }__CLR4_4_16sv6svkylve0ci.R.inc(8865);FileUtils.forceMkdirParent(outputFile);
        __CLR4_4_16sv6svkylve0ci.R.inc(8866);final OutputStream fos = Files.newOutputStream(outputFile.toPath());
        __CLR4_4_16sv6svkylve0ci.R.inc(8867);try {
            __CLR4_4_16sv6svkylve0ci.R.inc(8868);memoryOutputStream.writeTo(fos);
        } catch (final IOException e) {
            __CLR4_4_16sv6svkylve0ci.R.inc(8869);fos.close();
            __CLR4_4_16sv6svkylve0ci.R.inc(8870);throw e;
        }
        __CLR4_4_16sv6svkylve0ci.R.inc(8871);currentOutputStream = fos;
        __CLR4_4_16sv6svkylve0ci.R.inc(8872);memoryOutputStream = null;
    }finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Gets the current contents of this byte stream as an {@link InputStream}.
     * If the data for this output stream has been retained in memory, the
     * returned stream is backed by buffers of {@code this} stream,
     * avoiding memory allocation and copy, thus saving space and time.<br>
     * Otherwise, the returned stream will be one that is created from the data
     * that has been committed to disk.
     *
     * @return the current contents of this output stream.
     * @throws IOException if this stream is not yet closed or an error occurs.
     * @see org.apache.commons.io.output.ByteArrayOutputStream#toInputStream()
     *
     * @since 2.9.0
     */
    public InputStream toInputStream() throws IOException {try{__CLR4_4_16sv6svkylve0ci.R.inc(8873);
        // we may only need to check if this is closed if we are working with a file
        // but we should force the habit of closing whether we are working with
        // a file or memory.
        __CLR4_4_16sv6svkylve0ci.R.inc(8874);if ((((!closed)&&(__CLR4_4_16sv6svkylve0ci.R.iget(8875)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8876)==0&false))) {{
            __CLR4_4_16sv6svkylve0ci.R.inc(8877);throw new IOException("Stream not closed");
        }

        }__CLR4_4_16sv6svkylve0ci.R.inc(8878);if ((((isInMemory())&&(__CLR4_4_16sv6svkylve0ci.R.iget(8879)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8880)==0&false))) {{
            __CLR4_4_16sv6svkylve0ci.R.inc(8881);return memoryOutputStream.toInputStream();
        }
        }__CLR4_4_16sv6svkylve0ci.R.inc(8882);return Files.newInputStream(outputFile.toPath());
    }finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}

    /**
     * Writes the data from this output stream to the specified output stream, after it has been closed.
     *
     * @param outputStream output stream to write to.
     * @throws NullPointerException if the OutputStream is {@code null}.
     * @throws IOException if this stream is not yet closed or an error occurs.
     */
    public void writeTo(final OutputStream outputStream) throws IOException {try{__CLR4_4_16sv6svkylve0ci.R.inc(8883);
        // we may only need to check if this is closed if we are working with a file
        // but we should force the habit of closing whether we are working with
        // a file or memory.
        __CLR4_4_16sv6svkylve0ci.R.inc(8884);if ((((!closed)&&(__CLR4_4_16sv6svkylve0ci.R.iget(8885)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8886)==0&false))) {{
            __CLR4_4_16sv6svkylve0ci.R.inc(8887);throw new IOException("Stream not closed");
        }

        }__CLR4_4_16sv6svkylve0ci.R.inc(8888);if ((((isInMemory())&&(__CLR4_4_16sv6svkylve0ci.R.iget(8889)!=0|true))||(__CLR4_4_16sv6svkylve0ci.R.iget(8890)==0&false))) {{
            __CLR4_4_16sv6svkylve0ci.R.inc(8891);memoryOutputStream.writeTo(outputStream);
        } }else {{
            class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_16sv6svkylve0ci.R.inc(8892);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_16sv6svkylve0ci.R.inc(8893);}};InputStream fis = Files.newInputStream(outputFile.toPath())) {
                __CLR4_4_16sv6svkylve0ci.R.inc(8894);IOUtils.copy(fis, outputStream);
            }
        }
    }}finally{__CLR4_4_16sv6svkylve0ci.R.flushNeeded();}}
}
