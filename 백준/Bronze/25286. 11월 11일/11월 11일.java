import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	
	int[] arr = {999,31,31,999,31,30,31,30,31,31,30,31,30};

    void solve() {
    	int y = sc.nextInt();
    	int m = sc.nextInt();
    	int d = 0;
    	if(m==3) {
    		if(y%400==0 || (y%4==0 && y%100!=0)) {
    			d = 29;
    		}
    		else {
    			d = 28;
    		}
    	}
    	else {
    		if(m==1) {
    			y--;
    		}
    		d = arr[m];
    	}
    	out.print(y);
    	out.print(" ");
    	out.print(((m+10)%12)+1);
    	out.print(" ");
    	out.println(d);
    }

    void run() {
        sc = new FastScanner();
        out = new PrintWriter(System.out);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }

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