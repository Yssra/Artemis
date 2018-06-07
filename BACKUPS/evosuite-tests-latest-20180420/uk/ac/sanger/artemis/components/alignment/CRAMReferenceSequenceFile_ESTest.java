/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:58:38 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import htsjdk.samtools.reference.ReferenceSequence;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.components.alignment.BamView;
import uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile;
import uk.ac.sanger.artemis.io.Sequence;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CRAMReferenceSequenceFile_ESTest extends CRAMReferenceSequenceFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BamView bamView0 = mock(BamView.class, new ViolatedAssumptionAnswer());
      doReturn(877).when(bamView0).getSequenceOffset(anyString());
      CRAMReferenceSequenceFile cRAMReferenceSequenceFile0 = new CRAMReferenceSequenceFile((Entry) null, bamView0);
      // Undeclared exception!
      try { 
        cRAMReferenceSequenceFile0.getSubsequenceAt("LPGb(Q]+J<2", (-1L), (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Bases bases0 = mock(Bases.class, new ViolatedAssumptionAnswer());
      Sequence sequence0 = mock(Sequence.class, new ViolatedAssumptionAnswer());
      uk.ac.sanger.artemis.io.Entry entry0 = mock(uk.ac.sanger.artemis.io.Entry.class, new ViolatedAssumptionAnswer());
      doReturn(sequence0).when(entry0).getSequence();
      Entry entry1 = mock(Entry.class, new ViolatedAssumptionAnswer());
      doReturn(bases0).when(entry1).getBases();
      doReturn(entry0).when(entry1).getEMBLEntry();
      doReturn("22>1_kF`]~").when(entry1).getName();
      BamView bamView0 = mock(BamView.class, new ViolatedAssumptionAnswer());
      doReturn(2026).when(bamView0).getSequenceOffset(anyString());
      CRAMReferenceSequenceFile cRAMReferenceSequenceFile0 = new CRAMReferenceSequenceFile(entry1, bamView0);
      ReferenceSequence referenceSequence0 = cRAMReferenceSequenceFile0.getSubsequenceAt("QZ)8U", 500L, 0L);
      assertNull(referenceSequence0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Bases bases0 = mock(Bases.class, new ViolatedAssumptionAnswer());
      doReturn("").when(bases0).getSubSequence(any(uk.ac.sanger.artemis.io.Range.class) , anyInt());
      Sequence sequence0 = mock(Sequence.class, new ViolatedAssumptionAnswer());
      uk.ac.sanger.artemis.io.Entry entry0 = mock(uk.ac.sanger.artemis.io.Entry.class, new ViolatedAssumptionAnswer());
      doReturn(sequence0).when(entry0).getSequence();
      Entry entry1 = mock(Entry.class, new ViolatedAssumptionAnswer());
      doReturn(bases0).when(entry1).getBases();
      doReturn(entry0).when(entry1).getEMBLEntry();
      doReturn("W]%N{rYwJfG\"a@S").when(entry1).getName();
      BamView bamView0 = mock(BamView.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(bamView0).getSequenceOffset(anyString());
      CRAMReferenceSequenceFile cRAMReferenceSequenceFile0 = new CRAMReferenceSequenceFile(entry1, bamView0);
      ReferenceSequence referenceSequence0 = cRAMReferenceSequenceFile0.getSubsequenceAt("", 0L, 0L);
      assertEquals(0, referenceSequence0.getContigIndex());
      assertNotNull(referenceSequence0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Bases bases0 = mock(Bases.class, new ViolatedAssumptionAnswer());
      doReturn(1905).when(bases0).getLength();
      doReturn("").when(bases0).getSubSequence(any(uk.ac.sanger.artemis.io.Range.class) , anyInt());
      Sequence sequence0 = mock(Sequence.class, new ViolatedAssumptionAnswer());
      uk.ac.sanger.artemis.io.Entry entry0 = mock(uk.ac.sanger.artemis.io.Entry.class, new ViolatedAssumptionAnswer());
      doReturn(sequence0, sequence0).when(entry0).getSequence();
      Entry entry1 = mock(Entry.class, new ViolatedAssumptionAnswer());
      doReturn(bases0, bases0).when(entry1).getBases();
      doReturn(entry0, entry0).when(entry1).getEMBLEntry();
      doReturn("22>1_kF`]~").when(entry1).getName();
      BamView bamView0 = mock(BamView.class, new ViolatedAssumptionAnswer());
      doReturn(2026).when(bamView0).getSequenceOffset(anyString());
      CRAMReferenceSequenceFile cRAMReferenceSequenceFile0 = new CRAMReferenceSequenceFile(entry1, bamView0);
      ReferenceSequence referenceSequence0 = cRAMReferenceSequenceFile0.getSequence("22>1_kF`]~");
      assertEquals(0, referenceSequence0.getContigIndex());
      assertNotNull(referenceSequence0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Bases bases0 = mock(Bases.class, new ViolatedAssumptionAnswer());
      doReturn("uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile").when(bases0).getSubSequence(any(uk.ac.sanger.artemis.io.Range.class) , anyInt());
      Sequence sequence0 = mock(Sequence.class, new ViolatedAssumptionAnswer());
      uk.ac.sanger.artemis.io.Entry entry0 = mock(uk.ac.sanger.artemis.io.Entry.class, new ViolatedAssumptionAnswer());
      doReturn(sequence0, sequence0).when(entry0).getSequence();
      Bases bases1 = mock(Bases.class, new ViolatedAssumptionAnswer());
      doReturn(1, 0, (-5), 2).when(bases1).getLength();
      doReturn("uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile", (String) null).when(bases1).getSubSequence(any(uk.ac.sanger.artemis.io.Range.class) , anyInt());
      Sequence sequence1 = mock(Sequence.class, new ViolatedAssumptionAnswer());
      Sequence sequence2 = mock(Sequence.class, new ViolatedAssumptionAnswer());
      uk.ac.sanger.artemis.io.Entry entry1 = mock(uk.ac.sanger.artemis.io.Entry.class, new ViolatedAssumptionAnswer());
      doReturn(sequence1, sequence2, sequence2, sequence1, sequence1).when(entry1).getSequence();
      Entry entry2 = mock(Entry.class, new ViolatedAssumptionAnswer());
      doReturn(bases0, bases1, bases1, bases1, bases1).when(entry2).getBases();
      doReturn(entry0, entry0, entry1, entry1, entry1).when(entry2).getEMBLEntry();
      doReturn("uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile", (String) null, "uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile", "uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile", "").when(entry2).getName();
      BamView bamView0 = mock(BamView.class, new ViolatedAssumptionAnswer());
      doReturn(1, 0, (-5), 5, 438).when(bamView0).getSequenceOffset(anyString());
      CRAMReferenceSequenceFile cRAMReferenceSequenceFile0 = new CRAMReferenceSequenceFile(entry2, bamView0);
      cRAMReferenceSequenceFile0.getSubsequenceAt((String) null, 0, 2);
      cRAMReferenceSequenceFile0.getSequence("");
      cRAMReferenceSequenceFile0.getSequence(".*.(bam|cram)$");
      cRAMReferenceSequenceFile0.getSequence("Default");
      // Undeclared exception!
      try { 
        cRAMReferenceSequenceFile0.getSequence("Default");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Entry entry0 = mock(Entry.class, new ViolatedAssumptionAnswer());
      CRAMReferenceSequenceFile cRAMReferenceSequenceFile0 = new CRAMReferenceSequenceFile(entry0, (BamView) null);
      cRAMReferenceSequenceFile0.reset();
      assertTrue(cRAMReferenceSequenceFile0.isIndexed());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Bases bases0 = mock(Bases.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(bases0).getLength();
      uk.ac.sanger.artemis.io.Entry entry0 = mock(uk.ac.sanger.artemis.io.Entry.class, new ViolatedAssumptionAnswer());
      doReturn((Sequence) null, (Sequence) null).when(entry0).getSequence();
      Entry entry1 = mock(Entry.class, new ViolatedAssumptionAnswer());
      doReturn(bases0, (Bases) null, (Bases) null).when(entry1).getBases();
      doReturn(entry0, entry0, (uk.ac.sanger.artemis.io.Entry) null, (uk.ac.sanger.artemis.io.Entry) null).when(entry1).getEMBLEntry();
      doReturn((String) null).when(entry1).getName();
      BamView bamView0 = mock(BamView.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(bamView0).getSequenceOffset(anyString());
      CRAMReferenceSequenceFile cRAMReferenceSequenceFile0 = new CRAMReferenceSequenceFile(entry1, bamView0);
      cRAMReferenceSequenceFile0.isReferenceIndexed();
      String string0 = "t\\w'7opQHu(/5^q";
      cRAMReferenceSequenceFile0.getSequence(".*.(bam|cram)$");
      // Undeclared exception!
      try { 
        cRAMReferenceSequenceFile0.getSequence("tw'7opQHu(/5^q");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CRAMReferenceSequenceFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Entry entry0 = mock(Entry.class, new ViolatedAssumptionAnswer());
      CRAMReferenceSequenceFile cRAMReferenceSequenceFile0 = new CRAMReferenceSequenceFile(entry0, (BamView) null);
      ReferenceSequence referenceSequence0 = cRAMReferenceSequenceFile0.nextSequence();
      assertNull(referenceSequence0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Entry entry0 = mock(Entry.class, new ViolatedAssumptionAnswer());
      CRAMReferenceSequenceFile cRAMReferenceSequenceFile0 = new CRAMReferenceSequenceFile(entry0, (BamView) null);
      cRAMReferenceSequenceFile0.close();
      assertTrue(cRAMReferenceSequenceFile0.isIndexed());
  }
}
