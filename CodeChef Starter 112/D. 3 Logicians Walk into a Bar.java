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
		    String s = sc.next();
		    boolean dontWant = false;
		    for(int i = 0; i < s.length(); i++){
		        char c = s.charAt(i);
		        if(c == '0') dontWant = true;
		        if(dontWant)System.out.println("NO");
		        else if(c == '1' && i == n - 1)System.out.println("YES");
		        else System.out.println("IDK");
		    }
		}
	}
}
