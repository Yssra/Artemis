/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:15:39 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.plot.HydrophobicityAlgorithm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HydrophobicityAlgorithm_ESTest extends HydrophobicityAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm((Feature) null);
      hydrophobicityAlgorithm0.getMaximumInternal();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      hydrophobicityAlgorithm0.getValueCount();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      hydrophobicityAlgorithm0.getMinimumInternal();
  }
}
