/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.io.serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * An {@code ObjectInputStream} that's restricted to deserialize
 * a limited set of classes.
 *
 * <p>
 * Various accept/reject methods allow for specifying which classes
 * can be deserialized.
 * </p>
 *
 * <p>
 * Design inspired by <a
 * href="http://www.ibm.com/developerworks/library/se-lookahead/">IBM
 * DeveloperWorks Article</a>.
 * </p>
 */
public class ValidatingObjectInputStream extends ObjectInputStream {public static class __CLR4_4_17je7jekylve0ii{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9822,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final List<ClassNameMatcher> acceptMatchers = new ArrayList<>();
    private final List<ClassNameMatcher> rejectMatchers = new ArrayList<>();

    /**
     * Constructs an object to deserialize the specified input stream.
     * At least one accept method needs to be called to specify which
     * classes can be deserialized, as by default no classes are
     * accepted.
     *
     * @param input an input stream
     * @throws IOException if an I/O error occurs while reading stream header
     */
    public ValidatingObjectInputStream(final InputStream input) throws IOException {
        super(input);__CLR4_4_17je7jekylve0ii.R.inc(9771);try{__CLR4_4_17je7jekylve0ii.R.inc(9770);
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /** Check that the classname conforms to requirements.
     * @param name The class name
     * @throws InvalidClassException when a non-accepted class is encountered
     */
    private void validateClassName(final String name) throws InvalidClassException {try{__CLR4_4_17je7jekylve0ii.R.inc(9772);
        // Reject has precedence over accept
        __CLR4_4_17je7jekylve0ii.R.inc(9773);for (final ClassNameMatcher m : rejectMatchers) {{
            __CLR4_4_17je7jekylve0ii.R.inc(9774);if ((((m.matches(name))&&(__CLR4_4_17je7jekylve0ii.R.iget(9775)!=0|true))||(__CLR4_4_17je7jekylve0ii.R.iget(9776)==0&false))) {{
                __CLR4_4_17je7jekylve0ii.R.inc(9777);invalidClassNameFound(name);
            }
        }}

        }__CLR4_4_17je7jekylve0ii.R.inc(9778);boolean ok = false;
        __CLR4_4_17je7jekylve0ii.R.inc(9779);for (final ClassNameMatcher m : acceptMatchers) {{
            __CLR4_4_17je7jekylve0ii.R.inc(9780);if ((((m.matches(name))&&(__CLR4_4_17je7jekylve0ii.R.iget(9781)!=0|true))||(__CLR4_4_17je7jekylve0ii.R.iget(9782)==0&false))) {{
                __CLR4_4_17je7jekylve0ii.R.inc(9783);ok = true;
                __CLR4_4_17je7jekylve0ii.R.inc(9784);break;
            }
        }}
        }__CLR4_4_17je7jekylve0ii.R.inc(9785);if ((((!ok)&&(__CLR4_4_17je7jekylve0ii.R.iget(9786)!=0|true))||(__CLR4_4_17je7jekylve0ii.R.iget(9787)==0&false))) {{
            __CLR4_4_17je7jekylve0ii.R.inc(9788);invalidClassNameFound(name);
        }
    }}finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /**
     * Called to throw {@code InvalidClassException} if an invalid
     * class name is found during deserialization. Can be overridden, for example
     * to log those class names.
     *
     * @param className name of the invalid class
     * @throws InvalidClassException if the specified class is not allowed
     */
    protected void invalidClassNameFound(final String className) throws InvalidClassException {try{__CLR4_4_17je7jekylve0ii.R.inc(9789);
        __CLR4_4_17je7jekylve0ii.R.inc(9790);throw new InvalidClassException("Class name not accepted: " + className);
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    @Override
    protected Class<?> resolveClass(final ObjectStreamClass osc) throws IOException, ClassNotFoundException {try{__CLR4_4_17je7jekylve0ii.R.inc(9791);
        __CLR4_4_17je7jekylve0ii.R.inc(9792);validateClassName(osc.getName());
        __CLR4_4_17je7jekylve0ii.R.inc(9793);return super.resolveClass(osc);
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /**
     * Accept the specified classes for deserialization, unless they
     * are otherwise rejected.
     *
     * @param classes Classes to accept
     * @return this object
     */
    public ValidatingObjectInputStream accept(final Class<?>... classes) {try{__CLR4_4_17je7jekylve0ii.R.inc(9794);
        __CLR4_4_17je7jekylve0ii.R.inc(9795);for (final Class<?> c : classes) {{
            __CLR4_4_17je7jekylve0ii.R.inc(9796);acceptMatchers.add(new FullClassNameMatcher(c.getName()));
        }
        }__CLR4_4_17je7jekylve0ii.R.inc(9797);return this;
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /**
     * Reject the specified classes for deserialization, even if they
     * are otherwise accepted.
     *
     * @param classes Classes to reject
     * @return this object
     */
    public ValidatingObjectInputStream reject(final Class<?>... classes) {try{__CLR4_4_17je7jekylve0ii.R.inc(9798);
        __CLR4_4_17je7jekylve0ii.R.inc(9799);for (final Class<?> c : classes) {{
            __CLR4_4_17je7jekylve0ii.R.inc(9800);rejectMatchers.add(new FullClassNameMatcher(c.getName()));
        }
        }__CLR4_4_17je7jekylve0ii.R.inc(9801);return this;
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /**
     * Accept the wildcard specified classes for deserialization,
     * unless they are otherwise rejected.
     *
     * @param patterns Wildcard file name patterns as defined by
     *                  {@link org.apache.commons.io.FilenameUtils#wildcardMatch(String, String) FilenameUtils.wildcardMatch}
     * @return this object
     */
    public ValidatingObjectInputStream accept(final String... patterns) {try{__CLR4_4_17je7jekylve0ii.R.inc(9802);
        __CLR4_4_17je7jekylve0ii.R.inc(9803);for (final String pattern : patterns) {{
            __CLR4_4_17je7jekylve0ii.R.inc(9804);acceptMatchers.add(new WildcardClassNameMatcher(pattern));
        }
        }__CLR4_4_17je7jekylve0ii.R.inc(9805);return this;
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /**
     * Reject the wildcard specified classes for deserialization,
     * even if they are otherwise accepted.
     *
     * @param patterns Wildcard file name patterns as defined by
     *                  {@link org.apache.commons.io.FilenameUtils#wildcardMatch(String, String) FilenameUtils.wildcardMatch}
     * @return this object
     */
    public ValidatingObjectInputStream reject(final String... patterns) {try{__CLR4_4_17je7jekylve0ii.R.inc(9806);
        __CLR4_4_17je7jekylve0ii.R.inc(9807);for (final String pattern : patterns) {{
            __CLR4_4_17je7jekylve0ii.R.inc(9808);rejectMatchers.add(new WildcardClassNameMatcher(pattern));
        }
        }__CLR4_4_17je7jekylve0ii.R.inc(9809);return this;
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /**
     * Accept class names that match the supplied pattern for
     * deserialization, unless they are otherwise rejected.
     *
     * @param pattern standard Java regexp
     * @return this object
     */
    public ValidatingObjectInputStream accept(final Pattern pattern) {try{__CLR4_4_17je7jekylve0ii.R.inc(9810);
        __CLR4_4_17je7jekylve0ii.R.inc(9811);acceptMatchers.add(new RegexpClassNameMatcher(pattern));
        __CLR4_4_17je7jekylve0ii.R.inc(9812);return this;
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /**
     * Reject class names that match the supplied pattern for
     * deserialization, even if they are otherwise accepted.
     *
     * @param pattern standard Java regexp
     * @return this object
     */
    public ValidatingObjectInputStream reject(final Pattern pattern) {try{__CLR4_4_17je7jekylve0ii.R.inc(9813);
        __CLR4_4_17je7jekylve0ii.R.inc(9814);rejectMatchers.add(new RegexpClassNameMatcher(pattern));
        __CLR4_4_17je7jekylve0ii.R.inc(9815);return this;
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /**
     * Accept class names where the supplied ClassNameMatcher matches for
     * deserialization, unless they are otherwise rejected.
     *
     * @param m the matcher to use
     * @return this object
     */
    public ValidatingObjectInputStream accept(final ClassNameMatcher m) {try{__CLR4_4_17je7jekylve0ii.R.inc(9816);
        __CLR4_4_17je7jekylve0ii.R.inc(9817);acceptMatchers.add(m);
        __CLR4_4_17je7jekylve0ii.R.inc(9818);return this;
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}

    /**
     * Reject class names where the supplied ClassNameMatcher matches for
     * deserialization, even if they are otherwise accepted.
     *
     * @param m the matcher to use
     * @return this object
     */
    public ValidatingObjectInputStream reject(final ClassNameMatcher m) {try{__CLR4_4_17je7jekylve0ii.R.inc(9819);
        __CLR4_4_17je7jekylve0ii.R.inc(9820);rejectMatchers.add(m);
        __CLR4_4_17je7jekylve0ii.R.inc(9821);return this;
    }finally{__CLR4_4_17je7jekylve0ii.R.flushNeeded();}}
}