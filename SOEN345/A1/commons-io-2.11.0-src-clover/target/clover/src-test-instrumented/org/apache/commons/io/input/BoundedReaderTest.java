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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

public class BoundedReaderTest {static class __CLR4_4_1fznfznkylve2on{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,20856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String STRING_END_NO_EOL = "0\n1\n2";

    private static final String STRING_END_EOL = "0\n1\n2\n";

    private final Reader sr = new BufferedReader(new StringReader("01234567890"));

    private final Reader shortReader = new BufferedReader(new StringReader("01"));

    @Test
    public void readTillEnd() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ooffihfzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.readTillEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ooffihfzn() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20723);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20724);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1fznfznkylve2on.R.inc(20725);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20726);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20727);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20728);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20729);assertEquals(-1, mr.read());
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void shortReader() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tx8zpifzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.shortReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tx8zpifzu() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20730);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20731);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1fznfznkylve2on.R.inc(20732);}};final BoundedReader mr = new BoundedReader(shortReader, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20733);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20734);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20735);assertEquals(-1, mr.read());
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void readMulti() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxhf6yg00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.readMulti",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxhf6yg00() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20736);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20737);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1fznfznkylve2on.R.inc(20738);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20739);final char[] cbuf = new char[4];
            __CLR4_4_1fznfznkylve2on.R.inc(20740);Arrays.fill(cbuf, 'X');
            __CLR4_4_1fznfznkylve2on.R.inc(20741);final int read = mr.read(cbuf, 0, 4);
            __CLR4_4_1fznfznkylve2on.R.inc(20742);assertEquals(3, read);
            __CLR4_4_1fznfznkylve2on.R.inc(20743);assertEquals('0', cbuf[0]);
            __CLR4_4_1fznfznkylve2on.R.inc(20744);assertEquals('1', cbuf[1]);
            __CLR4_4_1fznfznkylve2on.R.inc(20745);assertEquals('2', cbuf[2]);
            __CLR4_4_1fznfznkylve2on.R.inc(20746);assertEquals('X', cbuf[3]);
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void readMultiWithOffset() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoylibg0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.readMultiWithOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoylibg0b() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20747);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20748);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1fznfznkylve2on.R.inc(20749);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20750);final char[] cbuf = new char[4];
            __CLR4_4_1fznfznkylve2on.R.inc(20751);Arrays.fill(cbuf, 'X');
            __CLR4_4_1fznfznkylve2on.R.inc(20752);final int read = mr.read(cbuf, 1, 2);
            __CLR4_4_1fznfznkylve2on.R.inc(20753);assertEquals(2, read);
            __CLR4_4_1fznfznkylve2on.R.inc(20754);assertEquals('X', cbuf[0]);
            __CLR4_4_1fznfznkylve2on.R.inc(20755);assertEquals('0', cbuf[1]);
            __CLR4_4_1fznfznkylve2on.R.inc(20756);assertEquals('1', cbuf[2]);
            __CLR4_4_1fznfznkylve2on.R.inc(20757);assertEquals('X', cbuf[3]);
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void markReset() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlip9zg0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.markReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlip9zg0m() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20758);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20759);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1fznfznkylve2on.R.inc(20760);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20761);mr.mark(3);
            __CLR4_4_1fznfznkylve2on.R.inc(20762);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20763);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20764);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20765);mr.reset();
            __CLR4_4_1fznfznkylve2on.R.inc(20766);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20767);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20768);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20769);assertEquals(-1, mr.read());
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void markResetWithMarkOutsideBoundedReaderMax() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hx124lg0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.markResetWithMarkOutsideBoundedReaderMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hx124lg0y() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20770);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20771);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1fznfznkylve2on.R.inc(20772);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20773);mr.mark(4);
            __CLR4_4_1fznfznkylve2on.R.inc(20774);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20775);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20776);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20777);assertEquals(-1, mr.read());
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void markResetWithMarkOutsideBoundedReaderMaxAndInitialOffset() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cftqbpg16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.markResetWithMarkOutsideBoundedReaderMaxAndInitialOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cftqbpg16() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20778);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20779);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1fznfznkylve2on.R.inc(20780);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20781);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20782);mr.mark(3);
            __CLR4_4_1fznfznkylve2on.R.inc(20783);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20784);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20785);assertEquals(-1, mr.read());
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void markResetFromOffset1() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197t8fbg1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.markResetFromOffset1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197t8fbg1e() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20786);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20787);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1fznfznkylve2on.R.inc(20788);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20789);mr.mark(3);
            __CLR4_4_1fznfznkylve2on.R.inc(20790);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20791);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20792);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20793);assertEquals(-1, mr.read());
            __CLR4_4_1fznfznkylve2on.R.inc(20794);mr.reset();
            __CLR4_4_1fznfznkylve2on.R.inc(20795);mr.mark(1);
            __CLR4_4_1fznfznkylve2on.R.inc(20796);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20797);assertEquals(-1, mr.read());
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void markResetMarkMore() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atbglxg1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.markResetMarkMore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atbglxg1q() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20798);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20799);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1fznfznkylve2on.R.inc(20800);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20801);mr.mark(4);
            __CLR4_4_1fznfznkylve2on.R.inc(20802);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20803);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20804);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20805);mr.reset();
            __CLR4_4_1fznfznkylve2on.R.inc(20806);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20807);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20808);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20809);assertEquals(-1, mr.read());
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void skipTest() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wtwigg22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.skipTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wtwigg22() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20810);
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20811);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1fznfznkylve2on.R.inc(20812);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
            __CLR4_4_1fznfznkylve2on.R.inc(20813);mr.skip(2);
            __CLR4_4_1fznfznkylve2on.R.inc(20814);mr.read();
            __CLR4_4_1fznfznkylve2on.R.inc(20815);assertEquals(-1, mr.read());
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void closeTest() throws IOException {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113o8y7g28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.closeTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113o8y7g28() throws IOException{try{__CLR4_4_1fznfznkylve2on.R.inc(20816);
        __CLR4_4_1fznfznkylve2on.R.inc(20817);final AtomicBoolean closed = new AtomicBoolean(false);
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20818);try (__CLR4_4_1$AC10 __CLR$ACI10=new __CLR4_4_1$AC10(){{__CLR4_4_1fznfznkylve2on.R.inc(20819);}};final Reader sr = new BufferedReader(new StringReader("01234567890")) {
            @Override
            public void close() throws IOException {try{__CLR4_4_1fznfznkylve2on.R.inc(20820);
                __CLR4_4_1fznfznkylve2on.R.inc(20821);closed.set(true);
                __CLR4_4_1fznfznkylve2on.R.inc(20822);super.close();
            }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}
        }) {

            class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20823);try (__CLR4_4_1$AC11 __CLR$ACI11=new __CLR4_4_1$AC11(){{__CLR4_4_1fznfznkylve2on.R.inc(20824);}};final BoundedReader mr = new BoundedReader(sr, 3)) {
                // nothing
            }
        }
        __CLR4_4_1fznfznkylve2on.R.inc(20825);assertTrue(closed.get());
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    private void testLineNumberReader(final Reader source) throws IOException {try{__CLR4_4_1fznfznkylve2on.R.inc(20826);
        class __CLR4_4_1$AC12 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20827);try (__CLR4_4_1$AC12 __CLR$ACI12=new __CLR4_4_1$AC12(){{__CLR4_4_1fznfznkylve2on.R.inc(20828);}};LineNumberReader reader = new LineNumberReader(new BoundedReader(source, 10_000_000))) {
            __CLR4_4_1fznfznkylve2on.R.inc(20829);while ((((reader.readLine() != null)&&(__CLR4_4_1fznfznkylve2on.R.iget(20830)!=0|true))||(__CLR4_4_1fznfznkylve2on.R.iget(20831)==0&false))) {{
                // noop
            }
        }}
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void testLineNumberReaderAndStringReaderLastLineEolNo() {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9cn7dg2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.testLineNumberReaderAndStringReaderLastLineEolNo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9cn7dg2o(){try{__CLR4_4_1fznfznkylve2on.R.inc(20832);
        __CLR4_4_1fznfznkylve2on.R.inc(20833);assertTimeout(Duration.ofMillis(5000), () -> testLineNumberReader(new StringReader(STRING_END_NO_EOL)));
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void testLineNumberReaderAndStringReaderLastLineEolYes() {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_117rqltg2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.testLineNumberReaderAndStringReaderLastLineEolYes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_117rqltg2q(){try{__CLR4_4_1fznfznkylve2on.R.inc(20834);
        __CLR4_4_1fznfznkylve2on.R.inc(20835);assertTimeout(Duration.ofMillis(5000), () -> testLineNumberReader(new StringReader(STRING_END_EOL)));
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void testLineNumberReaderAndFileReaderLastLineEolNo() {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fe8va4g2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.testLineNumberReaderAndFileReaderLastLineEolNo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fe8va4g2s(){try{__CLR4_4_1fznfznkylve2on.R.inc(20836);
        __CLR4_4_1fznfznkylve2on.R.inc(20837);assertTimeout(Duration.ofMillis(5000), () -> testLineNumberReaderAndFileReaderLastLine(STRING_END_NO_EOL));
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void testLineNumberReaderAndFileReaderLastLineEolYes() {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjlz1ig2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.testLineNumberReaderAndFileReaderLastLineEolYes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjlz1ig2u(){try{__CLR4_4_1fznfznkylve2on.R.inc(20838);
        __CLR4_4_1fznfznkylve2on.R.inc(20839);assertTimeout(Duration.ofMillis(5000), () -> testLineNumberReaderAndFileReaderLastLine(STRING_END_EOL));
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    public void testLineNumberReaderAndFileReaderLastLine(final String data) throws IOException {try{__CLR4_4_1fznfznkylve2on.R.inc(20840);
        __CLR4_4_1fznfznkylve2on.R.inc(20841);final Path path = Files.createTempFile(getClass().getSimpleName(), ".txt");
        __CLR4_4_1fznfznkylve2on.R.inc(20842);try {
            __CLR4_4_1fznfznkylve2on.R.inc(20843);final File file = path.toFile();
            __CLR4_4_1fznfznkylve2on.R.inc(20844);FileUtils.write(file, data, StandardCharsets.ISO_8859_1);
            class __CLR4_4_1$AC13 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20845);try (__CLR4_4_1$AC13 __CLR$ACI13=new __CLR4_4_1$AC13(){{__CLR4_4_1fznfznkylve2on.R.inc(20846);}};Reader source = Files.newBufferedReader(file.toPath())) {
                __CLR4_4_1fznfznkylve2on.R.inc(20847);testLineNumberReader(source);
            }
        } finally {
            __CLR4_4_1fznfznkylve2on.R.inc(20848);Files.delete(path);
        }
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}

    @Test
    public void testReadBytesEOF() {__CLR4_4_1fznfznkylve2on.R.globalSliceStart(getClass().getName(),20849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66g0g35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fznfznkylve2on.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fznfznkylve2on.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.BoundedReaderTest.testReadBytesEOF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66g0g35(){try{__CLR4_4_1fznfznkylve2on.R.inc(20849);
        __CLR4_4_1fznfznkylve2on.R.inc(20850);assertTimeout(Duration.ofMillis(5000), () -> {
            __CLR4_4_1fznfznkylve2on.R.inc(20851);final BoundedReader mr = new BoundedReader(sr, 3);
            class __CLR4_4_1$AC14 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1fznfznkylve2on.R.inc(20852);try (__CLR4_4_1$AC14 __CLR$ACI14=new __CLR4_4_1$AC14(){{__CLR4_4_1fznfznkylve2on.R.inc(20853);}};BufferedReader br = new BufferedReader(mr)) {
                __CLR4_4_1fznfznkylve2on.R.inc(20854);br.readLine();
                __CLR4_4_1fznfznkylve2on.R.inc(20855);br.readLine();
            }
        });
    }finally{__CLR4_4_1fznfznkylve2on.R.flushNeeded();}}
}
