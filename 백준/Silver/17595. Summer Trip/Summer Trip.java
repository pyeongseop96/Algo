import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    void solve() {
    	
    }
    
    void run() {
        sc = new FastScanner();
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }
        String str = sc.next();
        int ans = 0;
        for(int i=0; i<str.length()-1; i++) {
        	boolean[] abc = new boolean[30];
        	char start = str.charAt(i);
        	abc[start-'a'] = true;
        	int idx = i+1;
        	while(idx<str.length()) {
        		char cur = str.charAt(idx);
        		if(start==cur) {
        			break;
        		}
        		if(!abc[str.charAt(idx)-'a']) {
        			abc[str.charAt(idx)-'a']  = true;
        			ans++;
        		}
        		idx++;
        	}
        }
        
        out.println(ans);
       out.close();
    }

    FastScanner sc;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
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