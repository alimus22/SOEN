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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.test.TestUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
/**
 * Test for FileDeleteStrategy.
 *
 * @see FileDeleteStrategy
 */
public class FileDeleteStrategyTestCase {static class __CLR4_4_18es8eskylve0xr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,10977,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    @Test
    public void testDeleteNormal() throws Exception {__CLR4_4_18es8eskylve0xr.R.globalSliceStart(getClass().getName(),10900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kikp3p8es();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18es8eskylve0xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_18es8eskylve0xr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileDeleteStrategyTestCase.testDeleteNormal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kikp3p8es() throws Exception{try{__CLR4_4_18es8eskylve0xr.R.inc(10900);
        __CLR4_4_18es8eskylve0xr.R.inc(10901);final File baseDir = temporaryFolder;
        __CLR4_4_18es8eskylve0xr.R.inc(10902);final File subDir = new File(baseDir, "test");
        __CLR4_4_18es8eskylve0xr.R.inc(10903);assertTrue(subDir.mkdir());
        __CLR4_4_18es8eskylve0xr.R.inc(10904);final File subFile = new File(subDir, "a.txt");
        __CLR4_4_18es8eskylve0xr.R.inc(10905);if ((((!subFile.getParentFile().exists())&&(__CLR4_4_18es8eskylve0xr.R.iget(10906)!=0|true))||(__CLR4_4_18es8eskylve0xr.R.iget(10907)==0&false))) {{
            __CLR4_4_18es8eskylve0xr.R.inc(10908);throw new IOException("Cannot create file " + subFile
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_18es8eskylve0xr.R.inc(10909);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_18es8eskylve0xr.R.inc(10910);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(subFile.toPath()))) {
            __CLR4_4_18es8eskylve0xr.R.inc(10911);TestUtils.generateTestData(output, 16);
        }

        __CLR4_4_18es8eskylve0xr.R.inc(10912);assertTrue(subDir.exists());
        __CLR4_4_18es8eskylve0xr.R.inc(10913);assertTrue(subFile.exists());
        // delete dir
        __CLR4_4_18es8eskylve0xr.R.inc(10914);try {
            __CLR4_4_18es8eskylve0xr.R.inc(10915);FileDeleteStrategy.NORMAL.delete(subDir);
            __CLR4_4_18es8eskylve0xr.R.inc(10916);fail();
        } catch (final IOException ex) {
            // expected
        }
        __CLR4_4_18es8eskylve0xr.R.inc(10917);assertTrue(subDir.exists());
        __CLR4_4_18es8eskylve0xr.R.inc(10918);assertTrue(subFile.exists());
        // delete file
        __CLR4_4_18es8eskylve0xr.R.inc(10919);FileDeleteStrategy.NORMAL.delete(subFile);
        __CLR4_4_18es8eskylve0xr.R.inc(10920);assertTrue(subDir.exists());
        __CLR4_4_18es8eskylve0xr.R.inc(10921);assertFalse(subFile.exists());
        // delete dir
        __CLR4_4_18es8eskylve0xr.R.inc(10922);FileDeleteStrategy.NORMAL.delete(subDir);
        __CLR4_4_18es8eskylve0xr.R.inc(10923);assertFalse(subDir.exists());
        // delete dir
        __CLR4_4_18es8eskylve0xr.R.inc(10924);FileDeleteStrategy.NORMAL.delete(subDir);  // no error
        __CLR4_4_18es8eskylve0xr.R.inc(10925);assertFalse(subDir.exists());
    }finally{__CLR4_4_18es8eskylve0xr.R.flushNeeded();}}

    @Test
    public void testDeleteQuietlyNormal() throws Exception {__CLR4_4_18es8eskylve0xr.R.globalSliceStart(getClass().getName(),10926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9u4tq8fi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18es8eskylve0xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_18es8eskylve0xr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileDeleteStrategyTestCase.testDeleteQuietlyNormal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9u4tq8fi() throws Exception{try{__CLR4_4_18es8eskylve0xr.R.inc(10926);
        __CLR4_4_18es8eskylve0xr.R.inc(10927);final File baseDir = temporaryFolder;
        __CLR4_4_18es8eskylve0xr.R.inc(10928);final File subDir = new File(baseDir, "test");
        __CLR4_4_18es8eskylve0xr.R.inc(10929);assertTrue(subDir.mkdir());
        __CLR4_4_18es8eskylve0xr.R.inc(10930);final File subFile = new File(subDir, "a.txt");
        __CLR4_4_18es8eskylve0xr.R.inc(10931);if ((((!subFile.getParentFile().exists())&&(__CLR4_4_18es8eskylve0xr.R.iget(10932)!=0|true))||(__CLR4_4_18es8eskylve0xr.R.iget(10933)==0&false))) {{
            __CLR4_4_18es8eskylve0xr.R.inc(10934);throw new IOException("Cannot create file " + subFile
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_18es8eskylve0xr.R.inc(10935);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_18es8eskylve0xr.R.inc(10936);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(subFile.toPath()))) {
            __CLR4_4_18es8eskylve0xr.R.inc(10937);TestUtils.generateTestData(output, 16);
        }

        __CLR4_4_18es8eskylve0xr.R.inc(10938);assertTrue(subDir.exists());
        __CLR4_4_18es8eskylve0xr.R.inc(10939);assertTrue(subFile.exists());
        // delete dir
        __CLR4_4_18es8eskylve0xr.R.inc(10940);assertFalse(FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        __CLR4_4_18es8eskylve0xr.R.inc(10941);assertTrue(subDir.exists());
        __CLR4_4_18es8eskylve0xr.R.inc(10942);assertTrue(subFile.exists());
        // delete file
        __CLR4_4_18es8eskylve0xr.R.inc(10943);assertTrue(FileDeleteStrategy.NORMAL.deleteQuietly(subFile));
        __CLR4_4_18es8eskylve0xr.R.inc(10944);assertTrue(subDir.exists());
        __CLR4_4_18es8eskylve0xr.R.inc(10945);assertFalse(subFile.exists());
        // delete dir
        __CLR4_4_18es8eskylve0xr.R.inc(10946);assertTrue(FileDeleteStrategy.NORMAL.deleteQuietly(subDir));
        __CLR4_4_18es8eskylve0xr.R.inc(10947);assertFalse(subDir.exists());
        // delete dir
        __CLR4_4_18es8eskylve0xr.R.inc(10948);assertTrue(FileDeleteStrategy.NORMAL.deleteQuietly(subDir));  // no error
        __CLR4_4_18es8eskylve0xr.R.inc(10949);assertFalse(subDir.exists());
    }finally{__CLR4_4_18es8eskylve0xr.R.flushNeeded();}}

    @Test
    public void testDeleteForce() throws Exception {__CLR4_4_18es8eskylve0xr.R.globalSliceStart(getClass().getName(),10950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141eyy38g6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18es8eskylve0xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_18es8eskylve0xr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileDeleteStrategyTestCase.testDeleteForce",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141eyy38g6() throws Exception{try{__CLR4_4_18es8eskylve0xr.R.inc(10950);
        __CLR4_4_18es8eskylve0xr.R.inc(10951);final File baseDir = temporaryFolder;
        __CLR4_4_18es8eskylve0xr.R.inc(10952);final File subDir = new File(baseDir, "test");
        __CLR4_4_18es8eskylve0xr.R.inc(10953);assertTrue(subDir.mkdir());
        __CLR4_4_18es8eskylve0xr.R.inc(10954);final File subFile = new File(subDir, "a.txt");
        __CLR4_4_18es8eskylve0xr.R.inc(10955);if ((((!subFile.getParentFile().exists())&&(__CLR4_4_18es8eskylve0xr.R.iget(10956)!=0|true))||(__CLR4_4_18es8eskylve0xr.R.iget(10957)==0&false))) {{
            __CLR4_4_18es8eskylve0xr.R.inc(10958);throw new IOException("Cannot create file " + subFile
                    + " as the parent directory does not exist");
        }
        }class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_18es8eskylve0xr.R.inc(10959);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_18es8eskylve0xr.R.inc(10960);}};final BufferedOutputStream output =
                new BufferedOutputStream(Files.newOutputStream(subFile.toPath()))) {
            __CLR4_4_18es8eskylve0xr.R.inc(10961);TestUtils.generateTestData(output, 16);
        }

        __CLR4_4_18es8eskylve0xr.R.inc(10962);assertTrue(subDir.exists());
        __CLR4_4_18es8eskylve0xr.R.inc(10963);assertTrue(subFile.exists());
        // delete dir
        __CLR4_4_18es8eskylve0xr.R.inc(10964);FileDeleteStrategy.FORCE.delete(subDir);
        __CLR4_4_18es8eskylve0xr.R.inc(10965);assertFalse(subDir.exists());
        __CLR4_4_18es8eskylve0xr.R.inc(10966);assertFalse(subFile.exists());
        // delete dir
        __CLR4_4_18es8eskylve0xr.R.inc(10967);FileDeleteStrategy.FORCE.delete(subDir);  // no error
        __CLR4_4_18es8eskylve0xr.R.inc(10968);assertFalse(subDir.exists());
    }finally{__CLR4_4_18es8eskylve0xr.R.flushNeeded();}}

    @Test
    public void testDeleteNull() throws Exception {__CLR4_4_18es8eskylve0xr.R.globalSliceStart(getClass().getName(),10969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcacl18gp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18es8eskylve0xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_18es8eskylve0xr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileDeleteStrategyTestCase.testDeleteNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcacl18gp() throws Exception{try{__CLR4_4_18es8eskylve0xr.R.inc(10969);
        __CLR4_4_18es8eskylve0xr.R.inc(10970);try {
            __CLR4_4_18es8eskylve0xr.R.inc(10971);FileDeleteStrategy.NORMAL.delete(null);
            __CLR4_4_18es8eskylve0xr.R.inc(10972);fail();
        } catch (final NullPointerException ex) {
            // expected
        }
        __CLR4_4_18es8eskylve0xr.R.inc(10973);assertTrue(FileDeleteStrategy.NORMAL.deleteQuietly(null));
    }finally{__CLR4_4_18es8eskylve0xr.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_18es8eskylve0xr.R.globalSliceStart(getClass().getName(),10974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid8gu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18es8eskylve0xr.R.rethrow($CLV_t2$);}finally{__CLR4_4_18es8eskylve0xr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileDeleteStrategyTestCase.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid8gu(){try{__CLR4_4_18es8eskylve0xr.R.inc(10974);
        __CLR4_4_18es8eskylve0xr.R.inc(10975);assertEquals("FileDeleteStrategy[Normal]", FileDeleteStrategy.NORMAL.toString());
        __CLR4_4_18es8eskylve0xr.R.inc(10976);assertEquals("FileDeleteStrategy[Force]", FileDeleteStrategy.FORCE.toString());
    }finally{__CLR4_4_18es8eskylve0xr.R.flushNeeded();}}
}
