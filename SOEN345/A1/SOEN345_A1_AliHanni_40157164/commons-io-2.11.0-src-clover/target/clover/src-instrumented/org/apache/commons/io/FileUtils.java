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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

import org.apache.commons.io.file.AccumulatorPathVisitor;
import org.apache.commons.io.file.Counters;
import org.apache.commons.io.file.PathFilter;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.file.StandardDeleteOption;
import org.apache.commons.io.filefilter.FileEqualsFileFilter;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

/**
 * General file manipulation utilities.
 * <p>
 * Facilities are provided in the following areas:
 * </p>
 * <ul>
 * <li>writing to a file
 * <li>reading from a file
 * <li>make a directory including parent directories
 * <li>copying files and directories
 * <li>deleting files and directories
 * <li>converting to and from a URL
 * <li>listing files and directories by filter and extension
 * <li>comparing file content
 * <li>file last changed date
 * <li>calculating a checksum
 * </ul>
 * <p>
 * Note that a specific charset should be specified whenever possible. Relying on the platform default means that the
 * code is Locale-dependent. Only use the default if the files are known to always use the platform default.
 * </p>
 * <p>
 * {@link SecurityException} are not documented in the Javadoc.
 * </p>
 * <p>
 * Origin of code: Excalibur, Alexandria, Commons-Utils
 * </p>
 */
public class FileUtils {public static class __CLR4_4_1l5l5kylvdypm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,1659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The number of bytes in a kilobyte.
     */
    public static final long ONE_KB = 1024;

    /**
     * The number of bytes in a kilobyte.
     *
     * @since 2.4
     */
    public static final BigInteger ONE_KB_BI = BigInteger.valueOf(ONE_KB);

    /**
     * The number of bytes in a megabyte.
     */
    public static final long ONE_MB = ONE_KB * ONE_KB;

    /**
     * The number of bytes in a megabyte.
     *
     * @since 2.4
     */
    public static final BigInteger ONE_MB_BI = ONE_KB_BI.multiply(ONE_KB_BI);

    /**
     * The number of bytes in a gigabyte.
     */
    public static final long ONE_GB = ONE_KB * ONE_MB;

    /**
     * The number of bytes in a gigabyte.
     *
     * @since 2.4
     */
    public static final BigInteger ONE_GB_BI = ONE_KB_BI.multiply(ONE_MB_BI);

    /**
     * The number of bytes in a terabyte.
     */
    public static final long ONE_TB = ONE_KB * ONE_GB;

    /**
     * The number of bytes in a terabyte.
     *
     * @since 2.4
     */
    public static final BigInteger ONE_TB_BI = ONE_KB_BI.multiply(ONE_GB_BI);

    /**
     * The number of bytes in a petabyte.
     */
    public static final long ONE_PB = ONE_KB * ONE_TB;

    /**
     * The number of bytes in a petabyte.
     *
     * @since 2.4
     */
    public static final BigInteger ONE_PB_BI = ONE_KB_BI.multiply(ONE_TB_BI);

    /**
     * The number of bytes in an exabyte.
     */
    public static final long ONE_EB = ONE_KB * ONE_PB;

    /**
     * The number of bytes in an exabyte.
     *
     * @since 2.4
     */
    public static final BigInteger ONE_EB_BI = ONE_KB_BI.multiply(ONE_PB_BI);

    /**
     * The number of bytes in a zettabyte.
     */
    public static final BigInteger ONE_ZB = BigInteger.valueOf(ONE_KB).multiply(BigInteger.valueOf(ONE_EB));

    /**
     * The number of bytes in a yottabyte.
     */
    public static final BigInteger ONE_YB = ONE_KB_BI.multiply(ONE_ZB);

    /**
     * An empty array of type {@code File}.
     */
    public static final File[] EMPTY_FILE_ARRAY = {};

