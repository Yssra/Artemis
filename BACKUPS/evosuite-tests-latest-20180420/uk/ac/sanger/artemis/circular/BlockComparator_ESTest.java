/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:59:38 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.BlockComparator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BlockComparator_ESTest extends BlockComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlockComparator blockComparator0 = new BlockComparator();
      // Undeclared exception!
      try { 
        blockComparator0.compare("", (Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.circular.Block
         //
         verifyException("uk.ac.sanger.artemis.circular.BlockComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BlockComparator blockComparator0 = new BlockComparator();
      // Undeclared exception!
      try { 
        blockComparator0.compare((Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.BlockComparator", e);
      }
  }
}
