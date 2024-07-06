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
       String str = sc.next();
       Map<Character,Boolean> map = new HashMap<>();
       while(sc.hasNext()) {
    	   map.put(sc.next().charAt(0), true);
       }
       StringBuilder sb = new StringBuilder();
       for(char c : str.toCharArray()) {
    	  if(c>='A' && c<='Z' && map.containsKey(c)) {
    		  sb.append((char)(c-'A'+'a'));
    	  }
    	  else {
    		  sb.append(c);
    	  }
       }
       out.println(sb);
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