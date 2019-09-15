import java.util.Scanner;
class Prime {
	/*public static void isPrimeNumber(int a)
	{
		int i,n,j=0;
		for (i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				j++;
			}
		}
		if(j==2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	*/
	public static boolean isPrime(int num)
	{
		if(num<2){
			return false;
		}
		for(int i=2;i<num/i;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void findPrimes(int limit){
		double startTime= System.nanoTime();
		int pc=0;

		for(int i=1;i<limit;i++){

			if(isPrime(i)){

				pc++;

				System.out.println(i);

			}

		}
		double endTime= System.nanoTime();
		System.out.println("total prime numbers between 1 and "+limit+" = "+pc);
		double diff= endTime-startTime;
		System.out.println("time taken : "+(diff/1000000000)+" seconds");
	}
	public static void main (String[] args) {
		int limit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. : ");
		limit= scan.nextInt();
		//isPrimeNumber(n);
		//PrimeNumber();
		findPrimes(limit);
	} 
}

			
				
				