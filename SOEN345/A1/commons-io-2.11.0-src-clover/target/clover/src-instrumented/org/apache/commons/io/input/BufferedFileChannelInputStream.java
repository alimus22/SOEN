/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.io.input;

import static org.apache.commons.io.IOUtils.EOF;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

import org.apache.commons.io.IOUtils;

/**
 * {@link InputStream} implementation which uses direct buffer to read a file to avoid extra copy of data between Java
 * and native memory which happens when using {@link java.io.BufferedInputStream}. Unfortunately, this is not something
 * already available in JDK, {@code sun.nio.ch.ChannelInputStream} supports reading a file using NIO, but does not
 * support buffering.
 * <p>
 * This class was ported and adapted from Apache Spark commit 933dc6cb7b3de1d8ccaf73d124d6eb95b947ed19 where it was
 * called {@code NioBufferedFileInputStream}.
 * </p>
 *
 * @since 2.9.0
 */
@SuppressWarnings("restriction")
public final class BufferedFileChannelInputStream extends InputStream {public static class __CLR4_4_14cm4cmkylvdzqv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,5745,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final ByteBuffer byteBuffer;

    private final FileChannel fileChannel;

    private static final Class<?> DIRECT_BUFFER_CLASS = getDirectBufferClass();

    private static Class<?> getDirectBufferClass() {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5638);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5639);Class<?> res = null;
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5640);try {
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5641);res = Class.forName("sun.nio.ch.DirectBuffer");
        } catch (final IllegalAccessError | ClassNotFoundException ignored) {
            // ignored
        }
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5642);return res;
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    private static boolean isDirectBuffer(final Object object) {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5643);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5644);return DIRECT_BUFFER_CLASS != null && DIRECT_BUFFER_CLASS.isInstance(object);
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    /**
     * Constructs a new instance for the given File.
     *
     * @param file The file to stream.
     * @throws IOException If an I/O error occurs
     */
    public BufferedFileChannelInputStream(final File file) throws IOException {
        this(file, IOUtils.DEFAULT_BUFFER_SIZE);__CLR4_4_14cm4cmkylvdzqv.R.inc(5646);try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5645);
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    /**
     * Constructs a new instance for the given File and buffer size.
     *
     * @param file The file to stream.
     * @param bufferSizeInBytes buffer size.
     * @throws IOException If an I/O error occurs
     */
    public BufferedFileChannelInputStream(final File file, final int bufferSizeInBytes) throws IOException {
        this(file.toPath(), bufferSizeInBytes);__CLR4_4_14cm4cmkylvdzqv.R.inc(5648);try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5647);
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    /**
     * Constructs a new instance for the given Path.
     *
     * @param path The path to stream.
     * @throws IOException If an I/O error occurs
     */
    public BufferedFileChannelInputStream(final Path path) throws IOException {
        this(path, IOUtils.DEFAULT_BUFFER_SIZE);__CLR4_4_14cm4cmkylvdzqv.R.inc(5650);try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5649);
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    /**
     * Constructs a new instance for the given Path and buffer size.
     *
     * @param path The path to stream.
     * @param bufferSizeInBytes buffer size.
     * @throws IOException If an I/O error occurs
     */
    public BufferedFileChannelInputStream(final Path path, final int bufferSizeInBytes) throws IOException {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5651);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5652);Objects.requireNonNull(path, "path");
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5653);fileChannel = FileChannel.open(path, StandardOpenOption.READ);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5654);byteBuffer = ByteBuffer.allocateDirect(bufferSizeInBytes);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5655);byteBuffer.flip();
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    @Override
    public synchronized int available() throws IOException {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5656);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5657);return byteBuffer.remaining();
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    /**
     * Attempts to clean up a ByteBuffer if it is direct or memory-mapped. This uses an *unsafe* Sun API that will cause
     * errors if one attempts to read from the disposed buffer. However, neither the bytes allocated to direct buffers
     * nor file descriptors opened for memory-mapped buffers put pressure on the garbage collector. Waiting for garbage
     * collection may lead to the depletion of off-heap memory or huge numbers of open files. There's unfortunately no
     * standard API to manually dispose of these kinds of buffers.
     *
     * @param buffer the buffer to clean.
     */
    private void clean(final ByteBuffer buffer) {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5658);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5659);if ((((isDirectBuffer(buffer))&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5660)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5661)==0&false))) {{
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5662);cleanDirectBuffer(buffer);
        }
    }}finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    /**
     * In Java 8, the type of DirectBuffer.cleaner() was sun.misc.Cleaner, and it was possible to access the method
     * sun.misc.Cleaner.clean() to invoke it. The type changed to jdk.internal.ref.Cleaner in later JDKs, and the
     * .clean() method is not accessible even with reflection. However sun.misc.Unsafe added a invokeCleaner() method in
     * JDK 9+ and this is still accessible with reflection.
     *
     * @param buffer the buffer to clean. must be a DirectBuffer.
     */
    private void cleanDirectBuffer(final ByteBuffer buffer) {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5663);
        //
        // Ported from StorageUtils.scala.
        //
