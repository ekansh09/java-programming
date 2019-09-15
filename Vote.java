import java.util.*;
class Vote{
	public static void Validate(int x){
			if(x>=18){
				System.out.println("Candidate can vote");
			}
			else{
				System.out.println("Candidate can't vote");
			}
	}
	public static void main(String [] args)
	{
		int x,y;
		System.out.println("Enter age : ");
		Scanner s= new Scanner(System.in);
		x=s.nextInt();
		Validate(x);
	}
}/*
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
*/