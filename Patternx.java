import java.util.Scanner;
class Patternx{
	public static void main(String [] args){	
		int x,y,i, j, rows;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no : ");
		rows=sc.nextInt();
		x=rows/2 +1;
		y=x-1;
		for(i=1; i<=x; ++i)
		{
			for(j=1; j<=i; ++j)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		for(i=1; i<=y; i++)
		{
			for(j=y; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}