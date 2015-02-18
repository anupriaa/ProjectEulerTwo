/**
 * Solves problem Euler 2.
 */
public class ProjectEulerTwo {
  /**
   * Computes sum of even Fibonacci terms less than 4000000.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfEvenFibonacciTerms(4000000);
    System.out.print("Sum = " + sum);
  }

  /**
   * Computes sum of even Fibonacci terms less than upperBound.
   * @param upperBound upperBound for computing the sum.
   * @return the sum.
   */
  public static int computeSumOfEvenFibonacciTerms(int upperBound) {
    int f = 1, l = 2, temp , sum = 0;
    while (l < upperBound) {
      if (l % 2 == 0) {
        sum += l;
      }
      temp = l;
      l = l + f;
      f = temp;
    }
    return sum;
  }
}
