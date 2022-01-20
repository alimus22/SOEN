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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link NullInputStream}.
 *
 */
public class NullInputStreamTest {static class __CLR4_4_1gxxgxxkylve2wp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22077,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Use the same message as in java.io.InputStream.reset() in OpenJDK 8.0.275-1.
    private static final String MARK_RESET_NOT_SUPPORTED = "mark/reset not supported";

    @Test
    public void testRead() throws Exception {__CLR4_4_1gxxgxxkylve2wp.R.globalSliceStart(getClass().getName(),21957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9ovapgxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gxxgxxkylve2wp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gxxgxxkylve2wp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullInputStreamTest.testRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9ovapgxx() throws Exception{try{__CLR4_4_1gxxgxxkylve2wp.R.inc(21957);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21958);final int size = 5;
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21959);final InputStream input = new TestNullInputStream(size);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21960);for (int i = 0; (((i < size)&&(__CLR4_4_1gxxgxxkylve2wp.R.iget(21961)!=0|true))||(__CLR4_4_1gxxgxxkylve2wp.R.iget(21962)==0&false)); i++) {{
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21963);assertEquals(size - i, input.available(), "Check Size [" + i + "]");
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21964);assertEquals(i, input.read(), "Check Value [" + i + "]");
        }
        }__CLR4_4_1gxxgxxkylve2wp.R.inc(21965);assertEquals(0, input.available(), "Available after contents all read");

        // Check available is zero after End of file
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21966);assertEquals(-1, input.read(), "End of File");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21967);assertEquals(0, input.available(), "Available after End of File");

        // Test reading after the end of file
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21968);try {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21969);final int result = input.read();
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21970);fail("Should have thrown an IOException, byte=[" + result + "]");
        } catch (final IOException e) {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21971);assertEquals("Read after end of file", e.getMessage());
        }

        // Close - should reset
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21972);input.close();
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21973);assertEquals(size, input.available(), "Available after close");
    }finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}

    @Test
    public void testReadByteArray() throws Exception {__CLR4_4_1gxxgxxkylve2wp.R.globalSliceStart(getClass().getName(),21974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18v46q8gye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gxxgxxkylve2wp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gxxgxxkylve2wp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullInputStreamTest.testReadByteArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18v46q8gye() throws Exception{try{__CLR4_4_1gxxgxxkylve2wp.R.inc(21974);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21975);final byte[] bytes = new byte[10];
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21976);final InputStream input = new TestNullInputStream(15);

        // Read into array
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21977);final int count1 = input.read(bytes);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21978);assertEquals(bytes.length, count1, "Read 1");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21979);for (int i = 0; (((i < count1)&&(__CLR4_4_1gxxgxxkylve2wp.R.iget(21980)!=0|true))||(__CLR4_4_1gxxgxxkylve2wp.R.iget(21981)==0&false)); i++) {{
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21982);assertEquals(i, bytes[i], "Check Bytes 1");
        }

        // Read into array
        }__CLR4_4_1gxxgxxkylve2wp.R.inc(21983);final int count2 = input.read(bytes);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21984);assertEquals(5, count2, "Read 2");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21985);for (int i = 0; (((i < count2)&&(__CLR4_4_1gxxgxxkylve2wp.R.iget(21986)!=0|true))||(__CLR4_4_1gxxgxxkylve2wp.R.iget(21987)==0&false)); i++) {{
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21988);assertEquals(count1 + i, bytes[i], "Check Bytes 2");
        }

        // End of File
        }__CLR4_4_1gxxgxxkylve2wp.R.inc(21989);final int count3 = input.read(bytes);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21990);assertEquals(-1, count3, "Read 3 (EOF)");

        // Test reading after the end of file
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21991);try {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21992);final int count4 = input.read(bytes);
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21993);fail("Should have thrown an IOException, byte=[" + count4 + "]");
        } catch (final IOException e) {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(21994);assertEquals("Read after end of file", e.getMessage());
        }

        // reset by closing
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21995);input.close();

        // Read into array using offset & length
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21996);final int offset = 2;
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21997);final int lth    = 4;
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21998);final int count5 = input.read(bytes, offset, lth);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(21999);assertEquals(lth, count5, "Read 5");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22000);for (int i = offset; (((i < lth)&&(__CLR4_4_1gxxgxxkylve2wp.R.iget(22001)!=0|true))||(__CLR4_4_1gxxgxxkylve2wp.R.iget(22002)==0&false)); i++) {{
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22003);assertEquals(i, bytes[i], "Check Bytes 2");
        }
    }}finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}

    @Test
    public void testEOFException() throws Exception {__CLR4_4_1gxxgxxkylve2wp.R.globalSliceStart(getClass().getName(),22004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttirkcgz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gxxgxxkylve2wp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gxxgxxkylve2wp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullInputStreamTest.testEOFException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttirkcgz8() throws Exception{try{__CLR4_4_1gxxgxxkylve2wp.R.inc(22004);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22005);final InputStream input = new TestNullInputStream(2, false, true);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22006);assertEquals(0, input.read(), "Read 1");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22007);assertEquals(1, input.read(), "Read 2");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22008);try {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22009);final int result = input.read();
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22010);fail("Should have thrown an EOFException, byte=[" + result + "]");
        } catch (final EOFException e) {
            // expected
        }
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22011);input.close();
    }finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}

    @Test
    public void testMarkAndReset() throws Exception {__CLR4_4_1gxxgxxkylve2wp.R.globalSliceStart(getClass().getName(),22012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwqxtqgzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gxxgxxkylve2wp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gxxgxxkylve2wp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullInputStreamTest.testMarkAndReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwqxtqgzg() throws Exception{try{__CLR4_4_1gxxgxxkylve2wp.R.inc(22012);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22013);int position = 0;
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22014);final int readlimit = 10;
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22015);@SuppressWarnings("resource") // this is actually closed
        final InputStream input = new TestNullInputStream(100, true, false);

        __CLR4_4_1gxxgxxkylve2wp.R.inc(22016);assertTrue(input.markSupported(), "Mark Should be Supported");

        // No Mark
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22017);try {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22018);input.reset();
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22019);fail("Read limit exceeded, expected IOException ");
        } catch (final IOException e) {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22020);assertEquals("No position has been marked", e.getMessage(), "No Mark IOException message");
        }

        __CLR4_4_1gxxgxxkylve2wp.R.inc(22021);for (; (((position < 3)&&(__CLR4_4_1gxxgxxkylve2wp.R.iget(22022)!=0|true))||(__CLR4_4_1gxxgxxkylve2wp.R.iget(22023)==0&false)); position++) {{
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22024);assertEquals(position, input.read(), "Read Before Mark [" + position +"]");
        }

        // Mark
        }__CLR4_4_1gxxgxxkylve2wp.R.inc(22025);input.mark(readlimit);

        // Read further
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22026);for (int i = 0; (((i < 3)&&(__CLR4_4_1gxxgxxkylve2wp.R.iget(22027)!=0|true))||(__CLR4_4_1gxxgxxkylve2wp.R.iget(22028)==0&false)); i++) {{
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22029);assertEquals(position + i, input.read(), "Read After Mark [" + i +"]");
        }

        // Reset
        }__CLR4_4_1gxxgxxkylve2wp.R.inc(22030);input.reset();

        // Read From marked position
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22031);for (int i = 0; (((i < readlimit + 1)&&(__CLR4_4_1gxxgxxkylve2wp.R.iget(22032)!=0|true))||(__CLR4_4_1gxxgxxkylve2wp.R.iget(22033)==0&false)); i++) {{
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22034);assertEquals(position + i, input.read(), "Read After Reset [" + i +"]");
        }

        // Reset after read limit passed
        }__CLR4_4_1gxxgxxkylve2wp.R.inc(22035);try {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22036);input.reset();
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22037);fail("Read limit exceeded, expected IOException ");
        } catch (final IOException e) {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22038);assertEquals("Marked position [" + position
                         + "] is no longer valid - passed the read limit ["
                         + readlimit + "]",
                         e.getMessage(),
                         "Read limit IOException message");
        }
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22039);input.close();
    }finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}

    @Test
    public void testMarkNotSupported() throws Exception {__CLR4_4_1gxxgxxkylve2wp.R.globalSliceStart(getClass().getName(),22040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgip4vh08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gxxgxxkylve2wp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gxxgxxkylve2wp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullInputStreamTest.testMarkNotSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgip4vh08() throws Exception{try{__CLR4_4_1gxxgxxkylve2wp.R.inc(22040);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22041);final InputStream input = new TestNullInputStream(100, false, true);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22042);assertFalse(input.markSupported(), "Mark Should NOT be Supported");

        __CLR4_4_1gxxgxxkylve2wp.R.inc(22043);try {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22044);input.mark(5);
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22045);fail("mark() should throw UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22046);assertEquals(MARK_RESET_NOT_SUPPORTED, e.getMessage(), "mark() error message");
        }

        __CLR4_4_1gxxgxxkylve2wp.R.inc(22047);try {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22048);input.reset();
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22049);fail("reset() should throw UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22050);assertEquals(MARK_RESET_NOT_SUPPORTED, e.getMessage(), "reset() error message");
        }
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22051);input.close();
    }finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}

    @Test
    public void testSkip() throws Exception {__CLR4_4_1gxxgxxkylve2wp.R.globalSliceStart(getClass().getName(),22052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamwh0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gxxgxxkylve2wp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gxxgxxkylve2wp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullInputStreamTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamwh0k() throws Exception{try{__CLR4_4_1gxxgxxkylve2wp.R.inc(22052);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22053);final InputStream input = new TestNullInputStream(10, true, false);
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22054);assertEquals(0, input.read(), "Read 1");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22055);assertEquals(1, input.read(), "Read 2");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22056);assertEquals(5, input.skip(5), "Skip 1");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22057);assertEquals(7, input.read(), "Read 3");
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22058);assertEquals(2, input.skip(5), "Skip 2"); // only 2 left to skip
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22059);assertEquals(-1, input.skip(5), "Skip 3 (EOF)"); // End of file
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22060);try {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22061);input.skip(5); //
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22062);fail("Expected IOException for skipping after end of file");
        } catch (final IOException e) {
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22063);assertEquals("Skip after end of file", e.getMessage(), "Skip after EOF IOException message");
        }
        __CLR4_4_1gxxgxxkylve2wp.R.inc(22064);input.close();
    }finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}


    // ------------- Test NullInputStream implementation -------------

    private static final class TestNullInputStream extends NullInputStream {
        public TestNullInputStream(final int size) {
            super(size);__CLR4_4_1gxxgxxkylve2wp.R.inc(22066);try{__CLR4_4_1gxxgxxkylve2wp.R.inc(22065);
        }finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}
        public TestNullInputStream(final int size, final boolean markSupported, final boolean throwEofException) {
            super(size, markSupported, throwEofException);__CLR4_4_1gxxgxxkylve2wp.R.inc(22068);try{__CLR4_4_1gxxgxxkylve2wp.R.inc(22067);
        }finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}
        @Override
        protected int processByte() {try{__CLR4_4_1gxxgxxkylve2wp.R.inc(22069);
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22070);return (int)getPosition() - 1;
        }finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}
        @Override
        protected void processBytes(final byte[] bytes, final int offset, final int length) {try{__CLR4_4_1gxxgxxkylve2wp.R.inc(22071);
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22072);final int startPos = (int)getPosition() - length;
            __CLR4_4_1gxxgxxkylve2wp.R.inc(22073);for (int i = offset; (((i < length)&&(__CLR4_4_1gxxgxxkylve2wp.R.iget(22074)!=0|true))||(__CLR4_4_1gxxgxxkylve2wp.R.iget(22075)==0&false)); i++) {{
                __CLR4_4_1gxxgxxkylve2wp.R.inc(22076);bytes[i] = (byte)(startPos + i);
            }
        }}finally{__CLR4_4_1gxxgxxkylve2wp.R.flushNeeded();}}

    }
}
