import java.util.Scanner;
class Pattern1{
	public static void main(String args[]){  
		int n;    
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no : ");
		n=sc.nextInt();
		System.out.println("1 ");
		for (int i =1;i<n;i++){
			System.out.print(i+" ");
				for(int j=1;j<=i-1;j++){
					System.out.print("0 ");
				}
			System.out.println(i+" ");
		}
	}
}