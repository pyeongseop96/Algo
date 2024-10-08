import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 10;
        String str = sc.next();
        for(int i=1; i<str.length(); i++) {
        	if(str.charAt(i)!=str.charAt(i-1)) {
        		ans += 10;
        	}
        	else {
        		ans += 5;
        	}
        }
        System.out.println(ans);
    }
}