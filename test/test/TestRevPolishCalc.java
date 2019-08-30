package test;

import static org.junit.Assert.assertTrue;

import model.InvalidExpressionException;
import model.RevPolishCalc;

import org.junit.Before;
import org.junit.Test;


/**
 * This test class holds all of the J-Unit tests recorded for the RevPolishCalc class.
 * 
 * @author Amena Rafiq
 * @see    RevPolishCalc
 */

public class TestRevPolishCalc {

  RevPolishCalc revCalc;

  @Before
  public void setUp() {
    revCalc = new RevPolishCalc();
  }

  //  @Test
  //  public void testEvaluateReturnResult() throws IndexOutOfBoundsException, BadTypeException {
  //    //method initially just returned 5
  //    assertTrue(revCalc.evaluate("3 2 +") == 5);
  //  }

  /**
   * Tests if the evaluate() method returns post-fix addition.
   * 
   * @see InvalidExpressionException
   */
  @Test
  public void testEvaluatePushPop() throws InvalidExpressionException {
    //method now pushes and pops double values, but always adds them together 
    assertTrue("should return 5", revCalc.evaluate("3 2 +") == 5);
    assertTrue("should return 9.6", revCalc.evaluate("3.1 6.5 +") == 9.6);
  }

  /**
   * Tests if the evaluate() method returns post-fix all operators.
   * 
   * @see InvalidExpressionException
   */
  @Test
  public void testEvaluateReadOperator() throws InvalidExpressionException {
    //method now reads operators correctly
    assertTrue("should return 1", revCalc.evaluate("3 2 -") == 1);
    assertTrue("should return 10", revCalc.evaluate("2.5 4 *") == 10);
  }

  /**
   * Tests if the evaluate() method returns longer 
   * post-fix expressions more than 2 numbers.
   * 
   * @see InvalidExpressionException
   */
  @Test
  public void testEvaluateLongerExpression() throws InvalidExpressionException {
    //method now reads long expressions more than just 2 numbers
    assertTrue("should return 6", revCalc.evaluate("3 2 - 6 *") == 6);
    assertTrue("should return 5", revCalc.evaluate("5 5 + 2 /") == 5);
  }

  /**
   * Tests if the evaluate() method throws an
   * exception for invalid operators.
   * 
   * @see InvalidExpressionException
   */
  @Test (expected = InvalidExpressionException.class)
  public void testEvaluateInvalidOperator() throws InvalidExpressionException {
    //method now throws invalid type expression for invalid operators 
    assertTrue("should throw InvalidExpressionException", revCalc.evaluate("3 2 - 6 m") == 8);
  }
  
  /**
   * Tests if the evaluate() method throws an
   * exception for invalid numbers.
   * @see InvalidExpressionException
   */
  @Test (expected = InvalidExpressionException.class)
  public void testEvaluateBadType() throws InvalidExpressionException {
    //method now throws invalid type expression for invalid floats/doubles
    assertTrue("should throw InvalidExpressionException", revCalc.evaluate("3 h - 6 +") == 9);
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
    assertTrue("should throw InvalidExpressionException", revCalc.evaluate("") == 6);
    assertTrue("should throw InvalidExpressionException", revCalc.evaluate(" ") == 2);
  }

}
