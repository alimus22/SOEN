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

import java.io.Serializable;
import java.io.Writer;

/**
 * {@link Writer} implementation that outputs to a {@link StringBuilder}.
 * <p>
 * <strong>NOTE:</strong> This implementation, as an alternative to
 * {@code java.io.StringWriter}, provides an <i>un-synchronized</i>
 * (i.e. for use in a single thread) implementation for better performance.
 * For safe usage with multiple {@link Thread}s then
 * {@code java.io.StringWriter} should be used.
 * </p>
 *
 * @since 2.0
 */
public class StringBuilderWriter extends Writer implements Serializable {public static class __CLR4_4_17a27a2kylve0gc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -146927496096066153L;
    private final StringBuilder builder;

    /**
     * Constructs a new {@link StringBuilder} instance with default capacity.
     */
    public StringBuilderWriter() {try{__CLR4_4_17a27a2kylve0gc.R.inc(9434);
        __CLR4_4_17a27a2kylve0gc.R.inc(9435);this.builder = new StringBuilder();
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Constructs a new {@link StringBuilder} instance with the specified capacity.
     *
     * @param capacity The initial capacity of the underlying {@link StringBuilder}
     */
    public StringBuilderWriter(final int capacity) {try{__CLR4_4_17a27a2kylve0gc.R.inc(9436);
        __CLR4_4_17a27a2kylve0gc.R.inc(9437);this.builder = new StringBuilder(capacity);
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Constructs a new instance with the specified {@link StringBuilder}.
     *
     * <p>If {@code builder} is null a new instance with default capacity will be created.</p>
     *
     * @param builder The String builder. May be null.
     */
    public StringBuilderWriter(final StringBuilder builder) {try{__CLR4_4_17a27a2kylve0gc.R.inc(9438);
        __CLR4_4_17a27a2kylve0gc.R.inc(9439);this.builder = (((builder != null )&&(__CLR4_4_17a27a2kylve0gc.R.iget(9440)!=0|true))||(__CLR4_4_17a27a2kylve0gc.R.iget(9441)==0&false))? builder : new StringBuilder();
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Appends a single character to this Writer.
     *
     * @param value The character to append
     * @return This writer instance
     */
    @Override
    public Writer append(final char value) {try{__CLR4_4_17a27a2kylve0gc.R.inc(9442);
        __CLR4_4_17a27a2kylve0gc.R.inc(9443);builder.append(value);
        __CLR4_4_17a27a2kylve0gc.R.inc(9444);return this;
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Appends a character sequence to this Writer.
     *
     * @param value The character to append
     * @return This writer instance
     */
    @Override
    public Writer append(final CharSequence value) {try{__CLR4_4_17a27a2kylve0gc.R.inc(9445);
        __CLR4_4_17a27a2kylve0gc.R.inc(9446);builder.append(value);
        __CLR4_4_17a27a2kylve0gc.R.inc(9447);return this;
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Appends a portion of a character sequence to the {@link StringBuilder}.
     *
     * @param value The character to append
     * @param start The index of the first character
     * @param end The index of the last character + 1
     * @return This writer instance
     */
    @Override
    public Writer append(final CharSequence value, final int start, final int end) {try{__CLR4_4_17a27a2kylve0gc.R.inc(9448);
        __CLR4_4_17a27a2kylve0gc.R.inc(9449);builder.append(value, start, end);
        __CLR4_4_17a27a2kylve0gc.R.inc(9450);return this;
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Closing this writer has no effect.
     */
    @Override
    public void close() {try{__CLR4_4_17a27a2kylve0gc.R.inc(9451);
        // no-op
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Flushing this writer has no effect.
     */
    @Override
    public void flush() {try{__CLR4_4_17a27a2kylve0gc.R.inc(9452);
        // no-op
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}


    /**
     * Writes a String to the {@link StringBuilder}.
     *
     * @param value The value to write
     */
    @Override
    public void write(final String value) {try{__CLR4_4_17a27a2kylve0gc.R.inc(9453);
        __CLR4_4_17a27a2kylve0gc.R.inc(9454);if ((((value != null)&&(__CLR4_4_17a27a2kylve0gc.R.iget(9455)!=0|true))||(__CLR4_4_17a27a2kylve0gc.R.iget(9456)==0&false))) {{
            __CLR4_4_17a27a2kylve0gc.R.inc(9457);builder.append(value);
        }
    }}finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Writes a portion of a character array to the {@link StringBuilder}.
     *
     * @param value The value to write
     * @param offset The index of the first character
     * @param length The number of characters to write
     */
    @Override
    public void write(final char[] value, final int offset, final int length) {try{__CLR4_4_17a27a2kylve0gc.R.inc(9458);
        __CLR4_4_17a27a2kylve0gc.R.inc(9459);if ((((value != null)&&(__CLR4_4_17a27a2kylve0gc.R.iget(9460)!=0|true))||(__CLR4_4_17a27a2kylve0gc.R.iget(9461)==0&false))) {{
            __CLR4_4_17a27a2kylve0gc.R.inc(9462);builder.append(value, offset, length);
        }
    }}finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Returns the underlying builder.
     *
     * @return The underlying builder
     */
    public StringBuilder getBuilder() {try{__CLR4_4_17a27a2kylve0gc.R.inc(9463);
        __CLR4_4_17a27a2kylve0gc.R.inc(9464);return builder;
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}

    /**
     * Returns {@link StringBuilder#toString()}.
     *
     * @return The contents of the String builder.
     */
    @Override
    public String toString() {try{__CLR4_4_17a27a2kylve0gc.R.inc(9465);
        __CLR4_4_17a27a2kylve0gc.R.inc(9466);return builder.toString();
    }finally{__CLR4_4_17a27a2kylve0gc.R.flushNeeded();}}
}
