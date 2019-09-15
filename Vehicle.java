class Vehicle{
	int not;
	float speed;
	String type;
	float weight;
	void Speedometer(int sp){
		this.speed=sp;
		System.out.println("vechile type;"+type);
		}
}
class Car extends Vehicle{
	String brand;
    String model;
	float speed;
	void Speedometer(int sp){
		this.speed=sp;
		System.out.println("car speed"+speed);
	}	
}
class Jcb extends Vehicle{
	String brand;
	String model;
	float speed;
	void Speedometer(int sp){
		this.speed=sp;
		System .out.println("Jcb speed"+speed);
	}
}
class MainMethod{
	public static void main (String[] args){
		Car car=new Car();
		Jcb Jcb=new Jcb();
		car.Speedometer(10);
		Jcb.Speedometer(20);
    }
}