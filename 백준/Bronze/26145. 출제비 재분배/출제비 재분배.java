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
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
        	arr[i] = sc.nextInt();
        }
        int[][] arrarr = new int[N][N+M];
        for(int i=0; i<N; i++) {
        	for(int j=0; j<N+M; j++) {
            	arrarr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N+M; i++) {
        	if(i<N) {
        		int ans = arr[i];
        		for(int j=0; j<N+M; j++) {
        			ans -= arrarr[i][j];
        		}
        		for(int j=0; j<N; j++) {
        			ans += arrarr[j][i];
        		}
        		out.print(ans);
        		out.print(" ");
        	}
        	else {
        		int ans = 0;
        		for(int j=0; j<N; j++) {
        			ans += arrarr[j][i];
        		}
        		out.print(ans);
        		out.print(" ");
        	}
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