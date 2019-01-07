/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:07:43 GMT 2018
 */

package uk.ac.sanger.artemis.components.database;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.Splash;
import uk.ac.sanger.artemis.components.database.DatabaseEntrySource;
import uk.ac.sanger.artemis.components.database.DatabaseJPanel;
import uk.ac.sanger.artemis.util.ByteBuffer;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DatabaseJPanel_ESTest extends DatabaseJPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      DatabaseJPanel databaseJPanel0 = null;
      try {
        databaseJPanel0 = new DatabaseJPanel(databaseEntrySource0, (Splash) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - created a null Document
         //
         verifyException("uk.ac.sanger.artemis.util.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      databaseEntrySource0.setLocation(false);
      try { 
        DatabaseJPanel.show(databaseEntrySource0, (Splash) null, (InputStreamProgressListener) null, "Pg}");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("uk.ac.sanger.artemis.components.database.DatabaseJPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(1);
      DatabaseEntrySource databaseEntrySource0 = mock(DatabaseEntrySource.class, new ViolatedAssumptionAnswer());
      doReturn((DatabaseDocument) null).when(databaseEntrySource0).getDatabaseDocument();
      doReturn("lXH39b}OTW_P#89Tew").when(databaseEntrySource0).getLocation();
      JLabel jLabel0 = new JLabel("qQZGk%H=(Uhp=?");
      Splash splash0 = mock(Splash.class, new ViolatedAssumptionAnswer());
      doReturn(jPasswordField0).when(splash0).getCanvas();
      doReturn(jLabel0).when(splash0).getStatusLabel();
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      try { 
        DatabaseJPanel.show(databaseEntrySource0, splash0, inputStreamProgressListener0, "-K|2OB.U|p3P.G");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("uk.ac.sanger.artemis.components.database.DatabaseJPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      try { 
        DatabaseJPanel.show(databaseEntrySource0, (Splash) null, (InputStreamProgressListener) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.database.DatabaseJPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      DatabaseJPanel.getEntryEditFromDatabase(databaseEntrySource0, (Splash) null, (Component) null, (String) null);
      assertNull(databaseEntrySource0.getLocation());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField();
      ByteBuffer byteBuffer0 = new ByteBuffer();
      DatabaseDocument databaseDocument0 = new DatabaseDocument("", jPasswordField0, "", "", byteBuffer0, "");
      DatabaseEntrySource databaseEntrySource0 = mock(DatabaseEntrySource.class, new ViolatedAssumptionAnswer());
      doReturn(databaseDocument0).when(databaseEntrySource0).getDatabaseDocument();
      doReturn(false).when(databaseEntrySource0).setLocation(anyBoolean());
      Splash splash0 = mock(Splash.class, new ViolatedAssumptionAnswer());
      DatabaseJPanel databaseJPanel0 = null;
      try {
        databaseJPanel0 = new DatabaseJPanel(databaseEntrySource0, splash0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.database.DatabaseJPanel", e);
      }
  }
}
