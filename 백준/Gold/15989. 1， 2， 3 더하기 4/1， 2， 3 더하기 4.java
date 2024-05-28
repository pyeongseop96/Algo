import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        long[][] arr = new long[10001][4];
        arr[1][1] = 1;
        arr[1][2] = 1;
        arr[1][3] = 1;
        arr[2][1] = 1;
        arr[2][2] = 2;
        arr[2][3] = 2;
        arr[3][1] = 1;
        arr[3][2] = 2;
        arr[3][3] = 3;
        for(int i=4; i<=10000; i++) {
        	arr[i][1] = 1;
        	arr[i][2] = arr[i-2][2] + arr[i-1][1];
        	arr[i][3] = arr[i-3][3] + arr[i-2][2] + arr[i-1][1];
        }
        
        int T = sc.nextInt();
        for(int i=1; i<=T; i++) {
        	int num = sc.nextInt();
        	out.println(arr[num][3]);
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