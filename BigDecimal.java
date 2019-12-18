/*
 * BigDecimal类的加减乘除。
 */

import java.math.BigDecimal;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		
		System.out.println("add：" + bd1.add(bd2));
		System.out.println("substract：" + bd1.add(bd2));
		System.out.println("multiply：" + bd1.multiply(bd2));
		System.out.println("divide：" + bd1.divide(bd2));		
	}
}
