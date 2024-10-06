import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			BigDecimal bd1 = new BigDecimal(sc.next());
			BigDecimal bd2 = new BigDecimal(sc.next());
			BigDecimal bd3 = bd1.add(bd2);
			BigDecimal bd4 = bd1.multiply(bd2);
			System.out.print("f = ");
			System.out.println(bd4.divide(bd3, 1, RoundingMode.HALF_UP));
		}
	}
}