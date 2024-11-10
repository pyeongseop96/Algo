import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=100; i++) {
        	for(int j=i; j<=10000; j++) {
        		if(i*j>N) {
        			break;
        		}
        		else {
        			ans++;
        		}
        	}
        }
        System.out.println(ans);
    }
}