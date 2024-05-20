import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main{

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        String str1 = sc.next();
        String str2 = sc.next();
        int a1 = (str1.charAt(0)*10) + str1.charAt(1)-('0'*11);
        int b1 = (str1.charAt(3)*10) + str1.charAt(4)-('0'*11);
        int c1 = (str1.charAt(6)*10) + str1.charAt(7)-('0'*11);
        int a2 = (str2.charAt(0)*10) + str2.charAt(1)-('0'*11);
        int b2 = (str2.charAt(3)*10) + str2.charAt(4)-('0'*11);
        int c2 = (str2.charAt(6)*10) + str2.charAt(7)-('0'*11);
        
        int d1 = (3600*a1) + (60*b1) + c1;
        int d2 = (3600*a2) + (60*b2) + c2;
        if(d1>d2) {
        	d2 += 3600 * 24;
        }
        int e = d2 - d1;
        if(e==0) {
        	out.println("24:00:00");
        }
        else {
        	int f1 = e/3600;
            if(f1<10) {
            	out.print("0");
            }
            out.print(f1);
            out.print(":");
            e -= f1 * 3600;
            
            int f2 = e / 60;
            if(f2<10) {
            	out.print("0");
            }
            out.print(f2);
            out.print(":");
            e -= f2 * 60;
            
            if(e<10) {
            	out.print("0");
            }
            out.println(e);
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