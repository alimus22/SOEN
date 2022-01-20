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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
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
 * Test different implementations of {@link IOUtils#contentEquals(Reader, Reader)}.
 *
 * <pre>
 * IOUtilsContentEqualsReadersBenchmark.testFileCurrent               avgt    5      1670968.050 \u00e2\u0096\u0092     67526.308  ns/op
 * IOUtilsContentEqualsReadersBenchmark.testFilePr118                 avgt    5      1660143.543 \u00e2\u0096\u0092    733178.893  ns/op
 * IOUtilsContentEqualsReadersBenchmark.testFileRelease_2_8_0         avgt    5      1785283.975 \u00e2\u0096\u0092    214177.764  ns/op
 * IOUtilsContentEqualsReadersBenchmark.testStringCurrent             avgt    5   1144495273.333 \u00e2\u0096\u0092  50706166.907  ns/op
 * IOUtilsContentEqualsReadersBenchmark.testStringPr118               avgt    5   1075059231.455 \u00e2\u0096\u0092 275364676.487  ns/op
 * IOUtilsContentEqualsReadersBenchmark.testStringRelease_2_8_0       avgt    5   4767157193.333 \u00e2\u0096\u0092 139567775.251  ns/op
 * </pre>
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 10, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 10, timeUnit = TimeUnit.SECONDS)
@Fork(value = 1, jvmArgs = {"-server"})
public class IOUtilsContentEqualsReadersBenchmark {public static class __CLR4_4_1j5mj5mkylve3e7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,24981,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int STRING_LEN = 1 << 24;
    private static final String TEST_PATH_A = "/org/apache/commons/io/testfileBOM.xml";
    private static final String TEST_PATH_16K_A = "/org/apache/commons/io/abitmorethan16k.txt";
    private static final String TEST_PATH_16K_A_COPY = "/org/apache/commons/io/abitmorethan16kcopy.txt";
    private static final String TEST_PATH_B = "/org/apache/commons/io/testfileNoBOM.xml";
    private static final Charset DEFAULT_CHARSET = Charset.defaultCharset();
    static String[] STRINGS = new String[5];

