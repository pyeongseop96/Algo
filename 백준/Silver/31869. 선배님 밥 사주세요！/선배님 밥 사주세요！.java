import java.util.*;
import java.io.*;

public class Main{
	
	static class Triple{
		String name;
		int day;
		int money;
		Triple(String name, int day, int money){
			this.name = name;
			this.day = day;
			this.money = money;
		}
	}
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int[] dayArr = new int[100];
		Triple[] triArr = new Triple[N];
		
		for(int i=0; i<N; i++) {
			String name = sc.next();
			int a= sc.nextInt();
			int b = sc.nextInt();
			int day = (7*a)+b;
			int money =sc.nextInt();
			triArr[i] = new Triple(name, day, money);
		}
		
		Map<String, Integer>map = new HashMap<>();
		for(int i=0; i<N; i++) {
			String name = sc.next();
			int money = sc.nextInt();
			map.put(name, money);
		}
		
		for(int i=0; i<N; i++) {
			Triple t = triArr[i];
			int have = map.get(t.name);
			if(have>=t.money) {
				dayArr[t.day]++;
			}
		}
		
		int ans = 0;
		int combo = 0;
		for(int i=1; i<=80; i++) {
			if(dayArr[i]!=0) {
				combo++;
			}
			else {
				if(dayArr[i-1]!=0) {
					if(ans < combo){
						ans = combo;
					}
				}
				combo = 0;
			}
		}
		out.println(ans);
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