import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	if(!sc.hasNext()) {
        		System.out.println(18);
        		return;
        	}
        	int c = sc.nextInt();
        	int sum = 2*a*c;
        	b -= c;
        	sum += a*b;
        	sum += (a/2)*Math.max(0, b-140);
        	String str = Integer.toString(sum);
        	for(int j=0; j<str.length(); j++) {
        		System.out.print(str.charAt(j));
        		if(j!=str.length()-1 && (str.length()-j-1)%3==0) {
        			System.out.print(",");
        		}
        	}
        	System.out.println();
        }
        
    }
}