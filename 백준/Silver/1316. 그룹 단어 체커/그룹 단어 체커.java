import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= N; i++) {
			int group = 1;
			int[] abc = new int[26];
			String str = sc.next();
			abc[(int)(str.charAt(0) - 'a')]++;
			for (int j = 1; j <= str.length() - 1; j++) {
				if (str.charAt(j) != str.charAt(j - 1)) {
					if (abc[str.charAt(j)-'a'] == 0) {
						abc[str.charAt(j)-'a']++;
					} else {
						group = 0;
						break;
					}
				}
			}
			ans += group;
		}
		System.out.println(ans);
	}
}