import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
        	arr[i] = sc.nextInt();
        }
        if(M==2) {
        	for(int i=0; i<N; i++) {
            	ans += arr[i] * arr[i];
            }
        }
        else if(M==1) {
        	for(int i=0; i<N; i++) {
        		if(arr[i]>0) {
        			ans += arr[i];
        		}
            }
        }
        else if(M==3) {
        	for(int i=0; i<N; i++) {
        		if(arr[i]>0) {
        			ans += arr[i]*arr[i]*arr[i];
        		}
            }
        }
        System.out.println(ans);
    }
}