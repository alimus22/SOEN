/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.io.input;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests functionality of {@link BufferedFileChannelInputStream}.
 *
 * This class was ported and adapted from Apache Spark commit 933dc6cb7b3de1d8ccaf73d124d6eb95b947ed19 where it was
 * called {@code GenericFileInputStreamSuite}.
 */
public abstract class AbstractInputStreamTest {static class __CLR4_4_1fgafgakylve2kv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,20110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private byte[] randomBytes;

    protected File inputFile;

    protected InputStream[] inputStreams;

    @BeforeEach
    public void setUp() throws IOException {try{__CLR4_4_1fgafgakylve2kv.R.inc(20026);
        // Create a byte array of size 2 MB with random bytes
        __CLR4_4_1fgafgakylve2kv.R.inc(20027);randomBytes = RandomUtils.nextBytes(2 * 1024 * 1024);
        __CLR4_4_1fgafgakylve2kv.R.inc(20028);inputFile = File.createTempFile("temp-file", ".tmp");
        __CLR4_4_1fgafgakylve2kv.R.inc(20029);FileUtils.writeByteArrayToFile(inputFile, randomBytes);
    }finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}

    @AfterEach
    public void tearDown() throws IOException {try{__CLR4_4_1fgafgakylve2kv.R.inc(20030);
        __CLR4_4_1fgafgakylve2kv.R.inc(20031);inputFile.delete();

        __CLR4_4_1fgafgakylve2kv.R.inc(20032);for (final InputStream is : inputStreams) {{
            __CLR4_4_1fgafgakylve2kv.R.inc(20033);is.close();
        }
    }}finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}

    @Test
    public void testBytesSkipped() throws IOException {__CLR4_4_1fgafgakylve2kv.R.globalSliceStart(getClass().getName(),20034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocw1wifgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgafgakylve2kv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgafgakylve2kv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AbstractInputStreamTest.testBytesSkipped",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocw1wifgi() throws IOException{try{__CLR4_4_1fgafgakylve2kv.R.inc(20034);
        __CLR4_4_1fgafgakylve2kv.R.inc(20035);for (final InputStream inputStream : inputStreams) {{
            __CLR4_4_1fgafgakylve2kv.R.inc(20036);assertEquals(1024, inputStream.skip(1024));
            __CLR4_4_1fgafgakylve2kv.R.inc(20037);for (int i = 1024; (((i < randomBytes.length)&&(__CLR4_4_1fgafgakylve2kv.R.iget(20038)!=0|true))||(__CLR4_4_1fgafgakylve2kv.R.iget(20039)==0&false)); i++) {{
                __CLR4_4_1fgafgakylve2kv.R.inc(20040);assertEquals(randomBytes[i], (byte) inputStream.read());
            }
        }}
    }}finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}

