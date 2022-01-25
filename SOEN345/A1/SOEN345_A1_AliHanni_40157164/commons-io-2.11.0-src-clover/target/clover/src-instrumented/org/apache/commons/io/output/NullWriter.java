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

import java.io.Writer;

/**
 * Writes all data to the famous <b>/dev/null</b>.
 * <p>
 * This {@code Writer} has no destination (file/socket etc.) and all characters written to it are ignored and lost.
 * </p>
 */
public class NullWriter extends Writer {public static class __CLR4_4_174o74okylve0eo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9254,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A singleton.
     */
    public static final NullWriter NULL_WRITER = new NullWriter();

    /**
     * Constructs a new NullWriter.
     */
    public NullWriter() {try{__CLR4_4_174o74okylve0eo.R.inc(9240);
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /**
     * Does nothing - output to {@code /dev/null}.
     * @param c The character to write
     * @return this writer
     * @since 2.0
     */
    @Override
    public Writer append(final char c) {try{__CLR4_4_174o74okylve0eo.R.inc(9241);
        //to /dev/null
        __CLR4_4_174o74okylve0eo.R.inc(9242);return this;
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /**
     * Does nothing - output to {@code /dev/null}.
     * @param csq The character sequence to write
     * @param start The index of the first character to write
     * @param end  The index of the first character to write (exclusive)
     * @return this writer
     * @since 2.0
     */
    @Override
    public Writer append(final CharSequence csq, final int start, final int end) {try{__CLR4_4_174o74okylve0eo.R.inc(9243);
        //to /dev/null
        __CLR4_4_174o74okylve0eo.R.inc(9244);return this;
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /**
     * Does nothing - output to {@code /dev/null}.
     * @param csq The character sequence to write
     * @return this writer
     * @since 2.0
     */
    @Override
    public Writer append(final CharSequence csq) {try{__CLR4_4_174o74okylve0eo.R.inc(9245);
        //to /dev/null
        __CLR4_4_174o74okylve0eo.R.inc(9246);return this;
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /**
     * Does nothing - output to {@code /dev/null}.
     * @param idx The character to write
     */
    @Override
    public void write(final int idx) {try{__CLR4_4_174o74okylve0eo.R.inc(9247);
        //to /dev/null
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /**
     * Does nothing - output to {@code /dev/null}.
     * @param chr The characters to write
     */
    @Override
    public void write(final char[] chr) {try{__CLR4_4_174o74okylve0eo.R.inc(9248);
        //to /dev/null
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /**
     * Does nothing - output to {@code /dev/null}.
     * @param chr The characters to write
     * @param st The start offset
     * @param end The number of characters to write
     */
    @Override
    public void write(final char[] chr, final int st, final int end) {try{__CLR4_4_174o74okylve0eo.R.inc(9249);
        //to /dev/null
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /**
     * Does nothing - output to {@code /dev/null}.
     * @param str The string to write
     */
    @Override
    public void write(final String str) {try{__CLR4_4_174o74okylve0eo.R.inc(9250);
        //to /dev/null
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /**
     * Does nothing - output to {@code /dev/null}.
     * @param str The string to write
     * @param st The start offset
     * @param end The number of characters to write
     */
    @Override
    public void write(final String str, final int st, final int end) {try{__CLR4_4_174o74okylve0eo.R.inc(9251);
        //to /dev/null
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /** @see java.io.Writer#flush() */
    @Override
    public void flush() {try{__CLR4_4_174o74okylve0eo.R.inc(9252);
        //to /dev/null
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

    /** @see java.io.Writer#close() */
    @Override
    public void close() {try{__CLR4_4_174o74okylve0eo.R.inc(9253);
        //to /dev/null
    }finally{__CLR4_4_174o74okylve0eo.R.flushNeeded();}}

}