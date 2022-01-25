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

package org.apache.commons.io.function;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Like {@link Function} but throws {@link IOException}.
 *
 * @param <T> the type of the input to the operations.
 * @param <R> the return type of the operations.
 * @since 2.7
 */
@FunctionalInterface
public interface IOFunction<T, R> {public static class __CLR4_4_143i43ikylvdzo0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5336,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     *
     * @throws IOException if the function throws an IOException
     */
    R apply(final T t) throws IOException;

    /**
     * Returns a composed {@link IOFunction} that first applies the {@code before}
     * function to its input, and then applies this function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param <V> the type of input to the {@code before} function, and to the
     *           composed function
     * @param before the function to apply before this function is applied
     * @return a composed function that first applies the {@code before}
     * function and then applies this function
     * @throws NullPointerException if before is null
     *
     * @see #andThen(IOFunction)
     */
    default <V> IOFunction<V, R> compose(final IOFunction<? super V, ? extends T> before) {try{__CLR4_4_143i43ikylvdzo0.R.inc(5310);
        __CLR4_4_143i43ikylvdzo0.R.inc(5311);Objects.requireNonNull(before, "before");
        __CLR4_4_143i43ikylvdzo0.R.inc(5312);return (final V v) -> apply(before.apply(v));
    }finally{__CLR4_4_143i43ikylvdzo0.R.flushNeeded();}}

    /**
     * Returns a composed {@link IOFunction} that first applies the {@code before}
     * function to its input, and then applies this function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param <V> the type of input to the {@code before} function, and to the
     *           composed function
     * @param before the function to apply before this function is applied
     * @return a composed function that first applies the {@code before}
     * function and then applies this function
     * @throws NullPointerException if before is null
     *
     * @see #andThen(IOFunction)
     */
    default <V> IOFunction<V, R> compose(final Function<? super V, ? extends T> before) {try{__CLR4_4_143i43ikylvdzo0.R.inc(5313);
        __CLR4_4_143i43ikylvdzo0.R.inc(5314);Objects.requireNonNull(before, "before");
        __CLR4_4_143i43ikylvdzo0.R.inc(5315);return (final V v) -> apply(before.apply(v));
    }finally{__CLR4_4_143i43ikylvdzo0.R.flushNeeded();}}

    /**
     * Returns a composed {@link IOFunction} that first applies the {@code before}
     * function to its input, and then applies this function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param before the supplier which feeds the application of this function
     * @return a composed function that first applies the {@code before}
     * function and then applies this function
     * @throws NullPointerException if before is null
     *
     * @see #andThen(IOFunction)
     */
    default IOSupplier<R> compose(final IOSupplier<? extends T> before) {try{__CLR4_4_143i43ikylvdzo0.R.inc(5316);
        __CLR4_4_143i43ikylvdzo0.R.inc(5317);Objects.requireNonNull(before, "before");
        __CLR4_4_143i43ikylvdzo0.R.inc(5318);return () -> apply(before.get());
    }finally{__CLR4_4_143i43ikylvdzo0.R.flushNeeded();}}

    /**
     * Returns a composed {@link IOFunction} that first applies the {@code before}
     * function to its input, and then applies this function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param before the supplier which feeds the application of this function
     * @return a composed function that first applies the {@code before}
     * function and then applies this function
     * @throws NullPointerException if before is null
     *
     * @see #andThen(IOFunction)
     */
    default IOSupplier<R> compose(final Supplier<? extends T> before) {try{__CLR4_4_143i43ikylvdzo0.R.inc(5319);
        __CLR4_4_143i43ikylvdzo0.R.inc(5320);Objects.requireNonNull(before, "before");
        __CLR4_4_143i43ikylvdzo0.R.inc(5321);return () -> apply(before.get());
    }finally{__CLR4_4_143i43ikylvdzo0.R.flushNeeded();}}

