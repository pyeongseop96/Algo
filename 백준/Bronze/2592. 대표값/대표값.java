import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[2031];
        int big = 0;
        int ans = 0;
        for(int i=1; i<=10; i++) {
        	int tmp = sc.nextInt();
        	sum += tmp;
        	arr[tmp]++;
        	if(arr[tmp]>big) {
        		big = arr[tmp];
        		ans = tmp;
        	}
        }
        System.out.println(sum/10);
        System.out.println(ans);
    }
}