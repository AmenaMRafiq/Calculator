package model;

/**
 * This interface allows the calculation of string expressions.
 *     
 * @author Amena Rafiq
 */

public interface Calculator {

  public double evaluate(String text) throws InvalidExpressionException;
} 
