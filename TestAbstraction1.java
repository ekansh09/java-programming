abstract class Shape{
	abstract void draw();
}
class TestAbstraction1{
	public static void main(String agrs[]){
		Shape shape = new Shape(){
			@Override
			public void draw(){
				System.out.println("Hawai jahaj");
			}
		};
		shape.draw();
	}
}