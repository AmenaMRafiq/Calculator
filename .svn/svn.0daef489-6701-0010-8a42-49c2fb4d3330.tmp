package test;

import static org.junit.Assert.assertTrue;

import model.InvalidExpressionException;
import model.StandardCalc;

import org.junit.Before;
import org.junit.Test;

/**
 * This test class holds all of the J-Unit tests recorded for the StandardCalc class.
 * 
 * @author Amena Rafiq
 * @see    StandardCalc
 */
public class TestStandardCalc {

  StandardCalc stanCalc;

  @Before
  public void setUp() {
    stanCalc = new StandardCalc();
  }

  
  /**
   * Tests if the evaluate() method returns set answer of 12.34.
   * 
   * @see InvalidExpressionException
   */
  @Test
  public void testEvaluateReturnResult() throws InvalidExpressionException {
    //method initially just returns 12.34
    assertTrue("should return 12.34", stanCalc.evaluate("anything") == 12.34);
  }
  
  
  /**
   * Tests if the evaluate() method throws an
   * exception for empty expressions.
   * 
   * @see InvalidExpressionException
   */
  @Test (expected = InvalidExpressionException.class)
  public void testEvaluateEmtpyExpression() throws InvalidExpressionException {
    //method now throws invalid type expression for empty expressions
    assertTrue("should throw InvalidExpressionException", stanCalc.evaluate("") == 6);
    assertTrue("should throw InvalidExpressionException", stanCalc.evaluate(" ") == 6);
  }

}
