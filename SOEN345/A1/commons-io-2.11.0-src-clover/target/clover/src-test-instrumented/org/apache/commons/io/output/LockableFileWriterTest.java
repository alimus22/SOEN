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
package org.apache.commons.io.output;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Tests that files really lock, although no writing is done as
 * the locking is tested only on construction.
 *
 */
public class LockableFileWriterTest {static class __CLR4_4_1k51k51kylve3kf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26187,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    private File file;
    private File lockDir;
    private File lockFile;
    private File altLockDir;
    private File altLockFile;

    @BeforeEach
    public void setUp() {try{__CLR4_4_1k51k51kylve3kf.R.inc(26101);
        __CLR4_4_1k51k51kylve3kf.R.inc(26102);file = new File(temporaryFolder, "testlockfile");
        __CLR4_4_1k51k51kylve3kf.R.inc(26103);lockDir = new File(System.getProperty("java.io.tmpdir"));
        __CLR4_4_1k51k51kylve3kf.R.inc(26104);lockFile = new File(lockDir, file.getName() + ".lck");
        __CLR4_4_1k51k51kylve3kf.R.inc(26105);altLockDir = temporaryFolder;
        __CLR4_4_1k51k51kylve3kf.R.inc(26106);altLockFile = new File(altLockDir, file.getName() + ".lck");
    }finally{__CLR4_4_1k51k51kylve3kf.R.flushNeeded();}}

