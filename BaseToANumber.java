import java.util.Scanner;
class BaseToANumber {
	public static void main (String[] args) {
		int a,n,i=0,j,d;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. : ");
		n= scan.nextInt();
		System.out.print("Enter base : ");
		a= scan.nextInt();
	    String x="",y="";   
		char h[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while (n>0)
		{
			if (a==16){	  
				d=n%16;   
				x=" "+h[d]+x;   
				n=n/16;  
			}
			else{
				d=n%a;
				y=" "+d+y;
				n=n/a;
			}
		}
		System.out.print("Base code :  ");
		System.out.print(x);
		System.out.print(y);
	}
}

		
			
		