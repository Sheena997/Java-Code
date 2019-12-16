Circle.java
public class Circle implements CalcArea
{
	double r;
	Circle(double r)
	{
		this.r = r;
	}
	public double getArea()
	{
		return Math.PI*r*r;
	}
}

Rectangle.java
public class Rectangle implements CalcArea
{
	double l;
	double w;
	Rectangle(double l, double w)
	{
		this.l = l;
		this.w = w;
	}
	public double getArea()
	{
		return l * w;
	}
}

CalcArea.java
public interface CalcArea
{
	double getArea();
}

Tester.java
public class Tester {
	static CalcArea[] shapes = {new Circle(1.0), new Rectangle(3.0, 4.0), new Circle(8.0)};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("total area = " + sumArea(shapes));
	}
	public static double sumArea(CalcArea[] shapes)
	{
		double sum = 0;
		for(CalcArea c: shapes)
			sum += c.getArea();
		return sum;
	}

}
