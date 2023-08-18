package finalActivities;
import java.util.Scanner;
public class Prog0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		char letter;
		
		System.out.print("Enter a letter: ");
		letter = read.next().charAt(0);
		
		switch (letter) {
		case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
			System.out.println(letter + " is a vowel");
			break;
		default:
			System.out.println(letter + " is a consonant");
		}
		
	}

}
