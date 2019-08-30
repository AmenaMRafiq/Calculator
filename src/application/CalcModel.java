package application;

import model.Calculator;
import model.InvalidExpressionException;
import model.RevPolishCalc;
import model.StandardCalc;

/**
 * This class is the model of the calculator, evaluates string expressions
 * regardless of the type.
 * Idea and code written by Dave Cohen, adapted into project by Amena Rafiq.
 * 
 * @author Dave Cohen Amena Rafiq 
 */

public class CalcModel {
  RevPolishCalc revCalc = new RevPolishCalc();
  StandardCalc standCalc = new StandardCalc();
  public Calculator current = (Calculator) standCalc; //state

  /**
   * Depending on the boolean value passed to it from the controller
   * sets the current state of the model to the correct type of calculator. 
   *
   * @param  infix             boolean value true is infix, false is post-fix.
   * @see                      CalcController RevPolishCalc StandardCalc Calculator
   */
  public void setType(boolean infix) {
    if (infix) {
      current = (Calculator) standCalc;
    } else {
      current = (Calculator) revCalc;
    }

  }

  /**
   * Uses the correct type of calculator's evaluate method to get the
   * result of the expression.
   *
   * @param  expression        String expression which is the user input
   * @return                   double value, result of calculator's evaluate method.
   * @see                      RevPolishCalc StandardCalc Calculator
   */
  public double evaluate(String expression) throws InvalidExpressionException {
    return current.evaluate(expression);
  }

  /**
   * Calls evaluate() and changes the double result value of 
   * evaluate to a String so the view can set the answer on the GUI.
   *
   * @param  expression        String expression which is the user input
   * @return                   string version of result of calculator's evaluate method.
   * @see                      Calculator CalcModel.evaluate()
   */
  public String getValue(String expression) throws InvalidExpressionException {
    return Double.toString(evaluate(expression));
  }
}
