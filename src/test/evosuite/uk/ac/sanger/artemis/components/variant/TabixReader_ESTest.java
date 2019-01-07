/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 11:54:30 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import htsjdk.samtools.seekablestream.ByteArraySeekableStream;
import htsjdk.samtools.seekablestream.SeekableBufferedStream;
import htsjdk.samtools.seekablestream.SeekableFileStream;
import htsjdk.samtools.seekablestream.SeekableStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.variant.TabixReader;
import uk.ac.sanger.artemis.components.variant.VCFRecord;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class TabixReader_ESTest extends TabixReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-73);
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      TabixReader.readLine((InputStream) byteArraySeekableStream0);
      assertTrue(byteArraySeekableStream0.eof());
      assertEquals(9L, byteArraySeekableStream0.position());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      TabixReader.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "uBjL;`)v%u! [yWOh");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "QQBSO,/DA?fI%");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "QQBSO,/DA?fI%";
      // Undeclared exception!
      try { 
        TabixReader.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.TabixReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("4,.tbi");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "!],\"R");
      TabixReader tabixReader0 = new TabixReader("4,", uRL0);
      assertEquals("4,", tabixReader0.getFileName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".tbi");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ";END=");
      TabixReader tabixReader0 = new TabixReader("");
      assertEquals("", tabixReader0.getFileName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      long long0 = TabixReader.readLong(byteArraySeekableStream0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-73);
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      TabixReader.readLong(byteArraySeekableStream0);
      assertEquals(8L, byteArraySeekableStream0.position());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader.readLine((InputStream) byteArraySeekableStream0);
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      String string0 = tabixReader0.readLine();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      int int0 = TabixReader.readInt(byteArraySeekableStream0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)67;
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      SeekableBufferedStream seekableBufferedStream0 = new SeekableBufferedStream(byteArraySeekableStream0);
      TabixReader.readInt(seekableBufferedStream0);
      assertEquals(4L, seekableBufferedStream0.position());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-39);
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArraySeekableStream0, 781);
      int int0 = TabixReader.readInt(bufferedInputStream0);
      assertEquals((-654311424), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        TabixReader.readLong((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.TabixReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        TabixReader.readLine((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.TabixReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SeekableBufferedStream seekableBufferedStream0 = new SeekableBufferedStream((SeekableStream) null);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(seekableBufferedStream0, (InputStream) null);
      try { 
        TabixReader.readLine((InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      byteArraySeekableStream0.close();
      // Undeclared exception!
      try { 
        tabixReader0.readLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("htsjdk.samtools.seekablestream.ByteArraySeekableStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("B>[k=Zx}o`");
      MockFile.createTempFile("Q)UG2%d", "uk.ac.sanger.artemis.components.variant.TabixReader", (File) mockFile0);
      SeekableFileStream seekableFileStream0 = new SeekableFileStream(mockFile0);
      try { 
        TabixReader.readInt(seekableFileStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      MockFile mockFile0 = new MockFile("");
      try { 
        tabixReader0.readIndex((File) mockFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        tabixReader0.readIndex();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "j_~|!o7>V)F");
      // Undeclared exception!
      try { 
        tabixReader0.readIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Premature end of file: /Users/kp11/workspace/applications/Artemis-build-ci/Artemis/QQBSO,/DA?fI%.tbi
         //
         verifyException("htsjdk.samtools.util.BlockCompressedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      // Undeclared exception!
      try { 
        tabixReader0.query("-`LAnkF4/:8{D+");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      // Undeclared exception!
      try { 
        tabixReader0.query("j-h%c^tLDzpA@");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"h%c^tLDzpA@\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      // Undeclared exception!
      try { 
        tabixReader0.query((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.TabixReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      // Undeclared exception!
      try { 
        tabixReader0.query((-851), (int) (byte)46, 244);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -851
         //
         verifyException("uk.ac.sanger.artemis.components.variant.TabixReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".tbi");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      // Undeclared exception!
      try { 
        tabixReader0.parseReg((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.TabixReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        TabixReader.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader("B>[k=Zx}o`", uRL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("htsjdk.samtools.util.HttpUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("4,.tbi");
      FileSystemHandling.createFolder(evoSuiteFile0);
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader("4,", uRL0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("4,.tbi");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "you need to select two adjacent exons to use unmerge");
      URL uRL0 = MockURL.getHttpExample();
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader("4,", uRL0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Premature end of file: /Users/kp11/workspace/applications/Artemis-build-ci/Artemis/4,.tbi
         //
         verifyException("htsjdk.samtools.util.BlockCompressedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader("`$4L'zqy)#c0", byteArraySeekableStream0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // File does not exist, and RandomAccessFile is not open in write mode
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Premature end of file: /Users/kp11/workspace/applications/Artemis-build-ci/Artemis/QQBSO,/DA?fI%.tbi
         //
         verifyException("htsjdk.samtools.util.BlockCompressedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".tbi");
      FileSystemHandling.createFolder(evoSuiteFile0);
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader("");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      // Undeclared exception!
      try { 
        tabixReader0.parseReg("From must be less than To: ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      File file0 = MockFile.createTempFile("pNmU'mm", "");
      tabixReader0.readIndex(file0);
      assertTrue(file0.exists());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      MockFile mockFile0 = new MockFile("WUwZ<_kC4*S^vhFM5%", "QQBSO,/DA?fI%");
      try { 
        tabixReader0.readIndex((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File does not exist, and RandomAccessFile is not open in write mode
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        TabixReader.readInt((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.TabixReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      String string0 = tabixReader0.getFileName();
      assertEquals("QQBSO,/DA?fI%", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      // Undeclared exception!
      try { 
        tabixReader0.query("Rv&Xv");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("uk.ac.sanger.artemis.components.variant.TabixReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      tabixReader0.readIndex();
      assertEquals("QQBSO,/DA?fI%", tabixReader0.getFileName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      int[] intArray0 = tabixReader0.parseReg("uk.ac.sanger.artemis.components.variant.TabixReader");
      assertArrayEquals(new int[] {(-1), 0, Integer.MAX_VALUE}, intArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      tabixReader0.readIndex((File) null);
      assertEquals(0, tabixReader0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)10;
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      String string0 = TabixReader.readLine((InputStream) byteArraySeekableStream0);
      assertEquals(4L, byteArraySeekableStream0.position());
      assertEquals("\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader(":kY;7%!U;X\"-");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // File does not exist, and RandomAccessFile is not open in write mode
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      int int0 = tabixReader0.getStartColumn();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      int int0 = tabixReader0.getSeqColumn();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      try { 
        tabixReader0.readLine();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incorrect header size for file: null
         //
         verifyException("htsjdk.samtools.util.BlockCompressedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      TabixReader tabixReader0 = null;
      try {
        tabixReader0 = new TabixReader("4,", uRL0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // File does not exist, and RandomAccessFile is not open in write mode
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      int int0 = tabixReader0.getEndColumn();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      String[] stringArray0 = tabixReader0.getSeqNames();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      VCFRecord vCFRecord0 = tabixReader0.getNextRecord((String) null, 249, (byte)64);
      assertNull(vCFRecord0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        TabixReader.readLong(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArraySeekableStream byteArraySeekableStream0 = new ByteArraySeekableStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QQBSO,/DA?fI%.tbi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "QQBSO,/DA?fI%");
      TabixReader tabixReader0 = new TabixReader("QQBSO,/DA?fI%", byteArraySeekableStream0);
      char char0 = tabixReader0.getCommentChar();
      assertEquals('\u0000', char0);
  }
}
