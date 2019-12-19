import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *遍历集合
 */

public class ce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = new ArrayList<String>();
		c.add("Hello");
		c.add("Java");
		c.add("World");
		
		//遍历方法一：迭代器遍历
		Iterator<String> it = c.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		//遍历方法二：范围for
		for(String s : c)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
