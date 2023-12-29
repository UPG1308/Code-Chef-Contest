import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0, max = 0;
            for(int i = 0; i < n; i++){
                int val = sc.nextInt();
                if(val >= max) max = val;
                else count++;
            }
            System.out.println(count);
        }
	}
}
