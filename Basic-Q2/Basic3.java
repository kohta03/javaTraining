
import java.util.*;

public class Basic3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int month = Integer.parseInt(sc.next());

    if(month < 3){
      System.out.println("“~");
    }else if(month < 6){
      System.out.println("t");
    }else if(month < 9){
      System.out.println("‰Ä");
    }else if(month < 12){
      System.out.println("H");
    }else if(month == 12){
      System.out.println("“~");
    }else{
      System.out.println("ƒGƒ‰[‚Å‚·");
    }

  }
}
