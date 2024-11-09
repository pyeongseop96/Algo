import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
        	int[] arr = new int[5];
        	for(int j=0; j<5; j++) {
        		arr[j] = sc.nextInt();
        	}
        	Arrays.sort(arr);
            if(arr[3]-arr[1]>=4) {
            	System.out.println("KIN");
            }
            else {
            	System.out.println(arr[1]+arr[2]+arr[3]);
            }
        }
    }
}