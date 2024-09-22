import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    void solve() {
    	
    }
    
    void run() {
        sc = new FastScanner();
//    	sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }
       
        int N = sc.nextInt();
        while(N>0) {
        	N-=1;
        	String str = sc.next();
        	int ans = 0;
        	for(int i=0; i<str.length()-2; i++) {
        		if(str.charAt(i)=='W' && str.charAt(i+1)=='O' && str.charAt(i+2)=='W') {
        			ans++;
        		}
        	}
        	out.println(ans);
        }
        out.close();
    }

    FastScanner sc;
//    Scanner sc;
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
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}