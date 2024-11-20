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
        if(a!=1 && a!=3) {
        	System.out.println("EI");
        }
        else if(b!=6 && b!=8) {
        	System.out.println("EI");
        }
        else if(c!=2 && c!=5) {
        	System.out.println("EI");
        }
        else {
        	System.out.println("JAH");
        }
    }
}