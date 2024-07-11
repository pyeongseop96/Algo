import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    void solve() {
    	
    }
    
    void run() {
//        sc = new FastScanner();
    	sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }

       out.print("Latitude ");
       String str = sc.nextLine().trim();
       out.print(str.length());
       out.print(":");
       String str2 = sc.nextLine().trim();
       out.print(str2.length());
       out.print(":");
       String str3 = sc.nextLine().trim();
       out.println(str3.length());
       
       out.print("Longitude ");
       String str4 = sc.nextLine().trim();
       out.print(str4.length());
       out.print(":");
       String str5 = sc.nextLine().trim();
       out.print(str5.length());
       out.print(":");
       String str6 = sc.nextLine().trim();
       out.println(str6.length());

       out.close();
    }

//    FastScanner sc;
    Scanner sc;
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