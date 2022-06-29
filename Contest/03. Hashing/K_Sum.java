import java.util.*;
import java.lang.*;
import java.io.*;

class K_Sum {
  public static void main(String[] args) {
        Scanner sc = new Scanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
