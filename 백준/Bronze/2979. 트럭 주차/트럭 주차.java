import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt() * 2;
        int c = sc.nextInt() * 3;
        int[] arr = new int[102];
        for(int i=1; i<=3; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	for(int j=x; j<y; j++) {
        		arr[j]++;
        	}
        }
        int ans = 0;
        for(int i : arr) {
        	if(i==1) {
        		ans += a;
        	}
        	else if(i==2) {
        		ans += b;
        	}
        	else if(i==3) {
        		ans += c;
        	}
        }
        System.out.println(ans);
    }
}