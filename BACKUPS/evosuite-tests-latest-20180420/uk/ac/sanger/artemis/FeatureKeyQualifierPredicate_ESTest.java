/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:18:06 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeatureKeyQualifierPredicate;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Qualifier;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FeatureKeyQualifierPredicate_ESTest extends FeatureKeyQualifierPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate((Key) null, "", "", true, true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "ERM5PgTR1\"*l.3", true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate((Key) null, (String) null, "");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate((Key) null, "PRIMARY", (String) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate((Key) null, "");
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn((Qualifier) null).when(feature0).getQualifierByName(anyString());
      featureKeyQualifierPredicate0.testPredicate(feature0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate((Key) null, "order", "order", false, false, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "YD", "4ip%]sLh#`[5~(c", false, false);
      Key key1 = mock(Key.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn(key1).when(feature0).getKey();
      boolean boolean0 = featureKeyQualifierPredicate0.testPredicate(feature0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = null;
      try {
        featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "", (String) null, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.FeatureKeyQualifierPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate((Key) null, "PRIMARY", (String) null);
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn((Qualifier) null).when(feature0).getQualifierByName(anyString());
      boolean boolean0 = featureKeyQualifierPredicate0.testPredicate(feature0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate((Key) null, "");
      Qualifier qualifier0 = mock(Qualifier.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn(qualifier0).when(feature0).getQualifierByName(anyString());
      boolean boolean0 = featureKeyQualifierPredicate0.testPredicate(feature0);
      assertTrue(boolean0);
  }
}
