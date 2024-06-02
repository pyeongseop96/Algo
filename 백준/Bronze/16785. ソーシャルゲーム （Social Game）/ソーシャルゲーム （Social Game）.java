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
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = (7*a)+b;
        long e = c/d;
        long ans = e*7;
        c -= d*e;
        for(int i=1; i<=6; i++) {
        	if(c<=0) {
        		break;
        	}
        	else {
        		c -= a;
        		ans++;
        	}
        }
        if(c>0) {
        	ans++;
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