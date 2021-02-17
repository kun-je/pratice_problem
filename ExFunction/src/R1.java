import java.util.Scanner;

public class R1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		String [] name = new String[10];
		String [] surname = new String[10];
		int i = 0;
		while(i < score.length)
		{
			System.out.println("Please input name, surname,score");
			name[i]= sc.nextLine();//read until see enter
			surname[i]= sc.nextLine();
			score[i] = sc.nextInt();//we only have number not also next enter
			sc.nextLine();
			i++;
		}
		int max_index = 0;
		int max= score[0];
		i =0;
		while(i< score.length)
		{
			if(max< score[i])
			{
				max_index = i;
				max = score[i];
			}
			i++;
		}
		System.out.println(name[max_index]+" "+surname[max_index]);
	}

}
