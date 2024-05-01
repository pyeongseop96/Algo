import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 1;
		int ans = 0;
		while(a>=c) {
			ans += a/c;
			c *= b;
		}
		System.out.println(ans);
	}
}
