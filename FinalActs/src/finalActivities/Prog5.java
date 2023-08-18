package finalActivities;
import java.util.Scanner;
public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String Name;
		
		System.out.print("Enter String: ");
		Name = read.nextLine();
		
		for (int x = Name.length() - 1; x >= 0; x--) {
			System.out.print(Name.charAt(x));
		}
	}

}
