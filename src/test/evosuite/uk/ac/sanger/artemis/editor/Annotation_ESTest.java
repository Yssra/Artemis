/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 21:10:38 GMT 2018
 */

package uk.ac.sanger.artemis.editor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.io.IOException;
import java.net.URL;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JSpinner;
import javax.swing.event.HyperlinkEvent;
import javax.swing.text.Element;
import javax.swing.text.PlainDocument;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;
import javax.swing.text.html.StyleSheet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.editor.Annotation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Annotation_ESTest extends Annotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JInternalFrame jInternalFrame0 = new JInternalFrame("K;T<:s~Utz4kmvad0@v");
      JInternalFrame.JDesktopIcon jInternalFrame_JDesktopIcon0 = jInternalFrame0.getDesktopIcon();
      Annotation annotation0 = new Annotation((JDesktopPane) null);
      HyperlinkEvent.EventType hyperlinkEvent_EventType0 = HyperlinkEvent.EventType.ACTIVATED;
      URL uRL0 = MockURL.getFileExample();
      HTMLFrameHyperlinkEvent hTMLFrameHyperlinkEvent0 = new HTMLFrameHyperlinkEvent(jInternalFrame_JDesktopIcon0, hyperlinkEvent_EventType0, uRL0, "/EC_number=", "#c\"{8TiU9^#y#,H?;");
      annotation0.hyperlinkUpdate(hTMLFrameHyperlinkEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.setContentType(">=");
      annotation0.insert("Xdk20CFG/Ge!`", false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.insert("rF%fzhR", 4567);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      URL uRL0 = MockURL.getHttpExample();
      annotation0.setUpSRSFrame(uRL0, "Tz~'D`{ah\"d/)2]<A");
      HyperlinkEvent.EventType hyperlinkEvent_EventType0 = HyperlinkEvent.EventType.ENTERED;
      PlainDocument plainDocument0 = new PlainDocument();
      Element element0 = plainDocument0.getParagraphElement((-1580));
      HyperlinkEvent hyperlinkEvent0 = new HyperlinkEvent("Tz~'D`{ah\"d/)2]<A", hyperlinkEvent_EventType0, uRL0, "zBA[t3RF~^spBSn2*zY", element0);
      annotation0.hyperlinkUpdate(hyperlinkEvent0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      URL uRL0 = MockURL.getFileExample();
      // Undeclared exception!
      try { 
        annotation0.setUpSRSFrame(uRL0, "h!O");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.reflect.InvocationTargetException
         //
         verifyException("javax.swing.JEditorPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Annotation annotation0 = new Annotation((JDesktopPane) null);
      URL uRL0 = MockURL.getHttpExample();
      // Undeclared exception!
      try { 
        annotation0.setUpSRSFrame(uRL0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      URL uRL0 = MockURL.getHttpExample();
      try { 
        annotation0.setUpSRSFrame(uRL0, "Tz~'D`{ah\"d/)2]<A");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      // Undeclared exception!
      try { 
        annotation0.setAnnotation((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.setContentType(">=");
      // Undeclared exception!
      try { 
        annotation0.reportHTML();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.text.PlainDocument cannot be cast to javax.swing.text.html.HTMLDocument
         //
         verifyException("uk.ac.sanger.artemis.editor.Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      // Undeclared exception!
      try { 
        annotation0.insert((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.setContentType(">=");
      // Undeclared exception!
      try { 
        annotation0.getFeatureText();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.text.PlainDocument cannot be cast to javax.swing.text.html.HTMLDocument
         //
         verifyException("uk.ac.sanger.artemis.editor.Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      Annotation annotation0 = null;
      try {
        annotation0 = new Annotation(uRL0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.reflect.InvocationTargetException
         //
         verifyException("javax.swing.JEditorPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Annotation annotation0 = null;
      try {
        annotation0 = new Annotation((URL) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // invalid url
         //
         verifyException("javax.swing.JEditorPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      Annotation.PopupListener annotation_PopupListener0 = annotation0.new PopupListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(annotation0, (-3745), 515L, (-3446), (-653), (-653), 8922, 4567, (-653), true, (-3745), 8922, (-653), (-3446));
      annotation_PopupListener0.mousePressed(mouseWheelEvent0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSpinner jSpinner0 = new JSpinner();
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0);
      Annotation annotation0 = new Annotation((JDesktopPane) null);
      HyperlinkEvent.EventType hyperlinkEvent_EventType0 = HyperlinkEvent.EventType.EXITED;
      URL uRL0 = MockURL.getFtpExample();
      HTMLDocument hTMLDocument0 = new HTMLDocument();
      Element element0 = hTMLDocument0.getCharacterElement(2);
      HTMLFrameHyperlinkEvent hTMLFrameHyperlinkEvent0 = new HTMLFrameHyperlinkEvent(jSpinner_NumberEditor0, hyperlinkEvent_EventType0, uRL0, element0, "4*");
      annotation0.hyperlinkUpdate(hTMLFrameHyperlinkEvent0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      URL uRL0 = MockURL.getHttpExample();
      HyperlinkEvent.EventType hyperlinkEvent_EventType0 = HyperlinkEvent.EventType.ACTIVATED;
      HTMLFrameHyperlinkEvent hTMLFrameHyperlinkEvent0 = new HTMLFrameHyperlinkEvent("/BQ~Q*G+myh1&r^YV@u Xdk20CFG/Ge!`", hyperlinkEvent_EventType0, uRL0, "[log4j.configDebug] is deprecated. Use [log4j.debug] instead.", "Cannot reach URL:\n");
      // Undeclared exception!
      try { 
        annotation0.hyperlinkUpdate(hTMLFrameHyperlinkEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.editor.Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Annotation annotation0 = new Annotation((JDesktopPane) null);
      HyperlinkEvent.EventType hyperlinkEvent_EventType0 = HyperlinkEvent.EventType.ACTIVATED;
      HTMLFrameHyperlinkEvent hTMLFrameHyperlinkEvent0 = new HTMLFrameHyperlinkEvent("xJ?F0Ja`}2zI<%)A8-S", hyperlinkEvent_EventType0, (URL) null, ">I^mpR[iY}Yu<IN", (Element) null, (InputEvent) null, ">I^mpR[iY}Yu<IN");
      // Undeclared exception!
      try { 
        annotation0.hyperlinkUpdate(hTMLFrameHyperlinkEvent0);
        
      } catch(HeadlessException e) {
    	  	fail("caught HeadlessException");   
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      URL uRL0 = MockURL.getFtpExample();
      StyleSheet styleSheet0 = new StyleSheet();
      HTMLDocument hTMLDocument0 = new HTMLDocument(styleSheet0);
      Element element0 = hTMLDocument0.getDefaultRootElement();
      HTMLFrameHyperlinkEvent hTMLFrameHyperlinkEvent0 = new HTMLFrameHyperlinkEvent(jDesktopPane0, (HyperlinkEvent.EventType) null, uRL0, "rF%fzhR", element0, "rF%fzhR");
      annotation0.hyperlinkUpdate(hTMLFrameHyperlinkEvent0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.goBack();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.setContentType(">=");
      annotation0.deleteNote();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.setContentType(">=");
      annotation0.delete("unknown type,(-654,-654),absolute(-3446,4567),button=0,modifiers=\u2325+\u2303+Button2+Button3,extModifiers=\u2303+\u2325+\u2325+Button3+Button4+Button5+Button6+Button7+Button8+Button9+Button10+Button11+Button12+Button13+Button14+Button15+Button16+Button17+Button18+Button19+Button20,clickCount=-654,scrollType=unknown scroll type,scrollAmount=8922,wheelRotation=-654,preciseWheelRotation=-3446.0", false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.delete("unknown type,(-654,-654),absolute(-3446,4567),button=0,modifiers=\u2325+\u2303+Button2+Button3,extModifiers=\u2303+\u2325+\u2325+Button3+Button4+Button5+Button6+Button7+Button8+Button9+Button10+Button11+Button12+Button13+Button14+Button15+Button16+Button17+Button18+Button19+Button20,clickCount=-654,scrollType=unknown scroll type,scrollAmount=8922,wheelRotation=-654,preciseWheelRotation=-3446.0", false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.insert("Xdk20CFG/Ge!`", false);
      annotation0.delete("uk.ac.sanger.artemis.editor.Annotation[,0,0,0x0,invalid,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.basic.BasicBorders$MarginBorder@660cf576,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=false,margin=javax.swing.plaf.InsetsUIResource[top=3,left=3,bottom=3,right=3],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],kit=javax.swing.text.html.HTMLEditorKit@23583c4d,typeHandlers={text/html=javax.swing.text.html.HTMLEditorKit@23583c4d}]", true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.deleteGo("", "");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Annotation annotation0 = new Annotation((JDesktopPane) null);
      annotation0.deleteGo("", "xJ?F0Ja`}2zI<%)A8-S");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.deleteGo("T=nH&~],^", "T=nH&~],^");
      assertTrue(annotation0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.insert("8idYt4PvlZ^CYbS", false);
      // Undeclared exception!
      try { 
        annotation0.deleteGo((String) null, "BQ~Q*G+myh1&r^YV@u");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      // Undeclared exception!
      try { 
        annotation0.insert(" with=UniProt:", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.insert("Xdk20CFG/Ge`", true);
      annotation0.deleteNote();
      assertTrue(annotation0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      String string0 = annotation0.getFeatureText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.setAnnotation("uk.ac.sanger.artemis.editor.Annotation[,0,0,0x0,invalid,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.basic.BasicBorders$MarginBorder@660cf576,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=false,margin=javax.swing.plaf.InsetsUIResource[top=3,left=3,bottom=3,right=3],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],kit=javax.swing.text.html.HTMLEditorKit@23583c4d,typeHandlers={text/html=javax.swing.text.html.HTMLEditorKit@23583c4d}]");
      String string0 = annotation0.getFeatureText();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.setAnnotation("BQ~Q*G+myh1&r^YV@u");
      String string0 = annotation0.getFeatureText();
      assertEquals("/BQ~Q*G+myh1&r^YV@u", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      Annotation.PopupListener annotation_PopupListener0 = annotation0.new PopupListener();
      MouseEvent mouseEvent0 = new MouseEvent(jDesktopPane0, 2014, (-578L), 2014, 0, 0, (-2513), false);
      annotation_PopupListener0.mouseReleased(mouseEvent0);
      assertFalse(mouseEvent0.isShiftDown());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.insert("Xdk20CFG/Ge!`", false);
      String string0 = annotation0.getFeatureText();
      assertEquals("/Xdk20CFG/Ge!`", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      annotation0.reportHTML();
      assertFalse(annotation0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      Annotation annotation0 = new Annotation(jDesktopPane0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      URL uRL0 = MockURL.getHttpExample();
      annotation0.setUpSRSFrame(uRL0, "Tz~'D`{ah\"d/)2]<A");
      annotation0.setUpSRSFrame(uRL0, "BQ~Q*G+myh1&r^YV@u");
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getHost());
  }
}