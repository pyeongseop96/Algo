import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(3*a>b) {
				out.println((3*a)-b);
			}
			else if(4*a<b) {
				if(3*(a+(((b-(4*a)-1)/4)+1))>b) {
					out.println(((b-(4*a)-1)/4)+1 + (3*(a+(((b-(4*a)-1)/4)+1))-b));
				}
				else {
					out.println(((b-(4*a)-1)/4)+1);
				}
			}
			else {
				out.println(0);
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