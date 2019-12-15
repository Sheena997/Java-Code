/*
1003: 第k小整数
Description
现有n个正整数，n≤10000，要求出这n个正整数中的第k个最小整数（相同大小的整数只计算一次），k≤1000，正整数均小于30000。
Input
包含多组测试数据，每组测试数据第一行为n和k，第二行开始为n个正整数的值，整数间用空格隔开。
Output
第k个最小整数的值；若无解，则输出“NO RESULT”。
Sample Input  
10 3
1 3 3 7 2 5 1 2 4 6
Sample Output
3
*/
package ppt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < arr.length; ++i)
			{
				arr[i] = sc.nextInt();
			}
			theTopKNum(arr, k);
		}
	}
	public static void theTopKNum(int[] arr, int k)
	{
		Arrays.sort(arr);
		int i = 0, flag = 0;
		if(k > arr.length)
			flag = 1;
		else 
		{		
			for(i = 1; i < k; ++i)
			{
				if(i == arr.length - 1)
			    {
					flag = 1;
					break;
				}
				else if(arr[i] == arr[i + 1])
					k += 1;
			}
		}
		if(flag == 1)
			System.out.println("NO RESULT");
		else
			System.out.println(arr[i]);
	}
	
}
