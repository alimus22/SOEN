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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.UUID;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidatingObjectInputStreamTest extends AbstractCloseableListTest {static class __CLR4_4_1l8hl8hkylve3sa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,27574,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private MockSerializedClass testObject;
    private InputStream testStream;

    private static final ClassNameMatcher ALWAYS_TRUE = className -> true;

    @BeforeEach
    public void setupMockSerializedClass() throws IOException {try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27521);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27522);testObject = new MockSerializedClass(UUID.randomUUID().toString());
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27523);final ByteArrayOutputStream bos = closeAfterEachTest(new ByteArrayOutputStream());
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27524);final ObjectOutputStream oos = closeAfterEachTest(new ObjectOutputStream(bos));
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27525);oos.writeObject(testObject);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27526);testStream = closeAfterEachTest(new ByteArrayInputStream(bos.toByteArray()));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    private void assertSerialization(final ObjectInputStream ois) throws ClassNotFoundException, IOException {try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27527);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27528);final MockSerializedClass result = (MockSerializedClass) (ois.readObject());
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27529);assertEquals(testObject, result);
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void noAccept() {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdr39sl8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.noAccept",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdr39sl8q(){try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27530);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27531);assertThrows(InvalidClassException.class, () -> assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void exceptionIncludesClassName() throws Exception {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfykswl8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.exceptionIncludesClassName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfykswl8s() throws Exception{try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27532);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27533);try {
            __CLR4_4_1l8hl8hkylve3sa.R.inc(27534);assertSerialization(
                    closeAfterEachTest(new ValidatingObjectInputStream(testStream)));
            __CLR4_4_1l8hl8hkylve3sa.R.inc(27535);fail("Expected an InvalidClassException");
        } catch(final InvalidClassException ice) {
            __CLR4_4_1l8hl8hkylve3sa.R.inc(27536);final String name = MockSerializedClass.class.getName();
            __CLR4_4_1l8hl8hkylve3sa.R.inc(27537);assertTrue(ice.getMessage().contains(name), "Expecting message to contain " + name);
        }
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void acceptCustomMatcher() throws Exception {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lzszkl8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.acceptCustomMatcher",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lzszkl8y() throws Exception{try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27538);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27539);assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(ALWAYS_TRUE)
        );
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void rejectCustomMatcher() {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufbzftl90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.rejectCustomMatcher",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufbzftl90(){try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27540);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27541);assertThrows(InvalidClassException.class,
                () -> assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(MockSerializedClass.class)
                .reject(ALWAYS_TRUE)
        ));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void acceptPattern() throws Exception {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbb9shl92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.acceptPattern",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbb9shl92() throws Exception{try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27542);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27543);assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(Pattern.compile(".*MockSerializedClass.*"))
        );
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void rejectPattern() {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uhzaqgl94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.rejectPattern",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uhzaqgl94(){try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27544);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27545);assertThrows(InvalidClassException.class,
                () -> assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(MockSerializedClass.class)
                .reject(Pattern.compile("org.*"))
        ));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void acceptWildcard() throws Exception {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eeixo7l96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.acceptWildcard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eeixo7l96() throws Exception{try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27546);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27547);assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept("org.apache.commons.io.*")
        );
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void rejectWildcard() {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15rkawwl98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.rejectWildcard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15rkawwl98(){try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27548);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27549);assertThrows(InvalidClassException.class,
                () -> assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(MockSerializedClass.class)
                .reject("org.*")
        ));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void ourTestClassNotAccepted() {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qxhrx5l9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.ourTestClassNotAccepted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qxhrx5l9a(){try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27550);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27551);assertThrows(InvalidClassException.class,
                () -> assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(Integer.class)
        ));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void ourTestClassOnlyAccepted() throws Exception {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnsok4l9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.ourTestClassOnlyAccepted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnsok4l9c() throws Exception{try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27552);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27553);assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(MockSerializedClass.class)
        );
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void ourTestClassAcceptedFirst() throws Exception {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ntxmeul9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.ourTestClassAcceptedFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ntxmeul9e() throws Exception{try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27554);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27555);assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(MockSerializedClass.class, Integer.class)
        );
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void ourTestClassAcceptedSecond() throws Exception {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7g4h0l9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.ourTestClassAcceptedSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7g4h0l9g() throws Exception{try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27556);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27557);assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(Integer.class, MockSerializedClass.class)
        );
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void ourTestClassAcceptedFirstWildcard() throws Exception {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssg13kl9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.ourTestClassAcceptedFirstWildcard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssg13kl9i() throws Exception{try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27558);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27559);assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept("*MockSerializedClass","*Integer")
        );
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void ourTestClassAcceptedSecondWildcard() throws Exception {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112usiyl9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.ourTestClassAcceptedSecondWildcard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112usiyl9k() throws Exception{try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27560);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27561);assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept("*Integer","*MockSerializedClass")
        );
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void reject() {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17jqpml9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.reject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17jqpml9m(){try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27562);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27563);assertThrows(InvalidClassException.class,
                () -> assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(Long.class)
                .reject(MockSerializedClass.class, Integer.class)
        ));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void rejectPrecedence() {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q684kwl9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.rejectPrecedence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q684kwl9o(){try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27564);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27565);assertThrows(InvalidClassException.class,
                () -> assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .accept(MockSerializedClass.class)
                .reject(MockSerializedClass.class, Integer.class)
        ));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void rejectOnly() {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qltviql9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.rejectOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qltviql9q(){try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27566);
        __CLR4_4_1l8hl8hkylve3sa.R.inc(27567);assertThrows(InvalidClassException.class,
                () -> assertSerialization(
                closeAfterEachTest(new ValidatingObjectInputStream(testStream))
                .reject(Integer.class)
        ));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

    @Test
    public void customInvalidMethod() {__CLR4_4_1l8hl8hkylve3sa.R.globalSliceStart(getClass().getName(),27568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pl7t4el9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l8hl8hkylve3sa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l8hl8hkylve3sa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.serialization.ValidatingObjectInputStreamTest.customInvalidMethod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pl7t4el9s(){try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27568);
        class CustomVOIS extends ValidatingObjectInputStream {
            CustomVOIS(final InputStream is) throws IOException {
                super(is);__CLR4_4_1l8hl8hkylve3sa.R.inc(27570);try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27569);
            }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}

            @Override
            protected void invalidClassNameFound(final String className) throws InvalidClassException {try{__CLR4_4_1l8hl8hkylve3sa.R.inc(27571);
                __CLR4_4_1l8hl8hkylve3sa.R.inc(27572);throw new RuntimeException("Custom exception");
            }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}
        }

        __CLR4_4_1l8hl8hkylve3sa.R.inc(27573);assertThrows(RuntimeException.class,
                () -> assertSerialization(
                closeAfterEachTest(new CustomVOIS(testStream))
                .reject(Integer.class)
        ));
    }finally{__CLR4_4_1l8hl8hkylve3sa.R.flushNeeded();}}
}