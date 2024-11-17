import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
            BigDecimal bd = new BigDecimal(sc.next());
            BigDecimal a = new BigDecimal("3");
            BigDecimal b = new BigDecimal("5");
            BigDecimal c = new BigDecimal("7");
            while(sc.hasNext() && !sc.hasNextDouble()) {
            	String str = sc.next();
            	if(str.equals("@")) {
            		bd = bd.multiply(a);
            	}
            	else if(str.equals("%")) {
            		bd = bd.add(b);
            	}
            	else {
            		bd = bd.subtract(c);
            	}
       
            }
            System.out.println(bd.setScale(2, RoundingMode.DOWN));
        }

    }
}