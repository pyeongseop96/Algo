import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(K==1) {
			out.println("NO");
		}
		else {
			long sum = ((long)N*(N+1))/2;
			if(N==K && sum%K==0) {
				out.println("NO");
			}
			else {
				out.println("YES");
				if(sum%K!=0) {
					for(int i=0; i<N/K; i++) {
						int num = i*K;
						for(int j=1; j<=K; j++) {
							out.print(num+j);
							out.print(" ");
						}
						out.println();
					}
				}
				else {
					int[] arr = new int[N+1];
					for(int i=1; i<=N; i++) {
						arr[i] = i;
					}
					for(int i=0; i<(N/K)-1; i++) {
						int num = i*K;
						int tmp = arr[i*K+1];
						arr[i*K+1] = arr[i*K+1+(2*K)-(i%2)-1];
						arr[i*K+1+(2*K)-(i%2)-1] = tmp;
					}
									
					for(int i=1; i<=N; i++) {
						out.print(arr[i]);
						if(i%K==0) {
							out.println();
						}
						else {
							out.print(" ");
						}
					}
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