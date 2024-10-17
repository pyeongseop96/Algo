import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
        	arr[i] = sc.nextInt();
        }
        int ans = 0;
        int mx = -1;
        for(int i=N-1; i>=0; i--) {
        	if(arr[i]>mx) {
        		mx = arr[i];
        		ans++;
        	}
        }
        System.out.println(ans);
    }
}