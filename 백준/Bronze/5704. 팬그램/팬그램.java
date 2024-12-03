import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	String str = sc.nextLine();
        	if(str.equals("*")) {
        		break;
        	}
        	int[] arr = new int[30];
        	for(char c:str.toCharArray()) {
        		if(c!=' ') {
        			arr[c-'a']++;
        		}
        		//arr[c-'a']++;
        	}
        	int sum = 0;
        	for(int i:arr) {
        		if(i!=0) {
        			sum++;
        		}
        	}
        	if(sum==26) {
        		System.out.println("Y");
        	}
        	else {
        		System.out.println("N");
        	}
        }
        
        
    }
}