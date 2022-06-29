import java.util.*;
import java.io.*;
import java.lang.*;

class Kth_Smallest_Difference {
  static int smallestDistancePair(int[] arr, int k) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr[arr.length - 1] - arr[0];
        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0, left = 0;
            for (int right = 0; right < arr.length; ++right) {
                while (arr[right] - arr[left] > mid) 
                  left++;
                count += right - left;
            }
            if (count >= k) 
              high = mi;
            else 
              low = mi + 1;
        }
        return low;
  }
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    while (t-- > 0) {
      int n = sc.nextInt(); 
      int k = sc.nextInt(); 
      int arr[]= new int[n]; 
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println(Math.abs(smallestDistancePair(arr, k)));
    }
  }
}

