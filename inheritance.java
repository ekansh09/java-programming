class Animal{
	int Aid;
	String name;
	String Type;
	int legs;
	char gender;
	}
	
class Human extends Animal{
	public static void main(String[] args){
		Human h=new Human();
		h.Aid=1;
		h.name="Dog";
		h.Type="mammal";
		h.legs=4;
		h.gender='m';
		System.out.println("Aid:"+h.Aid+" name:"+h.name+" type:"+ h.Type+" Gender:"+h.gender);
	}
		
		
}
5
	

	

	