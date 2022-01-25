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

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An Iterator over the lines in a {@code Reader}.
 * <p>
 * {@code LineIterator} holds a reference to an open {@code Reader}.
 * When you have finished with the iterator you should close the reader
 * to free internal resources. This can be done by closing the reader directly,
 * or by calling the {@link #close()} or {@link #closeQuietly(LineIterator)}
 * method on the iterator.
 * <p>
 * The recommended usage pattern is:
 * <pre>
 * LineIterator it = FileUtils.lineIterator(file, "UTF-8");
 * try {
 *   while (it.hasNext()) {
 *     String line = it.nextLine();
 *     // do something with line
 *   }
 * } finally {
 *   it.close();
 * }
 * </pre>
 *
 * @since 1.2
 */
public class LineIterator implements Iterator<String>, Closeable {public static class __CLR4_4_12l62l6kylvdz1f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3408,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // N.B. This class deliberately does not implement Iterable, see https://issues.apache.org/jira/browse/IO-181

    /** The reader that is being read. */
    private final BufferedReader bufferedReader;
    /** The current line. */
    private String cachedLine;
    /** A flag indicating if the iterator has been fully read. */
    private boolean finished;

    /**
     * Constructs an iterator of the lines for a {@code Reader}.
     *
     * @param reader the {@code Reader} to read from, not null
     * @throws IllegalArgumentException if the reader is null
     */
    public LineIterator(final Reader reader) throws IllegalArgumentException {try{__CLR4_4_12l62l6kylvdz1f.R.inc(3354);
        __CLR4_4_12l62l6kylvdz1f.R.inc(3355);if ((((reader == null)&&(__CLR4_4_12l62l6kylvdz1f.R.iget(3356)!=0|true))||(__CLR4_4_12l62l6kylvdz1f.R.iget(3357)==0&false))) {{
            __CLR4_4_12l62l6kylvdz1f.R.inc(3358);throw new IllegalArgumentException("Reader must not be null");
        }
        }__CLR4_4_12l62l6kylvdz1f.R.inc(3359);if ((((reader instanceof BufferedReader)&&(__CLR4_4_12l62l6kylvdz1f.R.iget(3360)!=0|true))||(__CLR4_4_12l62l6kylvdz1f.R.iget(3361)==0&false))) {{
            __CLR4_4_12l62l6kylvdz1f.R.inc(3362);bufferedReader = (BufferedReader) reader;
        } }else {{
            __CLR4_4_12l62l6kylvdz1f.R.inc(3363);bufferedReader = new BufferedReader(reader);
        }
    }}finally{__CLR4_4_12l62l6kylvdz1f.R.flushNeeded();}}

    /**
     * Indicates whether the {@code Reader} has more lines.
     * If there is an {@code IOException} then {@link #close()} will
     * be called on this instance.
     *
     * @return {@code true} if the Reader has more lines
     * @throws IllegalStateException if an IO exception occurs
     */
    @Override
    public boolean hasNext() {try{__CLR4_4_12l62l6kylvdz1f.R.inc(3364);
        __CLR4_4_12l62l6kylvdz1f.R.inc(3365);if ((((cachedLine != null)&&(__CLR4_4_12l62l6kylvdz1f.R.iget(3366)!=0|true))||(__CLR4_4_12l62l6kylvdz1f.R.iget(3367)==0&false))) {{
            __CLR4_4_12l62l6kylvdz1f.R.inc(3368);return true;
        }
        }__CLR4_4_12l62l6kylvdz1f.R.inc(3369);if ((((finished)&&(__CLR4_4_12l62l6kylvdz1f.R.iget(3370)!=0|true))||(__CLR4_4_12l62l6kylvdz1f.R.iget(3371)==0&false))) {{
            __CLR4_4_12l62l6kylvdz1f.R.inc(3372);return false;
        }
        }__CLR4_4_12l62l6kylvdz1f.R.inc(3373);try {
            __CLR4_4_12l62l6kylvdz1f.R.inc(3374);while (true) {{
                __CLR4_4_12l62l6kylvdz1f.R.inc(3375);final String line = bufferedReader.readLine();
                __CLR4_4_12l62l6kylvdz1f.R.inc(3376);if ((((line == null)&&(__CLR4_4_12l62l6kylvdz1f.R.iget(3377)!=0|true))||(__CLR4_4_12l62l6kylvdz1f.R.iget(3378)==0&false))) {{
                    __CLR4_4_12l62l6kylvdz1f.R.inc(3379);finished = true;
                    __CLR4_4_12l62l6kylvdz1f.R.inc(3380);return false;
                }
                }__CLR4_4_12l62l6kylvdz1f.R.inc(3381);if ((((isValidLine(line))&&(__CLR4_4_12l62l6kylvdz1f.R.iget(3382)!=0|true))||(__CLR4_4_12l62l6kylvdz1f.R.iget(3383)==0&false))) {{
                    __CLR4_4_12l62l6kylvdz1f.R.inc(3384);cachedLine = line;
                    __CLR4_4_12l62l6kylvdz1f.R.inc(3385);return true;
                }
            }}
        }} catch(final IOException ioe) {
            __CLR4_4_12l62l6kylvdz1f.R.inc(3386);IOUtils.closeQuietly(this, ioe::addSuppressed);
            __CLR4_4_12l62l6kylvdz1f.R.inc(3387);throw new IllegalStateException(ioe);
        }
    }finally{__CLR4_4_12l62l6kylvdz1f.R.flushNeeded();}}

    /**
     * Overridable method to validate each line that is returned.
     * This implementation always returns true.
     * @param line  the line that is to be validated
     * @return true if valid, false to remove from the iterator
     */
    protected boolean isValidLine(final String line) {try{__CLR4_4_12l62l6kylvdz1f.R.inc(3388);
        __CLR4_4_12l62l6kylvdz1f.R.inc(3389);return true;
    }finally{__CLR4_4_12l62l6kylvdz1f.R.flushNeeded();}}

    /**
     * Returns the next line in the wrapped {@code Reader}.
     *
     * @return the next line from the input
     * @throws NoSuchElementException if there is no line to return
     */
    @Override
    public String next() {try{__CLR4_4_12l62l6kylvdz1f.R.inc(3390);
        __CLR4_4_12l62l6kylvdz1f.R.inc(3391);return nextLine();
    }finally{__CLR4_4_12l62l6kylvdz1f.R.flushNeeded();}}

    /**
     * Returns the next line in the wrapped {@code Reader}.
     *
     * @return the next line from the input
     * @throws NoSuchElementException if there is no line to return
     */
    public String nextLine() {try{__CLR4_4_12l62l6kylvdz1f.R.inc(3392);
        __CLR4_4_12l62l6kylvdz1f.R.inc(3393);if ((((!hasNext())&&(__CLR4_4_12l62l6kylvdz1f.R.iget(3394)!=0|true))||(__CLR4_4_12l62l6kylvdz1f.R.iget(3395)==0&false))) {{
            __CLR4_4_12l62l6kylvdz1f.R.inc(3396);throw new NoSuchElementException("No more lines");
        }
        }__CLR4_4_12l62l6kylvdz1f.R.inc(3397);final String currentLine = cachedLine;
        __CLR4_4_12l62l6kylvdz1f.R.inc(3398);cachedLine = null;
        __CLR4_4_12l62l6kylvdz1f.R.inc(3399);return currentLine;
    }finally{__CLR4_4_12l62l6kylvdz1f.R.flushNeeded();}}

    /**
     * Closes the underlying {@code Reader}.
     * This method is useful if you only want to process the first few
     * lines of a larger file. If you do not close the iterator
     * then the {@code Reader} remains open.
     * This method can safely be called multiple times.
     *
     * @throws IOException if closing the underlying {@code Reader} fails.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_12l62l6kylvdz1f.R.inc(3400);
        __CLR4_4_12l62l6kylvdz1f.R.inc(3401);finished = true;
        __CLR4_4_12l62l6kylvdz1f.R.inc(3402);cachedLine = null;
        __CLR4_4_12l62l6kylvdz1f.R.inc(3403);IOUtils.close(bufferedReader);
    }finally{__CLR4_4_12l62l6kylvdz1f.R.flushNeeded();}}

    /**
     * Unsupported.
     *
     * @throws UnsupportedOperationException always
     */
    @Override
    public void remove() {try{__CLR4_4_12l62l6kylvdz1f.R.inc(3404);
        __CLR4_4_12l62l6kylvdz1f.R.inc(3405);throw new UnsupportedOperationException("remove not supported");
    }finally{__CLR4_4_12l62l6kylvdz1f.R.flushNeeded();}}

    /**
     * Closes a {@code LineIterator} quietly.
     *
     * @param iterator The iterator to close, or {@code null}.
     * @deprecated As of 2.6 deprecated without replacement. Please use the try-with-resources statement or handle
     * suppressed exceptions manually.
     * @see Throwable#addSuppressed(java.lang.Throwable)
     */
    @Deprecated
    public static void closeQuietly(final LineIterator iterator) {try{__CLR4_4_12l62l6kylvdz1f.R.inc(3406);
        __CLR4_4_12l62l6kylvdz1f.R.inc(3407);IOUtils.closeQuietly(iterator);
    }finally{__CLR4_4_12l62l6kylvdz1f.R.flushNeeded();}}

}
