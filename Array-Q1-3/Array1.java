
import java.util.*;

public class Array1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int[][][] array = new int[10][10][10];

    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        for(int k = 0; k < 10; k++){
          array[i][j][k] = i * j * k;
        }
      }
    }
    System.out.println(array[a][b][c]);
  }
}
