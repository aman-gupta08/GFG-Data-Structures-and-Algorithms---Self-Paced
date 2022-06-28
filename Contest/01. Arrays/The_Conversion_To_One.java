import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int CountWays(int N){
	
	    if(N == 1) {
	    	return 0;
	    }
	    else if(N % 2 == 0){
	    	return 1 + CountWays(N/2);
	    }
	    else {
	    	return 1 + Math.min(CountWays(N-1), CountWays(N+1));
	    }
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- >0) {

            int n = sc.nextInt(); 
            System.out.println(CountWays(n));
        }
		
	}
}