/*
 *给你一个字符串，将其中的大写转为小写，小写转为大写。 
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(sc.hasNext())
		{
			str = sc.next();
			System.out.println("转换后为：" + turnToUpLower(str));
		}
	}
	public static String turnToUpLower(String str)
	{
		String s1 = str.toLowerCase();
		String s2 = str.toUpperCase();
		String res = "";
		for(int i = 0; i < str.length(); ++i)
		{
			if(str.substring(i, i + 1).equals(s1.substring(i, i + 1)))
				res += s2.substring(i, i + 1);
			if(str.substring(i, i + 1).equals(s2.substring(i, i + 1)))
				res += s1.substring(i, i + 1);
		}
		
		return res;
	}

}
