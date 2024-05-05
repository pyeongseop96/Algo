import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int T = fs.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = fs.nextInt();
			int[] arr = new int[N+1];
			for(int i=1; i<=N; i++) {
				arr[i] = fs.nextInt();
			}
			int[] team = new int[N+1];
			int[] cnt = new int[N+1];
			int ans = 0;
			for(int i=1; i<=N; i++) {
				if(team[i]==0) {
					team[i] = i;
					cnt[i] = 1;
					int cntt = 2;
					int idx = i;
					while(true) {
						int num = arr[idx];
						if(team[num]==i) {
							ans += cnt[num]-1;
							break;
						}
						else if(team[num]==0) {
							team[num] = i;
							cnt[num] = cntt++;
							idx = num;
						}
						else {
							ans += cntt-1;
							break;
						}
					}
				}
			}
			out.println(ans);
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