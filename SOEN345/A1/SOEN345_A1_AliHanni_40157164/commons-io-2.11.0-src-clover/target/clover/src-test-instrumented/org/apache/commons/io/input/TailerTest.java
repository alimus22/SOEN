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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.TestResources;
import org.apache.commons.io.test.TestUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Tests for {@link Tailer}.
 *
 */
public class TailerTest {static class __CLR4_4_1hsahsakylve34w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,23325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public static File temporaryFolder;

    private Tailer tailer;

    @AfterEach
    public void tearDown() {try{__CLR4_4_1hsahsakylve34w.R.inc(23050);
        __CLR4_4_1hsahsakylve34w.R.inc(23051);if ((((tailer != null)&&(__CLR4_4_1hsahsakylve34w.R.iget(23052)!=0|true))||(__CLR4_4_1hsahsakylve34w.R.iget(23053)==0&false))) {{
            __CLR4_4_1hsahsakylve34w.R.inc(23054);tailer.stop();
        }
    }}finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    @Test
    @SuppressWarnings("squid:S2699") // Suppress "Add at least one assertion to this test case"
    public void testLongFile() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3racvhsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testLongFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3racvhsf() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23055);
        __CLR4_4_1hsahsakylve34w.R.inc(23056);final long delay = 50;

