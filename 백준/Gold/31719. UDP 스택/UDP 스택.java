import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int T = sc.nextInt();
		test:for(int tc=1; tc<=T; tc++) {
			String ans = "YES";
			int N = sc.nextInt();
			int bottom = 0;
			Pair D = new Pair(0,0);
			Pair P = new Pair(0,0);
			for(int i=1; i<=N; i++) {
				int num = sc.nextInt();
				if(D.x==bottom+1) {
					bottom = D.y;
					D.x = 0;
					D.y = 0;
				}
				
				if(P.x==bottom+1) {
					bottom = P.y;
					P.x = 0;
					P.y = 0;
				}
				if(num == bottom+1) {
					bottom++;
				}
				else if(D.y == num-1) {
					D.y++;
				}
				else if(P.y == num-1) {
					P.y++;
				}
				else if(D.x == 0) {
					D.x = num;
					D.y = num;
				}
				else if(P.x == 0) {
					P.x = num;
					P.y = num;
				}
				else {
					ans = "NO";
				}
			}
			out.println(ans);
		}

		out.close();
	}
	
	static class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
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