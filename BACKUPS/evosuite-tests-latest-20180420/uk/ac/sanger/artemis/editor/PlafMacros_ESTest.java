/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:39:57 GMT 2018
 */

package uk.ac.sanger.artemis.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.editor.PlafMacros;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PlafMacros_ESTest extends PlafMacros_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlafMacros.breakupLines("\n|V: }YI");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = PlafMacros.breakupLines("S\n\n");
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = PlafMacros.breakupLines("vG=!Uh5t0$");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        PlafMacros.breakupLines((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.PlafMacros", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = PlafMacros.breakupLines("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = PlafMacros.getLineSeparator();
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PlafMacros plafMacros0 = new PlafMacros();
      assertEquals("\n", plafMacros0.getLineSeparator());
  }
}
