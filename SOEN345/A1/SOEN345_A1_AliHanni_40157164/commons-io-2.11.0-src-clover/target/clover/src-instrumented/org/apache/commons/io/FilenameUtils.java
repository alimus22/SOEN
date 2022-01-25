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

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * General file name and file path manipulation utilities.
 * <p>
 * When dealing with file names you can hit problems when moving from a Windows
 * based development machine to a Unix based production machine.
 * This class aims to help avoid those problems.
 * <p>
 * <b>NOTE</b>: You may be able to avoid using this class entirely simply by
 * using JDK {@link java.io.File File} objects and the two argument constructor
 * {@link java.io.File#File(java.io.File, java.lang.String) File(File,String)}.
 * <p>
 * Most methods on this class are designed to work the same on both Unix and Windows.
 * Those that don't include 'System', 'Unix' or 'Windows' in their name.
 * <p>
 * Most methods recognize both separators (forward and back), and both
 * sets of prefixes. See the Javadoc of each method for details.
 * <p>
 * This class defines six components within a file name
 * (example C:\dev\project\file.txt):
 * <ul>
 * <li>the prefix - C:\</li>
 * <li>the path - dev\project\</li>
 * <li>the full path - C:\dev\project\</li>
 * <li>the name - file.txt</li>
 * <li>the base name - file</li>
 * <li>the extension - txt</li>
 * </ul>
 * Note that this class works best if directory file names end with a separator.
 * If you omit the last separator, it is impossible to determine if the file name
 * corresponds to a file or a directory. As a result, we have chosen to say
 * it corresponds to a file.
 * <p>
 * This class only supports Unix and Windows style names.
 * Prefixes are matched as follows:
 * <pre>
 * Windows:
 * a\b\c.txt           --&gt; ""          --&gt; relative
 * \a\b\c.txt          --&gt; "\"         --&gt; current drive absolute
 * C:a\b\c.txt         --&gt; "C:"        --&gt; drive relative
 * C:\a\b\c.txt        --&gt; "C:\"       --&gt; absolute
 * \\server\a\b\c.txt  --&gt; "\\server\" --&gt; UNC
 *
 * Unix:
 * a/b/c.txt           --&gt; ""          --&gt; relative
 * /a/b/c.txt          --&gt; "/"         --&gt; absolute
 * ~/a/b/c.txt         --&gt; "~/"        --&gt; current user
 * ~                   --&gt; "~/"        --&gt; current user (slash added)
 * ~user/a/b/c.txt     --&gt; "~user/"    --&gt; named user
 * ~user               --&gt; "~user/"    --&gt; named user (slash added)
 * </pre>
 * Both prefix styles are matched always, irrespective of the machine that you are
 * currently running on.
 * <p>
 * Origin of code: Excalibur, Alexandria, Tomcat, Commons-Utils.
 *
 * @since 1.1
 */
public class FilenameUtils {public static class __CLR4_4_11a31a3kylvdytv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,2370,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String[] EMPTY_STRING_ARRAY = {};

    private static final String EMPTY_STRING = "";

    private static final int NOT_FOUND = -1;

    /**
     * The extension separator character.
     * @since 1.4
     */
    public static final char EXTENSION_SEPARATOR = '.';

    /**
     * The extension separator String.
     * @since 1.4
     */
    public static final String EXTENSION_SEPARATOR_STR = Character.toString(EXTENSION_SEPARATOR);

    /**
     * The Unix separator character.
     */
    private static final char UNIX_SEPARATOR = '/';

    /**
     * The Windows separator character.
     */
    private static final char WINDOWS_SEPARATOR = '\\';

    /**
     * The system separator character.
     */
    private static final char SYSTEM_SEPARATOR = File.separatorChar;

    /**
     * The separator character that is the opposite of the system separator.
     */
    private static final char OTHER_SEPARATOR;
    static {try{__CLR4_4_11a31a3kylvdytv.R.inc(1659);
        __CLR4_4_11a31a3kylvdytv.R.inc(1660);if ((((isSystemWindows())&&(__CLR4_4_11a31a3kylvdytv.R.iget(1661)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1662)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1663);OTHER_SEPARATOR = UNIX_SEPARATOR;
        } }else {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1664);OTHER_SEPARATOR = WINDOWS_SEPARATOR;
        }
    }}finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Instances should NOT be constructed in standard programming.
     */
    public FilenameUtils() {try{__CLR4_4_11a31a3kylvdytv.R.inc(1665);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Determines if Windows file system is in use.
     *
     * @return true if the system is Windows
     */
    static boolean isSystemWindows() {try{__CLR4_4_11a31a3kylvdytv.R.inc(1666);
        __CLR4_4_11a31a3kylvdytv.R.inc(1667);return SYSTEM_SEPARATOR == WINDOWS_SEPARATOR;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks if the character is a separator.
     *
     * @param ch  the character to check
     * @return true if it is a separator character
     */
    private static boolean isSeparator(final char ch) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1668);
        __CLR4_4_11a31a3kylvdytv.R.inc(1669);return ch == UNIX_SEPARATOR || ch == WINDOWS_SEPARATOR;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Normalizes a path, removing double and single dot path steps.
     * <p>
     * This method normalizes a path to a standard format.
     * The input may contain separators in either Unix or Windows format.
     * The output will contain separators in the format of the system.
     * <p>
     * A trailing slash will be retained.
     * A double slash will be merged to a single slash (but UNC names are handled).
     * A single dot path segment will be removed.
     * A double dot will cause that path segment and the one before to be removed.
     * If the double dot has no parent path segment to work with, {@code null}
     * is returned.
     * <p>
     * The output will be the same on both Unix and Windows except
     * for the separator character.
     * <pre>
     * /foo//               --&gt;   /foo/
     * /foo/./              --&gt;   /foo/
     * /foo/../bar          --&gt;   /bar
     * /foo/../bar/         --&gt;   /bar/
     * /foo/../bar/../baz   --&gt;   /baz
     * //foo//./bar         --&gt;   /foo/bar
     * /../                 --&gt;   null
     * ../foo               --&gt;   null
     * foo/bar/..           --&gt;   foo/
     * foo/../../bar        --&gt;   null
     * foo/../bar           --&gt;   bar
     * //server/foo/../bar  --&gt;   //server/bar
     * //server/../bar      --&gt;   null
     * C:\foo\..\bar        --&gt;   C:\bar
     * C:\..\bar            --&gt;   null
     * ~/foo/../bar/        --&gt;   ~/bar/
     * ~/../bar             --&gt;   null
     * </pre>
     * (Note the file separator returned will be correct for Windows/Unix)
     *
     * @param fileName  the fileName to normalize, null returns null
     * @return the normalized fileName, or null if invalid. Null bytes inside string will be removed
     */
    public static String normalize(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1670);
        __CLR4_4_11a31a3kylvdytv.R.inc(1671);return doNormalize(fileName, SYSTEM_SEPARATOR, true);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}
    /**
     * Normalizes a path, removing double and single dot path steps.
     * <p>
     * This method normalizes a path to a standard format.
     * The input may contain separators in either Unix or Windows format.
     * The output will contain separators in the format specified.
     * <p>
     * A trailing slash will be retained.
     * A double slash will be merged to a single slash (but UNC names are handled).
     * A single dot path segment will be removed.
     * A double dot will cause that path segment and the one before to be removed.
     * If the double dot has no parent path segment to work with, {@code null}
     * is returned.
     * <p>
     * The output will be the same on both Unix and Windows except
     * for the separator character.
     * <pre>
     * /foo//               --&gt;   /foo/
     * /foo/./              --&gt;   /foo/
     * /foo/../bar          --&gt;   /bar
     * /foo/../bar/         --&gt;   /bar/
     * /foo/../bar/../baz   --&gt;   /baz
     * //foo//./bar         --&gt;   /foo/bar
     * /../                 --&gt;   null
     * ../foo               --&gt;   null
     * foo/bar/..           --&gt;   foo/
     * foo/../../bar        --&gt;   null
     * foo/../bar           --&gt;   bar
     * //server/foo/../bar  --&gt;   //server/bar
     * //server/../bar      --&gt;   null
     * C:\foo\..\bar        --&gt;   C:\bar
     * C:\..\bar            --&gt;   null
     * ~/foo/../bar/        --&gt;   ~/bar/
     * ~/../bar             --&gt;   null
     * </pre>
     * The output will be the same on both Unix and Windows including
     * the separator character.
     *
     * @param fileName  the fileName to normalize, null returns null
     * @param unixSeparator {@code true} if a unix separator should
     * be used or {@code false} if a windows separator should be used.
     * @return the normalized fileName, or null if invalid. Null bytes inside string will be removed
     * @since 2.0
     */
    public static String normalize(final String fileName, final boolean unixSeparator) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1672);
        __CLR4_4_11a31a3kylvdytv.R.inc(1673);final char separator = (((unixSeparator )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1674)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1675)==0&false))? UNIX_SEPARATOR : WINDOWS_SEPARATOR;
        __CLR4_4_11a31a3kylvdytv.R.inc(1676);return doNormalize(fileName, separator, true);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Normalizes a path, removing double and single dot path steps,
     * and removing any final directory separator.
     * <p>
     * This method normalizes a path to a standard format.
     * The input may contain separators in either Unix or Windows format.
     * The output will contain separators in the format of the system.
     * <p>
     * A trailing slash will be removed.
     * A double slash will be merged to a single slash (but UNC names are handled).
     * A single dot path segment will be removed.
     * A double dot will cause that path segment and the one before to be removed.
     * If the double dot has no parent path segment to work with, {@code null}
     * is returned.
     * <p>
     * The output will be the same on both Unix and Windows except
     * for the separator character.
     * <pre>
     * /foo//               --&gt;   /foo
     * /foo/./              --&gt;   /foo
     * /foo/../bar          --&gt;   /bar
     * /foo/../bar/         --&gt;   /bar
     * /foo/../bar/../baz   --&gt;   /baz
     * //foo//./bar         --&gt;   /foo/bar
     * /../                 --&gt;   null
     * ../foo               --&gt;   null
     * foo/bar/..           --&gt;   foo
     * foo/../../bar        --&gt;   null
     * foo/../bar           --&gt;   bar
     * //server/foo/../bar  --&gt;   //server/bar
     * //server/../bar      --&gt;   null
     * C:\foo\..\bar        --&gt;   C:\bar
     * C:\..\bar            --&gt;   null
     * ~/foo/../bar/        --&gt;   ~/bar
     * ~/../bar             --&gt;   null
     * </pre>
     * (Note the file separator returned will be correct for Windows/Unix)
     *
     * @param fileName  the fileName to normalize, null returns null
     * @return the normalized fileName, or null if invalid. Null bytes inside string will be removed
     */
    public static String normalizeNoEndSeparator(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1677);
        __CLR4_4_11a31a3kylvdytv.R.inc(1678);return doNormalize(fileName, SYSTEM_SEPARATOR, false);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Normalizes a path, removing double and single dot path steps,
     * and removing any final directory separator.
     * <p>
     * This method normalizes a path to a standard format.
     * The input may contain separators in either Unix or Windows format.
     * The output will contain separators in the format specified.
     * <p>
     * A trailing slash will be removed.
     * A double slash will be merged to a single slash (but UNC names are handled).
     * A single dot path segment will be removed.
     * A double dot will cause that path segment and the one before to be removed.
     * If the double dot has no parent path segment to work with, {@code null}
     * is returned.
     * <p>
     * The output will be the same on both Unix and Windows including
     * the separator character.
     * <pre>
     * /foo//               --&gt;   /foo
     * /foo/./              --&gt;   /foo
     * /foo/../bar          --&gt;   /bar
     * /foo/../bar/         --&gt;   /bar
     * /foo/../bar/../baz   --&gt;   /baz
     * //foo//./bar         --&gt;   /foo/bar
     * /../                 --&gt;   null
     * ../foo               --&gt;   null
     * foo/bar/..           --&gt;   foo
     * foo/../../bar        --&gt;   null
     * foo/../bar           --&gt;   bar
     * //server/foo/../bar  --&gt;   //server/bar
     * //server/../bar      --&gt;   null
     * C:\foo\..\bar        --&gt;   C:\bar
     * C:\..\bar            --&gt;   null
     * ~/foo/../bar/        --&gt;   ~/bar
     * ~/../bar             --&gt;   null
     * </pre>
     *
     * @param fileName  the fileName to normalize, null returns null
     * @param unixSeparator {@code true} if a unix separator should
     * be used or {@code false} if a windows separator should be used.
     * @return the normalized fileName, or null if invalid. Null bytes inside string will be removed
     * @since 2.0
     */
    public static String normalizeNoEndSeparator(final String fileName, final boolean unixSeparator) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1679);
         __CLR4_4_11a31a3kylvdytv.R.inc(1680);final char separator = (((unixSeparator )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1681)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1682)==0&false))? UNIX_SEPARATOR : WINDOWS_SEPARATOR;
        __CLR4_4_11a31a3kylvdytv.R.inc(1683);return doNormalize(fileName, separator, false);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Internal method to perform the normalization.
     *
     * @param fileName  the fileName
     * @param separator The separator character to use
     * @param keepSeparator  true to keep the final separator
     * @return the normalized fileName. Null bytes inside string will be removed.
     */
    private static String doNormalize(final String fileName, final char separator, final boolean keepSeparator) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1684);
        __CLR4_4_11a31a3kylvdytv.R.inc(1685);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1686)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1687)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1688);return null;
        }

        }__CLR4_4_11a31a3kylvdytv.R.inc(1689);requireNonNullChars(fileName);

        __CLR4_4_11a31a3kylvdytv.R.inc(1690);int size = fileName.length();
        __CLR4_4_11a31a3kylvdytv.R.inc(1691);if ((((size == 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1692)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1693)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1694);return fileName;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1695);final int prefix = getPrefixLength(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(1696);if ((((prefix < 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1697)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1698)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1699);return null;
        }

        }__CLR4_4_11a31a3kylvdytv.R.inc(1700);final char[] array = new char[size + 2];  // +1 for possible extra slash, +2 for arraycopy
        __CLR4_4_11a31a3kylvdytv.R.inc(1701);fileName.getChars(0, fileName.length(), array, 0);

        // fix separators throughout
        __CLR4_4_11a31a3kylvdytv.R.inc(1702);final char otherSeparator = (((separator == SYSTEM_SEPARATOR )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1703)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1704)==0&false))? OTHER_SEPARATOR : SYSTEM_SEPARATOR;
        __CLR4_4_11a31a3kylvdytv.R.inc(1705);for (int i = 0; (((i < array.length)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1706)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1707)==0&false)); i++) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1708);if ((((array[i] == otherSeparator)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1709)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1710)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(1711);array[i] = separator;
            }
        }}

        // add extra separator on the end to simplify code below
        }__CLR4_4_11a31a3kylvdytv.R.inc(1712);boolean lastIsDirectory = true;
        __CLR4_4_11a31a3kylvdytv.R.inc(1713);if ((((array[size - 1] != separator)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1714)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1715)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1716);array[size++] = separator;
            __CLR4_4_11a31a3kylvdytv.R.inc(1717);lastIsDirectory = false;
        }

        // adjoining slashes
        // If we get here, prefix can only be 0 or greater, size 1 or greater
        // If prefix is 0, set loop start to 1 to prevent index errors
        }__CLR4_4_11a31a3kylvdytv.R.inc(1718);for (int i = ((((prefix != 0) )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1719)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1720)==0&false))? prefix : 1; (((i < size)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1721)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1722)==0&false)); i++) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1723);if ((((array[i] == separator && array[i - 1] == separator)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1724)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1725)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(1726);System.arraycopy(array, i, array, i - 1, size - i);
                __CLR4_4_11a31a3kylvdytv.R.inc(1727);size--;
                __CLR4_4_11a31a3kylvdytv.R.inc(1728);i--;
            }
        }}

        // dot slash
        }__CLR4_4_11a31a3kylvdytv.R.inc(1729);for (int i = prefix + 1; (((i < size)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1730)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1731)==0&false)); i++) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1732);if ((((array[i] == separator && array[i - 1] == '.' &&
                    (i == prefix + 1 || array[i - 2] == separator))&&(__CLR4_4_11a31a3kylvdytv.R.iget(1733)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1734)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(1735);if ((((i == size - 1)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1736)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1737)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(1738);lastIsDirectory = true;
                }
                }__CLR4_4_11a31a3kylvdytv.R.inc(1739);System.arraycopy(array, i + 1, array, i - 1, size - i);
                __CLR4_4_11a31a3kylvdytv.R.inc(1740);size -=2;
                __CLR4_4_11a31a3kylvdytv.R.inc(1741);i--;
            }
        }}

        // double dot slash
        }__CLR4_4_11a31a3kylvdytv.R.inc(1742);outer:
        for (int i = prefix + 2; (((i < size)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1743)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1744)==0&false)); i++) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1745);if ((((array[i] == separator && array[i - 1] == '.' && array[i - 2] == '.' &&
                    (i == prefix + 2 || array[i - 3] == separator))&&(__CLR4_4_11a31a3kylvdytv.R.iget(1746)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1747)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(1748);if ((((i == prefix + 2)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1749)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1750)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(1751);return null;
                }
                }__CLR4_4_11a31a3kylvdytv.R.inc(1752);if ((((i == size - 1)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1753)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1754)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(1755);lastIsDirectory = true;
                }
                }__CLR4_4_11a31a3kylvdytv.R.inc(1756);int j;
                __CLR4_4_11a31a3kylvdytv.R.inc(1757);for (j = i - 4 ; (((j >= prefix)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1758)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1759)==0&false)); j--) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(1760);if ((((array[j] == separator)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1761)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1762)==0&false))) {{
                        // remove b/../ from a/b/../c
                        __CLR4_4_11a31a3kylvdytv.R.inc(1763);System.arraycopy(array, i + 1, array, j + 1, size - i);
                        __CLR4_4_11a31a3kylvdytv.R.inc(1764);size -= i - j;
                        __CLR4_4_11a31a3kylvdytv.R.inc(1765);i = j + 1;
                        __CLR4_4_11a31a3kylvdytv.R.inc(1766);continue outer;
                    }
                }}
                // remove a/../ from a/../c
                }__CLR4_4_11a31a3kylvdytv.R.inc(1767);System.arraycopy(array, i + 1, array, prefix, size - i);
                __CLR4_4_11a31a3kylvdytv.R.inc(1768);size -= i + 1 - prefix;
                __CLR4_4_11a31a3kylvdytv.R.inc(1769);i = prefix + 1;
            }
        }}

        }__CLR4_4_11a31a3kylvdytv.R.inc(1770);if ((((size <= 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1771)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1772)==0&false))) {{  // should never be less than 0
            __CLR4_4_11a31a3kylvdytv.R.inc(1773);return EMPTY_STRING;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1774);if ((((size <= prefix)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1775)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1776)==0&false))) {{  // should never be less than prefix
            __CLR4_4_11a31a3kylvdytv.R.inc(1777);return new String(array, 0, size);
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1778);if ((((lastIsDirectory && keepSeparator)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1779)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1780)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1781);return new String(array, 0, size);  // keep trailing separator
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1782);return new String(array, 0, size - 1);  // lose trailing separator
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Concatenates a fileName to a base path using normal command line style rules.
     * <p>
     * The effect is equivalent to resultant directory after changing
     * directory to the first argument, followed by changing directory to
     * the second argument.
     * <p>
     * The first argument is the base path, the second is the path to concatenate.
     * The returned path is always normalized via {@link #normalize(String)},
     * thus {@code ..} is handled.
     * <p>
     * If {@code pathToAdd} is absolute (has an absolute prefix), then
     * it will be normalized and returned.
     * Otherwise, the paths will be joined, normalized and returned.
     * <p>
     * The output will be the same on both Unix and Windows except
     * for the separator character.
     * <pre>
     * /foo/      + bar        --&gt;  /foo/bar
     * /foo       + bar        --&gt;  /foo/bar
     * /foo       + /bar       --&gt;  /bar
     * /foo       + C:/bar     --&gt;  C:/bar
     * /foo       + C:bar      --&gt;  C:bar (*)
     * /foo/a/    + ../bar     --&gt;  /foo/bar
     * /foo/      + ../../bar  --&gt;  null
     * /foo/      + /bar       --&gt;  /bar
     * /foo/..    + /bar       --&gt;  /bar
     * /foo       + bar/c.txt  --&gt;  /foo/bar/c.txt
     * /foo/c.txt + bar        --&gt;  /foo/c.txt/bar (!)
     * </pre>
     * (*) Note that the Windows relative drive prefix is unreliable when
     * used with this method.
     * (!) Note that the first parameter must be a path. If it ends with a name, then
     * the name will be built into the concatenated path. If this might be a problem,
     * use {@link #getFullPath(String)} on the base path argument.
     *
     * @param basePath  the base path to attach to, always treated as a path
     * @param fullFileNameToAdd  the fileName (or path) to attach to the base
     * @return the concatenated path, or null if invalid.  Null bytes inside string will be removed
     */
    public static String concat(final String basePath, final String fullFileNameToAdd) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1783);
        __CLR4_4_11a31a3kylvdytv.R.inc(1784);final int prefix = getPrefixLength(fullFileNameToAdd);
        __CLR4_4_11a31a3kylvdytv.R.inc(1785);if ((((prefix < 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1786)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1787)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1788);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1789);if ((((prefix > 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1790)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1791)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1792);return normalize(fullFileNameToAdd);
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1793);if ((((basePath == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1794)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1795)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1796);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1797);final int len = basePath.length();
        __CLR4_4_11a31a3kylvdytv.R.inc(1798);if ((((len == 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1799)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1800)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1801);return normalize(fullFileNameToAdd);
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1802);final char ch = basePath.charAt(len - 1);
        __CLR4_4_11a31a3kylvdytv.R.inc(1803);if ((((isSeparator(ch))&&(__CLR4_4_11a31a3kylvdytv.R.iget(1804)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1805)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1806);return normalize(basePath + fullFileNameToAdd);
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1807);return normalize(basePath + '/' + fullFileNameToAdd);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Determines whether the {@code parent} directory contains the {@code child} element (a file or directory).
     * <p>
     * The files names are expected to be normalized.
     * </p>
     *
     * Edge cases:
     * <ul>
     * <li>A {@code directory} must not be null: if null, throw IllegalArgumentException</li>
     * <li>A directory does not contain itself: return false</li>
     * <li>A null child file is not contained in any parent: return false</li>
     * </ul>
     *
     * @param canonicalParent
     *            the file to consider as the parent.
     * @param canonicalChild
     *            the file to consider as the child.
     * @return true is the candidate leaf is under by the specified composite. False otherwise.
     * @since 2.2
     * @see FileUtils#directoryContains(File, File)
     */
    public static boolean directoryContains(final String canonicalParent, final String canonicalChild) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1808);
        __CLR4_4_11a31a3kylvdytv.R.inc(1809);Objects.requireNonNull(canonicalParent, "canonicalParent");

        __CLR4_4_11a31a3kylvdytv.R.inc(1810);if ((((canonicalChild == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1811)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1812)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1813);return false;
        }

        }__CLR4_4_11a31a3kylvdytv.R.inc(1814);if ((((IOCase.SYSTEM.checkEquals(canonicalParent, canonicalChild))&&(__CLR4_4_11a31a3kylvdytv.R.iget(1815)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1816)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1817);return false;
        }

        }__CLR4_4_11a31a3kylvdytv.R.inc(1818);return IOCase.SYSTEM.checkStartsWith(canonicalChild, canonicalParent);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Converts all separators to the Unix separator of forward slash.
     *
     * @param path  the path to be changed, null ignored
     * @return the updated path
     */
    public static String separatorsToUnix(final String path) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1819);
        __CLR4_4_11a31a3kylvdytv.R.inc(1820);if ((((path == null || path.indexOf(WINDOWS_SEPARATOR) == NOT_FOUND)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1821)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1822)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1823);return path;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1824);return path.replace(WINDOWS_SEPARATOR, UNIX_SEPARATOR);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Converts all separators to the Windows separator of backslash.
     *
     * @param path  the path to be changed, null ignored
     * @return the updated path
     */
    public static String separatorsToWindows(final String path) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1825);
        __CLR4_4_11a31a3kylvdytv.R.inc(1826);if ((((path == null || path.indexOf(UNIX_SEPARATOR) == NOT_FOUND)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1827)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1828)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1829);return path;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1830);return path.replace(UNIX_SEPARATOR, WINDOWS_SEPARATOR);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Converts all separators to the system separator.
     *
     * @param path  the path to be changed, null ignored
     * @return the updated path
     */
    public static String separatorsToSystem(final String path) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1831);
        __CLR4_4_11a31a3kylvdytv.R.inc(1832);if ((((path == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1833)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1834)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1835);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1836);return (((isSystemWindows() )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1837)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1838)==0&false))? separatorsToWindows(path) : separatorsToUnix(path);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Returns the length of the fileName prefix, such as {@code C:/} or {@code ~/}.
     * <p>
     * This method will handle a file in either Unix or Windows format.
     * <p>
     * The prefix length includes the first slash in the full fileName
     * if applicable. Thus, it is possible that the length returned is greater
     * than the length of the input string.
     * <pre>
     * Windows:
     * a\b\c.txt           --&gt; 0           --&gt; relative
     * \a\b\c.txt          --&gt; 1           --&gt; current drive absolute
     * C:a\b\c.txt         --&gt; 2           --&gt; drive relative
     * C:\a\b\c.txt        --&gt; 3           --&gt; absolute
     * \\server\a\b\c.txt  --&gt; 9           --&gt; UNC
     * \\\a\b\c.txt        --&gt; -1          --&gt; error
     *
     * Unix:
     * a/b/c.txt           --&gt; 0           --&gt; relative
     * /a/b/c.txt          --&gt; 1           --&gt; absolute
     * ~/a/b/c.txt         --&gt; 2           --&gt; current user
     * ~                   --&gt; 2           --&gt; current user (slash added)
     * ~user/a/b/c.txt     --&gt; 6           --&gt; named user
     * ~user               --&gt; 6           --&gt; named user (slash added)
     * //server/a/b/c.txt  --&gt; 9
     * ///a/b/c.txt        --&gt; -1          --&gt; error
     * C:                  --&gt; 0           --&gt; valid filename as only null byte and / are reserved characters
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     * ie. both Unix and Windows prefixes are matched regardless.
     *
     * Note that a leading // (or \\) is used to indicate a UNC name on Windows.
     * These must be followed by a server name, so double-slashes are not collapsed
     * to a single slash at the start of the fileName.
     *
     * @param fileName  the fileName to find the prefix in, null returns -1
     * @return the length of the prefix, -1 if invalid or null
     */
    public static int getPrefixLength(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1839);
        __CLR4_4_11a31a3kylvdytv.R.inc(1840);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1841)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1842)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1843);return NOT_FOUND;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1844);final int len = fileName.length();
        __CLR4_4_11a31a3kylvdytv.R.inc(1845);if ((((len == 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1846)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1847)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1848);return 0;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1849);char ch0 = fileName.charAt(0);
        __CLR4_4_11a31a3kylvdytv.R.inc(1850);if ((((ch0 == ':')&&(__CLR4_4_11a31a3kylvdytv.R.iget(1851)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1852)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1853);return NOT_FOUND;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1854);if ((((len == 1)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1855)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1856)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1857);if ((((ch0 == '~')&&(__CLR4_4_11a31a3kylvdytv.R.iget(1858)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1859)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(1860);return 2;  // return a length greater than the input
            }
            }__CLR4_4_11a31a3kylvdytv.R.inc(1861);return (((isSeparator(ch0) )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1862)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1863)==0&false))? 1 : 0;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1864);if ((((ch0 == '~')&&(__CLR4_4_11a31a3kylvdytv.R.iget(1865)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1866)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1867);int posUnix = fileName.indexOf(UNIX_SEPARATOR, 1);
            __CLR4_4_11a31a3kylvdytv.R.inc(1868);int posWin = fileName.indexOf(WINDOWS_SEPARATOR, 1);
            __CLR4_4_11a31a3kylvdytv.R.inc(1869);if ((((posUnix == NOT_FOUND && posWin == NOT_FOUND)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1870)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1871)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(1872);return len + 1;  // return a length greater than the input
            }
            }__CLR4_4_11a31a3kylvdytv.R.inc(1873);posUnix = (((posUnix == NOT_FOUND )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1874)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1875)==0&false))? posWin : posUnix;
            __CLR4_4_11a31a3kylvdytv.R.inc(1876);posWin = (((posWin == NOT_FOUND )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1877)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1878)==0&false))? posUnix : posWin;
            __CLR4_4_11a31a3kylvdytv.R.inc(1879);return Math.min(posUnix, posWin) + 1;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1880);final char ch1 = fileName.charAt(1);
        __CLR4_4_11a31a3kylvdytv.R.inc(1881);if ((((ch1 == ':')&&(__CLR4_4_11a31a3kylvdytv.R.iget(1882)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1883)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1884);ch0 = Character.toUpperCase(ch0);
            __CLR4_4_11a31a3kylvdytv.R.inc(1885);if ((((ch0 >= 'A' && ch0 <= 'Z')&&(__CLR4_4_11a31a3kylvdytv.R.iget(1886)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1887)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(1888);if ((((len == 2 && !FileSystem.getCurrent().supportsDriveLetter())&&(__CLR4_4_11a31a3kylvdytv.R.iget(1889)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1890)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(1891);return 0;
                }
                }__CLR4_4_11a31a3kylvdytv.R.inc(1892);if ((((len == 2 || !isSeparator(fileName.charAt(2)))&&(__CLR4_4_11a31a3kylvdytv.R.iget(1893)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1894)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(1895);return 2;
                }
                }__CLR4_4_11a31a3kylvdytv.R.inc(1896);return 3;
            }
            }__CLR4_4_11a31a3kylvdytv.R.inc(1897);if ((((ch0 == UNIX_SEPARATOR)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1898)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1899)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(1900);return 1;
            }
            }__CLR4_4_11a31a3kylvdytv.R.inc(1901);return NOT_FOUND;

        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1902);if ((((!isSeparator(ch0) || !isSeparator(ch1))&&(__CLR4_4_11a31a3kylvdytv.R.iget(1903)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1904)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1905);return (((isSeparator(ch0) )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1906)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1907)==0&false))? 1 : 0;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1908);int posUnix = fileName.indexOf(UNIX_SEPARATOR, 2);
        __CLR4_4_11a31a3kylvdytv.R.inc(1909);int posWin = fileName.indexOf(WINDOWS_SEPARATOR, 2);
        __CLR4_4_11a31a3kylvdytv.R.inc(1910);if ((((posUnix == NOT_FOUND && posWin == NOT_FOUND || posUnix == 2 || posWin == 2)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1911)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1912)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1913);return NOT_FOUND;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1914);posUnix = (((posUnix == NOT_FOUND )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1915)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1916)==0&false))? posWin : posUnix;
        __CLR4_4_11a31a3kylvdytv.R.inc(1917);posWin = (((posWin == NOT_FOUND )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1918)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1919)==0&false))? posUnix : posWin;
        __CLR4_4_11a31a3kylvdytv.R.inc(1920);final int pos = Math.min(posUnix, posWin) + 1;
        __CLR4_4_11a31a3kylvdytv.R.inc(1921);final String hostnamePart = fileName.substring(2, pos - 1);
        __CLR4_4_11a31a3kylvdytv.R.inc(1922);return (((isValidHostName(hostnamePart) )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1923)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1924)==0&false))? pos : NOT_FOUND;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Returns the index of the last directory separator character.
     * <p>
     * This method will handle a file in either Unix or Windows format.
     * The position of the last forward or backslash is returned.
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     *
     * @param fileName  the fileName to find the last path separator in, null returns -1
     * @return the index of the last separator character, or -1 if there
     * is no such character
     */
    public static int indexOfLastSeparator(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1925);
        __CLR4_4_11a31a3kylvdytv.R.inc(1926);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1927)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1928)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1929);return NOT_FOUND;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1930);final int lastUnixPos = fileName.lastIndexOf(UNIX_SEPARATOR);
        __CLR4_4_11a31a3kylvdytv.R.inc(1931);final int lastWindowsPos = fileName.lastIndexOf(WINDOWS_SEPARATOR);
        __CLR4_4_11a31a3kylvdytv.R.inc(1932);return Math.max(lastUnixPos, lastWindowsPos);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Returns the index of the last extension separator character, which is a dot.
     * <p>
     * This method also checks that there is no directory separator after the last dot. To do this it uses
     * {@link #indexOfLastSeparator(String)} which will handle a file in either Unix or Windows format.
     * </p>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on, with the
     * exception of a possible {@link IllegalArgumentException} on Windows (see below).
     * </p>
     * <b>Note:</b> This method used to have a hidden problem for names like "foo.exe:bar.txt".
     * In this case, the name wouldn't be the name of a file, but the identifier of an
     * alternate data stream (bar.txt) on the file foo.exe. The method used to return
     * ".txt" here, which would be misleading. Commons IO 2.7, and later versions, are throwing
     * an {@link IllegalArgumentException} for names like this.
     *
     * @param fileName
     *            the fileName to find the last extension separator in, null returns -1
     * @return the index of the last extension separator character, or -1 if there is no such character
     * @throws IllegalArgumentException <b>Windows only:</b> The fileName parameter is, in fact,
     * the identifier of an Alternate Data Stream, for example "foo.exe:bar.txt".
     */
    public static int indexOfExtension(final String fileName) throws IllegalArgumentException {try{__CLR4_4_11a31a3kylvdytv.R.inc(1933);
        __CLR4_4_11a31a3kylvdytv.R.inc(1934);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1935)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1936)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1937);return NOT_FOUND;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1938);if ((((isSystemWindows())&&(__CLR4_4_11a31a3kylvdytv.R.iget(1939)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1940)==0&false))) {{
            // Special handling for NTFS ADS: Don't accept colon in the fileName.
            __CLR4_4_11a31a3kylvdytv.R.inc(1941);final int offset = fileName.indexOf(':', getAdsCriticalOffset(fileName));
            __CLR4_4_11a31a3kylvdytv.R.inc(1942);if ((((offset != -1)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1943)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1944)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(1945);throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
            }
        }}
        }__CLR4_4_11a31a3kylvdytv.R.inc(1946);final int extensionPos = fileName.lastIndexOf(EXTENSION_SEPARATOR);
        __CLR4_4_11a31a3kylvdytv.R.inc(1947);final int lastSeparator = indexOfLastSeparator(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(1948);return (((lastSeparator > extensionPos )&&(__CLR4_4_11a31a3kylvdytv.R.iget(1949)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1950)==0&false))? NOT_FOUND : extensionPos;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Gets the prefix from a full fileName, such as {@code C:/}
     * or {@code ~/}.
     * <p>
     * This method will handle a file in either Unix or Windows format.
     * The prefix includes the first slash in the full fileName where applicable.
     * <pre>
     * Windows:
     * a\b\c.txt           --&gt; ""          --&gt; relative
     * \a\b\c.txt          --&gt; "\"         --&gt; current drive absolute
     * C:a\b\c.txt         --&gt; "C:"        --&gt; drive relative
     * C:\a\b\c.txt        --&gt; "C:\"       --&gt; absolute
     * \\server\a\b\c.txt  --&gt; "\\server\" --&gt; UNC
     *
     * Unix:
     * a/b/c.txt           --&gt; ""          --&gt; relative
     * /a/b/c.txt          --&gt; "/"         --&gt; absolute
     * ~/a/b/c.txt         --&gt; "~/"        --&gt; current user
     * ~                   --&gt; "~/"        --&gt; current user (slash added)
     * ~user/a/b/c.txt     --&gt; "~user/"    --&gt; named user
     * ~user               --&gt; "~user/"    --&gt; named user (slash added)
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     * ie. both Unix and Windows prefixes are matched regardless.
     *
     * @param fileName  the fileName to query, null returns null
     * @return the prefix of the file, null if invalid. Null bytes inside string will be removed
     */
    public static String getPrefix(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1951);
        __CLR4_4_11a31a3kylvdytv.R.inc(1952);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1953)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1954)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1955);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1956);final int len = getPrefixLength(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(1957);if ((((len < 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1958)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1959)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1960);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1961);if ((((len > fileName.length())&&(__CLR4_4_11a31a3kylvdytv.R.iget(1962)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1963)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1964);requireNonNullChars(fileName + UNIX_SEPARATOR);
            __CLR4_4_11a31a3kylvdytv.R.inc(1965);return fileName + UNIX_SEPARATOR;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1966);final String path = fileName.substring(0, len);
        __CLR4_4_11a31a3kylvdytv.R.inc(1967);requireNonNullChars(path);
        __CLR4_4_11a31a3kylvdytv.R.inc(1968);return path;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Gets the path from a full fileName, which excludes the prefix.
     * <p>
     * This method will handle a file in either Unix or Windows format.
     * The method is entirely text based, and returns the text before and
     * including the last forward or backslash.
     * <pre>
     * C:\a\b\c.txt --&gt; a\b\
     * ~/a/b/c.txt  --&gt; a/b/
     * a.txt        --&gt; ""
     * a/b/c        --&gt; a/b/
     * a/b/c/       --&gt; a/b/c/
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     * <p>
     * This method drops the prefix from the result.
     * See {@link #getFullPath(String)} for the method that retains the prefix.
     *
     * @param fileName  the fileName to query, null returns null
     * @return the path of the file, an empty string if none exists, null if invalid.
     * Null bytes inside string will be removed
     */
    public static String getPath(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1969);
        __CLR4_4_11a31a3kylvdytv.R.inc(1970);return doGetPath(fileName, 1);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Gets the path from a full fileName, which excludes the prefix, and
     * also excluding the final directory separator.
     * <p>
     * This method will handle a file in either Unix or Windows format.
     * The method is entirely text based, and returns the text before the
     * last forward or backslash.
     * <pre>
     * C:\a\b\c.txt --&gt; a\b
     * ~/a/b/c.txt  --&gt; a/b
     * a.txt        --&gt; ""
     * a/b/c        --&gt; a/b
     * a/b/c/       --&gt; a/b/c
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     * <p>
     * This method drops the prefix from the result.
     * See {@link #getFullPathNoEndSeparator(String)} for the method that retains the prefix.
     *
     * @param fileName  the fileName to query, null returns null
     * @return the path of the file, an empty string if none exists, null if invalid.
     * Null bytes inside string will be removed
     */
    public static String getPathNoEndSeparator(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1971);
        __CLR4_4_11a31a3kylvdytv.R.inc(1972);return doGetPath(fileName, 0);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Does the work of getting the path.
     *
     * @param fileName  the fileName
     * @param separatorAdd  0 to omit the end separator, 1 to return it
     * @return the path. Null bytes inside string will be removed
     */
    private static String doGetPath(final String fileName, final int separatorAdd) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1973);
        __CLR4_4_11a31a3kylvdytv.R.inc(1974);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1975)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1976)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1977);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1978);final int prefix = getPrefixLength(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(1979);if ((((prefix < 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1980)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1981)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1982);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1983);final int index = indexOfLastSeparator(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(1984);final int endIndex = index+separatorAdd;
        __CLR4_4_11a31a3kylvdytv.R.inc(1985);if ((((prefix >= fileName.length() || index < 0 || prefix >= endIndex)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1986)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1987)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(1988);return EMPTY_STRING;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(1989);final String path = fileName.substring(prefix, endIndex);
        __CLR4_4_11a31a3kylvdytv.R.inc(1990);requireNonNullChars(path);
        __CLR4_4_11a31a3kylvdytv.R.inc(1991);return path;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Gets the full path from a full fileName, which is the prefix + path.
     * <p>
     * This method will handle a file in either Unix or Windows format.
     * The method is entirely text based, and returns the text before and
     * including the last forward or backslash.
     * <pre>
     * C:\a\b\c.txt --&gt; C:\a\b\
     * ~/a/b/c.txt  --&gt; ~/a/b/
     * a.txt        --&gt; ""
     * a/b/c        --&gt; a/b/
     * a/b/c/       --&gt; a/b/c/
     * C:           --&gt; C:
     * C:\          --&gt; C:\
     * ~            --&gt; ~/
     * ~/           --&gt; ~/
     * ~user        --&gt; ~user/
     * ~user/       --&gt; ~user/
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     *
     * @param fileName  the fileName to query, null returns null
     * @return the path of the file, an empty string if none exists, null if invalid
     */
    public static String getFullPath(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1992);
        __CLR4_4_11a31a3kylvdytv.R.inc(1993);return doGetFullPath(fileName, true);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Gets the full path from a full fileName, which is the prefix + path,
     * and also excluding the final directory separator.
     * <p>
     * This method will handle a file in either Unix or Windows format.
     * The method is entirely text based, and returns the text before the
     * last forward or backslash.
     * <pre>
     * C:\a\b\c.txt --&gt; C:\a\b
     * ~/a/b/c.txt  --&gt; ~/a/b
     * a.txt        --&gt; ""
     * a/b/c        --&gt; a/b
     * a/b/c/       --&gt; a/b/c
     * C:           --&gt; C:
     * C:\          --&gt; C:\
     * ~            --&gt; ~
     * ~/           --&gt; ~
     * ~user        --&gt; ~user
     * ~user/       --&gt; ~user
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     *
     * @param fileName  the fileName to query, null returns null
     * @return the path of the file, an empty string if none exists, null if invalid
     */
    public static String getFullPathNoEndSeparator(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1994);
        __CLR4_4_11a31a3kylvdytv.R.inc(1995);return doGetFullPath(fileName, false);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Does the work of getting the path.
     *
     * @param fileName  the fileName
     * @param includeSeparator  true to include the end separator
     * @return the path
     */
    private static String doGetFullPath(final String fileName, final boolean includeSeparator) {try{__CLR4_4_11a31a3kylvdytv.R.inc(1996);
        __CLR4_4_11a31a3kylvdytv.R.inc(1997);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(1998)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(1999)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2000);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2001);final int prefix = getPrefixLength(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(2002);if ((((prefix < 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2003)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2004)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2005);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2006);if ((((prefix >= fileName.length())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2007)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2008)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2009);if ((((includeSeparator)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2010)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2011)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2012);return getPrefix(fileName);  // add end slash if necessary
            }
            }__CLR4_4_11a31a3kylvdytv.R.inc(2013);return fileName;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2014);final int index = indexOfLastSeparator(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(2015);if ((((index < 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2016)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2017)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2018);return fileName.substring(0, prefix);
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2019);int end = index + ((((includeSeparator )&&(__CLR4_4_11a31a3kylvdytv.R.iget(2020)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2021)==0&false))?  1 : 0);
        __CLR4_4_11a31a3kylvdytv.R.inc(2022);if ((((end == 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2023)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2024)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2025);end++;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2026);return fileName.substring(0, end);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Gets the name minus the path from a full fileName.
     * <p>
     * This method will handle a file in either Unix or Windows format.
     * The text after the last forward or backslash is returned.
     * <pre>
     * a/b/c.txt --&gt; c.txt
     * a.txt     --&gt; a.txt
     * a/b/c     --&gt; c
     * a/b/c/    --&gt; ""
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     *
     * @param fileName  the fileName to query, null returns null
     * @return the name of the file without the path, or an empty string if none exists.
     * Null bytes inside string will be removed
     */
    public static String getName(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2027);
        __CLR4_4_11a31a3kylvdytv.R.inc(2028);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2029)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2030)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2031);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2032);requireNonNullChars(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(2033);final int index = indexOfLastSeparator(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(2034);return fileName.substring(index + 1);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks the input for null bytes, a sign of unsanitized data being passed to to file level functions.
     *
     * This may be used for poison byte attacks.
     *
     * @param path the path to check
     */
    private static void requireNonNullChars(final String path) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2035);
        __CLR4_4_11a31a3kylvdytv.R.inc(2036);if ((((path.indexOf(0) >= 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2037)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2038)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2039);throw new IllegalArgumentException("Null byte present in file/path name. There are no "
                + "known legitimate use cases for such data, but several injection attacks may use it");
        }
    }}finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Gets the base name, minus the full path and extension, from a full fileName.
     * <p>
     * This method will handle a file in either Unix or Windows format.
     * The text after the last forward or backslash and before the last dot is returned.
     * <pre>
     * a/b/c.txt --&gt; c
     * a.txt     --&gt; a
     * a/b/c     --&gt; c
     * a/b/c/    --&gt; ""
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     *
     * @param fileName  the fileName to query, null returns null
     * @return the name of the file without the path, or an empty string if none exists. Null bytes inside string
     * will be removed
     */
    public static String getBaseName(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2040);
        __CLR4_4_11a31a3kylvdytv.R.inc(2041);return removeExtension(getName(fileName));
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Gets the extension of a fileName.
     * <p>
     * This method returns the textual part of the fileName after the last dot.
     * There must be no directory separator after the dot.
     * <pre>
     * foo.txt      --&gt; "txt"
     * a/b/c.jpg    --&gt; "jpg"
     * a/b.txt/c    --&gt; ""
     * a/b/c        --&gt; ""
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on, with the
     * exception of a possible {@link IllegalArgumentException} on Windows (see below).
     * </p>
     * <p>
     * <b>Note:</b> This method used to have a hidden problem for names like "foo.exe:bar.txt".
     * In this case, the name wouldn't be the name of a file, but the identifier of an
     * alternate data stream (bar.txt) on the file foo.exe. The method used to return
     * ".txt" here, which would be misleading. Commons IO 2.7, and later versions, are throwing
     * an {@link IllegalArgumentException} for names like this.
     *
     * @param fileName the fileName to retrieve the extension of.
     * @return the extension of the file or an empty string if none exists or {@code null}
     * if the fileName is {@code null}.
     * @throws IllegalArgumentException <b>Windows only:</b> The fileName parameter is, in fact,
     * the identifier of an Alternate Data Stream, for example "foo.exe:bar.txt".
     */
    public static String getExtension(final String fileName) throws IllegalArgumentException {try{__CLR4_4_11a31a3kylvdytv.R.inc(2042);
        __CLR4_4_11a31a3kylvdytv.R.inc(2043);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2044)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2045)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2046);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2047);final int index = indexOfExtension(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(2048);if ((((index == NOT_FOUND)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2049)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2050)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2051);return EMPTY_STRING;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2052);return fileName.substring(index + 1);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Special handling for NTFS ADS: Don't accept colon in the fileName.
     *
     * @param fileName a file name
     * @return ADS offsets.
     */
    private static int getAdsCriticalOffset(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2053);
        // Step 1: Remove leading path segments.
        __CLR4_4_11a31a3kylvdytv.R.inc(2054);final int offset1 = fileName.lastIndexOf(SYSTEM_SEPARATOR);
        __CLR4_4_11a31a3kylvdytv.R.inc(2055);final int offset2 = fileName.lastIndexOf(OTHER_SEPARATOR);
        __CLR4_4_11a31a3kylvdytv.R.inc(2056);if ((((offset1 == -1)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2057)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2058)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2059);if ((((offset2 == -1)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2060)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2061)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2062);return 0;
            }
            }__CLR4_4_11a31a3kylvdytv.R.inc(2063);return offset2 + 1;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2064);if ((((offset2 == -1)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2065)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2066)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2067);return offset1 + 1;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2068);return Math.max(offset1, offset2) + 1;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Removes the extension from a fileName.
     * <p>
     * This method returns the textual part of the fileName before the last dot.
     * There must be no directory separator after the dot.
     * <pre>
     * foo.txt    --&gt; foo
     * a\b\c.jpg  --&gt; a\b\c
     * a\b\c      --&gt; a\b\c
     * a.b\c      --&gt; a.b\c
     * </pre>
     * <p>
     * The output will be the same irrespective of the machine that the code is running on.
     *
     * @param fileName  the fileName to query, null returns null
     * @return the fileName minus the extension
     */
    public static String removeExtension(final String fileName) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2069);
        __CLR4_4_11a31a3kylvdytv.R.inc(2070);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2071)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2072)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2073);return null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2074);requireNonNullChars(fileName);

        __CLR4_4_11a31a3kylvdytv.R.inc(2075);final int index = indexOfExtension(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(2076);if ((((index == NOT_FOUND)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2077)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2078)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2079);return fileName;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2080);return fileName.substring(0, index);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks whether two fileNames are equal exactly.
     * <p>
     * No processing is performed on the fileNames other than comparison,
     * thus this is merely a null-safe case-sensitive equals.
     *
     * @param fileName1  the first fileName to query, may be null
     * @param fileName2  the second fileName to query, may be null
     * @return true if the fileNames are equal, null equals null
     * @see IOCase#SENSITIVE
     */
    public static boolean equals(final String fileName1, final String fileName2) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2081);
        __CLR4_4_11a31a3kylvdytv.R.inc(2082);return equals(fileName1, fileName2, false, IOCase.SENSITIVE);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks whether two fileNames are equal using the case rules of the system.
     * <p>
     * No processing is performed on the fileNames other than comparison.
     * The check is case-sensitive on Unix and case-insensitive on Windows.
     *
     * @param fileName1  the first fileName to query, may be null
     * @param fileName2  the second fileName to query, may be null
     * @return true if the fileNames are equal, null equals null
     * @see IOCase#SYSTEM
     */
    public static boolean equalsOnSystem(final String fileName1, final String fileName2) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2083);
        __CLR4_4_11a31a3kylvdytv.R.inc(2084);return equals(fileName1, fileName2, false, IOCase.SYSTEM);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks whether two fileNames are equal after both have been normalized.
     * <p>
     * Both fileNames are first passed to {@link #normalize(String)}.
     * The check is then performed in a case-sensitive manner.
     *
     * @param fileName1  the first fileName to query, may be null
     * @param fileName2  the second fileName to query, may be null
     * @return true if the fileNames are equal, null equals null
     * @see IOCase#SENSITIVE
     */
    public static boolean equalsNormalized(final String fileName1, final String fileName2) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2085);
        __CLR4_4_11a31a3kylvdytv.R.inc(2086);return equals(fileName1, fileName2, true, IOCase.SENSITIVE);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks whether two fileNames are equal after both have been normalized
     * and using the case rules of the system.
     * <p>
     * Both fileNames are first passed to {@link #normalize(String)}.
     * The check is then performed case-sensitive on Unix and
     * case-insensitive on Windows.
     *
     * @param fileName1  the first fileName to query, may be null
     * @param fileName2  the second fileName to query, may be null
     * @return true if the fileNames are equal, null equals null
     * @see IOCase#SYSTEM
     */
    public static boolean equalsNormalizedOnSystem(final String fileName1, final String fileName2) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2087);
        __CLR4_4_11a31a3kylvdytv.R.inc(2088);return equals(fileName1, fileName2, true, IOCase.SYSTEM);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks whether two fileNames are equal, optionally normalizing and providing
     * control over the case-sensitivity.
     *
     * @param fileName1  the first fileName to query, may be null
     * @param fileName2  the second fileName to query, may be null
     * @param normalized  whether to normalize the fileNames
     * @param caseSensitivity  what case sensitivity rule to use, null means case-sensitive
     * @return true if the fileNames are equal, null equals null
     * @since 1.3
     */
    public static boolean equals(
            String fileName1, String fileName2,
            final boolean normalized, IOCase caseSensitivity) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2089);

        __CLR4_4_11a31a3kylvdytv.R.inc(2090);if ((((fileName1 == null || fileName2 == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2091)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2092)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2093);return fileName1 == null && fileName2 == null;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2094);if ((((normalized)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2095)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2096)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2097);fileName1 = normalize(fileName1);
            __CLR4_4_11a31a3kylvdytv.R.inc(2098);if ((((fileName1 == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2099)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2100)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2101);return false;
            }
            }__CLR4_4_11a31a3kylvdytv.R.inc(2102);fileName2 = normalize(fileName2);
            __CLR4_4_11a31a3kylvdytv.R.inc(2103);if ((((fileName2 == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2104)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2105)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2106);return false;
            }
        }}
        }__CLR4_4_11a31a3kylvdytv.R.inc(2107);if ((((caseSensitivity == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2108)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2109)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2110);caseSensitivity = IOCase.SENSITIVE;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2111);return caseSensitivity.checkEquals(fileName1, fileName2);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks whether the extension of the fileName is that specified.
     * <p>
     * This method obtains the extension as the textual part of the fileName
     * after the last dot. There must be no directory separator after the dot.
     * The extension check is case-sensitive on all platforms.
     *
     * @param fileName  the fileName to query, null returns false
     * @param extension  the extension to check for, null or empty checks for no extension
     * @return true if the fileName has the specified extension
     * @throws java.lang.IllegalArgumentException if the supplied fileName contains null bytes
     */
    public static boolean isExtension(final String fileName, final String extension) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2112);
        __CLR4_4_11a31a3kylvdytv.R.inc(2113);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2114)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2115)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2116);return false;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2117);requireNonNullChars(fileName);

        __CLR4_4_11a31a3kylvdytv.R.inc(2118);if ((((extension == null || extension.isEmpty())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2119)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2120)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2121);return indexOfExtension(fileName) == NOT_FOUND;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2122);final String fileExt = getExtension(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(2123);return fileExt.equals(extension);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks whether the extension of the fileName is one of those specified.
     * <p>
     * This method obtains the extension as the textual part of the fileName
     * after the last dot. There must be no directory separator after the dot.
     * The extension check is case-sensitive on all platforms.
     *
     * @param fileName  the fileName to query, null returns false
     * @param extensions  the extensions to check for, null checks for no extension
     * @return true if the fileName is one of the extensions
     * @throws java.lang.IllegalArgumentException if the supplied fileName contains null bytes
     */
    public static boolean isExtension(final String fileName, final String... extensions) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2124);
        __CLR4_4_11a31a3kylvdytv.R.inc(2125);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2126)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2127)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2128);return false;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2129);requireNonNullChars(fileName);

        __CLR4_4_11a31a3kylvdytv.R.inc(2130);if ((((extensions == null || extensions.length == 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2131)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2132)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2133);return indexOfExtension(fileName) == NOT_FOUND;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2134);final String fileExt = getExtension(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(2135);for (final String extension : extensions) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2136);if ((((fileExt.equals(extension))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2137)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2138)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2139);return true;
            }
        }}
        }__CLR4_4_11a31a3kylvdytv.R.inc(2140);return false;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks whether the extension of the fileName is one of those specified.
     * <p>
     * This method obtains the extension as the textual part of the fileName
     * after the last dot. There must be no directory separator after the dot.
     * The extension check is case-sensitive on all platforms.
     *
     * @param fileName  the fileName to query, null returns false
     * @param extensions  the extensions to check for, null checks for no extension
     * @return true if the fileName is one of the extensions
     * @throws java.lang.IllegalArgumentException if the supplied fileName contains null bytes
     */
    public static boolean isExtension(final String fileName, final Collection<String> extensions) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2141);
        __CLR4_4_11a31a3kylvdytv.R.inc(2142);if ((((fileName == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2143)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2144)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2145);return false;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2146);requireNonNullChars(fileName);

        __CLR4_4_11a31a3kylvdytv.R.inc(2147);if ((((extensions == null || extensions.isEmpty())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2148)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2149)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2150);return indexOfExtension(fileName) == NOT_FOUND;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2151);final String fileExt = getExtension(fileName);
        __CLR4_4_11a31a3kylvdytv.R.inc(2152);for (final String extension : extensions) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2153);if ((((fileExt.equals(extension))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2154)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2155)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2156);return true;
            }
        }}
        }__CLR4_4_11a31a3kylvdytv.R.inc(2157);return false;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks a fileName to see if it matches the specified wildcard matcher,
     * always testing case-sensitive.
     * <p>
     * The wildcard matcher uses the characters '?' and '*' to represent a
     * single or multiple (zero or more) wildcard characters.
     * This is the same as often found on Dos/Unix command lines.
     * The check is case-sensitive always.
     * <pre>
     * wildcardMatch("c.txt", "*.txt")      --&gt; true
     * wildcardMatch("c.txt", "*.jpg")      --&gt; false
     * wildcardMatch("a/b/c.txt", "a/b/*")  --&gt; true
     * wildcardMatch("c.txt", "*.???")      --&gt; true
     * wildcardMatch("c.txt", "*.????")     --&gt; false
     * </pre>
     * N.B. the sequence "*?" does not work properly at present in match strings.
     *
     * @param fileName  the fileName to match on
     * @param wildcardMatcher  the wildcard string to match against
     * @return true if the fileName matches the wildcard string
     * @see IOCase#SENSITIVE
     */
    public static boolean wildcardMatch(final String fileName, final String wildcardMatcher) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2158);
        __CLR4_4_11a31a3kylvdytv.R.inc(2159);return wildcardMatch(fileName, wildcardMatcher, IOCase.SENSITIVE);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks a fileName to see if it matches the specified wildcard matcher
     * using the case rules of the system.
     * <p>
     * The wildcard matcher uses the characters '?' and '*' to represent a
     * single or multiple (zero or more) wildcard characters.
     * This is the same as often found on Dos/Unix command lines.
     * The check is case-sensitive on Unix and case-insensitive on Windows.
     * <pre>
     * wildcardMatch("c.txt", "*.txt")      --&gt; true
     * wildcardMatch("c.txt", "*.jpg")      --&gt; false
     * wildcardMatch("a/b/c.txt", "a/b/*")  --&gt; true
     * wildcardMatch("c.txt", "*.???")      --&gt; true
     * wildcardMatch("c.txt", "*.????")     --&gt; false
     * </pre>
     * N.B. the sequence "*?" does not work properly at present in match strings.
     *
     * @param fileName  the fileName to match on
     * @param wildcardMatcher  the wildcard string to match against
     * @return true if the fileName matches the wildcard string
     * @see IOCase#SYSTEM
     */
    public static boolean wildcardMatchOnSystem(final String fileName, final String wildcardMatcher) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2160);
        __CLR4_4_11a31a3kylvdytv.R.inc(2161);return wildcardMatch(fileName, wildcardMatcher, IOCase.SYSTEM);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks a fileName to see if it matches the specified wildcard matcher
     * allowing control over case-sensitivity.
     * <p>
     * The wildcard matcher uses the characters '?' and '*' to represent a
     * single or multiple (zero or more) wildcard characters.
     * N.B. the sequence "*?" does not work properly at present in match strings.
     *
     * @param fileName  the fileName to match on
     * @param wildcardMatcher  the wildcard string to match against
     * @param caseSensitivity  what case sensitivity rule to use, null means case-sensitive
     * @return true if the fileName matches the wildcard string
     * @since 1.3
     */
    public static boolean wildcardMatch(final String fileName, final String wildcardMatcher, IOCase caseSensitivity) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2162);
        __CLR4_4_11a31a3kylvdytv.R.inc(2163);if ((((fileName == null && wildcardMatcher == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2164)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2165)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2166);return true;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2167);if ((((fileName == null || wildcardMatcher == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2168)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2169)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2170);return false;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2171);if ((((caseSensitivity == null)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2172)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2173)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2174);caseSensitivity = IOCase.SENSITIVE;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2175);final String[] wcs = splitOnTokens(wildcardMatcher);
        __CLR4_4_11a31a3kylvdytv.R.inc(2176);boolean anyChars = false;
        __CLR4_4_11a31a3kylvdytv.R.inc(2177);int textIdx = 0;
        __CLR4_4_11a31a3kylvdytv.R.inc(2178);int wcsIdx = 0;
        __CLR4_4_11a31a3kylvdytv.R.inc(2179);final Deque<int[]> backtrack = new ArrayDeque<>(wcs.length);

        // loop around a backtrack stack, to handle complex * matching
        __CLR4_4_11a31a3kylvdytv.R.inc(2180);do {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2181);if ((((!backtrack.isEmpty())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2182)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2183)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2184);final int[] array = backtrack.pop();
                __CLR4_4_11a31a3kylvdytv.R.inc(2185);wcsIdx = array[0];
                __CLR4_4_11a31a3kylvdytv.R.inc(2186);textIdx = array[1];
                __CLR4_4_11a31a3kylvdytv.R.inc(2187);anyChars = true;
            }

            // loop whilst tokens and text left to process
            }__CLR4_4_11a31a3kylvdytv.R.inc(2188);while ((((wcsIdx < wcs.length)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2189)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2190)==0&false))) {{

                __CLR4_4_11a31a3kylvdytv.R.inc(2191);if ((((wcs[wcsIdx].equals("?"))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2192)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2193)==0&false))) {{
                    // ? so move to next text char
                    __CLR4_4_11a31a3kylvdytv.R.inc(2194);textIdx++;
                    __CLR4_4_11a31a3kylvdytv.R.inc(2195);if ((((textIdx > fileName.length())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2196)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2197)==0&false))) {{
                        __CLR4_4_11a31a3kylvdytv.R.inc(2198);break;
                    }
                    }__CLR4_4_11a31a3kylvdytv.R.inc(2199);anyChars = false;

                } }else {__CLR4_4_11a31a3kylvdytv.R.inc(2200);if ((((wcs[wcsIdx].equals("*"))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2201)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2202)==0&false))) {{
                    // set any chars status
                    __CLR4_4_11a31a3kylvdytv.R.inc(2203);anyChars = true;
                    __CLR4_4_11a31a3kylvdytv.R.inc(2204);if ((((wcsIdx == wcs.length - 1)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2205)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2206)==0&false))) {{
                        __CLR4_4_11a31a3kylvdytv.R.inc(2207);textIdx = fileName.length();
                    }

                }} }else {{
                    // matching text token
                    __CLR4_4_11a31a3kylvdytv.R.inc(2208);if ((((anyChars)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2209)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2210)==0&false))) {{
                        // any chars then try to locate text token
                        __CLR4_4_11a31a3kylvdytv.R.inc(2211);textIdx = caseSensitivity.checkIndexOf(fileName, textIdx, wcs[wcsIdx]);
                        __CLR4_4_11a31a3kylvdytv.R.inc(2212);if ((((textIdx == NOT_FOUND)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2213)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2214)==0&false))) {{
                            // token not found
                            __CLR4_4_11a31a3kylvdytv.R.inc(2215);break;
                        }
                        }__CLR4_4_11a31a3kylvdytv.R.inc(2216);final int repeat = caseSensitivity.checkIndexOf(fileName, textIdx + 1, wcs[wcsIdx]);
                        __CLR4_4_11a31a3kylvdytv.R.inc(2217);if ((((repeat >= 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2218)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2219)==0&false))) {{
                            __CLR4_4_11a31a3kylvdytv.R.inc(2220);backtrack.push(new int[] {wcsIdx, repeat});
                        }
                    }} }else {__CLR4_4_11a31a3kylvdytv.R.inc(2221);if ((((!caseSensitivity.checkRegionMatches(fileName, textIdx, wcs[wcsIdx]))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2222)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2223)==0&false))) {{
                        // matching from current position
                        // couldn't match token
                        __CLR4_4_11a31a3kylvdytv.R.inc(2224);break;
                    }

                    // matched text token, move text index to end of matched token
                    }}__CLR4_4_11a31a3kylvdytv.R.inc(2225);textIdx += wcs[wcsIdx].length();
                    __CLR4_4_11a31a3kylvdytv.R.inc(2226);anyChars = false;
                }

                }}__CLR4_4_11a31a3kylvdytv.R.inc(2227);wcsIdx++;
            }

            // full match
            }__CLR4_4_11a31a3kylvdytv.R.inc(2228);if ((((wcsIdx == wcs.length && textIdx == fileName.length())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2229)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2230)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2231);return true;
            }

        }} }while ((((!backtrack.isEmpty())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2232)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2233)==0&false)));

        __CLR4_4_11a31a3kylvdytv.R.inc(2234);return false;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Splits a string into a number of tokens.
     * The text is split by '?' and '*'.
     * Where multiple '*' occur consecutively they are collapsed into a single '*'.
     *
     * @param text  the text to split
     * @return the array of tokens, never null
     */
    static String[] splitOnTokens(final String text) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2235);
        // used by wildcardMatch
        // package level so a unit test may run on this

        __CLR4_4_11a31a3kylvdytv.R.inc(2236);if ((((text.indexOf('?') == NOT_FOUND && text.indexOf('*') == NOT_FOUND)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2237)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2238)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2239);return new String[] { text };
        }

        }__CLR4_4_11a31a3kylvdytv.R.inc(2240);final char[] array = text.toCharArray();
        __CLR4_4_11a31a3kylvdytv.R.inc(2241);final ArrayList<String> list = new ArrayList<>();
        __CLR4_4_11a31a3kylvdytv.R.inc(2242);final StringBuilder buffer = new StringBuilder();
        __CLR4_4_11a31a3kylvdytv.R.inc(2243);char prevChar = 0;
        __CLR4_4_11a31a3kylvdytv.R.inc(2244);for (final char ch : array) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2245);if ((((ch == '?' || ch == '*')&&(__CLR4_4_11a31a3kylvdytv.R.iget(2246)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2247)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2248);if ((((buffer.length() != 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2249)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2250)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(2251);list.add(buffer.toString());
                    __CLR4_4_11a31a3kylvdytv.R.inc(2252);buffer.setLength(0);
                }
                }__CLR4_4_11a31a3kylvdytv.R.inc(2253);if ((((ch == '?')&&(__CLR4_4_11a31a3kylvdytv.R.iget(2254)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2255)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(2256);list.add("?");
                } }else {__CLR4_4_11a31a3kylvdytv.R.inc(2257);if ((((prevChar != '*')&&(__CLR4_4_11a31a3kylvdytv.R.iget(2258)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2259)==0&false))) {{// ch == '*' here; check if previous char was '*'
                    __CLR4_4_11a31a3kylvdytv.R.inc(2260);list.add("*");
                }
            }}} }else {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2261);buffer.append(ch);
            }
            }__CLR4_4_11a31a3kylvdytv.R.inc(2262);prevChar = ch;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2263);if ((((buffer.length() != 0)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2264)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2265)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2266);list.add(buffer.toString());
        }

        }__CLR4_4_11a31a3kylvdytv.R.inc(2267);return list.toArray(EMPTY_STRING_ARRAY);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    /**
     * Checks whether a given string is a valid host name according to
     * RFC 3986.
     *
     * <p>Accepted are IP addresses (v4 and v6) as well as what the
     * RFC calls a "reg-name". Percent encoded names don't seem to be
     * valid names in UNC paths.</p>
     *
     * @see "https://tools.ietf.org/html/rfc3986#section-3.2.2"
     * @param name the hostname to validate
     * @return true if the given name is a valid host name
     */
    private static boolean isValidHostName(final String name) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2268);
        __CLR4_4_11a31a3kylvdytv.R.inc(2269);return isIPv6Address(name) || isRFC3986HostName(name);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    private static final Pattern IPV4_PATTERN =
        Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
    private static final int IPV4_MAX_OCTET_VALUE = 255;

    /**
     * Checks whether a given string represents a valid IPv4 address.
     *
     * @param name the name to validate
     * @return true if the given name is a valid IPv4 address
     */
    // mostly copied from org.apache.commons.validator.routines.InetAddressValidator#isValidInet4Address
    private static boolean isIPv4Address(final String name) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2270);
        __CLR4_4_11a31a3kylvdytv.R.inc(2271);final Matcher m = IPV4_PATTERN.matcher(name);
        __CLR4_4_11a31a3kylvdytv.R.inc(2272);if ((((!m.matches() || m.groupCount() != 4)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2273)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2274)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2275);return false;
        }

        // verify that address subgroups are legal
        }__CLR4_4_11a31a3kylvdytv.R.inc(2276);for (int i = 1; (((i <= 4)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2277)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2278)==0&false)); i++) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2279);final String ipSegment = m.group(i);
            __CLR4_4_11a31a3kylvdytv.R.inc(2280);final int iIpSegment = Integer.parseInt(ipSegment);
            __CLR4_4_11a31a3kylvdytv.R.inc(2281);if ((((iIpSegment > IPV4_MAX_OCTET_VALUE)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2282)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2283)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2284);return false;
            }

            }__CLR4_4_11a31a3kylvdytv.R.inc(2285);if ((((ipSegment.length() > 1 && ipSegment.startsWith("0"))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2286)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2287)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2288);return false;
            }

        }}

        }__CLR4_4_11a31a3kylvdytv.R.inc(2289);return true;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    private static final int IPV6_MAX_HEX_GROUPS = 8;
    private static final int IPV6_MAX_HEX_DIGITS_PER_GROUP = 4;
    private static final int MAX_UNSIGNED_SHORT = 0xffff;
    private static final int BASE_16 = 16;

    // copied from org.apache.commons.validator.routines.InetAddressValidator#isValidInet6Address
    /**
     * Checks whether a given string represents a valid IPv6 address.
     *
     * @param inet6Address the name to validate
     * @return true if the given name is a valid IPv6 address
     */
    private static boolean isIPv6Address(final String inet6Address) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2290);
        __CLR4_4_11a31a3kylvdytv.R.inc(2291);final boolean containsCompressedZeroes = inet6Address.contains("::");
        __CLR4_4_11a31a3kylvdytv.R.inc(2292);if ((((containsCompressedZeroes && (inet6Address.indexOf("::") != inet6Address.lastIndexOf("::")))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2293)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2294)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2295);return false;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2296);if (((((inet6Address.startsWith(":") && !inet6Address.startsWith("::"))
                || (inet6Address.endsWith(":") && !inet6Address.endsWith("::")))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2297)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2298)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2299);return false;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2300);String[] octets = inet6Address.split(":");
        __CLR4_4_11a31a3kylvdytv.R.inc(2301);if ((((containsCompressedZeroes)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2302)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2303)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2304);final List<String> octetList = new ArrayList<>(Arrays.asList(octets));
            __CLR4_4_11a31a3kylvdytv.R.inc(2305);if ((((inet6Address.endsWith("::"))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2306)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2307)==0&false))) {{
                // String.split() drops ending empty segments
                __CLR4_4_11a31a3kylvdytv.R.inc(2308);octetList.add("");
            } }else {__CLR4_4_11a31a3kylvdytv.R.inc(2309);if ((((inet6Address.startsWith("::") && !octetList.isEmpty())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2310)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2311)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2312);octetList.remove(0);
            }
            }}__CLR4_4_11a31a3kylvdytv.R.inc(2313);octets = octetList.toArray(EMPTY_STRING_ARRAY);
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2314);if ((((octets.length > IPV6_MAX_HEX_GROUPS)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2315)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2316)==0&false))) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2317);return false;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2318);int validOctets = 0;
        __CLR4_4_11a31a3kylvdytv.R.inc(2319);int emptyOctets = 0; // consecutive empty chunks
        __CLR4_4_11a31a3kylvdytv.R.inc(2320);for (int index = 0; (((index < octets.length)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2321)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2322)==0&false)); index++) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2323);final String octet = octets[index];
            __CLR4_4_11a31a3kylvdytv.R.inc(2324);if ((((octet.isEmpty())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2325)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2326)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2327);emptyOctets++;
                __CLR4_4_11a31a3kylvdytv.R.inc(2328);if ((((emptyOctets > 1)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2329)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2330)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(2331);return false;
                }
            }} }else {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2332);emptyOctets = 0;
                // Is last chunk an IPv4 address?
                __CLR4_4_11a31a3kylvdytv.R.inc(2333);if ((((index == octets.length - 1 && octet.contains("."))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2334)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2335)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(2336);if ((((!isIPv4Address(octet))&&(__CLR4_4_11a31a3kylvdytv.R.iget(2337)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2338)==0&false))) {{
                        __CLR4_4_11a31a3kylvdytv.R.inc(2339);return false;
                    }
                    }__CLR4_4_11a31a3kylvdytv.R.inc(2340);validOctets += 2;
                    __CLR4_4_11a31a3kylvdytv.R.inc(2341);continue;
                }
                }__CLR4_4_11a31a3kylvdytv.R.inc(2342);if ((((octet.length() > IPV6_MAX_HEX_DIGITS_PER_GROUP)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2343)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2344)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(2345);return false;
                }
                }__CLR4_4_11a31a3kylvdytv.R.inc(2346);final int octetInt;
                __CLR4_4_11a31a3kylvdytv.R.inc(2347);try {
                    __CLR4_4_11a31a3kylvdytv.R.inc(2348);octetInt = Integer.parseInt(octet, BASE_16);
                } catch (final NumberFormatException e) {
                    __CLR4_4_11a31a3kylvdytv.R.inc(2349);return false;
                }
                __CLR4_4_11a31a3kylvdytv.R.inc(2350);if ((((octetInt < 0 || octetInt > MAX_UNSIGNED_SHORT)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2351)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2352)==0&false))) {{
                    __CLR4_4_11a31a3kylvdytv.R.inc(2353);return false;
                }
            }}
            }__CLR4_4_11a31a3kylvdytv.R.inc(2354);validOctets++;
        }
        }__CLR4_4_11a31a3kylvdytv.R.inc(2355);return validOctets <= IPV6_MAX_HEX_GROUPS && (validOctets >= IPV6_MAX_HEX_GROUPS || containsCompressedZeroes);
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}

    private static final Pattern REG_NAME_PART_PATTERN = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");

    /**
     * Checks whether a given string is a valid host name according to
     * RFC 3986 - not accepting IP addresses.
     *
     * @see "https://tools.ietf.org/html/rfc3986#section-3.2.2"
     * @param name the hostname to validate
     * @return true if the given name is a valid host name
     */
    private static boolean isRFC3986HostName(final String name) {try{__CLR4_4_11a31a3kylvdytv.R.inc(2356);
        __CLR4_4_11a31a3kylvdytv.R.inc(2357);final String[] parts = name.split("\\.", -1);
        __CLR4_4_11a31a3kylvdytv.R.inc(2358);for (int i = 0; (((i < parts.length)&&(__CLR4_4_11a31a3kylvdytv.R.iget(2359)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2360)==0&false)); i++) {{
            __CLR4_4_11a31a3kylvdytv.R.inc(2361);if ((((parts[i].isEmpty())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2362)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2363)==0&false))) {{
                // trailing dot is legal, otherwise we've hit a .. sequence
                __CLR4_4_11a31a3kylvdytv.R.inc(2364);return i == parts.length - 1;
            }
            }__CLR4_4_11a31a3kylvdytv.R.inc(2365);if ((((!REG_NAME_PART_PATTERN.matcher(parts[i]).matches())&&(__CLR4_4_11a31a3kylvdytv.R.iget(2366)!=0|true))||(__CLR4_4_11a31a3kylvdytv.R.iget(2367)==0&false))) {{
                __CLR4_4_11a31a3kylvdytv.R.inc(2368);return false;
            }
        }}
        }__CLR4_4_11a31a3kylvdytv.R.inc(2369);return true;
    }finally{__CLR4_4_11a31a3kylvdytv.R.flushNeeded();}}
}
