import java.util.Scanner;
class Days {
	public static void main (String[] args) {
		int r,c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. : ");
		c= scan.nextInt();
		String day= null;
		switch (c)
		{
			case 0:
			{
				day="Sunday";
				break;
			}
			case 1:
			{
				day="Monday";
				break;
			}
			case 2:
			{
				day="Tuesday";
				break;
			}
			case 3:
			{
				day="Wednesday";
				break;
			}
			case 4:
			{
				day="Thursday";
				break;
			}
			case 5:
			{
				day="Friday";
				break;
			}
			case 6:
			{
				day="Saturday";
				break;
			}
			default :
			{
				System.out.println("Invalid Input");
			}
		}
		System.out.print("            "+day);
	}
}
