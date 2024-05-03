import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	String str1 = st.nextToken();
    	String str2 = st.nextToken();
    	int[] arr = new int[100];
    	for(int i=0; i<str1.length(); i++) {
    		if(str1.charAt(str1.length()-i-1)=='1') {
    			arr[i] = 1;
    		}
    	}
    	int up = 0;
    	for(int i=0; i<str2.length(); i++) {
    		int num = arr[i]+up+str2.charAt(str2.length()-i-1)-'0';
    		arr[i] = num%2;
    		if(num/2==1) {
    			up = 1;
    		}
    		else {
    			up = 0;
    		}
    	}
    	for(int i=str2.length(); i<88; i++) {
    		if(up==1) {
    			if(arr[i]==0) {
    				arr[i]=1;
    				break;
    			}
    			else {
    				arr[i] = 0;
    			}
        	}
    	}
    	
    	
    	int start = 99;
    	while(start>=0) {
    		if(arr[start]==1) {
    			break;
    		}
    		start--;
    	}
    	
    	if(start==-1) {
    		System.out.println(0);
    	}
    	else {
    		for(int i=start; i>=0; i--) {
    			System.out.print(arr[i]);
    		}
    	}
    }
}