/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:33:52 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.QualifierInfo;
import uk.ac.sanger.artemis.io.QualifierInfoVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QualifierInfoVector_ESTest extends QualifierInfoVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QualifierInfoVector qualifierInfoVector0 = new QualifierInfoVector();
      qualifierInfoVector0.addElement((QualifierInfo) null);
      qualifierInfoVector0.setElementAt((QualifierInfo) null, 0);
      assertEquals(1, qualifierInfoVector0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QualifierInfoVector qualifierInfoVector0 = new QualifierInfoVector();
      qualifierInfoVector0.addElement((QualifierInfo) null);
      int int0 = qualifierInfoVector0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QualifierInfoVector qualifierInfoVector0 = new QualifierInfoVector();
      qualifierInfoVector0.addElement((QualifierInfo) null);
      QualifierInfo qualifierInfo0 = qualifierInfoVector0.elementAt(0);
      assertNull(qualifierInfo0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QualifierInfoVector qualifierInfoVector0 = new QualifierInfoVector();
      qualifierInfoVector0.add((QualifierInfo) null);
      assertEquals(1, qualifierInfoVector0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QualifierInfoVector qualifierInfoVector0 = new QualifierInfoVector();
      QualifierInfoVector qualifierInfoVector1 = qualifierInfoVector0.copy();
      assertNotSame(qualifierInfoVector1, qualifierInfoVector0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QualifierInfoVector qualifierInfoVector0 = new QualifierInfoVector();
      int int0 = qualifierInfoVector0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QualifierInfoVector qualifierInfoVector0 = new QualifierInfoVector();
      // Undeclared exception!
      try { 
        qualifierInfoVector0.elementAt(0);
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
      QualifierInfoVector qualifierInfoVector0 = new QualifierInfoVector();
      // Undeclared exception!
      try { 
        qualifierInfoVector0.setElementAt((QualifierInfo) null, (-1346));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1346
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      QualifierInfoVector qualifierInfoVector0 = new QualifierInfoVector();
      qualifierInfoVector0.addElement((QualifierInfo) null);
      QualifierInfoVector qualifierInfoVector1 = qualifierInfoVector0.copy();
      assertNotSame(qualifierInfoVector1, qualifierInfoVector0);
      assertEquals(1, qualifierInfoVector1.size());
  }
}
