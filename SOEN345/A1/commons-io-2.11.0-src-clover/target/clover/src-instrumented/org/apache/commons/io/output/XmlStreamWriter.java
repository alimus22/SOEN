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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.XmlStreamReader;

/**
 * Character stream that handles all the necessary Voodoo to figure out the
 * charset encoding of the XML document written to the stream.
 *
 * @see XmlStreamReader
 * @since 2.0
 */
public class XmlStreamWriter extends Writer {public static class __CLR4_4_17gy7gykylve0i1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int BUFFER_SIZE = IOUtils.DEFAULT_BUFFER_SIZE;

    private final OutputStream out;

    private final String defaultEncoding;

    private StringWriter xmlPrologWriter = new StringWriter(BUFFER_SIZE);

    private Writer writer;

    private String encoding;

    /**
     * Constructs a new XML stream writer for the specified output stream
     * with a default encoding of UTF-8.
     *
     * @param out The output stream
     */
    public XmlStreamWriter(final OutputStream out) {
        this(out, null);__CLR4_4_17gy7gykylve0i1.R.inc(9683);try{__CLR4_4_17gy7gykylve0i1.R.inc(9682);
    }finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    /**
     * Constructs a new XML stream writer for the specified output stream
     * with the specified default encoding.
     *
     * @param out The output stream
     * @param defaultEncoding The default encoding if not encoding could be detected
     */
    public XmlStreamWriter(final OutputStream out, final String defaultEncoding) {try{__CLR4_4_17gy7gykylve0i1.R.inc(9684);
        __CLR4_4_17gy7gykylve0i1.R.inc(9685);this.out = out;
        __CLR4_4_17gy7gykylve0i1.R.inc(9686);this.defaultEncoding = (((defaultEncoding != null )&&(__CLR4_4_17gy7gykylve0i1.R.iget(9687)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9688)==0&false))? defaultEncoding : "UTF-8";
    }finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    /**
     * Constructs a new XML stream writer for the specified file
     * with a default encoding of UTF-8.
     *
     * @param file The file to write to
     * @throws FileNotFoundException if there is an error creating or
     * opening the file
     */
    public XmlStreamWriter(final File file) throws FileNotFoundException {
        this(file, null);__CLR4_4_17gy7gykylve0i1.R.inc(9690);try{__CLR4_4_17gy7gykylve0i1.R.inc(9689);
    }finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    /**
     * Constructs a new XML stream writer for the specified file
     * with the specified default encoding.
     *
     * @param file The file to write to
     * @param defaultEncoding The default encoding if not encoding could be detected
     * @throws FileNotFoundException if there is an error creating or
     * opening the file
     */
    @SuppressWarnings("resource")
    public XmlStreamWriter(final File file, final String defaultEncoding) throws FileNotFoundException {
        this(new FileOutputStream(file), defaultEncoding);__CLR4_4_17gy7gykylve0i1.R.inc(9692);try{__CLR4_4_17gy7gykylve0i1.R.inc(9691);
    }finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    /**
     * Returns the detected encoding.
     *
     * @return the detected encoding
     */
    public String getEncoding() {try{__CLR4_4_17gy7gykylve0i1.R.inc(9693);
        __CLR4_4_17gy7gykylve0i1.R.inc(9694);return encoding;
    }finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    /**
     * Returns the default encoding.
     *
     * @return the default encoding
     */
    public String getDefaultEncoding() {try{__CLR4_4_17gy7gykylve0i1.R.inc(9695);
        __CLR4_4_17gy7gykylve0i1.R.inc(9696);return defaultEncoding;
    }finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    /**
     * Closes the underlying writer.
     *
     * @throws IOException if an error occurs closing the underlying writer
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_17gy7gykylve0i1.R.inc(9697);
        __CLR4_4_17gy7gykylve0i1.R.inc(9698);if ((((writer == null)&&(__CLR4_4_17gy7gykylve0i1.R.iget(9699)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9700)==0&false))) {{
            __CLR4_4_17gy7gykylve0i1.R.inc(9701);encoding = defaultEncoding;
            __CLR4_4_17gy7gykylve0i1.R.inc(9702);writer = new OutputStreamWriter(out, encoding);
            __CLR4_4_17gy7gykylve0i1.R.inc(9703);writer.write(xmlPrologWriter.toString());
        }
        }__CLR4_4_17gy7gykylve0i1.R.inc(9704);writer.close();
    }finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    /**
     * Flushes the underlying writer.
     *
     * @throws IOException if an error occurs flushing the underlying writer
     */
    @Override
    public void flush() throws IOException {try{__CLR4_4_17gy7gykylve0i1.R.inc(9705);
        __CLR4_4_17gy7gykylve0i1.R.inc(9706);if ((((writer != null)&&(__CLR4_4_17gy7gykylve0i1.R.iget(9707)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9708)==0&false))) {{
            __CLR4_4_17gy7gykylve0i1.R.inc(9709);writer.flush();
        }
    }}finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    /**
     * Detects the encoding.
     *
     * @param cbuf the buffer to write the characters from
     * @param off The start offset
     * @param len The number of characters to write
     * @throws IOException if an error occurs detecting the encoding
     */
    private void detectEncoding(final char[] cbuf, final int off, final int len)
            throws IOException {try{__CLR4_4_17gy7gykylve0i1.R.inc(9710);
        __CLR4_4_17gy7gykylve0i1.R.inc(9711);int size = len;
        __CLR4_4_17gy7gykylve0i1.R.inc(9712);final StringBuffer xmlProlog = xmlPrologWriter.getBuffer();
        __CLR4_4_17gy7gykylve0i1.R.inc(9713);if ((((xmlProlog.length() + len > BUFFER_SIZE)&&(__CLR4_4_17gy7gykylve0i1.R.iget(9714)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9715)==0&false))) {{
            __CLR4_4_17gy7gykylve0i1.R.inc(9716);size = BUFFER_SIZE - xmlProlog.length();
        }
        }__CLR4_4_17gy7gykylve0i1.R.inc(9717);xmlPrologWriter.write(cbuf, off, size);

        // try to determine encoding
        __CLR4_4_17gy7gykylve0i1.R.inc(9718);if ((((xmlProlog.length() >= 5)&&(__CLR4_4_17gy7gykylve0i1.R.iget(9719)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9720)==0&false))) {{
            __CLR4_4_17gy7gykylve0i1.R.inc(9721);if ((((xmlProlog.substring(0, 5).equals("<?xml"))&&(__CLR4_4_17gy7gykylve0i1.R.iget(9722)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9723)==0&false))) {{
                // try to extract encoding from XML prolog
                __CLR4_4_17gy7gykylve0i1.R.inc(9724);final int xmlPrologEnd = xmlProlog.indexOf("?>");
                __CLR4_4_17gy7gykylve0i1.R.inc(9725);if ((((xmlPrologEnd > 0)&&(__CLR4_4_17gy7gykylve0i1.R.iget(9726)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9727)==0&false))) {{
                    // ok, full XML prolog written: let's extract encoding
                    __CLR4_4_17gy7gykylve0i1.R.inc(9728);final Matcher m = ENCODING_PATTERN.matcher(xmlProlog.substring(0,
                            xmlPrologEnd));
                    __CLR4_4_17gy7gykylve0i1.R.inc(9729);if ((((m.find())&&(__CLR4_4_17gy7gykylve0i1.R.iget(9730)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9731)==0&false))) {{
                        __CLR4_4_17gy7gykylve0i1.R.inc(9732);encoding = m.group(1).toUpperCase(Locale.ROOT);
                        __CLR4_4_17gy7gykylve0i1.R.inc(9733);encoding = encoding.substring(1, encoding.length() - 1);
                    } }else {{
                        // no encoding found in XML prolog: using default
                        // encoding
                        __CLR4_4_17gy7gykylve0i1.R.inc(9734);encoding = defaultEncoding;
                    }
                }} }else {__CLR4_4_17gy7gykylve0i1.R.inc(9735);if ((((xmlProlog.length() >= BUFFER_SIZE)&&(__CLR4_4_17gy7gykylve0i1.R.iget(9736)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9737)==0&false))) {{
                    // no encoding found in first characters: using default
                    // encoding
                    __CLR4_4_17gy7gykylve0i1.R.inc(9738);encoding = defaultEncoding;
                }
            }}} }else {{
                // no XML prolog: using default encoding
                __CLR4_4_17gy7gykylve0i1.R.inc(9739);encoding = defaultEncoding;
            }
            }__CLR4_4_17gy7gykylve0i1.R.inc(9740);if ((((encoding != null)&&(__CLR4_4_17gy7gykylve0i1.R.iget(9741)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9742)==0&false))) {{
                // encoding has been chosen: let's do it
                __CLR4_4_17gy7gykylve0i1.R.inc(9743);xmlPrologWriter = null;
                __CLR4_4_17gy7gykylve0i1.R.inc(9744);writer = new OutputStreamWriter(out, encoding);
                __CLR4_4_17gy7gykylve0i1.R.inc(9745);writer.write(xmlProlog.toString());
                __CLR4_4_17gy7gykylve0i1.R.inc(9746);if ((((len > size)&&(__CLR4_4_17gy7gykylve0i1.R.iget(9747)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9748)==0&false))) {{
                    __CLR4_4_17gy7gykylve0i1.R.inc(9749);writer.write(cbuf, off + size, len - size);
                }
            }}
        }}
    }}finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    /**
     * Writes the characters to the underlying writer, detecting encoding.
     *
     * @param cbuf the buffer to write the characters from
     * @param off The start offset
     * @param len The number of characters to write
     * @throws IOException if an error occurs detecting the encoding
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_17gy7gykylve0i1.R.inc(9750);
        __CLR4_4_17gy7gykylve0i1.R.inc(9751);if ((((xmlPrologWriter != null)&&(__CLR4_4_17gy7gykylve0i1.R.iget(9752)!=0|true))||(__CLR4_4_17gy7gykylve0i1.R.iget(9753)==0&false))) {{
            __CLR4_4_17gy7gykylve0i1.R.inc(9754);detectEncoding(cbuf, off, len);
        } }else {{
            __CLR4_4_17gy7gykylve0i1.R.inc(9755);writer.write(cbuf, off, len);
        }
    }}finally{__CLR4_4_17gy7gykylve0i1.R.flushNeeded();}}

    static final Pattern ENCODING_PATTERN = XmlStreamReader.ENCODING_PATTERN;
}
