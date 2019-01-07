/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 14:35:48 GMT 2018
 */

package org.gmod.schema.phylogeny;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gmod.schema.phylogeny.Phylotree;
import org.gmod.schema.phylogeny.PhylotreePub;
import org.gmod.schema.pub.Pub;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PhylotreePub_ESTest extends PhylotreePub_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      phylotreePub0.setPhylotreePubId((-493));
      int int0 = phylotreePub0.getPhylotreePubId();
      assertEquals((-493), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      phylotreePub0.setPub((Pub) null);
      assertEquals(0, phylotreePub0.getPhylotreePubId());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      Pub pub0 = phylotreePub0.getPub();
      assertNull(pub0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      phylotreePub0.setPhylotree((Phylotree) null);
      assertEquals(0, phylotreePub0.getPhylotreePubId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub(0, (Phylotree) null, (Pub) null);
      assertEquals(0, phylotreePub0.getPhylotreePubId());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      phylotreePub0.setPhylotreePubId(4746);
      int int0 = phylotreePub0.getPhylotreePubId();
      assertEquals(4746, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      int int0 = phylotreePub0.getPhylotreePubId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PhylotreePub phylotreePub0 = new PhylotreePub();
      Phylotree phylotree0 = phylotreePub0.getPhylotree();
      assertNull(phylotree0);
  }
}
