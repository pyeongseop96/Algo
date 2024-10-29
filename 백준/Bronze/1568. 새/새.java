import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int stack = 1;
        while(N>0) {
        	if(N>=stack) {
        		N-=stack;
        		stack++;
        		ans++;
        	}
        	else {
        		stack = 1;
        	}
        }
        System.out.println(ans);
    }
}