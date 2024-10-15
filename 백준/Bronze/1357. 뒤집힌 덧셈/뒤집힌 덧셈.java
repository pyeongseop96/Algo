import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a = 0;
        int b = 0;
        while(N>0) {
        	a*=10;
        	a+=N%10;
        	N/=10;
        }
        while(M>0) {
        	b*=10;
        	b+=M%10;
        	M/=10;
        }
        int c = a+b;
        int ans = 0;
        while(c>0) {
        	ans*=10;
        	ans+=c%10;
        	c/=10;
        }
        System.out.println(ans);
    }
}