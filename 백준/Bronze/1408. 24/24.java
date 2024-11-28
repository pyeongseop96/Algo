import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int a = ((str1.charAt(0)-'0')*36000)+
        		((str1.charAt(1)-'0')*3600) +
        		((str1.charAt(3)-'0')*600) +
        		((str1.charAt(4)-'0')*60) +
        		((str1.charAt(6)-'0')*10) +
        		((str1.charAt(7)-'0'));
        int b = ((str2.charAt(0)-'0')*36000)+
        		((str2.charAt(1)-'0')*3600) +
        		((str2.charAt(3)-'0')*600) +
        		((str2.charAt(4)-'0')*60) +
        		((str2.charAt(6)-'0')*10) +
        		((str2.charAt(7)-'0'));
        if(a>b) {
        	b += 3600*24;
        }
        int zz = b-a;
        int aa = zz/3600;
        zz -= aa*3600;
        int bb = zz/60;
        zz -= bb*60;
        int cc = zz;
        if(aa<10) {
        	System.out.print("0");
        }
        System.out.print(aa);
        System.out.print(":");
        if(bb<10) {
        	System.out.print("0");
        }
        System.out.print(bb);
        System.out.print(":");
        if(cc<10) {
        	System.out.print("0");
        }
        System.out.print(cc);
    }
}