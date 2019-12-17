/*
 *给定一个整数-1234567，输出它的二进制、八进制和十六进制的表示形式。
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			conversionOfNum(n);
		}
	}
	public static void conversionOfNum(int n)
	{
		System.out.println("二进制为：" + Integer.toBinaryString(n));
		System.out.println("八进制为：" + Integer.toOctalString(n));
		System.out.println("十六进制为：" + Integer.toHexString(n));
	}

}
