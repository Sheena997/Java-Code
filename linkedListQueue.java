/*
 *使用LinkedList实现泛型类，自定义队列
 *队列：先进先出 
 */
import java.util.LinkedList;


class MyQueue<T>
{
	private LinkedList<T> l = new LinkedList<T>();
	
	public boolean add(T e)
	{
		return l.add(e);
	}
	public T remove()
	{
		if(l.size() > 0)
			return l.remove();
		else
			return null;
	}
	
}
public class ce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<String> mq = new MyQueue<String>();
		
		mq.add("AS");
		mq.add("dd");
		mq.add("Jack");
		
		String element;
		while((element = mq.remove()) != null)
			System.out.println(element);
	}
	
}

