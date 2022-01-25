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

import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;

/**
 * An output stream which triggers an event when a specified number of bytes of data have been written to it. The event
 * can be used, for example, to throw an exception if a maximum has been reached, or to switch the underlying stream
 * type when the threshold is exceeded.
 * <p>
 * This class overrides all {@code OutputStream} methods. However, these overrides ultimately call the corresponding
 * methods in the underlying output stream implementation.
 * </p>
 * <p>
 * NOTE: This implementation may trigger the event <em>before</em> the threshold is actually reached, since it triggers
 * when a pending write operation would cause the threshold to be exceeded.
 * </p>
 */
public class ThresholdingOutputStream extends OutputStream {public static class __CLR4_4_17c27c2kylve0h3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9555,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Noop output stream getter function.
     */
    private static final IOFunction<ThresholdingOutputStream, OutputStream> NOOP_OS_GETTER = os -> NullOutputStream.NULL_OUTPUT_STREAM;

    /**
     * The threshold at which the event will be triggered.
     */
    private final int threshold;

    /**
     * Accepts reaching the threshold.
     */
    private final IOConsumer<ThresholdingOutputStream> thresholdConsumer;

    /**
     * Gets the output stream.
     */
    private final IOFunction<ThresholdingOutputStream, OutputStream> outputStreamGetter;

    /**
     * The number of bytes written to the output stream.
     */
    private long written;

    /**
     * Whether or not the configured threshold has been exceeded.
     */
    private boolean thresholdExceeded;

