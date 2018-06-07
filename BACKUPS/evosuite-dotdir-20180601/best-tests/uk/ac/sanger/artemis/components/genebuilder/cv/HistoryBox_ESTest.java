/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 11:45:53 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder.cv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.cv.HistoryBox;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HistoryBox_ESTest extends HistoryBox_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringVector stringVector0 = StringVector.getStrings("date=", "date=");
      boolean boolean0 = HistoryBox.contains(stringVector0, "date=");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringVector stringVector0 = StringVector.getStrings("term=", "term=");
      boolean boolean0 = HistoryBox.contains(stringVector0, "term=");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        HistoryBox.getCvTerms();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringVector stringVector0 = new StringVector();
      stringVector0.add("There is no CV term set for this key.");
      // Undeclared exception!
      try { 
        HistoryBox.contains(stringVector0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.cv.AbstractCvBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Dimension dimension0 = new Dimension();
      HistoryBox historyBox0 = null;
      try {
        historyBox0 = new HistoryBox((Qualifier) null, "", 1028, dimension0, dimension0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringVector stringVector0 = StringVector.getStrings("qualifier=[^;]+");
      boolean boolean0 = HistoryBox.contains(stringVector0, "qualifier=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        HistoryBox.getDefaultTerm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        HistoryBox.getCvTermStrings();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }
}
