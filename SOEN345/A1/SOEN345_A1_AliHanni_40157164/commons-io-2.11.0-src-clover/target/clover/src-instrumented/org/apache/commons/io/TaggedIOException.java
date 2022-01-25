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

import java.io.IOException;
import java.io.Serializable;

/**
 * An {@link IOException} decorator that adds a serializable tag to the
 * wrapped exception. Both the tag and the original exception can be used
 * to determine further processing when this exception is caught.
 *
 * @since 2.0
 */
@SuppressWarnings("deprecation") // needs to extend deprecated IOExceptionWithCause to preserve binary compatibility
public class TaggedIOException extends IOExceptionWithCause {public static class __CLR4_4_12nf2nfkylvdz1z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3449,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Generated serial version UID.
     */
    private static final long serialVersionUID = -6994123481142850163L;

    /**
     * Checks whether the given throwable is tagged with the given tag.
     * <p>
     * This check can only succeed if the throwable is a
     * {@link TaggedIOException} and the tag is {@link Serializable}, but
     * the argument types are intentionally more generic to make it easier
     * to use this method without type casts.
     * <p>
     * A typical use for this method is in a {@code catch} block to
     * determine how a caught exception should be handled:
     * <pre>
     * Serializable tag = ...;
     * try {
     *     ...;
     * } catch (Throwable t) {
     *     if (TaggedIOException.isTaggedWith(t, tag)) {
     *         // special processing for tagged exception
     *     } else {
     *         // handling of other kinds of exceptions
     *     }
     * }
     * </pre>
     *
     * @param throwable The Throwable object to check
     * @param tag tag object
     * @return {@code true} if the throwable has the specified tag,
     * otherwise {@code false}
     */
    public static boolean isTaggedWith(final Throwable throwable, final Object tag) {try{__CLR4_4_12nf2nfkylvdz1z.R.inc(3435);
        __CLR4_4_12nf2nfkylvdz1z.R.inc(3436);return tag != null
            && throwable instanceof TaggedIOException
            && tag.equals(((TaggedIOException) throwable).tag);
    }finally{__CLR4_4_12nf2nfkylvdz1z.R.flushNeeded();}}

    /**
     * Throws the original {@link IOException} if the given throwable is
     * a {@link TaggedIOException} decorator the given tag. Does nothing
     * if the given throwable is of a different type or if it is tagged
     * with some other tag.
     * <p>
     * This method is typically used in a {@code catch} block to
     * selectively rethrow tagged exceptions.
     * <pre>
     * Serializable tag = ...;
     * try {
     *     ...;
     * } catch (Throwable t) {
     *     TaggedIOException.throwCauseIfTagged(t, tag);
     *     // handle other kinds of exceptions
     * }
     * </pre>
     *
     * @param throwable an exception
     * @param tag tag object
     * @throws IOException original exception from the tagged decorator, if any
     */
    public static void throwCauseIfTaggedWith(final Throwable throwable, final Object tag)
            throws IOException {try{__CLR4_4_12nf2nfkylvdz1z.R.inc(3437);
        __CLR4_4_12nf2nfkylvdz1z.R.inc(3438);if ((((isTaggedWith(throwable, tag))&&(__CLR4_4_12nf2nfkylvdz1z.R.iget(3439)!=0|true))||(__CLR4_4_12nf2nfkylvdz1z.R.iget(3440)==0&false))) {{
            __CLR4_4_12nf2nfkylvdz1z.R.inc(3441);throw ((TaggedIOException) throwable).getCause();
        }
    }}finally{__CLR4_4_12nf2nfkylvdz1z.R.flushNeeded();}}

    /**
     * The tag of this exception.
     */
    private final Serializable tag;

    /**
     * Creates a tagged wrapper for the given exception.
     *
     * @param original the exception to be tagged
     * @param tag tag of this exception
     */
    public TaggedIOException(final IOException original, final Serializable tag) {
        super(original.getMessage(), original);__CLR4_4_12nf2nfkylvdz1z.R.inc(3443);try{__CLR4_4_12nf2nfkylvdz1z.R.inc(3442);
        __CLR4_4_12nf2nfkylvdz1z.R.inc(3444);this.tag = tag;
    }finally{__CLR4_4_12nf2nfkylvdz1z.R.flushNeeded();}}

    /**
     * Returns the serializable tag object.
     *
     * @return tag object
     */
    public Serializable getTag() {try{__CLR4_4_12nf2nfkylvdz1z.R.inc(3445);
        __CLR4_4_12nf2nfkylvdz1z.R.inc(3446);return tag;
    }finally{__CLR4_4_12nf2nfkylvdz1z.R.flushNeeded();}}

    /**
     * Returns the wrapped exception. The only difference to the overridden
     * {@link Throwable#getCause()} method is the narrower return type.
     *
     * @return wrapped exception
     */
    @Override
    public synchronized IOException getCause() {try{__CLR4_4_12nf2nfkylvdz1z.R.inc(3447);
        __CLR4_4_12nf2nfkylvdz1z.R.inc(3448);return (IOException) super.getCause();
    }finally{__CLR4_4_12nf2nfkylvdz1z.R.flushNeeded();}}

}
