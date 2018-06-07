/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 12:25:50 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.AWTKeyStroke;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.text.AttributedCharacterIterator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JApplet;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;
import javax.swing.TransferHandler;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledEditorKit;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.MemoryComboBox;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MemoryComboBox_ESTest extends MemoryComboBox_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Stack<AWTKeyStroke> stack0 = new Stack<AWTKeyStroke>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(stack0);
      memoryComboBox0.isDoubleBuffered();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      memoryComboBox0.imageUpdate((Image) null, 0, 0, 2615, 0, 2615);
      StyledEditorKit.BoldAction styledEditorKit_BoldAction0 = new StyledEditorKit.BoldAction();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem(styledEditorKit_BoldAction0);
      jCheckBoxMenuItem0.getAccelerator();
      stack0.add((AWTKeyStroke) null);
      memoryComboBox0.addURL((Object) null);
      memoryComboBox0.isForwardPage();
      memoryComboBox0.isBackPage();
      MemoryComboBox memoryComboBox1 = new MemoryComboBox(stack0);
      memoryComboBox0.isItem(memoryComboBox1);
      memoryComboBox1.addURL((Object) null);
      int int0 = JComponent.WHEN_IN_FOCUSED_WINDOW;
      memoryComboBox0.getClientProperty((Object) null);
      memoryComboBox0.getIndexOf((Object) null);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Integer.divideUnsigned(2, 30);
      memoryComboBox1.getIndexOf(integer0);
      MemoryComboBox memoryComboBox2 = new MemoryComboBox(stack0);
      memoryComboBox2.getClientProperty(memoryComboBox1);
      memoryComboBox0.setLastIndex((Object) null);
      memoryComboBox1.setLastIndex((Object) null);
      memoryComboBox1.isBackPage();
      memoryComboBox2.getURLAt(0);
      JApplet jApplet0 = null;
      try {
        jApplet0 = new JApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<AWTKeyStroke> vector0 = new Vector<AWTKeyStroke>();
      vector0.setSize(12309);
      Character character0 = new Character(',');
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke(character0, 4037);
      vector0.add(aWTKeyStroke0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector<AWTKeyStroke> vector0 = new Vector<AWTKeyStroke>();
      Character character0 = new Character(',');
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke(character0, 4037);
      vector0.add(aWTKeyStroke0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.getIndexOf(vector0);
      memoryComboBox0.setLastIndex(character0);
      memoryComboBox0.isItem(vector0);
      memoryComboBox0.getClientProperty(vector0);
      memoryComboBox0.addURL((Object) null);
      memoryComboBox0.isForwardPage();
      memoryComboBox0.getIndexOf((Object) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Window.Type> vector0 = new Vector<Window.Type>();
      Window.Type window_Type0 = Window.Type.NORMAL;
      vector0.add(window_Type0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.addURL(vector0);
      int int0 = (-1);
      // Undeclared exception!
      try { 
        memoryComboBox0.getURLAt(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.awt.Window$Type cannot be cast to java.net.URL
         //
         verifyException("uk.ac.sanger.artemis.circular.MemoryComboBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<AWTKeyStroke> vector0 = new Vector<AWTKeyStroke>();
      HashSet<MemoryComboBox> hashSet0 = new LinkedHashSet<MemoryComboBox>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      hashSet0.add(memoryComboBox0);
      vector0.retainAll(hashSet0);
      MemoryComboBox memoryComboBox1 = new MemoryComboBox(vector0);
      memoryComboBox1.getLocale();
      TransferHandler transferHandler0 = new TransferHandler((String) null);
      memoryComboBox1.setTransferHandler(transferHandler0);
      memoryComboBox1.addURL(vector0);
      memoryComboBox1.isItem(vector0);
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke(30, 30, true);
      memoryComboBox1.addURL(aWTKeyStroke0);
      memoryComboBox1.isBackPage();
      memoryComboBox1.isBackPage();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector<Window.Type> vector0 = new Vector<Window.Type>();
      Window.Type window_Type0 = Window.Type.POPUP;
      vector0.add(window_Type0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.isForwardPage();
      memoryComboBox0.addURL(vector0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      int int0 = (-383);
      defaultCaret0.grow((-383), 30);
      AWTEventMulticaster.remove((FocusListener) defaultCaret0, (FocusListener) defaultCaret0);
      MemoryComboBox memoryComboBox1 = new MemoryComboBox(vector0);
      memoryComboBox0.getIndexOf(memoryComboBox1);
      memoryComboBox1.isBackPage();
      // Undeclared exception!
      try { 
        memoryComboBox1.addURL(memoryComboBox0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Stack<DefaultTableModel> stack0 = new Stack<DefaultTableModel>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(stack0);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Object[]) null, 0);
      stack0.add(defaultTableModel0);
      MouseEvent mouseEvent0 = new MouseEvent(memoryComboBox0, 0, (-4196L), 0, 30, 0, 0, false);
      memoryComboBox0.removeMouseMotionListener((MouseMotionListener) null);
      memoryComboBox0.getToolTipLocation(mouseEvent0);
      DefaultTableModel defaultTableModel1 = new DefaultTableModel();
      memoryComboBox0.addURL(defaultTableModel1);
      Object object0 = new Object();
      memoryComboBox0.getIndexOf(object0);
      memoryComboBox0.isItem("u,$");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stack<AWTKeyStroke> stack0 = new Stack<AWTKeyStroke>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(stack0);
      memoryComboBox0.isDoubleBuffered();
      memoryComboBox0.imageUpdate((Image) null, 0, 0, 2615, 0, 2615);
      StyledEditorKit.BoldAction styledEditorKit_BoldAction0 = new StyledEditorKit.BoldAction();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem(styledEditorKit_BoldAction0);
      jCheckBoxMenuItem0.getAccelerator();
      stack0.add((AWTKeyStroke) null);
      memoryComboBox0.addURL((Object) null);
      memoryComboBox0.isForwardPage();
      memoryComboBox0.isBackPage();
      MemoryComboBox memoryComboBox1 = new MemoryComboBox(stack0);
      memoryComboBox0.isItem(memoryComboBox1);
      memoryComboBox1.addURL((Object) null);
      memoryComboBox0.getIndexOf(stack0);
      memoryComboBox0.getClientProperty((Object) null);
      memoryComboBox0.getIndexOf((Object) null);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Integer.divideUnsigned((-1), 30);
      memoryComboBox1.getIndexOf(integer0);
      MemoryComboBox memoryComboBox2 = new MemoryComboBox(stack0);
      memoryComboBox2.getClientProperty(memoryComboBox1);
      memoryComboBox0.setLastIndex((Object) null);
      memoryComboBox1.setLastIndex((Object) null);
      memoryComboBox1.isBackPage();
      JApplet jApplet0 = null;
      try {
        jApplet0 = new JApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector<DefaultTableModel> vector0 = new Vector<DefaultTableModel>();
      vector0.clone();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      vector0.listIterator();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      vector0.add(defaultTableModel0);
      vector0.add(defaultTableModel0);
      MemoryComboBox memoryComboBox1 = new MemoryComboBox(vector0);
      vector0.removeAllElements();
      memoryComboBox1.isForwardPage();
      memoryComboBox1.isBackPage();
      memoryComboBox1.getComponents();
      memoryComboBox1.getIndexOf(vector0);
      memoryComboBox1.getIndexOf(vector0);
      memoryComboBox1.isBackPage();
      memoryComboBox1.isBackPage();
      // Undeclared exception!
      try { 
        memoryComboBox1.getURLAt(12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 12
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector<AWTKeyStroke> vector0 = new Vector<AWTKeyStroke>();
      HashSet<MemoryComboBox> hashSet0 = new HashSet<MemoryComboBox>();
      vector0.retainAll(hashSet0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.getLocale();
      TransferHandler transferHandler0 = new TransferHandler((String) null);
      memoryComboBox0.setTransferHandler(transferHandler0);
      memoryComboBox0.addURL(vector0);
      memoryComboBox0.isItem(vector0);
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke(30, 30, true);
      memoryComboBox0.addURL(aWTKeyStroke0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Stack<AWTKeyStroke> stack0 = new Stack<AWTKeyStroke>();
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke(12, 1002);
      stack0.add(aWTKeyStroke0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(stack0);
      memoryComboBox0.isItem(stack0);
      memoryComboBox0.isBackPage();
      MemoryComboBox memoryComboBox1 = new MemoryComboBox(stack0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      MouseListener mouseListener0 = AWTEventMulticaster.add((MouseListener) defaultCaret0, (MouseListener) defaultCaret0);
      memoryComboBox1.removeMouseListener(mouseListener0);
      memoryComboBox0.setLastIndex(memoryComboBox1);
      memoryComboBox1.setLastIndex(aWTKeyStroke0);
      memoryComboBox0.isBackPage();
      memoryComboBox1.setVisible(false);
      memoryComboBox0.isForwardPage();
      memoryComboBox1.isItem(defaultCaret0);
      memoryComboBox1.isItem(mouseListener0);
      memoryComboBox1.isItem(defaultCaret0);
      memoryComboBox1.isBackPage();
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke('#');
      Character character0 = new Character('?');
      KeyStroke.getKeyStroke(character0, 12);
      JTextComponent.KeyBinding jTextComponent_KeyBinding0 = new JTextComponent.KeyBinding(keyStroke0, "o%liI.oBM( 7mO`o7%q");
      KeyStroke keyStroke1 = jTextComponent_KeyBinding0.key;
      memoryComboBox0.getIndexOf(keyStroke1);
      memoryComboBox1.getClientProperty(jTextComponent_KeyBinding0);
      memoryComboBox1.getIndexOf((Object) null);
      // Undeclared exception!
      try { 
        memoryComboBox0.getURLAt(12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 12
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Stack<DefaultTableModel> stack0 = new Stack<DefaultTableModel>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(stack0);
      memoryComboBox0.isBackPage();
      memoryComboBox0.addURL(stack0);
      memoryComboBox0.getClientProperty(stack0);
      memoryComboBox0.firePopupMenuWillBecomeInvisible();
      // Undeclared exception!
      try { 
        memoryComboBox0.isItem((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.MemoryComboBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<DefaultTableModel> vector0 = new Vector<DefaultTableModel>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.isItem(vector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector<DefaultTableModel> vector0 = new Vector<DefaultTableModel>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.isBackPage();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Stack<AWTKeyStroke> stack0 = new Stack<AWTKeyStroke>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(stack0);
      DefaultEditorKit.DefaultKeyTypedAction defaultEditorKit_DefaultKeyTypedAction0 = new DefaultEditorKit.DefaultKeyTypedAction();
      memoryComboBox0.removeActionListener(defaultEditorKit_DefaultKeyTypedAction0);
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.ADJUST_ALL;
      Integer.sum(30, 30);
      memoryComboBox0.addURL(integer0);
      memoryComboBox0.isForwardPage();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector<Window.Type> vector0 = new Vector<Window.Type>(3468);
      Window.Type window_Type0 = Window.Type.NORMAL;
      vector0.add(window_Type0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.isForwardPage();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Stack<AWTKeyStroke> stack0 = new Stack<AWTKeyStroke>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(stack0);
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke(30, 30);
      stack0.add(aWTKeyStroke0);
      int int0 = (-2017);
      // Undeclared exception!
      try { 
        memoryComboBox0.getURLAt((-2017));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<AWTKeyStroke> vector0 = new Vector<AWTKeyStroke>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.isForwardPage();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<AWTKeyStroke> vector0 = new Vector<AWTKeyStroke>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      // Undeclared exception!
      try { 
        memoryComboBox0.getURLAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector<String> vector0 = null;
      MemoryComboBox memoryComboBox0 = null;
      try {
        memoryComboBox0 = new MemoryComboBox((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DefaultComboBoxModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Stack<AWTKeyStroke> stack0 = new Stack<AWTKeyStroke>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(stack0);
      memoryComboBox0.isDoubleBuffered();
      memoryComboBox0.imageUpdate((Image) null, 0, 0, 2615, 0, 2615);
      StyledEditorKit.BoldAction styledEditorKit_BoldAction0 = new StyledEditorKit.BoldAction();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem(styledEditorKit_BoldAction0);
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(2615, 2615, true);
      KeyStroke.getKeyStroke(30, (-3703));
      stack0.add((AWTKeyStroke) keyStroke0);
      memoryComboBox0.addURL((Object) null);
      memoryComboBox0.isForwardPage();
      memoryComboBox0.isBackPage();
      MemoryComboBox memoryComboBox1 = new MemoryComboBox(stack0);
      memoryComboBox0.isItem(memoryComboBox1);
      memoryComboBox1.addURL((Object) null);
      int int0 = JComponent.WHEN_IN_FOCUSED_WINDOW;
      memoryComboBox0.getClientProperty((Object) null);
      memoryComboBox0.getIndexOf((Object) null);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Integer.divideUnsigned(2, 30);
      memoryComboBox1.getIndexOf(integer0);
      MemoryComboBox memoryComboBox2 = new MemoryComboBox(stack0);
      memoryComboBox2.getClientProperty(memoryComboBox1);
      memoryComboBox0.setLastIndex((Object) null);
      memoryComboBox1.setLastIndex((Object) null);
      memoryComboBox1.isBackPage();
      JApplet jApplet0 = null;
      try {
        jApplet0 = new JApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Stack<AWTKeyStroke> stack0 = new Stack<AWTKeyStroke>();
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(stack0);
      // Undeclared exception!
      try { 
        memoryComboBox0.getURLAt(1598);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 1598
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector<AWTKeyStroke> vector0 = new Vector<AWTKeyStroke>();
      HashSet<MemoryComboBox> hashSet0 = new HashSet<MemoryComboBox>();
      vector0.retainAll(hashSet0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      Locale locale0 = memoryComboBox0.getLocale();
      TransferHandler transferHandler0 = new TransferHandler((String) null);
      memoryComboBox0.setTransferHandler(transferHandler0);
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke('?');
      vector0.add(aWTKeyStroke0);
      memoryComboBox0.addURL(vector0);
      memoryComboBox0.isItem(vector0);
      AWTKeyStroke aWTKeyStroke1 = AWTKeyStroke.getAWTKeyStroke(30, 30, true);
      memoryComboBox0.addURL(aWTKeyStroke1);
      Window.Type window_Type0 = Window.Type.POPUP;
      memoryComboBox0.getIndexOf(window_Type0);
      memoryComboBox0.isForwardPage();
      memoryComboBox0.addURL(locale0);
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
      memoryComboBox0.addURL(attributedCharacterIterator_Attribute0);
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.TEXT_COMPOUND_ID;
      memoryComboBox0.addURL(gVTAttributedCharacterIterator_TextAttribute0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector<AWTKeyStroke> vector0 = new Vector<AWTKeyStroke>();
      Character character0 = new Character(',');
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke(character0, 4037);
      vector0.add(aWTKeyStroke0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.getIndexOf(vector0);
      memoryComboBox0.setLastIndex(character0);
      boolean boolean0 = memoryComboBox0.isItem(vector0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector<Window.Type> vector0 = new Vector<Window.Type>();
      Window.Type window_Type0 = Window.Type.POPUP;
      vector0.add(window_Type0);
      MemoryComboBox memoryComboBox0 = new MemoryComboBox(vector0);
      memoryComboBox0.isForwardPage();
      memoryComboBox0.addURL(vector0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      int int0 = (-383);
      defaultCaret0.grow((-383), 30);
      Window.Type window_Type1 = Window.Type.NORMAL;
      vector0.add(window_Type1);
      AWTEventMulticaster.remove((FocusListener) defaultCaret0, (FocusListener) defaultCaret0);
      MemoryComboBox memoryComboBox1 = new MemoryComboBox(vector0);
      memoryComboBox0.getIndexOf(memoryComboBox1);
      memoryComboBox1.isForwardPage();
      memoryComboBox1.isBackPage();
      // Undeclared exception!
      try { 
        memoryComboBox1.addURL(memoryComboBox0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
