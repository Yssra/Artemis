/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Sep 20 12:19:38 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BioJavaFeature_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.io.BioJavaFeature"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BioJavaFeature_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.io.BioJavaFeature",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "org.biojava.bio.symbol.CircularLocation",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.Feature",
      "org.biojava.bio.Annotation",
      "org.biojava.bio.seq.Sequence",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "org.biojava.ontology.InvalidTermException",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "org.biojava.ontology.Term",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.seq.FeatureFilter",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "org.biojava.utils.ChangeListener",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.io.RangeVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.biojava.bio.symbol.LocationTools",
      "org.biojava.bio.symbol.AbstractLocationDecorator",
      "org.biojava.bio.symbol.AbstractRangeLocation",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.biojava.bio.symbol.MergeLocation",
      "org.biojava.bio.seq.Feature$Template",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "org.biojava.bio.symbol.PointLocation",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "org.biojava.bio.Annotatable",
      "org.biojava.bio.symbol.Location",
      "org.biojava.utils.Changeable",
      "org.biojava.bio.symbol.EmptyLocation",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "org.biojava.bio.seq.FeatureHolder",
      "org.biojava.ontology.OntologyException",
      "org.biojava.bio.BioError",
      "org.biojava.utils.ChangeVetoException",
      "uk.ac.sanger.artemis.io.Sequence",
      "org.biojava.bio.symbol.LocationComparator",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.io.BioJavaEntry",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "org.biojava.bio.symbol.SymbolList",
      "org.biojava.bio.BioException",
      "org.biojava.bio.symbol.AbstractLocation",
      "org.biojava.bio.symbol.RangeLocation"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BioJavaFeature_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.BioJavaFeature",
      "org.biojava.bio.symbol.EmptyLocation",
      "org.biojava.bio.symbol.AbstractLocation",
      "org.biojava.bio.symbol.AbstractRangeLocation",
      "org.biojava.bio.symbol.RangeLocation",
      "org.biojava.bio.symbol.LocationComparator",
      "org.biojava.bio.symbol.Location",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "org.biojava.bio.seq.io.GenbankFormat",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.biojava.utils.AbstractChangeable",
      "org.biojava.bio.seq.db.AbstractSequenceDB",
      "org.biojava.bio.seq.db.HashSequenceDB",
      "org.biojava.bio.seq.db.IDMaker$ByURN",
      "org.biojava.bio.seq.db.IDMaker$ByName",
      "org.biojava.bio.seq.db.IDMaker",
      "org.biojava.bio.seq.db.SequenceDBWrapper",
      "org.biojava.bio.seq.db.ViewingSequenceDB",
      "org.biojava.bio.BioException",
      "org.biojava.bio.seq.db.IllegalIDException",
      "org.biojava.bio.symbol.LocationTools",
      "org.biojava.bio.symbol.PointLocation",
      "org.biojava.bio.seq.NewSimpleAssembly",
      "org.biojava.bio.AbstractAnnotation",
      "org.biojava.bio.SimpleAnnotation",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "org.biojava.bio.seq.impl.FeatureImpl$1",
      "org.biojava.bio.seq.SimpleFeatureRealizer$TemplateImpl",
      "org.biojava.bio.seq.impl.FeatureImpl",
      "org.biojava.bio.symbol.AbstractSymbolList",
      "org.biojava.bio.seq.impl.NewAssembledSymbolList",
      "org.biojava.utils.Unchangeable",
      "org.biojava.bio.symbol.AlphabetManager$GapSymbol",
      "org.biojava.bio.symbol.AlphabetManager$SizeQueen",
      "org.biojava.bio.symbol.IntegerAlphabet",
      "org.biojava.utils.cache.WeakValueHashMap",
      "org.biojava.bio.symbol.DoubleAlphabet",
      "org.biojava.bio.symbol.AbstractSymbol",
      "org.biojava.bio.symbol.SimpleSymbol",
      "org.biojava.bio.symbol.AbstractSimpleBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownGapSymbol",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.EmptyAnnotation",
      "org.biojava.bio.Annotation",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.symbol.Alphabet",
      "org.biojava.utils.ListTools$5",
      "org.biojava.utils.ListTools",
      "org.biojava.utils.SingletonList",
      "org.biojava.utils.ClassTools",
      "org.biojava.utils.stax.SAX2StAXAdaptor",
      "org.biojava.utils.stax.StAXContentHandlerBase",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler",
      "org.biojava.utils.stax.SAX2StAXAdaptor$HandlerBinding",
      "org.biojava.utils.stax.SAX2StAXAdaptor$S2SDelegationManager",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler",
      "org.biojava.bio.SmallAnnotation",
      "org.biojava.utils.lsid.LifeScienceIdentifier",
      "org.biojava.utils.stax.StringElementHandlerBase",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler$1",
      "org.biojava.utils.SmallMap",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAtomicSymbol",
      "org.biojava.bio.symbol.FundamentalAtomicSymbol",
      "org.biojava.utils.ChangeListener$AlwaysVetoListener",
      "org.biojava.utils.ChangeListener$LoggingListener",
      "org.biojava.utils.ChangeListener",
      "org.biojava.utils.ChangeSupport",
      "org.biojava.bio.Annotatable",
      "org.biojava.utils.ChangeType$1",
      "org.biojava.utils.ChangeForwarder",
      "org.biojava.utils.ChangeForwarder$Retyper",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "org.biojava.bio.symbol.SingletonAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$ImmutableWellKnownAlphabetWrapper",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler$1",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler",
      "org.biojava.bio.seq.io.CharacterTokenization",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler$MappingHandler",
      "org.biojava.bio.symbol.SimpleBasisSymbol",
      "org.biojava.bio.seq.io.AlternateTokenization",
      "org.biojava.bio.symbol.AlphabetManager",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownTokenizationWrapper",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "org.biojava.bio.seq.io.SeqIOAdapter",
      "org.biojava.bio.symbol.SimpleSymbolList$SSLIOListener",
      "org.biojava.bio.seq.io.CharacterTokenization$TPStreamParser",
      "org.biojava.bio.seq.DNATools$DNAComplementTranslationTable",
      "org.biojava.bio.symbol.AbstractTranslationTable",
      "org.biojava.bio.symbol.AbstractReversibleTranslationTable",
      "org.biojava.bio.symbol.SimpleReversibleTranslationTable",
      "org.biojava.bio.seq.RNATools$RNAComplementTranslationTable",
      "org.biojava.bio.symbol.SimpleCrossProductAlphabet",
      "org.biojava.utils.ListTools$Triplet",
      "org.biojava.bio.symbol.SimpleAtomicSymbol",
      "org.biojava.utils.cache.KeyedWeakReference",
      "org.biojava.bio.seq.io.WordTokenization",
      "org.biojava.bio.seq.io.NameTokenization",
      "org.biojava.bio.symbol.AbstractManyToOneTranslationTable",
      "org.biojava.bio.symbol.SimpleManyToOneTranslationTable",
      "org.biojava.bio.symbol.SimpleGeneticCodeTable",
      "org.biojava.bio.symbol.AbstractSymbolList$ListView",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.biojava.bio.BioError",
      "org.biojava.bio.seq.RNATools",
      "org.biojava.bio.seq.DNATools",
      "org.biojava.bio.seq.io.SequenceBuilderBase",
      "org.biojava.bio.seq.io.SimpleAssemblyBuilder$SSBFactory",
      "org.biojava.bio.seq.io.SimpleAssemblyBuilder",
      "org.biojava.bio.seq.SimpleAssembly",
      "org.biojava.bio.seq.impl.AssembledSymbolList",
      "org.biojava.bio.seq.AbstractFeatureHolder",
      "org.biojava.bio.seq.MergeFeatureHolder",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.util.Document",
      "uk.ac.sanger.artemis.util.URLDocument",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder",
      "org.biojava.bio.seq.Feature$Template",
      "org.biojava.bio.seq.StrandedFeature$Template",
      "org.biojava.bio.seq.homol.HomologyFeature$Template",
      "org.biojava.bio.seq.RemoteFeature$Template",
      "org.biojava.bio.seq.impl.SimpleFeature",
      "uk.ac.sanger.artemis.io.GFFEntryInformation",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
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
      "uk.ac.sanger.artemis.util.FileDocument",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.components.LogViewer",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "org.biojava.bio.seq.io.SimpleSequenceBuilder$SSBFactory",
      "org.biojava.bio.seq.io.SimpleSequenceBuilder",
      "org.biojava.bio.seq.io.ChunkedSymbolListFactory",
      "org.biojava.bio.symbol.SimpleSymbolListFactory",
      "org.biojava.bio.symbol.SymbolListViews",
      "org.biojava.bio.symbol.EmptySymbolList",
      "org.biojava.bio.seq.impl.SimpleSequence",
      "org.biojava.bio.molbio.RestrictionSite$Template",
      "org.biojava.bio.seq.impl.SimpleStrandedFeature",
      "org.biojava.bio.seq.impl.SimpleRestrictionSite",
      "org.biojava.bio.seq.homol.SimilarityPairFeature$Template",
      "org.postgresql.largeobject.LargeObject",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.BioJavaEntry",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.io.FeatureTree",
      "uk.ac.sanger.artemis.io.FeatureComparator",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "org.biojava.bio.seq.impl.ViewSequence",
      "org.biojava.bio.seq.CircularView",
      "org.biojava.bio.seq.FramedFeature$Template",
      "org.biojava.bio.seq.impl.SimpleFramedFeature",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.seq.ComponentFeature$Template",
      "org.biojava.bio.seq.io.SequenceDBSequenceBuilder",
      "org.biojava.bio.seq.io.SequenceBuilderFilter",
      "org.biojava.bio.seq.io.EmblProcessor",
      "org.biojava.bio.seq.io.FeatureTableParser",
      "org.biojava.bio.seq.io.EmblLikeLocationParser",
      "org.biojava.bio.seq.StrandedFeature$Strand",
      "org.biojava.bio.seq.StrandedFeature",
      "org.biojava.bio.seq.io.EmblLikeLocationParser$LocationLexer",
      "org.biojava.ontology.Ontology$Impl",
      "org.biojava.ontology.DefaultOps",
      "org.biojava.ontology.Ontology$Impl$1",
      "org.biojava.ontology.OntologyTerm$Impl",
      "uk.ac.sanger.artemis.io.BlastEntryInformation",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.io.MSPcrunchDocumentEntry",
      "uk.ac.sanger.artemis.io.MSPcrunchEntryInformation",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.io.LocationLexer",
      "uk.ac.sanger.artemis.io.LocationLexer$TokenEnumeration",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "org.biojava.bio.seq.impl.SimpleRemoteFeature$DBResolver",
      "org.biojava.bio.seq.impl.SimpleSimilarityPairFeature",
      "org.biojava.bio.seq.AcceptAllFilter",
      "org.biojava.bio.seq.AcceptNoneFilter",
      "org.biojava.bio.seq.IsTopLevel",
      "org.biojava.utils.walker.WalkerFactory",
      "org.biojava.utils.bytecode.GeneratedClassLoader",
      "org.biojava.bio.seq.FeatureFilter$OnlyChildren",
      "org.biojava.bio.seq.FeatureFilter",
      "org.biojava.bio.seq.SimpleFeatureHolder",
      "org.biojava.utils.ListTools$1",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "org.biojava.bio.seq.io.SequenceBuilderBase$TemplateWithChildren",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "org.apache.log4j.helpers.ThreadLocalMap",
      "org.apache.log4j.MDC",
      "org.biojava.bio.seq.io.GAMEFormat",
      "org.biojava.bio.seq.io.EmblLikeFormat",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "uk.ac.sanger.artemis.chado.DbSqlConfig",
      "com.ibatis.common.resources.Resources",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.biojava.bio.seq.impl.SimpleRemoteFeature",
      "org.biojava.bio.seq.io.FastaDescriptionLineParser",
      "org.biojava.bio.seq.io.SwissprotProcessor",
      "org.biojava.bio.seq.io.SwissprotFeatureTableParser",
      "com.ibatis.sqlmap.client.SqlMapClientBuilder",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser",
      "com.ibatis.common.xml.NodeletParser",
      "com.ibatis.sqlmap.engine.builder.xml.XmlParserState",
      "com.ibatis.common.beans.BaseProbe",
      "com.ibatis.common.beans.DomProbe",
      "com.ibatis.common.beans.ComplexBeanProbe",
      "com.ibatis.common.beans.GenericProbe",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "com.ibatis.sqlmap.engine.scope.ErrorContext",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory$1",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "com.ibatis.sqlmap.engine.type.BaseTypeHandler",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "com.ibatis.sqlmap.engine.type.BooleanTypeHandler",
      "com.ibatis.sqlmap.engine.type.ByteTypeHandler",
      "com.ibatis.sqlmap.engine.type.ShortTypeHandler",
      "com.ibatis.sqlmap.engine.type.IntegerTypeHandler",
      "com.ibatis.sqlmap.engine.type.LongTypeHandler",
      "com.ibatis.sqlmap.engine.type.FloatTypeHandler",
      "com.ibatis.sqlmap.engine.type.DoubleTypeHandler",
      "com.ibatis.sqlmap.engine.type.StringTypeHandler",
      "com.ibatis.sqlmap.engine.type.CustomTypeHandler",
      "com.ibatis.sqlmap.engine.type.ClobTypeHandlerCallback",
      "com.ibatis.sqlmap.engine.type.BigDecimalTypeHandler",
      "com.ibatis.sqlmap.engine.type.ByteArrayTypeHandler",
      "com.ibatis.sqlmap.engine.type.BlobTypeHandlerCallback",
      "com.ibatis.sqlmap.engine.type.ObjectTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "com.ibatis.sqlmap.engine.exchange.DataExchangeFactory",
      "com.ibatis.sqlmap.engine.exchange.BaseDataExchange",
      "com.ibatis.sqlmap.engine.exchange.DomDataExchange",
      "com.ibatis.sqlmap.engine.exchange.ListDataExchange",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "com.ibatis.sqlmap.engine.exchange.PrimitiveDataExchange",
      "com.ibatis.common.logging.LogFactory",
      "com.ibatis.common.logging.jakarta.JakartaCommonsLoggingImpl",
      "org.apache.commons.logging.impl.Log4JLogger",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapClasspathEntityResolver",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$1",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$2",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$3",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$4",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$5",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$6",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$7",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$8",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$9",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$10",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$11",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$12",
      "com.ibatis.common.xml.NodeletParser$1",
      "com.ibatis.common.xml.NodeletParser$Path",
      "com.ibatis.common.xml.NodeletUtils",
      "com.ibatis.common.beans.ClassInfo",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlanFactory",
      "com.ibatis.common.beans.MethodInvoker",
      "com.ibatis.common.beans.SetFieldInvoker",
      "com.ibatis.common.beans.GetFieldInvoker",
      "com.ibatis.sqlmap.engine.datasource.SimpleDataSourceFactory",
      "com.ibatis.common.jdbc.SimpleDataSource",
      "org.postgresql.util.SharedTimer",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.postgresql.Driver",
      "com.ibatis.sqlmap.engine.transaction.BaseTransactionConfig",
      "com.ibatis.sqlmap.engine.transaction.jdbc.JdbcTransactionConfig",
      "com.ibatis.sqlmap.engine.transaction.TransactionManager",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser",
      "com.ibatis.sqlmap.engine.builder.xml.SqlStatementParser",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$1",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$2",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$3",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$4",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$5",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$6",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$7",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$8",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$9",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$10",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$11",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$12",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$13",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$14",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$15",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$16",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$17",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$18",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$19",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$20",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$21",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$22",
      "com.ibatis.sqlmap.engine.config.ResultMapConfig",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMap",
      "com.ibatis.sqlmap.engine.exchange.JavaBeanDataExchange",
      "com.ibatis.sqlmap.engine.accessplan.BaseAccessPlan",
      "com.ibatis.sqlmap.engine.accessplan.EnhancedPropertyAccessPlan",
      "net.sf.cglib.core.CollectionUtils",
      "net.sf.cglib.core.TypeUtils",
      "net.sf.cglib.core.Signature",
      "net.sf.cglib.asm.Type",
      "net.sf.cglib.core.KeyFactory$1",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.AbstractClassGenerator",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "net.sf.cglib.core.KeyFactory$Generator",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "net.sf.cglib.asm.ClassWriter",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.asm.ByteVector",
      "net.sf.cglib.asm.Item",
      "net.sf.cglib.asm.ClassAdapter",
      "net.sf.cglib.core.ClassEmitter",
      "net.sf.cglib.core.ReflectUtils$1",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "net.sf.cglib.core.ClassInfo",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "net.sf.cglib.core.EmitUtils",
      "net.sf.cglib.asm.MethodWriter",
      "net.sf.cglib.asm.Label",
      "net.sf.cglib.core.Constants",
      "net.sf.cglib.asm.MethodAdapter",
      "net.sf.cglib.core.LocalVariablesSorter",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.core.LocalVariablesSorter$State",
      "net.sf.cglib.core.MethodInfo",
      "net.sf.cglib.core.CodeEmitter$State",
      "net.sf.cglib.asm.Frame",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "net.sf.cglib.asm.FieldWriter",
      "net.sf.cglib.asm.Edge",
      "net.sf.cglib.core.EmitUtils$7",
      "net.sf.cglib.core.Local",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "net.sf.cglib.asm.ClassReader",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.core.ClassNameReader$1",
      "net.sf.cglib.beans.BulkBean",
      "net.sf.cglib.beans.BulkBean$Generator",
      "net.sf.cglib.beans.BulkBeanEmitter",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMapping",
      "com.ibatis.sqlmap.engine.type.JdbcTypeRegistry",
      "net.sf.cglib.core.ReflectUtils$3",
      "net.sf.cglib.core.ReflectUtils$4",
      "net.sf.cglib.core.Block",
      "net.sf.cglib.asm.Handler",
      "com.ibatis.sqlmap.engine.mapping.statement.MappedStatement",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectStatement",
      "com.ibatis.sqlmap.engine.mapping.parameter.InlineParameterMapParser",
      "com.ibatis.sqlmap.engine.builder.xml.XMLSqlSource",
      "com.ibatis.sqlmap.engine.config.MappedStatementConfig",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.DynamicSql",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlText",
      "com.ibatis.sqlmap.engine.mapping.sql.raw.RawSql",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap",
      "com.ibatis.sqlmap.engine.mapping.sql.simple.SimpleDynamicSql",
      "com.ibatis.sqlmap.engine.cache.CacheKey",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMapping",
      "com.ibatis.sqlmap.engine.mapping.sql.stat.StaticSql",
      "com.ibatis.sqlmap.engine.cache.lru.LruCacheController",
      "com.ibatis.sqlmap.engine.config.CacheModelConfig",
      "com.ibatis.sqlmap.engine.cache.CacheModel",
      "com.ibatis.sqlmap.engine.accessplan.ComplexAccessPlan",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.BaseTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.ConditionalTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEmptyTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEqualTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterEqualTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterThanTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessEqualTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessThanTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEmptyTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEqualTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNullTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotNullTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsParameterPresentTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotParameterPresentTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsPropertyAvailableTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotPropertyAvailableTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.DynamicTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandlerFactory",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTag",
      "com.ibatis.sqlmap.engine.mapping.statement.CachingStatement",
      "com.ibatis.sqlmap.engine.mapping.statement.InsertStatement",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "com.ibatis.sqlmap.engine.config.ParameterMapConfig",
      "com.ibatis.common.beans.ProbeException",
      "net.sf.cglib.beans.BulkBeanException",
      "com.ibatis.sqlmap.engine.mapping.result.AutoResultMap",
      "com.ibatis.sqlmap.engine.mapping.statement.UpdateStatement",
      "com.ibatis.sqlmap.engine.mapping.statement.DeleteStatement",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectKeyStatement",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "com.ibatis.sqlmap.engine.impl.SqlMapSessionImpl",
      "com.ibatis.sqlmap.engine.scope.SessionScope",
      "com.ibatis.sqlmap.engine.transaction.TransactionState",
      "com.ibatis.sqlmap.engine.transaction.jdbc.JdbcTransaction",
      "com.ibatis.sqlmap.engine.transaction.IsolationLevel",
      "org.gmod.schema.sequence.Feature",
      "uk.ac.sanger.artemis.chado.ArtemisUtils",
      "com.ibatis.sqlmap.engine.scope.StatementScope",
      "com.ibatis.sqlmap.engine.mapping.statement.DefaultRowHandler",
      "com.ibatis.common.jdbc.SimpleDataSource$SimplePooledConnection",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.BaseHashMap",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.HashIndex",
      "org.hsqldb.map.ValuePool",
      "org.postgresql.Driver$1",
      "org.postgresql.PGProperty",
      "org.biojava.ontology.OntoTools$1",
      "org.biojava.ontology.IntegerOntology",
      "org.biojava.ontology.io.TabDelimParser",
      "org.biojava.ontology.AbstractTerm",
      "org.biojava.ontology.Term$Impl",
      "org.biojava.ontology.Triple$Impl",
      "org.biojava.ontology.OntoTools",
      "org.biojava.bio.molbio.RestrictionMapper",
      "org.biojava.bio.seq.impl.SimpleHomologyFeature",
      "org.biojava.utils.SimpleThreadPool",
      "org.biojava.utils.SimpleThreadPool$PooledThread",
      "org.biojava.bio.seq.db.IndexedSequenceDB",
      "org.biojava.bio.seq.db.SubSequenceDB",
      "org.biojava.bio.seq.db.DummySequenceDB",
      "org.biojava.bio.seq.impl.DummySequence",
      "org.biojava.bio.seq.FeatureHolder",
      "org.biojava.bio.symbol.SymbolList",
      "org.biojava.bio.seq.db.CachingSequenceDB",
      "org.biojava.bio.dp.SimpleWeightMatrix",
      "uk.ac.sanger.artemis.util.TextDocument",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "org.biojava.bio.PropertyConstraint$Enumeration",
      "org.biojava.bio.seq.db.BioIndex$1",
      "org.biojava.bio.seq.db.BioIndex",
      "org.biojava.bio.seq.db.BioIndex$ListAsSet",
      "org.biojava.bio.program.phred.PhredFormat",
      "org.biojava.bio.dp.ScoreType$Probability",
      "org.biojava.bio.dp.ScoreType$Odds",
      "org.biojava.bio.dp.ScoreType$NullModel",
      "org.biojava.bio.dp.ScoreType",
      "org.biojava.bio.dp.WeightMatrixAnnotator",
      "org.biojava.bio.symbol.DNANoAmbPack",
      "org.biojava.bio.seq.io.CrossProductTokenization",
      "org.biojava.bio.seq.io.SmartSequenceBuilder$SSBFactory",
      "org.biojava.bio.seq.io.SmartSequenceBuilder",
      "org.biojava.bio.seq.io.StreamReader",
      "org.biojava.bio.symbol.PackedSymbolListFactory",
      "uk.ac.sanger.artemis.io.FuzzyRange",
      "org.biojava.bio.seq.db.AnnotatedSequenceDB",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "org.biojava.bio.symbol.MergeLocation",
      "uk.ac.sanger.artemis.io.LowerInteger",
      "uk.ac.sanger.artemis.components.genebuilder.GeneUtils",
      "uk.ac.sanger.artemis.EntryVector",
      "uk.ac.sanger.artemis.SimpleEntryGroup",
      "uk.ac.sanger.artemis.ActionController",
      "uk.ac.sanger.artemis.ActionVector",
      "uk.ac.sanger.artemis.FilteredEntryGroup",
      "uk.ac.sanger.artemis.FilteredEntryGroup$1",
      "uk.ac.sanger.artemis.FilteredEntryGroup$2",
      "uk.ac.sanger.artemis.FilteredEntryGroup$3",
      "uk.ac.sanger.artemis.FeatureFromVectorPredicate",
      "org.biojava.bio.seq.io.GenpeptFormat",
      "org.biojava.bio.seq.io.ProteinRefSeqProcessor$Factory",
      "org.biojava.bio.seq.io.GenbankProcessor",
      "org.biojava.bio.seq.io.ProteinRefSeqProcessor",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "org.biojava.bio.seq.FeatureFilter$ByType",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.ReadOnlyEmblStreamFeature",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.biojava.bio.seq.io.SwissprotProcessor$Factory",
      "org.biojava.bio.seq.db.TabIndexStore",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry$1",
      "uk.ac.sanger.artemis.Entry$FeatureEnumerator",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.components.LogReadListener",
      "com.ibatis.common.xml.NodeletException",
      "uk.ac.sanger.artemis.util.ZipFileDocument",
      "org.biojava.bio.seq.projection.ProjectedFeatureHolder",
      "org.biojava.bio.seq.projection.ReparentContext",
      "org.biojava.bio.seq.projection.ProjectedFeatureHolder$1",
      "org.biojava.bio.OverlayAnnotation",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry",
      "uk.ac.sanger.artemis.util.CacheHashMap",
      "org.biojava.bio.seq.io.FastaFormat",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "uk.ac.sanger.artemis.SimpleGotoEventSource",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.components.SelectionViewer",
      "org.biojava.bio.seq.FeatureFilter$ByClass",
      "uk.ac.sanger.artemis.io.BlastDocumentEntry",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.j2ssh.SshFileManager",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "org.biojava.bio.dist.DistributionFactory$DefaultDistributionFactory",
      "org.biojava.bio.symbol.SimpleGappedSymbolList",
      "org.biojava.bio.seq.Feature$ByLocationComparator",
      "org.biojava.bio.seq.Feature",
      "org.biojava.bio.seq.io.GenbankXmlFormat",
      "uk.ac.sanger.artemis.io.GenbankDocumentEntry",
      "org.biojava.bio.seq.io.DoubleTokenization",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.io.StreamQualifier"
    );
  }
}
