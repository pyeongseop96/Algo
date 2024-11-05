import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        while(sc.hasNext()) {
        	String str = sc.nextLine();
        	for(char c:str.toCharArray()) {
        		if(c>='a') {
        			arr[c-'a']++;
        		}
        	}
        }
        int max = 0;
        for(int i:arr) {
        	if(i>max) {
        		max = i;
        	}
        }
        for(int i=0; i<26; i++) {
        	if(arr[i]==max) {
        		System.out.print((char)('a'+i));
        	}
        }
    }
}