import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int c1 = fs.nextInt();
		int next1 = c1;
		int d1 = fs.nextInt();
		int c2 = fs.nextInt();
		int next2 = c2;
		int d2 = fs.nextInt();
		int c3 = fs.nextInt();
		int next3 = c3;
		int d3 = fs.nextInt();
		int H = fs.nextInt();
		
		int sum = d1+d2+d3;
		int time = 0;
		
		while(true) {
			if(sum>=H) {
				out.println(time);
				break;
			}
			time = Math.min(Math.min(next1, next2),next3);
			if(next1==time) {
				sum += d1;
				next1 += c1;
			}
			if(next2==time) {
				sum += d2;
				next2 += c2;
			}
			if(next3==time) {
				sum += d3;
				next3 += c3;
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