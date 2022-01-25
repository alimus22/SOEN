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
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/**
 * Reader proxy that transparently writes a copy of all characters read from the proxied reader to a given Reader. Using
 * {@link #skip(long)} or {@link #mark(int)}/{@link #reset()} on the reader will result on some characters from the
 * reader being skipped or duplicated in the writer.
 * <p>
 * The proxied reader is closed when the {@link #close()} method is called on this proxy. You may configure whether the
 * reader closes the writer.
 * </p>
 *
 * @since 2.7
 */
public class TeeReader extends ProxyReader {public static class __CLR4_4_15q35q3kylve01s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,7466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The writer that will receive a copy of all characters read from the proxied reader.
     */
    private final Writer branch;

    /**
     * Flag for closing the associated writer when this reader is closed.
     */
    private final boolean closeBranch;

    /**
     * Creates a TeeReader that proxies the given {@link Reader} and copies all read characters to the given
     * {@link Writer}. The given writer will not be closed when this reader gets closed.
     *
     * @param input  reader to be proxied
     * @param branch writer that will receive a copy of all characters read
     */
    public TeeReader(final Reader input, final Writer branch) {
        this(input, branch, false);__CLR4_4_15q35q3kylve01s.R.inc(7420);try{__CLR4_4_15q35q3kylve01s.R.inc(7419);
    }finally{__CLR4_4_15q35q3kylve01s.R.flushNeeded();}}

    /**
     * Creates a TeeReader that proxies the given {@link Reader} and copies all read characters to the given
     * {@link Writer}. The given writer will be closed when this reader gets closed if the closeBranch parameter is
     * {@code true}.
     *
     * @param input       reader to be proxied
     * @param branch      writer that will receive a copy of all characters read
     * @param closeBranch flag for closing also the writer when this reader is closed
     */
    public TeeReader(final Reader input, final Writer branch, final boolean closeBranch) {
        super(input);__CLR4_4_15q35q3kylve01s.R.inc(7422);try{__CLR4_4_15q35q3kylve01s.R.inc(7421);
        __CLR4_4_15q35q3kylve01s.R.inc(7423);this.branch = branch;
        __CLR4_4_15q35q3kylve01s.R.inc(7424);this.closeBranch = closeBranch;
    }finally{__CLR4_4_15q35q3kylve01s.R.flushNeeded();}}

    /**
     * Closes the proxied reader and, if so configured, the associated writer. An exception thrown from the reader will
     * not prevent closing of the writer.
     *
     * @throws IOException if either the reader or writer could not be closed
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_15q35q3kylve01s.R.inc(7425);
        __CLR4_4_15q35q3kylve01s.R.inc(7426);try {
            __CLR4_4_15q35q3kylve01s.R.inc(7427);super.close();
        } finally {
            __CLR4_4_15q35q3kylve01s.R.inc(7428);if ((((closeBranch)&&(__CLR4_4_15q35q3kylve01s.R.iget(7429)!=0|true))||(__CLR4_4_15q35q3kylve01s.R.iget(7430)==0&false))) {{
                __CLR4_4_15q35q3kylve01s.R.inc(7431);branch.close();
            }
        }}
    }finally{__CLR4_4_15q35q3kylve01s.R.flushNeeded();}}

    /**
     * Reads a single character from the proxied reader and writes it to the associated writer.
     *
     * @return next character from the reader, or -1 if the reader has ended
     * @throws IOException if the reader could not be read (or written)
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_15q35q3kylve01s.R.inc(7432);
        __CLR4_4_15q35q3kylve01s.R.inc(7433);final int ch = super.read();
        __CLR4_4_15q35q3kylve01s.R.inc(7434);if ((((ch != EOF)&&(__CLR4_4_15q35q3kylve01s.R.iget(7435)!=0|true))||(__CLR4_4_15q35q3kylve01s.R.iget(7436)==0&false))) {{
            __CLR4_4_15q35q3kylve01s.R.inc(7437);branch.write(ch);
        }
        }__CLR4_4_15q35q3kylve01s.R.inc(7438);return ch;
    }finally{__CLR4_4_15q35q3kylve01s.R.flushNeeded();}}

    /**
     * Reads characters from the proxied reader and writes the read characters to the associated writer.
     *
     * @param chr character buffer
     * @return number of characters read, or -1 if the reader has ended
     * @throws IOException if the reader could not be read (or written)
     */
    @Override
    public int read(final char[] chr) throws IOException {try{__CLR4_4_15q35q3kylve01s.R.inc(7439);
        __CLR4_4_15q35q3kylve01s.R.inc(7440);final int n = super.read(chr);
        __CLR4_4_15q35q3kylve01s.R.inc(7441);if ((((n != EOF)&&(__CLR4_4_15q35q3kylve01s.R.iget(7442)!=0|true))||(__CLR4_4_15q35q3kylve01s.R.iget(7443)==0&false))) {{
            __CLR4_4_15q35q3kylve01s.R.inc(7444);branch.write(chr, 0, n);
        }
        }__CLR4_4_15q35q3kylve01s.R.inc(7445);return n;
    }finally{__CLR4_4_15q35q3kylve01s.R.flushNeeded();}}

