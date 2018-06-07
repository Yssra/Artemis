/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:37:45 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.components.FeatureAminoAcidViewer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FeatureAminoAcidViewer_ESTest extends FeatureAminoAcidViewer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeatureAminoAcidViewer featureAminoAcidViewer0 = null;
      try {
        featureAminoAcidViewer0 = new FeatureAminoAcidViewer((Feature) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.FeatureAminoAcidViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn((Entry) null).when(feature0).getEntry();
      FeatureAminoAcidViewer featureAminoAcidViewer0 = null;
      try {
        featureAminoAcidViewer0 = new FeatureAminoAcidViewer(feature0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.SequenceViewer
         //
         verifyException("uk.ac.sanger.artemis.components.FeatureAminoAcidViewer", e);
      }
  }
}
