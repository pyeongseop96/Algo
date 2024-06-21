import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    void solve() {
    }

    int[] arr = {0,0,0,0,0,0,0,0,0,0};
    
    void come(char c) {
    	if(c=='L') {
    		for(int i=0; i<=9; i++) {
        		if(arr[i]==0) {
        			arr[i] = 1;
        			break;
        		}
        	}
    	}
    	else {
    		for(int i=9; i>=0; i--) {
        		if(arr[i]==0) {
        			arr[i] = 1;
        			break;
        		}
        	}
    	}
    }
    
    void run() {
        sc = new FastScanner();
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }
        int N = sc.nextInt();
        for(char c:sc.next().toCharArray()) {
        	if(c>='0' && c<='9') {
        		arr[c-'0'] = 0;
        	}
        	else {
        		come(c);
        	}
        }
        for(int i:arr) {
        	out.print(i);
        }
        out.println();
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