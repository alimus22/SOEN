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

import static org.apache.commons.io.IOUtils.CR;
import static org.apache.commons.io.IOUtils.EOF;
import static org.apache.commons.io.IOUtils.LF;

import java.io.IOException;
import java.io.InputStream;

/**
 * A filtering input stream that ensures the content will have UNIX-style line endings, LF.
 *
 * @since 2.5
 */
public class UnixLineEndingInputStream extends InputStream {public static class __CLR4_4_15rq5rqkylve029{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616389890L,8589935092L,7527,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean slashNSeen;

    private boolean slashRSeen;

    private boolean eofSeen;

    private final InputStream target;

    private final boolean ensureLineFeedAtEndOfFile;

    /**
     * Creates an input stream that filters another stream
     *
     * @param in                        The input stream to wrap
     * @param ensureLineFeedAtEndOfFile true to ensure that the file ends with LF
     */
    public UnixLineEndingInputStream(final InputStream in, final boolean ensureLineFeedAtEndOfFile) {try{__CLR4_4_15rq5rqkylve029.R.inc(7478);
        __CLR4_4_15rq5rqkylve029.R.inc(7479);this.target = in;
        __CLR4_4_15rq5rqkylve029.R.inc(7480);this.ensureLineFeedAtEndOfFile = ensureLineFeedAtEndOfFile;
    }finally{__CLR4_4_15rq5rqkylve029.R.flushNeeded();}}

    /**
     * Reads the next item from the target, updating internal flags in the process
     * @return the next int read from the target stream
     * @throws IOException upon error
     */
    private int readWithUpdate() throws IOException {try{__CLR4_4_15rq5rqkylve029.R.inc(7481);
        __CLR4_4_15rq5rqkylve029.R.inc(7482);final int target = this.target.read();
        __CLR4_4_15rq5rqkylve029.R.inc(7483);eofSeen = target == EOF;
        __CLR4_4_15rq5rqkylve029.R.inc(7484);if ((((eofSeen)&&(__CLR4_4_15rq5rqkylve029.R.iget(7485)!=0|true))||(__CLR4_4_15rq5rqkylve029.R.iget(7486)==0&false))) {{
            __CLR4_4_15rq5rqkylve029.R.inc(7487);return target;
        }
        }__CLR4_4_15rq5rqkylve029.R.inc(7488);slashNSeen = target == LF;
        __CLR4_4_15rq5rqkylve029.R.inc(7489);slashRSeen = target == CR;
        __CLR4_4_15rq5rqkylve029.R.inc(7490);return target;
    }finally{__CLR4_4_15rq5rqkylve029.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int read() throws IOException {try{__CLR4_4_15rq5rqkylve029.R.inc(7491);
        __CLR4_4_15rq5rqkylve029.R.inc(7492);final boolean previousWasSlashR = slashRSeen;
        __CLR4_4_15rq5rqkylve029.R.inc(7493);if ((((eofSeen)&&(__CLR4_4_15rq5rqkylve029.R.iget(7494)!=0|true))||(__CLR4_4_15rq5rqkylve029.R.iget(7495)==0&false))) {{
            __CLR4_4_15rq5rqkylve029.R.inc(7496);return eofGame(previousWasSlashR);
        }
        }__CLR4_4_15rq5rqkylve029.R.inc(7497);final int target = readWithUpdate();
        __CLR4_4_15rq5rqkylve029.R.inc(7498);if ((((eofSeen)&&(__CLR4_4_15rq5rqkylve029.R.iget(7499)!=0|true))||(__CLR4_4_15rq5rqkylve029.R.iget(7500)==0&false))) {{
            __CLR4_4_15rq5rqkylve029.R.inc(7501);return eofGame(previousWasSlashR);
        }
        }__CLR4_4_15rq5rqkylve029.R.inc(7502);if ((((slashRSeen)&&(__CLR4_4_15rq5rqkylve029.R.iget(7503)!=0|true))||(__CLR4_4_15rq5rqkylve029.R.iget(7504)==0&false))) {{
            __CLR4_4_15rq5rqkylve029.R.inc(7505);return LF;
        }

        }__CLR4_4_15rq5rqkylve029.R.inc(7506);if ((((previousWasSlashR && slashNSeen)&&(__CLR4_4_15rq5rqkylve029.R.iget(7507)!=0|true))||(__CLR4_4_15rq5rqkylve029.R.iget(7508)==0&false))) {{
            __CLR4_4_15rq5rqkylve029.R.inc(7509);return read();
        }

        }__CLR4_4_15rq5rqkylve029.R.inc(7510);return target;
    }finally{__CLR4_4_15rq5rqkylve029.R.flushNeeded();}}

    /**
     * Handles the EOF-handling at the end of the stream
     * @param previousWasSlashR Indicates if the last seen was a \r
     * @return The next char to output to the stream
     */
    private int eofGame(final boolean previousWasSlashR) {try{__CLR4_4_15rq5rqkylve029.R.inc(7511);
        __CLR4_4_15rq5rqkylve029.R.inc(7512);if ((((previousWasSlashR || !ensureLineFeedAtEndOfFile)&&(__CLR4_4_15rq5rqkylve029.R.iget(7513)!=0|true))||(__CLR4_4_15rq5rqkylve029.R.iget(7514)==0&false))) {{
            __CLR4_4_15rq5rqkylve029.R.inc(7515);return EOF;
        }
        }__CLR4_4_15rq5rqkylve029.R.inc(7516);if ((((!slashNSeen)&&(__CLR4_4_15rq5rqkylve029.R.iget(7517)!=0|true))||(__CLR4_4_15rq5rqkylve029.R.iget(7518)==0&false))) {{
            __CLR4_4_15rq5rqkylve029.R.inc(7519);slashNSeen = true;
            __CLR4_4_15rq5rqkylve029.R.inc(7520);return LF;
        }
        }__CLR4_4_15rq5rqkylve029.R.inc(7521);return EOF;
    }finally{__CLR4_4_15rq5rqkylve029.R.flushNeeded();}}

    /**
     * Closes the stream. Also closes the underlying stream.
     * @throws IOException upon error
     */
    @Override
    public void close() throws IOException {try{__CLR4_4_15rq5rqkylve029.R.inc(7522);
        __CLR4_4_15rq5rqkylve029.R.inc(7523);super.close();
        __CLR4_4_15rq5rqkylve029.R.inc(7524);target.close();
    }finally{__CLR4_4_15rq5rqkylve029.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void mark(final int readlimit) {try{__CLR4_4_15rq5rqkylve029.R.inc(7525);
        __CLR4_4_15rq5rqkylve029.R.inc(7526);throw UnsupportedOperationExceptions.mark();
    }finally{__CLR4_4_15rq5rqkylve029.R.flushNeeded();}}
}
