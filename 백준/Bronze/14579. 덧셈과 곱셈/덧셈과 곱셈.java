import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 1;
		for(int i=a; i<=b; i++) {
			ans = (ans * ((i*(i+1))/2)) % 14579;
		}
		System.out.println(ans);
	}
}
