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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.test.ThrowOnCloseInputStream;
import org.apache.commons.io.test.ThrowOnCloseOutputStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link TeeInputStream}.
 */
public class TeeInputStreamTest  {static class __CLR4_4_1hzxhzxkylve35b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,23395,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String ASCII = "US-ASCII";

    private InputStream tee;

    private ByteArrayOutputStream output;

    @BeforeEach
    public void setUp() throws Exception {try{__CLR4_4_1hzxhzxkylve35b.R.inc(23325);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23326);final InputStream input = new ByteArrayInputStream("abc".getBytes(ASCII));
        __CLR4_4_1hzxhzxkylve35b.R.inc(23327);output = new ByteArrayOutputStream();
        __CLR4_4_1hzxhzxkylve35b.R.inc(23328);tee = new TeeInputStream(input, output);
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

    @Test
    public void testReadNothing() throws Exception {__CLR4_4_1hzxhzxkylve35b.R.globalSliceStart(getClass().getName(),23329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16by22ci01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzxhzxkylve35b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzxhzxkylve35b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeInputStreamTest.testReadNothing",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16by22ci01() throws Exception{try{__CLR4_4_1hzxhzxkylve35b.R.inc(23329);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23330);assertEquals("", new String(output.toString(ASCII)));
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

    @Test
    public void testReadOneByte() throws Exception {__CLR4_4_1hzxhzxkylve35b.R.globalSliceStart(getClass().getName(),23331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131nk2bi03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzxhzxkylve35b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzxhzxkylve35b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeInputStreamTest.testReadOneByte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131nk2bi03() throws Exception{try{__CLR4_4_1hzxhzxkylve35b.R.inc(23331);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23332);assertEquals('a', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23333);assertEquals("a", new String(output.toString(ASCII)));
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

    @Test
    public void testReadEverything() throws Exception {__CLR4_4_1hzxhzxkylve35b.R.globalSliceStart(getClass().getName(),23334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qsi5tui06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzxhzxkylve35b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzxhzxkylve35b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeInputStreamTest.testReadEverything",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qsi5tui06() throws Exception{try{__CLR4_4_1hzxhzxkylve35b.R.inc(23334);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23335);assertEquals('a', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23336);assertEquals('b', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23337);assertEquals('c', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23338);assertEquals(-1, tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23339);assertEquals("abc", new String(output.toString(ASCII)));
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

    @Test
    public void testReadToArray() throws Exception {__CLR4_4_1hzxhzxkylve35b.R.globalSliceStart(getClass().getName(),23340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tp3t8di0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzxhzxkylve35b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzxhzxkylve35b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeInputStreamTest.testReadToArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tp3t8di0c() throws Exception{try{__CLR4_4_1hzxhzxkylve35b.R.inc(23340);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23341);final byte[] buffer = new byte[8];
        __CLR4_4_1hzxhzxkylve35b.R.inc(23342);assertEquals(3, tee.read(buffer));
        __CLR4_4_1hzxhzxkylve35b.R.inc(23343);assertEquals('a', buffer[0]);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23344);assertEquals('b', buffer[1]);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23345);assertEquals('c', buffer[2]);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23346);assertEquals(-1, tee.read(buffer));
        __CLR4_4_1hzxhzxkylve35b.R.inc(23347);assertEquals("abc", new String(output.toString(ASCII)));
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

    @Test
    public void testReadToArrayWithOffset() throws Exception {__CLR4_4_1hzxhzxkylve35b.R.globalSliceStart(getClass().getName(),23348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u0764qi0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzxhzxkylve35b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzxhzxkylve35b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeInputStreamTest.testReadToArrayWithOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u0764qi0k() throws Exception{try{__CLR4_4_1hzxhzxkylve35b.R.inc(23348);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23349);final byte[] buffer = new byte[8];
        __CLR4_4_1hzxhzxkylve35b.R.inc(23350);assertEquals(3, tee.read(buffer, 4, 4));
        __CLR4_4_1hzxhzxkylve35b.R.inc(23351);assertEquals('a', buffer[4]);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23352);assertEquals('b', buffer[5]);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23353);assertEquals('c', buffer[6]);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23354);assertEquals(-1, tee.read(buffer, 4, 4));
        __CLR4_4_1hzxhzxkylve35b.R.inc(23355);assertEquals("abc", new String(output.toString(ASCII)));
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

    @Test
    public void testSkip() throws Exception {__CLR4_4_1hzxhzxkylve35b.R.globalSliceStart(getClass().getName(),23356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamwi0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzxhzxkylve35b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzxhzxkylve35b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeInputStreamTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamwi0s() throws Exception{try{__CLR4_4_1hzxhzxkylve35b.R.inc(23356);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23357);assertEquals('a', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23358);assertEquals(1, tee.skip(1));
        __CLR4_4_1hzxhzxkylve35b.R.inc(23359);assertEquals('c', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23360);assertEquals(-1, tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23361);assertEquals("ac", new String(output.toString(ASCII)));
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

    @Test
    public void testMarkReset() throws Exception {__CLR4_4_1hzxhzxkylve35b.R.globalSliceStart(getClass().getName(),23362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116spexi0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzxhzxkylve35b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzxhzxkylve35b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeInputStreamTest.testMarkReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116spexi0y() throws Exception{try{__CLR4_4_1hzxhzxkylve35b.R.inc(23362);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23363);assertEquals('a', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23364);tee.mark(1);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23365);assertEquals('b', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23366);tee.reset();
        __CLR4_4_1hzxhzxkylve35b.R.inc(23367);assertEquals('b', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23368);assertEquals('c', tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23369);assertEquals(-1, tee.read());
        __CLR4_4_1hzxhzxkylve35b.R.inc(23370);assertEquals("abbc", new String(output.toString(ASCII)));
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

    /**
     * Tests that the main {@code InputStream} is closed when closing the branch {@code OutputStream} throws an
     * exception on {@link TeeInputStream#close()}, if specified to do so.
     */
    @Test
    public void testCloseBranchIOException() throws Exception {__CLR4_4_1hzxhzxkylve35b.R.globalSliceStart(getClass().getName(),23371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owpb1ki17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzxhzxkylve35b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzxhzxkylve35b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeInputStreamTest.testCloseBranchIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owpb1ki17() throws Exception{try{__CLR4_4_1hzxhzxkylve35b.R.inc(23371);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23372);final ByteArrayInputStream goodIs = mock(ByteArrayInputStream.class);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23373);final OutputStream badOs = new ThrowOnCloseOutputStream();

        __CLR4_4_1hzxhzxkylve35b.R.inc(23374);final TeeInputStream nonClosingTis = new TeeInputStream(goodIs, badOs, false);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23375);nonClosingTis.close();
        __CLR4_4_1hzxhzxkylve35b.R.inc(23376);verify(goodIs).close();

        __CLR4_4_1hzxhzxkylve35b.R.inc(23377);final TeeInputStream closingTis = new TeeInputStream(goodIs, badOs, true);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23378);try {
            __CLR4_4_1hzxhzxkylve35b.R.inc(23379);closingTis.close();
            __CLR4_4_1hzxhzxkylve35b.R.inc(23380);fail("Expected " + IOException.class.getName());
        } catch (final IOException e) {
            __CLR4_4_1hzxhzxkylve35b.R.inc(23381);verify(goodIs, times(2)).close();
        }
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

    /**
     * Tests that the branch {@code OutputStream} is closed when closing the main {@code InputStream} throws an
     * exception on {@link TeeInputStream#close()}, if specified to do so.
     */
    @Test
    public void testCloseMainIOException() throws IOException {__CLR4_4_1hzxhzxkylve35b.R.globalSliceStart(getClass().getName(),23382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udxvrli1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hzxhzxkylve35b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hzxhzxkylve35b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.TeeInputStreamTest.testCloseMainIOException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udxvrli1i() throws IOException{try{__CLR4_4_1hzxhzxkylve35b.R.inc(23382);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23383);final InputStream badIs = new ThrowOnCloseInputStream();
        __CLR4_4_1hzxhzxkylve35b.R.inc(23384);final ByteArrayOutputStream goodOs = mock(ByteArrayOutputStream.class);

        __CLR4_4_1hzxhzxkylve35b.R.inc(23385);final TeeInputStream nonClosingTis = new TeeInputStream(badIs, goodOs, false);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23386);try {
            __CLR4_4_1hzxhzxkylve35b.R.inc(23387);nonClosingTis.close();
            __CLR4_4_1hzxhzxkylve35b.R.inc(23388);fail("Expected " + IOException.class.getName());
        } catch (final IOException e) {
            __CLR4_4_1hzxhzxkylve35b.R.inc(23389);verify(goodOs, never()).close();
        }

        __CLR4_4_1hzxhzxkylve35b.R.inc(23390);final TeeInputStream closingTis = new TeeInputStream(badIs, goodOs, true);
        __CLR4_4_1hzxhzxkylve35b.R.inc(23391);try {
            __CLR4_4_1hzxhzxkylve35b.R.inc(23392);closingTis.close();
            __CLR4_4_1hzxhzxkylve35b.R.inc(23393);fail("Expected " + IOException.class.getName());
        } catch (final IOException e) {
            __CLR4_4_1hzxhzxkylve35b.R.inc(23394);verify(goodOs).close();
        }
    }finally{__CLR4_4_1hzxhzxkylve35b.R.flushNeeded();}}

}