    /**
     * Returns a composed {@link IOFunction} that first applies this function to
     * its input, and then applies the {@code after} function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param <V> the type of output of the {@code after} function, and of the
     *           composed function
     * @param after the function to apply after this function is applied
     * @return a composed function that first applies this function and then
     * applies the {@code after} function
     * @throws NullPointerException if after is null
     *
     * @see #compose(IOFunction)
     */
    default <V> IOFunction<T, V> andThen(final IOFunction<? super R, ? extends V> after) {try{__CLR4_4_143i43ikylvdzo0.R.inc(5322);
        __CLR4_4_143i43ikylvdzo0.R.inc(5323);Objects.requireNonNull(after, "after");
        __CLR4_4_143i43ikylvdzo0.R.inc(5324);return (final T t) -> after.apply(apply(t));
    }finally{__CLR4_4_143i43ikylvdzo0.R.flushNeeded();}}

    /**
     * Returns a composed {@link IOFunction} that first applies this function to
     * its input, and then applies the {@code after} function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param <V> the type of output of the {@code after} function, and of the
     *           composed function
     * @param after the function to apply after this function is applied
     * @return a composed function that first applies this function and then
     * applies the {@code after} function
     * @throws NullPointerException if after is null
     *
     * @see #compose(IOFunction)
     */
    default <V> IOFunction<T, V> andThen(final Function<? super R, ? extends V> after) {try{__CLR4_4_143i43ikylvdzo0.R.inc(5325);
        __CLR4_4_143i43ikylvdzo0.R.inc(5326);Objects.requireNonNull(after, "after");
        __CLR4_4_143i43ikylvdzo0.R.inc(5327);return (final T t) -> after.apply(apply(t));
    }finally{__CLR4_4_143i43ikylvdzo0.R.flushNeeded();}}

    /**
     * Returns a composed {@link IOFunction} that first applies this function to
     * its input, and then applies the {@code after} consumer to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param after the consumer to apply after this function is applied
     * @return a composed function that first applies this function and then
     * applies the {@code after} consumer
     * @throws NullPointerException if after is null
     *
     * @see #compose(IOFunction)
     */
    default IOConsumer<T> andThen(final IOConsumer<? super R> after) {try{__CLR4_4_143i43ikylvdzo0.R.inc(5328);
        __CLR4_4_143i43ikylvdzo0.R.inc(5329);Objects.requireNonNull(after, "after");
        __CLR4_4_143i43ikylvdzo0.R.inc(5330);return (final T t) -> after.accept(apply(t));
    }finally{__CLR4_4_143i43ikylvdzo0.R.flushNeeded();}}

    /**
     * Returns a composed {@link IOFunction} that first applies this function to
     * its input, and then applies the {@code after} consumer to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param after the consumer to apply after this function is applied
     * @return a composed function that first applies this function and then
     * applies the {@code after} consumer
     * @throws NullPointerException if after is null
     *
     * @see #compose(IOFunction)
     */
    default IOConsumer<T> andThen(final Consumer<? super R> after) {try{__CLR4_4_143i43ikylvdzo0.R.inc(5331);
        __CLR4_4_143i43ikylvdzo0.R.inc(5332);Objects.requireNonNull(after, "after");
        __CLR4_4_143i43ikylvdzo0.R.inc(5333);return (final T t) -> after.accept(apply(t));
    }finally{__CLR4_4_143i43ikylvdzo0.R.flushNeeded();}}

    /**
     * Returns a {@link IOFunction} that always returns its input argument.
     *
     * @param <T> the type of the input and output objects to the function
     * @return a function that always returns its input argument
     */
    static <T> IOFunction<T, T> identity() {try{__CLR4_4_143i43ikylvdzo0.R.inc(5334);
        __CLR4_4_143i43ikylvdzo0.R.inc(5335);return t -> t;
    }finally{__CLR4_4_143i43ikylvdzo0.R.flushNeeded();}}
}
