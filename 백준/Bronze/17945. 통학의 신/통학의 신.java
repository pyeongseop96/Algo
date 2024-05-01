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
		int c = (int)Math.sqrt((4*a*a)-(4*b));
		System.out.print(((-2*a)-c)/2);
		System.out.print(" ");
		if(c!=0) {
			System.out.println(((-2*a)+c)/2);
		}
	}
}
