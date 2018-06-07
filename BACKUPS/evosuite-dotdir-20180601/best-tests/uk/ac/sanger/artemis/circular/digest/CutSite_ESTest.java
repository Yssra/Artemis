/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:51:14 GMT 2018
 */

package uk.ac.sanger.artemis.circular.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.digest.CutSite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CutSite_ESTest extends CutSite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CutSite cutSite0 = new CutSite("0", "0", "0", "0", "0", "0");
      assertFalse(cutSite0.isHighlighted());
      
      cutSite0.setHighlighted(true);
      boolean boolean0 = cutSite0.isHighlighted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CutSite cutSite0 = new CutSite("8", "8", "8", "8", "8", "+");
      boolean boolean0 = cutSite0.isForward();
      assertTrue(boolean0);
      assertEquals(8, cutSite0.getThreePrimeRev());
      assertFalse(cutSite0.isHighlighted());
      assertEquals("8", cutSite0.getEnzymeName());
      assertEquals(8, cutSite0.getFivePrimeRev());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CutSite cutSite0 = new CutSite("7", "7", "7", "7", "7", "7");
      int int0 = cutSite0.getThreePrimeRev();
      assertFalse(cutSite0.isForward());
      assertEquals(7, cutSite0.getFivePrimeRev());
      assertFalse(cutSite0.isHighlighted());
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CutSite cutSite0 = new CutSite("0", "0", "0", "0", "0", "0");
      int int0 = cutSite0.getThreePrime();
      assertFalse(cutSite0.isHighlighted());
      assertFalse(cutSite0.isForward());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CutSite cutSite0 = new CutSite("1", "1", "1", "1", "1", "1");
      int int0 = cutSite0.getFivePrimeRev();
      assertEquals(1, int0);
      assertEquals(1, cutSite0.getThreePrimeRev());
      assertFalse(cutSite0.isHighlighted());
      assertFalse(cutSite0.isForward());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CutSite cutSite0 = new CutSite("0", "0", "0", "0", "0", "0");
      int int0 = cutSite0.getFivePrime();
      assertFalse(cutSite0.isHighlighted());
      assertFalse(cutSite0.isForward());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CutSite cutSite0 = new CutSite((String) null, "8", "8", "8", "8", "+");
      String string0 = cutSite0.getEnzymeName();
      assertNull(string0);
      assertFalse(cutSite0.isHighlighted());
      assertEquals(8, cutSite0.getThreePrimeRev());
      assertTrue(cutSite0.isForward());
      assertEquals(8, cutSite0.getFivePrimeRev());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CutSite cutSite0 = null;
      try {
        cutSite0 = new CutSite("7HR}PI05", "", "*RxOzG[", "", "", "2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CutSite cutSite0 = null;
      try {
        cutSite0 = new CutSite("0", "0", "0", "0", (String) null, "0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CutSite cutSite0 = new CutSite("1", "1", "1", "1", "1", "1");
      int int0 = cutSite0.getThreePrime();
      assertEquals(1, cutSite0.getFivePrimeRev());
      assertEquals(1, int0);
      assertEquals(1, cutSite0.getThreePrimeRev());
      assertFalse(cutSite0.isHighlighted());
      assertFalse(cutSite0.isForward());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CutSite cutSite0 = new CutSite(".", "50", "50", ".", ".", "50");
      int int0 = cutSite0.getThreePrimeRev();
      assertFalse(cutSite0.isForward());
      assertFalse(cutSite0.isHighlighted());
      assertEquals(".", cutSite0.getEnzymeName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CutSite cutSite0 = new CutSite("1", "1", "1", "1", "1", "1");
      boolean boolean0 = cutSite0.isForward();
      assertEquals(1, cutSite0.getFivePrimeRev());
      assertEquals(1, cutSite0.getThreePrimeRev());
      assertFalse(cutSite0.isHighlighted());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CutSite cutSite0 = new CutSite(".", "50", "50", ".", ".", "-2jW7<>h1z:'D`zX'");
      int int0 = cutSite0.getFivePrimeRev();
      assertEquals(".", cutSite0.getEnzymeName());
      assertFalse(cutSite0.isForward());
      assertEquals(0, int0);
      assertFalse(cutSite0.isHighlighted());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CutSite cutSite0 = new CutSite("1", "1", "1", "1", "1", "1");
      boolean boolean0 = cutSite0.isHighlighted();
      assertEquals(1, cutSite0.getThreePrimeRev());
      assertFalse(cutSite0.isForward());
      assertFalse(boolean0);
      assertEquals(1, cutSite0.getFivePrimeRev());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CutSite cutSite0 = new CutSite("8", "8", "8", "8", "8", "+");
      String string0 = cutSite0.getEnzymeName();
      assertEquals("8", string0);
      assertEquals(8, cutSite0.getThreePrimeRev());
      assertTrue(cutSite0.isForward());
      assertEquals(8, cutSite0.getFivePrimeRev());
      assertFalse(cutSite0.isHighlighted());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CutSite cutSite0 = new CutSite(".", "50", "50", ".", ".", "-2jW7<>h1z:'D`zX'");
      int int0 = cutSite0.getFivePrime();
      assertFalse(cutSite0.isForward());
      assertFalse(cutSite0.isHighlighted());
      assertEquals(50, int0);
      assertEquals(".", cutSite0.getEnzymeName());
  }
}
