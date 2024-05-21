import java.util.*;
import java.io.*;

public class Main{
	
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static class Pair{
		int x;
		int y;
		int val;
		Pair(int x, int y, int val){
			this.x = x;
			this.y = y;
			this.val = val;
		}
	}
	
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] arr = new int[a][b];
		int[][] cnt = new int[a][b];
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Deque<Pair> search = new ArrayDeque<>();
		Deque<Pair> queue = new ArrayDeque<>();
		search.add(new Pair(0,0,0));
		queue.add(new Pair(0,0,0));
		arr[0][0] = 2;
		while(!search.isEmpty()) {
			Pair p = search.removeFirst();
			for(int dir=0; dir<4; dir++) {
				int nextX = p.x + dx[dir];
				int nextY = p.y + dy[dir];
				if(nextX>=0 && nextX<a && nextY>=0 && nextY<b &&
						arr[nextX][nextY]==0) {
					arr[nextX][nextY] = 2;
					search.addLast(new Pair(nextX,nextY,0));
					queue.addLast(new Pair(nextX,nextY,0));
				}
			}
		}
		//겉2속0
		int ans = 0;
		while(!queue.isEmpty()) {
//			System.out.println(123);
			Pair p = queue.removeFirst();
			ans = p.val;
			for(int dir=0; dir<4; dir++) {
				int nextX = p.x + dx[dir];
				int nextY = p.y + dy[dir];
				if(nextX>=0 && nextX<a && nextY>=0 && nextY<b) {
					if(arr[nextX][nextY]==1) {
						cnt[nextX][nextY]++;
						if(cnt[nextX][nextY]==2) {
							arr[nextX][nextY] = 2;
							queue.addLast(new Pair(nextX, nextY, p.val+1));
							Deque<Pair> findHole = new ArrayDeque<>();
							for(int dirr=0; dirr<4; dirr++) {
								if(nextX+dx[dirr]>=0 && nextX+dx[dirr]<a &&nextY+dy[dirr]>=0 &&nextY+dy[dirr]<b 
										&& arr[nextX+dx[dirr]][nextY+dy[dirr]]==0) {
									arr[nextX+dx[dirr]][nextY+dy[dirr]] = 2;
									findHole.addLast(new Pair(nextX+dx[dirr],nextY+dy[dirr],p.val+1));
									queue.addLast(new Pair(nextX+dx[dirr],nextY+dy[dirr],p.val+1));
								}
							}
							while(!findHole.isEmpty()) {
								Pair pp = findHole.removeFirst();
								for(int dirr=0; dirr<4; dirr++) {
									int nextXX = pp.x + dx[dirr];
									int nextYY = pp.y + dy[dirr];
									if(nextXX>=0 && nextXX<a && nextYY>=0 && nextYY<b
											&& arr[nextXX][nextYY]==0) {
										arr[nextXX][nextYY] = 2;
										findHole.addLast(new Pair(nextXX,nextYY,pp.val));
										queue.addLast(new Pair(nextXX,nextYY,pp.val));
									}
								}
							}	
							
						}
					}
//					search.add(new Pair(nextX,nextY,0));
//					queue.add(new Pair(nextX,nextY,0));
				}
			}
			}
		out.print(ans);
		
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