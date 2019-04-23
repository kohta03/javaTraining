
import java.util.*;

public class Basic1{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
		System.out.print("整数を二つ入力してください：");
		int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
		int gcd;
    gcd = calc(a, b);

		System.out.println("最大公約数は" + gcd);
  }

  public static int calc(int a, int b){

    int c = 0;
    while(true){
      System.out.println("a : " + a);
      System.out.println("b : " + b);
      c = a % b;
      if(c == 0){
        break;
      }
      a = b;
      b = c;
    }
    return b;
  }
}
