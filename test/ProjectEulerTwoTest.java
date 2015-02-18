import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests ProjectEulerTwo for small values.
 */
public class ProjectEulerTwoTest {
  /**
   * Tests the Sum of even terms in series below 90.
   * @throws Exception Throws exception if an error occurs.
   */
  @Test
  public void testComputesSumOfEvenTerms() throws Exception {
   assertEquals("Checks for first 10 terms " , 44, ProjectEulerTwo.computesSumOfEvenTerms(90));
  }
}