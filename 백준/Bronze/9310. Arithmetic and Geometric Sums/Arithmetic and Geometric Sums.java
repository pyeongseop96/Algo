import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
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
//        sc = new FastScanner();
    	sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }
        
       while(true) {
    	   int N = sc.nextInt();
    	   if(N==0) {
    		   break;
    	   }
    	   int a = sc.nextInt();
    	   int b = sc.nextInt();
    	   int c = sc.nextInt();
    	   if(b-a == c-b) {
    		   out.println(N*((2*a)+((N-1)*(b-a)))/2);
    	   }
    	   else {
    		   Integer i = b/a;
    		   String d = i.toString();
    		   i = a;
    		   String e = i.toString();
    		   BigInteger one = new BigInteger("1");
    		   BigInteger r = new BigInteger(d);
//    		   out.println(r);
    		   BigInteger a1 = new BigInteger(e);
    		   BigInteger S = new BigInteger("1");
    		   S = S.multiply(a1).multiply(r.pow(N).subtract(one)).divide(r.subtract(one));
    		   out.println(S);
    		   
    	   }

       }

       out.close();
    }

//    FastScanner sc;
    Scanner sc;
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