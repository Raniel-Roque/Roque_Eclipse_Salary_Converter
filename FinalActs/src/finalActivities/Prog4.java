package finalActivities;
import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, digit = 0, sum = 0;
		String Snum;
		
		System.out.print("Enter a number: ");
		num = read.nextInt();
		
		Snum = Integer.toString(num);
		
		for (int x = 0; x <= Snum.length() - 1; x++) {
			System.out.print(Snum.charAt(x) + " ");
		}
		
		System.out.println();
		
		while (num != 0) {
			digit = num%10;
			sum += digit;
			num /= 10;
					
		} 
		
		System.out.println("Sum: " + sum);
		
		
		
	}

}