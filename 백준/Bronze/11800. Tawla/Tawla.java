import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        String[] stringArr = {"hello", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh"};
        String[] stringArr2 = {"bye", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
        	int[] arr = new int[2];
        	arr[0] = sc.nextInt();
        	arr[1] = sc.nextInt();
        	Arrays.sort(arr);
        	out.print("Case ");
        	out.print(tc);
        	out.print(": ");
        	if(arr[0]==arr[1]) {
        		out.println(stringArr[arr[1]]);
        	}
        	else if(arr[1]==6 && arr[0]==5) {
        		out.println("Sheesh Beesh");
        	}
        	else {
        		out.print(stringArr2[arr[1]]);
        		out.print(" ");
        		out.println(stringArr2[arr[0]]);
        	}
        }

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