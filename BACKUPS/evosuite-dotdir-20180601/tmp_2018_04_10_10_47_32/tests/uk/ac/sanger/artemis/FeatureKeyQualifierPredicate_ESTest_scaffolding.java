/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Apr 10 12:18:06 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class FeatureKeyQualifierPredicate_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.FeatureKeyQualifierPredicate"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T/"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.dir", "/Users/kp11/workspace/applications/Artemis-build-ci/Artemis"); 
    java.lang.System.setProperty("user.home", "/Users/kp11"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "kp11"); 
    java.lang.System.setProperty("user.timezone", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FeatureKeyQualifierPredicate_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.sequence.MarkerChangeEvent",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.OptionChangeEvent",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.FeatureKeyQualifierPredicate"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("uk.ac.sanger.artemis.Feature", false, FeatureKeyQualifierPredicate_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("uk.ac.sanger.artemis.io.Key", false, FeatureKeyQualifierPredicate_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("uk.ac.sanger.artemis.io.Qualifier", false, FeatureKeyQualifierPredicate_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FeatureKeyQualifierPredicate_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.FeatureKeyQualifierPredicate",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.io.Qualifier"
    );
  }
}
