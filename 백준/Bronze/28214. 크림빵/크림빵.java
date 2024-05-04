import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int ans = 0;
		for(int i=1; i<=a; i++) {
			int cnt = 0;
			for(int j=1; j<=b; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num==0) {
					cnt++;
				}
			}
			if(cnt<c) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
