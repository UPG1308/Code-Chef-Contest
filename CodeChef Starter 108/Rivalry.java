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
		int R1 = sc.nextInt();
		int R2 = sc.nextInt();
		int D1 = sc.nextInt();
		int D2 = sc.nextInt();
		if(R1 + D1 > R2 + D2)System.out.println("Dominater");
		else System.out.println("Everule");
	}
}
