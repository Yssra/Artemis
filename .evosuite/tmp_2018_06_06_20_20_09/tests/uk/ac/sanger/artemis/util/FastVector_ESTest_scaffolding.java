/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jun 06 19:28:56 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class FastVector_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.util.FastVector"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FastVector_ESTest_scaffolding.class.getClassLoader() ,
      "htsjdk.variant.vcf.VCFHeaderLine",
      "htsjdk.variant.variantcontext.Genotype",
      "htsjdk.variant.variantcontext.Allele",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "htsjdk.variant.vcf.VCFHeader",
      "htsjdk.variant.vcf.VCFHeader$HEADER_FIELDS",
      "htsjdk.variant.variantcontext.CommonInfo",
      "htsjdk.tribble.TribbleException$InvalidHeader",
      "htsjdk.tribble.util.ParsingUtils",
      "htsjdk.samtools.util.Log$LogLevel",
      "htsjdk.variant.vcf.VCFHeaderVersion",
      "htsjdk.tribble.TribbleException",
      "htsjdk.samtools.seekablestream.SeekablePathStream",
      "htsjdk.variant.variantcontext.VariantContext$Validation",
      "htsjdk.variant.vcf.VCFCompoundHeaderLine",
      "htsjdk.tribble.Feature",
      "htsjdk.tribble.util.URLHelper",
      "htsjdk.tribble.TribbleException$InternalCodecException",
      "htsjdk.variant.vcf.VCFFilterHeaderLine",
      "htsjdk.samtools.util.Locatable",
      "htsjdk.variant.vcf.VCFSimpleHeaderLine",
      "htsjdk.samtools.SAMException",
      "htsjdk.variant.vcf.VCFContigHeaderLine",
      "uk.ac.sanger.artemis.util.FastVector",
      "htsjdk.samtools.SAMSequenceDictionary",
      "htsjdk.variant.variantcontext.VariantContextComparator",
      "htsjdk.variant.vcf.VCFIDHeaderLine",
      "htsjdk.variant.variantcontext.GenotypesContext",
      "htsjdk.samtools.seekablestream.SeekableStream",
      "htsjdk.samtools.util.Log",
      "htsjdk.variant.variantcontext.StructuralVariantType",
      "htsjdk.variant.vcf.VCFInfoHeaderLine",
      "htsjdk.variant.vcf.VCFFormatHeaderLine",
      "htsjdk.variant.variantcontext.VariantContext",
      "htsjdk.samtools.SAMSequenceRecord",
      "htsjdk.variant.variantcontext.VariantContext$Type",
      "htsjdk.variant.variantcontext.VariantContextBuilder"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, FastVector_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FastVector_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.util.FastVector",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "htsjdk.samtools.SAMSequenceRecord",
      "htsjdk.variant.vcf.VCFHeader",
      "htsjdk.tribble.util.ParsingUtils",
      "htsjdk.variant.vcf.VCFHeaderLine",
      "htsjdk.variant.vcf.VCFHeaderVersion",
      "htsjdk.variant.vcf.VCFHeader$HEADER_FIELDS",
      "htsjdk.samtools.util.Log$LogLevel",
      "htsjdk.samtools.util.Log",
      "htsjdk.samtools.SAMSequenceDictionary",
      "htsjdk.variant.variantcontext.GenotypesContext",
      "htsjdk.variant.variantcontext.VariantContext$Validation",
      "htsjdk.variant.variantcontext.VariantContext"
    );
  }
}
