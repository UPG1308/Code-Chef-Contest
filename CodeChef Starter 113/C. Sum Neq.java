/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		   
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
		    
		    if(n < 4 || n == 4 && arr[0] + arr[1] == arr[2] + arr[3]){
		        System.out.println("NO");
		        continue;
		    }
		    boolean flag = true;
		    for(int i = 1; i < n; i++){
		        if(arr[i] == arr[i - 1]) continue;
		        else {
		            flag = false;
		            System.out.println("YES");
		            break;
		        }
		        
		    }
		    if(flag)System.out.println("NO");
		}
	}
}
