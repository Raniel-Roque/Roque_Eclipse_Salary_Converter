package finalActivities;
import java.util.Scanner;
public class Activity1 {

	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		
		int year;
		
		System.out.print("Enter your year: ");
		year = read.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is a leap year");
		} else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a Leap year");
		}
		
	}

}
