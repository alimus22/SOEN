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

import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.Test;

public class FileSystemTestCase {static class __CLR4_4_18gx8gxkylve0y4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11043,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    @Test
    public void testGetCurrent() {__CLR4_4_18gx8gxkylve0y4.R.globalSliceStart(getClass().getName(),10977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19i52jg8gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18gx8gxkylve0y4.R.rethrow($CLV_t2$);}finally{__CLR4_4_18gx8gxkylve0y4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemTestCase.testGetCurrent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19i52jg8gx(){try{__CLR4_4_18gx8gxkylve0y4.R.inc(10977);
        __CLR4_4_18gx8gxkylve0y4.R.inc(10978);if ((((SystemUtils.IS_OS_WINDOWS)&&(__CLR4_4_18gx8gxkylve0y4.R.iget(10979)!=0|true))||(__CLR4_4_18gx8gxkylve0y4.R.iget(10980)==0&false))) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(10981);assertEquals(FileSystem.WINDOWS, FileSystem.getCurrent());
        }
        }__CLR4_4_18gx8gxkylve0y4.R.inc(10982);if ((((SystemUtils.IS_OS_LINUX)&&(__CLR4_4_18gx8gxkylve0y4.R.iget(10983)!=0|true))||(__CLR4_4_18gx8gxkylve0y4.R.iget(10984)==0&false))) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(10985);assertEquals(FileSystem.LINUX, FileSystem.getCurrent());
        }
        }__CLR4_4_18gx8gxkylve0y4.R.inc(10986);if ((((SystemUtils.IS_OS_MAC_OSX)&&(__CLR4_4_18gx8gxkylve0y4.R.iget(10987)!=0|true))||(__CLR4_4_18gx8gxkylve0y4.R.iget(10988)==0&false))) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(10989);assertEquals(FileSystem.MAC_OSX, FileSystem.getCurrent());
        }
    }}finally{__CLR4_4_18gx8gxkylve0y4.R.flushNeeded();}}

    @Test
    public void testIsLegalName() {__CLR4_4_18gx8gxkylve0y4.R.globalSliceStart(getClass().getName(),10990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfxsy98ha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18gx8gxkylve0y4.R.rethrow($CLV_t2$);}finally{__CLR4_4_18gx8gxkylve0y4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemTestCase.testIsLegalName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfxsy98ha(){try{__CLR4_4_18gx8gxkylve0y4.R.inc(10990);
        __CLR4_4_18gx8gxkylve0y4.R.inc(10991);for (final FileSystem fs : FileSystem.values()) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(10992);assertFalse(fs.isLegalFileName(""), fs.name()); // Empty is always illegal
            __CLR4_4_18gx8gxkylve0y4.R.inc(10993);assertFalse(fs.isLegalFileName(null), fs.name()); // null is always illegal
            __CLR4_4_18gx8gxkylve0y4.R.inc(10994);assertFalse(fs.isLegalFileName("\0"), fs.name()); // Assume NUL is always illegal
            __CLR4_4_18gx8gxkylve0y4.R.inc(10995);assertTrue(fs.isLegalFileName("0"), fs.name()); // Assume simple name always legal
            __CLR4_4_18gx8gxkylve0y4.R.inc(10996);for (final String candidate : fs.getReservedFileNames()) {{
                // Reserved file names are not legal
                __CLR4_4_18gx8gxkylve0y4.R.inc(10997);assertFalse(fs.isLegalFileName(candidate));
            }
        }}
    }}finally{__CLR4_4_18gx8gxkylve0y4.R.flushNeeded();}}

    @Test
    public void testIsReservedFileName() {__CLR4_4_18gx8gxkylve0y4.R.globalSliceStart(getClass().getName(),10998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btfaoi8hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18gx8gxkylve0y4.R.rethrow($CLV_t2$);}finally{__CLR4_4_18gx8gxkylve0y4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemTestCase.testIsReservedFileName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btfaoi8hi(){try{__CLR4_4_18gx8gxkylve0y4.R.inc(10998);
        __CLR4_4_18gx8gxkylve0y4.R.inc(10999);for (final FileSystem fs : FileSystem.values()) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(11000);for (final String candidate : fs.getReservedFileNames()) {{
                __CLR4_4_18gx8gxkylve0y4.R.inc(11001);assertTrue(fs.isReservedFileName(candidate));
            }
        }}
    }}finally{__CLR4_4_18gx8gxkylve0y4.R.flushNeeded();}}

    @Test
    public void testReplacementWithNUL() {__CLR4_4_18gx8gxkylve0y4.R.globalSliceStart(getClass().getName(),11002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4ox6i8hm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18gx8gxkylve0y4.R.rethrow($CLV_t2$);}finally{__CLR4_4_18gx8gxkylve0y4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemTestCase.testReplacementWithNUL",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4ox6i8hm(){try{__CLR4_4_18gx8gxkylve0y4.R.inc(11002);
        __CLR4_4_18gx8gxkylve0y4.R.inc(11003);for (final FileSystem fs : FileSystem.values()) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(11004);try {
                __CLR4_4_18gx8gxkylve0y4.R.inc(11005);fs.toLegalFileName("Test", '\0'); // Assume NUL is always illegal
            } catch (final IllegalArgumentException iae) {
                __CLR4_4_18gx8gxkylve0y4.R.inc(11006);assertTrue(iae.getMessage().startsWith("The replacement character '\\0'"), iae.getMessage());
            }
        }
    }}finally{__CLR4_4_18gx8gxkylve0y4.R.flushNeeded();}}

    @Test
    public void testSorted() {__CLR4_4_18gx8gxkylve0y4.R.globalSliceStart(getClass().getName(),11007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14iot3q8hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18gx8gxkylve0y4.R.rethrow($CLV_t2$);}finally{__CLR4_4_18gx8gxkylve0y4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemTestCase.testSorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14iot3q8hr(){try{__CLR4_4_18gx8gxkylve0y4.R.inc(11007);
        __CLR4_4_18gx8gxkylve0y4.R.inc(11008);for (final FileSystem fs : FileSystem.values()) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(11009);final char[] chars = fs.getIllegalFileNameChars();
            __CLR4_4_18gx8gxkylve0y4.R.inc(11010);for (int i = 0; (((i < chars.length - 1)&&(__CLR4_4_18gx8gxkylve0y4.R.iget(11011)!=0|true))||(__CLR4_4_18gx8gxkylve0y4.R.iget(11012)==0&false)); i++) {{
                __CLR4_4_18gx8gxkylve0y4.R.inc(11013);assertTrue(chars[i] < chars[i + 1], fs.name());
            }
        }}
    }}finally{__CLR4_4_18gx8gxkylve0y4.R.flushNeeded();}}

    @Test
    public void testSupportsDriveLetter() {__CLR4_4_18gx8gxkylve0y4.R.globalSliceStart(getClass().getName(),11014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tp7xrz8hy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18gx8gxkylve0y4.R.rethrow($CLV_t2$);}finally{__CLR4_4_18gx8gxkylve0y4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemTestCase.testSupportsDriveLetter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tp7xrz8hy(){try{__CLR4_4_18gx8gxkylve0y4.R.inc(11014);
        __CLR4_4_18gx8gxkylve0y4.R.inc(11015);assertTrue(FileSystem.WINDOWS.supportsDriveLetter());
        __CLR4_4_18gx8gxkylve0y4.R.inc(11016);assertFalse(FileSystem.GENERIC.supportsDriveLetter());
        __CLR4_4_18gx8gxkylve0y4.R.inc(11017);assertFalse(FileSystem.LINUX.supportsDriveLetter());
        __CLR4_4_18gx8gxkylve0y4.R.inc(11018);assertFalse(FileSystem.MAC_OSX.supportsDriveLetter());
    }finally{__CLR4_4_18gx8gxkylve0y4.R.flushNeeded();}}

    @Test
    public void testToLegalFileNameWindows() {__CLR4_4_18gx8gxkylve0y4.R.globalSliceStart(getClass().getName(),11019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0lgxj8i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18gx8gxkylve0y4.R.rethrow($CLV_t2$);}finally{__CLR4_4_18gx8gxkylve0y4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileSystemTestCase.testToLegalFileNameWindows",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0lgxj8i3(){try{__CLR4_4_18gx8gxkylve0y4.R.inc(11019);
        __CLR4_4_18gx8gxkylve0y4.R.inc(11020);final FileSystem fs = FileSystem.WINDOWS;
        __CLR4_4_18gx8gxkylve0y4.R.inc(11021);final char replacement = '-';
        __CLR4_4_18gx8gxkylve0y4.R.inc(11022);for (char i = 0; (((i < 32)&&(__CLR4_4_18gx8gxkylve0y4.R.iget(11023)!=0|true))||(__CLR4_4_18gx8gxkylve0y4.R.iget(11024)==0&false)); i++) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(11025);assertEquals(replacement, fs.toLegalFileName(String.valueOf(i), replacement).charAt(0));
        }
        }__CLR4_4_18gx8gxkylve0y4.R.inc(11026);final char[] illegal = { '<', '>', ':', '"', '/', '\\', '|', '?', '*' };
        __CLR4_4_18gx8gxkylve0y4.R.inc(11027);for (char i = 0; (((i < illegal.length)&&(__CLR4_4_18gx8gxkylve0y4.R.iget(11028)!=0|true))||(__CLR4_4_18gx8gxkylve0y4.R.iget(11029)==0&false)); i++) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(11030);assertEquals(replacement, fs.toLegalFileName(String.valueOf(i), replacement).charAt(0));
        }
        }__CLR4_4_18gx8gxkylve0y4.R.inc(11031);for (char i = 'a'; (((i < 'z')&&(__CLR4_4_18gx8gxkylve0y4.R.iget(11032)!=0|true))||(__CLR4_4_18gx8gxkylve0y4.R.iget(11033)==0&false)); i++) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(11034);assertEquals(i, fs.toLegalFileName(String.valueOf(i), replacement).charAt(0));
        }
        }__CLR4_4_18gx8gxkylve0y4.R.inc(11035);for (char i = 'A'; (((i < 'Z')&&(__CLR4_4_18gx8gxkylve0y4.R.iget(11036)!=0|true))||(__CLR4_4_18gx8gxkylve0y4.R.iget(11037)==0&false)); i++) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(11038);assertEquals(i, fs.toLegalFileName(String.valueOf(i), replacement).charAt(0));
        }
        }__CLR4_4_18gx8gxkylve0y4.R.inc(11039);for (char i = '0'; (((i < '9')&&(__CLR4_4_18gx8gxkylve0y4.R.iget(11040)!=0|true))||(__CLR4_4_18gx8gxkylve0y4.R.iget(11041)==0&false)); i++) {{
            __CLR4_4_18gx8gxkylve0y4.R.inc(11042);assertEquals(i, fs.toLegalFileName(String.valueOf(i), replacement).charAt(0));
        }
    }}finally{__CLR4_4_18gx8gxkylve0y4.R.flushNeeded();}}
}
