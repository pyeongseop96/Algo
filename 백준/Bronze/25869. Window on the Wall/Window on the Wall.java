import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=  sc.nextInt();
        if(a<2*c || b<2*c) {
        	System.out.println(0);
        }
        else {
        	System.out.println((a-2*c)*(b-2*c));
        }
    }
}