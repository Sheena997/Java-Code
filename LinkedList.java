/*
 * LinkedList中常用的方法
 * boolean add(E e):在链表后添加一个元素成功返回true失败返回false
 * void addFirst(E e):在链表头部插入一个新元素
 * void addLast(E e):在链表尾部插入一个新元素。
 * void add(int index, E e):在指定位置插入指定元素。
 * 
 * E get(int index):获取下标元素。
 * E getFirst():获取第一个元素。
 * E getLast():获取最后一个元素。
 */
import java.util.LinkedList;

public class ce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkList = new LinkedList<String>();
		
		linkList.add("hello");
		linkList.addFirst("world");
		linkList.addLast("java");
		System.out.println(linkList);
		
		System.out.println();
		
		System.out.println(linkList.get(1));
		System.out.println(linkList.getFirst());
		System.out.println(linkList.getLast());
		
	}
}
