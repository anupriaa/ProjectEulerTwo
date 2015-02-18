/**
 * Solves Euler Problem 2.
 */
public class ProjectEulerTwo {
  /**
   * Computes sum of even terms in fibonacci series below 4000000.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfEvenFibonacciTerms(4000000);
    System.out.print("Sum = " + sum);
  }

  /**
   * Computes sum of even terms in fibonacci series below upperBound.
   * @param upperBound Upper bound to calculate sum.
   * @return the sum.
   */
  public static int computeSumOfEvenFibonacciTerms(int upperBound) {
    int f = 1 , l = 2 , temp , sum = 0;
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
