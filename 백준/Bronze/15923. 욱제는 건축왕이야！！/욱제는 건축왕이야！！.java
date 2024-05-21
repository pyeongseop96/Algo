import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int N = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int beforeA = a;
		int beforeB = b;
		int ans = 0;
		for(int i=1; i<=N-1; i++) {
			int afterA = sc.nextInt();
			int afterB = sc.nextInt();
			ans += Math.abs(beforeA-afterA)+Math.abs(beforeB-afterB);
			beforeA = afterA;
			beforeB = afterB;
			if(i==N-1) {
				ans += Math.abs(a-afterA)+Math.abs(b-afterB);
			}
		}
		out.print(ans);
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