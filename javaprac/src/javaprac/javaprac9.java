package javaprac;
import java.util.Scanner;
public class javaprac9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int x, y, ConAns, ans;
		
		System.out.print("Enter your x: ");
		x = read.nextInt();
		
		System.out.print("Enter your y: ");
		y = read.nextInt();
		
		System.out.print("Enter your ans: ");
		ConAns = read.nextInt();
		
		ans = (3*(x)) + (y);
		
		if (ans == ConAns) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		
		
	}

}
