/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 10 13:18:19 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder.gff;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.gff.AddButton;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AddButton_ESTest extends AddButton_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultEditorKit.BeepAction defaultEditorKit_BeepAction0 = new DefaultEditorKit.BeepAction();
      AddButton addButton0 = new AddButton(defaultEditorKit_BeepAction0, (String) null);
      assertTrue(addButton0.getFocusTraversalKeysEnabled());
  }
}
