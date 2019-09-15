class Class {
	public static void main (String[] args) {
		Student s1 = new Student();
		s1.roll = 10;
		System.out.println(s1.roll);
		s1.study();
	}
}
class Student {
		String name;
		int roll;
		public void study(){
		System.out.print("Farsi");
		}
}
	
