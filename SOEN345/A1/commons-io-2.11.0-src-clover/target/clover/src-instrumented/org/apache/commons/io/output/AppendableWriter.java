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
import java.io.Writer;
import java.util.Objects;

/**
 * Writer implementation that writes the data to an {@link Appendable}
 * Object.
 * <p>
 * For example, can be used with a {@link java.lang.StringBuilder}
 * or {@link java.lang.StringBuffer}.
 * </p>
 *
 * @since 2.7
 * @see java.lang.Appendable
 *
 * @param <T> The type of the {@link Appendable} wrapped by this AppendableWriter.
 */
public class AppendableWriter <T extends Appendable> extends Writer {public static class __CLR4_4_16o16o1kylve0ah{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,8671,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final T appendable;

    /**
     * Constructs a new instance with the specified appendable.
     *
     * @param appendable the appendable to write to
     */
    public AppendableWriter(final T appendable) {try{__CLR4_4_16o16o1kylve0ah.R.inc(8641);
        __CLR4_4_16o16o1kylve0ah.R.inc(8642);this.appendable = appendable;
    }finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

    /**
     * Appends the specified character to the underlying appendable.
     *
     * @param c the character to append
     * @return this writer
     * @throws IOException upon error
     */
    @Override
    public Writer append(final char c) throws IOException {try{__CLR4_4_16o16o1kylve0ah.R.inc(8643);
        __CLR4_4_16o16o1kylve0ah.R.inc(8644);appendable.append(c);
        __CLR4_4_16o16o1kylve0ah.R.inc(8645);return this;
    }finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

    /**
     * Appends the specified character sequence to the underlying appendable.
     *
     * @param csq the character sequence to append
     * @return this writer
     * @throws IOException upon error
     */
    @Override
    public Writer append(final CharSequence csq) throws IOException {try{__CLR4_4_16o16o1kylve0ah.R.inc(8646);
        __CLR4_4_16o16o1kylve0ah.R.inc(8647);appendable.append(csq);
        __CLR4_4_16o16o1kylve0ah.R.inc(8648);return this;
    }finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

    /**
     * Appends a subsequence of the specified character sequence to the underlying appendable.
     *
     * @param csq the character sequence from which a subsequence will be appended
     * @param start the index of the first character in the subsequence
     * @param end the index of the character following the last character in the subsequence
     * @return this writer
     * @throws IOException upon error
     */
    @Override
    public Writer append(final CharSequence csq, final int start, final int end) throws IOException {try{__CLR4_4_16o16o1kylve0ah.R.inc(8649);
        __CLR4_4_16o16o1kylve0ah.R.inc(8650);appendable.append(csq, start, end);
        __CLR4_4_16o16o1kylve0ah.R.inc(8651);return this;
    }finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

    /**
     * Closes the stream. This implementation does nothing.
     *
     * @throws IOException upon error
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_16o16o1kylve0ah.R.inc(8652);
        // noop
    }finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

    /**
     * Flushes the stream. This implementation does nothing.
     *
     * @throws IOException upon error
     */
    @Override
    public void flush() throws IOException {try{__CLR4_4_16o16o1kylve0ah.R.inc(8653);
        // noop
    }finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

    /**
     * Return the target appendable.
     *
     * @return the target appendable
     */
    public T getAppendable() {try{__CLR4_4_16o16o1kylve0ah.R.inc(8654);
        __CLR4_4_16o16o1kylve0ah.R.inc(8655);return appendable;
    }finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

    /**
     * Writes a portion of an array of characters to the underlying appendable.
     *
     * @param cbuf an array with the characters to write
     * @param off offset from which to start writing characters
     * @param len number of characters to write
     * @throws IOException upon error
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_16o16o1kylve0ah.R.inc(8656);
        __CLR4_4_16o16o1kylve0ah.R.inc(8657);Objects.requireNonNull(cbuf, "Character array is missing");
        __CLR4_4_16o16o1kylve0ah.R.inc(8658);if ((((len < 0 || (off + len) > cbuf.length)&&(__CLR4_4_16o16o1kylve0ah.R.iget(8659)!=0|true))||(__CLR4_4_16o16o1kylve0ah.R.iget(8660)==0&false))) {{
            __CLR4_4_16o16o1kylve0ah.R.inc(8661);throw new IndexOutOfBoundsException("Array Size=" + cbuf.length +
                    ", offset=" + off + ", length=" + len);
        }
        }__CLR4_4_16o16o1kylve0ah.R.inc(8662);for (int i = 0; (((i < len)&&(__CLR4_4_16o16o1kylve0ah.R.iget(8663)!=0|true))||(__CLR4_4_16o16o1kylve0ah.R.iget(8664)==0&false)); i++) {{
            __CLR4_4_16o16o1kylve0ah.R.inc(8665);appendable.append(cbuf[off + i]);
        }
    }}finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

    /**
     * Writes a character to the underlying appendable.
     *
     * @param c the character to write
     * @throws IOException upon error
     */
    @Override
    public void write(final int c) throws IOException {try{__CLR4_4_16o16o1kylve0ah.R.inc(8666);
        __CLR4_4_16o16o1kylve0ah.R.inc(8667);appendable.append((char)c);
    }finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

    /**
     * Writes a portion of a String to the underlying appendable.
     *
     * @param str a string
     * @param off offset from which to start writing characters
     * @param len number of characters to write
     * @throws IOException upon error
     */
    @Override
    public void write(final String str, final int off, final int len) throws IOException {try{__CLR4_4_16o16o1kylve0ah.R.inc(8668);
        // appendable.append will add "null" for a null String; add an explicit null check
        __CLR4_4_16o16o1kylve0ah.R.inc(8669);Objects.requireNonNull(str, "String is missing");
        __CLR4_4_16o16o1kylve0ah.R.inc(8670);appendable.append(str, off, off + len);
    }finally{__CLR4_4_16o16o1kylve0ah.R.flushNeeded();}}

}
