import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=1; i<=N; i++){
        list.add(i);
    }
    for(int i=1; i<=M; i++){
        int A = sc.nextInt();
        int B = sc.nextInt();
        int first = list.get(A-1);
        list.set(A-1, list.get(B-1));
        list.set(B-1, first);
    }
    for(int i : list){
        System.out.print(i);
        System.out.print(" ");
    }
  }
}