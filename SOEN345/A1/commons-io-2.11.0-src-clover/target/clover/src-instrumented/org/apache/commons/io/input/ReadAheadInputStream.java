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

// import javax.annotation.concurrent.GuardedBy;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Implements {@link InputStream} to asynchronously read ahead from an underlying input stream when a specified amount
 * of data has been read from the current buffer. It does so by maintaining two buffers: an active buffer and a read
 * ahead buffer. The active buffer contains data which should be returned when a read() call is issued. The read ahead
 * buffer is used to asynchronously read from the underlying input stream. When the current active buffer is exhausted,
 * we flip the two buffers so that we can start reading from the read ahead buffer without being blocked by disk I/O.
 * <p>
 * This class was ported and adapted from Apache Spark commit 933dc6cb7b3de1d8ccaf73d124d6eb95b947ed19.
 * </p>
 *
 * @since 2.9.0
 */
public class ReadAheadInputStream extends InputStream {public static class __CLR4_4_1531531kylvdzxb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,6837,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final ThreadLocal<byte[]> oneByte = ThreadLocal.withInitial(() -> new byte[1]);

    /**
     * Creates a new daemon executor service.
     *
     * @return a new daemon executor service.
     */
    private static ExecutorService newExecutorService() {try{__CLR4_4_1531531kylvdzxb.R.inc(6589);
        __CLR4_4_1531531kylvdzxb.R.inc(6590);return Executors.newSingleThreadExecutor(ReadAheadInputStream::newThread);
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    /**
     * Creates a new daemon thread.
     *
     * @param r the thread's runnable.
     * @return a new daemon thread.
     */
    private static Thread newThread(final Runnable r) {try{__CLR4_4_1531531kylvdzxb.R.inc(6591);
        __CLR4_4_1531531kylvdzxb.R.inc(6592);final Thread thread = new Thread(r, "commons-io-read-ahead");
        __CLR4_4_1531531kylvdzxb.R.inc(6593);thread.setDaemon(true);
        __CLR4_4_1531531kylvdzxb.R.inc(6594);return thread;
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    private final ReentrantLock stateChangeLock = new ReentrantLock();

    // @GuardedBy("stateChangeLock")
    private ByteBuffer activeBuffer;

    // @GuardedBy("stateChangeLock")
    private ByteBuffer readAheadBuffer;

    // @GuardedBy("stateChangeLock")
    private boolean endOfStream;

    // @GuardedBy("stateChangeLock")
    // true if async read is in progress
    private boolean readInProgress;

    // @GuardedBy("stateChangeLock")
    // true if read is aborted due to an exception in reading from underlying input stream.
    private boolean readAborted;

    // @GuardedBy("stateChangeLock")
    private Throwable readException;

    // @GuardedBy("stateChangeLock")
    // whether the close method is called.
    private boolean isClosed;

    // @GuardedBy("stateChangeLock")
    // true when the close method will close the underlying input stream. This is valid only if
    // `isClosed` is true.
    private boolean isUnderlyingInputStreamBeingClosed;

    // @GuardedBy("stateChangeLock")
    // whether there is a read ahead task running,
    private boolean isReading;

    // Whether there is a reader waiting for data.
    private final AtomicBoolean isWaiting = new AtomicBoolean(false);

    private final InputStream underlyingInputStream;

    private final ExecutorService executorService;

    private final boolean shutdownExecutorService;

    private final Condition asyncReadComplete = stateChangeLock.newCondition();

    /**
     * Creates an instance with the specified buffer size and read-ahead threshold
     *
     * @param inputStream The underlying input stream.
     * @param bufferSizeInBytes The buffer size.
     */
    public ReadAheadInputStream(final InputStream inputStream, final int bufferSizeInBytes) {
        this(inputStream, bufferSizeInBytes, newExecutorService(), true);__CLR4_4_1531531kylvdzxb.R.inc(6596);try{__CLR4_4_1531531kylvdzxb.R.inc(6595);
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    /**
     * Creates an instance with the specified buffer size and read-ahead threshold
     *
     * @param inputStream The underlying input stream.
     * @param bufferSizeInBytes The buffer size.
     * @param executorService An executor service for the read-ahead thread.
     */
    public ReadAheadInputStream(final InputStream inputStream, final int bufferSizeInBytes,
        final ExecutorService executorService) {
        this(inputStream, bufferSizeInBytes, executorService, false);__CLR4_4_1531531kylvdzxb.R.inc(6598);try{__CLR4_4_1531531kylvdzxb.R.inc(6597);
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    /**
     * Creates an instance with the specified buffer size and read-ahead threshold
     *
     * @param inputStream The underlying input stream.
     * @param bufferSizeInBytes The buffer size.
     * @param executorService An executor service for the read-ahead thread.
     * @param shutdownExecutorService Whether or not to shutdown the given ExecutorService on close.
     */
    private ReadAheadInputStream(final InputStream inputStream, final int bufferSizeInBytes,
        final ExecutorService executorService, final boolean shutdownExecutorService) {try{__CLR4_4_1531531kylvdzxb.R.inc(6599);
        __CLR4_4_1531531kylvdzxb.R.inc(6600);if ((((bufferSizeInBytes <= 0)&&(__CLR4_4_1531531kylvdzxb.R.iget(6601)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6602)==0&false))) {{
            __CLR4_4_1531531kylvdzxb.R.inc(6603);throw new IllegalArgumentException(
                "bufferSizeInBytes should be greater than 0, but the value is " + bufferSizeInBytes);
        }
        }__CLR4_4_1531531kylvdzxb.R.inc(6604);this.executorService = Objects.requireNonNull(executorService, "executorService");
        __CLR4_4_1531531kylvdzxb.R.inc(6605);this.underlyingInputStream = Objects.requireNonNull(inputStream, "inputStream");
        __CLR4_4_1531531kylvdzxb.R.inc(6606);this.shutdownExecutorService = shutdownExecutorService;
        __CLR4_4_1531531kylvdzxb.R.inc(6607);this.activeBuffer = ByteBuffer.allocate(bufferSizeInBytes);
        __CLR4_4_1531531kylvdzxb.R.inc(6608);this.readAheadBuffer = ByteBuffer.allocate(bufferSizeInBytes);
        __CLR4_4_1531531kylvdzxb.R.inc(6609);this.activeBuffer.flip();
        __CLR4_4_1531531kylvdzxb.R.inc(6610);this.readAheadBuffer.flip();
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    @Override
    public int available() throws IOException {try{__CLR4_4_1531531kylvdzxb.R.inc(6611);
        __CLR4_4_1531531kylvdzxb.R.inc(6612);stateChangeLock.lock();
        // Make sure we have no integer overflow.
        __CLR4_4_1531531kylvdzxb.R.inc(6613);try {
            __CLR4_4_1531531kylvdzxb.R.inc(6614);return (int) Math.min(Integer.MAX_VALUE, (long) activeBuffer.remaining() + readAheadBuffer.remaining());
        } finally {
            __CLR4_4_1531531kylvdzxb.R.inc(6615);stateChangeLock.unlock();
        }
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    private void checkReadException() throws IOException {try{__CLR4_4_1531531kylvdzxb.R.inc(6616);
        __CLR4_4_1531531kylvdzxb.R.inc(6617);if ((((readAborted)&&(__CLR4_4_1531531kylvdzxb.R.iget(6618)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6619)==0&false))) {{
            __CLR4_4_1531531kylvdzxb.R.inc(6620);if ((((readException instanceof IOException)&&(__CLR4_4_1531531kylvdzxb.R.iget(6621)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6622)==0&false))) {{
                __CLR4_4_1531531kylvdzxb.R.inc(6623);throw (IOException) readException;
            }
            }__CLR4_4_1531531kylvdzxb.R.inc(6624);throw new IOException(readException);
        }
    }}finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_4_1531531kylvdzxb.R.inc(6625);
        __CLR4_4_1531531kylvdzxb.R.inc(6626);boolean isSafeToCloseUnderlyingInputStream = false;
        __CLR4_4_1531531kylvdzxb.R.inc(6627);stateChangeLock.lock();
        __CLR4_4_1531531kylvdzxb.R.inc(6628);try {
            __CLR4_4_1531531kylvdzxb.R.inc(6629);if ((((isClosed)&&(__CLR4_4_1531531kylvdzxb.R.iget(6630)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6631)==0&false))) {{
                __CLR4_4_1531531kylvdzxb.R.inc(6632);return;
            }
            }__CLR4_4_1531531kylvdzxb.R.inc(6633);isClosed = true;
            __CLR4_4_1531531kylvdzxb.R.inc(6634);if ((((!isReading)&&(__CLR4_4_1531531kylvdzxb.R.iget(6635)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6636)==0&false))) {{
                // Nobody is reading, so we can close the underlying input stream in this method.
                __CLR4_4_1531531kylvdzxb.R.inc(6637);isSafeToCloseUnderlyingInputStream = true;
                // Flip this to make sure the read ahead task will not close the underlying input stream.
                __CLR4_4_1531531kylvdzxb.R.inc(6638);isUnderlyingInputStreamBeingClosed = true;
            }
        }} finally {
            __CLR4_4_1531531kylvdzxb.R.inc(6639);stateChangeLock.unlock();
        }

        __CLR4_4_1531531kylvdzxb.R.inc(6640);if ((((shutdownExecutorService)&&(__CLR4_4_1531531kylvdzxb.R.iget(6641)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6642)==0&false))) {{
            __CLR4_4_1531531kylvdzxb.R.inc(6643);try {
                __CLR4_4_1531531kylvdzxb.R.inc(6644);executorService.shutdownNow();
                __CLR4_4_1531531kylvdzxb.R.inc(6645);executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
            } catch (final InterruptedException e) {
                __CLR4_4_1531531kylvdzxb.R.inc(6646);final InterruptedIOException iio = new InterruptedIOException(e.getMessage());
                __CLR4_4_1531531kylvdzxb.R.inc(6647);iio.initCause(e);
                __CLR4_4_1531531kylvdzxb.R.inc(6648);throw iio;
            } finally {
                __CLR4_4_1531531kylvdzxb.R.inc(6649);if ((((isSafeToCloseUnderlyingInputStream)&&(__CLR4_4_1531531kylvdzxb.R.iget(6650)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6651)==0&false))) {{
                    __CLR4_4_1531531kylvdzxb.R.inc(6652);underlyingInputStream.close();
                }
            }}
        }
    }}finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    private void closeUnderlyingInputStreamIfNecessary() {try{__CLR4_4_1531531kylvdzxb.R.inc(6653);
        __CLR4_4_1531531kylvdzxb.R.inc(6654);boolean needToCloseUnderlyingInputStream = false;
        __CLR4_4_1531531kylvdzxb.R.inc(6655);stateChangeLock.lock();
        __CLR4_4_1531531kylvdzxb.R.inc(6656);try {
            __CLR4_4_1531531kylvdzxb.R.inc(6657);isReading = false;
            __CLR4_4_1531531kylvdzxb.R.inc(6658);if ((((isClosed && !isUnderlyingInputStreamBeingClosed)&&(__CLR4_4_1531531kylvdzxb.R.iget(6659)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6660)==0&false))) {{
                // close method cannot close underlyingInputStream because we were reading.
                __CLR4_4_1531531kylvdzxb.R.inc(6661);needToCloseUnderlyingInputStream = true;
            }
        }} finally {
            __CLR4_4_1531531kylvdzxb.R.inc(6662);stateChangeLock.unlock();
        }
        __CLR4_4_1531531kylvdzxb.R.inc(6663);if ((((needToCloseUnderlyingInputStream)&&(__CLR4_4_1531531kylvdzxb.R.iget(6664)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6665)==0&false))) {{
            __CLR4_4_1531531kylvdzxb.R.inc(6666);try {
                __CLR4_4_1531531kylvdzxb.R.inc(6667);underlyingInputStream.close();
            } catch (final IOException e) {
                // TODO ?
            }
        }
    }}finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    private boolean isEndOfStream() {try{__CLR4_4_1531531kylvdzxb.R.inc(6668);
        __CLR4_4_1531531kylvdzxb.R.inc(6669);return !activeBuffer.hasRemaining() && !readAheadBuffer.hasRemaining() && endOfStream;
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    @Override
    public int read() throws IOException {try{__CLR4_4_1531531kylvdzxb.R.inc(6670);
        __CLR4_4_1531531kylvdzxb.R.inc(6671);if ((((activeBuffer.hasRemaining())&&(__CLR4_4_1531531kylvdzxb.R.iget(6672)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6673)==0&false))) {{
            // short path - just get one byte.
            __CLR4_4_1531531kylvdzxb.R.inc(6674);return activeBuffer.get() & 0xFF;
        }
        }__CLR4_4_1531531kylvdzxb.R.inc(6675);final byte[] oneByteArray = oneByte.get();
        __CLR4_4_1531531kylvdzxb.R.inc(6676);return (((read(oneByteArray, 0, 1) == EOF )&&(__CLR4_4_1531531kylvdzxb.R.iget(6677)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6678)==0&false))? -1 : oneByteArray[0] & 0xFF;
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    @Override
    public int read(final byte[] b, final int offset, int len) throws IOException {try{__CLR4_4_1531531kylvdzxb.R.inc(6679);
        __CLR4_4_1531531kylvdzxb.R.inc(6680);if ((((offset < 0 || len < 0 || len > b.length - offset)&&(__CLR4_4_1531531kylvdzxb.R.iget(6681)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6682)==0&false))) {{
            __CLR4_4_1531531kylvdzxb.R.inc(6683);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_1531531kylvdzxb.R.inc(6684);if ((((len == 0)&&(__CLR4_4_1531531kylvdzxb.R.iget(6685)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6686)==0&false))) {{
            __CLR4_4_1531531kylvdzxb.R.inc(6687);return 0;
        }

        }__CLR4_4_1531531kylvdzxb.R.inc(6688);if ((((!activeBuffer.hasRemaining())&&(__CLR4_4_1531531kylvdzxb.R.iget(6689)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6690)==0&false))) {{
            // No remaining in active buffer - lock and switch to write ahead buffer.
            __CLR4_4_1531531kylvdzxb.R.inc(6691);stateChangeLock.lock();
            __CLR4_4_1531531kylvdzxb.R.inc(6692);try {
                __CLR4_4_1531531kylvdzxb.R.inc(6693);waitForAsyncReadComplete();
                __CLR4_4_1531531kylvdzxb.R.inc(6694);if ((((!readAheadBuffer.hasRemaining())&&(__CLR4_4_1531531kylvdzxb.R.iget(6695)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6696)==0&false))) {{
                    // The first read.
                    __CLR4_4_1531531kylvdzxb.R.inc(6697);readAsync();
                    __CLR4_4_1531531kylvdzxb.R.inc(6698);waitForAsyncReadComplete();
                    __CLR4_4_1531531kylvdzxb.R.inc(6699);if ((((isEndOfStream())&&(__CLR4_4_1531531kylvdzxb.R.iget(6700)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6701)==0&false))) {{
                        __CLR4_4_1531531kylvdzxb.R.inc(6702);return EOF;
                    }
                }}
                // Swap the newly read read ahead buffer in place of empty active buffer.
                }__CLR4_4_1531531kylvdzxb.R.inc(6703);swapBuffers();
                // After swapping buffers, trigger another async read for read ahead buffer.
                __CLR4_4_1531531kylvdzxb.R.inc(6704);readAsync();
            } finally {
                __CLR4_4_1531531kylvdzxb.R.inc(6705);stateChangeLock.unlock();
            }
        }
        }__CLR4_4_1531531kylvdzxb.R.inc(6706);len = Math.min(len, activeBuffer.remaining());
        __CLR4_4_1531531kylvdzxb.R.inc(6707);activeBuffer.get(b, offset, len);

        __CLR4_4_1531531kylvdzxb.R.inc(6708);return len;
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    /** Read data from underlyingInputStream to readAheadBuffer asynchronously. */
    private void readAsync() throws IOException {try{__CLR4_4_1531531kylvdzxb.R.inc(6709);
        __CLR4_4_1531531kylvdzxb.R.inc(6710);stateChangeLock.lock();
        __CLR4_4_1531531kylvdzxb.R.inc(6711);final byte[] arr;
        __CLR4_4_1531531kylvdzxb.R.inc(6712);try {
            __CLR4_4_1531531kylvdzxb.R.inc(6713);arr = readAheadBuffer.array();
            __CLR4_4_1531531kylvdzxb.R.inc(6714);if ((((endOfStream || readInProgress)&&(__CLR4_4_1531531kylvdzxb.R.iget(6715)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6716)==0&false))) {{
                __CLR4_4_1531531kylvdzxb.R.inc(6717);return;
            }
            }__CLR4_4_1531531kylvdzxb.R.inc(6718);checkReadException();
            __CLR4_4_1531531kylvdzxb.R.inc(6719);readAheadBuffer.position(0);
            __CLR4_4_1531531kylvdzxb.R.inc(6720);readAheadBuffer.flip();
            __CLR4_4_1531531kylvdzxb.R.inc(6721);readInProgress = true;
        } finally {
            __CLR4_4_1531531kylvdzxb.R.inc(6722);stateChangeLock.unlock();
        }
        __CLR4_4_1531531kylvdzxb.R.inc(6723);executorService.execute(() -> {
            __CLR4_4_1531531kylvdzxb.R.inc(6724);stateChangeLock.lock();
            __CLR4_4_1531531kylvdzxb.R.inc(6725);try {
                __CLR4_4_1531531kylvdzxb.R.inc(6726);if ((((isClosed)&&(__CLR4_4_1531531kylvdzxb.R.iget(6727)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6728)==0&false))) {{
                    __CLR4_4_1531531kylvdzxb.R.inc(6729);readInProgress = false;
                    __CLR4_4_1531531kylvdzxb.R.inc(6730);return;
                }
                // Flip this so that the close method will not close the underlying input stream when we
                // are reading.
                }__CLR4_4_1531531kylvdzxb.R.inc(6731);isReading = true;
            } finally {
                __CLR4_4_1531531kylvdzxb.R.inc(6732);stateChangeLock.unlock();
            }

            // Please note that it is safe to release the lock and read into the read ahead buffer
            // because either of following two conditions will hold:
            //
            // 1. The active buffer has data available to read so the reader will not read from the read ahead buffer.
            //
            // 2. This is the first time read is called or the active buffer is exhausted, in that case the reader waits
            // for this async read to complete.
            //
            // So there is no race condition in both the situations.
            __CLR4_4_1531531kylvdzxb.R.inc(6733);int read = 0;
            __CLR4_4_1531531kylvdzxb.R.inc(6734);int off = 0, len = arr.length;
            __CLR4_4_1531531kylvdzxb.R.inc(6735);Throwable exception = null;
            __CLR4_4_1531531kylvdzxb.R.inc(6736);try {
                // try to fill the read ahead buffer.
                // if a reader is waiting, possibly return early.
                __CLR4_4_1531531kylvdzxb.R.inc(6737);do {{
                    __CLR4_4_1531531kylvdzxb.R.inc(6738);read = underlyingInputStream.read(arr, off, len);
                    __CLR4_4_1531531kylvdzxb.R.inc(6739);if ((((read <= 0)&&(__CLR4_4_1531531kylvdzxb.R.iget(6740)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6741)==0&false))) {{
                        __CLR4_4_1531531kylvdzxb.R.inc(6742);break;
                    }
                    }__CLR4_4_1531531kylvdzxb.R.inc(6743);off += read;
                    __CLR4_4_1531531kylvdzxb.R.inc(6744);len -= read;
                } }while ((((len > 0 && !isWaiting.get())&&(__CLR4_4_1531531kylvdzxb.R.iget(6745)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6746)==0&false)));
            } catch (final Throwable ex) {
                __CLR4_4_1531531kylvdzxb.R.inc(6747);exception = ex;
                __CLR4_4_1531531kylvdzxb.R.inc(6748);if ((((ex instanceof Error)&&(__CLR4_4_1531531kylvdzxb.R.iget(6749)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6750)==0&false))) {{
                    // `readException` may not be reported to the user. Rethrow Error to make sure at least
                    // The user can see Error in UncaughtExceptionHandler.
                    __CLR4_4_1531531kylvdzxb.R.inc(6751);throw (Error) ex;
                }
            }} finally {
                __CLR4_4_1531531kylvdzxb.R.inc(6752);stateChangeLock.lock();
                __CLR4_4_1531531kylvdzxb.R.inc(6753);try {
                    __CLR4_4_1531531kylvdzxb.R.inc(6754);readAheadBuffer.limit(off);
                    __CLR4_4_1531531kylvdzxb.R.inc(6755);if ((((read < 0 || (exception instanceof EOFException))&&(__CLR4_4_1531531kylvdzxb.R.iget(6756)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6757)==0&false))) {{
                        __CLR4_4_1531531kylvdzxb.R.inc(6758);endOfStream = true;
                    } }else {__CLR4_4_1531531kylvdzxb.R.inc(6759);if ((((exception != null)&&(__CLR4_4_1531531kylvdzxb.R.iget(6760)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6761)==0&false))) {{
                        __CLR4_4_1531531kylvdzxb.R.inc(6762);readAborted = true;
                        __CLR4_4_1531531kylvdzxb.R.inc(6763);readException = exception;
                    }
                    }}__CLR4_4_1531531kylvdzxb.R.inc(6764);readInProgress = false;
                    __CLR4_4_1531531kylvdzxb.R.inc(6765);signalAsyncReadComplete();
                } finally {
                    __CLR4_4_1531531kylvdzxb.R.inc(6766);stateChangeLock.unlock();
                }
                __CLR4_4_1531531kylvdzxb.R.inc(6767);closeUnderlyingInputStreamIfNecessary();
            }
        });
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    private void signalAsyncReadComplete() {try{__CLR4_4_1531531kylvdzxb.R.inc(6768);
        __CLR4_4_1531531kylvdzxb.R.inc(6769);stateChangeLock.lock();
        __CLR4_4_1531531kylvdzxb.R.inc(6770);try {
            __CLR4_4_1531531kylvdzxb.R.inc(6771);asyncReadComplete.signalAll();
        } finally {
            __CLR4_4_1531531kylvdzxb.R.inc(6772);stateChangeLock.unlock();
        }
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    @Override
    public long skip(final long n) throws IOException {try{__CLR4_4_1531531kylvdzxb.R.inc(6773);
        __CLR4_4_1531531kylvdzxb.R.inc(6774);if ((((n <= 0L)&&(__CLR4_4_1531531kylvdzxb.R.iget(6775)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6776)==0&false))) {{
            __CLR4_4_1531531kylvdzxb.R.inc(6777);return 0L;
        }
        }__CLR4_4_1531531kylvdzxb.R.inc(6778);if ((((n <= activeBuffer.remaining())&&(__CLR4_4_1531531kylvdzxb.R.iget(6779)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6780)==0&false))) {{
            // Only skipping from active buffer is sufficient
            __CLR4_4_1531531kylvdzxb.R.inc(6781);activeBuffer.position((int) n + activeBuffer.position());
            __CLR4_4_1531531kylvdzxb.R.inc(6782);return n;
        }
        }__CLR4_4_1531531kylvdzxb.R.inc(6783);stateChangeLock.lock();
        __CLR4_4_1531531kylvdzxb.R.inc(6784);long skipped;
        __CLR4_4_1531531kylvdzxb.R.inc(6785);try {
            __CLR4_4_1531531kylvdzxb.R.inc(6786);skipped = skipInternal(n);
        } finally {
            __CLR4_4_1531531kylvdzxb.R.inc(6787);stateChangeLock.unlock();
        }
        __CLR4_4_1531531kylvdzxb.R.inc(6788);return skipped;
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    /**
     * Internal skip function which should be called only from skip(). The assumption is that the stateChangeLock is
     * already acquired in the caller before calling this function.
     *
     * @param n the number of bytes to be skipped.
     * @return the actual number of bytes skipped.
     */
    private long skipInternal(final long n) throws IOException {try{__CLR4_4_1531531kylvdzxb.R.inc(6789);
        assert (((stateChangeLock.isLocked())&&(__CLR4_4_1531531kylvdzxb.R.iget(6790)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6791)==0&false));
        __CLR4_4_1531531kylvdzxb.R.inc(6792);waitForAsyncReadComplete();
        __CLR4_4_1531531kylvdzxb.R.inc(6793);if ((((isEndOfStream())&&(__CLR4_4_1531531kylvdzxb.R.iget(6794)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6795)==0&false))) {{
            __CLR4_4_1531531kylvdzxb.R.inc(6796);return 0;
        }
        }__CLR4_4_1531531kylvdzxb.R.inc(6797);if ((((available() >= n)&&(__CLR4_4_1531531kylvdzxb.R.iget(6798)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6799)==0&false))) {{
            // we can skip from the internal buffers
            __CLR4_4_1531531kylvdzxb.R.inc(6800);int toSkip = (int) n;
            // We need to skip from both active buffer and read ahead buffer
            __CLR4_4_1531531kylvdzxb.R.inc(6801);toSkip -= activeBuffer.remaining();
            assert (((toSkip > 0)&&(__CLR4_4_1531531kylvdzxb.R.iget(6802)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6803)==0&false)); // skipping from activeBuffer already handled.
            __CLR4_4_1531531kylvdzxb.R.inc(6804);activeBuffer.position(0);
            __CLR4_4_1531531kylvdzxb.R.inc(6805);activeBuffer.flip();
            __CLR4_4_1531531kylvdzxb.R.inc(6806);readAheadBuffer.position(toSkip + readAheadBuffer.position());
            __CLR4_4_1531531kylvdzxb.R.inc(6807);swapBuffers();
            // Trigger async read to emptied read ahead buffer.
            __CLR4_4_1531531kylvdzxb.R.inc(6808);readAsync();
            __CLR4_4_1531531kylvdzxb.R.inc(6809);return n;
        }
        }__CLR4_4_1531531kylvdzxb.R.inc(6810);final int skippedBytes = available();
        __CLR4_4_1531531kylvdzxb.R.inc(6811);final long toSkip = n - skippedBytes;
        __CLR4_4_1531531kylvdzxb.R.inc(6812);activeBuffer.position(0);
        __CLR4_4_1531531kylvdzxb.R.inc(6813);activeBuffer.flip();
        __CLR4_4_1531531kylvdzxb.R.inc(6814);readAheadBuffer.position(0);
        __CLR4_4_1531531kylvdzxb.R.inc(6815);readAheadBuffer.flip();
        __CLR4_4_1531531kylvdzxb.R.inc(6816);final long skippedFromInputStream = underlyingInputStream.skip(toSkip);
        __CLR4_4_1531531kylvdzxb.R.inc(6817);readAsync();
        __CLR4_4_1531531kylvdzxb.R.inc(6818);return skippedBytes + skippedFromInputStream;
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    /**
     * Flips the active and read ahead buffer
     */
    private void swapBuffers() {try{__CLR4_4_1531531kylvdzxb.R.inc(6819);
        __CLR4_4_1531531kylvdzxb.R.inc(6820);final ByteBuffer temp = activeBuffer;
        __CLR4_4_1531531kylvdzxb.R.inc(6821);activeBuffer = readAheadBuffer;
        __CLR4_4_1531531kylvdzxb.R.inc(6822);readAheadBuffer = temp;
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}

    private void waitForAsyncReadComplete() throws IOException {try{__CLR4_4_1531531kylvdzxb.R.inc(6823);
        __CLR4_4_1531531kylvdzxb.R.inc(6824);stateChangeLock.lock();
        __CLR4_4_1531531kylvdzxb.R.inc(6825);try {
            __CLR4_4_1531531kylvdzxb.R.inc(6826);isWaiting.set(true);
            // There is only one reader, and one writer, so the writer should signal only once,
            // but a while loop checking the wake up condition is still needed to avoid spurious wakeups.
            __CLR4_4_1531531kylvdzxb.R.inc(6827);while ((((readInProgress)&&(__CLR4_4_1531531kylvdzxb.R.iget(6828)!=0|true))||(__CLR4_4_1531531kylvdzxb.R.iget(6829)==0&false))) {{
                __CLR4_4_1531531kylvdzxb.R.inc(6830);asyncReadComplete.await();
            }
        }} catch (final InterruptedException e) {
            __CLR4_4_1531531kylvdzxb.R.inc(6831);final InterruptedIOException iio = new InterruptedIOException(e.getMessage());
            __CLR4_4_1531531kylvdzxb.R.inc(6832);iio.initCause(e);
            __CLR4_4_1531531kylvdzxb.R.inc(6833);throw iio;
        } finally {
            __CLR4_4_1531531kylvdzxb.R.inc(6834);isWaiting.set(false);
            __CLR4_4_1531531kylvdzxb.R.inc(6835);stateChangeLock.unlock();
        }
        __CLR4_4_1531531kylvdzxb.R.inc(6836);checkReadException();
    }finally{__CLR4_4_1531531kylvdzxb.R.flushNeeded();}}
}
