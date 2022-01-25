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
package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;


/**
 *
 */
public class HexDumpTest {static class __CLR4_4_1bhebhekylve1nu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,15049,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private char toHex(final int n) {try{__CLR4_4_1bhebhekylve1nu.R.inc(14882);
        __CLR4_4_1bhebhekylve1nu.R.inc(14883);final char[] hexChars =
                {
                    '0', '1', '2', '3', '4', '5', '6', '7',
                    '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
                };

        __CLR4_4_1bhebhekylve1nu.R.inc(14884);return hexChars[n % 16];
    }finally{__CLR4_4_1bhebhekylve1nu.R.flushNeeded();}}

    @Test
    public void testDump()
            throws IOException {__CLR4_4_1bhebhekylve1nu.R.globalSliceStart(getClass().getName(),14885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev2pxvbhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bhebhekylve1nu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bhebhekylve1nu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.HexDumpTest.testDump",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),14885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev2pxvbhh() throws IOException{try{__CLR4_4_1bhebhekylve1nu.R.inc(14885);
        __CLR4_4_1bhebhekylve1nu.R.inc(14886);final byte[] testArray = new byte[256];

        __CLR4_4_1bhebhekylve1nu.R.inc(14887);for (int j = 0; (((j < 256)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14888)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14889)==0&false)); j++) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(14890);testArray[j] = (byte) j;
        }
        }__CLR4_4_1bhebhekylve1nu.R.inc(14891);ByteArrayOutputStream stream = new ByteArrayOutputStream();

        __CLR4_4_1bhebhekylve1nu.R.inc(14892);HexDump.dump(testArray, 0, stream, 0);
        __CLR4_4_1bhebhekylve1nu.R.inc(14893);byte[] outputArray = new byte[16 * (73 + HexDump.EOL.length())];

        __CLR4_4_1bhebhekylve1nu.R.inc(14894);for (int j = 0; (((j < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14895)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14896)==0&false)); j++) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(14897);int offset = (73 + HexDump.EOL.length()) * j;

            __CLR4_4_1bhebhekylve1nu.R.inc(14898);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14899);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14900);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14901);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14902);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14903);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14904);outputArray[offset++] = (byte) toHex(j);
            __CLR4_4_1bhebhekylve1nu.R.inc(14905);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14906);outputArray[offset++] = (byte) ' ';
            __CLR4_4_1bhebhekylve1nu.R.inc(14907);for (int k = 0; (((k < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14908)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14909)==0&false)); k++) {{
                __CLR4_4_1bhebhekylve1nu.R.inc(14910);outputArray[offset++] = (byte) toHex(j);
                __CLR4_4_1bhebhekylve1nu.R.inc(14911);outputArray[offset++] = (byte) toHex(k);
                __CLR4_4_1bhebhekylve1nu.R.inc(14912);outputArray[offset++] = (byte) ' ';
            }
            }__CLR4_4_1bhebhekylve1nu.R.inc(14913);for (int k = 0; (((k < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14914)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14915)==0&false)); k++) {{
                __CLR4_4_1bhebhekylve1nu.R.inc(14916);outputArray[offset++] = (byte) toAscii((j * 16) + k);
            }
            }__CLR4_4_1bhebhekylve1nu.R.inc(14917);System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset,
                    HexDump.EOL.getBytes().length);
        }
        }__CLR4_4_1bhebhekylve1nu.R.inc(14918);byte[] actualOutput = stream.toByteArray();

        __CLR4_4_1bhebhekylve1nu.R.inc(14919);assertEquals(outputArray.length, actualOutput.length, "array size mismatch");
        __CLR4_4_1bhebhekylve1nu.R.inc(14920);for (int j = 0; (((j < outputArray.length)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14921)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14922)==0&false)); j++) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(14923);assertEquals(outputArray[j], actualOutput[j], "array[ " + j + "] mismatch");
        }

        // verify proper behavior with non-zero offset
        }__CLR4_4_1bhebhekylve1nu.R.inc(14924);stream = new ByteArrayOutputStream();
        __CLR4_4_1bhebhekylve1nu.R.inc(14925);HexDump.dump(testArray, 0x10000000, stream, 0);
        __CLR4_4_1bhebhekylve1nu.R.inc(14926);outputArray = new byte[16 * (73 + HexDump.EOL.length())];
        __CLR4_4_1bhebhekylve1nu.R.inc(14927);for (int j = 0; (((j < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14928)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14929)==0&false)); j++) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(14930);int offset = (73 + HexDump.EOL.length()) * j;

            __CLR4_4_1bhebhekylve1nu.R.inc(14931);outputArray[offset++] = (byte) '1';
            __CLR4_4_1bhebhekylve1nu.R.inc(14932);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14933);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14934);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14935);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14936);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14937);outputArray[offset++] = (byte) toHex(j);
            __CLR4_4_1bhebhekylve1nu.R.inc(14938);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14939);outputArray[offset++] = (byte) ' ';
            __CLR4_4_1bhebhekylve1nu.R.inc(14940);for (int k = 0; (((k < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14941)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14942)==0&false)); k++) {{
                __CLR4_4_1bhebhekylve1nu.R.inc(14943);outputArray[offset++] = (byte) toHex(j);
                __CLR4_4_1bhebhekylve1nu.R.inc(14944);outputArray[offset++] = (byte) toHex(k);
                __CLR4_4_1bhebhekylve1nu.R.inc(14945);outputArray[offset++] = (byte) ' ';
            }
            }__CLR4_4_1bhebhekylve1nu.R.inc(14946);for (int k = 0; (((k < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14947)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14948)==0&false)); k++) {{
                __CLR4_4_1bhebhekylve1nu.R.inc(14949);outputArray[offset++] = (byte) toAscii((j * 16) + k);
            }
            }__CLR4_4_1bhebhekylve1nu.R.inc(14950);System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset,
                    HexDump.EOL.getBytes().length);
        }
        }__CLR4_4_1bhebhekylve1nu.R.inc(14951);actualOutput = stream.toByteArray();
        __CLR4_4_1bhebhekylve1nu.R.inc(14952);assertEquals(outputArray.length, actualOutput.length, "array size mismatch");
        __CLR4_4_1bhebhekylve1nu.R.inc(14953);for (int j = 0; (((j < outputArray.length)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14954)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14955)==0&false)); j++) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(14956);assertEquals(outputArray[j], actualOutput[j], "array[ " + j + "] mismatch");
        }

        // verify proper behavior with negative offset
        }__CLR4_4_1bhebhekylve1nu.R.inc(14957);stream = new ByteArrayOutputStream();
        __CLR4_4_1bhebhekylve1nu.R.inc(14958);HexDump.dump(testArray, 0xFF000000, stream, 0);
        __CLR4_4_1bhebhekylve1nu.R.inc(14959);outputArray = new byte[16 * (73 + HexDump.EOL.length())];
        __CLR4_4_1bhebhekylve1nu.R.inc(14960);for (int j = 0; (((j < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14961)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14962)==0&false)); j++) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(14963);int offset = (73 + HexDump.EOL.length()) * j;

            __CLR4_4_1bhebhekylve1nu.R.inc(14964);outputArray[offset++] = (byte) 'F';
            __CLR4_4_1bhebhekylve1nu.R.inc(14965);outputArray[offset++] = (byte) 'F';
            __CLR4_4_1bhebhekylve1nu.R.inc(14966);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14967);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14968);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14969);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14970);outputArray[offset++] = (byte) toHex(j);
            __CLR4_4_1bhebhekylve1nu.R.inc(14971);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14972);outputArray[offset++] = (byte) ' ';
            __CLR4_4_1bhebhekylve1nu.R.inc(14973);for (int k = 0; (((k < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14974)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14975)==0&false)); k++) {{
                __CLR4_4_1bhebhekylve1nu.R.inc(14976);outputArray[offset++] = (byte) toHex(j);
                __CLR4_4_1bhebhekylve1nu.R.inc(14977);outputArray[offset++] = (byte) toHex(k);
                __CLR4_4_1bhebhekylve1nu.R.inc(14978);outputArray[offset++] = (byte) ' ';
            }
            }__CLR4_4_1bhebhekylve1nu.R.inc(14979);for (int k = 0; (((k < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14980)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14981)==0&false)); k++) {{
                __CLR4_4_1bhebhekylve1nu.R.inc(14982);outputArray[offset++] = (byte) toAscii((j * 16) + k);
            }
            }__CLR4_4_1bhebhekylve1nu.R.inc(14983);System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset,
                    HexDump.EOL.getBytes().length);
        }
        }__CLR4_4_1bhebhekylve1nu.R.inc(14984);actualOutput = stream.toByteArray();
        __CLR4_4_1bhebhekylve1nu.R.inc(14985);assertEquals(outputArray.length, actualOutput.length, "array size mismatch");
        __CLR4_4_1bhebhekylve1nu.R.inc(14986);for (int j = 0; (((j < outputArray.length)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14987)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14988)==0&false)); j++) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(14989);assertEquals(outputArray[j], actualOutput[j], "array[ " + j + "] mismatch");
        }

        // verify proper behavior with non-zero index
        }__CLR4_4_1bhebhekylve1nu.R.inc(14990);stream = new ByteArrayOutputStream();
        __CLR4_4_1bhebhekylve1nu.R.inc(14991);HexDump.dump(testArray, 0x10000000, stream, 0x81);
        __CLR4_4_1bhebhekylve1nu.R.inc(14992);outputArray = new byte[(8 * (73 + HexDump.EOL.length())) - 1];
        __CLR4_4_1bhebhekylve1nu.R.inc(14993);for (int j = 0; (((j < 8)&&(__CLR4_4_1bhebhekylve1nu.R.iget(14994)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(14995)==0&false)); j++) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(14996);int offset = (73 + HexDump.EOL.length()) * j;

            __CLR4_4_1bhebhekylve1nu.R.inc(14997);outputArray[offset++] = (byte) '1';
            __CLR4_4_1bhebhekylve1nu.R.inc(14998);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(14999);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(15000);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(15001);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(15002);outputArray[offset++] = (byte) '0';
            __CLR4_4_1bhebhekylve1nu.R.inc(15003);outputArray[offset++] = (byte) toHex(j + 8);
            __CLR4_4_1bhebhekylve1nu.R.inc(15004);outputArray[offset++] = (byte) '1';
            __CLR4_4_1bhebhekylve1nu.R.inc(15005);outputArray[offset++] = (byte) ' ';
            __CLR4_4_1bhebhekylve1nu.R.inc(15006);for (int k = 0; (((k < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(15007)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(15008)==0&false)); k++) {{
                __CLR4_4_1bhebhekylve1nu.R.inc(15009);final int index = 0x81 + (j * 16) + k;

                __CLR4_4_1bhebhekylve1nu.R.inc(15010);if ((((index < 0x100)&&(__CLR4_4_1bhebhekylve1nu.R.iget(15011)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(15012)==0&false))) {{
                    __CLR4_4_1bhebhekylve1nu.R.inc(15013);outputArray[offset++] = (byte) toHex(index / 16);
                    __CLR4_4_1bhebhekylve1nu.R.inc(15014);outputArray[offset++] = (byte) toHex(index);
                } }else {{
                    __CLR4_4_1bhebhekylve1nu.R.inc(15015);outputArray[offset++] = (byte) ' ';
                    __CLR4_4_1bhebhekylve1nu.R.inc(15016);outputArray[offset++] = (byte) ' ';
                }
                }__CLR4_4_1bhebhekylve1nu.R.inc(15017);outputArray[offset++] = (byte) ' ';
            }
            }__CLR4_4_1bhebhekylve1nu.R.inc(15018);for (int k = 0; (((k < 16)&&(__CLR4_4_1bhebhekylve1nu.R.iget(15019)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(15020)==0&false)); k++) {{
                __CLR4_4_1bhebhekylve1nu.R.inc(15021);final int index = 0x81 + (j * 16) + k;

                __CLR4_4_1bhebhekylve1nu.R.inc(15022);if ((((index < 0x100)&&(__CLR4_4_1bhebhekylve1nu.R.iget(15023)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(15024)==0&false))) {{
                    __CLR4_4_1bhebhekylve1nu.R.inc(15025);outputArray[offset++] = (byte) toAscii(index);
                }
            }}
            }__CLR4_4_1bhebhekylve1nu.R.inc(15026);System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset,
                    HexDump.EOL.getBytes().length);
        }
        }__CLR4_4_1bhebhekylve1nu.R.inc(15027);actualOutput = stream.toByteArray();
        __CLR4_4_1bhebhekylve1nu.R.inc(15028);assertEquals(outputArray.length, actualOutput.length, "array size mismatch");
        __CLR4_4_1bhebhekylve1nu.R.inc(15029);for (int j = 0; (((j < outputArray.length)&&(__CLR4_4_1bhebhekylve1nu.R.iget(15030)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(15031)==0&false)); j++) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(15032);assertEquals(outputArray[j], actualOutput[j], "array[ " + j + "] mismatch");
        }

        // verify proper behavior with negative index
        }__CLR4_4_1bhebhekylve1nu.R.inc(15033);try {
            __CLR4_4_1bhebhekylve1nu.R.inc(15034);HexDump.dump(testArray, 0x10000000, new ByteArrayOutputStream(),
                    -1);
            __CLR4_4_1bhebhekylve1nu.R.inc(15035);fail("should have caught ArrayIndexOutOfBoundsException on negative index");
        } catch (final ArrayIndexOutOfBoundsException ignored_exception) {

            // as expected
        }

        // verify proper behavior with index that is too large
        __CLR4_4_1bhebhekylve1nu.R.inc(15036);try {
            __CLR4_4_1bhebhekylve1nu.R.inc(15037);HexDump.dump(testArray, 0x10000000, new ByteArrayOutputStream(),
                    testArray.length);
            __CLR4_4_1bhebhekylve1nu.R.inc(15038);fail("should have caught ArrayIndexOutOfBoundsException on large index");
        } catch (final ArrayIndexOutOfBoundsException ignored_exception) {

            // as expected
        }

        // verify proper behavior with null stream
        __CLR4_4_1bhebhekylve1nu.R.inc(15039);try {
            __CLR4_4_1bhebhekylve1nu.R.inc(15040);HexDump.dump(testArray, 0x10000000, null, 0);
            __CLR4_4_1bhebhekylve1nu.R.inc(15041);fail("should have caught IllegalArgumentException on negative index");
        } catch (final IllegalArgumentException ignored_exception) {

            // as expected
        }
    }finally{__CLR4_4_1bhebhekylve1nu.R.flushNeeded();}}

    private char toAscii(final int c) {try{__CLR4_4_1bhebhekylve1nu.R.inc(15042);
        __CLR4_4_1bhebhekylve1nu.R.inc(15043);char rval = '.';

        __CLR4_4_1bhebhekylve1nu.R.inc(15044);if (((((c >= 32) && (c <= 126))&&(__CLR4_4_1bhebhekylve1nu.R.iget(15045)!=0|true))||(__CLR4_4_1bhebhekylve1nu.R.iget(15046)==0&false))) {{
            __CLR4_4_1bhebhekylve1nu.R.inc(15047);rval = (char) c;
        }
        }__CLR4_4_1bhebhekylve1nu.R.inc(15048);return rval;
    }finally{__CLR4_4_1bhebhekylve1nu.R.flushNeeded();}}
}
