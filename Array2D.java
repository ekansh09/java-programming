import java.util.Scanner;
class Array2D {
	public static void main (String[] args) {
		int r,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("No. of rows :");
		r= scan.nextInt();
		System.out.println("No. of columns :");
		c= scan.nextInt();
		int a[][]= new int[r][c];
		System.out.println("Enter values :");
		for (int i =0;i<r;i++)
		{
			for (int j =0;j<c;j++){
			a[i][j]= scan.nextInt();
			}
			System.out.print("\n");
		}
		System.out.println("Array is :");
		for (int i =0;i<r;i++)
		{
			for (int j =0;j<c;j++){
			System.out.print(" "+a[i][j]);
			}
			System.out.print("\n");
		}
	}
}