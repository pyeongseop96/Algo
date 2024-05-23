import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		for(int i=0; i<N; i++) {
			arr1[i] = sc.nextInt();
			arr2[i] = arr1[i];
		}
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i=1; i<N; i++) {
			for(int j=1; j<N; j++) {
				if(arr1[j-1]>arr1[j]) {
					cnt1++;
					int tmp = arr1[j-1];
					arr1[j-1] = arr1[j];
					arr1[j] = tmp;
				}
				
				if(arr2[j-1]<arr2[j]) {
					cnt2++;
					int tmp = arr2[j-1];
					arr2[j-1] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		
		if(cnt1>cnt2+1) {
			cnt1 = cnt2+1;
		}
		
		out.println(cnt1);
		
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