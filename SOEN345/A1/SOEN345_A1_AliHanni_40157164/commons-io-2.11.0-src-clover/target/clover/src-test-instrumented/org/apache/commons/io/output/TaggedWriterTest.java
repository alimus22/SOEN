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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.Writer;
import java.util.UUID;

import org.apache.commons.io.TaggedIOException;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Case for {@link TaggedWriter}.
 */
public class TaggedWriterTest  {static class __CLR4_4_1kqckqckylve3o1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,26921,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testNormalWriter() {__CLR4_4_1kqckqckylve3o1.R.globalSliceStart(getClass().getName(),26868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oepkmrkqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqckqckylve3o1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqckqckylve3o1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TaggedWriterTest.testNormalWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oepkmrkqc(){try{__CLR4_4_1kqckqckylve3o1.R.inc(26868);
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kqckqckylve3o1.R.inc(26869);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1kqckqckylve3o1.R.inc(26870);}};final StringBuilderWriter buffer = new StringBuilderWriter()) {
            class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kqckqckylve3o1.R.inc(26871);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1kqckqckylve3o1.R.inc(26872);}};final Writer writer = new TaggedWriter(buffer)) {
                __CLR4_4_1kqckqckylve3o1.R.inc(26873);writer.write('a');
                __CLR4_4_1kqckqckylve3o1.R.inc(26874);writer.write(new char[] { 'b' });
                __CLR4_4_1kqckqckylve3o1.R.inc(26875);writer.write(new char[] { 'c' }, 0, 1);
                __CLR4_4_1kqckqckylve3o1.R.inc(26876);writer.flush();
            }
            __CLR4_4_1kqckqckylve3o1.R.inc(26877);assertEquals(3, buffer.getBuilder().length());
            __CLR4_4_1kqckqckylve3o1.R.inc(26878);assertEquals('a', buffer.getBuilder().charAt(0));
            __CLR4_4_1kqckqckylve3o1.R.inc(26879);assertEquals('b', buffer.getBuilder().charAt(1));
            __CLR4_4_1kqckqckylve3o1.R.inc(26880);assertEquals('c', buffer.getBuilder().charAt(2));
        } catch (final IOException e) {
            __CLR4_4_1kqckqckylve3o1.R.inc(26881);fail("Unexpected exception thrown");
        }
    }finally{__CLR4_4_1kqckqckylve3o1.R.flushNeeded();}}

    @Test
    public void testBrokenWriter() {__CLR4_4_1kqckqckylve3o1.R.globalSliceStart(getClass().getName(),26882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5g7kxkqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqckqckylve3o1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqckqckylve3o1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TaggedWriterTest.testBrokenWriter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5g7kxkqq(){try{__CLR4_4_1kqckqckylve3o1.R.inc(26882);
        __CLR4_4_1kqckqckylve3o1.R.inc(26883);final IOException exception = new IOException("test exception");
        __CLR4_4_1kqckqckylve3o1.R.inc(26884);final TaggedWriter writer =
            new TaggedWriter(new BrokenWriter(exception));

        // Test the write() method
        __CLR4_4_1kqckqckylve3o1.R.inc(26885);try {
            __CLR4_4_1kqckqckylve3o1.R.inc(26886);writer.write(new char[] { 'x' }, 0, 1);
            __CLR4_4_1kqckqckylve3o1.R.inc(26887);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1kqckqckylve3o1.R.inc(26888);assertTrue(writer.isCauseOf(e));
            __CLR4_4_1kqckqckylve3o1.R.inc(26889);try {
                __CLR4_4_1kqckqckylve3o1.R.inc(26890);writer.throwIfCauseOf(e);
                __CLR4_4_1kqckqckylve3o1.R.inc(26891);fail("Expected exception not thrown.");
            } catch (final IOException e2) {
                __CLR4_4_1kqckqckylve3o1.R.inc(26892);assertEquals(exception, e2);
            }
        }

        // Test the flush() method
        __CLR4_4_1kqckqckylve3o1.R.inc(26893);try {
            __CLR4_4_1kqckqckylve3o1.R.inc(26894);writer.flush();
            __CLR4_4_1kqckqckylve3o1.R.inc(26895);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1kqckqckylve3o1.R.inc(26896);assertTrue(writer.isCauseOf(e));
            __CLR4_4_1kqckqckylve3o1.R.inc(26897);try {
                __CLR4_4_1kqckqckylve3o1.R.inc(26898);writer.throwIfCauseOf(e);
                __CLR4_4_1kqckqckylve3o1.R.inc(26899);fail("Expected exception not thrown.");
            } catch (final IOException e2) {
                __CLR4_4_1kqckqckylve3o1.R.inc(26900);assertEquals(exception, e2);
            }
        }

        // Test the close() method
        __CLR4_4_1kqckqckylve3o1.R.inc(26901);try {
            __CLR4_4_1kqckqckylve3o1.R.inc(26902);writer.close();
            __CLR4_4_1kqckqckylve3o1.R.inc(26903);fail("Expected exception not thrown.");
        } catch (final IOException e) {
            __CLR4_4_1kqckqckylve3o1.R.inc(26904);assertTrue(writer.isCauseOf(e));
            __CLR4_4_1kqckqckylve3o1.R.inc(26905);try {
                __CLR4_4_1kqckqckylve3o1.R.inc(26906);writer.throwIfCauseOf(e);
                __CLR4_4_1kqckqckylve3o1.R.inc(26907);fail("Expected exception not thrown.");
            } catch (final IOException e2) {
                __CLR4_4_1kqckqckylve3o1.R.inc(26908);assertEquals(exception, e2);
            }
        }
    }finally{__CLR4_4_1kqckqckylve3o1.R.flushNeeded();}}

    @Test
    public void testOtherException() throws Exception {__CLR4_4_1kqckqckylve3o1.R.globalSliceStart(getClass().getName(),26909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15a48zskrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqckqckylve3o1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqckqckylve3o1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.output.TaggedWriterTest.testOtherException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15a48zskrh() throws Exception{try{__CLR4_4_1kqckqckylve3o1.R.inc(26909);
        __CLR4_4_1kqckqckylve3o1.R.inc(26910);final IOException exception = new IOException("test exception");
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1kqckqckylve3o1.R.inc(26911);try (__CLR4_4_1$AC2 __CLR$ACI2=new __CLR4_4_1$AC2(){{__CLR4_4_1kqckqckylve3o1.R.inc(26912);}};final TaggedWriter writer = new TaggedWriter(ClosedWriter.CLOSED_WRITER)) {

            __CLR4_4_1kqckqckylve3o1.R.inc(26913);assertFalse(writer.isCauseOf(exception));
            __CLR4_4_1kqckqckylve3o1.R.inc(26914);assertFalse(writer.isCauseOf(new TaggedIOException(exception, UUID.randomUUID())));

            __CLR4_4_1kqckqckylve3o1.R.inc(26915);try {
                __CLR4_4_1kqckqckylve3o1.R.inc(26916);writer.throwIfCauseOf(exception);
            } catch (final IOException e) {
                __CLR4_4_1kqckqckylve3o1.R.inc(26917);fail("Unexpected exception thrown");
            }

            __CLR4_4_1kqckqckylve3o1.R.inc(26918);try {
                __CLR4_4_1kqckqckylve3o1.R.inc(26919);writer.throwIfCauseOf(new TaggedIOException(exception, UUID.randomUUID()));
            } catch (final IOException e) {
                __CLR4_4_1kqckqckylve3o1.R.inc(26920);fail("Unexpected exception thrown");
            }
        }
    }finally{__CLR4_4_1kqckqckylve3o1.R.flushNeeded();}}

}
