import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N==0) {
			System.out.println(1);
		}
		else {
			int size = Integer.toString(N).length();
			int M = 0;
			for(int i=1; i<=size; i++) {
				M *= 10;
				M++;
			}
			if(N>=M) {
				System.out.println(size);
			}
			else {
				System.out.println(size-1);
			}
		}
	}
}