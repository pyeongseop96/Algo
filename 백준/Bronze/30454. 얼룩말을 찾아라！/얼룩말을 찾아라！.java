import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int max = 0;
		int ans = 0;
		for(int i=1; i<=N; i++) {
			int before = 0;
			int cnt = 0;
			String str = sc.next();
			for(int j=0; j<M; j++) {
				int num = str.charAt(j)-'0';
				if(before==0 && num==1) {
					cnt++;
				}
				before = num;
			}
			if(cnt==max) {
				ans++;
			}
			else if(cnt>max) {
				max = cnt;
				ans = 1;
			}
		}
		out.print(max);
		out.print(" ");
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