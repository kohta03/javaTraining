
import java.util.*;

public class Malti{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Calc calc = new Calc();
    double radius = Double.parseDouble(sc.next());
    System.out.println(calc.calEllipseArea(radius));
  }
}
