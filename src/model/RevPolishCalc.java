package model;

import java.util.Scanner;

/**
 * This class evaluates reverse polish string expressions.
 * It implements the interface Calculator.
 * 
 * @author Amena Rafiq
 * @see    TestRevPolish NumStack Stack Entry Calculator
 */
public class RevPolishCalc implements Calculator {

  private NumStack values = new NumStack();

  /**
   * Takes a post-fix expressions and calculates the result
   * using a stack. 
   * 
   * @param   expression   String post-fix expression to be calculated
   * @returns result       result of calculation in type double
   * @throws  InvalidExpressionException checks if the expression is invalid
   * @author  Amena Rafiq
   * @see     TestRevPolish NumStack Stack Entry Calculator
   */
  public double evaluate(String expression) throws InvalidExpressionException {
    Scanner scanner = new Scanner(expression);
    Entry operator = null; 
    double result = 0;
    
    if (expression.trim().isEmpty()) { 
      scanner.close();
      throw new InvalidExpressionException("Empty Expression");
    }
    
    while (scanner.hasNext()) {
      
      while (scanner.hasNextDouble()) {
        values.push(scanner.nextDouble()); 
      } 
      double secondValue;
      try {
        secondValue = values.pop();
      } catch (IndexOutOfBoundsException e) {
        scanner.close();
        throw new InvalidExpressionException("Invalid: enter floats");
      } catch (BadTypeException e) {
        scanner.close();
        throw new InvalidExpressionException("Invalid: enter floats");
      } 
      double firstValue;
      try {
        firstValue = values.pop();
      } catch (IndexOutOfBoundsException e) {
        scanner.close();
        throw new InvalidExpressionException("Invalid: enter floats");
      } catch (BadTypeException e) {
        scanner.close();
        throw new InvalidExpressionException("Invalid: enter floats");
      }

      if (scanner.hasNext()) {
        operator = new Entry(scanner.next());
      }
  
      if (operator != null) {
        try {
          switch (operator.getSymbol()) {
            case TIMES: result = firstValue * secondValue;
          break;
            case DIVIDE: result = firstValue / secondValue;
          break;
            case PLUS: result = firstValue + secondValue;
          break;
            case MINUS: result = firstValue - secondValue;
          break;
            default: throw new InvalidExpressionException("Invalid Operator");
          }
        } catch (BadTypeException e) {
          scanner.close();
          throw new InvalidExpressionException("Invalid Operator");
        } 
      }

      values.push(result);
    }
    scanner.close();
    return result;
  }
}

