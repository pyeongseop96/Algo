import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main{
	
	static class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static class Pair2{
		int x;
		int y;
		int val;
		Pair2(int x, int y, int val){
			this.x = x;
			this.y = y;
			this.val = val;
		}
	}
	
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        char[][] arr = new char[R][C];
        
        List<Pair> list = new ArrayList<>();
        
        Deque<Pair2> queue = new ArrayDeque<>();
        boolean[][] isVisited = new boolean[R][C];
        
        for(int i=0; i<R; i++) {
        	String str = sc.next();
        	for(int j=0; j<C; j++) {
        		arr[i][j] = str.charAt(j);
        		if(arr[i][j]=='.') {
        			Pair2 p = new Pair2(i,j,0);
        			queue.addLast(p);
        			isVisited[i][j] = true;
        		}
        		else if(arr[i][j]=='L') {
        			arr[i][j] = '.';
        			Pair2 pp = new Pair2(i,j,0);
        			queue.addLast(pp);
        			isVisited[i][j] = true;
        			Pair p = new Pair(i,j);
        			list.add(p);
        		}
        	}
        }
        
        int[][] day = new int[R][C]; //녹는날
        while(!queue.isEmpty()) {
        	Pair2 p = queue.removeFirst();
        	for(int dir=0; dir<4; dir++) {
        		int nextX = p.x + dx[dir];
        		int nextY = p.y + dy[dir];
        		if(nextX>=0 && nextX<R && nextY>=0 && nextY<C &&
        				!isVisited[nextX][nextY]) {
        			day[nextX][nextY] = p.val+1;
        			isVisited[nextX][nextY] = true;
        			queue.addLast(new Pair2(nextX, nextY, p.val+1));
        		}
        	}
        }
        
        Pair duck1 = list.get(0);
        Pair duck2 = list.get(1);
        
        isVisited = new boolean[R][C];
        int ans = 0;
        isVisited[duck1.x][duck1.y] = true;
        Deque<Pair> queue2 = new ArrayDeque<>();
        queue2.addLast(new Pair(duck1.x, duck1.y));
        search:while(true) {
        	Deque<Pair> nextQueue = new ArrayDeque<>();
        	while(!queue2.isEmpty()) {
        		Pair p = queue2.remove();
            	for(int dir=0; dir<4; dir++) {
            		int nextX = p.x + dx[dir];
            		int nextY = p.y + dy[dir];
            		if(nextX>=0 && nextX<R && nextY>=0 && nextY<C) {
            			if(nextX==duck2.x && nextY==duck2.y) {
            				break search;
            			}
            			else if(!isVisited[nextX][nextY]) {
            				isVisited[nextX][nextY] = true;
            				if(day[nextX][nextY]<=ans) {
            					queue2.addLast(new Pair(nextX, nextY));
            				}
            				else {
            					nextQueue.addLast(new Pair(nextX, nextY));
            				}
            			}
            		}
            	}
        	}
        	queue2 = nextQueue;
        	ans++;
        }
        out.println(ans);
    	ans++;
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