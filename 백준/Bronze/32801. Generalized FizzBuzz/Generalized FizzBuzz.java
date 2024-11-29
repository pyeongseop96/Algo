import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i=1; i<=a; i++) {
        	if(i%b==0 && i%c==0) {
        		z++;
        	}
        	else if(i%b==0) {
        		x++;
        	}
        	else if(i%c==0) {
        		y++;
        	}
        }
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
        System.out.print(" ");
        System.out.println(z);
    }
}