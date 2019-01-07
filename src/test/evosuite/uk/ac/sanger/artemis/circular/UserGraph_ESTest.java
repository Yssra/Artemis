/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:05:37 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.DNADraw;
import uk.ac.sanger.artemis.circular.UserGraph;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class UserGraph_ESTest extends UserGraph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Stack<DefaultTableModel> stack0 = new Stack<DefaultTableModel>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("m+H^qH{G^Xrs_o_");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "bn{M?1irtkI{D7Yd");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      DNADraw dNADraw0 = new DNADraw(stack0, stack0, stack0, stack0);
      UserGraph userGraph0 = null;
      try {
        userGraph0 = new UserGraph(dNADraw0, "m+H^qH{G^Xrs_o_");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("m+H^qH{G^Xrs_o_");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      DNADraw dNADraw0 = new DNADraw();
      UserGraph userGraph0 = null;
      try {
        userGraph0 = new UserGraph(dNADraw0, "m+H^qH{G^Xrs_o_");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // unknown file type
         //
         verifyException("uk.ac.sanger.artemis.circular.UserGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stack<DefaultTableModel> stack0 = new Stack<DefaultTableModel>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("m+H^qH{G^Xrs_o_");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "bn{M?1irtkI{D7Yd");
      DNADraw dNADraw0 = new DNADraw(stack0, stack0, stack0, stack0);
      UserGraph userGraph0 = null;
      try {
        userGraph0 = new UserGraph(dNADraw0, "m+H^qH{G^Xrs_o_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.UserGraph", e);
      }
  }
}
