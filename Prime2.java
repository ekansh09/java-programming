import java.util.Scanner;
class Prime2 {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		int i,a,j=0;
		System.out.print("Enter no : ");
		a=s.nextInt();
		for (i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				j++;
			}
		}
		if(j==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}