        __CLR4_4_1hsahsakylve34w.R.inc(23057);final File file = new File(temporaryFolder, "testLongFile.txt");
        __CLR4_4_1hsahsakylve34w.R.inc(23058);createFile(file, 0);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hsahsakylve34w.R.inc(23059);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1hsahsakylve34w.R.inc(23060);}};final Writer writer = Files.newBufferedWriter(file.toPath(), StandardOpenOption.APPEND)) {
            __CLR4_4_1hsahsakylve34w.R.inc(23061);for (int i = 0; (((i < 100000)&&(__CLR4_4_1hsahsakylve34w.R.iget(23062)!=0|true))||(__CLR4_4_1hsahsakylve34w.R.iget(23063)==0&false)); i++) {{
                __CLR4_4_1hsahsakylve34w.R.inc(23064);writer.write("LineLineLineLineLineLineLineLineLineLine\n");
            }
            }__CLR4_4_1hsahsakylve34w.R.inc(23065);writer.write("SBTOURIST\n");
        }

        __CLR4_4_1hsahsakylve34w.R.inc(23066);final TestTailerListener listener = new TestTailerListener();
        __CLR4_4_1hsahsakylve34w.R.inc(23067);tailer = new Tailer(file, listener, delay, false);

        // final long start = System.currentTimeMillis();

        __CLR4_4_1hsahsakylve34w.R.inc(23068);final Thread thread = new Thread(tailer);
        __CLR4_4_1hsahsakylve34w.R.inc(23069);thread.start();

        __CLR4_4_1hsahsakylve34w.R.inc(23070);List<String> lines = listener.getLines();
        __CLR4_4_1hsahsakylve34w.R.inc(23071);while ((((lines.isEmpty() || !lines.get(lines.size() - 1).equals("SBTOURIST"))&&(__CLR4_4_1hsahsakylve34w.R.iget(23072)!=0|true))||(__CLR4_4_1hsahsakylve34w.R.iget(23073)==0&false))) {{
            __CLR4_4_1hsahsakylve34w.R.inc(23074);lines = listener.getLines();
        }
        // System.out.println("Elapsed: " + (System.currentTimeMillis() - start));

        }__CLR4_4_1hsahsakylve34w.R.inc(23075);listener.clear();
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    @Test
    @SuppressWarnings("squid:S2699") // Suppress "Add at least one assertion to this test case"
    public void testBufferBreak() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sx60d0ht0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testBufferBreak",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sx60d0ht0() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23076);
        __CLR4_4_1hsahsakylve34w.R.inc(23077);final long delay = 50;

        __CLR4_4_1hsahsakylve34w.R.inc(23078);final File file = new File(temporaryFolder, "testBufferBreak.txt");
        __CLR4_4_1hsahsakylve34w.R.inc(23079);createFile(file, 0);
        __CLR4_4_1hsahsakylve34w.R.inc(23080);writeString(file, "SBTOURIST\n");

        __CLR4_4_1hsahsakylve34w.R.inc(23081);final TestTailerListener listener = new TestTailerListener();
        __CLR4_4_1hsahsakylve34w.R.inc(23082);tailer = new Tailer(file, listener, delay, false, 1);

        __CLR4_4_1hsahsakylve34w.R.inc(23083);final Thread thread = new Thread(tailer);
        __CLR4_4_1hsahsakylve34w.R.inc(23084);thread.start();

        __CLR4_4_1hsahsakylve34w.R.inc(23085);List<String> lines = listener.getLines();
        __CLR4_4_1hsahsakylve34w.R.inc(23086);while ((((lines.isEmpty() || !lines.get(lines.size() - 1).equals("SBTOURIST"))&&(__CLR4_4_1hsahsakylve34w.R.iget(23087)!=0|true))||(__CLR4_4_1hsahsakylve34w.R.iget(23088)==0&false))) {{
            __CLR4_4_1hsahsakylve34w.R.inc(23089);lines = listener.getLines();
        }

        }__CLR4_4_1hsahsakylve34w.R.inc(23090);listener.clear();
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    @Test
    public void testMultiByteBreak() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r7k7rhtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testMultiByteBreak",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r7k7rhtf() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23091);
        // System.out.println("testMultiByteBreak() Default charset: " + Charset.defaultCharset().displayName());
        __CLR4_4_1hsahsakylve34w.R.inc(23092);final long delay = 50;
        __CLR4_4_1hsahsakylve34w.R.inc(23093);final File origin = TestResources.getFile("test-file-utf8.bin");
        __CLR4_4_1hsahsakylve34w.R.inc(23094);final File file = new File(temporaryFolder, "testMultiByteBreak.txt");
        __CLR4_4_1hsahsakylve34w.R.inc(23095);createFile(file, 0);
        __CLR4_4_1hsahsakylve34w.R.inc(23096);final TestTailerListener listener = new TestTailerListener();
        __CLR4_4_1hsahsakylve34w.R.inc(23097);final String osname = System.getProperty("os.name");
        __CLR4_4_1hsahsakylve34w.R.inc(23098);final boolean isWindows = osname.startsWith("Windows");
        // Need to use UTF-8 to read & write the file otherwise it can be corrupted (depending on the default charset)
        __CLR4_4_1hsahsakylve34w.R.inc(23099);final Charset charsetUTF8 = StandardCharsets.UTF_8;
        __CLR4_4_1hsahsakylve34w.R.inc(23100);tailer = new Tailer(file, charsetUTF8, listener, delay, false, isWindows, IOUtils.DEFAULT_BUFFER_SIZE);
        __CLR4_4_1hsahsakylve34w.R.inc(23101);final Thread thread = new Thread(tailer);
        __CLR4_4_1hsahsakylve34w.R.inc(23102);thread.start();

        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hsahsakylve34w.R.inc(23103);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1hsahsakylve34w.R.inc(23104);}};Writer out = new OutputStreamWriter(Files.newOutputStream(file.toPath()), charsetUTF8);
             __CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1hsahsakylve34w.R.inc(23105);}};BufferedReader reader = new BufferedReader(new InputStreamReader(Files.newInputStream(origin.toPath()), charsetUTF8))) {
            __CLR4_4_1hsahsakylve34w.R.inc(23106);final List<String> lines = new ArrayList<>();
            __CLR4_4_1hsahsakylve34w.R.inc(23107);String line;
            __CLR4_4_1hsahsakylve34w.R.inc(23108);while((line = reader.readLine()) != null){{
                __CLR4_4_1hsahsakylve34w.R.inc(23111);out.write(line);
                __CLR4_4_1hsahsakylve34w.R.inc(23112);out.write("\n");
                __CLR4_4_1hsahsakylve34w.R.inc(23113);lines.add(line);
            }
            }__CLR4_4_1hsahsakylve34w.R.inc(23114);out.close(); // ensure data is written

           __CLR4_4_1hsahsakylve34w.R.inc(23115);final long testDelayMillis = delay * 10;
           __CLR4_4_1hsahsakylve34w.R.inc(23116);TestUtils.sleep(testDelayMillis);
           __CLR4_4_1hsahsakylve34w.R.inc(23117);final List<String> tailerlines = listener.getLines();
           __CLR4_4_1hsahsakylve34w.R.inc(23118);assertEquals(lines.size(), tailerlines.size(), "line count");
           __CLR4_4_1hsahsakylve34w.R.inc(23119);for(int i = 0,len = lines.size();(((i<len)&&(__CLR4_4_1hsahsakylve34w.R.iget(23120)!=0|true))||(__CLR4_4_1hsahsakylve34w.R.iget(23121)==0&false));i++){{
               __CLR4_4_1hsahsakylve34w.R.inc(23122);final String expected = lines.get(i);
               __CLR4_4_1hsahsakylve34w.R.inc(23123);final String actual = tailerlines.get(i);
               __CLR4_4_1hsahsakylve34w.R.inc(23124);if ((((!expected.equals(actual))&&(__CLR4_4_1hsahsakylve34w.R.iget(23125)!=0|true))||(__CLR4_4_1hsahsakylve34w.R.iget(23126)==0&false))) {{
                   __CLR4_4_1hsahsakylve34w.R.inc(23127);fail("Line: " + i
                           + "\nExp: (" + expected.length() + ") " + expected
                           + "\nAct: (" + actual.length() + ") "+ actual);
               }
           }}
        }}
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    @Test
    public void testTailerEof() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gw6gokhug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testTailerEof",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gw6gokhug() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23128);
        // Create & start the Tailer
        __CLR4_4_1hsahsakylve34w.R.inc(23129);final long delay = 50;
        __CLR4_4_1hsahsakylve34w.R.inc(23130);final File file = new File(temporaryFolder, "tailer2-test.txt");
        __CLR4_4_1hsahsakylve34w.R.inc(23131);createFile(file, 0);
        __CLR4_4_1hsahsakylve34w.R.inc(23132);final TestTailerListener listener = new TestTailerListener();
        __CLR4_4_1hsahsakylve34w.R.inc(23133);tailer = new Tailer(file, listener, delay, false);
        __CLR4_4_1hsahsakylve34w.R.inc(23134);final Thread thread = new Thread(tailer);
        __CLR4_4_1hsahsakylve34w.R.inc(23135);thread.start();

        // Write some lines to the file
        __CLR4_4_1hsahsakylve34w.R.inc(23136);writeString(file, "Line");

        __CLR4_4_1hsahsakylve34w.R.inc(23137);TestUtils.sleep(delay * 2);
        __CLR4_4_1hsahsakylve34w.R.inc(23138);List<String> lines = listener.getLines();
        __CLR4_4_1hsahsakylve34w.R.inc(23139);assertEquals(0, lines.size(), "1 line count");

        __CLR4_4_1hsahsakylve34w.R.inc(23140);writeString(file, " one\n");
        __CLR4_4_1hsahsakylve34w.R.inc(23141);TestUtils.sleep(delay * 2);
        __CLR4_4_1hsahsakylve34w.R.inc(23142);lines = listener.getLines();

        __CLR4_4_1hsahsakylve34w.R.inc(23143);assertEquals(1, lines.size(), "1 line count");
        __CLR4_4_1hsahsakylve34w.R.inc(23144);assertEquals("Line one", lines.get(0), "1 line 1");

        __CLR4_4_1hsahsakylve34w.R.inc(23145);listener.clear();
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    @Test
    public void testTailer() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ni1uaehuy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testTailer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ni1uaehuy() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23146);

        // Create & start the Tailer
        __CLR4_4_1hsahsakylve34w.R.inc(23147);final long delayMillis = 50;
        __CLR4_4_1hsahsakylve34w.R.inc(23148);final File file = new File(temporaryFolder, "tailer1-test.txt");
        __CLR4_4_1hsahsakylve34w.R.inc(23149);createFile(file, 0);
        __CLR4_4_1hsahsakylve34w.R.inc(23150);final TestTailerListener listener = new TestTailerListener();
        __CLR4_4_1hsahsakylve34w.R.inc(23151);final String osname = System.getProperty("os.name");
        __CLR4_4_1hsahsakylve34w.R.inc(23152);final boolean isWindows = osname.startsWith("Windows");
        __CLR4_4_1hsahsakylve34w.R.inc(23153);tailer = new Tailer(file, listener, delayMillis, false, isWindows);
        __CLR4_4_1hsahsakylve34w.R.inc(23154);final Thread thread = new Thread(tailer);
        __CLR4_4_1hsahsakylve34w.R.inc(23155);thread.start();

        // Write some lines to the file
        __CLR4_4_1hsahsakylve34w.R.inc(23156);write(file, "Line one", "Line two");
        __CLR4_4_1hsahsakylve34w.R.inc(23157);final long testDelayMillis = delayMillis * 10;
        __CLR4_4_1hsahsakylve34w.R.inc(23158);TestUtils.sleep(testDelayMillis);
        __CLR4_4_1hsahsakylve34w.R.inc(23159);List<String> lines = listener.getLines();
        __CLR4_4_1hsahsakylve34w.R.inc(23160);assertEquals(2, lines.size(), "1 line count");
        __CLR4_4_1hsahsakylve34w.R.inc(23161);assertEquals("Line one", lines.get(0), "1 line 1");
        __CLR4_4_1hsahsakylve34w.R.inc(23162);assertEquals("Line two", lines.get(1), "1 line 2");
        __CLR4_4_1hsahsakylve34w.R.inc(23163);listener.clear();

        // Write another line to the file
        __CLR4_4_1hsahsakylve34w.R.inc(23164);write(file, "Line three");
        __CLR4_4_1hsahsakylve34w.R.inc(23165);TestUtils.sleep(testDelayMillis);
        __CLR4_4_1hsahsakylve34w.R.inc(23166);lines = listener.getLines();
        __CLR4_4_1hsahsakylve34w.R.inc(23167);assertEquals(1, lines.size(), "2 line count");
        __CLR4_4_1hsahsakylve34w.R.inc(23168);assertEquals("Line three", lines.get(0), "2 line 3");
        __CLR4_4_1hsahsakylve34w.R.inc(23169);listener.clear();

        // Check file does actually have all the lines
        __CLR4_4_1hsahsakylve34w.R.inc(23170);lines = FileUtils.readLines(file, "UTF-8");
        __CLR4_4_1hsahsakylve34w.R.inc(23171);assertEquals(3, lines.size(), "3 line count");
        __CLR4_4_1hsahsakylve34w.R.inc(23172);assertEquals("Line one", lines.get(0), "3 line 1");
        __CLR4_4_1hsahsakylve34w.R.inc(23173);assertEquals("Line two", lines.get(1), "3 line 2");
        __CLR4_4_1hsahsakylve34w.R.inc(23174);assertEquals("Line three", lines.get(2), "3 line 3");

        // Delete & re-create
        __CLR4_4_1hsahsakylve34w.R.inc(23175);file.delete();
        __CLR4_4_1hsahsakylve34w.R.inc(23176);assertFalse(file.exists(), "File should not exist");
        __CLR4_4_1hsahsakylve34w.R.inc(23177);createFile(file, 0);
        __CLR4_4_1hsahsakylve34w.R.inc(23178);assertTrue(file.exists(), "File should now exist");
        __CLR4_4_1hsahsakylve34w.R.inc(23179);TestUtils.sleep(testDelayMillis);

        // Write another line
        __CLR4_4_1hsahsakylve34w.R.inc(23180);write(file, "Line four");
        __CLR4_4_1hsahsakylve34w.R.inc(23181);TestUtils.sleep(testDelayMillis);
        __CLR4_4_1hsahsakylve34w.R.inc(23182);lines = listener.getLines();
        __CLR4_4_1hsahsakylve34w.R.inc(23183);assertEquals(1, lines.size(), "4 line count");
        __CLR4_4_1hsahsakylve34w.R.inc(23184);assertEquals("Line four", lines.get(0), "4 line 3");
        __CLR4_4_1hsahsakylve34w.R.inc(23185);listener.clear();

        // Stop
        __CLR4_4_1hsahsakylve34w.R.inc(23186);thread.interrupt();
        __CLR4_4_1hsahsakylve34w.R.inc(23187);TestUtils.sleep(testDelayMillis * 4);
        __CLR4_4_1hsahsakylve34w.R.inc(23188);write(file, "Line five");
        __CLR4_4_1hsahsakylve34w.R.inc(23189);assertEquals(0, listener.getLines().size(), "4 line count");
        __CLR4_4_1hsahsakylve34w.R.inc(23190);assertNotNull(listener.exception, "Missing InterruptedException");
        __CLR4_4_1hsahsakylve34w.R.inc(23191);assertTrue(listener.exception instanceof InterruptedException, "Unexpected Exception: " + listener.exception);
        __CLR4_4_1hsahsakylve34w.R.inc(23192);assertEquals(1 , listener.initialized, "Expected init to be called");
        // assertEquals(0 , listener.notFound, "fileNotFound should not be called"); // there is a window when it might be called
        __CLR4_4_1hsahsakylve34w.R.inc(23193);assertEquals(1 , listener.rotated, "fileRotated should be be called");
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    @Test
    public void testTailerEndOfFileReached() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0vk6yhwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testTailerEndOfFileReached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0vk6yhwa() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23194);
        // Create & start the Tailer
        __CLR4_4_1hsahsakylve34w.R.inc(23195);final long delayMillis = 50;
        __CLR4_4_1hsahsakylve34w.R.inc(23196);final long testDelayMillis = delayMillis * 10;
        __CLR4_4_1hsahsakylve34w.R.inc(23197);final File file = new File(temporaryFolder, "tailer-eof-test.txt");
        __CLR4_4_1hsahsakylve34w.R.inc(23198);createFile(file, 0);
        __CLR4_4_1hsahsakylve34w.R.inc(23199);final TestTailerListener listener = new TestTailerListener();
        __CLR4_4_1hsahsakylve34w.R.inc(23200);final String osname = System.getProperty("os.name");
        __CLR4_4_1hsahsakylve34w.R.inc(23201);final boolean isWindows = osname.startsWith("Windows");
        __CLR4_4_1hsahsakylve34w.R.inc(23202);tailer = new Tailer(file, listener, delayMillis, false, isWindows);
        __CLR4_4_1hsahsakylve34w.R.inc(23203);final Thread thread = new Thread(tailer);
        __CLR4_4_1hsahsakylve34w.R.inc(23204);thread.start();

        // write a few lines
        __CLR4_4_1hsahsakylve34w.R.inc(23205);write(file, "line1", "line2", "line3");
        __CLR4_4_1hsahsakylve34w.R.inc(23206);TestUtils.sleep(testDelayMillis);

        // write a few lines
        __CLR4_4_1hsahsakylve34w.R.inc(23207);write(file, "line4", "line5", "line6");
        __CLR4_4_1hsahsakylve34w.R.inc(23208);TestUtils.sleep(testDelayMillis);

        // write a few lines
        __CLR4_4_1hsahsakylve34w.R.inc(23209);write(file, "line7", "line8", "line9");
        __CLR4_4_1hsahsakylve34w.R.inc(23210);TestUtils.sleep(testDelayMillis);

        // May be > 3 times due to underlying OS behavior wrt streams
        __CLR4_4_1hsahsakylve34w.R.inc(23211);assertTrue(listener.reachedEndOfFile >= 3, "end of file reached at least 3 times");
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    protected void createFile(final File file, final long size)
        throws IOException {try{__CLR4_4_1hsahsakylve34w.R.inc(23212);
        __CLR4_4_1hsahsakylve34w.R.inc(23213);if ((((!file.getParentFile().exists())&&(__CLR4_4_1hsahsakylve34w.R.iget(23214)!=0|true))||(__CLR4_4_1hsahsakylve34w.R.iget(23215)==0&false))) {{
            __CLR4_4_1hsahsakylve34w.R.inc(23216);throw new IOException("Cannot create file " + file
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hsahsakylve34w.R.inc(23217);try (__CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_1hsahsakylve34w.R.inc(23218);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(file.toPath()))) {
            __CLR4_4_1hsahsakylve34w.R.inc(23219);TestUtils.generateTestData(output, size);
        }

        // try to make sure file is found
        // (to stop continuum occasionally failing)
        __CLR4_4_1hsahsakylve34w.R.inc(23220);RandomAccessFile reader = null;
        __CLR4_4_1hsahsakylve34w.R.inc(23221);try {
            __CLR4_4_1hsahsakylve34w.R.inc(23222);while ((((reader == null)&&(__CLR4_4_1hsahsakylve34w.R.iget(23223)!=0|true))||(__CLR4_4_1hsahsakylve34w.R.iget(23224)==0&false))) {{
                __CLR4_4_1hsahsakylve34w.R.inc(23225);try {
                    __CLR4_4_1hsahsakylve34w.R.inc(23226);reader = new RandomAccessFile(file.getPath(), "r");
                } catch (final FileNotFoundException ignore) {
                }
                __CLR4_4_1hsahsakylve34w.R.inc(23227);try {
                    __CLR4_4_1hsahsakylve34w.R.inc(23228);TestUtils.sleep(200L);
                } catch (final InterruptedException ignore) {
                    // ignore
                }
            }
        }} finally {
            __CLR4_4_1hsahsakylve34w.R.inc(23229);try {
                __CLR4_4_1hsahsakylve34w.R.inc(23230);IOUtils.close(reader);
            } catch (final IOException ignored) {
                // ignored
            }
        }
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    /** Append some lines to a file */
    private void write(final File file, final String... lines) throws Exception {try{__CLR4_4_1hsahsakylve34w.R.inc(23231);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hsahsakylve34w.R.inc(23232);try (__CLR4_4_1$AC3 __CLR$ACI4=new __CLR4_4_1$AC3(){{__CLR4_4_1hsahsakylve34w.R.inc(23233);}};Writer writer = Files.newBufferedWriter(file.toPath(), StandardOpenOption.APPEND)) {
            __CLR4_4_1hsahsakylve34w.R.inc(23234);for (final String line : lines) {{
                __CLR4_4_1hsahsakylve34w.R.inc(23235);writer.write(line + "\n");
            }
        }}
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    /** Append a string to a file */
    private void writeString(final File file, final String ... strings) throws Exception {try{__CLR4_4_1hsahsakylve34w.R.inc(23236);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hsahsakylve34w.R.inc(23237);try (__CLR4_4_1$AC4 __CLR$ACI5=new __CLR4_4_1$AC4(){{__CLR4_4_1hsahsakylve34w.R.inc(23238);}};Writer writer = Files.newBufferedWriter(file.toPath(), StandardOpenOption.APPEND)) {
            __CLR4_4_1hsahsakylve34w.R.inc(23239);for (final String string : strings) {{
                __CLR4_4_1hsahsakylve34w.R.inc(23240);writer.write(string);
            }
        }}
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    @Test
    public void testStopWithNoFile() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7locihxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testStopWithNoFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7locihxl() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23241);
        __CLR4_4_1hsahsakylve34w.R.inc(23242);final File file = new File(temporaryFolder,"nosuchfile");
        __CLR4_4_1hsahsakylve34w.R.inc(23243);assertFalse(file.exists(), "nosuchfile should not exist");
        __CLR4_4_1hsahsakylve34w.R.inc(23244);final TestTailerListener listener = new TestTailerListener();
        __CLR4_4_1hsahsakylve34w.R.inc(23245);final int delay = 100;
        __CLR4_4_1hsahsakylve34w.R.inc(23246);final int idle = 50; // allow time for thread to work
        __CLR4_4_1hsahsakylve34w.R.inc(23247);tailer = Tailer.create(file, listener, delay, false);
        __CLR4_4_1hsahsakylve34w.R.inc(23248);TestUtils.sleep(idle);
        __CLR4_4_1hsahsakylve34w.R.inc(23249);tailer.stop();
        __CLR4_4_1hsahsakylve34w.R.inc(23250);TestUtils.sleep(delay+idle);
        __CLR4_4_1hsahsakylve34w.R.inc(23251);assertNull(listener.exception, "Should not generate Exception");
        __CLR4_4_1hsahsakylve34w.R.inc(23252);assertEquals(1 , listener.initialized, "Expected init to be called");
        __CLR4_4_1hsahsakylve34w.R.inc(23253);assertTrue(listener.notFound > 0, "fileNotFound should be called");
        __CLR4_4_1hsahsakylve34w.R.inc(23254);assertEquals(0 , listener.rotated, "fileRotated should be not be called");
        __CLR4_4_1hsahsakylve34w.R.inc(23255);assertEquals(0, listener.reachedEndOfFile, "end of file never reached");
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    /*
     * Tests [IO-357][Tailer] InterruptedException while the thead is sleeping is silently ignored.
     */
    @Test
    public void testInterrupt() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgcw0ohy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testInterrupt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgcw0ohy0() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23256);
        __CLR4_4_1hsahsakylve34w.R.inc(23257);final File file = new File(temporaryFolder, "nosuchfile");
        __CLR4_4_1hsahsakylve34w.R.inc(23258);assertFalse(file.exists(), "nosuchfile should not exist");
        __CLR4_4_1hsahsakylve34w.R.inc(23259);final TestTailerListener listener = new TestTailerListener();
        // Use a long delay to try to make sure the test thread calls interrupt() while the tailer thread is sleeping.
        __CLR4_4_1hsahsakylve34w.R.inc(23260);final int delay = 1000;
        __CLR4_4_1hsahsakylve34w.R.inc(23261);final int idle = 50; // allow time for thread to work
        __CLR4_4_1hsahsakylve34w.R.inc(23262);tailer = new Tailer(file, listener, delay, false, IOUtils.DEFAULT_BUFFER_SIZE);
        __CLR4_4_1hsahsakylve34w.R.inc(23263);final Thread thread = new Thread(tailer);
        __CLR4_4_1hsahsakylve34w.R.inc(23264);thread.setDaemon(true);
        __CLR4_4_1hsahsakylve34w.R.inc(23265);thread.start();
        __CLR4_4_1hsahsakylve34w.R.inc(23266);TestUtils.sleep(idle);
        __CLR4_4_1hsahsakylve34w.R.inc(23267);thread.interrupt();
        __CLR4_4_1hsahsakylve34w.R.inc(23268);TestUtils.sleep(delay + idle);
        __CLR4_4_1hsahsakylve34w.R.inc(23269);assertNotNull(listener.exception, "Missing InterruptedException");
        __CLR4_4_1hsahsakylve34w.R.inc(23270);assertTrue(listener.exception instanceof InterruptedException, "Unexpected Exception: " + listener.exception);
        __CLR4_4_1hsahsakylve34w.R.inc(23271);assertEquals(1, listener.initialized, "Expected init to be called");
        __CLR4_4_1hsahsakylve34w.R.inc(23272);assertTrue(listener.notFound > 0, "fileNotFound should be called");
        __CLR4_4_1hsahsakylve34w.R.inc(23273);assertEquals(0, listener.rotated, "fileRotated should be not be called");
        __CLR4_4_1hsahsakylve34w.R.inc(23274);assertEquals(0, listener.reachedEndOfFile, "end of file never reached");
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    @Test
    public void testStopWithNoFileUsingExecutor() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1e9llhyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testStopWithNoFileUsingExecutor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1e9llhyj() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23275);
        __CLR4_4_1hsahsakylve34w.R.inc(23276);final File file = new File(temporaryFolder,"nosuchfile");
        __CLR4_4_1hsahsakylve34w.R.inc(23277);assertFalse(file.exists(), "nosuchfile should not exist");
        __CLR4_4_1hsahsakylve34w.R.inc(23278);final TestTailerListener listener = new TestTailerListener();
        __CLR4_4_1hsahsakylve34w.R.inc(23279);final int delay = 100;
        __CLR4_4_1hsahsakylve34w.R.inc(23280);final int idle = 50; // allow time for thread to work
        __CLR4_4_1hsahsakylve34w.R.inc(23281);tailer = new Tailer(file, listener, delay, false);
        __CLR4_4_1hsahsakylve34w.R.inc(23282);final Executor exec = new ScheduledThreadPoolExecutor(1);
        __CLR4_4_1hsahsakylve34w.R.inc(23283);exec.execute(tailer);
        __CLR4_4_1hsahsakylve34w.R.inc(23284);TestUtils.sleep(idle);
        __CLR4_4_1hsahsakylve34w.R.inc(23285);tailer.stop();
        __CLR4_4_1hsahsakylve34w.R.inc(23286);TestUtils.sleep(delay+idle);
        __CLR4_4_1hsahsakylve34w.R.inc(23287);assertNull(listener.exception, "Should not generate Exception");
        __CLR4_4_1hsahsakylve34w.R.inc(23288);assertEquals(1 , listener.initialized, "Expected init to be called");
        __CLR4_4_1hsahsakylve34w.R.inc(23289);assertTrue(listener.notFound > 0, "fileNotFound should be called");
        __CLR4_4_1hsahsakylve34w.R.inc(23290);assertEquals(0 , listener.rotated, "fileRotated should be not be called");
        __CLR4_4_1hsahsakylve34w.R.inc(23291);assertEquals(0, listener.reachedEndOfFile, "end of file never reached");
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    @Test
    public void testIO335() throws Exception {__CLR4_4_1hsahsakylve34w.R.globalSliceStart(getClass().getName(),23292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6rcqshz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hsahsakylve34w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hsahsakylve34w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TailerTest.testIO335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6rcqshz0() throws Exception{try{__CLR4_4_1hsahsakylve34w.R.inc(23292); // test CR behavior
        // Create & start the Tailer
        __CLR4_4_1hsahsakylve34w.R.inc(23293);final long delayMillis = 50;
        __CLR4_4_1hsahsakylve34w.R.inc(23294);final File file = new File(temporaryFolder, "tailer-testio334.txt");
        __CLR4_4_1hsahsakylve34w.R.inc(23295);createFile(file, 0);
        __CLR4_4_1hsahsakylve34w.R.inc(23296);final TestTailerListener listener = new TestTailerListener();
        __CLR4_4_1hsahsakylve34w.R.inc(23297);tailer = new Tailer(file, listener, delayMillis, false);
        __CLR4_4_1hsahsakylve34w.R.inc(23298);final Thread thread = new Thread(tailer);
        __CLR4_4_1hsahsakylve34w.R.inc(23299);thread.start();

        // Write some lines to the file
        __CLR4_4_1hsahsakylve34w.R.inc(23300);writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
        __CLR4_4_1hsahsakylve34w.R.inc(23301);final long testDelayMillis = delayMillis * 10;
        __CLR4_4_1hsahsakylve34w.R.inc(23302);TestUtils.sleep(testDelayMillis);
        __CLR4_4_1hsahsakylve34w.R.inc(23303);final List<String> lines = listener.getLines();
        __CLR4_4_1hsahsakylve34w.R.inc(23304);assertEquals(4, lines.size(), "line count");
        __CLR4_4_1hsahsakylve34w.R.inc(23305);assertEquals("CRLF", lines.get(0), "line 1");
        __CLR4_4_1hsahsakylve34w.R.inc(23306);assertEquals("LF", lines.get(1), "line 2");
        __CLR4_4_1hsahsakylve34w.R.inc(23307);assertEquals("CR", lines.get(2), "line 3");
        __CLR4_4_1hsahsakylve34w.R.inc(23308);assertEquals("CRCR\r", lines.get(3), "line 4");
    }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

    /**
     * Test {@link TailerListener} implementation.
     */
    private static class TestTailerListener extends TailerListenerAdapter {

        // Must be synchronized because it is written by one thread and read by another
        private final List<String> lines = Collections.synchronizedList(new ArrayList<String>());

        volatile Exception exception;

        volatile int notFound;

        volatile int rotated;

        volatile int initialized;

        volatile int reachedEndOfFile;

        @Override
        public void handle(final String line) {try{__CLR4_4_1hsahsakylve34w.R.inc(23309);
            __CLR4_4_1hsahsakylve34w.R.inc(23310);lines.add(line);
        }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

        public List<String> getLines() {try{__CLR4_4_1hsahsakylve34w.R.inc(23311);
            __CLR4_4_1hsahsakylve34w.R.inc(23312);return lines;
        }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

        public void clear() {try{__CLR4_4_1hsahsakylve34w.R.inc(23313);
            __CLR4_4_1hsahsakylve34w.R.inc(23314);lines.clear();
        }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

        @Override
        public void handle(final Exception e) {try{__CLR4_4_1hsahsakylve34w.R.inc(23315);
            __CLR4_4_1hsahsakylve34w.R.inc(23316);exception = e;
        }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

        @Override
        public void init(final Tailer tailer) {try{__CLR4_4_1hsahsakylve34w.R.inc(23317);
            __CLR4_4_1hsahsakylve34w.R.inc(23318);initialized++; // not atomic, but OK because only updated here.
        }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

        @Override
        public void fileNotFound() {try{__CLR4_4_1hsahsakylve34w.R.inc(23319);
            __CLR4_4_1hsahsakylve34w.R.inc(23320);notFound++; // not atomic, but OK because only updated here.
        }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

        @Override
        public void fileRotated() {try{__CLR4_4_1hsahsakylve34w.R.inc(23321);
            __CLR4_4_1hsahsakylve34w.R.inc(23322);rotated++; // not atomic, but OK because only updated here.
        }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}

        @Override
        public void endOfFileReached() {try{__CLR4_4_1hsahsakylve34w.R.inc(23323);
            __CLR4_4_1hsahsakylve34w.R.inc(23324);reachedEndOfFile++; // not atomic, but OK because only updated here.
        }finally{__CLR4_4_1hsahsakylve34w.R.flushNeeded();}}
    }
}
