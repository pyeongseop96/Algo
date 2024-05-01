import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = "unrated";
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i)=='2' && (str.charAt(i-1)=='D'||str.charAt(i-1)=='d')) {
				ans = "D2";
				break;
			}
		}
		System.out.println(ans);
	}
}
