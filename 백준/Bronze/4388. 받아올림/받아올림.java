import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		if(a==0 && b==0) {
    			break;
    		}
    		int carry = 0;
    		int[] arr1 = new int[10];
    		int[] arr2 = new int[10];
    		
    		int idx = 9;
    		while(a!=0) {
    			arr1[idx]=a%10;
    			a/=10;
    			idx--;
    		}
    		
    		idx = 9;
    		while(b!=0) {
    			arr2[idx]=b%10;
    			b/=10;
    			idx--;
    		}
    		
    		int ans = 0;
    		
    		for(int i=9; i>=0; i--) {
    			if(arr1[i]+arr2[i]+carry >= 10) {
    				ans++;
    				carry = 1;
    			}
    			else {
    				carry = 0;
    			}
    		}
    		System.out.println(ans);
    	}
    }
}