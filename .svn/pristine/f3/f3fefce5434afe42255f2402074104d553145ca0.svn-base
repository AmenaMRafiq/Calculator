package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
  
  /**
   * Runs all of the classes in the test suite.
   * Prints out failures.
   */
  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(TestSuite.class);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }

    System.out.println(result.wasSuccessful());
  }
}