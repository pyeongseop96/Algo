import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int ans = 0;
        int cur = 0;
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
        	if(sc.nextInt()==0) {
        		if(cur>ans) {
        			ans = cur;
        		}
        		cur = 0;
        	}
        	else {
    			cur++;
    		}
        }
        if(cur>ans) {
			ans = cur;
			cur = 0;
		}
        out.println(ans);
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