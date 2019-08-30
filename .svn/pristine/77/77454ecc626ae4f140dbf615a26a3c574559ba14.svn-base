package model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a stack of Entry objects, constructed using an
 * ArrayList.
 * 
 * @author Amena Rafiq
 * @see    ArrayList List 
 *
 */
public class Stack {
  
  private int size;
  //private Entry[] entries = new Entry[100];
  private List<Entry> entries = new ArrayList<Entry>(); 

  /**
   * Returns a boolean value to indicate if the stack is empty. 
   *
   * @return  true   if the stack is empty
   *          false  if the stack is not empty
   */
  public boolean isEmpty() {
    //return (size == 0); 
    return (entries.isEmpty()); 
  }
  
  /**
   * Returns an integer value representing the size of the stack. 
   *
   * @return  the integer value stored in size
   */
  public int size() {
    return size;
  }

  /**
   * Pushes an Entry object on top of the stack. In doing so, the 
   * size of the stack is incremented.
   *
   * @param entry the Entry object to be pushed onto the stack
   * @see         Entry
   */
  public void push(Entry entry) {
    //entries[size + 1] = entry; 
    entries.add(entry);
    size = size + 1;
  }

  /**
   * Returns and removes the Entry object that was at the top of the stack. The size of the
   * stack is decremented. 
   *
   * @return entry                      the Entry object at the top of the stack
   * @throws IndexOutOfBoundsException  if the stack does not contain any entries, an exception 
   *                                    is thrown to indicate that the stack is empty
   * @see                               IndexOutOfBoundsException Entry
   */
  public Entry pop() throws IndexOutOfBoundsException {
    //if (isEmpty()) {
    if (entries.isEmpty()) {
      throw new IndexOutOfBoundsException("Exception: Stack is Empty");
    }
    //Entry popped = entries[size];
    Entry popped = entries.get(size - 1);
    entries.remove(size - 1);
    size = size - 1; 
    return popped;
  }

  /**
   * Returns the Entry object that was at the top of the stack. The entry is not removed
   * and thus the size is not affected. 
   *
   * @return                            the Entry object at the top of the stack
   * @throws IndexOutOfBoundsException  if the stack does not contain any entries, an exception 
   *                                    is thrown to indicate that the stack is empty
   * @see                               IndexOutOfBoundsException Entry
   */
  public Entry top() throws IndexOutOfBoundsException {
    //if (isEmpty()) {
    if (entries.isEmpty()) {
      throw new IndexOutOfBoundsException("Empty Stack");
    }
    //return entries[size];
    return entries.get(size - 1);
  }
}
