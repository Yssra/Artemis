/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:13:55 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.BioJavaEntrySource;
import uk.ac.sanger.artemis.components.ProgressThread;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BioJavaEntrySource_ESTest extends BioJavaEntrySource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BioJavaEntrySource bioJavaEntrySource0 = new BioJavaEntrySource();
      ProgressThread progressThread0 = new ProgressThread((JFrame) null, "KKDh'\"'$XL/Db.E");
      try { 
        bioJavaEntrySource0.getEntry(false, progressThread0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BioJavaEntrySource bioJavaEntrySource0 = new BioJavaEntrySource();
      try { 
        bioJavaEntrySource0.getEntry((Bases) null, false);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BioJavaEntrySource bioJavaEntrySource0 = new BioJavaEntrySource();
      try { 
        bioJavaEntrySource0.getEntry((Bases) null, (ProgressThread) null, false);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BioJavaEntrySource bioJavaEntrySource0 = new BioJavaEntrySource();
      try { 
        bioJavaEntrySource0.getEntry(false);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BioJavaEntrySource bioJavaEntrySource0 = new BioJavaEntrySource();
      String string0 = bioJavaEntrySource0.getSourceName();
      assertEquals("BioJava", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BioJavaEntrySource bioJavaEntrySource0 = new BioJavaEntrySource();
      boolean boolean0 = bioJavaEntrySource0.isFullEntrySource();
      assertTrue(boolean0);
  }
}
