import java.util.Scanner;
/*
 * 统计一个字符串中大写字母小写字母和数字出现的个数。
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String str = sc.next();
			theCount(str);
		}
	}
	
	public static void theCount(String str)
	{
		int d = 0, a = 0, b = 0;
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; ++i)
		{
			if(Character.isDigit(ch[i]))
				++d;
			else if(Character.isUpperCase(ch[i]))
				++b;
			else if(Character.isLowerCase(ch[i]))
				++a;
		}
		System.out.println("其中大写字母个数为：" + b);
		System.out.println("其中小写字母个数为：" + a);
		System.out.println("其中数字字符个数为：" + d);
	}
}
