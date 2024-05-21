import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int N = sc.nextInt();
		int zzac = 0;
		int hole = 0;
		String str = sc.next();
		for(int i=0; i<N; i++) {
			int a = str.charAt(i)-'0';
			if(a%2==0) {
				zzac++;
			}
			else {
				hole++;
			}
		}
		if(zzac>hole) {
			out.println(0);
		}
		else if(zzac<hole) {
			out.println(1);
		}
		else {
			out.println(-1);
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