import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int j=1; j<=n; j++) {
			for(int i=1; i<=n; i++) {
				System.out.print("@");
			}
			for(int i=1; i<=3*n; i++) {
				System.out.print(" ");
			}
			for(int i=1; i<=n; i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for(int j=1; j<=n; j++) {
			for(int i=1; i<=n; i++) {
				System.out.print("@");
			}
			for(int i=1; i<=3*n; i++) {
				System.out.print(" ");
			}
			for(int i=1; i<=n; i++) {
				System.out.print("@");
			}
			System.out.println();
		}

		
		
		for(int j=1; j<=n; j++) {
			for(int i=1; i<=5*n; i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for(int j=1; j<=n; j++) {
			for(int i=1; i<=n; i++) {
				System.out.print("@");
			}
			for(int i=1; i<=3*n; i++) {
				System.out.print(" ");
			}
			for(int i=1; i<=n; i++) {
				System.out.print("@");
			}
			System.out.println();
		}

		
		
		for(int j=1; j<=n; j++) {
			for(int i=1; i<=5*n; i++) {
				System.out.print("@");
			}
			System.out.println();
		}


		

	}
}
