import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal bd0 = new BigDecimal(sc.next());
        BigDecimal bd1 = bd0.multiply(bd0);
        BigDecimal bd2 = new BigDecimal(sc.next());
        BigDecimal bd3 = new BigDecimal(sc.next());
        BigDecimal bd4 = bd2.multiply(bd2);
        BigDecimal bd5 = bd3.multiply(bd3);
        BigDecimal bd6 = bd4.add(bd5);
        BigDecimal bd7 = bd1.divide(bd6, 10, RoundingMode.HALF_UP).sqrt(MathContext.DECIMAL32);
        System.out.print(bd2.multiply(bd7).intValue());
        System.out.print(" ");
        System.out.print(bd3.multiply(bd7).intValue());
        
    }
}