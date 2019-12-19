/*
 *产生一个List集合，实现为ArrayList
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("KH");
		list.add("jbkj");
		list.add("djkh");
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
