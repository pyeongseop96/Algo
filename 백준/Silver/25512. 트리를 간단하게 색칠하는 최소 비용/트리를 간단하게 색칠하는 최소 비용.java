import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	
	static class Pair{
		int a;
		int b;
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
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
       List<Integer>[] arr = new ArrayList[N];
       for(int i=0; i<N; i++) {
    	   arr[i] = new ArrayList<>();
       }
       
       for(int i=1; i<=N-1; i++) {
    	   int a = sc.nextInt();
    	   int b = sc.nextInt();
    	   arr[a].add(b);
       }
       
       int[][] price = new int[N][2];
       for(int i=0; i<N; i++) {
    	   price[i][0] = sc.nextInt();
    	   price[i][1] = sc.nextInt();
       }
       
       int[] rank = new int[N];
       rank[0] = 1;
       Deque<Pair> q = new ArrayDeque<>();
       for(int i : arr[0]) {
    	   Pair p = new Pair(2,i);
    	   q.addLast(p);
       }
       
       while(!q.isEmpty()) {
    	   Pair p = q.removeFirst();
    	   rank[p.b]= p.a;
    	   for(int i : arr[p.b]) {
    		   q.addLast(new Pair((p.a)+1,i));
           }
       }

       
       long one = 0;
       long two = 0;
       
       for(int i=0; i<N; i++) {
    	   if(rank[i]%2==0) {
    		   one += price[i][0];
    		   two += price[i][1];
    	   }
    	   else {
    		   one += price[i][1];
    		   two += price[i][0];
    	   }
       }
       
       out.println(Math.min(one, two));

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
	}
}