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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * This is used to test FileSystemUtils.
 *
 */
@SuppressWarnings("deprecation") // testing deprecated class
public class FileSystemUtilsTestCase {static class __CLR4_4_18ir8irkylve0za{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Duration NEG_1_TIMEOUT = Duration.ofMillis(-1);

    @Test
    public void testGetFreeSpace_String() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9b1cx8ir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpace_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9b1cx8ir() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11043);
        // test coverage, as we can't check value
        __CLR4_4_18ir8irkylve0za.R.inc(11044);if ((((File.separatorChar == '/')&&(__CLR4_4_18ir8irkylve0za.R.iget(11045)!=0|true))||(__CLR4_4_18ir8irkylve0za.R.iget(11046)==0&false))) {{
            // have to figure out unix block size
            __CLR4_4_18ir8irkylve0za.R.inc(11047);final String[] cmd;
            __CLR4_4_18ir8irkylve0za.R.inc(11048);String osName = System.getProperty("os.name");
            __CLR4_4_18ir8irkylve0za.R.inc(11049);osName = osName.toLowerCase(Locale.ENGLISH);

            __CLR4_4_18ir8irkylve0za.R.inc(11050);if ((((osName.contains("hp-ux") || osName.contains("aix"))&&(__CLR4_4_18ir8irkylve0za.R.iget(11051)!=0|true))||(__CLR4_4_18ir8irkylve0za.R.iget(11052)==0&false))) {{
                __CLR4_4_18ir8irkylve0za.R.inc(11053);cmd = new String[]{"df", "-P", "/"};
            } }else {__CLR4_4_18ir8irkylve0za.R.inc(11054);if ((((osName.contains("sunos") || osName.contains("sun os")
                    || osName.contains("solaris"))&&(__CLR4_4_18ir8irkylve0za.R.iget(11055)!=0|true))||(__CLR4_4_18ir8irkylve0za.R.iget(11056)==0&false))) {{
                __CLR4_4_18ir8irkylve0za.R.inc(11057);cmd = new String[]{"/usr/xpg4/bin/df", "-P", "/"};
            } }else {{
                __CLR4_4_18ir8irkylve0za.R.inc(11058);cmd = new String[]{"df", "/"};
            }
            }}__CLR4_4_18ir8irkylve0za.R.inc(11059);final Process proc = Runtime.getRuntime().exec(cmd);
            __CLR4_4_18ir8irkylve0za.R.inc(11060);boolean kilobyteBlock = true;
            class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_18ir8irkylve0za.R.inc(11061);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_18ir8irkylve0za.R.inc(11062);}};BufferedReader r = new BufferedReader(new InputStreamReader(proc.getInputStream()))){
                __CLR4_4_18ir8irkylve0za.R.inc(11063);final String line = r.readLine();
                __CLR4_4_18ir8irkylve0za.R.inc(11064);assertNotNull("Unexpected null line", line);
                __CLR4_4_18ir8irkylve0za.R.inc(11065);if ((((line.contains("512"))&&(__CLR4_4_18ir8irkylve0za.R.iget(11066)!=0|true))||(__CLR4_4_18ir8irkylve0za.R.iget(11067)==0&false))) {{
                    __CLR4_4_18ir8irkylve0za.R.inc(11068);kilobyteBlock = false;
                }
            }}

            // now perform the test
            __CLR4_4_18ir8irkylve0za.R.inc(11069);final long free = FileSystemUtils.freeSpace("/");
            __CLR4_4_18ir8irkylve0za.R.inc(11070);final long kb = FileSystemUtils.freeSpaceKb("/");
            // Assume disk space does not fluctuate
            // more than 1% between the above two calls;
            // this also also small enough to verify freeSpaceKb uses
            // kibibytes (1024) instead of SI kilobytes (1000)
            __CLR4_4_18ir8irkylve0za.R.inc(11071);final double acceptableDelta = kb * 0.01d;
            __CLR4_4_18ir8irkylve0za.R.inc(11072);if ((((kilobyteBlock)&&(__CLR4_4_18ir8irkylve0za.R.iget(11073)!=0|true))||(__CLR4_4_18ir8irkylve0za.R.iget(11074)==0&false))) {{
                __CLR4_4_18ir8irkylve0za.R.inc(11075);assertEquals(free, kb, acceptableDelta);
            } }else {{
                __CLR4_4_18ir8irkylve0za.R.inc(11076);assertEquals(free / 2d, kb, acceptableDelta);
            }
        }} }else {{
            __CLR4_4_18ir8irkylve0za.R.inc(11077);final long bytes = FileSystemUtils.freeSpace("");
            __CLR4_4_18ir8irkylve0za.R.inc(11078);final long kb = FileSystemUtils.freeSpaceKb("");
            // Assume disk space does not fluctuate more than 1%
            __CLR4_4_18ir8irkylve0za.R.inc(11079);final double acceptableDelta = kb * 0.01d;
            __CLR4_4_18ir8irkylve0za.R.inc(11080);assertEquals((double) bytes / 1024, kb, acceptableDelta);
        }
    }}finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceOS_String_NullPath() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d5dqbo8jt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceOS_String_NullPath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d5dqbo8jt() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11081);
        __CLR4_4_18ir8irkylve0za.R.inc(11082);final FileSystemUtils fsu = new FileSystemUtils();
        __CLR4_4_18ir8irkylve0za.R.inc(11083);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11084);fsu.freeSpaceOS(null, 1, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11085);fail();
        } catch (final IllegalArgumentException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11086);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11087);fsu.freeSpaceOS(null, 1, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11088);fail();
        } catch (final IllegalArgumentException ignore) {
        }
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceOS_String_InitError() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkcboq8k1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceOS_String_InitError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkcboq8k1() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11089);
        __CLR4_4_18ir8irkylve0za.R.inc(11090);final FileSystemUtils fsu = new FileSystemUtils();
        __CLR4_4_18ir8irkylve0za.R.inc(11091);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11092);fsu.freeSpaceOS("", -1, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11093);fail();
        } catch (final IllegalStateException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11094);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11095);fsu.freeSpaceOS("", -1, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11096);fail();
        } catch (final IllegalStateException ignore) {
        }
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceOS_String_Other() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmpbwu8k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceOS_String_Other",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmpbwu8k9() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11097);
        __CLR4_4_18ir8irkylve0za.R.inc(11098);final FileSystemUtils fsu = new FileSystemUtils();
        __CLR4_4_18ir8irkylve0za.R.inc(11099);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11100);fsu.freeSpaceOS("", 0, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11101);fail();
        } catch (final IllegalStateException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11102);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11103);fsu.freeSpaceOS("", 0, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11104);fail();
        } catch (final IllegalStateException ignore) {
        }
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceOS_String_Windows() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wd83kv8kh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceOS_String_Windows",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wd83kv8kh() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11105);
        __CLR4_4_18ir8irkylve0za.R.inc(11106);final FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceWindows(final String path, final Duration timeout) throws IOException {try{__CLR4_4_18ir8irkylve0za.R.inc(11107);
                __CLR4_4_18ir8irkylve0za.R.inc(11108);return 12345L;
            }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}
        };
        __CLR4_4_18ir8irkylve0za.R.inc(11109);assertEquals(12345L, fsu.freeSpaceOS("", 1, false, NEG_1_TIMEOUT));
        __CLR4_4_18ir8irkylve0za.R.inc(11110);assertEquals(12345L / 1024, fsu.freeSpaceOS("", 1, true, NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceOS_String_Unix() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lt2ko8kn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceOS_String_Unix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lt2ko8kn() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11111);
        __CLR4_4_18ir8irkylve0za.R.inc(11112);final FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(final String path, final boolean kb, final boolean posix, final Duration timeout) throws IOException {try{__CLR4_4_18ir8irkylve0za.R.inc(11113);
                __CLR4_4_18ir8irkylve0za.R.inc(11114);return (((kb )&&(__CLR4_4_18ir8irkylve0za.R.iget(11115)!=0|true))||(__CLR4_4_18ir8irkylve0za.R.iget(11116)==0&false))? 12345L : 54321;
            }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}
        };
        __CLR4_4_18ir8irkylve0za.R.inc(11117);assertEquals(54321L, fsu.freeSpaceOS("", 2, false, NEG_1_TIMEOUT));
        __CLR4_4_18ir8irkylve0za.R.inc(11118);assertEquals(12345L, fsu.freeSpaceOS("", 2, true, NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19t09p8kv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_ParseCommaFormatBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19t09p8kv() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11119);
        // this is the format of response when calling dir /c
        // we have now switched to dir /-c, so we should never get this
        __CLR4_4_18ir8irkylve0za.R.inc(11120);final String lines =
                " Volume in drive C is HDD\n" +
                        " Volume Serial Number is XXXX-YYYY\n" +
                        "\n" +
                        " Directory of C:\\Documents and Settings\\Xxxx\n" +
                        "\n" +
                        "19/08/2005  22:43    <DIR>          .\n" +
                        "19/08/2005  22:43    <DIR>          ..\n" +
                        "11/08/2005  01:07                81 build.properties\n" +
                        "17/08/2005  21:44    <DIR>          Desktop\n" +
                        "               7 File(s)        180,260 bytes\n" +
                        "              10 Dir(s)  41,411,551,232 bytes free";
        __CLR4_4_18ir8irkylve0za.R.inc(11121);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11122);assertEquals(41411551232L, fsu.freeSpaceWindows("", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_Big() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4cfxa8kz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_ParseCommaFormatBytes_Big",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4cfxa8kz() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11123);
        // test with very large free space
        __CLR4_4_18ir8irkylve0za.R.inc(11124);final String lines =
                " Volume in drive C is HDD\n" +
                        " Volume Serial Number is XXXX-YYYY\n" +
                        "\n" +
                        " Directory of C:\\Documents and Settings\\Xxxx\n" +
                        "\n" +
                        "19/08/2005  22:43    <DIR>          .\n" +
                        "19/08/2005  22:43    <DIR>          ..\n" +
                        "11/08/2005  01:07                81 build.properties\n" +
                        "17/08/2005  21:44    <DIR>          Desktop\n" +
                        "               7 File(s)        180,260 bytes\n" +
                        "              10 Dir(s)  141,411,551,232 bytes free";
        __CLR4_4_18ir8irkylve0za.R.inc(11125);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11126);assertEquals(141411551232L, fsu.freeSpaceWindows("", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_Small() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1shhipx8l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_ParseCommaFormatBytes_Small",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1shhipx8l3() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11127);
        // test with very large free space
        __CLR4_4_18ir8irkylve0za.R.inc(11128);final String lines =
                " Volume in drive C is HDD\n" +
                        " Volume Serial Number is XXXX-YYYY\n" +
                        "\n" +
                        " Directory of C:\\Documents and Settings\\Xxxx\n" +
                        "\n" +
                        "19/08/2005  22:43    <DIR>          .\n" +
                        "19/08/2005  22:43    <DIR>          ..\n" +
                        "11/08/2005  01:07                81 build.properties\n" +
                        "17/08/2005  21:44    <DIR>          Desktop\n" +
                        "               7 File(s)        180,260 bytes\n" +
                        "              10 Dir(s)  1,232 bytes free";
        __CLR4_4_18ir8irkylve0za.R.inc(11129);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11130);assertEquals(1232L, fsu.freeSpaceWindows("", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_EmptyPath() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1km46o38l7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_EmptyPath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1km46o38l7() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11131);
        __CLR4_4_18ir8irkylve0za.R.inc(11132);final String lines =
                " Volume in drive C is HDD\n" +
                        " Volume Serial Number is XXXX-YYYY\n" +
                        "\n" +
                        " Directory of C:\\Documents and Settings\\Xxxx\n" +
                        "\n" +
                        "19/08/2005  22:43    <DIR>          .\n" +
                        "19/08/2005  22:43    <DIR>          ..\n" +
                        "11/08/2005  01:07                81 build.properties\n" +
                        "17/08/2005  21:44    <DIR>          Desktop\n" +
                        "               7 File(s)         180260 bytes\n" +
                        "              10 Dir(s)     41411551232 bytes free";
        __CLR4_4_18ir8irkylve0za.R.inc(11133);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines, "dir /a /-c ");
        __CLR4_4_18ir8irkylve0za.R.inc(11134);assertEquals(41411551232L, fsu.freeSpaceWindows("", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_NormalResponse() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wlevit8lb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_NormalResponse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wlevit8lb() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11135);
        __CLR4_4_18ir8irkylve0za.R.inc(11136);final String lines =
                " Volume in drive C is HDD\n" +
                        " Volume Serial Number is XXXX-YYYY\n" +
                        "\n" +
                        " Directory of C:\\Documents and Settings\\Xxxx\n" +
                        "\n" +
                        "19/08/2005  22:43    <DIR>          .\n" +
                        "19/08/2005  22:43    <DIR>          ..\n" +
                        "11/08/2005  01:07                81 build.properties\n" +
                        "17/08/2005  21:44    <DIR>          Desktop\n" +
                        "               7 File(s)         180260 bytes\n" +
                        "              10 Dir(s)     41411551232 bytes free";
        __CLR4_4_18ir8irkylve0za.R.inc(11137);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines, "dir /a /-c \"C:\"");
        __CLR4_4_18ir8irkylve0za.R.inc(11138);assertEquals(41411551232L, fsu.freeSpaceWindows("C:", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_StripDrive() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xqmdv98lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_StripDrive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xqmdv98lf() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11139);
        __CLR4_4_18ir8irkylve0za.R.inc(11140);final String lines =
                " Volume in drive C is HDD\n" +
                        " Volume Serial Number is XXXX-YYYY\n" +
                        "\n" +
                        " Directory of C:\\Documents and Settings\\Xxxx\n" +
                        "\n" +
                        "19/08/2005  22:43    <DIR>          .\n" +
                        "19/08/2005  22:43    <DIR>          ..\n" +
                        "11/08/2005  01:07                81 build.properties\n" +
                        "17/08/2005  21:44    <DIR>          Desktop\n" +
                        "               7 File(s)         180260 bytes\n" +
                        "              10 Dir(s)     41411551232 bytes free";
        __CLR4_4_18ir8irkylve0za.R.inc(11141);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines, "dir /a /-c \"C:\\somedir\"");
        __CLR4_4_18ir8irkylve0za.R.inc(11142);assertEquals(41411551232L, fsu.freeSpaceWindows("C:\\somedir", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_quoted() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p26c5x8lj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_quoted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p26c5x8lj() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11143);
        __CLR4_4_18ir8irkylve0za.R.inc(11144);final String lines =
                " Volume in drive C is HDD\n" +
                        " Volume Serial Number is XXXX-YYYY\n" +
                        "\n" +
                        " Directory of C:\\Documents and Settings\\Xxxx\n" +
                        "\n" +
                        "19/08/2005  22:43    <DIR>          .\n" +
                        "19/08/2005  22:43    <DIR>          ..\n" +
                        "11/08/2005  01:07                81 build.properties\n" +
                        "17/08/2005  21:44    <DIR>          Desktop\n" +
                        "               7 File(s)         180260 bytes\n" +
                        "              10 Dir(s)     41411551232 bytes free";
        __CLR4_4_18ir8irkylve0za.R.inc(11145);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines, "dir /a /-c \"C:\\somedir\"");
        __CLR4_4_18ir8irkylve0za.R.inc(11146);assertEquals(41411551232L, fsu.freeSpaceWindows("\"C:\\somedir\"", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_EmptyResponse() {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avwcyv8ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_EmptyResponse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avwcyv8ln(){try{__CLR4_4_18ir8irkylve0za.R.inc(11147);
        __CLR4_4_18ir8irkylve0za.R.inc(11148);final String lines = "";
        __CLR4_4_18ir8irkylve0za.R.inc(11149);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11150);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11151);fsu.freeSpaceWindows("C:", NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11152);fail();
        } catch (final IOException ignore) {
        }
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse() {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124yjoc8lt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_EmptyMultiLineResponse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124yjoc8lt(){try{__CLR4_4_18ir8irkylve0za.R.inc(11153);
        __CLR4_4_18ir8irkylve0za.R.inc(11154);final String lines = "\n\n";
        __CLR4_4_18ir8irkylve0za.R.inc(11155);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11156);assertThrows(IOException.class, () -> fsu.freeSpaceWindows("C:", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_InvalidTextResponse() {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197jx808lx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_InvalidTextResponse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197jx808lx(){try{__CLR4_4_18ir8irkylve0za.R.inc(11157);
        __CLR4_4_18ir8irkylve0za.R.inc(11158);final String lines = "BlueScreenOfDeath";
        __CLR4_4_18ir8irkylve0za.R.inc(11159);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11160);assertThrows(IOException.class, () -> fsu.freeSpaceWindows("C:", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse() {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1devtm98m1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceWindows_String_NoSuchDirectoryResponse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1devtm98m1(){try{__CLR4_4_18ir8irkylve0za.R.inc(11161);
        __CLR4_4_18ir8irkylve0za.R.inc(11162);final String lines =
                " Volume in drive C is HDD\n" +
                        " Volume Serial Number is XXXX-YYYY\n" +
                        "\n" +
                        " Directory of C:\\Documents and Settings\\empty" +
                        "\n";
        __CLR4_4_18ir8irkylve0za.R.inc(11163);final FileSystemUtils fsu = new MockFileSystemUtils(1, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11164);assertThrows(IOException.class, () -> fsu.freeSpaceWindows("C:", NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_EmptyPath() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13o4xv88m5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_EmptyPath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13o4xv88m5() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11165);
        __CLR4_4_18ir8irkylve0za.R.inc(11166);final String lines =
                "Filesystem           1K-blocks      Used Available Use% Mounted on\n" +
                        "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        __CLR4_4_18ir8irkylve0za.R.inc(11167);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11168);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11169);fsu.freeSpaceUnix("", false, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11170);fail();
        } catch (final IllegalArgumentException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11171);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11172);fsu.freeSpaceUnix("", true, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11173);fail();
        } catch (final IllegalArgumentException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11174);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11175);fsu.freeSpaceUnix("", true, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11176);fail();
        } catch (final IllegalArgumentException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11177);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11178);fsu.freeSpaceUnix("", false, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11179);fail();
        } catch (final IllegalArgumentException ignore) {
        }

    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_NormalResponseLinux() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jl58g68mk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_NormalResponseLinux",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jl58g68mk() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11180);
        // from Sourceforge 'GNU bash, version 2.05b.0(1)-release (i386-redhat-linux-gnu)'
        __CLR4_4_18ir8irkylve0za.R.inc(11181);final String lines =
                "Filesystem           1K-blocks      Used Available Use% Mounted on\n" +
                        "/dev/xxx                497944    308528    189416  62% /";
        __CLR4_4_18ir8irkylve0za.R.inc(11182);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11183);assertEquals(189416L, fsu.freeSpaceUnix("/", false, false, NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_NormalResponseFreeBSD() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytedpj8mo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_NormalResponseFreeBSD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytedpj8mo() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11184);
        // from Apache 'FreeBSD 6.1-RELEASE (SMP-turbo)'
        __CLR4_4_18ir8irkylve0za.R.inc(11185);final String lines =
                "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" +
                        "/dev/xxxxxx    128990    102902    15770    87%    /";
        __CLR4_4_18ir8irkylve0za.R.inc(11186);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11187);assertEquals(15770L, fsu.freeSpaceUnix("/", false, false, NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_NormalResponseKbLinux() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmql1r8ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_NormalResponseKbLinux",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmql1r8ms() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11188);
        // from Sourceforge 'GNU bash, version 2.05b.0(1)-release (i386-redhat-linux-gnu)'
        // df, df -k and df -kP are all identical
        __CLR4_4_18ir8irkylve0za.R.inc(11189);final String lines =
                "Filesystem           1K-blocks      Used Available Use% Mounted on\n" +
                        "/dev/xxx                497944    308528    189416  62% /";
        __CLR4_4_18ir8irkylve0za.R.inc(11190);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11191);assertEquals(189416L, fsu.freeSpaceUnix("/", true, false, NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g1fzs28mw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g1fzs28mw() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11192);
        // from Apache 'FreeBSD 6.1-RELEASE (SMP-turbo)'
        // df and df -k are identical, but df -kP uses 512 blocks (not relevant as not used)
        __CLR4_4_18ir8irkylve0za.R.inc(11193);final String lines =
                "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" +
                        "/dev/xxxxxx    128990    102902    15770    87%    /";
        __CLR4_4_18ir8irkylve0za.R.inc(11194);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11195);assertEquals(15770L, fsu.freeSpaceUnix("/", true, false, NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_NormalResponseKbSolaris() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ke9xwm8n0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_NormalResponseKbSolaris",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ke9xwm8n0() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11196);
        // from IO-91 - ' SunOS et 5.10 Generic_118822-25 sun4u sparc SUNW,Ultra-4'
        // non-kb response does not contain free space - see IO-91
        __CLR4_4_18ir8irkylve0za.R.inc(11197);final String lines =
                "Filesystem            kbytes    used   avail capacity  Mounted on\n" +
                        "/dev/dsk/x0x0x0x0    1350955  815754  481163    63%";
        __CLR4_4_18ir8irkylve0za.R.inc(11198);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11199);assertEquals(481163L, fsu.freeSpaceUnix("/dev/dsk/x0x0x0x0", true, false, NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_LongResponse() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1snqfqp8n4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_LongResponse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1snqfqp8n4() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11200);
        __CLR4_4_18ir8irkylve0za.R.inc(11201);final String lines =
                "Filesystem           1K-blocks      Used Available Use% Mounted on\n" +
                        "xxx-yyyyyyy-zzz:/home/users/s\n" +
                        "                      14428928  12956424   1472504  90% /home/users/s";
        __CLR4_4_18ir8irkylve0za.R.inc(11202);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11203);assertEquals(1472504L, fsu.freeSpaceUnix("/home/users/s", false, false, NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_LongResponseKb() throws Exception {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5q6rc8n8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_LongResponseKb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5q6rc8n8() throws Exception{try{__CLR4_4_18ir8irkylve0za.R.inc(11204);
        __CLR4_4_18ir8irkylve0za.R.inc(11205);final String lines =
                "Filesystem           1K-blocks      Used Available Use% Mounted on\n" +
                        "xxx-yyyyyyy-zzz:/home/users/s\n" +
                        "                      14428928  12956424   1472504  90% /home/users/s";
        __CLR4_4_18ir8irkylve0za.R.inc(11206);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11207);assertEquals(1472504L, fsu.freeSpaceUnix("/home/users/s", true, false, NEG_1_TIMEOUT));
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}
    @Test

    public void testGetFreeSpaceUnix_String_EmptyResponse() {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydg2zs8nc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_EmptyResponse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydg2zs8nc(){try{__CLR4_4_18ir8irkylve0za.R.inc(11208);
        __CLR4_4_18ir8irkylve0za.R.inc(11209);final String lines = "";
        __CLR4_4_18ir8irkylve0za.R.inc(11210);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11211);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11212);fsu.freeSpaceUnix("/home/users/s", false, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11213);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11214);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11215);fsu.freeSpaceUnix("/home/users/s", true, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11216);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11217);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11218);fsu.freeSpaceUnix("/home/users/s", false, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11219);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11220);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11221);fsu.freeSpaceUnix("/home/users/s", true, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11222);fail();
        } catch (final IOException ignore) {
        }
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_InvalidResponse1() {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omueoj8nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_InvalidResponse1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omueoj8nr(){try{__CLR4_4_18ir8irkylve0za.R.inc(11223);
        __CLR4_4_18ir8irkylve0za.R.inc(11224);final String lines =
                "Filesystem           1K-blocks      Used Available Use% Mounted on\n" +
                        "                      14428928  12956424       100";
        __CLR4_4_18ir8irkylve0za.R.inc(11225);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11226);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11227);fsu.freeSpaceUnix("/home/users/s", false, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11228);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11229);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11230);fsu.freeSpaceUnix("/home/users/s", true, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11231);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11232);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11233);fsu.freeSpaceUnix("/home/users/s", false, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11234);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11235);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11236);fsu.freeSpaceUnix("/home/users/s", true, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11237);fail();
        } catch (final IOException ignore) {
        }
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_InvalidResponse2() {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldufw28o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_InvalidResponse2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldufw28o6(){try{__CLR4_4_18ir8irkylve0za.R.inc(11238);
        __CLR4_4_18ir8irkylve0za.R.inc(11239);final String lines =
                "Filesystem           1K-blocks      Used Available Use% Mounted on\n" +
                        "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        __CLR4_4_18ir8irkylve0za.R.inc(11240);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11241);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11242);fsu.freeSpaceUnix("/home/users/s", false, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11243);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11244);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11245);fsu.freeSpaceUnix("/home/users/s", true, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11246);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11247);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11248);fsu.freeSpaceUnix("/home/users/s", false, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11249);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11250);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11251);fsu.freeSpaceUnix("/home/users/s", true, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11252);fail();
        } catch (final IOException ignore) {
        }
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_InvalidResponse3() {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4uh3l8ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_InvalidResponse3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4uh3l8ol(){try{__CLR4_4_18ir8irkylve0za.R.inc(11253);
        __CLR4_4_18ir8irkylve0za.R.inc(11254);final String lines =
                "Filesystem           1K-blocks      Used Available Use% Mounted on\n" +
                        "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        __CLR4_4_18ir8irkylve0za.R.inc(11255);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11256);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11257);fsu.freeSpaceUnix("/home/users/s", false, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11258);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11259);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11260);fsu.freeSpaceUnix("/home/users/s", true, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11261);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11262);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11263);fsu.freeSpaceUnix("/home/users/s", false, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11264);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11265);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11266);fsu.freeSpaceUnix("/home/users/s", true, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11267);fail();
        } catch (final IOException ignore) {
        }
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    @Test
    public void testGetFreeSpaceUnix_String_InvalidResponse4() {__CLR4_4_18ir8irkylve0za.R.globalSliceStart(getClass().getName(),11268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evuib48p0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ir8irkylve0za.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ir8irkylve0za.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemUtilsTestCase.testGetFreeSpaceUnix_String_InvalidResponse4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evuib48p0(){try{__CLR4_4_18ir8irkylve0za.R.inc(11268);
        __CLR4_4_18ir8irkylve0za.R.inc(11269);final String lines =
                "Filesystem           1K-blocks      Used Available Use% Mounted on\n" +
                        "xxx-yyyyyyy-zzz:/home/users/s";
        __CLR4_4_18ir8irkylve0za.R.inc(11270);final FileSystemUtils fsu = new MockFileSystemUtils(0, lines);
        __CLR4_4_18ir8irkylve0za.R.inc(11271);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11272);fsu.freeSpaceUnix("/home/users/s", false, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11273);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11274);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11275);fsu.freeSpaceUnix("/home/users/s", true, false, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11276);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11277);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11278);fsu.freeSpaceUnix("/home/users/s", false, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11279);fail();
        } catch (final IOException ignore) {
        }
        __CLR4_4_18ir8irkylve0za.R.inc(11280);try {
            __CLR4_4_18ir8irkylve0za.R.inc(11281);fsu.freeSpaceUnix("/home/users/s", true, true, NEG_1_TIMEOUT);
            __CLR4_4_18ir8irkylve0za.R.inc(11282);fail();
        } catch (final IOException ignore) {
        }
    }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

    static class MockFileSystemUtils extends FileSystemUtils {
        private final int exitCode;
        private final byte[] bytes;
        private final String cmd;

        public MockFileSystemUtils(final int exitCode, final String lines) {
            this(exitCode, lines, null);__CLR4_4_18ir8irkylve0za.R.inc(11284);try{__CLR4_4_18ir8irkylve0za.R.inc(11283);
        }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

        public MockFileSystemUtils(final int exitCode, final String lines, final String cmd) {try{__CLR4_4_18ir8irkylve0za.R.inc(11285);
            __CLR4_4_18ir8irkylve0za.R.inc(11286);this.exitCode = exitCode;
            __CLR4_4_18ir8irkylve0za.R.inc(11287);this.bytes = lines.getBytes();
            __CLR4_4_18ir8irkylve0za.R.inc(11288);this.cmd = cmd;
        }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

        @Override
        Process openProcess(final String[] params) {try{__CLR4_4_18ir8irkylve0za.R.inc(11289);
            __CLR4_4_18ir8irkylve0za.R.inc(11290);if ((((cmd != null)&&(__CLR4_4_18ir8irkylve0za.R.iget(11291)!=0|true))||(__CLR4_4_18ir8irkylve0za.R.iget(11292)==0&false))) {{
                __CLR4_4_18ir8irkylve0za.R.inc(11293);assertEquals(cmd, params[params.length - 1]);
            }
            }__CLR4_4_18ir8irkylve0za.R.inc(11294);return new Process() {
                @Override
                public InputStream getErrorStream() {try{__CLR4_4_18ir8irkylve0za.R.inc(11295);
                    __CLR4_4_18ir8irkylve0za.R.inc(11296);return null;
                }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

                @Override
                public InputStream getInputStream() {try{__CLR4_4_18ir8irkylve0za.R.inc(11297);
                    __CLR4_4_18ir8irkylve0za.R.inc(11298);return new ByteArrayInputStream(bytes);
                }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

                @Override
                public OutputStream getOutputStream() {try{__CLR4_4_18ir8irkylve0za.R.inc(11299);
                    __CLR4_4_18ir8irkylve0za.R.inc(11300);return null;
                }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

                @Override
                public int waitFor() throws InterruptedException {try{__CLR4_4_18ir8irkylve0za.R.inc(11301);
                    __CLR4_4_18ir8irkylve0za.R.inc(11302);return exitCode;
                }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

                @Override
                public int exitValue() {try{__CLR4_4_18ir8irkylve0za.R.inc(11303);
                    __CLR4_4_18ir8irkylve0za.R.inc(11304);return exitCode;
                }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}

                @Override
                public void destroy() {try{__CLR4_4_18ir8irkylve0za.R.inc(11305);
                }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}
            };
        }finally{__CLR4_4_18ir8irkylve0za.R.flushNeeded();}}
    }

}
