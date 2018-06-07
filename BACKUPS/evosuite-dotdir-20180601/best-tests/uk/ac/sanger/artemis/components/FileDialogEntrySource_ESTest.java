/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:49:41 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.FileDialogEntrySource;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileDialogEntrySource_ESTest extends FileDialogEntrySource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource((JFrame) null, (InputStreamProgressListener) null);
      fileDialogEntrySource0.getInputStreamProgressListener();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource(jFrame0, inputStreamProgressListener0);
      Entry.newEntry((Bases) null);
      // Undeclared exception!
      fileDialogEntrySource0.getEntry(false);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource(jFrame0, inputStreamProgressListener0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      simpleEntryGroup0.createEntry();
      // Undeclared exception!
      fileDialogEntrySource0.getEntry((Bases) null, false);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource(jFrame0, inputStreamProgressListener0);
      Bases bases0 = mock(Bases.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fileDialogEntrySource0.getEntry(bases0, false);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Permission Denied
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource(jFrame0, inputStreamProgressListener0);
      fileDialogEntrySource0.getSourceName();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(inputStreamProgressListener0).toString();
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource(jFrame0, inputStreamProgressListener0);
      fileDialogEntrySource0.getInputStreamProgressListener();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource((JFrame) null, inputStreamProgressListener0);
      // Undeclared exception!
      try { 
        fileDialogEntrySource0.getEntry(false);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Permission Denied
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource(jFrame0, inputStreamProgressListener0);
      boolean boolean0 = fileDialogEntrySource0.isFullEntrySource();
      assertFalse(boolean0);
  }
}
