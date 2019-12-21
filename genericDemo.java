/*
 * 泛型使用实例1
 */
class Box<T>
{
	private T data;
	public Box()
	{}
	public Box(T data)
	{
		setData(data);
	}
	public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
}
public class ce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> name = new Box<String>("hello");
		Box<Integer> age = new Box<Integer>(12);
		Box<Double> num = new Box<Double>(12.50);
		getData(name);
		getData(age);
		getData(num);
	}

	public static void getData(Box<?> data)
	{
		System.out.println("data : " + data.getData());
	}
}

/*
 * 泛型使用实例2
 */

class NewPoint<T1, T2>
{
	T1 x;
	T2 y;
	public T1 getX()
	{
		return x;
	}
	public void setX(T1 x)
	{
		this.x = x;
	}
	
	public T2 getY()
	{
		return y;
	}
	public void setY(T2 y)
	{
		this.y = y;
	}
	public <T1, T2> void printPoint(T1 x, T2 y)
	{
		T1 m = x;
		T2 n = y;
		System.out.println("x: " + m + "\n" + "y: " + n);
	}
}
public class ce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewPoint<Integer, Double> p1 = new NewPoint<Integer,Double>();
		p1.setX(10);
		p1.setY(20.05);
		p1.printPoint(p1.getX(), p1.getY());
	}
	
}


