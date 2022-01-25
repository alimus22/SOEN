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
import java.io.Reader;

import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link NullReader}.
 *
 */
public class NullReaderTest {static class __CLR4_4_1h19h19kylve2x1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22194,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Use the same message as in java.io.InputStream.reset() in OpenJDK 8.0.275-1.
    private static final String MARK_RESET_NOT_SUPPORTED = "mark/reset not supported";

    @Test
    public void testRead() throws Exception {__CLR4_4_1h19h19kylve2x1.R.globalSliceStart(getClass().getName(),22077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9ovaph19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h19h19kylve2x1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h19h19kylve2x1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullReaderTest.testRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9ovaph19() throws Exception{try{__CLR4_4_1h19h19kylve2x1.R.inc(22077);
        __CLR4_4_1h19h19kylve2x1.R.inc(22078);final int size = 5;
        __CLR4_4_1h19h19kylve2x1.R.inc(22079);final TestNullReader reader = new TestNullReader(size);
        __CLR4_4_1h19h19kylve2x1.R.inc(22080);for (int i = 0; (((i < size)&&(__CLR4_4_1h19h19kylve2x1.R.iget(22081)!=0|true))||(__CLR4_4_1h19h19kylve2x1.R.iget(22082)==0&false)); i++) {{
            __CLR4_4_1h19h19kylve2x1.R.inc(22083);assertEquals(i, reader.read(), "Check Value [" + i + "]");
        }

        // Check End of File
        }__CLR4_4_1h19h19kylve2x1.R.inc(22084);assertEquals(-1, reader.read(), "End of File");

        // Test reading after the end of file
        __CLR4_4_1h19h19kylve2x1.R.inc(22085);try {
            __CLR4_4_1h19h19kylve2x1.R.inc(22086);final int result = reader.read();
            __CLR4_4_1h19h19kylve2x1.R.inc(22087);fail("Should have thrown an IOException, value=[" + result + "]");
        } catch (final IOException e) {
            __CLR4_4_1h19h19kylve2x1.R.inc(22088);assertEquals("Read after end of file", e.getMessage());
        }

        // Close - should reset
        __CLR4_4_1h19h19kylve2x1.R.inc(22089);reader.close();
        __CLR4_4_1h19h19kylve2x1.R.inc(22090);assertEquals(0, reader.getPosition(), "Available after close");
    }finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}

    @Test
    public void testReadCharArray() throws Exception {__CLR4_4_1h19h19kylve2x1.R.globalSliceStart(getClass().getName(),22091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pei1umh1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h19h19kylve2x1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h19h19kylve2x1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullReaderTest.testReadCharArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pei1umh1n() throws Exception{try{__CLR4_4_1h19h19kylve2x1.R.inc(22091);
        __CLR4_4_1h19h19kylve2x1.R.inc(22092);final char[] chars = new char[10];
        __CLR4_4_1h19h19kylve2x1.R.inc(22093);final Reader reader = new TestNullReader(15);

        // Read into array
        __CLR4_4_1h19h19kylve2x1.R.inc(22094);final int count1 = reader.read(chars);
        __CLR4_4_1h19h19kylve2x1.R.inc(22095);assertEquals(chars.length, count1, "Read 1");
        __CLR4_4_1h19h19kylve2x1.R.inc(22096);for (int i = 0; (((i < count1)&&(__CLR4_4_1h19h19kylve2x1.R.iget(22097)!=0|true))||(__CLR4_4_1h19h19kylve2x1.R.iget(22098)==0&false)); i++) {{
            __CLR4_4_1h19h19kylve2x1.R.inc(22099);assertEquals(i, chars[i], "Check Chars 1");
        }

        // Read into array
        }__CLR4_4_1h19h19kylve2x1.R.inc(22100);final int count2 = reader.read(chars);
        __CLR4_4_1h19h19kylve2x1.R.inc(22101);assertEquals(5, count2, "Read 2");
        __CLR4_4_1h19h19kylve2x1.R.inc(22102);for (int i = 0; (((i < count2)&&(__CLR4_4_1h19h19kylve2x1.R.iget(22103)!=0|true))||(__CLR4_4_1h19h19kylve2x1.R.iget(22104)==0&false)); i++) {{
            __CLR4_4_1h19h19kylve2x1.R.inc(22105);assertEquals(count1 + i, chars[i], "Check Chars 2");
        }

        // End of File
        }__CLR4_4_1h19h19kylve2x1.R.inc(22106);final int count3 = reader.read(chars);
        __CLR4_4_1h19h19kylve2x1.R.inc(22107);assertEquals(-1, count3, "Read 3 (EOF)");

        // Test reading after the end of file
        __CLR4_4_1h19h19kylve2x1.R.inc(22108);try {
            __CLR4_4_1h19h19kylve2x1.R.inc(22109);final int count4 = reader.read(chars);
            __CLR4_4_1h19h19kylve2x1.R.inc(22110);fail("Should have thrown an IOException, value=[" + count4 + "]");
        } catch (final IOException e) {
            __CLR4_4_1h19h19kylve2x1.R.inc(22111);assertEquals("Read after end of file", e.getMessage());
        }

        // reset by closing
        __CLR4_4_1h19h19kylve2x1.R.inc(22112);reader.close();

        // Read into array using offset & length
        __CLR4_4_1h19h19kylve2x1.R.inc(22113);final int offset = 2;
        __CLR4_4_1h19h19kylve2x1.R.inc(22114);final int lth    = 4;
        __CLR4_4_1h19h19kylve2x1.R.inc(22115);final int count5 = reader.read(chars, offset, lth);
        __CLR4_4_1h19h19kylve2x1.R.inc(22116);assertEquals(lth, count5, "Read 5");
        __CLR4_4_1h19h19kylve2x1.R.inc(22117);for (int i = offset; (((i < lth)&&(__CLR4_4_1h19h19kylve2x1.R.iget(22118)!=0|true))||(__CLR4_4_1h19h19kylve2x1.R.iget(22119)==0&false)); i++) {{
            __CLR4_4_1h19h19kylve2x1.R.inc(22120);assertEquals(i, chars[i], "Check Chars 3");
        }
    }}finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}

    @Test
    public void testEOFException() throws Exception {__CLR4_4_1h19h19kylve2x1.R.globalSliceStart(getClass().getName(),22121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttirkch2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h19h19kylve2x1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h19h19kylve2x1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullReaderTest.testEOFException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttirkch2h() throws Exception{try{__CLR4_4_1h19h19kylve2x1.R.inc(22121);
        __CLR4_4_1h19h19kylve2x1.R.inc(22122);final Reader reader = new TestNullReader(2, false, true);
        __CLR4_4_1h19h19kylve2x1.R.inc(22123);assertEquals(0, reader.read(), "Read 1");
        __CLR4_4_1h19h19kylve2x1.R.inc(22124);assertEquals(1, reader.read(), "Read 2");
        __CLR4_4_1h19h19kylve2x1.R.inc(22125);try {
            __CLR4_4_1h19h19kylve2x1.R.inc(22126);final int result = reader.read();
            __CLR4_4_1h19h19kylve2x1.R.inc(22127);fail("Should have thrown an EOFException, value=[" + result + "]");
        } catch (final EOFException e) {
            // expected
        }
        __CLR4_4_1h19h19kylve2x1.R.inc(22128);reader.close();
    }finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}

    @Test
    public void testMarkAndReset() throws Exception {__CLR4_4_1h19h19kylve2x1.R.globalSliceStart(getClass().getName(),22129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwqxtqh2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h19h19kylve2x1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h19h19kylve2x1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullReaderTest.testMarkAndReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwqxtqh2p() throws Exception{try{__CLR4_4_1h19h19kylve2x1.R.inc(22129);
        __CLR4_4_1h19h19kylve2x1.R.inc(22130);int position = 0;
        __CLR4_4_1h19h19kylve2x1.R.inc(22131);final int readlimit = 10;
        __CLR4_4_1h19h19kylve2x1.R.inc(22132);@SuppressWarnings("resource") // this is actually closed
        final Reader reader = new TestNullReader(100, true, false);

        __CLR4_4_1h19h19kylve2x1.R.inc(22133);assertTrue(reader.markSupported(), "Mark Should be Supported");

        // No Mark
        __CLR4_4_1h19h19kylve2x1.R.inc(22134);try {
            __CLR4_4_1h19h19kylve2x1.R.inc(22135);reader.reset();
            __CLR4_4_1h19h19kylve2x1.R.inc(22136);fail("Read limit exceeded, expected IOException ");
        } catch (final IOException e) {
            __CLR4_4_1h19h19kylve2x1.R.inc(22137);assertEquals("No position has been marked", e.getMessage(), "No Mark IOException message");
        }

        __CLR4_4_1h19h19kylve2x1.R.inc(22138);for (; (((position < 3)&&(__CLR4_4_1h19h19kylve2x1.R.iget(22139)!=0|true))||(__CLR4_4_1h19h19kylve2x1.R.iget(22140)==0&false)); position++) {{
            __CLR4_4_1h19h19kylve2x1.R.inc(22141);assertEquals(position, reader.read(), "Read Before Mark [" + position +"]");
        }

        // Mark
        }__CLR4_4_1h19h19kylve2x1.R.inc(22142);reader.mark(readlimit);

        // Read further
        __CLR4_4_1h19h19kylve2x1.R.inc(22143);for (int i = 0; (((i < 3)&&(__CLR4_4_1h19h19kylve2x1.R.iget(22144)!=0|true))||(__CLR4_4_1h19h19kylve2x1.R.iget(22145)==0&false)); i++) {{
            __CLR4_4_1h19h19kylve2x1.R.inc(22146);assertEquals(position + i, reader.read(), "Read After Mark [" + i +"]");
        }

        // Reset
        }__CLR4_4_1h19h19kylve2x1.R.inc(22147);reader.reset();

        // Read From marked position
        __CLR4_4_1h19h19kylve2x1.R.inc(22148);for (int i = 0; (((i < readlimit + 1)&&(__CLR4_4_1h19h19kylve2x1.R.iget(22149)!=0|true))||(__CLR4_4_1h19h19kylve2x1.R.iget(22150)==0&false)); i++) {{
            __CLR4_4_1h19h19kylve2x1.R.inc(22151);assertEquals(position + i, reader.read(), "Read After Reset [" + i +"]");
        }

        // Reset after read limit passed
        }__CLR4_4_1h19h19kylve2x1.R.inc(22152);try {
            __CLR4_4_1h19h19kylve2x1.R.inc(22153);reader.reset();
            __CLR4_4_1h19h19kylve2x1.R.inc(22154);fail("Read limit exceeded, expected IOException ");
        } catch (final IOException e) {
            __CLR4_4_1h19h19kylve2x1.R.inc(22155);assertEquals("Marked position [" + position
                         + "] is no longer valid - passed the read limit ["
                         + readlimit + "]",
                         e.getMessage(),
                         "Read limit IOException message");
        }
        __CLR4_4_1h19h19kylve2x1.R.inc(22156);reader.close();
    }finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}

    @Test
    public void testMarkNotSupported() throws Exception {__CLR4_4_1h19h19kylve2x1.R.globalSliceStart(getClass().getName(),22157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgip4vh3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h19h19kylve2x1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h19h19kylve2x1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullReaderTest.testMarkNotSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgip4vh3h() throws Exception{try{__CLR4_4_1h19h19kylve2x1.R.inc(22157);
        __CLR4_4_1h19h19kylve2x1.R.inc(22158);final Reader reader = new TestNullReader(100, false, true);
        __CLR4_4_1h19h19kylve2x1.R.inc(22159);assertFalse(reader.markSupported(), "Mark Should NOT be Supported");

        __CLR4_4_1h19h19kylve2x1.R.inc(22160);try {
            __CLR4_4_1h19h19kylve2x1.R.inc(22161);reader.mark(5);
            __CLR4_4_1h19h19kylve2x1.R.inc(22162);fail("mark() should throw UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            __CLR4_4_1h19h19kylve2x1.R.inc(22163);assertEquals(MARK_RESET_NOT_SUPPORTED, e.getMessage(), "mark() error message");
        }

        __CLR4_4_1h19h19kylve2x1.R.inc(22164);try {
            __CLR4_4_1h19h19kylve2x1.R.inc(22165);reader.reset();
            __CLR4_4_1h19h19kylve2x1.R.inc(22166);fail("reset() should throw UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
            __CLR4_4_1h19h19kylve2x1.R.inc(22167);assertEquals(MARK_RESET_NOT_SUPPORTED, e.getMessage(), "reset() error message");
        }
        __CLR4_4_1h19h19kylve2x1.R.inc(22168);reader.close();
    }finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}

    @Test
    public void testSkip() throws Exception {__CLR4_4_1h19h19kylve2x1.R.globalSliceStart(getClass().getName(),22169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfeamwh3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h19h19kylve2x1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h19h19kylve2x1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.NullReaderTest.testSkip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfeamwh3t() throws Exception{try{__CLR4_4_1h19h19kylve2x1.R.inc(22169);
        __CLR4_4_1h19h19kylve2x1.R.inc(22170);final Reader reader = new TestNullReader(10, true, false);
        __CLR4_4_1h19h19kylve2x1.R.inc(22171);assertEquals(0, reader.read(), "Read 1");
        __CLR4_4_1h19h19kylve2x1.R.inc(22172);assertEquals(1, reader.read(), "Read 2");
        __CLR4_4_1h19h19kylve2x1.R.inc(22173);assertEquals(5, reader.skip(5), "Skip 1");
        __CLR4_4_1h19h19kylve2x1.R.inc(22174);assertEquals(7, reader.read(), "Read 3");
        __CLR4_4_1h19h19kylve2x1.R.inc(22175);assertEquals(2, reader.skip(5), "Skip 2"); // only 2 left to skip
        __CLR4_4_1h19h19kylve2x1.R.inc(22176);assertEquals(-1, reader.skip(5), "Skip 3 (EOF)"); // End of file
        __CLR4_4_1h19h19kylve2x1.R.inc(22177);try {
            __CLR4_4_1h19h19kylve2x1.R.inc(22178);reader.skip(5); //
            __CLR4_4_1h19h19kylve2x1.R.inc(22179);fail("Expected IOException for skipping after end of file");
        } catch (final IOException e) {
            __CLR4_4_1h19h19kylve2x1.R.inc(22180);assertEquals("Skip after end of file", e.getMessage(),
                    "Skip after EOF IOException message");
        }
        __CLR4_4_1h19h19kylve2x1.R.inc(22181);reader.close();
    }finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}


    // ------------- Test NullReader implementation -------------

    private static final class TestNullReader extends NullReader {
        public TestNullReader(final int size) {
            super(size);__CLR4_4_1h19h19kylve2x1.R.inc(22183);try{__CLR4_4_1h19h19kylve2x1.R.inc(22182);
        }finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}
        public TestNullReader(final int size, final boolean markSupported, final boolean throwEofException) {
            super(size, markSupported, throwEofException);__CLR4_4_1h19h19kylve2x1.R.inc(22185);try{__CLR4_4_1h19h19kylve2x1.R.inc(22184);
        }finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}
        @Override
        protected int processChar() {try{__CLR4_4_1h19h19kylve2x1.R.inc(22186);
            __CLR4_4_1h19h19kylve2x1.R.inc(22187);return (int)getPosition() - 1;
        }finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}
        @Override
        protected void processChars(final char[] chars, final int offset, final int length) {try{__CLR4_4_1h19h19kylve2x1.R.inc(22188);
            __CLR4_4_1h19h19kylve2x1.R.inc(22189);final int startPos = (int)getPosition() - length;
            __CLR4_4_1h19h19kylve2x1.R.inc(22190);for (int i = offset; (((i < length)&&(__CLR4_4_1h19h19kylve2x1.R.iget(22191)!=0|true))||(__CLR4_4_1h19h19kylve2x1.R.iget(22192)==0&false)); i++) {{
                __CLR4_4_1h19h19kylve2x1.R.inc(22193);chars[i] = (char)(startPos + i);
            }
        }}finally{__CLR4_4_1h19h19kylve2x1.R.flushNeeded();}}

    }
}
