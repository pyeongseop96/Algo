import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "CAMBRIDGE";
        String strr = sc.next();
        find: for(char c : strr.toCharArray()) {
        	for(char cc : str.toCharArray()) {
        		if(c==cc) {
        			continue find;
        		}
        	}
        	System.out.print(c);
        }
    }
}