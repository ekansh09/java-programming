import java.util.Scanner;
abstract class Book{
	abstract void display();
}
class Mybook extends Book{
	String title;
	String author;
	int price;
	Mybook(String title,String author,int price)
	{
		this.title=title;
		this.author= author;
		this.price=price;
	}
	@Override
	void display(){
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
	}
}
class Abstract1{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter title : ");
		String t=s.nextLine();
		System.out.println("Enter author : ");
		String r=s.nextLine();
		System.out.println("Enter price : ");
		int n=s.nextInt();
		Book obj1=new Mybook(t,r,n);
		obj1.display();
		s.nextLine();
		System.out.println("Enter title : ");
		String y=s.nextLine();
		System.out.println("Enter author : ");
		String u=s.nextLine();
		System.out.println("Enter price : ");
		int i=s.nextInt();
		Book obj2=new Mybook(y,u,i);
		obj2.display();
	}
}
		
