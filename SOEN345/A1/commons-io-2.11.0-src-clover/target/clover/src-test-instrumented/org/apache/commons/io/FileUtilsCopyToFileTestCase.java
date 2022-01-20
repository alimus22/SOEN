/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */
package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.test.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;


/**
 * This is used to test FileUtils for correctness.
 */
public class FileUtilsCopyToFileTestCase {static class __CLR4_4_18wi8wikylve11h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11563,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    private File testFile;

    private byte[] testData;

    @BeforeEach
    public void setUp() throws Exception {try{__CLR4_4_18wi8wikylve11h.R.inc(11538);
        __CLR4_4_18wi8wikylve11h.R.inc(11539);testFile = new File(temporaryFolder, "file1-test.txt");
        __CLR4_4_18wi8wikylve11h.R.inc(11540);if((((!testFile.getParentFile().exists())&&(__CLR4_4_18wi8wikylve11h.R.iget(11541)!=0|true))||(__CLR4_4_18wi8wikylve11h.R.iget(11542)==0&false))) {{
            __CLR4_4_18wi8wikylve11h.R.inc(11543);throw new IOException("Cannot create file " + testFile +
                " as the parent directory does not exist");
        }

        }__CLR4_4_18wi8wikylve11h.R.inc(11544);testData = TestUtils.generateTestData(1024);
    }finally{__CLR4_4_18wi8wikylve11h.R.flushNeeded();}}

    /**
     * Tests that {@code copyToFile(InputStream, File)} does not close the input stream.
     *
     * @throws IOException
     * @see FileUtils#copyToFile(InputStream, File)
     * @see FileUtils#copyInputStreamToFile(InputStream, File)
     */
    @Test
    public void testCopyToFile() throws IOException {__CLR4_4_18wi8wikylve11h.R.globalSliceStart(getClass().getName(),11545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151lrdn8wp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18wi8wikylve11h.R.rethrow($CLV_t2$);}finally{__CLR4_4_18wi8wikylve11h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCopyToFileTestCase.testCopyToFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151lrdn8wp() throws IOException{try{__CLR4_4_18wi8wikylve11h.R.inc(11545);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_18wi8wikylve11h.R.inc(11546);try(__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_18wi8wikylve11h.R.inc(11547);}};CheckingInputStream inputStream = new CheckingInputStream(testData)) {
            __CLR4_4_18wi8wikylve11h.R.inc(11548);FileUtils.copyToFile(inputStream, testFile);
            __CLR4_4_18wi8wikylve11h.R.inc(11549);assertFalse(inputStream.isClosed(), "inputStream should NOT be closed");
        }
    }finally{__CLR4_4_18wi8wikylve11h.R.flushNeeded();}}

    /**
     * Tests that {@code copyInputStreamToFile(InputStream, File)} closes the input stream.
     *
     * @throws IOException
     * @see FileUtils#copyInputStreamToFile(InputStream, File)
     * @see FileUtils#copyToFile(InputStream, File)
     */
    @Test
    public void testCopyInputStreamToFile() throws IOException {__CLR4_4_18wi8wikylve11h.R.globalSliceStart(getClass().getName(),11550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ux8rsx8wu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18wi8wikylve11h.R.rethrow($CLV_t2$);}finally{__CLR4_4_18wi8wikylve11h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsCopyToFileTestCase.testCopyInputStreamToFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ux8rsx8wu() throws IOException{try{__CLR4_4_18wi8wikylve11h.R.inc(11550);
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_18wi8wikylve11h.R.inc(11551);try(__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_18wi8wikylve11h.R.inc(11552);}};CheckingInputStream inputStream = new CheckingInputStream(testData)) {
            __CLR4_4_18wi8wikylve11h.R.inc(11553);FileUtils.copyInputStreamToFile(inputStream, testFile);
            __CLR4_4_18wi8wikylve11h.R.inc(11554);assertTrue(inputStream.isClosed(), "inputStream should be closed");
        }
    }finally{__CLR4_4_18wi8wikylve11h.R.flushNeeded();}}

    private class CheckingInputStream extends ByteArrayInputStream {
        private boolean closed;

        public CheckingInputStream(final byte[] data) {
            super(data);__CLR4_4_18wi8wikylve11h.R.inc(11556);try{__CLR4_4_18wi8wikylve11h.R.inc(11555);
            __CLR4_4_18wi8wikylve11h.R.inc(11557);closed = false;
        }finally{__CLR4_4_18wi8wikylve11h.R.flushNeeded();}}

        @Override
        public void close() throws IOException {try{__CLR4_4_18wi8wikylve11h.R.inc(11558);
            __CLR4_4_18wi8wikylve11h.R.inc(11559);super.close();
            __CLR4_4_18wi8wikylve11h.R.inc(11560);closed = true;
        }finally{__CLR4_4_18wi8wikylve11h.R.flushNeeded();}}

        public boolean isClosed() {try{__CLR4_4_18wi8wikylve11h.R.inc(11561);
            __CLR4_4_18wi8wikylve11h.R.inc(11562);return closed;
        }finally{__CLR4_4_18wi8wikylve11h.R.flushNeeded();}}
    }
}
