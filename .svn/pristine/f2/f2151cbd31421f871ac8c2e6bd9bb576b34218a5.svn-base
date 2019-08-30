package model;

/**
 * NumStack class represents stack of numeric values.
 * This acts as a facade to assist RevPolishCalc class.
 * 
 * @author Amena Rafiq
 * @see    Stack Entry  
 */

public class NumStack {

  private Stack numStack = new Stack();

  public boolean isEmpty() {
    return numStack.isEmpty();
  }

  /**
   * Pushes an Entry object on top of the stack. In doing so, the 
   * size of the stack is incremented.
   *
   * @param d     the double value for the Entry object to be pushed onto the stack
   * @see         Entry Stack
   */
  public void push(double d) {
    numStack.push(new Entry(d));
  }

  public int size() {
    return numStack.size();
  }

  /**
   * Returns the value of and removes the Entry object that was at the top of the stack. 
   * The size of the stack is decremented. 
   *
   * @return                            the value of the Entry object at the top of the stack
   * @throws IndexOutOfBoundsException  if the stack does not contain any entries, an exception 
   *                                    is thrown to indicate that the stack is empty
   * @see                               IndexOutOfBoundsException Entry
   */
  public double pop() throws IndexOutOfBoundsException, BadTypeException {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException("Exception: NumStack is Empty");
    }
    return numStack.pop().getValue(); 
  }


}

