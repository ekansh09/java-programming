import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){  
		int n,a=0,b=1,c;    
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no : ");
		n=sc.nextInt();
		for (int j=0;j<=n;j++){
			for (int i=0;i<j;i++){
				System.out.print(a+ " ");
				c=a+b;
				a=b;
				b=c;
			}
			System.out.print("\n");
		}
	}
}
		