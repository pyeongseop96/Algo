import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main{

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int a = sc.nextInt();
        char c1 = sc.next().charAt(0);
        int b = sc.nextInt();
        char c2 = sc.next().charAt(0);
        int c = sc.nextInt();
        
        int[] arr = new int[2];
        int e = 0;
        int f = 0;
        if(c1=='+') {
        	e = a+b;
        }
        else if(c1=='-') {
        	e = a-b;
        }
        else if(c1=='*') {
        	e = a*b;
        }
        else {
        	e = a/b;
        }
        
        if(c2=='+') {
        	f = b+c;
        	arr[0] = e+c;
        }
        else if(c2=='-') {
        	f = b-c;
        	arr[0] = e-c;
        }
        else if(c2=='*') {
        	f = b*c;
        	arr[0] = e*c;
        }
        else {
        	f = b/c;
        	arr[0] = e/c;
        }
        
        if(c1=='+') {
        	e = a+b;
        	arr[1] = a+f;
        }
        else if(c1=='-') {
        	e = a-b;
        	arr[1] = a-f;
        }
        else if(c1=='*') {
        	e = a*b;
        	arr[1] = a*f;
        }
        else {
        	e = a/b;
        	arr[1] = a/f;
        }
        
        Arrays.sort(arr);
        out.println(arr[0]);
        out.println(arr[1]);
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