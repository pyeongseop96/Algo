import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main{

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int s = 0;
        int cnt = 0;
        for(int i=1; i<=N; i++) {
        	String str = sc.next();
        	if(str.equals("ammo")) {
        		cnt += K;
        		
        	}
        	else if(str.equals("save")) {
        		s = cnt;
        		
        	}
        	else if(str.equals("shoot")) {
        		cnt -= 1;
        		
        	}
        	else if(str.equals("load")) {
        		cnt = s;
        		
        	}
        	out.println(cnt);
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