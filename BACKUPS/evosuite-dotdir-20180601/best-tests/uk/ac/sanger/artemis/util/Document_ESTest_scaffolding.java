/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Apr 10 12:58:12 GMT 2018
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
public class Document_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.util.Document"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Document_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "org.gmod.schema.dao.CvDaoI",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "com.sshtools.ssh.Client",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.apache.log4j.Logger",
      "com.sshtools.ssh.SshTransport",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.util.ZipFileDocument",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "org.apache.log4j.helpers.ThreadLocalMap",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "com.sshtools.ssh.SshException",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.util.URLDocument",
      "uk.ac.sanger.artemis.util.TextDocument",
      "uk.ac.sanger.artemis.j2ssh.FileTransferProgressMonitor",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "com.sshtools.ssh.SshAuthentication",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.apache.log4j.or.DefaultRenderer",
      "org.gmod.schema.sequence.Feature",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "org.gmod.schema.dao.SchemaDaoI",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "org.apache.log4j.helpers.Loader",
      "org.gmod.schema.utils.Rankable",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.gmod.schema.organism.Organism",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "com.sshtools.sftp.FileTransferProgress",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "com.sshtools.ssh.SshClient",
      "org.apache.log4j.MDC",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "com.sshtools.sftp.SftpFileAttributes",
      "org.gmod.schema.dao.SequenceDaoI",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.util.PushBackException",
      "org.apache.log4j.Priority",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.LineGroup",
      "com.sshtools.ssh.SshIO",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "org.apache.log4j.spi.LoggerRepository",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.gmod.schema.dao.BaseDaoI",
      "org.gmod.schema.dao.PubDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "uk.ac.sanger.artemis.util.InputStreamProgressEvent"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("uk.ac.sanger.artemis.util.InputStreamProgressListener", false, Document_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Document_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.util.Document",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.util.ByteBuffer",
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
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "org.apache.log4j.helpers.ThreadLocalMap",
      "org.apache.log4j.MDC",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.gmod.schema.sequence.Feature",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "uk.ac.sanger.artemis.util.ZipFileDocument",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.sequence.MarkerInternal",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.j2ssh.FileTransferProgressMonitor",
      "uk.ac.sanger.artemis.j2ssh.SshFileManager",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "uk.ac.sanger.artemis.components.database.DatabaseEntrySource",
      "uk.ac.sanger.artemis.io.UI$UIMode",
      "uk.ac.sanger.artemis.io.UI",
      "uk.ac.sanger.artemis.components.database.DatabaseLoginPrompt",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.components.LogViewer",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox$ComboBoxRenderer",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox$ComboPopupMenuLister",
      "uk.ac.sanger.artemis.components.database.DatabaseLoginPrompt$1",
      "uk.ac.sanger.artemis.util.TextDocument",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.util.URLDocument",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "org.biojava.bio.seq.db.SimpleIndex",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "uk.ac.sanger.artemis.chado.DbSqlConfig",
      "com.ibatis.common.resources.Resources",
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
      "com.ibatis.sqlmap.engine.impl.SqlMapSessionImpl",
      "com.ibatis.sqlmap.engine.scope.SessionScope",
      "com.ibatis.sqlmap.engine.transaction.TransactionState",
      "com.ibatis.sqlmap.engine.transaction.jdbc.JdbcTransaction",
      "com.ibatis.sqlmap.engine.transaction.IsolationLevel",
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
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.io.BlastDocumentEntry",
      "uk.ac.sanger.artemis.io.BlastEntryInformation",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "com.ibatis.common.xml.NodeletException"
    );
  }
}
