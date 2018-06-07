/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:22:52 GMT 2018
 */

package org.gmod.schema.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.gmod.schema.pub.Pub;
import org.gmod.schema.sequence.Feature;
import org.gmod.schema.sequence.FeaturePub;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeaturePub_ESTest extends FeaturePub_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeaturePub featurePub0 = new FeaturePub();
      Pub pub0 = featurePub0.getPub();
      assertNull(pub0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(feature0).toString();
      Pub pub0 = mock(Pub.class, new ViolatedAssumptionAnswer());
      FeaturePub featurePub0 = new FeaturePub(feature0, pub0);
      Feature feature1 = featurePub0.getFeature();
      assertEquals(0, feature1.getSeqLen());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Pub pub0 = mock(Pub.class, new ViolatedAssumptionAnswer());
      FeaturePub featurePub0 = new FeaturePub(feature0, pub0);
      Feature feature1 = mock(Feature.class, new ViolatedAssumptionAnswer());
      featurePub0.setFeature(feature1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FeaturePub featurePub0 = new FeaturePub();
      Feature feature0 = featurePub0.getFeature();
      assertNull(feature0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Pub pub0 = mock(Pub.class, new ViolatedAssumptionAnswer());
      FeaturePub featurePub0 = new FeaturePub(feature0, pub0);
      Pub pub1 = mock(Pub.class, new ViolatedAssumptionAnswer());
      featurePub0.setPub(pub1);
  }
}
