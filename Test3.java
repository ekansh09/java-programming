public class Test3 {
	Test3(int a, int b) {
		System.out.println("HIii");
		System.out.println("a = "+a+" b = "+b);
	}
	Test3(int a, float b) {
		System.out.println("Hello");
		System.out.println("a = "+a+" b = "+b);
	}
	public static void main (String args[]) {
		byte a = 10;
		byte b = 15;
		Test3 test = new Test3(a,b);
	}
}