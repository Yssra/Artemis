/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 11:11:02 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.awt.datatransfer.Clipboard;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JCheckBox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.TransferAnnotationTool;
import uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel;
import uk.ac.sanger.artemis.io.DocumentEntry;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransferAnnotationTool_ESTest extends TransferAnnotationTool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hashtable<JCheckBox, Vector<JCheckBox>> hashtable0 = new Hashtable<JCheckBox, Vector<JCheckBox>>();
      Vector<JCheckBox> vector0 = new Vector<JCheckBox>();
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      StringBuffer stringBuffer0 = new StringBuffer("08d_");
      // Undeclared exception!
      try { 
        TransferAnnotationTool.transferAnnotation(hashtable0, vector0, (Feature) null, simpleEntryGroup0, false, true, false, stringBuffer0, stringBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.TransferAnnotationTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("(g.|43gg/O^>5ySw");
      StringVector stringVector0 = StringVector.getStrings("R3zPb-b[bzQZQkwh$");
      // Undeclared exception!
      try { 
        TransferAnnotationTool.getQualifierWithoutDuplicateValues(qualifier0, stringVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.TransferAnnotationTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      MatchPanel matchPanel0 = new MatchPanel((Feature) null, (DocumentEntry) null);
      TransferAnnotationTool transferAnnotationTool0 = null;
      try {
        transferAnnotationTool0 = new TransferAnnotationTool((Feature) null, simpleEntryGroup0, matchPanel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.TransferAnnotationTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(" parser not supported by IntegerAlphabet yet");
      Bases bases0 = new Bases(fastaStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry();
      Feature feature0 = entry0.createFeature();
      TransferAnnotationTool transferAnnotationTool0 = null;
      try {
        transferAnnotationTool0 = new TransferAnnotationTool(feature0, simpleEntryGroup0, (MatchPanel) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringVector stringVector0 = new StringVector("");
      Qualifier qualifier0 = new Qualifier("WtH", stringVector0);
      Boolean boolean0 = new Boolean("CLOSE");
      StringVector stringVector1 = StringVector.getStrings("L?T5qjGA", "CLOSE", (boolean) boolean0);
      Qualifier qualifier1 = TransferAnnotationTool.getQualifierWithoutDuplicateValues(qualifier0, stringVector1);
      assertNotNull(qualifier1);
      assertNotSame(qualifier1, qualifier0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureVector featureVector0 = selection0.getAllFeatures();
      StringVector stringVector0 = Feature.getAllQualifierNames(featureVector0);
      Qualifier qualifier0 = TransferAnnotationTool.getQualifierWithoutDuplicateValues((Qualifier) null, stringVector0);
      assertNull(qualifier0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringVector stringVector0 = new StringVector("");
      Qualifier qualifier0 = new Qualifier("WtH", stringVector0);
      Qualifier qualifier1 = TransferAnnotationTool.getQualifierWithoutDuplicateValues(qualifier0, stringVector0);
      assertNull(qualifier1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Qualifier qualifier0 = TransferAnnotationTool.getQualifierWithoutDuplicateValues((Qualifier) null, (StringVector) null);
      assertNull(qualifier0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      boolean boolean0 = TransferAnnotationTool.isNonTransferable("feature_relationship_rank");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      boolean boolean0 = TransferAnnotationTool.isNonTransferable("_D");
      assertFalse(boolean0);
  }
}
