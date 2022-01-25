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
package org.apache.commons.io.output;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.Writer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link BrokenWriter}.
 */
public class BrokenWriterTest {static class __CLR4_4_1jngjngkylve3gx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,25494,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private IOException exception;

    private Writer writer;

    @BeforeEach
    public void setUp() {try{__CLR4_4_1jngjngkylve3gx.R.inc(25468);
        __CLR4_4_1jngjngkylve3gx.R.inc(25469);exception = new IOException("test exception");
        __CLR4_4_1jngjngkylve3gx.R.inc(25470);writer = new BrokenWriter(exception);
    }finally{__CLR4_4_1jngjngkylve3gx.R.flushNeeded();}}

    @Test
    public void testWrite() {__CLR4_4_1jngjngkylve3gx.R.globalSliceStart(getClass().getName(),25471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhs9w4jnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jngjngkylve3gx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jngjngkylve3gx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.BrokenWriterTest.testWrite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhs9w4jnj(){try{__CLR4_4_1jngjngkylve3gx.R.inc(25471);
        __CLR4_4_1jngjngkylve3gx.R.inc(25472);try {
            __CLR4_4_1jngjngkylve3gx.R.inc(25473);writer.write(1);
            __CLR4_4_1jngjngkylve3gx.R.inc(25474);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1jngjngkylve3gx.R.inc(25475);assertEquals(exception, e);
        }

        __CLR4_4_1jngjngkylve3gx.R.inc(25476);try {
            __CLR4_4_1jngjngkylve3gx.R.inc(25477);writer.write(new char[1]);
            __CLR4_4_1jngjngkylve3gx.R.inc(25478);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1jngjngkylve3gx.R.inc(25479);assertEquals(exception, e);
        }

        __CLR4_4_1jngjngkylve3gx.R.inc(25480);try {
            __CLR4_4_1jngjngkylve3gx.R.inc(25481);writer.write(new char[1], 0, 1);
            __CLR4_4_1jngjngkylve3gx.R.inc(25482);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1jngjngkylve3gx.R.inc(25483);assertEquals(exception, e);
        }
    }finally{__CLR4_4_1jngjngkylve3gx.R.flushNeeded();}}

    @Test
    public void testFlush() {__CLR4_4_1jngjngkylve3gx.R.globalSliceStart(getClass().getName(),25484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqzdztjnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jngjngkylve3gx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jngjngkylve3gx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.BrokenWriterTest.testFlush",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqzdztjnw(){try{__CLR4_4_1jngjngkylve3gx.R.inc(25484);
        __CLR4_4_1jngjngkylve3gx.R.inc(25485);try {
            __CLR4_4_1jngjngkylve3gx.R.inc(25486);writer.flush();
            __CLR4_4_1jngjngkylve3gx.R.inc(25487);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1jngjngkylve3gx.R.inc(25488);assertEquals(exception, e);
        }
    }finally{__CLR4_4_1jngjngkylve3gx.R.flushNeeded();}}

    @Test
    public void testClose() {__CLR4_4_1jngjngkylve3gx.R.globalSliceStart(getClass().getName(),25489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169vzsjjo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jngjngkylve3gx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jngjngkylve3gx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.BrokenWriterTest.testClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169vzsjjo1(){try{__CLR4_4_1jngjngkylve3gx.R.inc(25489);
        __CLR4_4_1jngjngkylve3gx.R.inc(25490);try {
            __CLR4_4_1jngjngkylve3gx.R.inc(25491);writer.close();
            __CLR4_4_1jngjngkylve3gx.R.inc(25492);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1jngjngkylve3gx.R.inc(25493);assertEquals(exception, e);
        }
    }finally{__CLR4_4_1jngjngkylve3gx.R.flushNeeded();}}

}