    @Test
    public void testBytesSkippedAfterEOF() throws IOException {__CLR4_4_1fgafgakylve2kv.R.globalSliceStart(getClass().getName(),20041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5ucqmfgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgafgakylve2kv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgafgakylve2kv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AbstractInputStreamTest.testBytesSkippedAfterEOF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5ucqmfgp() throws IOException{try{__CLR4_4_1fgafgakylve2kv.R.inc(20041);
        __CLR4_4_1fgafgakylve2kv.R.inc(20042);for (final InputStream inputStream : inputStreams) {{
            __CLR4_4_1fgafgakylve2kv.R.inc(20043);assertEquals(randomBytes.length, inputStream.skip(randomBytes.length + 1));
            __CLR4_4_1fgafgakylve2kv.R.inc(20044);assertEquals(-1, inputStream.read());
        }
    }}finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}

    @Test
    public void testBytesSkippedAfterRead() throws IOException {__CLR4_4_1fgafgakylve2kv.R.globalSliceStart(getClass().getName(),20045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owu6ymfgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgafgakylve2kv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgafgakylve2kv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AbstractInputStreamTest.testBytesSkippedAfterRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owu6ymfgt() throws IOException{try{__CLR4_4_1fgafgakylve2kv.R.inc(20045);
        __CLR4_4_1fgafgakylve2kv.R.inc(20046);for (final InputStream inputStream : inputStreams) {{
            __CLR4_4_1fgafgakylve2kv.R.inc(20047);for (int i = 0; (((i < 1024)&&(__CLR4_4_1fgafgakylve2kv.R.iget(20048)!=0|true))||(__CLR4_4_1fgafgakylve2kv.R.iget(20049)==0&false)); i++) {{
                __CLR4_4_1fgafgakylve2kv.R.inc(20050);assertEquals(randomBytes[i], (byte) inputStream.read());
            }
            }__CLR4_4_1fgafgakylve2kv.R.inc(20051);assertEquals(1024, inputStream.skip(1024));
            __CLR4_4_1fgafgakylve2kv.R.inc(20052);for (int i = 2048; (((i < randomBytes.length)&&(__CLR4_4_1fgafgakylve2kv.R.iget(20053)!=0|true))||(__CLR4_4_1fgafgakylve2kv.R.iget(20054)==0&false)); i++) {{
                __CLR4_4_1fgafgakylve2kv.R.inc(20055);assertEquals(randomBytes[i], (byte) inputStream.read());
            }
        }}
    }}finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}

    @Test
    public void testNegativeBytesSkippedAfterRead() throws IOException {__CLR4_4_1fgafgakylve2kv.R.globalSliceStart(getClass().getName(),20056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bzfsdfh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgafgakylve2kv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgafgakylve2kv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AbstractInputStreamTest.testNegativeBytesSkippedAfterRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bzfsdfh4() throws IOException{try{__CLR4_4_1fgafgakylve2kv.R.inc(20056);
        __CLR4_4_1fgafgakylve2kv.R.inc(20057);for (final InputStream inputStream : inputStreams) {{
            __CLR4_4_1fgafgakylve2kv.R.inc(20058);for (int i = 0; (((i < 1024)&&(__CLR4_4_1fgafgakylve2kv.R.iget(20059)!=0|true))||(__CLR4_4_1fgafgakylve2kv.R.iget(20060)==0&false)); i++) {{
                __CLR4_4_1fgafgakylve2kv.R.inc(20061);assertEquals(randomBytes[i], (byte) inputStream.read());
            }
            // Skipping negative bytes should essential be a no-op
            }__CLR4_4_1fgafgakylve2kv.R.inc(20062);assertEquals(0, inputStream.skip(-1));
            __CLR4_4_1fgafgakylve2kv.R.inc(20063);assertEquals(0, inputStream.skip(-1024));
            __CLR4_4_1fgafgakylve2kv.R.inc(20064);assertEquals(0, inputStream.skip(Long.MIN_VALUE));
            __CLR4_4_1fgafgakylve2kv.R.inc(20065);assertEquals(1024, inputStream.skip(1024));
            __CLR4_4_1fgafgakylve2kv.R.inc(20066);for (int i = 2048; (((i < randomBytes.length)&&(__CLR4_4_1fgafgakylve2kv.R.iget(20067)!=0|true))||(__CLR4_4_1fgafgakylve2kv.R.iget(20068)==0&false)); i++) {{
                __CLR4_4_1fgafgakylve2kv.R.inc(20069);assertEquals(randomBytes[i], (byte) inputStream.read());
            }
        }}
    }}finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}

    @Test
    public void testReadMultipleBytes() throws IOException {__CLR4_4_1fgafgakylve2kv.R.globalSliceStart(getClass().getName(),20070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qeyb7qfhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgafgakylve2kv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgafgakylve2kv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AbstractInputStreamTest.testReadMultipleBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qeyb7qfhi() throws IOException{try{__CLR4_4_1fgafgakylve2kv.R.inc(20070);
        __CLR4_4_1fgafgakylve2kv.R.inc(20071);for (final InputStream inputStream : inputStreams) {{
            __CLR4_4_1fgafgakylve2kv.R.inc(20072);final byte[] readBytes = new byte[8 * 1024];
            __CLR4_4_1fgafgakylve2kv.R.inc(20073);int i = 0;
            __CLR4_4_1fgafgakylve2kv.R.inc(20074);while ((((i < randomBytes.length)&&(__CLR4_4_1fgafgakylve2kv.R.iget(20075)!=0|true))||(__CLR4_4_1fgafgakylve2kv.R.iget(20076)==0&false))) {{
                __CLR4_4_1fgafgakylve2kv.R.inc(20077);final int read = inputStream.read(readBytes, 0, 8 * 1024);
                __CLR4_4_1fgafgakylve2kv.R.inc(20078);for (int j = 0; (((j < read)&&(__CLR4_4_1fgafgakylve2kv.R.iget(20079)!=0|true))||(__CLR4_4_1fgafgakylve2kv.R.iget(20080)==0&false)); j++) {{
                    __CLR4_4_1fgafgakylve2kv.R.inc(20081);assertEquals(randomBytes[i], readBytes[j]);
                    __CLR4_4_1fgafgakylve2kv.R.inc(20082);i++;
                }
            }}
        }}
    }}finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}

    @Test
    public void testReadOneByte() throws IOException {__CLR4_4_1fgafgakylve2kv.R.globalSliceStart(getClass().getName(),20083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131nk2bfhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgafgakylve2kv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgafgakylve2kv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AbstractInputStreamTest.testReadOneByte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131nk2bfhv() throws IOException{try{__CLR4_4_1fgafgakylve2kv.R.inc(20083);
        __CLR4_4_1fgafgakylve2kv.R.inc(20084);for (final InputStream inputStream : inputStreams) {{
            __CLR4_4_1fgafgakylve2kv.R.inc(20085);for (final byte randomByte : randomBytes) {{
                __CLR4_4_1fgafgakylve2kv.R.inc(20086);assertEquals(randomByte, (byte) inputStream.read());
            }
        }}
    }}finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}

    @Test
    public void testReadPastEOF() throws IOException {__CLR4_4_1fgafgakylve2kv.R.globalSliceStart(getClass().getName(),20087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2065lfhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgafgakylve2kv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgafgakylve2kv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AbstractInputStreamTest.testReadPastEOF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2065lfhz() throws IOException{try{__CLR4_4_1fgafgakylve2kv.R.inc(20087);
        __CLR4_4_1fgafgakylve2kv.R.inc(20088);final InputStream is = inputStreams[0];
        __CLR4_4_1fgafgakylve2kv.R.inc(20089);final byte[] buf = new byte[1024];
        __CLR4_4_1fgafgakylve2kv.R.inc(20090);int read;
        __CLR4_4_1fgafgakylve2kv.R.inc(20091);while ((read = is.read(buf, 0, buf.length)) != -1) {{

        }

        }__CLR4_4_1fgafgakylve2kv.R.inc(20094);final int readAfterEOF = is.read(buf, 0, buf.length);
        __CLR4_4_1fgafgakylve2kv.R.inc(20095);assertEquals(-1, readAfterEOF);
    }finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}

    @Test
    public void testSkipFromFileChannel() throws IOException {__CLR4_4_1fgafgakylve2kv.R.globalSliceStart(getClass().getName(),20096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fdbu8dfi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgafgakylve2kv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgafgakylve2kv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.AbstractInputStreamTest.testSkipFromFileChannel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fdbu8dfi8() throws IOException{try{__CLR4_4_1fgafgakylve2kv.R.inc(20096);
        __CLR4_4_1fgafgakylve2kv.R.inc(20097);for (final InputStream inputStream : inputStreams) {{
            // Since the buffer is smaller than the skipped bytes, this will guarantee
            // we skip from underlying file channel.
            __CLR4_4_1fgafgakylve2kv.R.inc(20098);assertEquals(1024, inputStream.skip(1024));
            __CLR4_4_1fgafgakylve2kv.R.inc(20099);for (int i = 1024; (((i < 2048)&&(__CLR4_4_1fgafgakylve2kv.R.iget(20100)!=0|true))||(__CLR4_4_1fgafgakylve2kv.R.iget(20101)==0&false)); i++) {{
                __CLR4_4_1fgafgakylve2kv.R.inc(20102);assertEquals(randomBytes[i], (byte) inputStream.read());
            }
            }__CLR4_4_1fgafgakylve2kv.R.inc(20103);assertEquals(256, inputStream.skip(256));
            __CLR4_4_1fgafgakylve2kv.R.inc(20104);assertEquals(256, inputStream.skip(256));
            __CLR4_4_1fgafgakylve2kv.R.inc(20105);assertEquals(512, inputStream.skip(512));
            __CLR4_4_1fgafgakylve2kv.R.inc(20106);for (int i = 3072; (((i < randomBytes.length)&&(__CLR4_4_1fgafgakylve2kv.R.iget(20107)!=0|true))||(__CLR4_4_1fgafgakylve2kv.R.iget(20108)==0&false)); i++) {{
                __CLR4_4_1fgafgakylve2kv.R.inc(20109);assertEquals(randomBytes[i], (byte) inputStream.read());
            }
        }}
    }}finally{__CLR4_4_1fgafgakylve2kv.R.flushNeeded();}}
}
