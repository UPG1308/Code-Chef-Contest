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
		    String s = sc.next();
		    if(isVowel(s.charAt(0)) || !isVowel(s.charAt(1)) || isVowel(s.charAt(2)) || !isVowel(s.charAt(3)) || isVowel(s.charAt(4)) || !isVowel(s.charAt(5)) || isVowel(s.charAt(6)) || isVowel(s.charAt(7)))
		    System.out.println("NO");
		    else System.out.println("YES");
		}
	}
	public static boolean isVowel(char c){
	    return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
}
