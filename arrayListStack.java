/*
 *使用ArrayList实现泛型类，实现一个栈结构
 *队列：先进先出 
 */

import java.util.ArrayList;

class MyStack<T>
{
	private ArrayList<T> s = new ArrayList<T>();
	
	public boolean push(T e)
	{
		return s.add(e);
	}
	public T pop()
	{
		if(s.size() > 0)
			return s.remove(s.size() - 1);
		else
			return null;
	}
	public int size()
	{
		return s.size();
	}
}
public class ce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<String> ms = new MyStack<String>();
		
		ms.push("AS");
		ms.push("dd");
		ms.push("Jack");
		
		String element;
		while((element = ms.pop()) != null)
			System.out.println(element);
	}
	
}

