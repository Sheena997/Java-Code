/*
 *两个类比较大小
 *用Comparable<T>接口，类型参数T通常设为实现该接口的类名。
 *还需覆盖compareTo方法。
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ce implements Comparable<ce>{

	public int x;
	public int y;
	public ce(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int compareTo(ce point)
	{
		int s1 = x * x + y * y;
		int s2 = point.x * point.x + point.y * point.y;
		return s1 - s2;
	}
	public String toString()
	{
		return "[" + x + "," + y + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(new ce(3, 4).compareTo(new ce(1, 1)) > 0)
				System.out.println("true");
		
		List<ce> points = new ArrayList<ce>();
		points.add(new ce(1, 6));
		points.add(new ce(3, 4));
		points.add(new ce(5, 2));
		System.out.println(points);
		Collections.sort(points);
		System.out.print(points);
		
	}
}
