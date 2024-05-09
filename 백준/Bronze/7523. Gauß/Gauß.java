import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T ;tc++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long ans = 0;
			ans += b*(b+1)/2;
			if(a>0) {
				ans -= a*(a-1)/2;
			}
			else if(a<0) {
				a *= -1;
				ans -= a*(a+1)/2;
			}
			out.print("Scenario #");
			out.print(tc);
			out.println(":");
			out.println(ans);
			if(tc!=T) {
				out.println();
			}
		}

		out.close();
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