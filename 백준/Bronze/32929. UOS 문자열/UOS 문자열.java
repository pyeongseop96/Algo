import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong() % 3;
        if(l==1) {
        	System.out.println("U");
        }
        else if(l==2) {
        	System.out.println("O");
        }
        else {
        	System.out.println("S");
        }
        
    }
}