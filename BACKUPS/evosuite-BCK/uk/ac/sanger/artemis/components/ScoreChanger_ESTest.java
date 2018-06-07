/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:08:36 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.ScoreChangeListener;
import uk.ac.sanger.artemis.components.ScoreChanger;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScoreChanger_ESTest extends ScoreChanger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScoreChangeListener scoreChangeListener0 = mock(ScoreChangeListener.class, new ViolatedAssumptionAnswer());
      ScoreChanger scoreChanger0 = null;
      try {
        scoreChanger0 = new ScoreChanger("", scoreChangeListener0, scoreChangeListener0, (-1332), (-1332));
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
