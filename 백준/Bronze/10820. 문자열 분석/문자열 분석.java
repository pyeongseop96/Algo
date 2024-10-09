import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	String str = sc.nextLine();
        	int so = 0;
        	int de = 0;
        	int num = 0;
        	int space = 0;
        	for(char c:str.toCharArray()) {
        		if(c==' ') {
        			space++;
        		}
        		else if(c>='a' && c<='z') {
        			so++;
        		}
        		else if(c>='A' && c<='Z') {
        			de++;
        		}
        		else {
        			num++;
        		}
        	}
        	System.out.println(so + " " + de + " " + num + " " + space);
        }
    }
}