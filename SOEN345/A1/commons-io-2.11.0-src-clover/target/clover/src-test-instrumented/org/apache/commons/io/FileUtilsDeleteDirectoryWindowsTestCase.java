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

import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * Requires Windows admin karma or you get "You do not have sufficient privilege to perform this operation."
 */
@EnabledOnOs(OS.WINDOWS)
public class FileUtilsDeleteDirectoryWindowsTestCase extends FileUtilsDeleteDirectoryBaseTestCase {static class __CLR4_4_191x91xkylve12b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected boolean setupSymlink(final File res, final File link) throws Exception {try{__CLR4_4_191x91xkylve12b.R.inc(11733);
        // create symlink
        __CLR4_4_191x91xkylve12b.R.inc(11734);final List<String> args = new ArrayList<>();
        __CLR4_4_191x91xkylve12b.R.inc(11735);args.add("cmd");
        __CLR4_4_191x91xkylve12b.R.inc(11736);args.add("/C");
        // Requires Windows admin karma or you get "You do not have sufficient privilege to perform this operation."
        __CLR4_4_191x91xkylve12b.R.inc(11737);args.add("mklink");

        __CLR4_4_191x91xkylve12b.R.inc(11738);if ((((res.isDirectory())&&(__CLR4_4_191x91xkylve12b.R.iget(11739)!=0|true))||(__CLR4_4_191x91xkylve12b.R.iget(11740)==0&false))) {{
            __CLR4_4_191x91xkylve12b.R.inc(11741);args.add("/D");
        }

        }__CLR4_4_191x91xkylve12b.R.inc(11742);args.add(link.getAbsolutePath());
        __CLR4_4_191x91xkylve12b.R.inc(11743);args.add(res.getAbsolutePath());

        __CLR4_4_191x91xkylve12b.R.inc(11744);final Process proc = Runtime.getRuntime().exec(args.toArray(new String[args.size()]));
        __CLR4_4_191x91xkylve12b.R.inc(11745);final InputStream errorStream = proc.getErrorStream();
        __CLR4_4_191x91xkylve12b.R.inc(11746);final int rc = proc.waitFor();
        __CLR4_4_191x91xkylve12b.R.inc(11747);System.err.print(IOUtils.toString(errorStream, Charset.defaultCharset()));
        __CLR4_4_191x91xkylve12b.R.inc(11748);System.err.flush();
        __CLR4_4_191x91xkylve12b.R.inc(11749);return rc == 0;
    }finally{__CLR4_4_191x91xkylve12b.R.flushNeeded();}}

}
