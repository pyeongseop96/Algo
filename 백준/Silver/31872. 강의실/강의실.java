import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=1; i<=N; i++) {
			pq.add(sc.nextInt());
		}
		
		PriorityQueue<Integer> pqpq = new PriorityQueue<>();
		int before = 0;
		for(int i=1; i<=N; i++) {
			int num = pq.remove();
			pqpq.add(num-before);
			before = num;
		}
		
		int a = N-K;
		int ans = 0;
		for(int i=1; i<=a; i++) {
			ans += pqpq.remove();;
		}
		
		out.println(ans);
		
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