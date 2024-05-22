import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer>[] list = new ArrayList[N+1];
		int[] lng = new int[N+1];
		for(int i=0; i<=N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=1; i<=M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		
		Deque<Integer> queue = new ArrayDeque<>();
		lng[1] = 1;
		queue.addLast(1);
		while(!queue.isEmpty()) {
			int num = queue.removeFirst();
			for(int next : list[num]) {
				if(lng[next]==0) {
					lng[next] = lng[num]+1;
					queue.addLast(next);
				}
			}
		}
		int max = 0;
		int cnt = 1;
		int ans = 1;
		for(int i=2; i<=N; i++) {
			if(max<lng[i]) {
				max = lng[i];
				ans = i;
				cnt = 1;
			}
			else if(max==lng[i]) {
				cnt++;
			}
		}
		out.print(ans);
		out.print(" ");
		out.print(max-1);
		out.print(" ");
		out.println(cnt);
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