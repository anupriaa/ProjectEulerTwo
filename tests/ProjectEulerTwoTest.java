import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test method ComputeSumOfEvnFibonacciTerms().
 */
public class ProjectEulerTwoTest {
  /**
   * Tests ComputeSumOfEvnFibonacciTerms() for small upper bound.
   * @throws Exception If error Occurs.
   */
  @Test
  public void testComputeSumOfEvnFibonacciTerms() throws Exception {
    assertEquals("Checks for sum of terms below 10" , 10 , ProjectEulerTwo.computeSumOfEvnFibonacciTerms(10));
    assertEquals("Checks for sum of terms below 90" , 44 , ProjectEulerTwo.computeSumOfEvnFibonacciTerms(90));
  }
}