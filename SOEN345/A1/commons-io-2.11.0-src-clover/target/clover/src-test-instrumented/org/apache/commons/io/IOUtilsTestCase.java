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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.CircularInputStream;
import org.apache.commons.io.input.NullInputStream;
import org.apache.commons.io.output.AppendableWriter;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.io.test.TestUtils;
import org.apache.commons.io.test.ThrowOnCloseReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * This is used to test IOUtils for correctness. The following checks are performed:
 * <ul>
 * <li>The return must not be null, must be the same type and equals() to the method's second arg</li>
 * <li>All bytes must have been read from the source (available() == 0)</li>
 * <li>The source and destination content must be identical (byte-wise comparison check)</li>
 * <li>The output stream must not have been closed (a byte/char is written to test this, and subsequent size
 * checked)</li>
 * </ul>
 * Due to interdependencies in IOUtils and IOUtilsTestlet, one bug may cause multiple tests to fail.
 */
@SuppressWarnings("deprecation") // deliberately testing deprecated code
public class IOUtilsTestCase {static class __CLR4_4_1c00c00kylve1x6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,16452,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int FILE_SIZE = 1024 * 4 + 1;

    /** Determine if this is windows. */
    private static final boolean WINDOWS = File.separatorChar == '\\';
    /*
     * Note: this is not particularly beautiful code. A better way to check for flush and close status would be to
     * implement "trojan horse" wrapper implementations of the various stream classes, which set a flag when relevant
     * methods are called. (JT)
     */

    @TempDir
    public File temporaryFolder;

    private char[] carr;

    private byte[] iarr;

    private File testFile;

    /**
     * Path constructed from {@code testFile}.
     */
    private Path testFilePath;

