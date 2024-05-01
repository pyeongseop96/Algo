import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		if(a.remainder(b).compareTo(zero)<0) {
			if(b.compareTo(zero)<0) {
				System.out.println(a.divide(b).add(one));
				System.out.println(a.remainder(b).subtract(b));
			}
			else {
				System.out.println(a.divide(b).subtract(one));
				System.out.println(a.remainder(b).add(b));
			}
		}
		else {
			System.out.println(a.divide(b));
			System.out.println(a.remainder(b));
		}
	}
}