    @Test public void testFileLocked() throws IOException {__CLR4_4_1k51k51kylve3kf.R.globalSliceStart(getClass().getName(),26107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gsqj1dk57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k51k51kylve3kf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k51k51kylve3kf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.LockableFileWriterTest.testFileLocked",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gsqj1dk57() throws IOException{try{__CLR4_4_1k51k51kylve3kf.R.inc(26107);

        // open a valid lockable writer
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26108);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1k51k51kylve3kf.R.inc(26109);}};LockableFileWriter lfw1 = new LockableFileWriter(file)) {
            __CLR4_4_1k51k51kylve3kf.R.inc(26110);assertTrue(file.exists());
            __CLR4_4_1k51k51kylve3kf.R.inc(26111);assertTrue(lockFile.exists());

            // try to open a second writer
            class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26112);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1k51k51kylve3kf.R.inc(26113);}};LockableFileWriter lfw2 = new LockableFileWriter(file)) {
                __CLR4_4_1k51k51kylve3kf.R.inc(26114);fail("Somehow able to open a locked file. ");
            } catch(final IOException ioe) {
                __CLR4_4_1k51k51kylve3kf.R.inc(26115);final String msg = ioe.getMessage();
                __CLR4_4_1k51k51kylve3kf.R.inc(26116);assertTrue(msg.startsWith("Can't write file, lock "),
                        "Exception message does not start correctly. ");
                __CLR4_4_1k51k51kylve3kf.R.inc(26117);assertTrue(file.exists());
                __CLR4_4_1k51k51kylve3kf.R.inc(26118);assertTrue(lockFile.exists());
            }

            // try to open a third writer
            class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26119);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1k51k51kylve3kf.R.inc(26120);}};LockableFileWriter lfw3 = new LockableFileWriter(file)) {
                __CLR4_4_1k51k51kylve3kf.R.inc(26121);fail("Somehow able to open a locked file. ");
            } catch(final IOException ioe) {
                __CLR4_4_1k51k51kylve3kf.R.inc(26122);final String msg = ioe.getMessage();
                __CLR4_4_1k51k51kylve3kf.R.inc(26123);assertTrue(msg.startsWith("Can't write file, lock "),
                        "Exception message does not start correctly. ");
                __CLR4_4_1k51k51kylve3kf.R.inc(26124);assertTrue(file.exists());
                __CLR4_4_1k51k51kylve3kf.R.inc(26125);assertTrue(lockFile.exists());
            }
        }
        __CLR4_4_1k51k51kylve3kf.R.inc(26126);assertTrue(file.exists());
        __CLR4_4_1k51k51kylve3kf.R.inc(26127);assertFalse(lockFile.exists());
    }finally{__CLR4_4_1k51k51kylve3kf.R.flushNeeded();}}

    @Test public void testAlternateLockDir() throws IOException {__CLR4_4_1k51k51kylve3kf.R.globalSliceStart(getClass().getName(),26128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y2k75tk5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k51k51kylve3kf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k51k51kylve3kf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.LockableFileWriterTest.testAlternateLockDir",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y2k75tk5s() throws IOException{try{__CLR4_4_1k51k51kylve3kf.R.inc(26128);
        // open a valid lockable writer
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26129);try (__CLR4_4_1$AC3 __CLR$ACI3=new __CLR4_4_1$AC3(){{__CLR4_4_1k51k51kylve3kf.R.inc(26130);}};LockableFileWriter lfw1 = new LockableFileWriter(file, "UTF-8" ,true, altLockDir.getAbsolutePath())){
            __CLR4_4_1k51k51kylve3kf.R.inc(26131);assertTrue(file.exists());
            __CLR4_4_1k51k51kylve3kf.R.inc(26132);assertTrue(altLockFile.exists());

            // try to open a second writer
            class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26133);try (__CLR4_4_1$AC4 __CLR$ACI4=new __CLR4_4_1$AC4(){{__CLR4_4_1k51k51kylve3kf.R.inc(26134);}};LockableFileWriter lfw2 = new LockableFileWriter(file, StandardCharsets.UTF_8, true, altLockDir.getAbsolutePath())){
                __CLR4_4_1k51k51kylve3kf.R.inc(26135);fail("Somehow able to open a locked file. ");
            } catch(final IOException ioe) {
                __CLR4_4_1k51k51kylve3kf.R.inc(26136);final String msg = ioe.getMessage();
                __CLR4_4_1k51k51kylve3kf.R.inc(26137);assertTrue(msg.startsWith("Can't write file, lock "),
                        "Exception message does not start correctly. ");
                __CLR4_4_1k51k51kylve3kf.R.inc(26138);assertTrue(file.exists());
                __CLR4_4_1k51k51kylve3kf.R.inc(26139);assertTrue(altLockFile.exists());
            }
        }
        __CLR4_4_1k51k51kylve3kf.R.inc(26140);assertTrue(file.exists());
        __CLR4_4_1k51k51kylve3kf.R.inc(26141);assertFalse(altLockFile.exists());
    }finally{__CLR4_4_1k51k51kylve3kf.R.flushNeeded();}}

    @Test public void testFileNotLocked() throws IOException {__CLR4_4_1k51k51kylve3kf.R.globalSliceStart(getClass().getName(),26142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxyo46k66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k51k51kylve3kf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k51k51kylve3kf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.LockableFileWriterTest.testFileNotLocked",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxyo46k66() throws IOException{try{__CLR4_4_1k51k51kylve3kf.R.inc(26142);
        // open a valid lockable writer
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26143);try (__CLR4_4_1$AC5 __CLR$ACI5=new __CLR4_4_1$AC5(){{__CLR4_4_1k51k51kylve3kf.R.inc(26144);}};LockableFileWriter lfw1 = new LockableFileWriter(file)) {
            __CLR4_4_1k51k51kylve3kf.R.inc(26145);assertTrue(file.exists());
            __CLR4_4_1k51k51kylve3kf.R.inc(26146);assertTrue(lockFile.exists());
        }
        __CLR4_4_1k51k51kylve3kf.R.inc(26147);assertTrue(file.exists());
        __CLR4_4_1k51k51kylve3kf.R.inc(26148);assertFalse(lockFile.exists());

        // open a second valid writer on the same file
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26149);try (__CLR4_4_1$AC6 __CLR$ACI6=new __CLR4_4_1$AC6(){{__CLR4_4_1k51k51kylve3kf.R.inc(26150);}};LockableFileWriter lfw2 = new LockableFileWriter(file)) {
            __CLR4_4_1k51k51kylve3kf.R.inc(26151);assertTrue(file.exists());
            __CLR4_4_1k51k51kylve3kf.R.inc(26152);assertTrue(lockFile.exists());
        }
        __CLR4_4_1k51k51kylve3kf.R.inc(26153);assertTrue(file.exists());
        __CLR4_4_1k51k51kylve3kf.R.inc(26154);assertFalse(lockFile.exists());
    }finally{__CLR4_4_1k51k51kylve3kf.R.flushNeeded();}}

    @Test public void testConstructor_File_encoding_badEncoding() throws IOException {__CLR4_4_1k51k51kylve3kf.R.globalSliceStart(getClass().getName(),26155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl7qqnk6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k51k51kylve3kf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k51k51kylve3kf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.LockableFileWriterTest.testConstructor_File_encoding_badEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl7qqnk6j() throws IOException{try{__CLR4_4_1k51k51kylve3kf.R.inc(26155);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26156);try (__CLR4_4_1$AC7 __CLR$ACI7=new __CLR4_4_1$AC7(){{__CLR4_4_1k51k51kylve3kf.R.inc(26157);}};Writer writer = new LockableFileWriter(file, "BAD-ENCODE")) {
            __CLR4_4_1k51k51kylve3kf.R.inc(26158);fail();
        } catch (final UnsupportedCharsetException ex) {
            // expected
            __CLR4_4_1k51k51kylve3kf.R.inc(26159);assertFalse(file.exists());
            __CLR4_4_1k51k51kylve3kf.R.inc(26160);assertFalse(lockFile.exists());
        }
        __CLR4_4_1k51k51kylve3kf.R.inc(26161);assertFalse(file.exists());
        __CLR4_4_1k51k51kylve3kf.R.inc(26162);assertFalse(lockFile.exists());
    }finally{__CLR4_4_1k51k51kylve3kf.R.flushNeeded();}}

    @Test public void testConstructor_File_directory() {__CLR4_4_1k51k51kylve3kf.R.globalSliceStart(getClass().getName(),26163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2nn08k6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k51k51kylve3kf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k51k51kylve3kf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.LockableFileWriterTest.testConstructor_File_directory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2nn08k6r(){try{__CLR4_4_1k51k51kylve3kf.R.inc(26163);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26164);try (__CLR4_4_1$AC8 __CLR$ACI8=new __CLR4_4_1$AC8(){{__CLR4_4_1k51k51kylve3kf.R.inc(26165);}};Writer writer = new LockableFileWriter(temporaryFolder)) {
            __CLR4_4_1k51k51kylve3kf.R.inc(26166);fail();
        } catch (final IOException ex) {
            // expected
            __CLR4_4_1k51k51kylve3kf.R.inc(26167);assertFalse(file.exists());
            __CLR4_4_1k51k51kylve3kf.R.inc(26168);assertFalse(lockFile.exists());
        }
        __CLR4_4_1k51k51kylve3kf.R.inc(26169);assertFalse(file.exists());
        __CLR4_4_1k51k51kylve3kf.R.inc(26170);assertFalse(lockFile.exists());
    }finally{__CLR4_4_1k51k51kylve3kf.R.flushNeeded();}}

    @Test public void testConstructor_File_nullFile() throws IOException {__CLR4_4_1k51k51kylve3kf.R.globalSliceStart(getClass().getName(),26171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14zpx9mk6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k51k51kylve3kf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k51k51kylve3kf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.LockableFileWriterTest.testConstructor_File_nullFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14zpx9mk6z() throws IOException{try{__CLR4_4_1k51k51kylve3kf.R.inc(26171);
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26172);try (__CLR4_4_1$AC9 __CLR$ACI9=new __CLR4_4_1$AC9(){{__CLR4_4_1k51k51kylve3kf.R.inc(26173);}};Writer writer = new LockableFileWriter((File) null)) {
            __CLR4_4_1k51k51kylve3kf.R.inc(26174);fail();
        } catch (final NullPointerException ex) {
            // expected
            __CLR4_4_1k51k51kylve3kf.R.inc(26175);assertFalse(file.exists());
            __CLR4_4_1k51k51kylve3kf.R.inc(26176);assertFalse(lockFile.exists());
        }
        __CLR4_4_1k51k51kylve3kf.R.inc(26177);assertFalse(file.exists());
        __CLR4_4_1k51k51kylve3kf.R.inc(26178);assertFalse(lockFile.exists());
    }finally{__CLR4_4_1k51k51kylve3kf.R.flushNeeded();}}

    @Test public void testConstructor_fileName_nullFile() throws IOException {__CLR4_4_1k51k51kylve3kf.R.globalSliceStart(getClass().getName(),26179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mvnv1xk77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k51k51kylve3kf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k51k51kylve3kf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.LockableFileWriterTest.testConstructor_fileName_nullFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mvnv1xk77() throws IOException{try{__CLR4_4_1k51k51kylve3kf.R.inc(26179);
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1k51k51kylve3kf.R.inc(26180);try (__CLR4_4_1$AC10 __CLR$ACI10=new __CLR4_4_1$AC10(){{__CLR4_4_1k51k51kylve3kf.R.inc(26181);}};Writer writer = new LockableFileWriter((String) null)) {
            __CLR4_4_1k51k51kylve3kf.R.inc(26182);fail();
        } catch (final NullPointerException ex) {
            // expected
            __CLR4_4_1k51k51kylve3kf.R.inc(26183);assertFalse(file.exists());
            __CLR4_4_1k51k51kylve3kf.R.inc(26184);assertFalse(lockFile.exists());
        }
        __CLR4_4_1k51k51kylve3kf.R.inc(26185);assertFalse(file.exists());
        __CLR4_4_1k51k51kylve3kf.R.inc(26186);assertFalse(lockFile.exists());
    }finally{__CLR4_4_1k51k51kylve3kf.R.flushNeeded();}}

}