    /** Assert that the contents of two byte arrays are the same. */
    private void assertEqualContent(final byte[] b0, final byte[] b1) {try{__CLR4_4_1c00c00kylve1x6.R.inc(15552);
        __CLR4_4_1c00c00kylve1x6.R.inc(15553);assertArrayEquals(b0, b1, "Content not equal according to java.util.Arrays#equals()");
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @BeforeEach
    public void setUp() {try{__CLR4_4_1c00c00kylve1x6.R.inc(15554);
        __CLR4_4_1c00c00kylve1x6.R.inc(15555);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(15556);testFile = new File(temporaryFolder, "file2-test.txt");
            __CLR4_4_1c00c00kylve1x6.R.inc(15557);testFilePath = testFile.toPath();

            __CLR4_4_1c00c00kylve1x6.R.inc(15558);if ((((!testFile.getParentFile().exists())&&(__CLR4_4_1c00c00kylve1x6.R.iget(15559)!=0|true))||(__CLR4_4_1c00c00kylve1x6.R.iget(15560)==0&false))) {{
                __CLR4_4_1c00c00kylve1x6.R.inc(15561);throw new IOException("Cannot create file " + testFile + " as the parent directory does not exist");
            }
            }__CLR4_4_1c00c00kylve1x6.R.inc(15562);final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(testFilePath));
            __CLR4_4_1c00c00kylve1x6.R.inc(15563);try {
                __CLR4_4_1c00c00kylve1x6.R.inc(15564);TestUtils.generateTestData(output, FILE_SIZE);
            } finally {
                __CLR4_4_1c00c00kylve1x6.R.inc(15565);IOUtils.closeQuietly(output);
            }
        } catch (final IOException ioe) {
            __CLR4_4_1c00c00kylve1x6.R.inc(15566);throw new RuntimeException(
                "Can't run this test because the environment could not be built: " + ioe.getMessage());
        }
        // Create and init a byte array as input data
        __CLR4_4_1c00c00kylve1x6.R.inc(15567);iarr = new byte[200];
        __CLR4_4_1c00c00kylve1x6.R.inc(15568);Arrays.fill(iarr, (byte) -1);
        __CLR4_4_1c00c00kylve1x6.R.inc(15569);for (int i = 0; (((i < 80)&&(__CLR4_4_1c00c00kylve1x6.R.iget(15570)!=0|true))||(__CLR4_4_1c00c00kylve1x6.R.iget(15571)==0&false)); i++) {{
            __CLR4_4_1c00c00kylve1x6.R.inc(15572);iarr[i] = (byte) i;
        }
        }__CLR4_4_1c00c00kylve1x6.R.inc(15573);carr = new char[200];
        __CLR4_4_1c00c00kylve1x6.R.inc(15574);Arrays.fill(carr, (char) -1);
        __CLR4_4_1c00c00kylve1x6.R.inc(15575);for (int i = 0; (((i < 80)&&(__CLR4_4_1c00c00kylve1x6.R.iget(15576)!=0|true))||(__CLR4_4_1c00c00kylve1x6.R.iget(15577)==0&false)); i++) {{
            __CLR4_4_1c00c00kylve1x6.R.inc(15578);carr[i] = (char) i;
        }
    }}finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsBufferedInputStream() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2rq4yc0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsBufferedInputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2rq4yc0r(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15579);
        __CLR4_4_1c00c00kylve1x6.R.inc(15580);final InputStream is = new InputStream() {
            @Override
            public int read() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15581);
                __CLR4_4_1c00c00kylve1x6.R.inc(15582);return 0;
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15583);final BufferedInputStream bis = IOUtils.buffer(is);
        __CLR4_4_1c00c00kylve1x6.R.inc(15584);assertNotSame(is, bis);
        __CLR4_4_1c00c00kylve1x6.R.inc(15585);assertSame(bis, IOUtils.buffer(bis));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsBufferedInputStreamWithBufferSize() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8672jc0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsBufferedInputStreamWithBufferSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8672jc0y(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15586);
        __CLR4_4_1c00c00kylve1x6.R.inc(15587);final InputStream is = new InputStream() {
            @Override
            public int read() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15588);
                __CLR4_4_1c00c00kylve1x6.R.inc(15589);return 0;
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15590);final BufferedInputStream bis = IOUtils.buffer(is, 2048);
        __CLR4_4_1c00c00kylve1x6.R.inc(15591);assertNotSame(is, bis);
        __CLR4_4_1c00c00kylve1x6.R.inc(15592);assertSame(bis, IOUtils.buffer(bis));
        __CLR4_4_1c00c00kylve1x6.R.inc(15593);assertSame(bis, IOUtils.buffer(bis, 1024));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsBufferedNull() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9b8ghc16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsBufferedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9b8ghc16(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15594);
        __CLR4_4_1c00c00kylve1x6.R.inc(15595);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(15596);IOUtils.buffer((InputStream) null);
            __CLR4_4_1c00c00kylve1x6.R.inc(15597);fail("Expected NullPointerException");
        } catch (final NullPointerException npe) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(15598);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(15599);IOUtils.buffer((OutputStream) null);
            __CLR4_4_1c00c00kylve1x6.R.inc(15600);fail("Expected NullPointerException");
        } catch (final NullPointerException npe) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(15601);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(15602);IOUtils.buffer((Reader) null);
            __CLR4_4_1c00c00kylve1x6.R.inc(15603);fail("Expected NullPointerException");
        } catch (final NullPointerException npe) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(15604);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(15605);IOUtils.buffer((Writer) null);
            __CLR4_4_1c00c00kylve1x6.R.inc(15606);fail("Expected NullPointerException");
        } catch (final NullPointerException npe) {
            // expected
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsBufferedOutputStream() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jnpslc1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsBufferedOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jnpslc1j(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15607);
        __CLR4_4_1c00c00kylve1x6.R.inc(15608);final OutputStream is = new OutputStream() {
            @Override
            public void write(final int b) throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15609);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15610);final BufferedOutputStream bis = IOUtils.buffer(is);
        __CLR4_4_1c00c00kylve1x6.R.inc(15611);assertNotSame(is, bis);
        __CLR4_4_1c00c00kylve1x6.R.inc(15612);assertSame(bis, IOUtils.buffer(bis));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsBufferedOutputStreamWithBufferSize() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ksb8zyc1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsBufferedOutputStreamWithBufferSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ksb8zyc1p(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15613);
        __CLR4_4_1c00c00kylve1x6.R.inc(15614);final OutputStream os = new OutputStream() {
            @Override
            public void write(final int b) throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15615);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15616);final BufferedOutputStream bos = IOUtils.buffer(os, 2048);
        __CLR4_4_1c00c00kylve1x6.R.inc(15617);assertNotSame(os, bos);
        __CLR4_4_1c00c00kylve1x6.R.inc(15618);assertSame(bos, IOUtils.buffer(bos));
        __CLR4_4_1c00c00kylve1x6.R.inc(15619);assertSame(bos, IOUtils.buffer(bos, 1024));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsBufferedReader() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g657qrc1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsBufferedReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g657qrc1w(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15620);
        __CLR4_4_1c00c00kylve1x6.R.inc(15621);final Reader is = new Reader() {
            @Override
            public void close() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15622);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

            @Override
            public int read(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15623);
                __CLR4_4_1c00c00kylve1x6.R.inc(15624);return 0;
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15625);final BufferedReader bis = IOUtils.buffer(is);
        __CLR4_4_1c00c00kylve1x6.R.inc(15626);assertNotSame(is, bis);
        __CLR4_4_1c00c00kylve1x6.R.inc(15627);assertSame(bis, IOUtils.buffer(bis));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsBufferedReaderWithBufferSize() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn9wq4c24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsBufferedReaderWithBufferSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn9wq4c24(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15628);
        __CLR4_4_1c00c00kylve1x6.R.inc(15629);final Reader r = new Reader() {
            @Override
            public void close() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15630);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

            @Override
            public int read(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15631);
                __CLR4_4_1c00c00kylve1x6.R.inc(15632);return 0;
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15633);final BufferedReader br = IOUtils.buffer(r, 2048);
        __CLR4_4_1c00c00kylve1x6.R.inc(15634);assertNotSame(r, br);
        __CLR4_4_1c00c00kylve1x6.R.inc(15635);assertSame(br, IOUtils.buffer(br));
        __CLR4_4_1c00c00kylve1x6.R.inc(15636);assertSame(br, IOUtils.buffer(br, 1024));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsBufferedWriter() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rh522rc2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsBufferedWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rh522rc2d(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15637);
        __CLR4_4_1c00c00kylve1x6.R.inc(15638);final Writer is = new Writer() {
            @Override
            public void close() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15639);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

            @Override
            public void flush() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15640);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

            @Override
            public void write(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15641);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

            @Override
            public void write(final int b) throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15642);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15643);final BufferedWriter bis = IOUtils.buffer(is);
        __CLR4_4_1c00c00kylve1x6.R.inc(15644);assertNotSame(is, bis);
        __CLR4_4_1c00c00kylve1x6.R.inc(15645);assertSame(bis, IOUtils.buffer(bis));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsBufferedWriterWithBufferSize() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkcq4cc2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsBufferedWriterWithBufferSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkcq4cc2m(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15646);
        __CLR4_4_1c00c00kylve1x6.R.inc(15647);final Writer w = new Writer() {
            @Override
            public void close() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15648);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

            @Override
            public void flush() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15649);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

            @Override
            public void write(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15650);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

            @Override
            public void write(final int b) throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15651);
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15652);final BufferedWriter bw = IOUtils.buffer(w, 2024);
        __CLR4_4_1c00c00kylve1x6.R.inc(15653);assertNotSame(w, bw);
        __CLR4_4_1c00c00kylve1x6.R.inc(15654);assertSame(bw, IOUtils.buffer(bw));
        __CLR4_4_1c00c00kylve1x6.R.inc(15655);assertSame(bw, IOUtils.buffer(bw, 1024));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsWriterAppendable() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18f2oumc2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsWriterAppendable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18f2oumc2w(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15656);
        __CLR4_4_1c00c00kylve1x6.R.inc(15657);final Appendable a = new StringBuffer();
        __CLR4_4_1c00c00kylve1x6.R.inc(15658);final Writer w = IOUtils.writer(a);
        __CLR4_4_1c00c00kylve1x6.R.inc(15659);assertNotSame(w, a);
        __CLR4_4_1c00c00kylve1x6.R.inc(15660);assertEquals(AppendableWriter.class, w.getClass());
        __CLR4_4_1c00c00kylve1x6.R.inc(15661);assertSame(w, IOUtils.writer(w));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsWriterNull() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yo0uorc32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsWriterNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yo0uorc32(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15662);
        __CLR4_4_1c00c00kylve1x6.R.inc(15663);assertThrows(NullPointerException.class, () -> IOUtils.writer(null));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testAsWriterStringBuilder() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1faxtoac34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testAsWriterStringBuilder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1faxtoac34(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15664);
        __CLR4_4_1c00c00kylve1x6.R.inc(15665);final Appendable a = new StringBuilder();
        __CLR4_4_1c00c00kylve1x6.R.inc(15666);final Writer w = IOUtils.writer(a);
        __CLR4_4_1c00c00kylve1x6.R.inc(15667);assertNotSame(w, a);
        __CLR4_4_1c00c00kylve1x6.R.inc(15668);assertEquals(StringBuilderWriter.class, w.getClass());
        __CLR4_4_1c00c00kylve1x6.R.inc(15669);assertSame(w, IOUtils.writer(w));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testClose() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169vzsjc3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169vzsjc3a(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15670);
        __CLR4_4_1c00c00kylve1x6.R.inc(15671);assertDoesNotThrow(() -> IOUtils.close((Closeable) null));
        __CLR4_4_1c00c00kylve1x6.R.inc(15672);assertDoesNotThrow(() -> IOUtils.close(new StringReader("s")));
        __CLR4_4_1c00c00kylve1x6.R.inc(15673);assertThrows(IOException.class, () -> IOUtils.close(new ThrowOnCloseReader(new StringReader("s"))));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCloseConsumer() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n1mb31c3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseConsumer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n1mb31c3e(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15674);
        __CLR4_4_1c00c00kylve1x6.R.inc(15675);final Closeable nullCloseable = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15676);assertDoesNotThrow(() -> IOUtils.close(nullCloseable, null)); // null consumer
        __CLR4_4_1c00c00kylve1x6.R.inc(15677);assertDoesNotThrow(() -> IOUtils.close(new StringReader("s"), null)); // null consumer
        __CLR4_4_1c00c00kylve1x6.R.inc(15678);assertDoesNotThrow(() -> IOUtils.close(new ThrowOnCloseReader(new StringReader("s")), null)); // null consumer

        __CLR4_4_1c00c00kylve1x6.R.inc(15679);final IOConsumer<IOException> nullConsumer = null; // null consumer doesn't throw
        __CLR4_4_1c00c00kylve1x6.R.inc(15680);assertDoesNotThrow(() -> IOUtils.close(nullCloseable, nullConsumer));
        __CLR4_4_1c00c00kylve1x6.R.inc(15681);assertDoesNotThrow(() -> IOUtils.close(new StringReader("s"), nullConsumer));
        __CLR4_4_1c00c00kylve1x6.R.inc(15682);assertDoesNotThrow(() -> IOUtils.close(new ThrowOnCloseReader(new StringReader("s")), nullConsumer));

        __CLR4_4_1c00c00kylve1x6.R.inc(15683);final IOConsumer<IOException> silentConsumer = IOConsumer.noop(); // noop consumer doesn't throw
        __CLR4_4_1c00c00kylve1x6.R.inc(15684);assertDoesNotThrow(() -> IOUtils.close(nullCloseable, silentConsumer));
        __CLR4_4_1c00c00kylve1x6.R.inc(15685);assertDoesNotThrow(() -> IOUtils.close(new StringReader("s"), silentConsumer));
        __CLR4_4_1c00c00kylve1x6.R.inc(15686);assertDoesNotThrow(() -> IOUtils.close(new ThrowOnCloseReader(new StringReader("s")), silentConsumer));

        __CLR4_4_1c00c00kylve1x6.R.inc(15687);final IOConsumer<IOException> noisyConsumer = i -> {
            __CLR4_4_1c00c00kylve1x6.R.inc(15688);throw i;
        }; // consumer passes on the throw
        __CLR4_4_1c00c00kylve1x6.R.inc(15689);assertDoesNotThrow(() -> IOUtils.close(nullCloseable, noisyConsumer)); // no throw
        __CLR4_4_1c00c00kylve1x6.R.inc(15690);assertDoesNotThrow(() -> IOUtils.close(new StringReader("s"), noisyConsumer)); // no throw
        __CLR4_4_1c00c00kylve1x6.R.inc(15691);assertThrows(IOException.class,
            () -> IOUtils.close(new ThrowOnCloseReader(new StringReader("s")), noisyConsumer)); // closeable throws
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCloseMulti() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydyaiuc3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseMulti",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydyaiuc3w(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15692);
        __CLR4_4_1c00c00kylve1x6.R.inc(15693);final Closeable nullCloseable = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15694);final Closeable[] closeables = {null, null};
        __CLR4_4_1c00c00kylve1x6.R.inc(15695);assertDoesNotThrow(() -> IOUtils.close(nullCloseable, nullCloseable));
        __CLR4_4_1c00c00kylve1x6.R.inc(15696);assertDoesNotThrow(() -> IOUtils.close(closeables));
        __CLR4_4_1c00c00kylve1x6.R.inc(15697);assertDoesNotThrow(() -> IOUtils.close((Closeable[]) null));
        __CLR4_4_1c00c00kylve1x6.R.inc(15698);assertDoesNotThrow(() -> IOUtils.close(new StringReader("s"), nullCloseable));
        __CLR4_4_1c00c00kylve1x6.R.inc(15699);assertThrows(IOException.class,
            () -> IOUtils.close(nullCloseable, new ThrowOnCloseReader(new StringReader("s"))));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCloseQuietly_AllCloseableIOException() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113m057c44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_AllCloseableIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113m057c44(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15700);
        __CLR4_4_1c00c00kylve1x6.R.inc(15701);final Closeable closeable = () -> {
            __CLR4_4_1c00c00kylve1x6.R.inc(15702);throw new IOException();
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15703);assertDoesNotThrow(() -> IOUtils.closeQuietly(closeable, null, closeable));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCloseQuietly_CloseableIOException() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxqduqc48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_CloseableIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxqduqc48(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15704);
        __CLR4_4_1c00c00kylve1x6.R.inc(15705);assertDoesNotThrow(() -> {
            __CLR4_4_1c00c00kylve1x6.R.inc(15706);IOUtils.closeQuietly((Closeable) () -> {
                __CLR4_4_1c00c00kylve1x6.R.inc(15707);throw new IOException();
            });
        });
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @SuppressWarnings("squid:S2699") // Suppress "Add at least one assertion to this test case"
    @Test
    public void testCloseQuietly_Selector() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdu3pmc4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_Selector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdu3pmc4c(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15708);
        __CLR4_4_1c00c00kylve1x6.R.inc(15709);Selector selector = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15710);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(15711);selector = Selector.open();
        } catch (final IOException ignore) {
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(15712);IOUtils.closeQuietly(selector);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @SuppressWarnings("squid:S2699") // Suppress "Add at least one assertion to this test case"
    @Test
    public void testCloseQuietly_SelectorIOException() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlbcvnc4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_SelectorIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlbcvnc4h(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15713);
        __CLR4_4_1c00c00kylve1x6.R.inc(15714);final Selector selector = new SelectorAdapter() {
            @Override
            public void close() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15715);
                __CLR4_4_1c00c00kylve1x6.R.inc(15716);throw new IOException();
            }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
        };
        __CLR4_4_1c00c00kylve1x6.R.inc(15717);IOUtils.closeQuietly(selector);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @SuppressWarnings("squid:S2699") // Suppress "Add at least one assertion to this test case"
    @Test
    public void testCloseQuietly_SelectorNull() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omjukxc4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_SelectorNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omjukxc4m(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15718);
        __CLR4_4_1c00c00kylve1x6.R.inc(15719);final Selector selector = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15720);IOUtils.closeQuietly(selector);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @SuppressWarnings("squid:S2699") // Suppress "Add at least one assertion to this test case"
    @Test
    public void testCloseQuietly_SelectorTwice() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akk9g4c4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_SelectorTwice",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akk9g4c4p(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15721);
        __CLR4_4_1c00c00kylve1x6.R.inc(15722);Selector selector = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15723);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(15724);selector = Selector.open();
        } catch (final IOException ignore) {
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(15725);IOUtils.closeQuietly(selector);
            __CLR4_4_1c00c00kylve1x6.R.inc(15726);IOUtils.closeQuietly(selector);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCloseQuietly_ServerSocket() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxlzj5c4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_ServerSocket",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxlzj5c4v(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15727);
        __CLR4_4_1c00c00kylve1x6.R.inc(15728);assertDoesNotThrow(() -> IOUtils.closeQuietly((ServerSocket) null));
        __CLR4_4_1c00c00kylve1x6.R.inc(15729);assertDoesNotThrow(() -> IOUtils.closeQuietly(new ServerSocket()));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCloseQuietly_ServerSocketIOException() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17r9iaec4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_ServerSocketIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17r9iaec4y(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15730);
        __CLR4_4_1c00c00kylve1x6.R.inc(15731);assertDoesNotThrow(() -> {
            __CLR4_4_1c00c00kylve1x6.R.inc(15732);IOUtils.closeQuietly(new ServerSocket() {
                @Override
                public void close() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15733);
                    __CLR4_4_1c00c00kylve1x6.R.inc(15734);throw new IOException();
                }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
            });
        });
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCloseQuietly_Socket() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11uym5ec53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_Socket",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11uym5ec53(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15735);
        __CLR4_4_1c00c00kylve1x6.R.inc(15736);assertDoesNotThrow(() -> IOUtils.closeQuietly((Socket) null));
        __CLR4_4_1c00c00kylve1x6.R.inc(15737);assertDoesNotThrow(() -> IOUtils.closeQuietly(new Socket()));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCloseQuietly_SocketIOException() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gy62yhc56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCloseQuietly_SocketIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gy62yhc56(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15738);
        __CLR4_4_1c00c00kylve1x6.R.inc(15739);assertDoesNotThrow(() -> {
            __CLR4_4_1c00c00kylve1x6.R.inc(15740);IOUtils.closeQuietly(new Socket() {
                @Override
                public synchronized void close() throws IOException {try{__CLR4_4_1c00c00kylve1x6.R.inc(15741);
                    __CLR4_4_1c00c00kylve1x6.R.inc(15742);throw new IOException();
                }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}
            });
        });
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testConstants() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwc5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwc5b(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15743);
        __CLR4_4_1c00c00kylve1x6.R.inc(15744);assertEquals('/', IOUtils.DIR_SEPARATOR_UNIX);
        __CLR4_4_1c00c00kylve1x6.R.inc(15745);assertEquals('\\', IOUtils.DIR_SEPARATOR_WINDOWS);
        __CLR4_4_1c00c00kylve1x6.R.inc(15746);assertEquals("\n", IOUtils.LINE_SEPARATOR_UNIX);
        __CLR4_4_1c00c00kylve1x6.R.inc(15747);assertEquals("\r\n", IOUtils.LINE_SEPARATOR_WINDOWS);
        __CLR4_4_1c00c00kylve1x6.R.inc(15748);if ((((WINDOWS)&&(__CLR4_4_1c00c00kylve1x6.R.iget(15749)!=0|true))||(__CLR4_4_1c00c00kylve1x6.R.iget(15750)==0&false))) {{
            __CLR4_4_1c00c00kylve1x6.R.inc(15751);assertEquals('\\', IOUtils.DIR_SEPARATOR);
            __CLR4_4_1c00c00kylve1x6.R.inc(15752);assertEquals("\r\n", IOUtils.LINE_SEPARATOR);
        } }else {{
            __CLR4_4_1c00c00kylve1x6.R.inc(15753);assertEquals('/', IOUtils.DIR_SEPARATOR);
            __CLR4_4_1c00c00kylve1x6.R.inc(15754);assertEquals("\n", IOUtils.LINE_SEPARATOR);
        }
        }__CLR4_4_1c00c00kylve1x6.R.inc(15755);assertEquals('\r', IOUtils.CR);
        __CLR4_4_1c00c00kylve1x6.R.inc(15756);assertEquals('\n', IOUtils.LF);
        __CLR4_4_1c00c00kylve1x6.R.inc(15757);assertEquals(-1, IOUtils.EOF);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testConsume() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmu41bc5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testConsume",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmu41bc5q() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(15758);
        __CLR4_4_1c00c00kylve1x6.R.inc(15759);final long size = (long) Integer.MAX_VALUE + (long) 1;
        __CLR4_4_1c00c00kylve1x6.R.inc(15760);final InputStream in = new NullInputStream(size);
        __CLR4_4_1c00c00kylve1x6.R.inc(15761);final OutputStream out = NullOutputStream.NULL_OUTPUT_STREAM;

        // Test copy() method
        __CLR4_4_1c00c00kylve1x6.R.inc(15762);assertEquals(-1, IOUtils.copy(in, out));

        // reset the input
        __CLR4_4_1c00c00kylve1x6.R.inc(15763);in.close();

        // Test consume() method
        __CLR4_4_1c00c00kylve1x6.R.inc(15764);assertEquals(size, IOUtils.consume(in), "consume()");
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testContentEquals_InputStream_InputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrc2gzc5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testContentEquals_InputStream_InputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrc2gzc5x() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(15765);
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15766);assertTrue(IOUtils.contentEquals((InputStream) null, null));
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(15767);final byte[] dataEmpty = "".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_1c00c00kylve1x6.R.inc(15768);final byte[] dataAbc = "ABC".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_1c00c00kylve1x6.R.inc(15769);final byte[] dataAbcd = "ABCD".getBytes(StandardCharsets.UTF_8);
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15770);final ByteArrayInputStream input1 = new ByteArrayInputStream(dataEmpty);
            __CLR4_4_1c00c00kylve1x6.R.inc(15771);assertFalse(IOUtils.contentEquals(input1, null));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15772);final ByteArrayInputStream input1 = new ByteArrayInputStream(dataEmpty);
            __CLR4_4_1c00c00kylve1x6.R.inc(15773);assertFalse(IOUtils.contentEquals(null, input1));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15774);final ByteArrayInputStream input1 = new ByteArrayInputStream(dataEmpty);
            __CLR4_4_1c00c00kylve1x6.R.inc(15775);assertTrue(IOUtils.contentEquals(input1, input1));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15776);final ByteArrayInputStream input1 = new ByteArrayInputStream(dataAbc);
            __CLR4_4_1c00c00kylve1x6.R.inc(15777);assertTrue(IOUtils.contentEquals(input1, input1));
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(15778);assertTrue(IOUtils.contentEquals(new ByteArrayInputStream(dataEmpty), new ByteArrayInputStream(dataEmpty)));
        __CLR4_4_1c00c00kylve1x6.R.inc(15779);assertTrue(IOUtils.contentEquals(new BufferedInputStream(new ByteArrayInputStream(dataEmpty)),
            new BufferedInputStream(new ByteArrayInputStream(dataEmpty))));
        __CLR4_4_1c00c00kylve1x6.R.inc(15780);assertTrue(IOUtils.contentEquals(new ByteArrayInputStream(dataAbc), new ByteArrayInputStream(dataAbc)));
        __CLR4_4_1c00c00kylve1x6.R.inc(15781);assertFalse(IOUtils.contentEquals(new ByteArrayInputStream(dataAbcd), new ByteArrayInputStream(dataAbc)));
        __CLR4_4_1c00c00kylve1x6.R.inc(15782);assertFalse(IOUtils.contentEquals(new ByteArrayInputStream(dataAbc), new ByteArrayInputStream(dataAbcd)));
        // Tests with larger inputs that DEFAULT_BUFFER_SIZE in case internal buffers are used.
        __CLR4_4_1c00c00kylve1x6.R.inc(15783);final byte[] bytes2XDefaultA = new byte[IOUtils.DEFAULT_BUFFER_SIZE * 2];
        __CLR4_4_1c00c00kylve1x6.R.inc(15784);final byte[] bytes2XDefaultB = new byte[IOUtils.DEFAULT_BUFFER_SIZE * 2];
        __CLR4_4_1c00c00kylve1x6.R.inc(15785);final byte[] bytes2XDefaultA2 = new byte[IOUtils.DEFAULT_BUFFER_SIZE * 2];
        __CLR4_4_1c00c00kylve1x6.R.inc(15786);Arrays.fill(bytes2XDefaultA, (byte) 'a');
        __CLR4_4_1c00c00kylve1x6.R.inc(15787);Arrays.fill(bytes2XDefaultB, (byte) 'b');
        __CLR4_4_1c00c00kylve1x6.R.inc(15788);Arrays.fill(bytes2XDefaultA2, (byte) 'a');
        __CLR4_4_1c00c00kylve1x6.R.inc(15789);bytes2XDefaultA2[bytes2XDefaultA2.length - 1] = 'd';
        __CLR4_4_1c00c00kylve1x6.R.inc(15790);assertFalse(IOUtils.contentEquals(new ByteArrayInputStream(bytes2XDefaultA),
            new ByteArrayInputStream(bytes2XDefaultB)));
        __CLR4_4_1c00c00kylve1x6.R.inc(15791);assertFalse(IOUtils.contentEquals(new ByteArrayInputStream(bytes2XDefaultA),
            new ByteArrayInputStream(bytes2XDefaultA2)));
        __CLR4_4_1c00c00kylve1x6.R.inc(15792);assertTrue(IOUtils.contentEquals(new ByteArrayInputStream(bytes2XDefaultA),
            new ByteArrayInputStream(bytes2XDefaultA)));
        // FileInputStream a bit more than 16 k.
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15793);try (
            __CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1c00c00kylve1x6.R.inc(15794);}};final FileInputStream input1 = new FileInputStream(
                "src/test/resources/org/apache/commons/io/abitmorethan16k.txt");
            __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1c00c00kylve1x6.R.inc(15795);}};final FileInputStream input2 = new FileInputStream(
                "src/test/resources/org/apache/commons/io/abitmorethan16kcopy.txt")) {
            __CLR4_4_1c00c00kylve1x6.R.inc(15796);assertTrue(IOUtils.contentEquals(input1, input1));
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testContentEquals_Reader_Reader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y85srxc6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testContentEquals_Reader_Reader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y85srxc6t() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(15797);
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15798);assertTrue(IOUtils.contentEquals((Reader) null, null));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15799);final StringReader input1 = new StringReader("");
            __CLR4_4_1c00c00kylve1x6.R.inc(15800);assertFalse(IOUtils.contentEquals(null, input1));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15801);final StringReader input1 = new StringReader("");
            __CLR4_4_1c00c00kylve1x6.R.inc(15802);assertFalse(IOUtils.contentEquals(input1, null));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15803);final StringReader input1 = new StringReader("");
            __CLR4_4_1c00c00kylve1x6.R.inc(15804);assertTrue(IOUtils.contentEquals(input1, input1));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15805);final StringReader input1 = new StringReader("ABC");
            __CLR4_4_1c00c00kylve1x6.R.inc(15806);assertTrue(IOUtils.contentEquals(input1, input1));
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(15807);assertTrue(IOUtils.contentEquals(new StringReader(""), new StringReader("")));
        __CLR4_4_1c00c00kylve1x6.R.inc(15808);assertTrue(
            IOUtils.contentEquals(new BufferedReader(new StringReader("")), new BufferedReader(new StringReader(""))));
        __CLR4_4_1c00c00kylve1x6.R.inc(15809);assertTrue(IOUtils.contentEquals(new StringReader("ABC"), new StringReader("ABC")));
        __CLR4_4_1c00c00kylve1x6.R.inc(15810);assertFalse(IOUtils.contentEquals(new StringReader("ABCD"), new StringReader("ABC")));
        __CLR4_4_1c00c00kylve1x6.R.inc(15811);assertFalse(IOUtils.contentEquals(new StringReader("ABC"), new StringReader("ABCD")));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testContentEqualsIgnoreEOL() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0on1rc78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testContentEqualsIgnoreEOL",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0on1rc78() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(15812);
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15813);assertTrue(IOUtils.contentEqualsIgnoreEOL((Reader) null, null));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15814);final Reader input1 = new CharArrayReader("".toCharArray());
            __CLR4_4_1c00c00kylve1x6.R.inc(15815);assertFalse(IOUtils.contentEqualsIgnoreEOL(null, input1));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15816);final Reader input1 = new CharArrayReader("".toCharArray());
            __CLR4_4_1c00c00kylve1x6.R.inc(15817);assertFalse(IOUtils.contentEqualsIgnoreEOL(input1, null));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15818);final Reader input1 = new CharArrayReader("".toCharArray());
            __CLR4_4_1c00c00kylve1x6.R.inc(15819);assertTrue(IOUtils.contentEqualsIgnoreEOL(input1, input1));
        }
        {
            __CLR4_4_1c00c00kylve1x6.R.inc(15820);final Reader input1 = new CharArrayReader("321\r\n".toCharArray());
            __CLR4_4_1c00c00kylve1x6.R.inc(15821);assertTrue(IOUtils.contentEqualsIgnoreEOL(input1, input1));
        }

        __CLR4_4_1c00c00kylve1x6.R.inc(15822);Reader r1;
        __CLR4_4_1c00c00kylve1x6.R.inc(15823);Reader r2;

        __CLR4_4_1c00c00kylve1x6.R.inc(15824);r1 = new CharArrayReader("".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15825);r2 = new CharArrayReader("".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15826);assertTrue(IOUtils.contentEqualsIgnoreEOL(r1, r2));

        __CLR4_4_1c00c00kylve1x6.R.inc(15827);r1 = new CharArrayReader("1".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15828);r2 = new CharArrayReader("1".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15829);assertTrue(IOUtils.contentEqualsIgnoreEOL(r1, r2));

        __CLR4_4_1c00c00kylve1x6.R.inc(15830);r1 = new CharArrayReader("1".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15831);r2 = new CharArrayReader("2".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15832);assertFalse(IOUtils.contentEqualsIgnoreEOL(r1, r2));

        __CLR4_4_1c00c00kylve1x6.R.inc(15833);r1 = new CharArrayReader("123\rabc".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15834);r2 = new CharArrayReader("123\nabc".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15835);assertTrue(IOUtils.contentEqualsIgnoreEOL(r1, r2));

        __CLR4_4_1c00c00kylve1x6.R.inc(15836);r1 = new CharArrayReader("321".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15837);r2 = new CharArrayReader("321\r\n".toCharArray());
        __CLR4_4_1c00c00kylve1x6.R.inc(15838);assertTrue(IOUtils.contentEqualsIgnoreEOL(r1, r2));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopy_ByteArray_OutputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxfe36c7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopy_ByteArray_OutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxfe36c7z() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(15839);
        __CLR4_4_1c00c00kylve1x6.R.inc(15840);final File destination = TestUtils.newFile(temporaryFolder, "copy8.txt");
        __CLR4_4_1c00c00kylve1x6.R.inc(15841);byte[] in;
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15842);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1c00c00kylve1x6.R.inc(15843);}};InputStream fin = Files.newInputStream(testFilePath)) {
            // Create our byte[]. Rely on testInputStreamToByteArray() to make sure this is valid.
            __CLR4_4_1c00c00kylve1x6.R.inc(15844);in = IOUtils.toByteArray(fin);
        }

        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15845);try (__CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_1c00c00kylve1x6.R.inc(15846);}};OutputStream fout = Files.newOutputStream(destination.toPath())) {
            __CLR4_4_1c00c00kylve1x6.R.inc(15847);CopyUtils.copy(in, fout);

            __CLR4_4_1c00c00kylve1x6.R.inc(15848);fout.flush();

            __CLR4_4_1c00c00kylve1x6.R.inc(15849);TestUtils.checkFile(destination, testFile);
            __CLR4_4_1c00c00kylve1x6.R.inc(15850);TestUtils.checkWrite(fout);
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(15851);TestUtils.deleteFile(destination);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopy_ByteArray_Writer() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tkchsc8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopy_ByteArray_Writer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tkchsc8c() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(15852);
        __CLR4_4_1c00c00kylve1x6.R.inc(15853);final File destination = TestUtils.newFile(temporaryFolder, "copy7.txt");
        __CLR4_4_1c00c00kylve1x6.R.inc(15854);byte[] in;
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15855);try (__CLR4_4_1$AC3 __CLR$ACI4=new __CLR4_4_1$AC3(){{__CLR4_4_1c00c00kylve1x6.R.inc(15856);}};InputStream fin = Files.newInputStream(testFilePath)) {
            // Create our byte[]. Rely on testInputStreamToByteArray() to make sure this is valid.
            __CLR4_4_1c00c00kylve1x6.R.inc(15857);in = IOUtils.toByteArray(fin);
        }

        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15858);try (__CLR4_4_1$AC4 __CLR$ACI5=new __CLR4_4_1$AC4(){{__CLR4_4_1c00c00kylve1x6.R.inc(15859);}};Writer fout = Files.newBufferedWriter(destination.toPath())) {
            __CLR4_4_1c00c00kylve1x6.R.inc(15860);CopyUtils.copy(in, fout);
            __CLR4_4_1c00c00kylve1x6.R.inc(15861);fout.flush();
            __CLR4_4_1c00c00kylve1x6.R.inc(15862);TestUtils.checkFile(destination, testFile);
            __CLR4_4_1c00c00kylve1x6.R.inc(15863);TestUtils.checkWrite(fout);
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(15864);TestUtils.deleteFile(destination);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopy_String_Writer() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mtsvkc8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopy_String_Writer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mtsvkc8p() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(15865);
        __CLR4_4_1c00c00kylve1x6.R.inc(15866);final File destination = TestUtils.newFile(temporaryFolder, "copy6.txt");
        __CLR4_4_1c00c00kylve1x6.R.inc(15867);String str;
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15868);try (__CLR4_4_1$AC5 __CLR$ACI6=new __CLR4_4_1$AC5(){{__CLR4_4_1c00c00kylve1x6.R.inc(15869);}};Reader fin = Files.newBufferedReader(testFilePath)) {
            // Create our String. Rely on testReaderToString() to make sure this is valid.
            __CLR4_4_1c00c00kylve1x6.R.inc(15870);str = IOUtils.toString(fin);
        }

        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15871);try (__CLR4_4_1$AC6 __CLR$ACI7=new __CLR4_4_1$AC6(){{__CLR4_4_1c00c00kylve1x6.R.inc(15872);}};Writer fout = Files.newBufferedWriter(destination.toPath())) {
            __CLR4_4_1c00c00kylve1x6.R.inc(15873);CopyUtils.copy(str, fout);
            __CLR4_4_1c00c00kylve1x6.R.inc(15874);fout.flush();

            __CLR4_4_1c00c00kylve1x6.R.inc(15875);TestUtils.checkFile(destination, testFile);
            __CLR4_4_1c00c00kylve1x6.R.inc(15876);TestUtils.checkWrite(fout);
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(15877);TestUtils.deleteFile(destination);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_CharExtraLength() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4yr98c92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_CharExtraLength",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4yr98c92() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15878);
        __CLR4_4_1c00c00kylve1x6.R.inc(15879);CharArrayReader is = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15880);CharArrayWriter os = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15881);try {
            // Create streams
            __CLR4_4_1c00c00kylve1x6.R.inc(15882);is = new CharArrayReader(carr);
            __CLR4_4_1c00c00kylve1x6.R.inc(15883);os = new CharArrayWriter();

            // Test our copy method
            // for extra length, it reads till EOF
            __CLR4_4_1c00c00kylve1x6.R.inc(15884);assertEquals(200, IOUtils.copyLarge(is, os, 0, 2000));
            __CLR4_4_1c00c00kylve1x6.R.inc(15885);final char[] oarr = os.toCharArray();

            // check that output length is correct
            __CLR4_4_1c00c00kylve1x6.R.inc(15886);assertEquals(200, oarr.length);
            // check that output data corresponds to input data
            __CLR4_4_1c00c00kylve1x6.R.inc(15887);assertEquals(1, oarr[1]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15888);assertEquals(79, oarr[79]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15889);assertEquals((char) -1, oarr[80]);

        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(15890);IOUtils.closeQuietly(is);
            __CLR4_4_1c00c00kylve1x6.R.inc(15891);IOUtils.closeQuietly(os);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_CharFullLength() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kaqhx9c9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_CharFullLength",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kaqhx9c9g() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15892);
        __CLR4_4_1c00c00kylve1x6.R.inc(15893);CharArrayReader is = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15894);CharArrayWriter os = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15895);try {
            // Create streams
            __CLR4_4_1c00c00kylve1x6.R.inc(15896);is = new CharArrayReader(carr);
            __CLR4_4_1c00c00kylve1x6.R.inc(15897);os = new CharArrayWriter();

            // Test our copy method
            __CLR4_4_1c00c00kylve1x6.R.inc(15898);assertEquals(200, IOUtils.copyLarge(is, os, 0, -1));
            __CLR4_4_1c00c00kylve1x6.R.inc(15899);final char[] oarr = os.toCharArray();

            // check that output length is correct
            __CLR4_4_1c00c00kylve1x6.R.inc(15900);assertEquals(200, oarr.length);
            // check that output data corresponds to input data
            __CLR4_4_1c00c00kylve1x6.R.inc(15901);assertEquals(1, oarr[1]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15902);assertEquals(79, oarr[79]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15903);assertEquals((char) -1, oarr[80]);

        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(15904);IOUtils.closeQuietly(is);
            __CLR4_4_1c00c00kylve1x6.R.inc(15905);IOUtils.closeQuietly(os);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_CharNoSkip() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gyafooc9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_CharNoSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gyafooc9u() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15906);
        __CLR4_4_1c00c00kylve1x6.R.inc(15907);CharArrayReader is = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15908);CharArrayWriter os = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15909);try {
            // Create streams
            __CLR4_4_1c00c00kylve1x6.R.inc(15910);is = new CharArrayReader(carr);
            __CLR4_4_1c00c00kylve1x6.R.inc(15911);os = new CharArrayWriter();

            // Test our copy method
            __CLR4_4_1c00c00kylve1x6.R.inc(15912);assertEquals(100, IOUtils.copyLarge(is, os, 0, 100));
            __CLR4_4_1c00c00kylve1x6.R.inc(15913);final char[] oarr = os.toCharArray();

            // check that output length is correct
            __CLR4_4_1c00c00kylve1x6.R.inc(15914);assertEquals(100, oarr.length);
            // check that output data corresponds to input data
            __CLR4_4_1c00c00kylve1x6.R.inc(15915);assertEquals(1, oarr[1]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15916);assertEquals(79, oarr[79]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15917);assertEquals((char) -1, oarr[80]);

        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(15918);IOUtils.closeQuietly(is);
            __CLR4_4_1c00c00kylve1x6.R.inc(15919);IOUtils.closeQuietly(os);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_CharSkip() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isi5evca8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_CharSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isi5evca8() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15920);
        __CLR4_4_1c00c00kylve1x6.R.inc(15921);CharArrayReader is = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15922);CharArrayWriter os = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15923);try {
            // Create streams
            __CLR4_4_1c00c00kylve1x6.R.inc(15924);is = new CharArrayReader(carr);
            __CLR4_4_1c00c00kylve1x6.R.inc(15925);os = new CharArrayWriter();

            // Test our copy method
            __CLR4_4_1c00c00kylve1x6.R.inc(15926);assertEquals(100, IOUtils.copyLarge(is, os, 10, 100));
            __CLR4_4_1c00c00kylve1x6.R.inc(15927);final char[] oarr = os.toCharArray();

            // check that output length is correct
            __CLR4_4_1c00c00kylve1x6.R.inc(15928);assertEquals(100, oarr.length);
            // check that output data corresponds to input data
            __CLR4_4_1c00c00kylve1x6.R.inc(15929);assertEquals(11, oarr[1]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15930);assertEquals(79, oarr[69]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15931);assertEquals((char) -1, oarr[70]);

        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(15932);IOUtils.closeQuietly(is);
            __CLR4_4_1c00c00kylve1x6.R.inc(15933);IOUtils.closeQuietly(os);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_CharSkipInvalid() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1il8hgicam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_CharSkipInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1il8hgicam(){try{__CLR4_4_1c00c00kylve1x6.R.inc(15934);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15935);try (__CLR4_4_1$AC7 __CLR$ACI8=new __CLR4_4_1$AC7(){{__CLR4_4_1c00c00kylve1x6.R.inc(15936);}};CharArrayReader is = new CharArrayReader(carr); __CLR4_4_1$AC7 __CLR$ACI9=new __CLR4_4_1$AC7(){{__CLR4_4_1c00c00kylve1x6.R.inc(15937);}};CharArrayWriter os = new CharArrayWriter()) {
            __CLR4_4_1c00c00kylve1x6.R.inc(15938);assertThrows(EOFException.class, () -> IOUtils.copyLarge(is, os, 1000, 100));
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_ExtraLength() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csp18ucar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_ExtraLength",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csp18ucar() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15939);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15940);try (__CLR4_4_1$AC8 __CLR$ACI10=new __CLR4_4_1$AC8(){{__CLR4_4_1c00c00kylve1x6.R.inc(15941);}};ByteArrayInputStream is = new ByteArrayInputStream(iarr);
            __CLR4_4_1$AC8 __CLR$ACI11=new __CLR4_4_1$AC8(){{__CLR4_4_1c00c00kylve1x6.R.inc(15942);}};ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            // Create streams

            // Test our copy method
            // for extra length, it reads till EOF
            __CLR4_4_1c00c00kylve1x6.R.inc(15943);assertEquals(200, IOUtils.copyLarge(is, os, 0, 2000));
            __CLR4_4_1c00c00kylve1x6.R.inc(15944);final byte[] oarr = os.toByteArray();

            // check that output length is correct
            __CLR4_4_1c00c00kylve1x6.R.inc(15945);assertEquals(200, oarr.length);
            // check that output data corresponds to input data
            __CLR4_4_1c00c00kylve1x6.R.inc(15946);assertEquals(1, oarr[1]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15947);assertEquals(79, oarr[79]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15948);assertEquals(-1, oarr[80]);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_FullLength() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rx0pdzcb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_FullLength",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rx0pdzcb1() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15949);
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15950);try (__CLR4_4_1$AC9 __CLR$ACI12=new __CLR4_4_1$AC9(){{__CLR4_4_1c00c00kylve1x6.R.inc(15951);}};ByteArrayInputStream is = new ByteArrayInputStream(iarr);
            __CLR4_4_1$AC9 __CLR$ACI13=new __CLR4_4_1$AC9(){{__CLR4_4_1c00c00kylve1x6.R.inc(15952);}};ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            // Test our copy method
            __CLR4_4_1c00c00kylve1x6.R.inc(15953);assertEquals(200, IOUtils.copyLarge(is, os, 0, -1));
            __CLR4_4_1c00c00kylve1x6.R.inc(15954);final byte[] oarr = os.toByteArray();

            // check that output length is correct
            __CLR4_4_1c00c00kylve1x6.R.inc(15955);assertEquals(200, oarr.length);
            // check that output data corresponds to input data
            __CLR4_4_1c00c00kylve1x6.R.inc(15956);assertEquals(1, oarr[1]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15957);assertEquals(79, oarr[79]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15958);assertEquals(-1, oarr[80]);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_NoSkip() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2opwycbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_NoSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2opwycbb() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15959);
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15960);try (__CLR4_4_1$AC10 __CLR$ACI14=new __CLR4_4_1$AC10(){{__CLR4_4_1c00c00kylve1x6.R.inc(15961);}};ByteArrayInputStream is = new ByteArrayInputStream(iarr);
            __CLR4_4_1$AC10 __CLR$ACI15=new __CLR4_4_1$AC10(){{__CLR4_4_1c00c00kylve1x6.R.inc(15962);}};ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            // Test our copy method
            __CLR4_4_1c00c00kylve1x6.R.inc(15963);assertEquals(100, IOUtils.copyLarge(is, os, 0, 100));
            __CLR4_4_1c00c00kylve1x6.R.inc(15964);final byte[] oarr = os.toByteArray();

            // check that output length is correct
            __CLR4_4_1c00c00kylve1x6.R.inc(15965);assertEquals(100, oarr.length);
            // check that output data corresponds to input data
            __CLR4_4_1c00c00kylve1x6.R.inc(15966);assertEquals(1, oarr[1]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15967);assertEquals(79, oarr[79]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15968);assertEquals(-1, oarr[80]);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_Skip() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ear8hdcbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_Skip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ear8hdcbl() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15969);
        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15970);try (__CLR4_4_1$AC11 __CLR$ACI16=new __CLR4_4_1$AC11(){{__CLR4_4_1c00c00kylve1x6.R.inc(15971);}};ByteArrayInputStream is = new ByteArrayInputStream(iarr);
            __CLR4_4_1$AC11 __CLR$ACI17=new __CLR4_4_1$AC11(){{__CLR4_4_1c00c00kylve1x6.R.inc(15972);}};ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            // Test our copy method
            __CLR4_4_1c00c00kylve1x6.R.inc(15973);assertEquals(100, IOUtils.copyLarge(is, os, 10, 100));
            __CLR4_4_1c00c00kylve1x6.R.inc(15974);final byte[] oarr = os.toByteArray();

            // check that output length is correct
            __CLR4_4_1c00c00kylve1x6.R.inc(15975);assertEquals(100, oarr.length);
            // check that output data corresponds to input data
            __CLR4_4_1c00c00kylve1x6.R.inc(15976);assertEquals(11, oarr[1]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15977);assertEquals(79, oarr[69]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15978);assertEquals(-1, oarr[70]);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_SkipInvalid() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14i7s0kcbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_SkipInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14i7s0kcbv() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15979);
        class __CLR4_4_1$AC12 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(15980);try (__CLR4_4_1$AC12 __CLR$ACI18=new __CLR4_4_1$AC12(){{__CLR4_4_1c00c00kylve1x6.R.inc(15981);}};ByteArrayInputStream is = new ByteArrayInputStream(iarr);
            __CLR4_4_1$AC12 __CLR$ACI19=new __CLR4_4_1$AC12(){{__CLR4_4_1c00c00kylve1x6.R.inc(15982);}};ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            // Test our copy method
            __CLR4_4_1c00c00kylve1x6.R.inc(15983);assertThrows(EOFException.class, () -> IOUtils.copyLarge(is, os, 1000, 100));
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testCopyLarge_SkipWithInvalidOffset() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rf8zjcc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testCopyLarge_SkipWithInvalidOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rf8zjcc0() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(15984);
        __CLR4_4_1c00c00kylve1x6.R.inc(15985);ByteArrayInputStream is = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15986);ByteArrayOutputStream os = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(15987);try {
            // Create streams
            __CLR4_4_1c00c00kylve1x6.R.inc(15988);is = new ByteArrayInputStream(iarr);
            __CLR4_4_1c00c00kylve1x6.R.inc(15989);os = new ByteArrayOutputStream();

            // Test our copy method
            __CLR4_4_1c00c00kylve1x6.R.inc(15990);assertEquals(100, IOUtils.copyLarge(is, os, -10, 100));
            __CLR4_4_1c00c00kylve1x6.R.inc(15991);final byte[] oarr = os.toByteArray();

            // check that output length is correct
            __CLR4_4_1c00c00kylve1x6.R.inc(15992);assertEquals(100, oarr.length);
            // check that output data corresponds to input data
            __CLR4_4_1c00c00kylve1x6.R.inc(15993);assertEquals(1, oarr[1]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15994);assertEquals(79, oarr[79]);
            __CLR4_4_1c00c00kylve1x6.R.inc(15995);assertEquals(-1, oarr[80]);

        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(15996);IOUtils.closeQuietly(is);
            __CLR4_4_1c00c00kylve1x6.R.inc(15997);IOUtils.closeQuietly(os);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testRead_ReadableByteChannel() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),15998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j2leytcce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testRead_ReadableByteChannel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),15998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j2leytcce() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(15998);
        __CLR4_4_1c00c00kylve1x6.R.inc(15999);final ByteBuffer buffer = ByteBuffer.allocate(FILE_SIZE);
        __CLR4_4_1c00c00kylve1x6.R.inc(16000);final FileInputStream fileInputStream = new FileInputStream(testFile);
        __CLR4_4_1c00c00kylve1x6.R.inc(16001);final FileChannel input = fileInputStream.getChannel();
        __CLR4_4_1c00c00kylve1x6.R.inc(16002);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16003);assertEquals(FILE_SIZE, IOUtils.read(input, buffer));
            __CLR4_4_1c00c00kylve1x6.R.inc(16004);assertEquals(0, IOUtils.read(input, buffer));
            __CLR4_4_1c00c00kylve1x6.R.inc(16005);assertEquals(0, buffer.remaining());
            __CLR4_4_1c00c00kylve1x6.R.inc(16006);assertEquals(0, input.read(buffer));
            __CLR4_4_1c00c00kylve1x6.R.inc(16007);buffer.clear();
            __CLR4_4_1c00c00kylve1x6.R.inc(16008);try {
                __CLR4_4_1c00c00kylve1x6.R.inc(16009);IOUtils.readFully(input, buffer);
                __CLR4_4_1c00c00kylve1x6.R.inc(16010);fail("Should have failed with EOFxception");
            } catch (final EOFException expected) {
                // expected
            }
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(16011);IOUtils.closeQuietly(input, fileInputStream);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testReadFully_InputStream__ReturnByteArray() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9b3mtccs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testReadFully_InputStream__ReturnByteArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9b3mtccs() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16012);
        __CLR4_4_1c00c00kylve1x6.R.inc(16013);final byte[] bytes = "abcd1234".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_1c00c00kylve1x6.R.inc(16014);final ByteArrayInputStream stream = new ByteArrayInputStream(bytes);

        __CLR4_4_1c00c00kylve1x6.R.inc(16015);final byte[] result = IOUtils.readFully(stream, bytes.length);

        __CLR4_4_1c00c00kylve1x6.R.inc(16016);IOUtils.closeQuietly(stream);

        __CLR4_4_1c00c00kylve1x6.R.inc(16017);assertEqualContent(result, bytes);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testReadFully_InputStream_ByteArray() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ixb5lyccy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testReadFully_InputStream_ByteArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ixb5lyccy() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16018);
        __CLR4_4_1c00c00kylve1x6.R.inc(16019);final int size = 1027;

        __CLR4_4_1c00c00kylve1x6.R.inc(16020);final byte[] buffer = new byte[size];

        __CLR4_4_1c00c00kylve1x6.R.inc(16021);final InputStream input = new ByteArrayInputStream(new byte[size]);
        __CLR4_4_1c00c00kylve1x6.R.inc(16022);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16023);IOUtils.readFully(input, buffer, 0, -1);
            __CLR4_4_1c00c00kylve1x6.R.inc(16024);fail("Should have failed with IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16025);IOUtils.readFully(input, buffer, 0, 0);
        __CLR4_4_1c00c00kylve1x6.R.inc(16026);IOUtils.readFully(input, buffer, 0, size - 1);
        __CLR4_4_1c00c00kylve1x6.R.inc(16027);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16028);IOUtils.readFully(input, buffer, 0, 2);
            __CLR4_4_1c00c00kylve1x6.R.inc(16029);fail("Should have failed with EOFxception");
        } catch (final EOFException expected) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16030);IOUtils.closeQuietly(input);

    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testReadFully_InputStream_Offset() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytlze4cdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testReadFully_InputStream_Offset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytlze4cdb() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16031);
        __CLR4_4_1c00c00kylve1x6.R.inc(16032);final byte[] bytes = "abcd1234".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_1c00c00kylve1x6.R.inc(16033);final ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
        __CLR4_4_1c00c00kylve1x6.R.inc(16034);final byte[] buffer = "wx00000000".getBytes(StandardCharsets.UTF_8);
        __CLR4_4_1c00c00kylve1x6.R.inc(16035);IOUtils.readFully(stream, buffer, 2, 8);
        __CLR4_4_1c00c00kylve1x6.R.inc(16036);assertEquals("wxabcd1234", new String(buffer, 0, buffer.length, StandardCharsets.UTF_8));
        __CLR4_4_1c00c00kylve1x6.R.inc(16037);IOUtils.closeQuietly(stream);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testReadFully_ReadableByteChannel() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzqyp7cdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testReadFully_ReadableByteChannel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzqyp7cdi() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16038);
        __CLR4_4_1c00c00kylve1x6.R.inc(16039);final ByteBuffer buffer = ByteBuffer.allocate(FILE_SIZE);
        __CLR4_4_1c00c00kylve1x6.R.inc(16040);final FileInputStream fileInputStream = new FileInputStream(testFile);
        __CLR4_4_1c00c00kylve1x6.R.inc(16041);final FileChannel input = fileInputStream.getChannel();
        __CLR4_4_1c00c00kylve1x6.R.inc(16042);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16043);IOUtils.readFully(input, buffer);
            __CLR4_4_1c00c00kylve1x6.R.inc(16044);assertEquals(FILE_SIZE, buffer.position());
            __CLR4_4_1c00c00kylve1x6.R.inc(16045);assertEquals(0, buffer.remaining());
            __CLR4_4_1c00c00kylve1x6.R.inc(16046);assertEquals(0, input.read(buffer));
            __CLR4_4_1c00c00kylve1x6.R.inc(16047);IOUtils.readFully(input, buffer);
            __CLR4_4_1c00c00kylve1x6.R.inc(16048);assertEquals(FILE_SIZE, buffer.position());
            __CLR4_4_1c00c00kylve1x6.R.inc(16049);assertEquals(0, buffer.remaining());
            __CLR4_4_1c00c00kylve1x6.R.inc(16050);assertEquals(0, input.read(buffer));
            __CLR4_4_1c00c00kylve1x6.R.inc(16051);IOUtils.readFully(input, buffer);
            __CLR4_4_1c00c00kylve1x6.R.inc(16052);buffer.clear();
            __CLR4_4_1c00c00kylve1x6.R.inc(16053);try {
                __CLR4_4_1c00c00kylve1x6.R.inc(16054);IOUtils.readFully(input, buffer);
                __CLR4_4_1c00c00kylve1x6.R.inc(16055);fail("Should have failed with EOFxception");
            } catch (final EOFException expected) {
                // expected
            }
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(16056);IOUtils.closeQuietly(input, fileInputStream);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testReadFully_Reader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6zm8pce1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testReadFully_Reader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6zm8pce1() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16057);
        __CLR4_4_1c00c00kylve1x6.R.inc(16058);final int size = 1027;

        __CLR4_4_1c00c00kylve1x6.R.inc(16059);final char[] buffer = new char[size];

        __CLR4_4_1c00c00kylve1x6.R.inc(16060);final Reader input = new CharArrayReader(new char[size]);
        __CLR4_4_1c00c00kylve1x6.R.inc(16061);IOUtils.readFully(input, buffer, 0, 0);
        __CLR4_4_1c00c00kylve1x6.R.inc(16062);IOUtils.readFully(input, buffer, 0, size - 3);
        __CLR4_4_1c00c00kylve1x6.R.inc(16063);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16064);IOUtils.readFully(input, buffer, 0, -1);
            __CLR4_4_1c00c00kylve1x6.R.inc(16065);fail("Should have failed with IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16066);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16067);IOUtils.readFully(input, buffer, 0, 5);
            __CLR4_4_1c00c00kylve1x6.R.inc(16068);fail("Should have failed with EOFException");
        } catch (final EOFException expected) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16069);IOUtils.closeQuietly(input);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testReadFully_Reader_Offset() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12hsnt3cee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testReadFully_Reader_Offset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12hsnt3cee() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16070);
        __CLR4_4_1c00c00kylve1x6.R.inc(16071);final Reader reader = new StringReader("abcd1234");
        __CLR4_4_1c00c00kylve1x6.R.inc(16072);final char[] buffer = "wx00000000".toCharArray();
        __CLR4_4_1c00c00kylve1x6.R.inc(16073);IOUtils.readFully(reader, buffer, 2, 8);
        __CLR4_4_1c00c00kylve1x6.R.inc(16074);assertEquals("wxabcd1234", new String(buffer));
        __CLR4_4_1c00c00kylve1x6.R.inc(16075);IOUtils.closeQuietly(reader);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testReadLines_InputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133fy6vcek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testReadLines_InputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133fy6vcek() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16076);
        __CLR4_4_1c00c00kylve1x6.R.inc(16077);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_1c00c00kylve1x6.R.inc(16078);InputStream in = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(16079);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16080);final String[] data = {"hello", "world", "", "this is", "some text"};
            __CLR4_4_1c00c00kylve1x6.R.inc(16081);TestUtils.createLineBasedFile(file, data);

            __CLR4_4_1c00c00kylve1x6.R.inc(16082);in = Files.newInputStream(file.toPath());
            __CLR4_4_1c00c00kylve1x6.R.inc(16083);final List<String> lines = IOUtils.readLines(in);
            __CLR4_4_1c00c00kylve1x6.R.inc(16084);assertEquals(Arrays.asList(data), lines);
            __CLR4_4_1c00c00kylve1x6.R.inc(16085);assertEquals(-1, in.read());
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(16086);IOUtils.closeQuietly(in);
            __CLR4_4_1c00c00kylve1x6.R.inc(16087);TestUtils.deleteFile(file);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testReadLines_InputStream_String() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k3b71xcew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testReadLines_InputStream_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k3b71xcew() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16088);
        __CLR4_4_1c00c00kylve1x6.R.inc(16089);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_1c00c00kylve1x6.R.inc(16090);InputStream in = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(16091);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16092);final String[] data = {"hello", "/u1234", "", "this is", "some text"};
            __CLR4_4_1c00c00kylve1x6.R.inc(16093);TestUtils.createLineBasedFile(file, data);

            __CLR4_4_1c00c00kylve1x6.R.inc(16094);in = Files.newInputStream(file.toPath());
            __CLR4_4_1c00c00kylve1x6.R.inc(16095);final List<String> lines = IOUtils.readLines(in, "UTF-8");
            __CLR4_4_1c00c00kylve1x6.R.inc(16096);assertEquals(Arrays.asList(data), lines);
            __CLR4_4_1c00c00kylve1x6.R.inc(16097);assertEquals(-1, in.read());
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(16098);IOUtils.closeQuietly(in);
            __CLR4_4_1c00c00kylve1x6.R.inc(16099);TestUtils.deleteFile(file);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testReadLines_Reader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12irw4ycf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testReadLines_Reader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12irw4ycf8() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16100);
        __CLR4_4_1c00c00kylve1x6.R.inc(16101);final File file = TestUtils.newFile(temporaryFolder, "lines.txt");
        __CLR4_4_1c00c00kylve1x6.R.inc(16102);Reader in = null;
        __CLR4_4_1c00c00kylve1x6.R.inc(16103);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16104);final String[] data = {"hello", "/u1234", "", "this is", "some text"};
            __CLR4_4_1c00c00kylve1x6.R.inc(16105);TestUtils.createLineBasedFile(file, data);

            __CLR4_4_1c00c00kylve1x6.R.inc(16106);in = new InputStreamReader(Files.newInputStream(file.toPath()));
            __CLR4_4_1c00c00kylve1x6.R.inc(16107);final List<String> lines = IOUtils.readLines(in);
            __CLR4_4_1c00c00kylve1x6.R.inc(16108);assertEquals(Arrays.asList(data), lines);
            __CLR4_4_1c00c00kylve1x6.R.inc(16109);assertEquals(-1, in.read());
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(16110);IOUtils.closeQuietly(in);
            __CLR4_4_1c00c00kylve1x6.R.inc(16111);TestUtils.deleteFile(file);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToByteArray_ExistingResourceAtRootPackage() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knbn9mcfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToByteArray_ExistingResourceAtRootPackage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knbn9mcfk() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16112);
        __CLR4_4_1c00c00kylve1x6.R.inc(16113);final long fileSize = TestResources.getFile("test-file-utf8.bin").length();
        __CLR4_4_1c00c00kylve1x6.R.inc(16114);final byte[] bytes = IOUtils.resourceToByteArray("/org/apache/commons/io/test-file-utf8.bin");
        __CLR4_4_1c00c00kylve1x6.R.inc(16115);assertNotNull(bytes);
        __CLR4_4_1c00c00kylve1x6.R.inc(16116);assertEquals(fileSize, bytes.length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToByteArray_ExistingResourceAtRootPackage_WithClassLoader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9lgv8cfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToByteArray_ExistingResourceAtRootPackage_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9lgv8cfp() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16117);
        __CLR4_4_1c00c00kylve1x6.R.inc(16118);final long fileSize = TestResources.getFile("test-file-utf8.bin").length();
        __CLR4_4_1c00c00kylve1x6.R.inc(16119);final byte[] bytes = IOUtils.resourceToByteArray("org/apache/commons/io/test-file-utf8.bin",
            ClassLoader.getSystemClassLoader());
        __CLR4_4_1c00c00kylve1x6.R.inc(16120);assertNotNull(bytes);
        __CLR4_4_1c00c00kylve1x6.R.inc(16121);assertEquals(fileSize, bytes.length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToByteArray_ExistingResourceAtSubPackage() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12fxva6cfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToByteArray_ExistingResourceAtSubPackage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12fxva6cfu() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16122);
        __CLR4_4_1c00c00kylve1x6.R.inc(16123);final long fileSize = TestResources.getFile("FileUtilsTestDataCR.dat").length();
        __CLR4_4_1c00c00kylve1x6.R.inc(16124);final byte[] bytes = IOUtils.resourceToByteArray("/org/apache/commons/io/FileUtilsTestDataCR.dat");
        __CLR4_4_1c00c00kylve1x6.R.inc(16125);assertNotNull(bytes);
        __CLR4_4_1c00c00kylve1x6.R.inc(16126);assertEquals(fileSize, bytes.length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToByteArray_ExistingResourceAtSubPackage_WithClassLoader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abf260cfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToByteArray_ExistingResourceAtSubPackage_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abf260cfz() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16127);
        __CLR4_4_1c00c00kylve1x6.R.inc(16128);final long fileSize = TestResources.getFile("FileUtilsTestDataCR.dat").length();
        __CLR4_4_1c00c00kylve1x6.R.inc(16129);final byte[] bytes = IOUtils.resourceToByteArray("org/apache/commons/io/FileUtilsTestDataCR.dat",
            ClassLoader.getSystemClassLoader());
        __CLR4_4_1c00c00kylve1x6.R.inc(16130);assertNotNull(bytes);
        __CLR4_4_1c00c00kylve1x6.R.inc(16131);assertEquals(fileSize, bytes.length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToByteArray_NonExistingResource() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dsiow4cg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToByteArray_NonExistingResource",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dsiow4cg4(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16132);
        __CLR4_4_1c00c00kylve1x6.R.inc(16133);assertThrows(IOException.class, () -> IOUtils.resourceToByteArray("/non-existing-file.bin"));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToByteArray_NonExistingResource_WithClassLoader() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9zs6icg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToByteArray_NonExistingResource_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9zs6icg6(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16134);
        __CLR4_4_1c00c00kylve1x6.R.inc(16135);assertThrows(IOException.class,
            () -> IOUtils.resourceToByteArray("non-existing-file.bin", ClassLoader.getSystemClassLoader()));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToByteArray_Null() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bclqq1cg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToByteArray_Null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bclqq1cg8(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16136);
        __CLR4_4_1c00c00kylve1x6.R.inc(16137);assertThrows(NullPointerException.class, () -> IOUtils.resourceToByteArray(null));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToByteArray_Null_WithClassLoader() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19u36rcga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToByteArray_Null_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19u36rcga(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16138);
        __CLR4_4_1c00c00kylve1x6.R.inc(16139);assertThrows(NullPointerException.class,
            () -> IOUtils.resourceToByteArray(null, ClassLoader.getSystemClassLoader()));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToString_ExistingResourceAtRootPackage() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwcm1gcgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_ExistingResourceAtRootPackage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwcm1gcgc() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16140);
        __CLR4_4_1c00c00kylve1x6.R.inc(16141);final long fileSize = TestResources.getFile("test-file-simple-utf8.bin").length();
        __CLR4_4_1c00c00kylve1x6.R.inc(16142);final String content = IOUtils.resourceToString("/org/apache/commons/io/test-file-simple-utf8.bin",
            StandardCharsets.UTF_8);

        __CLR4_4_1c00c00kylve1x6.R.inc(16143);assertNotNull(content);
        __CLR4_4_1c00c00kylve1x6.R.inc(16144);assertEquals(fileSize, content.getBytes().length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToString_ExistingResourceAtRootPackage_WithClassLoader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19aeiemcgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_ExistingResourceAtRootPackage_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19aeiemcgh() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16145);
        __CLR4_4_1c00c00kylve1x6.R.inc(16146);final long fileSize = TestResources.getFile("test-file-simple-utf8.bin").length();
        __CLR4_4_1c00c00kylve1x6.R.inc(16147);final String content = IOUtils.resourceToString("org/apache/commons/io/test-file-simple-utf8.bin",
            StandardCharsets.UTF_8, ClassLoader.getSystemClassLoader());

        __CLR4_4_1c00c00kylve1x6.R.inc(16148);assertNotNull(content);
        __CLR4_4_1c00c00kylve1x6.R.inc(16149);assertEquals(fileSize, content.getBytes().length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToString_ExistingResourceAtSubPackage() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f6f6ccgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_ExistingResourceAtSubPackage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f6f6ccgm() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16150);
        __CLR4_4_1c00c00kylve1x6.R.inc(16151);final long fileSize = TestResources.getFile("FileUtilsTestDataCR.dat").length();
        __CLR4_4_1c00c00kylve1x6.R.inc(16152);final String content = IOUtils.resourceToString("/org/apache/commons/io/FileUtilsTestDataCR.dat",
            StandardCharsets.UTF_8);

        __CLR4_4_1c00c00kylve1x6.R.inc(16153);assertNotNull(content);
        __CLR4_4_1c00c00kylve1x6.R.inc(16154);assertEquals(fileSize, content.getBytes().length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    // Tests from IO-305

    @Test
    public void testResourceToString_ExistingResourceAtSubPackage_WithClassLoader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whly7icgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_ExistingResourceAtSubPackage_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whly7icgr() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16155);
        __CLR4_4_1c00c00kylve1x6.R.inc(16156);final long fileSize = TestResources.getFile("FileUtilsTestDataCR.dat").length();
        __CLR4_4_1c00c00kylve1x6.R.inc(16157);final String content = IOUtils.resourceToString("org/apache/commons/io/FileUtilsTestDataCR.dat",
            StandardCharsets.UTF_8, ClassLoader.getSystemClassLoader());

        __CLR4_4_1c00c00kylve1x6.R.inc(16158);assertNotNull(content);
        __CLR4_4_1c00c00kylve1x6.R.inc(16159);assertEquals(fileSize, content.getBytes().length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToString_NonExistingResource() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hvat4qcgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_NonExistingResource",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hvat4qcgw(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16160);
        __CLR4_4_1c00c00kylve1x6.R.inc(16161);assertThrows(IOException.class,
            () -> IOUtils.resourceToString("/non-existing-file.bin", StandardCharsets.UTF_8));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToString_NonExistingResource_WithClassLoader() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150hiowcgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_NonExistingResource_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150hiowcgy(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16162);
        __CLR4_4_1c00c00kylve1x6.R.inc(16163);assertThrows(IOException.class, () -> IOUtils.resourceToString("non-existing-file.bin", StandardCharsets.UTF_8,
            ClassLoader.getSystemClassLoader()));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @SuppressWarnings("squid:S2699") // Suppress "Add at least one assertion to this test case"
    @Test
    public void testResourceToString_NullCharset() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgu2plch0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_NullCharset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgu2plch0() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16164);
        __CLR4_4_1c00c00kylve1x6.R.inc(16165);IOUtils.resourceToString("/org/apache/commons/io//test-file-utf8.bin", null);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @SuppressWarnings("squid:S2699") // Suppress "Add at least one assertion to this test case"
    @Test
    public void testResourceToString_NullCharset_WithClassLoader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ja55ghch2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_NullCharset_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ja55ghch2() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16166);
        __CLR4_4_1c00c00kylve1x6.R.inc(16167);IOUtils.resourceToString("org/apache/commons/io/test-file-utf8.bin", null, ClassLoader.getSystemClassLoader());
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToString_NullResource() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m43zu7ch4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_NullResource",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m43zu7ch4(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16168);
        __CLR4_4_1c00c00kylve1x6.R.inc(16169);assertThrows(NullPointerException.class, () -> IOUtils.resourceToString(null, StandardCharsets.UTF_8));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToString_NullResource_WithClassLoader() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g45xpnch6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToString_NullResource_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g45xpnch6(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16170);
        __CLR4_4_1c00c00kylve1x6.R.inc(16171);assertThrows(NullPointerException.class,
            () -> IOUtils.resourceToString(null, StandardCharsets.UTF_8, ClassLoader.getSystemClassLoader()));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToURL_ExistingResourceAtRootPackage() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dz2pjgch8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToURL_ExistingResourceAtRootPackage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dz2pjgch8() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16172);
        __CLR4_4_1c00c00kylve1x6.R.inc(16173);final URL url = IOUtils.resourceToURL("/org/apache/commons/io/test-file-utf8.bin");
        __CLR4_4_1c00c00kylve1x6.R.inc(16174);assertNotNull(url);
        __CLR4_4_1c00c00kylve1x6.R.inc(16175);assertTrue(url.getFile().endsWith("/test-file-utf8.bin"));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToURL_ExistingResourceAtRootPackage_WithClassLoader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewsu1mchc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToURL_ExistingResourceAtRootPackage_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewsu1mchc() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16176);
        __CLR4_4_1c00c00kylve1x6.R.inc(16177);final URL url = IOUtils.resourceToURL("org/apache/commons/io/test-file-utf8.bin",
            ClassLoader.getSystemClassLoader());
        __CLR4_4_1c00c00kylve1x6.R.inc(16178);assertNotNull(url);
        __CLR4_4_1c00c00kylve1x6.R.inc(16179);assertTrue(url.getFile().endsWith("/org/apache/commons/io/test-file-utf8.bin"));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToURL_ExistingResourceAtSubPackage() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3pj38chg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToURL_ExistingResourceAtSubPackage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3pj38chg() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16180);
        __CLR4_4_1c00c00kylve1x6.R.inc(16181);final URL url = IOUtils.resourceToURL("/org/apache/commons/io/FileUtilsTestDataCR.dat");
        __CLR4_4_1c00c00kylve1x6.R.inc(16182);assertNotNull(url);
        __CLR4_4_1c00c00kylve1x6.R.inc(16183);assertTrue(url.getFile().endsWith("/org/apache/commons/io/FileUtilsTestDataCR.dat"));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToURL_ExistingResourceAtSubPackage_WithClassLoader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hykxfachk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToURL_ExistingResourceAtSubPackage_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hykxfachk() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16184);
        __CLR4_4_1c00c00kylve1x6.R.inc(16185);final URL url = IOUtils.resourceToURL("org/apache/commons/io/FileUtilsTestDataCR.dat",
            ClassLoader.getSystemClassLoader());

        __CLR4_4_1c00c00kylve1x6.R.inc(16186);assertNotNull(url);
        __CLR4_4_1c00c00kylve1x6.R.inc(16187);assertTrue(url.getFile().endsWith("/org/apache/commons/io/FileUtilsTestDataCR.dat"));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToURL_NonExistingResource() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rwvd8icho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToURL_NonExistingResource",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rwvd8icho(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16188);
        __CLR4_4_1c00c00kylve1x6.R.inc(16189);assertThrows(IOException.class, () -> IOUtils.resourceToURL("/non-existing-file.bin"));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToURL_NonExistingResource_WithClassLoader() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yhj1kchq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToURL_NonExistingResource_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yhj1kchq(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16190);
        __CLR4_4_1c00c00kylve1x6.R.inc(16191);assertThrows(IOException.class,
            () -> IOUtils.resourceToURL("non-existing-file.bin", ClassLoader.getSystemClassLoader()));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToURL_Null() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oi0h6vchs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToURL_Null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oi0h6vchs(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16192);
        __CLR4_4_1c00c00kylve1x6.R.inc(16193);assertThrows(NullPointerException.class, () -> IOUtils.resourceToURL(null));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testResourceToURL_Null_WithClassLoader() {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1baejmnchu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testResourceToURL_Null_WithClassLoader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1baejmnchu(){try{__CLR4_4_1c00c00kylve1x6.R.inc(16194);
        __CLR4_4_1c00c00kylve1x6.R.inc(16195);assertThrows(NullPointerException.class, () -> IOUtils.resourceToURL(null, ClassLoader.getSystemClassLoader()));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testSkip_FileReader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mil91ochw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testSkip_FileReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mil91ochw() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16196);
        class __CLR4_4_1$AC13 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16197);try (__CLR4_4_1$AC13 __CLR$ACI20=new __CLR4_4_1$AC13(){{__CLR4_4_1c00c00kylve1x6.R.inc(16198);}};Reader in = Files.newBufferedReader(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16199);assertEquals(FILE_SIZE - 10, IOUtils.skip(in, FILE_SIZE - 10));
            __CLR4_4_1c00c00kylve1x6.R.inc(16200);assertEquals(10, IOUtils.skip(in, 20));
            __CLR4_4_1c00c00kylve1x6.R.inc(16201);assertEquals(0, IOUtils.skip(in, 10));
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testSkip_InputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151032bci2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testSkip_InputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151032bci2() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16202);
        class __CLR4_4_1$AC14 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16203);try (__CLR4_4_1$AC14 __CLR$ACI21=new __CLR4_4_1$AC14(){{__CLR4_4_1c00c00kylve1x6.R.inc(16204);}};InputStream in = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16205);assertEquals(FILE_SIZE - 10, IOUtils.skip(in, FILE_SIZE - 10));
            __CLR4_4_1c00c00kylve1x6.R.inc(16206);assertEquals(10, IOUtils.skip(in, 20));
            __CLR4_4_1c00c00kylve1x6.R.inc(16207);assertEquals(0, IOUtils.skip(in, 10));
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testSkip_ReadableByteChannel() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ps5umcci8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testSkip_ReadableByteChannel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ps5umcci8() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16208);
        __CLR4_4_1c00c00kylve1x6.R.inc(16209);final FileInputStream fileInputStream = new FileInputStream(testFile);
        __CLR4_4_1c00c00kylve1x6.R.inc(16210);final FileChannel fileChannel = fileInputStream.getChannel();
        __CLR4_4_1c00c00kylve1x6.R.inc(16211);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16212);assertEquals(FILE_SIZE - 10, IOUtils.skip(fileChannel, FILE_SIZE - 10));
            __CLR4_4_1c00c00kylve1x6.R.inc(16213);assertEquals(10, IOUtils.skip(fileChannel, 20));
            __CLR4_4_1c00c00kylve1x6.R.inc(16214);assertEquals(0, IOUtils.skip(fileChannel, 10));
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(16215);IOUtils.closeQuietly(fileChannel, fileInputStream);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testSkipFully_InputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxz3vvcig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testSkipFully_InputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxz3vvcig() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16216);
        __CLR4_4_1c00c00kylve1x6.R.inc(16217);final int size = 1027;

        __CLR4_4_1c00c00kylve1x6.R.inc(16218);final InputStream input = new ByteArrayInputStream(new byte[size]);
        __CLR4_4_1c00c00kylve1x6.R.inc(16219);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16220);IOUtils.skipFully(input, -1);
            __CLR4_4_1c00c00kylve1x6.R.inc(16221);fail("Should have failed with IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16222);IOUtils.skipFully(input, 0);
        __CLR4_4_1c00c00kylve1x6.R.inc(16223);IOUtils.skipFully(input, size - 1);
        __CLR4_4_1c00c00kylve1x6.R.inc(16224);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16225);IOUtils.skipFully(input, 2);
            __CLR4_4_1c00c00kylve1x6.R.inc(16226);fail("Should have failed with IOException");
        } catch (final IOException expected) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16227);IOUtils.closeQuietly(input);

    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testSkipFully_ReadableByteChannel() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m4amngcis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testSkipFully_ReadableByteChannel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m4amngcis() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16228);
        __CLR4_4_1c00c00kylve1x6.R.inc(16229);final FileInputStream fileInputStream = new FileInputStream(testFile);
        __CLR4_4_1c00c00kylve1x6.R.inc(16230);final FileChannel fileChannel = fileInputStream.getChannel();
        __CLR4_4_1c00c00kylve1x6.R.inc(16231);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16232);try {
                __CLR4_4_1c00c00kylve1x6.R.inc(16233);IOUtils.skipFully(fileChannel, -1);
                __CLR4_4_1c00c00kylve1x6.R.inc(16234);fail("Should have failed with IllegalArgumentException");
            } catch (final IllegalArgumentException expected) {
                // expected
            }
            __CLR4_4_1c00c00kylve1x6.R.inc(16235);IOUtils.skipFully(fileChannel, 0);
            __CLR4_4_1c00c00kylve1x6.R.inc(16236);IOUtils.skipFully(fileChannel, FILE_SIZE - 1);
            __CLR4_4_1c00c00kylve1x6.R.inc(16237);try {
                __CLR4_4_1c00c00kylve1x6.R.inc(16238);IOUtils.skipFully(fileChannel, 2);
                __CLR4_4_1c00c00kylve1x6.R.inc(16239);fail("Should have failed with IOException");
            } catch (final IOException expected) {
                // expected
            }
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(16240);IOUtils.closeQuietly(fileChannel, fileInputStream);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testSkipFully_Reader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjagi8cj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testSkipFully_Reader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjagi8cj5() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16241);
        __CLR4_4_1c00c00kylve1x6.R.inc(16242);final int size = 1027;

        __CLR4_4_1c00c00kylve1x6.R.inc(16243);final Reader input = new CharArrayReader(new char[size]);
        __CLR4_4_1c00c00kylve1x6.R.inc(16244);IOUtils.skipFully(input, 0);
        __CLR4_4_1c00c00kylve1x6.R.inc(16245);IOUtils.skipFully(input, size - 3);
        __CLR4_4_1c00c00kylve1x6.R.inc(16246);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16247);IOUtils.skipFully(input, -1);
            __CLR4_4_1c00c00kylve1x6.R.inc(16248);fail("Should have failed with IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16249);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16250);IOUtils.skipFully(input, 5);
            __CLR4_4_1c00c00kylve1x6.R.inc(16251);fail("Should have failed with IOException");
        } catch (final IOException expected) {
            // expected
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16252);IOUtils.closeQuietly(input);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testStringToOutputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_172qyrecjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testStringToOutputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_172qyrecjh() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16253);
        __CLR4_4_1c00c00kylve1x6.R.inc(16254);final File destination = TestUtils.newFile(temporaryFolder, "copy5.txt");
        __CLR4_4_1c00c00kylve1x6.R.inc(16255);String str;
        class __CLR4_4_1$AC15 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16256);try (__CLR4_4_1$AC15 __CLR$ACI22=new __CLR4_4_1$AC15(){{__CLR4_4_1c00c00kylve1x6.R.inc(16257);}};Reader fin = Files.newBufferedReader(testFilePath)) {
            // Create our String. Rely on testReaderToString() to make sure this is valid.
            __CLR4_4_1c00c00kylve1x6.R.inc(16258);str = IOUtils.toString(fin);
        }

        class __CLR4_4_1$AC16 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16259);try (__CLR4_4_1$AC16 __CLR$ACI23=new __CLR4_4_1$AC16(){{__CLR4_4_1c00c00kylve1x6.R.inc(16260);}};OutputStream fout = Files.newOutputStream(destination.toPath())) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16261);CopyUtils.copy(str, fout);
            // Note: this method *does* flush. It is equivalent to:
            // OutputStreamWriter _out = new OutputStreamWriter(fout);
            // CopyUtils.copy( str, _out, 4096 ); // copy( Reader, Writer, int );
            // _out.flush();
            // out = fout;
            // note: we don't flush here; this IOUtils method does it for us

            __CLR4_4_1c00c00kylve1x6.R.inc(16262);TestUtils.checkFile(destination, testFile);
            __CLR4_4_1c00c00kylve1x6.R.inc(16263);TestUtils.checkWrite(fout);
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16264);TestUtils.deleteFile(destination);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToBufferedInputStream_InputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_188360gcjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToBufferedInputStream_InputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_188360gcjt() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16265);
        class __CLR4_4_1$AC17 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16266);try (__CLR4_4_1$AC17 __CLR$ACI24=new __CLR4_4_1$AC17(){{__CLR4_4_1c00c00kylve1x6.R.inc(16267);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16268);final InputStream in = IOUtils.toBufferedInputStream(fin);
            __CLR4_4_1c00c00kylve1x6.R.inc(16269);final byte[] out = IOUtils.toByteArray(in);
            __CLR4_4_1c00c00kylve1x6.R.inc(16270);assertNotNull(out);
            __CLR4_4_1c00c00kylve1x6.R.inc(16271);assertEquals(0, fin.available(), "Not all bytes were read");
            __CLR4_4_1c00c00kylve1x6.R.inc(16272);assertEquals(FILE_SIZE, out.length, "Wrong output size");
            __CLR4_4_1c00c00kylve1x6.R.inc(16273);TestUtils.assertEqualContent(out, testFile);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToBufferedInputStreamWithBufferSize_InputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6lsk7ck2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToBufferedInputStreamWithBufferSize_InputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6lsk7ck2() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16274);
        class __CLR4_4_1$AC18 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16275);try (__CLR4_4_1$AC18 __CLR$ACI25=new __CLR4_4_1$AC18(){{__CLR4_4_1c00c00kylve1x6.R.inc(16276);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16277);final InputStream in = IOUtils.toBufferedInputStream(fin, 2048);
            __CLR4_4_1c00c00kylve1x6.R.inc(16278);final byte[] out = IOUtils.toByteArray(in);
            __CLR4_4_1c00c00kylve1x6.R.inc(16279);assertNotNull(out);
            __CLR4_4_1c00c00kylve1x6.R.inc(16280);assertEquals(0, fin.available(), "Not all bytes were read");
            __CLR4_4_1c00c00kylve1x6.R.inc(16281);assertEquals(FILE_SIZE, out.length, "Wrong output size");
            __CLR4_4_1c00c00kylve1x6.R.inc(16282);TestUtils.assertEqualContent(out, testFile);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_InputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1sjuyckb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_InputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1sjuyckb() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16283);
        class __CLR4_4_1$AC19 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16284);try (__CLR4_4_1$AC19 __CLR$ACI26=new __CLR4_4_1$AC19(){{__CLR4_4_1c00c00kylve1x6.R.inc(16285);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16286);final byte[] out = IOUtils.toByteArray(fin);
            __CLR4_4_1c00c00kylve1x6.R.inc(16287);assertNotNull(out);
            __CLR4_4_1c00c00kylve1x6.R.inc(16288);assertEquals(0, fin.available(), "Not all bytes were read");
            __CLR4_4_1c00c00kylve1x6.R.inc(16289);assertEquals(FILE_SIZE, out.length, "Wrong output size");
            __CLR4_4_1c00c00kylve1x6.R.inc(16290);TestUtils.assertEqualContent(out, testFile);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    @Disabled("Disable by default as it uses too much memory and can cause builds to fail.")
    public void testToByteArray_InputStream_LongerThanIntegerMaxValue() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nm9ewckj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_InputStream_LongerThanIntegerMaxValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nm9ewckj() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16291);
        __CLR4_4_1c00c00kylve1x6.R.inc(16292);final CircularInputStream cin = new CircularInputStream(IOUtils.byteArray(), Integer.MAX_VALUE + 1L);
        __CLR4_4_1c00c00kylve1x6.R.inc(16293);assertThrows(IllegalArgumentException.class, () -> IOUtils.toByteArray(cin));
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_InputStream_NegativeSize() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i507nckm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_InputStream_NegativeSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i507nckm() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16294);

        class __CLR4_4_1$AC20 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16295);try (__CLR4_4_1$AC20 __CLR$ACI27=new __CLR4_4_1$AC20(){{__CLR4_4_1c00c00kylve1x6.R.inc(16296);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16297);IOUtils.toByteArray(fin, -1);
            __CLR4_4_1c00c00kylve1x6.R.inc(16298);fail("IllegalArgumentException expected");
        } catch (final IllegalArgumentException exc) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16299);assertTrue(exc.getMessage().startsWith("Size must be equal or greater than zero"),
                "Exception message does not start with \"Size must be equal or greater than zero\"");
        }

    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_InputStream_Size() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11267w8cks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_InputStream_Size",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11267w8cks() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16300);
        class __CLR4_4_1$AC21 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16301);try (__CLR4_4_1$AC21 __CLR$ACI28=new __CLR4_4_1$AC21(){{__CLR4_4_1c00c00kylve1x6.R.inc(16302);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16303);final byte[] out = IOUtils.toByteArray(fin, testFile.length());
            __CLR4_4_1c00c00kylve1x6.R.inc(16304);assertNotNull(out);
            __CLR4_4_1c00c00kylve1x6.R.inc(16305);assertEquals(0, fin.available(), "Not all bytes were read");
            __CLR4_4_1c00c00kylve1x6.R.inc(16306);assertEquals(FILE_SIZE, out.length, "Wrong output size: out.length=" + out.length + "!=" + FILE_SIZE);
            __CLR4_4_1c00c00kylve1x6.R.inc(16307);TestUtils.assertEqualContent(out, testFile);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_InputStream_SizeIllegal() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14rdg1gcl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_InputStream_SizeIllegal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14rdg1gcl0() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16308);

        class __CLR4_4_1$AC22 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16309);try (__CLR4_4_1$AC22 __CLR$ACI29=new __CLR4_4_1$AC22(){{__CLR4_4_1c00c00kylve1x6.R.inc(16310);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16311);IOUtils.toByteArray(fin, testFile.length() + 1);
            __CLR4_4_1c00c00kylve1x6.R.inc(16312);fail("IOException expected");
        } catch (final IOException exc) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16313);assertTrue(exc.getMessage().startsWith("Unexpected read size"),
                "Exception message does not start with \"Unexpected read size\"");
        }

    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_InputStream_SizeLong() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lewu0ccl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_InputStream_SizeLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lewu0ccl6() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16314);

        class __CLR4_4_1$AC23 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16315);try (__CLR4_4_1$AC23 __CLR$ACI30=new __CLR4_4_1$AC23(){{__CLR4_4_1c00c00kylve1x6.R.inc(16316);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16317);IOUtils.toByteArray(fin, (long) Integer.MAX_VALUE + 1);
            __CLR4_4_1c00c00kylve1x6.R.inc(16318);fail("IOException expected");
        } catch (final IllegalArgumentException exc) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16319);assertTrue(exc.getMessage().startsWith("Size cannot be greater than Integer max value"),
                "Exception message does not start with \"Size cannot be greater than Integer max value\"");
        }

    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_InputStream_SizeZero() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cppvkclc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_InputStream_SizeZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cppvkclc() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16320);

        class __CLR4_4_1$AC24 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16321);try (__CLR4_4_1$AC24 __CLR$ACI31=new __CLR4_4_1$AC24(){{__CLR4_4_1c00c00kylve1x6.R.inc(16322);}};InputStream fin =Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16323);final byte[] out = IOUtils.toByteArray(fin, 0);
            __CLR4_4_1c00c00kylve1x6.R.inc(16324);assertNotNull(out, "Out cannot be null");
            __CLR4_4_1c00c00kylve1x6.R.inc(16325);assertEquals(0, out.length, "Out length must be 0");
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_InputStream_SizeOne() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yowwzgcli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_InputStream_SizeOne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yowwzgcli() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16326);

        class __CLR4_4_1$AC25 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16327);try (__CLR4_4_1$AC25 __CLR$ACI32=new __CLR4_4_1$AC25(){{__CLR4_4_1c00c00kylve1x6.R.inc(16328);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16329);final byte[] out = IOUtils.toByteArray(fin, 1);
            __CLR4_4_1c00c00kylve1x6.R.inc(16330);assertNotNull(out, "Out cannot be null");
            __CLR4_4_1c00c00kylve1x6.R.inc(16331);assertEquals(1, out.length, "Out length must be 1");
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_Reader() throws IOException {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbk3ydclo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_Reader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbk3ydclo() throws IOException{try{__CLR4_4_1c00c00kylve1x6.R.inc(16332);
        __CLR4_4_1c00c00kylve1x6.R.inc(16333);final String charsetName = "UTF-8";
        __CLR4_4_1c00c00kylve1x6.R.inc(16334);final byte[] expecteds = charsetName.getBytes(charsetName);
        __CLR4_4_1c00c00kylve1x6.R.inc(16335);byte[] actuals = IOUtils.toByteArray(new InputStreamReader(new ByteArrayInputStream(expecteds)));
        __CLR4_4_1c00c00kylve1x6.R.inc(16336);assertArrayEquals(expecteds, actuals);
        __CLR4_4_1c00c00kylve1x6.R.inc(16337);actuals = IOUtils.toByteArray(new InputStreamReader(new ByteArrayInputStream(expecteds)), charsetName);
        __CLR4_4_1c00c00kylve1x6.R.inc(16338);assertArrayEquals(expecteds, actuals);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_String() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15um4x9clv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15um4x9clv() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16339);
        class __CLR4_4_1$AC26 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16340);try (__CLR4_4_1$AC26 __CLR$ACI33=new __CLR4_4_1$AC26(){{__CLR4_4_1c00c00kylve1x6.R.inc(16341);}};Reader fin = Files.newBufferedReader(testFilePath)) {
            // Create our String. Rely on testReaderToString() to make sure this is valid.
            __CLR4_4_1c00c00kylve1x6.R.inc(16342);final String str = IOUtils.toString(fin);

            __CLR4_4_1c00c00kylve1x6.R.inc(16343);final byte[] out = IOUtils.toByteArray(str);
            __CLR4_4_1c00c00kylve1x6.R.inc(16344);assertEqualContent(str.getBytes(), out);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_URI() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7gxfscm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_URI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7gxfscm1() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16345);
        __CLR4_4_1c00c00kylve1x6.R.inc(16346);final URI url = testFile.toURI();
        __CLR4_4_1c00c00kylve1x6.R.inc(16347);final byte[] actual = IOUtils.toByteArray(url);
        __CLR4_4_1c00c00kylve1x6.R.inc(16348);assertEquals(FILE_SIZE, actual.length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_URL() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggh12dcm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_URL",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggh12dcm5() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16349);
        __CLR4_4_1c00c00kylve1x6.R.inc(16350);final URL url = testFile.toURI().toURL();
        __CLR4_4_1c00c00kylve1x6.R.inc(16351);final byte[] actual = IOUtils.toByteArray(url);
        __CLR4_4_1c00c00kylve1x6.R.inc(16352);assertEquals(FILE_SIZE, actual.length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToByteArray_URLConnection() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sp34wpcm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToByteArray_URLConnection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sp34wpcm9() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16353);
        __CLR4_4_1c00c00kylve1x6.R.inc(16354);final URLConnection urlConn = testFile.toURI().toURL().openConnection();
        __CLR4_4_1c00c00kylve1x6.R.inc(16355);byte[] actual;
        __CLR4_4_1c00c00kylve1x6.R.inc(16356);try {
            __CLR4_4_1c00c00kylve1x6.R.inc(16357);actual = IOUtils.toByteArray(urlConn);
        } finally {
            __CLR4_4_1c00c00kylve1x6.R.inc(16358);IOUtils.close(urlConn);
        }
        __CLR4_4_1c00c00kylve1x6.R.inc(16359);assertEquals(FILE_SIZE, actual.length);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToCharArray_InputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rwgh48cmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToCharArray_InputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rwgh48cmg() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16360);
        class __CLR4_4_1$AC27 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16361);try (__CLR4_4_1$AC27 __CLR$ACI34=new __CLR4_4_1$AC27(){{__CLR4_4_1c00c00kylve1x6.R.inc(16362);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16363);final char[] out = IOUtils.toCharArray(fin);
            __CLR4_4_1c00c00kylve1x6.R.inc(16364);assertNotNull(out);
            __CLR4_4_1c00c00kylve1x6.R.inc(16365);assertEquals(0, fin.available(), "Not all chars were read");
            __CLR4_4_1c00c00kylve1x6.R.inc(16366);assertEquals(FILE_SIZE, out.length, "Wrong output size");
            __CLR4_4_1c00c00kylve1x6.R.inc(16367);TestUtils.assertEqualContent(out, testFile);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToCharArray_InputStream_CharsetName() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tols5ccmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToCharArray_InputStream_CharsetName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tols5ccmo() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16368);
        class __CLR4_4_1$AC28 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16369);try (__CLR4_4_1$AC28 __CLR$ACI35=new __CLR4_4_1$AC28(){{__CLR4_4_1c00c00kylve1x6.R.inc(16370);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16371);final char[] out = IOUtils.toCharArray(fin, "UTF-8");
            __CLR4_4_1c00c00kylve1x6.R.inc(16372);assertNotNull(out);
            __CLR4_4_1c00c00kylve1x6.R.inc(16373);assertEquals(0, fin.available(), "Not all chars were read");
            __CLR4_4_1c00c00kylve1x6.R.inc(16374);assertEquals(FILE_SIZE, out.length, "Wrong output size");
            __CLR4_4_1c00c00kylve1x6.R.inc(16375);TestUtils.assertEqualContent(out, testFile);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToCharArray_Reader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18rwyhfcmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToCharArray_Reader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18rwyhfcmw() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16376);
        class __CLR4_4_1$AC29 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16377);try (__CLR4_4_1$AC29 __CLR$ACI36=new __CLR4_4_1$AC29(){{__CLR4_4_1c00c00kylve1x6.R.inc(16378);}};Reader fr = Files.newBufferedReader(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16379);final char[] out = IOUtils.toCharArray(fr);
            __CLR4_4_1c00c00kylve1x6.R.inc(16380);assertNotNull(out);
            __CLR4_4_1c00c00kylve1x6.R.inc(16381);assertEquals(FILE_SIZE, out.length, "Wrong output size");
            __CLR4_4_1c00c00kylve1x6.R.inc(16382);TestUtils.assertEqualContent(out, testFile);
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    /**
     * Test for {@link IOUtils#toInputStream(CharSequence)} and {@link IOUtils#toInputStream(CharSequence, String)}.
     * Note, this test utilizes on {@link IOUtils#toByteArray(java.io.InputStream)} and so relies on
     * {@link #testToByteArray_InputStream()} to ensure this method functions correctly.
     *
     * @throws Exception on error
     */
    @Test
    public void testToInputStream_CharSequence() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16om5j4cn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToInputStream_CharSequence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16om5j4cn3() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16383);
        __CLR4_4_1c00c00kylve1x6.R.inc(16384);final CharSequence csq = new StringBuilder("Abc123Xyz!");
        __CLR4_4_1c00c00kylve1x6.R.inc(16385);InputStream inStream = IOUtils.toInputStream(csq); // deliberately testing deprecated method
        __CLR4_4_1c00c00kylve1x6.R.inc(16386);byte[] bytes = IOUtils.toByteArray(inStream);
        __CLR4_4_1c00c00kylve1x6.R.inc(16387);assertEqualContent(csq.toString().getBytes(), bytes);
        __CLR4_4_1c00c00kylve1x6.R.inc(16388);inStream = IOUtils.toInputStream(csq, (String) null);
        __CLR4_4_1c00c00kylve1x6.R.inc(16389);bytes = IOUtils.toByteArray(inStream);
        __CLR4_4_1c00c00kylve1x6.R.inc(16390);assertEqualContent(csq.toString().getBytes(), bytes);
        __CLR4_4_1c00c00kylve1x6.R.inc(16391);inStream = IOUtils.toInputStream(csq, "UTF-8");
        __CLR4_4_1c00c00kylve1x6.R.inc(16392);bytes = IOUtils.toByteArray(inStream);
        __CLR4_4_1c00c00kylve1x6.R.inc(16393);assertEqualContent(csq.toString().getBytes(StandardCharsets.UTF_8), bytes);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    /**
     * Test for {@link IOUtils#toInputStream(String)} and {@link IOUtils#toInputStream(String, String)}. Note, this test
     * utilizes on {@link IOUtils#toByteArray(java.io.InputStream)} and so relies on
     * {@link #testToByteArray_InputStream()} to ensure this method functions correctly.
     *
     * @throws Exception on error
     */
    @Test
    public void testToInputStream_String() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ican3acne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToInputStream_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ican3acne() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16394);
        __CLR4_4_1c00c00kylve1x6.R.inc(16395);final String str = "Abc123Xyz!";
        __CLR4_4_1c00c00kylve1x6.R.inc(16396);InputStream inStream = IOUtils.toInputStream(str);
        __CLR4_4_1c00c00kylve1x6.R.inc(16397);byte[] bytes = IOUtils.toByteArray(inStream);
        __CLR4_4_1c00c00kylve1x6.R.inc(16398);assertEqualContent(str.getBytes(), bytes);
        __CLR4_4_1c00c00kylve1x6.R.inc(16399);inStream = IOUtils.toInputStream(str, (String) null);
        __CLR4_4_1c00c00kylve1x6.R.inc(16400);bytes = IOUtils.toByteArray(inStream);
        __CLR4_4_1c00c00kylve1x6.R.inc(16401);assertEqualContent(str.getBytes(), bytes);
        __CLR4_4_1c00c00kylve1x6.R.inc(16402);inStream = IOUtils.toInputStream(str, "UTF-8");
        __CLR4_4_1c00c00kylve1x6.R.inc(16403);bytes = IOUtils.toByteArray(inStream);
        __CLR4_4_1c00c00kylve1x6.R.inc(16404);assertEqualContent(str.getBytes(StandardCharsets.UTF_8), bytes);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToString_ByteArray() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyuv7tcnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToString_ByteArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyuv7tcnp() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16405);
        class __CLR4_4_1$AC30 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16406);try (__CLR4_4_1$AC30 __CLR$ACI37=new __CLR4_4_1$AC30(){{__CLR4_4_1c00c00kylve1x6.R.inc(16407);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16408);final byte[] in = IOUtils.toByteArray(fin);
            // Create our byte[]. Rely on testInputStreamToByteArray() to make sure this is valid.
            __CLR4_4_1c00c00kylve1x6.R.inc(16409);final String str = IOUtils.toString(in);
            __CLR4_4_1c00c00kylve1x6.R.inc(16410);assertEqualContent(in, str.getBytes());
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToString_InputStream() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffoib4cnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToString_InputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffoib4cnv() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16411);
        class __CLR4_4_1$AC31 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16412);try (__CLR4_4_1$AC31 __CLR$ACI38=new __CLR4_4_1$AC31(){{__CLR4_4_1c00c00kylve1x6.R.inc(16413);}};InputStream fin = Files.newInputStream(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16414);final String out = IOUtils.toString(fin);
            __CLR4_4_1c00c00kylve1x6.R.inc(16415);assertNotNull(out);
            __CLR4_4_1c00c00kylve1x6.R.inc(16416);assertEquals(0, fin.available(), "Not all bytes were read");
            __CLR4_4_1c00c00kylve1x6.R.inc(16417);assertEquals(FILE_SIZE, out.length(), "Wrong output size");
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToString_Reader() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9dc0lco2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToString_Reader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9dc0lco2() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16418);
        class __CLR4_4_1$AC32 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1c00c00kylve1x6.R.inc(16419);try (__CLR4_4_1$AC32 __CLR$ACI39=new __CLR4_4_1$AC32(){{__CLR4_4_1c00c00kylve1x6.R.inc(16420);}};Reader fin = Files.newBufferedReader(testFilePath)) {
            __CLR4_4_1c00c00kylve1x6.R.inc(16421);final String out = IOUtils.toString(fin);
            __CLR4_4_1c00c00kylve1x6.R.inc(16422);assertNotNull(out);
            __CLR4_4_1c00c00kylve1x6.R.inc(16423);assertEquals(FILE_SIZE, out.length(), "Wrong output size");
        }
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToString_URI() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nd7qmco8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToString_URI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nd7qmco8() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16424);
        __CLR4_4_1c00c00kylve1x6.R.inc(16425);final URI url = testFile.toURI();
        __CLR4_4_1c00c00kylve1x6.R.inc(16426);final String out = IOUtils.toString(url);
        __CLR4_4_1c00c00kylve1x6.R.inc(16427);assertNotNull(out);
        __CLR4_4_1c00c00kylve1x6.R.inc(16428);assertEquals(FILE_SIZE, out.length(), "Wrong output size");
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    private void testToString_URI(final String encoding) throws Exception {try{__CLR4_4_1c00c00kylve1x6.R.inc(16429);
        __CLR4_4_1c00c00kylve1x6.R.inc(16430);final URI uri = testFile.toURI();
        __CLR4_4_1c00c00kylve1x6.R.inc(16431);final String out = IOUtils.toString(uri, encoding);
        __CLR4_4_1c00c00kylve1x6.R.inc(16432);assertNotNull(out);
        __CLR4_4_1c00c00kylve1x6.R.inc(16433);assertEquals(FILE_SIZE, out.length(), "Wrong output size");
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToString_URI_CharsetName() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t7nbqcoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToString_URI_CharsetName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t7nbqcoi() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16434);
        __CLR4_4_1c00c00kylve1x6.R.inc(16435);testToString_URI("US-ASCII");
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToString_URI_CharsetNameNull() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g6epcok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToString_URI_CharsetNameNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g6epcok() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16436);
        __CLR4_4_1c00c00kylve1x6.R.inc(16437);testToString_URI(null);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToString_URL() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143momtcom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToString_URL",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143momtcom() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16438);
        __CLR4_4_1c00c00kylve1x6.R.inc(16439);final URL url = testFile.toURI().toURL();
        __CLR4_4_1c00c00kylve1x6.R.inc(16440);final String out = IOUtils.toString(url);
        __CLR4_4_1c00c00kylve1x6.R.inc(16441);assertNotNull(out);
        __CLR4_4_1c00c00kylve1x6.R.inc(16442);assertEquals(FILE_SIZE, out.length(), "Wrong output size");
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    private void testToString_URL(final String encoding) throws Exception {try{__CLR4_4_1c00c00kylve1x6.R.inc(16443);
        __CLR4_4_1c00c00kylve1x6.R.inc(16444);final URL url = testFile.toURI().toURL();
        __CLR4_4_1c00c00kylve1x6.R.inc(16445);final String out = IOUtils.toString(url, encoding);
        __CLR4_4_1c00c00kylve1x6.R.inc(16446);assertNotNull(out);
        __CLR4_4_1c00c00kylve1x6.R.inc(16447);assertEquals(FILE_SIZE, out.length(), "Wrong output size");
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToString_URL_CharsetName() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9w5l9cow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToString_URL_CharsetName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9w5l9cow() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16448);
        __CLR4_4_1c00c00kylve1x6.R.inc(16449);testToString_URL("US-ASCII");
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

    @Test
    public void testToString_URL_CharsetNameNull() throws Exception {__CLR4_4_1c00c00kylve1x6.R.globalSliceStart(getClass().getName(),16450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119yep8coy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1c00c00kylve1x6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1c00c00kylve1x6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.IOUtilsTestCase.testToString_URL_CharsetNameNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119yep8coy() throws Exception{try{__CLR4_4_1c00c00kylve1x6.R.inc(16450);
        __CLR4_4_1c00c00kylve1x6.R.inc(16451);testToString_URL(null);
    }finally{__CLR4_4_1c00c00kylve1x6.R.flushNeeded();}}

}
