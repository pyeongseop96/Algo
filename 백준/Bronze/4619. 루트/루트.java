import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main{

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int[][] arr = new int[1000001][10];
        for(int i=1; i<=9; i++) {
        	int a = 0;
        	int b = 1;
        	while(a<1000000) {
        		int num = (int) ((Math.pow(b, i) + Math.pow(b+1, i))/2);
        		if(num>1000000) {
        			num = 1000000;
        		}
        		for(int j=a+1; j<=num; j++) {
        			arr[j][i] = b;
        		}
        		a = num;
        		b++;
        	}
        }
        while(true) {
        	int c = sc.nextInt();
        	int d = sc.nextInt();
        	if(c==0) {
        		break;
        	}
        	out.println(arr[c][d]);
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