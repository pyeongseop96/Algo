import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N>100000) {
        	System.out.println("No");
        }
        else if(N%2024!=0) {
        	System.out.println("No");
        }
        else {
        	System.out.println("Yes");
        }
    }
}