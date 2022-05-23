/*                       *
 * Mason Inman Recursion *
 *                       */
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter option number: (1 = Fibbonacci; 2 = Factorial)");
    int option = scan.nextInt();
    if (option == 1) //fibonacci sequence
    {
      System.out.println("FIBONACCI\n\nEnter a position:");
      int num = scan.nextInt();
      while (num > 0) {
        System.out.println("Fibonacci Number: " + Methods.fibSeq(num));
        System.out.println("-----------\nEnter a position:");
        num = scan.nextInt();
      }
      System.out.println("\t\t--finished--");
    }
    else if(option == 2) //factorial
    {
      System.out.println("FACTORIAL\n\nEnter a number: ");
      int num = scan.nextInt();
      while (num > 0)
      {
        System.out.println(num + "! = " + Methods.factorial(num));
        System.out.println("Enter a number: ");
        num = scan.nextInt();
      }
      System.out.println("\t\t--finished--");
    }  
  }
}