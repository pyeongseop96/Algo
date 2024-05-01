import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if((c-a)%b!=0 ||
				(c-a<0 && b>0) ||
				(c-a>0 && b<0)) {
			System.out.println("X");
		}
		else {
			System.out.println(((c-a)/b)+1);
		}
	}
}
