import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 0;
        for(int i=1; i<=9; i++) {
        	for(int j=1; j<=9; j++) {
        		if(i*j==N) {
        			M = 1;
        		}
        	}
        }
        System.out.println(M);
    }
}