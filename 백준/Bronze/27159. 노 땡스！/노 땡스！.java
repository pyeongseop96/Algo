import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = sc.nextInt();
		int before = ans;
		for(int i=1; i<=n-1; i++) {
			int num = sc.nextInt();
			if(num-before!=1) {
				ans += num;
			}
			before = num;
		}
		System.out.println(ans);
	}
}
