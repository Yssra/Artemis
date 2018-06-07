/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:14:43 GMT 2018
 */

package org.gmod.schema.phylogeny;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.gmod.schema.cv.CvTerm;
import org.gmod.schema.phylogeny.Phylonode;
import org.gmod.schema.phylogeny.PhylonodeProp;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PhylonodeProp_ESTest extends PhylonodeProp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp(0, (CvTerm) null, (Phylonode) null, "BM\"JL-We@/^rk 1T^", (-715));
      phylonodeProp0.getValue();
      assertEquals((-715), phylonodeProp0.getRank());
      assertEquals(0, phylonodeProp0.getPhylonodePropId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      phylonodeProp0.setRank(1);
      int int0 = phylonodeProp0.getRank();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      phylonodeProp0.setRank((-688));
      int int0 = phylonodeProp0.getRank();
      assertEquals((-688), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      phylonodeProp0.setPhylonodePropId(532);
      int int0 = phylonodeProp0.getPhylonodePropId();
      assertEquals(532, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      phylonodeProp0.setPhylonodePropId((-1));
      int int0 = phylonodeProp0.getPhylonodePropId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      phylonodeProp0.setPhylonode((Phylonode) null);
      assertEquals(0, phylonodeProp0.getPhylonodePropId());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      int int0 = phylonodeProp0.getRank();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      phylonodeProp0.setValue("");
      String string0 = phylonodeProp0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      String string0 = phylonodeProp0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      int int0 = phylonodeProp0.getPhylonodePropId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      CvTerm cvTerm0 = mock(CvTerm.class, new ViolatedAssumptionAnswer());
      phylonodeProp0.setCvTerm(cvTerm0);
      assertNull(phylonodeProp0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      Phylonode phylonode0 = phylonodeProp0.getPhylonode();
      assertNull(phylonode0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PhylonodeProp phylonodeProp0 = new PhylonodeProp();
      CvTerm cvTerm0 = phylonodeProp0.getCvTerm();
      assertNull(cvTerm0);
  }
}
