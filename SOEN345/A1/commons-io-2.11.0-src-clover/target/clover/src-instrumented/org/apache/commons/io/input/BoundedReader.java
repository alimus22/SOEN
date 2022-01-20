/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.io.input;

import static org.apache.commons.io.IOUtils.EOF;

import java.io.IOException;
import java.io.Reader;

/**
 * A reader that imposes a limit to the number of characters that can be read from an underlying reader, returning EOF
 * when this limit is reached, regardless of state of underlying reader.
 *
 * <p>
 * One use case is to avoid overrunning the readAheadLimit supplied to {@link java.io.Reader#mark(int)}, since reading
 * too many characters removes the ability to do a successful reset.
 * </p>
 *
 * @since 2.5
 */
public class BoundedReader extends Reader {public static class __CLR4_4_14ar4arkylvdzq3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5608,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int INVALID = -1;

    private final Reader target;

    private int charsRead;

    private int markedAt = INVALID;

    private int readAheadLimit; // Internally, this value will never exceed the allowed size

    private final int maxCharsFromTargetReader;

    /**
     * Constructs a bounded reader
     *
     * @param target                   The target stream that will be used
     * @param maxCharsFromTargetReader The maximum number of characters that can be read from target
     */
    public BoundedReader(final Reader target, final int maxCharsFromTargetReader) {try{__CLR4_4_14ar4arkylvdzq3.R.inc(5571);
        __CLR4_4_14ar4arkylvdzq3.R.inc(5572);this.target = target;
        __CLR4_4_14ar4arkylvdzq3.R.inc(5573);this.maxCharsFromTargetReader = maxCharsFromTargetReader;
    }finally{__CLR4_4_14ar4arkylvdzq3.R.flushNeeded();}}

    /**
     * Closes the target
     *
     * @throws IOException If an I/O error occurs while calling the underlying reader's close method
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_14ar4arkylvdzq3.R.inc(5574);
        __CLR4_4_14ar4arkylvdzq3.R.inc(5575);target.close();
    }finally{__CLR4_4_14ar4arkylvdzq3.R.flushNeeded();}}

    /**
     * Resets the target to the latest mark,
     *
     * @throws IOException If an I/O error occurs while calling the underlying reader's reset method
     * @see java.io.Reader#reset()
     */
    @Override
    public void reset() throws IOException {try{__CLR4_4_14ar4arkylvdzq3.R.inc(5576);
        __CLR4_4_14ar4arkylvdzq3.R.inc(5577);charsRead = markedAt;
        __CLR4_4_14ar4arkylvdzq3.R.inc(5578);target.reset();
    }finally{__CLR4_4_14ar4arkylvdzq3.R.flushNeeded();}}

    /**
     * marks the target stream
     *
     * @param readAheadLimit The number of characters that can be read while still retaining the ability to do #reset().
     *                       Note that this parameter is not validated with respect to maxCharsFromTargetReader. There
     *                       is no way to pass past maxCharsFromTargetReader, even if this value is greater.
     *
     * @throws IOException If an I/O error occurs while calling the underlying reader's mark method
     * @see java.io.Reader#mark(int)
     */
    @Override
    public void mark(final int readAheadLimit) throws IOException {try{__CLR4_4_14ar4arkylvdzq3.R.inc(5579);
        __CLR4_4_14ar4arkylvdzq3.R.inc(5580);this.readAheadLimit = readAheadLimit - charsRead;

        __CLR4_4_14ar4arkylvdzq3.R.inc(5581);markedAt = charsRead;

        __CLR4_4_14ar4arkylvdzq3.R.inc(5582);target.mark(readAheadLimit);
    }finally{__CLR4_4_14ar4arkylvdzq3.R.flushNeeded();}}

    /**
     * Reads a single character
     *
     * @return -1 on EOF or the character read
     * @throws IOException If an I/O error occurs while calling the underlying reader's read method
     * @see java.io.Reader#read()
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_14ar4arkylvdzq3.R.inc(5583);

        __CLR4_4_14ar4arkylvdzq3.R.inc(5584);if ((((charsRead >= maxCharsFromTargetReader)&&(__CLR4_4_14ar4arkylvdzq3.R.iget(5585)!=0|true))||(__CLR4_4_14ar4arkylvdzq3.R.iget(5586)==0&false))) {{
            __CLR4_4_14ar4arkylvdzq3.R.inc(5587);return EOF;
        }

        }__CLR4_4_14ar4arkylvdzq3.R.inc(5588);if ((((markedAt >= 0 && (charsRead - markedAt) >= readAheadLimit)&&(__CLR4_4_14ar4arkylvdzq3.R.iget(5589)!=0|true))||(__CLR4_4_14ar4arkylvdzq3.R.iget(5590)==0&false))) {{
            __CLR4_4_14ar4arkylvdzq3.R.inc(5591);return EOF;
        }
        }__CLR4_4_14ar4arkylvdzq3.R.inc(5592);charsRead++;
        __CLR4_4_14ar4arkylvdzq3.R.inc(5593);return target.read();
    }finally{__CLR4_4_14ar4arkylvdzq3.R.flushNeeded();}}

    /**
     * Reads into an array
     *
     * @param cbuf The buffer to fill
     * @param off  The offset
     * @param len  The number of chars to read
     * @return the number of chars read
     * @throws IOException If an I/O error occurs while calling the underlying reader's read method
     * @see java.io.Reader#read(char[], int, int)
     */
    @Override
    public int read(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_14ar4arkylvdzq3.R.inc(5594);
        __CLR4_4_14ar4arkylvdzq3.R.inc(5595);int c;
        __CLR4_4_14ar4arkylvdzq3.R.inc(5596);for (int i = 0; (((i < len)&&(__CLR4_4_14ar4arkylvdzq3.R.iget(5597)!=0|true))||(__CLR4_4_14ar4arkylvdzq3.R.iget(5598)==0&false)); i++) {{
            __CLR4_4_14ar4arkylvdzq3.R.inc(5599);c = read();
            __CLR4_4_14ar4arkylvdzq3.R.inc(5600);if ((((c == EOF)&&(__CLR4_4_14ar4arkylvdzq3.R.iget(5601)!=0|true))||(__CLR4_4_14ar4arkylvdzq3.R.iget(5602)==0&false))) {{
                __CLR4_4_14ar4arkylvdzq3.R.inc(5603);return (((i == 0 )&&(__CLR4_4_14ar4arkylvdzq3.R.iget(5604)!=0|true))||(__CLR4_4_14ar4arkylvdzq3.R.iget(5605)==0&false))? EOF : i;
            }
            }__CLR4_4_14ar4arkylvdzq3.R.inc(5606);cbuf[off + i] = (char) c;
        }
        }__CLR4_4_14ar4arkylvdzq3.R.inc(5607);return len;
    }finally{__CLR4_4_14ar4arkylvdzq3.R.flushNeeded();}}
}
