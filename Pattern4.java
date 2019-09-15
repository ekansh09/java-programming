import java.util.Scanner;
class Pattern4 {
	public static void main (String[] args) {
		int i,n,j,k;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		n= scan.nextInt();
		for(i=1;i<=n;i++){
			for(j=n;j>=i;j--){
				System.out.print(" ");
			}
			for(k=1;k<=i;k++){
				System.out.print("*");
			}
			for(k=1;k<=i-1;k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
