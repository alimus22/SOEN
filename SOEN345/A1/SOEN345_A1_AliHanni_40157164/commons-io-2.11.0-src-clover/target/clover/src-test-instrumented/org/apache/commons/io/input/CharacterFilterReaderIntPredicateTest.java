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

import java.io.IOException;
import java.io.StringReader;
import java.util.function.IntPredicate;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link CharacterFilterReader} with an {@link IntPredicate}.
 */
public class CharacterFilterReaderIntPredicateTest {static class __CLR4_4_1ghkghkkylve2rk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,21432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testInputSize0FilterAll() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vyi7spghk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testInputSize0FilterAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vyi7spghk() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21368);
        __CLR4_4_1ghkghkkylve2rk.R.inc(21369);final StringReader input = new StringReader(StringUtils.EMPTY);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21370);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21371);}};CharacterFilterReader reader = new CharacterFilterReader(input, ch -> true)) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21372);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

    @Test
    public void testInputSize1FilterAll() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3tvigghp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testInputSize1FilterAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3tvigghp() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21373);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21374);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21375);}};StringReader input = new StringReader("a");
                __CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21376);}};CharacterFilterReader reader = new CharacterFilterReader(input, ch -> true)) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21377);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterAll() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b51wuhghu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testInputSize2FilterAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b51wuhghu() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21378);
        __CLR4_4_1ghkghkkylve2rk.R.inc(21379);final StringReader input = new StringReader("aa");
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21380);try (__CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21381);}};CharacterFilterReader reader = new CharacterFilterReader(input, ch -> true)) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21382);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterFirst() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11uorveghz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testInputSize2FilterFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11uorveghz() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21383);
        __CLR4_4_1ghkghkkylve2rk.R.inc(21384);final StringReader input = new StringReader("ab");
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21385);try (__CLR4_4_1$AC3 __CLR$ACI4=new __CLR4_4_1$AC3(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21386);}};CharacterFilterReader reader = new CharacterFilterReader(input, ch -> ch == 'a')) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21387);assertEquals('b', reader.read());
            __CLR4_4_1ghkghkkylve2rk.R.inc(21388);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

    @Test
    public void testInputSize2FilterLast() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9oer6gi5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testInputSize2FilterLast",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9oer6gi5() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21389);
        __CLR4_4_1ghkghkkylve2rk.R.inc(21390);final StringReader input = new StringReader("ab");
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21391);try (__CLR4_4_1$AC4 __CLR$ACI5=new __CLR4_4_1$AC4(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21392);}};CharacterFilterReader reader = new CharacterFilterReader(input, ch -> ch == 'b')) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21393);assertEquals('a', reader.read());
            __CLR4_4_1ghkghkkylve2rk.R.inc(21394);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

    @Test
    public void testInputSize5FilterWhitespace() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abxeq0gib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testInputSize5FilterWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abxeq0gib() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21395);
        __CLR4_4_1ghkghkkylve2rk.R.inc(21396);final StringReader input = new StringReader(" a b ");
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21397);try (__CLR4_4_1$AC5 __CLR$ACI6=new __CLR4_4_1$AC5(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21398);}};CharacterFilterReader reader = new CharacterFilterReader(input, Character::isWhitespace)) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21399);assertEquals('a', reader.read());
            __CLR4_4_1ghkghkkylve2rk.R.inc(21400);assertEquals('b', reader.read());
            __CLR4_4_1ghkghkkylve2rk.R.inc(21401);assertEquals(-1, reader.read());
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

    @Test
    public void testReadIntoBuffer() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzs50vgii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testReadIntoBuffer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzs50vgii() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21402);
        __CLR4_4_1ghkghkkylve2rk.R.inc(21403);final StringReader input = new StringReader("ababcabcd");
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21404);try (__CLR4_4_1$AC6 __CLR$ACI7=new __CLR4_4_1$AC6(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21405);}};CharacterFilterReader reader = new CharacterFilterReader(input, ch -> ch == 'b')) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21406);final char[] buff = new char[9];
            __CLR4_4_1ghkghkkylve2rk.R.inc(21407);final int charCount = reader.read(buff);
            __CLR4_4_1ghkghkkylve2rk.R.inc(21408);assertEquals(6, charCount);
            __CLR4_4_1ghkghkkylve2rk.R.inc(21409);assertEquals("aacacd", new String(buff, 0, charCount));
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

    @Test
    public void testReadIntoBufferFilterWhitespace() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c49rlogiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testReadIntoBufferFilterWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c49rlogiq() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21410);
        __CLR4_4_1ghkghkkylve2rk.R.inc(21411);final StringReader input = new StringReader(" a b a b c a b c d ");
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21412);try (__CLR4_4_1$AC7 __CLR$ACI8=new __CLR4_4_1$AC7(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21413);}};CharacterFilterReader reader = new CharacterFilterReader(input, Character::isWhitespace)) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21414);final char[] buff = new char[19];
            __CLR4_4_1ghkghkkylve2rk.R.inc(21415);final int charCount = reader.read(buff);
            __CLR4_4_1ghkghkkylve2rk.R.inc(21416);assertEquals(9, charCount);
            __CLR4_4_1ghkghkkylve2rk.R.inc(21417);assertEquals("ababcabcd", new String(buff, 0, charCount));
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

    @Test
    public void testReadUsingReader() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0fa1mgiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testReadUsingReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0fa1mgiy() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21418);
        __CLR4_4_1ghkghkkylve2rk.R.inc(21419);final StringReader input = new StringReader("ababcabcd");
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21420);try (__CLR4_4_1$AC8 __CLR$ACI9=new __CLR4_4_1$AC8(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21421);}};StringBuilderWriter output = new StringBuilderWriter();
                __CLR4_4_1$AC8 __CLR$ACI10=new __CLR4_4_1$AC8(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21422);}};CharacterFilterReader reader = new CharacterFilterReader(input, ch -> ch == 'b')) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21423);IOUtils.copy(reader, output);
            __CLR4_4_1ghkghkkylve2rk.R.inc(21424);assertEquals("aacacd", output.toString());
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

    @Test
    public void testReadUsingReaderFilterWhitespace() throws IOException {__CLR4_4_1ghkghkkylve2rk.R.globalSliceStart(getClass().getName(),21425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8fdhhgj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ghkghkkylve2rk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ghkghkkylve2rk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.CharacterFilterReaderIntPredicateTest.testReadUsingReaderFilterWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8fdhhgj5() throws IOException{try{__CLR4_4_1ghkghkkylve2rk.R.inc(21425);
        __CLR4_4_1ghkghkkylve2rk.R.inc(21426);final StringReader input = new StringReader(" a b a b c a b c d ");
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ghkghkkylve2rk.R.inc(21427);try (__CLR4_4_1$AC9 __CLR$ACI11=new __CLR4_4_1$AC9(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21428);}};StringBuilderWriter output = new StringBuilderWriter();
                __CLR4_4_1$AC9 __CLR$ACI12=new __CLR4_4_1$AC9(){{__CLR4_4_1ghkghkkylve2rk.R.inc(21429);}};CharacterFilterReader reader = new CharacterFilterReader(input, Character::isWhitespace)) {
            __CLR4_4_1ghkghkkylve2rk.R.inc(21430);IOUtils.copy(reader, output);
            __CLR4_4_1ghkghkkylve2rk.R.inc(21431);assertEquals("ababcabcd", output.toString());
        }
    }finally{__CLR4_4_1ghkghkkylve2rk.R.flushNeeded();}}

}