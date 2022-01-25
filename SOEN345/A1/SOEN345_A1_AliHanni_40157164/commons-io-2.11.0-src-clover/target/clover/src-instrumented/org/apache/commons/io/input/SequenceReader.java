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

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/**
 * Provides the contents of multiple Readers in sequence.
 *
 * @since 2.7
 */
public class SequenceReader extends Reader {public static class __CLR4_4_15hg5hgkylvdzz5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,7159,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Reader reader;
    private Iterator<? extends Reader> readers;

    /**
     * Construct a new instance with readers
     *
     * @param readers the readers to read
     */
    public SequenceReader(final Iterable<? extends Reader> readers) {try{__CLR4_4_15hg5hgkylvdzz5.R.inc(7108);
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7109);this.readers = Objects.requireNonNull(readers, "readers").iterator();
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7110);this.reader = nextReader();
    }finally{__CLR4_4_15hg5hgkylvdzz5.R.flushNeeded();}}

    /**
     * Construct a new instance with readers
     *
     * @param readers the readers to read
     */
    public SequenceReader(final Reader... readers) {
        this(Arrays.asList(readers));__CLR4_4_15hg5hgkylvdzz5.R.inc(7112);try{__CLR4_4_15hg5hgkylvdzz5.R.inc(7111);
    }finally{__CLR4_4_15hg5hgkylvdzz5.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     *
     * @see java.io.Reader#close()
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_15hg5hgkylvdzz5.R.inc(7113);
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7114);this.readers = null;
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7115);this.reader = null;
    }finally{__CLR4_4_15hg5hgkylvdzz5.R.flushNeeded();}}

    /**
     * Returns the next available reader or null if done.
     *
     * @return the next available reader or null
     */
    private Reader nextReader() {try{__CLR4_4_15hg5hgkylvdzz5.R.inc(7116);
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7117);return (((this.readers.hasNext() )&&(__CLR4_4_15hg5hgkylvdzz5.R.iget(7118)!=0|true))||(__CLR4_4_15hg5hgkylvdzz5.R.iget(7119)==0&false))? this.readers.next() : null;
    }finally{__CLR4_4_15hg5hgkylvdzz5.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     *
     * @see java.io.Reader#read(char[], int, int)
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_15hg5hgkylvdzz5.R.inc(7120);
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7121);int c = EOF;
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7122);while ((((reader != null)&&(__CLR4_4_15hg5hgkylvdzz5.R.iget(7123)!=0|true))||(__CLR4_4_15hg5hgkylvdzz5.R.iget(7124)==0&false))) {{
            __CLR4_4_15hg5hgkylvdzz5.R.inc(7125);c = reader.read();
            __CLR4_4_15hg5hgkylvdzz5.R.inc(7126);if ((((c != EOF)&&(__CLR4_4_15hg5hgkylvdzz5.R.iget(7127)!=0|true))||(__CLR4_4_15hg5hgkylvdzz5.R.iget(7128)==0&false))) {{
                __CLR4_4_15hg5hgkylvdzz5.R.inc(7129);break;
            }
            }__CLR4_4_15hg5hgkylvdzz5.R.inc(7130);reader = nextReader();
        }
        }__CLR4_4_15hg5hgkylvdzz5.R.inc(7131);return c;
    }finally{__CLR4_4_15hg5hgkylvdzz5.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     *
     * @see java.io.Reader#read()
     */
    @Override
    public int read(final char[] cbuf, int off, int len) throws IOException {try{__CLR4_4_15hg5hgkylvdzz5.R.inc(7132);
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7133);Objects.requireNonNull(cbuf, "cbuf");
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7134);if ((((len < 0 || off < 0 || off + len > cbuf.length)&&(__CLR4_4_15hg5hgkylvdzz5.R.iget(7135)!=0|true))||(__CLR4_4_15hg5hgkylvdzz5.R.iget(7136)==0&false))) {{
            __CLR4_4_15hg5hgkylvdzz5.R.inc(7137);throw new IndexOutOfBoundsException("Array Size=" + cbuf.length + ", offset=" + off + ", length=" + len);
        }
        }__CLR4_4_15hg5hgkylvdzz5.R.inc(7138);int count = 0;
        __CLR4_4_15hg5hgkylvdzz5.R.inc(7139);while ((((reader != null)&&(__CLR4_4_15hg5hgkylvdzz5.R.iget(7140)!=0|true))||(__CLR4_4_15hg5hgkylvdzz5.R.iget(7141)==0&false))) {{
            __CLR4_4_15hg5hgkylvdzz5.R.inc(7142);final int readLen = reader.read(cbuf, off, len);
            __CLR4_4_15hg5hgkylvdzz5.R.inc(7143);if ((((readLen == EOF)&&(__CLR4_4_15hg5hgkylvdzz5.R.iget(7144)!=0|true))||(__CLR4_4_15hg5hgkylvdzz5.R.iget(7145)==0&false))) {{
                __CLR4_4_15hg5hgkylvdzz5.R.inc(7146);reader = nextReader();
            } }else {{
                __CLR4_4_15hg5hgkylvdzz5.R.inc(7147);count += readLen;
                __CLR4_4_15hg5hgkylvdzz5.R.inc(7148);off += readLen;
                __CLR4_4_15hg5hgkylvdzz5.R.inc(7149);len -= readLen;
                __CLR4_4_15hg5hgkylvdzz5.R.inc(7150);if ((((len <= 0)&&(__CLR4_4_15hg5hgkylvdzz5.R.iget(7151)!=0|true))||(__CLR4_4_15hg5hgkylvdzz5.R.iget(7152)==0&false))) {{
                    __CLR4_4_15hg5hgkylvdzz5.R.inc(7153);break;
                }
            }}
        }}
        }__CLR4_4_15hg5hgkylvdzz5.R.inc(7154);if ((((count > 0)&&(__CLR4_4_15hg5hgkylvdzz5.R.iget(7155)!=0|true))||(__CLR4_4_15hg5hgkylvdzz5.R.iget(7156)==0&false))) {{
            __CLR4_4_15hg5hgkylvdzz5.R.inc(7157);return count;
        }
        }__CLR4_4_15hg5hgkylvdzz5.R.inc(7158);return EOF;
    }finally{__CLR4_4_15hg5hgkylvdzz5.R.flushNeeded();}}
}
