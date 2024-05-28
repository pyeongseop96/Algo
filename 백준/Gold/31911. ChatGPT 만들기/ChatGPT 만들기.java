import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int[][] cntArr = new int[130][130];  

		int N = sc.nextInt();
		long K = sc.nextLong()-1;
		int M = sc.nextInt()-1;
		
		for(int i=1; i<=N; i++) {
			String str = sc.next();
			for(int j=0; j<=str.length()-2; j++) {
				int idx = str.charAt(j);
				int next = str.charAt(j+1);
				cntArr[idx][next]++;
			}
		}
		
		int[] nextArr = new int[130];
		
		for(int i=0; i<130; i++) {
			int max = 0;
			int idx = 0;
			for(int j=0; j<130; j++) {
				if(cntArr[i][j]>max) {
					nextArr[i] = j;
					max = cntArr[i][j];
				}
			}
		}
		nextArr[46] = 46;
		nextArr[93] = 46;
		boolean[] isVisited = new boolean[130];
		isVisited[91] = true; //[
		int[] searchArr = new int[150];
		searchArr[0] = 91;//첫번째 글자
		
		int second = 1;//겹친 2번째
		int c = 91;
		while(true) {
			searchArr[second] = nextArr[c];
			c = searchArr[second];
			if(isVisited[c]) {
				break;
			}
			else {
				isVisited[c] = true;
				second++;
			}
		}
		
		int first = 0;
		for(int i=0; i<second; i++) {
			if(searchArr[i]==c) {
				first = i;
				break;
			}
		}
		
		first++;
		
		//첫 시작 0
		//루프 시작 first
		//루프 끝 second
		
//		for(int i=0; i<=second; i++) {
//			System.out.println((char)searchArr[i]);
//		}
		
		for(long i=K; i<=K+M; i++) {
			if(i<first) {
//				System.out.println(123);
//				System.out.println(i);
				out.print((char)searchArr[(int)i]);
			}
			else {
				int plus = (int)(((i-first)%(second-first+1)));
//				System.out.println(123);
//				System.out.println(first+plus);
				out.print((char)searchArr[first+plus]);
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