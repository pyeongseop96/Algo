import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for(int i=1; i<=N; i++) {
    		String str = sc.next();
    		System.out.print(str);
    		System.out.print(" ");
    		int num = sc.nextInt();
    		if(num>=97) {
    			System.out.println("A+");
    		}
    		else if(num>=90) {
    			System.out.println("A");
    		}
    		else if(num>=87) {
    			System.out.println("B+");
    		}
    		else if(num>=80) {
    			System.out.println("B");
    		}
    		else if(num>=77) {
    			System.out.println("C+");
    		}
    		else if(num>=70) {
    			System.out.println("C");
    		}
    		else if(num>=67) {
    			System.out.println("D+");
    		}
    		else if(num>=60) {
    			System.out.println("D");
    		}
    		else if(num>=0) {
    			System.out.println("F");
    		}
    	}
    }
}