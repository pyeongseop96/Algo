import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        for(int i=0; i<=300; i++) {
        	if(n-(a*i)<0) {
        		break;
        	}
        	else if(n==a*i) {
        		ans = 1;
        		break;
        	}
        	for(int j=0; j<=300; j++) {
        		if(n-(a*i)-(b*j)<0) {
        			break;
        		}
        		else if(n==(a*i)+(b*j)) {
        			ans = 1;
        			break;
        		}
        		for(int k=0; k<=300; k++) {
        			if(n-(a*i)-(b*j)-(c*k)<0) {
        				break;
        			}
        			else if(n == (a*i)+(b*j)+(c*k)) {
        				ans = 1;
        				break;
        			}
        		}
        	}
        }
        System.out.println(ans);
    }
}