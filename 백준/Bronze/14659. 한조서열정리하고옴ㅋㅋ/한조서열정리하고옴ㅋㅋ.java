import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		int[] arr = new int[N];
        for(int i=0; i<N; i++) {
        	arr[i] = sc.nextInt();
        }
        int M = arr[0];
		int ans = 0;
		int cur = 0;
		int idx = 1;
		while(idx<N){
			if(M>arr[idx]){
				cur++;
			}
			else{
				if(cur>ans){
				    
					ans = cur;
					
				}
				M = arr[idx];
				cur = 0;
			}
			idx++;
		}
		if(cur>ans){
		    
			ans = cur;
			
		}
        System.out.println(ans);
    }
}