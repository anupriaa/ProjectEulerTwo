/**
 * Solves euler problem 2.
 */
public class ProjectEulerTwo {
  /**
   * Computes sum of even terms in fibonacci series below 4000000.
   * @param args ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfEvnFibonacciTerms(4000000);
    System.out.print("Sum = " + sum);
  }

  /**
   * Computes sum of even terms in fibonacci series below upperBound.
   * @param upperBound the upper bound to compute sum.
   * @return the sum.
   */
  public static int computeSumOfEvnFibonacciTerms(int upperBound) {
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
