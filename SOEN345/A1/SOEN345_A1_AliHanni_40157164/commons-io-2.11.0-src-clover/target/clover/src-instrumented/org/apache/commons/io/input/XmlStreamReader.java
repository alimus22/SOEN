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
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.IOUtils;

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
 * @see org.apache.commons.io.output.XmlStreamWriter
 * @since 2.0
 */
public class XmlStreamReader extends Reader {public static class __CLR4_4_15x55x5kylve04g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,7968,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String UTF_8 = "UTF-8";

    private static final String US_ASCII = "US-ASCII";

    private static final String UTF_16BE = "UTF-16BE";

    private static final String UTF_16LE = "UTF-16LE";

    private static final String UTF_32BE = "UTF-32BE";

    private static final String UTF_32LE = "UTF-32LE";

    private static final String UTF_16 = "UTF-16";

    private static final String UTF_32 = "UTF-32";

    private static final String EBCDIC = "CP1047";

    private static final ByteOrderMark[] BOMS = {
        ByteOrderMark.UTF_8,
        ByteOrderMark.UTF_16BE,
        ByteOrderMark.UTF_16LE,
        ByteOrderMark.UTF_32BE,
        ByteOrderMark.UTF_32LE
    };

    // UTF_16LE and UTF_32LE have the same two starting BOM bytes.
    private static final ByteOrderMark[] XML_GUESS_BYTES = {
        new ByteOrderMark(UTF_8,    0x3C, 0x3F, 0x78, 0x6D),
        new ByteOrderMark(UTF_16BE, 0x00, 0x3C, 0x00, 0x3F),
        new ByteOrderMark(UTF_16LE, 0x3C, 0x00, 0x3F, 0x00),
        new ByteOrderMark(UTF_32BE, 0x00, 0x00, 0x00, 0x3C,
                0x00, 0x00, 0x00, 0x3F, 0x00, 0x00, 0x00, 0x78, 0x00, 0x00, 0x00, 0x6D),
        new ByteOrderMark(UTF_32LE, 0x3C, 0x00, 0x00, 0x00,
                0x3F, 0x00, 0x00, 0x00, 0x78, 0x00, 0x00, 0x00, 0x6D, 0x00, 0x00, 0x00),
        new ByteOrderMark(EBCDIC,   0x4C, 0x6F, 0xA7, 0x94)
    };

    private static final Pattern CHARSET_PATTERN = Pattern
            .compile("charset=[\"']?([.[^; \"']]*)[\"']?");

    /**
     * Pattern capturing the encoding of the "xml" processing instruction.
     */
    public static final Pattern ENCODING_PATTERN = Pattern.compile(
            "<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))",
            Pattern.MULTILINE);

    private static final String RAW_EX_1 =
        "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";

    private static final String RAW_EX_2 =
        "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";

    private static final String HTTP_EX_1 =
        "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";

    private static final String HTTP_EX_2 =
        "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";

    private static final String HTTP_EX_3 =
        "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";

