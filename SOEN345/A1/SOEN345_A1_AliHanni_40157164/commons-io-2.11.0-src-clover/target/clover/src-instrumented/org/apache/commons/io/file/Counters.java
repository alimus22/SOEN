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

package org.apache.commons.io.file;

import java.math.BigInteger;
import java.util.Objects;

/**
 * Provides counters for files, directories, and sizes, as a visit proceeds.
 *
 * @since 2.7
 */
public class Counters {public static class __CLR4_4_12x82x8kylvdz67{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3899,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Counts files, directories, and sizes, as a visit proceeds.
     */
    private static class AbstractPathCounters implements PathCounters {

        private final Counter byteCounter;
        private final Counter directoryCounter;
        private final Counter fileCounter;

        /**
         * Constructs a new instance.
         *
         * @param byteCounter the byte counter.
         * @param directoryCounter the directory counter.
         * @param fileCounter the file counter.
         */
        protected AbstractPathCounters(final Counter byteCounter, final Counter directoryCounter,
            final Counter fileCounter) {try{__CLR4_4_12x82x8kylvdz67.R.inc(3788);
            __CLR4_4_12x82x8kylvdz67.R.inc(3789);this.byteCounter = byteCounter;
            __CLR4_4_12x82x8kylvdz67.R.inc(3790);this.directoryCounter = directoryCounter;
            __CLR4_4_12x82x8kylvdz67.R.inc(3791);this.fileCounter = fileCounter;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_4_12x82x8kylvdz67.R.inc(3792);
            __CLR4_4_12x82x8kylvdz67.R.inc(3793);if ((((this == obj)&&(__CLR4_4_12x82x8kylvdz67.R.iget(3794)!=0|true))||(__CLR4_4_12x82x8kylvdz67.R.iget(3795)==0&false))) {{
                __CLR4_4_12x82x8kylvdz67.R.inc(3796);return true;
            }
            }__CLR4_4_12x82x8kylvdz67.R.inc(3797);if ((((!(obj instanceof AbstractPathCounters))&&(__CLR4_4_12x82x8kylvdz67.R.iget(3798)!=0|true))||(__CLR4_4_12x82x8kylvdz67.R.iget(3799)==0&false))) {{
                __CLR4_4_12x82x8kylvdz67.R.inc(3800);return false;
            }
            }__CLR4_4_12x82x8kylvdz67.R.inc(3801);final AbstractPathCounters other = (AbstractPathCounters) obj;
            __CLR4_4_12x82x8kylvdz67.R.inc(3802);return Objects.equals(byteCounter, other.byteCounter)
                && Objects.equals(directoryCounter, other.directoryCounter)
                && Objects.equals(fileCounter, other.fileCounter);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public Counter getByteCounter() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3803);
            __CLR4_4_12x82x8kylvdz67.R.inc(3804);return byteCounter;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public Counter getDirectoryCounter() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3805);
            __CLR4_4_12x82x8kylvdz67.R.inc(3806);return directoryCounter;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        /**
         * Gets the count of visited files.
         *
         * @return the byte count of visited files.
         */
        @Override
        public Counter getFileCounter() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3807);
            __CLR4_4_12x82x8kylvdz67.R.inc(3808);return this.fileCounter;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3809);
            __CLR4_4_12x82x8kylvdz67.R.inc(3810);return Objects.hash(byteCounter, directoryCounter, fileCounter);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public void reset() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3811);
            __CLR4_4_12x82x8kylvdz67.R.inc(3812);byteCounter.reset();
            __CLR4_4_12x82x8kylvdz67.R.inc(3813);directoryCounter.reset();
            __CLR4_4_12x82x8kylvdz67.R.inc(3814);fileCounter.reset();
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3815);
            __CLR4_4_12x82x8kylvdz67.R.inc(3816);return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(fileCounter.get()),
                Long.valueOf(directoryCounter.get()), Long.valueOf(byteCounter.get()));
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    }

    /**
     * Counts using a BigInteger number.
     */
    private static final class BigIntegerCounter implements Counter {

        private BigInteger value = BigInteger.ZERO;

        @Override
        public void add(final long val) {try{__CLR4_4_12x82x8kylvdz67.R.inc(3817);
            __CLR4_4_12x82x8kylvdz67.R.inc(3818);value = value.add(BigInteger.valueOf(val));

        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_4_12x82x8kylvdz67.R.inc(3819);
            __CLR4_4_12x82x8kylvdz67.R.inc(3820);if ((((this == obj)&&(__CLR4_4_12x82x8kylvdz67.R.iget(3821)!=0|true))||(__CLR4_4_12x82x8kylvdz67.R.iget(3822)==0&false))) {{
                __CLR4_4_12x82x8kylvdz67.R.inc(3823);return true;
            }
            }__CLR4_4_12x82x8kylvdz67.R.inc(3824);if ((((!(obj instanceof Counter))&&(__CLR4_4_12x82x8kylvdz67.R.iget(3825)!=0|true))||(__CLR4_4_12x82x8kylvdz67.R.iget(3826)==0&false))) {{
                __CLR4_4_12x82x8kylvdz67.R.inc(3827);return false;
            }
            }__CLR4_4_12x82x8kylvdz67.R.inc(3828);final Counter other = (Counter) obj;
            __CLR4_4_12x82x8kylvdz67.R.inc(3829);return Objects.equals(value, other.getBigInteger());
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public long get() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3830);
            __CLR4_4_12x82x8kylvdz67.R.inc(3831);return value.longValueExact();
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public BigInteger getBigInteger() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3832);
            __CLR4_4_12x82x8kylvdz67.R.inc(3833);return value;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public Long getLong() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3834);
            __CLR4_4_12x82x8kylvdz67.R.inc(3835);return Long.valueOf(value.longValueExact());
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3836);
            __CLR4_4_12x82x8kylvdz67.R.inc(3837);return Objects.hash(value);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public void increment() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3838);
            __CLR4_4_12x82x8kylvdz67.R.inc(3839);value = value.add(BigInteger.ONE);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3840);
            __CLR4_4_12x82x8kylvdz67.R.inc(3841);return value.toString();
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public void reset() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3842);
            __CLR4_4_12x82x8kylvdz67.R.inc(3843);value = BigInteger.ZERO;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}
    }

    /**
     * Counts files, directories, and sizes, as a visit proceeds, using BigInteger numbers.
     */
    private final static class BigIntegerPathCounters extends AbstractPathCounters {

        /**
         * Constructs a new initialized instance.
         */
        protected BigIntegerPathCounters() {
            super(Counters.bigIntegerCounter(), Counters.bigIntegerCounter(), Counters.bigIntegerCounter());__CLR4_4_12x82x8kylvdz67.R.inc(3845);try{__CLR4_4_12x82x8kylvdz67.R.inc(3844);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    }

    /**
     * Counts using a number.
     */
    public interface Counter {

        /**
         * Adds the given number to this counter.
         *
         * @param val the value to add.
         */
        void add(long val);

        /**
         * Gets the counter as a long.
         *
         * @return the counter as a long.
         */
        long get();

        /**
         * Gets the counter as a BigInteger.
         *
         * @return the counter as a BigInteger.
         */
        BigInteger getBigInteger();

        /**
         * Gets the counter as a Long.
         *
         * @return the counter as a Long.
         */
        Long getLong();

        /**
         * Adds one to this counter.
         */
        void increment();

        /**
         * Resets this count to 0.
         */
        default void reset() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3846);
            // binary compat, do nothing
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    }

    /**
     * Counts using a long number.
     */
    private final static class LongCounter implements Counter {

        private long value;

        @Override
        public void add(final long add) {try{__CLR4_4_12x82x8kylvdz67.R.inc(3847);
            __CLR4_4_12x82x8kylvdz67.R.inc(3848);value += add;

        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_4_12x82x8kylvdz67.R.inc(3849);
            __CLR4_4_12x82x8kylvdz67.R.inc(3850);if ((((this == obj)&&(__CLR4_4_12x82x8kylvdz67.R.iget(3851)!=0|true))||(__CLR4_4_12x82x8kylvdz67.R.iget(3852)==0&false))) {{
                __CLR4_4_12x82x8kylvdz67.R.inc(3853);return true;
            }
            }__CLR4_4_12x82x8kylvdz67.R.inc(3854);if ((((!(obj instanceof Counter))&&(__CLR4_4_12x82x8kylvdz67.R.iget(3855)!=0|true))||(__CLR4_4_12x82x8kylvdz67.R.iget(3856)==0&false))) {{
                __CLR4_4_12x82x8kylvdz67.R.inc(3857);return false;
            }
            }__CLR4_4_12x82x8kylvdz67.R.inc(3858);final Counter other = (Counter) obj;
            __CLR4_4_12x82x8kylvdz67.R.inc(3859);return value == other.get();
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public long get() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3860);
            __CLR4_4_12x82x8kylvdz67.R.inc(3861);return value;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public BigInteger getBigInteger() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3862);
            __CLR4_4_12x82x8kylvdz67.R.inc(3863);return BigInteger.valueOf(value);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public Long getLong() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3864);
            __CLR4_4_12x82x8kylvdz67.R.inc(3865);return Long.valueOf(value);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3866);
            __CLR4_4_12x82x8kylvdz67.R.inc(3867);return Objects.hash(value);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public void increment() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3868);
            __CLR4_4_12x82x8kylvdz67.R.inc(3869);value++;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3870);
            __CLR4_4_12x82x8kylvdz67.R.inc(3871);return Long.toString(value);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public void reset() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3872);
            __CLR4_4_12x82x8kylvdz67.R.inc(3873);value = 0L;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}
    }

    /**
     * Counts files, directories, and sizes, as a visit proceeds, using long numbers.
     */
    private final static class LongPathCounters extends AbstractPathCounters {

        /**
         * Constructs a new initialized instance.
         */
        protected LongPathCounters() {
            super(Counters.longCounter(), Counters.longCounter(), Counters.longCounter());__CLR4_4_12x82x8kylvdz67.R.inc(3875);try{__CLR4_4_12x82x8kylvdz67.R.inc(3874);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    }

    /**
     * Counts nothing.
     */
    private final static class NoopCounter implements Counter {

        static final NoopCounter INSTANCE = new NoopCounter();

        @Override
        public void add(final long add) {try{__CLR4_4_12x82x8kylvdz67.R.inc(3876);
            // noop
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public long get() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3877);
            __CLR4_4_12x82x8kylvdz67.R.inc(3878);return 0;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public BigInteger getBigInteger() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3879);
            __CLR4_4_12x82x8kylvdz67.R.inc(3880);return BigInteger.ZERO;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public Long getLong() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3881);
            __CLR4_4_12x82x8kylvdz67.R.inc(3882);return 0L;
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

        @Override
        public void increment() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3883);
            // noop
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    }

    /**
     * Counts nothing.
     */
    private static final class NoopPathCounters extends AbstractPathCounters {

        static final NoopPathCounters INSTANCE = new NoopPathCounters();

        /**
         * Constructs a new initialized instance.
         */
        private NoopPathCounters() {
            super(Counters.noopCounter(), Counters.noopCounter(), Counters.noopCounter());__CLR4_4_12x82x8kylvdz67.R.inc(3885);try{__CLR4_4_12x82x8kylvdz67.R.inc(3884);
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    }

    /**
     * Counts files, directories, and sizes, as a visit proceeds.
     */
    public interface PathCounters {

        /**
         * Gets the byte counter.
         *
         * @return the byte counter.
         */
        Counter getByteCounter();

        /**
         * Gets the directory counter.
         *
         * @return the directory counter.
         */
        Counter getDirectoryCounter();

        /**
         * Gets the file counter.
         *
         * @return the file counter.
         */
        Counter getFileCounter();

        /**
         * Resets the counts to 0.
         */
        default void reset() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3886);
            // binary compat, do nothing
        }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    }

    /**
     * Returns a new BigInteger Counter.
     *
     * @return a new BigInteger Counter.
     */
    public static Counter bigIntegerCounter() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3887);
        __CLR4_4_12x82x8kylvdz67.R.inc(3888);return new BigIntegerCounter();
    }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    /**
     * Returns a new BigInteger PathCounters.
     *
     * @return a new BigInteger PathCounters.
     */
    public static PathCounters bigIntegerPathCounters() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3889);
        __CLR4_4_12x82x8kylvdz67.R.inc(3890);return new BigIntegerPathCounters();
    }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    /**
     * Returns a new long Counter.
     *
     * @return a new long Counter.
     */
    public static Counter longCounter() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3891);
        __CLR4_4_12x82x8kylvdz67.R.inc(3892);return new LongCounter();
    }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    /**
     * Returns a new BigInteger PathCounters.
     *
     * @return a new BigInteger PathCounters.
     */
    public static PathCounters longPathCounters() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3893);
        __CLR4_4_12x82x8kylvdz67.R.inc(3894);return new LongPathCounters();
    }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    /**
     * Returns the NOOP Counter.
     *
     * @return the NOOP Counter.
     * @since 2.9.0
     */
    public static Counter noopCounter() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3895);
        __CLR4_4_12x82x8kylvdz67.R.inc(3896);return NoopCounter.INSTANCE;
    }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}

    /**
     * Returns the NOOP PathCounters.
     *
     * @return the NOOP PathCounters.
     * @since 2.9.0
     */
    public static PathCounters noopPathCounters() {try{__CLR4_4_12x82x8kylvdz67.R.inc(3897);
        __CLR4_4_12x82x8kylvdz67.R.inc(3898);return NoopPathCounters.INSTANCE;
    }finally{__CLR4_4_12x82x8kylvdz67.R.flushNeeded();}}
}
