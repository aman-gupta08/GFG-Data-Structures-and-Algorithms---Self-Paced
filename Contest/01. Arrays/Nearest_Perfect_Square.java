import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static boolean isPerfectSquare(long number)
    {
        long root = (long)Math.sqrt(number);
        return root*root==number;
    }
} 

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in); 
		int testcases = sc.nextInt();

        while(testcases-->0)
        {
            long n = sc.nextLong();

            long smaller; 
            long greater;

            if(Solution.isPerfectSquare(n) == true)
            {
                smaller = (long)Math.sqrt(n)-1; 
                greater = (long)Math.sqrt(n)+1;
            }
            else
            {
                smaller = (long)Math.floor(Math.sqrt(n)); 
                greater = (long)Math.ceil(Math.sqrt(n));
            }
            if((long)Math.abs(smaller * smaller-n) < (long)Math.abs(greater * greater-n)) 
            System.out.println(smaller*smaller);
            else
            System.out.println(greater*greater);
        }
	}
}