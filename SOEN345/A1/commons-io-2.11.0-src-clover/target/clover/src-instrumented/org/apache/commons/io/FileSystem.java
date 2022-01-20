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

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/**
 * Abstracts an OS' file system details, currently supporting the single use case of converting a file name String to a
 * legal file name with {@link #toLegalFileName(String, char)}.
 * <p>
 * The starting point of any operation is {@link #getCurrent()} which gets you the enum for the file system that matches
 * the OS hosting the running JVM.
 * </p>
 *
 * @since 2.7
 */
public enum FileSystem {

    /**
     * Generic file system.
     */
    GENERIC(false, false, Integer.MAX_VALUE, Integer.MAX_VALUE, new char[] { 0 }, new String[] {}, false),

    /**
     * Linux file system.
     */
    LINUX(true, true, 255, 4096, new char[] {
            // KEEP THIS ARRAY SORTED!
            // @formatter:off
            // ASCII NUL
            0,
             '/'
            // @formatter:on
    }, new String[] {}, false),

    /**
     * MacOS file system.
     */
    MAC_OSX(true, true, 255, 1024, new char[] {
            // KEEP THIS ARRAY SORTED!
            // @formatter:off
            // ASCII NUL
            0,
            '/',
             ':'
            // @formatter:on
    }, new String[] {}, false),

    /**
     * Windows file system.
     * <p>
     * The reserved characters are defined in the
     * <a href="https://docs.microsoft.com/en-us/windows/win32/fileio/naming-a-file">Naming Conventions
     * (microsoft.com)</a>.
     * </p>
     *
     * @see <a href="https://docs.microsoft.com/en-us/windows/win32/fileio/naming-a-file">Naming Conventions
     *      (microsoft.com)</a>
     */
    WINDOWS(false, true, 255,
            32000, new char[] {
                    // KEEP THIS ARRAY SORTED!
                    // @formatter:off
                    // ASCII NUL
                    0,
                    // 1-31 may be allowed in file streams
                    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                    29, 30, 31,
                    '"', '*', '/', ':', '<', '>', '?', '\\', '|'
                    // @formatter:on
            }, // KEEP THIS ARRAY SORTED!
            new String[] { "AUX", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "CON", "LPT1",
                    "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9", "NUL", "PRN" }, true);

    /**
     * <p>
     * Is {@code true} if this is Linux.
     * </p>
     * <p>
     * The field will return {@code false} if {@code OS_NAME} is {@code null}.
     * </p>
     */
    private static final boolean IS_OS_LINUX = getOsMatchesName("Linux");

    /**
     * <p>
     * Is {@code true} if this is Mac.
     * </p>
     * <p>
     * The field will return {@code false} if {@code OS_NAME} is {@code null}.
     * </p>
     */
    private static final boolean IS_OS_MAC = getOsMatchesName("Mac");

    /**
     * The prefix String for all Windows OS.
     */
    private static final String OS_NAME_WINDOWS_PREFIX = "Windows";

    /**
     * <p>
     * Is {@code true} if this is Windows.
     * </p>
     * <p>
     * The field will return {@code false} if {@code OS_NAME} is {@code null}.
     * </p>
     */
    private static final boolean IS_OS_WINDOWS = getOsMatchesName(OS_NAME_WINDOWS_PREFIX);

