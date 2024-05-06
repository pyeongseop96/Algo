import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0;
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			ans += 2*arr[i];
		}
		
		int cnt = 0;
		
		//현재 0이 아닌 가장 왼쪽 가게의 라면이 n개 있을때 하늘이 무너져도 3/5/7중 하나를 n번 선택해야한다.
		//왼쪽+1번 가게는 최대한 값이 줄어드는게 이득
		//왼쪽+2번 가게는 왼쪽+1번과 같거나 큰 수중 최대한 작은게 이득
		//총 가격: 전체 라면 * 2 + 3/5/7중에 선택한 횟수 * 1
		
		for(int i=0; i<N; i++) {
			if(arr[i]!=0) {
				int num = arr[i];//n
				int num2 = 0;//5 혹은 7 쓴 횟수
				arr[i] = 0;
				if(i<N-1) {
					if(arr[i+1]<=num) {
						num2 = arr[i+1];
						arr[i+1] = 0;
					}
					else {
						num2 = num;
						arr[i+1] -= num;
					}
				}
				if(i<N-2) {
					if(arr[i+2]>arr[i+1] && arr[i+2] - num2 <= arr[i+1]) {
						arr[i+2] = arr[i+1];
					}
					else if(arr[i+2]>arr[i+1]) {
						arr[i+2] -= num2;
					}
				}
				cnt += num;
			}
		}
		System.out.println(ans + cnt);
	}
}
