/*
 *将整数转换成字符串。
 *将字符串转换成整数。
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		
		//将整数转换成字符串
		//方法一：String str = num + " "
		String str = num + " ";
		System.out.println(str);
		//方法二：String s2 = String.valueOf(num);
		String str2 = String.valueOf(num);
		System.out.println(str2);
		//方法三；Integer i = new Integer(num); String s3 = i.toString();
		Integer i = new Integer(num);
		String str3 = i.toString();
		System.out.println(str3);
		//方法四：String str4 = Integer.toString(num)
		String str4 = Integer.toString(num);
		
		
		String str5 = "1000";
		//将字符串转换成整数
		//方法一：int y = Integer.parseInt(str5);
		int m = Integer.parseInt(str5);
		System.out.println(m);
		//方法二：Integer li = new Integer(s); int x = li.intValue();
		Integer ii = new Integer(str5);
		int q = ii.intValue();
		System.out.println(q);
	}

}
