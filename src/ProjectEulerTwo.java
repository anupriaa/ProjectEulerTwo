/**
 * Solves project euler problem 2.
 */
public class ProjectEulerTwo {
  /**
   * Computes and prints the sum of even fibonacci terms below 4000000.
   * @param args ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfEvenFibonacciTerms(4000000);
    System.out.print("Sum = " + sum);
  }

  /**
   * Computes and prints the sum of even fibonacci terms below 4000000.
   * @return the sum.
   * @param upperBound the upper bound for calculating the sum.
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
