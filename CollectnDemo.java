import java.util.*;
class Student implements Comparable<Student>{
	int roll;
	String name;
	Student(int roll, String name){
		this.roll=roll;
		this.name=name;
	}
	public int compareTo(Student s){
		System.out.println("comparing "+name+" and "+s.name);
		if(roll>s.roll){
			return 1;
		}
		else if(roll==s.roll){
			return 0;
		}
		else {
			return -1;
		}
	}
	public String toString(){
		return(roll +"  "+name);
	}
	
	
}
class CollectnDemo {
	public static void main(String[] args){
		System.out.println();
		Student s1= new Student(1,"Ram");
		Student s2= new Student(6,"Shyam");
		Student s3= new Student(3,"Sita");
		Student s4= new Student(5,"Gita");

	ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Collections.sort(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		/*for(Student s : list){
			System.out.println(s.name+", "+s.roll);
		}*/
	}
}