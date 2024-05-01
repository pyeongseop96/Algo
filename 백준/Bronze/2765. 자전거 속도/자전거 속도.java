import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int tc = 1;
		while(true) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			if(b==0) {
				break;
			}
			System.out.print("Trip #");
			System.out.print(tc);
			System.out.print(": ");
			BigDecimal bd = new BigDecimal(((a/12)/5280)*3.1415927*b);
			System.out.print(bd.setScale(2, RoundingMode.HALF_UP).toString());
			System.out.print(" ");
			BigDecimal bdd = new BigDecimal(c/3600);
			System.out.println(bd.divide(bdd, 10, RoundingMode.HALF_EVEN).setScale(2, RoundingMode.HALF_UP).toString());
			tc++;
		}
	}
}
