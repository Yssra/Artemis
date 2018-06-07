/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Apr 10 11:38:57 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RecordFilter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.variant.RecordFilter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RecordFilter_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "htsjdk.samtools.FileTruncatedException",
      "uk.ac.sanger.artemis.components.variant.HeaderLine",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.components.variant.RecordFilter",
      "uk.ac.sanger.artemis.util.FTPSeekableStream",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.components.variant.VCFview",
      "htsjdk.samtools.SAMException",
      "htsjdk.samtools.util.BlockCompressedInputStream",
      "uk.ac.sanger.artemis.components.variant.TabixReader$TIntv",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.components.variant.AbstractVCFReader",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.apache.log4j.or.DefaultRenderer",
      "htsjdk.samtools.util.BlockGunzipper",
      "uk.ac.sanger.artemis.components.variant.BCFReader$BCFReaderIterator",
      "htsjdk.samtools.seekablestream.SeekableBufferedStream",
      "htsjdk.samtools.seekablestream.SeekableHTTPStream",
      "uk.ac.sanger.artemis.ChangeListener",
      "htsjdk.samtools.SAMFormatException",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$AttributeFilter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.spi.ThrowableRenderer",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "htsjdk.samtools.seekablestream.SeekableFileStream",
      "uk.ac.sanger.artemis.components.variant.TabixReader",
      "htsjdk.samtools.util.BlockCompressedInputStream$DecompressedBlock",
      "org.apache.log4j.Appender",
      "uk.ac.sanger.artemis.FeatureVector",
      "htsjdk.samtools.util.RuntimeIOException",
      "uk.ac.sanger.artemis.components.variant.VariantBase",
      "uk.ac.sanger.artemis.components.variant.CDSFeature",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.log4j.spi.ErrorHandler",
      "htsjdk.samtools.util.BlockCompressedInputStream$FileTermination",
      "uk.ac.sanger.artemis.components.variant.VCFRecord",
      "uk.ac.sanger.artemis.components.variant.BCFReader",
      "htsjdk.samtools.util.zip.InflaterFactory",
      "org.apache.log4j.spi.RendererSupport",
      "htsjdk.samtools.util.LocationAware",
      "uk.ac.sanger.artemis.components.variant.TabixReader$Iterator",
      "htsjdk.samtools.seekablestream.SeekableStream",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.helpers.OptionConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RecordFilter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.variant.RecordFilter",
      "uk.ac.sanger.artemis.components.variant.AbstractVCFReader",
      "uk.ac.sanger.artemis.components.variant.HeaderLine",
      "uk.ac.sanger.artemis.components.variant.VCFRecord",
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
      "uk.ac.sanger.artemis.components.variant.BCFReader",
      "htsjdk.samtools.util.BlockCompressedInputStream",
      "htsjdk.samtools.util.zip.InflaterFactory",
      "htsjdk.samtools.util.BlockGunzipper",
      "htsjdk.samtools.seekablestream.SeekableStream",
      "htsjdk.samtools.seekablestream.SeekableFileStream",
      "uk.ac.sanger.artemis.components.variant.TabixReader",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute"
    );
  }
}
