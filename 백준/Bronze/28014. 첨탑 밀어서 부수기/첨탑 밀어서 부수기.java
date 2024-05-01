import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int before = 0;
		int ans = 0;
		for(int i=1; i<=N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(before<=num) {
				ans++;
			}
			before = num;
		}
		System.out.println(ans);
	}
}
