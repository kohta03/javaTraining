
import java.util.*;

public class Basic31{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int month = Integer.parseInt(sc.next());

    switch(month){

      case 1:
      case 2:
        System.out.println("“~");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("t");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("‰Ä");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("H");
        break;
      case 12:
        System.out.println("“~");
        break;
      default:
        System.out.println("12‚Ü‚Å‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        break;

    }

  }
}
