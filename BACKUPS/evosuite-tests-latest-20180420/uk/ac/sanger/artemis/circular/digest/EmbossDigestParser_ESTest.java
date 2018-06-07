/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:50:12 GMT 2018
 */

package uk.ac.sanger.artemis.circular.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.digest.EmbossDigestParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmbossDigestParser_ESTest extends EmbossDigestParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("nullREBASE/embossre.enz");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "\"v=c");
      EmbossDigestParser embossDigestParser0 = new EmbossDigestParser();
      embossDigestParser0.afterPropertiesSet();
      List<String> list0 = embossDigestParser0.getDigests();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("nullREBASE/embossre.enz");
      EmbossDigestParser embossDigestParser0 = new EmbossDigestParser();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "#CS@f2;");
      embossDigestParser0.afterPropertiesSet();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmbossDigestParser embossDigestParser0 = new EmbossDigestParser();
      embossDigestParser0.setEmbossDir(")^Vj");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmbossDigestParser embossDigestParser0 = new EmbossDigestParser();
      embossDigestParser0.afterPropertiesSet();
  }
}
