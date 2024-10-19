import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int a1 = 0;
        int a2 = 0;
        int b1 = 0;
        int b2 = 0;
        for(int i=0; i<a.length(); i++) {
        	a1*=10;
        	a2*=10;
        	if((a.charAt(i)-'0')%10==5 || (a.charAt(i)-'0')%10==6) {
        		a1+=5;
        		a2+=6;
        	}
        	else {
        		a1+=(a.charAt(i)-'0')%10;
        		a2+=(a.charAt(i)-'0')%10;
        	}
        }
        for(int i=0; i<b.length(); i++) {
        	b1*=10;
        	b2*=10;
        	if((b.charAt(i)-'0')%10==5 || (b.charAt(i)-'0')%10==6) {
        		b1+=5;
        		b2+=6;
        	}
        	else {
        		b1+=(b.charAt(i)-'0')%10;
        		b2+=(b.charAt(i)-'0')%10;
        	}
        }
        
        System.out.print(a1+b1);
        System.out.print(" ");
        System.out.println(a2+b2);
    }
}