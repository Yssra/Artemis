/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:07:51 GMT 2018
 */

package uk.ac.sanger.artemis.circular.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.circular.digest.FragmentBand;
import uk.ac.sanger.artemis.circular.digest.ReportDetails;
import uk.ac.sanger.artemis.circular.digest.Utils;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      Utils.findCutSitesFromEmbossReport(linePushBackReader0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.findCutSitesFromExperiment((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.findCutSitesFromEmbossReport((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReportDetails reportDetails0 = new ReportDetails();
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FeatureVector featureVector0 = new FeatureVector();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureVector0, (String) null);
      // Undeclared exception!
      Utils.createDNADrawFromReportDetails(reportDetails0, filteredEntryGroup0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      List<FragmentBand> list0 = Utils.findCutSitesFromExperiment(linePushBackReader0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      try { 
        Utils.findCutSitesFromEmbossReport(pipedReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't read, or parse results
         //
         verifyException("uk.ac.sanger.artemis.circular.digest.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Utils utils0 = new Utils();
  }
}
