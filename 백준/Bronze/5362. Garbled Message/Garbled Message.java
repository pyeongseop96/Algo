import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	char[] arr = sc.nextLine().toCharArray();
        	int idx = 0;
        	while(idx<=arr.length - 5) {
        		if(arr[idx]=='i' &&
        				arr[idx+1]=='i' &&
        				arr[idx+2]=='i' &&
        				arr[idx+3]=='n' &&
        				arr[idx+4]=='g') {
        			System.out.print("th");
        			idx += 5;
        		}
        		else {
        			System.out.print(arr[idx]);
        			idx++;
        		}
        			
        	}
        	for(int i=idx; i<arr.length; i++) {
        		System.out.print(arr[i]);
        	}
        	System.out.println();
        }
    }
}