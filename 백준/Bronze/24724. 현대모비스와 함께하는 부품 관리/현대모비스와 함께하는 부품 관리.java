import java.io.*;
import java.util.*;

public class Main {

    void solve() {
    	int N = sc.nextInt();
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	for(int i=1; i<=N; i++) {
    		int aa = sc.nextInt();
    		int bb = sc.nextInt();
    	}
    	out.print("Material Management ");
    	out.println(aaa);
    	out.println("Classification ---- End!");
    }
    int aaa= 0;
    void run() {
        sc = new FastScanner();
        out = new PrintWriter(System.out);
        int T = sc.nextInt();
        while (T-- > 0) {
        	aaa++;
            solve();
        }
        out.close();
    }

    FastScanner sc;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }
    
	/**
	 * 이진수 형태로 변환 후 오른쪽에서 bit번째 비트가 1인 경우 add 만큼 더한다, return값 없음
	 * 
	 	BitArr(arr, 3, -1);
	 */
	static void BitArr(long[] bitArr, long num, int add)
    {
        for(int bit=0; bit < 40; bit++)
            if((num&((long)1<<bit)) > 0)
                bitArr[bit] += add;
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