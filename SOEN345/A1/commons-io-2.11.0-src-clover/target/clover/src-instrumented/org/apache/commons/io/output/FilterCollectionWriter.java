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

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.IOExceptionList;
import org.apache.commons.io.IOIndexedException;

/**
 * Abstract class for writing filtered character streams to a {@link Collection} of writers. This is in contrast to
 * {@link FilterWriter} which is backed by a single {@link Writer}.
 * <p>
 * This abstract class provides default methods that pass all requests to the contained writers. Subclasses should
 * likely override some of these methods.
 * </p>
 * <p>
 * The class {@link Writer} defines method signatures with {@code throws} {@link IOException}, which in this class are
 * actually {@link IOExceptionList} containing a list of {@link IOIndexedException}.
 * </p>
 *
 * @since 2.7
 */
public class FilterCollectionWriter extends Writer {public static class __CLR4_4_16xd6xdkylve0ds{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,9147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Empty and immutable collection of writers.
     */
    protected final Collection<Writer> EMPTY_WRITERS = Collections.emptyList();

    /**
     * The underlying writers.
     */
    protected final Collection<Writer> writers;

    /**
     * Creates a new filtered collection writer.
     *
     * @param writers Writers to provide the underlying targets.
     */
    protected FilterCollectionWriter(final Collection<Writer> writers) {try{__CLR4_4_16xd6xdkylve0ds.R.inc(8977);
        __CLR4_4_16xd6xdkylve0ds.R.inc(8978);this.writers = (((writers == null )&&(__CLR4_4_16xd6xdkylve0ds.R.iget(8979)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(8980)==0&false))? EMPTY_WRITERS : writers;
    }finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    /**
     * Creates a new filtered collection writer.
     *
     * @param writers Writers to provide the underlying targets.
     */
    protected FilterCollectionWriter(final Writer... writers) {try{__CLR4_4_16xd6xdkylve0ds.R.inc(8981);
        __CLR4_4_16xd6xdkylve0ds.R.inc(8982);this.writers = (((writers == null )&&(__CLR4_4_16xd6xdkylve0ds.R.iget(8983)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(8984)==0&false))? EMPTY_WRITERS : Arrays.asList(writers);
    }finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    /**
     * Adds an indexed exception to the list.
     *
     * @param causeList The target list.
     * @param i The index.
     * @param e The cause.
     * @return the given list or a new list on null input.
     */
    private List<Exception> add(List<Exception> causeList, final int i, final IOException e) {try{__CLR4_4_16xd6xdkylve0ds.R.inc(8985);
        __CLR4_4_16xd6xdkylve0ds.R.inc(8986);if ((((causeList == null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(8987)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(8988)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(8989);causeList = new ArrayList<>();
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(8990);causeList.add(new IOIndexedException(i, e));
        __CLR4_4_16xd6xdkylve0ds.R.inc(8991);return causeList;
    }finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    @Override
    public Writer append(final char c) throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(8992);
        __CLR4_4_16xd6xdkylve0ds.R.inc(8993);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(8994);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(8995);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(8996);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(8997)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(8998)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(8999);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9000);w.append(c);
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9001);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9002);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9003);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9004)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9005)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9006);throw new IOExceptionList("append", causeList);
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9007);return this;
    }finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    @Override
    public Writer append(final CharSequence csq) throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9008);
        __CLR4_4_16xd6xdkylve0ds.R.inc(9009);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9010);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9011);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9012);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9013)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9014)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(9015);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9016);w.append(csq);
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9017);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9018);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9019);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9020)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9021)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9022);throw new IOExceptionList("append", causeList);
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9023);return this;
    }finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    @Override
    public Writer append(final CharSequence csq, final int start, final int end) throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9024);

        __CLR4_4_16xd6xdkylve0ds.R.inc(9025);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9026);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9027);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9028);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9029)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9030)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(9031);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9032);w.append(csq, start, end);
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9033);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9034);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9035);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9036)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9037)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9038);throw new IOExceptionList("append", causeList);
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9039);return this;
    }finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9040);
        __CLR4_4_16xd6xdkylve0ds.R.inc(9041);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9042);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9043);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9044);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9045)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9046)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(9047);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9048);w.close();
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9049);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9050);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9051);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9052)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9053)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9054);throw new IOExceptionList("close", causeList);
        }

    }}finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    /**
     * Flushes the stream.
     *
     * @exception IOException If an I/O error occurs
     */
    @Override
    public void flush() throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9055);
        __CLR4_4_16xd6xdkylve0ds.R.inc(9056);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9057);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9058);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9059);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9060)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9061)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(9062);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9063);w.flush();
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9064);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9065);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9066);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9067)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9068)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9069);throw new IOExceptionList("flush", causeList);
        }

    }}finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    /**
     * Tests if the given list is empty in a null-safe manner.
     *
     * @param causeList the list to test.
     * @return true if empty or null.
     */
    private boolean notEmpty(final List<Exception> causeList) {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9070);
        __CLR4_4_16xd6xdkylve0ds.R.inc(9071);return causeList != null && !causeList.isEmpty();
    }finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    @Override
    public void write(final char[] cbuf) throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9072);
        __CLR4_4_16xd6xdkylve0ds.R.inc(9073);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9074);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9075);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9076);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9077)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9078)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(9079);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9080);w.write(cbuf);
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9081);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9082);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9083);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9084)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9085)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9086);throw new IOExceptionList("write", causeList);
        }
    }}finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    /**
     * Writes a portion of an array of characters.
     *
     * @param cbuf Buffer of characters to be written
     * @param off  Offset from which to start reading characters
     * @param len  Number of characters to be written
     *
     * @exception IOException If an I/O error occurs
     */
    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9087);
        __CLR4_4_16xd6xdkylve0ds.R.inc(9088);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9089);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9090);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9091);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9092)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9093)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(9094);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9095);w.write(cbuf, off, len);
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9096);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9097);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9098);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9099)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9100)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9101);throw new IOExceptionList("write", causeList);
        }
    }}finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    /**
     * Writes a single character.
     *
     * @exception IOException If an I/O error occurs
     */
    @Override
    public void write(final int c) throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9102);
        __CLR4_4_16xd6xdkylve0ds.R.inc(9103);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9104);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9105);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9106);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9107)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9108)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(9109);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9110);w.write(c);
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9111);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9112);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9113);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9114)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9115)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9116);throw new IOExceptionList("write", causeList);
        }
    }}finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    @Override
    public void write(final String str) throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9117);
        __CLR4_4_16xd6xdkylve0ds.R.inc(9118);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9119);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9120);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9121);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9122)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9123)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(9124);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9125);w.write(str);
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9126);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9127);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9128);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9129)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9130)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9131);throw new IOExceptionList("write", causeList);
        }

    }}finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

    /**
     * Writes a portion of a string.
     *
     * @param str String to be written
     * @param off Offset from which to start reading characters
     * @param len Number of characters to be written
     *
     * @exception IOException If an I/O error occurs
     */
    @Override
    public void write(final String str, final int off, final int len) throws IOException {try{__CLR4_4_16xd6xdkylve0ds.R.inc(9132);
        __CLR4_4_16xd6xdkylve0ds.R.inc(9133);List<Exception> causeList = null;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9134);int i = 0;
        __CLR4_4_16xd6xdkylve0ds.R.inc(9135);for (final Writer w : writers) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9136);if ((((w != null)&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9137)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9138)==0&false))) {{
                __CLR4_4_16xd6xdkylve0ds.R.inc(9139);try {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9140);w.write(str, off, len);
                } catch (final IOException e) {
                    __CLR4_4_16xd6xdkylve0ds.R.inc(9141);causeList = add(causeList, i, e);
                }
            }
            }__CLR4_4_16xd6xdkylve0ds.R.inc(9142);i++;
        }
        }__CLR4_4_16xd6xdkylve0ds.R.inc(9143);if ((((notEmpty(causeList))&&(__CLR4_4_16xd6xdkylve0ds.R.iget(9144)!=0|true))||(__CLR4_4_16xd6xdkylve0ds.R.iget(9145)==0&false))) {{
            __CLR4_4_16xd6xdkylve0ds.R.inc(9146);throw new IOExceptionList("write", causeList);
        }

    }}finally{__CLR4_4_16xd6xdkylve0ds.R.flushNeeded();}}

}
