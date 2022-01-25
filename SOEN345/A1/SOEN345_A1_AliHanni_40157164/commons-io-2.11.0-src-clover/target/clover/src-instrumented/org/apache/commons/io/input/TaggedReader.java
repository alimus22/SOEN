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
import java.io.Reader;
import java.io.Serializable;
import java.util.UUID;

import org.apache.commons.io.TaggedIOException;

/**
 * A reader decorator that tags potential exceptions so that the reader that caused the exception can easily be
 * identified. This is done by using the {@link TaggedIOException} class to wrap all thrown {@link IOException}s. See
 * below for an example of using this class.
 *
 * <pre>
 * TaggedReader reader = new TaggedReader(...);
 * try {
 *     // Processing that may throw an IOException either from this reader
 *     // or from some other IO activity like temporary files, etc.
 *     processReader(reader);
 * } catch (IOException e) {
 *     if (reader.isCauseOf(e)) {
 *         // The exception was caused by this reader.
 *         // Use e.getCause() to get the original exception.
 *     } else {
 *         // The exception was caused by something else.
 *     }
 * }
 * </pre>
 * <p>
 * Alternatively, the {@link #throwIfCauseOf(Throwable)} method can be used to let higher levels of code handle the
 * exception caused by this reader while other processing errors are being taken care of at this lower level.
 * </p>
 *
 * <pre>
 * TaggedReader reader = new TaggedReader(...);
 * try {
 *     processReader(reader);
 * } catch (IOException e) {
 *     reader.throwIfCauseOf(e);
 *     // ... or process the exception that was caused by something else
 * }
 * </pre>
 *
 * @see TaggedIOException
 * @since 2.7
 */
public class TaggedReader extends ProxyReader {public static class __CLR4_4_15k95k9kylvdzzx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,7217,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The unique tag associated with exceptions from reader.
     */
    private final Serializable tag = UUID.randomUUID();

    /**
     * Creates a tagging decorator for the given reader.
     *
     * @param proxy reader to be decorated
     */
    public TaggedReader(final Reader proxy) {
        super(proxy);__CLR4_4_15k95k9kylvdzzx.R.inc(7210);try{__CLR4_4_15k95k9kylvdzzx.R.inc(7209);
    }finally{__CLR4_4_15k95k9kylvdzzx.R.flushNeeded();}}

    /**
     * Tests if the given exception was caused by this reader.
     *
     * @param exception an exception
     * @return {@code true} if the exception was thrown by this reader, {@code false} otherwise
     */
    public boolean isCauseOf(final Throwable exception) {try{__CLR4_4_15k95k9kylvdzzx.R.inc(7211);
        __CLR4_4_15k95k9kylvdzzx.R.inc(7212);return TaggedIOException.isTaggedWith(exception, tag);
    }finally{__CLR4_4_15k95k9kylvdzzx.R.flushNeeded();}}

    /**
     * Re-throws the original exception thrown by this reader. This method first checks whether the given exception is a
     * {@link TaggedIOException} wrapper created by this decorator, and then unwraps and throws the original wrapped
     * exception. Returns normally if the exception was not thrown by this reader.
     *
     * @param throwable an exception
     * @throws IOException original exception, if any, thrown by this reader
     */
    public void throwIfCauseOf(final Throwable throwable) throws IOException {try{__CLR4_4_15k95k9kylvdzzx.R.inc(7213);
        __CLR4_4_15k95k9kylvdzzx.R.inc(7214);TaggedIOException.throwCauseIfTaggedWith(throwable, tag);
    }finally{__CLR4_4_15k95k9kylvdzzx.R.flushNeeded();}}

    /**
     * Tags any IOExceptions thrown, wrapping and re-throwing.
     *
     * @param e The IOException thrown
     * @throws IOException if an I/O error occurs.
     */
    @Override
    protected void handleIOException(final IOException e) throws IOException {try{__CLR4_4_15k95k9kylvdzzx.R.inc(7215);
        __CLR4_4_15k95k9kylvdzzx.R.inc(7216);throw new TaggedIOException(e, tag);
    }finally{__CLR4_4_15k95k9kylvdzzx.R.flushNeeded();}}

}