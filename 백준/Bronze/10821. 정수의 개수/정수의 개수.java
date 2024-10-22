import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 1;
        for(char c: str.toCharArray()) {
        	if(c==',') {
        		ans++;
        	}
        }
        System.out.println(ans);
    }
}