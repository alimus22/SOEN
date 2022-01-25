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
package org.apache.commons.io.input.compatibility;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.XmlStreamWriter;

/**
 * Character stream that handles all the necessary Voodoo to figure out the
 * charset encoding of the XML document within the stream.
 * <p>
 * IMPORTANT: This class is not related in any way to the org.xml.sax.XMLReader.
 * This one IS a character stream.
 * </p>
 * <p>
 * All this has to be done without consuming characters from the stream, if not
 * the XML parser will not recognized the document as a valid XML. This is not
 * 100% true, but it's close enough (UTF-8 BOM is not handled by all parsers
 * right now, XmlStreamReader handles it and things work in all parsers).
 * </p>
 * <p>
 * The XmlStreamReader class handles the charset encoding of XML documents in
 * Files, raw streams and HTTP streams by offering a wide set of constructors.
 * </p>
 * <p>
 * By default the charset encoding detection is lenient, the constructor with
 * the lenient flag can be used for a script (following HTTP MIME and XML
 * specifications). All this is nicely explained by Mark Pilgrim in his blog, <a
 * href="http://diveintomark.org/archives/2004/02/13/xml-media-types">
 * Determining the character encoding of a feed</a>.
 * </p>
 * <p>
 * Originally developed for <a href="http://rome.dev.java.net">ROME</a> under
 * Apache License 2.0.
 * </p>
 *
 * @see XmlStreamWriter
 */
public class XmlStreamReader extends Reader {public static class __CLR4_4_1ireirekylve3cj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,24654,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String UTF_8 = "UTF-8";

    private static final String US_ASCII = "US-ASCII";

    private static final String UTF_16BE = "UTF-16BE";

    private static final String UTF_16LE = "UTF-16LE";

    private static final String UTF_16 = "UTF-16";

    private static final String UTF_32BE = "UTF-32BE";

    private static final String UTF_32LE = "UTF-32LE";

    private static final String UTF_32 = "UTF-32";

    private static final String EBCDIC = "CP1047";

    private static String staticDefaultEncoding;

    private Reader reader;

    private String encoding;

    private final String defaultEncoding;

