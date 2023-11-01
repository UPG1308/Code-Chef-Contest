
import java.util.*;
import java.io.*;


class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreTokens()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
	
	
    public static void main(String[] args) {
      try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = in.nextInt();
            while(testCases-- > 0){
                solve(in , out);
            }
            out.close();
        } 
      catch (Exception e) {
          return;
      }
    }
    public static void charMatrixInput(FastReader in, FastWriter out){
      int n = 4;
      int m = 4;
      
      char grid[][] = new char[n][m];
      for(int i = 0; i < n; i++){
        String[] s = in.nextLine().trim().split("");
        for(int j = 0; j < m; j++){
          grid[i][j] = s[j].charAt(0); //Integer.parseInt(s[j]);
        }
      }
    }
    public static long ncr(int n, int r){
        long sum = 1;

        // Calculate the value of n choose r using the
        // binomial coefficient formula
        for (int i = 1; i <= r; i++) {
            sum = sum * (n - r + i) / i;
        }
        return sum;
    }
    public static int power(int x, int n, int p) {
        
        for(int i = 0;i < n; i++){
          x = (x * 2) % p;
        }
        return x % p;
    }
    
    public static void solve(FastReader in, FastWriter out) throws IOException {
      // 	charMatrixInput(in, out);
        int n = in.nextInt();
        // long prod = 1;
        // for(int i = 1; i <= n; i++){
        //   prod = prod * i;
        // }
        out.println(n * (n - 1));
    }
}
