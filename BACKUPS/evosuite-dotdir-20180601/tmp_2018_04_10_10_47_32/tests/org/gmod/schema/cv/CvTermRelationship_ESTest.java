/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:33:03 GMT 2018
 */

package org.gmod.schema.cv;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gmod.schema.cv.CvTerm;
import org.gmod.schema.cv.CvTermRelationship;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CvTermRelationship_ESTest extends CvTermRelationship_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CvTermRelationship cvTermRelationship0 = new CvTermRelationship((CvTerm) null, (CvTerm) null, (CvTerm) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CvTermRelationship cvTermRelationship0 = new CvTermRelationship();
  }
}
