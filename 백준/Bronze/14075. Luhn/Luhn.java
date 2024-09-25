import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    void solve() {
    	
    }
    
    void run() {
        sc = new FastScanner();
//    	sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }
       
        char[] str = sc.next().toCharArray();
        int sum = 0;
        for(int i=0; i<16; i++) {
        	char c = str[i];
        	int num = c-'0';
        	if(i%2==0) {
        		if(num<5) {
        			
        			sum += num*2;
        		}
        		else {
        			num *= 2;
        			sum += (num % 10) + 1;
        		}
        	}
        	else {
        		sum += num;
        	}
        	//out.println(sum);
        }
        //out.println(sum);
        if(sum%10==0) {
        	out.print("DA");
        }
        else {
        	out.print("NE");
        }
        out.close();
    }

    FastScanner sc;
//    Scanner sc;
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
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}