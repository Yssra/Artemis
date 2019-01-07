/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:54:15 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.ExternalProgramEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ExternalProgramEvent_ESTest extends ExternalProgramEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent(0, ">3_3D9=Z", (Process) null);
      int int0 = externalProgramEvent0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent((-31), "H", (Process) null);
      int int0 = externalProgramEvent0.getType();
      assertEquals((-31), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent((-709), (String) null, (Process) null);
      externalProgramEvent0.getMessage();
      assertEquals((-709), externalProgramEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent((-1719), "X<(M~", (Process) null);
      externalProgramEvent0.getMessage();
      assertEquals((-1719), externalProgramEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent((-564), "", (Process) null);
      externalProgramEvent0.getMessage();
      assertEquals((-564), externalProgramEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent(232, "3tnjUI@d}1k+T p.pVx", (Process) null);
      int int0 = externalProgramEvent0.getType();
      assertEquals(232, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ExternalProgramEvent externalProgramEvent0 = new ExternalProgramEvent(1579, (String) null, (Process) null);
      externalProgramEvent0.getProcess();
      assertEquals(1579, externalProgramEvent0.getType());
  }
}
