import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String ans = "Yes";
        for(int i=1; i<=N; i++) {
        	int num = 0;
        	for(int j=1; j<=M; j++) {
        		String c = sc.next();
        		if(c.equals("A")) {
        			num++;
        		}
        	}
        	if(num!=1) {
        		ans = "No";
        	}
        }
        System.out.println(ans);
        
    }
}