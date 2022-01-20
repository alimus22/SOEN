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
package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

import org.apache.commons.io.IOUtils;

/**
 * <p>
 * File filter for matching files containing a "magic number". A magic number
 * is a unique series of bytes common to all files of a specific file format.
 * For instance, all Java class files begin with the bytes
 * {@code 0xCAFEBABE}.
 * </p>
 * <h2>Using Classic IO</h2>
 * <pre>
 * File dir = new File(".");
 * MagicNumberFileFilter javaClassFileFilter =
 *     MagicNumberFileFilter(new byte[] {(byte) 0xCA, (byte) 0xFE,
 *       (byte) 0xBA, (byte) 0xBE});
 * String[] javaClassFiles = dir.list(javaClassFileFilter);
 * for (String javaClassFile : javaClassFiles) {
 *     System.out.println(javaClassFile);
 * }
 * </pre>
 *
 * <p>
 * Sometimes, such as in the case of TAR files, the
 * magic number will be offset by a certain number of bytes in the file. In the
 * case of TAR archive files, this offset is 257 bytes.
 * </p>
 *
 * <pre>
 * File dir = new File(".");
 * MagicNumberFileFilter tarFileFilter =
 *     MagicNumberFileFilter("ustar", 257);
 * String[] tarFiles = dir.list(tarFileFilter);
 * for (String tarFile : tarFiles) {
 *     System.out.println(tarFile);
 * }
 * </pre>
 * <h2>Using NIO</h2>
 * <pre>
 * final Path dir = Paths.get("");
 * final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(MagicNumberFileFilter("ustar", 257));
 * //
 * // Walk one dir
 * Files.<b>walkFileTree</b>(dir, Collections.emptySet(), 1, visitor);
 * System.out.println(visitor.getPathCounters());
 * System.out.println(visitor.getFileList());
 * //
 * visitor.getPathCounters().reset();
 * //
 * // Walk dir tree
 * Files.<b>walkFileTree</b>(dir, visitor);
 * System.out.println(visitor.getPathCounters());
 * System.out.println(visitor.getDirList());
 * System.out.println(visitor.getFileList());
 * </pre>
 *
 * @since 2.0
 * @see FileFilterUtils#magicNumberFileFilter(byte[])
 * @see FileFilterUtils#magicNumberFileFilter(String)
 * @see FileFilterUtils#magicNumberFileFilter(byte[], long)
 * @see FileFilterUtils#magicNumberFileFilter(String, long)
 */
