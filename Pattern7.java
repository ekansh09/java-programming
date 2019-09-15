import java.util.Scanner;
class Pattern7{
	public static void main(String args[]){  
		int n,s;    
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no : ");
		n=sc.nextInt();
		int p=1;
		for(int i=1;i<=n;i++) 
		{	
			s=p;
			for(int j=1;j<=i;j++) 
			{
				System.out.print(s+"\t"); 
				s--;
			}
			System.out.println();
			p=2*i+1;
		}
	}
}