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
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

/**
 * This class turns a Java FileFilter or FilenameFilter into an IO FileFilter.
 *
 * @since 1.0
 * @see FileFilterUtils#asFileFilter(FileFilter)
 * @see FileFilterUtils#asFileFilter(FilenameFilter)
 */
public class DelegateFileFilter extends AbstractFileFilter implements Serializable {public static class __CLR4_4_13h03h0kylvdzcu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4531,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -8723373124984771318L;
    /** The File filter */
    private final FileFilter fileFilter;
    /** The Filename filter */
    private final FilenameFilter filenameFilter;

    /**
     * Constructs a delegate file filter around an existing FileFilter.
     *
     * @param filter  the filter to decorate
     */
    public DelegateFileFilter(final FileFilter filter) {try{__CLR4_4_13h03h0kylvdzcu.R.inc(4500);
        __CLR4_4_13h03h0kylvdzcu.R.inc(4501);if ((((filter == null)&&(__CLR4_4_13h03h0kylvdzcu.R.iget(4502)!=0|true))||(__CLR4_4_13h03h0kylvdzcu.R.iget(4503)==0&false))) {{
            __CLR4_4_13h03h0kylvdzcu.R.inc(4504);throw new IllegalArgumentException("The FileFilter must not be null");
        }
        }__CLR4_4_13h03h0kylvdzcu.R.inc(4505);this.fileFilter = filter;
        __CLR4_4_13h03h0kylvdzcu.R.inc(4506);this.filenameFilter = null;
    }finally{__CLR4_4_13h03h0kylvdzcu.R.flushNeeded();}}

    /**
     * Constructs a delegate file filter around an existing FilenameFilter.
     *
     * @param filter  the filter to decorate
     */
    public DelegateFileFilter(final FilenameFilter filter) {try{__CLR4_4_13h03h0kylvdzcu.R.inc(4507);
        __CLR4_4_13h03h0kylvdzcu.R.inc(4508);if ((((filter == null)&&(__CLR4_4_13h03h0kylvdzcu.R.iget(4509)!=0|true))||(__CLR4_4_13h03h0kylvdzcu.R.iget(4510)==0&false))) {{
            __CLR4_4_13h03h0kylvdzcu.R.inc(4511);throw new IllegalArgumentException("The FilenameFilter must not be null");
        }
        }__CLR4_4_13h03h0kylvdzcu.R.inc(4512);this.filenameFilter = filter;
        __CLR4_4_13h03h0kylvdzcu.R.inc(4513);this.fileFilter = null;
    }finally{__CLR4_4_13h03h0kylvdzcu.R.flushNeeded();}}

    /**
     * Checks the filter.
     *
     * @param file  the file to check
     * @return true if the filter matches
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13h03h0kylvdzcu.R.inc(4514);
        __CLR4_4_13h03h0kylvdzcu.R.inc(4515);if ((((fileFilter != null)&&(__CLR4_4_13h03h0kylvdzcu.R.iget(4516)!=0|true))||(__CLR4_4_13h03h0kylvdzcu.R.iget(4517)==0&false))) {{
            __CLR4_4_13h03h0kylvdzcu.R.inc(4518);return fileFilter.accept(file);
        }
        }__CLR4_4_13h03h0kylvdzcu.R.inc(4519);return super.accept(file);
    }finally{__CLR4_4_13h03h0kylvdzcu.R.flushNeeded();}}

    /**
     * Checks the filter.
     *
     * @param dir  the directory
     * @param name  the file name in the directory
     * @return true if the filter matches
     */
    @Override
    public boolean accept(final File dir, final String name) {try{__CLR4_4_13h03h0kylvdzcu.R.inc(4520);
        __CLR4_4_13h03h0kylvdzcu.R.inc(4521);if ((((filenameFilter != null)&&(__CLR4_4_13h03h0kylvdzcu.R.iget(4522)!=0|true))||(__CLR4_4_13h03h0kylvdzcu.R.iget(4523)==0&false))) {{
            __CLR4_4_13h03h0kylvdzcu.R.inc(4524);return filenameFilter.accept(dir, name);
        }
        }__CLR4_4_13h03h0kylvdzcu.R.inc(4525);return super.accept(dir, name);
    }finally{__CLR4_4_13h03h0kylvdzcu.R.flushNeeded();}}

    /**
     * Provide a String representation of this file filter.
     *
     * @return a String representation
     */
    @Override
    public String toString() {try{__CLR4_4_13h03h0kylvdzcu.R.inc(4526);
        __CLR4_4_13h03h0kylvdzcu.R.inc(4527);final String delegate = (((fileFilter != null )&&(__CLR4_4_13h03h0kylvdzcu.R.iget(4528)!=0|true))||(__CLR4_4_13h03h0kylvdzcu.R.iget(4529)==0&false))? fileFilter.toString() : filenameFilter.toString();
        __CLR4_4_13h03h0kylvdzcu.R.inc(4530);return super.toString() + "(" + delegate + ")";
    }finally{__CLR4_4_13h03h0kylvdzcu.R.flushNeeded();}}

}
