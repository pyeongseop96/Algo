import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean hacker = false;
		int sum = 0;
		for(int i=0; i<=8; i++) {
			int num = sc.nextInt();
			if(((i/2)*100)+100<num){
				hacker = true;
			}
			else {
				sum += num;
			}
		}
		if(hacker) {
			System.out.println("hacker");
		}
		else if(sum>=100) {
			System.out.println("draw");
		}
		else {
			System.out.println("none");
		}
	}
}
