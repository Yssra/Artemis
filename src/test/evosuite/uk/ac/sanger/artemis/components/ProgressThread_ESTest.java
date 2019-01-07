/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:40:18 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.ProgressThread;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ProgressThread_ESTest extends ProgressThread_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      ProgressThread progressThread0 = new ProgressThread(jFrame0, ",Y\"{:N}x~<IOXf/");
      progressThread0.finished();
      assertEquals(0, progressThread0.countStackFrames());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      ProgressThread progressThread0 = new ProgressThread(jFrame0, ",Y\"{:N}x~<IOXf/");
      // Undeclared exception!
      try { 
        progressThread0.run();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
