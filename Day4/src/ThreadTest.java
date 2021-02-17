
public class ThreadTest
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				while (true)
				{
					try
					{
						Thread.sleep(150);
					} catch (Exception e)
					{
					}
					System.out.println("x");
				}
			}

		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				while (true)
				{
					try
					{
						Thread.sleep(100);
					} catch (Exception e)
					{
					}
					System.out.println("y");
				}
			}

		});
		t2.start();
	}//close main
}//close class
