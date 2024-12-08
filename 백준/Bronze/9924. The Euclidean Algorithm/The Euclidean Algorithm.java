import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        Arrays.sort(arr);
        int ans = 0;
        while(arr[0]!=0) {
        	ans++;
        	Arrays.sort(arr);
        	arr[1] = arr[1]-arr[0];
        	Arrays.sort(arr);
        }
        System.out.println(ans-1);
    }
}