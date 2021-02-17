import java.util.Scanner;



public class mainStudent
{
	Student[] stu;

	public mainStudent()
	{
		stu = new Student[3];
		for (int i = 0; i < stu.length; i++)
		{
			stu[i] = new Student();
			Scanner input = new Scanner(System.in);
			stu[i].score = input.nextInt();
			String p = input.nextLine();
			stu[i].name = input.nextLine();
			stu[i].surname = input.nextLine();
		}

	}
	
	public String leastScore()
	{
		int minIndex = 0;
		for(int i = 0; i < stu.length;i++)
		{
			if(stu[minIndex].score > stu[i].score)
			{
				minIndex = i;
			}
		}
		return stu[minIndex].name;

	}
	
	public String mostScore()
	{
		int maxIndex =0;
		for(int i = 0; i < stu.length;i++)
		{
			if(stu[maxIndex].score < stu[i].score)
			{
				maxIndex = i;
			}
		}
		return stu[maxIndex].name;
	}
	
	public void belowAvg()
	{
		double avg = 0;
		for(int i =0 ; i < stu.length; i++)
		{
			avg += stu[i].score ;
		}
		avg /= stu.length;
		
		for(int i =0 ; i< stu.length;i++)
		{
			if(stu[i].score < avg)
			{
				System.out.println(stu[i].name);
;			}
		}
	}

	public static void main(String[] args)
	{
		mainStudent people = new mainStudent();
		System.out.println(people.mostScore());
		System.out.println(people.leastScore());
		people.belowAvg();
	}

}
