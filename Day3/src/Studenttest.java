import java.util.Scanner;

public class Studenttest
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student []s = new Student[3];
		int i  =0;
		while(i < s.length)
		{
			s[i] = new Student();
			System.out.println("Please input name, surname,score");
			s[i].name= sc.nextLine();//read until see enter
			s[i].surname= sc.nextLine();
			s[i].score = sc.nextInt();//we only have number not also next enter
			sc.nextLine();
			i++;
		}
		Student max;
		max= s[0];
		i = 0;
		while(i< s.length)
		{
			if(max.score < s[i].score)
			{

				max = s[i];
			}
			i++;
		}
		System.out.println(max.name+" "+max.surname);
	}

}
