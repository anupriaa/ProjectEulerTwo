/**
 * Solves Euler problem 2.
 */
public class ProjectEulerTwo {
  /**
   * Prints the sum of even valued terms in fibonacci series below upper bound.
   * @param args ignored.
   */
  public static void main(String[] args) {
    int sum = computesSumOfEvenTerms(90);
    System.out.print("Sum = " + sum);
  }

  /**
   * Computes the sum of even valued terms in fibonacci series below upper bound.
   * @param upperBound The maximum value for the last term in series.
   * @return the sum of even terms in the fibonacci series.
   */
  public static int computesSumOfEvenTerms(int upperBound) {
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
