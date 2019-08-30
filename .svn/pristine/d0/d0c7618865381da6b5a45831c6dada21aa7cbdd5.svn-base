package test;

import static org.junit.Assert.assertTrue;

import application.CalcModel;
import model.InvalidExpressionException;
import model.RevPolishCalc;
import model.StandardCalc;

import org.junit.Before;
import org.junit.Test;

/**
 * This test class holds all of the J-Unit tests recorded for the CalcModel class.
 * 
 * @author Amena Rafiq
 * @see    CalcModel
 */
public class TestCalcModel {

  private CalcModel model;
  
  @Before
  public void setUp() {
    model = new CalcModel();
  }
  
  /**
   * Tests if the setType() method switches the model to 
   * StandardCalc correctly.
   */
  @Test
  public void testSetTypeInfix() {
    model.setType(true);
    assertTrue("should be Standard", model.current.getClass() == StandardCalc.class);
  }
  
  /**
   * Tests if the setType() method switches the model to 
   * RevCalc correctly.
   */
  @Test
  public void testSetTypePostFix() {
    model.setType(false);
    assertTrue("should be RevCalc", model.current.getClass() == RevPolishCalc.class);
  }

  /**
   * Tests the evaluate() method for infix.
   * 
   * @throws InvalidExpressionException if the expression is invalid
   */
  @Test
  public void testInfixEvaluate() throws InvalidExpressionException {
    model.setType(true);
    assertTrue("should be 12.34", model.current.evaluate("2 + 2") == 12.34);
  }
  
  /**
   * Tests the evaluate() method for post-fix.
   * 
   * @throws InvalidExpressionException if the expression is invalid
   */
  @Test
  public void testPostfixEvaluate() throws InvalidExpressionException {
    model.setType(false);
    assertTrue("should be 2", model.current.evaluate("4 1 * 2 -") == 2);
  }
  
  /**
   * Tests the getValue() method returns a string answer from evaluate().
   * 
   * @throws InvalidExpressionException if the expression is invalid
   */
  @Test
  public void testGetValue() throws InvalidExpressionException {
    model.setType(false);
    assertTrue("should be a string", model.getValue("4 1 * 2 -").equals("2.0"));
  }
}
