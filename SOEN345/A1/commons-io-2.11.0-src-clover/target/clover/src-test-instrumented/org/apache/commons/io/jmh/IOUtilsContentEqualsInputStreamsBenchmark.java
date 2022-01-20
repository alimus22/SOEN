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

package org.apache.commons.io.jmh;

import static org.apache.commons.io.IOUtils.DEFAULT_BUFFER_SIZE;
import static org.apache.commons.io.IOUtils.EOF;
import static org.apache.commons.io.IOUtils.buffer;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

/**
 * Test different implementations of {@link IOUtils#contentEquals(InputStream, InputStream)}.
 *
 * <pre>
 * IOUtilsContentEqualsInputStreamsBenchmark.testFileCurrent          avgt    5      1518342.821 \u00e2\u0096\u0092     201890.705  ns/op
 * IOUtilsContentEqualsInputStreamsBenchmark.testFilePr118            avgt    5      1578606.938 \u00e2\u0096\u0092      66980.718  ns/op
 * IOUtilsContentEqualsInputStreamsBenchmark.testFileRelease_2_8_0    avgt    5      2439163.068 \u00e2\u0096\u0092     265765.294  ns/op
 * IOUtilsContentEqualsInputStreamsBenchmark.testStringCurrent        avgt    5  10389834700.000 \u00e2\u0096\u0092  330301175.219  ns/op
 * IOUtilsContentEqualsInputStreamsBenchmark.testStringPr118          avgt    5  10890915400.000 \u00e2\u0096\u0092 3251289634.067  ns/op
 * IOUtilsContentEqualsInputStreamsBenchmark.testStringRelease_2_8_0  avgt    5  12522802960.000 \u00e2\u0096\u0092  111147669.527  ns/op
 * </pre>
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 10, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 10, timeUnit = TimeUnit.SECONDS)
@Fork(value = 1, jvmArgs = {"-server"})
public class IOUtilsContentEqualsInputStreamsBenchmark {public static class __CLR4_4_1j1bj1bkylve3di{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,24826,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String TEST_PATH_A = "/org/apache/commons/io/testfileBOM.xml";
    private static final String TEST_PATH_16K_A = "/org/apache/commons/io/abitmorethan16k.txt";
    private static final String TEST_PATH_16K_A_COPY = "/org/apache/commons/io/abitmorethan16kcopy.txt";
    private static final String TEST_PATH_B = "/org/apache/commons/io/testfileNoBOM.xml";
    private static final Charset DEFAULT_CHARSET = Charset.defaultCharset();
    static String[] STRINGS = new String[5];

    static {try{__CLR4_4_1j1bj1bkylve3di.R.inc(24671);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24672);STRINGS[0] = StringUtils.repeat("ab", 1 << 24);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24673);STRINGS[1] = STRINGS[0] + 'c';
        __CLR4_4_1j1bj1bkylve3di.R.inc(24674);STRINGS[2] = STRINGS[0] + 'd';
        __CLR4_4_1j1bj1bkylve3di.R.inc(24675);STRINGS[3] = StringUtils.repeat("ab\rab\n", 1 << 24);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24676);STRINGS[4] = StringUtils.repeat("ab\r\nab\r", 1 << 24);
    }finally{__CLR4_4_1j1bj1bkylve3di.R.flushNeeded();}}

    static String SPECIAL_CASE_STRING_0 = StringUtils.repeat(StringUtils.repeat("ab", 1 << 24) + '\n', 2);
    static String SPECIAL_CASE_STRING_1 = StringUtils.repeat(StringUtils.repeat("cd", 1 << 24) + '\n', 2);

    @SuppressWarnings("resource")
    public static boolean contentEquals_release_2_8_0(final InputStream input1, final InputStream input2)
        throws IOException {try{__CLR4_4_1j1bj1bkylve3di.R.inc(24677);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24678);if ((((input1 == input2)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24679)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24680)==0&false))) {{
            __CLR4_4_1j1bj1bkylve3di.R.inc(24681);return true;
        }
        }__CLR4_4_1j1bj1bkylve3di.R.inc(24682);if ((((input1 == null ^ input2 == null)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24683)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24684)==0&false))) {{
            __CLR4_4_1j1bj1bkylve3di.R.inc(24685);return false;
        }
        }__CLR4_4_1j1bj1bkylve3di.R.inc(24686);final BufferedInputStream bufferedInput1 = buffer(input1);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24687);final BufferedInputStream bufferedInput2 = buffer(input2);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24688);int ch = bufferedInput1.read();
        __CLR4_4_1j1bj1bkylve3di.R.inc(24689);while ((((EOF != ch)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24690)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24691)==0&false))) {{
            __CLR4_4_1j1bj1bkylve3di.R.inc(24692);final int ch2 = bufferedInput2.read();
            __CLR4_4_1j1bj1bkylve3di.R.inc(24693);if ((((ch != ch2)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24694)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24695)==0&false))) {{
                __CLR4_4_1j1bj1bkylve3di.R.inc(24696);return false;
            }
            }__CLR4_4_1j1bj1bkylve3di.R.inc(24697);ch = bufferedInput1.read();
        }
        }__CLR4_4_1j1bj1bkylve3di.R.inc(24698);return bufferedInput2.read() == EOF;

    }finally{__CLR4_4_1j1bj1bkylve3di.R.flushNeeded();}}

    public static boolean contentEqualsPr118(final InputStream input1, final InputStream input2) throws IOException {try{__CLR4_4_1j1bj1bkylve3di.R.inc(24699);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24700);if ((((input1 == input2)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24701)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24702)==0&false))) {{
            __CLR4_4_1j1bj1bkylve3di.R.inc(24703);return true;
        }
        }__CLR4_4_1j1bj1bkylve3di.R.inc(24704);if ((((input1 == null || input2 == null)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24705)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24706)==0&false))) {{
            __CLR4_4_1j1bj1bkylve3di.R.inc(24707);return false;
        }

        }__CLR4_4_1j1bj1bkylve3di.R.inc(24708);final byte[] array1 = new byte[DEFAULT_BUFFER_SIZE];
        __CLR4_4_1j1bj1bkylve3di.R.inc(24709);final byte[] array2 = new byte[DEFAULT_BUFFER_SIZE];
        __CLR4_4_1j1bj1bkylve3di.R.inc(24710);int pos1;
        __CLR4_4_1j1bj1bkylve3di.R.inc(24711);int pos2;
        __CLR4_4_1j1bj1bkylve3di.R.inc(24712);int count1;
        __CLR4_4_1j1bj1bkylve3di.R.inc(24713);int count2;
        __CLR4_4_1j1bj1bkylve3di.R.inc(24714);while (true) {{
            __CLR4_4_1j1bj1bkylve3di.R.inc(24715);pos1 = 0;
            __CLR4_4_1j1bj1bkylve3di.R.inc(24716);pos2 = 0;
            __CLR4_4_1j1bj1bkylve3di.R.inc(24717);for (int index = 0; (((index < DEFAULT_BUFFER_SIZE)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24718)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24719)==0&false)); index++) {{
                __CLR4_4_1j1bj1bkylve3di.R.inc(24720);if ((((pos1 == index)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24721)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24722)==0&false))) {{
                    __CLR4_4_1j1bj1bkylve3di.R.inc(24723);do {{
                        __CLR4_4_1j1bj1bkylve3di.R.inc(24724);count1 = input1.read(array1, pos1, DEFAULT_BUFFER_SIZE - pos1);
                    } }while ((((count1 == 0)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24725)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24726)==0&false)));
                    __CLR4_4_1j1bj1bkylve3di.R.inc(24727);if ((((count1 == EOF)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24728)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24729)==0&false))) {{
                        __CLR4_4_1j1bj1bkylve3di.R.inc(24730);return pos2 == index && input2.read() == EOF;
                    }
                    }__CLR4_4_1j1bj1bkylve3di.R.inc(24731);pos1 += count1;
                }
                }__CLR4_4_1j1bj1bkylve3di.R.inc(24732);if ((((pos2 == index)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24733)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24734)==0&false))) {{
                    __CLR4_4_1j1bj1bkylve3di.R.inc(24735);do {{
                        __CLR4_4_1j1bj1bkylve3di.R.inc(24736);count2 = input2.read(array2, pos2, DEFAULT_BUFFER_SIZE - pos2);
                    } }while ((((count2 == 0)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24737)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24738)==0&false)));
                    __CLR4_4_1j1bj1bkylve3di.R.inc(24739);if ((((count2 == EOF)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24740)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24741)==0&false))) {{
                        __CLR4_4_1j1bj1bkylve3di.R.inc(24742);return pos1 == index && input1.read() == EOF;
                    }
                    }__CLR4_4_1j1bj1bkylve3di.R.inc(24743);pos2 += count2;
                }
                }__CLR4_4_1j1bj1bkylve3di.R.inc(24744);if ((((array1[index] != array2[index])&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24745)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24746)==0&false))) {{
                    __CLR4_4_1j1bj1bkylve3di.R.inc(24747);return false;
                }
            }}
        }}
    }}finally{__CLR4_4_1j1bj1bkylve3di.R.flushNeeded();}}

    @Benchmark
    public boolean[] testFileCurrent() throws IOException {try{__CLR4_4_1j1bj1bkylve3di.R.inc(24748);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24749);final boolean[] res = new boolean[3];
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24750);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24751);}};InputStream input1 = getClass().getResourceAsStream(TEST_PATH_A);
            __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24752);}};InputStream input2 = getClass().getResourceAsStream(TEST_PATH_B)) {
            __CLR4_4_1j1bj1bkylve3di.R.inc(24753);res[0] = IOUtils.contentEquals(input1, input1);
        }
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24754);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24755);}};InputStream input1 = getClass().getResourceAsStream(TEST_PATH_A);
            __CLR4_4_1$AC1 __CLR$ACI3=new __CLR4_4_1$AC1(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24756);}};InputStream input2 = getClass().getResourceAsStream(TEST_PATH_A);) {
            __CLR4_4_1j1bj1bkylve3di.R.inc(24757);res[1] = IOUtils.contentEquals(input1, input2);
        }
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24758);try (__CLR4_4_1$AC2 __CLR$ACI4=new __CLR4_4_1$AC2(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24759);}};InputStream input1 = getClass().getResourceAsStream(TEST_PATH_16K_A);
            __CLR4_4_1$AC2 __CLR$ACI5=new __CLR4_4_1$AC2(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24760);}};InputStream input2 = getClass().getResourceAsStream(TEST_PATH_16K_A_COPY);) {
            __CLR4_4_1j1bj1bkylve3di.R.inc(24761);res[2] = IOUtils.contentEquals(input1, input2);
        }
        __CLR4_4_1j1bj1bkylve3di.R.inc(24762);return res;
    }finally{__CLR4_4_1j1bj1bkylve3di.R.flushNeeded();}}

    @Benchmark
    public boolean[] testFilePr118() throws IOException {try{__CLR4_4_1j1bj1bkylve3di.R.inc(24763);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24764);final boolean[] res = new boolean[3];
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24765);try (__CLR4_4_1$AC3 __CLR$ACI6=new __CLR4_4_1$AC3(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24766);}};InputStream input1 = getClass().getResourceAsStream(TEST_PATH_A);
            __CLR4_4_1$AC3 __CLR$ACI7=new __CLR4_4_1$AC3(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24767);}};InputStream input2 = getClass().getResourceAsStream(TEST_PATH_B)) {
            __CLR4_4_1j1bj1bkylve3di.R.inc(24768);res[0] = contentEqualsPr118(input1, input1);
        }
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24769);try (__CLR4_4_1$AC4 __CLR$ACI8=new __CLR4_4_1$AC4(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24770);}};InputStream input1 = getClass().getResourceAsStream(TEST_PATH_A);
            __CLR4_4_1$AC4 __CLR$ACI9=new __CLR4_4_1$AC4(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24771);}};InputStream input2 = getClass().getResourceAsStream(TEST_PATH_A)) {
            __CLR4_4_1j1bj1bkylve3di.R.inc(24772);res[1] = contentEqualsPr118(input1, input2);
        }
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24773);try (__CLR4_4_1$AC5 __CLR$ACI10=new __CLR4_4_1$AC5(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24774);}};InputStream input1 = getClass().getResourceAsStream(TEST_PATH_16K_A);
            __CLR4_4_1$AC5 __CLR$ACI11=new __CLR4_4_1$AC5(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24775);}};InputStream input2 = getClass().getResourceAsStream(TEST_PATH_16K_A_COPY)) {
            __CLR4_4_1j1bj1bkylve3di.R.inc(24776);res[2] = contentEqualsPr118(input1, input2);
        }
        __CLR4_4_1j1bj1bkylve3di.R.inc(24777);return res;
    }finally{__CLR4_4_1j1bj1bkylve3di.R.flushNeeded();}}

    @Benchmark
    public boolean[] testFileRelease_2_8_0() throws IOException {try{__CLR4_4_1j1bj1bkylve3di.R.inc(24778);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24779);final boolean[] res = new boolean[3];
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24780);try (__CLR4_4_1$AC6 __CLR$ACI12=new __CLR4_4_1$AC6(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24781);}};InputStream input1 = getClass().getResourceAsStream(TEST_PATH_A);
            __CLR4_4_1$AC6 __CLR$ACI13=new __CLR4_4_1$AC6(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24782);}};InputStream input2 = getClass().getResourceAsStream(TEST_PATH_B)) {
            __CLR4_4_1j1bj1bkylve3di.R.inc(24783);res[0] = contentEquals_release_2_8_0(input1, input1);
        }
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24784);try (__CLR4_4_1$AC7 __CLR$ACI14=new __CLR4_4_1$AC7(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24785);}};InputStream input1 = getClass().getResourceAsStream(TEST_PATH_A);
            __CLR4_4_1$AC7 __CLR$ACI15=new __CLR4_4_1$AC7(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24786);}};InputStream input2 = getClass().getResourceAsStream(TEST_PATH_A);) {
            __CLR4_4_1j1bj1bkylve3di.R.inc(24787);res[1] = contentEquals_release_2_8_0(input1, input2);
        }
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24788);try (__CLR4_4_1$AC8 __CLR$ACI16=new __CLR4_4_1$AC8(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24789);}};InputStream input1 = getClass().getResourceAsStream(TEST_PATH_16K_A);
            __CLR4_4_1$AC8 __CLR$ACI17=new __CLR4_4_1$AC8(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24790);}};InputStream input2 = getClass().getResourceAsStream(TEST_PATH_16K_A_COPY)) {
            __CLR4_4_1j1bj1bkylve3di.R.inc(24791);res[2] = contentEquals_release_2_8_0(input1, input2);
        }
        __CLR4_4_1j1bj1bkylve3di.R.inc(24792);return res;
    }finally{__CLR4_4_1j1bj1bkylve3di.R.flushNeeded();}}

    @Benchmark
    public void testStringCurrent(final Blackhole blackhole) throws IOException {try{__CLR4_4_1j1bj1bkylve3di.R.inc(24793);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24794);for (int i = 0; (((i < 5)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24795)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24796)==0&false)); i++) {{
            __CLR4_4_1j1bj1bkylve3di.R.inc(24797);for (int j = 0; (((j < 5)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24798)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24799)==0&false)); j++) {{
                class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24800);try (__CLR4_4_1$AC9 __CLR$ACI18=new __CLR4_4_1$AC9(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24801);}};InputStream inputReader1 = IOUtils.toInputStream(STRINGS[i], DEFAULT_CHARSET);
                    __CLR4_4_1$AC9 __CLR$ACI19=new __CLR4_4_1$AC9(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24802);}};InputStream inputReader2 = IOUtils.toInputStream(STRINGS[j], DEFAULT_CHARSET)) {
                    __CLR4_4_1j1bj1bkylve3di.R.inc(24803);blackhole.consume(IOUtils.contentEquals(inputReader1, inputReader2));
                }
            }
        }}
    }}finally{__CLR4_4_1j1bj1bkylve3di.R.flushNeeded();}}

    @Benchmark
    public void testStringPr118(final Blackhole blackhole) throws IOException {try{__CLR4_4_1j1bj1bkylve3di.R.inc(24804);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24805);for (int i = 0; (((i < 5)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24806)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24807)==0&false)); i++) {{
            __CLR4_4_1j1bj1bkylve3di.R.inc(24808);for (int j = 0; (((j < 5)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24809)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24810)==0&false)); j++) {{
                class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24811);try (__CLR4_4_1$AC10 __CLR$ACI20=new __CLR4_4_1$AC10(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24812);}};InputStream input1 = IOUtils.toInputStream(STRINGS[i], DEFAULT_CHARSET);
                    __CLR4_4_1$AC10 __CLR$ACI21=new __CLR4_4_1$AC10(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24813);}};InputStream input2 = IOUtils.toInputStream(STRINGS[j], DEFAULT_CHARSET)) {
                    __CLR4_4_1j1bj1bkylve3di.R.inc(24814);blackhole.consume(contentEqualsPr118(input1, input2));
                }
            }
        }}
    }}finally{__CLR4_4_1j1bj1bkylve3di.R.flushNeeded();}}

    @Benchmark
    public void testStringRelease_2_8_0(final Blackhole blackhole) throws IOException {try{__CLR4_4_1j1bj1bkylve3di.R.inc(24815);
        __CLR4_4_1j1bj1bkylve3di.R.inc(24816);for (int i = 0; (((i < 5)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24817)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24818)==0&false)); i++) {{
            __CLR4_4_1j1bj1bkylve3di.R.inc(24819);for (int j = 0; (((j < 5)&&(__CLR4_4_1j1bj1bkylve3di.R.iget(24820)!=0|true))||(__CLR4_4_1j1bj1bkylve3di.R.iget(24821)==0&false)); j++) {{
                class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j1bj1bkylve3di.R.inc(24822);try (__CLR4_4_1$AC11 __CLR$ACI22=new __CLR4_4_1$AC11(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24823);}};InputStream input1 = IOUtils.toInputStream(STRINGS[i], DEFAULT_CHARSET);
                    __CLR4_4_1$AC11 __CLR$ACI23=new __CLR4_4_1$AC11(){{__CLR4_4_1j1bj1bkylve3di.R.inc(24824);}};InputStream input2 = IOUtils.toInputStream(STRINGS[j], DEFAULT_CHARSET)) {
                    __CLR4_4_1j1bj1bkylve3di.R.inc(24825);blackhole.consume(contentEquals_release_2_8_0(input1, input2));
                }
            }
        }}
    }}finally{__CLR4_4_1j1bj1bkylve3di.R.flushNeeded();}}

}
