/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:32:16 GMT 2018
 */

package org.gmod.schema.phylogeny;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.gmod.schema.phylogeny.Phylotree;
import org.gmod.schema.phylogeny.PhylotreePub;
import org.gmod.schema.pub.Pub;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PhylotreePub_ESTest extends PhylotreePub_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      phylotreePub0.setPhylotreePubId(755);
      int int0 = phylotreePub0.getPhylotreePubId();
      assertEquals(755, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub((-1231), (Phylotree) null, (Pub) null);
      int int0 = phylotreePub0.getPhylotreePubId();
      assertEquals((-1231), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub((-1231), (Phylotree) null, (Pub) null);
      phylotreePub0.getPhylotree();
      assertEquals((-1231), phylotreePub0.getPhylotreePubId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Phylotree phylotree0 = mock(Phylotree.class, new ViolatedAssumptionAnswer());
      Pub pub0 = mock(Pub.class, new ViolatedAssumptionAnswer());
      PhylotreePub phylotreePub0 = new PhylotreePub(0, phylotree0, pub0);
      Pub pub1 = mock(Pub.class, new ViolatedAssumptionAnswer());
      phylotreePub0.setPub(pub1);
      assertEquals(0, phylotreePub0.getPhylotreePubId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      Pub pub0 = phylotreePub0.getPub();
      assertNull(pub0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      Phylotree phylotree0 = mock(Phylotree.class, new ViolatedAssumptionAnswer());
      phylotreePub0.setPhylotree(phylotree0);
      assertEquals(0, phylotreePub0.getPhylotreePubId());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Phylotree phylotree0 = mock(Phylotree.class, new ViolatedAssumptionAnswer());
      Pub pub0 = mock(Pub.class, new ViolatedAssumptionAnswer());
      PhylotreePub phylotreePub0 = new PhylotreePub(0, phylotree0, pub0);
      int int0 = phylotreePub0.getPhylotreePubId();
      assertEquals(0, int0);
  }
}
