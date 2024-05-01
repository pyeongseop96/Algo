import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = Math.min(a,b)*2;
		int aa = Math.max(a,b)-Math.min(a,b);
		if(aa<c) {
			ans += aa+c-((aa+c)%2);
		}
		else {
			ans += c*2;
		}
		System.out.println(ans);
	}
}
