import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt()+sc.nextInt()+sc.nextInt();
        if(a<=b || a<=240) {
        	System.out.println("high speed rail");
        }
        else {
        	System.out.println("flight");
        }
    }
}