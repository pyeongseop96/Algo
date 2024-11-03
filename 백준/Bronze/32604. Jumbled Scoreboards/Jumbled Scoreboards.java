import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = "yes";
        for(int i=1; i<=N-1; i++) {
        	int aa = sc.nextInt();
        	int bb = sc.nextInt();
        	if(a>aa || b>bb) {
        		ans = "no";
        	}
        	a = aa;
        	b = bb;
        }
        System.out.println(ans);
    }
}