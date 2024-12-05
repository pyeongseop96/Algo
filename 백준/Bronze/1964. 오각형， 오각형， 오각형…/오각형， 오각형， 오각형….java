import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 5;
        int a = 4;
        int N = sc.nextInt();
        for(int i=2; i<=N; i++) {
        	a+=3;
        	ans += a;
        	ans = ans%45678;
        }
        System.out.println(ans);
        
    }
}