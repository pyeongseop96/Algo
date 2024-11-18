import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (13*sc.nextInt())+(7*sc.nextInt())+(5*sc.nextInt())+(3*sc.nextInt())+(3*sc.nextInt())+(2*sc.nextInt());
        int b = (13*sc.nextInt())+(7*sc.nextInt())+(5*sc.nextInt())+(3*sc.nextInt())+(3*sc.nextInt())+(2*sc.nextInt());
        if(a>=b+2) {
        	System.out.println("cocjr0208");
        }
        else {
        	System.out.println("ekwoo");
        }
    }
}