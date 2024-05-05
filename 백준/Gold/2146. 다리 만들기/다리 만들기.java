import java.util.*;
import java.io.*;

public class Main{
	
	static int[][] arr;
	static int N;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	
	public static void main(String args[]) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		N = fs.nextInt();
		
		int ans = 1000;
		arr = new int[N][N];
		int[][] team = new int[N][N];
		int teamNum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = fs.readArray(N);
		}
		
		for(int i=0; i<N; i++) {
			find:for(int j=0; j<N; j++) {
				if(arr[i][j]==1 && team[i][j]==0) {
					teamNum++;
					team[i][j] = teamNum;
					Deque<Pair> queue = new ArrayDeque<>();
					queue.addLast(new Pair(i,j));
					while(!queue.isEmpty()) {
						Pair p = queue.removeFirst();
						for(int dir=0; dir<4; dir++) {
							int newX = p.x+dx[dir];
							int newY = p.y+dy[dir];
							if(newX>=0 && newX<N &&
									newY>=0 && newY<N &&
									arr[newX][newY]==1 &&
									team[newX][newY]==0) {
								team[newX][newY] = teamNum;
								queue.addLast(new Pair(newX, newY));
							}
						}
					}
						
					int[][] moving = new int[N][N];
					for(int a=0; a<N; a++) {
						for(int b=0; b<N; b++) {
							if(team[a][b]==teamNum) {
								queue.addLast(new Pair(a,b));
							}
						}
					}
					while(!queue.isEmpty()) {
						Pair p = queue.removeFirst();
						for(int dir=0; dir<4; dir++) {
							int newX = p.x+dx[dir];
							int newY = p.y+dy[dir];
							if(newX>=0 && newX<N &&
									newY>=0 && newY<N &&
									team[newX][newY]==0 &&
									moving[newX][newY]==0) {
								moving[newX][newY] = moving[p.x][p.y]+1;
								if(moving[newX][newY]>=ans) {
									continue find;
								}
								if(arr[newX][newY]==1) {
									ans = moving[newX][newY];
									continue find;
								}
								queue.addLast(new Pair(newX, newY));
							}
						}
					}
				}
			}
		}
		out.println(ans-1);

		out.close();
	}
	
	static class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
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