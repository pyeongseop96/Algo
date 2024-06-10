import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    void solve() {
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	BigDecimal aa = new BigDecimal(A);
    	BigDecimal bb = new BigDecimal(B);
    	BigDecimal mm = new BigDecimal(10000);
    	BigDecimal aaa = new BigDecimal(16);
    	BigDecimal bbb = new BigDecimal(35);
    	BigDecimal aaaa = new BigDecimal(20);
    	BigDecimal bbbb = new BigDecimal(25);
    	BigDecimal cccc = new BigDecimal(18.5);
    	BigDecimal dddd = new BigDecimal(16);
    	BigDecimal eeee = new BigDecimal(30);
    	BigDecimal bmi = bb.divide(aa, 10, RoundingMode.DOWN).divide(aa, 10, RoundingMode.DOWN).multiply(mm);
//    	out.println(bmi);
    	if(A<=140) {
    		out.println(6);
    	}
    	else if(A<146) {
    		out.println(5);
    	}
    	else if(A<159) {
    		out.println(4);
    	}
    	else if(A<161) {
    		if(bmi.compareTo(aaa)>=0 && bmi.compareTo(bbb)<0) {
    			out.println(3);
    		}
    		else {
    			out.println(4);
    		}
    	}
    	else if(A<204) {
    		if(bmi.compareTo(aaaa)>=0 && bmi.compareTo(bbbb)<0) {
    			out.println(1);
    		}
    		else if((bmi.compareTo(cccc)>=0 && bmi.compareTo(aaaa)<0) ||
    				(bmi.compareTo(bbbb)>=0 && bmi.compareTo(eeee)<0)) {
    			out.println(2);
    		}
    		else if((bmi.compareTo(aaa)>=0 && bmi.compareTo(cccc)<0) ||
    				(bmi.compareTo(eeee)>=0 && bmi.compareTo(bbb)<0)) {
    			out.println(3);
    		}
    		else {
    			out.println(4);
    		}
    	}
    	else {
    		out.println(4);
    	}
    }

    void run() {
        sc = new FastScanner();
        out = new PrintWriter(System.out);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
//        for(int i=1; i<=200; i++) {
//        	solve(159, i);
//        }
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