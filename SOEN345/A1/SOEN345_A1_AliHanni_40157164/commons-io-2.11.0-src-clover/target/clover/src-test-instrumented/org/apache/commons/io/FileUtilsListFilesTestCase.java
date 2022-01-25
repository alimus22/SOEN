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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Test cases for FileUtils.listFiles() methods.
 */
public class FileUtilsListFilesTestCase {static class __CLR4_4_195l95lkylve13r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0061\u006c\u0069\u0068\u0061\u006e\u006e\u0069\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0053\u004f\u0045\u004e\u002f\u0053\u004f\u0045\u004e\u0033\u0034\u0035\u002f\u0041\u0031\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0069\u006f\u002d\u0032\u002e\u0031\u0031\u002e\u0030\u002d\u0073\u0072\u0063\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1642616393312L,8589935092L,11976,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @TempDir
    public File temporaryFolder;

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @BeforeEach
    public void setUp() throws Exception {try{__CLR4_4_195l95lkylve13r.R.inc(11865);
        __CLR4_4_195l95lkylve13r.R.inc(11866);File dir = temporaryFolder;
        __CLR4_4_195l95lkylve13r.R.inc(11867);File file = new File(dir, "dummy-build.xml");
        __CLR4_4_195l95lkylve13r.R.inc(11868);FileUtils.touch(file);
        __CLR4_4_195l95lkylve13r.R.inc(11869);file = new File(dir, "README");
        __CLR4_4_195l95lkylve13r.R.inc(11870);FileUtils.touch(file);

        __CLR4_4_195l95lkylve13r.R.inc(11871);dir = new File(dir, "subdir1");
        __CLR4_4_195l95lkylve13r.R.inc(11872);dir.mkdirs();
        __CLR4_4_195l95lkylve13r.R.inc(11873);file = new File(dir, "dummy-build.xml");
        __CLR4_4_195l95lkylve13r.R.inc(11874);FileUtils.touch(file);
        __CLR4_4_195l95lkylve13r.R.inc(11875);file = new File(dir, "dummy-readme.txt");
        __CLR4_4_195l95lkylve13r.R.inc(11876);FileUtils.touch(file);

        __CLR4_4_195l95lkylve13r.R.inc(11877);dir = new File(dir, "subsubdir1");
        __CLR4_4_195l95lkylve13r.R.inc(11878);dir.mkdirs();
        __CLR4_4_195l95lkylve13r.R.inc(11879);file = new File(dir, "dummy-file.txt");
        __CLR4_4_195l95lkylve13r.R.inc(11880);FileUtils.touch(file);
        __CLR4_4_195l95lkylve13r.R.inc(11881);file = new File(dir, "dummy-index.html");
        __CLR4_4_195l95lkylve13r.R.inc(11882);FileUtils.touch(file);

        __CLR4_4_195l95lkylve13r.R.inc(11883);dir = dir.getParentFile();
        __CLR4_4_195l95lkylve13r.R.inc(11884);dir = new File(dir, "CVS");
        __CLR4_4_195l95lkylve13r.R.inc(11885);dir.mkdirs();
        __CLR4_4_195l95lkylve13r.R.inc(11886);file = new File(dir, "Entries");
        __CLR4_4_195l95lkylve13r.R.inc(11887);FileUtils.touch(file);
        __CLR4_4_195l95lkylve13r.R.inc(11888);file = new File(dir, "Repository");
        __CLR4_4_195l95lkylve13r.R.inc(11889);FileUtils.touch(file);
    }finally{__CLR4_4_195l95lkylve13r.R.flushNeeded();}}

    private Collection<String> filesToFilenames(final Collection<File> files) {try{__CLR4_4_195l95lkylve13r.R.inc(11890);
        __CLR4_4_195l95lkylve13r.R.inc(11891);final Collection<String> filenames = new ArrayList<>(files.size());
        __CLR4_4_195l95lkylve13r.R.inc(11892);for (final File file : files) {{
            __CLR4_4_195l95lkylve13r.R.inc(11893);filenames.add(file.getName());
        }
        }__CLR4_4_195l95lkylve13r.R.inc(11894);return filenames;
    }finally{__CLR4_4_195l95lkylve13r.R.flushNeeded();}}

    private Collection<String> filesToFilenames(final Iterator<File> files) {try{__CLR4_4_195l95lkylve13r.R.inc(11895);
        __CLR4_4_195l95lkylve13r.R.inc(11896);final Collection<String> filenames = new ArrayList<>();
        __CLR4_4_195l95lkylve13r.R.inc(11897);while ((((files.hasNext())&&(__CLR4_4_195l95lkylve13r.R.iget(11898)!=0|true))||(__CLR4_4_195l95lkylve13r.R.iget(11899)==0&false))) {{
            __CLR4_4_195l95lkylve13r.R.inc(11900);filenames.add(files.next().getName());
        }
        }__CLR4_4_195l95lkylve13r.R.inc(11901);return filenames;
    }finally{__CLR4_4_195l95lkylve13r.R.flushNeeded();}}

