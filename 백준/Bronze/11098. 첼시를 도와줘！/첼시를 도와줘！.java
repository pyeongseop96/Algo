import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
        	int M = sc.nextInt();
        	int max = -1;
        	String b = "123";
        	for(int j=1; j<=M; j++) {
        		int a = sc.nextInt();
        		String str = sc.next();
        		if(a>max) {
        			max = a;
        			b = str;
        		}
        	}
        	System.out.println(b);
        }
    }
}