import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(char c:str.toCharArray()) {
			if(c=='.') {
				break;
			}
			else {
				System.out.print(c);
			}
		}
	}
}