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

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;

/**
 * Streams data from a {@link RandomAccessFile} starting at its current position.
 *
 * @since 2.8.0
 */
public class RandomAccessFileInputStream extends InputStream {public static class __CLR4_4_151l51lkylvdzwj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,6589,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean closeOnClose;
    private final RandomAccessFile randomAccessFile;

    /**
     * Constructs a new instance configured to leave the underlying file open when this stream is closed.
     *
     * @param file The file to stream.
     */
    public RandomAccessFileInputStream(final RandomAccessFile file) {
        this(file, false);__CLR4_4_151l51lkylvdzwj.R.inc(6538);try{__CLR4_4_151l51lkylvdzwj.R.inc(6537);
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    /**
     * Constructs a new instance.
     *
     * @param file The file to stream.
     * @param closeOnClose Whether to close the underlying file when this stream is closed.
     */
    public RandomAccessFileInputStream(final RandomAccessFile file, final boolean closeOnClose) {try{__CLR4_4_151l51lkylvdzwj.R.inc(6539);
        __CLR4_4_151l51lkylvdzwj.R.inc(6540);this.randomAccessFile = Objects.requireNonNull(file, "file");
        __CLR4_4_151l51lkylvdzwj.R.inc(6541);this.closeOnClose = closeOnClose;
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    /**
     * Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream.
     *
     * If there are more than {@link Integer#MAX_VALUE} bytes available, return {@link Integer#MAX_VALUE}.
     *
     * @return An estimate of the number of bytes that can be read.
     * @throws IOException If an I/O error occurs.
     */
    @Override
    public int available() throws IOException {try{__CLR4_4_151l51lkylvdzwj.R.inc(6542);
        __CLR4_4_151l51lkylvdzwj.R.inc(6543);final long avail = availableLong();
        __CLR4_4_151l51lkylvdzwj.R.inc(6544);if ((((avail > Integer.MAX_VALUE)&&(__CLR4_4_151l51lkylvdzwj.R.iget(6545)!=0|true))||(__CLR4_4_151l51lkylvdzwj.R.iget(6546)==0&false))) {{
            __CLR4_4_151l51lkylvdzwj.R.inc(6547);return Integer.MAX_VALUE;
        }
        }__CLR4_4_151l51lkylvdzwj.R.inc(6548);return (int) avail;
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    /**
     * Returns the number of bytes that can be read (or skipped over) from this input stream.
     *
     * @return The number of bytes that can be read.
     * @throws IOException If an I/O error occurs.
     */
    public long availableLong() throws IOException {try{__CLR4_4_151l51lkylvdzwj.R.inc(6549);
        __CLR4_4_151l51lkylvdzwj.R.inc(6550);return randomAccessFile.length() - randomAccessFile.getFilePointer();
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_4_151l51lkylvdzwj.R.inc(6551);
        __CLR4_4_151l51lkylvdzwj.R.inc(6552);super.close();
        __CLR4_4_151l51lkylvdzwj.R.inc(6553);if ((((closeOnClose)&&(__CLR4_4_151l51lkylvdzwj.R.iget(6554)!=0|true))||(__CLR4_4_151l51lkylvdzwj.R.iget(6555)==0&false))) {{
            __CLR4_4_151l51lkylvdzwj.R.inc(6556);randomAccessFile.close();
        }
    }}finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    /**
     * Gets the underlying file.
     *
     * @return the underlying file.
     */
    public RandomAccessFile getRandomAccessFile() {try{__CLR4_4_151l51lkylvdzwj.R.inc(6557);
        __CLR4_4_151l51lkylvdzwj.R.inc(6558);return randomAccessFile;
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    /**
     * Returns whether to close the underlying file when this stream is closed.
     *
     * @return Whether to close the underlying file when this stream is closed.
     */
    public boolean isCloseOnClose() {try{__CLR4_4_151l51lkylvdzwj.R.inc(6559);
        __CLR4_4_151l51lkylvdzwj.R.inc(6560);return closeOnClose;
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    @Override
    public int read() throws IOException {try{__CLR4_4_151l51lkylvdzwj.R.inc(6561);
        __CLR4_4_151l51lkylvdzwj.R.inc(6562);return randomAccessFile.read();
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    @Override
    public int read(final byte[] bytes) throws IOException {try{__CLR4_4_151l51lkylvdzwj.R.inc(6563);
        __CLR4_4_151l51lkylvdzwj.R.inc(6564);return randomAccessFile.read(bytes);
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    @Override
    public int read(final byte[] bytes, final int offset, final int length) throws IOException {try{__CLR4_4_151l51lkylvdzwj.R.inc(6565);
        __CLR4_4_151l51lkylvdzwj.R.inc(6566);return randomAccessFile.read(bytes, offset, length);
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    /**
     * Delegates to the underlying file.
     *
     * @param position See {@link RandomAccessFile#seek(long)}.
     * @throws IOException See {@link RandomAccessFile#seek(long)}.
     * @see RandomAccessFile#seek(long)
     */
    private void seek(final long position) throws IOException {try{__CLR4_4_151l51lkylvdzwj.R.inc(6567);
        __CLR4_4_151l51lkylvdzwj.R.inc(6568);randomAccessFile.seek(position);
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}

    @Override
    public long skip(final long skipCount) throws IOException {try{__CLR4_4_151l51lkylvdzwj.R.inc(6569);
        __CLR4_4_151l51lkylvdzwj.R.inc(6570);if ((((skipCount <= 0)&&(__CLR4_4_151l51lkylvdzwj.R.iget(6571)!=0|true))||(__CLR4_4_151l51lkylvdzwj.R.iget(6572)==0&false))) {{
            __CLR4_4_151l51lkylvdzwj.R.inc(6573);return 0;
        }
        }__CLR4_4_151l51lkylvdzwj.R.inc(6574);final long filePointer = randomAccessFile.getFilePointer();
        __CLR4_4_151l51lkylvdzwj.R.inc(6575);final long fileLength = randomAccessFile.length();
        __CLR4_4_151l51lkylvdzwj.R.inc(6576);if ((((filePointer >= fileLength)&&(__CLR4_4_151l51lkylvdzwj.R.iget(6577)!=0|true))||(__CLR4_4_151l51lkylvdzwj.R.iget(6578)==0&false))) {{
            __CLR4_4_151l51lkylvdzwj.R.inc(6579);return 0;
        }
        }__CLR4_4_151l51lkylvdzwj.R.inc(6580);final long targetPos = filePointer + skipCount;
        __CLR4_4_151l51lkylvdzwj.R.inc(6581);final long newPos = (((targetPos > fileLength )&&(__CLR4_4_151l51lkylvdzwj.R.iget(6582)!=0|true))||(__CLR4_4_151l51lkylvdzwj.R.iget(6583)==0&false))? fileLength - 1 : targetPos;
        __CLR4_4_151l51lkylvdzwj.R.inc(6584);if ((((newPos > 0)&&(__CLR4_4_151l51lkylvdzwj.R.iget(6585)!=0|true))||(__CLR4_4_151l51lkylvdzwj.R.iget(6586)==0&false))) {{
            __CLR4_4_151l51lkylvdzwj.R.inc(6587);seek(newPos);
        }
        }__CLR4_4_151l51lkylvdzwj.R.inc(6588);return randomAccessFile.getFilePointer() - filePointer;
    }finally{__CLR4_4_151l51lkylvdzwj.R.flushNeeded();}}
}
