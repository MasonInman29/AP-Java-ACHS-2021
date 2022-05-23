import java.util.*;
class Main {
  public static int binarySearch(int[] arr, int target, int low, int high)
  {
    {
      int mid = (low+high)/2; //look at middle of array
      if (arr[mid] == target) {
        return mid;
      }
      if(high < low) {
        return -1; //INF
      }
      if (arr[mid] < target) {
         return binarySearch(arr, target, mid+1, high); 
        //just the bigger half
      }
      if (arr[mid] > target) {
        return binarySearch(arr, target, low, mid-1);
        //just smaller half
      }
      return -1;
    }
  }
  public static void main(String[] args) {
    int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50, 57, 61, 62, 63, 67, 69, 70, 75, 76, 79, 83, 85, 88, 89, 97, 98 ,99, 111, 145, 1355};
    System.out.println("Search for what number?");
    Scanner scan = new Scanner(System.in);
    int numToFind = scan.nextInt();
    System.out.println("Searching...");
    System.out.println("Length of arr: " + arr.length);
    System.out.println("Number found at index " + binarySearch(arr, numToFind, 0, arr.length-1));
  }
}