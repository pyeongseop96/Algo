import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=3; i++) {
        	String str = sc.next();
        	int max = 1;
        	char before = 'a';
        	int combo = 1;
        	for(char c : str.toCharArray()) {
        		if(c==before) {
        			combo++;
        		}
        		else {
        			if(max<combo) {
        				max = combo;
        			}
        			combo = 1;
        		}
        		before = c;
        	}
        	if(max<combo) {
        		max = combo;
        	}
        	System.out.println(max);
        }
    }
}