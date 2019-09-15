import java.util.Scanner;
import java.math.*;
class Switch {
	public static void main (String[] args) {
		int i,j,x=1,y=1,e,f,h,g,o,k,l;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n= scan.nextInt();
		String[] c = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
		String[] b = {"Hundred","Thousand","Lakh","Crore"};
		String[] a = {"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
		e=n;
		o=n;
		while(e/10>0){
			x++;
			e=e/10;
		}
				System.out.println(x);

		for(i=0;x>2;i++){			
			f= (int)Math.pow(10,x);
			g=n%f;
			h=g;
			while(h/10>0){
				y++;
				h=h/10;
			}
			System.out.print(c[h-1]+" ");
		
			System.out.print(b[y-3]+" ");
			y=1;
			x--;
		}
		o=o%100;
		k=o/10;
		l=o%10;
		if(o>=20){
			System.out.print(a[k-2]+" ");
			System.out.print(c[l-1]+" ");
		}
		else{
			System.out.print(c[o-1]);
		}
	}
}
			