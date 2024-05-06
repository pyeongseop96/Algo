import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			double ans = 0;
			int a = sc.nextInt();
			ans += (int)(Math.pow(Math.abs(a-26.7),1.835)*9.23076);
			int b = sc.nextInt();
			ans += (int)(Math.pow(Math.abs(b-75.0),1.348)*1.84523);
			int c = sc.nextInt();
			ans += (int)(Math.pow(Math.abs(c-1.5),1.05)*56.0211);
			int d = sc.nextInt();
			ans += (int)(Math.pow(Math.abs(d-42.5),1.81)*4.99087);
			int e = sc.nextInt();
			ans += (int)(Math.pow(Math.abs(e-210.0),1.41)*0.188807);
			int f = sc.nextInt();
			ans += (int)(Math.pow(Math.abs(f-3.8),1.04)*15.9803);
			int g = sc.nextInt();
			ans += (int)(Math.pow(Math.abs(g-254.0),1.88)*0.11193);
			out.println((int)ans);
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