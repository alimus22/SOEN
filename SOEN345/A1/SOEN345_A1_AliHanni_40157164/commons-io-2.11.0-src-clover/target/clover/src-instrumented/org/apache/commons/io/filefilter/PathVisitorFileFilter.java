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
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import org.apache.commons.io.file.NoopPathVisitor;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.file.PathVisitor;

/**
 * A file filter backed by a path visitor.
 *
 * @since 2.9.0
 */
public class PathVisitorFileFilter extends AbstractFileFilter {public static class __CLR4_4_13tq3tqkylvdzja{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final PathVisitor pathVisitor;

    /**
     * Constructs a new instance that will forward calls to the given visitor.
     *
     * @param pathVisitor visit me.
     */
    public PathVisitorFileFilter(final PathVisitor pathVisitor) {try{__CLR4_4_13tq3tqkylvdzja.R.inc(4958);
        __CLR4_4_13tq3tqkylvdzja.R.inc(4959);this.pathVisitor = (((pathVisitor == null )&&(__CLR4_4_13tq3tqkylvdzja.R.iget(4960)!=0|true))||(__CLR4_4_13tq3tqkylvdzja.R.iget(4961)==0&false))? NoopPathVisitor.INSTANCE : pathVisitor;
    }finally{__CLR4_4_13tq3tqkylvdzja.R.flushNeeded();}}

    @Override
    public boolean accept(final File file) {try{__CLR4_4_13tq3tqkylvdzja.R.inc(4962);
        __CLR4_4_13tq3tqkylvdzja.R.inc(4963);try {
            __CLR4_4_13tq3tqkylvdzja.R.inc(4964);final Path path = file.toPath();
            __CLR4_4_13tq3tqkylvdzja.R.inc(4965);return visitFile(path,
                (((file.exists() )&&(__CLR4_4_13tq3tqkylvdzja.R.iget(4966)!=0|true))||(__CLR4_4_13tq3tqkylvdzja.R.iget(4967)==0&false))? PathUtils.readBasicFileAttributes(path) : null) == FileVisitResult.CONTINUE;
        } catch (final IOException e) {
            __CLR4_4_13tq3tqkylvdzja.R.inc(4968);return handle(e) == FileVisitResult.CONTINUE;
        }
    }finally{__CLR4_4_13tq3tqkylvdzja.R.flushNeeded();}}

    @Override
    public boolean accept(final File dir, final String name) {try{__CLR4_4_13tq3tqkylvdzja.R.inc(4969);
        __CLR4_4_13tq3tqkylvdzja.R.inc(4970);try {
            __CLR4_4_13tq3tqkylvdzja.R.inc(4971);final Path path = dir.toPath().resolve(name);
            __CLR4_4_13tq3tqkylvdzja.R.inc(4972);return accept(path, PathUtils.readBasicFileAttributes(path)) == FileVisitResult.CONTINUE;
        } catch (final IOException e) {
            __CLR4_4_13tq3tqkylvdzja.R.inc(4973);return handle(e) == FileVisitResult.CONTINUE;
        }
    }finally{__CLR4_4_13tq3tqkylvdzja.R.flushNeeded();}}

    @Override
    public FileVisitResult accept(final Path path, final BasicFileAttributes attributes) {try{__CLR4_4_13tq3tqkylvdzja.R.inc(4974);
        __CLR4_4_13tq3tqkylvdzja.R.inc(4975);try {
            __CLR4_4_13tq3tqkylvdzja.R.inc(4976);return (((Files.isDirectory(path) )&&(__CLR4_4_13tq3tqkylvdzja.R.iget(4977)!=0|true))||(__CLR4_4_13tq3tqkylvdzja.R.iget(4978)==0&false))? pathVisitor.postVisitDirectory(path, null) : visitFile(path, attributes);
        } catch (final IOException e) {
            __CLR4_4_13tq3tqkylvdzja.R.inc(4979);return handle(e);
        }
    }finally{__CLR4_4_13tq3tqkylvdzja.R.flushNeeded();}}

    @Override
    public FileVisitResult visitFile(final Path path, final BasicFileAttributes attributes) throws IOException {try{__CLR4_4_13tq3tqkylvdzja.R.inc(4980);
        __CLR4_4_13tq3tqkylvdzja.R.inc(4981);return pathVisitor.visitFile(path, attributes);
    }finally{__CLR4_4_13tq3tqkylvdzja.R.flushNeeded();}}

}
