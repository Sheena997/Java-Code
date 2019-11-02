/*
 明明想在学校中请一些同学一起做一项问卷调查，
 为了实验的客观性，他先用计算机生成了N个1到
 1000之间的随机整数（N≤100），对于其中重复
 的数字，只保留一个，把其余相同的数去掉，不
 同的数对应着不同的学生的学号。然后再把这些
 数从小到大排序，按照排好的顺序去找同学做调
 查。请你协助明明完成“去重”与“排序”的工作.
 */
import java.util.Scanner;
public class random_number{

	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int[] target = new int[1000];
		while (scan.hasNextInt())
		{

			for (int i = 0; i < 1000; i++) 
			{
				target[i] = 0;
			}
			int num = scan.nextInt();
			for (int i = 0; i < num; i++) 
			{
				int next = scan.nextInt();
				target[next] = next;
			}

			for (int i = 0; i < 1000; i++) 
			{
				if(target[i] != 0)
				{
					System.out.println(target[i]);
				}
			}
		}
	}
}
