abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	@Override
	void draw(){
		System.out.println("Rectangle");
	}
	void iAmRect(){
		System.out.println("I am Rectangle");
	}
}
class Circle extends Shape{
	@Override
	void draw(){
		System.out.println("Circle");
	}
}

class Override1{
	public static void main(String[] args){
		Shape obj=new Rectangle();
		obj.draw();
		obj=new Circle();
		obj.draw();
		Rectangle rect = new Rectangle();
		rect.draw();
		rect.iAmRect();
	}
}