import java.util.*;
class Map2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Map<Integer,String> my= new HashMap<>();
		my.put(1,"Aman");
		my.put(2,"Ashish");
		my.put(3,"Basanti");
		my.put(4,"Chandan");
		my.put(5,"Ekansh");
		System.out.println(my);
		System.out.print("Enter name to found : ");
		String st= s.next();
		System.out.println("\n"+my.containsValue(st));
	}
}