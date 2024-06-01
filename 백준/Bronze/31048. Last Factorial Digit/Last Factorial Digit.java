import java.io.*;
import java.util.*;

public class Main {
	
    void solve() {
    	int N = sc.nextInt();
    	int ans = N%10;
    	while (--N > 0) {
            ans = (ans*N)%10;
        }
    	out.println(ans);
    }

    void run() {
        sc = new FastScanner();
        out = new PrintWriter(System.out);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
        out.close();
    }

    FastScanner sc;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
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