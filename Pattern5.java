import java.util.Scanner;
class Pattern5 {
	public static void main (String[] args) {
		int i,n,j,k;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		n= scan.nextInt();
		for(i=1;i<=n;i++){
			for(j=2*n;j>=i;j--){
				System.out.print(" ");
			}
			System.out.print("*");
			for(k=1;k<2*i-1;k++){
				System.out.print(" ");
			}
				System.out.print("*");
			System.out.print("\n");
		}
		for(i=1;i<=n;i++){
			for(j=n;j>=i;j--){
				System.out.print(" ");
			}
			System.out.print("*");
			for(k=1;k<2*i-1;k++){
				System.out.print(" ");
			}
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
			