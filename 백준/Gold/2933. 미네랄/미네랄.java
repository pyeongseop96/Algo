import java.io.*;
import java.util.*;

public class Main {
	
	static class Pair{
		int R;
		int C;
		Pair(int R, int C){
			this.R = R;
			this.C = C;
		}
	}
	
	static boolean checkFly(int row, int col) {
		if(row<0 || row>=R || col<0 || col>=C || map[row][col]=='.') {
//			System.out.println(300);
			return false;
		}
		
		char[][] checkArr = new char[R][C]; //연결된거 확인
		checkArr[row][col] = '@';
		Deque<Pair> queue = new ArrayDeque<>();
		queue.addLast(new Pair(row, col));
		while(!queue.isEmpty()) {
			Pair p = queue.removeFirst();
			for(int dir=0; dir<4; dir++) {
				int nextR = p.R + dr[dir];
				int nextC = p.C + dc[dir];
				if(nextR>=0 && nextR<R && nextC>=0 && nextC<C &&
						map[nextR][nextC]=='x' &&
						checkArr[nextR][nextC]!='@') {
					checkArr[nextR][nextC]='@';
					queue.add(new Pair(nextR, nextC));
				}
			}
		}
		
		int jump = 300; //떠오른정도
		for(int cc=0; cc<C; cc++) {
			int stack = 0;
			boolean isGoalbangMeet = false;//골뱅이 만났는지 확인
			int rr = R-1;
			while(rr>=0) {
//				System.out.println(map[rr][cc]);
				if(map[rr][cc]=='.') {
					stack++;
				}
				else {
					if(checkArr[rr][cc]=='@') {
						isGoalbangMeet = true;
						break;
					}
					else {
						stack = 0;
					}
				}
				rr--;
			}
			if(isGoalbangMeet && jump>stack) {
				jump = stack;
			}
		}
//		System.out.println(jump);
		if(jump!=300 && jump>0) {
			for(int i=R-1; i>=0; i--) {
				for(int j=0; j<C; j++) {
					if(checkArr[i][j]=='@') {
						map[i][j] = '.';
						map[i+jump][j] = 'x';
					}
				}
			}
			return true;
		}
		else {
			return false;
		}
	}

	static int[] dr = {1,-1,0,0};
	static int[] dc = {0,0,-1,1};
	static char[][] map;
	static int R;
	static int C;
	

    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        R = sc.nextInt();
        C = sc.nextInt();
        
        map = new char[R][C];
        
        for(int i=0; i<R; i++) {
        	map[i] = sc.next().toCharArray();
        }
        
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
        	int row = R - sc.nextInt();
        	
        	if(i%2==1) {//왼쪽에서 쏘기
        		int idx = 0;
        		int boomR = -1;
        		int boomC = -1;
        		while(idx<C) {
        			if(map[row][idx]=='x') {
        				map[row][idx]='.';
        				boomR = row;
        				boomC = idx;
        				break;
        			}
        			idx++;
        		}
        		if(boomR!=-1) {
        			boolean check1 = checkFly(boomR-1, boomC);
        			if(!check1) {
        				boolean check2 = checkFly(boomR, boomC+1);
        				if(!check2) {
        					boolean check3 = checkFly(boomR+1, boomC);
        				}
        			}
        		}
        	}
        	else {
        		int idx = C-1;
        		int boomR = -1;
        		int boomC = -1;
        		while(idx>=0) {
        			if(map[row][idx]=='x') {
        				map[row][idx]='.';
        				boomR = row;
        				boomC = idx;
        				break;
        			}
        			idx--;
        		}
        		if(boomR!=-1) {
        			boolean check1 = checkFly(boomR-1, boomC);
        			if(!check1) {
        				boolean check2 = checkFly(boomR, boomC-1);
        				if(!check2) {
        					boolean check3 = checkFly(boomR+1, boomC);
        				}
        			}
        		}
        	}
//        	for(int j=0; j<R; j++) {
//            	for(char c:map[j]) {
//            		out.print(c);
//            	}
//            	out.println();
//            }
//        	out.println();
        }
        
        for(int i=0; i<R; i++) {
        	for(char c:map[i]) {
        		out.print(c);
        	}
        	out.println();
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