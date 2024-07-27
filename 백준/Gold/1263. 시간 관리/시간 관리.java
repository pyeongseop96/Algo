import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	
	static class Pair implements Comparable<Pair>{
		int a;
		int b;
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		@Override
		public int compareTo(Pair p) {
			return p.b - this.b;
		}
	}

    void solve() {
    	
    }
    
    void run() {
        sc = new FastScanner();
//    	sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }
        
       int N = sc.nextInt();
       int ans = 9999999;
       PriorityQueue<Pair> pq = new PriorityQueue<>();
       for(int i=1; i<=N; i++) {
    	   int a = sc.nextInt();
    	   int b = sc.nextInt();
    	   pq.add(new Pair(a,b));
       }
       while(!pq.isEmpty()) {
    	   Pair p = pq.remove();
    	   int num = Math.min(ans, p.b);
    	   ans = num-p.a;
//    	   out.println(ans);
       }
       if(ans<0) {
    	   ans = -1;
       }
       out.print(ans);
       out.close();
    }

    FastScanner sc;
//    Scanner sc;
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
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}