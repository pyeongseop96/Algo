import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean isABabo = false;
		boolean isBBabo = false;
		if(a==1 || a==3 || a==4) {
			isABabo = true;
		}
		if(b==1 || b==3 || b==4) {
			isBBabo = true;
		}
		if((a==0 && b==5)||(a==2 && b==0)||(a==5 && b==2)||(isABabo && !isBBabo)) {
			out.println("<");
		}
		else if((b==0 && a==5)||(b==2 && a==0)||(b==5 && a==2)||(!isABabo && isBBabo)) {
			out.println(">");
		}
		else {
			out.println("=");
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