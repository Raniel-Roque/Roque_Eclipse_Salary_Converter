package finalActivities;
import java.util.Scanner;
public class Prog3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, revnum = 0;
		
		System.out.print("Enter a number: ");
		num = read.nextInt();
		
		while (num != 0) {
			revnum *= 10;
			revnum += (num%10);
			num /= 10;
					
		} 
		
		System.out.println(revnum);
		
	}

}