    /**
     * Sets the default encoding to use if none is set in HTTP content-type, XML
     * prolog and the rules based on content-type are not adequate.
     * <p>
     * If it is set to NULL the content-type based rules are used.
     * <p>
     * By default it is NULL.
     *
     * @param encoding charset encoding to default to.
     */
    public static void setDefaultEncoding(final String encoding) {try{__CLR4_4_1ireirekylve3cj.R.inc(24314);
        __CLR4_4_1ireirekylve3cj.R.inc(24315);staticDefaultEncoding = encoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Returns the default encoding to use if none is set in HTTP content-type,
     * XML prolog and the rules based on content-type are not adequate.
     * <p>
     * If it is NULL the content-type based rules are used.
     *
     * @return the default encoding to use.
     */
    public static String getDefaultEncoding() {try{__CLR4_4_1ireirekylve3cj.R.inc(24316);
        __CLR4_4_1ireirekylve3cj.R.inc(24317);return staticDefaultEncoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Creates a Reader for a File.
     * <p>
     * It looks for the UTF-8 BOM first, if none sniffs the XML prolog charset,
     * if this is also missing defaults to UTF-8.
     * <p>
     * It does a lenient charset encoding detection, check the constructor with
     * the lenient parameter for details.
     *
     * @param file File to create a Reader from.
     * @throws IOException thrown if there is a problem reading the file.
     */
    @SuppressWarnings("resource") // FileInputStream is closed when this closed when this object is closed.
    public XmlStreamReader(final File file) throws IOException {
        this(Files.newInputStream(file.toPath()));__CLR4_4_1ireirekylve3cj.R.inc(24319);try{__CLR4_4_1ireirekylve3cj.R.inc(24318);
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Creates a Reader for a raw InputStream.
     * <p>
     * It follows the same logic used for files.
     * <p>
     * It does a lenient charset encoding detection, check the constructor with
     * the lenient parameter for details.
     *
     * @param inputStream InputStream to create a Reader from.
     * @throws IOException thrown if there is a problem reading the stream.
     */
    public XmlStreamReader(final InputStream inputStream) throws IOException {
        this(inputStream, true);__CLR4_4_1ireirekylve3cj.R.inc(24321);try{__CLR4_4_1ireirekylve3cj.R.inc(24320);
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Creates a Reader for a raw InputStream.
     * <p>
     * It follows the same logic used for files.
     * <p>
     * If lenient detection is indicated and the detection above fails as per
     * specifications it then attempts the following:
     * <p>
     * If the content type was 'text/html' it replaces it with 'text/xml' and
     * tries the detection again.
     * <p>
     * Else if the XML prolog had a charset encoding that encoding is used.
     * <p>
     * Else if the content type had a charset encoding that encoding is used.
     * <p>
     * Else 'UTF-8' is used.
     * <p>
     * If lenient detection is indicated an XmlStreamReaderException is never
     * thrown.
     *
     * @param inputStream InputStream to create a Reader from.
     * @param lenient indicates if the charset encoding detection should be
     *        relaxed.
     * @throws IOException thrown if there is a problem reading the stream.
     * @throws XmlStreamReaderException thrown if the charset encoding could not
     *         be determined according to the specs.
     */
    public XmlStreamReader(final InputStream inputStream, final boolean lenient) throws IOException,
            XmlStreamReaderException {try{__CLR4_4_1ireirekylve3cj.R.inc(24322);
        __CLR4_4_1ireirekylve3cj.R.inc(24323);defaultEncoding = staticDefaultEncoding;
        __CLR4_4_1ireirekylve3cj.R.inc(24324);try {
            __CLR4_4_1ireirekylve3cj.R.inc(24325);doRawStream(inputStream);
        } catch (final XmlStreamReaderException ex) {
            __CLR4_4_1ireirekylve3cj.R.inc(24326);if ((((!lenient)&&(__CLR4_4_1ireirekylve3cj.R.iget(24327)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24328)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24329);throw ex;
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24330);doLenientDetection(null, ex);
        }
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Creates a Reader using the InputStream of a URL.
     * <p>
     * If the URL is not of type HTTP and there is not 'content-type' header in
     * the fetched data it uses the same logic used for Files.
     * <p>
     * If the URL is a HTTP Url or there is a 'content-type' header in the
     * fetched data it uses the same logic used for an InputStream with
     * content-type.
     * <p>
     * It does a lenient charset encoding detection, check the constructor with
     * the lenient parameter for details.
     *
     * @param url URL to create a Reader from.
     * @throws IOException thrown if there is a problem reading the stream of
     *         the URL.
     */
    public XmlStreamReader(final URL url) throws IOException {
        this(url.openConnection());__CLR4_4_1ireirekylve3cj.R.inc(24332);try{__CLR4_4_1ireirekylve3cj.R.inc(24331);
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Creates a Reader using the InputStream of a URLConnection.
     * <p>
     * If the URLConnection is not of type HttpURLConnection and there is not
     * 'content-type' header in the fetched data it uses the same logic used for
     * files.
     * <p>
     * If the URLConnection is a HTTP Url or there is a 'content-type' header in
     * the fetched data it uses the same logic used for an InputStream with
     * content-type.
     * <p>
     * It does a lenient charset encoding detection, check the constructor with
     * the lenient parameter for details.
     *
     * @param conn URLConnection to create a Reader from.
     * @throws IOException thrown if there is a problem reading the stream of
     *         the URLConnection.
     */
    public XmlStreamReader(final URLConnection conn) throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24333);
        __CLR4_4_1ireirekylve3cj.R.inc(24334);defaultEncoding = staticDefaultEncoding;
        __CLR4_4_1ireirekylve3cj.R.inc(24335);final boolean lenient = true;
        __CLR4_4_1ireirekylve3cj.R.inc(24336);if ((((conn instanceof HttpURLConnection)&&(__CLR4_4_1ireirekylve3cj.R.iget(24337)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24338)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24339);try {
                __CLR4_4_1ireirekylve3cj.R.inc(24340);doHttpStream(conn.getInputStream(), conn.getContentType(),
                        lenient);
            } catch (final XmlStreamReaderException ex) {
                __CLR4_4_1ireirekylve3cj.R.inc(24341);doLenientDetection(conn.getContentType(), ex);
            }
        } }else {__CLR4_4_1ireirekylve3cj.R.inc(24342);if ((((conn.getContentType() != null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24343)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24344)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24345);try {
                __CLR4_4_1ireirekylve3cj.R.inc(24346);doHttpStream(conn.getInputStream(), conn.getContentType(),
                        lenient);
            } catch (final XmlStreamReaderException ex) {
                __CLR4_4_1ireirekylve3cj.R.inc(24347);doLenientDetection(conn.getContentType(), ex);
            }
        } }else {{
            __CLR4_4_1ireirekylve3cj.R.inc(24348);try {
                __CLR4_4_1ireirekylve3cj.R.inc(24349);doRawStream(conn.getInputStream());
            } catch (final XmlStreamReaderException ex) {
                __CLR4_4_1ireirekylve3cj.R.inc(24350);doLenientDetection(null, ex);
            }
        }
    }}}finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Creates a Reader using an InputStream and the associated content-type
     * header.
     * <p>
     * First it checks if the stream has BOM. If there is not BOM checks the
     * content-type encoding. If there is not content-type encoding checks the
     * XML prolog encoding. If there is not XML prolog encoding uses the default
     * encoding mandated by the content-type MIME type.
     * <p>
     * It does a lenient charset encoding detection, check the constructor with
     * the lenient parameter for details.
     *
     * @param inputStream InputStream to create the reader from.
     * @param httpContentType content-type header to use for the resolution of
     *        the charset encoding.
     * @throws IOException thrown if there is a problem reading the file.
     */
    public XmlStreamReader(final InputStream inputStream, final String httpContentType)
            throws IOException {
        this(inputStream, httpContentType, true);__CLR4_4_1ireirekylve3cj.R.inc(24352);try{__CLR4_4_1ireirekylve3cj.R.inc(24351);
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Creates a Reader using an InputStream and the associated content-type
     * header. This constructor is lenient regarding the encoding detection.
     * <p>
     * First it checks if the stream has BOM. If there is not BOM checks the
     * content-type encoding. If there is not content-type encoding checks the
     * XML prolog encoding. If there is not XML prolog encoding uses the default
     * encoding mandated by the content-type MIME type.
     * <p>
     * If lenient detection is indicated and the detection above fails as per
     * specifications it then attempts the following:
     * <p>
     * If the content type was 'text/html' it replaces it with 'text/xml' and
     * tries the detection again.
     * <p>
     * Else if the XML prolog had a charset encoding that encoding is used.
     * <p>
     * Else if the content type had a charset encoding that encoding is used.
     * <p>
     * Else 'UTF-8' is used.
     * <p>
     * If lenient detection is indicated an XmlStreamReaderException is never
     * thrown.
     *
     * @param inputStream InputStream to create the reader from.
     * @param httpContentType content-type header to use for the resolution of
     *        the charset encoding.
     * @param lenient indicates if the charset encoding detection should be
     *        relaxed.
     * @param defaultEncoding the default encoding to use
     * @throws IOException thrown if there is a problem reading the file.
     * @throws XmlStreamReaderException thrown if the charset encoding could not
     *         be determined according to the specs.
     */
    public XmlStreamReader(final InputStream inputStream, final String httpContentType,
            final boolean lenient, final String defaultEncoding) throws IOException,
            XmlStreamReaderException {try{__CLR4_4_1ireirekylve3cj.R.inc(24353);
        __CLR4_4_1ireirekylve3cj.R.inc(24354);this.defaultEncoding = (((defaultEncoding == null )&&(__CLR4_4_1ireirekylve3cj.R.iget(24355)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24356)==0&false))? staticDefaultEncoding
                : defaultEncoding;
        __CLR4_4_1ireirekylve3cj.R.inc(24357);try {
            __CLR4_4_1ireirekylve3cj.R.inc(24358);doHttpStream(inputStream, httpContentType, lenient);
        } catch (final XmlStreamReaderException ex) {
            __CLR4_4_1ireirekylve3cj.R.inc(24359);if ((((!lenient)&&(__CLR4_4_1ireirekylve3cj.R.iget(24360)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24361)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24362);throw ex;
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24363);doLenientDetection(httpContentType, ex);
        }
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Creates a Reader using an InputStream and the associated content-type
     * header. This constructor is lenient regarding the encoding detection.
     * <p>
     * First it checks if the stream has BOM. If there is not BOM checks the
     * content-type encoding. If there is not content-type encoding checks the
     * XML prolog encoding. If there is not XML prolog encoding uses the default
     * encoding mandated by the content-type MIME type.
     * <p>
     * If lenient detection is indicated and the detection above fails as per
     * specifications it then attempts the following:
     * <p>
     * If the content type was 'text/html' it replaces it with 'text/xml' and
     * tries the detection again.
     * <p>
     * Else if the XML prolog had a charset encoding that encoding is used.
     * <p>
     * Else if the content type had a charset encoding that encoding is used.
     * <p>
     * Else 'UTF-8' is used.
     * <p>
     * If lenient detection is indicated an XmlStreamReaderException is never
     * thrown.
     *
     * @param inputStream InputStream to create the reader from.
     * @param httpContentType content-type header to use for the resolution of
     *        the charset encoding.
     * @param lenient indicates if the charset encoding detection should be
     *        relaxed.
     * @throws IOException thrown if there is a problem reading the file.
     * @throws XmlStreamReaderException thrown if the charset encoding could not
     *         be determined according to the specs.
     */
    public XmlStreamReader(final InputStream inputStream, final String httpContentType,
            final boolean lenient) throws IOException, XmlStreamReaderException {
        this(inputStream, httpContentType, lenient, null);__CLR4_4_1ireirekylve3cj.R.inc(24365);try{__CLR4_4_1ireirekylve3cj.R.inc(24364);
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    private void doLenientDetection(String httpContentType,
            XmlStreamReaderException ex) throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24366);
        __CLR4_4_1ireirekylve3cj.R.inc(24367);if (((((httpContentType != null) && httpContentType.startsWith("text/html"))&&(__CLR4_4_1ireirekylve3cj.R.iget(24368)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24369)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24370);httpContentType = httpContentType.substring("text/html"
                    .length());
            __CLR4_4_1ireirekylve3cj.R.inc(24371);httpContentType = "text/xml" + httpContentType;
            __CLR4_4_1ireirekylve3cj.R.inc(24372);try {
                __CLR4_4_1ireirekylve3cj.R.inc(24373);doHttpStream(ex.getInputStream(), httpContentType, true);
                __CLR4_4_1ireirekylve3cj.R.inc(24374);ex = null;
            } catch (final XmlStreamReaderException ex2) {
                __CLR4_4_1ireirekylve3cj.R.inc(24375);ex = ex2;
            }
        }
        }__CLR4_4_1ireirekylve3cj.R.inc(24376);if ((((ex != null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24377)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24378)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24379);String encoding = ex.getXmlEncoding();
            __CLR4_4_1ireirekylve3cj.R.inc(24380);if ((((encoding == null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24381)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24382)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24383);encoding = ex.getContentTypeEncoding();
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24384);if ((((encoding == null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24385)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24386)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24387);encoding = (((defaultEncoding == null )&&(__CLR4_4_1ireirekylve3cj.R.iget(24388)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24389)==0&false))? UTF_8 : defaultEncoding;
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24390);prepareReader(ex.getInputStream(), encoding);
        }
    }}finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Returns the charset encoding of the XmlStreamReader.
     *
     * @return charset encoding.
     */
    public String getEncoding() {try{__CLR4_4_1ireirekylve3cj.R.inc(24391);
        __CLR4_4_1ireirekylve3cj.R.inc(24392);return encoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    @Override
    public int read(final char[] buf, final int offset, final int len) throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24393);
        __CLR4_4_1ireirekylve3cj.R.inc(24394);return reader.read(buf, offset, len);
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    /**
     * Closes the XmlStreamReader stream.
     *
     * @throws IOException thrown if there was a problem closing the stream.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24395);
        __CLR4_4_1ireirekylve3cj.R.inc(24396);reader.close();
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    private void doRawStream(final InputStream inputStream)
            throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24397);
        __CLR4_4_1ireirekylve3cj.R.inc(24398);final BufferedInputStream pis = new BufferedInputStream(inputStream, IOUtils.DEFAULT_BUFFER_SIZE);
        __CLR4_4_1ireirekylve3cj.R.inc(24399);final String bomEnc = getBOMEncoding(pis);
        __CLR4_4_1ireirekylve3cj.R.inc(24400);final String xmlGuessEnc = getXMLGuessEncoding(pis);
        __CLR4_4_1ireirekylve3cj.R.inc(24401);final String xmlEnc = getXmlProlog(pis, xmlGuessEnc);
        __CLR4_4_1ireirekylve3cj.R.inc(24402);final String encoding = calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc, pis);
        __CLR4_4_1ireirekylve3cj.R.inc(24403);prepareReader(pis, encoding);
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    private void doHttpStream(final InputStream inputStream, final String httpContentType,
            final boolean lenient) throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24404);
        __CLR4_4_1ireirekylve3cj.R.inc(24405);final BufferedInputStream pis = new BufferedInputStream(inputStream, IOUtils.DEFAULT_BUFFER_SIZE);
        __CLR4_4_1ireirekylve3cj.R.inc(24406);final String cTMime = getContentTypeMime(httpContentType);
        __CLR4_4_1ireirekylve3cj.R.inc(24407);final String cTEnc = getContentTypeEncoding(httpContentType);
        __CLR4_4_1ireirekylve3cj.R.inc(24408);final String bomEnc = getBOMEncoding(pis);
        __CLR4_4_1ireirekylve3cj.R.inc(24409);final String xmlGuessEnc = getXMLGuessEncoding(pis);
        __CLR4_4_1ireirekylve3cj.R.inc(24410);final String xmlEnc = getXmlProlog(pis, xmlGuessEnc);
        __CLR4_4_1ireirekylve3cj.R.inc(24411);final String encoding = calculateHttpEncoding(cTMime, cTEnc, bomEnc,
                xmlGuessEnc, xmlEnc, pis, lenient);
        __CLR4_4_1ireirekylve3cj.R.inc(24412);prepareReader(pis, encoding);
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    private void prepareReader(final InputStream inputStream, final String encoding)
            throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24413);
        __CLR4_4_1ireirekylve3cj.R.inc(24414);reader = new InputStreamReader(inputStream, encoding);
        __CLR4_4_1ireirekylve3cj.R.inc(24415);this.encoding = encoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    // InputStream is passed for XmlStreamReaderException creation only
    String calculateRawEncoding(final String bomEnc, final String xmlGuessEnc,
            final String xmlEnc, final InputStream is) throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24416);
        __CLR4_4_1ireirekylve3cj.R.inc(24417);final String encoding;
        __CLR4_4_1ireirekylve3cj.R.inc(24418);if ((((bomEnc == null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24419)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24420)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24421);if ((((xmlGuessEnc == null || xmlEnc == null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24422)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24423)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24424);encoding = (((defaultEncoding == null )&&(__CLR4_4_1ireirekylve3cj.R.iget(24425)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24426)==0&false))? UTF_8 : defaultEncoding;
            } }else {__CLR4_4_1ireirekylve3cj.R.inc(24427);if ((((xmlEnc.equals(UTF_16)
                    && (xmlGuessEnc.equals(UTF_16BE) || xmlGuessEnc
                            .equals(UTF_16LE)))&&(__CLR4_4_1ireirekylve3cj.R.iget(24428)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24429)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24430);encoding = xmlGuessEnc;
            } }else {__CLR4_4_1ireirekylve3cj.R.inc(24431);if ((((xmlEnc.equals(UTF_32)
                    && (xmlGuessEnc.equals(UTF_32BE) || xmlGuessEnc
                            .equals(UTF_32LE)))&&(__CLR4_4_1ireirekylve3cj.R.iget(24432)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24433)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24434);encoding = xmlGuessEnc;
            } }else {{
                __CLR4_4_1ireirekylve3cj.R.inc(24435);encoding = xmlEnc;
            }
        }}}} }else {__CLR4_4_1ireirekylve3cj.R.inc(24436);if ((((bomEnc.equals(UTF_8))&&(__CLR4_4_1ireirekylve3cj.R.iget(24437)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24438)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24439);if ((((xmlGuessEnc != null && !xmlGuessEnc.equals(UTF_8))&&(__CLR4_4_1ireirekylve3cj.R.iget(24440)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24441)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24442);throw new XmlStreamReaderException(RAW_EX_1
                        .format(new Object[] { bomEnc, xmlGuessEnc, xmlEnc }),
                        bomEnc, xmlGuessEnc, xmlEnc, is);
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24443);if ((((xmlEnc != null && !xmlEnc.equals(UTF_8))&&(__CLR4_4_1ireirekylve3cj.R.iget(24444)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24445)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24446);throw new XmlStreamReaderException(RAW_EX_1
                        .format(new Object[] { bomEnc, xmlGuessEnc, xmlEnc }),
                        bomEnc, xmlGuessEnc, xmlEnc, is);
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24447);encoding = UTF_8;
        } }else {__CLR4_4_1ireirekylve3cj.R.inc(24448);if ((((bomEnc.equals(UTF_16BE) || bomEnc.equals(UTF_16LE))&&(__CLR4_4_1ireirekylve3cj.R.iget(24449)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24450)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24451);if ((((xmlGuessEnc != null && !xmlGuessEnc.equals(bomEnc))&&(__CLR4_4_1ireirekylve3cj.R.iget(24452)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24453)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24454);throw new XmlStreamReaderException(RAW_EX_1.format(new Object[] { bomEnc,
                        xmlGuessEnc, xmlEnc }), bomEnc, xmlGuessEnc, xmlEnc, is);
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24455);if ((((xmlEnc != null && !xmlEnc.equals(UTF_16)
                    && !xmlEnc.equals(bomEnc))&&(__CLR4_4_1ireirekylve3cj.R.iget(24456)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24457)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24458);throw new XmlStreamReaderException(RAW_EX_1
                        .format(new Object[] { bomEnc, xmlGuessEnc, xmlEnc }),
                        bomEnc, xmlGuessEnc, xmlEnc, is);
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24459);encoding = bomEnc;
        } }else {__CLR4_4_1ireirekylve3cj.R.inc(24460);if ((((bomEnc.equals(UTF_32BE) || bomEnc.equals(UTF_32LE))&&(__CLR4_4_1ireirekylve3cj.R.iget(24461)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24462)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24463);if ((((xmlGuessEnc != null && !xmlGuessEnc.equals(bomEnc))&&(__CLR4_4_1ireirekylve3cj.R.iget(24464)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24465)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24466);throw new XmlStreamReaderException(RAW_EX_1.format(new Object[] { bomEnc,
                        xmlGuessEnc, xmlEnc }), bomEnc, xmlGuessEnc, xmlEnc, is);
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24467);if ((((xmlEnc != null && !xmlEnc.equals(UTF_32)
                    && !xmlEnc.equals(bomEnc))&&(__CLR4_4_1ireirekylve3cj.R.iget(24468)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24469)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24470);throw new XmlStreamReaderException(RAW_EX_1
                        .format(new Object[] { bomEnc, xmlGuessEnc, xmlEnc }),
                        bomEnc, xmlGuessEnc, xmlEnc, is);
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24471);encoding = bomEnc;
        } }else {{
            __CLR4_4_1ireirekylve3cj.R.inc(24472);throw new XmlStreamReaderException(RAW_EX_2.format(new Object[] {
                    bomEnc, xmlGuessEnc, xmlEnc }), bomEnc, xmlGuessEnc,
                    xmlEnc, is);
        }
        }}}}__CLR4_4_1ireirekylve3cj.R.inc(24473);return encoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    // InputStream is passed for XmlStreamReaderException creation only
    String calculateHttpEncoding(final String cTMime, final String cTEnc,
            final String bomEnc, final String xmlGuessEnc, final String xmlEnc, final InputStream is,
            final boolean lenient) throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24474);
        __CLR4_4_1ireirekylve3cj.R.inc(24475);final String encoding;
        __CLR4_4_1ireirekylve3cj.R.inc(24476);if ((((lenient && (xmlEnc != null))&&(__CLR4_4_1ireirekylve3cj.R.iget(24477)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24478)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24479);encoding = xmlEnc;
        } }else {{
            __CLR4_4_1ireirekylve3cj.R.inc(24480);final boolean appXml = isAppXml(cTMime);
            __CLR4_4_1ireirekylve3cj.R.inc(24481);final boolean textXml = isTextXml(cTMime);
            __CLR4_4_1ireirekylve3cj.R.inc(24482);if ((((!appXml && !textXml)&&(__CLR4_4_1ireirekylve3cj.R.iget(24483)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24484)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24485);throw new XmlStreamReaderException(HTTP_EX_3
                        .format(new Object[] { cTMime, cTEnc, bomEnc,
                                xmlGuessEnc, xmlEnc }), cTMime, cTEnc, bomEnc,
                        xmlGuessEnc, xmlEnc, is);
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24486);if ((((cTEnc == null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24487)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24488)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24489);if ((((appXml)&&(__CLR4_4_1ireirekylve3cj.R.iget(24490)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24491)==0&false))) {{
                    __CLR4_4_1ireirekylve3cj.R.inc(24492);encoding = calculateRawEncoding(bomEnc, xmlGuessEnc,
                            xmlEnc, is);
                } }else {{
                    __CLR4_4_1ireirekylve3cj.R.inc(24493);encoding = (((defaultEncoding == null )&&(__CLR4_4_1ireirekylve3cj.R.iget(24494)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24495)==0&false))? US_ASCII
                            : defaultEncoding;
                }
            }} }else {__CLR4_4_1ireirekylve3cj.R.inc(24496);if ((((bomEnc != null
                    && (cTEnc.equals(UTF_16BE) || cTEnc.equals(UTF_16LE)))&&(__CLR4_4_1ireirekylve3cj.R.iget(24497)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24498)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24499);throw new XmlStreamReaderException(HTTP_EX_1
                        .format(new Object[] { cTMime, cTEnc, bomEnc,
                                xmlGuessEnc, xmlEnc }), cTMime, cTEnc,
                        bomEnc, xmlGuessEnc, xmlEnc, is);
            } }else {__CLR4_4_1ireirekylve3cj.R.inc(24500);if ((((cTEnc.equals(UTF_16))&&(__CLR4_4_1ireirekylve3cj.R.iget(24501)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24502)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24503);if (((((bomEnc == null) || !bomEnc.startsWith(UTF_16))&&(__CLR4_4_1ireirekylve3cj.R.iget(24504)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24505)==0&false))) {{
                    __CLR4_4_1ireirekylve3cj.R.inc(24506);throw new XmlStreamReaderException(HTTP_EX_2
                            .format(new Object[] { cTMime, cTEnc, bomEnc,
                                    xmlGuessEnc, xmlEnc }), cTMime, cTEnc,
                            bomEnc, xmlGuessEnc, xmlEnc, is);
                }
                }__CLR4_4_1ireirekylve3cj.R.inc(24507);encoding = bomEnc;
            } }else {__CLR4_4_1ireirekylve3cj.R.inc(24508);if ((((bomEnc != null
                    && (cTEnc.equals(UTF_32BE) || cTEnc.equals(UTF_32LE)))&&(__CLR4_4_1ireirekylve3cj.R.iget(24509)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24510)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24511);throw new XmlStreamReaderException(HTTP_EX_1
                        .format(new Object[] { cTMime, cTEnc, bomEnc,
                                xmlGuessEnc, xmlEnc }), cTMime, cTEnc,
                        bomEnc, xmlGuessEnc, xmlEnc, is);
            } }else {__CLR4_4_1ireirekylve3cj.R.inc(24512);if ((((cTEnc.equals(UTF_32))&&(__CLR4_4_1ireirekylve3cj.R.iget(24513)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24514)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24515);if (((((bomEnc == null) || !bomEnc.startsWith(UTF_32))&&(__CLR4_4_1ireirekylve3cj.R.iget(24516)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24517)==0&false))) {{
                    __CLR4_4_1ireirekylve3cj.R.inc(24518);throw new XmlStreamReaderException(HTTP_EX_2
                            .format(new Object[] { cTMime, cTEnc, bomEnc,
                                    xmlGuessEnc, xmlEnc }), cTMime, cTEnc,
                            bomEnc, xmlGuessEnc, xmlEnc, is);
                }
                }__CLR4_4_1ireirekylve3cj.R.inc(24519);encoding = bomEnc;
            } }else {{
                __CLR4_4_1ireirekylve3cj.R.inc(24520);encoding = cTEnc;
            }
        }}}}}}
        }__CLR4_4_1ireirekylve3cj.R.inc(24521);return encoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    // returns MIME type or NULL if httpContentType is NULL
    static String getContentTypeMime(final String httpContentType) {try{__CLR4_4_1ireirekylve3cj.R.inc(24522);
        __CLR4_4_1ireirekylve3cj.R.inc(24523);String mime = null;
        __CLR4_4_1ireirekylve3cj.R.inc(24524);if ((((httpContentType != null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24525)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24526)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24527);final int i = httpContentType.indexOf(";");
            __CLR4_4_1ireirekylve3cj.R.inc(24528);mime = ((((i == -1 )&&(__CLR4_4_1ireirekylve3cj.R.iget(24529)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24530)==0&false))? httpContentType : httpContentType.substring(0,
                    i)).trim();
        }
        }__CLR4_4_1ireirekylve3cj.R.inc(24531);return mime;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    private static final Pattern CHARSET_PATTERN = Pattern
            .compile("charset=[\"']?([.[^; \"']]*)[\"']?");

    // returns charset parameter value, NULL if not present, NULL if
    // httpContentType is NULL
    static String getContentTypeEncoding(final String httpContentType) {try{__CLR4_4_1ireirekylve3cj.R.inc(24532);
        __CLR4_4_1ireirekylve3cj.R.inc(24533);String encoding = null;
        __CLR4_4_1ireirekylve3cj.R.inc(24534);if ((((httpContentType != null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24535)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24536)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24537);final int i = httpContentType.indexOf(";");
            __CLR4_4_1ireirekylve3cj.R.inc(24538);if ((((i > -1)&&(__CLR4_4_1ireirekylve3cj.R.iget(24539)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24540)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24541);final String postMime = httpContentType.substring(i + 1);
                __CLR4_4_1ireirekylve3cj.R.inc(24542);final Matcher m = CHARSET_PATTERN.matcher(postMime);
                __CLR4_4_1ireirekylve3cj.R.inc(24543);encoding = (((m.find() )&&(__CLR4_4_1ireirekylve3cj.R.iget(24544)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24545)==0&false))? m.group(1) : null;
                __CLR4_4_1ireirekylve3cj.R.inc(24546);encoding = (((encoding != null )&&(__CLR4_4_1ireirekylve3cj.R.iget(24547)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24548)==0&false))? encoding.toUpperCase(Locale.ROOT) : null;
            }
        }}
        }__CLR4_4_1ireirekylve3cj.R.inc(24549);return encoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    // returns the BOM in the stream, NULL if not present,
    // if there was BOM the in the stream it is consumed
    static String getBOMEncoding(final BufferedInputStream is)
            throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24550);
        __CLR4_4_1ireirekylve3cj.R.inc(24551);String encoding = null;
        __CLR4_4_1ireirekylve3cj.R.inc(24552);final int[] bytes = new int[3];
        __CLR4_4_1ireirekylve3cj.R.inc(24553);is.mark(3);
        __CLR4_4_1ireirekylve3cj.R.inc(24554);bytes[0] = is.read();
        __CLR4_4_1ireirekylve3cj.R.inc(24555);bytes[1] = is.read();
        __CLR4_4_1ireirekylve3cj.R.inc(24556);bytes[2] = is.read();

        __CLR4_4_1ireirekylve3cj.R.inc(24557);if ((((bytes[0] == 0xFE && bytes[1] == 0xFF)&&(__CLR4_4_1ireirekylve3cj.R.iget(24558)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24559)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24560);encoding = UTF_16BE;
            __CLR4_4_1ireirekylve3cj.R.inc(24561);is.reset();
            __CLR4_4_1ireirekylve3cj.R.inc(24562);is.read();
            __CLR4_4_1ireirekylve3cj.R.inc(24563);is.read();
        } }else {__CLR4_4_1ireirekylve3cj.R.inc(24564);if ((((bytes[0] == 0xFF && bytes[1] == 0xFE)&&(__CLR4_4_1ireirekylve3cj.R.iget(24565)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24566)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24567);encoding = UTF_16LE;
            __CLR4_4_1ireirekylve3cj.R.inc(24568);is.reset();
            __CLR4_4_1ireirekylve3cj.R.inc(24569);is.read();
            __CLR4_4_1ireirekylve3cj.R.inc(24570);is.read();
        } }else {__CLR4_4_1ireirekylve3cj.R.inc(24571);if ((((bytes[0] == 0xEF && bytes[1] == 0xBB && bytes[2] == 0xBF)&&(__CLR4_4_1ireirekylve3cj.R.iget(24572)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24573)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24574);encoding = UTF_8;
        } }else {{
            __CLR4_4_1ireirekylve3cj.R.inc(24575);is.reset();
        }
        }}}__CLR4_4_1ireirekylve3cj.R.inc(24576);return encoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    // returns the best guess for the encoding by looking the first bytes of the
    // stream, '<?'
    private static String getXMLGuessEncoding(final BufferedInputStream is)
            throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24577);
        __CLR4_4_1ireirekylve3cj.R.inc(24578);String encoding = null;
        __CLR4_4_1ireirekylve3cj.R.inc(24579);final int[] bytes = new int[4];
        __CLR4_4_1ireirekylve3cj.R.inc(24580);is.mark(4);
        __CLR4_4_1ireirekylve3cj.R.inc(24581);bytes[0] = is.read();
        __CLR4_4_1ireirekylve3cj.R.inc(24582);bytes[1] = is.read();
        __CLR4_4_1ireirekylve3cj.R.inc(24583);bytes[2] = is.read();
        __CLR4_4_1ireirekylve3cj.R.inc(24584);bytes[3] = is.read();
        __CLR4_4_1ireirekylve3cj.R.inc(24585);is.reset();

        __CLR4_4_1ireirekylve3cj.R.inc(24586);if ((((bytes[0] == 0x00 && bytes[1] == 0x3C && bytes[2] == 0x00
                && bytes[3] == 0x3F)&&(__CLR4_4_1ireirekylve3cj.R.iget(24587)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24588)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24589);encoding = UTF_16BE;
        } }else {__CLR4_4_1ireirekylve3cj.R.inc(24590);if ((((bytes[0] == 0x3C && bytes[1] == 0x00 && bytes[2] == 0x3F
                && bytes[3] == 0x00)&&(__CLR4_4_1ireirekylve3cj.R.iget(24591)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24592)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24593);encoding = UTF_16LE;
        } }else {__CLR4_4_1ireirekylve3cj.R.inc(24594);if ((((bytes[0] == 0x3C && bytes[1] == 0x3F && bytes[2] == 0x78
                && bytes[3] == 0x6D)&&(__CLR4_4_1ireirekylve3cj.R.iget(24595)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24596)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24597);encoding = UTF_8;
        } }else {__CLR4_4_1ireirekylve3cj.R.inc(24598);if ((((bytes[0] == 0x4C && bytes[1] == 0x6F && bytes[2] == 0xA7
                && bytes[3] == 0x94)&&(__CLR4_4_1ireirekylve3cj.R.iget(24599)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24600)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24601);encoding = EBCDIC;
        }
        }}}}__CLR4_4_1ireirekylve3cj.R.inc(24602);return encoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    public static final Pattern ENCODING_PATTERN = Pattern.compile(
            "<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))",
            Pattern.MULTILINE);

    // returns the encoding declared in the <?xml encoding=...?>, NULL if none
    private static String getXmlProlog(final BufferedInputStream is, final String guessedEnc)
            throws IOException {try{__CLR4_4_1ireirekylve3cj.R.inc(24603);
        __CLR4_4_1ireirekylve3cj.R.inc(24604);String encoding = null;
        __CLR4_4_1ireirekylve3cj.R.inc(24605);if ((((guessedEnc != null)&&(__CLR4_4_1ireirekylve3cj.R.iget(24606)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24607)==0&false))) {{
            __CLR4_4_1ireirekylve3cj.R.inc(24608);final byte[] bytes = IOUtils.byteArray();
            __CLR4_4_1ireirekylve3cj.R.inc(24609);is.mark(IOUtils.DEFAULT_BUFFER_SIZE);
            __CLR4_4_1ireirekylve3cj.R.inc(24610);int offset = 0;
            __CLR4_4_1ireirekylve3cj.R.inc(24611);int max = IOUtils.DEFAULT_BUFFER_SIZE;
            __CLR4_4_1ireirekylve3cj.R.inc(24612);int c = is.read(bytes, offset, max);
            __CLR4_4_1ireirekylve3cj.R.inc(24613);int firstGT = -1;
            __CLR4_4_1ireirekylve3cj.R.inc(24614);String xmlProlog = ""; // avoid possible NPE warning (cannot happen; this just silences the warning)
            __CLR4_4_1ireirekylve3cj.R.inc(24615);while ((((c != -1 && firstGT == -1 && offset < IOUtils.DEFAULT_BUFFER_SIZE)&&(__CLR4_4_1ireirekylve3cj.R.iget(24616)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24617)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24618);offset += c;
                __CLR4_4_1ireirekylve3cj.R.inc(24619);max -= c;
                __CLR4_4_1ireirekylve3cj.R.inc(24620);c = is.read(bytes, offset, max);
                __CLR4_4_1ireirekylve3cj.R.inc(24621);xmlProlog = new String(bytes, 0, offset, guessedEnc);
                __CLR4_4_1ireirekylve3cj.R.inc(24622);firstGT = xmlProlog.indexOf('>');
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24623);if ((((firstGT == -1)&&(__CLR4_4_1ireirekylve3cj.R.iget(24624)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24625)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24626);if ((((c == -1)&&(__CLR4_4_1ireirekylve3cj.R.iget(24627)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24628)==0&false))) {{
                    __CLR4_4_1ireirekylve3cj.R.inc(24629);throw new IOException("Unexpected end of XML stream");
                }
                }__CLR4_4_1ireirekylve3cj.R.inc(24630);throw new IOException(
                        "XML prolog or ROOT element not found on first "
                                + offset + " bytes");
            }
            }__CLR4_4_1ireirekylve3cj.R.inc(24631);final int bytesRead = offset;
            __CLR4_4_1ireirekylve3cj.R.inc(24632);if ((((bytesRead > 0)&&(__CLR4_4_1ireirekylve3cj.R.iget(24633)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24634)==0&false))) {{
                __CLR4_4_1ireirekylve3cj.R.inc(24635);is.reset();
                __CLR4_4_1ireirekylve3cj.R.inc(24636);final BufferedReader bReader = new BufferedReader(new StringReader(
                        xmlProlog.substring(0, firstGT + 1)));
                __CLR4_4_1ireirekylve3cj.R.inc(24637);final StringBuffer prolog = new StringBuffer();
                __CLR4_4_1ireirekylve3cj.R.inc(24638);String line;
                __CLR4_4_1ireirekylve3cj.R.inc(24639);while ((line = bReader.readLine()) != null) {{
                    __CLR4_4_1ireirekylve3cj.R.inc(24642);prolog.append(line);
                }
                }__CLR4_4_1ireirekylve3cj.R.inc(24643);final Matcher m = ENCODING_PATTERN.matcher(prolog);
                __CLR4_4_1ireirekylve3cj.R.inc(24644);if ((((m.find())&&(__CLR4_4_1ireirekylve3cj.R.iget(24645)!=0|true))||(__CLR4_4_1ireirekylve3cj.R.iget(24646)==0&false))) {{
                    __CLR4_4_1ireirekylve3cj.R.inc(24647);encoding = m.group(1).toUpperCase(Locale.ROOT);
                    __CLR4_4_1ireirekylve3cj.R.inc(24648);encoding = encoding.substring(1, encoding.length() - 1);
                }
            }}
        }}
        }__CLR4_4_1ireirekylve3cj.R.inc(24649);return encoding;
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    // indicates if the MIME type belongs to the APPLICATION XML family
    static boolean isAppXml(final String mime) {try{__CLR4_4_1ireirekylve3cj.R.inc(24650);
        __CLR4_4_1ireirekylve3cj.R.inc(24651);return mime != null
                && (mime.equals("application/xml")
                        || mime.equals("application/xml-dtd")
                        || mime
                                .equals("application/xml-external-parsed-entity") || mime
                        .startsWith("application/") && mime.endsWith("+xml"));
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    // indicates if the MIME type belongs to the TEXT XML family
    static boolean isTextXml(final String mime) {try{__CLR4_4_1ireirekylve3cj.R.inc(24652);
        __CLR4_4_1ireirekylve3cj.R.inc(24653);return mime != null
                && (mime.equals("text/xml")
                        || mime.equals("text/xml-external-parsed-entity") || mime
                        .startsWith("text/") && mime.endsWith("+xml"));
    }finally{__CLR4_4_1ireirekylve3cj.R.flushNeeded();}}

    private static final MessageFormat RAW_EX_1 = new MessageFormat(
            "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch");

    private static final MessageFormat RAW_EX_2 = new MessageFormat(
            "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM");

    private static final MessageFormat HTTP_EX_1 = new MessageFormat(
            "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL");

    private static final MessageFormat HTTP_EX_2 = new MessageFormat(
            "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch");

    private static final MessageFormat HTTP_EX_3 = new MessageFormat(
            "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME");

}