    /**
     * Gets the current file system.
     *
     * @return the current file system
     */
    public static FileSystem getCurrent() {try{__CLR4_4_1cfcfkylvdyhn.R.inc(447);
        __CLR4_4_1cfcfkylvdyhn.R.inc(448);if ((((IS_OS_LINUX)&&(__CLR4_4_1cfcfkylvdyhn.R.iget(449)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(450)==0&false))) {{
            __CLR4_4_1cfcfkylvdyhn.R.inc(451);return LINUX;
        }
        }__CLR4_4_1cfcfkylvdyhn.R.inc(452);if ((((IS_OS_MAC)&&(__CLR4_4_1cfcfkylvdyhn.R.iget(453)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(454)==0&false))) {{
            __CLR4_4_1cfcfkylvdyhn.R.inc(455);return FileSystem.MAC_OSX;
        }
        }__CLR4_4_1cfcfkylvdyhn.R.inc(456);if ((((IS_OS_WINDOWS)&&(__CLR4_4_1cfcfkylvdyhn.R.iget(457)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(458)==0&false))) {{
            __CLR4_4_1cfcfkylvdyhn.R.inc(459);return FileSystem.WINDOWS;
        }
        }__CLR4_4_1cfcfkylvdyhn.R.inc(460);return GENERIC;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Decides if the operating system matches.
     *
     * @param osNamePrefix
     *            the prefix for the os name
     * @return true if matches, or false if not or can't determine
     */
    private static boolean getOsMatchesName(final String osNamePrefix) {try{__CLR4_4_1cfcfkylvdyhn.R.inc(461);
        __CLR4_4_1cfcfkylvdyhn.R.inc(462);return isOsNameMatch(getSystemProperty("os.name"), osNamePrefix);
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * <p>
     * Gets a System property, defaulting to {@code null} if the property cannot be read.
     * </p>
     * <p>
     * If a {@code SecurityException} is caught, the return value is {@code null} and a message is written to
     * {@code System.err}.
     * </p>
     *
     * @param property
     *            the system property name
     * @return the system property value or {@code null} if a security problem occurs
     */
    private static String getSystemProperty(final String property) {try{__CLR4_4_1cfcfkylvdyhn.R.inc(463);
        __CLR4_4_1cfcfkylvdyhn.R.inc(464);try {
            __CLR4_4_1cfcfkylvdyhn.R.inc(465);return System.getProperty(property);
        } catch (final SecurityException ex) {
            // we are not allowed to look at this property
            __CLR4_4_1cfcfkylvdyhn.R.inc(466);System.err.println("Caught a SecurityException reading the system property '" + property
                    + "'; the SystemUtils property value will default to null.");
            __CLR4_4_1cfcfkylvdyhn.R.inc(467);return null;
        }
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Decides if the operating system matches.
     * <p>
     * This method is package private instead of private to support unit test invocation.
     * </p>
     *
     * @param osName
     *            the actual OS name
     * @param osNamePrefix
     *            the prefix for the expected OS name
     * @return true if matches, or false if not or can't determine
     */
    private static boolean isOsNameMatch(final String osName, final String osNamePrefix) {try{__CLR4_4_1cfcfkylvdyhn.R.inc(468);
        __CLR4_4_1cfcfkylvdyhn.R.inc(469);if ((((osName == null)&&(__CLR4_4_1cfcfkylvdyhn.R.iget(470)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(471)==0&false))) {{
            __CLR4_4_1cfcfkylvdyhn.R.inc(472);return false;
        }
        }__CLR4_4_1cfcfkylvdyhn.R.inc(473);return osName.toUpperCase(Locale.ROOT).startsWith(osNamePrefix.toUpperCase(Locale.ROOT));
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    private final boolean casePreserving;
    private final boolean caseSensitive;
    private final char[] illegalFileNameChars;
    private final int maxFileNameLength;
    private final int maxPathLength;
    private final String[] reservedFileNames;
    private final boolean supportsDriveLetter;

    /**
     * Constructs a new instance.
     *
     * @param caseSensitive Whether this file system is case sensitive.
     * @param casePreserving Whether this file system is case preserving.
     * @param maxFileLength The maximum length for file names. The file name does not include folders.
     * @param maxPathLength The maximum length of the path to a file. This can include folders.
     * @param illegalFileNameChars Illegal characters for this file system.
     * @param reservedFileNames The reserved file names.
     * @param supportsDriveLetter Whether this file system support driver letters.
     */
    FileSystem(final boolean caseSensitive, final boolean casePreserving, final int maxFileLength,
        final int maxPathLength, final char[] illegalFileNameChars, final String[] reservedFileNames,
        final boolean supportsDriveLetter) {try{__CLR4_4_1cfcfkylvdyhn.R.inc(474);
        __CLR4_4_1cfcfkylvdyhn.R.inc(475);this.maxFileNameLength = maxFileLength;
        __CLR4_4_1cfcfkylvdyhn.R.inc(476);this.maxPathLength = maxPathLength;
        __CLR4_4_1cfcfkylvdyhn.R.inc(477);this.illegalFileNameChars = Objects.requireNonNull(illegalFileNameChars, "illegalFileNameChars");
        __CLR4_4_1cfcfkylvdyhn.R.inc(478);this.reservedFileNames = Objects.requireNonNull(reservedFileNames, "reservedFileNames");
        __CLR4_4_1cfcfkylvdyhn.R.inc(479);this.caseSensitive = caseSensitive;
        __CLR4_4_1cfcfkylvdyhn.R.inc(480);this.casePreserving = casePreserving;
        __CLR4_4_1cfcfkylvdyhn.R.inc(481);this.supportsDriveLetter = supportsDriveLetter;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Gets a cloned copy of the illegal characters for this file system.
     *
     * @return the illegal characters for this file system.
     */
    public char[] getIllegalFileNameChars() {try{__CLR4_4_1cfcfkylvdyhn.R.inc(482);
        __CLR4_4_1cfcfkylvdyhn.R.inc(483);return this.illegalFileNameChars.clone();
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Gets the maximum length for file names. The file name does not include folders.
     *
     * @return the maximum length for file names.
     */
    public int getMaxFileNameLength() {try{__CLR4_4_1cfcfkylvdyhn.R.inc(484);
        __CLR4_4_1cfcfkylvdyhn.R.inc(485);return maxFileNameLength;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Gets the maximum length of the path to a file. This can include folders.
     *
     * @return the maximum length of the path to a file.
     */
    public int getMaxPathLength() {try{__CLR4_4_1cfcfkylvdyhn.R.inc(486);
        __CLR4_4_1cfcfkylvdyhn.R.inc(487);return maxPathLength;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Gets a cloned copy of the reserved file names.
     *
     * @return the reserved file names.
     */
    public String[] getReservedFileNames() {try{__CLR4_4_1cfcfkylvdyhn.R.inc(488);
        __CLR4_4_1cfcfkylvdyhn.R.inc(489);return reservedFileNames.clone();
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Whether this file system preserves case.
     *
     * @return Whether this file system preserves case.
     */
    public boolean isCasePreserving() {try{__CLR4_4_1cfcfkylvdyhn.R.inc(490);
        __CLR4_4_1cfcfkylvdyhn.R.inc(491);return casePreserving;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Whether this file system is case-sensitive.
     *
     * @return Whether this file system is case-sensitive.
     */
    public boolean isCaseSensitive() {try{__CLR4_4_1cfcfkylvdyhn.R.inc(492);
        __CLR4_4_1cfcfkylvdyhn.R.inc(493);return caseSensitive;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Returns {@code true} if the given character is illegal in a file name, {@code false} otherwise.
     *
     * @param c
     *            the character to test
     * @return {@code true} if the given character is illegal in a file name, {@code false} otherwise.
     */
    private boolean isIllegalFileNameChar(final char c) {try{__CLR4_4_1cfcfkylvdyhn.R.inc(494);
        __CLR4_4_1cfcfkylvdyhn.R.inc(495);return Arrays.binarySearch(illegalFileNameChars, c) >= 0;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Checks if a candidate file name (without a path) such as {@code "filename.ext"} or {@code "filename"} is a
     * potentially legal file name. If the file name length exceeds {@link #getMaxFileNameLength()}, or if it contains
     * an illegal character then the check fails.
     *
     * @param candidate
     *            a candidate file name (without a path) like {@code "filename.ext"} or {@code "filename"}
     * @return {@code true} if the candidate name is legal
     */
    public boolean isLegalFileName(final CharSequence candidate) {try{__CLR4_4_1cfcfkylvdyhn.R.inc(496);
        __CLR4_4_1cfcfkylvdyhn.R.inc(497);if ((((candidate == null || candidate.length() == 0 || candidate.length() > maxFileNameLength)&&(__CLR4_4_1cfcfkylvdyhn.R.iget(498)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(499)==0&false))) {{
            __CLR4_4_1cfcfkylvdyhn.R.inc(500);return false;
        }
        }__CLR4_4_1cfcfkylvdyhn.R.inc(501);if ((((isReservedFileName(candidate))&&(__CLR4_4_1cfcfkylvdyhn.R.iget(502)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(503)==0&false))) {{
            __CLR4_4_1cfcfkylvdyhn.R.inc(504);return false;
        }
        }__CLR4_4_1cfcfkylvdyhn.R.inc(505);for (int i = 0; (((i < candidate.length())&&(__CLR4_4_1cfcfkylvdyhn.R.iget(506)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(507)==0&false)); i++) {{
            __CLR4_4_1cfcfkylvdyhn.R.inc(508);if ((((isIllegalFileNameChar(candidate.charAt(i)))&&(__CLR4_4_1cfcfkylvdyhn.R.iget(509)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(510)==0&false))) {{
                __CLR4_4_1cfcfkylvdyhn.R.inc(511);return false;
            }
        }}
        }__CLR4_4_1cfcfkylvdyhn.R.inc(512);return true;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Returns whether the given string is a reserved file name.
     *
     * @param candidate
     *            the string to test
     * @return {@code true} if the given string is a reserved file name.
     */
    public boolean isReservedFileName(final CharSequence candidate) {try{__CLR4_4_1cfcfkylvdyhn.R.inc(513);
        __CLR4_4_1cfcfkylvdyhn.R.inc(514);return Arrays.binarySearch(reservedFileNames, candidate) >= 0;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Tests whether this file system support driver letters.
     * <p>
     * Windows supports driver letters as do other operating systems. Whether these other OS's still support Java like
     * OS/2, is a different matter.
     * </p>
     *
     * @return whether this file system support driver letters.
     * @since 2.9.0
     * @see <a href="https://en.wikipedia.org/wiki/Drive_letter_assignment">Operating systems that use drive letter
     *      assignment</a>
     */
    public boolean supportsDriveLetter() {try{__CLR4_4_1cfcfkylvdyhn.R.inc(515);
        __CLR4_4_1cfcfkylvdyhn.R.inc(516);return supportsDriveLetter;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}

    /**
     * Converts a candidate file name (without a path) like {@code "filename.ext"} or {@code "filename"} to a legal file
     * name. Illegal characters in the candidate name are replaced by the {@code replacement} character. If the file
     * name length exceeds {@link #getMaxFileNameLength()}, then the name is truncated to
     * {@link #getMaxFileNameLength()}.
     *
     * @param candidate
     *            a candidate file name (without a path) like {@code "filename.ext"} or {@code "filename"}
     * @param replacement
     *            Illegal characters in the candidate name are replaced by this character
     * @return a String without illegal characters
     */
    public String toLegalFileName(final String candidate, final char replacement) {try{__CLR4_4_1cfcfkylvdyhn.R.inc(517);
        __CLR4_4_1cfcfkylvdyhn.R.inc(518);if ((((isIllegalFileNameChar(replacement))&&(__CLR4_4_1cfcfkylvdyhn.R.iget(519)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(520)==0&false))) {{
            __CLR4_4_1cfcfkylvdyhn.R.inc(521);throw new IllegalArgumentException(
                    String.format("The replacement character '%s' cannot be one of the %s illegal characters: %s",
                            // %s does not work properly with NUL
                            (((replacement == '\0' )&&(__CLR4_4_1cfcfkylvdyhn.R.iget(522)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(523)==0&false))? "\\0" : replacement, name(), Arrays.toString(illegalFileNameChars)));
        }
        }__CLR4_4_1cfcfkylvdyhn.R.inc(524);final String truncated = (((candidate.length() > maxFileNameLength )&&(__CLR4_4_1cfcfkylvdyhn.R.iget(525)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(526)==0&false))? candidate.substring(0, maxFileNameLength)
                : candidate;
        __CLR4_4_1cfcfkylvdyhn.R.inc(527);boolean changed = false;
        __CLR4_4_1cfcfkylvdyhn.R.inc(528);final char[] charArray = truncated.toCharArray();
        __CLR4_4_1cfcfkylvdyhn.R.inc(529);for (int i = 0; (((i < charArray.length)&&(__CLR4_4_1cfcfkylvdyhn.R.iget(530)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(531)==0&false)); i++) {{
            __CLR4_4_1cfcfkylvdyhn.R.inc(532);if ((((isIllegalFileNameChar(charArray[i]))&&(__CLR4_4_1cfcfkylvdyhn.R.iget(533)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(534)==0&false))) {{
                __CLR4_4_1cfcfkylvdyhn.R.inc(535);charArray[i] = replacement;
                __CLR4_4_1cfcfkylvdyhn.R.inc(536);changed = true;
            }
        }}
        }__CLR4_4_1cfcfkylvdyhn.R.inc(537);return (((changed )&&(__CLR4_4_1cfcfkylvdyhn.R.iget(538)!=0|true))||(__CLR4_4_1cfcfkylvdyhn.R.iget(539)==0&false))? String.valueOf(charArray) : truncated;
    }finally{__CLR4_4_1cfcfkylvdyhn.R.flushNeeded();}}
;public static class __CLR4_4_1cfcfkylvdyhn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,540,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}