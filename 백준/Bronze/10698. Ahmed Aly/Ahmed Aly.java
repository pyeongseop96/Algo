import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
        	int a = sc.nextInt();
        	String str = sc.next();
        	int b = sc.nextInt();
        	String strr = sc.next();
        	int c = sc.nextInt();
        	
        	out.print("Case ");
        	out.print(tc);
        	out.print(": ");
        	
        	if(str.equals("+")) {
        		if(a+b==c) {
        			out.println("YES");
        		}
        		else {
        			out.println("NO");
        		}
        	}
        	else {
        		if(a-b==c) {
        			out.println("YES");
        		}
        		else {
        			out.println("NO");
        		}
        	}
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