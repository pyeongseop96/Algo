import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		for(char c:str.toCharArray()) {
			if(c=='I') {
				System.out.print("i");
			}
			else {
				System.out.print("L");
			}
		}
	}
}