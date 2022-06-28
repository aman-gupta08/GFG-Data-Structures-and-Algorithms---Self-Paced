import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void repeated_Numbers(int A[]) {
        long act_a = 0;
        long act_sum_sq = 0;
        long exp_b;
        long exp_sum_sq;
        int i = 0;
        
        for(i = 0; i < A.length; i++) {
            act_a = act_a + (long)A[i];
            act_sum_sq = act_sum_sq + (long)A[i]*A[i];
        }
        
        exp_b = (long)(A.length)*(A.length+1)/2;
        exp_sum_sq = (long)(A.length)*(A.length+1)*(2*A.length+1)/6;
        
        long diff_sum_sq = exp_sum_sq - act_sum_sq;
        long diff_a = exp_b - act_a;
        
        long toggle = diff_sum_sq/diff_a;
        
        long miss = (toggle + diff_a)/2;
        long repp = miss - diff_a;
    
        System.out.println((int)repp + " " + (int)miss);

        return;
    }

	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
		
	    while(T-- > 0) {
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	    
	        for(int i = 0; i < N; i++){
	            int temp;
	            temp = sc.nextInt();
	            arr[i] = temp;
	        }
	        repeated_Numbers(arr);
	    }
		
	}
}