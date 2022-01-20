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

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import org.apache.commons.io.IOUtils;

/**
 *
 * An {@link InputStream} that repeats provided bytes for given target byte count.
 * <p>
 * Closing this input stream has no effect. The methods in this class can be called after the stream has been closed
 * without generating an {@link IOException}.
 * </p>
 *
 * @see InfiniteCircularInputStream
 * @since 2.8.0
 */
public class CircularInputStream extends InputStream {public static class __CLR4_4_14m24m2kylvdzs9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,6004,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Throws an {@link IllegalArgumentException} if the input contains -1.
     *
     * @param repeatContent input to validate.
     * @return the input.
     */
    private static byte[] validate(final byte[] repeatContent) {try{__CLR4_4_14m24m2kylvdzs9.R.inc(5978);
        __CLR4_4_14m24m2kylvdzs9.R.inc(5979);Objects.requireNonNull(repeatContent, "repeatContent");
        __CLR4_4_14m24m2kylvdzs9.R.inc(5980);for (final byte b : repeatContent) {{
            __CLR4_4_14m24m2kylvdzs9.R.inc(5981);if ((((b == IOUtils.EOF)&&(__CLR4_4_14m24m2kylvdzs9.R.iget(5982)!=0|true))||(__CLR4_4_14m24m2kylvdzs9.R.iget(5983)==0&false))) {{
                __CLR4_4_14m24m2kylvdzs9.R.inc(5984);throw new IllegalArgumentException("repeatContent contains the end-of-stream marker " + IOUtils.EOF);
            }
        }}
        }__CLR4_4_14m24m2kylvdzs9.R.inc(5985);return repeatContent;
    }finally{__CLR4_4_14m24m2kylvdzs9.R.flushNeeded();}}

    private long byteCount;
    private int position = -1;
    private final byte[] repeatedContent;
    private final long targetByteCount;

    /**
     * Creates an instance from the specified array of bytes.
     *
     * @param repeatContent Input buffer to be repeated this buffer is not copied.
     * @param targetByteCount How many bytes the read. A negative number means an infinite target count.
     */
    public CircularInputStream(final byte[] repeatContent, final long targetByteCount) {try{__CLR4_4_14m24m2kylvdzs9.R.inc(5986);
        __CLR4_4_14m24m2kylvdzs9.R.inc(5987);this.repeatedContent = validate(repeatContent);
        __CLR4_4_14m24m2kylvdzs9.R.inc(5988);if ((((repeatContent.length == 0)&&(__CLR4_4_14m24m2kylvdzs9.R.iget(5989)!=0|true))||(__CLR4_4_14m24m2kylvdzs9.R.iget(5990)==0&false))) {{
            __CLR4_4_14m24m2kylvdzs9.R.inc(5991);throw new IllegalArgumentException("repeatContent is empty.");
        }
        }__CLR4_4_14m24m2kylvdzs9.R.inc(5992);this.targetByteCount = targetByteCount;
    }finally{__CLR4_4_14m24m2kylvdzs9.R.flushNeeded();}}

    @Override
    public int read() {try{__CLR4_4_14m24m2kylvdzs9.R.inc(5993);
        __CLR4_4_14m24m2kylvdzs9.R.inc(5994);if ((((targetByteCount >= 0)&&(__CLR4_4_14m24m2kylvdzs9.R.iget(5995)!=0|true))||(__CLR4_4_14m24m2kylvdzs9.R.iget(5996)==0&false))) {{
            __CLR4_4_14m24m2kylvdzs9.R.inc(5997);if ((((byteCount == targetByteCount)&&(__CLR4_4_14m24m2kylvdzs9.R.iget(5998)!=0|true))||(__CLR4_4_14m24m2kylvdzs9.R.iget(5999)==0&false))) {{
                __CLR4_4_14m24m2kylvdzs9.R.inc(6000);return IOUtils.EOF;
            }
            }__CLR4_4_14m24m2kylvdzs9.R.inc(6001);byteCount++;
        }
        }__CLR4_4_14m24m2kylvdzs9.R.inc(6002);position = (position + 1) % repeatedContent.length;
        __CLR4_4_14m24m2kylvdzs9.R.inc(6003);return repeatedContent[position] & 0xff;
    }finally{__CLR4_4_14m24m2kylvdzs9.R.flushNeeded();}}

}
