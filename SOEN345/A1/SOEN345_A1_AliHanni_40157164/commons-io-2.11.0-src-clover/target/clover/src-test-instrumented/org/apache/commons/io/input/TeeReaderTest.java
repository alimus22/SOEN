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
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;

import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.io.test.ThrowOnCloseReader;
import org.apache.commons.io.test.ThrowOnCloseWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link TeeReader}.
 */
public class TeeReaderTest  {static class __CLR4_4_1i1vi1vkylve35o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,23477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private StringBuilderWriter output;

    private Reader tee;

    @BeforeEach
    public void setUp() {try{__CLR4_4_1i1vi1vkylve35o.R.inc(23395);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23396);final Reader input = new CharSequenceReader("abc");
        __CLR4_4_1i1vi1vkylve35o.R.inc(23397);output = new StringBuilderWriter();
        __CLR4_4_1i1vi1vkylve35o.R.inc(23398);tee = new TeeReader(input, output);
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    /**
     * Tests that the main {@code Reader} is closed when closing the branch {@code Writer} throws an
     * exception on {@link TeeReader#close()}, if specified to do so.
     */
    @Test
    public void testCloseBranchIOException() throws Exception {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owpb1ki1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testCloseBranchIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owpb1ki1z() throws Exception{try{__CLR4_4_1i1vi1vkylve35o.R.inc(23399);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23400);final StringReader goodR = mock(StringReader.class);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23401);final Writer badW = new ThrowOnCloseWriter();

        __CLR4_4_1i1vi1vkylve35o.R.inc(23402);final TeeReader nonClosingTr = new TeeReader(goodR, badW, false);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23403);nonClosingTr.close();
        __CLR4_4_1i1vi1vkylve35o.R.inc(23404);verify(goodR).close();

        __CLR4_4_1i1vi1vkylve35o.R.inc(23405);final TeeReader closingTr = new TeeReader(goodR, badW, true);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23406);try {
            __CLR4_4_1i1vi1vkylve35o.R.inc(23407);closingTr.close();
            __CLR4_4_1i1vi1vkylve35o.R.inc(23408);fail("Expected " + IOException.class.getName());
        } catch (final IOException e) {
            __CLR4_4_1i1vi1vkylve35o.R.inc(23409);verify(goodR, times(2)).close();
        }
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    /**
     * Tests that the branch {@code Writer} is closed when closing the main {@code Reader} throws an
     * exception on {@link TeeReader#close()}, if specified to do so.
     */
    @Test
    public void testCloseMainIOException() throws IOException {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udxvrli2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testCloseMainIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udxvrli2a() throws IOException{try{__CLR4_4_1i1vi1vkylve35o.R.inc(23410);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23411);final Reader badR = new ThrowOnCloseReader();
        __CLR4_4_1i1vi1vkylve35o.R.inc(23412);final StringWriter goodW = mock(StringWriter.class);

        __CLR4_4_1i1vi1vkylve35o.R.inc(23413);final TeeReader nonClosingTr = new TeeReader(badR, goodW, false);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23414);try {
            __CLR4_4_1i1vi1vkylve35o.R.inc(23415);nonClosingTr.close();
            __CLR4_4_1i1vi1vkylve35o.R.inc(23416);fail("Expected " + IOException.class.getName());
        } catch (final IOException e) {
            __CLR4_4_1i1vi1vkylve35o.R.inc(23417);verify(goodW, never()).close();
        }

        __CLR4_4_1i1vi1vkylve35o.R.inc(23418);final TeeReader closingTr = new TeeReader(badR, goodW, true);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23419);try {
            __CLR4_4_1i1vi1vkylve35o.R.inc(23420);closingTr.close();
            __CLR4_4_1i1vi1vkylve35o.R.inc(23421);fail("Expected " + IOException.class.getName());
        } catch (final IOException e) {
            //Assert.assertTrue(goodW.closed);
            __CLR4_4_1i1vi1vkylve35o.R.inc(23422);verify(goodW).close();
        }
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    @Test
    public void testMarkReset() throws Exception {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116spexi2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testMarkReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116spexi2n() throws Exception{try{__CLR4_4_1i1vi1vkylve35o.R.inc(23423);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23424);assertEquals('a', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23425);tee.mark(1);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23426);assertEquals('b', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23427);tee.reset();
        __CLR4_4_1i1vi1vkylve35o.R.inc(23428);assertEquals('b', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23429);assertEquals('c', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23430);assertEquals(-1, tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23431);assertEquals("abbc", output.toString());
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    @Test
    public void testReadEverything() throws Exception {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qsi5tui2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testReadEverything",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qsi5tui2w() throws Exception{try{__CLR4_4_1i1vi1vkylve35o.R.inc(23432);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23433);assertEquals('a', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23434);assertEquals('b', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23435);assertEquals('c', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23436);assertEquals(-1, tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23437);assertEquals("abc", output.toString());
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    @Test
    public void testReadNothing() {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16by22ci32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testReadNothing",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16by22ci32(){try{__CLR4_4_1i1vi1vkylve35o.R.inc(23438);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23439);assertEquals("", output.toString());
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    @Test
    public void testReadOneChar() throws Exception {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cwzlmji34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testReadOneChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cwzlmji34() throws Exception{try{__CLR4_4_1i1vi1vkylve35o.R.inc(23440);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23441);assertEquals('a', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23442);assertEquals("a", output.toString());
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    @Test
    public void testReadToArray() throws Exception {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tp3t8di37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testReadToArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tp3t8di37() throws Exception{try{__CLR4_4_1i1vi1vkylve35o.R.inc(23443);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23444);final char[] buffer = new char[8];
        __CLR4_4_1i1vi1vkylve35o.R.inc(23445);assertEquals(3, tee.read(buffer));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23446);assertEquals('a', buffer[0]);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23447);assertEquals('b', buffer[1]);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23448);assertEquals('c', buffer[2]);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23449);assertEquals(-1, tee.read(buffer));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23450);assertEquals("abc", output.toString());
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    @Test
    public void testReadToArrayWithOffset() throws Exception {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u0764qi3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testReadToArrayWithOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u0764qi3f() throws Exception{try{__CLR4_4_1i1vi1vkylve35o.R.inc(23451);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23452);final char[] buffer = new char[8];
        __CLR4_4_1i1vi1vkylve35o.R.inc(23453);assertEquals(3, tee.read(buffer, 4, 4));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23454);assertEquals('a', buffer[4]);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23455);assertEquals('b', buffer[5]);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23456);assertEquals('c', buffer[6]);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23457);assertEquals(-1, tee.read(buffer, 4, 4));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23458);assertEquals("abc", output.toString());
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    @Test
    public void testReadToCharBuffer() throws Exception {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1brzhr4i3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testReadToCharBuffer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1brzhr4i3n() throws Exception{try{__CLR4_4_1i1vi1vkylve35o.R.inc(23459);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23460);final CharBuffer buffer = CharBuffer.allocate(8);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23461);buffer.position(1);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23462);assertEquals(3, tee.read(buffer));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23463);assertEquals(4, buffer.position());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23464);buffer.flip();
        __CLR4_4_1i1vi1vkylve35o.R.inc(23465);buffer.position(1);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23466);assertEquals('a', buffer.charAt(0));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23467);assertEquals('b', buffer.charAt(1));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23468);assertEquals('c', buffer.charAt(2));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23469);assertEquals(-1, tee.read(buffer));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23470);assertEquals("abc", output.toString());
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

    @Test
    public void testSkip() throws Exception {__CLR4_4_1i1vi1vkylve35o.R.globalSliceStart(getClass().getName(),23471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamwi3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i1vi1vkylve35o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i1vi1vkylve35o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeReaderTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamwi3z() throws Exception{try{__CLR4_4_1i1vi1vkylve35o.R.inc(23471);
        __CLR4_4_1i1vi1vkylve35o.R.inc(23472);assertEquals('a', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23473);assertEquals(1, tee.skip(1));
        __CLR4_4_1i1vi1vkylve35o.R.inc(23474);assertEquals('c', tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23475);assertEquals(-1, tee.read());
        __CLR4_4_1i1vi1vkylve35o.R.inc(23476);assertEquals("ac", output.toString());
    }finally{__CLR4_4_1i1vi1vkylve35o.R.flushNeeded();}}

}