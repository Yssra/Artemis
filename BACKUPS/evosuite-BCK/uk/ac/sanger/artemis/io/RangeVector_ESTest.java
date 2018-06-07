/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:48:35 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RangeVector_ESTest extends RangeVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      RangeVector rangeVector0 = new RangeVector(range0);
      // Undeclared exception!
      try { 
        rangeVector0.containsRange((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RangeVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      Range range1 = mock(Range.class, new ViolatedAssumptionAnswer());
      RangeVector rangeVector0 = new RangeVector(range1);
      boolean boolean0 = rangeVector0.containsRange(range0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      RangeVector rangeVector0 = new RangeVector(range0);
      Range range1 = mock(Range.class, new ViolatedAssumptionAnswer());
      rangeVector0.addElement(range1);
      rangeVector0.reverse();
      assertFalse(rangeVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      rangeVector0.setSize(334);
      rangeVector0.reverse();
      assertEquals(334, rangeVector0.capacity());
  }
}
