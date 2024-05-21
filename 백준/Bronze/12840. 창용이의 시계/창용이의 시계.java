import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		long time = 0;
		time += 3600 * sc.nextInt();
		time += 60 * sc.nextInt();
		time += sc.nextInt();
		
		int q = sc.nextInt();
		
		for(int i=1; i<=q; i++) {
			int a = sc.nextInt();
			if(a==3) {
				long cur = time;
				out.print(cur/3600);
				out.print(" ");
				cur -= (cur/3600)*3600;
				out.print(cur/60);
				out.print(" ");
				cur -= (cur/60)*60;
				out.println(cur);
			}
			else if(a==1) {
				long num = sc.nextLong();
				if(num>=24*3600) {
					num -= (num / (24*3600))*(24*3600);
				}
				time += num;
				if(time>=24*3600) {
					time -= 24*3600;
				}
			}
			else {
				long num = sc.nextLong();
				if(num>=24*3600) {
					num -= (num / (24*3600))*(24*3600);
				}
				time -= num;
				if(time<0) {
					time += 24*3600;
				}
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