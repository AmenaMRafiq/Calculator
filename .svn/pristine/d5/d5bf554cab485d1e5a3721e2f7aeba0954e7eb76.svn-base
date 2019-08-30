package model;

/**
 * Entry class objects represent values stored in a stack. 
 * There are three constructors that can create Entry objects with Float, String
 * and Symbol attributes. The Type of the object is also stored within the 
 * constructors.
 * 
 * @author Amena Rafiq
 * @see    Symbol Type
 */

public class Entry {

  private double number;
  private Symbol other;
  private String str;
  private Type type;

  /**
   * Constructor for Entry object that assigns a Double value to the 
   * number attribute. The object's type attribute is assigned Type.NUMBER
   * accordingly.
   *
   * @param d the double value to be stored in the object 
   * @see     Type
   */
  public Entry(double d) {
    this.number = d;
    type = Type.NUMBER;
  }

  /**
   * Constructor for Entry object that assigns a Symbol value to the 
   * other attribute.The object's type attribute is assigned Type.SYMBOL
   * accordingly.
   *
   * @param which the Symbol value to be stored in the object 
   * @see         Symbol Type
   */
  public Entry(Symbol which) {
    other = which;
    type = Type.SYMBOL;
  }

  /**
   * Constructor for Entry object that assigns a String value to the 
   * str attribute. The object's type attribute is assigned Type.STRING
   * accordingly.
   *
   * @param str the string value to be stored in the object 
   * @see       Type
   */
  public Entry(String str) {
    this.str = str;
    type = Type.STRING;
  }
  
  /**
   * Returns the Double value stored in the Object's number attribute. 
   *
   * @return                   the value stored in number
   * @throws BadTypeException  if the type of the Entry object is not Type.NUMBER, a BadType 
   *                           exception is thrown to indicate that this method should not be 
   *                           called for this Entry object
   * @see                      BadTypeException
   */
  public double getValue() throws BadTypeException {
    if (type != Type.NUMBER) {
      throw new BadTypeException("Bad Type - type should be number");
    }
    return number; 
  }

  /**
   * Returns the String value stored in the Object's str attribute. 
   *
   * @return                   the string stored in str
   * @throws BadTypeException  if the type of the Entry object is not Type.STRING, a BadType 
   *                           exception is thrown to indicate that this method should not be 
   *                           called for this Entry object
   * @see                      BadTypeException
   */
  public String getString() throws BadTypeException {
    if (type != Type.STRING) {
      throw new BadTypeException("Bad Type - type should be string");
    }
    return str;
  }

  /**
   * Returns the Symbol stored in the Object's other attribute. Also checks if there was 
   * a symbol character stored in the str attribute, if so assigns  the type attribute 
   * other accordingly.
   *
   * @return                   the Symbol stored in other
   * @throws BadTypeException  if the type of the Entry object is not Type.NUMBER, a BadType 
   *                           exception is thrown to indicate that this method should not be 
   *                           called for this Entry object
   * @see                      BadTypeException Symbol
   */
  public Symbol getSymbol() throws BadTypeException { 
    //if a symbol was read as a string, assign other attribute with correct symbol
    if (str != null) {
      switch (str.toString()) {
        case "(": other = Symbol.LEFTBRACKET;
          break;
        case ")": other = Symbol.RIGHTBRACKET;
          break;
        case "*": other = Symbol.TIMES;
          break;
        case "/": other = Symbol.DIVIDE;
          break;
        case "+":  other = Symbol.PLUS;
          break;
        case "-": other = Symbol.MINUS;
          break;
        default: other = Symbol.INVALID;
          break;
      }
      type = Type.SYMBOL;
    }
    //otherwise if no string was read, return the value stored in other 
    if (type != Type.SYMBOL || other == Symbol.INVALID) {
      throw new BadTypeException("Bad Type - type should be symbol");
    }
    return other;
  }

  /**
   * Returns the Type value stored in the Object's type attribute. 
   *
   * @return                   the Type stored in type
   * @throws BadTypeException  if the type of the Entry object is Type.INVALID, a BadType 
   *                           exception is thrown to indicate that this method should not be 
   *                           called for this Entry object
   * @see                      BadTypeException Type
   */
  public Type getType() throws BadTypeException {
    if (type == Type.INVALID) {
      throw new BadTypeException("Bad Type - type should be symbol");
    }
    return type;  
  }
  
  /**
   * Returns a boolean value to indicate whether two Entry objects are equal. 
   * First the types of the objects are compared, then their subsequent values
   * are compared by calling the appropriate methods.
   *
   * @param  entry             the Entry object being compared
   * @return true              if the type and value are equal
   *         false             if the type and value are different
   * @throws BadTypeException  if the type of the Entry object is Type.INVALID, a BadType 
   *                           exception is thrown to indicate that this method should not be 
   *                           called for this Entry object
   * @see                      BadTypeException
   */
  public boolean equals(Entry entry) throws BadTypeException {
    if (entry == null) {
      return false;
    }
    if (entry.getType() == Type.INVALID) {
      throw new BadTypeException("Bad Type - type should be symbol");
    }
    
    if (this.type == entry.getType()) {
      if (type == Type.NUMBER) {
        return this.number == entry.getValue();
      } else if (type == Type.STRING) {
        return this.str.equals(entry.getString());
      } else if (type == Type.SYMBOL) {
        return this.other == entry.getSymbol();
      }
    }
    return false;
  }
  
}


