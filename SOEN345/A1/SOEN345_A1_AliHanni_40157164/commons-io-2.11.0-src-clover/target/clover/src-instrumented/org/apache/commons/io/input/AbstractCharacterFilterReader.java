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

import static org.apache.commons.io.IOUtils.EOF;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.util.function.IntPredicate;

/**
 * A filter reader that filters out characters where subclasses decide which characters to filter out.
 */
public abstract class AbstractCharacterFilterReader extends FilterReader {public static class __CLR4_4_1448448kylvdzof{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5372,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Skips nothing.
     *
     * @since 2.9.0
     */
    protected static final IntPredicate SKIP_NONE = ch -> false;

    private final IntPredicate skip;

    /**
     * Constructs a new reader.
     *
     * @param reader the reader to filter
     */
    protected AbstractCharacterFilterReader(final Reader reader) {
        this(reader, SKIP_NONE);__CLR4_4_1448448kylvdzof.R.inc(5337);try{__CLR4_4_1448448kylvdzof.R.inc(5336);
    }finally{__CLR4_4_1448448kylvdzof.R.flushNeeded();}}

    /**
     * Constructs a new reader.
     *
     * @param reader the reader to filter.
     * @param skip Skip test.
     * @since 2.9.0
     */
    protected AbstractCharacterFilterReader(final Reader reader, final IntPredicate skip) {
        super(reader);__CLR4_4_1448448kylvdzof.R.inc(5339);try{__CLR4_4_1448448kylvdzof.R.inc(5338);
        __CLR4_4_1448448kylvdzof.R.inc(5340);this.skip = (((skip == null )&&(__CLR4_4_1448448kylvdzof.R.iget(5341)!=0|true))||(__CLR4_4_1448448kylvdzof.R.iget(5342)==0&false))? SKIP_NONE : skip;
    }finally{__CLR4_4_1448448kylvdzof.R.flushNeeded();}}

    /**
     * Returns true if the given character should be filtered out, false to keep the character.
     *
     * @param ch the character to test.
     * @return true if the given character should be filtered out, false to keep the character.
     */
    protected boolean filter(final int ch) {try{__CLR4_4_1448448kylvdzof.R.inc(5343);
        __CLR4_4_1448448kylvdzof.R.inc(5344);return skip.test(ch);
    }finally{__CLR4_4_1448448kylvdzof.R.flushNeeded();}}

    @Override
    public int read() throws IOException {try{__CLR4_4_1448448kylvdzof.R.inc(5345);
        __CLR4_4_1448448kylvdzof.R.inc(5346);int ch;
        __CLR4_4_1448448kylvdzof.R.inc(5347);do {{
            __CLR4_4_1448448kylvdzof.R.inc(5348);ch = in.read();
        } }while ((((ch != EOF && filter(ch))&&(__CLR4_4_1448448kylvdzof.R.iget(5349)!=0|true))||(__CLR4_4_1448448kylvdzof.R.iget(5350)==0&false)));
        __CLR4_4_1448448kylvdzof.R.inc(5351);return ch;
    }finally{__CLR4_4_1448448kylvdzof.R.flushNeeded();}}

    @Override
    public int read(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_1448448kylvdzof.R.inc(5352);
        __CLR4_4_1448448kylvdzof.R.inc(5353);final int read = super.read(cbuf, off, len);
        __CLR4_4_1448448kylvdzof.R.inc(5354);if ((((read == EOF)&&(__CLR4_4_1448448kylvdzof.R.iget(5355)!=0|true))||(__CLR4_4_1448448kylvdzof.R.iget(5356)==0&false))) {{
            __CLR4_4_1448448kylvdzof.R.inc(5357);return EOF;
        }
        }__CLR4_4_1448448kylvdzof.R.inc(5358);int pos = off - 1;
        __CLR4_4_1448448kylvdzof.R.inc(5359);for (int readPos = off; (((readPos < off + read)&&(__CLR4_4_1448448kylvdzof.R.iget(5360)!=0|true))||(__CLR4_4_1448448kylvdzof.R.iget(5361)==0&false)); readPos++) {{
            __CLR4_4_1448448kylvdzof.R.inc(5362);if ((((filter(cbuf[readPos]))&&(__CLR4_4_1448448kylvdzof.R.iget(5363)!=0|true))||(__CLR4_4_1448448kylvdzof.R.iget(5364)==0&false))) {{
                __CLR4_4_1448448kylvdzof.R.inc(5365);continue;
            }
            }__CLR4_4_1448448kylvdzof.R.inc(5366);pos++;
            __CLR4_4_1448448kylvdzof.R.inc(5367);if ((((pos < readPos)&&(__CLR4_4_1448448kylvdzof.R.iget(5368)!=0|true))||(__CLR4_4_1448448kylvdzof.R.iget(5369)==0&false))) {{
                __CLR4_4_1448448kylvdzof.R.inc(5370);cbuf[pos] = cbuf[readPos];
            }
        }}
        }__CLR4_4_1448448kylvdzof.R.inc(5371);return pos - off + 1;
    }finally{__CLR4_4_1448448kylvdzof.R.flushNeeded();}}
}
