/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:31:48 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.plot.CodonUsageWeight;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodonWeight_ESTest extends CodonWeight_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("getFeat%ureLoc", "getFeat%ureLoc");
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(230, 230, 0, 230, 0).when(strand0).getACount();
      doReturn(0, 0, 0, (-898), 1352).when(strand0).getCCount();
      doReturn(0, 0, 0, 1866, 530).when(strand0).getGCount();
      doReturn((-354), 0, 2867, 1352, 0).when(strand0).getSequenceLength();
      doReturn(0, (-898), 129, 8909, (-285)).when(strand0).getTCount();
      CodonUsageWeight codonUsageWeight0 = new CodonUsageWeight(file0, strand0);
      codonUsageWeight0.getName();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = MockFile.createTempFile("getFeat%ureLoc", "getFeat%ureLoc");
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(230, 230, 0, 230, 0).when(strand0).getACount();
      doReturn(0, 0, 0, (-898), 1352).when(strand0).getCCount();
      doReturn(0, 0, 0, 1866, 530).when(strand0).getGCount();
      doReturn((-354), 0, 2867, 1352, 0).when(strand0).getSequenceLength();
      doReturn(0, (-898), 129, 8909, (-285)).when(strand0).getTCount();
      CodonUsageWeight codonUsageWeight0 = new CodonUsageWeight(file0, strand0);
      codonUsageWeight0.getCodonValue('+', 'D', 'M');
  }
}
