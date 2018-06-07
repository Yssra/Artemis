/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:09:14 GMT 2018
 */

package org.gmod.schema.phylogeny;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gmod.schema.organism.Organism;
import org.gmod.schema.phylogeny.Phylonode;
import org.gmod.schema.phylogeny.PhylonodeOrganism;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PhylonodeOrganism_ESTest extends PhylonodeOrganism_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PhylonodeOrganism phylonodeOrganism0 = new PhylonodeOrganism(2372, (Organism) null, (Phylonode) null);
      int int0 = phylonodeOrganism0.getPhylonodeOrganismId();
      assertEquals(2372, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PhylonodeOrganism phylonodeOrganism0 = new PhylonodeOrganism();
      phylonodeOrganism0.setPhylonodeOrganismId((-2008));
      int int0 = phylonodeOrganism0.getPhylonodeOrganismId();
      assertEquals((-2008), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PhylonodeOrganism phylonodeOrganism0 = new PhylonodeOrganism();
      phylonodeOrganism0.setOrganism((Organism) null);
      assertEquals(0, phylonodeOrganism0.getPhylonodeOrganismId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PhylonodeOrganism phylonodeOrganism0 = new PhylonodeOrganism();
      int int0 = phylonodeOrganism0.getPhylonodeOrganismId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PhylonodeOrganism phylonodeOrganism0 = new PhylonodeOrganism();
      Organism organism0 = phylonodeOrganism0.getOrganism();
      assertNull(organism0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PhylonodeOrganism phylonodeOrganism0 = new PhylonodeOrganism();
      phylonodeOrganism0.setPhylonode((Phylonode) null);
      assertEquals(0, phylonodeOrganism0.getPhylonodeOrganismId());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PhylonodeOrganism phylonodeOrganism0 = new PhylonodeOrganism();
      Phylonode phylonode0 = phylonodeOrganism0.getPhylonode();
      assertNull(phylonode0);
  }
}