//      private val bufferCleaner: DirectBuffer => Unit =
//      if (SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_9)) {
//        val cleanerMethod =
//          Utils.classForName("sun.misc.Unsafe").getMethod("invokeCleaner", classOf[ByteBuffer])
//        val unsafeField = classOf[Unsafe].getDeclaredField("theUnsafe")
//        unsafeField.setAccessible(true)
//        val unsafe = unsafeField.get(null).asInstanceOf[Unsafe]
//        buffer: DirectBuffer => cleanerMethod.invoke(unsafe, buffer)
//      } else {
//        val cleanerMethod = Utils.classForName("sun.misc.Cleaner").getMethod("clean")
//        buffer: DirectBuffer => {
//          // Careful to avoid the return type of .cleaner(), which changes with JDK
//          val cleaner: AnyRef = buffer.cleaner()
//          if (cleaner != null) {
//            cleanerMethod.invoke(cleaner)
//          }
//        }
//      }
        //
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5664);final String specVer = System.getProperty("java.specification.version");
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5665);if (((("1.8".equals(specVer))&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5666)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5667)==0&false))) {{
            // On Java 8, but also compiles on Java 11.
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5668);try {
              __CLR4_4_14cm4cmkylvdzqv.R.inc(5669);final Class<?> clsCleaner = Class.forName("sun.misc.Cleaner");
              __CLR4_4_14cm4cmkylvdzqv.R.inc(5670);final Method cleanerMethod = DIRECT_BUFFER_CLASS.getMethod("cleaner");
              __CLR4_4_14cm4cmkylvdzqv.R.inc(5671);final Object cleaner = cleanerMethod.invoke(buffer);
              __CLR4_4_14cm4cmkylvdzqv.R.inc(5672);if ((((cleaner != null)&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5673)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5674)==0&false))) {{
                  __CLR4_4_14cm4cmkylvdzqv.R.inc(5675);final Method cleanMethod = clsCleaner.getMethod("clean");
                  __CLR4_4_14cm4cmkylvdzqv.R.inc(5676);cleanMethod.invoke(cleaner);
              }
            }} catch (final ReflectiveOperationException e) {
                __CLR4_4_14cm4cmkylvdzqv.R.inc(5677);throw new IllegalStateException(e);
            }
        } }else {{
            // On Java 9 and up, but compiles on Java 8.
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5678);try {
                __CLR4_4_14cm4cmkylvdzqv.R.inc(5679);final Class<?> clsUnsafe = Class.forName("sun.misc.Unsafe");
                __CLR4_4_14cm4cmkylvdzqv.R.inc(5680);final Method cleanerMethod = clsUnsafe.getMethod("invokeCleaner", ByteBuffer.class);
                __CLR4_4_14cm4cmkylvdzqv.R.inc(5681);final Field unsafeField = clsUnsafe.getDeclaredField("theUnsafe");
                __CLR4_4_14cm4cmkylvdzqv.R.inc(5682);unsafeField.setAccessible(true);
                __CLR4_4_14cm4cmkylvdzqv.R.inc(5683);cleanerMethod.invoke(unsafeField.get(null), buffer);
            } catch (final ReflectiveOperationException e) {
                __CLR4_4_14cm4cmkylvdzqv.R.inc(5684);throw new IllegalStateException(e);
            }
        }
    }}finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    @Override
    public synchronized void close() throws IOException {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5685);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5686);try {
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5687);fileChannel.close();
        } finally {
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5688);clean(byteBuffer);
        }
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    @Override
    public synchronized int read() throws IOException {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5689);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5690);if ((((!refill())&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5691)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5692)==0&false))) {{
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5693);return EOF;
        }
        }__CLR4_4_14cm4cmkylvdzqv.R.inc(5694);return byteBuffer.get() & 0xFF;
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    @Override
    public synchronized int read(final byte[] b, final int offset, int len) throws IOException {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5695);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5696);if ((((offset < 0 || len < 0 || offset + len < 0 || offset + len > b.length)&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5697)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5698)==0&false))) {{
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5699);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_14cm4cmkylvdzqv.R.inc(5700);if ((((!refill())&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5701)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5702)==0&false))) {{
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5703);return EOF;
        }
        }__CLR4_4_14cm4cmkylvdzqv.R.inc(5704);len = Math.min(len, byteBuffer.remaining());
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5705);byteBuffer.get(b, offset, len);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5706);return len;
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    /**
     * Checks whether data is left to be read from the input stream.
     *
     * @return true if data is left, false otherwise
     */
    private boolean refill() throws IOException {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5707);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5708);if ((((!byteBuffer.hasRemaining())&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5709)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5710)==0&false))) {{
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5711);byteBuffer.clear();
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5712);int nRead = 0;
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5713);while ((((nRead == 0)&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5714)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5715)==0&false))) {{
                __CLR4_4_14cm4cmkylvdzqv.R.inc(5716);nRead = fileChannel.read(byteBuffer);
            }
            }__CLR4_4_14cm4cmkylvdzqv.R.inc(5717);byteBuffer.flip();
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5718);return nRead >= 0;
        }
        }__CLR4_4_14cm4cmkylvdzqv.R.inc(5719);return true;
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    @Override
    public synchronized long skip(final long n) throws IOException {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5720);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5721);if ((((n <= 0L)&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5722)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5723)==0&false))) {{
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5724);return 0L;
        }
        }__CLR4_4_14cm4cmkylvdzqv.R.inc(5725);if ((((byteBuffer.remaining() >= n)&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5726)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5727)==0&false))) {{
            // The buffered content is enough to skip
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5728);byteBuffer.position(byteBuffer.position() + (int) n);
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5729);return n;
        }
        }__CLR4_4_14cm4cmkylvdzqv.R.inc(5730);final long skippedFromBuffer = byteBuffer.remaining();
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5731);final long toSkipFromFileChannel = n - skippedFromBuffer;
        // Discard everything we have read in the buffer.
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5732);byteBuffer.position(0);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5733);byteBuffer.flip();
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5734);return skippedFromBuffer + skipFromFileChannel(toSkipFromFileChannel);
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

    private long skipFromFileChannel(final long n) throws IOException {try{__CLR4_4_14cm4cmkylvdzqv.R.inc(5735);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5736);final long currentFilePosition = fileChannel.position();
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5737);final long size = fileChannel.size();
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5738);if ((((n > size - currentFilePosition)&&(__CLR4_4_14cm4cmkylvdzqv.R.iget(5739)!=0|true))||(__CLR4_4_14cm4cmkylvdzqv.R.iget(5740)==0&false))) {{
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5741);fileChannel.position(size);
            __CLR4_4_14cm4cmkylvdzqv.R.inc(5742);return size - currentFilePosition;
        }
        }__CLR4_4_14cm4cmkylvdzqv.R.inc(5743);fileChannel.position(currentFilePosition + n);
        __CLR4_4_14cm4cmkylvdzqv.R.inc(5744);return n;
    }finally{__CLR4_4_14cm4cmkylvdzqv.R.flushNeeded();}}

}
