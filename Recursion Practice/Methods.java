/*                       *
 * Mason Inman Recursion *
 *                       */
public class Methods 
{
  public static int fibSeq(int n) {
      if (n < 3) {
        return 1;
      }
      return fibSeq(n-1) + fibSeq(n-2);
    }
  public static int factorial(int n) {
    //base case
    if (n <= 1) {
      return 1;
    }
    return n * factorial(n-1);
  }
}