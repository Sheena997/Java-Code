/*
1002: 众数
Description
给出N个1到30000间无序数正整数，其中1≤N≤10000，同一个正整数可能会出现多次，出现次数最多的整数称为众数。求出它的众数及它出现的次数。
Input
包含多组测试数据，每组测试数据包含2行。
第一行是正整数的个数N，第二行开始为N个正整数。
Output
每组测试数据输出有若干行，每行两个数，第1个是众数，第2个是众数出现的次数。
如有多个众数，按照从小到大的顺序输出。
Sample Input  
12
2 4 2 3 2 5 3 7 2 3 4 3
Sample Output
2 4
3 4
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
			int[] arr = new int[n];
			for(int i = 0; i < arr.length; ++i)
			{
				arr[i] = sc.nextInt();
			}
			theMostNum(arr);
		}
	}
	public static void theMostNum(int[] arr)
	{
		Arrays.sort(arr);
		int[] count = new int[30000];
		for(int i = 0; i < arr.length; ++i)
		{
			++count[arr[i]];
		}
		int max = count[0];
		for(int i = 0; i < count.length; ++i)
		{
			if(max < count[i])
				max = count[i];
		}
		
		for(int i = 0; i < count.length; ++i)
		{
			if(count[i] == max)
				System.out.println(i + " " + max);
		}
	}
}
