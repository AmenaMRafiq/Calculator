package test;

import static org.junit.Assert.assertTrue;

import model.Type;

import org.junit.Test;

/**
 * This test class holds all of the J-Unit tests recorded for the Type class.
 * It tests the toString() method.
 * 
 * @author Amena Rafiq
 * @see    Type
 */
public class TestType {

  @Test
  public void test0() {
    //constructed enum class  
    assertTrue("name == NUMBER", Type.NUMBER.name() == "NUMBER");
  }
  
  @Test 
  public void test1() {
    //created private String attribute and constructor
    //overrode toString() 
    assertTrue("type == Number", Type.NUMBER.toString() == "Number");
  }
  
  @Test
  public void test2() { 
    assertTrue("name == SYMBOL", Type.SYMBOL.name() == "SYMBOL");
  }
  
  @Test 
  public void test3() {
    assertTrue("type == Symbol", Type.SYMBOL.toString() == "Symbol");
  }
  
  @Test
  public void test4() { 
    assertTrue("name == STRING", Type.STRING.name() == "STRING");
  }
  
  @Test 
  public void test5() {
    assertTrue("type == String", Type.STRING.toString() == "String");
  }
  
  @Test
  public void test6() { 
    assertTrue("name == INVALID", Type.INVALID.name() == "INVALID");
  }
  
  @Test 
  public void test7() {
    assertTrue("type == Invalid", Type.INVALID.toString() == "Invalid");
  }
}
