import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for(int i=1; i<=N; i++) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		if(a<12 || b<4) {
    			System.out.println(-1);
    		}
    		else {
    			System.out.println((11*b)+4);
    		}
    	}
    }
}