    /**
     * Reads characters from the proxied reader and writes the read characters to the associated writer.
     *
     * @param chr character buffer
     * @param st  start offset within the buffer
     * @param end maximum number of characters to read
     * @return number of characters read, or -1 if the reader has ended
     * @throws IOException if the reader could not be read (or written)
     */
    @Override
    public int read(final char[] chr, final int st, final int end) throws IOException {try{__CLR4_4_15q35q3kylve01s.R.inc(7446);
        __CLR4_4_15q35q3kylve01s.R.inc(7447);final int n = super.read(chr, st, end);
        __CLR4_4_15q35q3kylve01s.R.inc(7448);if ((((n != EOF)&&(__CLR4_4_15q35q3kylve01s.R.iget(7449)!=0|true))||(__CLR4_4_15q35q3kylve01s.R.iget(7450)==0&false))) {{
            __CLR4_4_15q35q3kylve01s.R.inc(7451);branch.write(chr, st, n);
        }
        }__CLR4_4_15q35q3kylve01s.R.inc(7452);return n;
    }finally{__CLR4_4_15q35q3kylve01s.R.flushNeeded();}}

    /**
     * Reads characters from the proxied reader and writes the read characters to the associated writer.
     *
     * @param target character buffer
     * @return number of characters read, or -1 if the reader has ended
     * @throws IOException if the reader could not be read (or written)
     */
    @Override
    public int read(final CharBuffer target) throws IOException {try{__CLR4_4_15q35q3kylve01s.R.inc(7453);
        __CLR4_4_15q35q3kylve01s.R.inc(7454);final int originalPosition = target.position();
        __CLR4_4_15q35q3kylve01s.R.inc(7455);final int n = super.read(target);
        __CLR4_4_15q35q3kylve01s.R.inc(7456);if ((((n != EOF)&&(__CLR4_4_15q35q3kylve01s.R.iget(7457)!=0|true))||(__CLR4_4_15q35q3kylve01s.R.iget(7458)==0&false))) {{
            // Appending can only be done after resetting the CharBuffer to the
            // right position and limit.
            __CLR4_4_15q35q3kylve01s.R.inc(7459);final int newPosition = target.position();
            __CLR4_4_15q35q3kylve01s.R.inc(7460);final int newLimit = target.limit();
            __CLR4_4_15q35q3kylve01s.R.inc(7461);try {
                __CLR4_4_15q35q3kylve01s.R.inc(7462);target.position(originalPosition).limit(newPosition);
                __CLR4_4_15q35q3kylve01s.R.inc(7463);branch.append(target);
            } finally {
                // Reset the CharBuffer as if the appending never happened.
                __CLR4_4_15q35q3kylve01s.R.inc(7464);target.position(newPosition).limit(newLimit);
            }
        }
        }__CLR4_4_15q35q3kylve01s.R.inc(7465);return n;
    }finally{__CLR4_4_15q35q3kylve01s.R.flushNeeded();}}

}
