package finalActivities;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String Name;
		int counter = 1;
		
		System.out.print("Enter group of words: ");
		Name = read.nextLine();
		
		for (int x = 0; x <= Name.length() - 1; x++) {
			if (Name.charAt(x) == ' ') {
				counter++;
			} 
		
		}
		System.out.println("Word Count: " + counter);
	}

}
