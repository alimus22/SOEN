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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 * General File System utilities.
 * <p>
 * This class provides static utility methods for general file system
 * functions not provided via the JDK {@link java.io.File File} class.
 * <p>
 * The current functions provided are:
 * <ul>
 * <li>Get the free space on a drive
 * </ul>
 *
 * @since 1.1
 * @deprecated As of 2.6 deprecated without replacement. Use equivalent
 *  methods in {@link java.nio.file.FileStore} instead, e.g.
 *  {@code Files.getFileStore(Paths.get("/home")).getUsableSpace()}
 *  or iterate over {@code FileSystems.getDefault().getFileStores()}
 */
@java.lang.SuppressWarnings({"fallthrough"}) @Deprecated
public class FileSystemUtils {public static class __CLR4_4_1f0f0kylvdyj5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,761,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Singleton instance, used mainly for testing. */
    private static final FileSystemUtils INSTANCE = new FileSystemUtils();

    /** Operating system state flag for error. */
    private static final int INIT_PROBLEM = -1;
    /** Operating system state flag for neither Unix nor Windows. */
    private static final int OTHER = 0;
    /** Operating system state flag for Windows. */
    private static final int WINDOWS = 1;
    /** Operating system state flag for Unix. */
    private static final int UNIX = 2;
    /** Operating system state flag for Posix flavour Unix. */
    private static final int POSIX_UNIX = 3;

    /** The operating system flag. */
    private static final int OS;

    /** The path to df */
    private static final String DF;

