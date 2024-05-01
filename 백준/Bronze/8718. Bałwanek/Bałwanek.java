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
		if(7*b<=a) {
			System.out.println((int)(7*b*1000));
		}
		else if(3.5*b<=a) {
			System.out.println((int)(3.5*b*1000));
		}
		else if(1.75*b<=a) {
			System.out.println((int)(1.75*b*1000));
		}
		else {
			System.out.println(0);
		}
	}
}
