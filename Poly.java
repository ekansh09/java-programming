class Polymorphism{
	static int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	static int add(int a,int b,int d)
	{
		int c=a+b+d;
		return c;
		
	}
	static int add(int a,int b,int d,int e)
	{
		int c=a+b+d+e;
		return c;
		
	}
	static double add(double a,double b,double d,double e)
	{
		double c=a+b+d+e;
		return c;
		
	}
		static float add(float a,float b)
	{
		float c=a+b;
		return c;
		
	}
	
	public static void main(String[] args){
		int s=add(5,6);
		System.out.println("sum="+s);
		int h=add(2,4,6);
		System.out.println("sum="+h);
		int i=add(6,7,8,9);
		System.out.println("sum"+i);
		double j=add(2,5,9,9);
		System.out.println("sum="+j);
		float k=add(8,8);
		System.out.println("sum"+k);
		float l=add(2.5f,8);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
}