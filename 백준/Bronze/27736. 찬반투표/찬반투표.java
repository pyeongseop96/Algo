import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int N = sc.nextInt();
		double boom = (double)N/2;
		int boomboom = 0;
		int sum = 0;
		for(int i=1; i<=N; i++) {
			int vote = sc.nextInt();
			if(vote == 0) {
				boomboom++;
			}
			else {
				sum += vote;
			}
		}
		if(boomboom>=boom) {
			out.println("INVALID");
		}
		else if(sum>0) {
			out.println("APPROVED");
		}
		else {
			out.println("REJECTED");
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