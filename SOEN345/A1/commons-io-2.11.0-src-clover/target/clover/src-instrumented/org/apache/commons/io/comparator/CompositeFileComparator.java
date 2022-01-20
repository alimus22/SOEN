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
package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Compare two files using a set of delegate file {@link Comparator}.
 * <p>
 * This comparator can be used to sort lists or arrays of files
 * by combining a number other comparators.
 * <p>
 * Example of sorting a list of files by type (i.e. directory or file)
 * and then by name:
 * <pre>
 *       CompositeFileComparator comparator =
 *                       new CompositeFileComparator(
 *                                 (AbstractFileComparator) DirectoryFileComparator.DIRECTORY_COMPARATOR,
 *                                 (AbstractFileComparator) NameFileComparator.NAME_COMPARATOR);
 *       List&lt;File&gt; list = ...
 *       comparator.sort(list);
 * </pre>
 *
 * @since 2.0
 */
public class CompositeFileComparator extends AbstractFileComparator implements Serializable {public static class __CLR4_4_12p42p4kylvdz2t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,3535,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Comparator<?>[] EMPTY_COMPARATOR_ARRAY = {};
    private static final long serialVersionUID = -2224170307287243428L;
    private static final Comparator<?>[] NO_COMPARATORS = {};
    private final Comparator<File>[] delegates;

    /**
     * Create a composite comparator for the set of delegate comparators.
     *
     * @param delegates The delegate file comparators
     */
    @SuppressWarnings("unchecked") // casts 1 & 2 must be OK because types are already correct
    public CompositeFileComparator(final Comparator<File>... delegates) {try{__CLR4_4_12p42p4kylvdz2t.R.inc(3496);
        __CLR4_4_12p42p4kylvdz2t.R.inc(3497);if ((((delegates == null)&&(__CLR4_4_12p42p4kylvdz2t.R.iget(3498)!=0|true))||(__CLR4_4_12p42p4kylvdz2t.R.iget(3499)==0&false))) {{
            __CLR4_4_12p42p4kylvdz2t.R.inc(3500);this.delegates = (Comparator<File>[]) NO_COMPARATORS;//1
        } }else {{
            __CLR4_4_12p42p4kylvdz2t.R.inc(3501);this.delegates = (Comparator<File>[]) new Comparator<?>[delegates.length];//2
            __CLR4_4_12p42p4kylvdz2t.R.inc(3502);System.arraycopy(delegates, 0, this.delegates, 0, delegates.length);
        }
    }}finally{__CLR4_4_12p42p4kylvdz2t.R.flushNeeded();}}

    /**
     * Create a composite comparator for the set of delegate comparators.
     *
     * @param delegates The delegate file comparators
     */
    @SuppressWarnings("unchecked") // casts 1 & 2 must be OK because types are already correct
    public CompositeFileComparator(final Iterable<Comparator<File>> delegates) {try{__CLR4_4_12p42p4kylvdz2t.R.inc(3503);
        __CLR4_4_12p42p4kylvdz2t.R.inc(3504);if ((((delegates == null)&&(__CLR4_4_12p42p4kylvdz2t.R.iget(3505)!=0|true))||(__CLR4_4_12p42p4kylvdz2t.R.iget(3506)==0&false))) {{
            __CLR4_4_12p42p4kylvdz2t.R.inc(3507);this.delegates = (Comparator<File>[]) NO_COMPARATORS; //1
        } }else {{
            __CLR4_4_12p42p4kylvdz2t.R.inc(3508);final List<Comparator<File>> list = new ArrayList<>();
            __CLR4_4_12p42p4kylvdz2t.R.inc(3509);for (final Comparator<File> comparator : delegates) {{
                __CLR4_4_12p42p4kylvdz2t.R.inc(3510);list.add(comparator);
            }
            }__CLR4_4_12p42p4kylvdz2t.R.inc(3511);this.delegates = (Comparator<File>[]) list.toArray(EMPTY_COMPARATOR_ARRAY); //2
        }
    }}finally{__CLR4_4_12p42p4kylvdz2t.R.flushNeeded();}}

    /**
     * Compare the two files using delegate comparators.
     *
     * @param file1 The first file to compare
     * @param file2 The second file to compare
     * @return the first non-zero result returned from
     * the delegate comparators or zero.
     */
    @Override
    public int compare(final File file1, final File file2) {try{__CLR4_4_12p42p4kylvdz2t.R.inc(3512);
        __CLR4_4_12p42p4kylvdz2t.R.inc(3513);int result = 0;
        __CLR4_4_12p42p4kylvdz2t.R.inc(3514);for (final Comparator<File> delegate : delegates) {{
            __CLR4_4_12p42p4kylvdz2t.R.inc(3515);result = delegate.compare(file1, file2);
            __CLR4_4_12p42p4kylvdz2t.R.inc(3516);if ((((result != 0)&&(__CLR4_4_12p42p4kylvdz2t.R.iget(3517)!=0|true))||(__CLR4_4_12p42p4kylvdz2t.R.iget(3518)==0&false))) {{
                __CLR4_4_12p42p4kylvdz2t.R.inc(3519);break;
            }
        }}
        }__CLR4_4_12p42p4kylvdz2t.R.inc(3520);return result;
    }finally{__CLR4_4_12p42p4kylvdz2t.R.flushNeeded();}}

    /**
     * String representation of this file comparator.
     *
     * @return String representation of this file comparator
     */
    @Override
    public String toString() {try{__CLR4_4_12p42p4kylvdz2t.R.inc(3521);
        __CLR4_4_12p42p4kylvdz2t.R.inc(3522);final StringBuilder builder = new StringBuilder();
        __CLR4_4_12p42p4kylvdz2t.R.inc(3523);builder.append(super.toString());
        __CLR4_4_12p42p4kylvdz2t.R.inc(3524);builder.append('{');
        __CLR4_4_12p42p4kylvdz2t.R.inc(3525);for (int i = 0; (((i < delegates.length)&&(__CLR4_4_12p42p4kylvdz2t.R.iget(3526)!=0|true))||(__CLR4_4_12p42p4kylvdz2t.R.iget(3527)==0&false)); i++) {{
            __CLR4_4_12p42p4kylvdz2t.R.inc(3528);if ((((i > 0)&&(__CLR4_4_12p42p4kylvdz2t.R.iget(3529)!=0|true))||(__CLR4_4_12p42p4kylvdz2t.R.iget(3530)==0&false))) {{
                __CLR4_4_12p42p4kylvdz2t.R.inc(3531);builder.append(',');
            }
            }__CLR4_4_12p42p4kylvdz2t.R.inc(3532);builder.append(delegates[i]);
        }
        }__CLR4_4_12p42p4kylvdz2t.R.inc(3533);builder.append('}');
        __CLR4_4_12p42p4kylvdz2t.R.inc(3534);return builder.toString();
    }finally{__CLR4_4_12p42p4kylvdz2t.R.flushNeeded();}}
}
