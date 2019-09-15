class Example{
	int a=0,b;
	static int c=0;
	public static void vehicle()
	{
		c++;
		System.out.println("vehicle"+c);
	}
	public void things(int y)
	{
    	b=y;
		c++;
 		System.out.println(b+"things"+c);
	}
	public void Animals(int z)
	{
		b=z;
		c++;
		System.out.println(b+"things"+c);
	}
	public void show()
	{
		System.out.println(b+","+c+",");
	}		
}
class Object{
	public static void main(String [] args)
	{
		Example e1= new Example(); 
		Example.vehicle();
		Example.c;
		e1.things(20);
		e1.show();
		Example e2= new Example(); 
		e2.Animals(50);
		e2.show();
	}
}

		