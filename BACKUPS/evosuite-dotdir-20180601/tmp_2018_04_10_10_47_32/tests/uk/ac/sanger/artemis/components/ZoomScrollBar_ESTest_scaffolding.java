/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Apr 10 12:39:49 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ZoomScrollBar_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.ZoomScrollBar"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ZoomScrollBar_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.GotoEventSource",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "uk.ac.sanger.artemis.components.FeatureDisplay$11",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.OptionChangeEvent",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.components.ZoomScrollBar$1",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.components.ZoomScrollBar$2",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "uk.ac.sanger.artemis.GotoEvent",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.components.SegmentBorder",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "uk.ac.sanger.artemis.components.FeatureEdit",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "uk.ac.sanger.artemis.components.FeatureDisplay$12",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "uk.ac.sanger.artemis.components.FeatureDisplay$1",
      "uk.ac.sanger.artemis.GotoListener",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("uk.ac.sanger.artemis.components.FeatureDisplay", false, ZoomScrollBar_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ZoomScrollBar_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.components.ZoomScrollBar$1",
      "uk.ac.sanger.artemis.components.ZoomScrollBar$2",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay$1",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.EntryVector",
      "uk.ac.sanger.artemis.SimpleEntryGroup",
      "uk.ac.sanger.artemis.ActionController",
      "uk.ac.sanger.artemis.ActionVector",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "uk.ac.sanger.artemis.SimpleGotoEventSource",
      "uk.ac.sanger.artemis.components.EntryGroupPanel$1",
      "uk.ac.sanger.artemis.util.Document",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.components.LogViewer",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "uk.ac.sanger.artemis.components.FeatureDisplay$10",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.FeaturePatternPredicate",
      "uk.ac.sanger.artemis.FilteredEntryGroup",
      "uk.ac.sanger.artemis.FilteredEntryGroup$1",
      "uk.ac.sanger.artemis.FilteredEntryGroup$2",
      "uk.ac.sanger.artemis.FilteredEntryGroup$3",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "uk.ac.sanger.artemis.io.GFFEntryInformation",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.FeatureFromVectorPredicate",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "uk.ac.sanger.artemis.components.FeatureDisplay$6",
      "uk.ac.sanger.artemis.components.FeatureDisplay$7",
      "uk.ac.sanger.artemis.components.FeatureDisplay$8",
      "uk.ac.sanger.artemis.FeatureKeyQualifierPredicate",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry$1",
      "uk.ac.sanger.artemis.Entry$FeatureEnumerator",
      "uk.ac.sanger.artemis.components.SelectionViewer",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.FeaturePredicateVector",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.FeatureKeyPredicate",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "org.biojava.utils.AbstractChangeable",
      "org.biojava.bio.symbol.AbstractSymbolList",
      "org.biojava.bio.symbol.SimpleSymbolList"
    );
  }
}
