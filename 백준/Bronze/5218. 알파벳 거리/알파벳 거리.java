import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		/* ------------------- INSERT CODE HERE ---------------------*/


		// answer.add(x);	// add x to ArrayList<Integer> answer
                	for(int j=0; j<s1.length(); j++) {
        		int a = s1.charAt(j) - s2.charAt(j);
        		a*=-1;
        		if(a<0) {
        			a+=26;
        		}
        		answer.add(a);
        	}
		
		
		
		
		
		
		
		

		/* -------------------- END OF INSERTION --------------------*/

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int i = 0; i < numCases; i++)
		{
			String s1 = sc.next();
			String s2 = sc.next();

			ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
			System.out.print("Distances: ");

			for(Integer d : answer) {
				System.out.print(d+" ");
			}
			System.out.println();

		}
	}
}