    @Test
    public void testIterateFilesByExtension() {__CLR4_4_195l95lkylve13r.R.globalSliceStart(getClass().getName(),11902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1imkkn496m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_195l95lkylve13r.R.rethrow($CLV_t2$);}finally{__CLR4_4_195l95lkylve13r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsListFilesTestCase.testIterateFilesByExtension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1imkkn496m(){try{__CLR4_4_195l95lkylve13r.R.inc(11902);
        __CLR4_4_195l95lkylve13r.R.inc(11903);final String[] extensions = { "xml", "txt" };

        __CLR4_4_195l95lkylve13r.R.inc(11904);Iterator<File> files = FileUtils.iterateFiles(temporaryFolder, extensions, false);
        __CLR4_4_195l95lkylve13r.R.inc(11905);Collection<String> filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11906);assertEquals(1, filenames.size());
        __CLR4_4_195l95lkylve13r.R.inc(11907);assertTrue(filenames.contains("dummy-build.xml"));
        __CLR4_4_195l95lkylve13r.R.inc(11908);assertFalse(filenames.contains("README"));
        __CLR4_4_195l95lkylve13r.R.inc(11909);assertFalse(filenames.contains("dummy-file.txt"));

        __CLR4_4_195l95lkylve13r.R.inc(11910);files = FileUtils.iterateFiles(temporaryFolder, extensions, true);
        __CLR4_4_195l95lkylve13r.R.inc(11911);filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11912);assertEquals(4, filenames.size());
        __CLR4_4_195l95lkylve13r.R.inc(11913);assertTrue(filenames.contains("dummy-file.txt"));
        __CLR4_4_195l95lkylve13r.R.inc(11914);assertFalse(filenames.contains("dummy-index.html"));

        __CLR4_4_195l95lkylve13r.R.inc(11915);files = FileUtils.iterateFiles(temporaryFolder, null, false);
        __CLR4_4_195l95lkylve13r.R.inc(11916);filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11917);assertEquals(2, filenames.size());
        __CLR4_4_195l95lkylve13r.R.inc(11918);assertTrue(filenames.contains("dummy-build.xml"));
        __CLR4_4_195l95lkylve13r.R.inc(11919);assertTrue(filenames.contains("README"));
        __CLR4_4_195l95lkylve13r.R.inc(11920);assertFalse(filenames.contains("dummy-file.txt"));
    }finally{__CLR4_4_195l95lkylve13r.R.flushNeeded();}}

    @Test
    public void testListFilesByExtension() {__CLR4_4_195l95lkylve13r.R.globalSliceStart(getClass().getName(),11921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1meb8zs975();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_195l95lkylve13r.R.rethrow($CLV_t2$);}finally{__CLR4_4_195l95lkylve13r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsListFilesTestCase.testListFilesByExtension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1meb8zs975(){try{__CLR4_4_195l95lkylve13r.R.inc(11921);
        __CLR4_4_195l95lkylve13r.R.inc(11922);final String[] extensions = {"xml", "txt"};

        __CLR4_4_195l95lkylve13r.R.inc(11923);Collection<File> files = FileUtils.listFiles(temporaryFolder, extensions, false);
        __CLR4_4_195l95lkylve13r.R.inc(11924);assertEquals(1, files.size());
        __CLR4_4_195l95lkylve13r.R.inc(11925);Collection<String> filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11926);assertTrue(filenames.contains("dummy-build.xml"));
        __CLR4_4_195l95lkylve13r.R.inc(11927);assertFalse(filenames.contains("README"));
        __CLR4_4_195l95lkylve13r.R.inc(11928);assertFalse(filenames.contains("dummy-file.txt"));

        __CLR4_4_195l95lkylve13r.R.inc(11929);files = FileUtils.listFiles(temporaryFolder, extensions, true);
        __CLR4_4_195l95lkylve13r.R.inc(11930);filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11931);assertEquals(4, filenames.size());
        __CLR4_4_195l95lkylve13r.R.inc(11932);assertTrue(filenames.contains("dummy-file.txt"));
        __CLR4_4_195l95lkylve13r.R.inc(11933);assertFalse(filenames.contains("dummy-index.html"));

        __CLR4_4_195l95lkylve13r.R.inc(11934);files = FileUtils.listFiles(temporaryFolder, null, false);
        __CLR4_4_195l95lkylve13r.R.inc(11935);assertEquals(2, files.size());
        __CLR4_4_195l95lkylve13r.R.inc(11936);filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11937);assertTrue(filenames.contains("dummy-build.xml"));
        __CLR4_4_195l95lkylve13r.R.inc(11938);assertTrue(filenames.contains("README"));
        __CLR4_4_195l95lkylve13r.R.inc(11939);assertFalse(filenames.contains("dummy-file.txt"));
    }finally{__CLR4_4_195l95lkylve13r.R.flushNeeded();}}

    @Test
    public void testListFiles() {__CLR4_4_195l95lkylve13r.R.globalSliceStart(getClass().getName(),11940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fb8tim97o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_195l95lkylve13r.R.rethrow($CLV_t2$);}finally{__CLR4_4_195l95lkylve13r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.io.FileUtilsListFilesTestCase.testListFiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fb8tim97o(){try{__CLR4_4_195l95lkylve13r.R.inc(11940);
        __CLR4_4_195l95lkylve13r.R.inc(11941);Collection<File> files;
        __CLR4_4_195l95lkylve13r.R.inc(11942);Collection<String> filenames;
        __CLR4_4_195l95lkylve13r.R.inc(11943);IOFileFilter fileFilter;
        __CLR4_4_195l95lkylve13r.R.inc(11944);IOFileFilter dirFilter;

        // First, find non-recursively
        __CLR4_4_195l95lkylve13r.R.inc(11945);fileFilter = FileFilterUtils.trueFileFilter();
        __CLR4_4_195l95lkylve13r.R.inc(11946);files = FileUtils.listFiles(temporaryFolder, fileFilter, null);
        __CLR4_4_195l95lkylve13r.R.inc(11947);filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11948);assertTrue(filenames.contains("dummy-build.xml"), "'dummy-build.xml' is missing");
        __CLR4_4_195l95lkylve13r.R.inc(11949);assertFalse(filenames.contains("dummy-index.html"), "'dummy-index.html' shouldn't be found");
        __CLR4_4_195l95lkylve13r.R.inc(11950);assertFalse(filenames.contains("Entries"), "'Entries' shouldn't be found");

        // Second, find recursively
        __CLR4_4_195l95lkylve13r.R.inc(11951);fileFilter = FileFilterUtils.trueFileFilter();
        __CLR4_4_195l95lkylve13r.R.inc(11952);dirFilter = FileFilterUtils.notFileFilter(FileFilterUtils.nameFileFilter("CVS"));
        __CLR4_4_195l95lkylve13r.R.inc(11953);files = FileUtils.listFiles(temporaryFolder, fileFilter, dirFilter);
        __CLR4_4_195l95lkylve13r.R.inc(11954);filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11955);assertTrue(filenames.contains("dummy-build.xml"), "'dummy-build.xml' is missing");
        __CLR4_4_195l95lkylve13r.R.inc(11956);assertTrue(filenames.contains("dummy-index.html"), "'dummy-index.html' is missing");
        __CLR4_4_195l95lkylve13r.R.inc(11957);assertFalse(filenames.contains("Entries"), "'Entries' shouldn't be found");

        // Do the same as above but now with the filter coming from FileFilterUtils
        __CLR4_4_195l95lkylve13r.R.inc(11958);fileFilter = FileFilterUtils.trueFileFilter();
        __CLR4_4_195l95lkylve13r.R.inc(11959);dirFilter = FileFilterUtils.makeCVSAware(null);
        __CLR4_4_195l95lkylve13r.R.inc(11960);files = FileUtils.listFiles(temporaryFolder, fileFilter, dirFilter);
        __CLR4_4_195l95lkylve13r.R.inc(11961);filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11962);assertTrue(filenames.contains("dummy-build.xml"), "'dummy-build.xml' is missing");
        __CLR4_4_195l95lkylve13r.R.inc(11963);assertTrue(filenames.contains("dummy-index.html"), "'dummy-index.html' is missing");
        __CLR4_4_195l95lkylve13r.R.inc(11964);assertFalse(filenames.contains("Entries"), "'Entries' shouldn't be found");

        // Again with the CVS filter but now with a non-null parameter
        __CLR4_4_195l95lkylve13r.R.inc(11965);fileFilter = FileFilterUtils.trueFileFilter();
        __CLR4_4_195l95lkylve13r.R.inc(11966);dirFilter = FileFilterUtils.prefixFileFilter("sub");
        __CLR4_4_195l95lkylve13r.R.inc(11967);dirFilter = FileFilterUtils.makeCVSAware(dirFilter);
        __CLR4_4_195l95lkylve13r.R.inc(11968);files = FileUtils.listFiles(temporaryFolder, fileFilter, dirFilter);
        __CLR4_4_195l95lkylve13r.R.inc(11969);filenames = filesToFilenames(files);
        __CLR4_4_195l95lkylve13r.R.inc(11970);assertTrue(filenames.contains("dummy-build.xml"), "'dummy-build.xml' is missing");
        __CLR4_4_195l95lkylve13r.R.inc(11971);assertTrue(filenames.contains("dummy-index.html"), "'dummy-index.html' is missing");
        __CLR4_4_195l95lkylve13r.R.inc(11972);assertFalse(filenames.contains("Entries"), "'Entries' shouldn't be found");

        __CLR4_4_195l95lkylve13r.R.inc(11973);try {
            __CLR4_4_195l95lkylve13r.R.inc(11974);FileUtils.listFiles(temporaryFolder, null, null);
            __CLR4_4_195l95lkylve13r.R.inc(11975);fail("Expected error about null parameter");
        } catch (final NullPointerException e) {
            // expected
        }
    }finally{__CLR4_4_195l95lkylve13r.R.flushNeeded();}}


}
