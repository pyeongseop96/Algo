import java.io.*;
import java.util.*;

public class Main {

    void solve() {

    }
    
    void run() {
        sc = new FastScanner();
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }
        int N = sc.nextInt();
        int a = sc.nextInt();
        String ans = "S";
        for(int i=1; i<=N-1; i++) {
        	if(a<sc.nextInt()) {
        		ans = "N";
        	}
        }
        out.println(ans);
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