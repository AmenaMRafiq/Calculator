package test;

import static org.junit.Assert.assertTrue;

import application.CalcModel;
import model.InvalidExpressionException;

import org.junit.Before;
import org.junit.Test;

public class FaultInjection {

  private CalcModel model;

  @Before
  public void setUp() {
    model = new CalcModel();
    model.setType(false);
  }

  @Test (expected = InvalidExpressionException.class)
  public void testInvalidExceptions1() throws InvalidExpressionException {
    //giving invalid expression
    assertTrue("should throw InvalidExpressionException", model.current.evaluate("") == 0);
  }

  @Test (expected = InvalidExpressionException.class)
  public void testInvalidExceptions2() throws InvalidExpressionException {
    //giving invalid expression
    //found an error here so changed code to say 
    //if (expression.trim().isEmpty()) in rev and standard classes
    assertTrue("should throw InvalidExpressionException", 
        model.current.evaluate("                                   ") == 12);
  }

  @Test (expected = InvalidExpressionException.class)
  public void testInvalidExceptions3() throws InvalidExpressionException {
    //giving invalid expression
    assertTrue("should throw InvalidExpressionException", model.current.evaluate("3 9 h") == 12);
  }

  @Test (expected = InvalidExpressionException.class)
  public void testInvalidExceptions4() throws InvalidExpressionException {
    //giving invalid expression
    assertTrue("should throw InvalidExpressionException", model.current.evaluate("3 h -") == 12);
  }

  @Test (expected = InvalidExpressionException.class)
  public void testInvalidExceptions5() throws InvalidExpressionException {
    //giving invalid expression
    assertTrue("should throw InvalidExpressionException", 
        model.current.evaluate("jaoifjoaeijf") == 12);
  }

}
