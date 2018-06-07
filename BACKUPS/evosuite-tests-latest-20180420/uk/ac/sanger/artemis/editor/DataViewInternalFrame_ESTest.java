/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 11:50:41 GMT 2018
 */

package uk.ac.sanger.artemis.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.Format;
import java.util.Hashtable;
import java.util.Properties;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.editor.DataViewInternalFrame;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DataViewInternalFrame_ESTest extends DataViewInternalFrame_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Properties properties0 = new Properties();
      assertEquals(0, properties0.size());
      assertTrue(properties0.isEmpty());
      assertNotNull(properties0);
      
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertNotNull(jDesktopPane0);
      
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(properties0, jDesktopPane0, (JScrollPane) null, (-3211), (-1), "(q0~W3M]y:fUnyS", (Feature) null);
      assertEquals(0, properties0.size());
      assertTrue(properties0.isEmpty());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertFalse(dataViewInternalFrame0.getIgnoreRepaint());
      assertFalse(dataViewInternalFrame0.isFocusTraversalPolicyProvider());
      assertTrue(dataViewInternalFrame0.isFocusTraversalPolicySet());
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
      assertNotNull(dataViewInternalFrame0);
      
      // Undeclared exception!
      try { 
        dataViewInternalFrame0.reReadSelectedResults();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.DataViewInternalFrame", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JDesktopPane jDesktopPane0 = mock(JDesktopPane.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      DataViewInternalFrame dataViewInternalFrame0 = null;
      try {
        dataViewInternalFrame0 = new DataViewInternalFrame((Hashtable) null, jDesktopPane0, (JScrollPane) null, 0, 0, "a0Z9l", feature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.DataViewInternalFrame", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Hashtable<String, Format.Field> hashtable0 = new Hashtable<String, Format.Field>();
      assertEquals(0, hashtable0.size());
      assertTrue(hashtable0.isEmpty());
      assertNotNull(hashtable0);
      
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertNotNull(jDesktopPane0);
      
      JScrollPane jScrollPane0 = new JScrollPane();
      assertFalse(jScrollPane0.isFocusTraversalPolicyProvider());
      assertTrue(jScrollPane0.getFocusTraversalKeysEnabled());
      assertFalse(jScrollPane0.isFocusCycleRoot());
      assertFalse(jScrollPane0.isFocusTraversalPolicySet());
      assertFalse(jScrollPane0.getIgnoreRepaint());
      assertNotNull(jScrollPane0);
      
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, jScrollPane0, 863, 863, " ", (Feature) null);
      assertEquals(0, hashtable0.size());
      assertTrue(hashtable0.isEmpty());
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertFalse(jScrollPane0.isFocusTraversalPolicyProvider());
      assertTrue(jScrollPane0.getFocusTraversalKeysEnabled());
      assertFalse(jScrollPane0.isFocusCycleRoot());
      assertFalse(jScrollPane0.isFocusTraversalPolicySet());
      assertFalse(jScrollPane0.getIgnoreRepaint());
      assertFalse(dataViewInternalFrame0.isFocusTraversalPolicyProvider());
      assertFalse(dataViewInternalFrame0.getIgnoreRepaint());
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
      assertTrue(dataViewInternalFrame0.isFocusTraversalPolicySet());
      assertNotNull(dataViewInternalFrame0);
      
      dataViewInternalFrame0.updateNote();
      assertEquals(0, hashtable0.size());
      assertTrue(hashtable0.isEmpty());
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertFalse(jScrollPane0.isFocusTraversalPolicyProvider());
      assertTrue(jScrollPane0.getFocusTraversalKeysEnabled());
      assertFalse(jScrollPane0.isFocusCycleRoot());
      assertFalse(jScrollPane0.isFocusTraversalPolicySet());
      assertFalse(jScrollPane0.getIgnoreRepaint());
      assertFalse(dataViewInternalFrame0.isFocusTraversalPolicyProvider());
      assertFalse(dataViewInternalFrame0.getIgnoreRepaint());
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
      assertTrue(dataViewInternalFrame0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Hashtable<String, Format.Field> hashtable0 = new Hashtable<String, Format.Field>();
      assertEquals(0, hashtable0.size());
      assertTrue(hashtable0.isEmpty());
      assertNotNull(hashtable0);
      
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertNotNull(jDesktopPane0);
      
      JScrollPane jScrollPane0 = new JScrollPane();
      assertTrue(jScrollPane0.getFocusTraversalKeysEnabled());
      assertFalse(jScrollPane0.isFocusTraversalPolicySet());
      assertFalse(jScrollPane0.getIgnoreRepaint());
      assertFalse(jScrollPane0.isFocusCycleRoot());
      assertFalse(jScrollPane0.isFocusTraversalPolicyProvider());
      assertNotNull(jScrollPane0);
      
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, jScrollPane0, 863, 863, " ", (Feature) null);
      assertEquals(0, hashtable0.size());
      assertTrue(hashtable0.isEmpty());
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertTrue(jScrollPane0.getFocusTraversalKeysEnabled());
      assertFalse(jScrollPane0.isFocusTraversalPolicySet());
      assertFalse(jScrollPane0.getIgnoreRepaint());
      assertFalse(jScrollPane0.isFocusCycleRoot());
      assertFalse(jScrollPane0.isFocusTraversalPolicyProvider());
      assertFalse(dataViewInternalFrame0.getIgnoreRepaint());
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
      assertFalse(dataViewInternalFrame0.isFocusTraversalPolicyProvider());
      assertTrue(dataViewInternalFrame0.isFocusTraversalPolicySet());
      assertNotNull(dataViewInternalFrame0);
      
      dataViewInternalFrame0.stopGetz();
      assertEquals(0, hashtable0.size());
      assertTrue(hashtable0.isEmpty());
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertTrue(jScrollPane0.getFocusTraversalKeysEnabled());
      assertFalse(jScrollPane0.isFocusTraversalPolicySet());
      assertFalse(jScrollPane0.getIgnoreRepaint());
      assertFalse(jScrollPane0.isFocusCycleRoot());
      assertFalse(jScrollPane0.isFocusTraversalPolicyProvider());
      assertFalse(dataViewInternalFrame0.getIgnoreRepaint());
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
      assertFalse(dataViewInternalFrame0.isFocusTraversalPolicyProvider());
      assertTrue(dataViewInternalFrame0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Hashtable<Format.Field, String> hashtable0 = new Hashtable<Format.Field, String>();
      assertTrue(hashtable0.isEmpty());
      assertEquals(0, hashtable0.size());
      assertNotNull(hashtable0);
      
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      assertEquals((-1), fieldPosition0.getField());
      assertEquals(0, fieldPosition0.getBeginIndex());
      assertEquals(0, fieldPosition0.getEndIndex());
      assertNotNull(fieldPosition0);
      
      Format.Field format_Field1 = fieldPosition0.getFieldAttribute();
      assertSame(format_Field1, format_Field0);
      assertEquals((-1), fieldPosition0.getField());
      assertEquals(0, fieldPosition0.getBeginIndex());
      assertEquals(0, fieldPosition0.getEndIndex());
      assertNotNull(format_Field1);
      
      String string0 = hashtable0.put(format_Field1, " scores: ");
      assertSame(format_Field1, format_Field0);
      assertFalse(hashtable0.isEmpty());
      assertEquals(1, hashtable0.size());
      assertEquals((-1), fieldPosition0.getField());
      assertEquals(0, fieldPosition0.getBeginIndex());
      assertEquals(0, fieldPosition0.getEndIndex());
      assertNull(string0);
      
      DataViewInternalFrame dataViewInternalFrame0 = null;
      try {
        dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, (JDesktopPane) null, (JScrollPane) null, 0, (-1997), "", (Feature) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.text.Format$Field$MockitoMock$1882605502 cannot be cast to java.lang.String
         //
         verifyException("uk.ac.sanger.artemis.editor.DataViewInternalFrame", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Hashtable<Object, AttributedCharacterIterator.Attribute> hashtable0 = new Hashtable<Object, AttributedCharacterIterator.Attribute>();
      assertEquals(0, hashtable0.size());
      assertTrue(hashtable0.isEmpty());
      assertNotNull(hashtable0);
      
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertNotNull(jDesktopPane0);
      
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, (JScrollPane) null, (-3822), 1157, "u,@}'\"", (Feature) null);
      assertEquals(0, hashtable0.size());
      assertTrue(hashtable0.isEmpty());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertFalse(dataViewInternalFrame0.isFocusTraversalPolicyProvider());
      assertFalse(dataViewInternalFrame0.getIgnoreRepaint());
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
      assertTrue(dataViewInternalFrame0.isFocusTraversalPolicySet());
      assertNotNull(dataViewInternalFrame0);
      
      String string0 = dataViewInternalFrame0.getFeatureText();
      assertEquals(0, hashtable0.size());
      assertTrue(hashtable0.isEmpty());
      assertFalse(jDesktopPane0.isFocusTraversalPolicyProvider());
      assertTrue(jDesktopPane0.isFocusCycleRoot());
      assertTrue(jDesktopPane0.getFocusTraversalKeysEnabled());
      assertTrue(jDesktopPane0.isFocusTraversalPolicySet());
      assertFalse(jDesktopPane0.getIgnoreRepaint());
      assertFalse(dataViewInternalFrame0.isFocusTraversalPolicyProvider());
      assertFalse(dataViewInternalFrame0.getIgnoreRepaint());
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
      assertTrue(dataViewInternalFrame0.isFocusTraversalPolicySet());
      assertNotNull(string0);
      assertEquals("/u,@}'\"", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Hashtable<Object, AttributedCharacterIterator.Attribute> hashtable0 = new Hashtable<Object, AttributedCharacterIterator.Attribute>();
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, (JScrollPane) null, (-3822), 1157, "u,@}'\"", (Feature) null);
      dataViewInternalFrame0.setAnnotationDividerLocation();
      assertTrue(dataViewInternalFrame0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Hashtable<Object, AttributedCharacterIterator.Attribute> hashtable0 = new Hashtable<Object, AttributedCharacterIterator.Attribute>();
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      DataViewInternalFrame dataViewInternalFrame0 = new DataViewInternalFrame(hashtable0, jDesktopPane0, (JScrollPane) null, (-3822), 1157, "u,@}'\"", (Feature) null);
      DataViewInternalFrame.ActiveJSplitPane dataViewInternalFrame_ActiveJSplitPane0 = null;
      try {
        dataViewInternalFrame_ActiveJSplitPane0 = dataViewInternalFrame0.new ActiveJSplitPane(8713, dataViewInternalFrame0, (Component) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot create JSplitPane, orientation must be one of JSplitPane.HORIZONTAL_SPLIT or JSplitPane.VERTICAL_SPLIT
         //
         verifyException("javax.swing.JSplitPane", e);
      }
  }
}
