/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:44:19 GMT 2018
 */

package uk.ac.sanger.artemis.components.filetree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EventObject;
import javax.swing.event.CellEditorListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.filetree.AbstractCellEditor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractCellEditor_ESTest extends AbstractCellEditor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      CellEditorListener cellEditorListener0 = mock(CellEditorListener.class, new ViolatedAssumptionAnswer());
      abstractCellEditor0.addCellEditorListener(cellEditorListener0);
      CellEditorListener cellEditorListener1 = mock(CellEditorListener.class, new ViolatedAssumptionAnswer());
      abstractCellEditor0.addCellEditorListener(cellEditorListener1);
      abstractCellEditor0.fireEditingCanceled();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      CellEditorListener cellEditorListener0 = mock(CellEditorListener.class, new ViolatedAssumptionAnswer());
      CellEditorListener cellEditorListener1 = mock(CellEditorListener.class, new ViolatedAssumptionAnswer());
      abstractCellEditor0.addCellEditorListener(cellEditorListener1);
      abstractCellEditor0.addCellEditorListener(cellEditorListener0);
      abstractCellEditor0.fireEditingStopped();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.listenerList = null;
      CellEditorListener cellEditorListener0 = mock(CellEditorListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        abstractCellEditor0.removeCellEditorListener(cellEditorListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.AbstractCellEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.listenerList = null;
      // Undeclared exception!
      try { 
        abstractCellEditor0.fireEditingStopped();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.AbstractCellEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.listenerList = null;
      // Undeclared exception!
      try { 
        abstractCellEditor0.fireEditingCanceled();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.AbstractCellEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      CellEditorListener cellEditorListener0 = mock(CellEditorListener.class, new ViolatedAssumptionAnswer());
      abstractCellEditor0.listenerList = null;
      // Undeclared exception!
      try { 
        abstractCellEditor0.addCellEditorListener(cellEditorListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.AbstractCellEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      CellEditorListener cellEditorListener0 = mock(CellEditorListener.class, new ViolatedAssumptionAnswer());
      abstractCellEditor0.addCellEditorListener(cellEditorListener0);
      abstractCellEditor0.fireEditingCanceled();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      CellEditorListener cellEditorListener0 = mock(CellEditorListener.class, new ViolatedAssumptionAnswer());
      abstractCellEditor0.addCellEditorListener(cellEditorListener0);
      abstractCellEditor0.fireEditingStopped();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      EventObject eventObject0 = mock(EventObject.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = abstractCellEditor0.isCellEditable(eventObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      Object object0 = abstractCellEditor0.getCellEditorValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      boolean boolean0 = abstractCellEditor0.stopCellEditing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      EventObject eventObject0 = mock(EventObject.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = abstractCellEditor0.shouldSelectCell(eventObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      CellEditorListener cellEditorListener0 = mock(CellEditorListener.class, new ViolatedAssumptionAnswer());
      abstractCellEditor0.removeCellEditorListener(cellEditorListener0);
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.cancelCellEditing();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }
}
