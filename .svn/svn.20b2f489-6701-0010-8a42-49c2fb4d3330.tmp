package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import model.BadTypeException;
import model.StrStack;

import org.junit.Before;
import org.junit.Test;


/**
 * This test class holds all of the J-Unit tests recorded for the StrStack class.
 * 
 * @author Amena Rafiq
 * @see    StrStack
 */
public class TestStrStack {

  private StrStack strStack;

  @Before
  public void setUp() {
    strStack = new StrStack();
  }
  
  /**
   * Initially tested the constructor. Moved to setup.
   * Tests the isEmpty() method
   */
  @Test
  public void testIsEmpty() {
    //initial method for storing entries is an array
    //size attribute and isEmpty() method written
    assertTrue("Nothing has been pushed, should return true", strStack.isEmpty());
  }
  
  /**
   * Tests the push() method alongside the isEmpty() method.
   */
  @Test
  public void testPush() {
    //push method written
    strStack.push("hello");
    assertTrue("one entry pushed, expected true", strStack.size() == 1);
    assertFalse("one entry pushed, should return false", strStack.isEmpty()); 
  }
  
  /**
   * Tests the pop() method.
   */
  @Test
  public void testPop() throws IndexOutOfBoundsException, BadTypeException {
    //pop() method written
    strStack.push("hello");
    assertTrue("value == 5.5", strStack.pop() == "hello");
    assertTrue("size == 0", strStack.size() == 0);
    assertTrue("stack is empty", strStack.isEmpty());
  }

}
