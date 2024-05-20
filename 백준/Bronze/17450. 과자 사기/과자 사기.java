import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main{

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int a1 = sc.nextInt();
        if(a1>=500) {
        	a1 -= 50;
        }
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        if(a2>=500) {
        	a2 -= 50;
        }
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        if(a3>=500) {
        	a3 -= 50;
        }
        int b3 = sc.nextInt();
        double c1 = (double)b1/a1;
        double c2 = (double)b2/a2;
        double c3 = (double)b3/a3;
        if(c1>c2 && c1>c3) {
        	out.print("S");
        }
        if(c2>c1 && c2>c3) {
        	out.print("N");
        }
        if(c3>c1 && c3>c2) {
        	out.print("U");
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