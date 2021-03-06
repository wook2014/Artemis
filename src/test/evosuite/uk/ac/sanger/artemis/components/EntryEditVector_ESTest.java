/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 08 18:26:06 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.EntryEdit;
import uk.ac.sanger.artemis.components.EntryEditVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EntryEditVector_ESTest extends EntryEditVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntryEditVector entryEditVector0 = new EntryEditVector();
      // Undeclared exception!
      try { 
        entryEditVector0.elementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EntryEditVector entryEditVector0 = new EntryEditVector();
      boolean boolean0 = entryEditVector0.removeElement((EntryEdit) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EntryEditVector entryEditVector0 = new EntryEditVector();
      int int0 = entryEditVector0.indexOf((EntryEdit) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EntryEditVector entryEditVector0 = new EntryEditVector();
      int int0 = entryEditVector0.size();
      assertEquals(0, int0);
  }
}
