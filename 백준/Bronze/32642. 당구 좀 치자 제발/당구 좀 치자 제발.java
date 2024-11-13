import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        long ans = 0;
        for(int i=1; i<=N; i++) {
        	int M = sc.nextInt();
        	if(M==0) {
        		sum-=1;
        	}
        	else {
        		sum+=1;
        	}
        	ans += sum;
        }
        System.out.println(ans);
    }
}