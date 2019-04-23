
import java.util.*;

public class Method{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Calc calc = new Calc();
    double radius1 = Double.parseDouble(sc.next());
    double radius2 = Double.parseDouble(sc.next());
    System.out.println(calc.calEllipseArea(radius1, radius2));
  }
}
