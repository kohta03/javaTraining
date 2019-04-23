public class Calc{

	public static double calcEllipseArea(double longDiameter,double shortDiameter){
		double area;

		area = Math.PI * longDiameter * shortDiameter;

		return area;
	}

	public static double calcEllipseArea(double radius){
		double area;

		area = Math.PI * radius * radius;

		return area;
	}

	public static double calEllipseArea(double radius){

		return calcEllipseArea(radius);
	}

	public static double calEllipseArea(double longDiameter, double shortDiameter){

		return calcEllipseArea(longDiameter, shortDiameter);
	}

}
