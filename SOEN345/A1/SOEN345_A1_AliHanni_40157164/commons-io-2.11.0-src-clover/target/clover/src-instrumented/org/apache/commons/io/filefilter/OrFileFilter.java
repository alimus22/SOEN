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
package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A {@link java.io.FileFilter} providing conditional OR logic across a list of file filters. This filter returns
 * {@code true} if any filters in the list return {@code true}. Otherwise, it returns {@code false}. Checking of the
 * file filter list stops when the first filter returns {@code true}.
 *
 * @since 1.0
 * @see FileFilterUtils#or(IOFileFilter...)
 */
public class OrFileFilter extends AbstractFileFilter implements ConditionalFileFilter, Serializable {public static class __CLR4_4_13rr3rrkylvdzil{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4952,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 5767770777065432721L;

    /** The list of file filters. */
    private final List<IOFileFilter> fileFilters;

    /**
     * Constructs a new instance of {@code OrFileFilter}.
     *
     * @since 1.1
     */
    public OrFileFilter() {
        this(0);__CLR4_4_13rr3rrkylvdzil.R.inc(4888);try{__CLR4_4_13rr3rrkylvdzil.R.inc(4887);
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * Constructs a new instance with the given initial list.
     *
     * @param initialList the initial list.
     */
    private OrFileFilter(final ArrayList<IOFileFilter> initialList) {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4889);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4890);this.fileFilters = Objects.requireNonNull(initialList, "initialList");
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * Constructs a new instance with the given initial capacity.
     *
     * @param initialCapacity the initial capacity.
     */
    private OrFileFilter(final int initialCapacity) {
        this(new ArrayList<>(initialCapacity));__CLR4_4_13rr3rrkylvdzil.R.inc(4892);try{__CLR4_4_13rr3rrkylvdzil.R.inc(4891);
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * Constructs a new instance for the give filters.
     * @param fileFilters filters to OR.
     *
     * @since 2.9.0
     */
    public OrFileFilter(final IOFileFilter... fileFilters) {
        this(Objects.requireNonNull(fileFilters, "fileFilters").length);__CLR4_4_13rr3rrkylvdzil.R.inc(4894);try{__CLR4_4_13rr3rrkylvdzil.R.inc(4893);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4895);addFileFilter(fileFilters);
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * Constructs a new file filter that ORs the result of other filters.
     *
     * @param filter1 the first filter, must not be null
     * @param filter2 the second filter, must not be null
     * @throws IllegalArgumentException if either filter is null
     */
    public OrFileFilter(final IOFileFilter filter1, final IOFileFilter filter2) {
        this(2);__CLR4_4_13rr3rrkylvdzil.R.inc(4897);try{__CLR4_4_13rr3rrkylvdzil.R.inc(4896);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4898);addFileFilter(filter1);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4899);addFileFilter(filter2);
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * Constructs a new instance of {@code OrFileFilter} with the specified filters.
     *
     * @param fileFilters the file filters for this filter, copied.
     * @since 1.1
     */
    public OrFileFilter(final List<IOFileFilter> fileFilters) {
        this(new ArrayList<>(Objects.requireNonNull(fileFilters, "fileFilters")));__CLR4_4_13rr3rrkylvdzil.R.inc(4901);try{__CLR4_4_13rr3rrkylvdzil.R.inc(4900);
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4902);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4903);for (final IOFileFilter fileFilter : fileFilters) {{
            __CLR4_4_13rr3rrkylvdzil.R.inc(4904);if ((((fileFilter.accept(file))&&(__CLR4_4_13rr3rrkylvdzil.R.iget(4905)!=0|true))||(__CLR4_4_13rr3rrkylvdzil.R.iget(4906)==0&false))) {{
                __CLR4_4_13rr3rrkylvdzil.R.inc(4907);return true;
            }
        }}
        }__CLR4_4_13rr3rrkylvdzil.R.inc(4908);return false;
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean accept(final File file, final String name) {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4909);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4910);for (final IOFileFilter fileFilter : fileFilters) {{
            __CLR4_4_13rr3rrkylvdzil.R.inc(4911);if ((((fileFilter.accept(file, name))&&(__CLR4_4_13rr3rrkylvdzil.R.iget(4912)!=0|true))||(__CLR4_4_13rr3rrkylvdzil.R.iget(4913)==0&false))) {{
                __CLR4_4_13rr3rrkylvdzil.R.inc(4914);return true;
            }
        }}
        }__CLR4_4_13rr3rrkylvdzil.R.inc(4915);return false;
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4916);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4917);for (final IOFileFilter fileFilter : fileFilters) {{
            __CLR4_4_13rr3rrkylvdzil.R.inc(4918);if ((((fileFilter.accept(file, attributes) == FileVisitResult.CONTINUE)&&(__CLR4_4_13rr3rrkylvdzil.R.iget(4919)!=0|true))||(__CLR4_4_13rr3rrkylvdzil.R.iget(4920)==0&false))) {{
                __CLR4_4_13rr3rrkylvdzil.R.inc(4921);return FileVisitResult.CONTINUE;
            }
        }}
        }__CLR4_4_13rr3rrkylvdzil.R.inc(4922);return FileVisitResult.TERMINATE;
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void addFileFilter(final IOFileFilter fileFilter) {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4923);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4924);this.fileFilters.add(Objects.requireNonNull(fileFilter, "fileFilter"));
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * Adds the given file filters.
     *
     * @param fileFilters the filters to add.
     * @since 2.9.0
     */
    public void addFileFilter(final IOFileFilter... fileFilters) {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4925);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4926);for (final IOFileFilter fileFilter : Objects.requireNonNull(fileFilters, "fileFilters")) {{
            __CLR4_4_13rr3rrkylvdzil.R.inc(4927);addFileFilter(fileFilter);
        }
    }}finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public List<IOFileFilter> getFileFilters() {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4928);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4929);return Collections.unmodifiableList(this.fileFilters);
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean removeFileFilter(final IOFileFilter fileFilter) {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4930);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4931);return this.fileFilters.remove(fileFilter);
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFileFilters(final List<IOFileFilter> fileFilters) {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4932);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4933);this.fileFilters.clear();
        __CLR4_4_13rr3rrkylvdzil.R.inc(4934);this.fileFilters.addAll(Objects.requireNonNull(fileFilters, "fileFilters"));
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

    /**
     * Provide a String representation of this file filter.
     *
     * @return a String representation
     */
    @Override
    public String toString() {try{__CLR4_4_13rr3rrkylvdzil.R.inc(4935);
        __CLR4_4_13rr3rrkylvdzil.R.inc(4936);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_13rr3rrkylvdzil.R.inc(4937);buffer.append(super.toString());
        __CLR4_4_13rr3rrkylvdzil.R.inc(4938);buffer.append("(");
        __CLR4_4_13rr3rrkylvdzil.R.inc(4939);if ((((fileFilters != null)&&(__CLR4_4_13rr3rrkylvdzil.R.iget(4940)!=0|true))||(__CLR4_4_13rr3rrkylvdzil.R.iget(4941)==0&false))) {{
            __CLR4_4_13rr3rrkylvdzil.R.inc(4942);for (int i = 0; (((i < fileFilters.size())&&(__CLR4_4_13rr3rrkylvdzil.R.iget(4943)!=0|true))||(__CLR4_4_13rr3rrkylvdzil.R.iget(4944)==0&false)); i++) {{
                __CLR4_4_13rr3rrkylvdzil.R.inc(4945);if ((((i > 0)&&(__CLR4_4_13rr3rrkylvdzil.R.iget(4946)!=0|true))||(__CLR4_4_13rr3rrkylvdzil.R.iget(4947)==0&false))) {{
                    __CLR4_4_13rr3rrkylvdzil.R.inc(4948);buffer.append(",");
                }
                }__CLR4_4_13rr3rrkylvdzil.R.inc(4949);buffer.append(fileFilters.get(i));
            }
        }}
        }__CLR4_4_13rr3rrkylvdzil.R.inc(4950);buffer.append(")");
        __CLR4_4_13rr3rrkylvdzil.R.inc(4951);return buffer.toString();
    }finally{__CLR4_4_13rr3rrkylvdzil.R.flushNeeded();}}

}
