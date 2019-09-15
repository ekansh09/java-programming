import java.util.Scanner;
class Pattern2 {
	public static void main (String[] args) {
		int i,n,j,a=1,x=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		n = scan.nextInt(); 
		for (i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(x+" ");
					x--;
					a++;
				}
				else{
					System.out.print(a+" ");
					a++;
				}
			}
			x=a+i;
			System.out.print("\n");
		}
	}
}