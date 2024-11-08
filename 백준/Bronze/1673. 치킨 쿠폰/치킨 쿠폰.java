import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	long a = sc.nextLong();
        	long c = a;
        	long b = sc.nextLong();
        	long ans = 0;
        	while(a>=b) {
        		ans += a/b;
        		a = (a%b)+(a/b);
        	}
        	System.out.println(ans+c);
        }
    }
}