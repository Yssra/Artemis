/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:06:52 GMT 2018
 */

package uk.ac.sanger.artemis.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.sequence.MarkerRange;
import uk.ac.sanger.artemis.sequence.MarkerRangeVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MarkerRangeVector_ESTest extends MarkerRangeVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MarkerRangeVector markerRangeVector0 = new MarkerRangeVector();
      markerRangeVector0.add((MarkerRange) null);
      int int0 = markerRangeVector0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MarkerRangeVector markerRangeVector0 = new MarkerRangeVector();
      markerRangeVector0.add((MarkerRange) null);
      int int0 = markerRangeVector0.indexOf((MarkerRange) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MarkerRangeVector markerRangeVector0 = new MarkerRangeVector();
      markerRangeVector0.add((MarkerRange) null);
      MarkerRange markerRange0 = markerRangeVector0.elementAt(0);
      assertNull(markerRange0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MarkerRangeVector markerRangeVector0 = new MarkerRangeVector();
      int int0 = markerRangeVector0.indexOf((MarkerRange) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MarkerRangeVector markerRangeVector0 = new MarkerRangeVector();
      boolean boolean0 = markerRangeVector0.contains((MarkerRange) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MarkerRangeVector markerRangeVector0 = new MarkerRangeVector();
      int int0 = markerRangeVector0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MarkerRangeVector markerRangeVector0 = new MarkerRangeVector();
      // Undeclared exception!
      try { 
        markerRangeVector0.elementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MarkerRangeVector markerRangeVector0 = new MarkerRangeVector();
      markerRangeVector0.add((MarkerRange) null);
      boolean boolean0 = markerRangeVector0.contains((MarkerRange) null);
      assertTrue(boolean0);
  }
}
