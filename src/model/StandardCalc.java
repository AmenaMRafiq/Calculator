package model;

/**
 * This class is being used as a stub to represent a working
 * infix calculator. The correct algorithm has not been implemented yet.
 * It currently returns a fixed answer of 12.34
 * 
 * @author Amena Rafiq
 * @see    TestStandardCalc Calculator 
 */

public class StandardCalc implements Calculator {

  /**
   * Takes a a string expression and returns fixed result of 12.34 
   * 
   * @param   expression   String expression to be calculated
   * @returns result       fixed at 12.34
   * @throws  InvalidExpressionException checks if the expression is invalid
   * @author  Amena Rafiq
   * @see     TestStandardCalc Calculator
   */
  public double evaluate(String expression) throws InvalidExpressionException { 
    //check if user didn't input anything
    if (expression.trim().isEmpty()) { 
      throw new InvalidExpressionException("Empty Expression");
    } else {
      //technically the algorithm for shunting yard and passing it to RevPolishCalc should be here
      return 12.34; 
    }
  }

}
