/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 11:21:33 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.KeyVector;
import uk.ac.sanger.artemis.io.MSPcrunchEntryInformation;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierInfo;
import uk.ac.sanger.artemis.io.StreamQualifier;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StreamQualifier_ESTest extends StreamQualifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Qualifier qualifier0 = StreamQualifier.makeStreamQualifier(" but the variation reference allele has length ", " but the variation reference allele has length ", blastEntryInformation0);
      assertEquals(" but the variation reference allele has length ", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("hit the end of line while looking for a \"");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      String string0 = StreamQualifier.readValue(bufferedReader0);
      assertEquals("hit the end of line while looking for a \"", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1/^L2%73");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      StreamQualifier.readValue(bufferedReader0);
      try { 
        StreamQualifier.readName(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // zero length qualifier name read from this string: ^L2%73
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"X9ZWJo9N+5bSq4ft");
      stringReader0.read();
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      try { 
        StreamQualifier.readName(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // failed to read a qualifier name from this string: X9ZWJo9N+5bSq4ft
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamQualifier.toStringVector((QualifierInfo) null, (Qualifier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamQualifier.toString((QualifierInfo) null, (Qualifier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamQualifier.readValue((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("hit the end of line while looking for a \"");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      stringReader0.close();
      try { 
        StreamQualifier.readValue(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamQualifier.readName((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" *6jJ1F>}S}z*v");
      stringReader0.close();
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      try { 
        StreamQualifier.readName(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      // Undeclared exception!
      try { 
        StreamQualifier.makeStreamQualifier("", (String) null, mSPcrunchEntryInformation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      try { 
        StreamQualifier.makeStreamQualifier("\"\"bW", "Ok7S8dwU6oE#wD%\"", mSPcrunchEntryInformation0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // unbalanced quotes: Ok7S8dwU6oE#wD%\"
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      try { 
        StreamQualifier.makeStreamQualifier("\"}qcu]g", "\"}qcu]g", blastEntryInformation0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // unbalanced quotes: \"}qcu]g
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Qualifier qualifier0 = StreamQualifier.makeStreamQualifier("5u(HWC{", "\"\"", blastEntryInformation0);
      assertEquals("5u(HWC{", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      Qualifier qualifier0 = StreamQualifier.makeStreamQualifier("", "B(q*Q~<|y>fz", mSPcrunchEntryInformation0);
      assertEquals("", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("Y!+}}C7o/ 'uC|c", 8, (KeyVector) null, (KeyVector) null, false);
      String[] stringArray0 = new String[7];
      stringArray0[1] = "Y!+}}C7o/ 'uC|c";
      StringVector stringVector0 = new StringVector(stringArray0);
      Qualifier qualifier0 = new Qualifier("\"X9ZWJo9N+5bSq4ft", stringVector0);
      String string0 = StreamQualifier.toString(qualifierInfo0, qualifier0);
      assertEquals("/\"X9ZWJo9N+5bSq4ft/\"X9ZWJo9N+5bSq4ft=\"Y!+}}C7o/ 'uC|c\"/\"X9ZWJo9N+5bSq4ft/\"X9ZWJo9N+5bSq4ft/\"X9ZWJo9N+5bSq4ft/\"X9ZWJo9N+5bSq4ft/\"X9ZWJo9N+5bSq4ft", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      Qualifier qualifier0 = StreamQualifier.makeStreamQualifier("$oelx'8[j\b", "", mSPcrunchEntryInformation0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("$oelx'8[j\b", 4, (KeyVector) null, (KeyVector) null, true);
      StringVector stringVector0 = StreamQualifier.toStringVector(qualifierInfo0, qualifier0);
      assertEquals("[/$oelx'8[j\b=\"\"]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("(7\")qd'h^5T1{", "}");
      QualifierInfo qualifierInfo0 = new QualifierInfo("v)gqBzI[)st.7]Aw|$9", 1, (KeyVector) null, (KeyVector) null, false);
      String string0 = StreamQualifier.toString(qualifierInfo0, qualifier0);
      assertEquals("/(7\")qd'h^5T1{=\"}\"", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(7\"qd'h^T1{");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 43);
      try { 
        StreamQualifier.readValue(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // hit the end of line while looking for a \")\"
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+\t");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 39);
      String string0 = StreamQualifier.readValue(bufferedReader0);
      assertEquals("+", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\n");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 1554);
      String string0 = StreamQualifier.readValue(bufferedReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(7\")qd'h^5T1{");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 43);
      String string0 = StreamQualifier.readValue(bufferedReader0);
      assertEquals("(7\")", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"\"");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      String string0 = StreamQualifier.readValue(bufferedReader0);
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("/?|\"+k!I1&mCf-$J'$gd");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2);
      try { 
        StreamQualifier.readName(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // zero length qualifier name read from this string: ?|\"+k!I1&mCf-$J'$gd
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("/null");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      String string0 = StreamQualifier.readName(bufferedReader0);
      assertEquals("null", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("$oelx'8[j\b");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      try { 
        StreamQualifier.readName(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // failed to read a qualifier name from this string: $oelx'8[j\b
         //
         verifyException("uk.ac.sanger.artemis.io.StreamQualifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("/null=\"\"");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      String string0 = StreamQualifier.readName(bufferedReader0);
      assertEquals("null", string0);
      
      String string1 = StreamQualifier.readValue(bufferedReader0);
      assertEquals("=\"\"", string1);
      
      String string2 = StreamQualifier.readValue(bufferedReader0);
      assertFalse(string2.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" ");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      String string0 = StreamQualifier.readName(bufferedReader0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\n");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 97);
      String string0 = StreamQualifier.readName(bufferedReader0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Qualifier qualifier0 = StreamQualifier.makeStreamQualifier("value", "\n", blastEntryInformation0);
      qualifier0.addValues((StringVector) null);
      StringVector stringVector0 = StreamQualifier.toStringVector((QualifierInfo) null, qualifier0);
      assertEquals("[/value= , /value]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, true);
      Qualifier qualifier0 = new Qualifier("");
      StringVector stringVector0 = StreamQualifier.toStringVector(qualifierInfo0, qualifier0);
      assertEquals("[/]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, true);
      Qualifier qualifier0 = new Qualifier("");
      String string0 = StreamQualifier.toString(qualifierInfo0, qualifier0);
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, true);
      Qualifier qualifier0 = StreamQualifier.makeStreamQualifier("3UWm)ryI", "\"", blastEntryInformation0);
      String string0 = StreamQualifier.toString(qualifierInfo0, qualifier0);
      assertEquals("/3UWm)ryI=\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, true);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      Qualifier qualifier0 = StreamQualifier.makeStreamQualifier("3UWm)ryI", "\"", blastEntryInformation0);
      assertEquals("3UWm)ryI", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      QualifierInfo qualifierInfo0 = new QualifierInfo("", 0, (KeyVector) null, (KeyVector) null, true);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      Qualifier qualifier0 = StreamQualifier.makeStreamQualifier("}", "", blastEntryInformation0);
      assertEquals("}", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StreamQualifier streamQualifier0 = new StreamQualifier();
  }
}
