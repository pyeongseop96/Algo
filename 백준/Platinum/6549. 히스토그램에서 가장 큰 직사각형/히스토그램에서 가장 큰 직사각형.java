import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		while(true) {
			int N = fs.nextInt();
			if(N==0) {
				break;
			}
			Deque<Pair> stack = new ArrayDeque<>();
			long ans = 0;
			for(int i=1; i<=N; i++) {
				int num = fs.nextInt();
				int idx = i;
				while(!stack.isEmpty() && stack.peekLast().val > num) {
					Pair p = stack.removeLast();
					if((long)p.val*(i-p.idx) > ans) {
						ans = (long)p.val*(i-p.idx);
					}
					idx = p.idx;
				}
				stack.addLast(new Pair(num, idx));
			}
			while(!stack.isEmpty()) {
				Pair p = stack.removeLast();
				if((long)p.val*((N+1)-p.idx) > ans) {
					ans = (long)p.val*((N+1)-p.idx);
				}
			}
			out.println(ans);
		}

		out.close();
	}
	
	static class Pair{
		int val;
		int idx;
		Pair(int val, int idx){
			this.val = val;
			this.idx = idx;
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