package javaprac;
import java.util.Scanner;
public class javaprac6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		int year;
		
		System.out.print("Enter A Year: ");
		year = read.nextInt();
		
		if ((year%4) == 0 && !((year%100) == 0)) {
			System.out.println("Leap Year");
		} else if ((year%4) == 0 && (year%100) == 0 && (year%400) == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
			
		
	}

}
