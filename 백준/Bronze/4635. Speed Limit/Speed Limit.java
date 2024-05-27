import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        while(true) {
        	int N = sc.nextInt();
        	if(N==-1) {
        		break;
        	}
        	int before = 0;
        	int ans = 0;
        	for(int i=1; i<=N; i++) {
        		int num = sc.nextInt();
        		int cur = sc.nextInt();
        		ans += num*(cur-before);
        		before = cur;
        	}
        	out.print(ans);
        	out.println(" miles");
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