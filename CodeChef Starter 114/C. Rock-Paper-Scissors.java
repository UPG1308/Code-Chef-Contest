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
            String s = sc.next();
            StringBuilder rps = new StringBuilder(s);
            
            int TotalWins = (n/2) + 1;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == 'R'){
                    TotalWins--;
                    
                } 
                rps.replace(i,i+1, "P");
                // rps.insert(i, 'P');
            }
            int i = n - 1;
            while(TotalWins > 0 && i >= 0){
                if(s.charAt(i) == 'S'){
                    rps.replace(i,i+1, "R");
                    // rps.insert(i, "R");
                    TotalWins--;
                }
                else if(s.charAt(i) == 'P'){
                    rps.replace(i,i+1,"S");
                    // rps.insert(i, "S");
                    TotalWins--;
                }
                i--;
            }
            
            System.out.println(rps.toString());
            // System.out.println(Arrays.toString(rps));
        }
	}
}
