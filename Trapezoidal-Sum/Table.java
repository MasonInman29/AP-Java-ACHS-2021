import java.util.*;
public class Table
{
  private ArrayList<Double> xCords;
  private ArrayList<Double> yCords;

  public Table()
  {
    xCords = new ArrayList<Double>();
    yCords = new ArrayList<Double>();
  }
  //getters
  public ArrayList<Double> getXCords()
  {
    return xCords;
  }
  public ArrayList<Double> getYCords()
  {
    return yCords;
  }
  
  //methods
  public void addPoint(double x, double y)
  {
    if (x >= 0 && y >= 0)
    {
      xCords.add(x);
      yCords.add(y);
    }
  }
  public String toString()
  {
    int count = 1;
    String str = "\n0 |  X  |  Y  |";
    for (int i = 0; i < xCords.size(); i++) {
      str += "\n" + count + " | " + xCords.get(i) + " | " + yCords.get(i) + " |";
      count++;
    }
    return str;
  }
  /*Sorts x cords in ascending order, whenever an element in x changes index, the y cords at the same index switches to the same place*/
  public void sort()
  {
    for (int i = 0; i < xCords.size()-1; i++)
    {
      int min = i;
      for (int j = i+1; j < xCords.size(); j++)
      {
        if (xCords.get(min) > xCords.get(j)) {
          min = j;
        }
      }
      swap(i, min);
    }
  }
  /*swap index i and j in xCords and yCords*/
  public void swap(int i, int j)
  {
    double xTemp = xCords.get(i);
    double yTemp = yCords.get(i);
    xCords.set(i, xCords.get(j));
    yCords.set(i, yCords.get(j));
    xCords.set(j, xTemp);
    yCords.set(j, yTemp);
  }
  public void removeDuplicates()
  {
    ArrayList<Boolean> dupes = new ArrayList<Boolean>();
    for (int i = xCords.size()-1; i >= 1; i--)
    {
      boolean isDupe = false;
      for (int j = i-1; j >= 0; j--)
      {
        if (xCords.get(i) == xCords.get(j))
        {
          isDupe = true;
        }
      }
      dupes.add(isDupe);
    }
    for(int i = 0; i < xCords.size(); i++)
    {
      if (dupes.get(i))
      {
        xCords.remove(i);
        yCords.remove(i);
        i--;
      }
    }
  }
  public double areaOfTrapazoid(double b1, double b2, double h)
  {
    return ((b1 + b2) / 2) * h;
  }
  public double trapezoidalSum()
  {
    double sum = 0;
    for (int i = 0; i < xCords.size()-1; i++)
    {
      sum += areaOfTrapazoid(yCords.get(i), yCords.get(i+1), (xCords.get(i+1)-xCords.get(i)));
    }
    return sum;
  }
}