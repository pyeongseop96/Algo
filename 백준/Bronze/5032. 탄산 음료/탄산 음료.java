import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int n = sc.nextInt();
        int ans = 0;
        while(c>=n) {
        	ans += c/n;
        	c = (c/n)+(c%n);
        }
        System.out.println(ans);
    }
}