public class MagicNumberFileFilter extends AbstractFileFilter implements
        Serializable {public static class __CLR4_4_13nh3nhkylvdzh9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,4807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The serialization version unique identifier.
     */
    private static final long serialVersionUID = -547733176983104172L;

    /**
     * The magic number to compare against the file's bytes at the provided
     * offset.
     */
    private final byte[] magicNumbers;

    /**
     * The offset (in bytes) within the files that the magic number's bytes
     * should appear.
     */
    private final long byteOffset;

    /**
     * <p>
     * Constructs a new MagicNumberFileFilter and associates it with the magic
     * number to test for in files. This constructor assumes a starting offset
     * of {@code 0}.
     * </p>
     *
     * <p>
     * It is important to note that <em>the array is not cloned</em> and that
     * any changes to the magic number array after construction will affect the
     * behavior of this file filter.
     * </p>
     *
     * <pre>
     * MagicNumberFileFilter javaClassFileFilter =
     *     MagicNumberFileFilter(new byte[] {(byte) 0xCA, (byte) 0xFE,
     *       (byte) 0xBA, (byte) 0xBE});
     * </pre>
     *
     * @param magicNumber the magic number to look for in the file.
     *
     * @throws IllegalArgumentException if {@code magicNumber} is
     *         {@code null}, or contains no bytes.
     */
    public MagicNumberFileFilter(final byte[] magicNumber) {
        this(magicNumber, 0);__CLR4_4_13nh3nhkylvdzh9.R.inc(4734);try{__CLR4_4_13nh3nhkylvdzh9.R.inc(4733);
    }finally{__CLR4_4_13nh3nhkylvdzh9.R.flushNeeded();}}

    /**
     * <p>
     * Constructs a new MagicNumberFileFilter and associates it with the magic
     * number to test for in files and the byte offset location in the file to
     * to look for that magic number.
     * </p>
     *
     * <pre>
     * MagicNumberFileFilter tarFileFilter =
     *     MagicNumberFileFilter(new byte[] {0x75, 0x73, 0x74, 0x61, 0x72}, 257);
     * </pre>
     *
     * <pre>
     * MagicNumberFileFilter javaClassFileFilter =
     *     MagicNumberFileFilter(new byte[] {0xCA, 0xFE, 0xBA, 0xBE}, 0);
     * </pre>
     *
     * @param magicNumber the magic number to look for in the file.
     * @param offset the byte offset in the file to start comparing bytes.
     *
     * @throws IllegalArgumentException if {@code magicNumber} is
     *         {@code null}, or contains no bytes, or {@code offset}
     *         is a negative number.
     */
    public MagicNumberFileFilter(final byte[] magicNumber, final long offset) {try{__CLR4_4_13nh3nhkylvdzh9.R.inc(4735);
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4736);if ((((magicNumber == null)&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4737)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4738)==0&false))) {{
            __CLR4_4_13nh3nhkylvdzh9.R.inc(4739);throw new IllegalArgumentException("The magic number cannot be null");
        }
        }__CLR4_4_13nh3nhkylvdzh9.R.inc(4740);if ((((magicNumber.length == 0)&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4741)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4742)==0&false))) {{
            __CLR4_4_13nh3nhkylvdzh9.R.inc(4743);throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        }__CLR4_4_13nh3nhkylvdzh9.R.inc(4744);if ((((offset < 0)&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4745)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4746)==0&false))) {{
            __CLR4_4_13nh3nhkylvdzh9.R.inc(4747);throw new IllegalArgumentException("The offset cannot be negative");
        }

        }__CLR4_4_13nh3nhkylvdzh9.R.inc(4748);this.magicNumbers = IOUtils.byteArray(magicNumber.length);
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4749);System.arraycopy(magicNumber, 0, this.magicNumbers, 0, magicNumber.length);
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4750);this.byteOffset = offset;
    }finally{__CLR4_4_13nh3nhkylvdzh9.R.flushNeeded();}}

    /**
     * <p>
     * Constructs a new MagicNumberFileFilter and associates it with the magic
     * number to test for in files. This constructor assumes a starting offset
     * of {@code 0}.
     * </p>
     *
     * Example usage:
     * <pre>
     * {@code
     * MagicNumberFileFilter xmlFileFilter =
     *     MagicNumberFileFilter("<?xml");
     * }
     * </pre>
     *
     * @param magicNumber the magic number to look for in the file.
     *        The string is converted to bytes using the platform default charset.
     *
     * @throws IllegalArgumentException if {@code magicNumber} is
     *         {@code null} or the empty String.
     */
    public MagicNumberFileFilter(final String magicNumber) {
        this(magicNumber, 0);__CLR4_4_13nh3nhkylvdzh9.R.inc(4752);try{__CLR4_4_13nh3nhkylvdzh9.R.inc(4751);
    }finally{__CLR4_4_13nh3nhkylvdzh9.R.flushNeeded();}}

    /**
     * <p>
     * Constructs a new MagicNumberFileFilter and associates it with the magic
     * number to test for in files and the byte offset location in the file to
     * to look for that magic number.
     * </p>
     *
     * <pre>
     * MagicNumberFileFilter tarFileFilter =
     *     MagicNumberFileFilter("ustar", 257);
     * </pre>
     *
     * @param magicNumber the magic number to look for in the file.
     *        The string is converted to bytes using the platform default charset.
     * @param offset the byte offset in the file to start comparing bytes.
     *
     * @throws IllegalArgumentException if {@code magicNumber} is
     *         {@code null} or the empty String, or {@code offset} is
     *         a negative number.
     */
    public MagicNumberFileFilter(final String magicNumber, final long offset) {try{__CLR4_4_13nh3nhkylvdzh9.R.inc(4753);
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4754);if ((((magicNumber == null)&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4755)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4756)==0&false))) {{
            __CLR4_4_13nh3nhkylvdzh9.R.inc(4757);throw new IllegalArgumentException("The magic number cannot be null");
        }
        }__CLR4_4_13nh3nhkylvdzh9.R.inc(4758);if ((((magicNumber.isEmpty())&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4759)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4760)==0&false))) {{
            __CLR4_4_13nh3nhkylvdzh9.R.inc(4761);throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        }__CLR4_4_13nh3nhkylvdzh9.R.inc(4762);if ((((offset < 0)&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4763)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4764)==0&false))) {{
            __CLR4_4_13nh3nhkylvdzh9.R.inc(4765);throw new IllegalArgumentException("The offset cannot be negative");
        }

        }__CLR4_4_13nh3nhkylvdzh9.R.inc(4766);this.magicNumbers = magicNumber.getBytes(Charset.defaultCharset()); // explicitly uses the platform default
                                                                            // charset
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4767);this.byteOffset = offset;
    }finally{__CLR4_4_13nh3nhkylvdzh9.R.flushNeeded();}}

    /**
     * <p>
     * Accepts the provided file if the file contains the file filter's magic
     * number at the specified offset.
     * </p>
     *
     * <p>
     * If any {@link IOException}s occur while reading the file, the file will
     * be rejected.
     * </p>
     *
     * @param file the file to accept or reject.
     *
     * @return {@code true} if the file contains the filter's magic number
     *         at the specified offset, {@code false} otherwise.
     */
    @Override
    public boolean accept(final File file) {try{__CLR4_4_13nh3nhkylvdzh9.R.inc(4768);
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4769);if ((((file != null && file.isFile() && file.canRead())&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4770)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4771)==0&false))) {{
            __CLR4_4_13nh3nhkylvdzh9.R.inc(4772);try {
                class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_13nh3nhkylvdzh9.R.inc(4773);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_13nh3nhkylvdzh9.R.inc(4774);}};RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
                    __CLR4_4_13nh3nhkylvdzh9.R.inc(4775);final byte[] fileBytes = IOUtils.byteArray(this.magicNumbers.length);
                    __CLR4_4_13nh3nhkylvdzh9.R.inc(4776);randomAccessFile.seek(byteOffset);
                    __CLR4_4_13nh3nhkylvdzh9.R.inc(4777);final int read = randomAccessFile.read(fileBytes);
                    __CLR4_4_13nh3nhkylvdzh9.R.inc(4778);if ((((read != magicNumbers.length)&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4779)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4780)==0&false))) {{
                        __CLR4_4_13nh3nhkylvdzh9.R.inc(4781);return false;
                    }
                    }__CLR4_4_13nh3nhkylvdzh9.R.inc(4782);return Arrays.equals(this.magicNumbers, fileBytes);
                }
            }
            catch (final IOException ioe) {
                // Do nothing, fall through and do not accept file
            }
        }

        }__CLR4_4_13nh3nhkylvdzh9.R.inc(4783);return false;
    }finally{__CLR4_4_13nh3nhkylvdzh9.R.flushNeeded();}}

    /**
     * <p>
     * Accepts the provided file if the file contains the file filter's magic
     * number at the specified offset.
     * </p>
     *
     * <p>
     * If any {@link IOException}s occur while reading the file, the file will
     * be rejected.
     * </p>
     * @param file the file to accept or reject.
     *
     * @return {@code true} if the file contains the filter's magic number
     *         at the specified offset, {@code false} otherwise.
     * @since 2.9.0
     */
    @Override
    public FileVisitResult accept(final Path file, final BasicFileAttributes attributes) {try{__CLR4_4_13nh3nhkylvdzh9.R.inc(4784);
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4785);if ((((file != null && Files.isRegularFile(file) && Files.isReadable(file))&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4786)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4787)==0&false))) {{
            __CLR4_4_13nh3nhkylvdzh9.R.inc(4788);try {
                class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_13nh3nhkylvdzh9.R.inc(4789);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_13nh3nhkylvdzh9.R.inc(4790);}};final FileChannel fileChannel = FileChannel.open(file)) {
                    __CLR4_4_13nh3nhkylvdzh9.R.inc(4791);final ByteBuffer byteBuffer = ByteBuffer.allocate(this.magicNumbers.length);
                    __CLR4_4_13nh3nhkylvdzh9.R.inc(4792);final int read = fileChannel.read(byteBuffer);
                    __CLR4_4_13nh3nhkylvdzh9.R.inc(4793);if ((((read != magicNumbers.length)&&(__CLR4_4_13nh3nhkylvdzh9.R.iget(4794)!=0|true))||(__CLR4_4_13nh3nhkylvdzh9.R.iget(4795)==0&false))) {{
                        __CLR4_4_13nh3nhkylvdzh9.R.inc(4796);return FileVisitResult.TERMINATE;
                    }
                    }__CLR4_4_13nh3nhkylvdzh9.R.inc(4797);return toFileVisitResult(Arrays.equals(this.magicNumbers, byteBuffer.array()), file);
                }
            }
            catch (final IOException ioe) {
                // Do nothing, fall through and do not accept file
            }
        }
        }__CLR4_4_13nh3nhkylvdzh9.R.inc(4798);return FileVisitResult.TERMINATE;
    }finally{__CLR4_4_13nh3nhkylvdzh9.R.flushNeeded();}}

    /**
     * Returns a String representation of the file filter, which includes the
     * magic number bytes and byte offset.
     *
     * @return a String representation of the file filter.
     */
    @Override
    public String toString() {try{__CLR4_4_13nh3nhkylvdzh9.R.inc(4799);
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4800);final StringBuilder builder = new StringBuilder(super.toString());
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4801);builder.append("(");
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4802);builder.append(new String(magicNumbers, Charset.defaultCharset()));// TODO perhaps use hex if value is not
                                                                           // printable
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4803);builder.append(",");
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4804);builder.append(this.byteOffset);
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4805);builder.append(")");
        __CLR4_4_13nh3nhkylvdzh9.R.inc(4806);return builder.toString();
    }finally{__CLR4_4_13nh3nhkylvdzh9.R.flushNeeded();}}
}
