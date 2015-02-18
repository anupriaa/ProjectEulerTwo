import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests method ComputeSumOfEvenFibonacciTerms().
 */
public class ProjectEulerTwoTest {
  /**
   * Checks ComputeSumOfEvenFibonacciTerms() for small upper bounds.
   * @throws Exception If error.
   */
  @Test
  public void testComputeSumOfEvenFibonacciTerms() throws Exception {
    assertEquals("Checks for terms less than 10" , 10 , ProjectEulerTwo.computeSumOfEvenFibonacciTerms(10));
    assertEquals("Checks for terms less than 90" , 44 , ProjectEulerTwo.computeSumOfEvenFibonacciTerms(90));
  }
}