import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i=0; i<10; i++) {
        	arr1[i] = sc.nextInt();
        }
        for(int i=0; i<10; i++) {
        	arr2[i] = sc.nextInt();
        }
        int a= 0;
        int b = 0;
        
        for(int i=0; i<10; i++) {
        	if(arr1[i]<arr2[i]) {
        		b++;
        	}
        	else if(arr1[i]>arr2[i]) {
        		a++;
        	}
        }
        if(a>b) {
        	System.out.println("A");
        }
        else if(a<b) {
        	System.out.println("B");
        }
        else {
        	System.out.println("D");
        }
    }
}