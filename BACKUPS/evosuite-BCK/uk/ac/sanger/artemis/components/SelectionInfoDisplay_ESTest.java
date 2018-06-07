/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 11:26:38 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.datatransfer.Clipboard;
import java.awt.image.BufferedImage;
import org.apache.xmlgraphics.java2d.GraphicsConfigurationWithTransparency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SelectionChangeEvent;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.SelectionInfoDisplay;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectionInfoDisplay_ESTest extends SelectionInfoDisplay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("^D 0(s/BwJ^?Y4rH?");
      Selection selection0 = new Selection(clipboard0);
      String string0 = SelectionInfoDisplay.markerRangeText(selection0, (EntryGroup) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Clipboard clipboard0 = new Clipboard("&\"d%16^F|;)tBTv9r");
      Selection selection0 = new Selection(clipboard0);
      SelectionInfoDisplay selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, selection0);
      // Undeclared exception!
      try { 
        selectionInfoDisplay0.paintComponent((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.JComponent", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        SelectionInfoDisplay.markerRangeText((Selection) null, (EntryGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.SelectionInfoDisplay", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      SelectionInfoDisplay selectionInfoDisplay0 = null;
      try {
        selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, (Selection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.SelectionInfoDisplay", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Selection selection0 = new Selection((Clipboard) null);
      SelectionInfoDisplay selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, selection0);
      GraphicsConfigurationWithTransparency graphicsConfigurationWithTransparency0 = new GraphicsConfigurationWithTransparency();
      BufferedImage bufferedImage0 = graphicsConfigurationWithTransparency0.createCompatibleImage(284, 284);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.getGraphics();
      selectionInfoDisplay0.paintComponent(sunGraphics2D0);
      assertEquals((-16777216), sunGraphics2D0.pixel);
      assertEquals((-16777216), sunGraphics2D0.eargb);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Clipboard clipboard0 = new Clipboard("PO7&8c{,4$");
      Selection selection0 = new Selection(clipboard0);
      SelectionInfoDisplay selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, selection0);
      SelectionChangeEvent selectionChangeEvent0 = new SelectionChangeEvent(selectionInfoDisplay0, 11);
      selectionInfoDisplay0.selectionChanged(selectionChangeEvent0);
      assertEquals(1, SelectionChangeEvent.SELECTION_CHANGED);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Clipboard clipboard0 = new Clipboard("PO7&8c{,4$");
      Selection selection0 = new Selection(clipboard0);
      SelectionInfoDisplay selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, selection0);
      Dimension dimension0 = selectionInfoDisplay0.getPreferredSize();
      assertEquals(10, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Clipboard clipboard0 = new Clipboard("PO7&8c{,4$");
      Selection selection0 = new Selection(clipboard0);
      SelectionInfoDisplay selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, selection0);
      Dimension dimension0 = selectionInfoDisplay0.getMinimumSize();
      assertEquals(10, dimension0.width);
  }
}
