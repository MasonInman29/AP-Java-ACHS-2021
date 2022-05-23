import java.util.*;
class Main {
  public static void main(String[] args) {
    Table t = new Table();
    Scanner scan = new Scanner(System.in);
    System.out.println("\n\n\t-Trapezoidal Sum Calculator-");
    System.out.println("\nPlease enter x values follwed by y values, to make a point (x, y) in \nQuadrant I. Type -1 to stop adding points");
    double x = scan.nextDouble();
    double y = scan.nextDouble();
    while (x >= 0 && y >= 0)
    {
      t.addPoint(x, y);
      System.out.println("Entered point (" + x + ", " + y + ")");
      System.out.println("Enter another point: Enter -1 at least once to stop.");
      x = scan.nextDouble();
      y = scan.nextDouble();
    }
    System.out.println(t);
    t.removeDuplicates();
    t.sort();
    System.out.println(t);
    System.out.println("\n\n\t Trapezoidal Sum = " + t.trapezoidalSum());
  }
}