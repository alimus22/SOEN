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
package org.apache.commons.io.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;

/**
 * Base class for testcases doing tests with files.
 */
public abstract class TestUtils {static class __CLR4_4_1lablabkylve3ss{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,27701,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Assert that the content of a file is equal to that in a byte[].
     *
     * @param b0   the expected contents
     * @param file the file to check
     * @throws IOException If an I/O error occurs while reading the file contents
     */
    public static void assertEqualContent(final byte[] b0, final File file) throws IOException {try{__CLR4_4_1lablabkylve3ss.R.inc(27587);
        __CLR4_4_1lablabkylve3ss.R.inc(27588);int count = 0, numRead = 0;
        __CLR4_4_1lablabkylve3ss.R.inc(27589);final byte[] b1 = new byte[b0.length];
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1lablabkylve3ss.R.inc(27590);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1lablabkylve3ss.R.inc(27591);}};InputStream is = Files.newInputStream(file.toPath())) {
            __CLR4_4_1lablabkylve3ss.R.inc(27592);while ((((count < b0.length && numRead >= 0)&&(__CLR4_4_1lablabkylve3ss.R.iget(27593)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27594)==0&false))) {{
                __CLR4_4_1lablabkylve3ss.R.inc(27595);numRead = is.read(b1, count, b0.length);
                __CLR4_4_1lablabkylve3ss.R.inc(27596);count += numRead;
            }
            }__CLR4_4_1lablabkylve3ss.R.inc(27597);assertEquals(b0.length, count, "Different number of bytes: ");
            __CLR4_4_1lablabkylve3ss.R.inc(27598);for (int i = 0; (((i < count)&&(__CLR4_4_1lablabkylve3ss.R.iget(27599)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27600)==0&false)); i++) {{
                __CLR4_4_1lablabkylve3ss.R.inc(27601);assertEquals(b0[i], b1[i], "byte " + i + " differs");
            }
        }}
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    /**
     * Assert that the content of a file is equal to that in a char[].
     *
     * @param c0   the expected contents
     * @param file the file to check
     * @throws IOException If an I/O error occurs while reading the file contents
     */
    public static void assertEqualContent(final char[] c0, final File file) throws IOException {try{__CLR4_4_1lablabkylve3ss.R.inc(27602);
        __CLR4_4_1lablabkylve3ss.R.inc(27603);int count = 0, numRead = 0;
        __CLR4_4_1lablabkylve3ss.R.inc(27604);final char[] c1 = new char[c0.length];
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1lablabkylve3ss.R.inc(27605);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1lablabkylve3ss.R.inc(27606);}};Reader ir = Files.newBufferedReader(file.toPath())) {
            __CLR4_4_1lablabkylve3ss.R.inc(27607);while ((((count < c0.length && numRead >= 0)&&(__CLR4_4_1lablabkylve3ss.R.iget(27608)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27609)==0&false))) {{
                __CLR4_4_1lablabkylve3ss.R.inc(27610);numRead = ir.read(c1, count, c0.length);
                __CLR4_4_1lablabkylve3ss.R.inc(27611);count += numRead;
            }
            }__CLR4_4_1lablabkylve3ss.R.inc(27612);assertEquals(c0.length, count, "Different number of chars: ");
            __CLR4_4_1lablabkylve3ss.R.inc(27613);for (int i = 0; (((i < count)&&(__CLR4_4_1lablabkylve3ss.R.iget(27614)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27615)==0&false)); i++) {{
                __CLR4_4_1lablabkylve3ss.R.inc(27616);assertEquals(c0[i], c1[i], "char " + i + " differs");
            }
        }}
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    /**
     * Assert that the content of two files is the same.
     */
    private static void assertEqualContent(final File f0, final File f1)
            throws IOException {try{__CLR4_4_1lablabkylve3ss.R.inc(27617);
        /* This doesn't work because the filesize isn't updated until the file
         * is closed.
        assertTrue( "The files " + f0 + " and " + f1 +
                    " have differing file sizes (" + f0.length() +
                    " vs " + f1.length() + ")", ( f0.length() == f1.length() ) );
        */
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1lablabkylve3ss.R.inc(27618);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1lablabkylve3ss.R.inc(27619);}};InputStream is0 = Files.newInputStream(f0.toPath())) {
            class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1lablabkylve3ss.R.inc(27620);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1lablabkylve3ss.R.inc(27621);}};InputStream is1 = Files.newInputStream(f1.toPath())) {
                __CLR4_4_1lablabkylve3ss.R.inc(27622);final byte[] buf0 = new byte[1024];
                __CLR4_4_1lablabkylve3ss.R.inc(27623);final byte[] buf1 = new byte[1024];
                __CLR4_4_1lablabkylve3ss.R.inc(27624);int n0 = 0;
                __CLR4_4_1lablabkylve3ss.R.inc(27625);int n1;

                __CLR4_4_1lablabkylve3ss.R.inc(27626);while ((((-1 != n0)&&(__CLR4_4_1lablabkylve3ss.R.iget(27627)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27628)==0&false))) {{
                    __CLR4_4_1lablabkylve3ss.R.inc(27629);n0 = is0.read(buf0);
                    __CLR4_4_1lablabkylve3ss.R.inc(27630);n1 = is1.read(buf1);
                    __CLR4_4_1lablabkylve3ss.R.inc(27631);assertTrue((n0 == n1),
                            "The files " + f0 + " and " + f1 +
                            " have differing number of bytes available (" + n0 + " vs " + n1 + ")");

                    __CLR4_4_1lablabkylve3ss.R.inc(27632);assertArrayEquals(buf0, buf1, "The files " + f0 + " and " + f1 + " have different content");
                }
            }}
        }
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static void checkFile(final File file, final File referenceFile)
            throws Exception {try{__CLR4_4_1lablabkylve3ss.R.inc(27633);
        __CLR4_4_1lablabkylve3ss.R.inc(27634);assertTrue(file.exists(), "Check existence of output file");
        __CLR4_4_1lablabkylve3ss.R.inc(27635);assertEqualContent(referenceFile, file);
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static void checkWrite(final OutputStream output) {try{__CLR4_4_1lablabkylve3ss.R.inc(27636);
        __CLR4_4_1lablabkylve3ss.R.inc(27637);try {
            __CLR4_4_1lablabkylve3ss.R.inc(27638);new java.io.PrintStream(output).write(0);
        } catch (final Throwable t) {
            __CLR4_4_1lablabkylve3ss.R.inc(27639);fail("The copy() method closed the stream when it shouldn't have. " + t.getMessage());
        }
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static void checkWrite(final Writer output) {try{__CLR4_4_1lablabkylve3ss.R.inc(27640);
        __CLR4_4_1lablabkylve3ss.R.inc(27641);try {
            __CLR4_4_1lablabkylve3ss.R.inc(27642);new java.io.PrintWriter(output).write('a');
        } catch (final Throwable t) {
            __CLR4_4_1lablabkylve3ss.R.inc(27643);fail("The copy() method closed the stream when it shouldn't have. " + t.getMessage());
        }
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static void createFile(final File file, final long size)
            throws IOException {try{__CLR4_4_1lablabkylve3ss.R.inc(27644);
        __CLR4_4_1lablabkylve3ss.R.inc(27645);if ((((!file.getParentFile().exists())&&(__CLR4_4_1lablabkylve3ss.R.iget(27646)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27647)==0&false))) {{
            __CLR4_4_1lablabkylve3ss.R.inc(27648);throw new IOException("Cannot create file " + file
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1lablabkylve3ss.R.inc(27649);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1lablabkylve3ss.R.inc(27650);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(file.toPath()))) {
            __CLR4_4_1lablabkylve3ss.R.inc(27651);generateTestData(output, size);
        }
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static void createLineBasedFile(final File file, final String[] data) throws IOException {try{__CLR4_4_1lablabkylve3ss.R.inc(27652);
        __CLR4_4_1lablabkylve3ss.R.inc(27653);if ((((file.getParentFile() != null && !file.getParentFile().exists())&&(__CLR4_4_1lablabkylve3ss.R.iget(27654)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27655)==0&false))) {{
            __CLR4_4_1lablabkylve3ss.R.inc(27656);throw new IOException("Cannot create file " + file + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1lablabkylve3ss.R.inc(27657);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1lablabkylve3ss.R.inc(27658);}};final PrintWriter output = new PrintWriter(new OutputStreamWriter(Files.newOutputStream(file.toPath()), StandardCharsets.UTF_8))) {
            __CLR4_4_1lablabkylve3ss.R.inc(27659);for (final String element : data) {{
                __CLR4_4_1lablabkylve3ss.R.inc(27660);output.println(element);
            }
        }}
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static void deleteFile(final File file) {try{__CLR4_4_1lablabkylve3ss.R.inc(27661);
        __CLR4_4_1lablabkylve3ss.R.inc(27662);if ((((file.exists())&&(__CLR4_4_1lablabkylve3ss.R.iget(27663)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27664)==0&false))) {{
            __CLR4_4_1lablabkylve3ss.R.inc(27665);assertTrue(file.delete(), "Couldn't delete file: " + file);
        }
    }}finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static void generateTestData(final File file, final long size) throws IOException, FileNotFoundException {try{__CLR4_4_1lablabkylve3ss.R.inc(27666);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1lablabkylve3ss.R.inc(27667);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1lablabkylve3ss.R.inc(27668);}};final BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(file.toPath()))) {
            __CLR4_4_1lablabkylve3ss.R.inc(27669);generateTestData(output, size);
        }
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static byte[] generateTestData(final long size) {try{__CLR4_4_1lablabkylve3ss.R.inc(27670);
        __CLR4_4_1lablabkylve3ss.R.inc(27671);try {
            class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1lablabkylve3ss.R.inc(27672);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1lablabkylve3ss.R.inc(27673);}};final ByteArrayOutputStream baout = new ByteArrayOutputStream()) {
                __CLR4_4_1lablabkylve3ss.R.inc(27674);generateTestData(baout, size);
                __CLR4_4_1lablabkylve3ss.R.inc(27675);return baout.toByteArray();
            }
        } catch (final IOException ioe) {
            __CLR4_4_1lablabkylve3ss.R.inc(27676);throw new IllegalStateException("This should never happen: " + ioe.getMessage(), ioe);
        }
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static void generateTestData(final OutputStream out, final long size)
            throws IOException {try{__CLR4_4_1lablabkylve3ss.R.inc(27677);
        __CLR4_4_1lablabkylve3ss.R.inc(27678);for (int i = 0; (((i < size)&&(__CLR4_4_1lablabkylve3ss.R.iget(27679)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27680)==0&false)); i++) {{
            // output.write((byte)'X');
            // nice varied byte pattern compatible with Readers and Writers
            __CLR4_4_1lablabkylve3ss.R.inc(27681);out.write((byte) ((i % 127) + 1));
        }
    }}finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static File newFile(final File testDirectory, final String filename) throws IOException {try{__CLR4_4_1lablabkylve3ss.R.inc(27682);
        __CLR4_4_1lablabkylve3ss.R.inc(27683);final File destination = new File(testDirectory, filename);
        /*
        assertTrue( filename + "Test output data file shouldn't previously exist",
                    !destination.exists() );
        */
        __CLR4_4_1lablabkylve3ss.R.inc(27684);if ((((destination.exists())&&(__CLR4_4_1lablabkylve3ss.R.iget(27685)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27686)==0&false))) {{
            __CLR4_4_1lablabkylve3ss.R.inc(27687);FileUtils.forceDelete(destination);
        }
        }__CLR4_4_1lablabkylve3ss.R.inc(27688);return destination;
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    /**
     * Sleep for a guaranteed number of milliseconds unless interrupted.
     *
     * This method exists because Thread.sleep(100) can sleep for 0, 70, 100 or 200ms or anything else
     * it deems appropriate. Read the docs on Thread.sleep for further details.
     *
     * @param millis the number of milliseconds to sleep for
     * @throws InterruptedException if interrupted
     */
    public static void sleep(final long millis) throws InterruptedException {try{__CLR4_4_1lablabkylve3ss.R.inc(27689);
        __CLR4_4_1lablabkylve3ss.R.inc(27690);final long finishAtMillis = System.currentTimeMillis() + millis;
        __CLR4_4_1lablabkylve3ss.R.inc(27691);long remainingMillis = millis;
        __CLR4_4_1lablabkylve3ss.R.inc(27692);do {{
            __CLR4_4_1lablabkylve3ss.R.inc(27693);Thread.sleep(remainingMillis);
            __CLR4_4_1lablabkylve3ss.R.inc(27694);remainingMillis = finishAtMillis - System.currentTimeMillis();
        } }while ((((remainingMillis > 0)&&(__CLR4_4_1lablabkylve3ss.R.iget(27695)!=0|true))||(__CLR4_4_1lablabkylve3ss.R.iget(27696)==0&false)));
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    public static void sleepQuietly(final long millis) {try{__CLR4_4_1lablabkylve3ss.R.inc(27697);
        __CLR4_4_1lablabkylve3ss.R.inc(27698);try {
            __CLR4_4_1lablabkylve3ss.R.inc(27699);sleep(millis);
        } catch (final InterruptedException ignored){
            // ignore InterruptedException.
        }
    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

    private TestUtils() {try{__CLR4_4_1lablabkylve3ss.R.inc(27700);

    }finally{__CLR4_4_1lablabkylve3ss.R.flushNeeded();}}

}
