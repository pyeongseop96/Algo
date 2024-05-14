import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main{
	
	static class Pair implements Comparable<Pair>{

		String str;
		int num;
		public Pair(String str, int num) {
			this.str = str;
			this.num = num;
		}
		@Override
		public int compareTo(Pair p) {
			if(this.num != p.num) {
				return p.num - this.num;
			}
			else {
				int me = this.str.length();
				int you = p.str.length();
				for(int i=0; i<Math.min(me,  you); i++) {
					if(this.str.charAt(i)!=p.str.charAt(i)) {
						return this.str.charAt(i) - p.str.charAt(i);
					}
				}
				return me - you;
			}
		}
			
		
	}

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int N = sc.nextInt();
        String me = sc.next();
        String you = sc.next();
        Pair[] arr = new Pair[N];
     
        for(int i=0 ; i<N; i++) {
        	String str = sc.next();
        	int num = sc.nextInt();
        	Pair p = new Pair(str, num);
        	arr[i] = p;
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(Pair p : arr) {
        	if(p.str.equals(me)) {
        		p.num += 3;
        	}
        	pq.add(p);
        }
        
        int rank = 1;
        while(true) {
        	Pair p = pq.poll();
        	if(p.str.equals(me)) {
        		out.print(rank);
        		out.print(" ");
        		break;
        	}
        	rank++;
        }
        
        pq = new PriorityQueue<>();
        for(Pair p : arr) {
        	if(p.str.equals(me)) {
        		p.num -= 2;
        	}
        	else if(p.str.equals(you)) {
        		p.num += 1;
        	}
        	pq.add(p);
        }
        
        rank = 1;
        while(true) {
        	Pair p = pq.poll();
        	if(p.str.equals(me)) {
        		out.print(rank);
        		out.print(" ");
        		break;
        	}
        	rank++;
        }
        
        pq = new PriorityQueue<>();
        for(Pair p : arr) {
        	if(p.str.equals(me)) {
        		p.num -= 1;
        	}
        	else if(p.str.equals(you)) {
        		p.num += 2;
        	}
        	pq.add(p);
        }
        
        
        rank = 1;
        while(true) {
        	Pair p = pq.poll();
        	if(p.str.equals(me)) {
        		out.println(rank);
        		break;
        	}
        	rank++;
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