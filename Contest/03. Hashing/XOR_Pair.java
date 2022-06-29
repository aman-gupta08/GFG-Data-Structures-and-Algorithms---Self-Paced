import java.util.*;
import java.lang.*;
import java.io.*;

class XOR_Pair {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            HashSet<Integer> set = new HashSet<>();
            int r = 0;
            
            for (int i = 0; i < n; i++) {
                if (set.contains(arr[i]^c)) {
                    r += 1;
                }
                set.add(arr[i]);
            }
            
            if (r > 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
	}
}
