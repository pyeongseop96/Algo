import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(char c:str.toCharArray()) {
        	if(c=='A') {
        		System.out.print('X');
        	}
        	else if(c=='B') {
        		System.out.print('Y');
        	}
        	else if(c=='C') {
        		System.out.print('Z');
        	}
        	else {
        		System.out.print((char)(c-3));
        	}

        }
    }
}