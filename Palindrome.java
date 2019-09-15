import java.util.Scanner;
class Palindrome{  
	public static void main(String args[]){  
		int n,r,s=0,t;    
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no : ");
		n=sc.nextInt();
		t=n;    
		while(n>0){    
			r=n%10;  //getting remainder  
			s=(s*10)+r;    
			n=n/10;    
		}    
		if(t==s)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    
	} 
}	