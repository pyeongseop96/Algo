import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main{

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        String str = sc.next();
        int N = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=N; i++) {
        	String strr = sc.next();
        	if(str.charAt(0)==strr.charAt(0) &&
        			str.charAt(1)==strr.charAt(1) &&
        			str.charAt(2)==strr.charAt(2) &&
        			str.charAt(3)==strr.charAt(3) &&
        			str.charAt(4)==strr.charAt(4)) {
        		ans++;
        	}
        }

        out.print(ans);
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