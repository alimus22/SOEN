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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Stack;
import java.util.stream.Stream;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.TestResources;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;

/**
 * Test checks symmetric behavior with BufferedReader.
 */
public class ReversedLinesFileReaderTestParamFile {static class __CLR4_4_1hivhivkylve31z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22754,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    public static Stream<Arguments> testDataIntegrityWithBufferedReader() throws IOException, URISyntaxException {__CLR4_4_1hivhivkylve31z.R.globalSliceStart(ReversedLinesFileReaderTestParamFile.class.getName(),22711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Stream<Arguments> $CLV_r$=__CLR4_4_1z3fohkhiv();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hivhivkylve31z.R.rethrow($CLV_t2$);return null;}finally{__CLR4_4_1hivhivkylve31z.R.globalSliceEnd(ReversedLinesFileReaderTestParamFile.class.getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamFile.testDataIntegrityWithBufferedReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22711,$CLV_p$,$CLV_t$);}}private static Stream<Arguments>  __CLR4_4_1z3fohkhiv() throws IOException, URISyntaxException{try{__CLR4_4_1hivhivkylve31z.R.inc(22711);
        // Make a file using the default encoding.
        __CLR4_4_1hivhivkylve31z.R.inc(22712);final Path sourcePath = TestResources.getPath("test-file-utf8-win-linebr.bin");
        __CLR4_4_1hivhivkylve31z.R.inc(22713);final Path targetPath = Files.createTempFile("ReversedLinesFileReaderTestParamFile", ".bin");
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hivhivkylve31z.R.inc(22714);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1hivhivkylve31z.R.inc(22715);}};Reader input = Files.newBufferedReader(sourcePath, StandardCharsets.UTF_8);
                __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1hivhivkylve31z.R.inc(22716);}};Writer output = Files.newBufferedWriter(targetPath, Charset.defaultCharset())) {
            __CLR4_4_1hivhivkylve31z.R.inc(22717);IOUtils.copyLarge(input, output);
        }
        // All tests
        __CLR4_4_1hivhivkylve31z.R.inc(22718);return Stream.of(Arguments.of(targetPath.toAbsolutePath().toString(), null, null, false, false),
                Arguments.of("test-file-20byteslength.bin", "ISO_8859_1", null, false, true),
                Arguments.of("test-file-iso8859-1-shortlines-win-linebr.bin", "ISO_8859_1", null, false, true),
                Arguments.of("test-file-iso8859-1.bin", "ISO_8859_1", null, false, true),
                Arguments.of("test-file-shiftjis.bin", "Shift_JIS", null, false, true),
                Arguments.of("test-file-utf16be.bin", "UTF-16BE", null, false, true),
                Arguments.of("test-file-utf16le.bin", "UTF-16LE", null, false, true),
                Arguments.of("test-file-utf8-cr-only.bin", "UTF-8", null, false, true),
                Arguments.of("test-file-utf8-win-linebr.bin", "UTF-8", null, false, true,
                Arguments.of("test-file-utf8-win-linebr.bin", "UTF-8", 1, false, true),
                Arguments.of("test-file-utf8-win-linebr.bin", "UTF-8", 2, false, true),
                Arguments.of("test-file-utf8-win-linebr.bin", "UTF-8", 3, false, true),
                Arguments.of("test-file-utf8-win-linebr.bin", "UTF-8", 4, false, true),
                Arguments.of("test-file-utf8.bin", "UTF-8", null, false, true),
                Arguments.of("test-file-utf8.bin", "UTF-8", null, true, true),
                Arguments.of("test-file-windows-31j.bin", "windows-31j", null, false, true),
                Arguments.of("test-file-gbk.bin", "gbk", null, false, true),
                Arguments.of("test-file-x-windows-949.bin", "x-windows-949", null, false, true),
                Arguments.of("test-file-x-windows-950.bin", "x-windows-950", null, false, true)));
    }finally{__CLR4_4_1hivhivkylve31z.R.flushNeeded();}}

    @ParameterizedTest(name = "{0}, encoding={1}, blockSize={2}, useNonDefaultFileSystem={3}, isResource={4}")
    @MethodSource
    public void testDataIntegrityWithBufferedReader(final String fileName, final String charsetName,
            final Integer blockSize, final boolean useNonDefaultFileSystem, final boolean isResource)
            throws IOException, URISyntaxException {__CLR4_4_1hivhivkylve31z.R.globalSliceStart(getClass().getName(),22719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtw91khj3(fileName,charsetName,blockSize,useNonDefaultFileSystem,isResource);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hivhivkylve31z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hivhivkylve31z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.ReversedLinesFileReaderTestParamFile.testDataIntegrityWithBufferedReader",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtw91khj3(final String fileName, final String charsetName, final Integer blockSize, final boolean useNonDefaultFileSystem, final boolean isResource) throws IOException, URISyntaxException{try{__CLR4_4_1hivhivkylve31z.R.inc(22719);

        __CLR4_4_1hivhivkylve31z.R.inc(22720);Path filePath = (((isResource )&&(__CLR4_4_1hivhivkylve31z.R.iget(22721)!=0|true))||(__CLR4_4_1hivhivkylve31z.R.iget(22722)==0&false))? TestResources.getPath(fileName) : Paths.get(fileName);
        __CLR4_4_1hivhivkylve31z.R.inc(22723);FileSystem fileSystem = null;
        __CLR4_4_1hivhivkylve31z.R.inc(22724);if ((((useNonDefaultFileSystem)&&(__CLR4_4_1hivhivkylve31z.R.iget(22725)!=0|true))||(__CLR4_4_1hivhivkylve31z.R.iget(22726)==0&false))) {{
            __CLR4_4_1hivhivkylve31z.R.inc(22727);fileSystem = Jimfs.newFileSystem(Configuration.unix());
            __CLR4_4_1hivhivkylve31z.R.inc(22728);filePath = Files.copy(filePath, fileSystem.getPath("/" + fileName));
        }

        // We want to test null Charset in the ReversedLinesFileReader ctor.
        }__CLR4_4_1hivhivkylve31z.R.inc(22729);final Charset charset = (((charsetName != null )&&(__CLR4_4_1hivhivkylve31z.R.iget(22730)!=0|true))||(__CLR4_4_1hivhivkylve31z.R.iget(22731)==0&false))? Charset.forName(charsetName) : null;
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hivhivkylve31z.R.inc(22732);try (__CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1hivhivkylve31z.R.inc(22733);}};ReversedLinesFileReader reversedLinesFileReader = (((blockSize == null
                )&&(__CLR4_4_1hivhivkylve31z.R.iget(22734)!=0|true))||(__CLR4_4_1hivhivkylve31z.R.iget(22735)==0&false))? new ReversedLinesFileReader(filePath, charset)
                : new ReversedLinesFileReader(filePath, blockSize, charset)) {

            __CLR4_4_1hivhivkylve31z.R.inc(22736);final Stack<String> lineStack = new Stack<>();
            __CLR4_4_1hivhivkylve31z.R.inc(22737);String line;

            class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1hivhivkylve31z.R.inc(22738);try (__CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_1hivhivkylve31z.R.inc(22739);}};BufferedReader bufferedReader = Files.newBufferedReader(filePath, Charsets.toCharset(charset))) {
                // read all lines in normal order
                __CLR4_4_1hivhivkylve31z.R.inc(22740);while ((line = bufferedReader.readLine()) != null) {{
                    __CLR4_4_1hivhivkylve31z.R.inc(22743);lineStack.push(line);
                }
            }}

            // read in reverse order and compare with lines from stack
            __CLR4_4_1hivhivkylve31z.R.inc(22744);while ((line = reversedLinesFileReader.readLine()) != null) {{
                __CLR4_4_1hivhivkylve31z.R.inc(22747);final String lineFromBufferedReader = lineStack.pop();
                __CLR4_4_1hivhivkylve31z.R.inc(22748);assertEquals(lineFromBufferedReader, line);
            }
            }__CLR4_4_1hivhivkylve31z.R.inc(22749);assertEquals(0, lineStack.size(), "Stack should be empty");

            __CLR4_4_1hivhivkylve31z.R.inc(22750);if ((((fileSystem != null)&&(__CLR4_4_1hivhivkylve31z.R.iget(22751)!=0|true))||(__CLR4_4_1hivhivkylve31z.R.iget(22752)==0&false))) {{
                __CLR4_4_1hivhivkylve31z.R.inc(22753);fileSystem.close();
            }
        }}
    }finally{__CLR4_4_1hivhivkylve31z.R.flushNeeded();}}
}
