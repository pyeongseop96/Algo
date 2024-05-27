import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

		int N = sc.nextInt();
		long[] arr = new long[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);
		long target;
		int idx1, idx2;
		int ans = 0;
		for(int i=0; i<N; i++) {
			
			idx1 = 0;
			idx2 = N-1;
			target = arr[i];
		
			
			while(idx1 < idx2) {
				if(arr[idx2]+arr[idx1] > target) {
					idx2--;
				}
				else if(arr[idx2]+arr[idx1] < target) {
					idx1++;
				}
				else {
					if(idx2==i) {
						idx2--;
					}
					else if(idx1==i) {
						idx1++;
					}
					else {
						ans++;
						break;
					}
				}
			}
		}
		System.out.println(ans);
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