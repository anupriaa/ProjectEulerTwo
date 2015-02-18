import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for ComputeSumOfEvenFibonacciTerms().
 */
public class ProjectEulerTwoTest {
  /**
   * Tests method ComputeSumOfEvenFibonacciTerms for small numbers.
   * @throws Exception If error occurs.
   */
  @Test
  public void testComputeSumOfEvenFibonacciTerms() throws Exception {
    assertEquals("Check for upper bound 10" , 10 , ProjectEulerTwo.computeSumOfEvenFibonacciTerms(10));
    assertEquals("Check for upper bound 90" , 44 , ProjectEulerTwo.computeSumOfEvenFibonacciTerms(90));
  }
}