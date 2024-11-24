import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 0;
        String[] str = {" ", "Jan", "Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov", "Dec"};
        while(true) {
        	int N = sc.nextInt();
        	if(N==0) {
        		break;
        	}
        	T++;
        	System.out.println("Case #"+T+":");
        	int[] arr = new int[13];
        	for(int i=1; i<=N; i++) {
        		int tmp = sc.nextInt();
        		arr[sc.nextInt()]++;
        		tmp = sc.nextInt();
        	}
        	for(int i=1; i<=12; i++) {
        		System.out.print(str[i]+":");
        		for(int j=1; j<=arr[i]; j++) {
        			System.out.print("*");
        		}
        		System.out.println();
        	}
        }
    }
}