/*
 ��������ѧУ����һЩͬѧһ����һ���ʾ���飬
 Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��
 1000֮������������N��100�������������ظ�
 �����֣�ֻ����һ������������ͬ����ȥ������
 ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ
 ����С�������򣬰����źõ�˳��ȥ��ͬѧ����
 �顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ���.
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
