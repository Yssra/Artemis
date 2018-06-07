/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 11:55:32 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.DNADraw;
import uk.ac.sanger.artemis.circular.TrackManager;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TrackManager_ESTest extends TrackManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Range range0 = new Range(0);
      RangeVector rangeVector0 = new RangeVector(range0);
      Vector<DefaultTableModel> vector0 = new Vector<DefaultTableModel>();
      DNADraw dNADraw0 = new DNADraw(rangeVector0, rangeVector0, vector0, rangeVector0);
      JMenuItem jMenuItem0 = TrackManager.getExportTrackTemplateMenuItem((JFrame) null, dNADraw0);
      assertFalse(jMenuItem0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DNADraw dNADraw0 = mock(DNADraw.class, new ViolatedAssumptionAnswer());
      TrackManager trackManager0 = null;
      try {
        trackManager0 = new TrackManager(dNADraw0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
