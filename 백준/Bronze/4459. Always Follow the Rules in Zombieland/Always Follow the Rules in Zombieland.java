import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    void solve() {
    	
    }
    
    void run() {
//        sc = new FastScanner();
    	sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }
       int N = sc.nextInt();
       sc.nextLine();
       String[] arr = new String[N];
       for(int i=0; i<N; i++) {
    	   arr[i] = sc.nextLine();
       }
       int M = sc.nextInt();
       for(int i=1; i<=M; i++) {
    	   int num = sc.nextInt();
    	   out.print("Rule ");
    	   out.print(num);
    	   out.print(": ");
    	   if(num<=0 || num>N) {
    		   out.println("No such rule");
    	   }
    	   else {
    		   out.println(arr[num-1]);
    	   }
       }
       out.close();
    }

//    FastScanner sc;
    Scanner sc;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
 
		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}