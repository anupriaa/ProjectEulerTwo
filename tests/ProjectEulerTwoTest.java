import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ComputeSumOfEvenFibonacciTerms() method from ProjectEulerOne.
 */
public class ProjectEulerTwoTest {
  /**
   *Tests the ComputeSumOfEvenFibonacciTerms() for smaller upper bound values.
   * @throws Exception if error occurs.
   */
  @Test
  public void testComputeSumOfEvenFibonacciTerms() throws Exception {
    assertEquals("Checking for upper bound 10" , 10 , ProjectEulerTwo.computeSumOfEvenFibonacciTerms(10));
    assertEquals("Checking for upper bound 90" , 44 , ProjectEulerTwo.computeSumOfEvenFibonacciTerms(90));

  }
}