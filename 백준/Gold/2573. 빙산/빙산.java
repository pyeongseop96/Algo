import java.util.*;
import java.io.*;

public class Main{
	
	static int[][] arr;
	static int N;
	static int M;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	
	public static void main(String args[]) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		N = fs.nextInt();
		M = fs.nextInt();
		
		arr = new int[N][M];
		for(int i=0; i<N; i++) {
			arr[i] = fs.readArray(M);
		}
		
		int year = 0;
		while(true) {
			int c = checkEnd();
			if(c==0) {
				out.println(0);
				break;
			}
			else if(c==2) {
				out.println(year);
				break;
			}
			ice();
			year++;
//			for(int i=0; i<N; i++) {
//				for(int j=0; j<M ;j++) {
//					System.out.print(arr[i][j]);
//					System.out.print(" ");
//				}
//				System.out.println();
//			}
//			System.out.println();
		}

		out.close();
	}
	
	static int checkEnd() {
		boolean[][] check = new boolean[N][M];
		check: for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j]!=0) {
					check[i][j] = true;
					Deque<Pair> queue = new ArrayDeque<>();
					queue.addLast(new Pair(i,j));
					while(!queue.isEmpty()) {
						Pair p = queue.removeFirst();
						for(int dir=0; dir<4; dir++) {
							int nextX = p.x+dx[dir];
							int nextY = p.y+dy[dir];
							if(!check[nextX][nextY] && arr[nextX][nextY]!=0) {
								check[nextX][nextY]=true;
								queue.addLast(new Pair(nextX, nextY));
							}
						}
					}
					for(int a=0; a<N; a++) {
						for(int b=0; b<M; b++) {
							if(arr[a][b]!=0 && !check[a][b]) {
								return 2;
							}
						}
					}
					return 1;
				}
			}
		}
		return 0;
	}
	
	static void ice() {
		int[][] newArr = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j]!=0) {
					int cnt = 0;
					for(int dir=0; dir<4; dir++) {
						if(arr[i+dx[dir]][j+dy[dir]]==0) {
							cnt++;
						}
						if(arr[i][j] - cnt >= 0) {
							newArr[i][j] = arr[i][j] - cnt;
						}
					}
				}
			}
		}
		arr = newArr;
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