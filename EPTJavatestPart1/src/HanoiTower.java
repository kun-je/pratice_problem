
public class HanoiTower
{
	public static void print(int [][]tower)
	{
		for(int i =0; i < tower.length;i ++)
		{
			for(int j = 0; j < tower[i].length ; j++)
			{
				for(int k = 0;k < tower.length -tower[i][j];k++)
				{
					System.out.print(" ");
				}
				for(int k = 0;k < tower[i][j];k++)
				{
					System.out.print("X");
				}
				System.out.print("|");
				for(int k = 0;k < tower[i][j];k++)
				{
					System.out.print("X");
				}
				for(int k = 0;k < tower.length -tower[i][j];k++)
				{
					System.out.print(" ");
				} 
				System.out.print("  ");

			}
			System.out.println();

		}
		System.out.println();

	}

	public static void hanoiSolver(int [][] tower, int form, int to , int n)
	{
		if(n ==0)return;
		if(n==1)
		{
			int top_1 = 0;
			while(top_1 < tower.length  && tower[top_1][form] == 0)
			{
				top_1 ++;
			}
			int top_2 = 0;
			while(top_2 < tower.length && tower[top_2][to] == 0)
			{
				top_2 ++;
			}
			top_2--;
			tower[top_2][to] = tower[top_1][form];
			tower[top_1][form] = 0;

			print(tower);
			return;
		}
		int another = 3-form -to;
		hanoiSolver(tower,form,another,n-1);
		hanoiSolver(tower,form,to,1);
		hanoiSolver(tower,form,to,n-1);

	}
	public static void main(String[] args)
	{
		int [][] tower = new int[5][3];
		for(int k = 0; k < tower.length;k++)
		{
			tower[k][0] = k+1;
		}
		print(tower);
		hanoiSolver(tower,0,2,tower.length);
	}

}
