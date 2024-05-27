import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
        	int N = sc.nextInt();
        	int ans = 0;
        	int i=1;
        	for(; i*i<=N; i++) {
        		if(N%i==0) {
        			ans++;
        		}
        	}
        	out.print(N);
        	out.print(" ");
        	if((i-1)*(i-1)==N) {
        		out.println(((ans-1)*2)+1);
        	}
        	else {
        		out.println(ans*2);
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