package demo;

public class starnumberpattern {

	public static void main(String[] args) 
	{
		int a=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==1)
				{
					System.out.print(a);
					a++;
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
             
	}

}
