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

        String str1 = sc.next();
        String str2 = sc.next();
        int a = str1.length();
        int b = str2.length();
        int INF = 9876;
        int[][] min = new int[a+1][b+1];
        for(int i=1; i<=b; i++) {
        	min[0][i] = INF;
        }
        boolean[][] arr = new boolean[a+1][b];//a콤보, b idx

        for(int i=0; i<a; i++) {
        	char c = str1.charAt(i);
        	int combo = 1;
        	for(int j=0; j<b; j++) {
        		char cc = str2.charAt(j);
        		if(c==cc) {
        			while(min[0][combo]<j+1) {
        				combo++;
        			}
        			arr[combo][j] = true;
        			if(min[i+1][combo]==0) {
        				min[i+1][combo] = j+1;
//        				System.out.println(i+1+" "+combo+" " +(j+1));
        			}
        		}
        	}
        	for(int j=0; j<=b; j++) {
       
        		if(min[i+1][j]!=0) {
        			min[0][j] = min[i+1][j];
//        			System.out.println(min[i+1][j]);
//        			System.out.println(123);
        		}
        	}
        }
        
//        for(int i : min[1]) {
//        	out.println(i);
//        }
        
        int ans = b;
        StringBuilder sb = new StringBuilder();
        for(; ans>0; ans--) {
        	if(min[0][ans]<INF) {
        		break;
        	}
        }
        
        int idx = b-1;
        
        for(int i=ans; i>0; i--) {
        	while(true) {
        		if(arr[i][idx]) {
//        			System.out.println(idx);
            		sb.append(str2.charAt(idx));
            		idx--;
            		break;
            	}
            	else {
            		idx--;
            	}
        	}
   
        }

        out.println(ans);

        if(ans==0) {
        	out.close();
        	return;
        }
        
        out.println(sb.reverse());
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