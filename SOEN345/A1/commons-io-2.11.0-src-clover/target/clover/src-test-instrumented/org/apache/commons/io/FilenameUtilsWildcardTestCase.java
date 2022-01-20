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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class FilenameUtilsWildcardTestCase {static class __CLR4_4_1bdabdakylve1mq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,14882,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final boolean WINDOWS = File.separatorChar == '\\';

    // Testing:
    //   FilenameUtils.wildcardMatch(String,String)

    @Test
    public void testMatch() {__CLR4_4_1bdabdakylve1mq.R.globalSliceStart(getClass().getName(),14734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9s0jqbda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bdabdakylve1mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bdabdakylve1mq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsWildcardTestCase.testMatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9s0jqbda(){try{__CLR4_4_1bdabdakylve1mq.R.inc(14734);
        __CLR4_4_1bdabdakylve1mq.R.inc(14735);assertFalse(FilenameUtils.wildcardMatch(null, "Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14736);assertFalse(FilenameUtils.wildcardMatch("Foo", null));
        __CLR4_4_1bdabdakylve1mq.R.inc(14737);assertTrue(FilenameUtils.wildcardMatch(null, null));
        __CLR4_4_1bdabdakylve1mq.R.inc(14738);assertTrue(FilenameUtils.wildcardMatch("Foo", "Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14739);assertTrue(FilenameUtils.wildcardMatch("", ""));
        __CLR4_4_1bdabdakylve1mq.R.inc(14740);assertTrue(FilenameUtils.wildcardMatch("", "*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14741);assertFalse(FilenameUtils.wildcardMatch("", "?"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14742);assertTrue(FilenameUtils.wildcardMatch("Foo", "Fo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14743);assertTrue(FilenameUtils.wildcardMatch("Foo", "Fo?"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14744);assertTrue(FilenameUtils.wildcardMatch("Foo Bar and Catflap", "Fo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14745);assertTrue(FilenameUtils.wildcardMatch("New Bookmarks", "N?w ?o?k??r?s"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14746);assertFalse(FilenameUtils.wildcardMatch("Foo", "Bar"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14747);assertTrue(FilenameUtils.wildcardMatch("Foo Bar Foo", "F*o Bar*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14748);assertTrue(FilenameUtils.wildcardMatch("Adobe Acrobat Installer", "Ad*er"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14749);assertTrue(FilenameUtils.wildcardMatch("Foo", "*Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14750);assertTrue(FilenameUtils.wildcardMatch("BarFoo", "*Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14751);assertTrue(FilenameUtils.wildcardMatch("Foo", "Foo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14752);assertTrue(FilenameUtils.wildcardMatch("FooBar", "Foo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14753);assertFalse(FilenameUtils.wildcardMatch("FOO", "*Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14754);assertFalse(FilenameUtils.wildcardMatch("BARFOO", "*Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14755);assertFalse(FilenameUtils.wildcardMatch("FOO", "Foo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14756);assertFalse(FilenameUtils.wildcardMatch("FOOBAR", "Foo*"));
    }finally{__CLR4_4_1bdabdakylve1mq.R.flushNeeded();}}

    @Test
    public void testMatchOnSystem() {__CLR4_4_1bdabdakylve1mq.R.globalSliceStart(getClass().getName(),14757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkwb5kbdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bdabdakylve1mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bdabdakylve1mq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsWildcardTestCase.testMatchOnSystem",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkwb5kbdx(){try{__CLR4_4_1bdabdakylve1mq.R.inc(14757);
        __CLR4_4_1bdabdakylve1mq.R.inc(14758);assertFalse(FilenameUtils.wildcardMatchOnSystem(null, "Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14759);assertFalse(FilenameUtils.wildcardMatchOnSystem("Foo", null));
        __CLR4_4_1bdabdakylve1mq.R.inc(14760);assertTrue(FilenameUtils.wildcardMatchOnSystem(null, null));
        __CLR4_4_1bdabdakylve1mq.R.inc(14761);assertTrue(FilenameUtils.wildcardMatchOnSystem("Foo", "Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14762);assertTrue(FilenameUtils.wildcardMatchOnSystem("", ""));
        __CLR4_4_1bdabdakylve1mq.R.inc(14763);assertTrue(FilenameUtils.wildcardMatchOnSystem("Foo", "Fo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14764);assertTrue(FilenameUtils.wildcardMatchOnSystem("Foo", "Fo?"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14765);assertTrue(FilenameUtils.wildcardMatchOnSystem("Foo Bar and Catflap", "Fo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14766);assertTrue(FilenameUtils.wildcardMatchOnSystem("New Bookmarks", "N?w ?o?k??r?s"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14767);assertFalse(FilenameUtils.wildcardMatchOnSystem("Foo", "Bar"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14768);assertTrue(FilenameUtils.wildcardMatchOnSystem("Foo Bar Foo", "F*o Bar*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14769);assertTrue(FilenameUtils.wildcardMatchOnSystem("Adobe Acrobat Installer", "Ad*er"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14770);assertTrue(FilenameUtils.wildcardMatchOnSystem("Foo", "*Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14771);assertTrue(FilenameUtils.wildcardMatchOnSystem("BarFoo", "*Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14772);assertTrue(FilenameUtils.wildcardMatchOnSystem("Foo", "Foo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14773);assertTrue(FilenameUtils.wildcardMatchOnSystem("FooBar", "Foo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14774);assertEquals(WINDOWS, FilenameUtils.wildcardMatchOnSystem("FOO", "*Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14775);assertEquals(WINDOWS, FilenameUtils.wildcardMatchOnSystem("BARFOO", "*Foo"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14776);assertEquals(WINDOWS, FilenameUtils.wildcardMatchOnSystem("FOO", "Foo*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14777);assertEquals(WINDOWS, FilenameUtils.wildcardMatchOnSystem("FOOBAR", "Foo*"));
    }finally{__CLR4_4_1bdabdakylve1mq.R.flushNeeded();}}

    @Test
    public void testMatchCaseSpecified() {__CLR4_4_1bdabdakylve1mq.R.globalSliceStart(getClass().getName(),14778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbrwxgbei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bdabdakylve1mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bdabdakylve1mq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsWildcardTestCase.testMatchCaseSpecified",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sbrwxgbei(){try{__CLR4_4_1bdabdakylve1mq.R.inc(14778);
        __CLR4_4_1bdabdakylve1mq.R.inc(14779);assertFalse(FilenameUtils.wildcardMatch(null, "Foo", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14780);assertFalse(FilenameUtils.wildcardMatch("Foo", null, IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14781);assertTrue(FilenameUtils.wildcardMatch(null, null, IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14782);assertTrue(FilenameUtils.wildcardMatch("Foo", "Foo", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14783);assertTrue(FilenameUtils.wildcardMatch("", "", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14784);assertTrue(FilenameUtils.wildcardMatch("Foo", "Fo*", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14785);assertTrue(FilenameUtils.wildcardMatch("Foo", "Fo?", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14786);assertTrue(FilenameUtils.wildcardMatch("Foo Bar and Catflap", "Fo*", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14787);assertTrue(FilenameUtils.wildcardMatch("New Bookmarks", "N?w ?o?k??r?s", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14788);assertFalse(FilenameUtils.wildcardMatch("Foo", "Bar", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14789);assertTrue(FilenameUtils.wildcardMatch("Foo Bar Foo", "F*o Bar*", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14790);assertTrue(FilenameUtils.wildcardMatch("Adobe Acrobat Installer", "Ad*er", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14791);assertTrue(FilenameUtils.wildcardMatch("Foo", "*Foo", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14792);assertTrue(FilenameUtils.wildcardMatch("Foo", "Foo*", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14793);assertTrue(FilenameUtils.wildcardMatch("Foo", "*Foo", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14794);assertTrue(FilenameUtils.wildcardMatch("BarFoo", "*Foo", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14795);assertTrue(FilenameUtils.wildcardMatch("Foo", "Foo*", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14796);assertTrue(FilenameUtils.wildcardMatch("FooBar", "Foo*", IOCase.SENSITIVE));

        __CLR4_4_1bdabdakylve1mq.R.inc(14797);assertFalse(FilenameUtils.wildcardMatch("FOO", "*Foo", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14798);assertFalse(FilenameUtils.wildcardMatch("BARFOO", "*Foo", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14799);assertFalse(FilenameUtils.wildcardMatch("FOO", "Foo*", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14800);assertFalse(FilenameUtils.wildcardMatch("FOOBAR", "Foo*", IOCase.SENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14801);assertTrue(FilenameUtils.wildcardMatch("FOO", "*Foo", IOCase.INSENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14802);assertTrue(FilenameUtils.wildcardMatch("BARFOO", "*Foo", IOCase.INSENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14803);assertTrue(FilenameUtils.wildcardMatch("FOO", "Foo*", IOCase.INSENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14804);assertTrue(FilenameUtils.wildcardMatch("FOOBAR", "Foo*", IOCase.INSENSITIVE));
        __CLR4_4_1bdabdakylve1mq.R.inc(14805);assertEquals(WINDOWS, FilenameUtils.wildcardMatch("FOO", "*Foo", IOCase.SYSTEM));
        __CLR4_4_1bdabdakylve1mq.R.inc(14806);assertEquals(WINDOWS, FilenameUtils.wildcardMatch("BARFOO", "*Foo", IOCase.SYSTEM));
        __CLR4_4_1bdabdakylve1mq.R.inc(14807);assertEquals(WINDOWS, FilenameUtils.wildcardMatch("FOO", "Foo*", IOCase.SYSTEM));
        __CLR4_4_1bdabdakylve1mq.R.inc(14808);assertEquals(WINDOWS, FilenameUtils.wildcardMatch("FOOBAR", "Foo*", IOCase.SYSTEM));
    }finally{__CLR4_4_1bdabdakylve1mq.R.flushNeeded();}}

    @Test
    public void testSplitOnTokens() {__CLR4_4_1bdabdakylve1mq.R.globalSliceStart(getClass().getName(),14809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7rtxkbfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bdabdakylve1mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bdabdakylve1mq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsWildcardTestCase.testSplitOnTokens",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7rtxkbfd(){try{__CLR4_4_1bdabdakylve1mq.R.inc(14809);
        __CLR4_4_1bdabdakylve1mq.R.inc(14810);assertArrayEquals(new String[] { "Ad", "*", "er" }, FilenameUtils.splitOnTokens("Ad*er"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14811);assertArrayEquals(new String[] { "Ad", "?", "er" }, FilenameUtils.splitOnTokens("Ad?er"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14812);assertArrayEquals(new String[] { "Test", "*", "?", "One" }, FilenameUtils.splitOnTokens("Test*?One"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14813);assertArrayEquals(new String[] { "Test", "?", "*", "One" }, FilenameUtils.splitOnTokens("Test?*One"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14814);assertArrayEquals(new String[] { "*" }, FilenameUtils.splitOnTokens("****"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14815);assertArrayEquals(new String[] { "*", "?", "?", "*" }, FilenameUtils.splitOnTokens("*??*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14816);assertArrayEquals(new String[] { "*", "?", "*", "?", "*" }, FilenameUtils.splitOnTokens("*?**?*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14817);assertArrayEquals(new String[] { "*", "?", "*", "?", "*" }, FilenameUtils.splitOnTokens("*?***?*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14818);assertArrayEquals(new String[] { "h", "?", "?", "*" }, FilenameUtils.splitOnTokens("h??*"));
        __CLR4_4_1bdabdakylve1mq.R.inc(14819);assertArrayEquals(new String[] { "" }, FilenameUtils.splitOnTokens(""));
    }finally{__CLR4_4_1bdabdakylve1mq.R.flushNeeded();}}

    private void assertMatch(final String text, final String wildcard, final boolean expected) {try{__CLR4_4_1bdabdakylve1mq.R.inc(14820);
        __CLR4_4_1bdabdakylve1mq.R.inc(14821);assertEquals(expected, FilenameUtils.wildcardMatch(text, wildcard), text + " " + wildcard);
    }finally{__CLR4_4_1bdabdakylve1mq.R.flushNeeded();}}

    // A separate set of tests, added to this batch
    @Test
    public void testMatch2() {__CLR4_4_1bdabdakylve1mq.R.globalSliceStart(getClass().getName(),14822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19pkdd2bfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bdabdakylve1mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bdabdakylve1mq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsWildcardTestCase.testMatch2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19pkdd2bfq(){try{__CLR4_4_1bdabdakylve1mq.R.inc(14822);
        __CLR4_4_1bdabdakylve1mq.R.inc(14823);assertMatch("log.txt", "log.txt", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14824);assertMatch("log.txt1", "log.txt", false);

        __CLR4_4_1bdabdakylve1mq.R.inc(14825);assertMatch("log.txt", "log.txt*", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14826);assertMatch("log.txt", "log.txt*1", false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14827);assertMatch("log.txt", "*log.txt*", true);

        __CLR4_4_1bdabdakylve1mq.R.inc(14828);assertMatch("log.txt", "*.txt", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14829);assertMatch("txt.log", "*.txt", false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14830);assertMatch("config.ini", "*.ini", true);

        __CLR4_4_1bdabdakylve1mq.R.inc(14831);assertMatch("config.txt.bak", "con*.txt", false);

        __CLR4_4_1bdabdakylve1mq.R.inc(14832);assertMatch("log.txt9", "*.txt?", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14833);assertMatch("log.txt", "*.txt?", false);

        __CLR4_4_1bdabdakylve1mq.R.inc(14834);assertMatch("progtestcase.java~5~", "*test*.java~*~", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14835);assertMatch("progtestcase.java;5~", "*test*.java~*~", false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14836);assertMatch("progtestcase.java~5", "*test*.java~*~", false);

        __CLR4_4_1bdabdakylve1mq.R.inc(14837);assertMatch("log.txt", "log.*", true);

        __CLR4_4_1bdabdakylve1mq.R.inc(14838);assertMatch("log.txt", "log?*", true);

        __CLR4_4_1bdabdakylve1mq.R.inc(14839);assertMatch("log.txt12", "log.txt??", true);

        __CLR4_4_1bdabdakylve1mq.R.inc(14840);assertMatch("log.log", "log**log", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14841);assertMatch("log.log", "log**", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14842);assertMatch("log.log", "log.**", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14843);assertMatch("log.log", "**.log", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14844);assertMatch("log.log", "**log", true);

        __CLR4_4_1bdabdakylve1mq.R.inc(14845);assertMatch("log.log", "log*log", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14846);assertMatch("log.log", "log*", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14847);assertMatch("log.log", "log.*", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14848);assertMatch("log.log", "*.log", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14849);assertMatch("log.log", "*log", true);

        __CLR4_4_1bdabdakylve1mq.R.inc(14850);assertMatch("log.log", "*log?", false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14851);assertMatch("log.log", "*log?*", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14852);assertMatch("log.log.abc", "*log?abc", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14853);assertMatch("log.log.abc.log.abc", "*log?abc", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14854);assertMatch("log.log.abc.log.abc.d", "*log?abc?d", true);
    }finally{__CLR4_4_1bdabdakylve1mq.R.flushNeeded();}}

    /**
     * See https://issues.apache.org/jira/browse/IO-246
     */
    @Test
    public void test_IO_246() {__CLR4_4_1bdabdakylve1mq.R.globalSliceStart(getClass().getName(),14855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpaz3jbgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bdabdakylve1mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bdabdakylve1mq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsWildcardTestCase.test_IO_246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpaz3jbgn(){try{__CLR4_4_1bdabdakylve1mq.R.inc(14855);

        // Tests for "*?"
        __CLR4_4_1bdabdakylve1mq.R.inc(14856);assertMatch("aaa", "aa*?", true);
        // these ought to work as well, but "*?" does not work properly at present
//      assertMatch("aaa", "a*?", true);
//      assertMatch("aaa", "*?", true);

        // Tests for "?*"
        __CLR4_4_1bdabdakylve1mq.R.inc(14857);assertMatch("",    "?*",   false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14858);assertMatch("a",   "a?*",  false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14859);assertMatch("aa",  "aa?*", false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14860);assertMatch("a",   "?*",   true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14861);assertMatch("aa",  "?*",   true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14862);assertMatch("aaa", "?*",   true);

        // Test ending on "?"
        __CLR4_4_1bdabdakylve1mq.R.inc(14863);assertMatch("",    "?", false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14864);assertMatch("a",   "a?", false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14865);assertMatch("aa",  "aa?", false);
        __CLR4_4_1bdabdakylve1mq.R.inc(14866);assertMatch("aab", "aa?", true);
        __CLR4_4_1bdabdakylve1mq.R.inc(14867);assertMatch("aaa", "*a", true);
    }finally{__CLR4_4_1bdabdakylve1mq.R.flushNeeded();}}

    @Test
    public void testLocaleIndependence() {__CLR4_4_1bdabdakylve1mq.R.globalSliceStart(getClass().getName(),14868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xg9p1rbh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bdabdakylve1mq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bdabdakylve1mq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FilenameUtilsWildcardTestCase.testLocaleIndependence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xg9p1rbh0(){try{__CLR4_4_1bdabdakylve1mq.R.inc(14868);
        __CLR4_4_1bdabdakylve1mq.R.inc(14869);final Locale orig = Locale.getDefault();

        __CLR4_4_1bdabdakylve1mq.R.inc(14870);final Locale[] locales = Locale.getAvailableLocales();

        __CLR4_4_1bdabdakylve1mq.R.inc(14871);final String[][] data = {
            { "I", "i"},
            { "i", "I"},
            { "i", "\u0130"},
            { "i", "\u0131"},
            { "\u03a3", "\u03c2"},
            { "\u03a3", "\u03c3"},
            { "\u03c2", "\u03c3"},
        };

        __CLR4_4_1bdabdakylve1mq.R.inc(14872);try {
            __CLR4_4_1bdabdakylve1mq.R.inc(14873);for (int i = 0; (((i < data.length)&&(__CLR4_4_1bdabdakylve1mq.R.iget(14874)!=0|true))||(__CLR4_4_1bdabdakylve1mq.R.iget(14875)==0&false)); i++) {{
                __CLR4_4_1bdabdakylve1mq.R.inc(14876);for (final Locale locale : locales) {{
                    __CLR4_4_1bdabdakylve1mq.R.inc(14877);Locale.setDefault(locale);
                    __CLR4_4_1bdabdakylve1mq.R.inc(14878);assertTrue(data[i][0].equalsIgnoreCase(data[i][1]), "Test data corrupt: " + i);
                    __CLR4_4_1bdabdakylve1mq.R.inc(14879);final boolean match = FilenameUtils.wildcardMatch(data[i][0], data[i][1], IOCase.INSENSITIVE);
                    __CLR4_4_1bdabdakylve1mq.R.inc(14880);assertTrue(match, Locale.getDefault().toString() + ": " + i);
                }
            }}
        }} finally {
            __CLR4_4_1bdabdakylve1mq.R.inc(14881);Locale.setDefault(orig);
        }
    }finally{__CLR4_4_1bdabdakylve1mq.R.flushNeeded();}}

}
