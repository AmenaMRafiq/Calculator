package test; 

import static org.junit.Assert.assertTrue;

import application.CalcModel;
import model.InvalidExpressionException;

import org.junit.Before;
import org.junit.Test;



public class CapacityTesting {

  private CalcModel model;

  @Before
  public void setUp() {
    model = new CalcModel();
  }

  /**
   * Tests the evaluate() method for post-fix LONG expression.
   * 
   * @throws InvalidExpressionException if the expression is invalid
   */
  @Test
  public void testLongExpression() throws InvalidExpressionException {
    model.setType(false);
    //Manually given lengthy expression
    assertTrue("should be 2", model.current.evaluate("4 1 * 2 - 2 + 2 - "
        + "2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - "
        + "2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - "
        + "2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - "
        + "2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - "
        + "2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - "
        + "2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - "
        + "2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - "
        + "2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - "
        + "2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 - 2 + 2 -") == 2);

  }

}