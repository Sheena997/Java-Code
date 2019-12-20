/*
 * ArrayList中常用的方法
 *addAll方法：将一个list中所有元素拷贝到另一个list中
 *get(int index)方法：获取指定位置上的元素。
 *
 */

import java.util.ArrayList;
import java.util.List;

public class ce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list  = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println(list);
		
		//addAll方法
		List<String> list2 = new ArrayList<String>();
		list2.addAll(list);
		for(String s : list)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		//get(int index)方法
		System.out.println(list.get(2));
		System.out.println();
		
		//
	}
}
