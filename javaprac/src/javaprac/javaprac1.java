package javaprac;
import java.util.Scanner;
public class javaprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		int Age;
		String Name, Gender;

		System.out.print("Enter your name: ");
		Name = read.nextLine();
		
		System.out.print("Enter your Gender: ");
		Gender = read.nextLine();
		
		System.out.print("Enter your Age: ");
		Age = read.nextInt();
		
		
		
		System.out.println("Your name is " + Name + ", you are " + Age + ", " + Gender);
	}

}
