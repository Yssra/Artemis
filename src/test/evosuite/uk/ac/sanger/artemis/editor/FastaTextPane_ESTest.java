/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 11:42:51 GMT 2018
 */

package uk.ac.sanger.artemis.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTKeyStroke;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.InputVerifier;
import javax.swing.JPasswordField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.editor.FastaListener;
import uk.ac.sanger.artemis.editor.FastaTextPane;
import uk.ac.sanger.artemis.editor.HitInfo;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.Document;
import uk.ac.sanger.artemis.util.FileDocument;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;
import uk.ac.sanger.artemis.util.TextDocument;
import uk.ac.sanger.artemis.util.URLDocument;
import uk.ac.sanger.artemis.util.ZipFileDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FastaTextPane_ESTest extends FastaTextPane_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = true;
      FastaTextPane.setRemoteMfetch(true);
      String string0 = "htsjdk.tribble.TribbleException$InternalCodecException";
      String[] stringArray0 = new String[5];
      stringArray0[0] = "htsjdk.tribble.TribbleException$InternalCodecException";
      stringArray0[1] = "htsjdk.tribble.TribbleException$InternalCodecException";
      stringArray0[2] = "htsjdk.tribble.TribbleException$InternalCodecException";
      String string1 = "FASTA";
      stringArray0[4] = "FASTA";
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabaseByMFetch(false, "htsjdk.tribble.TribbleException$InternalCodecException", stringArray0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastaTextPane.setRemoteMfetch(true);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ";eI:lJG";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabaseByMFetch(false, "", stringArray0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "-X<b>X\\";
      DatabaseDocument databaseDocument0 = new DatabaseDocument("-X<b>X", (JPasswordField) null, "", "-X<b>X");
      FastaTextPane fastaTextPane0 = null;
      try {
        fastaTextPane0 = new FastaTextPane(databaseDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
        
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ".{[";
      HitInfo hitInfo0 = new HitInfo(".{[", ".{[");
      hitInfo0.setQueryPosition(0, 0);
      hitInfo0.setIdentity(".{[");
      hitInfo0.setGO(".{[");
      FastaTextPane.checkCache(hitInfo0);
      FastaTextPane.insertNewline("", "$]Li*Lcw.v;R-fE^Vc");
      TextDocument textDocument0 = new TextDocument();
      textDocument0.getParent();
      FastaTextPane fastaTextPane0 = null;
      try {
        fastaTextPane0 = new FastaTextPane((Document) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.FastaTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "</font></html></body>";
      stringArray0[2] = "</font></html></body>";
      stringArray0[3] = "</font></html></body>";
      stringArray0[4] = "</font></html></body>";
      stringArray0[5] = "</font></html></body>";
      stringArray0[6] = "</font></html></body>";
      stringArray0[7] = "</font></html></body>";
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabaseByMFetch(true, "</font></html></body>", stringArray0, "</font></html></body>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "fcTsl|g;sE=Fb+h";
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabaseByMFetch(true, "fcTsl|g;sE=Fb+h", stringArray0, "fcTsl|g;sE=Fb+h");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastaTextPane.isRemoteMfetch();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      FastaTextPane.getUniprotLinkToDatabaseByMFetch(false, "", stringArray0, "");
      String string0 = "2oLnf1Vx";
      // Undeclared exception!
      FastaTextPane.insertNewline("2oLnf1Vx", "");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = FastaTextPane.getMfetchExecutable();
      HitInfo hitInfo0 = new HitInfo("ALIGNMENT", "ALIGNMENT");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "ALIGNMENT";
      stringArray0[1] = "ALIGNMENT";
      stringArray0[2] = "ALIGNMENT";
      stringArray0[3] = "ALIGNMENT";
      stringArray0[4] = "jB .Y2";
      stringArray0[5] = "ALIGNMENT";
      stringArray0[6] = "ALIGNMENT";
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabase(file0, true, hitInfo0, stringArray0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastaTextPane.setRemoteMfetch(false);
      MockFile mockFile0 = new MockFile("u@-JNi.vlQc3U4tg");
      HitInfo hitInfo0 = new HitInfo("u@-JNi.vlQc3U4tg", "HkT{(;u<tP");
      String[] stringArray0 = new String[4];
      mockFile0.delete();
      stringArray0[0] = "u@-JNi.vlQc3U4tg";
      stringArray0[1] = "HkT{(;u<tP";
      stringArray0[2] = "HkT{(;u<tP";
      stringArray0[3] = "u@-JNi.vlQc3U4tg";
      FastaTextPane.getUniprotLinkToDatabase(mockFile0, false, hitInfo0, stringArray0, "e55a<0n=wVwLno");
      JPasswordField jPasswordField0 = new JPasswordField("e55a<0n=wVwLno");
      DatabaseDocument databaseDocument0 = new DatabaseDocument("gM}H):vd@5UuUb", jPasswordField0);
      FastaTextPane fastaTextPane0 = null;
      try {
        fastaTextPane0 = new FastaTextPane(databaseDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = FastaTextPane.getMfetchExecutable();
      HitInfo hitInfo0 = new HitInfo("}", "q'MQ1GlFo&");
      FastaTextPane.checkCache(hitInfo0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "q'MQ1GlFo&";
      stringArray0[1] = "q'MQ1GlFo&";
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabase(file0, false, (HitInfo) null, stringArray0, "}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.FastaTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("+vw;+u?m(X");
      FileDocument fileDocument0 = new FileDocument(mockFile0);
      Document document0 = fileDocument0.getParent();
      FastaTextPane fastaTextPane0 = new FastaTextPane(document0);
      fastaTextPane0.stopGetz();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastaTextPane.isRemoteMfetch();
      // Undeclared exception!
      FastaTextPane.insertNewline("|acc:", "");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      System.setCurrentTimeMillis((-4198L));
      File file0 = FastaTextPane.getMfetchExecutable();
      FileDocument fileDocument0 = new FileDocument(file0);
      FastaTextPane fastaTextPane0 = new FastaTextPane(fileDocument0);
      Object[][] objectArray0 = new Object[2][2];
      objectArray0[0] = (Object[]) fastaTextPane0.cacheHits;
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(0, 284);
      AWTKeyStroke.getAWTKeyStroke((-1756), 0);
      fastaTextPane0.getConditionForKeyStroke(keyStroke0);
      objectArray0[1] = (Object[]) fastaTextPane0.cacheHits;
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray0[0]);
      fastaTextPane0.show((Object) defaultTableModel0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Entry entry0 = simpleEntryGroup0.createEntry("XW8DZsA`MLY`w8Jq'");
      Document document0 = entry0.getRootDocument();
      FastaTextPane fastaTextPane0 = new FastaTextPane(document0);
      fastaTextPane0.getQueryLength();
      simpleEntryGroup0.add(entry0);
      fastaTextPane0.getInputVerifier();
      fastaTextPane0.setInputVerifier((InputVerifier) null);
      FastaTextPane.nCacheHits = 0;
      FastaTextPane.isForceUrl();
      fastaTextPane0.getFormat();
      fastaTextPane0.getFormat();
      fastaTextPane0.getFormat();
      fastaTextPane0.addFastaListener((FastaListener) null);
      // Undeclared exception!
      try { 
        FastaTextPane.insertNewline((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.FastaTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLDocument uRLDocument0 = new URLDocument(uRL0);
      Document document0 = uRLDocument0.getParent();
      FastaTextPane fastaTextPane0 = new FastaTextPane(document0);
      fastaTextPane0.getHitCollection();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/nfs/disk100/pubseq/bin/mfetch/)#SF(v/L1'|a|xUf<");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)3;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      HitInfo hitInfo0 = new HitInfo(")#SF(v", ")#SF(v");
      FastaTextPane.checkCache(hitInfo0);
      FastaTextPane.checkCache((HitInfo) null);
      File file0 = FastaTextPane.getMfetchExecutable();
      MockFile mockFile0 = new MockFile(file0, ")#SF(v");
      mockFile0.deleteOnExit();
      FileDocument fileDocument0 = new FileDocument(mockFile0);
      String string0 = "L1'|a|xUf<";
      Document document0 = fileDocument0.append("L1'|a|xUf<");
      FastaTextPane fastaTextPane0 = new FastaTextPane(document0);
      fastaTextPane0.getFormat();
      FastaTextPane.checkCache((HitInfo) null);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        fastaTextPane0.setBounds((Rectangle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastaTextPane.setForceUrl(true);
      FastaTextPane.getMfetchExecutable();
      FastaTextPane.isForceUrl();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/nfs/disk100/pubseq/bin/mfetch");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)53;
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte)24;
      byteArray0[3] = (byte)19;
      byteArray0[4] = (byte)40;
      byteArray0[5] = (byte) (-85);
      byteArray0[6] = (byte)23;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FastaTextPane.isForceUrl();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FastaTextPane.checkCache((HitInfo) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = null;
      stringArray0[1] = "4|i31)gQaYK8^G";
      stringArray0[2] = "4|i31)gQaYK8^G";
      FastaTextPane.checkCache((HitInfo) null);
      FastaTextPane.getMfetchExecutable();
      File file0 = FastaTextPane.getMfetchExecutable();
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabase(file0, true, (HitInfo) null, stringArray0, "7zxr`0<WmF");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.FastaTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/nfs/disk100/pubseq/bin/mfetch");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)48;
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte)105;
      byteArray0[3] = (byte)28;
      byteArray0[4] = (byte)105;
      byteArray0[5] = (byte)61;
      byteArray0[6] = (byte)16;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FastaTextPane.setForceUrl(true);
      File file0 = FastaTextPane.getMfetchExecutable();
      ZipFileDocument zipFileDocument0 = new ZipFileDocument(file0, "");
      FastaTextPane fastaTextPane0 = new FastaTextPane(zipFileDocument0);
      fastaTextPane0.getFormat();
      HitInfo hitInfo0 = new HitInfo("", "");
      FastaTextPane.checkCache(hitInfo0);
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabase(file0, true, (HitInfo) null, (String[]) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.FastaTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File file0 = MockFile.createTempFile("C:/some dir/some.jar", "C:/some dir/some.jar");
      ZipFileDocument zipFileDocument0 = new ZipFileDocument(file0, (String) null);
      Document document0 = zipFileDocument0.getParent();
      FastaTextPane fastaTextPane0 = new FastaTextPane(document0);
      fastaTextPane0.getFormat();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ungapped)");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ungapped)";
      stringArray0[1] = "ungapped)";
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabase(mockFile0, true, (HitInfo) null, stringArray0, ",");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.FastaTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FastaTextPane.isRemoteMfetch();
      FastaTextPane.getMfetchExecutable();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FastaTextPane.isForceUrl();
      FastaTextPane.isForceUrl();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FastaTextPane.insertNewline("k6", "k6");
      FastaTextPane.insertNewline("k6", "6)>E]{@i2TU)OEu");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HitInfo hitInfo0 = new HitInfo("R&L[;lkK,N08!", "'rIzWUH/sO'k,Q");
      FastaTextPane.checkCache(hitInfo0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      File file0 = FastaTextPane.getMfetchExecutable();
      FileDocument fileDocument0 = new FileDocument(file0);
      fileDocument0.getWriter();
      Document document0 = fileDocument0.append("?b};\"5%");
      fileDocument0.getLinePushBackReader();
      FastaTextPane fastaTextPane0 = new FastaTextPane(document0);
      fastaTextPane0.show((Object) file0);
      HitInfo hitInfo0 = new HitInfo("?b};\"5%", "PostgreSQL JDBC driver connection thread");
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabase(file0, false, hitInfo0, (String[]) null, "PostgreSQL JDBC driver connection thread");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FastaTextPane.getMfetchExecutable();
      String string0 = "\u0003";
      try { 
        MockURL.URL("\u0003");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: \u0003
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = true;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Problems Writing to Database ";
      stringArray0[1] = "Problems Writing to Database ";
      stringArray0[4] = "Problems Writing to Database ";
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabaseByMFetch(true, "Problems Writing to Database ", stringArray0, stringArray0[2]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.ExternalApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FastaTextPane.setForceUrl(true);
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.getHttpExample();
      URLDocument uRLDocument0 = new URLDocument(uRL0);
      FastaTextPane fastaTextPane0 = new FastaTextPane(uRLDocument0);
      fastaTextPane0.getQueryLength();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "20Kk";
      String string1 = "MJU\\N|oJ$cu6";
      FastaTextPane.insertNewline("", "MJUN|oJ$cu6");
      FastaTextPane.isRemoteMfetch();
      String string2 = " cannot have /";
      // Undeclared exception!
      FastaTextPane.insertNewline(" cannot have /", "");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Emh<u3o@ %5*V";
      stringArray0[0] = "Emh<u3o@ %5*V";
      stringArray0[5] = "Emh<u3o@ %5*V";
      FastaTextPane.getUniprotLinkToDatabaseByMFetch(false, "Emh<u3o@ %5*V", stringArray0, (String) null);
      String string0 = "GBFeature_key";
      File file0 = MockFile.createTempFile("Emh<u3o@ %5*V", "GBFeature_key");
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabase(file0, false, (HitInfo) null, stringArray0, "GBFeature_key");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.FastaTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FastaTextPane.isForceUrl();
      FastaTextPane.getMfetchExecutable();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FastaTextPane.checkCache((HitInfo) null);
      String[] stringArray0 = new String[3];
      stringArray0[1] = "4|i31)gQaYK8^G";
      stringArray0[2] = "4|i31)gQaYK8^G";
      FastaTextPane.checkCache((HitInfo) null);
      FastaTextPane.getMfetchExecutable();
      File file0 = FastaTextPane.getMfetchExecutable();
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabase(file0, true, (HitInfo) null, stringArray0, "7zxr`:kWmF");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.FastaTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FastaTextPane.setRemoteMfetch(true);
      FastaTextPane.isRemoteMfetch();
      MockFile mockFile0 = new MockFile("");
      mockFile0.mkdirs();
      ZipFileDocument zipFileDocument0 = new ZipFileDocument(mockFile0, "");
      FastaTextPane fastaTextPane0 = new FastaTextPane(zipFileDocument0);
      // Undeclared exception!
      try { 
        fastaTextPane0.reRead();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FastaTextPane.setRemoteMfetch(true);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "htsjdk.tribble.TribbleException$InternalCodecException";
      stringArray0[1] = "htsjdk.tribble.TribbleException$InternalCodecException";
      stringArray0[2] = "htsjdk.tribble.TribbleException$InternalCodecException";
      stringArray0[4] = "FASTA";
      // Undeclared exception!
      try { 
        FastaTextPane.getUniprotLinkToDatabaseByMFetch(false, "htsjdk.tribble.TribbleException$InternalCodecException", stringArray0, "F");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         
      }
  }
}
