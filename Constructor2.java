class Human{
	String name;
	int age;
	char gender;
	static int humanCount = 0;
	public Human() {
		this.name= null;
		this.age=0;
		humanCount++;
	}
	public Human(String name,int age,char gender)
	{
		this.name= name;
		this.age= age;
		this.gender= gender;
		humanCount++;
	}
	public Human(Human h)
	{
		this.name = h.name;
		this.age = h.age;
		this.gender = h.gender;
		humanCount++;
	}
	public void showdata()
	{
		System.out.println(humanCount+", name "+name+", age"+age+" , gender"+gender);
	}
}
class Constructor2{
	public static void main(String [] args)
	{
		Human h1 = new Human();
		h1.name="EKASNH";
		h1.age=20;
		h1.gender= 'M';
		h1.showdata();
		Human h2= new Human ("manpreet",20,'M');
		h2.showdata();
		Human h3= new Human(h2);
		h3.showdata();
	}
}
