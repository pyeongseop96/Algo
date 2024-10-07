import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		for(int i=1; i<=N; i++) {
			int M = sc.nextInt();
			if(M%2==1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}