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
package org.apache.commons.io.input;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Test for the SwappedDataInputStream. This also
 * effectively tests the underlying EndianUtils Stream methods.
 *
 */

public class SwappedDataInputStreamTest {static class __CLR4_4_1ho2ho2kylve330{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,22944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private SwappedDataInputStream sdis;
    private byte[] bytes;

    @BeforeEach
    public void setUp() {try{__CLR4_4_1ho2ho2kylve330.R.inc(22898);
        __CLR4_4_1ho2ho2kylve330.R.inc(22899);bytes = new byte[] {
            0x01,
            0x02,
            0x03,
            0x04,
            0x05,
            0x06,
            0x07,
            0x08
        };
        __CLR4_4_1ho2ho2kylve330.R.inc(22900);final ByteArrayInputStream bais = new ByteArrayInputStream( bytes );
        __CLR4_4_1ho2ho2kylve330.R.inc(22901);this.sdis = new SwappedDataInputStream( bais );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @AfterEach
    public void tearDown() {try{__CLR4_4_1ho2ho2kylve330.R.inc(22902);
        __CLR4_4_1ho2ho2kylve330.R.inc(22903);this.sdis = null;
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadBoolean() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4c2knho8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadBoolean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4c2knho8() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22904);
        __CLR4_4_1ho2ho2kylve330.R.inc(22905);bytes = new byte[] {0x00, 0x01, 0x02,};
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ho2ho2kylve330.R.inc(22906);try (
            __CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1ho2ho2kylve330.R.inc(22907);}};final ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            __CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1ho2ho2kylve330.R.inc(22908);}};final SwappedDataInputStream sdis = new SwappedDataInputStream(bais)
        ) {
            __CLR4_4_1ho2ho2kylve330.R.inc(22909);assertFalse(sdis.readBoolean());
            __CLR4_4_1ho2ho2kylve330.R.inc(22910);assertTrue(sdis.readBoolean());
            __CLR4_4_1ho2ho2kylve330.R.inc(22911);assertTrue(sdis.readBoolean());
        }
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadByte() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vqelahhog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadByte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vqelahhog() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22912);
        __CLR4_4_1ho2ho2kylve330.R.inc(22913);assertEquals( 0x01, this.sdis.readByte() );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadChar() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1frrflnhoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1frrflnhoi() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22914);
        __CLR4_4_1ho2ho2kylve330.R.inc(22915);assertEquals( (char) 0x0201, this.sdis.readChar() );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadDouble() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cht0v4hok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cht0v4hok() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22916);
        __CLR4_4_1ho2ho2kylve330.R.inc(22917);assertEquals( Double.longBitsToDouble(0x0807060504030201L), this.sdis.readDouble(), 0 );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadFloat() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bwwoxxhom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadFloat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bwwoxxhom() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22918);
        __CLR4_4_1ho2ho2kylve330.R.inc(22919);assertEquals( Float.intBitsToFloat(0x04030201), this.sdis.readFloat(), 0 );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadFully() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5ookphoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadFully",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5ookphoo() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22920);
        __CLR4_4_1ho2ho2kylve330.R.inc(22921);final byte[] bytesIn = new byte[8];
        __CLR4_4_1ho2ho2kylve330.R.inc(22922);this.sdis.readFully(bytesIn);
        __CLR4_4_1ho2ho2kylve330.R.inc(22923);for( int i=0; (((i<8)&&(__CLR4_4_1ho2ho2kylve330.R.iget(22924)!=0|true))||(__CLR4_4_1ho2ho2kylve330.R.iget(22925)==0&false)); i++) {{
            __CLR4_4_1ho2ho2kylve330.R.inc(22926);assertEquals( bytes[i], bytesIn[i] );
        }
    }}finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadInt() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wb6z6hov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wb6z6hov() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22927);
        __CLR4_4_1ho2ho2kylve330.R.inc(22928);assertEquals( 0x04030201, this.sdis.readInt() );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadLine() {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ep5lb7hox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadLine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ep5lb7hox(){try{__CLR4_4_1ho2ho2kylve330.R.inc(22929);
        __CLR4_4_1ho2ho2kylve330.R.inc(22930);assertThrows(UnsupportedOperationException.class, () ->  this.sdis.readLine(),
                "readLine should be unsupported. ");
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadLong() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18e1dpnhoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18e1dpnhoz() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22931);
        __CLR4_4_1ho2ho2kylve330.R.inc(22932);assertEquals( 0x0807060504030201L, this.sdis.readLong() );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadShort() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec01jvhp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec01jvhp1() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22933);
        __CLR4_4_1ho2ho2kylve330.R.inc(22934);assertEquals( (short) 0x0201, this.sdis.readShort() );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadUnsignedByte() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1h8wkhp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadUnsignedByte",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1h8wkhp3() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22935);
        __CLR4_4_1ho2ho2kylve330.R.inc(22936);assertEquals( 0x01, this.sdis.readUnsignedByte() );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadUnsignedShort() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uo9hmuhp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadUnsignedShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uo9hmuhp5() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22937);
        __CLR4_4_1ho2ho2kylve330.R.inc(22938);assertEquals( (short) 0x0201, this.sdis.readUnsignedShort() );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testReadUTF() {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uacq56hp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testReadUTF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uacq56hp7(){try{__CLR4_4_1ho2ho2kylve330.R.inc(22939);
        __CLR4_4_1ho2ho2kylve330.R.inc(22940);assertThrows(UnsupportedOperationException.class, () ->  this.sdis.readUTF(),
                "readUTF should be unsupported. ");
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

    @Test
    public void testSkipBytes() throws IOException {__CLR4_4_1ho2ho2kylve330.R.globalSliceStart(getClass().getName(),22941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1do84lbhp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ho2ho2kylve330.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ho2ho2kylve330.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.SwappedDataInputStreamTest.testSkipBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1do84lbhp9() throws IOException{try{__CLR4_4_1ho2ho2kylve330.R.inc(22941);
        __CLR4_4_1ho2ho2kylve330.R.inc(22942);this.sdis.skipBytes(4);
        __CLR4_4_1ho2ho2kylve330.R.inc(22943);assertEquals( 0x08070605, this.sdis.readInt() );
    }finally{__CLR4_4_1ho2ho2kylve330.R.flushNeeded();}}

}
