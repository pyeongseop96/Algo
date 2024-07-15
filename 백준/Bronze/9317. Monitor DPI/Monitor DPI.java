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
    	   BigDecimal zero = new BigDecimal("0");
    	   double d = Math.sqrt(337);
    	   BigDecimal tts = new BigDecimal(d);
    	   BigDecimal six = new BigDecimal("16");
    	   BigDecimal nine = new BigDecimal("9");
    	   BigDecimal D = new BigDecimal(sc.next());
    	   BigDecimal A = new BigDecimal(sc.next());
    	   BigDecimal B = new BigDecimal(sc.next());
    	   if(D.compareTo(zero)==0) {
    		   break;
    	   }
    	   out.print("Horizontal DPI: ");
    	   A = A.multiply(tts);
    	   A = A.divide(six,10, RoundingMode.HALF_UP);
    	   A = A.divide(D, 10, RoundingMode.HALF_UP);
    	   out.println(A.setScale(2, RoundingMode.HALF_UP));
    	   out.print("Vertical DPI: ");
    	   B = B.multiply(tts);
    	   B = B.divide(nine,10, RoundingMode.HALF_UP);
    	   B = B.divide(D, 10, RoundingMode.HALF_UP);
    	   out.println(B.setScale(2, RoundingMode.HALF_UP));

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