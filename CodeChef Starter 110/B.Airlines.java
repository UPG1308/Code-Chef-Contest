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
		    int x = sc.nextInt();
		    double n = sc.nextInt();
		  //  int totalPossible = 100 * x;
		    double val = Math.ceil(n/100);
		    if(val > x) System.out.println((int)val - x);
		    else System.out.println("0");
		}
	}
}
