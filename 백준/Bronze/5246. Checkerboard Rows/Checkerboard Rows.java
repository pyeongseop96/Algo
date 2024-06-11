import java.util.Scanner;
import java.util.Random;

public class Main {
    private static int solve(int [] positions_x, int [] positions_y) {
    	int result = 0;
    	
        /* ------------------- INSERT CODE HERE ---------------------*/
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i:positions_x){
            arr1[i]++;
        }
        for(int i:positions_y){
            arr2[i]++;
        }
        for(int i=0; i<10; i++){
//            if(result<arr1[i]){
//                result = arr1[i];
//            }
            if(result<arr2[i]){
                result = arr2[i];
            }
        }


        /* -------------------- END OF INSERTION --------------------*/

        return result;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++) 
        {
            int numPieces = sc.nextInt();

            int[] positions_x = new int[numPieces];
            int[] positions_y = new int[numPieces];


            for(int j = 0; j < numPieces; j++) {
                positions_x[j] = sc.nextInt();
                positions_y[j] = sc.nextInt();
            }

            System.out.println (solve(positions_x, positions_y));

        }
    }
}

