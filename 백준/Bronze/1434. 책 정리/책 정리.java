import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a = 0;
        int b = 0;
        for(int i=1; i<=N; i++) {
        	a += sc.nextInt();
        }
        for(int i=1; i<=M; i++) {
        	b += sc.nextInt();
        }
        System.out.println(a-b);
        
    }
}