/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 21:57:47 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Qualifier_ESTest extends Qualifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier((String) null, (String) null);
      String string0 = qualifier0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("q<^Tih;L%@j[:/J:7");
      String string0 = qualifier0.getName();
      assertEquals("q<^Tih;L%@j[:/J:7", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("", (StringVector) null);
      String string0 = qualifier0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("uk.ac.sanger.artemis.#til.StringVec8or", "uk.ac.sanger.artemis.#til.StringVec8or");
      StringVector stringVector0 = qualifier0.getValues();
      qualifier0.addValues(stringVector0);
      qualifier0.removeValue("uk.ac.sanger.artemis.#til.StringVec8or");
      assertEquals("uk.ac.sanger.artemis.#til.StringVec8or", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("uk.ac.sanger.artemis.#til.StringVec8or", "uk.ac.sanger.artemis.#til.StringVec8or");
      qualifier0.addValue("uk.ac.sanger.artemis.#til.StringVec8or");
      assertEquals("uk.ac.sanger.artemis.#til.StringVec8or", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("uk.ac.sanger.artemis.#til.StringVec8or", "uk.ac.sanger.artemis.#til.StringVec8or");
      StringVector stringVector0 = qualifier0.getValues();
      qualifier0.removeValue("uk.ac.sanger.artemis.#til.StringVec8or");
      qualifier0.addValues(stringVector0);
      assertEquals("uk.ac.sanger.artemis.#til.StringVec8or", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("+]b{Z }/Cq<8");
      qualifier0.addValue("+]b{Z }/Cq<8");
      qualifier0.addValues((StringVector) null);
      assertEquals("+]b{Z }/Cq<8", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("+]b{Z }/Cq<8");
      StringVector stringVector0 = qualifier0.getValues();
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier();
      // Undeclared exception!
      try { 
        qualifier0.removeValue("!R`JCi|/m,b.a]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Qualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("uk.ac.sanger.artemis.#til.StringVec8or", "uk.ac.sanger.artemis.#til.StringVec8or");
      Qualifier qualifier1 = qualifier0.copy();
      assertNotSame(qualifier0, qualifier1);
  }
}
