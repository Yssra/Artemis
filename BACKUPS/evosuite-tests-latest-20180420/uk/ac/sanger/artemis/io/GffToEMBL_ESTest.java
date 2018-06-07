/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 11:34:51 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.GffToEMBL;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GffToEMBL_ESTest extends GffToEMBL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GffToEMBL gffToEMBL0 = null;
      try {
        gffToEMBL0 = new GffToEMBL("", "", true, true, true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GffToEMBL gffToEMBL0 = null;
      try {
        gffToEMBL0 = new GffToEMBL((String) null, (String) null, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "ByAncestor(";
      stringArray0[3] = "-s";
      stringArray0[4] = "-(f";
      // Undeclared exception!
      try { 
        GffToEMBL.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "gtPPO_CEDjFZ";
      stringArray0[1] = "0oeb3";
      stringArray0[2] = "0oeb3";
      stringArray0[3] = "Mismatch between sequence dictionary fasta index for %s, sequence '%s' != '%s'.";
      stringArray0[4] = "-s";
      stringArray0[5] = "^zYWE=sW";
      stringArray0[6] = "NM&O*dal";
      stringArray0[7] = "xnl";
      stringArray0[8] = "gVgSZ&]k\"";
      // Undeclared exception!
      try { 
        GffToEMBL.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "CW6rz^{w@tU6#";
      stringArray0[2] = "'9";
      stringArray0[3] = "U:4HC<";
      stringArray0[4] = stringArray0[0];
      stringArray0[5] = "%RRI/P%.A+mAp/X";
      stringArray0[6] = "-o";
      // Undeclared exception!
      try { 
        GffToEMBL.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-f";
      stringArray0[1] = "-a";
      stringArray0[2] = "";
      stringArray0[3] = "getFeatureCvTermDbXRefByFeature";
      stringArray0[4] = "tO";
      stringArray0[5] = "-o";
      stringArray0[6] = "KDdAY?c`W-$DFzG'wH$";
      stringArray0[7] = "Vo0";
      stringArray0[8] = "-f";
      // Undeclared exception!
      try { 
        GffToEMBL.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-a";
      stringArray0[1] = "56g(zu3";
      stringArray0[2] = "3($:t6R+XmPr&QZX";
      stringArray0[3] = "";
      stringArray0[4] = "-a";
      // Undeclared exception!
      try { 
        GffToEMBL.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "-z";
      stringArray0[2] = "n";
      stringArray0[3] = "-z";
      stringArray0[4] = "";
      stringArray0[5] = "-z";
      stringArray0[6] = "-z";
      // Undeclared exception!
      try { 
        GffToEMBL.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        GffToEMBL.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "0QsgwK";
      // Undeclared exception!
      try { 
        GffToEMBL.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        GffToEMBL.main((String[]) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Overlapping Features (to be fixed before reordering).tbi");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("Overlapping Features (to be fixed before reordering)");
      FileSystemHandling.appendLineToFile(evoSuiteFile1, "Assertion failure: Should be able to manipulate this FeatureHolder");
      GffToEMBL gffToEMBL0 = null;
      try {
        gffToEMBL0 = new GffToEMBL("Overlapping Features (to be fixed before reordering)", "", false, true, true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Overlapping Features (to be fixed before reordering)");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Assertion failure: Should be able to manipulate this FeatureHolder");
      GffToEMBL gffToEMBL0 = null;
      try {
        gffToEMBL0 = new GffToEMBL("Overlapping Features (to be fixed before reordering)", "", false, true, true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