    /**
     * Constructs an instance of this class which will trigger an event at the specified threshold.
     *
     * @param threshold The number of bytes at which to trigger an event.
     */
    public ThresholdingOutputStream(final int threshold) {
        this(threshold, IOConsumer.noop(), NOOP_OS_GETTER);__CLR4_4_17c27c2kylve0h3.R.inc(9507);try{__CLR4_4_17c27c2kylve0h3.R.inc(9506);
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Constructs an instance of this class which will trigger an event at the specified threshold.
     *
     * @param threshold The number of bytes at which to trigger an event.
     * @param thresholdConsumer Accepts reaching the threshold.
     * @param outputStreamGetter Gets the output stream.
     * @since 2.9.0
     */
    public ThresholdingOutputStream(final int threshold, final IOConsumer<ThresholdingOutputStream> thresholdConsumer,
        final IOFunction<ThresholdingOutputStream, OutputStream> outputStreamGetter) {try{__CLR4_4_17c27c2kylve0h3.R.inc(9508);
        __CLR4_4_17c27c2kylve0h3.R.inc(9509);this.threshold = threshold;
        __CLR4_4_17c27c2kylve0h3.R.inc(9510);this.thresholdConsumer = (((thresholdConsumer == null )&&(__CLR4_4_17c27c2kylve0h3.R.iget(9511)!=0|true))||(__CLR4_4_17c27c2kylve0h3.R.iget(9512)==0&false))? IOConsumer.noop() : thresholdConsumer;
        __CLR4_4_17c27c2kylve0h3.R.inc(9513);this.outputStreamGetter = (((outputStreamGetter == null )&&(__CLR4_4_17c27c2kylve0h3.R.iget(9514)!=0|true))||(__CLR4_4_17c27c2kylve0h3.R.iget(9515)==0&false))? NOOP_OS_GETTER : outputStreamGetter;
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Checks to see if writing the specified number of bytes would cause the configured threshold to be exceeded. If
     * so, triggers an event to allow a concrete implementation to take action on this.
     *
     * @param count The number of bytes about to be written to the underlying output stream.
     *
     * @throws IOException if an error occurs.
     */
    protected void checkThreshold(final int count) throws IOException {try{__CLR4_4_17c27c2kylve0h3.R.inc(9516);
        __CLR4_4_17c27c2kylve0h3.R.inc(9517);if ((((!thresholdExceeded && written + count > threshold)&&(__CLR4_4_17c27c2kylve0h3.R.iget(9518)!=0|true))||(__CLR4_4_17c27c2kylve0h3.R.iget(9519)==0&false))) {{
            __CLR4_4_17c27c2kylve0h3.R.inc(9520);thresholdExceeded = true;
            __CLR4_4_17c27c2kylve0h3.R.inc(9521);thresholdReached();
        }
    }}finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Closes this output stream and releases any system resources associated with this stream.
     *
     * @throws IOException if an error occurs.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_17c27c2kylve0h3.R.inc(9522);
        __CLR4_4_17c27c2kylve0h3.R.inc(9523);try {
            __CLR4_4_17c27c2kylve0h3.R.inc(9524);flush();
        } catch (final IOException ignored) {
            // ignore
        }
        __CLR4_4_17c27c2kylve0h3.R.inc(9525);getStream().close();
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Flushes this output stream and forces any buffered output bytes to be written out.
     *
     * @throws IOException if an error occurs.
     */
    @SuppressWarnings("resource") // the underlying stream is managed by a subclass.
    @Override
    public void flush() throws IOException {try{__CLR4_4_17c27c2kylve0h3.R.inc(9526);
        __CLR4_4_17c27c2kylve0h3.R.inc(9527);getStream().flush();
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Returns the number of bytes that have been written to this output stream.
     *
     * @return The number of bytes written.
     */
    public long getByteCount() {try{__CLR4_4_17c27c2kylve0h3.R.inc(9528);
        __CLR4_4_17c27c2kylve0h3.R.inc(9529);return written;
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Returns the underlying output stream, to which the corresponding {@code OutputStream} methods in this class will
     * ultimately delegate.
     *
     * @return The underlying output stream.
     *
     * @throws IOException if an error occurs.
     */
    protected OutputStream getStream() throws IOException {try{__CLR4_4_17c27c2kylve0h3.R.inc(9530);
        __CLR4_4_17c27c2kylve0h3.R.inc(9531);return outputStreamGetter.apply(this);
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Returns the threshold, in bytes, at which an event will be triggered.
     *
     * @return The threshold point, in bytes.
     */
    public int getThreshold() {try{__CLR4_4_17c27c2kylve0h3.R.inc(9532);
        __CLR4_4_17c27c2kylve0h3.R.inc(9533);return threshold;
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Determines whether or not the configured threshold has been exceeded for this output stream.
     *
     * @return {@code true} if the threshold has been reached; {@code false} otherwise.
     */
    public boolean isThresholdExceeded() {try{__CLR4_4_17c27c2kylve0h3.R.inc(9534);
        __CLR4_4_17c27c2kylve0h3.R.inc(9535);return written > threshold;
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Resets the byteCount to zero. You can call this from {@link #thresholdReached()} if you want the event to be
     * triggered again.
     */
    protected void resetByteCount() {try{__CLR4_4_17c27c2kylve0h3.R.inc(9536);
        __CLR4_4_17c27c2kylve0h3.R.inc(9537);this.thresholdExceeded = false;
        __CLR4_4_17c27c2kylve0h3.R.inc(9538);this.written = 0;
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Sets the byteCount to count. Useful for re-opening an output stream that has previously been written to.
     *
     * @param count The number of bytes that have already been written to the output stream
     *
     * @since 2.5
     */
    protected void setByteCount(final long count) {try{__CLR4_4_17c27c2kylve0h3.R.inc(9539);
        __CLR4_4_17c27c2kylve0h3.R.inc(9540);this.written = count;
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Indicates that the configured threshold has been reached, and that a subclass should take whatever action
     * necessary on this event. This may include changing the underlying output stream.
     *
     * @throws IOException if an error occurs.
     */
    protected void thresholdReached() throws IOException {try{__CLR4_4_17c27c2kylve0h3.R.inc(9541);
        __CLR4_4_17c27c2kylve0h3.R.inc(9542);thresholdConsumer.accept(this);
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Writes {@code b.length} bytes from the specified byte array to this output stream.
     *
     * @param b The array of bytes to be written.
     *
     * @throws IOException if an error occurs.
     */
    @SuppressWarnings("resource") // the underlying stream is managed by a subclass.
    @Override
    public void write(final byte[] b) throws IOException {try{__CLR4_4_17c27c2kylve0h3.R.inc(9543);
        __CLR4_4_17c27c2kylve0h3.R.inc(9544);checkThreshold(b.length);
        __CLR4_4_17c27c2kylve0h3.R.inc(9545);getStream().write(b);
        __CLR4_4_17c27c2kylve0h3.R.inc(9546);written += b.length;
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Writes {@code len} bytes from the specified byte array starting at offset {@code off} to this output stream.
     *
     * @param b The byte array from which the data will be written.
     * @param off The start offset in the byte array.
     * @param len The number of bytes to write.
     *
     * @throws IOException if an error occurs.
     */
    @SuppressWarnings("resource") // the underlying stream is managed by a subclass.
    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {try{__CLR4_4_17c27c2kylve0h3.R.inc(9547);
        __CLR4_4_17c27c2kylve0h3.R.inc(9548);checkThreshold(len);
        __CLR4_4_17c27c2kylve0h3.R.inc(9549);getStream().write(b, off, len);
        __CLR4_4_17c27c2kylve0h3.R.inc(9550);written += len;
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}

    /**
     * Writes the specified byte to this output stream.
     *
     * @param b The byte to be written.
     *
     * @throws IOException if an error occurs.
     */
    @SuppressWarnings("resource") // the underlying stream is managed by a subclass.
    @Override
    public void write(final int b) throws IOException {try{__CLR4_4_17c27c2kylve0h3.R.inc(9551);
        __CLR4_4_17c27c2kylve0h3.R.inc(9552);checkThreshold(1);
        __CLR4_4_17c27c2kylve0h3.R.inc(9553);getStream().write(b);
        __CLR4_4_17c27c2kylve0h3.R.inc(9554);written++;
    }finally{__CLR4_4_17c27c2kylve0h3.R.flushNeeded();}}
}
