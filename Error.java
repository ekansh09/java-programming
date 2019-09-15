import java.util.*;
class Error{
	public static void main(String [] args)
	{
		int x,y;
		System.out.println("Enter no.");
		Scanner s= new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		try{
			int z=x/y;
		}
		
		catch(InputMismatchException i){
			System.out.println("no. mismatched");
		}
		catch(Exception e){
			System.out.println("Dividend is zero");
		}
		finally{
			System.out.println("ff");
		}
		System.out.println("Divide -_-");
	}
}
