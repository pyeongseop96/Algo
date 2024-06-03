import java.io.*;
import java.util.*;

public class Main {

    void solve() {

    }
    
    void run() {
        sc = new FastScanner();
        out = new PrintWriter(System.out);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            solve();
//        }
        long N = sc.nextLong();
        long first = (10001*100000000l) + (N*10001);//aaaabbbbccccdddd -> (a,b), (c,d)
        int W = sc.nextInt();
        Map<Long, Long>[] mapArray = new HashMap[W+1];
        for(int i=0; i<=W; i++) {
        	mapArray[i] = new HashMap<>();
        }
        mapArray[0].put(first, 0l);
        
        long[][] xyArr = new long[W+1][2];
        for(int i=1; i<=W; i++) {
        	xyArr[i][0] = sc.nextLong();
        	xyArr[i][1] = sc.nextLong();
        }
        
        for(int i=1; i<=W; i++) {
        	long x = xyArr[i][0];
        	long y = xyArr[i][1];
        	for(var e : mapArray[i-1].entrySet()) {
				long key = e.getKey();
//				System.out.println(key);
				long val = e.getValue();
        		long a = key/1000000000000l;
        		long b = (key/100000000)%10000;
        		long c = (key/10000)%10000;
        		long d = key%10000;
        		
        		long ab = key/100000000;
        		long cd = key%100000000;
        		long xy = (10000*x)+y;
        		
        		//첫번째 경찰(ab)이 이동
        		long aa = Math.abs(x-a) + Math.abs(y-b);
        		long next = (xy*100000000l)+cd;
        		
        		if(mapArray[i].getOrDefault(next,987654321l)>val+aa) {
        			mapArray[i].put(next, val+aa);
//        			System.out.println(val+aa);
        		}
        		
        		//두번째 경찰(cd)이 이동
        		long bb = Math.abs(x-c) + Math.abs(y-d);
        		long nextt = (ab*100000000l)+xy;
        		
        		if(mapArray[i].getOrDefault(nextt,987654321l)>val+bb) {
        			mapArray[i].put(nextt, val+bb);
//        			System.out.println(val+bb);
        		}
        		
        		
        	}
        }
        long min = 987654321;
        long a = 0;
        long b = 0;
        long c = 0;
        long d = 0;
      
        for(var e:mapArray[W].entrySet()) {
        	if(min>e.getValue()) {
        		min = e.getValue();
        		a = e.getKey()/1000000000000l;
        		b = (e.getKey()/100000000)%10000;
        		c = (e.getKey()/10000)%10000;
        		d = e.getKey()%10000;
        	}
        }
//        System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(123);
        out.println(min);
        
        int[] choiceArr = new int[W];
        out:for(int i=W-1; i>=0; i--) {
        	long x = xyArr[i+1][0];
        	long y = xyArr[i+1][1];
        	
        	long xy = (10000*x) + y;

        	for(var e:mapArray[i].entrySet()) {
        		long key = e.getKey();
        		long ea = key/1000000000000l;
        		long eb = (key/100000000)%10000;
        		long ec = (key/10000)%10000;
        		long ed = key%10000;
        		long val = e.getValue();
//        		if(i==W-1) {
//        			System.out.println(ea);
//            		System.out.println(eb);
//            		System.out.println(ec);
//            		System.out.println(ed);
//            		System.out.println(key);
//            		System.out.println();
//        		}
        		
        		
        		if((a==x && b==y) && (c==ec && d==ed) && (Math.abs(ea-a) + Math.abs(eb-b))==min-val) {
        			choiceArr[i]=1;
        			a = ea;
        			b = eb;
        			min = val;
        			continue out;
        		}
        		if((c==x && d==y) && (a==ea && b==eb) && (Math.abs(ec-c) + Math.abs(ed-d))==min-val) {
        			choiceArr[i]=2;
        			c = ec;
        			d = ed;
        			min = val;
        			continue out;
        		}
            	
            }
        }
        for(int i:choiceArr) {
        	out.println(i);
        }
        out.close();
    }

    FastScanner sc;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
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