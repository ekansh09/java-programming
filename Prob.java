import java.util.Scanner;
class Prob {
	public static void main (String[] args) {
		int i,n,j,a=1,x=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		n= scan.nextInt();
		while(n!=0)
			{
				System.out.println("Enter a number");
				n= scan.nextInt();
				if ( n==0)
					{
						break;
					}
			}
	}
} 