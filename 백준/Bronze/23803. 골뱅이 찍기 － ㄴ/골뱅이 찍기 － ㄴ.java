import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=4*n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5*n; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
