/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:23:37 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.AlignMatch;
import uk.ac.sanger.artemis.io.Range;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AlignMatch_ESTest extends AlignMatch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(range0).getEnd();
      doReturn(0, 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 1150, 0);
      alignMatch0.setRange(1150, 0, false, false);
      alignMatch0.isSelfMatch();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0, 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 1332);
      alignMatch0.setRange(1332, 1332, true, true);
      alignMatch0.isSelfMatch();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-2886), (-2886));
      alignMatch0.isRevMatch();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 1332);
      alignMatch0.setRange(1332, 1332, true, true);
      alignMatch0.getSubjectSequenceStart();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1), (-1));
      alignMatch0.setRange((-1), (-1), true, true);
      alignMatch0.getSubjectSequenceStart();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 654, 0);
      alignMatch0.setRange(0, 654, true, false);
      alignMatch0.getSubjectSequenceRange();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 1332);
      alignMatch0.setRange((-179), 0, true, false);
      alignMatch0.getSubjectSequenceRange();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 1332);
      alignMatch0.setRange(1332, 1332, true, true);
      alignMatch0.getSubjectSequenceRange();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-2886), (-2886));
      alignMatch0.setRange((-4687), (-246), true, true);
      alignMatch0.getSubjectSequenceRange();
      assertFalse(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-1), 3663);
      alignMatch0.setRange(3663, 3663, true, true);
      int int0 = alignMatch0.getSubjectSequenceEnd();
      assertFalse(alignMatch0.isSelfMatch());
      assertEquals(3663, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1), (-1));
      alignMatch0.setRange((-1), (-1), true, true);
      int int0 = alignMatch0.getSubjectSequenceEnd();
      assertFalse(alignMatch0.isRevMatch());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 654, 0);
      int int0 = alignMatch0.getScore();
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(654, int0);
      assertEquals(0, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1169), (-1169));
      int int0 = alignMatch0.getScore();
      assertEquals((-1169), int0);
      assertEquals((-1169), alignMatch0.getPercentID());
      assertTrue(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-1), 3663);
      alignMatch0.setRange(3663, 3663, false, false);
      int int0 = alignMatch0.getQuerySequenceStart();
      assertFalse(alignMatch0.isSelfMatch());
      assertEquals(3663, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-2122), 0);
      alignMatch0.setRange((-1), (-2122), false, false);
      int int0 = alignMatch0.getQuerySequenceStart();
      assertFalse(alignMatch0.isSelfMatch());
      assertEquals((-2122), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, (Range) null, false, (-1443), (-1443));
      Range range1 = alignMatch0.getQuerySequenceRange();
      assertEquals((-1443), alignMatch0.getScore());
      assertEquals((-1443), alignMatch0.getPercentID());
      assertNull(range1);
      assertFalse(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      Range range1 = mock(Range.class, new ViolatedAssumptionAnswer());
      AlignMatch alignMatch0 = new AlignMatch(range0, range1, true, 1, 1);
      alignMatch0.setRange(1, 1, false, true);
      alignMatch0.getQuerySequenceRange();
      assertFalse(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      alignMatch0.setRange(0, 0, false, false);
      Range range1 = alignMatch0.getQuerySequenceRange();
      assertEquals(0, alignMatch0.getScore());
      assertEquals(1, range1.getCount());
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-2122), 0);
      alignMatch0.setRange((-1), (-2122), false, false);
      alignMatch0.getQuerySequenceRange();
      assertFalse(alignMatch0.isSelfMatch());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-2122), 0);
      alignMatch0.setRange((-1), (-2122), false, false);
      int int0 = alignMatch0.getQuerySequenceEnd();
      assertFalse(alignMatch0.isSelfMatch());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      int int0 = alignMatch0.getPercentID();
      assertEquals(0, alignMatch0.getScore());
      assertEquals(0, int0);
      assertFalse(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1), (-1));
      int int0 = alignMatch0.getPercentID();
      assertEquals((-1), int0);
      assertTrue(alignMatch0.isRevMatch());
      assertEquals((-1), alignMatch0.getScore());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn((-2133)).when(range0).getEnd();
      doReturn((-3500)).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-2133), (-3624));
      int int0 = alignMatch0.getLength();
      assertEquals((-2133), alignMatch0.getScore());
      assertEquals((-3624), alignMatch0.getPercentID());
      assertEquals(1367, int0);
      assertTrue(alignMatch0.isSelfMatch());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 1439, 1439);
      alignMatch0.setRange(1439, 1439, true, true);
      AlignMatch.copy(alignMatch0);
      assertFalse(alignMatch0.isSelfMatch());
      assertEquals(1439, alignMatch0.getSubjectSequenceEnd());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(range0).getEnd();
      doReturn(0, 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 1332);
      alignMatch0.setRange(0, 1924, false, false);
      AlignMatch alignMatch1 = AlignMatch.copy(alignMatch0);
      assertFalse(alignMatch0.isSelfMatch());
      assertEquals(0, alignMatch1.getScore());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(range0).getEnd();
      doReturn((-264), (-331)).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 1, 1);
      AlignMatch.copy(alignMatch0);
      assertEquals(298, alignMatch0.getQuerySequenceStart());
      assertEquals(1, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn((-364), (-364), 0).when(range0).getEnd();
      doReturn((-364), (-364), 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 1125, 0);
      AlignMatch.copy(alignMatch0);
      alignMatch0.setRange(1125, 0, false, false);
      alignMatch0.isSelfMatch();
      alignMatch0.getQuerySequenceRange();
      assertEquals(0, alignMatch0.getSubjectSequenceEnd());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(range0).getEnd();
      doReturn(0, 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-2886), (-2886));
      AlignMatch alignMatch1 = AlignMatch.copy(alignMatch0);
      assertEquals((-2886), alignMatch1.getPercentID());
      assertEquals((-2886), alignMatch0.getPercentID());
      assertTrue(alignMatch0.isRevMatch());
      assertEquals((-2886), alignMatch0.getScore());
      assertEquals((-2886), alignMatch1.getScore());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, (Range) null, true, 350, (-875));
      // Undeclared exception!
      try { 
        alignMatch0.getQuerySequenceStart();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.AlignMatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AlignMatch alignMatch0 = null;
      try {
        alignMatch0 = new AlignMatch((Range) null, (Range) null, true, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.AlignMatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      Range range1 = mock(Range.class, new ViolatedAssumptionAnswer());
      AlignMatch alignMatch0 = new AlignMatch(range0, range1, true, 1, 1);
      alignMatch0.setRange(1, 1, false, true);
      int int0 = alignMatch0.getQuerySequenceEnd();
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0, 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 1332);
      alignMatch0.setRange(1332, 1332, true, true);
      int int0 = alignMatch0.getQuerySequenceStart();
      assertFalse(alignMatch0.isSelfMatch());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, (-1), (-1));
      alignMatch0.getSubjectSequenceEnd();
      assertEquals((-1), alignMatch0.getScore());
      assertTrue(alignMatch0.isRevMatch());
      assertEquals((-1), alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0, 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 0, 1332);
      alignMatch0.getSubjectSequenceStart();
      assertTrue(alignMatch0.isRevMatch());
      assertEquals(1332, alignMatch0.getPercentID());
      assertEquals(0, alignMatch0.getScore());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(range0).getEnd();
      doReturn(0, 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      alignMatch0.setRange(0, 1862, true, true);
      boolean boolean0 = alignMatch0.isSelfMatch();
      assertTrue(alignMatch0.isRevMatch());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      alignMatch0.setRange(0, 1862, true, true);
      alignMatch0.setRange(283, 0, true, true);
      assertFalse(alignMatch0.isSelfMatch());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0, 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      alignMatch0.setRange(0, 1862, true, true);
      alignMatch0.getQuerySequenceEnd();
      assertFalse(alignMatch0.isSelfMatch());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(range0).getEnd();
      doReturn(0, 0, 0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 1085);
      boolean boolean0 = alignMatch0.isSelfMatch();
      assertTrue(boolean0);
      assertEquals(0, alignMatch0.getScore());
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(1085, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 1085);
      boolean boolean0 = alignMatch0.isRevMatch();
      assertEquals(0, alignMatch0.getScore());
      assertFalse(boolean0);
      assertEquals(1085, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 1085);
      int int0 = alignMatch0.getPercentID();
      assertEquals(1085, int0);
      assertEquals(0, alignMatch0.getScore());
      assertFalse(alignMatch0.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      int int0 = alignMatch0.getLength();
      assertEquals(0, alignMatch0.getPercentID());
      assertEquals(0, int0);
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getScore());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Range range0 = mock(Range.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(range0).getEnd();
      doReturn(0).when(range0).getStart();
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      int int0 = alignMatch0.getScore();
      assertEquals(0, int0);
      assertFalse(alignMatch0.isRevMatch());
      assertEquals(0, alignMatch0.getPercentID());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        AlignMatch.copy((AlignMatch) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.AlignMatch", e);
      }
  }
}