    /**
     * Returns charset parameter value, NULL if not present, NULL if
     * httpContentType is NULL.
     *
     * @param httpContentType the HTTP content type
     * @return The content type encoding (upcased)
     */
    static String getContentTypeEncoding(final String httpContentType) {try{__CLR4_4_15x55x5kylve04g.R.inc(7673);
        __CLR4_4_15x55x5kylve04g.R.inc(7674);String encoding = null;
        __CLR4_4_15x55x5kylve04g.R.inc(7675);if ((((httpContentType != null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7676)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7677)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7678);final int i = httpContentType.indexOf(";");
            __CLR4_4_15x55x5kylve04g.R.inc(7679);if ((((i > -1)&&(__CLR4_4_15x55x5kylve04g.R.iget(7680)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7681)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7682);final String postMime = httpContentType.substring(i + 1);
                __CLR4_4_15x55x5kylve04g.R.inc(7683);final Matcher m = CHARSET_PATTERN.matcher(postMime);
                __CLR4_4_15x55x5kylve04g.R.inc(7684);encoding = (((m.find() )&&(__CLR4_4_15x55x5kylve04g.R.iget(7685)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7686)==0&false))? m.group(1) : null;
                __CLR4_4_15x55x5kylve04g.R.inc(7687);encoding = (((encoding != null )&&(__CLR4_4_15x55x5kylve04g.R.iget(7688)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7689)==0&false))? encoding.toUpperCase(Locale.ROOT) : null;
            }
        }}
        }__CLR4_4_15x55x5kylve04g.R.inc(7690);return encoding;
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Returns MIME type or NULL if httpContentType is NULL.
     *
     * @param httpContentType the HTTP content type
     * @return The mime content type
     */
    static String getContentTypeMime(final String httpContentType) {try{__CLR4_4_15x55x5kylve04g.R.inc(7691);
        __CLR4_4_15x55x5kylve04g.R.inc(7692);String mime = null;
        __CLR4_4_15x55x5kylve04g.R.inc(7693);if ((((httpContentType != null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7694)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7695)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7696);final int i = httpContentType.indexOf(";");
            __CLR4_4_15x55x5kylve04g.R.inc(7697);if ((((i >= 0)&&(__CLR4_4_15x55x5kylve04g.R.iget(7698)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7699)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7700);mime = httpContentType.substring(0, i);
            } }else {{
                __CLR4_4_15x55x5kylve04g.R.inc(7701);mime = httpContentType;
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7702);mime = mime.trim();
        }
        }__CLR4_4_15x55x5kylve04g.R.inc(7703);return mime;
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Returns the encoding declared in the <?xml encoding=...?>, NULL if none.
     *
     * @param inputStream InputStream to create the reader from.
     * @param guessedEnc guessed encoding
     * @return the encoding declared in the <?xml encoding=...?>
     * @throws IOException thrown if there is a problem reading the stream.
     */
    private static String getXmlProlog(final InputStream inputStream, final String guessedEnc)
            throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7704);
        __CLR4_4_15x55x5kylve04g.R.inc(7705);String encoding = null;
        __CLR4_4_15x55x5kylve04g.R.inc(7706);if ((((guessedEnc != null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7707)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7708)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7709);final byte[] bytes = IOUtils.byteArray();
            __CLR4_4_15x55x5kylve04g.R.inc(7710);inputStream.mark(IOUtils.DEFAULT_BUFFER_SIZE);
            __CLR4_4_15x55x5kylve04g.R.inc(7711);int offset = 0;
            __CLR4_4_15x55x5kylve04g.R.inc(7712);int max = IOUtils.DEFAULT_BUFFER_SIZE;
            __CLR4_4_15x55x5kylve04g.R.inc(7713);int c = inputStream.read(bytes, offset, max);
            __CLR4_4_15x55x5kylve04g.R.inc(7714);int firstGT = -1;
            __CLR4_4_15x55x5kylve04g.R.inc(7715);String xmlProlog = ""; // avoid possible NPE warning (cannot happen; this just silences the warning)
            __CLR4_4_15x55x5kylve04g.R.inc(7716);while ((((c != -1 && firstGT == -1 && offset < IOUtils.DEFAULT_BUFFER_SIZE)&&(__CLR4_4_15x55x5kylve04g.R.iget(7717)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7718)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7719);offset += c;
                __CLR4_4_15x55x5kylve04g.R.inc(7720);max -= c;
                __CLR4_4_15x55x5kylve04g.R.inc(7721);c = inputStream.read(bytes, offset, max);
                __CLR4_4_15x55x5kylve04g.R.inc(7722);xmlProlog = new String(bytes, 0, offset, guessedEnc);
                __CLR4_4_15x55x5kylve04g.R.inc(7723);firstGT = xmlProlog.indexOf('>');
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7724);if ((((firstGT == -1)&&(__CLR4_4_15x55x5kylve04g.R.iget(7725)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7726)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7727);if ((((c == -1)&&(__CLR4_4_15x55x5kylve04g.R.iget(7728)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7729)==0&false))) {{
                    __CLR4_4_15x55x5kylve04g.R.inc(7730);throw new IOException("Unexpected end of XML stream");
                }
                }__CLR4_4_15x55x5kylve04g.R.inc(7731);throw new IOException(
                        "XML prolog or ROOT element not found on first "
                                + offset + " bytes");
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7732);final int bytesRead = offset;
            __CLR4_4_15x55x5kylve04g.R.inc(7733);if ((((bytesRead > 0)&&(__CLR4_4_15x55x5kylve04g.R.iget(7734)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7735)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7736);inputStream.reset();
                __CLR4_4_15x55x5kylve04g.R.inc(7737);final BufferedReader bReader = new BufferedReader(new StringReader(
                        xmlProlog.substring(0, firstGT + 1)));
                __CLR4_4_15x55x5kylve04g.R.inc(7738);final StringBuffer prolog = new StringBuffer();
                __CLR4_4_15x55x5kylve04g.R.inc(7739);String line;
                __CLR4_4_15x55x5kylve04g.R.inc(7740);while ((line = bReader.readLine()) != null) {{
                    __CLR4_4_15x55x5kylve04g.R.inc(7743);prolog.append(line);
                }
                }__CLR4_4_15x55x5kylve04g.R.inc(7744);final Matcher m = ENCODING_PATTERN.matcher(prolog);
                __CLR4_4_15x55x5kylve04g.R.inc(7745);if ((((m.find())&&(__CLR4_4_15x55x5kylve04g.R.iget(7746)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7747)==0&false))) {{
                    __CLR4_4_15x55x5kylve04g.R.inc(7748);encoding = m.group(1).toUpperCase(Locale.ROOT);
                    __CLR4_4_15x55x5kylve04g.R.inc(7749);encoding = encoding.substring(1, encoding.length() - 1);
                }
            }}
        }}
        }__CLR4_4_15x55x5kylve04g.R.inc(7750);return encoding;
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Indicates if the MIME type belongs to the APPLICATION XML family.
     *
     * @param mime The mime type
     * @return true if the mime type belongs to the APPLICATION XML family,
     * otherwise false
     */
    static boolean isAppXml(final String mime) {try{__CLR4_4_15x55x5kylve04g.R.inc(7751);
        __CLR4_4_15x55x5kylve04g.R.inc(7752);return mime != null &&
               (mime.equals("application/xml") ||
                mime.equals("application/xml-dtd") ||
                mime.equals("application/xml-external-parsed-entity") ||
               mime.startsWith("application/") && mime.endsWith("+xml"));
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Indicates if the MIME type belongs to the TEXT XML family.
     *
     * @param mime The mime type
     * @return true if the mime type belongs to the TEXT XML family,
     * otherwise false
     */
    static boolean isTextXml(final String mime) {try{__CLR4_4_15x55x5kylve04g.R.inc(7753);
        __CLR4_4_15x55x5kylve04g.R.inc(7754);return mime != null &&
              (mime.equals("text/xml") ||
               mime.equals("text/xml-external-parsed-entity") ||
              mime.startsWith("text/") && mime.endsWith("+xml"));
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    private final Reader reader;

    private final String encoding;

    private final String defaultEncoding;

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
    public XmlStreamReader(final File file) throws IOException {
        this(Objects.requireNonNull(file, "file").toPath());__CLR4_4_15x55x5kylve04g.R.inc(7756);try{__CLR4_4_15x55x5kylve04g.R.inc(7755);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

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
        this(inputStream, true);__CLR4_4_15x55x5kylve04g.R.inc(7758);try{__CLR4_4_15x55x5kylve04g.R.inc(7757);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

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
    public XmlStreamReader(final InputStream inputStream, final boolean lenient) throws IOException {
        this(inputStream, lenient, null);__CLR4_4_15x55x5kylve04g.R.inc(7760);try{__CLR4_4_15x55x5kylve04g.R.inc(7759);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

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
     * @param defaultEncoding The default encoding
     * @throws IOException thrown if there is a problem reading the stream.
     * @throws XmlStreamReaderException thrown if the charset encoding could not
     *         be determined according to the specs.
     */
    @SuppressWarnings("resource") // InputStream is managed through a InputStreamReader in this instance.
    public XmlStreamReader(final InputStream inputStream, final boolean lenient, final String defaultEncoding)
            throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7761);
        __CLR4_4_15x55x5kylve04g.R.inc(7762);Objects.requireNonNull(inputStream, "inputStream");
        __CLR4_4_15x55x5kylve04g.R.inc(7763);this.defaultEncoding = defaultEncoding;
        __CLR4_4_15x55x5kylve04g.R.inc(7764);final BOMInputStream bom = new BOMInputStream(new BufferedInputStream(inputStream, IOUtils.DEFAULT_BUFFER_SIZE), false, BOMS);
        __CLR4_4_15x55x5kylve04g.R.inc(7765);final BOMInputStream pis = new BOMInputStream(bom, true, XML_GUESS_BYTES);
        __CLR4_4_15x55x5kylve04g.R.inc(7766);this.encoding = doRawStream(bom, pis, lenient);
        __CLR4_4_15x55x5kylve04g.R.inc(7767);this.reader = new InputStreamReader(pis, encoding);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

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
        this(inputStream, httpContentType, true);__CLR4_4_15x55x5kylve04g.R.inc(7769);try{__CLR4_4_15x55x5kylve04g.R.inc(7768);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

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
            final boolean lenient) throws IOException {
        this(inputStream, httpContentType, lenient, null);__CLR4_4_15x55x5kylve04g.R.inc(7771);try{__CLR4_4_15x55x5kylve04g.R.inc(7770);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}


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
     * @param defaultEncoding The default encoding
     * @throws IOException thrown if there is a problem reading the file.
     * @throws XmlStreamReaderException thrown if the charset encoding could not
     *         be determined according to the specs.
     */
    @SuppressWarnings("resource") // InputStream is managed through a InputStreamReader in this instance.
    public XmlStreamReader(final InputStream inputStream, final String httpContentType,
            final boolean lenient, final String defaultEncoding) throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7772);
        __CLR4_4_15x55x5kylve04g.R.inc(7773);Objects.requireNonNull(inputStream, "inputStream");
        __CLR4_4_15x55x5kylve04g.R.inc(7774);this.defaultEncoding = defaultEncoding;
        __CLR4_4_15x55x5kylve04g.R.inc(7775);final BOMInputStream bom = new BOMInputStream(new BufferedInputStream(inputStream, IOUtils.DEFAULT_BUFFER_SIZE), false, BOMS);
        __CLR4_4_15x55x5kylve04g.R.inc(7776);final BOMInputStream pis = new BOMInputStream(bom, true, XML_GUESS_BYTES);
        __CLR4_4_15x55x5kylve04g.R.inc(7777);this.encoding = processHttpStream(bom, pis, httpContentType, lenient);
        __CLR4_4_15x55x5kylve04g.R.inc(7778);this.reader = new InputStreamReader(pis, encoding);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

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
     * @since 2.11.0
     */
    @SuppressWarnings("resource") // InputStream is managed through another reader in this instance.
    public XmlStreamReader(final Path file) throws IOException {
        this(Files.newInputStream(Objects.requireNonNull(file, "file")));__CLR4_4_15x55x5kylve04g.R.inc(7780);try{__CLR4_4_15x55x5kylve04g.R.inc(7779);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

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
        this(Objects.requireNonNull(url, "url").openConnection(), null);__CLR4_4_15x55x5kylve04g.R.inc(7782);try{__CLR4_4_15x55x5kylve04g.R.inc(7781);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

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
     * @param defaultEncoding The default encoding
     * @throws IOException thrown if there is a problem reading the stream of
     *         the URLConnection.
     */
    public XmlStreamReader(final URLConnection conn, final String defaultEncoding) throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7783);
        __CLR4_4_15x55x5kylve04g.R.inc(7784);Objects.requireNonNull(conn, "conn");
        __CLR4_4_15x55x5kylve04g.R.inc(7785);this.defaultEncoding = defaultEncoding;
        __CLR4_4_15x55x5kylve04g.R.inc(7786);final boolean lenient = true;
        __CLR4_4_15x55x5kylve04g.R.inc(7787);final String contentType = conn.getContentType();
        __CLR4_4_15x55x5kylve04g.R.inc(7788);final InputStream inputStream = conn.getInputStream();
        __CLR4_4_15x55x5kylve04g.R.inc(7789);@SuppressWarnings("resource") // managed by the InputStreamReader tracked by this instance
        final BOMInputStream bom = new BOMInputStream(new BufferedInputStream(inputStream, IOUtils.DEFAULT_BUFFER_SIZE), false, BOMS);
        __CLR4_4_15x55x5kylve04g.R.inc(7790);final BOMInputStream pis = new BOMInputStream(bom, true, XML_GUESS_BYTES);
        __CLR4_4_15x55x5kylve04g.R.inc(7791);if ((((conn instanceof HttpURLConnection || contentType != null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7792)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7793)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7794);this.encoding = processHttpStream(bom, pis, contentType, lenient);
        } }else {{
            __CLR4_4_15x55x5kylve04g.R.inc(7795);this.encoding = doRawStream(bom, pis, lenient);
        }
        }__CLR4_4_15x55x5kylve04g.R.inc(7796);this.reader = new InputStreamReader(pis, encoding);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Calculate the HTTP encoding.
     *
     * @param httpContentType The HTTP content type
     * @param bomEnc BOM encoding
     * @param xmlGuessEnc XML Guess encoding
     * @param xmlEnc XML encoding
     * @param lenient indicates if the charset encoding detection should be
     *        relaxed.
     * @return the HTTP encoding
     * @throws IOException thrown if there is a problem reading the stream.
     */
    String calculateHttpEncoding(final String httpContentType,
            final String bomEnc, final String xmlGuessEnc, final String xmlEnc,
            final boolean lenient) throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7797);

        // Lenient and has XML encoding
        __CLR4_4_15x55x5kylve04g.R.inc(7798);if ((((lenient && xmlEnc != null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7799)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7800)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7801);return xmlEnc;
        }

        // Determine mime/encoding content types from HTTP Content Type
        }__CLR4_4_15x55x5kylve04g.R.inc(7802);final String cTMime = getContentTypeMime(httpContentType);
        __CLR4_4_15x55x5kylve04g.R.inc(7803);final String cTEnc  = getContentTypeEncoding(httpContentType);
        __CLR4_4_15x55x5kylve04g.R.inc(7804);final boolean appXml  = isAppXml(cTMime);
        __CLR4_4_15x55x5kylve04g.R.inc(7805);final boolean textXml = isTextXml(cTMime);

        // Mime type NOT "application/xml" or "text/xml"
        __CLR4_4_15x55x5kylve04g.R.inc(7806);if ((((!appXml && !textXml)&&(__CLR4_4_15x55x5kylve04g.R.iget(7807)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7808)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7809);final String msg = MessageFormat.format(HTTP_EX_3, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
            __CLR4_4_15x55x5kylve04g.R.inc(7810);throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
        }

        // No content type encoding
        }__CLR4_4_15x55x5kylve04g.R.inc(7811);if ((((cTEnc == null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7812)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7813)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7814);if ((((appXml)&&(__CLR4_4_15x55x5kylve04g.R.iget(7815)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7816)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7817);return calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7818);return (((defaultEncoding == null )&&(__CLR4_4_15x55x5kylve04g.R.iget(7819)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7820)==0&false))? US_ASCII : defaultEncoding;
        }

        // UTF-16BE or UTF-16LE content type encoding
        }__CLR4_4_15x55x5kylve04g.R.inc(7821);if ((((cTEnc.equals(UTF_16BE) || cTEnc.equals(UTF_16LE))&&(__CLR4_4_15x55x5kylve04g.R.iget(7822)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7823)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7824);if ((((bomEnc != null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7825)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7826)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7827);final String msg = MessageFormat.format(HTTP_EX_1, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
                __CLR4_4_15x55x5kylve04g.R.inc(7828);throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7829);return cTEnc;
        }

        // UTF-16 content type encoding
        }__CLR4_4_15x55x5kylve04g.R.inc(7830);if ((((cTEnc.equals(UTF_16))&&(__CLR4_4_15x55x5kylve04g.R.iget(7831)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7832)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7833);if ((((bomEnc != null && bomEnc.startsWith(UTF_16))&&(__CLR4_4_15x55x5kylve04g.R.iget(7834)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7835)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7836);return bomEnc;
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7837);final String msg = MessageFormat.format(HTTP_EX_2, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
            __CLR4_4_15x55x5kylve04g.R.inc(7838);throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
        }

        // UTF-32BE or UTF-132E content type encoding
        }__CLR4_4_15x55x5kylve04g.R.inc(7839);if ((((cTEnc.equals(UTF_32BE) || cTEnc.equals(UTF_32LE))&&(__CLR4_4_15x55x5kylve04g.R.iget(7840)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7841)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7842);if ((((bomEnc != null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7843)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7844)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7845);final String msg = MessageFormat.format(HTTP_EX_1, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
                __CLR4_4_15x55x5kylve04g.R.inc(7846);throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7847);return cTEnc;
        }

        // UTF-32 content type encoding
        }__CLR4_4_15x55x5kylve04g.R.inc(7848);if ((((cTEnc.equals(UTF_32))&&(__CLR4_4_15x55x5kylve04g.R.iget(7849)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7850)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7851);if ((((bomEnc != null && bomEnc.startsWith(UTF_32))&&(__CLR4_4_15x55x5kylve04g.R.iget(7852)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7853)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7854);return bomEnc;
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7855);final String msg = MessageFormat.format(HTTP_EX_2, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
            __CLR4_4_15x55x5kylve04g.R.inc(7856);throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
        }

        }__CLR4_4_15x55x5kylve04g.R.inc(7857);return cTEnc;
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Calculate the raw encoding.
     *
     * @param bomEnc BOM encoding
     * @param xmlGuessEnc XML Guess encoding
     * @param xmlEnc XML encoding
     * @return the raw encoding
     * @throws IOException thrown if there is a problem reading the stream.
     */
    String calculateRawEncoding(final String bomEnc, final String xmlGuessEnc,
            final String xmlEnc) throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7858);

        // BOM is Null
        __CLR4_4_15x55x5kylve04g.R.inc(7859);if ((((bomEnc == null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7860)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7861)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7862);if ((((xmlGuessEnc == null || xmlEnc == null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7863)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7864)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7865);return (((defaultEncoding == null )&&(__CLR4_4_15x55x5kylve04g.R.iget(7866)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7867)==0&false))? UTF_8 : defaultEncoding;
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7868);if ((((xmlEnc.equals(UTF_16) &&
               (xmlGuessEnc.equals(UTF_16BE) || xmlGuessEnc.equals(UTF_16LE)))&&(__CLR4_4_15x55x5kylve04g.R.iget(7869)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7870)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7871);return xmlGuessEnc;
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7872);return xmlEnc;
        }

        // BOM is UTF-8
        }__CLR4_4_15x55x5kylve04g.R.inc(7873);if ((((bomEnc.equals(UTF_8))&&(__CLR4_4_15x55x5kylve04g.R.iget(7874)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7875)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7876);if ((((xmlGuessEnc != null && !xmlGuessEnc.equals(UTF_8))&&(__CLR4_4_15x55x5kylve04g.R.iget(7877)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7878)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7879);final String msg = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                __CLR4_4_15x55x5kylve04g.R.inc(7880);throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7881);if ((((xmlEnc != null && !xmlEnc.equals(UTF_8))&&(__CLR4_4_15x55x5kylve04g.R.iget(7882)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7883)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7884);final String msg = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                __CLR4_4_15x55x5kylve04g.R.inc(7885);throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7886);return bomEnc;
        }

        // BOM is UTF-16BE or UTF-16LE
        }__CLR4_4_15x55x5kylve04g.R.inc(7887);if ((((bomEnc.equals(UTF_16BE) || bomEnc.equals(UTF_16LE))&&(__CLR4_4_15x55x5kylve04g.R.iget(7888)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7889)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7890);if ((((xmlGuessEnc != null && !xmlGuessEnc.equals(bomEnc))&&(__CLR4_4_15x55x5kylve04g.R.iget(7891)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7892)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7893);final String msg = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                __CLR4_4_15x55x5kylve04g.R.inc(7894);throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7895);if ((((xmlEnc != null && !xmlEnc.equals(UTF_16) && !xmlEnc.equals(bomEnc))&&(__CLR4_4_15x55x5kylve04g.R.iget(7896)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7897)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7898);final String msg = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                __CLR4_4_15x55x5kylve04g.R.inc(7899);throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7900);return bomEnc;
        }

        // BOM is UTF-32BE or UTF-32LE
        }__CLR4_4_15x55x5kylve04g.R.inc(7901);if ((((bomEnc.equals(UTF_32BE) || bomEnc.equals(UTF_32LE))&&(__CLR4_4_15x55x5kylve04g.R.iget(7902)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7903)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7904);if ((((xmlGuessEnc != null && !xmlGuessEnc.equals(bomEnc))&&(__CLR4_4_15x55x5kylve04g.R.iget(7905)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7906)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7907);final String msg = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                __CLR4_4_15x55x5kylve04g.R.inc(7908);throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7909);if ((((xmlEnc != null && !xmlEnc.equals(UTF_32) && !xmlEnc.equals(bomEnc))&&(__CLR4_4_15x55x5kylve04g.R.iget(7910)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7911)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7912);final String msg = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                __CLR4_4_15x55x5kylve04g.R.inc(7913);throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7914);return bomEnc;
        }

        // BOM is something else
        }__CLR4_4_15x55x5kylve04g.R.inc(7915);final String msg = MessageFormat.format(RAW_EX_2, bomEnc, xmlGuessEnc, xmlEnc);
        __CLR4_4_15x55x5kylve04g.R.inc(7916);throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Closes the XmlStreamReader stream.
     *
     * @throws IOException thrown if there was a problem closing the stream.
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7917);
        __CLR4_4_15x55x5kylve04g.R.inc(7918);reader.close();
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Do lenient detection.
     *
     * @param httpContentType content-type header to use for the resolution of
     *        the charset encoding.
     * @param ex The thrown exception
     * @return the encoding
     * @throws IOException thrown if there is a problem reading the stream.
     */
    private String doLenientDetection(String httpContentType,
            XmlStreamReaderException ex) throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7919);
        __CLR4_4_15x55x5kylve04g.R.inc(7920);if ((((httpContentType != null && httpContentType.startsWith("text/html"))&&(__CLR4_4_15x55x5kylve04g.R.iget(7921)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7922)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7923);httpContentType = httpContentType.substring("text/html".length());
            __CLR4_4_15x55x5kylve04g.R.inc(7924);httpContentType = "text/xml" + httpContentType;
            __CLR4_4_15x55x5kylve04g.R.inc(7925);try {
                __CLR4_4_15x55x5kylve04g.R.inc(7926);return calculateHttpEncoding(httpContentType, ex.getBomEncoding(),
                        ex.getXmlGuessEncoding(), ex.getXmlEncoding(), true);
            } catch (final XmlStreamReaderException ex2) {
                __CLR4_4_15x55x5kylve04g.R.inc(7927);ex = ex2;
            }
        }
        }__CLR4_4_15x55x5kylve04g.R.inc(7928);String encoding = ex.getXmlEncoding();
        __CLR4_4_15x55x5kylve04g.R.inc(7929);if ((((encoding == null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7930)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7931)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7932);encoding = ex.getContentTypeEncoding();
        }
        }__CLR4_4_15x55x5kylve04g.R.inc(7933);if ((((encoding == null)&&(__CLR4_4_15x55x5kylve04g.R.iget(7934)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7935)==0&false))) {{
            __CLR4_4_15x55x5kylve04g.R.inc(7936);encoding = (((defaultEncoding == null )&&(__CLR4_4_15x55x5kylve04g.R.iget(7937)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7938)==0&false))? UTF_8 : defaultEncoding;
        }
        }__CLR4_4_15x55x5kylve04g.R.inc(7939);return encoding;
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Process the raw stream.
     *
     * @param bom BOMInputStream to detect byte order marks
     * @param pis BOMInputStream to guess XML encoding
     * @param lenient indicates if the charset encoding detection should be
     *        relaxed.
     * @return the encoding to be used
     * @throws IOException thrown if there is a problem reading the stream.
     */
    private String doRawStream(final BOMInputStream bom, final BOMInputStream pis, final boolean lenient)
            throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7940);
        __CLR4_4_15x55x5kylve04g.R.inc(7941);final String bomEnc      = bom.getBOMCharsetName();
        __CLR4_4_15x55x5kylve04g.R.inc(7942);final String xmlGuessEnc = pis.getBOMCharsetName();
        __CLR4_4_15x55x5kylve04g.R.inc(7943);final String xmlEnc = getXmlProlog(pis, xmlGuessEnc);
        __CLR4_4_15x55x5kylve04g.R.inc(7944);try {
            __CLR4_4_15x55x5kylve04g.R.inc(7945);return calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc);
        } catch (final XmlStreamReaderException ex) {
            __CLR4_4_15x55x5kylve04g.R.inc(7946);if ((((lenient)&&(__CLR4_4_15x55x5kylve04g.R.iget(7947)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7948)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7949);return doLenientDetection(null, ex);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7950);throw ex;
        }
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Returns the default encoding to use if none is set in HTTP content-type,
     * XML prolog and the rules based on content-type are not adequate.
     * <p>
     * If it is NULL the content-type based rules are used.
     *
     * @return the default encoding to use.
     */
    public String getDefaultEncoding() {try{__CLR4_4_15x55x5kylve04g.R.inc(7951);
        __CLR4_4_15x55x5kylve04g.R.inc(7952);return defaultEncoding;
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Returns the charset encoding of the XmlStreamReader.
     *
     * @return charset encoding.
     */
    public String getEncoding() {try{__CLR4_4_15x55x5kylve04g.R.inc(7953);
        __CLR4_4_15x55x5kylve04g.R.inc(7954);return encoding;
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Process a HTTP stream.
     *
     * @param bom BOMInputStream to detect byte order marks
     * @param pis BOMInputStream to guess XML encoding
     * @param httpContentType The HTTP content type
     * @param lenient indicates if the charset encoding detection should be
     *        relaxed.
     * @return the encoding to be used
     * @throws IOException thrown if there is a problem reading the stream.
     */
    private String processHttpStream(final BOMInputStream bom, final BOMInputStream pis, final String httpContentType,
        final boolean lenient) throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7955);
        __CLR4_4_15x55x5kylve04g.R.inc(7956);final String bomEnc = bom.getBOMCharsetName();
        __CLR4_4_15x55x5kylve04g.R.inc(7957);final String xmlGuessEnc = pis.getBOMCharsetName();
        __CLR4_4_15x55x5kylve04g.R.inc(7958);final String xmlEnc = getXmlProlog(pis, xmlGuessEnc);
        __CLR4_4_15x55x5kylve04g.R.inc(7959);try {
            __CLR4_4_15x55x5kylve04g.R.inc(7960);return calculateHttpEncoding(httpContentType, bomEnc, xmlGuessEnc, xmlEnc, lenient);
        } catch (final XmlStreamReaderException ex) {
            __CLR4_4_15x55x5kylve04g.R.inc(7961);if ((((lenient)&&(__CLR4_4_15x55x5kylve04g.R.iget(7962)!=0|true))||(__CLR4_4_15x55x5kylve04g.R.iget(7963)==0&false))) {{
                __CLR4_4_15x55x5kylve04g.R.inc(7964);return doLenientDetection(httpContentType, ex);
            }
            }__CLR4_4_15x55x5kylve04g.R.inc(7965);throw ex;
        }
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

    /**
     * Invokes the underlying reader's {@code read(char[], int, int)} method.
     * @param buf the buffer to read the characters into
     * @param offset The start offset
     * @param len The number of bytes to read
     * @return the number of characters read or -1 if the end of stream
     * @throws IOException if an I/O error occurs.
     */
    @Override
    public int read(final char[] buf, final int offset, final int len) throws IOException {try{__CLR4_4_15x55x5kylve04g.R.inc(7966);
        __CLR4_4_15x55x5kylve04g.R.inc(7967);return reader.read(buf, offset, len);
    }finally{__CLR4_4_15x55x5kylve04g.R.flushNeeded();}}

}
