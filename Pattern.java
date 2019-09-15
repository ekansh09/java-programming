import java.util.Scanner;
class Pattern{
	public static void main(String args[]){  
		int n;    
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no : ");
		n=sc.nextInt();
		for (int i =0;i<n;i++){
			if(i%2==0){
				for(int j=0;j<=i;j++){
					System.out.print("1 ");
				}
			}
			else{
				System.out.print("1 ");
				for(int j=0;j<=i-2;j++){
					System.out.print("0 ");
				}
				System.out.print("1 ");
			}
			System.out.print("\n");
		}
	}
}