    /**
     * Copies the given array and adds StandardCopyOption.COPY_ATTRIBUTES.
     *
     * @param copyOptions sorted copy options.
     * @return a new array.
     */
    private static CopyOption[] addCopyAttributes(final CopyOption... copyOptions) {try{__CLR4_4_1l5l5kylvdypm.R.inc(761);
        // Make a copy first since we don't want to sort the call site's version.
        __CLR4_4_1l5l5kylvdypm.R.inc(762);final CopyOption[] actual = Arrays.copyOf(copyOptions, copyOptions.length + 1);
        __CLR4_4_1l5l5kylvdypm.R.inc(763);Arrays.sort(actual, 0, copyOptions.length);
        __CLR4_4_1l5l5kylvdypm.R.inc(764);if ((((Arrays.binarySearch(copyOptions, 0, copyOptions.length, StandardCopyOption.COPY_ATTRIBUTES) >= 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(765)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(766)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(767);return copyOptions;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(768);actual[actual.length - 1] = StandardCopyOption.COPY_ATTRIBUTES;
        __CLR4_4_1l5l5kylvdypm.R.inc(769);return actual;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns a human-readable version of the file size, where the input represents a specific number of bytes.
     * <p>
     * If the size is over 1GB, the size is returned as the number of whole GB, i.e. the size is rounded down to the
     * nearest GB boundary.
     * </p>
     * <p>
     * Similarly for the 1MB and 1KB boundaries.
     * </p>
     *
     * @param size the number of bytes
     * @return a human-readable display value (includes units - EB, PB, TB, GB, MB, KB or bytes)
     * @throws NullPointerException if the given {@code BigInteger} is {@code null}.
     * @see <a href="https://issues.apache.org/jira/browse/IO-226">IO-226 - should the rounding be changed?</a>
     * @since 2.4
     */
    // See https://issues.apache.org/jira/browse/IO-226 - should the rounding be changed?
    public static String byteCountToDisplaySize(final BigInteger size) {try{__CLR4_4_1l5l5kylvdypm.R.inc(770);
        __CLR4_4_1l5l5kylvdypm.R.inc(771);Objects.requireNonNull(size, "size");
        __CLR4_4_1l5l5kylvdypm.R.inc(772);final String displaySize;

        __CLR4_4_1l5l5kylvdypm.R.inc(773);if ((((size.divide(ONE_EB_BI).compareTo(BigInteger.ZERO) > 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(774)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(775)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(776);displaySize = size.divide(ONE_EB_BI) + " EB";
        } }else {__CLR4_4_1l5l5kylvdypm.R.inc(777);if ((((size.divide(ONE_PB_BI).compareTo(BigInteger.ZERO) > 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(778)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(779)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(780);displaySize = size.divide(ONE_PB_BI) + " PB";
        } }else {__CLR4_4_1l5l5kylvdypm.R.inc(781);if ((((size.divide(ONE_TB_BI).compareTo(BigInteger.ZERO) > 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(782)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(783)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(784);displaySize = size.divide(ONE_TB_BI) + " TB";
        } }else {__CLR4_4_1l5l5kylvdypm.R.inc(785);if ((((size.divide(ONE_GB_BI).compareTo(BigInteger.ZERO) > 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(786)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(787)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(788);displaySize = size.divide(ONE_GB_BI) + " GB";
        } }else {__CLR4_4_1l5l5kylvdypm.R.inc(789);if ((((size.divide(ONE_MB_BI).compareTo(BigInteger.ZERO) > 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(790)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(791)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(792);displaySize = size.divide(ONE_MB_BI) + " MB";
        } }else {__CLR4_4_1l5l5kylvdypm.R.inc(793);if ((((size.divide(ONE_KB_BI).compareTo(BigInteger.ZERO) > 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(794)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(795)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(796);displaySize = size.divide(ONE_KB_BI) + " KB";
        } }else {{
            __CLR4_4_1l5l5kylvdypm.R.inc(797);displaySize = size + " bytes";
        }
        }}}}}}__CLR4_4_1l5l5kylvdypm.R.inc(798);return displaySize;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns a human-readable version of the file size, where the input represents a specific number of bytes.
     * <p>
     * If the size is over 1GB, the size is returned as the number of whole GB, i.e. the size is rounded down to the
     * nearest GB boundary.
     * </p>
     * <p>
     * Similarly for the 1MB and 1KB boundaries.
     * </p>
     *
     * @param size the number of bytes
     * @return a human-readable display value (includes units - EB, PB, TB, GB, MB, KB or bytes)
     * @see <a href="https://issues.apache.org/jira/browse/IO-226">IO-226 - should the rounding be changed?</a>
     */
    // See https://issues.apache.org/jira/browse/IO-226 - should the rounding be changed?
    public static String byteCountToDisplaySize(final long size) {try{__CLR4_4_1l5l5kylvdypm.R.inc(799);
        __CLR4_4_1l5l5kylvdypm.R.inc(800);return byteCountToDisplaySize(BigInteger.valueOf(size));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Computes the checksum of a file using the specified checksum object. Multiple files may be checked using one
     * {@code Checksum} instance if desired simply by reusing the same checksum object. For example:
     *
     * <pre>
     * long checksum = FileUtils.checksum(file, new CRC32()).getValue();
     * </pre>
     *
     * @param file the file to checksum, must not be {@code null}
     * @param checksum the checksum object to be used, must not be {@code null}
     * @return the checksum specified, updated with the content of the file
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws NullPointerException if the given {@code Checksum} is {@code null}.
     * @throws IllegalArgumentException if the given {@code File} does not exist or is not a file.
     * @throws IOException if an IO error occurs reading the file.
     * @since 1.3
     */
    public static Checksum checksum(final File file, final Checksum checksum) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(801);
        __CLR4_4_1l5l5kylvdypm.R.inc(802);requireExistsChecked(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(803);requireFile(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(804);Objects.requireNonNull(checksum, "checksum");
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(805);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1l5l5kylvdypm.R.inc(806);}};InputStream inputStream = new CheckedInputStream(Files.newInputStream(file.toPath()), checksum)) {
            __CLR4_4_1l5l5kylvdypm.R.inc(807);IOUtils.consume(inputStream);
        }
        __CLR4_4_1l5l5kylvdypm.R.inc(808);return checksum;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Computes the checksum of a file using the CRC32 checksum routine.
     * The value of the checksum is returned.
     *
     * @param file the file to checksum, must not be {@code null}
     * @return the checksum value
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if the given {@code File} does not exist or is not a file.
     * @throws IOException              if an IO error occurs reading the file.
     * @since 1.3
     */
    public static long checksumCRC32(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(809);
        __CLR4_4_1l5l5kylvdypm.R.inc(810);return checksum(file, new CRC32()).getValue();
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Cleans a directory without deleting it.
     *
     * @param directory directory to clean
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if directory does not exist or is not a directory.
     * @throws IOException if an I/O error occurs.
     * @see #forceDelete(File)
     */
    public static void cleanDirectory(final File directory) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(811);
        __CLR4_4_1l5l5kylvdypm.R.inc(812);final File[] files = listFiles(directory, null);

        __CLR4_4_1l5l5kylvdypm.R.inc(813);final List<Exception> causeList = new ArrayList<>();
        __CLR4_4_1l5l5kylvdypm.R.inc(814);for (final File file : files) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(815);try {
                __CLR4_4_1l5l5kylvdypm.R.inc(816);forceDelete(file);
            } catch (final IOException ioe) {
                __CLR4_4_1l5l5kylvdypm.R.inc(817);causeList.add(ioe);
            }
        }

        }__CLR4_4_1l5l5kylvdypm.R.inc(818);if ((((!causeList.isEmpty())&&(__CLR4_4_1l5l5kylvdypm.R.iget(819)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(820)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(821);throw new IOExceptionList(directory.toString(), causeList);
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Cleans a directory without deleting it.
     *
     * @param directory directory to clean, must not be {@code null}
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if directory does not exist or is not a directory.
     * @throws IOException if an I/O error occurs.
     * @see #forceDeleteOnExit(File)
     */
    private static void cleanDirectoryOnExit(final File directory) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(822);
        __CLR4_4_1l5l5kylvdypm.R.inc(823);final File[] files = listFiles(directory, null);

        __CLR4_4_1l5l5kylvdypm.R.inc(824);final List<Exception> causeList = new ArrayList<>();
        __CLR4_4_1l5l5kylvdypm.R.inc(825);for (final File file : files) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(826);try {
                __CLR4_4_1l5l5kylvdypm.R.inc(827);forceDeleteOnExit(file);
            } catch (final IOException ioe) {
                __CLR4_4_1l5l5kylvdypm.R.inc(828);causeList.add(ioe);
            }
        }

        }__CLR4_4_1l5l5kylvdypm.R.inc(829);if ((((!causeList.isEmpty())&&(__CLR4_4_1l5l5kylvdypm.R.iget(830)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(831)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(832);throw new IOExceptionList(causeList);
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests whether the contents of two files are equal.
     * <p>
     * This method checks to see if the two files are different lengths or if they point to the same file, before
     * resorting to byte-by-byte comparison of the contents.
     * </p>
     * <p>
     * Code origin: Avalon
     * </p>
     *
     * @param file1 the first file
     * @param file2 the second file
     * @return true if the content of the files are equal or they both don't exist, false otherwise
     * @throws IllegalArgumentException when an input is not a file.
     * @throws IOException If an I/O error occurs.
     * @see org.apache.commons.io.file.PathUtils#fileContentEquals(Path,Path,java.nio.file.LinkOption[],java.nio.file.OpenOption...)
     */
    public static boolean contentEquals(final File file1, final File file2) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(833);
        __CLR4_4_1l5l5kylvdypm.R.inc(834);if ((((file1 == null && file2 == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(835)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(836)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(837);return true;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(838);if ((((file1 == null || file2 == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(839)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(840)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(841);return false;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(842);final boolean file1Exists = file1.exists();
        __CLR4_4_1l5l5kylvdypm.R.inc(843);if ((((file1Exists != file2.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(844)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(845)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(846);return false;
        }

        }__CLR4_4_1l5l5kylvdypm.R.inc(847);if ((((!file1Exists)&&(__CLR4_4_1l5l5kylvdypm.R.iget(848)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(849)==0&false))) {{
            // two not existing files are equal
            __CLR4_4_1l5l5kylvdypm.R.inc(850);return true;
        }

        }__CLR4_4_1l5l5kylvdypm.R.inc(851);requireFile(file1, "file1");
        __CLR4_4_1l5l5kylvdypm.R.inc(852);requireFile(file2, "file2");

        __CLR4_4_1l5l5kylvdypm.R.inc(853);if ((((file1.length() != file2.length())&&(__CLR4_4_1l5l5kylvdypm.R.iget(854)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(855)==0&false))) {{
            // lengths differ, cannot be equal
            __CLR4_4_1l5l5kylvdypm.R.inc(856);return false;
        }

        }__CLR4_4_1l5l5kylvdypm.R.inc(857);if ((((file1.getCanonicalFile().equals(file2.getCanonicalFile()))&&(__CLR4_4_1l5l5kylvdypm.R.iget(858)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(859)==0&false))) {{
            // same file
            __CLR4_4_1l5l5kylvdypm.R.inc(860);return true;
        }

        }class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(861);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1l5l5kylvdypm.R.inc(862);}};InputStream input1 = Files.newInputStream(file1.toPath()); __CLR4_4_1$AC1 __CLR$ACI2=new __CLR4_4_1$AC1(){{__CLR4_4_1l5l5kylvdypm.R.inc(863);}};InputStream input2 = Files.newInputStream(file2.toPath())) {
            __CLR4_4_1l5l5kylvdypm.R.inc(864);return IOUtils.contentEquals(input1, input2);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Compares the contents of two files to determine if they are equal or not.
     * <p>
     * This method checks to see if the two files point to the same file,
     * before resorting to line-by-line comparison of the contents.
     * </p>
     *
     * @param file1       the first file
     * @param file2       the second file
     * @param charsetName the name of the requested charset.
     *                    May be null, in which case the platform default is used
     * @return true if the content of the files are equal or neither exists,
     * false otherwise
     * @throws IllegalArgumentException when an input is not a file.
     * @throws IOException in case of an I/O error.
     * @throws UnsupportedCharsetException If the named charset is unavailable (unchecked exception).
     * @see IOUtils#contentEqualsIgnoreEOL(Reader, Reader)
     * @since 2.2
     */
    public static boolean contentEqualsIgnoreEOL(final File file1, final File file2, final String charsetName)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(865);
        __CLR4_4_1l5l5kylvdypm.R.inc(866);if ((((file1 == null && file2 == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(867)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(868)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(869);return true;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(870);if ((((file1 == null || file2 == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(871)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(872)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(873);return false;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(874);final boolean file1Exists = file1.exists();
        __CLR4_4_1l5l5kylvdypm.R.inc(875);if ((((file1Exists != file2.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(876)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(877)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(878);return false;
        }

        }__CLR4_4_1l5l5kylvdypm.R.inc(879);if ((((!file1Exists)&&(__CLR4_4_1l5l5kylvdypm.R.iget(880)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(881)==0&false))) {{
            // two not existing files are equal
            __CLR4_4_1l5l5kylvdypm.R.inc(882);return true;
        }

        }__CLR4_4_1l5l5kylvdypm.R.inc(883);requireFile(file1, "file1");
        __CLR4_4_1l5l5kylvdypm.R.inc(884);requireFile(file2, "file2");

        __CLR4_4_1l5l5kylvdypm.R.inc(885);if ((((file1.getCanonicalFile().equals(file2.getCanonicalFile()))&&(__CLR4_4_1l5l5kylvdypm.R.iget(886)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(887)==0&false))) {{
            // same file
            __CLR4_4_1l5l5kylvdypm.R.inc(888);return true;
        }

        }__CLR4_4_1l5l5kylvdypm.R.inc(889);final Charset charset = Charsets.toCharset(charsetName);
        class __CLR4_4_1$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(890);try (__CLR4_4_1$AC2 __CLR$ACI3=new __CLR4_4_1$AC2(){{__CLR4_4_1l5l5kylvdypm.R.inc(891);}};Reader input1 = new InputStreamReader(Files.newInputStream(file1.toPath()), charset);
             __CLR4_4_1$AC2 __CLR$ACI4=new __CLR4_4_1$AC2(){{__CLR4_4_1l5l5kylvdypm.R.inc(892);}};Reader input2 = new InputStreamReader(Files.newInputStream(file2.toPath()), charset)) {
            __CLR4_4_1l5l5kylvdypm.R.inc(893);return IOUtils.contentEqualsIgnoreEOL(input1, input2);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Converts a Collection containing java.io.File instanced into array
     * representation. This is to account for the difference between
     * File.listFiles() and FileUtils.listFiles().
     *
     * @param files a Collection containing java.io.File instances
     * @return an array of java.io.File
     */
    public static File[] convertFileCollectionToFileArray(final Collection<File> files) {try{__CLR4_4_1l5l5kylvdypm.R.inc(894);
        __CLR4_4_1l5l5kylvdypm.R.inc(895);return files.toArray(EMPTY_FILE_ARRAY);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a whole directory to a new location preserving the file dates.
     * <p>
     * This method copies the specified directory and all its child directories and files to the specified destination.
     * The destination is the new location and name of the directory.
     * </p>
     * <p>
     * The destination directory is created if it does not exist. If the destination directory did exist, then this
     * method merges the source with the destination, with the source taking precedence.
     * </p>
     * <p>
     * <strong>Note:</strong> This method tries to preserve the files' last modified date/times using
     * {@link File#setLastModified(long)}, however it is not guaranteed that those operations will succeed. If the
     * modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param srcDir an existing directory to copy, must not be {@code null}.
     * @param destDir the new directory, must not be {@code null}.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 1.1
     */
    public static void copyDirectory(final File srcDir, final File destDir) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(896);
        __CLR4_4_1l5l5kylvdypm.R.inc(897);copyDirectory(srcDir, destDir, true);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a whole directory to a new location.
     * <p>
     * This method copies the contents of the specified source directory to within the specified destination directory.
     * </p>
     * <p>
     * The destination directory is created if it does not exist. If the destination directory did exist, then this
     * method merges the source with the destination, with the source taking precedence.
     * </p>
     * <p>
     * <strong>Note:</strong> Setting {@code preserveFileDate} to {@code true} tries to preserve the files' last
     * modified date/times using {@link File#setLastModified(long)}, however it is not guaranteed that those operations
     * will succeed. If the modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param srcDir an existing directory to copy, must not be {@code null}.
     * @param destDir the new directory, must not be {@code null}.
     * @param preserveFileDate true if the file date of the copy should be the same as the original.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 1.1
     */
    public static void copyDirectory(final File srcDir, final File destDir, final boolean preserveFileDate)
        throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(898);
        __CLR4_4_1l5l5kylvdypm.R.inc(899);copyDirectory(srcDir, destDir, null, preserveFileDate);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a filtered directory to a new location preserving the file dates.
     * <p>
     * This method copies the contents of the specified source directory to within the specified destination directory.
     * </p>
     * <p>
     * The destination directory is created if it does not exist. If the destination directory did exist, then this
     * method merges the source with the destination, with the source taking precedence.
     * </p>
     * <p>
     * <strong>Note:</strong> This method tries to preserve the files' last modified date/times using
     * {@link File#setLastModified(long)}, however it is not guaranteed that those operations will succeed. If the
     * modification operation fails, the methods throws IOException.
     * </p>
     * <b>Example: Copy directories only</b>
     *
     * <pre>
     * // only copy the directory structure
     * FileUtils.copyDirectory(srcDir, destDir, DirectoryFileFilter.DIRECTORY);
     * </pre>
     *
     * <b>Example: Copy directories and txt files</b>
     *
     * <pre>
     * // Create a filter for ".txt" files
     * IOFileFilter txtSuffixFilter = FileFilterUtils.suffixFileFilter(".txt");
     * IOFileFilter txtFiles = FileFilterUtils.andFileFilter(FileFileFilter.FILE, txtSuffixFilter);
     *
     * // Create a filter for either directories or ".txt" files
     * FileFilter filter = FileFilterUtils.orFileFilter(DirectoryFileFilter.DIRECTORY, txtFiles);
     *
     * // Copy using the filter
     * FileUtils.copyDirectory(srcDir, destDir, filter);
     * </pre>
     *
     * @param srcDir an existing directory to copy, must not be {@code null}.
     * @param destDir the new directory, must not be {@code null}.
     * @param filter the filter to apply, null means copy all directories and files should be the same as the original.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 1.4
     */
    public static void copyDirectory(final File srcDir, final File destDir, final FileFilter filter)
        throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(900);
        __CLR4_4_1l5l5kylvdypm.R.inc(901);copyDirectory(srcDir, destDir, filter, true);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a filtered directory to a new location.
     * <p>
     * This method copies the contents of the specified source directory to within the specified destination directory.
     * </p>
     * <p>
     * The destination directory is created if it does not exist. If the destination directory did exist, then this
     * method merges the source with the destination, with the source taking precedence.
     * </p>
     * <p>
     * <strong>Note:</strong> Setting {@code preserveFileDate} to {@code true} tries to preserve the files' last
     * modified date/times using {@link File#setLastModified(long)}, however it is not guaranteed that those operations
     * will succeed. If the modification operation fails, the methods throws IOException.
     * </p>
     * <b>Example: Copy directories only</b>
     *
     * <pre>
     * // only copy the directory structure
     * FileUtils.copyDirectory(srcDir, destDir, DirectoryFileFilter.DIRECTORY, false);
     * </pre>
     *
     * <b>Example: Copy directories and txt files</b>
     *
     * <pre>
     * // Create a filter for ".txt" files
     * IOFileFilter txtSuffixFilter = FileFilterUtils.suffixFileFilter(".txt");
     * IOFileFilter txtFiles = FileFilterUtils.andFileFilter(FileFileFilter.FILE, txtSuffixFilter);
     *
     * // Create a filter for either directories or ".txt" files
     * FileFilter filter = FileFilterUtils.orFileFilter(DirectoryFileFilter.DIRECTORY, txtFiles);
     *
     * // Copy using the filter
     * FileUtils.copyDirectory(srcDir, destDir, filter, false);
     * </pre>
     *
     * @param srcDir an existing directory to copy, must not be {@code null}.
     * @param destDir the new directory, must not be {@code null}.
     * @param filter the filter to apply, null means copy all directories and files.
     * @param preserveFileDate true if the file date of the copy should be the same as the original.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 1.4
     */
    public static void copyDirectory(final File srcDir, final File destDir, final FileFilter filter,
        final boolean preserveFileDate) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(902);
        __CLR4_4_1l5l5kylvdypm.R.inc(903);copyDirectory(srcDir, destDir, filter, preserveFileDate, StandardCopyOption.REPLACE_EXISTING);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a filtered directory to a new location.
     * <p>
     * This method copies the contents of the specified source directory to within the specified destination directory.
     * </p>
     * <p>
     * The destination directory is created if it does not exist. If the destination directory did exist, then this
     * method merges the source with the destination, with the source taking precedence.
     * </p>
     * <p>
     * <strong>Note:</strong> Setting {@code preserveFileDate} to {@code true} tries to preserve the files' last
     * modified date/times using {@link File#setLastModified(long)}, however it is not guaranteed that those operations
     * will succeed. If the modification operation fails, the methods throws IOException.
     * </p>
     * <b>Example: Copy directories only</b>
     *
     * <pre>
     * // only copy the directory structure
     * FileUtils.copyDirectory(srcDir, destDir, DirectoryFileFilter.DIRECTORY, false);
     * </pre>
     *
     * <b>Example: Copy directories and txt files</b>
     *
     * <pre>
     * // Create a filter for ".txt" files
     * IOFileFilter txtSuffixFilter = FileFilterUtils.suffixFileFilter(".txt");
     * IOFileFilter txtFiles = FileFilterUtils.andFileFilter(FileFileFilter.FILE, txtSuffixFilter);
     *
     * // Create a filter for either directories or ".txt" files
     * FileFilter filter = FileFilterUtils.orFileFilter(DirectoryFileFilter.DIRECTORY, txtFiles);
     *
     * // Copy using the filter
     * FileUtils.copyDirectory(srcDir, destDir, filter, false);
     * </pre>
     *
     * @param srcDir an existing directory to copy, must not be {@code null}
     * @param destDir the new directory, must not be {@code null}
     * @param fileFilter the filter to apply, null means copy all directories and files
     * @param preserveFileDate true if the file date of the copy should be the same as the original
     * @param copyOptions options specifying how the copy should be done, for example {@link StandardCopyOption}.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 2.8.0
     */
    public static void copyDirectory(final File srcDir, final File destDir, final FileFilter fileFilter,
        final boolean preserveFileDate, final CopyOption... copyOptions) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(904);
        __CLR4_4_1l5l5kylvdypm.R.inc(905);requireFileCopy(srcDir, destDir);
        __CLR4_4_1l5l5kylvdypm.R.inc(906);requireDirectory(srcDir, "srcDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(907);requireCanonicalPathsNotEquals(srcDir, destDir);

        // Cater for destination being directory within the source directory (see IO-141)
        __CLR4_4_1l5l5kylvdypm.R.inc(908);List<String> exclusionList = null;
        __CLR4_4_1l5l5kylvdypm.R.inc(909);final String srcDirCanonicalPath = srcDir.getCanonicalPath();
        __CLR4_4_1l5l5kylvdypm.R.inc(910);final String destDirCanonicalPath = destDir.getCanonicalPath();
        __CLR4_4_1l5l5kylvdypm.R.inc(911);if ((((destDirCanonicalPath.startsWith(srcDirCanonicalPath))&&(__CLR4_4_1l5l5kylvdypm.R.iget(912)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(913)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(914);final File[] srcFiles = listFiles(srcDir, fileFilter);
            __CLR4_4_1l5l5kylvdypm.R.inc(915);if ((((srcFiles.length > 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(916)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(917)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(918);exclusionList = new ArrayList<>(srcFiles.length);
                __CLR4_4_1l5l5kylvdypm.R.inc(919);for (final File srcFile : srcFiles) {{
                    __CLR4_4_1l5l5kylvdypm.R.inc(920);final File copiedFile = new File(destDir, srcFile.getName());
                    __CLR4_4_1l5l5kylvdypm.R.inc(921);exclusionList.add(copiedFile.getCanonicalPath());
                }
            }}
        }}
        }__CLR4_4_1l5l5kylvdypm.R.inc(922);doCopyDirectory(srcDir, destDir, fileFilter, exclusionList,
            preserveFileDate, (((preserveFileDate )&&(__CLR4_4_1l5l5kylvdypm.R.iget(923)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(924)==0&false))? addCopyAttributes(copyOptions) : copyOptions);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a directory to within another directory preserving the file dates.
     * <p>
     * This method copies the source directory and all its contents to a directory of the same name in the specified
     * destination directory.
     * </p>
     * <p>
     * The destination directory is created if it does not exist. If the destination directory did exist, then this
     * method merges the source with the destination, with the source taking precedence.
     * </p>
     * <p>
     * <strong>Note:</strong> This method tries to preserve the files' last modified date/times using
     * {@link File#setLastModified(long)}, however it is not guaranteed that those operations will succeed. If the
     * modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param sourceDir an existing directory to copy, must not be {@code null}.
     * @param destinationDir the directory to place the copy in, must not be {@code null}.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 1.2
     */
    public static void copyDirectoryToDirectory(final File sourceDir, final File destinationDir) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(925);
        __CLR4_4_1l5l5kylvdypm.R.inc(926);requireDirectoryIfExists(sourceDir, "sourceDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(927);requireDirectoryIfExists(destinationDir, "destinationDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(928);copyDirectory(sourceDir, new File(destinationDir, sourceDir.getName()), true);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a file to a new location preserving the file date.
     * <p>
     * This method copies the contents of the specified source file to the specified destination file. The directory
     * holding the destination file is created if it does not exist. If the destination file exists, then this method
     * will overwrite it.
     * </p>
     * <p>
     * <strong>Note:</strong> This method tries to preserve the file's last modified date/times using
     * {@link File#setLastModified(long)}, however it is not guaranteed that the operation will succeed. If the
     * modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param srcFile an existing file to copy, must not be {@code null}.
     * @param destFile the new file, must not be {@code null}.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IOException if source or destination is invalid.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @throws IOException if the output file length is not the same as the input file length after the copy completes.
     * @see #copyFileToDirectory(File, File)
     * @see #copyFile(File, File, boolean)
     */
    public static void copyFile(final File srcFile, final File destFile) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(929);
        __CLR4_4_1l5l5kylvdypm.R.inc(930);copyFile(srcFile, destFile, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies an existing file to a new file location.
     * <p>
     * This method copies the contents of the specified source file to the specified destination file. The directory
     * holding the destination file is created if it does not exist. If the destination file exists, then this method
     * will overwrite it.
     * </p>
     * <p>
     * <strong>Note:</strong> Setting {@code preserveFileDate} to {@code true} tries to preserve the file's last
     * modified date/times using {@link File#setLastModified(long)}, however it is not guaranteed that the operation
     * will succeed. If the modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param srcFile an existing file to copy, must not be {@code null}.
     * @param destFile the new file, must not be {@code null}.
     * @param preserveFileDate true if the file date of the copy should be the same as the original.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IOException if source or destination is invalid.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @throws IOException if the output file length is not the same as the input file length after the copy completes
     * @see #copyFile(File, File, boolean, CopyOption...)
     */
    public static void copyFile(final File srcFile, final File destFile, final boolean preserveFileDate)
        throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(931);
        __CLR4_4_1l5l5kylvdypm.R.inc(932);copyFile(srcFile, destFile,
            (((preserveFileDate
                )&&(__CLR4_4_1l5l5kylvdypm.R.iget(933)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(934)==0&false))? new CopyOption[] {StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING}
                : new CopyOption[] {StandardCopyOption.REPLACE_EXISTING});
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a file to a new location.
     * <p>
     * This method copies the contents of the specified source file to the specified destination file. The directory
     * holding the destination file is created if it does not exist. If the destination file exists, you can overwrite
     * it with {@link StandardCopyOption#REPLACE_EXISTING}.
     * </p>
     * <p>
     * <strong>Note:</strong> Setting {@code preserveFileDate} to {@code true} tries to preserve the file's last
     * modified date/times using {@link File#setLastModified(long)}, however it is not guaranteed that the operation
     * will succeed. If the modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param srcFile an existing file to copy, must not be {@code null}.
     * @param destFile the new file, must not be {@code null}.
     * @param preserveFileDate true if the file date of the copy should be the same as the original.
     * @param copyOptions options specifying how the copy should be done, for example {@link StandardCopyOption}..
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IllegalArgumentException if source is not a file.
     * @throws IOException if the output file length is not the same as the input file length after the copy completes.
     * @throws IOException if an I/O error occurs, or setting the last-modified time didn't succeeded.
     * @see #copyFileToDirectory(File, File, boolean)
     * @since 2.8.0
     */
    public static void copyFile(final File srcFile, final File destFile, final boolean preserveFileDate, final CopyOption... copyOptions)
        throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(935);
        __CLR4_4_1l5l5kylvdypm.R.inc(936);copyFile(srcFile, destFile, (((preserveFileDate )&&(__CLR4_4_1l5l5kylvdypm.R.iget(937)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(938)==0&false))? addCopyAttributes(copyOptions) : copyOptions);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a file to a new location.
     * <p>
     * This method copies the contents of the specified source file to the specified destination file. The directory
     * holding the destination file is created if it does not exist. If the destination file exists, you can overwrite
     * it if you use {@link StandardCopyOption#REPLACE_EXISTING}.
     * </p>
     *
     * @param srcFile an existing file to copy, must not be {@code null}.
     * @param destFile the new file, must not be {@code null}.
     * @param copyOptions options specifying how the copy should be done, for example {@link StandardCopyOption}..
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IllegalArgumentException if source is not a file.
     * @throws IOException if the output file length is not the same as the input file length after the copy completes.
     * @throws IOException if an I/O error occurs.
     * @see StandardCopyOption
     * @since 2.9.0
     */
    public static void copyFile(final File srcFile, final File destFile, final CopyOption... copyOptions)
        throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(939);
        __CLR4_4_1l5l5kylvdypm.R.inc(940);requireFileCopy(srcFile, destFile);
        __CLR4_4_1l5l5kylvdypm.R.inc(941);requireFile(srcFile, "srcFile");
        __CLR4_4_1l5l5kylvdypm.R.inc(942);requireCanonicalPathsNotEquals(srcFile, destFile);
        __CLR4_4_1l5l5kylvdypm.R.inc(943);createParentDirectories(destFile);
        __CLR4_4_1l5l5kylvdypm.R.inc(944);requireFileIfExists(destFile, "destFile");
        __CLR4_4_1l5l5kylvdypm.R.inc(945);if ((((destFile.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(946)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(947)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(948);requireCanWrite(destFile, "destFile");
        }

        // On Windows, the last modified time is copied by default.
        }__CLR4_4_1l5l5kylvdypm.R.inc(949);Files.copy(srcFile.toPath(), destFile.toPath(), copyOptions);

        // TODO IO-386: Do we still need this check?
        __CLR4_4_1l5l5kylvdypm.R.inc(950);requireEqualSizes(srcFile, destFile, srcFile.length(), destFile.length());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies bytes from a {@code File} to an {@code OutputStream}.
     * <p>
     * This method buffers the input internally, so there is no need to use a {@code BufferedInputStream}.
     * </p>
     *
     * @param input  the {@code File} to read.
     * @param output the {@code OutputStream} to write.
     * @return the number of bytes copied
     * @throws NullPointerException if the File is {@code null}.
     * @throws NullPointerException if the OutputStream is {@code null}.
     * @throws IOException          if an I/O error occurs.
     * @since 2.1
     */
    public static long copyFile(final File input, final OutputStream output) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(951);
        class __CLR4_4_1$AC3 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(952);try (__CLR4_4_1$AC3 __CLR$ACI5=new __CLR4_4_1$AC3(){{__CLR4_4_1l5l5kylvdypm.R.inc(953);}};InputStream fis = Files.newInputStream(input.toPath())) {
            __CLR4_4_1l5l5kylvdypm.R.inc(954);return IOUtils.copyLarge(fis, output);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a file to a directory preserving the file date.
     * <p>
     * This method copies the contents of the specified source file to a file of the same name in the specified
     * destination directory. The destination directory is created if it does not exist. If the destination file exists,
     * then this method will overwrite it.
     * </p>
     * <p>
     * <strong>Note:</strong> This method tries to preserve the file's last modified date/times using
     * {@link File#setLastModified(long)}, however it is not guaranteed that the operation will succeed. If the
     * modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param srcFile an existing file to copy, must not be {@code null}.
     * @param destDir the directory to place the copy in, must not be {@code null}.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if source or destination is invalid.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @see #copyFile(File, File, boolean)
     */
    public static void copyFileToDirectory(final File srcFile, final File destDir) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(955);
        __CLR4_4_1l5l5kylvdypm.R.inc(956);copyFileToDirectory(srcFile, destDir, true);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a file to a directory optionally preserving the file date.
     * <p>
     * This method copies the contents of the specified source file to a file of the same name in the specified
     * destination directory. The destination directory is created if it does not exist. If the destination file exists,
     * then this method will overwrite it.
     * </p>
     * <p>
     * <strong>Note:</strong> Setting {@code preserveFileDate} to {@code true} tries to preserve the file's last
     * modified date/times using {@link File#setLastModified(long)}, however it is not guaranteed that the operation
     * will succeed. If the modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param sourceFile an existing file to copy, must not be {@code null}.
     * @param destinationDir the directory to place the copy in, must not be {@code null}.
     * @param preserveFileDate true if the file date of the copy should be the same as the original.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @throws IOException if the output file length is not the same as the input file length after the copy completes.
     * @see #copyFile(File, File, CopyOption...)
     * @since 1.3
     */
    public static void copyFileToDirectory(final File sourceFile, final File destinationDir, final boolean preserveFileDate)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(957);
        __CLR4_4_1l5l5kylvdypm.R.inc(958);Objects.requireNonNull(sourceFile, "sourceFile");
        __CLR4_4_1l5l5kylvdypm.R.inc(959);requireDirectoryIfExists(destinationDir, "destinationDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(960);copyFile(sourceFile, new File(destinationDir, sourceFile.getName()), preserveFileDate);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies bytes from an {@link InputStream} {@code source} to a file
     * {@code destination}. The directories up to {@code destination}
     * will be created if they don't already exist. {@code destination}
     * will be overwritten if it already exists.
     * <p>
     * <em>The {@code source} stream is closed.</em>
     * </p>
     * <p>
     * See {@link #copyToFile(InputStream, File)} for a method that does not close the input stream.
     * </p>
     *
     * @param source      the {@code InputStream} to copy bytes from, must not be {@code null}, will be closed
     * @param destination the non-directory {@code File} to write bytes to
     *                    (possibly overwriting), must not be {@code null}
     * @throws IOException if {@code destination} is a directory
     * @throws IOException if {@code destination} cannot be written
     * @throws IOException if {@code destination} needs creating but can't be
     * @throws IOException if an IO error occurs during copying
     * @since 2.0
     */
    public static void copyInputStreamToFile(final InputStream source, final File destination) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(961);
        class __CLR4_4_1$AC4 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(962);try (__CLR4_4_1$AC4 __CLR$ACI6=new __CLR4_4_1$AC4(){{__CLR4_4_1l5l5kylvdypm.R.inc(963);}};InputStream inputStream = source) {
            __CLR4_4_1l5l5kylvdypm.R.inc(964);copyToFile(inputStream, destination);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a file or directory to within another directory preserving the file dates.
     * <p>
     * This method copies the source file or directory, along all its contents, to a directory of the same name in the
     * specified destination directory.
     * </p>
     * <p>
     * The destination directory is created if it does not exist. If the destination directory did exist, then this
     * method merges the source with the destination, with the source taking precedence.
     * </p>
     * <p>
     * <strong>Note:</strong> This method tries to preserve the files' last modified date/times using
     * {@link File#setLastModified(long)}, however it is not guaranteed that those operations will succeed. If the
     * modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param sourceFile an existing file or directory to copy, must not be {@code null}.
     * @param destinationDir the directory to place the copy in, must not be {@code null}.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @see #copyDirectoryToDirectory(File, File)
     * @see #copyFileToDirectory(File, File)
     * @since 2.6
     */
    public static void copyToDirectory(final File sourceFile, final File destinationDir) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(965);
        __CLR4_4_1l5l5kylvdypm.R.inc(966);Objects.requireNonNull(sourceFile, "sourceFile");
        __CLR4_4_1l5l5kylvdypm.R.inc(967);if ((((sourceFile.isFile())&&(__CLR4_4_1l5l5kylvdypm.R.iget(968)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(969)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(970);copyFileToDirectory(sourceFile, destinationDir);
        } }else {__CLR4_4_1l5l5kylvdypm.R.inc(971);if ((((sourceFile.isDirectory())&&(__CLR4_4_1l5l5kylvdypm.R.iget(972)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(973)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(974);copyDirectoryToDirectory(sourceFile, destinationDir);
        } }else {{
            __CLR4_4_1l5l5kylvdypm.R.inc(975);throw new FileNotFoundException("The source " + sourceFile + " does not exist");
        }
    }}}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies a files to a directory preserving each file's date.
     * <p>
     * This method copies the contents of the specified source files
     * to a file of the same name in the specified destination directory.
     * The destination directory is created if it does not exist.
     * If the destination file exists, then this method will overwrite it.
     * </p>
     * <p>
     * <strong>Note:</strong> This method tries to preserve the file's last
     * modified date/times using {@link File#setLastModified(long)}, however
     * it is not guaranteed that the operation will succeed.
     * If the modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param sourceIterable     a existing files to copy, must not be {@code null}.
     * @param destinationDir  the directory to place the copy in, must not be {@code null}.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IOException if source or destination is invalid.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @see #copyFileToDirectory(File, File)
     * @since 2.6
     */
    public static void copyToDirectory(final Iterable<File> sourceIterable, final File destinationDir) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(976);
        __CLR4_4_1l5l5kylvdypm.R.inc(977);Objects.requireNonNull(sourceIterable, "sourceIterable");
        __CLR4_4_1l5l5kylvdypm.R.inc(978);for (final File src : sourceIterable) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(979);copyFileToDirectory(src, destinationDir);
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies bytes from an {@link InputStream} source to a {@link File} destination. The directories
     * up to {@code destination} will be created if they don't already exist. {@code destination} will be
     * overwritten if it already exists. The {@code source} stream is left open, e.g. for use with
     * {@link java.util.zip.ZipInputStream ZipInputStream}. See {@link #copyInputStreamToFile(InputStream, File)} for a
     * method that closes the input stream.
     *
     * @param inputStream the {@code InputStream} to copy bytes from, must not be {@code null}
     * @param file the non-directory {@code File} to write bytes to (possibly overwriting), must not be
     *        {@code null}
     * @throws NullPointerException if the InputStream is {@code null}.
     * @throws NullPointerException if the File is {@code null}.
     * @throws IllegalArgumentException if the file object is a directory.
     * @throws IllegalArgumentException if the file is not writable.
     * @throws IOException if the directories could not be created.
     * @throws IOException if an IO error occurs during copying.
     * @since 2.5
     */
    public static void copyToFile(final InputStream inputStream, final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(980);
        class __CLR4_4_1$AC5 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(981);try (__CLR4_4_1$AC5 __CLR$ACI7=new __CLR4_4_1$AC5(){{__CLR4_4_1l5l5kylvdypm.R.inc(982);}};OutputStream out = openOutputStream(file)) {
            __CLR4_4_1l5l5kylvdypm.R.inc(983);IOUtils.copy(inputStream, out);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies bytes from the URL {@code source} to a file
     * {@code destination}. The directories up to {@code destination}
     * will be created if they don't already exist. {@code destination}
     * will be overwritten if it already exists.
     * <p>
     * Warning: this method does not set a connection or read timeout and thus
     * might block forever. Use {@link #copyURLToFile(URL, File, int, int)}
     * with reasonable timeouts to prevent this.
     * </p>
     *
     * @param source      the {@code URL} to copy bytes from, must not be {@code null}
     * @param destination the non-directory {@code File} to write bytes to
     *                    (possibly overwriting), must not be {@code null}
     * @throws IOException if {@code source} URL cannot be opened
     * @throws IOException if {@code destination} is a directory
     * @throws IOException if {@code destination} cannot be written
     * @throws IOException if {@code destination} needs creating but can't be
     * @throws IOException if an IO error occurs during copying
     */
    public static void copyURLToFile(final URL source, final File destination) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(984);
        class __CLR4_4_1$AC6 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(985);try (__CLR4_4_1$AC6 __CLR$ACI8=new __CLR4_4_1$AC6(){{__CLR4_4_1l5l5kylvdypm.R.inc(986);}};final InputStream stream = source.openStream()) {
            __CLR4_4_1l5l5kylvdypm.R.inc(987);copyInputStreamToFile(stream, destination);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Copies bytes from the URL {@code source} to a file {@code destination}. The directories up to
     * {@code destination} will be created if they don't already exist. {@code destination} will be
     * overwritten if it already exists.
     *
     * @param source the {@code URL} to copy bytes from, must not be {@code null}
     * @param destination the non-directory {@code File} to write bytes to (possibly overwriting), must not be
     *        {@code null}
     * @param connectionTimeoutMillis the number of milliseconds until this method will timeout if no connection could
     *        be established to the {@code source}
     * @param readTimeoutMillis the number of milliseconds until this method will timeout if no data could be read from
     *        the {@code source}
     * @throws IOException if {@code source} URL cannot be opened
     * @throws IOException if {@code destination} is a directory
     * @throws IOException if {@code destination} cannot be written
     * @throws IOException if {@code destination} needs creating but can't be
     * @throws IOException if an IO error occurs during copying
     * @since 2.0
     */
    public static void copyURLToFile(final URL source, final File destination,
        final int connectionTimeoutMillis, final int readTimeoutMillis) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(988);
        __CLR4_4_1l5l5kylvdypm.R.inc(989);final URLConnection connection = source.openConnection();
        __CLR4_4_1l5l5kylvdypm.R.inc(990);connection.setConnectTimeout(connectionTimeoutMillis);
        __CLR4_4_1l5l5kylvdypm.R.inc(991);connection.setReadTimeout(readTimeoutMillis);
        class __CLR4_4_1$AC7 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(992);try (__CLR4_4_1$AC7 __CLR$ACI9=new __CLR4_4_1$AC7(){{__CLR4_4_1l5l5kylvdypm.R.inc(993);}};final InputStream stream = connection.getInputStream()) {
            __CLR4_4_1l5l5kylvdypm.R.inc(994);copyInputStreamToFile(stream, destination);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}


    /**
     * Creates all parent directories for a File object.
     *
     * @param file the File that may need parents, may be null.
     * @return The parent directory, or {@code null} if the given file does not name a parent
     * @throws IOException if the directory was not created along with all its parent directories.
     * @throws IOException if the given file object is not null and not a directory.
     * @since 2.9.0
     */
    public static File createParentDirectories(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(995);
        __CLR4_4_1l5l5kylvdypm.R.inc(996);return mkdirs(getParentFile(file));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Decodes the specified URL as per RFC 3986, i.e. transforms
     * percent-encoded octets to characters by decoding with the UTF-8 character
     * set. This function is primarily intended for usage with
     * {@link java.net.URL} which unfortunately does not enforce proper URLs. As
     * such, this method will leniently accept invalid characters or malformed
     * percent-encoded octets and simply pass them literally through to the
     * result string. Except for rare edge cases, this will make unencoded URLs
     * pass through unaltered.
     *
     * @param url The URL to decode, may be {@code null}.
     * @return The decoded URL or {@code null} if the input was
     * {@code null}.
     */
    static String decodeUrl(final String url) {try{__CLR4_4_1l5l5kylvdypm.R.inc(997);
        __CLR4_4_1l5l5kylvdypm.R.inc(998);String decoded = url;
        __CLR4_4_1l5l5kylvdypm.R.inc(999);if ((((url != null && url.indexOf('%') >= 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1000)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1001)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1002);final int n = url.length();
            __CLR4_4_1l5l5kylvdypm.R.inc(1003);final StringBuilder buffer = new StringBuilder();
            __CLR4_4_1l5l5kylvdypm.R.inc(1004);final ByteBuffer bytes = ByteBuffer.allocate(n);
            __CLR4_4_1l5l5kylvdypm.R.inc(1005);for (int i = 0; (((i < n)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1006)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1007)==0&false)); ) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1008);if ((((url.charAt(i) == '%')&&(__CLR4_4_1l5l5kylvdypm.R.iget(1009)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1010)==0&false))) {{
                    __CLR4_4_1l5l5kylvdypm.R.inc(1011);try {
                        __CLR4_4_1l5l5kylvdypm.R.inc(1012);do {{
                            __CLR4_4_1l5l5kylvdypm.R.inc(1013);final byte octet = (byte) Integer.parseInt(url.substring(i + 1, i + 3), 16);
                            __CLR4_4_1l5l5kylvdypm.R.inc(1014);bytes.put(octet);
                            __CLR4_4_1l5l5kylvdypm.R.inc(1015);i += 3;
                        } }while ((((i < n && url.charAt(i) == '%')&&(__CLR4_4_1l5l5kylvdypm.R.iget(1016)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1017)==0&false)));
                        __CLR4_4_1l5l5kylvdypm.R.inc(1018);continue;
                    } catch (final RuntimeException e) {
                        // malformed percent-encoded octet, fall through and
                        // append characters literally
                    } finally {
                        __CLR4_4_1l5l5kylvdypm.R.inc(1019);if ((((bytes.position() > 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1020)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1021)==0&false))) {{
                            __CLR4_4_1l5l5kylvdypm.R.inc(1022);bytes.flip();
                            __CLR4_4_1l5l5kylvdypm.R.inc(1023);buffer.append(StandardCharsets.UTF_8.decode(bytes).toString());
                            __CLR4_4_1l5l5kylvdypm.R.inc(1024);bytes.clear();
                        }
                    }}
                }
                }__CLR4_4_1l5l5kylvdypm.R.inc(1025);buffer.append(url.charAt(i++));
            }
            }__CLR4_4_1l5l5kylvdypm.R.inc(1026);decoded = buffer.toString();
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1027);return decoded;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Deletes the given File but throws an IOException if it cannot, unlike {@link File#delete()} which returns a
     * boolean.
     *
     * @param file The file to delete.
     * @return the given file.
     * @throws IOException if the file cannot be deleted.
     * @see File#delete()
     * @since 2.9.0
     */
    public static File delete(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1028);
        __CLR4_4_1l5l5kylvdypm.R.inc(1029);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1030);Files.delete(file.toPath());
        __CLR4_4_1l5l5kylvdypm.R.inc(1031);return file;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Deletes a directory recursively.
     *
     * @param directory directory to delete
     * @throws IOException              in case deletion is unsuccessful
     * @throws IllegalArgumentException if {@code directory} is not a directory
     */
    public static void deleteDirectory(final File directory) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1032);
        __CLR4_4_1l5l5kylvdypm.R.inc(1033);Objects.requireNonNull(directory, "directory");
        __CLR4_4_1l5l5kylvdypm.R.inc(1034);if ((((!directory.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1035)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1036)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1037);return;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1038);if ((((!isSymlink(directory))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1039)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1040)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1041);cleanDirectory(directory);
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1042);delete(directory);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Schedules a directory recursively for deletion on JVM exit.
     *
     * @param directory directory to delete, must not be {@code null}
     * @throws NullPointerException if the directory is {@code null}
     * @throws IOException          in case deletion is unsuccessful
     */
    private static void deleteDirectoryOnExit(final File directory) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1043);
        __CLR4_4_1l5l5kylvdypm.R.inc(1044);if ((((!directory.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1045)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1046)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1047);return;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1048);directory.deleteOnExit();
        __CLR4_4_1l5l5kylvdypm.R.inc(1049);if ((((!isSymlink(directory))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1050)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1051)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1052);cleanDirectoryOnExit(directory);
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Deletes a file, never throwing an exception. If file is a directory, delete it and all sub-directories.
     * <p>
     * The difference between File.delete() and this method are:
     * </p>
     * <ul>
     * <li>A directory to be deleted does not have to be empty.</li>
     * <li>No exceptions are thrown when a file or directory cannot be deleted.</li>
     * </ul>
     *
     * @param file file or directory to delete, can be {@code null}
     * @return {@code true} if the file or directory was deleted, otherwise
     * {@code false}
     *
     * @since 1.4
     */
    public static boolean deleteQuietly(final File file) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1053);
        __CLR4_4_1l5l5kylvdypm.R.inc(1054);if ((((file == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1055)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1056)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1057);return false;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1058);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1059);if ((((file.isDirectory())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1060)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1061)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1062);cleanDirectory(file);
            }
        }} catch (final Exception ignored) {
            // ignore
        }

        __CLR4_4_1l5l5kylvdypm.R.inc(1063);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1064);return file.delete();
        } catch (final Exception ignored) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1065);return false;
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Determines whether the {@code parent} directory contains the {@code child} element (a file or directory).
     * <p>
     * Files are normalized before comparison.
     * </p>
     *
     * Edge cases:
     * <ul>
     * <li>A {@code directory} must not be null: if null, throw IllegalArgumentException</li>
     * <li>A {@code directory} must be a directory: if not a directory, throw IllegalArgumentException</li>
     * <li>A directory does not contain itself: return false</li>
     * <li>A null child file is not contained in any parent: return false</li>
     * </ul>
     *
     * @param directory the file to consider as the parent.
     * @param child     the file to consider as the child.
     * @return true is the candidate leaf is under by the specified composite. False otherwise.
     * @throws IOException              if an IO error occurs while checking the files.
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if the given {@code File} does not exist or is not a directory.
     * @see FilenameUtils#directoryContains(String, String)
     * @since 2.2
     */
    public static boolean directoryContains(final File directory, final File child) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1066);
        __CLR4_4_1l5l5kylvdypm.R.inc(1067);requireDirectoryExists(directory, "directory");

        __CLR4_4_1l5l5kylvdypm.R.inc(1068);if ((((child == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1069)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1070)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1071);return false;
        }

        }__CLR4_4_1l5l5kylvdypm.R.inc(1072);if ((((!directory.exists() || !child.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1073)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1074)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1075);return false;
        }

        // Canonicalize paths (normalizes relative paths)
        }__CLR4_4_1l5l5kylvdypm.R.inc(1076);return FilenameUtils.directoryContains(directory.getCanonicalPath(), child.getCanonicalPath());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Internal copy directory method.
     *
     * @param srcDir the validated source directory, must not be {@code null}.
     * @param destDir the validated destination directory, must not be {@code null}.
     * @param fileFilter the filter to apply, null means copy all directories and files.
     * @param exclusionList List of files and directories to exclude from the copy, may be null.
     * @param preserveDirDate preserve the directories last modified dates.
     * @param copyOptions options specifying how the copy should be done, see {@link StandardCopyOption}.
     * @throws IOException if the directory was not created along with all its parent directories.
     * @throws IOException if the given file object is not a directory.
     */
    private static void doCopyDirectory(final File srcDir, final File destDir, final FileFilter fileFilter,
                                        final List<String> exclusionList, final boolean preserveDirDate, final CopyOption... copyOptions) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1077);
        // recurse dirs, copy files.
        __CLR4_4_1l5l5kylvdypm.R.inc(1078);final File[] srcFiles = listFiles(srcDir, fileFilter);
        __CLR4_4_1l5l5kylvdypm.R.inc(1079);requireDirectoryIfExists(destDir, "destDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(1080);mkdirs(destDir);
        __CLR4_4_1l5l5kylvdypm.R.inc(1081);requireCanWrite(destDir, "destDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(1082);for (final File srcFile : srcFiles) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1083);final File dstFile = new File(destDir, srcFile.getName());
            __CLR4_4_1l5l5kylvdypm.R.inc(1084);if ((((exclusionList == null || !exclusionList.contains(srcFile.getCanonicalPath()))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1085)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1086)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1087);if ((((srcFile.isDirectory())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1088)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1089)==0&false))) {{
                    __CLR4_4_1l5l5kylvdypm.R.inc(1090);doCopyDirectory(srcFile, dstFile, fileFilter, exclusionList, preserveDirDate, copyOptions);
                } }else {{
                    __CLR4_4_1l5l5kylvdypm.R.inc(1091);copyFile(srcFile, dstFile, copyOptions);
                }
            }}
        }}
        // Do this last, as the above has probably affected directory metadata
        }__CLR4_4_1l5l5kylvdypm.R.inc(1092);if ((((preserveDirDate)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1093)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1094)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1095);setLastModified(srcDir, destDir);
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Deletes a file or directory. For a directory, delete it and all sub-directories.
     * <p>
     * The difference between File.delete() and this method are:
     * </p>
     * <ul>
     * <li>The directory does not have to be empty.</li>
     * <li>You get an exception when a file or directory cannot be deleted.</li>
     * </ul>
     *
     * @param file file or directory to delete, must not be {@code null}.
     * @throws NullPointerException  if the file is {@code null}.
     * @throws FileNotFoundException if the file was not found.
     * @throws IOException           in case deletion is unsuccessful.
     */
    public static void forceDelete(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1096);
        __CLR4_4_1l5l5kylvdypm.R.inc(1097);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1098);final Counters.PathCounters deleteCounters;
        __CLR4_4_1l5l5kylvdypm.R.inc(1099);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1100);deleteCounters = PathUtils.delete(file.toPath(), PathUtils.EMPTY_LINK_OPTION_ARRAY,
                StandardDeleteOption.OVERRIDE_READ_ONLY);
        } catch (final IOException e) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1101);throw new IOException("Cannot delete file: " + file, e);
        }

        __CLR4_4_1l5l5kylvdypm.R.inc(1102);if ((((deleteCounters.getFileCounter().get() < 1 && deleteCounters.getDirectoryCounter().get() < 1)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1103)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1104)==0&false))) {{
            // didn't find a file to delete.
            __CLR4_4_1l5l5kylvdypm.R.inc(1105);throw new FileNotFoundException("File does not exist: " + file);
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Schedules a file to be deleted when JVM exits.
     * If file is directory delete it and all sub-directories.
     *
     * @param file file or directory to delete, must not be {@code null}.
     * @throws NullPointerException if the file is {@code null}.
     * @throws IOException          in case deletion is unsuccessful.
     */
    public static void forceDeleteOnExit(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1106);
        __CLR4_4_1l5l5kylvdypm.R.inc(1107);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1108);if ((((file.isDirectory())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1109)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1110)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1111);deleteDirectoryOnExit(file);
        } }else {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1112);file.deleteOnExit();
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Makes a directory, including any necessary but nonexistent parent
     * directories. If a file already exists with specified name but it is
     * not a directory then an IOException is thrown.
     * If the directory cannot be created (or the file already exists but is not a directory)
     * then an IOException is thrown.
     *
     * @param directory directory to create, must not be {@code null}.
     * @throws IOException if the directory was not created along with all its parent directories.
     * @throws IOException if the given file object is not a directory.
     * @throws SecurityException See {@link File#mkdirs()}.
     */
    public static void forceMkdir(final File directory) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1113);
        __CLR4_4_1l5l5kylvdypm.R.inc(1114);mkdirs(directory);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Makes any necessary but nonexistent parent directories for a given File. If the parent directory cannot be
     * created then an IOException is thrown.
     *
     * @param file file with parent to create, must not be {@code null}.
     * @throws NullPointerException if the file is {@code null}.
     * @throws IOException          if the parent directory cannot be created.
     * @since 2.5
     */
    public static void forceMkdirParent(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1115);
        __CLR4_4_1l5l5kylvdypm.R.inc(1116);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1117);final File parent = getParentFile(file);
        __CLR4_4_1l5l5kylvdypm.R.inc(1118);if ((((parent == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1119)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1120)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1121);return;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1122);forceMkdir(parent);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Construct a file from the set of name elements.
     *
     * @param directory the parent directory.
     * @param names the name elements.
     * @return the new file.
     * @since 2.1
     */
    public static File getFile(final File directory, final String... names) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1123);
        __CLR4_4_1l5l5kylvdypm.R.inc(1124);Objects.requireNonNull(directory, "directory");
        __CLR4_4_1l5l5kylvdypm.R.inc(1125);Objects.requireNonNull(names, "names");
        __CLR4_4_1l5l5kylvdypm.R.inc(1126);File file = directory;
        __CLR4_4_1l5l5kylvdypm.R.inc(1127);for (final String name : names) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1128);file = new File(file, name);
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1129);return file;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Construct a file from the set of name elements.
     *
     * @param names the name elements.
     * @return the file.
     * @since 2.1
     */
    public static File getFile(final String... names) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1130);
        __CLR4_4_1l5l5kylvdypm.R.inc(1131);Objects.requireNonNull(names, "names");
        __CLR4_4_1l5l5kylvdypm.R.inc(1132);File file = null;
        __CLR4_4_1l5l5kylvdypm.R.inc(1133);for (final String name : names) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1134);if ((((file == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1135)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1136)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1137);file = new File(name);
            } }else {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1138);file = new File(file, name);
            }
        }}
        }__CLR4_4_1l5l5kylvdypm.R.inc(1139);return file;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Gets the parent of the given file. The given file may be bull and a file's parent may as well be null.
     *
     * @param file The file to query.
     * @return The parent file or {@code null}.
     */
    private static File getParentFile(final File file) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1140);
        __CLR4_4_1l5l5kylvdypm.R.inc(1141);return (((file == null )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1142)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1143)==0&false))? null : file.getParentFile();
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns a {@link File} representing the system temporary directory.
     *
     * @return the system temporary directory.
     *
     * @since 2.0
     */
    public static File getTempDirectory() {try{__CLR4_4_1l5l5kylvdypm.R.inc(1144);
        __CLR4_4_1l5l5kylvdypm.R.inc(1145);return new File(getTempDirectoryPath());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns the path to the system temporary directory.
     *
     * @return the path to the system temporary directory.
     *
     * @since 2.0
     */
    public static String getTempDirectoryPath() {try{__CLR4_4_1l5l5kylvdypm.R.inc(1146);
        __CLR4_4_1l5l5kylvdypm.R.inc(1147);return System.getProperty("java.io.tmpdir");
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns a {@link File} representing the user's home directory.
     *
     * @return the user's home directory.
     *
     * @since 2.0
     */
    public static File getUserDirectory() {try{__CLR4_4_1l5l5kylvdypm.R.inc(1148);
        __CLR4_4_1l5l5kylvdypm.R.inc(1149);return new File(getUserDirectoryPath());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns the path to the user's home directory.
     *
     * @return the path to the user's home directory.
     *
     * @since 2.0
     */
    public static String getUserDirectoryPath() {try{__CLR4_4_1l5l5kylvdypm.R.inc(1150);
        __CLR4_4_1l5l5kylvdypm.R.inc(1151);return System.getProperty("user.home");
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests whether the specified {@code File} is a directory or not. Implemented as a
     * null-safe delegate to {@code Files.isDirectory(Path path, LinkOption... options)}.
     *
     * @param   file the path to the file.
     * @param   options options indicating how symbolic links are handled
     * @return  {@code true} if the file is a directory; {@code false} if
     *          the path is null, the file does not exist, is not a directory, or it cannot
     *          be determined if the file is a directory or not.
     * @throws SecurityException     In the case of the default provider, and a security manager is installed, the
     *                               {@link SecurityManager#checkRead(String) checkRead} method is invoked to check read
     *                               access to the directory.
     * @since 2.9.0
     */
    public static boolean isDirectory(final File file, final LinkOption... options) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1152);
        __CLR4_4_1l5l5kylvdypm.R.inc(1153);return file != null && Files.isDirectory(file.toPath(), options);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests whether the directory is empty.
     *
     * @param directory the directory to query.
     * @return whether the directory is empty.
     * @throws IOException if an I/O error occurs.
     * @throws NotDirectoryException if the file could not otherwise be opened because it is not a directory
     *                               <i>(optional specific exception)</i>.
     * @since 2.9.0
     */
    public static boolean isEmptyDirectory(final File directory) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1154);
        __CLR4_4_1l5l5kylvdypm.R.inc(1155);return PathUtils.isEmptyDirectory(directory.toPath());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is newer than the specified {@code ChronoLocalDate}
     * at the current time.
     *
     * <p>Note: The input date is assumed to be in the system default time-zone with the time
     * part set to the current time. To use a non-default time-zone use the method
     * {@link #isFileNewer(File, ChronoLocalDateTime, ZoneId)
     * isFileNewer(file, chronoLocalDate.atTime(LocalTime.now(zoneId)), zoneId)} where
     * {@code zoneId} is a valid {@link ZoneId}.
     *
     * @param file            the {@code File} of which the modification date must be compared.
     * @param chronoLocalDate the date reference.
     * @return true if the {@code File} exists and has been modified after the given
     * {@code ChronoLocalDate} at the current time.
     * @throws NullPointerException if the file or local date is {@code null}.
     *
     * @since 2.8.0
     */
    public static boolean isFileNewer(final File file, final ChronoLocalDate chronoLocalDate) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1156);
        __CLR4_4_1l5l5kylvdypm.R.inc(1157);return isFileNewer(file, chronoLocalDate, LocalTime.now());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is newer than the specified {@code ChronoLocalDate}
     * at the specified time.
     *
     * <p>Note: The input date and time are assumed to be in the system default time-zone. To use a
     * non-default time-zone use the method {@link #isFileNewer(File, ChronoLocalDateTime, ZoneId)
     * isFileNewer(file, chronoLocalDate.atTime(localTime), zoneId)} where {@code zoneId} is a valid
     * {@link ZoneId}.
     *
     * @param file            the {@code File} of which the modification date must be compared.
     * @param chronoLocalDate the date reference.
     * @param localTime       the time reference.
     * @return true if the {@code File} exists and has been modified after the given
     * {@code ChronoLocalDate} at the given time.
     * @throws NullPointerException if the file, local date or zone ID is {@code null}.
     *
     * @since 2.8.0
     */
    public static boolean isFileNewer(final File file, final ChronoLocalDate chronoLocalDate, final LocalTime localTime) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1158);
        __CLR4_4_1l5l5kylvdypm.R.inc(1159);Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        __CLR4_4_1l5l5kylvdypm.R.inc(1160);Objects.requireNonNull(localTime, "localTime");
        __CLR4_4_1l5l5kylvdypm.R.inc(1161);return isFileNewer(file, chronoLocalDate.atTime(localTime));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is newer than the specified {@code ChronoLocalDateTime}
     * at the system-default time zone.
     *
     * <p>Note: The input date and time is assumed to be in the system default time-zone. To use a
     * non-default time-zone use the method {@link #isFileNewer(File, ChronoLocalDateTime, ZoneId)
     * isFileNewer(file, chronoLocalDateTime, zoneId)} where {@code zoneId} is a valid
     * {@link ZoneId}.
     *
     * @param file                the {@code File} of which the modification date must be compared.
     * @param chronoLocalDateTime the date reference.
     * @return true if the {@code File} exists and has been modified after the given
     * {@code ChronoLocalDateTime} at the system-default time zone.
     * @throws NullPointerException if the file or local date time is {@code null}.
     *
     * @since 2.8.0
     */
    public static boolean isFileNewer(final File file, final ChronoLocalDateTime<?> chronoLocalDateTime) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1162);
        __CLR4_4_1l5l5kylvdypm.R.inc(1163);return isFileNewer(file, chronoLocalDateTime, ZoneId.systemDefault());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is newer than the specified {@code ChronoLocalDateTime}
     * at the specified {@code ZoneId}.
     *
     * @param file                the {@code File} of which the modification date must be compared.
     * @param chronoLocalDateTime the date reference.
     * @param zoneId              the time zone.
     * @return true if the {@code File} exists and has been modified after the given
     * {@code ChronoLocalDateTime} at the given {@code ZoneId}.
     * @throws NullPointerException if the file, local date time or zone ID is {@code null}.
     *
     * @since 2.8.0
     */
    public static boolean isFileNewer(final File file, final ChronoLocalDateTime<?> chronoLocalDateTime, final ZoneId zoneId) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1164);
        __CLR4_4_1l5l5kylvdypm.R.inc(1165);Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        __CLR4_4_1l5l5kylvdypm.R.inc(1166);Objects.requireNonNull(zoneId, "zoneId");
        __CLR4_4_1l5l5kylvdypm.R.inc(1167);return isFileNewer(file, chronoLocalDateTime.atZone(zoneId));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is newer than the specified {@code ChronoZonedDateTime}.
     *
     * @param file                the {@code File} of which the modification date must be compared.
     * @param chronoZonedDateTime the date reference.
     * @return true if the {@code File} exists and has been modified after the given
     * {@code ChronoZonedDateTime}.
     * @throws NullPointerException if the file or zoned date time is {@code null}.
     *
     * @since 2.8.0
     */
    public static boolean isFileNewer(final File file, final ChronoZonedDateTime<?> chronoZonedDateTime) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1168);
        __CLR4_4_1l5l5kylvdypm.R.inc(1169);Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        __CLR4_4_1l5l5kylvdypm.R.inc(1170);return isFileNewer(file, chronoZonedDateTime.toInstant());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is newer than the specified {@code Date}.
     *
     * @param file the {@code File} of which the modification date must be compared.
     * @param date the date reference.
     * @return true if the {@code File} exists and has been modified
     * after the given {@code Date}.
     * @throws NullPointerException if the file or date is {@code null}.
     */
    public static boolean isFileNewer(final File file, final Date date) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1171);
        __CLR4_4_1l5l5kylvdypm.R.inc(1172);Objects.requireNonNull(date, "date");
        __CLR4_4_1l5l5kylvdypm.R.inc(1173);return isFileNewer(file, date.getTime());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is newer than the reference {@code File}.
     *
     * @param file      the {@code File} of which the modification date must be compared.
     * @param reference the {@code File} of which the modification date is used.
     * @return true if the {@code File} exists and has been modified more
     * recently than the reference {@code File}.
     * @throws NullPointerException if the file or reference file is {@code null}.
     * @throws IllegalArgumentException if the reference file doesn't exist.
     */
    public static boolean isFileNewer(final File file, final File reference) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1174);
        __CLR4_4_1l5l5kylvdypm.R.inc(1175);requireExists(reference, "reference");
        __CLR4_4_1l5l5kylvdypm.R.inc(1176);return isFileNewer(file, lastModifiedUnchecked(reference));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is newer than the specified {@code Instant}.
     *
     * @param file    the {@code File} of which the modification date must be compared.
     * @param instant the date reference.
     * @return true if the {@code File} exists and has been modified after the given {@code Instant}.
     * @throws NullPointerException if the file or instant is {@code null}.
     *
     * @since 2.8.0
     */
    public static boolean isFileNewer(final File file, final Instant instant) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1177);
        __CLR4_4_1l5l5kylvdypm.R.inc(1178);Objects.requireNonNull(instant, "instant");
        __CLR4_4_1l5l5kylvdypm.R.inc(1179);return isFileNewer(file, instant.toEpochMilli());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is newer than the specified time reference.
     *
     * @param file       the {@code File} of which the modification date must be compared.
     * @param timeMillis the time reference measured in milliseconds since the
     *                   epoch (00:00:00 GMT, January 1, 1970).
     * @return true if the {@code File} exists and has been modified after the given time reference.
     * @throws NullPointerException if the file is {@code null}.
     */
    public static boolean isFileNewer(final File file, final long timeMillis) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1180);
        __CLR4_4_1l5l5kylvdypm.R.inc(1181);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1182);return file.exists() && lastModifiedUnchecked(file) > timeMillis;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is older than the specified {@code ChronoLocalDate}
     * at the current time.
     *
     * <p>Note: The input date is assumed to be in the system default time-zone with the time
     * part set to the current time. To use a non-default time-zone use the method
     * {@link #isFileOlder(File, ChronoLocalDateTime, ZoneId)
     * isFileOlder(file, chronoLocalDate.atTime(LocalTime.now(zoneId)), zoneId)} where
     * {@code zoneId} is a valid {@link ZoneId}.
     *
     * @param file            the {@code File} of which the modification date must be compared.
     * @param chronoLocalDate the date reference.
     * @return true if the {@code File} exists and has been modified before the given
     * {@code ChronoLocalDate} at the current time.
     * @throws NullPointerException if the file or local date is {@code null}.
     * @see ZoneId#systemDefault()
     * @see LocalTime#now()
     *
     * @since 2.8.0
     */
    public static boolean isFileOlder(final File file, final ChronoLocalDate chronoLocalDate) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1183);
        __CLR4_4_1l5l5kylvdypm.R.inc(1184);return isFileOlder(file, chronoLocalDate, LocalTime.now());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is older than the specified {@code ChronoLocalDate}
     * at the specified {@code LocalTime}.
     *
     * <p>Note: The input date and time are assumed to be in the system default time-zone. To use a
     * non-default time-zone use the method {@link #isFileOlder(File, ChronoLocalDateTime, ZoneId)
     * isFileOlder(file, chronoLocalDate.atTime(localTime), zoneId)} where {@code zoneId} is a valid
     * {@link ZoneId}.
     *
     * @param file            the {@code File} of which the modification date must be compared.
     * @param chronoLocalDate the date reference.
     * @param localTime       the time reference.
     * @return true if the {@code File} exists and has been modified before the
     * given {@code ChronoLocalDate} at the specified time.
     * @throws NullPointerException if the file, local date or local time is {@code null}.
     * @see ZoneId#systemDefault()
     *
     * @since 2.8.0
     */
    public static boolean isFileOlder(final File file, final ChronoLocalDate chronoLocalDate, final LocalTime localTime) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1185);
        __CLR4_4_1l5l5kylvdypm.R.inc(1186);Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        __CLR4_4_1l5l5kylvdypm.R.inc(1187);Objects.requireNonNull(localTime, "localTime");
        __CLR4_4_1l5l5kylvdypm.R.inc(1188);return isFileOlder(file, chronoLocalDate.atTime(localTime));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is older than the specified {@code ChronoLocalDateTime}
     * at the system-default time zone.
     *
     * <p>Note: The input date and time is assumed to be in the system default time-zone. To use a
     * non-default time-zone use the method {@link #isFileOlder(File, ChronoLocalDateTime, ZoneId)
     * isFileOlder(file, chronoLocalDateTime, zoneId)} where {@code zoneId} is a valid
     * {@link ZoneId}.
     *
     * @param file                the {@code File} of which the modification date must be compared.
     * @param chronoLocalDateTime the date reference.
     * @return true if the {@code File} exists and has been modified before the given
     * {@code ChronoLocalDateTime} at the system-default time zone.
     * @throws NullPointerException if the file or local date time is {@code null}.
     * @see ZoneId#systemDefault()
     *
     * @since 2.8.0
     */
    public static boolean isFileOlder(final File file, final ChronoLocalDateTime<?> chronoLocalDateTime) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1189);
        __CLR4_4_1l5l5kylvdypm.R.inc(1190);return isFileOlder(file, chronoLocalDateTime, ZoneId.systemDefault());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is older than the specified {@code ChronoLocalDateTime}
     * at the specified {@code ZoneId}.
     *
     * @param file          the {@code File} of which the modification date must be compared.
     * @param chronoLocalDateTime the date reference.
     * @param zoneId        the time zone.
     * @return true if the {@code File} exists and has been modified before the given
     * {@code ChronoLocalDateTime} at the given {@code ZoneId}.
     * @throws NullPointerException if the file, local date time or zone ID is {@code null}.
     *
     * @since 2.8.0
     */
    public static boolean isFileOlder(final File file, final ChronoLocalDateTime<?> chronoLocalDateTime, final ZoneId zoneId) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1191);
        __CLR4_4_1l5l5kylvdypm.R.inc(1192);Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        __CLR4_4_1l5l5kylvdypm.R.inc(1193);Objects.requireNonNull(zoneId, "zoneId");
        __CLR4_4_1l5l5kylvdypm.R.inc(1194);return isFileOlder(file, chronoLocalDateTime.atZone(zoneId));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is older than the specified {@code ChronoZonedDateTime}.
     *
     * @param file                the {@code File} of which the modification date must be compared.
     * @param chronoZonedDateTime the date reference.
     * @return true if the {@code File} exists and has been modified before the given
     * {@code ChronoZonedDateTime}.
     * @throws NullPointerException if the file or zoned date time is {@code null}.
     *
     * @since 2.8.0
     */
    public static boolean isFileOlder(final File file, final ChronoZonedDateTime<?> chronoZonedDateTime) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1195);
        __CLR4_4_1l5l5kylvdypm.R.inc(1196);Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        __CLR4_4_1l5l5kylvdypm.R.inc(1197);return isFileOlder(file, chronoZonedDateTime.toInstant());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is older than the specified {@code Date}.
     *
     * @param file the {@code File} of which the modification date must be compared.
     * @param date the date reference.
     * @return true if the {@code File} exists and has been modified before the given {@code Date}.
     * @throws NullPointerException if the file or date is {@code null}.
     */
    public static boolean isFileOlder(final File file, final Date date) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1198);
        __CLR4_4_1l5l5kylvdypm.R.inc(1199);Objects.requireNonNull(date, "date");
        __CLR4_4_1l5l5kylvdypm.R.inc(1200);return isFileOlder(file, date.getTime());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is older than the reference {@code File}.
     *
     * @param file      the {@code File} of which the modification date must be compared.
     * @param reference the {@code File} of which the modification date is used.
     * @return true if the {@code File} exists and has been modified before the reference {@code File}.
     * @throws NullPointerException if the file or reference file is {@code null}.
     * @throws IllegalArgumentException if the reference file doesn't exist.
     */
    public static boolean isFileOlder(final File file, final File reference) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1201);
        __CLR4_4_1l5l5kylvdypm.R.inc(1202);requireExists(reference, "reference");
        __CLR4_4_1l5l5kylvdypm.R.inc(1203);return isFileOlder(file, lastModifiedUnchecked(reference));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is older than the specified {@code Instant}.
     *
     * @param file    the {@code File} of which the modification date must be compared.
     * @param instant the date reference.
     * @return true if the {@code File} exists and has been modified before the given {@code Instant}.
     * @throws NullPointerException if the file or instant is {@code null}.
     * @since 2.8.0
     */
    public static boolean isFileOlder(final File file, final Instant instant) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1204);
        __CLR4_4_1l5l5kylvdypm.R.inc(1205);Objects.requireNonNull(instant, "instant");
        __CLR4_4_1l5l5kylvdypm.R.inc(1206);return isFileOlder(file, instant.toEpochMilli());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests if the specified {@code File} is older than the specified time reference.
     *
     * @param file       the {@code File} of which the modification date must be compared.
     * @param timeMillis the time reference measured in milliseconds since the
     *                   epoch (00:00:00 GMT, January 1, 1970).
     * @return true if the {@code File} exists and has been modified before the given time reference.
     * @throws NullPointerException if the file is {@code null}.
     */
    public static boolean isFileOlder(final File file, final long timeMillis) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1207);
        __CLR4_4_1l5l5kylvdypm.R.inc(1208);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1209);return file.exists() && lastModifiedUnchecked(file) < timeMillis;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests whether the specified {@code File} is a regular file or not. Implemented as a
     * null-safe delegate to {@code Files.isRegularFile(Path path, LinkOption... options)}.
     *
     * @param   file the path to the file.
     * @param   options options indicating how symbolic links are handled
     * @return  {@code true} if the file is a regular file; {@code false} if
     *          the path is null, the file does not exist, is not a directory, or it cannot
     *          be determined if the file is a regular file or not.
     * @throws SecurityException     In the case of the default provider, and a security manager is installed, the
     *                               {@link SecurityManager#checkRead(String) checkRead} method is invoked to check read
     *                               access to the directory.
     * @since 2.9.0
     */
    public static boolean isRegularFile(final File file, final LinkOption... options) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1210);
        __CLR4_4_1l5l5kylvdypm.R.inc(1211);return file != null && Files.isRegularFile(file.toPath(), options);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Tests whether the specified file is a symbolic link rather than an actual file.
     * <p>
     * This method delegates to {@link Files#isSymbolicLink(Path path)}
     * </p>
     *
     * @param file the file to test.
     * @return true if the file is a symbolic link, see {@link Files#isSymbolicLink(Path path)}.
     * @since 2.0
     * @see Files#isSymbolicLink(Path)
     */
    public static boolean isSymlink(final File file) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1212);
        __CLR4_4_1l5l5kylvdypm.R.inc(1213);return file != null && Files.isSymbolicLink(file.toPath());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Iterates over the files in given directory (and optionally
     * its subdirectories).
     * <p>
     * The resulting iterator MUST be consumed in its entirety in order to close its underlying stream.
     * </p>
     * <p>
     * All files found are filtered by an IOFileFilter.
     * </p>
     *
     * @param directory  the directory to search in
     * @param fileFilter filter to apply when finding files.
     * @param dirFilter  optional filter to apply when finding subdirectories.
     *                   If this parameter is {@code null}, subdirectories will not be included in the
     *                   search. Use TrueFileFilter.INSTANCE to match all directories.
     * @return an iterator of java.io.File for the matching files
     * @see org.apache.commons.io.filefilter.FileFilterUtils
     * @see org.apache.commons.io.filefilter.NameFileFilter
     * @since 1.2
     */
    public static Iterator<File> iterateFiles(final File directory, final IOFileFilter fileFilter,
        final IOFileFilter dirFilter) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1214);
        __CLR4_4_1l5l5kylvdypm.R.inc(1215);return listFiles(directory, fileFilter, dirFilter).iterator();
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Iterates over the files in a given directory (and optionally
     * its subdirectories) which match an array of extensions.
     * <p>
     * The resulting iterator MUST be consumed in its entirety in order to close its underlying stream.
     * </p>
     * <p>
     *
     * @param directory  the directory to search in
     * @param extensions an array of extensions, ex. {"java","xml"}. If this
     *                   parameter is {@code null}, all files are returned.
     * @param recursive  if true all subdirectories are searched as well
     * @return an iterator of java.io.File with the matching files
     * @since 1.2
     */
    public static Iterator<File> iterateFiles(final File directory, final String[] extensions,
        final boolean recursive) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1216);
        __CLR4_4_1l5l5kylvdypm.R.inc(1217);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1218);return StreamIterator.iterator(streamFiles(directory, recursive, extensions));
        } catch (final IOException e) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1219);throw new UncheckedIOException(directory.toString(), e);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Iterates over the files in given directory (and optionally
     * its subdirectories).
     * <p>
     * The resulting iterator MUST be consumed in its entirety in order to close its underlying stream.
     * </p>
     * <p>
     * All files found are filtered by an IOFileFilter.
     * </p>
     * <p>
     * The resulting iterator includes the subdirectories themselves.
     * </p>
     *
     * @param directory  the directory to search in
     * @param fileFilter filter to apply when finding files.
     * @param dirFilter  optional filter to apply when finding subdirectories.
     *                   If this parameter is {@code null}, subdirectories will not be included in the
     *                   search. Use TrueFileFilter.INSTANCE to match all directories.
     * @return an iterator of java.io.File for the matching files
     * @see org.apache.commons.io.filefilter.FileFilterUtils
     * @see org.apache.commons.io.filefilter.NameFileFilter
     * @since 2.2
     */
    public static Iterator<File> iterateFilesAndDirs(final File directory, final IOFileFilter fileFilter,
        final IOFileFilter dirFilter) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1220);
        __CLR4_4_1l5l5kylvdypm.R.inc(1221);return listFilesAndDirs(directory, fileFilter, dirFilter).iterator();
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns the last modification time in milliseconds via
     * {@link java.nio.file.Files#getLastModifiedTime(Path, LinkOption...)}.
     * <p>
     * Use this method to avoid issues with {@link File#lastModified()} like
     * <a href="https://bugs.openjdk.java.net/browse/JDK-8177809">JDK-8177809</a> where {@link File#lastModified()} is
     * losing milliseconds (always ends in 000). This bug exists in OpenJDK 8 and 9, and is fixed in 10.
     * </p>
     *
     * @param file The File to query.
     * @return See {@link java.nio.file.attribute.FileTime#toMillis()}.
     * @throws IOException if an I/O error occurs.
     * @since 2.9.0
     */
    public static long lastModified(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1222);
        // https://bugs.openjdk.java.net/browse/JDK-8177809
        // File.lastModified() is losing milliseconds (always ends in 000)
        // This bug is in OpenJDK 8 and 9, and fixed in 10.
        __CLR4_4_1l5l5kylvdypm.R.inc(1223);return Files.getLastModifiedTime(Objects.requireNonNull(file.toPath(), "file")).toMillis();
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns the last modification time in milliseconds via
     * {@link java.nio.file.Files#getLastModifiedTime(Path, LinkOption...)}.
     * <p>
     * Use this method to avoid issues with {@link File#lastModified()} like
     * <a href="https://bugs.openjdk.java.net/browse/JDK-8177809">JDK-8177809</a> where {@link File#lastModified()} is
     * losing milliseconds (always ends in 000). This bug exists in OpenJDK 8 and 9, and is fixed in 10.
     * </p>
     *
     * @param file The File to query.
     * @return See {@link java.nio.file.attribute.FileTime#toMillis()}.
     * @throws UncheckedIOException if an I/O error occurs.
     * @since 2.9.0
     */
    public static long lastModifiedUnchecked(final File file) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1224);
        // https://bugs.openjdk.java.net/browse/JDK-8177809
        // File.lastModified() is losing milliseconds (always ends in 000)
        // This bug is in OpenJDK 8 and 9, and fixed in 10.
        __CLR4_4_1l5l5kylvdypm.R.inc(1225);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1226);return lastModified(file);
        } catch (final IOException e) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1227);throw new UncheckedIOException(file.toString(), e);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns an Iterator for the lines in a {@code File} using the default encoding for the VM.
     *
     * @param file the file to open for input, must not be {@code null}
     * @return an Iterator of the lines in the file, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @see #lineIterator(File, String)
     * @since 1.3
     */
    public static LineIterator lineIterator(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1228);
        __CLR4_4_1l5l5kylvdypm.R.inc(1229);return lineIterator(file, null);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns an Iterator for the lines in a {@code File}.
     * <p>
     * This method opens an {@code InputStream} for the file.
     * When you have finished with the iterator you should close the stream
     * to free internal resources. This can be done by calling the
     * {@link LineIterator#close()} or
     * {@link LineIterator#closeQuietly(LineIterator)} method.
     * </p>
     * <p>
     * The recommended usage pattern is:
     * </p>
     * <pre>
     * LineIterator it = FileUtils.lineIterator(file, "UTF-8");
     * try {
     *   while (it.hasNext()) {
     *     String line = it.nextLine();
     *     /// do something with line
     *   }
     * } finally {
     *   LineIterator.closeQuietly(iterator);
     * }
     * </pre>
     * <p>
     * If an exception occurs during the creation of the iterator, the
     * underlying stream is closed.
     * </p>
     *
     * @param file     the file to open for input, must not be {@code null}
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @return an Iterator of the lines in the file, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @since 1.2
     */
    public static LineIterator lineIterator(final File file, final String charsetName) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1230);
        __CLR4_4_1l5l5kylvdypm.R.inc(1231);InputStream inputStream = null;
        __CLR4_4_1l5l5kylvdypm.R.inc(1232);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1233);inputStream = openInputStream(file);
            __CLR4_4_1l5l5kylvdypm.R.inc(1234);return IOUtils.lineIterator(inputStream, charsetName);
        } catch (final IOException | RuntimeException ex) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1235);IOUtils.closeQuietly(inputStream, ex::addSuppressed);
            __CLR4_4_1l5l5kylvdypm.R.inc(1236);throw ex;
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    private static AccumulatorPathVisitor listAccumulate(final File directory, final IOFileFilter fileFilter,
        final IOFileFilter dirFilter) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1237);
        __CLR4_4_1l5l5kylvdypm.R.inc(1238);final boolean isDirFilterSet = dirFilter != null;
        __CLR4_4_1l5l5kylvdypm.R.inc(1239);final FileEqualsFileFilter rootDirFilter = new FileEqualsFileFilter(directory);
        __CLR4_4_1l5l5kylvdypm.R.inc(1240);final PathFilter dirPathFilter = (((isDirFilterSet )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1241)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1242)==0&false))? rootDirFilter.or(dirFilter) : rootDirFilter;
        __CLR4_4_1l5l5kylvdypm.R.inc(1243);final AccumulatorPathVisitor visitor = new AccumulatorPathVisitor(Counters.noopPathCounters(), fileFilter,
            dirPathFilter);
        __CLR4_4_1l5l5kylvdypm.R.inc(1244);Files.walkFileTree(directory.toPath(), Collections.emptySet(), toMaxDepth(isDirFilterSet), visitor);
        __CLR4_4_1l5l5kylvdypm.R.inc(1245);return visitor;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Lists files in a directory, asserting that the supplied directory exists and is a directory.
     *
     * @param directory The directory to list
     * @param fileFilter Optional file filter, may be null.
     * @return The files in the directory, never {@code null}.
     * @throws NullPointerException if directory is {@code null}.
     * @throws IllegalArgumentException if directory does not exist or is not a directory.
     * @throws IOException if an I/O error occurs.
     */
    private static File[] listFiles(final File directory, final FileFilter fileFilter) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1246);
        __CLR4_4_1l5l5kylvdypm.R.inc(1247);requireDirectoryExists(directory, "directory");
        __CLR4_4_1l5l5kylvdypm.R.inc(1248);final File[] files = (((fileFilter == null )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1249)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1250)==0&false))? directory.listFiles() : directory.listFiles(fileFilter);
        __CLR4_4_1l5l5kylvdypm.R.inc(1251);if ((((files == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1252)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1253)==0&false))) {{
            // null if the directory does not denote a directory, or if an I/O error occurs.
            __CLR4_4_1l5l5kylvdypm.R.inc(1254);throw new IOException("Unknown I/O error listing contents of directory: " + directory);
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1255);return files;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Finds files within a given directory (and optionally its
     * subdirectories). All files found are filtered by an IOFileFilter.
     * <p>
     * If your search should recurse into subdirectories you can pass in
     * an IOFileFilter for directories. You don't need to bind a
     * DirectoryFileFilter (via logical AND) to this filter. This method does
     * that for you.
     * </p>
     * <p>
     * An example: If you want to search through all directories called
     * "temp" you pass in {@code FileFilterUtils.NameFileFilter("temp")}
     * </p>
     * <p>
     * Another common usage of this method is find files in a directory
     * tree but ignoring the directories generated CVS. You can simply pass
     * in {@code FileFilterUtils.makeCVSAware(null)}.
     * </p>
     *
     * @param directory  the directory to search in
     * @param fileFilter filter to apply when finding files. Must not be {@code null},
     *                   use {@link TrueFileFilter#INSTANCE} to match all files in selected directories.
     * @param dirFilter  optional filter to apply when finding subdirectories.
     *                   If this parameter is {@code null}, subdirectories will not be included in the
     *                   search. Use {@link TrueFileFilter#INSTANCE} to match all directories.
     * @return a collection of java.io.File with the matching files
     * @see org.apache.commons.io.filefilter.FileFilterUtils
     * @see org.apache.commons.io.filefilter.NameFileFilter
     */
    public static Collection<File> listFiles(
        final File directory, final IOFileFilter fileFilter, final IOFileFilter dirFilter) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1256);
        __CLR4_4_1l5l5kylvdypm.R.inc(1257);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1258);final AccumulatorPathVisitor visitor = listAccumulate(directory, fileFilter, dirFilter);
            __CLR4_4_1l5l5kylvdypm.R.inc(1259);return visitor.getFileList().stream().map(Path::toFile).collect(Collectors.toList());
        } catch (final IOException e) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1260);throw new UncheckedIOException(directory.toString(), e);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Finds files within a given directory (and optionally its subdirectories)
     * which match an array of extensions.
     *
     * @param directory  the directory to search in
     * @param extensions an array of extensions, ex. {"java","xml"}. If this
     *                   parameter is {@code null}, all files are returned.
     * @param recursive  if true all subdirectories are searched as well
     * @return a collection of java.io.File with the matching files
     */
    public static Collection<File> listFiles(final File directory, final String[] extensions, final boolean recursive) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1261);
        __CLR4_4_1l5l5kylvdypm.R.inc(1262);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1263);return toList(streamFiles(directory, recursive, extensions));
        } catch (final IOException e) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1264);throw new UncheckedIOException(directory.toString(), e);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Finds files within a given directory (and optionally its
     * subdirectories). All files found are filtered by an IOFileFilter.
     * <p>
     * The resulting collection includes the starting directory and
     * any subdirectories that match the directory filter.
     * </p>
     *
     * @param directory  the directory to search in
     * @param fileFilter filter to apply when finding files.
     * @param dirFilter  optional filter to apply when finding subdirectories.
     *                   If this parameter is {@code null}, subdirectories will not be included in the
     *                   search. Use TrueFileFilter.INSTANCE to match all directories.
     * @return a collection of java.io.File with the matching files
     * @see org.apache.commons.io.FileUtils#listFiles
     * @see org.apache.commons.io.filefilter.FileFilterUtils
     * @see org.apache.commons.io.filefilter.NameFileFilter
     * @since 2.2
     */
    public static Collection<File> listFilesAndDirs(
        final File directory, final IOFileFilter fileFilter, final IOFileFilter dirFilter) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1265);
        __CLR4_4_1l5l5kylvdypm.R.inc(1266);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1267);final AccumulatorPathVisitor visitor = listAccumulate(directory, fileFilter, dirFilter);
            __CLR4_4_1l5l5kylvdypm.R.inc(1268);final List<Path> list = visitor.getFileList();
            __CLR4_4_1l5l5kylvdypm.R.inc(1269);list.addAll(visitor.getDirList());
            __CLR4_4_1l5l5kylvdypm.R.inc(1270);return list.stream().map(Path::toFile).collect(Collectors.toList());
        } catch (final IOException e) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1271);throw new UncheckedIOException(directory.toString(), e);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Calls {@link File#mkdirs()} and throws an exception on failure.
     *
     * @param directory the receiver for {@code mkdirs()}, may be null.
     * @return the given file, may be null.
     * @throws IOException if the directory was not created along with all its parent directories.
     * @throws IOException if the given file object is not a directory.
     * @throws SecurityException See {@link File#mkdirs()}.
     * @see File#mkdirs()
     */
    private static File mkdirs(final File directory) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1272);
        __CLR4_4_1l5l5kylvdypm.R.inc(1273);if (((((directory != null) && (!directory.mkdirs() && !directory.isDirectory()))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1274)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1275)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1276);throw new IOException("Cannot create directory '" + directory + "'.");
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1277);return directory;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Moves a directory.
     * <p>
     * When the destination directory is on another file system, do a "copy and delete".
     * </p>
     *
     * @param srcDir the directory to be moved.
     * @param destDir the destination directory.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 1.4
     */
    public static void moveDirectory(final File srcDir, final File destDir) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1278);
        __CLR4_4_1l5l5kylvdypm.R.inc(1279);validateMoveParameters(srcDir, destDir);
        __CLR4_4_1l5l5kylvdypm.R.inc(1280);requireDirectory(srcDir, "srcDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(1281);requireAbsent(destDir, "destDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(1282);if ((((!srcDir.renameTo(destDir))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1283)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1284)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1285);if ((((destDir.getCanonicalPath().startsWith(srcDir.getCanonicalPath() + File.separator))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1286)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1287)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1288);throw new IOException("Cannot move directory: " + srcDir + " to a subdirectory of itself: " + destDir);
            }
            }__CLR4_4_1l5l5kylvdypm.R.inc(1289);copyDirectory(srcDir, destDir);
            __CLR4_4_1l5l5kylvdypm.R.inc(1290);deleteDirectory(srcDir);
            __CLR4_4_1l5l5kylvdypm.R.inc(1291);if ((((srcDir.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1292)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1293)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1294);throw new IOException("Failed to delete original directory '" + srcDir +
                        "' after copy to '" + destDir + "'");
            }
        }}
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Moves a directory to another directory.
     *
     * @param src the file to be moved.
     * @param destDir the destination file.
     * @param createDestDir If {@code true} create the destination directory, otherwise if {@code false} throw an
     *        IOException.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 1.4
     */
    public static void moveDirectoryToDirectory(final File src, final File destDir, final boolean createDestDir)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1295);
        __CLR4_4_1l5l5kylvdypm.R.inc(1296);validateMoveParameters(src, destDir);
        __CLR4_4_1l5l5kylvdypm.R.inc(1297);if ((((!destDir.isDirectory())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1298)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1299)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1300);if ((((destDir.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1301)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1302)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1303);throw new IOException("Destination '" + destDir + "' is not a directory");
            }
            }__CLR4_4_1l5l5kylvdypm.R.inc(1304);if ((((!createDestDir)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1305)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1306)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1307);throw new FileNotFoundException("Destination directory '" + destDir +
                        "' does not exist [createDestDir=" + false + "]");
            }
            }__CLR4_4_1l5l5kylvdypm.R.inc(1308);mkdirs(destDir);
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1309);moveDirectory(src, new File(destDir, src.getName()));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Moves a file preserving attributes.
     * <p>
     * Shorthand for {@code moveFile(srcFile, destFile, StandardCopyOption.COPY_ATTRIBUTES)}.
     * </p>
     * <p>
     * When the destination file is on another file system, do a "copy and delete".
     * </p>
     *
     * @param srcFile the file to be moved.
     * @param destFile the destination file.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws FileExistsException if the destination file exists.
     * @throws IOException if source or destination is invalid.
     * @throws IOException if an error occurs.
     * @since 1.4
     */
    public static void moveFile(final File srcFile, final File destFile) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1310);
        __CLR4_4_1l5l5kylvdypm.R.inc(1311);moveFile(srcFile, destFile, StandardCopyOption.COPY_ATTRIBUTES);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Moves a file.
     * <p>
     * When the destination file is on another file system, do a "copy and delete".
     * </p>
     *
     * @param srcFile the file to be moved.
     * @param destFile the destination file.
     * @param copyOptions Copy options.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws FileExistsException if the destination file exists.
     * @throws IOException if source or destination is invalid.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 2.9.0
     */
    public static void moveFile(final File srcFile, final File destFile, final CopyOption... copyOptions)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1312);
        __CLR4_4_1l5l5kylvdypm.R.inc(1313);validateMoveParameters(srcFile, destFile);
        __CLR4_4_1l5l5kylvdypm.R.inc(1314);requireFile(srcFile, "srcFile");
        __CLR4_4_1l5l5kylvdypm.R.inc(1315);requireAbsent(destFile, null);
        __CLR4_4_1l5l5kylvdypm.R.inc(1316);final boolean rename = srcFile.renameTo(destFile);
        __CLR4_4_1l5l5kylvdypm.R.inc(1317);if ((((!rename)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1318)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1319)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1320);copyFile(srcFile, destFile, copyOptions);
            __CLR4_4_1l5l5kylvdypm.R.inc(1321);if ((((!srcFile.delete())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1322)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1323)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1324);FileUtils.deleteQuietly(destFile);
                __CLR4_4_1l5l5kylvdypm.R.inc(1325);throw new IOException("Failed to delete original file '" + srcFile +
                        "' after copy to '" + destFile + "'");
            }
        }}
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Moves a file to a directory.
     *
     * @param srcFile the file to be moved.
     * @param destDir the destination file.
     * @param createDestDir If {@code true} create the destination directory, otherwise if {@code false} throw an
     *        IOException.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws FileExistsException if the destination file exists.
     * @throws IOException if source or destination is invalid.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 1.4
     */
    public static void moveFileToDirectory(final File srcFile, final File destDir, final boolean createDestDir)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1326);
        __CLR4_4_1l5l5kylvdypm.R.inc(1327);validateMoveParameters(srcFile, destDir);
        __CLR4_4_1l5l5kylvdypm.R.inc(1328);if ((((!destDir.exists() && createDestDir)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1329)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1330)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1331);mkdirs(destDir);
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1332);requireExistsChecked(destDir, "destDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(1333);requireDirectory(destDir, "destDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(1334);moveFile(srcFile, new File(destDir, srcFile.getName()));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Moves a file or directory to the destination directory.
     * <p>
     * When the destination is on another file system, do a "copy and delete".
     * </p>
     *
     * @param src the file or directory to be moved.
     * @param destDir the destination directory.
     * @param createDestDir If {@code true} create the destination directory, otherwise if {@code false} throw an
     *        IOException.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws FileExistsException if the directory or file exists in the destination directory.
     * @throws IOException if source or destination is invalid.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     * @since 1.4
     */
    public static void moveToDirectory(final File src, final File destDir, final boolean createDestDir)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1335);
        __CLR4_4_1l5l5kylvdypm.R.inc(1336);validateMoveParameters(src, destDir);
        __CLR4_4_1l5l5kylvdypm.R.inc(1337);if ((((src.isDirectory())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1338)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1339)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1340);moveDirectoryToDirectory(src, destDir, createDestDir);
        } }else {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1341);moveFileToDirectory(src, destDir, createDestDir);
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Opens a {@link FileInputStream} for the specified file, providing better error messages than simply calling
     * {@code new FileInputStream(file)}.
     * <p>
     * At the end of the method either the stream will be successfully opened, or an exception will have been thrown.
     * </p>
     * <p>
     * An exception is thrown if the file does not exist. An exception is thrown if the file object exists but is a
     * directory. An exception is thrown if the file exists but cannot be read.
     * </p>
     *
     * @param file the file to open for input, must not be {@code null}
     * @return a new {@link FileInputStream} for the specified file
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException See FileNotFoundException above, FileNotFoundException is a subclass of IOException.
     * @since 1.3
     */
    public static FileInputStream openInputStream(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1342);
        __CLR4_4_1l5l5kylvdypm.R.inc(1343);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1344);return new FileInputStream(file);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Opens a {@link FileOutputStream} for the specified file, checking and
     * creating the parent directory if it does not exist.
     * <p>
     * At the end of the method either the stream will be successfully opened,
     * or an exception will have been thrown.
     * </p>
     * <p>
     * The parent directory will be created if it does not exist.
     * The file will be created if it does not exist.
     * An exception is thrown if the file object exists but is a directory.
     * An exception is thrown if the file exists but cannot be written to.
     * An exception is thrown if the parent directory cannot be created.
     * </p>
     *
     * @param file the file to open for output, must not be {@code null}
     * @return a new {@link FileOutputStream} for the specified file
     * @throws NullPointerException if the file object is {@code null}.
     * @throws IllegalArgumentException if the file object is a directory
     * @throws IllegalArgumentException if the file is not writable.
     * @throws IOException if the directories could not be created.
     * @since 1.3
     */
    public static FileOutputStream openOutputStream(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1345);
        __CLR4_4_1l5l5kylvdypm.R.inc(1346);return openOutputStream(file, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Opens a {@link FileOutputStream} for the specified file, checking and
     * creating the parent directory if it does not exist.
     * <p>
     * At the end of the method either the stream will be successfully opened,
     * or an exception will have been thrown.
     * </p>
     * <p>
     * The parent directory will be created if it does not exist.
     * The file will be created if it does not exist.
     * An exception is thrown if the file object exists but is a directory.
     * An exception is thrown if the file exists but cannot be written to.
     * An exception is thrown if the parent directory cannot be created.
     * </p>
     *
     * @param file   the file to open for output, must not be {@code null}
     * @param append if {@code true}, then bytes will be added to the
     *               end of the file rather than overwriting
     * @return a new {@link FileOutputStream} for the specified file
     * @throws NullPointerException if the file object is {@code null}.
     * @throws IllegalArgumentException if the file object is a directory
     * @throws IllegalArgumentException if the file is not writable.
     * @throws IOException if the directories could not be created.
     * @since 2.1
     */
    public static FileOutputStream openOutputStream(final File file, final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1347);
        __CLR4_4_1l5l5kylvdypm.R.inc(1348);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1349);if ((((file.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1350)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1351)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1352);requireFile(file, "file");
            __CLR4_4_1l5l5kylvdypm.R.inc(1353);requireCanWrite(file, "file");
        } }else {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1354);createParentDirectories(file);
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1355);return new FileOutputStream(file, append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Reads the contents of a file into a byte array.
     * The file is always closed.
     *
     * @param file the file to read, must not be {@code null}
     * @return the file contents, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @since 1.1
     */
    public static byte[] readFileToByteArray(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1356);
        class __CLR4_4_1$AC8 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(1357);try (__CLR4_4_1$AC8 __CLR$ACI10=new __CLR4_4_1$AC8(){{__CLR4_4_1l5l5kylvdypm.R.inc(1358);}};InputStream inputStream = openInputStream(file)) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1359);final long fileLength = file.length();
            // file.length() may return 0 for system-dependent entities, treat 0 as unknown length - see IO-453
            __CLR4_4_1l5l5kylvdypm.R.inc(1360);return (((fileLength > 0 )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1361)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1362)==0&false))? IOUtils.toByteArray(inputStream, fileLength) : IOUtils.toByteArray(inputStream);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Reads the contents of a file into a String using the default encoding for the VM.
     * The file is always closed.
     *
     * @param file the file to read, must not be {@code null}
     * @return the file contents, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @since 1.3.1
     * @deprecated 2.5 use {@link #readFileToString(File, Charset)} instead (and specify the appropriate encoding)
     */
    @Deprecated
    public static String readFileToString(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1363);
        __CLR4_4_1l5l5kylvdypm.R.inc(1364);return readFileToString(file, Charset.defaultCharset());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Reads the contents of a file into a String.
     * The file is always closed.
     *
     * @param file     the file to read, must not be {@code null}
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @return the file contents, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @since 2.3
     */
    public static String readFileToString(final File file, final Charset charsetName) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1365);
        class __CLR4_4_1$AC9 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(1366);try (__CLR4_4_1$AC9 __CLR$ACI11=new __CLR4_4_1$AC9(){{__CLR4_4_1l5l5kylvdypm.R.inc(1367);}};InputStream inputStream = openInputStream(file)) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1368);return IOUtils.toString(inputStream, Charsets.toCharset(charsetName));
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Reads the contents of a file into a String. The file is always closed.
     *
     * @param file     the file to read, must not be {@code null}
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @return the file contents, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the named charset is unavailable.
     * @since 2.3
     */
    public static String readFileToString(final File file, final String charsetName) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1369);
        __CLR4_4_1l5l5kylvdypm.R.inc(1370);return readFileToString(file, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Reads the contents of a file line by line to a List of Strings using the default encoding for the VM.
     * The file is always closed.
     *
     * @param file the file to read, must not be {@code null}
     * @return the list of Strings representing each line in the file, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @since 1.3
     * @deprecated 2.5 use {@link #readLines(File, Charset)} instead (and specify the appropriate encoding)
     */
    @Deprecated
    public static List<String> readLines(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1371);
        __CLR4_4_1l5l5kylvdypm.R.inc(1372);return readLines(file, Charset.defaultCharset());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Reads the contents of a file line by line to a List of Strings.
     * The file is always closed.
     *
     * @param file     the file to read, must not be {@code null}
     * @param charset the charset to use, {@code null} means platform default
     * @return the list of Strings representing each line in the file, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @since 2.3
     */
    public static List<String> readLines(final File file, final Charset charset) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1373);
        class __CLR4_4_1$AC10 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(1374);try (__CLR4_4_1$AC10 __CLR$ACI12=new __CLR4_4_1$AC10(){{__CLR4_4_1l5l5kylvdypm.R.inc(1375);}};InputStream inputStream = openInputStream(file)) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1376);return IOUtils.readLines(inputStream, Charsets.toCharset(charset));
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Reads the contents of a file line by line to a List of Strings. The file is always closed.
     *
     * @param file     the file to read, must not be {@code null}
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @return the list of Strings representing each line in the file, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the named charset is unavailable.
     * @since 1.1
     */
    public static List<String> readLines(final File file, final String charsetName) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1377);
        __CLR4_4_1l5l5kylvdypm.R.inc(1378);return readLines(file, Charsets.toCharset(charsetName));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    private static void requireAbsent(final File file, final String name) throws FileExistsException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1379);
        __CLR4_4_1l5l5kylvdypm.R.inc(1380);if ((((file.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1381)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1382)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1383);throw new FileExistsException(
                String.format("File element in parameter '%s' already exists: '%s'", name, file));
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}


    /**
     * Throws IllegalArgumentException if the given files' canonical representations are equal.
     *
     * @param file1 The first file to compare.
     * @param file2 The second file to compare.
     * @throws IllegalArgumentException if the given files' canonical representations are equal.
     */
    private static void requireCanonicalPathsNotEquals(final File file1, final File file2) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1384);
        __CLR4_4_1l5l5kylvdypm.R.inc(1385);final String canonicalPath = file1.getCanonicalPath();
        __CLR4_4_1l5l5kylvdypm.R.inc(1386);if ((((canonicalPath.equals(file2.getCanonicalPath()))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1387)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1388)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1389);throw new IllegalArgumentException(String
                .format("File canonical paths are equal: '%s' (file1='%s', file2='%s')", canonicalPath, file1, file2));
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Throws an {@link IllegalArgumentException} if the file is not writable. This provides a more precise exception
     * message than a plain access denied.
     *
     * @param file The file to test.
     * @param name The parameter name to use in the exception message.
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if the file is not writable.
     */
    private static void requireCanWrite(final File file, final String name) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1390);
        __CLR4_4_1l5l5kylvdypm.R.inc(1391);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1392);if ((((!file.canWrite())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1393)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1394)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1395);throw new IllegalArgumentException("File parameter '" + name + " is not writable: '" + file + "'");
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Requires that the given {@code File} is a directory.
     *
     * @param directory The {@code File} to check.
     * @param name The parameter name to use in the exception message in case of null input or if the file is not a directory.
     * @return the given directory.
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if the given {@code File} does not exist or is not a directory.
     */
    private static File requireDirectory(final File directory, final String name) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1396);
        __CLR4_4_1l5l5kylvdypm.R.inc(1397);Objects.requireNonNull(directory, name);
        __CLR4_4_1l5l5kylvdypm.R.inc(1398);if ((((!directory.isDirectory())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1399)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1400)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1401);throw new IllegalArgumentException("Parameter '" + name + "' is not a directory: '" + directory + "'");
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1402);return directory;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Requires that the given {@code File} exists and is a directory.
     *
     * @param directory The {@code File} to check.
     * @param name The parameter name to use in the exception message in case of null input.
     * @return the given directory.
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if the given {@code File} does not exist or is not a directory.
     */
    private static File requireDirectoryExists(final File directory, final String name) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1403);
        __CLR4_4_1l5l5kylvdypm.R.inc(1404);requireExists(directory, name);
        __CLR4_4_1l5l5kylvdypm.R.inc(1405);requireDirectory(directory, name);
        __CLR4_4_1l5l5kylvdypm.R.inc(1406);return directory;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Requires that the given {@code File} is a directory if it exists.
     *
     * @param directory The {@code File} to check.
     * @param name The parameter name to use in the exception message in case of null input.
     * @return the given directory.
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if the given {@code File} exists but is not a directory.
     */
    private static File requireDirectoryIfExists(final File directory, final String name) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1407);
        __CLR4_4_1l5l5kylvdypm.R.inc(1408);Objects.requireNonNull(directory, name);
        __CLR4_4_1l5l5kylvdypm.R.inc(1409);if ((((directory.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1410)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1411)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1412);requireDirectory(directory, name);
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1413);return directory;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Requires that two file lengths are equal.
     *
     * @param srcFile Source file.
     * @param destFile Destination file.
     * @param srcLen Source file length.
     * @param dstLen Destination file length
     * @throws IOException Thrown when the given sizes are not equal.
     */
    private static void requireEqualSizes(final File srcFile, final File destFile, final long srcLen, final long dstLen)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1414);
        __CLR4_4_1l5l5kylvdypm.R.inc(1415);if ((((srcLen != dstLen)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1416)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1417)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1418);throw new IOException("Failed to copy full contents from '" + srcFile + "' to '" + destFile
                    + "' Expected length: " + srcLen + " Actual: " + dstLen);
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Requires that the given {@code File} exists and throws an {@link IllegalArgumentException} if it doesn't.
     *
     * @param file The {@code File} to check.
     * @param fileParamName The parameter name to use in the exception message in case of {@code null} input.
     * @return the given file.
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if the given {@code File} does not exist.
     */
    private static File requireExists(final File file, final String fileParamName) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1419);
        __CLR4_4_1l5l5kylvdypm.R.inc(1420);Objects.requireNonNull(file, fileParamName);
        __CLR4_4_1l5l5kylvdypm.R.inc(1421);if ((((!file.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1422)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1423)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1424);throw new IllegalArgumentException(
                "File system element for parameter '" + fileParamName + "' does not exist: '" + file + "'");
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1425);return file;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Requires that the given {@code File} exists and throws an {@link FileNotFoundException} if it doesn't.
     *
     * @param file The {@code File} to check.
     * @param fileParamName The parameter name to use in the exception message in case of {@code null} input.
     * @return the given file.
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws FileNotFoundException if the given {@code File} does not exist.
     */
    private static File requireExistsChecked(final File file, final String fileParamName) throws FileNotFoundException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1426);
        __CLR4_4_1l5l5kylvdypm.R.inc(1427);Objects.requireNonNull(file, fileParamName);
        __CLR4_4_1l5l5kylvdypm.R.inc(1428);if ((((!file.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1429)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1430)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1431);throw new FileNotFoundException(
                "File system element for parameter '" + fileParamName + "' does not exist: '" + file + "'");
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1432);return file;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Requires that the given {@code File} is a file.
     *
     * @param file The {@code File} to check.
     * @param name The parameter name to use in the exception message.
     * @return the given file.
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if the given {@code File} does not exist or is not a directory.
     */
    private static File requireFile(final File file, final String name) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1433);
        __CLR4_4_1l5l5kylvdypm.R.inc(1434);Objects.requireNonNull(file, name);
        __CLR4_4_1l5l5kylvdypm.R.inc(1435);if ((((!file.isFile())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1436)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1437)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1438);throw new IllegalArgumentException("Parameter '" + name + "' is not a file: " + file);
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1439);return file;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Requires parameter attributes for a file copy operation.
     *
     * @param source the source file
     * @param destination the destination
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws FileNotFoundException if the source does not exist.
     */
    private static void requireFileCopy(final File source, final File destination) throws FileNotFoundException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1440);
        __CLR4_4_1l5l5kylvdypm.R.inc(1441);requireExistsChecked(source, "source");
        __CLR4_4_1l5l5kylvdypm.R.inc(1442);Objects.requireNonNull(destination, "destination");
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Requires that the given {@code File} is a file if it exists.
     *
     * @param file The {@code File} to check.
     * @param name The parameter name to use in the exception message in case of null input.
     * @return the given directory.
     * @throws NullPointerException if the given {@code File} is {@code null}.
     * @throws IllegalArgumentException if the given {@code File} does exists but is not a directory.
     */
    private static File requireFileIfExists(final File file, final String name) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1443);
        __CLR4_4_1l5l5kylvdypm.R.inc(1444);Objects.requireNonNull(file, name);
        __CLR4_4_1l5l5kylvdypm.R.inc(1445);return (((file.exists() )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1446)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1447)==0&false))? requireFile(file, name) : file;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Sets the given {@code targetFile}'s last modified date to the value from {@code sourceFile}.
     *
     * @param sourceFile The source file to query.
     * @param targetFile The target file to set.
     * @throws NullPointerException if sourceFile is {@code null}.
     * @throws NullPointerException if targetFile is {@code null}.
     * @throws IOException if setting the last-modified time failed.
     */
    private static void setLastModified(final File sourceFile, final File targetFile) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1448);
        __CLR4_4_1l5l5kylvdypm.R.inc(1449);Objects.requireNonNull(sourceFile, "sourceFile");
        __CLR4_4_1l5l5kylvdypm.R.inc(1450);setLastModified(targetFile, lastModified(sourceFile));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Sets the given {@code targetFile}'s last modified date to the given value.
     *
     * @param file The source file to query.
     * @param timeMillis The new last-modified time, measured in milliseconds since the epoch 01-01-1970 GMT.
     * @throws NullPointerException if file is {@code null}.
     * @throws IOException if setting the last-modified time failed.
     */
    private static void setLastModified(final File file, final long timeMillis) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1451);
        __CLR4_4_1l5l5kylvdypm.R.inc(1452);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1453);if ((((!file.setLastModified(timeMillis))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1454)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1455)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1456);throw new IOException(String.format("Failed setLastModified(%s) on '%s'", timeMillis, file));
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns the size of the specified file or directory. If the provided
     * {@link File} is a regular file, then the file's length is returned.
     * If the argument is a directory, then the size of the directory is
     * calculated recursively. If a directory or subdirectory is security
     * restricted, its size will not be included.
     * <p>
     * Note that overflow is not detected, and the return value may be negative if
     * overflow occurs. See {@link #sizeOfAsBigInteger(File)} for an alternative
     * method that does not overflow.
     * </p>
     *
     * @param file the regular file or directory to return the size
     *             of (must not be {@code null}).
     *
     * @return the length of the file, or recursive size of the directory,
     * provided (in bytes).
     *
     * @throws NullPointerException     if the file is {@code null}.
     * @throws IllegalArgumentException if the file does not exist.
     *
     * @since 2.0
     */
    public static long sizeOf(final File file) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1457);
        __CLR4_4_1l5l5kylvdypm.R.inc(1458);requireExists(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1459);return (((file.isDirectory() )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1460)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1461)==0&false))? sizeOfDirectory0(file) : file.length();
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Gets the size of a file.
     *
     * @param file the file to check.
     * @return the size of the file.
     * @throws NullPointerException if the file is {@code null}.
     */
    private static long sizeOf0(final File file) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1462);
        __CLR4_4_1l5l5kylvdypm.R.inc(1463);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1464);if ((((file.isDirectory())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1465)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1466)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1467);return sizeOfDirectory0(file);
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1468);return file.length(); // will be 0 if file does not exist
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns the size of the specified file or directory. If the provided
     * {@link File} is a regular file, then the file's length is returned.
     * If the argument is a directory, then the size of the directory is
     * calculated recursively. If a directory or subdirectory is security
     * restricted, its size will not be included.
     *
     * @param file the regular file or directory to return the size
     *             of (must not be {@code null}).
     *
     * @return the length of the file, or recursive size of the directory,
     * provided (in bytes).
     *
     * @throws NullPointerException     if the file is {@code null}.
     * @throws IllegalArgumentException if the file does not exist.
     *
     * @since 2.4
     */
    public static BigInteger sizeOfAsBigInteger(final File file) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1469);
        __CLR4_4_1l5l5kylvdypm.R.inc(1470);requireExists(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1471);return (((file.isDirectory() )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1472)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1473)==0&false))? sizeOfDirectoryBig0(file) : BigInteger.valueOf(file.length());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Returns the size of a file or directory.
     *
     * @param file The file or directory.
     * @return the size
     */
    private static BigInteger sizeOfBig0(final File file) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1474);
        __CLR4_4_1l5l5kylvdypm.R.inc(1475);Objects.requireNonNull(file, "fileOrDir");
        __CLR4_4_1l5l5kylvdypm.R.inc(1476);return (((file.isDirectory() )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1477)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1478)==0&false))? sizeOfDirectoryBig0(file) : BigInteger.valueOf(file.length());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Counts the size of a directory recursively (sum of the length of all files).
     * <p>
     * Note that overflow is not detected, and the return value may be negative if
     * overflow occurs. See {@link #sizeOfDirectoryAsBigInteger(File)} for an alternative
     * method that does not overflow.
     * </p>
     *
     * @param directory directory to inspect, must not be {@code null}.
     * @return size of directory in bytes, 0 if directory is security restricted, a negative number when the real total
     * is greater than {@link Long#MAX_VALUE}.
     * @throws NullPointerException if the directory is {@code null}.
     */
    public static long sizeOfDirectory(final File directory) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1479);
        __CLR4_4_1l5l5kylvdypm.R.inc(1480);return sizeOfDirectory0(requireDirectoryExists(directory, "directory"));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Gets the size of a directory.
     *
     * @param directory the directory to check
     * @return the size
     * @throws NullPointerException if the directory is {@code null}.
     */
    private static long sizeOfDirectory0(final File directory) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1481);
        __CLR4_4_1l5l5kylvdypm.R.inc(1482);Objects.requireNonNull(directory, "directory");
        __CLR4_4_1l5l5kylvdypm.R.inc(1483);final File[] files = directory.listFiles();
        __CLR4_4_1l5l5kylvdypm.R.inc(1484);if ((((files == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1485)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1486)==0&false))) {{  // null if security restricted
            __CLR4_4_1l5l5kylvdypm.R.inc(1487);return 0L;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1488);long size = 0;

        __CLR4_4_1l5l5kylvdypm.R.inc(1489);for (final File file : files) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1490);if ((((!isSymlink(file))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1491)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1492)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1493);size += sizeOf0(file);
                __CLR4_4_1l5l5kylvdypm.R.inc(1494);if ((((size < 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1495)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1496)==0&false))) {{
                    __CLR4_4_1l5l5kylvdypm.R.inc(1497);break;
                }
            }}
        }}

        }__CLR4_4_1l5l5kylvdypm.R.inc(1498);return size;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Counts the size of a directory recursively (sum of the length of all files).
     *
     * @param directory directory to inspect, must not be {@code null}.
     * @return size of directory in bytes, 0 if directory is security restricted.
     * @throws NullPointerException if the directory is {@code null}.
     * @since 2.4
     */
    public static BigInteger sizeOfDirectoryAsBigInteger(final File directory) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1499);
        __CLR4_4_1l5l5kylvdypm.R.inc(1500);return sizeOfDirectoryBig0(requireDirectoryExists(directory, "directory"));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Computes the size of a directory.
     *
     * @param directory The directory.
     * @return the size.
     */
    private static BigInteger sizeOfDirectoryBig0(final File directory) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1501);
        __CLR4_4_1l5l5kylvdypm.R.inc(1502);Objects.requireNonNull(directory, "directory");
        __CLR4_4_1l5l5kylvdypm.R.inc(1503);final File[] files = directory.listFiles();
        __CLR4_4_1l5l5kylvdypm.R.inc(1504);if ((((files == null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1505)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1506)==0&false))) {{
            // null if security restricted
            __CLR4_4_1l5l5kylvdypm.R.inc(1507);return BigInteger.ZERO;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1508);BigInteger size = BigInteger.ZERO;

        __CLR4_4_1l5l5kylvdypm.R.inc(1509);for (final File file : files) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1510);if ((((!isSymlink(file))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1511)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1512)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1513);size = size.add(sizeOfBig0(file));
            }
        }}

        }__CLR4_4_1l5l5kylvdypm.R.inc(1514);return size;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Streams over the files in a given directory (and optionally
     * its subdirectories) which match an array of extensions.
     *
     * @param directory  the directory to search in
     * @param recursive  if true all subdirectories are searched as well
     * @param extensions an array of extensions, ex. {"java","xml"}. If this
     *                   parameter is {@code null}, all files are returned.
     * @return an iterator of java.io.File with the matching files
     * @throws IOException if an I/O error is thrown when accessing the starting file.
     * @since 2.9.0
     */
    public static Stream<File> streamFiles(final File directory, final boolean recursive, final String... extensions)
        throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1515);
        __CLR4_4_1l5l5kylvdypm.R.inc(1516);final IOFileFilter filter = (((extensions == null )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1517)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1518)==0&false))? FileFileFilter.INSTANCE
            : FileFileFilter.INSTANCE.and(new SuffixFileFilter(toSuffixes(extensions)));
        __CLR4_4_1l5l5kylvdypm.R.inc(1519);return PathUtils.walk(directory.toPath(), filter, toMaxDepth(recursive), false, FileVisitOption.FOLLOW_LINKS)
            .map(Path::toFile);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Converts from a {@code URL} to a {@code File}.
     * <p>
     * From version 1.1 this method will decode the URL.
     * Syntax such as {@code file:///my%20docs/file.txt} will be
     * correctly decoded to {@code /my docs/file.txt}. Starting with version
     * 1.5, this method uses UTF-8 to decode percent-encoded octets to characters.
     * Additionally, malformed percent-encoded octets are handled leniently by
     * passing them through literally.
     * </p>
     *
     * @param url the file URL to convert, {@code null} returns {@code null}
     * @return the equivalent {@code File} object, or {@code null}
     * if the URL's protocol is not {@code file}
     */
    public static File toFile(final URL url) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1520);
        __CLR4_4_1l5l5kylvdypm.R.inc(1521);if ((((url == null || !"file".equalsIgnoreCase(url.getProtocol()))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1522)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1523)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1524);return null;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1525);final String filename = url.getFile().replace('/', File.separatorChar);
        __CLR4_4_1l5l5kylvdypm.R.inc(1526);return new File(decodeUrl(filename));
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Converts each of an array of {@code URL} to a {@code File}.
     * <p>
     * Returns an array of the same size as the input.
     * If the input is {@code null}, an empty array is returned.
     * If the input contains {@code null}, the output array contains {@code null} at the same
     * index.
     * </p>
     * <p>
     * This method will decode the URL.
     * Syntax such as {@code file:///my%20docs/file.txt} will be
     * correctly decoded to {@code /my docs/file.txt}.
     * </p>
     *
     * @param urls the file URLs to convert, {@code null} returns empty array
     * @return a non-{@code null} array of Files matching the input, with a {@code null} item
     * if there was a {@code null} at that index in the input array
     * @throws IllegalArgumentException if any file is not a URL file
     * @throws IllegalArgumentException if any file is incorrectly encoded
     * @since 1.1
     */
    public static File[] toFiles(final URL... urls) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1527);
        __CLR4_4_1l5l5kylvdypm.R.inc(1528);if ((((IOUtils.length(urls) == 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1529)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1530)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1531);return EMPTY_FILE_ARRAY;
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1532);final File[] files = new File[urls.length];
        __CLR4_4_1l5l5kylvdypm.R.inc(1533);for (int i = 0; (((i < urls.length)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1534)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1535)==0&false)); i++) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1536);final URL url = urls[i];
            __CLR4_4_1l5l5kylvdypm.R.inc(1537);if ((((url != null)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1538)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1539)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1540);if ((((!"file".equalsIgnoreCase(url.getProtocol()))&&(__CLR4_4_1l5l5kylvdypm.R.iget(1541)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1542)==0&false))) {{
                    __CLR4_4_1l5l5kylvdypm.R.inc(1543);throw new IllegalArgumentException("Can only convert file URL to a File: " + url);
                }
                }__CLR4_4_1l5l5kylvdypm.R.inc(1544);files[i] = toFile(url);
            }
        }}
        }__CLR4_4_1l5l5kylvdypm.R.inc(1545);return files;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    private static List<File> toList(final Stream<File> stream) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1546);
        __CLR4_4_1l5l5kylvdypm.R.inc(1547);return stream.collect(Collectors.toList());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Converts whether or not to recurse into a recursion max depth.
     *
     * @param recursive whether or not to recurse
     * @return the recursion depth
     */
    private static int toMaxDepth(final boolean recursive) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1548);
        __CLR4_4_1l5l5kylvdypm.R.inc(1549);return (((recursive )&&(__CLR4_4_1l5l5kylvdypm.R.iget(1550)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1551)==0&false))? Integer.MAX_VALUE : 1;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Converts an array of file extensions to suffixes.
     *
     * @param extensions an array of extensions. Format: {"java", "xml"}
     * @return an array of suffixes. Format: {".java", ".xml"}
     * @throws NullPointerException if the parameter is null
     */
    private static String[] toSuffixes(final String... extensions) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1552);
        __CLR4_4_1l5l5kylvdypm.R.inc(1553);Objects.requireNonNull(extensions, "extensions");
        __CLR4_4_1l5l5kylvdypm.R.inc(1554);final String[] suffixes = new String[extensions.length];
        __CLR4_4_1l5l5kylvdypm.R.inc(1555);for (int i = 0; (((i < extensions.length)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1556)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1557)==0&false)); i++) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1558);suffixes[i] = "." + extensions[i];
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1559);return suffixes;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Implements the same behavior as the "touch" utility on Unix. It creates
     * a new file with size 0 or, if the file exists already, it is opened and
     * closed without modifying it, but updating the file date and time.
     * <p>
     * NOTE: As from v1.3, this method throws an IOException if the last
     * modified date of the file cannot be set. Also, as from v1.3 this method
     * creates parent directories if they do not exist.
     * </p>
     *
     * @param file the File to touch.
     * @throws IOException if an I/O problem occurs.
     * @throws IOException if setting the last-modified time failed.
     */
    public static void touch(final File file) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1560);
        __CLR4_4_1l5l5kylvdypm.R.inc(1561);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1562);if ((((!file.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1563)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1564)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1565);openOutputStream(file).close();
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1566);setLastModified(file, System.currentTimeMillis());
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Converts each of an array of {@code File} to a {@code URL}.
     * <p>
     * Returns an array of the same size as the input.
     * </p>
     *
     * @param files the files to convert, must not be {@code null}
     * @return an array of URLs matching the input
     * @throws IOException          if a file cannot be converted
     * @throws NullPointerException if the parameter is null
     */
    public static URL[] toURLs(final File... files) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1567);
        __CLR4_4_1l5l5kylvdypm.R.inc(1568);Objects.requireNonNull(files, "files");
        __CLR4_4_1l5l5kylvdypm.R.inc(1569);final URL[] urls = new URL[files.length];
        __CLR4_4_1l5l5kylvdypm.R.inc(1570);for (int i = 0; (((i < urls.length)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1571)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1572)==0&false)); i++) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1573);urls[i] = files[i].toURI().toURL();
        }
        }__CLR4_4_1l5l5kylvdypm.R.inc(1574);return urls;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Validates the given arguments.
     * <ul>
     * <li>Throws {@link NullPointerException} if {@code source} is null</li>
     * <li>Throws {@link NullPointerException} if {@code destination} is null</li>
     * <li>Throws {@link FileNotFoundException} if {@code source} does not exist</li>
     * </ul>
     *
     * @param source      the file or directory to be moved
     * @param destination the destination file or directory
     * @throws FileNotFoundException if {@code source} file does not exist
     */
    private static void validateMoveParameters(final File source, final File destination) throws FileNotFoundException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1575);
        __CLR4_4_1l5l5kylvdypm.R.inc(1576);Objects.requireNonNull(source, "source");
        __CLR4_4_1l5l5kylvdypm.R.inc(1577);Objects.requireNonNull(destination, "destination");
        __CLR4_4_1l5l5kylvdypm.R.inc(1578);if ((((!source.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1579)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1580)==0&false))) {{
            __CLR4_4_1l5l5kylvdypm.R.inc(1581);throw new FileNotFoundException("Source '" + source + "' does not exist");
        }
    }}finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Waits for NFS to propagate a file creation, imposing a timeout.
     * <p>
     * This method repeatedly tests {@link File#exists()} until it returns
     * true up to the maximum time specified in seconds.
     * </p>
     *
     * @param file    the file to check, must not be {@code null}
     * @param seconds the maximum time in seconds to wait
     * @return true if file exists
     * @throws NullPointerException if the file is {@code null}
     */
    public static boolean waitFor(final File file, final int seconds) {try{__CLR4_4_1l5l5kylvdypm.R.inc(1582);
        __CLR4_4_1l5l5kylvdypm.R.inc(1583);Objects.requireNonNull(file, "file");
        __CLR4_4_1l5l5kylvdypm.R.inc(1584);final long finishAtMillis = System.currentTimeMillis() + (seconds * 1000L);
        __CLR4_4_1l5l5kylvdypm.R.inc(1585);boolean wasInterrupted = false;
        __CLR4_4_1l5l5kylvdypm.R.inc(1586);try {
            __CLR4_4_1l5l5kylvdypm.R.inc(1587);while ((((!file.exists())&&(__CLR4_4_1l5l5kylvdypm.R.iget(1588)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1589)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1590);final long remainingMillis = finishAtMillis -  System.currentTimeMillis();
                __CLR4_4_1l5l5kylvdypm.R.inc(1591);if ((((remainingMillis < 0)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1592)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1593)==0&false))){{
                    __CLR4_4_1l5l5kylvdypm.R.inc(1594);return false;
                }
                }__CLR4_4_1l5l5kylvdypm.R.inc(1595);try {
                    __CLR4_4_1l5l5kylvdypm.R.inc(1596);Thread.sleep(Math.min(100, remainingMillis));
                } catch (final InterruptedException ignore) {
                    __CLR4_4_1l5l5kylvdypm.R.inc(1597);wasInterrupted = true;
                } catch (final Exception ex) {
                    __CLR4_4_1l5l5kylvdypm.R.inc(1598);break;
                }
            }
        }} finally {
            __CLR4_4_1l5l5kylvdypm.R.inc(1599);if ((((wasInterrupted)&&(__CLR4_4_1l5l5kylvdypm.R.iget(1600)!=0|true))||(__CLR4_4_1l5l5kylvdypm.R.iget(1601)==0&false))) {{
                __CLR4_4_1l5l5kylvdypm.R.inc(1602);Thread.currentThread().interrupt();
            }
        }}
        __CLR4_4_1l5l5kylvdypm.R.inc(1603);return true;
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a CharSequence to a file creating the file if it does not exist using the default encoding for the VM.
     *
     * @param file the file to write
     * @param data the content to write to the file
     * @throws IOException in case of an I/O error
     * @since 2.0
     * @deprecated 2.5 use {@link #write(File, CharSequence, Charset)} instead (and specify the appropriate encoding)
     */
    @Deprecated
    public static void write(final File file, final CharSequence data) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1604);
        __CLR4_4_1l5l5kylvdypm.R.inc(1605);write(file, data, Charset.defaultCharset(), false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a CharSequence to a file creating the file if it does not exist using the default encoding for the VM.
     *
     * @param file   the file to write
     * @param data   the content to write to the file
     * @param append if {@code true}, then the data will be added to the
     *               end of the file rather than overwriting
     * @throws IOException in case of an I/O error
     * @since 2.1
     * @deprecated 2.5 use {@link #write(File, CharSequence, Charset, boolean)} instead (and specify the appropriate encoding)
     */
    @Deprecated
    public static void write(final File file, final CharSequence data, final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1606);
        __CLR4_4_1l5l5kylvdypm.R.inc(1607);write(file, data, Charset.defaultCharset(), append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a CharSequence to a file creating the file if it does not exist.
     *
     * @param file     the file to write
     * @param data     the content to write to the file
     * @param charset the name of the requested charset, {@code null} means platform default
     * @throws IOException in case of an I/O error
     * @since 2.3
     */
    public static void write(final File file, final CharSequence data, final Charset charset) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1608);
        __CLR4_4_1l5l5kylvdypm.R.inc(1609);write(file, data, charset, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a CharSequence to a file creating the file if it does not exist.
     *
     * @param file     the file to write
     * @param data     the content to write to the file
     * @param charset the charset to use, {@code null} means platform default
     * @param append   if {@code true}, then the data will be added to the
     *                 end of the file rather than overwriting
     * @throws IOException in case of an I/O error
     * @since 2.3
     */
    public static void write(final File file, final CharSequence data, final Charset charset, final boolean append)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1610);
        __CLR4_4_1l5l5kylvdypm.R.inc(1611);writeStringToFile(file, Objects.toString(data, null), charset, append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    // Private method, must be invoked will a directory parameter

    /**
     * Writes a CharSequence to a file creating the file if it does not exist.
     *
     * @param file     the file to write
     * @param data     the content to write to the file
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @throws IOException                          in case of an I/O error
     * @throws java.io.UnsupportedEncodingException if the encoding is not supported by the VM
     * @since 2.0
     */
    public static void write(final File file, final CharSequence data, final String charsetName) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1612);
        __CLR4_4_1l5l5kylvdypm.R.inc(1613);write(file, data, charsetName, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a CharSequence to a file creating the file if it does not exist.
     *
     * @param file     the file to write
     * @param data     the content to write to the file
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @param append   if {@code true}, then the data will be added to the
     *                 end of the file rather than overwriting
     * @throws IOException                 in case of an I/O error
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the encoding is not supported by the VM
     * @since 2.1
     */
    public static void write(final File file, final CharSequence data, final String charsetName, final boolean append)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1614);
        __CLR4_4_1l5l5kylvdypm.R.inc(1615);write(file, data, Charsets.toCharset(charsetName), append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a byte array to a file creating the file if it does not exist.
     * <p>
     * NOTE: As from v1.3, the parent directories of the file will be created
     * if they do not exist.
     * </p>
     *
     * @param file the file to write to
     * @param data the content to write to the file
     * @throws IOException in case of an I/O error
     * @since 1.1
     */
    public static void writeByteArrayToFile(final File file, final byte[] data) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1616);
        __CLR4_4_1l5l5kylvdypm.R.inc(1617);writeByteArrayToFile(file, data, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    // Must be called with a directory

    /**
     * Writes a byte array to a file creating the file if it does not exist.
     *
     * @param file   the file to write to
     * @param data   the content to write to the file
     * @param append if {@code true}, then bytes will be added to the
     *               end of the file rather than overwriting
     * @throws IOException in case of an I/O error
     * @since 2.1
     */
    public static void writeByteArrayToFile(final File file, final byte[] data, final boolean append)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1618);
        __CLR4_4_1l5l5kylvdypm.R.inc(1619);writeByteArrayToFile(file, data, 0, data.length, append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes {@code len} bytes from the specified byte array starting
     * at offset {@code off} to a file, creating the file if it does
     * not exist.
     *
     * @param file the file to write to
     * @param data the content to write to the file
     * @param off  the start offset in the data
     * @param len  the number of bytes to write
     * @throws IOException in case of an I/O error
     * @since 2.5
     */
    public static void writeByteArrayToFile(final File file, final byte[] data, final int off, final int len)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1620);
        __CLR4_4_1l5l5kylvdypm.R.inc(1621);writeByteArrayToFile(file, data, off, len, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes {@code len} bytes from the specified byte array starting
     * at offset {@code off} to a file, creating the file if it does
     * not exist.
     *
     * @param file   the file to write to
     * @param data   the content to write to the file
     * @param off    the start offset in the data
     * @param len    the number of bytes to write
     * @param append if {@code true}, then bytes will be added to the
     *               end of the file rather than overwriting
     * @throws IOException in case of an I/O error
     * @since 2.5
     */
    public static void writeByteArrayToFile(final File file, final byte[] data, final int off, final int len,
                                            final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1622);
        class __CLR4_4_1$AC11 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(1623);try (__CLR4_4_1$AC11 __CLR$ACI13=new __CLR4_4_1$AC11(){{__CLR4_4_1l5l5kylvdypm.R.inc(1624);}};OutputStream out = openOutputStream(file, append)) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1625);out.write(data, off, len);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * the specified {@code File} line by line.
     * The default VM encoding and the default line ending will be used.
     *
     * @param file  the file to write to
     * @param lines the lines to write, {@code null} entries produce blank lines
     * @throws IOException in case of an I/O error
     * @since 1.3
     */
    public static void writeLines(final File file, final Collection<?> lines) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1626);
        __CLR4_4_1l5l5kylvdypm.R.inc(1627);writeLines(file, null, lines, null, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * the specified {@code File} line by line.
     * The default VM encoding and the default line ending will be used.
     *
     * @param file   the file to write to
     * @param lines  the lines to write, {@code null} entries produce blank lines
     * @param append if {@code true}, then the lines will be added to the
     *               end of the file rather than overwriting
     * @throws IOException in case of an I/O error
     * @since 2.1
     */
    public static void writeLines(final File file, final Collection<?> lines, final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1628);
        __CLR4_4_1l5l5kylvdypm.R.inc(1629);writeLines(file, null, lines, null, append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * the specified {@code File} line by line.
     * The default VM encoding and the specified line ending will be used.
     *
     * @param file       the file to write to
     * @param lines      the lines to write, {@code null} entries produce blank lines
     * @param lineEnding the line separator to use, {@code null} is system default
     * @throws IOException in case of an I/O error
     * @since 1.3
     */
    public static void writeLines(final File file, final Collection<?> lines, final String lineEnding)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1630);
        __CLR4_4_1l5l5kylvdypm.R.inc(1631);writeLines(file, null, lines, lineEnding, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}


    /**
     * Writes the {@code toString()} value of each item in a collection to
     * the specified {@code File} line by line.
     * The default VM encoding and the specified line ending will be used.
     *
     * @param file       the file to write to
     * @param lines      the lines to write, {@code null} entries produce blank lines
     * @param lineEnding the line separator to use, {@code null} is system default
     * @param append     if {@code true}, then the lines will be added to the
     *                   end of the file rather than overwriting
     * @throws IOException in case of an I/O error
     * @since 2.1
     */
    public static void writeLines(final File file, final Collection<?> lines, final String lineEnding,
                                  final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1632);
        __CLR4_4_1l5l5kylvdypm.R.inc(1633);writeLines(file, null, lines, lineEnding, append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * the specified {@code File} line by line.
     * The specified character encoding and the default line ending will be used.
     * <p>
     * NOTE: As from v1.3, the parent directories of the file will be created
     * if they do not exist.
     * </p>
     *
     * @param file     the file to write to
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @param lines    the lines to write, {@code null} entries produce blank lines
     * @throws IOException                          in case of an I/O error
     * @throws java.io.UnsupportedEncodingException if the encoding is not supported by the VM
     * @since 1.1
     */
    public static void writeLines(final File file, final String charsetName, final Collection<?> lines)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1634);
        __CLR4_4_1l5l5kylvdypm.R.inc(1635);writeLines(file, charsetName, lines, null, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * the specified {@code File} line by line, optionally appending.
     * The specified character encoding and the default line ending will be used.
     *
     * @param file     the file to write to
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @param lines    the lines to write, {@code null} entries produce blank lines
     * @param append   if {@code true}, then the lines will be added to the
     *                 end of the file rather than overwriting
     * @throws IOException                          in case of an I/O error
     * @throws java.io.UnsupportedEncodingException if the encoding is not supported by the VM
     * @since 2.1
     */
    public static void writeLines(final File file, final String charsetName, final Collection<?> lines,
                                  final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1636);
        __CLR4_4_1l5l5kylvdypm.R.inc(1637);writeLines(file, charsetName, lines, null, append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * the specified {@code File} line by line.
     * The specified character encoding and the line ending will be used.
     * <p>
     * NOTE: As from v1.3, the parent directories of the file will be created
     * if they do not exist.
     * </p>
     *
     * @param file       the file to write to
     * @param charsetName   the name of the requested charset, {@code null} means platform default
     * @param lines      the lines to write, {@code null} entries produce blank lines
     * @param lineEnding the line separator to use, {@code null} is system default
     * @throws IOException                          in case of an I/O error
     * @throws java.io.UnsupportedEncodingException if the encoding is not supported by the VM
     * @since 1.1
     */
    public static void writeLines(final File file, final String charsetName, final Collection<?> lines,
                                  final String lineEnding) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1638);
        __CLR4_4_1l5l5kylvdypm.R.inc(1639);writeLines(file, charsetName, lines, lineEnding, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes the {@code toString()} value of each item in a collection to
     * the specified {@code File} line by line.
     * The specified character encoding and the line ending will be used.
     *
     * @param file       the file to write to
     * @param charsetName   the name of the requested charset, {@code null} means platform default
     * @param lines      the lines to write, {@code null} entries produce blank lines
     * @param lineEnding the line separator to use, {@code null} is system default
     * @param append     if {@code true}, then the lines will be added to the
     *                   end of the file rather than overwriting
     * @throws IOException                          in case of an I/O error
     * @throws java.io.UnsupportedEncodingException if the encoding is not supported by the VM
     * @since 2.1
     */
    public static void writeLines(final File file, final String charsetName, final Collection<?> lines,
                                  final String lineEnding, final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1640);
        class __CLR4_4_1$AC12 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(1641);try (__CLR4_4_1$AC12 __CLR$ACI14=new __CLR4_4_1$AC12(){{__CLR4_4_1l5l5kylvdypm.R.inc(1642);}};OutputStream out = new BufferedOutputStream(openOutputStream(file, append))) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1643);IOUtils.writeLines(lines, lineEnding, out, charsetName);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a String to a file creating the file if it does not exist using the default encoding for the VM.
     *
     * @param file the file to write
     * @param data the content to write to the file
     * @throws IOException in case of an I/O error
     * @deprecated 2.5 use {@link #writeStringToFile(File, String, Charset)} instead (and specify the appropriate encoding)
     */
    @Deprecated
    public static void writeStringToFile(final File file, final String data) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1644);
        __CLR4_4_1l5l5kylvdypm.R.inc(1645);writeStringToFile(file, data, Charset.defaultCharset(), false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a String to a file creating the file if it does not exist using the default encoding for the VM.
     *
     * @param file   the file to write
     * @param data   the content to write to the file
     * @param append if {@code true}, then the String will be added to the
     *               end of the file rather than overwriting
     * @throws IOException in case of an I/O error
     * @since 2.1
     * @deprecated 2.5 use {@link #writeStringToFile(File, String, Charset, boolean)} instead (and specify the appropriate encoding)
     */
    @Deprecated
    public static void writeStringToFile(final File file, final String data, final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1646);
        __CLR4_4_1l5l5kylvdypm.R.inc(1647);writeStringToFile(file, data, Charset.defaultCharset(), append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a String to a file creating the file if it does not exist.
     * <p>
     * NOTE: As from v1.3, the parent directories of the file will be created
     * if they do not exist.
     * </p>
     *
     * @param file     the file to write
     * @param data     the content to write to the file
     * @param charset the charset to use, {@code null} means platform default
     * @throws IOException                          in case of an I/O error
     * @throws java.io.UnsupportedEncodingException if the encoding is not supported by the VM
     * @since 2.4
     */
    public static void writeStringToFile(final File file, final String data, final Charset charset)
            throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1648);
        __CLR4_4_1l5l5kylvdypm.R.inc(1649);writeStringToFile(file, data, charset, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a String to a file creating the file if it does not exist.
     *
     * @param file     the file to write
     * @param data     the content to write to the file
     * @param charset the charset to use, {@code null} means platform default
     * @param append   if {@code true}, then the String will be added to the
     *                 end of the file rather than overwriting
     * @throws IOException in case of an I/O error
     * @since 2.3
     */
    public static void writeStringToFile(final File file, final String data, final Charset charset,
                                         final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1650);
        class __CLR4_4_1$AC13 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1l5l5kylvdypm.R.inc(1651);try (__CLR4_4_1$AC13 __CLR$ACI15=new __CLR4_4_1$AC13(){{__CLR4_4_1l5l5kylvdypm.R.inc(1652);}};OutputStream out = openOutputStream(file, append)) {
            __CLR4_4_1l5l5kylvdypm.R.inc(1653);IOUtils.write(data, out, charset);
        }
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a String to a file creating the file if it does not exist.
     * <p>
     * NOTE: As from v1.3, the parent directories of the file will be created
     * if they do not exist.
     * </p>
     *
     * @param file     the file to write
     * @param data     the content to write to the file
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @throws IOException                          in case of an I/O error
     * @throws java.io.UnsupportedEncodingException if the encoding is not supported by the VM
     */
    public static void writeStringToFile(final File file, final String data, final String charsetName) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1654);
        __CLR4_4_1l5l5kylvdypm.R.inc(1655);writeStringToFile(file, data, charsetName, false);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Writes a String to a file creating the file if it does not exist.
     *
     * @param file     the file to write
     * @param data     the content to write to the file
     * @param charsetName the name of the requested charset, {@code null} means platform default
     * @param append   if {@code true}, then the String will be added to the
     *                 end of the file rather than overwriting
     * @throws IOException                 in case of an I/O error
     * @throws java.nio.charset.UnsupportedCharsetException thrown instead of {@link java.io
     * .UnsupportedEncodingException} in version 2.2 if the encoding is not supported by the VM
     * @since 2.1
     */
    public static void writeStringToFile(final File file, final String data, final String charsetName,
                                         final boolean append) throws IOException {try{__CLR4_4_1l5l5kylvdypm.R.inc(1656);
        __CLR4_4_1l5l5kylvdypm.R.inc(1657);writeStringToFile(file, data, Charsets.toCharset(charsetName), append);
    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}

    /**
     * Instances should NOT be constructed in standard programming.
     * @deprecated Will be private in 3.0.
     */
    @Deprecated
    public FileUtils() {try{__CLR4_4_1l5l5kylvdypm.R.inc(1658); //NOSONAR

    }finally{__CLR4_4_1l5l5kylvdypm.R.flushNeeded();}}
}
