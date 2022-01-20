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
package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * This is used to test LineIterator for correctness.
 *
 */
public class LineIteratorTestCase {static class __CLR4_4_1d0jd0jkylve218{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,17062,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    private void assertLines(final List<String> lines, final LineIterator iterator) {try{__CLR4_4_1d0jd0jkylve218.R.inc(16867);
        __CLR4_4_1d0jd0jkylve218.R.inc(16868);try {
            __CLR4_4_1d0jd0jkylve218.R.inc(16869);for (int i = 0; (((i < lines.size())&&(__CLR4_4_1d0jd0jkylve218.R.iget(16870)!=0|true))||(__CLR4_4_1d0jd0jkylve218.R.iget(16871)==0&false)); i++) {{
                __CLR4_4_1d0jd0jkylve218.R.inc(16872);final String line = iterator.nextLine();
                __CLR4_4_1d0jd0jkylve218.R.inc(16873);assertEquals(lines.get(i), line, "nextLine() line " + i);
            }
            }__CLR4_4_1d0jd0jkylve218.R.inc(16874);assertFalse(iterator.hasNext(), "No more expected");
        } finally {
            __CLR4_4_1d0jd0jkylve218.R.inc(16875);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(16876);IOUtils.close(iterator);
            } catch (final IOException ignored) {
                // Ignored
            }
        }
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    /**
     * Creates a test file with a specified number of lines.
     *
     * @param file target file
     * @param lineCount number of lines to create
     *
     * @throws IOException If an I/O error occurs
     */
    private List<String> createLinesFile(final File file, final int lineCount) throws IOException {try{__CLR4_4_1d0jd0jkylve218.R.inc(16877);
        __CLR4_4_1d0jd0jkylve218.R.inc(16878);final List<String> lines = createStringLines(lineCount);
        __CLR4_4_1d0jd0jkylve218.R.inc(16879);FileUtils.writeLines(file, lines);
        __CLR4_4_1d0jd0jkylve218.R.inc(16880);return lines;
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    /**
     * Creates a test file with a specified number of lines.
     *
     * @param file target file
     * @param encoding the encoding to use while writing the lines
     * @param lineCount number of lines to create
     *
     * @throws IOException If an I/O error occurs
     */
    private List<String> createLinesFile(final File file, final String encoding, final int lineCount) throws IOException {try{__CLR4_4_1d0jd0jkylve218.R.inc(16881);
        __CLR4_4_1d0jd0jkylve218.R.inc(16882);final List<String> lines = createStringLines(lineCount);
        __CLR4_4_1d0jd0jkylve218.R.inc(16883);FileUtils.writeLines(file, encoding, lines);
        __CLR4_4_1d0jd0jkylve218.R.inc(16884);return lines;
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    /**
     * Creates String data lines.
     *
     * @param lineCount number of lines to create
     * @return a new lines list.
     */
    private List<String> createStringLines(final int lineCount) {try{__CLR4_4_1d0jd0jkylve218.R.inc(16885);
        __CLR4_4_1d0jd0jkylve218.R.inc(16886);final List<String> lines = new ArrayList<>();
        __CLR4_4_1d0jd0jkylve218.R.inc(16887);for (int i = 0; (((i < lineCount)&&(__CLR4_4_1d0jd0jkylve218.R.iget(16888)!=0|true))||(__CLR4_4_1d0jd0jkylve218.R.iget(16889)==0&false)); i++) {{
            __CLR4_4_1d0jd0jkylve218.R.inc(16890);lines.add("LINE " + i);
        }
        }__CLR4_4_1d0jd0jkylve218.R.inc(16891);return lines;
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}


    // -----------------------------------------------------------------------

    @Test
    public void testConstructor() {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hd18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hd18(){try{__CLR4_4_1d0jd0jkylve218.R.inc(16892);
        __CLR4_4_1d0jd0jkylve218.R.inc(16893);assertThrows(IllegalArgumentException.class, () -> {
            class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d0jd0jkylve218.R.inc(16894);try (
                __CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1d0jd0jkylve218.R.inc(16895);}};LineIterator li = new LineIterator(null)
            ) { }
        });
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testZeroLines() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lapnwd1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testZeroLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lapnwd1c() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16896);
        __CLR4_4_1d0jd0jkylve218.R.inc(16897);doTestFileWithSpecifiedLines(0);
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testOneLines() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldzupad1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testOneLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldzupad1e() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16898);
        __CLR4_4_1d0jd0jkylve218.R.inc(16899);doTestFileWithSpecifiedLines(1);
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testTwoLines() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mi4904d1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testTwoLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mi4904d1g() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16900);
        __CLR4_4_1d0jd0jkylve218.R.inc(16901);doTestFileWithSpecifiedLines(2);
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testThreeLines() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6vy7ad1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testThreeLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6vy7ad1i() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16902);
        __CLR4_4_1d0jd0jkylve218.R.inc(16903);doTestFileWithSpecifiedLines(3);
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testMissingFile() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6cggnd1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testMissingFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6cggnd1k() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16904);
        __CLR4_4_1d0jd0jkylve218.R.inc(16905);final File testFile = new File(temporaryFolder, "dummy-missing-file.txt");

        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d0jd0jkylve218.R.inc(16906);try (
            __CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1d0jd0jkylve218.R.inc(16907);}};LineIterator iterator = FileUtils.lineIterator(testFile, "UTF-8")
        ){
            __CLR4_4_1d0jd0jkylve218.R.inc(16908);fail("Expected FileNotFoundException");
        } catch (final FileNotFoundException expected) {
            // ignore, expected result
        }
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testValidEncoding() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmgin0d1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testValidEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmgin0d1p() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16909);
        __CLR4_4_1d0jd0jkylve218.R.inc(16910);final String encoding = "UTF-8";

