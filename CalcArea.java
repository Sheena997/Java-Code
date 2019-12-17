interface Area
{
	double getArea();
}
class Rectangle implements Area
{
	public double l;
	public double w;
	
	public Rectangle(double l, double w)
	{
		this.l = l;
		this.w = w;
	}
	public double getArea()
	{
		return l * w;
	}
	
}
class Circle implements Area
{
	public double r;
	
	public Circle(double r)
	{
		this.r = r;
	}
	public double getArea()
	{
		return Math.PI * r * r;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area[] a = {new Circle(1.0), new Rectangle(3.0, 4.0), new Circle(8.0)};
		System.out.println("total area = " + totalArea(a));
		}
	public static double totalArea(Area[] a)
	{
		double sum = 0;
		for(Area e : a)
		{
			sum += e.getArea();
		}
		return sum;
	}

}
