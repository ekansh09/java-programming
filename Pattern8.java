import java.util.Scanner;
class Pattern8{
	public static void main(String args[]){  
		int n,x,p=1,s;    
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no : ");
		n=sc.nextInt();
		int v=1;
		for(int i=1;i<=n;i++) 
		{	
			for(int k=n-1;k>=i;k--){
				System.out.print("\t");
			}
			x=v;
			for(int j=1;j<=i;j++) 
			{
				System.out.print(x+"\t"); 
				x++;
			}
			v++;
			s=p;
			for(int j=1;j<i;j++) 
			{
				System.out.print(s+"\t"); 
				s--;
			}
			System.out.println();
			p=2*i;
		}
	}
}