/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 11:01:59 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.variant.BCFReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BCFReader_ESTest extends BCFReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RYR8~}N/TxYn";
      BCFReader.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BCFReader bCFReader0 = null;
      try {
        bCFReader0 = new BCFReader("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[1] = " :*|24rau~9{+S/k7Zm";
      // Undeclared exception!
      try { 
        BCFReader.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"*|24rau~9{+S/k7Zm\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        BCFReader.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("uk.ac.sanger.artemis.components.variant.BCFReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BCFReader bCFReader0 = null;
      try {
        bCFReader0 = new BCFReader("ftp:`hr5k\"7L]=vK/'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BCFReader bCFReader0 = null;
      try {
        bCFReader0 = new BCFReader("http:%dssaLZpyslQ");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Could not find: 
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        BCFReader.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.BCFReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BCFReader bCFReader0 = null;
      try {
        bCFReader0 = new BCFReader("ftp NOT FOUND");
        fail("Expecting exception: MalformedURLException");
      
      } catch(Throwable e) {
         //
         // no protocol: ftp NOT FOUND
         //
         verifyException("java.net.URL", e);
      }
  }
}