    static {try{__CLR4_4_1j5mj5mkylve3e7.R.inc(24826);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24827);STRINGS[0] = StringUtils.repeat("ab", STRING_LEN);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24828);STRINGS[1] = STRINGS[0] + 'c';
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24829);STRINGS[2] = STRINGS[0] + 'd';
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24830);STRINGS[3] = StringUtils.repeat("ab\rab\n", STRING_LEN);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24831);STRINGS[4] = StringUtils.repeat("ab\r\nab\r", STRING_LEN);
    }finally{__CLR4_4_1j5mj5mkylve3e7.R.flushNeeded();}}

    static String SPECIAL_CASE_STRING_0 = StringUtils.repeat(StringUtils.repeat("ab", STRING_LEN) + '\n', 2);
    static String SPECIAL_CASE_STRING_1 = StringUtils.repeat(StringUtils.repeat("cd", STRING_LEN) + '\n', 2);

    @SuppressWarnings("resource")
    public static boolean contentEquals_release_2_8_0(final Reader input1, final Reader input2) throws IOException {try{__CLR4_4_1j5mj5mkylve3e7.R.inc(24832);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24833);if ((((input1 == input2)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24834)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24835)==0&false))) {{
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24836);return true;
        }
        }__CLR4_4_1j5mj5mkylve3e7.R.inc(24837);if ((((input1 == null ^ input2 == null)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24838)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24839)==0&false))) {{
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24840);return false;
        }
        }__CLR4_4_1j5mj5mkylve3e7.R.inc(24841);final BufferedReader bufferedInput1 = IOUtils.toBufferedReader(input1);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24842);final BufferedReader bufferedInput2 = IOUtils.toBufferedReader(input2);

        __CLR4_4_1j5mj5mkylve3e7.R.inc(24843);int ch = bufferedInput1.read();
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24844);while ((((EOF != ch)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24845)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24846)==0&false))) {{
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24847);final int ch2 = bufferedInput2.read();
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24848);if ((((ch != ch2)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24849)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24850)==0&false))) {{
                __CLR4_4_1j5mj5mkylve3e7.R.inc(24851);return false;
            }
            }__CLR4_4_1j5mj5mkylve3e7.R.inc(24852);ch = bufferedInput1.read();
        }

        }__CLR4_4_1j5mj5mkylve3e7.R.inc(24853);return bufferedInput2.read() == EOF;
    }finally{__CLR4_4_1j5mj5mkylve3e7.R.flushNeeded();}}

    public static boolean contentEqualsPr118(final Reader input1, final Reader input2) throws IOException {try{__CLR4_4_1j5mj5mkylve3e7.R.inc(24854);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24855);if ((((input1 == input2)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24856)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24857)==0&false))) {{
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24858);return true;
        }
        }__CLR4_4_1j5mj5mkylve3e7.R.inc(24859);if ((((input1 == null || input2 == null)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24860)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24861)==0&false))) {{
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24862);return false;
        }

        }__CLR4_4_1j5mj5mkylve3e7.R.inc(24863);final char[] array1 = new char[DEFAULT_BUFFER_SIZE];
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24864);final char[] array2 = new char[DEFAULT_BUFFER_SIZE];
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24865);int pos1;
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24866);int pos2;
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24867);int count1;
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24868);int count2;
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24869);while (true) {{
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24870);pos1 = 0;
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24871);pos2 = 0;
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24872);for (int index = 0; (((index < DEFAULT_BUFFER_SIZE)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24873)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24874)==0&false)); index++) {{
                __CLR4_4_1j5mj5mkylve3e7.R.inc(24875);if ((((pos1 == index)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24876)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24877)==0&false))) {{
                    __CLR4_4_1j5mj5mkylve3e7.R.inc(24878);do {{
                        __CLR4_4_1j5mj5mkylve3e7.R.inc(24879);count1 = input1.read(array1, pos1, DEFAULT_BUFFER_SIZE - pos1);
                    } }while ((((count1 == 0)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24880)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24881)==0&false)));
                    __CLR4_4_1j5mj5mkylve3e7.R.inc(24882);if ((((count1 == EOF)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24883)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24884)==0&false))) {{
                        __CLR4_4_1j5mj5mkylve3e7.R.inc(24885);return pos2 == index && input2.read() == EOF;
                    }
                    }__CLR4_4_1j5mj5mkylve3e7.R.inc(24886);pos1 += count1;
                }
                }__CLR4_4_1j5mj5mkylve3e7.R.inc(24887);if ((((pos2 == index)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24888)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24889)==0&false))) {{
                    __CLR4_4_1j5mj5mkylve3e7.R.inc(24890);do {{
                        __CLR4_4_1j5mj5mkylve3e7.R.inc(24891);count2 = input2.read(array2, pos2, DEFAULT_BUFFER_SIZE - pos2);
                    } }while ((((count2 == 0)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24892)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24893)==0&false)));
                    __CLR4_4_1j5mj5mkylve3e7.R.inc(24894);if ((((count2 == EOF)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24895)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24896)==0&false))) {{
                        __CLR4_4_1j5mj5mkylve3e7.R.inc(24897);return pos1 == index && input1.read() == EOF;
                    }
                    }__CLR4_4_1j5mj5mkylve3e7.R.inc(24898);pos2 += count2;
                }
                }__CLR4_4_1j5mj5mkylve3e7.R.inc(24899);if ((((array1[index] != array2[index])&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24900)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24901)==0&false))) {{
                    __CLR4_4_1j5mj5mkylve3e7.R.inc(24902);return false;
                }
            }}
        }}
    }}finally{__CLR4_4_1j5mj5mkylve3e7.R.flushNeeded();}}

    @Benchmark
    public boolean[] testFileCurrent() throws IOException {try{__CLR4_4_1j5mj5mkylve3e7.R.inc(24903);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24904);final boolean[] res = new boolean[3];
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24905);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24906);}};Reader input1 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_A), DEFAULT_CHARSET);
            __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24907);}};Reader input2 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_B), DEFAULT_CHARSET)) {
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24908);res[0] = IOUtils.contentEquals(input1, input1);
        }
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24909);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24910);}};Reader input1 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_A), DEFAULT_CHARSET);
            __CLR4_4_1$AC1 __CLR$ACI3=new __CLR4_4_1$AC1(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24911);}};Reader input2 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_A), DEFAULT_CHARSET)) {
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24912);res[1] = IOUtils.contentEquals(input1, input2);
        }
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24913);try (__CLR4_4_1$AC2 __CLR$ACI4=new __CLR4_4_1$AC2(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24914);}};Reader input1 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_16K_A), DEFAULT_CHARSET);
            __CLR4_4_1$AC2 __CLR$ACI5=new __CLR4_4_1$AC2(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24915);}};Reader input2 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_16K_A_COPY),
                DEFAULT_CHARSET)) {
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24916);res[2] = IOUtils.contentEquals(input1, input2);
        }
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24917);return res;
    }finally{__CLR4_4_1j5mj5mkylve3e7.R.flushNeeded();}}

    @Benchmark
    public boolean[] testFilePr118() throws IOException {try{__CLR4_4_1j5mj5mkylve3e7.R.inc(24918);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24919);final boolean[] res = new boolean[3];
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24920);try (__CLR4_4_1$AC3 __CLR$ACI6=new __CLR4_4_1$AC3(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24921);}};Reader input1 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_A), DEFAULT_CHARSET);
            __CLR4_4_1$AC3 __CLR$ACI7=new __CLR4_4_1$AC3(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24922);}};Reader input2 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_B), DEFAULT_CHARSET)) {
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24923);res[0] = contentEqualsPr118(input1, input1);
        }
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24924);try (__CLR4_4_1$AC4 __CLR$ACI8=new __CLR4_4_1$AC4(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24925);}};Reader input1 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_A), DEFAULT_CHARSET);
            __CLR4_4_1$AC4 __CLR$ACI9=new __CLR4_4_1$AC4(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24926);}};Reader input2 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_A), DEFAULT_CHARSET)) {
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24927);res[1] = contentEqualsPr118(input1, input2);
        }
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24928);try (__CLR4_4_1$AC5 __CLR$ACI10=new __CLR4_4_1$AC5(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24929);}};Reader input1 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_16K_A));
            __CLR4_4_1$AC5 __CLR$ACI11=new __CLR4_4_1$AC5(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24930);}};Reader input2 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_16K_A_COPY))) {
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24931);res[2] = contentEqualsPr118(input1, input2);
        }
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24932);return res;
    }finally{__CLR4_4_1j5mj5mkylve3e7.R.flushNeeded();}}

    @Benchmark
    public boolean[] testFileRelease_2_8_0() throws IOException {try{__CLR4_4_1j5mj5mkylve3e7.R.inc(24933);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24934);final boolean[] res = new boolean[3];
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24935);try (__CLR4_4_1$AC6 __CLR$ACI12=new __CLR4_4_1$AC6(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24936);}};Reader input1 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_A), DEFAULT_CHARSET);
            __CLR4_4_1$AC6 __CLR$ACI13=new __CLR4_4_1$AC6(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24937);}};Reader input2 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_B), DEFAULT_CHARSET)) {
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24938);res[0] = contentEquals_release_2_8_0(input1, input1);
        }
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24939);try (__CLR4_4_1$AC7 __CLR$ACI14=new __CLR4_4_1$AC7(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24940);}};Reader input1 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_A), DEFAULT_CHARSET);
            __CLR4_4_1$AC7 __CLR$ACI15=new __CLR4_4_1$AC7(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24941);}};Reader input2 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_A), DEFAULT_CHARSET)) {
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24942);res[1] = contentEquals_release_2_8_0(input1, input2);
        }
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24943);try (__CLR4_4_1$AC8 __CLR$ACI16=new __CLR4_4_1$AC8(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24944);}};Reader input1 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_16K_A), DEFAULT_CHARSET);
            __CLR4_4_1$AC8 __CLR$ACI17=new __CLR4_4_1$AC8(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24945);}};Reader input2 = new InputStreamReader(getClass().getResourceAsStream(TEST_PATH_16K_A_COPY),
                DEFAULT_CHARSET)) {
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24946);res[2] = contentEquals_release_2_8_0(input1, input2);
        }
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24947);return res;
    }finally{__CLR4_4_1j5mj5mkylve3e7.R.flushNeeded();}}

    @Benchmark
    public void testStringCurrent(final Blackhole blackhole) throws IOException {try{__CLR4_4_1j5mj5mkylve3e7.R.inc(24948);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24949);for (int i = 0; (((i < 5)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24950)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24951)==0&false)); i++) {{
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24952);for (int j = 0; (((j < 5)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24953)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24954)==0&false)); j++) {{
                class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24955);try (__CLR4_4_1$AC9 __CLR$ACI18=new __CLR4_4_1$AC9(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24956);}};StringReader input1 = new StringReader(STRINGS[i]);
                    __CLR4_4_1$AC9 __CLR$ACI19=new __CLR4_4_1$AC9(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24957);}};StringReader input2 = new StringReader(STRINGS[j])) {
                    __CLR4_4_1j5mj5mkylve3e7.R.inc(24958);blackhole.consume(IOUtils.contentEquals(input1, input2));
                }
            }
        }}
    }}finally{__CLR4_4_1j5mj5mkylve3e7.R.flushNeeded();}}

    @Benchmark
    public void testStringPr118(final Blackhole blackhole) throws IOException {try{__CLR4_4_1j5mj5mkylve3e7.R.inc(24959);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24960);for (int i = 0; (((i < 5)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24961)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24962)==0&false)); i++) {{
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24963);for (int j = 0; (((j < 5)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24964)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24965)==0&false)); j++) {{
                class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24966);try (__CLR4_4_1$AC10 __CLR$ACI20=new __CLR4_4_1$AC10(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24967);}};StringReader input1 = new StringReader(STRINGS[i]);
                    __CLR4_4_1$AC10 __CLR$ACI21=new __CLR4_4_1$AC10(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24968);}};StringReader input2 = new StringReader(STRINGS[j])) {
                    __CLR4_4_1j5mj5mkylve3e7.R.inc(24969);blackhole.consume(contentEqualsPr118(input1, input2));
                }
            }
        }}
    }}finally{__CLR4_4_1j5mj5mkylve3e7.R.flushNeeded();}}

    @Benchmark
    public void testStringRelease_2_8_0(final Blackhole blackhole) throws IOException {try{__CLR4_4_1j5mj5mkylve3e7.R.inc(24970);
        __CLR4_4_1j5mj5mkylve3e7.R.inc(24971);for (int i = 0; (((i < 5)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24972)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24973)==0&false)); i++) {{
            __CLR4_4_1j5mj5mkylve3e7.R.inc(24974);for (int j = 0; (((j < 5)&&(__CLR4_4_1j5mj5mkylve3e7.R.iget(24975)!=0|true))||(__CLR4_4_1j5mj5mkylve3e7.R.iget(24976)==0&false)); j++) {{
                class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1j5mj5mkylve3e7.R.inc(24977);try (__CLR4_4_1$AC11 __CLR$ACI22=new __CLR4_4_1$AC11(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24978);}};StringReader input1 = new StringReader(STRINGS[i]);
                    __CLR4_4_1$AC11 __CLR$ACI23=new __CLR4_4_1$AC11(){{__CLR4_4_1j5mj5mkylve3e7.R.inc(24979);}};StringReader input2 = new StringReader(STRINGS[j])) {
                    __CLR4_4_1j5mj5mkylve3e7.R.inc(24980);blackhole.consume(contentEquals_release_2_8_0(input1, input2));
                }
            }
        }}
    }}finally{__CLR4_4_1j5mj5mkylve3e7.R.flushNeeded();}}

}
