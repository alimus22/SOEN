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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** This is more an example than a test - deserialize our {@link MoreComplexObject}
 *  to verify which settings it requires, as the object uses a number of primitive
 *  and java.* member objects.
 */
public class MoreComplexObjectTest extends AbstractCloseableListTest {static class __CLR4_4_1l7kl7kkylve3ri{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,27504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private InputStream inputStream;
    private MoreComplexObject original;

    @BeforeEach
    public void setupMoreComplexObject() throws IOException {try{__CLR4_4_1l7kl7kkylve3ri.R.inc(27488);
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27489);original = new MoreComplexObject();
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27490);final ByteArrayOutputStream bos = closeAfterEachTest(new ByteArrayOutputStream());
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27491);final ObjectOutputStream oos = closeAfterEachTest(new ObjectOutputStream(bos));
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27492);oos.writeObject(original);
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27493);inputStream = closeAfterEachTest(new ByteArrayInputStream(bos.toByteArray()));
    }finally{__CLR4_4_1l7kl7kkylve3ri.R.flushNeeded();}}

    private void assertSerialization(final ObjectInputStream ois) throws ClassNotFoundException, IOException {try{__CLR4_4_1l7kl7kkylve3ri.R.inc(27494);
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27495);final MoreComplexObject copy = (MoreComplexObject) (ois.readObject());
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27496);assertEquals(original.toString(), copy.toString(), "Expecting same data after deserializing");
    }finally{__CLR4_4_1l7kl7kkylve3ri.R.flushNeeded();}}

    /** Trusting java.lang.* and the array variants of that means we have
     *  to define a number of accept classes explicitly. Quite safe but
     *  might become a bit verbose.
     */
    @Test
    public void trustJavaLang() throws IOException, ClassNotFoundException {__CLR4_4_1l7kl7kkylve3ri.R.globalSliceStart(getClass().getName(),27497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xodrm9l7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7kl7kkylve3ri.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7kl7kkylve3ri.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.MoreComplexObjectTest.trustJavaLang",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xodrm9l7t() throws IOException, ClassNotFoundException{try{__CLR4_4_1l7kl7kkylve3ri.R.inc(27497);
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27498);assertSerialization(closeAfterEachTest(
                new ValidatingObjectInputStream(inputStream)
                .accept(MoreComplexObject.class, ArrayList.class, Random.class)
                .accept("java.lang.*","[Ljava.lang.*")
        ));
    }finally{__CLR4_4_1l7kl7kkylve3ri.R.flushNeeded();}}

    /** Trusting java.* is probably reasonable and avoids having to be too
     *  detailed in the accepts.
     */
    @Test
    public void trustJavaIncludingArrays() throws IOException, ClassNotFoundException {__CLR4_4_1l7kl7kkylve3ri.R.globalSliceStart(getClass().getName(),27499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6p8pgl7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7kl7kkylve3ri.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7kl7kkylve3ri.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.MoreComplexObjectTest.trustJavaIncludingArrays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6p8pgl7v() throws IOException, ClassNotFoundException{try{__CLR4_4_1l7kl7kkylve3ri.R.inc(27499);
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27500);assertSerialization(closeAfterEachTest(
                new ValidatingObjectInputStream(inputStream)
                .accept(MoreComplexObject.class)
                .accept("java.*","[Ljava.*")
        ));
    }finally{__CLR4_4_1l7kl7kkylve3ri.R.flushNeeded();}}

    /** Here we accept everything but reject specific classes, using a pure
     *  blacklist mode.
     *
     *  That's not as safe as it's hard to get an exhaustive blacklist, but
     *  might be ok in controlled environments.
     */
    @Test
    public void useBlacklist() throws IOException, ClassNotFoundException {__CLR4_4_1l7kl7kkylve3ri.R.globalSliceStart(getClass().getName(),27501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2bdibl7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l7kl7kkylve3ri.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l7kl7kkylve3ri.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.MoreComplexObjectTest.useBlacklist",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2bdibl7x() throws IOException, ClassNotFoundException{try{__CLR4_4_1l7kl7kkylve3ri.R.inc(27501);
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27502);final String [] blacklist = {
                "org.apache.commons.collections.functors.InvokerTransformer",
                "org.codehaus.groovy.runtime.ConvertedClosure",
                "org.codehaus.groovy.runtime.MethodClosure",
                "org.springframework.beans.factory.ObjectFactory"
        };
        __CLR4_4_1l7kl7kkylve3ri.R.inc(27503);assertSerialization(closeAfterEachTest(
                new ValidatingObjectInputStream(inputStream)
                .accept("*")
                .reject(blacklist)
        ));
    }finally{__CLR4_4_1l7kl7kkylve3ri.R.flushNeeded();}}
}