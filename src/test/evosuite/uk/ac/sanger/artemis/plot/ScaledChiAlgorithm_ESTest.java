/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 21:32:37 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.GenbankStreamSequence;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.plot.ScaledChiAlgorithm;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScaledChiAlgorithm_ESTest extends ScaledChiAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      scaledChiAlgorithm0.getDefaultStepSize(10);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(bases0).when(strand0).getBases();
      doReturn(true, true).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      float[] floatArray0 = new float[9];
      // Undeclared exception!
      try { 
        scaledChiAlgorithm0.getValues((-1218), (-2691), floatArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unexpected exception: org.evosuite.runtime.mock.java.lang.MockThrowable: start: -1218 > end: -2689
         //
         verifyException("uk.ac.sanger.artemis.plot.ScaledChiAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("");
      Bases bases0 = new Bases(rawStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      float[] floatArray0 = new float[7];
      // Undeclared exception!
      try { 
        scaledChiAlgorithm0.getValues(825, (-3044), floatArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unexpected exception: org.evosuite.runtime.mock.java.lang.MockThrowable: start: 3044 > end: -824
         //
         verifyException("uk.ac.sanger.artemis.plot.ScaledChiAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      scaledChiAlgorithm0.getDefaultWindowSize();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      float[] floatArray0 = new float[4];
      // Undeclared exception!
      try { 
        scaledChiAlgorithm0.getValues(1, 3, floatArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.BaseAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScaledChiAlgorithm scaledChiAlgorithm0 = null;
      try {
        scaledChiAlgorithm0 = new ScaledChiAlgorithm((Strand) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.ScaledChiAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      scaledChiAlgorithm0.getMinimumInternal();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      scaledChiAlgorithm0.getValueCount();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      scaledChiAlgorithm0.getAverage();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(bases0).when(strand0).getBases();
      doReturn(true, true).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      scaledChiAlgorithm0.getDefaultStepSize(1728);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      scaledChiAlgorithm0.getDefaultStepSize(2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      scaledChiAlgorithm0.getDefaultMinWindowSize();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      scaledChiAlgorithm0.getDefaultMaxWindowSize();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      assertNotNull(genbankStreamSequence0);
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getGCount());
      
      Bases bases0 = new Bases(genbankStreamSequence0);
      assertEquals((-5), Bases.MIN_PRIORITY);
      assertEquals(0, Bases.MEDIUM_PRIORITY);
      assertEquals(2, Bases.REVERSE);
      assertEquals(1, Bases.FORWARD);
      assertEquals(5, Bases.MAX_PRIORITY);
      assertNotNull(bases0);
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getGCount());
      
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(bases0).when(strand0).getBases();
      doReturn(true, true).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      assertEquals((-5), Bases.MIN_PRIORITY);
      assertEquals(0, Bases.MEDIUM_PRIORITY);
      assertEquals(2, Bases.REVERSE);
      assertEquals(1, Bases.FORWARD);
      assertEquals(5, Bases.MAX_PRIORITY);
      assertNotNull(scaledChiAlgorithm0);
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(3.4028235E38F, scaledChiAlgorithm0.getUserMax(), 0.01F);
      assertFalse(scaledChiAlgorithm0.isUserMaxMin());
      assertFalse(scaledChiAlgorithm0.isRevCompDisplay());
      assertTrue(scaledChiAlgorithm0.scalingFlag());
      assertEquals(3, scaledChiAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, scaledChiAlgorithm0.getUserMin(), 0.01F);
      assertEquals("Scaled Chi Square", scaledChiAlgorithm0.getAlgorithmShortName());
      assertEquals("Scaled Chi Square", scaledChiAlgorithm0.getAlgorithmName());
      assertNull(scaledChiAlgorithm0.getAverage());
      
      float[] floatArray0 = new float[9];
      scaledChiAlgorithm0.getValues((-1218), 1694, floatArray0);
      assertEquals((-5), Bases.MIN_PRIORITY);
      assertEquals(0, Bases.MEDIUM_PRIORITY);
      assertEquals(2, Bases.REVERSE);
      assertEquals(1, Bases.FORWARD);
      assertEquals(5, Bases.MAX_PRIORITY);
      assertEquals(9, floatArray0.length);
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(3.4028235E38F, scaledChiAlgorithm0.getUserMax(), 0.01F);
      assertFalse(scaledChiAlgorithm0.isUserMaxMin());
      assertFalse(scaledChiAlgorithm0.isRevCompDisplay());
      assertTrue(scaledChiAlgorithm0.scalingFlag());
      assertEquals(3, scaledChiAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, scaledChiAlgorithm0.getUserMin(), 0.01F);
      assertEquals("Scaled Chi Square", scaledChiAlgorithm0.getAlgorithmShortName());
      assertEquals("Scaled Chi Square", scaledChiAlgorithm0.getAlgorithmName());
      assertNull(scaledChiAlgorithm0.getAverage());
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      ScaledChiAlgorithm scaledChiAlgorithm0 = new ScaledChiAlgorithm(strand0);
      assertNotNull(scaledChiAlgorithm0);
      assertEquals(3, scaledChiAlgorithm0.getValueCount());
      assertEquals(3.4028235E38F, scaledChiAlgorithm0.getUserMax(), 0.01F);
      assertFalse(scaledChiAlgorithm0.isRevCompDisplay());
      assertEquals(1.4E-45F, scaledChiAlgorithm0.getUserMin(), 0.01F);
      assertFalse(scaledChiAlgorithm0.isUserMaxMin());
      assertTrue(scaledChiAlgorithm0.scalingFlag());
      assertEquals("Reverse Scaled Chi Square", scaledChiAlgorithm0.getAlgorithmName());
      assertNull(scaledChiAlgorithm0.getAverage());
      assertEquals("Scaled Chi Square", scaledChiAlgorithm0.getAlgorithmShortName());
      
      Float float0 = scaledChiAlgorithm0.getMaximumInternal();
      assertEquals(1000.0F, (float)float0, 0.01F);
      assertNotNull(float0);
      assertEquals(3, scaledChiAlgorithm0.getValueCount());
      assertEquals(3.4028235E38F, scaledChiAlgorithm0.getUserMax(), 0.01F);
      assertFalse(scaledChiAlgorithm0.isRevCompDisplay());
      assertEquals(1.4E-45F, scaledChiAlgorithm0.getUserMin(), 0.01F);
      assertFalse(scaledChiAlgorithm0.isUserMaxMin());
      assertTrue(scaledChiAlgorithm0.scalingFlag());
      assertEquals("Reverse Scaled Chi Square", scaledChiAlgorithm0.getAlgorithmName());
      assertNull(scaledChiAlgorithm0.getAverage());
      assertEquals("Scaled Chi Square", scaledChiAlgorithm0.getAlgorithmShortName());
  }
}
