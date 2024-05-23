import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		int[][] dp = new int[R][C];
		String[][] map = new String[R][C];
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				map[i][j] = sc.next();
			}
		}
		
		int[][] pointA = new int[R][C];
		int[][] pointB = new int[R][C];
		
		for(int j=0; j<C; j++) { 
			int sum = 0;
			for(int i=R-1; i>=0; i--) {
				if(map[i][j].charAt(0)=='A') {
					int cur = 0;
					for(int k=1; k<map[i][j].length(); k++) {
						cur *= 10;
						cur += map[i][j].charAt(k)-'0';
					}
					sum += cur;
				}
				pointA[i][j] = sum;
			}
		}
		
		for(int i=0; i<R; i++) { 
			int sum = 0;
			for(int j=C-1; j>=0; j--) {
				if(map[i][j].charAt(0)=='B') {
					int cur = 0;
					for(int k=1; k<map[i][j].length(); k++) {
						cur *= 10;
						cur += map[i][j].charAt(k)-'0';
					}
					sum += cur;
				}
				pointB[i][j] = sum;
			}
		}
		
		for(int j=C-2; j>=0; j--) { 
			for(int i=R-2; i>=0; i--) {
				
				if(dp[i][j] < dp[i+1][j]+pointB[i][j+1]) {
					dp[i][j] = dp[i+1][j]+pointB[i][j+1];
				}
				if(dp[i][j] < dp[i][j+1]+pointA[i+1][j]) {
					dp[i][j] = dp[i][j+1]+pointA[i+1][j];
				}
				if(dp[i][j] < dp[i+1][j+1]+pointA[i+1][j]+pointB[i][j+1]) {
					dp[i][j] = dp[i+1][j+1]+pointA[i+1][j]+pointB[i][j+1];
				}
//				System.out.println(dp[i][j]);
			}
		}
		out.println(dp[0][0]);
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