    static {try{__CLR4_4_1f0f0kylvdyj5.R.inc(540);
        __CLR4_4_1f0f0kylvdyj5.R.inc(541);int os = OTHER;
        __CLR4_4_1f0f0kylvdyj5.R.inc(542);String dfPath = "df";
        __CLR4_4_1f0f0kylvdyj5.R.inc(543);try {
            __CLR4_4_1f0f0kylvdyj5.R.inc(544);String osName = System.getProperty("os.name");
            __CLR4_4_1f0f0kylvdyj5.R.inc(545);if ((((osName == null)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(546)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(547)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(548);throw new IOException("os.name not found");
            }
            }__CLR4_4_1f0f0kylvdyj5.R.inc(549);osName = osName.toLowerCase(Locale.ENGLISH);
            // match
            __CLR4_4_1f0f0kylvdyj5.R.inc(550);if ((((osName.contains("windows"))&&(__CLR4_4_1f0f0kylvdyj5.R.iget(551)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(552)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(553);os = WINDOWS;
            } }else {__CLR4_4_1f0f0kylvdyj5.R.inc(554);if ((((osName.contains("linux") ||
                    osName.contains("mpe/ix") ||
                    osName.contains("freebsd") ||
                    osName.contains("openbsd") ||
                    osName.contains("irix") ||
                    osName.contains("digital unix") ||
                    osName.contains("unix") ||
                    osName.contains("mac os x"))&&(__CLR4_4_1f0f0kylvdyj5.R.iget(555)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(556)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(557);os = UNIX;
            } }else {__CLR4_4_1f0f0kylvdyj5.R.inc(558);if ((((osName.contains("sun os") ||
                    osName.contains("sunos") ||
                    osName.contains("solaris"))&&(__CLR4_4_1f0f0kylvdyj5.R.iget(559)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(560)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(561);os = POSIX_UNIX;
                __CLR4_4_1f0f0kylvdyj5.R.inc(562);dfPath = "/usr/xpg4/bin/df";
            } }else {__CLR4_4_1f0f0kylvdyj5.R.inc(563);if ((((osName.contains("hp-ux") ||
                    osName.contains("aix"))&&(__CLR4_4_1f0f0kylvdyj5.R.iget(564)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(565)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(566);os = POSIX_UNIX;
            }

        }}}}} catch (final Exception ex) {
            __CLR4_4_1f0f0kylvdyj5.R.inc(567);os = INIT_PROBLEM;
        }
        __CLR4_4_1f0f0kylvdyj5.R.inc(568);OS = os;
        __CLR4_4_1f0f0kylvdyj5.R.inc(569);DF = dfPath;
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Instances should NOT be constructed in standard programming.
     */
    public FileSystemUtils() {try{__CLR4_4_1f0f0kylvdyj5.R.inc(570);
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Returns the free space on a drive or volume by invoking
     * the command line.
     * This method does not normalize the result, and typically returns
     * bytes on Windows, 512 byte units on OS X and kilobytes on Unix.
     * As this is not very useful, this method is deprecated in favour
     * of {@link #freeSpaceKb(String)} which returns a result in kilobytes.
     * <p>
     * Note that some OS's are NOT currently supported, including OS/390,
     * OpenVMS.
     * <pre>
     * FileSystemUtils.freeSpace("C:");       // Windows
     * FileSystemUtils.freeSpace("/volume");  // *nix
     * </pre>
     * The free space is calculated via the command line.
     * It uses 'dir /-c' on Windows and 'df' on *nix.
     *
     * @param path  the path to get free space for, not null, not empty on Unix
     * @return the amount of free drive space on the drive or volume
     * @throws IllegalArgumentException if the path is invalid
     * @throws IllegalStateException if an error occurred in initialisation
     * @throws IOException if an error occurs when finding the free space
     * @since 1.1, enhanced OS support in 1.2 and 1.3
     * @deprecated Use freeSpaceKb(String)
     *  Deprecated from 1.3, may be removed in 2.0
     */
    @Deprecated
    public static long freeSpace(final String path) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(571);
        __CLR4_4_1f0f0kylvdyj5.R.inc(572);return INSTANCE.freeSpaceOS(path, OS, false, Duration.ofMillis(-1));
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Returns the free space on a drive or volume in kibibytes (1024 bytes)
     * by invoking the command line.
     * <pre>
     * FileSystemUtils.freeSpaceKb("C:");       // Windows
     * FileSystemUtils.freeSpaceKb("/volume");  // *nix
     * </pre>
     * The free space is calculated via the command line.
     * It uses 'dir /-c' on Windows, 'df -kP' on AIX/HP-UX and 'df -k' on other Unix.
     * <p>
     * In order to work, you must be running Windows, or have a implementation of
     * Unix df that supports GNU format when passed -k (or -kP). If you are going
     * to rely on this code, please check that it works on your OS by running
     * some simple tests to compare the command line with the output from this class.
     * If your operating system isn't supported, please raise a JIRA call detailing
     * the exact result from df -k and as much other detail as possible, thanks.
     *
     * @param path  the path to get free space for, not null, not empty on Unix
     * @return the amount of free drive space on the drive or volume in kilobytes
     * @throws IllegalArgumentException if the path is invalid
     * @throws IllegalStateException if an error occurred in initialisation
     * @throws IOException if an error occurs when finding the free space
     * @since 1.2, enhanced OS support in 1.3
     * @deprecated As of 2.6 deprecated without replacement. Please use {@link java.nio.file.FileStore#getUsableSpace()}.
     */
    @Deprecated
    public static long freeSpaceKb(final String path) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(573);
        __CLR4_4_1f0f0kylvdyj5.R.inc(574);return freeSpaceKb(path, -1);
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}
    /**
     * Returns the free space on a drive or volume in kibibytes (1024 bytes)
     * by invoking the command line.
     * <pre>
     * FileSystemUtils.freeSpaceKb("C:");       // Windows
     * FileSystemUtils.freeSpaceKb("/volume");  // *nix
     * </pre>
     * The free space is calculated via the command line.
     * It uses 'dir /-c' on Windows, 'df -kP' on AIX/HP-UX and 'df -k' on other Unix.
     * <p>
     * In order to work, you must be running Windows, or have a implementation of
     * Unix df that supports GNU format when passed -k (or -kP). If you are going
     * to rely on this code, please check that it works on your OS by running
     * some simple tests to compare the command line with the output from this class.
     * If your operating system isn't supported, please raise a JIRA call detailing
     * the exact result from df -k and as much other detail as possible, thanks.
     *
     * @param path  the path to get free space for, not null, not empty on Unix
     * @param timeout The timeout amount in milliseconds or no timeout if the value
     *  is zero or less
     * @return the amount of free drive space on the drive or volume in kilobytes
     * @throws IllegalArgumentException if the path is invalid
     * @throws IllegalStateException if an error occurred in initialisation
     * @throws IOException if an error occurs when finding the free space
     * @since 2.0
     * @deprecated As of 2.6 deprecated without replacement. Please use {@link java.nio.file.FileStore#getUsableSpace()}.
     */
    @Deprecated
    public static long freeSpaceKb(final String path, final long timeout) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(575);
        __CLR4_4_1f0f0kylvdyj5.R.inc(576);return INSTANCE.freeSpaceOS(path, OS, true, Duration.ofMillis(timeout));
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Returns the free space for the working directory
     * in kibibytes (1024 bytes) by invoking the command line.
     * <p>
     * Identical to:
     * <pre>
     * freeSpaceKb(new File(".").getAbsolutePath())
     * </pre>
     * @return the amount of free drive space on the drive or volume in kilobytes
     * @throws IllegalStateException if an error occurred in initialisation
     * @throws IOException if an error occurs when finding the free space
     * @since 2.0
     * @deprecated As of 2.6 deprecated without replacement. Please use {@link java.nio.file.FileStore#getUsableSpace()}.
     */
    @Deprecated
    public static long freeSpaceKb() throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(577);
        __CLR4_4_1f0f0kylvdyj5.R.inc(578);return freeSpaceKb(-1);
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Returns the free space for the working directory
     * in kibibytes (1024 bytes) by invoking the command line.
     * <p>
     * Identical to:
     * <pre>
     * freeSpaceKb(new File(".").getAbsolutePath())
     * </pre>
     * @param timeout The timeout amount in milliseconds or no timeout if the value
     *  is zero or less
     * @return the amount of free drive space on the drive or volume in kilobytes
     * @throws IllegalStateException if an error occurred in initialisation
     * @throws IOException if an error occurs when finding the free space
     * @since 2.0
     * @deprecated As of 2.6 deprecated without replacement. Please use {@link java.nio.file.FileStore#getUsableSpace()}.
     */
    @Deprecated
    public static long freeSpaceKb(final long timeout) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(579);
        __CLR4_4_1f0f0kylvdyj5.R.inc(580);return freeSpaceKb(new File(".").getAbsolutePath(), timeout);
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Returns the free space on a drive or volume in a cross-platform manner.
     * Note that some OS's are NOT currently supported, including OS/390.
     * <pre>
     * FileSystemUtils.freeSpace("C:");  // Windows
     * FileSystemUtils.freeSpace("/volume");  // *nix
     * </pre>
     * The free space is calculated via the command line.
     * It uses 'dir /-c' on Windows and 'df' on *nix.
     *
     * @param path  the path to get free space for, not null, not empty on Unix
     * @param os  the operating system code
     * @param kb  whether to normalize to kilobytes
     * @param timeout The timeout amount in milliseconds or no timeout if the value
     *  is zero or less
     * @return the amount of free drive space on the drive or volume
     * @throws IllegalArgumentException if the path is invalid
     * @throws IllegalStateException if an error occurred in initialisation
     * @throws IOException if an error occurs when finding the free space
     */
    long freeSpaceOS(final String path, final int os, final boolean kb, final Duration timeout) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(581);
        __CLR4_4_1f0f0kylvdyj5.R.inc(582);if ((((path == null)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(583)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(584)==0&false))) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(585);throw new IllegalArgumentException("Path must not be null");
        }
        }boolean __CLB4_4_1_bool0=false;__CLR4_4_1f0f0kylvdyj5.R.inc(586);switch (os) {
            case WINDOWS:if (!__CLB4_4_1_bool0) {__CLR4_4_1f0f0kylvdyj5.R.inc(587);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f0f0kylvdyj5.R.inc(588);return (((kb )&&(__CLR4_4_1f0f0kylvdyj5.R.iget(589)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(590)==0&false))? freeSpaceWindows(path, timeout) / FileUtils.ONE_KB : freeSpaceWindows(path, timeout);
            case UNIX:if (!__CLB4_4_1_bool0) {__CLR4_4_1f0f0kylvdyj5.R.inc(591);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f0f0kylvdyj5.R.inc(592);return freeSpaceUnix(path, kb, false, timeout);
            case POSIX_UNIX:if (!__CLB4_4_1_bool0) {__CLR4_4_1f0f0kylvdyj5.R.inc(593);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f0f0kylvdyj5.R.inc(594);return freeSpaceUnix(path, kb, true, timeout);
            case OTHER:if (!__CLB4_4_1_bool0) {__CLR4_4_1f0f0kylvdyj5.R.inc(595);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f0f0kylvdyj5.R.inc(596);throw new IllegalStateException("Unsupported operating system");
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1f0f0kylvdyj5.R.inc(597);__CLB4_4_1_bool0=true;}
                __CLR4_4_1f0f0kylvdyj5.R.inc(598);throw new IllegalStateException(
                  "Exception caught when determining operating system");
        }
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Find free space on the Windows platform using the 'dir' command.
     *
     * @param path  the path to get free space for, including the colon
     * @param timeout The timeout amount in milliseconds or no timeout if the value
     *  is zero or less
     * @return the amount of free drive space on the drive
     * @throws IOException if an error occurs
     */
    long freeSpaceWindows(final String path, final Duration timeout) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(599);
        __CLR4_4_1f0f0kylvdyj5.R.inc(600);String normPath = FilenameUtils.normalize(path, false);
        __CLR4_4_1f0f0kylvdyj5.R.inc(601);if ((((normPath == null)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(602)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(603)==0&false))) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(604);throw new IllegalArgumentException(path);
        }
        }__CLR4_4_1f0f0kylvdyj5.R.inc(605);if ((((!normPath.isEmpty() && normPath.charAt(0) != '"')&&(__CLR4_4_1f0f0kylvdyj5.R.iget(606)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(607)==0&false))) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(608);normPath = "\"" + normPath + "\"";
        }

        // build and run the 'dir' command
        }__CLR4_4_1f0f0kylvdyj5.R.inc(609);final String[] cmdAttribs = {"cmd.exe", "/C", "dir /a /-c " + normPath};

        // read in the output of the command to an ArrayList
        __CLR4_4_1f0f0kylvdyj5.R.inc(610);final List<String> lines = performCommand(cmdAttribs, Integer.MAX_VALUE, timeout);

        // now iterate over the lines we just read and find the LAST
        // non-empty line (the free space bytes should be in the last element
        // of the ArrayList anyway, but this will ensure it works even if it's
        // not, still assuming it is on the last non-blank line)
        __CLR4_4_1f0f0kylvdyj5.R.inc(611);for (int i = lines.size() - 1; (((i >= 0)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(612)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(613)==0&false)); i--) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(614);final String line = lines.get(i);
            __CLR4_4_1f0f0kylvdyj5.R.inc(615);if ((((!line.isEmpty())&&(__CLR4_4_1f0f0kylvdyj5.R.iget(616)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(617)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(618);return parseDir(line, normPath);
            }
        }}
        // all lines are blank
        }__CLR4_4_1f0f0kylvdyj5.R.inc(619);throw new IOException(
                "Command line 'dir /-c' did not return any info " +
                "for path '" + normPath + "'");
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Parses the Windows dir response last line
     *
     * @param line  the line to parse
     * @param path  the path that was sent
     * @return the number of bytes
     * @throws IOException if an error occurs
     */
    long parseDir(final String line, final String path) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(620);
        // read from the end of the line to find the last numeric
        // character on the line, then continue until we find the first
        // non-numeric character, and everything between that and the last
        // numeric character inclusive is our free space bytes count
        __CLR4_4_1f0f0kylvdyj5.R.inc(621);int bytesStart = 0;
        __CLR4_4_1f0f0kylvdyj5.R.inc(622);int bytesEnd = 0;
        __CLR4_4_1f0f0kylvdyj5.R.inc(623);int j = line.length() - 1;
        __CLR4_4_1f0f0kylvdyj5.R.inc(624);innerLoop1: while ((((j >= 0)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(625)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(626)==0&false))) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(627);final char c = line.charAt(j);
            __CLR4_4_1f0f0kylvdyj5.R.inc(628);if ((((Character.isDigit(c))&&(__CLR4_4_1f0f0kylvdyj5.R.iget(629)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(630)==0&false))) {{
              // found the last numeric character, this is the end of
              // the free space bytes count
              __CLR4_4_1f0f0kylvdyj5.R.inc(631);bytesEnd = j + 1;
              __CLR4_4_1f0f0kylvdyj5.R.inc(632);break innerLoop1;
            }
            }__CLR4_4_1f0f0kylvdyj5.R.inc(633);j--;
        }
        }__CLR4_4_1f0f0kylvdyj5.R.inc(634);innerLoop2: while ((((j >= 0)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(635)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(636)==0&false))) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(637);final char c = line.charAt(j);
            __CLR4_4_1f0f0kylvdyj5.R.inc(638);if ((((!Character.isDigit(c) && c != ',' && c != '.')&&(__CLR4_4_1f0f0kylvdyj5.R.iget(639)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(640)==0&false))) {{
              // found the next non-numeric character, this is the
              // beginning of the free space bytes count
              __CLR4_4_1f0f0kylvdyj5.R.inc(641);bytesStart = j + 1;
              __CLR4_4_1f0f0kylvdyj5.R.inc(642);break innerLoop2;
            }
            }__CLR4_4_1f0f0kylvdyj5.R.inc(643);j--;
        }
        }__CLR4_4_1f0f0kylvdyj5.R.inc(644);if ((((j < 0)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(645)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(646)==0&false))) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(647);throw new IOException(
                    "Command line 'dir /-c' did not return valid info " +
                    "for path '" + path + "'");
        }

        // remove commas and dots in the bytes count
        }__CLR4_4_1f0f0kylvdyj5.R.inc(648);final StringBuilder buf = new StringBuilder(line.substring(bytesStart, bytesEnd));
        __CLR4_4_1f0f0kylvdyj5.R.inc(649);for (int k = 0; (((k < buf.length())&&(__CLR4_4_1f0f0kylvdyj5.R.iget(650)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(651)==0&false)); k++) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(652);if ((((buf.charAt(k) == ',' || buf.charAt(k) == '.')&&(__CLR4_4_1f0f0kylvdyj5.R.iget(653)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(654)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(655);buf.deleteCharAt(k--);
            }
        }}
        }__CLR4_4_1f0f0kylvdyj5.R.inc(656);return parseBytes(buf.toString(), path);
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Find free space on the *nix platform using the 'df' command.
     *
     * @param path  the path to get free space for
     * @param kb  whether to normalize to kilobytes
     * @param posix  whether to use the POSIX standard format flag
     * @param timeout The timeout amount in milliseconds or no timeout if the value
     *  is zero or less
     * @return the amount of free drive space on the volume
     * @throws IOException if an error occurs
     */
    long freeSpaceUnix(final String path, final boolean kb, final boolean posix, final Duration timeout)
            throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(657);
        __CLR4_4_1f0f0kylvdyj5.R.inc(658);if ((((path.isEmpty())&&(__CLR4_4_1f0f0kylvdyj5.R.iget(659)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(660)==0&false))) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(661);throw new IllegalArgumentException("Path must not be empty");
        }

        // build and run the 'dir' command
        }__CLR4_4_1f0f0kylvdyj5.R.inc(662);String flags = "-";
        __CLR4_4_1f0f0kylvdyj5.R.inc(663);if ((((kb)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(664)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(665)==0&false))) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(666);flags += "k";
        }
        }__CLR4_4_1f0f0kylvdyj5.R.inc(667);if ((((posix)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(668)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(669)==0&false))) {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(670);flags += "P";
        }
        }__CLR4_4_1f0f0kylvdyj5.R.inc(671);final String[] cmdAttribs =
            (((flags.length() > 1 )&&(__CLR4_4_1f0f0kylvdyj5.R.iget(672)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(673)==0&false))? new String[] {DF, flags, path} : new String[] {DF, path};

        // perform the command, asking for up to 3 lines (header, interesting, overflow)
        __CLR4_4_1f0f0kylvdyj5.R.inc(674);final List<String> lines = performCommand(cmdAttribs, 3, timeout);
        __CLR4_4_1f0f0kylvdyj5.R.inc(675);if ((((lines.size() < 2)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(676)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(677)==0&false))) {{
            // unknown problem, throw exception
            __CLR4_4_1f0f0kylvdyj5.R.inc(678);throw new IOException(
                    "Command line '" + DF + "' did not return info as expected " +
                    "for path '" + path + "'- response was " + lines);
        }
        }__CLR4_4_1f0f0kylvdyj5.R.inc(679);final String line2 = lines.get(1); // the line we're interested in

        // Now, we tokenize the string. The fourth element is what we want.
        __CLR4_4_1f0f0kylvdyj5.R.inc(680);StringTokenizer tok = new StringTokenizer(line2, " ");
        __CLR4_4_1f0f0kylvdyj5.R.inc(681);if ((((tok.countTokens() < 4)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(682)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(683)==0&false))) {{
            // could be long Filesystem, thus data on third line
            __CLR4_4_1f0f0kylvdyj5.R.inc(684);if (((((tok.countTokens() != 1) || (lines.size() < 3))&&(__CLR4_4_1f0f0kylvdyj5.R.iget(685)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(686)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(687);throw new IOException(
                        "Command line '" + DF + "' did not return data as expected " +
                        "for path '" + path + "'- check path is valid");
            }
            }__CLR4_4_1f0f0kylvdyj5.R.inc(688);final String line3 = lines.get(2); // the line may be interested in
            __CLR4_4_1f0f0kylvdyj5.R.inc(689);tok = new StringTokenizer(line3, " ");
        } }else {{
            __CLR4_4_1f0f0kylvdyj5.R.inc(690);tok.nextToken(); // Ignore Filesystem
        }
        }__CLR4_4_1f0f0kylvdyj5.R.inc(691);tok.nextToken(); // Ignore 1K-blocks
        __CLR4_4_1f0f0kylvdyj5.R.inc(692);tok.nextToken(); // Ignore Used
        __CLR4_4_1f0f0kylvdyj5.R.inc(693);final String freeSpace = tok.nextToken();
        __CLR4_4_1f0f0kylvdyj5.R.inc(694);return parseBytes(freeSpace, path);
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Parses the bytes from a string.
     *
     * @param freeSpace  the free space string
     * @param path  the path
     * @return the number of bytes
     * @throws IOException if an error occurs
     */
    long parseBytes(final String freeSpace, final String path) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(695);
        __CLR4_4_1f0f0kylvdyj5.R.inc(696);try {
            __CLR4_4_1f0f0kylvdyj5.R.inc(697);final long bytes = Long.parseLong(freeSpace);
            __CLR4_4_1f0f0kylvdyj5.R.inc(698);if ((((bytes < 0)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(699)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(700)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(701);throw new IOException(
                        "Command line '" + DF + "' did not find free space in response " +
                        "for path '" + path + "'- check path is valid");
            }
            }__CLR4_4_1f0f0kylvdyj5.R.inc(702);return bytes;

        } catch (final NumberFormatException ex) {
            __CLR4_4_1f0f0kylvdyj5.R.inc(703);throw new IOException(
                    "Command line '" + DF + "' did not return numeric data as expected " +
                    "for path '" + path + "'- check path is valid", ex);
        }
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Performs an OS command.
     *
     * @param cmdAttribs  the command line parameters
     * @param max The maximum limit for the lines returned
     * @param timeout The timeout amount in milliseconds or no timeout if the value
     *  is zero or less
     * @return the lines returned by the command, converted to lower-case
     * @throws IOException if an error occurs
     */
    List<String> performCommand(final String[] cmdAttribs, final int max, final Duration timeout) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(704);
        // this method does what it can to avoid the 'Too many open files' error
        // based on trial and error and these links:
        // http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4784692
        // http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4801027
        // http://forum.java.sun.com/thread.jspa?threadID=533029&messageID=2572018
        // however, its still not perfect as the JDK support is so poor
        // (see commons-exec or Ant for a better multi-threaded multi-os solution)

        __CLR4_4_1f0f0kylvdyj5.R.inc(705);final List<String> lines = new ArrayList<>(20);
        __CLR4_4_1f0f0kylvdyj5.R.inc(706);Process proc = null;
        __CLR4_4_1f0f0kylvdyj5.R.inc(707);InputStream in = null;
        __CLR4_4_1f0f0kylvdyj5.R.inc(708);OutputStream out = null;
        __CLR4_4_1f0f0kylvdyj5.R.inc(709);InputStream err = null;
        __CLR4_4_1f0f0kylvdyj5.R.inc(710);BufferedReader inr = null;
        __CLR4_4_1f0f0kylvdyj5.R.inc(711);try {

            __CLR4_4_1f0f0kylvdyj5.R.inc(712);final Thread monitor = ThreadMonitor.start(timeout);

            __CLR4_4_1f0f0kylvdyj5.R.inc(713);proc = openProcess(cmdAttribs);
            __CLR4_4_1f0f0kylvdyj5.R.inc(714);in = proc.getInputStream();
            __CLR4_4_1f0f0kylvdyj5.R.inc(715);out = proc.getOutputStream();
            __CLR4_4_1f0f0kylvdyj5.R.inc(716);err = proc.getErrorStream();
            // default charset is most likely appropriate here
            __CLR4_4_1f0f0kylvdyj5.R.inc(717);inr = new BufferedReader(new InputStreamReader(in, Charset.defaultCharset()));
            __CLR4_4_1f0f0kylvdyj5.R.inc(718);String line = inr.readLine();
            __CLR4_4_1f0f0kylvdyj5.R.inc(719);while ((((line != null && lines.size() < max)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(720)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(721)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(722);line = line.toLowerCase(Locale.ENGLISH).trim();
                __CLR4_4_1f0f0kylvdyj5.R.inc(723);lines.add(line);
                __CLR4_4_1f0f0kylvdyj5.R.inc(724);line = inr.readLine();
            }

            }__CLR4_4_1f0f0kylvdyj5.R.inc(725);proc.waitFor();

            __CLR4_4_1f0f0kylvdyj5.R.inc(726);ThreadMonitor.stop(monitor);

            __CLR4_4_1f0f0kylvdyj5.R.inc(727);if ((((proc.exitValue() != 0)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(728)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(729)==0&false))) {{
                // os command problem, throw exception
                __CLR4_4_1f0f0kylvdyj5.R.inc(730);throw new IOException(
                        "Command line returned OS error code '" + proc.exitValue() +
                        "' for command " + Arrays.asList(cmdAttribs));
            }
            }__CLR4_4_1f0f0kylvdyj5.R.inc(731);if ((((lines.isEmpty())&&(__CLR4_4_1f0f0kylvdyj5.R.iget(732)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(733)==0&false))) {{
                // unknown problem, throw exception
                __CLR4_4_1f0f0kylvdyj5.R.inc(734);throw new IOException(
                        "Command line did not return any info " +
                        "for command " + Arrays.asList(cmdAttribs));
            }

            }__CLR4_4_1f0f0kylvdyj5.R.inc(735);inr.close();
            __CLR4_4_1f0f0kylvdyj5.R.inc(736);inr = null;

            __CLR4_4_1f0f0kylvdyj5.R.inc(737);in.close();
            __CLR4_4_1f0f0kylvdyj5.R.inc(738);in = null;

            __CLR4_4_1f0f0kylvdyj5.R.inc(739);if ((((out != null)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(740)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(741)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(742);out.close();
                __CLR4_4_1f0f0kylvdyj5.R.inc(743);out = null;
            }

            }__CLR4_4_1f0f0kylvdyj5.R.inc(744);if ((((err != null)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(745)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(746)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(747);err.close();
                __CLR4_4_1f0f0kylvdyj5.R.inc(748);err = null;
            }

            }__CLR4_4_1f0f0kylvdyj5.R.inc(749);return lines;

        } catch (final InterruptedException ex) {
            __CLR4_4_1f0f0kylvdyj5.R.inc(750);throw new IOException(
                    "Command line threw an InterruptedException " +
                    "for command " + Arrays.asList(cmdAttribs) + " timeout=" + timeout, ex);
        } finally {
            __CLR4_4_1f0f0kylvdyj5.R.inc(751);IOUtils.closeQuietly(in);
            __CLR4_4_1f0f0kylvdyj5.R.inc(752);IOUtils.closeQuietly(out);
            __CLR4_4_1f0f0kylvdyj5.R.inc(753);IOUtils.closeQuietly(err);
            __CLR4_4_1f0f0kylvdyj5.R.inc(754);IOUtils.closeQuietly(inr);
            __CLR4_4_1f0f0kylvdyj5.R.inc(755);if ((((proc != null)&&(__CLR4_4_1f0f0kylvdyj5.R.iget(756)!=0|true))||(__CLR4_4_1f0f0kylvdyj5.R.iget(757)==0&false))) {{
                __CLR4_4_1f0f0kylvdyj5.R.inc(758);proc.destroy();
            }
        }}
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

    /**
     * Opens the process to the operating system.
     *
     * @param cmdAttribs  the command line parameters
     * @return the process
     * @throws IOException if an error occurs
     */
    Process openProcess(final String[] cmdAttribs) throws IOException {try{__CLR4_4_1f0f0kylvdyj5.R.inc(759);
        __CLR4_4_1f0f0kylvdyj5.R.inc(760);return Runtime.getRuntime().exec(cmdAttribs);
    }finally{__CLR4_4_1f0f0kylvdyj5.R.flushNeeded();}}

}
