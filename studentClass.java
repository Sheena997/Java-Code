/*
 * 编写一个Student类：该类拥有属性：校名，
 * 学号，性别，出生日期。方法包涵设置姓名
 * 和成绩（setName（），setScore（））。
 * 再编写Student类的子类，Undergraduate
 * （大学生）。Undergraduate类除了拥有父
 * 类属性和方法外，还有其他自己的属性和方法
 * ：附加属性包括系（department）,专业(major)
 * ；方法包涵设置系别和专业。（setDepartment(),
 * setMajor()）
 */
public class Student {

	String sch_name;
	String stu_id;
	char stu_sex;
	String stu_birth;
	String stu_name;
	int stu_score;
	
	public void setName()
	{
		System.out.println("姓名为：" + this.stu_name);
	}
	public void setScore()
	{
		System.out.println("分数为：" + this.stu_score);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate un = new Undergraduate();
		un.stu_name = "sheena";
		un.sch_name = "ufe";
		un.stu_id = "1705990503";
		un.stu_sex = '女';
		un.stu_birth = "1999-01-01";
		un.stu_score = 99;
		un.under_depart = "信院";
		un.under_major = "计算机";
		
		un.setName();
		System.out.println("校名：" + un.sch_name);
		System.out.println("学号：" + un.stu_id);
		System.out.println("性别：" + un.stu_sex);
		System.out.println("生日：" + un.stu_birth);
		un.setScore();
		un.setDepartment();
		un.setMajor();
	}

}
class Undergraduate extends Student
{	
	String under_depart;
	String under_major;
	 
	public void setDepartment()
	{
		System.out.println("系别为：" + this.under_depart);
	}
	public void setMajor()
	{
		System.out.println("专业为：" + this.under_major);
	}
}