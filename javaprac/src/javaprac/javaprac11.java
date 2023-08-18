package javaprac;
import java.util.Scanner;
public class javaprac11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int range, numIn, SumAvg = 0;
		String name;
		
		System.out.print("Enter your name: ");
		name = read.nextLine();
		
		System.out.print("Enter the number of your subjects: ");
		range = read.nextInt();
		
		int[] Grade = new int[range];
		
		for (int x = 0; x <= Grade.length-1; x++) {
			if (x == 1-1) {
				System.out.print("Enter your 1st Grade: " );
				numIn = read.nextInt();
				Grade[x] = numIn;
			} else if (x == 2-1) {
				System.out.print("Enter your 2nd Grade: " );
				numIn = read.nextInt();
				Grade[x] = numIn;
			} else if (x == 3-1) {
				System.out.print("Enter your 3rd Grade: " );
				numIn = read.nextInt();
				Grade[x] = numIn;
			} else {
				System.out.print("Enter your " + (x+1) + "th Grade: " );
				numIn = read.nextInt();
				Grade[x] = numIn;
			}
		}
		
		System.out.print("You have entered the following grades: ");
		for (int x = 0; x <= Grade.length - 1; x++) {
			
			if (x == Grade.length - 1) {
				System.out.print(Grade[x]);
			} else {
				System.out.print(Grade[x] + ". ");
			}
		}
		
		System.out.println();
		System.out.print("The average of your grade is: ");
		
		for (int x = 0; x <= Grade.length - 1; x++) {
			SumAvg += Grade[x];
		}
		
		System.out.print(String.format("%.2f", ((double)SumAvg / (double)Grade.length)));
		
	}

}
