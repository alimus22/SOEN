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
 * A {@link java.io.FileFilter} providing conditional AND logic across a list of
 * file filters. This filter returns {@code true} if all filters in the
 * list return {@code true}. Otherwise, it returns {@code false}.
 * Checking of the file filter list stops when the first filter returns
 * {@code false}.
 *
 * @since 1.0
 * @see FileFilterUtils#and(IOFileFilter...)
 */
public class AndFileFilter
        extends AbstractFileFilter
        implements ConditionalFileFilter, Serializable {public static class __CLR4_4_13eh3ehkylvdzbt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4485,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 7215974688563965257L;

    /** The list of file filters. */
    private final List<IOFileFilter> fileFilters;

    /**
     * Constructs a new empty instance.
     *
     * @since 1.1
     */
    public AndFileFilter() {
        this(0);__CLR4_4_13eh3ehkylvdzbt.R.inc(4410);try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4409);
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * Constructs a new instance with the given initial list.
     *
     * @param initialList the initial list.
     */
    private AndFileFilter(final ArrayList<IOFileFilter> initialList) {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4411);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4412);this.fileFilters = Objects.requireNonNull(initialList, "initialList");
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * Constructs a new instance with the given initial capacity.
     *
     * @param initialCapacity the initial capacity.
     */
    private AndFileFilter(final int initialCapacity) {
        this(new ArrayList<>(initialCapacity));__CLR4_4_13eh3ehkylvdzbt.R.inc(4414);try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4413);
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * Constructs a new file filter that ANDs the result of other filters.
     *
     * @param filter1  the first filter, must second be null
     * @param filter2  the first filter, must not be null
     * @throws IllegalArgumentException if either filter is null
     */
    public AndFileFilter(final IOFileFilter filter1, final IOFileFilter filter2) {
        this(2);__CLR4_4_13eh3ehkylvdzbt.R.inc(4416);try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4415);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4417);addFileFilter(filter1);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4418);addFileFilter(filter2);
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * Constructs a new instance for the give filters.
     * @param fileFilters filters to OR.
     *
     * @since 2.9.0
     */
    public AndFileFilter(final IOFileFilter... fileFilters) {
        this(Objects.requireNonNull(fileFilters, "fileFilters").length);__CLR4_4_13eh3ehkylvdzbt.R.inc(4420);try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4419);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4421);addFileFilter(fileFilters);
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * Constructs a new instance of {@code AndFileFilter}
     * with the specified list of filters.
     *
     * @param fileFilters  a List of IOFileFilter instances, copied.
     * @since 1.1
     */
    public AndFileFilter(final List<IOFileFilter> fileFilters) {
        this(new ArrayList<>(Objects.requireNonNull(fileFilters, "fileFilters")));__CLR4_4_13eh3ehkylvdzbt.R.inc(4423);try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4422);
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4424);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4425);if ((((isEmpty())&&(__CLR4_4_13eh3ehkylvdzbt.R.iget(4426)!=0|true))||(__CLR4_4_13eh3ehkylvdzbt.R.iget(4427)==0&false))) {{
            __CLR4_4_13eh3ehkylvdzbt.R.inc(4428);return false;
        }
        }__CLR4_4_13eh3ehkylvdzbt.R.inc(4429);for (final IOFileFilter fileFilter : fileFilters) {{
            __CLR4_4_13eh3ehkylvdzbt.R.inc(4430);if ((((!fileFilter.accept(file))&&(__CLR4_4_13eh3ehkylvdzbt.R.iget(4431)!=0|true))||(__CLR4_4_13eh3ehkylvdzbt.R.iget(4432)==0&false))) {{
                __CLR4_4_13eh3ehkylvdzbt.R.inc(4433);return false;
            }
        }}
        }__CLR4_4_13eh3ehkylvdzbt.R.inc(4434);return true;
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean accept(final File file, final String name) {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4435);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4436);if ((((isEmpty())&&(__CLR4_4_13eh3ehkylvdzbt.R.iget(4437)!=0|true))||(__CLR4_4_13eh3ehkylvdzbt.R.iget(4438)==0&false))) {{
            __CLR4_4_13eh3ehkylvdzbt.R.inc(4439);return false;
        }
        }__CLR4_4_13eh3ehkylvdzbt.R.inc(4440);for (final IOFileFilter fileFilter : fileFilters) {{
            __CLR4_4_13eh3ehkylvdzbt.R.inc(4441);if ((((!fileFilter.accept(file, name))&&(__CLR4_4_13eh3ehkylvdzbt.R.iget(4442)!=0|true))||(__CLR4_4_13eh3ehkylvdzbt.R.iget(4443)==0&false))) {{
                __CLR4_4_13eh3ehkylvdzbt.R.inc(4444);return false;
            }
        }}
        }__CLR4_4_13eh3ehkylvdzbt.R.inc(4445);return true;
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 2.9.0
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4446);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4447);if ((((isEmpty())&&(__CLR4_4_13eh3ehkylvdzbt.R.iget(4448)!=0|true))||(__CLR4_4_13eh3ehkylvdzbt.R.iget(4449)==0&false))) {{
            __CLR4_4_13eh3ehkylvdzbt.R.inc(4450);return FileVisitResult.TERMINATE;
        }
        }__CLR4_4_13eh3ehkylvdzbt.R.inc(4451);for (final IOFileFilter fileFilter : fileFilters) {{
            __CLR4_4_13eh3ehkylvdzbt.R.inc(4452);if ((((fileFilter.accept(file, attributes) != FileVisitResult.CONTINUE)&&(__CLR4_4_13eh3ehkylvdzbt.R.iget(4453)!=0|true))||(__CLR4_4_13eh3ehkylvdzbt.R.iget(4454)==0&false))) {{
                __CLR4_4_13eh3ehkylvdzbt.R.inc(4455);return FileVisitResult.TERMINATE;
            }
        }}
        }__CLR4_4_13eh3ehkylvdzbt.R.inc(4456);return FileVisitResult.CONTINUE;
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void addFileFilter(final IOFileFilter fileFilter) {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4457);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4458);this.fileFilters.add(Objects.requireNonNull(fileFilter, "fileFilter"));
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * Adds the given file filters.
     *
     * @param fileFilters the filters to add.
     * @since 2.9.0
     */
    public void addFileFilter(final IOFileFilter... fileFilters) {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4459);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4460);for (final IOFileFilter fileFilter : Objects.requireNonNull(fileFilters, "fileFilters")) {{
            __CLR4_4_13eh3ehkylvdzbt.R.inc(4461);addFileFilter(fileFilter);
        }
    }}finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public List<IOFileFilter> getFileFilters() {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4462);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4463);return Collections.unmodifiableList(this.fileFilters);
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    private boolean isEmpty() {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4464);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4465);return this.fileFilters.isEmpty();
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean removeFileFilter(final IOFileFilter ioFileFilter) {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4466);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4467);return this.fileFilters.remove(ioFileFilter);
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFileFilters(final List<IOFileFilter> fileFilters) {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4468);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4469);this.fileFilters.clear();
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4470);this.fileFilters.addAll(fileFilters);
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

    /**
     * Provide a String representation of this file filter.
     *
     * @return a String representation
     */
    @Override
    public String toString() {try{__CLR4_4_13eh3ehkylvdzbt.R.inc(4471);
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4472);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4473);buffer.append(super.toString());
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4474);buffer.append("(");
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4475);for (int i = 0; (((i < fileFilters.size())&&(__CLR4_4_13eh3ehkylvdzbt.R.iget(4476)!=0|true))||(__CLR4_4_13eh3ehkylvdzbt.R.iget(4477)==0&false)); i++) {{
            __CLR4_4_13eh3ehkylvdzbt.R.inc(4478);if ((((i > 0)&&(__CLR4_4_13eh3ehkylvdzbt.R.iget(4479)!=0|true))||(__CLR4_4_13eh3ehkylvdzbt.R.iget(4480)==0&false))) {{
                __CLR4_4_13eh3ehkylvdzbt.R.inc(4481);buffer.append(",");
            }
            }__CLR4_4_13eh3ehkylvdzbt.R.inc(4482);buffer.append(fileFilters.get(i));
        }
        }__CLR4_4_13eh3ehkylvdzbt.R.inc(4483);buffer.append(")");
        __CLR4_4_13eh3ehkylvdzbt.R.inc(4484);return buffer.toString();
    }finally{__CLR4_4_13eh3ehkylvdzbt.R.flushNeeded();}}

}
