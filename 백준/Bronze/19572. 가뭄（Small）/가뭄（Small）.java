import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double x = ((double)b+a-c)/2;
        double y = ((double)a+c-b)/2;
        double z = ((double)b+c-a)/2;
        
        if(x<=0 || y<=0 || z<=0) {
        	out.println(-1);
        }
        else {
        	out.println(1);
        	out.print(x);
        	out.print(" ");
        	out.print(y);
        	out.print(" ");
        	out.println(z);
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