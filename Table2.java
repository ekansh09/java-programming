import java.util.Scanner;
class Table2 {
	public static void main (String[] args) {
		int i=1,n,j=1;
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter no. : ");
		//n= scan.nextInt();
		while (j<21)
		{
			while(i<11)
			{
				System.out.println(i*j);
				i++;
			}
			j++;
			i=1;
			System.out.println("\n");
		}
	}
}
