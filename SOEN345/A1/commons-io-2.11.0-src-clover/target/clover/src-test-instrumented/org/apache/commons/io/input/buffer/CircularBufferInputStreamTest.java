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
package org.apache.commons.io.input.buffer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;

import org.junit.jupiter.api.Test;


@java.lang.SuppressWarnings({"fallthrough"}) public class CircularBufferInputStreamTest {static class __CLR4_4_1ipoipokylve3b9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,24314,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private final Random rnd = new Random(1530960934483L); // System.currentTimeMillis(), when this test was written.
	                                                       // Always using the same seed should ensure a reproducible test.

	@Test
	public void testRandomRead() throws Exception {__CLR4_4_1ipoipokylve3b9.R.globalSliceStart(getClass().getName(),24252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9gu1eipo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ipoipokylve3b9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ipoipokylve3b9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.buffer.CircularBufferInputStreamTest.testRandomRead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9gu1eipo() throws Exception{try{__CLR4_4_1ipoipokylve3b9.R.inc(24252);
		__CLR4_4_1ipoipokylve3b9.R.inc(24253);final byte[] inputBuffer = newInputBuffer();
		__CLR4_4_1ipoipokylve3b9.R.inc(24254);final byte[] bufferCopy = new byte[inputBuffer.length];
		__CLR4_4_1ipoipokylve3b9.R.inc(24255);final ByteArrayInputStream bais = new ByteArrayInputStream(inputBuffer);
		__CLR4_4_1ipoipokylve3b9.R.inc(24256);@SuppressWarnings("resource")
		final CircularBufferInputStream cbis = new CircularBufferInputStream(bais, 253);
		__CLR4_4_1ipoipokylve3b9.R.inc(24257);int offset = 0;
		__CLR4_4_1ipoipokylve3b9.R.inc(24258);final byte[] readBuffer = new byte[256];
		__CLR4_4_1ipoipokylve3b9.R.inc(24259);while ((((offset < bufferCopy.length)&&(__CLR4_4_1ipoipokylve3b9.R.iget(24260)!=0|true))||(__CLR4_4_1ipoipokylve3b9.R.iget(24261)==0&false))) {{
			boolean __CLB4_4_1_bool0=false;__CLR4_4_1ipoipokylve3b9.R.inc(24262);switch (rnd.nextInt(2)) {
			case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1ipoipokylve3b9.R.inc(24263);__CLB4_4_1_bool0=true;}
			{
				__CLR4_4_1ipoipokylve3b9.R.inc(24264);final int res = cbis.read();
				__CLR4_4_1ipoipokylve3b9.R.inc(24265);if ((((res == -1)&&(__CLR4_4_1ipoipokylve3b9.R.iget(24266)!=0|true))||(__CLR4_4_1ipoipokylve3b9.R.iget(24267)==0&false))) {{
					__CLR4_4_1ipoipokylve3b9.R.inc(24268);throw new IllegalStateException("Unexpected EOF at offset " + offset);
				}
				}__CLR4_4_1ipoipokylve3b9.R.inc(24269);if ((((inputBuffer[offset] != (byte) res)&&(__CLR4_4_1ipoipokylve3b9.R.iget(24270)!=0|true))||(__CLR4_4_1ipoipokylve3b9.R.iget(24271)==0&false))) {{ // compare as bytes
					__CLR4_4_1ipoipokylve3b9.R.inc(24272);throw new IllegalStateException("Expected " + inputBuffer[offset] + " at offset " + offset + ", got " + res);
				}
				}__CLR4_4_1ipoipokylve3b9.R.inc(24273);++offset;
				__CLR4_4_1ipoipokylve3b9.R.inc(24274);break;
			}
			case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1ipoipokylve3b9.R.inc(24275);__CLB4_4_1_bool0=true;}
			{
				__CLR4_4_1ipoipokylve3b9.R.inc(24276);final int res = cbis.read(readBuffer, 0, rnd.nextInt(readBuffer.length+1));
				__CLR4_4_1ipoipokylve3b9.R.inc(24277);if ((((res == -1)&&(__CLR4_4_1ipoipokylve3b9.R.iget(24278)!=0|true))||(__CLR4_4_1ipoipokylve3b9.R.iget(24279)==0&false))) {{
					__CLR4_4_1ipoipokylve3b9.R.inc(24280);throw new IllegalStateException("Unexpected EOF at offset " + offset);
				}
        }__CLR4_4_1ipoipokylve3b9.R.inc(24281);if ((((res == 0)&&(__CLR4_4_1ipoipokylve3b9.R.iget(24282)!=0|true))||(__CLR4_4_1ipoipokylve3b9.R.iget(24283)==0&false))) {{
					__CLR4_4_1ipoipokylve3b9.R.inc(24284);throw new IllegalStateException("Unexpected zero-byte-result at offset " + offset);
				}
        }__CLR4_4_1ipoipokylve3b9.R.inc(24285);for (int i = 0;  (((i < res)&&(__CLR4_4_1ipoipokylve3b9.R.iget(24286)!=0|true))||(__CLR4_4_1ipoipokylve3b9.R.iget(24287)==0&false));  i++) {{
            __CLR4_4_1ipoipokylve3b9.R.inc(24288);if ((((inputBuffer[offset] != readBuffer[i])&&(__CLR4_4_1ipoipokylve3b9.R.iget(24289)!=0|true))||(__CLR4_4_1ipoipokylve3b9.R.iget(24290)==0&false))) {{
                __CLR4_4_1ipoipokylve3b9.R.inc(24291);throw new IllegalStateException("Expected " + inputBuffer[offset] + " at offset " + offset + ", got " + readBuffer[i]);
            }
            }__CLR4_4_1ipoipokylve3b9.R.inc(24292);++offset;
        }
				}__CLR4_4_1ipoipokylve3b9.R.inc(24293);break;
			}
			default:if (!__CLB4_4_1_bool0) {__CLR4_4_1ipoipokylve3b9.R.inc(24294);__CLB4_4_1_bool0=true;}
				__CLR4_4_1ipoipokylve3b9.R.inc(24295);throw new IllegalStateException("Unexpected random choice value");
			}
		}
		}__CLR4_4_1ipoipokylve3b9.R.inc(24296);assertTrue(true, "Test finished OK");
	}finally{__CLR4_4_1ipoipokylve3b9.R.flushNeeded();}}

	@Test
  public void testIO683() throws IOException {__CLR4_4_1ipoipokylve3b9.R.globalSliceStart(getClass().getName(),24297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qt9rc0iqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ipoipokylve3b9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ipoipokylve3b9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.input.buffer.CircularBufferInputStreamTest.testIO683",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qt9rc0iqx() throws IOException{try{__CLR4_4_1ipoipokylve3b9.R.inc(24297);
		__CLR4_4_1ipoipokylve3b9.R.inc(24298);final byte[] buffer = {0,1,-2,-2,-1,4};
		class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1ipoipokylve3b9.R.inc(24299);try (
			__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1ipoipokylve3b9.R.inc(24300);}};final ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
			__CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_1ipoipokylve3b9.R.inc(24301);}};final CircularBufferInputStream cbis = new CircularBufferInputStream(bais)
		){
			__CLR4_4_1ipoipokylve3b9.R.inc(24302);int b;
			__CLR4_4_1ipoipokylve3b9.R.inc(24303);int i = 0;
			__CLR4_4_1ipoipokylve3b9.R.inc(24304);while((b = cbis.read()) != -1) {{
				__CLR4_4_1ipoipokylve3b9.R.inc(24307);assertEquals(buffer[i] & 0xFF,b, "byte at index " + i + " should be equal");
				__CLR4_4_1ipoipokylve3b9.R.inc(24308);i++;
			}
			}__CLR4_4_1ipoipokylve3b9.R.inc(24309);assertEquals(buffer.length, i, "Should have read all the bytes");
		}
	}finally{__CLR4_4_1ipoipokylve3b9.R.flushNeeded();}}

	/**
	 * Create a large, but random input buffer.
	 */
	private byte[] newInputBuffer() {try{__CLR4_4_1ipoipokylve3b9.R.inc(24310);
		__CLR4_4_1ipoipokylve3b9.R.inc(24311);final byte[] buffer = new byte[16*512+rnd.nextInt(512)];
		__CLR4_4_1ipoipokylve3b9.R.inc(24312);rnd.nextBytes(buffer);
		__CLR4_4_1ipoipokylve3b9.R.inc(24313);return buffer;
	}finally{__CLR4_4_1ipoipokylve3b9.R.flushNeeded();}}
}
