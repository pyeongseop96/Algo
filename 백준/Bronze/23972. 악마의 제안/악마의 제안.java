import java.util.*;
import java.util.function.IntPredicate;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		long K = sc.nextLong();
		long N = sc.nextLong();
		if(N==1) {
			out.println(-1);
		}
		else {
			long ans = (K * N)/(N - 1);
			if((K * N)%(N - 1)!=0) {
				ans++;
			}
			out.println(ans);
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