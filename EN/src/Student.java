
public class Student
{
	public int password;
	public int score;
	public String name, surname, grade;
	
	public Student() {}
	
	public Student(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
	}

	public Student(int password,int score, String name, String surname)
	{
		this.password = password;
		this.score = score;
		this.name = name;
		this.surname = surname;
	}
	
	public String gradeCal(int s)
	{
		if(s >= 80)
		{
			 grade ="A";
		}
		else if(s >=70)
		{
			grade ="B";

		}
		else if(s >= 60)
		{
			grade ="C";

		}
		else if(s >= 50)
		{
			grade ="D";

		}
		else
		{
			grade ="F";

		}
		return grade;
	}
	
	public String toString()
	{
		return " password :" + password +"\n name:" + name +"\n surname : " +surname +"\n score : " + score +"\n grade :" + grade;
	}

}
