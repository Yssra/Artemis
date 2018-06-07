/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:10:30 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblMisc;
import uk.ac.sanger.artemis.io.FeatureHeader;
import uk.ac.sanger.artemis.io.GFFMisc;
import uk.ac.sanger.artemis.io.GenbankMisc;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MiscLineGroup_ESTest extends MiscLineGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("J>|=Ds2<HjVSFnTj/", (String) null).when(linePushBackReader0).readLine();
      GenbankMisc genbankMisc0 = new GenbankMisc(linePushBackReader0);
      String string0 = genbankMisc0.getLine();
      assertEquals("J>|=Ds2<HjVSFnTj/", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(linePushBackReader0).readLine();
      FeatureHeader featureHeader0 = new FeatureHeader(linePushBackReader0);
      String string0 = featureHeader0.getLine();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(linePushBackReader0).readLine();
      GFFMisc gFFMisc0 = new GFFMisc(linePushBackReader0);
      // Undeclared exception!
      try { 
        gFFMisc0.writeToStream((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.MiscLineGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(linePushBackReader0).readLine();
      GFFMisc gFFMisc0 = new GFFMisc(linePushBackReader0);
      String string0 = gFFMisc0.getLine();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(linePushBackReader0).readLine();
      GFFMisc gFFMisc0 = new GFFMisc(linePushBackReader0);
      String string0 = gFFMisc0.toString();
      assertEquals("null\n", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("7^}3uav").when(linePushBackReader0).readLine();
      EmblMisc emblMisc0 = new EmblMisc(linePushBackReader0);
      emblMisc0.setLine("7^}3uav");
      assertEquals("7^}3uav", emblMisc0.getLine());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("7^}3uav").when(linePushBackReader0).readLine();
      EmblMisc emblMisc0 = new EmblMisc(linePushBackReader0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      emblMisc0.writeToStream(writer0);
      assertEquals("7^}3uav", emblMisc0.getLine());
  }
}