        __CLR4_4_1d0jd0jkylve218.R.inc(16911);final File testFile = new File(temporaryFolder, "LineIterator-validEncoding.txt");
        __CLR4_4_1d0jd0jkylve218.R.inc(16912);createLinesFile(testFile, encoding, 3);

        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d0jd0jkylve218.R.inc(16913);try (
            __CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1d0jd0jkylve218.R.inc(16914);}};final LineIterator iterator = FileUtils.lineIterator(testFile, encoding)
        ){
            __CLR4_4_1d0jd0jkylve218.R.inc(16915);int count = 0;
            __CLR4_4_1d0jd0jkylve218.R.inc(16916);while ((((iterator.hasNext())&&(__CLR4_4_1d0jd0jkylve218.R.iget(16917)!=0|true))||(__CLR4_4_1d0jd0jkylve218.R.iget(16918)==0&false))) {{
                __CLR4_4_1d0jd0jkylve218.R.inc(16919);assertNotNull(iterator.next());
                __CLR4_4_1d0jd0jkylve218.R.inc(16920);count++;
            }
            }__CLR4_4_1d0jd0jkylve218.R.inc(16921);assertEquals(3, count);
        }
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testInvalidEncoding() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szggxrd22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testInvalidEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szggxrd22() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16922);
        __CLR4_4_1d0jd0jkylve218.R.inc(16923);final String encoding = "XXXXXXXX";

        __CLR4_4_1d0jd0jkylve218.R.inc(16924);final File testFile = new File(temporaryFolder, "LineIterator-invalidEncoding.txt");
        __CLR4_4_1d0jd0jkylve218.R.inc(16925);createLinesFile(testFile, "UTF-8", 3);

        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d0jd0jkylve218.R.inc(16926);try (
            __CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1d0jd0jkylve218.R.inc(16927);}};LineIterator iterator = FileUtils.lineIterator(testFile, encoding)
        ) {
            __CLR4_4_1d0jd0jkylve218.R.inc(16928);fail("Expected UnsupportedCharsetException");
        } catch (final UnsupportedCharsetException expected) {
            // ignore, expected result
        }
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testNextLineOnlyDefaultEncoding() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ytcd2d29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testNextLineOnlyDefaultEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ytcd2d29() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16929);
        __CLR4_4_1d0jd0jkylve218.R.inc(16930);final File testFile = new File(temporaryFolder, "LineIterator-nextOnly.txt");
        __CLR4_4_1d0jd0jkylve218.R.inc(16931);final List<String> lines = createLinesFile(testFile, 3);

        __CLR4_4_1d0jd0jkylve218.R.inc(16932);final LineIterator iterator = FileUtils.lineIterator(testFile);
        __CLR4_4_1d0jd0jkylve218.R.inc(16933);assertLines(lines, iterator);
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testNextLineOnlyNullEncoding() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ojaykad2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testNextLineOnlyNullEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ojaykad2e() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16934);
        __CLR4_4_1d0jd0jkylve218.R.inc(16935);final String encoding = null;

        __CLR4_4_1d0jd0jkylve218.R.inc(16936);final File testFile = new File(temporaryFolder, "LineIterator-nextOnly.txt");
        __CLR4_4_1d0jd0jkylve218.R.inc(16937);final List<String> lines = createLinesFile(testFile, encoding, 3);

        __CLR4_4_1d0jd0jkylve218.R.inc(16938);final LineIterator iterator = FileUtils.lineIterator(testFile, encoding);
        __CLR4_4_1d0jd0jkylve218.R.inc(16939);assertLines(lines, iterator);
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testNextLineOnlyUtf8Encoding() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lfv0wd2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testNextLineOnlyUtf8Encoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lfv0wd2k() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16940);
        __CLR4_4_1d0jd0jkylve218.R.inc(16941);final String encoding = "UTF-8";

        __CLR4_4_1d0jd0jkylve218.R.inc(16942);final File testFile = new File(temporaryFolder, "LineIterator-nextOnly.txt");
        __CLR4_4_1d0jd0jkylve218.R.inc(16943);final List<String> lines = createLinesFile(testFile, encoding, 3);

        __CLR4_4_1d0jd0jkylve218.R.inc(16944);final LineIterator iterator = FileUtils.lineIterator(testFile, encoding);
        __CLR4_4_1d0jd0jkylve218.R.inc(16945);assertLines(lines, iterator);
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testNextOnly() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5stugd2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testNextOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5stugd2q() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16946);
        __CLR4_4_1d0jd0jkylve218.R.inc(16947);final String encoding = null;

        __CLR4_4_1d0jd0jkylve218.R.inc(16948);final File testFile = new File(temporaryFolder, "LineIterator-nextOnly.txt");
        __CLR4_4_1d0jd0jkylve218.R.inc(16949);final List<String> lines = createLinesFile(testFile, encoding, 3);

        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d0jd0jkylve218.R.inc(16950);try (
            __CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1d0jd0jkylve218.R.inc(16951);}};final LineIterator iterator = FileUtils.lineIterator(testFile, encoding)
        ){
            __CLR4_4_1d0jd0jkylve218.R.inc(16952);for (int i = 0; (((i < lines.size())&&(__CLR4_4_1d0jd0jkylve218.R.iget(16953)!=0|true))||(__CLR4_4_1d0jd0jkylve218.R.iget(16954)==0&false)); i++) {{
                __CLR4_4_1d0jd0jkylve218.R.inc(16955);final String line = iterator.next();
                __CLR4_4_1d0jd0jkylve218.R.inc(16956);assertEquals(lines.get(i), line, "next() line " + i);
            }
            }__CLR4_4_1d0jd0jkylve218.R.inc(16957);assertFalse(iterator.hasNext(), "No more expected");
        }
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testNextWithException() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xklh9xd32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testNextWithException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xklh9xd32() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16958);
        __CLR4_4_1d0jd0jkylve218.R.inc(16959);final Reader reader = new BufferedReader(new StringReader("")) {
            @Override
            public String readLine() throws IOException {try{__CLR4_4_1d0jd0jkylve218.R.inc(16960);
                __CLR4_4_1d0jd0jkylve218.R.inc(16961);throw new IOException("hasNext");
            }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}
        };
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d0jd0jkylve218.R.inc(16962);try (
            __CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1d0jd0jkylve218.R.inc(16963);}};LineIterator li = new LineIterator(reader)
        ) {
            __CLR4_4_1d0jd0jkylve218.R.inc(16964);assertThrows(IllegalStateException.class, () -> {
                __CLR4_4_1d0jd0jkylve218.R.inc(16965);li.hasNext();
            });
        }
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testCloseEarly() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),16966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tb2810d3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testCloseEarly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),16966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tb2810d3a() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(16966);
        __CLR4_4_1d0jd0jkylve218.R.inc(16967);final String encoding = "UTF-8";

        __CLR4_4_1d0jd0jkylve218.R.inc(16968);final File testFile = new File(temporaryFolder, "LineIterator-closeEarly.txt");
        __CLR4_4_1d0jd0jkylve218.R.inc(16969);createLinesFile(testFile, encoding, 3);

        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d0jd0jkylve218.R.inc(16970);try (
            __CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1d0jd0jkylve218.R.inc(16971);}};final LineIterator iterator = FileUtils.lineIterator(testFile, encoding)
        ) {
            // get
            __CLR4_4_1d0jd0jkylve218.R.inc(16972);assertNotNull("Line expected", iterator.next());
            __CLR4_4_1d0jd0jkylve218.R.inc(16973);assertTrue(iterator.hasNext(), "More expected");

            // close
            __CLR4_4_1d0jd0jkylve218.R.inc(16974);iterator.close();
            __CLR4_4_1d0jd0jkylve218.R.inc(16975);assertFalse(iterator.hasNext(), "No more expected");
            __CLR4_4_1d0jd0jkylve218.R.inc(16976);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(16977);iterator.next();
                __CLR4_4_1d0jd0jkylve218.R.inc(16978);fail();
            } catch (final NoSuchElementException ex) {
                // expected
            }
            __CLR4_4_1d0jd0jkylve218.R.inc(16979);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(16980);iterator.nextLine();
                __CLR4_4_1d0jd0jkylve218.R.inc(16981);fail();
            } catch (final NoSuchElementException ex) {
                // expected
            }

            // try closing again
            __CLR4_4_1d0jd0jkylve218.R.inc(16982);iterator.close();
            __CLR4_4_1d0jd0jkylve218.R.inc(16983);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(16984);iterator.next();
                __CLR4_4_1d0jd0jkylve218.R.inc(16985);fail();
            } catch (final NoSuchElementException ex) {
                // expected
            }
            __CLR4_4_1d0jd0jkylve218.R.inc(16986);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(16987);iterator.nextLine();
                __CLR4_4_1d0jd0jkylve218.R.inc(16988);fail();
            } catch (final NoSuchElementException ex) {
                // expected
            }
        }
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    /**
     * Utility method to create and test a file with a specified number of lines.
     *
     * @param lineCount the lines to create in the test file
     *
     * @throws IOException If an I/O error occurs while creating the file
     */
    private void doTestFileWithSpecifiedLines(final int lineCount) throws IOException {try{__CLR4_4_1d0jd0jkylve218.R.inc(16989);
        __CLR4_4_1d0jd0jkylve218.R.inc(16990);final String encoding = "UTF-8";

        __CLR4_4_1d0jd0jkylve218.R.inc(16991);final String fileName = "LineIterator-" + lineCount + "-test.txt";
        __CLR4_4_1d0jd0jkylve218.R.inc(16992);final File testFile = new File(temporaryFolder, fileName);
        __CLR4_4_1d0jd0jkylve218.R.inc(16993);final List<String> lines = createLinesFile(testFile, encoding, lineCount);

        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1d0jd0jkylve218.R.inc(16994);try (
            __CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1d0jd0jkylve218.R.inc(16995);}};final LineIterator iterator = FileUtils.lineIterator(testFile, encoding)
        ){
            __CLR4_4_1d0jd0jkylve218.R.inc(16996);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(16997);iterator.remove();
                __CLR4_4_1d0jd0jkylve218.R.inc(16998);fail("Remove is unsupported");
            } catch (final UnsupportedOperationException ex) {
                // expected
            }

            __CLR4_4_1d0jd0jkylve218.R.inc(16999);int idx = 0;
            __CLR4_4_1d0jd0jkylve218.R.inc(17000);while ((((iterator.hasNext())&&(__CLR4_4_1d0jd0jkylve218.R.iget(17001)!=0|true))||(__CLR4_4_1d0jd0jkylve218.R.iget(17002)==0&false))) {{
                __CLR4_4_1d0jd0jkylve218.R.inc(17003);final String line = iterator.next();
                __CLR4_4_1d0jd0jkylve218.R.inc(17004);assertEquals(lines.get(idx), line, "Comparing line " + idx);
                __CLR4_4_1d0jd0jkylve218.R.inc(17005);assertTrue(idx < lines.size(), "Exceeded expected idx=" + idx + " size=" + lines.size());
                __CLR4_4_1d0jd0jkylve218.R.inc(17006);idx++;
            }
            }__CLR4_4_1d0jd0jkylve218.R.inc(17007);assertEquals(idx, lines.size(), "Line Count doesn't match");

            // try calling next() after file processed
            __CLR4_4_1d0jd0jkylve218.R.inc(17008);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(17009);iterator.next();
                __CLR4_4_1d0jd0jkylve218.R.inc(17010);fail("Expected NoSuchElementException");
            } catch (final NoSuchElementException expected) {
                // ignore, expected result
            }
            __CLR4_4_1d0jd0jkylve218.R.inc(17011);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(17012);iterator.nextLine();
                __CLR4_4_1d0jd0jkylve218.R.inc(17013);fail("Expected NoSuchElementException");
            } catch (final NoSuchElementException expected) {
                // ignore, expected result
            }
        }
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testFilteringFileReader() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),17014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h061ged4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testFilteringFileReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h061ged4m() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(17014);
        __CLR4_4_1d0jd0jkylve218.R.inc(17015);final String encoding = "UTF-8";

        __CLR4_4_1d0jd0jkylve218.R.inc(17016);final String fileName = "LineIterator-Filter-test.txt";
        __CLR4_4_1d0jd0jkylve218.R.inc(17017);final File testFile = new File(temporaryFolder, fileName);
        __CLR4_4_1d0jd0jkylve218.R.inc(17018);final List<String> lines = createLinesFile(testFile, encoding, 9);

        __CLR4_4_1d0jd0jkylve218.R.inc(17019);final Reader reader = Files.newBufferedReader(testFile.toPath());
        __CLR4_4_1d0jd0jkylve218.R.inc(17020);this.testFiltering(lines, reader);
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    @Test
    public void testFilteringBufferedReader() throws Exception {__CLR4_4_1d0jd0jkylve218.R.globalSliceStart(getClass().getName(),17021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cox7q7d4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d0jd0jkylve218.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d0jd0jkylve218.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.LineIteratorTestCase.testFilteringBufferedReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),17021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cox7q7d4t() throws Exception{try{__CLR4_4_1d0jd0jkylve218.R.inc(17021);
        __CLR4_4_1d0jd0jkylve218.R.inc(17022);final String encoding = "UTF-8";

        __CLR4_4_1d0jd0jkylve218.R.inc(17023);final String fileName = "LineIterator-Filter-test.txt";
        __CLR4_4_1d0jd0jkylve218.R.inc(17024);final File testFile = new File(temporaryFolder, fileName);
        __CLR4_4_1d0jd0jkylve218.R.inc(17025);final List<String> lines = createLinesFile(testFile, encoding, 9);

        __CLR4_4_1d0jd0jkylve218.R.inc(17026);final Reader reader = new BufferedReader(Files.newBufferedReader(testFile.toPath()));
        __CLR4_4_1d0jd0jkylve218.R.inc(17027);this.testFiltering(lines, reader);
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

    private void testFiltering(final List<String> lines, final Reader reader) {try{__CLR4_4_1d0jd0jkylve218.R.inc(17028);
        __CLR4_4_1d0jd0jkylve218.R.inc(17029);final LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(final String line) {try{__CLR4_4_1d0jd0jkylve218.R.inc(17030);
                __CLR4_4_1d0jd0jkylve218.R.inc(17031);final char c = line.charAt(line.length() - 1);
                __CLR4_4_1d0jd0jkylve218.R.inc(17032);return (c - 48) % 3 != 1;
            }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}
        };
        __CLR4_4_1d0jd0jkylve218.R.inc(17033);try {
            __CLR4_4_1d0jd0jkylve218.R.inc(17034);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(17035);iterator.remove();
                __CLR4_4_1d0jd0jkylve218.R.inc(17036);fail("Remove is unsupported");
            } catch (final UnsupportedOperationException ex) {
                // expected
            }

            __CLR4_4_1d0jd0jkylve218.R.inc(17037);int idx = 0;
            __CLR4_4_1d0jd0jkylve218.R.inc(17038);int actualLines = 0;
            __CLR4_4_1d0jd0jkylve218.R.inc(17039);while ((((iterator.hasNext())&&(__CLR4_4_1d0jd0jkylve218.R.iget(17040)!=0|true))||(__CLR4_4_1d0jd0jkylve218.R.iget(17041)==0&false))) {{
                __CLR4_4_1d0jd0jkylve218.R.inc(17042);final String line = iterator.next();
                __CLR4_4_1d0jd0jkylve218.R.inc(17043);actualLines++;
                __CLR4_4_1d0jd0jkylve218.R.inc(17044);assertEquals(lines.get(idx), line, "Comparing line " + idx);
                __CLR4_4_1d0jd0jkylve218.R.inc(17045);assertTrue(idx < lines.size(), "Exceeded expected idx=" + idx + " size=" + lines.size());
                __CLR4_4_1d0jd0jkylve218.R.inc(17046);idx++;
                __CLR4_4_1d0jd0jkylve218.R.inc(17047);if ((((idx % 3 == 1)&&(__CLR4_4_1d0jd0jkylve218.R.iget(17048)!=0|true))||(__CLR4_4_1d0jd0jkylve218.R.iget(17049)==0&false))) {{
                    __CLR4_4_1d0jd0jkylve218.R.inc(17050);idx++;
                }
            }}
            }__CLR4_4_1d0jd0jkylve218.R.inc(17051);assertEquals(9, lines.size(), "Line Count doesn't match");
            __CLR4_4_1d0jd0jkylve218.R.inc(17052);assertEquals(9, idx, "Line Count doesn't match");
            __CLR4_4_1d0jd0jkylve218.R.inc(17053);assertEquals(6, actualLines, "Line Count doesn't match");

            // try calling next() after file processed
            __CLR4_4_1d0jd0jkylve218.R.inc(17054);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(17055);iterator.next();
                __CLR4_4_1d0jd0jkylve218.R.inc(17056);fail("Expected NoSuchElementException");
            } catch (final NoSuchElementException expected) {
                // ignore, expected result
            }
            __CLR4_4_1d0jd0jkylve218.R.inc(17057);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(17058);iterator.nextLine();
                __CLR4_4_1d0jd0jkylve218.R.inc(17059);fail("Expected NoSuchElementException");
            } catch (final NoSuchElementException expected) {
                // ignore, expected result
            }
        } finally {
            __CLR4_4_1d0jd0jkylve218.R.inc(17060);try {
                __CLR4_4_1d0jd0jkylve218.R.inc(17061);IOUtils.close(iterator);
            } catch (final IOException ignored) {
                // Ignored
            }
        }
    }finally{__CLR4_4_1d0jd0jkylve218.R.flushNeeded();}}

}
