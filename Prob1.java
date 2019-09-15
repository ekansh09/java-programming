import java.util.Scanner;
class Prob1 {
	public static void main (String[] args) {
		int i,n,j,a=1,x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		n= scan.nextInt();
		//x= Integer.MAX_VALUE;
		//if(n==0){
		//	System.out.println("Min value is : "+n);
		//}
		//else{
		while(n!=0)
			{
				System.out.println("Enter a number");
				n= scan.nextInt();
				/*if (n<x){
					x=n;
				}*/
				if ( n==0)
					{
						break;
					}
			}
			//System.out.println("Min value is : "+x);
		}
	}
}